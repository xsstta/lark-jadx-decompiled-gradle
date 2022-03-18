package com.ss.android.lark.larkconfig.larksetting.p2106a;

import com.larksuite.component.dybrid.offlineresource.C24256d;
import com.ss.android.lark.larkconfig.export.C41149a;
import com.ss.android.lark.larkconfig.export.handler.AbstractBaseSettingHandler;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.larkconfig.larksetting.a.a */
public interface AbstractC41162a {
    void fillDefaultKey2LoadConfigMap(Map<String, C41149a> map);

    Set<String> getAllAbTestKeys();

    C24256d getOfflineResourceAPi();

    List<AbstractBaseSettingHandler> getSettingHandlers();

    boolean isFeatureEnable(String str);
}
