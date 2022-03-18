package com.ss.android.lark.todo.impl.features.detail.time;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.larksuite.component.universe_design.datepicker.UDDatePicker;
import com.larksuite.component.universe_design.datepicker.api.IDatePickerDelegate;
import com.larksuite.component.universe_design.p1166switch.UDSwitch;
import com.larksuite.component.universe_design.timepicker.UDTimePicker;
import com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData;
import com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.component.universe_design.timepicker.impl.data.PickerModel;
import com.larksuite.framework.section.IActionData;
import com.larksuite.framework.section.IViewAbility;
import com.larksuite.framework.section.ViewSection;
import com.larksuite.suite.R;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.todo.dependency.TodoDependencyHolder;
import com.ss.android.lark.todo.impl.features.detail.helper.time.DueTimeHelper;
import com.ss.android.lark.todo.impl.features.detail.helper.time.ReminderHelper;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.ITodoDetailViewDataStore;
import com.ss.android.lark.todo.impl.features.detail.viewmodel.TimeBean;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoHitPoint;
import com.ss.android.lark.todo.impl.p2791b.C56263a;
import com.ss.android.lark.todo.impl.utils.ResUtil;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.UIHelper;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000267B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u0019H\u0002J\b\u0010$\u001a\u00020\u0019H\u0002J\b\u0010%\u001a\u00020\u0019H\u0002J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\u0010\u00100\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u00101\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0017H\u0002J \u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001f2\u0006\u00105\u001a\u00020\u001fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView;", "Lcom/larksuite/framework/section/ViewSection;", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/ITodoDetailViewDataStore;", "containerView", "Landroid/view/View;", "viewAbility", "Lcom/larksuite/framework/section/IViewAbility;", "(Landroid/view/View;Lcom/larksuite/framework/section/IViewAbility;)V", "reminderAdapterAllDay", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderAdapter;", "getReminderAdapterAllDay", "()Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderAdapter;", "reminderAdapterAllDay$delegate", "Lkotlin/Lazy;", "reminderAdapterNormal", "getReminderAdapterNormal", "reminderAdapterNormal$delegate", "saveAction", "Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "getSaveAction", "()Lcom/ss/android/lark/ui/IActionTitlebar$TextAction;", "saveAction$delegate", "userHasEdited", "", "actionSave", "", "changeAllDayUpdate", "isAllDay", "getChosenDateMilliTime", "", "getRemindAfterCompare", "", "timeBean", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeBean;", "getReminderMinutes", "initAllDayReminderWheel", "initData", "initNormalReminderWheel", "initReminderView", "initTimeBodyView", "initTitleView", "initViewAction", "initViewObserver", "insertCustomReminder", "saveWithTime", "updateHourWheelVisibility", "visible", "updateReminderText", "updateReminderWheelIndex", "updateReminderWheelVisibility", "updateTimeTextByDueTime", "year", "monthOfYear", "dayOfMonth", "ReminderAdapter", "ReminderItem", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a */
public final class TodoDetailTimeFragmentView extends ViewSection<ITodoDetailViewDataStore> {

    /* renamed from: a */
    public boolean f140083a;

    /* renamed from: b */
    public final View f140084b;

    /* renamed from: c */
    private final Lazy f140085c = LazyKt.lazy(new C56715o(this));

    /* renamed from: d */
    private final Lazy f140086d = LazyKt.lazy(C56713m.INSTANCE);

    /* renamed from: e */
    private final Lazy f140087e = LazyKt.lazy(C56714n.INSTANCE);

