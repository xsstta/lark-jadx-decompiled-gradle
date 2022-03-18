package com.bytedance.ee.bear.drive.common.p341a;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ee.bear.drive.common.p341a.C6887a;
import com.bytedance.ee.log.C13479a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.drive.common.a.a */
public class C6887a {

    /* renamed from: a */
    private static volatile C6887a f18664a = new C6887a();

    /* renamed from: b */
    private Set<AbstractC6889b> f18665b = Collections.synchronizedSet(new HashSet());

    /* renamed from: c */
    private Handler f18666c = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.ee.bear.drive.common.a.a$b */
    public interface AbstractC6889b<Data> {
        String getKey();

        void onReceived(Data data);
    }

    /* renamed from: com.bytedance.ee.bear.drive.common.a.a$a */
    public static class C6888a<Data> {

        /* renamed from: a */
        public String f18667a;

        /* renamed from: b */
        private String f18668b;

        /* renamed from: c */
        private Data f18669c;

        /* renamed from: a */
        public Data mo27124a() {
            return this.f18669c;
        }

        public C6888a(String str, String str2, Data data) {
            this.f18667a = str;
            this.f18668b = str2;
            this.f18669c = data;
        }
    }

    private C6887a() {
    }

    /* renamed from: a */
    public static C6887a m27207a() {
        if (f18664a == null) {
            synchronized (C6887a.class) {
                if (f18664a == null) {
                    f18664a = new C6887a();
                }
            }
        }
        return f18664a;
    }

    /* renamed from: b */
    public void mo27123b(AbstractC6889b bVar) {
        C13479a.m54764b("DriveSdk", "DriveSdkBus#unregister() receiver=" + bVar);
        if (bVar != null) {
            this.f18665b.remove(bVar);
        }
    }

    /* renamed from: a */
    public void mo27122a(AbstractC6889b bVar) {
        C13479a.m54764b("DriveSdk", "DriveSdkBus#register() receiver=" + bVar);
        if (bVar != null) {
            this.f18665b.add(bVar);
        }
    }

    /* renamed from: a */
    public void mo27121a(C6888a aVar) {
        C13479a.m54764b("DriveSdk", "DriveSdkBus#notify() message=" + aVar);
        if (aVar != null) {
            for (AbstractC6889b bVar : this.f18665b) {
                if (TextUtils.equals(bVar.getKey(), aVar.f18667a)) {
                    this.f18666c.post(new Runnable(aVar) {
                        /* class com.bytedance.ee.bear.drive.common.p341a.$$Lambda$a$suq2K6HJGiF5RXbhb1spiiRhmXU */
                        public final /* synthetic */ C6887a.C6888a f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C6887a.AbstractC6889b.this.onReceived(this.f$1);
                        }
                    });
                }
            }
        }
    }
}
