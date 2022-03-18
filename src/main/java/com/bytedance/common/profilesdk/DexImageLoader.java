package com.bytedance.common.profilesdk;

import android.text.TextUtils;
import com.bytedance.common.profilesdk.core.Profman;
import com.bytedance.common.profilesdk.util.FileUtils;
import com.bytedance.common.profilesdk.util.Logger;
import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

public class DexImageLoader {
    public static boolean deleteFile(File file) {
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return file.delete();
    }

    public static List<String> dumpClassesFromDexFile(DexFile dexFile, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (dexFile == null) {
            return arrayList;
        }
        try {
            Enumeration<String> entries = dexFile.entries();
            while (entries.hasMoreElements()) {
                String nextElement = entries.nextElement();
                if (z) {
                    arrayList.add("L" + nextElement.replace('.', '/') + ";");
                } else {
                    arrayList.add(nextElement);
                }
            }
        } catch (Exception unused) {
            Logger.m15163d("exception dumping classes.");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        if (r0.isEmpty() != false) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> dumpClassesFromDexFile(java.lang.String r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.profilesdk.DexImageLoader.dumpClassesFromDexFile(java.lang.String, boolean):java.util.List");
    }

    public static class ProfileChoreographer {
        public static boolean createProfileFromList(String str, File file, File file2) {
            if (!FileUtils.isFileValid(file)) {
                return false;
            }
            if (TextUtils.isEmpty(str)) {
                Logger.m15163d("illegal dex location.");
                return false;
            }
            File file3 = new File(str);
            if (!file3.exists()) {
                Logger.m15163d("dex location does not exist.");
                return false;
            }
            Profman.Builder builder = new Profman.Builder();
            Profman.Builder addOption = builder.addOption("--create-profile-from=" + file.toString());
            Profman.Builder addOption2 = addOption.addOption("--apk=" + file3.toString());
            Profman.Builder addOption3 = addOption2.addOption("--dex-location=" + file3.getName());
            if (addOption3.addOption("--reference-profile-file=" + file2.toString()).build().run() == 0) {
                return true;
            }
            return false;
        }

        public static synchronized boolean mergeProfiles(File file, File file2, boolean z, boolean z2) {
            boolean z3;
            Exception e;
            boolean z4;
            synchronized (ProfileChoreographer.class) {
                Logger.m15163d("Try to merge current profile:" + file + " with reference profile:" + file2);
                boolean z5 = false;
                if (!FileUtils.isFileValid(file) || file2 == null) {
                    return false;
                }
                try {
                    if (TextUtils.equals(file.getCanonicalPath(), file2.getCanonicalPath())) {
                        Logger.m15163d("Skip identical currentProfile and referenceProfile");
                        return false;
                    }
                    if (!FileUtils.createIfNotExist(file2)) {
                        Logger.m15163d("fail to create " + file2.getAbsolutePath());
                    }
                    Profman.Builder builder = new Profman.Builder();
                    Profman.Builder addOption = builder.addOption("--profile-file=" + file.toString());
                    Profman.Builder addOption2 = addOption.addOption("--reference-profile-file=" + file2.toString());
                    if (z2) {
                        addOption2.addOption("--force-merge");
                    }
                    int run = addOption2.build().run();
                    if (run != 0) {
                        if (run == 1) {
                            Logger.m15163d("There is not enough new information added by the current profiles, skip.");
                        } else if (run == 2) {
                            Logger.m15163d("Bad profiles in merging " + file + " and " + file2 + ", do clean-up.");
                            z5 = true;
                            z3 = false;
                            z4 = true;
                            if (z && z5) {
                                Logger.m15163d("Clearing profile: " + file);
                                DexImageLoader.deleteFile(file);
                                file.createNewFile();
                            }
                            if (z && z4) {
                                DexImageLoader.deleteFile(file2);
                            }
                            if (!(run == 0 || run == 1) || !FileUtils.isFileValid(file2)) {
                                Logger.m15163d("Failed to merge reference profile:" + file2);
                            }
                            return z3;
                        } else if (run == 3 || run == 4) {
                            Logger.m15163d("IO error while reading profiles " + file + " and " + file2);
                        } else {
                            Logger.m15163d("Unknown error code while processing profiles " + file + " and " + file2);
                        }
                        z3 = false;
                    } else {
                        Logger.m15163d("Profman: Profiles merged successfully.");
                        z5 = true;
                        z3 = true;
                    }
                    z4 = false;
                    try {
                        Logger.m15163d("Clearing profile: " + file);
                        DexImageLoader.deleteFile(file);
                        file.createNewFile();
                        DexImageLoader.deleteFile(file2);
                        Logger.m15163d("Failed to merge reference profile:" + file2);
                    } catch (Exception e2) {
                        e = e2;
                        z5 = z3;
                        Logger.m15165e(e.toString(), e);
                        z3 = z5;
                        return z3;
                    }
                    return z3;
                } catch (Exception e3) {
                    e = e3;
                    Logger.m15165e(e.toString(), e);
                    z3 = z5;
                    return z3;
                }
            }
        }
    }
}
