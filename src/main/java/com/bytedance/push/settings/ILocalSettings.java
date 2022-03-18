package com.bytedance.push.settings;

import android.content.Context;

public interface ILocalSettings {
    void registerValChanged(Context context, String str, String str2, AbstractC20511a aVar);

    void unregisterValChanged(AbstractC20511a aVar);
}
