package com.he.v8_inspect.server.http;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public abstract class LightHttpBody {
    public abstract int contentLength();

    public abstract String contentType();

    public abstract void writeTo(OutputStream outputStream) throws IOException;

    public static LightHttpBody create(final byte[] bArr, final String str) {
        return new LightHttpBody() {
            /* class com.he.v8_inspect.server.http.LightHttpBody.C233941 */

            @Override // com.he.v8_inspect.server.http.LightHttpBody
            public int contentLength() {
                return bArr.length;
            }

            @Override // com.he.v8_inspect.server.http.LightHttpBody
            public String contentType() {
                return str;
            }

            @Override // com.he.v8_inspect.server.http.LightHttpBody
            public void writeTo(OutputStream outputStream) throws IOException {
                outputStream.write(bArr);
            }
        };
    }

    public static LightHttpBody create(String str, String str2) {
        try {
            return create(str.getBytes("UTF-8"), str2);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
