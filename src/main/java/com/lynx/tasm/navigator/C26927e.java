package com.lynx.tasm.navigator;

import android.util.LruCache;
import com.lynx.tasm.LynxView;

/* renamed from: com.lynx.tasm.navigator.e */
public class C26927e extends LruCache<C26926d, LynxView> {

    /* renamed from: a */
    private AbstractC26928a f66870a;

    /* renamed from: com.lynx.tasm.navigator.e$a */
    public interface AbstractC26928a {
        /* renamed from: b */
        void mo95754b(LynxView lynxView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public LynxView create(C26926d dVar) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void entryRemoved(boolean z, C26926d dVar, LynxView lynxView, LynxView lynxView2) {
        AbstractC26928a aVar;
        if (z && (aVar = this.f66870a) != null) {
            aVar.mo95754b(lynxView);
        }
    }
}
