package com.ss.android.vc.meeting.module.localshare;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.AbstractC1810j;
import com.airbnb.lottie.model.C1847d;
import com.airbnb.lottie.p072d.AbstractC1797e;
import com.airbnb.lottie.p072d.C1794b;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.LoadingLottieView;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.utils.C63529q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/vc/meeting/module/localshare/UssLoadingPageViewHolder;", "", "dialogInterface", "Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "(Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;)V", "getDialogInterface", "()Lcom/ss/android/vc/meeting/basedialog/CommonDialogInterface;", "loadingLottieView", "Lcom/ss/android/vc/common/widget/LoadingLottieView;", "rootView", "Landroid/view/View;", "createView", "activity", "Landroid/app/Activity;", "destroy", "", "initView", "startLoadingAnimation", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.localshare.k */
public final class UssLoadingPageViewHolder {

    /* renamed from: a */
    public LoadingLottieView f156190a;

    /* renamed from: b */
    private View f156191b;

    /* renamed from: c */
    private final AbstractC61222a f156192c;

    /* renamed from: b */
    public final AbstractC61222a mo215096b() {
        return this.f156192c;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.k$a */
    public static final class C62181a extends Lambda implements Function0<Unit> {
        final /* synthetic */ UssLoadingPageViewHolder this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62181a(UssLoadingPageViewHolder kVar) {
            super(0);
            this.this$0 = kVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            UssLoadingPageViewHolder.m242818a(this.this$0).cancelAnimation();
            this.this$0.mo215096b().dismiss();
        }
    }

    /* renamed from: a */
    public final void mo215095a() {
        LoadingLottieView loadingLottieView = this.f156190a;
        if (loadingLottieView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingLottieView");
        }
        loadingLottieView.cancelAnimation();
    }

    /* renamed from: c */
    private final void m242819c() {
        View view = this.f156191b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById = view.findViewById(R.id.loading_lottie_view);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.loading_lottie_view)");
        this.f156190a = (LoadingLottieView) findViewById;
        View view2 = this.f156191b;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.go_back);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById<View>(R.id.go_back)");
        C63529q.m248970a(findViewById2, new C62181a(this));
        m242820d();
    }

    /* renamed from: d */
    private final void m242820d() {
        if (this.f156190a != null) {
            LoadingLottieView loadingLottieView = this.f156190a;
            if (loadingLottieView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingLottieView");
            }
            loadingLottieView.addValueCallback(new C1847d("**"), AbstractC1810j.f6196C, C62182b.f156193a);
            LoadingLottieView loadingLottieView2 = this.f156190a;
            if (loadingLottieView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingLottieView");
            }
            loadingLottieView2.playAnimation();
        }
    }

    public UssLoadingPageViewHolder(AbstractC61222a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "dialogInterface");
        this.f156192c = aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ LoadingLottieView m242818a(UssLoadingPageViewHolder kVar) {
        LoadingLottieView loadingLottieView = kVar.f156190a;
        if (loadingLottieView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingLottieView");
        }
        return loadingLottieView;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroid/graphics/PorterDuffColorFilter;", "it", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "Landroid/graphics/ColorFilter;", "kotlin.jvm.PlatformType", "getValue"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.localshare.k$b */
    public static final class C62182b<T> implements AbstractC1797e<ColorFilter> {

        /* renamed from: a */
        public static final C62182b f156193a = new C62182b();

        C62182b() {
        }

        /* renamed from: a */
        public final PorterDuffColorFilter getValue(C1794b<ColorFilter> bVar) {
            Context a = ar.m236694a();
            Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
            return new PorterDuffColorFilter(a.getResources().getColor(R.color.lkui_N400), PorterDuff.Mode.SRC_ATOP);
        }
    }

    /* renamed from: a */
    public final View mo215094a(Activity activity) {
        if (activity == null) {
            return null;
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.layout_loading_page, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(acti…ayout_loading_page, null)");
        this.f156191b = inflate;
        m242819c();
        View view = this.f156191b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }
}
