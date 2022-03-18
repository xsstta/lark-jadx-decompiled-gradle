package com.larksuite.component.universe_design.timepicker.impl.action;

import android.content.Context;
import android.view.View;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.component.universe_design.util.CalendarDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0019\u001a\u00020\u001a\"\u000e\b\u0000\u0010\u001b*\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001b0\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010!H\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\n¨\u0006\""}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "leftActionText", "", "getLeftActionText", "()Ljava/lang/String;", "setLeftActionText", "(Ljava/lang/String;)V", "pickerViewMode", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "getPickerViewMode", "()Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "setPickerViewMode", "(Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;)V", "rightActionText", "getRightActionText", "setRightActionText", "timePickerActonListener", "Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "titleText", "getTitleText", "setTitleText", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.timepicker.impl.action.a */
public final class UDTimePickerController extends UDDialogController {

    /* renamed from: a */
    public UDTimePickerBuilder.TimePickerActonListener f63714a;

    /* renamed from: b */
    private PickerModel f63715b = PickerModel.MONTHDAY_HOUR_MINUTE_24H;

    /* renamed from: c */
    private String f63716c;

    /* renamed from: d */
    private String f63717d;

    /* renamed from: e */
    private String f63718e;

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View createView() {
        String str;
        String str2;
        String str3;
        View createView = super.createView();
        UDTimePickerActionView uDTimePickerActionView = null;
        if (createView == null) {
            return null;
        }
        if (createView instanceof UDTimePickerActionView) {
            uDTimePickerActionView = createView;
        }
        UDTimePickerActionView uDTimePickerActionView2 = uDTimePickerActionView;
        if (uDTimePickerActionView2 != null) {
            uDTimePickerActionView2.setPickerMode(this.f63715b);
            String str4 = this.f63718e;
            if (str4 != null) {
                str = str4;
            }
            uDTimePickerActionView2.setTitleText(str);
            String str5 = this.f63716c;
            if (str5 != null) {
                str2 = str5;
            }
            uDTimePickerActionView2.setLeftActionViewText(str2);
            String str6 = this.f63717d;
            if (str6 != null) {
                str3 = str6;
            }
            uDTimePickerActionView2.setRightActionViewText(str3);
            setupTextView(uDTimePickerActionView2.getTitleTextView(), getMTitleSize(), getMTitleTextColor());
            uDTimePickerActionView2.setLeftActionViewClickListener(new View$OnClickListenerC25789a(this));
            uDTimePickerActionView2.setRightActionViewClickListener(new View$OnClickListenerC25790b(this, uDTimePickerActionView2));
        }
        return createView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.action.a$a */
    static final class View$OnClickListenerC25789a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDTimePickerController f63719a;

        View$OnClickListenerC25789a(UDTimePickerController aVar) {
            this.f63719a = aVar;
        }

        public final void onClick(View view) {
            UDDialog mDialog = this.f63719a.getMDialog();
            if (mDialog != null) {
                mDialog.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTimePickerController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.larksuite.component.universe_design.timepicker.impl.action.a$b */
    static final class View$OnClickListenerC25790b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ UDTimePickerController f63720a;

        /* renamed from: b */
        final /* synthetic */ UDTimePickerActionView f63721b;

        View$OnClickListenerC25790b(UDTimePickerController aVar, UDTimePickerActionView uDTimePickerActionView) {
            this.f63720a = aVar;
            this.f63721b = uDTimePickerActionView;
        }

        public final void onClick(View view) {
            CalendarDate calendarDate = new CalendarDate(this.f63721b.getUDTimePicker().getSelectedCalendar());
            UDTimePickerBuilder.TimePickerActonListener timePickerActonListener = this.f63720a.f63714a;
            if (timePickerActonListener != null) {
                timePickerActonListener.onClickRightAction(this.f63720a.getMDialog(), calendarDate.getYear(), calendarDate.getMonth() - 1, calendarDate.getMonthDay(), calendarDate.getHour(), calendarDate.getMinute());
            }
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof UDTimePickerBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            UDTimePickerBuilder uDTimePickerBuilder = (UDTimePickerBuilder) uDBaseDialogBuilder;
            this.f63715b = uDTimePickerBuilder.mo91494a();
            this.f63714a = uDTimePickerBuilder.mo91495b();
            this.f63716c = uDTimePickerBuilder.mo91498c();
            this.f63717d = uDTimePickerBuilder.mo91499d();
            this.f63718e = uDTimePickerBuilder.mo91500e();
            return;
        }
        throw new IllegalArgumentException(("builder should be UDTimePickerBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
