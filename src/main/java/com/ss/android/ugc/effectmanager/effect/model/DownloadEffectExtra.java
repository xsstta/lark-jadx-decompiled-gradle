package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/DownloadEffectExtra;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/DownloadEffectExtraTemplate;", "Ljava/io/Serializable;", "kDownloadEffect", "Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "(Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;)V", "getKDownloadEffect", "()Lcom/ss/ugc/effectplatform/model/DownloadEffectExtra;", "value", "", "panel", "getPanel", "()Ljava/lang/String;", "setPanel", "(Ljava/lang/String;)V", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DownloadEffectExtra extends DownloadEffectExtraTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.DownloadEffectExtra kDownloadEffect;

    public DownloadEffectExtra() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate
    public com.ss.ugc.effectplatform.model.DownloadEffectExtra getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    @Override // com.ss.ugc.effectplatform.model.DownloadEffectExtra
    public String getPanel() {
        String panel;
        com.ss.ugc.effectplatform.model.DownloadEffectExtra kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 == null || (panel = kDownloadEffect2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.ss.ugc.effectplatform.model.DownloadEffectExtra
    public void setPanel(String str) {
        com.ss.ugc.effectplatform.model.DownloadEffectExtra kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 != null) {
            kDownloadEffect2.setPanel(str);
        }
        super.setPanel(str);
    }

    public DownloadEffectExtra(com.ss.ugc.effectplatform.model.DownloadEffectExtra aVar) {
        super(aVar);
        String panel;
        this.kDownloadEffect = aVar;
        com.ss.ugc.effectplatform.model.DownloadEffectExtra kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 != null && (panel = kDownloadEffect2.getPanel()) != null) {
            super.setPanel(panel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtra(com.ss.ugc.effectplatform.model.DownloadEffectExtra aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aVar);
    }
}
