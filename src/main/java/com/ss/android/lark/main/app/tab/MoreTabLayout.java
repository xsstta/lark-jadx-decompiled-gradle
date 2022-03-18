package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.larksuite.component.ui.imageview.LKUIBadgeView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.main.app.tab.NavigationTab;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.tab.C59204a;
import com.ss.android.lark.widget.tab.MainTabItemView;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/main/app/tab/MoreTabLayout;", "Lcom/ss/android/lark/widget/tab/MainTabItemView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mNavRedDotListener", "Lcom/ss/android/lark/main/app/tab/NavigationTab$NavRedDotListener;", "getNavRedDotListener", "MoreLayoutRedDot", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.i */
public final class MoreTabLayout extends MainTabItemView {

    /* renamed from: a */
    private NavigationTab.AbstractC44342a f112549a;

    public final NavigationTab.AbstractC44342a getNavRedDotListener() {
        return this.f112549a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/main/app/tab/MoreTabLayout$MoreLayoutRedDot;", "Lcom/ss/android/lark/widget/tab/RedDotView;", "Lcom/larksuite/component/ui/imageview/LKUIBadgeView;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mBadgeCount", "initView", "", "show", "count", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.i$a */
    private static final class MoreLayoutRedDot extends C59204a<LKUIBadgeView, Integer> {

        /* renamed from: a */
        private int f112551a;

        public MoreLayoutRedDot(Context context) {
            super(context);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.lark.widget.tab.C59204a
        /* renamed from: a */
        public /* synthetic */ void mo31307a(Integer num) {
            mo157610a(num.intValue());
        }

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.widget.tab.C59204a
        /* renamed from: a */
        public void mo31305a(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            super.mo31305a(context);
            LKUIBadgeView lKUIBadgeView = new LKUIBadgeView(context);
            lKUIBadgeView.mo89316a(12.0f);
            this.f147019e = lKUIBadgeView;
        }

        /* renamed from: a */
        public void mo157610a(int i) {
            int i2;
            LKUIBadgeView b;
            LKUIBadgeView a;
            LKUIBadgeView a2;
            boolean z;
            LKUIBadgeView lKUIBadgeView;
            LKUIBadgeView lKUIBadgeView2;
            super.mo31307a(Integer.valueOf(i));
            int i3 = this.f112551a;
            if (i3 == i) {
                if (!(i3 == 0 && (lKUIBadgeView2 = (LKUIBadgeView) mo201282b()) != null && lKUIBadgeView2.getVisibility() == 8) && (this.f112551a == 0 || (lKUIBadgeView = (LKUIBadgeView) mo201282b()) == null || lKUIBadgeView.getVisibility() != 0)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return;
                }
            }
            this.f112551a = i;
            if (i == 0) {
                LKUIBadgeView lKUIBadgeView3 = (LKUIBadgeView) mo201282b();
                if (lKUIBadgeView3 != null) {
                    lKUIBadgeView3.setVisibility(8);
                    return;
                }
                return;
            }
            String valueOf = String.valueOf(Math.abs(i));
            if (i < 0) {
                valueOf = null;
                i2 = R.drawable.badge_orange_bg_no_count_stroke_desktop;
            } else if (i < 10) {
                i2 = R.drawable.badge_orange_single_count_bg_no_stroke;
            } else if (i < 999) {
                i2 = R.drawable.badge_orange_multi_count_bg_no_stroke;
            } else {
                valueOf = null;
                i2 = R.drawable.badge_orange_bg_etc_count;
            }
            LKUIBadgeView lKUIBadgeView4 = (LKUIBadgeView) mo201282b();
            if (!(lKUIBadgeView4 == null || (b = lKUIBadgeView4.mo89322b(i2)) == null || (a = b.mo89319a(valueOf)) == null || (a2 = a.mo89317a(-1)) == null)) {
                a2.mo89320a();
            }
            LKUIBadgeView lKUIBadgeView5 = (LKUIBadgeView) mo201282b();
            if (lKUIBadgeView5 != null) {
                lKUIBadgeView5.setVisibility(0);
            }
        }
    }

    public MoreTabLayout(Context context) {
        super(context);
        String str;
        Drawable drawable;
        Drawable drawable2 = null;
        if (context != null) {
            str = context.getString(R.string.Lark_Legacy_NavigationMore);
        } else {
            str = null;
        }
        setTabTitle(str);
        if (context != null) {
            drawable = context.getDrawable(R.drawable.ud_icon_tab_more_colorful);
        } else {
            drawable = null;
        }
        drawable2 = context != null ? context.getDrawable(R.drawable.ud_icon_tab_more_colorful) : drawable2;
        if (drawable2 != null) {
            drawable2.mutate();
        }
        if (drawable2 != null) {
            drawable2.setTint(UIHelper.getColor(R.color.icon_n3));
        }
        mo201234a(drawable2, drawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, UIUtils.dp2px(getContext(), (float) 65));
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setRedDotView(new MoreLayoutRedDot(context));
        this.f112549a = new NavigationTab.AbstractC44342a(this) {
            /* class com.ss.android.lark.main.app.tab.MoreTabLayout.C443621 */

            /* renamed from: a */
            final /* synthetic */ MoreTabLayout f112550a;

            {
                this.f112550a = r1;
            }

            @Override // com.ss.android.lark.main.app.tab.NavigationTab.AbstractC44342a
            /* renamed from: a */
            public final void mo157509a(int i) {
                ((MoreLayoutRedDot) this.f112550a.getRedDotView()).mo157610a(i);
            }
        };
        if (getParent() != null) {
            ViewParent parent = getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        setVisibility(0);
    }
}
