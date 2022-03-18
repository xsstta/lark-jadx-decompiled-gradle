package com.ss.android.lark.biz.im.sdk.util;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO;
import com.ss.android.lark.chat.base.view.vo.message.PostContentVO;
import com.ss.android.lark.chat.base.view.vo.message.TranslatableContentVO;
import com.ss.android.lark.chat.entity.message.content.AudioContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.vo.ContentVO;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.widget.richtext.C59035h;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0016\u0010\f\u001a\u0004\u0018\u00010\u00042\f\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/biz/im/sdk/util/MessageUtil;", "", "()V", "extractDigestFromContent", "", "context", "Landroid/content/Context;", "content", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "extractDigestPostContent", "postContentVO", "Lcom/ss/android/lark/chat/base/view/vo/message/PostContentVO;", "getPartiallySelectedText", "messageVO", "Lcom/ss/android/lark/chat/vo/AbsMessageVO;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.biz.im.a.a.a */
public final class MessageUtil {

    /* renamed from: a */
    public static final MessageUtil f74026a = new MessageUtil();

    private MessageUtil() {
    }

    /* renamed from: a */
    public final String mo105909a(AbsMessageVO<?> aVar) {
        boolean z;
        if (aVar == null) {
            return null;
        }
        ContentVO g = aVar.mo121699g();
        if (!(g instanceof BaseTextContentVO)) {
            return null;
        }
        BaseTextContentVO baseTextContentVO = (BaseTextContentVO) g;
        CharSequence g2 = baseTextContentVO.mo121788g();
        if (!baseTextContentVO.mo121789h() || !(baseTextContentVO.mo121930y() instanceof BaseTextContentVO)) {
            Layout j = baseTextContentVO.mo121790j();
            if (j != null) {
                r3 = j.getText().toString();
            }
        } else {
            TranslatableContentVO y = baseTextContentVO.mo121930y();
            if (y != null) {
                Layout j2 = ((BaseTextContentVO) y).mo121790j();
                if (j2 != null) {
                    r3 = j2.getText().toString();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.base.view.vo.message.BaseTextContentVO<*>");
            }
        }
        if (TextUtils.equals(r3, g2) || TextUtils.isEmpty(g2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z || g2 == null) {
            return null;
        }
        return g2.toString();
    }

    /* renamed from: a */
    private final String m109256a(Context context, PostContentVO iVar) {
        String obj = C59035h.m229204a(iVar.mo121772a(), false, false, true, false, false, true).toString();
        if (TextUtils.isEmpty(iVar.mo121877a(context))) {
            return obj;
        }
        return iVar.mo121877a(context) + '\n' + obj;
    }

    /* renamed from: a */
    public final String mo105908a(Context context, Content content) {
        boolean z;
        String obj;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(content, "content");
        if (content instanceof TextContent) {
            CharSequence a = C59035h.m229204a(((TextContent) content).getRichText(), false, false, true, false, false, true);
            if (a == null || (obj = a.toString()) == null) {
                return "";
            }
            return obj;
        } else if (content instanceof PostContent) {
            return m109256a(context, new PostContentVO((PostContent) content));
        } else {
            if (!(content instanceof AudioContent)) {
                return "";
            }
            AudioContent audioContent = (AudioContent) content;
            String recognizedText = audioContent.getRecognizedText();
            if (recognizedText == null || recognizedText.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return "";
            }
            String recognizedText2 = audioContent.getRecognizedText();
            if (recognizedText2 != null) {
                return recognizedText2;
            }
            Intrinsics.throwNpe();
            return recognizedText2;
        }
    }
}
