package com.ss.android.lark.framework.larkwidget;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C13998f;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 52\u00020\u0001:\u000256B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0002J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0019J\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0002\b\u001cJ\"\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0014\u0010\"\u001a\u00020\u000b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u000e\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0013J\r\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b(J\r\u0010)\u001a\u00020*H\u0000¢\u0006\u0002\b+J\u001e\u0010,\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0002\b.J/\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00052\b\u00101\u001a\u0004\u0018\u0001022\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0002\b3J%\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0006H\u0000¢\u0006\u0002\b3J\u000e\u00104\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u0013R*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "Landroidx/fragment/app/Fragment;", "()V", "activityResultRequests", "Ljava/util/HashMap;", "", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Lkotlin/collections/HashMap;", "listeners", "", "Lkotlin/Function0;", "", "managerMap", "", "Landroidx/lifecycle/Lifecycle;", "Lcom/ss/android/lark/framework/larkwidget/WidgetManager;", "myParentFragment", "widgetManagerCallbackList", "", "Lcom/ss/android/lark/framework/larkwidget/WidgetHost$WidgetLoadStateCallback;", "clear", "dispatchWidgetLoaded", "widget", "dispatchWidgetLoaded$larkwidget_release", "dispatchWidgetUnloaded", "dispatchWidgetUnloaded$larkwidget_release", "get", "lifecycle", "get$larkwidget_release", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "registerOnClearedListener", "listener", "registerWidgetLoadStateCallback", "callback", "requireWidgetContext", "Landroid/content/Context;", "requireWidgetContext$larkwidget_release", "requireWidgetHost", "", "requireWidgetHost$larkwidget_release", "set", "manager", "set$larkwidget_release", "startActivityForResult", "intent", "options", "Landroid/os/Bundle;", "startActivityForResult$larkwidget_release", "unregisterWidgetLoadStateCallback", "Companion", "WidgetLoadStateCallback", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.framework.larkwidget.a */
public final class WidgetHost extends Fragment {

    /* renamed from: b */
    public static final String f99037b = WidgetHost.class.getCanonicalName();

    /* renamed from: c */
    public static final Companion f99038c = new Companion(null);

    /* renamed from: a */
    public Fragment f99039a;

    /* renamed from: d */
    private final HashMap<Integer, Widget> f99040d = new HashMap<>();

    /* renamed from: e */
    private final List<WidgetLoadStateCallback> f99041e = new ArrayList();

    /* renamed from: f */
    private final Map<Lifecycle, WidgetManager> f99042f = new WeakHashMap();

    /* renamed from: g */
    private final Set<Function0<Unit>> f99043g = new LinkedHashSet();

    /* renamed from: h */
    private HashMap f99044h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/framework/larkwidget/WidgetHost$WidgetLoadStateCallback;", "", "onWidgetLoaded", "", "widget", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "onWidgetUnloaded", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.a$b */
    public interface WidgetLoadStateCallback {
        /* renamed from: a */
        void mo141210a(Widget widget);

        /* renamed from: b */
        void mo141211b(Widget widget);
    }

    /* renamed from: d */
    public void mo141208d() {
        HashMap hashMap = this.f99044h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo141208d();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0002\b\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/framework/larkwidget/WidgetHost$Companion;", "", "()V", "TAG", "", "kotlin.jvm.PlatformType", "createHost", "Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "activity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "createHost$larkwidget_release", "of", "widget", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.a$a */
    public static final class Companion {
        private Companion() {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/framework/larkwidget/WidgetHost$Companion$createHost$1$1", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "onFragmentViewDestroyed", "", "fm", "Landroidx/fragment/app/FragmentManager;", C13998f.f36682a, "Landroidx/fragment/app/Fragment;", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.lark.framework.larkwidget.a$a$a */
        public static final class C38531a extends FragmentManager.AbstractC1010b {

            /* renamed from: a */
            final /* synthetic */ WidgetHost f99045a;

            C38531a(WidgetHost aVar) {
                this.f99045a = aVar;
            }

            @Override // androidx.fragment.app.FragmentManager.AbstractC1010b
            /* renamed from: e */
            public void mo5411e(FragmentManager fragmentManager, Fragment fragment) {
                Intrinsics.checkParameterIsNotNull(fragmentManager, "fm");
                Intrinsics.checkParameterIsNotNull(fragment, C13998f.f36682a);
                if (fragment == this.f99045a.f99039a) {
                    fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                    fragment.getChildFragmentManager().beginTransaction().remove(this.f99045a).commitNowAllowingStateLoss();
                    this.f99045a.mo141201a();
                }
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WidgetHost mo141209a(FragmentActivity fragmentActivity, Fragment fragment) {
            FragmentManager fragmentManager;
            FragmentManager fragmentManager2;
            if (fragmentActivity == null || (fragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
                if (fragment == null) {
                    Intrinsics.throwNpe();
                }
                fragmentManager = fragment.getChildFragmentManager();
                Intrinsics.checkExpressionValueIsNotNull(fragmentManager, "fragment!!.childFragmentManager");
            }
            Fragment findFragmentByTag = fragmentManager.findFragmentByTag(WidgetHost.f99037b);
            if (!(findFragmentByTag instanceof WidgetHost)) {
                findFragmentByTag = null;
            }
            WidgetHost aVar = (WidgetHost) findFragmentByTag;
            if (aVar == null) {
                aVar = new WidgetHost();
                aVar.f99039a = fragment;
                if (!(fragment == null || (fragmentManager2 = fragment.getFragmentManager()) == null)) {
                    fragmentManager2.registerFragmentLifecycleCallbacks(new C38531a(aVar), false);
                }
                fragmentManager.beginTransaction().add(aVar, WidgetHost.f99037b).commitNowAllowingStateLoss();
            }
            return aVar;
        }
    }

    /* renamed from: b */
    public final Context mo141205b() {
        Context requireContext = requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "requireContext()");
        return requireContext;
    }

    /* renamed from: a */
    public final void mo141201a() {
        Iterator<T> it = this.f99043g.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        this.f99043g.clear();
    }

    /* renamed from: c */
    public final Object mo141207c() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Object requireHost = requireHost();
        Intrinsics.checkExpressionValueIsNotNull(requireHost, "requireHost()");
        return requireHost;
    }

    /* renamed from: a */
    public final WidgetManager mo141200a(Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        return this.f99042f.get(lifecycle);
    }

    /* renamed from: b */
    public final void mo141206b(Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        Iterator<T> it = this.f99041e.iterator();
        while (it.hasNext()) {
            it.next().mo141211b(widget);
        }
    }

    /* renamed from: a */
    public final void mo141203a(Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        Iterator<T> it = this.f99041e.iterator();
        while (it.hasNext()) {
            it.next().mo141210a(widget);
        }
        if (widget.mo141186M()) {
            widget.mo141192b(false);
        }
    }

    /* renamed from: a */
    public final void mo141204a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "listener");
        this.f99043g.add(function0);
    }

    /* renamed from: a */
    public final void mo141202a(Lifecycle lifecycle, WidgetManager bVar) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(bVar, "manager");
        this.f99042f.put(lifecycle, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Widget widget = this.f99040d.get(Integer.valueOf(i));
        if (widget != null) {
            widget.onActivityResult(i, i2, intent);
        }
        this.f99040d.remove(Integer.valueOf(i));
    }
}
