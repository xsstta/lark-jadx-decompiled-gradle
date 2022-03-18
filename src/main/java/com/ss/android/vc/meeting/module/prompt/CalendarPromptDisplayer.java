package com.ss.android.vc.meeting.module.prompt;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.ss.android.vc.common.lifecycle.VCAppLifeCycle;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatPrompt;
import com.ss.android.vc.entity.request.JoinMeetingPreCheckEntityRequest;
import com.ss.android.vc.entity.response.am;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener;
import com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener;
import com.ss.android.vc.meeting.framework.statemachine.StatusNode;
import com.ss.android.vc.meeting.module.multi.ByteRTCMeetingActivity;
import com.ss.android.vc.meeting.module.preview.facade.MeetingPreviewLauncher;
import com.ss.android.vc.meeting.module.prompt.CalendarPromptView;
import com.ss.android.vc.meeting.utils.TimeConsumeUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckData;
import com.ss.android.vc.meeting.utils.meetingcheck.MeetingCheckUtils;
import com.ss.android.vc.meeting.utils.meetingcheck.rx.XConsumer;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63777y;
import com.ss.android.vc.statistics.event.aj;
import com.ss.android.vc.statistics.event2.MeetingCalEvent;
import com.ss.android.vc.statistics.p3180a.C63697g;
import com.ss.android.vcxp.C63801c;
import com.ss.android.vcxp.annotation.XClass;
import com.ss.android.vcxp.annotation.XMethod;
import io.reactivex.p3457e.C68296b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@XClass
public class CalendarPromptDisplayer implements IMeetingsSizeChangeListener, IMeetingsStateChangedListener, AbstractC62781a<VideoChatPrompt.CalendarStartPrompt> {

    /* renamed from: a */
    private Map<String, VideoChatPrompt.CalendarStartPrompt> f157917a;

    /* renamed from: b */
    private Map<String, VideoChatPrompt.CalendarStartPrompt> f157918b;

    /* renamed from: c */
    private final Object f157919c = new Object();

    /* renamed from: d */
    private CalendarPromptView f157920d;

    /* renamed from: e */
    private Handler f157921e;

    /* renamed from: f */
    private volatile boolean f157922f = false;

