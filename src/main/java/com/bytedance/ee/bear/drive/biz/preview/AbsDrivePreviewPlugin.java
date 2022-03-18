package com.bytedance.ee.bear.drive.biz.preview;

import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.config.C6920b;
import com.bytedance.ee.bear.drive.core.AbsDrivePlugin;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.drive.core.load.IFileLoader;
import com.bytedance.ee.bear.drive.loader.model.ErrCode;
import com.bytedance.ee.bear.drive.loader.model.InfoCode;
import com.bytedance.ee.bear.drive.report.C7130c;
import com.bytedance.ee.bear.drive.services.DriveOpenMonitorImpl;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7256c;
import com.bytedance.ee.bear.drive.view.preview.wrapper.AbstractC7549a;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7553d;
import com.bytedance.ee.bear.drive.view.preview.wrapper.C7554e;
import com.bytedance.ee.bear.drive.view.preview.wrapper.NotSupportPreviewView;
import com.bytedance.ee.bear.drive.view.preview.wrapper.ViewOwner;
import com.bytedance.ee.util.p718t.C13726a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0004¢\u0006\u0002\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001e0\u001a\"\u00020\u001eH\u0004¢\u0006\u0002\u0010\u001fJ\n\u0010 \u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0012\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010,\u001a\u00020\u0006H\u0004J\u0012\u0010+\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0004J\b\u0010.\u001a\u00020\u0016H\u0004J\u0012\u0010/\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u000202H\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00063"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin;", "Lcom/bytedance/ee/bear/drive/core/AbsDrivePlugin;", "()V", "mCurrentIPreviewView", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/IPreviewView;", "mCurrentPreviewView", "Landroid/view/View;", "getMCurrentPreviewView", "()Landroid/view/View;", "setMCurrentPreviewView", "(Landroid/view/View;)V", "mPreviewContainer", "Landroid/view/ViewGroup;", "getMPreviewContainer", "()Landroid/view/ViewGroup;", "setMPreviewContainer", "(Landroid/view/ViewGroup;)V", "mPreviewViewManager", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewViewManager;", "getMPreviewViewManager", "()Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewViewManager;", "addErrorHandler", "", "cmd", "Ljava/lang/Runnable;", "codes", "", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "(Ljava/lang/Runnable;[Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;)V", "addInfoHandler", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", "(Ljava/lang/Runnable;[Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;)V", "currentPreviewView", "isShowingContent", "", "onAttachToUIContainer", "host", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "onConfigurationChanged", "newConfiguration", "Landroid/content/res/Configuration;", "removeAndAddPreviewView", "view", "previewView", "removePreviewView", "setPreviewOpenCallback", "showFileNotSupportPreview", "previewFileModel", "Lcom/bytedance/ee/bear/drive/view/preview/wrapper/PreviewFileModel;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public abstract class AbsDrivePreviewPlugin extends AbsDrivePlugin {
    private AbstractC7549a mCurrentIPreviewView;
    private View mCurrentPreviewView;
    private ViewGroup mPreviewContainer;
    private final C7554e mPreviewViewManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin$setPreviewOpenCallback$1", "Lcom/bytedance/ee/bear/drive/view/preview/OnShowViewTrackEventCallback;", "onShowFailure", "", "openType", "", "throwable", "", "onShowStart", "onShowSuccess", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin$c */
    public static final class C6538c implements AbstractC7256c {
        @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
        /* renamed from: a */
        public void mo26117a() {
        }

        C6538c() {
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
        /* renamed from: a */
        public void mo26118a(String str) {
            DriveOpenMonitorImpl.f19302b.mo28169a();
        }

        @Override // com.bytedance.ee.bear.drive.view.preview.AbstractC7256c
        /* renamed from: a */
        public void mo26119a(String str, Throwable th) {
            DriveOpenMonitorImpl.f19302b.mo28169a();
        }
    }

    public AbstractC7549a currentPreviewView() {
        return this.mCurrentIPreviewView;
    }

    /* access modifiers changed from: protected */
    public final View getMCurrentPreviewView() {
        return this.mCurrentPreviewView;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup getMPreviewContainer() {
        return this.mPreviewContainer;
    }

    /* access modifiers changed from: protected */
    public final C7554e getMPreviewViewManager() {
        return this.mPreviewViewManager;
    }

    public boolean isShowingContent() {
        View view = this.mCurrentPreviewView;
        if (view == null || view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public AbsDrivePreviewPlugin() {
        C6920b f = C6920b.m27342f();
        Intrinsics.checkExpressionValueIsNotNull(f, "DriveConfigServiceImpl.getInstance()");
        this.mPreviewViewManager = new C7554e(f.mo27169d());
    }

    public final void removePreviewView() {
        ViewGroup viewGroup = this.mPreviewContainer;
        if (viewGroup != null) {
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            if (viewGroup.getChildCount() > 0) {
                ViewGroup viewGroup2 = this.mPreviewContainer;
                if (viewGroup2 == null) {
                    Intrinsics.throwNpe();
                }
                viewGroup2.removeAllViews();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void setMCurrentPreviewView(View view) {
        this.mCurrentPreviewView = view;
    }

    /* access modifiers changed from: protected */
    public final void setMPreviewContainer(ViewGroup viewGroup) {
        this.mPreviewContainer = viewGroup;
    }

    private final void setPreviewOpenCallback(AbstractC7549a aVar) {
        if (aVar != null) {
            aVar.setOnShowViewTrackEventCallback(new C6538c());
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbstractC7549a aVar = this.mCurrentIPreviewView;
        if (aVar != null) {
            aVar.mo28370a(configuration);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin$addErrorHandler$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onFailed", "", "srcCode", "Lcom/bytedance/ee/bear/drive/loader/model/ErrCode;", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin$a */
    public static final class C6536a extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ ErrCode[] f17989a;

        /* renamed from: b */
        final /* synthetic */ Runnable f17990b;

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public void mo25511a(ErrCode errCode) {
            Intrinsics.checkParameterIsNotNull(errCode, "srcCode");
            for (ErrCode errCode2 : this.f17989a) {
                if (errCode2 == errCode) {
                    this.f17990b.run();
                    return;
                }
            }
        }

        C6536a(ErrCode[] errCodeArr, Runnable runnable) {
            this.f17989a = errCodeArr;
            this.f17990b = runnable;
        }
    }

    public final void removeAndAddPreviewView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        removePreviewView();
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ViewGroup viewGroup = this.mPreviewContainer;
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
        }
        this.mCurrentPreviewView = view;
    }

    /* access modifiers changed from: protected */
    public final void showFileNotSupportPreview(C7553d dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "previewFileModel");
        if (C13726a.m55676b(getActivity())) {
            removeAndAddPreviewView(new NotSupportPreviewView(new ViewOwner(getHost(), getLifecycleOwner()), getActivity(), dVar, null));
        }
    }

    public final void removeAndAddPreviewView(AbstractC7549a aVar) {
        View view;
        if (this.mPreviewContainer == null || aVar == null || aVar.getView() == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("removeAndAddPreviewView() mPreviewContainer=");
            sb.append(this.mPreviewContainer);
            sb.append(" previewView=");
            sb.append(aVar);
            sb.append(" previewView.view=");
            if (aVar != null) {
                view = aVar.getView();
            } else {
                view = null;
            }
            sb.append(view);
            Log.w("DriveComponent", sb.toString());
            return;
        }
        setPreviewOpenCallback(aVar);
        View view2 = aVar.getView();
        Intrinsics.checkExpressionValueIsNotNull(view2, "previewView.view");
        removeAndAddPreviewView(view2);
        aVar.show();
        this.mCurrentIPreviewView = aVar;
        DrivePluginHost aVar2 = (DrivePluginHost) getHost();
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "host");
        C7130c a = C6891a.m27229a(aVar2);
        BaseOpenEntity openEntity = ((DrivePluginHost) getHost()).mo27261l().getOpenEntity();
        Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
        a.mo27901a(openEntity.getBizType(), ((DrivePluginHost) getHost()).mo27261l().getFileModel(), aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u0001H\u0004H\u0016¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/drive/biz/preview/AbsDrivePreviewPlugin$addInfoHandler$1", "Lcom/bytedance/ee/bear/drive/core/load/IFileLoader$SimpleLoadListener;", "onInfo", "", "T", "srcCode", "Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Lcom/bytedance/ee/bear/drive/loader/model/InfoCode;Ljava/lang/Object;)V", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.AbsDrivePreviewPlugin$b */
    public static final class C6537b extends IFileLoader.SimpleLoadListener {

        /* renamed from: a */
        final /* synthetic */ InfoCode[] f17991a;

        /* renamed from: b */
        final /* synthetic */ Runnable f17992b;

        C6537b(InfoCode[] infoCodeArr, Runnable runnable) {
            this.f17991a = infoCodeArr;
            this.f17992b = runnable;
        }

        @Override // com.bytedance.ee.bear.drive.core.load.IFileLoader.SimpleLoadListener, com.bytedance.ee.bear.drive.core.load.IFileLoader.LoadListener
        /* renamed from: a */
        public <T> void mo25427a(InfoCode infoCode, T t) {
            Intrinsics.checkParameterIsNotNull(infoCode, "srcCode");
            for (InfoCode infoCode2 : this.f17991a) {
                if (infoCode2 == infoCode) {
                    this.f17992b.run();
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void addErrorHandler(Runnable runnable, ErrCode... errCodeArr) {
        Intrinsics.checkParameterIsNotNull(runnable, "cmd");
        Intrinsics.checkParameterIsNotNull(errCodeArr, "codes");
        ((DrivePluginHost) getHost()).mo27262m().mo27297a(new C6536a(errCodeArr, runnable));
    }

    /* access modifiers changed from: protected */
    public final void addInfoHandler(Runnable runnable, InfoCode... infoCodeArr) {
        Intrinsics.checkParameterIsNotNull(runnable, "cmd");
        Intrinsics.checkParameterIsNotNull(infoCodeArr, "codes");
        ((DrivePluginHost) getHost()).mo27262m().mo27297a(new C6537b(infoCodeArr, runnable));
    }

    public void onAttachToUIContainer(DrivePluginHost aVar, AbstractC4958n nVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        Intrinsics.checkParameterIsNotNull(nVar, "uiContainer");
        super.onAttachToUIContainer((C4943e) aVar, nVar);
        View a = nVar.mo19583a(R.id.drive_preview_container);
        if (a != null) {
            this.mPreviewContainer = (ViewGroup) a;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
