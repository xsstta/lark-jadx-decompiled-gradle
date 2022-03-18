package com.facebook.react;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.facebook.react.l */
public class C21147l {
    /* renamed from: a */
    public static Iterable<ModuleHolder> m76862a(AbstractC21146k kVar, ReactApplicationContext reactApplicationContext, C21130g gVar) {
        final List<NativeModule> list;
        FLog.m76562d("ReactNative", kVar.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
        if (kVar instanceof AbstractC21144i) {
            list = ((AbstractC21144i) kVar).mo71857a(reactApplicationContext, gVar);
        } else {
            list = kVar.mo71751c(reactApplicationContext);
        }
        return new Iterable<ModuleHolder>() {
            /* class com.facebook.react.C21147l.C211481 */

            @Override // java.lang.Iterable
            public Iterator<ModuleHolder> iterator() {
                return new Iterator<ModuleHolder>() {
                    /* class com.facebook.react.C21147l.C211481.C211491 */

                    /* renamed from: a */
                    int f51580a;

                    public void remove() {
                        throw new UnsupportedOperationException("Cannot remove methods ");
                    }

                    public boolean hasNext() {
                        if (this.f51580a < list.size()) {
                            return true;
                        }
                        return false;
                    }

                    /* renamed from: a */
                    public ModuleHolder next() {
                        List list = list;
                        int i = this.f51580a;
                        this.f51580a = i + 1;
                        return new ModuleHolder((NativeModule) list.get(i));
                    }
                };
            }
        };
    }
}
