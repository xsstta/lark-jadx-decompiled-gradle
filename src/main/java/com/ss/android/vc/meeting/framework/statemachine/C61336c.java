package com.ss.android.vc.meeting.framework.statemachine;

import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.framework.statemachine.c */
public class C61336c {

    /* renamed from: a */
    private List<AbstractC61337a> f153694a = new ArrayList();

    /* renamed from: b */
    private C61355p f153695b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.framework.statemachine.c$a */
    public interface AbstractC61337a {
        boolean shouldAbandon(C61344j jVar);
    }

    /* renamed from: a */
    private void m238960a() {
        this.f153694a.clear();
        this.f153694a.add(new AbstractC61337a() {
            /* class com.ss.android.vc.meeting.framework.statemachine.$$Lambda$c$LA_J64FADHL5CnTmAUg0NpCDUgo */

            @Override // com.ss.android.vc.meeting.framework.statemachine.C61336c.AbstractC61337a
            public final boolean shouldAbandon(C61344j jVar) {
                return C61336c.lambda$LA_J64FADHL5CnTmAUg0NpCDUgo(C61336c.this, jVar);
            }
        });
    }

    public C61336c(C61355p pVar) {
        this.f153695b = pVar;
        m238960a();
    }

    /* renamed from: b */
    private boolean m238961b(C61344j jVar) {
        for (AbstractC61337a aVar : this.f153694a) {
            if (aVar.shouldAbandon(jVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo212312a(C61344j jVar) {
        if (!m238961b(jVar)) {
            return false;
        }
        C60871a.m236611b("EventInterceptPolicy", "[shouldIntercept] return true by shouldAbandon");
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ boolean m238962c(C61344j jVar) {
        if (jVar.f153703a != 110 || this.f153695b.mo212379g() != 1 || jVar.f153704b.getType() != VideoChat.Type.CALL || (jVar.f153704b.getExtraInfo() != null && jVar.f153704b.getExtraInfo().ignoreFor1v1)) {
            return false;
        }
        C60871a.m236611b("EventInterceptPolicy", "[shouldAbandonCase1] return true, meeting = " + jVar.f153704b.getId());
        return true;
    }
}
