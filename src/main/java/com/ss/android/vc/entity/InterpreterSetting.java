package com.ss.android.vc.entity;

import java.io.Serializable;

public class InterpreterSetting implements Serializable {
    public long confirmInterpretationTime;
    public ConfirmStatus confirmStatus = ConfirmStatus.RESERVE;
    public LanguageType firstLanguage;
    public long interpreteSetTime;
    public LanguageType interpretingLanguage;
    public LanguageType secondLanguage;

    public enum ConfirmStatus {
        RESERVE(0),
        WAIT_CONFIRM(1),
        CONFIRMED(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static ConfirmStatus forNumber(int i) {
            if (i == 0) {
                return RESERVE;
            }
            if (i == 1) {
                return WAIT_CONFIRM;
            }
            if (i != 2) {
                return null;
            }
            return CONFIRMED;
        }

        private ConfirmStatus(int i) {
            this.value = i;
        }
    }

    public static InterpreterSetting copyInterpreterSetting(InterpreterSetting interpreterSetting) {
        if (interpreterSetting == null) {
            return null;
        }
        InterpreterSetting interpreterSetting2 = new InterpreterSetting();
        interpreterSetting2.confirmStatus = interpreterSetting.confirmStatus;
        interpreterSetting2.firstLanguage = interpreterSetting.firstLanguage;
        interpreterSetting2.secondLanguage = interpreterSetting.secondLanguage;
        interpreterSetting2.interpretingLanguage = interpreterSetting.interpretingLanguage;
        interpreterSetting2.confirmInterpretationTime = interpreterSetting.confirmInterpretationTime;
        interpreterSetting2.interpreteSetTime = interpreterSetting.interpreteSetTime;
        return interpreterSetting2;
    }
}
