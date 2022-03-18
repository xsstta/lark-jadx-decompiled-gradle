package com.bytedance.ee.bear.middleground.like.executor;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.like.export.ClearLikeResponse;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public class ClearLikeExecutor {

    /* renamed from: a */
    public AbstractC9511d f25572a;

    /* renamed from: b */
    private NetService.C5077f f25573b;

    /* renamed from: c */
    private NetService.AbstractC5075d<ClearLikeResult> f25574c;

    /* renamed from: d */
    private NetService f25575d;

    public static class ClearLikeResult extends NetService.Result {
        String id;

        public String getId() {
            return this.id;
        }

        public String toString() {
            return "ClearLikeResult{msg='" + this.msg + '\'' + ", code='" + this.code + '\'' + ", id='" + this.id + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.like.executor.ClearLikeExecutor$a */
    private static class C9522a implements NetService.AbstractC5074c<ClearLikeResult> {
        private C9522a() {
        }

        /* renamed from: a */
        public ClearLikeResult parse(String str) {
            C13479a.m54772d("ClearLikeExecutor", "ClearLikeExecutor parse: json=" + str);
            ClearLikeResult clearLikeResult = new ClearLikeResult();
            try {
                ClearLikeResponse clearLikeResponse = (ClearLikeResponse) JSON.parseObject(str, ClearLikeResponse.class);
                clearLikeResult.setCode(clearLikeResponse.getCode());
                clearLikeResult.setMsg(clearLikeResponse.getMsg());
                if (clearLikeResponse.getData() != null) {
                    clearLikeResult.setId(clearLikeResponse.getData().getId());
                } else {
                    C13479a.m54758a("ClearLikeExecutor", "ClearLikeExecutor parse: ClearLikeResult get data is null");
                    clearLikeResult.setId("");
                }
                return clearLikeResult;
            } catch (Exception e) {
                C13479a.m54759a("ClearLikeExecutor", "ClearLikeExecutor json exception", e);
                return clearLikeResult;
            }
        }
    }

    public ClearLikeExecutor(NetService netService) {
        this.f25575d = netService;
    }

    /* renamed from: a */
    private void m39355a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        hashMap.put("refer_type", Integer.toString(i));
        NetService.C5077f fVar = new NetService.C5077f("api/like/dislike/");
        this.f25573b = fVar;
        fVar.mo20147a(hashMap);
        this.f25573b.mo20143a(1);
    }

    /* renamed from: a */
    public Disposable mo36403a(final String str, final int i, AbstractC9511d dVar) {
        m39355a(str, i);
        this.f25572a = dVar;
        NetService.AbstractC5075d<ClearLikeResult> a = this.f25575d.mo20117a(new C9522a());
        this.f25574c = a;
        return a.mo20141a(this.f25573b).mo238001b(new Consumer<ClearLikeResult>() {
            /* class com.bytedance.ee.bear.middleground.like.executor.ClearLikeExecutor.C95201 */

            /* renamed from: a */
            public void accept(ClearLikeResult clearLikeResult) throws Exception {
                C13479a.m54772d("ClearLikeExecutor", "ClearLikeExecutor doAction accept  result=" + clearLikeResult);
                if (ClearLikeExecutor.this.f25572a != null) {
                    C13479a.m54772d("ClearLikeExecutor", "ClearLikeExecutor accept: ref is not null ");
                    ClearLikeExecutor.this.f25572a.mo25808a(clearLikeResult.getCode(), clearLikeResult.msg, clearLikeResult.getId());
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.middleground.like.executor.ClearLikeExecutor.C95212 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54758a("ClearLikeExecutor", String.format("ClearLikeExecutor.doAction() error, msg: %s, params: { token: %s, type: %s }", th, C13598b.m55197d(str), String.valueOf(i)));
                if (ClearLikeExecutor.this.f25572a != null) {
                    ClearLikeExecutor.this.f25572a.mo25809a(th);
                }
            }
        });
    }
}
