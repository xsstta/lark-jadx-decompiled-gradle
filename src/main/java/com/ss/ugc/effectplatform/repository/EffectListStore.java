package com.ss.ugc.effectplatform.repository;

import bytekn.foundation.concurrent.SharedReference;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/ugc/effectplatform/repository/EffectListStore;", "", "()V", "currentEffectList", "Lbytekn/foundation/concurrent/SharedReference;", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "getCurrentEffectList", "()Lbytekn/foundation/concurrent/SharedReference;", "setCurrentEffectList", "(Lbytekn/foundation/concurrent/SharedReference;)V", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.f.d */
public final class EffectListStore {

    /* renamed from: a */
    private SharedReference<EffectChannelResponse> f164925a = new SharedReference<>(new EffectChannelResponse(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null));
}
