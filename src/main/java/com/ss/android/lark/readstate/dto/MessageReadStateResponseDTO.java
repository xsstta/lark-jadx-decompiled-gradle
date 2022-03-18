package com.ss.android.lark.readstate.dto;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\b\b\u0018\u00002\u00020\u0001Bk\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0012J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\t\u0010*\u001a\u00020\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0001\u0010,\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\nHÖ\u0001J\t\u00100\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001b¨\u00061"}, d2 = {"Lcom/ss/android/lark/readstate/dto/MessageReadStateResponseDTO;", "", "readChatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "unReadChatters", "atChatterIds", "", "", "readCount", "", "unReadCount", "showSearchBox", "", "showLimit", "columnCount", "readCursor", "unReadCursor", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;IIZZILjava/lang/String;Ljava/lang/String;)V", "getAtChatterIds", "()Ljava/util/Set;", "getColumnCount", "()I", "getReadChatters", "()Ljava/util/List;", "getReadCount", "getReadCursor", "()Ljava/lang/String;", "getShowLimit", "()Z", "getShowSearchBox", "getUnReadChatters", "getUnReadCount", "getUnReadCursor", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.b.a */
public final class MessageReadStateResponseDTO {

    /* renamed from: a */
    private final List<ChatChatter> f131287a;

    /* renamed from: b */
    private final List<ChatChatter> f131288b;

    /* renamed from: c */
    private final Set<String> f131289c;

    /* renamed from: d */
    private final int f131290d;

    /* renamed from: e */
    private final int f131291e;

    /* renamed from: f */
    private final boolean f131292f;

    /* renamed from: g */
    private final boolean f131293g;

    /* renamed from: h */
    private final int f131294h;

    /* renamed from: i */
    private final String f131295i;

    /* renamed from: j */
    private final String f131296j;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MessageReadStateResponseDTO) {
                MessageReadStateResponseDTO aVar = (MessageReadStateResponseDTO) obj;
                if (Intrinsics.areEqual(this.f131287a, aVar.f131287a) && Intrinsics.areEqual(this.f131288b, aVar.f131288b) && Intrinsics.areEqual(this.f131289c, aVar.f131289c)) {
                    if (this.f131290d == aVar.f131290d) {
                        if (this.f131291e == aVar.f131291e) {
                            if (this.f131292f == aVar.f131292f) {
                                if (this.f131293g == aVar.f131293g) {
                                    if (!(this.f131294h == aVar.f131294h) || !Intrinsics.areEqual(this.f131295i, aVar.f131295i) || !Intrinsics.areEqual(this.f131296j, aVar.f131296j)) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<ChatChatter> list = this.f131287a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ChatChatter> list2 = this.f131288b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        Set<String> set = this.f131289c;
        int hashCode3 = (((((hashCode2 + (set != null ? set.hashCode() : 0)) * 31) + this.f131290d) * 31) + this.f131291e) * 31;
        boolean z = this.f131292f;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        boolean z2 = this.f131293g;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int i7 = (((i6 + i2) * 31) + this.f131294h) * 31;
        String str = this.f131295i;
        int hashCode4 = (i7 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f131296j;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "MessageReadStateResponseDTO(readChatters=" + this.f131287a + ", unReadChatters=" + this.f131288b + ", atChatterIds=" + this.f131289c + ", readCount=" + this.f131290d + ", unReadCount=" + this.f131291e + ", showSearchBox=" + this.f131292f + ", showLimit=" + this.f131293g + ", columnCount=" + this.f131294h + ", readCursor=" + this.f131295i + ", unReadCursor=" + this.f131296j + ")";
    }

    /* renamed from: a */
    public final List<ChatChatter> mo181352a() {
        return this.f131287a;
    }

    /* renamed from: b */
    public final List<ChatChatter> mo181353b() {
        return this.f131288b;
    }

    /* renamed from: c */
    public final Set<String> mo181354c() {
        return this.f131289c;
    }

    /* renamed from: d */
    public final int mo181355d() {
        return this.f131290d;
    }

    /* renamed from: e */
    public final int mo181356e() {
        return this.f131291e;
    }

    /* renamed from: f */
    public final boolean mo181358f() {
        return this.f131292f;
    }

    /* renamed from: g */
    public final boolean mo181359g() {
        return this.f131293g;
    }

    /* renamed from: h */
    public final int mo181360h() {
        return this.f131294h;
    }

    /* renamed from: i */
    public final String mo181362i() {
        return this.f131295i;
    }

    /* renamed from: j */
    public final String mo181363j() {
        return this.f131296j;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> */
    /* JADX WARN: Multi-variable type inference failed */
    public MessageReadStateResponseDTO(List<? extends ChatChatter> list, List<? extends ChatChatter> list2, Set<String> set, int i, int i2, boolean z, boolean z2, int i3, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(list, "readChatters");
        Intrinsics.checkParameterIsNotNull(list2, "unReadChatters");
        Intrinsics.checkParameterIsNotNull(set, "atChatterIds");
        this.f131287a = list;
        this.f131288b = list2;
        this.f131289c = set;
        this.f131290d = i;
        this.f131291e = i2;
        this.f131292f = z;
        this.f131293g = z2;
        this.f131294h = i3;
        this.f131295i = str;
        this.f131296j = str2;
    }
}
