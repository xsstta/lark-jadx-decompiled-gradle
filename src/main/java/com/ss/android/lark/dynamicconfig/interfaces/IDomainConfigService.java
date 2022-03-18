package com.ss.android.lark.dynamicconfig.interfaces;

import com.bytedance.lark.pb.basic.v1.DomainSettings;
import com.bytedance.lark.pb.basic.v1.InitSDKRequest;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

public interface IDomainConfigService {

    @Retention(RetentionPolicy.SOURCE)
    public @interface DomainAlias {
    }

    /* renamed from: a */
    String mo136164a(DomainSettings.Alias alias);

    /* renamed from: a */
    String mo136165a(String str);

    /* renamed from: a */
    List<String> mo136166a(String str, int i, String str2);

    /* renamed from: a */
    void mo136167a();

    /* renamed from: a */
    void mo136168a(InitSDKRequest.EnvType envType, String str, DomainSettings domainSettings);

    /* renamed from: b */
    List<String> mo136169b(DomainSettings.Alias alias);

    /* renamed from: b */
    void mo136170b();
}
