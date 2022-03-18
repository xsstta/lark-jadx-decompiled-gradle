package com.ss.android.ugc.effectmanager.knadapt;

import com.ss.android.ugc.effectmanager.common.utils.EPUtils;
import com.ss.ugc.effectplatform.IEffectPlatformEncryptor;
import com.ss.ugc.effectplatform.util.EffectPlatformAES;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/knadapt/KNEPDecryptor;", "Lcom/ss/ugc/effectplatform/IEffectPlatformEncryptor;", "()V", "decrypt", "", "content", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.e.b */
public final class KNEPDecryptor implements IEffectPlatformEncryptor {

    /* renamed from: a */
    public static final KNEPDecryptor f151435a = new KNEPDecryptor();

    private KNEPDecryptor() {
    }

    @Override // com.ss.ugc.effectplatform.IEffectPlatformEncryptor
    /* renamed from: a */
    public String mo207361a(String str) {
        EffectPlatformAES.f165107a.mo228308a(EPUtils.m235253a());
        return EffectPlatformAES.f165107a.mo228310b(str);
    }
}
