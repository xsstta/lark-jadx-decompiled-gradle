package com.lynx.jsbridge;

import com.lynx.react.bridge.AbstractRunnableC26522f;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC26684l;
import com.lynx.tasm.behavior.C26685m;
import com.lynx.tasm.behavior.C26689n;
import com.lynx.tasm.utils.C26959m;

public class LynxIntersectionObserverModule extends LynxContextModule {
    public LynxIntersectionObserverModule(AbstractC26684l lVar) {
        super(lVar);
    }

    /* access modifiers changed from: package-private */
    @LynxMethod
    public void disconnect(final int i) {
        C26959m.m97969a(new AbstractRunnableC26522f(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C265015 */

            @Override // com.lynx.react.bridge.AbstractRunnableC26522f
            /* renamed from: a */
            public void mo93957a() {
                C26685m b = LynxIntersectionObserverModule.this.mLynxContext.mo94689k().mo94705b(i);
                if (b != null) {
                    b.mo94697b();
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @LynxMethod
    public void relativeToViewport(final int i, final ReadableMap readableMap) {
        C26959m.m97969a(new AbstractRunnableC26522f(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C264993 */

            @Override // com.lynx.react.bridge.AbstractRunnableC26522f
            /* renamed from: a */
            public void mo93957a() {
                C26685m b = LynxIntersectionObserverModule.this.mLynxContext.mo94689k().mo94705b(i);
                if (b != null) {
                    b.mo94694a(readableMap);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @LynxMethod
    public void createIntersectionObserver(final int i, final String str, final ReadableMap readableMap) {
        C26959m.m97969a(new AbstractRunnableC26522f(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C264971 */

            @Override // com.lynx.react.bridge.AbstractRunnableC26522f
            /* renamed from: a */
            public void mo93957a() {
                C26689n k = LynxIntersectionObserverModule.this.mLynxContext.mo94689k();
                if (k.mo94705b(i) == null) {
                    int i = -1;
                    if (!str.isEmpty()) {
                        i = Integer.parseInt(str);
                    }
                    k.mo94704a(new C26685m(k, i, i, readableMap));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @LynxMethod
    public void observe(final int i, final String str, final int i2) {
        C26959m.m97969a(new AbstractRunnableC26522f(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C265004 */

            @Override // com.lynx.react.bridge.AbstractRunnableC26522f
            /* renamed from: a */
            public void mo93957a() {
                C26685m b = LynxIntersectionObserverModule.this.mLynxContext.mo94689k().mo94705b(i);
                if (b != null) {
                    b.mo94695a(str, i2);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @LynxMethod
    public void relativeTo(final int i, final String str, final ReadableMap readableMap) {
        C26959m.m97969a(new AbstractRunnableC26522f(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C264982 */

            @Override // com.lynx.react.bridge.AbstractRunnableC26522f
            /* renamed from: a */
            public void mo93957a() {
                C26685m b = LynxIntersectionObserverModule.this.mLynxContext.mo94689k().mo94705b(i);
                if (b != null) {
                    b.mo94696a(str, readableMap);
                }
            }
        });
    }
}
