package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.RepeatFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.RepeatAdapter;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u000bH\u0016J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment$RepeatFragmentAction;", "repeatData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment$RepeatFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/RepeatFragmentData;)V", "mChosenIndex", "", "mIsFromLocalRecover", "", "mRepeatAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/RepeatAdapter;", "mRepeatData", "mRepeatFragmentAction", "initList", "", "initListener", "initTitle", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshData", "RepeatFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChooseRepeatFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public int f80291a;

    /* renamed from: b */
    public RepeatAdapter f80292b;

    /* renamed from: e */
    public RepeatFragmentAction f80293e;

    /* renamed from: f */
    private boolean f80294f = true;

    /* renamed from: g */
    private RepeatFragmentData f80295g;

    /* renamed from: h */
    private HashMap f80296h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment$RepeatFragmentAction;", "Ljava/io/Serializable;", "onBackPressed", "", "onSavePressed", "chosenIndex", "", "onStartCustomRepeatFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface RepeatFragmentAction extends Serializable {
        void onBackPressed();

        void onSavePressed(int i);

        void onStartCustomRepeatFragment();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80296h == null) {
            this.f80296h = new HashMap();
        }
        View view = (View) this.f80296h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80296h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80296h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    public ChooseRepeatFragment() {
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        RepeatFragmentAction repeatFragmentAction = this.f80293e;
        if (repeatFragmentAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatFragmentAction");
        }
        repeatFragmentAction.onBackPressed();
        return true;
    }

    /* renamed from: b */
    private final void m119457b() {
        ((CommonTitleBar) mo109250a(R.id.repeat_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.repeat_title_bar)).setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
        ((CommonTitleBar) mo109250a(R.id.repeat_title_bar)).setTitle(R.string.Calendar_Edit_ChooseRepeat);
        ((CommonTitleBar) mo109250a(R.id.repeat_title_bar)).setLeftClickListener(new C31632c(this));
    }

    /* renamed from: d */
    private final void m119459d() {
        ListView listView = (ListView) mo109250a(R.id.lv_repeat_times);
        Intrinsics.checkExpressionValueIsNotNull(listView, "lv_repeat_times");
        listView.setOnItemClickListener(new C31630a(this));
        ((RelativeLayout) mo109250a(R.id.ll_self_define_repeat)).setOnClickListener(new View$OnClickListenerC31631b(this));
    }

    /* renamed from: c */
    private final void m119458c() {
        RepeatAdapter gVar = this.f80292b;
        if (gVar == null) {
            RepeatFragmentData gVar2 = this.f80295g;
            if (gVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatData");
            }
            this.f80291a = gVar2.mo115114a();
            RepeatFragmentData gVar3 = this.f80295g;
            if (gVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatData");
            }
            ArrayList arrayList = new ArrayList(gVar3.mo115115b());
            RepeatFragmentData gVar4 = this.f80295g;
            if (gVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatData");
            }
            this.f80292b = new RepeatAdapter(arrayList, gVar4.mo115114a(), getContext());
            ListView listView = (ListView) mo109250a(R.id.lv_repeat_times);
            Intrinsics.checkExpressionValueIsNotNull(listView, "lv_repeat_times");
            listView.setAdapter((ListAdapter) this.f80292b);
        } else if (gVar != null) {
            RepeatFragmentData gVar5 = this.f80295g;
            if (gVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatData");
            }
            ArrayList<String> arrayList2 = new ArrayList<>(gVar5.mo115115b());
            RepeatFragmentData gVar6 = this.f80295g;
            if (gVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRepeatData");
            }
            gVar.mo115275a(arrayList2, gVar6.mo115114a());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment$initListener$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingOnItemClickListener;", "doOnItemClick", "", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "", "id", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatFragment$a */
    public static final class C31630a extends AbstractC32628d {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatFragment f80297a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31630a(ChooseRepeatFragment chooseRepeatFragment) {
            this.f80297a = chooseRepeatFragment;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d
        /* renamed from: a */
        public void mo115154a(AdapterView<?> adapterView, View view, int i, long j) {
            Intrinsics.checkParameterIsNotNull(adapterView, "parent");
            Intrinsics.checkParameterIsNotNull(view, "view");
            if (this.f80297a.f80291a != i) {
                this.f80297a.f80291a = i;
                RepeatAdapter gVar = this.f80297a.f80292b;
                if (gVar != null) {
                    gVar.notifyDataSetChanged();
                }
            }
            ChooseRepeatFragment.m119456a(this.f80297a).onSavePressed(this.f80297a.f80291a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/ChooseRepeatFragment$initTitle$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatFragment$c */
    public static final class C31632c extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatFragment f80299a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31632c(ChooseRepeatFragment chooseRepeatFragment) {
            this.f80299a = chooseRepeatFragment;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80299a.mo113714e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.ChooseRepeatFragment$b */
    public static final class View$OnClickListenerC31631b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChooseRepeatFragment f80298a;

        View$OnClickListenerC31631b(ChooseRepeatFragment chooseRepeatFragment) {
            this.f80298a = chooseRepeatFragment;
        }

        public final void onClick(View view) {
            ChooseRepeatFragment.m119456a(this.f80298a).onStartCustomRepeatFragment();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RepeatFragmentAction m119456a(ChooseRepeatFragment chooseRepeatFragment) {
        RepeatFragmentAction repeatFragmentAction = chooseRepeatFragment.f80293e;
        if (repeatFragmentAction == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRepeatFragmentAction");
        }
        return repeatFragmentAction;
    }

    /* renamed from: a */
    public final void mo115153a(RepeatFragmentData gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "repeatData");
        this.f80295g = gVar;
        m119458c();
    }

    public ChooseRepeatFragment(RepeatFragmentAction repeatFragmentAction, RepeatFragmentData gVar) {
        Intrinsics.checkParameterIsNotNull(repeatFragmentAction, "action");
        Intrinsics.checkParameterIsNotNull(gVar, "repeatData");
        this.f80293e = repeatFragmentAction;
        this.f80295g = gVar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80294f) {
            m119457b();
            m119458c();
            m119459d();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_event_repeat, (ViewGroup) null);
    }
}
