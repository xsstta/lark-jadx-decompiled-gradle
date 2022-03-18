package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.CategoryEffectModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0016\u0010$\u001a\u00020%2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R2\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR&\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00158V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR&\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0004\u001a\u00020\u001d8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/CategoryEffectModelTemplate;", "Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "kCategoryEffect", "(Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindEffects", "getBindEffects", "()Ljava/util/List;", "setBindEffects", "(Ljava/util/List;)V", "", "categoryKey", "getCategoryKey", "()Ljava/lang/String;", "setCategoryKey", "(Ljava/lang/String;)V", "collectEffects", "getCollectEffects", "setCollectEffects", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "getKCategoryEffect", "()Lcom/ss/ugc/effectplatform/model/CategoryEffectModel;", "", "sortingPosition", "getSortingPosition", "()I", "setSortingPosition", "(I)V", "getEffects", "setEffects", "", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.a */
public class CategoryEffectModelTemplate extends CategoryEffectModel {
    private List<? extends Effect> bindEffects;
    private String categoryKey;
    private List<? extends Effect> collectEffects;
    private boolean hasMore;
    private final transient CategoryEffectModel kCategoryEffect;
    private int sortingPosition;

    public CategoryEffectModelTemplate() {
        this(null, 1, null);
    }

    public CategoryEffectModel getKCategoryEffect() {
        return this.kCategoryEffect;
    }

    public boolean hasMore() {
        return getHasMore();
    }

    public boolean getHasMore() {
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    public int getSortingPosition() {
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            return kCategoryEffect2.getSorting_position();
        }
        return super.getSorting_position();
    }

    public String getCategoryKey() {
        String category_key;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (category_key = kCategoryEffect2.getCategory_key()) == null) {
            return super.getCategory_key();
        }
        return category_key;
    }

    public List<Effect> getBindEffects() {
        List<com.ss.ugc.effectplatform.model.Effect> bind_effects;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 == null || (bind_effects = kCategoryEffect2.getBind_effects()) == null) {
            List<com.ss.ugc.effectplatform.model.Effect> bind_effects2 = super.getBind_effects();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bind_effects2, 10));
            Iterator<T> it = bind_effects2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Effect(it.next()));
            }
            return arrayList;
        }
        List<com.ss.ugc.effectplatform.model.Effect> list = bind_effects;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Effect(it2.next()));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.a, com.ss.ugc.effectplatform.model.CategoryEffectModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.getCollectEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.a, com.ss.ugc.effectplatform.model.CategoryEffectModel] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate.getEffects():java.util.List");
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public void setSortingPosition(int i) {
        this.sortingPosition = i;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setSorting_position(i);
        }
        super.setSorting_position(i);
    }

    public void setBindEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.bindEffects = list;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCategoryKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.categoryKey = str;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCategory_key(str);
        }
        super.setCategory_key(str);
    }

    public void setCollectEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.collectEffects = list;
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCollection(list);
        }
        super.setCollection(list);
    }

    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        CategoryEffectModel kCategoryEffect2 = getKCategoryEffect();
        if (kCategoryEffect2 != null) {
            kCategoryEffect2.setCategory_effects(list);
        }
        super.setCategory_effects(list);
    }

    public CategoryEffectModelTemplate(CategoryEffectModel categoryEffectModel) {
        super(null, null, false, 0, 0, null, null, null, 255, null);
        this.kCategoryEffect = categoryEffectModel;
        this.collectEffects = new ArrayList();
        this.bindEffects = new ArrayList();
        this.categoryKey = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryEffectModelTemplate(CategoryEffectModel categoryEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : categoryEffectModel);
    }
}
