package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.ThemeColor;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/IGProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/Type;", "maskColor", "Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "(Lcom/ss/android/lark/chat/entity/preview/Type;Lcom/ss/android/lark/chat/entity/preview/ThemeColor;)V", "getMaskColor", "()Lcom/ss/android/lark/chat/entity/preview/ThemeColor;", "getType", "()Lcom/ss/android/lark/chat/entity/preview/Type;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class IGProperty extends BaseProperty {
    private final ThemeColor maskColor;
    private final Type type;

    public final ThemeColor getMaskColor() {
        return this.maskColor;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty
    public Type getType() {
        return this.type;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGProperty(Type type2, ThemeColor themeColor) {
        super(type2);
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        this.type = type2;
        this.maskColor = themeColor;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IGProperty(Type type2, ThemeColor themeColor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(type2, (i & 2) != 0 ? null : themeColor);
    }
}
