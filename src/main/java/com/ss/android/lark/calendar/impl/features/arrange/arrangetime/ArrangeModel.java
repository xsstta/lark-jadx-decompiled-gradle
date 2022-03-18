package com.ss.android.lark.calendar.impl.features.arrange.arrangetime;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.data.ArrangeMeetingData;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.model.ArrangeConflictUnit;
import com.ss.android.lark.calendar.impl.features.arrange.base.ArrangeBaseModel;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadEventInstances;
import com.ss.android.lark.calendar.impl.features.arrange.base.OnLoadInsCancelableWrapper;
import com.ss.android.lark.calendar.impl.features.arrange.p1441a.AbstractC30095b;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.DayEventChipViewData;
import com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSpan;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ChatFreeBusyFavor;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.AbstractC30052p;
import com.ss.android.lark.log.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fH\u0016J\u0018\u0010#\u001a\u0012\u0012\u0004\u0012\u00020$0\u000bj\b\u0012\u0004\u0012\u00020$`\fH\u0016J\u0014\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070&H\u0016J\u0018\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fH\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\u0018\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fH\u0016J\b\u0010*\u001a\u00020\u001fH\u0016J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020\u001b2\u0006\u00100\u001a\u000201H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\u0018\u00103\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fH\u0016J\b\u00104\u001a\u00020\u0019H\u0016J\b\u00105\u001a\u00020,H\u0016J\b\u00106\u001a\u00020.H\u0016J\b\u00107\u001a\u000208H\u0016J\u0014\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020:0&H\u0016J \u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020,2\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u0019H\u0002J\u0010\u0010?\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010A\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u0004H\u0002J\b\u0010B\u001a\u00020\u0012H\u0016J\u0010\u0010C\u001a\u00020\u00122\u0006\u0010@\u001a\u00020DH\u0002J\b\u0010E\u001a\u00020\u0012H\u0016J\b\u0010F\u001a\u00020\u0012H\u0016J&\u0010G\u001a\u00020\u001b2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070I2\u000e\u0010J\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010KH\u0016J\u0018\u0010L\u001a\u00020\u001b2\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010KH\u0016J\u0010\u0010N\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010O\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020\u0004H\u0002J\u0010\u0010P\u001a\u00020\u001b2\u0006\u0010Q\u001a\u00020\u0010H\u0016J\u0010\u0010R\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020,H\u0016J\u0018\u0010T\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u0019H\u0016J\u0010\u0010W\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020\u0007H\u0016J\b\u0010Y\u001a\u00020\u001bH\u0002J \u0010Z\u001a\u00020\u001b2\u0016\u0010H\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fH\u0002J\u0016\u0010[\u001a\u00020\u001b2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070IH\u0002J\u0010\u0010\\\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u0019H\u0016J$\u0010^\u001a\u00020\u001b2\u001a\u0010H\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX.¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000bj\b\u0012\u0004\u0012\u00020\u0007`\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel;", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/ArrangeBaseModel;", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel;", "extras", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)V", "TAG", "", "mArrangeMeetingData", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/data/ArrangeMeetingData;", "mBothConflictList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mChatId", "mConflictList", "mDelegate", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeContract$IArrangeModel$ModelDelegate;", "mIsFromP2P", "", "mLanguageDependency", "Lcom/ss/android/lark/calendar/dependency/idependency/ILanguageDependency;", "mOrderedChatterIds", "mOutWorkHourList", "mSelectedChatterIds", "mSource", "", "clearAllAttendees", "", "create", "createHasOutWorkHourUnit", "conflictUnit", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/model/ArrangeConflictUnit;", "createWithoutWorkHourUnit", "getArrangeMeetingData", "getAttendeeChatterIds", "getAttendeeList", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/IArrangeBaseData;", "getAttendeeTimeZoneMap", "", "getBothConflictList", "getChatId", "getConflictList", "getConflictResult", "getEndDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getEndTime", "", "getEventInstanceData", "callback", "Lcom/ss/android/lark/calendar/impl/features/arrange/base/OnLoadEventInstances;", "getOrganizerCalendarId", "getOutWorkHourList", "getSource", "getStartDate", "getStartTime", "getViewTimeZone", "Ljava/util/TimeZone;", "getWorkHourMap", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarWorkHourSetting;", "hasOutWorkHour", "startDate", "startMinute", "endMinute", "initDataForArrangeMeeting", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "initEndTime", "isAlwaysShowChipAndFooter", "isBusyWithEventChip", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/DayEventChipViewData;", "isFromP2P", "isLoadDataError", "loadAttendee", "chatterIds", "", "originCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "loadChatArrangeOriginData", "viewCallback", "parseAppendData", "parseChatData", "setModelDelegate", "delegate", "setStartEndDate", "selectDate", "setStartEndDayMinutes", "startDayMinutes", "endDayMinutes", "setViewTimeZone", "timeZoneId", "sort4OrganizerAndCreator", "sortChatterIds", "updateChatterIds", "updateIndexToLeft", "index", "updateSelectedChatterIds", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.c */
public final class ArrangeModel extends ArrangeBaseModel implements ArrangeContract.IArrangeModel {

