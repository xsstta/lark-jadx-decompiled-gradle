package com.larksuite.component.universe_design.toast;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0013\u0014\u0015\u0016\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J$\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u000e\u001a\u00020\rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToast;", "", "()V", "LENGTH_LONG", "", "LENGTH_SHORT", "build", "Lcom/larksuite/component/universe_design/toast/UDToast$Builder;", "context", "Landroid/content/Context;", "makeToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "stringId", "", "drawableId", "text", "", "show", "", "Builder", "Duration", "Factory", "OnActionClickListener", "OnToastDismissListener", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDToast {
    public static final UDToast INSTANCE = new UDToast();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToast$Duration;", "", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface Duration {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToast$OnActionClickListener;", "", "onActionClick", "", "toast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.UDToast$c */
    public interface OnActionClickListener {
        void onActionClick(UDToastImpl dVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "", "onToastDismiss", "", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.UDToast$d */
    public interface OnToastDismissListener {
        /* renamed from: a */
        void mo36915a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)J\u0018\u0010*\u001a\u00020\u00002\b\b\u0001\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u0006J\u0016\u0010*\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\n2\u0006\u0010,\u001a\u00020\u0006J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0014J\u001e\u0010/\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018J\u000e\u00100\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u001cJ\u0010\u00100\u001a\u00020\u00002\b\b\u0001\u00101\u001a\u00020\u0018J\u000e\u00102\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0010J\u000e\u00104\u001a\u00020\u00002\u0006\u0010.\u001a\u00020 J\u0010\u00104\u001a\u00020\u00002\b\b\u0001\u00101\u001a\u00020\u0018J\u0006\u00105\u001a\u000206R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\n@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00148@@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001c@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u0005\u001a\u0004\u0018\u00010 @BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u001e\u0010$\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u001e\u0010&\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0018@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001b¨\u00067"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToast$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "<set-?>", "Lcom/larksuite/component/universe_design/toast/UDToast$OnActionClickListener;", "actionListener", "getActionListener$universe_ui_toast_release", "()Lcom/larksuite/component/universe_design/toast/UDToast$OnActionClickListener;", "", "actionText", "getActionText$universe_ui_toast_release", "()Ljava/lang/String;", "getContext$universe_ui_toast_release", "()Landroid/content/Context;", "Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "dismissListener", "getDismissListener$universe_ui_toast_release", "()Lcom/larksuite/component/universe_design/toast/UDToast$OnToastDismissListener;", "", "duration", "getDuration$universe_ui_toast_release", "()J", "", "gravity", "getGravity$universe_ui_toast_release", "()I", "Landroid/graphics/drawable/Drawable;", "icon", "getIcon$universe_ui_toast_release", "()Landroid/graphics/drawable/Drawable;", "", "text", "getText$universe_ui_toast_release", "()Ljava/lang/CharSequence;", "xOffset", "getXOffset$universe_ui_toast_release", "yOffset", "getYOffset$universe_ui_toast_release", "build", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "setAction", "textRes", "action", "setDuration", "value", "setGravity", "setIcon", "valueRes", "setOnDismissListener", "dismiss", "setText", "show", "", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.UDToast$a */
    public static final class Builder {

        /* renamed from: a */
        private CharSequence f63777a;

        /* renamed from: b */
        private Drawable f63778b;

        /* renamed from: c */
        private long f63779c = -1;

        /* renamed from: d */
        private String f63780d;

        /* renamed from: e */
        private OnActionClickListener f63781e;

        /* renamed from: f */
        private OnToastDismissListener f63782f;

        /* renamed from: g */
        private int f63783g = 80;

        /* renamed from: h */
        private int f63784h;

        /* renamed from: i */
        private int f63785i;

        /* renamed from: j */
        private final Context f63786j;

        /* renamed from: a */
        public final CharSequence mo91645a() {
            return this.f63777a;
        }

        /* renamed from: b */
        public final Drawable mo91646b() {
            return this.f63778b;
        }

        /* renamed from: c */
        public final long mo91648c() {
            return this.f63779c;
        }

        /* renamed from: d */
        public final String mo91649d() {
            return this.f63780d;
        }

        /* renamed from: e */
        public final OnActionClickListener mo91650e() {
            return this.f63781e;
        }

        /* renamed from: f */
        public final OnToastDismissListener mo91651f() {
            return this.f63782f;
        }

        /* renamed from: g */
        public final int mo91652g() {
            return this.f63783g;
        }

        /* renamed from: h */
        public final int mo91653h() {
            return this.f63784h;
        }

        /* renamed from: i */
        public final int mo91654i() {
            return this.f63785i;
        }

        /* renamed from: l */
        public final Context mo91657l() {
            return this.f63786j;
        }

        /* renamed from: j */
        public final UDToastImpl mo91655j() {
            return Factory.f63787a.mo91658a(this);
        }

        /* renamed from: k */
        public final void mo91656k() {
            mo91655j().show();
        }

        /* renamed from: a */
        public final Builder mo91640a(long j) {
            Builder aVar = this;
            aVar.f63779c = j;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo91637a(int i) {
            Builder aVar = this;
            aVar.f63777a = aVar.f63786j.getString(i);
            return aVar;
        }

        /* renamed from: b */
        public final Builder mo91647b(int i) {
            Builder aVar = this;
            aVar.f63778b = UDIconUtils.getIconDrawable(aVar.f63786j, i);
            return aVar;
        }

        public Builder(Context context) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            this.f63786j = context;
            this.f63785i = (int) UDDimenUtils.m93308a(context, (int) SmActions.ACTION_ONTHECALL_EXIT);
        }

        /* renamed from: a */
        public final Builder mo91641a(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "value");
            Builder aVar = this;
            aVar.f63778b = drawable;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo91642a(OnToastDismissListener dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "dismiss");
            Builder aVar = this;
            aVar.f63782f = dVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo91643a(CharSequence charSequence) {
            Intrinsics.checkParameterIsNotNull(charSequence, "value");
            Builder aVar = this;
            aVar.f63777a = charSequence;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo91639a(int i, OnActionClickListener cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "action");
            Builder aVar = this;
            aVar.f63780d = aVar.f63786j.getString(i);
            aVar.f63781e = cVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo91644a(String str, OnActionClickListener cVar) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            Intrinsics.checkParameterIsNotNull(cVar, "action");
            Builder aVar = this;
            aVar.f63780d = str;
            aVar.f63781e = cVar;
            return aVar;
        }

        /* renamed from: a */
        public final Builder mo91638a(int i, int i2, int i3) {
            Builder aVar = this;
            aVar.f63783g = i;
            aVar.f63784h = i2;
            aVar.f63785i = i3;
            return aVar;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/larksuite/component/universe_design/toast/UDToast$Factory;", "", "()V", "createActionToast", "Lcom/larksuite/component/universe_design/toast/UDToastImpl;", "builder", "Lcom/larksuite/component/universe_design/toast/UDToast$Builder;", "createGlobalToast", "createToast", "universe-ui-toast_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.toast.UDToast$b */
    public static final class Factory {

        /* renamed from: a */
        public static final Factory f63787a = new Factory();

        private Factory() {
        }

        /* renamed from: c */
        private final UDToastImpl m93218c(Builder aVar) {
            int i;
            UDGlobalToast cVar = new UDGlobalToast(aVar.mo91657l());
            CharSequence a = aVar.mo91645a();
            if (a != null) {
                cVar.setText(a);
            }
            Drawable b = aVar.mo91646b();
            if (b != null) {
                cVar.mo91663a(b);
            }
            cVar.setGravity(aVar.mo91652g(), aVar.mo91653h(), aVar.mo91654i());
            if (aVar.mo91648c() == -2) {
                i = 1;
            } else {
                i = 0;
            }
            cVar.setDuration(i);
            return cVar;
        }

        /* renamed from: a */
        public final UDToastImpl mo91658a(Builder aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "builder");
            if ((aVar.mo91649d() != null || aVar.mo91648c() > 0 || aVar.mo91651f() != null) && (aVar.mo91657l() instanceof Activity)) {
                return m93217b(aVar);
            }
            return m93218c(aVar);
        }

        /* renamed from: b */
        private final UDToastImpl m93217b(Builder aVar) {
            String d;
            Context l = aVar.mo91657l();
            if (l != null) {
                UDActionToast aVar2 = new UDActionToast((Activity) l);
                CharSequence a = aVar.mo91645a();
                if (a != null) {
                    aVar2.setText(a);
                }
                Drawable b = aVar.mo91646b();
                if (b != null) {
                    aVar2.mo91663a(b);
                }
                OnActionClickListener e = aVar.mo91650e();
                if (!(e == null || (d = aVar.mo91649d()) == null)) {
                    aVar2.mo91665a(d, e);
                }
                aVar2.mo91661a(aVar.mo91652g(), aVar.mo91653h(), aVar.mo91654i());
                long j = 4000;
                if (aVar.mo91648c() != -1) {
                    if (aVar.mo91648c() == -2) {
                        j = 7000;
                    } else if (aVar.mo91648c() >= 0) {
                        j = aVar.mo91648c();
                    }
                }
                aVar2.mo91662a(j);
                aVar2.mo91664a(aVar.mo91651f());
                return aVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    private UDToast() {
    }

    @JvmStatic
    public static final Builder build(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return new Builder(context);
    }

    @JvmStatic
    public static final UDToastImpl makeToast(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        UDGlobalToast cVar = new UDGlobalToast(context);
        cVar.setText(i);
        return cVar;
    }

    @JvmStatic
    public static final void show(Context context, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        makeToast(context, i).show();
    }

    @JvmStatic
    public static final UDToastImpl makeToast(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDGlobalToast cVar = new UDGlobalToast(context);
        cVar.setText(str);
        return cVar;
    }

    @JvmStatic
    public static final void show(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        makeToast(context, str).show();
    }

    @JvmStatic
    public static final UDToastImpl makeToast(Context context, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        UDGlobalToast cVar = new UDGlobalToast(context);
        cVar.setText(i);
        cVar.mo91660a(i2);
        return cVar;
    }

    @JvmStatic
    public static final void show(Context context, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        makeToast(context, i, i2).show();
    }

    @JvmStatic
    public static final UDToastImpl makeToast(Context context, String str, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDGlobalToast cVar = new UDGlobalToast(context);
        cVar.setText(str);
        cVar.mo91660a(i);
        return cVar;
    }

    @JvmStatic
    public static final void show(Context context, String str, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "text");
        makeToast(context, str, i).show();
    }
}
