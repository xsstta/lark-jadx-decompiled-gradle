package com.ss.android.lark.framework.larkwidget;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.google.firebase.messaging.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\r\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7J\r\u00108\u001a\u000206H\u0001¢\u0006\u0002\b9J\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020=H\u0016J\"\u0010>\u001a\u0002062\u0006\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u00020!2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u000206H\u0017J\b\u0010D\u001a\u000206H\u0017J\b\u0010E\u001a\u000206H\u0017J\b\u0010F\u001a\u000206H\u0017J\b\u0010G\u001a\u000206H\u0017J\b\u0010H\u001a\u000206H\u0017J\r\u0010I\u001a\u000206H\u0001¢\u0006\u0002\bJJ\r\u0010K\u001a\u00020,H\u0000¢\u0006\u0002\bLJ\r\u0010M\u001a\u000206H\u0001¢\u0006\u0002\bNJ\u0015\u0010O\u001a\u0002062\u0006\u0010P\u001a\u00020\u000bH\u0000¢\u0006\u0002\bQJ\u0015\u0010\u0014\u001a\u0002062\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\bRJ\r\u0010S\u001a\u000206H\u0001¢\u0006\u0002\bTJ\u0010\u0010U\u001a\u0002062\u0006\u0010V\u001a\u00020BH\u0004J\u001a\u0010U\u001a\u0002062\u0006\u0010V\u001a\u00020B2\b\u0010W\u001a\u0004\u0018\u00010XH\u0004J\u0018\u0010Y\u001a\u0002062\u0006\u0010V\u001a\u00020B2\u0006\u0010?\u001a\u00020!H\u0004J\"\u0010Y\u001a\u0002062\u0006\u0010V\u001a\u00020B2\u0006\u0010?\u001a\u00020!2\b\u0010W\u001a\u0004\u0018\u00010XH\u0004J\r\u0010Z\u001a\u000206H\u0001¢\u0006\u0002\b[R\u001b\u0010\u0004\u001a\u00020\u00058@X\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\u0014\u0010 \u001a\u00020!8WX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001b\u0010$\u001a\u00020%8BX\u0002¢\u0006\f\n\u0004\b(\u0010\t\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020!8WX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#R\u001c\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u00104¨\u0006\\"}, d2 = {"Lcom/ss/android/lark/framework/larkwidget/Widget;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", "()V", "childWidgetManager", "Lcom/ss/android/lark/framework/larkwidget/WidgetManager;", "getChildWidgetManager$larkwidget_release", "()Lcom/ss/android/lark/framework/larkwidget/WidgetManager;", "childWidgetManager$delegate", "Lkotlin/Lazy;", "container", "Landroid/view/ViewGroup;", "getContainer", "()Landroid/view/ViewGroup;", "setContainer", "(Landroid/view/ViewGroup;)V", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "isDestroyed", "", "isDestroyed$larkwidget_release", "()Z", "setDestroyed$larkwidget_release", "(Z)V", "isFirstLoaded", "isFirstLoadedInternal", "isFirstLoadedInternal$larkwidget_release", "setFirstLoadedInternal$larkwidget_release", "layoutId", "", "getLayoutId", "()I", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry", "()Landroidx/lifecycle/LifecycleRegistry;", "lifecycleRegistry$delegate", "rootId", "getRootId", "widgetHost", "Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "getWidgetHost$larkwidget_release", "()Lcom/ss/android/lark/framework/larkwidget/WidgetHost;", "setWidgetHost$larkwidget_release", "(Lcom/ss/android/lark/framework/larkwidget/WidgetHost;)V", "widgetManager", "getWidgetManager$larkwidget_release", "setWidgetManager$larkwidget_release", "(Lcom/ss/android/lark/framework/larkwidget/WidgetManager;)V", "create", "", "create$larkwidget_release", "destroy", "destroy$larkwidget_release", "getHost", "", "getLifecycle", "Landroidx/lifecycle/Lifecycle;", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onDestroy", "onPause", "onResume", "onStart", "onStop", "pause", "pause$larkwidget_release", "requireWidgetHost", "requireWidgetHost$larkwidget_release", "resume", "resume$larkwidget_release", "setContainerView", "containerView", "setContainerView$larkwidget_release", "setContentView$larkwidget_release", "start", "start$larkwidget_release", "startActivity", "intent", "options", "Landroid/os/Bundle;", "startActivityForResult", "stop", "stop$larkwidget_release", "larkwidget_release"}, mo238835k = 1, mv = {1, 1, 15})
public class Widget implements LifecycleObserver, LifecycleOwner {

    /* renamed from: r */
    static final /* synthetic */ KProperty[] f99029r = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Widget.class), "childWidgetManager", "getChildWidgetManager$larkwidget_release()Lcom/ss/android/lark/framework/larkwidget/WidgetManager;"))};

    /* renamed from: a */
    private WidgetHost f99030a;

    /* renamed from: b */
    private boolean f99031b;

    /* renamed from: c */
    private View f99032c;

    /* renamed from: d */
    private boolean f99033d = true;

    /* renamed from: e */
    private final Lazy f99034e = LazyKt.lazy(new C38530b(this));

    /* renamed from: g */
    private final Lazy f99035g = LazyKt.lazy(new C38529a(this));

    /* renamed from: s */
    protected ViewGroup f99036s;

    /* renamed from: c */
    private final LifecycleRegistry mo121985c() {
        Lazy lazy = this.f99034e;
        KProperty kProperty = f99029r[0];
        return (LifecycleRegistry) lazy.getValue();
    }

    /* renamed from: A */
    public void mo123661A() {
    }

    /* renamed from: L */
    public final WidgetManager mo141185L() {
        Lazy lazy = this.f99035g;
        KProperty kProperty = f99029r[1];
        return (WidgetManager) lazy.getValue();
    }

    /* renamed from: d */
    public int mo121986d() {
        return 0;
    }

    /* renamed from: e */
    public void mo121987e() {
        this.f99031b = false;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onStop() {
    }

    /* renamed from: q */
    public void mo122000q() {
    }

    /* renamed from: r */
    public void mo122001r() {
        this.f99031b = true;
    }

    /* renamed from: u */
    public void mo123361u() {
    }

    /* renamed from: I */
    public final boolean mo141182I() {
        return this.f99031b;
    }

    /* renamed from: K */
    public final View mo141184K() {
        return this.f99032c;
    }

    /* renamed from: M */
    public final boolean mo141186M() {
        return this.f99033d;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return mo121985c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LifecycleRegistry;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.Widget$b */
    static final class C38530b extends Lambda implements Function0<LifecycleRegistry> {
        final /* synthetic */ Widget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38530b(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        @Override // kotlin.jvm.functions.Function0
        public final LifecycleRegistry invoke() {
            return new LifecycleRegistry(this.this$0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final ViewGroup mo141183J() {
        ViewGroup viewGroup = this.f99036s;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("container");
        }
        return viewGroup;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create$larkwidget_release() {
        mo121987e();
        mo121985c().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$larkwidget_release() {
        mo122001r();
        mo121985c().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    /* renamed from: o */
    public final Object mo141195o() {
        return mo141187N().mo141207c();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause$larkwidget_release() {
        mo122000q();
        mo121985c().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume$larkwidget_release() {
        mo123361u();
        mo121985c().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start$larkwidget_release() {
        mo123661A();
        mo121985c().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop$larkwidget_release() {
        onStop();
        mo121985c().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/framework/larkwidget/WidgetManager;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.framework.larkwidget.Widget$a */
    static final class C38529a extends Lambda implements Function0<WidgetManager> {
        final /* synthetic */ Widget this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38529a(Widget widget) {
            super(0);
            this.this$0 = widget;
        }

        @Override // kotlin.jvm.functions.Function0
        public final WidgetManager invoke() {
            return WidgetManager.f99047e.mo141219a(this.this$0.getLifecycle(), this.this$0.mo141187N(), this.this$0.mo141184K());
        }
    }

    /* renamed from: N */
    public final WidgetHost mo141187N() {
        WidgetHost aVar = this.f99030a;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void mo141188a(View view) {
        this.f99032c = view;
    }

    /* renamed from: b */
    public final void mo141192b(boolean z) {
        this.f99033d = z;
    }

    /* renamed from: a */
    public final void mo141189a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "containerView");
        this.f99036s = viewGroup;
    }

    /* renamed from: b */
    public final void mo141191b(View view) {
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        this.f99032c = view;
    }

    /* renamed from: a */
    public final void mo141190a(WidgetHost aVar) {
        this.f99030a = aVar;
    }
}
