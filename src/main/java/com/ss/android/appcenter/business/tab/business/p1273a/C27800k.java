package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.view.View;
import com.ss.android.appcenter.business.net.p1272c.C27733c;
import com.ss.android.appcenter.business.tab.fragmentv3.templateswitch.TemplateSwitchContainer;
import com.ss.android.appcenter.common.util.C28182f;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.lark.maincore.AbstractC44545b;
import com.ss.android.lark.maincore.AbstractC44548e;
import com.ss.android.lark.maincore.AbstractC44549f;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.k */
public class C27800k {

    /* renamed from: a */
    public AbstractC44549f f69454a;

    /* renamed from: b */
    public AbstractC44548e f69455b;

    /* renamed from: c */
    public C27789a f69456c;

    /* renamed from: d */
    public boolean f69457d;

    /* renamed from: e */
    public TemplateSwitchContainer f69458e;

    /* renamed from: f */
    public boolean f69459f;

    /* renamed from: g */
    private List<AbstractC44545b> f69460g;

    /* renamed from: h */
    private boolean f69461h;

    /* renamed from: i */
    private boolean f69462i;

    /* renamed from: j */
    private ITitleInfo.AbstractC44542a f69463j;

    /* renamed from: com.ss.android.appcenter.business.tab.business.a.k$a */
    public interface AbstractC27803a {
        /* renamed from: a */
        void mo99208a(boolean z);

        /* renamed from: b */
        void mo99209b(boolean z);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.a.k$b */
    public interface AbstractC27804b {
        /* renamed from: a */
        C27733c mo99211a();

        /* renamed from: a */
        void mo99212a(C27733c cVar);
    }

    /* renamed from: e */
    public ITitleInfo mo99207e() {
        return this.f69456c;
    }

    /* renamed from: a */
    public void mo99198a() {
        this.f69456c.mo99179i();
    }

    /* renamed from: c */
    public void mo99205c() {
        this.f69455b.mo99184a(this.f69458e);
    }

    /* renamed from: d */
    public int mo99206d() {
        return this.f69454a.mo99189a();
    }

    /* renamed from: b */
    public void mo99203b() {
        ITitleInfo.IconStyle iconStyle;
        C27789a aVar = this.f69456c;
        if (this.f69457d) {
            iconStyle = ITitleInfo.IconStyle.Up;
        } else {
            iconStyle = ITitleInfo.IconStyle.Down;
        }
        aVar.mo99171a(iconStyle);
    }

    public C27800k() {
        this(new C27795f(), new C27794e(), new C27789a());
    }

    /* renamed from: a */
    public void mo99202a(boolean z) {
        this.f69456c.mo99177b(z);
        this.f69454a.mo99191a(this.f69456c);
    }

    /* renamed from: b */
    public void mo99204b(boolean z) {
        this.f69461h = z;
        if (z) {
            this.f69456c.mo99174a(this.f69460g);
        } else {
            this.f69456c.mo99181k();
        }
        this.f69454a.mo99191a(this.f69456c);
    }

    /* renamed from: a */
    public void mo99201a(String str) {
        C28184h.m103250d("WorkplaceTitleControler", "updateCustomTitle>>> title:" + str);
        this.f69456c.mo99173a(str);
        this.f69454a.mo99191a(this.f69456c);
    }

    /* renamed from: a */
    private void m101607a(Context context, AbstractC27804b bVar) {
        if (!this.f69462i) {
            this.f69462i = true;
            TemplateSwitchContainer templateSwitchContainer = new TemplateSwitchContainer(context);
            this.f69458e = templateSwitchContainer;
            templateSwitchContainer.mo100009a(bVar, new AbstractC27803a() {
                /* class com.ss.android.appcenter.business.tab.business.p1273a.C27800k.C278011 */

                @Override // com.ss.android.appcenter.business.tab.business.p1273a.C27800k.AbstractC27803a
                /* renamed from: b */
                public void mo99209b(boolean z) {
                    C28184h.m103250d("WorkplaceTitleControler", "onAnimEnd>>> isShow:" + z + " currentMenuOpen:" + C27800k.this.f69457d);
                    C27800k.this.f69459f = false;
                    if (!z) {
                        C27800k.this.mo99205c();
                    }
                }

                @Override // com.ss.android.appcenter.business.tab.business.p1273a.C27800k.AbstractC27803a
                /* renamed from: a */
                public void mo99208a(boolean z) {
                    C28184h.m103250d("WorkplaceTitleControler", "onAnimStart>>> isShow:" + z + " currentMenuOpen:" + C27800k.this.f69457d);
                    C27800k.this.f69459f = true;
                    if (!z && C27800k.this.f69457d) {
                        C27800k.this.f69457d = false;
                        C27800k.this.mo99203b();
                        C27800k.this.f69454a.mo99191a(C27800k.this.f69456c);
                    }
                }
            });
            this.f69463j = new ITitleInfo.AbstractC44542a() {
                /* class com.ss.android.appcenter.business.tab.business.p1273a.C27800k.C278022 */

                @Override // com.ss.android.lark.maincore.ITitleInfo.AbstractC44542a
                /* renamed from: a */
                public void mo99210a() {
                    if (!C27800k.this.f69459f) {
                        C27800k kVar = C27800k.this;
                        kVar.f69457d = !kVar.f69457d;
                        C27800k.this.mo99203b();
                        C27800k.this.f69454a.mo99191a(C27800k.this.f69456c);
                        if (C27800k.this.f69457d) {
                            View e = C27800k.this.f69454a.mo99197e();
                            C27800k.this.f69458e.mo100011a(true);
                            if (C27800k.this.f69458e.getParent() == null) {
                                C27800k.this.f69455b.mo99185a(e, e.getHeight(), C27800k.this.f69458e, $$Lambda$k$2$aAXdD6wYkqIBVEb6oyqootmtcS0.INSTANCE);
                            } else {
                                C28184h.m103248b("WorkplaceTitleControler", "showPopupMenu>>> bad case.");
                            }
                        } else {
                            C27800k.this.f69458e.mo100011a(false);
                        }
                    }
                }
            };
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        if (r3.equals("Search") == false) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo99200a(android.content.Context r7, java.util.List<com.ss.android.appcenter.business.tab.business.p1273a.C27799j> r8) {
        /*
        // Method dump skipped, instructions count: 218
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.tab.business.p1273a.C27800k.mo99200a(android.content.Context, java.util.List):void");
    }

    public C27800k(ITitleController iTitleController, AbstractC44548e eVar, C27789a aVar) {
        this.f69454a = (AbstractC44549f) iTitleController;
        this.f69455b = eVar;
        this.f69456c = aVar;
        this.f69460g = new ArrayList();
    }

    /* renamed from: a */
    public void mo99199a(Context context, AbstractC27804b bVar, List<C27733c> list) {
        boolean z = true;
        if (C28182f.m103234a(list) <= 1) {
            z = false;
        }
        if (z) {
            m101607a(context, bVar);
            this.f69458e.mo100010a(list);
            mo99203b();
            this.f69456c.mo99172a(this.f69463j);
        } else {
            this.f69456c.mo99171a(ITitleInfo.IconStyle.Hide);
            this.f69456c.mo99172a((ITitleInfo.AbstractC44542a) null);
        }
        this.f69454a.mo99191a(this.f69456c);
    }
}
