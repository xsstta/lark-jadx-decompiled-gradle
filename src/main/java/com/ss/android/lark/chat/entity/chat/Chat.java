package com.ss.android.lark.chat.entity.chat;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Tag;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import java.io.Serializable;
import java.util.List;

public class Chat implements OpenChat, Serializable {
    private static final long serialVersionUID = -4912521595824753252L;
    private AddMemberPermission addMemberPermission = AddMemberPermission.ALL_MEMBERS;
    private AtAllPermission atAllPermission = AtAllPermission.ALL_MEMBERS;
    private String avatarKey;
    private int burnLife = 30;
    private BuzzPermissionSetting buzzPermissionSetting = BuzzPermissionSetting.ALL_MEMBERS;
    private ChatAnnouncement chatAnnouncement;
    private ChatMode chatMode;
    private ChatOptionInfo chatOptionInfo;
    private boolean chatable;
    private String createTime;
    private CreateVideoConferenceSetting createVideoConferenceSetting = CreateVideoConferenceSetting.ALL_MEMBERS;
    private String description;
    private int firstMessagePosition = -1;
    private GroupMailSendPermissionType groupMailSendType = GroupMailSendPermissionType.UNKNOWN;
    private boolean hasWatermark;
    private String id;
    private boolean isAdmin;
    private boolean isAllowPost = true;
    private boolean isArchived;
    private boolean isAutoTranslate;
    private boolean isChatterReady;
    private boolean isCrossTenant;
    private boolean isCrossWithKa;
    private boolean isCustomAvatar;
    private boolean isCustomerService;
    private boolean isDeleted;
    private boolean isDissolved;
    private boolean isEdu;
    private boolean isGroupMailEnable;
    private boolean isInBox;
    private boolean isMeeting;
    private boolean isOfficialOncall;
    private boolean isOfflineOncall;
    private boolean isOnlyOwnerEditGroupInfo;
    private boolean isPublic;
    private boolean isRemind;
    private boolean isSecret;
    private boolean isShotCut;
    private boolean isShowApplyBanner;
    private boolean isSuper;
    private boolean isTeam;
    private boolean isTenant;
    private boolean is_department;
    private boolean is_public;
    private SystemMessageVisible joinMessageVisible = SystemMessageVisible.ONLY_OWNER;
    private String key;
    private String lastDraftId;
    private String lastMessageId;
    private int lastMessagePosition;
    private int lastMessagePositionBadgeCount;
    private String lastThreadId;
    private int lastThreadPosition;
    private int lastThreadPositionBadgeCount;
    private int lastVisibleMessagePosition;
    private String lastVisibleThreadId;
    private int lastVisibleThreadPosition;
    private AddMemberApply mAddMemberApply;
    private String mAnonymousId;
    private AnonymousSetting mAnonymousSetting = AnonymousSetting.INVISIBLE;
    private long mAnonymousTotalQuota;
    private MessageVisibilitySetting mMessageVisibilitySetting;
    private int memberCount;
    private MessagePosition messagePosition = MessagePosition.RECENT_LEFT;
    private String miniAvatarKey;
    private boolean muteable;
    private int myThreadsUnreadCount;
    private String name;
    private String namePinyin;
    private String onCallId;
    private String ownerId;
    private String p2pChatterId;
    private PinPermissionSetting pinPermissionSetting = PinPermissionSetting.ALL_MEMBERS;
    private String postDraftId;
    private PostType postType = PostType.ANYONE;
    private int putChatterApplyCount;
    private SystemMessageVisible quitMessageVisible = SystemMessageVisible.ONLY_OWNER;
    private int readPosition;
    private int readPositionBadgeCount;
    private int readThreadPosition;
    private int readThreadPositionBadgeCount;
    private float recentReadOffset;
    private int recentReadPosition;
    Role role = Role.IGNORE;
    private ShareCardPermission shareCardPermission = ShareCardPermission.ALLOWED;
    private List<SideBarButton> sideBarButtons;
    private String sideBarId;
    private Status status;
    private List<Tag> tags;
    private TeamChatType teamChatType;
    private long teamId;
    private String teamName;
    private String tenantId;
    private String textDraftId;
    private long threadLastTimeStamp;
    private long threadReadTimeStamp;
    private TopNoticePermissionSetting topNoticePermissionSetting = TopNoticePermissionSetting.UNKNOWN;
    private Type type;
    private long updateTime;
    private int userCount;

