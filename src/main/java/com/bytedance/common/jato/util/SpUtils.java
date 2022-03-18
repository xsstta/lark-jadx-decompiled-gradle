package com.bytedance.common.jato.util;

import android.content.SharedPreferences;
import com.bytedance.common.jato.Jato;

public class SpUtils {
    public static SharedPreferences getSp() {
        return Jato.getContext().getSharedPreferences("start_up_fdio", 0);
    }
}
