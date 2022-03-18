package com.ss.android.lark.tab.manager.entity;

import android.graphics.drawable.Drawable;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003JQ\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0004HÆ\u0001J\u0013\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\u0012\u0010&\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0016J\u0012\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010\u0000H\u0016J\t\u0010)\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006*"}, d2 = {"Lcom/ss/android/lark/tab/manager/entity/ChatTabOrderData;", "Ljava/io/Serializable;", "Lcom/larksuite/framework/utils/diff/Diffable;", "id", "", "name", "", "icon", "Landroid/graphics/drawable/Drawable;", "unmovable", "", "deletable", "isLastIndex", "tabId", "(JLjava/lang/String;Landroid/graphics/drawable/Drawable;ZZZJ)V", "getDeletable", "()Z", "getIcon", "()Landroid/graphics/drawable/Drawable;", "getId", "()J", "getName", "()Ljava/lang/String;", "getTabId", "getUnmovable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "isContentSame", "isItemSame", "diffable", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class ChatTabOrderData implements AbstractC26248b<ChatTabOrderData>, Serializable {
    private final boolean deletable;
    private final Drawable icon;
    private final long id;
    private final boolean isLastIndex;
    private final String name;
    private final long tabId;
    private final boolean unmovable;

    public static /* synthetic */ ChatTabOrderData copy$default(ChatTabOrderData chatTabOrderData, long j, String str, Drawable drawable, boolean z, boolean z2, boolean z3, long j2, int i, Object obj) {
        return chatTabOrderData.copy((i & 1) != 0 ? chatTabOrderData.id : j, (i & 2) != 0 ? chatTabOrderData.name : str, (i & 4) != 0 ? chatTabOrderData.icon : drawable, (i & 8) != 0 ? chatTabOrderData.unmovable : z, (i & 16) != 0 ? chatTabOrderData.deletable : z2, (i & 32) != 0 ? chatTabOrderData.isLastIndex : z3, (i & 64) != 0 ? chatTabOrderData.tabId : j2);
    }

    public final long component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Drawable component3() {
        return this.icon;
    }

    public final boolean component4() {
        return this.unmovable;
    }

    public final boolean component5() {
        return this.deletable;
    }

    public final boolean component6() {
        return this.isLastIndex;
    }

    public final long component7() {
        return this.tabId;
    }

    public final ChatTabOrderData copy(long j, String str, Drawable drawable, boolean z, boolean z2, boolean z3, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return new ChatTabOrderData(j, str, drawable, z, z2, z3, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatTabOrderData)) {
            return false;
        }
        ChatTabOrderData chatTabOrderData = (ChatTabOrderData) obj;
        return this.id == chatTabOrderData.id && Intrinsics.areEqual(this.name, chatTabOrderData.name) && Intrinsics.areEqual(this.icon, chatTabOrderData.icon) && this.unmovable == chatTabOrderData.unmovable && this.deletable == chatTabOrderData.deletable && this.isLastIndex == chatTabOrderData.isLastIndex && this.tabId == chatTabOrderData.tabId;
    }

    public int hashCode() {
        int hashCode = C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.id) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Drawable drawable = this.icon;
        if (drawable != null) {
            i = drawable.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.unmovable;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (i2 + i4) * 31;
        boolean z2 = this.deletable;
        if (z2) {
            z2 = true;
        }
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = z2 ? 1 : 0;
        int i11 = (i7 + i8) * 31;
        boolean z3 = this.isLastIndex;
        if (!z3) {
            i3 = z3 ? 1 : 0;
        }
        return ((i11 + i3) * 31) + C$r8$backportedMethods$utility$Long$1$hashCode.hashCode(this.tabId);
    }

    public String toString() {
        return "ChatTabOrderData(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", unmovable=" + this.unmovable + ", deletable=" + this.deletable + ", isLastIndex=" + this.isLastIndex + ", tabId=" + this.tabId + ")";
    }

    public final boolean getDeletable() {
        return this.deletable;
    }

    public final Drawable getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getTabId() {
        return this.tabId;
    }

    public final boolean getUnmovable() {
        return this.unmovable;
    }

    public final boolean isLastIndex() {
        return this.isLastIndex;
    }

    public boolean isItemSame(ChatTabOrderData chatTabOrderData) {
        long j = this.id;
        if (chatTabOrderData == null || j != chatTabOrderData.id) {
            return false;
        }
        return true;
    }

    public boolean isContentSame(ChatTabOrderData chatTabOrderData) {
        Class<?> cls;
        if (this == chatTabOrderData) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (chatTabOrderData != null) {
            cls = chatTabOrderData.getClass();
        } else {
            cls = null;
        }
        if (!(!Intrinsics.areEqual(cls2, cls)) && this.id == chatTabOrderData.id && !(!Intrinsics.areEqual(this.name, chatTabOrderData.name)) && this.isLastIndex == chatTabOrderData.isLastIndex) {
            return true;
        }
        return false;
    }

    public ChatTabOrderData(long j, String str, Drawable drawable, boolean z, boolean z2, boolean z3, long j2) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.id = j;
        this.name = str;
        this.icon = drawable;
        this.unmovable = z;
        this.deletable = z2;
        this.isLastIndex = z3;
        this.tabId = j2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChatTabOrderData(long r12, java.lang.String r14, android.graphics.drawable.Drawable r15, boolean r16, boolean r17, boolean r18, long r19, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r11 = this;
            r0 = r21 & 32
            if (r0 == 0) goto L_0x0007
            r0 = 0
            r8 = 0
            goto L_0x0009
        L_0x0007:
            r8 = r18
        L_0x0009:
            r1 = r11
            r2 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r9 = r19
            r1.<init>(r2, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.tab.manager.entity.ChatTabOrderData.<init>(long, java.lang.String, android.graphics.drawable.Drawable, boolean, boolean, boolean, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
