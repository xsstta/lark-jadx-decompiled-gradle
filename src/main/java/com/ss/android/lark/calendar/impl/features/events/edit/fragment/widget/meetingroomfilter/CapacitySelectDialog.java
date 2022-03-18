package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.framework.ui.BaseDialog;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.KeyBoardObserveScreenLayout;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0013\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0005J\b\u0010\u0012\u001a\u00020\u000eH\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog;", "Lcom/larksuite/framework/ui/BaseDialog;", "context", "Landroid/content/Context;", "themeResId", "", "(Landroid/content/Context;I)V", "capacityListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$OnCapacityChangedListener;", "getCapacityListener", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$OnCapacityChangedListener;", "setCapacityListener", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$OnCapacityChangedListener;)V", "initListener", "", "initView", "setInitCapacity", "capacity", "show", "Companion", "OnCapacityChangedListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a */
public final class CapacitySelectDialog extends BaseDialog {

    /* renamed from: a */
    public static final Companion f81078a = new Companion(null);

    /* renamed from: b */
    private OnCapacityChangedListener f81079b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$OnCapacityChangedListener;", "", "onSelectChanged", "", "capacity", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a$b */
    public interface OnCapacityChangedListener {
        /* renamed from: a */
        void mo112338a(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final OnCapacityChangedListener mo116053a() {
        return this.f81079b;
    }

    @Override // com.larksuite.framework.ui.BaseDialog
    public void show() {
        super.show();
        KeyboardUtils.showKeyboard((EditText) findViewById(R.id.capacityET));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/meetingroomfilter/CapacitySelectDialog$initListener$4", "Lcom/ss/android/lark/calendar/impl/features/common/widget/KeyBoardObserveScreenLayout$IOnKeyBoardListener;", "onKeyBoardHide", "", "onKeyBoardShow", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a$f */
    public static final class C31834f implements KeyBoardObserveScreenLayout.IOnKeyBoardListener {

        /* renamed from: a */
        final /* synthetic */ CapacitySelectDialog f81083a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.KeyBoardObserveScreenLayout.IOnKeyBoardListener
        /* renamed from: a */
        public void mo112863a() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.KeyBoardObserveScreenLayout.IOnKeyBoardListener
        /* renamed from: b */
        public void mo112864b() {
            KeyboardUtils.hideKeyboard(this.f81083a.getContext(), (EditText) this.f81083a.findViewById(R.id.capacityET));
            this.f81083a.dismiss();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31834f(CapacitySelectDialog aVar) {
            this.f81083a = aVar;
        }
    }

    /* renamed from: b */
    private final void m120817b() {
        WindowManager.LayoutParams layoutParams;
        setContentView(R.layout.dialog_meeting_room_capacity_filter);
        Window window = getWindow();
        if (window != null) {
            layoutParams = window.getAttributes();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setAttributes(layoutParams);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(16);
        }
        View findViewById = findViewById(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "shadowView");
        findViewById.setAlpha(0.6f);
    }

    /* renamed from: c */
    private final void m120818c() {
        ((TextView) findViewById(R.id.capacityConfirmTV)).setOnClickListener(new View$OnClickListenerC31831c(this));
        findViewById(R.id.shadowView).setOnClickListener(new View$OnClickListenerC31832d(this));
        ((TextView) findViewById(R.id.capacityCancelTV)).setOnClickListener(new View$OnClickListenerC31833e(this));
        ((KeyBoardObserveScreenLayout) findViewById(R.id.capacityRootView)).mo112860a(new C31834f(this));
    }

    /* renamed from: a */
    public final void mo116055a(OnCapacityChangedListener bVar) {
        this.f81079b = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a$d */
    public static final class View$OnClickListenerC31832d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CapacitySelectDialog f81081a;

        View$OnClickListenerC31832d(CapacitySelectDialog aVar) {
            this.f81081a = aVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f81081a.getContext(), (EditText) this.f81081a.findViewById(R.id.capacityET));
            this.f81081a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a$e */
    public static final class View$OnClickListenerC31833e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CapacitySelectDialog f81082a;

        View$OnClickListenerC31833e(CapacitySelectDialog aVar) {
            this.f81082a = aVar;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f81082a.getContext(), (EditText) this.f81082a.findViewById(R.id.capacityET));
            this.f81082a.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.meetingroomfilter.a$c */
    public static final class View$OnClickListenerC31831c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CapacitySelectDialog f81080a;

        View$OnClickListenerC31831c(CapacitySelectDialog aVar) {
            this.f81080a = aVar;
        }

        public final void onClick(View view) {
            int i;
            KeyboardUtils.hideKeyboard(this.f81080a.getContext(), (EditText) this.f81080a.findViewById(R.id.capacityET));
            EditText editText = (EditText) this.f81080a.findViewById(R.id.capacityET);
            Intrinsics.checkExpressionValueIsNotNull(editText, "capacityET");
            String obj = editText.getText().toString();
            try {
                if (TextUtils.isEmpty(obj)) {
                    i = 0;
                } else {
                    i = Integer.parseInt(obj);
                }
                OnCapacityChangedListener a = this.f81080a.mo116053a();
                if (a != null) {
                    a.mo112338a(i);
                }
            } catch (Exception e) {
                Context context = this.f81080a.getContext();
                Intrinsics.checkExpressionValueIsNotNull(context, "context");
                String string = UIHelper.getString(R.string.Calendar_EmailGuest_InvalidInput);
                Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…_EmailGuest_InvalidInput)");
                UDToast.show(context, string);
                Log.m165383e("CapacitySelectDialog", C32673y.m125378d("To Int Error: " + e));
            }
            this.f81080a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo116054a(int i) {
        if (i == 0) {
            EditText editText = (EditText) findViewById(R.id.capacityET);
            Intrinsics.checkExpressionValueIsNotNull(editText, "capacityET");
            editText.setHint(new SpannableString(String.valueOf(i)));
            return;
        }
        Editable newEditable = Editable.Factory.getInstance().newEditable(String.valueOf(i));
        EditText editText2 = (EditText) findViewById(R.id.capacityET);
        Intrinsics.checkExpressionValueIsNotNull(editText2, "capacityET");
        editText2.setText(newEditable);
        ((EditText) findViewById(R.id.capacityET)).setSelection(newEditable.length());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CapacitySelectDialog(Context context, int i) {
        super(context, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
        m120817b();
        m120818c();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CapacitySelectDialog(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? R.style.CalendarTransparentDialog : i);
    }
}
