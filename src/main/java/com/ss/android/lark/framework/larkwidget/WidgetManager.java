package com.ss.android.lark.framework.larkwidget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.p020b.p021a.C0489a;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ \u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J(\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020#H\u0002J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0019J\"\u0010$\u001a\u00020\u00002\b\b\u0001\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00192\b\b\u0002\u0010'\u001a\u00020#J\u0016\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020\u0019J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0019J\u0018\u0010+\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0002R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u00038BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018j\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a`\u001bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001dX\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/ss/android/lark/framework/larkwidget/WidgetManager;", "", "widgetHost", "Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "contentView", "Landroid/view/View;", "parentLifecycle", "Landroidx/lifecycle/Lifecycle;", "(Lcom/ss/android/lark/framework/larkwidget/WidgetHost;Landroid/view/View;Landroidx/lifecycle/Lifecycle;)V", "asyncLayoutInflater", "Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;", "getAsyncLayoutInflater", "()Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;", "asyncLayoutInflater$delegate", "Lkotlin/Lazy;", "syncLayoutInflater", "Landroid/view/LayoutInflater;", "getSyncLayoutInflater", "()Landroid/view/LayoutInflater;", "syncLayoutInflater$delegate", "getWidgetHost", "()Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "widgetHostInternal", "widgetViewGroupHashMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "Landroid/view/ViewGroup;", "Lkotlin/collections/HashMap;", "widgets", "Ljava/util/concurrent/CopyOnWriteArrayList;", "continueLoad", "", "widget", "parentView", "enableViewReuse", "", "load", "stubId", "", "asyncInflate", "replace", "oldWidget", "newWidget", "unload", "Companion", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.framework.larkwidget.b */
public final class WidgetManager {

    /* renamed from: a */
    static final /* synthetic */ KProperty[] f99046a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WidgetManager.class), "asyncLayoutInflater", "getAsyncLayoutInflater()Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(WidgetManager.class), "syncLayoutInflater", "getSyncLayoutInflater()Landroid/view/LayoutInflater;"))};

    /* renamed from: e */
    public static final Companion f99047e = new Companion(null);

    /* renamed from: b */
    public final CopyOnWriteArrayList<Widget> f99048b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public WidgetHost f99049c;

    /* renamed from: d */
    public final Lifecycle f99050d;

    /* renamed from: f */
    private final Lazy f99051f;

    /* renamed from: g */
    private final Lazy f99052g;

    /* renamed from: h */
    private final HashMap<Widget, ViewGroup> f99053h = new HashMap<>();

    /* renamed from: i */
    private final View f99054i;

    /* renamed from: b */
    private final C0489a m151967b() {
        Lazy lazy = this.f99051f;
        KProperty kProperty = f99046a[0];
        return (C0489a) lazy.getValue();
    }

    /* renamed from: c */
    private final LayoutInflater m151968c() {
        Lazy lazy = this.f99052g;
        KProperty kProperty = f99046a[1];
        return (LayoutInflater) lazy.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/framework/larkwidget/WidgetManager$Companion;", "", "()V", "create", "Lcom/ss/android/lark/framework/larkwidget/WidgetManager;", "fragmentActivity", "Landroidx/fragment/app/FragmentActivity;", "fragment", "Landroidx/fragment/app/Fragment;", "rootView", "Landroid/view/View;", "of", "activity", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "widgetHost", "Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "widget", "Lcom/ss/android/lark/framework/larkwidget/Widget;", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final WidgetManager mo141220a(Widget widget) {
            Intrinsics.checkParameterIsNotNull(widget, "widget");
            return widget.mo141185L();
        }

        /* renamed from: a */
        public final WidgetManager mo141218a(Fragment fragment, View view) {
            Intrinsics.checkParameterIsNotNull(fragment, "fragment");
            return m151975a((FragmentActivity) null, fragment, view);
        }

        /* renamed from: a */
        private final WidgetManager m151975a(FragmentActivity fragmentActivity, Fragment fragment, View view) {
            WidgetHost a = WidgetHost.f99038c.mo141209a(fragmentActivity, fragment);
            Companion aVar = WidgetManager.f99047e;
            Lifecycle lifecycle = a.getLifecycle();
            Intrinsics.checkExpressionValueIsNotNull(lifecycle, "it.lifecycle");
            return aVar.mo141219a(lifecycle, a, view);
        }

        /* renamed from: a */
        public final WidgetManager mo141219a(Lifecycle lifecycle, WidgetHost aVar, View view) {
            Intrinsics.checkParameterIsNotNull(lifecycle, "lifecycle");
            Intrinsics.checkParameterIsNotNull(aVar, "widgetHost");
            WidgetManager a = aVar.mo141200a(lifecycle);
            if (a != null) {
                return a;
            }
            WidgetManager bVar = new WidgetManager(aVar, view, lifecycle);
            aVar.mo141202a(lifecycle, bVar);
            return bVar;
        }

        /* renamed from: a */
        public static /* synthetic */ WidgetManager m151976a(Companion aVar, Fragment fragment, View view, int i, Object obj) {
            if ((i & 2) != 0) {
                view = null;
            }
            return aVar.mo141218a(fragment, view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/asynclayoutinflater/view/AsyncLayoutInflater;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.b$b */
    static final class C38533b extends Lambda implements Function0<C0489a> {
        final /* synthetic */ WidgetHost $widgetHost;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38533b(WidgetHost aVar) {
            super(0);
            this.$widgetHost = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C0489a invoke() {
            return new C0489a(this.$widgetHost.mo141205b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.b$d */
    static final class C38535d extends Lambda implements Function0<LayoutInflater> {
        final /* synthetic */ WidgetHost $widgetHost;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38535d(WidgetHost aVar) {
            super(0);
            this.$widgetHost = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LayoutInflater invoke() {
            return LayoutInflater.from(this.$widgetHost.mo141205b());
        }
    }

    /* renamed from: a */
    public final WidgetHost mo141212a() {
        WidgetHost aVar = this.f99049c;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: b */
    public final WidgetManager mo141217b(Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        return m151965a(widget, false);
    }

    /* renamed from: a */
    public final WidgetManager mo141214a(Widget widget) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        if (this.f99048b.contains(widget)) {
            return this;
        }
        widget.mo141190a(mo141212a());
        this.f99048b.add(widget);
        mo141212a().mo141203a(widget);
        this.f99050d.addObserver(widget);
        return this;
    }

    /* renamed from: a */
    private final WidgetManager m151965a(Widget widget, boolean z) {
        this.f99050d.removeObserver(widget);
        int i = C38536c.f99058a[this.f99050d.getCurrentState().ordinal()];
        if (i != 2) {
            if (i == 3) {
                widget.destroy$larkwidget_release();
            } else if (i == 4) {
                widget.stop$larkwidget_release();
                widget.destroy$larkwidget_release();
            } else if (i == 5) {
                widget.pause$larkwidget_release();
                widget.stop$larkwidget_release();
                widget.destroy$larkwidget_release();
            }
        } else if (!widget.mo141182I()) {
            widget.destroy$larkwidget_release();
        }
        widget.mo141190a((WidgetHost) null);
        this.f99048b.remove(widget);
        if (this.f99053h.containsKey(widget)) {
            ViewGroup viewGroup = this.f99053h.get(widget);
            if (!z) {
                if (viewGroup == null) {
                    Intrinsics.throwNpe();
                }
                viewGroup.removeAllViews();
                this.f99053h.remove(widget);
            }
        }
        mo141212a().mo141206b(widget);
        return this;
    }

    /* renamed from: a */
    public final WidgetManager mo141215a(Widget widget, Widget widget2) {
        Intrinsics.checkParameterIsNotNull(widget, "oldWidget");
        Intrinsics.checkParameterIsNotNull(widget2, "newWidget");
        if (Intrinsics.areEqual(widget, widget2)) {
            return this;
        }
        View K = widget.mo141184K();
        ViewGroup viewGroup = this.f99053h.get(widget);
        m151965a(widget, true);
        if (!(K == null || viewGroup == null)) {
            widget2.mo141190a(mo141212a());
            m151966a(widget2, viewGroup, K, true);
            this.f99053h.put(widget2, viewGroup);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo141216a(Widget widget, ViewGroup viewGroup, View view) {
        m151966a(widget, viewGroup, view, false);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/view/ViewGroup;", "onInflateFinished"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.b$c */
    public static final class C38534c implements C0489a.AbstractC0494d {

        /* renamed from: a */
        final /* synthetic */ WidgetManager f99055a;

        /* renamed from: b */
        final /* synthetic */ Widget f99056b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f99057c;

        C38534c(WidgetManager bVar, Widget widget, ViewGroup viewGroup) {
            this.f99055a = bVar;
            this.f99056b = widget;
            this.f99057c = viewGroup;
        }

        @Override // androidx.p020b.p021a.C0489a.AbstractC0494d
        /* renamed from: a */
        public final void mo2793a(View view, int i, ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            if (this.f99055a.f99049c != null && !this.f99055a.mo141212a().isDetached() && !this.f99055a.mo141212a().isRemoving() && this.f99055a.f99050d.getCurrentState() != Lifecycle.State.DESTROYED) {
                WidgetManager bVar = this.f99055a;
                Widget widget = this.f99056b;
                ViewGroup viewGroup2 = this.f99057c;
                Intrinsics.checkExpressionValueIsNotNull(viewGroup2, "container");
                bVar.mo141216a(widget, viewGroup2, view);
            }
        }
    }

    public WidgetManager(WidgetHost aVar, View view, Lifecycle lifecycle) {
        Intrinsics.checkParameterIsNotNull(aVar, "widgetHost");
        Intrinsics.checkParameterIsNotNull(lifecycle, "parentLifecycle");
        this.f99054i = view;
        this.f99050d = lifecycle;
        this.f99051f = LazyKt.lazy(new C38533b(aVar));
        this.f99052g = LazyKt.lazy(new C38535d(aVar));
        this.f99049c = aVar;
        aVar.mo141204a(new Function0<Unit>(this) {
            /* class com.ss.android.lark.framework.larkwidget.WidgetManager.C385321 */
            final /* synthetic */ WidgetManager this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                for (T t : this.this$0.f99048b) {
                    WidgetManager bVar = this.this$0;
                    Intrinsics.checkExpressionValueIsNotNull(t, "it");
                    bVar.mo141217b(t);
                }
                this.this$0.f99048b.clear();
                this.this$0.f99049c = null;
            }
        });
    }

    /* renamed from: a */
    public final WidgetManager mo141213a(int i, Widget widget, boolean z) {
        Intrinsics.checkParameterIsNotNull(widget, "widget");
        if (widget.mo121986d() <= 0) {
            return mo141214a(widget);
        }
        View view = this.f99054i;
        if (view != null) {
            widget.mo141190a(mo141212a());
            ViewGroup viewGroup = (ViewGroup) view.findViewById(i);
            Intrinsics.checkExpressionValueIsNotNull(viewGroup, "container");
            widget.mo141189a(viewGroup);
            this.f99053h.put(widget, viewGroup);
            if (z) {
                m151967b().mo2784a(widget.mo121986d(), viewGroup, new C38534c(this, widget, viewGroup));
            } else {
                View inflate = m151968c().inflate(widget.mo121986d(), viewGroup, false);
                Intrinsics.checkExpressionValueIsNotNull(inflate, "syncLayoutInflater.infla…youtId, container, false)");
                mo141216a(widget, viewGroup, inflate);
            }
            return this;
        }
        throw new IllegalArgumentException("make sure this WidgetManager is created with rootView".toString());
    }

    /* renamed from: a */
    private final void m151966a(Widget widget, ViewGroup viewGroup, View view, boolean z) {
        widget.mo141191b(view);
        if (!z) {
            viewGroup.addView(view);
        } else if (!Intrinsics.areEqual(view.getParent(), viewGroup)) {
            if (view.getParent() instanceof ViewGroup) {
                ViewParent parent = view.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(view);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            }
            viewGroup.addView(view);
        }
        this.f99048b.add(widget);
        mo141212a().mo141203a(widget);
        this.f99050d.addObserver(widget);
    }
}
