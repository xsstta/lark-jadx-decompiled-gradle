package com.ss.android.lark.setting.dto;

import java.io.Serializable;

public class NotificationSettingV2 implements Serializable {
    private ChatMsgNotificationState chatMsgState = ChatMsgNotificationState.OPEN;
    private C54122b driveNotificationSetting = new C54122b(true);
    private boolean isBuzzOpen = true;
    private boolean isMentionAllOpen;
    private boolean isMentionOpen;
    private boolean isUserSingleChatOpen;

    public void setBuzzOpen(boolean z) {
    }

    public enum ChatMsgNotificationState {
        UNKNOWN_STATE(0),
        CLOSED(1),
        HALF_OPEN(2),
        OPEN(3);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ChatMsgNotificationState valueOf(int i) {
            return forNumber(i);
        }

        public static ChatMsgNotificationState forNumber(int i) {
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

        private ChatMsgNotificationState(int i) {
            this.value = i;
        }
    }

    public ChatMsgNotificationState getChatMsgState() {
        return this.chatMsgState;
    }

    public C54122b getDriveNotificationSetting() {
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
        return new NotificationSettingV2(ChatMsgNotificationState.OPEN);
    }

    public static NotificationSettingV2 halfOpenInstance() {
        return new NotificationSettingV2(ChatMsgNotificationState.HALF_OPEN);
    }

    public static NotificationSettingV2 noneInstance() {
        return new NotificationSettingV2(ChatMsgNotificationState.CLOSED);
    }

    public NotificationSettingV2 closeNotify() {
        this.chatMsgState = ChatMsgNotificationState.CLOSED;
        return this;
    }

    public NotificationSettingV2 halfOpenNotify() {
        this.chatMsgState = ChatMsgNotificationState.HALF_OPEN;
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

    public NotificationSettingV2 openNotify() {
        this.chatMsgState = ChatMsgNotificationState.OPEN;
        return this;
    }

    public NotificationSettingV2 openUserSingleChat() {
        setUserSingleChatOpen(true);
        return this;
    }

    public boolean isAll() {
        if (this.chatMsgState == ChatMsgNotificationState.HALF_OPEN || this.chatMsgState == ChatMsgNotificationState.CLOSED) {
            return false;
        }
        return true;
    }

    public boolean isNone() {
        if (this.chatMsgState == ChatMsgNotificationState.CLOSED) {
            return true;
        }
        return false;
    }

    public NotificationSettingV2() {
    }

    public void setChatMsgState(ChatMsgNotificationState chatMsgNotificationState) {
        this.chatMsgState = chatMsgNotificationState;
    }

    public void setDriveNotificationSetting(C54122b bVar) {
        this.driveNotificationSetting = bVar;
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

    public NotificationSettingV2(ChatMsgNotificationState chatMsgNotificationState) {
        this.chatMsgState = chatMsgNotificationState;
    }
}
