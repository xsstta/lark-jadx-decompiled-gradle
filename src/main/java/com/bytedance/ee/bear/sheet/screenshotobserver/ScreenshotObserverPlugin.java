package com.bytedance.ee.bear.sheet.screenshotobserver;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.middleground_permission_export.model.IAdminPermissionProxy;
import com.bytedance.ee.bear.sheet.screenshotobserver.IScreenshotObserver;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0010\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserverPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "screenshotObserver", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserver;", "addScreenshotListener", "", "listener", "Lcom/bytedance/ee/bear/sheet/screenshotobserver/IScreenshotObserver$OnScreenshotListener;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onAttachToUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onDetachFromHost", "onDetachFromUIContainer", "removeScreenshotListener", "Companion", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class ScreenshotObserverPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    private ScreenshotObserver screenshotObserver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/sheet/screenshotobserver/ScreenshotObserverPlugin$Companion;", "", "()V", "TAG", "", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.sheet.screenshotobserver.ScreenshotObserverPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void addScreenshotListener(IScreenshotObserver.OnScreenshotListener aVar) {
        ScreenshotObserver screenshotObserver2;
        if (aVar != null && (screenshotObserver2 = this.screenshotObserver) != null) {
            screenshotObserver2.mo43264a(aVar);
        }
    }

    public void onDetachFromHost(C6095s sVar) {
        super.onDetachFromHost((C4943e) sVar);
        ScreenshotObserver screenshotObserver2 = this.screenshotObserver;
        if (screenshotObserver2 != null) {
            screenshotObserver2.mo43269d();
        }
    }

    public final void removeScreenshotListener(IScreenshotObserver.OnScreenshotListener aVar) {
        ScreenshotObserver screenshotObserver2;
        if (aVar != null && (screenshotObserver2 = this.screenshotObserver) != null) {
            screenshotObserver2.mo43267b(aVar);
        }
    }

    public void onAttachToHost(C6095s sVar) {
        super.onAttachToHost((C4943e) sVar);
        boolean c = ((IAdminPermissionProxy) KoinJavaComponent.m268613a(IAdminPermissionProxy.class, null, null, 6, null)).mo36544c(getDocViewModel().getDocumentTypeValue(), getDocViewModel().getToken());
        C13479a.m54764b("ScreenshotObserverPlugin", "adminCanExport:" + c);
        if (c) {
            ScreenshotObserver screenshotObserver2 = new ScreenshotObserver();
            this.screenshotObserver = screenshotObserver2;
            if (screenshotObserver2 != null) {
                FragmentActivity activity = getActivity();
                Intrinsics.checkExpressionValueIsNotNull(activity, "activity");
                List<String> a = C4211a.m17514a().mo16534a("screenshot_keywords", String.class, new ArrayList());
                Intrinsics.checkExpressionValueIsNotNull(a, "AppSetting.getInstance()…ava, ArrayList<String>())");
                screenshotObserver2.mo43262a(activity, a);
            }
        }
    }

    public void onAttachToUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer((C4943e) sVar, nVar);
        ScreenshotObserver screenshotObserver2 = this.screenshotObserver;
        if (screenshotObserver2 != null) {
            screenshotObserver2.mo43266b();
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        ScreenshotObserver screenshotObserver2 = this.screenshotObserver;
        if (screenshotObserver2 != null) {
            screenshotObserver2.mo43268c();
        }
    }
}
