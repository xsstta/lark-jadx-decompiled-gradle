package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchHotEffectResponseTemplate;", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "kFetchHotModel", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;)V", "getKFetchHotModel", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse;", "getCollection", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getEffects", "setEffects", "", "value", "DataTemplate", "ExtraTemplate", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.l */
public class FetchHotEffectResponseTemplate extends FetchHotEffectResponse {
    private final transient FetchHotEffectResponse kFetchHotModel;

    public FetchHotEffectResponseTemplate() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchHotEffectResponseTemplate$DataTemplate;", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "kData", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;)V", "getKData", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Data;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.l$a */
    public static class DataTemplate extends FetchHotEffectResponse.Data {
        private final transient FetchHotEffectResponse.Data kData;

        public DataTemplate() {
            this(null, 1, null);
        }

        public FetchHotEffectResponse.Data getKData() {
            return this.kData;
        }

        public DataTemplate(FetchHotEffectResponse.Data data) {
            super(null, null, null, 7, null);
            this.kData = data;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataTemplate(FetchHotEffectResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchHotEffectResponseTemplate$ExtraTemplate;", "Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;", "kData", "(Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;)V", "getKData", "()Lcom/ss/ugc/effectplatform/model/net/FetchHotEffectResponse$Extra;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.l$b */
    public static class ExtraTemplate extends FetchHotEffectResponse.Extra {
        private final transient FetchHotEffectResponse.Extra kData;

        public ExtraTemplate() {
            this(null, 1, null);
        }

        public FetchHotEffectResponse.Extra getKData() {
            return this.kData;
        }

        public ExtraTemplate(FetchHotEffectResponse.Extra extra) {
            super(null, 1, null);
            this.kData = extra;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ExtraTemplate(FetchHotEffectResponse.Extra extra, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : extra);
        }
    }

    public FetchHotEffectResponse getKFetchHotModel() {
        return this.kFetchHotModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.l, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollection() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.getCollection():java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.List<com.ss.ugc.effectplatform.model.Effect> */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.ss.android.ugc.effectmanager.effect.model.template.l, com.ss.ugc.effectplatform.model.net.FetchHotEffectResponse] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r1 != null) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchHotEffectResponseTemplate.getEffects():java.util.List");
    }

    public FetchHotEffectResponseTemplate(FetchHotEffectResponse fetchHotEffectResponse) {
        super(null, null, 0, 7, null);
        this.kFetchHotModel = fetchHotEffectResponse;
    }

    public void setEffects(List<? extends Effect> list) {
        Intrinsics.checkParameterIsNotNull(list, "value");
        FetchHotEffectResponse kFetchHotModel2 = getKFetchHotModel();
        if (kFetchHotModel2 != null) {
            kFetchHotModel2.setEffect_list(list);
        }
        super.setEffect_list(list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchHotEffectResponseTemplate(FetchHotEffectResponse fetchHotEffectResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchHotEffectResponse);
    }
}
