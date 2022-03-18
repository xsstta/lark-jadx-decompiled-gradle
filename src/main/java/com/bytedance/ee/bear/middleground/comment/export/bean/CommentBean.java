package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.ss.android.lark.reaction.widget.detailwindow.bean.ReactionDetailViewModel;
import com.ss.android.lark.reaction.widget.flowlayout.p2562a.C53061a;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class CommentBean implements BaseJSModel {
    private Map<Object, Object> bizParams;
    private String comment_id;
    private List<CommentDetail> comment_list;
    private String currentReplyId;
    private int finish;
    private boolean isExpanded;
    private boolean isScrollLast;
    private int is_whole;
    private String parentToken;
    private String parentType;
    private String position;
    private String quote = "";
    private boolean unSubmitComment;

    public static class CommentDetail implements BaseJSModel {
        private boolean anonymous;
        private String avatar_url;
        private String comment_id;
        private String compatibleReplyIdBeforeSend;
        private String content;
        private int create_timestamp;
        private ErrorBean error;
        private ExtraEntity extra;
        private boolean inReply;
        private boolean isEditStatus;
        private boolean isFull;
        private int is_whole;
        private String messageId;
        private int modify;
        private String name;
        private List<Reaction> reaction;
        private List<ReactionDetailViewModel> reactionDetailData;
        private List<C53061a> reactionFlowData;
        private String reaction_type;
        private int readStatus;
        private String reply_id;
        private String retryType;
        private boolean sending;
        private String translate_content;
        private String translate_status = "default";
        private int update_timestamp;
        private String user_id;

        public static class ExtraEntity implements Serializable {
            private AttachmentEntity attachment;
            private List<CommentImageEntity> image_list;

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

            public static class CommentImageEntity implements Serializable {
                private String originalSrc;
                private String src;
                private String token;
                private String uuid;

                public String getOriginalSrc() {
                    return this.originalSrc;
                }

                public String getSrc() {
                    return this.src;
                }

                public String getToken() {
                    return this.token;
                }

                public String getUuid() {
                    return this.uuid;
                }

                public int hashCode() {
                    return Objects.hash(this.token, this.uuid, this.src, this.originalSrc);
                }

                public void setOriginalSrc(String str) {
                    this.originalSrc = str;
                }

                public void setSrc(String str) {
                    this.src = str;
                }

                public void setToken(String str) {
                    this.token = str;
                }

                public void setUuid(String str) {
                    this.uuid = str;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    CommentImageEntity commentImageEntity = (CommentImageEntity) obj;
                    if (!Objects.equals(this.token, commentImageEntity.token) || !Objects.equals(this.uuid, commentImageEntity.uuid) || !this.src.equals(commentImageEntity.src) || !Objects.equals(this.originalSrc, commentImageEntity.originalSrc)) {
                        return false;
                    }
                    return true;
                }
            }

            public AttachmentEntity getAttachment() {
                return this.attachment;
            }

            public List<CommentImageEntity> getImage_list() {
                return this.image_list;
            }

            public int hashCode() {
                return Objects.hash(this.attachment, this.image_list);
            }

            public void setAttachment(AttachmentEntity attachmentEntity) {
                this.attachment = attachmentEntity;
            }

            public void setImage_list(List<CommentImageEntity> list) {
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

        public String getCompatibleReplyIdBeforeSend() {
            return this.compatibleReplyIdBeforeSend;
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

        public String getMessageId() {
            return this.messageId;
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

        public int getReadStatus() {
            return this.readStatus;
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

        public boolean isInReply() {
            return this.inReply;
        }

        public boolean isSending() {
            return this.sending;
        }

        public String getComment_id() {
            String str = this.comment_id;
            if (str != null) {
                return str;
            }
            return "";
        }

        public boolean isWholeComment() {
            if (this.is_whole == 1) {
                return true;
            }
            return false;
        }

        public ErrorBean getError() {
            ErrorBean errorBean = this.error;
            if (errorBean != null) {
                return errorBean;
            }
            return new ErrorBean();
        }

        public int hashCode() {
            return Objects.hash(this.comment_id, this.reply_id, this.user_id, this.name, this.content, Boolean.valueOf(this.sending), this.error, this.reaction_type, this.translate_content, this.translate_status, Boolean.valueOf(this.isEditStatus), this.reaction, this.extra, this.messageId);
        }

        public String toString() {
            return "CommentDetail{comment_id='" + this.comment_id + '\'' + ", reply_id='" + this.reply_id + '\'' + ", user_id='" + this.user_id + '\'' + ", avatar_url='" + this.avatar_url + '\'' + ", name='" + this.name + '\'' + ", content='" + this.content + '\'' + ", compatibleReplyIdBeforeSend='" + this.compatibleReplyIdBeforeSend + '\'' + ", create_timestamp=" + this.create_timestamp + ", update_timestamp=" + this.update_timestamp + ", isEditStatus=" + this.isEditStatus + ", anonymous=" + this.anonymous + ", modify=" + this.modify + ", extra=" + this.extra + ", reaction_type='" + this.reaction_type + '\'' + ", reactionFlowData=" + this.reactionFlowData + ", reactionDetailData=" + this.reactionDetailData + ", reaction=" + this.reaction + ", isFull=" + this.isFull + ", translate_content='" + this.translate_content + '\'' + ", translate_status='" + this.translate_status + '\'' + ", is_whole=" + this.is_whole + ", sending=" + this.sending + ", retryType='" + this.retryType + '\'' + ", error=" + this.error + ", messageId='" + this.messageId + '\'' + ", readStatus=" + this.readStatus + '}';
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

        public void setCompatibleReplyIdBeforeSend(String str) {
            this.compatibleReplyIdBeforeSend = str;
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

        public void setInReply(boolean z) {
            this.inReply = z;
        }

        public void setIs_whole(int i) {
            this.is_whole = i;
        }

        public void setMessageId(String str) {
            this.messageId = str;
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

        public void setReadStatus(int i) {
            this.readStatus = i;
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
            CommentDetail commentDetail = (CommentDetail) obj;
            if (!Objects.equals(this.comment_id, commentDetail.comment_id) || !Objects.equals(this.reply_id, commentDetail.reply_id) || !Objects.equals(this.user_id, commentDetail.user_id) || !Objects.equals(this.name, commentDetail.name) || !Objects.equals(this.content, commentDetail.content) || !Objects.equals(Boolean.valueOf(this.sending), Boolean.valueOf(commentDetail.isSending())) || !Objects.equals(this.error, commentDetail.error) || !Objects.equals(this.reaction_type, commentDetail.reaction_type) || !Objects.equals(this.translate_content, commentDetail.translate_content) || !Objects.equals(this.translate_status, commentDetail.translate_status) || !Objects.equals(Boolean.valueOf(this.isEditStatus), Boolean.valueOf(commentDetail.isEditStatus)) || !Objects.equals(this.reaction, commentDetail.reaction) || !Objects.equals(this.extra, commentDetail.extra) || !Objects.equals(this.messageId, commentDetail.messageId)) {
                return false;
            }
            return true;
        }
    }

    public Map<Object, Object> getBizParams() {
        return this.bizParams;
    }

    public String getComment_id() {
        return this.comment_id;
    }

    public List<CommentDetail> getComment_list() {
        return this.comment_list;
    }

    public String getCurrentReplyId() {
        return this.currentReplyId;
    }

    public int getFinish() {
        return this.finish;
    }

    public int getIs_whole() {
        return this.is_whole;
    }

    public String getParentToken() {
        return this.parentToken;
    }

    public String getParentType() {
        return this.parentType;
    }

    public String getPosition() {
        return this.position;
    }

    public String getQuote() {
        return this.quote;
    }

    public boolean isExpanded() {
        return this.isExpanded;
    }

    public boolean isScrollLast() {
        return this.isScrollLast;
    }

    public boolean isUnSubmitComment() {
        return this.unSubmitComment;
    }

    public void setBizParams(Map<Object, Object> map) {
        this.bizParams = map;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setComment_list(List<CommentDetail> list) {
        this.comment_list = list;
    }

    public void setCurrentReplyId(String str) {
        this.currentReplyId = str;
    }

    public void setExpanded(boolean z) {
        this.isExpanded = z;
    }

    public void setFinish(int i) {
        this.finish = i;
    }

    public void setIs_whole(int i) {
        this.is_whole = i;
    }

    public void setParentToken(String str) {
        this.parentToken = str;
    }

    public void setParentType(String str) {
        this.parentType = str;
    }

    public void setPosition(String str) {
        this.position = str;
    }

    public void setQuote(String str) {
        this.quote = str;
    }

    public void setScrollLast(boolean z) {
        this.isScrollLast = z;
    }

    public void setUnSubmitComment(boolean z) {
        this.unSubmitComment = z;
    }
}
