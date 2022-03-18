package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.c */
public class C27792c implements AbstractC27796g {

    /* renamed from: a */
    private Context f69438a;

    /* renamed from: b */
    private String f69439b;

    /* renamed from: c */
    private ImageView f69440c;

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: a */
    public int mo99182a() {
        return 3;
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: b */
    public View mo99183b() {
        return this.f69440c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f69438a);
        this.f69440c = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.p1273a.$$Lambda$c$PMOJgBEjxEjuU41PjY4plTK4uNI */

            public final void onClick(View view) {
                C27792c.lambda$PMOJgBEjxEjuU41PjY4plTK4uNI(C27792c.this, view);
            }
        });
        this.f69440c.setImageResource(R.drawable.ud_icon_find_app_outlined);
        return this.f69440c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101582a(View view) {
        if (this.f69439b != null) {
            C28184h.m103250d("Workplace_Page", "click app directory，url:" + this.f69439b);
            if (this.f69439b.startsWith("http")) {
                C27548m.m100547m().mo98222f().mo98206c(this.f69438a, this.f69439b);
            } else {
                C27548m.m100547m().mo98222f().mo98200a(this.f69438a, this.f69439b, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            }
            C27710b.m101280c();
            C27710b.m101287d();
            C27710b.m101283c("appdirectory", "openplatform_ecosystem_application_menu_view");
        }
    }

    public C27792c(Context context, String str) {
        this.f69438a = context;
        this.f69439b = str;
    }
}
