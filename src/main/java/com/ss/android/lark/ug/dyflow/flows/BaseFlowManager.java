package com.ss.android.lark.ug.dyflow.flows;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.ug.C57345a;
import com.ss.android.lark.ug.dyflow.common.IFlow;
import com.ss.android.lark.ug.p2859c.AbstractC57392a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H&J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/ug/dyflow/flows/BaseFlowManager;", "", "()V", "user2FlowMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/ss/android/lark/ug/dyflow/common/IFlow;", "getUser2FlowMap", "()Ljava/util/concurrent/ConcurrentHashMap;", "createFlow", "userId", "getUserId", "loadData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "openStep", "uri", "start", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ug.dyflow.a.a */
public abstract class BaseFlowManager {

    /* renamed from: a */
    private final ConcurrentHashMap<String, IFlow> f141353a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public abstract IFlow mo194692b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final ConcurrentHashMap<String, IFlow> mo194689a() {
        return this.f141353a;
    }

    /* renamed from: c */
    private final String mo194695c() {
        AbstractC57392a a = C57345a.m222261a();
        Intrinsics.checkExpressionValueIsNotNull(a, "UGModule.getDependency()");
        String b = a.mo194668b();
        if (b != null) {
            return b;
        }
        return "";
    }

    /* renamed from: b */
    public boolean mo194693b() {
        IFlow dVar = this.f141353a.get(mo194695c());
        if (dVar != null) {
            return dVar.mo194741a();
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo194691a(String str) {
        IFlow dVar = this.f141353a.get(mo194695c());
        if (dVar == null || !dVar.mo194744b(str)) {
            return false;
        }
        dVar.mo194742a(str);
        return true;
    }

    /* renamed from: a */
    public void mo194690a(IGetDataCallback<Boolean> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
        String c = mo194695c();
        IFlow dVar = this.f141353a.get(c);
        if (dVar == null) {
            synchronized (c) {
                if (dVar == null) {
                    dVar = mo194692b(c);
                    this.f141353a.put(c, dVar);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        if (dVar != null) {
            dVar.mo194736a(iGetDataCallback);
        }
    }
}
