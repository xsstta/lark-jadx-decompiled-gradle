package com.ss.android.vc.lark.message.meeting.cardview;

import com.bytedance.common.utility.NetworkUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57782ag;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60745ag;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.aj;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.response.C60953a;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.d */
public class C61145d {

    /* renamed from: c */
    private static C61145d f153168c;

    /* renamed from: a */
    public ConcurrentHashMap<WeakReference<C61148e>, VideoChatContent> f153169a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public Map<String, Long> f153170b = new ConcurrentHashMap();

    /* renamed from: d */
    private C60745ag.C60746a f153171d;

    /* renamed from: b */
    public long mo211442b() {
        aj settingDependency = VideoChatModuleDependency.getSettingDependency();
        if (settingDependency != null) {
            return settingDependency.getSyncNtpTimeMillis();
        }
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static C61145d m237771a() {
        C61145d dVar;
        synchronized ("MeetingCardTimerHelper") {
            if (f153168c == null) {
                f153168c = new C61145d();
            }
            dVar = f153168c;
        }
        return dVar;
    }

    /* renamed from: c */
    private void m237773c() {
        if (this.f153171d == null) {
            RunnableC611472 r0 = new Runnable() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.C61145d.RunnableC611472 */

                public void run() {
                    long b = C61145d.this.mo211442b();
                    if (C61145d.this.f153169a != null) {
                        for (WeakReference<C61148e> weakReference : C61145d.this.f153169a.keySet()) {
                            C61145d.this.mo211441a(weakReference, C61145d.this.f153169a.get(weakReference), b);
                        }
                    }
                }
            };
            long currentTimeMillis = System.currentTimeMillis();
            this.f153171d = C60745ag.m236064a(r0, (((currentTimeMillis / 1000) + 1) * 1000) - currentTimeMillis, 1000);
        }
    }

    /* renamed from: d */
    private void m237774d() {
        C60745ag.C60746a aVar = this.f153171d;
        if (aVar != null) {
            aVar.mo208366a(false);
            this.f153171d = null;
            this.f153170b.clear();
        }
    }

