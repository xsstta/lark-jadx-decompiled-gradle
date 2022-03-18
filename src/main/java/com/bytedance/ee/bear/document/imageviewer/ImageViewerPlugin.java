package com.bytedance.ee.bear.document.imageviewer;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1177w;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aj;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4958n;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4957m;
import com.bytedance.ee.bear.contract.C5234y;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageCommentData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageType;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5179a;
import com.bytedance.ee.bear.contract.imageviewer.p285a.AbstractC5180b;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a;
import com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5186a;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c;
import com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e;
import com.bytedance.ee.bear.document.DocumentPluginV2;
import com.bytedance.ee.bear.document.comment.CommentPlugin;
import com.bytedance.ee.bear.document.comment.bean.Card;
import com.bytedance.ee.bear.document.comment.bean.ShowCardsJsData;
import com.bytedance.ee.bear.document.imageviewer.C5852b;
import com.bytedance.ee.bear.document.imageviewer.bean.CardCommentData;
import com.bytedance.ee.bear.document.imageviewer.bean.DeleteImageData;
import com.bytedance.ee.bear.document.imageviewer.bean.ImageCardsData;
import com.bytedance.ee.bear.document.imageviewer.bean.ImageDataModel;
import com.bytedance.ee.bear.document.imageviewer.diagram.DiagramPlugin;
import com.bytedance.ee.bear.document.multitask.MultiTaskPlugin;
import com.bytedance.ee.bear.document.offline.C5890a;
import com.bytedance.ee.bear.document.orientation.AbstractC6054a;
import com.bytedance.ee.bear.document.orientation.SensorOrientationDetectorPlugin;
import com.bytedance.ee.bear.document.orientation.UnspecifiedOrientationPlugin;
import com.bytedance.ee.bear.document.templatePlugin.GroupTemplatePreviewPlugin;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p709l.AbstractC13696d;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.List;
import java.util.Map;
import org.koin.java.KoinJavaComponent;

public class ImageViewerPlugin extends DocumentPluginV2 implements AbstractC6054a {
    public C5852b imageViewerViewModel;
    public C5851a mAnalytic;
    public ImageDataModel mCurrentImageData;
    private ImageCardsData mImageCardsData;
    public AbstractC5179a mImageViewer;
    private C1177w<Boolean> mIsActive;
    private AbstractC1178x<AbstractC13696d> mLandScapeObserver;
    public AbstractC7947h mOpenCallBack;

    @Override // com.bytedance.ee.bear.document.orientation.AbstractC6054a
    public boolean shouldDisableLandscape() {
        return false;
    }

    private void closeImageViewer() {
        AbstractC5179a aVar = this.mImageViewer;
        if (aVar != null) {
            aVar.mo20671a();
        }
    }

    public LiveData<Boolean> getIsActive() {
        if (this.mIsActive == null) {
            this.mIsActive = new C1177w<>();
        }
        return this.mIsActive;
    }

    private BearUrl getBearUrl() {
        if (getDocumentMetadata() != null) {
            return getDocumentMetadata().getBearUrl();
        }
        return null;
    }

    public void resetData() {
        this.imageViewerViewModel.updateDeleteImageData(null);
        this.imageViewerViewModel.updateCardsData(null);
        this.imageViewerViewModel.updateImageData(null);
        DiagramPlugin diagramPlugin = (DiagramPlugin) findPlugin(DiagramPlugin.class);
        if (diagramPlugin != null) {
            diagramPlugin.unregisterDiagramBase64DataRequestListener();
        }
    }

    private void processOrientationChange() {
        SensorOrientationDetectorPlugin sensorOrientationDetectorPlugin = (SensorOrientationDetectorPlugin) findPlugin(SensorOrientationDetectorPlugin.class);
        if (sensorOrientationDetectorPlugin != null) {
            if (this.mLandScapeObserver == null) {
                this.mLandScapeObserver = new AbstractC1178x() {
                    /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$a9X9poo2KlgawiewXBNI3SfLWd8 */

                    @Override // androidx.lifecycle.AbstractC1178x
                    public final void onChanged(Object obj) {
                        ImageViewerPlugin.this.lambda$processOrientationChange$4$ImageViewerPlugin((AbstractC13696d) obj);
                    }
                };
            }
            sensorOrientationDetectorPlugin.getOrientation().mo5923a(getLifecycleOwner(), this.mLandScapeObserver);
        }
    }

