package com.ss.android.lark.apihandler.basic.jsapi.device.p1352a;

import android.bluetooth.BluetoothSocket;

/* renamed from: com.ss.android.lark.apihandler.basic.jsapi.device.a.e */
public class C28758e implements AbstractC28763i {

    /* renamed from: a */
    private C28756c f72316a;

    /* renamed from: b */
    private BluetoothSocket f72317b;

    public C28758e(C28756c cVar) {
        this.f72316a = cVar;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0027 */
    @Override // com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.AbstractC28763i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo102257a(java.lang.String r6) {
        /*
            r5 = this;
            com.ss.android.lark.apihandler.basic.jsapi.device.a.c r0 = r5.f72316a
            android.bluetooth.BluetoothDevice r0 = r0.f72312a
            r1 = -1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0010
            java.lang.String r6 = "00001101-0000-1000-8000-00805F9B34FB"
        L_0x0010:
            java.util.UUID r6 = java.util.UUID.fromString(r6)     // Catch:{ IOException -> 0x004e }
            android.bluetooth.BluetoothSocket r6 = r0.createRfcommSocketToServiceRecord(r6)     // Catch:{ IOException -> 0x004e }
            r5.f72317b = r6     // Catch:{ IOException -> 0x004e }
            boolean r6 = r6.isConnected()
            r1 = 0
            if (r6 != 0) goto L_0x004e
            android.bluetooth.BluetoothSocket r6 = r5.f72317b     // Catch:{ IOException -> 0x0027 }
            r6.connect()     // Catch:{ IOException -> 0x0027 }
            goto L_0x004e
        L_0x0027:
            com.larksuite.framework.utils.Reflect r6 = com.larksuite.framework.utils.Reflect.m94918a(r0)     // Catch:{ Exception -> 0x004c }
            java.lang.String r0 = "createRfcommSocket"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x004c }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x004c }
            r3[r1] = r4     // Catch:{ Exception -> 0x004c }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x004c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x004c }
            r4[r1] = r2     // Catch:{ Exception -> 0x004c }
            com.larksuite.framework.utils.Reflect r6 = r6.mo93336a(r0, r3, r4)     // Catch:{ Exception -> 0x004c }
            java.lang.Object r6 = r6.mo93337a()     // Catch:{ Exception -> 0x004c }
            android.bluetooth.BluetoothSocket r6 = (android.bluetooth.BluetoothSocket) r6     // Catch:{ Exception -> 0x004c }
            r5.f72317b = r6     // Catch:{ Exception -> 0x004c }
            r6.connect()     // Catch:{ Exception -> 0x004c }
            goto L_0x004e
        L_0x004c:
            r6 = -2
            return r6
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.apihandler.basic.jsapi.device.p1352a.C28758e.mo102257a(java.lang.String):int");
    }
}
