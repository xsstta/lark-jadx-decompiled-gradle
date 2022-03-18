package com.ss.android.lark.create.groupchat.impl.service;

import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.pb.chats.PickEntities;
import com.ss.android.lark.pb.chats.PickType;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J3\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0001¢\u0006\u0002\b\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0001¢\u0006\u0002\b\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0001¢\u0006\u0002\b\u0015J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0019\u001a\u00020\u0013H\u0007J\u001e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010H\u0007¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/create/groupchat/impl/service/CreateGroupChatUtils;", "", "()V", "combineEntities", "", "chatterIds", "", "", "pickEntities", "Ljava/util/LinkedHashSet;", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "Lkotlin/collections/LinkedHashSet;", "combineEntities$im_create_group_chat_release", "filterChatters", "", "sourcePickEntities", "", "filterChatters$im_create_group_chat_release", "filterNotContactMembers", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "list", "filterNotContactMembers$im_create_group_chat_release", "getServerPickEntities", "Lcom/ss/android/lark/pb/chats/PickEntities;", "parseFromSearchInfo", "info", "infos", "im_create-group-chat_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.create.groupchat.impl.a.a */
public final class CreateGroupChatUtils {

    /* renamed from: a */
    public static final CreateGroupChatUtils f93543a = new CreateGroupChatUtils();

    private CreateGroupChatUtils() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final PickChatEntity m142779a(SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, "info");
        if (searchBaseInfo instanceof SearchChatInfo) {
            return new PickChatEntity(2, searchBaseInfo.getId());
        }
        if (searchBaseInfo instanceof SearchChatterInfo) {
            return new PickChatEntity(1, searchBaseInfo.getId());
        }
        if (searchBaseInfo instanceof SearchDepartmentInfo) {
            return new PickChatEntity(3, searchBaseInfo.getId());
        }
        return null;
    }

    @JvmStatic
    /* renamed from: b */
    public static final List<PickChatEntity> m142782b(Collection<? extends SearchBaseInfo> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "infos");
        Collection<? extends SearchBaseInfo> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(m142779a((SearchBaseInfo) it.next()));
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: d */
    public static final List<PickEntities> m142784d(Collection<? extends PickChatEntity> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "pickEntities");
        Collection<? extends PickChatEntity> collection2 = collection;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection2, 10));
        for (T t : collection2) {
            arrayList.add(new PickEntities(PickType.fromValue(t.mo124689a()), CollectionsKt.listOf(t.mo124690b())));
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<String> m142780a(Collection<? extends PickChatEntity> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "sourcePickEntities");
        ArrayList<PickChatEntity> arrayList = new ArrayList();
        for (T t : collection) {
            boolean z = true;
            if (t.mo124689a() != 1) {
                z = false;
            }
            if (z) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (PickChatEntity pickChatEntity : arrayList) {
            String b = pickChatEntity.mo124690b();
            if (b != null) {
                arrayList2.add(b);
            }
        }
        return arrayList2;
    }

    @JvmStatic
    /* renamed from: c */
    public static final List<SearchBaseInfo> m142783c(Collection<? extends SearchBaseInfo> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "list");
        ArrayList arrayList = new ArrayList();
        for (T t : collection) {
            if (t instanceof SearchChatterInfo) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((SearchChatterInfo) obj).isNotContact()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m142781a(List<String> list, LinkedHashSet<PickChatEntity> linkedHashSet) {
        Intrinsics.checkParameterIsNotNull(list, "chatterIds");
        Intrinsics.checkParameterIsNotNull(linkedHashSet, "pickEntities");
        List<String> a = m142780a(linkedHashSet);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(Math.max(list.size(), a.size()));
        linkedHashSet2.addAll(list);
        linkedHashSet2.addAll(a);
        list.clear();
        list.addAll(linkedHashSet2);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new PickChatEntity(1, it.next()));
        }
        linkedHashSet.addAll(arrayList);
    }
}
