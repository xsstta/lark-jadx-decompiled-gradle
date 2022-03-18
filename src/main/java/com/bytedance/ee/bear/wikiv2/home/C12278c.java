package com.bytedance.ee.bear.wikiv2.home;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.list.homepage.BaseHomeFragment;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.bear.wikiv2.home.recent.C12289a;
import com.bytedance.ee.bear.wikiv2.report.WikiReportV2;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.c */
public class C12278c extends BaseHomeFragment implements AbstractC5226b {

    /* renamed from: h */
    private C12289a f32973h;

    /* renamed from: i */
    private CommonCreateButton f32974i;

    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment
    /* renamed from: p */
    public int mo33065p() {
        return R.layout.wiki_home_fragment;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: d */
    public void mo30115d() {
        super.mo30115d();
        WikiReportV2.m50901a();
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b
    /* renamed from: a */
    public void mo21073a() {
        C13479a.m54764b("WikiHomeFragment", "loadData");
        C12289a aVar = this.f32973h;
        if (aVar != null) {
            aVar.mo33133a();
        }
    }

    /* renamed from: r */
    private void m51117r() {
        CommonCreateButton commonCreateButton = (CommonCreateButton) mo30111b(R.id.common_create_button);
        this.f32974i = commonCreateButton;
        commonCreateButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.wikiv2.home.C12278c.C122791 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C12287f.m51166a(ar.m20936a(), C12278c.this.getActivity());
            }
        });
    }

    /* renamed from: s */
    private void m51118s() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WikiHomeViewModel.get(activity).getBannerList().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.wikiv2.home.$$Lambda$c$7u9dr6naAy1PpWOuOFGwU35hA9Q */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C12278c.this.m51116a((C12278c) ((List) obj));
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment, com.bytedance.ee.bear.facade.common.p380a.C7663b
    public void x_() {
        super.x_();
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20220a("ccm_wiki_home");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment
    /* renamed from: o */
    public void mo33064o() {
        if (this.f22830e != null && this.f22829d != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) this.f22829d).getLayoutParams();
            int titleBarHeight = this.f22832g.getTitleBarHeight() - marginLayoutParams.height;
            if (titleBarHeight > 0) {
                marginLayoutParams.topMargin = titleBarHeight;
                ((ViewGroup) this.f22829d).setLayoutParams(marginLayoutParams);
            }
            this.f22830e.setMinimumHeight(this.f22832g.getTitleBarHeight());
        }
    }

    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment, com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.p380a.C7662a, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m51116a(List list) {
        boolean z;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.f32974i.setEnabled(z);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment, com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        m51117r();
        m51118s();
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20221a("ccm_wiki_home", null, getContext(), null);
    }

    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment, com.bytedance.ee.bear.list.homepage.AbstractC8463b
    /* renamed from: a */
    public void mo30959a(int i, int i2) {
        super.mo30959a(i, i2);
    }

    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment
    /* renamed from: a */
    public AbstractC8509a mo33060a(C7662a aVar, Context context, C10917c cVar, AppBarLayout appBarLayout) {
        C12289a aVar2 = new C12289a(aVar, context, cVar, appBarLayout);
        this.f32973h = aVar2;
        return aVar2;
    }
}
