package com.bytedance.ee.bear.widgets.dialog;

import android.content.Context;
import android.content.DialogInterface;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001:\u0002NOB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J$\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J.\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\r2\b\b\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0001\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J,\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0015\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0011J\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u0010\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u001aJ\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\"J\u0010\u0010#\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\"J\u0010\u0010*\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020,J\u000e\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u00101\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020,J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020,J\u000e\u00103\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000fJ\u0010\u00103\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u000e\u00104\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ&\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\rJ\u0010\u0010:\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010<\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020=J\u000e\u0010>\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020?J&\u0010@\u001a\u00020\u00002\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\rJ\u000e\u0010A\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\"J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u0006\u0010C\u001a\u00020\u001eJ\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0018\u001a\u00020\rJ\u000e\u0010D\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u000fJ\u0010\u0010D\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u000e\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u001aJ\u0010\u0010G\u001a\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\rJ\u000e\u0010H\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010I\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ&\u0010J\u001a\u00020\u00002\u0006\u00106\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u00108\u001a\u00020\r2\u0006\u00109\u001a\u00020\rJ\u000e\u0010K\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010L\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\rJ\u000e\u0010M\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020,R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006P"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/BearUDDialogBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "builder", "Lcom/larksuite/component/universe_design/dialog/UDDialogBuilder;", "actionButtonOrientation", "value", "Lcom/bytedance/ee/bear/widgets/dialog/BearUDDialogBuilder$ActionBottomOrientation;", "addActionButton", "actionBuilder", "Lcom/bytedance/ee/bear/widgets/dialog/BearUDDialogBuilder$ActionBuilder;", "", "text", "", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "textRes", "textColorRes", "", "addViewClickListener", "listener", "animStyle", "style", "autoDismiss", "", "backgroundColor", "backgroundResource", "build", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "cancelOnTouchOutside", "cancelable", "contentLayout", "Landroid/view/View;", "contentLayoutRes", "controller", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "footerLayout", "footerLayoutRes", "gravity", "headerLayout", "headerLayoutRes", "height", "", "lifecycleCallback", "callback", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$LifecycleCallback;", "marginInDp", "maskAlpha", "maxHeight", "message", "messageGravity", "messagePadding", "left", "top", "right", "bottom", "messageTextColor", "messageTextSize", "onCancelListener", "Landroid/content/DialogInterface$OnCancelListener;", "onDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "paddingInDp", "rootLayout", "rootLayoutRes", "show", "title", "titleBold", "bold", "titleColor", "titleGravity", "titleLineCount", "titlePadding", "titleSize", "translationOnY", "width", "ActionBottomOrientation", "ActionBuilder", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class BearUDDialogBuilder {

    /* renamed from: a */
    private final UDDialogBuilder f31905a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/BearUDDialogBuilder$ActionBottomOrientation;", "", "(Ljava/lang/String;I)V", "HORIZONTAL", "VERTICAL", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    public enum ActionBottomOrientation {
        HORIZONTAL,
        VERTICAL
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45353a(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        this.f31905a.title(charSequence);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45354a(boolean z) {
        this.f31905a.titleBold(z);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45352a(ActionBuilder aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "actionBuilder");
        this.f31905a.addActionButton(aVar.mo45371a());
        return this;
    }

    /* renamed from: a */
    public final UDDialog mo45355a() {
        return this.f31905a.build();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010'\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u0010\u0010\u000f\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u0006\u0010)\u001a\u00020*J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u0004J\u0010\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u0010\u0010!\u001a\u00020\u00002\b\b\u0001\u0010(\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u0004R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\b¨\u0006+"}, d2 = {"Lcom/bytedance/ee/bear/widgets/dialog/BearUDDialogBuilder$ActionBuilder;", "", "()V", "actionLayoutId", "", "getActionLayoutId", "()I", "setActionLayoutId", "(I)V", "actionTextRes", "getActionTextRes", "setActionTextRes", "bgColorRes", "getBgColorRes", "setBgColorRes", "bgDrawableRes", "getBgDrawableRes", "setBgDrawableRes", "onClickListener", "Landroid/content/DialogInterface$OnClickListener;", "getOnClickListener", "()Landroid/content/DialogInterface$OnClickListener;", "setOnClickListener", "(Landroid/content/DialogInterface$OnClickListener;)V", "text", "", "getText", "()Ljava/lang/CharSequence;", "setText", "(Ljava/lang/CharSequence;)V", "textColor", "getTextColor", "setTextColor", "textColorRes", "getTextColorRes", "setTextColorRes", "textSize", "getTextSize", "setTextSize", "actionResId", "value", "build", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder$ActionBuilder;", "ccm-widget_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder$a */
    public static final class ActionBuilder {

        /* renamed from: a */
        private int f31906a;

        /* renamed from: b */
        private int f31907b;

        /* renamed from: c */
        private CharSequence f31908c;

        /* renamed from: d */
        private int f31909d;

        /* renamed from: e */
        private int f31910e;

        /* renamed from: f */
        private int f31911f;

        /* renamed from: g */
        private int f31912g;

        /* renamed from: h */
        private int f31913h;

        /* renamed from: i */
        private DialogInterface.OnClickListener f31914i;

        /* renamed from: a */
        public final UDBaseDialogBuilder.ActionBuilder mo45371a() {
            return new UDBaseDialogBuilder.ActionBuilder().mo90702a(this.f31906a).mo90706b(this.f31907b).mo90704a(this.f31908c).mo90707c(this.f31909d).mo90710d(this.f31910e).mo90712e(this.f31911f).mo90714f(this.f31912g).mo90716g(this.f31913h).mo90703a(this.f31914i);
        }

        /* renamed from: a */
        public final ActionBuilder mo45369a(int i) {
            ActionBuilder aVar = this;
            aVar.f31906a = i;
            return aVar;
        }

        /* renamed from: b */
        public final ActionBuilder mo45372b(int i) {
            ActionBuilder aVar = this;
            aVar.f31907b = i;
            return aVar;
        }

        /* renamed from: c */
        public final ActionBuilder mo45373c(int i) {
            ActionBuilder aVar = this;
            aVar.f31910e = i;
            return aVar;
        }

        /* renamed from: a */
        public final ActionBuilder mo45370a(DialogInterface.OnClickListener onClickListener) {
            ActionBuilder aVar = this;
            aVar.f31914i = onClickListener;
            return aVar;
        }
    }

    /* renamed from: b */
    public final UDDialog mo45359b() {
        UDDialog a = mo45355a();
        a.show();
        return a;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45343a(float f) {
        this.f31905a.width(f);
        return this;
    }

    /* renamed from: b */
    public final BearUDDialogBuilder mo45356b(int i) {
        this.f31905a.titleColor(i);
        return this;
    }

    /* renamed from: c */
    public final BearUDDialogBuilder mo45360c(int i) {
        this.f31905a.messageGravity(i);
        return this;
    }

    /* renamed from: d */
    public final BearUDDialogBuilder mo45362d(int i) {
        this.f31905a.message(i);
        return this;
    }

    /* renamed from: e */
    public final BearUDDialogBuilder mo45364e(int i) {
        this.f31905a.messageTextSize(i);
        return this;
    }

    /* renamed from: f */
    public final BearUDDialogBuilder mo45365f(int i) {
        this.f31905a.messageTextColor(i);
        return this;
    }

    /* renamed from: g */
    public final BearUDDialogBuilder mo45366g(int i) {
        this.f31905a.marginInDp(i);
        return this;
    }

    /* renamed from: h */
    public final BearUDDialogBuilder mo45367h(int i) {
        this.f31905a.style(i);
        return this;
    }

    /* renamed from: i */
    public final BearUDDialogBuilder mo45368i(int i) {
        this.f31905a.animStyle(i);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45344a(int i) {
        this.f31905a.title(i);
        return this;
    }

    /* renamed from: b */
    public final BearUDDialogBuilder mo45357b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "value");
        this.f31905a.message(charSequence);
        return this;
    }

    /* renamed from: c */
    public final BearUDDialogBuilder mo45361c(boolean z) {
        this.f31905a.cancelable(z);
        return this;
    }

    /* renamed from: d */
    public final BearUDDialogBuilder mo45363d(boolean z) {
        this.f31905a.cancelOnTouchOutside(z);
        return this;
    }

    public BearUDDialogBuilder(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f31905a = new UDDialogBuilder(context);
        mo45358b(true);
    }

    /* renamed from: b */
    public final BearUDDialogBuilder mo45358b(boolean z) {
        this.f31905a.autoDismiss(z);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45349a(DialogInterface.OnCancelListener onCancelListener) {
        Intrinsics.checkParameterIsNotNull(onCancelListener, "value");
        this.f31905a.onCancelListener(onCancelListener);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45350a(DialogInterface.OnDismissListener onDismissListener) {
        Intrinsics.checkParameterIsNotNull(onDismissListener, "value");
        this.f31905a.onDismissListener(onDismissListener);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45351a(ActionBottomOrientation actionBottomOrientation) {
        UDBaseDialogBuilder.ActionBottomOrientation actionBottomOrientation2;
        Intrinsics.checkParameterIsNotNull(actionBottomOrientation, "value");
        if (actionBottomOrientation == ActionBottomOrientation.HORIZONTAL) {
            actionBottomOrientation2 = UDBaseDialogBuilder.ActionBottomOrientation.HORIZONTAL;
        } else {
            actionBottomOrientation2 = UDBaseDialogBuilder.ActionBottomOrientation.VERTICAL;
        }
        this.f31905a.actionButtonOrientation(actionBottomOrientation2);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45346a(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        this.f31905a.addActionButton(i, i2, onClickListener);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45347a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(charSequence, "text");
        this.f31905a.addActionButton(i, charSequence, onClickListener);
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45345a(int i, int i2, int i3, DialogInterface.OnClickListener onClickListener) {
        this.f31905a.addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(i).mo90706b(i2).mo90710d(i3).mo90703a(onClickListener));
        return this;
    }

    /* renamed from: a */
    public final BearUDDialogBuilder mo45348a(int i, String str, int i2, DialogInterface.OnClickListener onClickListener) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        this.f31905a.addActionButton(new UDBaseDialogBuilder.ActionBuilder().mo90702a(i).mo90704a(str).mo90710d(i2).mo90703a(onClickListener));
        return this;
    }
}
