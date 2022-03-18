package com.ss.android.lark.dto.chat;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\rHÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\rHÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\rHÆ\u0001J\u0013\u0010&\u001a\u00020\u00062\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0004HÖ\u0001J\t\u0010)\u001a\u00020\bHÖ\u0001R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, d2 = {"Lcom/ss/android/lark/dto/chat/ChatChatterResponse;", "", "()V", "memberCount", "", "showSearch", "", "cursor", "", "chatChatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "chatterLetterMap", "", "chatterDepartmentNameMap", "(IZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getChatChatters", "()Ljava/util/List;", "getChatterDepartmentNameMap", "()Ljava/util/Map;", "getChatterLetterMap", "getCursor", "()Ljava/lang/String;", "getMemberCount", "()I", "searKey", "getSearKey", "setSearKey", "(Ljava/lang/String;)V", "getShowSearch", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.dto.chat.a */
public final class ChatChatterResponse {

    /* renamed from: a */
    private String f94753a;

    /* renamed from: b */
    private final int f94754b;

    /* renamed from: c */
    private final boolean f94755c;

    /* renamed from: d */
    private final String f94756d;

    /* renamed from: e */
    private final List<ChatChatter> f94757e;

    /* renamed from: f */
    private final Map<String, String> f94758f;

    /* renamed from: g */
    private final Map<String, String> f94759g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatChatterResponse)) {
            return false;
        }
        ChatChatterResponse aVar = (ChatChatterResponse) obj;
        return this.f94754b == aVar.f94754b && this.f94755c == aVar.f94755c && Intrinsics.areEqual(this.f94756d, aVar.f94756d) && Intrinsics.areEqual(this.f94757e, aVar.f94757e) && Intrinsics.areEqual(this.f94758f, aVar.f94758f) && Intrinsics.areEqual(this.f94759g, aVar.f94759g);
    }

    public int hashCode() {
        int i = this.f94754b * 31;
        boolean z = this.f94755c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        String str = this.f94756d;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        List<ChatChatter> list = this.f94757e;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.f94758f;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.f94759g;
        if (map2 != null) {
            i6 = map2.hashCode();
        }
        return hashCode3 + i6;
    }

    public String toString() {
        return "ChatChatterResponse(memberCount=" + this.f94754b + ", showSearch=" + this.f94755c + ", cursor=" + this.f94756d + ", chatChatters=" + this.f94757e + ", chatterLetterMap=" + this.f94758f + ", chatterDepartmentNameMap=" + this.f94759g + ")";
    }

    /* renamed from: a */
    public final String mo136067a() {
        return this.f94753a;
    }

    /* renamed from: b */
    public final int mo136068b() {
        return this.f94754b;
    }

    /* renamed from: c */
    public final boolean mo136069c() {
        return this.f94755c;
    }

    /* renamed from: d */
    public final String mo136070d() {
        return this.f94756d;
    }

    /* renamed from: e */
    public final List<ChatChatter> mo136071e() {
        return this.f94757e;
    }

    /* renamed from: f */
    public final Map<String, String> mo136073f() {
        return this.f94758f;
    }

    /* renamed from: g */
    public final Map<String, String> mo136074g() {
        return this.f94759g;
    }

    public ChatChatterResponse() {
        this(0, false, "", new ArrayList(0), null, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatChatterResponse(int i, boolean z, String str, List<? extends ChatChatter> list, Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(list, "chatChatters");
        this.f94754b = i;
        this.f94755c = z;
        this.f94756d = str;
        this.f94757e = list;
        this.f94758f = map;
        this.f94759g = map2;
        this.f94753a = "";
    }
}
