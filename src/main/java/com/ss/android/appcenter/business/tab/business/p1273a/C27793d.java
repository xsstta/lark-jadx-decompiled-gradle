package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.Priority;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.component.dynamicresources.DynamicResourcesFacade;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.d */
public class C27793d implements AbstractC27796g {

    /* renamed from: a */
    private Context f69441a;

    /* renamed from: b */
    private String f69442b;

    /* renamed from: c */
    private String f69443c;

    /* renamed from: d */
    private ImageView f69444d;

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: a */
    public int mo99182a() {
        return 5;
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: b */
    public View mo99183b() {
        return this.f69444d;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f69441a);
        this.f69444d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.p1273a.$$Lambda$d$vranwPrBxuQCsDevxCBxMwbJ_E */

            public final void onClick(View view) {
                C27793d.m270202lambda$vranwPrBxuQCsDevxCBxMwbJ_E(C27793d.this, view);
            }
        });
        ((C2124f) ((C2124f) ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9141a(this.f69444d).mo10415a(this.f69443c).mo11157n()).mo11123a(R.color.transparent)).mo11143c(R.color.transparent)).mo11126a(Priority.IMMEDIATE)).mo11144c(C28209p.m103291a(24.0f), C28209p.m103291a(24.0f))).mo10399a(this.f69444d);
        if (DynamicResourcesFacade.m88635b((int) R.color.suite_skin_vi_content_color)) {
            this.f69444d.setColorFilter(ContextCompat.getColor(this.f69441a, R.color.suite_skin_vi_content_color));
        } else {
            this.f69444d.setColorFilter(ContextCompat.getColor(this.f69441a, R.color.icon_n1));
        }
        return this.f69444d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101585a(View view) {
        if (this.f69442b != null) {
            C28184h.m103250d("Workplace_Template_Page", "click custom button，url:" + this.f69442b);
            if (this.f69442b.startsWith("http")) {
                C27548m.m100547m().mo98222f().mo98206c(this.f69441a, this.f69442b);
            } else {
                C27548m.m100547m().mo98222f().mo98200a(this.f69441a, this.f69442b, CommonCode.StatusCode.API_CLIENT_EXPIRED);
            }
            C27710b.m101283c("self-defined", "none");
        }
    }

    public C27793d(Context context, String str, String str2) {
        this.f69441a = context;
        this.f69442b = str;
        this.f69443c = str2;
    }
}
