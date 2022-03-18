package com.bytedance.ee.falcon.inspector.network;

import com.bytedance.ee.falcon.inspector.p603a.C12643a;
import com.bytedance.ee.falcon.inspector.protocol.module.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.InflaterOutputStream;

/* renamed from: com.bytedance.ee.falcon.inspector.network.e */
public class C12668e {
    /* renamed from: a */
    public static InputStream m52477a(C12681k kVar, String str, InputStream inputStream, OutputStream outputStream, String str2, AbstractC12686o oVar) throws IOException {
        C12667d dVar;
        if (str2 != null) {
            boolean equals = "gzip".equals(str2);
            boolean equals2 = "deflate".equals(str2);
            if (equals || equals2) {
                dVar = new C12667d(outputStream);
                if (equals) {
                    outputStream = C12670g.m52483a(dVar);
                } else if (equals2) {
                    outputStream = new InflaterOutputStream(dVar);
                }
                return new C12687p(inputStream, str, outputStream, dVar, kVar, oVar);
            }
            Console.MessageLevel messageLevel = Console.MessageLevel.WARNING;
            Console.MessageSource messageSource = Console.MessageSource.NETWORK;
            C12643a.m52422a(kVar, messageLevel, messageSource, "Unsupported Content-Encoding in response for request #" + str + ": " + str2);
        }
        dVar = null;
        return new C12687p(inputStream, str, outputStream, dVar, kVar, oVar);
    }
}
