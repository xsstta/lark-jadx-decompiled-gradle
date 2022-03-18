package com.ss.android.lark.notification.dto;

import java.io.Serializable;

public class NotificationSettingV2 implements Serializable {
    private MineChatMsgSettingState chatMsgState = MineChatMsgSettingState.OPEN;
    private DriveNotificationSetting driveNotificationSetting = new DriveNotificationSetting(true);
    private boolean isBuzzOpen = true;
    private boolean isMentionAllOpen;
    private boolean isMentionOpen;
    private boolean isUserSingleChatOpen;

    public void setBuzzOpen(boolean z) {
    }

    public enum MineChatMsgSettingState {
        UNKNOWN_STATE(0),
        CLOSED(1),
        HALF_OPEN(2),
        OPEN(3);
        
        private final int value;

        public int getNumber() {
            return this.value;
        }

        public static MineChatMsgSettingState valueOf(int i) {
            return forNumber(i);
        }

        public static MineChatMsgSettingState forNumber(int i) {
            if (i == 1) {
                return CLOSED;
            }
            if (i == 2) {
                return HALF_OPEN;
            }
            if (i != 3) {
                return UNKNOWN_STATE;
            }
            return OPEN;
        }

        private MineChatMsgSettingState(int i) {
            this.value = i;
        }
    }

    public MineChatMsgSettingState getChatMsgState() {
        return this.chatMsgState;
    }

    public DriveNotificationSetting getDriveNotificationSetting() {
        return this.driveNotificationSetting;
    }

    public boolean isBuzzOpen() {
        return this.isBuzzOpen;
    }

    public boolean isMentionAllOpen() {
        return this.isMentionAllOpen;
    }

    public boolean isMentionOpen() {
        return this.isMentionOpen;
    }

    public boolean isUserSingleChatOpen() {
        return this.isUserSingleChatOpen;
    }

    public static NotificationSettingV2 allInstance() {
        return new NotificationSettingV2(MineChatMsgSettingState.OPEN);
    }

    public static NotificationSettingV2 halfOpenInstance() {
        return new NotificationSettingV2(MineChatMsgSettingState.HALF_OPEN);
    }

    public static NotificationSettingV2 noneInstance() {
        return new NotificationSettingV2(MineChatMsgSettingState.CLOSED);
    }

    public NotificationSettingV2 closeNotify() {
        this.chatMsgState = MineChatMsgSettingState.CLOSED;
        return this;
    }

    public NotificationSettingV2 halfOpenNotify() {
        this.chatMsgState = MineChatMsgSettingState.HALF_OPEN;
        return this;
    }

    public NotificationSettingV2 openBuzz() {
        setBuzzOpen(true);
        return this;
    }

    public NotificationSettingV2 openMention() {
        setMentionOpen(true);
        return this;
    }

    public NotificationSettingV2 openMentionAll() {
        setMentionAllOpen(true);
        return this;
    }

    public NotificationSettingV2 openNotify() {
        this.chatMsgState = MineChatMsgSettingState.OPEN;
        return this;
    }

    public NotificationSettingV2 openUserSingleChat() {
        setUserSingleChatOpen(true);
        return this;
    }

    public boolean isAll() {
        if (this.chatMsgState == MineChatMsgSettingState.HALF_OPEN || this.chatMsgState == MineChatMsgSettingState.CLOSED) {
            return false;
        }
        return true;
    }

    public boolean isChatMsgOpen() {
        if (this.chatMsgState == MineChatMsgSettingState.HALF_OPEN) {
            return true;
        }
        return false;
    }

    public boolean isNone() {
        if (this.chatMsgState == MineChatMsgSettingState.CLOSED) {
            return true;
        }
        return false;
    }

    public NotificationSettingV2() {
    }

    public void setChatMsgState(MineChatMsgSettingState mineChatMsgSettingState) {
        this.chatMsgState = mineChatMsgSettingState;
    }

    public void setDriveNotificationSetting(DriveNotificationSetting driveNotificationSetting2) {
        this.driveNotificationSetting = driveNotificationSetting2;
    }

    public void setMentionAllOpen(boolean z) {
        this.isMentionAllOpen = z;
    }

    public void setMentionOpen(boolean z) {
        this.isMentionOpen = z;
    }

    public void setUserSingleChatOpen(boolean z) {
        this.isUserSingleChatOpen = z;
    }

    public NotificationSettingV2(MineChatMsgSettingState mineChatMsgSettingState) {
        this.chatMsgState = mineChatMsgSettingState;
    }
}
