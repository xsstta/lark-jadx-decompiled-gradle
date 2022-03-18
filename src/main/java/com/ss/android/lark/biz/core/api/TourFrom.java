package com.ss.android.lark.biz.core.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TourFrom {

    @Retention(RetentionPolicy.SOURCE)
    public @interface AddTeamMember {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface SettingTeamName {
    }
}
