package com.ss.android.lark.passport.infra.entity;

import com.ss.android.lark.passport.signinsdk_api.env.HostEnvBean;
import java.io.Serializable;

public class RecoverEnvEntity implements Serializable {
    String oldConfigEnv;
    String oldDeviceId;
    HostEnvBean oldHostEnvBean;

    public String getOldConfigEnv() {
        return this.oldConfigEnv;
    }

    public String getOldDeviceId() {
        return this.oldDeviceId;
    }

    public HostEnvBean getOldHostEnvBean() {
        return this.oldHostEnvBean;
    }

    public RecoverEnvEntity(HostEnvBean hostEnvBean, String str, String str2) {
        this.oldHostEnvBean = hostEnvBean;
        this.oldDeviceId = str;
        this.oldConfigEnv = str2;
    }
}
