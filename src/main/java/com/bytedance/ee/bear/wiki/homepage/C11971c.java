package com.bytedance.ee.bear.wiki.homepage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.contract.ar;
import com.bytedance.ee.bear.contract.p278b.AbstractC5115a;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.facade.common.p380a.C7662a;
import com.bytedance.ee.bear.list.homepage.BaseHomeFragment;
import com.bytedance.ee.bear.list.homepage.widget.AbstractC8509a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.bear.widgets.button.CommonCreateButton;
import com.bytedance.ee.bear.wiki.homepage.recent.C11976a;
import com.bytedance.ee.log.C13479a;
import com.google.android.material.appbar.AppBarLayout;
import com.larksuite.suite.R;
import java.util.List;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.homepage.c */
public class C11971c extends BaseHomeFragment implements AbstractC5226b {

    /* renamed from: h */
    private C11976a f32344h;

    /* renamed from: i */
    private CommonCreateButton f32345i;

    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment
    /* renamed from: p */
    public int mo33065p() {
        return R.layout.wiki_home_recent_fragment;
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b
    /* renamed from: a */
    public void mo21073a() {
        C13479a.m54764b("WikiHomeRecentFragment", "loadData");
        C11976a aVar = this.f32344h;
        if (aVar != null) {
            aVar.mo33133a();
        }
    }

    /* renamed from: r */
    private void m49578r() {
        CommonCreateButton commonCreateButton = (CommonCreateButton) mo30111b(R.id.common_create_button);
        this.f32345i = commonCreateButton;
        commonCreateButton.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
            /* class com.bytedance.ee.bear.wiki.homepage.C11971c.C119721 */

            /* access modifiers changed from: protected */
            @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
            /* renamed from: a */
            public void mo16698a(View view) {
                C11974e.m49588a(ar.m20936a(), C11971c.this.getActivity());
            }
        });
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment, com.bytedance.ee.bear.facade.common.p380a.C7663b
    public void x_() {
        super.x_();
        ((AbstractC5115a) KoinJavaComponent.m268610a(AbstractC5115a.class)).mo20220a("ccm_wiki_home");
    }

    /* renamed from: s */
    private void m49579s() {
        if (getActivity() != null) {
            ((C11973d) aj.m5366a(getActivity()).mo6005a(C11973d.class)).getBannerList().mo5923a(this, new AbstractC1178x() {
                /* class com.bytedance.ee.bear.wiki.homepage.$$Lambda$c$6l_qk3ozJHsKVZV9xBfoS8WfA */

                @Override // androidx.lifecycle.AbstractC1178x
                public final void onChanged(Object obj) {
                    C11971c.this.m49577a((C11971c) ((List) obj));
                }
            });
        }
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

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m49577a(List list) {
        boolean z;
        if (list == null || list.size() <= 0) {
            z = false;
        } else {
            z = true;
        }
        CommonCreateButton commonCreateButton = this.f32345i;
        if (commonCreateButton != null) {
            commonCreateButton.setEnabled(z);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.BaseHomeFragment, com.bytedance.ee.bear.facade.common.p380a.C7663b
    /* renamed from: b */
    public void mo30113b(Bundle bundle) {
        super.mo30113b(bundle);
        m49578r();
        m49579s();
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
        C11976a aVar2 = new C11976a(aVar, context, cVar, appBarLayout);
        this.f32344h = aVar2;
        return aVar2;
    }
}
