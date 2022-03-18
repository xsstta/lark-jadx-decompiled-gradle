package com.ss.android.vc.net.service;

import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.Room;
import com.ss.android.vc.p3088d.p3090b.C60871a;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class VideoChatUser implements Serializable {
    private String mAvatarKey;
    private String mAvatarUrlTpl;
    private String mId;
    private String mName;
    private String mNickname;
    private Room mRoom;
    private ParticipantType mType = ParticipantType.LARK_USER;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RingingState {
    }

    public String getAvatarKey() {
        return this.mAvatarKey;
    }

    public String getAvatarUrlTpl() {
        return this.mAvatarUrlTpl;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String getNickname() {
        return this.mNickname;
    }

    public Room getRoom() {
        return this.mRoom;
    }

    public ParticipantType getType() {
        return this.mType;
    }

    public VideoChatUser() {
    }

    public boolean isRoom() {
        if (this.mType != ParticipantType.ROOM || this.mRoom == null) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "{VideoChatUser  [id]" + this.mId + "  [avatar_key]" + this.mAvatarKey + "  [type]" + this.mType + "}";
    }

    public void setAvatarKey(String str) {
        this.mAvatarKey = str;
    }

    public void setAvatarUrlTpl(String str) {
        this.mAvatarUrlTpl = str;
    }

    public void setId(String str) {
        this.mId = str;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setNickname(String str) {
        this.mNickname = str;
    }

    public void setRoom(Room room) {
        this.mRoom = room;
    }

    public void setType(ParticipantType participantType) {
        this.mType = participantType;
    }

    public VideoChatUser(String str, String str2, String str3) {
        this.mName = str;
        this.mId = str2;
        this.mAvatarKey = str3;
        C60871a.m236609a("VideoChatUser", "mName = " + this.mName + ", avartarKey = " + this.mAvatarKey + ", mId = " + this.mId);
    }
}
