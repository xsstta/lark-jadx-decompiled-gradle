package com.ss.android.lark.dto.translate;

import java.io.Serializable;

public class TranslateFeedback implements Serializable {
    private String comment;
    private Evaluation evaluation;

    public enum Evaluation {
        UNKNOWN(0),
        VERY_GOOD(1),
        CANNOT_UNDERSTAND(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Evaluation valueOf(int i) {
            return forNumber(i);
        }

        public static Evaluation forNumber(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return VERY_GOOD;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return CANNOT_UNDERSTAND;
        }

        private Evaluation(int i) {
            this.value = i;
        }
    }

    public String getComment() {
        return this.comment;
    }

    public Evaluation getEvaluation() {
        return this.evaluation;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setEvaluation(Evaluation evaluation2) {
        this.evaluation = evaluation2;
    }
}