    public enum AddMemberApply {
        UNKNOWN(0),
        NO_APPLY(1),
        NEED_APPLY(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static AddMemberApply valueOf(int i) {
            return forNumber(i);
        }

        public static AddMemberApply forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return NO_APPLY;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return NEED_APPLY;
        }

        private AddMemberApply(int i) {
            this.value = i;
        }
    }

    public enum AddMemberPermission {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_OWNER(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static AddMemberPermission valueOf(int i) {
            return forNumber(i);
        }

        public static AddMemberPermission forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_OWNER;
        }

        private AddMemberPermission(int i) {
            this.value = i;
        }
    }

    public enum AnonymousSetting {
        UNKNOWN(0),
        INVISIBLE(1),
        NOT_ALLOWED(2),
        ALLOWED(3),
        INVISIBLE_ALLOWED(100);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public String getDisplay() {
            return toString();
        }

        public static AnonymousSetting valueOf(int i) {
            return forNumber(i);
        }

        public static AnonymousSetting forNumber(int i) {
            AnonymousSetting[] values = values();
            for (AnonymousSetting anonymousSetting : values) {
                if (anonymousSetting.getNumber() == i) {
                    return anonymousSetting;
                }
            }
            return UNKNOWN;
        }

        private AnonymousSetting(int i) {
            this.value = i;
        }
    }

    public enum AtAllPermission {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_OWNER(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static AtAllPermission valueOf(int i) {
            return forNumber(i);
        }

        public static AtAllPermission forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_OWNER;
        }

        private AtAllPermission(int i) {
            this.value = i;
        }
    }

    public enum BuzzPermissionSetting {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_MANAGER(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static BuzzPermissionSetting valueOf(int i) {
            return forNumber(i);
        }

        public static BuzzPermissionSetting forNumber(int i) {
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_MANAGER;
        }

        private BuzzPermissionSetting(int i) {
            this.value = i;
        }
    }

    public enum ChatMode {
        UNKNOWN(0),
        DEFAULT(1),
        THREAD(2),
        THREAD_V2(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static ChatMode valueOf(int i) {
            return forNumber(i);
        }

        public static ChatMode forNumber(int i) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return THREAD;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return THREAD_V2;
        }

        private ChatMode(int i) {
            this.value = i;
        }
    }

    public enum CreateVideoConferenceSetting {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_MANAGER(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static CreateVideoConferenceSetting valueOf(int i) {
            return forNumber(i);
        }

        public static CreateVideoConferenceSetting forNumber(int i) {
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_MANAGER;
        }

        private CreateVideoConferenceSetting(int i) {
            this.value = i;
        }
    }

