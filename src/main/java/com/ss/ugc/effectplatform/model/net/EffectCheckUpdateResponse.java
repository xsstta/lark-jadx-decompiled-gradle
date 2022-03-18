package com.ss.ugc.effectplatform.model.net;

import com.ss.ugc.effectplatform.model.NetResponseChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J)\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u001dJ\n\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ss/ugc/effectplatform/model/net/EffectCheckUpdateResponse;", "Lcom/ss/ugc/effectplatform/model/NetResponseChecker;", "", "updated", "message", "", "status_code", "", "(ZLjava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus_code", "()I", "setStatus_code", "(I)V", "getUpdated", "()Z", "setUpdated", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "getResponseData", "()Ljava/lang/Boolean;", "getResponseMessage", "getStatusCode", "hashCode", "toString", "effectplatform_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EffectCheckUpdateResponse extends NetResponseChecker<Boolean> {
    private String message;
    private int status_code;
    private boolean updated;

    public EffectCheckUpdateResponse() {
        this(false, null, 0, 7, null);
    }

    public static /* synthetic */ EffectCheckUpdateResponse copy$default(EffectCheckUpdateResponse effectCheckUpdateResponse, boolean z, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = effectCheckUpdateResponse.updated;
        }
        if ((i2 & 2) != 0) {
            str = effectCheckUpdateResponse.message;
        }
        if ((i2 & 4) != 0) {
            i = effectCheckUpdateResponse.status_code;
        }
        return effectCheckUpdateResponse.copy(z, str, i);
    }

    public final boolean component1() {
        return this.updated;
    }

    public final String component2() {
        return this.message;
    }

    public final int component3() {
        return this.status_code;
    }

    public final EffectCheckUpdateResponse copy(boolean z, String str, int i) {
        return new EffectCheckUpdateResponse(z, str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EffectCheckUpdateResponse)) {
            return false;
        }
        EffectCheckUpdateResponse effectCheckUpdateResponse = (EffectCheckUpdateResponse) obj;
        return this.updated == effectCheckUpdateResponse.updated && Intrinsics.areEqual(this.message, effectCheckUpdateResponse.message) && this.status_code == effectCheckUpdateResponse.status_code;
    }

    public int hashCode() {
        boolean z = this.updated;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.message;
        return ((i4 + (str != null ? str.hashCode() : 0)) * 31) + this.status_code;
    }

    public String toString() {
        return "EffectCheckUpdateResponse(updated=" + this.updated + ", message=" + this.message + ", status_code=" + this.status_code + ")";
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

    public final boolean getUpdated() {
        return this.updated;
    }

    @Override // com.ss.ugc.effectplatform.model.NetResponseChecker
    public Boolean getResponseData() {
        return Boolean.valueOf(this.updated);
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatus_code(int i) {
        this.status_code = i;
    }

    public final void setUpdated(boolean z) {
        this.updated = z;
    }

    public EffectCheckUpdateResponse(boolean z, String str, int i) {
        this.updated = z;
        this.message = str;
        this.status_code = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectCheckUpdateResponse(boolean z, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : i);
    }
}
