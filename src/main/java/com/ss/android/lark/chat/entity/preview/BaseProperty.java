package com.ss.android.lark.chat.entity.preview;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.tangram.base.props.Props;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "Lcom/ss/android/lark/tangram/base/props/Props;", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/preview/Type;", "(Lcom/ss/android/lark/chat/entity/preview/Type;)V", "getType", "()Lcom/ss/android/lark/chat/entity/preview/Type;", "equals", "", "other", "", "hashCode", "", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
public class BaseProperty extends Props {
    private final Type type;

    public Type getType() {
        return this.type;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        return getType().hashCode();
    }

    public BaseProperty(Type type2) {
        Intrinsics.checkParameterIsNotNull(type2, ShareHitPoint.f121869d);
        this.type = type2;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(cls2, cls)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.preview.BaseProperty");
        } else if (getType() != ((BaseProperty) obj).getType()) {
            return false;
        } else {
            return true;
        }
    }
}
