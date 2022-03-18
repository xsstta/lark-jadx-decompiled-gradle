package com.ss.android.lark.calendar.impl.features.meeting;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30065a;
import com.ss.android.lark.calendar.api.p1434b.AbstractC30066b;
import com.ss.android.lark.calendar.impl.features.calendarview.C30810k;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.meeting.C31944b;
import com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl;
import com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstanceTime;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingDependency;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.rustadapter.service.CalendarSDKService;
import com.ss.android.lark.calendar.impl.utils.C32661n;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.Date;

/* renamed from: com.ss.android.lark.calendar.impl.features.meeting.b */
public class C31944b implements AbstractC30066b, C31954a.AbstractC31959a {

    /* renamed from: a */
    Activity f81617a;

    /* renamed from: b */
    String f81618b;

    /* renamed from: c */
    String f81619c;

    /* renamed from: d */
    AbstractC32594f f81620d;

    /* renamed from: e */
    C31954a f81621e;

    /* renamed from: f */
    CalendarEvent f81622f;

    /* renamed from: g */
    CalendarEventInstance f81623g;

    /* renamed from: h */
    String f81624h;

    /* renamed from: i */
    boolean f81625i;

    /* renamed from: j */
    CallbackManager f81626j;

    /* renamed from: k */
    public AbstractC30065a f81627k;

    /* renamed from: l */
    public MeetingMintuesImpl f81628l;

    /* renamed from: m */
    public boolean f81629m = C30022a.f74886e.mo112724d();

