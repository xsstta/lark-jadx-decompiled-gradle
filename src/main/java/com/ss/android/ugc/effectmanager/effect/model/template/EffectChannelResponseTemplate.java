package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ugc.effectplatform.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR2\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR*\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00068V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R&\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u001a8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00068V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R2\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020#0\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\t\"\u0004\b&\u0010\u000b¨\u0006'"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectChannelResponseTemplate;", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "kChannelResponse", "(Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "allCategoryEffects", "getAllCategoryEffects", "()Ljava/util/List;", "setAllCategoryEffects", "(Ljava/util/List;)V", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "categoryResponseList", "getCategoryResponseList", "setCategoryResponseList", "collections", "getCollections", "setCollections", "frontEffect", "getFrontEffect", "()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setFrontEffect", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "getKChannelResponse", "()Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "panelModel", "getPanelModel", "()Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "setPanelModel", "(Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;)V", "rearEffect", "getRearEffect", "setRearEffect", "", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.g */
public class EffectChannelResponseTemplate extends EffectChannelResponse {
    private List<? extends Effect> allCategoryEffects;
    private List<EffectCategoryResponse> categoryResponseList;
    private List<? extends Effect> collections;
    private Effect frontEffect;
    private final transient EffectChannelResponse kChannelResponse;
    private EffectPanelModel panelModel;
    private Effect rearEffect;
    private List<String> urlPrefix;

    public EffectChannelResponseTemplate() {
        this(null, 1, null);
    }

    public EffectChannelResponse getKChannelResponse() {
        return this.kChannelResponse;
    }

    public Effect getFrontEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (effect = kChannelResponse2.getFront_effect()) == null) {
            effect = super.getFront_effect();
        }
        return new Effect(effect);
    }

    public EffectPanelModel getPanelModel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (effectPanelModel = kChannelResponse2.getPanel_model()) == null) {
            effectPanelModel = super.getPanel_model();
        }
        return new EffectPanelModel(effectPanelModel);
    }

    public Effect getRearEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (effect = kChannelResponse2.getRear_effect()) == null) {
            effect = super.getRear_effect();
        }
        return new Effect(effect);
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (url_prefix = kChannelResponse2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.g, com.ss.ugc.effectplatform.model.EffectChannelResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getAllCategoryEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getAllCategoryEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryResponse> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.g, com.ss.ugc.effectplatform.model.EffectChannelResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> getCategoryResponseList() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getCategoryResponseList():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.g, com.ss.ugc.effectplatform.model.EffectChannelResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollections() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate.getCollections():java.util.List");
    }

    public void setAllCategoryEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.allCategoryEffects = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setAll_category_effects(list);
        }
        super.setAll_category_effects(list);
    }

    public void setCategoryResponseList(List<EffectCategoryResponse> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.categoryResponseList = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCategory_responses(list);
        }
        super.setCategory_responses(list);
    }

    public void setCollections(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.collections = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    public void setPanelModel(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "value");
        this.panelModel = effectPanelModel;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setPanel_model(effectPanelModel);
        }
        super.setPanel_model(effectPanelModel);
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlPrefix = list;
        EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectChannelResponseTemplate(EffectChannelResponse effectChannelResponse) {
        super(null, null, null, null, null, null, null, null, null, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME, null);
        this.kChannelResponse = effectChannelResponse;
        this.allCategoryEffects = new ArrayList();
        this.categoryResponseList = new ArrayList();
        this.collections = new ArrayList();
        this.panelModel = new EffectPanelModel(null, 1, null);
        this.urlPrefix = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelResponseTemplate(EffectChannelResponse effectChannelResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelResponse);
    }
}
