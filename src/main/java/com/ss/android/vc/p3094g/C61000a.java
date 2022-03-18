package com.ss.android.vc.p3094g;

import android.content.Context;
import com.ss.android.lark.exception.crash.C37008a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.statistics.event.C63761k;
import com.ss.android.vc.statistics.event.ao;
import com.ss.android.vc.statistics.monitor.C63780b;
import java.util.List;

/* renamed from: com.ss.android.vc.g.a */
public class C61000a implements C37008a.AbstractC37010a {

    /* renamed from: a */
    private C61001b f152860a;

    public C61000a(Context context) {
        this.f152860a = new C61001b(context);
    }

    @Override // com.ss.android.lark.exception.crash.C37008a.AbstractC37010a
    /* renamed from: a */
    public boolean mo136537a(Thread thread, Throwable th) {
        C60700b.m235851b("VcCrashHandler", "[handleCrash]", "trigger crash and save crash info");
        this.f152860a.mo210461a(true);
        List<AbstractC61294b> b = MeetingManager.m238341a().mo211894b();
        if (b != null && b.size() > 0) {
            for (AbstractC61294b bVar : b) {
                if (!(bVar == null || bVar.mo212056e() == null)) {
                    if (bVar.mo212065n()) {
                        if (bVar.mo212056e().getType() == VideoChat.Type.CALL) {
                            C63761k.m250298a(bVar.mo212056e(), 6, "app_crash");
                        } else {
                            ao.m250026a(bVar.mo212056e(), "app_crash");
                        }
                    }
                    C63780b.m250414d(bVar.mo212056e());
                }
            }
        }
        return true;
    }
}
