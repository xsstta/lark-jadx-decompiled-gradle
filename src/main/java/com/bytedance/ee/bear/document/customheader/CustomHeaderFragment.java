package com.bytedance.ee.bear.document.customheader;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.comment.C5711a;
import com.bytedance.ee.bear.document.customheader.CustomHeaderConfig;
import com.bytedance.ee.bear.document.customheader.CustomHeaderViewModel;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.widget.statusbar.C11789c;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13746i;
import com.bytedance.ee.util.p718t.C13747j;
import com.bytedance.ee.util.statusbar.IStatusBar;
import com.bytedance.ee.util.statusbar.StatusBarManager;
import com.bytedance.ee.util.ui.ColorUtils;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000*\u0001\u0013\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\fH\u0002J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010)H\u0002¢\u0006\u0002\u0010*J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020.H\u0016J\u0012\u0010/\u001a\u00020,2\b\u00100\u001a\u0004\u0018\u000101H\u0016J&\u00102\u001a\u0004\u0018\u00010\b2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\n2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00106\u001a\u00020,H\u0016J\u001a\u00107\u001a\u00020,2\u0006\u00108\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00109\u001a\u00020,2\b\b\u0001\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020.H\u0002J\u0012\u0010<\u001a\u00020,2\b\u0010=\u001a\u0004\u0018\u00010>H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0004\n\u0002\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/bytedance/ee/bear/document/customheader/CustomHeaderFragment;", "Lcom/bytedance/ee/bear/facade/common/BaseFragment;", "()V", "commentPanelViewModel", "Lcom/bytedance/ee/bear/document/comment/CommentPanelViewModel;", "customHeaderViewModel", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderViewModel;", "divider", "Landroid/view/View;", "leftMenuContainer", "Landroid/view/ViewGroup;", "leftMenuMargin", "", "menuSize", "rightMenuContainer", "rightMenuMargin", "statusBar", "Lcom/bytedance/ee/util/statusbar/IStatusBar;", "statusBarInterceptor", "com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$statusBarInterceptor$1", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderFragment$statusBarInterceptor$1;", "syncAnimator", "Landroid/animation/ObjectAnimator;", "syncIcon", "Landroid/widget/ImageView;", "titleColor", "", "titleContainer", "titleView", "Landroid/widget/TextView;", "createMenuIconView", "menu", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig$Menu;", "menuMargin", "createMenuTextView", "Landroid/widget/Button;", "getColors", "", "context", "Landroid/content/Context;", "customColor", "", "(Landroid/content/Context;[Ljava/lang/String;)[I", "makeTitleCenter", "", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroyView", "onViewCreated", "view", "setStatusBarColor", "statusBarColor", "lightStatusBar", "updateView", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.customheader.a */
public final class CustomHeaderFragment extends C7667e {

    /* renamed from: a */
    public CustomHeaderViewModel f16110a;

    /* renamed from: b */
    private C5711a f16111b;

    /* renamed from: c */
    private IStatusBar f16112c;

    /* renamed from: d */
    private View f16113d;

    /* renamed from: e */
    private TextView f16114e;

    /* renamed from: f */
    private String f16115f;

    /* renamed from: g */
    private ViewGroup f16116g;

    /* renamed from: h */
    private ViewGroup f16117h;

    /* renamed from: i */
    private ImageView f16118i;

    /* renamed from: j */
    private ObjectAnimator f16119j;

    /* renamed from: k */
    private View f16120k;

    /* renamed from: l */
    private int f16121l;

    /* renamed from: m */
    private int f16122m;

    /* renamed from: n */
    private int f16123n;

    /* renamed from: o */
    private final C5732e f16124o = new C5732e();

    /* renamed from: p */
    private HashMap f16125p;

