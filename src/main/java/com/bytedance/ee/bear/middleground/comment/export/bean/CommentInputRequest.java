package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class CommentInputRequest implements Serializable {
    public Map<Object, Object> bizParams;
    public boolean canUseBlankContent;
    public String comment_id;
    public String content;
    public String directional_reply_id;
    public String doc_token;
    public String doc_url;
    public CommentBean.CommentDetail.ExtraEntity extra;
    public boolean is_whole;
    public boolean keyboard_pop = true;
    public String local_comment_id;
    public String parent_token;
    public String parent_type;
    public String position;
    public String quote;
    public String reply_id;
    public boolean show_comment_image;
    public boolean show_insert_image;
    public boolean show_voice;
    public String tmpCommentId;
    public int type;

    public String getDirectional_reply_id() {
        return this.directional_reply_id;
    }

    public String getLocal_comment_id() {
        return this.local_comment_id;
    }

    public String getParent_token() {
        return this.parent_token;
    }

    public String getParent_type() {
        return this.parent_type;
    }

    public int getType() {
        return this.type;
    }

    public boolean isForWhole() {
        return this.is_whole;
    }

    public boolean isKeyboard_pop() {
        return this.keyboard_pop;
    }

    public String getDocToken() {
        String str = this.doc_token;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getDocUrl() {
        String str = this.doc_url;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getTmpCommentId() {
        String str = this.tmpCommentId;
        if (str == null) {
            return "";
        }
        return str;
    }

    public boolean isCreate() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public boolean isEdit() {
        if (this.type == 1) {
            return true;
        }
        return false;
    }

    public boolean isReply() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.is_whole), this.doc_token, this.doc_url, this.content, this.comment_id, this.reply_id, Boolean.valueOf(this.show_voice), Boolean.valueOf(this.show_insert_image), Boolean.valueOf(this.show_comment_image), Integer.valueOf(this.type), this.tmpCommentId, this.quote, this.bizParams, this.position);
    }

    public void setDirectional_reply_id(String str) {
        this.directional_reply_id = str;
    }

    public void setKeyboard_pop(boolean z) {
        this.keyboard_pop = z;
    }

    public void setLocal_comment_id(String str) {
        this.local_comment_id = str;
    }

    public void setParent_token(String str) {
        this.parent_token = str;
    }

    public void setParent_type(String str) {
        this.parent_type = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentInputRequest commentInputRequest = (CommentInputRequest) obj;
        if (this.is_whole != commentInputRequest.is_whole || this.show_voice != commentInputRequest.show_voice || this.type != commentInputRequest.type || this.show_comment_image != commentInputRequest.show_comment_image || this.show_insert_image != commentInputRequest.show_insert_image || !Objects.equals(this.doc_token, commentInputRequest.doc_token) || !Objects.equals(this.doc_url, commentInputRequest.doc_url) || !Objects.equals(this.content, commentInputRequest.content) || !Objects.equals(this.comment_id, commentInputRequest.comment_id) || !Objects.equals(this.reply_id, commentInputRequest.reply_id) || !Objects.equals(this.tmpCommentId, commentInputRequest.tmpCommentId) || !Objects.equals(this.extra, commentInputRequest.extra) || !Objects.equals(this.quote, commentInputRequest.quote) || !Objects.equals(this.bizParams, commentInputRequest.bizParams) || !Objects.equals(this.position, commentInputRequest.position)) {
            return false;
        }
        return true;
    }
}
