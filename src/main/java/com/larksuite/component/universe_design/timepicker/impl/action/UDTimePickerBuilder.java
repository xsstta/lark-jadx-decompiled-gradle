package com.larksuite.component.universe_design.timepicker.impl.action;

import android.content.Context;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0006R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\b\"\u0004\b\u001c\u0010\n¨\u0006 "}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder;", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "leftActionText", "", "getLeftActionText", "()Ljava/lang/String;", "setLeftActionText", "(Ljava/lang/String;)V", "pickerViewMode", "Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "getPickerViewMode", "()Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;", "setPickerViewMode", "(Lcom/larksuite/component/universe_design/timepicker/impl/data/PickerModel;)V", "rightActionText", "getRightActionText", "setRightActionText", "timePickerActonListener", "Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "getTimePickerActonListener", "()Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "setTimePickerActonListener", "(Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;)V", "titleText", "getTitleText", "setTitleText", "text", "pickerViewModel", "TimePickerActonListener", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class UDTimePickerBuilder extends UDBaseDialogBuilder<UDTimePickerBuilder> {

    /* renamed from: a */
    private PickerModel f63709a = PickerModel.MONTHDAY_HOUR_MINUTE_24H;

    /* renamed from: b */
    private TimePickerActonListener f63710b;

    /* renamed from: c */
    private String f63711c;

    /* renamed from: d */
    private String f63712d;

    /* renamed from: e */
    private String f63713e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/larksuite/component/universe_design/timepicker/impl/action/UDTimePickerBuilder$TimePickerActonListener;", "", "onClickRightAction", "", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "year", "", "monthOfYear", "dayOfMonth", "hourOfDay", "minute", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface TimePickerActonListener {
        void onClickRightAction(UDDialog uDDialog, int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: a */
    public final PickerModel mo91494a() {
        return this.f63709a;
    }

    /* renamed from: b */
    public final TimePickerActonListener mo91495b() {
        return this.f63710b;
    }

    /* renamed from: c */
    public final String mo91498c() {
        return this.f63711c;
    }

    /* renamed from: d */
    public final String mo91499d() {
        return this.f63712d;
    }

    /* renamed from: e */
    public final String mo91500e() {
        return this.f63713e;
    }

    /* renamed from: a */
    public final UDTimePickerBuilder mo91491a(TimePickerActonListener timePickerActonListener) {
        Intrinsics.checkParameterIsNotNull(timePickerActonListener, "timePickerActonListener");
        UDTimePickerBuilder uDTimePickerBuilder = this;
        uDTimePickerBuilder.f63710b = timePickerActonListener;
        return uDTimePickerBuilder;
    }

    /* renamed from: b */
    public final UDTimePickerBuilder mo91496b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDTimePickerBuilder uDTimePickerBuilder = this;
        uDTimePickerBuilder.f63712d = str;
        return uDTimePickerBuilder;
    }

    /* renamed from: c */
    public final UDTimePickerBuilder mo91497c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDTimePickerBuilder uDTimePickerBuilder = this;
        uDTimePickerBuilder.f63713e = str;
        return uDTimePickerBuilder;
    }

    /* renamed from: a */
    public final UDTimePickerBuilder mo91492a(PickerModel pickerModel) {
        Intrinsics.checkParameterIsNotNull(pickerModel, "pickerViewModel");
        UDTimePickerBuilder uDTimePickerBuilder = this;
        uDTimePickerBuilder.f63709a = pickerModel;
        return uDTimePickerBuilder;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDTimePickerBuilder(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
        rootLayout(new UDTimePickerActionView(context, null, 0, 6, null));
        controller(new UDTimePickerController(context));
        width(1.0f);
        gravity(80);
        marginInDp(0);
    }

    /* renamed from: a */
    public final UDTimePickerBuilder mo91493a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        UDTimePickerBuilder uDTimePickerBuilder = this;
        uDTimePickerBuilder.f63711c = str;
        return uDTimePickerBuilder;
    }
}
