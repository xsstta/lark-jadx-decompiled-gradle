package com.larksuite.component.openplatform.core.plugin.device.bluetooth.api;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.core.plugin.OPPlugin;
import com.larksuite.component.openplatform.core.plugin.device.bluetooth.BluetoothError;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25907b;

public abstract class BluetoothBaseOPPlugin extends OPPlugin {
    protected AbstractC25897h mInvokeCallback;

    @Override // com.larksuite.component.openplatform.core.plugin.OPPlugin, com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
        super.onRelease();
        this.mInvokeCallback = null;
    }

    public final <T extends C25921b> void callbackResponse(T t) {
        AbstractC25897h hVar = this.mInvokeCallback;
        if (hVar != null) {
            hVar.callback(t);
            return;
        }
        AppBrandLogger.m52830i("BluetoothBaseOPPlugin", "callback fail by mInvokeCallback == null");
    }

    private C25907b covertErrorCode(BluetoothError bluetoothError) {
        if (bluetoothError.errorCode() == C25907b.f64095g.f64115H) {
            return C25907b.f64095g;
        }
        if (bluetoothError.errorCode() == C25907b.f64096h.f64115H) {
            return C25907b.f64096h;
        }
        if (bluetoothError.errorCode() == C25907b.f64097i.f64115H) {
            return C25907b.f64097i;
        }
        if (bluetoothError.errorCode() == C25907b.f64098j.f64115H) {
            return C25907b.f64098j;
        }
        if (bluetoothError.errorCode() == C25907b.f64099k.f64115H) {
            return C25907b.f64099k;
        }
        if (bluetoothError.errorCode() == C25907b.f64100l.f64115H) {
            return C25907b.f64100l;
        }
        if (bluetoothError.errorCode() == C25907b.f64101m.f64115H) {
            return C25907b.f64101m;
        }
        if (bluetoothError.errorCode() == C25907b.f64102n.f64115H) {
            return C25907b.f64102n;
        }
        if (bluetoothError.errorCode() == C25907b.f64103o.f64115H) {
            return C25907b.f64103o;
        }
        if (bluetoothError.errorCode() == C25907b.f64104p.f64115H) {
            return C25907b.f64104p;
        }
        if (bluetoothError.errorCode() == C25907b.f64105q.f64115H) {
            return C25907b.f64105q;
        }
        if (bluetoothError.errorCode() == C25907b.f64106r.f64115H) {
            return C25907b.f64106r;
        }
        if (bluetoothError.errorCode() == C25907b.f64107s.f64115H) {
            return C25907b.f64107s;
        }
        if (bluetoothError.errorCode() == C25907b.f64108t.f64115H) {
            return C25907b.f64108t;
        }
        if (bluetoothError.errorCode() == C25907b.f64109u.f64115H) {
            return C25907b.f64109u;
        }
        if (bluetoothError.errorCode() == C25907b.f64110v.f64115H) {
            return C25907b.f64110v;
        }
        if (bluetoothError.errorCode() == C25907b.f64111w.f64115H) {
            return C25907b.f64111w;
        }
        if (bluetoothError.errorCode() == C25907b.f64112x.f64115H) {
            return C25907b.f64112x;
        }
        if (bluetoothError.errorCode() == C25907b.f64113y.f64115H) {
            return C25907b.f64113y;
        }
        if (bluetoothError.errorCode() == C25907b.f64114z.f64115H) {
            return C25907b.f64114z;
        }
        return null;
    }

    public final <T extends C25921b> T fillResponse(T t, BluetoothError bluetoothError) {
        C25907b covertErrorCode;
        if (!(t == null || bluetoothError == null || (covertErrorCode = covertErrorCode(bluetoothError)) == null)) {
            fillResponse(t, covertErrorCode);
        }
        return t;
    }

    public final <T extends C25921b> T fillResponse(T t, C25907b bVar) {
        if (!(t == null || bVar == null)) {
            if (bVar.f64115H != 0) {
                t.mErrorCode = bVar.f64115H;
            }
            t.mInnerCode = bVar.f64116I;
            t.mErrorMessage = bVar.f64117J;
            t.mInnerMsg = bVar.f64117J;
        }
        return t;
    }
}
