package com.larksuite.component.openplatform.core.loader.meta;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.larksuite.component.openplatform.core.loader.meta.base.ApplicationMeta;
import com.larksuite.component.openplatform.core.loader.meta.base.C24553c;
import com.larksuite.component.openplatform.core.loader.meta.base.C24555d;
import com.larksuite.component.openplatform.core.loader.meta.base.C24556e;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24560a;
import com.larksuite.component.openplatform.core.loader.meta.impl.block.C24562b;

/* renamed from: com.larksuite.component.openplatform.core.loader.meta.a */
public class C24548a {

    /* renamed from: a */
    private static Gson f60519a = new GsonBuilder().registerTypeAdapter(ApplicationMeta.class, new C24553c()).registerTypeAdapter(C24555d.class, new C24556e()).registerTypeAdapter(C24560a.class, new C24562b()).create();

    /* renamed from: a */
    public static Gson m89535a() {
        return f60519a;
    }
}
