package com.facebook.react.p958c;

import com.facebook.react.AbstractC21264o;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.AbstractC21151a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.c.a */
public class C21106a extends AbstractC21264o {
    @Override // com.facebook.react.AbstractC21264o
    /* renamed from: a */
    public AbstractC21151a mo71407a() {
        try {
            return (AbstractC21151a) Class.forName("com.facebook.react.MainReactPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AppStateModule.class, NetInfoModule.class, NetworkingModule.class, ToastModule.class, WebSocketModule.class};
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < 5; i++) {
                Class cls = clsArr[i];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), false));
            }
            return new AbstractC21151a() {
                /* class com.facebook.react.p958c.C21106a.C211071 */

                @Override // com.facebook.react.module.model.AbstractC21151a
                /* renamed from: a */
                public Map<String, ReactModuleInfo> mo71410a() {
                    return hashMap;
                }
            };
        } catch (InstantiationException e) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("No ReactModuleInfoProvider for CoreModulesPackage$$ReactModuleInfoProvider", e2);
        }
    }

    @Override // com.facebook.react.AbstractC21264o
    /* renamed from: a */
    public NativeModule mo71406a(String str, ReactApplicationContext reactApplicationContext) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2115067288:
                if (str.equals("ToastAndroid")) {
                    c = 0;
                    break;
                }
                break;
            case -254310125:
                if (str.equals("WebSocketModule")) {
                    c = 1;
                    break;
                }
                break;
            case 1221389072:
                if (str.equals("AppState")) {
                    c = 2;
                    break;
                }
                break;
            case 1515242260:
                if (str.equals("Networking")) {
                    c = 3;
                    break;
                }
                break;
            case 1834209380:
                if (str.equals("RNCNetInfo")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new ToastModule(reactApplicationContext);
            case 1:
                return new WebSocketModule(reactApplicationContext);
            case 2:
                return new AppStateModule(reactApplicationContext);
            case 3:
                return new NetworkingModule(reactApplicationContext);
            case 4:
                return new NetInfoModule(reactApplicationContext);
            default:
                return null;
        }
    }
}
