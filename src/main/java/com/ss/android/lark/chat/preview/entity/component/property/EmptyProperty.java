package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/EmptyProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/Type;", "(Lcom/ss/android/lark/chat/entity/preview/Type;)V", "getType", "()Lcom/ss/android/lark/chat/entity/preview/Type;", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class EmptyProperty extends BaseProperty {
    private final Type type;

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty
    public Type getType() {
        return this.type;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmptyProperty(Type type2) {
        super(type2);
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        this.type = type2;
    }
}
