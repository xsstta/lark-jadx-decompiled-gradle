package com.ss.android.lark.tab.space.list.entity;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "Ljava/io/Serializable;", "id", "", "title", "subTitle", "avatarKey", ShareHitPoint.f121869d, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "getId", "setId", "getSubTitle", "setSubTitle", "getTitle", "setTitle", "getType", "()I", "setType", "(I)V", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public class BaseListViewData implements Serializable {
    private String avatarKey;
    private String id;
    private String subTitle;
    private String title;
    private int type;

    public final String getAvatarKey() {
        return this.avatarKey;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setAvatarKey(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.avatarKey = str;
    }

    public final void setId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.id = str;
    }

    public final void setSubTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.title = str;
    }

    public BaseListViewData(String str, String str2, String str3, String str4, int i) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        Intrinsics.checkParameterIsNotNull(str2, "title");
        Intrinsics.checkParameterIsNotNull(str3, "subTitle");
        Intrinsics.checkParameterIsNotNull(str4, "avatarKey");
        this.id = str;
        this.title = str2;
        this.subTitle = str3;
        this.avatarKey = str4;
        this.type = i;
    }
}
