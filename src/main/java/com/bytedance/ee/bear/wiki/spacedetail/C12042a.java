package com.bytedance.ee.bear.wiki.spacedetail;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.service.C10917c;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.BiFunction;
import java.util.HashMap;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.wiki.spacedetail.a */
public class C12042a {

    /* renamed from: a */
    private C10917c f32517a;

    public C12042a(C10917c cVar) {
        this.f32517a = cVar;
    }

    /* renamed from: a */
    public AbstractC68307f<WikiSpaceInfo> mo46130a(String str) {
        NetService.AbstractC5075d a = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C12043b());
        NetService.C5077f fVar = new NetService.C5077f("/api/wiki/space/get_space_info/");
        fVar.mo20143a(2);
        fVar.mo20145a("space_id", str);
        AbstractC68307f a2 = a.mo20141a(fVar);
        NetService.AbstractC5075d a3 = ((NetService) KoinJavaComponent.m268610a(NetService.class)).mo20117a(new C12049d());
        NetService.C5077f fVar2 = new NetService.C5077f("/api/wiki/perm/get_user_role/");
        fVar2.mo20143a(2);
        fVar2.mo20145a("space_id", str);
        return AbstractC68307f.m265092a(a2, a3.mo20141a(fVar2), new BiFunction(str) {
            /* class com.bytedance.ee.bear.wiki.spacedetail.$$Lambda$a$HCETz1xFFeNkiRoQ615iduBeDg */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // io.reactivex.functions.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return C12042a.m49890a(this.f$0, (NetService.Result) obj, (NetService.Result) obj2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ WikiSpaceInfo m49890a(String str, NetService.Result result, NetService.Result result2) throws Exception {
        return new WikiSpaceInfo((SpaceBean) ((HashMap) result.getData()).get(str), (RoleBean) result2.getData());
    }
}
