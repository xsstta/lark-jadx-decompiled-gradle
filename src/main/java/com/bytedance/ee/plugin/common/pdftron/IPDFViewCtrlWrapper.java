package com.bytedance.ee.plugin.common.pdftron;

import android.graphics.RectF;
import android.view.View;
import com.bytedance.ee.plugin.common.pdftron.wrapper.Annot;
import com.bytedance.ee.plugin.common.pdftron.wrapper.Page;
import com.bytedance.ee.plugin.common.pdftron.wrapper.Quad;
import com.bytedance.ee.plugin.common.pdftron.wrapper.QuadPoint;
import com.bytedance.ee.plugin.common.pdftron.wrapper.Rect;
import java.util.Map;

public interface IPDFViewCtrlWrapper {

    public interface DocumentDownloadListener {
        void onDownloadEvent(int i, int i2, int i3, int i4, String str);
    }

    public interface DocumentLoadListener {
        void onDocumentLoaded();
    }

    public interface OnContentScrollChangeListener {
        void onScrollChange(View view, int i, int i2, int i3, int i4);
    }

    public interface PageChangeListener {
        void onPageChange(int i, int i2, int i3);
    }

    public interface ThumbAsyncListener {
        void onThumbReceived(int i, int[] iArr, int i2, int i3);
    }

    void addContentScrollListener(OnContentScrollChangeListener onContentScrollChangeListener);

    void addDocumentDownloadListener(DocumentDownloadListener documentDownloadListener);

    void addDocumentLoadListener(DocumentLoadListener documentLoadListener);

    void addPageChangeListener(PageChangeListener pageChangeListener);

    void addThumbAsyncListener(ThumbAsyncListener thumbAsyncListener);

    void annotPushBack(Page page, Annot annot);

    void annotPushFront(Page page, Annot annot);

    void annotRemove(Page page, Annot annot);

    void cancelAllThumbRequests();

    Quad convertToCommonQuad(int i, QuadPoint quadPoint, float f, float f2);

    RectF convertToCommonRect(Rect rect, int i, float f, float f2);

    Rect convertToPDFRect(RectF rectF, int i, float f, float f2);

    Rect convertToPDFRectOffsetCropBox(RectF rectF, int i, float f, float f2, Page page) throws Throwable;

    Annot createHighlight(Rect rect, Quad[] quadArr, int i, float f, float f2, int i2);

    Annot createPageSquare(int i, int i2);

    Annot createSquare(Rect rect, int i);

    boolean docLock(boolean z, Runnable runnable);

    boolean docLockRead(Runnable runnable);

    void docUnlock();

    void docUnlockRead();

    int getCurrentPage();

    IFindTextOverlayWrapper getFindTextOverlay();

    int getIndex(Page page);

    View getPDFViewCtrlView();

    Page getPage(int i);

    Page getPage(Annot annot);

    int getPageCount();

    QuadPoint getQuadPoint(Annot annot, int i);

    int getQuadPointCount(Annot annot);

    Rect getRect(Annot annot);

    void getThumbAsync(int i);

    IToolManagerWrapper getToolManager();

    String getUniqueID(Annot annot);

    int getViewCanvasHeight();

    boolean hasChangesSinceSnapshot();

    void hideAnnotation(Annot annot);

    boolean initStdSecurityHandler(String str, String str2) throws Throwable;

    int initStdSecurityHandlerWithErrorCode(String str, String str2) throws Throwable;

    int initStdSecurityHandlerWithSetDocIfNeeded(String str, String str2) throws Throwable;

    boolean isPageValid(Page page);

    boolean isViewerZoomed();

    void loadLocalFile(String str);

    void manageOOM();

    void onPause();

    void onResume();

    void openUrlAsync(String str, String str2, String str3, boolean z);

    void openUrlAsync(String str, String str2, String str3, boolean z, Map<String, String> map);

    void purgeMemoryDueToOOM();

    void refreshAppearance(Annot annot);

    void release();

    void removeDocumentLoadListener(DocumentLoadListener documentLoadListener);

    void removePageChangeListener(PageChangeListener pageChangeListener);

    void removeThumbAsyncListener(ThumbAsyncListener thumbAsyncListener);

    void requestRendering();

    void scrollToAnnotRect(Annot annot, int i);

    void setCurrentPage(int i);

    void setOpacity(Annot annot, double d);

    void setPDFViewCtrlTouchFlag(boolean z) throws Throwable;

    void setUniqueID(Annot annot, String str);

    void setZoom(double d);

    void showAnnotation(Annot annot);

    void update(Annot annot);

    void updatePageLayout();
}
