package com.ss.ugc.effectplatform.repository;

import bytekn.foundation.collections.SharedMutableMap;
import bytekn.foundation.concurrent.SharedReference;
import com.ss.ugc.effectplatform.EffectConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002J8\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000eJ&\u0010\u0015\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eJT\u0010\u0016\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\u0014\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0018\u0018\u00010\u000eJ*\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u001cH\u0002J \u0010\u001d\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/UserEffectRepository;", "", "effectConfig", "Lcom/ss/ugc/effectplatform/EffectConfig;", "(Lcom/ss/ugc/effectplatform/EffectConfig;)V", "tagsCachedMap", "Lbytekn/foundation/concurrent/SharedReference;", "Lbytekn/foundation/collections/SharedMutableMap;", "", "checkedTagInHashMap", "", "id", "updateTime", "listener", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "", "fetchFavoriteList", "panel", "extraParams", "", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "isTagUpdated", "modFavoriteList", "effectIds", "", "isFavorite", "requestWriteTask", "taskID", "Lcom/ss/ugc/effectplatform/listener/IUpdateTagListener;", "updateTag", "WrapWriteUpdateTagListener", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.g */
public final class UserEffectRepository {

    /* renamed from: a */
    public SharedReference<SharedMutableMap<String, String>> f164928a = new SharedReference<>(null);

    /* renamed from: b */
    private final EffectConfig f164929b;

    public UserEffectRepository(EffectConfig effectConfig) {
        Intrinsics.checkParameterIsNotNull(effectConfig, "effectConfig");
        this.f164929b = effectConfig;
    }
}
