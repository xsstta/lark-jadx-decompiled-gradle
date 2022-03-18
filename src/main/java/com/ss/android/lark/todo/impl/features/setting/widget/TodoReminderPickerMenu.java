package com.ss.android.lark.todo.impl.features.setting.widget;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter;
import com.larksuite.component.universe_design.timepicker.impl.base.WheelView;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.suite.R;
import com.ss.android.lark.todo.impl.features.detail.time.TodoDetailTimeFragmentView;
import com.ss.android.lark.todo.impl.features.detail.time.TodoReminderItems;
import com.ss.android.lark.todo.impl.framework.hitpoint.event.TodoGeneralHitPoint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "mActionListener", "Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu$ActionListener;", "initView", "", "onBackPressed", "setActionListener", "actionListener", "setOriginalIndex", "index", "ActionListener", "NormalReminderAdapter", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.setting.widget.a */
public final class TodoReminderPickerMenu extends BaseDialog {

    /* renamed from: a */
    public ActionListener f141031a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu$ActionListener;", "", "onActionPerform", "", "index", "", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.widget.a$a */
    public interface ActionListener {
        /* renamed from: a */
        void mo194052a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0002H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/todo/impl/features/setting/widget/TodoReminderPickerMenu$NormalReminderAdapter;", "Lcom/larksuite/component/universe_design/timepicker/impl/base/BaseWheelAdapter;", "Lcom/ss/android/lark/todo/impl/features/detail/time/TodoDetailTimeFragmentView$ReminderItem;", "()V", "items", "", "", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItem", "index", "getItemsCount", "indexOf", "reminderItem", "todo_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.widget.a$b */
    public static final class NormalReminderAdapter implements BaseWheelAdapter<TodoDetailTimeFragmentView.ReminderItem> {

        /* renamed from: a */
        private List<Integer> f141032a = TodoReminderItems.f140115a.mo192735a();

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
        /* renamed from: a */
        public int mo91448a() {
            return this.f141032a.size();
        }

        /* renamed from: a */
        public int mo91449a(TodoDetailTimeFragmentView.ReminderItem bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "reminderItem");
            return bVar.mo192724b();
        }

        @Override // com.larksuite.component.universe_design.timepicker.impl.base.BaseWheelAdapter
        /* renamed from: b */
        public int mo91452b(Object obj) {
            Intrinsics.checkParameterIsNotNull(obj, "any");
            return BaseWheelAdapter.C25793a.m93151a(this, obj);
        }

        /* renamed from: a */
        public TodoDetailTimeFragmentView.ReminderItem mo91453b(int i) {
            return new TodoDetailTimeFragmentView.ReminderItem(i, this.f141032a.get(i).intValue(), false);
        }
    }

    public void onBackPressed() {
        TodoGeneralHitPoint.f141070a.mo194212l();
        dismiss();
    }

    /* renamed from: a */
    private final void m221587a() {
        ((TextView) findViewById(R.id.reminder_cancel)).setOnClickListener(new View$OnClickListenerC57202c(this));
        ((TextView) findViewById(R.id.reminder_confirm)).setOnClickListener(new View$OnClickListenerC57203d(this));
        ((WheelView) findViewById(R.id.reminder_wheel_normal)).setCyclic(false);
        ((WheelView) findViewById(R.id.reminder_wheel_normal)).setAdapter(new NormalReminderAdapter());
        ((WheelView) findViewById(R.id.reminder_wheel_normal)).setTextSize(17.0f);
    }

    /* renamed from: a */
    public final void mo194100a(ActionListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "actionListener");
        this.f141031a = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.widget.a$c */
    public static final class View$OnClickListenerC57202c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoReminderPickerMenu f141033a;

        View$OnClickListenerC57202c(TodoReminderPickerMenu aVar) {
            this.f141033a = aVar;
        }

        public final void onClick(View view) {
            TodoGeneralHitPoint.f141070a.mo194212l();
            this.f141033a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo194099a(int i) {
        WheelView wheelView = (WheelView) findViewById(R.id.reminder_wheel_normal);
        if (i < 0 || i >= TodoReminderItems.f140115a.mo192735a().size()) {
            i = 0;
        }
        wheelView.setCurrentItem(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.todo.impl.features.setting.widget.a$d */
    public static final class View$OnClickListenerC57203d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TodoReminderPickerMenu f141034a;

        View$OnClickListenerC57203d(TodoReminderPickerMenu aVar) {
            this.f141034a = aVar;
        }

        public final void onClick(View view) {
            if (((WheelView) this.f141034a.findViewById(R.id.reminder_wheel_normal)).getCurrentItem() < TodoReminderItems.f140115a.mo192735a().size()) {
                ActionListener aVar = this.f141034a.f141031a;
                if (aVar != null) {
                    aVar.mo194052a(((WheelView) this.f141034a.findViewById(R.id.reminder_wheel_normal)).getCurrentItem());
                }
                this.f141034a.dismiss();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TodoReminderPickerMenu(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        setContentView(R.layout.todo_dialog_reminder_picker);
        setCanceledOnTouchOutside(true);
        m221587a();
    }
}
