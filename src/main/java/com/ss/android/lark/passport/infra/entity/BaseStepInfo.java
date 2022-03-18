package com.ss.android.lark.passport.infra.entity;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class BaseStepInfo implements Serializable {
    @JSONField(name = "use_package_domain")
    public boolean usePackageDomain;
}
