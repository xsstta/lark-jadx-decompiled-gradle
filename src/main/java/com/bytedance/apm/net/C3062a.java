package com.bytedance.apm.net;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.net.a */
public class C3062a {

    /* renamed from: a */
    private final String f9841a;

    /* renamed from: b */
    private HttpURLConnection f9842b;

    /* renamed from: c */
    private String f9843c;

    /* renamed from: d */
    private boolean f9844d;

    /* renamed from: e */
    private DataOutputStream f9845e;

    /* renamed from: f */
    private GZIPOutputStream f9846f;

    /* renamed from: a */
    public String mo12913a() throws IOException {
        ArrayList<String> arrayList = new ArrayList();
        byte[] bytes = ("\r\n--" + this.f9841a + "--" + "\r\n").getBytes();
        if (this.f9844d) {
            this.f9846f.write(bytes);
            this.f9846f.finish();
            this.f9846f.close();
        } else {
            this.f9845e.write(bytes);
            this.f9845e.flush();
            this.f9845e.close();
        }
        int responseCode = this.f9842b.getResponseCode();
        if (responseCode == 200) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9842b.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                arrayList.add(readLine);
            }
            bufferedReader.close();
            this.f9842b.disconnect();
            StringBuilder sb = new StringBuilder();
            for (String str : arrayList) {
                sb.append(str);
            }
            return sb.toString();
        }
        throw new IOException("Server returned non-OK status: " + responseCode);
    }

    /* renamed from: a */
    public void mo12916a(JSONObject jSONObject) throws IOException {
        String str;
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.f9841a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"params.txt\"; filetype=\"common_params\"; logtype=\"env\"; filename=\"params.txt\"\r\n");
        sb.append("Content-Type: text/plain\r\n");
        sb.append("\r\n");
        if (this.f9844d) {
            this.f9846f.write(sb.toString().getBytes());
        } else {
            this.f9845e.write(sb.toString().getBytes());
        }
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("defaultData", "none commonParams");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            str = jSONObject2.toString();
        }
        if (this.f9844d) {
            this.f9846f.write(str.getBytes());
        } else {
            this.f9845e.write(str.getBytes());
        }
        if (this.f9844d) {
            this.f9846f.write("\r\n".getBytes());
            return;
        }
        this.f9845e.write("\r\n".getBytes());
        this.f9845e.flush();
    }

    /* renamed from: a */
    public void mo12915a(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.f9841a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"");
        sb.append("\r\n");
        sb.append("Content-Type: text/plain; charset=");
        sb.append(this.f9843c);
        sb.append("\r\n");
        sb.append("\r\n");
        sb.append(str2);
        sb.append("\r\n");
        try {
            if (this.f9844d) {
                this.f9846f.write(sb.toString().getBytes());
            } else {
                this.f9845e.write(sb.toString().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public C3062a(String str, String str2, boolean z) throws IOException {
        this.f9843c = str2;
        this.f9844d = z;
        String str3 = "AAA" + System.currentTimeMillis() + "AAA";
        this.f9841a = str3;
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        this.f9842b = httpURLConnection;
        httpURLConnection.setUseCaches(false);
        this.f9842b.setDoOutput(true);
        this.f9842b.setDoInput(true);
        this.f9842b.setRequestMethod("POST");
        this.f9842b.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + str3);
        if (z) {
            this.f9842b.setRequestProperty("Content-Encoding", "gzip");
            this.f9846f = new GZIPOutputStream(this.f9842b.getOutputStream());
            return;
        }
        this.f9845e = new DataOutputStream(this.f9842b.getOutputStream());
    }

    /* renamed from: a */
    public void mo12914a(String str, File file, Map<String, String> map) throws IOException {
        String name = file.getName();
        StringBuilder sb = new StringBuilder(100);
        sb.append("--");
        sb.append(this.f9841a);
        sb.append("\r\n");
        sb.append("Content-Disposition: form-data; name=\"");
        sb.append(str);
        sb.append("\"; filename=\"");
        sb.append(name);
        sb.append("\"");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("; ");
            sb.append(entry.getKey());
            sb.append("=\"");
            sb.append(entry.getValue());
            sb.append("\"");
        }
        sb.append("\r\n");
        sb.append("Content-Transfer-Encoding: binary");
        sb.append("\r\n");
        sb.append("\r\n");
        if (this.f9844d) {
            this.f9846f.write(sb.toString().getBytes());
        } else {
            this.f9845e.write(sb.toString().getBytes());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read == -1) {
                break;
            } else if (this.f9844d) {
                this.f9846f.write(bArr, 0, read);
            } else {
                this.f9845e.write(bArr, 0, read);
            }
        }
        fileInputStream.close();
        if (this.f9844d) {
            this.f9846f.write("\r\n".getBytes());
            return;
        }
        this.f9845e.write("\r\n".getBytes());
        this.f9845e.flush();
    }
}
