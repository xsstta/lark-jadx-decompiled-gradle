package com.huawei.hms.hatool;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.zip.Deflater;

public final class r0 {
    /* renamed from: a */
    public static String m85903a(File file) {
        Throwable th;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                o0 o0Var = new o0(1024);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    o0Var.mo83133a(bArr, read);
                }
                if (o0Var.mo83135b() == 0) {
                    m85905a((Closeable) fileInputStream2);
                    return "";
                }
                String str = new String(o0Var.mo83134a(), "UTF-8");
                m85905a((Closeable) fileInputStream2);
                return str;
            } catch (FileNotFoundException unused) {
                fileInputStream = fileInputStream2;
                C23625y.m85982f("hmsSdk", "getInfoFromFile(): No files need to be read");
                m85905a((Closeable) fileInputStream);
                return "";
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                try {
                    C23625y.m85982f("hmsSdk", "getInfoFromFile(): stream.read or new string exception");
                    m85905a((Closeable) fileInputStream);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    m85905a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = fileInputStream2;
                m85905a((Closeable) fileInputStream);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            C23625y.m85982f("hmsSdk", "getInfoFromFile(): No files need to be read");
            m85905a((Closeable) fileInputStream);
            return "";
        } catch (IOException unused4) {
            C23625y.m85982f("hmsSdk", "getInfoFromFile(): stream.read or new string exception");
            m85905a((Closeable) fileInputStream);
            return "";
        }
    }

    /* renamed from: a */
    public static String m85904a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            m85905a((Closeable) byteArrayOutputStream);
        }
    }

    /* renamed from: a */
    public static void m85905a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                C23625y.m85982f("hmsSdk", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    /* renamed from: a */
    public static void m85906a(File file, String str) {
        Throwable th;
        FileOutputStream fileOutputStream;
        String str2;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(str.getBytes("UTF-8"));
                fileOutputStream.flush();
            } catch (FileNotFoundException unused) {
                fileOutputStream2 = fileOutputStream;
            } catch (IOException unused2) {
                fileOutputStream2 = fileOutputStream;
                str2 = "saveInfoToFile(): io exc from write info to file!";
                try {
                    C23625y.m85982f("hmsSdk", str2);
                    fileOutputStream = fileOutputStream2;
                    m85905a((Closeable) fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    m85905a((Closeable) fileOutputStream2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                m85905a((Closeable) fileOutputStream2);
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            str2 = "saveInfoToFile(): No files need to be read";
            C23625y.m85982f("hmsSdk", str2);
            fileOutputStream = fileOutputStream2;
            m85905a((Closeable) fileOutputStream);
        } catch (IOException unused4) {
            str2 = "saveInfoToFile(): io exc from write info to file!";
            C23625y.m85982f("hmsSdk", str2);
            fileOutputStream = fileOutputStream2;
            m85905a((Closeable) fileOutputStream);
        }
        m85905a((Closeable) fileOutputStream);
    }

    /* renamed from: a */
    public static void m85907a(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
                C23625y.m85982f("hmsSdk", "closeStream(): Exception: close OutputStream error!");
            }
        }
    }

    /* renamed from: a */
    public static void m85908a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (Exception unused) {
            C23625y.m85982f("hmsSdk", "closeQuietly(): Exception when connHttp.getInputStream()!,There may be no network, or no INTERNET permission");
        }
        httpURLConnection.disconnect();
        C23625y.m85971a("hmsSdk", " connHttp disconnect");
    }

    /* renamed from: a */
    public static byte[] m85909a(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Deflater deflater = new Deflater();
        deflater.setInput(bArr);
        deflater.finish();
        byte[] bArr2 = new byte[1024];
        while (!deflater.finished()) {
            byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        deflater.end();
        m85907a((OutputStream) byteArrayOutputStream);
        return byteArray;
    }
}
