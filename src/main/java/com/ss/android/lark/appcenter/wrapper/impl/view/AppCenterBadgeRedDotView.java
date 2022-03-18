package com.ss.android.lark.appcenter.wrapper.impl.view;

import android.content.Context;
import android.view.View;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.ss.android.lark.widget.tab.C59204a;
import com.tt.refer.impl.business.p3427a.p3429b.C67873a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0014J\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/appcenter/wrapper/impl/view/AppCenterBadgeRedDotView;", "Lcom/ss/android/lark/widget/tab/RedDotView;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dotTextSizeSp", "", "remindCount", "initView", "", "show", "count", "(Ljava/lang/Integer;)V", "updateCount", "app-center_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.appcenter.wrapper.impl.view.a */
public final class AppCenterBadgeRedDotView extends C59204a<LKUIBadgeView, Integer> {

    /* renamed from: a */
    private final float f73006a = 12.0f;

    /* renamed from: b */
    private int f73007b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppCenterBadgeRedDotView(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.tab.C59204a
    /* renamed from: a */
    public void mo31305a(Context context) {
        this.f147019e = new LKUIBadgeView(context);
    }

    /* renamed from: a */
    public void mo31307a(Integer num) {
        int i;
        super.mo31307a((Object) num);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        m107233a(i);
    }

    /* renamed from: a */
    private final void m107233a(int i) {
        boolean z;
        this.f73007b = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        mo201283b(z);
        C67873a.C67874a a = C67873a.m264045a(i);
        LKUIBadgeView lKUIBadgeView = (LKUIBadgeView) mo201282b();
        if (a.f170941c) {
            View view = this.f147019e;
            Intrinsics.checkExpressionValueIsNotNull(view, "mContentView");
            ((LKUIBadgeView) view).setVisibility(0);
        } else {
            View view2 = this.f147019e;
            Intrinsics.checkExpressionValueIsNotNull(view2, "mContentView");
            ((LKUIBadgeView) view2).setVisibility(8);
        }
        if (a.f170941c) {
            lKUIBadgeView.mo89319a(a.f170942d).mo89317a(a.f170940b).mo89316a(this.f73006a).mo89322b(a.f170939a).mo89320a();
            lKUIBadgeView.invalidate();
        }
    }
}
