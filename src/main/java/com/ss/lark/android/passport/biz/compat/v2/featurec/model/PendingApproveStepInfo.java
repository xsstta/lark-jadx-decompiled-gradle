package com.ss.lark.android.passport.biz.compat.v2.featurec.model;

import com.ss.android.lark.passport.infra.entity.BaseStepInfo;
import com.ss.android.lark.passport.signinsdk_api.entity.ButtonInfo;
import java.io.Serializable;

public class PendingApproveStepInfo extends BaseStepInfo implements Serializable {
    public ButtonInfo button;
    public String subtitle;
    public String title;
}
