package com.ss.android.lark.feed.app.entity;

import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.ss.android.lark.biz.im.api.MuteUrgentInfo;
import com.ss.android.lark.chat.entity.chat.TeamChatType;
import com.ss.android.lark.chat.entity.reaction.Reaction;
import com.ss.android.lark.feed.app.filter.C37548b;
import java.util.List;
import java.util.Objects;

public class FeedPreview extends UIFeedCard implements IBadgeable, IJumpInfo {
    private AtInfo atInfo;
    private int atInfoCount;
    private String avatarId;
    private String avatarKey;
    private String customStatusIconKey;
    private String draftMessage;
    private LarkNameTag feedNameTag;
    private boolean isCrossTenant;
    private boolean isCustomer;
    private boolean isDelayed;
    private boolean isDisplayedInDelayedFeed;
    private boolean isRemind;
    private boolean isShortCutFeed;
    private boolean isSimpleTenant;
    private boolean isTranslateEmojiCode = true;
    private String lastMessageId;
    private int lastMessagePosition;
    private String localizedDigestMessage;
    private String markText;
    private int markType;
    private MuteUrgentInfo muteUrgentInfo;
    private MutexMarkType mutexMarkType;
    private String name;
    private int reactionCount;
    private int reactionDisplayCount;
    private List<Reaction> reactions;
    private int shortcutPosition;
    private TeamChatType teamChatType;
    private String teamName;
    private long unreadCount;

    public static class AtInfo {
        private String atContent;
        private long atDisplayTime;
        public long atRankTime;
        private String avatarKey;
        private String id;
        private String localizedUserName;

        public String getAtContent() {
            return this.atContent;
        }

        public long getAtDisplayTime() {
            return this.atDisplayTime;
        }

        public long getAtRankTime() {
            return this.atRankTime;
        }

        public String getAvatarKey() {
            return this.avatarKey;
        }

        public String getId() {
            return this.id;
        }

        public String getLocalizedUserName() {
            return this.localizedUserName;
        }

        public int hashCode() {
            int i;
            String str = this.avatarKey;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            String str2 = this.localizedUserName;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }

        public void setAtContent(String str) {
            this.atContent = str;
        }

        public void setAtDisplayTime(long j) {
            this.atDisplayTime = j;
        }

        public void setAtRankTime(long j) {
            this.atRankTime = j;
        }

        public void setAvatarKey(String str) {
            this.avatarKey = str;
        }

        public void setId(String str) {
            this.id = str;
        }

        public void setLocalizedUserName(String str) {
            this.localizedUserName = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AtInfo atInfo = (AtInfo) obj;
            String str = this.avatarKey;
            if (str == null ? atInfo.avatarKey != null : !str.equals(atInfo.avatarKey)) {
                return false;
            }
            String str2 = this.atContent;
            if (str2 == null ? atInfo.atContent != null : !str2.equals(atInfo.atContent)) {
                return false;
            }
            String str3 = this.localizedUserName;
            String str4 = atInfo.localizedUserName;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
            return false;
        }

        public AtInfo(String str, String str2, String str3) {
            this.id = str;
            this.avatarKey = str2;
            this.localizedUserName = str3;
        }
    }

    public enum MarkType {
        UNKNOWN(0),
        URGENT(2),
        AT_USER(4),
        AT_ALL(8),
        NO_REMIND_UNREAD(16);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        private MarkType(int i) {
            this.value = i;
        }
    }

    public enum MutexMarkType {
        UNKNOWN(0),
        DRAFT(1),
        SENDING(2),
        FAILED(3),
        VIDEO_MEETING(4),
        UNREAD(5),
        ENCRYPTED_CALL(6),
        READ(7),
        VOICE_CALL(8),
        VC_MEETING_STARTED(9),
        VC_MEETING_ENDED_OVER_ONE_HOUR(10),
        VC_MEETING_ENDED_LESS_ONE_HOUR(11),
        VC_MEETING_ENDED_LESS_ONE_MINUTE(12),
        VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR(13),
        VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR(14),
        VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN(15),
        CHAT_ROOM_CARD(16),
        CHAT_ROOM_START_MESSAGE(17);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static MutexMarkType valueOf(int i) {
            return forNumber(i);
        }

