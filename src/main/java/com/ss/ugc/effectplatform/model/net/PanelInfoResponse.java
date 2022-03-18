package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import com.ss.ugc.effectplatform.model.PanelInfoModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/PanelInfoResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/PanelInfoModel;Ljava/lang/String;I)V", "getData", "()Lcom/ss/ugc/effectplatform/model/PanelInfoModel;", "setData", "(Lcom/ss/ugc/effectplatform/model/PanelInfoModel;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "checkValue", "", "component1", "component2", "component3", "copy", "equals", "other", "", "getResponseData", "getResponseMessage", "getStatusCode", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class PanelInfoResponse extends NetResponseChecker<PanelInfoModel> {
    private PanelInfoModel data;
    private String message;
    private int status_code;

    public PanelInfoResponse() {
        this(null, null, 0, 7, null);
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ PanelInfoResponse copy$default(PanelInfoResponse panelInfoResponse, PanelInfoModel panelInfoModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            panelInfoModel = panelInfoResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = panelInfoResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = panelInfoResponse.status_code;
        }
        return panelInfoResponse.copy(panelInfoModel, str, i);
    }

    public final PanelInfoModel component1() {
        return this.data;
    }

    public final int component3() {
        return this.status_code;
    }

    public final PanelInfoResponse copy(PanelInfoModel panelInfoModel, String str, int i) {
        return new PanelInfoResponse(panelInfoModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PanelInfoResponse)) {
            return false;
        }
        PanelInfoResponse panelInfoResponse = (PanelInfoResponse) obj;
        return Intrinsics.areEqual(this.data, panelInfoResponse.data) && Intrinsics.areEqual(this.message, panelInfoResponse.message) && this.status_code == panelInfoResponse.status_code;
    }

    public int hashCode() {
        PanelInfoModel panelInfoModel = this.data;
        int i = 0;
        int hashCode = (panelInfoModel != null ? panelInfoModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public String toString() {
        return "PanelInfoResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    public final PanelInfoModel getData() {
        return this.data;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public PanelInfoModel getResponseData() {
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

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public boolean checkValue() {
        if (this.data != null) {
            return true;
        }
        return false;
    }

    public final void setData(PanelInfoModel panelInfoModel) {
        this.data = panelInfoModel;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i) {
        this.data = panelInfoModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PanelInfoResponse(PanelInfoModel panelInfoModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : panelInfoModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
