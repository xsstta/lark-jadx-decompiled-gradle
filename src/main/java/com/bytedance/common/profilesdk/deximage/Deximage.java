package com.bytedance.common.profilesdk.deximage;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.profilesdk.AppContext;
import com.bytedance.common.profilesdk.util.Logger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Deximage {
    public static boolean sDebug;
    public static Executor sExecutor = Executors.newCachedThreadPool();
    private static boolean sInited;

    public static ProfileEditorBuilder createEditorBuidler() {
        return new ProfileEditorBuilder(AppContext.getContext());
    }

    public static class ProfileEditorBuilder {
        final Context mContext;
        private String mDexPath;
        private final List<String> mListFileNames = new ArrayList();
        private String mName = "none";
        private boolean mNeedCompile;
        private boolean mNeverSkip;
        private boolean mPreloadClass = true;
        private String mVersion = "0";

        public ProfileEditor build() {
            ProfileEditor profileEditor = new ProfileEditor(this.mContext);
            profileEditor.mNeedCompile = this.mNeedCompile;
            profileEditor.mNeverSkip = this.mNeverSkip;
            profileEditor.mDexPath = this.mDexPath;
            profileEditor.mPreloadClass = this.mPreloadClass;
            profileEditor.mName = this.mName;
            profileEditor.mVersion = this.mVersion;
            profileEditor.mListFileNames = this.mListFileNames;
            return profileEditor;
        }

        public ProfileEditorBuilder name(String str) {
            this.mName = str;
            return this;
        }

        public ProfileEditorBuilder classList(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.mListFileNames.add(str);
            }
            return this;
        }

        ProfileEditorBuilder(Context context) {
            this.mContext = context.getApplicationContext();
        }
    }

    public static void setDebug(boolean z) {
        sDebug = z;
        Logger.enable(z);
    }

    public static void init(Context context, final boolean z) {
        init(context, new DeximageConfig() {
            /* class com.bytedance.common.profilesdk.deximage.Deximage.C36241 */

            @Override // com.bytedance.common.profilesdk.deximage.DeximageConfig
            public boolean isDebugMode() {
                return z;
            }
        });
    }

    public static void init(Context context, DeximageConfig deximageConfig) {
        if (!sInited) {
            if (deximageConfig == null) {
                deximageConfig = new DeximageConfig();
            }
            AppContext.init(context);
            sInited = true;
            setDebug(deximageConfig.isDebugMode());
        }
    }
}
