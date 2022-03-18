package com.he.loader;

import android.content.Context;

public interface SettingsProvider {
    int getSetting(Context context, Enum<?> v, int i);

    String getSetting(Context context, Enum<?> v, String str);

    boolean getSetting(Context context, Enum<?> v, boolean z);
}
