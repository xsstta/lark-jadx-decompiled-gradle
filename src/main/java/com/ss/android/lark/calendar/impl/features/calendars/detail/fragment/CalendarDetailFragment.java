package com.ss.android.lark.calendar.impl.features.calendars.detail.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.eventbus.Subscribe;
import com.ss.android.eventbus.ThreadMode;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDateHolder;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailInfo;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarDetailViewModel;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.CalendarMemberInfo;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.EventInstancePagingViewModel;
import com.ss.android.lark.calendar.impl.features.calendars.detail.viewmodel.InstanceCardInfo;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.recyclerview.AdapterList;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.fragment.C32496d;
import com.ss.android.lark.calendar.impl.framework.fragment.FragmentStack;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarDetailHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32488e;
import com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher;
import com.ss.android.lark.calendar.impl.framework.viewmodel.StatusData;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.log.Log;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001a\u0010\u0017\u001a\u00020\u00142\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0012\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010&\u001a\u00020\u0014H\u0016J\b\u0010'\u001a\u00020\u0014H\u0016J\u0010\u0010(\u001a\u00020\u00142\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0014H\u0016J\b\u0010,\u001a\u00020\u0014H\u0016J\u001a\u0010-\u001a\u00020\u00142\u0006\u0010.\u001a\u00020!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0012\u0010/\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u000100H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "()V", "calendarDetailView", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailView;", "detailViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailViewModel;", "firstRefreshSuccess", "", "from", "", "needRefresh", "pagingViewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/EventInstancePagingViewModel;", "doAction", ShareHitPoint.f121869d, "payload", "", "initPagingViewModel", "", "detail", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "onCalendarChanged", "sd", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "onCalendarEventChanged", "event", "Lcom/ss/android/lark/calendar/impl/framework/busevents/CalendarEventChangedEvent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onDestroyView", "onListIdle", "lastPosition", "", "onResume", "onStop", "onViewCreated", "view", "openEvent", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/InstanceCardInfo;", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarDetailFragment extends CalendarBaseFragment implements ActionDispatcher {

    /* renamed from: b */
    public static final Companion f75662b = new Companion(null);

    /* renamed from: a */
    public CalendarDetailView f75663a;

    /* renamed from: c */
    private String f75664c;

    /* renamed from: d */
    private CalendarDetailViewModel f75665d;

    /* renamed from: e */
    private EventInstancePagingViewModel f75666e;

    /* renamed from: f */
    private boolean f75667f = true;

    /* renamed from: g */
    private boolean f75668g;

    /* renamed from: h */
    private HashMap f75669h;

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f75669h == null) {
            this.f75669h = new HashMap();
        }
        View view = (View) this.f75669h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f75669h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f75669h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0016J\u0012\u0010\u0017\u001a\u00020\u0018*\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailFragment$Companion;", "", "()V", "ACTION_CLOSE", "", "ACTION_EDIT", "ACTION_LIST_IDLE", "ACTION_LOAD_FUTURE_INSTANCE", "ACTION_LOAD_PAST_INSTANCE", "ACTION_SHARE", "FROM_LINK", "FROM_QR_CODE", "KEY_CALENDAR_ID", "KEY_CALENDAR_SHARE_TOKEN", "KEY_FROM", "T", "buildCalendarDetailBundle", "Landroid/os/Bundle;", "calServerId", "from", "shareToken", "firstFragmentOpenAnim", "buildCalendarDetailBundle$calendar_impl_release", "onListIdle", "", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/ActionDispatcher;", "lastPosition", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final boolean mo109255a(ActionDispatcher aVar, int i) {
            Intrinsics.checkParameterIsNotNull(aVar, "$this$onListIdle");
            return aVar.doAction("ACTION_LIST_IDLE", Integer.valueOf(i));
        }

        /* renamed from: a */
        public final Bundle mo109254a(String str, String str2, String str3, String str4) {
            Intrinsics.checkParameterIsNotNull(str, "calServerId");
            Intrinsics.checkParameterIsNotNull(str4, "firstFragmentOpenAnim");
            Bundle bundle = new Bundle();
            bundle.putString("KEY_CALENDAR_ID", str);
            bundle.putString("START_FROM", str2);
            bundle.putString("KEY_CALENDAR_SHARE_TOKEN", str3);
            int hashCode = str4.hashCode();
            if (hashCode != -75429425) {
                if (hashCode == 1708849213 && str4.equals("FIRST_FRAGMENT_OPEN_ANIM_HORIZONTAL")) {
                    FragmentStack.f83315a.mo118664a(bundle, R.anim.slide_right_in);
                    FragmentStack.f83315a.mo118666b(bundle, R.anim.slide_right_out);
                    return bundle;
                }
            } else if (str4.equals("FIRST_FRAGMENT_OPEN_ANIM_VERTICAL")) {
                FragmentStack.f83315a.mo118664a(bundle, R.anim.activity_enter_from_bottom);
                FragmentStack.f83315a.mo118666b(bundle, R.anim.activity_close_to_bottom);
                return bundle;
            }
            FragmentStack.f83315a.mo118664a(bundle, 0);
            FragmentStack.f83315a.mo118666b(bundle, 0);
            return bundle;
        }

        /* renamed from: a */
        public static /* synthetic */ Bundle m112394a(Companion aVar, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            if ((i & 8) != 0) {
                str4 = "FIRST_FRAGMENT_OPEN_ANIM_NONE";
            }
            return aVar.mo109254a(str, str2, str3, str4);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f75668g = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f75663a = null;
        mo109251a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        CalendarDetailViewModel dVar;
        super.onResume();
        if (this.f75668g && (dVar = this.f75665d) != null) {
            ActionDispatcher.C32507a.m124446a(dVar, "ACTION_REFRESH", null, 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarDetailInfo;", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailFragment$onViewCreated$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment$b */
    static final class C30252b<T> implements AbstractC1178x<StatusData<CalendarDetailInfo>> {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailFragment f75670a;

        C30252b(CalendarDetailFragment calendarDetailFragment) {
            this.f75670a = calendarDetailFragment;
        }

        /* renamed from: a */
        public final void onChanged(StatusData<CalendarDetailInfo> gVar) {
            this.f75670a.mo109252a(gVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/features/calendars/detail/viewmodel/CalendarMemberInfo;", "kotlin.jvm.PlatformType", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailFragment$onViewCreated$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment$c */
    static final class C30253c<T> implements AbstractC1178x<CalendarMemberInfo> {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailFragment f75671a;

        C30253c(CalendarDetailFragment calendarDetailFragment) {
            this.f75671a = calendarDetailFragment;
        }

        /* renamed from: a */
        public final void onChanged(CalendarMemberInfo eVar) {
            CalendarDetailView aVar = this.f75671a.f75663a;
            if (aVar != null) {
                aVar.mo109262a(eVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailFragment$onViewCreated$1$3"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment$d */
    static final class C30254d<T> implements AbstractC1178x<StatusData<String>> {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailFragment f75672a;

        C30254d(CalendarDetailFragment calendarDetailFragment) {
            this.f75672a = calendarDetailFragment;
        }

        /* renamed from: a */
        public final void onChanged(StatusData<String> gVar) {
            CalendarDetailView aVar = this.f75672a.f75663a;
            if (aVar != null) {
                aVar.mo109266b(gVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/framework/viewmodel/StatusData;", "", "onChanged", "com/ss/android/lark/calendar/impl/features/calendars/detail/fragment/CalendarDetailFragment$onViewCreated$1$4"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment$e */
    static final class C30255e<T> implements AbstractC1178x<StatusData<Object>> {

        /* renamed from: a */
        final /* synthetic */ CalendarDetailFragment f75673a;

        C30255e(CalendarDetailFragment calendarDetailFragment) {
            this.f75673a = calendarDetailFragment;
        }

        /* renamed from: a */
        public final void onChanged(StatusData<Object> gVar) {
            CalendarDetailView aVar = this.f75673a.f75663a;
            if (aVar != null) {
                aVar.mo109268c(gVar);
            }
        }
    }

    /* renamed from: b */
    private final void m112390b(int i) {
        EventInstancePagingViewModel gVar;
        AdapterList<Object> list;
        if (i >= 0 && (gVar = this.f75666e) != null && (list = gVar.getList()) != null) {
            String str = null;
            CalendarDate calendarDate = null;
            while (true) {
                if (i < 0) {
                    break;
                }
                Object obj = list.get(i);
                if (obj instanceof CalendarDateHolder) {
                    calendarDate = ((CalendarDateHolder) obj).mo109174a();
                    break;
                }
                i--;
            }
            if (calendarDate != null) {
                CalendarDetailHitPoint bVar = CalendarDetailHitPoint.f83361a;
                CalendarDetailViewModel dVar = this.f75665d;
                if (dVar != null) {
                    str = dVar.getCalServerId();
                }
                bVar.mo118749b(str, String.valueOf(calendarDate.getTimeInSeconds()));
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onCalendarEventChanged(C32488e eVar) {
        String str;
        FragmentStack a;
        Intrinsics.checkParameterIsNotNull(eVar, "event");
        if (eVar.f83295b != null) {
            String str2 = eVar.f83295b;
            CalendarDetailViewModel dVar = this.f75665d;
            if (dVar != null) {
                str = dVar.getCalServerId();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str2, str) && (a = C32496d.m124053a(this)) != null) {
                a.mo118661a(this);
            }
        }
    }

    /* renamed from: a */
    private final void m112388a(CalendarDetailInfo cVar) {
        AbstractC1142af a = new C1144ai(this).mo6005a(EventInstancePagingViewModel.class);
        Intrinsics.checkExpressionValueIsNotNull(a, "ViewModelProvider(this).…ingViewModel::class.java)");
        EventInstancePagingViewModel gVar = (EventInstancePagingViewModel) a;
        String a2 = cVar.mo109177a();
        CalendarDate addMonth = new CalendarDate().addMonth(-1);
        Intrinsics.checkExpressionValueIsNotNull(addMonth, "CalendarDate().addMonth(-1)");
        CalendarDate addYear = new CalendarDate().addYear(1);
        Intrinsics.checkExpressionValueIsNotNull(addYear, "CalendarDate().addYear(1)");
        gVar.init(a2, addMonth, addYear);
        gVar.refresh();
        CalendarDetailView aVar = this.f75663a;
        if (aVar != null) {
            aVar.mo109261a(gVar.getList());
        }
        this.f75666e = gVar;
    }

    /* renamed from: a */
    private final void m112389a(InstanceCardInfo hVar) {
        FragmentActivity activity;
        CalendarDetailInfo detailInfo;
        if (hVar != null && (activity = getActivity()) != null) {
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity ?: return");
            CalendarDetailViewModel dVar = this.f75665d;
            if (dVar != null && (detailInfo = dVar.getDetailInfo()) != null) {
                CalendarDetailHitPoint.f83361a.mo118746a(detailInfo.mo109177a(), "event_details");
                if (detailInfo.mo109185i()) {
                    C31238b.m116879b(activity, hVar.mo109235f(), hVar.mo109236g(), hVar.mo109237h(), hVar.mo109239i());
                } else {
                    UDToast.show(activity, (int) R.string.Calendar_Onboarding_PleaseSubscribeFirst);
                }
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        boolean z;
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str3 = "";
        if (arguments == null || (str = arguments.getString("KEY_CALENDAR_ID")) == null) {
            str = str3;
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "arguments?.getString(KEY_CALENDAR_ID) ?: \"\"");
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("START_FROM");
        } else {
            str2 = null;
        }
        this.f75664c = str2;
        Bundle arguments3 = getArguments();
        if (!(arguments3 == null || (string = arguments3.getString("KEY_CALENDAR_SHARE_TOKEN")) == null)) {
            str3 = string;
        }
        Intrinsics.checkExpressionValueIsNotNull(str3, "arguments?.getString(KEY…LENDAR_SHARE_TOKEN) ?: \"\"");
        Log.m165389i("CalendarDetailFragment", "onCreate: " + str + ", " + this.f75664c + ", " + str3);
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (str3.length() != 0) {
                z2 = false;
            }
            if (z2) {
                FragmentStack a = C32496d.m124053a(this);
                if (a != null) {
                    a.mo118661a(this);
                    return;
                }
                return;
            }
        }
        CalendarDetailViewModel dVar = (CalendarDetailViewModel) new C1144ai(this).mo6005a(CalendarDetailViewModel.class);
        this.f75665d = dVar;
        dVar.init(str, str3);
        CalendarDetailViewModel dVar2 = this.f75665d;
        if (dVar2 != null) {
            ActionDispatcher.C32507a.m124446a(dVar2, "ACTION_REFRESH", null, 2, null);
        }
        EventBus.getDefault().register(this);
    }

    /* renamed from: a */
    public final void mo109252a(StatusData<CalendarDetailInfo> gVar) {
        CalendarDetailInfo cVar;
        CalendarDetailView aVar = this.f75663a;
        if (aVar != null) {
            aVar.mo109264a(gVar);
        }
        Calendar calendar = null;
        if (gVar != null) {
            cVar = gVar.mo118792e();
        } else {
            cVar = null;
        }
        if (cVar != null && gVar.mo118790c() && this.f75667f) {
            this.f75667f = false;
            m112388a(cVar);
            CalendarDetailHitPoint.f83361a.mo118747a(cVar.mo109177a(), cVar.mo109185i(), cVar.mo109183g(), Intrinsics.areEqual(this.f75664c, "FROM_LINK"), Intrinsics.areEqual(this.f75664c, "FROM_QR_CODE"));
        }
        EventInstancePagingViewModel gVar2 = this.f75666e;
        if (gVar2 != null) {
            if (cVar != null) {
                calendar = cVar.mo109189m();
            }
            gVar2.setCalendar(calendar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        CalendarDetailViewModel dVar = this.f75665d;
        if (dVar != null) {
            dVar.getDetailInfoStatus().mo5923a(getViewLifecycleOwner(), new C30252b(this));
            dVar.getOwnerInfo().mo5923a(getViewLifecycleOwner(), new C30253c(this));
            dVar.getSubscribeStatus().mo5923a(getViewLifecycleOwner(), new C30254d(this));
            dVar.getDeleteStatus().mo5923a(getViewLifecycleOwner(), new C30255e(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.android.lark.calendar.impl.framework.viewmodel.ActionDispatcher
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean doAction(java.lang.String r6, java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.calendars.detail.fragment.CalendarDetailFragment.doAction(java.lang.String, java.lang.Object):boolean");
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        CalendarDetailView aVar = new CalendarDetailView(layoutInflater, viewGroup, this);
        this.f75663a = aVar;
        return aVar.mo109260a();
    }
}
