package com.bytedance.ee.bear.document.offline.sync.sync;

import java.io.Serializable;

public class SyncStatusModel implements Serializable {
    public String objToken;
    public int status;
}
