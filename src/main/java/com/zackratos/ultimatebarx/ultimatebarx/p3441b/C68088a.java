package com.zackratos.ultimatebarx.ultimatebarx.p3441b;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import com.larksuite.suite.R;
import com.zackratos.ultimatebarx.ultimatebarx.C68087b;
import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarXManager;
import com.zackratos.ultimatebarx.ultimatebarx.UltimateBarXObserver;
import com.zackratos.ultimatebarx.ultimatebarx.bean.BarBackground;
import com.zackratos.ultimatebarx.ultimatebarx.bean.BarConfig;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68098a;
import com.zackratos.ultimatebarx.ultimatebarx.p3442c.C68099b;
import com.zackratos.ultimatebarx.ultimatebarx.rom.Rom;
import com.zackratos.ultimatebarx.ultimatebarx.view.ActivityTag;
import com.zackratos.ultimatebarx.ultimatebarx.view.Creator;
import com.zackratos.ultimatebarx.ultimatebarx.view.FragmentTag;
import com.zackratos.ultimatebarx.ultimatebarx.view.FrameLayoutCreator;
import com.zackratos.ultimatebarx.ultimatebarx.view.RelativeLayoutCreator;
import com.zackratos.ultimatebarx.ultimatebarx.view.Tag;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\f\u0010\b\u001a\u00020\t*\u00020\nH\u0002\u001a\f\u0010\u000b\u001a\u00020\f*\u00020\rH\u0001\u001a\f\u0010\u000e\u001a\u00020\f*\u00020\u000fH\u0000\u001a\f\u0010\u0010\u001a\u00020\f*\u00020\rH\u0001\u001a\f\u0010\u0011\u001a\u00020\f*\u00020\u0012H\u0003\u001a\f\u0010\u0013\u001a\u00020\f*\u00020\u0012H\u0001\u001a\f\u0010\u0014\u001a\u00020\f*\u00020\u0012H\u0001\u001a\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u001a\u001c\u0010\u001b\u001a\u00020\f*\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002\u001a\u0014\u0010\u001d\u001a\u00020\f*\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001aH\u0002\u001a\f\u0010\u001e\u001a\u00020\f*\u00020\nH\u0000\u001a\f\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0001\u001a\u0014\u0010\u001f\u001a\u00020\u001a*\u00020\r2\u0006\u0010 \u001a\u00020!H\u0002\u001a\u001c\u0010\u001f\u001a\u00020\f*\u00020\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002\u001a\u0014\u0010&\u001a\u00020\f*\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0001\u001a\u0014\u0010&\u001a\u00020\f*\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0001\u001a\u0014\u0010'\u001a\u00020\f*\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0003\u001a\u0014\u0010'\u001a\u00020\f*\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0003\u001a\u0014\u0010(\u001a\u00020\f*\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0001\u001a\u0014\u0010(\u001a\u00020\f*\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0001\u001a\u0014\u0010)\u001a\u00020\f*\u00020\n2\u0006\u0010\"\u001a\u00020#H\u0003\u001a\u0014\u0010)\u001a\u00020\f*\u00020\u00122\u0006\u0010\"\u001a\u00020#H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001b\u0010\u0002\u001a\u00020\u00038BX\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006*"}, d2 = {"TAG_PARENT", "", "manager", "Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "getManager", "()Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "manager$delegate", "Lkotlin/Lazy;", "addFrameLayoutWrapper", "Landroid/view/ViewGroup;", "Landroidx/fragment/app/Fragment;", "addNavigationBarBottomPadding", "", "Landroid/view/View;", "addObserver", "Landroidx/lifecycle/LifecycleOwner;", "addStatusBarTopPadding", "barInitialization", "Landroidx/fragment/app/FragmentActivity;", "defaultNavigationBar", "defaultStatusBar", "getCreator", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Creator;", "tag", "Lcom/zackratos/ultimatebarx/ultimatebarx/view/Tag;", "landscape", "", "setNavigationBarPadding", "fitWindow", "setStatusBarPadding", "ultimateBarXInitialization", "updateBackground", "background", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarBackground;", "config", "Lcom/zackratos/ultimatebarx/ultimatebarx/bean/BarConfig;", "endVersion", "", "updateNavigationBar", "updateNavigationBarView", "updateStatusBar", "updateStatusBarView", "ultimatebarx_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.zackratos.ultimatebarx.ultimatebarx.b.a */
public final class C68088a {

    /* renamed from: a */
    private static final Lazy f171318a = LazyKt.lazy(C68089a.INSTANCE);

    /* renamed from: a */
    private static final UltimateBarXManager m264635a() {
        return (UltimateBarXManager) f171318a.getValue();
    }

    /* renamed from: a */
    public static final void m264643a(FragmentActivity fragmentActivity, BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$updateStatusBar");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        m264652c(fragmentActivity, bVar);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        m264635a().mo236985d(fragmentActivity2);
        m264635a().mo236979a(fragmentActivity2, bVar);
    }

    /* renamed from: a */
    public static final void m264644a(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkParameterIsNotNull(lifecycleOwner, "$this$addObserver");
        if (!m264635a().mo236984c(lifecycleOwner)) {
            lifecycleOwner.getLifecycle().addObserver(new UltimateBarXObserver());
            m264635a().mo236981b(lifecycleOwner);
        }
    }

    /* renamed from: a */
    private static final boolean m264645a(View view, BarBackground aVar) {
        if (aVar.mo236956d() > 0) {
            view.setBackgroundResource(aVar.mo236956d());
            return true;
        } else if (aVar.mo236957e() > 0) {
            Context context = view.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context");
            view.setBackgroundColor(C68099b.m264687a(context, aVar.mo236957e()));
            return true;
        } else if (aVar.mo236955c() > Integer.MIN_VALUE) {
            view.setBackgroundColor(aVar.mo236955c());
            return true;
        } else {
            view.setBackgroundColor(0);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/zackratos/ultimatebarx/ultimatebarx/UltimateBarXManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.zackratos.ultimatebarx.ultimatebarx.b.a$a */
    static final class C68089a extends Lambda implements Function0<UltimateBarXManager> {
        public static final C68089a INSTANCE = new C68089a();

        C68089a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UltimateBarXManager invoke() {
            return UltimateBarXManager.f171319b.mo236993a();
        }
    }

    /* renamed from: b */
    public static final void m264648b(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$defaultStatusBar");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!m264635a().mo236987f(fragmentActivity2)) {
            m264643a(fragmentActivity, m264635a().mo236991j(fragmentActivity2));
        }
    }

    /* renamed from: c */
    public static final void m264651c(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$defaultNavigationBar");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!m264635a().mo236988g(fragmentActivity2)) {
            m264649b(fragmentActivity, m264635a().mo236992k(fragmentActivity2));
        }
    }

    /* renamed from: d */
    private static final void m264654d(FragmentActivity fragmentActivity) {
        View view;
        View childAt;
        Window window = fragmentActivity.getWindow();
        ViewGroup viewGroup = null;
        if (window != null) {
            view = window.getDecorView();
        } else {
            view = null;
        }
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewWithTag("activity_root_view_parent");
        }
        if (viewGroup == null) {
            viewGroup = (ViewGroup) fragmentActivity.findViewById(16908290);
            if (viewGroup != null) {
                viewGroup.setTag("activity_root_view_parent");
            }
            if (viewGroup != null) {
                viewGroup.setClipToPadding(false);
            }
        }
        if (!(viewGroup == null || (childAt = viewGroup.getChildAt(0)) == null)) {
            childAt.setFitsSystemWindows(false);
        }
        C68098a.m264684a(fragmentActivity);
    }

    /* renamed from: b */
    private static final ViewGroup m264646b(Fragment fragment) {
        View requireView = fragment.requireView();
        Intrinsics.checkExpressionValueIsNotNull(requireView, "requireView()");
        if (requireView instanceof FrameLayout) {
            ((FrameLayout) requireView).setClipToPadding(false);
            return (ViewGroup) requireView;
        } else if (requireView instanceof RelativeLayout) {
            ((RelativeLayout) requireView).setClipToPadding(false);
            return (ViewGroup) requireView;
        } else {
            FrameLayout frameLayout = new FrameLayout(fragment.requireContext());
            frameLayout.setClipToPadding(false);
            frameLayout.setTag(R.id.fragment_container_view_tag, fragment);
            ViewParent parent = requireView.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int indexOfChild = viewGroup.indexOfChild(requireView);
                viewGroup.removeViewAt(indexOfChild);
                viewGroup.addView(frameLayout, indexOfChild);
            }
            frameLayout.addView(requireView);
            m264635a().mo236983c().set(fragment, frameLayout);
            return frameLayout;
        }
    }

    /* renamed from: a */
    public static final void m264640a(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$ultimateBarXInitialization");
        Fragment fragment2 = fragment;
        if (!m264635a().mo236989h(fragment2)) {
            m264646b(fragment);
            UltimateBarXManager a = m264635a();
            FragmentActivity requireActivity = fragment.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
            BarConfig j = a.mo236991j(requireActivity);
            BarConfig j2 = m264635a().mo236991j(fragment2);
            j2.mo236968c(j.mo236969d());
            m264635a().mo236979a(fragment2, j2);
            UltimateBarXManager a2 = m264635a();
            FragmentActivity requireActivity2 = fragment.requireActivity();
            Intrinsics.checkExpressionValueIsNotNull(requireActivity2, "requireActivity()");
            BarConfig k = a2.mo236992k(requireActivity2);
            BarConfig k2 = m264635a().mo236992k(fragment2);
            k2.mo236968c(k.mo236969d());
            m264635a().mo236982b(fragment2, k2);
            m264635a().mo236990i(fragment2);
        }
    }

    /* renamed from: a */
    public static final void m264642a(FragmentActivity fragmentActivity) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$ultimateBarXInitialization");
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (!m264635a().mo236989h(fragmentActivity2)) {
            m264635a().mo236977a(fragmentActivity);
            m264654d(fragmentActivity);
            m264635a().mo236990i(fragmentActivity2);
        }
    }

    /* renamed from: b */
    public static final void m264647b(Fragment fragment, BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$updateNavigationBar");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        BarConfig a = BarConfig.f171313a.mo236974a().mo236962a().mo236963a(bVar.mo236969d());
        FragmentActivity requireActivity = fragment.requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        m264649b(requireActivity, a);
        m264653d(fragment, bVar);
        Fragment fragment2 = fragment;
        m264635a().mo236986e(fragment2);
        m264635a().mo236982b(fragment2, bVar);
    }

    /* renamed from: c */
    private static final void m264650c(Fragment fragment, BarConfig bVar) {
        View view;
        ViewGroup b = m264646b(fragment);
        m264638a(b, bVar.mo236966b());
        Creator a = m264636a(b, FragmentTag.f171350a.mo237020a(), C68099b.m264690c(m264635a().mo236980b()));
        if (a != null) {
            Context requireContext = fragment.requireContext();
            Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
            view = a.mo237018a(requireContext, bVar.mo236966b());
        } else {
            view = null;
        }
        if (view != null) {
            m264637a(view, bVar, 23);
        }
    }

    /* renamed from: a */
    private static final void m264638a(ViewGroup viewGroup, boolean z) {
        int i;
        int paddingLeft = viewGroup.getPaddingLeft();
        if (z) {
            i = C68087b.m264633a();
        } else {
            i = 0;
        }
        viewGroup.setPadding(paddingLeft, i, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
    }

    /* renamed from: c */
    private static final void m264652c(FragmentActivity fragmentActivity, BarConfig bVar) {
        ViewGroup viewGroup;
        Creator a;
        Window window = fragmentActivity.getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "window");
        FrameLayout frameLayout = (FrameLayout) window.getDecorView();
        View view = null;
        if (frameLayout != null) {
            viewGroup = (ViewGroup) frameLayout.findViewWithTag("activity_root_view_parent");
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            m264638a(viewGroup, bVar.mo236966b());
        }
        boolean c = C68099b.m264690c(m264635a().mo236980b());
        if (!(viewGroup == null || (a = m264636a(viewGroup, ActivityTag.f171345a.mo237014a(), c)) == null)) {
            view = a.mo237018a(fragmentActivity, bVar.mo236966b());
        }
        if (view != null) {
            m264637a(view, bVar, 23);
        }
    }

    /* renamed from: d */
    private static final void m264653d(Fragment fragment, BarConfig bVar) {
        View view;
        Rom a = m264635a().mo236975a();
        FragmentActivity requireActivity = fragment.requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        if (a.mo237009a(requireActivity)) {
            ViewGroup b = m264646b(fragment);
            boolean c = C68099b.m264690c(m264635a().mo236980b());
            m264639a(b, c, bVar.mo236966b());
            Creator a2 = m264636a(b, FragmentTag.f171350a.mo237020a(), c);
            if (a2 != null) {
                Context requireContext = fragment.requireContext();
                Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
                view = a2.mo237019b(requireContext, bVar.mo236966b());
            } else {
                view = null;
            }
            if (view != null) {
                m264637a(view, bVar, 26);
            }
        }
    }

    /* renamed from: b */
    public static final void m264649b(FragmentActivity fragmentActivity, BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "$this$updateNavigationBar");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        m264655d(fragmentActivity, bVar);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        m264635a().mo236986e(fragmentActivity2);
        m264635a().mo236982b(fragmentActivity2, bVar);
    }

    /* renamed from: d */
    private static final void m264655d(FragmentActivity fragmentActivity, BarConfig bVar) {
        ViewGroup viewGroup;
        Creator a;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (m264635a().mo236975a().mo237009a(fragmentActivity2)) {
            Window window = fragmentActivity.getWindow();
            Intrinsics.checkExpressionValueIsNotNull(window, "window");
            FrameLayout frameLayout = (FrameLayout) window.getDecorView();
            View view = null;
            if (frameLayout != null) {
                viewGroup = (ViewGroup) frameLayout.findViewWithTag("activity_root_view_parent");
            } else {
                viewGroup = null;
            }
            boolean c = C68099b.m264690c(m264635a().mo236980b());
            if (viewGroup != null) {
                m264639a(viewGroup, c, bVar.mo236966b());
            }
            if (!(viewGroup == null || (a = m264636a(viewGroup, ActivityTag.f171345a.mo237014a(), c)) == null)) {
                view = a.mo237019b(fragmentActivity2, bVar.mo236966b());
            }
            if (view != null) {
                m264637a(view, bVar, 26);
            }
        }
    }

    /* renamed from: a */
    public static final void m264641a(Fragment fragment, BarConfig bVar) {
        Intrinsics.checkParameterIsNotNull(fragment, "$this$updateStatusBar");
        Intrinsics.checkParameterIsNotNull(bVar, "config");
        BarConfig a = BarConfig.f171313a.mo236974a().mo236962a().mo236963a(bVar.mo236969d());
        FragmentActivity requireActivity = fragment.requireActivity();
        Intrinsics.checkExpressionValueIsNotNull(requireActivity, "requireActivity()");
        m264643a(requireActivity, a);
        m264650c(fragment, bVar);
        Fragment fragment2 = fragment;
        m264635a().mo236985d(fragment2);
        m264635a().mo236979a(fragment2, bVar);
    }

    /* renamed from: a */
    private static final Creator m264636a(ViewGroup viewGroup, Tag gVar, boolean z) {
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayoutCreator((FrameLayout) viewGroup, gVar, z);
        }
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayoutCreator((RelativeLayout) viewGroup, gVar, z);
        }
        return null;
    }

    /* renamed from: a */
    private static final void m264637a(View view, BarConfig bVar, int i) {
        if (Build.VERSION.SDK_INT < 21 || Build.VERSION.SDK_INT >= i || !bVar.mo236969d() || !m264645a(view, bVar.mo236970e())) {
            m264645a(view, bVar.mo236967c());
        }
    }

    /* renamed from: a */
    private static final void m264639a(ViewGroup viewGroup, boolean z, boolean z2) {
        int i = 0;
        if (z) {
            int paddingLeft = viewGroup.getPaddingLeft();
            int paddingTop = viewGroup.getPaddingTop();
            if (z2) {
                i = C68087b.m264634b();
            }
            viewGroup.setPadding(paddingLeft, paddingTop, i, viewGroup.getPaddingBottom());
            return;
        }
        int paddingLeft2 = viewGroup.getPaddingLeft();
        int paddingTop2 = viewGroup.getPaddingTop();
        int paddingRight = viewGroup.getPaddingRight();
        if (z2) {
            i = C68087b.m264634b();
        }
        viewGroup.setPadding(paddingLeft2, paddingTop2, paddingRight, i);
    }
}
