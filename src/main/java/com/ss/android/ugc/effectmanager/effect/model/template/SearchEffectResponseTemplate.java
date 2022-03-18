package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ugc.effectplatform.model.net.SearchEffectResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0018\u001a\u00020\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\f8V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/SearchEffectResponseTemplate;", "Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "kSearchEffect", "(Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindEffects", "getBindEffects", "()Ljava/util/List;", "setBindEffects", "(Ljava/util/List;)V", "", "hasMore", "getHasMore", "()Z", "setHasMore", "(Z)V", "getKSearchEffect", "()Lcom/ss/ugc/effectplatform/model/net/SearchEffectResponse;", "getCollection", "getEffects", "setCollection", "", "setEffects", "effects", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.p */
public class SearchEffectResponseTemplate extends SearchEffectResponse {
    private List<? extends Effect> bindEffects;
    private boolean hasMore;
    private final transient SearchEffectResponse kSearchEffect;

    public SearchEffectResponseTemplate() {
        this(null, 1, null);
    }

    public SearchEffectResponse getKSearchEffect() {
        return this.kSearchEffect;
    }

    public boolean getHasMore() {
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            return kSearchEffect2.getHas_more();
        }
        return super.getHas_more();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.p, com.ss.ugc.effectplatform.model.net.SearchEffectResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.SearchEffectResponseTemplate.getBindEffects():java.util.List");
    }

    public List<Effect> getCollection() {
        List<com.ss.ugc.effectplatform.model.Effect> collection_list;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (collection_list = kSearchEffect2.getCollection_list()) == null) {
            List<com.ss.ugc.effectplatform.model.Effect> collection_list2 = super.getCollection_list();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection_list2, 10));
            Iterator<T> it = collection_list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Effect(it.next()));
            }
            return arrayList;
        }
        List<com.ss.ugc.effectplatform.model.Effect> list = collection_list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Effect(it2.next()));
        }
        return arrayList2;
    }

    public List<Effect> getEffects() {
        List<com.ss.ugc.effectplatform.model.Effect> effect_list;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 == null || (effect_list = kSearchEffect2.getEffect_list()) == null) {
            List<com.ss.ugc.effectplatform.model.Effect> effect_list2 = super.getEffect_list();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(effect_list2, 10));
            Iterator<T> it = effect_list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new Effect(it.next()));
            }
            return arrayList;
        }
        List<com.ss.ugc.effectplatform.model.Effect> list = effect_list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Effect(it2.next()));
        }
        return arrayList2;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setHas_more(z);
        }
        super.setHas_more(z);
    }

    public SearchEffectResponseTemplate(SearchEffectResponse searchEffectResponse) {
        super(false, 0, null, null, null, 0, null, SmActions.ACTION_ONTHECALL_ENTRY, null);
        this.kSearchEffect = searchEffectResponse;
        this.bindEffects = new ArrayList();
    }

    public void setBindEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.bindEffects = list;
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "effects");
        SearchEffectResponse kSearchEffect2 = getKSearchEffect();
        if (kSearchEffect2 != null) {
            kSearchEffect2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchEffectResponseTemplate(SearchEffectResponse searchEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchEffectResponse);
    }
}
