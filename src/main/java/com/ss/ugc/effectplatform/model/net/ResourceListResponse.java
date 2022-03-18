package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import com.ss.ugc.effectplatform.model.ResourceListModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÂ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/ResourceListResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "Lcom/ss/ugc/effectplatform/model/ResourceListModel;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/ResourceListModel;Ljava/lang/String;I)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "checkValue", "", "component1", "component2", "component3", "copy", "equals", "other", "", "getResponseData", "getResponseMessage", "getStatusCode", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ResourceListResponse extends NetResponseChecker<ResourceListModel> {
    private ResourceListModel data;
    private String message;
    private int status_code;

    public ResourceListResponse() {
        this(null, null, 0, 7, null);
    }

    private final ResourceListModel component1() {
        return this.data;
    }

    private final String component2() {
        return this.message;
    }

    public static /* synthetic */ ResourceListResponse copy$default(ResourceListResponse resourceListResponse, ResourceListModel resourceListModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            resourceListModel = resourceListResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = resourceListResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = resourceListResponse.status_code;
        }
        return resourceListResponse.copy(resourceListModel, str, i);
    }

    public final int component3() {
        return this.status_code;
    }

    public final ResourceListResponse copy(ResourceListModel resourceListModel, String str, int i) {
        return new ResourceListResponse(resourceListModel, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceListResponse)) {
            return false;
        }
        ResourceListResponse resourceListResponse = (ResourceListResponse) obj;
        return Intrinsics.areEqual(this.data, resourceListResponse.data) && Intrinsics.areEqual(this.message, resourceListResponse.message) && this.status_code == resourceListResponse.status_code;
    }

    public int hashCode() {
        ResourceListModel resourceListModel = this.data;
        int i = 0;
        int hashCode = (resourceListModel != null ? resourceListModel.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public String toString() {
        return "ResourceListResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public ResourceListModel getResponseData() {
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
        ResourceListModel resourceListModel = this.data;
        if (resourceListModel == null || resourceListModel.getResource_list() == null) {
            return false;
        }
        return true;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ResourceListResponse(ResourceListModel resourceListModel, String str, int i) {
        this.data = resourceListModel;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceListResponse(ResourceListModel resourceListModel, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : resourceListModel, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
