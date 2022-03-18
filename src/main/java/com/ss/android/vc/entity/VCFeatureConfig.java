package com.ss.android.vc.entity;

import java.io.Serializable;

public class VCFeatureConfig implements Serializable {
    private boolean hostControlEnabled = true;
    private boolean interpretationEnable;
    private boolean liveEnabled = true;
    private MagicShare magicShare = new MagicShare();
    private Pstn pstn = new Pstn();
    private boolean recordEnabled = true;
    private RelationChain relationChain = new RelationChain();
    private ShareMeeting shareMeeting = new ShareMeeting();
    private Sip sip = new Sip();

    public static class MagicShare implements Serializable {
        private boolean newCCMEnabled = true;
        private boolean startCCMEnabled = true;
        private boolean startGoogleDriveEnabled = true;
        private boolean startUniversalEnabled = true;
        private boolean uploadFileEnabled = true;

        public boolean isNewCCMEnabled() {
            return this.newCCMEnabled;
        }

        public boolean isStartCCMEnabled() {
            return this.startCCMEnabled;
        }

        public boolean isStartGoogleDriveEnabled() {
            return this.startGoogleDriveEnabled;
        }

        public boolean isStartUniversalEnabled() {
            return this.startUniversalEnabled;
        }

        public boolean isUploadFileEnabled() {
            return this.uploadFileEnabled;
        }

        public void setNewCCMEnabled(boolean z) {
            this.newCCMEnabled = z;
        }

        public void setStartCCMEnabled(boolean z) {
            this.startCCMEnabled = z;
        }

        public void setStartGoogleDriveEnabled(boolean z) {
            this.startGoogleDriveEnabled = z;
        }

        public void setStartUniversalEnabled(boolean z) {
            this.startUniversalEnabled = z;
        }

        public void setUploadFileEnabled(boolean z) {
            this.uploadFileEnabled = z;
        }
    }

    public static class Pstn implements Serializable {
        private boolean pstnCallInEnabled = true;
        private boolean pstnCallOutEnabled = true;

        public boolean isPstnCallInEnabled() {
            return this.pstnCallInEnabled;
        }

        public boolean isPstnCallOutEnabled() {
            return this.pstnCallOutEnabled;
        }

        public void setPstnCallInEnabled(boolean z) {
            this.pstnCallInEnabled = z;
        }

        public void setPstnCallOutEnabled(boolean z) {
            this.pstnCallOutEnabled = z;
        }
    }

    public static class RelationChain implements Serializable {
        private boolean browseUserProfileEnabled = true;
        private boolean enterGroupEnabled = true;

        public boolean isBrowseUserProfileEnabled() {
            return this.browseUserProfileEnabled;
        }

        public boolean isEnterGroupEnabled() {
            return this.enterGroupEnabled;
        }

        public void setBrowseUserProfileEnabled(boolean z) {
            this.browseUserProfileEnabled = z;
        }

        public void setEnterGroupEnabled(boolean z) {
            this.enterGroupEnabled = z;
        }
    }

    public static class ShareMeeting implements Serializable {
        private boolean copyMeetingLinkEnabled = true;
        private boolean inviteEnabled = true;
        private boolean shareCardEnabled = true;

        public boolean isCopyMeetingLinkEnabled() {
            return this.copyMeetingLinkEnabled;
        }

        public boolean isInviteEnabled() {
            return this.inviteEnabled;
        }

        public boolean isShareCardEnabled() {
            return this.shareCardEnabled;
        }

        public void setCopyMeetingLinkEnabled(boolean z) {
            this.copyMeetingLinkEnabled = z;
        }

        public void setInviteEnabled(boolean z) {
            this.inviteEnabled = z;
        }

        public void setShareCardEnabled(boolean z) {
            this.shareCardEnabled = z;
        }
    }

    public static class Sip implements Serializable {
        private boolean sipCallInEnabled = true;
        private boolean sipCallOutEnabled = true;

        public boolean isSipCallInEnable() {
            return this.sipCallInEnabled;
        }

        public boolean isSipCallOutEnable() {
            return this.sipCallOutEnabled;
        }

        public void setSipCallInEnable(boolean z) {
            this.sipCallInEnabled = z;
        }

        public void setSipCallOutEnable(boolean z) {
            this.sipCallOutEnabled = z;
        }
    }

    public MagicShare getMagicShare() {
        return this.magicShare;
    }

    public Pstn getPstn() {
        return this.pstn;
    }

    public RelationChain getRelationChain() {
        return this.relationChain;
    }

    public ShareMeeting getShareMeeting() {
        return this.shareMeeting;
    }

    public Sip getSip() {
        return this.sip;
    }

    public boolean isHostControlEnabled() {
        return this.hostControlEnabled;
    }

    public boolean isInterpretationEnable() {
        return this.interpretationEnable;
    }

    public boolean isLiveEnabled() {
        return this.liveEnabled;
    }

    public boolean isRecordEnabled() {
        return this.recordEnabled;
    }

    public String toString() {
        return "VCFeatureConfig{liveEnabled=" + this.liveEnabled + ", recordEnabled=" + this.recordEnabled + ", hostControlEnabled=" + this.hostControlEnabled + ", shareMeeting=" + this.shareMeeting + ", pstn=" + this.pstn + ", sip=" + this.sip + ", magicShare=" + this.magicShare + ", relationChain=" + this.relationChain + ", interpretationEnable=" + this.interpretationEnable + '}';
    }

    public void setHostControlEnabled(boolean z) {
        this.hostControlEnabled = z;
    }

    public void setInterpretationEnable(boolean z) {
        this.interpretationEnable = z;
    }

    public void setLiveEnabled(boolean z) {
        this.liveEnabled = z;
    }

    public void setMagicShare(MagicShare magicShare2) {
        this.magicShare = magicShare2;
    }

    public void setPstn(Pstn pstn2) {
        this.pstn = pstn2;
    }

    public void setRecordEnabled(boolean z) {
        this.recordEnabled = z;
    }

    public void setRelationChain(RelationChain relationChain2) {
        this.relationChain = relationChain2;
    }

    public void setShareMeeting(ShareMeeting shareMeeting2) {
        this.shareMeeting = shareMeeting2;
    }

    public void setSip(Sip sip2) {
        this.sip = sip2;
    }
}
