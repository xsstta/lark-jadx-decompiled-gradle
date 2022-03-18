package com.ss.android.lark.calendar.impl.features.meeting.chatwiget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.lark.pb.basic.v1.Command;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDDialogBuilder;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.CalendarHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType;
import com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a;
import com.ss.android.lark.calendar.impl.rustadapter.push.CalendarPushProcess;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.aj;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.features.meeting.chatwiget.a */
public class C31954a {

    /* renamed from: a */
    public AbstractC31960b f81690a;

    /* renamed from: b */
    public AbstractC31959a f81691b;

    /* renamed from: c */
    public boolean f81692c;

    /* renamed from: d */
    public String f81693d;

    /* renamed from: e */
    public ScrollType f81694e;

    /* renamed from: f */
    private Activity f81695f;

    /* renamed from: g */
    private AbstractC32524a f81696g;

    /* renamed from: h */
    private int f81697h;

    /* renamed from: i */
    private int f81698i;

    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.chatwiget.a$a */
    public interface AbstractC31959a {
        /* renamed from: a */
        void mo116575a(String str, IGetDataCallback<Boolean> iGetDataCallback);

        /* renamed from: c */
        void mo116577c();

        /* renamed from: d */
        void mo116578d();

        /* renamed from: e */
        void mo116579e();

        /* renamed from: f */
        void mo116580f();
    }

    /* renamed from: b */
    public View mo116612b() {
        return this.f81690a;
    }

    /* renamed from: d */
    public void mo116614d() {
        m121609h();
    }

    /* renamed from: c */
    public void mo116613c() {
        this.f81690a.mo116605c();
    }

    /* renamed from: h */
    private void m121609h() {
        if (this.f81696g != null) {
            CalendarPushProcess.f83425a.mo118827b(Command.PUSH_SCROLL_CLOSED_NOTIFICATION, this.f81696g);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.meeting.chatwiget.a$4 */
    public static /* synthetic */ class C319584 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81703a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType[] r0 = com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.C319584.f81703a = r0
                com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType.MEETING_TRANSFER_CHAT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.C319584.f81703a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType r1 = com.ss.android.lark.calendar.impl.rustadapter.doentity.ScrollType.EVENT_INFO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.C319584.<clinit>():void");
        }
    }

    /* renamed from: e */
    private void m121606e() {
        $$Lambda$a$eqU7erIQq7BrMLOEhxTlVK4sNds r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.$$Lambda$a$eqU7erIQq7BrMLOEhxTlVK4sNds */

            public final void onClick(View view) {
                C31954a.this.m121605d(view);
            }
        };
        $$Lambda$a$Lffc2eI0BeCYDjEmcsVoqV9xthg r1 = new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.$$Lambda$a$Lffc2eI0BeCYDjEmcsVoqV9xthg */

