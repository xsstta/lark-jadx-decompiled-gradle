package com.ss.android.lark.mm.module.detail.comment.model;

import com.ss.android.lark.mm.depend.C45899c;
import com.ss.android.lark.mm.net.HttpMmResponse;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class MmComment implements Serializable {
    private Map<String, MmCommentInfo> comments;

    public static class MmCommentResp extends HttpMmResponse<MmComment> {
    }

    public static class MmCommentInfo implements Serializable {
        private List<CommentDetail> comment_list;
        private int comment_num;
        private String pid;
        private boolean visible;

        public static class CommentDetail implements Serializable {
            private List<CommentDetailContent> comment_content_list;
            private String comment_id;
            private long create_time;
            private List<String> pid_list;
            private String quote;
            private long update_time;
            private String uuid;

            public static class CommentDetailContent implements Serializable {
                private String avatar_url;
                private String content;
                private String content_id;
                private long create_time;
                private String originContent;
                private long update_time;
                private String user_id;
                private String user_name;

                public String getAvatar_url() {
                    return this.avatar_url;
                }

                public String getContent() {
                    return this.content;
                }

                public String getContent_id() {
                    return this.content_id;
                }

                public long getCreate_time() {
                    return this.create_time;
                }

                public String getOriginContent() {
                    return this.originContent;
                }

                public long getUpdate_time() {
                    return this.update_time;
                }

                public String getUser_id() {
                    return this.user_id;
                }

                public String getUser_name() {
                    return this.user_name;
                }

                public boolean isCanDelete() {
                    return this.user_id.equals(C45899c.m181859a().getLoginDepend().mo144647a());
                }

                public void setAvatar_url(String str) {
                    this.avatar_url = str;
                }

                public void setContent(String str) {
                    this.content = str;
                }

                public void setContent_id(String str) {
                    this.content_id = str;
                }

                public void setCreate_time(long j) {
                    this.create_time = j;
                }

                public void setOriginContent(String str) {
                    this.originContent = str;
                }

                public void setUpdate_time(long j) {
                    this.update_time = j;
                }

                public void setUser_id(String str) {
                    this.user_id = str;
                }

                public void setUser_name(String str) {
                    this.user_name = str;
                }
            }

            public List<CommentDetailContent> getComment_content_list() {
                return this.comment_content_list;
            }

            public String getComment_id() {
                return this.comment_id;
            }

            public long getCreate_time() {
                return this.create_time;
            }

            public List<String> getPid_list() {
                return this.pid_list;
            }

            public String getQuote() {
                return this.quote;
            }

            public long getUpdate_time() {
                return this.update_time;
            }

            public String getUuid() {
                return this.uuid;
            }

            public void setComment_content_list(List<CommentDetailContent> list) {
                this.comment_content_list = list;
            }

            public void setComment_id(String str) {
                this.comment_id = str;
            }

            public void setCreate_time(long j) {
                this.create_time = j;
            }

            public void setPid_list(List<String> list) {
                this.pid_list = list;
            }

            public void setQuote(String str) {
                this.quote = str;
            }

            public void setUpdate_time(long j) {
                this.update_time = j;
            }

            public void setUuid(String str) {
                this.uuid = str;
            }
        }

        public List<CommentDetail> getComment_list() {
            return this.comment_list;
        }

        public int getComment_num() {
            return this.comment_num;
        }

        public String getPid() {
            return this.pid;
        }

        public boolean isVisible() {
            return this.visible;
        }

        public void setComment_list(List<CommentDetail> list) {
            this.comment_list = list;
        }

        public void setComment_num(int i) {
            this.comment_num = i;
        }

        public void setPid(String str) {
            this.pid = str;
        }

        public void setVisible(boolean z) {
            this.visible = z;
        }
    }

    public Map<String, MmCommentInfo> getComments() {
        return this.comments;
    }

    public void setComments(Map<String, MmCommentInfo> map) {
        this.comments = map;
    }
}
