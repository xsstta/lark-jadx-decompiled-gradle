package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ies/xbridge/base/runtime/depend/ActionSheetBuilder;", "", "context", "Landroid/content/Context;", "title", "", "subtitle", "actions", "", "Lcom/bytedance/ies/xbridge/base/runtime/depend/ActionSheetBuilderAction;", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getActions", "()Ljava/util/List;", "getContext", "()Landroid/content/Context;", "getSubtitle", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "x-bridge-base-runtime_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class ActionSheetBuilder {
    private final List<ActionSheetBuilderAction> actions;
    private final Context context;
    private final String subtitle;
    private final String title;

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ies.xbridge.base.runtime.depend.ActionSheetBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActionSheetBuilder copy$default(ActionSheetBuilder actionSheetBuilder, Context context2, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            context2 = actionSheetBuilder.context;
        }
        if ((i & 2) != 0) {
            str = actionSheetBuilder.title;
        }
        if ((i & 4) != 0) {
            str2 = actionSheetBuilder.subtitle;
        }
        if ((i & 8) != 0) {
            list = actionSheetBuilder.actions;
        }
        return actionSheetBuilder.copy(context2, str, str2, list);
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.subtitle;
    }

    public final List<ActionSheetBuilderAction> component4() {
        return this.actions;
    }

    public final ActionSheetBuilder copy(Context context2, String str, String str2, List<ActionSheetBuilderAction> list) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(list, "actions");
        return new ActionSheetBuilder(context2, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionSheetBuilder)) {
            return false;
        }
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        return Intrinsics.areEqual(this.context, actionSheetBuilder.context) && Intrinsics.areEqual(this.title, actionSheetBuilder.title) && Intrinsics.areEqual(this.subtitle, actionSheetBuilder.subtitle) && Intrinsics.areEqual(this.actions, actionSheetBuilder.actions);
    }

    public int hashCode() {
        Context context2 = this.context;
        int i = 0;
        int hashCode = (context2 != null ? context2.hashCode() : 0) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<ActionSheetBuilderAction> list = this.actions;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ActionSheetBuilder(context=" + this.context + ", title=" + this.title + ", subtitle=" + this.subtitle + ", actions=" + this.actions + ")";
    }

    public final List<ActionSheetBuilderAction> getActions() {
        return this.actions;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public ActionSheetBuilder(Context context2, String str, String str2, List<ActionSheetBuilderAction> list) {
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(list, "actions");
        this.context = context2;
        this.title = str;
        this.subtitle = str2;
        this.actions = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ActionSheetBuilder(Context context2, String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, list);
    }
}
