package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.CalendarFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.CalendarAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J8\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J8\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J0\u0010\u001b\u001a\u00020\u000f2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u001dj\b\u0012\u0004\u0012\u00020\u000f`\u001e2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\b\u0010&\u001a\u00020#H\u0002J\b\u0010'\u001a\u00020\rH\u0016J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J6\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020!2\u0006\u00104\u001a\u0002052\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020\u0006R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "calendarFragmentAction", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment$CalendarFragmentAction;", "calendarFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/CalendarFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment$CalendarFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/CalendarFragmentData;)V", "mCalendarAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/CalendarAdapter;", "mCalendarFragmentAction", "mCalendarFragmentData", "mIsFromLocalRecover", "", "getClearItemStr", "", "changedAttendee", "attendeeStr", "changedMeetingRoom", "meetingRoomStr", "commaStr", "andStr", "getModifyItemStr", "changedRepeat", "repeatStr", "changedReminder", "reminderStr", "getShowStringByList", "showStrList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSingleItemStr", "resId", "", "initCalendarList", "", "initListener", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "showCalendarSwitchDialog", "currentIndex", "changeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "updateData", "fragmentCalendarData", "CalendarFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChooseCalendarFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public CalendarFragmentAction f80266a;

    /* renamed from: b */
    public CalendarFragmentData f80267b;

    /* renamed from: e */
    private boolean f80268e = true;

    /* renamed from: f */
    private CalendarAdapter f80269f;

    /* renamed from: g */
    private HashMap f80270g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment$CalendarFragmentAction;", "Ljava/io/Serializable;", "onBackPressed", "", "onCalendarSwitch", "position", "", "onSavePressed", "currentIndex", "changeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface CalendarFragmentAction extends Serializable {
        void onBackPressed();

        void onCalendarSwitch(int i);

        void onSavePressed(int i, EditCalendarPart.CHANGE_TYPE change_type);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80270g == null) {
            this.f80270g = new HashMap();
        }
        View view = (View) this.f80270g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80270g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80270g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public ChooseCalendarFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        CalendarFragmentAction calendarFragmentAction = this.f80266a;
        if (calendarFragmentAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentAction");
        }
        calendarFragmentAction.onBackPressed();
        return true;
    }

    /* renamed from: f */
    private final void m119437f() {
        ListView listView = (ListView) mo109250a(R.id.lv_calendar);
        Intrinsics.checkExpressionValueIsNotNull(listView, "lv_calendar");
        listView.setOnItemClickListener(new C31624a(this));
    }

    /* renamed from: d */
    private final void m119436d() {
        ((CommonTitleBar) mo109250a(R.id.choose_calendar_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.choose_calendar_title_bar)).setTitle(R.string.Calendar_Edit_ChooseCalendar);
        ((CommonTitleBar) mo109250a(R.id.choose_calendar_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) mo109250a(R.id.choose_calendar_title_bar)).setLeftClickListener(new C31625b(this));
    }

    /* renamed from: b */
    private final void m119434b() {
        m119436d();
        m119435c();
        m119437f();
    }

    /* renamed from: c */
    private final void m119435c() {
        CalendarAdapter dVar = this.f80269f;
        if (dVar == null) {
            CalendarFragmentData calendarFragmentData = this.f80267b;
            if (calendarFragmentData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentData");
            }
            ArrayList<EventCalendarData> calendarList = calendarFragmentData.getCalendarList();
            CalendarFragmentData calendarFragmentData2 = this.f80267b;
            if (calendarFragmentData2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentData");
            }
            int currentIndex = calendarFragmentData2.getCurrentIndex();
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            this.f80269f = new CalendarAdapter(calendarList, currentIndex, context);
            ListView listView = (ListView) mo109250a(R.id.lv_calendar);
            Intrinsics.checkExpressionValueIsNotNull(listView, "lv_calendar");
            listView.setAdapter((ListAdapter) this.f80269f);
        } else if (dVar != null) {
            CalendarFragmentData calendarFragmentData3 = this.f80267b;
            if (calendarFragmentData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentData");
            }
            ArrayList<EventCalendarData> calendarList2 = calendarFragmentData3.getCalendarList();
            CalendarFragmentData calendarFragmentData4 = this.f80267b;
            if (calendarFragmentData4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentData");
            }
            dVar.mo115215a(calendarList2, calendarFragmentData4.getCurrentIndex());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseCalendarFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment$b */
    public static final class C31625b extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseCalendarFragment f80272a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31625b(ChooseCalendarFragment chooseCalendarFragment) {
            this.f80272a = chooseCalendarFragment;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80272a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ CalendarFragmentData m119428a(ChooseCalendarFragment chooseCalendarFragment) {
        CalendarFragmentData calendarFragmentData = chooseCalendarFragment.f80267b;
        if (calendarFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentData");
        }
        return calendarFragmentData;
    }

    /* renamed from: b */
    public static final /* synthetic */ CalendarFragmentAction m119431b(ChooseCalendarFragment chooseCalendarFragment) {
        CalendarFragmentAction calendarFragmentAction = chooseCalendarFragment.f80266a;
        if (calendarFragmentAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCalendarFragmentAction");
        }
        return calendarFragmentAction;
    }

    /* renamed from: b */
    private final String m119432b(int i) {
        String b = C32634ae.m125182b(i);
        AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
        if (languageDependency.mo108250c()) {
            Intrinsics.checkExpressionValueIsNotNull(b, "itemStr");
            if (b != null) {
                b = b.toLowerCase();
                Intrinsics.checkExpressionValueIsNotNull(b, "(this as java.lang.String).toLowerCase()");
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        Intrinsics.checkExpressionValueIsNotNull(b, "itemStr");
        return b;
    }

    /* renamed from: a */
    public final void mo115145a(CalendarFragmentData calendarFragmentData) {
        Intrinsics.checkParameterIsNotNull(calendarFragmentData, "fragmentCalendarData");
        this.f80267b = calendarFragmentData;
        m119435c();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment$c */
    public static final class DialogInterface$OnClickListenerC31626c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseCalendarFragment f80273a;

        /* renamed from: b */
        final /* synthetic */ int f80274b;

        /* renamed from: c */
        final /* synthetic */ EditCalendarPart.CHANGE_TYPE f80275c;

        DialogInterface$OnClickListenerC31626c(ChooseCalendarFragment chooseCalendarFragment, int i, EditCalendarPart.CHANGE_TYPE change_type) {
            this.f80273a = chooseCalendarFragment;
            this.f80274b = i;
            this.f80275c = change_type;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ChooseCalendarFragment.m119431b(this.f80273a).onSavePressed(this.f80274b, this.f80275c);
        }
    }

    public ChooseCalendarFragment(CalendarFragmentAction calendarFragmentAction, CalendarFragmentData calendarFragmentData) {
        Intrinsics.checkParameterIsNotNull(calendarFragmentAction, "calendarFragmentAction");
        Intrinsics.checkParameterIsNotNull(calendarFragmentData, "calendarFragmentData");
        this.f80266a = calendarFragmentAction;
        this.f80267b = calendarFragmentData;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80268e) {
            m119434b();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_choose_calendar, viewGroup, false);
    }

    /* renamed from: a */
    private final String m119429a(ArrayList<String> arrayList, String str, String str2) {
        if (CollectionUtils.isEmpty(arrayList)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 3) {
            sb.append(arrayList.get(0));
            sb.append(str);
            sb.append(arrayList.get(1));
            sb.append(str2);
            sb.append(arrayList.get(2));
        } else if (arrayList.size() == 2) {
            sb.append(arrayList.get(0));
            sb.append(str2);
            sb.append(arrayList.get(1));
        } else if (arrayList.size() == 1) {
            sb.append(arrayList.get(0));
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "builder.toString()");
        return sb2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "parent", "Landroid/widget/AdapterView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseCalendarFragment$a */
    public static final class C31624a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseCalendarFragment f80271a;

        C31624a(ChooseCalendarFragment chooseCalendarFragment) {
            this.f80271a = chooseCalendarFragment;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (ChooseCalendarFragment.m119428a(this.f80271a).getCurrentIndex() != i) {
                ChooseCalendarFragment.m119431b(this.f80271a).onCalendarSwitch(i);
            }
        }
    }

    /* renamed from: a */
    private final String m119430a(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (z) {
            arrayList.add(str);
        }
        if (z2) {
            arrayList.add(str2);
        }
        return m119429a(arrayList, str3, str4);
    }

    /* renamed from: b */
    private final String m119433b(boolean z, String str, boolean z2, String str2, String str3, String str4) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.clear();
        if (z) {
            arrayList.add(str);
        }
        if (z2) {
            arrayList.add(str2);
        }
        return m119429a(arrayList, str3, str4);
    }

    /* renamed from: a */
    public final void mo115144a(int i, EditCalendarPart.CHANGE_TYPE change_type, boolean z, boolean z2, boolean z3, boolean z4) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(change_type, "changeType");
        if (change_type == EditCalendarPart.CHANGE_TYPE.LARK_TO_EXCHANGE || change_type == EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_EXCHANGE) {
            str = C32634ae.m125182b(R.string.Calendar_Exchange_Switch);
        } else if (change_type == EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_GOOGLE || change_type == EditCalendarPart.CHANGE_TYPE.LARK_TO_GOOGLE) {
            str = C32634ae.m125182b(R.string.Calendar_GoogleCal_SureSwitchToGoogle);
        } else {
            str = UIHelper.mustacheFormat((int) R.string.Calendar_GoogleCal_SureSwitchToLark);
        }
        String b = m119432b(R.string.Calendar_Common_Guests);
        String b2 = m119432b(R.string.Calendar_Common_Room);
        String b3 = m119432b(R.string.Calendar_Common_RRule);
        String b4 = m119432b(R.string.Calendar_Edit_Alert);
        String b5 = C32634ae.m125182b(R.string.Calendar_Common_Comma);
        String b6 = C32634ae.m125182b(R.string.Calendar_Common_And);
        if ((z || z2) && (z3 || z4)) {
            HashMap hashMap = new HashMap();
            Intrinsics.checkExpressionValueIsNotNull(b5, "commaStr");
            Intrinsics.checkExpressionValueIsNotNull(b6, "andStr");
            hashMap.put("Param1", m119430a(z2, b, z, b2, b5, b6));
            hashMap.put("Param2", m119433b(z4, b3, z3, b4, b5, b6));
            str2 = UIHelper.mustacheFormat((int) R.string.Calendar_Exchange_ChangeCalTips, hashMap);
            Intrinsics.checkExpressionValueIsNotNull(str2, "UIHelper.mustacheFormat(…ChangeCalTips, stringMap)");
        } else if (z || z2) {
            Intrinsics.checkExpressionValueIsNotNull(b5, "commaStr");
            Intrinsics.checkExpressionValueIsNotNull(b6, "andStr");
            str2 = UIHelper.mustacheFormat((int) R.string.Calendar_Exchange_ChangeCalTipsClear, "Param1", m119430a(z2, b, z, b2, b5, b6));
            Intrinsics.checkExpressionValueIsNotNull(str2, "UIHelper.mustacheFormat(…omStr, commaStr, andStr))");
        } else if (z3 || z4) {
            Intrinsics.checkExpressionValueIsNotNull(b5, "commaStr");
            Intrinsics.checkExpressionValueIsNotNull(b6, "andStr");
            str2 = UIHelper.mustacheFormat((int) R.string.Calendar_Exchange_ChangeCalTipsAdjust, "Param2", m119433b(z4, b3, z3, b4, b5, b6));
            Intrinsics.checkExpressionValueIsNotNull(str2, "UIHelper.mustacheFormat(…erStr, commaStr, andStr))");
        } else {
            str2 = "";
        }
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        UDDialogBuilder eVar = new UDDialogBuilder(context);
        Intrinsics.checkExpressionValueIsNotNull(str, "title");
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) eVar.title(str)).titleLineCount(2)).message(str2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Calendar_Common_Confirm, new DialogInterface$OnClickListenerC31626c(this, i, change_type))).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Calendar_Common_Cancel, (DialogInterface.OnClickListener) null)).messageTextSize(14)).messageTextColor(R.color.text_caption)).show();
    }
}
