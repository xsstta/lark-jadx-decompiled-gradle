package com.ss.android.lark.thirdshare.container.impl;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.joooonho.SelectableRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.thirdshare.base.export.ShareEntity;
import com.ss.android.lark.thirdshare.container.LarkShareContainer;
import com.ss.android.lark.thirdshare.container.LarkShareContainerConfig;
import com.ss.android.lark.thirdshare.container.p2745c.C55732b;
import com.ss.android.lark.thirdshare.container.p2745c.C55735c;
import com.ss.android.lark.thirdshare.lark.p2746a.p2747a.AbstractC55759a;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ViewUtils;
import com.ss.android.lark.utils.aj;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0012\u0010#\u001a\u00020\u001e2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010&\u001a\u00020\u001e2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J&\u0010)\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u001a\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001c2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u0006H\u0002J\u0010\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020 2\b\u00107\u001a\u0004\u0018\u000108H\u0002J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;H\u0002J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerLinkFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "iconShape", "", "isFetchData", "", "lscDisableRl", "Landroid/widget/RelativeLayout;", "lscDisableTipTv", "Landroid/widget/TextView;", "lscErrorRetryTv", "lscErrorRl", "lscErrorTipTv", "lscLinkRl", "lscLoadingRl", "lsclAvatarIv", "Lcom/joooonho/SelectableRoundedImageView;", "lsclContentTv", "lsclCopyTv", "lsclDescTv", "lsclExpiredTipTv", "lsclHeadLl", "Landroid/widget/LinearLayout;", "lsclNameTv", "lsclShareTv", "lsclTipTv", "rootView", "Landroid/view/View;", "copyText", "", "text", "", "fetchData", "initFindView", "initView", "linkConfig", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "setBottomBtnEnabled", "enabled", "setUserVisibleHint", "isVisibleToUser", "showDisableView", "showErrorView", "errorMsg", "callback", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$RetryCallback;", "showHead", "head", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$Head;", "showSuccessView", "Companion", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.thirdshare.container.impl.b */
public final class LarkShareContainerLinkFragment extends BaseFragment {

    /* renamed from: a */
    public static final Companion f137515a = new Companion(null);

    /* renamed from: b */
    private String f137516b;

    /* renamed from: c */
    private boolean f137517c;

    /* renamed from: d */
    private View f137518d;

    /* renamed from: e */
    private RelativeLayout f137519e;

    /* renamed from: f */
    private RelativeLayout f137520f;

    /* renamed from: g */
    private TextView f137521g;

    /* renamed from: h */
    private TextView f137522h;

    /* renamed from: i */
    private RelativeLayout f137523i;

    /* renamed from: j */
    private TextView f137524j;

    /* renamed from: k */
    private LinearLayout f137525k;

    /* renamed from: l */
    private SelectableRoundedImageView f137526l;

    /* renamed from: m */
    private TextView f137527m;

    /* renamed from: n */
    private TextView f137528n;

    /* renamed from: o */
    private RelativeLayout f137529o;

    /* renamed from: p */
    private TextView f137530p;

    /* renamed from: q */
    private TextView f137531q;

    /* renamed from: r */
    private TextView f137532r;

    /* renamed from: s */
    private TextView f137533s;

    /* renamed from: t */
    private TextView f137534t;

    /* renamed from: u */
    private HashMap f137535u;

    /* renamed from: b */
    public void mo189976b() {
        HashMap hashMap = this.f137535u;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo189976b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerLinkFragment$Companion;", "", "()V", "ARGS_ICON_SHAPE", "", "newInstance", "Lcom/ss/android/lark/thirdshare/container/impl/LarkShareContainerLinkFragment;", "iconShape", "components_third-share_container_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final LarkShareContainerLinkFragment mo189977a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "iconShape");
            Bundle bundle = new Bundle();
            bundle.putString("ARGS_ICON_SHAPE", str);
            LarkShareContainerLinkFragment bVar = new LarkShareContainerLinkFragment();
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "get"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.b$b */
    public static final class C55741b<T> implements ApiUtils.AbstractC57749b<LarkShareContainerConfig.LinkConfig> {

        /* renamed from: a */
        public static final C55741b f137536a = new C55741b();

        C55741b() {
        }

        /* renamed from: b */
        public final LarkShareContainerConfig.LinkConfig mo189978a() {
            LarkShareContainerConfig b;
            LarkShareContainerConfig.LinkConfigSupplier b2;
            LarkShareContainer b3 = LarkShareContainer.f137484c.mo189942b();
            if (b3 == null || (b = b3.mo189937b()) == null || (b2 = b.mo189879b()) == null) {
                return null;
            }
            return b2.mo146276a();
        }
    }

