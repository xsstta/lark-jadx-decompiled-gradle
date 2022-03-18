package com.bytedance.ee.bear.middleground.like.executor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.like.export.LikeUserList;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.middleground.like.executor.b */
public class C9527b {

    /* renamed from: a */
    private NetService f25585a;

    /* renamed from: b */
    private NetService.C5077f f25586b;

    /* renamed from: c */
    private NetService.AbstractC5075d<NetService.Result<LikeUserList>> f25587c;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.like.executor.b$a */
    public static class C9529a implements NetService.AbstractC5074c<NetService.Result<LikeUserList>> {
        private C9529a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<LikeUserList> parse(String str) {
            try {
                return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<LikeUserList>>() {
                    /* class com.bytedance.ee.bear.middleground.like.executor.C9527b.C9529a.C95301 */
                }, new Feature[0]);
            } catch (Exception e) {
                C13479a.m54761a("LikeListPuller", e);
                return null;
            }
        }
    }

    public C9527b(NetService netService) {
        this.f25585a = netService;
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC70020b m39364a(String str, int i, Throwable th) {
        C13479a.m54758a("LikeListPuller", String.format("FetchLikeUserListExecutor.doAction() error, msg: %s, params: { token: %s, type: %s }", th, C13598b.m55197d(str), String.valueOf(i)));
        return AbstractC68307f.m265084a(th);
    }

    /* renamed from: b */
    private void m39365b(String str, int i, String str2, int i2) {
        NetService.C5077f fVar = new NetService.C5077f("api/like/data/");
        this.f25586b = fVar;
        fVar.mo20143a(2);
        this.f25586b.mo20145a("token", str);
        this.f25586b.mo20145a("refer_type", String.valueOf(i));
        this.f25586b.mo20145a("last_like_id", str2);
        this.f25586b.mo20145a("page_size", String.valueOf(i2));
    }

    /* renamed from: a */
    public AbstractC68307f<NetService.Result<LikeUserList>> mo36411a(String str, int i, String str2, int i2) {
        m39365b(str, i, str2, i2);
        NetService.AbstractC5075d<NetService.Result<LikeUserList>> a = this.f25585a.mo20117a(new C9529a());
        this.f25587c = a;
        return a.mo20141a(this.f25586b).mo238026e(new Function(str, i) {
            /* class com.bytedance.ee.bear.middleground.like.executor.$$Lambda$b$uvNIzsJdr90MbcAdwCby5B3rLnA */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ int f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C9527b.lambda$uvNIzsJdr90MbcAdwCby5B3rLnA(this.f$0, this.f$1, (Throwable) obj);
            }
        });
    }
}
