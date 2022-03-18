package com.ss.android.lark.moments.impl.publish.category;

import com.bytedance.lark.pb.moments.v1.Category;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Ljava/io/Serializable;", "category", "Lcom/bytedance/lark/pb/moments/v1/Category;", "selected", "", "(Lcom/bytedance/lark/pb/moments/v1/Category;Z)V", "getCategory", "()Lcom/bytedance/lark/pb/moments/v1/Category;", "iconKey", "", "getIconKey", "()Ljava/lang/String;", "id", "getId", "name", "getName", "getSelected", "()Z", "setSelected", "(Z)V", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CategoryTag implements Serializable {
    private final Category category;
    private final String iconKey;
    private final String id;
    private final String name;
    private boolean selected;

    public final Category getCategory() {
        return this.category;
    }

    public final String getIconKey() {
        return this.iconKey;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public CategoryTag(Category category2, boolean z) {
        Intrinsics.checkParameterIsNotNull(category2, "category");
        this.category = category2;
        this.selected = z;
        String str = category2.category_id;
        Intrinsics.checkExpressionValueIsNotNull(str, "category.category_id");
        this.id = str;
        String str2 = category2.name;
        Intrinsics.checkExpressionValueIsNotNull(str2, "category.name");
        this.name = str2;
        this.iconKey = category2.icon_key;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CategoryTag(Category category2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(category2, (i & 2) != 0 ? false : z);
    }
}
