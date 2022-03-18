package com.bytedance.ee.bear.domain;

import com.bytedance.ee.bear.binder.annotation.NewRemoteService;
import io.reactivex.AbstractC68307f;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.domain.e */
public interface AbstractC6307e {

    @NewRemoteService
    /* renamed from: com.bytedance.ee.bear.domain.e$a */
    public interface AbstractC6308a {

        /* renamed from: com.bytedance.ee.bear.domain.e$a$a */
        public interface AbstractC6309a {
            void onConfigChanged(Map<String, String> map);
        }

        void fetchConfig();

        AbstractC68307f<String> getDomainCharacteristicConfig();

        void registerConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener);

        void unregisterConfigChangeListener(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener);
    }

    /* renamed from: a */
    void mo17334a();

    /* renamed from: a */
    void mo17335a(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener);

    /* renamed from: b */
    AbstractC68307f<String> mo17336b();

    /* renamed from: b */
    void mo17337b(BinderOnDomainCharacteristicChangeListener binderOnDomainCharacteristicChangeListener);
}
