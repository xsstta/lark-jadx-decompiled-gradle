package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.AbstractC21151a;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Provider;

/* renamed from: com.facebook.react.o */
public abstract class AbstractC21264o implements AbstractC21146k {
    /* renamed from: a */
    public abstract NativeModule mo71406a(String str, ReactApplicationContext reactApplicationContext);

    /* renamed from: a */
    public abstract AbstractC21151a mo71407a();

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.o$a */
    public class C21267a implements Provider<NativeModule> {

        /* renamed from: b */
        private final String f51801b;

        /* renamed from: c */
        private final ReactApplicationContext f51802c;

        /* renamed from: a */
        public NativeModule mo47880b() {
            return AbstractC21264o.this.mo71406a(this.f51801b, this.f51802c);
        }

        public C21267a(String str, ReactApplicationContext reactApplicationContext) {
            this.f51801b = str;
            this.f51802c = reactApplicationContext;
        }
    }

    @Override // com.facebook.react.AbstractC21146k
    /* renamed from: c */
    public List<NativeModule> mo71751c(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
    }

    /* renamed from: a */
    public Iterable<ModuleHolder> mo72135a(final ReactApplicationContext reactApplicationContext) {
        final Iterator<Map.Entry<String, ReactModuleInfo>> it = mo71407a().mo71410a().entrySet().iterator();
        return new Iterable<ModuleHolder>() {
            /* class com.facebook.react.AbstractC21264o.C212651 */

            @Override // java.lang.Iterable
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() {
                    /* class com.facebook.react.AbstractC21264o.C212651.C212661 */

                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove native modules from the list");
                    }

                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    /* renamed from: a */
                    public ModuleHolder next() {
                        Map.Entry entry = (Map.Entry) it.next();
                        return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C21267a((String) entry.getKey(), reactApplicationContext));
                    }
                };
            }
        };
    }
}
