package com.bytedance.ee.bear.middleground.like.p461b;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.like.PushObserver;
import com.bytedance.ee.bear.middleground.like.export.LikeUserList;
import io.reactivex.AbstractC68307f;
import io.reactivex.disposables.Disposable;

/* renamed from: com.bytedance.ee.bear.middleground.like.b.b */
public interface AbstractC9509b {
    /* renamed from: a */
    int mo36369a(C8275a aVar);

    /* renamed from: a */
    Disposable mo36370a(String str, int i, AbstractC9508a aVar);

    /* renamed from: a */
    Disposable mo36371a(String str, int i, AbstractC9511d dVar);

    /* renamed from: a */
    AbstractC68307f<NetService.Result<LikeUserList>> mo36372a(String str, int i, String str2, int i2);

    /* renamed from: a */
    String mo36373a(String str, int i, PushObserver jVar);

    /* renamed from: a */
    void mo36374a(String str);

    /* renamed from: a */
    void mo36375a(String str, int i, String str2);

    /* renamed from: b */
    Disposable mo36376b(String str, int i, AbstractC9511d dVar);
}
