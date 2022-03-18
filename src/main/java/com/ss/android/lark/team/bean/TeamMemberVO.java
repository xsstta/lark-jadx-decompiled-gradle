package com.ss.android.lark.team.bean;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.TagInfo;
import com.ss.android.lark.chat.entity.chatter.TagType;
import com.ss.android.lark.team.C55356a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\u0006\u0010$\u001a\u00020\u0011J\t\u0010%\u001a\u00020\u0006HÖ\u0001R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\b¨\u0006&"}, d2 = {"Lcom/ss/android/lark/team/bean/TeamMemberVO;", "", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "(Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;)V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "avatarKey$delegate", "Lkotlin/Lazy;", "getChatter", "()Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "id", "getId", "id$delegate", "isCrossTenant", "", "()Z", "setCrossTenant", "(Z)V", "isGroupOwner", "setGroupOwner", "isInPrivateChat", "setInPrivateChat", "isTeamOwner", "setTeamOwner", "name", "getName", "name$delegate", "component1", "copy", "equals", "other", "hashCode", "", "isGroupAdmin", "toString", "im_team_team_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.team.bean.d */
public final class TeamMemberVO {

    /* renamed from: a */
    private final Lazy f136679a = LazyKt.lazy(new C55363b(this));

    /* renamed from: b */
    private final Lazy f136680b = LazyKt.lazy(new C55362a(this));

    /* renamed from: c */
    private final Lazy f136681c = LazyKt.lazy(new C55364c(this));

    /* renamed from: d */
    private boolean f136682d;

    /* renamed from: e */
    private boolean f136683e;

    /* renamed from: f */
    private boolean f136684f;

    /* renamed from: g */
    private boolean f136685g;

    /* renamed from: h */
    private final ChatChatter f136686h;

    /* renamed from: a */
    public final String mo188945a() {
        return (String) this.f136679a.getValue();
    }

    /* renamed from: b */
    public final String mo188947b() {
        return (String) this.f136680b.getValue();
    }

    /* renamed from: c */
    public final String mo188949c() {
        return (String) this.f136681c.getValue();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TeamMemberVO) && Intrinsics.areEqual(this.f136686h, ((TeamMemberVO) obj).f136686h);
        }
        return true;
    }

    public int hashCode() {
        ChatChatter chatChatter = this.f136686h;
        if (chatChatter != null) {
            return chatChatter.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "TeamMemberVO(chatter=" + this.f136686h + ")";
    }

    /* renamed from: e */
    public final boolean mo188953e() {
        return this.f136683e;
    }

    /* renamed from: f */
    public final boolean mo188955f() {
        return this.f136684f;
    }

    /* renamed from: g */
    public final boolean mo188956g() {
        return this.f136685g;
    }

    /* renamed from: i */
    public final ChatChatter mo188959i() {
        return this.f136686h;
    }

    /* renamed from: d */
    public final boolean mo188952d() {
        return this.f136682d;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.bean.d$a */
    static final class C55362a extends Lambda implements Function0<String> {
        final /* synthetic */ TeamMemberVO this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55362a(TeamMemberVO dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.mo188959i().getAvatarKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.bean.d$b */
    static final class C55363b extends Lambda implements Function0<String> {
        final /* synthetic */ TeamMemberVO this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55363b(TeamMemberVO dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.this$0.mo188959i().getId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.team.bean.d$c */
    static final class C55364c extends Lambda implements Function0<String> {
        final /* synthetic */ TeamMemberVO this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55364c(TeamMemberVO dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return C55356a.m214819a().mo144124c().mo144136a(this.this$0.mo188959i());
        }
    }

    /* renamed from: h */
    public final boolean mo188957h() {
        for (TagInfo tagInfo : this.f136686h.getTagInfos()) {
            if (tagInfo.getType() == TagType.ADMIN_USER) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo188946a(boolean z) {
        this.f136682d = z;
    }

    /* renamed from: b */
    public final void mo188948b(boolean z) {
        this.f136683e = z;
    }

    /* renamed from: c */
    public final void mo188950c(boolean z) {
        this.f136684f = z;
    }

    /* renamed from: d */
    public final void mo188951d(boolean z) {
        this.f136685g = z;
    }

    public TeamMemberVO(ChatChatter chatChatter) {
        Intrinsics.checkParameterIsNotNull(chatChatter, "chatter");
        this.f136686h = chatChatter;
    }
}
