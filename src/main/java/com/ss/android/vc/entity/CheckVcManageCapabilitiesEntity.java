package com.ss.android.vc.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CheckVcManageCapabilitiesEntity implements Serializable {
    public CheckResult mCheckResult = CheckResult.UNKNOWN;
    public List<String> mI18nKeys = new ArrayList();

    public enum CheckResult {
        UNKNOWN(0),
        SUCCESS(1),
        NEED_NOTICE(2);
        
        private int _value;

        public int getNumber() {
            return this._value;
        }

        public static CheckResult fromValue(int i) {
            if (i == 1) {
                return SUCCESS;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return NEED_NOTICE;
        }

        private CheckResult(int i) {
            this._value = i;
        }
    }
}
