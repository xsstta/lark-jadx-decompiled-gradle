package com.ss.android.ugc.effectmanager.effect.model;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010(\u001a\u00020'H\u0016J\u0016\u0010<\u001a\u00020=2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u000b\"\u0004\b\u001d\u0010\rR0\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078V@VX\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR$\u0010\"\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020!8V@VX\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020'8V@VX\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u00020'2\u0006\u0010\u0006\u001a\u00020'8V@VX\u000e¢\u0006\f\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R$\u00102\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020!8V@VX\u000e¢\u0006\f\u001a\u0004\b3\u0010$\"\u0004\b4\u0010&R$\u00105\u001a\u00020!2\u0006\u0010\u0006\u001a\u00020!8V@VX\u000e¢\u0006\f\u001a\u0004\b6\u0010$\"\u0004\b7\u0010&R$\u00108\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00128V@VX\u000e¢\u0006\f\u001a\u0004\b9\u0010\u0015\"\u0004\b:\u0010\u0017¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/CategoryEffectModel;", "Lcom/ss/android/ugc/effectmanager/effect/model/template/CategoryEffectModelTemplate;", "Ljava/io/Serializable;", "kCategoryEffect", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindEffects", "getBindEffects", "()Ljava/util/List;", "setBindEffects", "(Ljava/util/List;)V", "Lcom/ss/ugc/effectplatform/model/Effect;", "bind_effects", "getBind_effects", "setBind_effects", "", "categoryKey", "getCategoryKey", "()Ljava/lang/String;", "setCategoryKey", "(Ljava/lang/String;)V", "category_key", "getCategory_key", "setCategory_key", "collectEffects", "getCollectEffects", "setCollectEffects", "collection", "getCollection", "setCollection", "", "cursor", "getCursor", "()I", "setCursor", "(I)V", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "has_more", "getHas_more", "setHas_more", "getKCategoryEffect", "()Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "sortingPosition", "getSortingPosition", "setSortingPosition", "sorting_position", "getSorting_position", "setSorting_position", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "getVersion", "setVersion", "getEffects", "setEffects", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class CategoryEffectModel extends CategoryEffectModelTemplate implements Serializable {
    private final transient com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect;

    public CategoryEffectModel() {
        this(null, 1, null);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public com.ss.ugc.effectplatform.model.CategoryEffectModel getKCategoryEffect() {
        return this.kCategoryEffect;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getBindEffects() {
        return super.getBindEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public String getCategoryKey() {
        return super.getCategoryKey();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getCollectEffects() {
        return super.getCollectEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public List<Effect> getEffects() {
        return super.getEffects();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public boolean getHasMore() {
        return super.getHasMore();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public int getSortingPosition() {
        return super.getSortingPosition();
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public boolean hasMore() {
        return super.hasMore();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public int getCursor() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getCursor();
        }
        return super.getCursor();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public boolean getHas_more() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public int getSorting_position() {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getSorting_position();
        }
        return super.getSorting_position();
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public List<Effect> getBind_effects() {
        List<Effect> bind_effects;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (bind_effects = kCategoryEffect2.getBind_effects()) == null) {
            return super.getBind_effects();
        }
        return bind_effects;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public String getCategory_key() {
        String category_key;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (category_key = kCategoryEffect2.getCategory_key()) == null) {
            return super.getCategory_key();
        }
        return category_key;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public List<Effect> getCollection() {
        List<Effect> collection;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (collection = kCategoryEffect2.getCollection()) == null) {
            return super.getCollection();
        }
        return collection;
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public String getVersion() {
        String version;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (version = kCategoryEffect2.getVersion()) == null) {
            return super.getVersion();
        }
        return version;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setHasMore(boolean z) {
        super.setHasMore(z);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setSortingPosition(int i) {
        super.setSortingPosition(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setBindEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setBindEffects(list);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setCategoryKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        super.setCategoryKey(str);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setCollectEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setCollectEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCursor(int i) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCursor(i);
        }
        super.setCursor(i);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate
    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        super.setEffects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setHas_more(boolean z) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setSorting_position(int i) {
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setSorting_position(i);
        }
        super.setSorting_position(i);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setBind_effects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCategory_key(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCategory_key(str);
        }
        super.setCategory_key(str);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCollection(list);
        }
        super.setCollection(list);
    }

    @Override // com.ss.ugc.effectplatform.model.CategoryEffectModel
    public void setVersion(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setVersion(str);
        }
        super.setVersion(str);
    }

    public CategoryEffectModel(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel) {
        super(categoryEffectModel);
        this.kCategoryEffect = categoryEffectModel;
        com.ss.ugc.effectplatform.model.CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            List<Effect> bind_effects = kCategoryEffect2.getBind_effects();
            if (bind_effects != null) {
                super.setBind_effects(bind_effects);
            }
            List<Effect> category_effects = kCategoryEffect2.getCategory_effects();
            if (category_effects != null) {
                super.setCategory_effects(category_effects);
            }
            String category_key = kCategoryEffect2.getCategory_key();
            if (category_key != null) {
                super.setCategory_key(category_key);
            }
            List<Effect> collection = kCategoryEffect2.getCollection();
            if (collection != null) {
                super.setCollection(collection);
            }
            super.setCursor(kCategoryEffect2.getCursor());
            super.setHas_more(kCategoryEffect2.getHas_more());
            super.setSorting_position(kCategoryEffect2.getSorting_position());
            String version = kCategoryEffect2.getVersion();
            if (version != null) {
                super.setVersion(version);
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectModel(com.ss.ugc.effectplatform.model.CategoryEffectModel categoryEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryEffectModel);
    }
}
