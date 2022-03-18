package com.ss.android.lark.ug.dyflow.common.storage;

import com.ss.android.lark.ug.dyflow.common.data.FlowStepData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J \u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/storage/FlowStorage;", "", "()V", "stepDataMap", "", "", "Lcom/ss/android/lark/ug/dyflow/common/data/FlowStepData;", "userId", "getStepData", "flowId", "", "stepId", "remove", "", "getUniKey", "putStepData", "", "stepData", "Companion", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.common.c.a */
public final class FlowStorage {

    /* renamed from: b */
    public static FlowStorage f141416b;

    /* renamed from: c */
    public static final Companion f141417c = new Companion(null);

    /* renamed from: a */
    public String f141418a;

    /* renamed from: d */
    private final Map<String, FlowStepData> f141419d = new ConcurrentHashMap();

    @JvmStatic
    /* renamed from: a */
    public static final void m222678a() {
        f141417c.mo194788b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/common/storage/FlowStorage$Companion;", "", "()V", "userInstance", "Lcom/ss/android/lark/ug/dyflow/common/storage/FlowStorage;", "reset", "", "userStorage", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ug.dyflow.common.c.a$a */
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* renamed from: b */
        public final void mo194788b() {
            FlowStorage.f141416b = null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            if (android.text.TextUtils.equals(r1, r0) == false) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
            if (android.text.TextUtils.equals(r2, r0) == false) goto L_0x0042;
         */
        @kotlin.jvm.JvmStatic
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.lark.ug.dyflow.common.storage.FlowStorage mo194787a() {
            /*
                r4 = this;
                com.ss.android.lark.ug.c.a r0 = com.ss.android.lark.ug.C57345a.m222261a()
                java.lang.String r1 = "UGModule.getDependency()"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                java.lang.String r0 = r0.mo194668b()
                if (r0 == 0) goto L_0x0010
                goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                com.ss.android.lark.ug.dyflow.common.c.a r1 = com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.f141416b
                r2 = 0
                if (r1 == 0) goto L_0x002a
                com.ss.android.lark.ug.dyflow.common.c.a r1 = com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.f141416b
                if (r1 == 0) goto L_0x001e
                java.lang.String r1 = r1.f141418a
                goto L_0x001f
            L_0x001e:
                r1 = r2
            L_0x001f:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r1 = android.text.TextUtils.equals(r1, r3)
                if (r1 != 0) goto L_0x004e
            L_0x002a:
                java.lang.Class<com.ss.android.lark.ug.dyflow.common.c.a> r1 = com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.class
                monitor-enter(r1)
                com.ss.android.lark.ug.dyflow.common.c.a r3 = com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.f141416b     // Catch:{ all -> 0x0056 }
                if (r3 == 0) goto L_0x0042
                com.ss.android.lark.ug.dyflow.common.c.a r3 = com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.f141416b     // Catch:{ all -> 0x0056 }
                if (r3 == 0) goto L_0x0037
                java.lang.String r2 = r3.f141418a     // Catch:{ all -> 0x0056 }
            L_0x0037:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ all -> 0x0056 }
                r3 = r0
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ all -> 0x0056 }
                boolean r2 = android.text.TextUtils.equals(r2, r3)     // Catch:{ all -> 0x0056 }
                if (r2 != 0) goto L_0x004b
            L_0x0042:
                com.ss.android.lark.ug.dyflow.common.c.a r2 = new com.ss.android.lark.ug.dyflow.common.c.a     // Catch:{ all -> 0x0056 }
                r2.<init>()     // Catch:{ all -> 0x0056 }
                r2.f141418a = r0     // Catch:{ all -> 0x0056 }
                com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.f141416b = r2     // Catch:{ all -> 0x0056 }
            L_0x004b:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0056 }
                monitor-exit(r1)
            L_0x004e:
                com.ss.android.lark.ug.dyflow.common.c.a r0 = com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.f141416b
                if (r0 != 0) goto L_0x0055
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x0055:
                return r0
            L_0x0056:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.ug.dyflow.common.storage.FlowStorage.Companion.mo194787a():com.ss.android.lark.ug.dyflow.common.c.a");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo194786a(FlowStepData flowStepData) {
        Intrinsics.checkParameterIsNotNull(flowStepData, "stepData");
        String b = flowStepData.mo194834b();
        if (b != null) {
            this.f141419d.put(m222677a(flowStepData.mo194828a(), b), flowStepData);
        }
    }

    /* renamed from: a */
    private final String m222677a(long j, String str) {
        return j + '_' + str;
    }

    /* renamed from: a */
    public final FlowStepData mo194785a(long j, String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "stepId");
        String a = m222677a(j, str);
        if (!this.f141419d.containsKey(a)) {
            return null;
        }
        if (z) {
            return this.f141419d.remove(a);
        }
        return this.f141419d.get(a);
    }
}