        public static MutexMarkType forNumber(int i) {
            switch (i) {
                case 1:
                    return DRAFT;
                case 2:
                    return SENDING;
                case 3:
                    return FAILED;
                case 4:
                    return VIDEO_MEETING;
                case 5:
                    return UNREAD;
                case 6:
                    return ENCRYPTED_CALL;
                case 7:
                    return READ;
                case 8:
                    return VOICE_CALL;
                case 9:
                    return VC_MEETING_STARTED;
                case 10:
                    return VC_MEETING_ENDED_OVER_ONE_HOUR;
                case 11:
                    return VC_MEETING_ENDED_LESS_ONE_HOUR;
                case HwBuildEx.VersionCodes.EMUI_5_1:
                    return VC_MEETING_ENDED_LESS_ONE_MINUTE;
                case 13:
                    return VC_DEFAULT_MEETING_ENDED_OVER_ONE_HOUR;
                case 14:
                    return VC_DEFAULT_MEETING_ENDED_LESS_ONE_HOUR;
                case 15:
                    return VC_DEFAULT_MEETING_ENDED_LESS_ONE_MIN;
                case 16:
                    return CHAT_ROOM_CARD;
                case 17:
                    return CHAT_ROOM_START_MESSAGE;
                default:
                    return UNKNOWN;
            }
        }

        private MutexMarkType(int i) {
            this.value = i;
        }
    }

    public AtInfo getAtInfo() {
        return this.atInfo;
    }

    public int getAtInfoCount() {
        return this.atInfoCount;
    }

