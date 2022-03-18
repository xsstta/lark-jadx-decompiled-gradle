package com.ss.android.lark.mm.module.player.core.layer.p2313d;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.lark.mm.module.player.core.layer.p2313d.AbstractC46631a;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.d.b */
public class C46633b extends AbstractC46619b {

    /* renamed from: c */
    private AbstractC46631a.AbstractC46632a f117350c;

    /* renamed from: d */
    private ArrayList<Integer> f117351d = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2313d.C46633b.C466341 */

        {
            add(115);
            add(100);
            add(Integer.valueOf((int) SmEvents.EVENT_NE_RR));
        }
    };

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117300c;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117351d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo163839e() {
        AbstractC46631a.AbstractC46632a aVar = this.f117350c;
        if (aVar != null) {
            aVar.mo163836b();
        }
    }

    /* renamed from: f */
    private String m184468f() {
        Bundle d;
        if (mo222224y() == null || (d = mo222224y().mo221937d()) == null) {
            return "";
        }
        return d.getString("video_cover_url", "");
    }

    public C46633b(AbstractC46626a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo163838a(String str) {
        AbstractC46631a.AbstractC46632a aVar = this.f117350c;
        if (aVar != null) {
            aVar.setImageUri(str);
            this.f117350c.mo163835a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 != 115) goto L_0x0022;
     */
    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo163782a(com.ss.android.videoshop.p3196c.AbstractC64123g r3) {
        /*
            r2 = this;
            int r0 = r3.mo221968b()
            r1 = 100
            if (r0 == r1) goto L_0x0015
            r1 = 112(0x70, float:1.57E-43)
            if (r0 == r1) goto L_0x0011
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L_0x0015
            goto L_0x0022
        L_0x0011:
            r2.mo163839e()
            goto L_0x0022
        L_0x0015:
            com.ss.android.videoshop.b.b r0 = r2.mo222224y()
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r2.m184468f()
            r2.mo163838a(r0)
        L_0x0022:
            boolean r3 = super.mo163782a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mm.module.player.core.layer.p2313d.C46633b.mo163782a(com.ss.android.videoshop.c.g):boolean");
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        if (context == null) {
            return null;
        }
        if (this.f117350c == null) {
            C46635c cVar = new C46635c(context);
            this.f117350c = cVar;
            cVar.setImageUri(m184468f());
        }
        return Collections.singletonList(new Pair(mo163802a(context, (View) this.f117350c), new RelativeLayout.LayoutParams(-1, -1)));
    }
}
