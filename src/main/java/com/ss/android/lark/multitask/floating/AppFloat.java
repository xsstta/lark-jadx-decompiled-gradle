package com.ss.android.lark.multitask.floating;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.core.p028b.C0745a;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.universe_design.util.UDUiModeUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ContentStateChangeCallback;
import com.ss.android.lark.floating.LKUIFloat;
import com.ss.android.lark.floating.enums.ShowPattern;
import com.ss.android.lark.floating.enums.SidePattern;
import com.ss.android.lark.floating.interfaces.FloatCallbacks;
import com.ss.android.lark.floating.p1896c.AbstractC38339g;
import com.ss.android.lark.floating.utils.DisplayUtils;
import com.ss.android.lark.floating.widget.appfloat.WindowManagerProxy;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.multitask.C48335j;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.ss.android.lark.multitask.floating.b */
public final class AppFloat {

    /* renamed from: f */
    public static final Companion f121614f = new Companion(null);

    /* renamed from: a */
    public ContentStateChangeCallback f121615a;

    /* renamed from: b */
    public final List<Rect> f121616b = new ArrayList();

    /* renamed from: c */
    public final WeakHashMap<View, Rect> f121617c = new WeakHashMap<>();

    /* renamed from: d */
    public final Map<String, CustomViewData> f121618d = new LinkedHashMap();

    /* renamed from: e */
    public final OnMultiTaskButtonClickListener f121619e;

    /* renamed from: g */
    private boolean f121620g;

    /* renamed from: h */
    private boolean f121621h;

    /* renamed from: i */
    private boolean f121622i = true;

    /* renamed from: j */
    private int f121623j;

    /* renamed from: k */
    private WindowManager f121624k;

    /* renamed from: l */
    private boolean f121625l;

    /* renamed from: m */
    private WeakReference<Context> f121626m;

    /* renamed from: n */
    private final int[] f121627n = new int[2];

    /* renamed from: o */
    private boolean f121628o;

    /* renamed from: p */
    private boolean f121629p;

    /* renamed from: q */
    private LottieAnimationController f121630q = new LottieAnimationController();

    /* renamed from: com.ss.android.lark.multitask.floating.b$d */
    public interface OnMultiTaskButtonClickListener {
        /* renamed from: a */
        void mo168976a(View view);
    }