    public String getAvatarId() {
        return this.avatarId;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getCustomStatusIconKey() {
        return this.customStatusIconKey;
    }

    public String getDraftMessage() {
        return this.draftMessage;
    }

    public LarkNameTag getFeedNameTag() {
        return this.feedNameTag;
    }

    public String getLastMessageId() {
        return this.lastMessageId;
    }

    public int getLastMessagePosition() {
        return this.lastMessagePosition;
    }

    public String getMarkText() {
        return this.markText;
    }

    public int getMarkType() {
        return this.markType;
    }

    public MuteUrgentInfo getMuteUrgentInfo() {
        return this.muteUrgentInfo;
    }

    public String getName() {
        return this.name;
    }

    public int getShortcutPosition() {
        return this.shortcutPosition;
    }

    public TeamChatType getTeamChatType() {
        return this.teamChatType;
    }

    public String getTeamName() {
        return this.teamName;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isCustomer() {
        return this.isCustomer;
    }

    public boolean isDelayed() {
        return this.isDelayed;
    }

    public boolean isDisplayedInDelayedFeed() {
        return this.isDisplayedInDelayedFeed;
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable, com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean isRemind() {
        return this.isRemind;
    }

    public boolean isShortCut() {
        return this.isShortCutFeed;
    }

    public boolean isSimpleTenant() {
        return this.isSimpleTenant;
    }

    public boolean isTranslateEmojiCode() {
        return this.isTranslateEmojiCode;
    }

    public FeedPreview() {
    }

    @Override // com.ss.android.lark.feed.app.entity.IBadgeable
    public int getBadgeCount() {
        return (int) getUnreadCount();
    }

    public String getLocalizedDigestMessage() {
        return getLocalizedDigestMessage(true);
    }

    public MutexMarkType getMutexMarkType() {
        return getMutexMarkType(true);
    }

    public int getReactionCount() {
        return getReactionCount(true);
    }

    public int getReactionDisplayCount() {
        return getReactionDisplayCount(true);
    }

    public List<Reaction> getReactions() {
        return getReactions(true);
    }

    public boolean isHeaderData() {
        if (getRankPriority() <= 35) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.feed.app.entity.IJumpInfo
    public int getJumpPriority() {
        if (isRemind() && getUnreadCount() > 0) {
            return 2;
        }
        if (isRemind() || getUnreadCount() <= 0) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public long getRealRankTime() {
        MuteUrgentInfo yVar = this.muteUrgentInfo;
        if (yVar != null && !TextUtils.isEmpty(yVar.mo106775c()) && C37548b.m147657a().mo137792b() == FeedFilter.MESSAGE) {
            return this.muteUrgentInfo.mo106773a().longValue();
        }
        AtInfo atInfo2 = this.atInfo;
        if (atInfo2 == null || TextUtils.isEmpty(atInfo2.getAtContent()) || C37548b.m147657a().mo137792b() != FeedFilter.MESSAGE) {
            return super.getRealRankTime();
        }
        return this.atInfo.atRankTime;
    }

    public void setAtInfo(AtInfo atInfo2) {
        this.atInfo = atInfo2;
    }

    public void setAtInfoCount(int i) {
        this.atInfoCount = i;
    }

    public void setAvatarId(String str) {
        this.avatarId = str;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setCustomStatusIconKey(String str) {
        this.customStatusIconKey = str;
    }

    public void setCustomer(boolean z) {
        this.isCustomer = z;
    }

    public void setDelayed(boolean z) {
        this.isDelayed = z;
    }

    public void setDisplayedInDelayedFeed(boolean z) {
        this.isDisplayedInDelayedFeed = z;
    }

    public void setDraftMessage(String str) {
        this.draftMessage = str;
    }

    public void setFeedNameTag(LarkNameTag dVar) {
        this.feedNameTag = dVar;
    }

    public void setLastMessageId(String str) {
        this.lastMessageId = str;
    }

    public void setLastMessagePosition(int i) {
        this.lastMessagePosition = i;
    }

    public void setLocalizedDigestMessage(String str) {
        this.localizedDigestMessage = str;
    }

    public void setMarkText(String str) {
        this.markText = str;
    }

    public void setMarkType(int i) {
        this.markType = i;
    }

    public void setMuteUrgentInfo(MuteUrgentInfo yVar) {
        this.muteUrgentInfo = yVar;
    }

    public void setMutexMarkType(MutexMarkType mutexMarkType2) {
        this.mutexMarkType = mutexMarkType2;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReactionCount(int i) {
        this.reactionCount = i;
    }

    public void setReactionDisplayCount(int i) {
        this.reactionDisplayCount = i;
    }

    public void setReactions(List<Reaction> list) {
        this.reactions = list;
    }

    public void setRemind(boolean z) {
        this.isRemind = z;
    }

    public void setShortCut(boolean z) {
        this.isShortCutFeed = z;
    }

    public void setShortcutPosition(int i) {
        this.shortcutPosition = i;
    }

    public void setSimpleTenant(boolean z) {
        this.isSimpleTenant = z;
    }

    public void setTeamChatType(TeamChatType teamChatType2) {
        this.teamChatType = teamChatType2;
    }

    public void setTeamName(String str) {
        this.teamName = str;
    }

    public void setTranslateEmojiCode(boolean z) {
        this.isTranslateEmojiCode = z;
    }

    public void setUnreadCount(long j) {
        this.unreadCount = j;
    }

    public String getLocalizedDigestMessage(boolean z) {
        String str;
        if (!z || (str = this.draftMessage) == null) {
            return this.localizedDigestMessage;
        }
        return str;
    }

    public MutexMarkType getMutexMarkType(boolean z) {
        if (!z || this.draftMessage == null) {
            return this.mutexMarkType;
        }
        return MutexMarkType.DRAFT;
    }

    public int getReactionCount(boolean z) {
        if (!z || this.draftMessage == null) {
            return this.reactionCount;
        }
        return 0;
    }

    public int getReactionDisplayCount(boolean z) {
        if (!z || this.draftMessage == null) {
            return this.reactionDisplayCount;
        }
        return 0;
    }

    public List<Reaction> getReactions(boolean z) {
        if (!z || this.draftMessage == null) {
            return this.reactions;
        }
        return null;
    }

    public boolean isContainMarkType(MarkType markType2) {
        if ((markType2.getNumber() & this.markType) != 0) {
            return true;
        }
        return false;
    }

    public FeedPreview(FeedPreview feedPreview) {
        setId(feedPreview.getId());
        setFeedType(feedPreview.getFeedType());
        setType(feedPreview.getType());
        setDisplayTime(feedPreview.getDisplayTime());
        setRankTime(feedPreview.getRankTime());
        setName(feedPreview.getName());
        setAvatarKey(feedPreview.getAvatarKey());
        setUnreadCount(feedPreview.getUnreadCount());
        setRemind(feedPreview.isRemind());
        setShortCut(feedPreview.isShortCut());
        setMutexMarkType(feedPreview.getMutexMarkType());
        setLocalizedDigestMessage(feedPreview.getLocalizedDigestMessage());
        setMarkText(feedPreview.getMarkText());
        setMarkType(feedPreview.getMarkType());
        setAtInfo(feedPreview.atInfo);
        setMuteUrgentInfo(feedPreview.muteUrgentInfo);
        setAtInfoCount(feedPreview.atInfoCount);
        setDelayed(feedPreview.isDelayed());
        setDisplayedInDelayedFeed(feedPreview.isDisplayedInDelayedFeed());
        setTranslateEmojiCode(feedPreview.isTranslateEmojiCode());
        setDraftMessage(feedPreview.getDraftMessage());
        setFeedNameTag(feedPreview.getFeedNameTag());
        setTeamName(feedPreview.getTeamName());
        setTeamChatType(feedPreview.getTeamChatType());
        setCustomStatusIconKey(feedPreview.getCustomStatusIconKey());
    }

    @Override // com.ss.android.lark.feed.app.entity.UIFeedCard
    public boolean exactlyCompare(Object obj) {
        if (!(obj instanceof FeedPreview)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        FeedPreview feedPreview = (FeedPreview) obj;
        if (feedPreview.isRemind == this.isRemind && feedPreview.unreadCount == this.unreadCount && feedPreview.markType == this.markType && feedPreview.mutexMarkType == this.mutexMarkType && TextUtils.equals(this.name, feedPreview.name) && TextUtils.equals(this.avatarKey, feedPreview.avatarKey) && TextUtils.equals(this.markText, feedPreview.markText) && TextUtils.equals(this.localizedDigestMessage, feedPreview.localizedDigestMessage) && this.atInfo == feedPreview.atInfo && this.muteUrgentInfo == feedPreview.muteUrgentInfo && this.isCrossTenant == feedPreview.isCrossTenant && this.isCustomer == feedPreview.isCustomer && this.isDelayed == feedPreview.isDelayed() && this.isDisplayedInDelayedFeed == feedPreview.isDisplayedInDelayedFeed() && this.reactionCount == feedPreview.reactionCount && this.reactionDisplayCount == feedPreview.reactionDisplayCount && reactionEquals(this.reactions, feedPreview.reactions) && feedPreview.isShortCutFeed == this.isShortCutFeed && feedPreview.isTranslateEmojiCode == this.isTranslateEmojiCode && TextUtils.equals(this.draftMessage, feedPreview.draftMessage) && TextUtils.equals(this.teamName, feedPreview.teamName) && Objects.equals(this.teamChatType, feedPreview.teamChatType) && TextUtils.equals(this.customStatusIconKey, feedPreview.customStatusIconKey)) {
            return super.exactlyCompare(obj);
        }
        return false;
    }

    private boolean reactionEquals(List<Reaction> list, List<Reaction> list2) {
        boolean z;
        boolean z2;
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            Reaction reaction = list.get(i);
            Reaction reaction2 = list2.get(i);
            if (reaction == null) {
                z = true;
            } else {
                z = false;
            }
            if (reaction2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2 || (reaction != null && !reaction.isContentSame(reaction2))) {
                return false;
            }
        }
        return true;
    }
}
