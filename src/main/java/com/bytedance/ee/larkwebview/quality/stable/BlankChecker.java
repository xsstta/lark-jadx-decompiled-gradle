package com.bytedance.ee.larkwebview.quality.stable;

import com.bytedance.ee.larkwebview.base.LarkWebView;
import com.bytedance.lynx.webview.extension.TTWebViewExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0002J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/larkwebview/quality/stable/BlankChecker;", "", "mExtension", "Lcom/bytedance/lynx/webview/extension/TTWebViewExtension;", "mLarkWebView", "Lcom/bytedance/ee/larkwebview/base/LarkWebView;", "(Lcom/bytedance/lynx/webview/extension/TTWebViewExtension;Lcom/bytedance/ee/larkwebview/base/LarkWebView;)V", "mSettingRate", "", "checkBlank", "", "result", "Lcom/bytedance/ee/larkwebview/quality/stable/IBlankCheckResult;", "checkBlankDefault", "Lcom/bytedance/ee/larkwebview/quality/stable/IBlankCheckResult$BlankCheckResult;", "convertTTWebViewCheckResult", "bdr", "Lcom/bytedance/lynx/webview/extension/TTWebViewExtension$BlankDetectAsyncCallback$BlankDetectResult;", "getBlankResult", "bitmap", "Landroid/graphics/Bitmap;", "getRate", "", "str", "", "getScreenshot", "view", "Landroid/webkit/WebView;", "isTTWebView", "", "recycleBitmap", "Companion", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.d.d.a */
public final class BlankChecker {

    /* renamed from: a */
    public static int f35415a = 1;

    /* renamed from: b */
    public static final Companion f35416b = new Companion(null);

    /* renamed from: f */
    private static final int f35417f = f35417f;

    /* renamed from: g */
    private static final int f35418g = 20;

    /* renamed from: h */
    private static final int f35419h = f35419h;

    /* renamed from: c */
    private final double f35420c = 0.05d;

    /* renamed from: d */
    private final TTWebViewExtension f35421d;

    /* renamed from: e */
    private final LarkWebView f35422e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/larkwebview/quality/stable/BlankChecker$Companion;", "", "()V", "COMPRESS_QUALITY_REDUCE_INTERVAL", "", "DEFAULT_SCALE", "MIN_COMPRESS_QUALITY", "MULTI", "NORMAL_SNAPSHOT_MAX_DATA_SIZE", "STEP", "getSTEP", "()I", "setSTEP", "(I)V", "TAG", "", "mBGColor", "base_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.bytedance.ee.larkwebview.d.d.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BlankChecker(TTWebViewExtension tTWebViewExtension, LarkWebView larkWebView) {
        this.f35421d = tTWebViewExtension;
        this.f35422e = larkWebView;
    }
}
