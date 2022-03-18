package com.ss.android.vcxp.binder;

import com.ss.android.vcxp.C63791b;
import com.ss.android.vcxp.binder.XBinder;

public class XMethodService extends XBinder.Stub {
    static {
        C63791b.m250469c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x004a  */
    @Override // com.ss.android.vcxp.binder.XBinder
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle execute(android.os.Bundle r6) throws android.os.RemoteException {
        /*
            r5 = this;
            com.ss.android.vcxp.d r6 = com.ss.android.vcxp.C63807d.m250516a(r6)     // Catch:{ Exception -> 0x000b }
            android.os.Bundle r6 = r6.mo220464a()     // Catch:{ Exception -> 0x0009 }
            return r6
        L_0x0009:
            r0 = move-exception
            goto L_0x000d
        L_0x000b:
            r0 = move-exception
            r6 = 0
        L_0x000d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 2
            java.lang.String r3 = "@error"
            r1.putInt(r3, r2)
            java.lang.String r2 = "@errorMessage"
            if (r6 == 0) goto L_0x004a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.ss.android.vcxp.b.c r4 = r6.f161017a
            java.lang.String r4 = r4.mo220435a()
            r3.append(r4)
            java.lang.String r4 = "."
            r3.append(r4)
            com.ss.android.vcxp.b.c r6 = r6.f161017a
            java.lang.String r6 = r6.mo220438d()
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            java.lang.String r3 = "XMethodService"
            java.lang.String r4 = "[execute]"
            com.ss.android.vc.common.p3077b.C60700b.m235854c(r3, r4, r6)
            com.ss.android.vcxp.p3186c.C63804c.m250510a(r6, r0)
            r1.putString(r2, r6)
            goto L_0x0056
        L_0x004a:
            java.lang.String r6 = "XMethodService.execute"
            com.ss.android.vcxp.p3186c.C63804c.m250510a(r6, r0)
            java.lang.String r6 = r0.getMessage()
            r1.putString(r2, r6)
        L_0x0056:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vcxp.binder.XMethodService.execute(android.os.Bundle):android.os.Bundle");
    }
}