    /* renamed from: n */
    private MeetingMintuesImpl.IMeetingMinutesDelegate f81630n = new MeetingMintuesImpl.IMeetingMinutesDelegate() {
        /* class com.ss.android.lark.calendar.impl.features.meeting.C31944b.C319451 */

        @Override // com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl.IMeetingMinutesDelegate
        /* renamed from: a */
        public void mo116570a() {
            if (!C31944b.this.f81629m && C31944b.this.f81627k != null) {
                C31944b.this.f81627k.mo108343c();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl.IMeetingMinutesDelegate
        /* renamed from: b */
        public void mo116572b(boolean z) {
            if (!C31944b.this.f81629m && C31944b.this.f81627k != null) {
                C31944b.this.f81627k.mo108340a(z);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl.IMeetingMinutesDelegate
        /* renamed from: a */
        public void mo116571a(boolean z) {
            if (!C31944b.this.f81629m && C31944b.this.f81627k != null) {
                C31944b.this.f81627k.mo108342b(z);
            }
        }
    };

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.AbstractC31959a
    /* renamed from: c */
    public void mo116577c() {
        this.f81627k.mo108337a();
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.AbstractC31959a
    /* renamed from: f */
    public void mo116580f() {
        CalendarEventInstance calendarEventInstance = this.f81623g;
        if (calendarEventInstance != null) {
            C31238b.m116867a(this.f81617a, calendarEventInstance);
        }
    }

    @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30066b
    /* renamed from: a */
    public void mo108344a() {
        this.f81625i = true;
        this.f81626j.cancelCallbacks();
        this.f81626j = null;
        this.f81628l.mo116583a();
        this.f81621e.mo116614d();
    }

    @Override // com.ss.android.lark.calendar.api.p1434b.AbstractC30066b
    /* renamed from: b */
    public int mo108345b() {
        boolean z = false;
        if (this.f81622f == null) {
            return 0;
        }
        String c = C30810k.m114955a().mo111644c();
        if (!TextUtils.isEmpty(c)) {
            z = c.equals(this.f81622f.getOrganizerCalendarId());
        }
        boolean z2 = !TextUtils.isEmpty(this.f81622f.getRRule());
        if (z) {
            if (z2) {
                return 1;
            }
            return 2;
        } else if (z2) {
            return 3;
        } else {
            return 4;
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.AbstractC31959a
    /* renamed from: d */
    public void mo116578d() {
        this.f81627k.mo108338a(0);
        String l = Long.toString(new Date().getTime());
        Log.m165389i("CalendarForChatWindowImpl", C32673y.m125376b(l, "markMeetingScrollClicked", "meeting_id", this.f81624h));
        this.f81620d.mo118858a(this.f81624h, ScrollType.EVENT_INFO, (IGetDataCallback<Object>) null);
        Log.m165389i("CalendarForChatWindowImpl", C32673y.m125373a(l, "markMeetingScrollClicked", new String[0]));
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.AbstractC31959a
    /* renamed from: e */
    public void mo116579e() {
        this.f81627k.mo108338a(0);
        String l = Long.toString(new Date().getTime());
        Log.m165389i("CalendarForChatWindowImpl", C32673y.m125376b(l, "markTransferScrollClicked", "meeting_id", this.f81624h));
        this.f81620d.mo118858a(this.f81624h, ScrollType.MEETING_TRANSFER_CHAT, (IGetDataCallback<Object>) null);
        Log.m165389i("CalendarForChatWindowImpl", C32673y.m125373a(l, "markTransferScrollClicked", new String[0]));
    }

    /* renamed from: g */
    private void m121549g() {
        if (!this.f81629m && !TextUtils.isEmpty(this.f81618b)) {
            final String l = Long.toString(new Date().getTime());
            Log.m165389i("CalendarForChatWindowImpl", C32673y.m125376b(l, "getMeetingByChatId", "chat_ids", this.f81618b));
            this.f81620d.mo118857a(this.f81618b, this.f81626j.wrapAndAddGetDataCallback(new IGetDataCallback<MeetingDependency>("getMeetingByChatId") {
                /* class com.ss.android.lark.calendar.impl.features.meeting.C31944b.C319462 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("CalendarForChatWindowImpl", C32673y.m125370a(l, "getMeetingByChatId", errorResult));
                }

                /* renamed from: a */
                public void onSuccess(MeetingDependency meetingDependency) {
                    Log.m165389i("CalendarForChatWindowImpl", C32673y.m125373a(l, "getMeetingByChatId", new String[0]));
                    if (!C31944b.this.f81625i) {
                        C31944b.this.f81622f = meetingDependency.getCalendarEvent();
                        boolean shouldShowScroll = meetingDependency.getMeeting().getShouldShowScroll();
                        CalendarEventInstanceTime calendarEventInstanceTime = meetingDependency.getCalendarEventInstanceTime();
                        C31944b.this.f81624h = meetingDependency.getMeeting().getId();
                        C31944b.this.f81623g = new CalendarEventInstance();
                        C31944b.this.f81623g.setStartTime(calendarEventInstanceTime.getStartTime());
                        C31944b.this.f81623g.setEndTime(calendarEventInstanceTime.getEndTime());
                        C30076a.m111290a().mo108424a(C31944b.this.f81622f.getCalendarId(), C31944b.this.f81626j, new C30076a.AbstractC30082b(shouldShowScroll) {
                            /* class com.ss.android.lark.calendar.impl.features.meeting.$$Lambda$b$2$VSsq17kq4VIbtxtQBK2X44_BFrI */
                            public final /* synthetic */ boolean f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.AbstractC30082b
                            public final void onLoadSucceed(Calendar calendar) {
                                C31944b.C319462.this.m121562a(this.f$1, calendar);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m121562a(boolean z, Calendar calendar) {
                    if (calendar == null) {
                        C32661n.m125344a(C31944b.this.f81623g, C31944b.this.f81622f, false);
                    } else {
                        C32661n.m125343a(C31944b.this.f81623g, C31944b.this.f81622f, calendar, false);
                    }
                    C31944b.this.f81627k.mo108341b();
                    C31944b.this.f81628l.mo116586a(C31944b.this.f81622f, C31944b.this.f81623g);
                    C31944b.this.f81628l.mo116585a(C31944b.this.f81622f);
                    C31944b.this.mo116576a(z);
                }
            }));
        }
    }

    /* renamed from: a */
    public void mo116574a(ScrollType scrollType) {
        CalendarEventInstance calendarEventInstance;
        CalendarEvent calendarEvent = this.f81622f;
        if (calendarEvent != null && (calendarEventInstance = this.f81623g) != null) {
            this.f81621e.mo116611a(scrollType, this.f81618b, this.f81619c, calendarEvent, calendarEventInstance);
            this.f81627k.mo108338a(1);
            this.f81627k.mo108339a(this.f81621e.mo116612b());
            this.f81621e.mo116613c();
        }
    }

    /* renamed from: a */
    public void mo116576a(final boolean z) {
        if (!TextUtils.isEmpty(this.f81618b)) {
            final String l = Long.toString(new Date().getTime());
            Log.m165389i("CalendarForChatWindowImpl", C32673y.m125376b(l, "getBannerViewType", "chat_id", this.f81618b));
            CalendarSDKService.m124699b(this.f81618b, this.f81626j.wrapAndAddGetDataCallback(new IGetDataCallback<Boolean>("getBannerViewType") {
                /* class com.ss.android.lark.calendar.impl.features.meeting.C31944b.C319473 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    if (z) {
                        C31944b.this.mo116574a(ScrollType.EVENT_INFO);
                    }
                    Log.m165383e("CalendarForChatWindowImpl", C32673y.m125370a(l, "getBannerViewType", errorResult));
                }

                /* renamed from: a */
                public void onSuccess(Boolean bool) {
                    if (bool.booleanValue()) {
                        C31944b.this.mo116574a(ScrollType.MEETING_TRANSFER_CHAT);
                    } else if (z) {
                        C31944b.this.mo116574a(ScrollType.EVENT_INFO);
                    }
                    String str = l;
                    String str2 = "getBannerViewType";
                    Log.m165389i("CalendarForChatWindowImpl", C32673y.m125373a(str, str2, "showScroll=" + bool));
                }
            }));
        }
    }

    @Override // com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.AbstractC31959a
    /* renamed from: a */
    public void mo116575a(String str, IGetDataCallback<Boolean> iGetDataCallback) {
        CalendarSDKService.m124698a(str, iGetDataCallback);
    }

    /* renamed from: a */
    public static AbstractC30066b m121548a(Activity activity, String str, String str2, AbstractC30065a aVar) {
        return new C31944b(activity, str, str2, aVar);
    }

    private C31944b(Activity activity, String str, String str2, AbstractC30065a aVar) {
        this.f81617a = activity;
        this.f81618b = str;
        this.f81619c = str2;
        this.f81627k = aVar;
        this.f81620d = C32533b.m124620a();
        this.f81621e = new C31954a(activity, this);
        this.f81626j = new CallbackManager();
        MeetingMintuesImpl cVar = new MeetingMintuesImpl(activity, str);
        this.f81628l = cVar;
        cVar.mo116584a(this.f81630n);
        m121549g();
    }
}
