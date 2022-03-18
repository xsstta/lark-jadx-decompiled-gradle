package com.ss.android.vc.meeting.framework.manager;

import android.text.TextUtils;
import com.larksuite.framework.thread.C26171w;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.C61266a;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61284a;
import com.ss.android.vc.meeting.framework.manager.interfaces.AbstractC61285b;
import com.ss.android.vc.meeting.framework.statemachine.C61344j;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.framework.manager.c */
public class C61275c {

    /* renamed from: a */
    public AbstractC61285b f153504a;

    /* renamed from: b */
    private AbstractC61284a f153505b;

    /* renamed from: c */
    private List<AbstractC61279a> f153506c = new ArrayList();

    /* renamed from: d */
    private List<AbstractC61280b> f153507d = new ArrayList();

    /* renamed from: e */
    private LinkedList<C61344j> f153508e = new LinkedList<>();

    /* renamed from: com.ss.android.vc.meeting.framework.manager.c$a */
    public interface AbstractC61279a {
        /* renamed from: a */
        boolean mo211934a(C61344j jVar);
    }

    /* renamed from: com.ss.android.vc.meeting.framework.manager.c$b */
    public interface AbstractC61280b {
        /* renamed from: a */
        boolean mo211935a(C61344j jVar);
    }

    /* renamed from: b */
    public boolean mo211933b() {
        return this.f153505b.mo211929j();
    }

    /* renamed from: d */
    private void m238409d() {
        AbstractC61280b bVar;
        this.f153507d.clear();
        if (C61266a.m238332a() != null) {
            bVar = C61266a.m238332a().mo210468b();
        } else {
            bVar = null;
        }
        if (bVar != null) {
            this.f153507d.add(bVar);
        }
    }

    /* renamed from: c */
    private void m238406c() {
        this.f153506c.clear();
        this.f153506c.add(new AbstractC61279a() {
            /* class com.ss.android.vc.meeting.framework.manager.C61275c.C612761 */

            @Override // com.ss.android.vc.meeting.framework.manager.C61275c.AbstractC61279a
            /* renamed from: a */
            public boolean mo211934a(C61344j jVar) {
                VideoChat videoChat = jVar.f153704b;
                boolean z = true;
                if (!C61275c.m238403a(videoChat) ? !C61275c.m238404b(videoChat) || !C61275c.this.f153504a.mo211953b(videoChat) : !C61275c.this.f153504a.mo211950a(videoChat)) {
                    z = false;
                }
                C60871a.m236609a("EventQueuePolicy", "[shouldAbandonCase1] return " + z);
                return z;
            }
        });
        this.f153506c.add(new AbstractC61279a() {
            /* class com.ss.android.vc.meeting.framework.manager.C61275c.C612772 */

            @Override // com.ss.android.vc.meeting.framework.manager.C61275c.AbstractC61279a
            /* renamed from: a */
            public boolean mo211934a(C61344j jVar) {
                boolean z;
                if (jVar.f153703a != 100 || C61275c.this.mo211933b()) {
                    z = false;
                } else {
                    z = true;
                }
                C60871a.m236609a("EventQueuePolicy", "[shouldAbandonCase2] return " + z);
                return z;
            }
        });
        this.f153506c.add(new AbstractC61279a() {
            /* class com.ss.android.vc.meeting.framework.manager.C61275c.C612783 */

            @Override // com.ss.android.vc.meeting.framework.manager.C61275c.AbstractC61279a
            /* renamed from: a */
            public boolean mo211934a(C61344j jVar) {
                boolean z;
                VideoChat videoChat = jVar.f153704b;
                if (videoChat == null || (videoChat.getVendorType() != VideoChat.VendorType.ZOOM && !"zoom".equalsIgnoreCase(videoChat.getSdkType()))) {
                    z = false;
                } else {
                    z = true;
                }
                C60871a.m236609a("EventQueuePolicy", "[shouldAbandonCase3] return " + z);
                return z;
            }
        });
    }

