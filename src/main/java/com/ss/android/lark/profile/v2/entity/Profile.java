package com.ss.android.lark.profile.v2.entity;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007¢\u0006\u0002\u0010\nR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0005j\b\u0012\u0004\u0012\u00020\t`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/profile/v2/entity/Profile;", "Ljava/io/Serializable;", "userInfo", "Lcom/ss/android/lark/profile/v2/entity/UserInfo;", "ctas", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/profile/v2/entity/CTA;", "Lkotlin/collections/ArrayList;", "fields", "Lcom/ss/android/lark/profile/v2/entity/BaseField;", "(Lcom/ss/android/lark/profile/v2/entity/UserInfo;Ljava/util/ArrayList;Ljava/util/ArrayList;)V", "getCtas", "()Ljava/util/ArrayList;", "getFields", "getUserInfo", "()Lcom/ss/android/lark/profile/v2/entity/UserInfo;", "core_profile_profile-entity_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Profile implements Serializable {
    private final ArrayList<CTA> ctas;
    private final ArrayList<BaseField> fields;
    private final UserInfo userInfo;

    public final ArrayList<CTA> getCtas() {
        return this.ctas;
    }

    public final ArrayList<BaseField> getFields() {
        return this.fields;
    }

    public final UserInfo getUserInfo() {
        return this.userInfo;
    }

    public Profile(UserInfo userInfo2, ArrayList<CTA> arrayList, ArrayList<BaseField> arrayList2) {
        Intrinsics.checkParameterIsNotNull(userInfo2, "userInfo");
        Intrinsics.checkParameterIsNotNull(arrayList, "ctas");
        Intrinsics.checkParameterIsNotNull(arrayList2, "fields");
        this.userInfo = userInfo2;
        this.ctas = arrayList;
        this.fields = arrayList2;
    }
}
