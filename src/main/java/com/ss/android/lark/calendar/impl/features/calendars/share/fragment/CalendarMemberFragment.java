package com.ss.android.lark.calendar.impl.features.calendars.share.fragment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareViewModel;
import com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarEditShareMemberFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareHelper;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.IActionTitlebar;
import com.ss.android.lark.utils.StatusBarUtil;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0002\u0006\u0017\u0018\u0000 /2\u00020\u0001:\u0002/0B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\r\u0010\u0016\u001a\u00020\u0017H\u0002¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0013H\u0002J\u0010\u0010\u001a\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\b\u0010\u001b\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002J\u0006\u0010\u001f\u001a\u00020\tJ&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\u001a\u0010(\u001a\u00020\u00132\u0006\u0010)\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u00061"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "()V", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$MemberDelegate;", "editMemberFragmentDelete", "com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$editMemberFragmentDelete$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$editMemberFragmentDelete$1;", "isCalendarEditShareFragmentShow", "", "mCalendarEditShareMemberFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarEditShareMemberFragment;", "mMemberAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "getEditMemberFragmentData", "com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$getEditMemberFragmentData$1", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$getEditMemberFragmentData$1;", "hideCalendarEditShareMemberFragment", "hideFragment", "initLiveData", "initMemberRv", "initTitleBar", "initView", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshView", "showCalendarEditShareMemberFragment", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "showFragment", "Companion", "MemberDelegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e */
public final class CalendarMemberFragment extends CalendarBaseFragment {

    /* renamed from: c */
    public static final Companion f76280c = new Companion(null);

    /* renamed from: a */
    public CalendarShareMemberAdapter f76281a;

    /* renamed from: b */
    public MemberDelegate f76282b;

    /* renamed from: d */
    private CalendarEditShareMemberFragment f76283d;

    /* renamed from: e */
    private boolean f76284e;

    /* renamed from: f */
    private final C30486c f76285f = new C30486c(this);

    /* renamed from: g */
    private HashMap f76286g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$MemberDelegate;", "", "onBackPressed", "", "routeCalendarPickerActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$b */
    public interface MemberDelegate {
        /* renamed from: a */
        void mo109891a();

