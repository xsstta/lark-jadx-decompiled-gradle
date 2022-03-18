package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.ugc.effectplatform.model.ProviderEffectModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0004\u001a\u0004\u0018\u00010\r8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R2\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/ProviderEffectModelTemplate;", "Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "kProviderEffect", "(Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;)V", "value", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "getKProviderEffect", "()Lcom/ss/ugc/effectplatform/model/ProviderEffectModel;", "", "searchTips", "getSearchTips", "()Ljava/lang/String;", "setSearchTips", "(Ljava/lang/String;)V", "", "Lcom/ss/android/ugc/effectmanager/effect/model/ProviderEffect;", "stickerList", "getStickerList", "()Ljava/util/List;", "setStickerList", "(Ljava/util/List;)V", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.n */
public class ProviderEffectModelTemplate extends ProviderEffectModel {
    private boolean hasMore;
    private final transient ProviderEffectModel kProviderEffect;
    private String searchTips;
    private List<ProviderEffect> stickerList;

    public ProviderEffectModelTemplate() {
        this(null, 1, null);
    }

    public ProviderEffectModel getKProviderEffect() {
        return this.kProviderEffect;
    }

    public boolean hasMore() {
        return getHasMore();
    }

    public boolean getHasMore() {
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            return kProviderEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    public String getSearchTips() {
        String search_tips;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 == null || (search_tips = kProviderEffect2.getSearch_tips()) == null) {
            return super.getSearch_tips();
        }
        return search_tips;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.ProviderEffect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.ugc.effectplatform.model.ProviderEffectModel, com.ss.android.ugc.effectmanager.effect.model.template.n] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> getStickerList() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate.getStickerList():java.util.List");
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public void setSearchTips(String str) {
        this.searchTips = str;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSearch_tips(str);
        }
        super.setSearch_tips(str);
    }

    public ProviderEffectModelTemplate(ProviderEffectModel providerEffectModel) {
        super(null, 0, false, null, null, null, 63, null);
        this.kProviderEffect = providerEffectModel;
        this.stickerList = new ArrayList();
    }

    public void setStickerList(List<ProviderEffect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.stickerList = list;
        ProviderEffectModel kProviderEffect2 = getKProviderEffect();
        if (kProviderEffect2 != null) {
            kProviderEffect2.setSticker_list(list);
        }
        super.setSticker_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProviderEffectModelTemplate(ProviderEffectModel providerEffectModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : providerEffectModel);
    }
}
