package com.larksuite.component.openplatform.core.loader.jsbundle.abs;

import android.content.Context;
import com.bytedance.ee.lark.infra.sandbox.context.IBaseService;
import com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.d */
public interface AbstractC24540d extends IBaseService {
    /* renamed from: a */
    Map<String, ReadyJSComponent> mo87366a(List<String> list);

    /* renamed from: a */
    void mo87367a(Context context);

    /* renamed from: a */
    void mo87368a(Context context, List<String> list, int i);

    /* renamed from: a */
    void mo87369a(Context context, List<String> list, IJSComponentManager.AbstractC24523a aVar);

    /* renamed from: b */
    String mo87371b(Context context);

    /* renamed from: c */
    File mo87372c(Context context);

    /* renamed from: d */
    void mo87373d(Context context);

    /* renamed from: e */
    void mo87374e(Context context);
}
