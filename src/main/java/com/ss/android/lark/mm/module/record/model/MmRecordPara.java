package com.ss.android.lark.mm.module.record.model;

import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MmRecordPara implements Serializable {
    private String pid;
    private List<MmRecordSentence> sentences;
    private String startTime;
    private String stopTime;

    public String getPid() {
        return this.pid;
    }

    public List<MmRecordSentence> getSentences() {
        return this.sentences;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getStopTime() {
        return this.stopTime;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setSentences(List<MmRecordSentence> list) {
        this.sentences = list;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStopTime(String str) {
        this.stopTime = str;
    }

    public static MmRecordPara toMmRecordPara(MmMeetingParagraph mmMeetingParagraph) {
        MmRecordPara mmRecordPara = new MmRecordPara();
        mmRecordPara.stopTime = mmMeetingParagraph.getStopTime();
        mmRecordPara.startTime = mmMeetingParagraph.getStartTime();
        mmRecordPara.pid = mmMeetingParagraph.getPid();
        ArrayList arrayList = new ArrayList();
        for (MmMeetingSentence mmMeetingSentence : mmMeetingParagraph.getSentences()) {
            arrayList.add(MmRecordSentence.fromMeetingSentence(mmMeetingSentence));
        }
        mmRecordPara.setSentences(arrayList);
        return mmRecordPara;
    }
}
