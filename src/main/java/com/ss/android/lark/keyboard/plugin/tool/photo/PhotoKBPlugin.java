package com.ss.android.lark.keyboard.plugin.tool.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.RomUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.checker.AbsInvalidTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.SendFileTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.ToastTip;
import com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.rxjava.AbstractC57864b;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.C58633e;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import com.ss.android.lark.widget.photo_picker.statistics.PerfGalleryLoadMonitor;
import com.ss.android.lark.widget.photo_picker.statistics.PerfImageUploadMonitor;
import com.ss.android.lark.widget.richtext.C59031e;
import com.ss.android.lark.widget.span.C59185t;
import com.ss.android.lark.widget.span.UrlImageSpan;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.C69043h;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 \u00012\u00020\u0001:\n\u0001\u0001\u0001\u0001\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010:\u001a\u00020\u0003H\u0014J\u0006\u0010;\u001a\u00020<J\u0010\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020?H\u0004J\u001e\u0010@\u001a\u00020\t2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u0003H\u0004J4\u0010E\u001a\u00020F2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0BH\u0014J4\u0010K\u001a\u00020L2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0BH\u0002J4\u0010M\u001a\u00020N2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u00032\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020J0BH\u0002J\u0010\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020QH\u0014J \u0010R\u001a\u00020<2\u0006\u0010S\u001a\u00020\u00172\u0006\u0010T\u001a\u00020\u00172\u0006\u0010U\u001a\u00020VH\u0002J\u0018\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020Y2\u0006\u0010D\u001a\u00020\u0003H\u0002J,\u0010W\u001a\u00020<2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020J0[2\u0006\u0010D\u001a\u00020\u00032\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0014J\u0018\u0010\\\u001a\u00020<2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0002J\u001e\u0010\\\u001a\u00020<2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u0003H\u0002J\u001e\u0010a\u001a\u00020<2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u0006\u0010D\u001a\u00020\u0003H\u0002J\u0010\u0010b\u001a\u00020<2\u0006\u0010c\u001a\u00020dH\u0002J\b\u0010e\u001a\u00020\u0003H\u0002J\u0006\u0010f\u001a\u00020\u0003J\u0018\u0010g\u001a\u00020\u00032\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0003H\u0002J\u001a\u0010j\u001a\u00020k2\b\u0010l\u001a\u0004\u0018\u00010m2\u0006\u0010n\u001a\u00020\u0017H\u0002J\u0018\u0010o\u001a\u00020\u00032\u0006\u0010S\u001a\u00020\u00172\u0006\u0010U\u001a\u00020VH\u0016J\u0010\u0010p\u001a\u00020<2\u0006\u0010q\u001a\u00020rH\u0016J\u0018\u0010s\u001a\u00020\u00192\u0006\u0010t\u001a\u00020r2\u0006\u0010P\u001a\u00020QH\u0016J\u0012\u0010u\u001a\u0004\u0018\u00010\u00192\u0006\u0010t\u001a\u00020rH\u0016J\b\u0010v\u001a\u00020<H\u0016J\u0010\u0010w\u001a\u00020<2\u0006\u0010x\u001a\u00020\u0003H\u0016J\u0010\u0010y\u001a\u00020<2\u0006\u0010z\u001a\u00020\u0003H\u0016J\u0010\u0010{\u001a\u00020<2\u0006\u0010|\u001a\u00020\u0003H\u0016J\b\u0010}\u001a\u00020<H\u0016J\u0010\u0010~\u001a\u00020<2\u0006\u0010\u001a\u00020\u0017H\u0014J\t\u0010\u0001\u001a\u00020<H\u0016J\t\u0010\u0001\u001a\u00020<H\u0016J&\u0010\u0001\u001a\u00020<2\r\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020^0B2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0BH\u0014J\u0012\u0010\u0001\u001a\u00020<2\u0007\u0010\u0001\u001a\u00020\u0003H\u0016J\u0011\u0010\u0001\u001a\u00020<2\u0006\u0010P\u001a\u00020QH\u0004J\t\u0010\u0001\u001a\u00020<H\u0002J\u0013\u0010\u0001\u001a\u00020<2\b\u0010\u0001\u001a\u00030\u0001H\u0002J!\u0010\u0001\u001a\u00020<2\u000e\u0010A\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B2\u0006\u0010D\u001a\u00020\u0003H\u0014J0\u0010\u0001\u001a\u00020<2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020C0B2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010B2\u0006\u0010D\u001a\u00020\u0003H\u0004J+\u0010\u0001\u001a\u00020<2\u0007\u0010\u0001\u001a\u00020C2\u000f\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010B2\u0006\u0010D\u001a\u00020\u0003H\u0002J\u0011\u0010\u0001\u001a\u00020<2\u0006\u0010>\u001a\u00020\u001fH\u0016J\u0010\u0010\u0001\u001a\u00020<2\u0007\u0010\u0001\u001a\u000205J\u0010\u0010\u0001\u001a\u00020<2\u0007\u0010\u0001\u001a\u00020/J\u000f\u0010\u0001\u001a\u00020<2\u0006\u0010\u001a\u00020\u0017J\t\u0010\u0001\u001a\u00020<H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u000e\u0010\u0015\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010.\u001a\u0004\u0018\u00010/X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "isDarkStyle", "", "showHoverTips", "dependency", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "(ZZLcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;)V", "checkCallback", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Callback;", "getDependency", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency;", "extractFrameAPI", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI;", "getExtractFrameAPI", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI;", "insertPhotoVertically", "getInsertPhotoVertically", "()Z", "setInsertPhotoVertically", "(Z)V", "mEnableSendMedia", "mFileUploadDenyCode", "", "mIcon", "Landroid/view/View;", "getMIcon", "()Landroid/view/View;", "setMIcon", "(Landroid/view/View;)V", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "getMKeyBoardContext", "()Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "setMKeyBoardContext", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;)V", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "getMLoadingDialog", "()Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "mPicturePanel", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/LarkPhotoPickerView;", "getMPicturePanel", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/LarkPhotoPickerView;", "setMPicturePanel", "(Lcom/ss/android/lark/keyboard/plugin/tool/photo/LarkPhotoPickerView;)V", "mPluginClickListener", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "getMPluginClickListener", "()Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "setMPluginClickListener", "(Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;)V", "photoInsertListener", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$OnPhotoInsertListener;", "uploadPhotoAPI", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI;", "getUploadPhotoAPI", "()Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI;", "cameraCanRecordVideo", "clearPhotoSelection", "", "createIcon", "context", "Landroid/content/Context;", "getCheckCallback", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "getInvalidTip", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/AbsInvalidTip;", "result", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "invalidList", "", "getSendFileTip", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/SendFileTip;", "getToastTip", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/ToastTip;", "handleIconClick", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "handlePhotoResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "insertPhotoToInput", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "photoPaths", "", "insertVideoToInput", "videoInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "frameInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "insertVideoToInputInternal", "isCameraCanUse", "callback", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$ICameraAvailablityCallback;", "isEnableSimpleOpenCamera", "isPostInputMode", "judgeCameraCanUse", "facingBackCameraAvailable", "facingFrontCameraAvailable", "multiPhotoAuthorizatedResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "throwable", "", "fileUploadDenyCode", "onActivityResult", "onCreate", "pluginContainer", "Landroid/view/ViewGroup;", "onCreateIcon", "parent", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onSelectOverflow", "maxCount", "onStart", "onStop", "onVideoExtract", "videoInfos", "onVisibleChanged", "isVisible", "photoIconClickImpl", "sendImageSelectHitPoint", "sendInsertMediaHitPoint", "insertType", "Lcom/ss/android/lark/statistics/extensions/IParam;", "sendPhoto", "sendPhotoImpl", "videoFileList", "sendVideo", "video", "setKeyBoardContext", "setOnPhotoInsertListener", "listener", "setPluginClickListener", "updateMaxCount", "updatePicPanelMode", "Companion", "ICameraAvailablityCallback", "IOnExtractVideoFrameAPI", "IOnUploadPhotoAPI", "OnPhotoInsertListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b */
public class PhotoKBPlugin implements IKeyBoardPlugin {

    /* renamed from: e */
    public static final Companion f104312e = new Companion(null);

    /* renamed from: a */
    protected View f104313a;

    /* renamed from: b */
    public final int f104314b = C40682g.m160850a().mo133172b();

    /* renamed from: c */
    public final boolean f104315c = C40682g.m160850a().mo133171a("messenger.im.send.choose.media");

    /* renamed from: d */
    protected IKeyBoardPlugin.IKeyBoardContext f104316d;

    /* renamed from: f */
    private LarkPhotoPickerView f104317f;

    /* renamed from: g */
    private final CommonLoadingDialog f104318g = new CommonLoadingDialog();

    /* renamed from: h */
    private IKeyBoardPlugin.IPluginClickListener f104319h;

    /* renamed from: i */
    private final IOnUploadPhotoAPI f104320i = new C41019p(this);

    /* renamed from: j */
    private final IOnExtractVideoFrameAPI f104321j = new C40998f(this);

    /* renamed from: k */
    private VideoSendChecker.Callback f104322k;

    /* renamed from: l */
    private boolean f104323l = true;

    /* renamed from: m */
    private OnPhotoInsertListener f104324m;

    /* renamed from: n */
    private final boolean f104325n;

    /* renamed from: o */
    private final boolean f104326o;

    /* renamed from: p */
    private final IPhotoDependency f104327p;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$ICameraAvailablityCallback;", "", "onAvailable", "", "onUnavailable", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$b */
    public interface ICameraAvailablityCallback {
        /* renamed from: a */
        void mo147829a();

        /* renamed from: b */
        void mo147830b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI;", "", "doExtract", "", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "callback", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI$IExtractVideoCallback;", "IExtractVideoCallback", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$c */
    public interface IOnExtractVideoFrameAPI {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI$IExtractVideoCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "ret", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$c$a */
        public interface IExtractVideoCallback {
            /* renamed from: a */
            void mo147832a();

            /* renamed from: a */
            void mo147833a(ErrorResult errorResult);

            /* renamed from: a */
            void mo147834a(Map<String, IPhotoDependency.FrameInfo> map);
        }

        /* renamed from: a */
        void mo147831a(List<IPhotoDependency.VideoInfo> list, IExtractVideoCallback aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI;", "", "doUpload", "", "photos", "", "", "isKeepOriginPic", "", "callback", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI$IUploadCallback;", "IUploadCallback", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$d */
    public interface IOnUploadPhotoAPI {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI$IUploadCallback;", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$d$a */
        public interface IUploadCallback extends AbstractC25974h {
            /* renamed from: a */
            void mo147836a();

            /* renamed from: a */
            void mo147837a(ErrorResult errorResult);

            /* renamed from: a */
            void mo147838a(IPhotoDependency.Image image);
        }

        /* renamed from: a */
        void mo147835a(List<String> list, boolean z, IUploadCallback aVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$OnPhotoInsertListener;", "", "onImageInsert", "", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onPhotoInsert", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$e */
    public interface OnPhotoInsertListener {
        /* renamed from: a */
        void mo147795a(IPhotoDependency.Image image);

        /* renamed from: a */
        void mo147796a(List<Photo> list);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147295b(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: d */
    public void mo147299d(boolean z) {
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: e */
    public void mo147301e(boolean z) {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$Companion;", "", "()V", "TAG", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final LarkPhotoPickerView mo147815b() {
        return this.f104317f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final CommonLoadingDialog mo147818c() {
        return this.f104318g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final IKeyBoardPlugin.IPluginClickListener mo147819d() {
        return this.f104319h;
    }

    /* renamed from: e */
    public final IOnUploadPhotoAPI mo147820e() {
        return this.f104320i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo147827p() {
        return this.f104325n;
    }

    /* renamed from: q */
    public final IPhotoDependency mo147828q() {
        return this.f104327p;
    }

    /* renamed from: a */
    public final void mo147803a(IKeyBoardPlugin.IPluginClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f104319h = cVar;
    }

    /* renamed from: a */
    public final void mo147804a(IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        C57805b.m224333d(bVar.mo147365B(), new C41018o(this, dVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo147801a(int i) {
        String str;
        int i2;
        if (!this.f104315c || mo147823l()) {
            str = "max_count";
            i2 = R.string.Lark_Legacy_PickerOverMaxCountTips;
        } else {
            i2 = R.string.Lark_Legacy_Max9Items;
            str = "number";
        }
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        LKUIToast.show(bVar.mo147365B(), UIHelper.mustacheFormat(i2, str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo147807a(ICameraAvailablityCallback bVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        Object systemService = bVar2.mo147365B().getSystemService("camera");
        if (systemService != null) {
            CameraManager cameraManager = (CameraManager) systemService;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            String[] cameraIdList = cameraManager.getCameraIdList();
            Intrinsics.checkExpressionValueIsNotNull(cameraIdList, "manager.cameraIdList");
            booleanRef.element = !C69043h.m265767b(cameraIdList, String.valueOf(1));
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            String[] cameraIdList2 = cameraManager.getCameraIdList();
            Intrinsics.checkExpressionValueIsNotNull(cameraIdList2, "manager.cameraIdList");
            booleanRef2.element = !C69043h.m265767b(cameraIdList2, String.valueOf(0));
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = cameraManager.getCameraIdList().length;
            if (mo166338r()) {
                Log.m165389i("PhotoKBPlugin", "OpenCameraSimple, count:" + intRef.element + ", facingBackCameraAvailable:" + booleanRef.element + ", facingFrontCameraAvailable:" + booleanRef2.element);
                if (intRef.element <= 0 || (booleanRef.element && booleanRef2.element)) {
                    bVar.mo147830b();
                } else {
                    bVar.mo147829a();
                }
            } else {
                cameraManager.registerAvailabilityCallback(new C41007k(this, booleanRef2, booleanRef, intRef, cameraManager, bVar), (Handler) null);
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        }
    }

    /* renamed from: a */
    public final boolean mo147813a(boolean z, boolean z2) {
        return (z && z2) || ((z || z2) && Camera.getNumberOfCameras() == 1 && RomUtils.m94955j() == RomUtils.RomType.UNKNOWN);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i != 911 && i != 233) {
            return false;
        }
        m162505a(i, -1, intent);
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f104316d = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f104313a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setEnabled(z);
    }

    /* renamed from: a */
    public final void mo147805a(IPhotoDependency.Image image, boolean z) {
        m162506a(KeyboardHitPointExtraParams.InsertType.IMAGE);
        OnPhotoInsertListener eVar = this.f104324m;
        if (eVar != null) {
            eVar.mo147795a(image);
        }
        List<String> urls = image.getUrls();
        if (CollectionUtils.isNotEmpty(urls) && this.f104323l) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            EditText l = bVar.mo147381z().mo146904l();
            if (l != null) {
                String str = urls.get(0);
                IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
                }
                UrlImageSpan rVar = new UrlImageSpan(bVar2.mo147365B(), str, l, null, 8, null);
                IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f104316d;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
                }
                EditText l2 = bVar3.mo147381z().mo146904l();
                if (l2 instanceof RichTextEmojiconEditText) {
                    ((RichTextEmojiconEditText) l2).mo146912a(rVar, str, ImageUtils.m224133a(str, image.getWidth(), image.getHeight()), image.getToken(), image.getWidth(), image.getHeight(), true, z);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo147812a(List<String> list, boolean z, List<Photo> list2) {
        Scene scene;
        Intrinsics.checkParameterIsNotNull(list, "photoPaths");
        Intrinsics.checkParameterIsNotNull(list2, "photos");
        if (!CollectionUtils.isEmpty(list)) {
            if (!ImageUtils.m224134a(list, z)) {
                IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
                }
                LKUIToast.show(bVar.mo147365B(), (int) R.string.Lark_Legacy_UnsupportedImage);
                return;
            }
            String contextId = PerfLog.getContextId();
            PerfLog.start("upload_image", contextId, "");
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            if (bVar2.mo147372b() == KeyboardScene.ChatMain) {
                scene = Scene.Chat;
            } else {
                scene = Scene.Thread;
            }
            PerfImageUploadMonitor.f145430a.mo199312a(Biz.Messenger, scene, 1);
            PerfImageUploadMonitor.m228144a(PerfImageUploadMonitor.f145430a, true, z, (ImageUtils.ImageType) null, 4, (Object) null);
            CommonLoadingDialog commonLoadingDialog = this.f104318g;
            IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f104316d;
            if (bVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            commonLoadingDialog.show(bVar3.mo147365B());
            this.f104320i.mo147835a(list, z, new C41003j(this, contextId, z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo147809a(List<IPhotoDependency.VideoInfo> list, List<Photo> list2) {
        Intrinsics.checkParameterIsNotNull(list, "videoInfos");
        Intrinsics.checkParameterIsNotNull(list2, "photos");
        CommonLoadingDialog commonLoadingDialog = this.f104318g;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        commonLoadingDialog.show(bVar.mo147365B());
        this.f104321j.mo147831a(list, new C41014n(this, list));
    }

    /* renamed from: a */
    public final void mo147806a(IPhotoDependency.VideoInfo videoInfo, IPhotoDependency.FrameInfo frameInfo) {
        String path = videoInfo.getPath();
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        Activity B = bVar.mo147365B();
        String a = C26279i.m95149a((int) videoInfo.getDuration());
        IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        C59185t tVar = new C59185t(B, path, a, bVar2.mo147381z().mo146904l());
        IKeyBoardPlugin.IKeyBoardContext bVar3 = this.f104316d;
        if (bVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        EditText l = bVar3.mo147381z().mo146904l();
        if (l instanceof RichTextEmojiconEditText) {
            ((RichTextEmojiconEditText) l).mo146913a(tVar, videoInfo, frameInfo, ImageUtils.m224133a(path, (int) LocationRequest.PRIORITY_HD_ACCURACY, (int) LocationRequest.PRIORITY_HD_ACCURACY), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo147811a(List<Photo> list, boolean z) {
        List<Photo> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t.isVideo()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                Log.m165389i("PhotoKBPlugin", "no has video, send images");
                mo147810a(list, (List<String>) null, z);
                return;
            }
            Log.m165389i("PhotoKBPlugin", "has video, first check video");
            ArrayList<Photo> arrayList3 = arrayList2;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            for (Photo photo : arrayList3) {
                arrayList4.add(photo.getPath());
            }
            new VideoSendChecker().mo147417a(arrayList4, mo147814b(list, z));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147810a(List<Photo> list, List<String> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "photos");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            boolean isVideo = t2.isVideo();
            if (t2.isVideo()) {
                arrayList.add(t2);
            } else {
                arrayList2.add(t2.getPath());
            }
            if (i == CollectionsKt.getLastIndex(list) || isVideo) {
                ArrayList arrayList3 = arrayList2;
                if (!arrayList3.isEmpty()) {
                    if (mo147823l()) {
                        mo147812a(new ArrayList(arrayList3), z, list);
                    } else {
                        this.f104327p.mo122041a(new ArrayList<>(arrayList3), z);
                    }
                    arrayList2.clear();
                }
                ArrayList arrayList4 = arrayList;
                if (!arrayList4.isEmpty()) {
                    if (!mo147823l() || !this.f104327p.mo122042a()) {
                        Object obj = arrayList.get(0);
                        Intrinsics.checkExpressionValueIsNotNull(obj, "videos[0]");
                        m162507a((Photo) obj, list2, z);
                    } else {
                        mo166337c(new ArrayList(arrayList4), z);
                    }
                    arrayList.clear();
                }
            }
            i = i2;
        }
        if (!mo147823l()) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            bVar.mo147379v();
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            bVar2.mo147380y();
        }
    }

    /* renamed from: a */
    public final void mo147808a(OnPhotoInsertListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "listener");
        this.f104324m = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$extractFrameAPI$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI;", "doExtract", "", "videoInfos", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$VideoInfo;", "callback", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI$IExtractVideoCallback;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$f */
    public static final class C40998f implements IOnExtractVideoFrameAPI {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104328a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\u0006H\u0016J\u001c\u0010\n\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$extractFrameAPI$1$doExtract$1", "Lcom/ss/android/lark/utils/rxjava/ReportErrorObserver;", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "error", "", "throwable", "", "onComplete", "onNext", "t", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$f$a */
        public static final class C40999a extends AbstractC57864b<Map<String, ? extends IPhotoDependency.FrameInfo>> {

            /* renamed from: a */
            final /* synthetic */ IOnExtractVideoFrameAPI.IExtractVideoCallback f104329a;

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b, io.reactivex.AbstractC69009q
            public void onComplete() {
                this.f104329a.mo147832a();
            }

            C40999a(IOnExtractVideoFrameAPI.IExtractVideoCallback aVar) {
                this.f104329a = aVar;
            }

            /* renamed from: a */
            public void onNext(Map<String, IPhotoDependency.FrameInfo> map) {
                Intrinsics.checkParameterIsNotNull(map, "t");
                this.f104329a.mo147834a(map);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                String str;
                IOnExtractVideoFrameAPI.IExtractVideoCallback aVar = this.f104329a;
                if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                aVar.mo147833a(new ErrorResult(str));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40998f(PhotoKBPlugin bVar) {
            this.f104328a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnExtractVideoFrameAPI
        /* renamed from: a */
        public void mo147831a(List<IPhotoDependency.VideoInfo> list, IOnExtractVideoFrameAPI.IExtractVideoCallback aVar) {
            Intrinsics.checkParameterIsNotNull(list, "videoInfos");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            this.f104328a.mo147828q().mo122036a(list).observeOn(LarkRxSchedulers.io()).subscribe(new C40999a(aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$uploadPhotoAPI$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI;", "doUpload", "", "photos", "", "", "isKeepOriginPic", "", "callback", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI$IUploadCallback;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$p */
    public static final class C41019p implements IOnUploadPhotoAPI {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104371a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$uploadPhotoAPI$1$doUpload$1", "Lcom/ss/android/lark/utils/rxjava/ReportErrorObserver;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "error", "", "throwable", "", "onComplete", "onNext", "t", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$p$a */
        public static final class C41020a extends AbstractC57864b<IPhotoDependency.Image> {

            /* renamed from: a */
            final /* synthetic */ C41019p f104372a;

            /* renamed from: b */
            final /* synthetic */ IOnUploadPhotoAPI.IUploadCallback f104373b;

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b, io.reactivex.AbstractC69009q
            public void onComplete() {
                this.f104373b.mo147836a();
            }

            /* renamed from: a */
            public void onNext(IPhotoDependency.Image image) {
                Intrinsics.checkParameterIsNotNull(image, "t");
                this.f104373b.mo147838a(image);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                String str;
                boolean z = th instanceof ErrorResult;
                if (z) {
                    ErrorResult errorResult = (ErrorResult) th;
                    if (errorResult.getErrorCode() == this.f104372a.f104371a.f104314b) {
                        this.f104373b.mo147837a(errorResult);
                        return;
                    }
                    IOnUploadPhotoAPI.IUploadCallback aVar = this.f104373b;
                    if (z) {
                        str = errorResult.getDisplayMsg();
                    } else {
                        str = th.getMessage();
                    }
                    aVar.mo147837a(new ErrorResult(str));
                    return;
                }
                this.f104373b.mo147837a(this.f104372a.f104371a.mo147799a(th, this.f104372a.f104371a.f104314b));
            }

            C41020a(C41019p pVar, IOnUploadPhotoAPI.IUploadCallback aVar) {
                this.f104372a = pVar;
                this.f104373b = aVar;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41019p(PhotoKBPlugin bVar) {
            this.f104371a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI
        /* renamed from: a */
        public void mo147835a(List<String> list, boolean z, IOnUploadPhotoAPI.IUploadCallback aVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            this.f104371a.mo147828q().mo122037a(list, z, aVar).observeOn(AndroidSchedulers.mainThread()).subscribe(new C41020a(this, aVar));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$onCreatePluginPanel$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/LarkPhotoPickerView$OnFuncPickListener;", "getMultiPickListener", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/LarkPhotoPickerView$OnFuncPickListener$PhotoMultiPickListener;", "onAlbumSelected", "", "param", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoPickerParam;", "onCameraSelected", "onPreviewSelected", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoPreviewPickerParam;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$m */
    public static final class C41009m implements LarkPhotoPickerView.AbstractC40987a {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104359a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a
        /* renamed from: b */
        public LarkPhotoPickerView.AbstractC40987a.AbstractC40988a mo147722b() {
            return new C41010a(this);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a
        /* renamed from: a */
        public void mo147719a() {
            this.f104359a.mo147807a(new C41012c(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$onCreatePluginPanel$1$onCameraSelected$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$ICameraAvailablityCallback;", "onAvailable", "", "onUnavailable", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$m$c */
        public static final class C41012c implements ICameraAvailablityCallback {

            /* renamed from: a */
            final /* synthetic */ C41009m f104361a;

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.ICameraAvailablityCallback
            /* renamed from: b */
            public void mo147830b() {
                LKUIToast.show(this.f104361a.f104359a.mo147824m().mo147365B(), UIHelper.getString(R.string.Lark_Chat_CameraOccupy));
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.ICameraAvailablityCallback
            /* renamed from: a */
            public void mo147829a() {
                this.f104361a.f104359a.mo147824m().mo147380y();
                C58557a.m227128a(PickerParams.f144865a.mo198927a(new C41013a(this.f104361a.f104359a.mo147822f()))).mo198510a(this.f104361a.f104359a.mo147824m().mo147365B(), 233);
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$m$c$a */
            static final class C41013a extends Lambda implements Function1<PickerParams.Builder, Unit> {
                final /* synthetic */ boolean $showVideo;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C41013a(boolean z) {
                    super(1);
                    this.$showVideo = z;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(PickerParams.Builder aVar) {
                    invoke(aVar);
                    return Unit.INSTANCE;
                }

                public final void invoke(PickerParams.Builder aVar) {
                    int i;
                    Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                    if (this.$showVideo) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                    aVar.mo198890b(i);
                    aVar.mo198884a(1);
                }
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C41012c(C41009m mVar) {
                this.f104361a = mVar;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J \u0010\b\u001a\u00020\u00032\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$onCreatePluginPanel$1$getMultiPickListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/LarkPhotoPickerView$OnFuncPickListener$PhotoMultiPickListener;", "onCheckError", "", "reason", "", "onSelectOverFlow", "maxCount", "onSendPhoto", "photos", "", "Lcom/ss/android/lark/widget/photo_picker/entity/Photo;", "isKeepOriginPhoto", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$m$a */
        public static final class C41010a implements LarkPhotoPickerView.AbstractC40987a.AbstractC40988a {

            /* renamed from: a */
            final /* synthetic */ C41009m f104360a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C41010a(C41009m mVar) {
                this.f104360a = mVar;
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a.AbstractC40988a
            /* renamed from: a */
            public void mo147723a(int i) {
                this.f104360a.f104359a.mo147801a(i);
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a.AbstractC40988a
            /* renamed from: b */
            public void mo147725b(int i) {
                LKUIToast.show(this.f104360a.f104359a.mo147824m().mo147365B(), UIHelper.getString(i));
            }

            @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a.AbstractC40988a
            /* renamed from: a */
            public void mo147724a(List<Photo> list, boolean z) {
                this.f104360a.f104359a.mo147811a(list, z);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/ss/android/lark/widget/photo_picker/PickerParams$Builder;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$m$b */
        static final class C41011b extends Lambda implements Function1<PickerParams.Builder, Unit> {
            final /* synthetic */ PhotoPickerParam $param;
            final /* synthetic */ C41009m this$0;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C41011b(C41009m mVar, PhotoPickerParam photoPickerParam) {
                super(1);
                this.this$0 = mVar;
                this.$param = photoPickerParam;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(PickerParams.Builder aVar) {
                invoke(aVar);
                return Unit.INSTANCE;
            }

            public final void invoke(PickerParams.Builder aVar) {
                int i;
                Scene scene;
                Intrinsics.checkParameterIsNotNull(aVar, "$receiver");
                aVar.mo198893c(this.$param.getPhotoCount());
                aVar.mo198896d(this.$param.getTotalCount());
                int i2 = 0;
                if (!this.$param.isShowVideo()) {
                    i = 0;
                } else if (!this.this$0.f104359a.f104315c || this.this$0.f104359a.mo147823l()) {
                    i = 3;
                } else {
                    i = 2;
                }
                aVar.mo198890b(i);
                aVar.mo198884a(0);
                if (this.$param.isSend()) {
                    i2 = 1;
                }
                aVar.mo198908h(i2);
                aVar.mo198902f(true);
                aVar.mo198909h(this.$param.isPreviewEnabled());
                aVar.mo198905g(this.$param.isKeepOrigin());
                aVar.mo198899e(!this.$param.isShowGif());
                aVar.mo198887a(new ArrayList<>(this.$param.getImagesUri()));
                aVar.mo198888a(this.$param.isTotalHasVideo());
                aVar.mo198891b(this.$param.isSingleShowSelector());
                aVar.mo198894c(this.$param.isToastTotalMaxCount());
                if (this.this$0.f104359a.mo147824m().mo147372b() == KeyboardScene.ChatMain) {
                    scene = Scene.Chat;
                } else {
                    scene = Scene.Thread;
                }
                aVar.mo198886a(scene);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C41009m(PhotoKBPlugin bVar) {
            this.f104359a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a
        /* renamed from: a */
        public void mo147720a(PhotoPickerParam photoPickerParam) {
            if (photoPickerParam != null) {
                PerfGalleryLoadMonitor.f145397a.mo199287a(Scene.Chat, 2);
                C58557a.C58559a a = C58557a.m227128a(PickerParams.f144865a.mo198927a(new C41011b(this, photoPickerParam)));
                IPhotoDependency q = this.f104359a.mo147828q();
                Intrinsics.checkExpressionValueIsNotNull(a, "builder");
                q.mo122038a(a);
            }
            PhotoKBPluginHitPoint.f104276a.mo147736a();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView.AbstractC40987a
        /* renamed from: a */
        public void mo147721a(PhotoPreviewPickerParam photoPreviewPickerParam) {
            if (photoPreviewPickerParam != null) {
                C58633e.C58634a d = new C58633e.C58634a().mo198691a(new ArrayList<>(photoPreviewPickerParam.getPhotos())).mo198689a(photoPreviewPickerParam.getCurrentPosition()).mo198690a(photoPreviewPickerParam.getSourceView()).mo198692a(photoPreviewPickerParam.isShowDeleteButton()).mo198697b(photoPreviewPickerParam.isKeepOrigin()).mo198695b(photoPreviewPickerParam.getPhotoCount()).mo198696b(new ArrayList<>(photoPreviewPickerParam.getSelectedPhotoPaths())).mo198702e(photoPreviewPickerParam.isSendMode()).mo198700d(photoPreviewPickerParam.getMediaType()).mo198701d(photoPreviewPickerParam.isUseTransitionAnim());
                IPhotoDependency q = this.f104359a.mo147828q();
                Intrinsics.checkExpressionValueIsNotNull(d, "builder");
                q.mo122039a(d);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
        LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
        if (larkPhotoPickerView != null) {
            larkPhotoPickerView.mo147689b();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    /* renamed from: o */
    public final void mo147826o() {
        LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
        if (larkPhotoPickerView != null) {
            larkPhotoPickerView.mo147692d();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$onVideoExtract$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnExtractVideoFrameAPI$IExtractVideoCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "ret", "", "", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$FrameInfo;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$n */
    public static final class C41014n implements IOnExtractVideoFrameAPI.IExtractVideoCallback {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104362a;

        /* renamed from: b */
        final /* synthetic */ List f104363b;

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnExtractVideoFrameAPI.IExtractVideoCallback
        /* renamed from: a */
        public void mo147832a() {
            UICallbackExecutor.execute(new RunnableC41016b(this));
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$n$b */
        static final class RunnableC41016b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41014n f104366a;

            RunnableC41016b(C41014n nVar) {
                this.f104366a = nVar;
            }

            public final void run() {
                this.f104366a.f104362a.mo147824m().mo147375j();
                this.f104366a.f104362a.mo147818c().dismiss();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$n$a */
        static final class RunnableC41015a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41014n f104364a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f104365b;

            RunnableC41015a(C41014n nVar, ErrorResult errorResult) {
                this.f104364a = nVar;
                this.f104365b = errorResult;
            }

            public final void run() {
                LKUIToast.show(this.f104364a.f104362a.mo147824m().mo147365B(), this.f104365b.getDisplayMsg());
                this.f104364a.f104362a.mo147818c().dismiss();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$n$c */
        static final class RunnableC41017c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41014n f104367a;

            /* renamed from: b */
            final /* synthetic */ Map f104368b;

            RunnableC41017c(C41014n nVar, Map map) {
                this.f104367a = nVar;
                this.f104368b = map;
            }

            public final void run() {
                for (IPhotoDependency.VideoInfo videoInfo : this.f104367a.f104363b) {
                    IPhotoDependency.FrameInfo frameInfo = (IPhotoDependency.FrameInfo) this.f104368b.get(videoInfo.getPath());
                    if (frameInfo == null || TextUtils.isEmpty(frameInfo.getPath())) {
                        Log.m165382e("get first frame failed：" + videoInfo.getPath());
                    } else {
                        this.f104367a.f104362a.mo147806a(videoInfo, frameInfo);
                    }
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnExtractVideoFrameAPI.IExtractVideoCallback
        /* renamed from: a */
        public void mo147833a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC41015a(this, errorResult));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnExtractVideoFrameAPI.IExtractVideoCallback
        /* renamed from: a */
        public void mo147834a(Map<String, IPhotoDependency.FrameInfo> map) {
            Intrinsics.checkParameterIsNotNull(map, "ret");
            UICallbackExecutor.execute(new RunnableC41017c(this, map));
        }

        C41014n(PhotoKBPlugin bVar, List list) {
            this.f104362a = bVar;
            this.f104363b = list;
        }
    }

    /* renamed from: r */
    private final boolean mo166338r() {
        return C40682g.m160850a().mo133171a("lark.android.simple.judge.camera");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo147797a() {
        View view = this.f104313a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return view;
    }

    /* renamed from: m */
    public final IKeyBoardPlugin.IKeyBoardContext mo147824m() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$insertPhotoToInput$1", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$IOnUploadPhotoAPI$IUploadCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onUpdateProgress", "total", "", "curPos", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$j */
    public static final class C41003j implements IOnUploadPhotoAPI.IUploadCallback {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104343a;

        /* renamed from: b */
        final /* synthetic */ String f104344b;

        /* renamed from: c */
        final /* synthetic */ boolean f104345c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$j$b */
        static final class RunnableC41005b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41003j f104348a;

            RunnableC41005b(C41003j jVar) {
                this.f104348a = jVar;
            }

            public final void run() {
                this.f104348a.f104343a.mo147824m().mo147375j();
                this.f104348a.f104343a.mo147818c().dismiss();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147836a() {
            UICallbackExecutor.execute(new RunnableC41005b(this));
            PerfLog.end("upload_image", this.f104344b, "");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$j$c */
        static final class RunnableC41006c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41003j f104349a;

            /* renamed from: b */
            final /* synthetic */ IPhotoDependency.Image f104350b;

            RunnableC41006c(C41003j jVar, IPhotoDependency.Image image) {
                this.f104349a = jVar;
                this.f104350b = image;
            }

            public final void run() {
                this.f104349a.f104343a.mo147805a(this.f104350b, this.f104349a.f104345c);
                PerfImageUploadMonitor cVar = PerfImageUploadMonitor.f145430a;
                PerfImageUploadMonitor.m228143a(cVar, this.f104350b.getWidth(), this.f104350b.getHeight(), 0, 4, (Object) null);
                PerfImageUploadMonitor.m228145b(cVar, this.f104350b.getWidth(), this.f104350b.getHeight(), 0, 4, null);
                cVar.mo199309a();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$j$a */
        static final class RunnableC41004a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41003j f104346a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f104347b;

            RunnableC41004a(C41003j jVar, ErrorResult errorResult) {
                this.f104346a = jVar;
                this.f104347b = errorResult;
            }

            public final void run() {
                if (this.f104347b.getErrorCode() == this.f104346a.f104343a.f104314b) {
                    C40682g.m160850a().mo133167a(this.f104346a.f104343a.mo147824m().mo147365B(), this.f104347b.getDisplayMsg());
                } else {
                    if (!TextUtils.isEmpty(this.f104347b.getDisplayMsg())) {
                        LKUIToast.show(this.f104346a.f104343a.mo147824m().mo147365B(), this.f104347b.getDisplayMsg());
                    } else {
                        LKUIToast.show(this.f104346a.f104343a.mo147824m().mo147365B(), (int) R.string.Lark_Legacy_FailedToUploadTheImage);
                    }
                    this.f104346a.f104343a.mo147824m().mo147375j();
                }
                this.f104346a.f104343a.mo147818c().dismiss();
                PerfImageUploadMonitor.f145430a.mo199315b();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147837a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC41004a(this, errorResult));
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147838a(IPhotoDependency.Image image) {
            Intrinsics.checkParameterIsNotNull(image, "image");
            UICallbackExecutor.execute(new RunnableC41006c(this, image));
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public void onUpdateProgress(long j, int i) {
            if (i == 0) {
                PerfLog.start("get_image_data_single", this.f104344b, "");
            } else if (i == 30) {
                PerfLog.end("get_image_data_single", this.f104344b, "");
            }
        }

        C41003j(PhotoKBPlugin bVar, String str, boolean z) {
            this.f104343a = bVar;
            this.f104344b = str;
            this.f104345c = z;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$getSendFileTip$1", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/SendFileTip;", "onSendFile", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$h */
    public static final class C41001h extends SendFileTip {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104333a;

        /* renamed from: b */
        final /* synthetic */ List f104334b;

        /* renamed from: c */
        final /* synthetic */ List f104335c;

        /* renamed from: d */
        final /* synthetic */ boolean f104336d;

        /* renamed from: e */
        final /* synthetic */ VideoSendChecker.Result f104337e;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.keyboard.plugin.tool.checker.SendFileTip
        /* renamed from: c */
        public void mo147430c() {
            Log.m165389i("PhotoKBPlugin", "send image and valid video, invalid video will be sent as file");
            this.f104333a.mo147810a(this.f104334b, this.f104335c, this.f104336d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41001h(PhotoKBPlugin bVar, List list, List list2, boolean z, VideoSendChecker.Result result, VideoSendChecker.Result result2) {
            super(result2);
            this.f104333a = bVar;
            this.f104334b = list;
            this.f104335c = list2;
            this.f104336d = z;
            this.f104337e = result;
        }
    }

    /* renamed from: s */
    private final void m162513s() {
        boolean l = mo147823l();
        LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
        if (larkPhotoPickerView != null) {
            larkPhotoPickerView.setIsInPostMode(l);
        }
        LarkPhotoPickerView larkPhotoPickerView2 = this.f104317f;
        if (larkPhotoPickerView2 != null) {
            larkPhotoPickerView2.setEnablePostSendVideo(this.f104327p.mo122042a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo147822f() {
        if (!mo147823l() || this.f104327p.mo122042a()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        View view = this.f104313a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        m162513s();
        LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
        if (larkPhotoPickerView != null) {
            larkPhotoPickerView.mo147691c();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        View view = this.f104313a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(false);
        LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
        if (larkPhotoPickerView != null) {
            larkPhotoPickerView.mo147692d();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        LarkPhotoPickerView larkPhotoPickerView;
        View view = this.f104313a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        m162513s();
        LarkPhotoPickerView larkPhotoPickerView2 = this.f104317f;
        if (larkPhotoPickerView2 != null) {
            larkPhotoPickerView2.mo147694f();
        }
        LarkPhotoPickerView larkPhotoPickerView3 = this.f104317f;
        if (larkPhotoPickerView3 != null && !larkPhotoPickerView3.mo147687a() && (larkPhotoPickerView = this.f104317f) != null) {
            larkPhotoPickerView.mo147691c();
        }
    }

    /* renamed from: l */
    public final boolean mo147823l() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        if (bVar.mo147381z().mo146905m() != IOutInputSupport.InputSupportType.POSTINPUT) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            if (bVar2.mo147381z().mo146905m() == IOutInputSupport.InputSupportType.THREADPOSTINPUT) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0014¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$getToastTip$1", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/ToastTip;", "onToast", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$i */
    public static final class C41002i extends ToastTip {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104338a;

        /* renamed from: b */
        final /* synthetic */ List f104339b;

        /* renamed from: c */
        final /* synthetic */ List f104340c;

        /* renamed from: d */
        final /* synthetic */ boolean f104341d;

        /* renamed from: e */
        final /* synthetic */ VideoSendChecker.Result f104342e;

        /* access modifiers changed from: protected */
        @Override // com.ss.android.lark.keyboard.plugin.tool.checker.ToastTip
        /* renamed from: b */
        public void mo147433b() {
            Log.m165389i("PhotoKBPlugin", "only send image and valid video");
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.f104339b) {
                if (!this.f104340c.contains(((Photo) obj).getPath())) {
                    arrayList.add(obj);
                }
            }
            this.f104338a.mo147810a(CollectionsKt.toMutableList((Collection) arrayList), (List<String>) null, this.f104341d);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41002i(PhotoKBPlugin bVar, List list, List list2, boolean z, VideoSendChecker.Result result, VideoSendChecker.Result result2) {
            super(result2);
            this.f104338a = bVar;
            this.f104339b = list;
            this.f104340c = list2;
            this.f104341d = z;
            this.f104342e = result;
        }
    }

    /* renamed from: n */
    public final void mo147825n() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(KeyboardHitPointExtraParams.Click.IMAGE_SELECT.plus(KeyboardHitPointExtraParams.Target.IM_CHAT_IMAGE_SEND_VIEW).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())), C40683h.m160856f(b)));
        }
    }

    /* renamed from: f */
    public final void mo147821f(boolean z) {
        this.f104323l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo147802a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "<set-?>");
        this.f104313a = view;
    }

    /* renamed from: b */
    public final void mo147816b(int i) {
        LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
        if (larkPhotoPickerView != null) {
            larkPhotoPickerView.setMaxCount(i);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$onCreateIcon$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$l */
    static final class View$OnClickListenerC41008l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104357a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f104358b;

        View$OnClickListenerC41008l(PhotoKBPlugin bVar, IKeyBoardPlugin.ITouchActionNotifier dVar) {
            this.f104357a = bVar;
            this.f104358b = dVar;
        }

        public final void onClick(View view) {
            PhotoKBPluginHitPoint.f104276a.mo147737b();
            PerfGalleryLoadMonitor.f145397a.mo199287a(Scene.Chat, 1);
            this.f104357a.mo147804a(this.f104358b);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "permissionGranted"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$o */
    public static final class C41018o implements C57805b.AbstractC57809a {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104369a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f104370b;

        C41018o(PhotoKBPlugin bVar, IKeyBoardPlugin.ITouchActionNotifier dVar) {
            this.f104369a = bVar;
            this.f104370b = dVar;
        }

        @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
        public final void permissionGranted(boolean z) {
            if (z) {
                IKeyBoardPlugin.IPluginClickListener d = this.f104369a.mo147819d();
                if (d != null) {
                    d.mo122033a();
                }
                this.f104369a.mo147825n();
                this.f104369a.mo147817b(this.f104370b);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo147798a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        AppCompatImageView a = C40679d.m160786a(context, R.id.toolbox_btn_picture, R.drawable.ud_icon_image_outlined);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…e.ud_icon_image_outlined)");
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$isCameraCanUse$1", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "onCameraAvailable", "", "cameraId", "", "onCameraUnavailable", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$k */
    public static final class C41007k extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104351a;

        /* renamed from: b */
        final /* synthetic */ Ref.BooleanRef f104352b;

        /* renamed from: c */
        final /* synthetic */ Ref.BooleanRef f104353c;

        /* renamed from: d */
        final /* synthetic */ Ref.IntRef f104354d;

        /* renamed from: e */
        final /* synthetic */ CameraManager f104355e;

        /* renamed from: f */
        final /* synthetic */ ICameraAvailablityCallback f104356f;

        public void onCameraUnavailable(String str) {
            Intrinsics.checkParameterIsNotNull(str, "cameraId");
            Ref.IntRef intRef = this.f104354d;
            intRef.element--;
            if (this.f104354d.element == 0) {
                this.f104355e.unregisterAvailabilityCallback(this);
                Log.m165389i("PhotoKBPlugin", "facingFrontCameraAvailable = " + this.f104352b.element + " ,facingBackCameraAvailable = " + this.f104353c.element + ' ');
                if (this.f104351a.mo147813a(this.f104353c.element, this.f104352b.element)) {
                    this.f104356f.mo147829a();
                } else {
                    this.f104356f.mo147830b();
                }
            }
        }

        public void onCameraAvailable(String str) {
            Intrinsics.checkParameterIsNotNull(str, "cameraId");
            if (Intrinsics.areEqual(str, String.valueOf(0))) {
                this.f104352b.element = true;
            } else if (Intrinsics.areEqual(str, String.valueOf(1))) {
                this.f104353c.element = true;
            }
            Ref.IntRef intRef = this.f104354d;
            intRef.element--;
            if (this.f104354d.element == 0) {
                this.f104355e.unregisterAvailabilityCallback(this);
                Log.m165389i("PhotoKBPlugin", "facingFrontCameraAvailable = " + this.f104352b.element + " ,facingBackCameraAvailable = " + this.f104353c.element + ' ');
                if (this.f104351a.mo147813a(this.f104353c.element, this.f104352b.element)) {
                    this.f104356f.mo147829a();
                } else {
                    this.f104356f.mo147830b();
                }
            }
        }

        C41007k(PhotoKBPlugin bVar, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, Ref.IntRef intRef, CameraManager cameraManager, ICameraAvailablityCallback bVar2) {
            this.f104351a = bVar;
            this.f104352b = booleanRef;
            this.f104353c = booleanRef2;
            this.f104354d = intRef;
            this.f104355e = cameraManager;
            this.f104356f = bVar2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo147817b(IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        if (DesktopUtil.m144301a((Context) bVar.mo147365B())) {
            C58557a.C58559a a = new C58557a.C58559a().mo198506a(9).mo198526i(false).mo198524g(true).mo198532o(!mo147823l()).mo198525h(!mo147823l()).mo198529l(true).mo198528k(false).mo198533p(true).mo198508a(new ArrayList<>());
            IPhotoDependency iPhotoDependency = this.f104327p;
            Intrinsics.checkExpressionValueIsNotNull(a, "builder");
            iPhotoDependency.mo122038a(a);
            return;
        }
        dVar.mo147313a(this);
    }

    /* renamed from: a */
    private final void m162506a(IParam cVar) {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            KeyboardHitPointExtraParams.Click click = KeyboardHitPointExtraParams.Click.IMAGE_MEDIA_INSERT;
            KeyboardHitPointExtraParams.Target target = KeyboardHitPointExtraParams.Target.NONE;
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(click.plus(target).plus(KeyboardHitPointExtraParams.IsFullScreen.TRUE).plus(cVar), C40683h.m160856f(b)));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        View inflate = LayoutInflater.from(bVar.mo147365B()).inflate(R.layout.kb_plugin_photo, viewGroup, false);
        if (inflate != null) {
            LarkPhotoPickerView larkPhotoPickerView = (LarkPhotoPickerView) inflate;
            this.f104317f = larkPhotoPickerView;
            if (larkPhotoPickerView == null) {
                Intrinsics.throwNpe();
            }
            larkPhotoPickerView.setShowGif(true);
            larkPhotoPickerView.setShowVideo(this.f104327p.mo122044b());
            larkPhotoPickerView.setPhotoPickerListener(new C41009m(this));
            return this.f104317f;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.tool.photo.LarkPhotoPickerView");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final VideoSendChecker.Callback mo147814b(List<Photo> list, boolean z) {
        Intrinsics.checkParameterIsNotNull(list, "photos");
        C41000g gVar = new C41000g(this, list, z);
        this.f104322k = gVar;
        if (gVar == null) {
            Intrinsics.throwNpe();
        }
        return gVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        View a = mo147798a(bVar.mo147365B());
        a.setActivated(this.f104325n);
        a.setOnClickListener(new View$OnClickListenerC41008l(this, dVar));
        this.f104313a = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return a;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/photo/PhotoKBPlugin$getCheckCallback$1", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Callback;", "onResult", "", "result", "Lcom/ss/android/lark/keyboard/plugin/tool/checker/VideoSendChecker$Result;", "invalidList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.photo.b$g */
    public static final class C41000g implements VideoSendChecker.Callback {

        /* renamed from: a */
        final /* synthetic */ PhotoKBPlugin f104330a;

        /* renamed from: b */
        final /* synthetic */ List f104331b;

        /* renamed from: c */
        final /* synthetic */ boolean f104332c;

        @Override // com.ss.android.lark.keyboard.plugin.tool.checker.VideoSendChecker.Callback
        /* renamed from: a */
        public void mo147418a(VideoSendChecker.Result result, ArrayList<String> arrayList) {
            Intrinsics.checkParameterIsNotNull(result, "result");
            Intrinsics.checkParameterIsNotNull(arrayList, "invalidList");
            if (result == VideoSendChecker.Result.VALID) {
                Log.m165389i("PhotoKBPlugin", "all videos are valid");
                this.f104330a.mo147810a(this.f104331b, (List<String>) null, this.f104332c);
                return;
            }
            Log.m165389i("PhotoKBPlugin", "some videos are invalid, result: " + result);
            this.f104330a.mo147800a(this.f104331b, this.f104332c, result, arrayList).mo147425a();
        }

        C41000g(PhotoKBPlugin bVar, List list, boolean z) {
            this.f104330a = bVar;
            this.f104331b = list;
            this.f104332c = z;
        }
    }

    /* renamed from: c */
    private final void mo166337c(List<Photo> list, boolean z) {
        if (!CollectionUtils.isEmpty(list)) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            EditText l = bVar.mo147381z().mo146904l();
            if (!(l instanceof RichTextEmojiconEditText) || !CollectionUtils.isNotEmpty(C59031e.m229183b(((RichTextEmojiconEditText) l).getRichText()))) {
                m162506a(KeyboardHitPointExtraParams.InsertType.MEDIA);
                m162511d(list, z);
                return;
            }
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104316d;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            LKUIToast.show(bVar2.mo147365B(), (int) R.string.Lark_Chat_TopicCreateSelectVideoError);
        }
    }

    /* renamed from: d */
    private final void m162511d(List<Photo> list, boolean z) {
        OnPhotoInsertListener eVar = this.f104324m;
        if (eVar != null) {
            eVar.mo147796a(list);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            String a = ao.m224300a(bVar.mo147365B(), t.getPath(), Boolean.valueOf(z));
            String path = t.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "photo.path");
            Intrinsics.checkExpressionValueIsNotNull(a, "compressPath");
            String mimeType = t.getMimeType();
            Intrinsics.checkExpressionValueIsNotNull(mimeType, "photo.mimeType");
            arrayList.add(new IPhotoDependency.VideoInfo(path, a, mimeType, t.getSize(), t.getDuration()));
        }
        mo147809a(arrayList, list);
    }

    /* renamed from: a */
    public final ErrorResult mo147799a(Throwable th, int i) {
        String str;
        if (th != null && (th instanceof CompositeException)) {
            for (Throwable th2 : ((CompositeException) th).getExceptions()) {
                if (th2 instanceof ErrorResult) {
                    ErrorResult errorResult = (ErrorResult) th2;
                    if (errorResult.getErrorCode() == i) {
                        return errorResult;
                    }
                }
            }
        }
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        return new ErrorResult(str);
    }

    public PhotoKBPlugin(boolean z, boolean z2, IPhotoDependency iPhotoDependency) {
        Intrinsics.checkParameterIsNotNull(iPhotoDependency, "dependency");
        this.f104325n = z;
        this.f104326o = z2;
        this.f104327p = iPhotoDependency;
    }

    /* renamed from: a */
    private final void m162505a(int i, int i2, Intent intent) {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        if (!DesktopUtil.m144301a((Context) bVar.mo147365B())) {
            LarkPhotoPickerView larkPhotoPickerView = this.f104317f;
            if (larkPhotoPickerView != null) {
                larkPhotoPickerView.mo147682a(i, i2, intent);
            }
        } else if (i == 233) {
            boolean booleanExtra = intent.getBooleanExtra("KEY_FOR_SEND", false);
            boolean booleanExtra2 = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
            Serializable serializableExtra = intent.getSerializableExtra("KEY_SELECTED_MEDIA");
            if (serializableExtra != null) {
                ArrayList arrayList = (ArrayList) serializableExtra;
                if (booleanExtra) {
                    mo147811a(arrayList, booleanExtra2);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.ss.android.lark.widget.photo_picker.entity.Photo>");
        }
    }

    /* renamed from: a */
    private final void m162507a(Photo photo, List<String> list, boolean z) {
        if (list == null || !list.contains(photo.getPath())) {
            ArrayList arrayList = new ArrayList();
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104316d;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
            }
            String a = ao.m224300a(bVar.mo147365B(), photo.getPath(), Boolean.valueOf(z));
            String path = photo.getPath();
            Intrinsics.checkExpressionValueIsNotNull(path, "video.path");
            Intrinsics.checkExpressionValueIsNotNull(a, "compressPath");
            String mimeType = photo.getMimeType();
            Intrinsics.checkExpressionValueIsNotNull(mimeType, "video.mimeType");
            arrayList.add(new IPhotoDependency.VideoInfo(path, a, mimeType, photo.getSize(), photo.getDuration()));
            this.f104327p.mo122043b(arrayList);
            return;
        }
        ArrayList<File> arrayList2 = new ArrayList<>();
        arrayList2.add(new File(photo.getPath()));
        this.f104327p.mo122040a(arrayList2);
    }

    /* renamed from: b */
    private final ToastTip m162508b(List<Photo> list, boolean z, VideoSendChecker.Result result, List<String> list2) {
        return new C41002i(this, list, list2, z, result, result);
    }

    /* renamed from: c */
    private final SendFileTip m162509c(List<Photo> list, boolean z, VideoSendChecker.Result result, List<String> list2) {
        return new C41001h(this, list, list2, z, result, result);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbsInvalidTip mo147800a(List<Photo> list, boolean z, VideoSendChecker.Result result, List<String> list2) {
        Intrinsics.checkParameterIsNotNull(list, "photos");
        Intrinsics.checkParameterIsNotNull(result, "result");
        Intrinsics.checkParameterIsNotNull(list2, "invalidList");
        if (mo147823l()) {
            return m162508b(list, z, result, list2);
        }
        return m162509c(list, z, result, list2);
    }
}
