package com.ss.android.lark.mm.module.detail.subtitles.model.response;

import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import java.io.Serializable;
import java.util.Map;

public class ReplyCommentRes implements Serializable {
    private Map<String, MmComment.MmCommentInfo> comments;
    private Map<String, MmMeetingParagraph> subtitles;

    public Map<String, MmComment.MmCommentInfo> getComments() {
        return this.comments;
    }

    public Map<String, MmMeetingParagraph> getSubtitles() {
        return this.subtitles;
    }

    public void setComments(Map<String, MmComment.MmCommentInfo> map) {
        this.comments = map;
    }

    public void setSubtitles(Map<String, MmMeetingParagraph> map) {
        this.subtitles = map;
    }
}
