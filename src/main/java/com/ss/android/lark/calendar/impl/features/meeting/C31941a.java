package com.ss.android.lark.calendar.impl.features.meeting;

import android.app.Activity;
import android.text.TextUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30062a;
import com.ss.android.lark.calendar.api.p1433a.AbstractC30063b;
import com.ss.android.lark.calendar.impl.features.events.detail.C31238b;
import com.ss.android.lark.calendar.impl.features.meeting.C31941a;
import com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstanceTime;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingDependency;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.AbstractC32594f;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32661n;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.Date;

/* renamed from: com.ss.android.lark.calendar.impl.features.meeting.a */
public class C31941a implements AbstractC30063b {

    /* renamed from: a */
    public boolean f81603a;

    /* renamed from: b */
    public CalendarEventInstance f81604b;

    /* renamed from: c */
    public CallbackManager f81605c;

    /* renamed from: d */
    public AbstractC30062a f81606d;

    /* renamed from: e */
    public MeetingMintuesImpl f81607e;

    /* renamed from: f */
    public boolean f81608f = C30022a.f74886e.mo112724d();

    /* renamed from: g */
    private Activity f81609g;

    /* renamed from: h */
    private String f81610h;

    /* renamed from: i */
    private AbstractC32594f f81611i;

    /* renamed from: j */
    private MeetingMintuesImpl.IMeetingMinutesDelegate f81612j = new MeetingMintuesImpl.IMeetingMinutesDelegate() {
        /* class com.ss.android.lark.calendar.impl.features.meeting.C31941a.C319421 */

        @Override // com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl.IMeetingMinutesDelegate
        /* renamed from: a */
        public void mo116570a() {
            if (!C31941a.this.f81608f && C31941a.this.f81606d != null) {
                C31941a.this.f81606d.mo108332b();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl.IMeetingMinutesDelegate
        /* renamed from: b */
        public void mo116572b(boolean z) {
            if (!C31941a.this.f81608f && C31941a.this.f81606d != null) {
                C31941a.this.f81606d.mo108331a(z);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.meeting.MeetingMintuesImpl.IMeetingMinutesDelegate
        /* renamed from: a */
        public void mo116571a(boolean z) {
            if (!C31941a.this.f81608f && C31941a.this.f81606d != null) {
                C31941a.this.f81606d.mo108333b(z);
            }
        }
    };

    @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30063b
    /* renamed from: b */
    public void mo108335b() {
        this.f81607e.mo116588b();
    }

    @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30063b
    /* renamed from: a */
    public void mo108334a() {
        if (this.f81604b != null) {
            CalendarHitPoint.m124152o();
            C31238b.m116867a(this.f81609g, this.f81604b);
        }
    }

    @Override // com.ss.android.lark.calendar.api.p1433a.AbstractC30063b
    /* renamed from: c */
    public void mo108336c() {
        this.f81603a = true;
        this.f81605c.cancelCallbacks();
        this.f81605c = null;
        MeetingMinutesManager.f81712a.mo116619a(this.f81610h, this.f81612j);
    }

    /* renamed from: d */
    private void m121539d() {
        if (!this.f81608f && !TextUtils.isEmpty(this.f81610h)) {
            final String l = Long.toString(new Date().getTime());
            Log.m165389i("CalendarForChatSettingImpl", C32673y.m125376b(l, "getMeetingByChatId", "chat_ids", this.f81610h));
            this.f81611i.mo118857a(this.f81610h, this.f81605c.wrapAndAddGetDataCallback(new IGetDataCallback<MeetingDependency>("getMeetingByChatId") {
                /* class com.ss.android.lark.calendar.impl.features.meeting.C31941a.C319432 */

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165383e("CalendarForChatSettingImpl", C32673y.m125370a(l, "getMeetingByChatId", errorResult));
                }

                /* renamed from: a */
                public void onSuccess(MeetingDependency meetingDependency) {
                    Log.m165389i("CalendarForChatSettingImpl", C32673y.m125373a(l, "getMeetingByChatId", new String[0]));
                    if (!C31941a.this.f81603a) {
                        CalendarEvent calendarEvent = meetingDependency.getCalendarEvent();
                        CalendarEventInstanceTime calendarEventInstanceTime = meetingDependency.getCalendarEventInstanceTime();
                        C31941a.this.f81604b = new CalendarEventInstance();
                        C31941a.this.f81604b.setStartTime(calendarEventInstanceTime.getStartTime());
                        C31941a.this.f81604b.setEndTime(calendarEventInstanceTime.getEndTime());
                        C30076a.m111290a().mo108424a(calendarEvent.getCalendarId(), C31941a.this.f81605c, new C30076a.AbstractC30082b(calendarEvent) {
                            /* class com.ss.android.lark.calendar.impl.features.meeting.$$Lambda$a$2$zmrmVh6mVBsrmObAyyo92FYIFk */
                            public final /* synthetic */ CalendarEvent f$1;

                            {
                                this.f$1 = r2;
                            }

                            @Override // com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a.AbstractC30082b
                            public final void onLoadSucceed(Calendar calendar) {
                                C31941a.C319432.this.m121546a(this.f$1, calendar);
                            }
                        });
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m121546a(CalendarEvent calendarEvent, Calendar calendar) {
                    if (calendar == null) {
                        C32661n.m125344a(C31941a.this.f81604b, calendarEvent, false);
                    } else {
                        C32661n.m125343a(C31941a.this.f81604b, calendarEvent, calendar, false);
                    }
                    C31941a.this.f81606d.mo108330a();
                    C31941a.this.f81607e.mo116586a(calendarEvent, C31941a.this.f81604b);
                    C31941a.this.f81607e.mo116585a(calendarEvent);
                }
            }));
        }
    }

    /* renamed from: a */
    public static AbstractC30063b m121538a(Activity activity, String str, AbstractC30062a aVar) {
        return new C31941a(activity, str, aVar);
    }

    private C31941a(Activity activity, String str, AbstractC30062a aVar) {
        this.f81609g = activity;
        this.f81610h = str;
        this.f81606d = aVar;
        this.f81611i = C32533b.m124620a();
        this.f81605c = new CallbackManager();
        this.f81607e = MeetingMinutesManager.f81712a.mo116618a(activity, str, this.f81612j);
        m121539d();
    }
}
