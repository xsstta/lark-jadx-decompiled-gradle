package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.ugc.effectplatform.model.CategoryPageModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016R*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/CategoryPageModelTemplate;", "Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "kCategoryPageModel", "(Lcom/ss/ugc/effectplatform/model/CategoryPageModel;)V", "value", "Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "categoryEffects", "getCategoryEffects", "()Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "setCategoryEffects", "(Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;)V", "getKCategoryPageModel", "()Lcom/ss/ugc/effectplatform/model/CategoryPageModel;", "getRecId", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.b */
public class CategoryPageModelTemplate extends CategoryPageModel {
    private CategoryEffectModel categoryEffects;
    private final transient CategoryPageModel kCategoryPageModel;

    public CategoryPageModelTemplate() {
        this(null, 1, null);
    }

    public CategoryPageModel getKCategoryPageModel() {
        return this.kCategoryPageModel;
    }

    public String getRecId() {
        CategoryPageModel.Extra extra = getExtra();
        if (extra != null) {
            return extra.getRec_id();
        }
        return null;
    }

    public CategoryEffectModel getCategoryEffects() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel;
        CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 == null || (categoryEffectModel = kCategoryPageModel2.getCategory_effects()) == null) {
            categoryEffectModel = super.getCategory_effects();
        }
        return new CategoryEffectModel(categoryEffectModel);
    }

    public CategoryPageModelTemplate(CategoryPageModel categoryPageModel) {
        super(null, null, null, 7, null);
        this.kCategoryPageModel = categoryPageModel;
    }

    public void setCategoryEffects(CategoryEffectModel categoryEffectModel) {
        this.categoryEffects = categoryEffectModel;
        CategoryPageModel kCategoryPageModel2 = getKCategoryPageModel();
        if (kCategoryPageModel2 != null) {
            kCategoryPageModel2.setCategory_effects(categoryEffectModel);
        }
        super.setCategory_effects(categoryEffectModel);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryPageModelTemplate(CategoryPageModel categoryPageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryPageModel);
    }
}