    public void showCommentCard() {
        this.mAnalytic.mo23472j();
        if (this.mImageCardsData == null) {
            C13479a.m54758a("ImageViewerPlugin", "showCommentCard(), imageCommentData is null");
            return;
        }
        String c = this.mImageViewer.mo20680c();
        CardCommentData cardCommentData = this.mImageCardsData.getData().get(c);
        if (!cardCommentData.isCommentable()) {
            C13479a.m54764b("ImageViewerPlugin", "can not comment");
            return;
        }
        List<Card> comments = cardCommentData.getComments();
        if (comments == null || comments.size() == 0 || comments.get(0).getCommentList() == null || comments.get(0).getCommentList().size() == 0) {
            this.imageViewerViewModel.showCommentInput(c);
        } else {
            this.imageViewerViewModel.showCommentCards(c, this.mImageCardsData);
        }
    }

    private void updateImageCommentData() {
        boolean z;
        int i;
        C13479a.m54764b("ImageViewerPlugin", "updateImageCommentData");
        if (this.mImageViewer != null) {
            ImageCommentData imageCommentData = null;
            ImageCardsData imageCardsData = this.mImageCardsData;
            if (!(imageCardsData == null || imageCardsData.getData() == null || this.mImageCardsData.getData().isEmpty())) {
                imageCommentData = new ImageCommentData();
                for (Map.Entry<String, CardCommentData> entry : this.mImageCardsData.getData().entrySet()) {
                    String key = entry.getKey();
                    CardCommentData value = entry.getValue();
                    boolean z2 = true;
                    if (value == null || value.getComments() == null || value.getComments().size() == 0 || value.getComments().get(0).getCommentList() == null || value.getComments().get(0).getCommentList().isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        i = 0;
                        for (int i2 = 0; i2 < value.getComments().size(); i2++) {
                            i += value.getComments().get(i2).getCommentList().size();
                            if (value.getComments().get(i2).getCommentList().size() >= 1 && value.getComments().get(i2).getCommentList().get(0).getReply_id().equals("fake_reply_id")) {
                                i -= 2;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (value == null || !value.isCommentable()) {
                        z2 = false;
                    }
                    imageCommentData.setCommentInfo(key, z2, i);
                }
            }
            C13479a.m54764b("ImageViewerPlugin", "updateImageCommentData");
            this.mImageViewer.mo20674a(imageCommentData);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin$a */
    private class C5847a implements AbstractC7945d<Void> {
        private C5847a() {
        }

        /* renamed from: a */
        public void handle(Void r1, AbstractC7947h hVar) {
            C13479a.m54764b("ImageViewerPlugin", "CloseImgViewerHandler handle(): ");
            if (ImageViewerPlugin.this.imageViewerViewModel != null) {
                ImageViewerPlugin.this.imageViewerViewModel.setCloseImageViewer(true);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin$b */
    private class C5848b implements AbstractC7945d<DeleteImageData> {
        private C5848b() {
        }

        /* renamed from: a */
        public void handle(DeleteImageData deleteImageData, AbstractC7947h hVar) {
            C13479a.m54772d("ImageViewerPlugin", "updateDeleteImageData...");
            if (deleteImageData == null) {
                C13479a.m54758a("ImageViewerPlugin", "JS request delete image data is null");
            } else {
                ImageViewerPlugin.this.imageViewerViewModel.updateDeleteImageData(deleteImageData);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin$c */
    private class C5849c implements AbstractC7945d<ImageCardsData> {
        private C5849c() {
        }

        /* renamed from: a */
        public void handle(ImageCardsData imageCardsData, AbstractC7947h hVar) {
            if (imageCardsData == null) {
                C13479a.m54758a("ImageViewerPlugin", "JS request image comments is null");
                return;
            }
            C13479a.m54764b("ImageViewerPlugin", "ImageCommentHandler, handle()...");
            ImageViewerPlugin.this.imageViewerViewModel.updateCardsData(imageCardsData);
        }
    }

    /* renamed from: com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin$d */
    private class C5850d implements AbstractC7945d<ImageDataModel> {
        private C5850d() {
        }

        /* renamed from: a */
        public void handle(ImageDataModel imageDataModel, AbstractC7947h hVar) {
            ImageViewerPlugin.this.mOpenCallBack = hVar;
            if (imageDataModel != null) {
                C13479a.m54764b("ImageViewerPlugin", "OpenImageHandler, handle()...");
                if (!C4211a.m17514a().mo16536a("spacekit.mobile.img_viewer_anim_enable", false) && imageDataModel.getImage() != null) {
                    imageDataModel.getImage().setPosition(null);
                }
                if (imageDataModel.hasValidEnterAnimator() && ImageViewerPlugin.this.getEditorAbility() != null) {
                    ImageData.Position position = imageDataModel.getImage().getPosition();
                    int[] iArr = new int[2];
                    ImageViewerPlugin.this.getEditorAbility().mo24603r().getLocationInWindow(iArr);
                    position.f14904y += (float) C13749l.m55749b(iArr[1]);
                }
                ImageViewerPlugin.this.imageViewerViewModel.openImage(imageDataModel);
            }
        }
    }

    public /* synthetic */ void lambda$addFragment$5$ImageViewerPlugin(String str) {
        this.imageViewerViewModel.deleteImage(str);
    }

    public /* synthetic */ void lambda$onAttachToHost$1$ImageViewerPlugin(Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            closeImageViewer();
        }
    }

    public void setIsActiveValue(Boolean bool) {
        ((C1177w) getIsActive()).mo5929b(bool);
    }

    public /* synthetic */ void lambda$onAttachToHost$2$ImageViewerPlugin(ImageCardsData imageCardsData) {
        if (this.mImageCardsData != null) {
            this.mAnalytic.mo23460b();
        }
        this.mImageCardsData = imageCardsData;
        updateCommentCard(imageCardsData);
        updateImageCommentData();
    }

    private void updateCommentCard(ImageCardsData imageCardsData) {
        if (imageCardsData == null) {
            C13479a.m54758a("ImageViewerPlugin", "updateCommentCard(), imageCommentData is null");
        } else if (!TextUtils.isEmpty(this.mImageCardsData.getCur_comment_id())) {
            AbstractC5179a aVar = this.mImageViewer;
            if (aVar != null) {
                this.imageViewerViewModel.showCommentCards(aVar.mo20680c(), this.mImageCardsData);
            }
        } else {
            this.imageViewerViewModel.closeCommentCards();
        }
    }

    /* access modifiers changed from: private */
    public void updateDeleteImageData(DeleteImageData deleteImageData) {
        if (deleteImageData == null) {
            C13479a.m54758a("ImageViewerPlugin", "updateDeleteImageData(): deleteImageData == null");
        } else if (deleteImageData.isSuccess()) {
            Toast.showSuccessText(getContext(), getContext().getString(R.string.Doc_Facade_DeleteSuccessfully), 0);
            closeImageViewer();
        } else {
            Toast.showFailureText(getContext(), getContext().getString(R.string.Doc_Facade_DeleteFailedNoNet), 0);
        }
    }

    @Override // com.bytedance.ee.bear.document.DocumentPluginV2, com.bytedance.ee.bear.browser.plugin.lazy.AbstractC4952a
    public void getBridgeHandlers(Map<String, AbstractC7945d<?>> map) {
        map.put("biz.util.openImg", new C5850d());
        map.put("biz.comment.showOuterDocCards", new C5849c());
        map.put("biz.util.deleteImgCallback", new C5848b());
        map.put("biz.util.closeImgViewer", new C5847a());
    }

    public /* synthetic */ void lambda$onAttachToHost$3$ImageViewerPlugin(Boolean bool) {
        C13479a.m54764b("ImageViewerPlugin", "onChanged(): active = " + bool);
        UnspecifiedOrientationPlugin unspecifiedOrientationPlugin = (UnspecifiedOrientationPlugin) findPlugin(UnspecifiedOrientationPlugin.class);
        if (unspecifiedOrientationPlugin == null) {
            return;
        }
        if (Boolean.TRUE.equals(bool)) {
            unspecifiedOrientationPlugin.onOrientationSupportPanelShowing(this);
        } else {
            unspecifiedOrientationPlugin.onOrientationSupportPanelDismiss(this);
        }
    }

    public /* synthetic */ void lambda$onAttachToHost$0$ImageViewerPlugin(ImageDataModel imageDataModel) {
        if (imageDataModel != null) {
            if (getUIContainer().mo19586a((AbstractC4941c) this) == null && !Boolean.TRUE.equals(getIsActive().mo5927b())) {
                addFragment(getUIContainer(), imageDataModel);
                setIsActiveValue(true);
            }
            this.imageViewerViewModel.setCloseImageViewer(false);
        }
        if (this.mCurrentImageData != null) {
            this.mAnalytic.mo23457a();
        }
        this.mCurrentImageData = imageDataModel;
        AbstractC5179a aVar = this.mImageViewer;
        if (aVar != null) {
            aVar.mo20675a(imageDataModel);
            updateImageCommentData();
        }
    }

    public /* synthetic */ void lambda$processOrientationChange$4$ImageViewerPlugin(AbstractC13696d dVar) {
        boolean z;
        String str;
        if (dVar != null) {
            if (this.mAnalytic == null) {
                this.mAnalytic = new C5851a(C5234y.m21391b(), getBearUrl());
            }
            boolean c = dVar.mo50654c();
            if (getUIContainer().mo19586a((AbstractC4941c) this) == null) {
                z = true;
            } else {
                z = false;
            }
            C13479a.m54764b("ImageViewerPlugin", "imageViewer isLandScape  = " + c + ",image isClose = " + z);
            if (c) {
                C5851a aVar = this.mAnalytic;
                if (z) {
                    str = "doc";
                } else {
                    str = "image";
                }
                aVar.mo23461b(str);
            }
        }
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToHost(C4943e eVar) {
        super.onAttachToHost(eVar);
        this.imageViewerViewModel = (C5852b) aj.m5366a(getActivity()).mo6005a(C5852b.class);
        this.mAnalytic = new C5851a(C5234y.m21391b(), getBearUrl());
        this.imageViewerViewModel.getImageData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$5uHOvsQS6TnFxsEJbdaVwcvKY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ImageViewerPlugin.this.lambda$onAttachToHost$0$ImageViewerPlugin((ImageDataModel) obj);
            }
        });
        this.imageViewerViewModel.getCloseImageViewer().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$eIMk_oXHFNGXGUQwWDyHD29W0l0 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ImageViewerPlugin.this.lambda$onAttachToHost$1$ImageViewerPlugin((Boolean) obj);
            }
        });
        this.imageViewerViewModel.getDeleteImageData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$tU5V35Oy7xbGNznr4WysI8QR5VY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ImageViewerPlugin.this.updateDeleteImageData((DeleteImageData) obj);
            }
        });
        this.imageViewerViewModel.getCardsData().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$ZrGI8Ibgguv5eynCfIMmHzhBuQY */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ImageViewerPlugin.this.lambda$onAttachToHost$2$ImageViewerPlugin((ImageCardsData) obj);
            }
        });
        getIsActive().mo5923a(getLifecycleOwner(), new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$KmCSY5stTRHL8QO4tKugAnjiwk */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                ImageViewerPlugin.this.lambda$onAttachToHost$3$ImageViewerPlugin((Boolean) obj);
            }
        });
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onDetachFromUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onDetachFromUIContainer(eVar, nVar);
        this.imageViewerViewModel.setDelegate(null);
        this.imageViewerViewModel.updateCardsData(null);
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4941c, com.bytedance.ee.bear.browser.plugin.BasePlugin
    public void onAttachToUIContainer(C4943e eVar, AbstractC4958n nVar) {
        super.onAttachToUIContainer(eVar, nVar);
        this.imageViewerViewModel.setDelegate(new C5852b.AbstractC5853a() {
            /* class com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin.C58411 */

            @Override // com.bytedance.ee.bear.document.imageviewer.C5852b.AbstractC5853a
            /* renamed from: b */
            public void mo23451b() {
                CommentPlugin commentPlugin = (CommentPlugin) ImageViewerPlugin.this.findPlugin(CommentPlugin.class);
                if (commentPlugin != null) {
                    commentPlugin.closeCommentCards();
                }
            }

            @Override // com.bytedance.ee.bear.document.imageviewer.C5852b.AbstractC5853a
            /* renamed from: a */
            public void mo23447a() {
                ((AbstractC5180b) KoinJavaComponent.m268610a(AbstractC5180b.class)).mo20684a(ImageViewerPlugin.this.getFragmentManager(), "ImageViewerPlugin");
                ImageViewerPlugin.this.setIsActiveValue(false);
                ImageViewerPlugin.this.dispatchBridgeMsg("window.lark.biz.util.closeImg", new JSONObject());
            }

            @Override // com.bytedance.ee.bear.document.imageviewer.C5852b.AbstractC5853a
            /* renamed from: a */
            public void mo23448a(ShowCardsJsData showCardsJsData) {
                CommentPlugin commentPlugin = (CommentPlugin) ImageViewerPlugin.this.findPlugin(CommentPlugin.class);
                if (commentPlugin != null) {
                    commentPlugin.showCommentCards(showCardsJsData);
                }
            }

            @Override // com.bytedance.ee.bear.document.imageviewer.C5852b.AbstractC5853a
            /* renamed from: a */
            public void mo23449a(String str) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uuid", (Object) str);
                ImageViewerPlugin.this.dispatchBridgeMsg("window.native.assetBrowser.deleteImg", jSONObject);
            }

            @Override // com.bytedance.ee.bear.document.imageviewer.C5852b.AbstractC5853a
            /* renamed from: b */
            public void mo23452b(String str) {
                String str2;
                CommentPlugin commentPlugin = (CommentPlugin) ImageViewerPlugin.this.findPlugin(CommentPlugin.class);
                if (commentPlugin != null) {
                    if (ImageViewerPlugin.this.getDocumentMetadata() != null) {
                        str2 = ImageViewerPlugin.this.getDocumentMetadata().getUrl();
                    } else {
                        str2 = "";
                    }
                    CommentInputRequest commentInputRequest = new CommentInputRequest();
                    commentInputRequest.is_whole = false;
                    commentInputRequest.doc_token = C5890a.m23707b();
                    commentInputRequest.doc_url = str2;
                    commentInputRequest.type = 0;
                    commentInputRequest.tmpCommentId = str;
                    commentInputRequest.show_voice = true;
                    commentInputRequest.show_insert_image = true;
                    commentInputRequest.show_comment_image = true;
                    commentInputRequest.quote = ImageViewerPlugin.this.getContext().getString(R.string.Doc_Comment_Image_Quote);
                    commentPlugin.showCommentInput(commentInputRequest);
                }
            }

            @Override // com.bytedance.ee.bear.document.imageviewer.C5852b.AbstractC5853a
            /* renamed from: a */
            public void mo23450a(String str, String str2, int i) {
                if (ImageViewerPlugin.this.mOpenCallBack != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ShareHitPoint.f121869d, (Object) str);
                    jSONObject.put("uuid", (Object) str2);
                    jSONObject.put("index", (Object) Integer.valueOf(i));
                    ImageViewerPlugin.this.mOpenCallBack.mo17188a(jSONObject);
                }
            }
        });
        processOrientationChange();
    }

    private void addFragment(AbstractC4958n nVar, ImageDataModel imageDataModel) {
        String str;
        C4957m a = C4957m.m20521a(R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation, R.anim.image_pager_enter_animation, R.anim.image_pager_exit_animation);
        BearUrl bearUrl = getDocumentMetadata().getBearUrl();
        if (getBearUrl() != null) {
            str = getBearUrl().mo25325b();
        } else {
            str = "";
        }
        AbstractC5179a a2 = ((AbstractC5180b) KoinJavaComponent.m268610a(AbstractC5180b.class)).mo20682a(getContext(), nVar.mo19602g(), a, nVar.mo19598d(this), imageDataModel, "ImageViewerPlugin", str, C8275a.m34051b(bearUrl.mo25322a()));
        this.mImageViewer = a2;
        a2.mo20677a(new AbstractC5187b() {
            /* class com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin.C58422 */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
            /* renamed from: a */
            public void mo20754a() {
                ImageViewerPlugin.this.imageViewerViewModel.closeCommentCards();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
            /* renamed from: b */
            public void mo20756b(String str, int i) {
                ImageViewerPlugin.this.imageViewerViewModel.loadError(str, i);
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5187b
            /* renamed from: a */
            public void mo20755a(String str, int i) {
                ImageViewerPlugin.this.imageViewerViewModel.swipe(str, i);
            }
        });
        this.mImageViewer.mo20679a(new AbstractC5190e() {
            /* class com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin.C58433 */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e
            /* renamed from: b */
            public void mo20765b(String str) {
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e
            /* renamed from: c */
            public void mo20766c(String str) {
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5190e
            /* renamed from: a */
            public void mo20764a(String str) {
                if (ImageViewerPlugin.this.mCurrentImageData == null || !"sheet".equals(ImageViewerPlugin.this.mCurrentImageData.getSource())) {
                    ImageViewerPlugin.this.showCommentCard();
                } else {
                    ImageViewerPlugin.this.imageViewerViewModel.commentImage(str, -1);
                }
            }
        });
        this.mImageViewer.mo20678a(new AbstractC5188c() {
            /* class com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin.C58444 */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
            /* renamed from: b */
            public void mo20759b() {
                ImageViewerPlugin.this.resetData();
                ImageViewerPlugin.this.mImageViewer = null;
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
            /* renamed from: a */
            public void mo20757a() {
                ImageViewerPlugin.this.getHost().mo19549a(MultiTaskPlugin.class, $$Lambda$X8rgcVW09KC5Gq0n5oH3m_dAc4c.INSTANCE);
                ImageViewerPlugin.this.getHost().mo19549a(GroupTemplatePreviewPlugin.class, $$Lambda$nQuAKf4AjHiONa2kPSjlI_yTis.INSTANCE);
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5188c
            /* renamed from: a */
            public void mo20758a(String str) {
                ImageViewerPlugin.this.imageViewerViewModel.closeImageViewer(str);
                ImageViewerPlugin.this.resetData();
                ImageViewerPlugin.this.getHost().mo19549a(MultiTaskPlugin.class, $$Lambda$z4mlEql2shIuPu4OK2HHzgLhySE.INSTANCE);
                ImageViewerPlugin.this.getHost().mo19549a(GroupTemplatePreviewPlugin.class, $$Lambda$3PSISxAN_CxEurfMSDK5YSazMbc.INSTANCE);
            }
        });
        this.mImageViewer.mo20676a(new AbstractC5186a() {
            /* class com.bytedance.ee.bear.document.imageviewer.$$Lambda$ImageViewerPlugin$8kOu08R7UT81N9jiZyh9FQcMZew */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p287c.AbstractC5186a
            public final void onConfirmDelete(String str) {
                ImageViewerPlugin.this.lambda$addFragment$5$ImageViewerPlugin(str);
            }
        });
        this.mImageViewer.mo20672a(new AbstractC5181a() {
            /* class com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin.C58455 */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a
            /* renamed from: a */
            public void mo20687a(String str, int i, AbstractC5181a.AbstractC5183b bVar) {
                DiagramPlugin diagramPlugin = (DiagramPlugin) ImageViewerPlugin.this.findPlugin(DiagramPlugin.class);
                if (diagramPlugin != null) {
                    diagramPlugin.requestDiagramSVGData(str, i, bVar);
                }
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5181a
            /* renamed from: a */
            public void mo20686a(String str, int i, AbstractC5181a.AbstractC5182a aVar) {
                ImageViewerPlugin.this.imageViewerViewModel.downloadImage(str, i);
                DiagramPlugin diagramPlugin = (DiagramPlugin) ImageViewerPlugin.this.findPlugin(DiagramPlugin.class);
                if (diagramPlugin != null) {
                    diagramPlugin.registerDiagramBase64DataRequestListener(aVar);
                }
            }
        });
        this.mImageViewer.mo20673a(new AbstractC5184b() {
            /* class com.bytedance.ee.bear.document.imageviewer.ImageViewerPlugin.C58466 */

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: a */
            public void mo20690a() {
                ImageViewerPlugin.this.mAnalytic.mo23464d();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: b */
            public void mo20693b() {
                ImageViewerPlugin.this.mAnalytic.mo23470h();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: c */
            public void mo20695c() {
                ImageViewerPlugin.this.mAnalytic.mo23471i();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: d */
            public void mo20697d() {
                ImageViewerPlugin.this.mAnalytic.mo23469g();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: e */
            public void mo20698e() {
                ImageViewerPlugin.this.mAnalytic.mo23468f();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: f */
            public void mo20699f() {
                ImageViewerPlugin.this.mAnalytic.mo23462c();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: g */
            public void mo20700g() {
                ImageViewerPlugin.this.mAnalytic.mo23466e();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: h */
            public void mo20701h() {
                ImageViewerPlugin.this.mAnalytic.mo23473k();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: i */
            public void mo20702i() {
                ImageViewerPlugin.this.mAnalytic.mo23474l();
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: a */
            public void mo20691a(ImageType imageType) {
                ImageViewerPlugin.this.mAnalytic.mo23458a(imageType);
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: b */
            public void mo20694b(String str) {
                ImageViewerPlugin.this.mAnalytic.mo23465d(str);
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: c */
            public void mo20696c(String str) {
                ImageViewerPlugin.this.mAnalytic.mo23467e(str);
            }

            @Override // com.bytedance.ee.bear.contract.imageviewer.p286b.AbstractC5184b
            /* renamed from: a */
            public void mo20692a(String str) {
                ImageViewerPlugin.this.mAnalytic.mo23463c(str);
            }
        });
    }
}
