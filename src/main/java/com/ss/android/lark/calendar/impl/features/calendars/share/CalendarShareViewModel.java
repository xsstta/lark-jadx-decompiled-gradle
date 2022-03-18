package com.ss.android.lark.calendar.impl.features.calendars.share;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.impl.features.calendars.p1446a.C30237a;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.FetchCalendarData;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001JB\u0005¢\u0006\u0002\u0010\u0003J\u0006\u00103\u001a\u000204J\b\u00105\u001a\u000204H\u0002J\b\u00106\u001a\u00020\u000bH\u0002J\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u0002042\b\u0010:\u001a\u0004\u0018\u00010;J \u0010<\u001a\u0002042\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020\u00160>j\b\u0012\u0004\u0012\u00020\u0016`?H\u0016J\u0010\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020EH\u0016J\u0018\u0010F\u001a\u0002042\u0006\u0010A\u001a\u00020B2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002042\u0006\u0010%\u001a\u00020&H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0011X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0014\u0010!\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\rR\u0014\u0010#\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\rR\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020&8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u0001008VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006K"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/ICalendarShareViewModel;", "()V", "calendar", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "getCalendar", "()Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "setCalendar", "(Lcom/bytedance/lark/pb/calendar/v1/Calendar;)V", "calendarDescription", "", "getCalendarDescription", "()Ljava/lang/String;", "calendarId", "getCalendarId", "calendarLiveData", "Landroidx/lifecycle/MutableLiveData;", "getCalendarLiveData", "()Landroidx/lifecycle/MutableLiveData;", "calendarMemberLiveData", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "getCalendarMemberLiveData", "calendarOwnerMember", "getCalendarOwnerMember", "()Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "calendarPermission", "", "getCalendarPermission", "calendarTenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "getCalendarTenantInfo", "calendarTitle", "getCalendarTitle", "calendarUrl", "getCalendarUrl", "calendarWithMembers", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "getCallbackManager", "()Lcom/larksuite/framework/callback/CallbackManager;", "currentCalendarWithMembers", "getCurrentCalendarWithMembers", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", "originalCalendarId", "selectMemberList", "", "getSelectMemberList", "()Ljava/util/List;", "create", "", "fetchCalendarAndMembers", "getCalendarSummary", "getIShareOptionFragmentData", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "init", "bundle", "Landroid/os/Bundle;", "onAddCalendarMember", "newMember", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onDeleteMember", "member", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember$Builder;", "onEditCalendarShareOptions", "newShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "onEditMemberAccessRole", "newAccessRole", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$AccessRole;", "setLiveData", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b */
public final class CalendarShareViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private Calendar calendar;
    private final C1177w<Calendar> calendarLiveData = new C1177w<>();
    private final C1177w<List<CalendarMember>> calendarMemberLiveData = new C1177w<>();
    private final C1177w<Boolean> calendarPermission = new C1177w<>();
    private final C1177w<CalendarTenantInfo> calendarTenantInfo = new C1177w<>();
    private FetchCalendarData calendarWithMembers;
    private final CallbackManager callbackManager = new CallbackManager();
    private String originalCalendarId = "";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final Calendar getCalendar() {
        return this.calendar;
    }

    public String getCalendarId() {
        return this.originalCalendarId;
    }

    public C1177w<Calendar> getCalendarLiveData() {
        return this.calendarLiveData;
    }

    public C1177w<List<CalendarMember>> getCalendarMemberLiveData() {
        return this.calendarMemberLiveData;
    }

    public C1177w<Boolean> getCalendarPermission() {
        return this.calendarPermission;
    }

    public C1177w<CalendarTenantInfo> getCalendarTenantInfo() {
        return this.calendarTenantInfo;
    }

    public final CallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel$getIShareOptionFragmentData$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionFragmentData;", "getCalendarId", "", "getCalendarShareOption", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "getCalendarTenantInfo", "Lcom/bytedance/lark/pb/calendar/v1/CalendarTenantInfo;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b$c */
    public static final class C30459c implements IShareOptionFragmentData {

        /* renamed from: a */
        final /* synthetic */ CalendarShareViewModel f76230a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: a */
        public String mo109360a() {
            return this.f76230a.getCalendarId();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: d */
        public boolean mo109363d() {
            return IShareOptionFragmentData.C30473a.m113256a(this);
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: b */
        public Calendar.CalendarShareOptions mo109361b() {
            Calendar calendar = this.f76230a.getCalendar();
            if (calendar != null) {
                return calendar.share_options;
            }
            return null;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionFragmentData
        /* renamed from: c */
        public CalendarTenantInfo mo109362c() {
            return this.f76230a.getCalendarTenantInfo().mo5927b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30459c(CalendarShareViewModel bVar) {
            this.f76230a = bVar;
        }
    }

    public String getCalendarTitle() {
        return getCalendarSummary();
    }

    public final IShareOptionFragmentData getIShareOptionFragmentData() {
        return new C30459c(this);
    }

    public final void create() {
        FetchCalendarData fetchCalendarData = this.calendarWithMembers;
        if (fetchCalendarData != null) {
            setLiveData(fetchCalendarData);
        } else {
            fetchCalendarAndMembers();
        }
    }

    public String getCalendarDescription() {
        String str;
        Calendar calendar2 = this.calendar;
        if (calendar2 == null || (str = calendar2.description) == null) {
            return "";
        }
        return str;
    }

    public String getCalendarUrl() {
        Calendar.CalendarShareInfo calendarShareInfo;
        String str;
        Calendar calendar2 = this.calendar;
        if (calendar2 == null || (calendarShareInfo = calendar2.share_info) == null || (str = calendarShareInfo.share_url) == null) {
            return "";
        }
        return str;
    }

    public List<CalendarMember> getSelectMemberList() {
        return getCalendarMemberLiveData().mo5927b();
    }

    private final void fetchCalendarAndMembers() {
        CalendarSDKService.f83473a.mo118972k(getCalendarId(), this.callbackManager.wrapAndAddGetDataCallback(new C30458b(this)));
    }

    private final String getCalendarSummary() {
        String str;
        Calendar calendar2 = this.calendar;
        if (calendar2 == null || (str = C30237a.m112305e(calendar2)) == null) {
            str = "";
        }
        if (str.length() <= 100) {
            return str;
        }
        if (str != null) {
            String substring = str.substring(0, 100);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public FetchCalendarData getCurrentCalendarWithMembers() {
        Calendar calendar2 = this.calendar;
        ArrayList b = getCalendarMemberLiveData().mo5927b();
        if (b == null) {
            b = new ArrayList();
        }
        return new FetchCalendarData(calendar2, b, getCalendarTenantInfo().mo5927b());
    }

    public CalendarMember getCalendarOwnerMember() {
        boolean z;
        T t;
        String str;
        List<CalendarMember> b = getCalendarMemberLiveData().mo5927b();
        T t2 = null;
        if (b != null) {
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                String str2 = t.user_id;
                Calendar calendar2 = this.calendar;
                if (calendar2 != null) {
                    str = calendar2.calendar_owner_id;
                } else {
                    str = null;
                }
                if (Intrinsics.areEqual(str2, str)) {
                    break;
                }
            }
            T t3 = t;
            if (t3 != null) {
                return t3;
            }
        }
        List<CalendarMember> b2 = getCalendarMemberLiveData().mo5927b();
        if (b2 == null) {
            return null;
        }
        Iterator<T> it2 = b2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            T next = it2.next();
            if (next.access_role == Calendar.AccessRole.OWNER) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                t2 = next;
                break;
            }
        }
        return t2;
    }

    public final void setCalendar(Calendar calendar2) {
        this.calendar = calendar2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel$fetchCalendarAndMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarWithMembers", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.b$b */
    public static final class C30458b implements IGetDataCallback<FetchCalendarData> {

        /* renamed from: a */
        final /* synthetic */ CalendarShareViewModel f76229a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30458b(CalendarShareViewModel bVar) {
            this.f76229a = bVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarShareViewModel", "getCalendarAndMembersWithIds Err");
        }

        /* renamed from: a */
        public void onSuccess(FetchCalendarData fetchCalendarData) {
            Intrinsics.checkParameterIsNotNull(fetchCalendarData, "calendarWithMembers");
            if (fetchCalendarData.getCalendar() == null) {
                onError(new ErrorResult("data is null"));
            } else {
                this.f76229a.setLiveData(fetchCalendarData);
            }
        }
    }

    public void onEditCalendarShareOptions(Calendar.CalendarShareOptions calendarShareOptions) {
        Calendar calendar2;
        Calendar.C15508a newBuilder;
        Intrinsics.checkParameterIsNotNull(calendarShareOptions, "newShareOptions");
        Calendar calendar3 = this.calendar;
        if (!(calendar3 == null || (newBuilder = calendar3.newBuilder()) == null)) {
            newBuilder.f40992S = calendarShareOptions;
            if (newBuilder != null) {
                calendar2 = newBuilder.build();
                this.calendar = calendar2;
            }
        }
        calendar2 = null;
        this.calendar = calendar2;
    }

    public final void init(Bundle bundle) {
        Serializable serializable;
        String string;
        String str = "";
        if (!(bundle == null || (string = bundle.getString("key_param_share_calendar_id", str)) == null)) {
            str = string;
        }
        FetchCalendarData fetchCalendarData = null;
        if (bundle != null) {
            serializable = bundle.getSerializable("key_param_calendar_with_members_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof FetchCalendarData) {
            fetchCalendarData = serializable;
        }
        this.originalCalendarId = str;
        this.calendarWithMembers = fetchCalendarData;
    }

    public final void setLiveData(FetchCalendarData fetchCalendarData) {
        String str;
        Calendar calendar2 = fetchCalendarData.getCalendar();
        if (calendar2 != null) {
            this.calendar = calendar2;
            getCalendarLiveData().mo5929b(calendar2);
        }
        Calendar calendar3 = this.calendar;
        if (calendar3 == null || (str = calendar3.calendar_owner_id) == null) {
            str = "";
        }
        getCalendarMemberLiveData().mo5929b(CalendarShareDataHelper.f76316a.mo110022a(fetchCalendarData.getCalendarMembers(), str));
        CalendarTenantInfo calendarTenantInfo2 = fetchCalendarData.getCalendarTenantInfo();
        if (calendarTenantInfo2 != null) {
            getCalendarTenantInfo().mo5929b(calendarTenantInfo2);
        }
    }

    public void onAddCalendarMember(ArrayList<CalendarMember> arrayList) {
        List<CalendarMember> list;
        String str;
        boolean z;
        Intrinsics.checkParameterIsNotNull(arrayList, "newMember");
        ArrayList arrayList2 = new ArrayList();
        for (T t : arrayList) {
            T t2 = t;
            List<CalendarMember> b = getCalendarMemberLiveData().mo5927b();
            if (b == null || b.contains(t2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(t);
            }
        }
        ArrayList arrayList3 = arrayList2;
        C1177w<List<CalendarMember>> calendarMemberLiveData2 = getCalendarMemberLiveData();
        List<CalendarMember> b2 = getCalendarMemberLiveData().mo5927b();
        if (b2 != null) {
            b2.addAll(arrayList3);
            Calendar calendar2 = this.calendar;
            if (calendar2 == null || (str = calendar2.calendar_owner_id) == null) {
                str = "";
            }
            CalendarShareDataHelper aVar = CalendarShareDataHelper.f76316a;
            Intrinsics.checkExpressionValueIsNotNull(b2, "it");
            list = aVar.mo110022a(b2, str);
        } else {
            list = null;
        }
        calendarMemberLiveData2.mo5929b(list);
    }

    public void onDeleteMember(CalendarMember.C15546a aVar) {
        T t;
        Intrinsics.checkParameterIsNotNull(aVar, "member");
        List<CalendarMember> b = getCalendarMemberLiveData().mo5927b();
        if (b != null) {
            Iterator<T> it = b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
                CalendarMember a = aVar.build();
                Intrinsics.checkExpressionValueIsNotNull(a, "member.build()");
                if (aVar2.mo110023a(t, a)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                List<CalendarMember> b2 = getCalendarMemberLiveData().mo5927b();
                if (b2 != null) {
                    b2.remove(t2);
                }
                getCalendarMemberLiveData().mo5929b(getCalendarMemberLiveData().mo5927b());
            }
        }
    }

    public void onEditMemberAccessRole(CalendarMember.C15546a aVar, Calendar.AccessRole accessRole) {
        T t;
        List<CalendarMember> b;
        Intrinsics.checkParameterIsNotNull(aVar, "member");
        Intrinsics.checkParameterIsNotNull(accessRole, "newAccessRole");
        List<CalendarMember> b2 = getCalendarMemberLiveData().mo5927b();
        if (b2 != null) {
            Iterator<T> it = b2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                CalendarShareDataHelper aVar2 = CalendarShareDataHelper.f76316a;
                CalendarMember a = aVar.build();
                Intrinsics.checkExpressionValueIsNotNull(a, "member.build()");
                if (aVar2.mo110023a(t, a)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null && (b = getCalendarMemberLiveData().mo5927b()) != null) {
                int indexOf = b.indexOf(t2);
                List<CalendarMember> b3 = getCalendarMemberLiveData().mo5927b();
                if (b3 != null) {
                    b3.remove(t2);
                }
                CalendarMember.C15546a newBuilder = t2.newBuilder();
                newBuilder.f41216d = accessRole;
                CalendarMember a2 = newBuilder.build();
                List<CalendarMember> b4 = getCalendarMemberLiveData().mo5927b();
                if (b4 != null) {
                    Intrinsics.checkExpressionValueIsNotNull(a2, "newMember");
                    b4.add(indexOf, a2);
                }
                getCalendarMemberLiveData().mo5929b(getCalendarMemberLiveData().mo5927b());
            }
        }
    }
}
