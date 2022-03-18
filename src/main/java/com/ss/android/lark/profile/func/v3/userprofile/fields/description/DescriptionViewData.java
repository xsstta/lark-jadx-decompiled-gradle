package com.ss.android.lark.profile.func.v3.userprofile.fields.description;

import com.bytedance.lark.pb.basic.v1.ImageSetPassThrough;
import com.ss.android.lark.profile.func.v3.userprofile.fields.base.BaseInfoViewDataV3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/profile/func/v3/userprofile/fields/description/DescriptionViewData;", "Lcom/ss/android/lark/profile/func/v3/userprofile/fields/base/BaseInfoViewDataV3;", "key", "", "typeName", "description", "image", "Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;)V", "getDescription", "()Ljava/lang/String;", "getImage", "()Lcom/bytedance/lark/pb/basic/v1/ImageSetPassThrough;", "getKey", "getTypeName", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.func.v3.userprofile.fields.e.b */
public final class DescriptionViewData extends BaseInfoViewDataV3 {

    /* renamed from: a */
    private final String f130505a;

    /* renamed from: b */
    private final String f130506b;

    /* renamed from: c */
    private final String f130507c;

    /* renamed from: d */
    private final ImageSetPassThrough f130508d;

    /* renamed from: a */
    public final String mo180265a() {
        return this.f130507c;
    }

    /* renamed from: b */
    public final ImageSetPassThrough mo180266b() {
        return this.f130508d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptionViewData(String str, String str2, String str3, ImageSetPassThrough imageSetPassThrough) {
        super(str, str2);
        Intrinsics.checkParameterIsNotNull(str, "key");
        this.f130505a = str;
        this.f130506b = str2;
        this.f130507c = str3;
        this.f130508d = imageSetPassThrough;
    }
}
