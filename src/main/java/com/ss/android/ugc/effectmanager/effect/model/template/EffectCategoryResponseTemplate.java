package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.EffectCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00068V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00118V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00068V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\u001a\u0010\u0010R*\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u001b8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R2\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010\u000b¨\u0006$"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectCategoryResponseTemplate;", "Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "kCategoryResponse", "(Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "collectionEffect", "getCollectionEffect", "()Ljava/util/List;", "setCollectionEffect", "(Ljava/util/List;)V", "frontEffect", "getFrontEffect", "()Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "setFrontEffect", "(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;)V", "", "isDefault", "()Z", "setDefault", "(Z)V", "getKCategoryResponse", "()Lcom/ss/ugc/effectplatform/model/EffectCategoryResponse;", "rearEffect", "getRearEffect", "setRearEffect", "", "tagsUpdateTime", "getTagsUpdateTime", "()Ljava/lang/String;", "setTagsUpdateTime", "(Ljava/lang/String;)V", "totalEffects", "getTotalEffects", "setTotalEffects", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
public class EffectCategoryResponseTemplate extends EffectCategoryResponse {
    private List<? extends Effect> collectionEffect;
    private Effect frontEffect;
    private boolean isDefault;
    private final transient EffectCategoryResponse kCategoryResponse;
    private Effect rearEffect;
    private String tagsUpdateTime;
    private List<? extends Effect> totalEffects;

    public EffectCategoryResponseTemplate() {
        this(null, 1, null);
    }

    public EffectCategoryResponse getKCategoryResponse() {
        return this.kCategoryResponse;
    }

    public boolean isDefault() {
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            return kCategoryResponse2.is_default();
        }
        return super.is_default();
    }

    public Effect getFrontEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (effect = kCategoryResponse2.getFront_effect()) == null) {
            effect = super.getFront_effect();
        }
        return new Effect(effect);
    }

    public Effect getRearEffect() {
        com.ss.ugc.effectplatform.model.Effect effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (effect = kCategoryResponse2.getRear_effect()) == null) {
            effect = super.getRear_effect();
        }
        return new Effect(effect);
    }

    public String getTagsUpdateTime() {
        String tags_update_time;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 == null || (tags_update_time = kCategoryResponse2.getTags_update_time()) == null) {
            return super.getTags_update_time();
        }
        return tags_update_time;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate, com.ss.ugc.effectplatform.model.EffectCategoryResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectionEffect() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate.getCollectionEffect():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate, com.ss.ugc.effectplatform.model.EffectCategoryResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getTotalEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate.getTotalEffects():java.util.List");
    }

    public void setDefault(boolean z) {
        this.isDefault = z;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.set_default(z);
        }
        super.set_default(z);
    }

    public void setTagsUpdateTime(String str) {
        this.tagsUpdateTime = str;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTags_update_time(str);
        }
        super.setTags_update_time(str);
    }

    public void setCollectionEffect(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.collectionEffect = list;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setCollection_effect(list);
        }
        super.setCollection_effect(list);
    }

    public void setFrontEffect(Effect effect) {
        this.frontEffect = effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setFront_effect(effect);
        }
        super.setFront_effect(effect);
    }

    public void setRearEffect(Effect effect) {
        this.rearEffect = effect;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setRear_effect(effect);
        }
        super.setRear_effect(effect);
    }

    public void setTotalEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.totalEffects = list;
        EffectCategoryResponse kCategoryResponse2 = getKCategoryResponse();
        if (kCategoryResponse2 != null) {
            kCategoryResponse2.setTotal_effects(list);
        }
        super.setTotal_effects(list);
    }

    public EffectCategoryResponseTemplate(EffectCategoryResponse effectCategoryResponse) {
        super(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
        this.kCategoryResponse = effectCategoryResponse;
        this.totalEffects = new ArrayList();
        this.collectionEffect = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCategoryResponseTemplate(EffectCategoryResponse effectCategoryResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectCategoryResponse);
    }
}
