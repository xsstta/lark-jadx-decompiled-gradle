package com.bytedance.ee.bear.middleground.like.executor;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.middleground.like.export.AddLikeResponse;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

public class AddLikeExecutor {

    /* renamed from: a */
    public AbstractC9511d f25564a;

    /* renamed from: b */
    private NetService.C5077f f25565b;

    /* renamed from: c */
    private NetService.AbstractC5075d<AddLikeResult> f25566c;

    /* renamed from: d */
    private NetService f25567d;

    public static class AddLikeResult extends NetService.Result {
        String id;

        public String getId() {
            return this.id;
        }

        public String toString() {
            return "AddLikeResult{msg='" + this.msg + '\'' + ", code='" + this.code + '\'' + ", id='" + this.id + '\'' + '}';
        }

        public void setId(String str) {
            this.id = str;
        }
    }

    /* renamed from: com.bytedance.ee.bear.middleground.like.executor.AddLikeExecutor$a */
    private static class C9519a implements NetService.AbstractC5074c<AddLikeResult> {
        private C9519a() {
        }

        /* renamed from: a */
        public AddLikeResult parse(String str) {
            C13479a.m54772d("AddLikeExecutor", "AddLikeExecutor parse: json=" + str);
            AddLikeResult addLikeResult = new AddLikeResult();
            try {
                AddLikeResponse addLikeResponse = (AddLikeResponse) JSON.parseObject(str, AddLikeResponse.class);
                addLikeResult.setCode(addLikeResponse.getCode());
                addLikeResult.setMsg(addLikeResponse.getMsg());
                if (addLikeResponse.getData() != null) {
                    addLikeResult.setId(addLikeResponse.getData().getId());
                } else {
                    C13479a.m54758a("AddLikeExecutor", "AddLikeExecutor AddLikeParser parse: data is null");
                    addLikeResult.setId("");
                }
                return addLikeResult;
            } catch (Exception e) {
                C13479a.m54759a("AddLikeExecutor", "AddLikeExecutor json exception", e);
                return addLikeResult;
            }
        }
    }

    public AddLikeExecutor(NetService netService) {
        this.f25567d = netService;
    }

    /* renamed from: a */
    private void m39350a(String str, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        hashMap.put("refer_type", Integer.toString(i));
        NetService.C5077f fVar = new NetService.C5077f("api/like/like/");
        this.f25565b = fVar;
        fVar.mo20147a(hashMap);
        this.f25565b.mo20143a(1);
    }

    /* renamed from: a */
    public Disposable mo36396a(final String str, final int i, AbstractC9511d dVar) {
        m39350a(str, i);
        this.f25564a = dVar;
        NetService.AbstractC5075d<AddLikeResult> a = this.f25567d.mo20117a(new C9519a());
        this.f25566c = a;
        return a.mo20141a(this.f25565b).mo238001b(new Consumer<AddLikeResult>() {
            /* class com.bytedance.ee.bear.middleground.like.executor.AddLikeExecutor.C95171 */

            /* renamed from: a */
            public void accept(AddLikeResult addLikeResult) throws Exception {
                C13479a.m54772d("AddLikeExecutor", "AddLikeExecutor doAction accept  result=" + addLikeResult);
                if (AddLikeExecutor.this.f25564a != null) {
                    C13479a.m54772d("AddLikeExecutor", "AddLikeExecutor accept: ref is not null ");
                    AddLikeExecutor.this.f25564a.mo25808a(addLikeResult.getCode(), addLikeResult.msg, addLikeResult.getId());
                }
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.middleground.like.executor.AddLikeExecutor.C95182 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54758a("AddLikeExecutor", String.format("AddLikeExecutor.doAction() error,  msg: %s, params: { token: %s, type: %s }", th, C13598b.m55197d(str), String.valueOf(i)));
                if (AddLikeExecutor.this.f25564a != null) {
                    AddLikeExecutor.this.f25564a.mo25809a(th);
                }
            }
        });
    }
}
