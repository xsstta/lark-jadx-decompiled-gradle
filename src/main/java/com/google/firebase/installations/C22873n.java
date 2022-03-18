package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.installations.local.AbstractC22870c;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.installations.n */
public class C22873n {

    /* renamed from: a */
    public static final long f56536a = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: b */
    private static final Pattern f56537b = Pattern.compile("\\AA[\\w-]{38}\\z");

    C22873n() {
    }

    /* renamed from: a */
    public long mo79429a() {
        return TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
    }

    /* renamed from: a */
    static boolean m83077a(String str) {
        return str.contains(":");
    }

    /* renamed from: b */
    static boolean m83078b(String str) {
        return f56537b.matcher(str).matches();
    }

    /* renamed from: a */
    public boolean mo79430a(AbstractC22870c cVar) {
        if (!TextUtils.isEmpty(cVar.mo79399c()) && cVar.mo79403f() + cVar.mo79401e() >= mo79429a() + f56536a) {
            return false;
        }
        return true;
    }
}
