package com.ss.android.lark.calendar.impl.features.calendars.editor.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0014H\u0016J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u000e\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\nJ\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;", "originDescription", "", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment$Delegate;", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment$Delegate;)V", "getDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment$Delegate;", "mIsEditable", "", "getMIsEditable", "()Z", "setMIsEditable", "(Z)V", "getOriginDescription", "()Ljava/lang/String;", "setOriginDescription", "(Ljava/lang/String;)V", "initEditText", "", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setIsEditable", "isEditable", "updateData", "description", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.c */
public final class CalendarDescriptionFragment extends CalendarCreatorBaseFragment {

    /* renamed from: a */
    private boolean f75856a = true;

    /* renamed from: b */
    private String f75857b;

    /* renamed from: c */
    private final Delegate f75858c;

    /* renamed from: d */
    private HashMap f75859d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment$Delegate;", "", "onBackPressed", "", "isEdited", "", "description", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.c$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109417a(boolean z, String str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f75859d == null) {
            this.f75859d = new HashMap();
        }
        View view = (View) this.f75859d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75859d.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f75859d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: b */
    public final String mo109415b() {
        return this.f75857b;
    }

    /* renamed from: d */
    public final Delegate mo109416d() {
        return this.f75858c;
    }

    /* renamed from: f */
    private final void m112547f() {
        ((CommonTitleBar) mo109250a(R.id.descriptionTitleBar)).setTitle(R.string.Calendar_Edit_Description);
        ((CommonTitleBar) mo109250a(R.id.descriptionTitleBar)).setMainTitleSize(17.0f);
        ((CommonTitleBar) mo109250a(R.id.descriptionTitleBar)).setMainTitleTextStyle(1);
        ((CommonTitleBar) mo109250a(R.id.descriptionTitleBar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.descriptionTitleBar)).setLeftClickListener(new View$OnClickListenerC30287b(this));
        if (this.f75856a) {
            ((CommonTitleBar) mo109250a(R.id.descriptionTitleBar)).addAction(new C30288c(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500));
        }
    }

    /* renamed from: e */
    private final void m112546e() {
        EditText editText = (EditText) mo109250a(R.id.calendarDescriptionEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText, "calendarDescriptionEditText");
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(250)});
        ((EditText) mo109250a(R.id.calendarDescriptionEditText)).setText(this.f75857b);
        if (this.f75856a) {
            ((EditText) mo109250a(R.id.calendarDescriptionEditText)).setTextColor(C32634ae.m125178a(R.color.text_title));
            EditText editText2 = (EditText) mo109250a(R.id.calendarDescriptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "calendarDescriptionEditText");
            editText2.setEnabled(true);
            EditText editText3 = (EditText) mo109250a(R.id.calendarDescriptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText3, "calendarDescriptionEditText");
            editText3.setFocusable(true);
            EditText editText4 = (EditText) mo109250a(R.id.calendarDescriptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText4, "calendarDescriptionEditText");
            editText4.setFocusableInTouchMode(true);
            ((EditText) mo109250a(R.id.calendarDescriptionEditText)).requestFocus();
            if (this.f75857b.length() < 250) {
                ((EditText) mo109250a(R.id.calendarDescriptionEditText)).setSelection(this.f75857b.length());
            }
            KeyboardUtils.showKeyboard(getContext());
            return;
        }
        if (TextUtils.isEmpty(this.f75857b)) {
            ((EditText) mo109250a(R.id.calendarDescriptionEditText)).setText(R.string.Calendar_Setting_NoCalendarDescription);
        }
        ((EditText) mo109250a(R.id.calendarDescriptionEditText)).setTextColor(C32634ae.m125178a(R.color.text_disable));
        EditText editText5 = (EditText) mo109250a(R.id.calendarDescriptionEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText5, "calendarDescriptionEditText");
        editText5.setEnabled(false);
        EditText editText6 = (EditText) mo109250a(R.id.calendarDescriptionEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText6, "calendarDescriptionEditText");
        editText6.setFocusable(false);
        EditText editText7 = (EditText) mo109250a(R.id.calendarDescriptionEditText);
        Intrinsics.checkExpressionValueIsNotNull(editText7, "calendarDescriptionEditText");
        editText7.setFocusableInTouchMode(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment
    /* renamed from: c */
    public void mo109409c() {
        KeyboardUtils.hideKeyboard(getContext());
        if (this.f75856a) {
            String str = this.f75857b;
            EditText editText = (EditText) mo109250a(R.id.calendarDescriptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "calendarDescriptionEditText");
            boolean z = !Intrinsics.areEqual(str, editText.getText().toString());
            if (z) {
                Context context = this.mContext;
                Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
                ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(R.string.Calendar_Common_Notice)).message(R.string.Calendar_Alert_UnsavedDesAlert)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC30289d(this, z))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextColor(R.color.text_caption)).messageTextSize(14)).show();
                return;
            }
            this.f75858c.mo109417a(z, this.f75857b);
            return;
        }
        this.f75858c.mo109417a(false, this.f75857b);
    }

    /* renamed from: a */
    public final void mo109414a(boolean z) {
        this.f75856a = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.c$b */
    public static final class View$OnClickListenerC30287b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDescriptionFragment f75860a;

        View$OnClickListenerC30287b(CalendarDescriptionFragment cVar) {
            this.f75860a = cVar;
        }

        public final void onClick(View view) {
            this.f75860a.mo109409c();
        }
    }

    /* renamed from: a */
    public final void mo109413a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        this.f75857b = str;
        m112546e();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment$initView$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.c$c */
    public static final class C30288c extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ CalendarDescriptionFragment f75861a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            KeyboardUtils.hideKeyboard(this.f75861a.getContext());
            String b = this.f75861a.mo109415b();
            EditText editText = (EditText) this.f75861a.mo109250a(R.id.calendarDescriptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "calendarDescriptionEditText");
            if (!Intrinsics.areEqual(b, editText.getText().toString())) {
                Delegate d = this.f75861a.mo109416d();
                EditText editText2 = (EditText) this.f75861a.mo109250a(R.id.calendarDescriptionEditText);
                Intrinsics.checkExpressionValueIsNotNull(editText2, "calendarDescriptionEditText");
                d.mo109417a(true, editText2.getText().toString());
                return;
            }
            this.f75861a.mo109416d().mo109417a(false, this.f75861a.mo109415b());
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30288c(CalendarDescriptionFragment cVar, String str, int i) {
            super(str, i);
            this.f75861a = cVar;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        m112547f();
        m112546e();
    }

    public CalendarDescriptionFragment(String str, Delegate aVar) {
        Intrinsics.checkParameterIsNotNull(str, "originDescription");
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f75857b = str;
        this.f75858c = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.a.c$d */
    public static final class DialogInterface$OnClickListenerC30289d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarDescriptionFragment f75862a;

        /* renamed from: b */
        final /* synthetic */ boolean f75863b;

        DialogInterface$OnClickListenerC30289d(CalendarDescriptionFragment cVar, boolean z) {
            this.f75862a = cVar;
            this.f75863b = z;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            Delegate d = this.f75862a.mo109416d();
            boolean z = this.f75863b;
            EditText editText = (EditText) this.f75862a.mo109250a(R.id.calendarDescriptionEditText);
            Intrinsics.checkExpressionValueIsNotNull(editText, "calendarDescriptionEditText");
            d.mo109417a(z, editText.getText().toString());
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_creator_description_fragment, (ViewGroup) null);
    }
}
