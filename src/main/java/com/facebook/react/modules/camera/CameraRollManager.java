package com.facebook.react.modules.camera;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.IOException;
import java.util.ArrayList;

@ReactModule(name = "CameraRollManager")
public class CameraRollManager extends ReactContextBaseJavaModule {
    public static final String[] PROJECTION = {"_id", "mime_type", "bucket_display_name", "datetaken", "width", "height", "longitude", "latitude", "_data"};

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "CameraRollManager";
    }

    public CameraRollManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* renamed from: com.facebook.react.modules.camera.CameraRollManager$a */
    private static class AsyncTaskC21159a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f51595a;

        /* renamed from: b */
        private final int f51596b;

        /* renamed from: c */
        private final String f51597c;

        /* renamed from: d */
        private final String f51598d;

        /* renamed from: e */
        private final ReadableArray f51599e;

        /* renamed from: f */
        private final Promise f51600f;

        /* renamed from: g */
        private final String f51601g;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            StringBuilder sb = new StringBuilder("1");
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f51597c)) {
                sb.append(" AND datetaken < ?");
                arrayList.add(this.f51597c);
            }
            if (!TextUtils.isEmpty(this.f51598d)) {
                sb.append(" AND bucket_display_name = ?");
                arrayList.add(this.f51598d);
            }
            String str = this.f51601g;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1905167199:
                    if (str.equals("Photos")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1732810888:
                    if (str.equals("Videos")) {
                        c = 1;
                        break;
                    }
                    break;
                case 65921:
                    if (str.equals("All")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    sb.append(" AND media_type = 1");
                    break;
                case 1:
                    sb.append(" AND media_type = 3");
                    break;
                case 2:
                    sb.append(" AND media_type IN (3,1)");
                    break;
                default:
                    Promise promise = this.f51600f;
                    promise.reject("E_UNABLE_TO_FILTER", "Invalid filter option: '" + this.f51601g + "'. Expected one of '" + "Photos" + "', '" + "Videos" + "' or '" + "All" + "'.");
                    return;
            }
            ReadableArray readableArray = this.f51599e;
            if (readableArray != null && readableArray.size() > 0) {
                sb.append(" AND mime_type IN (");
                for (int i = 0; i < this.f51599e.size(); i++) {
                    sb.append("?,");
                    arrayList.add(this.f51599e.getString(i));
                }
                sb.replace(sb.length() - 1, sb.length(), ")");
            }
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            ContentResolver contentResolver = this.f51595a.getContentResolver();
            try {
                Uri contentUri = MediaStore.Files.getContentUri("external");
                String[] strArr = CameraRollManager.PROJECTION;
                String sb2 = sb.toString();
                String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                Cursor query = contentResolver.query(contentUri, strArr, sb2, strArr2, "datetaken DESC, date_modified DESC LIMIT " + (this.f51596b + 1));
                if (query == null) {
                    this.f51600f.reject("E_UNABLE_TO_LOAD", "Could not get media");
                    return;
                }
                try {
                    CameraRollManager.putEdges(contentResolver, query, writableNativeMap, this.f51596b);
                    CameraRollManager.putPageInfo(query, writableNativeMap, this.f51596b);
                } finally {
                    query.close();
                    this.f51600f.resolve(writableNativeMap);
                }
            } catch (SecurityException e) {
                this.f51600f.reject("E_UNABLE_TO_LOAD_PERMISSION", "Could not get media: need READ_EXTERNAL_STORAGE permission", e);
            }
        }

        private AsyncTaskC21159a(ReactContext reactContext, int i, String str, String str2, ReadableArray readableArray, String str3, Promise promise) {
            super(reactContext);
            this.f51595a = reactContext;
            this.f51596b = i;
            this.f51597c = str;
            this.f51598d = str2;
            this.f51599e = readableArray;
            this.f51600f = promise;
            this.f51601g = str3;
        }
    }

    /* renamed from: com.facebook.react.modules.camera.CameraRollManager$b */
    private static class AsyncTaskC21160b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        public final Promise f51602a;

        /* renamed from: b */
        private final Context f51603b;

        /* renamed from: c */
        private final Uri f51604c;

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:106:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0055 A[Catch:{ IOException -> 0x0131, all -> 0x012c }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0152  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void doInBackgroundGuarded(java.lang.Void... r14) {
            /*
            // Method dump skipped, instructions count: 387
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.camera.CameraRollManager.AsyncTaskC21160b.doInBackgroundGuarded(java.lang.Void[]):void");
        }

        public AsyncTaskC21160b(ReactContext reactContext, Uri uri, Promise promise) {
            super(reactContext);
            this.f51603b = reactContext;
            this.f51604c = uri;
            this.f51602a = promise;
        }
    }

    @ReactMethod
    public void getPhotos(ReadableMap readableMap, Promise promise) {
        String str;
        String str2;
        String str3;
        ReadableArray readableArray;
        int i = readableMap.getInt("first");
        if (readableMap.hasKey("after")) {
            str = readableMap.getString("after");
        } else {
            str = null;
        }
        if (readableMap.hasKey("groupName")) {
            str2 = readableMap.getString("groupName");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey("assetType")) {
            str3 = readableMap.getString("assetType");
        } else {
            str3 = "Photos";
        }
        if (readableMap.hasKey("mimeTypes")) {
            readableArray = readableMap.getArray("mimeTypes");
        } else {
            readableArray = null;
        }
        if (!readableMap.hasKey("groupTypes")) {
            new AsyncTaskC21159a(getReactApplicationContext(), i, str, str2, readableArray, str3, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new JSApplicationIllegalArgumentException("groupTypes is not supported on Android");
    }

    @ReactMethod
    public void saveToCameraRoll(String str, String str2, Promise promise) {
        new AsyncTaskC21160b(getReactApplicationContext(), Uri.parse(str), promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static void putPageInfo(Cursor cursor, WritableMap writableMap, int i) {
        boolean z;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (i < cursor.getCount()) {
            z = true;
        } else {
            z = false;
        }
        writableNativeMap.putBoolean("has_next_page", z);
        if (i < cursor.getCount()) {
            cursor.moveToPosition(i - 1);
            writableNativeMap.putString("end_cursor", cursor.getString(cursor.getColumnIndex("datetaken")));
        }
        writableMap.putMap("page_info", writableNativeMap);
    }

    private static void putLocationInfo(Cursor cursor, WritableMap writableMap, int i, int i2) {
        double d = cursor.getDouble(i);
        double d2 = cursor.getDouble(i2);
        if (d > 0.0d || d2 > 0.0d) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("longitude", d);
            writableNativeMap.putDouble("latitude", d2);
            writableMap.putMap("location", writableNativeMap);
        }
    }

    public static void putEdges(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i) {
        int i2;
        WritableNativeArray writableNativeArray;
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("_id");
        int columnIndex2 = cursor.getColumnIndex("mime_type");
        int columnIndex3 = cursor.getColumnIndex("bucket_display_name");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("width");
        int columnIndex6 = cursor.getColumnIndex("height");
        int columnIndex7 = cursor.getColumnIndex("longitude");
        int columnIndex8 = cursor.getColumnIndex("latitude");
        int columnIndex9 = cursor.getColumnIndex("_data");
        int i3 = i;
        int i4 = 0;
        while (i4 < i3 && !cursor.isAfterLast()) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            if (putImageInfo(contentResolver, cursor, writableNativeMap2, columnIndex, columnIndex5, columnIndex6, columnIndex9, columnIndex2)) {
                putBasicNodeInfo(cursor, writableNativeMap2, columnIndex2, columnIndex3, columnIndex4);
                putLocationInfo(cursor, writableNativeMap2, columnIndex7, columnIndex8);
                writableNativeMap.putMap("node", writableNativeMap2);
                writableNativeArray = writableNativeArray2;
                writableNativeArray.pushMap(writableNativeMap);
                i2 = i4;
            } else {
                writableNativeArray = writableNativeArray2;
                i2 = i4 - 1;
            }
            cursor.moveToNext();
            i4 = i2 + 1;
            i3 = i;
            writableNativeArray2 = writableNativeArray;
            columnIndex8 = columnIndex8;
            columnIndex7 = columnIndex7;
            columnIndex = columnIndex;
            columnIndex5 = columnIndex5;
        }
        writableMap.putArray("edges", writableNativeArray2);
    }

    private static void putBasicNodeInfo(Cursor cursor, WritableMap writableMap, int i, int i2, int i3) {
        writableMap.putString(ShareHitPoint.f121869d, cursor.getString(i));
        writableMap.putString("group_name", cursor.getString(i2));
        writableMap.putDouble("timestamp", ((double) cursor.getLong(i3)) / 1000.0d);
    }

    private static boolean putImageInfo(ContentResolver contentResolver, Cursor cursor, WritableMap writableMap, int i, int i2, int i3, int i4, int i5) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Uri parse = Uri.parse("file://" + cursor.getString(i4));
        writableNativeMap.putString("uri", parse.toString());
        float f = (float) cursor.getInt(i2);
        float f2 = (float) cursor.getInt(i3);
        String string = cursor.getString(i5);
        if (string != null && string.startsWith("video")) {
            try {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(openAssetFileDescriptor.getFileDescriptor());
                if (f <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) {
                    try {
                        f = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                        f2 = (float) Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                    } catch (NumberFormatException e) {
                        FLog.m76575e("ReactNative", "Number format exception occurred while trying to fetch video metadata for " + parse.toString(), e);
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        return false;
                    } catch (Throwable th) {
                        mediaMetadataRetriever.release();
                        openAssetFileDescriptor.close();
                        throw th;
                    }
                }
                writableNativeMap.putInt("playableDuration", Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)) / 1000);
                mediaMetadataRetriever.release();
                openAssetFileDescriptor.close();
            } catch (Exception e2) {
                FLog.m76575e("ReactNative", "Could not get video metadata for " + parse.toString(), e2);
                return false;
            }
        }
        if (f <= BitmapDescriptorFactory.HUE_RED || f2 <= BitmapDescriptorFactory.HUE_RED) {
            try {
                AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, "r");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor2.getFileDescriptor(), null, options);
                float f3 = (float) options.outWidth;
                float f4 = (float) options.outHeight;
                openAssetFileDescriptor2.close();
                f2 = f4;
                f = f3;
            } catch (IOException e3) {
                FLog.m76575e("ReactNative", "Could not get width/height for " + parse.toString(), e3);
                return false;
            }
        }
        writableNativeMap.putDouble("width", (double) f);
        writableNativeMap.putDouble("height", (double) f2);
        writableMap.putMap("image", writableNativeMap);
        return true;
    }
}
