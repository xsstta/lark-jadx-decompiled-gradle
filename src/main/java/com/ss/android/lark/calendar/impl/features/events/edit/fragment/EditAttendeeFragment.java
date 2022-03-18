package com.ss.android.lark.calendar.impl.features.events.edit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.common.helper.AttendeeHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberPageData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.IAttendeeMemberData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.helper.GroupFragmentHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b;
import com.ss.android.lark.calendar.impl.features.events.edit.data.AttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EditAttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.AttendeeAdapter;
import com.ss.android.lark.calendar.impl.features.events.edit.helper.EditAttendeeHelper;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarEventHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventUniqueField;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventGroupAttendeeMembersResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32662o;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e;
import com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Å\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\r*\u0005\r\u001f%>B\u0018\u00002\u00020\u0001:\u0002lmB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0017\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,J \u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020,H\u0002J&\u00102\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u000205042\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020,H\u0002J\b\u00106\u001a\u00020,H\u0002J\u001e\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020/2\u0006\u00101\u001a\u00020,J \u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020/2\u0006\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020,H\u0002J\u0018\u0010;\u001a\u00020(2\u0006\u0010<\u001a\u00020\t2\u0006\u0010.\u001a\u00020/H\u0002J\r\u0010=\u001a\u00020>H\u0002¢\u0006\u0002\u0010?J\u0018\u0010@\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\u0006\u0010:\u001a\u00020/H\u0002J\r\u0010A\u001a\u00020BH\u0002¢\u0006\u0002\u0010CJ\u0010\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u000205H\u0002J\u0010\u0010G\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\b\u0010H\u001a\u00020(H\u0002J\b\u0010I\u001a\u00020(H\u0002J\b\u0010J\u001a\u00020(H\u0002J\b\u0010K\u001a\u00020(H\u0002J(\u0010L\u001a\u00020(2\u0006\u00100\u001a\u00020\u00132\u0006\u0010M\u001a\u00020\t2\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010P0OH\u0002J\b\u0010Q\u001a\u00020\tH\u0016J&\u0010R\u001a\u0004\u0018\u00010S2\u0006\u0010T\u001a\u00020U2\b\u0010V\u001a\u0004\u0018\u00010W2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\u001a\u0010Z\u001a\u00020(2\u0006\u0010[\u001a\u00020S2\b\u0010X\u001a\u0004\u0018\u00010YH\u0016J\b\u0010\\\u001a\u00020(H\u0002J\u000e\u0010]\u001a\u00020(2\u0006\u0010^\u001a\u00020\u0006J*\u0010_\u001a\b\u0012\u0004\u0012\u00020/042\f\u0010`\u001a\b\u0012\u0004\u0012\u0002050a2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020504H\u0002J\b\u0010c\u001a\u00020(H\u0002J\u0016\u0010d\u001a\u00020(2\f\u00103\u001a\b\u0012\u0004\u0012\u00020/04H\u0002J\u0010\u0010e\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*J\u0010\u0010f\u001a\u00020(2\u0006\u0010g\u001a\u000205H\u0002J\u0018\u0010h\u001a\u00020(2\u0006\u00100\u001a\u00020\u00132\u0006\u0010i\u001a\u00020\tH\u0002J\u0010\u0010j\u001a\u00020(2\u0006\u0010k\u001a\u00020\tH\u0002R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00160\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020%X\u0004¢\u0006\u0004\n\u0002\u0010&¨\u0006n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/CalendarBaseEventFragment;", "()V", "action", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$AttendeeFragmentAction;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/AttendeeFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$AttendeeFragmentAction;Lcom/ss/android/lark/calendar/impl/features/events/edit/data/AttendeeFragmentData;)V", "isGroupFragmentShow", "", "mAdapter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter;", "mAdapterChangedListener", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mAdapterChangedListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mAdapterChangedListener$1;", "mAttendeeFragmentAction", "mAttendeeFragmentData", "mBreakingGroups", "", "", "mCacheAttendeeMemberMap", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "getMCacheAttendeeMemberMap", "()Ljava/util/Map;", "setMCacheAttendeeMemberMap", "(Ljava/util/Map;)V", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "mFinishBtnAction", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mFinishBtnAction$1;", "mGroupFragment", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment;", "mIsFromLocalRecover", "mUsableFinishBtnAction", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mUsableFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mUsableFinishBtnAction$1;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "breakLoadGroupMember", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EditAttendeeViewData;", "groupId", "position", "breakUpActurally", "groupMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calculateAttendeeIfNeed", "changeGroupMemberVisibility", "adapter", "checkActionBreakUp", "groupAttendeeData", "checkLoadGroupMember", "showGroupMember", "getAttendeeAdapterDependency", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$getAttendeeAdapterDependency$1", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$getAttendeeAdapterDependency$1;", "getBreakUpGroupAttendeeMember", "getGroupAttendeeFragmentAction", "com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$getGroupAttendeeFragmentAction$1", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$getGroupAttendeeFragmentAction$1;", "getGroupFragmentData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupAttendeeFragmentData;", "attendee", "hideFragment", "hideGroupAttendeeFragment", "initAttendeeAdapter", "initPartDeleteText", "initTitleBar", "loadGroupMember", "pullAllAttendee", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "onBackPressed", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "refreshAttendeeCountText", "refreshViewData", "attendeeFragmentData", "removeRepetitionInGroup", "attendees", "", "groupAttendeeMembers", "setAdapterListener", "setGroupMemberEditable", "showFragment", "showGroupFragment", "groupAttendee", "updateFinishBtnActionData", "needAdd", "updateFinishBtnUsable", "usable", "AttendeeFragmentAction", "OnAdapterChangedListener", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h */
public final class EditAttendeeFragment extends View$OnClickListenerC31538b {

    /* renamed from: a */
    public AttendeeFragmentAction f80614a;

    /* renamed from: b */
    public AttendeeFragmentData f80615b;

    /* renamed from: e */
    public AttendeeAdapter f80616e;

    /* renamed from: f */
    private boolean f80617f;

    /* renamed from: g */
    private final C32533b f80618g;

    /* renamed from: h */
    private GroupAttendeeFragment f80619h;

    /* renamed from: i */
    private boolean f80620i;

    /* renamed from: j */
    private Map<String, GroupMemberPageData> f80621j;

    /* renamed from: k */
    private final Set<String> f80622k;

    /* renamed from: l */
    private final C31724i f80623l;

    /* renamed from: m */
    private final C31725j f80624m;

    /* renamed from: n */
    private final C31726k f80625n;

    /* renamed from: o */
    private HashMap f80626o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003H&J\b\u0010\u0007\u001a\u00020\bH&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$AttendeeFragmentAction;", "", "getEventSimpleMap", "", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/SimpleMember;", "onBackPressed", "", "onSavePressed", "displayAttendees", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$a */
    public interface AttendeeFragmentAction {
        /* renamed from: a */
        void mo114375a();

        /* renamed from: a */
        void mo114376a(ArrayList<CalendarEventAttendee> arrayList);

        /* renamed from: b */
        Map<String, List<SimpleMember>> mo114377b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$OnAdapterChangedListener;", "", "onAdapterItemRemoved", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$b */
    public interface OnAdapterChangedListener {
        /* renamed from: a */
        void mo115540a();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f80626o == null) {
            this.f80626o = new HashMap();
        }
        View view = (View) this.f80626o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f80626o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f80626o;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    /* renamed from: b */
    public final Map<String, GroupMemberPageData> mo115535b() {
        return this.f80621j;
    }

    /* renamed from: a */
    public final void mo115531a(AttendeeAdapter aVar, EditAttendeeViewData cVar, int i) {
        Context context;
        Intrinsics.checkParameterIsNotNull(aVar, "adapter");
        Intrinsics.checkParameterIsNotNull(cVar, "attendeeData");
        CalendarEventAttendee a = cVar.mo115078a();
        if (C32662o.m125351b(a) && a.isSelfInGroup()) {
            aVar.mo115165a()[i] = !aVar.mo115165a()[i];
            m120046a(aVar.mo115165a()[i], cVar);
            aVar.notifyDataSetChanged();
        } else if (C32662o.m125351b(a) && !a.isSelfInGroup() && (context = getContext()) != null) {
            AttendeeHelper aVar2 = AttendeeHelper.f78609a;
            Intrinsics.checkExpressionValueIsNotNull(context, "it");
            aVar2.mo112726a(context);
        }
    }

    /* renamed from: a */
    public final void mo115530a(EditAttendeeViewData cVar, String str, int i) {
        m120043a(str, true, (IGetDataCallback<PullEventGroupAttendeeMembersResponse>) new C31718c(this, cVar, str, i));
    }

    /* renamed from: a */
    public final void mo115533a(String str, boolean z) {
        if (z) {
            this.f80622k.add(str);
        } else {
            this.f80622k.remove(str);
        }
        Set<String> set = this.f80622k;
        m120045a(set == null || set.isEmpty());
    }

    /* renamed from: a */
    public final void mo115529a(AttendeeFragmentData attendeeFragmentData) {
        Intrinsics.checkParameterIsNotNull(attendeeFragmentData, "attendeeFragmentData");
        this.f80615b = attendeeFragmentData;
        m120050g();
        m120051h();
    }

    /* renamed from: a */
    public final void mo115528a(Fragment fragment, int i) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(i, fragment, (String) null).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: a */
    public final void mo115532a(CalendarEventAttendee calendarEventAttendee) {
        if (this.f80619h == null) {
            GroupAttendeeFragmentData b = m120047b(calendarEventAttendee);
            if (b != null) {
                GroupAttendeeFragment bVar = new GroupAttendeeFragment(b, m120055l());
                this.f80619h = bVar;
                mo115528a(bVar, R.id.groupMemberFrameLayout);
                this.f80620i = true;
                return;
            }
            return;
        }
        GroupAttendeeFragmentData b2 = m120047b(calendarEventAttendee);
        if (b2 != null) {
            GroupAttendeeFragment bVar2 = this.f80619h;
            if (bVar2 != null) {
                bVar2.mo113149a(b2);
            }
            mo115527a(this.f80619h);
            this.f80620i = true;
        }
    }

    /* renamed from: a */
    public final void mo115534a(List<CalendarEventAttendee> list, String str, int i) {
        AttendeeAdapter aVar = this.f80616e;
        if (aVar != null) {
            ArrayList<EditAttendeeViewData> b = aVar.mo115166b();
            if (b.isEmpty() || i >= b.size() || (!Intrinsics.areEqual(str, b.get(i).mo115078a().getGroupId()))) {
                aVar.notifyDataSetChanged();
                return;
            }
            List<EditAttendeeViewData> a = m120042a(aVar.mo115168c(), list);
            m120044a(a);
            b.remove(i);
            b.addAll(i, a);
            aVar.mo115164a(new boolean[b.size()]);
            aVar.clear();
            aVar.addAll(b);
            GeneralHitPoint.m124271s();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$getGroupAttendeeFragmentAction$1", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/GroupAttendeeFragment$GroupAttendeeFragmentAction;", "getAttendeeData", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/IAttendeeMemberData;", "attendees", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onFragmentBackPressed", "", "onOpenProfilePageClicked", "attendeeCalendarId", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$f */
    public static final class C31721f implements GroupAttendeeFragment.GroupAttendeeFragmentAction {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80635a;

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: a */
        public void mo113158a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "attendeeCalendarId");
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: a */
        public void mo113157a() {
            this.f80635a.mo115539d();
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: b */
        public boolean mo113159b() {
            return GroupAttendeeFragment.GroupAttendeeFragmentAction.C31205a.m116599a(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31721f(EditAttendeeFragment hVar) {
            this.f80635a = hVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.common.widget.group.GroupAttendeeFragment.GroupAttendeeFragmentAction
        /* renamed from: a */
        public List<IAttendeeMemberData> mo113156a(List<CalendarEventAttendee> list) {
            Intrinsics.checkParameterIsNotNull(list, "attendees");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(GroupFragmentHelper.f78884a.mo113142a(EditAttendeeFragment.m120040a(this.f80635a).isGoogleEvent(), EditAttendeeFragment.m120040a(this.f80635a).isExchangeEvent(), it.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mAdapterChangedListener$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$OnAdapterChangedListener;", "onAdapterItemRemoved", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$i */
    public static final class C31724i implements OnAdapterChangedListener {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80638a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment.OnAdapterChangedListener
        /* renamed from: a */
        public void mo115540a() {
            this.f80638a.mo115538c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31724i(EditAttendeeFragment hVar) {
            this.f80638a = hVar;
        }
    }

    /* renamed from: i */
    private final C31720e m120052i() {
        return new C31720e(this);
    }

    /* renamed from: l */
    private final C31721f m120055l() {
        return new C31721f(this);
    }

    /* renamed from: j */
    private final void m120053j() {
        AttendeeAdapter aVar = this.f80616e;
        if (aVar != null) {
            aVar.mo115163a(this.f80623l);
        }
    }

    /* renamed from: d */
    public final void mo115539d() {
        mo115536b(this.f80619h);
        this.f80620i = false;
    }

    /* renamed from: c */
    public final void mo115538c() {
        TextView textView = (TextView) mo109250a(R.id.text_attendee_numbers);
        Intrinsics.checkExpressionValueIsNotNull(textView, "text_attendee_numbers");
        textView.setText(C32634ae.m125180a(R.plurals.Calendar_Plural_AttendeeNumAfter, m120054k()));
    }

    /* renamed from: f */
    private final void m120049f() {
        ((CommonTitleBar) mo109250a(R.id.edit_attendee_title_bar)).setLeftImageResource(R.drawable.ud_icon_left_outlined);
        ((CommonTitleBar) mo109250a(R.id.edit_attendee_title_bar)).setDividerVisible(false);
        ((CommonTitleBar) mo109250a(R.id.edit_attendee_title_bar)).addAction(this.f80624m);
        ((CommonTitleBar) mo109250a(R.id.edit_attendee_title_bar)).setLeftClickListener(new C31723h(this));
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b
    /* renamed from: e */
    public boolean mo113714e() {
        FrameLayout frameLayout = (FrameLayout) mo109250a(R.id.groupMemberFrameLayout);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "groupMemberFrameLayout");
        if (frameLayout.getVisibility() != 0 || !this.f80620i) {
            AttendeeFragmentAction aVar = this.f80614a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentAction");
            }
            aVar.mo114375a();
            return true;
        }
        mo115539d();
        return false;
    }

    public EditAttendeeFragment() {
        this.f80618g = C32533b.m124620a();
        this.f80621j = new HashMap();
        this.f80622k = new LinkedHashSet();
        this.f80623l = new C31724i(this);
        this.f80624m = new C31725j(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500);
        this.f80625n = new C31726k(C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.text_placeholder);
        this.f80617f = true;
    }

    /* renamed from: g */
    private final void m120050g() {
        AttendeeFragmentData attendeeFragmentData = this.f80615b;
        if (attendeeFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        if (attendeeFragmentData.isPartDelete()) {
            TextView textView = (TextView) mo109250a(R.id.text_delete_part_attendee);
            Intrinsics.checkExpressionValueIsNotNull(textView, "text_delete_part_attendee");
            textView.setVisibility(0);
            int dp2px = UIUtils.dp2px(this.mContext, 15.0f);
            ((LinearLayout) mo109250a(R.id.text_container)).setPadding(dp2px, dp2px, dp2px, UIUtils.dp2px(this.mContext, 12.0f));
            return;
        }
        TextView textView2 = (TextView) mo109250a(R.id.text_delete_part_attendee);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "text_delete_part_attendee");
        textView2.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
        if (r5.isExchangeEvent() != false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x003e  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m120054k() {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.events.edit.fragment.EditAttendeeFragment.m120054k():int");
    }

    /* renamed from: h */
    private final void m120051h() {
        AttendeeAdapter aVar = this.f80616e;
        if (aVar == null) {
            Context context = this.mContext;
            Intrinsics.checkExpressionValueIsNotNull(context, "mContext");
            EditAttendeeHelper cVar = EditAttendeeHelper.f79930a;
            AttendeeFragmentData attendeeFragmentData = this.f80615b;
            if (attendeeFragmentData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
            }
            AttendeeAdapter aVar2 = new AttendeeAdapter(context, R.layout.item_event_edit_attendee, cVar.mo114609a(attendeeFragmentData.getShowAttendeeList(), this.f80621j), m120052i());
            this.f80616e = aVar2;
            if (aVar2 != null) {
                AttendeeFragmentData attendeeFragmentData2 = this.f80615b;
                if (attendeeFragmentData2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
                }
                AttendeeAdapter.m119505a(aVar2, attendeeFragmentData2, null, 2, null);
            }
            m120053j();
            ListView listView = (ListView) mo109250a(R.id.lv_edit_attendee);
            Intrinsics.checkExpressionValueIsNotNull(listView, "lv_edit_attendee");
            listView.setAdapter((ListAdapter) this.f80616e);
        } else if (aVar != null) {
            AttendeeFragmentData attendeeFragmentData3 = this.f80615b;
            if (attendeeFragmentData3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
            }
            aVar.mo115167b(attendeeFragmentData3, this.f80621j);
        }
        View a = mo109250a(R.id.virtual_status_bar);
        Intrinsics.checkExpressionValueIsNotNull(a, "virtual_status_bar");
        a.setVisibility(8);
        ListView listView2 = (ListView) mo109250a(R.id.lv_edit_attendee);
        Intrinsics.checkExpressionValueIsNotNull(listView2, "lv_edit_attendee");
        listView2.setOnItemClickListener(new C31722g(this));
        mo115538c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$getAttendeeAdapterDependency$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/adapter/AttendeeAdapter$AttendeeDependency;", "onClickBreakUpButton", "", "attendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EditAttendeeViewData;", "groupId", "", "position", "", "onShowGroupMemberFragment", "attendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$e */
    public static final class C31720e implements AttendeeAdapter.AttendeeDependency {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80634a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31720e(EditAttendeeFragment hVar) {
            this.f80634a = hVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.AttendeeAdapter.AttendeeDependency
        /* renamed from: a */
        public void mo115172a(CalendarEventAttendee calendarEventAttendee) {
            Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
            FrameLayout frameLayout = (FrameLayout) this.f80634a.mo109250a(R.id.groupMemberFrameLayout);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "groupMemberFrameLayout");
            frameLayout.setVisibility(0);
            this.f80634a.mo115532a(calendarEventAttendee);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.fragment.adapter.AttendeeAdapter.AttendeeDependency
        /* renamed from: a */
        public void mo115171a(EditAttendeeViewData cVar, String str, int i) {
            Intrinsics.checkParameterIsNotNull(cVar, "attendeeData");
            Intrinsics.checkParameterIsNotNull(str, "groupId");
            CalendarEventHitPoint.f83362a.mo118752b();
            if (!this.f80634a.mo115537b(cVar, str, i)) {
                this.f80634a.mo115533a(str, true);
                cVar.mo115080a(true);
                AttendeeAdapter aVar = this.f80634a.f80616e;
                if (aVar != null) {
                    aVar.notifyDataSetChanged();
                }
                this.f80634a.mo115530a(cVar, str, i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J0\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$initAttendeeAdapter$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingOnItemClickListener;", "doOnItemClick", "", "adapterView", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "i", "", "l", "", "needDebounce", "", "parent", "position", "id", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$g */
    public static final class C31722g extends AbstractC32628d {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80636a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31722g(EditAttendeeFragment hVar) {
            this.f80636a = hVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d
        /* renamed from: a */
        public void mo115154a(AdapterView<?> adapterView, View view, int i, long j) {
            CalendarEventAttendee calendarEventAttendee;
            EditAttendeeViewData cVar;
            Intrinsics.checkParameterIsNotNull(adapterView, "adapterView");
            Intrinsics.checkParameterIsNotNull(view, "view");
            AttendeeAdapter aVar = this.f80636a.f80616e;
            if (aVar != null && i < aVar.getCount()) {
                EditAttendeeViewData cVar2 = (EditAttendeeViewData) aVar.getItem(i);
                if (cVar2 != null) {
                    calendarEventAttendee = cVar2.mo115078a();
                } else {
                    calendarEventAttendee = null;
                }
                if (C32662o.m125351b(calendarEventAttendee) && (cVar = (EditAttendeeViewData) aVar.getItem(i)) != null) {
                    EditAttendeeFragment hVar = this.f80636a;
                    Intrinsics.checkExpressionValueIsNotNull(cVar, "attendee");
                    hVar.mo115531a(aVar, cVar, i);
                }
            }
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32628d
        /* renamed from: b */
        public boolean mo115543b(AdapterView<?> adapterView, View view, int i, long j) {
            CalendarEventAttendee calendarEventAttendee;
            AttendeeAdapter aVar = this.f80636a.f80616e;
            if (aVar == null || i >= aVar.getCount()) {
                return true;
            }
            EditAttendeeViewData cVar = (EditAttendeeViewData) aVar.getItem(i);
            if (cVar != null) {
                calendarEventAttendee = cVar.mo115078a();
            } else {
                calendarEventAttendee = null;
            }
            if (C32662o.m125351b(calendarEventAttendee)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$initTitleBar$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingClickListener;", "doClick", "", "v", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$h */
    public static final class C31723h extends AbstractView$OnClickListenerC32626b {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80637a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31723h(EditAttendeeFragment hVar) {
            this.f80637a = hVar;
        }

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractView$OnClickListenerC32626b
        /* renamed from: a */
        public void mo108751a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "v");
            this.f80637a.mo113714e();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ AttendeeFragmentData m120040a(EditAttendeeFragment hVar) {
        AttendeeFragmentData attendeeFragmentData = hVar.f80615b;
        if (attendeeFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        return attendeeFragmentData;
    }

    /* renamed from: b */
    public static final /* synthetic */ AttendeeFragmentAction m120048b(EditAttendeeFragment hVar) {
        AttendeeFragmentAction aVar = hVar.f80614a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentAction");
        }
        return aVar;
    }

    /* renamed from: a */
    private final void m120044a(List<EditAttendeeViewData> list) {
        for (EditAttendeeViewData cVar : list) {
            cVar.mo115078a().setIsEditable(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$breakLoadGroupMember$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$c */
    public static final class C31718c implements IGetDataCallback<PullEventGroupAttendeeMembersResponse> {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80627a;

        /* renamed from: b */
        final /* synthetic */ EditAttendeeViewData f80628b;

        /* renamed from: c */
        final /* synthetic */ String f80629c;

        /* renamed from: d */
        final /* synthetic */ int f80630d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LKUIToast.show(this.f80627a.getContext(), (int) R.string.Calendar_Edit_LoadFailed);
            this.f80628b.mo115080a(false);
            this.f80627a.mo115533a(this.f80629c, false);
            AttendeeAdapter aVar = this.f80627a.f80616e;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void onSuccess(PullEventGroupAttendeeMembersResponse vVar) {
            if (vVar == null) {
                onError(new ErrorResult("data is empty"));
                return;
            }
            this.f80628b.mo115078a().setGroupMembers(vVar.mo120234c());
            this.f80627a.mo115535b().put(this.f80629c, new GroupMemberPageData(false, "", new ArrayList(vVar.mo120234c())));
            this.f80628b.mo115080a(false);
            this.f80627a.mo115534a(vVar.mo120234c(), this.f80629c, this.f80630d);
            this.f80627a.mo115533a(this.f80629c, false);
        }

        C31718c(EditAttendeeFragment hVar, EditAttendeeViewData cVar, String str, int i) {
            this.f80627a = hVar;
            this.f80628b = cVar;
            this.f80629c = str;
            this.f80630d = i;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$checkLoadGroupMember$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$d */
    public static final class C31719d implements IGetDataCallback<PullEventGroupAttendeeMembersResponse> {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80631a;

        /* renamed from: b */
        final /* synthetic */ String f80632b;

        /* renamed from: c */
        final /* synthetic */ EditAttendeeViewData f80633c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            LKUIToast.show(this.f80631a.getContext(), (int) R.string.Calendar_Edit_LoadFailed);
            this.f80633c.mo115080a(false);
            AttendeeAdapter aVar = this.f80631a.f80616e;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        public void onSuccess(PullEventGroupAttendeeMembersResponse vVar) {
            if (vVar == null) {
                onError(new ErrorResult("data is empty"));
                return;
            }
            this.f80631a.mo115535b().put(this.f80632b, new GroupMemberPageData(vVar.mo120232a(), vVar.mo120233b(), new ArrayList(vVar.mo120234c())));
            this.f80633c.mo115079a(vVar.mo120234c());
            this.f80633c.mo115080a(false);
            AttendeeAdapter aVar = this.f80631a.f80616e;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }

        C31719d(EditAttendeeFragment hVar, String str, EditAttendeeViewData cVar) {
            this.f80631a = hVar;
            this.f80632b = str;
            this.f80633c = cVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$j */
    public static final class C31725j extends AbstractC32629e {

        /* renamed from: a */
        final /* synthetic */ EditAttendeeFragment f80639a;

        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            ArrayList<CalendarEventAttendee> arrayList;
            Intrinsics.checkParameterIsNotNull(view, "view");
            AttendeeFragmentAction b = EditAttendeeFragment.m120048b(this.f80639a);
            AttendeeAdapter aVar = this.f80639a.f80616e;
            if (aVar == null || (arrayList = aVar.mo115168c()) == null) {
                arrayList = new ArrayList<>();
            }
            b.mo114376a(arrayList);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31725j(EditAttendeeFragment hVar, String str, int i) {
            super(str, i);
            this.f80639a = hVar;
        }
    }

    /* renamed from: a */
    private final List<CalendarEventAttendee> m120041a(EditAttendeeViewData cVar) {
        boolean z;
        List<CalendarEventAttendee> list;
        CalendarEventAttendee a = cVar.mo115078a();
        List<CalendarEventAttendee> groupMembers = a.getGroupMembers();
        if (groupMembers == null || groupMembers.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return a.getGroupMembers();
        }
        List<CalendarEventAttendee> c = cVar.mo115082c();
        if (c != null) {
            list = CollectionsKt.toMutableList((Collection) c);
        } else {
            list = null;
        }
        if (list == null || list.size() != a.getValidMemberCount()) {
            return null;
        }
        return list;
    }

    /* renamed from: b */
    public final void mo115536b(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: b */
    private final GroupAttendeeFragmentData m120047b(CalendarEventAttendee calendarEventAttendee) {
        String str;
        String str2;
        long j;
        AttendeeFragmentData attendeeFragmentData = this.f80615b;
        if (attendeeFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        String a = attendeeFragmentData.getEventUniqueField().mo120059a();
        if (a != null) {
            str = a;
        } else {
            str = "";
        }
        AttendeeFragmentData attendeeFragmentData2 = this.f80615b;
        if (attendeeFragmentData2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        String b = attendeeFragmentData2.getEventUniqueField().mo120060b();
        if (b != null) {
            str2 = b;
        } else {
            str2 = "";
        }
        AttendeeFragmentData attendeeFragmentData3 = this.f80615b;
        if (attendeeFragmentData3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        Long c = attendeeFragmentData3.getEventUniqueField().mo120061c();
        if (c != null) {
            j = c.longValue();
        } else {
            j = 0;
        }
        GroupMemberPageData bVar = null;
        if (AttendeeHelper.f78609a.mo112728a(calendarEventAttendee)) {
            List<CalendarEventAttendee> groupMembers = calendarEventAttendee.getGroupMembers();
            Intrinsics.checkExpressionValueIsNotNull(groupMembers, "attendee.groupMembers");
            bVar = new GroupMemberPageData(false, "", groupMembers);
        }
        if (bVar == null) {
            bVar = this.f80621j.get(calendarEventAttendee.getGroupId());
        }
        return new GroupAttendeeFragmentData(str, str2, j, calendarEventAttendee, bVar);
    }

    /* renamed from: a */
    private final void m120045a(boolean z) {
        AbstractC32629e eVar;
        ((CommonTitleBar) mo109250a(R.id.edit_attendee_title_bar)).removeAllActions();
        CommonTitleBar commonTitleBar = (CommonTitleBar) mo109250a(R.id.edit_attendee_title_bar);
        if (z) {
            eVar = this.f80624m;
        } else {
            eVar = this.f80625n;
        }
        commonTitleBar.addAction(eVar);
    }

    /* renamed from: a */
    public final void mo115527a(Fragment fragment) {
        if (fragment != null) {
            getChildFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getChildFragmentManager().executePendingTransactions();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/fragment/EditAttendeeFragment$mUsableFinishBtnAction$1", "Lcom/ss/android/lark/calendar/impl/utils/debounce/DebouncingTextAction;", "doPerformAction", "", "view", "Landroid/view/View;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.h$k */
    public static final class C31726k extends AbstractC32629e {
        @Override // com.ss.android.lark.calendar.impl.utils.p1577a.AbstractC32629e
        /* renamed from: a */
        public void mo109419a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "view");
        }

        C31726k(String str, int i) {
            super(str, i);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (!this.f80617f) {
            m120049f();
            m120050g();
            m120051h();
        }
    }

    /* renamed from: a */
    private final List<EditAttendeeViewData> m120042a(List<? extends CalendarEventAttendee> list, List<CalendarEventAttendee> list2) {
        ArrayList arrayList = new ArrayList();
        for (CalendarEventAttendee calendarEventAttendee : list2) {
            arrayList.add(new CalendarEventAttendee(calendarEventAttendee));
        }
        for (CalendarEventAttendee calendarEventAttendee2 : list) {
            if (!C32662o.m125351b(calendarEventAttendee2) && arrayList.contains(calendarEventAttendee2)) {
                arrayList.remove(calendarEventAttendee2);
            }
        }
        ArrayList<CalendarEventAttendee> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (CalendarEventAttendee calendarEventAttendee3 : arrayList2) {
            arrayList3.add(new EditAttendeeViewData(calendarEventAttendee3, false, null, 6, null));
        }
        return CollectionsKt.toMutableList((Collection) arrayList3);
    }

    public EditAttendeeFragment(AttendeeFragmentAction aVar, AttendeeFragmentData attendeeFragmentData) {
        Intrinsics.checkParameterIsNotNull(aVar, "action");
        Intrinsics.checkParameterIsNotNull(attendeeFragmentData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f80618g = C32533b.m124620a();
        this.f80621j = new HashMap();
        this.f80622k = new LinkedHashSet();
        this.f80623l = new C31724i(this);
        this.f80624m = new C31725j(this, C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.primary_pri_500);
        this.f80625n = new C31726k(C32634ae.m125182b(R.string.Calendar_Common_Done), R.color.text_placeholder);
        this.f80614a = aVar;
        this.f80615b = attendeeFragmentData;
        this.f80617f = false;
    }

    /* renamed from: a */
    private final void m120046a(boolean z, EditAttendeeViewData cVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        if (z) {
            List<CalendarEventAttendee> c = cVar.mo115082c();
            if (c == null || c.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                List<CalendarEventAttendee> groupMembers = cVar.mo115078a().getGroupMembers();
                if (groupMembers == null || groupMembers.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    String groupId = cVar.mo115078a().getGroupId();
                    String str = groupId;
                    if (str == null || str.length() == 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        cVar.mo115080a(true);
                        m120043a(groupId, false, (IGetDataCallback<PullEventGroupAttendeeMembersResponse>) new C31719d(this, groupId, cVar));
                    }
                }
            }
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.calendar.impl.features.events.edit.View$OnClickListenerC31538b, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_calendar_event_edit_attendee, viewGroup, false);
    }

    /* renamed from: b */
    public final boolean mo115537b(EditAttendeeViewData cVar, String str, int i) {
        boolean z;
        List<CalendarEventAttendee> a = m120041a(cVar);
        List<CalendarEventAttendee> list = a;
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        mo115534a(a, str, i);
        return true;
    }

    /* renamed from: a */
    private final void m120043a(String str, boolean z, IGetDataCallback<PullEventGroupAttendeeMembersResponse> iGetDataCallback) {
        String str2;
        String str3;
        long j;
        AttendeeFragmentData attendeeFragmentData = this.f80615b;
        if (attendeeFragmentData == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAttendeeFragmentData");
        }
        CalendarEventUniqueField eventUniqueField = attendeeFragmentData.getEventUniqueField();
        String a = eventUniqueField.mo120059a();
        if (a != null) {
            str2 = a;
        } else {
            str2 = "";
        }
        String b = eventUniqueField.mo120060b();
        if (b != null) {
            str3 = b;
        } else {
            str3 = "";
        }
        Long c = eventUniqueField.mo120061c();
        if (c != null) {
            j = c.longValue();
        } else {
            j = 0;
        }
        this.f80618g.mo118869a(str2, str3, j, str, z, getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback), "0", 100);
    }
}
