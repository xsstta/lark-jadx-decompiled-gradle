package com.ss.android.lark.mm.module.detail.subtitles.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.ranges.IntRange;

public class MmMeetingSentence implements Serializable {
    private int contentLength;
    public List<MmMeetingContent> contents;
    private List<MmHighlightInfo> highlight;
    private String language;
    private IntRange offsetRangeInPara;
    private String sid;
    @JSONField(name = "start_time")
    private String startTime;
    @JSONField(name = "stop_time")
    private String stopTime;

    public int getContentLength() {
        return this.contentLength;
    }

    public List<MmMeetingContent> getContents() {
        return this.contents;
    }

    public List<MmHighlightInfo> getHighlight() {
        return this.highlight;
    }

    public String getLanguage() {
        return this.language;
    }

    public IntRange getOffsetRangeInPara() {
        return this.offsetRangeInPara;
    }

    public String getSid() {
        return this.sid;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getStopTime() {
        return this.stopTime;
    }

    public void setContentLength(int i) {
        this.contentLength = i;
    }

    public void setContents(List<MmMeetingContent> list) {
        this.contents = list;
    }

    public void setHighlight(List<MmHighlightInfo> list) {
        this.highlight = list;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setOffsetRangeInPara(IntRange kVar) {
        this.offsetRangeInPara = kVar;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStopTime(String str) {
        this.stopTime = str;
    }
}
