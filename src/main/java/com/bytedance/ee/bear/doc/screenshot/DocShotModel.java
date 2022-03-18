package com.bytedance.ee.bear.doc.screenshot;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;

public class DocShotModel implements BaseJSModel {
    public int image_count;
    public int image_load_count;
    public boolean image_load_timeout;
    public boolean success;
}
