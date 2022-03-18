package com.ss.ugc.effectplatform.repository;

import com.ss.ugc.effectplatform.EffectConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bJ&\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/ResourceRepository;", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "downloadResource", "", "urlModelWithPrefix", "Lcom/ss/ugc/effectplatform/model/UrlModelWithPrefix;", "destFilePath", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "url", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.f */
public final class ResourceRepository {

    /* renamed from: a */
    private final EffectConfig f164927a;

    public ResourceRepository(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164927a = effectConfig;
    }
}
