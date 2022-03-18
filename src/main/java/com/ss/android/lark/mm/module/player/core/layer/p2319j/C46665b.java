package com.ss.android.lark.mm.module.player.core.layer.p2319j;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a;
import com.ss.android.lark.mm.p2288b.C45859k;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3196c.C64122f;
import com.ss.android.videoshop.p3196c.C64127k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.j.b */
public class C46665b extends AbstractC46619b implements AbstractC46662a.AbstractC46664b {

    /* renamed from: c */
    private AbstractC46662a.AbstractC46663a f117373c;

    /* renamed from: d */
    private boolean f117374d = true;

    /* renamed from: f */
    private ArrayList<Integer> f117375f = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2319j.C46665b.C466661 */

        {
            add(1003);
            add(1005);
            add(209);
            add(102);
            add(115);
            add(Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR));
            add(106);
            add(Integer.valueOf((int) LocationRequest.PRIORITY_NO_POWER));
            add(Integer.valueOf((int) LocationRequest.PRIORITY_HD_ACCURACY));
            add(207);
        }
    };

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117303f;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117375f;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46664b
    /* renamed from: d */
    public AbstractC46626a mo163884d() {
        return this.f117320a;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2319j.AbstractC46662a.AbstractC46664b
    /* renamed from: a */
    public boolean mo163883a() {
        if (!this.f117320a.mo163726b().mo163821a().mo163833b() || !this.f117374d) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public void mo163885e() {
        AbstractC46662a.AbstractC46663a aVar;
        if (mo163883a() && (aVar = this.f117373c) != null) {
            aVar.mo163881b(false);
            this.f117373c.mo163877a();
        }
    }

    /* renamed from: c */
    private void m184553c(boolean z) {
        this.f117373c.mo163879a(z);
    }

    public C46665b(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        C45859k.m181685a(new Runnable(gVar) {
            /* class com.ss.android.lark.mm.module.player.core.layer.p2319j.$$Lambda$b$P4HBh2vaIdV8EoMkBvq6GDBcA */
            public final /* synthetic */ AbstractC64123g f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C46665b.this.m184552c((C46665b) this.f$1);
            }
        });
        return super.mo163782a(gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m184552c(AbstractC64123g gVar) {
        if (gVar != null) {
            int b = gVar.mo221968b();
            if (b == 200) {
                C64127k kVar = (C64127k) gVar;
                m184551a(kVar.mo221971a(), kVar.mo221974d());
            } else if (b != 207) {
                if (b == 300) {
                    m184553c(((C64122f) gVar).mo221970a());
                } else if (b == 1005) {
                    Boolean bool = (Boolean) gVar.mo221969c();
                    this.f117374d = bool.booleanValue();
                    if (bool.booleanValue()) {
                        AbstractC64108o s = mo222211s();
                        if (s != null) {
                            this.f117373c.mo163881b(s.mo221917i());
                        }
                        this.f117373c.mo163877a();
                        return;
                    }
                    this.f117373c.mo163880b();
                }
            } else if (mo222211s() != null) {
                m184551a(((Long) gVar.mo221969c()).longValue(), (long) mo222211s().mo221909a());
            }
        }
    }

    /* renamed from: a */
    private void m184551a(long j, long j2) {
        this.f117373c.mo163878a(j, j2);
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        if (context == null || layoutInflater == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.f117373c == null) {
            C46667c cVar = new C46667c(context, this);
            this.f117373c = cVar;
            cVar.setCallback(this);
        }
        mo163885e();
        return Collections.singletonList(new Pair(mo163802a(context, (View) this.f117373c), layoutParams));
    }
}
