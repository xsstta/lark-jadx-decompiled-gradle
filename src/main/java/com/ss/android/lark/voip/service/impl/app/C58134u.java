package com.ss.android.lark.voip.service.impl.app;

import android.content.Context;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.lark.voip.service.impl.app.u */
public class C58134u extends PhoneStateListener {

    /* renamed from: a */
    private boolean f143005a;

    /* renamed from: b */
    private TelephonyManager f143006b;

    /* renamed from: c */
    private AbstractC58135a f143007c;

    /* renamed from: d */
    private int f143008d;

    /* renamed from: com.ss.android.lark.voip.service.impl.app.u$a */
    public interface AbstractC58135a {
        /* renamed from: a */
        void mo197012a(int i, String str);
    }

    /* renamed from: c */
    public boolean mo197010c() {
        return this.f143005a;
    }

    /* renamed from: a */
    public void mo197007a() {
        if (!mo197010c()) {
            C60700b.m235851b("VoipCallingStateListener", "[start]", "start");
            this.f143005a = true;
            this.f143006b.listen(this, 32);
        }
    }

    /* renamed from: b */
    public void mo197009b() {
        if (mo197010c()) {
            C60700b.m235851b("VoipCallingStateListener", "[stop]", "stop");
            this.f143005a = false;
            this.f143006b.listen(this, 0);
        }
    }

    /* renamed from: a */
    public void mo197008a(AbstractC58135a aVar) {
        this.f143007c = aVar;
    }

    public C58134u(Context context) {
        C60700b.m235851b("VoipCallingStateListener", "[init]", "init manager");
        this.f143006b = (TelephonyManager) context.getSystemService("phone");
    }

    public void onCallStateChanged(int i, String str) {
        C60700b.m235851b("VoipCallingStateListener", "[onCallStateChanged]", "state = " + i);
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                AbstractC58135a aVar = this.f143007c;
                if (aVar != null) {
                    aVar.mo197012a(3, str);
                }
                this.f143008d = i;
            } else if (i != 2) {
                this.f143008d = i;
            } else {
                AbstractC58135a aVar2 = this.f143007c;
                if (aVar2 != null) {
                    if (this.f143008d != 1) {
                        i2 = 2;
                    }
                    aVar2.mo197012a(i2, str);
                }
                this.f143008d = i;
            }
        } else {
            AbstractC58135a aVar3 = this.f143007c;
            if (aVar3 != null) {
                aVar3.mo197012a(0, str);
            }
            this.f143008d = i;
        }
    }
}
