package com.ss.android.ugc.effectmanager.effect.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import com.ss.ugc.effectplatform.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\n\u00102\u001a\u0004\u0018\u000103H\u0016J\n\u00104\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000103H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R(\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u00148V@VX\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001a0\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#R0\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001e0\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8V@VX\u000e¢\u0006\f\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R0\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001e0\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u001e0\r8V@VX\u000e¢\u0006\f\u001a\u0004\b-\u0010\u0011\"\u0004\b.\u0010\u0013R$\u0010/\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u001e8V@VX\u000e¢\u0006\f\u001a\u0004\b0\u0010!\"\u0004\b1\u0010#¨\u00068"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/PanelInfoModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/PanelInfoModelTemplate;", "Ljava/io/Serializable;", "kPanelModel", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "(Lcom/ss/ugc/effectplatform/model/PanelInfoModel;)V", "value", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "categoryEffectModel", "getCategoryEffectModel", "()Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "setCategoryEffectModel", "(Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;)V", "", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "categoryList", "getCategoryList", "()Ljava/util/List;", "setCategoryList", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "category_effects", "getCategory_effects", "()Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "setCategory_effects", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;)V", "Lcom/ss/ugc/effectplatform/model/EffectCategoryModel;", "category_list", "getCategory_list", "setCategory_list", "", "front_effect_id", "getFront_effect_id", "()Ljava/lang/String;", "setFront_effect_id", "(Ljava/lang/String;)V", "getKPanelModel", "()Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "rear_effect_id", "getRear_effect_id", "setRear_effect_id", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "url_prefix", "getUrl_prefix", "setUrl_prefix", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "getPanel", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "getRecID", "setPanel", "", "panel", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class PanelInfoModel extends PanelInfoModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel;

    public PanelInfoModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public com.ss.ugc.effectplatform.model.PanelInfoModel getKPanelModel() {
        return this.kPanelModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public CategoryEffectModel getCategoryEffectModel() {
        return super.getCategoryEffectModel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public List<EffectCategoryModel> getCategoryList() {
        return super.getCategoryList();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public EffectPanelModel getPanel() {
        return super.getPanel();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public String getRecID() {
        return super.getRecID();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public List<String> getUrlPrefix() {
        return super.getUrlPrefix();
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public CategoryEffectModel getCategory_effects() {
        CategoryEffectModel category_effects;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (category_effects = kPanelModel2.getCategory_effects()) == null) {
            return super.getCategory_effects();
        }
        return category_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public List<EffectCategoryModel> getCategory_list() {
        List<EffectCategoryModel> category_list;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (category_list = kPanelModel2.getCategory_list()) == null) {
            return super.getCategory_list();
        }
        return category_list;
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public String getFront_effect_id() {
        String front_effect_id;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (front_effect_id = kPanelModel2.getFront_effect_id()) == null) {
            return super.getFront_effect_id();
        }
        return front_effect_id;
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public String getRear_effect_id() {
        String rear_effect_id;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (rear_effect_id = kPanelModel2.getRear_effect_id()) == null) {
            return super.getRear_effect_id();
        }
        return rear_effect_id;
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (url_prefix = kPanelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (version = kPanelModel2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setCategoryEffectModel(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffectModel(categoryEffectModel);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setPanel(EffectPanelModel effectPanelModel) {
        super.setPanel(effectPanelModel);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setCategoryList(List<EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCategoryList(list);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setFront_effect_id(String str) {
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setFront_effect_id(str);
        }
        super.setFront_effect_id(str);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setRear_effect_id(String str) {
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setRear_effect_id(str);
        }
        super.setRear_effect_id(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate
    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setUrlPrefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setCategory_list(List<? extends EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_list(list);
        }
        super.setCategory_list(list);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    @Override // com.ss.ugc.effectplatform.model.PanelInfoModel
    public void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setVersion(str);
        }
        super.setVersion(str);
    }

    public PanelInfoModel(com.ss.ugc.effectplatform.model.PanelInfoModel panelInfoModel) {
        super(panelInfoModel);
        this.kPanelModel = panelInfoModel;
        com.ss.ugc.effectplatform.model.PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            CategoryEffectModel category_effects = kPanelModel2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            List<EffectCategoryModel> category_list = kPanelModel2.getCategory_list();
            if (category_list != null) {
                super.setCategory_list(category_list);
            }
            EffectPanelModel effect_panel = kPanelModel2.getEffect_panel();
            if (effect_panel != null) {
                super.setEffect_panel(effect_panel);
            }
            PanelInfoModel.Extra extra = kPanelModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            String front_effect_id = kPanelModel2.getFront_effect_id();
            if (front_effect_id != null) {
                super.setFront_effect_id(front_effect_id);
            }
            String rear_effect_id = kPanelModel2.getRear_effect_id();
            if (rear_effect_id != null) {
                super.setRear_effect_id(rear_effect_id);
            }
            List<String> url_prefix = kPanelModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
            String version = kPanelModel2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoModel(com.ss.ugc.effectplatform.model.PanelInfoModel panelInfoModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : panelInfoModel);
    }
}
