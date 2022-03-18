package com.bytedance.ee.bear.sheet.p544b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.t */
public class C11054t extends AbstractC11035a {
    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m45999g() {
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_toolbar_intro";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View findViewById = cVar.mo24403c().findViewById(R.id.sheet_edit_toolbar);
        RecyclerView recyclerView = (RecyclerView) cVar.mo24403c().findViewById(R.id.toolbar_items_rv);
        if (findViewById == null || recyclerView == null || mo42113f()) {
            return false;
        }
        findViewById.postDelayed(new Runnable(d, findViewById, recyclerView, cVar) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$t$uKSCXoIqhaF4qQmZuXmfVlzLh9M */
            public final /* synthetic */ FragmentActivity f$1;
            public final /* synthetic */ View f$2;
            public final /* synthetic */ RecyclerView f$3;
            public final /* synthetic */ C6042c f$4;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
            }

            public final void run() {
                C11054t.this.m45998a(this.f$1, this.f$2, this.f$3, this.f$4);
            }
        }, 200);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m45998a(final FragmentActivity fragmentActivity, View view, final RecyclerView recyclerView, final C6042c cVar) {
        final C10390c cVar2 = new C10390c(fragmentActivity.getString(R.string.CreationMobile_Tips_Title), true, view);
        cVar2.mo39561a(fragmentActivity.getString(R.string.CreationMobile_Tips_Bodytext));
        cVar2.mo39560a(FlowStyleHollowShape.CustomRadius);
        cVar2.mo39563a(0);
        cVar2.mo39559a($$Lambda$t$bormsdhdI4XGTyJpQHv_vY9HBA.INSTANCE);
        cVar2.mo39550a(view);
        if (recyclerView.getChildCount() > 6) {
            recyclerView.smoothScrollToPosition(recyclerView.getChildCount() - 1);
            recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                /* class com.bytedance.ee.bear.sheet.p544b.C11054t.C110551 */

                /* renamed from: a */
                boolean f29704a;

                /* renamed from: b */
                boolean f29705b;

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    if (i != 0) {
                        return;
                    }
                    if (!this.f29704a) {
                        this.f29704a = true;
                        recyclerView.smoothScrollToPosition(0);
                    } else if (!this.f29705b) {
                        this.f29705b = true;
                        cVar.mo39604a(fragmentActivity.getWindow(), cVar2, (OnBoardingListener) null);
                        recyclerView.removeOnScrollListener(this);
                    }
                }
            });
            return;
        }
        cVar.mo39604a(fragmentActivity.getWindow(), cVar2, (OnBoardingListener) null);
    }
}
