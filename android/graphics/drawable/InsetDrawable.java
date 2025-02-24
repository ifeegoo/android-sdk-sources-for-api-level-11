/*    */ package android.graphics.drawable;
/*    */ 
/*    */ import android.content.res.Resources;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.ColorFilter;
/*    */ import android.graphics.Rect;
/*    */ import android.util.AttributeSet;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParser;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ public class InsetDrawable extends Drawable
/*    */   implements Drawable.Callback
/*    */ {
/*    */   public InsetDrawable(Drawable drawable, int inset)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public InsetDrawable(Drawable drawable, int insetLeft, int insetTop, int insetRight, int insetBottom) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void inflate(Resources r, XmlPullParser parser, AttributeSet attrs) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void invalidateDrawable(Drawable who) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void scheduleDrawable(Drawable who, Runnable what, long when) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void unscheduleDrawable(Drawable who, Runnable what) { throw new RuntimeException("Stub!"); } 
/* 12 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean getPadding(Rect padding) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean setVisible(boolean visible, boolean restart) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setAlpha(int alpha) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setColorFilter(ColorFilter cf) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int getOpacity() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isStateful() { throw new RuntimeException("Stub!"); } 
/* 20 */   protected boolean onStateChange(int[] state) { throw new RuntimeException("Stub!"); } 
/* 21 */   protected void onBoundsChange(Rect bounds) { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getIntrinsicWidth() { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getIntrinsicHeight() { throw new RuntimeException("Stub!"); } 
/* 24 */   public Drawable.ConstantState getConstantState() { throw new RuntimeException("Stub!"); } 
/* 25 */   public Drawable mutate() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.graphics.drawable.InsetDrawable
 * JD-Core Version:    0.6.0
 */