package com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.color.UDColorUtils;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;

/* renamed from: com.ss.android.appcenter.business.tab.business.view.itemmenu.c.a */
public class C27921a implements AbstractC27922b {

    /* renamed from: a */
    public View.OnClickListener f69815a;

    /* renamed from: b */
    private int f69816b;

    /* renamed from: c */
    private int f69817c;

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: a */
    public boolean mo99546a() {
        return true;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: b */
    public View.OnClickListener mo99547b() {
        return this.f69815a;
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: c */
    public String mo99548c(Context context) {
        return context.getString(this.f69817c);
    }

    /* renamed from: a */
    public static AbstractC27922b m101923a(Context context) {
        return new C27921a(context, R.drawable.ud_icon_no_outlined, R.string.OpenPlatform_AppCenter_RemoveFrqBttn, R.string.OpenPlatform_Workplace_RecBlcRemovalNull);
    }

    /* renamed from: b */
    public static AbstractC27922b m101925b(Context context) {
        return new C27921a(context, R.drawable.ud_icon_navigate_outlined, R.string.OpenPlatform_AppCenter_SortAppBttn, R.string.OpenPlatform_Workplace_RecBlcOrderChangeNull);
    }

    @Override // com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.AbstractC27922b
    /* renamed from: a */
    public void mo99545a(LKUIRoundedImageView2 lKUIRoundedImageView2) {
        int i;
        Context context = lKUIRoundedImageView2.getContext();
        if (mo99546a()) {
            i = R.color.icon_disable;
        } else {
            i = R.color.icon_n2;
        }
        lKUIRoundedImageView2.setImageTintList(UDColorUtils.getColorStateList(context, i));
        lKUIRoundedImageView2.setImageTintMode(PorterDuff.Mode.SRC_ATOP);
        lKUIRoundedImageView2.setImageResource(this.f69816b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m101924a(Context context, int i, View view) {
        UDToast.show(context, context.getString(i), (int) R.drawable.appcenter_show_toast_err);
    }

    public C27921a(Context context, int i, int i2, int i3) {
        this.f69816b = i;
        this.f69817c = i2;
        this.f69815a = new View.OnClickListener(context, i3) {
            /* class com.ss.android.appcenter.business.tab.business.view.itemmenu.p1279c.$$Lambda$a$lN263bX8G5hwsnRPpdcRel5ZJBg */
            public final /* synthetic */ Context f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            public final void onClick(View view) {
                C27921a.lambda$lN263bX8G5hwsnRPpdcRel5ZJBg(this.f$0, this.f$1, view);
            }
        };
    }
}
