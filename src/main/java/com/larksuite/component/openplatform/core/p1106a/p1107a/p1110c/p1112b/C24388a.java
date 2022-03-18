package com.larksuite.component.openplatform.core.p1106a.p1107a.p1110c.p1112b;

import com.google.gson.annotations.SerializedName;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.a */
public class C24388a {
    @SerializedName("block_extension")

    /* renamed from: a */
    public C24389a f60193a;
    @SerializedName("block_extension_tip")

    /* renamed from: b */
    public C24390b f60194b;

    /* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.a$a */
    public static class C24389a {
        @SerializedName(UpdateKey.STATUS)

        /* renamed from: a */
        public Integer f60195a;
    }

    /* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.a$b */
    public static class C24390b {
        @SerializedName("content")

        /* renamed from: a */
        public Map<String, String> f60196a;
        @SerializedName("buttons")

        /* renamed from: b */
        public List<C24391c> f60197b;
    }

    /* renamed from: com.larksuite.component.openplatform.core.a.a.c.b.a$c */
    public static class C24391c {
        @SerializedName("content")

        /* renamed from: a */
        public Map<String, String> f60198a;
        @SerializedName("schema")

        /* renamed from: b */
        public String f60199b;
    }
}
