package com.ss.android.vc.meeting.module.interpretation.p3126a;

import android.text.TextUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.lark.setting.C61188b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.service.VideoChatUIConfigService;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.a.d */
public class C61938d {

    /* renamed from: a */
    public boolean f155565a;

    /* renamed from: b */
    private C61303k f155566b;

    /* renamed from: c */
    private boolean f155567c;

    /* renamed from: com.ss.android.vc.meeting.module.interpretation.a.d$a */
    public interface AbstractC61940a {
        /* renamed from: a */
        void mo213105a(boolean z);
    }

    /* renamed from: b */
    public boolean mo214471b() {
        return this.f155567c;
    }

    /* renamed from: c */
    private boolean m241977c() {
        String j = this.f155566b.mo212091I().mo212490a().mo212478j();
        if (!TextUtils.isEmpty(j)) {
            return j.equals(VideoChatModuleDependency.m236629b());
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo214469a() {
        if (VideoChatUIConfigService.m249512o(this.f155566b) && this.f155567c) {
            return mo214470a(this.f155565a);
        }
        return false;
    }

    public C61938d(C61303k kVar) {
        this.f155566b = kVar;
    }

    /* renamed from: a */
    public void mo214468a(final AbstractC61940a aVar) {
        if (!VideoChatUIConfigService.m249512o(this.f155566b)) {
            aVar.mo213105a(false);
        } else if (this.f155567c) {
            aVar.mo213105a(mo214470a(this.f155565a));
        } else {
            this.f155567c = true;
            VcBizService.getVideoChatUserSetting(new AbstractC63598b() {
                /* class com.ss.android.vc.meeting.module.interpretation.p3126a.C61938d.C619391 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("InterpretationInitLogic", "[getVideoChatUserSetting]", "error " + eVar.toString());
                    aVar.mo213105a(C61938d.this.mo214470a(false));
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onSuccess(Object obj) {
                    boolean z;
                    if (obj == null || !(obj instanceof C61188b)) {
                        z = C61938d.this.mo214470a(false);
                    } else {
                        C61938d.this.f155565a = ((C61188b) obj).mo211582d();
                        C61938d dVar = C61938d.this;
                        z = dVar.mo214470a(dVar.f155565a);
                    }
                    aVar.mo213105a(z);
                }
            });
        }
    }

    /* renamed from: a */
    public boolean mo214470a(boolean z) {
        boolean Q = this.f155566b.mo212099Q();
        boolean b = C63634c.m249496b("byteview.meeting.android.simu_interpretation");
        C60700b.m235858d("InterpretationInitLogic", "[isInterpretationFg]", "isMeetingOpenInterpretation :" + Q + "interpretationFg : " + b + "settingOpen : " + z);
        if (this.f155566b.f153550c != VideoChat.Type.MEET) {
            return false;
        }
        if (m241977c()) {
            if ((!b || !z) && !Q) {
                return false;
            }
            return true;
        } else if (Q) {
            return true;
        } else {
            return false;
        }
    }
}