        /* renamed from: b */
        void mo109892b();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76286g == null) {
            this.f76286g = new HashMap();
        }
        View view = (View) this.f76286g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76286g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76286g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$Companion;", "", "()V", "newInstance", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment;", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$MemberDelegate;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CalendarMemberFragment mo109992a(MemberDelegate bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "delegate");
            CalendarMemberFragment eVar = new CalendarMemberFragment();
            eVar.f76282b = bVar;
            return eVar;
        }
    }

    /* renamed from: i */
    private final C30487d m113279i() {
        return new C30487d(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$editMemberFragmentDelete$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentDelegate;", "onBackPressed", "", "onDeleteMember", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "onEditMemberAccessRole", "newAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$c */
    public static final class C30486c implements IEditMemberFragmentDelegate {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f76287a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate
        /* renamed from: a */
        public void mo109964a() {
            this.f76287a.mo109989c();
            this.f76287a.mo109991d();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30486c(CalendarMemberFragment eVar) {
            this.f76287a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate
        /* renamed from: a */
        public void mo109965a(CalendarMember.C15546a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "member");
            CalendarShareViewModel b = this.f76287a.mo109987b();
            if (b != null) {
                b.onDeleteMember(aVar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentDelegate
        /* renamed from: a */
        public void mo109966a(CalendarMember.C15546a aVar, Calendar.AccessRole accessRole) {
            Intrinsics.checkParameterIsNotNull(aVar, "member");
            Intrinsics.checkParameterIsNotNull(accessRole, "newAccessRole");
            CalendarShareViewModel b = this.f76287a.mo109987b();
            if (b != null) {
                b.onEditMemberAccessRole(aVar, accessRole);
            }
        }
    }

    /* renamed from: j */
    private final void m113280j() {
        mo109990c(this.f76283d);
        this.f76284e = false;
    }

    /* renamed from: b */
    public final CalendarShareViewModel mo109987b() {
        return CalendarShareHelper.f76321a.mo110028a(getActivity());
    }

    /* renamed from: d */
    public final boolean mo109991d() {
        if (!this.f76284e) {
            return false;
        }
        m113280j();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$getEditMemberFragmentData$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IEditMemberFragmentData;", "getCalendarId", "", "getCalendarShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getCalendarTenantId", "isLocalEdit", "", "needAdjustTopPadding", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$d */
    public static final class C30487d implements IEditMemberFragmentData {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f76288a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: d */
        public boolean mo109962d() {
            return false;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: e */
        public boolean mo109963e() {
            return true;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: a */
        public String mo109959a() {
            String calendarId;
            CalendarShareViewModel b = this.f76288a.mo109987b();
            if (b == null || (calendarId = b.getCalendarId()) == null) {
                return "";
            }
            return calendarId;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: b */
        public Calendar.CalendarShareOptions mo109960b() {
            Calendar calendar;
            CalendarShareViewModel b = this.f76288a.mo109987b();
            if (b == null || (calendar = b.getCalendar()) == null) {
                return null;
            }
            return calendar.share_options;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IEditMemberFragmentData
        /* renamed from: c */
        public String mo109961c() {
            C1177w<CalendarTenantInfo> calendarTenantInfo;
            CalendarTenantInfo b;
            String str;
            CalendarShareViewModel b2 = this.f76288a.mo109987b();
            if (b2 == null || (calendarTenantInfo = b2.getCalendarTenantInfo()) == null || (b = calendarTenantInfo.mo5927b()) == null || (str = b.tenant_id) == null) {
                return "";
            }
            return str;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30487d(CalendarMemberFragment eVar) {
            this.f76288a = eVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$initMemberRv$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/adapter/CalendarShareMemberAdapter$MemberListener;", "getCalendarOwnerId", "", "onMemberContainerClicked", "", "calendarMember", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$f */
    public static final class C30489f implements CalendarShareMemberAdapter.MemberListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f76290a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter.MemberListener
        /* renamed from: a */
        public String mo109903a() {
            Calendar calendar;
            CalendarShareViewModel b = this.f76290a.mo109987b();
            if (b == null || (calendar = b.getCalendar()) == null) {
                return null;
            }
            return calendar.calendar_owner_id;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30489f(CalendarMemberFragment eVar) {
            this.f76290a = eVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.adapter.CalendarShareMemberAdapter.MemberListener
        /* renamed from: a */
        public void mo109904a(CalendarMember calendarMember) {
            String str;
            Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
            this.f76290a.mo109986a(calendarMember);
            CalendarShareViewModel b = this.f76290a.mo109987b();
            if (b != null) {
                str = b.getCalendarId();
            } else {
                str = null;
            }
            C32502i.m124374a(str, "individual");
        }
    }

    /* renamed from: h */
    private final void m113278h() {
        C1177w<List<CalendarMember>> calendarMemberLiveData;
        CalendarShareViewModel b = mo109987b();
        if (b != null && (calendarMemberLiveData = b.getCalendarMemberLiveData()) != null) {
            calendarMemberLiveData.mo5923a(getViewLifecycleOwner(), new C30488e(this));
        }
    }

    /* renamed from: c */
    public final void mo109989c() {
        List<CalendarMember> selectMemberList;
        CalendarShareViewModel b = mo109987b();
        if (b != null && (selectMemberList = b.getSelectMemberList()) != null) {
            CalendarShareMemberAdapter bVar = this.f76281a;
            if (bVar != null) {
                bVar.mo109902a(selectMemberList, false);
            }
            CalendarShareMemberAdapter bVar2 = this.f76281a;
            if (bVar2 != null) {
                bVar2.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: e */
    private final void m113275e() {
        View a = mo109250a(R.id.titlePaddingView);
        Intrinsics.checkExpressionValueIsNotNull(a, "titlePaddingView");
        a.setVisibility(0);
        View a2 = mo109250a(R.id.titlePaddingView);
        Intrinsics.checkExpressionValueIsNotNull(a2, "titlePaddingView");
        ViewGroup.LayoutParams layoutParams = a2.getLayoutParams();
        View a3 = mo109250a(R.id.titlePaddingView);
        Intrinsics.checkExpressionValueIsNotNull(a3, "titlePaddingView");
        layoutParams.height = StatusBarUtil.getStatusBarHeight(a3.getContext());
        m113276f();
        m113277g();
    }

    /* renamed from: f */
    private final void m113276f() {
        CalendarShareMemberAdapter bVar = new CalendarShareMemberAdapter();
        this.f76281a = bVar;
        if (bVar != null) {
            bVar.mo109901a(new C30489f(this));
        }
        RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.sharedMemberRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "sharedMemberRv");
        recyclerView.setAdapter(this.f76281a);
        RecyclerView recyclerView2 = (RecyclerView) mo109250a(R.id.sharedMemberRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "sharedMemberRv");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    /* renamed from: g */
    private final void m113277g() {
        Context context = this.mContext;
        Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
        Drawable iconDrawable = UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_member_add_outlined, UIUtils.getColor(this.mContext, R.color.icon_n1));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).addAction(new C30490g(this, iconDrawable, iconDrawable));
        ((CommonTitleBar) mo109250a(R.id.titleBar)).setLeftClickListener(new View$OnClickListenerC30491h(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$h */
    public static final class View$OnClickListenerC30491h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f76293a;

        View$OnClickListenerC30491h(CalendarMemberFragment eVar) {
            this.f76293a = eVar;
        }

        public final void onClick(View view) {
            MemberDelegate bVar = this.f76293a.f76282b;
            if (bVar != null) {
                bVar.mo109891a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$e */
    public static final class C30488e<T> implements AbstractC1178x<List<CalendarMember>> {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f76289a;

        C30488e(CalendarMemberFragment eVar) {
            this.f76289a = eVar;
        }

        /* renamed from: a */
        public final void onChanged(List<CalendarMember> list) {
            CalendarShareMemberAdapter bVar = this.f76289a.f76281a;
            if (bVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(list, "it");
                bVar.mo109902a(list, false);
            }
            CalendarShareMemberAdapter bVar2 = this.f76289a.f76281a;
            if (bVar2 != null) {
                bVar2.notifyDataSetChanged();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$initTitleBar$1", "Lcom/ss/android/lark/ui/IActionTitlebar$ImageAction;", "performAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b.e$g */
    public static final class C30490g extends IActionTitlebar.C57573a {

        /* renamed from: a */
        final /* synthetic */ CalendarMemberFragment f76291a;

        /* renamed from: b */
        final /* synthetic */ Drawable f76292b;

        @Override // com.ss.android.lark.ui.IActionTitlebar.Action, com.ss.android.lark.ui.IActionTitlebar.BaseAction
        public void performAction(View view) {
            String str;
            MemberDelegate bVar = this.f76291a.f76282b;
            if (bVar != null) {
                bVar.mo109892b();
            }
            CalendarShareViewModel b = this.f76291a.mo109987b();
            if (b != null) {
                str = b.getCalendarId();
            } else {
                str = null;
            }
            C32502i.m124374a(str, "add");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30490g(CalendarMemberFragment eVar, Drawable drawable, Drawable drawable2) {
            super(drawable2);
            this.f76291a = eVar;
            this.f76292b = drawable;
        }
    }

    /* renamed from: b */
    public final void mo109988b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: c */
    public final void mo109990c(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo109985a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(R.id.childFragmentContainer, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo109986a(CalendarMember calendarMember) {
        CalendarEditShareMemberFragment aVar = this.f76283d;
        if (aVar != null) {
            aVar.mo109937a(calendarMember);
            mo109988b(aVar);
        } else {
            CalendarEditShareMemberFragment.Companion aVar2 = CalendarEditShareMemberFragment.f76231f;
            CalendarMember.C15546a newBuilder = calendarMember.newBuilder();
            Intrinsics.checkExpressionValueIsNotNull(newBuilder, "calendarMember.newBuilder()");
            CalendarEditShareMemberFragment a = aVar2.mo109948a(newBuilder, m113279i(), this.f76285f);
            this.f76283d = a;
            mo109985a(a);
        }
        this.f76284e = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (this.f76282b != null) {
            m113275e();
            m113278h();
            mo109989c();
            CalendarShareViewModel b = mo109987b();
            if (b != null) {
                str = b.getCalendarId();
            } else {
                str = null;
            }
            C32502i.m124379b(str);
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_shared_member_layout, (ViewGroup) null);
    }
}
