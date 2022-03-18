package com.ss.android.lark.ai.translate.feedback;

import java.io.Serializable;

public class TranslationFeedback implements Serializable {
    public boolean editedSuggestedText;
    public boolean hasSuggestedText;
    public String objectId;
    public String originLang;
    public String originText;
    public TranslationScene scene;
    private Integer score;
    public String suggestedText;
    public String targetLang;
    public String targetText;

    public enum TranslationScene {
        UNKNOWN(0),
        MESSAGE(1),
        IMAGE(2),
        HYPER(3),
        DOCS(4),
        EMAIL(5);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public int getValue() {
            return this.value;
        }

        public static TranslationScene fromNumber(int i) {
            if (i == 1) {
                return MESSAGE;
            }
            if (i == 2) {
                return IMAGE;
            }
            if (i == 3) {
                return HYPER;
            }
            if (i == 4) {
                return DOCS;
            }
            if (i != 5) {
                return UNKNOWN;
            }
            return EMAIL;
        }

        private TranslationScene(int i) {
            this.value = i;
        }
    }

    public Integer getScore() {
        return this.score;
    }

    public void setScore(int i) {
        EnumC28631a fromValue = EnumC28631a.fromValue(i);
        if (fromValue != EnumC28631a.UNKNOWN) {
            this.score = Integer.valueOf(fromValue.value);
        }
    }

    /* renamed from: com.ss.android.lark.ai.translate.feedback.TranslationFeedback$a */
    private enum EnumC28631a {
        UNKNOWN(0),
        ONE_STAR(1),
        TWO_STARS(2),
        THREE_STARS(3),
        FOUR_STARS(4),
        FIVE_STARS(5);
        
        public int value;

        public static EnumC28631a fromValue(int i) {
            if (i == 1) {
                return ONE_STAR;
            }
            if (i == 2) {
                return TWO_STARS;
            }
            if (i == 3) {
                return THREE_STARS;
            }
            if (i == 4) {
                return FOUR_STARS;
            }
            if (i != 5) {
                return UNKNOWN;
            }
            return FIVE_STARS;
        }

        private EnumC28631a(int i) {
            this.value = i;
        }
    }
}
