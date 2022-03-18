package com.ss.android.lark.dto.chat;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\b\u0018\u00002\u00020\u0001Bk\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u00061"}, d2 = {"Lcom/ss/android/lark/dto/chat/MessageReadStateResponse;", "", "readChatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "unReadChatters", "atChatterIds", "", "", "readCount", "", "unReadCount", "showSearchBox", "", "showLimit", "columnCount", "readCursor", "unReadCursor", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;IIZZILjava/lang/String;Ljava/lang/String;)V", "getAtChatterIds", "()Ljava/util/Set;", "getColumnCount", "()I", "getReadChatters", "()Ljava/util/List;", "getReadCount", "getReadCursor", "()Ljava/lang/String;", "getShowLimit", "()Z", "getShowSearchBox", "getUnReadChatters", "getUnReadCount", "getUnReadCursor", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.dto.chat.g */
public final class MessageReadStateResponse {

    /* renamed from: a */
    private final List<ChatChatter> f94779a;

    /* renamed from: b */
    private final List<ChatChatter> f94780b;

    /* renamed from: c */
    private final Set<String> f94781c;

    /* renamed from: d */
    private final int f94782d;

    /* renamed from: e */
    private final int f94783e;

    /* renamed from: f */
    private final boolean f94784f;

    /* renamed from: g */
    private final boolean f94785g;

    /* renamed from: h */
    private final int f94786h;

    /* renamed from: i */
    private final String f94787i;

    /* renamed from: j */
    private final String f94788j;

    /* renamed from: c */
    public final List<ChatChatter> mo136090c() {
        return this.f94779a;
    }

    /* renamed from: d */
    public final List<ChatChatter> mo136091d() {
        return this.f94780b;
    }

    /* renamed from: e */
    public final Set<String> mo136092e() {
        return this.f94781c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageReadStateResponse)) {
            return false;
        }
        MessageReadStateResponse gVar = (MessageReadStateResponse) obj;
        return Intrinsics.areEqual(this.f94779a, gVar.f94779a) && Intrinsics.areEqual(this.f94780b, gVar.f94780b) && Intrinsics.areEqual(this.f94781c, gVar.f94781c) && this.f94782d == gVar.f94782d && this.f94783e == gVar.f94783e && this.f94784f == gVar.f94784f && this.f94785g == gVar.f94785g && this.f94786h == gVar.f94786h && Intrinsics.areEqual(this.f94787i, gVar.f94787i) && Intrinsics.areEqual(this.f94788j, gVar.f94788j);
    }

    /* renamed from: f */
    public final int mo136094f() {
        return this.f94782d;
    }

    /* renamed from: g */
    public final int mo136095g() {
        return this.f94783e;
    }

    /* renamed from: h */
    public final boolean mo136096h() {
        return this.f94784f;
    }

    public int hashCode() {
        List<ChatChatter> list = this.f94779a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ChatChatter> list2 = this.f94780b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set<String> set = this.f94781c;
        int hashCode3 = (((((hashCode2 + (set != null ? set.hashCode() : 0)) * 31) + this.f94782d) * 31) + this.f94783e) * 31;
        boolean z = this.f94784f;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        boolean z2 = this.f94785g;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (((i6 + i2) * 31) + this.f94786h) * 31;
        String str = this.f94787i;
        int hashCode4 = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f94788j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    /* renamed from: i */
    public final boolean mo136098i() {
        return this.f94785g;
    }

    /* renamed from: j */
    public final int mo136099j() {
        return this.f94786h;
    }

    /* renamed from: k */
    public final String mo136100k() {
        return this.f94787i;
    }

    /* renamed from: l */
    public final String mo136101l() {
        return this.f94788j;
    }

    public String toString() {
        return "MessageReadStateResponse(readChatters=" + this.f94779a + ", unReadChatters=" + this.f94780b + ", atChatterIds=" + this.f94781c + ", readCount=" + this.f94782d + ", unReadCount=" + this.f94783e + ", showSearchBox=" + this.f94784f + ", showLimit=" + this.f94785g + ", columnCount=" + this.f94786h + ", readCursor=" + this.f94787i + ", unReadCursor=" + this.f94788j + ")";
    }

    /* renamed from: a */
    public final List<ChatChatter> mo136088a() {
        return this.f94779a;
    }

    /* renamed from: b */
    public final List<ChatChatter> mo136089b() {
        return this.f94780b;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageReadStateResponse(List<? extends ChatChatter> list, List<? extends ChatChatter> list2, Set<String> set, int i, int i2, boolean z, boolean z2, int i3, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(list, "readChatters");
        Intrinsics.checkParameterIsNotNull(list2, "unReadChatters");
        Intrinsics.checkParameterIsNotNull(set, "atChatterIds");
        this.f94779a = list;
        this.f94780b = list2;
        this.f94781c = set;
        this.f94782d = i;
        this.f94783e = i2;
        this.f94784f = z;
        this.f94785g = z2;
        this.f94786h = i3;
        this.f94787i = str;
        this.f94788j = str2;
    }
}