            public final void onClick(View view) {
                C31954a.this.m121604c(view);
            }
        };
        this.f81690a.setConfirmListener(r0);
        this.f81690a.setCloseListener(r1);
    }

    /* renamed from: f */
    private void m121607f() {
        $$Lambda$a$a4QMmVUtUQKADRZ5lQjSQy84QuY r0 = new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.$$Lambda$a$a4QMmVUtUQKADRZ5lQjSQy84QuY */

            public final void onClick(View view) {
                C31954a.this.m121603b((C31954a) view);
            }
        };
        $$Lambda$a$_miAUWRXz34Z4WkhxkXqZ9UdQc r1 = new View.OnClickListener() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.$$Lambda$a$_miAUWRXz34Z4WkhxkXqZ9UdQc */

            public final void onClick(View view) {
                C31954a.this.m121600a((C31954a) view);
            }
        };
        this.f81690a.setOnClickListener(r0);
        this.f81690a.setConfirmListener(r0);
        this.f81690a.setCloseListener(r1);
    }

    /* renamed from: g */
    private void m121608g() {
        this.f81696g = new AbstractC32524a() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.C319573 */

            @Override // com.ss.android.lark.calendar.impl.rustadapter.p1574b.AbstractC32524a
            public void onPush(JSONObject jSONObject) {
                Log.m165389i("BannersViewController", C32673y.m125374b("pushBannerClose"));
                ScrollType scrollType = (ScrollType) jSONObject.get("calendar_scroll_type");
                String string = jSONObject.getString("calendar_chat_id");
                if (scrollType != null && scrollType == C31954a.this.f81694e && string != null && string.equals(C31954a.this.f81693d)) {
                    C31954a.this.mo116610a();
                }
            }
        };
        CalendarPushProcess.f83425a.mo118826a(Command.PUSH_SCROLL_CLOSED_NOTIFICATION, this.f81696g);
    }

    /* renamed from: a */
    public void mo116610a() {
        this.f81691b.mo116577c();
    }

    /* renamed from: b */
    private void m121602b(final Context context) {
        this.f81691b.mo116575a(this.f81693d, new IGetDataCallback<Boolean>() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.C319562 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m121615a() {
                C31954a.this.mo116610a();
                C31954a.this.f81691b.mo116579e();
                C31954a.this.f81692c = false;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                UICallbackExecutor.post(new Runnable() {
                    /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.$$Lambda$a$2$JVmZBFzQe8RkGY5k2z8tlWLVu50 */

                    public final void run() {
                        C31954a.C319562.this.m121615a();
                    }
                });
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                LKUIToast.show(context, C32634ae.m125182b(R.string.Calendar_SubscribeCalendar_OperationFailed));
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m121600a(View view) {
        mo116610a();
        this.f81691b.mo116579e();
        this.f81692c = false;
        CalendarHitPoint.m124115Q();
        GeneralHitPoint.m124243e("degrade_meeting");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m121603b(View view) {
        m121597a(this.f81690a.getContext());
        CalendarHitPoint.m124114P();
        GeneralHitPoint.m124243e("degrade_meeting");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m121604c(View view) {
        mo116610a();
        this.f81691b.mo116578d();
        this.f81692c = false;
        CalendarHitPoint.m124148m();
        GeneralHitPoint.m124243e("meeting");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m121605d(View view) {
        this.f81691b.mo116578d();
        this.f81691b.mo116580f();
        this.f81692c = false;
        view.setClickable(false);
        this.f81690a.postDelayed(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.C31954a.RunnableC319551 */

            public void run() {
                C31954a.this.mo116610a();
            }
        }, 300);
        CalendarHitPoint.m124146l();
        GeneralHitPoint.m124243e("meeting");
    }

    /* renamed from: a */
    private void m121597a(Context context) {
        String string = UIHelper.getString(R.string.Calendar_Setting_ConfirmTransform);
        String string2 = UIHelper.getString(R.string.Calendar_Setting_TransformGroupConfirmSubtitle);
        GeneralHitPoint.m124257l();
        ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) ((UDDialogBuilder) new UDDialogBuilder(context).title(string)).message(string2)).addActionButton(R.id.ud_dialog_btn_primary, R.string.Lark_Legacy_ConfirmTip, new DialogInterface.OnClickListener(context) {
            /* class com.ss.android.lark.calendar.impl.features.meeting.chatwiget.$$Lambda$a$Ulcx89xjMrx1BZu_krbXljN0Vhw */
            public final /* synthetic */ Context f$1;

            {
                this.f$1 = r2;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C31954a.this.m121598a((C31954a) this.f$1, (Context) dialogInterface, (DialogInterface) i);
            }
        })).addActionButton(R.id.ud_dialog_btn_secondary, R.string.Lark_Legacy_Cancel, $$Lambda$a$ObS8q3Z3vJtna14xHrZ_ZEyVrg8.INSTANCE)).messageTextColor(R.color.text_caption)).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m121599a(DialogInterface dialogInterface, int i) {
        CalendarHitPoint.m124117S();
        GeneralHitPoint.m124263o();
    }

    public C31954a(Activity activity, AbstractC31959a aVar) {
        this.f81691b = aVar;
        this.f81695f = activity;
        this.f81697h = UIUtils.dp2px(activity, 50.0f);
        this.f81698i = UIUtils.dp2px(activity, 43.0f) + C30022a.f74882a.utilsDependency().mo108192a(activity);
        m121608g();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m121598a(Context context, DialogInterface dialogInterface, int i) {
        m121602b(context);
        GeneralHitPoint.m124261n();
        CalendarHitPoint.m124116R();
    }

    /* renamed from: a */
    private void m121601a(String str, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance) {
        calendarEvent.getSummary();
        String summary = calendarEvent.getSummary();
        if (TextUtils.isEmpty(summary)) {
            summary = C32634ae.m125182b(R.string.Calendar_Common_NoTitle);
        }
        String str2 = null;
        if (summary.equals(str)) {
            summary = null;
        }
        StringBuilder sb = new StringBuilder();
        List<String> meetingRooms = calendarEventInstance.getMeetingRooms();
        if (meetingRooms != null) {
            for (String str3 : meetingRooms) {
                if (!aj.m125201a(str3)) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
        }
        if (calendarEvent.getLocation() != null) {
            str2 = calendarEvent.getLocation().getLocation();
        }
        if (!TextUtils.isEmpty(str2)) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(str2);
        }
        this.f81690a.mo116603a(summary, C32646c.m125261a(calendarEventInstance), sb.toString());
    }

    /* renamed from: a */
    public void mo116611a(ScrollType scrollType, String str, String str2, CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance) {
        this.f81694e = scrollType;
        this.f81693d = str;
        this.f81692c = true;
        if (C319584.f81703a[scrollType.ordinal()] != 1) {
            this.f81690a = new BannerView(this.f81695f);
            m121601a(str2, calendarEvent, calendarEventInstance);
            m121606e();
            return;
        }
        this.f81690a = new BannerDialog(this.f81695f);
        m121607f();
    }
}
