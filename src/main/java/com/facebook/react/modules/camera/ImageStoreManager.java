package com.facebook.react.modules.camera;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.Base64OutputStream;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@ReactModule(name = "ImageStoreManager")
public class ImageStoreManager extends ReactContextBaseJavaModule {
    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageStoreManager";
    }

    public ImageStoreManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public String convertInputStreamToBase64OutputStream(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 2);
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read > -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    closeQuietly(base64OutputStream);
                    return byteArrayOutputStream.toString();
                }
            } catch (Throwable th) {
                closeQuietly(base64OutputStream);
                throw th;
            }
        }
    }

    /* renamed from: com.facebook.react.modules.camera.ImageStoreManager$a */
    private class AsyncTaskC21167a extends GuardedAsyncTask<Void, Void> {

        /* renamed from: b */
        private final String f51619b;

        /* renamed from: c */
        private final Callback f51620c;

        /* renamed from: d */
        private final Callback f51621d;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            try {
                InputStream openInputStream = ImageStoreManager.this.getReactApplicationContext().getContentResolver().openInputStream(Uri.parse(this.f51619b));
                try {
                    this.f51620c.invoke(ImageStoreManager.this.convertInputStreamToBase64OutputStream(openInputStream));
                } catch (IOException e) {
                    this.f51621d.invoke(e.getMessage());
                } catch (Throwable th) {
                    ImageStoreManager.closeQuietly(openInputStream);
                    throw th;
                }
                ImageStoreManager.closeQuietly(openInputStream);
            } catch (FileNotFoundException e2) {
                this.f51621d.invoke(e2.getMessage());
            }
        }

        private AsyncTaskC21167a(ReactContext reactContext, String str, Callback callback, Callback callback2) {
            super(reactContext);
            this.f51619b = str;
            this.f51620c = callback;
            this.f51621d = callback2;
        }
    }

    @ReactMethod
    public void getBase64ForTag(String str, Callback callback, Callback callback2) {
        new AsyncTaskC21167a(getReactApplicationContext(), str, callback, callback2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
