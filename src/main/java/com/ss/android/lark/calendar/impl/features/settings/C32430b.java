package com.ss.android.lark.calendar.impl.features.settings;

import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.mvp.BaseModel;
import com.larksuite.suite.R;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.common.helper.ReminderHelper;
import com.ss.android.lark.calendar.impl.features.common.p1495a.AbstractC31116a;
import com.ss.android.lark.calendar.impl.features.local.C31934h;
import com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d;
import com.ss.android.lark.calendar.impl.features.settings.C32447c;
import com.ss.android.lark.calendar.impl.framework.busevents.SettingChangedEvent;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarWorkHourSetting;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32595g;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32583e;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.settings.b */
public class C32430b extends BaseModel implements AbstractC32460d.AbstractC32461a {

    /* renamed from: A */
    private CalendarSkinColorTool.SkinType f83121A;

    /* renamed from: B */
    private boolean f83122B;

    /* renamed from: C */
    private boolean f83123C;

    /* renamed from: D */
    private boolean f83124D;

    /* renamed from: E */
    private boolean f83125E;

    /* renamed from: F */
    private CalendarWorkHourSetting f83126F;

    /* renamed from: G */
    private CalendarSetting.AlternateCalendar f83127G;

    /* renamed from: H */
    private CalendarSetting.AlternateCalendar f83128H;

    /* renamed from: a */
    public CalendarSettingViewData f83129a;

    /* renamed from: b */
    AbstractC32595g f83130b;

    /* renamed from: c */
    public boolean f83131c;

    /* renamed from: d */
    private List<String> f83132d = ReminderHelper.m116193a();

    /* renamed from: e */
    private List<String> f83133e = ReminderHelper.m116195b();

    /* renamed from: f */
    private List<String> f83134f = new ArrayList();

    /* renamed from: g */
    private List<String> f83135g = Arrays.asList(C32634ae.m125183c(R.array.start_of_week));

    /* renamed from: h */
    private List<String> f83136h = Arrays.asList(C32634ae.m125182b(R.string.Calendar_Workinghours_Enabled), C32634ae.m125182b(R.string.Calendar_Workinghours_Notenabled));

    /* renamed from: i */
    private List<Integer> f83137i;

    /* renamed from: j */
    private List<Integer> f83138j;

    /* renamed from: k */
    private List<Integer> f83139k;

    /* renamed from: l */
    private List<CalendarSetting.DayOfWeek> f83140l;

    /* renamed from: m */
    private int f83141m;

    /* renamed from: n */
    private int f83142n;

    /* renamed from: o */
    private int f83143o;

    /* renamed from: p */
    private int f83144p;

    /* renamed from: q */
    private CalendarSkinColorTool.SkinType f83145q;

    /* renamed from: r */
    private boolean f83146r;

    /* renamed from: s */
    private boolean f83147s;

    /* renamed from: t */
    private boolean f83148t;

    /* renamed from: u */
    private boolean f83149u;

    /* renamed from: v */
    private boolean f83150v;

    /* renamed from: w */
    private int f83151w;

    /* renamed from: x */
    private int f83152x;

    /* renamed from: y */
    private int f83153y;

