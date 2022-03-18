package com.tt.miniapp.streamloader;

import java.net.URI;

/* renamed from: com.tt.miniapp.streamloader.c */
public class C66877c {
    /* renamed from: a */
    public static String m260854a(String str, String str2) {
        String path = URI.create(str2).relativize(URI.create(str)).getPath();
        return path.substring(path.indexOf(47) + 1);
    }
}
