/*    */ package android.telephony;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ public class ServiceState
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int STATE_IN_SERVICE = 0;
/*    */   public static final int STATE_OUT_OF_SERVICE = 1;
/*    */   public static final int STATE_EMERGENCY_ONLY = 2;
/*    */   public static final int STATE_POWER_OFF = 3;
/* 31 */   public static final Parcelable.Creator<ServiceState> CREATOR = null;
/*    */ 
/*    */   public ServiceState()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public ServiceState(ServiceState s) { throw new RuntimeException("Stub!"); } 
/*  7 */   public ServiceState(Parcel in) { throw new RuntimeException("Stub!"); } 
/*  8 */   protected void copyFrom(ServiceState s) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); } 
/* 10 */   public int describeContents() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getState() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean getRoaming() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getOperatorAlphaLong() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getOperatorAlphaShort() { throw new RuntimeException("Stub!"); } 
/* 15 */   public String getOperatorNumeric() { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean getIsManualSelection() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setStateOutOfService() { throw new RuntimeException("Stub!"); } 
/* 21 */   public void setStateOff() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setState(int state) { throw new RuntimeException("Stub!"); } 
/* 23 */   public void setRoaming(boolean roaming) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setOperatorName(String longName, String shortName, String numeric) { throw new RuntimeException("Stub!"); } 
/* 25 */   public void setIsManualSelection(boolean isManual) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.telephony.ServiceState
 * JD-Core Version:    0.6.0
 */