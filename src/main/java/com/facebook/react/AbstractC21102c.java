package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.AbstractC21151a;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.systrace.C21273a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.react.c */
public abstract class AbstractC21102c implements AbstractC21146k {
    /* renamed from: a */
    public abstract AbstractC21151a mo47877a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract List<ModuleSpec> mo47878a(ReactApplicationContext reactApplicationContext);

    /* renamed from: b */
    public Iterable<ModuleHolder> mo71750b(ReactApplicationContext reactApplicationContext) {
        final Map<String, ReactModuleInfo> a = mo47877a().mo71410a();
        final List<ModuleSpec> a2 = mo47878a(reactApplicationContext);
        return new Iterable<ModuleHolder>() {
            /* class com.facebook.react.AbstractC21102c.C211042 */

            @Override // java.lang.Iterable
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() {
                    /* class com.facebook.react.AbstractC21102c.C211042.C211051 */

                    /* renamed from: a */
                    int f51490a;

                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove native modules from the list");
                    }

                    public boolean hasNext() {
                        if (this.f51490a < a2.size()) {
                            return true;
                        }
                        return false;
                    }

                    /* JADX INFO: finally extract failed */
                    /* renamed from: a */
                    public ModuleHolder next() {
                        List list = a2;
                        int i = this.f51490a;
                        this.f51490a = i + 1;
                        ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                        String name = moduleSpec.getName();
                        ReactModuleInfo reactModuleInfo = (ReactModuleInfo) a.get(name);
                        if (reactModuleInfo != null) {
                            return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                        }
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                        try {
                            NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().mo47880b();
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                            return new ModuleHolder(nativeModule);
                        } catch (Throwable th) {
                            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                            throw th;
                        }
                    }
                };
            }
        };
    }

    /* JADX INFO: finally extract failed */
    @Override // com.facebook.react.AbstractC21146k
    /* renamed from: c */
    public final List<NativeModule> mo71751c(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : mo47878a(reactApplicationContext)) {
            C21273a.m77086a(0, "createNativeModule").mo72176a("module", moduleSpec.getType()).mo72177a();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().mo47880b();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C21273a.m77085a(0).mo72177a();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                C21273a.m77085a(0).mo72177a();
                throw th;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static AbstractC21151a m76717a(AbstractC21102c cVar) {
        try {
            Class<?> cls = Class.forName(cVar.getClass().getCanonicalName() + "$$ReactModuleInfoProvider");
            if (cls != null) {
                try {
                    return (AbstractC21151a) cls.newInstance();
                } catch (InstantiationException e) {
                    throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + cVar.getClass(), e);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException("Unable to instantiate ReactModuleInfoProvider for " + cVar.getClass(), e2);
                }
            } else {
                throw new RuntimeException("ReactModuleInfoProvider class for " + cVar.getClass().getCanonicalName() + " not found.");
            }
        } catch (ClassNotFoundException unused) {
            return new AbstractC21151a() {
                /* class com.facebook.react.AbstractC21102c.C211031 */

                @Override // com.facebook.react.module.model.AbstractC21151a
                /* renamed from: a */
                public Map<String, ReactModuleInfo> mo71410a() {
                    return Collections.emptyMap();
                }
            };
        }
    }
}
