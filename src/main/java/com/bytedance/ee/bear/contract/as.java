package com.bytedance.ee.bear.contract;

import java.util.List;

public interface as {
    void clearOffMemCache();

    void clearOfflineDB();

    void delDocs(String str);

    void delDocsList(List<String> list);
}
