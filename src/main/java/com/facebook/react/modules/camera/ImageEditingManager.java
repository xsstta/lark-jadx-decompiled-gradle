package com.facebook.react.modules.camera;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@ReactModule(name = "ImageEditingManager")
public class ImageEditingManager extends ReactContextBaseJavaModule {
    private static final String[] EXIF_ATTRIBUTES = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "ImageLength", "ImageWidth", "ISOSpeedRatings", "Make", "Model", "Orientation", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
    private static final List<String> LOCAL_URI_PREFIXES = Arrays.asList("file://", "content://");

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageEditingManager";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        new AsyncTaskC21163a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* renamed from: com.facebook.react.modules.camera.ImageEditingManager$b */
    private static class AsyncTaskC21165b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        final Context f51608a;

        /* renamed from: b */
        final String f51609b;

        /* renamed from: c */
        final int f51610c;

        /* renamed from: d */
        final int f51611d;

        /* renamed from: e */
        final int f51612e;

        /* renamed from: f */
        final int f51613f;

        /* renamed from: g */
        int f51614g;

        /* renamed from: h */
        int f51615h;

        /* renamed from: i */
        final Callback f51616i;

        /* renamed from: j */
        final Callback f51617j;

        /* renamed from: a */
        private InputStream m76888a() throws IOException {
            InputStream inputStream;
            if (ImageEditingManager.isLocalUri(this.f51609b)) {
                inputStream = this.f51608a.getContentResolver().openInputStream(Uri.parse(this.f51609b));
            } else {
                inputStream = new URL(this.f51609b).openConnection().getInputStream();
            }
            if (inputStream != null) {
                return inputStream;
            }
            throw new IOException("Cannot open bitmap: " + this.f51609b);
        }

        /* renamed from: a */
        private Bitmap m76887a(BitmapFactory.Options options) throws IOException {
            InputStream a = m76888a();
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(a, false);
            try {
                int i = this.f51610c;
                int i2 = this.f51611d;
                return newInstance.decodeRegion(new Rect(i, i2, this.f51612e + i, this.f51613f + i2), options);
            } finally {
                if (a != null) {
                    a.close();
                }
                newInstance.recycle();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            boolean z;
            Bitmap bitmap;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                int i = this.f51614g;
                if (i <= 0 || this.f51615h <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    bitmap = m76886a(i, this.f51615h, options);
                } else {
                    bitmap = m76887a(options);
                }
                String str = options.outMimeType;
                if (str == null || str.isEmpty()) {
                    throw new IOException("Could not determine MIME type");
                }
                File createTempFile = ImageEditingManager.createTempFile(this.f51608a, str);
                ImageEditingManager.writeCompressedBitmapToFile(bitmap, str, createTempFile);
                if (str.equals("image/jpeg")) {
                    ImageEditingManager.copyExif(this.f51608a, Uri.parse(this.f51609b), createTempFile);
                }
                this.f51616i.invoke(Uri.fromFile(createTempFile).toString());
            } catch (Exception e) {
                this.f51617j.invoke(e.getMessage());
            }
        }

        /* renamed from: a */
        public void mo71933a(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid target size: [%d, %d]", Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f51614g = i;
            this.f51615h = i2;
        }

