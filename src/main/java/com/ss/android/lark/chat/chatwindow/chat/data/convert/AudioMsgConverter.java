package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.AudioContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/AudioMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/AudioContentVO;", "()V", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.a */
public final class AudioMsgConverter implements IMsgVOConverter<AudioContentVO> {
    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.AUDIO;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        String string = UIHelper.getString(R.string.Lark_Legacy_AudioHolder);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(R.str….Lark_Legacy_AudioHolder)");
        return string;
    }

    /* renamed from: a */
    public AudioContentVO mo122453b(AbstractC34006a aVar) {
        AudioContent audioContent;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<AudioContent>()");
        AudioContent audioContent2 = (AudioContent) content;
        AudioContentVO bVar = new AudioContentVO(audioContent2);
        bVar.mo121804a(audioContent2.getLocalFilePath());
        bVar.mo121806a(audioContent2.getAudioWaveBytes());
        bVar.mo121802a(audioContent2.getProgress());
        bVar.mo121805a(message.isSourceFileDelete());
        bVar.mo121923e(message.getTranslateLanguage());
        bVar.mo121924e(message.isAutoTranslatedForReceiver());
        bVar.mo121920b(message.getTranslateDisplayRule());
        bVar.mo121921c(aVar.isTranslating());
        TranslateInfo translateInfo = aVar.getTranslateInfo();
        if (!(translateInfo == null || (audioContent = (AudioContent) translateInfo.getTranslateContent()) == null)) {
            AudioContentVO bVar2 = new AudioContentVO(audioContent);
            bVar2.mo121923e(translateInfo.getLanguage());
            bVar.mo121919a((TranslatableContentVO) bVar2);
        }
        return bVar;
    }
}
