package com.ss.android.vc.lark.rvc;

import com.ss.android.lark.openapi.jsapi.entity.BaseJSModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/vc/lark/rvc/CloseJSModel;", "Lcom/ss/android/lark/openapi/jsapi/entity/BaseJSModel;", "needFloatingWindow", "", "toast", "", "(ZLjava/lang/String;)V", "getNeedFloatingWindow", "()Z", "getToast", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CloseJSModel implements BaseJSModel {
    private final boolean needFloatingWindow;
    private final String toast;

    public static /* synthetic */ CloseJSModel copy$default(CloseJSModel closeJSModel, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = closeJSModel.needFloatingWindow;
        }
        if ((i & 2) != 0) {
            str = closeJSModel.toast;
        }
        return closeJSModel.copy(z, str);
    }

    public final boolean component1() {
        return this.needFloatingWindow;
    }

    public final String component2() {
        return this.toast;
    }

    public final CloseJSModel copy(boolean z, String str) {
        return new CloseJSModel(z, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloseJSModel)) {
            return false;
        }
        CloseJSModel closeJSModel = (CloseJSModel) obj;
        return this.needFloatingWindow == closeJSModel.needFloatingWindow && Intrinsics.areEqual(this.toast, closeJSModel.toast);
    }

    public int hashCode() {
        boolean z = this.needFloatingWindow;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        String str = this.toast;
        return i4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "CloseJSModel(needFloatingWindow=" + this.needFloatingWindow + ", toast=" + this.toast + ")";
    }

    public final boolean getNeedFloatingWindow() {
        return this.needFloatingWindow;
    }

    public final String getToast() {
        return this.toast;
    }

    public CloseJSModel(boolean z, String str) {
        this.needFloatingWindow = z;
        this.toast = str;
    }
}
