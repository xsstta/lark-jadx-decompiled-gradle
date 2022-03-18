package com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.common.widget.group.data.GroupMemberPageData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeTipViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.AttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.IAttendeeViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.data.Type;
import com.ss.android.lark.calendar.impl.features.events.detail.helper.DetailAttendeeHelper;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IAttendeeFragmentData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventGroupAttendeeMembersResponse;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.PullEventIndividualAttendeesResponse;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0006\u0010=\u001a\u00020\u001dJ\u0010\u0010>\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020<H\u0002J\u0006\u0010A\u001a\u00020:J\u001e\u0010B\u001a\u00020:2\u0006\u0010@\u001a\u00020<2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002J\u0012\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010@\u001a\u00020EH\u0016J\u001c\u0010H\u001a\b\u0012\u0004\u0012\u0002060D2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002J\b\u0010J\u001a\u00020\u001dH\u0002J\u0010\u0010K\u001a\u00020:2\u0006\u0010@\u001a\u00020<H\u0002J\u0006\u0010L\u001a\u00020:J\u0010\u0010M\u001a\u00020:2\u0006\u0010@\u001a\u00020<H\u0016J\b\u0010N\u001a\u00020:H\u0016J\u0014\u0010O\u001a\u00020:2\f\u0010P\u001a\b\u0012\u0004\u0012\u0002060(J\u001e\u0010Q\u001a\u00020:2\u0006\u0010R\u001a\u00020\f2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DH\u0002J \u0010S\u001a\u00020:2\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010U2\u0006\u0010V\u001a\u00020\u001dH\u0002J\u0016\u0010W\u001a\u00020:2\f\u0010X\u001a\b\u0012\u0004\u0012\u0002060(H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0011\u0010%\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0007R \u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\u0019\u0010+\u001a\n -*\u0004\u0018\u00010,0,¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020)0(X\u0004¢\u0006\u0002\n\u0000R\u0011\u00101\u001a\u000202¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0014\u00105\u001a\b\u0012\u0004\u0012\u0002060(X\u000e¢\u0006\u0002\n\u0000R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0016¨\u0006Y"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/IDetailAttendeeViewModel;", "attendeeFragmentData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "(Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;)V", "getAttendeeFragmentData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IAttendeeFragmentData;", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "detailGroupMemberMap", "", "", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupMemberPageData;", "getDetailGroupMemberMap", "()Ljava/util/Map;", "setDetailGroupMemberMap", "(Ljava/util/Map;)V", "endAttendeeLoadMoreLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getEndAttendeeLoadMoreLiveData", "()Landroidx/lifecycle/MutableLiveData;", "individualCursor", "getIndividualCursor", "()Ljava/lang/String;", "setIndividualCursor", "(Ljava/lang/String;)V", "individualHasMore", "", "getIndividualHasMore", "()Z", "setIndividualHasMore", "(Z)V", "isLoadingIndividualAttendee", "loadIndividualErrShow", "getLoadIndividualErrShow", "mAttendeeFragmentData", "getMAttendeeFragmentData", "mAttendeeLiveData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/IAttendeeViewData;", "getMAttendeeLiveData", "mCalendarEventService", "Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "kotlin.jvm.PlatformType", "getMCalendarEventService", "()Lcom/ss/android/lark/calendar/impl/rustadapter/service/CalendarEventService;", "mDisplayAttendeeData", "mEventPartData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IEventPartData;", "getMEventPartData", "()Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IEventPartData;", "originalAttendeeData", "Lcom/ss/android/lark/calendar/impl/features/events/detail/idata/IBodyData$IAttendeeDetailData;", "showNotInGroupTipDialogLiveData", "getShowNotInGroupTipDialogLiveData", "changeGroupMemberVisibility", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/data/AttendeeViewData;", "checkCanDoLoadMore", "checkLoadGroupMember", "closeGroupMember", "attendee", "create", "expandGroupMember", "groupMemberAttendee", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "getGroupFragmentData", "Lcom/ss/android/lark/calendar/impl/features/common/widget/group/data/GroupAttendeeFragmentData;", "getIAttendeeData", "attendees", "isEventInvalid", "loadGroupMember", "loadIndividualAttendee", "onGroupItemClicked", "refreshAttendeeList", "refreshData", "attendeeData", "refreshGroupMember", "attendeeGroupId", "updateIndividualData", "nextPageAttendees", "", "hasMore", "updateOriginalAttendeeViewData", "attendeeDataList", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.c */
public final class DetailAttendeeViewModel extends AbstractC1142af {
    private final IAttendeeFragmentData attendeeFragmentData;
    private CallbackManager callbackManager = new CallbackManager();
    private Map<String, GroupMemberPageData> detailGroupMemberMap = new HashMap();
    private final C1177w<Object> endAttendeeLoadMoreLiveData = new C1177w<>();
    private String individualCursor = "0";
    private boolean individualHasMore;
    public boolean isLoadingIndividualAttendee;
    private final C1177w<Boolean> loadIndividualErrShow = new C1177w<>();
    private final IAttendeeFragmentData mAttendeeFragmentData;
    private final C1177w<ArrayList<IAttendeeViewData>> mAttendeeLiveData = new C1177w<>();
    private final C32533b mCalendarEventService = C32533b.m124620a();
    private final ArrayList<IAttendeeViewData> mDisplayAttendeeData = new ArrayList<>();
    private final IBodyData.IEventPartData mEventPartData;
    private ArrayList<IBodyData.IAttendeeDetailData> originalAttendeeData = new ArrayList<>();
    private final C1177w<Object> showNotInGroupTipDialogLiveData = new C1177w<>();

    public final boolean checkCanDoLoadMore() {
        return this.individualHasMore;
    }

    public final void create() {
        refreshAttendeeList();
    }

    public final IAttendeeFragmentData getAttendeeFragmentData() {
        return this.attendeeFragmentData;
    }

    public final Map<String, GroupMemberPageData> getDetailGroupMemberMap() {
        return this.detailGroupMemberMap;
    }

    public C1177w<Object> getEndAttendeeLoadMoreLiveData() {
        return this.endAttendeeLoadMoreLiveData;
    }

    public final String getIndividualCursor() {
        return this.individualCursor;
    }

    public final boolean getIndividualHasMore() {
        return this.individualHasMore;
    }

    public C1177w<Boolean> getLoadIndividualErrShow() {
        return this.loadIndividualErrShow;
    }

    public final IAttendeeFragmentData getMAttendeeFragmentData() {
        return this.mAttendeeFragmentData;
    }

    public C1177w<ArrayList<IAttendeeViewData>> getMAttendeeLiveData() {
        return this.mAttendeeLiveData;
    }

    public final C32533b getMCalendarEventService() {
        return this.mCalendarEventService;
    }

    public final IBodyData.IEventPartData getMEventPartData() {
        return this.mEventPartData;
    }

    public C1177w<Object> getShowNotInGroupTipDialogLiveData() {
        return this.showNotInGroupTipDialogLiveData;
    }

    private final boolean isEventInvalid() {
        if (this.mEventPartData.mo113620a() == null || this.mEventPartData.mo113621b() == null || this.mEventPartData.mo113622c() == null) {
            return true;
        }
        return false;
    }

    public final void loadIndividualAttendee() {
        long j;
        if (!this.individualHasMore || this.isLoadingIndividualAttendee) {
            getEndAttendeeLoadMoreLiveData().mo5929b((Object) null);
            return;
        }
        this.isLoadingIndividualAttendee = true;
        C31319b bVar = new C31319b(this);
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String a = this.mEventPartData.mo113620a();
        String str = "";
        if (a == null) {
            a = str;
        }
        String b = this.mEventPartData.mo113621b();
        if (b != null) {
            str = b;
        }
        Long c = this.mEventPartData.mo113622c();
        if (c != null) {
            j = c.longValue();
        } else {
            j = 0;
        }
        String d = this.mEventPartData.mo113623d();
        String str2 = this.individualCursor;
        UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(bVar);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118937a(a, str, j, d, 20, str2, false, (IGetDataCallback<PullEventIndividualAttendeesResponse>) wrapAndAddGetDataCallback);
    }

    public void refreshAttendeeList() {
        ArrayList<IAttendeeViewData> arrayList = new ArrayList<>();
        for (T t : this.mDisplayAttendeeData) {
            if (t instanceof AttendeeViewData) {
                T t2 = t;
                arrayList.add(new AttendeeViewData(t2.mo113792b(), t2.mo113795c(), t2.mo113796d(), t2.mo113797e()));
            } else if (t instanceof AttendeeTipViewData) {
                arrayList.add(new AttendeeTipViewData(t.mo113788b()));
            }
        }
        getMAttendeeLiveData().mo5929b(arrayList);
    }

    public final void setIndividualHasMore(boolean z) {
        this.individualHasMore = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel$loadIndividualAttendee$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventIndividualAttendeesResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.c$b */
    public static final class C31319b implements IGetDataCallback<PullEventIndividualAttendeesResponse> {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeViewModel f79285a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31319b(DetailAttendeeViewModel cVar) {
            this.f79285a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(PullEventIndividualAttendeesResponse wVar) {
            if (wVar != null) {
                this.f79285a.setIndividualHasMore(wVar.mo120239b());
                DetailAttendeeViewModel cVar = this.f79285a;
                String a = wVar.mo120238a();
                if (a == null) {
                    a = "";
                }
                cVar.setIndividualCursor(a);
                this.f79285a.updateIndividualData(wVar.mo120240c(), this.f79285a.getIndividualHasMore());
            }
            this.f79285a.getEndAttendeeLoadMoreLiveData().mo5929b((Object) null);
            this.f79285a.isLoadingIndividualAttendee = false;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79285a.getLoadIndividualErrShow().mo5929b((Boolean) false);
            this.f79285a.getEndAttendeeLoadMoreLiveData().mo5929b((Object) null);
            this.f79285a.isLoadingIndividualAttendee = false;
        }
    }

    public final void setDetailGroupMemberMap(Map<String, GroupMemberPageData> map) {
        Intrinsics.checkParameterIsNotNull(map, "<set-?>");
        this.detailGroupMemberMap = map;
    }

    public final void setIndividualCursor(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.individualCursor = str;
    }

    public void onGroupItemClicked(AttendeeViewData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "attendee");
        changeGroupMemberVisibility(bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/detail/fragment/attendee/DetailAttendeeViewModel$loadGroupMember$dummyCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/PullEventGroupAttendeeMembersResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.fragment.attendee.c$a */
    public static final class C31318a implements IGetDataCallback<PullEventGroupAttendeeMembersResponse> {

        /* renamed from: a */
        final /* synthetic */ DetailAttendeeViewModel f79282a;

        /* renamed from: b */
        final /* synthetic */ String f79283b;

        /* renamed from: c */
        final /* synthetic */ AttendeeViewData f79284c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f79282a.getLoadIndividualErrShow().mo5929b((Boolean) false);
            DetailAttendeeViewModel cVar = this.f79282a;
            String h = this.f79284c.mo113792b().mo113382h();
            if (h == null) {
                h = "";
            }
            cVar.refreshGroupMember(h, new ArrayList());
        }

        /* renamed from: a */
        public void onSuccess(PullEventGroupAttendeeMembersResponse vVar) {
            List<CalendarEventAttendee> list;
            List<CalendarEventAttendee> c;
            boolean z;
            if (vVar == null || (c = vVar.mo120234c()) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (T t : c) {
                    if (t.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(t);
                    }
                }
                list = CollectionsKt.toMutableList((Collection) arrayList);
            }
            if (list == null) {
                onError(new ErrorResult("data is empty"));
                return;
            }
            this.f79282a.getDetailGroupMemberMap().put(this.f79283b, new GroupMemberPageData(vVar.mo120232a(), vVar.mo120233b(), list));
            DetailAttendeeViewModel cVar = this.f79282a;
            String h = this.f79284c.mo113792b().mo113382h();
            if (h == null) {
                h = "";
            }
            cVar.refreshGroupMember(h, list);
        }

        C31318a(DetailAttendeeViewModel cVar, String str, AttendeeViewData bVar) {
            this.f79282a = cVar;
            this.f79283b = str;
            this.f79284c = bVar;
        }
    }

    private final void changeGroupMemberVisibility(AttendeeViewData bVar) {
        IBodyData.IAttendeeDetailData b = bVar.mo113792b();
        if (b.mo113381g() && b.mo113383i()) {
            checkLoadGroupMember(bVar);
        } else if (b.mo113381g() && !b.mo113383i()) {
            getShowNotInGroupTipDialogLiveData().mo5929b((Object) null);
        }
    }

    private final List<IBodyData.IAttendeeDetailData> getIAttendeeData(List<CalendarEventAttendee> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(DetailAttendeeHelper.f79071a.mo113374a(it.next(), this.mAttendeeFragmentData.mo113614a(), this.mAttendeeFragmentData.mo113615b(), this.mAttendeeFragmentData.mo113616c()));
        }
        return arrayList;
    }

    public final void refreshData(ArrayList<IBodyData.IAttendeeDetailData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeData");
        this.detailGroupMemberMap = new HashMap();
        this.individualCursor = this.mEventPartData.mo113624e();
        this.individualHasMore = !this.mEventPartData.mo113625f();
        updateOriginalAttendeeViewData(arrayList);
        refreshAttendeeList();
    }

    public DetailAttendeeViewModel(IAttendeeFragmentData aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "attendeeFragmentData");
        this.attendeeFragmentData = aVar;
        IBodyData.IEventPartData d = aVar.mo113617d();
        this.mEventPartData = d;
        this.mAttendeeFragmentData = aVar;
        this.individualCursor = d.mo113624e();
        this.individualHasMore = !d.mo113625f();
        updateOriginalAttendeeViewData(aVar.mo113618e());
    }

    private final void closeGroupMember(AttendeeViewData bVar) {
        int indexOf = this.mDisplayAttendeeData.indexOf(bVar);
        if (indexOf != -1) {
            int i = indexOf + 1;
            while (i < this.mDisplayAttendeeData.size()) {
                IAttendeeViewData cVar = this.mDisplayAttendeeData.get(i);
                Intrinsics.checkExpressionValueIsNotNull(cVar, "mDisplayAttendeeData[removeIndex]");
                IAttendeeViewData cVar2 = cVar;
                if (cVar2.mo113786a() == Type.GROUP_MEMBER || cVar2.mo113786a() == Type.HIDE_FOR_SAFE_TEXT_TIP || cVar2.mo113786a() == Type.GROUP_EXPAND_TIP) {
                    this.mDisplayAttendeeData.remove(cVar2);
                } else {
                    return;
                }
            }
        }
    }

    private final void loadGroupMember(AttendeeViewData bVar) {
        boolean z;
        long j;
        String h = bVar.mo113792b().mo113382h();
        if (!isEventInvalid()) {
            String str = h;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C31318a aVar = new C31318a(this, h, bVar);
                C32533b bVar2 = this.mCalendarEventService;
                String a = this.mEventPartData.mo113620a();
                if (a == null) {
                    a = "";
                }
                String b = this.mEventPartData.mo113621b();
                if (b == null) {
                    b = "";
                }
                Long c = this.mEventPartData.mo113622c();
                if (c != null) {
                    j = c.longValue();
                } else {
                    j = 0;
                }
                bVar2.mo118869a(a, b, j, h, false, (IGetDataCallback<PullEventGroupAttendeeMembersResponse>) this.callbackManager.wrapAndAddGetDataCallback(aVar), "0", 100);
            }
        }
    }

    public GroupAttendeeFragmentData getGroupFragmentData(CalendarEventAttendee calendarEventAttendee) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(calendarEventAttendee, "attendee");
        IBodyData.IEventPartData d = this.mAttendeeFragmentData.mo113617d();
        String a = d.mo113620a();
        String b = d.mo113621b();
        Long c = d.mo113622c();
        String str = a;
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String str2 = b;
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (z2 || c == null) {
            return null;
        }
        return new GroupAttendeeFragmentData(a, b, c.longValue(), calendarEventAttendee, this.detailGroupMemberMap.get(calendarEventAttendee.getGroupId()));
    }

    public void updateOriginalAttendeeViewData(ArrayList<IBodyData.IAttendeeDetailData> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "attendeeDataList");
        this.originalAttendeeData = arrayList;
        ArrayList<IBodyData.IAttendeeDetailData> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new AttendeeViewData(it.next(), false, Type.INDIVIDUAL, false, 8, null));
        }
        ArrayList<IAttendeeViewData> arrayList4 = this.mDisplayAttendeeData;
        arrayList4.clear();
        arrayList4.addAll(arrayList3);
    }

    private final void checkLoadGroupMember(AttendeeViewData bVar) {
        boolean z;
        List<CalendarEventAttendee> list;
        T t;
        boolean z2;
        Iterator<T> it = this.mDisplayAttendeeData.iterator();
        while (true) {
            z = false;
            list = null;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (!(t2 instanceof AttendeeViewData) || !Intrinsics.areEqual(t2.mo113792b().mo113382h(), bVar.mo113792b().mo113382h())) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (!(t instanceof AttendeeViewData)) {
            t = null;
        }
        T t3 = t;
        if (t3 != null) {
            t3.mo113793b(!t3.mo113797e());
            String str = "";
            if (!t3.mo113797e()) {
                String h = t3.mo113792b().mo113382h();
                if (h != null) {
                    str = h;
                }
                refreshGroupMember(str, new ArrayList());
                return;
            }
            GroupMemberPageData bVar2 = this.detailGroupMemberMap.get(t3.mo113792b().mo113382h());
            if (bVar2 != null) {
                list = bVar2.mo113182c();
            }
            List<CalendarEventAttendee> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            }
            if (!z) {
                String h2 = t3.mo113792b().mo113382h();
                if (h2 != null) {
                    str = h2;
                }
                refreshGroupMember(str, list);
                return;
            }
            t3.mo113790a(true);
            loadGroupMember(t3);
            refreshAttendeeList();
        }
    }

    public final void refreshGroupMember(String str, List<CalendarEventAttendee> list) {
        T t;
        T t2;
        boolean z;
        Iterator<T> it = this.mDisplayAttendeeData.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            T t3 = t2;
            if (!(t3 instanceof AttendeeViewData) || !Intrinsics.areEqual(t3.mo113792b().mo113382h(), str)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (t2 instanceof AttendeeViewData) {
            t = t2;
        }
        T t4 = t;
        if (t4 != null) {
            t4.mo113790a(false);
            if (t4.mo113797e()) {
                expandGroupMember(t4, list);
            } else {
                closeGroupMember(t4);
            }
            refreshAttendeeList();
        }
    }

    private final void expandGroupMember(AttendeeViewData bVar, List<CalendarEventAttendee> list) {
        boolean z;
        int i;
        IBodyData.IAttendeeDetailData b = bVar.mo113792b();
        int indexOf = this.mDisplayAttendeeData.indexOf(bVar);
        if (indexOf != -1) {
            List<CalendarEventAttendee> list2 = list;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                List<IBodyData.IAttendeeDetailData> iAttendeeData = getIAttendeeData(list);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iAttendeeData, 10));
                Iterator<T> it = iAttendeeData.iterator();
                while (it.hasNext()) {
                    arrayList.add(new AttendeeViewData(it.next(), false, Type.GROUP_MEMBER, false, 8, null));
                }
                ArrayList arrayList2 = arrayList;
                boolean n = b.mo113388n();
                int m = b.mo113387m();
                int i2 = indexOf + 1;
                if (i2 >= this.mDisplayAttendeeData.size() || this.mDisplayAttendeeData.get(i2).mo113786a() != Type.GROUP_MEMBER) {
                    if (n) {
                        i = Math.min(arrayList2.size(), m);
                    } else {
                        i = arrayList2.size();
                    }
                    this.mDisplayAttendeeData.addAll(i2, arrayList2);
                    int size = indexOf + arrayList2.size() + 1;
                    if (b.mo113386l() <= i) {
                        return;
                    }
                    if (!n) {
                        this.mDisplayAttendeeData.add(size, new AttendeeViewData(b, false, Type.GROUP_EXPAND_TIP, false, 8, null));
                    } else if (m > 100) {
                        this.mDisplayAttendeeData.add(size, new AttendeeViewData(b, false, Type.GROUP_EXPAND_TIP, false, 8, null));
                    } else {
                        this.mDisplayAttendeeData.add(size, new AttendeeViewData(b, false, Type.HIDE_FOR_SAFE_TEXT_TIP, false, 8, null));
                    }
                }
            }
        }
    }

    public final void updateIndividualData(List<? extends CalendarEventAttendee> list, boolean z) {
        IBodyData.IAttendeeDetailData b;
        if (list != null) {
            ArrayList<IAttendeeViewData> arrayList = new ArrayList();
            Iterator<T> it = this.mDisplayAttendeeData.iterator();
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                if (!(t instanceof AttendeeViewData) || t.mo113796d() != Type.INDIVIDUAL) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (IAttendeeViewData cVar : arrayList) {
                CalendarEventAttendee calendarEventAttendee = null;
                if (!(cVar instanceof AttendeeViewData)) {
                    cVar = null;
                }
                AttendeeViewData bVar = (AttendeeViewData) cVar;
                if (!(bVar == null || (b = bVar.mo113792b()) == null)) {
                    calendarEventAttendee = b.mo113391q();
                }
                if (calendarEventAttendee != null) {
                    arrayList2.add(calendarEventAttendee);
                }
            }
            ArrayList arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList();
            for (T t2 : list) {
                if (!arrayList3.contains(t2)) {
                    arrayList4.add(t2);
                }
            }
            List<IBodyData.IAttendeeDetailData> iAttendeeData = getIAttendeeData(new ArrayList(arrayList4));
            ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iAttendeeData, 10));
            Iterator<T> it2 = iAttendeeData.iterator();
            while (it2.hasNext()) {
                arrayList5.add(new AttendeeViewData(it2.next(), false, Type.INDIVIDUAL, false, 8, null));
            }
            this.mDisplayAttendeeData.addAll(arrayList5);
            if (!z) {
                this.mDisplayAttendeeData.add(new AttendeeTipViewData(Type.NO_MORE_INDIVIDUAL_TIP));
            }
            refreshAttendeeList();
        }
    }
}
