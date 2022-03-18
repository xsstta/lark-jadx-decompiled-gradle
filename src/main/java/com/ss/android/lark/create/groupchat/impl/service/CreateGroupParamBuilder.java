package com.ss.android.lark.create.groupchat.impl.service;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.bytedance.lark.pb.im.v1.CreateChatRequest;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.create.groupchat.CreateGroupChatModule;
import com.ss.android.lark.create.groupchat.dto.CreateGroupMode;
import com.ss.android.lark.create.groupchat.p1777a.AbstractC36248c;
import com.ss.android.lark.doc.entity.DocPermPair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aJ(\u0010\u000b\u001a\u00020\u00002 \u0010\u001b\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\rJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aJ\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014J\u0016\u0010\u0017\u001a\u00020\u00002\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u001aJ\u0006\u0010\u001e\u001a\u00020\u001fJ\f\u0010 \u001a\u00020!*\u00020\u000eH\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/service/CreateGroupParamBuilder;", "", "()V", "chatDependency", "Lcom/ss/android/lark/create/groupchat/dependency/ICreateGroupChatModuleDependency$IChatDependency;", "kotlin.jvm.PlatformType", "chatMode", "Lcom/ss/android/lark/chat/entity/chat/Chat$ChatMode;", "chatterIds", "", "", "docsPermissions", "", "", "Lcom/ss/android/lark/doc/entity/DocPermPair$PermType;", "fromChatId", "groupDesc", "groupName", "initMessageIds", "isCrossTenant", "", "isPublic", "isSecret", "pickChatEntities", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "", "permissions", "groupMode", "Lcom/ss/android/lark/create/groupchat/dto/CreateGroupMode;", "toRequest", "Lcom/bytedance/lark/pb/im/v1/CreateChatRequest;", "toPermission", "Lcom/bytedance/lark/pb/im/v1/CreateChatRequest$DocPermission;", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.a.d */
public final class CreateGroupParamBuilder {

    /* renamed from: a */
    private final AbstractC36248c.AbstractC36252d f93548a;

    /* renamed from: b */
    private final List<String> f93549b = new ArrayList();

    /* renamed from: c */
    private final Set<PickChatEntity> f93550c = new LinkedHashSet();

    /* renamed from: d */
    private final List<String> f93551d = new ArrayList();

    /* renamed from: e */
    private final Map<String, Map<String, DocPermPair.PermType>> f93552e = new LinkedHashMap();

    /* renamed from: f */
    private String f93553f = "";

    /* renamed from: g */
    private String f93554g = "";

    /* renamed from: h */
    private String f93555h = "";

    /* renamed from: i */
    private boolean f93556i;

    /* renamed from: j */
    private boolean f93557j;

    /* renamed from: k */
    private boolean f93558k;

    /* renamed from: l */
    private Chat.ChatMode f93559l = Chat.ChatMode.DEFAULT;

    public CreateGroupParamBuilder() {
        AbstractC36248c dependency = CreateGroupChatModule.getDependency();
        Intrinsics.checkExpressionValueIsNotNull(dependency, "CreateGroupChatModule.getDependency()");
        this.f93548a = dependency.getChatDependency();
    }

    /* renamed from: a */
    public final CreateChatRequest mo133816a() {
        List<String> mutableList = CollectionsKt.toMutableList((Collection) this.f93549b);
        LinkedHashSet linkedHashSet = new LinkedHashSet(this.f93550c);
        CreateGroupChatUtils.m142781a(mutableList, linkedHashSet);
        List<PickEntities> a = this.f93548a.mo133728a(linkedHashSet);
        Intrinsics.checkExpressionValueIsNotNull(a, "chatDependency.parseFrom…ckChatEntities(entitySet)");
        CreateChatRequest.C17340a b = new CreateChatRequest.C17340a().mo60878a(Chat.Type.GROUP).mo60882a(mutableList).mo60881a(this.f93553f).mo60886b(this.f93554g).mo60880a(Boolean.valueOf(this.f93557j)).mo60890c(a).mo60877a(Chat.ChatMode.fromValue(this.f93559l.getNumber())).mo60888c(Boolean.valueOf(this.f93558k)).mo60887b(this.f93551d).mo60889c(this.f93555h).mo60885b(Boolean.valueOf(this.f93556i));
        if (!this.f93552e.isEmpty()) {
            Map<String, Map<String, DocPermPair.PermType>> map = this.f93552e;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Map<String, DocPermPair.PermType>> entry : map.entrySet()) {
                String key = entry.getKey();
                Map<String, DocPermPair.PermType> value = entry.getValue();
                ArrayList arrayList2 = new ArrayList(value.size());
                for (Map.Entry<String, DocPermPair.PermType> entry2 : value.entrySet()) {
                    arrayList2.add(TuplesKt.to(entry2.getKey(), m142792a(entry2.getValue())));
                }
                arrayList.add(TuplesKt.to(key, new CreateChatRequest.DocPermissions.C17338a().mo60872a(MapsKt.toMap(arrayList2)).build()));
            }
            b.mo60883a(MapsKt.toMap(arrayList));
        }
        CreateChatRequest a2 = b.build();
        Intrinsics.checkExpressionValueIsNotNull(a2, "builder.build()");
        return a2;
    }

    /* renamed from: a */
    public final CreateGroupParamBuilder mo133821a(boolean z) {
        CreateGroupParamBuilder dVar = this;
        dVar.f93556i = z;
        return dVar;
    }

    /* renamed from: b */
    public final CreateGroupParamBuilder mo133824b(boolean z) {
        CreateGroupParamBuilder dVar = this;
        dVar.f93558k = z;
        return dVar;
    }

    /* renamed from: a */
    private final CreateChatRequest.DocPermission m142792a(DocPermPair.PermType permType) {
        if (permType == DocPermPair.PermType.EDIT) {
            return CreateChatRequest.DocPermission.EDIT;
        }
        return CreateChatRequest.DocPermission.READ;
    }

    /* renamed from: b */
    public final CreateGroupParamBuilder mo133822b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "groupDesc");
        CreateGroupParamBuilder dVar = this;
        dVar.f93554g = str;
        return dVar;
    }

    /* renamed from: c */
    public final CreateGroupParamBuilder mo133825c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "fromChatId");
        CreateGroupParamBuilder dVar = this;
        dVar.f93555h = str;
        return dVar;
    }

    /* renamed from: a */
    public final CreateGroupParamBuilder mo133818a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "groupName");
        CreateGroupParamBuilder dVar = this;
        dVar.f93553f = str;
        return dVar;
    }

    /* renamed from: b */
    public final CreateGroupParamBuilder mo133823b(List<String> list) {
        CreateGroupParamBuilder dVar = this;
        if (list != null) {
            dVar.f93551d.clear();
            dVar.f93551d.addAll(list);
        }
        return dVar;
    }

    /* renamed from: a */
    public final CreateGroupParamBuilder mo133817a(CreateGroupMode createGroupMode) {
        Intrinsics.checkParameterIsNotNull(createGroupMode, "groupMode");
        CreateGroupParamBuilder dVar = this;
        int i = C36267e.f93560a[createGroupMode.ordinal()];
        if (i == 1) {
            dVar.f93559l = Chat.ChatMode.DEFAULT;
        } else if (i == 2) {
            dVar.f93559l = Chat.ChatMode.THREAD_V2;
        } else if (i == 3) {
            dVar.f93559l = Chat.ChatMode.DEFAULT;
            dVar.f93557j = true;
        }
        return dVar;
    }

    /* renamed from: a */
    public final CreateGroupParamBuilder mo133819a(List<? extends PickChatEntity> list) {
        CreateGroupParamBuilder dVar = this;
        if (list != null) {
            dVar.f93550c.clear();
            dVar.f93550c.addAll(list);
        }
        return dVar;
    }

    /* renamed from: a */
    public final CreateGroupParamBuilder mo133820a(Map<String, ? extends Map<String, ? extends DocPermPair.PermType>> map) {
        CreateGroupParamBuilder dVar = this;
        if (map != null) {
            dVar.f93552e.clear();
            dVar.f93552e.putAll(map);
        }
        return dVar;
    }
}
