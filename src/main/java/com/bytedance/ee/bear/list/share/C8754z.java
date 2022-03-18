package com.bytedance.ee.bear.list.share;

import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.net.AbstractC5204e;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.list.share.z */
public class C8754z {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ NetService.Result m36781a(String str) throws NetService.ParseException {
        return (NetService.Result) JSON.parseObject(str, NetService.Result.class);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m36782a(AbstractC5204e eVar, Throwable th) throws Exception {
        eVar.mo20807a(th);
        C13479a.m54759a("ShareFolderExecutor", "hiddenShareFolder()...", th);
    }

    /* renamed from: a */
    public void mo33784a(boolean z, NetService netService, String str, AbstractC5204e<NetService.Result> eVar) {
        String str2;
        if (z) {
            str2 = "/api/explorer/share/folder/show/";
        } else {
            str2 = "/api/explorer/share/folder/hide/";
        }
        NetService.C5076e fVar = new NetService.C5077f(str2);
        fVar.mo20143a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("token", str);
        fVar.mo20147a(hashMap);
        AbstractC68307f a = netService.mo20117a($$Lambda$z$Gfocs0Y1i8MZKfWBnShGMRxARps.INSTANCE).mo20141a(fVar);
        eVar.getClass();
        a.mo238001b(new Consumer() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$xZiGbCFZYyR2J7UA79mXs4Jnc */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                AbstractC5204e.this.mo20806a((NetService.Result) obj);
            }
        }, new Consumer() {
            /* class com.bytedance.ee.bear.list.share.$$Lambda$z$pgWqUi1mwFVCFQLhBdlyPrfspoQ */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C8754z.m36782a(AbstractC5204e.this, (Throwable) obj);
            }
        });
    }
}