    /* renamed from: a */
    public final void mo168938a(ContentStateChangeCallback dVar) {
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$b */
    public static final class CustomViewData {

        /* renamed from: a */
        private int[] f121631a;

        /* renamed from: b */
        private Runnable f121632b;

        /* renamed from: c */
        private final String f121633c;

        /* renamed from: d */
        private final int f121634d;

        /* renamed from: e */
        private final Drawable f121635e;

        /* renamed from: b */
        public final Runnable mo168964b() {
            return this.f121632b;
        }

        /* renamed from: c */
        public final String mo168965c() {
            return this.f121633c;
        }

        /* renamed from: d */
        public final int mo168966d() {
            return this.f121634d;
        }

        /* renamed from: e */
        public final Drawable mo168967e() {
            return this.f121635e;
        }

        /* renamed from: a */
        public final int[] mo168963a() {
            return this.f121631a;
        }

        /* renamed from: a */
        public final void mo168961a(Runnable runnable) {
            this.f121632b = runnable;
        }

        /* renamed from: a */
        public final void mo168962a(int[] iArr) {
            this.f121631a = iArr;
        }

        public CustomViewData(String str, int i, Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(drawable, "drawable");
            this.f121633c = str;
            this.f121634d = i;
            this.f121635e = drawable;
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$c */
    public static final class MultiTaskView {

        /* renamed from: a */
        private final View f121636a;

        /* renamed from: b */
        private final View f121637b;

        /* renamed from: c */
        private final LKUILottieAnimationView f121638c;

        /* renamed from: d */
        private final FrameLayout f121639d;

        /* renamed from: e */
        private final View f121640e;

        /* renamed from: f */
        private final View f121641f;

        /* renamed from: g */
        private final CustomViewContainer f121642g;

        /* renamed from: h */
        private View f121643h;

        /* renamed from: a */
        public final View mo168968a() {
            return this.f121636a;
        }

        /* renamed from: b */
        public final View mo168969b() {
            return this.f121637b;
        }

        /* renamed from: c */
        public final LKUILottieAnimationView mo168970c() {
            return this.f121638c;
        }

        /* renamed from: d */
        public final FrameLayout mo168971d() {
            return this.f121639d;
        }

        /* renamed from: e */
        public final View mo168972e() {
            return this.f121640e;
        }

        /* renamed from: f */
        public final View mo168973f() {
            return this.f121641f;
        }

        /* renamed from: g */
        public final CustomViewContainer mo168974g() {
            return this.f121642g;
        }

        /* renamed from: h */
        public final View mo168975h() {
            return this.f121643h;
        }

        public MultiTaskView(View view) {
            Intrinsics.checkParameterIsNotNull(view, "rootView");
            this.f121643h = view;
            View g = ViewCompat.m4080g(view, (int) R.id.multitask_container);
            Intrinsics.checkExpressionValueIsNotNull(g, "ViewCompat.requireViewBy…, id.multitask_container)");
            this.f121636a = g;
            View findViewById = this.f121643h.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "rootView.findViewById<View>(id.divider)");
            this.f121637b = findViewById;
            View findViewById2 = this.f121643h.findViewById(R.id.basket_icon);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "rootView.findViewById(id.basket_icon)");
            this.f121638c = (LKUILottieAnimationView) findViewById2;
            View findViewById3 = this.f121643h.findViewById(R.id.vc_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "rootView.findViewById(id.vc_container)");
            this.f121639d = (FrameLayout) findViewById3;
            View findViewById4 = this.f121643h.findViewById(R.id.button_multitask_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "rootView.findViewById(id…tton_multitask_container)");
            this.f121640e = findViewById4;
            View findViewById5 = this.f121643h.findViewById(R.id.rvc_divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "rootView.findViewById<View>(id.rvc_divider)");
            this.f121641f = findViewById5;
            View findViewById6 = this.f121643h.findViewById(R.id.custom_view_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "rootView.findViewById(id.custom_view_container)");
            this.f121642g = (CustomViewContainer) findViewById6;
        }
    }

    /* renamed from: b */
    public final int mo168945b() {
        return this.f121623j;
    }

    /* renamed from: a */
    public final boolean mo168944a() {
        return this.f121622i;
    }

    /* renamed from: a */
    public final void mo168933a(Application application) {
        Intrinsics.checkParameterIsNotNull(application, "application");
        this.f121626m = new WeakReference<>(application);
        Object systemService = application.getSystemService("window");
        if (systemService != null) {
            this.f121624k = new WindowManagerProxy((WindowManager) systemService);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: a */
    public final void mo168935a(View view) {
        if (!this.f121620g) {
            m190527a(view, R.drawable.shape_float_round_pin_right);
        } else if (mo168955g() || mo168956h()) {
            ContentStateChangeCallback dVar = this.f121615a;
            if (dVar != null) {
                dVar.onContentStateChanged(false);
            }
        } else {
            view.setBackground(null);
            ContentStateChangeCallback dVar2 = this.f121615a;
            if (dVar2 != null) {
                dVar2.onContentStateChanged(true);
            }
        }
    }

    /* renamed from: a */
    public final void mo168936a(View view, boolean z) {
        ContentStateChangeCallback dVar;
        ContentStateChangeCallback dVar2;
        if (mo168955g() || mo168956h()) {
            if (z) {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                m190527a(view, iArr[0] + (view.getWidth() / 2) > DeviceUtils.getScreenWidth(view.getContext()) / 2 ? R.drawable.shape_float_round_pin_right : R.drawable.shape_float_round_pin_left);
            } else {
                m190527a(view, R.drawable.shape_float_round);
            }
            if (this.f121620g && (dVar = this.f121615a) != null) {
                dVar.onContentStateChanged(false);
                return;
            }
            return;
        }
        view.setBackground(null);
        if (this.f121620g && (dVar2 = this.f121615a) != null) {
            dVar2.onContentStateChanged(true);
        }
    }

    /* renamed from: a */
    public final void mo168939a(MultiTaskView cVar, View view) {
        if (view.getParent() != null) {
            Log.m165383e("FloatCreator", "fatal error: attached view has parent already!");
            return;
        }
        FrameLayout d = cVar.mo168971d();
        View b = cVar.mo168969b();
        d.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(UIHelper.dp2px(3.5f), UIHelper.dp2px(7.0f), UIHelper.dp2px(3.5f), 0);
        d.addView(view, layoutParams);
        d.setVisibility(0);
        this.f121620g = true;
        Log.m165389i("FloatCreator", "multitask add content view ");
        WeakReference<Context> weakReference = this.f121626m;
        if (!(weakReference == null || weakReference.get() == null || LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP") == null)) {
            this.f121628o = true;
            this.f121629p = true;
        }
        cVar.mo168975h().post(new RunnableC48298g(this, view, b, cVar));
    }

    /* renamed from: a */
    public final void mo168934a(Drawable drawable, int[] iArr, String str, int i, Runnable runnable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (this.f121618d.containsKey(str)) {
            Log.m165389i("FloatCreator", "This key (" + str + ") had been added!");
        } else if (this.f121618d.size() >= 5) {
            Log.m165389i("FloatCreator", "custom views count has reached the limit!");
        } else {
            Log.m165389i("FloatCreator", "addCustomView key : " + str);
            CustomViewData bVar = new CustomViewData(str, i, drawable);
            bVar.mo168962a(iArr);
            bVar.mo168961a(runnable);
            this.f121618d.put(str, bVar);
            View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
            if (e == null) {
                m190530a(mo168950d(null), false, (Function1<? super MultiTaskView, Unit>) new C48296e(this, bVar));
                return;
            }
            MultiTaskView cVar = new MultiTaskView(e);
            mo168940a(cVar, bVar);
            mo168936a(cVar.mo168968a(), true);
        }
    }

    /* renamed from: a */
    public final void mo168940a(MultiTaskView cVar, CustomViewData bVar) {
        this.f121621h = true;
        cVar.mo168974g().mo168909a(bVar);
        mo168947b(cVar.mo168975h(), true);
        ViewGroup.LayoutParams layoutParams = cVar.mo168974g().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = (this.f121623j > 0 || this.f121620g) ? 0 : -1;
        }
        if (this.f121622i) {
            cVar.mo168974g().setVisibility(0);
            int i = 8;
            cVar.mo168969b().setVisibility(mo168955g() ? 0 : 8);
            cVar.mo168972e().setVisibility(mo168955g() ? 0 : 8);
            cVar.mo168973f().setVisibility(this.f121620g ? 0 : 8);
            FrameLayout d = cVar.mo168971d();
            if (this.f121620g) {
                i = 0;
            }
            d.setVisibility(i);
            ContentStateChangeCallback dVar = this.f121615a;
            if (dVar != null) {
                dVar.onContentStateChanged(false);
            }
            mo168947b(cVar.mo168975h(), true);
        }
    }

    /* renamed from: a */
    public final void mo168941a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "key");
        if (!this.f121618d.containsKey(str)) {
            Log.m165389i("FloatCreator", "This key (" + str + ") had been removed!");
            return;
        }
        this.f121618d.remove(str);
        View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
        if (e != null) {
            MultiTaskView cVar = new MultiTaskView(e);
            cVar.mo168974g().mo168910a(str);
            this.f121621h = !this.f121618d.isEmpty();
            if (!mo168956h()) {
                cVar.mo168974g().setVisibility(8);
                if (mo168955g() || this.f121620g) {
                    if (!mo168955g() && this.f121620g) {
                        cVar.mo168973f().setVisibility(8);
                        cVar.mo168968a().setBackground(null);
                        ContentStateChangeCallback dVar = this.f121615a;
                        if (dVar != null) {
                            dVar.onContentStateChanged(true);
                        }
                    } else if (mo168955g() && !this.f121620g) {
                        cVar.mo168969b().setVisibility(8);
                    } else if (mo168955g() && this.f121620g) {
                        cVar.mo168973f().setVisibility(8);
                    }
                    mo168947b(e, true);
                } else {
                    mo168952e();
                }
            }
        }
        LKUIFloat.f98419d.mo140149a("TAG_FLOAT_APP", false);
    }

    /* renamed from: a */
    public final void mo168943a(boolean z, boolean z2, MultiTaskView cVar) {
        if (z) {
            m190531a(z2, cVar);
        } else {
            m190532b(z2, cVar);
        }
    }

    /* renamed from: a */
    public final void mo168942a(boolean z) {
        if (this.f121625l) {
            Log.m165389i("FloatCreator", "multitask over float is shown");
            return;
        }
        Log.m165389i("FloatCreator", "multitask update app state is foreground: " + z);
        this.f121622i = z;
        boolean z2 = false;
        if (LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP") != null) {
            View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
            if (e == null) {
                Intrinsics.throwNpe();
            }
            MultiTaskView cVar = new MultiTaskView(e);
            if (this.f121623j > 0) {
                z2 = true;
            }
            mo168943a(z, z2, cVar);
            mo168936a(cVar.mo168968a(), true);
            mo168947b(cVar.mo168975h(), true);
        } else if (z) {
            if (!this.f121620g && this.f121623j <= 0 && this.f121618d.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                m190530a(mo168950d(null), true, (Function1<? super MultiTaskView, Unit>) new C48312o(this, z));
            }
        }
    }

    /* renamed from: a */
    public final void mo168937a(Lifecycle lifecycle, View view) {
        Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
        Intrinsics.checkParameterIsNotNull(view, "view");
        lifecycle.addObserver(new AppFloat$setIdlePositionExclusionView$observer$1(this, view, new View$OnLayoutChangeListenerC48310m(this), new ViewTreeObserver$OnGlobalLayoutListenerC48309l(this, view)));
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$j */
    public static final class RunnableC48307j implements Runnable {

        /* renamed from: a */
        public static final RunnableC48307j f121656a = new RunnableC48307j();

        RunnableC48307j() {
        }

        public final void run() {
            LKUIFloat.f98419d.mo140156f("TAG_FLOAT_APP");
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$k */
    public static final class RunnableC48308k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f121657a;

        /* renamed from: b */
        final /* synthetic */ AppFloat f121658b;

        /* renamed from: c */
        final /* synthetic */ boolean f121659c;

        RunnableC48308k(View view, AppFloat bVar, boolean z) {
            this.f121657a = view;
            this.f121658b = bVar;
            this.f121659c = z;
        }

        public final void run() {
            this.f121658b.mo168947b(this.f121657a, !this.f121659c);
        }
    }

    /* renamed from: c */
    public final int mo168948c() {
        return C57744a.m224104a().getInt("multitask.lastDragYOnScreen", -1);
    }

    /* renamed from: g */
    public final boolean mo168955g() {
        if (this.f121623j <= 0 || !this.f121622i) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo168959k() {
        View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
        if (e != null) {
            this.f121619e.mo168976a(e);
        }
    }

    /* renamed from: m */
    private final boolean m190533m() {
        if (!this.f121620g && !mo168956h() && !mo168955g()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo168952e() {
        if (m190533m()) {
            this.f121630q.mo169028a();
            LKUIFloat.f98419d.mo140144a("TAG_FLOAT_APP");
        }
    }

    /* renamed from: h */
    public final boolean mo168956h() {
        if (!(!this.f121618d.isEmpty()) || !this.f121622i) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo168957i() {
        Context a = C48335j.m190643a().mo168869a();
        Intent intent = new Intent(a, MultiTaskCheckPermissionActivity.class);
        intent.addFlags(268435456);
        a.startActivity(intent);
    }

    /* renamed from: j */
    public final void mo168958j() {
        if (LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP") != null) {
            LKUIFloat.f98419d.mo140148a("TAG_FLOAT_APP", this.f121616b);
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$l */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC48309l implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ AppFloat f121660a;

        /* renamed from: b */
        final /* synthetic */ View f121661b;

        public void onGlobalLayout() {
            Rect remove;
            if (this.f121661b.getVisibility() == 8 && (remove = this.f121660a.f121617c.remove(this.f121661b)) != null) {
                this.f121660a.f121616b.remove(remove);
                this.f121660a.mo168958j();
            }
            if (this.f121661b.getVisibility() == 0) {
                this.f121660a.mo168953e(this.f121661b);
                this.f121660a.mo168958j();
            }
        }

        ViewTreeObserver$OnGlobalLayoutListenerC48309l(AppFloat bVar, View view) {
            this.f121660a = bVar;
            this.f121661b = view;
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$n */
    public static final class RunnableC48311n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppFloat f121663a;

        /* renamed from: b */
        final /* synthetic */ View f121664b;

        /* renamed from: c */
        final /* synthetic */ boolean f121665c;

        RunnableC48311n(AppFloat bVar, View view, boolean z) {
            this.f121663a = bVar;
            this.f121664b = view;
            this.f121665c = z;
        }

        public final void run() {
            int i;
            Pair<Integer, Integer> d = this.f121663a.mo168950d(this.f121664b);
            LKUIFloat.Companion bVar = LKUIFloat.f98419d;
            int intValue = d.getFirst().intValue();
            if (this.f121665c) {
                i = 0;
            } else {
                i = d.getSecond().intValue();
            }
            bVar.mo140147a("TAG_FLOAT_APP", intValue, i);
        }
    }

    /* renamed from: f */
    public final void mo168954f() {
        Activity b = C48335j.m190643a().mo168871b();
        if (b == null) {
            LKUIFloat.f98419d.mo140153c("TAG_FLOAT_APP");
            return;
        }
        ArrayList<String> a = AppFloatFilter.f121667a.mo168995a();
        ComponentName componentName = b.getComponentName();
        Intrinsics.checkExpressionValueIsNotNull(componentName, "mCurrentActivity.componentName");
        if (a.contains(componentName.getClassName())) {
            mo168952e();
        } else {
            LKUIFloat.f98419d.mo140153c("TAG_FLOAT_APP");
        }
    }

    /* renamed from: d */
    public final void mo168951d() {
        ContentStateChangeCallback dVar;
        this.f121618d.clear();
        View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
        if (e != null) {
            MultiTaskView cVar = new MultiTaskView(e);
            cVar.mo168974g().mo168908a();
            cVar.mo168974g().setVisibility(8);
            cVar.mo168973f().setVisibility(8);
            this.f121621h = false;
            if (!mo168955g() && !this.f121620g) {
                mo168952e();
            } else if (mo168955g() && !this.f121620g) {
                cVar.mo168969b().setVisibility(8);
            } else if (!mo168955g() && this.f121620g && (dVar = this.f121615a) != null) {
                dVar.onContentStateChanged(true);
            }
        }
    }

    /* renamed from: l */
    public final void mo168960l() {
        View rootView;
        View childAt;
        if (this.f121628o) {
            this.f121628o = false;
            boolean z = this.f121629p;
            this.f121629p = false;
            View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
            if (e != null && (rootView = e.getRootView()) != null && (childAt = new MultiTaskView(rootView).mo168971d().getChildAt(0)) != null) {
                if (childAt.isLayoutRequested()) {
                    mo168947b(childAt, !z);
                } else {
                    childAt.post(new RunnableC48308k(childAt, this, z));
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$g */
    public static final class RunnableC48298g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AppFloat f121644a;

        /* renamed from: b */
        final /* synthetic */ View f121645b;

        /* renamed from: c */
        final /* synthetic */ View f121646c;

        /* renamed from: d */
        final /* synthetic */ MultiTaskView f121647d;

        RunnableC48298g(AppFloat bVar, View view, View view2, MultiTaskView cVar) {
            this.f121644a = bVar;
            this.f121645b = view;
            this.f121646c = view2;
            this.f121647d = cVar;
        }

        public final void run() {
            ViewGroup.LayoutParams layoutParams;
            ViewGroup.LayoutParams layoutParams2;
            AppFloat.m190529a(this.f121644a, this.f121645b, false, 2, (Object) null);
            if (this.f121644a.mo168955g()) {
                this.f121646c.setVisibility(0);
                this.f121647d.mo168972e().setVisibility(0);
                if (this.f121644a.mo168956h()) {
                    this.f121647d.mo168973f().setVisibility(0);
                    this.f121647d.mo168974g().setVisibility(0);
                    CustomViewContainer g = this.f121647d.mo168974g();
                    if (!(g == null || (layoutParams2 = g.getLayoutParams()) == null)) {
                        layoutParams2.width = 0;
                    }
                } else {
                    this.f121647d.mo168973f().setVisibility(8);
                    this.f121647d.mo168974g().setVisibility(8);
                }
                ContentStateChangeCallback dVar = this.f121644a.f121615a;
                if (dVar != null) {
                    dVar.onContentStateChanged(false);
                }
            } else {
                this.f121646c.setVisibility(8);
                this.f121647d.mo168972e().setVisibility(8);
                Drawable drawable = null;
                this.f121647d.mo168968a().setBackground(drawable);
                if (this.f121644a.mo168956h()) {
                    this.f121647d.mo168973f().setVisibility(0);
                    this.f121647d.mo168974g().setVisibility(0);
                    CustomViewContainer g2 = this.f121647d.mo168974g();
                    if (!(g2 == null || (layoutParams = g2.getLayoutParams()) == null)) {
                        layoutParams.width = 0;
                    }
                    ContentStateChangeCallback dVar2 = this.f121644a.f121615a;
                    if (dVar2 != null) {
                        dVar2.onContentStateChanged(false);
                    }
                } else {
                    this.f121647d.mo168973f().setVisibility(8);
                    this.f121647d.mo168974g().setVisibility(8);
                    this.f121647d.mo168968a().setBackground(drawable);
                    ContentStateChangeCallback dVar3 = this.f121644a.f121615a;
                    if (dVar3 != null) {
                        dVar3.onContentStateChanged(true);
                    }
                }
            }
            this.f121644a.mo168954f();
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$e */
    public static final class C48296e extends Lambda implements Function1<MultiTaskView, Unit> {
        final /* synthetic */ CustomViewData $customViewData;
        final /* synthetic */ AppFloat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48296e(AppFloat bVar, CustomViewData bVar2) {
            super(1);
            this.this$0 = bVar;
            this.$customViewData = bVar2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultiTaskView cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MultiTaskView cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            this.this$0.mo168940a(cVar, this.$customViewData);
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$f */
    public static final class C48297f extends Lambda implements Function1<MultiTaskView, Unit> {
        final /* synthetic */ View $view;
        final /* synthetic */ AppFloat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48297f(AppFloat bVar, View view) {
            super(1);
            this.this$0 = bVar;
            this.$view = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultiTaskView cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MultiTaskView cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            this.this$0.mo168939a(cVar, this.$view);
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$i */
    public static final class C48301i extends Lambda implements Function1<FloatCallbacks.Builder, Unit> {
        final /* synthetic */ boolean $banPermissionRequest$inlined;
        final /* synthetic */ Function1 $callback$inlined;
        final /* synthetic */ Pair $offset$inlined;
        final /* synthetic */ AppFloat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48301i(AppFloat bVar, Function1 function1, boolean z, Pair pair) {
            super(1);
            this.this$0 = bVar;
            this.$callback$inlined = function1;
            this.$banPermissionRequest$inlined = z;
            this.$offset$inlined = pair;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(FloatCallbacks.Builder aVar) {
            invoke(aVar);
            return Unit.INSTANCE;
        }

        public final void invoke(FloatCallbacks.Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
            aVar.mo140230a(new Function2<View, MotionEvent, Unit>(this) {
                /* class com.ss.android.lark.multitask.floating.AppFloat.C48301i.C483021 */
                final /* synthetic */ C48301i this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(View view, MotionEvent motionEvent) {
                    invoke(view, motionEvent);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view, MotionEvent motionEvent) {
                    ViewGroup.LayoutParams layoutParams;
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    Intrinsics.checkParameterIsNotNull(motionEvent, "<anonymous parameter 1>");
                    final MultiTaskView cVar = new MultiTaskView(view);
                    UICallbackExecutor.executeDelayed(new Runnable() {
                        /* class com.ss.android.lark.multitask.floating.AppFloat.C48301i.C483021.RunnableC483031 */

                        public final void run() {
                            this.this$0.this$0.mo168936a(cVar.mo168968a(), false);
                        }
                    }, 48);
                    if (this.this$0.this$0.mo168955g() && (layoutParams = cVar.mo168972e().getLayoutParams()) != null) {
                        layoutParams.width = UIHelper.dp2px(64.0f);
                    }
                }
            });
            aVar.mo140235c(new Function1<View, Unit>(this) {
                /* class com.ss.android.lark.multitask.floating.AppFloat.C48301i.C483042 */
                final /* synthetic */ C48301i this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    ViewGroup.LayoutParams layoutParams;
                    Intrinsics.checkParameterIsNotNull(view, "view");
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    this.this$0.this$0.mo168930a(iArr[1]);
                    MultiTaskView cVar = new MultiTaskView(view);
                    this.this$0.this$0.mo168936a(cVar.mo168968a(), true);
                    if (this.this$0.this$0.mo168955g() && (layoutParams = cVar.mo168972e().getLayoutParams()) != null) {
                        layoutParams.width = UIHelper.dp2px(64.0f);
                    }
                }
            });
            aVar.mo140229a(new Function1<View, Unit>(this) {
                /* class com.ss.android.lark.multitask.floating.AppFloat.C48301i.C483053 */
                final /* synthetic */ C48301i this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(View view) {
                    invoke(view);
                    return Unit.INSTANCE;
                }

                public final void invoke(View view) {
                    Intrinsics.checkParameterIsNotNull(view, "it");
                    Log.m165389i("FloatCreator", "multitask window show");
                    this.this$0.this$0.mo168960l();
                }
            });
            aVar.mo140233b(C48315d.INSTANCE);
            aVar.mo140228a(C48316e.INSTANCE);
            aVar.mo140231a(new Function3<Boolean, String, View, Unit>(this) {
                /* class com.ss.android.lark.multitask.floating.AppFloat.C48301i.C483064 */
                final /* synthetic */ C48301i this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* synthetic */ Unit invoke(Boolean bool, String str, View view) {
                    invoke(bool.booleanValue(), str, view);
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z, String str, View view) {
                    if (z) {
                        Log.m165389i("FloatCreator", "multitask window created success");
                        if (view != null) {
                            this.this$0.this$0.mo168935a(new MultiTaskView(view).mo168968a());
                            if (!new MultiTaskView(view).mo168974g().mo168912b() && (!this.this$0.this$0.f121618d.isEmpty())) {
                                new MultiTaskView(view).mo168974g().mo168911a(this.this$0.this$0.f121618d);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Log.m165389i("FloatCreator", "multitask window created failed: " + str);
                }
            });
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$m */
    public static final class View$OnLayoutChangeListenerC48310m implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ AppFloat f121662a;

        View$OnLayoutChangeListenerC48310m(AppFloat bVar) {
            this.f121662a = bVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f121662a.mo168953e(view);
            this.f121662a.mo168958j();
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$o */
    public static final class C48312o extends Lambda implements Function1<MultiTaskView, Unit> {
        final /* synthetic */ boolean $isForeground;
        final /* synthetic */ AppFloat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48312o(AppFloat bVar, boolean z) {
            super(1);
            this.this$0 = bVar;
            this.$isForeground = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultiTaskView cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MultiTaskView cVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            AppFloat bVar = this.this$0;
            bVar.mo168931a(bVar.mo168945b(), cVar.mo168970c());
            AppFloat bVar2 = this.this$0;
            boolean z2 = this.$isForeground;
            if (bVar2.mo168945b() > 0) {
                z = true;
            } else {
                z = false;
            }
            bVar2.mo168943a(z2, z, cVar);
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$p */
    public static final class C48313p extends Lambda implements Function1<MultiTaskView, Unit> {
        final /* synthetic */ int $size;
        final /* synthetic */ AppFloat this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48313p(AppFloat bVar, int i) {
            super(1);
            this.this$0 = bVar;
            this.$size = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MultiTaskView cVar) {
            invoke(cVar);
            return Unit.INSTANCE;
        }

        public final void invoke(MultiTaskView cVar) {
            boolean z;
            Intrinsics.checkParameterIsNotNull(cVar, "it");
            this.this$0.mo168931a(this.$size, cVar.mo168970c());
            AppFloat bVar = this.this$0;
            boolean a = bVar.mo168944a();
            if (this.$size > 0) {
                z = true;
            } else {
                z = false;
            }
            bVar.mo168943a(a, z, cVar);
        }
    }

    /* renamed from: com.ss.android.lark.multitask.floating.b$h */
    public static final class C48299h implements AbstractC38339g {

        /* renamed from: a */
        final /* synthetic */ AppFloat f121648a;

        /* renamed from: b */
        final /* synthetic */ Function1 f121649b;

        /* renamed from: c */
        final /* synthetic */ boolean f121650c;

        /* renamed from: d */
        final /* synthetic */ Pair f121651d;

        C48299h(AppFloat bVar, Function1 function1, boolean z, Pair pair) {
            this.f121648a = bVar;
            this.f121649b = function1;
            this.f121650c = z;
            this.f121651d = pair;
        }

        @Override // com.ss.android.lark.floating.p1896c.AbstractC38339g
        /* renamed from: a */
        public final void mo140249a(final View view) {
            View findViewById = view.findViewById(R.id.button_multitask_container);
            Intrinsics.checkExpressionValueIsNotNull(view, "rootView");
            MultiTaskView cVar = new MultiTaskView(view);
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.ss.android.lark.multitask.floating.AppFloat.C48299h.View$OnClickListenerC483001 */

                    /* renamed from: a */
                    final /* synthetic */ C48299h f121652a;

                    {
                        this.f121652a = r1;
                    }

                    public final void onClick(View view) {
                        OnMultiTaskButtonClickListener dVar = this.f121652a.f121648a.f121619e;
                        View view2 = view;
                        Intrinsics.checkExpressionValueIsNotNull(view2, "rootView");
                        dVar.mo168976a(view2);
                    }
                });
            }
            this.f121649b.invoke(cVar);
        }
    }

    public AppFloat(OnMultiTaskButtonClickListener dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "mListener");
        this.f121619e = dVar;
    }

    /* renamed from: b */
    public final void mo168946b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
        if (e == null) {
            m190530a(mo168950d(view), false, (Function1<? super MultiTaskView, Unit>) new C48297f(this, view));
        } else {
            MultiTaskView cVar = new MultiTaskView(e);
            mo168939a(cVar, view);
            mo168936a(cVar.mo168968a(), true);
        }
        LKUIFloat.f98419d.mo140149a("TAG_FLOAT_APP", true);
    }

    /* renamed from: e */
    public final void mo168953e(View view) {
        Rect rect;
        Rect rect2 = this.f121617c.get(view);
        if (rect2 != null) {
            rect = rect2;
        } else {
            rect = new Rect();
        }
        Rect a = m190526a(view, rect);
        if (rect2 == null) {
            this.f121617c.put(view, a);
            this.f121616b.add(a);
        }
    }

    /* renamed from: c */
    public final void mo168949c(View view) {
        FrameLayout frameLayout;
        View view2;
        View view3;
        ViewGroup.LayoutParams layoutParams;
        Intrinsics.checkParameterIsNotNull(view, "view");
        View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
        View view4 = null;
        if (e != null) {
            frameLayout = (FrameLayout) e.findViewById(R.id.vc_container);
        } else {
            frameLayout = null;
        }
        if (e != null) {
            view2 = e.findViewById(R.id.divider);
        } else {
            view2 = null;
        }
        if (e != null) {
            view3 = e.findViewById(R.id.rvc_divider);
        } else {
            view3 = null;
        }
        if (e != null) {
            view4 = e.findViewById(R.id.custom_view_container);
        }
        if (frameLayout != null && this.f121620g) {
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
            Log.m165389i("FloatCreator", "multitask remove content view ");
            this.f121620g = false;
        }
        if (!mo168955g() || !mo168956h()) {
            if (mo168955g() && !mo168956h()) {
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                mo168947b(e, true);
            } else if (mo168955g() || !mo168956h()) {
                mo168952e();
            } else {
                if (view3 != null) {
                    view3.setVisibility(8);
                }
                if (!(view4 == null || (layoutParams = view4.getLayoutParams()) == null)) {
                    layoutParams.width = -1;
                }
            }
            if (e != null) {
                e.post(RunnableC48307j.f121656a);
            }
        } else if (view3 != null) {
            view3.setVisibility(8);
        }
        LKUIFloat.f98419d.mo140149a("TAG_FLOAT_APP", false);
    }

    /* renamed from: d */
    public final Pair<Integer, Integer> mo168950d(View view) {
        Context context;
        int i;
        Display defaultDisplay;
        WeakReference<Context> weakReference = this.f121626m;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        Rect rect = new Rect();
        if (context == null) {
            Log.m165383e("FloatCreator", "anchor activity is not exist");
            return new Pair<>(0, 0);
        }
        if (this.f121624k == null) {
            Object systemService = context.getSystemService("window");
            if (systemService != null) {
                this.f121624k = new WindowManagerProxy((WindowManager) systemService);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        WindowManager windowManager = this.f121624k;
        if (!(windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getRectSize(rect);
        }
        if (this.f121620g || view != null) {
            return new Pair<>(Integer.valueOf(UIHelper.dp2px(8.0f)), Integer.valueOf(UIHelper.dp2px(44.0f)));
        }
        int i2 = rect.bottom;
        if (mo168948c() < 0) {
            i = (int) (((float) i2) * 0.5f);
        } else {
            i = mo168948c() - DisplayUtils.f98497a.mo140266b(context);
        }
        float f = (float) i2;
        return new Pair<>(Integer.valueOf(UIHelper.dp2px(8.0f)), Integer.valueOf(C0745a.m3627a(i, (int) (0.2f * f), (int) (f * 0.8f))));
    }

    /* renamed from: a */
    public final void mo168930a(int i) {
        C57744a.m224104a().putInt("multitask.lastDragYOnScreen", i);
    }

    /* renamed from: a */
    public final void mo168931a(int i, LKUILottieAnimationView lKUILottieAnimationView) {
        this.f121630q.mo169029a(i, lKUILottieAnimationView);
    }

    /* renamed from: a */
    private final Rect m190526a(View view, Rect rect) {
        if (view.getVisibility() != 0) {
            return new Rect();
        }
        int[] iArr = this.f121627n;
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: a */
    private final void m190527a(View view, int i) {
        Context context = view.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (UDUiModeUtils.m93319a(context)) {
            int color = ContextCompat.getColor(view.getContext(), R.color.bg_float_overlay);
            Object tag = view.getTag(i);
            if (!(tag instanceof Integer) || color != ((Integer) tag).intValue()) {
                view.setBackgroundTintList(ColorStateList.valueOf(color));
                view.setTag(i, Integer.valueOf(color));
            }
        } else {
            view.setBackgroundTintList(null);
            view.setTag(i, null);
        }
        view.setBackgroundResource(i);
    }

    /* renamed from: b */
    private final void m190532b(boolean z, MultiTaskView cVar) {
        if (this.f121620g) {
            cVar.mo168972e().setVisibility(8);
            cVar.mo168969b().setVisibility(8);
            cVar.mo168968a().setBackground(null);
            cVar.mo168974g().setVisibility(8);
            cVar.mo168973f().setVisibility(8);
            ContentStateChangeCallback dVar = this.f121615a;
            if (dVar != null) {
                dVar.onContentStateChanged(true);
            }
            mo168954f();
        } else if (this.f121621h || z) {
            LKUIFloat.f98419d.mo140150b("TAG_FLOAT_APP");
        } else {
            mo168952e();
        }
    }

    /* renamed from: b */
    public final void mo168947b(View view, boolean z) {
        int i;
        if (view == null || !view.isLayoutRequested()) {
            Pair<Integer, Integer> d = mo168950d(view);
            LKUIFloat.Companion bVar = LKUIFloat.f98419d;
            int intValue = d.getFirst().intValue();
            if (z) {
                i = 0;
            } else {
                i = d.getSecond().intValue();
            }
            bVar.mo140147a("TAG_FLOAT_APP", intValue, i);
            return;
        }
        view.post(new RunnableC48311n(this, view, z));
    }

    /* renamed from: a */
    private final void m190531a(boolean z, MultiTaskView cVar) {
        int i;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = cVar.mo168974g().getLayoutParams();
        int i4 = 0;
        if (layoutParams != null) {
            if (this.f121623j > 0 || this.f121620g) {
                i3 = 0;
            } else {
                i3 = -1;
            }
            layoutParams.width = i3;
        }
        CustomViewContainer g = cVar.mo168974g();
        if (mo168956h()) {
            i = 0;
        } else {
            i = 8;
        }
        g.setVisibility(i);
        if (cVar.mo168974g().getVisibility() == 0 && cVar.mo168974g().getChildCount() == 0) {
            cVar.mo168974g().mo168911a(this.f121618d);
        }
        View f = cVar.mo168973f();
        if (!this.f121620g || !mo168956h()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        f.setVisibility(i2);
        if (!z) {
            cVar.mo168972e().setVisibility(8);
            cVar.mo168969b().setVisibility(8);
            if (!this.f121620g && !mo168956h()) {
                mo168952e();
            }
        } else {
            cVar.mo168972e().setVisibility(0);
            View b = cVar.mo168969b();
            if (!this.f121620g && !mo168956h()) {
                i4 = 8;
            }
            b.setVisibility(i4);
        }
        mo168954f();
    }

    /* renamed from: a */
    public final void mo168932a(int i, boolean z) {
        this.f121623j = i;
        Log.m165389i("FloatCreator", "multitask update task size " + i);
        boolean z2 = false;
        if (i == 0) {
            this.f121625l = false;
        }
        if (this.f121625l) {
            Log.m165389i("FloatCreator", "multitask over float is shown");
        } else if (LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP") == null) {
            m190530a(mo168950d(null), false, (Function1<? super MultiTaskView, Unit>) new C48313p(this, i));
        } else {
            View e = LKUIFloat.f98419d.mo140155e("TAG_FLOAT_APP");
            if (e == null) {
                Intrinsics.throwNpe();
            }
            MultiTaskView cVar = new MultiTaskView(e);
            mo168931a(i, cVar.mo168970c());
            boolean z3 = this.f121622i;
            if (i > 0) {
                z2 = true;
            }
            mo168943a(z3, z2, cVar);
            mo168936a(cVar.mo168968a(), true);
            mo168947b((View) null, z);
        }
    }

    /* renamed from: a */
    private final void m190530a(Pair<Integer, Integer> pair, boolean z, Function1<? super MultiTaskView, Unit> function1) {
        Context context;
        WeakReference<Context> weakReference = this.f121626m;
        if (weakReference != null) {
            context = weakReference.get();
        } else {
            context = null;
        }
        if (context == null) {
            Log.m165383e("FloatCreator", "anchor activity is not exist");
            return;
        }
        LKUIFloat.Builder a = LKUIFloat.f98419d.mo140141a(context).mo140129a(R.layout.container_multitask, new C48299h(this, function1, z, pair)).mo140133a("TAG_FLOAT_APP").mo140135a(true).mo140132a(SidePattern.RESULT_HORIZONTAL);
        Object[] array = AppFloatFilter.f121667a.mo168995a().toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            a.mo140136a((String[]) Arrays.copyOf(strArr, strArr.length)).mo140138b(true).mo140139c(z).mo140128a(8388613, pair.getFirst().intValue(), pair.getSecond().intValue()).mo140131a(ShowPattern.ALL_TIME).mo140134a(new C48301i(this, function1, z, pair)).mo140137a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public static /* synthetic */ void m190528a(AppFloat bVar, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        bVar.mo168932a(i, z);
    }

    /* renamed from: a */
    static /* synthetic */ void m190529a(AppFloat bVar, View view, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        bVar.mo168947b(view, z);
    }
}
