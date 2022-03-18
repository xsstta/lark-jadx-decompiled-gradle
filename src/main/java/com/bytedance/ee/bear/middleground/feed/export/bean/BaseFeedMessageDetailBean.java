package com.bytedance.ee.bear.middleground.feed.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.ErrorBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.Reaction;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Objects;

public class BaseFeedMessageDetailBean implements BaseJSModel {
    private boolean anonymous;
    private String avatar_url;
    private String comment_id;
    private String content;
    private int create_timestamp;
    private ErrorBean error;
    private ExtraEntity extra;
    private boolean isEditStatus;
    private boolean isFull;
    private int is_whole;
    private int modify;
    private String name;
    private List<Reaction> reaction;
    private List<ReactionDetailViewModel> reactionDetailData;
    private List<C53061a> reactionFlowData;
    private String reaction_type;
    private String reply_id;
    private String retryType;
    private boolean sending;
    private String translate_content;
    private String translate_status = "default";
    private int update_timestamp;
    private String user_id;

    public static class ExtraEntity implements Serializable {
        private CommentBean.CommentDetail.ExtraEntity.AttachmentEntity attachment;
        private List<String> image_list;

        public static class AttachmentEntity implements Serializable {
            private int audio_duration;
            private String audio_file_token;

            public int getAudio_duration() {
                return this.audio_duration;
            }

            public String getAudio_file_token() {
                return this.audio_file_token;
            }

            public int hashCode() {
                return Objects.hash(this.audio_file_token, Integer.valueOf(this.audio_duration));
            }

            public void setAudio_duration(int i) {
                this.audio_duration = i;
            }

            public void setAudio_file_token(String str) {
                this.audio_file_token = str;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                AttachmentEntity attachmentEntity = (AttachmentEntity) obj;
                if (this.audio_duration != attachmentEntity.audio_duration || !Objects.equals(this.audio_file_token, attachmentEntity.audio_file_token)) {
                    return false;
                }
                return true;
            }
        }

        public CommentBean.CommentDetail.ExtraEntity.AttachmentEntity getAttachment() {
            return this.attachment;
        }

        public List<String> getImage_list() {
            return this.image_list;
        }

        public int hashCode() {
            return Objects.hash(this.attachment, this.image_list);
        }

        public void setAttachment(CommentBean.CommentDetail.ExtraEntity.AttachmentEntity attachmentEntity) {
            this.attachment = attachmentEntity;
        }

