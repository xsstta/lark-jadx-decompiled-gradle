package com.bytedance.ee.bear.drive.biz.comment.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.bytedance.ee.bear.drive.biz.comment.area.AreaCoordinate;
import java.io.Serializable;

public class AreaCommentPayLoadData implements Serializable {
    @JSONField(name = "drive_area_coordinate")
    private AreaCoordinate areaCoordinate;
    @JSONField(name = "comment_id")
    private String commentId;
    private String type;
    @JSONField(name = "user_id")
    private String userId;
    private String version;

    public AreaCoordinate getAreaCoordinate() {
        return this.areaCoordinate;
    }

    public String getCommentId() {
        return this.commentId;
    }

    public String getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getVersion() {
        return this.version;
    }

    public void setAreaCoordinate(AreaCoordinate areaCoordinate2) {
        this.areaCoordinate = areaCoordinate2;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setVersion(String str) {
        this.version = str;
    }
}
