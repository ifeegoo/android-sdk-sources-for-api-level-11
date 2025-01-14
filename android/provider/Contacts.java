/*     */ package android.provider;
/*     */ 
/*     */ import android.content.ContentResolver;
/*     */ import android.content.ContentValues;
/*     */ import android.content.Context;
/*     */ import android.database.Cursor;
/*     */ import android.graphics.Bitmap;
/*     */ import android.graphics.BitmapFactory.Options;
/*     */ import android.net.Uri;
/*     */ import java.io.InputStream;
/*     */ 
/*     */ @Deprecated
/*     */ public class Contacts
/*     */ {
/*     */   public static final String AUTHORITY = "contacts";
/* 354 */   public static final Uri CONTENT_URI = null;
/*     */   public static final int KIND_EMAIL = 1;
/*     */   public static final int KIND_POSTAL = 2;
/*     */   public static final int KIND_IM = 3;
/*     */   public static final int KIND_ORGANIZATION = 4;
/*     */   public static final int KIND_PHONE = 5;
/*     */ 
/*     */   Contacts()
/*     */   {
/* 346 */     throw new RuntimeException("Stub!");
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Intents
/*     */   {
/*     */     public static final String SEARCH_SUGGESTION_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_DIAL_NUMBER_CLICKED";
/*     */     public static final String SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED = "android.provider.Contacts.SEARCH_SUGGESTION_CREATE_CONTACT_CLICKED";
/*     */     public static final String ATTACH_IMAGE = "com.android.contacts.action.ATTACH_IMAGE";
/*     */     public static final String SHOW_OR_CREATE_CONTACT = "com.android.contacts.action.SHOW_OR_CREATE_CONTACT";
/*     */     public static final String EXTRA_FORCE_CREATE = "com.android.contacts.action.FORCE_CREATE";
/*     */     public static final String EXTRA_CREATE_DESCRIPTION = "com.android.contacts.action.CREATE_DESCRIPTION";
/*     */ 
/*     */     public Intents()
/*     */     {
/* 337 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class Insert
/*     */     {
/*     */       public static final String ACTION = "android.intent.action.INSERT";
/*     */       public static final String FULL_MODE = "full_mode";
/*     */       public static final String NAME = "name";
/*     */       public static final String PHONETIC_NAME = "phonetic_name";
/*     */       public static final String COMPANY = "company";
/*     */       public static final String JOB_TITLE = "job_title";
/*     */       public static final String NOTES = "notes";
/*     */       public static final String PHONE = "phone";
/*     */       public static final String PHONE_TYPE = "phone_type";
/*     */       public static final String PHONE_ISPRIMARY = "phone_isprimary";
/*     */       public static final String SECONDARY_PHONE = "secondary_phone";
/*     */       public static final String SECONDARY_PHONE_TYPE = "secondary_phone_type";
/*     */       public static final String TERTIARY_PHONE = "tertiary_phone";
/*     */       public static final String TERTIARY_PHONE_TYPE = "tertiary_phone_type";
/*     */       public static final String EMAIL = "email";
/*     */       public static final String EMAIL_TYPE = "email_type";
/*     */       public static final String EMAIL_ISPRIMARY = "email_isprimary";
/*     */       public static final String SECONDARY_EMAIL = "secondary_email";
/*     */       public static final String SECONDARY_EMAIL_TYPE = "secondary_email_type";
/*     */       public static final String TERTIARY_EMAIL = "tertiary_email";
/*     */       public static final String TERTIARY_EMAIL_TYPE = "tertiary_email_type";
/*     */       public static final String POSTAL = "postal";
/*     */       public static final String POSTAL_TYPE = "postal_type";
/*     */       public static final String POSTAL_ISPRIMARY = "postal_isprimary";
/*     */       public static final String IM_HANDLE = "im_handle";
/*     */       public static final String IM_PROTOCOL = "im_protocol";
/*     */       public static final String IM_ISPRIMARY = "im_isprimary";
/*     */ 
/*     */       public Insert()
/*     */       {
/* 308 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class UI
/*     */     {
/*     */       public static final String LIST_DEFAULT = "com.android.contacts.action.LIST_DEFAULT";
/*     */       public static final String LIST_GROUP_ACTION = "com.android.contacts.action.LIST_GROUP";
/*     */       public static final String GROUP_NAME_EXTRA_KEY = "com.android.contacts.extra.GROUP";
/*     */       public static final String LIST_ALL_CONTACTS_ACTION = "com.android.contacts.action.LIST_ALL_CONTACTS";
/*     */       public static final String LIST_CONTACTS_WITH_PHONES_ACTION = "com.android.contacts.action.LIST_CONTACTS_WITH_PHONES";
/*     */       public static final String LIST_STARRED_ACTION = "com.android.contacts.action.LIST_STARRED";
/*     */       public static final String LIST_FREQUENT_ACTION = "com.android.contacts.action.LIST_FREQUENT";
/*     */       public static final String LIST_STREQUENT_ACTION = "com.android.contacts.action.LIST_STREQUENT";
/*     */       public static final String TITLE_EXTRA_KEY = "com.android.contacts.extra.TITLE_EXTRA";
/*     */       public static final String FILTER_CONTACTS_ACTION = "com.android.contacts.action.FILTER_CONTACTS";
/*     */       public static final String FILTER_TEXT_EXTRA_KEY = "com.android.contacts.extra.FILTER_TEXT";
/*     */ 
/*     */       public UI()
/*     */       {
/* 292 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Extensions
/*     */     implements BaseColumns, Contacts.ExtensionsColumns
/*     */   {
/* 284 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact_extensions";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contact_extensions";
/*     */     public static final String DEFAULT_SORT_ORDER = "person, name ASC";
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     Extensions()
/*     */     {
/* 278 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface ExtensionsColumns
/*     */   {
/*     */     public static final String NAME = "name";
/*     */     public static final String VALUE = "value";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Photos
/*     */     implements BaseColumns, Contacts.PhotosColumns
/*     */   {
/* 266 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_DIRECTORY = "photo";
/*     */     public static final String DEFAULT_SORT_ORDER = "person ASC";
/*     */ 
/*     */     Photos()
/*     */     {
/* 262 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PhotosColumns
/*     */   {
/*     */     public static final String LOCAL_VERSION = "local_version";
/*     */     public static final String PERSON_ID = "person";
/*     */     public static final String DOWNLOAD_REQUIRED = "download_required";
/*     */     public static final String EXISTS_ON_SERVER = "exists_on_server";
/*     */     public static final String SYNC_ERROR = "sync_error";
/*     */     public static final String DATA = "data";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Organizations
/*     */     implements BaseColumns, Contacts.OrganizationColumns
/*     */   {
/* 246 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_DIRECTORY = "organizations";
/*     */     public static final String DEFAULT_SORT_ORDER = "company, title, isprimary ASC";
/*     */ 
/*     */     Organizations()
/*     */     {
/* 241 */       throw new RuntimeException("Stub!"); } 
/* 242 */     public static final CharSequence getDisplayLabel(Context context, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface OrganizationColumns
/*     */   {
/*     */     public static final String TYPE = "type";
/*     */     public static final int TYPE_CUSTOM = 0;
/*     */     public static final int TYPE_WORK = 1;
/*     */     public static final int TYPE_OTHER = 2;
/*     */     public static final String LABEL = "label";
/*     */     public static final String COMPANY = "company";
/*     */     public static final String TITLE = "title";
/*     */     public static final String PERSON_ID = "person";
/*     */     public static final String ISPRIMARY = "isprimary";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PresenceColumns
/*     */   {
/*     */     public static final String PRIORITY = "priority";
/*     */     public static final String PRESENCE_STATUS = "mode";
/*     */     public static final int OFFLINE = 0;
/*     */     public static final int INVISIBLE = 1;
/*     */     public static final int AWAY = 2;
/*     */     public static final int IDLE = 3;
/*     */     public static final int DO_NOT_DISTURB = 4;
/*     */     public static final int AVAILABLE = 5;
/*     */     public static final String PRESENCE_CUSTOM_STATUS = "status";
/*     */     public static final String IM_PROTOCOL = "im_protocol";
/*     */     public static final String IM_HANDLE = "im_handle";
/*     */     public static final String IM_ACCOUNT = "im_account";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class ContactMethods
/*     */     implements BaseColumns, Contacts.ContactMethodsColumns, Contacts.PeopleColumns
/*     */   {
/*     */     public static final String POSTAL_LOCATION_LATITUDE = "data";
/*     */     public static final String POSTAL_LOCATION_LONGITUDE = "aux_data";
/*     */     public static final int PROTOCOL_AIM = 0;
/*     */     public static final int PROTOCOL_MSN = 1;
/*     */     public static final int PROTOCOL_YAHOO = 2;
/*     */     public static final int PROTOCOL_SKYPE = 3;
/*     */     public static final int PROTOCOL_QQ = 4;
/*     */     public static final int PROTOCOL_GOOGLE_TALK = 5;
/*     */     public static final int PROTOCOL_ICQ = 6;
/*     */     public static final int PROTOCOL_JABBER = 7;
/* 206 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_EMAIL_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contact-methods";
/*     */     public static final String CONTENT_EMAIL_TYPE = "vnd.android.cursor.dir/email";
/*     */     public static final String CONTENT_POSTAL_TYPE = "vnd.android.cursor.dir/postal-address";
/*     */     public static final String CONTENT_EMAIL_ITEM_TYPE = "vnd.android.cursor.item/email";
/*     */     public static final String CONTENT_POSTAL_ITEM_TYPE = "vnd.android.cursor.item/postal-address";
/*     */     public static final String CONTENT_IM_ITEM_TYPE = "vnd.android.cursor.item/jabber-im";
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     ContactMethods()
/*     */     {
/* 180 */       throw new RuntimeException("Stub!"); } 
/* 181 */     public static String encodePredefinedImProtocol(int protocol) { throw new RuntimeException("Stub!"); } 
/* 182 */     public static String encodeCustomImProtocol(String protocolString) { throw new RuntimeException("Stub!"); } 
/* 183 */     public static Object decodeImProtocol(String encodedString) { throw new RuntimeException("Stub!"); } 
/* 184 */     public static final CharSequence getDisplayLabel(Context context, int kind, int type, CharSequence label) { throw new RuntimeException("Stub!"); } 
/* 185 */     public void addPostalLocation(Context context, long postalId, double latitude, double longitude) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface ContactMethodsColumns
/*     */   {
/*     */     public static final String KIND = "kind";
/*     */     public static final String TYPE = "type";
/*     */     public static final int TYPE_CUSTOM = 0;
/*     */     public static final int TYPE_HOME = 1;
/*     */     public static final int TYPE_WORK = 2;
/*     */     public static final int TYPE_OTHER = 3;
/*     */     public static final String LABEL = "label";
/*     */     public static final String DATA = "data";
/*     */     public static final String AUX_DATA = "aux_data";
/*     */     public static final String ISPRIMARY = "isprimary";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class GroupMembership
/*     */     implements BaseColumns, Contacts.GroupsColumns
/*     */   {
/* 160 */     public static final Uri CONTENT_URI = null; public static final Uri RAW_CONTENT_URI = null;
/*     */     public static final String CONTENT_DIRECTORY = "groupmembership";
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroupmembership";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroupmembership";
/*     */     public static final String DEFAULT_SORT_ORDER = "group_id ASC";
/*     */     public static final String GROUP_ID = "group_id";
/*     */     public static final String GROUP_SYNC_ID = "group_sync_id";
/*     */     public static final String GROUP_SYNC_ACCOUNT = "group_sync_account";
/*     */     public static final String GROUP_SYNC_ACCOUNT_TYPE = "group_sync_account_type";
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     GroupMembership()
/*     */     {
/* 148 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Phones
/*     */     implements BaseColumns, Contacts.PhonesColumns, Contacts.PeopleColumns
/*     */   {
/* 142 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URL = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/phone";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/phone";
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */     public static final String PERSON_ID = "person";
/*     */ 
/*     */     Phones()
/*     */     {
/* 133 */       throw new RuntimeException("Stub!"); } 
/* 134 */     public static final CharSequence getDisplayLabel(Context context, int type, CharSequence label, CharSequence[] labelArray) { throw new RuntimeException("Stub!"); } 
/* 135 */     public static final CharSequence getDisplayLabel(Context context, int type, CharSequence label) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PhonesColumns
/*     */   {
/*     */     public static final String TYPE = "type";
/*     */     public static final int TYPE_CUSTOM = 0;
/*     */     public static final int TYPE_HOME = 1;
/*     */     public static final int TYPE_MOBILE = 2;
/*     */     public static final int TYPE_WORK = 3;
/*     */     public static final int TYPE_FAX_WORK = 4;
/*     */     public static final int TYPE_FAX_HOME = 5;
/*     */     public static final int TYPE_PAGER = 6;
/*     */     public static final int TYPE_OTHER = 7;
/*     */     public static final String LABEL = "label";
/*     */     public static final String NUMBER = "number";
/*     */     public static final String NUMBER_KEY = "number_key";
/*     */     public static final String ISPRIMARY = "isprimary";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Groups
/*     */     implements BaseColumns, Contacts.GroupsColumns
/*     */   {
/* 110 */     public static final Uri CONTENT_URI = null; public static final Uri DELETED_CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/contactsgroup";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/contactsgroup";
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */     public static final String GROUP_ANDROID_STARRED = "Starred in Android";
/*     */     public static final String GROUP_MY_CONTACTS = "Contacts";
/*     */ 
/*     */     Groups()
/*     */     {
/* 102 */       throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface GroupsColumns
/*     */   {
/*     */     public static final String NAME = "name";
/*     */     public static final String NOTES = "notes";
/*     */     public static final String SHOULD_SYNC = "should_sync";
/*     */     public static final String SYSTEM_ID = "system_id";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class People
/*     */     implements BaseColumns, Contacts.PeopleColumns, Contacts.PhonesColumns, Contacts.PresenceColumns
/*     */   {
/*  88 */     public static final Uri CONTENT_URI = null; public static final Uri CONTENT_FILTER_URI = null; public static final Uri DELETED_CONTENT_URI = null;
/*     */     public static final String CONTENT_TYPE = "vnd.android.cursor.dir/person";
/*     */     public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/person";
/*     */     public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */     public static final String PRIMARY_PHONE_ID = "primary_phone";
/*     */     public static final String PRIMARY_EMAIL_ID = "primary_email";
/*     */     public static final String PRIMARY_ORGANIZATION_ID = "primary_organization";
/*     */ 
/*     */     People()
/*     */     {
/*  69 */       throw new RuntimeException("Stub!"); } 
/*  70 */     public static void markAsContacted(ContentResolver resolver, long personId) { throw new RuntimeException("Stub!"); } 
/*  71 */     public static Uri addToMyContactsGroup(ContentResolver resolver, long personId) { throw new RuntimeException("Stub!"); } 
/*  72 */     public static Uri addToGroup(ContentResolver resolver, long personId, String groupName) { throw new RuntimeException("Stub!"); } 
/*  73 */     public static Uri addToGroup(ContentResolver resolver, long personId, long groupId) { throw new RuntimeException("Stub!"); } 
/*  74 */     public static Uri createPersonInMyContactsGroup(ContentResolver resolver, ContentValues values) { throw new RuntimeException("Stub!"); } 
/*  75 */     public static Cursor queryGroups(ContentResolver resolver, long person) { throw new RuntimeException("Stub!"); } 
/*  76 */     public static void setPhotoData(ContentResolver cr, Uri person, byte[] data) { throw new RuntimeException("Stub!"); } 
/*  77 */     public static InputStream openContactPhotoInputStream(ContentResolver cr, Uri person) { throw new RuntimeException("Stub!"); } 
/*  78 */     public static Bitmap loadContactPhoto(Context context, Uri person, int placeholderImageResource, BitmapFactory.Options options) { throw new RuntimeException("Stub!");
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static class Extensions
/*     */       implements BaseColumns, Contacts.ExtensionsColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "extensions";
/*     */       public static final String DEFAULT_SORT_ORDER = "name ASC";
/*     */       public static final String PERSON_ID = "person";
/*     */ 
/*     */       Extensions()
/*     */       {
/*  64 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class ContactMethods
/*     */       implements BaseColumns, Contacts.ContactMethodsColumns, Contacts.PeopleColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "contact_methods";
/*     */       public static final String DEFAULT_SORT_ORDER = "data ASC";
/*     */ 
/*     */       ContactMethods()
/*     */       {
/*  56 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */ 
/*     */     @Deprecated
/*     */     public static final class Phones
/*     */       implements BaseColumns, Contacts.PhonesColumns, Contacts.PeopleColumns
/*     */     {
/*     */       public static final String CONTENT_DIRECTORY = "phones";
/*     */       public static final String DEFAULT_SORT_ORDER = "number ASC";
/*     */ 
/*     */       Phones()
/*     */       {
/*  48 */         throw new RuntimeException("Stub!");
/*     */       }
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface PeopleColumns
/*     */   {
/*     */     public static final String NAME = "name";
/*     */     public static final String PHONETIC_NAME = "phonetic_name";
/*     */     public static final String DISPLAY_NAME = "display_name";
/*     */     public static final String NOTES = "notes";
/*     */     public static final String TIMES_CONTACTED = "times_contacted";
/*     */     public static final String LAST_TIME_CONTACTED = "last_time_contacted";
/*     */     public static final String CUSTOM_RINGTONE = "custom_ringtone";
/*     */     public static final String SEND_TO_VOICEMAIL = "send_to_voicemail";
/*     */     public static final String STARRED = "starred";
/*     */     public static final String PHOTO_VERSION = "photo_version";
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static final class Settings
/*     */     implements BaseColumns, Contacts.SettingsColumns
/*     */   {
/*  24 */     public static final Uri CONTENT_URI = null;
/*     */     public static final String CONTENT_DIRECTORY = "settings";
/*     */     public static final String DEFAULT_SORT_ORDER = "key ASC";
/*     */     public static final String SYNC_EVERYTHING = "syncEverything";
/*     */ 
/*     */     Settings()
/*     */     {
/*  17 */       throw new RuntimeException("Stub!"); } 
/*  18 */     public static String getSetting(ContentResolver cr, String account, String key) { throw new RuntimeException("Stub!"); } 
/*  19 */     public static void setSetting(ContentResolver cr, String account, String key, String value) { throw new RuntimeException("Stub!");
/*     */     }
/*     */   }
/*     */ 
/*     */   @Deprecated
/*     */   public static abstract interface SettingsColumns
/*     */   {
/*     */     public static final String _SYNC_ACCOUNT = "_sync_account";
/*     */     public static final String _SYNC_ACCOUNT_TYPE = "_sync_account_type";
/*     */     public static final String KEY = "key";
/*     */     public static final String VALUE = "value";
/*     */   }
/*     */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.provider.Contacts
 * JD-Core Version:    0.6.0
 */