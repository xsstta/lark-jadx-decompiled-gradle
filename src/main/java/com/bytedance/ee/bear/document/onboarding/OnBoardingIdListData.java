package com.bytedance.ee.bear.document.onboarding;

import com.bytedance.ee.util.io.NonProguard;
import java.util.Arrays;

public class OnBoardingIdListData implements NonProguard {
    private String[] ids;

    public String[] getIds() {
        return this.ids;
    }

    public String toString() {
        return "OnBoardingIdListData{ids=" + Arrays.toString(this.ids) + '}';
    }

    public void setIds(String[] strArr) {
        this.ids = strArr;
    }
}
