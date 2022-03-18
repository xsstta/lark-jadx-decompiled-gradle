package com.ss.android.lark.threadwindow.model.patch;

import com.bytedance.lark.pb.im.v1.PushMessageReadStates;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chatbase.p1688b.AbstractC34432b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/threadwindow/model/patch/ReadStatePatch2;", "Lcom/ss/android/lark/chatbase/model/PageStore$OnlyExistItemPatcher;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "()V", "mExtra", "Lcom/bytedance/lark/pb/im/v1/PushMessageReadStates$ReadStatesExtra;", "mReadState", "Lcom/bytedance/lark/pb/im/v1/PushMessageReadStates$ReadStates;", "doUpdateIfExist", "existedItem", "setExtra", "", "extra", "setReadState", "readState", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.threadwindow.a.d.e */
public final class ReadStatePatch2 extends AbstractC34432b.AbstractC34435c<AbstractC34006a> {

    /* renamed from: a */
    private PushMessageReadStates.ReadStates f138553a;

    /* renamed from: b */
    private PushMessageReadStates.ReadStatesExtra f138554b;

    /* renamed from: a */
    public final void mo191075a(PushMessageReadStates.ReadStates readStates) {
        Intrinsics.checkParameterIsNotNull(readStates, "readState");
        this.f138553a = readStates;
    }

    /* renamed from: a */
    public final void mo191076a(PushMessageReadStates.ReadStatesExtra readStatesExtra) {
        Intrinsics.checkParameterIsNotNull(readStatesExtra, "extra");
        this.f138554b = readStatesExtra;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC34006a mo122917a(AbstractC34006a aVar) {
        int i;
        Intrinsics.checkParameterIsNotNull(aVar, "existedItem");
        PushMessageReadStates.ReadStates readStates = this.f138553a;
        if (readStates != null) {
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "existedItem.getMessage()");
            Integer num = readStates.read_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.read_count");
            message.setReadCount(num.intValue());
            Message message2 = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message2, "existedItem.getMessage()");
            Integer num2 = readStates.unread_count;
            Intrinsics.checkExpressionValueIsNotNull(num2, "it.unread_count");
            message2.setUnReadCount(num2.intValue());
            Message message3 = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message3, "existedItem.getMessage()");
            message3.setReadAtChatterIds(readStates.read_at_chatter_ids);
        }
        PushMessageReadStates.ReadStatesExtra readStatesExtra = this.f138554b;
        if (readStatesExtra != null) {
            Message message4 = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message4, "existedItem.getMessage()");
            Boolean bool = readStatesExtra.me_read;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.me_read");
            if (bool.booleanValue()) {
                i = 2;
            } else {
                i = 0;
            }
            message4.setMeReadType(i);
        }
        return aVar;
    }
}
