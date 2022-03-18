package com.ss.android.lark.calendar.impl.features.preempt;

import android.os.Bundle;
import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.preempt.PreemptContract;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnLoadMeetingRoomData;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnPreemptMeetingRoom;
import com.ss.android.lark.calendar.impl.features.preempt.listener.OnSaveNeedPopUpWindow;
import com.ss.android.lark.calendar.impl.features.preempt.model.GetResourceWithTokenUnit;
import com.ss.android.lark.calendar.impl.features.preempt.model.SheetItemData;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarBuilding;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001@B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u0007H\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0010H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u000bH\u0016J\b\u0010(\u001a\u00020\u000bH\u0016J\u0018\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,H\u0016J\b\u0010-\u001a\u00020\u0018H\u0016J\b\u0010.\u001a\u00020\u0018H\u0016J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u000bH\u0002J\u0010\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000bH\u0002J\b\u00103\u001a\u00020\u0010H\u0016J\b\u00104\u001a\u00020\u0010H\u0016J\b\u00105\u001a\u00020\u0010H\u0016J\u0018\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020\u000b2\u0006\u0010!\u001a\u000208H\u0016J\u0018\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020\u00102\u0006\u0010!\u001a\u00020;H\u0016J \u0010<\u001a\u00020 2\u0016\u0010=\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,H\u0002J\u0010\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020\u0014H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptModel;", "Lcom/larksuite/framework/mvp/BaseModel;", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel;", "extras", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "mAllDayEventInstance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "mBuilding", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarBuilding;", "mCurrentProgress", "", "mCurrentTimestamp", "mEventInstanceList", "", "mIsFirstCalculate", "", "mMeetingRoom", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarResource;", "mModelDelegate", "Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptContract$IPreemptModel$ModelDelegate;", "mNeedPopUp", "mPreviousProgress", "mResourceId", "", "mSeizeTime", "mSpareEndTime", "mSpareStartTime", "getAllDayTimeStr", "getIsInInstanceDuration", "instance", "getMeetingRoomData", "", "callback", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnLoadMeetingRoomData;", "getMeetingRoomName", "getNeedShowPopup", "getOriginalAttendee", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "getProgressSpareTime", "getSeizeTime", "getSheetItems", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/SheetItemData;", "Lkotlin/collections/ArrayList;", "getSpareEndTimeStr", "getSpareTime", "getTimeDurationStr", "duration", "getTimeStampSecondToZero", "timeStamp", "isAllDayEventInstance", "isMeetingRoomAvailable", "isProgressSpareStatusChanged", "preemptMeetingRoom", "endTime", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnPreemptMeetingRoom;", "saveSeizeResourceWethereNeedPopUp", "needPopUp", "Lcom/ss/android/lark/calendar/impl/features/preempt/listener/OnSaveNeedPopUpWindow;", "setCheckForSheetList", "sheetList", "setModelDelegate", "modelDelegate", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b */
public final class PreemptModel extends BaseModel implements PreemptContract.IPreemptModel {

    /* renamed from: g */
    public static final Companion f82424g = new Companion(null);

    /* renamed from: a */
    public CalendarResource f82425a;

    /* renamed from: b */
    public CalendarBuilding f82426b;

    /* renamed from: c */
    public List<? extends CalendarEventInstance> f82427c;

    /* renamed from: d */
    public long f82428d;

    /* renamed from: e */
    public long f82429e;

    /* renamed from: f */
    public boolean f82430f = true;

    /* renamed from: h */
    private String f82431h;

    /* renamed from: i */
    private CalendarEventInstance f82432i;

    /* renamed from: j */
    private long f82433j;

    /* renamed from: k */
    private long f82434k;

    /* renamed from: l */
    private long f82435l = -1;

    /* renamed from: m */
    private long f82436m = -1;

    /* renamed from: n */
    private boolean f82437n = true;

    /* renamed from: o */
    private PreemptContract.IPreemptModel.ModelDelegate f82438o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/preempt/PreemptModel$Companion;", "", "()V", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: b */
    public boolean mo117804b() {
        return this.f82430f;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: j */
    public long mo117812j() {
        return this.f82428d * ((long) 1000);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: g */
    public CalendarEventCreator mo117809g() {
        CalendarEventInstance calendarEventInstance = this.f82432i;
        if (calendarEventInstance == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAllDayEventInstance");
        }
        CalendarEventCreator eventCreator = calendarEventInstance.getEventCreator();
        Intrinsics.checkExpressionValueIsNotNull(eventCreator, "mAllDayEventInstance.eventCreator");
        return eventCreator;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: k */
    public long mo117813k() {
        long j;
        long j2 = this.f82433j;
        long j3 = this.f82429e;
        if (j2 <= j3) {
            j = 0;
        } else {
            j = (j2 - j3) * ((long) 1000);
        }
        this.f82436m = j;
        return j;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: e */
    public String mo117807e() {
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Takeover_AlldayTIme, "Date", C32646c.m125254a(new CalendarDate().getTimeInMilliSeconds(), TimeZone.getDefault(), C32634ae.m125182b(R.string.Calendar_StandardTime_MonthDayCombineFormat)));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…dayTIme, \"Date\", dateStr)");
        return a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: h */
    public String mo117810h() {
        String a = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Takeover_Next, "NextStartTime", C32646c.m125255a(this.f82434k * ((long) 1000), TimeZone.getDefault(), false));
        Intrinsics.checkExpressionValueIsNotNull(a, "CalendarDependencyHolder…one.getDefault(), false))");
        return a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: l */
    public boolean mo117814l() {
        boolean z = false;
        if (this.f82437n) {
            this.f82437n = false;
            this.f82435l = this.f82436m;
            return false;
        }
        long j = this.f82435l;
        if ((j == 0 && this.f82436m != 0) || (j != 0 && this.f82436m == 0)) {
            z = true;
        }
        this.f82435l = this.f82436m;
        return z;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: c */
    public String mo117805c() {
        StringBuilder sb = new StringBuilder();
        CalendarResource calendarResource = this.f82425a;
        if (calendarResource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeetingRoom");
        }
        sb.append(calendarResource.getFloorName());
        sb.append("-");
        CalendarResource calendarResource2 = this.f82425a;
        if (calendarResource2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeetingRoom");
        }
        sb.append(calendarResource2.getName());
        sb.append("(");
        CalendarResource calendarResource3 = this.f82425a;
        if (calendarResource3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeetingRoom");
        }
        sb.append(calendarResource3.getCapacity());
        sb.append(") ");
        CalendarBuilding calendarBuilding = this.f82426b;
        if (calendarBuilding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBuilding");
        }
        if (calendarBuilding != null) {
            CalendarBuilding calendarBuilding2 = this.f82426b;
            if (calendarBuilding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mBuilding");
            }
            sb.append(calendarBuilding2.getName());
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "displayText.toString()");
        return sb2;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: f */
    public boolean mo117808f() {
        boolean z;
        CalendarEventInstance calendarEventInstance;
        CalendarDate calendarDate = new CalendarDate();
        List<? extends CalendarEventInstance> list = this.f82427c;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEventInstanceList");
        }
        Iterator<? extends CalendarEventInstance> it = list.iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            calendarEventInstance = (CalendarEventInstance) it.next();
            if (calendarEventInstance.getSelfAttendeeStatus() == CalendarEventAttendee.Status.ACCEPT) {
                long startTime = calendarEventInstance.getStartTime();
                CalendarDate moveToDayStart = calendarDate.moveToDayStart();
                Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "currentDate.moveToDayStart()");
                if (startTime <= moveToDayStart.getTimeInSeconds()) {
                    long endTime = calendarEventInstance.getEndTime();
                    CalendarDate moveToDayEnd = calendarDate.moveToDayEnd();
                    Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "currentDate.moveToDayEnd()");
                    if (endTime >= moveToDayEnd.getTimeInSeconds()) {
                        z = true;
                        continue;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } while (!z);
        this.f82432i = calendarEventInstance;
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0108  */
    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo117806d() {
        /*
        // Method dump skipped, instructions count: 431
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.preempt.PreemptModel.mo117806d():java.lang.String");
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: i */
    public ArrayList<SheetItemData> mo117811i() {
        CalendarDate calendarDate;
        int i;
        ArrayList<SheetItemData> arrayList = new ArrayList<>();
        long j = this.f82434k - this.f82429e;
        SheetItemData bVar = new SheetItemData();
        bVar.mo117871a(this.f82434k);
        long j2 = (long) 1000;
        boolean z = false;
        String a = C32646c.m125255a(this.f82434k * j2, TimeZone.getDefault(), false);
        bVar.mo117875b(j);
        StringBuilder sb = new StringBuilder();
        String str = "NextStartTime";
        sb.append(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Takeover_Next, str, a));
        sb.append(m122901b(bVar.mo117874b()));
        bVar.mo117872a(sb.toString());
        if (j < ((long) 1800)) {
            arrayList.add(bVar);
        } else {
            CalendarDate calendarDate2 = CalendarDate.getCalendarDate(this.f82429e * j2);
            CalendarDate calendarDate3 = CalendarDate.getCalendarDate(this.f82434k * j2);
            Intrinsics.checkExpressionValueIsNotNull(calendarDate3, "moveDate");
            int minute = calendarDate3.getMinute();
            if (minute % 15 == 0) {
                calendarDate = calendarDate3.addMinute(-15);
            } else {
                calendarDate = calendarDate3.addMinute((-minute) % 15);
            }
            while (true) {
                Intrinsics.checkExpressionValueIsNotNull(calendarDate, "moveDate");
                long timeInSeconds = calendarDate.getTimeInSeconds();
                Intrinsics.checkExpressionValueIsNotNull(calendarDate2, "compareDate");
                if (timeInSeconds - calendarDate2.getTimeInSeconds() < ((long) 900)) {
                    break;
                }
                SheetItemData bVar2 = new SheetItemData();
                bVar2.mo117871a(calendarDate.getTimeInSeconds());
                bVar2.mo117873a(z);
                String a2 = C32646c.m125255a(bVar2.mo117870a() * j2, TimeZone.getDefault(), z);
                bVar2.mo117875b(bVar2.mo117870a() - this.f82429e);
                bVar2.mo117872a(C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Takeover_TipsEstimate, str, a2) + m122901b(bVar2.mo117874b()));
                if (arrayList.isEmpty()) {
                    arrayList.add(bVar2);
                    i = -15;
                    z = false;
                } else {
                    z = false;
                    arrayList.add(0, bVar2);
                    i = -15;
                }
                calendarDate = calendarDate.addMinute(i);
                str = str;
            }
            arrayList.add(bVar);
        }
        m122899a(arrayList);
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: a */
    public boolean mo117803a() {
        if (TextUtils.isEmpty(this.f82431h) || StringsKt.equals$default(this.f82431h, "token is empty", false, 2, null)) {
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptModel$preemptMeetingRoom$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEvent;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "event", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b$c */
    public static final class C32231c implements IGetDataCallback<CalendarEvent> {

        /* renamed from: a */
        final /* synthetic */ OnPreemptMeetingRoom f82441a;

        C32231c(OnPreemptMeetingRoom cVar) {
            this.f82441a = cVar;
        }

        /* renamed from: a */
        public void onSuccess(CalendarEvent calendarEvent) {
            Intrinsics.checkParameterIsNotNull(calendarEvent, "event");
            this.f82441a.mo117850a(calendarEvent);
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82441a.mo117849a(errorResult);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptModel$saveSeizeResourceWethereNeedPopUp$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "needPopup", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b$d */
    public static final class C32232d implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ OnSaveNeedPopUpWindow f82442a;

        C32232d(OnSaveNeedPopUpWindow dVar) {
            this.f82442a = dVar;
        }

        /* renamed from: a */
        public void mo117857a(boolean z) {
            this.f82442a.mo117851a();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82442a.mo117852a(errorResult);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
        public /* synthetic */ void onSuccess(Boolean bool) {
            mo117857a(bool.booleanValue());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: a */
    public void mo117800a(PreemptContract.IPreemptModel.ModelDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "modelDelegate");
        this.f82438o = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/preempt/PreemptModel$getMeetingRoomData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/features/preempt/model/GetResourceWithTokenUnit;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "responseUnit", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b$b */
    public static final class C32230b implements IGetDataCallback<GetResourceWithTokenUnit> {

        /* renamed from: a */
        final /* synthetic */ PreemptModel f82439a;

        /* renamed from: b */
        final /* synthetic */ OnLoadMeetingRoomData f82440b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f82440b.mo117848a(errorResult);
        }

        /* renamed from: a */
        public void onSuccess(GetResourceWithTokenUnit aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "responseUnit");
            this.f82439a.f82425a = aVar.mo117858a();
            this.f82439a.f82426b = aVar.mo117864b();
            this.f82439a.f82427c = aVar.mo117866c();
            this.f82439a.f82428d = aVar.mo117867d();
            this.f82439a.f82429e = aVar.mo117868e();
            this.f82439a.f82430f = aVar.mo117869f();
            this.f82440b.mo117847a();
        }

        C32230b(PreemptModel bVar, OnLoadMeetingRoomData bVar2) {
            this.f82439a = bVar;
            this.f82440b = bVar2;
        }
    }

    public PreemptModel(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("preempt_resource_id");
        } else {
            str = null;
        }
        this.f82431h = str;
    }

    /* renamed from: a */
    private final long m122898a(long j) {
        CalendarDate calendarDate = CalendarDate.getCalendarDate(j * ((long) 1000));
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "date");
        calendarDate.setSecond(0);
        return calendarDate.getTimeInSeconds();
    }

    /* renamed from: a */
    private final void m122899a(ArrayList<SheetItemData> arrayList) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == 1) {
                arrayList.get(0).mo117873a(true);
            } else {
                C30022a.f74884c.mo108450a(new C32233e(arrayList));
            }
        }
    }

    /* renamed from: b */
    private final String m122901b(long j) {
        float f = ((float) j) / ((float) 60);
        float f2 = (float) 5;
        float f3 = f % f2;
        float f4 = (f - f3) / ((float) ((long) 5));
        if (((double) f3) >= 2.5d) {
            f4 += (float) 1;
        }
        long j2 = (long) (f2 * f4);
        String str = " (" + C32634ae.m125180a(R.plurals.Calendar_Plural_Duration, (int) j2) + ")";
        Intrinsics.checkExpressionValueIsNotNull(str, "builder.toString()");
        return str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.preempt.b$e */
    public static final class C32233e implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ArrayList f82443a;

        C32233e(ArrayList arrayList) {
            this.f82443a = arrayList;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            int defaultEventDuration = calendarSetting.getDefaultEventDuration() * 60;
            int size = this.f82443a.size();
            long j = Long.MAX_VALUE;
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = this.f82443a.get(i2);
                Intrinsics.checkExpressionValueIsNotNull(obj, "sheetList[i]");
                SheetItemData bVar = (SheetItemData) obj;
                long j2 = (long) defaultEventDuration;
                if (Math.abs(bVar.mo117874b() - j2) < j) {
                    ((SheetItemData) this.f82443a.get(i)).mo117873a(false);
                    bVar.mo117873a(true);
                    j = Math.abs(bVar.mo117874b() - j2);
                    i = i2;
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m122900a(CalendarEventInstance calendarEventInstance) {
        if (this.f82429e < calendarEventInstance.getStartTime() || this.f82429e >= calendarEventInstance.getEndTime()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: a */
    public void mo117801a(OnLoadMeetingRoomData bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "callback");
        String str = this.f82431h;
        if (str != null && !TextUtils.isEmpty(str) && getCallbackManager() != null) {
            CalendarDate calendarDate = new CalendarDate(new Date(), TimeZone.getDefault());
            CalendarDate moveToDayStart = calendarDate.moveToDayStart();
            CalendarDate moveToDayEnd = calendarDate.moveToDayEnd();
            Log.m165389i("PreemptModel", C32673y.m125376b(Long.toString(new Date().getTime()), "getResourceWithToken", new String[0]));
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "startDate");
            long timeInSeconds = moveToDayStart.getTimeInSeconds();
            Intrinsics.checkExpressionValueIsNotNull(moveToDayEnd, "endDate");
            long timeInSeconds2 = moveToDayEnd.getTimeInSeconds();
            UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C32230b(this, bVar));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…     }\n                })");
            aVar.mo118931a(str, timeInSeconds, timeInSeconds2, wrapAndAddGetDataCallback);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: a */
    public void mo117799a(long j, OnPreemptMeetingRoom cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        CalendarResource calendarResource = this.f82425a;
        if (calendarResource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeetingRoom");
        }
        if (TextUtils.isEmpty(calendarResource.getCalendarId())) {
            cVar.mo117849a(new ErrorResult("resourceId is empty"));
        }
        Log.m165389i("PreemptModel", C32673y.m125376b(Long.toString(new Date().getTime()), "preemptMeetingRoom", new String[0]));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        CalendarResource calendarResource2 = this.f82425a;
        if (calendarResource2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMeetingRoom");
        }
        String calendarId = calendarResource2.getCalendarId();
        Intrinsics.checkExpressionValueIsNotNull(calendarId, "mMeetingRoom.calendarId");
        long a = m122898a(this.f82429e);
        long a2 = m122898a(j);
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C32231c(cVar));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…     }\n                })");
        aVar.mo118951b(calendarId, a, a2, wrapAndAddGetDataCallback);
    }

    @Override // com.ss.android.lark.calendar.impl.features.preempt.PreemptContract.IPreemptModel
    /* renamed from: a */
    public void mo117802a(boolean z, OnSaveNeedPopUpWindow dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "callback");
        Log.m165389i("PreemptModel", C32673y.m125376b(Long.toString(new Date().getTime()), "saveSeizeResourceWethereNeedPopUp", new String[0]));
        this.f82430f = z;
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C32232d(dVar));
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callbackManager.wrapAndA…     }\n                })");
        aVar.mo118948a(z, wrapAndAddGetDataCallback);
    }
}
