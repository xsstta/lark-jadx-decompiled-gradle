package com.bytedance.crash.runtime.p227a;

import android.content.Context;
import com.bytedance.crash.C3691b;
import com.bytedance.crash.C3774m;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.C3742b;
import com.bytedance.crash.entity.Header;
import com.bytedance.crash.runtime.p227a.AbstractC3829b;
import com.google.firebase.messaging.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.bytedance.crash.runtime.a.e */
public class C3835e {

    /* renamed from: a */
    private static volatile C3835e f11790a;

    /* renamed from: b */
    private final Context f11791b;

    /* renamed from: c */
    private final Map<CrashType, AbstractC3829b> f11792c = new HashMap();

    /* renamed from: d */
    private C3824a f11793d;

    /* renamed from: e */
    private C3832d f11794e;

    /* renamed from: a */
    public static C3835e m15853a() {
        if (f11790a == null) {
            Context j = C3774m.m15609j();
            if (j != null) {
                f11790a = new C3835e(j);
            } else {
                throw new IllegalArgumentException("NpthBus not init");
            }
        }
        return f11790a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.crash.runtime.a.e$2 */
    public static /* synthetic */ class C38372 {

        /* renamed from: a */
        static final /* synthetic */ int[] f11796a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.crash.CrashType[] r0 = com.bytedance.crash.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a = r0
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.ANR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.DART     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.GAME     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.CUSTOM_JAVA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = com.bytedance.crash.runtime.p227a.C3835e.C38372.f11796a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.bytedance.crash.CrashType r1 = com.bytedance.crash.CrashType.ENSURE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.p227a.C3835e.C38372.<clinit>():void");
        }
    }

    private C3835e(Context context) {
        this.f11791b = context;
        try {
            this.f11793d = C3824a.m15819d();
            this.f11794e = new C3832d(context);
        } catch (Throwable th) {
            C3691b.m15203a().mo15177a("NPTH_CATCH", th);
        }
    }

    /* renamed from: a */
    public C3742b mo15430a(List<C3742b> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C3742b bVar = new C3742b();
        JSONArray jSONArray = new JSONArray();
        for (C3742b bVar2 : list) {
            jSONArray.put(bVar2.mo15252e());
        }
        bVar.mo15241a(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, (Object) jSONArray);
        Header a = Header.m15398a(this.f11791b);
        Header.m15400a(a);
        a.mo15224c();
        a.mo15225d();
        a.mo15226e();
        Header.m15403b(a);
        bVar.mo15231a(a);
        return bVar;
    }

    /* renamed from: a */
    private AbstractC3829b m15852a(CrashType crashType) {
        AbstractC3829b bVar = this.f11792c.get(crashType);
        if (bVar != null) {
            return bVar;
        }
        switch (C38372.f11796a[crashType.ordinal()]) {
            case 1:
                bVar = new C3838f(this.f11791b, this.f11793d, this.f11794e, false);
                break;
            case 2:
                bVar = new C3838f(this.f11791b, this.f11793d, this.f11794e, true);
                break;
            case 3:
                bVar = new C3839g(this.f11791b, this.f11793d, this.f11794e);
                break;
            case 4:
                bVar = new C3831c(CrashType.ANR, this.f11791b, this.f11793d, this.f11794e);
                break;
            case 5:
                bVar = new C3831c(CrashType.DART, this.f11791b, this.f11793d, this.f11794e);
                break;
            case 6:
                bVar = new C3831c(CrashType.GAME, this.f11791b, this.f11793d, this.f11794e);
                break;
            case 7:
                bVar = new C3831c(CrashType.CUSTOM_JAVA, this.f11791b, this.f11793d, this.f11794e);
                break;
            case 8:
                bVar = new AbstractC3829b(CrashType.ENSURE, this.f11791b, this.f11793d, this.f11794e) {
                    /* class com.bytedance.crash.runtime.p227a.C3835e.C38361 */
                };
                break;
        }
        if (bVar != null) {
            this.f11792c.put(crashType, bVar);
        }
        return bVar;
    }

    /* renamed from: a */
    public C3742b mo15428a(CrashType crashType, C3742b bVar) {
        return mo15429a(crashType, bVar, null, false);
    }

    /* renamed from: a */
    public C3742b mo15429a(CrashType crashType, C3742b bVar, AbstractC3829b.AbstractC3830a aVar, boolean z) {
        AbstractC3829b a;
        if (crashType == null || (a = m15852a(crashType)) == null) {
            return bVar;
        }
        return a.mo15420a(bVar, aVar, z);
    }
}
