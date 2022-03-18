package com.ss.ttvideoengine.preload;

import android.text.TextUtils;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

public class PreloadConfig {
    public String mCurrentSceneId;
    public int mMaxSceneCount = 10;

    /* access modifiers changed from: private */
    public static class SingleBuilder {
        public static PreloadConfig single = new PreloadConfig();

        private SingleBuilder() {
        }
    }

    public static PreloadConfig share() {
        return SingleBuilder.single;
    }

    public String getCurrentSceneId() {
        return this.mCurrentSceneId;
    }

    public void createScene(PreloadScene preloadScene) {
        TTVideoEngineLog.m256505i("PreloadConfig", "create scene " + preloadScene.mSceneId);
        if (preloadScene != null && !TextUtils.isEmpty(preloadScene.mSceneId)) {
            DataLoaderHelper.getDataLoader().createScene(preloadScene);
        }
    }

    public void destroyScene(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTVideoEngineLog.m256505i("PreloadConfig", "destroy scene " + str);
            DataLoaderHelper.getDataLoader().destroyScene(str);
            String str2 = this.mCurrentSceneId;
            if (str2 != null && str2.equals(str)) {
                this.mCurrentSceneId = null;
            }
        }
    }

    public boolean moveToScene(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        TTVideoEngineLog.m256505i("PreloadConfig", "move to scene " + str);
        String str2 = this.mCurrentSceneId;
        if (str2 != null && str2.equals(str)) {
            return true;
        }
        this.mCurrentSceneId = str;
        DataLoaderHelper.getDataLoader().moveToScene(str);
        return true;
    }
}
