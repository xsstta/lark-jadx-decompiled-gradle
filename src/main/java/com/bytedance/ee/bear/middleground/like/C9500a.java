package com.bytedance.ee.bear.middleground.like;

import android.util.ArrayMap;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.like.Push;
import com.bytedance.ee.bear.middleground.like.executor.AddLikeExecutor;
import com.bytedance.ee.bear.middleground.like.executor.C9523a;
import com.bytedance.ee.bear.middleground.like.executor.C9527b;
import com.bytedance.ee.bear.middleground.like.executor.ClearLikeExecutor;
import com.bytedance.ee.bear.middleground.like.export.LikeUserList;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9508a;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b;
import com.bytedance.ee.bear.middleground.like.p461b.AbstractC9511d;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.like.a */
public class C9500a implements AbstractC9509b {

    /* renamed from: a */
    private final ArrayMap<String, Push> f25539a = new ArrayMap<>(2);

    /* renamed from: b */
    private C9523a f25540b;

    /* renamed from: c */
    private ClearLikeExecutor f25541c;

    /* renamed from: d */
    private AddLikeExecutor f25542d;

    /* renamed from: e */
    private C9527b f25543e;

    public C9500a() {
        NetService netService = (NetService) KoinJavaComponent.m268610a(NetService.class);
        this.f25542d = new AddLikeExecutor(netService);
        this.f25541c = new ClearLikeExecutor(netService);
        this.f25540b = new C9523a(netService);
        this.f25543e = new C9527b(netService);
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public int mo36369a(C8275a aVar) {
        if (C8275a.f22371d == aVar) {
            return 1;
        }
        if (C8275a.f22372e == aVar) {
            return 2;
        }
        if (C8275a.f22376i == aVar) {
            return 3;
        }
        if (C8275a.f22373f == aVar) {
            return 4;
        }
        if (C8275a.f22375h == aVar) {
            return 5;
        }
        return 1;
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public void mo36374a(String str) {
        try {
            Push iVar = this.f25539a.get(str);
            if (iVar != null) {
                iVar.mo36516a();
            }
            this.f25539a.remove(str);
        } catch (Exception e) {
            C13479a.m54766b("DefaultLikeManager", e);
        }
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public Disposable mo36370a(String str, int i, AbstractC9508a aVar) {
        return this.f25540b.mo36410a(str, i, aVar);
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: b */
    public Disposable mo36376b(String str, int i, AbstractC9511d dVar) {
        return this.f25541c.mo36403a(str, i, dVar);
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public Disposable mo36371a(String str, int i, AbstractC9511d dVar) {
        return this.f25542d.mo36396a(str, i, dVar);
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public String mo36373a(String str, int i, PushObserver jVar) {
        try {
            Push a = new Push.Builder().mo36519a(str).mo36518a(i).mo36520a();
            a.mo36517a(jVar);
            String valueOf = String.valueOf(a.hashCode());
            this.f25539a.put(valueOf, a);
            return valueOf;
        } catch (Exception e) {
            C13479a.m54766b("DefaultLikeManager", e);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public void mo36375a(String str, int i, String str2) {
        ((AbstractC10740f) KoinJavaComponent.m268610a(AbstractC10740f.class)).mo17295b("/doc/like/activity").mo17314a(LikeListActivity.f25518a, str).mo17308a(LikeListActivity.f25519b, i).mo17314a(LikeListActivity.f25520c, str2).mo17317a();
    }

    @Override // com.bytedance.ee.bear.middleground.like.p461b.AbstractC9509b
    /* renamed from: a */
    public AbstractC68307f<NetService.Result<LikeUserList>> mo36372a(String str, int i, String str2, int i2) {
        return this.f25543e.mo36411a(str, i, str2, i2);
    }
}
