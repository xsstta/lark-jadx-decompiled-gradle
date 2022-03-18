package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.EffectListResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0016\u0010\u0016\u001a\u00020\u00152\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR2\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058V@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/EffectListResponseTemplate;", "Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "kEffectList", "(Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;)V", "value", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "bindEffects", "getBindEffects", "()Ljava/util/List;", "setBindEffects", "(Ljava/util/List;)V", "getKEffectList", "()Lcom/ss/ugc/effectplatform/model/net/EffectListResponse;", "", "urlPrefix", "getUrlPrefix", "setUrlPrefix", "getCollection", "getData", "setCollection", "", "setData", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.h */
public class EffectListResponseTemplate extends EffectListResponse {
    private List<? extends Effect> bindEffects;
    private final transient EffectListResponse kEffectList;
    private List<String> urlPrefix;

    public EffectListResponseTemplate() {
        this(null, 1, null);
    }

    public EffectListResponse getKEffectList() {
        return this.kEffectList;
    }

    public List<String> getUrlPrefix() {
        List<String> url_prefix;
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 == null || (url_prefix = kEffectList2.getUrl_prefix()) == null) {
            return super.getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.h, com.ss.ugc.effectplatform.model.net.EffectListResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.h, com.ss.ugc.effectplatform.model.net.EffectListResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.h, com.ss.ugc.effectplatform.model.net.EffectListResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getData() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.EffectListResponseTemplate.getData():java.util.List");
    }

    public void setBindEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.bindEffects = list;
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setBind_effects(list);
        }
        super.setBind_effects(list);
    }

    public void setCollection(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setCollection_list(list);
        }
        super.setCollection_list(list);
    }

    public void setData(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    public void setUrlPrefix(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        this.urlPrefix = list;
        EffectListResponse kEffectList2 = getKEffectList();
        if (kEffectList2 != null) {
            kEffectList2.setUrl_prefix(list);
        }
        super.setUrl_prefix(list);
    }

    public EffectListResponseTemplate(EffectListResponse effectListResponse) {
        super(null, null, null, 0, null, null, 63, null);
        this.kEffectList = effectListResponse;
        this.bindEffects = new ArrayList();
        this.urlPrefix = new ArrayList();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectListResponseTemplate(EffectListResponse effectListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : effectListResponse);
    }
}
