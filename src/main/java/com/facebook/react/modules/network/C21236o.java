package com.facebook.react.modules.network;

import android.content.Context;
import android.net.Uri;
import com.facebook.common.logging.FLog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.zip.GZIPOutputStream;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.AbstractC69698d;
import okio.AbstractC69723u;
import okio.ByteString;
import okio.C69705k;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.react.modules.network.o */
public class C21236o {
    /* renamed from: b */
    public static RequestBody m77016b(String str) {
        if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH")) {
            return RequestBody.create((MediaType) null, ByteString.EMPTY);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m77015a(String str) {
        return "gzip".equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public static C21230k m77010a(RequestBody requestBody, AbstractC21229j jVar) {
        return new C21230k(requestBody, jVar);
    }

    /* renamed from: a */
    public static RequestBody m77013a(final MediaType mediaType, final InputStream inputStream) {
        return new RequestBody() {
            /* class com.facebook.react.modules.network.C21236o.C212371 */

            @Override // okhttp3.RequestBody
            public MediaType contentType() {
                return mediaType;
            }

            @Override // okhttp3.RequestBody
            public long contentLength() {
                try {
                    return (long) inputStream.available();
                } catch (IOException unused) {
                    return 0;
                }
            }

            @Override // okhttp3.RequestBody
            public void writeTo(AbstractC69698d dVar) throws IOException {
                AbstractC69723u uVar = null;
                try {
                    uVar = C69705k.m267596a(inputStream);
                    dVar.mo244513a(uVar);
                } finally {
                    Util.closeQuietly(uVar);
                }
            }
        };
    }

    /* renamed from: a */
    public static RequestBody m77014a(MediaType mediaType, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes());
            gZIPOutputStream.close();
            return RequestBody.create(mediaType, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static InputStream m77012a(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            if (parse.getScheme().startsWith("http")) {
                return m77011a(context, parse);
            }
            return context.getContentResolver().openInputStream(parse);
        } catch (Exception e) {
            FLog.m76575e("ReactNative", "Could not retrieve file for contentUri " + str, e);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static InputStream m77011a(Context context, Uri uri) throws IOException {
        File createTempFile = File.createTempFile("RequestBodyUtil", "temp", context.getApplicationContext().getCacheDir());
        createTempFile.deleteOnExit();
        InputStream openStream = new URL(uri.toString()).openStream();
        try {
            ReadableByteChannel newChannel = Channels.newChannel(openStream);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.getChannel().transferFrom(newChannel, 0, Long.MAX_VALUE);
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    fileOutputStream.close();
                    newChannel.close();
                    return fileInputStream;
                } catch (Throwable th) {
                    fileOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                newChannel.close();
                throw th2;
            }
        } finally {
            openStream.close();
        }
    }
}
