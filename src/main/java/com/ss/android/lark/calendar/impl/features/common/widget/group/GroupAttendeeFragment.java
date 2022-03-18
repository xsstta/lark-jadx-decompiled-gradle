package com.ss.android.lark.calendar.impl.features.common.widget.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeAdapter;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberPageData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberUIData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.LoadState;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventGroupAttendeeMembersResponse;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.widget.ChatWindowPtrLoadingHeader;
import com.ss.android.lark.widget.ptr.LKUIPtrClassicFrameLayout;
import com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2;
import com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout;
import com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 @2\u00020\u0001:\u0002@AB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J$\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0015H\u0002J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0002J\b\u0010\u001d\u001a\u00020\u0017H\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0015H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\b\u0010\"\u001a\u00020\u0017H\u0002J\b\u0010#\u001a\u00020\u0017H\u0002J\b\u0010$\u001a\u00020\u0017H\u0002J8\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020*2\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,H\u0002J\b\u0010.\u001a\u00020\u0017H\u0002J\u0006\u0010/\u001a\u00020*J\b\u00100\u001a\u00020\u0017H\u0002J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u000e\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020\u0003J\u0014\u0010=\u001a\u00020\u00172\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015J\b\u0010?\u001a\u00020\u0017H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015X\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "groupFragmentData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupAttendeeFragmentData;", "mGroupAttendeeFragmentAction", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$GroupAttendeeFragmentAction;", "(Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupAttendeeFragmentData;Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$GroupAttendeeFragmentAction;)V", "cursor", "", "hasMore", "", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter;", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "mCurrentLoadState", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/LoadState;", "mGroupAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "mMemberData", "", "checkAddHideTip", "", "currentMembers", "uiData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberUIData;", "checkCanDoLoadMore", "checkScrollToTop", "endMemberLoaderMore", "getGroupMemberUIData", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "initMemberLoadPtrView", "initMemberRecycleView", "initView", "loadFirstScreen", "loadGroupMemberData", "groupId", "pullAllAttendee", "pageOffset", "pageCount", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "loadGroupMembers", "loadMoreThreshold", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshData", "fragmentData", "setMemberPage", "members", "updateGroupName", "Companion", "GroupAttendeeFragmentAction", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b */
public final class GroupAttendeeFragment extends CalendarBaseFragment {

    /* renamed from: e */
    public static final Companion f78889e = new Companion(null);

    /* renamed from: a */
    public String f78890a = "0";

    /* renamed from: b */
    public boolean f78891b = true;

    /* renamed from: c */
    public LoadState f78892c = LoadState.LOADED;

    /* renamed from: d */
    public final GroupAttendeeFragmentAction f78893d;

    /* renamed from: f */
    private final C32533b f78894f = C32533b.m124620a();

    /* renamed from: g */
    private GroupAttendeeAdapter f78895g;

    /* renamed from: h */
    private List<CalendarEventAttendee> f78896h = new ArrayList();

    /* renamed from: i */
    private CalendarEventAttendee f78897i = this.f78898j.mo113175d();

    /* renamed from: j */
    private GroupAttendeeFragmentData f78898j;

    /* renamed from: k */
    private HashMap f78899k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H&J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$GroupAttendeeFragmentAction;", "", "getAttendeeData", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "attendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "isShowTopMargin", "", "onFragmentBackPressed", "", "onOpenProfilePageClicked", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$b */
    public interface GroupAttendeeFragmentAction {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$b$a */
        public static final class C31205a {
            /* renamed from: a */
            public static boolean m116599a(GroupAttendeeFragmentAction bVar) {
                return false;
            }
        }

        /* renamed from: a */
        List<IAttendeeMemberData> mo113156a(List<CalendarEventAttendee> list);

        /* renamed from: a */
        void mo113157a();

        /* renamed from: a */
        void mo113158a(String str);

