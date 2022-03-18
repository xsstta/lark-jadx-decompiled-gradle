package com.ss.android.lark.pin.impl.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u0007H\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u001c\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001a\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\tR\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/pin/impl/view/DesktopPinDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "lifecycleCallback", "Lkotlin/Function1;", "", "negativeText", "", "positiveBtnCallBack", "Lkotlin/Function0;", "positiveText", "title", "bindView", "negativeButton", "text", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "positiveButton", "callback", "setLifeCycleCallBack", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.view.a */
public final class DesktopPinDialog extends Dialog {

    /* renamed from: a */
    public Function0<Unit> f128521a;

    /* renamed from: b */
    private String f128522b = "";

    /* renamed from: c */
    private String f128523c = "";

    /* renamed from: d */
    private String f128524d = "";

    /* renamed from: e */
    private Function1<? super Dialog, Unit> f128525e;

    /* renamed from: a */
    private final void m200371a() {
        TextView textView = (TextView) findViewById(R.id.btn_cancel);
        textView.setText(this.f128522b);
        textView.setOnClickListener(new View$OnClickListenerC51649a(this));
        TextView textView2 = (TextView) findViewById(R.id.btn_confirm);
        textView2.setText(this.f128523c);
        textView2.setOnClickListener(new View$OnClickListenerC51650b(this));
        TextView textView3 = (TextView) findViewById(R.id.tv_pin_title);
        Intrinsics.checkExpressionValueIsNotNull(textView3, "tv_pin_title");
        textView3.setText(this.f128524d);
        ((ImageView) findViewById(R.id.iv_cancel)).setOnClickListener(new View$OnClickListenerC51651c(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/pin/impl/view/DesktopPinDialog$bindView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.view.a$a */
    public static final class View$OnClickListenerC51649a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopPinDialog f128526a;

        View$OnClickListenerC51649a(DesktopPinDialog aVar) {
            this.f128526a = aVar;
        }

        public final void onClick(View view) {
            this.f128526a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.view.a$c */
    public static final class View$OnClickListenerC51651c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopPinDialog f128528a;

        View$OnClickListenerC51651c(DesktopPinDialog aVar) {
            this.f128528a = aVar;
        }

        public final void onClick(View view) {
            this.f128528a.dismiss();
        }
    }

    /* renamed from: a */
    public final DesktopPinDialog mo177690a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        DesktopPinDialog aVar = this;
        aVar.f128522b = str;
        return aVar;
    }

    /* renamed from: b */
    public final DesktopPinDialog mo177693b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        DesktopPinDialog aVar = this;
        aVar.f128524d = str;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/pin/impl/view/DesktopPinDialog$bindView$2$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.pin.impl.view.a$b */
    public static final class View$OnClickListenerC51650b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopPinDialog f128527a;

        View$OnClickListenerC51650b(DesktopPinDialog aVar) {
            this.f128527a = aVar;
        }

        public final void onClick(View view) {
            this.f128527a.dismiss();
            Function0<Unit> function0 = this.f128527a.f128521a;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DesktopPinDialog(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.desktop_pin_dialog);
        m200371a();
        Function1<? super Dialog, Unit> function1 = this.f128525e;
        if (function1 != null) {
            function1.invoke(this);
        }
    }

    /* renamed from: a */
    public final DesktopPinDialog mo177692a(Function1<? super Dialog, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "lifecycleCallback");
        DesktopPinDialog aVar = this;
        aVar.f128525e = function1;
        return aVar;
    }

    /* renamed from: a */
    public final DesktopPinDialog mo177691a(String str, Function0<Unit> function0) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        Intrinsics.checkParameterIsNotNull(function0, "callback");
        DesktopPinDialog aVar = this;
        aVar.f128523c = str;
        aVar.f128521a = function0;
        return aVar;
    }
}
