package com.ss.android.lark.chat.preview.entity.component.property;

import com.ss.android.lark.chat.entity.preview.BaseProperty;
import com.ss.android.lark.chat.entity.preview.Type;
import com.ss.android.lark.chat.preview.entity.component.property.ChattersPreviewProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0000H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/property/AvatarProperty;", "Lcom/ss/android/lark/chat/entity/preview/BaseProperty;", "chatterInfo", "Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "(Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;)V", "getChatterInfo", "()Lcom/ss/android/lark/chat/preview/entity/component/property/ChattersPreviewProperty$ChatterInfo;", "clone", "equals", "", "other", "", "hashCode", "", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class AvatarProperty extends BaseProperty {
    private final ChattersPreviewProperty.ChatterInfo chatterInfo;

    public final ChattersPreviewProperty.ChatterInfo getChatterInfo() {
        return this.chatterInfo;
    }

    @Override // com.ss.android.lark.tangram.base.props.Props, java.lang.Object
    public AvatarProperty clone() {
        return new AvatarProperty(this.chatterInfo);
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public int hashCode() {
        int i;
        int hashCode = super.hashCode() * 31;
        ChattersPreviewProperty.ChatterInfo chatterInfo2 = this.chatterInfo;
        if (chatterInfo2 != null) {
            i = chatterInfo2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public AvatarProperty(ChattersPreviewProperty.ChatterInfo chatterInfo2) {
        super(Type.AVATAR);
        this.chatterInfo = chatterInfo2;
    }

    @Override // com.ss.android.lark.chat.entity.preview.BaseProperty, com.ss.android.lark.tangram.base.props.Props
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AvatarProperty) && super.equals(obj) && !(!Intrinsics.areEqual(this.chatterInfo, ((AvatarProperty) obj).chatterInfo))) {
            return true;
        }
        return false;
    }
}
