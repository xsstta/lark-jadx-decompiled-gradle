package com.ss.android.photoeditor.ve;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.photoeditor.base.C59641k;
import com.ss.android.photoeditor.text.TextStickerEditText;
import com.ss.android.photoeditor.ve.AbstractC59806a;
import com.ss.android.photoeditor.ve.base.VEBaseChooserView;
import com.ss.android.photoeditor.ve.base.VEBaseController;
import com.ss.android.photoeditor.ve.controller.IImageEditController;
import com.ss.android.photoeditor.ve.controller.NormalController;
import com.ss.android.photoeditor.ve.crop.VECropController;
import com.ss.android.photoeditor.ve.crop.view.VECropChooserView;
import com.ss.android.photoeditor.ve.hitpoint.ImageEditorHitPoint;
import com.ss.android.photoeditor.ve.p3018e.C59905h;
import com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiChooserView;
import com.ss.android.photoeditor.ve.paint.graffiti.VEGraffitiController;
import com.ss.android.photoeditor.ve.paint.mosaic.RectView;
import com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicChooserView;
import com.ss.android.photoeditor.ve.paint.mosaic.VEMosaicController;
import com.ss.android.photoeditor.ve.service.VEImageService;
import com.ss.android.photoeditor.ve.textsticker.DeleteTextStickerView;
import com.ss.android.photoeditor.ve.textsticker.TextBorderView;
import com.ss.android.photoeditor.ve.textsticker.TextStickerItem;
import com.ss.android.photoeditor.ve.textsticker.VETextChooserView;
import com.ss.android.photoeditor.ve.textsticker.VETextController;
import com.ss.android.photoeditor.ve.utils.AbsWeakListener;
import com.ss.android.photoeditor.ve.utils.VEStorageUtils;
import com.ss.android.photoeditor.ve.view.ImageEditToolView;
import com.ss.android.photoeditor.ve.view.VESurfaceView;
import com.ss.android.vesdk.C63937ah;
import com.ss.android.vesdk.VEImage;
import com.ss.android.vesdk.VESurfaceCallback;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 i2\u00020\u00012\u00020\u0002:\u0003hijB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010?\u001a\u00020@2\u0006\u0010%\u001a\u00020\u000bH\u0002J\b\u0010A\u001a\u00020@H\u0016J\b\u0010B\u001a\u00020@H\u0002J\b\u0010C\u001a\u00020@H\u0002J\b\u0010D\u001a\u00020@H\u0002J\b\u0010E\u001a\u00020@H\u0002J\b\u0010F\u001a\u00020@H\u0002J\b\u0010G\u001a\u00020@H\u0002J\b\u0010H\u001a\u00020@H\u0002J\b\u0010I\u001a\u00020@H\u0002J\b\u0010J\u001a\u00020@H\u0002J\b\u0010K\u001a\u00020@H\u0002J\b\u0010L\u001a\u00020@H\u0002J\b\u0010M\u001a\u00020@H\u0002J\b\u0010N\u001a\u00020@H\u0002J\b\u0010O\u001a\u00020@H\u0002J2\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020(2\b\u0010R\u001a\u0004\u0018\u00010\u00142\u0006\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000f2\u0006\u0010U\u001a\u00020\u0014H\u0002J\b\u0010V\u001a\u00020@H\u0002J\u0010\u0010W\u001a\u00020@2\b\b\u0002\u0010X\u001a\u00020(J\u0018\u0010Y\u001a\u00020@2\u0006\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000fH\u0016J\u0012\u0010Z\u001a\u00020@2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020@H\u0016J\b\u0010^\u001a\u00020@H\u0002J*\u0010_\u001a\u00020@2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000fH\u0002J\b\u0010`\u001a\u00020@H\u0002J\b\u0010a\u001a\u00020@H\u0002J\b\u0010b\u001a\u00020@H\u0002J\b\u0010c\u001a\u00020@H\u0002J\b\u0010d\u001a\u00020@H\u0002J\u0012\u0010e\u001a\u00020\u00012\b\u0010f\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010g\u001a\u00020@H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u000e¢\u0006\u0002\n\u0000R\u0010\u00107\u001a\u0004\u0018\u000108X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f@BX\u000e¢\u0006\b\n\u0000\"\u0004\b;\u0010<R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lcom/ss/android/photoeditor/ve/VEPhotoEditor;", "Lcom/ss/android/photoeditor/ve/IVEPhotoEditor;", "Lcom/ss/android/vesdk/VESurfaceCallback$SurfaceListener;", "context", "Landroid/content/Context;", "builder", "Lcom/ss/android/photoeditor/ve/VEPhotoEditor$Builder;", "(Landroid/content/Context;Lcom/ss/android/photoeditor/ve/VEPhotoEditor$Builder;)V", "closeEditView", "Landroid/widget/ImageView;", "deleteCoverView", "Landroid/view/View;", "deleteTextStickerView", "Lcom/ss/android/photoeditor/ve/textsticker/DeleteTextStickerView;", "editState", "", "editToolView", "Lcom/ss/android/photoeditor/ve/view/ImageEditToolView;", "imageHeight", "imagePath", "", "imageWidth", "layoutId", "log", "Lcom/ss/android/photoeditor/base/PELog$IPELog;", "mosaicRectView", "Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;", "getMosaicRectView", "()Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;", "setMosaicRectView", "(Lcom/ss/android/photoeditor/ve/paint/mosaic/RectView;)V", "normalController", "Lcom/ss/android/photoeditor/ve/controller/NormalController;", "onEndEditCallback", "Lcom/ss/android/photoeditor/ve/IVEPhotoEditor$IOnEndEditCallback;", "photoEditorContainer", "Landroid/widget/FrameLayout;", "rootView", "rotation", "sdkIsInit", "", "surfaceView", "Lcom/ss/android/photoeditor/ve/view/VESurfaceView;", "textBorderView", "Lcom/ss/android/photoeditor/ve/textsticker/TextBorderView;", "topCoverView", "veCropChooseView", "Lcom/ss/android/photoeditor/ve/crop/view/VECropChooserView;", "veGraffitiChooseView", "Lcom/ss/android/photoeditor/ve/paint/graffiti/VEGraffitiChooserView;", "veImage", "Lcom/ss/android/vesdk/VEImage;", "veImageIsInit", "veImageService", "Lcom/ss/android/photoeditor/ve/service/VEImageService;", "veMosaicChooseView", "Lcom/ss/android/photoeditor/ve/paint/mosaic/VEMosaicChooserView;", "value", "veSurfaceViewHeight", "setVeSurfaceViewHeight", "(I)V", "veTextChooserView", "Lcom/ss/android/photoeditor/ve/textsticker/VETextChooserView;", "bindView", "", "destroy", "finishTextStickerRender", "hideCropChooseView", "hideEditToolView", "hideGraffitiMenu", "hideMosaicMenu", "hideTextChooserView", "hideTextStickerBorder", "hideTopCoverView", "initEditor", "initListener", "initPaintResource", "initVEImage", "initVESDK", "initView", "onBitmapSavedAndCloseThis", "success", "path", "width", "height", ShareHitPoint.f121869d, "onFinish", "onNewLayerAdded", "needClear", "onSurfaceChanged", "onSurfaceCreated", "holder", "Landroid/view/SurfaceHolder;", "onSurfaceDestory", "onSurfaceViewClicked", "onVEImageCreated", "showEditToolView", "showGraffitiMenu", "showMosaicMenu", "showTextChooserView", "showTopCoverView", "startEdit", "callback", "updateToolBarVisibility", "Builder", "Companion", "WeakOnBitmapToDiskListener", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.photoeditor.ve.b */
public final class VEPhotoEditor implements AbstractC59806a, VESurfaceCallback.SurfaceListener {

    /* renamed from: k */
    public static final Companion f148672k = new Companion(null);

    /* renamed from: A */
    private final int f148673A = R.layout.view_ve_photo_editor;

    /* renamed from: B */
    private RectView f148674B;

    /* renamed from: C */
    private boolean f148675C;

    /* renamed from: D */
    private int f148676D;

    /* renamed from: E */
    private final Builder f148677E;

    /* renamed from: a */
    public VESurfaceView f148678a;

    /* renamed from: b */
    public ImageEditToolView f148679b;

    /* renamed from: c */
    public VEGraffitiChooserView f148680c;

    /* renamed from: d */
    public VEMosaicChooserView f148681d;

    /* renamed from: e */
    public VETextChooserView f148682e;

    /* renamed from: f */
    public VECropChooserView f148683f;

    /* renamed from: g */
    public volatile boolean f148684g;

    /* renamed from: h */
    public int f148685h;

    /* renamed from: i */
    public NormalController f148686i;

    /* renamed from: j */
    public final Context f148687j;

    /* renamed from: l */
    private AbstractC59806a.AbstractC59807a f148688l;

    /* renamed from: m */
    private C59641k.AbstractC59643a f148689m;

    /* renamed from: n */
    private View f148690n;

    /* renamed from: o */
    private VEImage f148691o;

    /* renamed from: p */
    private FrameLayout f148692p;

    /* renamed from: q */
    private View f148693q;

    /* renamed from: r */
    private ImageView f148694r;

    /* renamed from: s */
    private TextBorderView f148695s;

    /* renamed from: t */
    private DeleteTextStickerView f148696t;

    /* renamed from: u */
    private View f148697u;

    /* renamed from: v */
    private VEImageService f148698v = new VEImageService();

    /* renamed from: w */
    private String f148699w;

    /* renamed from: x */
    private int f148700x;

    /* renamed from: y */
    private int f148701y;

    /* renamed from: z */
    private int f148702z;

    @Override // com.ss.android.photoeditor.ve.AbstractC59806a
    /* renamed from: a */
    public void mo203585a() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004J\u0019\u00108\u001a\u00020\u00002\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0002\u0010:J\u0015\u0010;\u001a\u00020\u00002\b\u0010<\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bJ\u0015\u0010?\u001a\u00020\u00002\b\u0010@\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010=J\u0010\u0010A\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010!J\u0010\u0010B\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010'J\u0015\u0010C\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010=J\u0010\u0010D\u001a\u00020\u00002\b\u0010/\u001a\u0004\u0018\u000100R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u0006E"}, d2 = {"Lcom/ss/android/photoeditor/ve/VEPhotoEditor$Builder;", "", "()V", "context", "Landroid/content/Context;", "getContext$photoeditor_release", "()Landroid/content/Context;", "setContext$photoeditor_release", "(Landroid/content/Context;)V", "enableEditor", "", "", "getEnableEditor$photoeditor_release", "()[Ljava/lang/String;", "setEnableEditor$photoeditor_release", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "imageHeight", "", "getImageHeight$photoeditor_release", "()Ljava/lang/Integer;", "setImageHeight$photoeditor_release", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "imagePath", "getImagePath$photoeditor_release", "()Ljava/lang/String;", "setImagePath$photoeditor_release", "(Ljava/lang/String;)V", "imageWidth", "getImageWidth$photoeditor_release", "setImageWidth$photoeditor_release", "log", "Lcom/ss/android/photoeditor/base/PELog$IPELog;", "getLog$photoeditor_release", "()Lcom/ss/android/photoeditor/base/PELog$IPELog;", "setLog$photoeditor_release", "(Lcom/ss/android/photoeditor/base/PELog$IPELog;)V", "photoEditorContainer", "Landroid/widget/FrameLayout;", "getPhotoEditorContainer$photoeditor_release", "()Landroid/widget/FrameLayout;", "setPhotoEditorContainer$photoeditor_release", "(Landroid/widget/FrameLayout;)V", "rotation", "getRotation$photoeditor_release", "setRotation$photoeditor_release", "statisticsProvider", "Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;", "getStatisticsProvider$photoeditor_release", "()Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;", "setStatisticsProvider$photoeditor_release", "(Lcom/ss/android/photoeditor/hitpoint/HitPointHelper$IStatisticsProvider;)V", "build", "Lcom/ss/android/photoeditor/ve/IVEPhotoEditor;", "setContext", "setEnablePController", "enableController", "([Ljava/lang/String;)Lcom/ss/android/photoeditor/ve/VEPhotoEditor$Builder;", "setImageHeight", "height", "(Ljava/lang/Integer;)Lcom/ss/android/photoeditor/ve/VEPhotoEditor$Builder;", "setImagePath", "setImageWidth", "width", "setLog", "setPhotoEditorContainer", "setRotation", "setStatisticsProvider", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$a */
    public static final class Builder {

        /* renamed from: a */
        private Context f148703a;

        /* renamed from: b */
        private String f148704b;

        /* renamed from: c */
        private Integer f148705c;

        /* renamed from: d */
        private Integer f148706d;

        /* renamed from: e */
        private Integer f148707e;

        /* renamed from: f */
        private FrameLayout f148708f;

        /* renamed from: g */
        private String[] f148709g = {"graffiti", "mosaic", "crop", "text"};

        /* renamed from: h */
        private C59641k.AbstractC59643a f148710h;

        /* renamed from: b */
        public final Integer mo203621b() {
            return this.f148705c;
        }

        /* renamed from: c */
        public final Integer mo203622c() {
            return this.f148706d;
        }

        /* renamed from: d */
        public final Integer mo203623d() {
            return this.f148707e;
        }

        /* renamed from: e */
        public final FrameLayout mo203624e() {
            return this.f148708f;
        }

        /* renamed from: f */
        public final C59641k.AbstractC59643a mo203625f() {
            return this.f148710h;
        }

        /* renamed from: a */
        public final String mo203620a() {
            return this.f148704b;
        }

        /* renamed from: g */
        public final AbstractC59806a mo203626g() {
            if (this.f148703a == null) {
                throw new IllegalArgumentException("context not be null".toString());
            } else if (this.f148704b == null) {
                throw new IllegalArgumentException("imagePath not be null".toString());
            } else if (this.f148708f != null) {
                C59641k.AbstractC59643a aVar = this.f148710h;
                if (aVar != null) {
                    C59641k.m231333a(aVar);
                }
                Context context = this.f148703a;
                if (context == null) {
                    Intrinsics.throwNpe();
                }
                return new VEPhotoEditor(context, this);
            } else {
                throw new IllegalArgumentException("photoEditorContainer not be null".toString());
            }
        }

        /* renamed from: a */
        public final Builder mo203616a(Context context) {
            this.f148703a = context;
            return this;
        }

        /* renamed from: a */
        public final Builder mo203617a(FrameLayout frameLayout) {
            this.f148708f = frameLayout;
            return this;
        }

        /* renamed from: a */
        public final Builder mo203618a(C59641k.AbstractC59643a aVar) {
            this.f148710h = aVar;
            return this;
        }

        /* renamed from: a */
        public final Builder mo203619a(String str) {
            this.f148704b = str;
            return this;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/photoeditor/ve/VEPhotoEditor$Companion;", "", "()V", "CROP", "", "GRAFFITI", "LOG_TAG", "MAX_RENDER_HEIGHT", "", "MAX_RENDER_WIDTH", "MOSAIC", "STATE_CROP", "STATE_GRAFFITI", "STATE_MOSAIC", "STATE_NONE", "STATE_TEXT", "TEXT", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$b */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$2$2", "Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "onClick", "", "photoeditor_release", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$apply$lambda$3"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$m */
    public static final class C59823m implements VEBaseController.OnSurfaceClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148728a;

        /* renamed from: b */
        final /* synthetic */ int f148729b;

        /* renamed from: c */
        final /* synthetic */ int f148730c;

        /* renamed from: d */
        final /* synthetic */ String f148731d;

        /* renamed from: e */
        final /* synthetic */ int f148732e;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseController.OnSurfaceClickedListener
        /* renamed from: a */
        public void mo203632a() {
            this.f148728a.mo203614q();
        }

        C59823m(VEPhotoEditor bVar, int i, int i2, String str, int i3) {
            this.f148728a = bVar;
            this.f148729b = i;
            this.f148730c = i2;
            this.f148731d = str;
            this.f148732e = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$3$1", "Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "onClick", "", "photoeditor_release", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$apply$lambda$4"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$n */
    public static final class C59824n implements VEBaseController.OnSurfaceClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148733a;

        /* renamed from: b */
        final /* synthetic */ int f148734b;

        /* renamed from: c */
        final /* synthetic */ int f148735c;

        /* renamed from: d */
        final /* synthetic */ String f148736d;

        /* renamed from: e */
        final /* synthetic */ int f148737e;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseController.OnSurfaceClickedListener
        /* renamed from: a */
        public void mo203632a() {
            this.f148733a.mo203614q();
        }

        C59824n(VEPhotoEditor bVar, int i, int i2, String str, int i3) {
            this.f148733a = bVar;
            this.f148734b = i;
            this.f148735c = i2;
            this.f148736d = str;
            this.f148737e = i3;
        }
    }

    /* renamed from: w */
    private final void m232025w() {
        this.f148698v.mo203977a(this.f148687j);
    }

    /* renamed from: d */
    public final void mo203601d() {
        VECropChooserView vECropChooserView = this.f148683f;
        if (vECropChooserView != null) {
            vECropChooserView.mo203654g();
        }
    }

    /* renamed from: e */
    public final void mo203602e() {
        VETextChooserView vETextChooserView = this.f148682e;
        if (vETextChooserView != null) {
            vETextChooserView.mo204066p();
        }
    }

    /* renamed from: f */
    public final void mo203603f() {
        VETextChooserView vETextChooserView = this.f148682e;
        if (vETextChooserView != null) {
            vETextChooserView.mo203650c();
        }
    }

    /* renamed from: i */
    public final void mo203606i() {
        ImageEditToolView imageEditToolView = this.f148679b;
        if (imageEditToolView != null) {
            imageEditToolView.mo204122a();
        }
    }

    /* renamed from: j */
    public final void mo203607j() {
        ImageEditToolView imageEditToolView = this.f148679b;
        if (imageEditToolView != null) {
            imageEditToolView.mo204123b();
        }
    }

    /* renamed from: m */
    public final void mo203610m() {
        VEGraffitiChooserView vEGraffitiChooserView = this.f148680c;
        if (vEGraffitiChooserView != null) {
            vEGraffitiChooserView.mo203653f();
        }
    }

    /* renamed from: n */
    public final void mo203611n() {
        VEGraffitiChooserView vEGraffitiChooserView = this.f148680c;
        if (vEGraffitiChooserView != null) {
            vEGraffitiChooserView.mo203654g();
        }
    }

    /* renamed from: o */
    public final void mo203612o() {
        VEMosaicChooserView vEMosaicChooserView = this.f148681d;
        if (vEMosaicChooserView != null) {
            vEMosaicChooserView.mo203653f();
        }
    }

    /* renamed from: p */
    public final void mo203613p() {
        VEMosaicChooserView vEMosaicChooserView = this.f148681d;
        if (vEMosaicChooserView != null) {
            vEMosaicChooserView.mo203654g();
        }
    }

    @Override // com.ss.android.vesdk.VESurfaceCallback.SurfaceListener
    /* renamed from: r */
    public void mo203615r() {
        Log.d("VEPhotoEditor", "onSurfaceDestory ");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$initListener$6", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "onCancelButtonClicked", "", "onConfirmButtonClicked", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$i */
    public static final class C59819i implements VEBaseChooserView.OnActionButtonClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148716a;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: a */
        public void mo203630a() {
            this.f148716a.mo203606i();
            this.f148716a.mo203608k();
            this.f148716a.mo203604g();
        }

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: b */
        public void mo203631b() {
            this.f148716a.mo203606i();
            this.f148716a.mo203608k();
            this.f148716a.mo203604g();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59819i(VEPhotoEditor bVar) {
            this.f148716a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$1$1", "Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "onClick", "", "photoeditor_release", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$apply$lambda$1"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$k */
    public static final class C59821k implements VEBaseController.OnSurfaceClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148718a;

        /* renamed from: b */
        final /* synthetic */ int f148719b;

        /* renamed from: c */
        final /* synthetic */ int f148720c;

        /* renamed from: d */
        final /* synthetic */ String f148721d;

        /* renamed from: e */
        final /* synthetic */ int f148722e;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseController.OnSurfaceClickedListener
        /* renamed from: a */
        public void mo203632a() {
            VEGraffitiChooserView vEGraffitiChooserView = this.f148718a.f148680c;
            if (vEGraffitiChooserView != null) {
                vEGraffitiChooserView.mo204001l();
            }
        }

        C59821k(VEPhotoEditor bVar, int i, int i2, String str, int i3) {
            this.f148718a = bVar;
            this.f148719b = i;
            this.f148720c = i2;
            this.f148721d = str;
            this.f148722e = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0012\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b¸\u0006\t"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$2$1", "Lcom/ss/android/photoeditor/ve/textsticker/VETextController$OnStickerChangeListener;", "onTextStickerIsMoving", "", "onTextStickerMoveStop", "onTextStickerSelected", "sticker", "Lcom/ss/android/photoeditor/ve/textsticker/TextStickerItem;", "photoeditor_release", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$apply$lambda$2"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$l */
    public static final class C59822l implements VETextController.OnStickerChangeListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148723a;

        /* renamed from: b */
        final /* synthetic */ int f148724b;

        /* renamed from: c */
        final /* synthetic */ int f148725c;

        /* renamed from: d */
        final /* synthetic */ String f148726d;

        /* renamed from: e */
        final /* synthetic */ int f148727e;

        @Override // com.ss.android.photoeditor.ve.textsticker.VETextController.OnStickerChangeListener
        /* renamed from: b */
        public void mo203635b() {
            this.f148723a.mo203608k();
            this.f148723a.mo203606i();
        }

        @Override // com.ss.android.photoeditor.ve.textsticker.VETextController.OnStickerChangeListener
        /* renamed from: a */
        public void mo203633a() {
            this.f148723a.mo203609l();
            ImageEditToolView imageEditToolView = this.f148723a.f148679b;
            if (imageEditToolView != null) {
                imageEditToolView.setVisibility(8);
            }
        }

        @Override // com.ss.android.photoeditor.ve.textsticker.VETextController.OnStickerChangeListener
        /* renamed from: a */
        public void mo203634a(TextStickerItem aVar) {
            VETextChooserView vETextChooserView;
            if (aVar != null && (vETextChooserView = this.f148723a.f148682e) != null) {
                ImageEditorHitPoint.f148823a.mo203722d();
                vETextChooserView.setVisibility(0);
                vETextChooserView.setText(aVar.mo204094h());
                vETextChooserView.mo204058a(aVar.mo204096i(), aVar.mo204097j());
                vETextChooserView.mo204063m();
            }
        }

        C59822l(VEPhotoEditor bVar, int i, int i2, String str, int i3) {
            this.f148723a = bVar;
            this.f148724b = i;
            this.f148725c = i2;
            this.f148726d = str;
            this.f148727e = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$4$1", "Lcom/ss/android/photoeditor/ve/crop/VECropController$CropFinishListener;", "onFinish", "", "photoeditor_release", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$apply$lambda$5"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$o */
    public static final class C59825o implements VECropController.CropFinishListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148738a;

        /* renamed from: b */
        final /* synthetic */ int f148739b;

        /* renamed from: c */
        final /* synthetic */ int f148740c;

        /* renamed from: d */
        final /* synthetic */ String f148741d;

        /* renamed from: e */
        final /* synthetic */ int f148742e;

        @Override // com.ss.android.photoeditor.ve.crop.VECropController.CropFinishListener
        /* renamed from: a */
        public void mo203636a() {
            NormalController bVar = this.f148738a.f148686i;
            if (bVar != null) {
                bVar.mo203592t();
            }
        }

        C59825o(VEPhotoEditor bVar, int i, int i2, String str, int i3) {
            this.f148738a = bVar;
            this.f148739b = i;
            this.f148740c = i2;
            this.f148741d = str;
            this.f148742e = i3;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$5$1", "Lcom/ss/android/photoeditor/ve/base/VEBaseController$OnSurfaceClickedListener;", "onClick", "", "photoeditor_release", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$apply$lambda$6"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$p */
    public static final class C59826p implements VEBaseController.OnSurfaceClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148743a;

        /* renamed from: b */
        final /* synthetic */ int f148744b;

        /* renamed from: c */
        final /* synthetic */ int f148745c;

        /* renamed from: d */
        final /* synthetic */ String f148746d;

        /* renamed from: e */
        final /* synthetic */ int f148747e;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseController.OnSurfaceClickedListener
        /* renamed from: a */
        public void mo203632a() {
            VEMosaicChooserView vEMosaicChooserView = this.f148743a.f148681d;
            if (vEMosaicChooserView != null) {
                vEMosaicChooserView.mo204023l();
            }
        }

        C59826p(VEPhotoEditor bVar, int i, int i2, String str, int i3) {
            this.f148743a = bVar;
            this.f148744b = i;
            this.f148745c = i2;
            this.f148746d = str;
            this.f148747e = i3;
        }
    }

    /* renamed from: c */
    public final void mo203600c() {
        NormalController bVar = this.f148686i;
        if (bVar != null) {
            bVar.mo203588a(new WeakOnBitmapToDiskListener(this));
        }
    }

    /* renamed from: g */
    public final void mo203604g() {
        VETextChooserView vETextChooserView = this.f148682e;
        if (vETextChooserView != null) {
            vETextChooserView.mo203652e();
        }
        VETextChooserView vETextChooserView2 = this.f148682e;
        if (vETextChooserView2 != null) {
            vETextChooserView2.mo204065o();
        }
    }

    /* renamed from: h */
    public final void mo203605h() {
        if (!this.f148684g) {
            LKUIToast.show(this.f148687j, "加载完成后才能编辑图片");
        }
    }

    /* renamed from: k */
    public final void mo203608k() {
        View view = this.f148693q;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: l */
    public final void mo203609l() {
        View view = this.f148693q;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0004"}, d2 = {"<anonymous>", "", "invoke", "com/ss/android/photoeditor/ve/VEPhotoEditor$onVEImageCreated$1$6$1", "com/ss/android/photoeditor/ve/VEPhotoEditor$$special$$inlined$let$lambda$1"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$q */
    public static final class C59827q extends Lambda implements Function0<Unit> {
        final /* synthetic */ int $imageHeight$inlined;
        final /* synthetic */ String $imagePath$inlined;
        final /* synthetic */ int $imageWidth$inlined;
        final /* synthetic */ String $it;
        final /* synthetic */ int $rotation$inlined;
        final /* synthetic */ VEImage $veImage$inlined;
        final /* synthetic */ VEPhotoEditor this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59827q(String str, VEImage vEImage, VEPhotoEditor bVar, int i, int i2, String str2, int i3) {
            super(0);
            this.$it = str;
            this.$veImage$inlined = vEImage;
            this.this$0 = bVar;
            this.$imageWidth$inlined = i;
            this.$imageHeight$inlined = i2;
            this.$imagePath$inlined = str2;
            this.$rotation$inlined = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            this.$veImage$inlined.mo220780a(this.$it, this.$rotation$inlined, new VEImage.OnLayerAddListener(this) {
                /* class com.ss.android.photoeditor.ve.VEPhotoEditor.C59827q.C598281 */

                /* renamed from: a */
                final /* synthetic */ C59827q f148748a;

                @Override // com.ss.android.vesdk.VEImage.OnLayerAddListener
                /* renamed from: a */
                public void mo203637a() {
                    VEPhotoEditor.m232019a(this.f148748a.this$0, false, 1, (Object) null);
                    C59905h.m232490b(new Function0<Unit>(this) {
                        /* class com.ss.android.photoeditor.ve.VEPhotoEditor.C59827q.C598281.C598291 */
                        final /* synthetic */ C598281 this$0;

                        {
                            this.this$0 = r1;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final void invoke() {
                            VESurfaceView vESurfaceView = this.this$0.f148748a.this$0.f148678a;
                            if (vESurfaceView != null) {
                                vESurfaceView.setEnabled(true);
                            }
                            this.this$0.f148748a.this$0.f148684g = true;
                        }
                    });
                }

                {
                    this.f148748a = r1;
                }
            });
        }
    }

    /* renamed from: t */
    private final void m232022t() {
        if (!this.f148675C) {
            C63937ah.m250998a(false);
            C63937ah.m250993a(this.f148687j, VEStorageUtils.f149211a.mo203985a(this.f148687j));
            C63937ah.m251008f(true);
            this.f148675C = true;
        }
    }

    /* renamed from: u */
    private final void m232023u() {
        View inflate = LayoutInflater.from(this.f148687j).inflate(this.f148673A, (ViewGroup) null);
        this.f148690n = inflate;
        if (inflate != null) {
            m232018a(inflate);
            m232026x();
            m232025w();
        }
        ImageEditorHitPoint.f148823a.mo203716a();
    }

    /* renamed from: b */
    public final void mo203599b() {
        VETextChooserView vETextChooserView;
        VETextController bVar;
        if (this.f148685h == 3 && (vETextChooserView = this.f148682e) != null && (bVar = (VETextController) vETextChooserView.getVeController()) != null) {
            bVar.mo203704o();
        }
    }

    /* renamed from: q */
    public final void mo203614q() {
        boolean z;
        View view = this.f148693q;
        if (view == null || view.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            mo203607j();
            mo203609l();
            return;
        }
        mo203606i();
        mo203608k();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$initListener$4", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "onCancelButtonClicked", "", "onConfirmButtonClicked", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$g */
    public static final class C59817g implements VEBaseChooserView.OnActionButtonClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148714a;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: a */
        public void mo203630a() {
            this.f148714a.mo203606i();
            this.f148714a.mo203608k();
            this.f148714a.mo203611n();
            VESurfaceView vESurfaceView = this.f148714a.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(this.f148714a.f148686i);
            }
            this.f148714a.f148685h = 0;
        }

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: b */
        public void mo203631b() {
            this.f148714a.mo203606i();
            this.f148714a.mo203608k();
            this.f148714a.mo203611n();
            VESurfaceView vESurfaceView = this.f148714a.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(this.f148714a.f148686i);
            }
            this.f148714a.f148685h = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59817g(VEPhotoEditor bVar) {
            this.f148714a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$initListener$5", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "onCancelButtonClicked", "", "onConfirmButtonClicked", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$h */
    public static final class C59818h implements VEBaseChooserView.OnActionButtonClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148715a;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: a */
        public void mo203630a() {
            this.f148715a.mo203606i();
            this.f148715a.mo203608k();
            this.f148715a.mo203613p();
            VESurfaceView vESurfaceView = this.f148715a.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(this.f148715a.f148686i);
            }
            this.f148715a.f148685h = 0;
        }

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: b */
        public void mo203631b() {
            this.f148715a.mo203606i();
            this.f148715a.mo203608k();
            this.f148715a.mo203613p();
            VESurfaceView vESurfaceView = this.f148715a.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(this.f148715a.f148686i);
            }
            this.f148715a.f148685h = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59818h(VEPhotoEditor bVar) {
            this.f148715a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$initListener$7", "Lcom/ss/android/photoeditor/ve/base/VEBaseChooserView$OnActionButtonClickedListener;", "onCancelButtonClicked", "", "onConfirmButtonClicked", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$j */
    public static final class C59820j implements VEBaseChooserView.OnActionButtonClickedListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148717a;

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: a */
        public void mo203630a() {
            this.f148717a.mo203606i();
            this.f148717a.mo203608k();
            this.f148717a.mo203601d();
            VESurfaceView vESurfaceView = this.f148717a.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(this.f148717a.f148686i);
            }
            this.f148717a.f148685h = 0;
        }

        @Override // com.ss.android.photoeditor.ve.base.VEBaseChooserView.OnActionButtonClickedListener
        /* renamed from: b */
        public void mo203631b() {
            this.f148717a.mo203606i();
            this.f148717a.mo203608k();
            this.f148717a.mo203601d();
            VESurfaceView vESurfaceView = this.f148717a.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(this.f148717a.f148686i);
            }
            this.f148717a.f148685h = 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59820j(VEPhotoEditor bVar) {
            this.f148717a = bVar;
        }
    }

    /* renamed from: x */
    private final void m232026x() {
        VEImage vEImage = new VEImage(this.f148678a, this, null, 4, null);
        vEImage.mo220782a(true);
        vEImage.mo220795d();
        VEImage.m250736a(vEImage, this.f148701y, this.f148702z, false, 4, (Object) null);
        this.f148691o = vEImage;
        m232020a(this.f148699w, this.f148701y, this.f148702z, this.f148700x);
    }

    /* renamed from: s */
    private final void m232021s() {
        int i;
        int i2;
        this.f148689m = this.f148677E.mo203625f();
        this.f148692p = this.f148677E.mo203624e();
        this.f148699w = this.f148677E.mo203620a();
        Integer b = this.f148677E.mo203621b();
        int i3 = 5000;
        if (b != null) {
            i = b.intValue();
        } else {
            i = 5000;
        }
        this.f148701y = i;
        Integer c = this.f148677E.mo203622c();
        if (c != null) {
            i3 = c.intValue();
        }
        this.f148702z = i3;
        Integer d = this.f148677E.mo203623d();
        if (d != null) {
            i2 = d.intValue();
        } else {
            i2 = 0;
        }
        this.f148700x = i2;
    }

    /* renamed from: v */
    private final void m232024v() {
        VESurfaceView vESurfaceView = this.f148678a;
        if (vESurfaceView != null) {
            vESurfaceView.setOnSurfaceViewClickListener(new View$OnClickListenerC59814d(this));
        }
        ImageView imageView = this.f148694r;
        if (imageView != null) {
            imageView.setOnClickListener(new View$OnClickListenerC59815e(this));
        }
        ImageEditToolView imageEditToolView = this.f148679b;
        if (imageEditToolView != null) {
            imageEditToolView.setOnItemClickListener(new C59816f(this));
        }
        VEGraffitiChooserView vEGraffitiChooserView = this.f148680c;
        if (vEGraffitiChooserView != null) {
            vEGraffitiChooserView.setActionButtonClickedListener(new C59817g(this));
        }
        VEMosaicChooserView vEMosaicChooserView = this.f148681d;
        if (vEMosaicChooserView != null) {
            vEMosaicChooserView.setActionButtonClickedListener(new C59818h(this));
        }
        VETextChooserView vETextChooserView = this.f148682e;
        if (vETextChooserView != null) {
            vETextChooserView.setActionButtonClickedListener(new C59819i(this));
        }
        VECropChooserView vECropChooserView = this.f148683f;
        if (vECropChooserView != null) {
            vECropChooserView.setActionButtonClickedListener(new C59820j(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$d */
    public static final class View$OnClickListenerC59814d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148711a;

        View$OnClickListenerC59814d(VEPhotoEditor bVar) {
            this.f148711a = bVar;
        }

        public final void onClick(View view) {
            this.f148711a.mo203605h();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/photoeditor/ve/VEPhotoEditor$initListener$3", "Lcom/ss/android/photoeditor/ve/view/ImageEditToolView$OnItemClickListener;", "onItemClick", "", ShareHitPoint.f121869d, "", "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$f */
    public static final class C59816f implements ImageEditToolView.OnItemClickListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148713a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59816f(VEPhotoEditor bVar) {
            this.f148713a = bVar;
        }

        @Override // com.ss.android.photoeditor.ve.view.ImageEditToolView.OnItemClickListener
        /* renamed from: a */
        public void mo203629a(int i) {
            IImageEditController aVar = null;
            if (i == 1) {
                this.f148713a.mo203607j();
                this.f148713a.mo203609l();
                this.f148713a.mo203599b();
                this.f148713a.mo203602e();
                this.f148713a.mo203610m();
                VESurfaceView vESurfaceView = this.f148713a.f148678a;
                if (vESurfaceView != null) {
                    VEGraffitiChooserView vEGraffitiChooserView = this.f148713a.f148680c;
                    if (vEGraffitiChooserView != null) {
                        aVar = vEGraffitiChooserView.getVeController();
                    }
                    vESurfaceView.setEditController(aVar);
                }
                this.f148713a.f148685h = 2;
                ImageEditorHitPoint.f148823a.mo203717a("draw", "public_pic_edit_draw_view");
            } else if (i == 4) {
                this.f148713a.mo203607j();
                this.f148713a.mo203609l();
                this.f148713a.mo203599b();
                this.f148713a.mo203602e();
                this.f148713a.mo203612o();
                VESurfaceView vESurfaceView2 = this.f148713a.f148678a;
                if (vESurfaceView2 != null) {
                    VEMosaicChooserView vEMosaicChooserView = this.f148713a.f148681d;
                    if (vEMosaicChooserView != null) {
                        aVar = vEMosaicChooserView.getVeController();
                    }
                    vESurfaceView2.setEditController(aVar);
                }
                this.f148713a.f148685h = 1;
                ImageEditorHitPoint.f148823a.mo203717a("mosaic", "public_pic_edit_mosaic_view");
            } else if (i == 2) {
                this.f148713a.mo203607j();
                this.f148713a.mo203609l();
                this.f148713a.mo203602e();
                this.f148713a.mo203603f();
                VESurfaceView vESurfaceView3 = this.f148713a.f148678a;
                if (vESurfaceView3 != null) {
                    VETextChooserView vETextChooserView = this.f148713a.f148682e;
                    if (vETextChooserView != null) {
                        aVar = (VETextController) vETextChooserView.getVeController();
                    }
                    vESurfaceView3.setEditController(aVar);
                }
                this.f148713a.f148685h = 3;
                ImageEditorHitPoint.f148823a.mo203717a("text", "public_pic_edit_text_view");
            } else if (i == 3) {
                this.f148713a.mo203607j();
                this.f148713a.mo203609l();
                this.f148713a.mo203602e();
                this.f148713a.mo203599b();
                VECropChooserView vECropChooserView = this.f148713a.f148683f;
                if (vECropChooserView != null) {
                    vECropChooserView.mo203653f();
                }
                VESurfaceView vESurfaceView4 = this.f148713a.f148678a;
                if (vESurfaceView4 != null) {
                    VECropChooserView vECropChooserView2 = this.f148713a.f148683f;
                    if (vECropChooserView2 != null) {
                        aVar = (VECropController) vECropChooserView2.getVeController();
                    }
                    vESurfaceView4.setEditController(aVar);
                }
                this.f148713a.f148685h = 4;
                ImageEditorHitPoint.f148823a.mo203717a("crop", "public_pic_edit_crop_view");
            } else if (i == 5) {
                this.f148713a.mo203600c();
                ImageEditorHitPoint.Companion.m232164a(ImageEditorHitPoint.f148823a, "done", null, 2, null);
            }
        }
    }

    @Override // com.ss.android.vesdk.VESurfaceCallback.SurfaceListener
    /* renamed from: a */
    public void mo203596a(SurfaceHolder surfaceHolder) {
        Log.d("VEPhotoEditor", "onSurfaceCreated ");
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J2\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/photoeditor/ve/VEPhotoEditor$WeakOnBitmapToDiskListener;", "Lcom/ss/android/photoeditor/ve/utils/AbsWeakListener;", "Lcom/ss/android/photoeditor/ve/VEPhotoEditor;", "Lcom/ss/android/photoeditor/ve/controller/NormalController$OnBitmapToDiskListener;", "weakObject", "(Lcom/ss/android/photoeditor/ve/VEPhotoEditor;)V", "onSaved", "", "success", "", "path", "", "width", "", "height", ShareHitPoint.f121869d, "photoeditor_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$c */
    public static final class WeakOnBitmapToDiskListener extends AbsWeakListener<VEPhotoEditor> implements NormalController.OnBitmapToDiskListener {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WeakOnBitmapToDiskListener(VEPhotoEditor bVar) {
            super(bVar);
            Intrinsics.checkParameterIsNotNull(bVar, "weakObject");
        }

        @Override // com.ss.android.photoeditor.ve.controller.NormalController.OnBitmapToDiskListener
        /* renamed from: a */
        public void mo203593a(boolean z, String str, int i, int i2, String str2) {
            Intrinsics.checkParameterIsNotNull(str2, ShareHitPoint.f121869d);
            VEPhotoEditor bVar = (VEPhotoEditor) mo203978a();
            if (bVar != null) {
                bVar.mo203598a(z, str, i, i2, str2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.photoeditor.ve.b$e */
    public static final class View$OnClickListenerC59815e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ VEPhotoEditor f148712a;

        View$OnClickListenerC59815e(VEPhotoEditor bVar) {
            this.f148712a = bVar;
        }

        public final void onClick(View view) {
            if (this.f148712a.f148687j instanceof Activity) {
                ((Activity) this.f148712a.f148687j).finish();
            }
        }
    }

    @Override // com.ss.android.photoeditor.ve.AbstractC59806a
    /* renamed from: a */
    public AbstractC59806a mo203584a(AbstractC59806a.AbstractC59807a aVar) {
        this.f148688l = aVar;
        FrameLayout frameLayout = this.f148692p;
        if (frameLayout != null) {
            frameLayout.addView(this.f148690n);
        }
        return this;
    }

    /* renamed from: a */
    private final void m232017a(int i) {
        if (i > 0) {
            this.f148676D = i;
            NormalController bVar = this.f148686i;
            if (bVar != null) {
                bVar.mo203679a(i);
            }
            VEGraffitiChooserView vEGraffitiChooserView = this.f148680c;
            if (vEGraffitiChooserView != null) {
                vEGraffitiChooserView.setScreenHeight(this.f148676D);
            }
            VEMosaicChooserView vEMosaicChooserView = this.f148681d;
            if (vEMosaicChooserView != null) {
                vEMosaicChooserView.setScreenHeight(this.f148676D);
            }
            VETextChooserView vETextChooserView = this.f148682e;
            if (vETextChooserView != null) {
                vETextChooserView.setScreenHeight(this.f148676D);
            }
            VECropChooserView vECropChooserView = this.f148683f;
            if (vECropChooserView != null) {
                vECropChooserView.setScreenHeight(this.f148676D);
            }
            NormalController bVar2 = this.f148686i;
            if (bVar2 != null) {
                bVar2.mo203679a(this.f148676D);
            }
        }
    }

    /* renamed from: a */
    private final void m232018a(View view) {
        VESurfaceView vESurfaceView = (VESurfaceView) view.findViewById(R.id.surface_view);
        this.f148678a = vESurfaceView;
        if (vESurfaceView != null) {
            vESurfaceView.setEnabled(false);
        }
        this.f148693q = view.findViewById(R.id.fl_top_cover);
        this.f148694r = (ImageView) view.findViewById(R.id.iv_close);
        this.f148679b = (ImageEditToolView) view.findViewById(R.id.edit_tool_view);
        this.f148680c = (VEGraffitiChooserView) view.findViewById(R.id.paint_color_choose_view);
        this.f148681d = (VEMosaicChooserView) view.findViewById(R.id.mosaic_choose_view);
        this.f148682e = (VETextChooserView) view.findViewById(R.id.input_text_view);
        this.f148695s = (TextBorderView) view.findViewById(R.id.edit_border_view);
        this.f148683f = (VECropChooserView) view.findViewById(R.id.crop_choose_view);
        this.f148696t = (DeleteTextStickerView) view.findViewById(R.id.delete_text_sticker_view);
        this.f148697u = view.findViewById(R.id.fl_delete_cover);
        this.f148674B = (RectView) view.findViewById(R.id.rect_mosaic_view);
    }

    /* renamed from: a */
    public final void mo203597a(boolean z) {
        NormalController bVar = this.f148686i;
        if (bVar != null) {
            bVar.mo203591s();
        }
        mo203606i();
    }

    public VEPhotoEditor(Context context, Builder aVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(aVar, "builder");
        this.f148687j = context;
        this.f148677E = aVar;
        m232021s();
        m232022t();
        m232023u();
        m232024v();
    }

    @Override // com.ss.android.vesdk.VESurfaceCallback.SurfaceListener
    /* renamed from: a */
    public void mo203595a(int i, int i2) {
        Log.d("VEPhotoEditor", "onSurfaceChanged : width = " + i + " ; height = " + i2);
        VEImage vEImage = this.f148691o;
        if (vEImage != null) {
            VEImage.m250737a(vEImage, (VEImage.FristLayerSwapCallback) null, false, 3, (Object) null);
        }
        m232017a(i2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m232019a(VEPhotoEditor bVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        bVar.mo203597a(z);
    }

    /* renamed from: a */
    private final void m232020a(String str, int i, int i2, int i3) {
        TextStickerEditText textStickerEditText;
        if (TextUtils.isEmpty(str)) {
            C59641k.AbstractC59643a aVar = this.f148689m;
            if (aVar != null) {
                aVar.mo177144a("VEPhotoEditor", "图片加载失败");
                return;
            }
            return;
        }
        VEImage vEImage = this.f148691o;
        if (vEImage != null) {
            this.f148701y = i;
            this.f148702z = i2;
            this.f148699w = str;
            this.f148700x = i3;
            VEGraffitiChooserView vEGraffitiChooserView = this.f148680c;
            if (vEGraffitiChooserView != null) {
                VEGraffitiController aVar2 = new VEGraffitiController(this.f148687j, vEImage);
                aVar2.mo203682a(new C59821k(this, i, i2, str, i3));
                vEGraffitiChooserView.setVeController(aVar2);
            }
            VETextChooserView vETextChooserView = this.f148682e;
            if (vETextChooserView != null) {
                VETextController bVar = new VETextController(this.f148687j, vEImage);
                bVar.mo204107a(this.f148695s);
                bVar.mo204106a(this.f148696t);
                bVar.mo204111b(this.f148697u);
                VETextChooserView vETextChooserView2 = this.f148682e;
                if (vETextChooserView2 != null) {
                    textStickerEditText = vETextChooserView2.getEditTextView();
                } else {
                    textStickerEditText = null;
                }
                bVar.mo204105a((EditText) textStickerEditText);
                bVar.mo204108a(new C59822l(this, i, i2, str, i3));
                bVar.mo203682a(new C59823m(this, i, i2, str, i3));
                vETextChooserView.setVeController(bVar);
            }
            NormalController bVar2 = new NormalController(this.f148687j, vEImage);
            bVar2.mo203682a(new C59824n(this, i, i2, str, i3));
            this.f148686i = bVar2;
            VESurfaceView vESurfaceView = this.f148678a;
            if (vESurfaceView != null) {
                vESurfaceView.setEditController(bVar2);
            }
            VECropChooserView vECropChooserView = this.f148683f;
            if (vECropChooserView != null) {
                VECropController aVar3 = new VECropController(this.f148687j, vEImage);
                aVar3.mo203727a(new C59825o(this, i, i2, str, i3));
                vECropChooserView.setVeController(aVar3);
            }
            VEMosaicChooserView vEMosaicChooserView = this.f148681d;
            if (vEMosaicChooserView != null) {
                VEMosaicController aVar4 = new VEMosaicController(this.f148687j, vEImage);
                aVar4.mo204039a(this.f148674B);
                aVar4.mo203682a(new C59826p(this, i, i2, str, i3));
                vEMosaicChooserView.setVeController(aVar4);
            }
            if (str != null) {
                C59905h.m232489a(new C59827q(str, vEImage, this, i, i2, str, i3));
            }
        }
    }

    /* renamed from: a */
    public final void mo203598a(boolean z, String str, int i, int i2, String str2) {
        AbstractC59806a.AbstractC59807a aVar = this.f148688l;
        if (aVar != null) {
            aVar.mo177143a(str);
        }
        VEImage vEImage = this.f148691o;
        if (vEImage != null) {
            vEImage.mo220797e();
        }
    }
}
