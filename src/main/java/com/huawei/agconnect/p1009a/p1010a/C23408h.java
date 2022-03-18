package com.huawei.agconnect.p1009a.p1010a;

import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/* renamed from: com.huawei.agconnect.a.a.h */
public final class C23408h {
    /* renamed from: a */
    public static String m84949a(InputStream inputStream, String str) throws UnsupportedEncodingException, IOException {
        StringWriter stringWriter = new StringWriter();
        m84951a(new InputStreamReader(inputStream, str), stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: a */
    public static void m84950a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                Log.e("Utils", "Exception when closing the 'Closeable'.");
            }
        }
    }

    /* renamed from: a */
    public static void m84951a(Reader reader, Writer writer) throws IOException {
        m84952a(reader, writer, new char[4096]);
    }

    /* renamed from: a */
    public static void m84952a(Reader reader, Writer writer, char[] cArr) throws IOException {
        while (true) {
            int read = reader.read(cArr);
            if (-1 != read) {
                writer.write(cArr, 0, read);
            } else {
                return;
            }
        }
    }
}
