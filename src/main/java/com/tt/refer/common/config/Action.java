package com.tt.refer.common.config;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000eJC\u0010\u001b\u001a\u00020\u001c26\u0010\u001d\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001f0\u001e\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001f¢\u0006\u0002\u0010 JE\u0010!\u001a\u00020\u001826\u0010\u001d\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001f0\u001e\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010\"R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR,\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R^\u0010\u0013\u001aF\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00140\u00040\u0004j,\u0012(\u0012&\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u00140\u0004j\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0014`\u0006`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\n¨\u0006$"}, d2 = {"Lcom/tt/refer/common/config/Action;", "", "()V", "commands", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCommands", "()Ljava/util/ArrayList;", "setCommands", "(Ljava/util/ArrayList;)V", "mListeners", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/tt/refer/common/config/IStrategyListener;", "getMListeners", "()Ljava/util/concurrent/ConcurrentHashMap;", "setMListeners", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "options", "Lcom/tt/refer/common/config/Config;", "getOptions", "setOptions", "addListener", "", ShareHitPoint.f121869d, "listener", "isOk", "", "args", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Z", "notifyCommandResult", "([Lkotlin/Pair;)V", "Companion", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.refer.common.b.a */
public final class Action {

    /* renamed from: a */
    public static final Companion f170582a = new Companion(null);

    /* renamed from: b */
    private ArrayList<String> f170583b = new ArrayList<>();

    /* renamed from: c */
    private ArrayList<ArrayList<Config<? extends Object>>> f170584c = new ArrayList<>();

    /* renamed from: d */
    private ConcurrentHashMap<String, CopyOnWriteArrayList<IStrategyListener>> f170585d = new ConcurrentHashMap<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tt/refer/common/config/Action$Companion;", "", "()V", "TAG", "", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.tt.refer.common.b.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final ArrayList<String> mo235113a() {
        return this.f170583b;
    }

    /* renamed from: b */
    public final ArrayList<ArrayList<Config<? extends Object>>> mo235116b() {
        return this.f170584c;
    }

    /* renamed from: b */
    private final void m263582b(Pair<String, ? extends Object>... pairArr) {
        AppBrandLogger.m52830i("ActionImpl", "listeners size = " + this.f170585d.size());
        for (Map.Entry<String, CopyOnWriteArrayList<IStrategyListener>> entry : this.f170585d.entrySet()) {
            entry.getKey();
            for (T t : entry.getValue()) {
                ArrayList arrayList = new ArrayList();
                for (Pair<String, ? extends Object> pair : pairArr) {
                    arrayList.add(pair);
                }
                t.mo231954a(arrayList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        if (r5 != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d5, code lost:
        if (r2 == false) goto L_0x000e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo235115a(kotlin.Pair<java.lang.String, ? extends java.lang.Object>... r13) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.refer.common.config.Action.mo235115a(kotlin.Pair[]):boolean");
    }

    /* renamed from: a */
    public final void mo235114a(String str, IStrategyListener eVar) {
        Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        if (this.f170583b.contains(str)) {
            if (this.f170585d.get(str) == null) {
                this.f170585d.put(str, new CopyOnWriteArrayList<>());
            }
            AppBrandLogger.m52830i("ActionImpl", "addListener");
            CopyOnWriteArrayList<IStrategyListener> copyOnWriteArrayList = this.f170585d.get(str);
            if (copyOnWriteArrayList == null) {
                Intrinsics.throwNpe();
            }
            copyOnWriteArrayList.add(eVar);
        }
    }
}
