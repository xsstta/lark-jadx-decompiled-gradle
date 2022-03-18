package com.ss.ugc.effectplatform.model.net;

import com.google.firebase.messaging.Constants;
import com.ss.ugc.effectplatform.model.NetResponseChecker;
import com.ss.ugc.effectplatform.model.PlatformEffect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J+\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\n\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006$"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/ScanQRCodeResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "Lcom/ss/ugc/effectplatform/model/net/ScanQRCodeResponse$DataNode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "message", "", "status_code", "", "(Lcom/ss/ugc/effectplatform/model/net/ScanQRCodeResponse$DataNode;Ljava/lang/String;I)V", "getData", "()Lcom/ss/ugc/effectplatform/model/net/ScanQRCodeResponse$DataNode;", "setData", "(Lcom/ss/ugc/effectplatform/model/net/ScanQRCodeResponse$DataNode;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "checkValue", "", "component1", "component2", "component3", "copy", "equals", "other", "", "getResponseData", "getResponseMessage", "getStatusCode", "hashCode", "toString", "DataNode", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ScanQRCodeResponse extends NetResponseChecker<DataNode> {
    private DataNode data;
    private String message;
    private int status_code;

    public ScanQRCodeResponse() {
        this(null, null, 0, 7, null);
    }

    public static /* synthetic */ ScanQRCodeResponse copy$default(ScanQRCodeResponse scanQRCodeResponse, DataNode dataNode, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dataNode = scanQRCodeResponse.data;
        }
        if ((i2 & 2) != 0) {
            str = scanQRCodeResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = scanQRCodeResponse.status_code;
        }
        return scanQRCodeResponse.copy(dataNode, str, i);
    }

    public final DataNode component1() {
        return this.data;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final ScanQRCodeResponse copy(DataNode dataNode, String str, int i) {
        return new ScanQRCodeResponse(dataNode, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanQRCodeResponse)) {
            return false;
        }
        ScanQRCodeResponse scanQRCodeResponse = (ScanQRCodeResponse) obj;
        return Intrinsics.areEqual(this.data, scanQRCodeResponse.data) && Intrinsics.areEqual(this.message, scanQRCodeResponse.message) && this.status_code == scanQRCodeResponse.status_code;
    }

    public int hashCode() {
        DataNode dataNode = this.data;
        int i = 0;
        int hashCode = (dataNode != null ? dataNode.hashCode() : 0) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return ((hashCode + i) * 31) + this.status_code;
    }

    public String toString() {
        return "ScanQRCodeResponse(data=" + this.data + ", message=" + this.message + ", status_code=" + this.status_code + ")";
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/ScanQRCodeResponse$DataNode;", "", "effect", "Lcom/ss/ugc/effectplatform/model/PlatformEffect;", "url_prefix", "", "", "(Lcom/ss/ugc/effectplatform/model/PlatformEffect;Ljava/util/List;)V", "getEffect", "()Lcom/ss/ugc/effectplatform/model/PlatformEffect;", "setEffect", "(Lcom/ss/ugc/effectplatform/model/PlatformEffect;)V", "getUrl_prefix", "()Ljava/util/List;", "setUrl_prefix", "(Ljava/util/List;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
    public static final class DataNode {
        private PlatformEffect effect;
        private List<String> url_prefix;

        public DataNode() {
            this(null, null, 3, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.ugc.effectplatform.model.net.ScanQRCodeResponse$DataNode */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DataNode copy$default(DataNode dataNode, PlatformEffect platformEffect, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                platformEffect = dataNode.effect;
            }
            if ((i & 2) != 0) {
                list = dataNode.url_prefix;
            }
            return dataNode.copy(platformEffect, list);
        }

        public final PlatformEffect component1() {
            return this.effect;
        }

        public final List<String> component2() {
            return this.url_prefix;
        }

        public final DataNode copy(PlatformEffect platformEffect, List<String> list) {
            return new DataNode(platformEffect, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataNode)) {
                return false;
            }
            DataNode dataNode = (DataNode) obj;
            return Intrinsics.areEqual(this.effect, dataNode.effect) && Intrinsics.areEqual(this.url_prefix, dataNode.url_prefix);
        }

        public int hashCode() {
            PlatformEffect platformEffect = this.effect;
            int i = 0;
            int hashCode = (platformEffect != null ? platformEffect.hashCode() : 0) * 31;
            List<String> list = this.url_prefix;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            return "DataNode(effect=" + this.effect + ", url_prefix=" + this.url_prefix + ")";
        }

        public final PlatformEffect getEffect() {
            return this.effect;
        }

        public final List<String> getUrl_prefix() {
            return this.url_prefix;
        }

        public final void setEffect(PlatformEffect platformEffect) {
            this.effect = platformEffect;
        }

        public final void setUrl_prefix(List<String> list) {
            this.url_prefix = list;
        }

        public DataNode(PlatformEffect platformEffect, List<String> list) {
            this.effect = platformEffect;
            this.url_prefix = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DataNode(PlatformEffect platformEffect, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : platformEffect, (i & 2) != 0 ? null : list);
        }
    }

    public final DataNode getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public DataNode getResponseData() {
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
        DataNode dataNode = this.data;
        if (dataNode == null || dataNode.getEffect() == null) {
            return false;
        }
        return true;
    }

    public final void setData(DataNode dataNode) {
        this.data = dataNode;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public ScanQRCodeResponse(DataNode dataNode, String str, int i) {
        this.data = dataNode;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ScanQRCodeResponse(DataNode dataNode, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : dataNode, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
