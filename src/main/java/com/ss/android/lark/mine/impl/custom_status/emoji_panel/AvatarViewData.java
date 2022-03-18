package com.ss.android.lark.mine.impl.custom_status.emoji_panel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarViewData;", "", "avatarKey", "", "avatarType", "Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarType;", "(Ljava/lang/String;Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarType;)V", "getAvatarKey", "()Ljava/lang/String;", "getAvatarType", "()Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mine.impl.custom_status.emoji_panel.a */
public final class AvatarViewData {

    /* renamed from: a */
    private final String f115071a;

    /* renamed from: b */
    private final AvatarType f115072b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarViewData)) {
            return false;
        }
        AvatarViewData aVar = (AvatarViewData) obj;
        return Intrinsics.areEqual(this.f115071a, aVar.f115071a) && Intrinsics.areEqual(this.f115072b, aVar.f115072b);
    }

    public int hashCode() {
        String str = this.f115071a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        AvatarType avatarType = this.f115072b;
        if (avatarType != null) {
            i = avatarType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "AvatarViewData(avatarKey=" + this.f115071a + ", avatarType=" + this.f115072b + ")";
    }

    /* renamed from: a */
    public final String mo160437a() {
        return this.f115071a;
    }

    /* renamed from: b */
    public final AvatarType mo160438b() {
        return this.f115072b;
    }

    public AvatarViewData(String str, AvatarType avatarType) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        Intrinsics.checkParameterIsNotNull(avatarType, "avatarType");
        this.f115071a = str;
        this.f115072b = avatarType;
    }
}
