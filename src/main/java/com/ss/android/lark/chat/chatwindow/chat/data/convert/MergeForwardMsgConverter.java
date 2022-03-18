package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.MergeForwardContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.MergeForwardContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.service.impl.C34232o;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/MergeForwardMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/MergeForwardContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.j */
public final class MergeForwardMsgConverter implements IMsgVOConverter<MergeForwardContentVO> {
    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.MERGE_FORWARD;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        String string = UIHelper.getString(R.string.Lark_Legacy_MessagePoMergeforward);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str…cy_MessagePoMergeforward)");
        return string;
    }

    /* renamed from: a */
    public MergeForwardContentVO mo122453b(AbstractC34006a aVar) {
        Content content;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content2 = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content2, "message.getContent<MergeForwardContent>()");
        MergeForwardContent mergeForwardContent = (MergeForwardContent) content2;
        MergeForwardContent mergeForwardContent2 = null;
        if (mergeForwardContent.isFromPrivateTopic()) {
            return null;
        }
        MergeForwardContentVO hVar = new MergeForwardContentVO(mergeForwardContent);
        hVar.mo121920b(message.getTranslateDisplayRule());
        hVar.mo121921c(aVar.isTranslating());
        hVar.mo121922d(message.isTranslatedManually());
        hVar.mo121923e(message.getTranslateLanguage());
        TranslateInfo translateInfo = aVar.getTranslateInfo();
        if (translateInfo != null) {
            Content translateContent = translateInfo.getTranslateContent();
            Intrinsics.checkExpressionValueIsNotNull(translateContent, "translateInfo.getTranslateContent()");
            MergeForwardContentVO hVar2 = new MergeForwardContentVO((MergeForwardContent) translateContent);
            hVar2.mo121923e(translateInfo.getLanguage());
            hVar.mo121919a((TranslatableContentVO) hVar2);
        }
        C34232o a = C34232o.m132851a();
        if (hVar.mo121814i()) {
            TranslatableContentVO y = hVar.mo121930y();
            if (y != null) {
                content = y.mo126168z();
            }
            hVar.mo121876a(a.mo121388a(mergeForwardContent2));
            return hVar;
        }
        content = hVar.mo126168z();
        mergeForwardContent2 = (MergeForwardContent) content;
        hVar.mo121876a(a.mo121388a(mergeForwardContent2));
        return hVar;
    }
}
