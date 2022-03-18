package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.udswitch.UDSwitch;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.ReminderFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.ReminderAdapter;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001'B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0002J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\bH\u0002J\u001a\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0016\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\rj\b\u0012\u0004\u0012\u00020\b`\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment$ReminderFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;", "defaultRemindTimeIndex", "", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment$ReminderFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/ReminderFragmentData;I)V", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/ReminderAdapter;", "mChosenIndexs", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "mDefaultRemindTimeIndex", "mIsFromLocalRecover", "", "mReminderData", "mReminderFragmentAction", "initListener", "", "initReminderList", "initTitleBar", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMultiSelectClick", "position", "onViewCreated", "view", "refreshData", "reminderData", "ReminderFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c */
public final class ChooseReminderFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public ReminderFragmentAction f80438a;

    /* renamed from: b */
    public ReminderFragmentData f80439b;

    /* renamed from: e */
    public final HashSet<Integer> f80440e;

    /* renamed from: f */
    public ReminderAdapter f80441f;

    /* renamed from: g */
    public int f80442g;

    /* renamed from: h */
    private boolean f80443h;

    /* renamed from: i */
    private HashMap f80444i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001b\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment$ReminderFragmentAction;", "", "onBackPressed", "", "onSavePressed", "chosenIndexArray", "", "", "([Ljava/lang/Integer;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c$a */
    public interface ReminderFragmentAction {
        /* renamed from: a */
        void mo114384a();

        /* renamed from: a */
        void mo114385a(Integer[] numArr);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80444i == null) {
            this.f80444i = new HashMap();
        }
        View view = (View) this.f80444i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80444i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80444i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public ChooseReminderFragment() {
        this.f80440e = new HashSet<>();
        this.f80443h = true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        ReminderFragmentAction aVar = this.f80438a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderFragmentAction");
        }
        aVar.mo114384a();
        return true;
    }

    /* renamed from: d */
    private final void m119690d() {
        ((UDSwitch) mo109250a(R.id.reminder_switch)).setOnCheckedChangeListener(new C31651b(this));
        ListView listView = (ListView) mo109250a(R.id.lv_reminder_times);
        Intrinsics.checkExpressionValueIsNotNull(listView, "lv_reminder_times");
        listView.setOnItemClickListener(new C31652c(this));
    }

    /* renamed from: c */
    private final void m119689c() {
        ((CommonTitleBar) mo109250a(R.id.reminder_title_bar)).setLeftImageDrawable(null);
        ((CommonTitleBar) mo109250a(R.id.reminder_title_bar)).setLeftText(R.string.Calendar_Common_Cancel);
        ReminderFragmentData eVar = this.f80439b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
        }
        if (!eVar.mo115095c()) {
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            ((CommonTitleBar) mo109250a(R.id.reminder_title_bar)).addAction(new C31653d(this, context.getResources().getString(R.string.Calendar_Common_Done), R.color.primary_pri_500));
        }
        ((CommonTitleBar) mo109250a(R.id.reminder_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.reminder_title_bar)).setLeftClickListener(new C31654e(this));
        ((CommonTitleBar) mo109250a(R.id.reminder_title_bar)).setTitle(R.string.Calendar_Edit_ChooseAlerts);
    }

    /* renamed from: b */
    private final void m119688b() {
        this.f80440e.clear();
        ReminderFragmentData eVar = this.f80439b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
        }
        if (CollectionUtils.isNotEmpty(eVar.mo115094b())) {
            HashSet<Integer> hashSet = this.f80440e;
            ReminderFragmentData eVar2 = this.f80439b;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
            }
            hashSet.addAll(eVar2.mo115094b());
        }
        if (this.f80440e.isEmpty()) {
            UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.reminder_switch);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "reminder_switch");
            uDSwitch.setChecked(false);
            ListView listView = (ListView) mo109250a(R.id.lv_reminder_times);
            Intrinsics.checkExpressionValueIsNotNull(listView, "lv_reminder_times");
            listView.setVisibility(8);
            View a = mo109250a(R.id.lv_reminder_times_divider);
            Intrinsics.checkExpressionValueIsNotNull(a, "lv_reminder_times_divider");
            a.setVisibility(8);
        } else {
            UDSwitch uDSwitch2 = (UDSwitch) mo109250a(R.id.reminder_switch);
            Intrinsics.checkExpressionValueIsNotNull(uDSwitch2, "reminder_switch");
            uDSwitch2.setChecked(true);
            ListView listView2 = (ListView) mo109250a(R.id.lv_reminder_times);
            Intrinsics.checkExpressionValueIsNotNull(listView2, "lv_reminder_times");
            listView2.setVisibility(0);
            View a2 = mo109250a(R.id.lv_reminder_times_divider);
            Intrinsics.checkExpressionValueIsNotNull(a2, "lv_reminder_times_divider");
            a2.setVisibility(0);
        }
        ReminderAdapter fVar = this.f80441f;
        if (fVar == null) {
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            ReminderFragmentData eVar3 = this.f80439b;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
            }
            ReminderAdapter fVar2 = new ReminderAdapter(context, eVar3.mo115093a());
            this.f80441f = fVar2;
            if (fVar2 != null) {
                ReminderFragmentData eVar4 = this.f80439b;
                if (eVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
                }
                fVar2.mo115263a(eVar4);
            }
            ListView listView3 = (ListView) mo109250a(R.id.lv_reminder_times);
            Intrinsics.checkExpressionValueIsNotNull(listView3, "lv_reminder_times");
            listView3.setAdapter((ListAdapter) this.f80441f);
        } else if (fVar != null) {
            ReminderFragmentData eVar5 = this.f80439b;
            if (eVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
            }
            fVar.mo115265b(eVar5);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment$initTitleBar$2", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c$e */
    public static final class C31654e extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseReminderFragment f80448a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31654e(ChooseReminderFragment cVar) {
            this.f80448a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            ChooseReminderFragment.m119686a(this.f80448a).mo114384a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ReminderFragmentAction m119686a(ChooseReminderFragment cVar) {
        ReminderFragmentAction aVar = cVar.f80438a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderFragmentAction");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ReminderFragmentData m119687b(ChooseReminderFragment cVar) {
        ReminderFragmentData eVar = cVar.f80439b;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReminderData");
        }
        return eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseReminderFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c$d */
    public static final class C31653d extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ ChooseReminderFragment f80447a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
            Object[] array = this.f80447a.f80440e.toArray(new Integer[0]);
            if (array != null) {
                Integer[] numArr = (Integer[]) array;
                Arrays.sort(numArr);
                ChooseReminderFragment.m119686a(this.f80447a).mo114385a(numArr);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31653d(ChooseReminderFragment cVar, String str, int i) {
            super(str, i);
            this.f80447a = cVar;
        }
    }

    /* renamed from: b */
    public final void mo115326b(int i) {
        if (this.f80440e.contains(Integer.valueOf(i))) {
            this.f80440e.remove(Integer.valueOf(i));
            if (this.f80440e.size() == 0) {
                UDSwitch uDSwitch = (UDSwitch) mo109250a(R.id.reminder_switch);
                Intrinsics.checkExpressionValueIsNotNull(uDSwitch, "reminder_switch");
                uDSwitch.setChecked(false);
                return;
            }
            return;
        }
        this.f80440e.add(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo115325a(ReminderFragmentData eVar, int i) {
        Intrinsics.checkParameterIsNotNull(eVar, "reminderData");
        this.f80439b = eVar;
        this.f80442g = i;
        m119688b();
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80443h) {
            m119689c();
            m119688b();
            m119690d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c$b */
    public static final class C31651b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ ChooseReminderFragment f80445a;

        C31651b(ChooseReminderFragment cVar) {
            this.f80445a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!z) {
                this.f80445a.f80440e.clear();
                ReminderAdapter fVar = this.f80445a.f80441f;
                if (fVar != null) {
                    fVar.mo115264a(this.f80445a.f80440e);
                }
                ReminderAdapter fVar2 = this.f80445a.f80441f;
                if (fVar2 != null) {
                    fVar2.notifyDataSetChanged();
                }
                ListView listView = (ListView) this.f80445a.mo109250a(R.id.lv_reminder_times);
                Intrinsics.checkExpressionValueIsNotNull(listView, "lv_reminder_times");
                listView.setVisibility(8);
                View a = this.f80445a.mo109250a(R.id.lv_reminder_times_divider);
                Intrinsics.checkExpressionValueIsNotNull(a, "lv_reminder_times_divider");
                a.setVisibility(8);
                return;
            }
            this.f80445a.f80440e.clear();
            this.f80445a.f80440e.add(Integer.valueOf(this.f80445a.f80442g));
            ReminderAdapter fVar3 = this.f80445a.f80441f;
            if (fVar3 != null) {
                fVar3.mo115264a(this.f80445a.f80440e);
            }
            ReminderAdapter fVar4 = this.f80445a.f80441f;
            if (fVar4 != null) {
                fVar4.notifyDataSetChanged();
            }
            ListView listView2 = (ListView) this.f80445a.mo109250a(R.id.lv_reminder_times);
            Intrinsics.checkExpressionValueIsNotNull(listView2, "lv_reminder_times");
            listView2.setVisibility(0);
            View a2 = this.f80445a.mo109250a(R.id.lv_reminder_times_divider);
            Intrinsics.checkExpressionValueIsNotNull(a2, "lv_reminder_times_divider");
            a2.setVisibility(0);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_reminder, (ViewGroup) null);
    }

    public ChooseReminderFragment(ReminderFragmentAction aVar, ReminderFragmentData eVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(eVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80440e = new HashSet<>();
        this.f80438a = aVar;
        this.f80439b = eVar;
        this.f80443h = false;
        this.f80442g = i;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "parent", "Landroid/widget/AdapterView;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "position", "", "id", "", "onItemClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.c$c */
    public static final class C31652c implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseReminderFragment f80446a;

        C31652c(ChooseReminderFragment cVar) {
            this.f80446a = cVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (ChooseReminderFragment.m119687b(this.f80446a).mo115095c()) {
                ReminderFragmentAction a = ChooseReminderFragment.m119686a(this.f80446a);
                Integer[] numArr = new Integer[1];
                for (int i2 = 0; i2 < 1; i2++) {
                    numArr[i2] = Integer.valueOf(i);
                }
                a.mo114385a(numArr);
                return;
            }
            this.f80446a.mo115326b(i);
            ReminderAdapter fVar = this.f80446a.f80441f;
            if (fVar != null) {
                fVar.mo115264a(this.f80446a.f80440e);
            }
            ReminderAdapter fVar2 = this.f80446a.f80441f;
            if (fVar2 != null) {
                fVar2.notifyDataSetChanged();
            }
        }
    }
}
