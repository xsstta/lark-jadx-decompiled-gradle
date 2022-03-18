package com.bytedance.ee.bear.doc.p291b;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.document.model.toolbar.ToolbarPrimaryItemId;
import com.bytedance.ee.bear.document.onboarding.AbstractC6041b;
import com.bytedance.ee.bear.document.onboarding.C6039a;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10395e;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.doc.b.i */
public class C5330i extends AbstractC6041b {
    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: a */
    public String mo21350a() {
        return "doc";
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_doc_toolbarV2_insertTable";
    }

    /* renamed from: a */
    public void mo21357a(C6042c cVar, View view) {
        C6039a.m24495a().mo24393a(getClass());
        FragmentActivity d = cVar.mo39612d();
        C10395e eVar = new C10395e(d.getString(R.string.CreationMobile_Docs_InsertTable_Onboarding_Toast), view);
        eVar.mo39591b(5000);
        cVar.mo39611b(d.getWindow(), eVar, null);
        C13479a.m54764b("DocInsertTableMission", "DocInsertTableMission show done");
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        C13479a.m54764b("DocInsertTableMission", "show DocInsertTableMission");
        HorizontalOverScrollView horizontalOverScrollView = (HorizontalOverScrollView) cVar.mo24403c().findViewById(R.id.scroll_view);
        View findViewWithTag = cVar.mo24403c().findViewWithTag(ToolbarPrimaryItemId.insertTable.name());
        if (horizontalOverScrollView == null || findViewWithTag == null) {
            C6039a.m24495a().mo24394a(this);
            return false;
        }
        findViewWithTag.post(new Runnable(findViewWithTag, horizontalOverScrollView, cVar) {
            /* class com.bytedance.ee.bear.doc.p291b.$$Lambda$i$DrpLbwnFSxwIlXCcFDrKK8xbhJs */
            public final /* synthetic */ View f$1;
            public final /* synthetic */ HorizontalOverScrollView f$2;
            public final /* synthetic */ C6042c f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C5330i.this.m21765a(this.f$1, this.f$2, this.f$3);
            }
        });
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21765a(final View view, final HorizontalOverScrollView horizontalOverScrollView, final C6042c cVar) {
        if (view.getRight() > horizontalOverScrollView.getWidth()) {
            final int right = horizontalOverScrollView.getChildAt(0).getRight() - horizontalOverScrollView.getWidth();
            horizontalOverScrollView.smoothScrollTo(right, horizontalOverScrollView.getScrollY());
            horizontalOverScrollView.mo29917a(new HorizontalOverScrollView.AbstractC7602a() {
                /* class com.bytedance.ee.bear.doc.p291b.C5330i.C53311 */

                @Override // com.bytedance.ee.bear.edit.component.toolbar2.HorizontalOverScrollView.AbstractC7602a
                public void onScrollChanged(int i, int i2) {
                    if (right == i) {
                        C5330i.this.mo21357a(cVar, view);
                        horizontalOverScrollView.mo29918b(this);
                    }
                }
            });
            return;
        }
        mo21357a(cVar, view);
    }
}
