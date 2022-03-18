package com.ss.android.lark.main.app.tab;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.sdk.C53241h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0015\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/main/app/tab/DesktopNavigationTab;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mContext", "mDismissStamp", "", "mNavPopupWindow", "Landroid/widget/PopupWindow;", "mScrollView", "Landroid/widget/ScrollView;", "mSubTabNames", "", "", "mTabClickListener", "Landroid/view/View$OnClickListener;", "mTabContent", "Landroid/widget/LinearLayout;", "mTabItemClickListener", "Lcom/ss/android/lark/main/app/tab/OnTabItemClickListener;", "addTab", "", "T", "tabName", "contentView", "Landroid/view/View;", "hasTabViews", "", "setOnTabItemClickListener", "listener", "showNavPopupWindow", "view", "unMount", "Companion", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.main.app.tab.a */
public final class DesktopNavigationTab {

    /* renamed from: d */
    public static final Companion f112493d = new Companion(null);

    /* renamed from: a */
    public long f112494a = System.currentTimeMillis();

    /* renamed from: b */
    public PopupWindow f112495b;

    /* renamed from: c */
    public AbstractC44371p f112496c;

    /* renamed from: e */
    private final Context f112497e;

    /* renamed from: f */
    private final List<String> f112498f;

    /* renamed from: g */
    private ScrollView f112499g;

    /* renamed from: h */
    private LinearLayout f112500h;

    /* renamed from: i */
    private final View.OnClickListener f112501i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/main/app/tab/DesktopNavigationTab$Companion;", "", "()V", "NAV_WINDOW_MAX_HEIGHT", "", "NAV_WINDOW_WIDTH", "core_main_main_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onDismiss"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.a$c */
    public static final class C44356c implements PopupWindow.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ DesktopNavigationTab f112503a;

        C44356c(DesktopNavigationTab aVar) {
            this.f112503a = aVar;
        }

        public final void onDismiss() {
            this.f112503a.f112494a = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final boolean mo157539a() {
        return !this.f112498f.isEmpty();
    }

    /* renamed from: b */
    public final void mo157540b() {
        this.f112496c = null;
        this.f112498f.clear();
        LinearLayout linearLayout = this.f112500h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        ScrollView scrollView = this.f112499g;
        if (scrollView != null) {
            scrollView.removeAllViews();
        }
        PopupWindow popupWindow = this.f112495b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.f112495b = null;
        this.f112500h = null;
    }

    /* renamed from: a */
    public final void mo157537a(AbstractC44371p pVar) {
        Intrinsics.checkParameterIsNotNull(pVar, "listener");
        this.f112496c = pVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.main.app.tab.a$b */
    static final class View$OnClickListenerC44355b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopNavigationTab f112502a;

        View$OnClickListenerC44355b(DesktopNavigationTab aVar) {
            this.f112502a = aVar;
        }

        public final void onClick(View view) {
            AbstractC44371p pVar;
            Object tag = view.getTag(R.id.main_tab_sub_tab_tag);
            if (tag != null) {
                String str = (String) tag;
                if (!TextUtils.isEmpty(str) && (pVar = this.f112502a.f112496c) != null) {
                    pVar.mo157345a(str);
                }
                PopupWindow popupWindow = this.f112502a.f112495b;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public DesktopNavigationTab(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f112497e = context;
        this.f112498f = new ArrayList();
        this.f112501i = new View$OnClickListenerC44355b(this);
    }

    /* renamed from: a */
    public final void mo157536a(View view) {
        PopupWindow popupWindow;
        Intrinsics.checkParameterIsNotNull(view, "view");
        if (this.f112495b == null) {
            PopupWindow popupWindow2 = new PopupWindow(this.f112497e);
            this.f112495b = popupWindow2;
            if (popupWindow2 != null) {
                popupWindow2.setOutsideTouchable(true);
            }
            PopupWindow popupWindow3 = this.f112495b;
            if (popupWindow3 != null) {
                popupWindow3.setContentView(this.f112499g);
            }
            PopupWindow popupWindow4 = this.f112495b;
            if (popupWindow4 != null) {
                popupWindow4.setBackgroundDrawable(this.f112497e.getDrawable(R.drawable.desktop_shadow_bg));
            }
            PopupWindow popupWindow5 = this.f112495b;
            if (popupWindow5 != null) {
                popupWindow5.setOnDismissListener(new C44356c(this));
            }
        }
        PopupWindow popupWindow6 = this.f112495b;
        if (popupWindow6 == null) {
            Intrinsics.throwNpe();
        }
        if (popupWindow6.isShowing() || System.currentTimeMillis() - this.f112494a < ((long) ParticipantRepo.f117150c)) {
            PopupWindow popupWindow7 = this.f112495b;
            if (popupWindow7 != null) {
                popupWindow7.dismiss();
                return;
            }
            return;
        }
        if (this.f112498f.size() > 4 && (popupWindow = this.f112495b) != null) {
            popupWindow.setHeight(UIUtils.dp2px(this.f112497e, 230.0f));
        }
        PopupWindow popupWindow8 = this.f112495b;
        if (popupWindow8 != null) {
            popupWindow8.showAsDropDown(view, UIUtils.dp2px(this.f112497e, 50.0f), -UIUtils.dp2px(this.f112497e, 58.0f));
        }
    }

    /* renamed from: a */
    public final <T> void mo157538a(String str, View view) {
        Intrinsics.checkParameterIsNotNull(str, "tabName");
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        if (this.f112498f.contains(str)) {
            C53241h.m205900d("SubTab", "add sub tab failed, tab already exist; tabName = " + str);
            return;
        }
        this.f112498f.add(str);
        if (this.f112499g == null) {
            this.f112499g = new ScrollView(this.f112497e);
        }
        int dp2px = UIUtils.dp2px(this.f112497e, 5.0f);
        if (this.f112500h == null) {
            LinearLayout linearLayout = new LinearLayout(this.f112497e);
            this.f112500h = linearLayout;
            if (linearLayout != null) {
                linearLayout.setPadding(0, dp2px, 0, dp2px);
            }
            ScrollView scrollView = this.f112499g;
            if (scrollView != null) {
                scrollView.addView(this.f112500h, new ViewGroup.LayoutParams(UIUtils.dp2px(this.f112497e, 200.0f), -2));
            }
        }
        LinearLayout linearLayout2 = this.f112500h;
        if (linearLayout2 != null) {
            linearLayout2.setOrientation(1);
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        view.setBackground(this.f112497e.getDrawable(R.drawable.item_bg_selector_c11));
        view.setPadding(0, dp2px, 0, dp2px);
        view.setTag(R.id.main_tab_sub_tab_tag, str);
        view.setOnClickListener(this.f112501i);
        LinearLayout linearLayout3 = this.f112500h;
        if (linearLayout3 != null) {
            linearLayout3.addView(view);
        }
    }
}
