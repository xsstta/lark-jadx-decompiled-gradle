package com.ss.ugc.effectplatform;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ss/ugc/effectplatform/EffectPlatformEncryptor;", "", "()V", "encryptor", "Lcom/ss/ugc/effectplatform/IEffectPlatformEncryptor;", "getEncryptor", "()Lcom/ss/ugc/effectplatform/IEffectPlatformEncryptor;", "setEncryptor", "(Lcom/ss/ugc/effectplatform/IEffectPlatformEncryptor;)V", "effect_model_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.b */
public final class EffectPlatformEncryptor {

    /* renamed from: a */
    public static final EffectPlatformEncryptor f164860a = new EffectPlatformEncryptor();

    /* renamed from: b */
    private static IEffectPlatformEncryptor f164861b;

    private EffectPlatformEncryptor() {
    }

    /* renamed from: a */
    public final IEffectPlatformEncryptor mo227729a() {
        return f164861b;
    }

    /* renamed from: a */
    public final void mo227730a(IEffectPlatformEncryptor eVar) {
        f164861b = eVar;
    }
}