    /* renamed from: m */
    private final IActionTitlebar.TextAction m220549m() {
        return (IActionTitlebar.TextAction) this.f140085c.getValue();
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: g */
    public void mo92110g() {
    }

    /* renamed from: j */
    public final ReminderAdapter mo192716j() {
        return (ReminderAdapter) this.f140086d.getValue();
    }

    /* renamed from: k */
    public final ReminderAdapter mo192717k() {
        return (ReminderAdapter) this.f140087e.getValue();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\u000bH\u0002R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderItem;", "()V", "value", "", "insertReminder", "getInsertReminder", "()I", "setInsertReminder", "(I)V", "", "isAllDay", "()Z", "setAllDay", "(Z)V", "items", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getItem", "index", "getItemsCount", "indexOf", "reminderItem", "resetItemsByIsAllDay", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$a */
    public static final class ReminderAdapter implements BaseWheelAdapter<ReminderItem> {

        /* renamed from: a */
        private boolean f140088a;

        /* renamed from: b */
        private int f140089b;

        /* renamed from: c */
        private ArrayList<Integer> f140090c = new ArrayList<>(TodoReminderItems.f140115a.mo192735a());

        /* renamed from: b */
        public final ArrayList<Integer> mo192722b() {
            return this.f140090c;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
        /* renamed from: a */
        public int mo91448a() {
            return this.f140090c.size();
        }

        /* renamed from: a */
        public int mo91449a(ReminderItem bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "reminderItem");
            return bVar.mo192724b();
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
        /* renamed from: b */
        public int mo91452b(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "any");
            return BaseWheelAdapter.C25793a.m93151a(this, obj);
        }

        /* renamed from: b */
        private final void m220569b(boolean z) {
            ArrayList<Integer> arrayList;
            if (z) {
                arrayList = TodoReminderItems.f140115a.mo192737b();
            } else {
                arrayList = TodoReminderItems.f140115a.mo192735a();
            }
            this.f140090c = new ArrayList<>(arrayList);
        }

        /* renamed from: c */
        public ReminderItem mo91453b(int i) {
            Integer num = this.f140090c.get(i);
            Intrinsics.checkExpressionValueIsNotNull(num, "items[index]");
            return new ReminderItem(i, num.intValue(), this.f140088a);
        }

        /* renamed from: a */
        public final void mo192720a(int i) {
            this.f140089b = i;
            m220569b(this.f140088a);
            if (!this.f140090c.contains(Integer.valueOf(this.f140089b))) {
                this.f140090c.add(Integer.valueOf(this.f140089b));
                CollectionsKt.sort(this.f140090c);
            }
        }

        /* renamed from: a */
        public final void mo192721a(boolean z) {
            this.f140088a = z;
            m220569b(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderItem;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/IPickerViewData;", "index", "", "minutes", "isAllDay", "", "(IIZ)V", "getIndex", "()I", "getPickerViewText", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$b */
    public static final class ReminderItem implements IPickerViewData {

        /* renamed from: a */
        private final int f140091a;

        /* renamed from: b */
        private final int f140092b;

        /* renamed from: c */
        private final boolean f140093c;

        /* renamed from: b */
        public final int mo192724b() {
            return this.f140091a;
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.IPickerViewData
        /* renamed from: a */
        public String mo91459a() {
            return TodoReminderItems.f140115a.mo192733a(this.f140092b, this.f140093c);
        }

        public ReminderItem(int i, int i2, boolean z) {
            this.f140091a = i;
            this.f140092b = i2;
            this.f140093c = z;
        }
    }

    @Override // com.larksuite.framework.section.ViewSection
    /* renamed from: f */
    public void mo92109f() {
        m220550n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$m */
    static final class C56713m extends Lambda implements Function0<ReminderAdapter> {
        public static final C56713m INSTANCE = new C56713m();

        C56713m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReminderAdapter invoke() {
            ReminderAdapter aVar = new ReminderAdapter();
            aVar.mo192721a(true);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderAdapter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$n */
    static final class C56714n extends Lambda implements Function0<ReminderAdapter> {
        public static final C56714n INSTANCE = new C56714n();

        C56714n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ReminderAdapter invoke() {
            ReminderAdapter aVar = new ReminderAdapter();
            aVar.mo192721a(false);
            return aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\t\n\u0000\n\u0002\b\u0003*\u0001\u0001\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$saveAction$2$1", "invoke", "()Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$saveAction$2$1;"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$o */
    static final class C56715o extends Lambda implements Function0<C567161> {
        final /* synthetic */ TodoDetailTimeFragmentView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56715o(TodoDetailTimeFragmentView aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final C567161 invoke() {
            return new IActionTitlebar.TextAction(this, UIHelper.getString(R.string.Todo_common_Save), R.color.primary_pri_500, 16) {
                /* class com.ss.android.lark.todo.impl.features.detail.time.TodoDetailTimeFragmentView.C56715o.C567161 */

                /* renamed from: a */
                final /* synthetic */ C56715o f140110a;

                @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
                public void performAction(View view) {
                    this.f140110a.this$0.mo192718l();
                }

                {
                    this.f140110a = r1;
                }
            };
        }
    }

    /* renamed from: n */
    private final void m220550n() {
        this.f140083a = false;
        m220551o();
        m220552p();
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        mo192712a(!uDSwitch.isChecked());
        mo192714b(false);
        mo192715c(false);
    }

    /* renamed from: o */
    private final void m220551o() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) this.f140084b.findViewById(R.id.title_bar);
        if (commonTitleBar != null) {
            commonTitleBar.setLeftText(CommonTitleBarConstants.Lark_Legacy_Cancel);
            commonTitleBar.setLeftImageDrawable(null);
            commonTitleBar.setLeftClickListener(new View$OnClickListenerC56712l(this));
            commonTitleBar.addAction(m220549m());
        }
    }

    /* renamed from: q */
    private final void m220553q() {
        WheelView wheelView = (WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day);
        wheelView.setCyclic(false);
        wheelView.setAdapter(mo192716j());
        wheelView.setCurrentItem(1);
        wheelView.setTextSize(16.0f);
        wheelView.setOnItemSelectedListener(new C56704d(wheelView, this));
    }

    /* renamed from: r */
    private final void m220554r() {
        WheelView wheelView = (WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal);
        wheelView.setCyclic(false);
        wheelView.setAdapter(mo192717k());
        wheelView.setTextSize(16.0f);
        wheelView.setOnItemSelectedListener(new C56705e(wheelView, this));
    }

    /* renamed from: s */
    private final void m220555s() {
        TextView textView = (TextView) this.f140084b.findViewById(R.id.alert_time_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.alert_time_text");
        TodoReminderItems cVar = TodoReminderItems.f140115a;
        int u = m220557u();
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        textView.setText(cVar.mo192733a(u, !uDSwitch.isChecked()));
    }

    /* renamed from: t */
    private final long m220556t() {
        Calendar selectedCalendar = ((UDDatePicker) this.f140084b.findViewById(R.id.month_picker)).getSelectedCalendar();
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        if (!uDSwitch.isChecked()) {
            selectedCalendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            selectedCalendar.set(11, 0);
            selectedCalendar.set(12, 0);
        } else {
            selectedCalendar.setTimeZone(TimeZone.getDefault());
            Calendar selectedCalendar2 = ((UDTimePicker) this.f140084b.findViewById(R.id.time_picker)).getSelectedCalendar();
            selectedCalendar.set(11, selectedCalendar2.get(11));
            selectedCalendar.set(12, selectedCalendar2.get(12));
        }
        selectedCalendar.set(13, 0);
        selectedCalendar.set(14, 0);
        return selectedCalendar.getTimeInMillis();
    }

    /* renamed from: u */
    private final int m220557u() {
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        if (uDSwitch.isChecked()) {
            Integer num = mo192717k().mo192722b().get(((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal)).getCurrentItem());
            Intrinsics.checkExpressionValueIsNotNull(num, "reminderAdapterNormal.it…wheel_normal.currentItem]");
            return num.intValue();
        }
        Integer num2 = mo192716j().mo192722b().get(((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day)).getCurrentItem());
        Intrinsics.checkExpressionValueIsNotNull(num2, "reminderAdapterAllDay.it…heel_all_day.currentItem]");
        return num2.intValue();
    }

    /* renamed from: l */
    public final void mo192718l() {
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        boolean z = !uDSwitch.isChecked();
        long t = m220556t();
        UDSwitch uDSwitch2 = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "containerView.time_hour_switch");
        if (!ReminderHelper.f139700a.mo192311a((long) m220557u(), t, !uDSwitch2.isChecked())) {
            mo192713b(new TimeBean(t, z, m220557u()));
        } else {
            ReminderHelper.f139700a.mo192310a(mo92106c(), new DialogInterface$OnClickListenerC56703c(this, t, z));
        }
    }

    /* renamed from: p */
    private final void m220552p() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        if (TodoDependencyHolder.f139242a.mo191730a().timeFormatDependency().mo145434b()) {
            ((UDTimePicker) this.f140084b.findViewById(R.id.time_picker)).setPickerMode(PickerModel.HOUR_MINUTE_24H);
        } else {
            ((UDTimePicker) this.f140084b.findViewById(R.id.time_picker)).setPickerMode(PickerModel.HOUR_MINUTE_12H);
        }
        ((ITodoDetailViewDataStore) mo92096a()).getTimeBean().mo5923a(mo92105b(), new C56707g(this, gregorianCalendar, booleanRef));
        ((UDDatePicker) this.f140084b.findViewById(R.id.month_picker)).setMonthPickerListener(new C56708h(this));
        ((UDTimePicker) this.f140084b.findViewById(R.id.time_picker)).setDatePickerListener(new C56709i(this));
        ((UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch)).setOnCheckedChangeListener(new C56710j(this));
        ((FrameLayout) this.f140084b.findViewById(R.id.due_hour_time_container)).setOnClickListener(new View$OnClickListenerC56711k(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$initTimeBodyView$2", "Lcom/larksuite/component/universe_design/datepicker/api/IDatePickerDelegate$DatePickerListener;", "onDateChanged", "", "year", "", "monthOfYear", "dayOfMonth", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$h */
    public static final class C56708h implements IDatePickerDelegate.DatePickerListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140105a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56708h(TodoDetailTimeFragmentView aVar) {
            this.f140105a = aVar;
        }

        @Override // com.larksuite.component.universe_design.datepicker.api.IDatePickerDelegate.DatePickerListener
        /* renamed from: a */
        public void mo90447a(int i, int i2, int i3) {
            this.f140105a.mo192710a(i, i2, i3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$initTimeBodyView$3", "Lcom/larksuite/component/universe_design/timepicker/api/ITimePickerDelegate$TimePickerListener;", "onTimeChanged", "", "year", "", "monthOfYear", "dayOfMonth", "hourOfDay", "minute", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$i */
    public static final class C56709i implements ITimePickerDelegate.TimePickerListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140106a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56709i(TodoDetailTimeFragmentView aVar) {
            this.f140106a = aVar;
        }

        @Override // com.larksuite.component.universe_design.timepicker.api.ITimePickerDelegate.TimePickerListener
        /* renamed from: a */
        public void mo18000a(int i, int i2, int i3, int i4, int i5) {
            this.f140106a.f140083a = true;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i5);
            TextView textView = (TextView) this.f140106a.f140084b.findViewById(R.id.due_hour_time_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.due_hour_time_text");
            Context c = this.f140106a.mo92106c();
            Date time = gregorianCalendar.getTime();
            Intrinsics.checkExpressionValueIsNotNull(time, "date.time");
            C56263a.m219591a(textView, c, time, null);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$initTitleView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$l */
    public static final class View$OnClickListenerC56712l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140109a;

        View$OnClickListenerC56712l(TodoDetailTimeFragmentView aVar) {
            this.f140109a = aVar;
        }

        public final void onClick(View view) {
            this.f140109a.mo92107d().mo92064a(2001);
        }
    }

    /* renamed from: c */
    private final void m220546c(TimeBean zVar) {
        if (zVar.mo193076b()) {
            mo192716j().mo192720a(zVar.mo193077c());
        } else {
            mo192717k().mo192720a(zVar.mo193077c());
        }
    }

    /* renamed from: b */
    public final void mo192713b(TimeBean zVar) {
        TodoHitPoint.m221746c();
        mo92107d().mo92066a(6, (IActionData) zVar);
        mo92107d().mo92064a(2001);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$initAllDayReminderWheel$1$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$d */
    public static final class C56704d implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f140097a;

        /* renamed from: b */
        final /* synthetic */ TodoDetailTimeFragmentView f140098b;

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            if (this.f140097a.getVisibility() == 0) {
                TextView textView = (TextView) this.f140098b.f140084b.findViewById(R.id.alert_time_text);
                Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.alert_time_text");
                textView.setText(this.f140098b.mo192716j().mo91453b(i).mo91459a());
            }
        }

        C56704d(WheelView wheelView, TodoDetailTimeFragmentView aVar) {
            this.f140097a = wheelView;
            this.f140098b = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006¸\u0006\u0000"}, d2 = {"com/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$initNormalReminderWheel$1$1", "Lcom/larksuite/component/universe_design/timepicker/impl/base/OnItemSelectedListener;", "onItemSelected", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$e */
    public static final class C56705e implements OnItemSelectedListener {

        /* renamed from: a */
        final /* synthetic */ WheelView f140099a;

        /* renamed from: b */
        final /* synthetic */ TodoDetailTimeFragmentView f140100b;

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.OnItemSelectedListener
        public void onItemSelected(int i) {
            if (this.f140099a.getVisibility() == 0) {
                TextView textView = (TextView) this.f140100b.f140084b.findViewById(R.id.alert_time_text);
                Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.alert_time_text");
                textView.setText(this.f140100b.mo192717k().mo91453b(i).mo91459a());
            }
        }

        C56705e(WheelView wheelView, TodoDetailTimeFragmentView aVar) {
            this.f140099a = wheelView;
            this.f140100b = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$f */
    public static final class View$OnClickListenerC56706f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140101a;

        View$OnClickListenerC56706f(TodoDetailTimeFragmentView aVar) {
            this.f140101a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            WheelViewContainer wheelViewContainer = (WheelViewContainer) this.f140101a.f140084b.findViewById(R.id.reminder_wheel_container);
            Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer, "containerView.reminder_wheel_container");
            if (wheelViewContainer.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            this.f140101a.mo192715c(z);
            if (z) {
                this.f140101a.mo192714b(!z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$k */
    public static final class View$OnClickListenerC56711k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140108a;

        View$OnClickListenerC56711k(TodoDetailTimeFragmentView aVar) {
            this.f140108a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            WheelViewContainer wheelViewContainer = (WheelViewContainer) this.f140108a.f140084b.findViewById(R.id.hour_time_wheel_container);
            Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer, "containerView.hour_time_wheel_container");
            if (wheelViewContainer.getVisibility() == 8) {
                z = true;
            } else {
                z = false;
            }
            this.f140108a.mo192714b(z);
            if (z) {
                this.f140108a.mo192715c(!z);
            }
        }
    }

    /* renamed from: d */
    private final int m220547d(TimeBean zVar) {
        long t = m220556t();
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        if (ReminderHelper.f139700a.mo192311a((long) zVar.mo193077c(), t, !uDSwitch.isChecked())) {
            return 0;
        }
        return zVar.mo193077c();
    }

    /* renamed from: b */
    public final void mo192714b(boolean z) {
        if (z) {
            ((TextView) this.f140084b.findViewById(R.id.due_hour_time_text)).setTextColor(ResUtil.f139261a.mo191775a(R.color.lkui_B500));
            WheelViewContainer wheelViewContainer = (WheelViewContainer) this.f140084b.findViewById(R.id.hour_time_wheel_container);
            Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer, "containerView.hour_time_wheel_container");
            wheelViewContainer.setVisibility(0);
            return;
        }
        ((TextView) this.f140084b.findViewById(R.id.due_hour_time_text)).setTextColor(ResUtil.f139261a.mo191775a(R.color.lkui_N500));
        WheelViewContainer wheelViewContainer2 = (WheelViewContainer) this.f140084b.findViewById(R.id.hour_time_wheel_container);
        Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer2, "containerView.hour_time_wheel_container");
        wheelViewContainer2.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo192715c(boolean z) {
        if (z) {
            ((TextView) this.f140084b.findViewById(R.id.alert_time_text)).setTextColor(ResUtil.f139261a.mo191775a(R.color.lkui_B500));
            WheelViewContainer wheelViewContainer = (WheelViewContainer) this.f140084b.findViewById(R.id.reminder_wheel_container);
            Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer, "containerView.reminder_wheel_container");
            wheelViewContainer.setVisibility(0);
            return;
        }
        ((TextView) this.f140084b.findViewById(R.id.alert_time_text)).setTextColor(ResUtil.f139261a.mo191775a(R.color.lkui_N500));
        WheelViewContainer wheelViewContainer2 = (WheelViewContainer) this.f140084b.findViewById(R.id.reminder_wheel_container);
        Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer2, "containerView.reminder_wheel_container");
        wheelViewContainer2.setVisibility(8);
    }

    /* renamed from: e */
    private final void m220548e(TimeBean zVar) {
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        if (!uDSwitch.isChecked()) {
            ((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal)).setCurrentItem(1);
            int indexOf = mo192716j().mo192722b().indexOf(Integer.valueOf(m220547d(zVar)));
            if (indexOf < 0) {
                ((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day)).setCurrentItem(1);
            } else {
                ((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day)).setCurrentItem(indexOf);
            }
        } else {
            ((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day)).setCurrentItem(1);
            int indexOf2 = mo192717k().mo192722b().indexOf(Integer.valueOf(m220547d(zVar)));
            if (indexOf2 < 0) {
                ((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal)).setCurrentItem(1);
            } else {
                ((WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal)).setCurrentItem(indexOf2);
            }
        }
    }

    /* renamed from: a */
    public final void mo192711a(TimeBean zVar) {
        m220546c(zVar);
        TextView textView = (TextView) this.f140084b.findViewById(R.id.alert_time_text);
        Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.alert_time_text");
        TodoReminderItems cVar = TodoReminderItems.f140115a;
        int d = m220547d(zVar);
        UDSwitch uDSwitch = (UDSwitch) this.f140084b.findViewById(R.id.time_hour_switch);
        Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
        textView.setText(cVar.mo192733a(d, !uDSwitch.isChecked()));
        ((FrameLayout) this.f140084b.findViewById(R.id.reminder_text_container)).setOnClickListener(new View$OnClickListenerC56706f(this));
        m220553q();
        m220554r();
        m220548e(zVar);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/todo/impl/features/detail/viewmodel/TimeBean;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$g */
    public static final class C56707g<T> implements AbstractC1178x<TimeBean> {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140102a;

        /* renamed from: b */
        final /* synthetic */ GregorianCalendar f140103b;

        /* renamed from: c */
        final /* synthetic */ Ref.BooleanRef f140104c;

        C56707g(TodoDetailTimeFragmentView aVar, GregorianCalendar gregorianCalendar, Ref.BooleanRef booleanRef) {
            this.f140102a = aVar;
            this.f140103b = gregorianCalendar;
            this.f140104c = booleanRef;
        }

        /* renamed from: a */
        public final void onChanged(TimeBean zVar) {
            if (zVar.mo193075a() > 0) {
                this.f140102a.f140083a = !zVar.mo193076b();
                this.f140103b.setTime(new Date(zVar.mo193075a()));
                UDSwitch uDSwitch = (UDSwitch) this.f140102a.f140084b.findViewById(R.id.time_hour_switch);
                Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "containerView.time_hour_switch");
                uDSwitch.setChecked(!zVar.mo193076b());
                if (zVar.mo193076b()) {
                    this.f140103b.setTimeZone(TimeZone.getTimeZone("UTC"));
                    this.f140102a.mo192710a(this.f140103b.get(1), this.f140103b.get(2), this.f140103b.get(5));
                    this.f140104c.element = true;
                }
            } else {
                this.f140103b.setTimeInMillis(DueTimeHelper.f139699a.mo192308c());
                UDSwitch uDSwitch2 = (UDSwitch) this.f140102a.f140084b.findViewById(R.id.time_hour_switch);
                Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "containerView.time_hour_switch");
                uDSwitch2.setChecked(true);
            }
            ((UDDatePicker) this.f140102a.f140084b.findViewById(R.id.month_picker)).setSelectedCalendar(this.f140103b);
            if (!this.f140104c.element) {
                ((UDTimePicker) this.f140102a.f140084b.findViewById(R.id.time_picker)).setSelectedCalendar(this.f140103b);
                Options aVar = null;
                if (zVar.mo193076b()) {
                    aVar = new Options("UTC", null, null, null, null, false, false, false, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_DIR, null);
                }
                TextView textView = (TextView) this.f140102a.f140084b.findViewById(R.id.due_hour_time_text);
                Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.due_hour_time_text");
                Context c = this.f140102a.mo92106c();
                Date time = this.f140103b.getTime();
                Intrinsics.checkExpressionValueIsNotNull(time, "date.time");
                C56263a.m219591a(textView, c, time, aVar);
            }
            TodoDetailTimeFragmentView aVar2 = this.f140102a;
            Intrinsics.checkExpressionValueIsNotNull(zVar, "it");
            aVar2.mo192711a(zVar);
        }
    }

    /* renamed from: a */
    public final void mo192712a(boolean z) {
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f140084b.findViewById(R.id.due_hour_time_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "containerView.due_hour_time_container");
            frameLayout.setVisibility(8);
            WheelViewContainer wheelViewContainer = (WheelViewContainer) this.f140084b.findViewById(R.id.hour_time_wheel_container);
            Intrinsics.checkExpressionValueIsNotNull(wheelViewContainer, "containerView.hour_time_wheel_container");
            wheelViewContainer.setVisibility(8);
            WheelView wheelView = (WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal);
            Intrinsics.checkExpressionValueIsNotNull(wheelView, "containerView.reminder_wheel_normal");
            wheelView.setVisibility(8);
            WheelView wheelView2 = (WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day);
            Intrinsics.checkExpressionValueIsNotNull(wheelView2, "containerView.reminder_wheel_all_day");
            wheelView2.setVisibility(0);
        } else {
            FrameLayout frameLayout2 = (FrameLayout) this.f140084b.findViewById(R.id.due_hour_time_container);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout2, "containerView.due_hour_time_container");
            frameLayout2.setVisibility(0);
            mo192714b(false);
            WheelView wheelView3 = (WheelView) this.f140084b.findViewById(R.id.reminder_wheel_normal);
            Intrinsics.checkExpressionValueIsNotNull(wheelView3, "containerView.reminder_wheel_normal");
            wheelView3.setVisibility(0);
            WheelView wheelView4 = (WheelView) this.f140084b.findViewById(R.id.reminder_wheel_all_day);
            Intrinsics.checkExpressionValueIsNotNull(wheelView4, "containerView.reminder_wheel_all_day");
            wheelView4.setVisibility(8);
        }
        m220555s();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$j */
    public static final class C56710j implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140107a;

        C56710j(TodoDetailTimeFragmentView aVar) {
            this.f140107a = aVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f140107a.mo192712a(!z);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.detail.time.a$c */
    public static final class DialogInterface$OnClickListenerC56703c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoDetailTimeFragmentView f140094a;

        /* renamed from: b */
        final /* synthetic */ long f140095b;

        /* renamed from: c */
        final /* synthetic */ boolean f140096c;

        DialogInterface$OnClickListenerC56703c(TodoDetailTimeFragmentView aVar, long j, boolean z) {
            this.f140094a = aVar;
            this.f140095b = j;
            this.f140096c = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f140094a.mo192713b(new TimeBean(this.f140095b, this.f140096c, -1));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoDetailTimeFragmentView(View view, IViewAbility<ITodoDetailViewDataStore> fVar) {
        super(fVar);
        Intrinsics.checkParameterIsNotNull(view, "containerView");
        Intrinsics.checkParameterIsNotNull(fVar, "viewAbility");
        this.f140084b = view;
    }

    /* renamed from: a */
    public final void mo192710a(int i, int i2, int i3) {
        if (!this.f140083a) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            if (gregorianCalendar.get(1) == i && gregorianCalendar.get(2) == i2 && gregorianCalendar.get(5) == i3) {
                gregorianCalendar.setTimeInMillis(DueTimeHelper.f139699a.mo192305a());
            } else {
                gregorianCalendar.setTimeInMillis(DueTimeHelper.f139699a.mo192306a(i, i2, i3));
            }
            ((UDTimePicker) this.f140084b.findViewById(R.id.time_picker)).setSelectedCalendar(gregorianCalendar);
            TextView textView = (TextView) this.f140084b.findViewById(R.id.due_hour_time_text);
            Intrinsics.checkExpressionValueIsNotNull(textView, "containerView.due_hour_time_text");
            Context c = mo92106c();
            Date time = gregorianCalendar.getTime();
            Intrinsics.checkExpressionValueIsNotNull(time, "date.time");
            C56263a.m219591a(textView, c, time, null);
        }
    }
}
