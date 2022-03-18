package com.ss.android.lark.p1820e;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.p1820e.C36910b;
import com.ss.android.lark.p1820e.p1821a.C36894a;

/* renamed from: com.ss.android.lark.e.a */
public class C36892a {

    /* renamed from: a */
    C36910b.AbstractC36912a f94825a = new C36910b.AbstractC36912a() {
        /* class com.ss.android.lark.p1820e.C36892a.C368931 */

        /* renamed from: b */
        private boolean f94827b;

        @Override // com.ss.android.lark.p1820e.C36910b.AbstractC36912a
        /* renamed from: a */
        public void mo136194a() {
            if (C36894a.m145605a().mo136212i()) {
                Log.m165389i("AudioSensorHandler", "isWiredHeadsetOn");
            } else if (this.f94827b && C36894a.m145605a().mo136218o() != 1) {
                Log.m165389i("AudioSensorHandler", "onFarAwayFromPhone");
                this.f94827b = false;
                C36894a.m145605a().mo136211h();
            }
        }

        @Override // com.ss.android.lark.p1820e.C36910b.AbstractC36912a
        /* renamed from: b */
        public void mo136195b() {
            if (C36894a.m145605a().mo136212i()) {
                Log.m165389i("AudioSensorHandler", "isWiredHeadsetOn");
            } else if (C36894a.m145605a().mo136218o() != 2) {
                Log.m165389i("AudioSensorHandler", "onCloseToPhone");
                C36894a.m145605a().mo136210g();
                this.f94827b = true;
            }
        }
    };

    /* renamed from: a */
    public C36910b.AbstractC36912a mo136193a() {
        return this.f94825a;
    }
}
