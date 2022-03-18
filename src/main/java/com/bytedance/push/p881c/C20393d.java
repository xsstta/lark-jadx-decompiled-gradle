package com.bytedance.push.p881c;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.common.utility.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.bytedance.push.c.d */
public class C20393d implements AbstractC20390a {
    /* renamed from: a */
    private static boolean m74297a(BitmapFactory.Options options) {
        if (options == null || !options.inJustDecodeBounds) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static BitmapFactory.Options m74299c(C20392c cVar) {
        boolean z;
        boolean a = cVar.mo68787a();
        if (cVar.f49848d != null) {
            z = true;
        } else {
            z = false;
        }
        BitmapFactory.Options options = null;
        if (a || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = a;
            if (z) {
                options.inPreferredConfig = cVar.f49848d;
            }
        }
        return options;
    }

    @Override // com.bytedance.push.p881c.AbstractC20390a
    /* renamed from: a */
    public Bitmap mo68775a(C20392c cVar) {
        try {
            return m74298b(cVar);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    private Bitmap m74298b(C20392c cVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(cVar.f49845a.toString()).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream == null) {
                return null;
            }
            if (((long) httpURLConnection.getHeaderFieldInt("Content-Length", -1)) != 0) {
                try {
                    return m74294a(inputStream, cVar);
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                } finally {
                    IOUtils.close(inputStream);
                }
            } else {
                IOUtils.close(inputStream);
                throw new IOException("Received response with 0 content-length header.");
            }
        } else {
            httpURLConnection.disconnect();
            throw new IOException(responseCode + " " + httpURLConnection.getResponseMessage());
        }
    }

    /* renamed from: a */
    private Bitmap m74294a(InputStream inputStream, C20392c cVar) throws IOException {
        C20391b bVar = new C20391b(inputStream);
        long a = bVar.mo68776a(65536);
        BitmapFactory.Options c = m74299c(cVar);
        boolean a2 = m74297a(c);
        boolean a3 = C20394e.m74301a(bVar);
        bVar.mo68777a(a);
        if (a3) {
            byte[] b = C20394e.m74302b(bVar);
            if (a2) {
                BitmapFactory.decodeByteArray(b, 0, b.length, c);
                m74296a(cVar.f49846b, cVar.f49847c, c);
            }
            return BitmapFactory.decodeByteArray(b, 0, b.length, c);
        }
        if (a2) {
            BitmapFactory.decodeStream(bVar, null, c);
            m74296a(cVar.f49846b, cVar.f49847c, c);
            bVar.mo68777a(a);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(bVar, null, c);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: a */
    private static void m74296a(int i, int i2, BitmapFactory.Options options) {
        m74295a(i, i2, options.outWidth, options.outHeight, options);
    }

    /* renamed from: a */
    private static void m74295a(int i, int i2, int i3, int i4, BitmapFactory.Options options) {
        int i5;
        if (i4 > i2 || i3 > i) {
            int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
            i5 = (int) Math.floor((double) (((float) i3) / ((float) i)));
            if (floor < i5) {
                i5 = floor;
            }
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }
}
