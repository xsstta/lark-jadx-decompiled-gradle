package com.bytedance.ee.plugin.common.ttreader;

import android.content.Context;
import com.bytedance.ee.plugin.common.IPluginApi;

public interface ITTOfficePlugin extends IPluginApi {
    ITTReaderViewWrapper newTTReaderViewWrapper(Context context);
}
