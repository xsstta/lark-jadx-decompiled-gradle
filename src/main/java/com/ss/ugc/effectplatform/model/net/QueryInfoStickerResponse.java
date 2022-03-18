package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\n\u0010\u001d\u001a\u0004\u0018\u00010\u0000H\u0016J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerListModel;", "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerListModel;Ljava/lang/String;I)V", "getData", "()Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerListModel;", "setData", "(Lcom/ss/ugc/effectplatform/model/net/QueryInfoStickerListModel;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getResponseData", "getResponseMessage", "getStatusCode", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class QueryInfoStickerResponse extends NetResponseChecker<QueryInfoStickerResponse> {
    private QueryInfoStickerListModel data;
    private String message;
    private int status_code;

    public QueryInfoStickerResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ QueryInfoStickerResponse copy$default(QueryInfoStickerResponse queryInfoStickerResponse, QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            queryInfoStickerListModel = queryInfoStickerResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = queryInfoStickerResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = queryInfoStickerResponse.status_code;
        }
        return queryInfoStickerResponse.copy(queryInfoStickerListModel, str, i);
    }

    public final QueryInfoStickerListModel component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final QueryInfoStickerResponse copy(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        return new QueryInfoStickerResponse(queryInfoStickerListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryInfoStickerResponse)) {
            return false;
        }
        QueryInfoStickerResponse queryInfoStickerResponse = (QueryInfoStickerResponse) obj;
        return Intrinsics.areEqual(this.data, queryInfoStickerResponse.data) && Intrinsics.areEqual(this.message, queryInfoStickerResponse.message) && this.status_code == queryInfoStickerResponse.status_code;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public QueryInfoStickerResponse getResponseData() {
        return this;
    }

    public int hashCode() {
        QueryInfoStickerListModel queryInfoStickerListModel = this.data;
        int i = 0;
        int hashCode = (queryInfoStickerListModel != null ? queryInfoStickerListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public String toString() {
        return "QueryInfoStickerResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final QueryInfoStickerListModel getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
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

    public final void setData(QueryInfoStickerListModel queryInfoStickerListModel) {
        this.data = queryInfoStickerListModel;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i) {
        this.data = queryInfoStickerListModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QueryInfoStickerResponse(QueryInfoStickerListModel queryInfoStickerListModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : queryInfoStickerListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
