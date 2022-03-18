package com.ss.android.lark.chat.export.entity.message.content;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/content/LarkCommand;", "Lcom/ss/android/lark/chat/export/entity/message/content/SystemMessageItemAction;", "cmd", "", "payload", "Lokio/ByteString;", "(ILokio/ByteString;)V", "getCmd", "()I", "setCmd", "(I)V", "getPayload", "()Lokio/ByteString;", "setPayload", "(Lokio/ByteString;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.entity.message.content.c */
public final class LarkCommand extends SystemMessageItemAction {

    /* renamed from: a */
    private int f87963a;

    /* renamed from: b */
    private ByteString f87964b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LarkCommand)) {
            return false;
        }
        LarkCommand cVar = (LarkCommand) obj;
        return this.f87963a == cVar.f87963a && Intrinsics.areEqual(this.f87964b, cVar.f87964b);
    }

    public int hashCode() {
        int i = this.f87963a * 31;
        ByteString byteString = this.f87964b;
        return i + (byteString != null ? byteString.hashCode() : 0);
    }

    public String toString() {
        return "LarkCommand(cmd=" + this.f87963a + ", payload=" + this.f87964b + ")";
    }

    /* renamed from: a */
    public final int mo126121a() {
        return this.f87963a;
    }

    /* renamed from: b */
    public final ByteString mo126122b() {
        return this.f87964b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LarkCommand(int i, ByteString byteString) {
        super(1);
        Intrinsics.checkParameterIsNotNull(byteString, "payload");
        this.f87963a = i;
        this.f87964b = byteString;
    }
}
