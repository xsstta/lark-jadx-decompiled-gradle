package com.ss.android.lark.exception.crash.p1828a.p1829a;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.C26256ah;
import com.ss.android.lark.exception.crash.C37008a;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.lark.exception.crash.a.a.b */
public class C37015b implements C37008a.AbstractC37010a {

    /* renamed from: a */
    public static final Long f95122a = 900000L;

    /* renamed from: b */
    private C37014a f95123b;

    /* renamed from: c */
    private Context f95124c;

    /* renamed from: d */
    private AbstractC37016a f95125d;

    /* renamed from: com.ss.android.lark.exception.crash.a.a.b$a */
    public interface AbstractC37016a {
        /* renamed from: a */
        void mo88876a(Context context);
    }

    public C37015b(Context context, AbstractC37016a aVar) {
        this.f95124c = context;
        this.f95125d = aVar;
        this.f95123b = new C37014a(context);
    }

    @Override // com.ss.android.lark.exception.crash.C37008a.AbstractC37010a
    /* renamed from: a */
    public boolean mo136537a(Thread thread, Throwable th) {
        long currentTimeMillis = System.currentTimeMillis();
        String b = this.f95123b.mo136540b("");
        if (TextUtils.isEmpty(b)) {
            this.f95123b.mo136539a(String.valueOf(currentTimeMillis));
            return false;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split(b, "\\|")));
        if (arrayList.size() <= 1) {
            arrayList.add(String.valueOf(currentTimeMillis));
            this.f95123b.mo136539a(TextUtils.join("|", arrayList));
            return false;
        } else if (Math.abs(currentTimeMillis - C26256ah.m95011a((String) arrayList.get(0))) > f95122a.longValue()) {
            arrayList.remove(0);
            arrayList.add(String.valueOf(currentTimeMillis));
            this.f95123b.mo136539a(TextUtils.join("|", arrayList));
            return false;
        } else {
            AbstractC37016a aVar = this.f95125d;
            if (aVar != null) {
                aVar.mo88876a(this.f95124c);
            }
            return true;
        }
    }
}