    /* renamed from: a */
    public final String f75377a = "ArrangeModel";

    /* renamed from: b */
    public String f75378b = "";

    /* renamed from: c */
    public ArrayList<String> f75379c = new ArrayList<>();

    /* renamed from: d */
    public ArrayList<String> f75380d = new ArrayList<>();

    /* renamed from: e */
    public ArrangeContract.IArrangeModel.ModelDelegate f75381e;

    /* renamed from: g */
    private AbstractC30052p f75382g;

    /* renamed from: h */
    private ArrayList<String> f75383h;

    /* renamed from: i */
    private ArrayList<String> f75384i;

    /* renamed from: j */
    private ArrayList<String> f75385j;

    /* renamed from: k */
    private int f75386k = 1;

    /* renamed from: l */
    private boolean f75387l;

    /* renamed from: m */
    private ArrangeMeetingData f75388m = new ArrangeMeetingData(null, false, false, 7, null);

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: n */
    public ArrayList<String> mo108864n() {
        return this.f75380d;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: o */
    public int mo108865o() {
        return this.f75386k;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: p */
    public boolean mo108866p() {
        return this.f75387l;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: q */
    public String mo108867q() {
        return this.f75378b;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: t */
    public ArrangeMeetingData mo108870t() {
        return this.f75388m;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108848a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        long w = (mo108489w() - mo108488v()) / ((long) 60);
        CalendarDate calendarDate2 = new CalendarDate(mo108490x());
        long j = (long) 1000;
        calendarDate2.setTimeInMillis(mo108488v() * j);
        int dayMinutes = calendarDate2.getDayMinutes();
        calendarDate2.setJulianDay(calendarDate.getJulianDay());
        calendarDate2.setDayMinutes(dayMinutes);
        mo108473a(calendarDate2.getTimeInSeconds());
        calendarDate2.setTimeInMillis(mo108489w() * j);
        calendarDate2.setJulianDay(calendarDate.getJulianDay());
        calendarDate2.setDayMinutes(dayMinutes + ((int) w));
        mo108478b(calendarDate2.getTimeInSeconds());
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108851a(List<String> list, IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(list, "chatterIds");
        String valueOf = String.valueOf(new Date().getTime());
        Log.m165389i(this.f75377a, C32673y.m125376b(valueOf, "loadAttends", "chat_id", this.f75378b));
        C32533b.m124620a().mo118880b(list, getCallbackManager().wrapAndAddGetDataCallback(new C30185b(this, valueOf, "loadAttends", list, iGetDataCallback)));
    }

    /* renamed from: a */
    public final void mo108932a(List<String> list) {
        this.f75380d = new ArrayList<>(list);
        Iterator<String> it = this.f75379c.iterator();
        Intrinsics.checkExpressionValueIsNotNull(it, "mOrderedChatterIds.iterator()");
        while (it.hasNext()) {
            String next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "orderedChatterIdsIt.next()");
            if (!this.f75380d.contains(next)) {
                it.remove();
            }
        }
        if (this.f75386k != 3) {
            CalendarSDKService.f83473a.mo118941a(this.f75378b, this.f75379c, this.f75380d);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108849a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
        if (C30022a.f74883b.mo112695c()) {
            long j = (long) 1000;
            CalendarDate calendarDate = new CalendarDate(new Date(mo108488v() * j), mo108490x());
            CalendarDate calendarDate2 = new CalendarDate(new Date(mo108489w() * j), mo108490x());
            TimeZone timeZone = TimeZone.getTimeZone(str);
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
            mo108475a(timeZone);
            mo108473a(new CalendarDate(calendarDate, mo108490x()).getTimeInSeconds());
            mo108478b(new CalendarDate(calendarDate2, mo108490x()).getTimeInSeconds());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108845a(IGetDataCallback<Boolean> iGetDataCallback) {
        if (!(this.f75378b.length() == 0)) {
            String valueOf = String.valueOf(new Date().getTime());
            Log.m165389i(this.f75377a, C32673y.m125376b(valueOf, "loadChatterAndGotoActivity", "chat_id", this.f75378b));
            UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30186c(this, valueOf, "loadChatterAndGotoActivity", iGetDataCallback));
            CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
            String str = this.f75378b;
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
            aVar.mo118970i(str, wrapAndAddGetDataCallback);
        } else if (iGetDataCallback != null) {
            iGetDataCallback.onError(new ErrorResult("chat id is empty"));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public ArrayList<AbstractC30095b> mo108842a() {
        return mo108487u();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: b */
    public TimeZone mo108852b() {
        return mo108490x();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: c */
    public long mo108853c() {
        return mo108488v();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: d */
    public long mo108854d() {
        return mo108489w();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: k */
    public boolean mo108861k() {
        return mo108491y();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: l */
    public Map<String, String> mo108862l() {
        return mo108469D();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: m */
    public Map<String, CalendarWorkHourSetting> mo108863m() {
        return mo108470E();
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: h */
    public ArrayList<String> mo108858h() {
        ArrayList<String> arrayList = this.f75383h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConflictList");
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: i */
    public ArrayList<String> mo108859i() {
        ArrayList<String> arrayList = this.f75384i;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutWorkHourList");
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: j */
    public ArrayList<String> mo108860j() {
        ArrayList<String> arrayList = this.f75385j;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBothConflictList");
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: s */
    public boolean mo108869s() {
        int i = this.f75386k;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: e */
    public CalendarDate mo108855e() {
        return new CalendarDate(new Date(mo108488v() * ((long) 1000)), mo108490x());
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: f */
    public CalendarDate mo108856f() {
        return new CalendarDate(new Date(mo108489w() * ((long) 1000)), mo108490x());
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: r */
    public void mo108868r() {
        this.f75379c.clear();
        this.f75380d.clear();
        mo108487u().clear();
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        AbstractC30052p languageDependency = C30022a.f74882a.languageDependency();
        Intrinsics.checkExpressionValueIsNotNull(languageDependency, "CalendarDependencyHolder…ency.languageDependency()");
        this.f75382g = languageDependency;
        this.f75383h = new ArrayList<>();
        this.f75384i = new ArrayList<>();
        this.f75385j = new ArrayList<>();
        if (this.f75386k == 1) {
            m111947H();
        }
    }

    /* renamed from: H */
    private final void m111947H() {
        C30810k a = C30810k.m114955a();
        Intrinsics.checkExpressionValueIsNotNull(a, "LoginInfoManager.getInstance()");
        String c = a.mo111644c();
        if (c == null) {
            c = "";
        }
        String[] strArr = {c, mo108467B()};
        for (int i = 0; i < 2; i++) {
            String str = strArr[i];
            Iterator<AbstractC30095b> it = mo108487u().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC30095b next = it.next();
                if (str.equals(next.getAttendeeCalendarId())) {
                    mo108487u().remove(next);
                    mo108487u().add(0, next);
                    break;
                }
            }
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: g */
    public ArrangeConflictUnit mo108857g() {
        ArrangeConflictUnit arrangeConflictUnit = new ArrangeConflictUnit();
        ArrayList<String> arrayList = this.f75383h;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConflictList");
        }
        arrayList.clear();
        ArrayList<String> arrayList2 = this.f75384i;
        if (arrayList2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutWorkHourList");
        }
        arrayList2.clear();
        ArrayList<String> arrayList3 = this.f75385j;
        if (arrayList3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBothConflictList");
        }
        arrayList3.clear();
        String b = C32634ae.m125182b(R.string.Calendar_Edit_AllFree);
        Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Edit_AllFree)");
        arrangeConflictUnit.setConflictStr(b);
        arrangeConflictUnit.setConflictColor(ArrangeConflictUnit.ConflictColor.GRAY);
        if (mo108488v() > mo108489w()) {
            return arrangeConflictUnit;
        }
        if (mo108491y()) {
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_FindTimeFailed);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.stri…ndar_Edit_FindTimeFailed)");
            arrangeConflictUnit.setConflictStr(b2);
            return arrangeConflictUnit;
        }
        CalendarDate calendarDate = new CalendarDate(mo108490x());
        long j = (long) 1000;
        calendarDate.setTimeInMillis(mo108488v() * j);
        int hour = (calendarDate.getHour() * 60) + calendarDate.getMinute();
        CalendarDate calendarDate2 = new CalendarDate(mo108490x());
        calendarDate2.setTimeInMillis(mo108489w() * j);
        int hour2 = (calendarDate2.getHour() * 60) + calendarDate2.getMinute();
        if (hour2 == 0 && hour > 0) {
            hour2 = CalendarWorkHourUtil.f83805a;
        }
        if (m111950a(calendarDate, hour, hour2)) {
            m111949a(arrangeConflictUnit);
            return arrangeConflictUnit;
        }
        m111953b(arrangeConflictUnit);
        return arrangeConflictUnit;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel$sortChatterIds$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "sortedChatterIds", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.c$d */
    public static final class C30187d implements IGetDataCallback<List<? extends String>> {

        /* renamed from: a */
        final /* synthetic */ ArrangeModel f75399a;

        /* renamed from: b */
        final /* synthetic */ String f75400b;

        /* renamed from: c */
        final /* synthetic */ String f75401c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel$sortChatterIds$callback$1$onSuccess$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.c$d$a */
        public static final class C30188a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C30187d f75402a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30188a(C30187d dVar) {
                this.f75402a = dVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ArrangeContract.IArrangeModel.ModelDelegate aVar = this.f75402a.f75399a.f75381e;
                if (aVar != null) {
                    aVar.mo108871a();
                }
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f75399a.f75377a, C32673y.m125370a(this.f75400b, this.f75401c, errorResult));
        }

        /* renamed from: a */
        public void onSuccess(List<String> list) {
            Integer num;
            String str = this.f75399a.f75377a;
            String str2 = this.f75400b;
            String str3 = this.f75401c;
            String[] strArr = new String[2];
            strArr[0] = "sortedChatterIds";
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = null;
            }
            strArr[1] = String.valueOf(num);
            Log.m165389i(str, C32673y.m125373a(str2, str3, strArr));
            if (list != null) {
                this.f75399a.mo108851a(list, new C30188a(this));
            }
        }

        C30187d(ArrangeModel cVar, String str, String str2) {
            this.f75399a = cVar;
            this.f75400b = str;
            this.f75401c = str2;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108847a(ArrangeContract.IArrangeModel.ModelDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f75381e = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "setting", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting;", "kotlin.jvm.PlatformType", "onGetSucceed"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.c$a */
    public static final class C30184a implements C30086b.AbstractC30090a {

        /* renamed from: a */
        final /* synthetic */ ArrangeModel f75389a;

        C30184a(ArrangeModel cVar) {
            this.f75389a = cVar;
        }

        @Override // com.ss.android.lark.calendar.impl.p1437b.p1439b.C30086b.AbstractC30090a
        public final void onGetSucceed(CalendarSetting calendarSetting) {
            Intrinsics.checkExpressionValueIsNotNull(calendarSetting, "setting");
            int defaultEventDuration = calendarSetting.getDefaultEventDuration();
            ArrangeModel cVar = this.f75389a;
            cVar.mo108478b(cVar.mo108488v() + ((long) (defaultEventDuration * 60)));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001c\u0010\t\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel$loadAttendee$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventAttendee;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatterIdAttendeeMap", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.c$b */
    public static final class C30185b implements IGetDataCallback<Map<String, ? extends CalendarEventAttendee>> {

        /* renamed from: a */
        final /* synthetic */ ArrangeModel f75390a;

        /* renamed from: b */
        final /* synthetic */ String f75391b;

        /* renamed from: c */
        final /* synthetic */ String f75392c;

        /* renamed from: d */
        final /* synthetic */ List f75393d;

        /* renamed from: e */
        final /* synthetic */ IGetDataCallback f75394e;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f75390a.f75377a, C32673y.m125370a(this.f75391b, this.f75392c, errorResult));
            IGetDataCallback iGetDataCallback = this.f75394e;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(Map<String, ? extends CalendarEventAttendee> map) {
            Intrinsics.checkParameterIsNotNull(map, "chatterIdAttendeeMap");
            Log.m165389i(this.f75390a.f75377a, C32673y.m125373a(this.f75391b, this.f75392c, new String[0]));
            this.f75390a.mo108932a(this.f75393d);
            this.f75390a.mo108487u().clear();
            Iterator<T> it = this.f75390a.f75379c.iterator();
            while (it.hasNext()) {
                CalendarEventAttendee calendarEventAttendee = (CalendarEventAttendee) map.get(it.next());
                if (calendarEventAttendee != null) {
                    this.f75390a.mo108487u().add(calendarEventAttendee);
                }
            }
            for (T t : this.f75390a.f75380d) {
                CalendarEventAttendee calendarEventAttendee2 = (CalendarEventAttendee) map.get(t);
                if (!this.f75390a.f75379c.contains(t) && calendarEventAttendee2 != null) {
                    this.f75390a.mo108487u().add(calendarEventAttendee2);
                }
            }
            this.f75390a.mo108471F();
            IGetDataCallback iGetDataCallback = this.f75394e;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(true);
            }
        }

        C30185b(ArrangeModel cVar, String str, String str2, List list, IGetDataCallback iGetDataCallback) {
            this.f75390a = cVar;
            this.f75391b = str;
            this.f75392c = str2;
            this.f75393d = list;
            this.f75394e = iGetDataCallback;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/arrange/arrangetime/ArrangeModel$loadChatArrangeOriginData$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/ChatFreeBusyFavor;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatFreeBusyFavor", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangetime.c$c */
    public static final class C30186c implements IGetDataCallback<ChatFreeBusyFavor> {

        /* renamed from: a */
        final /* synthetic */ ArrangeModel f75395a;

        /* renamed from: b */
        final /* synthetic */ String f75396b;

        /* renamed from: c */
        final /* synthetic */ String f75397c;

        /* renamed from: d */
        final /* synthetic */ IGetDataCallback f75398d;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e(this.f75395a.f75377a, C32673y.m125370a(this.f75396b, this.f75397c, errorResult));
            IGetDataCallback iGetDataCallback = this.f75398d;
            if (iGetDataCallback != null) {
                iGetDataCallback.onError(errorResult);
            }
        }

        /* renamed from: a */
        public void onSuccess(ChatFreeBusyFavor dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "chatFreeBusyFavor");
            Log.m165389i(this.f75395a.f75377a, C32673y.m125373a(this.f75396b, this.f75397c, new String[0]));
            if (!Intrinsics.areEqual(dVar.mo120072a(), this.f75395a.f75378b)) {
                onError(new ErrorResult("data error"));
                return;
            }
            this.f75395a.f75379c = dVar.mo120073b();
            this.f75395a.f75380d = dVar.mo120074c();
            ArrangeModel cVar = this.f75395a;
            cVar.mo108851a(cVar.f75380d, this.f75398d);
        }

        C30186c(ArrangeModel cVar, String str, String str2, IGetDataCallback iGetDataCallback) {
            this.f75395a = cVar;
            this.f75396b = str;
            this.f75397c = str2;
            this.f75398d = iGetDataCallback;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108846a(OnLoadEventInstances cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        OnLoadInsCancelableWrapper dVar = new OnLoadInsCancelableWrapper(cVar);
        getCallbackManager().addCancelableCallback(dVar);
        mo108479b(dVar);
    }

    /* renamed from: b */
    private final void m111952b(Bundle bundle) {
        mo108473a(bundle.getLong("event_start_time", new CalendarDate().getTimeInMilliSeconds() / ((long) 1000)));
        m111956d(bundle);
        String string = bundle.getString("chat_id", "");
        Intrinsics.checkExpressionValueIsNotNull(string, "data.getString(\n        …g.KEY_PARAMS_CHAT_ID, \"\")");
        this.f75378b = string;
        this.f75387l = bundle.getBoolean("arrange_is_from_p2p", false);
        m111954c(bundle);
    }

    /* renamed from: c */
    private final void m111954c(Bundle bundle) {
        if (this.f75386k == 3) {
            ArrangeMeetingData aVar = this.f75388m;
            String string = bundle.getString("event_summary", "");
            Intrinsics.checkExpressionValueIsNotNull(string, "data.getString(\n        …ig.KEY_EVENT_SUMMARY, \"\")");
            aVar.mo108908a(string);
            this.f75388m.mo108910b(bundle.getBoolean("calendar_is_meeting_chat", false));
            this.f75388m.mo108909a(bundle.getBoolean("calendar_arrange_meeting_is_at_all", false));
            ArrayList<String> stringArrayList = bundle.getStringArrayList("calendar_arrange_selected_chatter_ids");
            if (stringArrayList != null) {
                Intrinsics.checkExpressionValueIsNotNull(stringArrayList, "it");
                this.f75380d = stringArrayList;
            }
        }
    }

    /* renamed from: d */
    private final void m111956d(Bundle bundle) {
        long j = bundle.getLong("event_end_time", -1);
        if (j == -1 || j < mo108488v()) {
            C30022a.f74884c.mo108450a(new C30184a(this));
        } else {
            mo108478b(j);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108850a(ArrayList<String> arrayList) {
        if (arrayList != null) {
            m111955c(arrayList);
        }
    }

    public ArrangeModel(Bundle bundle) {
        if (bundle != null) {
            int i = bundle.getInt("calendar_arrange_source", 1);
            this.f75386k = i;
            if (i == 1) {
                m111948a(bundle);
            } else if (i == 2 || i == 3) {
                m111952b(bundle);
            }
        }
    }

    /* renamed from: a */
    private final boolean m111951a(DayEventChipViewData dayEventChipViewData) {
        long j;
        long j2;
        if (dayEventChipViewData.isAllDay()) {
            long j3 = (long) 1000;
            j2 = dayEventChipViewData.getStartTime() - ((long) (TimeZone.getDefault().getOffset(dayEventChipViewData.getStartTime() * j3) / 1000));
            j = dayEventChipViewData.getEndTime() - ((long) (TimeZone.getDefault().getOffset(dayEventChipViewData.getEndTime() * j3) / 1000));
        } else {
            j2 = dayEventChipViewData.getStartTime();
            j = dayEventChipViewData.getEndTime();
        }
        if (mo108489w() <= j2 || mo108488v() >= j) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final void m111955c(ArrayList<String> arrayList) {
        String l = Long.toString(new Date().getTime());
        Log.m165389i(this.f75377a, C32673y.m125376b(l, "sortChatterIds", "chatterIds.size", String.valueOf(arrayList.size())));
        UIGetDataCallback wrapAndAddGetDataCallback = getCallbackManager().wrapAndAddGetDataCallback(new C30187d(this, l, "sortChatterIds"));
        CalendarSDKService.Companion aVar = CalendarSDKService.f83473a;
        String str = this.f75378b;
        Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "callback");
        aVar.mo118940a(str, arrayList, wrapAndAddGetDataCallback);
    }

    /* renamed from: a */
    private final void m111948a(Bundle bundle) {
        Serializable serializable = bundle.getSerializable("calendar_append_arrange_attendee");
        if (serializable != null) {
            mo108481b((ArrayList) serializable);
            mo108473a(bundle.getLong("event_start_time", 0));
            mo108478b(bundle.getLong("event_end_time", 0));
            String string = bundle.getString("arrange_time_zone_id", "");
            String string2 = bundle.getString("organizer_calendar_id", "");
            Intrinsics.checkExpressionValueIsNotNull(string2, "data.getString(\n        …RGANIZER_CALENDAR_ID, \"\")");
            mo108480b(string2);
            String string3 = bundle.getString("event_instance_key", "null");
            Intrinsics.checkExpressionValueIsNotNull(string3, "data.getString(\n        …ENT_INSTANCE_KEY, \"null\")");
            mo108485c(string3);
            String string4 = bundle.getString("event_server_id", "null");
            Intrinsics.checkExpressionValueIsNotNull(string4, "data.getString(\n        …_EVENT_SERVER_ID, \"null\")");
            mo108486d(string4);
            mo108484c(bundle.getLong("event_original_time", -1));
            if (!TextUtils.isEmpty(string)) {
                TimeZone timeZone = TimeZone.getTimeZone(string);
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getTimeZone(timeZoneId)");
                mo108475a(timeZone);
            }
            mo108471F();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.ArrayList<com.ss.android.lark.calendar.impl.features.arrange.base.IArrangeBaseData> /* = java.util.ArrayList<com.ss.android.lark.calendar.impl.features.arrange.base.IArrangeBaseData> */");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private final void m111949a(ArrangeConflictUnit arrangeConflictUnit) {
        arrangeConflictUnit.setShowInWorkHourFormat(true);
        arrangeConflictUnit.setHasOutWorkHourAttendee(true);
        Set<Map.Entry<String, ArrayList<DayEventChipViewData>>> entrySet = mo108468C().entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet, "mEventChipViewDataMap.entries");
        boolean z = false;
        for (T t : entrySet) {
            Iterator it = ((ArrayList) t.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DayEventChipViewData dayEventChipViewData = (DayEventChipViewData) it.next();
                Intrinsics.checkExpressionValueIsNotNull(dayEventChipViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (m111951a(dayEventChipViewData)) {
                    ArrayList<String> arrayList = this.f75384i;
                    if (arrayList == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mOutWorkHourList");
                    }
                    if (arrayList.contains(t.getKey())) {
                        ArrayList<String> arrayList2 = this.f75384i;
                        if (arrayList2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mOutWorkHourList");
                        }
                        arrayList2.remove(t.getKey());
                        ArrayList<String> arrayList3 = this.f75385j;
                        if (arrayList3 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBothConflictList");
                        }
                        arrayList3.add(t.getKey());
                    } else {
                        ArrayList<String> arrayList4 = this.f75383h;
                        if (arrayList4 == 0) {
                            Intrinsics.throwUninitializedPropertyAccessException("mConflictList");
                        }
                        arrayList4.add(t.getKey());
                    }
                    z = true;
                }
            }
        }
        arrangeConflictUnit.setHasBusyAttendee(z);
        ArrayList<String> arrayList5 = this.f75384i;
        if (arrayList5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOutWorkHourList");
        }
        int size = arrayList5.size();
        ArrayList<String> arrayList6 = this.f75383h;
        if (arrayList6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mConflictList");
        }
        int size2 = size + arrayList6.size();
        ArrayList<String> arrayList7 = this.f75385j;
        if (arrayList7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBothConflictList");
        }
        arrangeConflictUnit.setConflictGuestNum(size2 + arrayList7.size());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: java.util.ArrayList<java.lang.String> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    private final void m111953b(ArrangeConflictUnit arrangeConflictUnit) {
        int i = 0;
        arrangeConflictUnit.setShowInWorkHourFormat(false);
        int size = mo108487u().size();
        ArrayList arrayList = new ArrayList();
        Set<Map.Entry<String, ArrayList<DayEventChipViewData>>> entrySet = mo108468C().entrySet();
        Intrinsics.checkExpressionValueIsNotNull(entrySet, "mEventChipViewDataMap.entries");
        int i2 = 0;
        for (T t : entrySet) {
            Iterator it = ((ArrayList) t.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DayEventChipViewData dayEventChipViewData = (DayEventChipViewData) it.next();
                Intrinsics.checkExpressionValueIsNotNull(dayEventChipViewData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
                if (m111951a(dayEventChipViewData)) {
                    ArrayList<String> arrayList2 = this.f75383h;
                    if (arrayList2 == 0) {
                        Intrinsics.throwUninitializedPropertyAccessException("mConflictList");
                    }
                    arrayList2.add(t.getKey());
                    arrayList.add(String.valueOf(mo108492z().get(t.getKey())));
                    i2++;
                }
            }
        }
        if (i2 == 0) {
            String b = C32634ae.m125182b(R.string.Calendar_Edit_AllFree);
            Intrinsics.checkExpressionValueIsNotNull(b, "ResUtil.getString(R.string.Calendar_Edit_AllFree)");
            arrangeConflictUnit.setConflictStr(b);
            arrangeConflictUnit.setConflictColor(ArrangeConflictUnit.ConflictColor.BLUE);
        } else if (i2 == size) {
            String b2 = C32634ae.m125182b(R.string.Calendar_Edit_AllBusy);
            Intrinsics.checkExpressionValueIsNotNull(b2, "ResUtil.getString(R.string.Calendar_Edit_AllBusy)");
            arrangeConflictUnit.setConflictStr(b2);
            arrangeConflictUnit.setConflictColor(ArrangeConflictUnit.ConflictColor.RED);
        } else if (i2 >= 3 || size < 5) {
            String a = C32634ae.m125180a(R.plurals.Calendar_Plural_TotalAttendee, size);
            HashMap hashMap = new HashMap();
            Intrinsics.checkExpressionValueIsNotNull(a, "totalAttendeeString");
            hashMap.put("totalAttendee", a);
            hashMap.put("unavailableCount", String.valueOf(i2));
            String a2 = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_Plural_AttendeeDetail, hashMap);
            Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…ttendeeDetail, formatMap)");
            arrangeConflictUnit.setConflictStr(a2);
            arrangeConflictUnit.setConflictColor(ArrangeConflictUnit.ConflictColor.GRAY);
        } else {
            StringBuilder sb = new StringBuilder();
            int size2 = arrayList.size();
            AbstractC30052p pVar = this.f75382g;
            if (pVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLanguageDependency");
            }
            if (pVar.mo108249b()) {
                while (i < size2) {
                    sb.append((String) arrayList.get(i));
                    if (i < size2 - 1) {
                        sb.append("、");
                    }
                    i++;
                }
            } else {
                while (i < size2) {
                    sb.append((String) arrayList.get(i));
                    if (i < size2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
            }
            String a3 = C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_Edit_MinorityBusy, "content", sb.toString());
            Intrinsics.checkExpressionValueIsNotNull(a3, "CalendarDependencyHolder…                        )");
            arrangeConflictUnit.setConflictStr(a3);
            arrangeConflictUnit.setConflictColor(ArrangeConflictUnit.ConflictColor.GRAY);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108843a(int i) {
        if (i < this.f75379c.size()) {
            String remove = this.f75379c.remove(i);
            Intrinsics.checkExpressionValueIsNotNull(remove, "mOrderedChatterIds.removeAt(index)");
            this.f75379c.add(0, remove);
        } else if (i < this.f75380d.size()) {
            String str = this.f75380d.get(i);
            Intrinsics.checkExpressionValueIsNotNull(str, "mSelectedChatterIds[index]");
            String str2 = str;
            this.f75379c.add(0, str2);
            this.f75380d.remove(i);
            this.f75380d.add(0, str2);
        }
        if (i < mo108487u().size()) {
            AbstractC30095b remove2 = mo108487u().remove(i);
            Intrinsics.checkExpressionValueIsNotNull(remove2, "mAttendees.removeAt(index)");
            mo108487u().add(0, remove2);
        }
        if (this.f75386k != 3) {
            CalendarSDKService.f83473a.mo118941a(this.f75378b, this.f75379c, this.f75380d);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.ArrangeContract.IArrangeModel
    /* renamed from: a */
    public void mo108844a(int i, int i2) {
        CalendarDate calendarDate = new CalendarDate(mo108490x());
        long j = (long) 1000;
        calendarDate.setTimeInMillis(mo108488v() * j);
        calendarDate.setDayMinutes(i);
        mo108473a(calendarDate.getTimeInSeconds());
        CalendarDate calendarDate2 = new CalendarDate(mo108490x());
        calendarDate2.setTimeInMillis(mo108489w() * j);
        calendarDate2.setJulianDay(calendarDate.getJulianDay());
        calendarDate2.setDayMinutes(i2);
        mo108478b(calendarDate2.getTimeInSeconds());
    }

    /* renamed from: a */
    private final boolean m111950a(CalendarDate calendarDate, int i, int i2) {
        TimeZone timeZone;
        boolean z = false;
        for (Map.Entry<String, CalendarWorkHourSetting> entry : mo108470E().entrySet()) {
            if (TextUtils.isEmpty(mo108469D().get(entry.getKey()))) {
                timeZone = TimeZone.getDefault();
            } else {
                timeZone = TimeZone.getTimeZone(mo108469D().get(entry.getKey()));
            }
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "attendeeTimeZone");
            ArrayList<CalendarWorkHourSpan> a = CalendarWorkHourUtil.f83806b.mo120357a(calendarDate, entry.getValue(), timeZone, mo108490x());
            boolean z2 = !entry.getValue().isEnable();
            int size = a.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                if (i >= a.get(i3).getStartMinute() && i2 <= a.get(i3).getEndMinute()) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (!z2) {
                ArrayList<String> arrayList = this.f75384i;
                if (arrayList == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOutWorkHourList");
                }
                arrayList.add(entry.getKey());
                z = true;
            }
        }
        return z;
    }
}
