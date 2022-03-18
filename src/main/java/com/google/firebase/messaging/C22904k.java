package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p979b.C21891h;
import com.google.android.gms.internal.p979b.C21892i;
import com.google.android.gms.internal.p979b.C21894k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Executor;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.k */
public class C22904k implements Closeable {

    /* renamed from: a */
    private final URL f56610a;

    /* renamed from: b */
    private Task<Bitmap> f56611b;

    /* renamed from: c */
    private volatile InputStream f56612c;

    /* renamed from: a */
    public Task<Bitmap> mo79499a() {
        return (Task) Preconditions.checkNotNull(this.f56611b);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            C21892i.m79202a(this.f56612c);
        } catch (NullPointerException e) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e);
        }
    }

    /* renamed from: c */
    private byte[] m83182c() throws IOException {
        URLConnection openConnection = this.f56610a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.f56612c = inputStream;
                byte[] a = C21891h.m79200a(C21891h.m79199a(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    int length = a.length;
                    String valueOf = String.valueOf(this.f56610a);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                    sb.append("Downloaded ");
                    sb.append(length);
                    sb.append(" bytes from ");
                    sb.append(valueOf);
                    Log.v("FirebaseMessaging", sb.toString());
                }
                if (a.length <= 1048576) {
                    return a;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                C21894k.m79204a(th, th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    /* renamed from: b */
    public Bitmap mo79501b() throws IOException {
        String valueOf = String.valueOf(this.f56610a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("Starting download of: ");
        sb.append(valueOf);
        Log.i("FirebaseMessaging", sb.toString());
        byte[] c = m83182c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String valueOf2 = String.valueOf(this.f56610a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb2.append("Successfully downloaded image: ");
                sb2.append(valueOf2);
                Log.d("FirebaseMessaging", sb2.toString());
            }
            return decodeByteArray;
        }
        String valueOf3 = String.valueOf(this.f56610a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
        sb3.append("Failed to decode image: ");
        sb3.append(valueOf3);
        throw new IOException(sb3.toString());
    }

    private C22904k(URL url) {
        this.f56610a = url;
    }

    /* renamed from: a */
    public void mo79500a(Executor executor) {
        this.f56611b = Tasks.call(executor, new CallableC22905l(this));
    }

    /* renamed from: a */
    public static C22904k m83181a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C22904k(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                str2 = new String("Not downloading image, bad URL: ");
            }
            Log.w("FirebaseMessaging", str2);
            return null;
        }
    }
}
