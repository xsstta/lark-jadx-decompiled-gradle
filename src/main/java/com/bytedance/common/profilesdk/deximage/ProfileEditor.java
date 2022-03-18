package com.bytedance.common.profilesdk.deximage;

import android.content.Context;
import android.os.Build;
import com.bytedance.common.profilesdk.AppContext;
import com.bytedance.common.profilesdk.DeximageMonitor;
import com.bytedance.common.profilesdk.util.Logger;
import com.bytedance.common.profilesdk.util.VersionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class ProfileEditor {
    public static int RESULT_COMPILED_NOIMAGE = 107;
    public static int RESULT_FAILED_COMPILED = 108;
    public static int RESULT_FAILED_CREATE_LIST = 102;
    public static int RESULT_FAILED_CREATE_PROFILE = 103;
    public static int RESULT_FAILED_MERGE_CUR = 104;
    public static int RESULT_FAILED_UNSUPPORTED = 101;
    public static int RESULT_SUCCESS_IMAGE = 1;
    public static int RESULT_SUCCESS_MERGED = 2;
    public static int RESULT_SUCCESS_NOTHINGTODO = 5;
    public static int RESULT_SUCCESS_SKIP_IMAGE = 3;
    public static int RESULT_SUCCESS_SKIP_NOIMAGE = 4;
    Set<String> mClassSet = new HashSet();
    final Context mContext;
    String mDexPath;
    List<String> mListFileNames = Collections.emptyList();
    String mName = "none";
    boolean mNeedCompile;
    boolean mNeverSkip;
    List<String> mPendingClasses = new ArrayList();
    boolean mPreloadClass;
    String mVersion = "0";

    public boolean versionSupport() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public boolean versionSupportProfile() {
        if (VersionUtils.isO() || VersionUtils.isP() || VersionUtils.isQ() || VersionUtils.isR()) {
            return true;
        }
        return false;
    }

    private String getClassListFileName() {
        return "classes_" + this.mName + "_" + this.mVersion + ".list";
    }

    private String getProfileFileName() {
        return "cart_" + this.mName + "_" + this.mVersion + ".prof";
    }

    public int commit() {
        Logger.m15163d("ProfileEditor.commit");
        if (!versionSupport()) {
            return RESULT_FAILED_UNSUPPORTED;
        }
        long currentTimeMillis = System.currentTimeMillis();
        checkClasses();
        if (this.mPreloadClass) {
            loadClasses((String[]) this.mClassSet.toArray(new String[0]));
        }
        int commitProfile = commitProfile();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("commit_took", currentTimeMillis2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("commit_ret", commitProfile);
            DeximageMonitor.getSdkMonitor().monitorEvent("editor_commit", jSONObject2, jSONObject, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return commitProfile;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r5.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dc, code lost:
        r6.addSuppressed(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0193, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0198, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0199, code lost:
        r3.addSuppressed(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019c, code lost:
        throw r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void checkClasses() {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.profilesdk.deximage.ProfileEditor.checkClasses():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d3, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r4.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dc, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int commitProfile() {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.profilesdk.deximage.ProfileEditor.commitProfile():int");
    }

    public ProfileEditor(Context context) {
        this.mContext = context;
    }

    public static void loadClasses(String[] strArr) {
        long currentTimeMillis = System.currentTimeMillis();
        int i = 0;
        int i2 = 0;
        for (String str : strArr) {
            try {
                Class.forName(str, false, AppContext.getContext().getClassLoader());
                i++;
            } catch (ClassNotFoundException unused) {
                i2++;
                Logger.m15163d("LoadClasses: class not found " + str);
            }
        }
        Logger.m15163d("LoadClasses: load " + i + ", " + i2 + " not found, took " + (System.currentTimeMillis() - currentTimeMillis) + "ms");
    }
}
