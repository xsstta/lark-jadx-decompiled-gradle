package com.ss.android.lark.moments.impl.broadcast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate;
import com.larksuite.component.universe_design.timepicker.impl.adapter.CustomNumericWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.moments.impl.common.utils.TimeLabelUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "initTime", "", "listener", "Lcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$OnTimeSelectedListener;", "(Landroid/content/Context;JLcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$OnTimeSelectedListener;)V", "getListener", "()Lcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$OnTimeSelectedListener;", "rootView", "Landroid/view/View;", "selectDay", "", "selectHour", "selectMonth", "selectedYear", "getSelectedTime", "initTimePicker", "", "initView", "isValidTime", "", "selectedTime", "Companion", "OnTimeSelectedListener", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.broadcast.c */
public final class BroadcastTimePickerDialog extends BaseDialog {

    /* renamed from: e */
    public static final Companion f119045e = new Companion(null);

    /* renamed from: a */
    public int f119046a;

    /* renamed from: b */
    public int f119047b;

    /* renamed from: c */
    public int f119048c;

    /* renamed from: d */
    public int f119049d;

    /* renamed from: f */
    private View f119050f;

    /* renamed from: g */
    private final long f119051g;

    /* renamed from: h */
    private final OnTimeSelectedListener f119052h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$OnTimeSelectedListener;", "", "onTimeSelected", "", "timeStamp", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.c$b */
    public interface OnTimeSelectedListener {
        /* renamed from: a */
        void mo165937a(long j);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$Companion;", "", "()V", "INIT_DAY_DELAY", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final OnTimeSelectedListener mo165951b() {
        return this.f119052h;
    }

    /* renamed from: a */
    public final long mo165949a() {
        Calendar instance = Calendar.getInstance();
        instance.set(1, this.f119046a);
        instance.set(2, this.f119047b);
        instance.set(5, this.f119048c);
        instance.set(11, this.f119049d);
        instance.set(12, 0);
        Intrinsics.checkExpressionValueIsNotNull(instance, "calendar");
        return instance.getTimeInMillis();
    }

    /* renamed from: c */
    private final void m187024c() {
        WindowManager.LayoutParams attributes;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_moments_broadcast_time_picker, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(cont…adcast_time_picker, null)");
        this.f119050f = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        if (inflate != null) {
            View view = this.f119050f;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            setContentView(view);
            View view2 = this.f119050f;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = UIHelper.getWindowWidth(getContext());
            View view3 = this.f119050f;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            view3.setLayoutParams(layoutParams);
            Window window = getWindow();
            if (window != null) {
                window.setGravity(80);
            }
            Window window2 = getWindow();
            if (!(window2 == null || (attributes = window2.getAttributes()) == null)) {
                attributes.windowAnimations = R.style.BottomInAndOutAnim;
            }
            setCanceledOnTouchOutside(true);
            m187025d();
        }
    }

    /* renamed from: d */
    private final void m187025d() {
        Calendar calendar;
        if (this.f119051g != 0) {
            calendar = Calendar.getInstance();
            Intrinsics.checkExpressionValueIsNotNull(calendar, "Calendar.getInstance()");
            calendar.setTimeInMillis(this.f119051g);
            this.f119049d = calendar.get(11);
        } else {
            calendar = TimeLabelUtils.f119256a.mo166219a(4);
            this.f119049d = 0;
        }
        this.f119046a = calendar.get(1);
        this.f119047b = calendar.get(2);
        this.f119048c = calendar.get(5);
        View view = this.f119050f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((UDTimePicker) view.findViewById(R.id.wheel_year)).setSelectedCalendar(calendar);
        View view2 = this.f119050f;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((UDTimePicker) view2.findViewById(R.id.wheel_year)).setDatePickerListener(new C47199c(this));
        View view3 = this.f119050f;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((WheelView) view3.findViewById(R.id.wheel_hour)).setAdapter(new CustomNumericWheelAdapter(0, 23));
        View view4 = this.f119050f;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((WheelView) view4.findViewById(R.id.wheel_hour)).setCurrentItem(this.f119049d);
        View view5 = this.f119050f;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((WheelView) view5.findViewById(R.id.wheel_hour)).setDividerType(WheelView.DividerType.FILL);
        View view6 = this.f119050f;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((WheelView) view6.findViewById(R.id.wheel_hour)).setOnItemSelectedListener(new C47200d(this));
        View view7 = this.f119050f;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((TextView) view7.findViewById(R.id.btn_cancel)).setOnClickListener(new C47201e(this));
        View view8 = this.f119050f;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        ((TextView) view8.findViewById(R.id.btn_confirm)).setOnClickListener(new C47202f(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$initTimePicker$1", "Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate$TimePickerListener;", "onTimeChanged", "", "year", "", "monthOfYear", "dayOfMonth", "hourOfDay", "minute", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.c$c */
    public static final class C47199c implements ITimePickerDelegate.TimePickerListener {

        /* renamed from: a */
        final /* synthetic */ BroadcastTimePickerDialog f119053a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47199c(BroadcastTimePickerDialog cVar) {
            this.f119053a = cVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate.TimePickerListener
        /* renamed from: a */
        public void mo18000a(int i, int i2, int i3, int i4, int i5) {
            this.f119053a.f119046a = i;
            this.f119053a.f119047b = i2;
            this.f119053a.f119048c = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$initTimePicker$2", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.c$d */
    public static final class C47200d implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ BroadcastTimePickerDialog f119054a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47200d(BroadcastTimePickerDialog cVar) {
            this.f119054a = cVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            this.f119054a.f119049d = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$initTimePicker$3", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.c$e */
    public static final class C47201e extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BroadcastTimePickerDialog f119055a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47201e(BroadcastTimePickerDialog cVar) {
            this.f119055a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f119055a.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/moments/impl/broadcast/BroadcastTimePickerDialog$initTimePicker$4", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.broadcast.c$f */
    public static final class C47202f extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ BroadcastTimePickerDialog f119056a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C47202f(BroadcastTimePickerDialog cVar) {
            this.f119056a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            long a = this.f119056a.mo165949a();
            if (this.f119056a.mo165950a(a)) {
                this.f119056a.mo165951b().mo165937a(a);
                this.f119056a.dismiss();
                return;
            }
            LKUIToast.show(this.f119056a.getContext(), UIHelper.getString(R.string.Lark_Moments_EndingTimePassedReselect_Toast));
        }
    }

    /* renamed from: a */
    public final boolean mo165950a(long j) {
        if (j > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BroadcastTimePickerDialog(Context context, long j, OnTimeSelectedListener bVar) {
        super(context, R.style.BottomDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f119051g = j;
        this.f119052h = bVar;
        m187024c();
    }
}
