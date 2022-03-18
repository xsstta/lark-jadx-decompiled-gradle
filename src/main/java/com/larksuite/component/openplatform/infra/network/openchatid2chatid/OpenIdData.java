package com.larksuite.component.openplatform.infra.network.openchatid2chatid;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class OpenIdData implements Serializable {
    @SerializedName("encryptedData")
    private String encryptedData;

    public String getEncryptedData() {
        return this.encryptedData;
    }
}
