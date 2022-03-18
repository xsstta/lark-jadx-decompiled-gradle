package com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a;
import com.bytedance.ee.bear.widgets.C11824c;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.g */
public class C10060g implements C10045a.AbstractC10048b {

    /* renamed from: a */
    private Context f27169a;

    /* renamed from: b */
    private View f27170b;

    /* renamed from: c */
    private boolean f27171c;

    /* renamed from: d */
    private UDSwitch f27172d;

    /* renamed from: e */
    private RelativeLayout f27173e;

    /* renamed from: f */
    private View f27174f;

    /* renamed from: g */
    private View f27175g;

    /* renamed from: h */
    private TextView f27176h;

    /* renamed from: i */
    private TextView f27177i;

    /* renamed from: j */
    private TextView f27178j;

    /* renamed from: k */
    private C11824c f27179k;

    /* renamed from: l */
    private TextView f27180l;

    /* renamed from: m */
    private C10045a.AbstractC10048b.AbstractC10049a f27181m;

    /* renamed from: n */
    private boolean f27182n;

    /* renamed from: o */
    private View f27183o;

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m41858c();
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b
    /* renamed from: a */
    public void mo38388a() {
        C11824c cVar = this.f27179k;
        if (cVar != null) {
            cVar.mo45304d();
        }
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b
    /* renamed from: b */
    public void mo38391b() {
        C11824c cVar = this.f27179k;
        if (cVar != null) {
            cVar.mo45303c();
        }
    }

    /* renamed from: c */
    private void m41858c() {
        this.f27179k = new C11824c(this.f27169a);
        this.f27173e = (RelativeLayout) this.f27170b.findViewById(R.id.show_password_container);
        this.f27174f = this.f27170b.findViewById(R.id.password_divider);
        this.f27175g = this.f27170b.findViewById(R.id.password_operation_container);
        this.f27180l = (TextView) this.f27170b.findViewById(R.id.tv_use_password);
        UDSwitch uDSwitch = (UDSwitch) this.f27170b.findViewById(R.id.enable_password_switch);
        this.f27172d = uDSwitch;
        uDSwitch.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$g$oAHrjFOtJ7t8wSqJtYpRGBqki8 */

            public final void onClick(View view) {
                C10060g.m269871lambda$oAHrjFOtJ7t8wSqJtYpRGBqki8(C10060g.this, view);
            }
        });
        View findViewById = this.f27170b.findViewById(R.id.rl_use_password);
        this.f27183o = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$g$j6JnH_rdbs4mpeIHXbjOcT_TY */

            public final void onClick(View view) {
                C10060g.m269870lambda$j6JnH_rdbs4mpeIHXbjOcT_TY(C10060g.this, view);
            }
        });
        TextView textView = (TextView) this.f27170b.findViewById(R.id.tv_need_password_description);
        this.f27178j = textView;
        if (this.f27182n) {
            textView.setText(R.string.Doc_Share_FolderCreatePasswordTip);
        } else {
            textView.setText(R.string.Doc_Share_CreatePasswordTip);
        }
        TextView textView2 = (TextView) this.f27170b.findViewById(R.id.tv_cur_share_status);
        this.f27177i = textView2;
        if (this.f27171c) {
            textView2.setVisibility(8);
        } else {
            textView2.setVisibility(0);
            this.f27177i.setText(R.string.Doc_Share_OrgOutsideNeedPasswordAccess);
        }
        ((TextView) this.f27170b.findViewById(R.id.tv_copy_link_and_password)).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$g$3uRmTDmkKKQspNz_645D0Q2yA1U */

            public final void onClick(View view) {
                C10060g.lambda$3uRmTDmkKKQspNz_645D0Q2yA1U(C10060g.this, view);
            }
        });
        this.f27176h = (TextView) this.f27170b.findViewById(R.id.tv_show_password);
        ((TextView) this.f27170b.findViewById(R.id.iv_reset_password)).setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.$$Lambda$g$efPwgzYxUA07f0bJvL7sV58QQgE */

            public final void onClick(View view) {
                C10060g.lambda$efPwgzYxUA07f0bJvL7sV58QQgE(C10060g.this, view);
            }
        });
    }

    /* renamed from: a */
    public void setViewDelegate(C10045a.AbstractC10048b.AbstractC10049a aVar) {
        this.f27181m = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m41856a(View view) {
        this.f27181m.mo38392a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m41857b(View view) {
        this.f27181m.mo38393a(this.f27169a);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m41860d(View view) {
        this.f27181m.mo38394a(this.f27172d.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m41859c(View view) {
        UDSwitch uDSwitch = this.f27172d;
        uDSwitch.setChecked(!uDSwitch.isChecked());
        this.f27181m.mo38394a(this.f27172d.isChecked());
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b
    /* renamed from: a */
    public void mo38389a(boolean z) {
        if (z) {
            this.f27178j.setVisibility(8);
            this.f27180l.setTextColor(this.f27169a.getResources().getColor(R.color.text_title));
            this.f27172d.setEnabled(true);
            this.f27183o.setEnabled(true);
            return;
        }
        this.f27178j.setVisibility(0);
        this.f27180l.setTextColor(this.f27169a.getResources().getColor(R.color.text_placeholder));
        this.f27172d.setEnabled(false);
        this.f27183o.setEnabled(false);
    }

    @Override // com.bytedance.ee.bear.middleground.permission.setting.linkshare.linkpassword.C10045a.AbstractC10048b
    /* renamed from: a */
    public void mo38390a(boolean z, String str) {
        if (z) {
            this.f27172d.setChecked(true);
            this.f27176h.setText(str);
            this.f27173e.setVisibility(0);
            this.f27174f.setVisibility(0);
            this.f27175g.setVisibility(0);
            return;
        }
        this.f27172d.setChecked(false);
        this.f27173e.setVisibility(8);
        this.f27174f.setVisibility(8);
        this.f27175g.setVisibility(8);
    }

    public C10060g(Context context, View view, boolean z, boolean z2) {
        this.f27169a = context;
        this.f27170b = view;
        this.f27171c = z;
        this.f27182n = z2;
    }
}
