package com.ss.android.lark.voip.service.impl.service;

import com.ss.android.lark.voip.service.impl.C58151d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VoiceCallFeedback implements Serializable {
    private String comment;
    private Evaluation evaluation = Evaluation.UNKNOWN;
    private List<Tag> tags = new ArrayList();

    public enum Evaluation {
        UNKNOWN(0),
        GOOD_QUALITY(1),
        POOR_QUALITY(2);
        
        public int value;

        public int getNumber() {
            return this.value;
        }

        private Evaluation(int i) {
            this.value = i;
        }
    }

    public enum Tag {
        UNKNOWN(0),
        HUNG_UP_UNEXPECTEDLY(1),
        NOT_CLEAR_AND_NOISY(2),
        GOES_ON_AND_OFF(3),
        CANNOT_HEAR(4),
        OTHER(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        private Tag(int i) {
            this.value = i;
        }
    }

    public String getComment() {
        return this.comment;
    }

    public Evaluation getEvaluation() {
        return this.evaluation;
    }

    public List<Tag> getTags() {
        return this.tags;
    }

    public VoiceCallFeedback setComment(String str) {
        C58151d.m225578a("ui", "ui", "feedback comment " + str, "[VoiceCallFeedback] setComment: comment = " + str);
        this.comment = str;
        return this;
    }

    public VoiceCallFeedback setTags(List<Tag> list) {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("[VoiceCallFeedback] setTags: list_num = ");
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = "";
        }
        sb.append(obj);
        C58151d.m225578a("ui", "ui", "feedback tags set", sb.toString());
        this.tags = list;
        return this;
    }

    public VoiceCallFeedback setEvaluation(Evaluation evaluation2) {
        if (evaluation2 != null) {
            C58151d.m225578a("ui", "ui", "feedback evaluation " + evaluation2.name(), "[VoiceCallFeedback] setEvaluation: name = " + evaluation2.name() + ", value = " + evaluation2.value);
        } else {
            C58151d.m225578a("ui", "ui", "feedback evaluation null", "[VoiceCallFeedback] setEvaluation: evaluation null");
        }
        this.evaluation = evaluation2;
        return this;
    }
}
