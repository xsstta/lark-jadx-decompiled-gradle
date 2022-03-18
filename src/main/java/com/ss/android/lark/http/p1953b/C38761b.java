package com.ss.android.lark.http.p1953b;

import com.ss.android.lark.http.model.http.HttpParams;
import java.net.URLConnection;
import okhttp3.MediaType;

/* renamed from: com.ss.android.lark.http.b.b */
public class C38761b {
    /* renamed from: a */
    public static MediaType m153058a(String str) {
        String contentTypeFor = URLConnection.getFileNameMap().getContentTypeFor(str.replace("#", ""));
        if (contentTypeFor == null) {
            return HttpParams.MEDIA_TYPE_STREAM;
        }
        return MediaType.parse(contentTypeFor);
    }
}
