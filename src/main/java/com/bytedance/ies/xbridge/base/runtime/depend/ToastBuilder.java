package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\rJ<\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/ToastBuilder;", "", "context", "Landroid/content/Context;", "message", "", ShareHitPoint.f121869d, "duration", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getContext", "()Landroid/content/Context;", "getDuration", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getType", "component1", "component2", "component3", "component4", "copy", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/bytedance/ies/xbridge/base/runtime/depend/ToastBuilder;", "equals", "", "other", "hashCode", "toString", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ToastBuilder {
    private final Context context;
    private final Integer duration;
    private final String message;
    private final String type;

    public static /* synthetic */ ToastBuilder copy$default(ToastBuilder toastBuilder, Context context2, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            context2 = toastBuilder.context;
        }
        if ((i & 2) != 0) {
            str = toastBuilder.message;
        }
        if ((i & 4) != 0) {
            str2 = toastBuilder.type;
        }
        if ((i & 8) != 0) {
            num = toastBuilder.duration;
        }
        return toastBuilder.copy(context2, str, str2, num);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.type;
    }

    public final Integer component4() {
        return this.duration;
    }

    public final ToastBuilder copy(Context context2, String str, String str2, Integer num) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return new ToastBuilder(context2, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToastBuilder)) {
            return false;
        }
        ToastBuilder toastBuilder = (ToastBuilder) obj;
        return Intrinsics.areEqual(this.context, toastBuilder.context) && Intrinsics.areEqual(this.message, toastBuilder.message) && Intrinsics.areEqual(this.type, toastBuilder.type) && Intrinsics.areEqual(this.duration, toastBuilder.duration);
    }

    public int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.type;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.duration;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ToastBuilder(context=" + this.context + ", message=" + this.message + ", type=" + this.type + ", duration=" + this.duration + ")";
    }

    public final Context getContext() {
        return this.context;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getType() {
        return this.type;
    }

    public ToastBuilder(Context context2, String str, String str2, Integer num) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        this.context = context2;
        this.message = str;
        this.type = str2;
        this.duration = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ToastBuilder(Context context2, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? "success" : str2, (i & 8) != 0 ? null : num);
    }
}
