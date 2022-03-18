package com.ss.android.lark.chat.export.entity.message;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0000H\u0016¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/Content;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "()V", "isContentSame", "", "diffable", "isItemSame", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
public abstract class Content implements AbstractC26248b<Content>, Serializable {
    public boolean isItemSame(Content content) {
        return true;
    }

    public boolean isContentSame(Content content) {
        return equals(content);
    }
}
