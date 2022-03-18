package com.ss.android.lark.threadwindow.model.patch;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/threadwindow/model/patch/ReactionItemPatch2;", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "reactions", "", "Lcom/ss/android/lark/chat/entity/reaction/ReactionInfo;", "(Ljava/util/List;)V", "mReactions", "doUpdateIfExist", "existedItem", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.a.d.d */
public final class ReactionItemPatch2 extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

    /* renamed from: a */
    private final List<ReactionInfo> f138552a;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.lark.chat.entity.reaction.ReactionInfo> */
    /* JADX WARN: Multi-variable type inference failed */
    public ReactionItemPatch2(List<? extends ReactionInfo> list) {
        Intrinsics.checkParameterIsNotNull(list, "reactions");
        this.f138552a = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
        aVar.setReactionInfoList(this.f138552a);
        return aVar;
    }
}
