package com.ss.android.lark.mm.module.player.core.layer.p2310a;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b;
import com.ss.android.lark.mm.module.player.core.layer.C46613a;
import com.ss.android.lark.mm.module.player.core.layer.p2310a.AbstractC46617c;
import com.ss.android.lark.mm.module.player.core.layer.p2312c.AbstractC46626a;
import com.ss.android.videoshop.p3194a.C64087a;
import com.ss.android.videoshop.p3195b.C64116b;
import com.ss.android.videoshop.p3196c.AbstractC64123g;
import com.ss.android.videoshop.p3197d.AbstractC64152a;
import com.ss.android.videoshop.p3197d.AbstractC64158b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.player.core.layer.a.a */
public class C46614a extends AbstractC46619b implements AbstractC46617c.AbstractC46618a {

    /* renamed from: c */
    private View$OnClickListenerC46616b f117313c;

    /* renamed from: d */
    private ArrayList<Integer> f117314d = new ArrayList<Integer>() {
        /* class com.ss.android.lark.mm.module.player.core.layer.p2310a.C46614a.C466151 */

        {
            add(115);
            add(100);
            add(209);
        }
    };

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2310a.AbstractC46617c.AbstractC46618a
    /* renamed from: f */
    public AbstractC64152a mo163788f() {
        return this;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: b */
    public int mo163783b() {
        return C46613a.f117299b;
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a
    /* renamed from: c */
    public ArrayList<Integer> mo163786c() {
        return this.f117314d;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2310a.AbstractC46617c.AbstractC46618a
    /* renamed from: g */
    public AbstractC46626a mo163789g() {
        return this.f117320a;
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    public ViewGroup bi_() {
        AbstractC64158b v = mo222221v();
        if (v != null) {
            return v.mo222237b();
        }
        return null;
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.p2310a.AbstractC46617c.AbstractC46618a
    /* renamed from: e */
    public void mo163787e() {
        mo222202a(new C64087a(207));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo163790h() {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163792a();
            m184401j();
        }
    }

    /* renamed from: j */
    private void m184401j() {
        C64116b z;
        Bundle d;
        if (this.f117313c != null && (z = mo222225z()) != null && (d = z.mo221937d()) != null) {
            this.f117313c.mo163795a(d);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo163791i() {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163798b();
        }
        mo163789g().mo163725a().mo163699q();
    }

    /* renamed from: a */
    public void mo163778a(float f) {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163793a(f);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: b */
    public void mo163784b(boolean z) {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163799b(z);
        }
    }

    public C46614a(AbstractC46626a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: a */
    public void mo163780a(HightlightTimeLine hightlightTimeLine) {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163796a(hightlightTimeLine);
        }
    }

    @Override // com.ss.android.lark.mm.module.player.core.layer.AbstractC46619b
    /* renamed from: a */
    public void mo163781a(boolean z) {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163797a(z);
        }
    }

    @Override // com.ss.android.videoshop.p3197d.AbstractC64152a, com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public boolean mo163782a(AbstractC64123g gVar) {
        int b = gVar.mo221968b();
        if (b == 100) {
            mo163791i();
        } else if (b == 115) {
            mo163790h();
        } else if (!(b != 209 || this.f117320a == null || this.f117320a.mo163726b() == null)) {
            mo163778a(this.f117320a.mo163726b().mo163826b());
        }
        return super.mo163782a(gVar);
    }

    /* renamed from: a */
    public void mo163779a(int i, int i2) {
        View$OnClickListenerC46616b bVar = this.f117313c;
        if (bVar != null) {
            bVar.mo163794a((long) i, (long) i2);
        }
    }

    @Override // com.ss.android.videoshop.p3197d.p3198a.AbstractC64153a
    /* renamed from: a */
    public List<Pair<View, RelativeLayout.LayoutParams>> mo163777a(Context context, LayoutInflater layoutInflater) {
        if (context == null || layoutInflater == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (this.f117313c == null) {
            View$OnClickListenerC46616b bVar = new View$OnClickListenerC46616b(context);
            this.f117313c = bVar;
            bVar.setCallback(this);
            m184401j();
        }
        return Collections.singletonList(new Pair(mo163802a(context, this.f117313c), layoutParams));
    }
}