    /* renamed from: a */
    public String mo211437a(long j) {
        long j2 = j / 1000;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 == 0) {
            return String.format(Locale.CHINA, "%02d:%02d", Long.valueOf(j4), Long.valueOf(j5));
        }
        return String.format(Locale.CHINA, "%02d:%02d:%02d", Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5));
    }

    /* renamed from: a */
    public void mo211439a(WeakReference<C61148e> weakReference) {
        synchronized ("MeetingCardTimerHelper") {
            if (weakReference != null) {
                C60700b.m235851b("MeetingCardTimerHelper", "[unregisterViewHolder]", "" + weakReference.hashCode());
                if (this.f153169a.containsKey(weakReference)) {
                    this.f153169a.remove(weakReference);
                }
                ConcurrentHashMap<WeakReference<C61148e>, VideoChatContent> concurrentHashMap = this.f153169a;
                if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
                    m237774d();
                }
            }
        }
    }

    /* renamed from: a */
    public String mo211438a(long j, VideoChatContent.MeetingCard meetingCard) {
        long j2 = meetingCard.startTime;
        Long l = this.f153170b.get(meetingCard.meetingId);
        long j3 = 0;
        if (l != null && l.longValue() > 0) {
            j2 = l.longValue();
        }
        long j4 = j - j2;
        if (j4 < 0) {
            C60700b.m235864f("MeetingCardTimerHelper", "[getDisplayTime]", "getCurrentTimeMilllis() is less than meeting start time, force to use local time instead");
            j4 = System.currentTimeMillis() - j2;
        }
        if (j4 < 0) {
            C60700b.m235864f("MeetingCardTimerHelper", "[getDisplayTime2]", "both getCurrentTimeMilllis() and local time  are less than meeting start time, force to zero");
        } else {
            j3 = j4;
        }
        return mo211437a(j3);
    }

    /* renamed from: a */
    public void mo211440a(WeakReference<C61148e> weakReference, final VideoChatContent videoChatContent) {
        synchronized ("MeetingCardTimerHelper") {
            if (weakReference != null) {
                final String str = videoChatContent.meetingCard.meetingId;
                if (!this.f153170b.containsKey(str) && NetworkUtils.isNetworkAvailable(ar.m236694a())) {
                    this.f153170b.put(str, 0L);
                    final long currentTimeMillis = System.currentTimeMillis();
                    VcBizSender.m249305o(str).mo219889a(new AbstractC63598b<C60953a>() {
                        /* class com.ss.android.vc.lark.message.meeting.cardview.C61145d.C611461 */

                        @Override // com.ss.android.vc.net.request.AbstractC63598b
                        public void onError(C63602e eVar) {
                            C60700b.m235864f("MeetingCardTimerHelper", "[registerViewHolder2]", String.format("pullVCMeetingDuration fail, meetingNo[%s], error = %s", videoChatContent.meetingCard.meetNumber, eVar));
                        }

                        /* renamed from: a */
                        public void onSuccess(C60953a aVar) {
                            long currentTimeMillis = System.currentTimeMillis();
                            long j = aVar.f152631a + (((currentTimeMillis - currentTimeMillis) - aVar.f152632b) / 2);
                            C61145d.this.f153170b.put(str, Long.valueOf(currentTimeMillis - j));
                            C60700b.m235851b("MeetingCardTimerHelper", "[registerViewHolder]", String.format("pullVCMeetingDuration succ, meetingNo[%s], meetingDuration delta = %d", videoChatContent.meetingCard.meetNumber, Long.valueOf((j - currentTimeMillis) + videoChatContent.meetingCard.startTime)));
                        }
                    });
                }
                C60700b.m235851b("MeetingCardTimerHelper", "[registerViewHolder3]", "" + weakReference.hashCode());
                this.f153169a.put(weakReference, videoChatContent);
                if (this.f153169a.size() >= 1) {
                    m237773c();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m237772a(C61148e eVar, String str, VideoChatContent videoChatContent) {
        String str2;
        eVar.f153184h.setText(str);
        if ("01:00:00".equals(str)) {
            if (videoChatContent.meetingCard.meetingSource == 3) {
                HashMap hashMap = new HashMap();
                hashMap.put("name", videoChatContent.meetingCard.topic);
                str2 = UIHelper.mustacheFormat(ar.m236694a().getResources().getString(R.string.View_M_VideoInterviewNameBraces), hashMap);
            } else {
                str2 = videoChatContent.meetingCard.topic;
            }
            if (C57782ag.m224241a(str2)) {
                str2 = ar.m236694a().getResources().getString(R.string.View_G_ServerNoTitle);
            }
            CardViewHolderHelper.m237650a().mo211371a(eVar, str2, videoChatContent, str);
        }
    }

    /* renamed from: a */
    public void mo211441a(WeakReference<C61148e> weakReference, VideoChatContent videoChatContent, long j) {
        if (weakReference != null && videoChatContent != null) {
            C61148e eVar = weakReference.get();
            if (eVar == null) {
                C60700b.m235851b("MeetingCardTimerHelper", "[refreshTimerTextview]", "unregister because viewholder is null " + weakReference.hashCode());
                mo211439a(weakReference);
            } else if (eVar != null && eVar.f153184h != null && videoChatContent != null && videoChatContent.meetingCard != null) {
                eVar.f153184h.post(new Runnable(mo211438a(j, videoChatContent.meetingCard), videoChatContent) {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.$$Lambda$d$a14vcDarVcNBWOuDLKLQ07Szahc */
                    public final /* synthetic */ String f$1;
                    public final /* synthetic */ VideoChatContent f$2;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                    }

                    public final void run() {
                        C61145d.m237772a(C61148e.this, this.f$1, this.f$2);
                    }
                });
            }
        }
    }
}
