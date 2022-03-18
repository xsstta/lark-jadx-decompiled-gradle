package com.bytedance.crash.upload;

import com.bytedance.crash.C3774m;
import com.bytedance.crash.runtime.C3864m;
import com.bytedance.crash.util.C3949m;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.bytedance.crash.upload.l */
public class C3918l {

    /* renamed from: a */
    private final String f11999a;

    /* renamed from: b */
    private final HttpURLConnection f12000b;

    /* renamed from: c */
    private final String f12001c;

    /* renamed from: d */
    private final boolean f12002d;

    /* renamed from: e */
    private C3905g f12003e;

    /* renamed from: f */
    private C3923o f12004f;

    /* renamed from: g */
    private C3889b f12005g;

    /* renamed from: h */
    private C3864m.C3865a f12006h = C3864m.m16006a("crash_upload_size");

    /* renamed from: a */
    public void mo15576a(String str, C3949m.C3951b... bVarArr) throws IOException {
        mo15575a(str, (Map<String, String>) null, bVarArr);
    }

    /* renamed from: b */
    private void m16211b(String str) throws IOException {
        m16209a(str, (Map<String, String>) null);
    }

    /* renamed from: a */
    private void m16210a(byte[] bArr) throws IOException {
        if (this.f12002d) {
            this.f12004f.write(bArr);
        } else {
            this.f12003e.write(bArr);
        }
    }

    /* renamed from: a */
    private void m16208a(File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                fileInputStream.close();
                return;
            } else if (this.f12002d) {
                this.f12004f.write(bArr, 0, read);
            } else {
                this.f12003e.write(bArr, 0, read);
            }
        }
    }

    /* renamed from: a */
    public String mo15570a(String str) throws IOException {
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f11999a + "--" + "\r\n").getBytes();
        if (this.f12002d) {
            this.f12004f.write(bytes);
            this.f12004f.mo15582b();
            this.f12004f.mo15581a();
        } else {
            this.f12003e.write(bytes);
            this.f12003e.flush();
            this.f12003e.mo15556a();
        }
        this.f12006h.mo15481a("data_type", str);
        this.f12006h.mo15483b("total_size", Long.valueOf(this.f12005g.mo15523b()));
        this.f12006h.mo15482a();
        int responseCode = this.f12000b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f12000b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f12000b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String str2 : arrayList) {
                sb.append(str2);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    /* renamed from: a */
    public void mo15573a(String str, String str2) {
        mo15574a(str, str2, false);
    }

    /* renamed from: a */
    public void mo15571a(File file, Map<String, String> map) throws IOException {
        m16209a(file.getName(), map);
        m16208a(file);
        m16210a("\r\n".getBytes());
    }

    /* renamed from: a */
    private void m16209a(String str, Map<String, String> map) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("--");
        sb.append(this.f11999a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(str);
        sb.append("\"");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb.append("; ");
                sb.append(entry.getKey());
                sb.append("=\"");
                sb.append(entry.getValue());
                sb.append("\"");
            }
        }
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        m16210a(sb.toString().getBytes());
    }

    /* renamed from: a */
    public void mo15572a(String str, File file) throws IOException {
        this.f12005g.mo15522a();
        m16211b(str);
        m16208a(file);
        m16210a("\r\n".getBytes());
        C3864m.C3865a aVar = this.f12006h;
        aVar.mo15483b(str + "_size", Long.valueOf(this.f12005g.mo15522a()));
    }

    public C3918l(String str, String str2, boolean z) throws IOException {
        this.f12001c = str2;
        this.f12002d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f11999a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f12000b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (z) {
            httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
            this.f12005g = new C3889b(httpURLConnection.getOutputStream());
            this.f12004f = new C3923o(this.f12005g);
            return;
        }
        this.f12005g = new C3889b(httpURLConnection.getOutputStream());
        this.f12003e = new C3905g(this.f12005g);
    }

    /* renamed from: a */
    public void mo15574a(String str, String str2, boolean z) {
        this.f12005g.mo15522a();
        try {
            m16210a(("--" + this.f11999a + "\r\n" + "Content-Disposition: form-data; name=\"" + str + "\"" + "\r\n" + "Content-Type: text/plain; charset=" + this.f12001c + "\r\n" + "\r\n").getBytes());
        } catch (IOException unused) {
        }
        byte[] bytes = str2.getBytes();
        if (z) {
            bytes = C3774m.m15611l().getEncryptImpl().mo15182a(bytes);
        }
        try {
            m16210a(bytes);
            m16210a("\r\n".getBytes());
        } catch (IOException unused2) {
        }
        C3864m.C3865a aVar = this.f12006h;
        aVar.mo15483b(str + "_size", Long.valueOf(this.f12005g.mo15522a()));
    }

    /* renamed from: a */
    public void mo15575a(String str, Map<String, String> map, C3949m.C3951b... bVarArr) throws IOException {
        this.f12005g.mo15522a();
        m16209a(str, map);
        if (this.f12002d) {
            C3949m.m16406a(this.f12004f, bVarArr);
        } else {
            C3949m.m16406a(this.f12003e, bVarArr);
        }
        m16210a("\r\n".getBytes());
        C3864m.C3865a aVar = this.f12006h;
        aVar.mo15483b(str + "_size", Long.valueOf(this.f12005g.mo15522a()));
    }
}
