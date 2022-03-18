package com.facebook.react;

import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.AbstractC21151a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Provider;

/* access modifiers changed from: package-private */
/* renamed from: com.facebook.react.b */
public class C21055b extends AbstractC21102c {
    C21055b() {
    }

    @Override // com.facebook.react.AbstractC21102c
    /* renamed from: a */
    public AbstractC21151a mo47877a() {
        return AbstractC21102c.m76717a(this);
    }

    @Override // com.facebook.react.AbstractC21102c
    /* renamed from: a */
    public List<ModuleSpec> mo47878a(final ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ModuleSpec.nativeModuleSpec(JSCHeapCapture.class, new Provider<NativeModule>() {
            /* class com.facebook.react.C21055b.C210561 */

            /* renamed from: a */
            public NativeModule mo47880b() {
                return new JSCHeapCapture(reactApplicationContext);
            }
        }));
        return arrayList;
    }
}
