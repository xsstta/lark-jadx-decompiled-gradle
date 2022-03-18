package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.r */
public final class C22911r {

    /* renamed from: a */
    private static final Pattern f56623a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: b */
    private final String f56624b;

    /* renamed from: c */
    private final String f56625c;

    /* renamed from: d */
    private final String f56626d;

    /* renamed from: a */
    public final String mo79532a() {
        return this.f56624b;
    }

    /* renamed from: b */
    public final String mo79533b() {
        return this.f56625c;
    }

    /* renamed from: c */
    public final String mo79534c() {
        return this.f56626d;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f56625c, this.f56624b);
    }

    /* renamed from: a */
    static C22911r m83252a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C22911r(split[0], split[1]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22911r)) {
            return false;
        }
        C22911r rVar = (C22911r) obj;
        if (!this.f56624b.equals(rVar.f56624b) || !this.f56625c.equals(rVar.f56625c)) {
            return false;
        }
        return true;
    }

    private C22911r(String str, String str2) {
        this.f56624b = m83253a(str2, str);
        this.f56625c = str;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("!");
        sb.append(str2);
        this.f56626d = sb.toString();
    }

    /* renamed from: a */
    private static String m83253a(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f56623a.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }
}
