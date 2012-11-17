package com.badlogic.gwtref.client;

import java.security.AccessControlException;
import java.util.*;
import com.badlogic.gwtref.client.*;

public class IReflectionCacheGenerated implements com.badlogic.gwtref.client.IReflectionCache {
  Map<String, Type> types = new HashMap<String, Type>();
  public void c0() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("BACKSPACE", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, true, false, true, false, false, true, false, false, "g1", "s0" ), 
  new Field("ENTER_DESKTOP", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, true, false, true, false, false, true, false, false, "g3", "s2" ), 
  new Field("ENTER_ANDROID", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, true, false, true, false, false, true, false, false, "g5", "s4" ), 
  new Field("TAB", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, true, false, true, false, false, true, false, false, "g7", "s6" ), 
  new Field("DELETE", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, true, false, true, false, false, true, false, false, "g9", "s8" ), 
  new Field("BULLET", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, true, false, true, false, false, true, false, false, "g11", "s10" ), 
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, false, false, true, false, false, false, false, false, "g13", "s12" ), 
  new Field("text", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, java.lang.String.class, false, false, true, false, false, false, false, false, "g15", "s14" ), 
  new Field("messageText", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, java.lang.String.class, false, false, true, false, false, false, false, false, "g17", "s16" ), 
  new Field("displayText", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, java.lang.CharSequence.class, false, false, true, false, false, false, false, false, "g19", "s18" ), 
  new Field("cursor", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, int.class, false, false, true, false, false, false, false, false, "g21", "s20" ), 
  new Field("clipboard", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class, false, false, true, false, false, false, false, false, "g23", "s22" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener.class, false, false, true, false, false, false, false, false, "g25", "s24" ), 
  new Field("filter", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.class, false, false, true, false, false, false, false, false, "g27", "s26" ), 
  new Field("keyboard", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class, false, false, true, false, false, false, false, false, "g29", "s28" ), 
  new Field("passwordMode", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, boolean.class, false, false, true, false, false, false, false, false, "g31", "s30" ), 
  new Field("passwordBuffer", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, java.lang.StringBuilder.class, false, false, true, false, false, false, false, false, "g33", "s32" ), 
  new Field("fieldBounds", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g35", "s34" ), 
  new Field("textBounds", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, true, false, true, false, false, false, false, false, "g37", "s36" ), 
  new Field("scissor", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g39", "s38" ), 
  new Field("renderOffset", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, float.class, false, false, true, false, false, false, false, false, "g41", "s40" ), 
  new Field("textOffset", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, float.class, false, false, true, false, false, false, false, false, "g43", "s42" ), 
  new Field("visibleTextStart", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, int.class, false, false, true, false, false, false, false, false, "g45", "s44" ), 
  new Field("visibleTextEnd", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, int.class, false, false, true, false, false, false, false, false, "g47", "s46" ), 
  new Field("glyphAdvances", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.utils.FloatArray.class, true, false, true, false, false, false, false, false, "g49", "s48" ), 
  new Field("glyphPositions", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, com.badlogic.gdx.utils.FloatArray.class, true, false, true, false, false, false, false, false, "g51", "s50" ), 
  new Field("cursorOn", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, boolean.class, false, false, true, false, false, false, false, false, "g53", "s52" ), 
  new Field("blinkTime", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, float.class, false, false, true, false, false, false, false, false, "g55", "s54" ), 
  new Field("lastBlink", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, long.class, false, false, true, false, false, false, false, false, "g57", "s56" ), 
  new Field("hasSelection", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, boolean.class, false, false, true, false, false, false, false, false, "g59", "s58" ), 
  new Field("selectionStart", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, int.class, false, false, true, false, false, false, false, false, "g61", "s60" ), 
  new Field("selectionX", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, float.class, false, false, true, false, false, false, false, false, "g63", "s62" ), 
  new Field("selectionWidth", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, float.class, false, false, true, false, false, false, false, false, "g65", "s64" ), 
  new Field("passwordCharacter", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, char.class, false, false, true, false, false, false, false, false, "g67", "s66" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m68"),
  new Method("setPasswordCharacter", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("passwordCharacter", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m69"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m70"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m71"),
  new Method("calculateOffsets", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m72"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m73"),
  new Method("updateDisplayText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m74"),
  new Method("blink", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m75"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m76"),
  new Method("keyDown", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("keycode", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m77"),
  new Method("copy", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m78"),
  new Method("paste", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m79"),
  new Method("delete", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m80"),
  new Method("keyTyped", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("character", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m81"),
  new Method("next", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("up", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m82"),
  new Method("findNextTextField", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  new Parameter[] {
  new Parameter("actors", java.util.List.class, "Ljava/util/List;"), 
  new Parameter("best", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;"), 
  new Parameter("up", boolean.class, "Z"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m83"),
  new Method("setTextFieldListener", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m84"),
  new Method("setTextFieldFilter", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("filter", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldFilter;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m85"),
  new Method("getMessageText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m86"),
  new Method("setMessageText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("messageText", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m87"),
  new Method("setText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("text", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m88"),
  new Method("getText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m89"),
  new Method("setSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("selectionStart", int.class, "I"), 
  new Parameter("selectionEnd", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m90"),
  new Method("clearSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m91"),
  new Method("setCursorPosition", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("cursorPosition", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m92"),
  new Method("getCursorPosition", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m93"),
  new Method("getOnscreenKeyboard", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m94"),
  new Method("setOnscreenKeyboard", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("keyboard", com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$OnscreenKeyboard;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m95"),
  new Method("setClipboard", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("clipboard", com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/utils/Clipboard;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m96"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m97"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m98"),
  new Method("setPasswordMode", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.class, 
  void.class, 
  new Parameter[] {
  new Parameter("passwordMode", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m99"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField", t);
  
  }
  
  public void c1() {
  Type t = new Type();
  t.name = "java.lang.StringBuffer";
  t.clazz = java.lang.StringBuffer.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.StringBuffer.class);
  tAssignables.add(java.lang.CharSequence.class);
  tAssignables.add(java.lang.Appendable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("impl", java.lang.StringBuffer.class, com.google.gwt.core.client.impl.StringBufferImpl.class, true, false, true, false, false, false, false, false, "g101", "s100" ), 
  new Field("data", java.lang.StringBuffer.class, java.lang.Object.class, true, false, true, false, false, false, false, false, "g103", "s102" ), 
  };
  t.methods = new Method[] {
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m104"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m105"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m106"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m107"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m108"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m109"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m110"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m111"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m112"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", long.class, "J"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m113"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m114"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m115"),
  new Method("append", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("x", java.lang.StringBuffer.class, "Ljava/lang/StringBuffer;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m116"),
  new Method("capacity", 
  java.lang.StringBuffer.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m117"),
  new Method("charAt", 
  java.lang.StringBuffer.class, 
  char.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m118"),
  new Method("delete", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m119"),
  new Method("deleteCharAt", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m120"),
  new Method("ensureCapacity", 
  java.lang.StringBuffer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("ignoredCapacity", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m121"),
  new Method("getChars", 
  java.lang.StringBuffer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("srcStart", int.class, "I"), 
  new Parameter("srcEnd", int.class, "I"), 
  new Parameter("dst", char[].class, "[C"), 
  new Parameter("dstStart", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m122"),
  new Method("indexOf", 
  java.lang.StringBuffer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m123"),
  new Method("indexOf", 
  java.lang.StringBuffer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m124"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m125"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m126"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char[].class, "[C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m127"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char[].class, "[C"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m128"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("chars", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m129"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("chars", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m130"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m131"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m132"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m133"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", long.class, "J"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m134"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m135"),
  new Method("insert", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m136"),
  new Method("lastIndexOf", 
  java.lang.StringBuffer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m137"),
  new Method("lastIndexOf", 
  java.lang.StringBuffer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m138"),
  new Method("length", 
  java.lang.StringBuffer.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m139"),
  new Method("replace", 
  java.lang.StringBuffer.class, 
  java.lang.StringBuffer.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  new Parameter("toInsert", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m140"),
  new Method("setCharAt", 
  java.lang.StringBuffer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m141"),
  new Method("setLength", 
  java.lang.StringBuffer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("newLength", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m142"),
  new Method("subSequence", 
  java.lang.StringBuffer.class, 
  java.lang.CharSequence.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m143"),
  new Method("substring", 
  java.lang.StringBuffer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("begin", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m144"),
  new Method("substring", 
  java.lang.StringBuffer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("begin", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m145"),
  new Method("toString", 
  java.lang.StringBuffer.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m146"),
  new Method("trimToSize", 
  java.lang.StringBuffer.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m147"),
  };
  types.put("java.lang.StringBuffer", t);
  
  }
  
  public void c2() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.ObjectMap";
  t.clazz = com.badlogic.gdx.utils.ObjectMap.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.ObjectMap.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("PRIME1", com.badlogic.gdx.utils.ObjectMap.class, int.class, true, false, true, false, false, true, false, false, "g149", "s148" ), 
  new Field("PRIME2", com.badlogic.gdx.utils.ObjectMap.class, int.class, true, false, true, false, false, true, false, false, "g151", "s150" ), 
  new Field("PRIME3", com.badlogic.gdx.utils.ObjectMap.class, int.class, true, false, true, false, false, true, false, false, "g153", "s152" ), 
  new Field("size", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, false, false, false, true, false, false, false, "g155", "s154" ), 
  new Field("keyTable", com.badlogic.gdx.utils.ObjectMap.class, java.lang.Object[].class, false, true, false, false, false, false, false, false, "g157", "s156" ), 
  new Field("valueTable", com.badlogic.gdx.utils.ObjectMap.class, java.lang.Object[].class, false, true, false, false, false, false, false, false, "g159", "s158" ), 
  new Field("capacity", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, true, false, false, false, false, false, false, "g161", "s160" ), 
  new Field("stashSize", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, true, false, false, false, false, false, false, "g163", "s162" ), 
  new Field("loadFactor", com.badlogic.gdx.utils.ObjectMap.class, float.class, false, false, true, false, false, false, false, false, "g165", "s164" ), 
  new Field("hashShift", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, false, true, false, false, false, false, false, "g167", "s166" ), 
  new Field("mask", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, false, true, false, false, false, false, false, "g169", "s168" ), 
  new Field("threshold", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, false, true, false, false, false, false, false, "g171", "s170" ), 
  new Field("stashCapacity", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, false, true, false, false, false, false, false, "g173", "s172" ), 
  new Field("pushIterations", com.badlogic.gdx.utils.ObjectMap.class, int.class, false, false, true, false, false, false, false, false, "g175", "s174" ), 
  new Field("entries", com.badlogic.gdx.utils.ObjectMap.class, com.badlogic.gdx.utils.ObjectMap.Entries.class, false, false, true, false, false, false, false, false, "g177", "s176" ), 
  new Field("values", com.badlogic.gdx.utils.ObjectMap.class, com.badlogic.gdx.utils.ObjectMap.Values.class, false, false, true, false, false, false, false, false, "g179", "s178" ), 
  new Field("keys", com.badlogic.gdx.utils.ObjectMap.class, com.badlogic.gdx.utils.ObjectMap.Keys.class, false, false, true, false, false, false, false, false, "g181", "s180" ), 
  };
  t.methods = new Method[] {
  new Method("put", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m182"),
  new Method("put_internal", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m183"),
  new Method("putAll", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", com.badlogic.gdx.utils.ObjectMap.class, "Lcom/badlogic/gdx/utils/ObjectMap;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m184"),
  new Method("putResize", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m185"),
  new Method("push", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg2", int.class, "I"), 
  new Parameter("arg3", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg4", int.class, "I"), 
  new Parameter("arg5", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg6", int.class, "I"), 
  new Parameter("arg7", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m186"),
  new Method("putStash", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m187"),
  new Method("get", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m188"),
  new Method("getStash", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m189"),
  new Method("remove", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m190"),
  new Method("removeStash", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m191"),
  new Method("removeStashIndex", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m192"),
  new Method("clear", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m193"),
  new Method("containsValue", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m194"),
  new Method("containsKey", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m195"),
  new Method("containsKeyStash", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m196"),
  new Method("findKey", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m197"),
  new Method("ensureCapacity", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m198"),
  new Method("resize", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m199"),
  new Method("hash2", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m200"),
  new Method("hash3", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m201"),
  new Method("toString", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m202"),
  new Method("entries", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  com.badlogic.gdx.utils.ObjectMap.Entries.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m203"),
  new Method("values", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m204"),
  new Method("keys", 
  com.badlogic.gdx.utils.ObjectMap.class, 
  com.badlogic.gdx.utils.ObjectMap.Keys.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m205"),
  };
  types.put("com.badlogic.gdx.utils.ObjectMap", t);
  
  }
  
  public void c3() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Button[]";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Button[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  com.badlogic.gdx.scenes.scene2d.ui.Button[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m206"),
  new Method("getClass", 
  com.badlogic.gdx.scenes.scene2d.ui.Button[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m207"),
  new Method("hashCode", 
  com.badlogic.gdx.scenes.scene2d.ui.Button[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m208"),
  new Method("toString", 
  com.badlogic.gdx.scenes.scene2d.ui.Button[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m209"),
  new Method("finalize", 
  com.badlogic.gdx.scenes.scene2d.ui.Button[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m210"),
  };
  t.componentType = com.badlogic.gdx.scenes.scene2d.ui.Button.class;
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Button[]", t);
  
  }
  
  public void c4() {
  Type t = new Type();
  t.name = "java.lang.Integer";
  t.clazz = java.lang.Integer.class;
  t.superClass = java.lang.Number.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Integer.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.lang.Number.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("MAX_VALUE", java.lang.Integer.class, int.class, true, false, false, false, true, true, false, false, "g212", "s211" ), 
  new Field("MIN_VALUE", java.lang.Integer.class, int.class, true, false, false, false, true, true, false, false, "g214", "s213" ), 
  new Field("SIZE", java.lang.Integer.class, int.class, true, false, false, false, true, true, false, false, "g216", "s215" ), 
  new Field("value", java.lang.Integer.class, int.class, true, false, true, false, false, false, true, false, "g218", "s217" ), 
  };
  t.methods = new Method[] {
  new Method("bitCount", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m219"),
  new Method("decode", 
  java.lang.Integer.class, 
  java.lang.Integer.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m220"),
  new Method("hashCode", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m221"),
  new Method("hashCode", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m222"),
  new Method("highestOneBit", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m223"),
  new Method("lowestOneBit", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m224"),
  new Method("numberOfLeadingZeros", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m225"),
  new Method("numberOfTrailingZeros", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m226"),
  new Method("parseInt", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m227"),
  new Method("parseInt", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m228"),
  new Method("reverse", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m229"),
  new Method("reverseBytes", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m230"),
  new Method("rotateLeft", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  new Parameter("distance", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m231"),
  new Method("rotateRight", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  new Parameter("distance", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m232"),
  new Method("signum", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m233"),
  new Method("toBinaryString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m234"),
  new Method("toHexString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m235"),
  new Method("toOctalString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m236"),
  new Method("toString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m237"),
  new Method("toString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", int.class, "I"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m238"),
  new Method("toString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m239"),
  new Method("valueOf", 
  java.lang.Integer.class, 
  java.lang.Integer.class, 
  new Parameter[] {
  new Parameter("i", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m240"),
  new Method("valueOf", 
  java.lang.Integer.class, 
  java.lang.Integer.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m241"),
  new Method("valueOf", 
  java.lang.Integer.class, 
  java.lang.Integer.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m242"),
  new Method("toPowerOfTwoString", 
  java.lang.Integer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", int.class, "I"), 
  new Parameter("shift", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m243"),
  new Method("byteValue", 
  java.lang.Integer.class, 
  byte.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m244"),
  new Method("compareTo", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  new Parameter("b", java.lang.Integer.class, "Ljava/lang/Integer;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m245"),
  new Method("doubleValue", 
  java.lang.Integer.class, 
  double.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m246"),
  new Method("equals", 
  java.lang.Integer.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m247"),
  new Method("floatValue", 
  java.lang.Integer.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m248"),
  new Method("intValue", 
  java.lang.Integer.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m249"),
  new Method("longValue", 
  java.lang.Integer.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m250"),
  new Method("shortValue", 
  java.lang.Integer.class, 
  short.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m251"),
  };
  types.put("java.lang.Integer", t);
  
  }
  
  public void c5() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.TextureRegion[]";
  t.clazz = com.badlogic.gdx.graphics.g2d.TextureRegion[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.TextureRegion[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m252"),
  new Method("getClass", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m253"),
  new Method("hashCode", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m254"),
  new Method("toString", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m255"),
  new Method("finalize", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m256"),
  };
  t.componentType = com.badlogic.gdx.graphics.g2d.TextureRegion.class;
  types.put("com.badlogic.gdx.graphics.g2d.TextureRegion[]", t);
  
  }
  
  public void c6() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Widget";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.Actor.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  new Field("needsLayout", com.badlogic.gdx.scenes.scene2d.ui.Widget.class, boolean.class, false, false, true, false, false, false, false, false, "g258", "s257" ), 
  new Field("fillParent", com.badlogic.gdx.scenes.scene2d.ui.Widget.class, boolean.class, false, false, true, false, false, false, false, false, "g260", "s259" ), 
  };
  t.methods = new Method[] {
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m261"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m262"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m263"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m264"),
  new Method("getMaxWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m265"),
  new Method("getMaxHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m266"),
  new Method("invalidate", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m267"),
  new Method("validate", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m268"),
  new Method("needsLayout", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m269"),
  new Method("invalidateHierarchy", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m270"),
  new Method("pack", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m271"),
  new Method("setFillParent", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  new Parameter("fillParent", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m272"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m273"),
  new Method("hit", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m274"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m275"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m276"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m277"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m278"),
  new Method("toScreenCoordinates", 
  com.badlogic.gdx.scenes.scene2d.ui.Widget.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("point", com.badlogic.gdx.math.Vector2.class, "Lcom/badlogic/gdx/math/Vector2;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m279"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Widget", t);
  
  }
  
  public void c7() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFontCache";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFontCache.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFontCache.class);
  tAssignables.add(com.badlogic.gdx.utils.Disposable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("font", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, true, false, true, false, false, false, false, false, "g281", "s280" ), 
  new Field("vertices", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, float[].class, false, false, true, false, false, false, false, false, "g283", "s282" ), 
  new Field("idx", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, int.class, false, false, true, false, false, false, false, false, "g285", "s284" ), 
  new Field("x", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, float.class, false, false, true, false, false, false, false, false, "g287", "s286" ), 
  new Field("y", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, float.class, false, false, true, false, false, false, false, false, "g289", "s288" ), 
  new Field("color", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, float.class, false, false, true, false, false, false, false, false, "g291", "s290" ), 
  new Field("tmpColor", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, com.badlogic.gdx.graphics.Color.class, true, false, true, false, false, false, false, false, "g293", "s292" ), 
  new Field("textBounds", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, true, false, true, false, false, false, false, false, "g295", "s294" ), 
  new Field("integer", com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, boolean.class, false, false, true, false, false, false, false, false, "g297", "s296" ), 
  };
  t.methods = new Method[] {
  new Method("setPosition", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m298"),
  new Method("translate", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("xAmount", float.class, "F"), 
  new Parameter("yAmount", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m299"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m300"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tint", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m301"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m302"),
  new Method("draw", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m303"),
  new Method("draw", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("alphaModulation", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m304"),
  new Method("getColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m305"),
  new Method("reset", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("glyphCount", int.class, "I"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m306"),
  new Method("addToCache", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  float.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m307"),
  new Method("addGlyph", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("glyph", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$Glyph;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("width", float.class, "F"), 
  new Parameter("height", float.class, "F"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m308"),
  new Method("setText", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m309"),
  new Method("setText", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m310"),
  new Method("setMultiLineText", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m311"),
  new Method("setMultiLineText", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("alignmentWidth", float.class, "F"), 
  new Parameter("alignment", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m312"),
  new Method("setWrappedText", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("wrapWidth", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m313"),
  new Method("setWrappedText", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("wrapWidth", float.class, "F"), 
  new Parameter("alignment", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m314"),
  new Method("getBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m315"),
  new Method("getX", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m316"),
  new Method("getY", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m317"),
  new Method("getFont", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m318"),
  new Method("dispose", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m319"),
  new Method("setUseIntegerPositions", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  void.class, 
  new Parameter[] {
  new Parameter("use", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m320"),
  new Method("usesIntegerPositions", 
  com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m321"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFontCache", t);
  
  }
  
  public void c8() {
  Type t = new Type();
  t.name = "byte[][]";
  t.clazz = byte[][].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(byte[][].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  byte[][].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m322"),
  new Method("getClass", 
  byte[][].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m323"),
  new Method("hashCode", 
  byte[][].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m324"),
  new Method("toString", 
  byte[][].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m325"),
  new Method("finalize", 
  byte[][].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m326"),
  };
  t.componentType = byte[].class;
  types.put("byte[][]", t);
  
  }
  
  public void c9() {
  Type t = new Type();
  t.name = "java.lang.Object";
  t.clazz = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("expando", java.lang.Object.class, com.google.gwt.core.client.JavaScriptObject.class, false, false, true, false, false, false, true, false, "g328", "s327" ), 
  new Field("castableTypeMap", java.lang.Object.class, com.google.gwt.core.client.JavaScriptObject.class, false, false, true, false, false, false, true, false, "g330", "s329" ), 
  new Field("typeMarker", java.lang.Object.class, com.google.gwt.core.client.JavaScriptObject.class, false, false, true, false, false, false, true, false, "g332", "s331" ), 
  };
  t.methods = new Method[] {
  new Method("equals", 
  java.lang.Object.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m333"),
  new Method("getClass", 
  java.lang.Object.class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m334"),
  new Method("hashCode", 
  java.lang.Object.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m335"),
  new Method("toString", 
  java.lang.Object.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m336"),
  new Method("finalize", 
  java.lang.Object.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m337"),
  };
  types.put("java.lang.Object", t);
  
  }
  
  public void c10() {
  Type t = new Type();
  t.name = "byte[]";
  t.clazz = byte[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(byte[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  byte[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m338"),
  new Method("getClass", 
  byte[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m339"),
  new Method("hashCode", 
  byte[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m340"),
  new Method("toString", 
  byte[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m341"),
  new Method("finalize", 
  byte[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m342"),
  };
  t.componentType = byte.class;
  types.put("byte[]", t);
  
  }
  
  public void c11() {
  Type t = new Type();
  t.name = "java.lang.Object[]";
  t.clazz = java.lang.Object[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Object[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  java.lang.Object[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m343"),
  new Method("getClass", 
  java.lang.Object[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m344"),
  new Method("hashCode", 
  java.lang.Object[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m345"),
  new Method("toString", 
  java.lang.Object[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m346"),
  new Method("finalize", 
  java.lang.Object[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m347"),
  };
  t.componentType = java.lang.Object.class;
  types.put("java.lang.Object[]", t);
  
  }
  
  public void c12() {
  Type t = new Type();
  t.name = "java.util.Map";
  t.clazz = java.util.Map.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.util.Map.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("clear", 
  java.util.Map.class, 
  void.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m348"),
  new Method("containsKey", 
  java.util.Map.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m349"),
  new Method("containsValue", 
  java.util.Map.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m350"),
  new Method("entrySet", 
  java.util.Map.class, 
  java.util.Set.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m351"),
  new Method("equals", 
  java.util.Map.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m352"),
  new Method("get", 
  java.util.Map.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m353"),
  new Method("hashCode", 
  java.util.Map.class, 
  int.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m354"),
  new Method("isEmpty", 
  java.util.Map.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m355"),
  new Method("keySet", 
  java.util.Map.class, 
  java.util.Set.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m356"),
  new Method("put", 
  java.util.Map.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m357"),
  new Method("putAll", 
  java.util.Map.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.util.Map.class, "Ljava/util/Map;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m358"),
  new Method("remove", 
  java.util.Map.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m359"),
  new Method("size", 
  java.util.Map.class, 
  int.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m360"),
  new Method("values", 
  java.util.Map.class, 
  java.util.Collection.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m361"),
  };
  types.put("java.util.Map", t);
  
  }
  
  public void c13() {
  Type t = new Type();
  t.name = "char[]";
  t.clazz = char[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(char[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  char[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m362"),
  new Method("getClass", 
  char[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m363"),
  new Method("hashCode", 
  char[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m364"),
  new Method("toString", 
  char[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m365"),
  new Method("finalize", 
  char[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m366"),
  };
  t.componentType = char.class;
  types.put("char[]", t);
  
  }
  
  public void c14() {
  Type t = new Type();
  t.name = "java.util.HashMap";
  t.clazz = java.util.HashMap.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.util.HashMap.class);
  tAssignables.add(java.lang.Cloneable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.util.AbstractMap.class);
  tAssignables.add(java.util.Map.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("exposeKey", java.util.HashMap.class, java.lang.Object.class, false, false, true, false, false, false, false, false, "g368", "s367" ), 
  new Field("exposeValue", java.util.HashMap.class, java.lang.Object.class, false, false, true, false, false, false, false, false, "g370", "s369" ), 
  };
  t.methods = new Method[] {
  new Method("clone", 
  java.util.HashMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m371"),
  new Method("equals", 
  java.util.HashMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m372"),
  new Method("getHashCode", 
  java.util.HashMap.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m373"),
  };
  types.put("java.util.HashMap", t);
  
  }
  
  public void c15() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.Disposable";
  t.clazz = com.badlogic.gdx.utils.Disposable.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.Disposable.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("dispose", 
  com.badlogic.gdx.utils.Disposable.class, 
  void.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m374"),
  };
  types.put("com.badlogic.gdx.utils.Disposable", t);
  
  }
  
  public void c16() {
  Type p = new Type();
  p.name = "long";
  p.clazz = long.class;
  p.isPrimitive = true;
  types.put("long", p);
  
  }
  
  public void c17() {
  Type t = new Type();
  t.name = "java.lang.StringBuilder";
  t.clazz = java.lang.StringBuilder.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.StringBuilder.class);
  tAssignables.add(java.lang.CharSequence.class);
  tAssignables.add(java.lang.Appendable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("impl", java.lang.StringBuilder.class, com.google.gwt.core.client.impl.StringBufferImpl.class, true, false, true, false, false, false, false, false, "g376", "s375" ), 
  new Field("data", java.lang.StringBuilder.class, java.lang.Object.class, true, false, true, false, false, false, false, false, "g378", "s377" ), 
  };
  t.methods = new Method[] {
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m379"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m380"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m381"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m382"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m383"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m384"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m385"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m386"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m387"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", long.class, "J"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m388"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m389"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m390"),
  new Method("append", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("x", java.lang.StringBuilder.class, "Ljava/lang/StringBuilder;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m391"),
  new Method("capacity", 
  java.lang.StringBuilder.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m392"),
  new Method("charAt", 
  java.lang.StringBuilder.class, 
  char.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m393"),
  new Method("delete", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m394"),
  new Method("deleteCharAt", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m395"),
  new Method("ensureCapacity", 
  java.lang.StringBuilder.class, 
  void.class, 
  new Parameter[] {
  new Parameter("ignoredCapacity", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m396"),
  new Method("getChars", 
  java.lang.StringBuilder.class, 
  void.class, 
  new Parameter[] {
  new Parameter("srcStart", int.class, "I"), 
  new Parameter("srcEnd", int.class, "I"), 
  new Parameter("dst", char[].class, "[C"), 
  new Parameter("dstStart", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m397"),
  new Method("indexOf", 
  java.lang.StringBuilder.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m398"),
  new Method("indexOf", 
  java.lang.StringBuilder.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m399"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m400"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m401"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char[].class, "[C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m402"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char[].class, "[C"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m403"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("chars", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m404"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("chars", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m405"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m406"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m407"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m408"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", long.class, "J"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m409"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m410"),
  new Method("insert", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m411"),
  new Method("lastIndexOf", 
  java.lang.StringBuilder.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m412"),
  new Method("lastIndexOf", 
  java.lang.StringBuilder.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m413"),
  new Method("length", 
  java.lang.StringBuilder.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m414"),
  new Method("replace", 
  java.lang.StringBuilder.class, 
  java.lang.StringBuilder.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  new Parameter("toInsert", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m415"),
  new Method("setCharAt", 
  java.lang.StringBuilder.class, 
  void.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m416"),
  new Method("setLength", 
  java.lang.StringBuilder.class, 
  void.class, 
  new Parameter[] {
  new Parameter("newLength", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m417"),
  new Method("subSequence", 
  java.lang.StringBuilder.class, 
  java.lang.CharSequence.class, 
  new Parameter[] {
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m418"),
  new Method("substring", 
  java.lang.StringBuilder.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("begin", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m419"),
  new Method("substring", 
  java.lang.StringBuilder.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("begin", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m420"),
  new Method("toString", 
  java.lang.StringBuilder.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m421"),
  new Method("trimToSize", 
  java.lang.StringBuilder.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m422"),
  };
  types.put("java.lang.StringBuilder", t);
  
  }
  
  public void c18() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.ArrayMap";
  t.clazz = com.badlogic.gdx.utils.ArrayMap.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.ArrayMap.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("keys", com.badlogic.gdx.utils.ArrayMap.class, java.lang.Object[].class, false, false, false, false, true, false, false, false, "g424", "s423" ), 
  new Field("values", com.badlogic.gdx.utils.ArrayMap.class, java.lang.Object[].class, false, false, false, false, true, false, false, false, "g426", "s425" ), 
  new Field("size", com.badlogic.gdx.utils.ArrayMap.class, int.class, false, false, false, false, true, false, false, false, "g428", "s427" ), 
  new Field("ordered", com.badlogic.gdx.utils.ArrayMap.class, boolean.class, false, false, false, false, true, false, false, false, "g430", "s429" ), 
  };
  t.methods = new Method[] {
  new Method("put", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m431"),
  new Method("addAll", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", com.badlogic.gdx.utils.ArrayMap.class, "Lcom/badlogic/gdx/utils/ArrayMap;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m432"),
  new Method("addAll", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", com.badlogic.gdx.utils.ArrayMap.class, "Lcom/badlogic/gdx/utils/ArrayMap;"), 
  new Parameter("arg1", int.class, "I"), 
  new Parameter("arg2", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m433"),
  new Method("get", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m434"),
  new Method("get", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m435"),
  new Method("getKey", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m436"),
  new Method("getKeyAt", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m437"),
  new Method("getValueAt", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m438"),
  new Method("setKey", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m439"),
  new Method("setValue", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m440"),
  new Method("insert", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg2", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m441"),
  new Method("containsKey", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m442"),
  new Method("containsValue", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m443"),
  new Method("indexOfKey", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m444"),
  new Method("indexOfValue", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m445"),
  new Method("removeKey", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m446"),
  new Method("removeValue", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m447"),
  new Method("removeIndex", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m448"),
  new Method("peekKey", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m449"),
  new Method("peekValue", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m450"),
  new Method("clear", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m451"),
  new Method("shrink", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m452"),
  new Method("ensureCapacity", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m453"),
  new Method("resize", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m454"),
  new Method("reverse", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m455"),
  new Method("shuffle", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m456"),
  new Method("truncate", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m457"),
  new Method("toString", 
  com.badlogic.gdx.utils.ArrayMap.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m458"),
  };
  types.put("com.badlogic.gdx.utils.ArrayMap", t);
  
  }
  
  public void c19() {
  Type p = new Type();
  p.name = "float";
  p.clazz = float.class;
  p.isPrimitive = true;
  types.put("float", p);
  
  }
  
  public void c20() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Integer.class, "Ljava/lang/Integer;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m459"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  java.lang.Integer.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m460"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Integer.class, "Ljava/lang/Integer;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m461"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Integer.class, "Ljava/lang/Integer;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m462"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m463"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  java.lang.Integer.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m464"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Integer.class, "Ljava/lang/Integer;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m465"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer", t);
  
  }
  
  public void c21() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.ScrollPane";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, false, false, true, false, false, false, false, false, "g467", "s466" ), 
  new Field("widget", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.scenes.scene2d.Actor.class, false, false, true, false, false, false, false, false, "g469", "s468" ), 
  new Field("hScrollBounds", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g471", "s470" ), 
  new Field("vScrollBounds", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g473", "s472" ), 
  new Field("hKnobBounds", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g475", "s474" ), 
  new Field("vKnobBounds", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g477", "s476" ), 
  new Field("widgetAreaBounds", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g479", "s478" ), 
  new Field("widgetCullingArea", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g481", "s480" ), 
  new Field("scissorBounds", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g483", "s482" ), 
  new Field("scrollX", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g485", "s484" ), 
  new Field("scrollY", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g487", "s486" ), 
  new Field("amountX", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g489", "s488" ), 
  new Field("amountY", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g491", "s490" ), 
  new Field("touchScrollH", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g493", "s492" ), 
  new Field("touchScrollV", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g495", "s494" ), 
  new Field("lastPoint", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, com.badlogic.gdx.math.Vector2.class, true, false, true, false, false, false, false, false, "g497", "s496" ), 
  new Field("handlePosition", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g499", "s498" ), 
  new Field("disableX", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g501", "s500" ), 
  new Field("disableY", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g503", "s502" ), 
  new Field("areaWidth", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g505", "s504" ), 
  new Field("areaHeight", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g507", "s506" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/ScrollPane$ScrollPaneStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m508"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m509"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m510"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m511"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m512"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m513"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m514"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m515"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m516"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m517"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m518"),
  new Method("setWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("widget", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m519"),
  new Method("addActor", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m520"),
  new Method("addActorAt", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m521"),
  new Method("addActorBefore", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actorBefore", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m522"),
  new Method("removeActor", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m523"),
  new Method("removeActorRecursive", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m524"),
  new Method("hit", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m525"),
  new Method("setScrollX", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("pixels", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m526"),
  new Method("getScrollX", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m527"),
  new Method("setScrollY", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("pixels", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m528"),
  new Method("getScrollY", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m529"),
  new Method("getScrollPercentX", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m530"),
  new Method("setScrollPercentX", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("percentX", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m531"),
  new Method("getScrollPercentY", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m532"),
  new Method("setScrollPercentY", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("percentY", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m533"),
  new Method("getMaxX", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m534"),
  new Method("getMaxY", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m535"),
  new Method("setScrollingDisabled", 
  com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  new Parameter("y", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m536"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.ScrollPane", t);
  
  }
  
  public void c22() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.Color";
  t.clazz = com.badlogic.gdx.graphics.Color.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.Color.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("CLEAR", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g538", "s537" ), 
  new Field("WHITE", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g540", "s539" ), 
  new Field("BLACK", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g542", "s541" ), 
  new Field("RED", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g544", "s543" ), 
  new Field("GREEN", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g546", "s545" ), 
  new Field("BLUE", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g548", "s547" ), 
  new Field("LIGHT_GRAY", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g550", "s549" ), 
  new Field("GRAY", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g552", "s551" ), 
  new Field("DARK_GRAY", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g554", "s553" ), 
  new Field("PINK", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g556", "s555" ), 
  new Field("ORANGE", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g558", "s557" ), 
  new Field("YELLOW", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g560", "s559" ), 
  new Field("MAGENTA", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g562", "s561" ), 
  new Field("CYAN", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, true, false, false, false, true, true, false, false, "g564", "s563" ), 
  new Field("r", com.badlogic.gdx.graphics.Color.class, float.class, false, false, false, false, true, false, false, false, "g566", "s565" ), 
  new Field("g", com.badlogic.gdx.graphics.Color.class, float.class, false, false, false, false, true, false, false, false, "g568", "s567" ), 
  new Field("b", com.badlogic.gdx.graphics.Color.class, float.class, false, false, false, false, true, false, false, false, "g570", "s569" ), 
  new Field("a", com.badlogic.gdx.graphics.Color.class, float.class, false, false, false, false, true, false, false, false, "g572", "s571" ), 
  new Field("tmp", com.badlogic.gdx.graphics.Color.class, com.badlogic.gdx.graphics.Color.class, false, false, true, false, false, true, false, false, "g574", "s573" ), 
  };
  t.methods = new Method[] {
  new Method("set", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m575"),
  new Method("set", 
  com.badlogic.gdx.graphics.Color.class, 
  void.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m576"),
  new Method("mul", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m577"),
  new Method("mul", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  new Parameter("value", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m578"),
  new Method("add", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m579"),
  new Method("sub", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m580"),
  new Method("clamp", 
  com.badlogic.gdx.graphics.Color.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m581"),
  new Method("equals", 
  com.badlogic.gdx.graphics.Color.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m582"),
  new Method("hashCode", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m583"),
  new Method("toString", 
  com.badlogic.gdx.graphics.Color.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m584"),
  new Method("toFloatBits", 
  com.badlogic.gdx.graphics.Color.class, 
  float.class, 
  new Parameter[] {
  new Parameter("r", int.class, "I"), 
  new Parameter("g", int.class, "I"), 
  new Parameter("b", int.class, "I"), 
  new Parameter("a", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m585"),
  new Method("toFloatBits", 
  com.badlogic.gdx.graphics.Color.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m586"),
  new Method("toFloatBits", 
  com.badlogic.gdx.graphics.Color.class, 
  float.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m587"),
  new Method("toIntBits", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("r", int.class, "I"), 
  new Parameter("g", int.class, "I"), 
  new Parameter("b", int.class, "I"), 
  new Parameter("a", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m588"),
  new Method("toIntBits", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m589"),
  new Method("alpha", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("alpha", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m590"),
  new Method("luminanceAlpha", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("luminance", float.class, "F"), 
  new Parameter("alpha", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m591"),
  new Method("rgb565", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m592"),
  new Method("rgb565", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m593"),
  new Method("rgba4444", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m594"),
  new Method("rgba4444", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m595"),
  new Method("rgb888", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m596"),
  new Method("rgb888", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m597"),
  new Method("rgba8888", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m598"),
  new Method("rgba8888", 
  com.badlogic.gdx.graphics.Color.class, 
  int.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m599"),
  new Method("rgb565ToColor", 
  com.badlogic.gdx.graphics.Color.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m600"),
  new Method("rgba4444ToColor", 
  com.badlogic.gdx.graphics.Color.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m601"),
  new Method("rgb888ToColor", 
  com.badlogic.gdx.graphics.Color.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m602"),
  new Method("rgba8888ToColor", 
  com.badlogic.gdx.graphics.Color.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m603"),
  new Method("tmp", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m604"),
  new Method("cpy", 
  com.badlogic.gdx.graphics.Color.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m605"),
  };
  types.put("com.badlogic.gdx.graphics.Color", t);
  
  }
  
  public void c23() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("show", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class, 
  void.class, 
  new Parameter[] {
  new Parameter("visible", boolean.class, "Z"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m606"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard", t);
  
  }
  
  public void c24() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("font", com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g608", "s607" ), 
  new Field("fontColor", com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g610", "s609" ), 
  new Field("downFontColor", com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g612", "s611" ), 
  new Field("checkedFontColor", com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g614", "s613" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle", t);
  
  }
  
  public void c25() {
  Type p = new Type();
  p.name = "void";
  p.clazz = void.class;
  p.isPrimitive = true;
  types.put("void", p);
  
  }
  
  public void c26() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.Array.ArrayIterator";
  t.clazz = com.badlogic.gdx.utils.Array.ArrayIterator.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.Array.ArrayIterator.class);
  tAssignables.add(java.util.Iterator.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("array", com.badlogic.gdx.utils.Array.ArrayIterator.class, com.badlogic.gdx.utils.Array.class, true, false, true, false, false, false, false, false, "g616", "s615" ), 
  new Field("index", com.badlogic.gdx.utils.Array.ArrayIterator.class, int.class, false, true, false, false, false, false, false, false, "g618", "s617" ), 
  };
  t.methods = new Method[] {
  new Method("hasNext", 
  com.badlogic.gdx.utils.Array.ArrayIterator.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m619"),
  new Method("next", 
  com.badlogic.gdx.utils.Array.ArrayIterator.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m620"),
  new Method("remove", 
  com.badlogic.gdx.utils.Array.ArrayIterator.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m621"),
  new Method("reset", 
  com.badlogic.gdx.utils.Array.ArrayIterator.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m622"),
  };
  types.put("com.badlogic.gdx.utils.Array.ArrayIterator", t);
  
  }
  
  public void c27() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][]";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m623"),
  new Method("getClass", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m624"),
  new Method("hashCode", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m625"),
  new Method("toString", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m626"),
  new Method("finalize", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m627"),
  };
  t.componentType = com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[].class;
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][]", t);
  
  }
  
  public void c28() {
  Type t = new Type();
  t.name = "java.lang.Boolean";
  t.clazz = java.lang.Boolean.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Boolean.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("FALSE", java.lang.Boolean.class, java.lang.Boolean.class, false, false, false, false, true, true, false, false, "g629", "s628" ), 
  new Field("TRUE", java.lang.Boolean.class, java.lang.Boolean.class, false, false, false, false, true, true, false, false, "g631", "s630" ), 
  new Field("value", java.lang.Boolean.class, boolean.class, true, false, true, false, false, false, true, false, "g633", "s632" ), 
  };
  t.methods = new Method[] {
  new Method("parseBoolean", 
  java.lang.Boolean.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m634"),
  new Method("toString", 
  java.lang.Boolean.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m635"),
  new Method("toString", 
  java.lang.Boolean.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m636"),
  new Method("valueOf", 
  java.lang.Boolean.class, 
  java.lang.Boolean.class, 
  new Parameter[] {
  new Parameter("b", boolean.class, "Z"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m637"),
  new Method("valueOf", 
  java.lang.Boolean.class, 
  java.lang.Boolean.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m638"),
  new Method("booleanValue", 
  java.lang.Boolean.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m639"),
  new Method("compareTo", 
  java.lang.Boolean.class, 
  int.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Boolean.class, "Ljava/lang/Boolean;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m640"),
  new Method("equals", 
  java.lang.Boolean.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m641"),
  new Method("hashCode", 
  java.lang.Boolean.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m642"),
  };
  types.put("java.lang.Boolean", t);
  
  }
  
  public void c29() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.NinePatch";
  t.clazz = com.badlogic.gdx.graphics.g2d.NinePatch.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.NinePatch.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("TOP_LEFT", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g644", "s643" ), 
  new Field("TOP_CENTER", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g646", "s645" ), 
  new Field("TOP_RIGHT", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g648", "s647" ), 
  new Field("MIDDLE_LEFT", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g650", "s649" ), 
  new Field("MIDDLE_CENTER", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g652", "s651" ), 
  new Field("MIDDLE_RIGHT", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g654", "s653" ), 
  new Field("BOTTOM_LEFT", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g656", "s655" ), 
  new Field("BOTTOM_CENTER", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g658", "s657" ), 
  new Field("BOTTOM_RIGHT", com.badlogic.gdx.graphics.g2d.NinePatch.class, int.class, true, false, false, false, true, true, false, false, "g660", "s659" ), 
  new Field("patches", com.badlogic.gdx.graphics.g2d.NinePatch.class, com.badlogic.gdx.graphics.g2d.TextureRegion[].class, false, false, true, false, false, false, false, false, "g662", "s661" ), 
  new Field("color", com.badlogic.gdx.graphics.g2d.NinePatch.class, com.badlogic.gdx.graphics.Color.class, false, false, true, false, false, false, false, false, "g664", "s663" ), 
  new Field("blending", com.badlogic.gdx.graphics.g2d.NinePatch.class, boolean.class, false, false, true, false, false, false, false, false, "g666", "s665" ), 
  };
  t.methods = new Method[] {
  new Method("checkValidity", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m667"),
  new Method("draw", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("width", float.class, "F"), 
  new Parameter("height", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m668"),
  new Method("getLeftWidth", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m669"),
  new Method("getRightWidth", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m670"),
  new Method("getTopHeight", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m671"),
  new Method("getBottomHeight", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m672"),
  new Method("getTotalHeight", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m673"),
  new Method("getTotalWidth", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m674"),
  new Method("getPatches", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  com.badlogic.gdx.graphics.g2d.TextureRegion[].class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m675"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m676"),
  new Method("getColor", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m677"),
  new Method("setBlending", 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  void.class, 
  new Parameter[] {
  new Parameter("blending", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m678"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.NinePatch", t);
  
  }
  
  public void c30() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("widget", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.scenes.scene2d.Actor.class, false, false, true, false, false, false, false, false, "g680", "s679" ), 
  new Field("widgetAreaBounds", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g682", "s681" ), 
  new Field("widgetCullingArea", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g684", "s683" ), 
  new Field("scissorBounds", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g686", "s685" ), 
  new Field("gestureDetector", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.input.GestureDetector.class, true, false, true, false, false, false, false, false, "g688", "s687" ), 
  new Field("scrollX", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g690", "s689" ), 
  new Field("scrollY", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g692", "s691" ), 
  new Field("amountX", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, true, false, false, false, false, false, false, "g694", "s693" ), 
  new Field("amountY", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, true, false, false, false, false, false, false, "g696", "s695" ), 
  new Field("maxX", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g698", "s697" ), 
  new Field("maxY", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g700", "s699" ), 
  new Field("velocityX", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, true, false, false, false, false, false, false, "g702", "s701" ), 
  new Field("velocityY", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, true, false, false, false, false, false, false, "g704", "s703" ), 
  new Field("flingTimer", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, true, false, false, false, false, false, false, "g706", "s705" ), 
  new Field("touchFocusedChild", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.scenes.scene2d.Actor.class, false, false, true, false, false, false, false, false, "g708", "s707" ), 
  new Field("overscroll", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g710", "s709" ), 
  new Field("flingTime", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, true, false, false, false, false, false, false, "g712", "s711" ), 
  new Field("overscrollDistance", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g714", "s713" ), 
  new Field("overscrollSpeedMin", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g716", "s715" ), 
  new Field("overscrollSpeedMax", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, float.class, false, false, true, false, false, false, false, false, "g718", "s717" ), 
  new Field("overscrollInterpolation", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, com.badlogic.gdx.math.Interpolation.class, false, false, true, false, false, false, false, false, "g720", "s719" ), 
  new Field("emptySpaceOnlyScroll", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g722", "s721" ), 
  new Field("forceOverscrollX", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g724", "s723" ), 
  new Field("forceOverscrollY", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g726", "s725" ), 
  new Field("disableX", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g728", "s727" ), 
  new Field("disableY", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g730", "s729" ), 
  new Field("clamp", com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, boolean.class, false, false, true, false, false, false, false, false, "g732", "s731" ), 
  };
  t.methods = new Method[] {
  new Method("clamp", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m733"),
  new Method("act", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("delta", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m734"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m735"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m736"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m737"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m738"),
  new Method("cancelTouchFocusedChild", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m739"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m740"),
  new Method("setScrollX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("pixels", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m741"),
  new Method("getScrollX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m742"),
  new Method("setScrollY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("pixels", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m743"),
  new Method("getScrollY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m744"),
  new Method("getScrollPercentX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m745"),
  new Method("setScrollPercentX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("percentX", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m746"),
  new Method("getScrollPercentY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m747"),
  new Method("setScrollPercentY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("percentY", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m748"),
  new Method("getMaxX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m749"),
  new Method("getMaxY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m750"),
  new Method("setWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("widget", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m751"),
  new Method("getWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m752"),
  new Method("addActor", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m753"),
  new Method("addActorAt", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m754"),
  new Method("addActorBefore", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actorBefore", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m755"),
  new Method("removeActor", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m756"),
  new Method("removeActorRecursive", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m757"),
  new Method("isPanning", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m758"),
  new Method("isFlinging", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m759"),
  new Method("setVelocityX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("velocityX", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m760"),
  new Method("getVelocityX", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m761"),
  new Method("setVelocityY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("velocityY", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m762"),
  new Method("getVelocityY", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m763"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m764"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m765"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m766"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m767"),
  new Method("hit", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m768"),
  new Method("setOverscroll", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("overscroll", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m769"),
  new Method("setupOverscroll", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("distance", float.class, "F"), 
  new Parameter("speedMin", float.class, "F"), 
  new Parameter("speedMax", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m770"),
  new Method("setForceOverscroll", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  new Parameter("y", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m771"),
  new Method("setFlingTime", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("flingTime", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m772"),
  new Method("setEmptySpaceOnlyScroll", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("emptySpaceOnlyScroll", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m773"),
  new Method("setScrollingDisabled", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  new Parameter("y", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m774"),
  new Method("setClamp", 
  com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("clamp", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m775"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane", t);
  
  }
  
  public void c31() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.SelectionListener";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("selected", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("value", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m776"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.SelectionListener", t);
  
  }
  
  public void c32() {
  Type t = new Type();
  t.name = "java.lang.Float";
  t.clazz = java.lang.Float.class;
  t.superClass = java.lang.Number.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Float.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.lang.Number.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("MAX_VALUE", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g778", "s777" ), 
  new Field("MIN_VALUE", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g780", "s779" ), 
  new Field("MAX_EXPONENT", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g782", "s781" ), 
  new Field("MIN_EXPONENT", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g784", "s783" ), 
  new Field("MIN_NORMAL", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g786", "s785" ), 
  new Field("NaN", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g788", "s787" ), 
  new Field("NEGATIVE_INFINITY", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g790", "s789" ), 
  new Field("POSITIVE_INFINITY", java.lang.Float.class, float.class, true, false, false, false, true, true, false, false, "g792", "s791" ), 
  new Field("SIZE", java.lang.Float.class, int.class, true, false, false, false, true, true, false, false, "g794", "s793" ), 
  new Field("value", java.lang.Float.class, float.class, true, false, true, false, false, false, true, false, "g796", "s795" ), 
  };
  t.methods = new Method[] {
  new Method("compare", 
  java.lang.Float.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m797"),
  new Method("hashCode", 
  java.lang.Float.class, 
  int.class, 
  new Parameter[] {
  new Parameter("f", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m798"),
  new Method("hashCode", 
  java.lang.Float.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m799"),
  new Method("isInfinite", 
  java.lang.Float.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m800"),
  new Method("isInfinite", 
  java.lang.Float.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m801"),
  new Method("isNaN", 
  java.lang.Float.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m802"),
  new Method("isNaN", 
  java.lang.Float.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m803"),
  new Method("parseFloat", 
  java.lang.Float.class, 
  float.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m804"),
  new Method("toString", 
  java.lang.Float.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("b", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m805"),
  new Method("toString", 
  java.lang.Float.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m806"),
  new Method("valueOf", 
  java.lang.Float.class, 
  java.lang.Float.class, 
  new Parameter[] {
  new Parameter("f", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m807"),
  new Method("valueOf", 
  java.lang.Float.class, 
  java.lang.Float.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m808"),
  new Method("byteValue", 
  java.lang.Float.class, 
  byte.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m809"),
  new Method("compareTo", 
  java.lang.Float.class, 
  int.class, 
  new Parameter[] {
  new Parameter("b", java.lang.Float.class, "Ljava/lang/Float;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m810"),
  new Method("doubleValue", 
  java.lang.Float.class, 
  double.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m811"),
  new Method("equals", 
  java.lang.Float.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m812"),
  new Method("floatValue", 
  java.lang.Float.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m813"),
  new Method("intValue", 
  java.lang.Float.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m814"),
  new Method("longValue", 
  java.lang.Float.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m815"),
  new Method("shortValue", 
  java.lang.Float.class, 
  short.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m816"),
  };
  types.put("java.lang.Float", t);
  
  }
  
  public void c33() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Stack";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Stack.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Stack.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m817"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m818"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m819"),
  new Method("getMaxWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m820"),
  new Method("getMaxHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m821"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m822"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Stack.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m823"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Stack", t);
  
  }
  
  public void c34() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("background", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g825", "s824" ), 
  new Field("hScroll", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g827", "s826" ), 
  new Field("hScrollKnob", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g829", "s828" ), 
  new Field("vScroll", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g831", "s830" ), 
  new Field("vScrollKnob", com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g833", "s832" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle", t);
  
  }
  
  public void c35() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.SplitPane";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class, false, false, true, false, false, false, false, false, "g835", "s834" ), 
  new Field("firstWidget", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.scenes.scene2d.Actor.class, false, false, true, false, false, false, false, false, "g837", "s836" ), 
  new Field("secondWidget", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.scenes.scene2d.Actor.class, false, false, true, false, false, false, false, false, "g839", "s838" ), 
  new Field("vertical", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, boolean.class, false, false, true, false, false, false, false, false, "g841", "s840" ), 
  new Field("splitAmount", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, float.class, false, false, true, false, false, false, false, false, "g843", "s842" ), 
  new Field("minAmount", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, float.class, false, false, true, false, false, false, false, false, "g845", "s844" ), 
  new Field("maxAmount", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, float.class, false, false, true, false, false, false, false, false, "g847", "s846" ), 
  new Field("oldSplitAmount", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, float.class, false, false, true, false, false, false, false, false, "g849", "s848" ), 
  new Field("touchDrag", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, boolean.class, false, false, true, false, false, false, false, false, "g851", "s850" ), 
  new Field("firstWidgetBounds", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Rectangle.class, false, false, true, false, false, false, false, false, "g853", "s852" ), 
  new Field("secondWidgetBounds", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Rectangle.class, false, false, true, false, false, false, false, false, "g855", "s854" ), 
  new Field("handleBounds", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Rectangle.class, false, false, true, false, false, false, false, false, "g857", "s856" ), 
  new Field("firstScissors", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Rectangle.class, false, false, true, false, false, false, false, false, "g859", "s858" ), 
  new Field("secondScissors", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Rectangle.class, false, false, true, false, false, false, false, false, "g861", "s860" ), 
  new Field("lastPoint", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Vector2.class, false, false, true, false, false, false, false, false, "g863", "s862" ), 
  new Field("handlePosition", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, com.badlogic.gdx.math.Vector2.class, false, false, true, false, false, false, false, false, "g865", "s864" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/SplitPane$SplitPaneStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m866"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m867"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m868"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m869"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m870"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m871"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m872"),
  new Method("setVertical", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("vertical", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m873"),
  new Method("calculateHorizBoundsAndPositions", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m874"),
  new Method("calculateVertBoundsAndPositions", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m875"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m876"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m877"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m878"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m879"),
  new Method("setSplitAmount", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("split", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m880"),
  new Method("getSplit", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m881"),
  new Method("setMinSplitAmount", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("minAmount", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m882"),
  new Method("setMaxSplitAmount", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("maxAmount", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m883"),
  new Method("setFirstWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("widget", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m884"),
  new Method("setSecondWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("widget", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m885"),
  new Method("addActor", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m886"),
  new Method("addActorAt", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m887"),
  new Method("addActorBefore", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actorBefore", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m888"),
  new Method("removeActor", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m889"),
  new Method("removeActorRecursive", 
  com.badlogic.gdx.scenes.scene2d.ui.SplitPane.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m890"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.SplitPane", t);
  
  }
  
  public void c36() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("changed", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener.class, 
  void.class, 
  new Parameter[] {
  new Parameter("slider", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Slider;"), 
  new Parameter("value", float.class, "F"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m891"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener", t);
  
  }
  
  public void c37() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("background", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g893", "s892" ), 
  new Field("listBackground", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g895", "s894" ), 
  new Field("listSelection", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g897", "s896" ), 
  new Field("font", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g899", "s898" ), 
  new Field("fontColor", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g901", "s900" ), 
  new Field("itemSpacing", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, float.class, false, false, false, false, true, false, false, false, "g903", "s902" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle", t);
  
  }
  
  public void c38() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m904"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m905"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m906"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m907"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m908"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m909"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m910"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer", t);
  
  }
  
  public void c39() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.SelectBox";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, false, true, false, false, false, false, false, false, "g912", "s911" ), 
  new Field("items", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, java.lang.String[].class, false, true, false, false, false, false, false, false, "g914", "s913" ), 
  new Field("selection", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, int.class, false, true, false, false, false, false, false, false, "g916", "s915" ), 
  new Field("bounds", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, true, false, true, false, false, false, false, false, "g918", "s917" ), 
  new Field("screenCoords", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, com.badlogic.gdx.math.Vector2.class, true, true, false, false, false, false, false, false, "g920", "s919" ), 
  new Field("list", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, null, false, false, true, false, false, false, false, false, "g922", "s921" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class, false, true, false, false, false, false, false, false, "g924", "s923" ), 
  new Field("prefWidth", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, float.class, false, false, true, false, false, false, false, false, "g926", "s925" ), 
  new Field("prefHeight", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, float.class, false, false, true, false, false, false, false, false, "g928", "s927" ), 
  new Field("stageCoords", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, com.badlogic.gdx.math.Vector2.class, true, true, false, false, false, false, false, false, "g930", "s929" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/SelectBox$SelectBoxStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m931"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m932"),
  new Method("setItems", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("objects", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m933"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m934"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m935"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m936"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m937"),
  new Method("setSelectionListener", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/SelectionListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m938"),
  new Method("setSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("selection", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m939"),
  new Method("setSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("item", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m940"),
  new Method("getSelectionIndex", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m941"),
  new Method("getSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m942"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m943"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m944"),
  new Method("markToRemove", 
  com.badlogic.gdx.scenes.scene2d.ui.SelectBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("remove", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m945"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.SelectBox", t);
  
  }
  
  public void c40() {
  Type p = new Type();
  p.name = "double";
  p.clazz = double.class;
  p.isPrimitive = true;
  types.put("double", p);
  
  }
  
  public void c41() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("show", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard.class, 
  void.class, 
  new Parameter[] {
  new Parameter("visible", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m946"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard", t);
  
  }
  
  public void c42() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("keyTyped", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener.class, 
  void.class, 
  new Parameter[] {
  new Parameter("textField", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;"), 
  new Parameter("key", char.class, "C"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m947"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener", t);
  
  }
  
  public void c43() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.util.ArrayList.class, "Ljava/util/ArrayList;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m948"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.util.ArrayList.class, "Ljava/util/ArrayList;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m949"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.util.ArrayList.class, "Ljava/util/ArrayList;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m950"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.util.ArrayList.class, "Ljava/util/ArrayList;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m951"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer", t);
  
  }
  
  public void c44() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase";
  t.clazz = com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.util.Map.class, "Ljava/util/Map;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m952"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.util.Map.class, "Ljava/util/Map;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m953"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase", t);
  
  }
  
  public void c45() {
  Type t = new Type();
  t.name = "java.lang.StringIndexOutOfBoundsException";
  t.clazz = java.lang.StringIndexOutOfBoundsException.class;
  t.superClass = java.lang.IndexOutOfBoundsException.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.StringIndexOutOfBoundsException.class);
  tAssignables.add(java.lang.IndexOutOfBoundsException.class);
  tAssignables.add(java.lang.RuntimeException.class);
  tAssignables.add(java.lang.Exception.class);
  tAssignables.add(java.lang.Throwable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  };
  types.put("java.lang.StringIndexOutOfBoundsException", t);
  
  }
  
  public void c46() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.Group.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  new Field("needsLayout", com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, boolean.class, false, false, true, false, false, false, false, false, "g955", "s954" ), 
  new Field("fillParent", com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, boolean.class, false, false, true, false, false, false, false, false, "g957", "s956" ), 
  };
  t.methods = new Method[] {
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m958"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m959"),
  new Method("getMaxWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m960"),
  new Method("getMaxHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m961"),
  new Method("invalidate", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m962"),
  new Method("validate", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m963"),
  new Method("needsLayout", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m964"),
  new Method("invalidateHierarchy", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m965"),
  new Method("childrenChanged", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m966"),
  new Method("pack", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m967"),
  new Method("setFillParent", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("fillParent", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m968"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m969"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m970"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup", t);
  
  }
  
  public void c47() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Byte.class, "Ljava/lang/Byte;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m971"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  java.lang.Byte.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m972"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Byte.class, "Ljava/lang/Byte;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m973"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Byte.class, "Ljava/lang/Byte;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m974"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m975"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  java.lang.Byte.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m976"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Byte.class, "Ljava/lang/Byte;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m977"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer", t);
  
  }
  
  public void c48() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Short.class, "Ljava/lang/Short;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m978"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  java.lang.Short.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m979"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Short.class, "Ljava/lang/Short;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m980"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Short.class, "Ljava/lang/Short;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m981"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m982"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  java.lang.Short.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m983"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Short.class, "Ljava/lang/Short;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m984"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer", t);
  
  }
  
  public void c49() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("slider", com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, true, false, false, false, false, false, false, "g986", "s985" ), 
  new Field("knob", com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, true, false, false, false, false, false, false, "g988", "s987" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle", t);
  
  }
  
  public void c50() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.ObjectMap.Entry";
  t.clazz = com.badlogic.gdx.utils.ObjectMap.Entry.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.ObjectMap.Entry.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("key", com.badlogic.gdx.utils.ObjectMap.Entry.class, java.lang.Object.class, false, false, false, false, true, false, false, false, "g990", "s989" ), 
  new Field("value", com.badlogic.gdx.utils.ObjectMap.Entry.class, java.lang.Object.class, false, false, false, false, true, false, false, false, "g992", "s991" ), 
  };
  t.methods = new Method[] {
  new Method("toString", 
  com.badlogic.gdx.utils.ObjectMap.Entry.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m993"),
  };
  types.put("com.badlogic.gdx.utils.ObjectMap.Entry", t);
  
  }
  
  public void c51() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextButton";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextButton.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Button.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextButton.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("label", com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, com.badlogic.gdx.scenes.scene2d.ui.Label.class, true, false, true, false, false, false, false, false, "g995", "s994" ), 
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class, false, false, true, false, false, false, false, false, "g997", "s996" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m998"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m999"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1000"),
  new Method("getLabel", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1001"),
  new Method("getLabelCell", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1002"),
  new Method("setText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  void.class, 
  new Parameter[] {
  new Parameter("text", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1003"),
  new Method("getText", 
  com.badlogic.gdx.scenes.scene2d.ui.TextButton.class, 
  java.lang.CharSequence.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1004"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextButton", t);
  
  }
  
  public void c52() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Window";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Window.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Window.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.Window.class, com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class, false, false, true, false, false, false, false, false, "g1006", "s1005" ), 
  new Field("title", com.badlogic.gdx.scenes.scene2d.ui.Window.class, java.lang.String.class, false, false, true, false, false, false, false, false, "g1008", "s1007" ), 
  new Field("titleCache", com.badlogic.gdx.scenes.scene2d.ui.Window.class, com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, false, false, true, false, false, false, false, false, "g1010", "s1009" ), 
  new Field("isMovable", com.badlogic.gdx.scenes.scene2d.ui.Window.class, boolean.class, false, false, true, false, false, false, false, false, "g1012", "s1011" ), 
  new Field("isModal", com.badlogic.gdx.scenes.scene2d.ui.Window.class, boolean.class, false, false, true, false, false, false, false, false, "g1014", "s1013" ), 
  new Field("dragOffset", com.badlogic.gdx.scenes.scene2d.ui.Window.class, com.badlogic.gdx.math.Vector2.class, true, false, true, false, false, false, false, false, "g1016", "s1015" ), 
  new Field("dragging", com.badlogic.gdx.scenes.scene2d.ui.Window.class, boolean.class, false, false, true, false, false, false, false, false, "g1018", "s1017" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Window$WindowStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1019"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1020"),
  new Method("getTitleBarHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1021"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1022"),
  new Method("drawBackground", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1023"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1024"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1025"),
  new Method("hit", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1026"),
  new Method("setTitle", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  new Parameter("title", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1027"),
  new Method("getTitle", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1028"),
  new Method("setMovable", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  new Parameter("isMovable", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1029"),
  new Method("setModal", 
  com.badlogic.gdx.scenes.scene2d.ui.Window.class, 
  void.class, 
  new Parameter[] {
  new Parameter("isModal", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1030"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Window", t);
  
  }
  
  public void c53() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.ObjectMap.Values";
  t.clazz = com.badlogic.gdx.utils.ObjectMap.Values.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.ObjectMap.Values.class);
  tAssignables.add(java.lang.Iterable.class);
  tAssignables.add(java.util.Iterator.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("hasNext", 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1031"),
  new Method("next", 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1032"),
  new Method("iterator", 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  java.util.Iterator.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1033"),
  new Method("toArray", 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  com.badlogic.gdx.utils.Array.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1034"),
  new Method("toArray", 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", com.badlogic.gdx.utils.Array.class, "Lcom/badlogic/gdx/utils/Array;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1035"),
  };
  types.put("com.badlogic.gdx.utils.ObjectMap.Values", t);
  
  }
  
  public void c54() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.ImageButton";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Button.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("image", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, com.badlogic.gdx.scenes.scene2d.ui.Image.class, true, false, true, false, false, false, false, false, "g1037", "s1036" ), 
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, false, false, true, false, false, false, false, false, "g1039", "s1038" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1040"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1041"),
  new Method("updateImage", 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1042"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1043"),
  new Method("getImage", 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1044"),
  new Method("getImageCell", 
  com.badlogic.gdx.scenes.scene2d.ui.ImageButton.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1045"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.ImageButton", t);
  
  }
  
  public void c55() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.TextureRegion[][]";
  t.clazz = com.badlogic.gdx.graphics.g2d.TextureRegion[][].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.TextureRegion[][].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1046"),
  new Method("getClass", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1047"),
  new Method("hashCode", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1048"),
  new Method("toString", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1049"),
  new Method("finalize", 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1050"),
  };
  t.componentType = com.badlogic.gdx.graphics.g2d.TextureRegion[].class;
  types.put("com.badlogic.gdx.graphics.g2d.TextureRegion[][]", t);
  
  }
  
  public void c56() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, true, false, true, false, false, false, false, false, "g1052", "s1051" ), 
  new Field("backgroundPatch", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, true, false, false, false, false, false, "g1054", "s1053" ), 
  new Field("tableBounds", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g1056", "s1055" ), 
  new Field("scissors", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, com.badlogic.gdx.math.Rectangle.class, true, false, true, false, false, false, false, false, "g1058", "s1057" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, false, false, true, false, false, false, false, false, "g1060", "s1059" ), 
  new Field("clip", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, boolean.class, false, false, false, false, true, false, false, false, "g1062", "s1061" ), 
  new Field("isPressed", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, boolean.class, false, false, false, false, true, false, false, false, "g1064", "s1063" ), 
  };
  t.methods = new Method[] {
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1065"),
  new Method("drawBackground", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1066"),
  new Method("calculateScissors", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("transform", com.badlogic.gdx.math.Matrix4.class, "Lcom/badlogic/gdx/math/Matrix4;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1067"),
  new Method("invalidate", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1068"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1069"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1070"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1071"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1072"),
  new Method("setBackground", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("background", com.badlogic.gdx.graphics.g2d.NinePatch.class, "Lcom/badlogic/gdx/graphics/g2d/NinePatch;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1073"),
  new Method("getBackgroundPatch", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1074"),
  new Method("setClip", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("enabled", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1075"),
  new Method("setClickListener", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1076"),
  new Method("getClickListener", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1077"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1078"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1079"),
  new Method("click", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1080"),
  new Method("getRow", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  int.class, 
  new Parameter[] {
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1081"),
  new Method("getTableLayout", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1082"),
  new Method("clear", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1083"),
  new Method("register", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("widget", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1084"),
  new Method("add", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  new Parameter("text", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1085"),
  new Method("add", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1086"),
  new Method("add", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1087"),
  new Method("stack", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor[].class, "[Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, true, true, false, "m1088"),
  new Method("newTable", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1089"),
  new Method("row", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1090"),
  new Method("parse", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tableDescriptionFile", com.badlogic.gdx.files.FileHandle.class, "Lcom/badlogic/gdx/files/FileHandle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1091"),
  new Method("parse", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tableDescription", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1092"),
  new Method("columnDefaults", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  new Parameter("column", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1093"),
  new Method("defaults", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1094"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1095"),
  new Method("reset", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1096"),
  new Method("getWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1097"),
  new Method("getWidgets", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.util.List.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1098"),
  new Method("getWidgets", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.util.List.class, 
  new Parameter[] {
  new Parameter("namePrefix", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1099"),
  new Method("getCell", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1100"),
  new Method("getCell", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.esotericsoftware.tablelayout.Cell.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1101"),
  new Method("getAllCells", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.util.List.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1102"),
  new Method("getAllCells", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.util.List.class, 
  new Parameter[] {
  new Parameter("namePrefix", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1103"),
  new Method("getCells", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.util.List.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1104"),
  new Method("setWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1105"),
  new Method("size", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("width", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("height", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1106"),
  new Method("size", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("width", int.class, "I"), 
  new Parameter("height", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1107"),
  new Method("width", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("width", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1108"),
  new Method("width", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("width", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1109"),
  new Method("height", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("height", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1110"),
  new Method("height", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("height", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1111"),
  new Method("pad", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("pad", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1112"),
  new Method("pad", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("top", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("left", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("bottom", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("right", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1113"),
  new Method("pad", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("pad", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1114"),
  new Method("pad", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("top", int.class, "I"), 
  new Parameter("left", int.class, "I"), 
  new Parameter("bottom", int.class, "I"), 
  new Parameter("right", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1115"),
  new Method("padTop", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padTop", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1116"),
  new Method("padTop", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padTop", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1117"),
  new Method("padLeft", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padLeft", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1118"),
  new Method("padLeft", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padLeft", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1119"),
  new Method("padBottom", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padBottom", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1120"),
  new Method("padBottom", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padBottom", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1121"),
  new Method("padRight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padRight", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1122"),
  new Method("padRight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("padRight", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1123"),
  new Method("align", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("align", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1124"),
  new Method("align", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("value", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1125"),
  new Method("center", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1126"),
  new Method("top", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1127"),
  new Method("left", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1128"),
  new Method("bottom", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1129"),
  new Method("right", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1130"),
  new Method("debug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1131"),
  new Method("debug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("debug", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1132"),
  new Method("debug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("value", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1133"),
  new Method("getDebug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1134"),
  new Method("getHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1135"),
  new Method("getPadTop", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1136"),
  new Method("getPadLeft", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1137"),
  new Method("getPadBottom", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1138"),
  new Method("getPadRight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1139"),
  new Method("getAlign", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1140"),
  new Method("setSkin", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("skin", com.badlogic.gdx.scenes.scene2d.ui.Skin.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Skin;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1141"),
  new Method("setAssetManager", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("assetManager", com.badlogic.gdx.assets.AssetManager.class, "Lcom/badlogic/gdx/assets/AssetManager;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1142"),
  new Method("drawDebug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("stage", com.badlogic.gdx.scenes.scene2d.Stage.class, "Lcom/badlogic/gdx/scenes/scene2d/Stage;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1143"),
  new Method("drawDebug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actors", java.util.List.class, "Ljava/util/List;"), 
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1144"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table", t);
  
  }
  
  public void c57() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("font", com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g1146", "s1145" ), 
  new Field("fontColorSelected", com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1148", "s1147" ), 
  new Field("fontColorUnselected", com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1150", "s1149" ), 
  new Field("selectedPatch", com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1152", "s1151" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle", t);
  
  }
  
  public void c58() {
  Type p = new Type();
  p.name = "int";
  p.clazz = int.class;
  p.isPrimitive = true;
  types.put("int", p);
  
  }
  
  public void c59() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.TextureRegion";
  t.clazz = com.badlogic.gdx.graphics.g2d.TextureRegion.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.TextureRegion.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("texture", com.badlogic.gdx.graphics.g2d.TextureRegion.class, com.badlogic.gdx.graphics.Texture.class, false, true, false, false, false, false, false, false, "g1154", "s1153" ), 
  new Field("u", com.badlogic.gdx.graphics.g2d.TextureRegion.class, float.class, false, true, false, false, false, false, false, false, "g1156", "s1155" ), 
  new Field("v", com.badlogic.gdx.graphics.g2d.TextureRegion.class, float.class, false, true, false, false, false, false, false, false, "g1158", "s1157" ), 
  new Field("u2", com.badlogic.gdx.graphics.g2d.TextureRegion.class, float.class, false, true, false, false, false, false, false, false, "g1160", "s1159" ), 
  new Field("v2", com.badlogic.gdx.graphics.g2d.TextureRegion.class, float.class, false, true, false, false, false, false, false, false, "g1162", "s1161" ), 
  };
  t.methods = new Method[] {
  new Method("setRegion", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("texture", com.badlogic.gdx.graphics.Texture.class, "Lcom/badlogic/gdx/graphics/Texture;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1163"),
  new Method("setRegion", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  new Parameter("y", int.class, "I"), 
  new Parameter("width", int.class, "I"), 
  new Parameter("height", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1164"),
  new Method("setRegion", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("u", float.class, "F"), 
  new Parameter("v", float.class, "F"), 
  new Parameter("u2", float.class, "F"), 
  new Parameter("v2", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1165"),
  new Method("setRegion", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("region", com.badlogic.gdx.graphics.g2d.TextureRegion.class, "Lcom/badlogic/gdx/graphics/g2d/TextureRegion;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1166"),
  new Method("setRegion", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("region", com.badlogic.gdx.graphics.g2d.TextureRegion.class, "Lcom/badlogic/gdx/graphics/g2d/TextureRegion;"), 
  new Parameter("x", int.class, "I"), 
  new Parameter("y", int.class, "I"), 
  new Parameter("width", int.class, "I"), 
  new Parameter("height", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1167"),
  new Method("getTexture", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  com.badlogic.gdx.graphics.Texture.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1168"),
  new Method("setTexture", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("texture", com.badlogic.gdx.graphics.Texture.class, "Lcom/badlogic/gdx/graphics/Texture;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1169"),
  new Method("getU", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1170"),
  new Method("setU", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("u", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1171"),
  new Method("getV", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1172"),
  new Method("setV", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("v", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1173"),
  new Method("getU2", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1174"),
  new Method("setU2", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("u2", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1175"),
  new Method("getV2", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1176"),
  new Method("setV2", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("v2", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1177"),
  new Method("getRegionX", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1178"),
  new Method("setRegionX", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1179"),
  new Method("getRegionY", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1180"),
  new Method("setRegionY", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("y", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1181"),
  new Method("getRegionWidth", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1182"),
  new Method("setRegionWidth", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("width", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1183"),
  new Method("getRegionHeight", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1184"),
  new Method("setRegionHeight", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("height", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1185"),
  new Method("flip", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  new Parameter("y", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1186"),
  new Method("scroll", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  void.class, 
  new Parameter[] {
  new Parameter("xAmount", float.class, "F"), 
  new Parameter("yAmount", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1187"),
  new Method("split", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  new Parameter[] {
  new Parameter("tileWidth", int.class, "I"), 
  new Parameter("tileHeight", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1188"),
  new Method("split", 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  com.badlogic.gdx.graphics.g2d.TextureRegion[][].class, 
  new Parameter[] {
  new Parameter("texture", com.badlogic.gdx.graphics.Texture.class, "Lcom/badlogic/gdx/graphics/Texture;"), 
  new Parameter("tileWidth", int.class, "I"), 
  new Parameter("tileHeight", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1189"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.TextureRegion", t);
  
  }
  
  public void c60() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.Array";
  t.clazz = com.badlogic.gdx.utils.Array.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.Array.class);
  tAssignables.add(java.lang.Iterable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("items", com.badlogic.gdx.utils.Array.class, java.lang.Object[].class, false, false, false, false, true, false, false, false, "g1191", "s1190" ), 
  new Field("size", com.badlogic.gdx.utils.Array.class, int.class, false, false, false, false, true, false, false, false, "g1193", "s1192" ), 
  new Field("ordered", com.badlogic.gdx.utils.Array.class, boolean.class, false, false, false, false, true, false, false, false, "g1195", "s1194" ), 
  new Field("iterator", com.badlogic.gdx.utils.Array.class, com.badlogic.gdx.utils.Array.ArrayIterator.class, false, false, true, false, false, false, false, false, "g1197", "s1196" ), 
  };
  t.methods = new Method[] {
  new Method("add", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1198"),
  new Method("addAll", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", com.badlogic.gdx.utils.Array.class, "Lcom/badlogic/gdx/utils/Array;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1199"),
  new Method("addAll", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", com.badlogic.gdx.utils.Array.class, "Lcom/badlogic/gdx/utils/Array;"), 
  new Parameter("arg1", int.class, "I"), 
  new Parameter("arg2", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1200"),
  new Method("addAll", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1201"),
  new Method("addAll", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  new Parameter("arg2", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1202"),
  new Method("get", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1203"),
  new Method("set", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1204"),
  new Method("insert", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1205"),
  new Method("contains", 
  com.badlogic.gdx.utils.Array.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1206"),
  new Method("indexOf", 
  com.badlogic.gdx.utils.Array.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1207"),
  new Method("removeValue", 
  com.badlogic.gdx.utils.Array.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1208"),
  new Method("removeIndex", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1209"),
  new Method("pop", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1210"),
  new Method("peek", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1211"),
  new Method("clear", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1212"),
  new Method("shrink", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1213"),
  new Method("ensureCapacity", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object[].class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1214"),
  new Method("resize", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object[].class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1215"),
  new Method("sort", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1216"),
  new Method("sort", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.util.Comparator.class, "Ljava/util/Comparator;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1217"),
  new Method("reverse", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1218"),
  new Method("shuffle", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1219"),
  new Method("iterator", 
  com.badlogic.gdx.utils.Array.class, 
  java.util.Iterator.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1220"),
  new Method("truncate", 
  com.badlogic.gdx.utils.Array.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1221"),
  new Method("random", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1222"),
  new Method("toArray", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object[].class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1223"),
  new Method("toArray", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.Object[].class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1224"),
  new Method("toString", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1225"),
  new Method("toString", 
  com.badlogic.gdx.utils.Array.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1226"),
  };
  types.put("com.badlogic.gdx.utils.Array", t);
  
  }
  
  public void c61() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Label";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Label.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Label.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.Label.class, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class, false, false, true, false, false, false, false, false, "g1228", "s1227" ), 
  new Field("bounds", com.badlogic.gdx.scenes.scene2d.ui.Label.class, com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, true, false, true, false, false, false, false, false, "g1230", "s1229" ), 
  new Field("text", com.badlogic.gdx.scenes.scene2d.ui.Label.class, java.lang.CharSequence.class, false, false, true, false, false, false, false, false, "g1232", "s1231" ), 
  new Field("cache", com.badlogic.gdx.scenes.scene2d.ui.Label.class, com.badlogic.gdx.graphics.g2d.BitmapFontCache.class, false, false, true, false, false, false, false, false, "g1234", "s1233" ), 
  new Field("prefWidth", com.badlogic.gdx.scenes.scene2d.ui.Label.class, float.class, false, false, true, false, false, false, false, false, "g1236", "s1235" ), 
  new Field("prefHeight", com.badlogic.gdx.scenes.scene2d.ui.Label.class, float.class, false, false, true, false, false, false, false, false, "g1238", "s1237" ), 
  new Field("labelAlign", com.badlogic.gdx.scenes.scene2d.ui.Label.class, int.class, false, false, true, false, false, false, false, false, "g1240", "s1239" ), 
  new Field("lineAlign", com.badlogic.gdx.scenes.scene2d.ui.Label.class, com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, false, false, true, false, false, false, false, false, "g1242", "s1241" ), 
  new Field("wrap", com.badlogic.gdx.scenes.scene2d.ui.Label.class, boolean.class, false, false, true, false, false, false, false, false, "g1244", "s1243" ), 
  new Field("lastPrefHeight", com.badlogic.gdx.scenes.scene2d.ui.Label.class, float.class, false, false, true, false, false, false, false, false, "g1246", "s1245" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Label$LabelStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1247"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1248"),
  new Method("setText", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("text", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1249"),
  new Method("getText", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  java.lang.CharSequence.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1250"),
  new Method("getTextBounds", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1251"),
  new Method("setWrap", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("wrap", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1252"),
  new Method("setAlignment", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("wrapAlign", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1253"),
  new Method("setAlignment", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("labelAlign", int.class, "I"), 
  new Parameter("lineAlign", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1254"),
  new Method("setColor", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1255"),
  new Method("setColor", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tint", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1256"),
  new Method("setColor", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1257"),
  new Method("getColor", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1258"),
  new Method("computeBounds", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1259"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1260"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1261"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1262"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Label.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1263"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Label", t);
  
  }
  
  public void c62() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("background", com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1265", "s1264" ), 
  new Field("titleFont", com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g1267", "s1266" ), 
  new Field("titleFontColor", com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1269", "s1268" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle", t);
  
  }
  
  public void c63() {
  Type t = new Type();
  t.name = "java.lang.String[]";
  t.clazz = java.lang.String[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.String[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  java.lang.String[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1270"),
  new Method("getClass", 
  java.lang.String[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1271"),
  new Method("hashCode", 
  java.lang.String[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1272"),
  new Method("toString", 
  java.lang.String[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1273"),
  new Method("finalize", 
  java.lang.String[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1274"),
  };
  t.componentType = java.lang.String.class;
  types.put("java.lang.String[]", t);
  
  }
  
  public void c64() {
  Type p = new Type();
  p.name = "char";
  p.clazz = char.class;
  p.isPrimitive = true;
  types.put("char", p);
  
  }
  
  public void c65() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class;
  t.superClass = com.esotericsoftware.tablelayout.Toolkit.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class);
  tAssignables.add(com.esotericsoftware.tablelayout.Toolkit.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("instance", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, false, false, false, false, true, true, false, false, "g1276", "s1275" ), 
  new Field("drawDebug", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, boolean.class, false, true, false, false, false, true, false, false, "g1278", "s1277" ), 
  };
  t.methods = new Method[] {
  new Method("wrap", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  new Parameter("object", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1279"),
  new Method("newWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  new Parameter("className", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1280"),
  new Method("newInstance", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  new Parameter("className", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1281"),
  new Method("setProperty", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  void.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  new Parameter("object", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("values", java.util.List.class, "Ljava/util/List;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1282"),
  new Method("convertType", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  new Parameter("parentObject", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("memberType", java.lang.Class.class, "Ljava/lang/Class;"), 
  new Parameter("memberName", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("value", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1283"),
  new Method("newTable", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, 
  new Parameter[] {
  new Parameter("parent", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/Table;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1284"),
  new Method("getLayout", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  new Parameter[] {
  new Parameter("table", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/Table;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1285"),
  new Method("newStack", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1286"),
  new Method("addChild", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  void.class, 
  new Parameter[] {
  new Parameter("parent", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("child", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("layoutString", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1287"),
  new Method("removeChild", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  void.class, 
  new Parameter[] {
  new Parameter("parent", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("child", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1288"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  int.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1289"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  int.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1290"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  int.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1291"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  int.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1292"),
  new Method("getMaxWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  int.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1293"),
  new Method("getMaxHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  int.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1294"),
  new Method("clearDebugRectangles", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  void.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1295"),
  new Method("addDebugRectangle", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit.class, 
  void.class, 
  new Parameter[] {
  new Parameter("layout", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;"), 
  new Parameter("type", int.class, "I"), 
  new Parameter("x", int.class, "I"), 
  new Parameter("y", int.class, "I"), 
  new Parameter("w", int.class, "I"), 
  new Parameter("h", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1296"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit", t);
  
  }
  
  public void c66() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Double.class, "Ljava/lang/Double;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1297"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  java.lang.Double.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1298"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Double.class, "Ljava/lang/Double;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1299"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Double.class, "Ljava/lang/Double;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1300"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1301"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  java.lang.Double.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1302"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Double.class, "Ljava/lang/Double;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1303"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer", t);
  
  }
  
  public void c67() {
  Type p = new Type();
  p.name = "short";
  p.clazz = short.class;
  p.isPrimitive = true;
  types.put("short", p);
  
  }
  
  public void c68() {
  Type t = new Type();
  t.name = "java.lang.Double";
  t.clazz = java.lang.Double.class;
  t.superClass = java.lang.Number.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Double.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.lang.Number.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("MAX_VALUE", java.lang.Double.class, double.class, true, false, false, false, true, true, false, false, "g1305", "s1304" ), 
  new Field("MIN_VALUE", java.lang.Double.class, double.class, true, false, false, false, true, true, false, false, "g1307", "s1306" ), 
  new Field("MIN_NORMAL", java.lang.Double.class, double.class, true, false, false, false, true, true, false, false, "g1309", "s1308" ), 
  new Field("MAX_EXPONENT", java.lang.Double.class, int.class, true, false, false, false, true, true, false, false, "g1311", "s1310" ), 
  new Field("MIN_EXPONENT", java.lang.Double.class, int.class, true, false, false, false, true, true, false, false, "g1313", "s1312" ), 
  new Field("NaN", java.lang.Double.class, double.class, true, false, false, false, true, true, false, false, "g1315", "s1314" ), 
  new Field("NEGATIVE_INFINITY", java.lang.Double.class, double.class, true, false, false, false, true, true, false, false, "g1317", "s1316" ), 
  new Field("POSITIVE_INFINITY", java.lang.Double.class, double.class, true, false, false, false, true, true, false, false, "g1319", "s1318" ), 
  new Field("SIZE", java.lang.Double.class, int.class, true, false, false, false, true, true, false, false, "g1321", "s1320" ), 
  new Field("value", java.lang.Double.class, double.class, true, false, true, false, false, false, true, false, "g1323", "s1322" ), 
  };
  t.methods = new Method[] {
  new Method("compare", 
  java.lang.Double.class, 
  int.class, 
  new Parameter[] {
  new Parameter("x", double.class, "D"), 
  new Parameter("arg1", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1324"),
  new Method("hashCode", 
  java.lang.Double.class, 
  int.class, 
  new Parameter[] {
  new Parameter("d", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1325"),
  new Method("hashCode", 
  java.lang.Double.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1326"),
  new Method("isInfinite", 
  java.lang.Double.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1327"),
  new Method("isInfinite", 
  java.lang.Double.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1328"),
  new Method("isNaN", 
  java.lang.Double.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1329"),
  new Method("isNaN", 
  java.lang.Double.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1330"),
  new Method("parseDouble", 
  java.lang.Double.class, 
  double.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1331"),
  new Method("toString", 
  java.lang.Double.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("b", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1332"),
  new Method("toString", 
  java.lang.Double.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1333"),
  new Method("valueOf", 
  java.lang.Double.class, 
  java.lang.Double.class, 
  new Parameter[] {
  new Parameter("d", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1334"),
  new Method("valueOf", 
  java.lang.Double.class, 
  java.lang.Double.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1335"),
  new Method("byteValue", 
  java.lang.Double.class, 
  byte.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1336"),
  new Method("compareTo", 
  java.lang.Double.class, 
  int.class, 
  new Parameter[] {
  new Parameter("b", java.lang.Double.class, "Ljava/lang/Double;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1337"),
  new Method("doubleValue", 
  java.lang.Double.class, 
  double.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1338"),
  new Method("equals", 
  java.lang.Double.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1339"),
  new Method("floatValue", 
  java.lang.Double.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1340"),
  new Method("intValue", 
  java.lang.Double.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1341"),
  new Method("longValue", 
  java.lang.Double.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1342"),
  new Method("shortValue", 
  java.lang.Double.class, 
  short.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1343"),
  };
  types.put("java.lang.Double", t);
  
  }
  
  public void c69() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Skin";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Skin.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Skin.class);
  tAssignables.add(com.badlogic.gdx.utils.Disposable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("resources", com.badlogic.gdx.scenes.scene2d.ui.Skin.class, com.badlogic.gdx.utils.ObjectMap.class, false, true, false, false, false, false, false, false, "g1345", "s1344" ), 
  new Field("styles", com.badlogic.gdx.scenes.scene2d.ui.Skin.class, com.badlogic.gdx.utils.ObjectMap.class, false, true, false, false, false, false, false, false, "g1347", "s1346" ), 
  new Field("texture", com.badlogic.gdx.scenes.scene2d.ui.Skin.class, com.badlogic.gdx.graphics.Texture.class, false, true, false, false, false, false, false, false, "g1349", "s1348" ), 
  };
  t.methods = new Method[] {
  new Method("load", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  new Parameter("skinFile", com.badlogic.gdx.files.FileHandle.class, "Lcom/badlogic/gdx/files/FileHandle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1350"),
  new Method("addResource", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("resource", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1351"),
  new Method("getResource", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1352"),
  new Method("hasResource", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1353"),
  new Method("getPatch", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1354"),
  new Method("getColor", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1355"),
  new Method("getFont", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1356"),
  new Method("getRegion", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1357"),
  new Method("addStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("style", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1358"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1359"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1360"),
  new Method("hasStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1361"),
  new Method("findStyleName", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("style", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1362"),
  new Method("setEnabled", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("enabled", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1363"),
  new Method("newTintedPatch", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  new Parameter("patchName", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("colorName", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1364"),
  new Method("newTintedPatch", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  new Parameter("patchName", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1365"),
  new Method("newTintedRegion", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  new Parameter("regionName", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("colorName", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1366"),
  new Method("newTintedRegion", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  new Parameter("regionName", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("color", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1367"),
  new Method("findMethod", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gwtref.client.Method.class, 
  new Parameter[] {
  new Parameter("type", java.lang.Class.class, "Ljava/lang/Class;"), 
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1368"),
  new Method("setTexture", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  new Parameter("texture", com.badlogic.gdx.graphics.Texture.class, "Lcom/badlogic/gdx/graphics/Texture;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1369"),
  new Method("getTexture", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.graphics.Texture.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1370"),
  new Method("dispose", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1371"),
  new Method("save", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  void.class, 
  new Parameter[] {
  new Parameter("skinFile", com.badlogic.gdx.files.FileHandle.class, "Lcom/badlogic/gdx/files/FileHandle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1372"),
  new Method("getJsonLoader", 
  com.badlogic.gdx.scenes.scene2d.ui.Skin.class, 
  com.badlogic.gdx.utils.Json.class, 
  new Parameter[] {
  new Parameter("skinFile", com.badlogic.gdx.files.FileHandle.class, "Lcom/badlogic/gdx/files/FileHandle;"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1373"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Skin", t);
  
  }
  
  public void c70() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class;
  t.superClass = com.esotericsoftware.tablelayout.BaseTableLayout.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class);
  tAssignables.add(com.esotericsoftware.tablelayout.BaseTableLayout.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("skin", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, com.badlogic.gdx.scenes.scene2d.ui.Skin.class, false, false, false, false, true, false, false, false, "g1375", "s1374" ), 
  new Field("assetManager", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, com.badlogic.gdx.assets.AssetManager.class, false, false, false, false, true, false, false, false, "g1377", "s1376" ), 
  new Field("debugRects", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, com.badlogic.gdx.utils.Array.class, false, true, false, false, false, false, false, false, "g1379", "s1378" ), 
  new Field("debugRenderer", com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, com.badlogic.gdx.graphics.glutils.ImmediateModeRenderer.class, false, false, true, false, false, false, false, false, "g1381", "s1380" ), 
  };
  t.methods = new Method[] {
  new Method("register", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1382"),
  new Method("getWidget", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  com.badlogic.gdx.scenes.scene2d.Actor.class, 
  new Parameter[] {
  new Parameter("name", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1383"),
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1384"),
  new Method("invalidateHierarchy", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1385"),
  new Method("toStageCoordinates", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("point", com.badlogic.gdx.math.Vector2.class, "Lcom/badlogic/gdx/math/Vector2;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1386"),
  new Method("drawDebug", 
  com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1387"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout", t);
  
  }
  
  public void c71() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("srcX", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1389", "s1388" ), 
  new Field("srcY", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1391", "s1390" ), 
  new Field("width", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1393", "s1392" ), 
  new Field("height", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1395", "s1394" ), 
  new Field("u", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, float.class, false, false, false, false, true, false, false, false, "g1397", "s1396" ), 
  new Field("v", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, float.class, false, false, false, false, true, false, false, false, "g1399", "s1398" ), 
  new Field("u2", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, float.class, false, false, false, false, true, false, false, false, "g1401", "s1400" ), 
  new Field("v2", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, float.class, false, false, false, false, true, false, false, false, "g1403", "s1402" ), 
  new Field("xoffset", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1405", "s1404" ), 
  new Field("yoffset", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1407", "s1406" ), 
  new Field("xadvance", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, int.class, false, false, false, false, true, false, false, false, "g1409", "s1408" ), 
  new Field("kerning", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, byte[][].class, false, false, false, false, true, false, false, false, "g1411", "s1410" ), 
  };
  t.methods = new Method[] {
  new Method("getKerning", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, 
  int.class, 
  new Parameter[] {
  new Parameter("ch", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1412"),
  new Method("setKerning", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, 
  void.class, 
  new Parameter[] {
  new Parameter("ch", int.class, "I"), 
  new Parameter("value", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1413"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph", t);
  
  }
  
  public void c72() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("acceptChar", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("textField", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;"), 
  new Parameter("key", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1414"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter", t);
  
  }
  
  public void c73() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("checkboxOn", com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, false, false, true, false, false, false, "g1416", "s1415" ), 
  new Field("checkboxOff", com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, false, false, true, false, false, false, "g1418", "s1417" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle", t);
  
  }
  
  public void c74() {
  Type t = new Type();
  t.name = "int[]";
  t.clazz = int[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(int[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  int[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1419"),
  new Method("getClass", 
  int[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1420"),
  new Method("hashCode", 
  int[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1421"),
  new Method("toString", 
  int[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1422"),
  new Method("finalize", 
  int[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1423"),
  };
  t.componentType = int.class;
  types.put("int[]", t);
  
  }
  
  public void c75() {
  Type t = new Type();
  t.name = "java.lang.Byte";
  t.clazz = java.lang.Byte.class;
  t.superClass = java.lang.Number.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Byte.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.lang.Number.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("MIN_VALUE", java.lang.Byte.class, byte.class, true, false, false, false, true, true, false, false, "g1425", "s1424" ), 
  new Field("MAX_VALUE", java.lang.Byte.class, byte.class, true, false, false, false, true, true, false, false, "g1427", "s1426" ), 
  new Field("SIZE", java.lang.Byte.class, int.class, true, false, false, false, true, true, false, false, "g1429", "s1428" ), 
  new Field("value", java.lang.Byte.class, byte.class, true, false, true, false, false, false, true, false, "g1431", "s1430" ), 
  };
  t.methods = new Method[] {
  new Method("decode", 
  java.lang.Byte.class, 
  java.lang.Byte.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1432"),
  new Method("hashCode", 
  java.lang.Byte.class, 
  int.class, 
  new Parameter[] {
  new Parameter("b", byte.class, "B"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1433"),
  new Method("hashCode", 
  java.lang.Byte.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1434"),
  new Method("parseByte", 
  java.lang.Byte.class, 
  byte.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1435"),
  new Method("parseByte", 
  java.lang.Byte.class, 
  byte.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1436"),
  new Method("toString", 
  java.lang.Byte.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("b", byte.class, "B"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1437"),
  new Method("toString", 
  java.lang.Byte.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1438"),
  new Method("valueOf", 
  java.lang.Byte.class, 
  java.lang.Byte.class, 
  new Parameter[] {
  new Parameter("b", byte.class, "B"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1439"),
  new Method("valueOf", 
  java.lang.Byte.class, 
  java.lang.Byte.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1440"),
  new Method("valueOf", 
  java.lang.Byte.class, 
  java.lang.Byte.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1441"),
  new Method("byteValue", 
  java.lang.Byte.class, 
  byte.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1442"),
  new Method("compareTo", 
  java.lang.Byte.class, 
  int.class, 
  new Parameter[] {
  new Parameter("b", java.lang.Byte.class, "Ljava/lang/Byte;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1443"),
  new Method("doubleValue", 
  java.lang.Byte.class, 
  double.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1444"),
  new Method("equals", 
  java.lang.Byte.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1445"),
  new Method("floatValue", 
  java.lang.Byte.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1446"),
  new Method("intValue", 
  java.lang.Byte.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1447"),
  new Method("longValue", 
  java.lang.Byte.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1448"),
  new Method("shortValue", 
  java.lang.Byte.class, 
  short.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1449"),
  };
  types.put("java.lang.Byte", t);
  
  }
  
  public void c76() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.ObjectMap.Keys";
  t.clazz = com.badlogic.gdx.utils.ObjectMap.Keys.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.ObjectMap.Keys.class);
  tAssignables.add(java.lang.Iterable.class);
  tAssignables.add(java.util.Iterator.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("hasNext", 
  com.badlogic.gdx.utils.ObjectMap.Keys.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1450"),
  new Method("next", 
  com.badlogic.gdx.utils.ObjectMap.Keys.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1451"),
  new Method("iterator", 
  com.badlogic.gdx.utils.ObjectMap.Keys.class, 
  java.util.Iterator.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1452"),
  new Method("toArray", 
  com.badlogic.gdx.utils.ObjectMap.Keys.class, 
  com.badlogic.gdx.utils.Array.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1453"),
  };
  types.put("com.badlogic.gdx.utils.ObjectMap.Keys", t);
  
  }
  
  public void c77() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("imagePath", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, java.lang.String.class, false, false, false, false, true, false, false, false, "g1455", "s1454" ), 
  new Field("fontFile", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, com.badlogic.gdx.files.FileHandle.class, false, false, false, false, true, false, false, false, "g1457", "s1456" ), 
  new Field("flipped", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, boolean.class, false, false, false, false, true, false, false, false, "g1459", "s1458" ), 
  new Field("lineHeight", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1461", "s1460" ), 
  new Field("capHeight", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1463", "s1462" ), 
  new Field("ascent", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1465", "s1464" ), 
  new Field("descent", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1467", "s1466" ), 
  new Field("down", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1469", "s1468" ), 
  new Field("scaleX", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1471", "s1470" ), 
  new Field("scaleY", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1473", "s1472" ), 
  new Field("glyphs", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][].class, true, false, false, false, true, false, false, false, "g1475", "s1474" ), 
  new Field("spaceWidth", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1477", "s1476" ), 
  new Field("xHeight", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, float.class, false, false, false, false, true, false, false, false, "g1479", "s1478" ), 
  };
  t.methods = new Method[] {
  new Method("setGlyph", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, 
  void.class, 
  new Parameter[] {
  new Parameter("ch", int.class, "I"), 
  new Parameter("glyph", com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$Glyph;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1480"),
  new Method("getFirstGlyph", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1481"),
  new Method("getGlyph", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph.class, 
  new Parameter[] {
  new Parameter("ch", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1482"),
  new Method("getImagePath", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1483"),
  new Method("getFontFile", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, 
  com.badlogic.gdx.files.FileHandle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1484"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData", t);
  
  }
  
  public void c78() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("width", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, float.class, false, false, false, false, true, false, false, false, "g1486", "s1485" ), 
  new Field("height", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, float.class, false, false, false, false, true, false, false, false, "g1488", "s1487" ), 
  };
  t.methods = new Method[] {
  new Method("set", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  void.class, 
  new Parameter[] {
  new Parameter("bounds", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1489"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds", t);
  
  }
  
  public void c79() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Float.class, "Ljava/lang/Float;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1490"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  java.lang.Float.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1491"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Float.class, "Ljava/lang/Float;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1492"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Float.class, "Ljava/lang/Float;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1493"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1494"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  java.lang.Float.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1495"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Float.class, "Ljava/lang/Float;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1496"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer", t);
  
  }
  
  public void c80() {
  Type t = new Type();
  t.name = "java.util.ArrayList";
  t.clazz = java.util.ArrayList.class;
  t.superClass = java.util.AbstractList.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.util.ArrayList.class);
  tAssignables.add(java.util.List.class);
  tAssignables.add(java.util.Collection.class);
  tAssignables.add(java.lang.Iterable.class);
  tAssignables.add(java.lang.Cloneable.class);
  tAssignables.add(java.util.RandomAccess.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.util.AbstractList.class);
  tAssignables.add(java.util.AbstractCollection.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("array", java.util.ArrayList.class, java.lang.Object[].class, false, false, true, false, false, false, true, false, "g1498", "s1497" ), 
  new Field("exposeElement", java.util.ArrayList.class, java.lang.Object.class, false, false, true, false, false, false, false, false, "g1500", "s1499" ), 
  new Field("size", java.util.ArrayList.class, int.class, false, false, true, false, false, false, false, false, "g1502", "s1501" ), 
  };
  t.methods = new Method[] {
  new Method("setCapacity", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1503"),
  new Method("splice", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  new Parameter("arg2", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1504"),
  new Method("splice", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  new Parameter("arg2", int.class, "I"), 
  new Parameter("arg3", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1505"),
  new Method("spliceArray", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  new Parameter("arg2", int.class, "I"), 
  new Parameter("arg3", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1506"),
  new Method("add", 
  java.util.ArrayList.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1507"),
  new Method("add", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1508"),
  new Method("addAll", 
  java.util.ArrayList.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.util.Collection.class, "Ljava/util/Collection;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1509"),
  new Method("addAll", 
  java.util.ArrayList.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.util.Collection.class, "Ljava/util/Collection;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1510"),
  new Method("clear", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1511"),
  new Method("clone", 
  java.util.ArrayList.class, 
  java.lang.Object.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1512"),
  new Method("contains", 
  java.util.ArrayList.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1513"),
  new Method("ensureCapacity", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1514"),
  new Method("get", 
  java.util.ArrayList.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1515"),
  new Method("indexOf", 
  java.util.ArrayList.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1516"),
  new Method("indexOf", 
  java.util.ArrayList.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m1517"),
  new Method("isEmpty", 
  java.util.ArrayList.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1518"),
  new Method("lastIndexOf", 
  java.util.ArrayList.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1519"),
  new Method("lastIndexOf", 
  java.util.ArrayList.class, 
  int.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", int.class, "I"), 
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m1520"),
  new Method("remove", 
  java.util.ArrayList.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1521"),
  new Method("remove", 
  java.util.ArrayList.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1522"),
  new Method("set", 
  java.util.ArrayList.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1523"),
  new Method("size", 
  java.util.ArrayList.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1524"),
  new Method("toArray", 
  java.util.ArrayList.class, 
  java.lang.Object[].class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1525"),
  new Method("toArray", 
  java.util.ArrayList.class, 
  java.lang.Object[].class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1526"),
  new Method("trimToSize", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1527"),
  new Method("removeRange", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  new Parameter("arg1", int.class, "I"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1528"),
  new Method("capacity", 
  java.util.ArrayList.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m1529"),
  new Method("setSize", 
  java.util.ArrayList.class, 
  void.class, 
  new Parameter[] {
  new Parameter("arg0", int.class, "I"), 
  }, 
  false, false, false, true, false, false, false, false, false, true, false, "m1530"),
  };
  types.put("java.util.ArrayList", t);
  
  }
  
  public void c81() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("scissors", com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, com.badlogic.gdx.utils.Array.class, false, false, true, false, false, true, false, false, "g1532", "s1531" ), 
  new Field("tmp", com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, com.badlogic.gdx.math.Vector3.class, false, true, false, false, false, true, false, false, "g1534", "s1533" ), 
  new Field("viewport", com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, com.badlogic.gdx.math.Rectangle.class, true, true, false, false, false, true, false, false, "g1536", "s1535" ), 
  };
  t.methods = new Method[] {
  new Method("pushScissors", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("scissor", com.badlogic.gdx.math.Rectangle.class, "Lcom/badlogic/gdx/math/Rectangle;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1537"),
  new Method("popScissors", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1538"),
  new Method("fix", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, 
  void.class, 
  new Parameter[] {
  new Parameter("rect", com.badlogic.gdx.math.Rectangle.class, "Lcom/badlogic/gdx/math/Rectangle;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1539"),
  new Method("calculateScissors", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, 
  void.class, 
  new Parameter[] {
  new Parameter("camera", com.badlogic.gdx.graphics.Camera.class, "Lcom/badlogic/gdx/graphics/Camera;"), 
  new Parameter("batchTransform", com.badlogic.gdx.math.Matrix4.class, "Lcom/badlogic/gdx/math/Matrix4;"), 
  new Parameter("area", com.badlogic.gdx.math.Rectangle.class, "Lcom/badlogic/gdx/math/Rectangle;"), 
  new Parameter("scissor", com.badlogic.gdx.math.Rectangle.class, "Lcom/badlogic/gdx/math/Rectangle;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1540"),
  new Method("getViewport", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, 
  com.badlogic.gdx.math.Rectangle.class, 
  new Parameter[] {
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1541"),
  new Method("toWindowCoordinates", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack.class, 
  void.class, 
  new Parameter[] {
  new Parameter("camera", com.badlogic.gdx.graphics.Camera.class, "Lcom/badlogic/gdx/graphics/Camera;"), 
  new Parameter("transformMatrix", com.badlogic.gdx.math.Matrix4.class, "Lcom/badlogic/gdx/math/Matrix4;"), 
  new Parameter("point", com.badlogic.gdx.math.Vector2.class, "Lcom/badlogic/gdx/math/Vector2;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1542"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack", t);
  
  }
  
  public void c82() {
  Type p = new Type();
  p.name = "boolean";
  p.clazz = boolean.class;
  p.isPrimitive = true;
  types.put("boolean", p);
  
  }
  
  public void c83() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.ObjectMap.Entries";
  t.clazz = com.badlogic.gdx.utils.ObjectMap.Entries.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.ObjectMap.Entries.class);
  tAssignables.add(java.lang.Iterable.class);
  tAssignables.add(java.util.Iterator.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("entry", com.badlogic.gdx.utils.ObjectMap.Entries.class, com.badlogic.gdx.utils.ObjectMap.Entry.class, false, true, false, false, false, false, false, false, "g1544", "s1543" ), 
  };
  t.methods = new Method[] {
  new Method("next", 
  com.badlogic.gdx.utils.ObjectMap.Entries.class, 
  com.badlogic.gdx.utils.ObjectMap.Entry.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1545"),
  new Method("hasNext", 
  com.badlogic.gdx.utils.ObjectMap.Entries.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1546"),
  new Method("iterator", 
  com.badlogic.gdx.utils.ObjectMap.Entries.class, 
  java.util.Iterator.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1547"),
  };
  types.put("com.badlogic.gdx.utils.ObjectMap.Entries", t);
  
  }
  
  public void c84() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class;
  t.superClass = java.lang.Enum.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class);
  tAssignables.add(java.lang.Enum.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isEnum = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("LEFT", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, true, false, false, false, true, true, false, false, "g1549", "s1548" ), 
  new Field("CENTER", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, true, false, false, false, true, true, false, false, "g1551", "s1550" ), 
  new Field("RIGHT", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, true, false, false, false, true, true, false, false, "g1553", "s1552" ), 
  };
  t.methods = new Method[] {
  new Method("values", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class, 
  new Parameter[] {
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1554"),
  new Method("valueOf", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1555"),
  };
  t.enumConstants = new Object[3];
  t.enumConstants[0] = com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.LEFT;
  t.enumConstants[1] = com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.CENTER;
  t.enumConstants[2] = com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.RIGHT;
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment", t);
  
  }
  
  public void c85() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.class);
  tAssignables.add(com.badlogic.gdx.utils.Disposable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("LOG2_PAGE_SIZE", com.badlogic.gdx.graphics.g2d.BitmapFont.class, int.class, true, false, true, false, false, true, false, false, "g1557", "s1556" ), 
  new Field("PAGE_SIZE", com.badlogic.gdx.graphics.g2d.BitmapFont.class, int.class, true, false, true, false, false, true, false, false, "g1559", "s1558" ), 
  new Field("PAGES", com.badlogic.gdx.graphics.g2d.BitmapFont.class, int.class, true, false, true, false, false, true, false, false, "g1561", "s1560" ), 
  new Field("xChars", com.badlogic.gdx.graphics.g2d.BitmapFont.class, char[].class, true, false, false, false, true, true, false, false, "g1563", "s1562" ), 
  new Field("capChars", com.badlogic.gdx.graphics.g2d.BitmapFont.class, char[].class, true, false, false, false, true, true, false, false, "g1565", "s1564" ), 
  new Field("region", com.badlogic.gdx.graphics.g2d.BitmapFont.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, true, false, false, false, false, false, false, "g1567", "s1566" ), 
  new Field("textBounds", com.badlogic.gdx.graphics.g2d.BitmapFont.class, com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, true, false, true, false, false, false, false, false, "g1569", "s1568" ), 
  new Field("color", com.badlogic.gdx.graphics.g2d.BitmapFont.class, float.class, false, false, true, false, false, false, false, false, "g1571", "s1570" ), 
  new Field("tempColor", com.badlogic.gdx.graphics.g2d.BitmapFont.class, com.badlogic.gdx.graphics.Color.class, false, false, true, false, false, false, false, false, "g1573", "s1572" ), 
  new Field("flipped", com.badlogic.gdx.graphics.g2d.BitmapFont.class, boolean.class, false, false, true, false, false, false, false, false, "g1575", "s1574" ), 
  new Field("integer", com.badlogic.gdx.graphics.g2d.BitmapFont.class, boolean.class, false, false, true, false, false, false, false, false, "g1577", "s1576" ), 
  new Field("data", com.badlogic.gdx.graphics.g2d.BitmapFont.class, com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, true, true, false, false, false, false, false, false, "g1579", "s1578" ), 
  new Field("ownsTexture", com.badlogic.gdx.graphics.g2d.BitmapFont.class, boolean.class, false, false, true, false, false, false, false, false, "g1581", "s1580" ), 
  };
  t.methods = new Method[] {
  new Method("load", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("data", com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$BitmapFontData;"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1582"),
  new Method("draw", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1583"),
  new Method("draw", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1584"),
  new Method("drawMultiLine", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1585"),
  new Method("drawMultiLine", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("alignmentWidth", float.class, "F"), 
  new Parameter("alignment", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1586"),
  new Method("drawWrapped", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("wrapWidth", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1587"),
  new Method("drawWrapped", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("spriteBatch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("wrapWidth", float.class, "F"), 
  new Parameter("alignment", com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1588"),
  new Method("getBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1589"),
  new Method("getBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("textBounds", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1590"),
  new Method("getBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1591"),
  new Method("getBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  new Parameter("textBounds", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1592"),
  new Method("getMultiLineBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1593"),
  new Method("getMultiLineBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("textBounds", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1594"),
  new Method("getWrappedBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("wrapWidth", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1595"),
  new Method("getWrappedBounds", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("wrapWidth", float.class, "F"), 
  new Parameter("textBounds", com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds.class, "Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1596"),
  new Method("computeGlyphAdvancesAndPositions", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("glyphAdvances", com.badlogic.gdx.utils.FloatArray.class, "Lcom/badlogic/gdx/utils/FloatArray;"), 
  new Parameter("glyphPositions", com.badlogic.gdx.utils.FloatArray.class, "Lcom/badlogic/gdx/utils/FloatArray;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1597"),
  new Method("computeVisibleGlyphs", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  int.class, 
  new Parameter[] {
  new Parameter("str", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  new Parameter("availableWidth", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1598"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("color", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1599"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("tint", com.badlogic.gdx.graphics.Color.class, "Lcom/badlogic/gdx/graphics/Color;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1600"),
  new Method("setColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("r", float.class, "F"), 
  new Parameter("g", float.class, "F"), 
  new Parameter("b", float.class, "F"), 
  new Parameter("a", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1601"),
  new Method("getColor", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.Color.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1602"),
  new Method("setScale", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("scaleX", float.class, "F"), 
  new Parameter("scaleY", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1603"),
  new Method("setScale", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("scaleXY", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1604"),
  new Method("scale", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("amount", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1605"),
  new Method("getScaleX", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1606"),
  new Method("getScaleY", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1607"),
  new Method("getRegion", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1608"),
  new Method("getLineHeight", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1609"),
  new Method("getSpaceWidth", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1610"),
  new Method("getXHeight", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1611"),
  new Method("getCapHeight", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1612"),
  new Method("getAscent", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1613"),
  new Method("getDescent", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1614"),
  new Method("isFlipped", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1615"),
  new Method("dispose", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1616"),
  new Method("setFixedWidthGlyphs", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("glyphs", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1617"),
  new Method("containsCharacter", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("character", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1618"),
  new Method("setUseIntegerPositions", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  void.class, 
  new Parameter[] {
  new Parameter("use", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1619"),
  new Method("usesIntegerPositions", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1620"),
  new Method("getData", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1621"),
  new Method("indexOf", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  int.class, 
  new Parameter[] {
  new Parameter("text", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("ch", char.class, "C"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1622"),
  new Method("isWhitespace", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1623"),
  };
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont", t);
  
  }
  
  public void c86() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("font", com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g1625", "s1624" ), 
  new Field("fontColor", com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1627", "s1626" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle", t);
  
  }
  
  public void c87() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("down", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1629", "s1628" ), 
  new Field("up", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1631", "s1630" ), 
  new Field("checked", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1633", "s1632" ), 
  new Field("pressedOffsetX", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, float.class, false, false, false, false, true, false, false, false, "g1635", "s1634" ), 
  new Field("pressedOffsetY", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, float.class, false, false, false, false, true, false, false, false, "g1637", "s1636" ), 
  new Field("unpressedOffsetX", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, float.class, false, false, false, false, true, false, false, false, "g1639", "s1638" ), 
  new Field("unpressedOffsetY", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, float.class, false, false, false, false, true, false, false, false, "g1641", "s1640" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle", t);
  
  }
  
  public void c88() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("getContents", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m1642"),
  new Method("setContents", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class, 
  void.class, 
  new Parameter[] {
  new Parameter("content", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m1643"),
  new Method("getDefaultClipboard", 
  com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class, 
  com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard.class, 
  new Parameter[] {
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1644"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard", t);
  
  }
  
  public void c89() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Character.class, "Ljava/lang/Character;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1645"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  java.lang.Character.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1646"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Character.class, "Ljava/lang/Character;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1647"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Character.class, "Ljava/lang/Character;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1648"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1649"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  java.lang.Character.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1650"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Character.class, "Ljava/lang/Character;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1651"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer", t);
  
  }
  
  public void c90() {
  Type t = new Type();
  t.name = "java.lang.String";
  t.clazz = java.lang.String.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.String.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.lang.CharSequence.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("CASE_INSENSITIVE_ORDER", java.lang.String.class, java.util.Comparator.class, true, false, false, false, true, true, false, false, "g1653", "s1652" ), 
  new Field("CHARSET_8859_1", java.lang.String.class, java.lang.String.class, true, false, true, false, false, true, false, false, "g1655", "s1654" ), 
  new Field("CHARSET_LATIN1", java.lang.String.class, java.lang.String.class, true, false, true, false, false, true, false, false, "g1657", "s1656" ), 
  new Field("CHARSET_UTF8", java.lang.String.class, java.lang.String.class, true, false, true, false, false, true, false, false, "g1659", "s1658" ), 
  };
  t.methods = new Method[] {
  new Method("copyValueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("v", char[].class, "[C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1660"),
  new Method("copyValueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("v", char[].class, "[C"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("count", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1661"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", boolean.class, "Z"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1662"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1663"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("count", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1664"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1665"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", double.class, "D"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1666"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1667"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1668"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", long.class, "J"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1669"),
  new Method("valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1670"),
  new Method("__checkBounds", 
  java.lang.String.class, 
  void.class, 
  new Parameter[] {
  new Parameter("legalCount", int.class, "I"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1671"),
  new Method("__createArray", 
  java.lang.String.class, 
  java.lang.String[].class, 
  new Parameter[] {
  new Parameter("numElements", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1672"),
  new Method("__translateReplaceString", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("replaceStr", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1673"),
  new Method("__valueOf", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", char[].class, "[C"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("end", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1674"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1675"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1676"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  new Parameter("ofs", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1677"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  new Parameter("ofs", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  new Parameter("charset", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1678"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  new Parameter("charsetName", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1679"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", char[].class, "[C"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1680"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("value", char[].class, "[C"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("count", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1681"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("codePoints", int[].class, "[I"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("count", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1682"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1683"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("sb", java.lang.StringBuffer.class, "Ljava/lang/StringBuffer;"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1684"),
  new Method("_String", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("sb", java.lang.StringBuilder.class, "Ljava/lang/StringBuilder;"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m1685"),
  new Method("__equals", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("me", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1686"),
  new Method("compareTo", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("thisStr", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("otherStr", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1687"),
  new Method("compareTo", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1688"),
  new Method("encodeUtf8", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  new Parameter("ofs", int.class, "I"), 
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1689"),
  new Method("fromCharCode", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("ch", char.class, "C"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1690"),
  new Method("fromCodePoint", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1691"),
  new Method("getBytesLatin1", 
  java.lang.String.class, 
  byte[].class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1692"),
  new Method("getBytesUtf8", 
  java.lang.String.class, 
  byte[].class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1693"),
  new Method("latin1ToString", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  new Parameter("ofs", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1694"),
  new Method("regionMatches", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("thisStr", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("ignoreCase", boolean.class, "Z"), 
  new Parameter("toffset", int.class, "I"), 
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("ooffset", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1695"),
  new Method("regionMatches", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("ignoreCase", boolean.class, "Z"), 
  new Parameter("toffset", int.class, "I"), 
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("ooffset", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1696"),
  new Method("regionMatches", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("toffset", int.class, "I"), 
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("ooffset", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1697"),
  new Method("utf8ToString", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("bytes", byte[].class, "[B"), 
  new Parameter("ofs", int.class, "I"), 
  new Parameter("len", int.class, "I"), 
  }, 
  false, false, true, false, true, false, false, false, false, true, false, "m1698"),
  new Method("charAt", 
  java.lang.String.class, 
  char.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1699"),
  new Method("codePointAt", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1700"),
  new Method("codePointBefore", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1701"),
  new Method("codePointCount", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("beginIndex", int.class, "I"), 
  new Parameter("endIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1702"),
  new Method("compareToIgnoreCase", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1703"),
  new Method("concat", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1704"),
  new Method("contains", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("s", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1705"),
  new Method("contentEquals", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("cs", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1706"),
  new Method("contentEquals", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("sb", java.lang.StringBuffer.class, "Ljava/lang/StringBuffer;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1707"),
  new Method("endsWith", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("suffix", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1708"),
  new Method("equals", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1709"),
  new Method("equalsIgnoreCase", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1710"),
  new Method("getBytes", 
  java.lang.String.class, 
  byte[].class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1711"),
  new Method("getBytes", 
  java.lang.String.class, 
  byte[].class, 
  new Parameter[] {
  new Parameter("charSet", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1712"),
  new Method("getChars", 
  java.lang.String.class, 
  void.class, 
  new Parameter[] {
  new Parameter("srcBegin", int.class, "I"), 
  new Parameter("srcEnd", int.class, "I"), 
  new Parameter("dst", char[].class, "[C"), 
  new Parameter("dstBegin", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1713"),
  new Method("hashCode", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1714"),
  new Method("indexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1715"),
  new Method("indexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  new Parameter("startIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1716"),
  new Method("indexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1717"),
  new Method("indexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("startIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1718"),
  new Method("intern", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1719"),
  new Method("isEmpty", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1720"),
  new Method("lastIndexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1721"),
  new Method("lastIndexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  new Parameter("startIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1722"),
  new Method("lastIndexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1723"),
  new Method("lastIndexOf", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("str", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1724"),
  new Method("length", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1725"),
  new Method("matches", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("regex", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1726"),
  new Method("offsetByCodePoints", 
  java.lang.String.class, 
  int.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  new Parameter("codePointOffset", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1727"),
  new Method("replace", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("from", char.class, "C"), 
  new Parameter("to", char.class, "C"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1728"),
  new Method("replace", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("from", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("to", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1729"),
  new Method("replaceAll", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("regex", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("replace", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1730"),
  new Method("replaceFirst", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("regex", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("replace", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1731"),
  new Method("split", 
  java.lang.String.class, 
  java.lang.String[].class, 
  new Parameter[] {
  new Parameter("regex", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1732"),
  new Method("split", 
  java.lang.String.class, 
  java.lang.String[].class, 
  new Parameter[] {
  new Parameter("regex", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("maxMatch", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1733"),
  new Method("startsWith", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("prefix", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1734"),
  new Method("startsWith", 
  java.lang.String.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("prefix", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("toffset", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1735"),
  new Method("subSequence", 
  java.lang.String.class, 
  java.lang.CharSequence.class, 
  new Parameter[] {
  new Parameter("beginIndex", int.class, "I"), 
  new Parameter("endIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1736"),
  new Method("substring", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("beginIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1737"),
  new Method("substring", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("beginIndex", int.class, "I"), 
  new Parameter("endIndex", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1738"),
  new Method("toCharArray", 
  java.lang.String.class, 
  char[].class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1739"),
  new Method("toLowerCase", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1740"),
  new Method("toString", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1741"),
  new Method("toUpperCase", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1742"),
  new Method("trim", 
  java.lang.String.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1743"),
  };
  types.put("java.lang.String", t);
  
  }
  
  public void c91() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("buttons", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, com.badlogic.gdx.utils.Array.class, true, false, true, false, false, false, false, false, "g1745", "s1744" ), 
  new Field("checkedButtons", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, com.badlogic.gdx.utils.Array.class, false, false, true, false, false, false, false, false, "g1747", "s1746" ), 
  new Field("minCheckCount", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, int.class, false, false, true, false, false, false, false, false, "g1749", "s1748" ), 
  new Field("maxCheckCount", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, int.class, false, false, true, false, false, false, false, false, "g1751", "s1750" ), 
  new Field("uncheckLast", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, boolean.class, false, false, true, false, false, false, false, false, "g1753", "s1752" ), 
  new Field("lastChecked", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, com.badlogic.gdx.scenes.scene2d.ui.Button.class, false, false, true, false, false, false, false, false, "g1755", "s1754" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, false, false, true, false, false, false, false, false, "g1757", "s1756" ), 
  };
  t.methods = new Method[] {
  new Method("add", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("button", com.badlogic.gdx.scenes.scene2d.ui.Button.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Button;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1758"),
  new Method("add", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("buttons", com.badlogic.gdx.scenes.scene2d.ui.Button[].class, "[Lcom/badlogic/gdx/scenes/scene2d/ui/Button;"), 
  }, 
  false, false, false, false, false, false, true, false, true, true, false, "m1759"),
  new Method("setChecked", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("text", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1760"),
  new Method("canCheck", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("button", com.badlogic.gdx.scenes.scene2d.ui.Button.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Button;"), 
  new Parameter("newState", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1761"),
  new Method("uncheckAll", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1762"),
  new Method("getChecked", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1763"),
  new Method("getAllChecked", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  com.badlogic.gdx.utils.Array.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1764"),
  new Method("getButtons", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  com.badlogic.gdx.utils.Array.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1765"),
  new Method("setMinCheckCount", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("minCheckCount", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1766"),
  new Method("setMaxCheckCount", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("maxCheckCount", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1767"),
  new Method("setClickListener", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1768"),
  new Method("setUncheckLast", 
  com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, 
  void.class, 
  new Parameter[] {
  new Parameter("uncheckLast", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1769"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup", t);
  
  }
  
  public void c92() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("background", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1771", "s1770" ), 
  new Field("cursor", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1773", "s1772" ), 
  new Field("font", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g1775", "s1774" ), 
  new Field("fontColor", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1777", "s1776" ), 
  new Field("selection", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, false, false, true, false, false, false, "g1779", "s1778" ), 
  new Field("messageFont", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.g2d.BitmapFont.class, false, false, false, false, true, false, false, false, "g1781", "s1780" ), 
  new Field("messageFontColor", com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1783", "s1782" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle", t);
  
  }
  
  public void c93() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.utils.OrderedMap";
  t.clazz = com.badlogic.gdx.utils.OrderedMap.class;
  t.superClass = com.badlogic.gdx.utils.ObjectMap.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.utils.OrderedMap.class);
  tAssignables.add(com.badlogic.gdx.utils.ObjectMap.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("keys", com.badlogic.gdx.utils.OrderedMap.class, com.badlogic.gdx.utils.Array.class, true, true, false, false, false, false, false, false, "g1785", "s1784" ), 
  };
  t.methods = new Method[] {
  new Method("put", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  new Parameter("arg1", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1786"),
  new Method("remove", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  java.lang.Object.class, 
  new Parameter[] {
  new Parameter("arg0", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1787"),
  new Method("clear", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1788"),
  new Method("orderedKeys", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  com.badlogic.gdx.utils.Array.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1789"),
  new Method("entries", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  com.badlogic.gdx.utils.ObjectMap.Entries.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1790"),
  new Method("keys", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  com.badlogic.gdx.utils.ObjectMap.Keys.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1791"),
  new Method("values", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  com.badlogic.gdx.utils.ObjectMap.Values.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1792"),
  new Method("toString", 
  com.badlogic.gdx.utils.OrderedMap.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1793"),
  };
  types.put("com.badlogic.gdx.utils.OrderedMap", t);
  
  }
  
  public void c94() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.CheckBox";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.TextButton.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextButton.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("image", com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class, com.badlogic.gdx.scenes.scene2d.ui.Image.class, false, false, true, false, false, false, false, false, "g1795", "s1794" ), 
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class, com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class, false, false, true, false, false, false, false, false, "g1797", "s1796" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1798"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class, 
  com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1799"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1800"),
  new Method("getImage", 
  com.badlogic.gdx.scenes.scene2d.ui.CheckBox.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1801"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.CheckBox", t);
  
  }
  
  public void c95() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Slider";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Slider.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Slider.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class, false, false, true, false, false, false, false, false, "g1803", "s1802" ), 
  new Field("min", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, float.class, false, false, true, false, false, false, false, false, "g1805", "s1804" ), 
  new Field("max", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, float.class, false, false, true, false, false, false, false, false, "g1807", "s1806" ), 
  new Field("steps", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, float.class, false, false, true, false, false, false, false, false, "g1809", "s1808" ), 
  new Field("value", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, float.class, false, false, true, false, false, false, false, false, "g1811", "s1810" ), 
  new Field("sliderPos", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, float.class, false, false, true, false, false, false, false, false, "g1813", "s1812" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener.class, false, false, true, false, false, false, false, false, "g1815", "s1814" ), 
  new Field("isDragging", com.badlogic.gdx.scenes.scene2d.ui.Slider.class, boolean.class, false, false, true, false, false, false, false, false, "g1817", "s1816" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Slider$SliderStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1818"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1819"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1820"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1821"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1822"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1823"),
  new Method("calculatePositionAndValue", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1824"),
  new Method("isDragging", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1825"),
  new Method("setValueChangedListener", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Slider$ValueChangedListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1826"),
  new Method("getValue", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1827"),
  new Method("setValue", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("value", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1828"),
  new Method("setRange", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  void.class, 
  new Parameter[] {
  new Parameter("min", float.class, "F"), 
  new Parameter("max", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1829"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1830"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Slider.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1831"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Slider", t);
  
  }
  
  public void c96() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Button";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Button.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Group.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.Button.class, com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, false, false, true, false, false, false, false, false, "g1833", "s1832" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.Button.class, com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, false, true, false, false, false, false, false, false, "g1835", "s1834" ), 
  new Field("isChecked", com.badlogic.gdx.scenes.scene2d.ui.Button.class, boolean.class, false, true, false, false, false, false, false, false, "g1837", "s1836" ), 
  new Field("buttonGroup", com.badlogic.gdx.scenes.scene2d.ui.Button.class, com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup.class, false, true, false, false, false, false, false, false, "g1839", "s1838" ), 
  };
  t.methods = new Method[] {
  new Method("initialize", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, true, false, false, false, false, true, false, "m1840"),
  new Method("setChecked", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  void.class, 
  new Parameter[] {
  new Parameter("isChecked", boolean.class, "Z"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1841"),
  new Method("isChecked", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1842"),
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1843"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1844"),
  new Method("setClickListener", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1845"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1846"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1847"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1848"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1849"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Button.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1850"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Button", t);
  
  }
  
  public void c97() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("handle", com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g1852", "s1851" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle", t);
  
  }
  
  public void c98() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Image";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Image.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Image.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("region", com.badlogic.gdx.scenes.scene2d.ui.Image.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, true, false, false, false, false, false, "g1854", "s1853" ), 
  new Field("patch", com.badlogic.gdx.scenes.scene2d.ui.Image.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, true, false, false, false, false, false, "g1856", "s1855" ), 
  new Field("scaling", com.badlogic.gdx.scenes.scene2d.ui.Image.class, com.badlogic.gdx.utils.Scaling.class, false, false, true, false, false, false, false, false, "g1858", "s1857" ), 
  new Field("align", com.badlogic.gdx.scenes.scene2d.ui.Image.class, int.class, false, false, true, false, false, false, false, false, "g1860", "s1859" ), 
  new Field("imageX", com.badlogic.gdx.scenes.scene2d.ui.Image.class, float.class, false, false, true, false, false, false, false, false, "g1862", "s1861" ), 
  new Field("imageY", com.badlogic.gdx.scenes.scene2d.ui.Image.class, float.class, false, false, true, false, false, false, false, false, "g1864", "s1863" ), 
  new Field("imageWidth", com.badlogic.gdx.scenes.scene2d.ui.Image.class, float.class, false, false, true, false, false, false, false, false, "g1866", "s1865" ), 
  new Field("imageHeight", com.badlogic.gdx.scenes.scene2d.ui.Image.class, float.class, false, false, true, false, false, false, false, false, "g1868", "s1867" ), 
  new Field("clickListener", com.badlogic.gdx.scenes.scene2d.ui.Image.class, com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, false, false, true, false, false, false, false, false, "g1870", "s1869" ), 
  };
  t.methods = new Method[] {
  new Method("layout", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1871"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1872"),
  new Method("setRegion", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("region", com.badlogic.gdx.graphics.g2d.TextureRegion.class, "Lcom/badlogic/gdx/graphics/g2d/TextureRegion;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1873"),
  new Method("getRegion", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  com.badlogic.gdx.graphics.g2d.TextureRegion.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1874"),
  new Method("setPatch", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("patch", com.badlogic.gdx.graphics.g2d.NinePatch.class, "Lcom/badlogic/gdx/graphics/g2d/NinePatch;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1875"),
  new Method("getPatch", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  com.badlogic.gdx.graphics.g2d.NinePatch.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1876"),
  new Method("setScaling", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("scaling", com.badlogic.gdx.utils.Scaling.class, "Lcom/badlogic/gdx/utils/Scaling;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1877"),
  new Method("setAlign", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("align", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1878"),
  new Method("getMinWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1879"),
  new Method("getMinHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1880"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1881"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1882"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1883"),
  new Method("touchUp", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1884"),
  new Method("touchDragged", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1885"),
  new Method("setClickListener", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  void.class, 
  new Parameter[] {
  new Parameter("clickListener", com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1886"),
  new Method("getImageX", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1887"),
  new Method("getImageY", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1888"),
  new Method("getImageWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1889"),
  new Method("getImageHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.Image.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1890"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Image", t);
  
  }
  
  public void c99() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.ClickListener";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("click", 
  com.badlogic.gdx.scenes.scene2d.ui.ClickListener.class, 
  void.class, 
  new Parameter[] {
  new Parameter("actor", com.badlogic.gdx.scenes.scene2d.Actor.class, "Lcom/badlogic/gdx/scenes/scene2d/Actor;"), 
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m1891"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.ClickListener", t);
  
  }
  
  public void c100() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1892"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1893"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1894"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1895"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer", t);
  
  }
  
  public void c101() {
  Type p = new Type();
  p.name = "byte";
  p.clazz = byte.class;
  p.isPrimitive = true;
  types.put("byte", p);
  
  }
  
  public void c102() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Boolean.class, "Ljava/lang/Boolean;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1896"),
  new Method("instantiate", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  java.lang.Boolean.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1897"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Boolean.class, "Ljava/lang/Boolean;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1898"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.lang.Boolean.class, "Ljava/lang/Boolean;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1899"),
  new Method("hasCustomInstantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  boolean.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1900"),
  new Method("instantiateInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  java.lang.Boolean.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1901"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.lang.Boolean.class, "Ljava/lang/Boolean;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1902"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer", t);
  
  }
  
  public void c103() {
  Type t = new Type();
  t.name = "float[]";
  t.clazz = float[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(float[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  float[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1903"),
  new Method("getClass", 
  float[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1904"),
  new Method("hashCode", 
  float[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1905"),
  new Method("toString", 
  float[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1906"),
  new Method("finalize", 
  float[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m1907"),
  };
  t.componentType = float.class;
  types.put("float[]", t);
  
  }
  
  public void c104() {
  Type t = new Type();
  t.name = "com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer";
  t.clazz = com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.class;
  t.superClass = com.google.gwt.user.client.rpc.CustomFieldSerializer.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.class);
  tAssignables.add(com.google.gwt.user.client.rpc.CustomFieldSerializer.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("deserialize", 
  com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.util.HashMap.class, "Ljava/util/HashMap;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1908"),
  new Method("serialize", 
  com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.util.HashMap.class, "Ljava/util/HashMap;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1909"),
  new Method("deserializeInstance", 
  com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamReader", com.google.gwt.user.client.rpc.SerializationStreamReader.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamReader;"), 
  new Parameter("instance", java.util.HashMap.class, "Ljava/util/HashMap;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1910"),
  new Method("serializeInstance", 
  com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer.class, 
  void.class, 
  new Parameter[] {
  new Parameter("streamWriter", com.google.gwt.user.client.rpc.SerializationStreamWriter.class, "Lcom/google/gwt/user/client/rpc/SerializationStreamWriter;"), 
  new Parameter("instance", java.util.HashMap.class, "Ljava/util/HashMap;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1911"),
  };
  types.put("com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer", t);
  
  }
  
  public void c105() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Align";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Align.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Align.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("CENTER", com.badlogic.gdx.scenes.scene2d.ui.Align.class, int.class, true, false, false, false, true, true, false, false, "g1913", "s1912" ), 
  new Field("TOP", com.badlogic.gdx.scenes.scene2d.ui.Align.class, int.class, true, false, false, false, true, true, false, false, "g1915", "s1914" ), 
  new Field("BOTTOM", com.badlogic.gdx.scenes.scene2d.ui.Align.class, int.class, true, false, false, false, true, true, false, false, "g1917", "s1916" ), 
  new Field("LEFT", com.badlogic.gdx.scenes.scene2d.ui.Align.class, int.class, true, false, false, false, true, true, false, false, "g1919", "s1918" ), 
  new Field("RIGHT", com.badlogic.gdx.scenes.scene2d.ui.Align.class, int.class, true, false, false, false, true, true, false, false, "g1921", "s1920" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Align", t);
  
  }
  
  public void c106() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch.class;
  t.superClass = com.badlogic.gdx.graphics.g2d.NinePatch.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch.class);
  tAssignables.add(com.badlogic.gdx.graphics.g2d.NinePatch.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("name", com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch.class, java.lang.String.class, false, false, false, false, true, false, false, false, "g1923", "s1922" ), 
  new Field("color", com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch.class, com.badlogic.gdx.graphics.Color.class, false, false, false, false, true, false, false, false, "g1925", "s1924" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch", t);
  
  }
  
  public void c107() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.List";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.List.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Widget.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.List.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Cullable.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Widget.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Layout.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.Actor.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("style", com.badlogic.gdx.scenes.scene2d.ui.List.class, com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, false, false, true, false, false, false, false, false, "g1927", "s1926" ), 
  new Field("items", com.badlogic.gdx.scenes.scene2d.ui.List.class, java.lang.String[].class, false, false, true, false, false, false, false, false, "g1929", "s1928" ), 
  new Field("selected", com.badlogic.gdx.scenes.scene2d.ui.List.class, int.class, false, false, true, false, false, false, false, false, "g1931", "s1930" ), 
  new Field("listener", com.badlogic.gdx.scenes.scene2d.ui.List.class, com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class, false, false, true, false, false, false, false, false, "g1933", "s1932" ), 
  new Field("cullingArea", com.badlogic.gdx.scenes.scene2d.ui.List.class, com.badlogic.gdx.math.Rectangle.class, false, false, true, false, false, false, false, false, "g1935", "s1934" ), 
  new Field("prefWidth", com.badlogic.gdx.scenes.scene2d.ui.List.class, float.class, false, false, true, false, false, false, false, false, "g1937", "s1936" ), 
  new Field("prefHeight", com.badlogic.gdx.scenes.scene2d.ui.List.class, float.class, false, false, true, false, false, false, false, false, "g1939", "s1938" ), 
  new Field("itemHeight", com.badlogic.gdx.scenes.scene2d.ui.List.class, float.class, false, false, true, false, false, false, false, false, "g1941", "s1940" ), 
  new Field("textOffsetX", com.badlogic.gdx.scenes.scene2d.ui.List.class, float.class, false, false, true, false, false, false, false, false, "g1943", "s1942" ), 
  new Field("textOffsetY", com.badlogic.gdx.scenes.scene2d.ui.List.class, float.class, false, false, true, false, false, false, false, false, "g1945", "s1944" ), 
  };
  t.methods = new Method[] {
  new Method("setStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  void.class, 
  new Parameter[] {
  new Parameter("style", com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/List$ListStyle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1946"),
  new Method("getStyle", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1947"),
  new Method("draw", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  void.class, 
  new Parameter[] {
  new Parameter("batch", com.badlogic.gdx.graphics.g2d.SpriteBatch.class, "Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;"), 
  new Parameter("parentAlpha", float.class, "F"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1948"),
  new Method("touchDown", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("x", float.class, "F"), 
  new Parameter("y", float.class, "F"), 
  new Parameter("pointer", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1949"),
  new Method("getSelectedIndex", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1950"),
  new Method("setSelectedIndex", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  void.class, 
  new Parameter[] {
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1951"),
  new Method("getSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1952"),
  new Method("setSelection", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  int.class, 
  new Parameter[] {
  new Parameter("item", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1953"),
  new Method("setItems", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  void.class, 
  new Parameter[] {
  new Parameter("objects", java.lang.Object[].class, "[Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1954"),
  new Method("getItems", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  java.lang.String[].class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1955"),
  new Method("getPrefWidth", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1956"),
  new Method("getPrefHeight", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1957"),
  new Method("setSelectionListener", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  void.class, 
  new Parameter[] {
  new Parameter("listener", com.badlogic.gdx.scenes.scene2d.ui.SelectionListener.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/SelectionListener;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1958"),
  new Method("setCullingArea", 
  com.badlogic.gdx.scenes.scene2d.ui.List.class, 
  void.class, 
  new Parameter[] {
  new Parameter("cullingArea", com.badlogic.gdx.math.Rectangle.class, "Lcom/badlogic/gdx/math/Rectangle;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1959"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.List", t);
  
  }
  
  public void c108() {
  Type t = new Type();
  t.name = "java.lang.Short";
  t.clazz = java.lang.Short.class;
  t.superClass = java.lang.Number.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Short.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.lang.Number.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("MIN_VALUE", java.lang.Short.class, short.class, true, false, false, false, true, true, false, false, "g1961", "s1960" ), 
  new Field("MAX_VALUE", java.lang.Short.class, short.class, true, false, false, false, true, true, false, false, "g1963", "s1962" ), 
  new Field("SIZE", java.lang.Short.class, int.class, true, false, false, false, true, true, false, false, "g1965", "s1964" ), 
  new Field("value", java.lang.Short.class, short.class, true, false, true, false, false, false, true, false, "g1967", "s1966" ), 
  };
  t.methods = new Method[] {
  new Method("decode", 
  java.lang.Short.class, 
  java.lang.Short.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1968"),
  new Method("hashCode", 
  java.lang.Short.class, 
  int.class, 
  new Parameter[] {
  new Parameter("s", short.class, "S"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1969"),
  new Method("hashCode", 
  java.lang.Short.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1970"),
  new Method("parseShort", 
  java.lang.Short.class, 
  short.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1971"),
  new Method("parseShort", 
  java.lang.Short.class, 
  short.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1972"),
  new Method("reverseBytes", 
  java.lang.Short.class, 
  short.class, 
  new Parameter[] {
  new Parameter("s", short.class, "S"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1973"),
  new Method("toString", 
  java.lang.Short.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("b", short.class, "S"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1974"),
  new Method("toString", 
  java.lang.Short.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1975"),
  new Method("valueOf", 
  java.lang.Short.class, 
  java.lang.Short.class, 
  new Parameter[] {
  new Parameter("s", short.class, "S"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1976"),
  new Method("valueOf", 
  java.lang.Short.class, 
  java.lang.Short.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1977"),
  new Method("valueOf", 
  java.lang.Short.class, 
  java.lang.Short.class, 
  new Parameter[] {
  new Parameter("s", java.lang.String.class, "Ljava/lang/String;"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m1978"),
  new Method("byteValue", 
  java.lang.Short.class, 
  byte.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1979"),
  new Method("compareTo", 
  java.lang.Short.class, 
  int.class, 
  new Parameter[] {
  new Parameter("b", java.lang.Short.class, "Ljava/lang/Short;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1980"),
  new Method("doubleValue", 
  java.lang.Short.class, 
  double.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1981"),
  new Method("equals", 
  java.lang.Short.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1982"),
  new Method("floatValue", 
  java.lang.Short.class, 
  float.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1983"),
  new Method("intValue", 
  java.lang.Short.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1984"),
  new Method("longValue", 
  java.lang.Short.class, 
  long.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1985"),
  new Method("shortValue", 
  java.lang.Short.class, 
  short.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m1986"),
  };
  types.put("java.lang.Short", t);
  
  }
  
  public void c109() {
  Type t = new Type();
  t.name = "java.lang.Character";
  t.clazz = java.lang.Character.class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(java.lang.Character.class);
  tAssignables.add(java.lang.Comparable.class);
  tAssignables.add(java.io.Serializable.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isStatic = false;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("TYPE", java.lang.Character.class, java.lang.Class.class, true, false, false, false, true, true, false, false, "g1988", "s1987" ), 
  new Field("MIN_RADIX", java.lang.Character.class, int.class, true, false, false, false, true, true, false, false, "g1990", "s1989" ), 
  new Field("MAX_RADIX", java.lang.Character.class, int.class, true, false, false, false, true, true, false, false, "g1992", "s1991" ), 
  new Field("MIN_VALUE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g1994", "s1993" ), 
  new Field("MAX_VALUE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g1996", "s1995" ), 
  new Field("MIN_SURROGATE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g1998", "s1997" ), 
  new Field("MAX_SURROGATE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g2000", "s1999" ), 
  new Field("MIN_LOW_SURROGATE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g2002", "s2001" ), 
  new Field("MAX_LOW_SURROGATE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g2004", "s2003" ), 
  new Field("MIN_HIGH_SURROGATE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g2006", "s2005" ), 
  new Field("MAX_HIGH_SURROGATE", java.lang.Character.class, char.class, true, false, false, false, true, true, false, false, "g2008", "s2007" ), 
  new Field("MIN_SUPPLEMENTARY_CODE_POINT", java.lang.Character.class, int.class, true, false, false, false, true, true, false, false, "g2010", "s2009" ), 
  new Field("MIN_CODE_POINT", java.lang.Character.class, int.class, true, false, false, false, true, true, false, false, "g2012", "s2011" ), 
  new Field("MAX_CODE_POINT", java.lang.Character.class, int.class, true, false, false, false, true, true, false, false, "g2014", "s2013" ), 
  new Field("SIZE", java.lang.Character.class, int.class, true, false, false, false, true, true, false, false, "g2016", "s2015" ), 
  new Field("value", java.lang.Character.class, char.class, true, false, true, false, false, false, true, false, "g2018", "s2017" ), 
  };
  t.methods = new Method[] {
  new Method("charCount", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2019"),
  new Method("codePointAt", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("a", char[].class, "[C"), 
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2020"),
  new Method("codePointAt", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("a", char[].class, "[C"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("limit", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2021"),
  new Method("codePointAt", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("seq", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2022"),
  new Method("codePointAt", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("cs", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("limit", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m2023"),
  new Method("codePointBefore", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("a", char[].class, "[C"), 
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2024"),
  new Method("codePointBefore", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("a", char[].class, "[C"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2025"),
  new Method("codePointBefore", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("cs", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("index", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2026"),
  new Method("codePointBefore", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("cs", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("start", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m2027"),
  new Method("codePointCount", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("a", char[].class, "[C"), 
  new Parameter("offset", int.class, "I"), 
  new Parameter("count", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2028"),
  new Method("codePointCount", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("seq", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("beginIndex", int.class, "I"), 
  new Parameter("endIndex", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2029"),
  new Method("digit", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2030"),
  new Method("forDigit", 
  java.lang.Character.class, 
  char.class, 
  new Parameter[] {
  new Parameter("digit", int.class, "I"), 
  new Parameter("radix", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2031"),
  new Method("hashCode", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2032"),
  new Method("hashCode", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2033"),
  new Method("isDigit", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2034"),
  new Method("isHighSurrogate", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("ch", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2035"),
  new Method("isLetter", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2036"),
  new Method("isLetterOrDigit", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2037"),
  new Method("isLowerCase", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2038"),
  new Method("isLowSurrogate", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("ch", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2039"),
  new Method("isSpace", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2040"),
  new Method("isSupplementaryCodePoint", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2041"),
  new Method("isSurrogatePair", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("highSurrogate", char.class, "C"), 
  new Parameter("lowSurrogate", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2042"),
  new Method("isUpperCase", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2043"),
  new Method("isValidCodePoint", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2044"),
  new Method("offsetByCodePoints", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("a", char[].class, "[C"), 
  new Parameter("start", int.class, "I"), 
  new Parameter("count", int.class, "I"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("codePointOffset", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2045"),
  new Method("offsetByCodePoints", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("seq", java.lang.CharSequence.class, "Ljava/lang/CharSequence;"), 
  new Parameter("index", int.class, "I"), 
  new Parameter("codePointOffset", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2046"),
  new Method("toChars", 
  java.lang.Character.class, 
  char[].class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2047"),
  new Method("toChars", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  new Parameter("dst", char[].class, "[C"), 
  new Parameter("dstIndex", int.class, "I"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2048"),
  new Method("toCodePoint", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("highSurrogate", char.class, "C"), 
  new Parameter("lowSurrogate", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2049"),
  new Method("toLowerCase", 
  java.lang.Character.class, 
  char.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2050"),
  new Method("toString", 
  java.lang.Character.class, 
  java.lang.String.class, 
  new Parameter[] {
  new Parameter("x", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2051"),
  new Method("toString", 
  java.lang.Character.class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2052"),
  new Method("toUpperCase", 
  java.lang.Character.class, 
  char.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2053"),
  new Method("valueOf", 
  java.lang.Character.class, 
  java.lang.Character.class, 
  new Parameter[] {
  new Parameter("c", char.class, "C"), 
  }, 
  false, false, true, false, false, false, true, false, false, true, false, "m2054"),
  new Method("getHighSurrogate", 
  java.lang.Character.class, 
  char.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m2055"),
  new Method("getLowSurrogate", 
  java.lang.Character.class, 
  char.class, 
  new Parameter[] {
  new Parameter("codePoint", int.class, "I"), 
  }, 
  false, false, true, true, false, false, false, false, false, true, false, "m2056"),
  new Method("charValue", 
  java.lang.Character.class, 
  char.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2057"),
  new Method("compareTo", 
  java.lang.Character.class, 
  int.class, 
  new Parameter[] {
  new Parameter("c", java.lang.Character.class, "Ljava/lang/Character;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2058"),
  new Method("equals", 
  java.lang.Character.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("o", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2059"),
  };
  types.put("java.lang.Character", t);
  
  }
  
  public void c110() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.class);
  t.assignables = tAssignables;
  t.isInterface = true;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = true;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("acceptChar", 
  com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("textField", com.badlogic.gdx.scenes.scene2d.ui.TextField.class, "Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;"), 
  new Parameter("key", char.class, "C"), 
  }, 
  true, false, false, false, false, false, true, false, false, true, false, "m2060"),
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter", t);
  
  }
  
  public void c111() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[]";
  t.clazz = com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class;
  t.superClass = java.lang.Object.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isArray = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  };
  t.methods = new Method[] {
  new Method("equals", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class, 
  boolean.class, 
  new Parameter[] {
  new Parameter("other", java.lang.Object.class, "Ljava/lang/Object;"), 
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2061"),
  new Method("getClass", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class, 
  java.lang.Class.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2062"),
  new Method("hashCode", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class, 
  int.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2063"),
  new Method("toString", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class, 
  java.lang.String.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, false, true, false, false, true, false, "m2064"),
  new Method("finalize", 
  com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[].class, 
  void.class, 
  new Parameter[] {
  }, 
  false, false, false, false, false, true, false, false, false, true, false, "m2065"),
  };
  t.componentType = com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment.class;
  types.put("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[]", t);
  
  }
  
  public void c112() {
  Type t = new Type();
  t.name = "com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle";
  t.clazz = com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class;
  t.superClass = com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class;
  Set<Class> tAssignables = new HashSet<Class>();
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class);
  tAssignables.add(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle.class);
  tAssignables.add(java.lang.Object.class);
  t.assignables = tAssignables;
  t.isMemberClass = true;
  t.isStatic = true;
  t.isAbstract = false;
  t.fields = new Field[] {
  new Field("regionUp", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, false, false, true, false, false, false, "g2067", "s2066" ), 
  new Field("regionDown", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, false, false, true, false, false, false, "g2069", "s2068" ), 
  new Field("regionChecked", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, com.badlogic.gdx.graphics.g2d.TextureRegion.class, false, false, false, false, true, false, false, false, "g2071", "s2070" ), 
  new Field("patchUp", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g2073", "s2072" ), 
  new Field("patchDown", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g2075", "s2074" ), 
  new Field("patchChecked", com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle.class, com.badlogic.gdx.graphics.g2d.NinePatch.class, false, false, false, false, true, false, false, false, "g2077", "s2076" ), 
  };
  t.methods = new Method[] {
  };
  types.put("com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle", t);
  
  }
  
  public IReflectionCacheGenerated() {
  c0();
  c1();
  c2();
  c3();
  c4();
  c5();
  c6();
  c7();
  c8();
  c9();
  c10();
  c11();
  c12();
  c13();
  c14();
  c15();
  c16();
  c17();
  c18();
  c19();
  c20();
  c21();
  c22();
  c23();
  c24();
  c25();
  c26();
  c27();
  c28();
  c29();
  c30();
  c31();
  c32();
  c33();
  c34();
  c35();
  c36();
  c37();
  c38();
  c39();
  c40();
  c41();
  c42();
  c43();
  c44();
  c45();
  c46();
  c47();
  c48();
  c49();
  c50();
  c51();
  c52();
  c53();
  c54();
  c55();
  c56();
  c57();
  c58();
  c59();
  c60();
  c61();
  c62();
  c63();
  c64();
  c65();
  c66();
  c67();
  c68();
  c69();
  c70();
  c71();
  c72();
  c73();
  c74();
  c75();
  c76();
  c77();
  c78();
  c79();
  c80();
  c81();
  c82();
  c83();
  c84();
  c85();
  c86();
  c87();
  c88();
  c89();
  c90();
  c91();
  c92();
  c93();
  c94();
  c95();
  c96();
  c97();
  c98();
  c99();
  c100();
  c101();
  c102();
  c103();
  c104();
  c105();
  c106();
  c107();
  c108();
  c109();
  c110();
  c111();
  c112();
  }
  public native Object g1(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.TextField::BACKSPACE;
  }-*/;
  
  public native Object g3(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.TextField::ENTER_DESKTOP;
  }-*/;
  
  public native Object g5(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.TextField::ENTER_ANDROID;
  }-*/;
  
  public native Object g7(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.TextField::TAB;
  }-*/;
  
  public native Object g9(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.TextField::DELETE;
  }-*/;
  
  public native Object g11(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.TextField::BULLET;
  }-*/;
  
  public native Object g13(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::style;
  }-*/;
  public native void s12(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::style = value;
  }-*/;
  
  public native Object g15(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::text;
  }-*/;
  public native void s14(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::text = value;
  }-*/;
  
  public native Object g17(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::messageText;
  }-*/;
  public native void s16(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::messageText = value;
  }-*/;
  
  public native Object g19(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::displayText;
  }-*/;
  public native void s18(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::displayText = value;
  }-*/;
  
  public native Object g21(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::cursor;
  }-*/;
  public native void s20(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::cursor = value;
  }-*/;
  
  public native Object g23(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::clipboard;
  }-*/;
  public native void s22(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::clipboard = value;
  }-*/;
  
  public native Object g25(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::listener;
  }-*/;
  public native void s24(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::listener = value;
  }-*/;
  
  public native Object g27(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::filter;
  }-*/;
  public native void s26(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::filter = value;
  }-*/;
  
  public native Object g29(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::keyboard;
  }-*/;
  public native void s28(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::keyboard = value;
  }-*/;
  
  public native Object g31(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::passwordMode;
  }-*/;
  public native void s30(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::passwordMode = value;
  }-*/;
  
  public native Object g33(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::passwordBuffer;
  }-*/;
  public native void s32(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::passwordBuffer = value;
  }-*/;
  
  public native Object g35(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::fieldBounds;
  }-*/;
  
  public native Object g37(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::textBounds;
  }-*/;
  
  public native Object g39(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::scissor;
  }-*/;
  
  public native Object g41(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::renderOffset;
  }-*/;
  public native void s40(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::renderOffset = value;
  }-*/;
  
  public native Object g43(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::textOffset;
  }-*/;
  public native void s42(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::textOffset = value;
  }-*/;
  
  public native Object g45(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::visibleTextStart;
  }-*/;
  public native void s44(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::visibleTextStart = value;
  }-*/;
  
  public native Object g47(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::visibleTextEnd;
  }-*/;
  public native void s46(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::visibleTextEnd = value;
  }-*/;
  
  public native Object g49(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::glyphAdvances;
  }-*/;
  
  public native Object g51(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::glyphPositions;
  }-*/;
  
  public native Object g53(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::cursorOn;
  }-*/;
  public native void s52(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::cursorOn = value;
  }-*/;
  
  public native Object g55(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::blinkTime;
  }-*/;
  public native void s54(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::blinkTime = value;
  }-*/;
  
  
  public native Object g59(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::hasSelection;
  }-*/;
  public native void s58(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::hasSelection = value;
  }-*/;
  
  public native Object g61(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::selectionStart;
  }-*/;
  public native void s60(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::selectionStart = value;
  }-*/;
  
  public native Object g63(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::selectionX;
  }-*/;
  public native void s62(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::selectionX = value;
  }-*/;
  
  public native Object g65(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::selectionWidth;
  }-*/;
  public native void s64(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::selectionWidth = value;
  }-*/;
  
  public native Object g67(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::passwordCharacter;
  }-*/;
  public native void s66(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::passwordCharacter = value;
  }-*/;
  
  
  
  public native Object g149(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return @com.badlogic.gdx.utils.ObjectMap::PRIME1;
  }-*/;
  
  public native Object g151(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return @com.badlogic.gdx.utils.ObjectMap::PRIME2;
  }-*/;
  
  public native Object g153(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return @com.badlogic.gdx.utils.ObjectMap::PRIME3;
  }-*/;
  
  public native Object g155(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::size;
  }-*/;
  public native void s154(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::size = value;
  }-*/;
  
  public native Object g157(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::keyTable;
  }-*/;
  public native void s156(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::keyTable = value;
  }-*/;
  
  public native Object g159(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::valueTable;
  }-*/;
  public native void s158(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::valueTable = value;
  }-*/;
  
  public native Object g161(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::capacity;
  }-*/;
  public native void s160(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::capacity = value;
  }-*/;
  
  public native Object g163(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::stashSize;
  }-*/;
  public native void s162(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::stashSize = value;
  }-*/;
  
  public native Object g165(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::loadFactor;
  }-*/;
  public native void s164(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::loadFactor = value;
  }-*/;
  
  public native Object g167(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::hashShift;
  }-*/;
  public native void s166(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::hashShift = value;
  }-*/;
  
  public native Object g169(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::mask;
  }-*/;
  public native void s168(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::mask = value;
  }-*/;
  
  public native Object g171(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::threshold;
  }-*/;
  public native void s170(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::threshold = value;
  }-*/;
  
  public native Object g173(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::stashCapacity;
  }-*/;
  public native void s172(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::stashCapacity = value;
  }-*/;
  
  public native Object g175(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::pushIterations;
  }-*/;
  public native void s174(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::pushIterations = value;
  }-*/;
  
  public native Object g177(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::entries;
  }-*/;
  public native void s176(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::entries = value;
  }-*/;
  
  public native Object g179(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::values;
  }-*/;
  public native void s178(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::values = value;
  }-*/;
  
  public native Object g181(com.badlogic.gdx.utils.ObjectMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap::keys;
  }-*/;
  public native void s180(com.badlogic.gdx.utils.ObjectMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap::keys = value;
  }-*/;
  
  
  
  
  
  public native Object g258(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::needsLayout;
  }-*/;
  public native void s257(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::needsLayout = value;
  }-*/;
  
  public native Object g260(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::fillParent;
  }-*/;
  public native void s259(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::fillParent = value;
  }-*/;
  
  public native Object g281(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::font;
  }-*/;
  
  public native Object g283(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::vertices;
  }-*/;
  public native void s282(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::vertices = value;
  }-*/;
  
  public native Object g285(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::idx;
  }-*/;
  public native void s284(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::idx = value;
  }-*/;
  
  public native Object g287(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::x;
  }-*/;
  public native void s286(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::x = value;
  }-*/;
  
  public native Object g289(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::y;
  }-*/;
  public native void s288(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::y = value;
  }-*/;
  
  public native Object g291(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::color;
  }-*/;
  public native void s290(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::color = value;
  }-*/;
  
  public native Object g293(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::tmpColor;
  }-*/;
  
  public native Object g295(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::textBounds;
  }-*/;
  
  public native Object g297(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::integer;
  }-*/;
  public native void s296(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::integer = value;
  }-*/;
  
  
  
  
  
  
  
  
  public native Object g424(com.badlogic.gdx.utils.ArrayMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ArrayMap::keys;
  }-*/;
  public native void s423(com.badlogic.gdx.utils.ArrayMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ArrayMap::keys = value;
  }-*/;
  
  public native Object g426(com.badlogic.gdx.utils.ArrayMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ArrayMap::values;
  }-*/;
  public native void s425(com.badlogic.gdx.utils.ArrayMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ArrayMap::values = value;
  }-*/;
  
  public native Object g428(com.badlogic.gdx.utils.ArrayMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ArrayMap::size;
  }-*/;
  public native void s427(com.badlogic.gdx.utils.ArrayMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ArrayMap::size = value;
  }-*/;
  
  public native Object g430(com.badlogic.gdx.utils.ArrayMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.ArrayMap::ordered;
  }-*/;
  public native void s429(com.badlogic.gdx.utils.ArrayMap obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ArrayMap::ordered = value;
  }-*/;
  
  public native Object g467(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::style;
  }-*/;
  public native void s466(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::style = value;
  }-*/;
  
  public native Object g469(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::widget;
  }-*/;
  public native void s468(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::widget = value;
  }-*/;
  
  public native Object g471(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::hScrollBounds;
  }-*/;
  
  public native Object g473(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::vScrollBounds;
  }-*/;
  
  public native Object g475(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::hKnobBounds;
  }-*/;
  
  public native Object g477(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::vKnobBounds;
  }-*/;
  
  public native Object g479(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::widgetAreaBounds;
  }-*/;
  
  public native Object g481(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::widgetCullingArea;
  }-*/;
  
  public native Object g483(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::scissorBounds;
  }-*/;
  
  public native Object g485(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::scrollX;
  }-*/;
  public native void s484(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::scrollX = value;
  }-*/;
  
  public native Object g487(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::scrollY;
  }-*/;
  public native void s486(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::scrollY = value;
  }-*/;
  
  public native Object g489(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::amountX;
  }-*/;
  public native void s488(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::amountX = value;
  }-*/;
  
  public native Object g491(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::amountY;
  }-*/;
  public native void s490(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::amountY = value;
  }-*/;
  
  public native Object g493(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchScrollH;
  }-*/;
  public native void s492(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchScrollH = value;
  }-*/;
  
  public native Object g495(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchScrollV;
  }-*/;
  public native void s494(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchScrollV = value;
  }-*/;
  
  public native Object g497(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::lastPoint;
  }-*/;
  
  public native Object g499(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::handlePosition;
  }-*/;
  public native void s498(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::handlePosition = value;
  }-*/;
  
  public native Object g501(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::disableX;
  }-*/;
  public native void s500(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::disableX = value;
  }-*/;
  
  public native Object g503(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::disableY;
  }-*/;
  public native void s502(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::disableY = value;
  }-*/;
  
  public native Object g505(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::areaWidth;
  }-*/;
  public native void s504(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::areaWidth = value;
  }-*/;
  
  public native Object g507(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::areaHeight;
  }-*/;
  public native void s506(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::areaHeight = value;
  }-*/;
  
  public native Object g538(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::CLEAR;
  }-*/;
  
  public native Object g540(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::WHITE;
  }-*/;
  
  public native Object g542(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::BLACK;
  }-*/;
  
  public native Object g544(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::RED;
  }-*/;
  
  public native Object g546(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::GREEN;
  }-*/;
  
  public native Object g548(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::BLUE;
  }-*/;
  
  public native Object g550(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::LIGHT_GRAY;
  }-*/;
  
  public native Object g552(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::GRAY;
  }-*/;
  
  public native Object g554(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::DARK_GRAY;
  }-*/;
  
  public native Object g556(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::PINK;
  }-*/;
  
  public native Object g558(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::ORANGE;
  }-*/;
  
  public native Object g560(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::YELLOW;
  }-*/;
  
  public native Object g562(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::MAGENTA;
  }-*/;
  
  public native Object g564(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::CYAN;
  }-*/;
  
  public native Object g566(com.badlogic.gdx.graphics.Color obj) /*-{
     return obj.@com.badlogic.gdx.graphics.Color::r;
  }-*/;
  public native void s565(com.badlogic.gdx.graphics.Color obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.Color::r = value;
  }-*/;
  
  public native Object g568(com.badlogic.gdx.graphics.Color obj) /*-{
     return obj.@com.badlogic.gdx.graphics.Color::g;
  }-*/;
  public native void s567(com.badlogic.gdx.graphics.Color obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.Color::g = value;
  }-*/;
  
  public native Object g570(com.badlogic.gdx.graphics.Color obj) /*-{
     return obj.@com.badlogic.gdx.graphics.Color::b;
  }-*/;
  public native void s569(com.badlogic.gdx.graphics.Color obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.Color::b = value;
  }-*/;
  
  public native Object g572(com.badlogic.gdx.graphics.Color obj) /*-{
     return obj.@com.badlogic.gdx.graphics.Color::a;
  }-*/;
  public native void s571(com.badlogic.gdx.graphics.Color obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.Color::a = value;
  }-*/;
  
  public native Object g574(com.badlogic.gdx.graphics.Color obj) /*-{
     return @com.badlogic.gdx.graphics.Color::tmp;
  }-*/;
  public native void s573(com.badlogic.gdx.graphics.Color obj, Object value)  /*-{
      @com.badlogic.gdx.graphics.Color::tmp = value
  }-*/;
  
  public native Object g608(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::font;
  }-*/;
  public native void s607(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::font = value;
  }-*/;
  
  public native Object g610(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::fontColor;
  }-*/;
  public native void s609(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::fontColor = value;
  }-*/;
  
  public native Object g612(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::downFontColor;
  }-*/;
  public native void s611(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::downFontColor = value;
  }-*/;
  
  public native Object g614(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::checkedFontColor;
  }-*/;
  public native void s613(com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle::checkedFontColor = value;
  }-*/;
  
  public native Object g616(com.badlogic.gdx.utils.Array.ArrayIterator obj) /*-{
     return obj.@com.badlogic.gdx.utils.Array.ArrayIterator::array;
  }-*/;
  
  public native Object g618(com.badlogic.gdx.utils.Array.ArrayIterator obj) /*-{
     return obj.@com.badlogic.gdx.utils.Array.ArrayIterator::index;
  }-*/;
  public native void s617(com.badlogic.gdx.utils.Array.ArrayIterator obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.Array.ArrayIterator::index = value;
  }-*/;
  
  
  
  
  public native Object g644(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::TOP_LEFT;
  }-*/;
  
  public native Object g646(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::TOP_CENTER;
  }-*/;
  
  public native Object g648(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::TOP_RIGHT;
  }-*/;
  
  public native Object g650(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::MIDDLE_LEFT;
  }-*/;
  
  public native Object g652(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::MIDDLE_CENTER;
  }-*/;
  
  public native Object g654(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::MIDDLE_RIGHT;
  }-*/;
  
  public native Object g656(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::BOTTOM_LEFT;
  }-*/;
  
  public native Object g658(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::BOTTOM_CENTER;
  }-*/;
  
  public native Object g660(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.NinePatch::BOTTOM_RIGHT;
  }-*/;
  
  public native Object g662(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::patches;
  }-*/;
  public native void s661(com.badlogic.gdx.graphics.g2d.NinePatch obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.NinePatch::patches = value;
  }-*/;
  
  public native Object g664(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::color;
  }-*/;
  public native void s663(com.badlogic.gdx.graphics.g2d.NinePatch obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.NinePatch::color = value;
  }-*/;
  
  public native Object g666(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::blending;
  }-*/;
  public native void s665(com.badlogic.gdx.graphics.g2d.NinePatch obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.NinePatch::blending = value;
  }-*/;
  
  public native Object g680(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::widget;
  }-*/;
  public native void s679(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::widget = value;
  }-*/;
  
  public native Object g682(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::widgetAreaBounds;
  }-*/;
  
  public native Object g684(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::widgetCullingArea;
  }-*/;
  
  public native Object g686(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::scissorBounds;
  }-*/;
  
  public native Object g688(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::gestureDetector;
  }-*/;
  
  public native Object g690(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::scrollX;
  }-*/;
  public native void s689(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::scrollX = value;
  }-*/;
  
  public native Object g692(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::scrollY;
  }-*/;
  public native void s691(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::scrollY = value;
  }-*/;
  
  public native Object g694(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::amountX;
  }-*/;
  public native void s693(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::amountX = value;
  }-*/;
  
  public native Object g696(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::amountY;
  }-*/;
  public native void s695(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::amountY = value;
  }-*/;
  
  public native Object g698(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::maxX;
  }-*/;
  public native void s697(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::maxX = value;
  }-*/;
  
  public native Object g700(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::maxY;
  }-*/;
  public native void s699(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::maxY = value;
  }-*/;
  
  public native Object g702(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::velocityX;
  }-*/;
  public native void s701(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::velocityX = value;
  }-*/;
  
  public native Object g704(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::velocityY;
  }-*/;
  public native void s703(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::velocityY = value;
  }-*/;
  
  public native Object g706(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::flingTimer;
  }-*/;
  public native void s705(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::flingTimer = value;
  }-*/;
  
  public native Object g708(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::touchFocusedChild;
  }-*/;
  public native void s707(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::touchFocusedChild = value;
  }-*/;
  
  public native Object g710(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscroll;
  }-*/;
  public native void s709(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscroll = value;
  }-*/;
  
  public native Object g712(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::flingTime;
  }-*/;
  public native void s711(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::flingTime = value;
  }-*/;
  
  public native Object g714(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollDistance;
  }-*/;
  public native void s713(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollDistance = value;
  }-*/;
  
  public native Object g716(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollSpeedMin;
  }-*/;
  public native void s715(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollSpeedMin = value;
  }-*/;
  
  public native Object g718(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollSpeedMax;
  }-*/;
  public native void s717(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollSpeedMax = value;
  }-*/;
  
  public native Object g720(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollInterpolation;
  }-*/;
  public native void s719(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::overscrollInterpolation = value;
  }-*/;
  
  public native Object g722(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::emptySpaceOnlyScroll;
  }-*/;
  public native void s721(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::emptySpaceOnlyScroll = value;
  }-*/;
  
  public native Object g724(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::forceOverscrollX;
  }-*/;
  public native void s723(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::forceOverscrollX = value;
  }-*/;
  
  public native Object g726(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::forceOverscrollY;
  }-*/;
  public native void s725(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::forceOverscrollY = value;
  }-*/;
  
  public native Object g728(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::disableX;
  }-*/;
  public native void s727(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::disableX = value;
  }-*/;
  
  public native Object g730(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::disableY;
  }-*/;
  public native void s729(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::disableY = value;
  }-*/;
  
  public native Object g732(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::clamp;
  }-*/;
  public native void s731(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::clamp = value;
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  public native Object g825(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::background;
  }-*/;
  public native void s824(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::background = value;
  }-*/;
  
  public native Object g827(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::hScroll;
  }-*/;
  public native void s826(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::hScroll = value;
  }-*/;
  
  public native Object g829(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::hScrollKnob;
  }-*/;
  public native void s828(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::hScrollKnob = value;
  }-*/;
  
  public native Object g831(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::vScroll;
  }-*/;
  public native void s830(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::vScroll = value;
  }-*/;
  
  public native Object g833(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::vScrollKnob;
  }-*/;
  public native void s832(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle::vScrollKnob = value;
  }-*/;
  
  public native Object g835(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::style;
  }-*/;
  public native void s834(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::style = value;
  }-*/;
  
  public native Object g837(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::firstWidget;
  }-*/;
  public native void s836(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::firstWidget = value;
  }-*/;
  
  public native Object g839(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::secondWidget;
  }-*/;
  public native void s838(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::secondWidget = value;
  }-*/;
  
  public native Object g841(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::vertical;
  }-*/;
  public native void s840(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::vertical = value;
  }-*/;
  
  public native Object g843(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::splitAmount;
  }-*/;
  public native void s842(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::splitAmount = value;
  }-*/;
  
  public native Object g845(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::minAmount;
  }-*/;
  public native void s844(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::minAmount = value;
  }-*/;
  
  public native Object g847(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::maxAmount;
  }-*/;
  public native void s846(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::maxAmount = value;
  }-*/;
  
  public native Object g849(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::oldSplitAmount;
  }-*/;
  public native void s848(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::oldSplitAmount = value;
  }-*/;
  
  public native Object g851(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::touchDrag;
  }-*/;
  public native void s850(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::touchDrag = value;
  }-*/;
  
  public native Object g853(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::firstWidgetBounds;
  }-*/;
  public native void s852(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::firstWidgetBounds = value;
  }-*/;
  
  public native Object g855(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::secondWidgetBounds;
  }-*/;
  public native void s854(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::secondWidgetBounds = value;
  }-*/;
  
  public native Object g857(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::handleBounds;
  }-*/;
  public native void s856(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::handleBounds = value;
  }-*/;
  
  public native Object g859(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::firstScissors;
  }-*/;
  public native void s858(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::firstScissors = value;
  }-*/;
  
  public native Object g861(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::secondScissors;
  }-*/;
  public native void s860(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::secondScissors = value;
  }-*/;
  
  public native Object g863(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::lastPoint;
  }-*/;
  public native void s862(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::lastPoint = value;
  }-*/;
  
  public native Object g865(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::handlePosition;
  }-*/;
  public native void s864(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::handlePosition = value;
  }-*/;
  
  public native Object g893(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::background;
  }-*/;
  public native void s892(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::background = value;
  }-*/;
  
  public native Object g895(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::listBackground;
  }-*/;
  public native void s894(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::listBackground = value;
  }-*/;
  
  public native Object g897(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::listSelection;
  }-*/;
  public native void s896(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::listSelection = value;
  }-*/;
  
  public native Object g899(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::font;
  }-*/;
  public native void s898(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::font = value;
  }-*/;
  
  public native Object g901(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::fontColor;
  }-*/;
  public native void s900(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::fontColor = value;
  }-*/;
  
  public native Object g903(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::itemSpacing;
  }-*/;
  public native void s902(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle::itemSpacing = value;
  }-*/;
  
  public native Object g912(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::style;
  }-*/;
  public native void s911(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::style = value;
  }-*/;
  
  public native Object g914(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::items;
  }-*/;
  public native void s913(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::items = value;
  }-*/;
  
  public native Object g916(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::selection;
  }-*/;
  public native void s915(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::selection = value;
  }-*/;
  
  public native Object g918(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::bounds;
  }-*/;
  
  public native Object g920(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::screenCoords;
  }-*/;
  
  
  public native Object g924(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::listener;
  }-*/;
  public native void s923(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::listener = value;
  }-*/;
  
  public native Object g926(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::prefWidth;
  }-*/;
  public native void s925(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::prefWidth = value;
  }-*/;
  
  public native Object g928(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::prefHeight;
  }-*/;
  public native void s927(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::prefHeight = value;
  }-*/;
  
  public native Object g930(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::stageCoords;
  }-*/;
  
  public native Object g955(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::needsLayout;
  }-*/;
  public native void s954(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::needsLayout = value;
  }-*/;
  
  public native Object g957(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::fillParent;
  }-*/;
  public native void s956(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::fillParent = value;
  }-*/;
  
  public native Object g986(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle::slider;
  }-*/;
  public native void s985(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle::slider = value;
  }-*/;
  
  public native Object g988(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle::knob;
  }-*/;
  public native void s987(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle::knob = value;
  }-*/;
  
  public native Object g990(com.badlogic.gdx.utils.ObjectMap.Entry obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap.Entry::key;
  }-*/;
  public native void s989(com.badlogic.gdx.utils.ObjectMap.Entry obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap.Entry::key = value;
  }-*/;
  
  public native Object g992(com.badlogic.gdx.utils.ObjectMap.Entry obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap.Entry::value;
  }-*/;
  public native void s991(com.badlogic.gdx.utils.ObjectMap.Entry obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap.Entry::value = value;
  }-*/;
  
  public native Object g995(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::label;
  }-*/;
  
  public native Object g997(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::style;
  }-*/;
  public native void s996(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::style = value;
  }-*/;
  
  public native Object g1006(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::style;
  }-*/;
  public native void s1005(com.badlogic.gdx.scenes.scene2d.ui.Window obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::style = value;
  }-*/;
  
  public native Object g1008(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::title;
  }-*/;
  public native void s1007(com.badlogic.gdx.scenes.scene2d.ui.Window obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::title = value;
  }-*/;
  
  public native Object g1010(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::titleCache;
  }-*/;
  public native void s1009(com.badlogic.gdx.scenes.scene2d.ui.Window obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::titleCache = value;
  }-*/;
  
  public native Object g1012(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::isMovable;
  }-*/;
  public native void s1011(com.badlogic.gdx.scenes.scene2d.ui.Window obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::isMovable = value;
  }-*/;
  
  public native Object g1014(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::isModal;
  }-*/;
  public native void s1013(com.badlogic.gdx.scenes.scene2d.ui.Window obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::isModal = value;
  }-*/;
  
  public native Object g1016(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::dragOffset;
  }-*/;
  
  public native Object g1018(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::dragging;
  }-*/;
  public native void s1017(com.badlogic.gdx.scenes.scene2d.ui.Window obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::dragging = value;
  }-*/;
  
  public native Object g1037(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::image;
  }-*/;
  
  public native Object g1039(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::style;
  }-*/;
  public native void s1038(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::style = value;
  }-*/;
  
  public native Object g1052(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::layout;
  }-*/;
  
  public native Object g1054(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::backgroundPatch;
  }-*/;
  public native void s1053(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::backgroundPatch = value;
  }-*/;
  
  public native Object g1056(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::tableBounds;
  }-*/;
  
  public native Object g1058(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::scissors;
  }-*/;
  
  public native Object g1060(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::listener;
  }-*/;
  public native void s1059(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::listener = value;
  }-*/;
  
  public native Object g1062(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::clip;
  }-*/;
  public native void s1061(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::clip = value;
  }-*/;
  
  public native Object g1064(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::isPressed;
  }-*/;
  public native void s1063(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::isPressed = value;
  }-*/;
  
  public native Object g1146(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::font;
  }-*/;
  public native void s1145(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::font = value;
  }-*/;
  
  public native Object g1148(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::fontColorSelected;
  }-*/;
  public native void s1147(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::fontColorSelected = value;
  }-*/;
  
  public native Object g1150(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::fontColorUnselected;
  }-*/;
  public native void s1149(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::fontColorUnselected = value;
  }-*/;
  
  public native Object g1152(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::selectedPatch;
  }-*/;
  public native void s1151(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle::selectedPatch = value;
  }-*/;
  
  public native Object g1154(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::texture;
  }-*/;
  public native void s1153(com.badlogic.gdx.graphics.g2d.TextureRegion obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::texture = value;
  }-*/;
  
  public native Object g1156(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::u;
  }-*/;
  public native void s1155(com.badlogic.gdx.graphics.g2d.TextureRegion obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::u = value;
  }-*/;
  
  public native Object g1158(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::v;
  }-*/;
  public native void s1157(com.badlogic.gdx.graphics.g2d.TextureRegion obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::v = value;
  }-*/;
  
  public native Object g1160(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::u2;
  }-*/;
  public native void s1159(com.badlogic.gdx.graphics.g2d.TextureRegion obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::u2 = value;
  }-*/;
  
  public native Object g1162(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::v2;
  }-*/;
  public native void s1161(com.badlogic.gdx.graphics.g2d.TextureRegion obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::v2 = value;
  }-*/;
  
  public native Object g1191(com.badlogic.gdx.utils.Array obj) /*-{
     return obj.@com.badlogic.gdx.utils.Array::items;
  }-*/;
  public native void s1190(com.badlogic.gdx.utils.Array obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.Array::items = value;
  }-*/;
  
  public native Object g1193(com.badlogic.gdx.utils.Array obj) /*-{
     return obj.@com.badlogic.gdx.utils.Array::size;
  }-*/;
  public native void s1192(com.badlogic.gdx.utils.Array obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.Array::size = value;
  }-*/;
  
  public native Object g1195(com.badlogic.gdx.utils.Array obj) /*-{
     return obj.@com.badlogic.gdx.utils.Array::ordered;
  }-*/;
  public native void s1194(com.badlogic.gdx.utils.Array obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.Array::ordered = value;
  }-*/;
  
  public native Object g1197(com.badlogic.gdx.utils.Array obj) /*-{
     return obj.@com.badlogic.gdx.utils.Array::iterator;
  }-*/;
  public native void s1196(com.badlogic.gdx.utils.Array obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.Array::iterator = value;
  }-*/;
  
  public native Object g1228(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::style;
  }-*/;
  public native void s1227(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::style = value;
  }-*/;
  
  public native Object g1230(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::bounds;
  }-*/;
  
  public native Object g1232(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::text;
  }-*/;
  public native void s1231(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::text = value;
  }-*/;
  
  public native Object g1234(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::cache;
  }-*/;
  public native void s1233(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::cache = value;
  }-*/;
  
  public native Object g1236(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::prefWidth;
  }-*/;
  public native void s1235(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::prefWidth = value;
  }-*/;
  
  public native Object g1238(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::prefHeight;
  }-*/;
  public native void s1237(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::prefHeight = value;
  }-*/;
  
  public native Object g1240(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::labelAlign;
  }-*/;
  public native void s1239(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::labelAlign = value;
  }-*/;
  
  public native Object g1242(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::lineAlign;
  }-*/;
  public native void s1241(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::lineAlign = value;
  }-*/;
  
  public native Object g1244(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::wrap;
  }-*/;
  public native void s1243(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::wrap = value;
  }-*/;
  
  public native Object g1246(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::lastPrefHeight;
  }-*/;
  public native void s1245(com.badlogic.gdx.scenes.scene2d.ui.Label obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::lastPrefHeight = value;
  }-*/;
  
  public native Object g1265(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle::background;
  }-*/;
  public native void s1264(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle::background = value;
  }-*/;
  
  public native Object g1267(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle::titleFont;
  }-*/;
  public native void s1266(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle::titleFont = value;
  }-*/;
  
  public native Object g1269(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle::titleFontColor;
  }-*/;
  public native void s1268(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle::titleFontColor = value;
  }-*/;
  
  public native Object g1276(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::instance;
  }-*/;
  public native void s1275(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, Object value)  /*-{
      @com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::instance = value
  }-*/;
  
  public native Object g1278(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::drawDebug;
  }-*/;
  public native void s1277(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, Object value)  /*-{
      @com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::drawDebug = value
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  public native Object g1345(com.badlogic.gdx.scenes.scene2d.ui.Skin obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::resources;
  }-*/;
  public native void s1344(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::resources = value;
  }-*/;
  
  public native Object g1347(com.badlogic.gdx.scenes.scene2d.ui.Skin obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::styles;
  }-*/;
  public native void s1346(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::styles = value;
  }-*/;
  
  public native Object g1349(com.badlogic.gdx.scenes.scene2d.ui.Skin obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::texture;
  }-*/;
  public native void s1348(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::texture = value;
  }-*/;
  
  public native Object g1375(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::skin;
  }-*/;
  public native void s1374(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::skin = value;
  }-*/;
  
  public native Object g1377(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::assetManager;
  }-*/;
  public native void s1376(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::assetManager = value;
  }-*/;
  
  public native Object g1379(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::debugRects;
  }-*/;
  public native void s1378(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::debugRects = value;
  }-*/;
  
  public native Object g1381(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::debugRenderer;
  }-*/;
  public native void s1380(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::debugRenderer = value;
  }-*/;
  
  public native Object g1389(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::srcX;
  }-*/;
  public native void s1388(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::srcX = value;
  }-*/;
  
  public native Object g1391(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::srcY;
  }-*/;
  public native void s1390(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::srcY = value;
  }-*/;
  
  public native Object g1393(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::width;
  }-*/;
  public native void s1392(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::width = value;
  }-*/;
  
  public native Object g1395(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::height;
  }-*/;
  public native void s1394(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::height = value;
  }-*/;
  
  public native Object g1397(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::u;
  }-*/;
  public native void s1396(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::u = value;
  }-*/;
  
  public native Object g1399(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::v;
  }-*/;
  public native void s1398(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::v = value;
  }-*/;
  
  public native Object g1401(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::u2;
  }-*/;
  public native void s1400(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::u2 = value;
  }-*/;
  
  public native Object g1403(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::v2;
  }-*/;
  public native void s1402(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::v2 = value;
  }-*/;
  
  public native Object g1405(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::xoffset;
  }-*/;
  public native void s1404(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::xoffset = value;
  }-*/;
  
  public native Object g1407(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::yoffset;
  }-*/;
  public native void s1406(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::yoffset = value;
  }-*/;
  
  public native Object g1409(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::xadvance;
  }-*/;
  public native void s1408(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::xadvance = value;
  }-*/;
  
  public native Object g1411(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::kerning;
  }-*/;
  public native void s1410(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::kerning = value;
  }-*/;
  
  public native Object g1416(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle::checkboxOn;
  }-*/;
  public native void s1415(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle::checkboxOn = value;
  }-*/;
  
  public native Object g1418(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle::checkboxOff;
  }-*/;
  public native void s1417(com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle::checkboxOff = value;
  }-*/;
  
  
  
  
  
  public native Object g1455(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::imagePath;
  }-*/;
  public native void s1454(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::imagePath = value;
  }-*/;
  
  public native Object g1457(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::fontFile;
  }-*/;
  public native void s1456(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::fontFile = value;
  }-*/;
  
  public native Object g1459(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::flipped;
  }-*/;
  public native void s1458(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::flipped = value;
  }-*/;
  
  public native Object g1461(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::lineHeight;
  }-*/;
  public native void s1460(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::lineHeight = value;
  }-*/;
  
  public native Object g1463(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::capHeight;
  }-*/;
  public native void s1462(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::capHeight = value;
  }-*/;
  
  public native Object g1465(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::ascent;
  }-*/;
  public native void s1464(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::ascent = value;
  }-*/;
  
  public native Object g1467(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::descent;
  }-*/;
  public native void s1466(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::descent = value;
  }-*/;
  
  public native Object g1469(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::down;
  }-*/;
  public native void s1468(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::down = value;
  }-*/;
  
  public native Object g1471(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::scaleX;
  }-*/;
  public native void s1470(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::scaleX = value;
  }-*/;
  
  public native Object g1473(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::scaleY;
  }-*/;
  public native void s1472(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::scaleY = value;
  }-*/;
  
  public native Object g1475(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::glyphs;
  }-*/;
  
  public native Object g1477(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::spaceWidth;
  }-*/;
  public native void s1476(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::spaceWidth = value;
  }-*/;
  
  public native Object g1479(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::xHeight;
  }-*/;
  public native void s1478(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::xHeight = value;
  }-*/;
  
  public native Object g1486(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds::width;
  }-*/;
  public native void s1485(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds::width = value;
  }-*/;
  
  public native Object g1488(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds::height;
  }-*/;
  public native void s1487(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds::height = value;
  }-*/;
  
  
  
  
  public native Object g1532(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::scissors;
  }-*/;
  public native void s1531(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj, Object value)  /*-{
      @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::scissors = value
  }-*/;
  
  public native Object g1534(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::tmp;
  }-*/;
  public native void s1533(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj, Object value)  /*-{
      @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::tmp = value
  }-*/;
  
  public native Object g1536(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::viewport;
  }-*/;
  
  public native Object g1544(com.badlogic.gdx.utils.ObjectMap.Entries obj) /*-{
     return obj.@com.badlogic.gdx.utils.ObjectMap.Entries::entry;
  }-*/;
  public native void s1543(com.badlogic.gdx.utils.ObjectMap.Entries obj, Object value)  /*-{
      obj.@com.badlogic.gdx.utils.ObjectMap.Entries::entry = value;
  }-*/;
  
  public native Object g1549(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment::LEFT;
  }-*/;
  
  public native Object g1551(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment::CENTER;
  }-*/;
  
  public native Object g1553(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment::RIGHT;
  }-*/;
  
  public native Object g1557(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont::LOG2_PAGE_SIZE;
  }-*/;
  
  public native Object g1559(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont::PAGE_SIZE;
  }-*/;
  
  public native Object g1561(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont::PAGES;
  }-*/;
  
  public native Object g1563(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont::xChars;
  }-*/;
  
  public native Object g1565(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return @com.badlogic.gdx.graphics.g2d.BitmapFont::capChars;
  }-*/;
  
  public native Object g1567(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::region;
  }-*/;
  public native void s1566(com.badlogic.gdx.graphics.g2d.BitmapFont obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::region = value;
  }-*/;
  
  public native Object g1569(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::textBounds;
  }-*/;
  
  public native Object g1571(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::color;
  }-*/;
  public native void s1570(com.badlogic.gdx.graphics.g2d.BitmapFont obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::color = value;
  }-*/;
  
  public native Object g1573(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::tempColor;
  }-*/;
  public native void s1572(com.badlogic.gdx.graphics.g2d.BitmapFont obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::tempColor = value;
  }-*/;
  
  public native Object g1575(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::flipped;
  }-*/;
  public native void s1574(com.badlogic.gdx.graphics.g2d.BitmapFont obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::flipped = value;
  }-*/;
  
  public native Object g1577(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::integer;
  }-*/;
  public native void s1576(com.badlogic.gdx.graphics.g2d.BitmapFont obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::integer = value;
  }-*/;
  
  public native Object g1579(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::data;
  }-*/;
  
  public native Object g1581(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
     return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::ownsTexture;
  }-*/;
  public native void s1580(com.badlogic.gdx.graphics.g2d.BitmapFont obj, Object value)  /*-{
      obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::ownsTexture = value;
  }-*/;
  
  public native Object g1625(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle::font;
  }-*/;
  public native void s1624(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle::font = value;
  }-*/;
  
  public native Object g1627(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle::fontColor;
  }-*/;
  public native void s1626(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle::fontColor = value;
  }-*/;
  
  public native Object g1629(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::down;
  }-*/;
  public native void s1628(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::down = value;
  }-*/;
  
  public native Object g1631(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::up;
  }-*/;
  public native void s1630(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::up = value;
  }-*/;
  
  public native Object g1633(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::checked;
  }-*/;
  public native void s1632(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::checked = value;
  }-*/;
  
  public native Object g1635(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::pressedOffsetX;
  }-*/;
  public native void s1634(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::pressedOffsetX = value;
  }-*/;
  
  public native Object g1637(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::pressedOffsetY;
  }-*/;
  public native void s1636(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::pressedOffsetY = value;
  }-*/;
  
  public native Object g1639(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::unpressedOffsetX;
  }-*/;
  public native void s1638(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::unpressedOffsetX = value;
  }-*/;
  
  public native Object g1641(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::unpressedOffsetY;
  }-*/;
  public native void s1640(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle::unpressedOffsetY = value;
  }-*/;
  
  
  
  
  
  public native Object g1745(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::buttons;
  }-*/;
  
  public native Object g1747(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::checkedButtons;
  }-*/;
  public native void s1746(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::checkedButtons = value;
  }-*/;
  
  public native Object g1749(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::minCheckCount;
  }-*/;
  public native void s1748(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::minCheckCount = value;
  }-*/;
  
  public native Object g1751(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::maxCheckCount;
  }-*/;
  public native void s1750(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::maxCheckCount = value;
  }-*/;
  
  public native Object g1753(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::uncheckLast;
  }-*/;
  public native void s1752(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::uncheckLast = value;
  }-*/;
  
  public native Object g1755(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::lastChecked;
  }-*/;
  public native void s1754(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::lastChecked = value;
  }-*/;
  
  public native Object g1757(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::listener;
  }-*/;
  public native void s1756(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::listener = value;
  }-*/;
  
  public native Object g1771(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::background;
  }-*/;
  public native void s1770(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::background = value;
  }-*/;
  
  public native Object g1773(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::cursor;
  }-*/;
  public native void s1772(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::cursor = value;
  }-*/;
  
  public native Object g1775(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::font;
  }-*/;
  public native void s1774(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::font = value;
  }-*/;
  
  public native Object g1777(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::fontColor;
  }-*/;
  public native void s1776(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::fontColor = value;
  }-*/;
  
  public native Object g1779(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::selection;
  }-*/;
  public native void s1778(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::selection = value;
  }-*/;
  
  public native Object g1781(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::messageFont;
  }-*/;
  public native void s1780(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::messageFont = value;
  }-*/;
  
  public native Object g1783(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::messageFontColor;
  }-*/;
  public native void s1782(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle::messageFontColor = value;
  }-*/;
  
  public native Object g1785(com.badlogic.gdx.utils.OrderedMap obj) /*-{
     return obj.@com.badlogic.gdx.utils.OrderedMap::keys;
  }-*/;
  
  public native Object g1795(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::image;
  }-*/;
  public native void s1794(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::image = value;
  }-*/;
  
  public native Object g1797(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::style;
  }-*/;
  public native void s1796(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::style = value;
  }-*/;
  
  public native Object g1803(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::style;
  }-*/;
  public native void s1802(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::style = value;
  }-*/;
  
  public native Object g1805(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::min;
  }-*/;
  public native void s1804(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::min = value;
  }-*/;
  
  public native Object g1807(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::max;
  }-*/;
  public native void s1806(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::max = value;
  }-*/;
  
  public native Object g1809(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::steps;
  }-*/;
  public native void s1808(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::steps = value;
  }-*/;
  
  public native Object g1811(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::value;
  }-*/;
  public native void s1810(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::value = value;
  }-*/;
  
  public native Object g1813(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::sliderPos;
  }-*/;
  public native void s1812(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::sliderPos = value;
  }-*/;
  
  public native Object g1815(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::listener;
  }-*/;
  public native void s1814(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::listener = value;
  }-*/;
  
  public native Object g1817(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::isDragging;
  }-*/;
  public native void s1816(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::isDragging = value;
  }-*/;
  
  public native Object g1833(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::style;
  }-*/;
  public native void s1832(com.badlogic.gdx.scenes.scene2d.ui.Button obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::style = value;
  }-*/;
  
  public native Object g1835(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::listener;
  }-*/;
  public native void s1834(com.badlogic.gdx.scenes.scene2d.ui.Button obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::listener = value;
  }-*/;
  
  public native Object g1837(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::isChecked;
  }-*/;
  public native void s1836(com.badlogic.gdx.scenes.scene2d.ui.Button obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::isChecked = value;
  }-*/;
  
  public native Object g1839(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::buttonGroup;
  }-*/;
  public native void s1838(com.badlogic.gdx.scenes.scene2d.ui.Button obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::buttonGroup = value;
  }-*/;
  
  public native Object g1852(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle::handle;
  }-*/;
  public native void s1851(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle::handle = value;
  }-*/;
  
  public native Object g1854(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::region;
  }-*/;
  public native void s1853(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::region = value;
  }-*/;
  
  public native Object g1856(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::patch;
  }-*/;
  public native void s1855(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::patch = value;
  }-*/;
  
  public native Object g1858(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::scaling;
  }-*/;
  public native void s1857(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::scaling = value;
  }-*/;
  
  public native Object g1860(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::align;
  }-*/;
  public native void s1859(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::align = value;
  }-*/;
  
  public native Object g1862(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageX;
  }-*/;
  public native void s1861(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageX = value;
  }-*/;
  
  public native Object g1864(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageY;
  }-*/;
  public native void s1863(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageY = value;
  }-*/;
  
  public native Object g1866(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageWidth;
  }-*/;
  public native void s1865(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageWidth = value;
  }-*/;
  
  public native Object g1868(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageHeight;
  }-*/;
  public native void s1867(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::imageHeight = value;
  }-*/;
  
  public native Object g1870(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::clickListener;
  }-*/;
  public native void s1869(com.badlogic.gdx.scenes.scene2d.ui.Image obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::clickListener = value;
  }-*/;
  
  public native Object g1913(com.badlogic.gdx.scenes.scene2d.ui.Align obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.Align::CENTER;
  }-*/;
  
  public native Object g1915(com.badlogic.gdx.scenes.scene2d.ui.Align obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.Align::TOP;
  }-*/;
  
  public native Object g1917(com.badlogic.gdx.scenes.scene2d.ui.Align obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.Align::BOTTOM;
  }-*/;
  
  public native Object g1919(com.badlogic.gdx.scenes.scene2d.ui.Align obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.Align::LEFT;
  }-*/;
  
  public native Object g1921(com.badlogic.gdx.scenes.scene2d.ui.Align obj) /*-{
     return @com.badlogic.gdx.scenes.scene2d.ui.Align::RIGHT;
  }-*/;
  
  public native Object g1923(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch::name;
  }-*/;
  public native void s1922(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch::name = value;
  }-*/;
  
  public native Object g1925(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch::color;
  }-*/;
  public native void s1924(com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch::color = value;
  }-*/;
  
  public native Object g1927(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::style;
  }-*/;
  public native void s1926(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::style = value;
  }-*/;
  
  public native Object g1929(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::items;
  }-*/;
  public native void s1928(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::items = value;
  }-*/;
  
  public native Object g1931(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::selected;
  }-*/;
  public native void s1930(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::selected = value;
  }-*/;
  
  public native Object g1933(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::listener;
  }-*/;
  public native void s1932(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::listener = value;
  }-*/;
  
  public native Object g1935(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::cullingArea;
  }-*/;
  public native void s1934(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::cullingArea = value;
  }-*/;
  
  public native Object g1937(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::prefWidth;
  }-*/;
  public native void s1936(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::prefWidth = value;
  }-*/;
  
  public native Object g1939(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::prefHeight;
  }-*/;
  public native void s1938(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::prefHeight = value;
  }-*/;
  
  public native Object g1941(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::itemHeight;
  }-*/;
  public native void s1940(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::itemHeight = value;
  }-*/;
  
  public native Object g1943(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::textOffsetX;
  }-*/;
  public native void s1942(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::textOffsetX = value;
  }-*/;
  
  public native Object g1945(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::textOffsetY;
  }-*/;
  public native void s1944(com.badlogic.gdx.scenes.scene2d.ui.List obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.List::textOffsetY = value;
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native Object g2067(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::regionUp;
  }-*/;
  public native void s2066(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::regionUp = value;
  }-*/;
  
  public native Object g2069(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::regionDown;
  }-*/;
  public native void s2068(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::regionDown = value;
  }-*/;
  
  public native Object g2071(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::regionChecked;
  }-*/;
  public native void s2070(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::regionChecked = value;
  }-*/;
  
  public native Object g2073(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::patchUp;
  }-*/;
  public native void s2072(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::patchUp = value;
  }-*/;
  
  public native Object g2075(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::patchDown;
  }-*/;
  public native void s2074(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::patchDown = value;
  }-*/;
  
  public native Object g2077(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj) /*-{
     return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::patchChecked;
  }-*/;
  public native void s2076(com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle obj, Object value)  /*-{
      obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle::patchChecked = value;
  }-*/;
  
  public native void m68(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldStyle;)(p0);
  }-*/;
  
  public native void m69(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, char p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setPasswordCharacter(C)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle m70(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getStyle()();
  }-*/;
  
  public native void m71(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::layout()();
  }-*/;
  
  public native void m72(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::calculateOffsets()();
  }-*/;
  
  public native void m73(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native void m74(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::updateDisplayText()();
  }-*/;
  
  public native void m75(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::blink()();
  }-*/;
  
  public native boolean m76(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native boolean m77(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::keyDown(I)(p0);
  }-*/;
  
  public native void m78(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::copy()();
  }-*/;
  
  public native void m79(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::paste()();
  }-*/;
  
  public native void m80(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::delete()();
  }-*/;
  
  public native boolean m81(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, char p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::keyTyped(C)(p0);
  }-*/;
  
  public native void m82(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::next(Z)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.TextField m83(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, java.util.List p0,com.badlogic.gdx.scenes.scene2d.ui.TextField p1,boolean p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::findNextTextField(Ljava/util/List;Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;Z)(p0, p1, p2);
  }-*/;
  
  public native void m84(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setTextFieldListener(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldListener;)(p0);
  }-*/;
  
  public native void m85(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setTextFieldFilter(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$TextFieldFilter;)(p0);
  }-*/;
  
  public native java.lang.String m86(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getMessageText()();
  }-*/;
  
  public native void m87(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setMessageText(Ljava/lang/String;)(p0);
  }-*/;
  
  public native void m88(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setText(Ljava/lang/String;)(p0);
  }-*/;
  
  public native java.lang.String m89(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getText()();
  }-*/;
  
  public native void m90(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, int p0,int p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setSelection(II)(p0, p1);
  }-*/;
  
  public native void m91(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::clearSelection()();
  }-*/;
  
  public native void m92(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setCursorPosition(I)(p0);
  }-*/;
  
  public native int m93(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getCursorPosition()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard m94(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getOnscreenKeyboard()();
  }-*/;
  
  public native void m95(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setOnscreenKeyboard(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField$OnscreenKeyboard;)(p0);
  }-*/;
  
  public native void m96(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setClipboard(Lcom/badlogic/gdx/scenes/scene2d/ui/utils/Clipboard;)(p0);
  }-*/;
  
  public native float m97(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getPrefWidth()();
  }-*/;
  
  public native float m98(com.badlogic.gdx.scenes.scene2d.ui.TextField obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::getPrefHeight()();
  }-*/;
  
  public native void m99(com.badlogic.gdx.scenes.scene2d.ui.TextField obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField::setPasswordMode(Z)(p0);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native java.lang.Object m182(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,java.lang.Object p1) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::put(Ljava/lang/Object;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native java.lang.Object m183(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,java.lang.Object p1) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::put_internal(Ljava/lang/Object;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native void m184(com.badlogic.gdx.utils.ObjectMap obj, com.badlogic.gdx.utils.ObjectMap p0) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::putAll(Lcom/badlogic/gdx/utils/ObjectMap;)(p0);
  }-*/;
  
  public native void m185(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::putResize(Ljava/lang/Object;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native void m186(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,java.lang.Object p1,int p2,java.lang.Object p3,int p4,java.lang.Object p5,int p6,java.lang.Object p7) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::push(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)(p0, p1, p2, p3, p4, p5, p6, p7);
  }-*/;
  
  public native void m187(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::putStash(Ljava/lang/Object;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native java.lang.Object m188(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::get(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native java.lang.Object m189(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::getStash(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native java.lang.Object m190(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::remove(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native java.lang.Object m191(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::removeStash(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native void m192(com.badlogic.gdx.utils.ObjectMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::removeStashIndex(I)(p0);
  }-*/;
  
  public native void m193(com.badlogic.gdx.utils.ObjectMap obj) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::clear()();
  }-*/;
  
  public native boolean m194(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::containsValue(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native boolean m195(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::containsKey(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native boolean m196(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::containsKeyStash(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native java.lang.Object m197(com.badlogic.gdx.utils.ObjectMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::findKey(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native void m198(com.badlogic.gdx.utils.ObjectMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::ensureCapacity(I)(p0);
  }-*/;
  
  public native void m199(com.badlogic.gdx.utils.ObjectMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap::resize(I)(p0);
  }-*/;
  
  public native int m200(com.badlogic.gdx.utils.ObjectMap obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::hash2(I)(p0);
  }-*/;
  
  public native int m201(com.badlogic.gdx.utils.ObjectMap obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::hash3(I)(p0);
  }-*/;
  
  public native java.lang.String m202(com.badlogic.gdx.utils.ObjectMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::toString()();
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Entries m203(com.badlogic.gdx.utils.ObjectMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::entries()();
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Values m204(com.badlogic.gdx.utils.ObjectMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::values()();
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Keys m205(com.badlogic.gdx.utils.ObjectMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap::keys()();
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native float m261(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::getMinWidth()();
  }-*/;
  
  public native float m262(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::getMinHeight()();
  }-*/;
  
  public native float m263(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::getPrefWidth()();
  }-*/;
  
  public native float m264(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::getPrefHeight()();
  }-*/;
  
  public native float m265(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::getMaxWidth()();
  }-*/;
  
  public native float m266(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::getMaxHeight()();
  }-*/;
  
  public native void m267(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::invalidate()();
  }-*/;
  
  public native void m268(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::validate()();
  }-*/;
  
  public native boolean m269(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::needsLayout()();
  }-*/;
  
  public native void m270(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::invalidateHierarchy()();
  }-*/;
  
  public native void m271(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::pack()();
  }-*/;
  
  public native void m272(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::setFillParent(Z)(p0);
  }-*/;
  
  public native void m273(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m274(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, float p0,float p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::hit(FF)(p0, p1);
  }-*/;
  
  public native void m275(com.badlogic.gdx.scenes.scene2d.ui.Widget obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::layout()();
  }-*/;
  
  public native boolean m276(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m277(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m278(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Widget::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m279(com.badlogic.gdx.scenes.scene2d.ui.Widget obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.math.Vector2 p1) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.Widget::toScreenCoordinates(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/math/Vector2;)(p0, p1);
  }-*/;
  
  public native void m298(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, float p0,float p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setPosition(FF)(p0, p1);
  }-*/;
  
  public native void m299(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, float p0,float p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::translate(FF)(p0, p1);
  }-*/;
  
  public native void m300(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setColor(F)(p0);
  }-*/;
  
  public native void m301(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, com.badlogic.gdx.graphics.Color p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setColor(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native void m302(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, float p0,float p1,float p2,float p3) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setColor(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native void m303(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;)(p0);
  }-*/;
  
  public native void m304(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m305(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::getColor()();
  }-*/;
  
  public native void m306(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, int p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::reset(I)(p0);
  }-*/;
  
  public native float m307(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2,int p3,int p4) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::addToCache(Ljava/lang/CharSequence;FFII)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native void m308(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph p0,float p1,float p2,float p3,float p4) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::addGlyph(Lcom/badlogic/gdx/graphics/g2d/BitmapFont$Glyph;FFFF)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m309(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setText(Ljava/lang/CharSequence;FF)(p0, p1, p2);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m310(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2,int p3,int p4) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setText(Ljava/lang/CharSequence;FFII)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m311(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setMultiLineText(Ljava/lang/CharSequence;FF)(p0, p1, p2);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m312(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2,float p3,com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment p4) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setMultiLineText(Ljava/lang/CharSequence;FFFLcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m313(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2,float p3) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setWrappedText(Ljava/lang/CharSequence;FFF)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m314(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, java.lang.CharSequence p0,float p1,float p2,float p3,com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment p4) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setWrappedText(Ljava/lang/CharSequence;FFFLcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m315(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::getBounds()();
  }-*/;
  
  public native float m316(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::getX()();
  }-*/;
  
  public native float m317(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::getY()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont m318(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::getFont()();
  }-*/;
  
  public native void m319(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::dispose()();
  }-*/;
  
  public native void m320(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::setUseIntegerPositions(Z)(p0);
  }-*/;
  
  public native boolean m321(com.badlogic.gdx.graphics.g2d.BitmapFontCache obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFontCache::usesIntegerPositions()();
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m374(com.badlogic.gdx.utils.Disposable obj) /*-{
  obj.@com.badlogic.gdx.utils.Disposable::dispose()();
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m431(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::put(Ljava/lang/Object;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native void m432(com.badlogic.gdx.utils.ArrayMap obj, com.badlogic.gdx.utils.ArrayMap p0) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::addAll(Lcom/badlogic/gdx/utils/ArrayMap;)(p0);
  }-*/;
  
  public native void m433(com.badlogic.gdx.utils.ArrayMap obj, com.badlogic.gdx.utils.ArrayMap p0,int p1,int p2) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::addAll(Lcom/badlogic/gdx/utils/ArrayMap;II)(p0, p1, p2);
  }-*/;
  
  public native java.lang.Object m434(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::get(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native java.lang.Object m435(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::get(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native java.lang.Object m436(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::getKey(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native java.lang.Object m437(com.badlogic.gdx.utils.ArrayMap obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::getKeyAt(I)(p0);
  }-*/;
  
  public native java.lang.Object m438(com.badlogic.gdx.utils.ArrayMap obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::getValueAt(I)(p0);
  }-*/;
  
  public native void m439(com.badlogic.gdx.utils.ArrayMap obj, int p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::setKey(ILjava/lang/Object;)(p0, p1);
  }-*/;
  
  public native void m440(com.badlogic.gdx.utils.ArrayMap obj, int p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::setValue(ILjava/lang/Object;)(p0, p1);
  }-*/;
  
  public native void m441(com.badlogic.gdx.utils.ArrayMap obj, int p0,java.lang.Object p1,java.lang.Object p2) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::insert(ILjava/lang/Object;Ljava/lang/Object;)(p0, p1, p2);
  }-*/;
  
  public native boolean m442(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::containsKey(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native boolean m443(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::containsValue(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native int m444(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::indexOfKey(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native int m445(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::indexOfValue(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native java.lang.Object m446(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::removeKey(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native boolean m447(com.badlogic.gdx.utils.ArrayMap obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::removeValue(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native void m448(com.badlogic.gdx.utils.ArrayMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::removeIndex(I)(p0);
  }-*/;
  
  public native java.lang.Object m449(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::peekKey()();
  }-*/;
  
  public native java.lang.Object m450(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::peekValue()();
  }-*/;
  
  public native void m451(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::clear()();
  }-*/;
  
  public native void m452(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::shrink()();
  }-*/;
  
  public native void m453(com.badlogic.gdx.utils.ArrayMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::ensureCapacity(I)(p0);
  }-*/;
  
  public native void m454(com.badlogic.gdx.utils.ArrayMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::resize(I)(p0);
  }-*/;
  
  public native void m455(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::reverse()();
  }-*/;
  
  public native void m456(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::shuffle()();
  }-*/;
  
  public native void m457(com.badlogic.gdx.utils.ArrayMap obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.ArrayMap::truncate(I)(p0);
  }-*/;
  
  public native java.lang.String m458(com.badlogic.gdx.utils.ArrayMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.ArrayMap::toString()();
  }-*/;
  
  
  
  
  
  
  
  
  public native void m508(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/ScrollPane$ScrollPaneStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle m509(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getStyle()();
  }-*/;
  
  public native void m510(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::layout()();
  }-*/;
  
  public native void m511(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native float m512(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getPrefWidth()();
  }-*/;
  
  public native float m513(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getPrefHeight()();
  }-*/;
  
  public native float m514(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getMinWidth()();
  }-*/;
  
  public native float m515(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getMinHeight()();
  }-*/;
  
  public native boolean m516(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m517(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m518(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m519(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setWidget(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m520(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::addActor(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m521(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, int p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::addActorAt(ILcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native void m522(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::addActorBefore(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native void m523(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::removeActor(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m524(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::removeActorRecursive(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m525(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0,float p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::hit(FF)(p0, p1);
  }-*/;
  
  public native void m526(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setScrollX(F)(p0);
  }-*/;
  
  public native float m527(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getScrollX()();
  }-*/;
  
  public native void m528(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setScrollY(F)(p0);
  }-*/;
  
  public native float m529(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getScrollY()();
  }-*/;
  
  public native float m530(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getScrollPercentX()();
  }-*/;
  
  public native void m531(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setScrollPercentX(F)(p0);
  }-*/;
  
  public native float m532(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getScrollPercentY()();
  }-*/;
  
  public native void m533(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setScrollPercentY(F)(p0);
  }-*/;
  
  public native float m534(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getMaxX()();
  }-*/;
  
  public native float m535(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::getMaxY()();
  }-*/;
  
  public native void m536(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane obj, boolean p0,boolean p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ScrollPane::setScrollingDisabled(ZZ)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m575(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::set(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native void m576(com.badlogic.gdx.graphics.Color obj, float p0,float p1,float p2,float p3) /*-{
  obj.@com.badlogic.gdx.graphics.Color::set(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m577(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::mul(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m578(com.badlogic.gdx.graphics.Color obj, float p0) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::mul(F)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m579(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::add(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m580(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::sub(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native void m581(com.badlogic.gdx.graphics.Color obj) /*-{
  obj.@com.badlogic.gdx.graphics.Color::clamp()();
  }-*/;
  
  public native boolean m582(com.badlogic.gdx.graphics.Color obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::equals(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native int m583(com.badlogic.gdx.graphics.Color obj) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::hashCode()();
  }-*/;
  
  public native java.lang.String m584(com.badlogic.gdx.graphics.Color obj) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::toString()();
  }-*/;
  
  public native float m585(com.badlogic.gdx.graphics.Color obj, int p0,int p1,int p2,int p3) /*-{
  return @com.badlogic.gdx.graphics.Color::toFloatBits(IIII)(p0, p1, p2, p3);
  }-*/;
  
  public native float m586(com.badlogic.gdx.graphics.Color obj) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::toFloatBits()();
  }-*/;
  
  public native float m587(com.badlogic.gdx.graphics.Color obj, float p0,float p1,float p2,float p3) /*-{
  return @com.badlogic.gdx.graphics.Color::toFloatBits(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native int m588(com.badlogic.gdx.graphics.Color obj, int p0,int p1,int p2,int p3) /*-{
  return @com.badlogic.gdx.graphics.Color::toIntBits(IIII)(p0, p1, p2, p3);
  }-*/;
  
  public native int m589(com.badlogic.gdx.graphics.Color obj) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::toIntBits()();
  }-*/;
  
  public native int m590(com.badlogic.gdx.graphics.Color obj, float p0) /*-{
  return @com.badlogic.gdx.graphics.Color::alpha(F)(p0);
  }-*/;
  
  public native int m591(com.badlogic.gdx.graphics.Color obj, float p0,float p1) /*-{
  return @com.badlogic.gdx.graphics.Color::luminanceAlpha(FF)(p0, p1);
  }-*/;
  
  public native int m592(com.badlogic.gdx.graphics.Color obj, float p0,float p1,float p2) /*-{
  return @com.badlogic.gdx.graphics.Color::rgb565(FFF)(p0, p1, p2);
  }-*/;
  
  public native int m593(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return @com.badlogic.gdx.graphics.Color::rgb565(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native int m594(com.badlogic.gdx.graphics.Color obj, float p0,float p1,float p2,float p3) /*-{
  return @com.badlogic.gdx.graphics.Color::rgba4444(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native int m595(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return @com.badlogic.gdx.graphics.Color::rgba4444(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native int m596(com.badlogic.gdx.graphics.Color obj, float p0,float p1,float p2) /*-{
  return @com.badlogic.gdx.graphics.Color::rgb888(FFF)(p0, p1, p2);
  }-*/;
  
  public native int m597(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return @com.badlogic.gdx.graphics.Color::rgb888(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native int m598(com.badlogic.gdx.graphics.Color obj, float p0,float p1,float p2,float p3) /*-{
  return @com.badlogic.gdx.graphics.Color::rgba8888(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native int m599(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0) /*-{
  return @com.badlogic.gdx.graphics.Color::rgba8888(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native void m600(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0,int p1) /*-{
  @com.badlogic.gdx.graphics.Color::rgb565ToColor(Lcom/badlogic/gdx/graphics/Color;I)(p0, p1);
  }-*/;
  
  public native void m601(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0,int p1) /*-{
  @com.badlogic.gdx.graphics.Color::rgba4444ToColor(Lcom/badlogic/gdx/graphics/Color;I)(p0, p1);
  }-*/;
  
  public native void m602(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0,int p1) /*-{
  @com.badlogic.gdx.graphics.Color::rgb888ToColor(Lcom/badlogic/gdx/graphics/Color;I)(p0, p1);
  }-*/;
  
  public native void m603(com.badlogic.gdx.graphics.Color obj, com.badlogic.gdx.graphics.Color p0,int p1) /*-{
  @com.badlogic.gdx.graphics.Color::rgba8888ToColor(Lcom/badlogic/gdx/graphics/Color;I)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m604(com.badlogic.gdx.graphics.Color obj) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::tmp()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m605(com.badlogic.gdx.graphics.Color obj) /*-{
  return obj.@com.badlogic.gdx.graphics.Color::cpy()();
  }-*/;
  
  public native void m606(com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard::show(Z)(p0);
  }-*/;
  
  public native boolean m619(com.badlogic.gdx.utils.Array.ArrayIterator obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array.ArrayIterator::hasNext()();
  }-*/;
  
  public native java.lang.Object m620(com.badlogic.gdx.utils.Array.ArrayIterator obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array.ArrayIterator::next()();
  }-*/;
  
  public native void m621(com.badlogic.gdx.utils.Array.ArrayIterator obj) /*-{
  obj.@com.badlogic.gdx.utils.Array.ArrayIterator::remove()();
  }-*/;
  
  public native void m622(com.badlogic.gdx.utils.Array.ArrayIterator obj) /*-{
  obj.@com.badlogic.gdx.utils.Array.ArrayIterator::reset()();
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m667(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.NinePatch::checkValidity()();
  }-*/;
  
  public native void m668(com.badlogic.gdx.graphics.g2d.NinePatch obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1,float p2,float p3,float p4) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.NinePatch::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;FFFF)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native float m669(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getLeftWidth()();
  }-*/;
  
  public native float m670(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getRightWidth()();
  }-*/;
  
  public native float m671(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getTopHeight()();
  }-*/;
  
  public native float m672(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getBottomHeight()();
  }-*/;
  
  public native float m673(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getTotalHeight()();
  }-*/;
  
  public native float m674(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getTotalWidth()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.TextureRegion[] m675(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getPatches()();
  }-*/;
  
  public native void m676(com.badlogic.gdx.graphics.g2d.NinePatch obj, com.badlogic.gdx.graphics.Color p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.NinePatch::setColor(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m677(com.badlogic.gdx.graphics.g2d.NinePatch obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.NinePatch::getColor()();
  }-*/;
  
  public native void m678(com.badlogic.gdx.graphics.g2d.NinePatch obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.NinePatch::setBlending(Z)(p0);
  }-*/;
  
  public native void m733(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::clamp()();
  }-*/;
  
  public native void m734(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::act(F)(p0);
  }-*/;
  
  public native void m735(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::layout()();
  }-*/;
  
  public native void m736(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native boolean m737(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m738(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m739(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::cancelTouchFocusedChild()();
  }-*/;
  
  public native void m740(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m741(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setScrollX(F)(p0);
  }-*/;
  
  public native float m742(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getScrollX()();
  }-*/;
  
  public native void m743(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setScrollY(F)(p0);
  }-*/;
  
  public native float m744(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getScrollY()();
  }-*/;
  
  public native float m745(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getScrollPercentX()();
  }-*/;
  
  public native void m746(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setScrollPercentX(F)(p0);
  }-*/;
  
  public native float m747(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getScrollPercentY()();
  }-*/;
  
  public native void m748(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setScrollPercentY(F)(p0);
  }-*/;
  
  public native float m749(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getMaxX()();
  }-*/;
  
  public native float m750(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getMaxY()();
  }-*/;
  
  public native void m751(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setWidget(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m752(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getWidget()();
  }-*/;
  
  public native void m753(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::addActor(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m754(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, int p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::addActorAt(ILcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native void m755(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::addActorBefore(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native void m756(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::removeActor(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m757(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::removeActorRecursive(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native boolean m758(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::isPanning()();
  }-*/;
  
  public native boolean m759(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::isFlinging()();
  }-*/;
  
  public native void m760(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setVelocityX(F)(p0);
  }-*/;
  
  public native float m761(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getVelocityX()();
  }-*/;
  
  public native void m762(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setVelocityY(F)(p0);
  }-*/;
  
  public native float m763(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getVelocityY()();
  }-*/;
  
  public native float m764(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getPrefWidth()();
  }-*/;
  
  public native float m765(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getPrefHeight()();
  }-*/;
  
  public native float m766(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getMinWidth()();
  }-*/;
  
  public native float m767(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::getMinHeight()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m768(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0,float p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::hit(FF)(p0, p1);
  }-*/;
  
  public native void m769(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setOverscroll(Z)(p0);
  }-*/;
  
  public native void m770(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0,float p1,float p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setupOverscroll(FFF)(p0, p1, p2);
  }-*/;
  
  public native void m771(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, boolean p0,boolean p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setForceOverscroll(ZZ)(p0, p1);
  }-*/;
  
  public native void m772(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setFlingTime(F)(p0);
  }-*/;
  
  public native void m773(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setEmptySpaceOnlyScroll(Z)(p0);
  }-*/;
  
  public native void m774(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, boolean p0,boolean p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setScrollingDisabled(ZZ)(p0, p1);
  }-*/;
  
  public native void m775(com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane::setClamp(Z)(p0);
  }-*/;
  
  public native void m776(com.badlogic.gdx.scenes.scene2d.ui.SelectionListener obj, com.badlogic.gdx.scenes.scene2d.Actor p0,int p1,java.lang.String p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectionListener::selected(Lcom/badlogic/gdx/scenes/scene2d/Actor;ILjava/lang/String;)(p0, p1, p2);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m817(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::layout()();
  }-*/;
  
  public native float m818(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::getPrefWidth()();
  }-*/;
  
  public native float m819(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::getPrefHeight()();
  }-*/;
  
  public native float m820(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::getMaxWidth()();
  }-*/;
  
  public native float m821(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::getMaxHeight()();
  }-*/;
  
  public native float m822(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::getMinWidth()();
  }-*/;
  
  public native float m823(com.badlogic.gdx.scenes.scene2d.ui.Stack obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Stack::getMinHeight()();
  }-*/;
  
  public native void m866(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/SplitPane$SplitPaneStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle m867(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::getStyle()();
  }-*/;
  
  public native void m868(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::layout()();
  }-*/;
  
  public native float m869(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::getPrefWidth()();
  }-*/;
  
  public native float m870(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::getPrefHeight()();
  }-*/;
  
  public native float m871(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::getMinWidth()();
  }-*/;
  
  public native float m872(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::getMinHeight()();
  }-*/;
  
  public native void m873(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setVertical(Z)(p0);
  }-*/;
  
  public native void m874(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::calculateHorizBoundsAndPositions()();
  }-*/;
  
  public native void m875(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::calculateVertBoundsAndPositions()();
  }-*/;
  
  public native void m876(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native boolean m877(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m878(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m879(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m880(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setSplitAmount(F)(p0);
  }-*/;
  
  public native float m881(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::getSplit()();
  }-*/;
  
  public native void m882(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setMinSplitAmount(F)(p0);
  }-*/;
  
  public native void m883(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setMaxSplitAmount(F)(p0);
  }-*/;
  
  public native void m884(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setFirstWidget(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m885(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::setSecondWidget(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m886(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::addActor(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m887(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, int p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::addActorAt(ILcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native void m888(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::addActorBefore(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native void m889(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::removeActor(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m890(com.badlogic.gdx.scenes.scene2d.ui.SplitPane obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SplitPane::removeActorRecursive(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m891(com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener obj, com.badlogic.gdx.scenes.scene2d.ui.Slider p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener::changed(Lcom/badlogic/gdx/scenes/scene2d/ui/Slider;F)(p0, p1);
  }-*/;
  
  
  
  
  
  
  
  
  public native void m931(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/SelectBox$SelectBoxStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle m932(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::getStyle()();
  }-*/;
  
  public native void m933(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, java.lang.Object[] p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::setItems([Ljava/lang/Object;)(p0);
  }-*/;
  
  public native void m934(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::layout()();
  }-*/;
  
  public native void m935(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native boolean m936(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m937(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m938(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, com.badlogic.gdx.scenes.scene2d.ui.SelectionListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::setSelectionListener(Lcom/badlogic/gdx/scenes/scene2d/ui/SelectionListener;)(p0);
  }-*/;
  
  public native void m939(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::setSelection(I)(p0);
  }-*/;
  
  public native void m940(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::setSelection(Ljava/lang/String;)(p0);
  }-*/;
  
  public native int m941(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::getSelectionIndex()();
  }-*/;
  
  public native java.lang.String m942(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::getSelection()();
  }-*/;
  
  public native float m943(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::getPrefWidth()();
  }-*/;
  
  public native float m944(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::getPrefHeight()();
  }-*/;
  
  public native void m945(com.badlogic.gdx.scenes.scene2d.ui.SelectBox obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.SelectBox::markToRemove(Z)(p0);
  }-*/;
  
  public native void m946(com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard::show(Z)(p0);
  }-*/;
  
  public native void m947(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener obj, com.badlogic.gdx.scenes.scene2d.ui.TextField p0,char p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener::keyTyped(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;C)(p0, p1);
  }-*/;
  
  
  
  
  
  
  
  public native float m958(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::getMinWidth()();
  }-*/;
  
  public native float m959(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::getMinHeight()();
  }-*/;
  
  public native float m960(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::getMaxWidth()();
  }-*/;
  
  public native float m961(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::getMaxHeight()();
  }-*/;
  
  public native void m962(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::invalidate()();
  }-*/;
  
  public native void m963(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::validate()();
  }-*/;
  
  public native boolean m964(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::needsLayout()();
  }-*/;
  
  public native void m965(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::invalidateHierarchy()();
  }-*/;
  
  public native void m966(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::childrenChanged()();
  }-*/;
  
  public native void m967(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::pack()();
  }-*/;
  
  public native void m968(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::setFillParent(Z)(p0);
  }-*/;
  
  public native void m969(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::layout()();
  }-*/;
  
  public native void m970(com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native java.lang.String m993(com.badlogic.gdx.utils.ObjectMap.Entry obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Entry::toString()();
  }-*/;
  
  public native void m998(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj, com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle m999(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::getStyle()();
  }-*/;
  
  public native void m1000(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Label m1001(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::getLabel()();
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1002(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::getLabelCell()();
  }-*/;
  
  public native void m1003(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::setText(Ljava/lang/String;)(p0);
  }-*/;
  
  public native java.lang.CharSequence m1004(com.badlogic.gdx.scenes.scene2d.ui.TextButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextButton::getText()();
  }-*/;
  
  public native void m1019(com.badlogic.gdx.scenes.scene2d.ui.Window obj, com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Window$WindowStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle m1020(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::getStyle()();
  }-*/;
  
  public native int m1021(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::getTitleBarHeight()();
  }-*/;
  
  public native void m1022(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::layout()();
  }-*/;
  
  public native void m1023(com.badlogic.gdx.scenes.scene2d.ui.Window obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::drawBackground(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native boolean m1024(com.badlogic.gdx.scenes.scene2d.ui.Window obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1025(com.badlogic.gdx.scenes.scene2d.ui.Window obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1026(com.badlogic.gdx.scenes.scene2d.ui.Window obj, float p0,float p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::hit(FF)(p0, p1);
  }-*/;
  
  public native void m1027(com.badlogic.gdx.scenes.scene2d.ui.Window obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::setTitle(Ljava/lang/String;)(p0);
  }-*/;
  
  public native java.lang.String m1028(com.badlogic.gdx.scenes.scene2d.ui.Window obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::getTitle()();
  }-*/;
  
  public native void m1029(com.badlogic.gdx.scenes.scene2d.ui.Window obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::setMovable(Z)(p0);
  }-*/;
  
  public native void m1030(com.badlogic.gdx.scenes.scene2d.ui.Window obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Window::setModal(Z)(p0);
  }-*/;
  
  public native boolean m1031(com.badlogic.gdx.utils.ObjectMap.Values obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Values::hasNext()();
  }-*/;
  
  public native java.lang.Object m1032(com.badlogic.gdx.utils.ObjectMap.Values obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Values::next()();
  }-*/;
  
  public native java.util.Iterator m1033(com.badlogic.gdx.utils.ObjectMap.Values obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Values::iterator()();
  }-*/;
  
  public native com.badlogic.gdx.utils.Array m1034(com.badlogic.gdx.utils.ObjectMap.Values obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Values::toArray()();
  }-*/;
  
  public native void m1035(com.badlogic.gdx.utils.ObjectMap.Values obj, com.badlogic.gdx.utils.Array p0) /*-{
  obj.@com.badlogic.gdx.utils.ObjectMap.Values::toArray(Lcom/badlogic/gdx/utils/Array;)(p0);
  }-*/;
  
  public native void m1040(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj, com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle m1041(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::getStyle()();
  }-*/;
  
  public native void m1042(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::updateImage()();
  }-*/;
  
  public native void m1043(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Image m1044(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::getImage()();
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1045(com.badlogic.gdx.scenes.scene2d.ui.ImageButton obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ImageButton::getImageCell()();
  }-*/;
  
  
  
  
  
  
  public native void m1065(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native void m1066(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::drawBackground(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native void m1067(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.math.Matrix4 p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::calculateScissors(Lcom/badlogic/gdx/math/Matrix4;)(p0);
  }-*/;
  
  public native void m1068(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::invalidate()();
  }-*/;
  
  public native float m1069(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getPrefWidth()();
  }-*/;
  
  public native float m1070(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getPrefHeight()();
  }-*/;
  
  public native float m1071(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getMinWidth()();
  }-*/;
  
  public native float m1072(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getMinHeight()();
  }-*/;
  
  public native void m1073(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.graphics.g2d.NinePatch p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::setBackground(Lcom/badlogic/gdx/graphics/g2d/NinePatch;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1074(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getBackgroundPatch()();
  }-*/;
  
  public native void m1075(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::setClip(Z)(p0);
  }-*/;
  
  public native void m1076(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.scenes.scene2d.ui.ClickListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::setClickListener(Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.ClickListener m1077(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getClickListener()();
  }-*/;
  
  public native boolean m1078(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1079(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1080(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, float p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::click(FF)(p0, p1);
  }-*/;
  
  public native int m1081(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, float p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getRow(F)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout m1082(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getTableLayout()();
  }-*/;
  
  public native void m1083(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::clear()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1084(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::register(Ljava/lang/String;Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1085(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::add(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1086(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::add()();
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1087(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::add(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1088(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.scenes.scene2d.Actor[] p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::stack([Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1089(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::newTable()();
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1090(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::row()();
  }-*/;
  
  public native void m1091(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.files.FileHandle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::parse(Lcom/badlogic/gdx/files/FileHandle;)(p0);
  }-*/;
  
  public native void m1092(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::parse(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1093(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::columnDefaults(I)(p0);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1094(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::defaults()();
  }-*/;
  
  public native void m1095(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::layout()();
  }-*/;
  
  public native void m1096(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::reset()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1097(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getWidget(Ljava/lang/String;)(p0);
  }-*/;
  
  public native java.util.List m1098(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getWidgets()();
  }-*/;
  
  public native java.util.List m1099(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getWidgets(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1100(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getCell(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native com.esotericsoftware.tablelayout.Cell m1101(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getCell(Ljava/lang/String;)(p0);
  }-*/;
  
  public native java.util.List m1102(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getAllCells()();
  }-*/;
  
  public native java.util.List m1103(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getAllCells(Ljava/lang/String;)(p0);
  }-*/;
  
  public native java.util.List m1104(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getCells()();
  }-*/;
  
  public native void m1105(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::setWidget(Ljava/lang/String;Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1106(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0,java.lang.String p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::size(Ljava/lang/String;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1107(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0,int p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::size(II)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1108(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::width(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1109(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::width(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1110(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::height(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1111(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::height(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1112(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::pad(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1113(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0,java.lang.String p1,java.lang.String p2,java.lang.String p3) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::pad(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1114(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::pad(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1115(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0,int p1,int p2,int p3) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::pad(IIII)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1116(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padTop(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1117(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padTop(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1118(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padLeft(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1119(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padLeft(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1120(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padBottom(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1121(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padBottom(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1122(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padRight(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1123(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::padRight(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1124(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::align(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1125(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::align(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1126(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::center()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1127(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::top()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1128(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::left()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1129(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::bottom()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1130(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::right()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1131(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::debug()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1132(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, int p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::debug(I)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1133(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::debug(Ljava/lang/String;)(p0);
  }-*/;
  
  public native int m1134(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getDebug()();
  }-*/;
  
  public native java.lang.String m1135(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getHeight()();
  }-*/;
  
  public native java.lang.String m1136(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getPadTop()();
  }-*/;
  
  public native java.lang.String m1137(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getPadLeft()();
  }-*/;
  
  public native java.lang.String m1138(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getPadBottom()();
  }-*/;
  
  public native java.lang.String m1139(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getPadRight()();
  }-*/;
  
  public native int m1140(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::getAlign()();
  }-*/;
  
  public native void m1141(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.scenes.scene2d.ui.Skin p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::setSkin(Lcom/badlogic/gdx/scenes/scene2d/ui/Skin;)(p0);
  }-*/;
  
  public native void m1142(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.assets.AssetManager p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::setAssetManager(Lcom/badlogic/gdx/assets/AssetManager;)(p0);
  }-*/;
  
  public native void m1143(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, com.badlogic.gdx.scenes.scene2d.Stage p0) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::drawDebug(Lcom/badlogic/gdx/scenes/scene2d/Stage;)(p0);
  }-*/;
  
  public native void m1144(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table obj, java.util.List p0,com.badlogic.gdx.graphics.g2d.SpriteBatch p1) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table::drawDebug(Ljava/util/List;Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;)(p0, p1);
  }-*/;
  
  public native void m1163(com.badlogic.gdx.graphics.g2d.TextureRegion obj, com.badlogic.gdx.graphics.Texture p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegion(Lcom/badlogic/gdx/graphics/Texture;)(p0);
  }-*/;
  
  public native void m1164(com.badlogic.gdx.graphics.g2d.TextureRegion obj, int p0,int p1,int p2,int p3) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegion(IIII)(p0, p1, p2, p3);
  }-*/;
  
  public native void m1165(com.badlogic.gdx.graphics.g2d.TextureRegion obj, float p0,float p1,float p2,float p3) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegion(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native void m1166(com.badlogic.gdx.graphics.g2d.TextureRegion obj, com.badlogic.gdx.graphics.g2d.TextureRegion p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegion(Lcom/badlogic/gdx/graphics/g2d/TextureRegion;)(p0);
  }-*/;
  
  public native void m1167(com.badlogic.gdx.graphics.g2d.TextureRegion obj, com.badlogic.gdx.graphics.g2d.TextureRegion p0,int p1,int p2,int p3,int p4) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegion(Lcom/badlogic/gdx/graphics/g2d/TextureRegion;IIII)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Texture m1168(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getTexture()();
  }-*/;
  
  public native void m1169(com.badlogic.gdx.graphics.g2d.TextureRegion obj, com.badlogic.gdx.graphics.Texture p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setTexture(Lcom/badlogic/gdx/graphics/Texture;)(p0);
  }-*/;
  
  public native float m1170(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getU()();
  }-*/;
  
  public native void m1171(com.badlogic.gdx.graphics.g2d.TextureRegion obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setU(F)(p0);
  }-*/;
  
  public native float m1172(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getV()();
  }-*/;
  
  public native void m1173(com.badlogic.gdx.graphics.g2d.TextureRegion obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setV(F)(p0);
  }-*/;
  
  public native float m1174(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getU2()();
  }-*/;
  
  public native void m1175(com.badlogic.gdx.graphics.g2d.TextureRegion obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setU2(F)(p0);
  }-*/;
  
  public native float m1176(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getV2()();
  }-*/;
  
  public native void m1177(com.badlogic.gdx.graphics.g2d.TextureRegion obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setV2(F)(p0);
  }-*/;
  
  public native int m1178(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getRegionX()();
  }-*/;
  
  public native void m1179(com.badlogic.gdx.graphics.g2d.TextureRegion obj, int p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegionX(I)(p0);
  }-*/;
  
  public native int m1180(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getRegionY()();
  }-*/;
  
  public native void m1181(com.badlogic.gdx.graphics.g2d.TextureRegion obj, int p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegionY(I)(p0);
  }-*/;
  
  public native int m1182(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getRegionWidth()();
  }-*/;
  
  public native void m1183(com.badlogic.gdx.graphics.g2d.TextureRegion obj, int p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegionWidth(I)(p0);
  }-*/;
  
  public native int m1184(com.badlogic.gdx.graphics.g2d.TextureRegion obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::getRegionHeight()();
  }-*/;
  
  public native void m1185(com.badlogic.gdx.graphics.g2d.TextureRegion obj, int p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::setRegionHeight(I)(p0);
  }-*/;
  
  public native void m1186(com.badlogic.gdx.graphics.g2d.TextureRegion obj, boolean p0,boolean p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::flip(ZZ)(p0, p1);
  }-*/;
  
  public native void m1187(com.badlogic.gdx.graphics.g2d.TextureRegion obj, float p0,float p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::scroll(FF)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.TextureRegion[][] m1188(com.badlogic.gdx.graphics.g2d.TextureRegion obj, int p0,int p1) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.TextureRegion::split(II)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.TextureRegion[][] m1189(com.badlogic.gdx.graphics.g2d.TextureRegion obj, com.badlogic.gdx.graphics.Texture p0,int p1,int p2) /*-{
  return @com.badlogic.gdx.graphics.g2d.TextureRegion::split(Lcom/badlogic/gdx/graphics/Texture;II)(p0, p1, p2);
  }-*/;
  
  public native void m1198(com.badlogic.gdx.utils.Array obj, java.lang.Object p0) /*-{
  obj.@com.badlogic.gdx.utils.Array::add(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native void m1199(com.badlogic.gdx.utils.Array obj, com.badlogic.gdx.utils.Array p0) /*-{
  obj.@com.badlogic.gdx.utils.Array::addAll(Lcom/badlogic/gdx/utils/Array;)(p0);
  }-*/;
  
  public native void m1200(com.badlogic.gdx.utils.Array obj, com.badlogic.gdx.utils.Array p0,int p1,int p2) /*-{
  obj.@com.badlogic.gdx.utils.Array::addAll(Lcom/badlogic/gdx/utils/Array;II)(p0, p1, p2);
  }-*/;
  
  public native void m1201(com.badlogic.gdx.utils.Array obj, java.lang.Object[] p0) /*-{
  obj.@com.badlogic.gdx.utils.Array::addAll([Ljava/lang/Object;)(p0);
  }-*/;
  
  public native void m1202(com.badlogic.gdx.utils.Array obj, java.lang.Object[] p0,int p1,int p2) /*-{
  obj.@com.badlogic.gdx.utils.Array::addAll([Ljava/lang/Object;II)(p0, p1, p2);
  }-*/;
  
  public native java.lang.Object m1203(com.badlogic.gdx.utils.Array obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.Array::get(I)(p0);
  }-*/;
  
  public native void m1204(com.badlogic.gdx.utils.Array obj, int p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.Array::set(ILjava/lang/Object;)(p0, p1);
  }-*/;
  
  public native void m1205(com.badlogic.gdx.utils.Array obj, int p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.utils.Array::insert(ILjava/lang/Object;)(p0, p1);
  }-*/;
  
  public native boolean m1206(com.badlogic.gdx.utils.Array obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.Array::contains(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native int m1207(com.badlogic.gdx.utils.Array obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.Array::indexOf(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native boolean m1208(com.badlogic.gdx.utils.Array obj, java.lang.Object p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.utils.Array::removeValue(Ljava/lang/Object;Z)(p0, p1);
  }-*/;
  
  public native java.lang.Object m1209(com.badlogic.gdx.utils.Array obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.Array::removeIndex(I)(p0);
  }-*/;
  
  public native java.lang.Object m1210(com.badlogic.gdx.utils.Array obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array::pop()();
  }-*/;
  
  public native java.lang.Object m1211(com.badlogic.gdx.utils.Array obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array::peek()();
  }-*/;
  
  public native void m1212(com.badlogic.gdx.utils.Array obj) /*-{
  obj.@com.badlogic.gdx.utils.Array::clear()();
  }-*/;
  
  public native void m1213(com.badlogic.gdx.utils.Array obj) /*-{
  obj.@com.badlogic.gdx.utils.Array::shrink()();
  }-*/;
  
  public native java.lang.Object[] m1214(com.badlogic.gdx.utils.Array obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.Array::ensureCapacity(I)(p0);
  }-*/;
  
  public native java.lang.Object[] m1215(com.badlogic.gdx.utils.Array obj, int p0) /*-{
  return obj.@com.badlogic.gdx.utils.Array::resize(I)(p0);
  }-*/;
  
  public native void m1216(com.badlogic.gdx.utils.Array obj) /*-{
  obj.@com.badlogic.gdx.utils.Array::sort()();
  }-*/;
  
  public native void m1217(com.badlogic.gdx.utils.Array obj, java.util.Comparator p0) /*-{
  obj.@com.badlogic.gdx.utils.Array::sort(Ljava/util/Comparator;)(p0);
  }-*/;
  
  public native void m1218(com.badlogic.gdx.utils.Array obj) /*-{
  obj.@com.badlogic.gdx.utils.Array::reverse()();
  }-*/;
  
  public native void m1219(com.badlogic.gdx.utils.Array obj) /*-{
  obj.@com.badlogic.gdx.utils.Array::shuffle()();
  }-*/;
  
  public native java.util.Iterator m1220(com.badlogic.gdx.utils.Array obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array::iterator()();
  }-*/;
  
  public native void m1221(com.badlogic.gdx.utils.Array obj, int p0) /*-{
  obj.@com.badlogic.gdx.utils.Array::truncate(I)(p0);
  }-*/;
  
  public native java.lang.Object m1222(com.badlogic.gdx.utils.Array obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array::random()();
  }-*/;
  
  public native java.lang.Object[] m1223(com.badlogic.gdx.utils.Array obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array::toArray()();
  }-*/;
  
  public native java.lang.Object[] m1224(com.badlogic.gdx.utils.Array obj, java.lang.Class p0) /*-{
  return obj.@com.badlogic.gdx.utils.Array::toArray(Ljava/lang/Class;)(p0);
  }-*/;
  
  public native java.lang.String m1225(com.badlogic.gdx.utils.Array obj) /*-{
  return obj.@com.badlogic.gdx.utils.Array::toString()();
  }-*/;
  
  public native java.lang.String m1226(com.badlogic.gdx.utils.Array obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.utils.Array::toString(Ljava/lang/String;)(p0);
  }-*/;
  
  public native void m1247(com.badlogic.gdx.scenes.scene2d.ui.Label obj, com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Label$LabelStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle m1248(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::getStyle()();
  }-*/;
  
  public native void m1249(com.badlogic.gdx.scenes.scene2d.ui.Label obj, java.lang.CharSequence p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setText(Ljava/lang/CharSequence;)(p0);
  }-*/;
  
  public native java.lang.CharSequence m1250(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::getText()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1251(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::getTextBounds()();
  }-*/;
  
  public native void m1252(com.badlogic.gdx.scenes.scene2d.ui.Label obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setWrap(Z)(p0);
  }-*/;
  
  public native void m1253(com.badlogic.gdx.scenes.scene2d.ui.Label obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setAlignment(I)(p0);
  }-*/;
  
  public native void m1254(com.badlogic.gdx.scenes.scene2d.ui.Label obj, int p0,int p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setAlignment(II)(p0, p1);
  }-*/;
  
  public native void m1255(com.badlogic.gdx.scenes.scene2d.ui.Label obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setColor(F)(p0);
  }-*/;
  
  public native void m1256(com.badlogic.gdx.scenes.scene2d.ui.Label obj, com.badlogic.gdx.graphics.Color p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setColor(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native void m1257(com.badlogic.gdx.scenes.scene2d.ui.Label obj, float p0,float p1,float p2,float p3) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::setColor(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m1258(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::getColor()();
  }-*/;
  
  public native void m1259(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::computeBounds()();
  }-*/;
  
  public native void m1260(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::layout()();
  }-*/;
  
  public native void m1261(com.badlogic.gdx.scenes.scene2d.ui.Label obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native float m1262(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::getPrefWidth()();
  }-*/;
  
  public native float m1263(com.badlogic.gdx.scenes.scene2d.ui.Label obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Label::getPrefHeight()();
  }-*/;
  
  
  
  
  
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1279(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0,java.lang.Object p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::wrap(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1280(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0,java.lang.String p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::newWidget(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1281(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0,java.lang.String p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::newInstance(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  public native void m1282(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0,com.badlogic.gdx.scenes.scene2d.Actor p1,java.lang.String p2,java.util.List p3) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::setProperty(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;Lcom/badlogic/gdx/scenes/scene2d/Actor;Ljava/lang/String;Ljava/util/List;)(p0, p1, p2, p3);
  }-*/;
  
  public native java.lang.Object m1283(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0,java.lang.Object p1,java.lang.Class p2,java.lang.String p3,java.lang.String p4) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::convertType(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table m1284(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::newTable(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/Table;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout m1285(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getLayout(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/Table;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1286(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::newStack()();
  }-*/;
  
  public native void m1287(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.scenes.scene2d.Actor p1,java.lang.String p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::addChild(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/scenes/scene2d/Actor;Ljava/lang/String;)(p0, p1, p2);
  }-*/;
  
  public native void m1288(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.scenes.scene2d.Actor p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::removeChild(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0, p1);
  }-*/;
  
  public native int m1289(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getMinWidth(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native int m1290(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getMinHeight(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native int m1291(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getPrefWidth(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native int m1292(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getPrefHeight(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native int m1293(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getMaxWidth(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native int m1294(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::getMaxHeight(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native void m1295(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::clearDebugRectangles(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;)(p0);
  }-*/;
  
  public native void m1296(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit obj, com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout p0,int p1,int p2,int p3,int p4,int p5) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit::addDebugRectangle(Lcom/badlogic/gdx/scenes/scene2d/ui/tablelayout/TableLayout;IIIII)(p0, p1, p2, p3, p4, p5);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m1350(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, com.badlogic.gdx.files.FileHandle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::load(Lcom/badlogic/gdx/files/FileHandle;)(p0);
  }-*/;
  
  public native void m1351(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::addResource(Ljava/lang/String;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native java.lang.Object m1352(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.Class p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getResource(Ljava/lang/String;Ljava/lang/Class;)(p0, p1);
  }-*/;
  
  public native boolean m1353(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.Class p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::hasResource(Ljava/lang/String;Ljava/lang/Class;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1354(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getPatch(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m1355(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getColor(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont m1356(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getFont(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.TextureRegion m1357(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getRegion(Ljava/lang/String;)(p0);
  }-*/;
  
  public native void m1358(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.Object p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::addStyle(Ljava/lang/String;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native java.lang.Object m1359(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.Class p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getStyle(Ljava/lang/Class;)(p0);
  }-*/;
  
  public native java.lang.Object m1360(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.Class p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getStyle(Ljava/lang/String;Ljava/lang/Class;)(p0, p1);
  }-*/;
  
  public native boolean m1361(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.Class p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::hasStyle(Ljava/lang/String;Ljava/lang/Class;)(p0, p1);
  }-*/;
  
  public native java.lang.String m1362(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::findStyleName(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native void m1363(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, com.badlogic.gdx.scenes.scene2d.Actor p0,boolean p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::setEnabled(Lcom/badlogic/gdx/scenes/scene2d/Actor;Z)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1364(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.String p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::newTintedPatch(Ljava/lang/String;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1365(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,com.badlogic.gdx.graphics.Color p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::newTintedPatch(Ljava/lang/String;Lcom/badlogic/gdx/graphics/Color;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1366(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,java.lang.String p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::newTintedRegion(Ljava/lang/String;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1367(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.String p0,com.badlogic.gdx.graphics.Color p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::newTintedRegion(Ljava/lang/String;Lcom/badlogic/gdx/graphics/Color;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gwtref.client.Method m1368(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, java.lang.Class p0,java.lang.String p1) /*-{
  return @com.badlogic.gdx.scenes.scene2d.ui.Skin::findMethod(Ljava/lang/Class;Ljava/lang/String;)(p0, p1);
  }-*/;
  
  public native void m1369(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, com.badlogic.gdx.graphics.Texture p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::setTexture(Lcom/badlogic/gdx/graphics/Texture;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Texture m1370(com.badlogic.gdx.scenes.scene2d.ui.Skin obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getTexture()();
  }-*/;
  
  public native void m1371(com.badlogic.gdx.scenes.scene2d.ui.Skin obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::dispose()();
  }-*/;
  
  public native void m1372(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, com.badlogic.gdx.files.FileHandle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::save(Lcom/badlogic/gdx/files/FileHandle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.utils.Json m1373(com.badlogic.gdx.scenes.scene2d.ui.Skin obj, com.badlogic.gdx.files.FileHandle p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Skin::getJsonLoader(Lcom/badlogic/gdx/files/FileHandle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1382(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, com.badlogic.gdx.scenes.scene2d.Actor p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::register(Lcom/badlogic/gdx/scenes/scene2d/Actor;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.Actor m1383(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::getWidget(Ljava/lang/String;)(p0);
  }-*/;
  
  public native void m1384(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::layout()();
  }-*/;
  
  public native void m1385(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::invalidateHierarchy()();
  }-*/;
  
  public native void m1386(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, com.badlogic.gdx.scenes.scene2d.Actor p0,com.badlogic.gdx.math.Vector2 p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::toStageCoordinates(Lcom/badlogic/gdx/scenes/scene2d/Actor;Lcom/badlogic/gdx/math/Vector2;)(p0, p1);
  }-*/;
  
  public native void m1387(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout::drawDebug(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;)(p0);
  }-*/;
  
  public native int m1412(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, char p0) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::getKerning(C)(p0);
  }-*/;
  
  public native void m1413(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph obj, int p0,int p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph::setKerning(II)(p0, p1);
  }-*/;
  
  public native boolean m1414(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter obj, com.badlogic.gdx.scenes.scene2d.ui.TextField p0,char p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter::acceptChar(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;C)(p0, p1);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native boolean m1450(com.badlogic.gdx.utils.ObjectMap.Keys obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Keys::hasNext()();
  }-*/;
  
  public native java.lang.Object m1451(com.badlogic.gdx.utils.ObjectMap.Keys obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Keys::next()();
  }-*/;
  
  public native java.util.Iterator m1452(com.badlogic.gdx.utils.ObjectMap.Keys obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Keys::iterator()();
  }-*/;
  
  public native com.badlogic.gdx.utils.Array m1453(com.badlogic.gdx.utils.ObjectMap.Keys obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Keys::toArray()();
  }-*/;
  
  public native void m1480(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, int p0,com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::setGlyph(ILcom/badlogic/gdx/graphics/g2d/BitmapFont$Glyph;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph m1481(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::getFirstGlyph()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph m1482(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj, char p0) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::getGlyph(C)(p0);
  }-*/;
  
  public native java.lang.String m1483(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::getImagePath()();
  }-*/;
  
  public native com.badlogic.gdx.files.FileHandle m1484(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData::getFontFile()();
  }-*/;
  
  public native void m1489(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds obj, com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds::set(Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;)(p0);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native boolean m1537(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj, com.badlogic.gdx.math.Rectangle p0) /*-{
  return @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::pushScissors(Lcom/badlogic/gdx/math/Rectangle;)(p0);
  }-*/;
  
  public native void m1538(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::popScissors()();
  }-*/;
  
  public native void m1539(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj, com.badlogic.gdx.math.Rectangle p0) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::fix(Lcom/badlogic/gdx/math/Rectangle;)(p0);
  }-*/;
  
  public native void m1540(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj, com.badlogic.gdx.graphics.Camera p0,com.badlogic.gdx.math.Matrix4 p1,com.badlogic.gdx.math.Rectangle p2,com.badlogic.gdx.math.Rectangle p3) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::calculateScissors(Lcom/badlogic/gdx/graphics/Camera;Lcom/badlogic/gdx/math/Matrix4;Lcom/badlogic/gdx/math/Rectangle;Lcom/badlogic/gdx/math/Rectangle;)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.math.Rectangle m1541(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj) /*-{
  return @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::getViewport()();
  }-*/;
  
  public native void m1542(com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack obj, com.badlogic.gdx.graphics.Camera p0,com.badlogic.gdx.math.Matrix4 p1,com.badlogic.gdx.math.Vector2 p2) /*-{
  @com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack::toWindowCoordinates(Lcom/badlogic/gdx/graphics/Camera;Lcom/badlogic/gdx/math/Matrix4;Lcom/badlogic/gdx/math/Vector2;)(p0, p1, p2);
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Entry m1545(com.badlogic.gdx.utils.ObjectMap.Entries obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Entries::next()();
  }-*/;
  
  public native boolean m1546(com.badlogic.gdx.utils.ObjectMap.Entries obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Entries::hasNext()();
  }-*/;
  
  public native java.util.Iterator m1547(com.badlogic.gdx.utils.ObjectMap.Entries obj) /*-{
  return obj.@com.badlogic.gdx.utils.ObjectMap.Entries::iterator()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[] m1554(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment obj) /*-{
  return @com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment::values()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment m1555(com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment obj, java.lang.String p0) /*-{
  return @com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment::valueOf(Ljava/lang/String;)(p0);
  }-*/;
  
  public native void m1582(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::load(Lcom/badlogic/gdx/graphics/g2d/BitmapFont$BitmapFontData;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1583(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,java.lang.CharSequence p1,float p2,float p3) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;Ljava/lang/CharSequence;FF)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1584(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,java.lang.CharSequence p1,float p2,float p3,int p4,int p5) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;Ljava/lang/CharSequence;FFII)(p0, p1, p2, p3, p4, p5);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1585(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,java.lang.CharSequence p1,float p2,float p3) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::drawMultiLine(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;Ljava/lang/CharSequence;FF)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1586(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,java.lang.CharSequence p1,float p2,float p3,float p4,com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment p5) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::drawMultiLine(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;Ljava/lang/CharSequence;FFFLcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;)(p0, p1, p2, p3, p4, p5);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1587(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,java.lang.CharSequence p1,float p2,float p3,float p4) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::drawWrapped(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;Ljava/lang/CharSequence;FFF)(p0, p1, p2, p3, p4);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1588(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,java.lang.CharSequence p1,float p2,float p3,float p4,com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment p5) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::drawWrapped(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;Ljava/lang/CharSequence;FFFLcom/badlogic/gdx/graphics/g2d/BitmapFont$HAlignment;)(p0, p1, p2, p3, p4, p5);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1589(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getBounds(Ljava/lang/CharSequence;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1590(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds p1) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getBounds(Ljava/lang/CharSequence;Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1591(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,int p1,int p2) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getBounds(Ljava/lang/CharSequence;II)(p0, p1, p2);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1592(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,int p1,int p2,com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds p3) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getBounds(Ljava/lang/CharSequence;IILcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1593(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getMultiLineBounds(Ljava/lang/CharSequence;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1594(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds p1) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getMultiLineBounds(Ljava/lang/CharSequence;Lcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1595(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,float p1) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getWrappedBounds(Ljava/lang/CharSequence;F)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds m1596(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,float p1,com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds p2) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getWrappedBounds(Ljava/lang/CharSequence;FLcom/badlogic/gdx/graphics/g2d/BitmapFont$TextBounds;)(p0, p1, p2);
  }-*/;
  
  public native void m1597(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,com.badlogic.gdx.utils.FloatArray p1,com.badlogic.gdx.utils.FloatArray p2) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::computeGlyphAdvancesAndPositions(Ljava/lang/CharSequence;Lcom/badlogic/gdx/utils/FloatArray;Lcom/badlogic/gdx/utils/FloatArray;)(p0, p1, p2);
  }-*/;
  
  public native int m1598(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,int p1,int p2,float p3) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::computeVisibleGlyphs(Ljava/lang/CharSequence;IIF)(p0, p1, p2, p3);
  }-*/;
  
  public native void m1599(com.badlogic.gdx.graphics.g2d.BitmapFont obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setColor(F)(p0);
  }-*/;
  
  public native void m1600(com.badlogic.gdx.graphics.g2d.BitmapFont obj, com.badlogic.gdx.graphics.Color p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setColor(Lcom/badlogic/gdx/graphics/Color;)(p0);
  }-*/;
  
  public native void m1601(com.badlogic.gdx.graphics.g2d.BitmapFont obj, float p0,float p1,float p2,float p3) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setColor(FFFF)(p0, p1, p2, p3);
  }-*/;
  
  public native com.badlogic.gdx.graphics.Color m1602(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getColor()();
  }-*/;
  
  public native void m1603(com.badlogic.gdx.graphics.g2d.BitmapFont obj, float p0,float p1) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setScale(FF)(p0, p1);
  }-*/;
  
  public native void m1604(com.badlogic.gdx.graphics.g2d.BitmapFont obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setScale(F)(p0);
  }-*/;
  
  public native void m1605(com.badlogic.gdx.graphics.g2d.BitmapFont obj, float p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::scale(F)(p0);
  }-*/;
  
  public native float m1606(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getScaleX()();
  }-*/;
  
  public native float m1607(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getScaleY()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.TextureRegion m1608(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getRegion()();
  }-*/;
  
  public native float m1609(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getLineHeight()();
  }-*/;
  
  public native float m1610(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getSpaceWidth()();
  }-*/;
  
  public native float m1611(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getXHeight()();
  }-*/;
  
  public native float m1612(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getCapHeight()();
  }-*/;
  
  public native float m1613(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getAscent()();
  }-*/;
  
  public native float m1614(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getDescent()();
  }-*/;
  
  public native boolean m1615(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::isFlipped()();
  }-*/;
  
  public native void m1616(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::dispose()();
  }-*/;
  
  public native void m1617(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setFixedWidthGlyphs(Ljava/lang/CharSequence;)(p0);
  }-*/;
  
  public native boolean m1618(com.badlogic.gdx.graphics.g2d.BitmapFont obj, char p0) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::containsCharacter(C)(p0);
  }-*/;
  
  public native void m1619(com.badlogic.gdx.graphics.g2d.BitmapFont obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::setUseIntegerPositions(Z)(p0);
  }-*/;
  
  public native boolean m1620(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::usesIntegerPositions()();
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData m1621(com.badlogic.gdx.graphics.g2d.BitmapFont obj) /*-{
  return obj.@com.badlogic.gdx.graphics.g2d.BitmapFont::getData()();
  }-*/;
  
  public native int m1622(com.badlogic.gdx.graphics.g2d.BitmapFont obj, java.lang.CharSequence p0,char p1,int p2) /*-{
  return @com.badlogic.gdx.graphics.g2d.BitmapFont::indexOf(Ljava/lang/CharSequence;CI)(p0, p1, p2);
  }-*/;
  
  public native boolean m1623(com.badlogic.gdx.graphics.g2d.BitmapFont obj, char p0) /*-{
  return @com.badlogic.gdx.graphics.g2d.BitmapFont::isWhitespace(C)(p0);
  }-*/;
  
  public native java.lang.String m1642(com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard::getContents()();
  }-*/;
  
  public native void m1643(com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard::setContents(Ljava/lang/String;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard m1644(com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard obj) /*-{
  return @com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard::getDefaultClipboard()();
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m1758(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, com.badlogic.gdx.scenes.scene2d.ui.Button p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::add(Lcom/badlogic/gdx/scenes/scene2d/ui/Button;)(p0);
  }-*/;
  
  public native void m1759(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, com.badlogic.gdx.scenes.scene2d.ui.Button[] p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::add([Lcom/badlogic/gdx/scenes/scene2d/ui/Button;)(p0);
  }-*/;
  
  public native void m1760(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, java.lang.String p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::setChecked(Ljava/lang/String;)(p0);
  }-*/;
  
  public native boolean m1761(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, com.badlogic.gdx.scenes.scene2d.ui.Button p0,boolean p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::canCheck(Lcom/badlogic/gdx/scenes/scene2d/ui/Button;Z)(p0, p1);
  }-*/;
  
  public native void m1762(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::uncheckAll()();
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Button m1763(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::getChecked()();
  }-*/;
  
  public native com.badlogic.gdx.utils.Array m1764(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::getAllChecked()();
  }-*/;
  
  public native com.badlogic.gdx.utils.Array m1765(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::getButtons()();
  }-*/;
  
  public native void m1766(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::setMinCheckCount(I)(p0);
  }-*/;
  
  public native void m1767(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::setMaxCheckCount(I)(p0);
  }-*/;
  
  public native void m1768(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, com.badlogic.gdx.scenes.scene2d.ui.ClickListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::setClickListener(Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;)(p0);
  }-*/;
  
  public native void m1769(com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup::setUncheckLast(Z)(p0);
  }-*/;
  
  public native java.lang.Object m1786(com.badlogic.gdx.utils.OrderedMap obj, java.lang.Object p0,java.lang.Object p1) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::put(Ljava/lang/Object;Ljava/lang/Object;)(p0, p1);
  }-*/;
  
  public native java.lang.Object m1787(com.badlogic.gdx.utils.OrderedMap obj, java.lang.Object p0) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::remove(Ljava/lang/Object;)(p0);
  }-*/;
  
  public native void m1788(com.badlogic.gdx.utils.OrderedMap obj) /*-{
  obj.@com.badlogic.gdx.utils.OrderedMap::clear()();
  }-*/;
  
  public native com.badlogic.gdx.utils.Array m1789(com.badlogic.gdx.utils.OrderedMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::orderedKeys()();
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Entries m1790(com.badlogic.gdx.utils.OrderedMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::entries()();
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Keys m1791(com.badlogic.gdx.utils.OrderedMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::keys()();
  }-*/;
  
  public native com.badlogic.gdx.utils.ObjectMap.Values m1792(com.badlogic.gdx.utils.OrderedMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::values()();
  }-*/;
  
  public native java.lang.String m1793(com.badlogic.gdx.utils.OrderedMap obj) /*-{
  return obj.@com.badlogic.gdx.utils.OrderedMap::toString()();
  }-*/;
  
  public native void m1798(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj, com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle m1799(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::getStyle()();
  }-*/;
  
  public native void m1800(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Image m1801(com.badlogic.gdx.scenes.scene2d.ui.CheckBox obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.CheckBox::getImage()();
  }-*/;
  
  public native void m1818(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Slider$SliderStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle m1819(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::getStyle()();
  }-*/;
  
  public native void m1820(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native boolean m1821(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1822(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1823(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1824(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::calculatePositionAndValue(F)(p0);
  }-*/;
  
  public native boolean m1825(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::isDragging()();
  }-*/;
  
  public native void m1826(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::setValueChangedListener(Lcom/badlogic/gdx/scenes/scene2d/ui/Slider$ValueChangedListener;)(p0);
  }-*/;
  
  public native float m1827(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::getValue()();
  }-*/;
  
  public native void m1828(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, float p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::setValue(F)(p0);
  }-*/;
  
  public native void m1829(com.badlogic.gdx.scenes.scene2d.ui.Slider obj, float p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::setRange(FF)(p0, p1);
  }-*/;
  
  public native float m1830(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::getPrefWidth()();
  }-*/;
  
  public native float m1831(com.badlogic.gdx.scenes.scene2d.ui.Slider obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Slider::getPrefHeight()();
  }-*/;
  
  public native void m1840(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::initialize()();
  }-*/;
  
  public native void m1841(com.badlogic.gdx.scenes.scene2d.ui.Button obj, boolean p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::setChecked(Z)(p0);
  }-*/;
  
  public native boolean m1842(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::isChecked()();
  }-*/;
  
  public native void m1843(com.badlogic.gdx.scenes.scene2d.ui.Button obj, com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/Button$ButtonStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle m1844(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::getStyle()();
  }-*/;
  
  public native void m1845(com.badlogic.gdx.scenes.scene2d.ui.Button obj, com.badlogic.gdx.scenes.scene2d.ui.ClickListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::setClickListener(Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;)(p0);
  }-*/;
  
  public native void m1846(com.badlogic.gdx.scenes.scene2d.ui.Button obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native float m1847(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::getPrefWidth()();
  }-*/;
  
  public native float m1848(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::getPrefHeight()();
  }-*/;
  
  public native float m1849(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::getMinWidth()();
  }-*/;
  
  public native float m1850(com.badlogic.gdx.scenes.scene2d.ui.Button obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Button::getMinHeight()();
  }-*/;
  
  public native void m1871(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::layout()();
  }-*/;
  
  public native void m1872(com.badlogic.gdx.scenes.scene2d.ui.Image obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native void m1873(com.badlogic.gdx.scenes.scene2d.ui.Image obj, com.badlogic.gdx.graphics.g2d.TextureRegion p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::setRegion(Lcom/badlogic/gdx/graphics/g2d/TextureRegion;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.TextureRegion m1874(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getRegion()();
  }-*/;
  
  public native void m1875(com.badlogic.gdx.scenes.scene2d.ui.Image obj, com.badlogic.gdx.graphics.g2d.NinePatch p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::setPatch(Lcom/badlogic/gdx/graphics/g2d/NinePatch;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.graphics.g2d.NinePatch m1876(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getPatch()();
  }-*/;
  
  public native void m1877(com.badlogic.gdx.scenes.scene2d.ui.Image obj, com.badlogic.gdx.utils.Scaling p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::setScaling(Lcom/badlogic/gdx/utils/Scaling;)(p0);
  }-*/;
  
  public native void m1878(com.badlogic.gdx.scenes.scene2d.ui.Image obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::setAlign(I)(p0);
  }-*/;
  
  public native float m1879(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getMinWidth()();
  }-*/;
  
  public native float m1880(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getMinHeight()();
  }-*/;
  
  public native float m1881(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getPrefWidth()();
  }-*/;
  
  public native float m1882(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getPrefHeight()();
  }-*/;
  
  public native boolean m1883(com.badlogic.gdx.scenes.scene2d.ui.Image obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1884(com.badlogic.gdx.scenes.scene2d.ui.Image obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::touchUp(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1885(com.badlogic.gdx.scenes.scene2d.ui.Image obj, float p0,float p1,int p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::touchDragged(FFI)(p0, p1, p2);
  }-*/;
  
  public native void m1886(com.badlogic.gdx.scenes.scene2d.ui.Image obj, com.badlogic.gdx.scenes.scene2d.ui.ClickListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::setClickListener(Lcom/badlogic/gdx/scenes/scene2d/ui/ClickListener;)(p0);
  }-*/;
  
  public native float m1887(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getImageX()();
  }-*/;
  
  public native float m1888(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getImageY()();
  }-*/;
  
  public native float m1889(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getImageWidth()();
  }-*/;
  
  public native float m1890(com.badlogic.gdx.scenes.scene2d.ui.Image obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.Image::getImageHeight()();
  }-*/;
  
  public native void m1891(com.badlogic.gdx.scenes.scene2d.ui.ClickListener obj, com.badlogic.gdx.scenes.scene2d.Actor p0,float p1,float p2) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.ClickListener::click(Lcom/badlogic/gdx/scenes/scene2d/Actor;FF)(p0, p1, p2);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native void m1946(com.badlogic.gdx.scenes.scene2d.ui.List obj, com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.List::setStyle(Lcom/badlogic/gdx/scenes/scene2d/ui/List$ListStyle;)(p0);
  }-*/;
  
  public native com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle m1947(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::getStyle()();
  }-*/;
  
  public native void m1948(com.badlogic.gdx.scenes.scene2d.ui.List obj, com.badlogic.gdx.graphics.g2d.SpriteBatch p0,float p1) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.List::draw(Lcom/badlogic/gdx/graphics/g2d/SpriteBatch;F)(p0, p1);
  }-*/;
  
  public native boolean m1949(com.badlogic.gdx.scenes.scene2d.ui.List obj, float p0,float p1,int p2) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::touchDown(FFI)(p0, p1, p2);
  }-*/;
  
  public native int m1950(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::getSelectedIndex()();
  }-*/;
  
  public native void m1951(com.badlogic.gdx.scenes.scene2d.ui.List obj, int p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.List::setSelectedIndex(I)(p0);
  }-*/;
  
  public native java.lang.String m1952(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::getSelection()();
  }-*/;
  
  public native int m1953(com.badlogic.gdx.scenes.scene2d.ui.List obj, java.lang.String p0) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::setSelection(Ljava/lang/String;)(p0);
  }-*/;
  
  public native void m1954(com.badlogic.gdx.scenes.scene2d.ui.List obj, java.lang.Object[] p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.List::setItems([Ljava/lang/Object;)(p0);
  }-*/;
  
  public native java.lang.String[] m1955(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::getItems()();
  }-*/;
  
  public native float m1956(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::getPrefWidth()();
  }-*/;
  
  public native float m1957(com.badlogic.gdx.scenes.scene2d.ui.List obj) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.List::getPrefHeight()();
  }-*/;
  
  public native void m1958(com.badlogic.gdx.scenes.scene2d.ui.List obj, com.badlogic.gdx.scenes.scene2d.ui.SelectionListener p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.List::setSelectionListener(Lcom/badlogic/gdx/scenes/scene2d/ui/SelectionListener;)(p0);
  }-*/;
  
  public native void m1959(com.badlogic.gdx.scenes.scene2d.ui.List obj, com.badlogic.gdx.math.Rectangle p0) /*-{
  obj.@com.badlogic.gdx.scenes.scene2d.ui.List::setCullingArea(Lcom/badlogic/gdx/math/Rectangle;)(p0);
  }-*/;
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public native boolean m2060(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter obj, com.badlogic.gdx.scenes.scene2d.ui.TextField p0,char p1) /*-{
  return obj.@com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter::acceptChar(Lcom/badlogic/gdx/scenes/scene2d/ui/TextField;C)(p0, p1);
  }-*/;
  
  
  
  
  
  
  public Collection<Type> getKnownTypes() {
  	return types.values();
  }
  public Type forName(String name) {
  	return types.get(name);
  }
  public Object newArray (Class componentType, int size) {
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField[size];
     if(componentType.getName().equals("java.lang.StringBuffer")) return new java.lang.StringBuffer[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.ObjectMap")) return new com.badlogic.gdx.utils.ObjectMap[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button[]")) return new com.badlogic.gdx.scenes.scene2d.ui.Button[size][];
     if(componentType.getName().equals("java.lang.Integer")) return new java.lang.Integer[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[]")) return new com.badlogic.gdx.graphics.g2d.TextureRegion[size][];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Widget")) return new com.badlogic.gdx.scenes.scene2d.ui.Widget[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFontCache")) return new com.badlogic.gdx.graphics.g2d.BitmapFontCache[size];
     if(componentType.getName().equals("byte[][]")) return new byte[size][][];
     if(componentType.getName().equals("java.lang.Object")) return new java.lang.Object[size];
     if(componentType.getName().equals("byte[]")) return new byte[size][];
     if(componentType.getName().equals("java.lang.Object[]")) return new java.lang.Object[size][];
     if(componentType.getName().equals("java.util.Map")) return new java.util.Map[size];
     if(componentType.getName().equals("char[]")) return new char[size][];
     if(componentType.getName().equals("java.util.HashMap")) return new java.util.HashMap[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.Disposable")) return new com.badlogic.gdx.utils.Disposable[size];
     if(componentType.getName().equals("long")) return new long[size];
     if(componentType.getName().equals("java.lang.StringBuilder")) return new java.lang.StringBuilder[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.ArrayMap")) return new com.badlogic.gdx.utils.ArrayMap[size];
     if(componentType.getName().equals("float")) return new float[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ScrollPane")) return new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.Color")) return new com.badlogic.gdx.graphics.Color[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.Array.ArrayIterator")) return new com.badlogic.gdx.utils.Array.ArrayIterator[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][]")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[size][][];
     if(componentType.getName().equals("java.lang.Boolean")) return new java.lang.Boolean[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.NinePatch")) return new com.badlogic.gdx.graphics.g2d.NinePatch[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane")) return new com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SelectionListener")) return new com.badlogic.gdx.scenes.scene2d.ui.SelectionListener[size];
     if(componentType.getName().equals("java.lang.Float")) return new java.lang.Float[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Stack")) return new com.badlogic.gdx.scenes.scene2d.ui.Stack[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SplitPane")) return new com.badlogic.gdx.scenes.scene2d.ui.SplitPane[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener")) return new com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SelectBox")) return new com.badlogic.gdx.scenes.scene2d.ui.SelectBox[size];
     if(componentType.getName().equals("double")) return new double[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase")) return new com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase[size];
     if(componentType.getName().equals("java.lang.StringIndexOutOfBoundsException")) return new java.lang.StringIndexOutOfBoundsException[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup")) return new com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.ObjectMap.Entry")) return new com.badlogic.gdx.utils.ObjectMap.Entry[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextButton")) return new com.badlogic.gdx.scenes.scene2d.ui.TextButton[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Window")) return new com.badlogic.gdx.scenes.scene2d.ui.Window[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.ObjectMap.Values")) return new com.badlogic.gdx.utils.ObjectMap.Values[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ImageButton")) return new com.badlogic.gdx.scenes.scene2d.ui.ImageButton[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[][]")) return new com.badlogic.gdx.graphics.g2d.TextureRegion[size][][];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table")) return new com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle[size];
     if(componentType.getName().equals("int")) return new int[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion")) return new com.badlogic.gdx.graphics.g2d.TextureRegion[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.Array")) return new com.badlogic.gdx.utils.Array[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Label")) return new com.badlogic.gdx.scenes.scene2d.ui.Label[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle[size];
     if(componentType.getName().equals("java.lang.String[]")) return new java.lang.String[size][];
     if(componentType.getName().equals("char")) return new char[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit")) return new com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer[size];
     if(componentType.getName().equals("short")) return new short[size];
     if(componentType.getName().equals("java.lang.Double")) return new java.lang.Double[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Skin")) return new com.badlogic.gdx.scenes.scene2d.ui.Skin[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout")) return new com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle[size];
     if(componentType.getName().equals("int[]")) return new int[size][];
     if(componentType.getName().equals("java.lang.Byte")) return new java.lang.Byte[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.ObjectMap.Keys")) return new com.badlogic.gdx.utils.ObjectMap.Keys[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer[size];
     if(componentType.getName().equals("java.util.ArrayList")) return new java.util.ArrayList[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack")) return new com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack[size];
     if(componentType.getName().equals("boolean")) return new boolean[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.ObjectMap.Entries")) return new com.badlogic.gdx.utils.ObjectMap.Entries[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont")) return new com.badlogic.gdx.graphics.g2d.BitmapFont[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard")) return new com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer[size];
     if(componentType.getName().equals("java.lang.String")) return new java.lang.String[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup")) return new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.utils.OrderedMap")) return new com.badlogic.gdx.utils.OrderedMap[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.CheckBox")) return new com.badlogic.gdx.scenes.scene2d.ui.CheckBox[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Slider")) return new com.badlogic.gdx.scenes.scene2d.ui.Slider[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button")) return new com.badlogic.gdx.scenes.scene2d.ui.Button[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Image")) return new com.badlogic.gdx.scenes.scene2d.ui.Image[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ClickListener")) return new com.badlogic.gdx.scenes.scene2d.ui.ClickListener[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer[size];
     if(componentType.getName().equals("byte")) return new byte[size];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer[size];
     if(componentType.getName().equals("float[]")) return new float[size][];
     if(componentType.getName().equals("com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Align")) return new com.badlogic.gdx.scenes.scene2d.ui.Align[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch")) return new com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.List")) return new com.badlogic.gdx.scenes.scene2d.ui.List[size];
     if(componentType.getName().equals("java.lang.Short")) return new java.lang.Short[size];
     if(componentType.getName().equals("java.lang.Character")) return new java.lang.Character[size];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter[size];
     if(componentType.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[]")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[size][];
     if(componentType.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle[size];
  	return null;
  }
  public Object newInstance (Type type) {
  if(type.getName().equals("java.lang.StringBuffer")) return new java.lang.StringBuffer();
  if(type.getName().equals("com.badlogic.gdx.utils.ObjectMap")) return new com.badlogic.gdx.utils.ObjectMap();
  if(type.getName().equals("java.lang.Object")) return new java.lang.Object();
  if(type.getName().equals("java.util.HashMap")) return new java.util.HashMap();
  if(type.getName().equals("java.lang.StringBuilder")) return new java.lang.StringBuilder();
  if(type.getName().equals("com.badlogic.gdx.utils.ArrayMap")) return new com.badlogic.gdx.utils.ArrayMap();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Integer_CustomFieldSerializer();
  if(type.getName().equals("com.badlogic.gdx.graphics.Color")) return new com.badlogic.gdx.graphics.Color();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle();
  if(type.getName().equals("com.badlogic.gdx.graphics.g2d.NinePatch")) return new com.badlogic.gdx.graphics.g2d.NinePatch();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane")) return new com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Stack")) return new com.badlogic.gdx.scenes.scene2d.ui.Stack();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.String_CustomFieldSerializer();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.util.ArrayList_CustomFieldSerializer();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase")) return new com.google.gwt.user.client.rpc.core.java.util.Map_CustomFieldSerializerBase();
  if(type.getName().equals("java.lang.StringIndexOutOfBoundsException")) return new java.lang.StringIndexOutOfBoundsException();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Byte_CustomFieldSerializer();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Short_CustomFieldSerializer();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle();
  if(type.getName().equals("com.badlogic.gdx.utils.ObjectMap.Entry")) return new com.badlogic.gdx.utils.ObjectMap.Entry();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table")) return new com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle();
  if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion")) return new com.badlogic.gdx.graphics.g2d.TextureRegion();
  if(type.getName().equals("com.badlogic.gdx.utils.Array")) return new com.badlogic.gdx.utils.Array();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit")) return new com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Double_CustomFieldSerializer();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Skin")) return new com.badlogic.gdx.scenes.scene2d.ui.Skin();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout")) return new com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout();
  if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle();
  if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData();
  if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds")) return new com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Float_CustomFieldSerializer();
  if(type.getName().equals("java.util.ArrayList")) return new java.util.ArrayList();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack")) return new com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack();
  if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont")) return new com.badlogic.gdx.graphics.g2d.BitmapFont();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Character_CustomFieldSerializer();
  if(type.getName().equals("java.lang.String")) return new java.lang.String();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup")) return new com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle();
  if(type.getName().equals("com.badlogic.gdx.utils.OrderedMap")) return new com.badlogic.gdx.utils.OrderedMap();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Image")) return new com.badlogic.gdx.scenes.scene2d.ui.Image();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Object_Array_CustomFieldSerializer();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.lang.Boolean_CustomFieldSerializer();
  if(type.getName().equals("com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer")) return new com.google.gwt.user.client.rpc.core.java.util.HashMap_CustomFieldSerializer();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Align")) return new com.badlogic.gdx.scenes.scene2d.ui.Align();
  if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle")) return new com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle();
  return null;
  }
  public int getArrayLength(Type type, Object obj) {
     if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button[]")) return ((com.badlogic.gdx.scenes.scene2d.ui.Button[])obj).length;
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[]")) return ((com.badlogic.gdx.graphics.g2d.TextureRegion[])obj).length;
     if(type.getName().equals("byte[][]")) return ((byte[][])obj).length;
     if(type.getName().equals("byte[]")) return ((byte[])obj).length;
     if(type.getName().equals("java.lang.Object[]")) return ((java.lang.Object[])obj).length;
     if(type.getName().equals("char[]")) return ((char[])obj).length;
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][]")) return ((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][])obj).length;
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[][]")) return ((com.badlogic.gdx.graphics.g2d.TextureRegion[][])obj).length;
     if(type.getName().equals("java.lang.String[]")) return ((java.lang.String[])obj).length;
     if(type.getName().equals("int[]")) return ((int[])obj).length;
     if(type.getName().equals("float[]")) return ((float[])obj).length;
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[]")) return ((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[])obj).length;
  	return 0;
  }
  public Object getArrayElement(Type type, Object obj, int i) {
     if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button[]")) return ((com.badlogic.gdx.scenes.scene2d.ui.Button[])obj)[i];
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[]")) return ((com.badlogic.gdx.graphics.g2d.TextureRegion[])obj)[i];
     if(type.getName().equals("byte[][]")) return ((byte[][])obj)[i];
     if(type.getName().equals("byte[]")) return ((byte[])obj)[i];
     if(type.getName().equals("java.lang.Object[]")) return ((java.lang.Object[])obj)[i];
     if(type.getName().equals("char[]")) return ((char[])obj)[i];
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][]")) return ((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][])obj)[i];
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[][]")) return ((com.badlogic.gdx.graphics.g2d.TextureRegion[][])obj)[i];
     if(type.getName().equals("java.lang.String[]")) return ((java.lang.String[])obj)[i];
     if(type.getName().equals("int[]")) return ((int[])obj)[i];
     if(type.getName().equals("float[]")) return ((float[])obj)[i];
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[]")) return ((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[])obj)[i];
  	return null;
  }
  public void setArrayElement(Type type, Object obj, int i, Object value) {
     if(type.getName().equals("com.badlogic.gdx.scenes.scene2d.ui.Button[]")) ((com.badlogic.gdx.scenes.scene2d.ui.Button[])obj)[i] = (com.badlogic.gdx.scenes.scene2d.ui.Button)value;
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[]")) ((com.badlogic.gdx.graphics.g2d.TextureRegion[])obj)[i] = (com.badlogic.gdx.graphics.g2d.TextureRegion)value;
     if(type.getName().equals("byte[][]")) ((byte[][])obj)[i] = (byte[])value;
     if(type.getName().equals("byte[]")) ((byte[])obj)[i] = ((Number)value).byteValue();
     if(type.getName().equals("java.lang.Object[]")) ((java.lang.Object[])obj)[i] = (java.lang.Object)value;
     if(type.getName().equals("char[]")) ((char[])obj)[i] = ((Character)value).charValue();
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][]")) ((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[][])obj)[i] = (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph[])value;
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.TextureRegion[][]")) ((com.badlogic.gdx.graphics.g2d.TextureRegion[][])obj)[i] = (com.badlogic.gdx.graphics.g2d.TextureRegion[])value;
     if(type.getName().equals("java.lang.String[]")) ((java.lang.String[])obj)[i] = (java.lang.String)value;
     if(type.getName().equals("int[]")) ((int[])obj)[i] = ((Number)value).intValue();
     if(type.getName().equals("float[]")) ((float[])obj)[i] = ((Number)value).floatValue();
     if(type.getName().equals("com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[]")) ((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment[])obj)[i] = (com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)value;
  }
  public Object get(Field field, Object obj) throws IllegalAccessException {
     if(field.getter.equals("g1")) return g1((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g3")) return g3((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g5")) return g5((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g7")) return g7((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g9")) return g9((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g11")) return g11((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g13")) return g13((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g15")) return g15((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g17")) return g17((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g19")) return g19((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g21")) return g21((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g23")) return g23((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g25")) return g25((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g27")) return g27((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g29")) return g29((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g31")) return g31((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g33")) return g33((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g35")) return g35((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g37")) return g37((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g39")) return g39((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g41")) return g41((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g43")) return g43((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g45")) return g45((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g47")) return g47((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g49")) return g49((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g51")) return g51((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g53")) return g53((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g55")) return g55((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g59")) return g59((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g61")) return g61((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g63")) return g63((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g65")) return g65((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g67")) return g67((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
     if(field.getter.equals("g149")) return g149((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g151")) return g151((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g153")) return g153((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g155")) return g155((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g157")) return g157((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g159")) return g159((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g161")) return g161((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g163")) return g163((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g165")) return g165((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g167")) return g167((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g169")) return g169((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g171")) return g171((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g173")) return g173((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g175")) return g175((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g177")) return g177((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g179")) return g179((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g181")) return g181((com.badlogic.gdx.utils.ObjectMap)obj);
     if(field.getter.equals("g258")) return g258((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
     if(field.getter.equals("g260")) return g260((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
     if(field.getter.equals("g281")) return g281((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g283")) return g283((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g285")) return g285((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g287")) return g287((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g289")) return g289((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g291")) return g291((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g293")) return g293((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g295")) return g295((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g297")) return g297((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
     if(field.getter.equals("g424")) return g424((com.badlogic.gdx.utils.ArrayMap)obj);
     if(field.getter.equals("g426")) return g426((com.badlogic.gdx.utils.ArrayMap)obj);
     if(field.getter.equals("g428")) return g428((com.badlogic.gdx.utils.ArrayMap)obj);
     if(field.getter.equals("g430")) return g430((com.badlogic.gdx.utils.ArrayMap)obj);
     if(field.getter.equals("g467")) return g467((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g469")) return g469((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g471")) return g471((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g473")) return g473((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g475")) return g475((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g477")) return g477((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g479")) return g479((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g481")) return g481((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g483")) return g483((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g485")) return g485((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g487")) return g487((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g489")) return g489((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g491")) return g491((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g493")) return g493((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g495")) return g495((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g497")) return g497((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g499")) return g499((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g501")) return g501((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g503")) return g503((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g505")) return g505((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g507")) return g507((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
     if(field.getter.equals("g538")) return g538((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g540")) return g540((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g542")) return g542((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g544")) return g544((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g546")) return g546((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g548")) return g548((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g550")) return g550((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g552")) return g552((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g554")) return g554((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g556")) return g556((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g558")) return g558((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g560")) return g560((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g562")) return g562((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g564")) return g564((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g566")) return g566((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g568")) return g568((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g570")) return g570((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g572")) return g572((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g574")) return g574((com.badlogic.gdx.graphics.Color)obj);
     if(field.getter.equals("g608")) return g608((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj);
     if(field.getter.equals("g610")) return g610((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj);
     if(field.getter.equals("g612")) return g612((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj);
     if(field.getter.equals("g614")) return g614((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj);
     if(field.getter.equals("g616")) return g616((com.badlogic.gdx.utils.Array.ArrayIterator)obj);
     if(field.getter.equals("g618")) return g618((com.badlogic.gdx.utils.Array.ArrayIterator)obj);
     if(field.getter.equals("g644")) return g644((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g646")) return g646((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g648")) return g648((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g650")) return g650((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g652")) return g652((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g654")) return g654((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g656")) return g656((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g658")) return g658((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g660")) return g660((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g662")) return g662((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g664")) return g664((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g666")) return g666((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
     if(field.getter.equals("g680")) return g680((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g682")) return g682((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g684")) return g684((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g686")) return g686((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g688")) return g688((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g690")) return g690((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g692")) return g692((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g694")) return g694((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g696")) return g696((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g698")) return g698((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g700")) return g700((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g702")) return g702((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g704")) return g704((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g706")) return g706((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g708")) return g708((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g710")) return g710((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g712")) return g712((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g714")) return g714((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g716")) return g716((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g718")) return g718((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g720")) return g720((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g722")) return g722((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g724")) return g724((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g726")) return g726((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g728")) return g728((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g730")) return g730((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g732")) return g732((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
     if(field.getter.equals("g825")) return g825((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj);
     if(field.getter.equals("g827")) return g827((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj);
     if(field.getter.equals("g829")) return g829((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj);
     if(field.getter.equals("g831")) return g831((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj);
     if(field.getter.equals("g833")) return g833((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj);
     if(field.getter.equals("g835")) return g835((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g837")) return g837((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g839")) return g839((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g841")) return g841((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g843")) return g843((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g845")) return g845((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g847")) return g847((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g849")) return g849((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g851")) return g851((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g853")) return g853((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g855")) return g855((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g857")) return g857((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g859")) return g859((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g861")) return g861((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g863")) return g863((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g865")) return g865((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
     if(field.getter.equals("g893")) return g893((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj);
     if(field.getter.equals("g895")) return g895((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj);
     if(field.getter.equals("g897")) return g897((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj);
     if(field.getter.equals("g899")) return g899((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj);
     if(field.getter.equals("g901")) return g901((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj);
     if(field.getter.equals("g903")) return g903((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj);
     if(field.getter.equals("g912")) return g912((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g914")) return g914((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g916")) return g916((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g918")) return g918((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g920")) return g920((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g924")) return g924((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g926")) return g926((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g928")) return g928((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g930")) return g930((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
     if(field.getter.equals("g955")) return g955((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
     if(field.getter.equals("g957")) return g957((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
     if(field.getter.equals("g986")) return g986((com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle)obj);
     if(field.getter.equals("g988")) return g988((com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle)obj);
     if(field.getter.equals("g990")) return g990((com.badlogic.gdx.utils.ObjectMap.Entry)obj);
     if(field.getter.equals("g992")) return g992((com.badlogic.gdx.utils.ObjectMap.Entry)obj);
     if(field.getter.equals("g995")) return g995((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj);
     if(field.getter.equals("g997")) return g997((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj);
     if(field.getter.equals("g1006")) return g1006((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1008")) return g1008((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1010")) return g1010((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1012")) return g1012((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1014")) return g1014((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1016")) return g1016((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1018")) return g1018((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
     if(field.getter.equals("g1037")) return g1037((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj);
     if(field.getter.equals("g1039")) return g1039((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj);
     if(field.getter.equals("g1052")) return g1052((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1054")) return g1054((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1056")) return g1056((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1058")) return g1058((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1060")) return g1060((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1062")) return g1062((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1064")) return g1064((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
     if(field.getter.equals("g1146")) return g1146((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj);
     if(field.getter.equals("g1148")) return g1148((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj);
     if(field.getter.equals("g1150")) return g1150((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj);
     if(field.getter.equals("g1152")) return g1152((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj);
     if(field.getter.equals("g1154")) return g1154((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);
     if(field.getter.equals("g1156")) return g1156((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);
     if(field.getter.equals("g1158")) return g1158((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);
     if(field.getter.equals("g1160")) return g1160((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);
     if(field.getter.equals("g1162")) return g1162((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);
     if(field.getter.equals("g1191")) return g1191((com.badlogic.gdx.utils.Array)obj);
     if(field.getter.equals("g1193")) return g1193((com.badlogic.gdx.utils.Array)obj);
     if(field.getter.equals("g1195")) return g1195((com.badlogic.gdx.utils.Array)obj);
     if(field.getter.equals("g1197")) return g1197((com.badlogic.gdx.utils.Array)obj);
     if(field.getter.equals("g1228")) return g1228((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1230")) return g1230((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1232")) return g1232((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1234")) return g1234((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1236")) return g1236((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1238")) return g1238((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1240")) return g1240((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1242")) return g1242((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1244")) return g1244((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1246")) return g1246((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
     if(field.getter.equals("g1265")) return g1265((com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)obj);
     if(field.getter.equals("g1267")) return g1267((com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)obj);
     if(field.getter.equals("g1269")) return g1269((com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)obj);
     if(field.getter.equals("g1276")) return g1276((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj);
     if(field.getter.equals("g1278")) return g1278((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj);
     if(field.getter.equals("g1345")) return g1345((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj);
     if(field.getter.equals("g1347")) return g1347((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj);
     if(field.getter.equals("g1349")) return g1349((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj);
     if(field.getter.equals("g1375")) return g1375((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj);
     if(field.getter.equals("g1377")) return g1377((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj);
     if(field.getter.equals("g1379")) return g1379((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj);
     if(field.getter.equals("g1381")) return g1381((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj);
     if(field.getter.equals("g1389")) return g1389((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1391")) return g1391((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1393")) return g1393((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1395")) return g1395((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1397")) return g1397((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1399")) return g1399((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1401")) return g1401((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1403")) return g1403((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1405")) return g1405((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1407")) return g1407((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1409")) return g1409((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1411")) return g1411((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj);
     if(field.getter.equals("g1416")) return g1416((com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle)obj);
     if(field.getter.equals("g1418")) return g1418((com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle)obj);
     if(field.getter.equals("g1455")) return g1455((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1457")) return g1457((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1459")) return g1459((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1461")) return g1461((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1463")) return g1463((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1465")) return g1465((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1467")) return g1467((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1469")) return g1469((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1471")) return g1471((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1473")) return g1473((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1475")) return g1475((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1477")) return g1477((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1479")) return g1479((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);
     if(field.getter.equals("g1486")) return g1486((com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)obj);
     if(field.getter.equals("g1488")) return g1488((com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)obj);
     if(field.getter.equals("g1532")) return g1532((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj);
     if(field.getter.equals("g1534")) return g1534((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj);
     if(field.getter.equals("g1536")) return g1536((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj);
     if(field.getter.equals("g1544")) return g1544((com.badlogic.gdx.utils.ObjectMap.Entries)obj);
     if(field.getter.equals("g1549")) return g1549((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)obj);
     if(field.getter.equals("g1551")) return g1551((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)obj);
     if(field.getter.equals("g1553")) return g1553((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)obj);
     if(field.getter.equals("g1557")) return g1557((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1559")) return g1559((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1561")) return g1561((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1563")) return g1563((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1565")) return g1565((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1567")) return g1567((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1569")) return g1569((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1571")) return g1571((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1573")) return g1573((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1575")) return g1575((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1577")) return g1577((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1579")) return g1579((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1581")) return g1581((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
     if(field.getter.equals("g1625")) return g1625((com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle)obj);
     if(field.getter.equals("g1627")) return g1627((com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle)obj);
     if(field.getter.equals("g1629")) return g1629((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1631")) return g1631((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1633")) return g1633((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1635")) return g1635((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1637")) return g1637((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1639")) return g1639((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1641")) return g1641((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj);
     if(field.getter.equals("g1745")) return g1745((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1747")) return g1747((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1749")) return g1749((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1751")) return g1751((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1753")) return g1753((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1755")) return g1755((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1757")) return g1757((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
     if(field.getter.equals("g1771")) return g1771((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1773")) return g1773((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1775")) return g1775((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1777")) return g1777((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1779")) return g1779((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1781")) return g1781((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1783")) return g1783((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj);
     if(field.getter.equals("g1785")) return g1785((com.badlogic.gdx.utils.OrderedMap)obj);
     if(field.getter.equals("g1795")) return g1795((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj);
     if(field.getter.equals("g1797")) return g1797((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj);
     if(field.getter.equals("g1803")) return g1803((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1805")) return g1805((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1807")) return g1807((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1809")) return g1809((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1811")) return g1811((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1813")) return g1813((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1815")) return g1815((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1817")) return g1817((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);
     if(field.getter.equals("g1833")) return g1833((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);
     if(field.getter.equals("g1835")) return g1835((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);
     if(field.getter.equals("g1837")) return g1837((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);
     if(field.getter.equals("g1839")) return g1839((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);
     if(field.getter.equals("g1852")) return g1852((com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle)obj);
     if(field.getter.equals("g1854")) return g1854((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1856")) return g1856((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1858")) return g1858((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1860")) return g1860((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1862")) return g1862((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1864")) return g1864((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1866")) return g1866((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1868")) return g1868((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1870")) return g1870((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
     if(field.getter.equals("g1913")) return g1913((com.badlogic.gdx.scenes.scene2d.ui.Align)obj);
     if(field.getter.equals("g1915")) return g1915((com.badlogic.gdx.scenes.scene2d.ui.Align)obj);
     if(field.getter.equals("g1917")) return g1917((com.badlogic.gdx.scenes.scene2d.ui.Align)obj);
     if(field.getter.equals("g1919")) return g1919((com.badlogic.gdx.scenes.scene2d.ui.Align)obj);
     if(field.getter.equals("g1921")) return g1921((com.badlogic.gdx.scenes.scene2d.ui.Align)obj);
     if(field.getter.equals("g1923")) return g1923((com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch)obj);
     if(field.getter.equals("g1925")) return g1925((com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch)obj);
     if(field.getter.equals("g1927")) return g1927((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1929")) return g1929((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1931")) return g1931((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1933")) return g1933((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1935")) return g1935((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1937")) return g1937((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1939")) return g1939((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1941")) return g1941((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1943")) return g1943((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g1945")) return g1945((com.badlogic.gdx.scenes.scene2d.ui.List)obj);
     if(field.getter.equals("g2067")) return g2067((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj);
     if(field.getter.equals("g2069")) return g2069((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj);
     if(field.getter.equals("g2071")) return g2071((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj);
     if(field.getter.equals("g2073")) return g2073((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj);
     if(field.getter.equals("g2075")) return g2075((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj);
     if(field.getter.equals("g2077")) return g2077((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj);
     return null;
  }
  public void set(Field field, Object obj, Object value) throws IllegalAccessException {
     if(field.setter.equals("s12")) s12((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s14")) s14((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s16")) s16((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s18")) s18((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s20")) s20((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s22")) s22((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s24")) s24((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s26")) s26((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s28")) s28((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s30")) s30((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s32")) s32((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s40")) s40((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s42")) s42((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s44")) s44((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s46")) s46((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s52")) s52((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s54")) s54((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s58")) s58((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s60")) s60((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s62")) s62((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s64")) s64((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s66")) s66((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj, value);
     if(field.setter.equals("s154")) s154((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s156")) s156((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s158")) s158((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s160")) s160((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s162")) s162((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s164")) s164((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s166")) s166((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s168")) s168((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s170")) s170((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s172")) s172((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s174")) s174((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s176")) s176((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s178")) s178((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s180")) s180((com.badlogic.gdx.utils.ObjectMap)obj, value);
     if(field.setter.equals("s257")) s257((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj, value);
     if(field.setter.equals("s259")) s259((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj, value);
     if(field.setter.equals("s282")) s282((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj, value);
     if(field.setter.equals("s284")) s284((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj, value);
     if(field.setter.equals("s286")) s286((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj, value);
     if(field.setter.equals("s288")) s288((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj, value);
     if(field.setter.equals("s290")) s290((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj, value);
     if(field.setter.equals("s296")) s296((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj, value);
     if(field.setter.equals("s423")) s423((com.badlogic.gdx.utils.ArrayMap)obj, value);
     if(field.setter.equals("s425")) s425((com.badlogic.gdx.utils.ArrayMap)obj, value);
     if(field.setter.equals("s427")) s427((com.badlogic.gdx.utils.ArrayMap)obj, value);
     if(field.setter.equals("s429")) s429((com.badlogic.gdx.utils.ArrayMap)obj, value);
     if(field.setter.equals("s466")) s466((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s468")) s468((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s484")) s484((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s486")) s486((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s488")) s488((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s490")) s490((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s492")) s492((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s494")) s494((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s498")) s498((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s500")) s500((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s502")) s502((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s504")) s504((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s506")) s506((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj, value);
     if(field.setter.equals("s565")) s565((com.badlogic.gdx.graphics.Color)obj, value);
     if(field.setter.equals("s567")) s567((com.badlogic.gdx.graphics.Color)obj, value);
     if(field.setter.equals("s569")) s569((com.badlogic.gdx.graphics.Color)obj, value);
     if(field.setter.equals("s571")) s571((com.badlogic.gdx.graphics.Color)obj, value);
     if(field.setter.equals("s573")) s573((com.badlogic.gdx.graphics.Color)obj, value);
     if(field.setter.equals("s607")) s607((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj, value);
     if(field.setter.equals("s609")) s609((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj, value);
     if(field.setter.equals("s611")) s611((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj, value);
     if(field.setter.equals("s613")) s613((com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle)obj, value);
     if(field.setter.equals("s617")) s617((com.badlogic.gdx.utils.Array.ArrayIterator)obj, value);
     if(field.setter.equals("s661")) s661((com.badlogic.gdx.graphics.g2d.NinePatch)obj, value);
     if(field.setter.equals("s663")) s663((com.badlogic.gdx.graphics.g2d.NinePatch)obj, value);
     if(field.setter.equals("s665")) s665((com.badlogic.gdx.graphics.g2d.NinePatch)obj, value);
     if(field.setter.equals("s679")) s679((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s689")) s689((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s691")) s691((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s693")) s693((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s695")) s695((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s697")) s697((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s699")) s699((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s701")) s701((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s703")) s703((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s705")) s705((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s707")) s707((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s709")) s709((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s711")) s711((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s713")) s713((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s715")) s715((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s717")) s717((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s719")) s719((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s721")) s721((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s723")) s723((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s725")) s725((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s727")) s727((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s729")) s729((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s731")) s731((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj, value);
     if(field.setter.equals("s824")) s824((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj, value);
     if(field.setter.equals("s826")) s826((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj, value);
     if(field.setter.equals("s828")) s828((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj, value);
     if(field.setter.equals("s830")) s830((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj, value);
     if(field.setter.equals("s832")) s832((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)obj, value);
     if(field.setter.equals("s834")) s834((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s836")) s836((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s838")) s838((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s840")) s840((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s842")) s842((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s844")) s844((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s846")) s846((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s848")) s848((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s850")) s850((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s852")) s852((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s854")) s854((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s856")) s856((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s858")) s858((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s860")) s860((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s862")) s862((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s864")) s864((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj, value);
     if(field.setter.equals("s892")) s892((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj, value);
     if(field.setter.equals("s894")) s894((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj, value);
     if(field.setter.equals("s896")) s896((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj, value);
     if(field.setter.equals("s898")) s898((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj, value);
     if(field.setter.equals("s900")) s900((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj, value);
     if(field.setter.equals("s902")) s902((com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)obj, value);
     if(field.setter.equals("s911")) s911((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj, value);
     if(field.setter.equals("s913")) s913((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj, value);
     if(field.setter.equals("s915")) s915((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj, value);
     if(field.setter.equals("s923")) s923((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj, value);
     if(field.setter.equals("s925")) s925((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj, value);
     if(field.setter.equals("s927")) s927((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj, value);
     if(field.setter.equals("s954")) s954((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj, value);
     if(field.setter.equals("s956")) s956((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj, value);
     if(field.setter.equals("s985")) s985((com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle)obj, value);
     if(field.setter.equals("s987")) s987((com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle)obj, value);
     if(field.setter.equals("s989")) s989((com.badlogic.gdx.utils.ObjectMap.Entry)obj, value);
     if(field.setter.equals("s991")) s991((com.badlogic.gdx.utils.ObjectMap.Entry)obj, value);
     if(field.setter.equals("s996")) s996((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj, value);
     if(field.setter.equals("s1005")) s1005((com.badlogic.gdx.scenes.scene2d.ui.Window)obj, value);
     if(field.setter.equals("s1007")) s1007((com.badlogic.gdx.scenes.scene2d.ui.Window)obj, value);
     if(field.setter.equals("s1009")) s1009((com.badlogic.gdx.scenes.scene2d.ui.Window)obj, value);
     if(field.setter.equals("s1011")) s1011((com.badlogic.gdx.scenes.scene2d.ui.Window)obj, value);
     if(field.setter.equals("s1013")) s1013((com.badlogic.gdx.scenes.scene2d.ui.Window)obj, value);
     if(field.setter.equals("s1017")) s1017((com.badlogic.gdx.scenes.scene2d.ui.Window)obj, value);
     if(field.setter.equals("s1038")) s1038((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj, value);
     if(field.setter.equals("s1053")) s1053((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj, value);
     if(field.setter.equals("s1059")) s1059((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj, value);
     if(field.setter.equals("s1061")) s1061((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj, value);
     if(field.setter.equals("s1063")) s1063((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj, value);
     if(field.setter.equals("s1145")) s1145((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj, value);
     if(field.setter.equals("s1147")) s1147((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj, value);
     if(field.setter.equals("s1149")) s1149((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj, value);
     if(field.setter.equals("s1151")) s1151((com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)obj, value);
     if(field.setter.equals("s1153")) s1153((com.badlogic.gdx.graphics.g2d.TextureRegion)obj, value);
     if(field.setter.equals("s1155")) s1155((com.badlogic.gdx.graphics.g2d.TextureRegion)obj, value);
     if(field.setter.equals("s1157")) s1157((com.badlogic.gdx.graphics.g2d.TextureRegion)obj, value);
     if(field.setter.equals("s1159")) s1159((com.badlogic.gdx.graphics.g2d.TextureRegion)obj, value);
     if(field.setter.equals("s1161")) s1161((com.badlogic.gdx.graphics.g2d.TextureRegion)obj, value);
     if(field.setter.equals("s1190")) s1190((com.badlogic.gdx.utils.Array)obj, value);
     if(field.setter.equals("s1192")) s1192((com.badlogic.gdx.utils.Array)obj, value);
     if(field.setter.equals("s1194")) s1194((com.badlogic.gdx.utils.Array)obj, value);
     if(field.setter.equals("s1196")) s1196((com.badlogic.gdx.utils.Array)obj, value);
     if(field.setter.equals("s1227")) s1227((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1231")) s1231((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1233")) s1233((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1235")) s1235((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1237")) s1237((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1239")) s1239((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1241")) s1241((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1243")) s1243((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1245")) s1245((com.badlogic.gdx.scenes.scene2d.ui.Label)obj, value);
     if(field.setter.equals("s1264")) s1264((com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)obj, value);
     if(field.setter.equals("s1266")) s1266((com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)obj, value);
     if(field.setter.equals("s1268")) s1268((com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)obj, value);
     if(field.setter.equals("s1275")) s1275((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj, value);
     if(field.setter.equals("s1277")) s1277((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj, value);
     if(field.setter.equals("s1344")) s1344((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj, value);
     if(field.setter.equals("s1346")) s1346((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj, value);
     if(field.setter.equals("s1348")) s1348((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj, value);
     if(field.setter.equals("s1374")) s1374((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj, value);
     if(field.setter.equals("s1376")) s1376((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj, value);
     if(field.setter.equals("s1378")) s1378((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj, value);
     if(field.setter.equals("s1380")) s1380((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj, value);
     if(field.setter.equals("s1388")) s1388((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1390")) s1390((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1392")) s1392((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1394")) s1394((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1396")) s1396((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1398")) s1398((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1400")) s1400((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1402")) s1402((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1404")) s1404((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1406")) s1406((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1408")) s1408((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1410")) s1410((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj, value);
     if(field.setter.equals("s1415")) s1415((com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle)obj, value);
     if(field.setter.equals("s1417")) s1417((com.badlogic.gdx.scenes.scene2d.ui.CheckBox.CheckBoxStyle)obj, value);
     if(field.setter.equals("s1454")) s1454((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1456")) s1456((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1458")) s1458((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1460")) s1460((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1462")) s1462((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1464")) s1464((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1466")) s1466((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1468")) s1468((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1470")) s1470((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1472")) s1472((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1476")) s1476((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1478")) s1478((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj, value);
     if(field.setter.equals("s1485")) s1485((com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)obj, value);
     if(field.setter.equals("s1487")) s1487((com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)obj, value);
     if(field.setter.equals("s1531")) s1531((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj, value);
     if(field.setter.equals("s1533")) s1533((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj, value);
     if(field.setter.equals("s1543")) s1543((com.badlogic.gdx.utils.ObjectMap.Entries)obj, value);
     if(field.setter.equals("s1566")) s1566((com.badlogic.gdx.graphics.g2d.BitmapFont)obj, value);
     if(field.setter.equals("s1570")) s1570((com.badlogic.gdx.graphics.g2d.BitmapFont)obj, value);
     if(field.setter.equals("s1572")) s1572((com.badlogic.gdx.graphics.g2d.BitmapFont)obj, value);
     if(field.setter.equals("s1574")) s1574((com.badlogic.gdx.graphics.g2d.BitmapFont)obj, value);
     if(field.setter.equals("s1576")) s1576((com.badlogic.gdx.graphics.g2d.BitmapFont)obj, value);
     if(field.setter.equals("s1580")) s1580((com.badlogic.gdx.graphics.g2d.BitmapFont)obj, value);
     if(field.setter.equals("s1624")) s1624((com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle)obj, value);
     if(field.setter.equals("s1626")) s1626((com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle)obj, value);
     if(field.setter.equals("s1628")) s1628((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1630")) s1630((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1632")) s1632((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1634")) s1634((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1636")) s1636((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1638")) s1638((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1640")) s1640((com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)obj, value);
     if(field.setter.equals("s1746")) s1746((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj, value);
     if(field.setter.equals("s1748")) s1748((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj, value);
     if(field.setter.equals("s1750")) s1750((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj, value);
     if(field.setter.equals("s1752")) s1752((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj, value);
     if(field.setter.equals("s1754")) s1754((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj, value);
     if(field.setter.equals("s1756")) s1756((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj, value);
     if(field.setter.equals("s1770")) s1770((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1772")) s1772((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1774")) s1774((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1776")) s1776((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1778")) s1778((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1780")) s1780((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1782")) s1782((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)obj, value);
     if(field.setter.equals("s1794")) s1794((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj, value);
     if(field.setter.equals("s1796")) s1796((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj, value);
     if(field.setter.equals("s1802")) s1802((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1804")) s1804((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1806")) s1806((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1808")) s1808((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1810")) s1810((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1812")) s1812((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1814")) s1814((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1816")) s1816((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj, value);
     if(field.setter.equals("s1832")) s1832((com.badlogic.gdx.scenes.scene2d.ui.Button)obj, value);
     if(field.setter.equals("s1834")) s1834((com.badlogic.gdx.scenes.scene2d.ui.Button)obj, value);
     if(field.setter.equals("s1836")) s1836((com.badlogic.gdx.scenes.scene2d.ui.Button)obj, value);
     if(field.setter.equals("s1838")) s1838((com.badlogic.gdx.scenes.scene2d.ui.Button)obj, value);
     if(field.setter.equals("s1851")) s1851((com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle)obj, value);
     if(field.setter.equals("s1853")) s1853((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1855")) s1855((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1857")) s1857((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1859")) s1859((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1861")) s1861((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1863")) s1863((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1865")) s1865((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1867")) s1867((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1869")) s1869((com.badlogic.gdx.scenes.scene2d.ui.Image)obj, value);
     if(field.setter.equals("s1922")) s1922((com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch)obj, value);
     if(field.setter.equals("s1924")) s1924((com.badlogic.gdx.scenes.scene2d.ui.Skin.TintedNinePatch)obj, value);
     if(field.setter.equals("s1926")) s1926((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1928")) s1928((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1930")) s1930((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1932")) s1932((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1934")) s1934((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1936")) s1936((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1938")) s1938((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1940")) s1940((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1942")) s1942((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s1944")) s1944((com.badlogic.gdx.scenes.scene2d.ui.List)obj, value);
     if(field.setter.equals("s2066")) s2066((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj, value);
     if(field.setter.equals("s2068")) s2068((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj, value);
     if(field.setter.equals("s2070")) s2070((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj, value);
     if(field.setter.equals("s2072")) s2072((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj, value);
     if(field.setter.equals("s2074")) s2074((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj, value);
     if(field.setter.equals("s2076")) s2076((com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle)obj, value);
  }
  public Object invoke(Method m, Object obj, Object[] params) {
     if(m.methodId.equals("m68")) {
        m68((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m69")) {
        m69((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Character)params[0]).charValue());
        return null;
     }
     if(m.methodId.equals("m70")) {
        return m70((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m71")) {
        m71((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m72")) {
        m72((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m73")) {
        m73((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m74")) {
        m74((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m75")) {
        m75((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m76")) {
        return m76((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m77")) {
        return m77((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m78")) {
        m78((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m79")) {
        m79((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m80")) {
        m80((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m81")) {
        return m81((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Character)params[0]).charValue());   }
     if(m.methodId.equals("m82")) {
        m82((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m83")) {
        return m83((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(java.util.List)params[0], (com.badlogic.gdx.scenes.scene2d.ui.TextField)params[1], ((Boolean)params[2]).booleanValue());   }
     if(m.methodId.equals("m84")) {
        m84((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m85")) {
        m85((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter)params[0]);
        return null;
     }
     if(m.methodId.equals("m86")) {
        return m86((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m87")) {
        m87((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m88")) {
        m88((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m89")) {
        return m89((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m90")) {
        m90((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m91")) {
        m91((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);
        return null;
     }
     if(m.methodId.equals("m92")) {
        m92((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m93")) {
        return m93((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m94")) {
        return m94((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m95")) {
        m95((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard)params[0]);
        return null;
     }
     if(m.methodId.equals("m96")) {
        m96((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,(com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard)params[0]);
        return null;
     }
     if(m.methodId.equals("m97")) {
        return m97((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m98")) {
        return m98((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj);   }
     if(m.methodId.equals("m99")) {
        m99((com.badlogic.gdx.scenes.scene2d.ui.TextField)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m182")) {
        return m182((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1]);   }
     if(m.methodId.equals("m183")) {
        return m183((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1]);   }
     if(m.methodId.equals("m184")) {
        m184((com.badlogic.gdx.utils.ObjectMap)obj,(com.badlogic.gdx.utils.ObjectMap)params[0]);
        return null;
     }
     if(m.methodId.equals("m185")) {
        m185((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m186")) {
        m186((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1], ((Number)params[2]).intValue(), (java.lang.Object)params[3], ((Number)params[4]).intValue(), (java.lang.Object)params[5], ((Number)params[6]).intValue(), (java.lang.Object)params[7]);
        return null;
     }
     if(m.methodId.equals("m187")) {
        m187((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m188")) {
        return m188((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m189")) {
        return m189((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m190")) {
        return m190((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m191")) {
        return m191((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m192")) {
        m192((com.badlogic.gdx.utils.ObjectMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m193")) {
        m193((com.badlogic.gdx.utils.ObjectMap)obj);
        return null;
     }
     if(m.methodId.equals("m194")) {
        return m194((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m195")) {
        return m195((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m196")) {
        return m196((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m197")) {
        return m197((com.badlogic.gdx.utils.ObjectMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m198")) {
        m198((com.badlogic.gdx.utils.ObjectMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m199")) {
        m199((com.badlogic.gdx.utils.ObjectMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m200")) {
        return m200((com.badlogic.gdx.utils.ObjectMap)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m201")) {
        return m201((com.badlogic.gdx.utils.ObjectMap)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m202")) {
        return m202((com.badlogic.gdx.utils.ObjectMap)obj);   }
     if(m.methodId.equals("m203")) {
        return m203((com.badlogic.gdx.utils.ObjectMap)obj);   }
     if(m.methodId.equals("m204")) {
        return m204((com.badlogic.gdx.utils.ObjectMap)obj);   }
     if(m.methodId.equals("m205")) {
        return m205((com.badlogic.gdx.utils.ObjectMap)obj);   }
     if(m.methodId.equals("m261")) {
        return m261((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m262")) {
        return m262((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m263")) {
        return m263((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m264")) {
        return m264((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m265")) {
        return m265((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m266")) {
        return m266((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m267")) {
        m267((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
        return null;
     }
     if(m.methodId.equals("m268")) {
        m268((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
        return null;
     }
     if(m.methodId.equals("m269")) {
        return m269((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);   }
     if(m.methodId.equals("m270")) {
        m270((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
        return null;
     }
     if(m.methodId.equals("m271")) {
        m271((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
        return null;
     }
     if(m.methodId.equals("m272")) {
        m272((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m273")) {
        m273((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m274")) {
        return m274((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());   }
     if(m.methodId.equals("m275")) {
        m275((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj);
        return null;
     }
     if(m.methodId.equals("m276")) {
        return m276((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m277")) {
        m277((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m278")) {
        m278((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m279")) {
        m279((com.badlogic.gdx.scenes.scene2d.ui.Widget)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.math.Vector2)params[1]);
        return null;
     }
     if(m.methodId.equals("m298")) {
        m298((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m299")) {
        m299((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m300")) {
        m300((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m301")) {
        m301((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(com.badlogic.gdx.graphics.Color)params[0]);
        return null;
     }
     if(m.methodId.equals("m302")) {
        m302((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());
        return null;
     }
     if(m.methodId.equals("m303")) {
        m303((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0]);
        return null;
     }
     if(m.methodId.equals("m304")) {
        m304((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m305")) {
        return m305((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);   }
     if(m.methodId.equals("m306")) {
        m306((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m307")) {
        return m307((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).intValue(), ((Number)params[4]).intValue());   }
     if(m.methodId.equals("m308")) {
        m308((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), ((Number)params[4]).floatValue());
        return null;
     }
     if(m.methodId.equals("m309")) {
        return m309((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue());   }
     if(m.methodId.equals("m310")) {
        return m310((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).intValue(), ((Number)params[4]).intValue());   }
     if(m.methodId.equals("m311")) {
        return m311((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue());   }
     if(m.methodId.equals("m312")) {
        return m312((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)params[4]);   }
     if(m.methodId.equals("m313")) {
        return m313((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m314")) {
        return m314((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)params[4]);   }
     if(m.methodId.equals("m315")) {
        return m315((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);   }
     if(m.methodId.equals("m316")) {
        return m316((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);   }
     if(m.methodId.equals("m317")) {
        return m317((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);   }
     if(m.methodId.equals("m318")) {
        return m318((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);   }
     if(m.methodId.equals("m319")) {
        m319((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);
        return null;
     }
     if(m.methodId.equals("m320")) {
        m320((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m321")) {
        return m321((com.badlogic.gdx.graphics.g2d.BitmapFontCache)obj);   }
     if(m.methodId.equals("m374")) {
        m374((com.badlogic.gdx.utils.Disposable)obj);
        return null;
     }
     if(m.methodId.equals("m431")) {
        m431((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m432")) {
        m432((com.badlogic.gdx.utils.ArrayMap)obj,(com.badlogic.gdx.utils.ArrayMap)params[0]);
        return null;
     }
     if(m.methodId.equals("m433")) {
        m433((com.badlogic.gdx.utils.ArrayMap)obj,(com.badlogic.gdx.utils.ArrayMap)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m434")) {
        return m434((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m435")) {
        return m435((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m436")) {
        return m436((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m437")) {
        return m437((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m438")) {
        return m438((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m439")) {
        m439((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue(), (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m440")) {
        m440((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue(), (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m441")) {
        m441((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue(), (java.lang.Object)params[1], (java.lang.Object)params[2]);
        return null;
     }
     if(m.methodId.equals("m442")) {
        return m442((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m443")) {
        return m443((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m444")) {
        return m444((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m445")) {
        return m445((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m446")) {
        return m446((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m447")) {
        return m447((com.badlogic.gdx.utils.ArrayMap)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m448")) {
        m448((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m449")) {
        return m449((com.badlogic.gdx.utils.ArrayMap)obj);   }
     if(m.methodId.equals("m450")) {
        return m450((com.badlogic.gdx.utils.ArrayMap)obj);   }
     if(m.methodId.equals("m451")) {
        m451((com.badlogic.gdx.utils.ArrayMap)obj);
        return null;
     }
     if(m.methodId.equals("m452")) {
        m452((com.badlogic.gdx.utils.ArrayMap)obj);
        return null;
     }
     if(m.methodId.equals("m453")) {
        m453((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m454")) {
        m454((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m455")) {
        m455((com.badlogic.gdx.utils.ArrayMap)obj);
        return null;
     }
     if(m.methodId.equals("m456")) {
        m456((com.badlogic.gdx.utils.ArrayMap)obj);
        return null;
     }
     if(m.methodId.equals("m457")) {
        m457((com.badlogic.gdx.utils.ArrayMap)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m458")) {
        return m458((com.badlogic.gdx.utils.ArrayMap)obj);   }
     if(m.methodId.equals("m508")) {
        m508((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.ui.ScrollPane.ScrollPaneStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m509")) {
        return m509((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m510")) {
        m510((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);
        return null;
     }
     if(m.methodId.equals("m511")) {
        m511((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m512")) {
        return m512((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m513")) {
        return m513((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m514")) {
        return m514((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m515")) {
        return m515((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m516")) {
        return m516((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m517")) {
        m517((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m518")) {
        m518((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m519")) {
        m519((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m520")) {
        m520((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m521")) {
        m521((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).intValue(), (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m522")) {
        m522((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m523")) {
        m523((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m524")) {
        m524((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m525")) {
        return m525((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());   }
     if(m.methodId.equals("m526")) {
        m526((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m527")) {
        return m527((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m528")) {
        m528((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m529")) {
        return m529((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m530")) {
        return m530((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m531")) {
        m531((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m532")) {
        return m532((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m533")) {
        m533((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m534")) {
        return m534((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m535")) {
        return m535((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj);   }
     if(m.methodId.equals("m536")) {
        m536((com.badlogic.gdx.scenes.scene2d.ui.ScrollPane)obj,((Boolean)params[0]).booleanValue(), ((Boolean)params[1]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m575")) {
        return m575((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m576")) {
        m576((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());
        return null;
     }
     if(m.methodId.equals("m577")) {
        return m577((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m578")) {
        return m578((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue());   }
     if(m.methodId.equals("m579")) {
        return m579((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m580")) {
        return m580((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m581")) {
        m581((com.badlogic.gdx.graphics.Color)obj);
        return null;
     }
     if(m.methodId.equals("m582")) {
        return m582((com.badlogic.gdx.graphics.Color)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m583")) {
        return m583((com.badlogic.gdx.graphics.Color)obj);   }
     if(m.methodId.equals("m584")) {
        return m584((com.badlogic.gdx.graphics.Color)obj);   }
     if(m.methodId.equals("m585")) {
        return m585((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue());   }
     if(m.methodId.equals("m586")) {
        return m586((com.badlogic.gdx.graphics.Color)obj);   }
     if(m.methodId.equals("m587")) {
        return m587((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m588")) {
        return m588((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue());   }
     if(m.methodId.equals("m589")) {
        return m589((com.badlogic.gdx.graphics.Color)obj);   }
     if(m.methodId.equals("m590")) {
        return m590((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue());   }
     if(m.methodId.equals("m591")) {
        return m591((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());   }
     if(m.methodId.equals("m592")) {
        return m592((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue());   }
     if(m.methodId.equals("m593")) {
        return m593((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m594")) {
        return m594((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m595")) {
        return m595((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m596")) {
        return m596((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue());   }
     if(m.methodId.equals("m597")) {
        return m597((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m598")) {
        return m598((com.badlogic.gdx.graphics.Color)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m599")) {
        return m599((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0]);   }
     if(m.methodId.equals("m600")) {
        m600((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0], ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m601")) {
        m601((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0], ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m602")) {
        m602((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0], ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m603")) {
        m603((com.badlogic.gdx.graphics.Color)obj,(com.badlogic.gdx.graphics.Color)params[0], ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m604")) {
        return m604((com.badlogic.gdx.graphics.Color)obj);   }
     if(m.methodId.equals("m605")) {
        return m605((com.badlogic.gdx.graphics.Color)obj);   }
     if(m.methodId.equals("m606")) {
        m606((com.badlogic.gdx.scenes.scene2d.ui.TextField.OnscreenKeyboard)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m619")) {
        return m619((com.badlogic.gdx.utils.Array.ArrayIterator)obj);   }
     if(m.methodId.equals("m620")) {
        return m620((com.badlogic.gdx.utils.Array.ArrayIterator)obj);   }
     if(m.methodId.equals("m621")) {
        m621((com.badlogic.gdx.utils.Array.ArrayIterator)obj);
        return null;
     }
     if(m.methodId.equals("m622")) {
        m622((com.badlogic.gdx.utils.Array.ArrayIterator)obj);
        return null;
     }
     if(m.methodId.equals("m667")) {
        m667((com.badlogic.gdx.graphics.g2d.NinePatch)obj);
        return null;
     }
     if(m.methodId.equals("m668")) {
        m668((com.badlogic.gdx.graphics.g2d.NinePatch)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), ((Number)params[4]).floatValue());
        return null;
     }
     if(m.methodId.equals("m669")) {
        return m669((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m670")) {
        return m670((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m671")) {
        return m671((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m672")) {
        return m672((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m673")) {
        return m673((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m674")) {
        return m674((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m675")) {
        return m675((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m676")) {
        m676((com.badlogic.gdx.graphics.g2d.NinePatch)obj,(com.badlogic.gdx.graphics.Color)params[0]);
        return null;
     }
     if(m.methodId.equals("m677")) {
        return m677((com.badlogic.gdx.graphics.g2d.NinePatch)obj);   }
     if(m.methodId.equals("m678")) {
        m678((com.badlogic.gdx.graphics.g2d.NinePatch)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m733")) {
        m733((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
        return null;
     }
     if(m.methodId.equals("m734")) {
        m734((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m735")) {
        m735((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
        return null;
     }
     if(m.methodId.equals("m736")) {
        m736((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m737")) {
        return m737((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m738")) {
        m738((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m739")) {
        m739((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);
        return null;
     }
     if(m.methodId.equals("m740")) {
        m740((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m741")) {
        m741((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m742")) {
        return m742((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m743")) {
        m743((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m744")) {
        return m744((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m745")) {
        return m745((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m746")) {
        m746((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m747")) {
        return m747((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m748")) {
        m748((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m749")) {
        return m749((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m750")) {
        return m750((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m751")) {
        m751((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m752")) {
        return m752((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m753")) {
        m753((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m754")) {
        m754((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).intValue(), (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m755")) {
        m755((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m756")) {
        m756((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m757")) {
        m757((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m758")) {
        return m758((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m759")) {
        return m759((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m760")) {
        m760((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m761")) {
        return m761((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m762")) {
        m762((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m763")) {
        return m763((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m764")) {
        return m764((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m765")) {
        return m765((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m766")) {
        return m766((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m767")) {
        return m767((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj);   }
     if(m.methodId.equals("m768")) {
        return m768((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());   }
     if(m.methodId.equals("m769")) {
        m769((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m770")) {
        m770((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue());
        return null;
     }
     if(m.methodId.equals("m771")) {
        m771((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Boolean)params[0]).booleanValue(), ((Boolean)params[1]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m772")) {
        m772((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m773")) {
        m773((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m774")) {
        m774((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Boolean)params[0]).booleanValue(), ((Boolean)params[1]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m775")) {
        m775((com.badlogic.gdx.scenes.scene2d.ui.FlickScrollPane)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m776")) {
        m776((com.badlogic.gdx.scenes.scene2d.ui.SelectionListener)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], ((Number)params[1]).intValue(), (java.lang.String)params[2]);
        return null;
     }
     if(m.methodId.equals("m817")) {
        m817((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);
        return null;
     }
     if(m.methodId.equals("m818")) {
        return m818((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);   }
     if(m.methodId.equals("m819")) {
        return m819((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);   }
     if(m.methodId.equals("m820")) {
        return m820((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);   }
     if(m.methodId.equals("m821")) {
        return m821((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);   }
     if(m.methodId.equals("m822")) {
        return m822((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);   }
     if(m.methodId.equals("m823")) {
        return m823((com.badlogic.gdx.scenes.scene2d.ui.Stack)obj);   }
     if(m.methodId.equals("m866")) {
        m866((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.ui.SplitPane.SplitPaneStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m867")) {
        return m867((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);   }
     if(m.methodId.equals("m868")) {
        m868((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
        return null;
     }
     if(m.methodId.equals("m869")) {
        return m869((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);   }
     if(m.methodId.equals("m870")) {
        return m870((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);   }
     if(m.methodId.equals("m871")) {
        return m871((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);   }
     if(m.methodId.equals("m872")) {
        return m872((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);   }
     if(m.methodId.equals("m873")) {
        m873((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m874")) {
        m874((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
        return null;
     }
     if(m.methodId.equals("m875")) {
        m875((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);
        return null;
     }
     if(m.methodId.equals("m876")) {
        m876((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m877")) {
        return m877((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m878")) {
        m878((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m879")) {
        m879((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m880")) {
        m880((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m881")) {
        return m881((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj);   }
     if(m.methodId.equals("m882")) {
        m882((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m883")) {
        m883((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m884")) {
        m884((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m885")) {
        m885((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m886")) {
        m886((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m887")) {
        m887((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,((Number)params[0]).intValue(), (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m888")) {
        m888((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m889")) {
        m889((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m890")) {
        m890((com.badlogic.gdx.scenes.scene2d.ui.SplitPane)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);
        return null;
     }
     if(m.methodId.equals("m891")) {
        m891((com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener)obj,(com.badlogic.gdx.scenes.scene2d.ui.Slider)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m931")) {
        m931((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,(com.badlogic.gdx.scenes.scene2d.ui.SelectBox.SelectBoxStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m932")) {
        return m932((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);   }
     if(m.methodId.equals("m933")) {
        m933((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,(java.lang.Object[])params[0]);
        return null;
     }
     if(m.methodId.equals("m934")) {
        m934((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);
        return null;
     }
     if(m.methodId.equals("m935")) {
        m935((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m936")) {
        return m936((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m937")) {
        m937((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m938")) {
        m938((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,(com.badlogic.gdx.scenes.scene2d.ui.SelectionListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m939")) {
        m939((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m940")) {
        m940((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m941")) {
        return m941((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);   }
     if(m.methodId.equals("m942")) {
        return m942((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);   }
     if(m.methodId.equals("m943")) {
        return m943((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);   }
     if(m.methodId.equals("m944")) {
        return m944((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj);   }
     if(m.methodId.equals("m945")) {
        m945((com.badlogic.gdx.scenes.scene2d.ui.SelectBox)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m946")) {
        m946((com.badlogic.gdx.scenes.scene2d.ui.TextField.DefaultOnscreenKeyboard)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m947")) {
        m947((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldListener)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField)params[0], ((Character)params[1]).charValue());
        return null;
     }
     if(m.methodId.equals("m958")) {
        return m958((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);   }
     if(m.methodId.equals("m959")) {
        return m959((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);   }
     if(m.methodId.equals("m960")) {
        return m960((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);   }
     if(m.methodId.equals("m961")) {
        return m961((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);   }
     if(m.methodId.equals("m962")) {
        m962((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
        return null;
     }
     if(m.methodId.equals("m963")) {
        m963((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
        return null;
     }
     if(m.methodId.equals("m964")) {
        return m964((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);   }
     if(m.methodId.equals("m965")) {
        m965((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
        return null;
     }
     if(m.methodId.equals("m966")) {
        m966((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
        return null;
     }
     if(m.methodId.equals("m967")) {
        m967((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
        return null;
     }
     if(m.methodId.equals("m968")) {
        m968((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m969")) {
        m969((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj);
        return null;
     }
     if(m.methodId.equals("m970")) {
        m970((com.badlogic.gdx.scenes.scene2d.ui.WidgetGroup)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m993")) {
        return m993((com.badlogic.gdx.utils.ObjectMap.Entry)obj);   }
     if(m.methodId.equals("m998")) {
        m998((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m999")) {
        return m999((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj);   }
     if(m.methodId.equals("m1000")) {
        m1000((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1001")) {
        return m1001((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj);   }
     if(m.methodId.equals("m1002")) {
        return m1002((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj);   }
     if(m.methodId.equals("m1003")) {
        m1003((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m1004")) {
        return m1004((com.badlogic.gdx.scenes.scene2d.ui.TextButton)obj);   }
     if(m.methodId.equals("m1019")) {
        m1019((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,(com.badlogic.gdx.scenes.scene2d.ui.Window.WindowStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1020")) {
        return m1020((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);   }
     if(m.methodId.equals("m1021")) {
        return m1021((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);   }
     if(m.methodId.equals("m1022")) {
        m1022((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);
        return null;
     }
     if(m.methodId.equals("m1023")) {
        m1023((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1024")) {
        return m1024((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1025")) {
        m1025((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1026")) {
        return m1026((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());   }
     if(m.methodId.equals("m1027")) {
        m1027((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m1028")) {
        return m1028((com.badlogic.gdx.scenes.scene2d.ui.Window)obj);   }
     if(m.methodId.equals("m1029")) {
        m1029((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1030")) {
        m1030((com.badlogic.gdx.scenes.scene2d.ui.Window)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1031")) {
        return m1031((com.badlogic.gdx.utils.ObjectMap.Values)obj);   }
     if(m.methodId.equals("m1032")) {
        return m1032((com.badlogic.gdx.utils.ObjectMap.Values)obj);   }
     if(m.methodId.equals("m1033")) {
        return m1033((com.badlogic.gdx.utils.ObjectMap.Values)obj);   }
     if(m.methodId.equals("m1034")) {
        return m1034((com.badlogic.gdx.utils.ObjectMap.Values)obj);   }
     if(m.methodId.equals("m1035")) {
        m1035((com.badlogic.gdx.utils.ObjectMap.Values)obj,(com.badlogic.gdx.utils.Array)params[0]);
        return null;
     }
     if(m.methodId.equals("m1040")) {
        m1040((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1041")) {
        return m1041((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj);   }
     if(m.methodId.equals("m1042")) {
        m1042((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj);
        return null;
     }
     if(m.methodId.equals("m1043")) {
        m1043((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1044")) {
        return m1044((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj);   }
     if(m.methodId.equals("m1045")) {
        return m1045((com.badlogic.gdx.scenes.scene2d.ui.ImageButton)obj);   }
     if(m.methodId.equals("m1065")) {
        m1065((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1066")) {
        m1066((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1067")) {
        m1067((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.math.Matrix4)params[0]);
        return null;
     }
     if(m.methodId.equals("m1068")) {
        m1068((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
        return null;
     }
     if(m.methodId.equals("m1069")) {
        return m1069((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1070")) {
        return m1070((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1071")) {
        return m1071((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1072")) {
        return m1072((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1073")) {
        m1073((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.graphics.g2d.NinePatch)params[0]);
        return null;
     }
     if(m.methodId.equals("m1074")) {
        return m1074((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1075")) {
        m1075((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1076")) {
        m1076((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.scenes.scene2d.ui.ClickListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m1077")) {
        return m1077((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1078")) {
        return m1078((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1079")) {
        m1079((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1080")) {
        m1080((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1081")) {
        return m1081((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).floatValue());   }
     if(m.methodId.equals("m1082")) {
        return m1082((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1083")) {
        m1083((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
        return null;
     }
     if(m.methodId.equals("m1084")) {
        return m1084((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);   }
     if(m.methodId.equals("m1085")) {
        return m1085((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1086")) {
        return m1086((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1087")) {
        return m1087((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1088")) {
        return m1088((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.scenes.scene2d.Actor[])params[0]);   }
     if(m.methodId.equals("m1089")) {
        return m1089((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1090")) {
        return m1090((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1091")) {
        m1091((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.files.FileHandle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1092")) {
        m1092((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m1093")) {
        return m1093((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1094")) {
        return m1094((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1095")) {
        m1095((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
        return null;
     }
     if(m.methodId.equals("m1096")) {
        m1096((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);
        return null;
     }
     if(m.methodId.equals("m1097")) {
        return m1097((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1098")) {
        return m1098((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1099")) {
        return m1099((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1100")) {
        return m1100((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1101")) {
        return m1101((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1102")) {
        return m1102((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1103")) {
        return m1103((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1104")) {
        return m1104((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1105")) {
        m1105((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m1106")) {
        return m1106((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0], (java.lang.String)params[1]);   }
     if(m.methodId.equals("m1107")) {
        return m1107((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue());   }
     if(m.methodId.equals("m1108")) {
        return m1108((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1109")) {
        return m1109((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1110")) {
        return m1110((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1111")) {
        return m1111((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1112")) {
        return m1112((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1113")) {
        return m1113((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0], (java.lang.String)params[1], (java.lang.String)params[2], (java.lang.String)params[3]);   }
     if(m.methodId.equals("m1114")) {
        return m1114((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1115")) {
        return m1115((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue());   }
     if(m.methodId.equals("m1116")) {
        return m1116((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1117")) {
        return m1117((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1118")) {
        return m1118((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1119")) {
        return m1119((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1120")) {
        return m1120((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1121")) {
        return m1121((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1122")) {
        return m1122((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1123")) {
        return m1123((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1124")) {
        return m1124((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1125")) {
        return m1125((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1126")) {
        return m1126((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1127")) {
        return m1127((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1128")) {
        return m1128((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1129")) {
        return m1129((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1130")) {
        return m1130((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1131")) {
        return m1131((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1132")) {
        return m1132((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1133")) {
        return m1133((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1134")) {
        return m1134((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1135")) {
        return m1135((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1136")) {
        return m1136((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1137")) {
        return m1137((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1138")) {
        return m1138((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1139")) {
        return m1139((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1140")) {
        return m1140((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj);   }
     if(m.methodId.equals("m1141")) {
        m1141((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.scenes.scene2d.ui.Skin)params[0]);
        return null;
     }
     if(m.methodId.equals("m1142")) {
        m1142((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.assets.AssetManager)params[0]);
        return null;
     }
     if(m.methodId.equals("m1143")) {
        m1143((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(com.badlogic.gdx.scenes.scene2d.Stage)params[0]);
        return null;
     }
     if(m.methodId.equals("m1144")) {
        m1144((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)obj,(java.util.List)params[0], (com.badlogic.gdx.graphics.g2d.SpriteBatch)params[1]);
        return null;
     }
     if(m.methodId.equals("m1163")) {
        m1163((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,(com.badlogic.gdx.graphics.Texture)params[0]);
        return null;
     }
     if(m.methodId.equals("m1164")) {
        m1164((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue());
        return null;
     }
     if(m.methodId.equals("m1165")) {
        m1165((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1166")) {
        m1166((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,(com.badlogic.gdx.graphics.g2d.TextureRegion)params[0]);
        return null;
     }
     if(m.methodId.equals("m1167")) {
        m1167((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,(com.badlogic.gdx.graphics.g2d.TextureRegion)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue(), ((Number)params[4]).intValue());
        return null;
     }
     if(m.methodId.equals("m1168")) {
        return m1168((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1169")) {
        m1169((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,(com.badlogic.gdx.graphics.Texture)params[0]);
        return null;
     }
     if(m.methodId.equals("m1170")) {
        return m1170((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1171")) {
        m1171((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1172")) {
        return m1172((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1173")) {
        m1173((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1174")) {
        return m1174((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1175")) {
        m1175((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1176")) {
        return m1176((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1177")) {
        m1177((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1178")) {
        return m1178((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1179")) {
        m1179((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1180")) {
        return m1180((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1181")) {
        m1181((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1182")) {
        return m1182((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1183")) {
        m1183((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1184")) {
        return m1184((com.badlogic.gdx.graphics.g2d.TextureRegion)obj);   }
     if(m.methodId.equals("m1185")) {
        m1185((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1186")) {
        m1186((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Boolean)params[0]).booleanValue(), ((Boolean)params[1]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1187")) {
        m1187((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1188")) {
        return m1188((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue());   }
     if(m.methodId.equals("m1189")) {
        return m1189((com.badlogic.gdx.graphics.g2d.TextureRegion)obj,(com.badlogic.gdx.graphics.Texture)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1198")) {
        m1198((com.badlogic.gdx.utils.Array)obj,(java.lang.Object)params[0]);
        return null;
     }
     if(m.methodId.equals("m1199")) {
        m1199((com.badlogic.gdx.utils.Array)obj,(com.badlogic.gdx.utils.Array)params[0]);
        return null;
     }
     if(m.methodId.equals("m1200")) {
        m1200((com.badlogic.gdx.utils.Array)obj,(com.badlogic.gdx.utils.Array)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1201")) {
        m1201((com.badlogic.gdx.utils.Array)obj,(java.lang.Object[])params[0]);
        return null;
     }
     if(m.methodId.equals("m1202")) {
        m1202((com.badlogic.gdx.utils.Array)obj,(java.lang.Object[])params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1203")) {
        return m1203((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1204")) {
        m1204((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue(), (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m1205")) {
        m1205((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue(), (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m1206")) {
        return m1206((com.badlogic.gdx.utils.Array)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m1207")) {
        return m1207((com.badlogic.gdx.utils.Array)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m1208")) {
        return m1208((com.badlogic.gdx.utils.Array)obj,(java.lang.Object)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m1209")) {
        return m1209((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1210")) {
        return m1210((com.badlogic.gdx.utils.Array)obj);   }
     if(m.methodId.equals("m1211")) {
        return m1211((com.badlogic.gdx.utils.Array)obj);   }
     if(m.methodId.equals("m1212")) {
        m1212((com.badlogic.gdx.utils.Array)obj);
        return null;
     }
     if(m.methodId.equals("m1213")) {
        m1213((com.badlogic.gdx.utils.Array)obj);
        return null;
     }
     if(m.methodId.equals("m1214")) {
        return m1214((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1215")) {
        return m1215((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue());   }
     if(m.methodId.equals("m1216")) {
        m1216((com.badlogic.gdx.utils.Array)obj);
        return null;
     }
     if(m.methodId.equals("m1217")) {
        m1217((com.badlogic.gdx.utils.Array)obj,(java.util.Comparator)params[0]);
        return null;
     }
     if(m.methodId.equals("m1218")) {
        m1218((com.badlogic.gdx.utils.Array)obj);
        return null;
     }
     if(m.methodId.equals("m1219")) {
        m1219((com.badlogic.gdx.utils.Array)obj);
        return null;
     }
     if(m.methodId.equals("m1220")) {
        return m1220((com.badlogic.gdx.utils.Array)obj);   }
     if(m.methodId.equals("m1221")) {
        m1221((com.badlogic.gdx.utils.Array)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1222")) {
        return m1222((com.badlogic.gdx.utils.Array)obj);   }
     if(m.methodId.equals("m1223")) {
        return m1223((com.badlogic.gdx.utils.Array)obj);   }
     if(m.methodId.equals("m1224")) {
        return m1224((com.badlogic.gdx.utils.Array)obj,(java.lang.Class)params[0]);   }
     if(m.methodId.equals("m1225")) {
        return m1225((com.badlogic.gdx.utils.Array)obj);   }
     if(m.methodId.equals("m1226")) {
        return m1226((com.badlogic.gdx.utils.Array)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1247")) {
        m1247((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,(com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1248")) {
        return m1248((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);   }
     if(m.methodId.equals("m1249")) {
        m1249((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,(java.lang.CharSequence)params[0]);
        return null;
     }
     if(m.methodId.equals("m1250")) {
        return m1250((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);   }
     if(m.methodId.equals("m1251")) {
        return m1251((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);   }
     if(m.methodId.equals("m1252")) {
        m1252((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1253")) {
        m1253((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1254")) {
        m1254((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m1255")) {
        m1255((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1256")) {
        m1256((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,(com.badlogic.gdx.graphics.Color)params[0]);
        return null;
     }
     if(m.methodId.equals("m1257")) {
        m1257((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1258")) {
        return m1258((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);   }
     if(m.methodId.equals("m1259")) {
        m1259((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
        return null;
     }
     if(m.methodId.equals("m1260")) {
        m1260((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);
        return null;
     }
     if(m.methodId.equals("m1261")) {
        m1261((com.badlogic.gdx.scenes.scene2d.ui.Label)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1262")) {
        return m1262((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);   }
     if(m.methodId.equals("m1263")) {
        return m1263((com.badlogic.gdx.scenes.scene2d.ui.Label)obj);   }
     if(m.methodId.equals("m1279")) {
        return m1279((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0], (java.lang.Object)params[1]);   }
     if(m.methodId.equals("m1280")) {
        return m1280((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0], (java.lang.String)params[1]);   }
     if(m.methodId.equals("m1281")) {
        return m1281((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0], (java.lang.String)params[1]);   }
     if(m.methodId.equals("m1282")) {
        m1282((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1], (java.lang.String)params[2], (java.util.List)params[3]);
        return null;
     }
     if(m.methodId.equals("m1283")) {
        return m1283((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0], (java.lang.Object)params[1], (java.lang.Class)params[2], (java.lang.String)params[3], (java.lang.String)params[4]);   }
     if(m.methodId.equals("m1284")) {
        return m1284((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)params[0]);   }
     if(m.methodId.equals("m1285")) {
        return m1285((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.Table)params[0]);   }
     if(m.methodId.equals("m1286")) {
        return m1286((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj);   }
     if(m.methodId.equals("m1287")) {
        m1287((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1], (java.lang.String)params[2]);
        return null;
     }
     if(m.methodId.equals("m1288")) {
        m1288((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.scenes.scene2d.Actor)params[1]);
        return null;
     }
     if(m.methodId.equals("m1289")) {
        return m1289((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1290")) {
        return m1290((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1291")) {
        return m1291((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1292")) {
        return m1292((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1293")) {
        return m1293((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1294")) {
        return m1294((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1295")) {
        m1295((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0]);
        return null;
     }
     if(m.methodId.equals("m1296")) {
        m1296((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.LibgdxToolkit)obj,(com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).intValue(), ((Number)params[4]).intValue(), ((Number)params[5]).intValue());
        return null;
     }
     if(m.methodId.equals("m1350")) {
        m1350((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(com.badlogic.gdx.files.FileHandle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1351")) {
        m1351((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m1352")) {
        return m1352((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.Class)params[1]);   }
     if(m.methodId.equals("m1353")) {
        return m1353((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.Class)params[1]);   }
     if(m.methodId.equals("m1354")) {
        return m1354((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1355")) {
        return m1355((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1356")) {
        return m1356((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1357")) {
        return m1357((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1358")) {
        m1358((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.Object)params[1]);
        return null;
     }
     if(m.methodId.equals("m1359")) {
        return m1359((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.Class)params[0]);   }
     if(m.methodId.equals("m1360")) {
        return m1360((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.Class)params[1]);   }
     if(m.methodId.equals("m1361")) {
        return m1361((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.Class)params[1]);   }
     if(m.methodId.equals("m1362")) {
        return m1362((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m1363")) {
        m1363((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], ((Boolean)params[1]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1364")) {
        return m1364((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.String)params[1]);   }
     if(m.methodId.equals("m1365")) {
        return m1365((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (com.badlogic.gdx.graphics.Color)params[1]);   }
     if(m.methodId.equals("m1366")) {
        return m1366((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (java.lang.String)params[1]);   }
     if(m.methodId.equals("m1367")) {
        return m1367((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.String)params[0], (com.badlogic.gdx.graphics.Color)params[1]);   }
     if(m.methodId.equals("m1368")) {
        return m1368((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(java.lang.Class)params[0], (java.lang.String)params[1]);   }
     if(m.methodId.equals("m1369")) {
        m1369((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(com.badlogic.gdx.graphics.Texture)params[0]);
        return null;
     }
     if(m.methodId.equals("m1370")) {
        return m1370((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj);   }
     if(m.methodId.equals("m1371")) {
        m1371((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj);
        return null;
     }
     if(m.methodId.equals("m1372")) {
        m1372((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(com.badlogic.gdx.files.FileHandle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1373")) {
        return m1373((com.badlogic.gdx.scenes.scene2d.ui.Skin)obj,(com.badlogic.gdx.files.FileHandle)params[0]);   }
     if(m.methodId.equals("m1382")) {
        return m1382((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0]);   }
     if(m.methodId.equals("m1383")) {
        return m1383((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1384")) {
        m1384((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj);
        return null;
     }
     if(m.methodId.equals("m1385")) {
        m1385((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj);
        return null;
     }
     if(m.methodId.equals("m1386")) {
        m1386((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], (com.badlogic.gdx.math.Vector2)params[1]);
        return null;
     }
     if(m.methodId.equals("m1387")) {
        m1387((com.badlogic.gdx.scenes.scene2d.ui.tablelayout.TableLayout)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0]);
        return null;
     }
     if(m.methodId.equals("m1412")) {
        return m1412((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj,((Character)params[0]).charValue());   }
     if(m.methodId.equals("m1413")) {
        m1413((com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)obj,((Number)params[0]).intValue(), ((Number)params[1]).intValue());
        return null;
     }
     if(m.methodId.equals("m1414")) {
        return m1414((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter.DigitsOnlyFilter)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField)params[0], ((Character)params[1]).charValue());   }
     if(m.methodId.equals("m1450")) {
        return m1450((com.badlogic.gdx.utils.ObjectMap.Keys)obj);   }
     if(m.methodId.equals("m1451")) {
        return m1451((com.badlogic.gdx.utils.ObjectMap.Keys)obj);   }
     if(m.methodId.equals("m1452")) {
        return m1452((com.badlogic.gdx.utils.ObjectMap.Keys)obj);   }
     if(m.methodId.equals("m1453")) {
        return m1453((com.badlogic.gdx.utils.ObjectMap.Keys)obj);   }
     if(m.methodId.equals("m1480")) {
        m1480((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj,((Number)params[0]).intValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.Glyph)params[1]);
        return null;
     }
     if(m.methodId.equals("m1481")) {
        return m1481((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);   }
     if(m.methodId.equals("m1482")) {
        return m1482((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj,((Character)params[0]).charValue());   }
     if(m.methodId.equals("m1483")) {
        return m1483((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);   }
     if(m.methodId.equals("m1484")) {
        return m1484((com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)obj);   }
     if(m.methodId.equals("m1489")) {
        m1489((com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)obj,(com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)params[0]);
        return null;
     }
     if(m.methodId.equals("m1537")) {
        return m1537((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj,(com.badlogic.gdx.math.Rectangle)params[0]);   }
     if(m.methodId.equals("m1538")) {
        m1538((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj);
        return null;
     }
     if(m.methodId.equals("m1539")) {
        m1539((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj,(com.badlogic.gdx.math.Rectangle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1540")) {
        m1540((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj,(com.badlogic.gdx.graphics.Camera)params[0], (com.badlogic.gdx.math.Matrix4)params[1], (com.badlogic.gdx.math.Rectangle)params[2], (com.badlogic.gdx.math.Rectangle)params[3]);
        return null;
     }
     if(m.methodId.equals("m1541")) {
        return m1541((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj);   }
     if(m.methodId.equals("m1542")) {
        m1542((com.badlogic.gdx.scenes.scene2d.ui.utils.ScissorStack)obj,(com.badlogic.gdx.graphics.Camera)params[0], (com.badlogic.gdx.math.Matrix4)params[1], (com.badlogic.gdx.math.Vector2)params[2]);
        return null;
     }
     if(m.methodId.equals("m1545")) {
        return m1545((com.badlogic.gdx.utils.ObjectMap.Entries)obj);   }
     if(m.methodId.equals("m1546")) {
        return m1546((com.badlogic.gdx.utils.ObjectMap.Entries)obj);   }
     if(m.methodId.equals("m1547")) {
        return m1547((com.badlogic.gdx.utils.ObjectMap.Entries)obj);   }
     if(m.methodId.equals("m1554")) {
        return m1554((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)obj);   }
     if(m.methodId.equals("m1555")) {
        return m1555((com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1582")) {
        m1582((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.BitmapFont.BitmapFontData)params[0]);
        return null;
     }
     if(m.methodId.equals("m1583")) {
        return m1583((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], (java.lang.CharSequence)params[1], ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m1584")) {
        return m1584((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], (java.lang.CharSequence)params[1], ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), ((Number)params[4]).intValue(), ((Number)params[5]).intValue());   }
     if(m.methodId.equals("m1585")) {
        return m1585((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], (java.lang.CharSequence)params[1], ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m1586")) {
        return m1586((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], (java.lang.CharSequence)params[1], ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), ((Number)params[4]).floatValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)params[5]);   }
     if(m.methodId.equals("m1587")) {
        return m1587((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], (java.lang.CharSequence)params[1], ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), ((Number)params[4]).floatValue());   }
     if(m.methodId.equals("m1588")) {
        return m1588((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], (java.lang.CharSequence)params[1], ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue(), ((Number)params[4]).floatValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.HAlignment)params[5]);   }
     if(m.methodId.equals("m1589")) {
        return m1589((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0]);   }
     if(m.methodId.equals("m1590")) {
        return m1590((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], (com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)params[1]);   }
     if(m.methodId.equals("m1591")) {
        return m1591((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1592")) {
        return m1592((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)params[3]);   }
     if(m.methodId.equals("m1593")) {
        return m1593((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0]);   }
     if(m.methodId.equals("m1594")) {
        return m1594((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], (com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)params[1]);   }
     if(m.methodId.equals("m1595")) {
        return m1595((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue());   }
     if(m.methodId.equals("m1596")) {
        return m1596((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).floatValue(), (com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds)params[2]);   }
     if(m.methodId.equals("m1597")) {
        m1597((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], (com.badlogic.gdx.utils.FloatArray)params[1], (com.badlogic.gdx.utils.FloatArray)params[2]);
        return null;
     }
     if(m.methodId.equals("m1598")) {
        return m1598((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], ((Number)params[1]).intValue(), ((Number)params[2]).intValue(), ((Number)params[3]).floatValue());   }
     if(m.methodId.equals("m1599")) {
        m1599((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1600")) {
        m1600((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(com.badlogic.gdx.graphics.Color)params[0]);
        return null;
     }
     if(m.methodId.equals("m1601")) {
        m1601((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue(), ((Number)params[3]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1602")) {
        return m1602((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1603")) {
        m1603((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1604")) {
        m1604((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1605")) {
        m1605((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1606")) {
        return m1606((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1607")) {
        return m1607((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1608")) {
        return m1608((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1609")) {
        return m1609((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1610")) {
        return m1610((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1611")) {
        return m1611((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1612")) {
        return m1612((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1613")) {
        return m1613((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1614")) {
        return m1614((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1615")) {
        return m1615((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1616")) {
        m1616((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);
        return null;
     }
     if(m.methodId.equals("m1617")) {
        m1617((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0]);
        return null;
     }
     if(m.methodId.equals("m1618")) {
        return m1618((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Character)params[0]).charValue());   }
     if(m.methodId.equals("m1619")) {
        m1619((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1620")) {
        return m1620((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1621")) {
        return m1621((com.badlogic.gdx.graphics.g2d.BitmapFont)obj);   }
     if(m.methodId.equals("m1622")) {
        return m1622((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,(java.lang.CharSequence)params[0], ((Character)params[1]).charValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1623")) {
        return m1623((com.badlogic.gdx.graphics.g2d.BitmapFont)obj,((Character)params[0]).charValue());   }
     if(m.methodId.equals("m1642")) {
        return m1642((com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard)obj);   }
     if(m.methodId.equals("m1643")) {
        m1643((com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m1644")) {
        return m1644((com.badlogic.gdx.scenes.scene2d.ui.utils.Clipboard)obj);   }
     if(m.methodId.equals("m1758")) {
        m1758((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button)params[0]);
        return null;
     }
     if(m.methodId.equals("m1759")) {
        m1759((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button[])params[0]);
        return null;
     }
     if(m.methodId.equals("m1760")) {
        m1760((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,(java.lang.String)params[0]);
        return null;
     }
     if(m.methodId.equals("m1761")) {
        return m1761((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button)params[0], ((Boolean)params[1]).booleanValue());   }
     if(m.methodId.equals("m1762")) {
        m1762((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);
        return null;
     }
     if(m.methodId.equals("m1763")) {
        return m1763((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);   }
     if(m.methodId.equals("m1764")) {
        return m1764((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);   }
     if(m.methodId.equals("m1765")) {
        return m1765((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj);   }
     if(m.methodId.equals("m1766")) {
        m1766((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1767")) {
        m1767((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1768")) {
        m1768((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,(com.badlogic.gdx.scenes.scene2d.ui.ClickListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m1769")) {
        m1769((com.badlogic.gdx.scenes.scene2d.ui.ButtonGroup)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1786")) {
        return m1786((com.badlogic.gdx.utils.OrderedMap)obj,(java.lang.Object)params[0], (java.lang.Object)params[1]);   }
     if(m.methodId.equals("m1787")) {
        return m1787((com.badlogic.gdx.utils.OrderedMap)obj,(java.lang.Object)params[0]);   }
     if(m.methodId.equals("m1788")) {
        m1788((com.badlogic.gdx.utils.OrderedMap)obj);
        return null;
     }
     if(m.methodId.equals("m1789")) {
        return m1789((com.badlogic.gdx.utils.OrderedMap)obj);   }
     if(m.methodId.equals("m1790")) {
        return m1790((com.badlogic.gdx.utils.OrderedMap)obj);   }
     if(m.methodId.equals("m1791")) {
        return m1791((com.badlogic.gdx.utils.OrderedMap)obj);   }
     if(m.methodId.equals("m1792")) {
        return m1792((com.badlogic.gdx.utils.OrderedMap)obj);   }
     if(m.methodId.equals("m1793")) {
        return m1793((com.badlogic.gdx.utils.OrderedMap)obj);   }
     if(m.methodId.equals("m1798")) {
        m1798((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1799")) {
        return m1799((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj);   }
     if(m.methodId.equals("m1800")) {
        m1800((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1801")) {
        return m1801((com.badlogic.gdx.scenes.scene2d.ui.CheckBox)obj);   }
     if(m.methodId.equals("m1818")) {
        m1818((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,(com.badlogic.gdx.scenes.scene2d.ui.Slider.SliderStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1819")) {
        return m1819((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);   }
     if(m.methodId.equals("m1820")) {
        m1820((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1821")) {
        return m1821((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1822")) {
        m1822((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1823")) {
        m1823((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1824")) {
        m1824((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1825")) {
        return m1825((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);   }
     if(m.methodId.equals("m1826")) {
        m1826((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,(com.badlogic.gdx.scenes.scene2d.ui.Slider.ValueChangedListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m1827")) {
        return m1827((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);   }
     if(m.methodId.equals("m1828")) {
        m1828((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,((Number)params[0]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1829")) {
        m1829((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1830")) {
        return m1830((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);   }
     if(m.methodId.equals("m1831")) {
        return m1831((com.badlogic.gdx.scenes.scene2d.ui.Slider)obj);   }
     if(m.methodId.equals("m1840")) {
        m1840((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);
        return null;
     }
     if(m.methodId.equals("m1841")) {
        m1841((com.badlogic.gdx.scenes.scene2d.ui.Button)obj,((Boolean)params[0]).booleanValue());
        return null;
     }
     if(m.methodId.equals("m1842")) {
        return m1842((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);   }
     if(m.methodId.equals("m1843")) {
        m1843((com.badlogic.gdx.scenes.scene2d.ui.Button)obj,(com.badlogic.gdx.scenes.scene2d.ui.Button.ButtonStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1844")) {
        return m1844((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);   }
     if(m.methodId.equals("m1845")) {
        m1845((com.badlogic.gdx.scenes.scene2d.ui.Button)obj,(com.badlogic.gdx.scenes.scene2d.ui.ClickListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m1846")) {
        m1846((com.badlogic.gdx.scenes.scene2d.ui.Button)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1847")) {
        return m1847((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);   }
     if(m.methodId.equals("m1848")) {
        return m1848((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);   }
     if(m.methodId.equals("m1849")) {
        return m1849((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);   }
     if(m.methodId.equals("m1850")) {
        return m1850((com.badlogic.gdx.scenes.scene2d.ui.Button)obj);   }
     if(m.methodId.equals("m1871")) {
        m1871((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);
        return null;
     }
     if(m.methodId.equals("m1872")) {
        m1872((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1873")) {
        m1873((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,(com.badlogic.gdx.graphics.g2d.TextureRegion)params[0]);
        return null;
     }
     if(m.methodId.equals("m1874")) {
        return m1874((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1875")) {
        m1875((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,(com.badlogic.gdx.graphics.g2d.NinePatch)params[0]);
        return null;
     }
     if(m.methodId.equals("m1876")) {
        return m1876((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1877")) {
        m1877((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,(com.badlogic.gdx.utils.Scaling)params[0]);
        return null;
     }
     if(m.methodId.equals("m1878")) {
        m1878((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1879")) {
        return m1879((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1880")) {
        return m1880((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1881")) {
        return m1881((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1882")) {
        return m1882((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1883")) {
        return m1883((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1884")) {
        m1884((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1885")) {
        m1885((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());
        return null;
     }
     if(m.methodId.equals("m1886")) {
        m1886((com.badlogic.gdx.scenes.scene2d.ui.Image)obj,(com.badlogic.gdx.scenes.scene2d.ui.ClickListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m1887")) {
        return m1887((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1888")) {
        return m1888((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1889")) {
        return m1889((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1890")) {
        return m1890((com.badlogic.gdx.scenes.scene2d.ui.Image)obj);   }
     if(m.methodId.equals("m1891")) {
        m1891((com.badlogic.gdx.scenes.scene2d.ui.ClickListener)obj,(com.badlogic.gdx.scenes.scene2d.Actor)params[0], ((Number)params[1]).floatValue(), ((Number)params[2]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1946")) {
        m1946((com.badlogic.gdx.scenes.scene2d.ui.List)obj,(com.badlogic.gdx.scenes.scene2d.ui.List.ListStyle)params[0]);
        return null;
     }
     if(m.methodId.equals("m1947")) {
        return m1947((com.badlogic.gdx.scenes.scene2d.ui.List)obj);   }
     if(m.methodId.equals("m1948")) {
        m1948((com.badlogic.gdx.scenes.scene2d.ui.List)obj,(com.badlogic.gdx.graphics.g2d.SpriteBatch)params[0], ((Number)params[1]).floatValue());
        return null;
     }
     if(m.methodId.equals("m1949")) {
        return m1949((com.badlogic.gdx.scenes.scene2d.ui.List)obj,((Number)params[0]).floatValue(), ((Number)params[1]).floatValue(), ((Number)params[2]).intValue());   }
     if(m.methodId.equals("m1950")) {
        return m1950((com.badlogic.gdx.scenes.scene2d.ui.List)obj);   }
     if(m.methodId.equals("m1951")) {
        m1951((com.badlogic.gdx.scenes.scene2d.ui.List)obj,((Number)params[0]).intValue());
        return null;
     }
     if(m.methodId.equals("m1952")) {
        return m1952((com.badlogic.gdx.scenes.scene2d.ui.List)obj);   }
     if(m.methodId.equals("m1953")) {
        return m1953((com.badlogic.gdx.scenes.scene2d.ui.List)obj,(java.lang.String)params[0]);   }
     if(m.methodId.equals("m1954")) {
        m1954((com.badlogic.gdx.scenes.scene2d.ui.List)obj,(java.lang.Object[])params[0]);
        return null;
     }
     if(m.methodId.equals("m1955")) {
        return m1955((com.badlogic.gdx.scenes.scene2d.ui.List)obj);   }
     if(m.methodId.equals("m1956")) {
        return m1956((com.badlogic.gdx.scenes.scene2d.ui.List)obj);   }
     if(m.methodId.equals("m1957")) {
        return m1957((com.badlogic.gdx.scenes.scene2d.ui.List)obj);   }
     if(m.methodId.equals("m1958")) {
        m1958((com.badlogic.gdx.scenes.scene2d.ui.List)obj,(com.badlogic.gdx.scenes.scene2d.ui.SelectionListener)params[0]);
        return null;
     }
     if(m.methodId.equals("m1959")) {
        m1959((com.badlogic.gdx.scenes.scene2d.ui.List)obj,(com.badlogic.gdx.math.Rectangle)params[0]);
        return null;
     }
     if(m.methodId.equals("m2060")) {
        return m2060((com.badlogic.gdx.scenes.scene2d.ui.TextField.TextFieldFilter)obj,(com.badlogic.gdx.scenes.scene2d.ui.TextField)params[0], ((Character)params[1]).charValue());   }
     return null;
  }
}
