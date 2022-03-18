package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0019H\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR2\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/PanelInfoModelTemplate;", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "kPanelModel", "(Lcom/ss/ugc/effectplatform/model/PanelInfoModel;)V", "value", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "categoryEffectModel", "getCategoryEffectModel", "()Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "setCategoryEffectModel", "(Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;)V", "", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "categoryList", "getCategoryList", "()Ljava/util/List;", "setCategoryList", "(Ljava/util/List;)V", "getKPanelModel", "()Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "getPanel", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "getRecID", "setPanel", "", "panel", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.m */
public class PanelInfoModelTemplate extends PanelInfoModel {
    private CategoryEffectModel categoryEffectModel;
    private List<EffectCategoryModel> categoryList;
    private final transient PanelInfoModel kPanelModel;
    private List<String> urlPrefix;

    public PanelInfoModelTemplate() {
        this(null, 1, null);
    }

    public PanelInfoModel getKPanelModel() {
        return this.kPanelModel;
    }

    public String getRecID() {
        PanelInfoModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public CategoryEffectModel getCategoryEffectModel() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel2;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (categoryEffectModel2 = kPanelModel2.getCategory_effects()) == null) {
            categoryEffectModel2 = super.getCategory_effects();
        }
        return new CategoryEffectModel(categoryEffectModel2);
    }

    public EffectPanelModel getPanel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (effectPanelModel = kPanelModel2.getEffect_panel()) == null) {
            effectPanelModel = super.getEffect_panel();
        }
        return new EffectPanelModel(effectPanelModel);
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 == null || (url_prefix = kPanelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.PanelInfoModel, com.ss.android.ugc.effectmanager.effect.model.template.m] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> getCategoryList() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate.getCategoryList():java.util.List");
    }

    public void setCategoryEffectModel(CategoryEffectModel categoryEffectModel2) {
        this.categoryEffectModel = categoryEffectModel2;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_effects(categoryEffectModel2);
        }
        super.setCategory_effects(categoryEffectModel2);
    }

    public void setCategoryList(List<EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.categoryList = list;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setCategory_list(list);
        }
        super.setCategory_list(list);
    }

    public void setPanel(EffectPanelModel effectPanelModel) {
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setEffect_panel(effectPanelModel);
        }
        super.setEffect_panel(effectPanelModel);
    }

    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlPrefix = list;
        PanelInfoModel kPanelModel2 = getKPanelModel();
        if (kPanelModel2 != null) {
            kPanelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public PanelInfoModelTemplate(PanelInfoModel panelInfoModel) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.kPanelModel = panelInfoModel;
        this.categoryList = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoModelTemplate(PanelInfoModel panelInfoModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : panelInfoModel);
    }
}
