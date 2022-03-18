package com.ss.android.ugc.effectmanager.effect.model;

import com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0016H\u0016R(\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158V@VX\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/CategoryPageModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/CategoryPageModelTemplate;", "Ljava/io/Serializable;", "kCategoryPageModel", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "(Lcom/ss/ugc/effectplatform/model/CategoryPageModel;)V", "value", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "categoryEffects", "getCategoryEffects", "()Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "setCategoryEffects", "(Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;)V", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "category_effects", "getCategory_effects", "()Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "setCategory_effects", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;)V", "getKCategoryPageModel", "()Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "", "", "url_prefix", "getUrl_prefix", "()Ljava/util/List;", "setUrl_prefix", "(Ljava/util/List;)V", "getRecId", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CategoryPageModel extends CategoryPageModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel;

    public CategoryPageModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public com.ss.ugc.effectplatform.model.CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public CategoryEffectModel getCategoryEffects() {
        return super.getCategoryEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public String getRecId() {
        return super.getRecId();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public CategoryEffectModel getCategory_effects() {
        CategoryEffectModel category_effects;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (category_effects = kCategoryPageModel2.getCategory_effects()) == null) {
            return super.getCategory_effects();
        }
        return category_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public List<String> getUrl_prefix() {
        List<String> url_prefix;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (url_prefix = kCategoryPageModel2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryPageModelTemplate
    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        super.setCategoryEffects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public void setCategory_effects(CategoryEffectModel categoryEffectModel) {
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryPageModel
    public void setUrl_prefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public CategoryPageModel(com.ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel) {
        super(categoryPageModel);
        this.kCategoryPageModel = categoryPageModel;
        com.ss.ugc.effectplatform.model.CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            CategoryEffectModel category_effects = kCategoryPageModel2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            CategoryPageModel.Extra extra = kCategoryPageModel2.getExtra();
            if (extra != null) {
                super.setExtra(extra);
            }
            List<String> url_prefix = kCategoryPageModel2.getUrl_prefix();
            if (url_prefix != null) {
                super.setUrl_prefix(url_prefix);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModel(com.ss.ugc.effectplatform.model.CategoryPageModel categoryPageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryPageModel);
    }
}
