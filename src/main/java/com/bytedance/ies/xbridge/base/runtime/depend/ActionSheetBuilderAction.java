package com.bytedance.ies.xbridge.base.runtime.depend;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/ActionSheetBuilderAction;", "", "title", "", "subtitle", ShareHitPoint.f121869d, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSubtitle", "()Ljava/lang/String;", "getTitle", "getType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ActionSheetBuilderAction {
    private final String subtitle;
    private final String title;
    private final String type;

    public static /* synthetic */ ActionSheetBuilderAction copy$default(ActionSheetBuilderAction actionSheetBuilderAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionSheetBuilderAction.title;
        }
        if ((i & 2) != 0) {
            str2 = actionSheetBuilderAction.subtitle;
        }
        if ((i & 4) != 0) {
            str3 = actionSheetBuilderAction.type;
        }
        return actionSheetBuilderAction.copy(str, str2, str3);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.type;
    }

    public final ActionSheetBuilderAction copy(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121869d);
        return new ActionSheetBuilderAction(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetBuilderAction)) {
            return false;
        }
        ActionSheetBuilderAction actionSheetBuilderAction = (ActionSheetBuilderAction) obj;
        return Intrinsics.areEqual(this.title, actionSheetBuilderAction.title) && Intrinsics.areEqual(this.subtitle, actionSheetBuilderAction.subtitle) && Intrinsics.areEqual(this.type, actionSheetBuilderAction.type);
    }

    public int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ActionSheetBuilderAction(title=" + this.title + ", subtitle=" + this.subtitle + ", type=" + this.type + ")";
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public ActionSheetBuilderAction(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "title");
        Intrinsics.checkParameterIsNotNull(str3, ShareHitPoint.f121869d);
        this.title = str;
        this.subtitle = str2;
        this.type = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSheetBuilderAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, str3);
    }
}
