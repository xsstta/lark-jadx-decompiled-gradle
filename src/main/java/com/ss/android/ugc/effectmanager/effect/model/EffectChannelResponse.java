package com.ss.android.ugc.effectmanager.effect.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.ss.ugc.effectplatform.model.EffectPanelModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00160\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u000b\"\u0004\b\u001c\u0010\rR0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u000b\"\u0004\b\u001f\u0010\rR(\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010%\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000e8V@VX\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R(\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0006\u001a\u0004\u0018\u00010,8V@VX\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0002022\u0006\u0010\u0006\u001a\u0002028V@VX\u000e¢\u0006\f\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00109\u001a\u0002082\u0006\u0010\u0006\u001a\u0002088V@VX\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010>\u001a\u0004\u0018\u00010\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\b8V@VX\u000e¢\u0006\f\u001a\u0004\b?\u0010\"\"\u0004\b@\u0010$R(\u0010A\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000e8V@VX\u000e¢\u0006\f\u001a\u0004\bB\u0010'\"\u0004\bC\u0010)R0\u0010D\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020,0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\bE\u0010\u000b\"\u0004\bF\u0010\rR0\u0010G\u001a\b\u0012\u0004\u0012\u00020,0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020,0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\bH\u0010\u000b\"\u0004\bI\u0010\rR(\u0010J\u001a\u0004\u0018\u00010,2\b\u0010\u0006\u001a\u0004\u0018\u00010,8V@VX\u000e¢\u0006\f\u001a\u0004\bK\u0010/\"\u0004\bL\u00101¨\u0006M"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelResponse;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectChannelResponseTemplate;", "Ljava/io/Serializable;", "kChannelResponse", "Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "(Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "allCategoryEffects", "getAllCategoryEffects", "()Ljava/util/List;", "setAllCategoryEffects", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/Effect;", "all_category_effects", "getAll_category_effects", "setAll_category_effects", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryResponse;", "categoryResponseList", "getCategoryResponseList", "setCategoryResponseList", "Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "category_responses", "getCategory_responses", "setCategory_responses", "collection_list", "getCollection_list", "setCollection_list", "collections", "getCollections", "setCollections", "frontEffect", "getFrontEffect", "()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setFrontEffect", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "front_effect", "getFront_effect", "()Lcom/ss/ugc/effectplatform/model/Effect;", "setFront_effect", "(Lcom/ss/ugc/effectplatform/model/Effect;)V", "getKChannelResponse", "()Lcom/ss/ugc/effectplatform/model/EffectChannelResponse;", "", "panel", "getPanel", "()Ljava/lang/String;", "setPanel", "(Ljava/lang/String;)V", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "panelModel", "getPanelModel", "()Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "setPanelModel", "(Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;)V", "Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "panel_model", "getPanel_model", "()Lcom/ss/ugc/effectplatform/model/EffectPanelModel;", "setPanel_model", "(Lcom/ss/ugc/effectplatform/model/EffectPanelModel;)V", "rearEffect", "getRearEffect", "setRearEffect", "rear_effect", "getRear_effect", "setRear_effect", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "url_prefix", "getUrl_prefix", "setUrl_prefix", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectChannelResponse extends EffectChannelResponseTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse;

    public EffectChannelResponse() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public com.ss.ugc.effectplatform.model.EffectChannelResponse getKChannelResponse() {
        return this.kChannelResponse;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<Effect> getAllCategoryEffects() {
        return super.getAllCategoryEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<EffectCategoryResponse> getCategoryResponseList() {
        return super.getCategoryResponseList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<Effect> getCollections() {
        return super.getCollections();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public Effect getFrontEffect() {
        return super.getFrontEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public EffectPanelModel getPanelModel() {
        return super.getPanelModel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public Effect getRearEffect() {
        return super.getRearEffect();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<Effect> getAll_category_effects() {
        List<Effect> all_category_effects;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (all_category_effects = kChannelResponse2.getAll_category_effects()) == null) {
            return super.getAll_category_effects();
        }
        return all_category_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<EffectCategoryResponse> getCategory_responses() {
        List<EffectCategoryResponse> category_responses;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (category_responses = kChannelResponse2.getCategory_responses()) == null) {
            return super.getCategory_responses();
        }
        return category_responses;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<Effect> getCollection_list() {
        List<Effect> collection_list;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (collection_list = kChannelResponse2.getCollection_list()) == null) {
            return super.getCollection_list();
        }
        return collection_list;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public Effect getFront_effect() {
        Effect front_effect;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (front_effect = kChannelResponse2.getFront_effect()) == null) {
            return super.getFront_effect();
        }
        return front_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public String getPanel() {
        String panel;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (panel = kChannelResponse2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public EffectPanelModel getPanel_model() {
        EffectPanelModel panel_model;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (panel_model = kChannelResponse2.getPanel_model()) == null) {
            return super.getPanel_model();
        }
        return panel_model;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public Effect getRear_effect() {
        Effect rear_effect;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (rear_effect = kChannelResponse2.getRear_effect()) == null) {
            return super.getRear_effect();
        }
        return rear_effect;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (url_prefix = kChannelResponse2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 == null || (version = kChannelResponse2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setFrontEffect(Effect effect) {
        super.setFrontEffect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setRearEffect(Effect effect) {
        super.setRearEffect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setAllCategoryEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setAllCategoryEffects(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setCategoryResponseList(List<EffectCategoryResponse> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCategoryResponseList(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setCollections(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCollections(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setFront_effect(Effect effect) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setPanel(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setPanel(str);
        }
        super.setPanel(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setPanelModel(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "value");
        super.setPanelModel(effectPanelModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setRear_effect(Effect effect) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate
    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setVersion(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setVersion(str);
        }
        super.setVersion(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setAll_category_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setAll_category_effects(list);
        }
        super.setAll_category_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setCategory_responses(List<? extends EffectCategoryResponse> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCategory_responses(list);
        }
        super.setCategory_responses(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setCollection_list(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setPanel_model(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setPanel_model(effectPanelModel);
        }
        super.setPanel_model(effectPanelModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelResponse
    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            kChannelResponse2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectChannelResponse(com.ss.ugc.effectplatform.model.EffectChannelResponse effectChannelResponse) {
        super(effectChannelResponse);
        this.kChannelResponse = effectChannelResponse;
        com.ss.ugc.effectplatform.model.EffectChannelResponse kChannelResponse2 = getKChannelResponse();
        if (kChannelResponse2 != null) {
            List<Effect> all_category_effects = kChannelResponse2.getAll_category_effects();
            if (all_category_effects != null) {
                super.setAll_category_effects(all_category_effects);
            }
            List<EffectCategoryResponse> category_responses = kChannelResponse2.getCategory_responses();
            if (category_responses != null) {
                super.setCategory_responses(category_responses);
            }
            List<Effect> collection_list = kChannelResponse2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            Effect front_effect = kChannelResponse2.getFront_effect();
            if (front_effect != null) {
                super.setFront_effect(front_effect);
            }
            String panel = kChannelResponse2.getPanel();
            if (panel != null) {
                super.setPanel(panel);
            }
            EffectPanelModel panel_model = kChannelResponse2.getPanel_model();
            if (panel_model != null) {
                super.setPanel_model(panel_model);
            }
            Effect rear_effect = kChannelResponse2.getRear_effect();
            if (rear_effect != null) {
                super.setRear_effect(rear_effect);
            }
            List<String> url_prefix = kChannelResponse2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kChannelResponse2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelResponse(com.ss.ugc.effectplatform.model.EffectChannelResponse effectChannelResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelResponse);
    }
}
