package com.tt.option.p3393n;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.tt.miniapp.p3301m.C66334e;
import com.tt.miniapphost.entity.C67525e;
import com.tt.option.AbstractC67593a;

/* renamed from: com.tt.option.n.a */
public class C67659a extends AbstractC67593a<AbstractC67660b> implements AbstractC67660b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC67660b mo232057b() {
        return new C66334e();
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public boolean chooseLocationActivity(IAppContext iAppContext, String str, int i) {
        if (mo234790c()) {
            return ((AbstractC67660b) this.f170423a).chooseLocationActivity(iAppContext, str, i);
        }
        return false;
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public C67525e handleChooseLocationResult(int i, int i2, Intent intent) {
        if (mo234790c()) {
            return ((AbstractC67660b) this.f170423a).handleChooseLocationResult(i, i2, intent);
        }
        return null;
    }

    @Override // com.tt.option.p3393n.AbstractC67660b
    public boolean openLocation(Activity activity, String str, String str2, double d, double d2, int i, String str3, String str4) {
        if (mo234790c()) {
            return ((AbstractC67660b) this.f170423a).openLocation(activity, str, str2, d, d2, i, str3, str4);
        }
        return false;
    }
}
