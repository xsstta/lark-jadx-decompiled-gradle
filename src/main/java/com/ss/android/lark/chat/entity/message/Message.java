package com.ss.android.lark.chat.entity.message;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.ImageTranslationAbility;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.chat.entity.message.content.FileContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import com.ss.android.lark.chat.export.entity.message.OpenMessage;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Message implements AbstractC26248b<Message>, OpenMessage, Serializable, Cloneable, Comparable<Message> {
    private static final long serialVersionUID = -2587494770206633286L;
    private final List<String> atBotIds = new ArrayList();
    private int badgeCount;
    private int burnLife = -1;
    private long burnTime;
    private String cId;
    private Channel channel;
    private String chatId;
    private long createTime;
    private String cryptoToken = null;
    private FileDeletedStatus fileDeletedStatus = FileDeletedStatus.NORMAL;
    private String fromId;
    private FromType fromType;
    private String id;
    private Map<String, ImageTranslationAbility> imageTranslationAbility;
    private boolean isAtAll;
    private boolean isAtMe;
    private boolean isAutoTranslatedForReceiver;
    private boolean isBadged;
    private boolean isBurned;
    private boolean isCryptoIntermediate;
    private boolean isDing;
    private boolean isEphemeral;
    private boolean isForwardFromFriend;
    private boolean isFromMe;
    private boolean isNoTraceDelete;
    private boolean isNotified;
    private boolean isOtherAtMe;
    private boolean isReEditable;
    private boolean isRemoved;
    private boolean isShared;
    private boolean isSourceFileDelete;
    private boolean isStaticResourceMessageRecalled;
    private boolean isSyncMsgDep;
    private boolean isTranslatedManually;
    private boolean isUntranslatable;
    private boolean isVisible = true;
    private int mMeReadType;
    private Content messageContent;
    private String messageLanguage;
    private int originBadgeCount;
    private String originalSenderId = "";
    private String parentId;
    private String parentSourceId;
    private int position;
    private String postDraftId;
    private List<String> readAtChatterIds = new ArrayList();
    private int readCount;
    private String recallerId;
    private RecallerIdentity recallerIdentity;
    private int replyCount;
    private String rootId;
    private SendStatus sendStatus = SendStatus.SUCCESS;
    private String sourceId;
    private SourceType sourceType;
    private Status status;
    private String textDraftId;
    private int threadBadgeCount;
    private String threadId;
    private int threadPosition;
    private int translateDisplayRule;
    private String translateLanguage;
    private Type type;
    private int unReadCount;
    private long updateTime;

    /* renamed from: com.ss.android.lark.chat.entity.message.Message$a */
    public static class C34004a {

        /* renamed from: a */
        public String f87839a;

        /* renamed from: b */
        public Long f87840b;
    }

    public enum FileDeletedStatus {
        NORMAL(0),
        RECOVERABLE(1),
        UNRECOVERABLE(2),
        RECALLED(3);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static FileDeletedStatus fromValue(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return RECOVERABLE;
            }
            if (i == 2) {
                return UNRECOVERABLE;
            }
            if (i != 3) {
                return null;
            }
            return RECALLED;
        }

        private FileDeletedStatus(int i) {
            this.value = i;
        }
    }

    public enum FromType {
        USER(1),
        BOT(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static FromType valueOf(int i) {
            return forNumber(i);
        }

        public static FromType forNumber(int i) {
            if (i == 1) {
                return USER;
            }
            if (i != 2) {
                return null;
            }
            return BOT;
        }

        private FromType(int i) {
            this.value = i;
        }
    }

    public enum RecallerIdentity {
        UNKNOWN_IDENTITY(0),
        OWNER(1),
        ADMINISTRATOR(2),
        GROUP_ADMIN(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static RecallerIdentity valueOf(int i) {
            return forNumber(i);
        }

        public static RecallerIdentity forNumber(int i) {
            if (i == 0) {
                return UNKNOWN_IDENTITY;
            }
            if (i == 1) {
                return OWNER;
            }
            if (i == 2) {
                return ADMINISTRATOR;
            }
            if (i != 3) {
                return UNKNOWN_IDENTITY;
            }
            return GROUP_ADMIN;
        }

        private RecallerIdentity(int i) {
            this.value = i;
        }
    }

    public enum SourceType {
        TYPE_FROM_UNKONWN(0),
        TYPE_FROM_MESSAGE(1),
        TYPE_FROM_MERGEFORWARD(2),
        TYPE_FROM_FAVORITE(3),
        TYPE_FROM_TODO_REFER_RESOURCE(4),
        TYPE_FROM_CHAT_PIN(5),
        TYPE_FROM_CHAT_HISTORY(6);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static SourceType valueOf(int i) {
            return forNumber(i);
        }

        private static SourceType forNumber(int i) {
            switch (i) {
                case 0:
                    return TYPE_FROM_UNKONWN;
                case 1:
                    return TYPE_FROM_MESSAGE;
                case 2:
                    return TYPE_FROM_MERGEFORWARD;
                case 3:
                    return TYPE_FROM_FAVORITE;
                case 4:
                    return TYPE_FROM_TODO_REFER_RESOURCE;
                case 5:
                    return TYPE_FROM_CHAT_PIN;
                case 6:
                    return TYPE_FROM_CHAT_HISTORY;
                default:
                    return TYPE_FROM_UNKONWN;
            }
        }

        private SourceType(int i) {
            this.value = i;
        }
    }

    public enum Status {
        NORMAL(1),
        DELETED(2),
        MODIFIED(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 1) {
                return NORMAL;
            }
            if (i == 2) {
                return DELETED;
            }
            if (i != 3) {
                return null;
            }
            return MODIFIED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN(-1),
        TEXT_IMAGE(1),
        POST(2),
        FILE(3),
        TEXT(4),
        IMAGE(5),
        SYSTEM(6),
        AUDIO(7),
        EMAIL(8),
        SHARE_GROUP_CHAT(9),
        STICKER(10),
        MERGE_FORWARD(11),
        CALENDAR(12),
        CARD(13),
        MEDIA(15),
        SHARE_CALENDAR_EVENT(16),
        RED_PACKET(17),
        GENERAL_CALENDAR(18),
        VIDEO_CHAT(19),
        LOCATION(20),
        COMMERCIALIZED_HONGBAO(22),
        SHARE_USER_CARD(23),
        TODO(24),
        FOLDER(25);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            switch (i) {
                case 1:
                    return TEXT_IMAGE;
                case 2:
                    return POST;
                case 3:
                    return FILE;
                case 4:
                    return TEXT;
                case 5:
                    return IMAGE;
                case 6:
                    return SYSTEM;
                case 7:
                    return AUDIO;
                case 8:
                    return EMAIL;
                case 9:
                    return SHARE_GROUP_CHAT;
                case 10:
                    return STICKER;
                case 11:
                    return MERGE_FORWARD;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return CALENDAR;
                case 13:
                    return CARD;
                case 14:
                case 21:
                default:
                    return UNKNOWN;
                case 15:
                    return MEDIA;
                case 16:
                    return SHARE_CALENDAR_EVENT;
                case 17:
                    return RED_PACKET;
                case 18:
                    return GENERAL_CALENDAR;
                case 19:
                    return VIDEO_CHAT;
                case 20:
                    return LOCATION;
                case 22:
                    return COMMERCIALIZED_HONGBAO;
                case 23:
                    return SHARE_USER_CARD;
                case 24:
                    return TODO;
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT:
                    return FOLDER;
            }
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public List<String> getAtBotIds() {
        return this.atBotIds;
    }

    public int getBadgeCount() {
        return this.badgeCount;
    }

    public int getBurnLife() {
        return this.burnLife;
    }

    public long getBurnTime() {
        return this.burnTime;
    }

    public Channel getChannel() {
        return this.channel;
    }

    public String getChatId() {
        return this.chatId;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessage
    public <T extends Content> T getContent() {
        return (T) this.messageContent;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getCryptoToken() {
        return this.cryptoToken;
    }

    public FileDeletedStatus getFileDeletedStatus() {
        return this.fileDeletedStatus;
    }

    public String getFromId() {
        return this.fromId;
    }

    public FromType getFromType() {
        return this.fromType;
    }

    public String getId() {
        return this.id;
    }

    public Map<String, ImageTranslationAbility> getImageTranslationAbility() {
        return this.imageTranslationAbility;
    }

    public int getMeReadType() {
        return this.mMeReadType;
    }

    public String getMessageLanguage() {
        return this.messageLanguage;
    }

    public int getOriginBadgeCount() {
        return this.originBadgeCount;
    }

    public String getOriginalSenderId() {
        return this.originalSenderId;
    }

    public String getParentId() {
        return this.parentId;
    }

    public String getParentSourceId() {
        return this.parentSourceId;
    }

    public int getPosition() {
        return this.position;
    }

    public String getPostDraftId() {
        return this.postDraftId;
    }

    public List<String> getReadAtChatterIds() {
        return this.readAtChatterIds;
    }

    public int getReadCount() {
        return this.readCount;
    }

    public String getRecallerId() {
        return this.recallerId;
    }

    public RecallerIdentity getRecallerIdentity() {
        return this.recallerIdentity;
    }

    public int getReplyCount() {
        return this.replyCount;
    }

    public String getRootId() {
        return this.rootId;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public SourceType getSourceType() {
        return this.sourceType;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTextDraftId() {
        return this.textDraftId;
    }

    public int getThreadBadgeCount() {
        return this.threadBadgeCount;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public int getThreadPosition() {
        return this.threadPosition;
    }

    @Override // com.ss.android.lark.chat.export.entity.message.OpenMessage
    public int getTranslateDisplayRule() {
        return this.translateDisplayRule;
    }

    public String getTranslateLanguage() {
        return this.translateLanguage;
    }

    public Type getType() {
        return this.type;
    }

    public int getUnReadCount() {
        return this.unReadCount;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public String getcId() {
        return this.cId;
    }

    public boolean isAtAll() {
        return this.isAtAll;
    }

    public boolean isAtMe() {
        return this.isAtMe;
    }

    public boolean isAutoTranslatedForReceiver() {
        return this.isAutoTranslatedForReceiver;
    }

    public boolean isBadged() {
        return this.isBadged;
    }

    public boolean isBurned() {
        return this.isBurned;
    }

    public boolean isCryptoIntermediate() {
        return this.isCryptoIntermediate;
    }

    public boolean isDing() {
        return this.isDing;
    }

    public boolean isEphemeral() {
        return this.isEphemeral;
    }

    public boolean isForwardFromFriend() {
        return this.isForwardFromFriend;
    }

    public boolean isFromMe() {
        return this.isFromMe;
    }

    public boolean isNoTraceDelete() {
        return this.isNoTraceDelete;
    }

    public boolean isNotified() {
        return this.isNotified;
    }

    public boolean isOtherAtMe() {
        return this.isOtherAtMe;
    }

    public boolean isRemoved() {
        return this.isRemoved;
    }

    public boolean isShared() {
        return this.isShared;
    }

    public boolean isSyncMsgDep() {
        return this.isSyncMsgDep;
    }

    public boolean isTranslatedManually() {
        return this.isTranslatedManually;
    }

    public boolean isUntranslatable() {
        return this.isUntranslatable;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public SendStatus getSendStatus() {
        SendStatus sendStatus2 = this.sendStatus;
        if (sendStatus2 != null) {
            return sendStatus2;
        }
        return SendStatus.SUCCESS;
    }

    public boolean isMeRead() {
        if (this.mMeReadType > 0) {
            return true;
        }
        return false;
    }

    public boolean isSecret() {
        if (this.burnLife > 0) {
            return true;
        }
        return false;
    }

    public boolean canShow() {
        if (this.isRemoved || !this.isVisible || this.isBurned) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public Message clone() {
        try {
            return (Message) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isPreMessage() {
        return TextUtils.equals(this.id, this.cId);
    }

    public boolean isReEditable() {
        if (getStatus() != Status.DELETED || !this.isReEditable) {
            return false;
        }
        return true;
    }

    public boolean isRecalled() {
        if (this.status == Status.DELETED) {
            return true;
        }
        return false;
    }

    public boolean isSecretEncrypted() {
        return !TextUtils.isEmpty(this.cryptoToken);
    }

    public boolean isSourceFileDelete() {
        if (this.isSourceFileDelete || this.isStaticResourceMessageRecalled) {
            return true;
        }
        return false;
    }

    public boolean isTranslatedByDisplayRule() {
        int i = this.translateDisplayRule;
        if (i == 1 || i == 0) {
            return false;
        }
        return true;
    }

    public C34004a getSendMessageParams() {
        Long fd;
        C34004a aVar = new C34004a();
        aVar.f87839a = this.id;
        Content content = this.messageContent;
        if (!(content == null || !(content instanceof FileContent) || (fd = ((FileContent) content).getFd()) == null)) {
            aVar.f87840b = fd;
        }
        return aVar;
    }

    public boolean isMessageDisable() {
        if (this.isRemoved || this.status == Status.DELETED || !this.isVisible) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.id;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        String str2 = this.chatId;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.cId;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Message{");
        sb.append("type=");
        sb.append(getType());
        sb.append(" cId=");
        sb.append(this.cId);
        sb.append(" id=");
        sb.append(this.id);
        sb.append(" cTime=");
        sb.append(this.createTime);
        sb.append(" uTime=");
        sb.append(this.updateTime);
        sb.append(" fromId=");
        sb.append(this.fromId);
        sb.append(" isFromMe");
        sb.append(this.isFromMe);
        sb.append(" position=");
        sb.append(this.position);
        sb.append(" badgeCount=");
        sb.append(this.badgeCount);
        sb.append(" status=");
        sb.append(this.status);
        sb.append(" chatId=");
        sb.append(this.chatId);
        sb.append(" parentId=");
        sb.append(this.parentId);
        sb.append(" isDing=");
        sb.append(this.isDing);
        sb.append(" isVisible=");
        sb.append(this.isVisible);
        sb.append(" isBurned=");
        sb.append(this.isBurned);
        sb.append(" meRead=");
        sb.append(this.mMeReadType);
        sb.append(" read=");
        sb.append(this.readCount);
        sb.append(" unRead=");
        sb.append(this.unReadCount);
        sb.append(" reply=");
        sb.append(this.replyCount);
        sb.append(" sendStatus=");
        sb.append(this.sendStatus);
        sb.append(" burnTime=");
        sb.append(this.burnTime);
        sb.append(" syncDependency=");
        sb.append(this.isSyncMsgDep);
        Content content = this.messageContent;
        if (content != null && !content.toString().startsWith(this.messageContent.getClass().getName())) {
            sb.append(" content=");
            sb.append(this.messageContent.toString());
        }
        sb.append("}");
        return sb.toString();
    }

    public void setAtAll(boolean z) {
        this.isAtAll = z;
    }

    public void setAtMe(boolean z) {
        this.isAtMe = z;
    }

    public void setAutoTranslatedForReceiver(boolean z) {
        this.isAutoTranslatedForReceiver = z;
    }

    public void setBadgeCount(int i) {
        this.badgeCount = i;
    }

    public void setBadged(boolean z) {
        this.isBadged = z;
    }

    public void setBurnLife(int i) {
        this.burnLife = i;
    }

    public void setBurnTime(long j) {
        this.burnTime = j;
    }

    public void setBurned(boolean z) {
        this.isBurned = z;
    }

    public void setChannel(Channel channel2) {
        this.channel = channel2;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setCryptoToken(String str) {
        this.cryptoToken = str;
    }

    public void setDing(boolean z) {
        this.isDing = z;
    }

    public void setEphemeral(boolean z) {
        this.isEphemeral = z;
    }

    public void setFileDeletedStatus(FileDeletedStatus fileDeletedStatus2) {
        this.fileDeletedStatus = fileDeletedStatus2;
    }

    public void setForwardFromFriend(boolean z) {
        this.isForwardFromFriend = z;
    }

    public void setFromId(String str) {
        this.fromId = str;
    }

    public void setFromType(FromType fromType2) {
        this.fromType = fromType2;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImageTranslationAbility(Map<String, ImageTranslationAbility> map) {
        this.imageTranslationAbility = map;
    }

    public void setIsCryptoIntermediate(boolean z) {
        this.isCryptoIntermediate = z;
    }

    public void setIsFromMe(boolean z) {
        this.isFromMe = z;
    }

    public void setIsSyncMsgDep(boolean z) {
        this.isSyncMsgDep = z;
    }

    public void setIsUnTranslatable(boolean z) {
        this.isUntranslatable = z;
    }

    public void setMeReadType(int i) {
        this.mMeReadType = i;
    }

    public void setMessageContent(Content content) {
        this.messageContent = content;
    }

    public void setMessageLanguage(String str) {
        this.messageLanguage = str;
    }

    public void setNoTraceDelete(boolean z) {
        this.isNoTraceDelete = z;
    }

    public void setNotified(boolean z) {
        this.isNotified = z;
    }

    public void setOriginBadgeCount(int i) {
        this.originBadgeCount = i;
    }

    public void setOriginalSenderId(String str) {
        this.originalSenderId = str;
    }

    public void setOtherAtMe(boolean z) {
        this.isOtherAtMe = z;
    }

    public void setParentId(String str) {
        this.parentId = str;
    }

    public void setParentSourceId(String str) {
        this.parentSourceId = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public void setPostDraftId(String str) {
        this.postDraftId = str;
    }

    public void setReEditable(boolean z) {
        this.isReEditable = z;
    }

    public void setReadAtChatterIds(List<String> list) {
        this.readAtChatterIds = list;
    }

    public void setReadCount(int i) {
        this.readCount = i;
    }

    public void setRecallerId(String str) {
        this.recallerId = str;
    }

    public void setRecallerIdentity(RecallerIdentity recallerIdentity2) {
        this.recallerIdentity = recallerIdentity2;
    }

    public void setRemoved(boolean z) {
        this.isRemoved = z;
    }

    public void setReplyCount(int i) {
        this.replyCount = i;
    }

    public void setRootId(String str) {
        this.rootId = str;
    }

    public void setSendStatus(SendStatus sendStatus2) {
        this.sendStatus = sendStatus2;
    }

    public void setShared(boolean z) {
        this.isShared = z;
    }

    public void setSourceFileDelete(boolean z) {
        this.isSourceFileDelete = z;
    }

    public void setSourceId(String str) {
        this.sourceId = str;
    }

    public void setSourceType(SourceType sourceType2) {
        this.sourceType = sourceType2;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setTextDraftId(String str) {
        this.textDraftId = str;
    }

    public void setThreadBadgeCount(int i) {
        this.threadBadgeCount = i;
    }

    public void setThreadId(String str) {
        this.threadId = str;
    }

    public void setThreadPosition(int i) {
        this.threadPosition = i;
    }

    public void setTranslateDisplayRule(int i) {
        this.translateDisplayRule = i;
    }

    public void setTranslateLanguage(String str) {
        this.translateLanguage = str;
    }

    public void setTranslatedManually(boolean z) {
        this.isTranslatedManually = z;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setUnReadCount(int i) {
        this.unReadCount = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setVisible(boolean z) {
        this.isVisible = z;
    }

    public void setcId(String str) {
        this.cId = str;
    }

    public void setAtBotIds(List<String> list) {
        CollectionUtils.resetToList(this.atBotIds, list);
    }

    public boolean isItemSame(Message message) {
        if (this == message) {
            return true;
        }
        return this.cId.equals(message.getcId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Message message = (Message) obj;
        if (Objects.equals(this.id, message.id) && Objects.equals(this.chatId, message.chatId)) {
            return Objects.equals(this.cId, message.cId);
        }
        return false;
    }

    public boolean exactlyCompare(Message message) {
        boolean equals = equals(message);
        if (equals && !message.isRemoved() && this.mMeReadType == message.getMeReadType() && getStatus() != null && message.getStatus() != null && getStatus().getNumber() == message.getStatus().getNumber()) {
            return equals;
        }
        return false;
    }

    public int compareTo(Message message) {
        if (message != null) {
            if (getPosition() < message.getPosition()) {
                return -1;
            }
            if (getPosition() > message.getPosition()) {
                return 1;
            }
            if (getPosition() == message.getPosition()) {
                if (isPreMessage() == message.isPreMessage()) {
                    int i = (getCreateTime() > message.getCreateTime() ? 1 : (getCreateTime() == message.getCreateTime() ? 0 : -1));
                    if (i < 0) {
                        return -1;
                    }
                    if (i == 0) {
                        return 0;
                    }
                    return 1;
                } else if (isPreMessage()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }
        return 0;
    }

    public boolean isContentSame(Message message) {
        if (this.type != message.getType() || getStatus() != message.getStatus()) {
            return false;
        }
        if (this.isRemoved && message.isRemoved) {
            return true;
        }
        if (getStatus() == Status.DELETED) {
            if (this.isReEditable == message.isReEditable) {
                return true;
            }
            return false;
        } else if (getSendStatus() == message.getSendStatus() && this.readCount == message.getReadCount() && this.unReadCount == message.getUnReadCount() && this.replyCount == message.getReplyCount() && getUpdateTime() == message.getUpdateTime() && TextUtils.equals(getMessageLanguage(), message.getMessageLanguage()) && TextUtils.equals(getTranslateLanguage(), message.getTranslateLanguage()) && getTranslateDisplayRule() == message.getTranslateDisplayRule() && isAutoTranslatedForReceiver() == message.isAutoTranslatedForReceiver() && isTranslatedManually() == message.isTranslatedManually() && C26247a.m94983b(getContent(), message.getContent())) {
            return true;
        } else {
            return false;
        }
    }
}
