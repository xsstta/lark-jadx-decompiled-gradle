package com.larksuite.component.universe_design.toast;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowManager;
import com.larksuite.component.universe_design.toast.UDToast;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0016J\u001d\u0010#\u001a\u00020\"2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0%H\u0000¢\u0006\u0002\b&J\r\u0010'\u001a\u00020\"H\u0000¢\u0006\u0002\b(J\r\u0010)\u001a\u00020\"H\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020,H\u0016J\u0016\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201J\u0016\u0010-\u001a\u00020\"2\u0006\u00102\u001a\u00020\u00142\u0006\u00100\u001a\u000201J\u001e\u00103\u001a\u00020\"2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u0014J\u0010\u00104\u001a\u00020\"2\u0006\u00105\u001a\u000206H\u0016J\u0012\u00104\u001a\u00020\"2\b\b\u0001\u00102\u001a\u00020\u0014H\u0016J\u0010\u00107\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0016J\u0012\u00107\u001a\u00020\"2\b\b\u0001\u00102\u001a\u00020\u0014H\u0016J\b\u00108\u001a\u00020\"H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDActionToast;", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getActivity$universe_ui_toast_release", "()Landroid/app/Activity;", "dismissListener", "Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "getDismissListener$universe_ui_toast_release", "()Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "setDismissListener$universe_ui_toast_release", "(Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;)V", "duration", "", "getDuration$universe_ui_toast_release", "()J", "setDuration$universe_ui_toast_release", "(J)V", "gravity", "", "<set-?>", "state", "getState$universe_ui_toast_release", "()I", "toastView", "Landroid/view/View;", "viewController", "Lcom/larksuite/component/universe_design/toast/UDToastViewController;", "windowManager", "Landroid/view/WindowManager;", "xOffset", "yOffset", "cancel", "", "doDismiss", "onDismissed", "Lkotlin/Function0;", "doDismiss$universe_ui_toast_release", "doDismissImmediately", "doDismissImmediately$universe_ui_toast_release", "doShow", "doShow$universe_ui_toast_release", "isShowing", "", "setAction", "s", "", "action", "Lcom/larksuite/component/universe_design/toast/UDToast$OnActionClickListener;", "resId", "setGravity", "setIcon", "drawable", "Landroid/graphics/drawable/Drawable;", "setText", "show", "Companion", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.toast.a */
public final class UDActionToast implements UDToastImpl {

    /* renamed from: a */
    public static final Companion f63788a = new Companion(null);

    /* renamed from: b */
    private int f63789b;

    /* renamed from: c */
    private final WindowManager f63790c;

    /* renamed from: d */
    private final UDToastViewController f63791d;

    /* renamed from: e */
    private final View f63792e;

    /* renamed from: f */
    private int f63793f;

    /* renamed from: g */
    private int f63794g;

    /* renamed from: h */
    private int f63795h;

    /* renamed from: i */
    private long f63796i;

    /* renamed from: j */
    private UDToast.OnToastDismissListener f63797j;

    /* renamed from: k */
    private final Activity f63798k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDActionToast$Companion;", "", "()V", "DEFAULT_DURATION", "", "LENGTH_LONG", "LENGTH_SHORT", "STATE_CREATED", "", "STATE_PENDING", "STATE_SHOWING", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo91659a() {
        return this.f63789b;
    }

    /* renamed from: b */
    public final long mo91667b() {
        return this.f63796i;
    }

    /* renamed from: f */
    public final Activity mo91672f() {
        return this.f63798k;
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    /* renamed from: c */
    public boolean mo91668c() {
        if (this.f63789b == 2) {
            return true;
        }
        return false;
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    public void cancel() {
        if (this.f63789b == 2) {
            UDActionToastManager.f63803a.mo91682b(this);
        }
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    public void show() {
        if (this.f63789b < 1) {
            this.f63789b = 1;
            UDActionToastManager.f63803a.mo91680a(this);
        }
    }

    /* renamed from: e */
    public final void mo91671e() {
        this.f63789b = 0;
        this.f63791d.mo91709c();
        if (this.f63792e.isAttachedToWindow()) {
            this.f63790c.removeView(this.f63792e);
        }
        UDToast.OnToastDismissListener dVar = this.f63797j;
        if (dVar != null) {
            dVar.mo36915a();
        }
    }

    /* renamed from: d */
    public final void mo91670d() {
        if (!this.f63798k.isFinishing() && !this.f63798k.isDestroyed()) {
            this.f63791d.mo91706b();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.type = 2;
            layoutParams.format = 1;
            layoutParams.flags = 8;
            layoutParams.gravity = this.f63793f;
            layoutParams.x = this.f63794g;
            layoutParams.y = this.f63795h;
            this.f63790c.addView(this.f63792e, layoutParams);
            this.f63789b = 2;
            UDToastViewController.m93260a(this.f63791d, null, 1, null);
        }
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    /* renamed from: a */
    public void mo91660a(int i) {
        this.f63791d.mo91707b(i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/larksuite/component/universe_design/toast/UDActionToast$doDismiss$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "animation", "Landroid/animation/Animator;", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.a$b */
    public static final class C25801b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ UDActionToast f63799a;

        /* renamed from: b */
        final /* synthetic */ Function0 f63800b;

        public void onAnimationEnd(Animator animator) {
            this.f63799a.mo91671e();
            this.f63800b.invoke();
        }

        C25801b(UDActionToast aVar, Function0 function0) {
            this.f63799a = aVar;
            this.f63800b = function0;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.a$c */
    public static final class View$OnClickListenerC25802c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDActionToast f63801a;

        /* renamed from: b */
        final /* synthetic */ UDToast.OnActionClickListener f63802b;

        View$OnClickListenerC25802c(UDActionToast aVar, UDToast.OnActionClickListener cVar) {
            this.f63801a = aVar;
            this.f63802b = cVar;
        }

        public final void onClick(View view) {
            this.f63802b.onActionClick(this.f63801a);
        }
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    public void setText(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        this.f63791d.mo91704a(charSequence);
    }

    /* renamed from: a */
    public final void mo91662a(long j) {
        this.f63796i = j;
    }

    public UDActionToast(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        this.f63798k = activity;
        Object systemService = activity.getSystemService("window");
        if (systemService != null) {
            this.f63790c = (WindowManager) systemService;
            UDToastViewController fVar = new UDToastViewController(activity);
            this.f63791d = fVar;
            this.f63796i = 4000;
            this.f63792e = fVar.mo91700a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // com.larksuite.component.universe_design.toast.UDToastImpl
    /* renamed from: a */
    public void mo91663a(Drawable drawable) {
        Intrinsics.checkParameterIsNotNull(drawable, "drawable");
        this.f63791d.mo91703a(drawable);
    }

    /* renamed from: a */
    public final void mo91664a(UDToast.OnToastDismissListener dVar) {
        this.f63797j = dVar;
    }

    /* renamed from: a */
    public final void mo91666a(Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "onDismissed");
        this.f63791d.mo91708b(new C25801b(this, function0));
    }

    /* renamed from: a */
    public final void mo91665a(CharSequence charSequence, UDToast.OnActionClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "s");
        Intrinsics.checkParameterIsNotNull(cVar, "action");
        this.f63791d.mo91705a(charSequence, new View$OnClickListenerC25802c(this, cVar));
    }

    /* renamed from: a */
    public final void mo91661a(int i, int i2, int i3) {
        this.f63793f = i;
        this.f63794g = i2;
        this.f63795h = i3;
    }
}
