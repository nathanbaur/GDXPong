package com.baur.gdxpong;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.Contact;
import com.badlogic.gdx.physics.box2d.ContactImpulse;
import com.badlogic.gdx.physics.box2d.ContactListener;
import com.badlogic.gdx.physics.box2d.Manifold;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.Array;
import com.baur.gdxpong.entities.Ball;
import com.baur.gdxpong.entities.Boundary;
import com.baur.gdxpong.entities.Entity;
import com.baur.gdxpong.entities.Goal;
import com.baur.gdxpong.entities.Paddle;
import com.baur.gdxpong.entities.ScoreDisplay;


public class GameScreen implements Screen{

	public static final float gameWidth = 96;
	public static final float gameHeight = 54;
	public static final float physicsTimeStep = (1.0f/120.0f);
	
	private OrthographicCamera camera;
	protected Rectangle viewport;
	private SpriteBatch batch;
	
	private World world;
	private float physicsTime;
	
	private Array<Entity> entities;
	private Array<Player> players;
	
	private PaddleInput inputProcessor;
	
//	private Box2DDebugRenderer debugRenderer;
	
	public GameScreen(){
		super();
		
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		this.resize((int)w,(int)h);

		camera = new OrthographicCamera(gameWidth, gameHeight);
		batch = new SpriteBatch();
		
		world = new World(new Vector2(0f,0f), false);
		world.setContactListener(new ContactListener(){
			@Override
			public void beginContact(Contact contact) {
				Object entityA = contact.getFixtureA().getUserData();
				Object entityB = contact.getFixtureB().getUserData();
				if(contact.isTouching() && entityA != null && entityB!=null){
					((Entity)entityA).handleCollision(contact);
					((Entity)entityB).handleCollision(contact);
				}
			}
			@Override
			public void endContact(Contact contact) {}
			@Override
			public void preSolve(Contact contact, Manifold oldManifold) {}
			@Override
			public void postSolve(Contact contact, ContactImpulse impulse) {}
		});
		
		physicsTime = 0f;
		
		// ********************************
		// This should be some kind of factory
		// Like a scenario xml parser or something
		// But for now this will do
		// ********************************
		
		inputProcessor = new PaddleInput(this, camera);
		Gdx.input.setInputProcessor(inputProcessor);
		
		entities = new Array<Entity>(false, 9);
		players = new Array<Player>(false, 2);	
		
		Player player1 = new Player(1);
		players.add(player1);
		Player player2 = new Player(2);
		players.add(player2);
		
		ScoreDisplay score1 = new ScoreDisplay(this, new Rectangle(-gameWidth/2+2,gameHeight/2-8,6,6), player1);
		entities.add(score1);
		ScoreDisplay score2 = new ScoreDisplay(this, new Rectangle(gameWidth/2-10,gameHeight/2-8,6,6), player2);
		entities.add(score2);
		
		Goal goal1 = new Goal(this, player1, new Rectangle(gameWidth/2-6,-gameHeight/2,6,gameHeight));
		entities.add(goal1);
		Goal goal2 = new Goal(this, player2, new Rectangle(-gameWidth/2,-gameHeight/2,6,gameHeight));
		entities.add(goal2);
		
		Paddle paddle1 = new Paddle(this, new Rectangle(-gameWidth/2+12,gameHeight/3-12,1,12), new Rectangle(-gameWidth,-gameHeight/2,gameWidth-2,gameHeight));
		inputProcessor.addPaddle(paddle1);
		entities.add(paddle1);
		Paddle paddle2 = new Paddle(this, new Rectangle(gameWidth/2-12,gameHeight/3-12,1,12), new Rectangle(2,-gameHeight/2,gameWidth-2,gameHeight));
		inputProcessor.addPaddle(paddle2);
		entities.add(paddle2);
		
		Boundary topBound = new Boundary(this, new Rectangle(-gameWidth/2-10,gameHeight/2-1,gameWidth+20,2));
		entities.add(topBound);
		Boundary bottomBound = new Boundary(this, new Rectangle(-gameWidth/2-10,-gameHeight/2-1,gameWidth+20,2));
		entities.add(bottomBound);
		
		Ball ball = new Ball(this, new Rectangle(0,0,1,1));
		entities.add(ball);
		
		// ********************************
		// End pretend factory
		// ********************************
		
		
//		debugRenderer = new Box2DDebugRenderer();
	}
	
	public World getWorld(){
		return world;	
	}
	
	public Camera getCamera(){
		return camera;
	}
	
	public void update(float deltaT){
		physicsTime += deltaT;
		
		while(physicsTime>=physicsTimeStep){
			physicsTime -= physicsTimeStep;
			world.step(physicsTimeStep, 8, 3);
		}
		
		camera.update();
		
		for(Entity entity : entities){
			entity.update(deltaT);
		}
	}
	
	@Override
	public void render(float delta) {
		
		float deltaT = Math.min(delta,1.0f/30.0f);
		update(deltaT);
		
		Gdx.gl.glViewport((int)viewport.x, (int)viewport.y, (int)viewport.width, (int)viewport.height);
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);		

		batch.setProjectionMatrix(camera.combined);
		batch.begin();
		
		for(Entity entity : entities){
			entity.render(batch);
		}
		
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
			
		float w = (float)width;
		float h = (float)height;
		
		float aspect = gameWidth/gameHeight;
		float scale = 1f;
		Vector2 crop = new Vector2(0f,0f);
		if(w/h>aspect){
			scale = h/gameHeight;
			crop.x = (w-gameWidth*scale)/2f;
		}else if(w/h<aspect){
			scale = w/gameWidth;
			crop.y = (h-gameHeight*scale)/2f;
		}else{
			scale = w/gameWidth;
		}
		
		viewport = new Rectangle(crop.x, crop.y, gameWidth*scale, gameHeight*scale);
	}

	@Override
	public void show() {
		
	}

	@Override
	public void hide() {
		
	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {
		
	}

	@Override
	public void dispose() {
		for(Entity entity : entities){
			entity.dispose();
		}
	}

}
