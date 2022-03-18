package androidx.navigation;

import android.content.Intent;
import android.net.Uri;

/* renamed from: androidx.navigation.j */
public class C1268j {

    /* renamed from: a */
    private final Uri f4561a;

    /* renamed from: b */
    private final String f4562b;

    /* renamed from: c */
    private final String f4563c;

    /* renamed from: a */
    public Uri mo6364a() {
        return this.f4561a;
    }

    /* renamed from: b */
    public String mo6365b() {
        return this.f4562b;
    }

    /* renamed from: c */
    public String mo6366c() {
        return this.f4563c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.f4561a != null) {
            sb.append(" uri=");
            sb.append(this.f4561a.toString());
        }
        if (this.f4562b != null) {
            sb.append(" action=");
            sb.append(this.f4562b);
        }
        if (this.f4563c != null) {
            sb.append(" mimetype=");
            sb.append(this.f4563c);
        }
        sb.append(" }");
        return sb.toString();
    }

    C1268j(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    C1268j(Uri uri, String str, String str2) {
        this.f4561a = uri;
        this.f4562b = str;
        this.f4563c = str2;
    }
}
