package com.tt.miniapp.p3323q;

import android.widget.TextView;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;

/* renamed from: com.tt.miniapp.q.c */
public class C66678c extends TextView {

    /* renamed from: a */
    private long f168328a;

    /* renamed from: b */
    private int f168329b;

    /* renamed from: c */
    private int f168330c;

    /* renamed from: d */
    private IAppContext f168331d;

    /* renamed from: a */
    public void mo232431a() {
        StringBuffer stringBuffer = new StringBuffer();
        if (C66689h.m260457c(this.f168331d) > 0) {
            this.f168330c = C66689h.m260457c(this.f168331d);
        }
        if (C66689h.m260454b(this.f168331d) > 0) {
            this.f168329b = C66689h.m260454b(this.f168331d);
        }
        if (C66689h.m260461d(this.f168331d) > 0) {
            this.f168328a = (long) C66689h.m260461d(this.f168331d);
        }
        stringBuffer.append("FPS:");
        stringBuffer.append(this.f168329b);
        stringBuffer.append(" Mem:");
        stringBuffer.append(this.f168328a);
        if (this.f168330c > 0) {
            stringBuffer.append(" CPU:");
            stringBuffer.append(this.f168330c);
            stringBuffer.append("%");
        }
        AppBrandLogger.m52828d("performance ", stringBuffer.toString());
        setText(stringBuffer);
    }
}
