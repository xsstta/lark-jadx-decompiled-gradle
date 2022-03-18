package com.ss.android.lark.profile.message;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010&\u001a\u00020\u001cH\u0016R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118FX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0019\u0010\bR\u001b\u0010\u001b\u001a\u00020\u001c8FX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001b\u0010\u001dR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\b\"\u0004\b!\u0010\"R\u001d\u0010#\u001a\u0004\u0018\u00010\u00068FX\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\b¨\u0006'"}, d2 = {"Lcom/ss/android/lark/profile/message/ProfileContentVO;", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;", "content", "(Lcom/ss/android/lark/chat/entity/message/content/ProfileContent;)V", "avatarKey", "", "getAvatarKey", "()Ljava/lang/String;", "avatarKey$delegate", "Lkotlin/Lazy;", "chatterType", "Lcom/ss/android/lark/chat/entity/chatter/Chatter$ChatterType;", "getChatterType", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter$ChatterType;", "chatterType$delegate", "description", "Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "getDescription", "()Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "description$delegate", "displayName", "getDisplayName", "displayName$delegate", "id", "getId", "id$delegate", "isProfileEnable", "", "()Z", "isProfileEnable$delegate", "originSenderName", "getOriginSenderName", "setOriginSenderName", "(Ljava/lang/String;)V", "tenantId", "getTenantId", "tenantId$delegate", "canReply", "core_profile_profile_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.profile.message.a */
public final class ProfileContentVO extends ContentVO<ProfileContent> {

    /* renamed from: a */
    private final Lazy f130689a;

    /* renamed from: b */
    private final Lazy f130690b;

    /* renamed from: c */
    private final Lazy f130691c;

    /* renamed from: d */
    private final Lazy f130692d;

    /* renamed from: e */
    private final Lazy f130693e;

    /* renamed from: f */
    private final Lazy f130694f;

    /* renamed from: g */
    private final Lazy f130695g;

    /* renamed from: h */
    private String f130696h;

    /* renamed from: a */
    public final String mo180483a() {
        return (String) this.f130689a.getValue();
    }

    /* renamed from: b */
    public final String mo180485b() {
        return (String) this.f130690b.getValue();
    }

    /* renamed from: c */
    public final Chatter.ChatterType mo180486c() {
        return (Chatter.ChatterType) this.f130691c.getValue();
    }

    /* renamed from: d */
    public final String mo180487d() {
        return (String) this.f130692d.getValue();
    }

    /* renamed from: e */
    public final String mo180488e() {
        return this.f130696h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chatter/Chatter$ChatterType;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$b */
    static final class C52880b extends Lambda implements Function0<Chatter.ChatterType> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52880b(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Chatter.ChatterType invoke() {
            return this.$content.getChatterType();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/chat/entity/chatter/ChatterDescription;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$c */
    static final class C52881c extends Lambda implements Function0<ChatterDescription> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52881c(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ChatterDescription invoke() {
            return this.$content.getDescription();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$f */
    static final class C52884f extends Lambda implements Function0<Boolean> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52884f(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$content.isProfileEnable();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$a */
    static final class C52879a extends Lambda implements Function0<String> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52879a(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getAvatarKey();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$d */
    static final class C52882d extends Lambda implements Function0<String> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52882d(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getDisplayName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$e */
    static final class C52883e extends Lambda implements Function0<String> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52883e(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getId();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.profile.message.a$g */
    static final class C52885g extends Lambda implements Function0<String> {
        final /* synthetic */ ProfileContent $content;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52885g(ProfileContent profileContent) {
            super(0);
            this.$content = profileContent;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$content.getTenantId();
        }
    }

    /* renamed from: a */
    public final void mo180484a(String str) {
        this.f130696h = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileContentVO(ProfileContent profileContent) {
        super(profileContent);
        Intrinsics.checkParameterIsNotNull(profileContent, "content");
        this.f130689a = LazyKt.lazy(new C52883e(profileContent));
        this.f130690b = LazyKt.lazy(new C52882d(profileContent));
        this.f130691c = LazyKt.lazy(new C52880b(profileContent));
        this.f130692d = LazyKt.lazy(new C52879a(profileContent));
        this.f130693e = LazyKt.lazy(new C52881c(profileContent));
        this.f130694f = LazyKt.lazy(new C52884f(profileContent));
        this.f130695g = LazyKt.lazy(new C52885g(profileContent));
    }
}
