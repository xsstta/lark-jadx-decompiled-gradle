package com.tt.miniapp.p3312p;

import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import com.tt.miniapp.p3312p.p3313a.AbstractC66561a;
import com.tt.miniapp.p3312p.p3313a.AbstractC66566c;
import com.tt.miniapp.p3312p.p3313a.C66562b;
import com.tt.miniapphost.data.ContextSingletonInstance;

/* renamed from: com.tt.miniapp.p.b */
public class C66567b implements AbstractC66566c {

    /* renamed from: a */
    private AbstractC66566c f168088a = C66560a.m260054a();

    /* renamed from: a */
    public static C66567b m260068a() {
        return ContextSingletonInstance.getInstance().getMediaSupport();
    }

    @Override // com.tt.miniapp.p3312p.p3313a.AbstractC66566c
    /* renamed from: b */
    public int mo232159b() {
        AbstractC66566c cVar = this.f168088a;
        if (cVar != null) {
            return cVar.mo232159b();
        }
        return 0;
    }

    @Override // com.tt.miniapp.p3312p.p3313a.AbstractC66566c
    /* renamed from: a */
    public int mo232158a(C66562b bVar, AbstractC66561a aVar) {
        int b = mo232159b();
        if (b >= 3) {
            aVar.mo88648a(IByteRtcError.BRERR_NO_PUBLISH_PERMISSION, "MediaEditor working busy, cur taskNum = " + b + ", maxTaskNum = " + 3);
            return IByteRtcError.BRERR_NO_PUBLISH_PERMISSION;
        }
        AbstractC66566c cVar = this.f168088a;
        if (cVar != null) {
            return cVar.mo232158a(bVar, aVar);
        }
        return IByteRtcError.BRERR_INVALID_TOKEN;
    }
}
