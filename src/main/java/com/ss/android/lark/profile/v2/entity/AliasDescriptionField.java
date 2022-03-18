package com.ss.android.lark.profile.v2.entity;

import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/AliasDescriptionField;", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "Ljava/io/Serializable;", "description", "", "image", "Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "(Ljava/lang/String;Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getImage", "()Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "setImage", "(Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;)V", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AliasDescriptionField extends BaseField implements Serializable {
    private String description;
    private ImageSetPassThrough image;

    public AliasDescriptionField() {
        this(null, null, 3, null);
    }

    public final String getDescription() {
        return this.description;
    }

    public final ImageSetPassThrough getImage() {
        return this.image;
    }

    public final void setImage(ImageSetPassThrough imageSetPassThrough) {
        this.image = imageSetPassThrough;
    }

    public final void setDescription(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.description = str;
    }

    public AliasDescriptionField(String str, ImageSetPassThrough imageSetPassThrough) {
        Intrinsics.checkParameterIsNotNull(str, "description");
        this.description = str;
        this.image = imageSetPassThrough;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AliasDescriptionField(String str, ImageSetPassThrough imageSetPassThrough, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : imageSetPassThrough);
    }
}
