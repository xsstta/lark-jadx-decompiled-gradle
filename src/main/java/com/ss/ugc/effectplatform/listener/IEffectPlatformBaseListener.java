package com.ss.ugc.effectplatform.listener;

import com.ss.ugc.effectplatform.model.ExceptionResult;
import com.tt.frontendapiinterface.ApiHandler;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "T", "", "onFail", "", "failedResult", ApiHandler.API_CALLBACK_EXCEPTION, "Lcom/ss/ugc/effectplatform/model/ExceptionResult;", "(Ljava/lang/Object;Lcom/ss/ugc/effectplatform/model/ExceptionResult;)V", "onSuccess", "response", "(Ljava/lang/Object;)V", "effect_base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.d.b */
public interface IEffectPlatformBaseListener<T> {
    /* renamed from: a */
    void mo207370a(T t);

    /* renamed from: a */
    void mo207371a(T t, ExceptionResult cVar);
}
