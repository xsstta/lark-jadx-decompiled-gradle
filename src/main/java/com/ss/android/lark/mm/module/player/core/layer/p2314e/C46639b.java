package com.ss.android.lark.mm.module.player.core.layer.p2314e;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.p3194a.C64087a;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.e.b */
public class C46639b extends AbstractC46619b implements AbstractC46636a.AbstractC46638b {

    /* renamed from: c */
    private AbstractC46636a.AbstractC46637a f117352c;

    /* renamed from: d */
    private ArrayList<Integer> f117353d = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2314e.C46639b.C466401 */

        {
            add(Integer.valueOf((int) SmEvents.EVENT_RE));
            add(104);
        }
    };

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46638b
    /* renamed from: d */
    public AbstractC64152a mo163847d() {
        return this;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117309l;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117353d;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46638b
    /* renamed from: e */
    public AbstractC46626a mo163848e() {
        return this.f117320a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo163850f() {
        this.f117352c.mo163841a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo163851g() {
        this.f117352c.mo163844b();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2314e.AbstractC46636a.AbstractC46638b
    /* renamed from: a */
    public void mo163846a() {
        mo222202a(new C64087a(207));
    }

    /* renamed from: a */
    public void mo163849a(float f) {
        this.f117352c.mo163842a(f);
    }

    public C46639b(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: a */
    public void mo163781a(boolean z) {
        AbstractC46636a.AbstractC46637a aVar = this.f117352c;
        if (aVar != null) {
            aVar.mo163843a(z);
        }
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        C45855f.m181663b("MmLoadFailLayer", "handleVideoEvent " + gVar.mo221968b());
        if (gVar.mo221968b() == 113) {
            mo163850f();
        } else if (gVar.mo221968b() == 104) {
            mo163851g();
        }
        return super.mo163782a(gVar);
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f117352c == null) {
            View$OnClickListenerC46641c cVar = new View$OnClickListenerC46641c(mo222223x());
            this.f117352c = cVar;
            cVar.setCallback(this);
        }
        return Collections.singletonList(new Pair(mo163802a(context, (View) this.f117352c), layoutParams));
    }
}