    /* renamed from: a */
    public void mo22980a() {
        HashMap hashMap = this.f16125p;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$statusBarInterceptor$1", "Lcom/bytedance/ee/bear/widget/statusbar/StatusBarCompat$IInterceptor;", "interceptSetStatusBarColor", "", "activity", "Landroid/app/Activity;", "color", "", "lightStatusBar", "interceptSetSystemUiVisibility", "systemUiVisibility", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$e */
    public static final class C5732e implements C11789c.AbstractC11791a {
        @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
        public boolean interceptSetStatusBarColor(Activity activity, int i, boolean z) {
            return false;
        }

        @Override // com.bytedance.ee.bear.widget.statusbar.C11789c.AbstractC11791a
        public boolean interceptSetSystemUiVisibility(Activity activity, int i) {
            return true;
        }

        C5732e() {
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        CustomHeaderViewModel cVar = this.f16110a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customHeaderViewModel");
        }
        CustomHeaderViewModel.Delegate delegate = cVar.getDelegate();
        if (delegate == null) {
            return true;
        }
        delegate.mo22977a("exit");
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C11789c.m48871b(getActivity(), this.f16124o);
        IStatusBar aVar = this.f16112c;
        if (aVar != null) {
            aVar.mo50689b();
        }
        ObjectAnimator objectAnimator = this.f16119j;
        if (objectAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
        }
        objectAnimator.cancel();
        mo22980a();
    }

    /* renamed from: b */
    private final void m23132b() {
        TextView textView = this.f16114e;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleView");
        }
        textView.setGravity(17);
        Context context = getContext();
        if (context != null) {
            int b = C13655e.m55415b(context);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(1073741823, 0);
            ViewGroup viewGroup = this.f16116g;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("leftMenuContainer");
            }
            viewGroup.measure(makeMeasureSpec, makeMeasureSpec);
            ViewGroup viewGroup2 = this.f16117h;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rightMenuContainer");
            }
            viewGroup2.measure(makeMeasureSpec, makeMeasureSpec);
            ViewGroup viewGroup3 = this.f16116g;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("leftMenuContainer");
            }
            int measuredWidth = viewGroup3.getMeasuredWidth();
            ViewGroup viewGroup4 = this.f16117h;
            if (viewGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rightMenuContainer");
            }
            int max = Math.max(measuredWidth, viewGroup4.getMeasuredWidth());
            View view = this.f16113d;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleContainer");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (!(layoutParams instanceof RelativeLayout.LayoutParams)) {
                layoutParams = null;
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (layoutParams2 != null) {
                layoutParams2.removeRule(17);
                layoutParams2.removeRule(16);
                layoutParams2.addRule(13, -1);
                layoutParams2.width = ((b / 2) - max) * 2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/ee/bear/document/customheader/CustomHeaderConfig;", "onChanged"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$c */
    static final class C5730c<T> implements AbstractC1178x<CustomHeaderConfig> {

        /* renamed from: a */
        final /* synthetic */ CustomHeaderFragment f16134a;

        C5730c(CustomHeaderFragment aVar) {
            this.f16134a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(CustomHeaderConfig customHeaderConfig) {
            this.f16134a.mo22982a(customHeaderConfig);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CustomHeaderViewModel m23129a(CustomHeaderFragment aVar) {
        CustomHeaderViewModel cVar = aVar.f16110a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customHeaderViewModel");
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$createMenuIconView$1$1$1", "com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$$special$$inlined$let$lambda$2"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$a */
    public static final class View$OnClickListenerC5728a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ String f16126a;

        /* renamed from: b */
        final /* synthetic */ ImageView f16127b;

        /* renamed from: c */
        final /* synthetic */ CustomHeaderFragment f16128c;

        /* renamed from: d */
        final /* synthetic */ CustomHeaderConfig.Menu f16129d;

        /* renamed from: e */
        final /* synthetic */ int f16130e;

        View$OnClickListenerC5728a(String str, ImageView imageView, CustomHeaderFragment aVar, CustomHeaderConfig.Menu menu, int i) {
            this.f16126a = str;
            this.f16127b = imageView;
            this.f16128c = aVar;
            this.f16129d = menu;
            this.f16130e = i;
        }

        public final void onClick(View view) {
            CustomHeaderViewModel.Delegate delegate = CustomHeaderFragment.m23129a(this.f16128c).getDelegate();
            if (delegate != null) {
                delegate.mo22977a(this.f16126a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$createMenuTextView$1$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$b */
    public static final class View$OnClickListenerC5729b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CustomHeaderFragment f16131a;

        /* renamed from: b */
        final /* synthetic */ CustomHeaderConfig.Menu f16132b;

        /* renamed from: c */
        final /* synthetic */ int f16133c;

        View$OnClickListenerC5729b(CustomHeaderFragment aVar, CustomHeaderConfig.Menu menu, int i) {
            this.f16131a = aVar;
            this.f16132b = menu;
            this.f16133c = i;
        }

        public final void onClick(View view) {
            CustomHeaderViewModel.Delegate delegate;
            String id = this.f16132b.getId();
            if (id != null && (delegate = CustomHeaderFragment.m23129a(this.f16131a).getDelegate()) != null) {
                delegate.mo22977a(id);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$d */
    static final class C5731d<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CustomHeaderFragment f16135a;

        C5731d(CustomHeaderFragment aVar) {
            this.f16135a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            ViewGroup.LayoutParams layoutParams;
            int i;
            View view = this.f16135a.getView();
            if (view != null) {
                layoutParams = view.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                    i = C13746i.m55722a(this.f16135a.getContext());
                } else {
                    i = 0;
                }
                marginLayoutParams.topMargin = i;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "isShowingComment", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Boolean;)V", "com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$updateView$1$1$1", "com/bytedance/ee/bear/document/customheader/CustomHeaderFragment$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$f */
    public static final class C5733f<T> implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ int f16136a;

        /* renamed from: b */
        final /* synthetic */ boolean f16137b;

        /* renamed from: c */
        final /* synthetic */ CustomHeaderFragment f16138c;

        C5733f(int i, boolean z, CustomHeaderFragment aVar) {
            this.f16136a = i;
            this.f16137b = z;
            this.f16138c = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Boolean bool) {
            Intrinsics.checkExpressionValueIsNotNull(bool, "isShowingComment");
            if (bool.booleanValue()) {
                CustomHeaderFragment aVar = this.f16138c;
                aVar.mo22981a(aVar.getResources().getColor(R.color.space_kit_trans), true);
                return;
            }
            this.f16138c.mo22981a(this.f16136a, true ^ this.f16137b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.customheader.a$g */
    public static final class C5734g<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ CustomHeaderFragment f16139a;

        C5734g(CustomHeaderFragment aVar) {
            this.f16139a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            View view;
            ViewGroup.LayoutParams layoutParams;
            if (num != null) {
                View view2 = this.f16139a.getView();
                LinearLayout.LayoutParams layoutParams2 = null;
                if (view2 != null) {
                    view = view2.findViewById(R.id.status_bar_diff_height_view);
                } else {
                    view = null;
                }
                if (view != null) {
                    layoutParams = view.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof LinearLayout.LayoutParams) {
                    layoutParams2 = layoutParams;
                }
                LinearLayout.LayoutParams layoutParams3 = layoutParams2;
                if (layoutParams3 != null) {
                    layoutParams3.height = num.intValue();
                }
                if (view != null) {
                    view.setLayoutParams(layoutParams3);
                }
            }
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment, com.bytedance.ee.bear.facade.common.C7667e
    public void onCreate(Bundle bundle) {
        IStatusBar aVar;
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "it");
            aVar = StatusBarManager.m55628a(activity);
        } else {
            aVar = null;
        }
        this.f16112c = aVar;
        if (aVar != null) {
            aVar.mo50687a();
        }
        CustomHeaderFragment aVar2 = this;
        AbstractC1142af a = C4950k.m20474a(aVar2, CustomHeaderViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "PluginViewModelProviders…derViewModel::class.java)");
        CustomHeaderViewModel cVar = (CustomHeaderViewModel) a;
        this.f16110a = cVar;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customHeaderViewModel");
        }
        CustomHeaderFragment aVar3 = this;
        cVar.getHeaderData().mo5923a(aVar3, new C5730c(this));
        CustomHeaderViewModel cVar2 = this.f16110a;
        if (cVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customHeaderViewModel");
        }
        cVar2.isStatusBarImmersive().mo5923a(aVar3, new C5731d(this));
        AbstractC1142af a2 = C4950k.m20474a(aVar2, C5711a.class);
        Intrinsics.checkExpressionValueIsNotNull(a2, "PluginViewModelProviders…nelViewModel::class.java)");
        this.f16111b = (C5711a) a2;
    }

    /* renamed from: a */
    public final void mo22982a(CustomHeaderConfig customHeaderConfig) {
        String str;
        String position;
        ImageView imageView;
        ImageView imageView2;
        String str2;
        if (customHeaderConfig != null) {
            String themeColor = customHeaderConfig.getThemeColor();
            Boolean bool = null;
            int i = 0;
            if (themeColor != null) {
                int a = ColorUtils.m55697a(themeColor);
                boolean a2 = ColorUtils.m55700a(a, 0, 2, null);
                View view = getView();
                if (view != null) {
                    view.setBackgroundColor(a);
                }
                if (a2) {
                    str2 = "#FFFFFF";
                } else {
                    str2 = "#000000";
                }
                this.f16115f = str2;
                mo22981a(a, !a2);
                C5711a aVar = this.f16111b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("commentPanelViewModel");
                }
                aVar.isShowingComment().mo5923a(this, new C5733f(a, a2, this));
            }
            ViewGroup viewGroup = this.f16116g;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("leftMenuContainer");
            }
            viewGroup.removeAllViews();
            ViewGroup viewGroup2 = this.f16117h;
            if (viewGroup2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rightMenuContainer");
            }
            viewGroup2.removeAllViews();
            CustomHeaderConfig.MenuItems items = customHeaderConfig.getItems();
            if (items != null) {
                CustomHeaderConfig.Menu[] left = items.getLeft();
                if (left != null) {
                    for (CustomHeaderConfig.Menu menu : left) {
                        if (menu.getId() != null) {
                            String style = menu.getStyle();
                            if (style.hashCode() == 3556653 && style.equals("text")) {
                                imageView2 = m23131b(menu, this.f16122m);
                            } else {
                                imageView2 = m23128a(menu, this.f16122m);
                            }
                            ViewGroup viewGroup3 = this.f16116g;
                            if (viewGroup3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("leftMenuContainer");
                            }
                            viewGroup3.addView(imageView2);
                        }
                    }
                }
                CustomHeaderConfig.Menu[] right = items.getRight();
                if (right != null) {
                    for (CustomHeaderConfig.Menu menu2 : right) {
                        if (menu2.getId() != null) {
                            String style2 = menu2.getStyle();
                            if (style2.hashCode() == 3556653 && style2.equals("text")) {
                                imageView = m23131b(menu2, this.f16123n);
                            } else {
                                imageView = m23128a(menu2, this.f16123n);
                            }
                            ViewGroup viewGroup4 = this.f16117h;
                            if (viewGroup4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("rightMenuContainer");
                            }
                            viewGroup4.addView(imageView);
                        }
                    }
                }
            }
            TextView textView = this.f16114e;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleView");
            }
            CustomHeaderConfig.TitleConfig titleConfig = customHeaderConfig.getTitleConfig();
            if (titleConfig == null || (str = titleConfig.getTitle()) == null) {
                str = "";
            }
            textView.setText(str);
            CustomHeaderConfig.TitleConfig titleConfig2 = customHeaderConfig.getTitleConfig();
            if (titleConfig2 != null) {
                bool = titleConfig2.isLoading();
            }
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                TextView textView2 = this.f16114e;
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                textView2.setTextColor(getResources().getColor(R.color.space_kit_b500));
                ImageView imageView3 = this.f16118i;
                if (imageView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncIcon");
                }
                imageView3.setVisibility(0);
                ObjectAnimator objectAnimator = this.f16119j;
                if (objectAnimator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
                }
                if (objectAnimator.isStarted()) {
                    ObjectAnimator objectAnimator2 = this.f16119j;
                    if (objectAnimator2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
                    }
                    objectAnimator2.resume();
                } else {
                    ObjectAnimator objectAnimator3 = this.f16119j;
                    if (objectAnimator3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
                    }
                    objectAnimator3.start();
                }
            } else {
                TextView textView3 = this.f16114e;
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleView");
                }
                String str3 = this.f16115f;
                if (str3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("titleColor");
                }
                textView3.setTextColor(ColorUtils.m55697a(str3));
                ImageView imageView4 = this.f16118i;
                if (imageView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncIcon");
                }
                imageView4.setVisibility(8);
                ObjectAnimator objectAnimator4 = this.f16119j;
                if (objectAnimator4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
                }
                objectAnimator4.cancel();
            }
            CustomHeaderConfig.TitleConfig titleConfig3 = customHeaderConfig.getTitleConfig();
            if (!(titleConfig3 == null || (position = titleConfig3.getPosition()) == null || !Intrinsics.areEqual(position, "center"))) {
                m23132b();
            }
            View view2 = this.f16120k;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("divider");
            }
            if (!Intrinsics.areEqual((Object) customHeaderConfig.getShouldShowDivider(), (Object) true)) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        CustomHeaderViewModel cVar = this.f16110a;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("customHeaderViewModel");
        }
        cVar.getStatusBarDiffHeight().mo5923a(this, new C5734g(this));
    }

    /* renamed from: a */
    private final int[] m23130a(Context context, String[] strArr) {
        int[] iArr = new int[4];
        for (int i = 0; i < 4; i++) {
            iArr[i] = 0;
        }
        if (strArr != null) {
            for (int i2 = 0; i2 <= 3; i2++) {
                iArr[i2] = ColorUtils.m55697a(strArr[i2]);
            }
        } else {
            iArr[0] = ContextCompat.getColor(context, R.color.primary_pri_300);
            iArr[1] = ContextCompat.getColor(context, R.color.primary_pri_500);
            iArr[2] = ContextCompat.getColor(context, R.color.text_disable);
            iArr[3] = ContextCompat.getColor(context, R.color.primary_pri_500);
        }
        return iArr;
    }

    /* renamed from: a */
    private final ImageView m23128a(CustomHeaderConfig.Menu menu, int i) {
        boolean z;
        ImageView imageView = new ImageView(getContext());
        String id = menu.getId();
        if (id != null) {
            Boolean enable = menu.getEnable();
            if (enable != null) {
                z = enable.booleanValue();
            } else {
                z = true;
            }
            imageView.setEnabled(z);
            MenuEnum valueOf = MenuEnum.valueOf(id);
            C13747j.m55729a(imageView, valueOf.getImageResId(), valueOf.getImageResTint());
            int i2 = this.f16121l;
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i2, i2);
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            imageView.setLayoutParams(marginLayoutParams);
            String str = this.f16115f;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleColor");
            }
            imageView.setImageTintList(ColorStateList.valueOf(ColorUtils.m55697a(str)));
            imageView.setOnClickListener(new View$OnClickListenerC5728a(id, imageView, this, menu, i));
        }
        return imageView;
    }

    /* renamed from: b */
    private final Button m23131b(CustomHeaderConfig.Menu menu, int i) {
        boolean z;
        Button button = new Button(getContext());
        Boolean enable = menu.getEnable();
        if (enable != null) {
            z = enable.booleanValue();
        } else {
            z = true;
        }
        button.setEnabled(z);
        button.setText(menu.getText());
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        button.setLayoutParams(marginLayoutParams);
        button.setTextSize(16.0f);
        button.setBackground(button.getResources().getDrawable(R.color.space_kit_trans));
        int[][] iArr = new int[4][];
        for (int i2 = 0; i2 < 4; i2++) {
            int[] iArr2 = new int[1];
            for (int i3 = 0; i3 < 1; i3++) {
                iArr2[i3] = 0;
            }
            iArr[i2] = iArr2;
        }
        int[][] iArr3 = iArr;
        iArr3[0] = new int[]{16842919};
        iArr3[1] = new int[]{16842913};
        iArr3[2] = new int[]{-16842910};
        iArr3[3] = new int[0];
        Context context = button.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        button.setTextColor(new ColorStateList(iArr3, m23130a(context, menu.getCustomColor())));
        button.setOnClickListener(new View$OnClickListenerC5729b(this, menu, i));
        return button;
    }

    /* renamed from: a */
    public final void mo22981a(int i, boolean z) {
        C11789c.m48871b(getActivity(), this.f16124o);
        IStatusBar aVar = this.f16112c;
        if (aVar != null) {
            aVar.mo50688a(i, z);
        }
        C11789c.m48866a(getActivity(), this.f16124o);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.title_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.title_container)");
        this.f16113d = findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.title)");
        this.f16114e = (TextView) findViewById2;
        this.f16115f = "#000000";
        View findViewById3 = view.findViewById(R.id.left_menu_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.left_menu_container)");
        this.f16116g = (ViewGroup) findViewById3;
        View findViewById4 = view.findViewById(R.id.right_menu_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "view.findViewById(R.id.right_menu_container)");
        this.f16117h = (ViewGroup) findViewById4;
        View findViewById5 = view.findViewById(R.id.sync_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "view.findViewById(R.id.sync_icon)");
        ImageView imageView = (ImageView) findViewById5;
        this.f16118i = imageView;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncIcon");
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "rotation", BitmapDescriptorFactory.HUE_RED, 359.0f);
        Intrinsics.checkExpressionValueIsNotNull(ofFloat, "ObjectAnimator.ofFloat(s…on, \"rotation\", 0f, 359f)");
        this.f16119j = ofFloat;
        if (ofFloat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
        }
        ofFloat.setDuration(2000L);
        ObjectAnimator objectAnimator = this.f16119j;
        if (objectAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
        }
        objectAnimator.setInterpolator(new LinearInterpolator());
        ObjectAnimator objectAnimator2 = this.f16119j;
        if (objectAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncAnimator");
        }
        objectAnimator2.setRepeatCount(-1);
        this.f16121l = getResources().getDimensionPixelSize(R.dimen.widget_menu_img_size);
        this.f16122m = getResources().getDimensionPixelSize(R.dimen.custom_header_left_menu_half_margin);
        this.f16123n = getResources().getDimensionPixelSize(R.dimen.custom_header_right_menu_half_margin);
        View findViewById6 = view.findViewById(R.id.divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "view.findViewById(R.id.divider)");
        this.f16120k = findViewById6;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.custom_header_layout, viewGroup, false);
    }
}
