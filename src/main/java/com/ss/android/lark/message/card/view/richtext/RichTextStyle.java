package com.ss.android.lark.message.card.view.richtext;

public class RichTextStyle {

    /* renamed from: a */
    static final String[] f114821a = {"backgroundColor", "backgroundColorDisable", "backgroundColorActive", "borderWidth", "borderColor", "borderRadius", "backgroundColorToken", "backgroundColorDisableToken", "backgroundColorActiveToken", "borderColorToken"};

    public enum ButtonMode {
        MODE_DEFAULT("default"),
        MODE_PRIMARY("primary"),
        MODE_DANGER("danger");
        
        private String mode;

        public String getMode() {
            return this.mode;
        }

        private ButtonMode(String str) {
            this.mode = str;
        }
    }
}