    public enum GroupMailSendPermissionType {
        UNKNOWN(0),
        ONLY_ADMIN(1),
        ONLY_MEMBER(2),
        ONLY_TENANT(3),
        ANYONE(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public String getDisplay() {
            int number = getNumber();
            if (number == 1) {
                return "AdminOnly";
            }
            if (number == 2) {
                return "GroupMember";
            }
            if (number == 3) {
                return "Tenant";
            }
            if (number != 4) {
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            return "All";
        }

        public static GroupMailSendPermissionType valueOf(int i) {
            return forNumber(i);
        }

        public static GroupMailSendPermissionType forNumber(int i) {
            if (i == 1) {
                return ONLY_ADMIN;
            }
            if (i == 2) {
                return ONLY_MEMBER;
            }
            if (i == 3) {
                return ONLY_TENANT;
            }
            if (i != 4) {
                return UNKNOWN;
            }
            return ANYONE;
        }

        private GroupMailSendPermissionType(int i) {
            this.value = i;
        }
    }

    public enum MessagePosition {
        UNKNOWN(0),
        RECENT_LEFT(1),
        NEWEST_UNREAD(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static MessagePosition valueOf(int i) {
            return forNumber(i);
        }

        public static MessagePosition forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return RECENT_LEFT;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return NEWEST_UNREAD;
        }

        private MessagePosition(int i) {
            this.value = i;
        }
    }

    public enum PinPermissionSetting {
        UNKNOWN(0),
        ALL_MEMBERS(1),
        ONLY_MANAGER(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static PinPermissionSetting valueOf(int i) {
            return forNumber(i);
        }

        public static PinPermissionSetting forNumber(int i) {
            if (i == 1) {
                return ALL_MEMBERS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_MANAGER;
        }

        private PinPermissionSetting(int i) {
            this.value = i;
        }
    }

    public enum PostType {
        UNKNOWN_POST_TYPE(0),
        ANYONE(1),
        ONLY_ADMIN(2),
        WHITE_LIST(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static PostType valueOf(int i) {
            return forNumber(i);
        }

        public static PostType forNumber(int i) {
            if (i == 1) {
                return ANYONE;
            }
            if (i == 2) {
                return ONLY_ADMIN;
            }
            if (i != 3) {
                return UNKNOWN_POST_TYPE;
            }
            return WHITE_LIST;
        }

        private PostType(int i) {
            this.value = i;
        }
    }

    public enum Role {
        IGNORE(0),
        MEMBER(1),
        VISITOR(2),
        THREAD_FOLLOWER(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Role valueOf(int i) {
            return forNumber(i);
        }

        public static Role forNumber(int i) {
            if (i == 0) {
                return IGNORE;
            }
            if (i == 1) {
                return MEMBER;
            }
            if (i == 2) {
                return VISITOR;
            }
            if (i != 3) {
                return IGNORE;
            }
            return THREAD_FOLLOWER;
        }

        private Role(int i) {
            this.value = i;
        }
    }

    public enum ShareCardPermission {
        UNKNOWN(0),
        ALLOWED(1),
        NOT_ALLOWED(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static ShareCardPermission valueOf(int i) {
            return forNumber(i);
        }

        public static ShareCardPermission forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ALLOWED;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return NOT_ALLOWED;
        }

        private ShareCardPermission(int i) {
            this.value = i;
        }
    }

    public enum Status {
        NORMAL(0),
        ARCHIVE(1),
        DELETED(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            if (i == 0) {
                return NORMAL;
            }
            if (i == 1) {
                return ARCHIVE;
            }
            if (i != 2) {
                return NORMAL;
            }
            return DELETED;
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public enum SystemMessageVisible {
        UNKNOWN(0),
        ONLY_OWNER(1),
        ALL_MEMBERS(2),
        NOT_ANYONE(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static SystemMessageVisible valueOf(int i) {
            return forNumber(i);
        }

        public static SystemMessageVisible forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return ONLY_OWNER;
            }
            if (i == 2) {
                return ALL_MEMBERS;
            }
            if (i != 3) {
                return UNKNOWN;
            }
            return NOT_ANYONE;
        }

        private SystemMessageVisible(int i) {
            this.value = i;
        }
    }

    public enum TopNoticePermissionSetting {
        UNKNOWN(0),
        ALL_MEMBER(1),
        ONLY_MANAGER(2);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static TopNoticePermissionSetting fromValue(int i) {
            TopNoticePermissionSetting[] values = values();
            for (TopNoticePermissionSetting topNoticePermissionSetting : values) {
                if (topNoticePermissionSetting.value == i) {
                    return topNoticePermissionSetting;
                }
            }
            return UNKNOWN;
        }

        private TopNoticePermissionSetting(int i) {
            this.value = i;
        }
    }

    public enum Type {
        UNKNOWN(0),
        P2P(1),
        GROUP(2),
        TOPIC_GROUP(3),
        THREAD_DETAIL(4);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static Type valueOf(int i) {
            return forNumber(i);
        }

        public static Type forNumber(int i) {
            if (i == 1) {
                return P2P;
            }
            if (i == 2) {
                return GROUP;
            }
            if (i == 3) {
                return TOPIC_GROUP;
            }
            if (i != 4) {
                return UNKNOWN;
            }
            return THREAD_DETAIL;
        }

        private Type(int i) {
            this.value = i;
        }
    }

    public AddMemberApply getAddMemberApply() {
        return this.mAddMemberApply;
    }

    public AddMemberPermission getAddMemberPermission() {
        return this.addMemberPermission;
    }

    public String getAnonymousId() {
        return this.mAnonymousId;
    }

    public AnonymousSetting getAnonymousSetting() {
        return this.mAnonymousSetting;
    }

    public long getAnonymousTotalQuota() {
        return this.mAnonymousTotalQuota;
    }

    public AtAllPermission getAtAllPermission() {
        return this.atAllPermission;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public String getAvatarKey() {
        return this.avatarKey;
    }

    public int getBurnLife() {
        return this.burnLife;
    }

    public BuzzPermissionSetting getBuzzPermissionSetting() {
        return this.buzzPermissionSetting;
    }

    public ChatAnnouncement getChatAnnouncement() {
        return this.chatAnnouncement;
    }

    public ChatMode getChatMode() {
        return this.chatMode;
    }

    public ChatOptionInfo getChatOptionInfo() {
        return this.chatOptionInfo;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public CreateVideoConferenceSetting getCreateVideoConferenceSetting() {
        return this.createVideoConferenceSetting;
    }

    public String getDescription() {
        return this.description;
    }

    public int getFirstMessagePosition() {
        return this.firstMessagePosition;
    }

    public GroupMailSendPermissionType getGroupMailSendType() {
        return this.groupMailSendType;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public String getId() {
        return this.id;
    }

    public SystemMessageVisible getJoinMessageVisible() {
        return this.joinMessageVisible;
    }

    public String getKey() {
        return this.key;
    }

    public String getLastDraftId() {
        return this.lastDraftId;
    }

    public String getLastMessageId() {
        return this.lastMessageId;
    }

    public int getLastMessagePosition() {
        return this.lastMessagePosition;
    }

    public int getLastMessagePositionBadgeCount() {
        return this.lastMessagePositionBadgeCount;
    }

    public String getLastThreadId() {
        return this.lastThreadId;
    }

    public int getLastThreadPosition() {
        return this.lastThreadPosition;
    }

    public int getLastThreadPositionBadgeCount() {
        return this.lastThreadPositionBadgeCount;
    }

    public int getLastVisibleMessagePosition() {
        return this.lastVisibleMessagePosition;
    }

    public String getLastVisibleThreadId() {
        return this.lastVisibleThreadId;
    }

    public int getLastVisibleThreadPosition() {
        return this.lastVisibleThreadPosition;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public MessagePosition getMessagePosition() {
        return this.messagePosition;
    }

    public MessageVisibilitySetting getMessageVisibilitySetting() {
        return this.mMessageVisibilitySetting;
    }

    public String getMiniAvatarKey() {
        return this.miniAvatarKey;
    }

    public int getMyThreadsUnreadCount() {
        return this.myThreadsUnreadCount;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public String getName() {
        return this.name;
    }

    public String getNamePinyin() {
        return this.namePinyin;
    }

    public String getOnCallId() {
        return this.onCallId;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public PinPermissionSetting getPinPermissionSetting() {
        return this.pinPermissionSetting;
    }

    public String getPostDraftId() {
        return this.postDraftId;
    }

    public PostType getPostType() {
        return this.postType;
    }

    public int getPutChatterApplyCount() {
        return this.putChatterApplyCount;
    }

    public SystemMessageVisible getQuitMessageVisible() {
        return this.quitMessageVisible;
    }

    public int getReadPosition() {
        return this.readPosition;
    }

    public int getReadPositionBadgeCount() {
        return this.readPositionBadgeCount;
    }

    public int getReadThreadPosition() {
        return this.readThreadPosition;
    }

    public int getReadThreadPositionBadgeCount() {
        return this.readThreadPositionBadgeCount;
    }

    public float getRecentReadOffset() {
        return this.recentReadOffset;
    }

    public int getRecentReadPosition() {
        return this.recentReadPosition;
    }

    public Role getRole() {
        return this.role;
    }

    public ShareCardPermission getShareCardPermission() {
        return this.shareCardPermission;
    }

    public List<SideBarButton> getSideBarButtons() {
        return this.sideBarButtons;
    }

    public String getSideBarId() {
        return this.sideBarId;
    }

    public Status getStatus() {
        return this.status;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public TeamChatType getTeamChatType() {
        return this.teamChatType;
    }

    public long getTeamId() {
        return this.teamId;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getTextDraftId() {
        return this.textDraftId;
    }

    public long getThreadLastTimeStamp() {
        return this.threadLastTimeStamp;
    }

    public long getThreadReadTimeStamp() {
        return this.threadReadTimeStamp;
    }

    public TopNoticePermissionSetting getTopNoticePermissionSetting() {
        return this.topNoticePermissionSetting;
    }

    public Type getType() {
        return this.type;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public int getUserCount() {
        return this.userCount;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isAdmin() {
        return this.isAdmin;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isAllowPost() {
        return this.isAllowPost;
    }

    public boolean isAutoTranslate() {
        return this.isAutoTranslate;
    }

    public boolean isChatable() {
        return this.chatable;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isCrossWithKa() {
        return this.isCrossWithKa;
    }

    public boolean isCustomAvatar() {
        return this.isCustomAvatar;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isCustomerService() {
        return this.isCustomerService;
    }

    public boolean isDissolved() {
        return this.isDissolved;
    }

    public boolean isEdu() {
        return this.isEdu;
    }

    public boolean isGroupMailEnable() {
        return this.isGroupMailEnable;
    }

    public boolean isHasWatermark() {
        return this.hasWatermark;
    }

    public boolean isInBox() {
        return this.isInBox;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isMeeting() {
        return this.isMeeting;
    }

    public boolean isMuteable() {
        return this.muteable;
    }

    public boolean isOfficialOncall() {
        return this.isOfficialOncall;
    }

    public boolean isOfflineOncall() {
        return this.isOfflineOncall;
    }

    public boolean isOnlyOwnerEditGroupInfo() {
        return this.isOnlyOwnerEditGroupInfo;
    }

    public boolean isPublic() {
        return this.isPublic;
    }

    public boolean isRemind() {
        return this.isRemind;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isSecret() {
        return this.isSecret;
    }

    public boolean isShotCut() {
        return this.isShotCut;
    }

    public boolean isShowApplyBanner() {
        return this.isShowApplyBanner;
    }

    public boolean isSuper() {
        return this.isSuper;
    }

    public boolean isTeam() {
        return this.isTeam;
    }

    public boolean isTenant() {
        return this.isTenant;
    }

    public boolean is_department() {
        return this.is_department;
    }

    public int getFirstUnReadMessageBadgeCount() {
        return getReadPositionBadgeCount() + 1;
    }

    public int getNewMessageCount() {
        return this.lastMessagePosition - this.readPosition;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public String getP2pChatterId() {
        String str = this.p2pChatterId;
        if (str != null) {
            return str;
        }
        return "";
    }

    public int getUnReadMessageCount() {
        return this.lastMessagePosition - this.readPosition;
    }

    public boolean canSeeHistoryMessage() {
        if (this.mMessageVisibilitySetting == MessageVisibilitySetting.ALL_MESSAGES) {
            return true;
        }
        return false;
    }

    public String getEntityId() {
        if (this.type == Type.P2P) {
            return getP2pChatterId();
        }
        return getId();
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public String getGroupOwnerId() {
        if (isP2PChat()) {
            return "";
        }
        return this.ownerId;
    }

    public int getNoBadgedNewMessageCount() {
        return getNewMessageCount() - getUnReadBadgeCount();
    }

    public int getThreadUnReadBadgeCount() {
        return Math.min(this.lastThreadPositionBadgeCount - this.readThreadPositionBadgeCount, this.lastThreadPosition - this.readThreadPosition);
    }

    public int getUnReadBadgeCount() {
        return Math.min(this.lastMessagePositionBadgeCount - this.readPositionBadgeCount, this.lastMessagePosition - this.readPosition);
    }

    public boolean isDeleted() {
        if (this.status == Status.DELETED) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isGroup() {
        if (this.type == Type.GROUP) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isMember() {
        if (this.role == Role.MEMBER) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isOnlyManagerCreateVC() {
        if (this.createVideoConferenceSetting == CreateVideoConferenceSetting.ONLY_MANAGER) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isP2PChat() {
        if (getType() == Type.P2P) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isSoloChat() {
        if (isGroup() || this.memberCount != 1) {
            return false;
        }
        return true;
    }

    public boolean isThread() {
        ChatMode chatMode2 = this.chatMode;
        if (chatMode2 == null || chatMode2 != ChatMode.THREAD_V2) {
            return false;
        }
        return true;
    }

    public boolean isAnonymousSecret() {
        if (!this.isSecret || (this.mAnonymousSetting != AnonymousSetting.ALLOWED && this.mAnonymousSetting != AnonymousSetting.INVISIBLE_ALLOWED)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.chat.export.entity.chat.OpenChat
    public boolean isOnCall() {
        if (TextUtils.isEmpty(this.onCallId) || Long.parseLong(this.onCallId) == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "Chat{id='" + this.id + '\'' + ", isSecret=" + this.isSecret + ", uCount=" + this.userCount + ", lastMsgId=" + this.lastMessageId + ", lastMsgPos=" + this.lastMessagePosition + ", lastMsgPosBgCount=" + this.lastMessagePositionBadgeCount + ", readPos=" + this.readPosition + ", readPosBgCount=" + this.readPositionBadgeCount + ", rTPos=" + this.readThreadPosition + ", lTPos=" + this.lastThreadPosition + ", rTBadge=" + this.readThreadPositionBadgeCount + ", lTBadge=" + this.lastThreadPositionBadgeCount + ", lTVisiblePos=" + this.lastVisibleThreadPosition + ", recentReadPos=" + this.recentReadPosition + ", teamId=" + this.teamId + ", teamName=" + this.teamName + '}';
    }

    public void setAddMemberApply(AddMemberApply addMemberApply) {
        this.mAddMemberApply = addMemberApply;
    }

    public void setAddMemberPermission(AddMemberPermission addMemberPermission2) {
        this.addMemberPermission = addMemberPermission2;
    }

    public void setAdmin(boolean z) {
        this.isAdmin = z;
    }

    public void setAllowPost(boolean z) {
        this.isAllowPost = z;
    }

    public void setAnonymousId(String str) {
        this.mAnonymousId = str;
    }

    public void setAnonymousSetting(AnonymousSetting anonymousSetting) {
        this.mAnonymousSetting = anonymousSetting;
    }

    public void setAnonymousTotalQuota(long j) {
        this.mAnonymousTotalQuota = j;
    }

    public void setAtAllPermission(AtAllPermission atAllPermission2) {
        this.atAllPermission = atAllPermission2;
    }

    public void setAutoTranslate(boolean z) {
        this.isAutoTranslate = z;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setBurnLife(int i) {
        this.burnLife = i;
    }

    public void setBuzzPermissionSetting(BuzzPermissionSetting buzzPermissionSetting2) {
        this.buzzPermissionSetting = buzzPermissionSetting2;
    }

    public void setChatAnnouncement(ChatAnnouncement chatAnnouncement2) {
        this.chatAnnouncement = chatAnnouncement2;
    }

    public void setChatMode(ChatMode chatMode2) {
        this.chatMode = chatMode2;
    }

    public void setChatOptionInfo(ChatOptionInfo chatOptionInfo2) {
        this.chatOptionInfo = chatOptionInfo2;
    }

    public void setChatable(boolean z) {
        this.chatable = z;
    }

    public void setCreateTime(String str) {
        this.createTime = str;
    }

    public void setCreateVideoConferenceSetting(CreateVideoConferenceSetting createVideoConferenceSetting2) {
        this.createVideoConferenceSetting = createVideoConferenceSetting2;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCrossWithKa(boolean z) {
        this.isCrossWithKa = z;
    }

    public void setCustomerService(boolean z) {
        this.isCustomerService = z;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDissolved(boolean z) {
        this.isDissolved = z;
    }

    public void setEdu(boolean z) {
        this.isEdu = z;
    }

    public void setFirstMessagePosition(int i) {
        this.firstMessagePosition = i;
    }

    public void setGroupMailEnable(boolean z) {
        this.isGroupMailEnable = z;
    }

    public void setGroupMailSendType(GroupMailSendPermissionType groupMailSendPermissionType) {
        this.groupMailSendType = groupMailSendPermissionType;
    }

    public void setHasWatermark(boolean z) {
        this.hasWatermark = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInBox(boolean z) {
        this.isInBox = z;
    }

    public void setIsCustomAvatar(boolean z) {
        this.isCustomAvatar = z;
    }

    public void setIs_department(boolean z) {
        this.is_department = z;
    }

    public void setIs_public(boolean z) {
        this.is_public = z;
    }

    public void setJoinMessageVisible(SystemMessageVisible systemMessageVisible) {
        this.joinMessageVisible = systemMessageVisible;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setLastDraftId(String str) {
        this.lastDraftId = str;
    }

    public void setLastMessageId(String str) {
        this.lastMessageId = str;
    }

    public void setLastMessagePosition(int i) {
        this.lastMessagePosition = i;
    }

    public void setLastMessagePositionBadgeCount(int i) {
        this.lastMessagePositionBadgeCount = i;
    }

    public void setLastThreadId(String str) {
        this.lastThreadId = str;
    }

    public void setLastThreadPosition(int i) {
        this.lastThreadPosition = i;
    }

    public void setLastThreadPositionBadgeCount(int i) {
        this.lastThreadPositionBadgeCount = i;
    }

    public void setLastVisibleMessagePosition(int i) {
        this.lastVisibleMessagePosition = i;
    }

    public void setLastVisibleThreadId(String str) {
        this.lastVisibleThreadId = str;
    }

    public void setLastVisibleThreadPosition(int i) {
        this.lastVisibleThreadPosition = i;
    }

    public void setMeeting(boolean z) {
        this.isMeeting = z;
    }

    public void setMemberCount(int i) {
        this.memberCount = i;
    }

    public void setMessagePosition(MessagePosition messagePosition2) {
        this.messagePosition = messagePosition2;
    }

    public void setMessageVisibilitySetting(MessageVisibilitySetting messageVisibilitySetting) {
        this.mMessageVisibilitySetting = messageVisibilitySetting;
    }

    public void setMiniAvatarKey(String str) {
        this.miniAvatarKey = str;
    }

    public void setMuteable(boolean z) {
        this.muteable = z;
    }

    public void setMyThreadsUnreadCount(int i) {
        this.myThreadsUnreadCount = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNamePinyin(String str) {
        this.namePinyin = str;
    }

    public void setOfficialOncall(boolean z) {
        this.isOfficialOncall = z;
    }

    public void setOnCallId(String str) {
        this.onCallId = str;
    }

    public void setOnlyOwnerEditGroupInfo(boolean z) {
        this.isOnlyOwnerEditGroupInfo = z;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setP2pChatterId(String str) {
        this.p2pChatterId = str;
    }

    public void setPinPermissionSetting(PinPermissionSetting pinPermissionSetting2) {
        this.pinPermissionSetting = pinPermissionSetting2;
    }

    public void setPostDraftId(String str) {
        this.postDraftId = str;
    }

    public void setPostType(PostType postType2) {
        this.postType = postType2;
    }

    public void setPublic(boolean z) {
        this.isPublic = z;
    }

    public void setPutChatterApplyCount(int i) {
        this.putChatterApplyCount = i;
    }

    public void setQuitMessageVisible(SystemMessageVisible systemMessageVisible) {
        this.quitMessageVisible = systemMessageVisible;
    }

    public void setReadPosition(int i) {
        this.readPosition = i;
    }

    public void setReadPositionBadgeCount(int i) {
        this.readPositionBadgeCount = i;
    }

    public void setReadThreadPosition(int i) {
        this.readThreadPosition = i;
    }

    public void setReadThreadPositionBadgeCount(int i) {
        this.readThreadPositionBadgeCount = i;
    }

    public void setRecentReadOffset(float f) {
        this.recentReadOffset = f;
    }

    public void setRecentReadPosition(int i) {
        this.recentReadPosition = i;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setRole(Role role2) {
        this.role = role2;
    }

    public void setSecret(boolean z) {
        this.isSecret = z;
    }

    public void setShareCardPermission(ShareCardPermission shareCardPermission2) {
        this.shareCardPermission = shareCardPermission2;
    }

    public void setShotCut(boolean z) {
        this.isShotCut = z;
    }

    public void setShowApplyBanner(boolean z) {
        this.isShowApplyBanner = z;
    }

    public void setSideBarButtons(List<SideBarButton> list) {
        this.sideBarButtons = list;
    }

    public void setSideBarId(String str) {
        this.sideBarId = str;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setSuper(boolean z) {
        this.isSuper = z;
    }

    public void setTags(List<Tag> list) {
        this.tags = list;
    }

    public void setTeam(boolean z) {
        this.isTeam = z;
    }

    public void setTeamChatType(TeamChatType teamChatType2) {
        this.teamChatType = teamChatType2;
    }

    public void setTeamId(long j) {
        this.teamId = j;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public void setTenant(boolean z) {
        this.isTenant = z;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTextDraftId(String str) {
        this.textDraftId = str;
    }

    public void setThreadLastTimeStamp(long j) {
        this.threadLastTimeStamp = j;
    }

    public void setThreadReadTimeStamp(long j) {
        this.threadReadTimeStamp = j;
    }

    public void setTopNoticePermissionSetting(TopNoticePermissionSetting topNoticePermissionSetting2) {
        this.topNoticePermissionSetting = topNoticePermissionSetting2;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUserCount(int i) {
        this.userCount = i;
    }

    public enum MessageVisibilitySetting {
        UNKNOWN(0),
        ALL_MESSAGES(1),
        ONLY_NEW_MESSAGES(2);
        
        private final int value;

        public static MessageVisibilitySetting valueOf(int i) {
            return forNumber(i);
        }

        public static MessageVisibilitySetting forNumber(int i) {
            if (i == 1) {
                return ALL_MESSAGES;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return ONLY_NEW_MESSAGES;
        }

        private MessageVisibilitySetting(int i) {
            this.value = i;
        }
    }

    public void setOfflineOncall(Boolean bool) {
        this.isOfflineOncall = bool.booleanValue();
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Chat)) {
            return false;
        }
        Chat chat = (Chat) obj;
        String str = this.id;
        if (str != null) {
            z = str.equals(chat.getId());
        } else if (chat.getId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.burnLife == chat.burnLife) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        Type type2 = this.type;
        Type type3 = chat.getType();
        if (type2 != null) {
            return type2.equals(type3);
        }
        if (type3 == null) {
            return true;
        }
        return false;
    }

    public boolean exactlyCompare(Chat chat) {
        boolean z;
        boolean z2;
        if (chat == null) {
            return false;
        }
        if (this == chat) {
            return true;
        }
        String str = this.id;
        if (str != null) {
            z = str.equals(chat.getId());
        } else if (chat.getId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (this.updateTime == chat.updateTime) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !TextUtils.equals(this.name, chat.name)) {
            return false;
        }
        Type type2 = this.type;
        Type type3 = chat.getType();
        if (type2 != null) {
            return type2.equals(type3);
        }
        if (type3 == null) {
            return true;
        }
        return false;
    }
}
