package com.ss.android.lark.mine.impl.custom_status.emoji_panel;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mine/impl/custom_status/emoji_panel/AvatarType;", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;II)V", "getType", "()I", "AVATAR_EMOJI", "AVATAR_TITLE", "core_mine_release"}, mo238835k = 1, mv = {1, 1, 16})
public enum AvatarType {
    AVATAR_EMOJI(0),
    AVATAR_TITLE(1);
    
    private final int type;

    public final int getType() {
        return this.type;
    }

    private AvatarType(int i) {
        this.type = i;
    }
}
