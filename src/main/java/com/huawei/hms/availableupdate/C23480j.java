package com.huawei.hms.availableupdate;

import android.content.Context;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.IOUtils;
import com.huawei.secure.android.common.ssl.C23825d;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.huawei.hms.availableupdate.j */
public class C23480j implements AbstractC23481k {

    /* renamed from: a */
    public HttpURLConnection f57915a;

    /* renamed from: b */
    public volatile int f57916b = -1;

    @Override // com.huawei.hms.availableupdate.AbstractC23481k
    /* renamed from: a */
    public void mo82154a() {
        this.f57916b = 1;
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23481k
    public void close() {
        this.f57916b = -1;
        HttpURLConnection httpURLConnection = this.f57915a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    public final void mo82155a(InputStream inputStream, OutputStream outputStream) throws IOException, C23479i {
        byte[] bArr = new byte[4096];
        do {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        } while (this.f57916b != 1);
        throw new C23479i("HTTP(s) request was canceled.");
    }

    /* renamed from: a */
    public final void mo82156a(String str, Context context) throws IOException {
        if (this.f57916b == 0) {
            HMSLog.m86964e("HttpRequestHelper", "Not allowed to repeat open http(s) connection.");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f57915a = httpURLConnection;
        if (httpURLConnection instanceof HttpsURLConnection) {
            try {
                C23825d a = C23825d.m87087a(context);
                if (a != null) {
                    ((HttpsURLConnection) this.f57915a).setSSLSocketFactory(a);
                }
                ((HttpsURLConnection) this.f57915a).setSSLSocketFactory(a);
            } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
                HMSLog.m86964e("HttpRequestHelper", "Failed to new TLSSocketFactory instance." + e.getMessage());
                throw new IOException("Failed to create SSLSocketFactory.");
            }
        }
        this.f57915a.setConnectTimeout(30000);
        this.f57915a.setReadTimeout(30000);
        this.f57915a.setDoInput(true);
        this.f57915a.setDoOutput(true);
        this.f57915a.setUseCaches(false);
        this.f57915a.setInstanceFollowRedirects(true);
        this.f57916b = 0;
    }

    @Override // com.huawei.hms.availableupdate.AbstractC23481k
    /* renamed from: a */
    public int mo82153a(String str, OutputStream outputStream, int i, int i2, Context context) throws IOException, C23479i {
        InputStream inputStream = null;
        try {
            mo82156a(str, context);
            this.f57915a.setRequestMethod("GET");
            if (i > 0) {
                HttpURLConnection httpURLConnection = this.f57915a;
                httpURLConnection.addRequestProperty("Range", "bytes=" + i + "-" + i2);
            }
            int responseCode = this.f57915a.getResponseCode();
            if ((i > 0 && responseCode == 206) || (i <= 0 && responseCode == 200)) {
                inputStream = this.f57915a.getInputStream();
                mo82155a(new BufferedInputStream(inputStream, 4096), outputStream);
                outputStream.flush();
            }
            return responseCode;
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }
}
