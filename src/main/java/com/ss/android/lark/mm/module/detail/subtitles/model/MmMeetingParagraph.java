package com.ss.android.lark.mm.module.detail.subtitles.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import java.io.Serializable;
import java.util.List;

public class MmMeetingParagraph implements Serializable {
    private String _displayStartTime;
    private long _paraContentSize;
    private String _paraContents;
    private List<MmHighlightInfo> commentRenderHighlightModel;
    private String pid;
    private List<MmMeetingSentence> sentences;
    private MmParticipants.MmParticipantInfo speaker;
    @JSONField(name = "start_time")
    private String startTime;
    @JSONField(name = "stop_time")
    private String stopTime;
    private List<SentenceHighlightInfoViewModel> syncHighLightModel;

    public List<MmHighlightInfo> getCommentRenderHighlightModel() {
        return this.commentRenderHighlightModel;
    }

    public String getDisplayStartTime() {
        return this._displayStartTime;
    }

    public long getParaContentSize() {
        return this._paraContentSize;
    }

    public String getParaContents() {
        return this._paraContents;
    }

    public String getPid() {
        return this.pid;
    }

    public List<MmMeetingSentence> getSentences() {
        return this.sentences;
    }

    public MmParticipants.MmParticipantInfo getSpeaker() {
        return this.speaker;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getStopTime() {
        return this.stopTime;
    }

    public List<SentenceHighlightInfoViewModel> getSyncHighLightModel() {
        return this.syncHighLightModel;
    }

    public void setCommentRenderHighlightModel(List<MmHighlightInfo> list) {
        this.commentRenderHighlightModel = list;
    }

    public void setDisplayStartTime(String str) {
        this._displayStartTime = str;
    }

    public void setParaContentSize(long j) {
        this._paraContentSize = j;
    }

    public void setParaContents(String str) {
        this._paraContents = str;
    }

    public void setPid(String str) {
        this.pid = str;
    }

    public void setSentences(List<MmMeetingSentence> list) {
        this.sentences = list;
    }

    public void setSpeaker(MmParticipants.MmParticipantInfo mmParticipantInfo) {
        this.speaker = mmParticipantInfo;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setStopTime(String str) {
        this.stopTime = str;
    }

    public void setSyncHighLightModel(List<SentenceHighlightInfoViewModel> list) {
        this.syncHighLightModel = list;
    }
}
