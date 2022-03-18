package com.ss.android.vc.entity;

import com.ss.android.vc.entity.follow.ThumbnailDetail;
import java.io.Serializable;

public class VcDoc implements Serializable {
    private ContainerType containerType;
    private String docAbstract;
    private String docHighlightTitle;
    private String docLabelUrl;
    private String docOwner;
    private VcDocSubType docSubType;
    private String docTitle;
    private String docToken;
    private VcDocType docType;
    private String docUrl;
    private String editUserId;
    private boolean inMeetingSpace;
    private boolean isCrossTenant;
    private String ownerId;
    private VcDocShareStatus shareStatus;
    private ThumbnailDetail thumbnailDetail;
    private String updateTime;

    public ContainerType getContainerType() {
        return this.containerType;
    }

    public String getDocAbstract() {
        return this.docAbstract;
    }

    public String getDocHighlightTitle() {
        return this.docHighlightTitle;
    }

    public String getDocLabelUrl() {
        return this.docLabelUrl;
    }

    public String getDocOwner() {
        return this.docOwner;
    }

    public VcDocSubType getDocSubType() {
        return this.docSubType;
    }

    public String getDocTitle() {
        return this.docTitle;
    }

    public String getDocToken() {
        return this.docToken;
    }

    public VcDocType getDocType() {
        return this.docType;
    }

    public String getDocUrl() {
        return this.docUrl;
    }

    public String getEditUserId() {
        return this.editUserId;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public VcDocShareStatus getShareStatus() {
        return this.shareStatus;
    }

    public ThumbnailDetail getThumbnailDetail() {
        return this.thumbnailDetail;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public boolean isCrossTenant() {
        return this.isCrossTenant;
    }

    public boolean isInMeetingSpace() {
        return this.inMeetingSpace;
    }

    public String toString() {
        return "VcDoc{docToken='" + this.docToken + '\'' + ", docTitle='" + this.docTitle + '\'' + ", docHighlightTitle='" + this.docHighlightTitle + '\'' + ", docAbstract='" + this.docAbstract + '\'' + ", docOwner='" + this.docOwner + '\'' + '}';
    }

    public void setContainerType(ContainerType containerType2) {
        this.containerType = containerType2;
    }

    public void setCrossTenant(boolean z) {
        this.isCrossTenant = z;
    }

    public void setDocAbstract(String str) {
        this.docAbstract = str;
    }

    public void setDocHighlightTitle(String str) {
        this.docHighlightTitle = str;
    }

    public void setDocLabelUrl(String str) {
        this.docLabelUrl = str;
    }

    public void setDocOwner(String str) {
        this.docOwner = str;
    }

    public void setDocSubType(VcDocSubType vcDocSubType) {
        this.docSubType = vcDocSubType;
    }

    public void setDocTitle(String str) {
        this.docTitle = str;
    }

    public void setDocToken(String str) {
        this.docToken = str;
    }

    public void setDocType(VcDocType vcDocType) {
        this.docType = vcDocType;
    }

    public void setDocUrl(String str) {
        this.docUrl = str;
    }

    public void setEditUserId(String str) {
        this.editUserId = str;
    }

    public void setInMeetingSpace(boolean z) {
        this.inMeetingSpace = z;
    }

    public void setOwnerId(String str) {
        this.ownerId = str;
    }

    public void setShareStatus(VcDocShareStatus vcDocShareStatus) {
        this.shareStatus = vcDocShareStatus;
    }

    public void setThumbnailDetail(ThumbnailDetail thumbnailDetail2) {
        this.thumbnailDetail = thumbnailDetail2;
    }

    public void setUpdateTime(String str) {
        this.updateTime = str;
    }
}
