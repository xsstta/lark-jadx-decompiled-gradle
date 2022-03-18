package com.ss.android.lark.calendar.impl.features.calendars.profile;

import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.C1177w;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWithMembers;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u00020\u0012H\u0002J\u001a\u0010!\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0010\u0010\u0019\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\tX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/profile/ICalendarProfileViewModel;", "calendarId", "", "(Ljava/lang/String;)V", "getCalendarId", "()Ljava/lang/String;", "calendarLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendarLiveData", "()Landroidx/lifecycle/MutableLiveData;", "callbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "creatorLiveData", "getCreatorLiveData", "isPrivateAuthority", "", "()Z", "loadingViewErrLiveData", "", "getLoadingViewErrLiveData", "loadingViewLiveData", "getLoadingViewLiveData", "mCalendar", "subscribeToastLoadingErrLiveData", "getSubscribeToastLoadingErrLiveData", "subscribeToastLoadingLiveData", "getSubscribeToastLoadingLiveData", "create", "", "isPrivateCalendar", "loadCalendar", "retryLoad", "refreshCalendarProfile", "subscribeCalendar", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.c */
public final class CalendarProfileViewModel extends AbstractC1142af {
    public static final Companion Companion = new Companion(null);
    private final String calendarId;
    private final C1177w<Calendar> calendarLiveData = new C1177w<>();
    private final CallbackManager callbackManager = new CallbackManager();
    private final C1177w<String> creatorLiveData = new C1177w<>();
    private final C1177w<Object> loadingViewErrLiveData = new C1177w<>();
    private final C1177w<Boolean> loadingViewLiveData = new C1177w<>();
    public Calendar mCalendar;
    private final C1177w<Object> subscribeToastLoadingErrLiveData = new C1177w<>();
    private final C1177w<Boolean> subscribeToastLoadingLiveData = new C1177w<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getCalendarId() {
        return this.calendarId;
    }

    public C1177w<Calendar> getCalendarLiveData() {
        return this.calendarLiveData;
    }

    public C1177w<String> getCreatorLiveData() {
        return this.creatorLiveData;
    }

    public C1177w<Object> getLoadingViewErrLiveData() {
        return this.loadingViewErrLiveData;
    }

    public C1177w<Boolean> getLoadingViewLiveData() {
        return this.loadingViewLiveData;
    }

    public C1177w<Object> getSubscribeToastLoadingErrLiveData() {
        return this.subscribeToastLoadingErrLiveData;
    }

    public C1177w<Boolean> getSubscribeToastLoadingLiveData() {
        return this.subscribeToastLoadingLiveData;
    }

    public final void create() {
        loadCalendar(this.calendarId, true);
    }

    public boolean isPrivateAuthority() {
        return isPrivateCalendar();
    }

    public final void refreshCalendarProfile() {
        Calendar calendar = this.mCalendar;
        if (calendar != null) {
            getCalendarLiveData().mo5929b(calendar);
        }
    }

    private final boolean isPrivateCalendar() {
        Calendar calendar = this.mCalendar;
        if (calendar == null || calendar.isPublic() || calendar.getSelfAccessRole() == Calendar.AccessRole.READER || calendar.getSelfAccessRole() == Calendar.AccessRole.WRITER || calendar.getSelfAccessRole() == Calendar.AccessRole.OWNER) {
            return false;
        }
        return true;
    }

    public void subscribeCalendar() {
        String serverId;
        String str;
        Calendar calendar = this.mCalendar;
        if (calendar != null && (serverId = calendar.getServerId()) != null) {
            getSubscribeToastLoadingLiveData().mo5929b((Boolean) true);
            C30383c cVar = new C30383c(this);
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(cVar);
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
            aVar.mo118934a(serverId, wrapAndAddGetDataCallback);
            Calendar calendar2 = this.mCalendar;
            if (calendar2 == null || (str = calendar2.getServerId()) == null) {
                str = "";
            }
            GeneralHitPoint.m124222a(true, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel$subscribeCalendar$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.c$c */
    public static final class C30383c implements IGetDataCallback<Calendar> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileViewModel f76079a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30383c(CalendarProfileViewModel cVar) {
            this.f76079a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f76079a.getSubscribeToastLoadingErrLiveData().mo5929b((Object) null);
        }

        /* renamed from: a */
        public void onSuccess(Calendar calendar) {
            this.f76079a.getSubscribeToastLoadingLiveData().mo5929b((Boolean) false);
            Calendar calendar2 = this.f76079a.mCalendar;
            if (calendar2 != null) {
                calendar2.isSubscriber(true);
            }
            this.f76079a.refreshCalendarProfile();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileViewModel$loadCalendar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWithMembers;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarWithMembers", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.c$b */
    public static final class C30382b implements IGetDataCallback<CalendarWithMembers> {

        /* renamed from: a */
        final /* synthetic */ CalendarProfileViewModel f76076a;

        /* renamed from: b */
        final /* synthetic */ boolean f76077b;

        /* renamed from: c */
        final /* synthetic */ String f76078c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarProfileViewModel", "getCalendarAndMembersWithIds Err");
            if (this.f76077b) {
                this.f76076a.loadCalendar(this.f76078c, false);
            } else {
                this.f76076a.getLoadingViewErrLiveData().mo5929b((Object) null);
            }
        }

        /* renamed from: a */
        public void onSuccess(CalendarWithMembers cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "calendarWithMembers");
            Calendar a = cVar.mo120065a();
            if (a == null) {
                onError(new ErrorResult("data is null"));
                return;
            }
            this.f76076a.mCalendar = a;
            this.f76076a.getLoadingViewLiveData().mo5929b((Boolean) false);
            this.f76076a.refreshCalendarProfile();
            boolean isSubscriber = a.isSubscriber();
            boolean isPrivateAuthority = this.f76076a.isPrivateAuthority();
            String serverId = a.getServerId();
            if (serverId == null) {
                serverId = "";
            }
            GeneralHitPoint.m124224a(isSubscriber, isPrivateAuthority, serverId);
        }

        C30382b(CalendarProfileViewModel cVar, boolean z, String str) {
            this.f76076a = cVar;
            this.f76077b = z;
            this.f76078c = str;
        }
    }

    public CalendarProfileViewModel(String str) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        this.calendarId = str;
    }

    public final void loadCalendar(String str, boolean z) {
        getLoadingViewLiveData().mo5929b((Boolean) true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        UIGetDataCallback wrapAndAddGetDataCallback = this.callbackManager.wrapAndAddGetDataCallback(new C30382b(this, z, str));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        CalendarSDKService.f83473a.mo118946a(arrayList, wrapAndAddGetDataCallback);
    }

    static /* synthetic */ void loadCalendar$default(CalendarProfileViewModel cVar, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        cVar.loadCalendar(str, z);
    }
}
