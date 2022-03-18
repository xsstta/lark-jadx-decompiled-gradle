package com.ss.android.lark.share_group;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/share_group/RecallItemViewData;", "", "name", "", "id", "(Ljava/lang/String;Ljava/lang/String;)V", "avatarKey", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "(Ljava/lang/String;)V", "entityId", "getEntityId", "setEntityId", "getId", "getName", "placeHolderId", "", "getPlaceHolderId", "()I", "setPlaceHolderId", "(I)V", ShareHitPoint.f121869d, "getType", "setType", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.share_group.e */
public final class RecallItemViewData {

    /* renamed from: a */
    public static final Companion f135328a = new Companion(null);

    /* renamed from: b */
    private int f135329b;

    /* renamed from: c */
    private String f135330c = "";

    /* renamed from: d */
    private int f135331d;

    /* renamed from: e */
    private String f135332e = "";

    /* renamed from: f */
    private final String f135333f;

    /* renamed from: g */
    private final String f135334g;

    @JvmStatic
    /* renamed from: a */
    public static final RecallItemViewData m212648a(Chat chat) {
        return f135328a.mo187048a(chat);
    }

    @JvmStatic
    /* renamed from: a */
    public static final RecallItemViewData m212649a(Chatter chatter) {
        return f135328a.mo187049a(chatter);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/share_group/RecallItemViewData$Companion;", "", "()V", "TYPE_CHAT", "", "TYPE_CHATTER", "TYPE_DEP", "TYPE_UNKNOWN", "parseFromChat", "Lcom/ss/android/lark/share_group/RecallItemViewData;", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "parseFromChatter", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.share_group.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final RecallItemViewData mo187048a(Chat chat) {
            Intrinsics.checkParameterIsNotNull(chat, "chat");
            RecallItemViewData eVar = new RecallItemViewData(chat.getName(), chat.getId());
            eVar.mo187039a(2);
            String avatarKey = chat.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chat.getAvatarKey()");
            eVar.mo187043b(avatarKey);
            String entityId = chat.getEntityId();
            Intrinsics.checkExpressionValueIsNotNull(entityId, "chat.entityId");
            eVar.mo187040a(entityId);
            return eVar;
        }

        @JvmStatic
        /* renamed from: a */
        public final RecallItemViewData mo187049a(Chatter chatter) {
            Intrinsics.checkParameterIsNotNull(chatter, "chatter");
            RecallItemViewData eVar = new RecallItemViewData(chatter.getLocalizedName(), chatter.getId());
            eVar.mo187039a(1);
            String avatarKey = chatter.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "chatter.getAvatarKey()");
            eVar.mo187043b(avatarKey);
            String id = chatter.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "chatter.getId()");
            eVar.mo187040a(id);
            return eVar;
        }
    }

    /* renamed from: a */
    public final int mo187038a() {
        return this.f135329b;
    }

    /* renamed from: b */
    public final String mo187041b() {
        return this.f135330c;
    }

    /* renamed from: c */
    public final int mo187044c() {
        return this.f135331d;
    }

    /* renamed from: d */
    public final String mo187045d() {
        return this.f135332e;
    }

    /* renamed from: e */
    public final String mo187046e() {
        return this.f135333f;
    }

    /* renamed from: f */
    public final String mo187047f() {
        return this.f135334g;
    }

    /* renamed from: b */
    public final void mo187042b(int i) {
        this.f135331d = i;
    }

    /* renamed from: b */
    public final void mo187043b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f135332e = str;
    }

    /* renamed from: a */
    public final void mo187039a(int i) {
        this.f135329b = i;
    }

    /* renamed from: a */
    public final void mo187040a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f135330c = str;
    }

    public RecallItemViewData(String str, String str2) {
        this.f135333f = str;
        this.f135334g = str2;
    }
}
