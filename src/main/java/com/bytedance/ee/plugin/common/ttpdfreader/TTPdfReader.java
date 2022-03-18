package com.bytedance.ee.plugin.common.ttpdfreader;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.util.List;
import org.json.JSONObject;

public abstract class TTPdfReader {

    public interface Listener {
        void onError(int i, Bundle bundle);

        void onInfo(int i, Bundle bundle);

        void onReport(String str, JSONObject jSONObject);
    }

    public void SetImageLoader(IReaderImageLoader iReaderImageLoader) {
    }

    public void clearMarks() {
    }

    public void clearSelection() {
    }

    public abstract void close();

    public void drawSnapshot(Canvas canvas) {
    }

    public int getCurrentPage() {
        return -1;
    }

    public float getMaxScale() {
        return 1.0f;
    }

    public float getMinScale() {
        return 1.0f;
    }

    public abstract SizeF getPageSize(int i);

    public float getScale() {
        return 1.0f;
    }

    public abstract List<Bookmark> getTableOfContents();

    public int getTotalPage() {
        return 0;
    }

    public abstract String getVersion();

    public abstract View getView();

    public abstract PagePart loadPageSync(int i, float f, float f2, RectF rectF, boolean z, boolean z2) throws Exception;

    public void markText(int i, int i2, int i3, int i4, int i5) {
    }

    public abstract void open(Uri uri, String str, String str2);

    public void refresh() {
    }

    public void scrollXY(int i, int i2) {
    }

    public void selectSearchResult(int i) {
    }

    public void setContentLoader(IReaderContentLoader iReaderContentLoader) {
    }

    public void setListener(Listener listener) {
    }

    public void setMarkClient(IReaderMarkClient iReaderMarkClient) {
    }

    public abstract void setOptions(SparseArray<String> sparseArray);

    public void setPageErrorTips(String str) {
    }

    public void setScale(float f) {
    }

    public void setSearchClient(IReaderSearchClient iReaderSearchClient) {
    }

    public void setSelectionClient(IReaderSelectionClient iReaderSelectionClient) {
    }

    public void setStreamingDownloader(IStreamingDownloader iStreamingDownloader) {
    }

    public void startSearch(String str, boolean z) {
    }

    public void stopSearch() {
    }

    public void turnTo(int i) {
    }

    public void updateBackgroundStatus(boolean z) {
    }
}
