package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import java.util.List;

public class DataEntity implements BaseJSModel {
    private String business;
    private C9219Entity data;

    /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity */
    public static class C9219Entity implements BaseJSModel {
        private BodyEntity body;
        private HeaderEntity header;
        private IdentifierEntity identifier;
        private String operation;

        /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$BodyEntity */
        public static class BodyEntity implements BaseJSModel {
            private int code;
            private String data;
            private Extra extra;
            private String msg;

            /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$BodyEntity$PublishEntity */
            public static class PublishEntity implements BaseJSModel {
                private Comment comment;
                private boolean isNewComment;
                private String localCommentId;

                /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$BodyEntity$PublishEntity$Comment */
                public static class Comment implements BaseJSModel {
                    private String commentId;

                    public String getCommentId() {
                        return this.commentId;
                    }

                    public void setCommentId(String str) {
                        this.commentId = str;
                    }
                }

                public Comment getComment() {
                    return this.comment;
                }

                public String getLocalCommentId() {
                    return this.localCommentId;
                }

                public boolean isNewComment() {
                    return this.isNewComment;
                }

                public void setComment(Comment comment2) {
                    this.comment = comment2;
                }

                public void setLocalCommentId(String str) {
                    this.localCommentId = str;
                }

                public void setNewComment(boolean z) {
                    this.isNewComment = z;
                }
            }

            /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$BodyEntity$ResultEntity */
            public static class ResultEntity implements BaseJSModel {
                private Comments allComments;
                private CommentBean comment;

                /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$BodyEntity$ResultEntity$Comments */
                public static class Comments implements BaseJSModel {
                    private List<CommentBean> comments;

                    public List<CommentBean> getComments() {
                        return this.comments;
                    }

                    public void setComments(List<CommentBean> list) {
                        this.comments = list;
                    }
                }

                public Comments getAllComments() {
                    return this.allComments;
                }

                public CommentBean getComment() {
                    return this.comment;
                }

                public void setAllComments(Comments comments) {
                    this.allComments = comments;
                }

                public void setComment(CommentBean commentBean) {
                    this.comment = commentBean;
                }
            }

            /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$BodyEntity$Extra */
            public static class Extra implements BaseJSModel {
                private String notNotifyUsers;

                public String getNotNotifyUsers() {
                    return this.notNotifyUsers;
                }

                public void setNotNotifyUsers(String str) {
                    this.notNotifyUsers = str;
                }
            }

            public int getCode() {
                return this.code;
            }

            public String getData() {
                return this.data;
            }

            public Extra getExtra() {
                return this.extra;
            }

            public String getMsg() {
                return this.msg;
            }

            public void setCode(int i) {
                this.code = i;
            }

            public void setData(String str) {
                this.data = str;
            }

            public void setExtra(Extra extra2) {
                this.extra = extra2;
            }

            public void setMsg(String str) {
                this.msg = str;
            }
        }

        /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$HeaderEntity */
        public static class HeaderEntity implements BaseJSModel {
            private String requestId;

            public String getRequestId() {
                return this.requestId;
            }

            public void setRequestId(String str) {
                this.requestId = str;
            }
        }

        /* renamed from: com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity$Entity$IdentifierEntity */
        public static class IdentifierEntity implements BaseJSModel {
            private String token;
            private int type;

            public String getToken() {
                return this.token;
            }

            public int getType() {
                return this.type;
            }

            public void setToken(String str) {
                this.token = str;
            }

            public void setType(int i) {
                this.type = i;
            }
        }

        public BodyEntity getBody() {
            return this.body;
        }

        public HeaderEntity getHeader() {
            return this.header;
        }

        public IdentifierEntity getIdentifier() {
            return this.identifier;
        }

        public String getOperation() {
            return this.operation;
        }

        public void setBody(BodyEntity bodyEntity) {
            this.body = bodyEntity;
        }

        public void setHeader(HeaderEntity headerEntity) {
            this.header = headerEntity;
        }

        public void setIdentifier(IdentifierEntity identifierEntity) {
            this.identifier = identifierEntity;
        }

        public void setOperation(String str) {
            this.operation = str;
        }
    }

    public String getBusiness() {
        return this.business;
    }

    public C9219Entity getData() {
        return this.data;
    }

    public void setBusiness(String str) {
        this.business = str;
    }

    public void setData(C9219Entity entity) {
        this.data = entity;
    }
}
