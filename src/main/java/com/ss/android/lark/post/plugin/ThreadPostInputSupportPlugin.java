package com.ss.android.lark.post.plugin;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.utils.C34336c;
import com.ss.android.lark.dependency.AbstractC36474h;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.C40727b;
import com.ss.android.lark.keyboard.plugin.input.GetUrlInlineFromCallback;
import com.ss.android.lark.keyboard.plugin.input.IInputContext;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.aa.AaStyleKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.CommonTitleBar;
import com.ss.android.lark.ui.CommonTitleBarConstants;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.AbstractC57864b;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.drag.DragDropController;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout;
import com.ss.android.lark.widget.span.UrlImageSpan;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u00105\u001a\u000206H\u0016J\n\u00107\u001a\u0004\u0018\u000108H\u0016J\u0006\u00109\u001a\u00020:J\b\u0010;\u001a\u000206H\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u000206H\u0016J\u0006\u0010?\u001a\u00020@J\b\u0010A\u001a\u00020@H\u0002J\u0012\u0010B\u001a\u00020@2\b\u0010C\u001a\u0004\u0018\u00010\u0007H\u0002J\u0006\u0010D\u001a\u00020@J\b\u0010E\u001a\u00020\u000bH\u0016J\b\u0010F\u001a\u00020\u000bH\u0002J\u0010\u0010G\u001a\u00020@2\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020(2\u0006\u0010K\u001a\u00020LH\u0016J\u0018\u0010M\u001a\u00020(2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010K\u001a\u00020LH\u0016J\b\u0010O\u001a\u00020@H\u0016J\u0010\u0010P\u001a\u00020@2\u0006\u0010Q\u001a\u00020\u000bH\u0016J\b\u0010R\u001a\u00020@H\u0016J\u0018\u0010S\u001a\u00020(2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010T\u001a\u00020(H\u0016J\u0012\u0010U\u001a\u00020@2\b\u0010V\u001a\u0004\u0018\u00010IH\u0016J\b\u0010W\u001a\u00020IH\u0016J\u0010\u0010X\u001a\u00020@2\u0006\u0010Y\u001a\u00020\u000bH\u0002J\u0018\u0010Z\u001a\u00020@2\u0006\u0010[\u001a\u00020I2\u0006\u0010\\\u001a\u00020\u000bH\u0016J\b\u0010]\u001a\u00020@H\u0016J\u000e\u0010^\u001a\u00020@2\u0006\u0010_\u001a\u00020\u0007J\u000e\u0010`\u001a\u00020@2\u0006\u0010_\u001a\u00020\u0007J\b\u0010a\u001a\u00020@H\u0002J\u000e\u0010b\u001a\u00020@2\u0006\u0010c\u001a\u00020\u001cJ\u000e\u0010d\u001a\u00020@2\u0006\u0010e\u001a\u00020\u000bJ\u0010\u0010f\u001a\u00020@2\u0006\u0010\b\u001a\u00020\tH\u0016J\u000e\u0010g\u001a\u00020@2\u0006\u0010h\u001a\u00020\u000bJ\u000e\u0010i\u001a\u00020@2\u0006\u0010h\u001a\u00020\u000bJ\u000e\u0010j\u001a\u00020@2\u0006\u0010k\u001a\u00020 J\u0012\u0010l\u001a\u00020@2\b\u0010m\u001a\u0004\u0018\u00010:H\u0002J\u0012\u0010n\u001a\u00020@2\b\u0010o\u001a\u0004\u0018\u00010:H\u0002J\u000e\u0010p\u001a\u00020@2\u0006\u0010q\u001a\u00020-J\u0010\u0010r\u001a\u00020@2\u0006\u0010s\u001a\u000200H\u0016J\u0012\u0010t\u001a\u00020@2\b\u0010C\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010u\u001a\u00020@2\b\u0010q\u001a\u0004\u0018\u00010-J\u0010\u0010v\u001a\u00020@*\b\u0012\u0004\u0012\u00020\u00070wR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0004¢\u0006\u0002\n\u0000¨\u0006x"}, d2 = {"Lcom/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/BaseInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "IThreadInputDelegate", "Lcom/ss/android/lark/post/plugin/IThreadInputDelegate;", "(Lcom/ss/android/lark/post/plugin/IThreadInputDelegate;)V", "contentHint", "", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "interruptSend", "", "isHideToolMenuWhenHide", "isResume", "isShowAnimation", "isShowGroupContainer", "isSilent", "mActivity", "Landroid/app/Activity;", "mAdditionFuncContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mCurrET", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "mGroupAvatar", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView;", "mGroupContainer", "Landroid/widget/RelativeLayout;", "mGroupContainerDelegate", "Lcom/ss/android/lark/post/plugin/IGroupContainerDelegate;", "mGroupName", "Landroid/widget/TextView;", "mILifeCycleCallback", "Lcom/ss/android/lark/post/plugin/ILifeCycleCallback;", "mPopDrawerContainer", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout;", "mPostContentET", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText;", "mPostMsgEtContainer", "Landroid/widget/ScrollView;", "mRootView", "Landroid/view/View;", "mSelectArrow", "Landroid/widget/ImageView;", "mSelectLabel", "mSelectedGroup", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "mSendBtn", "mTextWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "mTitleBar", "Lcom/ss/android/lark/ui/CommonTitleBar;", "uploadPhotoAPI", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI;", "getAdditionDividerHeight", "", "getCurrET", "Landroid/widget/EditText;", "getCurrentContentText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getHeight", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "getLayoutId", "hideKeyAndPlugin", "", "initListener", "initPluginOnResume", "selectedPlugin", "initView", "isFullScreen", "isHasDraft", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onCreateSendBtn", "parent", "Landroid/view/ViewGroup;", "onCreateView", "activity", "onDestroy", "onEnableChanged", "isEnable", "onFinishReplyMode", "onInitView", "rootView", "onResume", "params", "onSaveDraft", "onSendBtnClicked", "triggerBySendButton", "onSetDraft", "draft", "append", "onStop", "setContentHint", "hintText", "setContentHintAfterInit", "setEditTextDisplay", "setGroupContainerDelegate", "delegate", "setHideToolMenuWhenHide", "isHide", "setInputSupportContext", "setIsShowEnterAnimation", "isShow", "setIsShowGroupContainer", "setLifeCycleCallback", "lifeCycleCallback", "setPostContentRichText", "richtext", "setPostContentRichTextSilent", "richText", "setSelectedGroup", "group", "setTextWatcher", "textWatcher", "startShowAnim", "updateGroupContainer", "uploadImage", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.post.a.d */
public final class ThreadPostInputSupportPlugin extends BaseInputSupportPlugin implements IInputSupportPlugin {

    /* renamed from: A */
    private boolean f129419A;

    /* renamed from: B */
    private Chat f129420B;

    /* renamed from: C */
    private final PostInputSupportPlugin.IOnUploadPhotoAPI f129421C = new C52178m(this);

    /* renamed from: b */
    public Activity f129422b;

    /* renamed from: c */
    public IInputContext f129423c;

    /* renamed from: d */
    public View f129424d;

    /* renamed from: e */
    public KeyboardRichTextEditText f129425e;

    /* renamed from: f */
    public View f129426f;

    /* renamed from: g */
    public boolean f129427g;

    /* renamed from: h */
    public boolean f129428h;

    /* renamed from: i */
    public RichTextEmojiconEditText f129429i;

    /* renamed from: j */
    public IKeyBoardPlugin.IKeyBoardContext.ITextWatcher f129430j;

    /* renamed from: k */
    public IGroupContainerDelegate f129431k;

    /* renamed from: l */
    public final IThreadInputDelegate f129432l;

    /* renamed from: m */
    private String f129433m;

    /* renamed from: n */
    private ScrollView f129434n;

    /* renamed from: o */
    private CommonTitleBar f129435o;

    /* renamed from: p */
    private RelativeLayout f129436p;

    /* renamed from: q */
    private LKUIRoundedImageView f129437q;

    /* renamed from: r */
    private TextView f129438r;

    /* renamed from: s */
    private ConstraintLayout f129439s;

    /* renamed from: t */
    private SlidingUpPanelLayout f129440t;

    /* renamed from: u */
    private TextView f129441u;

    /* renamed from: v */
    private ImageView f129442v;

    /* renamed from: w */
    private boolean f129443w;

    /* renamed from: x */
    private boolean f129444x;

    /* renamed from: y */
    private ILifeCycleCallback f129445y;

    /* renamed from: z */
    private boolean f129446z;

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147088b(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "replyData");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: h */
    public boolean mo146903h() {
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: i */
    public int mo147089i() {
        return R.layout.thread_post_kb_input;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: j */
    public void mo147090j() {
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: m */
    public IOutInputSupport.InputSupportType mo146905m() {
        return IOutInputSupport.InputSupportType.THREADPOSTINPUT;
    }

    /* renamed from: a */
    public final void mo178687a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "$this$uploadImage");
        List<String> a = DragDropController.m226108a(list);
        if (!a.isEmpty()) {
            String contextId = PerfLog.getContextId();
            PerfLog.start("upload_image", contextId, "");
            this.f129421C.mo147215a(a, true, new C52174l(this, contextId, true));
        }
    }

    /* renamed from: a */
    public final void mo178686a(String str) {
        if (str != null) {
            IInputContext eVar = this.f129423c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar.mo147119a(str);
            return;
        }
        Activity activity = this.f129422b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        KeyboardUtils.showKeyboard(activity);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147039a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
        this.f129430j = aVar;
    }

    /* renamed from: a */
    public final void mo178685a(IGroupContainerDelegate aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "delegate");
        this.f129431k = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$uploadPhotoAPI$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI;", "doUpload", "", "photos", "", "", "isKeepOriginPic", "", "callback", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI$IUploadCallback;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$m */
    public static final class C52178m implements PostInputSupportPlugin.IOnUploadPhotoAPI {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129468a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$uploadPhotoAPI$1$doUpload$1", "Lcom/ss/android/lark/utils/rxjava/ReportErrorObserver;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "error", "", "throwable", "", "onComplete", "onNext", "t", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.a.d$m$a */
        public static final class C52179a extends AbstractC57864b<IPhotoDependency.Image> {

            /* renamed from: a */
            final /* synthetic */ PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback f129469a;

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b, io.reactivex.AbstractC69009q
            public void onComplete() {
                this.f129469a.mo147216a();
            }

            C52179a(PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback aVar) {
                this.f129469a = aVar;
            }

            /* renamed from: a */
            public void onNext(IPhotoDependency.Image image) {
                Intrinsics.checkParameterIsNotNull(image, "t");
                this.f129469a.mo147218a(image);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                String str;
                PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback aVar = this.f129469a;
                if (th instanceof ErrorResult) {
                    str = ((ErrorResult) th).getDisplayMsg();
                } else if (th != null) {
                    str = th.getMessage();
                } else {
                    str = null;
                }
                aVar.mo147217a(new ErrorResult(str));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52178m(ThreadPostInputSupportPlugin dVar) {
            this.f129468a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI
        /* renamed from: a */
        public void mo147215a(List<String> list, boolean z, PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback aVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            this.f129468a.f129432l.mo178655a(list, z, aVar).observeOn(AndroidSchedulers.mainThread()).subscribe(new C52179a(aVar));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    public int mo147010b() {
        return UIHelper.dp2px(1.0f);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: l */
    public EditText mo146904l() {
        return this.f129429i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$uploadImage$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI$IUploadCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onUpdateProgress", "total", "", "curPos", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$l */
    public static final class C52174l implements PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129460a;

        /* renamed from: b */
        final /* synthetic */ String f129461b;

        /* renamed from: c */
        final /* synthetic */ boolean f129462c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.a.d$l$b */
        static final class RunnableC52176b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C52174l f129465a;

            RunnableC52176b(C52174l lVar) {
                this.f129465a = lVar;
            }

            public final void run() {
                ThreadPostInputSupportPlugin.m202403b(this.f129465a.f129460a).mo147124c();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147216a() {
            UICallbackExecutor.execute(new RunnableC52176b(this));
            PerfLog.end("upload_image", this.f129461b, "");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.a.d$l$a */
        static final class RunnableC52175a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C52174l f129463a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f129464b;

            RunnableC52175a(C52174l lVar, ErrorResult errorResult) {
                this.f129463a = lVar;
                this.f129464b = errorResult;
            }

            public final void run() {
                if (!TextUtils.isEmpty(this.f129464b.getDisplayMsg())) {
                    LKUIToast.show(ThreadPostInputSupportPlugin.m202406d(this.f129463a.f129460a), this.f129464b.getDisplayMsg());
                } else {
                    LKUIToast.show(ThreadPostInputSupportPlugin.m202406d(this.f129463a.f129460a), (int) R.string.Lark_Legacy_FailedToUploadTheImage);
                }
                ThreadPostInputSupportPlugin.m202403b(this.f129463a.f129460a).mo147124c();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.post.a.d$l$c */
        static final class RunnableC52177c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C52174l f129466a;

            /* renamed from: b */
            final /* synthetic */ IPhotoDependency.Image f129467b;

            RunnableC52177c(C52174l lVar, IPhotoDependency.Image image) {
                this.f129466a = lVar;
                this.f129467b = image;
            }

            public final void run() {
                List<String> urls = this.f129467b.getUrls();
                if (CollectionUtils.isNotEmpty(urls)) {
                    String str = urls.get(0);
                    ThreadPostInputSupportPlugin.m202401a(this.f129466a.f129460a).mo146912a(new UrlImageSpan(ThreadPostInputSupportPlugin.m202406d(this.f129466a.f129460a), str, ThreadPostInputSupportPlugin.m202401a(this.f129466a.f129460a), null, 8, null), str, ImageUtils.m224133a(str, this.f129467b.getWidth(), this.f129467b.getHeight()), this.f129467b.getToken(), this.f129467b.getWidth(), this.f129467b.getHeight(), true, this.f129466a.f129462c);
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147217a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC52175a(this, errorResult));
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147218a(IPhotoDependency.Image image) {
            Intrinsics.checkParameterIsNotNull(image, "image");
            UICallbackExecutor.execute(new RunnableC52177c(this, image));
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public void onUpdateProgress(long j, int i) {
            if (i == 0) {
                PerfLog.start("get_image_data_single", this.f129461b, "");
            } else if (i == 30) {
                PerfLog.end("get_image_data_single", this.f129461b, "");
            }
        }

        C52174l(ThreadPostInputSupportPlugin dVar, String str, boolean z) {
            this.f129460a = dVar;
            this.f129461b = str;
            this.f129462c = z;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: n */
    public int mo146906n() {
        View view = this.f129424d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view.getHeight();
    }

    /* renamed from: t */
    private final boolean m202411t() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        return !TextUtils.isEmpty(keyboardRichTextEditText.mo146908a(false));
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText.setText("");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: k */
    public TransationData mo147053k() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        RichText richText = keyboardRichTextEditText.getRichText();
        if (richText == null) {
            richText = C59029c.m229155a();
        }
        TransationData jVar = new TransationData();
        jVar.mo147176a("draft_post_reichtext", richText);
        return jVar;
    }

    /* renamed from: p */
    public final void mo178696p() {
        IInputContext eVar = this.f129423c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        eVar.mo147123b();
        if (this.f129444x) {
            IInputContext eVar2 = this.f129423c;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar2.mo147122a(new KClass[0]);
        }
    }

    /* renamed from: q */
    public final RichText mo178697q() {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        RichText richText = keyboardRichTextEditText.getRichText();
        Intrinsics.checkExpressionValueIsNotNull(richText, "mPostContentET.richText");
        return richText;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        this.f129427g = false;
        View view = this.f129424d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setVisibility(8);
        ILifeCycleCallback bVar = this.f129445y;
        if (bVar != null) {
            KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
            if (keyboardRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            bVar.mo178683a(keyboardRichTextEditText.getRichText());
        }
    }

    /* renamed from: r */
    private final void m202409r() {
        Activity activity = this.f129422b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        if (!DesktopUtil.m144301a((Context) activity)) {
            LKUIRoundedImageView lKUIRoundedImageView = this.f129437q;
            if (lKUIRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroupAvatar");
            }
            C25649b.m91853a(lKUIRoundedImageView, 20);
            TextView textView = this.f129438r;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroupName");
            }
            C25649b.m91857a(textView, LarkFont.BODY1);
            TextView textView2 = this.f129441u;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectLabel");
            }
            C25649b.m91857a(textView2, LarkFont.BODY1);
            ImageView imageView = this.f129442v;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectArrow");
            }
            C25649b.m91853a(imageView, 16);
            KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
            if (keyboardRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C25649b.m91857a(keyboardRichTextEditText, LarkFont.HEADLINE);
            KeyboardRichTextEditText keyboardRichTextEditText2 = this.f129425e;
            if (keyboardRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            Activity activity2 = this.f129422b;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            keyboardRichTextEditText2.setEmojiconSize((int) LKUIDisplayManager.m91865a(activity2, LarkFont.HEADLINE));
        }
    }

    /* renamed from: s */
    private final void m202410s() {
        View view = this.f129426f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        view.setOnClickListener(new View$OnClickListenerC52163a(this));
        CommonTitleBar commonTitleBar = this.f129435o;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setLeftClickListener(new C52164b(this));
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText.setOnFocusChangeListener(new View$OnFocusChangeListenerC52165c(this));
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f129425e;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText2.addTextChangedListener(new C52166d(this));
        KeyboardRichTextEditText keyboardRichTextEditText3 = this.f129425e;
        if (keyboardRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText3.setOnKeyPreImeHandler(new C52167e(this));
        AbstractC36474h b = C29990c.m110930b();
        Intrinsics.checkExpressionValueIsNotNull(b, "ChatModuleInstanceHolder.getDependency()");
        if (b.mo134581i()) {
            KeyboardRichTextEditText keyboardRichTextEditText4 = this.f129425e;
            if (keyboardRichTextEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            keyboardRichTextEditText4.setImeOptions(4);
            KeyboardRichTextEditText keyboardRichTextEditText5 = this.f129425e;
            if (keyboardRichTextEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            keyboardRichTextEditText5.setInputType(131072);
            KeyboardRichTextEditText keyboardRichTextEditText6 = this.f129425e;
            if (keyboardRichTextEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            keyboardRichTextEditText6.setSingleLine(false);
        } else {
            KeyboardRichTextEditText keyboardRichTextEditText7 = this.f129425e;
            if (keyboardRichTextEditText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            keyboardRichTextEditText7.setInputType(131073);
        }
        KeyboardRichTextEditText keyboardRichTextEditText8 = this.f129425e;
        if (keyboardRichTextEditText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText8.setOnEditorActionListener(new C52168f(this));
        KeyboardRichTextEditText keyboardRichTextEditText9 = this.f129425e;
        if (keyboardRichTextEditText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText9.setSelectionChangedListener(new C52169g(this));
        KeyboardRichTextEditText keyboardRichTextEditText10 = this.f129425e;
        if (keyboardRichTextEditText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText10.setOnPasteListener(new C52170h(this));
        RelativeLayout relativeLayout = this.f129436p;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupContainer");
        }
        relativeLayout.setOnClickListener(new View$OnClickListenerC52171i(this));
    }

    /* renamed from: o */
    public final void mo178695o() {
        float f;
        View view = this.f129424d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(R.id.toolbox_et_postmessage);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R…d.toolbox_et_postmessage)");
        this.f129425e = (KeyboardRichTextEditText) findViewById;
        View view2 = this.f129424d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view2.findViewById(R.id.toolbox_postmsg_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R…oolbox_postmsg_container)");
        this.f129434n = (ScrollView) findViewById2;
        View view3 = this.f129424d;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById3 = view3.findViewById(R.id.title_bar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.title_bar)");
        this.f129435o = (CommonTitleBar) findViewById3;
        View view4 = this.f129424d;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById4 = view4.findViewById(R.id.select_group_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R…d.select_group_container)");
        this.f129436p = (RelativeLayout) findViewById4;
        View view5 = this.f129424d;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById5 = view5.findViewById(R.id.group_avatar);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById(R.id.group_avatar)");
        this.f129437q = (LKUIRoundedImageView) findViewById5;
        View view6 = this.f129424d;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById6 = view6.findViewById(R.id.group_name_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById(R.id.group_name_tv)");
        this.f129438r = (TextView) findViewById6;
        View view7 = this.f129424d;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById7 = view7.findViewById(R.id.bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "mRootView.findViewById(R.id.bottom_container)");
        this.f129439s = (ConstraintLayout) findViewById7;
        View view8 = this.f129424d;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById8 = view8.findViewById(R.id.top_drawer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "mRootView.findViewById(R.id.top_drawer)");
        this.f129440t = (SlidingUpPanelLayout) findViewById8;
        View view9 = this.f129424d;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById9 = view9.findViewById(R.id.select_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "mRootView.findViewById(R.id.select_tv)");
        this.f129441u = (TextView) findViewById9;
        View view10 = this.f129424d;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById10 = view10.findViewById(R.id.select_arrow);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "mRootView.findViewById(R.id.select_arrow)");
        this.f129442v = (ImageView) findViewById10;
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText.setHint(this.f129433m);
        TextView[] textViewArr = new TextView[1];
        KeyboardRichTextEditText keyboardRichTextEditText2 = this.f129425e;
        if (keyboardRichTextEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        int i = 0;
        textViewArr[0] = keyboardRichTextEditText2;
        DesktopUtil.m144299a(textViewArr);
        RelativeLayout relativeLayout = this.f129436p;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGroupContainer");
        }
        if (!this.f129446z) {
            i = 8;
        }
        relativeLayout.setVisibility(i);
        View view11 = this.f129424d;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view11.setVisibility(8);
        CommonTitleBar commonTitleBar = this.f129435o;
        if (commonTitleBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar.setTitle(UIHelper.getString(R.string.Lark_Groups_NewPostTitle));
        CommonTitleBar commonTitleBar2 = this.f129435o;
        if (commonTitleBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar2.setMainTitleTextStyle(1);
        CommonTitleBar commonTitleBar3 = this.f129435o;
        if (commonTitleBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        if (DesktopUtil.m144307b()) {
            f = 16.0f;
        } else {
            f = 17.0f;
        }
        commonTitleBar3.setMainTitleSize(f);
        CommonTitleBar commonTitleBar4 = this.f129435o;
        if (commonTitleBar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleBar");
        }
        commonTitleBar4.setLeftImageResource(CommonTitleBarConstants.ICON_CLOSE);
        mo178684a(this.f129420B);
        m202409r();
    }

    /* renamed from: d */
    public final void mo178692d(boolean z) {
        this.f129446z = z;
    }

    /* renamed from: e */
    public final void mo178693e(boolean z) {
        this.f129419A = z;
    }

    /* renamed from: f */
    public final void mo178694f(boolean z) {
        this.f129444x = z;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$a */
    public static final class View$OnClickListenerC52163a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129447a;

        View$OnClickListenerC52163a(ThreadPostInputSupportPlugin dVar) {
            this.f129447a = dVar;
        }

        public final void onClick(View view) {
            this.f129447a.mo178691c(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$initListener$2", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$b */
    public static final class C52164b extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129448a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52164b(ThreadPostInputSupportPlugin dVar) {
            this.f129448a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            this.f129448a.mo178696p();
            IThreadInputDelegate cVar = this.f129448a.f129432l;
            RichText richText = ThreadPostInputSupportPlugin.m202401a(this.f129448a).getRichText();
            Intrinsics.checkExpressionValueIsNotNull(richText, "mPostContentET.richText");
            cVar.mo178657a(richText);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$initListener$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$d */
    public static final class C52166d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129450a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52166d(ThreadPostInputSupportPlugin dVar) {
            this.f129450a = dVar;
        }

        public void afterTextChanged(Editable editable) {
            CharSequence charSequence;
            if (editable != null) {
                charSequence = StringsKt.trim(editable);
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(String.valueOf(charSequence))) {
                ThreadPostInputSupportPlugin.m202405c(this.f129450a).setEnabled(false);
                ThreadPostInputSupportPlugin.m202405c(this.f129450a).setClickable(false);
                return;
            }
            ThreadPostInputSupportPlugin.m202405c(this.f129450a).setEnabled(true);
            ThreadPostInputSupportPlugin.m202405c(this.f129450a).setClickable(true);
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar;
            if (!this.f129450a.f129428h && (aVar = this.f129450a.f129430j) != null) {
                aVar.mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$initListener$5", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnKeyPreImeHandler;", "onKeyPreIme", "", "keyCode", "", "event", "Landroid/view/KeyEvent;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$e */
    public static final class C52167e implements KeyboardRichTextEditText.OnKeyPreImeHandler {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129451a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52167e(ThreadPostInputSupportPlugin dVar) {
            this.f129451a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText.OnKeyPreImeHandler
        /* renamed from: a */
        public boolean mo147070a(int i, KeyEvent keyEvent) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar;
            if (!Intrinsics.areEqual(this.f129451a.f129429i, ThreadPostInputSupportPlugin.m202401a(this.f129451a)) || (aVar = this.f129451a.f129430j) == null || !aVar.mo147173a(i, keyEvent)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$initListener$7", "Lcom/ss/android/lark/keyboard/widget/KeyboardRichTextEditText$OnSelectionChangedListener;", "onSelectionChanged", "", "selStart", "", "selEnd", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$g */
    public static final class C52169g implements KeyboardRichTextEditText.OnSelectionChangedListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129453a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52169g(ThreadPostInputSupportPlugin dVar) {
            this.f129453a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.KeyboardRichTextEditText.OnSelectionChangedListener
        /* renamed from: a */
        public void mo147069a(int i, int i2) {
            Editable text = ThreadPostInputSupportPlugin.m202401a(this.f129453a).getText();
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar = this.f129453a.f129430j;
            if (aVar != null) {
                aVar.mo147170a(text, i, i2 - i);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147037a(IInputContext eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        this.f129423c = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$initListener$8", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$h */
    public static final class C52170h extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129454a;

        /* renamed from: b */
        private final Regex f129455b = new Regex("\\s+|\n+");

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52170h(ThreadPostInputSupportPlugin dVar) {
            this.f129454a = dVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f129454a.mo178687a(list);
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            int indexOf$default;
            if (charSequence != null) {
                String obj = charSequence.toString();
                String str = obj;
                int i3 = 0;
                for (String str2 : this.f129455b.split(str, 0)) {
                    if (!URLUtil.isNetworkUrl(str2) || (indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, i3, false, 4, (Object) null)) == -1) {
                        i3 += str2.length();
                    } else {
                        int i4 = i + indexOf$default;
                        C40682g.m160850a().mo133169a(obj, new UIGetDataCallback(new C40727b(ThreadPostInputSupportPlugin.m202401a(this.f129454a), str2, i4)));
                        C40682g.m160850a().mo133173b(obj, new UIGetDataCallback(new GetUrlInlineFromCallback(i4, str2, ThreadPostInputSupportPlugin.m202401a(this.f129454a))));
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$i */
    public static final class View$OnClickListenerC52171i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129456a;

        View$OnClickListenerC52171i(ThreadPostInputSupportPlugin dVar) {
            this.f129456a = dVar;
        }

        public final void onClick(View view) {
            IGroupContainerDelegate aVar = this.f129456a.f129431k;
            if (aVar != null) {
                aVar.mo178651a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ KeyboardRichTextEditText m202401a(ThreadPostInputSupportPlugin dVar) {
        KeyboardRichTextEditText keyboardRichTextEditText = dVar.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        return keyboardRichTextEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ IInputContext m202403b(ThreadPostInputSupportPlugin dVar) {
        IInputContext eVar = dVar.f129423c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return eVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m202405c(ThreadPostInputSupportPlugin dVar) {
        View view = dVar.f129426f;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ Activity m202406d(ThreadPostInputSupportPlugin dVar) {
        Activity activity = dVar.f129422b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        return activity;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m202408e(ThreadPostInputSupportPlugin dVar) {
        View view = dVar.f129424d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/post/plugin/ThreadPostInputSupportPlugin$startShowAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$k */
    public static final class C52173k implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129458a;

        /* renamed from: b */
        final /* synthetic */ String f129459b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ThreadPostInputSupportPlugin.m202403b(this.f129458a).mo147122a(new KClass[0]);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            ThreadPostInputSupportPlugin.m202403b(this.f129458a).mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class));
            ThreadPostInputSupportPlugin.m202401a(this.f129458a).requestFocus();
            this.f129458a.mo178686a(this.f129459b);
        }

        C52173k(ThreadPostInputSupportPlugin dVar, String str) {
            this.f129458a = dVar;
            this.f129459b = str;
        }
    }

    /* renamed from: a */
    private final void m202402a(RichText richText) {
        this.f129428h = true;
        m202404b(richText);
        this.f129428h = false;
    }

    /* renamed from: b */
    public final void mo178688b(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "group");
        this.f129420B = chat;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$j */
    public static final class C52172j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129457a;

        C52172j(ThreadPostInputSupportPlugin dVar) {
            this.f129457a = dVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View e = ThreadPostInputSupportPlugin.m202408e(this.f129457a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                e.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public ThreadPostInputSupportPlugin(IThreadInputDelegate cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "IThreadInputDelegate");
        this.f129432l = cVar;
        String string = UIHelper.getString(R.string.Lark_Legacy_ComposePostWriteSomething);
        Intrinsics.checkExpressionValueIsNotNull(string, "UIHelper.getString(\n    …omposePostWriteSomething)");
        this.f129433m = string;
    }

    /* renamed from: b */
    private final void m202404b(RichText richText) {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        keyboardRichTextEditText.setText("");
        if (!C59035h.m229210a(richText)) {
            KeyboardRichTextEditText keyboardRichTextEditText2 = this.f129425e;
            if (keyboardRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C59033g.m229196a(richText, keyboardRichTextEditText2.getRichTextRender());
            return;
        }
        RichText a = C59029c.m229155a();
        KeyboardRichTextEditText keyboardRichTextEditText3 = this.f129425e;
        if (keyboardRichTextEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        C59033g.m229196a(a, keyboardRichTextEditText3.getRichTextRender());
    }

    /* renamed from: c */
    public final void mo178690c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hintText");
        this.f129433m = str;
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        if (keyboardRichTextEditText != null) {
            KeyboardRichTextEditText keyboardRichTextEditText2 = this.f129425e;
            if (keyboardRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            keyboardRichTextEditText2.setHint(this.f129433m);
        }
    }

    /* renamed from: d */
    private final void m202407d(String str) {
        Activity activity = this.f129422b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(DeviceUtils.getScreenHeight(activity), 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C52172j(this));
        ofInt.addListener(new C52173k(this, str));
        ofInt.setDuration(340L);
        ofInt.start();
    }

    /* renamed from: c */
    public final void mo178691c(boolean z) {
        KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
        if (keyboardRichTextEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        String a = keyboardRichTextEditText.mo146908a(false);
        Intrinsics.checkExpressionValueIsNotNull(a, "content");
        if (a == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        } else if (!TextUtils.isEmpty(StringsKt.trim((CharSequence) a).toString())) {
            if (this.f129443w) {
                this.f129432l.mo178656a();
                return;
            }
            KeyboardRichTextEditText keyboardRichTextEditText2 = this.f129425e;
            if (keyboardRichTextEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            String a2 = keyboardRichTextEditText2.mo146908a(false);
            KeyboardRichTextEditText keyboardRichTextEditText3 = this.f129425e;
            if (keyboardRichTextEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            RichText richText = keyboardRichTextEditText3.getRichText();
            mo147087a(new TransationData(), false);
            IInputContext eVar = this.f129423c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar.mo147125d();
            mo178696p();
            IThreadInputDelegate cVar = this.f129432l;
            Intrinsics.checkExpressionValueIsNotNull(a2, "content");
            Intrinsics.checkExpressionValueIsNotNull(richText, "richText");
            cVar.mo178658a(a2, richText, z);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147033a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = C40679d.m160785a(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createSendBut…nNoMargin(parent.context)");
        this.f129426f = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return a;
    }

    /* renamed from: b */
    public final void mo178689b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hintText");
        this.f129433m = str;
    }

    /* renamed from: a */
    public final void mo178684a(Chat chat) {
        if (chat != null && this.f129446z) {
            TextView textView = this.f129438r;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroupName");
            }
            textView.setText(chat.getName());
            String avatarKey = chat.getAvatarKey();
            Intrinsics.checkExpressionValueIsNotNull(avatarKey, "group.getAvatarKey()");
            String id = chat.getId();
            Intrinsics.checkExpressionValueIsNotNull(id, "group.getId()");
            Activity activity = this.f129422b;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            Activity activity2 = activity;
            LKUIRoundedImageView lKUIRoundedImageView = this.f129437q;
            if (lKUIRoundedImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mGroupAvatar");
            }
            C34336c.m133130a(activity2, lKUIRoundedImageView, avatarKey, id, UIHelper.dp2px(20.0f), UIHelper.dp2px(20.0f), Scene.Thread);
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    public void mo147011b(boolean z) {
        super.mo147011b(z);
        this.f129443w = !z;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        RichText richText;
        this.f129427g = true;
        View view = this.f129424d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setVisibility(0);
        String str = null;
        if (!m202411t()) {
            if (jVar != null) {
                richText = (RichText) jVar.mo147174a("param_content");
            } else {
                richText = null;
            }
            if (richText == null) {
                richText = C59029c.m229155a();
                Intrinsics.checkExpressionValueIsNotNull(richText, "RichTextCreator.generateEmptyRichText()");
            }
            m202402a(richText);
        }
        ILifeCycleCallback bVar = this.f129445y;
        if (bVar != null) {
            bVar.mo178682a();
        }
        if (jVar != null) {
            str = (String) jVar.mo147174a("param_selected_plugin");
        }
        if (!this.f129419A || DesktopUtil.m144307b()) {
            IInputContext eVar = this.f129423c;
            if (eVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
            }
            eVar.mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class));
            KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
            if (keyboardRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            keyboardRichTextEditText.requestFocus();
            mo178686a(str);
            return;
        }
        m202407d(str);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147031a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f129422b = activity;
        this.f129424d = view;
        mo178695o();
        m202410s();
        mo147007a((ViewGroup) view, activity);
        View view2 = this.f129424d;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view2;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$c */
    public static final class View$OnFocusChangeListenerC52165c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129449a;

        View$OnFocusChangeListenerC52165c(ThreadPostInputSupportPlugin dVar) {
            this.f129449a = dVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && this.f129449a.f129427g) {
                KeyboardRichTextEditText a = ThreadPostInputSupportPlugin.m202401a(this.f129449a);
                this.f129449a.f129429i = a;
                ThreadPostInputSupportPlugin.m202403b(this.f129449a).mo147122a(Reflection.getOrCreateKotlinClass(AaStyleKBPlugin.class), Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class));
                IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar = this.f129449a.f129430j;
                if (aVar != null) {
                    aVar.mo147171a(a);
                }
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147032a(Activity activity, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(activity).inflate(mo147089i(), viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "rootView");
        return mo147031a(activity, inflate);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147087a(TransationData jVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(jVar, "draft");
        RichText richText = (RichText) jVar.mo147174a("draft_post_reichtext");
        if (richText == null) {
            richText = C59029c.m229155a();
        }
        Log.m165379d("doDraft", "Post Input onSetDraft :  =:=" + C59035h.m229211b(richText));
        if (z) {
            KeyboardRichTextEditText keyboardRichTextEditText = this.f129425e;
            if (keyboardRichTextEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C59033g.m229196a(richText, keyboardRichTextEditText.getRichTextRender());
            return;
        }
        m202402a(richText);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.post.a.d$f */
    public static final class C52168f implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ ThreadPostInputSupportPlugin f129452a;

        C52168f(ThreadPostInputSupportPlugin dVar) {
            this.f129452a = dVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f129452a.mo178691c(false);
            return true;
        }
    }
}
