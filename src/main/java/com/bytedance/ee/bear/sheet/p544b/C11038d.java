package com.bytedance.ee.bear.sheet.p544b;

import android.graphics.RectF;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.document.onboarding.C6042c;
import com.bytedance.ee.bear.document.onboarding.OnBoardingData;
import com.bytedance.ee.bear.onboarding.export.mission.OnBoardingListener;
import com.bytedance.ee.bear.onboarding.export.p516a.p517a.C10390c;
import com.bytedance.ee.bear.onboarding.export.ui.FlowStyleHollowShape;
import com.bytedance.ee.bear.sheet.inputbar.toolbar.ToolbarItemEnum;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.b.d */
public class C11038d extends AbstractC11035a {
    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ void m45952g() {
    }

    @Override // com.bytedance.ee.bear.onboarding.export.p516a.AbstractC10397d
    /* renamed from: b */
    public String mo21352b() {
        return "mobile_sheet_cardMode_toolbarEntry";
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.document.onboarding.AbstractC6041b
    /* renamed from: a */
    public boolean mo21351a(C6042c cVar, OnBoardingData onBoardingData) {
        FragmentActivity d = cVar.mo39612d();
        View findViewById = cVar.mo24403c().findViewById(R.id.sheet_edit_toolbar);
        RecyclerView recyclerView = (RecyclerView) cVar.mo24403c().findViewById(R.id.toolbar_items_rv);
        if (recyclerView == null) {
            return false;
        }
        View findViewWithTag = recyclerView.findViewWithTag(ToolbarItemEnum.editRowInCard.name());
        if (findViewById == null || findViewWithTag == null || mo42113f()) {
            return false;
        }
        recyclerView.postDelayed(new Runnable(findViewById, findViewWithTag, d, cVar) {
            /* class com.bytedance.ee.bear.sheet.p544b.$$Lambda$d$V2MErX6elG8ORyVFUZBWqJmBF10 */
            public final /* synthetic */ View f$0;
            public final /* synthetic */ View f$1;
            public final /* synthetic */ FragmentActivity f$2;
            public final /* synthetic */ C6042c f$3;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final void run() {
                C11038d.m45951a(this.f$0, this.f$1, this.f$2, this.f$3);
            }
        }, 200);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m45951a(View view, View view2, FragmentActivity fragmentActivity, C6042c cVar) {
        RectF a = C13749l.m55743a(view, 0, 0, 0, 0);
        RectF a2 = C13749l.m55743a(view2, 0, 0, 0, 0);
        a2.top = a.top;
        a2.bottom = a.bottom;
        C10390c cVar2 = new C10390c(fragmentActivity.getString(R.string.CreationMobile_Sheets_CardViewTitle), true, a2);
        cVar2.mo39561a(fragmentActivity.getString(R.string.CreationMobile_Sheets_CardViewText));
        cVar2.mo39560a(FlowStyleHollowShape.CustomRadius);
        cVar2.mo39563a(0);
        cVar2.mo39559a($$Lambda$d$k4BLIDC4H2WpICaIg6ml0ZhdZmM.INSTANCE);
        cVar2.mo39550a(view2);
        cVar.mo39604a(fragmentActivity.getWindow(), cVar2, (OnBoardingListener) null);
    }
}
