package com.bytedance.ee.bear.templates.p553b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1144ai;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.ee.bear.templates.AbstractC11437a;
import com.bytedance.ee.bear.templates.p552a.AbstractC11438a;
import com.bytedance.ee.bear.templates.p554c.AbstractC11453a;
import com.bytedance.ee.bear.templates.p554c.AbstractC11454b;
import com.bytedance.ee.bear.templates.preview.announce.AnnounceTemplateViewModel;
import com.bytedance.ee.bear.templates.preview.group.TemplateSelectView;
import com.bytedance.ee.bear.templates.recommend.NewRecommendTemplateFragment;
import com.larksuite.suite.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.ee.bear.templates.b.a */
public class C11439a implements AbstractC11438a {
    @Override // com.bytedance.ee.bear.templates.p552a.AbstractC11438a
    /* renamed from: a */
    public AbstractC11437a mo43931a(ViewModelStoreOwner viewModelStoreOwner) {
        return (AbstractC11437a) new C1144ai(viewModelStoreOwner).mo6005a(AnnounceTemplateViewModel.class);
    }

    @Override // com.bytedance.ee.bear.templates.p552a.AbstractC11438a
    /* renamed from: b */
    public void mo43934b(Activity activity) {
        View findViewById;
        if (activity != null && (findViewById = activity.findViewById(R.id.template_select)) != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // com.bytedance.ee.bear.templates.p552a.AbstractC11438a
    /* renamed from: a */
    public void mo43933a(Activity activity) {
        View findViewById;
        if (activity != null && (findViewById = activity.findViewById(R.id.template_select)) != null) {
            findViewById.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Unit m47606a(AbstractC11453a aVar, String str) {
        aVar.mo24887a(str);
        return Unit.INSTANCE;
    }

    @Override // com.bytedance.ee.bear.templates.p552a.AbstractC11438a
    /* renamed from: a */
    public AbstractC11454b mo43932a(Activity activity, ViewGroup viewGroup, String str, AbstractC11453a aVar) {
        return TemplateSelectView.f31171b.mo44488a(activity, viewGroup, str, new Function1() {
            /* class com.bytedance.ee.bear.templates.p553b.$$Lambda$a$7QVmYBHRZmC8eros4L0nALJ033Q */

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C11439a.lambda$7QVmYBHRZmC8eros4L0nALJ033Q(AbstractC11453a.this, (String) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.templates.p552a.AbstractC11438a
    /* renamed from: a */
    public Fragment mo43930a(Context context, String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3) {
        return NewRecommendTemplateFragment.m48170a(context, str, str2, str3, bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
    }
}
