package com.ss.android.lark.readstate.impl.detail;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntityParser;", "", "()V", "Companion", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.readstate.impl.detail.g */
public final class ReadStateEntityParser {

    /* renamed from: a */
    public static final Companion f131385a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0005¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntityParser$Companion;", "", "()V", "parseChatter", "", "Lcom/ss/android/lark/readstate/impl/detail/ReadStateEntity;", ShareHitPoint.f121869d, "", "messageType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "chatters", "", "Lcom/ss/android/lark/chat/entity/chatter/ChatChatter;", "atChatterIds", "", "", "setDataType", "", "readStateEntity", "im_readstate_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.readstate.impl.detail.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo181443a(int i, Message.Type type, C53123f fVar) {
            Intrinsics.checkParameterIsNotNull(type, "messageType");
            Intrinsics.checkParameterIsNotNull(fVar, "readStateEntity");
            fVar.f131382g = i;
            fVar.f131384i = type;
        }

        /* renamed from: a */
        public final List<C53123f> mo181442a(int i, Message.Type type, List<? extends ChatChatter> list, Set<String> set) {
            Intrinsics.checkParameterIsNotNull(type, "messageType");
            Intrinsics.checkParameterIsNotNull(list, "chatters");
            Intrinsics.checkParameterIsNotNull(set, "atChatterIds");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ChatChatter chatChatter : list) {
                boolean contains = set.contains(chatChatter.getId());
                C53123f fVar = new C53123f(chatChatter.getId());
                fVar.f131381f = chatChatter;
                fVar.f131377b = contains;
                mo181443a(i, type, fVar);
                if (contains) {
                    arrayList2.add(fVar);
                } else {
                    arrayList.add(fVar);
                }
            }
            arrayList.addAll(0, arrayList2);
            return arrayList;
        }
    }
}
