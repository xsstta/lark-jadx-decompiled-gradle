package com.tt.miniapp.settings.v2.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class ConfigSchemaParameterList implements Serializable {
    @SerializedName("configAppList")
    public List<C66814a> configAppList;

    /* renamed from: com.tt.miniapp.settings.v2.model.ConfigSchemaParameterList$a */
    public class C66814a {
        @SerializedName("appId")

        /* renamed from: a */
        public String f168548a;
        @SerializedName("configSchemaParameterList")

        /* renamed from: b */
        public List<C66815b> f168549b;
    }

    /* renamed from: com.tt.miniapp.settings.v2.model.ConfigSchemaParameterList$b */
    public class C66815b {
        @SerializedName("key")

        /* renamed from: a */
        public String f168550a;
        @SerializedName("value")

        /* renamed from: b */
        public String f168551b;
    }
}
