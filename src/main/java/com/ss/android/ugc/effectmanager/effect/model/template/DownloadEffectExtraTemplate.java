package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.ugc.effectplatform.model.DownloadEffectExtra;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/DownloadEffectExtraTemplate;", "Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "kDownloadEffect", "(Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;)V", "getKDownloadEffect", "()Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.d */
public class DownloadEffectExtraTemplate extends DownloadEffectExtra {
    private final transient DownloadEffectExtra kDownloadEffect;

    public DownloadEffectExtraTemplate() {
        this(null, 1, null);
    }

    public DownloadEffectExtra getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    public DownloadEffectExtraTemplate(DownloadEffectExtra aVar) {
        super(null, 1, null);
        this.kDownloadEffect = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtraTemplate(DownloadEffectExtra aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
