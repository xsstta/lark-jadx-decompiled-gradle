package com.ss.android.lark.voip.service.impl.service;

import com.ss.android.lark.voip.service.impl.sodium.crypto.CryptoUtil;
import java.io.Serializable;

public class VoiceCall implements Serializable {
    private long actionStartTime;
    private String byteDanceChannelKey;
    private String channelKey;
    private int countTime;
    private long createTime;
    private String fromUserId;
    private String id;
    private boolean isEncrpted;
    private boolean isNeedFeedback;
    private boolean isOffline;
    private boolean isSelfClientInValid = true;
    private String mTerminateReason;
    private byte[] publicKey;
    private byte[] random1;
    private byte[] random2;
    private Status status;
    private String toUserId;
    private boolean useByteDanceChannel;

    public enum Status {
        NONE(0),
        CALLING(1),
        RINGING(2),
        OCCUPIED(3),
        ACCEPTED(4),
        REFUSED(5),
        CANCELLED(6),
        UNAVAILABLE(7),
        ON_THE_CALL(8),
        TERMINATED(9),
        CLIENT_LOW_VERSION(10),
        EXIT(11);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Status valueOf(int i) {
            return forNumber(i);
        }

        public static Status forNumber(int i) {
            switch (i) {
                case 1:
                    return CALLING;
                case 2:
                    return RINGING;
                case 3:
                    return OCCUPIED;
                case 4:
                    return ACCEPTED;
                case 5:
                    return REFUSED;
                case 6:
                    return CANCELLED;
                case 7:
                    return UNAVAILABLE;
                case 8:
                    return ON_THE_CALL;
                case 9:
                    return TERMINATED;
                case 10:
                    return CLIENT_LOW_VERSION;
                default:
                    return null;
            }
        }

        private Status(int i) {
            this.value = i;
        }
    }

    public long getActionStartTime() {
        return this.actionStartTime;
    }

    public String getByteDanceChannelKey() {
        return this.byteDanceChannelKey;
    }

    public String getChannelKey() {
        return this.channelKey;
    }

    public int getCountTime() {
        return this.countTime;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getFromUserId() {
        return this.fromUserId;
    }

    public String getId() {
        return this.id;
    }

    public byte[] getPublicKey() {
        return this.publicKey;
    }

    public byte[] getRandom1() {
        return this.random1;
    }

    public byte[] getRandom2() {
        return this.random2;
    }

    public Status getStatus() {
        return this.status;
    }

    public String getTerminateReason() {
        return this.mTerminateReason;
    }

    public String getToUserId() {
        return this.toUserId;
    }

    public boolean isEncrpted() {
        return this.isEncrpted;
    }

    public boolean isNeedFeedback() {
        return this.isNeedFeedback;
    }

    public boolean isOffline() {
        return this.isOffline;
    }

    public boolean isSelfClientInValid() {
        return this.isSelfClientInValid;
    }

    public boolean isUseByteDanceChannel() {
        return this.useByteDanceChannel;
    }

    public VoiceCall() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id = " + getId());
        sb.append(", fromUserId = " + getFromUserId());
        sb.append(", toUserId = " + getToUserId());
        sb.append(", status = " + getStatus());
        sb.append(", actionStartTime = " + getActionStartTime());
        sb.append(", createTime = " + getCreateTime());
        sb.append(", countTime = " + getCountTime());
        sb.append(", serverPk = " + CryptoUtil.hexEncode(getPublicKey()));
        sb.append(", channelKey = " + getChannelKey());
        sb.append(", byteDanceChannelKey = " + getByteDanceChannelKey());
        if (getStatus() == Status.TERMINATED) {
            sb.append(", terminate reason = " + this.mTerminateReason);
        }
        return sb.toString();
    }

    public void setActionStartTime(long j) {
        this.actionStartTime = j;
    }

    public void setByteDanceChannelKey(String str) {
        this.byteDanceChannelKey = str;
    }

    public void setChannelKey(String str) {
        this.channelKey = str;
    }

    public void setCountTime(int i) {
        this.countTime = i;
    }

    public void setCreateTime(long j) {
        this.createTime = j;
    }

    public void setFromUserId(String str) {
        this.fromUserId = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setIsEncrpted(boolean z) {
        this.isEncrpted = z;
    }

    public void setIsNeedFeedback(boolean z) {
        this.isNeedFeedback = z;
    }

    public void setOffline(boolean z) {
        this.isOffline = z;
    }

    public void setPublicKey(byte[] bArr) {
        this.publicKey = bArr;
    }

    public void setRandom1(byte[] bArr) {
        this.random1 = bArr;
    }

    public void setRandom2(byte[] bArr) {
        this.random2 = bArr;
    }

    public void setSelfClientValid(boolean z) {
        this.isSelfClientInValid = z;
    }

    public void setStatus(Status status2) {
        this.status = status2;
    }

    public void setTerminateReason(String str) {
        this.mTerminateReason = str;
    }

    public void setToUserId(String str) {
        this.toUserId = str;
    }

    public void setUseByteDanceChannel(boolean z) {
        this.useByteDanceChannel = z;
    }

    public VoiceCall(VoiceCall voiceCall) {
        setStatus(voiceCall.getStatus());
        setCreateTime(voiceCall.getCreateTime());
        setId(voiceCall.getId());
        setFromUserId(voiceCall.getFromUserId());
        setToUserId(voiceCall.getToUserId());
        setChannelKey(voiceCall.getChannelKey());
        setPublicKey(voiceCall.getPublicKey());
        setRandom1(voiceCall.getRandom1());
        setRandom2(voiceCall.getRandom2());
        setCountTime(voiceCall.getCountTime());
        setByteDanceChannelKey(voiceCall.getByteDanceChannelKey());
        setUseByteDanceChannel(voiceCall.isUseByteDanceChannel());
        setIsEncrpted(voiceCall.isEncrpted());
        setTerminateReason(voiceCall.getTerminateReason());
    }
}