        public void setImage_list(List<String> list) {
            this.image_list = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ExtraEntity extraEntity = (ExtraEntity) obj;
            if (!Objects.equals(this.attachment, extraEntity.attachment) || !Objects.equals(this.image_list, extraEntity.image_list)) {
                return false;
            }
            return true;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface TranslateStatus {
    }

    public String getAvatar_url() {
        return this.avatar_url;
    }

    public String getComment_id() {
        return this.comment_id;
    }

    public String getContent() {
        return this.content;
    }

    public int getCreate_timestamp() {
        return this.create_timestamp;
    }

    public ExtraEntity getExtra() {
        return this.extra;
    }

    public int getIs_whole() {
        return this.is_whole;
    }

    public int getModify() {
        return this.modify;
    }

    public String getName() {
        return this.name;
    }

    public List<Reaction> getReaction() {
        return this.reaction;
    }

    public List<ReactionDetailViewModel> getReactionDetailData() {
        return this.reactionDetailData;
    }

    public List<C53061a> getReactionFlowData() {
        return this.reactionFlowData;
    }

    public String getReaction_type() {
        return this.reaction_type;
    }

    public String getReferKey() {
        return this.reply_id;
    }

    public String getReply_id() {
        return this.reply_id;
    }

    public String getRetryType() {
        return this.retryType;
    }

    public String getTranslate_content() {
        return this.translate_content;
    }

    public String getTranslate_status() {
        return this.translate_status;
    }

    public int getUpdate_timestamp() {
        return this.update_timestamp;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public boolean isAnonymous() {
        return this.anonymous;
    }

    public boolean isEditStatus() {
        return this.isEditStatus;
    }

    public boolean isFull() {
        return this.isFull;
    }

    public boolean isSending() {
        return this.sending;
    }

    public ErrorBean getError() {
        ErrorBean errorBean = this.error;
        if (errorBean != null) {
            return errorBean;
        }
        return new ErrorBean();
    }

    public int hashCode() {
        return Objects.hash(this.comment_id, this.reply_id, this.user_id, this.avatar_url, this.name, this.content, Integer.valueOf(this.create_timestamp), Integer.valueOf(this.update_timestamp), Boolean.valueOf(this.isEditStatus), Integer.valueOf(this.modify), this.extra, this.reaction_type, this.reaction, Boolean.valueOf(this.isFull), this.translate_status, this.translate_content);
    }

    public String toString() {
        return "CommentDetail{comment_id='" + this.comment_id + '\'' + ", reply_id='" + this.reply_id + '\'' + ", user_id='" + this.user_id + '\'' + ", avatar_url='" + this.avatar_url + '\'' + ", name='" + this.name + '\'' + ", content='" + this.content + '\'' + ", create_timestamp=" + this.create_timestamp + ", update_timestamp=" + this.update_timestamp + ", isEditStatus=" + this.isEditStatus + ", modify=" + this.modify + ", extra=" + this.extra + ", reaction_type='" + this.reaction_type + '\'' + ", reactionFlowData=" + this.reactionFlowData + ", reactionDetailData=" + this.reactionDetailData + ", reaction=" + this.reaction + ", isFull=" + this.isFull + ", translate_content='" + this.translate_content + '\'' + ", translate_status='" + this.translate_status + '\'' + '}';
    }

    public void setAnonymous(boolean z) {
        this.anonymous = z;
    }

    public void setAvatar_url(String str) {
        this.avatar_url = str;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCreate_timestamp(int i) {
        this.create_timestamp = i;
    }

    public void setEditStatus(boolean z) {
        this.isEditStatus = z;
    }

    public void setError(ErrorBean errorBean) {
        this.error = errorBean;
    }

    public void setExtra(ExtraEntity extraEntity) {
        this.extra = extraEntity;
    }

    public void setFull(boolean z) {
        this.isFull = z;
    }

    public void setIs_whole(int i) {
        this.is_whole = i;
    }

    public void setModify(int i) {
        this.modify = i;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setReaction(List<Reaction> list) {
        this.reaction = list;
    }

    public void setReactionDetailData(List<ReactionDetailViewModel> list) {
        this.reactionDetailData = list;
    }

    public void setReactionFlowData(List<C53061a> list) {
        this.reactionFlowData = list;
    }

    public void setReaction_type(String str) {
        this.reaction_type = str;
    }

    public void setReferKey(String str) {
        this.reply_id = str;
    }

    public void setReply_id(String str) {
        this.reply_id = str;
    }

    public void setRetryType(String str) {
        this.retryType = str;
    }

    public void setSending(boolean z) {
        this.sending = z;
    }

    public void setTranslate_content(String str) {
        this.translate_content = str;
    }

    public void setTranslate_status(String str) {
        this.translate_status = str;
    }

    public void setUpdate_timestamp(int i) {
        this.update_timestamp = i;
    }

    public void setUser_id(String str) {
        this.user_id = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BaseFeedMessageDetailBean baseFeedMessageDetailBean = (BaseFeedMessageDetailBean) obj;
        if (!Objects.equals(this.comment_id, baseFeedMessageDetailBean.comment_id) || !Objects.equals(this.reply_id, baseFeedMessageDetailBean.reply_id) || !Objects.equals(this.user_id, baseFeedMessageDetailBean.user_id) || !Objects.equals(this.name, baseFeedMessageDetailBean.name) || !Objects.equals(this.content, baseFeedMessageDetailBean.content) || !Objects.equals(Boolean.valueOf(this.sending), Boolean.valueOf(baseFeedMessageDetailBean.isSending())) || !Objects.equals(this.error, baseFeedMessageDetailBean.error) || !Objects.equals(this.reaction_type, baseFeedMessageDetailBean.reaction_type) || !Objects.equals(this.translate_content, baseFeedMessageDetailBean.translate_content) || !Objects.equals(this.translate_status, baseFeedMessageDetailBean.translate_status) || !Objects.equals(Boolean.valueOf(this.isEditStatus), Boolean.valueOf(baseFeedMessageDetailBean.isEditStatus)) || !Objects.equals(this.reaction, baseFeedMessageDetailBean.reaction)) {
            return false;
        }
        return true;
    }
}
