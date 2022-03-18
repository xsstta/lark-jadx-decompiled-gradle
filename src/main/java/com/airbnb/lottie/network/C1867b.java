package com.airbnb.lottie.network;

import android.content.Context;
import androidx.core.util.C0844e;
import com.airbnb.lottie.C1792d;
import com.airbnb.lottie.C1798e;
import com.airbnb.lottie.C1811k;
import com.airbnb.lottie.p071c.C1787d;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.network.b */
public class C1867b {

    /* renamed from: a */
    private final Context f6472a;

    /* renamed from: b */
    private final String f6473b;

    /* renamed from: c */
    private final C1866a f6474c;

    /* renamed from: c */
    private C1811k<C1792d> m8399c() {
        try {
            return m8400d();
        } catch (IOException e) {
            return new C1811k<>(e);
        }
    }

    /* renamed from: b */
    private C1792d m8397b() {
        C0844e<FileExtension, InputStream> a;
        C1811k<C1792d> kVar;
        C1866a aVar = this.f6474c;
        if (aVar == null || (a = aVar.mo9308a(this.f6473b)) == null) {
            return null;
        }
        F f = a.f3317a;
        S s = a.f3318b;
        if (f == FileExtension.ZIP) {
            kVar = C1798e.m8066a(new ZipInputStream(s), this.f6473b);
        } else {
            kVar = C1798e.m8076b((InputStream) s, this.f6473b);
        }
        if (kVar.mo9110a() != null) {
            return kVar.mo9110a();
        }
        return null;
    }

    /* renamed from: a */
    public C1811k<C1792d> mo9311a() {
        C1792d b = m8397b();
        if (b != null) {
            return new C1811k<>(b);
        }
        C1787d.m7971a("Animation for " + this.f6473b + " not found in cache. Fetching from network.");
        return m8399c();
    }

    /* renamed from: d */
    private C1811k<C1792d> m8400d() throws IOException {
        boolean z;
        C1787d.m7971a("Fetching " + this.f6473b);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f6473b).openConnection();
        httpURLConnection.setRequestMethod("GET");
        try {
            httpURLConnection.connect();
            if (httpURLConnection.getErrorStream() == null) {
                if (httpURLConnection.getResponseCode() == 200) {
                    C1811k<C1792d> b = m8398b(httpURLConnection);
                    StringBuilder sb = new StringBuilder();
                    sb.append("Completed fetch from network. Success: ");
                    if (b.mo9110a() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    C1787d.m7971a(sb.toString());
                    httpURLConnection.disconnect();
                    return b;
                }
            }
            String a = m8396a(httpURLConnection);
            return new C1811k<>(new IllegalArgumentException("Unable to fetch " + this.f6473b + ". Failed with " + httpURLConnection.getResponseCode() + "\n" + a));
        } catch (Exception e) {
            return new C1811k<>(e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    private String m8396a(HttpURLConnection httpURLConnection) throws IOException {
        httpURLConnection.getResponseCode();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    /* renamed from: b */
    private C1811k<C1792d> m8398b(HttpURLConnection httpURLConnection) throws IOException {
        C1811k<C1792d> kVar;
        FileExtension fileExtension;
        String contentType = httpURLConnection.getContentType();
        if (contentType == null) {
            contentType = "application/json";
        }
        if (contentType.contains("application/zip")) {
            C1787d.m7971a("Handling zip response.");
            fileExtension = FileExtension.ZIP;
            C1866a aVar = this.f6474c;
            if (aVar == null) {
                kVar = C1798e.m8066a(new ZipInputStream(httpURLConnection.getInputStream()), (String) null);
            } else {
                kVar = C1798e.m8066a(new ZipInputStream(new FileInputStream(aVar.mo9309a(this.f6473b, httpURLConnection.getInputStream(), fileExtension))), this.f6473b);
            }
        } else {
            C1787d.m7971a("Received json response.");
            fileExtension = FileExtension.JSON;
            C1866a aVar2 = this.f6474c;
            if (aVar2 == null) {
                kVar = C1798e.m8076b(httpURLConnection.getInputStream(), (String) null);
            } else {
                kVar = C1798e.m8076b(new FileInputStream(new File(aVar2.mo9309a(this.f6473b, httpURLConnection.getInputStream(), fileExtension).getAbsolutePath())), this.f6473b);
            }
        }
        if (!(this.f6474c == null || kVar.mo9110a() == null)) {
            this.f6474c.mo9310a(this.f6473b, fileExtension);
        }
        return kVar;
    }

    /* renamed from: a */
    public static C1811k<C1792d> m8395a(Context context, String str, String str2) {
        return new C1867b(context, str, str2).mo9311a();
    }

    private C1867b(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f6472a = applicationContext;
        this.f6473b = str;
        if (str2 == null) {
            this.f6474c = null;
        } else {
            this.f6474c = new C1866a(applicationContext);
        }
    }
}
