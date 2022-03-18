package com.ss.android.lark.widget.photo_picker.animation;

public abstract class BaseData {

    public enum AnimationType {
        TRANSLATE_ANIMATION(0),
        ALPHA_ANIMATION(1);
        
        int value;

        public int getValue() {
            return this.value;
        }

        public static AnimationType forValue(int i) {
            if (i == 0) {
                return TRANSLATE_ANIMATION;
            }
            if (i != 1) {
                return TRANSLATE_ANIMATION;
            }
            return ALPHA_ANIMATION;
        }

        private AnimationType(int i) {
            this.value = i;
        }
    }
}
