package com.ss.android.lark.mm.module.detail.banner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.larksuite.component.universe_design.notice.UDNotice;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45859k;

/* renamed from: com.ss.android.lark.mm.module.detail.banner.a */
public class C45981a {

    /* renamed from: a */
    public View f115873a;

    /* renamed from: b */
    private Context f115874b;

    /* renamed from: c */
    private UDNotice f115875c;

    /* renamed from: a */
    public UDNotice mo161458a() {
        return this.f115875c;
    }

    /* renamed from: com.ss.android.lark.mm.module.detail.banner.a$a */
    public static class C45984a {

        /* renamed from: a */
        public String f115879a;

        /* renamed from: b */
        public boolean f115880b;

        /* renamed from: c */
        public UDNotice.Type f115881c;

        /* renamed from: d */
        private Context f115882d;

        /* renamed from: a */
        public C45981a mo161467a() {
            return new C45981a(this.f115882d, this);
        }

        /* renamed from: a */
        public C45984a mo161465a(UDNotice.Type type) {
            this.f115881c = type;
            return this;
        }

        /* renamed from: a */
        public C45984a mo161466a(boolean z) {
            this.f115880b = z;
            return this;
        }

        public C45984a(Context context, String str) {
            this.f115879a = str;
            this.f115882d = context;
        }
    }

    /* renamed from: b */
    public void mo161462b() {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.detail.banner.$$Lambda$a$pwi_VGgyQTW1A1rTAqY_j0Qb6U8 */

            public final void run() {
                C45981a.this.m182184c();
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m182184c() {
        ViewParent parent = this.f115873a.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(this.f115873a);
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo161460a(UDNotice.Type type) {
        UDNotice uDNotice = this.f115875c;
        if (uDNotice != null) {
            uDNotice.setType(type);
        }
    }

    /* renamed from: a */
    public void mo161459a(final ViewGroup viewGroup) {
        C45859k.m181685a(new Runnable() {
            /* class com.ss.android.lark.mm.module.detail.banner.C45981a.RunnableC459832 */

            public void run() {
                ViewParent parent = C45981a.this.f115873a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(C45981a.this.f115873a);
                }
                viewGroup.addView(C45981a.this.f115873a);
                viewGroup.setVisibility(0);
            }
        });
    }

    /* renamed from: a */
    public void mo161461a(String str) {
        UDNotice uDNotice = this.f115875c;
        if (uDNotice != null) {
            uDNotice.setText(str);
        }
    }

    private C45981a(Context context, C45984a aVar) {
        String str = aVar.f115879a;
        boolean z = aVar.f115880b;
        UDNotice.Type type = aVar.f115881c;
        this.f115874b = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.mm_layout_common_banner, (ViewGroup) null);
        this.f115873a = inflate;
        UDNotice uDNotice = (UDNotice) inflate.findViewById(R.id.bannerNotice);
        this.f115875c = uDNotice;
        uDNotice.setType(type);
        this.f115875c.setText(str);
        this.f115875c.mo91032b(z);
        this.f115875c.setIconButtonListener(new View.OnClickListener() {
            /* class com.ss.android.lark.mm.module.detail.banner.C45981a.View$OnClickListenerC459821 */

            public void onClick(View view) {
                ViewParent parent = C45981a.this.f115873a.getParent();
                if (parent instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView(C45981a.this.f115873a);
                    viewGroup.setVisibility(8);
                }
            }
        });
    }
}
