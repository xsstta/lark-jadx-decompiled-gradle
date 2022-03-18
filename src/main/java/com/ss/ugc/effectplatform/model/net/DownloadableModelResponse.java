package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import com.ss.ugc.effectplatform.model.algorithm.ModelInfo;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\"B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/DownloadableModelResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "Lcom/ss/ugc/effectplatform/model/net/DownloadableModelResponse$Data;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/net/DownloadableModelResponse$Data;Ljava/lang/String;I)V", "getData", "()Lcom/ss/ugc/effectplatform/model/net/DownloadableModelResponse$Data;", "setData", "(Lcom/ss/ugc/effectplatform/model/net/DownloadableModelResponse$Data;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getResponseData", "getResponseMessage", "getStatusCode", "hashCode", "toString", "Data", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class DownloadableModelResponse extends NetResponseChecker<Data> {
    private Data data;
    private String message;
    private int status_code;

    public DownloadableModelResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ DownloadableModelResponse copy$default(DownloadableModelResponse downloadableModelResponse, Data data2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            data2 = downloadableModelResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = downloadableModelResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = downloadableModelResponse.status_code;
        }
        return downloadableModelResponse.copy(data2, str, i);
    }

    public final Data component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final DownloadableModelResponse copy(Data data2, String str, int i) {
        return new DownloadableModelResponse(data2, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadableModelResponse)) {
            return false;
        }
        DownloadableModelResponse downloadableModelResponse = (DownloadableModelResponse) obj;
        return Intrinsics.areEqual(this.data, downloadableModelResponse.data) && Intrinsics.areEqual(this.message, downloadableModelResponse.message) && this.status_code == downloadableModelResponse.status_code;
    }

    public int hashCode() {
        Data data2 = this.data;
        int i = 0;
        int hashCode = (data2 != null ? data2.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public String toString() {
        return "DownloadableModelResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u001d\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0003J'\u0010\f\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R.\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/DownloadableModelResponse$Data;", "", "arithmetics", "", "", "", "Lcom/ss/ugc/effectplatform/model/algorithm/ModelInfo;", "(Ljava/util/Map;)V", "getArithmetics", "()Ljava/util/Map;", "setArithmetics", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class Data {
        private Map<String, ? extends List<? extends ModelInfo>> arithmetics;

        public Data() {
            this(null, 1, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.ugc.effectplatform.model.net.DownloadableModelResponse$Data */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = data.arithmetics;
            }
            return data.copy(map);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo>>, java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.algorithm.ModelInfo>> */
        public final Map<String, List<ModelInfo>> component1() {
            return this.arithmetics;
        }

        public final Data copy(Map<String, ? extends List<? extends ModelInfo>> map) {
            return new Data(map);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Data) && Intrinsics.areEqual(this.arithmetics, ((Data) obj).arithmetics);
            }
            return true;
        }

        public int hashCode() {
            Map<String, ? extends List<? extends ModelInfo>> map = this.arithmetics;
            if (map != null) {
                return map.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Data(arithmetics=" + this.arithmetics + ")";
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Map<java.lang.String, ? extends java.util.List<? extends com.ss.ugc.effectplatform.model.algorithm.ModelInfo>>, java.util.Map<java.lang.String, java.util.List<com.ss.ugc.effectplatform.model.algorithm.ModelInfo>> */
        public final Map<String, List<ModelInfo>> getArithmetics() {
            return this.arithmetics;
        }

        public final void setArithmetics(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        public Data(Map<String, ? extends List<? extends ModelInfo>> map) {
            this.arithmetics = map;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Data(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map);
        }
    }

    public final Data getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public Data getResponseData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public String getResponseMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public int getStatusCode() {
        return this.status_code;
    }

    public final int getStatus_code() {
        return this.status_code;
    }

    public final void setData(Data data2) {
        this.data = data2;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public DownloadableModelResponse(Data data2, String str, int i) {
        this.data = data2;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadableModelResponse(Data data2, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : data2, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
