package com.ss.android.ugc.effectmanager.effect.model.template;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0011B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007H\u0016J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchFavoriteListResponseTemplate;", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "kFavoriteModel", "(Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;)V", "getKFavoriteModel", "()Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "getBindEffects", "", "Lcom/ss/android/ugc/effectmanager/effect/model/Effect;", "getCollectEffects", "getEffects", "getType", "", "getUrlPrefix", "setEffects", "", "value", "DataTemplate", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.k */
public class FetchFavoriteListResponseTemplate extends FetchFavoriteListResponse {
    private final transient FetchFavoriteListResponse kFavoriteModel;

    public FetchFavoriteListResponseTemplate() {
        this(null, 1, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0003R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/effectmanager/effect/model/template/FetchFavoriteListResponseTemplate$DataTemplate;", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", "kData", "(Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;)V", "getKData", "()Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", "effectmanager_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.k$a */
    public static class DataTemplate extends FetchFavoriteListResponse.Data {
        private final transient FetchFavoriteListResponse.Data kData;

        public DataTemplate() {
            this(null, 1, null);
        }

        public FetchFavoriteListResponse.Data getKData() {
            return this.kData;
        }

        public DataTemplate(FetchFavoriteListResponse.Data data) {
            super(null, null, null, null, null, 31, null);
            this.kData = data;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataTemplate(FetchFavoriteListResponse.Data data, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : data);
        }
    }

    public FetchFavoriteListResponse getKFavoriteModel() {
        return this.kFavoriteModel;
    }

    public String getType() {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        String type;
        FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null || (data2 = data.get(0)) == null || (type = data2.getType()) == null) {
            return super.getData().get(0).getType();
        }
        return type;
    }

    public List<String> getUrlPrefix() {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        List<String> url_prefix;
        FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null || (data2 = data.get(0)) == null || (url_prefix = data2.getUrl_prefix()) == null) {
            return super.getData().get(0).getUrl_prefix();
        }
        return url_prefix;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getBindEffects() {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getBindEffects():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getCollectEffects() {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getCollectEffects():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r2 != null) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> getEffects() {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.effect.model.template.FetchFavoriteListResponseTemplate.getEffects():java.util.List");
    }

    public FetchFavoriteListResponseTemplate(FetchFavoriteListResponse fetchFavoriteListResponse) {
        super(null, null, 0, 7, null);
        this.kFavoriteModel = fetchFavoriteListResponse;
    }

    public void setEffects(List<? extends Effect> list) {
        List<FetchFavoriteListResponse.Data> data;
        FetchFavoriteListResponse.Data data2;
        Intrinsics.checkParameterIsNotNull(list, "value");
        FetchFavoriteListResponse kFavoriteModel2 = getKFavoriteModel();
        if (!(kFavoriteModel2 == null || (data = kFavoriteModel2.getData()) == null || (data2 = data.get(0)) == null)) {
            data2.setEffects(list);
        }
        if (!super.getData().isEmpty()) {
            super.getData().get(0).setEffects(list);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchFavoriteListResponseTemplate(FetchFavoriteListResponse fetchFavoriteListResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fetchFavoriteListResponse);
    }
}
