/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public final class SearchableInfo
/*    */   implements Parcelable
/*    */ {
/* 33 */   public static final Parcelable.Creator<SearchableInfo> CREATOR = null;
/*    */ 
/*    */   SearchableInfo()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public String getSuggestAuthority() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getSuggestPackage() { throw new RuntimeException("Stub!"); } 
/*  8 */   public ComponentName getSearchActivity() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean shouldRewriteQueryFromData() { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean shouldRewriteQueryFromText() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getSettingsDescriptionId() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getSuggestPath() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getSuggestSelection() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getSuggestIntentAction() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getSuggestIntentData() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int getSuggestThreshold() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int getHintId() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean getVoiceSearchEnabled() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean getVoiceSearchLaunchWebSearch() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean getVoiceSearchLaunchRecognizer() { throw new RuntimeException("Stub!"); } 
/* 21 */   public int getVoiceLanguageModeId() { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getVoicePromptTextId() { throw new RuntimeException("Stub!"); } 
/* 23 */   public int getVoiceLanguageId() { throw new RuntimeException("Stub!"); } 
/* 24 */   public int getVoiceMaxResults() { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getInputType() { throw new RuntimeException("Stub!"); } 
/* 26 */   public int getImeOptions() { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean shouldIncludeInGlobalSearch() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean queryAfterZeroResults() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean autoUrlDetect() { throw new RuntimeException("Stub!"); } 
/* 30 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.SearchableInfo
 * JD-Core Version:    0.6.0
 */