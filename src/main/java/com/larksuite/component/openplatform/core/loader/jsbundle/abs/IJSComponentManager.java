package com.larksuite.component.openplatform.core.loader.jsbundle.abs;

import android.content.Context;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.C24545a;
import com.larksuite.component.openplatform.core.loader.jsbundle.bean.ReadyJSComponent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IJSComponentManager {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DownloadFrom {
    }

    /* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager$a */
    public interface AbstractC24523a {
        /* renamed from: a */
        void mo87362a(Map<String, ReadyJSComponent> map);
    }

    /* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager$b */
    public interface AbstractC24524b {
        /* renamed from: a */
        void mo87408a(String str);

        /* renamed from: a */
        void mo87409a(String str, String str2);
    }

    /* renamed from: com.larksuite.component.openplatform.core.loader.jsbundle.abs.IJSComponentManager$c */
    public interface AbstractC24525c {
        /* renamed from: a */
        void mo87410a(ReadyJSComponent readyJSComponent);

        /* renamed from: a */
        void mo87411a(C24545a aVar, String str, String str2);
    }

    /* renamed from: a */
    List<String> mo87402a(Context context, String str, JSONObject jSONObject);

    /* renamed from: a */
    List<String> mo87403a(Context context, JSONObject jSONObject);

    /* renamed from: a */
    Map<String, ReadyJSComponent> mo87404a(List<String> list);

    /* renamed from: a */
    void mo87405a(Context context);

    /* renamed from: a */
    void mo87406a(Context context, List<String> list, int i);

    /* renamed from: a */
    void mo87407a(Context context, List<String> list, AbstractC24523a aVar);
}
