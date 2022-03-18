package com.ss.android.lark.feed.app.view;

import android.content.Context;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.ss.android.lark.feed.app.binder.C37414l;
import com.ss.android.lark.feed.app.entity.IBadgeable;
import com.ss.android.lark.widget.tab.C59204a;

/* renamed from: com.ss.android.lark.feed.app.view.a */
public class C37961a extends C59204a<LKUIBadgeView, Integer> {

    /* renamed from: a */
    public int f97434a;

    /* renamed from: b */
    public boolean f97435b;

    /* renamed from: c */
    IBadgeable f97436c = new IBadgeable() {
        /* class com.ss.android.lark.feed.app.view.C37961a.C379621 */

        @Override // com.ss.android.lark.feed.app.entity.IBadgeable
        public int getBadgeCount() {
            return C37961a.this.f97434a;
        }

        @Override // com.ss.android.lark.feed.app.entity.IBadgeable
        public boolean isRemind() {
            return C37961a.this.f97435b;
        }
    };

    /* renamed from: f */
    private boolean f97437f = true;

    /* renamed from: a */
    public void mo139017a() {
        mo31307a(Integer.valueOf(this.f97434a));
    }

    /* renamed from: a */
    public void mo139019a(boolean z) {
        this.f97437f = z;
    }

    public C37961a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.tab.C59204a
    /* renamed from: a */
    public void mo31305a(Context context) {
        super.mo31305a(context);
        this.f147019e = new LKUIBadgeView(context);
        ((LKUIBadgeView) this.f147019e).mo89316a(12.0f);
    }

    /* renamed from: a */
    public void mo31307a(Integer num) {
        int i;
        super.mo31307a((Object) num);
        int intValue = num.intValue();
        this.f97434a = intValue;
        if (intValue > 0) {
            this.f97435b = true;
        } else {
            this.f97435b = false;
        }
        C37414l.C37415a a = C37414l.m147240a(this.f97436c, false, false);
        if (this.f97435b) {
            ((LKUIBadgeView) mo201282b()).setVisibility(a.mo137306d());
        } else {
            LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) mo201282b();
            if (this.f97437f) {
                i = a.mo137306d();
            } else {
                i = 8;
            }
            lKUIBadgeView.setVisibility(i);
        }
        if (a.mo137306d() == 0) {
            ((LKUIBadgeView) mo201282b()).mo89319a(a.mo137304c()).mo89317a(a.mo137302b()).mo89322b(a.mo137298a()).mo89320a();
        }
    }
}
