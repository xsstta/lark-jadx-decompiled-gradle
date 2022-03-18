package com.ss.android.lark.money.redpacket.widget;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerActionView;
import com.larksuite.component.universe_design.timepicker.impl.action.UDTimePickerBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/money/redpacket/widget/RedPacketYearPickerBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "leftActionText", "", "getLeftActionText", "()Ljava/lang/String;", "setLeftActionText", "(Ljava/lang/String;)V", "rightActionText", "getRightActionText", "setRightActionText", "timePickerActonListener", "Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "getTimePickerActonListener", "()Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "setTimePickerActonListener", "(Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;)V", "titleText", "getTitleText", "setTitleText", "text", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.money.redpacket.widget.c */
public final class RedPacketYearPickerBuilder extends UDBaseDialogBuilder<RedPacketYearPickerBuilder> {

    /* renamed from: a */
    private UDTimePickerBuilder.TimePickerActonListener f121275a;

    /* renamed from: b */
    private String f121276b;

    /* renamed from: c */
    private String f121277c;

    /* renamed from: d */
    private String f121278d;

    /* renamed from: a */
    public final UDTimePickerBuilder.TimePickerActonListener mo168646a() {
        return this.f121275a;
    }

    /* renamed from: b */
    public final String mo168650b() {
        return this.f121276b;
    }

    /* renamed from: c */
    public final String mo168651c() {
        return this.f121277c;
    }

    /* renamed from: d */
    public final String mo168652d() {
        return this.f121278d;
    }

    /* renamed from: a */
    public final RedPacketYearPickerBuilder mo168647a(UDTimePickerBuilder.TimePickerActonListener timePickerActonListener) {
        Intrinsics.checkParameterIsNotNull(timePickerActonListener, "timePickerActonListener");
        RedPacketYearPickerBuilder cVar = this;
        cVar.f121275a = timePickerActonListener;
        return cVar;
    }

    /* renamed from: b */
    public final RedPacketYearPickerBuilder mo168649b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        RedPacketYearPickerBuilder cVar = this;
        cVar.f121277c = str;
        return cVar;
    }

    /* renamed from: a */
    public final RedPacketYearPickerBuilder mo168648a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        RedPacketYearPickerBuilder cVar = this;
        cVar.f121276b = str;
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RedPacketYearPickerBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        rootLayout(new UDTimePickerActionView(context, null, 0, 6, null));
        controller(new RedPacketYearPickerController(context));
        width(1.0f);
        gravity(80);
        marginInDp(0);
    }
}
