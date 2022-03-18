package com.ss.android.lark.mm.module.detail.subtitles.model.request;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class AddCommentReq implements Serializable {
    private String commentId;
    private String content;
    private Map<String, List<AddCommentHighlight>> highlights;
    private String quote;

    public static class AddCommentHighlight implements Serializable {
        private List<AddCommentHighlightDetail> highlights;
        private String sid;

        public List<AddCommentHighlightDetail> getHighlights() {
            return this.highlights;
        }

        public String getSid() {
            return this.sid;
        }

        public void setHighlights(List<AddCommentHighlightDetail> list) {
            this.highlights = list;
        }

        public void setSid(String str) {
            this.sid = str;
        }
    }

    public static class AddCommentHighlightDetail implements Serializable {
        private int offset;
        private int size;
        private long startTime;
        private int type;
        private String uuid;

        public int getOffset() {
            return this.offset;
        }

        public int getSize() {
            return this.size;
        }

        public long getStartTime() {
            return this.startTime;
        }

        public int getType() {
            return this.type;
        }

        public String getUuid() {
            return this.uuid;
        }

        public void setOffset(int i) {
            this.offset = i;
        }

        public void setSize(int i) {
            this.size = i;
        }

        public void setStartTime(long j) {
            this.startTime = j;
        }

        public void setType(int i) {
            this.type = i;
        }

        public void setUuid(String str) {
            this.uuid = str;
        }
    }

    public String getCommentId() {
        return this.commentId;
    }

    public String getContent() {
        return this.content;
    }

    public Map<String, List<AddCommentHighlight>> getHighlights() {
        return this.highlights;
    }

    public String getQuote() {
        return this.quote;
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setHighlights(Map<String, List<AddCommentHighlight>> map) {
        this.highlights = map;
    }

    public void setQuote(String str) {
        this.quote = str;
    }
}
