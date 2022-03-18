package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.base.view.vo.message.TextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/TextMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/TextContentVO;", "isEnableLightText", "", "(Z)V", "()Z", "setEnableLightText", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.q */
public final class TextMsgConverter implements IMsgVOConverter<TextContentVO> {

    /* renamed from: a */
    private boolean f85503a;

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.TEXT;
    }

    public TextMsgConverter(boolean z) {
        this.f85503a = z;
    }

    /* renamed from: a */
    public final void mo122504a(boolean z) {
        this.f85503a = z;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        boolean z;
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        boolean z2 = true;
        boolean z3 = !aVar.isShowMessageOriginContent();
        if (aVar.getMessage().getTranslateDisplayRule() == 3) {
            z = true;
        } else {
            z = false;
        }
        if (z3 && !z) {
            z2 = false;
        }
        Content translateContent = aVar.getTranslateContent(z2);
        if (translateContent != null) {
            TextContent textContent = (TextContent) translateContent;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (z2) {
                str = "";
            } else {
                str = UIHelper.getString(R.string.Lark_Legacy_TranslateInChat);
            }
            spannableStringBuilder.append((CharSequence) str);
            if (textContent != null) {
                str2 = C59035h.m229213d(textContent.getRichText());
            }
            spannableStringBuilder.append(str2);
            return spannableStringBuilder;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.TextContent");
    }

    /* renamed from: a */
    public TextContentVO mo122453b(AbstractC34006a aVar) {
        TextContent textContent;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<TextContent>()");
        TextContent textContent2 = (TextContent) content;
        TextContentVO mVar = new TextContentVO(textContent2);
        List<String> readAtChatterIds = message.getReadAtChatterIds();
        Intrinsics.checkExpressionValueIsNotNull(readAtChatterIds, "message.readAtChatterIds");
        mVar.mo121782b(readAtChatterIds);
        Message message2 = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
        List<String> atBotIds = message2.getAtBotIds();
        Intrinsics.checkExpressionValueIsNotNull(atBotIds, "messageInfo.getMessage().atBotIds");
        mVar.mo121778a(atBotIds);
        DocResult docResult = textContent2.getDocResult();
        if (docResult != null) {
            mVar.mo121901a(docResult);
        }
        List<MessageUrlPreview> urlPreviewList = textContent2.getUrlPreviewList();
        if (urlPreviewList != null && urlPreviewList.size() == 1 && !urlPreviewList.get(0).isDeleted() && !TextUtils.isEmpty(urlPreviewList.get(0).getTitle())) {
            mVar.mo121899a(urlPreviewList.get(0));
        }
        Map<String, PreviewHangPoint> previewHangPoints = textContent2.getPreviewHangPoints();
        if (!CollectionUtils.isEmpty(previewHangPoints)) {
            mVar.mo121900a((PreviewHangPoint) new ArrayList(previewHangPoints.values()).get(0));
        }
        if (this.f85503a) {
            mVar.mo121775a(textContent2.getContentLayout());
        }
        mVar.mo121923e(message.getTranslateLanguage());
        mVar.mo121924e(message.isAutoTranslatedForReceiver());
        mVar.mo121920b(message.getTranslateDisplayRule());
        mVar.mo121921c(aVar.isTranslating());
        TranslateInfo translateInfo = aVar.getTranslateInfo();
        if (!(translateInfo == null || (textContent = (TextContent) translateInfo.getTranslateContent()) == null)) {
            TextContentVO mVar2 = new TextContentVO(textContent);
            mVar2.mo121923e(translateInfo.getLanguage());
            if (this.f85503a) {
                mVar2.mo121775a(textContent.getContentLayout());
            }
            mVar.mo121919a((TranslatableContentVO) mVar2);
        }
        return mVar;
    }
}
