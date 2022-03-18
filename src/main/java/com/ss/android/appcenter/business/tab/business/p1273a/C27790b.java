package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appsort.AppSortActivity;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a;
import com.ss.android.appcenter.common.util.C28184h;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.b */
public class C27790b implements AbstractC27796g {

    /* renamed from: a */
    public Context f69435a;

    /* renamed from: b */
    private ImageView f69436b;

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: a */
    public int mo99182a() {
        return 4;
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: b */
    public View mo99183b() {
        return this.f69436b;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f69435a);
        this.f69436b = imageView;
        imageView.setOnClickListener(new AbstractView$OnClickListenerC28143a() {
            /* class com.ss.android.appcenter.business.tab.business.p1273a.C27790b.C277911 */

            /* access modifiers changed from: protected */
            @Override // com.ss.android.appcenter.common.base.AbstractView$OnClickListenerC28143a
            /* renamed from: a */
            public void mo98319a(View view) {
                C28184h.m103250d("Workplace_Page", "click title setting");
                AppSortActivity.m101111a(C27790b.this.f69435a);
                C27710b.m101292e();
                C27710b.m101283c("setting", "openplatform_workspace_setting_page_view");
            }
        });
        this.f69436b.setImageResource(R.drawable.ud_icon_setting_outlined);
        return this.f69436b;
    }

    public C27790b(Context context) {
        this.f69435a = context;
    }
}