    /* renamed from: g */
    private WeakReference<Activity> f157923g;

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    /* renamed from: a */
    public /* synthetic */ void mo208172a(List list) {
        IMeetingsSizeChangeListener.CC.$default$a(this, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m245643d() {
        CalendarPromptView calendarPromptView = this.f157920d;
        if (calendarPromptView != null) {
            calendarPromptView.mo216811a(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m245646e() {
        CalendarPromptView calendarPromptView = this.f157920d;
        if (calendarPromptView != null) {
            calendarPromptView.mo216811a(false);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    @XMethod
    public void onMeetingsEnd() {
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[onMeetingsEnd]", "onMeetingsEnd");
        this.f157922f = false;
        UICallbackExecutor.execute(new Runnable() {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptDisplayer$4EBU6X74L9YoKjtxqXEUTNJo9k */

            public final void run() {
                CalendarPromptDisplayer.m271387lambda$4EBU6X74L9YoKjtxqXEUTNJo9k(CalendarPromptDisplayer.this);
            }
        });
    }

    public CalendarPromptDisplayer() {
        if (C63801c.m250502c()) {
            this.f157917a = new LinkedHashMap();
            this.f157918b = new HashMap();
            this.f157921e = new Handler(Looper.getMainLooper());
            MeetingManager.m238341a().addMeetingsSizeChangeListener(this);
            MeetingManager.m238341a().registerMeetingsStateChangeListener(this);
        }
    }

    /* renamed from: c */
    private Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> m245640c() {
        Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> next;
        synchronized (this.f157919c) {
            if (this.f157917a.size() <= 0 || (next = this.f157917a.entrySet().iterator().next()) == null || TextUtils.isEmpty(next.getKey()) || next.getValue() == null) {
                return null;
            }
            return next;
        }
    }

    /* renamed from: b */
    private void m245639b() {
        Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> c = m245640c();
        if (c != null) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[triggerShowFirstPrompt]", " success, promptId = " + c.getKey());
            UserInfoService.getUserInfoById(c.getValue().meetingId, c.getValue().startUser.getUserId(), c.getValue().startUser.getParticipantType(), new GetUserInfoListener(c) {
                /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptDisplayer$EH_GPUjmfmXyU9lzj4TVuBF7NJo */
                public final /* synthetic */ Map.Entry f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.ss.android.vc.net.service.GetUserInfoListener
                public final void onGetUserInfo(VideoChatUser videoChatUser) {
                    CalendarPromptDisplayer.lambda$EH_GPUjmfmXyU9lzj4TVuBF7NJo(CalendarPromptDisplayer.this, this.f$1, videoChatUser);
                }
            });
            return;
        }
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[triggerShowFirstPrompt3]", "fail, showMap is empty");
    }

    /* renamed from: a */
    public void mo216799a() {
        synchronized (this.f157919c) {
            Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> c = m245640c();
            if (c == null) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[clearShowPromptMap]", "already is empty");
                return;
            }
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[clearShowPromptMap2]", "size = " + this.f157917a.size());
            this.f157918b.put(c.getKey(), c.getValue());
            m245641c(c.getKey());
            this.f157917a.clear();
        }
    }

    /* renamed from: c */
    private void m245641c(String str) {
        this.f157921e.removeCallbacksAndMessages(null);
        UICallbackExecutor.execute(new Runnable(str) {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptDisplayer$BGdUTLdiCuS8iLZj8DZzSQ3J_Kg */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                CalendarPromptDisplayer.lambda$BGdUTLdiCuS8iLZj8DZzSQ3J_Kg(CalendarPromptDisplayer.this, this.f$1);
            }
        });
    }

    /* renamed from: a */
    public VideoChatPrompt.CalendarStartPrompt mo216798a(String str) {
        VideoChatPrompt.CalendarStartPrompt calendarStartPrompt;
        synchronized (this.f157919c) {
            calendarStartPrompt = this.f157917a.get(str);
        }
        return calendarStartPrompt;
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsSizeChangeListener
    @XMethod
    public void onMeetingsBegin(boolean z) {
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[onMeetingsBegin]", "onMeetingsBegin");
        this.f157922f = true;
    }

    /* renamed from: b */
    public void mo216802b(String str) {
        Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> c = m245640c();
        if (c == null || !c.getKey().equals(str)) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showCalendarDetailPrompt2]", " fail, firstNode not match");
            return;
        }
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showCalendarDetailPrompt]", " success, promptId = " + str);
        m245639b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m245644d(String str) {
        CalendarPromptView calendarPromptView = this.f157920d;
        if (calendarPromptView == null || !str.equals(calendarPromptView.getPromptId())) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[dismissPromptView2]", " as notification, promptId = " + str);
            VideoChatModuleDependency.getNotificationDependency().cancelPromptNotification(str);
            return;
        }
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[dismissPromptView]", " as decorView, promptId = " + str);
        this.f157920d.mo216808a();
        this.f157920d = null;
    }

    /* renamed from: b */
    public void mo216805b(List<VideoChatPrompt> list) {
        Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> c = m245640c();
        if (c != null && !c.getKey().equals(list.get(0).promptId)) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[receivePromptFromRegisterClientInfo]", " firstNode promptId not equals");
            mo216799a();
        }
        for (VideoChatPrompt videoChatPrompt : list) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[receivePromptFromRegisterClientInfo2]", " promptId = " + videoChatPrompt.promptId);
            mo216804b(videoChatPrompt.promptId, videoChatPrompt.calendarStartPrompt);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m245647e(String str, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt) {
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[startAutoDismissTimer2]", "autoDismiss now, promptId = " + str);
        mo216801a(str, calendarStartPrompt);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m245638a(Map.Entry entry, VideoChatUser videoChatUser) {
        Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> c = m245640c();
        if (c == null || !c.getKey().equals(entry.getKey())) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[triggerShowFirstPrompt2]", "fail, node is dismiss");
            return;
        }
        c.getValue().videoChatUser = videoChatUser;
        m245642c(c.getKey(), c.getValue());
    }

    /* renamed from: c */
    private void m245642c(String str, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt) {
        C63777y.m250401a(calendarStartPrompt.meetingId);
        m245645d(str, calendarStartPrompt);
        if (VCAppLifeCycle.m236255b()) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPromptView]", " app is foreground, promptId = " + str);
            Activity c = VCAppLifeCycle.m236256c();
            if (C60773o.m236120a(c)) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPromptView]2", "top activity = " + c.getClass().getSimpleName() + ", promptId = " + str);
                if (!(c instanceof ByteRTCMeetingActivity)) {
                    CalendarPromptView calendarPromptView = this.f157920d;
                    if (calendarPromptView != null) {
                        calendarPromptView.mo216808a();
                    }
                    CalendarPromptView calendarPromptView2 = new CalendarPromptView(c);
                    this.f157920d = calendarPromptView2;
                    calendarPromptView2.mo216810a(str, calendarStartPrompt, new CalendarPromptView.AbstractC62778a(calendarStartPrompt) {
                        /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptDisplayer$x_PgdPgQ8oP1cTAtMsuSntwUa1Y */
                        public final /* synthetic */ VideoChatPrompt.CalendarStartPrompt f$1;

                        {
                            this.f$1 = r2;
                        }

                        @Override // com.ss.android.vc.meeting.module.prompt.CalendarPromptView.AbstractC62778a
                        public final void onClick(String str, boolean z) {
                            CalendarPromptDisplayer.lambda$x_PgdPgQ8oP1cTAtMsuSntwUa1Y(CalendarPromptDisplayer.this, this.f$1, str, z);
                        }
                    });
                    this.f157920d.mo216811a(this.f157922f);
                    this.f157920d.mo216809a(c);
                    this.f157923g = new WeakReference<>(c);
                    C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPromptView3]", "as decorView, promptId = " + str);
                    return;
                }
            }
        }
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPromptView4]", "as notification, promptId = " + str);
        VideoChatModuleDependency.getNotificationDependency().pushPromptNotification(str);
    }

    /* renamed from: d */
    private void m245645d(String str, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt) {
        long syncNtpTimeMillis = VideoChatModuleDependency.getSettingDependency().getSyncNtpTimeMillis() - calendarStartPrompt.promptCreateTime;
        if (syncNtpTimeMillis < 0 || syncNtpTimeMillis > 60000) {
            syncNtpTimeMillis = 0;
        }
        long j = 60000 - syncNtpTimeMillis;
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[startAutoDismissTimer]", "delay = " + j + ", promptId = " + str);
        this.f157921e.removeCallbacksAndMessages(null);
        this.f157921e.postDelayed(new Runnable(str, calendarStartPrompt) {
            /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptDisplayer$8QXsGhC7xiniPCsxxuQCwnfSuc */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ VideoChatPrompt.CalendarStartPrompt f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                CalendarPromptDisplayer.m271388lambda$8QXsGhC7xiniPCsxxuQCwnfSuc(CalendarPromptDisplayer.this, this.f$1, this.f$2);
            }
        }, j);
    }

    /* renamed from: b */
    public void mo216801a(String str, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt) {
        synchronized (this.f157919c) {
            this.f157918b.put(str, calendarStartPrompt);
            Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> c = m245640c();
            if (c == null) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[dismissPrompt]", "fail: showMap is empty");
            } else if (!this.f157917a.containsKey(str)) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[dismissPrompt2]", "fail: promptId = " + str + " not in showMap");
            } else {
                if (c.getKey().equals(str)) {
                    C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[dismissPrompt3]", "success: promptId = " + str);
                    this.f157917a.remove(str);
                    m245641c(str);
                    m245639b();
                } else {
                    C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[dismissPrompt4]", "promptId = " + str + " just remove");
                    this.f157917a.remove(str);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo216804b(String str, VideoChatPrompt.CalendarStartPrompt calendarStartPrompt) {
        if (calendarStartPrompt == null || calendarStartPrompt.startUser == null) {
            C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPrompt]", " fail: prompt or prompt.startUser is null");
            return;
        }
        synchronized (this.f157919c) {
            if (this.f157918b.containsKey(str)) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPrompt2]", "promptId = " + str + " already in dismissMap");
            } else if (this.f157917a.containsKey(str)) {
                C60700b.m235861e("PromptLog_CalendarPromptDisplayer", "[showPrompt3]", "promptId = " + str + " already in showMap");
            } else {
                this.f157917a.put(str, calendarStartPrompt);
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[showPrompt4]", "showMap size " + this.f157917a.size());
                if (this.f157917a.size() == 1) {
                    m245639b();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m245636a(String str, final VideoChatPrompt.CalendarStartPrompt calendarStartPrompt, boolean z) {
        Activity activity;
        C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[onUserClick]", " promptId = " + str + ", isJoin = " + z);
        mo216801a(str, calendarStartPrompt);
        VcBizSender.m249147a(VideoChatPrompt.Type.CALENDAR_START, z, str).mo219893b(new AbstractC63598b<am>() {
            /* class com.ss.android.vc.meeting.module.prompt.CalendarPromptDisplayer.C627761 */

            /* renamed from: a */
            public void onSuccess(am amVar) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[onUserClick2]", "replyVideoChatPrompt success");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[onUserClick3]", "replyVideoChatPrompt error: " + eVar.toString());
            }
        });
        final String uuid = UUID.randomUUID().toString();
        if (z) {
            C63697g.m249703a();
            final C68296b<Boolean> a = TimeConsumeUtils.m248927a("PromptLog_CalendarPromptDisplayer:onUserClick:MeetingCheck");
            C63777y.m250403a(true, calendarStartPrompt.meetingId);
            MeetingCalEvent.m249778b().mo220269a("join", "vc_meeting_pre_view", null, null, uuid);
            aj.m250014a("calendar_reminder", calendarStartPrompt.uniqueId, uuid);
            WeakReference<Activity> weakReference = this.f157923g;
            if (weakReference == null || !C60773o.m236120a(weakReference.get())) {
                activity = ar.m236694a();
            } else {
                activity = this.f157923g.get();
            }
            MeetingCheckUtils.meetingCheck(activity, calendarStartPrompt.meetingId, JoinMeetingPreCheckEntityRequest.JoinMeetingCheckIDType.MEETINGID, false, "calendar_reminder", uuid, 1, true).subscribe(new XConsumer<MeetingCheckData>() {
                /* class com.ss.android.vc.meeting.module.prompt.CalendarPromptDisplayer.C627772 */

                @XMethod
                public void accept(MeetingCheckData bVar) throws Exception {
                    if (bVar.mo219661a().booleanValue()) {
                        TimeConsumeUtils.m248928a(a);
                        MeetingPreviewLauncher.showJoinPreviewPage(ar.m236694a(), calendarStartPrompt.eventTitle, calendarStartPrompt.meetingId, false, uuid, bVar.mo219666c());
                    }
                }
            });
            return;
        }
        C63777y.m250403a(false, calendarStartPrompt.meetingId);
        MeetingCalEvent.m249778b().mo220269a("dismiss", "none", null, null, uuid);
    }

    @Override // com.ss.android.vc.meeting.framework.manager.interfaces.IMeetingsStateChangedListener
    @XMethod
    public void stateChanged(String str, StatusNode statusNode, VideoChat videoChat) {
        if (statusNode == StatusNode.Ringing) {
            synchronized (this.f157919c) {
                Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> entry = null;
                Iterator<Map.Entry<String, VideoChatPrompt.CalendarStartPrompt>> it = this.f157917a.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, VideoChatPrompt.CalendarStartPrompt> next = it.next();
                    if (!TextUtils.isEmpty(str) && str.equals(next.getValue().meetingId)) {
                        entry = next;
                        break;
                    }
                }
                if (entry != null) {
                    C60700b.m235851b("PromptLog_CalendarPromptDisplayer", "[stateChanged]", "receiveRinging: meetingId = " + str + ", promptId = " + entry.getKey());
                    mo216801a(entry.getKey(), entry.getValue());
                    return;
                }
            }
        }
        if (this.f157922f && statusNode != StatusNode.Idle) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.vc.meeting.module.prompt.$$Lambda$CalendarPromptDisplayer$1PWQ_P_ayx2CSRXRrHymXBx7Erg */

                public final void run() {
                    CalendarPromptDisplayer.lambda$1PWQ_P_ayx2CSRXRrHymXBx7Erg(CalendarPromptDisplayer.this);
                }
            });
        }
    }
}
