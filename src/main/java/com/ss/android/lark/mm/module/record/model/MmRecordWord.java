package com.ss.android.lark.mm.module.record.model;

import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingContent;
import java.io.Serializable;

public class MmRecordWord implements Serializable {
    private String cid;
    private String content;
    private String language;
    private String startTime;
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

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStopTime(String str) {
        this.stopTime = str;
    }

    public static MmRecordWord fromMeetingWord(MmMeetingContent mmMeetingContent) {
        MmRecordWord mmRecordWord = new MmRecordWord();
        mmRecordWord.cid = mmMeetingContent.getCid();
        mmRecordWord.content = mmMeetingContent.getContent();
        mmRecordWord.language = mmMeetingContent.getLanguage();
        mmRecordWord.startTime = mmMeetingContent.getStartTime();
        mmRecordWord.stopTime = mmMeetingContent.getStopTime();
        return mmRecordWord;
    }
}
