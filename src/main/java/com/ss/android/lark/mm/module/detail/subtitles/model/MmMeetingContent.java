package com.ss.android.lark.mm.module.detail.subtitles.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import kotlin.ranges.IntRange;

public class MmMeetingContent implements Serializable {
    private String cid;
    private String content;
    private String language;
    private IntRange offsetInParaRange;
    private IntRange offsetInSentenceRange;
    @JSONField(name = "start_time")
    private String startTime;
    @JSONField(name = "stop_time")
    private String stopTime;

    public String getCid() {
        return this.cid;
    }

    public String getContent() {
        return this.content;
    }

    public String getLanguage() {
        return this.language;
    }

    public IntRange getOffsetInParaRange() {
        return this.offsetInParaRange;
    }

    public IntRange getOffsetInSentenceRange() {
        return this.offsetInSentenceRange;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getStopTime() {
        return this.stopTime;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setOffsetInParaRange(IntRange kVar) {
        this.offsetInParaRange = kVar;
    }

    public void setOffsetInSentenceRange(IntRange kVar) {
        this.offsetInSentenceRange = kVar;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStopTime(String str) {
        this.stopTime = str;
    }
}
