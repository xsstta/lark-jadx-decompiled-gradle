package com.bytedance.ee.plugin.common.ttreader;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.util.Map;
import org.json.JSONObject;

public interface ITTReaderViewWrapper {

    public interface IReaderImageLoader {
        Bitmap load(String str);
    }

    public interface Listener {
        void onError(int i, Bundle bundle);

        void onInfo(int i, Bundle bundle);

        void onReport(String str, JSONObject jSONObject);
    }

    void SetImageLoader(IReaderImageLoader iReaderImageLoader);

    void closeBook();

    int getCurrentPage();

    float getMaxScale();

    float getMinScale();

    float getScale();

    View getTTReaderView();

    int getTotalPage();

    String getVersion();

    void openBook(Uri uri);

    void openBook(Uri uri, String str);

    void openBook(Uri uri, String str, String str2);

    void openBook(Uri uri, String str, String str2, Map<String, String> map);

    void openBook(String str);

    void refresh();

    void resetOptions();

    void scrollXY(int i, int i2);

    void setListener(Listener listener);

    void setOption(int i, String str);

    void setScale(float f);

    void turnTo(int i);
}
