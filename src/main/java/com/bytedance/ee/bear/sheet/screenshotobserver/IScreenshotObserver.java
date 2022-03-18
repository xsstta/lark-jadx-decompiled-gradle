package com.bytedance.ee.bear.sheet.screenshotobserver;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver;", "", "addScreenshotListener", "", "listener", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver$OnScreenshotListener;", "onCreate", "context", "Landroid/app/Activity;", "keywords", "", "", "onDestroy", "removeScreenshotListener", "startObserve", "stopObserve", "OnScreenshotListener", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.a */
public interface IScreenshotObserver {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver$OnScreenshotListener;", "", "onScreenshot", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "dateAdded", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.a$a */
    public interface OnScreenshotListener {
        /* renamed from: a */
        void mo42346a(String str, long j);
    }
}
