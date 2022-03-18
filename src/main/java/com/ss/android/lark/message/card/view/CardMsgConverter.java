package com.ss.android.lark.message.card.view;

import android.text.TextUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.entity.message.ITranslatable;
import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter;
import com.ss.android.lark.message.card.view.richtext.C45345b;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/message/card/view/CardMsgConverter;", "Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "Lcom/ss/android/lark/message/card/view/CardContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "im_messages_card-message_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.message.card.view.f */
public final class CardMsgConverter implements IOpenMsgVOConverter<CardContentVO> {
    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: a */
    public MessageType mo120418a() {
        return MessageType.CARD;
    }

    /* renamed from: a */
    public CardContentVO mo120419b(OpenMessageInfo cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        CardContent cardContent = (CardContent) cVar.getMessage().getContent();
        CardContentVO aVar = new CardContentVO(cardContent);
        if (cardContent.getType() == CardContent.Type.TEXT || cardContent.getType() == CardContent.Type.VCHAT) {
            aVar.mo160064a(C45345b.m180068a(cardContent.getRichText(), cardContent.getCardVersion()));
        }
        return aVar;
    }

    @Override // com.ss.android.lark.chat.export.vo.IOpenMsgVOConverter
    /* renamed from: c */
    public CharSequence mo120420c(OpenMessageInfo cVar) {
        int i;
        boolean z;
        Intrinsics.checkParameterIsNotNull(cVar, "messageInfo");
        CardContent cardContent = (CardContent) cVar.getMessage().getContent();
        if (cardContent.getType() == CardContent.Type.VOTE) {
            i = R.string.Lark_Legacy_VoteCardContentHolder;
        } else if (cardContent.getType() == CardContent.Type.TEXT) {
            ITranslatable aVar = (ITranslatable) cVar;
            boolean z2 = true;
            boolean z3 = !aVar.isShowMessageOriginContent();
            if (cVar.getMessage().getTranslateDisplayRule() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z3 && !z) {
                z2 = false;
            }
            Content translateContent = aVar.getTranslateContent(z2);
            if (translateContent != null) {
                String digest = ((CardContent) translateContent).getDigest();
                if (!TextUtils.isEmpty(digest)) {
                    if (!z2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(UIHelper.getString(R.string.Lark_Legacy_TranslateInChat));
                        if (digest == null) {
                            Intrinsics.throwNpe();
                        }
                        sb.append(digest);
                        digest = sb.toString();
                    }
                    return String.valueOf(digest);
                }
                i = R.string.Lark_Legacy_TextCardContentHolder;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.CardContent");
            }
        } else if (cardContent.getType() == CardContent.Type.VCHAT) {
            i = R.string.Lark_Legacy_VchatCardContentHolder;
        } else {
            i = R.string.Lark_Legacy_UnknownCardContentHolder;
        }
        String string = UIHelper.getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(strRes)");
        return string;
    }
}
