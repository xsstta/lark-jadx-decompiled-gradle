package com.bytedance.ee.bear.sheet.exportimage.preview;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.exportimage.C11094a;
import com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin;
import com.bytedance.ee.bear.sheet.exportimage.preview.ImagePreviewViewModel;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 (2\u00020\u00012\u00020\u0002:\b()*+,-./B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J \u0010\u0012\u001a\u00020\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u0014H\u0016J\u0012\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0018\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0015H\u0002J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\u0010\u0010$\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010&\u001a\u00020'H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0018\u00010\u000bR\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "imageFile", "Ljava/io/File;", "shareOperationViewMessageHandler", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$ShareOperationViewMessageHandler;", "sheetAnalytic", "Lcom/bytedance/ee/bear/sheet/common/SheetAnalytic;", "showShareOperationListHandler", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$ShowShareOperationListHandler;", "viewModel", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel;", "cancelToastAndListener", "", "sheetImageDataPlugin", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;", "getBridgeHandlers", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onShareImage", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onShareText", "text", "reportClickShareExportImage", "reportExportImageSuccess", "reportShareExportImageSuccess", "shareImageInner", "shouldDisableLandscape", "", "Companion", "HideLoadingHandler", "HideShareOperationListHandler", "HideTitleHandler", "ShareOperationViewMessageHandler", "ShowLoadingHandler", "ShowShareOperationListHandler", "ShowTitleHandler", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SheetImagePreviewPlugin extends DocumentPlugin implements AbstractC6054a {
    public static final Companion Companion = new Companion(null);
    public File imageFile;
    public ShareOperationViewMessageHandler shareOperationViewMessageHandler;
    public C11088a sheetAnalytic = new C11088a();
    public ShowShareOperationListHandler showShareOperationListHandler;
    public ImagePreviewViewModel viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$Companion;", "", "()V", "BIZ_NAVIGATION_HIDE_TITLE", "", "BIZ_NAVIGATION_SHOW_TITLE", "BIZ_SHEET_HIDE_LOADING", "BIZ_SHEET_SHARE_OPERATION_VIEW_MESSAGE", "BIZ_SHEET_SHOW_LOADING", "BIZ_UTIL_HIDE_SHARE_OPERATION_LIST", "BIZ_UTIL_SHOW_SHARE_OPERATION_LIST", "JS_BIZ_NAVIGATION_EXIT", "SOURCE_CARDVIEW", "SOURCE_CARDVIEW_PANEL", "TAG", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\rJ\u0006\u0010\u0013\u001a\u00020\rR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$ShowShareOperationListHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ShowShareOperationListModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "callBackFunction", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", ShareHitPoint.f121868c, "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "isFromSheetCard", "", "onDownload", "onShareText", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$g */
    public final class ShowShareOperationListHandler implements AbstractC7945d<ShowShareOperationListModel> {

        /* renamed from: b */
        private AbstractC7947h f29895b;

        /* renamed from: c */
        private String f29896c = "";

        /* renamed from: a */
        public final String mo42500a() {
            return this.f29896c;
        }

        /* renamed from: b */
        public final void mo42502b() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "id", (Object) "load");
            AbstractC7947h hVar = this.f29895b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: c */
        public final void mo42503c() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "id", (Object) "text");
            C13479a.m54764b("SheetImagePreviewPlugin", "onShareText");
            AbstractC7947h hVar = this.f29895b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: d */
        public final boolean mo42504d() {
            if (TextUtils.equals(this.f29896c, "cardview") || TextUtils.equals(this.f29896c, "cardview_panel")) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowShareOperationListHandler() {
        }

        /* renamed from: a */
        public void handle(ShowShareOperationListModel showShareOperationListModel, AbstractC7947h hVar) {
            String str;
            C1177w<Boolean> showShare;
            C13479a.m54764b("SheetImagePreviewPlugin", "Show ShareOperationList.");
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (!(aVar == null || (showShare = aVar.getShowShare()) == null)) {
                showShare.mo5929b((Boolean) true);
            }
            this.f29895b = hVar;
            if (showShareOperationListModel == null || (str = showShareOperationListModel.getSource()) == null) {
                str = "";
            }
            this.f29896c = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$onAttachToHost$1", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ImagePreviewViewModel$Delegate;", "onClose", "", "onShareImageToExternalApp", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onSharePanelHeightChanged", "height", "", "onShareTextToExternalApp", "text", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$i */
    public static final class C11123i implements ImagePreviewViewModel.Delegate {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewPlugin f29898a;

        @Override // com.bytedance.ee.bear.sheet.exportimage.preview.ImagePreviewViewModel.Delegate
        /* renamed from: a */
        public void mo42506a() {
            C13479a.m54764b("SheetImagePreviewPlugin", "Close ImagePreviewFragment.");
            this.f29898a.execJS("javascript:lark.biz.navigation.exit", new JSONObject());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11123i(SheetImagePreviewPlugin sheetImagePreviewPlugin) {
            this.f29898a = sheetImagePreviewPlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.preview.ImagePreviewViewModel.Delegate
        /* renamed from: a */
        public void mo42507a(int i) {
            ShareOperationViewMessageHandler eVar = this.f29898a.shareOperationViewMessageHandler;
            if (eVar != null) {
                eVar.mo42497a(i);
            }
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.preview.ImagePreviewViewModel.Delegate
        /* renamed from: a */
        public void mo42508a(ShareType shareType) {
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            C13479a.m54764b("SheetImagePreviewPlugin", "Share image to external app. shareType: " + shareType.name());
            this.f29898a.onShareImage(shareType);
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.preview.ImagePreviewViewModel.Delegate
        /* renamed from: a */
        public void mo42509a(ShareType shareType, String str) {
            Intrinsics.checkParameterIsNotNull(shareType, "shareType");
            Intrinsics.checkParameterIsNotNull(str, "text");
            C13479a.m54764b("SheetImagePreviewPlugin", "Share text to external app. shareType: " + shareType.name());
            this.f29898a.onShareText(shareType, str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$onShareImage$2", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ExportImageResultListener;", "onCancel", "", "onFail", "code", "", "errorInfo", "", "onSuccess", "file", "Ljava/io/File;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$k */
    public static final class C11125k implements ShareImageDataPlugin.ExportImageResultListener {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewPlugin f29900a;

        /* renamed from: b */
        final /* synthetic */ ShareImageDataPlugin f29901b;

        /* renamed from: c */
        final /* synthetic */ ShareType f29902c;

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin.ExportImageResultListener
        /* renamed from: a */
        public void mo42337a() {
            C13479a.m54764b("SheetImagePreviewPlugin", "onShareImage: GetImageData canceled.");
            this.f29900a.sheetAnalytic.mo42271c("stopTransfer");
            this.f29900a.cancelToastAndListener(this.f29901b);
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin.ExportImageResultListener
        /* renamed from: a */
        public void mo42339a(File file) {
            Boolean bool;
            C1177w<Boolean> active;
            C13479a.m54764b("SheetImagePreviewPlugin", "onShareImage: GetImageData succeed.");
            this.f29900a.cancelToastAndListener(this.f29901b);
            ImagePreviewViewModel aVar = this.f29900a.viewModel;
            if (aVar == null || (active = aVar.getActive()) == null) {
                bool = null;
            } else {
                bool = active.mo5927b();
            }
            if (!(!Intrinsics.areEqual((Object) bool, (Object) true))) {
                this.f29900a.imageFile = file;
                this.f29900a.reportExportImageSuccess();
                this.f29900a.shareImageInner(this.f29902c);
            }
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin.ExportImageResultListener
        /* renamed from: a */
        public void mo42338a(int i, String str) {
            C13479a.m54764b("SheetImagePreviewPlugin", "onShareImage: GetImageData failed. code: " + i + ", errorInfo: " + str);
            this.f29900a.sheetAnalytic.mo42271c(str);
            this.f29900a.cancelToastAndListener(this.f29901b);
        }

        C11125k(SheetImagePreviewPlugin sheetImagePreviewPlugin, ShareImageDataPlugin shareImageDataPlugin, ShareType shareType) {
            this.f29900a = sheetImagePreviewPlugin;
            this.f29901b = shareImageDataPlugin;
            this.f29902c = shareType;
        }
    }

    public final void reportExportImageSuccess() {
        String str;
        C11088a aVar = this.sheetAnalytic;
        ShowShareOperationListHandler gVar = this.showShareOperationListHandler;
        if (gVar == null || (str = gVar.mo42500a()) == null) {
            str = "";
        }
        aVar.mo42267b(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$HideLoadingHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "(Lkotlin/Unit;Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$b */
    private final class HideLoadingHandler implements AbstractC7945d<Unit> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HideLoadingHandler() {
        }

        /* renamed from: a */
        public void handle(Unit unit, AbstractC7947h hVar) {
            C1177w<Boolean> showLoading;
            C13479a.m54764b("SheetImagePreviewPlugin", "Hide loading.");
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (aVar != null && (showLoading = aVar.getShowLoading()) != null) {
                showLoading.mo5929b((Boolean) false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$HideShareOperationListHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "(Lkotlin/Unit;Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$c */
    private final class HideShareOperationListHandler implements AbstractC7945d<Unit> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HideShareOperationListHandler() {
        }

        /* renamed from: a */
        public void handle(Unit unit, AbstractC7947h hVar) {
            C1177w<Boolean> showShare;
            C13479a.m54764b("SheetImagePreviewPlugin", "Hide ShareOperationList.");
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (aVar != null && (showShare = aVar.getShowShare()) != null) {
                showShare.mo5929b((Boolean) false);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$HideTitleHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "(Lkotlin/Unit;Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$d */
    private final class HideTitleHandler implements AbstractC7945d<Unit> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public HideTitleHandler() {
        }

        /* renamed from: a */
        public void handle(Unit unit, AbstractC7947h hVar) {
            C1177w<PreviewTitleModel> titleData;
            C1177w<Boolean> active;
            C13479a.m54764b("SheetImagePreviewPlugin", "Hide title.");
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (!(aVar == null || (active = aVar.getActive()) == null)) {
                active.mo5929b((Boolean) false);
            }
            ImagePreviewViewModel aVar2 = SheetImagePreviewPlugin.this.viewModel;
            if (aVar2 != null && (titleData = aVar2.getTitleData()) != null) {
                titleData.mo5929b((PreviewTitleModel) null);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$ShareOperationViewMessageHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/ShareOperationTypeModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "notifySharePanelHeightChanged", "height", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$e */
    private final class ShareOperationViewMessageHandler implements AbstractC7945d<ShareOperationTypeModel> {

        /* renamed from: b */
        private AbstractC7947h f29892b;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShareOperationViewMessageHandler() {
        }

        /* renamed from: a */
        public final void mo42497a(int i) {
            C13479a.m54764b("SheetImagePreviewPlugin", "notifySharePanelHeightChanged: height = " + i);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "viewHeight", (Object) Integer.valueOf(i));
            AbstractC7947h hVar = this.f29892b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(ShareOperationTypeModel shareOperationTypeModel, AbstractC7947h hVar) {
            C1177w<Boolean> calSharePanelHeight;
            C1177w<ShareOperationTypeModel> operationType;
            C13479a.m54764b("SheetImagePreviewPlugin", "ShareOperationViewMessage. data :" + shareOperationTypeModel);
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (!(aVar == null || (operationType = aVar.getOperationType()) == null)) {
                operationType.mo5929b(shareOperationTypeModel);
            }
            ImagePreviewViewModel aVar2 = SheetImagePreviewPlugin.this.viewModel;
            if (!(aVar2 == null || (calSharePanelHeight = aVar2.getCalSharePanelHeight()) == null)) {
                calSharePanelHeight.mo5929b((Boolean) true);
            }
            this.f29892b = hVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$ShowLoadingHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "(Lkotlin/Unit;Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$f */
    private final class ShowLoadingHandler implements AbstractC7945d<Unit> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowLoadingHandler() {
        }

        /* renamed from: a */
        public void handle(Unit unit, AbstractC7947h hVar) {
            C1177w<Boolean> showLoading;
            C1177w<Boolean> active;
            C13479a.m54764b("SheetImagePreviewPlugin", "Show loading.");
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (!(aVar == null || (active = aVar.getActive()) == null)) {
                active.mo5929b((Boolean) true);
            }
            ImagePreviewViewModel aVar2 = SheetImagePreviewPlugin.this.viewModel;
            if (aVar2 != null && (showLoading = aVar2.getShowLoading()) != null) {
                showLoading.mo5929b((Boolean) true);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$ShowTitleHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/preview/PreviewTitleModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$h */
    private final class ShowTitleHandler implements AbstractC7945d<PreviewTitleModel> {
        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowTitleHandler() {
        }

        /* renamed from: a */
        public void handle(PreviewTitleModel previewTitleModel, AbstractC7947h hVar) {
            C1177w<PreviewTitleModel> titleData;
            C13479a.m54764b("SheetImagePreviewPlugin", "Show title. data: " + previewTitleModel);
            ImagePreviewViewModel aVar = SheetImagePreviewPlugin.this.viewModel;
            if (aVar != null && (titleData = aVar.getTitleData()) != null) {
                titleData.mo5929b(previewTitleModel);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$onAttachToHost$2", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "active", "(Ljava/lang/Boolean;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$j */
    public static final class C11124j implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewPlugin f29899a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11124j(SheetImagePreviewPlugin sheetImagePreviewPlugin) {
            this.f29899a = sheetImagePreviewPlugin;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            C1177w<ShareOperationTypeModel> operationType;
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) this.f29899a.findPlugin(UnspecifiedOrientationPlugin.class);
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f29899a);
                }
                if (this.f29899a.getUIContainer().mo19586a((AbstractC4941c) this.f29899a) == null) {
                    AbstractC4958n uIContainer = this.f29899a.getUIContainer();
                    SheetImagePreviewPlugin sheetImagePreviewPlugin = this.f29899a;
                    uIContainer.mo19589a(sheetImagePreviewPlugin, sheetImagePreviewPlugin.instantiateFragment(SheetImagePreviewFragment.class));
                    return;
                }
                return;
            }
            this.f29899a.imageFile = null;
            ImagePreviewViewModel aVar = this.f29899a.viewModel;
            if (!(aVar == null || (operationType = aVar.getOperationType()) == null)) {
                operationType.mo5929b((ShareOperationTypeModel) null);
            }
            this.f29899a.removeFragment();
            if (unspecifiedOrientationPlugin != null) {
                unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this.f29899a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$shareImageInner$1", "Lcom/bytedance/ee/bear/sheet/exportimage/ShareImageAndTextHelper$OnShareResultListener;", "onFail", "", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "msg", "", "onSuccess", ShareHitPoint.f121869d, "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$m */
    public static final class C11127m implements C11094a.AbstractC11098a {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewPlugin f29905a;

        /* renamed from: b */
        final /* synthetic */ ShareType f29906b;

        @Override // com.bytedance.ee.bear.sheet.exportimage.C11094a.AbstractC11098a
        /* renamed from: a */
        public void mo42314a(ShareType shareType, String str) {
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.C11094a.AbstractC11098a
        /* renamed from: a */
        public void mo42313a(ShareType shareType) {
            this.f29905a.reportShareExportImageSuccess(this.f29906b);
        }

        C11127m(SheetImagePreviewPlugin sheetImagePreviewPlugin, ShareType shareType) {
            this.f29905a = sheetImagePreviewPlugin;
            this.f29906b = shareType;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/preview/SheetImagePreviewPlugin$onShareText$1", "Lcom/bytedance/ee/bear/sheet/exportimage/ShareImageAndTextHelper$OnShareResultListener;", "onFail", "", "shareType", "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "msg", "", "onSuccess", ShareHitPoint.f121869d, "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.preview.SheetImagePreviewPlugin$l */
    public static final class C11126l implements C11094a.AbstractC11098a {

        /* renamed from: a */
        final /* synthetic */ SheetImagePreviewPlugin f29903a;

        /* renamed from: b */
        final /* synthetic */ ShareType f29904b;

        @Override // com.bytedance.ee.bear.sheet.exportimage.C11094a.AbstractC11098a
        /* renamed from: a */
        public void mo42313a(ShareType shareType) {
            String str;
            C11088a aVar = this.f29903a.sheetAnalytic;
            ShowShareOperationListHandler gVar = this.f29903a.showShareOperationListHandler;
            if (gVar == null || (str = gVar.mo42500a()) == null) {
                str = "";
            }
            aVar.mo42288j(str, C11094a.m46168a(this.f29904b));
        }

        C11126l(SheetImagePreviewPlugin sheetImagePreviewPlugin, ShareType shareType) {
            this.f29903a = sheetImagePreviewPlugin;
            this.f29904b = shareType;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.C11094a.AbstractC11098a
        /* renamed from: a */
        public void mo42314a(ShareType shareType, String str) {
            Context context = this.f29903a.getContext();
            if (str == null) {
                str = "";
            }
            Toast.showFailureTextWithMargin(context, str, 0);
        }
    }

    public final void cancelToastAndListener(ShareImageDataPlugin shareImageDataPlugin) {
        C1177w<Boolean> disableShareItem;
        Toast.cancelLoading();
        ImagePreviewViewModel aVar = this.viewModel;
        if (!(aVar == null || (disableShareItem = aVar.getDisableShareItem()) == null)) {
            disableShareItem.mo5929b((Boolean) false);
        }
        shareImageDataPlugin.setExportImageResultListener(null);
    }

    public final void shareImageInner(ShareType shareType) {
        if (shareType == ShareType.Download) {
            C11094a.m46172a(getContext(), this.imageFile, new C11127m(this, shareType));
            return;
        }
        reportShareExportImageSuccess(shareType);
        C11094a.m46175a(new C10917c(new C10929e()), getContext(), shareType, this.imageFile, (C11094a.AbstractC11098a) null);
    }

    private final void reportClickShareExportImage(ShareType shareType) {
        String a;
        String a2;
        String a3;
        ShowShareOperationListHandler gVar = this.showShareOperationListHandler;
        String str = "";
        if (gVar == null || !gVar.mo42504d()) {
            C11088a aVar = this.sheetAnalytic;
            ShowShareOperationListHandler gVar2 = this.showShareOperationListHandler;
            if (!(gVar2 == null || (a = gVar2.mo42500a()) == null)) {
                str = a;
            }
            aVar.mo42268b(str, C11094a.m46168a(shareType));
        } else if (shareType == ShareType.Download) {
            C11088a aVar2 = this.sheetAnalytic;
            ShowShareOperationListHandler gVar3 = this.showShareOperationListHandler;
            if (!(gVar3 == null || (a3 = gVar3.mo42500a()) == null)) {
                str = a3;
            }
            aVar2.mo42272c(str, C11094a.m46168a(shareType));
        } else {
            C11088a aVar3 = this.sheetAnalytic;
            ShowShareOperationListHandler gVar4 = this.showShareOperationListHandler;
            if (!(gVar4 == null || (a2 = gVar4.mo42500a()) == null)) {
                str = a2;
            }
            aVar3.mo42276d(str, C11094a.m46168a(shareType));
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        this.showShareOperationListHandler = new ShowShareOperationListHandler();
        this.shareOperationViewMessageHandler = new ShareOperationViewMessageHandler();
        map.put("biz.sheet.showLoading", new ShowLoadingHandler());
        map.put("biz.sheet.hideLoading", new HideLoadingHandler());
        map.put("biz.navigation.showTitle", new ShowTitleHandler());
        map.put("biz.navigation.hideTitle", new HideTitleHandler());
        ShowShareOperationListHandler gVar = this.showShareOperationListHandler;
        if (gVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.util.showShareOpreationList", gVar);
        map.put("biz.util.hideShareOpreationList", new HideShareOperationListHandler());
        ShareOperationViewMessageHandler eVar = this.shareOperationViewMessageHandler;
        if (eVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.sheet.shareOpreationViewMessage", eVar);
    }

    public void onAttachToHost(C6095s sVar) {
        C1177w<Boolean> active;
        super.onAttachToHost((C4943e) sVar);
        ImagePreviewViewModel aVar = (ImagePreviewViewModel) viewModel(ImagePreviewViewModel.class);
        this.viewModel = aVar;
        if (aVar != null) {
            aVar.setDelegate(new C11123i(this));
        }
        ImagePreviewViewModel aVar2 = this.viewModel;
        if (!(aVar2 == null || (active = aVar2.getActive()) == null)) {
            active.mo5923a(getLifecycleOwner(), new C11124j(this));
        }
        this.sheetAnalytic.mo42260a(getDocViewModel().getBearUrl());
    }

    public final void reportShareExportImageSuccess(ShareType shareType) {
        String a;
        String a2;
        String a3;
        ShowShareOperationListHandler gVar = this.showShareOperationListHandler;
        String str = "";
        if (gVar == null || !gVar.mo42504d()) {
            C11088a aVar = this.sheetAnalytic;
            ShowShareOperationListHandler gVar2 = this.showShareOperationListHandler;
            if (!(gVar2 == null || (a = gVar2.mo42500a()) == null)) {
                str = a;
            }
            aVar.mo42290k(str, C11094a.m46168a(shareType));
        } else if (shareType == ShareType.Download) {
            C11088a aVar2 = this.sheetAnalytic;
            ShowShareOperationListHandler gVar3 = this.showShareOperationListHandler;
            if (!(gVar3 == null || (a3 = gVar3.mo42500a()) == null)) {
                str = a3;
            }
            aVar2.mo42282g(str, C11094a.m46168a(shareType));
        } else {
            C11088a aVar3 = this.sheetAnalytic;
            ShowShareOperationListHandler gVar4 = this.showShareOperationListHandler;
            if (!(gVar4 == null || (a2 = gVar4.mo42500a()) == null)) {
                str = a2;
            }
            aVar3.mo42284h(str, C11094a.m46168a(shareType));
        }
    }

    public final void onShareImage(ShareType shareType) {
        C1177w<Boolean> disableShareItem;
        reportClickShareExportImage(shareType);
        if (C36808a.m145211c() == 1) {
            Context context = getContext();
            if (context != null) {
                int i = R.string.CreationMobile_ECM_ShareSecuritySettingKAToast;
                if (shareType == ShareType.Download) {
                    i = R.string.CreationMobile_ECM_SecuritySettingKAToast;
                }
                Toast.showText(context, context.getString(i), 1);
            }
        } else if (this.imageFile != null) {
            shareImageInner(shareType);
        } else {
            ShowShareOperationListHandler gVar = this.showShareOperationListHandler;
            if (gVar != null) {
                gVar.mo42502b();
            }
            ImagePreviewViewModel aVar = this.viewModel;
            if (!(aVar == null || (disableShareItem = aVar.getDisableShareItem()) == null)) {
                disableShareItem.mo5929b((Boolean) true);
            }
            if (shareType == ShareType.Download) {
                Toast.showLoading(getContext(), getContext().getText(R.string.Doc_PicExport_ImageDnlding));
            } else {
                Toast.showLoading(getContext(), getContext().getText(R.string.Doc_Share_ExportImageLoading));
            }
            ShareImageDataPlugin shareImageDataPlugin = (ShareImageDataPlugin) findPlugin(ShareImageDataPlugin.class);
            if (shareImageDataPlugin != null) {
                shareImageDataPlugin.setExportImageResultListener(new C11125k(this, shareImageDataPlugin, shareType));
            }
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        C1177w<Boolean> active;
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        ImagePreviewViewModel aVar = this.viewModel;
        if (aVar != null && (active = aVar.getActive()) != null) {
            active.mo5929b((Boolean) false);
        }
    }

    public final void onShareText(ShareType shareType, String str) {
        String a;
        String str2;
        String a2;
        ShowShareOperationListHandler gVar = this.showShareOperationListHandler;
        if (gVar != null) {
            gVar.mo42503c();
        }
        String str3 = "";
        if (shareType == ShareType.CopyText) {
            C11088a aVar = this.sheetAnalytic;
            ShowShareOperationListHandler gVar2 = this.showShareOperationListHandler;
            if (gVar2 == null || (str2 = gVar2.mo42500a()) == null) {
                str2 = str3;
            }
            aVar.mo42278e(str2, C11094a.m46168a(shareType));
            if (C11094a.m46179a(getContext(), str)) {
                C11088a aVar2 = this.sheetAnalytic;
                ShowShareOperationListHandler gVar3 = this.showShareOperationListHandler;
                if (!(gVar3 == null || (a2 = gVar3.mo42500a()) == null)) {
                    str3 = a2;
                }
                aVar2.mo42286i(str3, C11094a.m46168a(shareType));
                Context context = getContext();
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                Toast.showSuccessTextWithMargin(context, context2.getResources().getText(R.string.Doc_Comment_CopySuccess), 0);
                return;
            }
            Context context3 = getContext();
            Context context4 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "context");
            Toast.showFailureTextWithMargin(context3, context4.getResources().getText(R.string.Doc_Comment_CopyFailed), 0);
            return;
        }
        C11088a aVar3 = this.sheetAnalytic;
        ShowShareOperationListHandler gVar4 = this.showShareOperationListHandler;
        if (!(gVar4 == null || (a = gVar4.mo42500a()) == null)) {
            str3 = a;
        }
        aVar3.mo42280f(str3, C11094a.m46168a(shareType));
        C11094a.m46176a(new C10917c(new C10929e()), getContext(), shareType, str, new C11126l(this, shareType));
    }
}