        /* renamed from: b */
        boolean mo113159b();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f78899k == null) {
            this.f78899k = new HashMap();
        }
        View view = (View) this.f78899k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f78899k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f78899k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$Companion;", "", "()V", "ATTENDEE_LOAD_PAGE_COUNT", "", "AUTO_LOAD_MESSAGE_THRESHOLD", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo113151b() {
        this.f78893d.mo113157a();
    }

    /* renamed from: c */
    public final int mo113152c() {
        GroupAttendeeAdapter aVar = this.f78895g;
        if (aVar != null) {
            return aVar.getItemCount() - 5;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: e */
    public final void mo113154e() {
        ((LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout)).refreshComplete();
    }

    /* renamed from: g */
    private final void m116580g() {
        int i;
        m116583j();
        m116584k();
        View a = mo109250a(R.id.virtualStatusBar);
        Intrinsics.checkExpressionValueIsNotNull(a, "virtualStatusBar");
        if (this.f78893d.mo113159b()) {
            i = 0;
        } else {
            i = 8;
        }
        a.setVisibility(i);
        m116581h();
        m116585l();
    }

    /* renamed from: i */
    private final void m116582i() {
        boolean z;
        List<CalendarEventAttendee> list = this.f78896h;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.group_rv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "group_rv");
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.scrollToPosition(0);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo113153d() {
        boolean z;
        if (!this.f78897i.getOpenSecurity() || this.f78896h.size() < this.f78897i.getShowMemberLimit()) {
            z = false;
        } else {
            z = true;
        }
        if (!this.f78891b || z) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo113155f() {
        boolean z;
        String groupId = this.f78897i.getGroupId();
        String str = groupId;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.f78890a.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                m116577a(groupId, false, this.f78890a, 100, new C31210g(this));
                return;
            }
        }
        mo113154e();
    }

    /* renamed from: h */
    private final void m116581h() {
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.common_title_bar);
        StringBuilder sb = new StringBuilder();
        String localizedDisplayName = this.f78897i.getLocalizedDisplayName();
        if (localizedDisplayName == null) {
            localizedDisplayName = "";
        }
        sb.append(localizedDisplayName);
        sb.append('(');
        sb.append(this.f78897i.getValidMemberCount());
        sb.append(')');
        commonTitleBar.setTitle(sb.toString());
        ((CommonTitleBar) mo109250a(R.id.common_title_bar)).setLeftVisible(true);
        ((CommonTitleBar) mo109250a(R.id.common_title_bar)).setLeftClickListener(new View$OnClickListenerC31211h(this));
    }

    /* renamed from: j */
    private final void m116583j() {
        this.f78895g = new GroupAttendeeAdapter(new C31208e(this));
        RecyclerView recyclerView = (RecyclerView) mo109250a(R.id.group_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "group_rv");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView2 = (RecyclerView) mo109250a(R.id.group_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "group_rv");
        recyclerView2.setAdapter(this.f78895g);
        RecyclerView recyclerView3 = (RecyclerView) mo109250a(R.id.group_rv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "group_rv");
        recyclerView3.setFocusableInTouchMode(false);
    }

    /* renamed from: k */
    private final void m116584k() {
        ChatWindowPtrLoadingHeader chatWindowPtrLoadingHeader = new ChatWindowPtrLoadingHeader(this.mContext);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout = (LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout, "attendee_ptr_layout");
        lKUIPtrClassicFrameLayout.setKeepHeaderWhenRefresh(true);
        ((LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout)).setFooterView(chatWindowPtrLoadingHeader);
        ((LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout)).addPtrUIHandler(chatWindowPtrLoadingHeader);
        LKUIPtrClassicFrameLayout lKUIPtrClassicFrameLayout2 = (LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout);
        Intrinsics.checkExpressionValueIsNotNull(lKUIPtrClassicFrameLayout2, "attendee_ptr_layout");
        lKUIPtrClassicFrameLayout2.setForceBackWhenComplete(true);
        ((LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout)).disableWhenHorizontalMove(true);
        ((LKUIPtrClassicFrameLayout) mo109250a(R.id.attendee_ptr_layout)).setPtrHandler(new C31206c(this));
        ((RecyclerView) mo109250a(R.id.group_rv)).addOnScrollListener(new C31207d(this));
    }

    /* renamed from: l */
    private final void m116585l() {
        boolean z;
        GroupMemberPageData e = this.f78898j.mo113176e();
        if (e != null) {
            this.f78896h = new ArrayList();
            this.f78890a = e.mo113181b();
            this.f78891b = e.mo113180a();
            mo113150a(e.mo113182c());
            m116582i();
            return;
        }
        String groupId = this.f78897i.getGroupId();
        String str = groupId;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m116577a(groupId, false, "0", 100, new C31209f(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$initMemberLoadPtrView$1", "Lcom/ss/android/lark/widget/ptr/LKUIPtrDefaultHandler2;", "checkCanDoLoadMore", "", "frame", "Lcom/ss/android/lark/widget/ptr/LKUIPtrFrameLayout;", "content", "Landroid/view/View;", "footer", "checkCanDoRefresh", "header", "onLoadMoreBegin", "", "onRefreshBegin", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$c */
    public static final class C31206c extends LKUIPtrDefaultHandler2 {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeFragment f78900a;

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler, com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler
        public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "header");
            return false;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
        public void onRefreshBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31206c(GroupAttendeeFragment bVar) {
            this.f78900a = bVar;
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public void onLoadMoreBegin(LKUIPtrFrameLayout lKUIPtrFrameLayout) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            this.f78900a.mo113155f();
        }

        @Override // com.ss.android.lark.widget.ptr.LKUIPtrDefaultHandler2, com.ss.android.lark.widget.ptr.LKUIPtrHandler2
        public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
            Intrinsics.checkParameterIsNotNull(lKUIPtrFrameLayout, "frame");
            Intrinsics.checkParameterIsNotNull(view, "content");
            Intrinsics.checkParameterIsNotNull(view2, "footer");
            if (!super.checkCanDoLoadMore(lKUIPtrFrameLayout, view, view2) || !this.f78900a.mo113153d()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$initMemberLoadPtrView$2", "Lcom/ss/android/lark/widget/recyclerview/RecyclerViewScrollDetector;", "onScrollPassed", "", "scrolledStartIndex", "", "scrolledEndIndex", "onScrollStop", "startIndex", "endIndex", "onScrollToBottom", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$d */
    public static final class C31207d extends RecyclerViewScrollDetector {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeFragment f78901a;

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollStop(int i, int i2) {
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollToBottom() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31207d(GroupAttendeeFragment bVar) {
            this.f78901a = bVar;
        }

        @Override // com.ss.android.lark.widget.recyclerview.RecyclerViewScrollDetector
        public void onScrollPassed(int i, int i2) {
            if (i2 >= this.f78901a.mo113152c() && this.f78901a.mo113153d()) {
                this.f78901a.mo113155f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$initMemberRecycleView$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeAdapter$GroupMemberDependency;", "onOpenProfilePageClicked", "", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$e */
    public static final class C31208e implements GroupAttendeeAdapter.GroupMemberDependency {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeFragment f78902a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31208e(GroupAttendeeFragment bVar) {
            this.f78902a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeAdapter.GroupMemberDependency
        /* renamed from: a */
        public void mo113140a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
            this.f78902a.f78893d.mo113158a(str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$loadFirstScreen$dummyCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$f */
    public static final class C31209f implements IGetDataCallback<PullEventGroupAttendeeMembersResponse> {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeFragment f78903a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31209f(GroupAttendeeFragment bVar) {
            this.f78903a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f78903a.f78892c = LoadState.LOADED;
        }

        /* renamed from: a */
        public void onSuccess(PullEventGroupAttendeeMembersResponse vVar) {
            if (vVar == null) {
                onError(new ErrorResult("data is empty"));
                return;
            }
            this.f78903a.f78890a = vVar.mo120233b();
            this.f78903a.f78891b = vVar.mo120232a();
            this.f78903a.mo113150a(vVar.mo120234c());
            this.f78903a.f78892c = LoadState.LOADED;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$loadGroupMembers$dummyCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$g */
    public static final class C31210g implements IGetDataCallback<PullEventGroupAttendeeMembersResponse> {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeFragment f78904a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31210g(GroupAttendeeFragment bVar) {
            this.f78904a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f78904a.mo113154e();
            this.f78904a.f78892c = LoadState.LOADED;
        }

        /* renamed from: a */
        public void onSuccess(PullEventGroupAttendeeMembersResponse vVar) {
            if (vVar == null) {
                onError(new ErrorResult("data is empty"));
                return;
            }
            this.f78904a.f78890a = vVar.mo120233b();
            this.f78904a.f78891b = vVar.mo120232a();
            this.f78904a.mo113150a(vVar.mo120234c());
            this.f78904a.mo113154e();
            this.f78904a.f78892c = LoadState.LOADED;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.common.widget.group.b$h */
    public static final class View$OnClickListenerC31211h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupAttendeeFragment f78905a;

        View$OnClickListenerC31211h(GroupAttendeeFragment bVar) {
            this.f78905a = bVar;
        }

        public final void onClick(View view) {
            this.f78905a.mo113151b();
        }
    }

    /* renamed from: b */
    private final List<GroupMemberUIData> m116579b(List<IAttendeeMemberData> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new GroupMemberUIData(GroupMemberUIData.GroupDataType.ATTENDEE, it.next()));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo113149a(GroupAttendeeFragmentData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "fragmentData");
        this.f78898j = aVar;
        this.f78897i = aVar.mo113175d();
        m116581h();
        if (this.f78898j.mo113176e() == null) {
            this.f78890a = "0";
            this.f78891b = true;
            this.f78896h = new ArrayList();
            GroupAttendeeAdapter aVar2 = this.f78895g;
            if (aVar2 != null) {
                aVar2.mo113137a(new ArrayList());
            }
        }
        m116585l();
    }

    /* renamed from: a */
    public final void mo113150a(List<CalendarEventAttendee> list) {
        Intrinsics.checkParameterIsNotNull(list, "members");
        boolean openSecurity = this.f78897i.getOpenSecurity();
        int showMemberLimit = this.f78897i.getShowMemberLimit();
        for (T t : list) {
            if ((!openSecurity || this.f78896h.size() < showMemberLimit) && !this.f78896h.contains(t)) {
                this.f78896h.add(t);
            }
        }
        ArrayList arrayList = new ArrayList(this.f78896h);
        this.f78896h = arrayList;
        List<GroupMemberUIData> b = m116579b(this.f78893d.mo113156a(arrayList));
        m116578a(arrayList, b);
        GroupAttendeeAdapter aVar = this.f78895g;
        if (aVar != null) {
            aVar.mo113137a(b);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m116580g();
    }

    public GroupAttendeeFragment(GroupAttendeeFragmentData aVar, GroupAttendeeFragmentAction bVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "groupFragmentData");
        Intrinsics.checkParameterIsNotNull(bVar, "mGroupAttendeeFragmentAction");
        this.f78898j = aVar;
        this.f78893d = bVar;
    }

    /* renamed from: a */
    private final void m116578a(List<CalendarEventAttendee> list, List<GroupMemberUIData> list2) {
        if (!list2.isEmpty() && this.f78897i.getOpenSecurity() && this.f78897i.getValidMemberCount() > this.f78897i.getShowMemberLimit() && list.size() == this.f78897i.getShowMemberLimit()) {
            list2.add(new GroupMemberUIData(GroupMemberUIData.GroupDataType.HIDE_TIP, null, 2, null));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.calendar_fragment_group_member, viewGroup, false);
    }

    /* renamed from: a */
    private final void m116577a(String str, boolean z, String str2, int i, IGetDataCallback<PullEventGroupAttendeeMembersResponse> iGetDataCallback) {
        if (this.f78892c != LoadState.LOADING) {
            this.f78892c = LoadState.LOADING;
            this.f78894f.mo118869a(this.f78898j.mo113172a(), this.f78898j.mo113173b(), this.f78898j.mo113174c(), str, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), str2, i);
        }
    }
}
