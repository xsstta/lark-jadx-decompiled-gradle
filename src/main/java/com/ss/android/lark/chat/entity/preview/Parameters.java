package com.ss.android.lark.chat.entity.preview;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\bJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003JC\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/Parameters;", "Ljava/io/Serializable;", "parameters", "", "", "userId", "sourceId", "previewId", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParameters", "()Ljava/util/Map;", "getPreviewId", "()Ljava/lang/String;", "getSourceId", "getUserId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Parameters implements Serializable {
    private final Map<String, String> parameters;
    private final String previewId;
    private final String sourceId;
    private final String userId;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.chat.entity.preview.Parameters */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Parameters copy$default(Parameters parameters2, Map map, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = parameters2.parameters;
        }
        if ((i & 2) != 0) {
            str = parameters2.userId;
        }
        if ((i & 4) != 0) {
            str2 = parameters2.sourceId;
        }
        if ((i & 8) != 0) {
            str3 = parameters2.previewId;
        }
        return parameters2.copy(map, str, str2, str3);
    }

    public final Map<String, String> component1() {
        return this.parameters;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.sourceId;
    }

    public final String component4() {
        return this.previewId;
    }

    public final Parameters copy(Map<String, String> map, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(map, "parameters");
        return new Parameters(map, str, str2, str3);
    }

    public String toString() {
        return "Parameters(parameters=" + this.parameters + ", userId=" + this.userId + ", sourceId=" + this.sourceId + ", previewId=" + this.previewId + ")";
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPreviewId() {
        return this.previewId;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.parameters.hashCode() * 31;
        String str = this.userId;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        String str2 = this.sourceId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.previewId;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj != null) {
            Parameters parameters2 = (Parameters) obj;
            if (!(!Intrinsics.areEqual(this.parameters, parameters2.parameters)) && !(!Intrinsics.areEqual(this.userId, parameters2.userId)) && !(!Intrinsics.areEqual(this.sourceId, parameters2.sourceId)) && !(!Intrinsics.areEqual(this.previewId, parameters2.previewId))) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.Parameters");
    }

    public Parameters(Map<String, String> map, String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(map, "parameters");
        this.parameters = map;
        this.userId = str;
        this.sourceId = str2;
        this.previewId = str3;
    }
}
