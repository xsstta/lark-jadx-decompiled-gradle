package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.ugc.effectplatform.model.Effect;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001#B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\n\u0010 \u001a\u0004\u0018\u00010\u0000H\u0016J\n\u0010!\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\"\u001a\u00020\bH\u0016R0\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00038F@FX\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006$"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", "message", "", "status_code", "", "(Ljava/util/List;Ljava/lang/String;I)V", "value", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection_effects", "getCollection_effects", "()Ljava/util/List;", "setCollection_effects", "(Ljava/util/List;)V", "getData", "setData", "effect_list", "getEffect_list", "setEffect_list", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "checkValue", "", "getResponseData", "getResponseMessage", "getStatusCode", "Data", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public class FetchFavoriteListResponse extends NetResponseChecker<FetchFavoriteListResponse> {
    private List<? extends Data> data;
    private String message;
    private int status_code;

    public FetchFavoriteListResponse() {
        this(null, null, 0, 7, null);
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public FetchFavoriteListResponse getResponseData() {
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\nR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/FetchFavoriteListResponse$Data;", "", ShareHitPoint.f121869d, "", "effects", "", "Lcom/ss/ugc/effectplatform/model/Effect;", "collection", "bind_effects", "url_prefix", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getBind_effects", "()Ljava/util/List;", "setBind_effects", "(Ljava/util/List;)V", "getCollection", "setCollection", "getEffects", "setEffects", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getUrl_prefix", "setUrl_prefix", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static class Data {
        private List<? extends Effect> bind_effects;
        private List<? extends Effect> collection;
        private List<? extends Effect> effects;
        private String type;
        private List<String> url_prefix;

        public Data() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
        public List<Effect> getBind_effects() {
            return this.bind_effects;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
        public List<Effect> getCollection() {
            return this.collection;
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.Effect>, java.util.List<com.ss.ugc.effectplatform.model.Effect> */
        public List<Effect> getEffects() {
            return this.effects;
        }

        public String getType() {
            return this.type;
        }

        public List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public void setBind_effects(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.bind_effects = list;
        }

        public void setCollection(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.collection = list;
        }

        public void setEffects(List<? extends Effect> list) {
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.effects = list;
        }

        public void setType(String str) {
            Intrinsics.checkParameterIsNotNull(str, "<set-?>");
            this.type = str;
        }

        public void setUrl_prefix(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "<set-?>");
            this.url_prefix = list;
        }

        public Data(String str, List<? extends Effect> list, List<? extends Effect> list2, List<? extends Effect> list3, List<String> list4) {
            Intrinsics.checkParameterIsNotNull(str, ShareHitPoint.f121869d);
            Intrinsics.checkParameterIsNotNull(list, "effects");
            Intrinsics.checkParameterIsNotNull(list2, "collection");
            Intrinsics.checkParameterIsNotNull(list3, "bind_effects");
            Intrinsics.checkParameterIsNotNull(list4, "url_prefix");
            this.type = str;
            this.effects = list;
            this.collection = list2;
            this.bind_effects = list3;
            this.url_prefix = list4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(String str, List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? new ArrayList() : list2, (i & 8) != 0 ? new ArrayList() : list3, (i & 16) != 0 ? new ArrayList() : list4);
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data>, java.util.List<com.ss.ugc.effectplatform.model.net.FetchFavoriteListResponse$Data> */
    public List<Data> getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public int getStatus_code() {
        return this.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public String getResponseMessage() {
        return getMessage();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public int getStatusCode() {
        return getStatus_code();
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public boolean checkValue() {
        List<Data> data2 = getData();
        if (data2 != null) {
            return !data2.isEmpty();
        }
        return false;
    }

    public final List<Effect> getCollection_effects() {
        List<Data> data2 = getData();
        if (data2 != null) {
            return data2.get(0).getCollection();
        }
        return new ArrayList();
    }

    public final List<Effect> getEffect_list() {
        List<Data> data2 = getData();
        if (data2 != null) {
            return data2.get(0).getEffects();
        }
        return new ArrayList();
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setStatus_code(int i) {
        this.status_code = i;
    }

    public void setData(List<? extends Data> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.data = list;
    }

    public final void setCollection_effects(List<? extends Effect> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "value");
        List<Data> data2 = getData();
        if (data2 == null || data2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setData(CollectionsKt.arrayListOf(new Data(null, null, null, null, null, 31, null)));
        }
        getData().get(0).setCollection(list);
    }

    public final void setEffect_list(List<? extends Effect> list) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "value");
        List<Data> data2 = getData();
        if (data2 == null || data2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            setData(CollectionsKt.arrayListOf(new Data(null, null, null, null, null, 31, null)));
        }
        getData().get(0).setEffects(list);
    }

    public FetchFavoriteListResponse(List<? extends Data> list, String str, int i) {
        Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.data = list;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FetchFavoriteListResponse(List list, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? new ArrayList() : list, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
