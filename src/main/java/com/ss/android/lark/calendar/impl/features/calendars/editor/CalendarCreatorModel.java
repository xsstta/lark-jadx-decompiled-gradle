package com.ss.android.lark.calendar.impl.features.calendars.editor;

import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter;
import com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWithMembers;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30054s;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB\u0005¢\u0006\u0002\u0010\u0003JH\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\r2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010 \u001a\u00020!2\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u001e0#H\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020\u0014H\u0016J$\u0010&\u001a\u00020\u001b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0016J\b\u0010)\u001a\u00020\u001bH\u0016J\u0016\u0010*\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0#H\u0016J\u001e\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\r2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0#H\u0016J\b\u0010.\u001a\u00020!H\u0016J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\rH\u0016J\b\u00102\u001a\u00020\u000bH\u0016J\b\u00103\u001a\u00020\u0005H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\b\u00105\u001a\u00020\rH\u0016J\b\u00106\u001a\u00020\u001bH\u0016J\b\u00107\u001a\u00020\u000bH\u0016J \u00108\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\r2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000509H\u0016J\u0018\u0010:\u001a\u00020\u001b2\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010#H\u0016J\u0016\u0010<\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0#H\u0016J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010>\u001a\u00020\u0005H\u0016J\u0010\u0010?\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u000bH\u0016J\u0016\u0010@\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0#H\u0016J\u0010\u0010A\u001a\u00020\u001b2\u0006\u0010B\u001a\u00020!H\u0016J\u0010\u0010C\u001a\u00020\u001b2\u0006\u0010D\u001a\u000200H\u0016J\u0010\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u00020\rH\u0016J\u0010\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006J"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorModel;", "()V", "mCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getMCalendar", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "setMCalendar", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;)V", "mIsEdited", "", "mLoginChatterId", "", "getMLoginChatterId", "()Ljava/lang/String;", "setMLoginChatterId", "(Ljava/lang/String;)V", "mRemovedCalendarMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "mShowCalendarMembers", "getMShowCalendarMembers", "()Ljava/util/List;", "setMShowCalendarMembers", "(Ljava/util/List;)V", "addCalendarMembersByIds", "", "calendarServerId", "userIds", "", "chatIds", "position", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "addRemovedMember", "calendarMember", "adjustMembersOnAddMembersIdFromGroup", "attendeeIds", "groupIds", "create", "delegateCalendar", "getCalendarAndMembersWithIds", "calendarId", "viewCallBack", "getCalendarColor", "getCalendarDefaultAccessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "getCalendarDescription", "getCalendarIsPublic", "getCurrentCalendar", "getCurrentShowMembers", "getLoginChatterId", "initForNewCalendar", "isEdited", "loadCalendarById", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$IFetchCalendarCallback;", "loadLoginChatter", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "saveCalendarWithMembers", "setCurrentCalendar", "calendar", "setIsEdited", "unSubscribeCalendar", "updateCalendarColor", "chosenColor", "updateCalendarDefaultAccessRole", "accessRole", "updateCalendarDescription", "description", "updateCalendarIsPublic", "isPublic", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b */
public final class CalendarCreatorModel extends BaseModel implements ICalendarCreatorContract.ICalendarCreatorModel {

    /* renamed from: a */
    public static final String f75887a = CalendarCreatorModel.class.getSimpleName();

    /* renamed from: b */
    public static final Companion f75888b = new Companion(null);

    /* renamed from: c */
    private Calendar f75889c = new Calendar();

    /* renamed from: d */
    private List<CalendarMember> f75890d = new ArrayList();

    /* renamed from: e */
    private List<CalendarMember> f75891e = new ArrayList();

    /* renamed from: f */
    private boolean f75892f;

    /* renamed from: g */
    private String f75893g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel$Companion;", "", "()V", "GET_CALENDAR", "", "GET_MEMBERS", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$a */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo109484a() {
            return CalendarCreatorModel.f75887a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final Calendar mo109456a() {
        return this.f75889c;
    }

