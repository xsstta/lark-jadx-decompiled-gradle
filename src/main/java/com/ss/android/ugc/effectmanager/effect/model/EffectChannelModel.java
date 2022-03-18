package com.ss.android.ugc.effectmanager.effect.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectPanelModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0016J\b\u0010#\u001a\u00020$H\u0016J\u0016\u0010%\u001a\u00020&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012H\u0016J\u0016\u0010'\u001a\u00020&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0016J\u0016\u0010(\u001a\u00020&2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020!0\u0012H\u0016J\u0010\u0010)\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020$H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R(\u0010\u001b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\n\"\u0004\b\u001d\u0010\f¨\u0006*"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/EffectChannelModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectChannelModelTemplate;", "Ljava/io/Serializable;", "kChannelModel", "Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "(Lcom/ss/ugc/effectplatform/model/EffectChannelModel;)V", "value", "", "front_effect_id", "getFront_effect_id", "()Ljava/lang/String;", "setFront_effect_id", "(Ljava/lang/String;)V", "getKChannelModel", "()Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "rear_effect_id", "getRear_effect_id", "setRear_effect_id", "", "urlPrefix", "getUrlPrefix", "()Ljava/util/List;", "setUrlPrefix", "(Ljava/util/List;)V", "url_prefix", "getUrl_prefix", "setUrl_prefix", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "getCategory", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "getCollection", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getEffects", "getPanel", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "setCategory", "", "setCollection", "setEffects", "setPanel", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class EffectChannelModel extends EffectChannelModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel;

    public EffectChannelModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public com.ss.ugc.effectplatform.model.EffectChannelModel getKChannelModel() {
        return this.kChannelModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<EffectCategoryModel> getCategory() {
        return super.getCategory();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<Effect> getCollection() {
        return super.getCollection();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public EffectPanelModel getPanel() {
        return super.getPanel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public String getFront_effect_id() {
        String front_effect_id;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (front_effect_id = kChannelModel2.getFront_effect_id()) == null) {
            return super.getFront_effect_id();
        }
        return front_effect_id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public String getRear_effect_id() {
        String rear_effect_id;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (rear_effect_id = kChannelModel2.getRear_effect_id()) == null) {
            return super.getRear_effect_id();
        }
        return rear_effect_id;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (url_prefix = kChannelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (version = kChannelModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setCategory(List<EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCategory(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCollection(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setFront_effect_id(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setFront_effect_id(str);
        }
        super.setFront_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setPanel(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "value");
        super.setPanel(effectPanelModel);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setRear_effect_id(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setRear_effect_id(str);
        }
        super.setRear_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate
    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setVersion(String str) {
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    @Override // com.ss.ugc.effectplatform.model.EffectChannelModel
    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectChannelModel(com.ss.ugc.effectplatform.model.EffectChannelModel effectChannelModel) {
        super(effectChannelModel);
        this.kChannelModel = effectChannelModel;
        com.ss.ugc.effectplatform.model.EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            List<EffectCategoryModel> category_list = kChannelModel2.getCategory_list();
            if (category_list != null) {
                super.setCategory_list(category_list);
            }
            List<Effect> collection_list = kChannelModel2.getCollection_list();
            if (collection_list != null) {
                super.setCollection_list(collection_list);
            }
            List<Effect> effect_list = kChannelModel2.getEffect_list();
            if (effect_list != null) {
                super.setEffect_list(effect_list);
            }
            String front_effect_id = kChannelModel2.getFront_effect_id();
            if (front_effect_id != null) {
                super.setFront_effect_id(front_effect_id);
            }
            EffectPanelModel panel_model = kChannelModel2.getPanel_model();
            if (panel_model != null) {
                super.setPanel_model(panel_model);
            }
            String rear_effect_id = kChannelModel2.getRear_effect_id();
            if (rear_effect_id != null) {
                super.setRear_effect_id(rear_effect_id);
            }
            List<String> url_prefix = kChannelModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kChannelModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelModel(com.ss.ugc.effectplatform.model.EffectChannelModel effectChannelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelModel);
    }
}
