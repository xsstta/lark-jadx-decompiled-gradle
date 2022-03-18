package com.bytedance.ee.bear.list.subscribe;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.subscribe.SubscribeExecutor;
import com.bytedance.ee.util.io.NonProguard;
import io.reactivex.functions.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

public class SubscribeExecutor {

    /* renamed from: a */
    private NetService f23735a;

    /* renamed from: com.bytedance.ee.bear.list.subscribe.SubscribeExecutor$a */
    public interface AbstractC8818a {
        /* renamed from: a */
        void mo33281a();

        /* renamed from: a */
        void mo33282a(int i, Throwable th);
    }

    /* access modifiers changed from: private */
    public static class SendParams implements NonProguard {
        public String obj_token;
        public int obj_type;

        public String getObj_token() {
            return this.obj_token;
        }

        public int getObj_type() {
            return this.obj_type;
        }

        public void setObj_token(String str) {
            this.obj_token = str;
        }

        public void setObj_type(int i) {
            this.obj_type = i;
        }

        SendParams(String str, int i) {
            this.obj_token = str;
            this.obj_type = i;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.subscribe.SubscribeExecutor$b */
    public class C8819b implements NetService.AbstractC5074c<NetService.Result> {
        private C8819b() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result parse(String str) {
            NetService.Result result = new NetService.Result();
            result.code = -1;
            try {
                result.code = new JSONObject(str).optInt("code");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return result;
        }
    }

    public SubscribeExecutor(NetService netService) {
        this.f23735a = netService;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36964b(AbstractC8818a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.code == 0) {
            aVar.mo33281a();
        } else {
            aVar.mo33282a(result.code, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36962a(AbstractC8818a aVar, NetService.Result result) throws Exception {
        if (aVar == null) {
            return;
        }
        if (result.code == 0) {
            aVar.mo33281a();
        } else {
            aVar.mo33282a(result.code, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m36965b(AbstractC8818a aVar, Throwable th) throws Exception {
        if (aVar == null) {
            return;
        }
        if (th instanceof NetService.ServerErrorException) {
            aVar.mo33282a(((NetService.ServerErrorException) th).getCode(), th);
        } else {
            aVar.mo33282a(-1, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36963a(AbstractC8818a aVar, Throwable th) throws Exception {
        if (aVar == null) {
            return;
        }
        if (th instanceof NetService.ServerErrorException) {
            aVar.mo33282a(((NetService.ServerErrorException) th).getCode(), th);
        } else {
            aVar.mo33282a(-1, th);
        }
    }

    /* renamed from: a */
    private NetService.C5076e m36961a(String str, String str2, int i) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        fVar.mo20153c(JSON.toJSONString(new SendParams(str2, i)));
        return fVar;
    }

    /* renamed from: b */
    public void mo33868b(String str, int i, AbstractC8818a aVar) {
        this.f23735a.mo20117a(new C8819b()).mo20141a(m36961a("/api/subscribe/delete/", str, i)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.subscribe.$$Lambda$SubscribeExecutor$OY1kXQxflhvVE4M_QQg975CYHjs */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubscribeExecutor.m36962a(SubscribeExecutor.AbstractC8818a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.subscribe.$$Lambda$SubscribeExecutor$VsyC9a56KNmX3tZZO2jIQj1_34 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubscribeExecutor.m36963a(SubscribeExecutor.AbstractC8818a.this, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    public void mo33867a(String str, int i, AbstractC8818a aVar) {
        this.f23735a.mo20117a(new C8819b()).mo20141a(m36961a("/api/subscribe/add/", str, i)).mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.subscribe.$$Lambda$SubscribeExecutor$pAqeryb3IBUf8aF2iAVPY2RikeI */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubscribeExecutor.m36964b(SubscribeExecutor.AbstractC8818a.this, (NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.subscribe.$$Lambda$SubscribeExecutor$g2RZruMv8k0erfCP1txn3LKeg8 */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubscribeExecutor.m36965b(SubscribeExecutor.AbstractC8818a.this, (Throwable) obj);
            }
        });
    }
}
