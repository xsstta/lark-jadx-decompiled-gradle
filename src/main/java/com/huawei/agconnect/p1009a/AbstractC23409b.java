package com.huawei.agconnect.p1009a;

import android.content.Context;
import com.huawei.agconnect.p1009a.p1010a.C23408h;
import java.io.InputStream;

/* renamed from: com.huawei.agconnect.a.b */
public abstract class AbstractC23409b {

    /* renamed from: a */
    private final Context f57726a;

    /* renamed from: b */
    private InputStream f57727b;

    public AbstractC23409b(Context context) {
        this.f57726a = context;
    }

    /* renamed from: a */
    public abstract InputStream mo81789a(Context context);

    /* renamed from: a */
    public final void mo81791a() {
        C23408h.m84950a(this.f57727b);
    }

    /* renamed from: b */
    public InputStream mo81792b() {
        if (this.f57727b == null) {
            this.f57727b = mo81789a(this.f57726a);
        }
        return this.f57727b;
    }
}
