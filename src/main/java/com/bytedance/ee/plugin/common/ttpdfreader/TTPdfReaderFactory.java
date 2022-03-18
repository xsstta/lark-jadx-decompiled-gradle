package com.bytedance.ee.plugin.common.ttpdfreader;

import android.content.Context;
import com.bytedance.ee.plugin.common.IPluginApi;

public interface TTPdfReaderFactory extends IPluginApi {
    TTPdfReader create(Context context);
}
