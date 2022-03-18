package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* renamed from: com.huawei.hms.base.log.a */
public class C23504a {

    /* renamed from: c */
    public static final AbstractC23505b f57941c = new C23507d();

    /* renamed from: a */
    public int f57942a = 4;

    /* renamed from: b */
    public String f57943b;

    /* renamed from: a */
    public boolean mo82204a(int i) {
        if (i >= this.f57942a) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo82203a(String str, String str2) {
        C23506c a = mo82200a(4, str, str2, null);
        f57941c.mo82207a(a.mo82214c() + '\n' + a.mo82210a(), 4, str, str2);
    }

    /* renamed from: a */
    public void mo82202a(Context context, int i, String str) {
        this.f57942a = i;
        this.f57943b = str;
        f57941c.mo82206a(context, "HMSCore");
    }

    /* renamed from: a */
    public void mo82201a(int i, String str, String str2) {
        if (mo82204a(i)) {
            C23506c a = mo82200a(i, str, str2, null);
            f57941c.mo82207a(a.mo82214c() + a.mo82210a(), i, str, str2);
        }
    }

    /* renamed from: a */
    public final C23506c mo82200a(int i, String str, String str2, Throwable th) {
        C23506c cVar = new C23506c(8, this.f57943b, i, str);
        cVar.mo82208a(str2);
        cVar.mo82209a(th);
        return cVar;
    }

    /* renamed from: b */
    public void mo82205b(int i, String str, String str2, Throwable th) {
        if (mo82204a(i)) {
            C23506c a = mo82200a(i, str, str2, th);
            AbstractC23505b bVar = f57941c;
            bVar.mo82207a(a.mo82214c() + a.mo82210a(), i, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }
}
