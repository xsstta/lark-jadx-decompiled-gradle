package com.bytedance.ee.bear.debug.doctest;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.DocumentListInfo;
import com.bytedance.ee.bear.wiki.homepage.recent.RecentWikiListParser;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C69321a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ee/bear/debug/doctest/RequestWikiImpl;", "Lcom/bytedance/ee/bear/debug/doctest/IRequest;", "Lcom/bytedance/ee/bear/list/DocumentListInfo;", "mNetService", "Lcom/bytedance/ee/bear/contract/NetService;", "(Lcom/bytedance/ee/bear/contract/NetService;)V", "GET_RECENT", "", "RECENT_OFFSET", "RECENT_PAGE_MAX_LENGTH", "RECENT_PAGE_SIZE", "TAG", "mCurPageLength", "", "buildConnect", "Lio/reactivex/Flowable;", "url", "params", "Ljava/util/HashMap;", "buildRequest", "Lcom/bytedance/ee/bear/contract/NetService$Request;", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.doctest.j */
public final class RequestWikiImpl implements IRequest<DocumentListInfo> {

    /* renamed from: a */
    private final String f15130a = "RequestWikiImpl";

    /* renamed from: b */
    private final String f15131b = "/api/wiki/search/get_recent/";

    /* renamed from: c */
    private final String f15132c = "offset";

    /* renamed from: d */
    private final String f15133d = "size";

    /* renamed from: e */
    private final String f15134e = "20";

    /* renamed from: f */
    private int f15135f;

    /* renamed from: g */
    private final NetService f15136g;

    @Override // com.bytedance.ee.bear.debug.doctest.IRequest
    /* renamed from: a */
    public AbstractC68307f<DocumentListInfo> mo21253a() {
        AbstractC68307f<DocumentListInfo> a = this.f15136g.mo20117a(new RecentWikiListParser()).mo20141a(mo21261b());
        Intrinsics.checkExpressionValueIsNotNull(a, "mNetService.createPuller…r()).pull(buildRequest())");
        return a;
    }

    /* renamed from: b */
    public NetService.C5076e mo21261b() {
        NetService.C5077f fVar = new NetService.C5077f(this.f15131b);
        fVar.mo20143a(2);
        fVar.mo20145a(this.f15132c, "0");
        fVar.mo20145a(this.f15133d, this.f15134e);
        return fVar;
    }

    public RequestWikiImpl(NetService netService) {
        Intrinsics.checkParameterIsNotNull(netService, "mNetService");
        this.f15136g = netService;
    }

    @Override // com.bytedance.ee.bear.debug.doctest.IRequest
    /* renamed from: a */
    public AbstractC68307f<DocumentListInfo> mo21254a(String str, HashMap<String, String> hashMap) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(hashMap, "params");
        AbstractC68307f<DocumentListInfo> a = this.f15136g.mo20117a(new RecentWikiListParser()).mo20141a(mo21262b(str, hashMap));
        Intrinsics.checkExpressionValueIsNotNull(a, "mNetService.createPuller…uildRequest(url, params))");
        return a;
    }

    /* renamed from: b */
    public NetService.C5076e mo21262b(String str, HashMap<String, String> hashMap) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        Intrinsics.checkParameterIsNotNull(hashMap, "params");
        this.f15135f += 20;
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(2);
        String str2 = this.f15132c;
        String num = Integer.toString(this.f15135f, C69321a.m266164a(10));
        Intrinsics.checkExpressionValueIsNotNull(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        fVar.mo20145a(str2, num);
        fVar.mo20145a(this.f15133d, this.f15134e);
        C13479a.m54764b(this.f15130a, "mCurPageLength  " + this.f15135f);
        return fVar;
    }
}