    /* renamed from: a */
    public synchronized void mo211931a() {
        int size = this.f153508e.size();
        if (size >= 1) {
            while (size > 0) {
                C60871a.m236611b("EventQueuePolicy", "[notifyEpollEvents] size>0, = " + size);
                size += -1;
                mo211932a(this.f153508e.remove());
            }
        }
    }

    /* renamed from: c */
    private boolean m238408c(C61344j jVar) {
        int i = jVar.f153703a;
        return false;
    }

    /* renamed from: a */
    public static boolean m238403a(VideoChat videoChat) {
        if (videoChat == null || videoChat.getType() != VideoChat.Type.CALL) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m238404b(VideoChat videoChat) {
        if (videoChat == null || videoChat.getType() != VideoChat.Type.MEET) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m238412f(C61344j jVar) {
        if (!m238405b(jVar)) {
            MeetingManager.m238341a().mo211895b(jVar);
        }
    }

    /* renamed from: c */
    private boolean m238407c(VideoChat videoChat) {
        if (videoChat == null) {
            return true;
        }
        if (!TextUtils.isEmpty(videoChat.getCreatingId()) || !TextUtils.isEmpty(videoChat.getId())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo211932a(C61344j jVar) {
        C26171w.m94675a(new Runnable(jVar) {
            /* class com.ss.android.vc.meeting.framework.manager.$$Lambda$c$2vApPbSYT2UTk7XXgOMm_y7DQA */
            public final /* synthetic */ C61344j f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C61275c.this.m238412f(this.f$1);
            }
        });
    }

    /* renamed from: b */
    private boolean m238405b(C61344j jVar) {
        if (m238408c(jVar)) {
            C60871a.m236611b("EventQueuePolicy", "[shouldIntercept] return false by shouldFilter");
            return false;
        } else if (m238410d(jVar)) {
            C60871a.m236611b("EventQueuePolicy", "[shouldIntercept] return true by shouldAbandon");
            return true;
        } else {
            boolean e = m238411e(jVar);
            C60871a.m236611b("EventQueuePolicy", "[shouldIntercept] return " + e + " by shouldEnqueue");
            return e;
        }
    }

    /* renamed from: d */
    private boolean m238410d(C61344j jVar) {
        for (AbstractC61279a aVar : this.f153506c) {
            if (aVar.mo211934a(jVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m238411e(com.ss.android.vc.meeting.framework.statemachine.C61344j r4) {
        /*
            r3 = this;
            com.ss.android.vc.entity.VideoChat r0 = r4.f153704b
            boolean r0 = r3.m238407c(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.String r4 = "EventQueuePolicy"
            java.lang.String r0 = "[shouldEnqueue] return false , because ids all empty"
            com.ss.android.vc.p3088d.p3090b.C60871a.m236611b(r4, r0)
            return r1
        L_0x0011:
            java.util.List<com.ss.android.vc.meeting.framework.manager.c$b> r0 = r3.f153507d
            int r0 = r0.size()
            if (r0 != 0) goto L_0x001c
            r3.m238409d()
        L_0x001c:
            java.util.List<com.ss.android.vc.meeting.framework.manager.c$b> r0 = r3.f153507d
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()
            com.ss.android.vc.meeting.framework.manager.c$b r1 = (com.ss.android.vc.meeting.framework.manager.C61275c.AbstractC61280b) r1
            boolean r1 = r1.mo211935a(r4)
            if (r1 == 0) goto L_0x0022
        L_0x0034:
            if (r1 == 0) goto L_0x003b
            java.util.LinkedList<com.ss.android.vc.meeting.framework.statemachine.j> r0 = r3.f153508e
            r0.add(r4)
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.framework.manager.C61275c.m238411e(com.ss.android.vc.meeting.framework.statemachine.j):boolean");
    }

    C61275c(AbstractC61285b bVar, AbstractC61284a aVar) {
        this.f153504a = bVar;
        this.f153505b = aVar;
        m238406c();
        m238409d();
    }
}
