package com.bytedance.push.settings;

import android.content.Context;
import org.json.JSONObject;

public interface ISettings {
    void registerValChanged(Context context, String str, String str2, AbstractC20511a aVar);

    void unregisterValChanged(AbstractC20511a aVar);

    void updateSettings(Context context, JSONObject jSONObject);
}
