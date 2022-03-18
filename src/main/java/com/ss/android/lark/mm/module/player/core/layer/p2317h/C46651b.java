package com.ss.android.lark.mm.module.player.core.layer.p2317h;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import com.ss.android.videoshop.api.AbstractC64108o;
import com.ss.android.videoshop.p3194a.C64087a;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3196c.C64119c;
import com.ss.android.videoshop.p3196c.C64122f;
import com.ss.ttm.player.PlaybackParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.h.b */
public class C46651b extends AbstractC46619b implements AbstractC46648a.AbstractC46650b {

    /* renamed from: c */
    private AbstractC46648a.AbstractC46649a f117362c;

    /* renamed from: d */
    private ArrayList<Integer> f117363d = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2317h.C46651b.C466521 */

        {
            add(1003);
            add(102);
            add(115);
            add(Integer.valueOf((int) LocationRequest.PRIORITY_INDOOR));
        }
    };

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117308k;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117363d;
    }

    /* renamed from: e */
    private void m184519e() {
        this.f117362c.mo163861a();
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a.AbstractC46650b
    /* renamed from: a */
    public float mo163864a() {
        PlaybackParams k;
        AbstractC64108o s = mo222211s();
        if (s == null || (k = s.mo221919k()) == null) {
            return this.f117320a.mo163725a().mo163691g();
        }
        return k.getSpeed();
    }

    /* renamed from: a */
    private void m184518a(List<Integer> list) {
        this.f117362c.mo163862a(list);
    }

    public C46651b(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2317h.AbstractC46648a.AbstractC46650b
    /* renamed from: a */
    public void mo163865a(float f) {
        this.f117320a.mo163725a().mo163693a(f);
        mo222202a(new C64087a(SmEvents.EVENT_LOCAL_BUSY_FORCE_END_LAST, Float.valueOf(f)));
        mo222221v().mo222236a(new C64119c(1007));
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        Bundle d;
        if (gVar != null) {
            int b = gVar.mo221968b();
            if (b == 102 || b == 115) {
                m184519e();
            } else if (b != 300) {
                if (b == 1003) {
                    C64116b y = mo222224y();
                    ArrayList<Integer> arrayList = null;
                    if (!(y == null || (d = y.mo221937d()) == null)) {
                        arrayList = d.getIntegerArrayList("video_speed_options");
                    }
                    m184518a(arrayList);
                }
            } else if (!((C64122f) gVar).mo221970a()) {
                m184519e();
            }
        }
        return super.mo163782a(gVar);
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        if (context == null || layoutInflater == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.f117362c == null) {
            View$OnClickListenerC46653c cVar = new View$OnClickListenerC46653c(context);
            this.f117362c = cVar;
            cVar.setCallback(this);
        }
        return Collections.singletonList(new Pair(mo163802a(context, (View) this.f117362c), layoutParams));
    }
}
