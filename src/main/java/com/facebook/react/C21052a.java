package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.module.model.AbstractC21151a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.AbstractC21181b;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.react.a */
public class C21052a extends AbstractC21264o implements AbstractC21150m {

    /* renamed from: a */
    private final C21130g f51458a;

    /* renamed from: b */
    private final AbstractC21181b f51459b;

    /* renamed from: c */
    private final boolean f51460c;

    /* renamed from: d */
    private final int f51461d;

    @Override // com.facebook.react.AbstractC21150m
    /* renamed from: b */
    public void mo71408b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // com.facebook.react.AbstractC21150m
    /* renamed from: c */
    public void mo71409c() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    @Override // com.facebook.react.AbstractC21264o
    /* renamed from: a */
    public AbstractC21151a mo71407a() {
        try {
            return (AbstractC21151a) Class.forName("com.facebook.react.CoreModulesPackage$$ReactModuleInfoProvider").newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, Timing.class};
            final HashMap hashMap = new HashMap();
            for (int i = 0; i < 7; i++) {
                Class cls = clsArr[i];
                ReactModule reactModule = (ReactModule) cls.getAnnotation(ReactModule.class);
                hashMap.put(reactModule.name(), new ReactModuleInfo(reactModule.name(), cls.getName(), reactModule.canOverrideExistingModule(), reactModule.needsEagerInit(), reactModule.hasConstants(), reactModule.isCxxModule(), false));
            }
            return new AbstractC21151a() {
                /* class com.facebook.react.C21052a.C210531 */

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
            case -1789797270:
                if (str.equals("Timing")) {
                    c = 0;
                    break;
                }
                break;
            case -1633589448:
                if (str.equals("DevSettings")) {
                    c = 1;
                    break;
                }
                break;
            case -1037217463:
                if (str.equals("DeviceEventManager")) {
                    c = 2;
                    break;
                }
                break;
            case -790603268:
                if (str.equals("PlatformConstants")) {
                    c = 3;
                    break;
                }
                break;
            case 512434409:
                if (str.equals("ExceptionsManager")) {
                    c = 4;
                    break;
                }
                break;
            case 881516744:
                if (str.equals("SourceCode")) {
                    c = 5;
                    break;
                }
                break;
            case 1256514152:
                if (str.equals("HeadlessJsTaskSupport")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return new Timing(reactApplicationContext, this.f51458a.mo71825b());
            case 1:
                return new DevSettingsModule(this.f51458a.mo71825b());
            case 2:
                return new DeviceEventManagerModule(reactApplicationContext, this.f51459b);
            case 3:
                return new AndroidInfoModule(reactApplicationContext);
            case 4:
                return new ExceptionsManagerModule(this.f51458a.mo71825b());
            case 5:
                return new SourceCodeModule(reactApplicationContext);
            case 6:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            default:
                throw new IllegalArgumentException("In CoreModulesPackage, could not find Native module for " + str);
        }
    }

    C21052a(C21130g gVar, AbstractC21181b bVar, boolean z, int i) {
        this.f51458a = gVar;
        this.f51459b = bVar;
        this.f51460c = z;
        this.f51461d = i;
    }
}
