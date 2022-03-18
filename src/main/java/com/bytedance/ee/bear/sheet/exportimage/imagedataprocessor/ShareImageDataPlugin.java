package com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor;

import androidx.lifecycle.LiveData;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.screenshot.C10779a;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13742g;
import com.google.firebase.messaging.Constants;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 $2\u00020\u0001:\u0006$%&'()B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J \u0010\u0016\u001a\u00020\u00142\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0018H\u0016J\u0012\u0010\u001b\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010!\u001a\u00020\u0014H\u0002J\u0010\u0010\"\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0018\u00010\nR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0018\u00010\u0012R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "exportImageListener", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ExportImageListener;", "exportImageResultListener", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ExportImageResultListener;", "imageDataProcessor", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ImageDataProcessor;", "shareImageDataHandler", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ShareImageDataHandler;", "shareImageDataMetaHandler", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ShareImageDataMetaHandler;", "sheetAnalytic", "Lcom/bytedance/ee/bear/sheet/common/SheetAnalytic;", "timeoutTask", "Ljava/lang/Runnable;", "transferImageInfo", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$TransferImageInfo;", "addTimeoutTask", "", "destroyImageProcessor", "getBridgeHandlers", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "removeTimeoutTask", "setExportImageResultListener", "listener", "Companion", "ExportImageResultListener", "ShareImageDataHandler", "ShareImageDataMetaHandler", "StopTransferImageHandler", "TransferImageInfo", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ShareImageDataPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public AbstractC11117a exportImageListener;
    public ExportImageResultListener exportImageResultListener;
    public ImageDataProcessor imageDataProcessor;
    public ShareImageDataHandler shareImageDataHandler;
    private ShareImageDataMetaHandler shareImageDataMetaHandler;
    public final C11088a sheetAnalytic = new C11088a();
    public Runnable timeoutTask;
    public TransferImageInfo transferImageInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ExportImageResultListener;", "", "onCancel", "", "onFail", "code", "", "errorInfo", "", "onSuccess", "file", "Ljava/io/File;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$b */
    public interface ExportImageResultListener {
        /* renamed from: a */
        void mo42337a();

        /* renamed from: a */
        void mo42338a(int i, String str);

        /* renamed from: a */
        void mo42339a(File file);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bXT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$Companion;", "", "()V", "BIZ_SHEET_SHARE_IMAGE_DATA", "", "BIZ_SHEET_SHARE_IMAGE_DATA_META", "BIZ_SHEET_STOP_TRANSFER_IMAGE", "ONE_LINE_MAX_AVAILABLE_MEMORY_FACTOR", "", "TAG", "TRANSFER_TIMEOUT", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$TransferImageInfo;", "", "(Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;)V", "availableMemory", "", "getAvailableMemory", "()F", "setAvailableMemory", "(F)V", "costTime", "getCostTime", "setCostTime", "picHeight", "", "getPicHeight", "()I", "setPicHeight", "(I)V", "picWidth", "getPicWidth", "setPicWidth", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$f */
    public final class TransferImageInfo {

        /* renamed from: b */
        private long f29854b;

        /* renamed from: c */
        private int f29855c;

        /* renamed from: d */
        private int f29856d;

        /* renamed from: e */
        private float f29857e;

        /* renamed from: f */
        private float f29858f;

        /* renamed from: a */
        public final long mo42420a() {
            return this.f29854b;
        }

        /* renamed from: b */
        public final int mo42424b() {
            return this.f29855c;
        }

        /* renamed from: c */
        public final int mo42427c() {
            return this.f29856d;
        }

        /* renamed from: d */
        public final float mo42428d() {
            return this.f29857e;
        }

        /* renamed from: e */
        public final float mo42429e() {
            return this.f29858f;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public TransferImageInfo() {
        }

        /* renamed from: a */
        public final void mo42421a(float f) {
            this.f29857e = f;
        }

        /* renamed from: b */
        public final void mo42425b(float f) {
            this.f29858f = f;
        }

        /* renamed from: a */
        public final void mo42422a(int i) {
            this.f29855c = i;
        }

        /* renamed from: b */
        public final void mo42426b(int i) {
            this.f29856d = i;
        }

        /* renamed from: a */
        public final void mo42423a(long j) {
            this.f29854b = j;
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u001c\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0012\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ShareImageDataHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "canTransfer", "", "dataSize", "", "startTransferTime", "transferredHeight", "", "canContinueTransfer", "", "continueTransfer", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "notifyJsContinueTransfer", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$c */
    public final class ShareImageDataHandler implements AbstractC7945d<ShareImageDataModel> {

        /* renamed from: b */
        private AbstractC7947h f29846b;

        /* renamed from: c */
        private int f29847c;

        /* renamed from: d */
        private long f29848d;

        /* renamed from: e */
        private long f29849e;

        /* renamed from: f */
        private boolean f29850f = true;

        /* renamed from: a */
        public final void mo42415a() {
            if (!this.f29850f) {
                this.f29850f = true;
                mo42417a(true);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShareImageDataHandler() {
        }

        /* renamed from: a */
        public final void mo42417a(boolean z) {
            C13479a.m54764b("ShareImageDataPlugin", "canContinueTransfer:" + z);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "continueTransfer", (Object) Boolean.valueOf(z));
            AbstractC7947h hVar = this.f29846b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(ShareImageDataModel shareImageDataModel, AbstractC7947h hVar) {
            ImageDataProcessor bVar;
            this.f29846b = hVar;
            if (shareImageDataModel != null) {
                C13479a.m54764b("ShareImageDataPlugin", "handle ShareImageData.");
                ShareImageDataPlugin.this.removeTimeoutTask();
                ImageDataProcessor bVar2 = ShareImageDataPlugin.this.imageDataProcessor;
                if (bVar2 != null) {
                    bVar2.mo42439a(shareImageDataModel);
                }
                this.f29849e += (long) (shareImageDataModel.getHeight() * shareImageDataModel.getWidth());
                if (shareImageDataModel.isLastInRow()) {
                    this.f29847c += shareImageDataModel.getHeight();
                }
                if (this.f29848d == 0) {
                    this.f29848d = System.currentTimeMillis();
                }
                if (shareImageDataModel.isLast()) {
                    float currentTimeMillis = (((float) (System.currentTimeMillis() - this.f29848d)) * 1.0f) / ((float) 1000);
                    StringBuilder sb = new StringBuilder();
                    sb.append("received sum height: ");
                    sb.append(this.f29847c);
                    sb.append(", ");
                    sb.append("totalSize: ");
                    float f = (float) 1024;
                    sb.append(((((float) this.f29849e) * 1.0f) / f) / f);
                    sb.append("MB, costTime: ");
                    sb.append(currentTimeMillis);
                    sb.append('s');
                    C13479a.m54764b("ShareImageDataPlugin", sb.toString());
                    this.f29847c = 0;
                    this.f29848d = 0;
                    this.f29849e = 0;
                }
                if (ShareImageDataPlugin.this.imageDataProcessor == null || ((bVar = ShareImageDataPlugin.this.imageDataProcessor) != null && bVar.mo42450j())) {
                    this.f29850f = false;
                    return;
                }
                this.f29850f = true;
                mo42417a(true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ExportImageListener;", "onFail", "", "code", "", "errorInfo", "", "onImageBlockQueueAvailable", "onSuccess", "file", "Ljava/io/File;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$h */
    public static final class C11116h implements AbstractC11117a {

        /* renamed from: a */
        final /* synthetic */ ShareImageDataPlugin f29860a;

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.AbstractC11117a
        /* renamed from: a */
        public void mo42431a() {
            ShareImageDataHandler cVar = this.f29860a.shareImageDataHandler;
            if (cVar != null) {
                cVar.mo42415a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11116h(ShareImageDataPlugin shareImageDataPlugin) {
            this.f29860a = shareImageDataPlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.AbstractC11117a
        /* renamed from: a */
        public void mo42433a(File file) {
            Long l;
            C13479a.m54764b("ShareImageDataPlugin", "ExportImageListener#onSuccess)");
            TransferImageInfo fVar = this.f29860a.transferImageInfo;
            if (fVar != null) {
                long currentTimeMillis = System.currentTimeMillis();
                TransferImageInfo fVar2 = this.f29860a.transferImageInfo;
                if (fVar2 != null) {
                    l = Long.valueOf(fVar2.mo42420a());
                } else {
                    l = null;
                }
                if (l == null) {
                    Intrinsics.throwNpe();
                }
                fVar.mo42421a(((float) (currentTimeMillis - l.longValue())) / 1000.0f);
            }
            TransferImageInfo fVar3 = this.f29860a.transferImageInfo;
            if (fVar3 != null) {
                this.f29860a.sheetAnalytic.mo42259a(fVar3.mo42429e(), fVar3.mo42424b(), fVar3.mo42427c(), fVar3.mo42427c() * fVar3.mo42424b(), fVar3.mo42428d());
            }
            ExportImageResultListener bVar = this.f29860a.exportImageResultListener;
            if (bVar != null) {
                bVar.mo42339a(file);
            }
            this.f29860a.destroyImageProcessor();
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.AbstractC11117a
        /* renamed from: a */
        public void mo42432a(int i, String str) {
            C13479a.m54764b("ShareImageDataPlugin", "ExportImageListener#onFail(code:" + i + ", errorInfo:" + str + ')');
            ExportImageResultListener bVar = this.f29860a.exportImageResultListener;
            if (bVar != null) {
                bVar.mo42338a(i, str);
            }
            this.f29860a.destroyImageProcessor();
        }
    }

    public final void addTimeoutTask() {
        RunnableC11115g gVar = new RunnableC11115g(this);
        this.timeoutTask = gVar;
        C13742g.m55706a(gVar, 40000);
    }

    public final void destroyImageProcessor() {
        ImageDataProcessor bVar = this.imageDataProcessor;
        if (bVar != null) {
            bVar.mo42451k();
        }
        this.imageDataProcessor = null;
    }

    public final void removeTimeoutTask() {
        Runnable runnable = this.timeoutTask;
        if (runnable != null) {
            C13742g.m55710c(runnable);
            this.timeoutTask = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$addTimeoutTask$1", "Ljava/lang/Runnable;", "run", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$g */
    public static final class RunnableC11115g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ShareImageDataPlugin f29859a;

        public void run() {
            AbstractC11117a aVar = this.f29859a.exportImageListener;
            if (aVar != null) {
                aVar.mo42432a(-1, "waitTimeout");
            }
            ShareImageDataHandler cVar = this.f29859a.shareImageDataHandler;
            if (cVar != null) {
                cVar.mo42417a(false);
            }
            this.f29859a.timeoutTask = null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        RunnableC11115g(ShareImageDataPlugin shareImageDataPlugin) {
            this.f29859a = shareImageDataPlugin;
        }
    }

    public final void setExportImageResultListener(ExportImageResultListener bVar) {
        this.exportImageResultListener = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ShareImageDataMetaHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataMetaModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$d */
    private final class ShareImageDataMetaHandler implements AbstractC7945d<ShareImageDataMetaModel> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShareImageDataMetaHandler() {
        }

        /* renamed from: a */
        public void handle(ShareImageDataMetaModel shareImageDataMetaModel, AbstractC7947h hVar) {
            String str;
            C13479a.m54764b("ShareImageDataPlugin", "handle ShareImageDataMeta: " + shareImageDataMetaModel);
            ShareImageDataPlugin.this.removeTimeoutTask();
            if (shareImageDataMetaModel != null) {
                ShareImageDataPlugin.this.destroyImageProcessor();
                int width = shareImageDataMetaModel.getWidth();
                int height = shareImageDataMetaModel.getHeight();
                LiveData<CharSequence> title = ShareImageDataPlugin.this.getDocViewModel().getTitle();
                Intrinsics.checkExpressionValueIsNotNull(title, "docViewModel.title");
                CharSequence b = title.mo5927b();
                if (b == null || (str = b.toString()) == null) {
                    str = "";
                }
                ShareImageDataPlugin shareImageDataPlugin = ShareImageDataPlugin.this;
                String a = C10779a.m44661a(shareImageDataPlugin.getContext(), str, ".png");
                Intrinsics.checkExpressionValueIsNotNull(a, "DocShotUtil.generateImag…ShotUtil.SHOT_SUFFIX_PNG)");
                shareImageDataPlugin.imageDataProcessor = new ImageDataProcessor(width, height, a);
                ImageDataProcessor bVar = ShareImageDataPlugin.this.imageDataProcessor;
                if (bVar != null) {
                    bVar.mo42440a(ShareImageDataPlugin.this.exportImageListener);
                }
                ImageDataProcessor bVar2 = ShareImageDataPlugin.this.imageDataProcessor;
                if (bVar2 != null) {
                    bVar2.mo42446f();
                }
                JSONObject jSONObject = new JSONObject();
                float f = (float) 1024;
                float maxMemory = ((((float) ((Runtime.getRuntime().maxMemory() - Runtime.getRuntime().totalMemory()) + Runtime.getRuntime().freeMemory())) * 0.4f) / f) / f;
                ShareImageDataPlugin shareImageDataPlugin2 = ShareImageDataPlugin.this;
                TransferImageInfo fVar = new TransferImageInfo();
                fVar.mo42422a(width);
                fVar.mo42426b(height);
                fVar.mo42425b(maxMemory);
                fVar.mo42423a(System.currentTimeMillis());
                shareImageDataPlugin2.transferImageInfo = fVar;
                jSONObject.put((Object) "memoryLimit", (Object) Float.valueOf(maxMemory));
                C13479a.m54764b("ShareImageDataPlugin", "memoryLimit param: " + jSONObject);
                if (hVar != null) {
                    hVar.mo17188a(jSONObject);
                }
                ShareImageDataPlugin.this.addTimeoutTask();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$StopTransferImageHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;)V", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "(Lkotlin/Unit;Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin$e */
    private final class StopTransferImageHandler implements AbstractC7945d<Unit> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public StopTransferImageHandler() {
        }

        /* renamed from: a */
        public void handle(Unit unit, AbstractC7947h hVar) {
            C13479a.m54764b("ShareImageDataPlugin", "Handle stop transferring image...");
            ShareImageDataPlugin.this.removeTimeoutTask();
            ShareImageDataPlugin.this.destroyImageProcessor();
            ExportImageResultListener bVar = ShareImageDataPlugin.this.exportImageResultListener;
            if (bVar != null) {
                bVar.mo42337a();
            }
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        this.exportImageListener = new C11116h(this);
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        this.shareImageDataHandler = new ShareImageDataHandler();
        ShareImageDataMetaHandler dVar = new ShareImageDataMetaHandler();
        this.shareImageDataMetaHandler = dVar;
        if (dVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.sheet.ShareImageDataMeta", dVar);
        AbstractC7945d<?> dVar2 = this.shareImageDataHandler;
        if (dVar2 == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.sheet.ShareImageData", dVar2);
        map.put("biz.sheet.stopTransferImage", new StopTransferImageHandler());
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        destroyImageProcessor();
        ShareImageDataHandler cVar = this.shareImageDataHandler;
        if (cVar != null) {
            cVar.mo42417a(false);
        }
        removeTimeoutTask();
    }
}
