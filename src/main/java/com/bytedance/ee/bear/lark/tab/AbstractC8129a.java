package com.bytedance.ee.bear.lark.tab;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.lark.C8032e;
import com.bytedance.ee.bear.lark.statistics.doc.DocHitPoint;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44552i;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;

/* renamed from: com.bytedance.ee.bear.lark.tab.a */
public abstract class AbstractC8129a implements AbstractC44552i {

    /* renamed from: a */
    protected Context f21707a;

    /* renamed from: b */
    protected AbstractC44548e f21708b;

    /* renamed from: c */
    protected ITitleController f21709c;

    /* renamed from: d */
    public DocTabView f21710d;

    /* renamed from: e */
    private DocNavigationTabView f21711e;

    /* renamed from: f */
    private AbstractC44552i.AbstractC44553a f21712f = new AbstractC44552i.AbstractC44553a() {
        /* class com.bytedance.ee.bear.lark.tab.AbstractC8129a.C81301 */

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: b */
        public void mo31325b(String str, String str2) {
            C8032e.m32090a().mo31047b(str, str2);
        }

        @Override // com.ss.android.lark.maincore.AbstractC44552i.AbstractC44553a
        /* renamed from: a */
        public void mo31324a(String str, String str2) {
            boolean equals = TextUtils.equals("space", str);
            boolean equals2 = TextUtils.equals("space", str2);
            if (equals2 && !TextUtils.equals(str, str2)) {
                DocHitPoint.m32116a();
            }
            if (AbstractC8129a.this.f21710d != null) {
                if (equals && !equals2) {
                    AbstractC8129a.this.f21710d.mo110683b();
                }
                if (!equals && equals2) {
                    AbstractC8129a.this.f21710d.mo110677a();
                    AbstractC8129a.this.mo31310a(true);
                    AbstractC8129a.this.mo31308a();
                }
                C8032e.m32090a().mo31046a(str, str2);
            }
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo31308a() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: a */
    public void mo31309a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo31310a(boolean z) {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: b */
    public String mo31311b() {
        return "space";
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: d */
    public int mo31313d() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: e */
    public boolean mo31314e() {
        return false;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: f */
    public void mo31315f() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: g */
    public void mo31316g() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: h */
    public int mo31317h() {
        return 1;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: i */
    public Fragment mo31318i() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: k */
    public ITitleInfo mo31320k() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: m */
    public AbstractC44552i.AbstractC44554b mo31322m() {
        return null;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: n */
    public void mo31323n() {
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: l */
    public AbstractC44552i.AbstractC44553a mo31321l() {
        return this.f21712f;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: c */
    public <T extends View> T mo31312c() {
        if (this.f21710d == null) {
            this.f21710d = new DocTabView(this.f21707a);
        }
        return this.f21710d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44552i
    /* renamed from: j */
    public <T extends View> T mo31319j() {
        if (this.f21711e == null) {
            this.f21711e = new DocNavigationTabView(this.f21707a);
        }
        return this.f21711e;
    }

    protected AbstractC8129a(Context context, AbstractC44548e eVar, ITitleController iTitleController) {
        this.f21707a = context;
        this.f21708b = eVar;
        this.f21709c = iTitleController;
    }
}
