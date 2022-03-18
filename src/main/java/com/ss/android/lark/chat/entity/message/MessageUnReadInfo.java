package com.ss.android.lark.chat.entity.message;

import com.bytedance.lark.pb.im.v1.GetChatLimitInfoResponse;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0003JG\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Lcom/ss/android/lark/chat/entity/message/MessageUnReadInfo;", "", "chatId", "", "messageId", "limitInfo", "Lcom/bytedance/lark/pb/im/v1/GetChatLimitInfoResponse;", "unReadChatters", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/lark/pb/im/v1/GetChatLimitInfoResponse;Ljava/util/ArrayList;)V", "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "getLimitInfo", "()Lcom/bytedance/lark/pb/im/v1/GetChatLimitInfoResponse;", "setLimitInfo", "(Lcom/bytedance/lark/pb/im/v1/GetChatLimitInfoResponse;)V", "getMessageId", "setMessageId", "getUnReadChatters", "()Ljava/util/ArrayList;", "setUnReadChatters", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.entity.message.c */
public final class MessageUnReadInfo {

    /* renamed from: a */
    private String f87881a;

    /* renamed from: b */
    private String f87882b;

    /* renamed from: c */
    private GetChatLimitInfoResponse f87883c;

    /* renamed from: d */
    private ArrayList<Chatter> f87884d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageUnReadInfo)) {
            return false;
        }
        MessageUnReadInfo cVar = (MessageUnReadInfo) obj;
        return Intrinsics.areEqual(this.f87881a, cVar.f87881a) && Intrinsics.areEqual(this.f87882b, cVar.f87882b) && Intrinsics.areEqual(this.f87883c, cVar.f87883c) && Intrinsics.areEqual(this.f87884d, cVar.f87884d);
    }

    public int hashCode() {
        String str = this.f87881a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87882b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        GetChatLimitInfoResponse getChatLimitInfoResponse = this.f87883c;
        int hashCode3 = (hashCode2 + (getChatLimitInfoResponse != null ? getChatLimitInfoResponse.hashCode() : 0)) * 31;
        ArrayList<Chatter> arrayList = this.f87884d;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "MessageUnReadInfo(chatId=" + this.f87881a + ", messageId=" + this.f87882b + ", limitInfo=" + this.f87883c + ", unReadChatters=" + this.f87884d + ")";
    }

    /* renamed from: a */
    public final GetChatLimitInfoResponse mo125335a() {
        return this.f87883c;
    }

    /* renamed from: b */
    public final ArrayList<Chatter> mo125336b() {
        return this.f87884d;
    }

    public MessageUnReadInfo(String str, String str2, GetChatLimitInfoResponse getChatLimitInfoResponse, ArrayList<Chatter> arrayList) {
        Intrinsics.checkParameterIsNotNull(arrayList, "unReadChatters");
        this.f87881a = str;
        this.f87882b = str2;
        this.f87883c = getChatLimitInfoResponse;
        this.f87884d = arrayList;
    }
}
