/*    */ package android.net;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.io.File;
/*    */ import java.util.List;
/*    */ import java.util.Set;
/*    */ 
/*    */ public abstract class Uri
/*    */   implements Parcelable, Comparable<Uri>
/*    */ {
/* 67 */   public static final Uri EMPTY = null; public static final Parcelable.Creator<Uri> CREATOR = null;
/*    */ 
/*    */   Uri()
/*    */   {
/* 26 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isHierarchical();
/*    */ 
/* 28 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean isRelative();
/*    */ 
/* 30 */   public boolean isAbsolute() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract String getScheme();
/*    */ 
/*    */   public abstract String getSchemeSpecificPart();
/*    */ 
/*    */   public abstract String getEncodedSchemeSpecificPart();
/*    */ 
/*    */   public abstract String getAuthority();
/*    */ 
/*    */   public abstract String getEncodedAuthority();
/*    */ 
/*    */   public abstract String getUserInfo();
/*    */ 
/*    */   public abstract String getEncodedUserInfo();
/*    */ 
/*    */   public abstract String getHost();
/*    */ 
/*    */   public abstract int getPort();
/*    */ 
/*    */   public abstract String getPath();
/*    */ 
/*    */   public abstract String getEncodedPath();
/*    */ 
/*    */   public abstract String getQuery();
/*    */ 
/*    */   public abstract String getEncodedQuery();
/*    */ 
/*    */   public abstract String getFragment();
/*    */ 
/*    */   public abstract String getEncodedFragment();
/*    */ 
/*    */   public abstract List<String> getPathSegments();
/*    */ 
/*    */   public abstract String getLastPathSegment();
/*    */ 
/* 48 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 49 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 50 */   public int compareTo(Uri other) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract String toString();
/*    */ 
/*    */   public abstract Builder buildUpon();
/*    */ 
/* 53 */   public static Uri parse(String uriString) { throw new RuntimeException("Stub!"); } 
/* 54 */   public static Uri fromFile(File file) { throw new RuntimeException("Stub!"); } 
/* 55 */   public static Uri fromParts(String scheme, String ssp, String fragment) { throw new RuntimeException("Stub!"); } 
/* 56 */   public Set<String> getQueryParameterNames() { throw new RuntimeException("Stub!"); } 
/* 57 */   public List<String> getQueryParameters(String key) { throw new RuntimeException("Stub!"); } 
/* 58 */   public String getQueryParameter(String key) { throw new RuntimeException("Stub!"); } 
/* 59 */   public boolean getBooleanQueryParameter(String key, boolean defaultValue) { throw new RuntimeException("Stub!"); } 
/* 60 */   public static void writeToParcel(Parcel out, Uri uri) { throw new RuntimeException("Stub!"); } 
/* 61 */   public static String encode(String s) { throw new RuntimeException("Stub!"); } 
/* 62 */   public static String encode(String s, String allow) { throw new RuntimeException("Stub!"); } 
/* 63 */   public static String decode(String s) { throw new RuntimeException("Stub!"); } 
/* 64 */   public static Uri withAppendedPath(Uri baseUri, String pathSegment) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static final class Builder
/*    */   {
/*    */     public Builder()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public Builder scheme(String scheme) { throw new RuntimeException("Stub!"); } 
/*  9 */     public Builder opaquePart(String opaquePart) { throw new RuntimeException("Stub!"); } 
/* 10 */     public Builder encodedOpaquePart(String opaquePart) { throw new RuntimeException("Stub!"); } 
/* 11 */     public Builder authority(String authority) { throw new RuntimeException("Stub!"); } 
/* 12 */     public Builder encodedAuthority(String authority) { throw new RuntimeException("Stub!"); } 
/* 13 */     public Builder path(String path) { throw new RuntimeException("Stub!"); } 
/* 14 */     public Builder encodedPath(String path) { throw new RuntimeException("Stub!"); } 
/* 15 */     public Builder appendPath(String newSegment) { throw new RuntimeException("Stub!"); } 
/* 16 */     public Builder appendEncodedPath(String newSegment) { throw new RuntimeException("Stub!"); } 
/* 17 */     public Builder query(String query) { throw new RuntimeException("Stub!"); } 
/* 18 */     public Builder encodedQuery(String query) { throw new RuntimeException("Stub!"); } 
/* 19 */     public Builder fragment(String fragment) { throw new RuntimeException("Stub!"); } 
/* 20 */     public Builder encodedFragment(String fragment) { throw new RuntimeException("Stub!"); } 
/* 21 */     public Builder appendQueryParameter(String key, String value) { throw new RuntimeException("Stub!"); } 
/* 22 */     public Builder clearQuery() { throw new RuntimeException("Stub!"); } 
/* 23 */     public Uri build() { throw new RuntimeException("Stub!"); } 
/* 24 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.Uri
 * JD-Core Version:    0.6.0
 */