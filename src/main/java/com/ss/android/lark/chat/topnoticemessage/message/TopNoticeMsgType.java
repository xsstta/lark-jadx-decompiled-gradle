package com.ss.android.lark.chat.topnoticemessage.message;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.CardContent;
import com.ss.android.lark.chat.entity.message.content.PostContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u001b\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "", "iconResId", "", "iconTintColorRes", "(Ljava/lang/String;III)V", "getIconResId", "()I", "getIconTintColorRes", "Text", "Announcement", "Calendar", "VideoChat", "Todo", "Mail", "File", "Folder", "Vote", "Location", "ProfileCard", "GroupCard", "ChatHistory", "VoiceMessage", "LuckyMoney", "ImageMessage", "StickerMessage", "VideoMessage", "Companion", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public enum TopNoticeMsgType {
    Text(R.drawable.ud_icon_chat_filled, C34328c.ud_B500),
    Announcement(R.drawable.ud_icon_announce_filled, C34328c.ud_O500),
    Calendar(R.drawable.ud_icon_calendar_filled, C34328c.ud_O500),
    VideoChat(R.drawable.ud_icon_video_filled, C34328c.ud_B500),
    Todo(R.drawable.ud_icon_tab_todo_filled, C34328c.ud_B500),
    Mail(R.drawable.ud_icon_mail_filled, C34328c.ud_B500),
    File(R.drawable.ud_icon_note_colorful, 0, 2, null),
    Folder(R.drawable.ud_icon_file_folder_colorful, 0, 2, null),
    Vote(R.drawable.ud_icon_vote_filled, C34328c.ud_B500),
    Location(R.drawable.ud_icon_local_filled, C34328c.ud_B500),
    ProfileCard(R.drawable.ud_icon_business_card_filled, C34328c.ud_B500),
    GroupCard(R.drawable.ud_icon_group_filled, C34328c.ud_B500),
    ChatHistory(R.drawable.ud_icon_chat_filled, C34328c.ud_B500),
    VoiceMessage(R.drawable.ud_icon_mic_filled, C34328c.ud_B500),
    LuckyMoney(R.drawable.ud_icon_luckmoney_filled, R.color.ud_R500),
    ImageMessage(0, 0, 3, null),
    StickerMessage(0, 0, 3, null),
    VideoMessage(0, 0, 3, null);
    
    public static final Companion Companion = new Companion(null);
    private final int iconResId;
    private final int iconTintColorRes;

    @JvmStatic
    public static final TopNoticeMsgType fromValue(Message message) {
        return Companion.mo126893a(message);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType$Companion;", "", "()V", "fromValue", "Lcom/ss/android/lark/chat/topnoticemessage/message/TopNoticeMsgType;", "message", "Lcom/ss/android/lark/chat/entity/message/Message;", "isGroupAnnouncement", "", "isVoteMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.topnoticemessage.message.TopNoticeMsgType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final boolean m133065b(Message message) {
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<Content>()");
            if (!(content instanceof PostContent) || !((PostContent) content).isGroupAnnouncement()) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final boolean m133066c(Message message) {
            if (message.getType() != Message.Type.CARD) {
                return false;
            }
            Content content = message.getContent();
            Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<CardContent>()");
            if (((CardContent) content).getType() == CardContent.Type.VOTE) {
                return true;
            }
            return false;
        }

        @JvmStatic
        /* renamed from: a */
        public final TopNoticeMsgType mo126893a(Message message) {
            Intrinsics.checkParameterIsNotNull(message, "message");
            if (message.getType() == Message.Type.TEXT) {
                return TopNoticeMsgType.Text;
            }
            if (message.getType() == Message.Type.POST) {
                return TopNoticeMsgType.Text;
            }
            Companion aVar = this;
            if (aVar.m133065b(message)) {
                return TopNoticeMsgType.Announcement;
            }
            if (message.getType() == Message.Type.GENERAL_CALENDAR) {
                return TopNoticeMsgType.Calendar;
            }
            if (message.getType() == Message.Type.SHARE_CALENDAR_EVENT) {
                return TopNoticeMsgType.Calendar;
            }
            if (message.getType() == Message.Type.CALENDAR) {
                return TopNoticeMsgType.Calendar;
            }
            if (message.getType() == Message.Type.VIDEO_CHAT) {
                return TopNoticeMsgType.VideoChat;
            }
            if (message.getType() == Message.Type.TODO) {
                return TopNoticeMsgType.Todo;
            }
            if (message.getType() == Message.Type.EMAIL) {
                return TopNoticeMsgType.Mail;
            }
            if (message.getType() == Message.Type.FILE) {
                return TopNoticeMsgType.File;
            }
            if (message.getType() == Message.Type.FOLDER) {
                return TopNoticeMsgType.File;
            }
            if (aVar.m133066c(message)) {
                return TopNoticeMsgType.Vote;
            }
            if (message.getType() == Message.Type.LOCATION) {
                return TopNoticeMsgType.Location;
            }
            if (message.getType() == Message.Type.SHARE_USER_CARD) {
                return TopNoticeMsgType.ProfileCard;
            }
            if (message.getType() == Message.Type.SHARE_GROUP_CHAT) {
                return TopNoticeMsgType.GroupCard;
            }
            if (message.getType() == Message.Type.MERGE_FORWARD) {
                return TopNoticeMsgType.ChatHistory;
            }
            if (message.getType() == Message.Type.AUDIO) {
                return TopNoticeMsgType.VoiceMessage;
            }
            if (message.getType() == Message.Type.RED_PACKET) {
                return TopNoticeMsgType.LuckyMoney;
            }
            if (message.getType() == Message.Type.IMAGE) {
                return TopNoticeMsgType.ImageMessage;
            }
            if (message.getType() == Message.Type.STICKER) {
                return TopNoticeMsgType.StickerMessage;
            }
            if (message.getType() == Message.Type.MEDIA) {
                return TopNoticeMsgType.VideoMessage;
            }
            return TopNoticeMsgType.Text;
        }
    }

    public final int getIconResId() {
        return this.iconResId;
    }

    public final int getIconTintColorRes() {
        return this.iconTintColorRes;
    }

    private TopNoticeMsgType(int i, int i2) {
        this.iconResId = i;
        this.iconTintColorRes = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* synthetic */ TopNoticeMsgType(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
