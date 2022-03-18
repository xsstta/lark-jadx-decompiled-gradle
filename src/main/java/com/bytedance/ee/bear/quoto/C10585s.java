package com.bytedance.ee.bear.quoto;

import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.quoto.BusinessInfoRequester;
import io.reactivex.AbstractC68307f;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.quoto.s */
public class C10585s implements AbstractC10576l {
    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
    }

    @Override // com.bytedance.ee.bear.quoto.AbstractC10576l
    /* renamed from: a */
    public AbstractC68307f<BusinessInfoRequester.BusinessInfoResult> mo40027a() {
        return new BusinessInfoRequester((NetService) KoinJavaComponent.m268610a(NetService.class)).mo39960a();
    }
}
