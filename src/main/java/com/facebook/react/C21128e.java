package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.p956a.C21054a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.react.e */
public class C21128e {

    /* renamed from: a */
    private final ReactApplicationContext f51513a;

    /* renamed from: b */
    private final C21130g f51514b;

    /* renamed from: c */
    private final Map<String, ModuleHolder> f51515c = new HashMap();

    /* renamed from: a */
    public NativeModuleRegistry mo71817a() {
        return new NativeModuleRegistry(this.f51513a, this.f51515c);
    }

    /* renamed from: a */
    public void mo71818a(AbstractC21146k kVar) {
        Iterable<ModuleHolder> iterable;
        if (kVar instanceof AbstractC21102c) {
            iterable = ((AbstractC21102c) kVar).mo71750b(this.f51513a);
        } else if (kVar instanceof AbstractC21264o) {
            iterable = ((AbstractC21264o) kVar).mo72135a(this.f51513a);
        } else {
            iterable = C21147l.m76862a(kVar, this.f51513a, this.f51514b);
        }
        for (ModuleHolder moduleHolder : iterable) {
            String name = moduleHolder.getName();
            if (this.f51515c.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.f51515c.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                    this.f51515c.remove(moduleHolder2);
                } else {
                    throw new IllegalStateException("Native module " + name + " tried to override " + moduleHolder2.getClassName() + ". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
                }
            }
            if (!C21054a.f51464a || !moduleHolder.isTurboModule()) {
                this.f51515c.put(name, moduleHolder);
            }
        }
    }

    public C21128e(ReactApplicationContext reactApplicationContext, C21130g gVar) {
        this.f51513a = reactApplicationContext;
        this.f51514b = gVar;
    }
}
