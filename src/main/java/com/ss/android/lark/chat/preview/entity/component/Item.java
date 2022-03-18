package com.ss.android.lark.chat.preview.entity.component;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/chat/preview/entity/component/Item;", "Ljava/io/Serializable;", "actionId", "", "text", "(Ljava/lang/String;Ljava/lang/String;)V", "getActionId", "()Ljava/lang/String;", "getText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "im_chat_chat-preview_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class Item implements Serializable {
    private final String actionId;
    private final String text;

    public static /* synthetic */ Item copy$default(Item item, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = item.actionId;
        }
        if ((i & 2) != 0) {
            str2 = item.text;
        }
        return item.copy(str, str2);
    }

    public final String component1() {
        return this.actionId;
    }

    public final String component2() {
        return this.text;
    }

    public final Item copy(String str, String str2) {
        return new Item(str, str2);
    }

    public String toString() {
        return "Item(actionId=" + this.actionId + ", text=" + this.text + ")";
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i;
        String str = this.actionId;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.text;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        if (!(!Intrinsics.areEqual(this.actionId, item.actionId)) && !(!Intrinsics.areEqual(this.text, item.text))) {
            return true;
        }
        return false;
    }

    public Item(String str, String str2) {
        this.actionId = str;
        this.text = str2;
    }
}
