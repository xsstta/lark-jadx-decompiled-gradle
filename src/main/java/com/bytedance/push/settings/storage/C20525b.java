package com.bytedance.push.settings.storage;

import android.net.Uri;
import java.util.List;

/* renamed from: com.bytedance.push.settings.storage.b */
final class C20525b {

    /* renamed from: a */
    String f50075a;

    /* renamed from: b */
    String f50076b;

    /* renamed from: c */
    String f50077c;

    /* renamed from: d */
    String f50078d;

    /* renamed from: a */
    public static C20525b m74740a(Uri uri) {
        List<String> pathSegments;
        if (uri == null || (pathSegments = uri.getPathSegments()) == null || pathSegments.size() < 4) {
            return null;
        }
        return new C20525b(pathSegments.get(0), pathSegments.get(1), pathSegments.get(2), pathSegments.get(3));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Uri mo69107b(Uri uri) {
        return uri.buildUpon().appendPath(this.f50075a).appendPath(this.f50076b).appendPath(this.f50077c).appendPath(this.f50078d).build();
    }

    C20525b(String str, String str2, String str3, String str4) {
        this.f50075a = str;
        this.f50076b = str2;
        this.f50077c = str3;
        this.f50078d = str4;
    }
}