    /* renamed from: b */
    public final List<CalendarMember> mo109468b() {
        return this.f75890d;
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: d */
    public String mo109475d() {
        return this.f75893g;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: e */
    public Calendar mo109477e() {
        return this.f75889c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: f */
    public List<CalendarMember> mo109478f() {
        return this.f75890d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: g */
    public boolean mo109479g() {
        return this.f75892f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109467a(boolean z) {
        this.f75892f = z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: h */
    public int mo109480h() {
        return this.f75889c.getBackgroundColor();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: i */
    public boolean mo109481i() {
        return this.f75889c.isPublic();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: j */
    public Calendar.AccessRole mo109482j() {
        Calendar.AccessRole defaultAccessRole = this.f75889c.getDefaultAccessRole();
        Intrinsics.checkExpressionValueIsNotNull(defaultAccessRole, "mCalendar.defaultAccessRole");
        return defaultAccessRole;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: k */
    public String mo109483k() {
        String description = this.f75889c.getDescription();
        Intrinsics.checkExpressionValueIsNotNull(description, "mCalendar.description");
        return description;
    }

    public CalendarCreatorModel() {
        String str = "";
        this.f75893g = str;
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String a = loginDependency.mo108269a();
        str = a != null ? a : str;
        this.f75893g = str;
        Log.m165389i(f75887a, str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: c */
    public void mo109473c() {
        C30022a.f74884c.mo108450a(new C30304d(this));
        String str = "";
        this.f75889c.setId(str);
        this.f75889c.setServerId(str);
        this.f75889c.setUserId(str);
        this.f75889c.setSummary(str);
        this.f75889c.setNote(str);
        this.f75889c.setDescription(str);
        Calendar calendar = this.f75889c;
        AbstractC30054s loginDependency = C30022a.f74882a.loginDependency();
        Intrinsics.checkExpressionValueIsNotNull(loginDependency, "CalendarDependencyHolder…endency.loginDependency()");
        String c = loginDependency.mo108271c();
        if (c != null) {
            str = c;
        }
        calendar.setTenantId(str);
        this.f75889c.setIsPublic(false);
        this.f75889c.setType(Calendar.Type.OTHER);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel$saveCalendarWithMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "result", "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$g */
    public static final class C30307g implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ IGetDataCallback f75909a;

        C30307g(IGetDataCallback iGetDataCallback) {
            this.f75909a = iGetDataCallback;
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            this.f75909a.onSuccess(bool);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f75909a.onError(errorResult);
            Log.m165383e(CalendarCreatorModel.f75888b.mo109484a(), "saveCalendarWithMemberRequest Err");
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109457a(int i) {
        this.f75889c.setBackgroundColor(i);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: b */
    public void mo109470b(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        this.f75889c = calendar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109459a(Calendar.AccessRole accessRole) {
        Intrinsics.checkParameterIsNotNull(accessRole, "accessRole");
        this.f75889c.setDefaultAccessRole(accessRole);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: b */
    public void mo109471b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        this.f75889c.setDescription(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel$addCalendarMembersByIds$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$b */
    public static final class C30302b implements IGetDataCallback<List<? extends CalendarMember>> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorModel f75894a;

        /* renamed from: b */
        final /* synthetic */ int f75895b;

        /* renamed from: c */
        final /* synthetic */ IGetDataCallback f75896c;

        /* renamed from: d */
        final /* synthetic */ String f75897d;

        /* renamed from: e */
        final /* synthetic */ String f75898e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f75896c.onError(errorResult);
            Log.m165383e(CalendarCreatorModel.f75888b.mo109484a(), C32673y.m125370a(this.f75897d, this.f75898e, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarMember> list) {
            List<? extends CalendarMember> list2 = list;
            if (!CollectionUtils.isNotEmpty(list2)) {
                return;
            }
            if (this.f75895b == 0) {
                if (list == null) {
                    Intrinsics.throwNpe();
                }
                CalendarMember calendarMember = (CalendarMember) list.get(0);
                calendarMember.setAccessRole(Calendar.AccessRole.OWNER);
                this.f75894a.mo109468b().add(0, calendarMember);
                this.f75896c.onSuccess(this.f75894a.mo109468b());
                return;
            }
            if (list == null) {
                Intrinsics.throwNpe();
            }
            for (CalendarMember calendarMember2 : list) {
                calendarMember2.setAccessRole(Calendar.AccessRole.READER);
            }
            this.f75894a.mo109468b().addAll(this.f75895b, new ArrayList(list2));
            this.f75896c.onSuccess(this.f75894a.mo109468b());
        }

        C30302b(CalendarCreatorModel bVar, int i, IGetDataCallback iGetDataCallback, String str, String str2) {
            this.f75894a = bVar;
            this.f75895b = i;
            this.f75896c = iGetDataCallback;
            this.f75897d = str;
            this.f75898e = str2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel$getCalendarAndMembersWithIds$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWithMembers;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendarWithMembers", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$c */
    public static final class C30303c implements IGetDataCallback<CalendarWithMembers> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorModel f75899a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f75900b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f75900b.onError(errorResult);
            Log.m165383e(CalendarCreatorModel.f75888b.mo109484a(), "getCalendarAndMembersWithIds Err");
        }

        /* renamed from: a */
        public void onSuccess(CalendarWithMembers cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "calendarWithMembers");
            if (cVar.mo120065a() == null || CollectionUtils.isEmpty(cVar.mo120068b())) {
                onError(new ErrorResult("data is null"));
                return;
            }
            Calendar a = cVar.mo120065a();
            if (a != null) {
                this.f75899a.mo109460a(a);
            }
            this.f75899a.mo109468b().addAll(cVar.mo120068b());
            this.f75900b.onSuccess(true);
        }

        C30303c(CalendarCreatorModel bVar, IGetDataCallback iGetDataCallback) {
            this.f75899a = bVar;
            this.f75900b = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$d */
    static final class C30304d implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorModel f75901a;

        C30304d(CalendarCreatorModel bVar) {
            this.f75901a = bVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Calendar a = this.f75901a.mo109456a();
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "it");
            a.setBackgroundColor(CalendarSkinColorTool.m124920a(0, calendarSetting.getSkinType()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel$loadLoginChatter$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$f */
    public static final class C30306f implements IGetDataCallback<AbstractC30026d> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorModel f75905a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f75906b;

        /* renamed from: c */
        final /* synthetic */ String f75907c;

        /* renamed from: d */
        final /* synthetic */ String f75908d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i(CalendarCreatorModel.f75888b.mo109484a(), C32673y.m125370a(this.f75907c, this.f75908d, errorResult));
            IGetDataCallback iGetDataCallback = this.f75906b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(AbstractC30026d dVar) {
            boolean z;
            String a = CalendarCreatorModel.f75888b.mo109484a();
            StringBuilder sb = new StringBuilder();
            sb.append("getLoginChatter async isNull: ");
            if (dVar == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(String.valueOf(z));
            Log.m165389i(a, sb.toString());
            if (dVar != null && !TextUtils.isEmpty(dVar.getId())) {
                CalendarCreatorModel bVar = this.f75905a;
                String id = dVar.getId();
                Intrinsics.checkExpressionValueIsNotNull(id, "data.id");
                bVar.mo109462a(id);
            }
            IGetDataCallback iGetDataCallback = this.f75906b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(dVar);
            }
        }

        C30306f(CalendarCreatorModel bVar, IGetDataCallback iGetDataCallback, String str, String str2) {
            this.f75905a = bVar;
            this.f75906b = iGetDataCallback;
            this.f75907c = str;
            this.f75908d = str2;
        }
    }

    /* renamed from: a */
    public final void mo109460a(Calendar calendar) {
        Intrinsics.checkParameterIsNotNull(calendar, "<set-?>");
        this.f75889c = calendar;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: b */
    public void mo109472b(boolean z) {
        this.f75889c.setIsPublic(z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorModel$loadCalendarById$uiGetDataCallback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "calendars", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.b$e */
    public static final class C30305e implements IGetDataCallback<List<? extends Calendar>> {

        /* renamed from: a */
        final /* synthetic */ String f75902a;

        /* renamed from: b */
        final /* synthetic */ String f75903b;

        /* renamed from: c */
        final /* synthetic */ CalendarCreatorPresenter.IFetchCalendarCallback f75904c;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(CalendarCreatorModel.f75888b.mo109484a(), C32673y.m125370a(this.f75902a, this.f75903b, errorResult));
            CalendarCreatorPresenter.IFetchCalendarCallback dVar = this.f75904c;
            String errorMsg = errorResult.getErrorMsg();
            Intrinsics.checkExpressionValueIsNotNull(errorMsg, "err.errorMsg");
            dVar.mo109527a(errorMsg);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends Calendar> list) {
            String str;
            if (list == null) {
                str = "null";
            } else {
                str = String.valueOf(list.size()) + "";
            }
            Log.m165389i(CalendarCreatorModel.f75888b.mo109484a(), C32673y.m125373a(this.f75902a, this.f75903b, "calendars_size", str));
            if (CollectionUtils.isEmpty(list)) {
                this.f75904c.mo109527a("no calendar");
            } else if (list != null) {
                this.f75904c.mo109526a(list.get(0));
            }
        }

        C30305e(String str, String str2, CalendarCreatorPresenter.IFetchCalendarCallback dVar) {
            this.f75902a = str;
            this.f75903b = str2;
            this.f75904c = dVar;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109458a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String serverId = this.f75889c.getServerId();
        Intrinsics.checkExpressionValueIsNotNull(serverId, "mCalendar.serverId");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118963d(serverId, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: b */
    public void mo109469b(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String serverId = this.f75889c.getServerId();
        Intrinsics.checkExpressionValueIsNotNull(serverId, "mCalendar.serverId");
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(iGetDataCallback);
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…GetDataCallback(callback)");
        aVar.mo118952b(serverId, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: c */
    public void mo109474c(IGetDataCallback<AbstractC30026d> iGetDataCallback) {
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f75887a, C32673y.m125376b(valueOf, "loadLoginChatter", new String[0]));
        C30022a.f74882a.chatModuleDependency().mo108224a((IGetDataCallback) getCallbackManager().wrapAndAddCallback(new C30306f(this, iGetDataCallback, valueOf, "loadLoginChatter")));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: d */
    public void mo109476d(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f75890d);
        arrayList.addAll(this.f75891e);
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30307g(iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        CalendarSDKService.f83473a.mo118928a(this.f75889c, arrayList, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109461a(CalendarMember calendarMember) {
        Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
        calendarMember.setStatus(Calendar.Status.REMOVED);
        this.f75891e.add(calendarMember);
    }

    /* renamed from: a */
    public final void mo109462a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f75893g = str;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109463a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "viewCallBack");
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30303c(this, iGetDataCallback));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        CalendarSDKService.f83473a.mo118946a(arrayList, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109464a(String str, CalendarCreatorPresenter.IFetchCalendarCallback<Calendar> dVar) {
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(f75887a, C32673y.m125376b(valueOf, "getCalendarById", "calendar_ids", str));
        C32583e.m124816a().mo119039a(CollectionsKt.listOf(str), getCallbackManager().wrapAndAddGetDataCallback(new C30305e(valueOf, "getCalendarById", dVar)));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109466a(List<String> list, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "attendeeIds");
        Intrinsics.checkParameterIsNotNull(list2, "groupIds");
        if (!CollectionUtils.isEmpty(this.f75891e)) {
            Iterator<CalendarMember> it = this.f75891e.iterator();
            while (it.hasNext()) {
                CalendarMember next = it.next();
                if ((next.getMemberType() == CalendarMember.CalendarMemberType.GROUP && list2.contains(next.getChatId())) || (next.getMemberType() == CalendarMember.CalendarMemberType.INDIVIDUAL && list.contains(next.getUserId()))) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorModel
    /* renamed from: a */
    public void mo109465a(String str, List<String> list, List<String> list2, int i, IGetDataCallback<List<CalendarMember>> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(str, "calendarServerId");
        Intrinsics.checkParameterIsNotNull(list, "userIds");
        Intrinsics.checkParameterIsNotNull(list2, "chatIds");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String valueOf = String.valueOf(new Date().getTime());
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30302b(this, i, iGetDataCallback, valueOf, "addCalendarMembersById"));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…         }\n            })");
        aVar.mo118942a(str, list, list2, wrapAndAddGetDataCallback);
    }
}
