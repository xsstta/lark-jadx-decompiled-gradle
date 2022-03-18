package com.bytedance.ee.bear.sheet.exportimage.alert;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.bizwidget.shareview.ShareType;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.sheet.common.C11088a;
import com.bytedance.ee.bear.sheet.common.C11090b;
import com.bytedance.ee.bear.sheet.exportimage.C11094a;
import com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertViewModel;
import com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin;
import com.bytedance.ee.bear.sheet.screenshotobserver.IScreenshotObserver;
import com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserverPlugin;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0002\"#B\u0005¢\u0006\u0002\u0010\u0003J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0018\u00010\u0007R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "Lcom/bytedance/ee/bear/document/orientation/OrientationSupportPanel;", "()V", "exportImageResultListener", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ExportImageResultListener;", "imageAlertHandler", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$ShowImageAlertHandler;", "listener", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver$OnScreenshotListener;", "orientationPlugin", "Lcom/bytedance/ee/bear/document/orientation/UnspecifiedOrientationPlugin;", "screenshotObserverPlugin", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserverPlugin;", "shareImageDataPlugin", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin;", "sheetAnalytic", "Lcom/bytedance/ee/bear/sheet/common/SheetAnalytic;", "viewModel", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel;", "getReminderFragment", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertFragment;", "hideFragment", "", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromUIContainer", "shouldDisableLandscape", "", "showFragment", "Companion", "ShowImageAlertHandler", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ScreenshotImageAlertPlugin extends DocumentPlugin implements AbstractC6054a {
    public static final Companion Companion = new Companion(null);
    public final ShareImageDataPlugin.ExportImageResultListener exportImageResultListener = new C11099c(this);
    public ShowImageAlertHandler imageAlertHandler;
    private IScreenshotObserver.OnScreenshotListener listener;
    public UnspecifiedOrientationPlugin orientationPlugin;
    private ScreenshotObserverPlugin screenshotObserverPlugin;
    public ShareImageDataPlugin shareImageDataPlugin;
    public C11088a sheetAnalytic = new C11088a();
    public ScreenshotImageAlertViewModel viewModel;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$Companion;", "", "()V", "BIZ_UTIL_SHOW_IMAGE_ALERT", "", "TAG", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$ShowImageAlertHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ImageAlertModel;", "(Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", ShareHitPoint.f121868c, "", "getSource", "()Ljava/lang/String;", "setSource", "(Ljava/lang/String;)V", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCallback", "actionId", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin$b */
    public final class ShowImageAlertHandler implements AbstractC7945d<ImageAlertModel> {

        /* renamed from: b */
        private AbstractC7947h f29806b;

        /* renamed from: c */
        private String f29807c;

        /* renamed from: a */
        public final String mo42334a() {
            return this.f29807c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public ShowImageAlertHandler() {
        }

        /* renamed from: a */
        public final void mo42336a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "actionId");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "id", (Object) str);
            AbstractC7947h hVar = this.f29806b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public void handle(ImageAlertModel imageAlertModel, AbstractC7947h hVar) {
            String str;
            C1177w<ImageAlertModel> imageAlertData;
            C1177w<Boolean> active;
            C13479a.m54764b("ScreenshotImageAlertPlugin", "showImageAlert. data" + imageAlertModel);
            if (C36808a.m145211c() == 1) {
                C13479a.m54775e("ScreenshotImageAlertPlugin", "showImageAlert, cipher is on");
                return;
            }
            this.f29806b = hVar;
            Boolean isValid = ImageAlertModel.isValid(imageAlertModel);
            ScreenshotImageAlertViewModel bVar = ScreenshotImageAlertPlugin.this.viewModel;
            if (!(bVar == null || (active = bVar.getActive()) == null)) {
                active.mo5929b(isValid);
            }
            if (imageAlertModel == null || (str = imageAlertModel.getSource()) == null) {
                str = "";
            }
            this.f29807c = str;
            if (Intrinsics.areEqual((Object) isValid, (Object) true)) {
                ScreenshotImageAlertPlugin.this.sheetAnalytic.mo42255A();
                C11090b.m46151d();
            }
            ScreenshotImageAlertViewModel bVar2 = ScreenshotImageAlertPlugin.this.viewModel;
            if (!(bVar2 == null || (imageAlertData = bVar2.getImageAlertData()) == null)) {
                imageAlertData.mo5929b(imageAlertModel);
            }
            ShareImageDataPlugin shareImageDataPlugin = ScreenshotImageAlertPlugin.this.shareImageDataPlugin;
            if (shareImageDataPlugin != null) {
                shareImageDataPlugin.setExportImageResultListener(ScreenshotImageAlertPlugin.this.exportImageResultListener);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$onAttachToHost$2", "Lcom/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertViewModel$Delegete;", "onClose", "", "onSave", "onShare", "onShareSuccess", ShareHitPoint.f121869d, "Lcom/bytedance/ee/bear/bizwidget/shareview/ShareType;", "onShareToExternalApp", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin$e */
    public static final class C11101e implements ScreenshotImageAlertViewModel.Delegete {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertPlugin f29810a;

        @Override // com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertViewModel.Delegete
        /* renamed from: c */
        public void mo42345c() {
            C13479a.m54764b("ScreenshotImageAlertPlugin", "Share sheet image.");
            ShowImageAlertHandler bVar = this.f29810a.imageAlertHandler;
            if (bVar != null) {
                bVar.mo42336a("rightBtn");
            }
            C11090b.m46149b("share");
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertViewModel.Delegete
        /* renamed from: a */
        public void mo42341a() {
            C1177w<Boolean> active;
            C13479a.m54764b("ScreenshotImageAlertPlugin", "Close image alert.");
            ScreenshotImageAlertViewModel bVar = this.f29810a.viewModel;
            if (!(bVar == null || (active = bVar.getActive()) == null)) {
                active.mo5929b((Boolean) false);
            }
            ShowImageAlertHandler bVar2 = this.f29810a.imageAlertHandler;
            if (bVar2 != null) {
                bVar2.mo42336a("exit");
            }
            C11090b.m46149b("close");
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertViewModel.Delegete
        /* renamed from: b */
        public void mo42343b() {
            String str;
            C13479a.m54764b("ScreenshotImageAlertPlugin", "Save sheet exported image.");
            ShowImageAlertHandler bVar = this.f29810a.imageAlertHandler;
            if (bVar != null) {
                bVar.mo42336a("leftBtn");
            }
            C11088a aVar = this.f29810a.sheetAnalytic;
            ShowImageAlertHandler bVar2 = this.f29810a.imageAlertHandler;
            if (bVar2 == null || (str = bVar2.mo42334a()) == null) {
                str = "";
            }
            aVar.mo42268b(str, C11094a.m46168a(ShareType.Download));
            C11090b.m46149b("save");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11101e(ScreenshotImageAlertPlugin screenshotImageAlertPlugin) {
            this.f29810a = screenshotImageAlertPlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertViewModel.Delegete
        /* renamed from: a */
        public void mo42342a(ShareType shareType) {
            String str;
            Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
            C13479a.m54764b("ScreenshotImageAlertPlugin", "onShareToExternalApp... channel = " + shareType.name());
            C11088a aVar = this.f29810a.sheetAnalytic;
            ShowImageAlertHandler bVar = this.f29810a.imageAlertHandler;
            if (bVar == null || (str = bVar.mo42334a()) == null) {
                str = "";
            }
            aVar.mo42268b(str, C11094a.m46168a(shareType));
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertViewModel.Delegete
        /* renamed from: b */
        public void mo42344b(ShareType shareType) {
            String str;
            Intrinsics.checkParameterIsNotNull(shareType, ShareHitPoint.f121869d);
            C13479a.m54764b("SheetImagePreviewPlugin", "Share sheet image succeed. type : " + shareType.name());
            C11088a aVar = this.f29810a.sheetAnalytic;
            ShowImageAlertHandler bVar = this.f29810a.imageAlertHandler;
            if (bVar == null || (str = bVar.mo42334a()) == null) {
                str = "";
            }
            aVar.mo42290k(str, C11094a.m46168a(shareType));
        }
    }

    private final ScreenshotImageAlertFragment getReminderFragment() {
        FragmentActivity activity = getActivity();
        Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(supportFragmentManager, "activity.supportFragmentManager");
        return (ScreenshotImageAlertFragment) supportFragmentManager.findFragmentByTag("ScreenshotImageAlertPlugin");
    }

    public final void hideFragment() {
        C13479a.m54764b("ScreenshotImageAlertPlugin", "Dismiss Screenshot alert dialog...");
        ScreenshotImageAlertFragment reminderFragment = getReminderFragment();
        if (reminderFragment != null) {
            reminderFragment.mo5513b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$exportImageResultListener$1", "Lcom/bytedance/ee/bear/sheet/exportimage/imagedataprocessor/ShareImageDataPlugin$ExportImageResultListener;", "onCancel", "", "onFail", "code", "", "errorInfo", "", "onSuccess", "file", "Ljava/io/File;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin$c */
    public static final class C11099c implements ShareImageDataPlugin.ExportImageResultListener {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertPlugin f29808a;

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin.ExportImageResultListener
        /* renamed from: a */
        public void mo42337a() {
            C1177w<Boolean> active;
            ScreenshotImageAlertViewModel bVar = this.f29808a.viewModel;
            if (!(bVar == null || (active = bVar.getActive()) == null)) {
                active.mo5929b((Boolean) false);
            }
            ShareImageDataPlugin shareImageDataPlugin = this.f29808a.shareImageDataPlugin;
            if (shareImageDataPlugin != null) {
                shareImageDataPlugin.setExportImageResultListener(null);
            }
            this.f29808a.sheetAnalytic.mo42271c("stopTransfer");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11099c(ScreenshotImageAlertPlugin screenshotImageAlertPlugin) {
            this.f29808a = screenshotImageAlertPlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin.ExportImageResultListener
        /* renamed from: a */
        public void mo42339a(File file) {
            String str;
            C1177w<File> imageBitmap;
            ScreenshotImageAlertViewModel bVar = this.f29808a.viewModel;
            if (!(bVar == null || (imageBitmap = bVar.getImageBitmap()) == null)) {
                imageBitmap.mo5929b(file);
            }
            ShareImageDataPlugin shareImageDataPlugin = this.f29808a.shareImageDataPlugin;
            if (shareImageDataPlugin != null) {
                shareImageDataPlugin.setExportImageResultListener(null);
            }
            C11088a aVar = this.f29808a.sheetAnalytic;
            ShowImageAlertHandler bVar2 = this.f29808a.imageAlertHandler;
            if (bVar2 == null || (str = bVar2.mo42334a()) == null) {
                str = "";
            }
            aVar.mo42267b(str);
        }

        @Override // com.bytedance.ee.bear.sheet.exportimage.imagedataprocessor.ShareImageDataPlugin.ExportImageResultListener
        /* renamed from: a */
        public void mo42338a(int i, String str) {
            ShareImageDataPlugin shareImageDataPlugin = this.f29808a.shareImageDataPlugin;
            if (shareImageDataPlugin != null) {
                shareImageDataPlugin.setExportImageResultListener(null);
            }
            this.f29808a.sheetAnalytic.mo42271c(str);
        }
    }

    public final void showFragment() {
        if (getReminderFragment() == null) {
            C13479a.m54764b("ScreenshotImageAlertPlugin", "Show Screenshot alert dialog...");
            FragmentActivity activity = getActivity();
            Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
            ((ScreenshotImageAlertFragment) instantiateFragment(ScreenshotImageAlertFragment.class)).mo5511a(activity.getSupportFragmentManager(), "ScreenshotImageAlertPlugin");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$onAttachToHost$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "active", "(Ljava/lang/Boolean;)V", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin$d */
    public static final class C11100d implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertPlugin f29809a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11100d(ScreenshotImageAlertPlugin screenshotImageAlertPlugin) {
            this.f29809a = screenshotImageAlertPlugin;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            C1177w<File> imageBitmap;
            if (Intrinsics.areEqual((Object) bool, (Object) true)) {
                UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = this.f29809a.orientationPlugin;
                if (unspecifiedOrientationPlugin != null) {
                    unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this.f29809a);
                }
                this.f29809a.showFragment();
                return;
            }
            this.f29809a.hideFragment();
            ScreenshotImageAlertViewModel bVar = this.f29809a.viewModel;
            if (!(bVar == null || (imageBitmap = bVar.getImageBitmap()) == null)) {
                imageBitmap.mo5929b((File) null);
            }
            UnspecifiedOrientationPlugin unspecifiedOrientationPlugin2 = this.f29809a.orientationPlugin;
            if (unspecifiedOrientationPlugin2 != null) {
                unspecifiedOrientationPlugin2.onOrientationSupportPanelDismiss(this.f29809a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/sheet/exportimage/alert/ScreenshotImageAlertPlugin$onAttachToHost$3", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver$OnScreenshotListener;", "onScreenshot", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "dateAdded", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.exportimage.alert.ScreenshotImageAlertPlugin$f */
    public static final class C11102f implements IScreenshotObserver.OnScreenshotListener {

        /* renamed from: a */
        final /* synthetic */ ScreenshotImageAlertPlugin f29811a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11102f(ScreenshotImageAlertPlugin screenshotImageAlertPlugin) {
            this.f29811a = screenshotImageAlertPlugin;
        }

        @Override // com.bytedance.ee.bear.sheet.screenshotobserver.IScreenshotObserver.OnScreenshotListener
        /* renamed from: a */
        public void mo42346a(String str, long j) {
            Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            C13479a.m54764b("ScreenshotImageAlertPlugin", "Notify js bridge Screenshot occurred.");
            this.f29811a.execJS("javascript:window.lark.biz.sheet.onScreenShot", new JSONObject());
        }
    }

    public void onAttachToHost(C6095s sVar) {
        BearUrl bearUrl;
        C1177w<Boolean> active;
        super.onAttachToHost((C4943e) sVar);
        ShowImageAlertHandler bVar = new ShowImageAlertHandler();
        this.imageAlertHandler = bVar;
        bindBridgeHandler("biz.util.showImageAlert", bVar);
        ScreenshotImageAlertViewModel bVar2 = (ScreenshotImageAlertViewModel) viewModel(ScreenshotImageAlertViewModel.class);
        this.viewModel = bVar2;
        if (!(bVar2 == null || (active = bVar2.getActive()) == null)) {
            active.mo5923a(getLifecycleOwner(), new C11100d(this));
        }
        ScreenshotImageAlertViewModel bVar3 = this.viewModel;
        if (bVar3 != null) {
            bVar3.setDelegete(new C11101e(this));
        }
        this.listener = new C11102f(this);
        this.screenshotObserverPlugin = (ScreenshotObserverPlugin) findPlugin(ScreenshotObserverPlugin.class);
        this.orientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        this.shareImageDataPlugin = (ShareImageDataPlugin) findPlugin(ShareImageDataPlugin.class);
        C11088a aVar = this.sheetAnalytic;
        DocViewModel docViewModel = getDocViewModel();
        if (docViewModel != null) {
            bearUrl = docViewModel.getBearUrl();
        } else {
            bearUrl = null;
        }
        aVar.mo42260a(bearUrl);
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        ScreenshotObserverPlugin screenshotObserverPlugin2 = this.screenshotObserverPlugin;
        if (screenshotObserverPlugin2 != null) {
            screenshotObserverPlugin2.addScreenshotListener(this.listener);
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        C1177w<Boolean> active;
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        ScreenshotObserverPlugin screenshotObserverPlugin2 = this.screenshotObserverPlugin;
        if (screenshotObserverPlugin2 != null) {
            screenshotObserverPlugin2.removeScreenshotListener(this.listener);
        }
        ScreenshotImageAlertViewModel bVar = this.viewModel;
        if (bVar != null && (active = bVar.getActive()) != null) {
            active.mo5929b((Boolean) false);
        }
    }
}
