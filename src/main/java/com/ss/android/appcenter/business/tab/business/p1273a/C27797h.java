package com.ss.android.appcenter.business.tab.business.p1273a;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.larksuite.framework.utils.al;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import com.ss.android.lark.maincore.ITitleController;

/* renamed from: com.ss.android.appcenter.business.tab.business.a.h */
public class C27797h implements AbstractC27796g {

    /* renamed from: a */
    private Context f69445a;

    /* renamed from: b */
    private ITitleController f69446b;

    /* renamed from: c */
    private ImageView f69447c;

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: a */
    public int mo99182a() {
        return 2;
    }

    @Override // com.ss.android.appcenter.business.tab.business.p1273a.AbstractC27796g
    /* renamed from: b */
    public View mo99183b() {
        return this.f69447c;
    }

    @Override // com.ss.android.lark.maincore.AbstractC44545b
    public View getContentView() {
        ImageView imageView = new ImageView(this.f69445a);
        this.f69447c = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.appcenter.business.tab.business.p1273a.$$Lambda$h$Lx7RxVq70pZZhjId1DexSYZnVo */

            public final void onClick(View view) {
                C27797h.m270203lambda$Lx7RxVq70pZZhjId1DexSYZnVo(C27797h.this, view);
            }
        });
        this.f69447c.setImageResource(R.drawable.ud_icon_search_outlined);
        return this.f69447c;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m101602a(View view) {
        if (this.f69446b != null) {
            C28184h.m103250d("Workplace_Page", "click title search");
            al.m95028a().mo93366a("key_param_appcenter_search_title", this.f69446b.mo99195c());
            C27548m.m100547m().mo98216a().mo98158a("", "key_param_appcenter_search_title", this.f69446b.mo99189a());
            C27710b.m101283c("search", "none");
        }
    }

    public C27797h(Context context, ITitleController iTitleController) {
        this.f69445a = context;
        this.f69446b = iTitleController;
    }
}
