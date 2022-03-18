package com.bytedance.ee.bear.middleground.permission.setting.linkshare;

import android.content.Context;
import com.bytedance.ee.bear.middleground_permission_export.model.permissionset.DocPermSetInfo;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.b */
class C10024b {

    /* renamed from: a */
    private Context f27098a;

    /* renamed from: b */
    private DocPermSetInfo f27099b;

    /* renamed from: c */
    private boolean f27100c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<LinkShareItem> mo38329a() {
        return m41717c().mo38335a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo38330b() {
        return m41717c().mo38336b();
    }

    /* renamed from: c */
    private AbstractC10070m m41717c() {
        if (!this.f27099b.mo38844q() || !this.f27099b.ab()) {
            return new C10029e(this.f27098a, this.f27099b, this.f27100c);
        }
        return new C10088u(this.f27098a, this.f27099b, this.f27100c);
    }

    C10024b(Context context, DocPermSetInfo docPermSetInfo, boolean z) {
        this.f27098a = context;
        this.f27099b = docPermSetInfo;
        this.f27100c = z;
    }
}
