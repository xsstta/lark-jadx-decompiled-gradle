package com.ss.android.lark.image.p1959b;

import android.content.Context;
import com.larksuite.framework.http.response.C26014a;
import com.ss.android.lark.biz.core.api.resource.Resource;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.entity.C38825c;
import com.ss.android.lark.image.entity.PassThroughImage;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.image.b.a */
public interface AbstractC38820a {
    /* renamed from: a */
    Context mo142254a();

    /* renamed from: a */
    Resource mo142255a(C38824b bVar);

    /* renamed from: a */
    String mo142256a(PassThroughImage passThroughImage);

    /* renamed from: a */
    String mo142257a(C38825c cVar);

    /* renamed from: a */
    List<C26014a> mo142258a(String str);

    /* renamed from: a */
    void mo142259a(String str, Map<String, Float> map, Map<String, String> map2, Map<String, String> map3, boolean z);

    /* renamed from: a */
    void mo142260a(String str, JSONObject jSONObject);

    /* renamed from: a */
    byte[] mo142261a(AvatarImage avatarImage);

    /* renamed from: b */
    long mo142262b();

    /* renamed from: b */
    boolean mo142263b(String str);

    /* renamed from: c */
    long mo142264c();
}
