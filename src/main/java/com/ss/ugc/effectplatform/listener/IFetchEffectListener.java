package com.ss.ugc.effectplatform.listener;

import com.ss.ugc.effectplatform.model.Effect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\"\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H&¨\u0006\u000b"}, d2 = {"Lcom/ss/ugc/effectplatform/listener/IFetchEffectListener;", "Lcom/ss/ugc/effectplatform/listener/IEffectPlatformBaseListener;", "Lcom/ss/ugc/effectplatform/model/Effect;", "onProgress", "", "effect", "progress", "", "contentLength", "", "onStart", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.ugc.effectplatform.d.d */
public interface IFetchEffectListener extends IEffectPlatformBaseListener<Effect> {
    /* renamed from: a */
    void mo207367a(Effect effect);

    /* renamed from: a */
    void mo207368a(Effect effect, int i, long j);
}
