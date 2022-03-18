package com.bytedance.lynx.webview.util.p844a;

import android.text.TextUtils;
import android.util.Log;
import com.bytedance.lynx.webview.util.C20048g;
import com.bytedance.lynx.webview.util.C20052k;
import com.bytedance.lynx.webview.util.p844a.AbstractC20035c;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.CookiePolicy;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.lynx.webview.util.a.a */
public class C20030a implements AbstractC20035c {

    /* renamed from: b */
    private static final AbstractC20032a f48953b = new C20033b();

    /* renamed from: a */
    public C20052k f48954a;

    /* renamed from: c */
    private ExecutorService f48955c;

    /* renamed from: com.bytedance.lynx.webview.util.a.a$a */
    public interface AbstractC20032a {
        /* renamed from: a */
        InputStream mo67998a(InputStream inputStream);

        /* renamed from: a */
        void mo67999a();

        /* renamed from: a */
        void mo68000a(IOException iOException);

        /* renamed from: a */
        void mo68001a(HttpURLConnection httpURLConnection, String str);
    }

    /* renamed from: com.bytedance.lynx.webview.util.a.a$b */
    private static class C20033b implements AbstractC20032a {
        @Override // com.bytedance.lynx.webview.util.p844a.C20030a.AbstractC20032a
        /* renamed from: a */
        public InputStream mo67998a(InputStream inputStream) {
            return inputStream;
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20030a.AbstractC20032a
        /* renamed from: a */
        public void mo67999a() {
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20030a.AbstractC20032a
        /* renamed from: a */
        public void mo68000a(IOException iOException) {
        }

        @Override // com.bytedance.lynx.webview.util.p844a.C20030a.AbstractC20032a
        /* renamed from: a */
        public void mo68001a(HttpURLConnection httpURLConnection, String str) {
        }

        private C20033b() {
        }
    }

    /* renamed from: a */
    public AbstractC20032a mo67991a() {
        return f48953b;
    }

    public C20030a() {
        try {
            this.f48954a = new C20052k(null, CookiePolicy.ACCEPT_ALL);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public HttpURLConnection mo67992a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    private void m73091a(Runnable runnable) {
        if (this.f48955c == null) {
            this.f48955c = Executors.newFixedThreadPool(3);
        }
        this.f48955c.execute(runnable);
    }

    @Override // com.bytedance.lynx.webview.util.p844a.AbstractC20035c
    /* renamed from: a */
    public void mo67993a(final C20037d dVar, final AbstractC20035c.AbstractC20036a aVar) {
        if (aVar != null) {
            aVar.mo68002a();
        }
        m73091a(new Runnable() {
            /* class com.bytedance.lynx.webview.util.p844a.C20030a.RunnableC200311 */

            public void run() {
                C20038e eVar = new C20038e();
                AbstractC20032a a = C20030a.this.mo67991a();
                HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = C20030a.this.mo67996b(dVar, aVar);
                    a.mo68001a(httpURLConnection, dVar.f48963d);
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    if (C20030a.this.f48954a != null) {
                        C20030a.this.f48954a.put(new URI(dVar.f48961b), headerFields);
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC20035c.AbstractC20036a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo68004a(responseCode, headerFields);
                    }
                    a.mo67999a();
                    eVar.f48965a = String.valueOf(responseCode);
                    if (responseCode < 200 || responseCode > 299) {
                        eVar.f48968d = C20030a.this.mo67995b(httpURLConnection.getErrorStream(), aVar);
                    } else {
                        eVar.f48966b = C20030a.this.mo67994a(a.mo67998a(httpURLConnection.getInputStream()), aVar);
                    }
                    AbstractC20035c.AbstractC20036a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo68006a(eVar);
                    }
                    if (httpURLConnection == null) {
                        return;
                    }
                } catch (Exception e) {
                    C20048g.m73164d(Log.getStackTraceString(e));
                    eVar.f48965a = "-1";
                    eVar.f48967c = "-1";
                    eVar.f48968d = e.getMessage();
                    AbstractC20035c.AbstractC20036a aVar3 = aVar;
                    if (aVar3 != null) {
                        aVar3.mo68006a(eVar);
                    }
                    if (e instanceof IOException) {
                        a.mo68000a((IOException) e);
                    }
                } catch (Throwable th) {
                    C20048g.m73164d(Log.getStackTraceString(th));
                }
                httpURLConnection.disconnect();
                if (0 == 0) {
                    return;
                }
                httpURLConnection.disconnect();
            }
        });
    }

    /* renamed from: a */
    public byte[] mo67994a(InputStream inputStream, AbstractC20035c.AbstractC20036a aVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[2048];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr, 0, 2048);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
                i += read;
                if (aVar != null) {
                    aVar.mo68007b(i);
                }
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* renamed from: b */
    public String mo67995b(InputStream inputStream, AbstractC20035c.AbstractC20036a aVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        char[] cArr = new char[2048];
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
                if (aVar != null) {
                    aVar.mo68007b(sb.length());
                }
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* renamed from: b */
    public HttpURLConnection mo67996b(C20037d dVar, AbstractC20035c.AbstractC20036a aVar) throws IOException {
        List<String> list;
        HttpURLConnection a = mo67992a(new URL(dVar.f48961b));
        a.setConnectTimeout(dVar.f48964e);
        a.setReadTimeout(dVar.f48964e);
        a.setUseCaches(false);
        a.setDoInput(true);
        if (dVar.f48960a != null) {
            for (String str : dVar.f48960a.keySet()) {
                a.addRequestProperty(str, dVar.f48960a.get(str));
            }
        }
        try {
            Map<String, List<String>> map = this.f48954a.get(new URI(dVar.f48961b), new HashMap());
            StringBuilder sb = new StringBuilder();
            if (!(map == null || (list = map.get("Cookie")) == null)) {
                for (String str2 : list) {
                    sb.append(str2);
                }
            }
            String sb2 = sb.toString();
            if (!sb2.isEmpty()) {
                a.addRequestProperty("Cookie", sb2);
            }
        } catch (Exception unused) {
        }
        if ("POST".equals(dVar.f48962c) || "PUT".equals(dVar.f48962c) || "PATCH".equals(dVar.f48962c)) {
            a.setRequestMethod(dVar.f48962c);
            if (dVar.f48963d != null) {
                if (aVar != null) {
                    aVar.mo68003a(0);
                }
                a.setDoOutput(true);
                DataOutputStream dataOutputStream = new DataOutputStream(a.getOutputStream());
                dataOutputStream.write(dVar.f48963d.getBytes());
                dataOutputStream.close();
                if (aVar != null) {
                    aVar.mo68003a(100);
                }
            }
        } else if (!TextUtils.isEmpty(dVar.f48962c)) {
            a.setRequestMethod(dVar.f48962c);
        } else {
            a.setRequestMethod("GET");
        }
        return a;
    }
}
