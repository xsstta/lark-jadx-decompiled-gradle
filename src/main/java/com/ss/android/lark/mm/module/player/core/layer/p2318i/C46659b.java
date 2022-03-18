package com.ss.android.lark.mm.module.player.core.layer.p2318i;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2318i.AbstractC46656a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3196c.C64122f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.i.b */
public class C46659b extends AbstractC46619b implements AbstractC46656a.AbstractC46658b {

    /* renamed from: c */
    private AbstractC46656a.AbstractC46657a f117369c;

    /* renamed from: d */
    private ArrayList<Integer> f117370d = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2318i.C46659b.C466601 */

        {
            add(102);
            add(Integer.valueOf((int) SmEvents.EVENT_RE));
            add(101);
            add(Integer.valueOf((int) SmEvents.EVENT_NO));
            add(Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR));
        }
    };

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117304g;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117370d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo163873e() {
        this.f117369c.mo163869a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo163874f() {
        this.f117369c.mo163870b();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2318i.AbstractC46656a.AbstractC46658b
    /* renamed from: a */
    public void mo163872a() {
        mo222221v().mo222236a(new C64119c(1006));
    }

    public C46659b(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        C45855f.m181663b("MmReplayLayer", "handleVideoEvent " + gVar.mo221968b());
        int b = gVar.mo221968b();
        if (b != 101) {
            if (b != 102) {
                if (b != 110) {
                    if (b != 113) {
                        if (b == 300 && (gVar instanceof C64122f)) {
                            if (((C64122f) gVar).mo221970a()) {
                                mo163873e();
                            } else {
                                mo163874f();
                            }
                        }
                        return super.mo163782a(gVar);
                    }
                }
            }
            if (mo222221v().mo222244h() != null && !mo222221v().mo222244h().mo222315j()) {
                mo163873e();
            }
            return super.mo163782a(gVar);
        }
        mo163874f();
        return super.mo163782a(gVar);
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        if (this.f117369c == null) {
            View$OnClickListenerC46661c cVar = new View$OnClickListenerC46661c(context);
            this.f117369c = cVar;
            cVar.setCallback(this);
        }
        return Collections.singletonList(new Pair(mo163802a(context, (View) this.f117369c), layoutParams));
    }
}