    /* renamed from: a */
    public final void mo189973a() {
        RelativeLayout relativeLayout = this.f137519e;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscLoadingRl");
        }
        relativeLayout.setVisibility(0);
        RelativeLayout relativeLayout2 = this.f137520f;
        if (relativeLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorRl");
        }
        relativeLayout2.setVisibility(8);
        RelativeLayout relativeLayout3 = this.f137523i;
        if (relativeLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscDisableRl");
        }
        relativeLayout3.setVisibility(8);
        RelativeLayout relativeLayout4 = this.f137529o;
        if (relativeLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscLinkRl");
        }
        relativeLayout4.setVisibility(8);
        C55735c.m215923a(C55741b.f137536a, new C55746c(new C55742c(this)));
    }

    /* renamed from: c */
    private final void m215956c() {
        View view = this.f137518d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById = view.findViewById(R.id.lscLoadingRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById(R.id.lscLoadingRl)");
        this.f137519e = (RelativeLayout) findViewById;
        View view2 = this.f137518d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById2 = view2.findViewById(R.id.lscErrorRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(R.id.lscErrorRl)");
        this.f137520f = (RelativeLayout) findViewById2;
        View view3 = this.f137518d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById3 = view3.findViewById(R.id.lscErrorTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(R.id.lscErrorTipTv)");
        this.f137521g = (TextView) findViewById3;
        View view4 = this.f137518d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById4 = view4.findViewById(R.id.lscErrorRetryTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(R.id.lscErrorRetryTv)");
        this.f137522h = (TextView) findViewById4;
        View view5 = this.f137518d;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById5 = view5.findViewById(R.id.lscDisableRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById(R.id.lscDisableRl)");
        this.f137523i = (RelativeLayout) findViewById5;
        View view6 = this.f137518d;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById6 = view6.findViewById(R.id.lscDisableTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(R.id.lscDisableTipTv)");
        this.f137524j = (TextView) findViewById6;
        View view7 = this.f137518d;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById7 = view7.findViewById(R.id.lsclHeadLl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "rootView.findViewById(R.id.lsclHeadLl)");
        this.f137525k = (LinearLayout) findViewById7;
        View view8 = this.f137518d;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById8 = view8.findViewById(R.id.lsclAvatarIv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "rootView.findViewById(R.id.lsclAvatarIv)");
        this.f137526l = (SelectableRoundedImageView) findViewById8;
        View view9 = this.f137518d;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById9 = view9.findViewById(R.id.lsclNameTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "rootView.findViewById(R.id.lsclNameTv)");
        this.f137527m = (TextView) findViewById9;
        View view10 = this.f137518d;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById10 = view10.findViewById(R.id.lsclDescTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "rootView.findViewById(R.id.lsclDescTv)");
        this.f137528n = (TextView) findViewById10;
        View view11 = this.f137518d;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById11 = view11.findViewById(R.id.lscLinkRl);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "rootView.findViewById(R.id.lscLinkRl)");
        this.f137529o = (RelativeLayout) findViewById11;
        View view12 = this.f137518d;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById12 = view12.findViewById(R.id.lsclContentTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "rootView.findViewById(R.id.lsclContentTv)");
        this.f137530p = (TextView) findViewById12;
        View view13 = this.f137518d;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById13 = view13.findViewById(R.id.lsclExpiredTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "rootView.findViewById(R.id.lsclExpiredTipTv)");
        this.f137531q = (TextView) findViewById13;
        View view14 = this.f137518d;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById14 = view14.findViewById(R.id.lsclTipTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "rootView.findViewById(R.id.lsclTipTv)");
        this.f137532r = (TextView) findViewById14;
        View view15 = this.f137518d;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById15 = view15.findViewById(R.id.lsclCopyTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "rootView.findViewById(R.id.lsclCopyTv)");
        this.f137533s = (TextView) findViewById15;
        View view16 = this.f137518d;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        View findViewById16 = view16.findViewById(R.id.lsclShareTv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById16, "rootView.findViewById(R.id.lsclShareTv)");
        this.f137534t = (TextView) findViewById16;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "p1", "Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;", "Lkotlin/ParameterName;", "name", "linkConfig", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.b$c */
    public static final /* synthetic */ class C55742c extends FunctionReference implements Function1<LarkShareContainerConfig.LinkConfig, Unit> {
        C55742c(LarkShareContainerLinkFragment bVar) {
            super(1, bVar);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "initView";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(LarkShareContainerLinkFragment.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "initView(Lcom/ss/android/lark/thirdshare/container/LarkShareContainerConfig$LinkConfig;)V";
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LarkShareContainerConfig.LinkConfig dVar) {
            invoke(dVar);
            return Unit.INSTANCE;
        }

        public final void invoke(LarkShareContainerConfig.LinkConfig dVar) {
            ((LarkShareContainerLinkFragment) this.receiver).mo189974a(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.b$d */
    public static final class View$OnClickListenerC55743d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerLinkFragment f137537a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.RetryCallback f137538b;

        View$OnClickListenerC55743d(LarkShareContainerLinkFragment bVar, LarkShareContainerConfig.RetryCallback hVar) {
            this.f137537a = bVar;
            this.f137538b = hVar;
        }

        public final void onClick(View view) {
            this.f137537a.mo189973a();
            LarkShareContainerConfig.RetryCallback hVar = this.f137538b;
            if (hVar != null) {
                hVar.mo146277a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.b$e */
    public static final class View$OnClickListenerC55744e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerLinkFragment f137539a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.LinkConfig f137540b;

        View$OnClickListenerC55744e(LarkShareContainerLinkFragment bVar, LarkShareContainerConfig.LinkConfig dVar) {
            this.f137539a = bVar;
            this.f137540b = dVar;
        }

        public final void onClick(View view) {
            this.f137539a.mo189975a(this.f137540b.mo189900e());
            LarkShareContainerConfig.LinkCallback i = this.f137540b.mo189904i();
            if (i != null) {
                i.onCopied();
            }
            ViewUtils.m224145a((int) R.string.Lark_Legacy_CopyReady);
        }
    }

    /* renamed from: a */
    private final void m215954a(boolean z) {
        TextView textView = this.f137533s;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclCopyTv");
        }
        textView.setEnabled(z);
        TextView textView2 = this.f137534t;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclShareTv");
        }
        textView2.setEnabled(z);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("ARGS_ICON_SHAPE")) == null) {
            str = "circle";
        }
        this.f137516b = str;
    }

    /* renamed from: c */
    private final void m215957c(LarkShareContainerConfig.LinkConfig dVar) {
        RelativeLayout relativeLayout = this.f137523i;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscDisableRl");
        }
        relativeLayout.setVisibility(0);
        TextView textView = this.f137524j;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscDisableTipTv");
        }
        textView.setText(dVar.mo189907l());
        m215954a(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z && !this.f137517c) {
            this.f137517c = true;
            mo189973a();
        }
        Log.m165379d("LarkShareContainer", "LarkShareContainerLinkFragment setUserVisibleHint:" + z);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.thirdshare.container.impl.b$f */
    public static final class View$OnClickListenerC55745f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LarkShareContainerLinkFragment f137541a;

        /* renamed from: b */
        final /* synthetic */ LarkShareContainerConfig.LinkConfig f137542b;

        View$OnClickListenerC55745f(LarkShareContainerLinkFragment bVar, LarkShareContainerConfig.LinkConfig dVar) {
            this.f137541a = bVar;
            this.f137542b = dVar;
        }

        public final void onClick(View view) {
            ((AbstractC55759a) ApiUtils.getApi(AbstractC55759a.class)).share(this.f137541a.getContext(), new ShareEntity.C55696a(this.f137542b.mo189896c(), this.f137542b.mo189900e(), this.f137542b.mo189901f()).mo189775b(this.f137542b.mo189894b()).mo189764a(new LarkShareContainerLinkFragment$showSuccessView$3$shareEntity$1(this)).mo189769a());
        }
    }

    /* renamed from: a */
    private final void m215952a(LarkShareContainerConfig.Head head) {
        LinearLayout linearLayout = this.f137525k;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclHeadLl");
        }
        linearLayout.setVisibility(0);
        String str = this.f137516b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("iconShape");
        }
        if (Intrinsics.areEqual(str, "round_rect")) {
            SelectableRoundedImageView selectableRoundedImageView = this.f137526l;
            if (selectableRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclAvatarIv");
            }
            selectableRoundedImageView.setOval(false);
            float dp2px = (float) UIHelper.dp2px(4.0f);
            SelectableRoundedImageView selectableRoundedImageView2 = this.f137526l;
            if (selectableRoundedImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclAvatarIv");
            }
            selectableRoundedImageView2.mo85893a(dp2px, dp2px, dp2px, dp2px);
        }
        if (head.getAvatarEntityId() != null) {
            String avatar = head.getAvatar();
            String avatarEntityId = head.getAvatarEntityId();
            if (avatarEntityId == null) {
                Intrinsics.throwNpe();
            }
            SelectableRoundedImageView selectableRoundedImageView3 = this.f137526l;
            if (selectableRoundedImageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclAvatarIv");
            }
            C55732b.m215913a(avatar, avatarEntityId, selectableRoundedImageView3);
        } else {
            String avatar2 = head.getAvatar();
            SelectableRoundedImageView selectableRoundedImageView4 = this.f137526l;
            if (selectableRoundedImageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclAvatarIv");
            }
            C55732b.m215911a(avatar2, selectableRoundedImageView4);
        }
        TextView textView = this.f137527m;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclNameTv");
        }
        textView.setText(head.getName());
        if (!TextUtils.isEmpty(head.getDesc())) {
            TextView textView2 = this.f137528n;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclDescTv");
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f137528n;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclDescTv");
            }
            textView3.setText(head.getDesc());
        }
    }

    /* renamed from: b */
    private final void m215955b(LarkShareContainerConfig.LinkConfig dVar) {
        RelativeLayout relativeLayout = this.f137529o;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscLinkRl");
        }
        relativeLayout.setVisibility(0);
        LarkShareContainerConfig.Head d = dVar.mo189898d();
        if (d != null) {
            m215952a(d);
        }
        TextView textView = this.f137530p;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclContentTv");
        }
        textView.setText(dVar.mo189900e());
        if (!TextUtils.isEmpty(dVar.mo189902g())) {
            TextView textView2 = this.f137531q;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclExpiredTipTv");
            }
            textView2.setVisibility(0);
            TextView textView3 = this.f137531q;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclExpiredTipTv");
            }
            textView3.setText(dVar.mo189902g());
        }
        if (!TextUtils.isEmpty(dVar.mo189903h())) {
            TextView textView4 = this.f137532r;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclTipTv");
            }
            textView4.setVisibility(0);
            TextView textView5 = this.f137532r;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("lsclTipTv");
            }
            textView5.setText(dVar.mo189903h());
        }
        m215954a(true);
        TextView textView6 = this.f137533s;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclCopyTv");
        }
        textView6.setOnClickListener(new View$OnClickListenerC55744e(this, dVar));
        TextView textView7 = this.f137534t;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lsclShareTv");
        }
        textView7.setOnClickListener(new View$OnClickListenerC55745f(this, dVar));
    }

    /* renamed from: a */
    public final void mo189974a(LarkShareContainerConfig.LinkConfig dVar) {
        if (dVar == null) {
            finish();
            Log.m165383e("LarkShareContainer", "linkConfig is null");
            return;
        }
        RelativeLayout relativeLayout = this.f137519e;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscLoadingRl");
        }
        relativeLayout.setVisibility(8);
        String a = dVar.mo189886a();
        int hashCode = a.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != 96784904) {
                if (hashCode == 1671308008 && a.equals("disable")) {
                    m215957c(dVar);
                    return;
                }
            } else if (a.equals("error")) {
                m215953a(dVar.mo189905j(), dVar.mo189906k());
                return;
            }
        } else if (a.equals("success")) {
            m215955b(dVar);
            return;
        }
        Log.m165383e("LarkShareContainer", "status <" + dVar.mo189886a() + "> is wrong");
        finish();
    }

    /* renamed from: a */
    public final void mo189975a(CharSequence charSequence) {
        Object systemService = aj.m224263a().getSystemService("clipboard");
        if (systemService != null) {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", charSequence));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m215956c();
    }

    /* renamed from: a */
    private final void m215953a(CharSequence charSequence, LarkShareContainerConfig.RetryCallback hVar) {
        RelativeLayout relativeLayout = this.f137520f;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorRl");
        }
        relativeLayout.setVisibility(0);
        TextView textView = this.f137521g;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorTipTv");
        }
        textView.setText(charSequence);
        TextView textView2 = this.f137522h;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("lscErrorRetryTv");
        }
        textView2.setOnClickListener(new View$OnClickListenerC55743d(this, hVar));
        m215954a(false);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        if (DesktopUtil.m144307b()) {
            i = R.layout.lark_share_container_link_fragment_desktop;
        } else {
            i = R.layout.lark_share_container_link_fragment;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(\n      …        container, false)");
        this.f137518d = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}
