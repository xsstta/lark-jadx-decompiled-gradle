package com.ss.android.lark.chat.chatwindow.chat.data.convert;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.preview.PreviewHangPoint;
import com.ss.android.lark.chat.entity.translate.TranslateInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.IMsgVOConverter;
import com.ss.android.lark.chatwindow.C35247g;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.doc.entity.DocResult;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0006\"\u0004\b\u0007\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/convert/PostMsgConverter;", "Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "Lcom/ss/android/lark/chat/base/view/vo/message/PostContentVO;", "isEnableLightText", "", "(Z)V", "()Z", "setEnableLightText", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.a.k */
public final class PostMsgConverter implements IMsgVOConverter<PostContentVO> {

    /* renamed from: a */
    private boolean f85502a;

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: a */
    public Message.Type mo122452a() {
        return Message.Type.POST;
    }

    public PostMsgConverter(boolean z) {
        this.f85502a = z;
    }

    /* renamed from: a */
    public final void mo122499a(boolean z) {
        this.f85502a = z;
    }

    @Override // com.ss.android.lark.chat.vo.IMsgVOConverter
    /* renamed from: c */
    public CharSequence mo122454c(AbstractC34006a aVar) {
        boolean z;
        String str;
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
            PostContent postContent = (PostContent) translateContent;
            AbstractC36474h b = C29990c.m110930b();
            Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
            Context a = b.mo134528a();
            Intrinsics.checkExpressionValueIsNotNull(a, "context");
            if (TextUtils.isEmpty(postContent.getTitleWithFilter(a))) {
                str = C59035h.m229213d(postContent.getRichText());
            } else {
                str = postContent.getTitleWithFilter(a);
            }
            if (!z2) {
                str = UIHelper.getString(R.string.Lark_Legacy_TranslateInChat) + str;
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "digest");
            return str;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.PostContent");
    }

    /* renamed from: a */
    public PostContentVO mo122453b(AbstractC34006a aVar) {
        PostContent postContent;
        Intrinsics.checkParameterIsNotNull(aVar, "messageInfo");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "messageInfo.getMessage()");
        Content content = message.getContent();
        Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<PostContent>()");
        PostContent postContent2 = (PostContent) content;
        PostContentVO iVar = new PostContentVO(postContent2);
        Message message2 = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message2, "messageInfo.getMessage()");
        List<String> atBotIds = message2.getAtBotIds();
        Intrinsics.checkExpressionValueIsNotNull(atBotIds, "messageInfo.getMessage().atBotIds");
        iVar.mo121778a(atBotIds);
        List<String> readAtChatterIds = message.getReadAtChatterIds();
        Intrinsics.checkExpressionValueIsNotNull(readAtChatterIds, "message.readAtChatterIds");
        iVar.mo121782b(readAtChatterIds);
        DocResult docResult = postContent2.getDocResult();
        if (docResult != null) {
            iVar.mo121880a(docResult);
        }
        List<MessageUrlPreview> urlPreviewList = postContent2.getUrlPreviewList();
        if (urlPreviewList != null && urlPreviewList.size() == 1 && !urlPreviewList.get(0).isDeleted() && !TextUtils.isEmpty(urlPreviewList.get(0).getTitle())) {
            iVar.mo121878a(urlPreviewList.get(0));
        }
        Map<String, PreviewHangPoint> previewHangPoints = postContent2.getPreviewHangPoints();
        if (!CollectionUtils.isEmpty(previewHangPoints)) {
            iVar.mo121879a((PreviewHangPoint) new ArrayList(previewHangPoints.values()).get(0));
        }
        if (this.f85502a) {
            iVar.mo121775a(postContent2.getContentLayout());
        }
        Message message3 = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message3, "messageInfo.getMessage()");
        iVar.mo121923e(message3.getTranslateLanguage());
        iVar.mo121921c(aVar.isTranslating());
        iVar.mo121924e(message.isAutoTranslatedForReceiver());
        iVar.mo121920b(aVar.getMessage().getTranslateDisplayRule());
        TranslateInfo translateInfo = aVar.getTranslateInfo();
        if (!(translateInfo == null || C35247g.m137631a(postContent2) || (postContent = (PostContent) translateInfo.getTranslateContent()) == null)) {
            PostContentVO iVar2 = new PostContentVO(postContent);
            iVar2.mo121923e(translateInfo.getLanguage());
            if (this.f85502a) {
                iVar2.mo121775a(postContent.getContentLayout());
            }
            iVar.mo121919a((TranslatableContentVO) iVar2);
        }
        return iVar;
    }
}
