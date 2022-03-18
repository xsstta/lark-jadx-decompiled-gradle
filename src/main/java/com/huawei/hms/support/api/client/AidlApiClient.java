package com.huawei.hms.support.api.client;

import com.huawei.hms.core.aidl.AbstractC23528d;
import java.util.List;

public interface AidlApiClient extends ApiClient {
    List<String> getApiNameList();

    AbstractC23528d getService();
}
