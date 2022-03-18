package com.ss.android.lark.parser.internal;

import android.util.Pair;
import com.bytedance.lark.pb.basic.v1.PickEntities;
import com.ss.android.lark.chat.entity.chat.PickChatEntity;
import com.ss.android.lark.pb.chats.PickEntities;
import com.ss.android.lark.pb.chats.PickType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0004H\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/parser/internal/ModelParserPickChatEntity;", "", "()V", "filterChatters", "", "", "sourcePickEntities", "", "Lcom/ss/android/lark/chat/entity/chat/PickChatEntity;", "getServerPickTypeFromValue", "Lcom/ss/android/lark/pb/chats/PickType;", "value", "", "(Ljava/lang/Integer;)Lcom/ss/android/lark/pb/chats/PickType;", "getTypeFromValue", "Lcom/bytedance/lark/pb/basic/v1/PickEntities$PickType;", "(Ljava/lang/Integer;)Lcom/bytedance/lark/pb/basic/v1/PickEntities$PickType;", "parseFromPickChatEntities", "Lcom/bytedance/lark/pb/basic/v1/PickEntities;", "parseFromPickChatServerEntities", "Lcom/ss/android/lark/pb/chats/PickEntities;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.u.a.m */
public final class ModelParserPickChatEntity {

    /* renamed from: a */
    public static final ModelParserPickChatEntity f141183a = new ModelParserPickChatEntity();

    private ModelParserPickChatEntity() {
    }

    /* renamed from: a */
    private final PickEntities.PickType m222169a(Integer num) {
        if (num != null && num.intValue() == 2) {
            return PickEntities.PickType.CHAT;
        }
        if (num != null && num.intValue() == 1) {
            return PickEntities.PickType.USER;
        }
        if (num != null && num.intValue() == 3) {
            return PickEntities.PickType.DEPT;
        }
        return PickEntities.PickType.UNKNOWN;
    }

    /* renamed from: b */
    private final PickType m222172b(Integer num) {
        if (num != null && num.intValue() == 2) {
            return PickType.CHAT;
        }
        if (num != null && num.intValue() == 1) {
            return PickType.USER;
        }
        if (num != null && num.intValue() == 3) {
            return PickType.DEPT;
        }
        return PickType.UNKNOWN;
    }

    @JvmStatic
    /* renamed from: b */
    public static final List<String> m222173b(Collection<? extends PickChatEntity> collection) {
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
    /* renamed from: a */
    public static final List<PickEntities> m222170a(Collection<? extends PickChatEntity> collection) {
        Intrinsics.checkParameterIsNotNull(collection, "sourcePickEntities");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PickChatEntity pickChatEntity : collection) {
            PickEntities.PickType a = f141183a.m222169a(Integer.valueOf(pickChatEntity.mo124689a()));
            Pair pair = (Pair) linkedHashMap.get(a);
            if (pair == null) {
                Pair pair2 = new Pair(new ArrayList(), new PickEntities.C15113a().mo55121a(a));
                linkedHashMap.put(a, pair2);
                pair = pair2;
            }
            List list = (List) pair.first;
            String b = pickChatEntity.mo124690b();
            if (b == null) {
                b = "";
            }
            list.add(b);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values().size());
        for (Pair pair3 : linkedHashMap.values()) {
            PickEntities.C15113a aVar = (PickEntities.C15113a) pair3.second;
            aVar.mo55122a((List) pair3.first);
            PickEntities a2 = aVar.build();
            Intrinsics.checkExpressionValueIsNotNull(a2, "builder.build()");
            arrayList.add(a2);
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<com.ss.android.lark.pb.chats.PickEntities> m222171a(List<? extends PickChatEntity> list) {
        Intrinsics.checkParameterIsNotNull(list, "sourcePickEntities");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (PickChatEntity pickChatEntity : list) {
            PickType b = f141183a.m222172b(Integer.valueOf(pickChatEntity.mo124689a()));
            Pair pair = (Pair) linkedHashMap.get(b);
            if (pair == null) {
                Pair pair2 = new Pair(new ArrayList(), new PickEntities.C49582a().mo172879a(b));
                linkedHashMap.put(b, pair2);
                pair = pair2;
            }
            List list2 = (List) pair.first;
            String b2 = pickChatEntity.mo124690b();
            if (b2 == null) {
                b2 = "";
            }
            list2.add(b2);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.values().size());
        for (Pair pair3 : linkedHashMap.values()) {
            PickEntities.C49582a aVar = (PickEntities.C49582a) pair3.second;
            aVar.mo172880a((List) pair3.first);
            com.ss.android.lark.pb.chats.PickEntities a = aVar.build();
            Intrinsics.checkExpressionValueIsNotNull(a, "builder.build()");
            arrayList.add(a);
        }
        return arrayList;
    }
}
