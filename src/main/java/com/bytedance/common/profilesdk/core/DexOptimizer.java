package com.bytedance.common.profilesdk.core;

import com.bytedance.common.profilesdk.AppContext;
import com.bytedance.common.profilesdk.util.CmdUtils;
import com.bytedance.common.profilesdk.util.FileUtils;
import com.bytedance.common.profilesdk.util.Logger;
import java.util.ArrayList;

public class DexOptimizer {
    public static boolean compilePrimaryDex() {
        Logger.m15163d("Compiling Primary Dex with PMS");
        for (int i = 0; i < 2; i++) {
            long creationTime = FileUtils.getCreationTime(AppContext.getPackageImagePath());
            CmdUtils.execCmd(getBgDexoptOptions(false, true));
            if (FileUtils.getCreationTime(AppContext.getPackageImagePath()) > creationTime) {
                Logger.m15163d("Image update -> " + AppContext.getPackageImagePath());
                return true;
            }
        }
        return false;
    }

    static String[] getBgDexoptOptions(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("cmd");
        arrayList.add("package");
        arrayList.add("compile");
        if (z2) {
            arrayList.add("-f");
        }
        arrayList.add("-r");
        arrayList.add("bg-dexopt");
        if (z) {
            arrayList.add("--secondary-dex");
        }
        arrayList.add(AppContext.getPackageName());
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
