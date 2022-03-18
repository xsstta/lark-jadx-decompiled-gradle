package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendars.share.helper.CalendarShareDataHelper;
import com.ss.android.lark.calendar.impl.features.events.edit.data.CalendarFragmentData;
import com.ss.android.lark.calendar.impl.features.events.edit.data.EventCalendarData;
import com.ss.android.lark.calendar.impl.features.events.edit.listener.model.ICalendarPartListener;
import com.ss.android.lark.calendar.impl.features.events.edit.utils.EventCalendarUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001MB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010 \u001a\u00020!H\u0002J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018J\u000e\u0010%\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0018J\b\u0010&\u001a\u00020\u0018H\u0002J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020(H\u0002J\b\u0010*\u001a\u00020\u0012H\u0002J\b\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0012H\u0002J\b\u0010.\u001a\u0004\u0018\u00010\u0005J\u0006\u0010/\u001a\u00020\u0012J\b\u00100\u001a\u0004\u0018\u00010\u0005J\b\u00101\u001a\u0004\u0018\u00010\u0005J\b\u00102\u001a\u0004\u0018\u00010\u0005J\u0006\u00103\u001a\u000204J\u0006\u00105\u001a\u00020\u0012J\u0006\u00106\u001a\u00020\u0012J\u000e\u00107\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0018J\u000e\u00108\u001a\u00020\u00122\u0006\u00109\u001a\u00020\u0018J\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020(J\u0006\u0010=\u001a\u00020(J\u0006\u0010>\u001a\u00020(J\u0010\u0010?\u001a\u00020(2\u0006\u0010@\u001a\u00020,H\u0002J\u000e\u0010?\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0018J\u0010\u0010B\u001a\u00020(2\u0006\u0010@\u001a\u00020,H\u0002J\u000e\u0010B\u001a\u00020(2\u0006\u0010A\u001a\u00020\u0018J\u0010\u0010C\u001a\u00020(2\u0006\u0010@\u001a\u00020,H\u0002J\u0010\u0010D\u001a\u00020(2\u0006\u00109\u001a\u00020\u0018H\u0002JR\u0010E\u001a\u00020!2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\"\u0010F\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0Gj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(`H2\u0006\u0010I\u001a\u00020(2\u0006\u0010J\u001a\u00020\u0012J\u001e\u0010K\u001a\u00020!2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006JB\u0010L\u001a\u00020!2\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\"\u0010F\u001a\u001e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(0Gj\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020(`HR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016¨\u0006N"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart;", "", "()V", "calendarList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Lkotlin/collections/ArrayList;", "getCalendarList$calendar_impl_release", "()Ljava/util/ArrayList;", "setCalendarList$calendar_impl_release", "(Ljava/util/ArrayList;)V", "calendarPartListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/ICalendarPartListener;", "getCalendarPartListener$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/ICalendarPartListener;", "setCalendarPartListener$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/events/edit/listener/model/ICalendarPartListener;)V", "chosenCalendarId", "", "getChosenCalendarId$calendar_impl_release", "()Ljava/lang/String;", "setChosenCalendarId$calendar_impl_release", "(Ljava/lang/String;)V", "chosenCalendarIndex", "", "getChosenCalendarIndex$calendar_impl_release", "()I", "setChosenCalendarIndex$calendar_impl_release", "(I)V", "originalChosenCalendarId", "getOriginalChosenCalendarId$calendar_impl_release", "setOriginalChosenCalendarId$calendar_impl_release", "findChosenIndex", "", "getCalendarChangeType", "Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "currentIndex", "getCalendarExternalAccount", "getChooseCalendarColor", "getChooseCalendarHasResigned", "", "getChooseCalendarIsCrossTenant", "getChooseCalendarName", "getChooseCalendarType", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$Type;", "getChooseExchangeAccountName", "getChosenCalendar", "getChosenCalendarId", "getChosenExchangeCalendar", "getChosenGooglePrimaryCalendar", "getChosenPrimaryCalendar", "getContainerCalendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/EventCalendarData;", "getCreatorCalendarId", "getExchangeCalendarName", "getExchangePrimaryId", "getExternalCalendarName", "index", "getFragmentCalendarData", "Lcom/ss/android/lark/calendar/impl/features/events/edit/data/CalendarFragmentData;", "hasThirdPartInShowCalendar", "isChosenIndexExchangeCalendar", "isChosenIndexGoogleCalendar", "isExchangeCalendar", ShareHitPoint.f121869d, "position", "isGoogleCalendar", "isLarkCalendar", "isPrimaryCalendar", "updateCalendarListForCreate", "googleAccountSetting", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "usePrimaryCalendar", "defaultCalendarId", "updateCalendarListForEdit", "updateCalendarListForSwitch", "CHANGE_TYPE", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EditCalendarPart {

    /* renamed from: a */
    private ArrayList<Calendar> f81255a = new ArrayList<>();

    /* renamed from: b */
    private int f81256b;

    /* renamed from: c */
    private String f81257c;

    /* renamed from: d */
    private ICalendarPartListener f81258d;

    /* renamed from: e */
    private String f81259e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditCalendarPart$CHANGE_TYPE;", "", "(Ljava/lang/String;I)V", GrsBaseInfo.CountryCodeSource.UNKNOWN, "LARK_TO_GOOGLE", "GOOGLE_TO_LARK", "LARK_TO_EXCHANGE", "EXCHANGE_TO_LARK", "GOOGLE_TO_EXCHANGE", "EXCHANGE_TO_GOOGLE", "LARK_TO_LARK", "GOOGLE_TO_GOOGLE", "EXCHANGE_TO_EXCHANGE", "EDIT_SWITCH_CALENDAR", "EDIT_SWITCH_CALENDAR_NEED_ADD_OWNER", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum CHANGE_TYPE {
        UNKNOWN,
        LARK_TO_GOOGLE,
        GOOGLE_TO_LARK,
        LARK_TO_EXCHANGE,
        EXCHANGE_TO_LARK,
        GOOGLE_TO_EXCHANGE,
        EXCHANGE_TO_GOOGLE,
        LARK_TO_LARK,
        GOOGLE_TO_GOOGLE,
        EXCHANGE_TO_EXCHANGE,
        EDIT_SWITCH_CALENDAR,
        EDIT_SWITCH_CALENDAR_NEED_ADD_OWNER
    }

    /* renamed from: a */
    public final ArrayList<Calendar> mo116182a() {
        return this.f81255a;
    }

    /* renamed from: b */
    public final int mo116189b() {
        return this.f81256b;
    }

    /* renamed from: h */
    public final boolean mo116202h() {
        return mo116193c(this.f81256b);
    }

    /* renamed from: i */
    public final boolean mo116203i() {
        return mo116195d(this.f81256b);
    }

    /* renamed from: c */
    public final Calendar mo116192c() {
        if (this.f81256b < this.f81255a.size()) {
            return this.f81255a.get(this.f81256b);
        }
        return null;
    }

    /* renamed from: e */
    public final EventCalendarData mo116196e() {
        return new EventCalendarData(m121057r(), m121054o(), m121058s(), m121055p(), m121056q(), m121059t());
    }

    /* renamed from: m */
    public final String mo116207m() {
        Calendar l = mo116206l();
        if (l == null) {
            return "";
        }
        String externalAccount = l.getExternalAccount();
        Intrinsics.checkExpressionValueIsNotNull(externalAccount, "calendar.externalAccount");
        return externalAccount;
    }

    /* renamed from: n */
    private final void m121053n() {
        if (!CollectionUtils.isEmpty(this.f81255a)) {
            int size = this.f81255a.size();
            for (int i = 0; i < size; i++) {
                Calendar calendar = this.f81255a.get(i);
                Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[i]");
                if (Intrinsics.areEqual(calendar.getServerId(), this.f81257c)) {
                    this.f81256b = i;
                }
            }
        }
    }

    /* renamed from: o */
    private final String m121054o() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return "";
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        String noteOrLocalizeSummary = calendar.getNoteOrLocalizeSummary();
        Intrinsics.checkExpressionValueIsNotNull(noteOrLocalizeSummary, "calendarList[chosenCalen…ex].noteOrLocalizeSummary");
        return noteOrLocalizeSummary;
    }

    /* renamed from: q */
    private final boolean m121056q() {
        int i;
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size() || (i = this.f81256b) < 0) {
            return false;
        }
        Calendar calendar = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        return calendar.isResignedCalendar();
    }

    /* renamed from: s */
    private final Calendar.Type m121058s() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return Calendar.Type.UNKNOWN_TYPE;
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        Calendar.Type type = calendar.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "calendarList[chosenCalendarIndex].type");
        return type;
    }

    /* renamed from: t */
    private final boolean m121059t() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return false;
        }
        return CalendarShareDataHelper.m113341a(this.f81255a.get(this.f81256b));
    }

    /* renamed from: d */
    public final Calendar mo116194d() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return null;
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        Calendar calendar2 = calendar;
        if (calendar2.getType() == Calendar.Type.PRIMARY) {
            return calendar2;
        }
        return null;
    }

    /* renamed from: j */
    public final String mo116204j() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return "";
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        String serverId = calendar.getServerId();
        Intrinsics.checkExpressionValueIsNotNull(serverId, "calendarList[chosenCalendarIndex].serverId");
        return serverId;
    }

    /* renamed from: k */
    public final Calendar mo116205k() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return null;
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        Calendar calendar2 = calendar;
        if (calendar2.getType() != Calendar.Type.GOOGLE || !calendar2.isPrimary()) {
            return null;
        }
        return calendar2;
    }

    /* renamed from: l */
    public final Calendar mo116206l() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            return null;
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        Calendar calendar2 = calendar;
        if (calendar2.getType() == Calendar.Type.EXCHANGE) {
            return calendar2;
        }
        return null;
    }

    /* renamed from: p */
    private final String m121055p() {
        if (CollectionUtils.isNotEmpty(this.f81255a) && this.f81256b < this.f81255a.size()) {
            Calendar calendar = this.f81255a.get(this.f81256b);
            Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
            if (calendar.getType() == Calendar.Type.EXCHANGE) {
                Calendar calendar2 = this.f81255a.get(this.f81256b);
                Intrinsics.checkExpressionValueIsNotNull(calendar2, "calendarList[chosenCalendarIndex]");
                String externalAccount = calendar2.getExternalAccount();
                Intrinsics.checkExpressionValueIsNotNull(externalAccount, "calendarList[chosenCalendarIndex].externalAccount");
                return externalAccount;
            }
        }
        return "";
    }

    /* renamed from: r */
    private final int m121057r() {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || this.f81256b >= this.f81255a.size()) {
            SkinColor skinColor = CalendarSkinColorTool.m124923a(C30022a.f74884c.mo108456c().getSkinType()).get("6");
            if (skinColor != null) {
                return skinColor.getBackgroundColor();
            }
            return -1;
        }
        Calendar calendar = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[chosenCalendarIndex]");
        return calendar.getBackgroundColor();
    }

    /* renamed from: f */
    public final boolean mo116199f() {
        boolean z;
        ArrayList<Calendar> arrayList = this.f81255a;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            for (T t : arrayList) {
                if (t.getType() == Calendar.Type.GOOGLE || t.getType() == Calendar.Type.EXCHANGE) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    public final CalendarFragmentData mo116200g() {
        ArrayList arrayList = new ArrayList();
        Iterator<Calendar> it = this.f81255a.iterator();
        while (it.hasNext()) {
            Calendar next = it.next();
            Intrinsics.checkExpressionValueIsNotNull(next, "cal");
            int backgroundColor = next.getBackgroundColor();
            String noteOrLocalizeSummary = next.getNoteOrLocalizeSummary();
            Intrinsics.checkExpressionValueIsNotNull(noteOrLocalizeSummary, "cal.noteOrLocalizeSummary");
            Calendar.Type type = next.getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "cal.type");
            String externalAccount = next.getExternalAccount();
            if (externalAccount == null) {
                externalAccount = "";
            }
            arrayList.add(new EventCalendarData(backgroundColor, noteOrLocalizeSummary, type, externalAccount, next.isResignedCalendar(), CalendarShareDataHelper.m113341a(next)));
        }
        return new CalendarFragmentData(arrayList, this.f81256b);
    }

    /* renamed from: b */
    private final boolean m121050b(Calendar.Type type) {
        if (type == Calendar.Type.GOOGLE) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private final boolean m121051c(Calendar.Type type) {
        if (type == Calendar.Type.EXCHANGE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo116183a(int i) {
        this.f81256b = i;
    }

    /* renamed from: a */
    private final boolean m121049a(Calendar.Type type) {
        if (type == Calendar.Type.GOOGLE || type == Calendar.Type.EXCHANGE) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo116191b(String str) {
        this.f81259e = str;
    }

    /* renamed from: a */
    public final void mo116184a(ICalendarPartListener bVar) {
        this.f81258d = bVar;
    }

    /* renamed from: d */
    public final boolean mo116195d(int i) {
        if (this.f81255a.size() <= i) {
            return false;
        }
        Calendar calendar = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[position]");
        if (calendar.getType() == Calendar.Type.EXCHANGE) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private final boolean m121052h(int i) {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || i >= this.f81255a.size()) {
            return false;
        }
        Calendar calendar = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[index]");
        if (calendar.getType() == Calendar.Type.PRIMARY) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo116185a(String str) {
        this.f81257c = str;
    }

    /* renamed from: c */
    public final boolean mo116193c(int i) {
        if (this.f81255a.size() <= i) {
            return false;
        }
        Calendar calendar = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[position]");
        if (calendar.getType() == Calendar.Type.GOOGLE) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final String mo116197e(int i) {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || i >= this.f81255a.size()) {
            return "";
        }
        Calendar calendar = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[index]");
        Calendar calendar2 = calendar;
        if (calendar2.getType() != Calendar.Type.EXCHANGE && calendar2.getType() != Calendar.Type.GOOGLE) {
            return "";
        }
        String externalAccount = calendar2.getExternalAccount();
        Intrinsics.checkExpressionValueIsNotNull(externalAccount, "calendar.externalAccount");
        return externalAccount;
    }

    /* renamed from: f */
    public final String mo116198f(int i) {
        if (!CollectionUtils.isNotEmpty(this.f81255a) || i >= this.f81255a.size()) {
            return "";
        }
        Calendar calendar = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[currentIndex]");
        String externalAccount = calendar.getExternalAccount();
        Intrinsics.checkExpressionValueIsNotNull(externalAccount, "calendarList[currentIndex].externalAccount");
        return externalAccount;
    }

    /* renamed from: a */
    public final void mo116186a(ArrayList<Calendar> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        this.f81255a = arrayList;
        m121053n();
    }

    /* renamed from: b */
    public final CHANGE_TYPE mo116190b(int i) {
        String str = this.f81259e;
        if (str != null) {
            Calendar calendar = this.f81255a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[currentIndex]");
            if (!Intrinsics.areEqual(str, calendar.getServerId())) {
                if (m121052h(i)) {
                    return CHANGE_TYPE.EDIT_SWITCH_CALENDAR_NEED_ADD_OWNER;
                }
                return CHANGE_TYPE.EDIT_SWITCH_CALENDAR;
            }
        }
        Calendar calendar2 = this.f81255a.get(this.f81256b);
        Intrinsics.checkExpressionValueIsNotNull(calendar2, "calendarList[chosenCalendarIndex]");
        Calendar.Type type = calendar2.getType();
        Calendar calendar3 = this.f81255a.get(i);
        Intrinsics.checkExpressionValueIsNotNull(calendar3, "calendarList[currentIndex]");
        Calendar.Type type2 = calendar3.getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "oldType");
        if (m121049a(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121050b(type2)) {
                return CHANGE_TYPE.LARK_TO_GOOGLE;
            }
        }
        if (m121050b(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121049a(type2)) {
                return CHANGE_TYPE.GOOGLE_TO_LARK;
            }
        }
        if (m121049a(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121051c(type2)) {
                return CHANGE_TYPE.LARK_TO_EXCHANGE;
            }
        }
        if (m121051c(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121049a(type2)) {
                return CHANGE_TYPE.EXCHANGE_TO_LARK;
            }
        }
        if (m121050b(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121051c(type2)) {
                return CHANGE_TYPE.GOOGLE_TO_EXCHANGE;
            }
        }
        if (m121051c(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121050b(type2)) {
                return CHANGE_TYPE.EXCHANGE_TO_GOOGLE;
            }
        }
        if (m121051c(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121051c(type2)) {
                return CHANGE_TYPE.EXCHANGE_TO_EXCHANGE;
            }
        }
        if (m121050b(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121050b(type2)) {
                return CHANGE_TYPE.GOOGLE_TO_GOOGLE;
            }
        }
        if (m121049a(type)) {
            Intrinsics.checkExpressionValueIsNotNull(type2, "currentType");
            if (m121049a(type2)) {
                return CHANGE_TYPE.LARK_TO_LARK;
            }
        }
        return CHANGE_TYPE.UNKNOWN;
    }

    /* renamed from: g */
    public final String mo116201g(int i) {
        String str = "";
        if (!CollectionUtils.isEmpty(this.f81255a) && i < this.f81255a.size()) {
            Calendar calendar = this.f81255a.get(i);
            Intrinsics.checkExpressionValueIsNotNull(calendar, "calendarList[currentIndex]");
            Calendar calendar2 = calendar;
            for (T t : this.f81255a) {
                if (t.getType() == calendar2.getType() && t.isPrimary() && Intrinsics.areEqual(t.getExternalAccount(), calendar2.getExternalAccount())) {
                    str = t.getServerId();
                    Intrinsics.checkExpressionValueIsNotNull(str, "cal.serverId");
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    public final void mo116187a(ArrayList<Calendar> arrayList, HashMap<String, Boolean> hashMap) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        Intrinsics.checkParameterIsNotNull(hashMap, "googleAccountSetting");
        ArrayList arrayList2 = new ArrayList();
        for (T t : EventCalendarUtils.f80184a.mo114857a(arrayList, hashMap)) {
            T t2 = t;
            if (t2.getType() == Calendar.Type.PRIMARY || t2.getType() == Calendar.Type.OTHER) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(t);
            }
        }
        this.f81255a = new ArrayList<>(arrayList2);
        m121053n();
    }

    /* renamed from: a */
    public final void mo116188a(ArrayList<Calendar> arrayList, HashMap<String, Boolean> hashMap, boolean z, String str) {
        boolean z2;
        T t;
        boolean z3;
        boolean z4;
        Intrinsics.checkParameterIsNotNull(arrayList, "calendarList");
        Intrinsics.checkParameterIsNotNull(hashMap, "googleAccountSetting");
        Intrinsics.checkParameterIsNotNull(str, "defaultCalendarId");
        this.f81255a = EventCalendarUtils.f80184a.mo114857a(arrayList, hashMap);
        Iterator<T> it = arrayList.iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            T t2 = t;
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || !Intrinsics.areEqual(t2.getServerId(), str)) {
                z4 = false;
                continue;
            } else {
                z4 = true;
                continue;
            }
            if (z4) {
                break;
            }
        }
        if (t == null) {
            z2 = false;
        }
        if (z2) {
            this.f81257c = str;
        } else if (!z) {
            this.f81257c = EventCalendarUtils.f80184a.mo114856a(this.f81255a);
        }
        m121053n();
        ICalendarPartListener bVar = this.f81258d;
        if (bVar != null) {
            bVar.mo114633a();
        }
    }
}
