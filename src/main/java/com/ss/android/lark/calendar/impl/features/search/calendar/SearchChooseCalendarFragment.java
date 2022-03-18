package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeActivity;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarPresenter;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J&\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\nH\u0016J\u001a\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u000e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u0004J\"\u0010\u001f\u001a\u00020\n2\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#J\"\u0010$\u001a\u00020\n2\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020&\u0018\u00010!j\n\u0012\u0004\u0012\u00020&\u0018\u0001`#R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "mDelegate", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment$Delegate;", "presenter", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter;", "rootView", "Landroid/view/View;", "initMVP", "", "onBackPressed", "", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "", "enter", "nextAnim", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "setDelegate", "delegate", "updateCalendars", "calendars", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "updateSelectedCalendarIds", "selectedCalendarIds", "", "Companion", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.d */
public final class SearchChooseCalendarFragment extends View$OnClickListenerC31538b {

    /* renamed from: e */
    public static final Companion f82725e = new Companion(null);

    /* renamed from: a */
    public View f82726a;

    /* renamed from: b */
    public Delegate f82727b;

    /* renamed from: f */
    private SearchChooseCalendarPresenter f82728f;

    /* renamed from: g */
    private HashMap f82729g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment$Delegate;", "", "onBackPressed", "", "onSavePressed", "selectedCalendarIdList", "", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.d$b */
    public interface Delegate {
        /* renamed from: a */
        void mo117985a();

        /* renamed from: a */
        void mo117986a(List<String> list);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f82729g == null) {
            this.f82729g = new HashMap();
        }
        View view = (View) this.f82729g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f82729g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f82729g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e`\u000fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment$Companion;", "", "()V", "CALENDAR_DATA", "", "GOOGLE_ACCOUNT_SETTING", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment;", "calendarData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "googleAccountSetting", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SearchChooseCalendarFragment mo118095a(ArrayList<Calendar> arrayList, HashMap<String, Boolean> hashMap) {
            Intrinsics.checkParameterIsNotNull(arrayList, "calendarData");
            Intrinsics.checkParameterIsNotNull(hashMap, "googleAccountSetting");
            SearchChooseCalendarFragment dVar = new SearchChooseCalendarFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("calendar_data", arrayList);
            bundle.putSerializable("google_account_setting", hashMap);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarFragment$initMVP$1", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/SearchChooseCalendarPresenter$Dependency;", "onBackPressed", "", "onSaveSelected", "selectedIds", "", "", "startSubscribeActivity", "requestCode", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.d$c */
    public static final class C32319c implements SearchChooseCalendarPresenter.Dependency {

        /* renamed from: a */
        final /* synthetic */ SearchChooseCalendarFragment f82730a;

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarPresenter.Dependency
        /* renamed from: a */
        public void mo118096a() {
            Delegate bVar = this.f82730a.f82727b;
            if (bVar != null) {
                bVar.mo117985a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32319c(SearchChooseCalendarFragment dVar) {
            this.f82730a = dVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarPresenter.Dependency
        /* renamed from: a */
        public void mo118097a(int i) {
            C30022a.f74882a.appRouter().mo108210a(CalendarSubscribeActivity.class).mo108155a(SearchChooseCalendarFragment.m123309a(this.f82730a).getContext(), i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.search.calendar.SearchChooseCalendarPresenter.Dependency
        /* renamed from: a */
        public void mo118098a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "selectedIds");
            Delegate bVar = this.f82730a.f82727b;
            if (bVar != null) {
                bVar.mo117986a(list);
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        Delegate bVar = this.f82727b;
        if (bVar == null) {
            return true;
        }
        bVar.mo117985a();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SearchChooseCalendarPresenter fVar = this.f82728f;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar.destroy();
    }

    /* renamed from: b */
    private final void m123310b() {
        View view = this.f82726a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        SearchChooseCalendarPresenter fVar = new SearchChooseCalendarPresenter(new SearchChooseCalendarView(view), new SearchChooseCalendarModel(getArguments()));
        this.f82728f = fVar;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar.create();
        SearchChooseCalendarPresenter fVar2 = this.f82728f;
        if (fVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar2.mo118104a(new C32319c(this));
    }

    /* renamed from: a */
    public static final /* synthetic */ View m123309a(SearchChooseCalendarFragment dVar) {
        View view = dVar.f82726a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    /* renamed from: b */
    public final void mo118094b(ArrayList<Calendar> arrayList) {
        SearchChooseCalendarPresenter fVar = this.f82728f;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar.mo118106b(arrayList);
    }

    /* renamed from: a */
    public final void mo118092a(Delegate bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "delegate");
        this.f82727b = bVar;
    }

    /* renamed from: a */
    public final void mo118093a(ArrayList<String> arrayList) {
        SearchChooseCalendarPresenter fVar = this.f82728f;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("presenter");
        }
        fVar.mo118105a(arrayList);
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m123310b();
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.slide_right_left);
            Intrinsics.checkExpressionValueIsNotNull(loadAnimation, "AnimationUtils.loadAnima… R.anim.slide_right_left)");
            return loadAnimation;
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.mContext, R.anim.slide_left_right);
        Intrinsics.checkExpressionValueIsNotNull(loadAnimation2, "AnimationUtils.loadAnima… R.anim.slide_left_right)");
        return loadAnimation2;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_search_calendar, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…nt_search_calendar, null)");
        this.f82726a = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return inflate;
    }
}
