package com.ss.android.lark.mm.module.detail.subtitles.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.net.HttpMmResponse;
import java.io.Serializable;
import java.util.List;

public class MmMeetingSubtitles implements Serializable {
    private long _totalContentSize;
    @JSONField(name = "has_more")
    private boolean hasMore;
    @JSONField(name = "last_edit_version")
    private int lastEditVersion;
    private List<MmMeetingParagraph> paragraphs;
    private int size;
    private int version;

    public static class MmMeetingSubtitlesResp extends HttpMmResponse<MmMeetingSubtitles> {
    }

    public int getLastEditVersion() {
        return this.lastEditVersion;
    }

    public List<MmMeetingParagraph> getParagraphs() {
        return this.paragraphs;
    }

    public int getSize() {
        return this.size;
    }

    public long getTotalContentSize() {
        return this._totalContentSize;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isHasMore() {
        return this.hasMore;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLastEditVersion(int i) {
        this.lastEditVersion = i;
    }

    public void setParagraphs(List<MmMeetingParagraph> list) {
        this.paragraphs = list;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setTotalContentSize(long j) {
        this._totalContentSize = j;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