    /* renamed from: z */
    private int f83154z;

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118491a(AbstractC32460d.AbstractC32461a.AbstractC32462a aVar) {
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        super.destroy();
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: f */
    public CalendarSettingViewData mo118502f() {
        return this.f83129a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: q */
    public boolean mo118513q() {
        return this.f83131c;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: h */
    public void mo118504h() {
        this.f83129a.setTimeZone(C32646c.m125265a(TimeZone.getDefault(), System.currentTimeMillis()));
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: i */
    public void mo118505i() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(true);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: k */
    public void mo118507k() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseAlternateCalendar(true);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: l */
    public void mo118508l() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(true);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: m */
    public void mo118509m() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(true);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: o */
    public void mo118511o() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(true);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: p */
    public void mo118512p() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(true);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    /* renamed from: r */
    private void m123790r() {
        this.f83134f.clear();
        for (Integer num : Arrays.asList(15, 30, 45, 60, 90, Integer.valueOf((int) SmEvents.EVENT_NW))) {
            this.f83134f.add(C32634ae.m125180a(R.plurals.Calendar_Plural_CommonMins, num.intValue()));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118487a() {
        this.f83129a.setChooseReminder(true);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseIndex(this.f83141m);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: b */
    public void mo118494b() {
        if (this.f83129a.isChooseReminder()) {
            this.f83129a.setTitleText(C32634ae.m125182b(R.string.Calendar_NewSettings_EventReminderNotAllDayMobile));
            this.f83129a.setItems(this.f83132d);
        } else if (this.f83129a.isChooseAllDayReminder()) {
            this.f83129a.setTitleText(C32634ae.m125182b(R.string.Calendar_NewSettings_EventReminderAllDayMobile));
            this.f83129a.setItems(this.f83133e);
        } else if (this.f83129a.isChooseDefaultDuration()) {
            this.f83129a.setTitleText(C32634ae.m125182b(R.string.Calendar_NewSettings_DefaultEventDuration));
            this.f83129a.setItems(this.f83134f);
        } else {
            this.f83129a.setTitleText(C32634ae.m125182b(R.string.Calendar_NewSettings_FirstDayOfWeek));
            this.f83129a.setItems(this.f83135g);
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: c */
    public void mo118496c() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(true);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseIndex(this.f83142n);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: d */
    public void mo118498d() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(true);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseIndex(this.f83143o);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: e */
    public void mo118500e() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(true);
        this.f83129a.setChooseSkinType(false);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setChooseIndex(this.f83144p);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: j */
    public void mo118506j() {
        this.f83129a.setChooseReminder(false);
        this.f83129a.setChooseAllDayReminder(false);
        this.f83129a.setChooseDefaultDuration(false);
        this.f83129a.setChooseFirstDay(false);
        this.f83129a.setChooseSkinType(true);
        this.f83129a.setChooseShowPastEventsMask(false);
        this.f83129a.setChooseShowRejectEvents(false);
        this.f83129a.setChooseOnlyAcceptReminder(false);
        this.f83129a.setChooseDeclineInvitationReminder(false);
        this.f83129a.setChooseWorkHour(false);
        this.f83129a.setSkinType(this.f83145q);
        this.f83129a.setChooseAlternateCalendar(false);
    }

    @Override // com.larksuite.framework.mvp.BaseModel, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m123790r();
        CalendarSettingViewData calendarSettingViewData = new CalendarSettingViewData();
        this.f83129a = calendarSettingViewData;
        calendarSettingViewData.setReminder(this.f83132d.get(this.f83141m));
        this.f83129a.setAllDayReminder(this.f83133e.get(this.f83142n));
        this.f83129a.setEventDuration(this.f83134f.get(this.f83143o));
        this.f83129a.setFirstDayOfWeek(this.f83135g.get(this.f83144p));
        this.f83129a.setSkinType(this.f83145q);
        this.f83129a.setShowPastEventsMask(this.f83146r);
        this.f83129a.setShowRejectEvent(this.f83147s);
        this.f83129a.setOnlyAcceptReminder(this.f83148t);
        this.f83129a.setChooseDeclineInvitationReminder(this.f83149u);
        this.f83129a.setBindGoogleCalendar(this.f83150v);
        this.f83129a.setTimeZone(C32646c.m125265a(TimeZone.getDefault(), System.currentTimeMillis()));
        this.f83129a.setWorkHourData(new CalendarWorkHourSetting(false, new HashMap(), true));
        this.f83129a.setEnableWorkHourStr(this.f83136h.get(0));
        this.f83129a.setDisplayAlternateCalendar(CalendarSetting.AlternateCalendar.NONE_CALENDAR);
    }

    public C32430b() {
        Integer valueOf = Integer.valueOf((int) SmEvents.EVENT_NW);
        this.f83137i = Arrays.asList(-1, 0, 5, 15, 30, 60, valueOf, Integer.valueOf((int) CalendarWorkHourUtil.f83805a), 2880, 10080);
        this.f83138j = Arrays.asList(-1, -480, -540, -600, 960, 900, 840);
        this.f83139k = Arrays.asList(15, 30, 45, 60, 90, valueOf);
        this.f83140l = Arrays.asList(CalendarSetting.DayOfWeek.SATURDAY, CalendarSetting.DayOfWeek.SUNDAY, CalendarSetting.DayOfWeek.MONDAY);
        this.f83141m = 3;
        this.f83142n = 1;
        this.f83143o = 2;
        this.f83144p = 1;
        CalendarSkinColorTool.SkinType skinType = AbstractC31116a.f78587a;
        this.f83145q = skinType;
        this.f83146r = true;
        this.f83147s = true;
        this.f83148t = false;
        this.f83149u = false;
        this.f83150v = true;
        this.f83151w = this.f83141m;
        this.f83152x = this.f83142n;
        this.f83153y = this.f83143o;
        this.f83154z = this.f83144p;
        this.f83121A = skinType;
        this.f83122B = true;
        this.f83123C = true;
        this.f83124D = false;
        this.f83125E = false;
        this.f83130b = C32583e.m124816a();
        this.f83131c = false;
    }

    /* renamed from: g */
    public void mo118503g() {
        if (this.f83129a.isChooseReminder() && this.f83129a.getChooseIndex() < this.f83132d.size()) {
            int i = this.f83151w;
            this.f83141m = i;
            this.f83129a.setChooseIndex(i);
            CalendarSettingViewData calendarSettingViewData = this.f83129a;
            calendarSettingViewData.setReminder(this.f83132d.get(calendarSettingViewData.getChooseIndex()));
        } else if (this.f83129a.isChooseAllDayReminder() && this.f83129a.getChooseIndex() < this.f83133e.size()) {
            int i2 = this.f83152x;
            this.f83142n = i2;
            this.f83129a.setChooseIndex(i2);
            CalendarSettingViewData calendarSettingViewData2 = this.f83129a;
            calendarSettingViewData2.setAllDayReminder(this.f83133e.get(calendarSettingViewData2.getChooseIndex()));
        } else if (this.f83129a.isChooseDefaultDuration() && this.f83129a.getChooseIndex() < this.f83134f.size()) {
            int i3 = this.f83153y;
            this.f83143o = i3;
            this.f83129a.setChooseIndex(i3);
            CalendarSettingViewData calendarSettingViewData3 = this.f83129a;
            calendarSettingViewData3.setEventDuration(this.f83134f.get(calendarSettingViewData3.getChooseIndex()));
        } else if (this.f83129a.isChooseFirstDay() && this.f83129a.getChooseIndex() < this.f83135g.size()) {
            int i4 = this.f83154z;
            this.f83144p = i4;
            this.f83129a.setChooseIndex(i4);
            CalendarSettingViewData calendarSettingViewData4 = this.f83129a;
            calendarSettingViewData4.setFirstDayOfWeek(this.f83135g.get(calendarSettingViewData4.getChooseIndex()));
        } else if (this.f83129a.isChooseSkinType()) {
            CalendarSkinColorTool.SkinType skinType = this.f83121A;
            this.f83145q = skinType;
            this.f83129a.setSkinType(skinType);
        } else if (this.f83129a.isChooseShowPastEventsMask()) {
            boolean z = this.f83122B;
            this.f83146r = z;
            this.f83129a.setShowPastEventsMask(z);
        } else if (this.f83129a.isChooseShowRejectEvents()) {
            boolean z2 = this.f83123C;
            this.f83147s = z2;
            this.f83129a.setShowRejectEvent(z2);
        } else if (this.f83129a.isChooseOnlyAcceptReminder()) {
            boolean z3 = this.f83124D;
            this.f83148t = z3;
            this.f83129a.setOnlyAcceptReminder(z3);
        } else if (this.f83129a.isChooseDeclineInvitationReminder()) {
            boolean z4 = this.f83125E;
            this.f83149u = z4;
            this.f83129a.setDeclineInvitationReminder(z4);
        } else if (this.f83129a.isChooseAlternateCalendar()) {
            this.f83128H = this.f83127G;
            this.f83129a.setDisplayAlternateCalendar(C30022a.f74884c.mo108456c().getDisplayAlternateCalendar());
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: n */
    public CalendarSettingViewData mo118510n() {
        String str;
        CalendarSetting c = C30022a.f74884c.mo108456c();
        if (c != null) {
            int indexOf = this.f83137i.indexOf(Integer.valueOf(c.getDefaultNoneAllDayReminder()));
            if (indexOf != -1 && indexOf < this.f83132d.size()) {
                this.f83141m = indexOf;
            }
            int indexOf2 = this.f83138j.indexOf(Integer.valueOf(c.getDefaultAllDayReminder()));
            if (indexOf2 != -1 && indexOf2 < this.f83133e.size()) {
                this.f83142n = indexOf2;
            }
            int indexOf3 = this.f83139k.indexOf(Integer.valueOf(c.getDefaultEventDuration()));
            if (indexOf3 != -1 && indexOf3 < this.f83133e.size()) {
                this.f83143o = indexOf3;
            }
            int indexOf4 = this.f83140l.indexOf(c.getWeekStartDay());
            if (indexOf4 == -1 || indexOf4 >= this.f83135g.size()) {
                this.f83144p = 1;
            } else {
                this.f83144p = indexOf4;
            }
            this.f83145q = c.getSkinType();
            this.f83146r = c.isShowPastEventsMask();
            this.f83147s = c.isShowRejectSchedule();
            this.f83148t = c.isOnlyAcceptReminder();
            this.f83149u = c.isDeclineInvitationReminder();
            this.f83150v = c.isBindGoogleCalendar();
            this.f83126F = c.getWorkHourSetting();
            this.f83128H = c.getAlternateCalendar();
        }
        this.f83129a.setSkinType(this.f83145q);
        this.f83129a.setShowPastEventsMask(this.f83146r);
        this.f83129a.setReminder(this.f83132d.get(this.f83141m));
        this.f83129a.setAllDayReminder(this.f83133e.get(this.f83142n));
        this.f83129a.setEventDuration(this.f83134f.get(this.f83143o));
        this.f83129a.setFirstDayOfWeek(this.f83135g.get(this.f83144p));
        this.f83129a.setShowRejectEvent(this.f83147s);
        this.f83129a.setOnlyAcceptReminder(this.f83148t);
        this.f83129a.setDeclineInvitationReminder(this.f83149u);
        this.f83129a.setBindGoogleCalendar(this.f83150v);
        CalendarSettingViewData calendarSettingViewData = this.f83129a;
        if (this.f83126F.isEnable()) {
            str = this.f83136h.get(0);
        } else {
            str = this.f83136h.get(1);
        }
        calendarSettingViewData.setEnableWorkHourStr(str);
        this.f83129a.setWorkHourData(this.f83126F);
        this.f83129a.setDisplayAlternateCalendar(c.getDisplayAlternateCalendar());
        return this.f83129a;
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118488a(final IGetDataCallback<Boolean> iGetDataCallback) {
        C30022a.f74884c.mo108449a(new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.features.settings.C32430b.C324322 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                iGetDataCallback.onError(errorResult);
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    C32430b.this.f83131c = true;
                }
                iGetDataCallback.onSuccess(bool);
            }
        });
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: b */
    public void mo118495b(boolean z) {
        this.f83123C = this.f83129a.isShowRejectEvent();
        this.f83129a.setShowRejectEvent(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: d */
    public void mo118499d(boolean z) {
        this.f83124D = this.f83129a.isOnlyAcceptReminder();
        this.f83129a.setOnlyAcceptReminder(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: e */
    public void mo118501e(boolean z) {
        this.f83125E = this.f83129a.isDeclineInvitationReminder();
        this.f83129a.setDeclineInvitationReminder(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118493a(boolean z) {
        this.f83122B = this.f83129a.isShowPastEventsMask();
        this.f83129a.setShowPastEventsMask(z);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: c */
    public void mo118497c(boolean z) {
        String str;
        CalendarSettingViewData calendarSettingViewData = this.f83129a;
        if (this.f83126F.isEnable()) {
            str = this.f83136h.get(0);
        } else {
            str = this.f83136h.get(1);
        }
        calendarSettingViewData.setEnableWorkHourStr(str);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118489a(CalendarSettingViewData calendarSettingViewData) {
        this.f83129a = calendarSettingViewData;
        if (calendarSettingViewData.isChooseReminder() && this.f83129a.getChooseIndex() < this.f83132d.size()) {
            this.f83151w = this.f83141m;
            CalendarSettingViewData calendarSettingViewData2 = this.f83129a;
            calendarSettingViewData2.setReminder(this.f83132d.get(calendarSettingViewData2.getChooseIndex()));
            int chooseIndex = this.f83129a.getChooseIndex();
            this.f83141m = chooseIndex;
            GeneralHitPoint.m124250h(String.valueOf(this.f83137i.get(chooseIndex)));
        } else if (this.f83129a.isChooseAllDayReminder() && this.f83129a.getChooseIndex() < this.f83133e.size()) {
            this.f83152x = this.f83142n;
            CalendarSettingViewData calendarSettingViewData3 = this.f83129a;
            calendarSettingViewData3.setAllDayReminder(this.f83133e.get(calendarSettingViewData3.getChooseIndex()));
            int chooseIndex2 = this.f83129a.getChooseIndex();
            this.f83142n = chooseIndex2;
            GeneralHitPoint.m124252i(String.valueOf(this.f83138j.get(chooseIndex2)));
        } else if (this.f83129a.isChooseDefaultDuration() && this.f83129a.getChooseIndex() < this.f83134f.size()) {
            this.f83153y = this.f83143o;
            CalendarSettingViewData calendarSettingViewData4 = this.f83129a;
            calendarSettingViewData4.setEventDuration(this.f83134f.get(calendarSettingViewData4.getChooseIndex()));
            int chooseIndex3 = this.f83129a.getChooseIndex();
            this.f83143o = chooseIndex3;
            GeneralHitPoint.m124254j(String.valueOf(this.f83139k.get(chooseIndex3)));
        } else if (this.f83129a.isChooseFirstDay() && this.f83129a.getChooseIndex() < this.f83135g.size()) {
            this.f83154z = this.f83144p;
            CalendarSettingViewData calendarSettingViewData5 = this.f83129a;
            calendarSettingViewData5.setFirstDayOfWeek(this.f83135g.get(calendarSettingViewData5.getChooseIndex()));
            int chooseIndex4 = this.f83129a.getChooseIndex();
            this.f83144p = chooseIndex4;
            GeneralHitPoint.m124262n(String.valueOf(this.f83140l.get(chooseIndex4).getNumber()));
        } else if (this.f83129a.isChooseSkinType()) {
            this.f83121A = this.f83145q;
            this.f83145q = this.f83129a.getSkinType();
        } else if (this.f83129a.isChooseWorkHour()) {
            this.f83126F = calendarSettingViewData.getWorkHourData();
        } else if (this.f83129a.isChooseAlternateCalendar()) {
            this.f83127G = this.f83128H;
            this.f83128H = this.f83129a.getDisplayAlternateCalendar();
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118490a(final C32447c.AbstractC32457b bVar) {
        if (!this.f83131c) {
            mo118503g();
            bVar.mo118555b(this.f83129a);
            return;
        }
        final CalendarSetting calendarSetting = new CalendarSetting();
        calendarSetting.setDefaultNoneAllDayReminder(this.f83137i.get(this.f83141m).intValue());
        calendarSetting.setDefaultAllDayReminder(this.f83138j.get(this.f83142n).intValue());
        calendarSetting.setDefaultEventDuration(this.f83139k.get(this.f83143o).intValue());
        calendarSetting.setWeekStartDay(this.f83140l.get(this.f83144p));
        calendarSetting.setSkinType(this.f83129a.getSkinType());
        calendarSetting.setSkinTypeIOS(C30022a.f74884c.mo108456c().getSkinTypeIOS());
        calendarSetting.setSkinTypePC(C30022a.f74884c.mo108456c().getSkinTypePC());
        calendarSetting.setShowPastEventsMask(this.f83129a.isShowPastEventsMask());
        calendarSetting.setShowPastEventsMaskIOS(C30022a.f74884c.mo108456c().isShowPastEventsMaskIOS());
        calendarSetting.setShowPastEventsMaskPC(C30022a.f74884c.mo108456c().isShowPastEventsMaskPC());
        calendarSetting.setShowRejectSchedule(this.f83129a.isShowRejectEvent());
        calendarSetting.setOnlyAcceptReminder(this.f83129a.isOnlyAcceptReminder());
        calendarSetting.setDeclineInvitationReminder(this.f83129a.isDeclineInvitationReminder());
        calendarSetting.setBindGoogleCalendar(C30022a.f74884c.mo108456c().isBindGoogleCalendar());
        calendarSetting.setGoogleAccount(C30022a.f74884c.mo108456c().getGoogleAccount());
        calendarSetting.setWorkHourSetting(this.f83129a.getWorkHourData());
        calendarSetting.setAlternateCalendar(this.f83128H);
        final boolean isChooseFirstDay = this.f83129a.isChooseFirstDay();
        final String l = Long.toString(new Date().getTime());
        Log.m165389i("CalendarSettingModel", C32673y.m125376b(l, "sendSaveSetting", "calendarSetting", calendarSetting.toString()));
        this.f83130b.mo119035a(getCallbackManager().wrapAndAddGetDataCallback(new IGetDataCallback<CalendarSetting>("sendSaveSetting") {
            /* class com.ss.android.lark.calendar.impl.features.settings.C32430b.C324311 */

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Log.m165383e("CalendarSettingModel", C32673y.m125370a(l, "sendSaveSetting", errorResult));
                C32430b.this.mo118503g();
                bVar.mo118554a(C32430b.this.f83129a);
            }

            /* renamed from: a */
            public void onSuccess(CalendarSetting calendarSetting) {
                String str;
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                if (calendarSetting == null) {
                    str = "null";
                } else {
                    str = calendarSetting.toString();
                }
                boolean z5 = false;
                Log.m165389i("CalendarSettingModel", C32673y.m125373a(l, "sendSaveSetting", "calendarSetting", str));
                CalendarSetting c = C30022a.f74884c.mo108456c();
                if (calendarSetting.getSkinType() != c.getSkinType()) {
                    z = true;
                } else {
                    z = false;
                }
                if (calendarSetting.isShowPastEventsMask() != c.isShowPastEventsMask()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (calendarSetting.getWeekStartDay().getNumber() != c.getWeekStartDay().getNumber()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (calendarSetting.getDefaultEventDuration() != c.getDefaultEventDuration()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (calendarSetting.getDisplayAlternateCalendar() != c.getDisplayAlternateCalendar()) {
                    z5 = true;
                }
                C30022a.f74884c.mo108451a(calendarSetting);
                SettingChangedEvent mVar = new SettingChangedEvent(z, z2, z3, z5, z4, false);
                if (z3 || z5 || mVar.mo118647a() || z4) {
                    EventBus.getDefault().trigger(mVar);
                }
                if (isChooseFirstDay) {
                    CalendarHitPoint.m124125b(calendarSetting.getWeekStartDay().getNumber());
                }
            }
        }), calendarSetting);
    }

    @Override // com.ss.android.lark.calendar.impl.features.settings.AbstractC32460d.AbstractC32461a
    /* renamed from: a */
    public void mo118492a(String str, boolean z) {
        C31934h.m121506a().mo116559a(str, z);
        EventBus.getDefault().trigger(new C32493l());
    }
}
