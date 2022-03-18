package com.ss.android.lark.chat.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.image.ImageSet;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.MessageUrlPreview;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.entity.reaction.ReactionInfo;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.vo.AbsMessageVO;
import com.ss.android.lark.chat.vo.ChatMessageVO;
import com.ss.android.lark.doc.entity.DocCard;
import com.ss.android.lark.doc.entity.DocPermission;
import com.ss.android.lark.doc.entity.DocResult;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.chat.utils.r */
public class C34352r {
    /* renamed from: a */
    public static boolean m133232a(DocResult docResult, boolean z) {
        if (docResult == null || docResult.getDocCard() == null || docResult.getDoc() == null) {
            return false;
        }
        if (docResult.getDocCard().getUserPermission().getPermCode() == -1) {
            m133226a(docResult.getDocCard(), z);
        }
        DocCard docCard = docResult.getDocCard();
        if (!z || docCard.isShouldRender() || docCard.getShareStatus() > 1 || docCard.getPermissions().size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m133233a(boolean z, Message.Type type, boolean z2, boolean z3) {
        return !z && !z2 && !z3 && type != Message.Type.UNKNOWN;
    }

    /* renamed from: a */
    public static boolean m133228a() {
        return C29990c.m110930b().mo134596x().mo134465b();
    }

    /* renamed from: a */
    public static boolean m133229a(AbsMessageVO aVar) {
        if (aVar != null && (aVar instanceof ChatMessageVO) && !((ChatMessageVO) aVar).af()) {
            return m133231a(aVar.mo121699g().mo126168z());
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m133235b(MessageInfo messageInfo) {
        if (messageInfo != null && !CollectionUtils.isEmpty(messageInfo.getReactionInfoList())) {
            for (ReactionInfo reactionInfo : messageInfo.getReactionInfoList()) {
                if (reactionInfo.getReaction().getCount() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m133236c(Message message) {
        if (message.getType() == Message.Type.TEXT) {
            return ((TextContent) message.getContent()).getText();
        }
        if (message.getType() == Message.Type.POST) {
            return ((PostContent) message.getContent()).getText();
        }
        return "";
    }

    /* renamed from: d */
    public static MessageIdentity m133237d(Message message) {
        MessageIdentity messageIdentity = new MessageIdentity(message.getId(), message.getChatId(), message.getSourceId(), message.getSourceType());
        messageIdentity.setHideStickerSave(true);
        if (message.isPreMessage()) {
            messageIdentity.setHideEditor(true);
            messageIdentity.setHideForward(true);
            messageIdentity.setHideJumpChat(true);
            messageIdentity.setHideSaveToDriver(true);
        } else if (message.getType() == Message.Type.IMAGE) {
            messageIdentity.setHideStickerSave(false);
        }
        return messageIdentity;
    }

    /* renamed from: a */
    public static MessageUrlPreview m133224a(MessageInfo messageInfo) {
        boolean z;
        List<MessageUrlPreview> list;
        Message message = messageInfo.getMessage();
        if (message.getStatus() == Message.Status.DELETED) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (message.getType() == Message.Type.TEXT) {
                list = ((TextContent) message.getContent()).getUrlPreviewList();
            } else if (message.getType() == Message.Type.POST) {
                list = ((PostContent) message.getContent()).getUrlPreviewList();
            } else {
                list = null;
            }
            if (list != null && list.size() == 1 && !list.get(0).isDeleted() && !TextUtils.isEmpty(list.get(0).getTitle())) {
                return list.get(0);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static DocResult m133234b(Message message) {
        if (message.getType() == Message.Type.TEXT) {
            TextContent textContent = (TextContent) message.getContent();
            if (textContent.getDocResult() == null || textContent.getDocResult().getDoc() == null) {
                return null;
            }
            return textContent.getDocResult();
        } else if (message.getType() != Message.Type.POST) {
            return null;
        } else {
            PostContent postContent = (PostContent) message.getContent();
            if (postContent.getDocResult() == null || postContent.getDocResult().getDoc() == null) {
                return null;
            }
            return postContent.getDocResult();
        }
    }

    /* renamed from: a */
    public static boolean m133230a(Message message) {
        if (m133234b(message) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m133231a(Content content) {
        if (!(content instanceof CardContent)) {
            return false;
        }
        CardContent cardContent = (CardContent) content;
        if (cardContent.getExtraInfo() == null) {
            return false;
        }
        String analyticsData = cardContent.getExtraInfo().getAnalyticsData();
        if (TextUtils.isEmpty(analyticsData)) {
            return false;
        }
        try {
            if ("email_share_card".equals(new JSONObject(analyticsData).get("card_type"))) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m133226a(DocCard docCard, boolean z) {
        docCard.getUserPermission().setPermCode(0);
        for (int i = 0; i < docCard.getPermissions().size(); i++) {
            DocPermission docPermission = docCard.getPermissions().get(i);
            if (docPermission.canEdit()) {
                docCard.getUserPermission().setEdit(true);
            }
            if (docPermission.canRead()) {
                docCard.getUserPermission().setRead(true);
            }
            docCard.getUserPermission().setShare(z);
        }
    }

    /* renamed from: a */
    private static List<ImageSet> m133225a(Content content, Message message, boolean z) {
        if (content == null) {
            content = message.getContent();
        }
        List<ImageSet> a = C34353s.m133243a(((PostContent) content).getRichText(), message.isFromMe());
        for (ImageSet imageSet : a) {
            if (imageSet != null) {
                imageSet.setMessageIdentity(m133237d(message));
                imageSet.setTranslated(z);
            }
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m133227a(java.lang.String r6, boolean r7, java.util.List<com.ss.android.lark.chat.entity.message.MessageInfo> r8, java.util.List<com.ss.android.lark.chat.entity.image.ImageSet> r9) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.chat.utils.C34352r.m133227a(java.lang.String, boolean, java.util.List, java.util.List):void");
    }
}
