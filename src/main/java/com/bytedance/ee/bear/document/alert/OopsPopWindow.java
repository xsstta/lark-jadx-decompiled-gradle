package com.bytedance.ee.bear.document.alert;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.document.alert.AlertModel;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.widgets.dialog.BearUDDialogBuilder;
import com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001!B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0018R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\""}, d2 = {"Lcom/bytedance/ee/bear/document/alert/OopsPopWindow;", "", "mContext", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "dialog", "Landroid/app/Dialog;", "getMContext", "()Landroid/app/Activity;", "onDismissCallback", "Lkotlin/Function0;", "", "getOnDismissCallback", "()Lkotlin/jvm/functions/Function0;", "setOnDismissCallback", "(Lkotlin/jvm/functions/Function0;)V", "onShowCallback", "getOnShowCallback", "setOnShowCallback", "executeCallbackAndDismiss", "buttonId", "", "inputText", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "getColor", "", "jsColor", "showInputTextDialog", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/document/alert/AlertModel;", "showNormalTextDialog", "showOops", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.alert.b */
public final class OopsPopWindow {

    /* renamed from: a */
    public static final Companion f15987a = new Companion(null);

    /* renamed from: b */
    private Function0<Unit> f15988b;

    /* renamed from: c */
    private Function0<Unit> f15989c;

    /* renamed from: d */
    private Dialog f15990d;

    /* renamed from: e */
    private final Activity f15991e;

    /* renamed from: a */
    private final int m22939a(int i) {
        return i != 1 ? i != 2 ? R.color.text_title : R.color.primary_pri_500 : R.color.function_danger_500;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/alert/OopsPopWindow$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Function0<Unit> mo22630a() {
        return this.f15989c;
    }

    /* renamed from: b */
    public final void mo22633b(Function0<Unit> function0) {
        this.f15989c = function0;
    }

    /* renamed from: a */
    public final void mo22632a(Function0<Unit> function0) {
        this.f15988b = function0;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onDismiss"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.b$f */
    public static final class DialogInterface$OnDismissListenerC5649f implements DialogInterface.OnDismissListener {

        /* renamed from: a */
        final /* synthetic */ OopsPopWindow f16004a;

        DialogInterface$OnDismissListenerC5649f(OopsPopWindow bVar) {
            this.f16004a = bVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            Function0<Unit> a = this.f16004a.mo22630a();
            if (a != null) {
                a.invoke();
            }
        }
    }

    public OopsPopWindow(Activity activity) {
        Intrinsics.checkParameterIsNotNull(activity, "mContext");
        this.f15991e = activity;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/alert/OopsPopWindow$showInputTextDialog$1", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "onClick", "", "text", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.b$b */
    public static final class C5645b implements BearUDInputDialogBuilder.OnBtnClickListener {

        /* renamed from: a */
        final /* synthetic */ OopsPopWindow f15992a;

        /* renamed from: b */
        final /* synthetic */ AlertModel f15993b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7947h f15994c;

        @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
        public void onClick(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            OopsPopWindow bVar = this.f15992a;
            AlertModel.ButtonsBean buttonsBean = this.f15993b.getButtons().get(1);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean, "data.buttons[1]");
            String id = buttonsBean.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.buttons[1].id");
            bVar.mo22631a(id, str, this.f15994c);
        }

        C5645b(OopsPopWindow bVar, AlertModel alertModel, AbstractC7947h hVar) {
            this.f15992a = bVar;
            this.f15993b = alertModel;
            this.f15994c = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/alert/OopsPopWindow$showInputTextDialog$builder$1", "Lcom/bytedance/ee/bear/widgets/dialog/inputdialog/BearUDInputDialogBuilder$OnBtnClickListener;", "onClick", "", "text", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.b$c */
    public static final class C5646c implements BearUDInputDialogBuilder.OnBtnClickListener {

        /* renamed from: a */
        final /* synthetic */ OopsPopWindow f15995a;

        /* renamed from: b */
        final /* synthetic */ AlertModel f15996b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7947h f15997c;

        @Override // com.bytedance.ee.bear.widgets.dialog.inputdialog.BearUDInputDialogBuilder.OnBtnClickListener
        public void onClick(String str) {
            Intrinsics.checkParameterIsNotNull(str, "text");
            OopsPopWindow bVar = this.f15995a;
            AlertModel.ButtonsBean buttonsBean = this.f15996b.getButtons().get(0);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean, "data.buttons[0]");
            String id = buttonsBean.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.buttons[0].id");
            bVar.mo22631a(id, str, this.f15997c);
        }

        C5646c(OopsPopWindow bVar, AlertModel alertModel, AbstractC7947h hVar) {
            this.f15995a = bVar;
            this.f15996b = alertModel;
            this.f15997c = hVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.b$d */
    public static final class DialogInterface$OnClickListenerC5647d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OopsPopWindow f15998a;

        /* renamed from: b */
        final /* synthetic */ AlertModel f15999b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7947h f16000c;

        DialogInterface$OnClickListenerC5647d(OopsPopWindow bVar, AlertModel alertModel, AbstractC7947h hVar) {
            this.f15998a = bVar;
            this.f15999b = alertModel;
            this.f16000c = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            OopsPopWindow bVar = this.f15998a;
            AlertModel.ButtonsBean buttonsBean = this.f15999b.getButtons().get(0);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean, "data.buttons[0]");
            String id = buttonsBean.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.buttons[0].id");
            bVar.mo22631a(id, null, this.f16000c);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.b$e */
    public static final class DialogInterface$OnClickListenerC5648e implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OopsPopWindow f16001a;

        /* renamed from: b */
        final /* synthetic */ AlertModel f16002b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7947h f16003c;

        DialogInterface$OnClickListenerC5648e(OopsPopWindow bVar, AlertModel alertModel, AbstractC7947h hVar) {
            this.f16001a = bVar;
            this.f16002b = alertModel;
            this.f16003c = hVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            OopsPopWindow bVar = this.f16001a;
            AlertModel.ButtonsBean buttonsBean = this.f16002b.getButtons().get(1);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean, "data.buttons[1]");
            String id = buttonsBean.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "data.buttons[1].id");
            bVar.mo22631a(id, null, this.f16003c);
        }
    }

    /* renamed from: a */
    public final Dialog mo22629a(AlertModel alertModel, AbstractC7947h hVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(alertModel, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(hVar, "callback");
        List<AlertModel.ButtonsBean> buttons = alertModel.getButtons();
        if (buttons != null) {
            i = buttons.size();
        } else {
            i = 0;
        }
        if (i <= 0) {
            C13479a.m54758a("OopsPopWindow", "show alert dialog data isn't right" + alertModel.toString());
            return null;
        }
        Dialog dialog = this.f15990d;
        if (dialog != null) {
            dialog.dismiss();
        }
        Function0<Unit> function0 = this.f15988b;
        if (function0 != null) {
            function0.invoke();
        }
        if (alertModel.getInput() == null) {
            m22940b(alertModel, hVar);
        } else {
            m22941c(alertModel, hVar);
        }
        Dialog dialog2 = this.f15990d;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new DialogInterface$OnDismissListenerC5649f(this));
        }
        return this.f15990d;
    }

    /* renamed from: b */
    private final void m22940b(AlertModel alertModel, AbstractC7947h hVar) {
        int i;
        BearUDDialogBuilder c = new BearUDDialogBuilder(this.f15991e).mo45361c(alertModel.isCancelable());
        if (!TextUtils.isEmpty(alertModel.getTitle())) {
            String title = alertModel.getTitle();
            Intrinsics.checkExpressionValueIsNotNull(title, "data.title");
            c.mo45353a(title);
        }
        if (!TextUtils.isEmpty(alertModel.getMessage())) {
            String message = alertModel.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "data.message");
            c.mo45357b(message);
        }
        if (alertModel.getOptions() != null) {
            AlertModel.OptionsBean options = alertModel.getOptions();
            Intrinsics.checkExpressionValueIsNotNull(options, "data.options");
            if (options.getMessage_align() == 1) {
                i = 17;
            } else {
                i = 8388611;
            }
            c.mo45360c(i);
        }
        int i2 = 0;
        AlertModel.ButtonsBean buttonsBean = alertModel.getButtons().get(0);
        Intrinsics.checkExpressionValueIsNotNull(buttonsBean, "data.buttons[0]");
        String text = buttonsBean.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "data.buttons[0].text");
        AlertModel.ButtonsBean buttonsBean2 = alertModel.getButtons().get(0);
        Intrinsics.checkExpressionValueIsNotNull(buttonsBean2, "data.buttons[0]");
        c.mo45348a(R.id.ud_dialog_btn_secondary, text, m22939a(buttonsBean2.getColor()), new DialogInterface$OnClickListenerC5647d(this, alertModel, hVar));
        List<AlertModel.ButtonsBean> buttons = alertModel.getButtons();
        if (buttons != null) {
            i2 = buttons.size();
        }
        if (i2 >= 2) {
            AlertModel.ButtonsBean buttonsBean3 = alertModel.getButtons().get(1);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean3, "data.buttons[1]");
            String text2 = buttonsBean3.getText();
            Intrinsics.checkExpressionValueIsNotNull(text2, "data.buttons[1].text");
            AlertModel.ButtonsBean buttonsBean4 = alertModel.getButtons().get(1);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean4, "data.buttons[1]");
            c.mo45348a(R.id.ud_dialog_btn_primary, text2, m22939a(buttonsBean4.getColor()), new DialogInterface$OnClickListenerC5648e(this, alertModel, hVar));
        }
        UDDialog a = c.mo45355a();
        this.f15990d = a;
        if (a != null) {
            a.show();
        }
    }

    /* renamed from: c */
    private final void m22941c(AlertModel alertModel, AbstractC7947h hVar) {
        int i = 0;
        BearUDInputDialogBuilder a = ((BearUDInputDialogBuilder) new BearUDInputDialogBuilder(this.f15991e).cancelable(false)).mo45393a(true).mo45392a("");
        String title = alertModel.getTitle();
        Intrinsics.checkExpressionValueIsNotNull(title, "data.title");
        BearUDInputDialogBuilder b = ((BearUDInputDialogBuilder) ((BearUDInputDialogBuilder) a.title(title)).titleGravity(17)).mo45397b(alertModel.getInput());
        AlertModel.ButtonsBean buttonsBean = alertModel.getButtons().get(0);
        Intrinsics.checkExpressionValueIsNotNull(buttonsBean, "data.buttons[0]");
        String text = buttonsBean.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "data.buttons[0].text");
        BearUDInputDialogBuilder b2 = b.mo45403d(text).mo45396b(new C5646c(this, alertModel, hVar));
        List<AlertModel.ButtonsBean> buttons = alertModel.getButtons();
        if (buttons != null) {
            i = buttons.size();
        }
        if (i >= 2) {
            AlertModel.ButtonsBean buttonsBean2 = alertModel.getButtons().get(1);
            Intrinsics.checkExpressionValueIsNotNull(buttonsBean2, "data.buttons[1]");
            String text2 = buttonsBean2.getText();
            Intrinsics.checkExpressionValueIsNotNull(text2, "data.buttons[1].text");
            b2.mo45400c(text2).mo45391a(new C5645b(this, alertModel, hVar));
        }
        this.f15990d = b2.show();
    }

    /* renamed from: a */
    public final void mo22631a(String str, String str2, AbstractC7947h hVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object) str);
        jSONObject.put("input", (Object) str2);
        hVar.mo17188a(jSONObject);
        Dialog dialog = this.f15990d;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
