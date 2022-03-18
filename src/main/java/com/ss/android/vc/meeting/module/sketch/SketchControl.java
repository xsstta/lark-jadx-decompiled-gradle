package com.ss.android.vc.meeting.module.sketch;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.pb.videoconference.v1.ByteMetadata;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60772n;
import com.ss.android.vc.common.p3083e.C60775q;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.entity.C60941k;
import com.ss.android.vc.entity.ChannelMeta;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.entity.PushGrootCells;
import com.ss.android.vc.entity.ShapeAckData;
import com.ss.android.vc.entity.VcI18nKeyInfo;
import com.ss.android.vc.entity.VcMsgInfo;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.response.C60966b;
import com.ss.android.vc.entity.response.C60975i;
import com.ss.android.vc.entity.response.PushGrootChannelStatusEntity;
import com.ss.android.vc.entity.response.SketchStartEntity;
import com.ss.android.vc.irtc.AbstractC61027f;
import com.ss.android.vc.meeting.bytertc.C61237h;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61373b;
import com.ss.android.vc.meeting.module.sketch.SketchControl;
import com.ss.android.vc.meeting.module.sketch.SketchListener;
import com.ss.android.vc.meeting.module.sketch.SketchRenderModel;
import com.ss.android.vc.meeting.module.sketch.action.SketchMode;
import com.ss.android.vc.meeting.module.sketch.dto.ExtInfo;
import com.ss.android.vc.meeting.module.sketch.dto.GlobalShapeConfig;
import com.ss.android.vc.meeting.module.sketch.dto.RemoveData;
import com.ss.android.vc.meeting.module.sketch.dto.UndoRedoInfo;
import com.ss.android.vc.meeting.module.sketch.dto.comet.CometConfig;
import com.ss.android.vc.meeting.module.sketch.dto.pencil.PencilConfig;
import com.ss.android.vc.meeting.module.sketch.render.canvas.model.CanvasRenderModel;
import com.ss.android.vc.meeting.module.sketch.render.gl.model.GLRenderModel;
import com.ss.android.vc.meeting.p3104c.C61246b;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.C63603f;
import com.ss.android.vc.net.service.VcBizService;
import com.ss.android.vc.service.C63634c;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class SketchControl extends AbsSketchControl implements C61373b.AbstractC61374a {
    private boolean accessibility;
    private boolean canSketchOn;
    private WeakReference<C61246b> floatWindowWrapper;
    public volatile boolean hasFetchAll;
    public volatile boolean hasGrootOpen;
    private boolean hasShowSeeSketchTips;
    public volatile boolean hasSketchStart;
    private boolean isGL = getConfigGL();
    public boolean isInSketch;
    private volatile boolean isNativeInited = false;
    private volatile String mGrootChannelStatusChannelId;
    private volatile VideoChatPush.AbstractC63564d mGrootChannelStatusListener;
    private VideoChatPush.AbstractC63563c mGrootPushListener;
    private boolean mIsSketchOn;
    public volatile SketchRenderModel mRenderModel;
    public SketchListener.OnSketchStartListener mSketchStartListener;
    private SketchListener.OnSketchVisibilityListener mSketchVisibilityListener;
    private WeakReference<C61246b> mSurfaceRef;
    private AbstractC61027f metadataListenerEx = new AbstractC61027f() {
        /* class com.ss.android.vc.meeting.module.sketch.SketchControl.C630851 */

        @Override // com.ss.android.vc.irtc.AbstractC61027f
        public byte[] onReadyToSendMetadata(long j, boolean z) {
            return null;
        }

        public /* synthetic */ void lambda$null$0$SketchControl$1(List list) {
            if (SketchControl.this.transferInVideo.get()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SketchControl.this.mRenderModel.removeStatic(((ShapeAckData) it.next()).getShareId(), false);
                }
            }
        }

        public /* synthetic */ void lambda$onMetadataReceived$1$SketchControl$1(byte[] bArr) {
            try {
                ByteMetadata decode = ByteMetadata.ADAPTER.decode(bArr);
                if (!(decode == null || decode.sketch_data == null)) {
                    int i = C630928.$SwitchMap$com$ss$android$lark$pb$videoconference$v1$InMeetingData$ScreenSharedData$SketchTransferMode[decode.sketch_data.sketch_transfer_mode.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            if (SketchControl.this.transferInVideo.compareAndSet(false, true)) {
                                SketchControl.this.onTransferModeChanged();
                            }
                        }
                    } else if (SketchControl.this.transferInVideo.compareAndSet(true, false)) {
                        SketchControl.this.onTransferModeChanged();
                    }
                    if (SketchControl.this.transferInVideo.get()) {
                        ArrayList arrayList = new ArrayList();
                        for (com.ss.android.lark.pb.videoconference.v1.ShapeAckData shapeAckData : decode.sketch_data.ack_datas) {
                            if (SketchControl.this.getRenderModel().isSelfShape(shapeAckData.shape_id)) {
                                arrayList.add(new ShapeAckData(shapeAckData.shape_id));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C60735ab.m236015d().postDelayed(new Runnable(arrayList) {
                                /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$1$LKj_Ux0sbYxPvVJaeyB3oopNvE */
                                public final /* synthetic */ List f$1;

                                {
                                    this.f$1 = r2;
                                }

                                public final void run() {
                                    SketchControl.C630851.this.lambda$null$0$SketchControl$1(this.f$1);
                                }
                            }, 3000);
                        }
                    }
                }
            } catch (IOException e) {
                C60700b.m235864f("[Sketch] [SketchControl]", "[onMetadataReceived]", "exception: " + e.getMessage());
            }
        }

        @Override // com.ss.android.vc.irtc.AbstractC61027f
        public void onMetadataReceived(byte[] bArr, String str, long j, boolean z) {
            if (z) {
                C60735ab.m236015d().post(new Runnable(bArr) {
                    /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$1$dI9KE5OQibP02pTikO2Y44r24o */
                    public final /* synthetic */ byte[] f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        SketchControl.C630851.this.lambda$onMetadataReceived$1$SketchControl$1(this.f$1);
                    }
                });
            }
        }
    };
    private Runnable sDestroyRunnable = new Runnable() {
        /* class com.ss.android.vc.meeting.module.sketch.SketchControl.RunnableC630862 */

        public void run() {
            SketchControl.this.sketchDestroy();
        }
    };
    private int screenHeight;
    private int screenWidth;
    private final List<ISketchEnableChangeListener> sketchEnableChangeListeners = new CopyOnWriteArrayList();
    public volatile String sketchInstanceId = "";
    private final List<ISketchLoadListener> sketchLoadListeners = new CopyOnWriteArrayList();
    private SketchView sketchView = null;
    private final List<ISketchViewListener> sketchViewListeners = new CopyOnWriteArrayList();
    private volatile boolean sketchViewNeedCreate = false;
    private volatile List<String> timeOutShapeList = new ArrayList();
    private final Object timeOutShapeMutex = new Object();
    public AtomicBoolean transferInVideo = new AtomicBoolean(false);

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: b */
    public /* synthetic */ void mo212445b(boolean z) {
        C61373b.AbstractC61374a.CC.$default$b(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bC_() {
        C61373b.AbstractC61374a.CC.$default$bC_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bF_() {
        C61373b.AbstractC61374a.CC.$default$bF_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void bX_() {
        C61373b.AbstractC61374a.CC.$default$bX_(this);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: c */
    public /* synthetic */ void mo212449c(boolean z) {
        C61373b.AbstractC61374a.CC.$default$c(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void c_(String str, String str2) {
        C61373b.AbstractC61374a.CC.$default$c_(this, str, str2);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    /* renamed from: d */
    public /* synthetic */ void mo212451d(boolean z) {
        C61373b.AbstractC61374a.CC.$default$d(this, z);
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public /* synthetic */ void i_(boolean z) {
        C61373b.AbstractC61374a.CC.$default$i_(this, z);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void showAccessibilityDialog(VideoChat videoChat) {
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public boolean canSketchOn() {
        return this.canSketchOn;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public String getSketchInstanceId() {
        return this.sketchInstanceId;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public SketchView getSketchView() {
        return this.sketchView;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public boolean isAccessibility() {
        return this.accessibility;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public boolean isGL() {
        return this.isGL;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public boolean isInSketch() {
        return this.isInSketch;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public boolean isSketchOn() {
        return this.mIsSketchOn;
    }

    private boolean getConfigGL() {
        return C63634c.m249496b("byteview.meeting.android.vc_sketch_gl");
    }

    public static boolean isMakeSketchFG() {
        return C63634c.m249496b("byteview.callmeeting.android.make_annotation");
    }

    public static boolean isSeeSketchFG() {
        return C63634c.m249496b("byteview.callmeeting.android.see_annotation");
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public boolean getTransferInVideo() {
        return this.transferInVideo.get();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void switchVisible() {
        SketchListener.OnSketchVisibilityListener onSketchVisibilityListener = this.mSketchVisibilityListener;
        if (onSketchVisibilityListener != null) {
            onSketchVisibilityListener.switchVisible();
        }
    }

    private void createSketchViewIfNot() {
        C60735ab.m236001a(new Runnable() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$wzOuziUCYjBD6wu7I134FI3PDdk */

            public final void run() {
                SketchControl.this.lambda$createSketchViewIfNot$3$SketchControl();
            }
        });
    }

    private C61246b getGestureViewWrapper() {
        WeakReference<C61246b> weakReference = this.mSurfaceRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private SketchView getSketchTextureView() {
        C61246b gestureViewWrapper = getGestureViewWrapper();
        if (gestureViewWrapper != null) {
            return gestureViewWrapper.getSketchView();
        }
        return null;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void checkAndCreateSketchView() {
        if (this.sketchViewNeedCreate && this.sketchView == null) {
            createSketchViewIfNot();
        }
    }

    public /* synthetic */ void lambda$showSketch$0$SketchControl() {
        hideView();
        setSketchOn(false);
        onSketchClosed();
        reSizeGestureWrapper();
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void restoreSketch() {
        if (isMakeSketchFG() && isSketchOn()) {
            showSketch();
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.sketch.SketchControl$8 */
    static /* synthetic */ class C630928 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$android$lark$pb$videoconference$v1$InMeetingData$ScreenSharedData$SketchTransferMode;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$SketchTransferMode[] r0 = com.ss.android.lark.pb.videoconference.v1.InMeetingData.ScreenSharedData.SketchTransferMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.sketch.SketchControl.C630928.$SwitchMap$com$ss$android$lark$pb$videoconference$v1$InMeetingData$ScreenSharedData$SketchTransferMode = r0
                com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$SketchTransferMode r1 = com.ss.android.lark.pb.videoconference.v1.InMeetingData.ScreenSharedData.SketchTransferMode.BY_DATA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.sketch.SketchControl.C630928.$SwitchMap$com$ss$android$lark$pb$videoconference$v1$InMeetingData$ScreenSharedData$SketchTransferMode     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.lark.pb.videoconference.v1.InMeetingData$ScreenSharedData$SketchTransferMode r1 = com.ss.android.lark.pb.videoconference.v1.InMeetingData.ScreenSharedData.SketchTransferMode.BY_VIDEO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.sketch.SketchControl.C630928.<clinit>():void");
        }
    }

    private void resetSketch() {
        C60700b.m235851b("[Sketch] [SketchControl]", "[resetSketch]", "reset");
        getRenderModel().reset();
        this.hasSketchStart = false;
        this.hasFetchAll = false;
        this.hasGrootOpen = false;
    }

    private void unregisterListeners() {
        getMeeting().mo212091I().mo212498e().mo212444b(this);
        if (this.mGrootPushListener != null) {
            VideoChatPush.m249004a().mo219735b(this.mGrootPushListener);
            this.mGrootPushListener = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void closeSketchPenel() {
        for (ISketchViewListener iSketchViewListener : this.sketchViewListeners) {
            if (iSketchViewListener != null) {
                iSketchViewListener.closeSketchPenel();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void hideView() {
        for (ISketchViewListener iSketchViewListener : this.sketchViewListeners) {
            if (iSketchViewListener != null) {
                iSketchViewListener.hideView();
            }
        }
    }

    public /* synthetic */ void lambda$createSketchViewIfNot$3$SketchControl() {
        if (this.sketchView == null) {
            this.sketchViewNeedCreate = true;
            C61246b gestureViewWrapper = getGestureViewWrapper();
            if (gestureViewWrapper != null) {
                C60700b.m235851b("[Sketch] [SketchControl]", "[createSketchViewIfNot1]", "will create");
                gestureViewWrapper.mo211804a();
                gestureViewWrapper.setOnVisible(true);
                gestureViewWrapper.mo211810c();
            }
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchClosed() {
        for (ISketchLoadListener iSketchLoadListener : this.sketchLoadListeners) {
            iSketchLoadListener.onSketchClosed();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadBegin() {
        for (ISketchLoadListener iSketchLoadListener : this.sketchLoadListeners) {
            iSketchLoadListener.onSketchLoadBegin();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadCanceled() {
        for (ISketchLoadListener iSketchLoadListener : this.sketchLoadListeners) {
            iSketchLoadListener.onSketchLoadCanceled();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadFailed() {
        for (ISketchLoadListener iSketchLoadListener : this.sketchLoadListeners) {
            iSketchLoadListener.onSketchLoadFailed();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchLoadListener
    public void onSketchLoadFinished() {
        for (ISketchLoadListener iSketchLoadListener : this.sketchLoadListeners) {
            iSketchLoadListener.onSketchLoadFinished();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void reSizeGestureWrapper() {
        WeakReference<C61246b> weakReference = this.mSurfaceRef;
        if (weakReference != null && weakReference.get() != null) {
            this.mSurfaceRef.get().mo211816g();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void sendAccesbilityRequest() {
        VcBizService.sendSketchAccessibilityRequest(getMeeting().mo212055d(), this.curShareScreenId, new AbstractC63598b<C60966b>() {
            /* class com.ss.android.vc.meeting.module.sketch.SketchControl.C630917 */

            public void onSuccess(C60966b bVar) {
                C60700b.m235851b("[Sketch] [SketchControl]", "[sendSketchAccessibilityRequest]", "succeed");
            }

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
                C60700b.m235864f("[Sketch] [SketchControl]", "[sendSketchAccessibilityRequest2]", "error: " + eVar);
            }
        });
    }

    private void registerListeners() {
        unregisterListeners();
        this.mMeeting.mo212091I().mo212498e().mo212443a(this);
        if (this.mGrootPushListener == null) {
            this.mGrootPushListener = new VideoChatPush.AbstractC63563c() {
                /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$kv5rw0HhVZP7SJXs6iQ5aRzMABM */

                @Override // com.ss.android.vc.net.push.VideoChatPush.AbstractC63563c
                public final void onPushGrootCells(PushGrootCells pushGrootCells) {
                    SketchControl.this.lambda$registerListeners$1$SketchControl(pushGrootCells);
                }
            };
            VideoChatPush.m249004a().mo219712a(this.mGrootPushListener);
        }
    }

    private void sketchStart() {
        if (!this.hasSketchStart) {
            addGrootChannelStatusListener(this.curShareScreenId);
            this.hasSketchStart = true;
            VcBizService.sendSketchStartRequest(this.mMeeting.mo212055d(), this.curShareScreenId, new AbstractC63598b<SketchStartEntity>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchControl.C630884 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("[Sketch] [SketchControl]", "[sketchStart]", "error = " + eVar);
                    SketchControl.this.hasSketchStart = false;
                    if (SketchControl.this.mSketchStartListener != null) {
                        SketchControl.this.mSketchStartListener.onStartFailed(R.string.View_VM_FailedToStartAnnotating);
                    }
                }

                public void onSuccess(SketchStartEntity sketchStartEntity) {
                    String str;
                    if (!sketchStartEntity.can_other_sketch) {
                        if (MeetingUtil.m238364a(SketchControl.this.mMeeting.mo212056e())) {
                            String a = C60772n.m236113a(SketchControl.this.mMeeting.mo212092J().mo212546h());
                            HashMap hashMap = new HashMap();
                            hashMap.put("name", a);
                            str = UIHelper.mustacheFormat((int) R.string.View_V_CantSeeAnnotationsBraces, hashMap);
                        } else {
                            str = UIHelper.mustacheFormat((int) R.string.View_M_CantSeeAnnotations);
                        }
                        SketchControl.this.sendTips(str);
                    }
                    if (!SketchControl.this.hasFetchAll) {
                        SketchControl.this.fetchAllData();
                    } else if (SketchControl.this.mSketchStartListener != null) {
                        SketchControl.this.mSketchStartListener.onStartSuccess();
                    }
                }
            });
        } else if (this.hasFetchAll) {
            SketchListener.OnSketchStartListener onSketchStartListener = this.mSketchStartListener;
            if (onSketchStartListener != null) {
                onSketchStartListener.onStartSuccess();
            }
        } else {
            fetchAllData();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void eraseTimeOutShapes() {
        if (this.transferInVideo.get()) {
            synchronized (this.timeOutShapeMutex) {
                for (String str : this.timeOutShapeList) {
                    this.mRenderModel.removeStatic(str, false);
                }
                this.timeOutShapeList.clear();
            }
        }
    }

    public void fetchAllData() {
        createSketchViewIfNot();
        if (!this.hasFetchAll) {
            if (!this.isNativeInited) {
                C60735ab.m236017e().post(new Runnable() {
                    /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$clhiH6kCPv1fbpnfyL905a19ug */

                    public final void run() {
                        SketchControl.this.lambda$fetchAllData$2$SketchControl();
                    }
                });
            }
            this.hasFetchAll = true;
            final String str = this.curShareScreenId;
            C60700b.m235851b("[Sketch] [SketchControl]", "[fetchAllData]", "shareScreenId = " + str);
            SketchRustImpl.fetchAllSketchData(this.curShareScreenId, new AbstractC63598b<C60975i>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchControl.C630895 */

                public void onSuccess(C60975i iVar) {
                    C60735ab.m236017e().post(new Runnable(str, iVar) {
                        /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$5$zugtc1OxXNDk0sDuYmnzGKvi5A */
                        public final /* synthetic */ String f$1;
                        public final /* synthetic */ C60975i f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            SketchControl.C630895.this.lambda$onSuccess$0$SketchControl$5(this.f$1, this.f$2);
                        }
                    });
                }

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    C60700b.m235864f("[Sketch] [SketchControl]", "[sendSketchStartRequest2]", "error " + eVar.toString());
                    SketchControl.this.hasFetchAll = false;
                    if (SketchControl.this.mSketchStartListener != null) {
                        SketchControl.this.mSketchStartListener.onStartFailed(R.string.View_VM_UnableToShowAnnotations);
                    }
                }

                public /* synthetic */ void lambda$onSuccess$0$SketchControl$5(String str, C60975i iVar) {
                    if (str.equals(SketchControl.this.curShareScreenId)) {
                        if (iVar.f152691a != null && !iVar.f152691a.isEmpty()) {
                            SketchControl.this.getRenderModel().getRemoteReceiver().receiveFetchAllData(iVar.f152691a, SketchControl.this.transferInVideo.get());
                        }
                        if (iVar.f152693c != null) {
                            Sketch.setCurrentStep(SketchControl.this.sketchInstanceId, iVar.f152693c.intValue());
                        }
                        SketchControl.this.grootOpenChannel(iVar.f152692b.intValue());
                        return;
                    }
                    C60700b.m235864f("[Sketch] [SketchControl]", "[fetchAllData2]", "equestShareScreenId = " + str + ", curShareScreenId = " + SketchControl.this.curShareScreenId);
                }
            });
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public SketchRenderModel getRenderModel() {
        if (this.mRenderModel == null) {
            synchronized (this) {
                if (this.mRenderModel == null) {
                    if (isGL()) {
                        this.mRenderModel = new GLRenderModel(this);
                    } else {
                        this.mRenderModel = new CanvasRenderModel(this);
                    }
                }
            }
        }
        return this.mRenderModel;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void onTransferModeChanged() {
        if (this.transferInVideo.get()) {
            getRenderModel().reset(false, false);
            return;
        }
        getRenderModel().reset(false, false);
        getRenderModel().getRemoteReceiver().applyAllDrawableData(false);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void showSketch() {
        for (ISketchViewListener iSketchViewListener : this.sketchViewListeners) {
            if (iSketchViewListener != null) {
                iSketchViewListener.showSketch();
            }
        }
        setSketchOn(true);
        setSketchTurnOffListener(new SketchListener.ITurnOffListener() {
            /* class com.ss.android.vc.meeting.module.sketch.$$Lambda$SketchControl$qefDpQPXbpUPzE1enJp4cY_60I0 */

            @Override // com.ss.android.vc.meeting.module.sketch.SketchListener.ITurnOffListener
            public final void onTurnSketchOff() {
                SketchControl.this.lambda$showSketch$0$SketchControl();
            }
        });
    }

    public void startRender() {
        C61246b bVar;
        SketchView sketchTextureView = getSketchTextureView();
        if (sketchTextureView != null) {
            sketchTextureView.startRender();
        }
        C61246b gestureViewWrapper = getGestureViewWrapper();
        if (gestureViewWrapper != null) {
            gestureViewWrapper.mo211810c();
        }
        WeakReference<C61246b> weakReference = this.floatWindowWrapper;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            if (bVar.getSketchView() != null) {
                bVar.getSketchView().startRender();
            }
            bVar.mo211810c();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void undo() {
        RemoveData removeData = Sketch.undo(this.sketchInstanceId).removeData;
        if (removeData != null) {
            if (!this.transferInVideo.get()) {
                for (String str : removeData.ids) {
                    this.mRenderModel.removeStatic(str, true);
                }
            }
            SketchRustImpl.sendUndo(this.mMeeting.mo212055d(), this.mMeeting.ag().curShareScreenId, removeData);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initSketch */
    public void lambda$fetchAllData$2$SketchControl() {
        if (!this.isNativeInited) {
            C61237h.m238223a().mo210509a(this.metadataListenerEx);
            SketchConfig.getSetting();
            C60700b.m235851b("[Sketch] [SketchControl]", "[initSketch]", "get settings done");
            ExtInfo extInfo = new ExtInfo(VideoChatModuleDependency.m236629b(), VideoChatModuleDependency.m236630c(), 1, 0, new UndoRedoInfo(false, false), true);
            GlobalShapeConfig globalShapeConfig = new GlobalShapeConfig(new PencilConfig(SketchConfig.pencil_k, SketchConfig.pencil_min_distance, SketchConfig.pencil_error_gap), new CometConfig(SketchConfig.comet_weak_speed, SketchConfig.comet_min_distance));
            this.sketchInstanceId = Sketch.sketchCreateInstance();
            if (!TextUtils.isEmpty(this.sketchInstanceId)) {
                Sketch.sketchSwitchInstance(this.sketchInstanceId);
                Sketch.sketchInit(this.sketchInstanceId, extInfo, globalShapeConfig);
            }
            C60700b.m235851b("[Sketch] [SketchControl]", "[initSketch]", "sketch native init finish, instance id: " + this.sketchInstanceId);
            this.isNativeInited = true;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void openSketch() {
        C60700b.m235851b("[Sketch] [SketchControl]", "[openSketch]", "openSketch");
        if (!this.accessibility) {
            Iterator<ISketchViewListener> it = this.sketchViewListeners.iterator();
            while (true) {
                if (it.hasNext()) {
                    ISketchViewListener next = it.next();
                    if (next != null) {
                        next.showAccessibilityDialog(getMeeting().mo212056e());
                        break;
                    }
                } else {
                    break;
                }
            }
            onSketchLoadCanceled();
            return;
        }
        onSketchLoadBegin();
        showSketch();
        if (getMeeting().f153550c == VideoChat.Type.CALL) {
            C63763l.m250314h(getMeeting().mo212056e());
        } else if (getMeeting().f153550c == VideoChat.Type.MEET) {
            C63742at.m250113t(getMeeting().mo212056e());
        }
    }

    public void sketchDestroy() {
        C61246b bVar;
        C60700b.m235851b("[Sketch] [SketchControl]", "[sketchDestroy]", "sketchDestroy");
        C61237h.m238223a().mo210509a((AbstractC61027f) null);
        C61246b gestureViewWrapper = getGestureViewWrapper();
        if (gestureViewWrapper != null) {
            gestureViewWrapper.mo211820i();
        }
        WeakReference<C61246b> weakReference = this.floatWindowWrapper;
        if (!(weakReference == null || (bVar = weakReference.get()) == null)) {
            bVar.mo211820i();
        }
        this.hasSketchStart = false;
        this.hasFetchAll = false;
        this.hasGrootOpen = false;
        this.hasShowSeeSketchTips = false;
        this.accessibility = false;
        this.mIsSketchOn = false;
        this.canSketchOn = false;
        this.isInSketch = false;
        removeGrootChannelStatusListener(this.curShareScreenId);
        if (this.mRenderModel != null) {
            this.mRenderModel.reset();
        }
        SketchRustImpl.grootCloseChannel(this.curShareScreenId);
        if (this.isNativeInited) {
            Sketch.sketchDestroy(this.sketchInstanceId);
            this.sketchInstanceId = "";
            this.isNativeInited = false;
        }
        this.curShareScreenId = null;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setOnSketchStartFailListener(SketchListener.OnSketchStartListener onSketchStartListener) {
        this.mSketchStartListener = onSketchStartListener;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setOnSketchVisiblityListener(SketchListener.OnSketchVisibilityListener onSketchVisibilityListener) {
        this.mSketchVisibilityListener = onSketchVisibilityListener;
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void removeSketchLoadListener(ISketchLoadListener iSketchLoadListener) {
        this.sketchLoadListeners.remove(iSketchLoadListener);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void removeSketchViewListener(ISketchViewListener iSketchViewListener) {
        this.sketchViewListeners.remove(iSketchViewListener);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setCurrentAction(SketchMode sketchMode) {
        this.mRenderModel.setCurrentAction(sketchMode);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setPaintColor(int i) {
        this.mRenderModel.setCurrentColor(i);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setSketchView(SketchView sketchView2) {
        this.sketchView = sketchView2;
        if (sketchView2 == null) {
            this.sketchViewNeedCreate = false;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setTransferInVideo(boolean z) {
        this.transferInVideo.set(z);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setVisible(boolean z) {
        SketchListener.OnSketchVisibilityListener onSketchVisibilityListener = this.mSketchVisibilityListener;
        if (onSketchVisibilityListener != null) {
            onSketchVisibilityListener.setVisible(z);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void unRegisterSketchEnableChangeListener(ISketchEnableChangeListener iSketchEnableChangeListener) {
        if (iSketchEnableChangeListener != null) {
            this.sketchEnableChangeListeners.remove(iSketchEnableChangeListener);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void addSketchLoadListener(ISketchLoadListener iSketchLoadListener) {
        if (iSketchLoadListener != null && !this.sketchLoadListeners.contains(iSketchLoadListener)) {
            this.sketchLoadListeners.add(iSketchLoadListener);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void addSketchViewListener(ISketchViewListener iSketchViewListener) {
        if (!this.sketchViewListeners.contains(iSketchViewListener)) {
            this.sketchViewListeners.add(iSketchViewListener);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void registerSketchEnableChangeListener(ISketchEnableChangeListener iSketchEnableChangeListener) {
        if (iSketchEnableChangeListener != null && !this.sketchEnableChangeListeners.contains(iSketchEnableChangeListener)) {
            this.sketchEnableChangeListeners.add(iSketchEnableChangeListener);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setGestureSurfaceViewWrapper(C61246b bVar) {
        if (bVar == null) {
            this.mSurfaceRef = null;
        } else {
            this.mSurfaceRef = new WeakReference<>(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setSelfShapeCountListener(SketchRenderModel.OnSelfShapeCountListener onSelfShapeCountListener) {
        if (this.mRenderModel != null) {
            this.mRenderModel.setSelfShapeCountListener(onSelfShapeCountListener);
        }
    }

    private void removeGrootChannelStatusListener(String str) {
        if (this.mGrootChannelStatusListener != null && !TextUtils.isEmpty(str)) {
            VideoChatPush.m249004a().mo219753b(str, this.mGrootChannelStatusListener);
            this.mGrootChannelStatusListener = null;
            this.mGrootChannelStatusChannelId = null;
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void addTimeOutShapes(String str) {
        synchronized (this.timeOutShapeMutex) {
            if (!this.timeOutShapeList.contains(str)) {
                this.timeOutShapeList.add(str);
            }
        }
    }

    public void grootOpenChannel(int i) {
        if (!this.hasGrootOpen) {
            this.hasGrootOpen = true;
            SketchRustImpl.grootOpenChannel(this.curShareScreenId, i, new AbstractC63598b<String>() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchControl.C630906 */

                @Override // com.ss.android.vc.net.request.AbstractC63598b
                public void onError(C63602e eVar) {
                    SketchControl.this.hasGrootOpen = false;
                    if (SketchControl.this.mSketchStartListener != null) {
                        SketchControl.this.mSketchStartListener.onStartFailed(R.string.View_VM_UnableToShowAnnotations);
                    }
                }

                public void onSuccess(String str) {
                    if (SketchControl.this.hasSketchStart && SketchControl.this.mSketchStartListener != null) {
                        SketchControl.this.mSketchStartListener.onStartSuccess();
                    }
                    SketchControl.this.isInSketch = true;
                    SketchControl.this.startRender();
                    C60700b.m235851b("[Sketch] [SketchControl]", "[grootOpenChannel]", "isInSketch = true, start render");
                }
            });
        }
    }

    public void notifyCanSketchChange(boolean z) {
        for (ISketchEnableChangeListener iSketchEnableChangeListener : this.sketchEnableChangeListeners) {
            if (iSketchEnableChangeListener != null) {
                iSketchEnableChangeListener.onCanSketchChange(z);
            }
        }
    }

    @Override // com.ss.android.vc.meeting.model.C61373b.AbstractC61374a
    public void onOnlyPresenterCanAnnotateChanged(boolean z) {
        if (z && this.isInSketch) {
            closeSketchPenel();
        }
        this.mMeeting.ay().mo216073d(!z);
    }

    public void sendTips(String str) {
        VcMsgInfo vcMsgInfo = new VcMsgInfo();
        vcMsgInfo.message = str;
        VcI18nKeyInfo vcI18nKeyInfo = new VcI18nKeyInfo();
        vcI18nKeyInfo.type = VcI18nKeyInfo.Type.NORMAL;
        vcMsgInfo.msg_i18n_key = vcI18nKeyInfo;
        C63603f.m249424a(vcMsgInfo);
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setFloatWindowWrapper(C61246b bVar) {
        C60700b.m235851b("[Sketch] [SketchControl]", "[setFloatWindowWrapper]", "setFloatWindowWrapper");
        if (bVar == null) {
            this.floatWindowWrapper = null;
        } else {
            this.floatWindowWrapper = new WeakReference<>(bVar);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void setSketchOn(boolean z) {
        C60700b.m235851b("[Sketch] [SketchControl]", "[setSketchOn]", "sketchOn = " + z);
        this.mIsSketchOn = z;
        if (z) {
            sketchStart();
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.ISketchViewListener
    public void setSketchTurnOffListener(SketchListener.ITurnOffListener iTurnOffListener) {
        for (ISketchViewListener iSketchViewListener : this.sketchViewListeners) {
            if (iSketchViewListener != null) {
                iSketchViewListener.setSketchTurnOffListener(iTurnOffListener);
            }
        }
    }

    private void addGrootChannelStatusListener(String str) {
        if (!TextUtils.isEmpty(this.mGrootChannelStatusChannelId) && !TextUtils.isEmpty(str) && !this.mGrootChannelStatusChannelId.equals(str) && this.mGrootChannelStatusListener != null) {
            removeGrootChannelStatusListener(this.mGrootChannelStatusChannelId);
        }
        if (this.mGrootChannelStatusListener == null && !TextUtils.isEmpty(str)) {
            this.mGrootChannelStatusListener = new VideoChatPush.AbstractC63564d() {
                /* class com.ss.android.vc.meeting.module.sketch.SketchControl.C630873 */

                public void onPushGrootChannelStatus(PushGrootChannelStatusEntity pushGrootChannelStatusEntity) {
                }
            };
            this.mGrootChannelStatusChannelId = str;
            VideoChatPush.m249004a().mo219730a(str, this.mGrootChannelStatusListener);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void enableOnlyPresenterCanAnnotate(boolean z) {
        if (C60775q.m236138a()) {
            C60700b.m235851b("[Sketch] [SketchControl]", "[enableOnlyPresenterCanAnnotate]", "enable = " + z);
        }
        onOnlyPresenterCanAnnotateChanged(z);
    }

    public SketchControl(C61303k kVar) {
        super(kVar);
        registerListeners();
    }

    public /* synthetic */ void lambda$registerListeners$1$SketchControl(PushGrootCells pushGrootCells) {
        C60941k kVar;
        if (!isSeeSketchFG()) {
            C60700b.m235864f("[Sketch] [SketchControl]", "[onPushGrootCells]", "FeatureGating(SEE_ANNOTATION) Closed!");
        } else if (pushGrootCells != null && pushGrootCells.channel_meta.grootChannel == ChannelMeta.GrootChannel.SKETCH) {
            if (!pushGrootCells.channel_meta.channelId.equals(this.curShareScreenId)) {
                C60700b.m235864f("[Sketch] [SketchControl]", "[onPushGrootCells2]", "channelId Illegal, curShareScreenId = " + this.curShareScreenId);
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (!CollectionUtils.isEmpty(pushGrootCells.cells)) {
                for (GrootCell grootCell : pushGrootCells.cells) {
                    if (grootCell.action == GrootCell.Action.SERVER_SET && (kVar = grootCell.sketchGrootCellPayload) != null) {
                        arrayList.addAll(kVar.f152504a);
                    }
                }
            } else {
                C60700b.m235864f("[Sketch] [SketchControl]", "[onPushGrootCells3]", "Empty GrootCells");
            }
            getRenderModel().operate(arrayList);
        }
    }

    @Override // com.ss.android.vc.meeting.module.sketch.AbsSketchControl
    public void onPushScreenShareData(boolean z, InMeetingData.ScreenSharedData screenSharedData) {
        if (z) {
            if (screenSharedData == null) {
                C60700b.m235864f("[Sketch] [SketchControl]", "[onPushScreenShareData]", "screen share data is null");
            } else if (TextUtils.isEmpty(this.curShareScreenId)) {
                C60700b.m235851b("[Sketch] [SketchControl]", "[onPushScreenShareData2]", "Start Screen Sharing, canSketch = " + screenSharedData.isCanSketch() + ", isSketch = " + screenSharedData.isSketch() + ", accessibility = " + screenSharedData.isAccessibility() + ", screenId = " + screenSharedData.getShareScreenId() + ", width = " + screenSharedData.getWidth() + ", height = " + screenSharedData.getHeight());
                reSizeGestureWrapper();
                resetSketch();
                boolean z2 = this.canSketchOn;
                boolean isCanSketch = screenSharedData.isCanSketch();
                this.canSketchOn = isCanSketch;
                if (isCanSketch != z2) {
                    notifyCanSketchChange(isCanSketch);
                }
                if (this.canSketchOn) {
                    this.curShareScreenId = screenSharedData.getShareScreenId();
                    if (!(screenSharedData.getWidth() == 0 || screenSharedData.getHeight() == 0)) {
                        getRenderModel().resetSketchRange(screenSharedData.getWidth(), screenSharedData.getHeight());
                    }
                }
                this.screenWidth = screenSharedData.getWidth();
                this.screenHeight = screenSharedData.getHeight();
            } else {
                C60700b.m235851b("[Sketch] [SketchControl]", "[onPushScreenShareData3]", "Continue Screen Sharing, canSketch = " + screenSharedData.isCanSketch() + ", isSketch = " + screenSharedData.isSketch() + ", accessibility = " + screenSharedData.isAccessibility() + ", width = " + screenSharedData.getWidth() + ", height = " + screenSharedData.getHeight() + ", id = " + screenSharedData.getShareScreenId());
                if (!this.curShareScreenId.equals(screenSharedData.getShareScreenId())) {
                    reSizeGestureWrapper();
                    resetSketch();
                } else if (!(screenSharedData.getWidth() == this.screenWidth && screenSharedData.getHeight() == this.screenHeight)) {
                    reSizeGestureWrapper();
                }
                boolean z3 = this.canSketchOn;
                boolean isCanSketch2 = screenSharedData.isCanSketch();
                this.canSketchOn = isCanSketch2;
                if (isCanSketch2 != z3) {
                    notifyCanSketchChange(isCanSketch2);
                }
                if (this.canSketchOn) {
                    this.curShareScreenId = screenSharedData.getShareScreenId();
                    if (!(screenSharedData.getWidth() == 0 || screenSharedData.getHeight() == 0)) {
                        getRenderModel().resetSketchRange(screenSharedData.getWidth(), screenSharedData.getHeight());
                    }
                }
                this.screenWidth = screenSharedData.getWidth();
                this.screenHeight = screenSharedData.getHeight();
            }
            this.accessibility = screenSharedData.isAccessibility();
            if (screenSharedData != null && screenSharedData.isSketch()) {
                if (!isSeeSketchFG() && !this.hasShowSeeSketchTips) {
                    sendTips(UIHelper.mustacheFormat((int) R.string.View_VM_UnableToShowAnnotations));
                    this.hasShowSeeSketchTips = true;
                }
                addGrootChannelStatusListener(this.curShareScreenId);
                fetchAllData();
                return;
            }
            return;
        }
        C60700b.m235851b("[Sketch] [SketchControl]", "[onPushScreenShareData4]", "Stop Screen Sharing");
        if (this.canSketchOn) {
            C60735ab.m236017e().post(this.sDestroyRunnable);
        }
    }

    @Override // com.ss.android.vc.meeting.framework.meeting.AbstractC61302j, com.ss.android.vc.meeting.module.base.AbstractC61420b
    public void onTransform(int i, int i2, int i3) {
        if (i2 == 5) {
            C60735ab.m236017e().post(this.sDestroyRunnable);
            unregisterListeners();
        }
    }
}
