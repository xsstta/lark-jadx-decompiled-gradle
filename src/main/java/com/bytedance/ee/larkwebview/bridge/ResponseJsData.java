package com.bytedance.ee.larkwebview.bridge;

import com.google.firebase.messaging.Constants;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÆ\u0003J7\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/bytedance/ee/larkwebview/bridge/ResponseJsData;", "", UpdateKey.STATUS, "Lcom/bytedance/ee/larkwebview/bridge/Status;", "callbackId", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "extraStr", "(Lcom/bytedance/ee/larkwebview/bridge/Status;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getCallbackId", "()Ljava/lang/String;", "setCallbackId", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "getExtraStr", "setExtraStr", "getStatus", "()Lcom/bytedance/ee/larkwebview/bridge/Status;", "setStatus", "(Lcom/bytedance/ee/larkwebview/bridge/Status;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.i */
public final class ResponseJsData {

    /* renamed from: a */
    private Status f35368a;

    /* renamed from: b */
    private String f35369b;

    /* renamed from: c */
    private Object f35370c;

    /* renamed from: d */
    private Object f35371d;

    public ResponseJsData() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseJsData)) {
            return false;
        }
        ResponseJsData iVar = (ResponseJsData) obj;
        return Intrinsics.areEqual(this.f35368a, iVar.f35368a) && Intrinsics.areEqual(this.f35369b, iVar.f35369b) && Intrinsics.areEqual(this.f35370c, iVar.f35370c) && Intrinsics.areEqual(this.f35371d, iVar.f35371d);
    }

    public int hashCode() {
        Status status = this.f35368a;
        int i = 0;
        int hashCode = (status != null ? status.hashCode() : 0) * 31;
        String str = this.f35369b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.f35370c;
        int hashCode3 = (hashCode2 + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.f35371d;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ResponseJsData(status=" + this.f35368a + ", callbackId=" + this.f35369b + ", data=" + this.f35370c + ", extraStr=" + this.f35371d + ")";
    }

    /* renamed from: a */
    public final Status mo49790a() {
        return this.f35368a;
    }

    /* renamed from: b */
    public final String mo49794b() {
        return this.f35369b;
    }

    /* renamed from: c */
    public final Object mo49796c() {
        return this.f35370c;
    }

    /* renamed from: d */
    public final Object mo49797d() {
        return this.f35371d;
    }

    /* renamed from: a */
    public final void mo49791a(Status status) {
        this.f35368a = status;
    }

    /* renamed from: b */
    public final void mo49795b(Object obj) {
        this.f35371d = obj;
    }

    /* renamed from: a */
    public final void mo49792a(Object obj) {
        this.f35370c = obj;
    }

    /* renamed from: a */
    public final void mo49793a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f35369b = str;
    }

    public ResponseJsData(Status status, String str, Object obj, Object obj2) {
        Intrinsics.checkParameterIsNotNull(str, "callbackId");
        this.f35368a = status;
        this.f35369b = str;
        this.f35370c = obj;
        this.f35371d = obj2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResponseJsData(Status status, String str, Object obj, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : status, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? null : obj2);
    }
}
