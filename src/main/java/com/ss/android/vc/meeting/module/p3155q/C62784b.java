package com.ss.android.vc.meeting.module.p3155q;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.core.app.ActivityCompat;
import com.ss.android.vc.common.p3077b.C60700b;

/* renamed from: com.ss.android.vc.meeting.module.q.b */
public class C62784b extends PhoneStateListener {

    /* renamed from: a */
    private boolean f157947a;

    /* renamed from: b */
    private TelephonyManager f157948b;

    /* renamed from: c */
    private AbstractC62785a f157949c;

    /* renamed from: d */
    private int f157950d;

    /* renamed from: e */
    private Context f157951e;

    /* renamed from: com.ss.android.vc.meeting.module.q.b$a */
    public interface AbstractC62785a {
        /* renamed from: a */
        void mo213483a(int i, String str);
    }

    /* renamed from: c */
    public boolean mo216831c() {
        return this.f157947a;
    }

    /* renamed from: d */
    private boolean m245686d() {
        if (Build.VERSION.SDK_INT >= 23 || ActivityCompat.checkSelfPermission(this.f157951e, "android.permission.READ_PHONE_STATE") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo216828a() {
        if (!mo216831c() && m245686d()) {
            C60700b.m235851b("VCCallingStateListener", "[start]", "start");
            this.f157947a = true;
            try {
                this.f157948b.listen(this, 32);
            } catch (Exception e) {
                C60700b.m235851b("VCCallingStateListener", "[start2]", "listen exception: " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void mo216830b() {
        if (mo216831c()) {
            C60700b.m235851b("VCCallingStateListener", "[stop]", "stop");
            this.f157947a = false;
            try {
                this.f157948b.listen(this, 0);
            } catch (Exception e) {
                C60700b.m235851b("VCCallingStateListener", "[stop2]", "listen exception: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void mo216829a(AbstractC62785a aVar) {
        this.f157949c = aVar;
    }

    public C62784b(Context context) {
        C60700b.m235851b("VCCallingStateListener", "[init]", "init manager");
        this.f157951e = context;
        this.f157948b = (TelephonyManager) context.getSystemService("phone");
    }

    public void onCallStateChanged(int i, String str) {
        C60700b.m235851b("VCCallingStateListener", "[onCallStateChanged]", "state = " + i);
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                AbstractC62785a aVar = this.f157949c;
                if (aVar != null) {
                    aVar.mo213483a(3, str);
                }
                this.f157950d = i;
            } else if (i != 2) {
                this.f157950d = i;
            } else {
                AbstractC62785a aVar2 = this.f157949c;
                if (aVar2 != null) {
                    if (this.f157950d != 1) {
                        i2 = 2;
                    }
                    aVar2.mo213483a(i2, str);
                }
                this.f157950d = i;
            }
        } else {
            AbstractC62785a aVar3 = this.f157949c;
            if (aVar3 != null) {
                aVar3.mo213483a(0, str);
            }
            this.f157950d = i;
        }
    }
}
