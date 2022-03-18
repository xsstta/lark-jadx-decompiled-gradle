package com.ss.android.lark.littleapp.view;

import android.content.Context;
import android.view.ViewGroup;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.ss.android.lark.widget.tab.C59204a;
import com.tt.refer.impl.business.p3427a.p3429b.C67873a;

/* renamed from: com.ss.android.lark.littleapp.view.b */
public class C41465b extends C59204a<LKUIBadgeView, Integer> {

    /* renamed from: a */
    private final float f105419a = 11.0f;

    /* renamed from: a */
    private void m164522a() {
        if (this.f147019e != null && ((LKUIBadgeView) this.f147019e).getParent() != null) {
            ViewGroup viewGroup = (ViewGroup) ((LKUIBadgeView) this.f147019e).getParent();
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            if (viewGroup.getParent() != null) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
        }
    }

    public C41465b(Context context) {
        super(context);
        this.f147019e = new LKUIBadgeView(context);
    }

    /* renamed from: a */
    public void mo31307a(Integer num) {
        super.mo31307a((Object) num);
        if (num == null) {
            num = 0;
        }
        m164523a(num.intValue());
    }

    /* renamed from: a */
    private void m164523a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        mo201283b(z);
        m164522a();
        C67873a.C67874a a = C67873a.m264045a(i);
        LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) mo201282b();
        if (a.f170941c) {
            ((LKUIBadgeView) this.f147019e).setVisibility(0);
        } else {
            ((LKUIBadgeView) this.f147019e).setVisibility(8);
        }
        if (a.f170941c) {
            lKUIBadgeView.mo89321b(a.f170943e).mo89319a(a.f170942d).mo89317a(a.f170940b).mo89316a(11.0f).mo89322b(a.f170939a).mo89320a();
            lKUIBadgeView.invalidate();
        }
    }
}
