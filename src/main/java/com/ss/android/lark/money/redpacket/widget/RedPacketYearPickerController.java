package com.ss.android.lark.money.redpacket.widget;

import android.content.Context;
import android.view.View;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerActionView;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder;
import com.larksuite.component.universe_design.timepicker.impl.data.PanelStyleData;
import com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController;
import com.larksuite.component.universe_design.util.CalendarDate;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\u0013\u001a\u00020\u0014\"\u000e\b\u0000\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00150\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00150\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/money/redpacket/widget/RedPacketYearPickerController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "leftActionText", "", "getLeftActionText", "()Ljava/lang/String;", "setLeftActionText", "(Ljava/lang/String;)V", "rightActionText", "getRightActionText", "setRightActionText", "timePickerActonListener", "Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "titleText", "getTitleText", "setTitleText", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "createView", "Landroid/view/View;", "Companion", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.widget.d */
public final class RedPacketYearPickerController extends UDDialogController {

    /* renamed from: b */
    public static final Companion f121279b = new Companion(null);

    /* renamed from: f */
    private static final int f121280f = f121280f;

    /* renamed from: a */
    public UDTimePickerBuilder.TimePickerActonListener f121281a;

    /* renamed from: c */
    private String f121282c;

    /* renamed from: d */
    private String f121283d;

    /* renamed from: e */
    private String f121284e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/money/redpacket/widget/RedPacketYearPickerController$Companion;", "", "()V", "START_YEAR", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.widget.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/money/redpacket/widget/RedPacketYearPickerController$createView$1", "Lcom/larksuite/component/universe_design/timepicker/impl/panel/BaseTimePickerController$PickerPanelDependency;", "getPanelStyleData", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PanelStyleData;", "getSelectedDate", "Ljava/util/Calendar;", "onSelected", "", "selectedDate", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.widget.d$b */
    public static final class C48194b implements BaseTimePickerController.PickerPanelDependency {

        /* renamed from: a */
        final /* synthetic */ PanelStyleData f121285a;

        /* renamed from: b */
        final /* synthetic */ UDTimePicker f121286b;

        @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController.PickerPanelDependency
        public PanelStyleData getPanelStyleData() {
            return this.f121285a;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController.PickerPanelDependency
        public Calendar getSelectedDate() {
            return this.f121286b.getSelectedCalendar();
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.panel.BaseTimePickerController.PickerPanelDependency
        public void onSelected(Calendar calendar) {
            Intrinsics.checkParameterIsNotNull(calendar, "selectedDate");
            this.f121286b.setSelectedCalendar(calendar);
        }

        C48194b(PanelStyleData panelStyleData, UDTimePicker uDTimePicker) {
            this.f121285a = panelStyleData;
            this.f121286b = uDTimePicker;
        }
    }

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
            UDTimePicker uDTimePicker = uDTimePickerActionView2.getUDTimePicker();
            PanelStyleData panelStyleData = new PanelStyleData(0, 0, false, false, 15, null);
            panelStyleData.setItemDividerVisibility(true);
            panelStyleData.setVisibleItemNum(5);
            int i = Calendar.getInstance().get(1);
            int i2 = f121280f;
            uDTimePicker.setPanelController(new RedPacketYearPanelController(getContext(), new C48194b(panelStyleData, uDTimePicker), i2, RangesKt.coerceAtLeast(i, i2)));
            uDTimePicker.showItemDivider();
            String str4 = this.f121284e;
            if (str4 != null) {
                str = str4;
            }
            uDTimePickerActionView2.setTitleText(str);
            String str5 = this.f121282c;
            if (str5 != null) {
                str2 = str5;
            }
            uDTimePickerActionView2.setLeftActionViewText(str2);
            String str6 = this.f121283d;
            if (str6 != null) {
                str3 = str6;
            }
            uDTimePickerActionView2.setRightActionViewText(str3);
            setupTextView(uDTimePickerActionView2.getTitleTextView(), getMTitleSize(), getMTitleTextColor());
            uDTimePickerActionView2.setLeftActionViewClickListener(new View$OnClickListenerC48195c(this));
            uDTimePickerActionView2.setRightActionViewClickListener(new View$OnClickListenerC48196d(this, uDTimePickerActionView2));
        }
        return createView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.widget.d$c */
    static final class View$OnClickListenerC48195c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketYearPickerController f121287a;

        View$OnClickListenerC48195c(RedPacketYearPickerController dVar) {
            this.f121287a = dVar;
        }

        public final void onClick(View view) {
            UDDialog mDialog = this.f121287a.getMDialog();
            if (mDialog != null) {
                mDialog.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedPacketYearPickerController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.widget.d$d */
    static final class View$OnClickListenerC48196d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RedPacketYearPickerController f121288a;

        /* renamed from: b */
        final /* synthetic */ UDTimePickerActionView f121289b;

        View$OnClickListenerC48196d(RedPacketYearPickerController dVar, UDTimePickerActionView uDTimePickerActionView) {
            this.f121288a = dVar;
            this.f121289b = uDTimePickerActionView;
        }

        public final void onClick(View view) {
            CalendarDate calendarDate = new CalendarDate(this.f121289b.getUDTimePicker().getSelectedCalendar());
            UDTimePickerBuilder.TimePickerActonListener timePickerActonListener = this.f121288a.f121281a;
            if (timePickerActonListener != null) {
                timePickerActonListener.onClickRightAction(this.f121288a.getMDialog(), calendarDate.getYear(), calendarDate.getMonth() - 1, calendarDate.getMonthDay(), calendarDate.getHour(), calendarDate.getMinute());
            }
        }
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof RedPacketYearPickerBuilder) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            RedPacketYearPickerBuilder cVar = (RedPacketYearPickerBuilder) uDBaseDialogBuilder;
            this.f121281a = cVar.mo168646a();
            this.f121282c = cVar.mo168650b();
            this.f121283d = cVar.mo168651c();
            this.f121284e = cVar.mo168652d();
            return;
        }
        throw new IllegalArgumentException(("builder should be RedPacketYearPickerBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
