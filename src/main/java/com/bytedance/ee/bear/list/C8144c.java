package com.bytedance.ee.bear.list;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.am;
import com.bytedance.ee.bear.contract.net.SimpleRequestResult;
import com.bytedance.ee.bear.list.C8144c;
import com.bytedance.ee.bear.list.dto.FolderVersion;
import com.bytedance.ee.bear.list.folder.C8357d;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p702e.C13657b;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

/* renamed from: com.bytedance.ee.bear.list.c */
public class C8144c {

    /* renamed from: a */
    private C10917c f21742a;

    /* renamed from: com.bytedance.ee.bear.list.c$a */
    public interface AbstractC8146a {
        /* renamed from: a */
        void mo31477a(String str);

        /* renamed from: a */
        void mo31478a(String str, Throwable th);
    }

    /* renamed from: com.bytedance.ee.bear.list.c$c */
    public interface AbstractC8148c {
        /* renamed from: a */
        void mo31479a(String str);

        /* renamed from: a */
        void mo31480a(String str, DocumentListInfo documentListInfo);

        /* renamed from: a */
        void mo31481a(String str, Throwable th);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32633a(Boolean bool) throws Exception {
    }

    /* renamed from: a */
    public void mo31473a(String str, AbstractC8146a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str);
        m32634a("/api/explorer/recent/delete/", str, hashMap, aVar);
    }

