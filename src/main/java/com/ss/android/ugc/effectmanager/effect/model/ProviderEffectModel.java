package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0013H\u0016R$\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u00138V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R(\u0010!\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R0\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020%0$8V@VX\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R0\u0010,\u001a\b\u0012\u0004\u0012\u00020+0$2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020+0$8V@VX\u000e¢\u0006\f\u001a\u0004\b-\u0010(\"\u0004\b.\u0010*R(\u0010/\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b0\u0010\u0010\"\u0004\b1\u0010\u0012¨\u00062"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffectModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/ProviderEffectModelTemplate;", "Ljava/io/Serializable;", "kProviderEffect", "Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "(Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;)V", "value", "", "cursor", "getCursor", "()I", "setCursor", "(I)V", "", "extra", "getExtra", "()Ljava/lang/String;", "setExtra", "(Ljava/lang/String;)V", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "has_more", "getHas_more", "setHas_more", "getKProviderEffect", "()Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "searchTips", "getSearchTips", "setSearchTips", "search_tips", "getSearch_tips", "setSearch_tips", "", "Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect;", "stickerList", "getStickerList", "()Ljava/util/List;", "setStickerList", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/ProviderEffect;", "sticker_list", "getSticker_list", "setSticker_list", "subtitle", "getSubtitle", "setSubtitle", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ProviderEffectModel extends ProviderEffectModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect;

    public ProviderEffectModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public com.ss.ugc.effectplatform.model.ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public String getSearchTips() {
        return super.getSearchTips();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public List<ProviderEffect> getStickerList() {
        return super.getStickerList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public int getCursor() {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getExtra() {
        String extra;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (extra = kProviderEffect2.getExtra()) == null) {
            return super.getExtra();
        }
        return extra;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getSearch_tips() {
        String search_tips;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (search_tips = kProviderEffect2.getSearch_tips()) == null) {
            return super.getSearch_tips();
        }
        return search_tips;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public List<ProviderEffect> getSticker_list() {
        List<ProviderEffect> sticker_list;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (sticker_list = kProviderEffect2.getSticker_list()) == null) {
            return super.getSticker_list();
        }
        return sticker_list;
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public String getSubtitle() {
        String subtitle;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (subtitle = kProviderEffect2.getSubtitle()) == null) {
            return super.getSubtitle();
        }
        return subtitle;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public void setSearchTips(String str) {
        super.setSearchTips(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setExtra(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setExtra(str);
        }
        super.setExtra(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setSearch_tips(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate
    public void setStickerList(List<ProviderEffect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setStickerList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setSubtitle(String str) {
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSubtitle(str);
        }
        super.setSubtitle(str);
    }

    @Override // com.ss.ugc.effectplatform.model.ProviderEffectModel
    public void setSticker_list(List<? extends ProviderEffect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_list(list);
        }
        super.setSticker_list(list);
    }

    public ProviderEffectModel(com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel) {
        super(providerEffectModel);
        this.kProviderEffect = providerEffectModel;
        com.ss.ugc.effectplatform.model.ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            super.setCursor(kProviderEffect2.getCursor());
            String extra = kProviderEffect2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            super.setHas_more(kProviderEffect2.getHas_more());
            String search_tips = kProviderEffect2.getSearch_tips();
            if (search_tips != null) {
                super.setSearch_tips(search_tips);
            }
            List<ProviderEffect> sticker_list = kProviderEffect2.getSticker_list();
            if (sticker_list != null) {
                super.setSticker_list(sticker_list);
            }
            String subtitle = kProviderEffect2.getSubtitle();
            if (subtitle != null) {
                super.setSubtitle(subtitle);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModel(com.ss.ugc.effectplatform.model.ProviderEffectModel providerEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffectModel);
    }
}
