package com.ss.android.lark.mm.module.record.model;

import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingContent;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MmRecordSentence implements Serializable {
    private boolean isFinal;
    private String language;
    private String objectToken;
    private String pid;
    private String sentences;
    private String sid;
    private String startTime;
    private String stopTime;
    private List<MmRecordWord> words;

    public String getLanguage() {
        return this.language;
    }

    public String getObjectToken() {
        return this.objectToken;
    }

    public String getPid() {
        return this.pid;
    }

    public String getSentences() {
        return this.sentences;
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

    public List<MmRecordWord> getWords() {
        return this.words;
    }

    public boolean isFinal() {
        return this.isFinal;
    }

    public int hashCode() {
        return Objects.hash(this.objectToken, this.pid, this.sid, Boolean.valueOf(this.isFinal), this.sentences);
    }

    public void setFinal(boolean z) {
        this.isFinal = z;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setObjectToken(String str) {
        this.objectToken = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setSentences(String str) {
        this.sentences = str;
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

    public void setWords(List<MmRecordWord> list) {
        this.words = list;
    }

    public static MmRecordSentence copy(MmRecordSentence mmRecordSentence) {
        MmRecordSentence mmRecordSentence2 = new MmRecordSentence();
        mmRecordSentence2.isFinal = mmRecordSentence.isFinal;
        mmRecordSentence2.language = mmRecordSentence.language;
        mmRecordSentence2.sid = mmRecordSentence.sid;
        mmRecordSentence2.startTime = mmRecordSentence.startTime;
        mmRecordSentence2.stopTime = mmRecordSentence.stopTime;
        mmRecordSentence2.sentences = mmRecordSentence.sentences;
        return mmRecordSentence2;
    }

    public static MmRecordSentence fromMeetingSentence(MmMeetingSentence mmMeetingSentence) {
        MmRecordSentence mmRecordSentence = new MmRecordSentence();
        mmRecordSentence.isFinal = true;
        mmRecordSentence.language = mmMeetingSentence.getLanguage();
        mmRecordSentence.sid = mmMeetingSentence.getSid();
        mmRecordSentence.startTime = mmMeetingSentence.getStartTime();
        mmRecordSentence.stopTime = mmMeetingSentence.getStopTime();
        ArrayList arrayList = new ArrayList();
        for (MmMeetingContent mmMeetingContent : mmMeetingSentence.getContents()) {
            arrayList.add(MmRecordWord.fromMeetingWord(mmMeetingContent));
        }
        mmRecordSentence.words = arrayList;
        return mmRecordSentence;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MmRecordSentence mmRecordSentence = (MmRecordSentence) obj;
        if (this.isFinal != mmRecordSentence.isFinal || !Objects.equals(this.objectToken, mmRecordSentence.objectToken) || !Objects.equals(this.pid, mmRecordSentence.pid) || !Objects.equals(this.sid, mmRecordSentence.sid) || !Objects.equals(this.sentences, mmRecordSentence.sentences)) {
            return false;
        }
        return true;
    }
}
