package com.bytedance.ee.bear.document.comment.imageviewer;

import android.content.Context;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.browser.C4933k;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.document.C6095s;
import com.bytedance.ee.bear.document.DocumentPlugin;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u0005¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\fH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0002R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0000X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin;", "Lcom/bytedance/ee/bear/document/DocumentPlugin;", "()V", "handler", "Lcom/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$OpenCommentImageViewerHandler;", "imageViewer", "Lcom/bytedance/ee/bear/contract/imageviewer/api/IImageViewer;", "viewModel", "Lcom/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerViewModel;", "getBridgeHandlers", "", "handlersHolder", "", "", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "onAttachToHost", "host", "Lcom/bytedance/ee/bear/document/DocumentPluginHost;", "onDetachFromUIContainer", "uiContainer", "Lcom/bytedance/ee/bear/browser/plugin/UIContainer;", "openCommentImageViewer", "Companion", "OpenCommentImageViewerHandler", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class CommentImageViewerPlugin extends DocumentPlugin {
    public static final Companion Companion = new Companion(null);
    public OpenCommentImageViewerHandler handler;
    public AbstractC5179a imageViewer;
    public C5720a viewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$OpenCommentImageViewerHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/comment/imageviewer/OpenCommentImageModel;", "(Lcom/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin;)V", "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "close", "", "handle", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "onCallback", "index", "", "swipe", "currentIndex", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin$b */
    private final class OpenCommentImageViewerHandler implements AbstractC7945d<OpenCommentImageModel> {

        /* renamed from: b */
        private AbstractC7947h f16096b;

        /* renamed from: a */
        public final void mo22911a() {
            C13479a.m54764b("CommentImageViewerPlugin", "Close comment image viewer.");
            m23104b(-1);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OpenCommentImageViewerHandler() {
        }

        /* renamed from: b */
        private final void m23104b(int i) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((Object) "index", (Object) Integer.valueOf(i));
            AbstractC7947h hVar = this.f16096b;
            if (hVar != null) {
                hVar.mo17188a(jSONObject);
            }
        }

        /* renamed from: a */
        public final void mo22912a(int i) {
            C13479a.m54764b("CommentImageViewerPlugin", "Swipe comment image. currentIndex = " + i);
            m23104b(i);
        }

        /* renamed from: a */
        public void handle(OpenCommentImageModel openCommentImageModel, AbstractC7947h hVar) {
            C5720a aVar;
            C13479a.m54764b("CommentImageViewerPlugin", "OpenCommentImageViewerHandler#handle() data = " + openCommentImageModel);
            if (openCommentImageModel == null) {
                C13479a.m54758a("CommentImageViewerPlugin", "data = null");
                return;
            }
            this.f16096b = hVar;
            boolean isActive = OpenCommentImageModel.isActive(openCommentImageModel);
            if (isActive && (aVar = CommentImageViewerPlugin.this.viewModel) != null) {
                aVar.setImageList(openCommentImageModel);
            }
            C5720a aVar2 = CommentImageViewerPlugin.this.viewModel;
            if (aVar2 != null) {
                aVar2.setActive(isActive);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"com/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$openCommentImageViewer$2", "Lcom/bytedance/ee/bear/contract/imageviewer/listener/ImageViewerStatusListener;", "onClose", "", "uuid", "", "onCreated", "onDestroy", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin$f */
    public static final class C5719f implements AbstractC5188c {

        /* renamed from: a */
        final /* synthetic */ CommentImageViewerPlugin f16100a;

        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
        /* renamed from: a */
        public void mo20757a() {
        }

        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
        /* renamed from: b */
        public void mo20759b() {
            this.f16100a.imageViewer = null;
            C5720a aVar = this.f16100a.viewModel;
            if (aVar != null) {
                aVar.setActive(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5719f(CommentImageViewerPlugin commentImageViewerPlugin) {
            this.f16100a = commentImageViewerPlugin;
        }

        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
        /* renamed from: a */
        public void mo20758a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "uuid");
            ((AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null)).mo20684a(this.f16100a.getFragmentManager(), "CommentImageViewerPlugin");
            OpenCommentImageViewerHandler bVar = this.f16100a.handler;
            if (bVar != null) {
                bVar.mo22911a();
            }
        }
    }

    public final void openCommentImageViewer() {
        C1177w<ImageData> commentImageData;
        ImageData b;
        C5720a aVar = this.viewModel;
        if (aVar != null && (commentImageData = aVar.getCommentImageData()) != null && (b = commentImageData.mo5927b()) != null) {
            C4957m a = C4957m.m20521a(R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation, R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation);
            AbstractC5180b bVar = (AbstractC5180b) KoinJavaComponent.m268613a(AbstractC5180b.class, null, null, 6, null);
            Context context = getContext();
            AbstractC4958n uIContainer = getUIContainer();
            Intrinsics.checkExpressionValueIsNotNull(uIContainer, "uiContainer");
            AbstractC5179a a2 = bVar.mo20682a(context, uIContainer.mo19602g(), a, getUIContainer().mo19598d(this), b, "CommentImageViewerPlugin", getDocViewModel().getToken(), getDocViewModel().getDocumentTypeValue());
            this.imageViewer = a2;
            if (a2 != null) {
                a2.mo20677a(new C5718e(this));
            }
            AbstractC5179a aVar2 = this.imageViewer;
            if (aVar2 != null) {
                aVar2.mo20678a(new C5719f(this));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"com/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$onAttachToHost$1", "Landroidx/lifecycle/Observer;", "", "onChanged", "", "active", "(Ljava/lang/Boolean;)V", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin$c */
    public static final class C5716c implements AbstractC1178x<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CommentImageViewerPlugin f16097a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5716c(CommentImageViewerPlugin commentImageViewerPlugin) {
            this.f16097a = commentImageViewerPlugin;
        }

        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (!Intrinsics.areEqual((Object) bool, (Object) true)) {
                AbstractC5179a aVar = this.f16097a.imageViewer;
                if (aVar != null) {
                    aVar.mo20671a();
                }
            } else if (this.f16097a.getUIContainer().mo19586a((AbstractC4941c) this.f16097a) == null) {
                this.f16097a.openCommentImageViewer();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$onAttachToHost$2", "Landroidx/lifecycle/Observer;", "Lcom/bytedance/ee/bear/contract/imageviewer/bean/ImageData;", "onChanged", "", "imageData", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin$d */
    public static final class C5717d implements AbstractC1178x<ImageData> {

        /* renamed from: a */
        final /* synthetic */ CommentImageViewerPlugin f16098a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5717d(CommentImageViewerPlugin commentImageViewerPlugin) {
            this.f16098a = commentImageViewerPlugin;
        }

        /* renamed from: a */
        public void onChanged(ImageData imageData) {
            if (imageData != null) {
                C13479a.m54764b("CommentImageViewerPlugin", "imageViewer?.updateImageData: " + imageData);
                AbstractC5179a aVar = this.f16098a.imageViewer;
                if (aVar != null) {
                    aVar.mo20675a(imageData);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/document/comment/imageviewer/CommentImageViewerPlugin$openCommentImageViewer$1", "Lcom/bytedance/ee/bear/contract/imageviewer/listener/ImageStatusListener;", "loadError", "", "uuid", "", "index", "", "onDeleteCurrentImage", "onSwipe", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.comment.imageviewer.CommentImageViewerPlugin$e */
    public static final class C5718e implements AbstractC5187b {

        /* renamed from: a */
        final /* synthetic */ CommentImageViewerPlugin f16099a;

        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
        /* renamed from: a */
        public void mo20754a() {
        }

        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
        /* renamed from: b */
        public void mo20756b(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "uuid");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C5718e(CommentImageViewerPlugin commentImageViewerPlugin) {
            this.f16099a = commentImageViewerPlugin;
        }

        @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
        /* renamed from: a */
        public void mo20755a(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "uuid");
            OpenCommentImageViewerHandler bVar = this.f16099a.handler;
            if (bVar != null) {
                bVar.mo22912a(i);
            }
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPlugin, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        Intrinsics.checkParameterIsNotNull(map, "handlersHolder");
        OpenCommentImageViewerHandler bVar = new OpenCommentImageViewerHandler();
        this.handler = bVar;
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        map.put("biz.comment.openImageForComment", bVar);
    }

    public void onAttachToHost(C6095s sVar) {
        C1177w<ImageData> commentImageData;
        C1177w<Boolean> active;
        Intrinsics.checkParameterIsNotNull(sVar, "host");
        super.onAttachToHost((C4943e) sVar);
        C5720a aVar = (C5720a) viewModel(C5720a.class);
        this.viewModel = aVar;
        if (!(aVar == null || (active = aVar.getActive()) == null)) {
            active.mo5923a(getLifecycleOwner(), new C5716c(this));
        }
        C5720a aVar2 = this.viewModel;
        if (aVar2 != null && (commentImageData = aVar2.getCommentImageData()) != null) {
            commentImageData.mo5923a(getLifecycleOwner(), new C5717d(this));
        }
    }

    public void onDetachFromUIContainer(C6095s sVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer((C4933k) sVar, nVar);
        C5720a aVar = this.viewModel;
        if (aVar != null) {
            aVar.setActive(false);
        }
    }
}
