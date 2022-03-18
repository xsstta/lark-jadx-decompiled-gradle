package com.larksuite.component.openplatform.infra.network.department;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class DepartmentIdData implements Serializable {
    @SerializedName("encryptedData")
    private String encryptedData;

    public String getEncryptedData() {
        return this.encryptedData;
    }
}
