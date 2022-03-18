package com.ss.android.vc.meeting.framework.statemachine;

import android.os.Handler;
import android.text.TextUtils;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import com.ss.android.vc.trace.C63784a;
import java.util.LinkedList;

public class SyncQueuePolicy {

    /* renamed from: a */
    public static volatile boolean f153683a;

    /* renamed from: b */
    public static String f153684b;

    /* renamed from: c */
    public static SyncAction f153685c;

    /* renamed from: d */
    private C61355p f153686d;

    /* renamed from: e */
    private Handler f153687e;

    /* renamed from: f */
    private LinkedList<C61344j> f153688f = new LinkedList<>();

    /* renamed from: g */
    private Runnable f153689g = new Runnable() {
        /* class com.ss.android.vc.meeting.framework.statemachine.SyncQueuePolicy.RunnableC613332 */

        public void run() {
            synchronized (SyncQueuePolicy.this) {
                C60871a.m236611b("SyncQueuePolicy", "[resetRunnable] time out then reset");
                SyncQueuePolicy.f153683a = false;
                SyncQueuePolicy.f153684b = null;
                SyncQueuePolicy.f153685c = null;
                SyncQueuePolicy.this.mo212290a();
                SyncQueuePolicy.this.mo212292a(-1, 0);
            }
        }
    };

    public enum SyncAction {
        UiDestroy
    }

    /* renamed from: b */
    private void m238925b() {
        this.f153687e.postDelayed(this.f153689g, 2000);
    }

    /* renamed from: a */
    public void mo212290a() {
        this.f153687e.removeCallbacks(this.f153689g);
    }

    /* renamed from: a */
    private void m238924a(Object obj) {
        this.f153688f.add((C61344j) obj);
    }

    public SyncQueuePolicy(C61355p pVar) {
        this.f153686d = pVar;
        this.f153687e = pVar.mo212357d();
    }

    /* renamed from: a */
    public synchronized void mo212294a(C61344j jVar) {
        m238924a((Object) jVar);
        String str = "unknown";
        if (!(jVar == null || jVar.f153704b == null || TextUtils.isEmpty(jVar.f153704b.getId()))) {
            str = jVar.f153704b.getId();
        }
        C60871a.m236611b("SyncQueuePolicy", "[insertTriggerCommand] <new message> comming, event=" + C61340f.m238967a(jVar.f153703a) + ", meeting = " + str);
        mo212292a(jVar.f153703a, 0);
    }

    /* renamed from: b */
    public synchronized void mo212295b(SyncAction syncAction) {
        VideoChat videoChat;
        String str;
        String str2 = "";
        C61355p pVar = this.f153686d;
        String str3 = null;
        if (pVar != null) {
            videoChat = pVar.mo212378f();
        } else {
            videoChat = null;
        }
        if (videoChat != null && !TextUtils.isEmpty(videoChat.getCreatingId())) {
            str2 = videoChat.getCreatingId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[startSync] <sync> id=");
        sb.append(str2);
        sb.append(" , syncAction=");
        if (syncAction == null) {
            str = null;
        } else {
            str = syncAction.toString();
        }
        sb.append(str);
        sb.append(" , mSyncMeetingId=");
        sb.append(f153684b);
        sb.append(" , mSyncAction=");
        SyncAction syncAction2 = f153685c;
        if (syncAction2 != null) {
            str3 = syncAction2.toString();
        }
        sb.append(str3);
        C60871a.m236611b("SyncQueuePolicy", sb.toString());
        f153683a = true;
        f153684b = str2;
        f153685c = syncAction;
        mo212290a();
        m238925b();
    }

    /* renamed from: a */
    public synchronized void mo212291a(int i) {
        C61344j removeFirst;
        C63784a.m250428a("[VideoChat_SyncQueuePolicy_getMessageAndSend]");
        if (f153683a) {
            mo212292a(i, 100);
            return;
        }
        C60871a.m236611b("SyncQueuePolicy", "[getMessageAndSend] <new message> consumed, event=" + C61340f.m238967a(i));
        C60871a.m236611b("SyncQueuePolicy", "[getMessageAndSend] mSyncQueue.size()=" + this.f153688f.size());
        if (!this.f153688f.isEmpty() && (removeFirst = this.f153688f.removeFirst()) != null) {
            C60871a.m236611b("SyncQueuePolicy", "[getMessageAndSend] sendReally event=" + C61340f.m238967a(removeFirst.f153703a));
            this.f153686d.mo212377b(removeFirst);
        }
        C63784a.m250429b("[VideoChat_SyncQueuePolicy_getMessageAndSend]");
    }

    /* renamed from: a */
    public synchronized void mo212293a(SyncAction syncAction) {
        VideoChat videoChat;
        String str;
        String str2;
        SyncAction syncAction2;
        String str3 = "";
        C61355p pVar = this.f153686d;
        if (pVar != null) {
            videoChat = pVar.mo212378f();
        } else {
            videoChat = null;
        }
        if (videoChat != null && !TextUtils.isEmpty(videoChat.getCreatingId())) {
            str3 = videoChat.getCreatingId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[notifySyncDone] <sync> id=");
        sb.append(str3);
        sb.append(" , syncAction=");
        if (syncAction == null) {
            str = null;
        } else {
            str = syncAction.toString();
        }
        sb.append(str);
        sb.append(" , mSyncMeetingId=");
        sb.append(f153684b);
        sb.append(" , mSyncAction=");
        SyncAction syncAction3 = f153685c;
        if (syncAction3 == null) {
            str2 = null;
        } else {
            str2 = syncAction3.toString();
        }
        sb.append(str2);
        C60871a.m236611b("SyncQueuePolicy", sb.toString());
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(f153684b) || !str3.equals(f153684b) || syncAction == null || (syncAction2 = f153685c) == null || syncAction != syncAction2) {
            C60871a.m236611b("SyncQueuePolicy", "[notifySyncDone] <sync> remove sync fail");
        } else {
            f153683a = false;
            f153684b = null;
            f153685c = null;
            mo212290a();
            mo212292a(-1, 0);
            C60871a.m236611b("SyncQueuePolicy", "[notifySyncDone] <sync> remove sync success");
        }
    }

    /* renamed from: a */
    public void mo212292a(final int i, int i2) {
        this.f153687e.postDelayed(new Runnable() {
            /* class com.ss.android.vc.meeting.framework.statemachine.SyncQueuePolicy.RunnableC613321 */

            public void run() {
                SyncQueuePolicy.this.mo212291a(i);
            }
        }, (long) i2);
    }
}
