package com.bytedance.ee.bear.middleground.like.executor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.like.export.LikeCountResult;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9508a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.ee.bear.middleground.like.executor.a */
public class C9523a {

    /* renamed from: a */
    private AbstractC9508a f25580a;

    /* renamed from: b */
    private NetService.C5077f f25581b;

    /* renamed from: c */
    private NetService.AbstractC5075d<NetService.Result<LikeCountResult>> f25582c;

    /* renamed from: d */
    private NetService f25583d;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.middleground.like.executor.a$a */
    public static class C9525a implements NetService.AbstractC5074c<NetService.Result<LikeCountResult>> {
        private C9525a() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result<LikeCountResult> parse(String str) {
            try {
                return (NetService.Result) JSON.parseObject(str, new TypeReference<NetService.Result<LikeCountResult>>() {
                    /* class com.bytedance.ee.bear.middleground.like.executor.C9523a.C9525a.C95261 */
                }, new Feature[0]);
            } catch (Exception e) {
                C13479a.m54761a("FetchLikeCountExecutor", e);
                return null;
            }
        }
    }

    public C9523a(NetService netService) {
        this.f25583d = netService;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m39360a(NetService.Result result) {
        if (this.f25580a != null) {
            LikeCountResult likeCountResult = (LikeCountResult) result.getData();
            this.f25580a.mo25810a(result.getCode(), result.getMsg(), likeCountResult.getCount(), likeCountResult.getLikeId(), likeCountResult.getMessageBoxVersion());
        }
    }

    /* renamed from: a */
    private void m39361a(String str, int i) {
        NetService.C5077f fVar = new NetService.C5077f("api/like/count/");
        this.f25581b = fVar;
        fVar.mo20143a(2);
        this.f25581b.mo20145a("token", str);
        this.f25581b.mo20145a("refer_type", String.valueOf(i));
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m39362a(String str, int i, Throwable th) {
        C13479a.m54758a("FetchLikeCountExecutor", String.format("FetchLikeCountExecutor.doAction() error,  msg: %s, params: { token: %s, type: %s }", th, C13598b.m55197d(str), String.valueOf(i)));
        AbstractC9508a aVar = this.f25580a;
        if (aVar != null) {
            aVar.mo25811a(th);
        }
    }

    /* renamed from: a */
    public Disposable mo36410a(String str, int i, AbstractC9508a aVar) {
        m39361a(str, i);
        this.f25580a = aVar;
        NetService.AbstractC5075d<NetService.Result<LikeCountResult>> a = this.f25583d.mo20117a(new C9525a());
        this.f25582c = a;
        return a.mo20141a(this.f25581b).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.middleground.like.executor.$$Lambda$a$GGU_uA2jm2OcYCGkR5hldnlisg */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9523a.m269829lambda$GGU_uA2jm2OcYCGkR5hldnlisg(C9523a.this, (NetService.Result) obj);
            }
        }, new Consumer(str, i) {
            /* class com.bytedance.ee.bear.middleground.like.executor.$$Lambda$a$ygvdfxccQVE4WkFaOHW1vwcHNxk */
            public final /* synthetic */ String f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C9523a.lambda$ygvdfxccQVE4WkFaOHW1vwcHNxk(C9523a.this, this.f$1, this.f$2, (Throwable) obj);
            }
        });
    }
}
