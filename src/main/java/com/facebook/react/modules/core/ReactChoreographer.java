package com.facebook.react.modules.core;

import com.facebook.common.logging.FLog;
import com.facebook.infer.annotation.C21045a;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.C21178a;
import java.util.ArrayDeque;

public class ReactChoreographer {

    /* renamed from: f */
    private static ReactChoreographer f51624f;

    /* renamed from: a */
    public volatile C21178a f51625a;

    /* renamed from: b */
    public final Object f51626b = new Object();

    /* renamed from: c */
    public final ArrayDeque<C21178a.AbstractC21179a>[] f51627c;

    /* renamed from: d */
    public int f51628d;

    /* renamed from: e */
    public boolean f51629e;

    /* renamed from: g */
    private final C21171a f51630g;

    public enum CallbackType {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        
        private final int mOrder;

        /* access modifiers changed from: package-private */
        public int getOrder() {
            return this.mOrder;
        }

        private CallbackType(int i) {
            this.mOrder = i;
        }
    }

    /* renamed from: a */
    public static void m76892a() {
        if (f51624f == null) {
            f51624f = new ReactChoreographer();
        }
    }

    /* renamed from: b */
    public static ReactChoreographer m76893b() {
        C21045a.m76677a(f51624f, "ReactChoreographer needs to be initialized.");
        return f51624f;
    }

    /* renamed from: c */
    public void mo71959c() {
        this.f51625a.mo71975a(this.f51630g);
        this.f51629e = true;
    }

    private ReactChoreographer() {
        int i = 0;
        this.f51628d = 0;
        this.f51629e = false;
        this.f51630g = new C21171a();
        this.f51627c = new ArrayDeque[CallbackType.values().length];
        while (true) {
            ArrayDeque<C21178a.AbstractC21179a>[] arrayDequeArr = this.f51627c;
            if (i < arrayDequeArr.length) {
                arrayDequeArr[i] = new ArrayDeque<>();
                i++;
            } else {
                mo71957a(null);
                return;
            }
        }
    }

    /* renamed from: d */
    public void mo71960d() {
        boolean z;
        if (this.f51628d >= 0) {
            z = true;
        } else {
            z = false;
        }
        C21045a.m76678a(z);
        if (this.f51628d == 0 && this.f51629e) {
            if (this.f51625a != null) {
                this.f51625a.mo71976b(this.f51630g);
            }
            this.f51629e = false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.core.ReactChoreographer$a */
    public class C21171a extends C21178a.AbstractC21179a {
        private C21171a() {
        }

        @Override // com.facebook.react.modules.core.C21178a.AbstractC21179a
        /* renamed from: a */
        public void mo71964a(long j) {
            synchronized (ReactChoreographer.this.f51626b) {
                ReactChoreographer.this.f51629e = false;
                for (int i = 0; i < ReactChoreographer.this.f51627c.length; i++) {
                    ArrayDeque<C21178a.AbstractC21179a> arrayDeque = ReactChoreographer.this.f51627c[i];
                    int size = arrayDeque.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C21178a.AbstractC21179a pollFirst = arrayDeque.pollFirst();
                        if (pollFirst != null) {
                            pollFirst.mo71964a(j);
                            ReactChoreographer reactChoreographer = ReactChoreographer.this;
                            reactChoreographer.f51628d--;
                        } else {
                            FLog.m76574e("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                ReactChoreographer.this.mo71960d();
            }
        }
    }

    /* renamed from: a */
    public void mo71957a(final Runnable runnable) {
        UiThreadUtil.runOnUiThread(new Runnable() {
            /* class com.facebook.react.modules.core.ReactChoreographer.RunnableC211702 */

            public void run() {
                synchronized (ReactChoreographer.class) {
                    if (ReactChoreographer.this.f51625a == null) {
                        ReactChoreographer.this.f51625a = C21178a.m76906a();
                    }
                }
                Runnable runnable = runnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo71956a(CallbackType callbackType, C21178a.AbstractC21179a aVar) {
        synchronized (this.f51626b) {
            this.f51627c[callbackType.getOrder()].addLast(aVar);
            boolean z = true;
            int i = this.f51628d + 1;
            this.f51628d = i;
            if (i <= 0) {
                z = false;
            }
            C21045a.m76678a(z);
            if (!this.f51629e) {
                if (this.f51625a == null) {
                    mo71957a(new Runnable() {
                        /* class com.facebook.react.modules.core.ReactChoreographer.RunnableC211691 */

                        public void run() {
                            ReactChoreographer.this.mo71959c();
                        }
                    });
                } else {
                    mo71959c();
                }
            }
        }
    }

    /* renamed from: b */
    public void mo71958b(CallbackType callbackType, C21178a.AbstractC21179a aVar) {
        synchronized (this.f51626b) {
            if (this.f51627c[callbackType.getOrder()].removeFirstOccurrence(aVar)) {
                this.f51628d--;
                mo71960d();
            } else {
                FLog.m76574e("ReactNative", "Tried to remove non-existent frame callback");
            }
        }
    }
}
