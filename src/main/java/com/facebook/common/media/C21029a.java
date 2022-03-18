package com.facebook.common.media;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* renamed from: com.facebook.common.media.a */
public class C21029a {

    /* renamed from: a */
    private static final MimeTypeMap f51418a = MimeTypeMap.getSingleton();

    /* renamed from: b */
    private static final Map<String, String> f51419b = ImmutableMap.of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c */
    private static final Map<String, String> f51420c = ImmutableMap.of("heif", "image/heif", "heic", "image/heic");

    /* renamed from: a */
    public static String m76654a(String str) {
        String str2 = f51420c.get(str);
        if (str2 != null) {
            return str2;
        }
        return f51418a.getMimeTypeFromExtension(str);
    }
}