        /* renamed from: a */
        private Bitmap m76886a(int i, int i2, BitmapFactory.Options options) throws IOException {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            C21045a.m76676a(options);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            InputStream a = m76888a();
            try {
                BitmapFactory.decodeStream(a, null, options2);
                if (a != null) {
                    a.close();
                }
                int i3 = this.f51612e;
                int i4 = this.f51613f;
                float f6 = (float) i;
                float f7 = (float) i2;
                float f8 = f6 / f7;
                if (((float) i3) / ((float) i4) > f8) {
                    f5 = ((float) i4) * f8;
                    f4 = (float) i4;
                    f2 = ((float) this.f51610c) + ((((float) i3) - f5) / 2.0f);
                    f = (float) this.f51611d;
                    f3 = f7 / ((float) i4);
                } else {
                    f5 = (float) i3;
                    float f9 = ((float) i3) / f8;
                    f2 = (float) this.f51610c;
                    f = ((float) this.f51611d) + ((((float) i4) - f9) / 2.0f);
                    f3 = f6 / ((float) i3);
                    f4 = f9;
                }
                options.inSampleSize = ImageEditingManager.getDecodeSampleSize(i3, i4, i, i2);
                options2.inJustDecodeBounds = false;
                a = m76888a();
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(a, null, options);
                    if (decodeStream != null) {
                        float f10 = f3 * ((float) options.inSampleSize);
                        Matrix matrix = new Matrix();
                        matrix.setScale(f10, f10);
                        return Bitmap.createBitmap(decodeStream, (int) Math.floor((double) (f2 / ((float) options.inSampleSize))), (int) Math.floor((double) (f / ((float) options.inSampleSize))), (int) Math.floor((double) (f5 / ((float) options.inSampleSize))), (int) Math.floor((double) (f4 / ((float) options.inSampleSize))), matrix, true);
                    }
                    throw new IOException("Cannot decode bitmap: " + this.f51609b);
                } finally {
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }

        private AsyncTaskC21165b(ReactContext reactContext, String str, int i, int i2, int i3, int i4, Callback callback, Callback callback2) {
            super(reactContext);
            if (i < 0 || i2 < 0 || i3 <= 0 || i4 <= 0) {
                throw new JSApplicationIllegalArgumentException(String.format("Invalid crop rectangle: [%d, %d, %d, %d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f51608a = reactContext;
            this.f51609b = str;
            this.f51610c = i;
            this.f51611d = i2;
            this.f51612e = i3;
            this.f51613f = i4;
            this.f51616i = callback;
            this.f51617j = callback2;
        }
    }

    /* renamed from: com.facebook.react.modules.camera.ImageEditingManager$a */
    private static class AsyncTaskC21163a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a */
        private final Context f51606a;

        private AsyncTaskC21163a(ReactContext reactContext) {
            super(reactContext);
            this.f51606a = reactContext;
        }

        /* renamed from: a */
        private void m76884a(File file) {
            File[] listFiles = file.listFiles(new FilenameFilter() {
                /* class com.facebook.react.modules.camera.ImageEditingManager.AsyncTaskC21163a.C211641 */

                public boolean accept(File file, String str) {
                    return str.startsWith("ReactNative_cropped_image_");
                }
            });
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    file2.delete();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            m76884a(this.f51606a.getCacheDir());
            File externalCacheDir = this.f51606a.getExternalCacheDir();
            if (externalCacheDir != null) {
                m76884a(externalCacheDir);
            }
        }
    }

    public ImageEditingManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        new AsyncTaskC21163a(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private static Bitmap.CompressFormat getCompressFormatForType(String str) {
        if ("image/png".equals(str)) {
            return Bitmap.CompressFormat.PNG;
        }
        if ("image/webp".equals(str)) {
            return Bitmap.CompressFormat.WEBP;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    private static String getFileExtensionForType(String str) {
        if ("image/png".equals(str)) {
            return ".png";
        }
        if ("image/webp".equals(str)) {
            return ".webp";
        }
        return ".jpg";
    }

    public static boolean isLocalUri(String str) {
        for (String str2 : LOCAL_URI_PREFIXES) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static File createTempFile(Context context, String str) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        return File.createTempFile("ReactNative_cropped_image_", getFileExtensionForType(str), externalCacheDir);
    }

    private static File getFileFromUri(Context context, Uri uri) {
        Cursor query;
        if (uri.getScheme().equals("file")) {
            return new File(uri.getPath());
        }
        if (!uri.getScheme().equals("content") || (query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null)) == null) {
            return null;
        }
        try {
            if (query.moveToFirst()) {
                String string = query.getString(0);
                if (!TextUtils.isEmpty(string)) {
                    return new File(string);
                }
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    public static void writeCompressedBitmapToFile(Bitmap bitmap, String str, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(getCompressFormatForType(str), 90, fileOutputStream);
        } finally {
            fileOutputStream.close();
        }
    }

    public static void copyExif(Context context, Uri uri, File file) throws IOException {
        File fileFromUri = getFileFromUri(context, uri);
        if (fileFromUri == null) {
            FLog.m76614w("ReactNative", "Couldn't get real path for uri: " + uri);
            return;
        }
        ExifInterface exifInterface = new ExifInterface(fileFromUri.getAbsolutePath());
        ExifInterface exifInterface2 = new ExifInterface(file.getAbsolutePath());
        String[] strArr = EXIF_ATTRIBUTES;
        for (String str : strArr) {
            String attribute = exifInterface.getAttribute(str);
            if (attribute != null) {
                exifInterface2.setAttribute(str, attribute);
            }
        }
        exifInterface2.saveAttributes();
    }

    public static int getDecodeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i3 || i > i4) {
            int i6 = i2 / 2;
            int i7 = i / 2;
            while (i7 / i5 >= i3 && i6 / i5 >= i4) {
                i5 *= 2;
            }
        }
        return i5;
    }

    @ReactMethod
    public void cropImage(String str, ReadableMap readableMap, Callback callback, Callback callback2) {
        ReadableMap readableMap2;
        ReadableMap readableMap3 = null;
        if (readableMap.hasKey("offset")) {
            readableMap2 = readableMap.getMap("offset");
        } else {
            readableMap2 = null;
        }
        if (readableMap.hasKey("size")) {
            readableMap3 = readableMap.getMap("size");
        }
        if (readableMap2 == null || readableMap3 == null || !readableMap2.hasKey("x") || !readableMap2.hasKey("y") || !readableMap3.hasKey("width") || !readableMap3.hasKey("height")) {
            throw new JSApplicationIllegalArgumentException("Please specify offset and size");
        } else if (str == null || str.isEmpty()) {
            throw new JSApplicationIllegalArgumentException("Please specify a URI");
        } else {
            AsyncTaskC21165b bVar = new AsyncTaskC21165b(getReactApplicationContext(), str, (int) readableMap2.getDouble("x"), (int) readableMap2.getDouble("y"), (int) readableMap3.getDouble("width"), (int) readableMap3.getDouble("height"), callback, callback2);
            if (readableMap.hasKey("displaySize")) {
                ReadableMap map = readableMap.getMap("displaySize");
                bVar.mo71933a((int) map.getDouble("width"), (int) map.getDouble("height"));
            }
            bVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
