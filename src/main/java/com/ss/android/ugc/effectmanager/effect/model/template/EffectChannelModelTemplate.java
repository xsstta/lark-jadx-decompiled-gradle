package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectPanelModel;
import com.ss.ugc.effectplatform.model.EffectChannelModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0007H\u0016J\u0016\u0010\u0017\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0016J\u0016\u0010\u0018\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00110\u0007H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0014H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R2\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectChannelModelTemplate;", "Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "kChannelModel", "(Lcom/ss/ugc/effectplatform/model/EffectChannelModel;)V", "getKChannelModel", "()Lcom/ss/ugc/effectplatform/model/EffectChannelModel;", "value", "", "", "urlPrefix", "getUrlPrefix", "()Ljava/util/List;", "setUrlPrefix", "(Ljava/util/List;)V", "getCategory", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectCategoryModel;", "getCollection", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getEffects", "getPanel", "Lcom/ss/android/ugc/effectmanager/effect/model/EffectPanelModel;", "setCategory", "", "setCollection", "setEffects", "setPanel", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.f */
public class EffectChannelModelTemplate extends EffectChannelModel {
    private final transient EffectChannelModel kChannelModel;
    private List<String> urlPrefix;

    public EffectChannelModelTemplate() {
        this(null, 1, null);
    }

    public EffectChannelModel getKChannelModel() {
        return this.kChannelModel;
    }

    public EffectPanelModel getPanel() {
        com.ss.ugc.effectplatform.model.EffectPanelModel effectPanelModel;
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (effectPanelModel = kChannelModel2.getPanel_model()) == null) {
            effectPanelModel = super.getPanel_model();
        }
        return new EffectPanelModel(effectPanelModel);
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 == null || (url_prefix = kChannelModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.EffectCategoryModel> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.f, com.ss.ugc.effectplatform.model.EffectChannelModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel> getCategory() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getCategory():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.f, com.ss.ugc.effectplatform.model.EffectChannelModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.f, com.ss.ugc.effectplatform.model.EffectChannelModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelModelTemplate.getEffects():java.util.List");
    }

    public EffectChannelModelTemplate(EffectChannelModel effectChannelModel) {
        super(null, null, null, null, null, null, null, null, 255, null);
        this.kChannelModel = effectChannelModel;
        this.urlPrefix = new ArrayList();
    }

    public void setCategory(List<EffectCategoryModel> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setCategory_list(list);
        }
        super.setCategory_list(list);
    }

    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    public void setPanel(EffectPanelModel effectPanelModel) {
        Intrinsics.checkParameterIsNotNull(effectPanelModel, "value");
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setPanel_model(effectPanelModel);
        }
        super.setPanel_model(effectPanelModel);
    }

    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlPrefix = list;
        EffectChannelModel kChannelModel2 = getKChannelModel();
        if (kChannelModel2 != null) {
            kChannelModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectChannelModelTemplate(EffectChannelModel effectChannelModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectChannelModel);
    }
}