    /* renamed from: a */
    public void mo31472a(String str, int i, int i2, am.AbstractC5108a aVar) {
        NetService.C5076e eVar;
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8147b());
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str);
        hashMap.put("obj_type", String.valueOf(i));
        if (FolderVersion.isShareFolderV2(i2)) {
            eVar = m32623a("/space/api/explorer/v2/remove/object/", hashMap);
        } else {
            eVar = m32623a("/api/explorer/obj/delete/", hashMap);
        }
        a.mo20141a(eVar).mo238020d(new Function() {
            /* class com.bytedance.ee.bear.list.$$Lambda$c$yVSYfpUgrAbByFbVdwB4eAHv6jA */

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8144c.m32625a(am.AbstractC5108a.this, (NetService.Result) obj);
            }
        }).mo238014c(new Function(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$c$FItFHup8X9yJINjqNxKMqdyr1k */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C8144c.this.m32627a(this.f$1, (Boolean) obj);
            }
        }).mo237985a(C11678b.m48481e()).mo238001b($$Lambda$c$jNr0PB5LmboXx5qWRzPF_Tgqrg.INSTANCE, new Consumer() {
            /* class com.bytedance.ee.bear.list.$$Lambda$c$OLu5nR7YKQHcKrTRTXeRaA6zbQk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8144c.m32628a(am.AbstractC5108a.this, (Throwable) obj);
            }
        });
    }

    /* renamed from: a */
    private void m32634a(String str, String str2, Map<String, String> map, AbstractC8146a aVar) {
        if (!TextUtils.isEmpty(str2) || aVar == null) {
            ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C8147b()).mo20141a(m32623a(str, map)).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str2) {
                /* class com.bytedance.ee.bear.list.$$Lambda$c$7sGzJpZoM7IHQw2PBpdvYRNg */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8144c.m32629a(C8144c.AbstractC8146a.this, this.f$1, (NetService.Result) obj);
                }
            }, new Consumer(str2) {
                /* class com.bytedance.ee.bear.list.$$Lambda$c$28r8M5dvppzLQyhtLqmQQMi0veU */
                public final /* synthetic */ String f$1;

                {
                    this.f$1 = r2;
                }

                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    C8144c.m32630a(C8144c.AbstractC8146a.this, this.f$1, (Throwable) obj);
                }
            });
        } else {
            aVar.mo31478a(str2, new Throwable("token is empty"));
        }
    }

    /* renamed from: a */
    public void mo31474a(String str, AbstractC8148c cVar) {
        if (TextUtils.isEmpty(str)) {
            C13479a.m54758a("DeleteExecutor", "removeSingleContainer()...token is empty");
            cVar.mo31481a(str, new Throwable("token is empty"));
            return;
        }
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a($$Lambda$c$ocZJBVJncsUi_q8JlR6UPDT7Rgc.INSTANCE);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        a.mo20141a(m32623a("/space/api/explorer/v2/remove/", hashMap)).mo237985a(C11678b.m48481e()).mo238001b(new Consumer(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$c$is1tzMmL5A6ET3iMbDpF3LU_ib4 */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8144c.m32631a(C8144c.AbstractC8148c.this, this.f$1, (SimpleRequestResult) obj);
            }
        }, new Consumer(str) {
            /* class com.bytedance.ee.bear.list.$$Lambda$c$DYRCiHOYXxFVqFFlUREBw2m4uw */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8144c.m32632a(C8144c.AbstractC8148c.this, this.f$1, (Throwable) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.list.c$b */
    public class C8147b implements NetService.AbstractC5074c<NetService.Result> {
        private C8147b() {
        }

        @Override // com.bytedance.ee.bear.contract.NetService.AbstractC5074c
        public NetService.Result parse(String str) {
            NetService.Result result = new NetService.Result();
            try {
                JSONObject jSONObject = new JSONObject(str);
                result.msg = jSONObject.optString("msg");
                result.code = jSONObject.optInt("code");
                return result;
            } catch (JSONException e) {
                C13479a.m54761a("DeleteExecutor", e);
                return result;
            }
        }
    }

    public C8144c(C10917c cVar) {
        this.f21742a = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ SimpleRequestResult m32624a(String str) throws NetService.ParseException {
        return (SimpleRequestResult) JSON.parseObject(str, SimpleRequestResult.class);
    }

    /* renamed from: a */
    private NetService.C5076e m32623a(String str, Map<String, String> map) {
        NetService.C5077f fVar = new NetService.C5077f(str);
        fVar.mo20143a(1);
        if (map != null) {
            fVar.mo20147a(map);
        }
        return fVar;
    }

    /* renamed from: b */
    public void mo31475b(String str, AbstractC8146a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        m32634a("/api/explorer/remove/", str, hashMap, aVar);
    }

    /* renamed from: c */
    public void mo31476c(String str, AbstractC8146a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("obj_token", str);
        m32634a("/api/explorer/share/object/delete/", str, hashMap, aVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Boolean m32625a(am.AbstractC5108a aVar, NetService.Result result) throws Exception {
        C13479a.m54764b("DeleteExecutor", "deleteByObjToken: success");
        if (aVar != null) {
            aVar.onPostExecuteSuccess();
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ AbstractC70020b m32627a(String str, Boolean bool) throws Exception {
        return this.f21742a.mo41508c(am.class).mo238020d(new Function(str, bool) {
            /* class com.bytedance.ee.bear.list.$$Lambda$c$RtDUSZZ21Loo2jSW9UmnPkPZjXQ */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ Boolean f$1;

            {
                this.f$0 = r1;
                this.f$1 = r2;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                String str = this.f$0;
                Boolean bool = this.f$1;
                return ((am) obj).notifyListDocDelete(str);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32628a(am.AbstractC5108a aVar, Throwable th) throws Exception {
        int i;
        C13479a.m54759a("DeleteExecutor", "deleteByObjToken: error", th);
        if (th instanceof NetService.ServerErrorException) {
            i = ((NetService.ServerErrorException) th).getCode();
        } else {
            i = -1;
        }
        if (aVar != null) {
            aVar.onPostExecuteFail(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32629a(AbstractC8146a aVar, String str, NetService.Result result) throws Exception {
        if (aVar != null) {
            aVar.mo31477a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32630a(AbstractC8146a aVar, String str, Throwable th) throws Exception {
        C13479a.m54761a("DeleteExecutor", th);
        if (aVar != null) {
            aVar.mo31478a(str, th);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32631a(AbstractC8148c cVar, String str, SimpleRequestResult simpleRequestResult) throws Exception {
        C13479a.m54764b("DeleteExecutor", "removeSingleContainer()...success");
        cVar.mo31479a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m32632a(AbstractC8148c cVar, String str, Throwable th) throws Exception {
        C13479a.m54758a("DeleteExecutor", "removeSingleContainer()...error = " + th);
        if (th instanceof NetService.ServerErrorException) {
            NetService.ServerErrorException serverErrorException = (NetService.ServerErrorException) th;
            if (serverErrorException.getCode() == 4) {
                C13479a.m54764b("DeleteExecutor", "removeSingleContainer()...authority fail");
                DocumentListInfo a = new C8357d().parse(serverErrorException.getJson());
                if (a != null && C13657b.m55423b(a.getDocumentList())) {
                    cVar.mo31480a(str, a);
                    return;
                }
            }
        }
        cVar.mo31481a(str, th);
    }
}
