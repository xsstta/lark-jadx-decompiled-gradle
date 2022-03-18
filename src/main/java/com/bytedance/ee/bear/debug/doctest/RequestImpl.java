package com.bytedance.ee.bear.debug.doctest;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.C8277e;
import com.bytedance.ee.bear.list.C8596m;
import com.bytedance.ee.bear.list.C8638n;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import io.reactivex.AbstractC68307f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J$\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/RequestImpl;", "Lcom/bytedance/ee/bear/debug/doctest/IRequest;", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/NetService;)V", "buildConnect", "Lio/reactivex/Flowable;", "url", "", "params", "Ljava/util/HashMap;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.doctest.i */
public final class RequestImpl implements IRequest<DocumentListInfo> {

    /* renamed from: a */
    private final NetService f15129a;

    @Override // com.bytedance.ee.bear.debug.doctest.IRequest
    /* renamed from: a */
    public AbstractC68307f<DocumentListInfo> mo21253a() {
        AbstractC68307f<DocumentListInfo> a = this.f15129a.mo20117a(new C8277e()).mo20141a(mo21259b());
        Intrinsics.checkExpressionValueIsNotNull(a, "mNetService.createPuller…r()).pull(buildRequest())");
        return a;
    }

    /* renamed from: b */
    public NetService.C5076e mo21259b() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(ShareHitPoint.f121869d, "5");
        hashMap.put("need_total", "1");
        hashMap.put("length", "100");
        C8638n a = new C8596m(this.f15129a.mo20116a().f14784a, "/api/explorer/my/object/list/", hashMap, 2).mo33525a(hashMap);
        Intrinsics.checkExpressionValueIsNotNull(a, "creator.create(params)");
        return a;
    }

    public RequestImpl(NetService netService) {
        Intrinsics.checkParameterIsNotNull(netService, "mNetService");
        this.f15129a = netService;
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IRequest
    /* renamed from: a */
    public AbstractC68307f<DocumentListInfo> mo21254a(String str, HashMap<String, String> hashMap) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(hashMap, "params");
        AbstractC68307f<DocumentListInfo> a = this.f15129a.mo20117a(new C8277e()).mo20141a(mo21260b(str, hashMap));
        Intrinsics.checkExpressionValueIsNotNull(a, "mNetService.createPuller…uildRequest(url, params))");
        return a;
    }

    /* renamed from: b */
    public NetService.C5076e mo21260b(String str, HashMap<String, String> hashMap) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(hashMap, "params");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("need_total", "1");
        hashMap2.put("length", "100");
        hashMap.putAll(hashMap2);
        C8638n a = new C8596m(this.f15129a.mo20116a().f14784a, str, hashMap, 2).mo33525a(hashMap);
        Intrinsics.checkExpressionValueIsNotNull(a, "creator.create(params)");
        return a;
    }
}
