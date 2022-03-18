package com.ss.android.lark.chat.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.entity.message.content.FolderContent;
import com.ss.android.lark.chat.entity.message.content.LocationContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.entity.message.content.ProfileContent;
import com.ss.android.lark.chat.entity.message.content.ShareGroupChatContent;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.entity.message.content.SystemContent;
import com.ss.android.lark.chat.entity.message.content.TextContent;
import com.ss.android.lark.chat.export.entity.message.content.SystemMessageType;
import com.ss.android.lark.chat.service.impl.C34235p;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.C57814c;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;

/* renamed from: com.ss.android.lark.chat.utils.o */
public class C34349o {
    /* renamed from: a */
    public static String m133209a(SystemContent systemContent) {
        String string = UIHelper.getString(R.string.Lark_Legacy_VoIPPrefix);
        if (systemContent.getType() == SystemMessageType.USER_CALL_E2EE_VOICE_DURATION) {
            return string + systemContent.getFormattedContent();
        } else if (systemContent.getType() == SystemMessageType.USER_CALL_E2EE_VOICE_ON_CANCELL) {
            return string + UIHelper.getString(R.string.Lark_Legacy_VoIPCallCanceledByUser);
        } else if (systemContent.getType() != SystemMessageType.USER_CALL_E2EE_VOICE_ON_MISSING) {
            return "";
        } else {
            return string + UIHelper.getString(R.string.Lark_Legacy_VoIPMissedCall);
        }
    }

    /* renamed from: a */
    public static CharSequence m133206a(Message message) {
        if (message.getType() == Message.Type.CALENDAR) {
            return C29990c.m110930b().mo134517P().mo134345d(message);
        }
        return "";
    }

    /* renamed from: a */
    public static String m133208a(Context context, CardContent cardContent) {
        if (cardContent.getType() == CardContent.Type.VOTE) {
            return UIUtils.getString(context, R.string.Lark_Legacy_MessagePoCardVote);
        }
        if (cardContent.getType() == CardContent.Type.TEXT) {
            String digest = cardContent.getDigest();
            if (TextUtils.isEmpty(digest)) {
                return UIUtils.getString(context, R.string.Lark_Legacy_TextCardContentHolder);
            }
            return digest;
        } else if (cardContent.getType() == CardContent.Type.VCHAT) {
            return UIUtils.getString(context, R.string.Lark_Legacy_VchatCardContentHolder);
        } else {
            return UIUtils.getString(context, R.string.Lark_Legacy_UnknownCardContentHolder);
        }
    }

    /* renamed from: a */
    public static CharSequence m133200a(Context context, Message message, int i) {
        return m133201a(context, message, false, i);
    }

    /* renamed from: a */
    public static CharSequence m133205a(Context context, MessageInfo messageInfo, boolean z) {
        CharSequence charSequence;
        String str;
        Message message = messageInfo.getMessage();
        if (!message.isRemoved() && message.getStatus() != Message.Status.DELETED) {
            Message.Type type = message.getType();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (type == Message.Type.TEXT) {
                boolean z2 = !(!messageInfo.isShowMessageOriginContent());
                TextContent textContent = (TextContent) messageInfo.getTranslateContent(z2);
                if (z2) {
                    str = "";
                } else {
                    str = UIHelper.getString(R.string.Lark_Legacy_TranslateInChat);
                }
                spannableStringBuilder.append((CharSequence) str);
                return spannableStringBuilder.append(C59035h.m229201a(textContent.getRichText(), C57582a.m223616d(context, R.color.ud_N700)));
            } else if (type == Message.Type.POST) {
                boolean z3 = !(!messageInfo.isShowMessageOriginContent());
                PostContent postContent = (PostContent) messageInfo.getTranslateContent(z3);
                if (!z3) {
                    spannableStringBuilder.append((CharSequence) UIHelper.getString(R.string.Lark_Legacy_TranslateInChat));
                }
                if (TextUtils.isEmpty(postContent.getTitleWithFilter(context))) {
                    charSequence = C59035h.m229201a(postContent.getRichText(), C57582a.m223616d(context, R.color.ud_N700));
                } else {
                    charSequence = postContent.getTitleWithFilter(context);
                }
                spannableStringBuilder.append(charSequence);
                return spannableStringBuilder;
            }
        }
        return m133201a(context, message, z, C57582a.m223616d(context, R.color.ud_N700));
    }

    /* renamed from: a */
    public static CharSequence m133201a(Context context, Message message, boolean z, int i) {
        return m133204a(context, message, z, false, true, false, i);
    }

    /* renamed from: a */
    public static CharSequence m133202a(Context context, Message message, boolean z, boolean z2, boolean z3) {
        return m133203a(context, message, z, z2, z3, false);
    }

