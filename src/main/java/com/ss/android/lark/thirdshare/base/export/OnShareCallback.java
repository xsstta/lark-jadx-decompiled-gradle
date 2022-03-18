package com.ss.android.lark.thirdshare.base.export;

import android.text.TextUtils;
import com.huawei.hms.location.LocationRequest;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.ttm.player.MediaPlayer;
import java.io.Serializable;

public abstract class OnShareCallback implements Serializable {
    public static final ShareError BASE_DEP_API_IS_NULL = new ShareError(499, "ThirdShareBaseDepApi is null");
    public static final ShareError CANCELED = new ShareError(103, "cancel");
    public static final ShareError FETCH_REMOTE_CONFIG_FAILED = new ShareError(ParticipantRepo.f117150c, "fetchRemoteConfigFailed");
    public static final ShareError ILLEGAL_CONFIG_PARAM = new ShareError(401, "illegalConfigParam");
    public static final ShareError INTERCEPT_DOWNGRADE = new ShareError(LocationRequest.PRIORITY_INDOOR, "interceptDowngrade");
    public static final ShareError NOT_INSTALLED = new ShareError(101, "notInstalled");
    public static final ShareError PARSE_CONFIG_FAILED = new ShareError(MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL, "parseConfigFailed");
    public static final ShareError SAVE_FAILED = new ShareError(102, "saveFailed");

    public boolean intercept(ShareActionType shareActionType) {
        return false;
    }

    public void onDismiss(boolean z) {
    }

    public abstract void onFailed(ShareActionType shareActionType, ShareError shareError);

    public void onShow() {
    }

    public abstract void onSuccess(ShareActionType shareActionType);

    public static class ShareError implements Serializable {
        private String append;
        private int code;
        private String msg;

        public int getCode() {
            return this.code;
        }

        public String getMsg() {
            String str;
            if (TextUtils.isEmpty(this.append)) {
                str = this.msg;
            } else {
                str = this.msg + ": " + this.append;
            }
            this.append = "";
            return str;
        }

        public String toString() {
            return "ShareError{code=" + this.code + ", msg='" + getMsg() + '\'' + '}';
        }

        public ShareError appendMsg(String str) {
            this.append = str;
            return this;
        }

        public String toString(String str) {
            return "ShareError{code=" + this.code + ", msg='" + this.msg + '\'' + ", append='" + str + '\'' + '}';
        }

        public ShareError(int i, String str) {
            this.code = i;
            this.msg = str;
        }
    }
}
