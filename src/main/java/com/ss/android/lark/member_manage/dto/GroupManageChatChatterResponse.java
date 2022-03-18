package com.ss.android.lark.member_manage.dto;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u001d\b\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fHÆ\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006)"}, d2 = {"Lcom/ss/android/lark/member_manage/dto/GroupManageChatChatterResponse;", "", "memberCount", "", "showSearch", "", "cursor", "", "chatChatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "chatterLetterMap", "", "chatterDepartmentNameMap", "(IZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getChatChatters", "()Ljava/util/List;", "getChatterDepartmentNameMap", "()Ljava/util/Map;", "getChatterLetterMap", "getCursor", "()Ljava/lang/String;", "getMemberCount", "()I", "searKey", "getSearKey", "setSearKey", "(Ljava/lang/String;)V", "getShowSearch", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.dto.b */
public final class GroupManageChatChatterResponse {

    /* renamed from: a */
    private String f113661a = "";

    /* renamed from: b */
    private final int f113662b;

    /* renamed from: c */
    private final boolean f113663c;

    /* renamed from: d */
    private final String f113664d;

    /* renamed from: e */
    private final List<ChatChatter> f113665e;

    /* renamed from: f */
    private final Map<String, String> f113666f;

    /* renamed from: g */
    private final Map<String, String> f113667g;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupManageChatChatterResponse)) {
            return false;
        }
        GroupManageChatChatterResponse bVar = (GroupManageChatChatterResponse) obj;
        return this.f113662b == bVar.f113662b && this.f113663c == bVar.f113663c && Intrinsics.areEqual(this.f113664d, bVar.f113664d) && Intrinsics.areEqual(this.f113665e, bVar.f113665e) && Intrinsics.areEqual(this.f113666f, bVar.f113666f) && Intrinsics.areEqual(this.f113667g, bVar.f113667g);
    }

    public int hashCode() {
        int i = this.f113662b * 31;
        boolean z = this.f113663c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (i + i2) * 31;
        String str = this.f113664d;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        List<ChatChatter> list = this.f113665e;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Map<String, String> map = this.f113666f;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.f113667g;
        if (map2 != null) {
            i6 = map2.hashCode();
        }
        return hashCode3 + i6;
    }

    public String toString() {
        return "GroupManageChatChatterResponse(memberCount=" + this.f113662b + ", showSearch=" + this.f113663c + ", cursor=" + this.f113664d + ", chatChatters=" + this.f113665e + ", chatterLetterMap=" + this.f113666f + ", chatterDepartmentNameMap=" + this.f113667g + ")";
    }

    /* renamed from: a */
    public final String mo158902a() {
        return this.f113661a;
    }

    /* renamed from: b */
    public final boolean mo158904b() {
        return this.f113663c;
    }

    /* renamed from: c */
    public final String mo158905c() {
        return this.f113664d;
    }

    /* renamed from: d */
    public final List<ChatChatter> mo158906d() {
        return this.f113665e;
    }

    /* renamed from: e */
    public final Map<String, String> mo158907e() {
        return this.f113666f;
    }

    /* renamed from: f */
    public final Map<String, String> mo158909f() {
        return this.f113667g;
    }

    /* renamed from: a */
    public final void mo158903a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f113661a = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.chatter.ChatChatter> */
    /* JADX WARN: Multi-variable type inference failed */
    public GroupManageChatChatterResponse(int i, boolean z, String str, List<? extends ChatChatter> list, Map<String, String> map, Map<String, String> map2) {
        Intrinsics.checkParameterIsNotNull(list, "chatChatters");
        this.f113662b = i;
        this.f113663c = z;
        this.f113664d = str;
        this.f113665e = list;
        this.f113666f = map;
        this.f113667g = map2;
    }
}