    /* renamed from: a */
    public static CharSequence m133207a(RichText richText, boolean z, boolean z2, boolean z3, int i) {
        return C57814c.m224346a(C59035h.m229205a(richText, false, true, z2, false, z, z3, i));
    }

    /* renamed from: a */
    public static CharSequence m133203a(Context context, Message message, boolean z, boolean z2, boolean z3, boolean z4) {
        return m133204a(context, message, z, z2, z3, z4, 0);
    }

    /* renamed from: a */
    public static CharSequence m133204a(Context context, Message message, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        if (message.isRemoved()) {
            return UIHelper.getString(R.string.Lark_Legacy_MessageRemove);
        }
        if (message.getStatus() == Message.Status.DELETED) {
            return UIUtils.getString(context, R.string.Lark_Legacy_MessageIsrecalled);
        }
        Message.Type type = message.getType();
        if (type == Message.Type.TEXT) {
            return m133207a(((TextContent) message.getContent()).getRichText(), z2, z3, z4, i);
        }
        if (type == Message.Type.IMAGE) {
            return UIUtils.getString(context, R.string.Lark_Legacy_ImageSummarize);
        }
        if (type == Message.Type.MEDIA) {
            return UIUtils.getString(context, R.string.Lark_Legacy_MessagePoVideo);
        }
        if (type == Message.Type.POST) {
            PostContent postContent = (PostContent) message.getContent();
            if (!TextUtils.isEmpty(message.getRootId()) || TextUtils.isEmpty(postContent.getTitleWithFilter(context))) {
                return m133207a(postContent.getRichText(), z2, z3, z4, i);
            }
            return postContent.getTitleWithFilter(context);
        } else if (type == Message.Type.FILE) {
            return UIUtils.getString(context, R.string.Lark_Legacy_FileHolder) + ((FileContent) message.getContent()).getName();
        } else if (type == Message.Type.AUDIO) {
            return UIUtils.getString(context, R.string.Lark_Legacy_AudioHolder);
        } else {
            if (type == Message.Type.CARD) {
                return m133208a(context, (CardContent) message.getContent());
            }
            if (type == Message.Type.STICKER) {
                return C34343i.m133180a((StickerContent) message.getContent());
            }
            if (type == Message.Type.RED_PACKET) {
                return UIUtils.getString(context, R.string.Lark_Legacy_RedPacketHolder);
            }
            if (type == Message.Type.SHARE_GROUP_CHAT) {
                ShareGroupChatContent shareGroupChatContent = (ShareGroupChatContent) message.getContent();
                if (!(shareGroupChatContent == null || shareGroupChatContent.getChat() == null)) {
                    return C34235p.m132853a().mo121392a(message);
                }
            } else if (type == Message.Type.CALENDAR) {
                return C29990c.m110930b().mo134517P().mo134338a(context, message);
            } else {
                if (type == Message.Type.SYSTEM) {
                    SystemContent systemContent = (SystemContent) message.getContent();
                    if (systemContent != null) {
                        if (systemContent.isVoIPSystemMessage()) {
                            return m133209a(systemContent);
                        }
                        return systemContent.getFormattedContent();
                    }
                } else if (type == Message.Type.MERGE_FORWARD) {
                    return UIHelper.getString(R.string.Lark_Legacy_MessagePoMergeforward);
                } else {
                    if (type == Message.Type.LOCATION) {
                        return UIHelper.mustacheFormat((int) R.string.Lark_Chat_MessageReplyStatusLocation, "title", ((LocationContent) message.getContent()).getName());
                    }
                    if (type == Message.Type.SHARE_USER_CARD) {
                        return UIHelper.mustacheFormat((int) R.string.Lark_Legacy_PreviewUserCard, "user_name", ((ProfileContent) message.getContent()).getDisplayName());
                    }
                    if (type == Message.Type.TODO) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(UIHelper.getString(R.string.Todo_Task_MsgTypeTask));
                        sb.append(C29990c.m110930b().mo134519R().mo134472a(message));
                        return sb;
                    } else if (type == Message.Type.VIDEO_CHAT) {
                        return C29990c.m110930b().mo134516O().mo134476a(message);
                    } else {
                        if (type == Message.Type.SHARE_CALENDAR_EVENT) {
                            return C29990c.m110930b().mo134517P().mo134344c(message);
                        }
                        if (type != Message.Type.FOLDER) {
                            return UIHelper.getString(R.string.Lark_Legacy_UnsupportedMessage);
                        }
                        return UIUtils.getString(context, R.string.Lark_Legacy_FileHolder) + ((FolderContent) message.getContent()).getName();
                    }
                }
            }
            return "";
        }
    }
}
