package com.ss.android.lark.keyboard.plugin.input.postinput;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
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
import com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.IPhotoDependency;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.ImageUtils;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.AbstractC57864b;
import com.ss.android.lark.utils.statistics.PerfLog;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.lark.widget.drag.DragDropController;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import com.ss.android.lark.widget.slidingup.SlidingUpPanelLayout;
import com.ss.android.lark.widget.span.UrlImageSpan;
import com.ss.android.vc.statistics.p3180a.C63690d;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010 \n\u0002\b\u0004\b\u0016\u0018\u0000 r2\u00020\u00012\u00020\u0002:\u0003rstB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\bJ\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0002J\u0010\u00103\u001a\u0002002\u0006\u0010\u0010\u001a\u00020\fH\u0002J\b\u00104\u001a\u000205H\u0016J\n\u00106\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u00107\u001a\u000205H\u0016J\b\u00108\u001a\u000209H\u0016J\b\u0010:\u001a\u000205H\u0016J\b\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u0004\u0018\u00010\u0018J\u0006\u0010=\u001a\u00020>J\u0006\u0010?\u001a\u000202J\b\u0010@\u001a\u000200H\u0002J\b\u0010A\u001a\u00020\fH\u0016J\b\u0010B\u001a\u00020\fH\u0002J\b\u0010C\u001a\u00020\fH\u0016J\u0010\u0010D\u001a\u0002002\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020\u00142\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010L\u001a\u000200H\u0016J\u0010\u0010M\u001a\u0002002\u0006\u0010N\u001a\u00020\fH\u0016J\b\u0010O\u001a\u000200H\u0016J\u0018\u0010P\u001a\u00020&2\u0006\u0010K\u001a\u00020\u00142\u0006\u0010Q\u001a\u00020&H\u0017J\u0012\u0010R\u001a\u0002002\b\u0010S\u001a\u0004\u0018\u00010FH\u0016J\b\u0010T\u001a\u00020FH\u0016J\u0018\u0010U\u001a\u0002002\u0006\u0010V\u001a\u00020F2\u0006\u0010W\u001a\u00020\fH\u0016J\b\u0010X\u001a\u000200H\u0016J\u000e\u0010Y\u001a\u0002002\u0006\u0010Z\u001a\u000202J\u000e\u0010[\u001a\u0002002\u0006\u0010\\\u001a\u00020\fJ\b\u0010]\u001a\u000200H\u0002J\u000e\u0010^\u001a\u0002002\u0006\u0010_\u001a\u00020\fJ\u000e\u0010`\u001a\u0002002\u0006\u0010_\u001a\u00020\fJ\u0010\u0010a\u001a\u0002002\u0006\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010b\u001a\u0002002\u0006\u0010c\u001a\u00020\u001aJ\u0012\u0010d\u001a\u0002002\b\u0010e\u001a\u0004\u0018\u00010>H\u0002J\u0012\u0010f\u001a\u0002002\b\u0010g\u001a\u0004\u0018\u00010>H\u0002J\u0012\u0010h\u001a\u0002002\b\u0010i\u001a\u0004\u0018\u00010\u0007H\u0002J\u0010\u0010j\u001a\u0002002\u0006\u0010k\u001a\u00020,H\u0016J\b\u0010l\u001a\u000200H\u0002J\u0012\u0010m\u001a\u0002002\b\u0010n\u001a\u0004\u0018\u000102H\u0002J\u0016\u0010o\u001a\u0002002\f\u0010p\u001a\b\u0012\u0004\u0012\u0002020qH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0004¢\u0006\u0002\n\u0000¨\u0006u"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/BaseInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "onSendPostCallback", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;", "(Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;)V", "contentHint", "", "(Ljava/lang/CharSequence;Lcom/ss/android/lark/keyboard/plugin/input/postinput/OnSendPostCallback;)V", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "interruptSend", "", "isContentRequestFocus", "isHidePostTitleEt", "isHideToolMenuWhenHide", "isReply", "isResume", "isSilent", "mActivity", "Landroid/app/Activity;", "mAdditionFuncContainer", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mCurrET", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "mILifeCycleCallback", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$ILifeCycleCallback;", "mLoadingDialog", "Lcom/ss/android/lark/widget/dialog/CommonLoadingDialog;", "mPopDrawerContainer", "Lcom/ss/android/lark/widget/slidingup/SlidingUpPanelLayout;", "mPostContentET", "mPostInputLayout", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/DragShrinkLayout;", "mPostMsgEtContainer", "Landroid/widget/ScrollView;", "mPostTitleET", "mRootView", "Landroid/view/View;", "mScaleIV", "Landroid/widget/ImageView;", "mSendBtn", "mShadowView", "mTextWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "uploadPhotoAPI", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI;", "appendPostTitle", "", "title", "", "changePostTitleStyle", "getAdditionDividerHeight", "", "getCurrET", "getHeight", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "getLayoutId", "getPostContentEditText", "getPostContentEt", "getPostContentRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getPostTitleString", "initPostDrag", "isFullScreen", "isHasDraft", "onBackPressed", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onCreateSendBtn", "parent", "Landroid/view/ViewGroup;", "onCreateView", "activity", "onDestroy", "onEnableChanged", "isEnable", "onFinishReplyMode", "onInitView", "rootView", "onResume", "params", "onSaveDraft", "onSetDraft", "draft", "append", "onStop", "setContentHint", "hint", "setContentRequestFocus", "requestFocus", "setEditTextDisplay", "setHidePostTitle", "isHide", "setHideToolMenuWhenHide", "setInputSupportContext", "setLifeCycleCallback", "lifeCycleCallback", "setPostContentRichText", "richtext", "setPostContentRichTextSilent", "richText", "setPostTitleString", "text", "setTextWatcher", "textWatcher", "startHideAnim", "startShowAnim", "selectedPlugin", "uploadImage", "filePaths", "", "Companion", "ILifeCycleCallback", "IOnUploadPhotoAPI", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b */
public class PostInputSupportPlugin extends BaseInputSupportPlugin implements IInputSupportPlugin {

    /* renamed from: s */
    public static final Companion f103533s = new Companion(null);

    /* renamed from: A */
    private final IOnUploadPhotoAPI f103534A;

    /* renamed from: B */
    private final CharSequence f103535B;

    /* renamed from: b */
    public Activity f103536b;

    /* renamed from: c */
    public IInputContext f103537c;

    /* renamed from: d */
    public DragShrinkLayout f103538d;

    /* renamed from: e */
    public RichTextEmojiconEditText f103539e;

    /* renamed from: f */
    public RichTextEmojiconEditText f103540f;

    /* renamed from: g */
    public View f103541g;

    /* renamed from: h */
    public View f103542h;

    /* renamed from: i */
    public boolean f103543i;

    /* renamed from: j */
    public boolean f103544j;

    /* renamed from: k */
    public boolean f103545k;

    /* renamed from: l */
    public boolean f103546l;

    /* renamed from: m */
    public boolean f103547m;

    /* renamed from: n */
    public boolean f103548n;

    /* renamed from: o */
    public RichTextEmojiconEditText f103549o;

    /* renamed from: p */
    public IKeyBoardPlugin.IKeyBoardContext.ITextWatcher f103550p;

    /* renamed from: q */
    public final CommonLoadingDialog f103551q;

    /* renamed from: r */
    public final OnSendPostCallback f103552r;

    /* renamed from: t */
    private ImageView f103553t;

    /* renamed from: u */
    private View f103554u;

    /* renamed from: v */
    private ScrollView f103555v;

    /* renamed from: w */
    private ConstraintLayout f103556w;

    /* renamed from: x */
    private SlidingUpPanelLayout f103557x;

    /* renamed from: y */
    private ILifeCycleCallback f103558y;

    /* renamed from: z */
    private boolean f103559z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$ILifeCycleCallback;", "", "onResume", "", "onStop", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$b */
    public interface ILifeCycleCallback {

        @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$b$a */
        public static final class C40747a {
            /* renamed from: a */
            public static void m161305a(ILifeCycleCallback bVar) {
            }
        }

        /* renamed from: a */
        void mo123216a();

        /* renamed from: b */
        void mo123217b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u000bJ&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI;", "", "doUpload", "", "photos", "", "", "isKeepOriginPic", "", "callback", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI$IUploadCallback;", "IUploadCallback", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$c */
    public interface IOnUploadPhotoAPI {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI$IUploadCallback;", "Lcom/larksuite/framework/callback/OnUpdateProgressListener;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$c$a */
        public interface IUploadCallback extends AbstractC25974h {
            /* renamed from: a */
            void mo147216a();

            /* renamed from: a */
            void mo147217a(ErrorResult errorResult);

            /* renamed from: a */
            void mo147218a(IPhotoDependency.Image image);
        }

        /* renamed from: a */
        void mo147215a(List<String> list, boolean z, IUploadCallback aVar);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    public int mo147010b() {
        return 2;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: h */
    public boolean mo146903h() {
        return true;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: i */
    public int mo147089i() {
        return R.layout.kb_input_post;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$Companion;", "", "()V", "EXPAND_DRAG_BUTTON_TOUCH_SIZE", "", "IMAGE_MIMETYPE_PREFIX", "", "PARAM_CONTENT", "PARAM_SELECTED_PLUGIN", "TAG", "TOP_MARGIN", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: m */
    public IOutInputSupport.InputSupportType mo146905m() {
        return IOutInputSupport.InputSupportType.POSTINPUT;
    }

    /* renamed from: o */
    public RichTextEmojiconEditText mo146904l() {
        return this.f103549o;
    }

    /* renamed from: a */
    public final void mo147208a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            String c = C26311p.m95283c((String) t);
            Intrinsics.checkExpressionValueIsNotNull(c, "FileUtils.getMIMEType(it)");
            if (!StringsKt.contains$default((CharSequence) c, (CharSequence) "image/", false, 2, (Object) null) && !StringsKt.endsWith$default((String) t, ".0", false, 2, (Object) null)) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            String contextId = PerfLog.getContextId();
            PerfLog.start("upload_image", contextId, "");
            CommonLoadingDialog commonLoadingDialog = this.f103551q;
            Activity activity = this.f103536b;
            if (activity == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            commonLoadingDialog.show(activity);
            this.f103534A.mo147215a(arrayList2, true, new C40766v(this, contextId, true));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147039a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
        this.f103550p = aVar;
    }

    /* renamed from: a */
    public final void mo147207a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "hint");
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        richTextEmojiconEditText.setHint(str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$uploadPhotoAPI$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI;", "doUpload", "", "photos", "", "", "isKeepOriginPic", "", "callback", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI$IUploadCallback;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$w */
    public static final class C40770w implements IOnUploadPhotoAPI {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103588a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$uploadPhotoAPI$1$doUpload$1", "Lcom/ss/android/lark/utils/rxjava/ReportErrorObserver;", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "error", "", "throwable", "", "onComplete", "onNext", "t", "onSubscribe", C63690d.f160779a, "Lio/reactivex/disposables/Disposable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$w$a */
        public static final class C40771a extends AbstractC57864b<IPhotoDependency.Image> {

            /* renamed from: a */
            final /* synthetic */ IOnUploadPhotoAPI.IUploadCallback f103589a;

            @Override // io.reactivex.AbstractC69009q
            public void onSubscribe(Disposable disposable) {
                Intrinsics.checkParameterIsNotNull(disposable, C63690d.f160779a);
            }

            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b, io.reactivex.AbstractC69009q
            public void onComplete() {
                this.f103589a.mo147216a();
            }

            C40771a(IOnUploadPhotoAPI.IUploadCallback aVar) {
                this.f103589a = aVar;
            }

            /* renamed from: a */
            public void onNext(IPhotoDependency.Image image) {
                Intrinsics.checkParameterIsNotNull(image, "t");
                this.f103589a.mo147218a(image);
            }

            /* access modifiers changed from: protected */
            @Override // com.ss.android.lark.utils.rxjava.AbstractC57864b
            /* renamed from: a */
            public void mo147247a(Throwable th) {
                String str;
                IOnUploadPhotoAPI.IUploadCallback aVar = this.f103589a;
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
        C40770w(PostInputSupportPlugin bVar) {
            this.f103588a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI
        /* renamed from: a */
        public void mo147215a(List<String> list, boolean z, IOnUploadPhotoAPI.IUploadCallback aVar) {
            Intrinsics.checkParameterIsNotNull(list, "photos");
            Intrinsics.checkParameterIsNotNull(aVar, "callback");
            this.f103588a.f103552r.mo123218a(list, z, aVar).observeOn(AndroidSchedulers.mainThread()).subscribe(new C40771a(aVar));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: j */
    public void mo147090j() {
        this.f103547m = false;
        m161266c(false);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$initPostDrag$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/DragShrinkLayout$ShrinkLayoutChangeListener;", "dragOffset", "", "totalOffset", "", "currentOffset", "onLayoutHideAnimEnd", "onLayoutHideAnimStart", "onLayoutShowAnimEnd", "onLayoutShowAnimStart", "startDrag", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$d */
    public static final class C40748d implements DragShrinkLayout.AbstractC40746a {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103560a;

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: b */
        public void mo147094b() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: c */
        public void mo147095c() {
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: a */
        public void mo147092a() {
            PostInputSupportPlugin.m161264c(this.f103560a).mo147123b();
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: d */
        public void mo147096d() {
            if (this.f103560a.f103548n) {
                PostInputSupportPlugin.m161264c(this.f103560a).mo147122a(new KClass[0]);
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: e */
        public void mo147097e() {
            PostInputSupportPlugin.m161264c(this.f103560a).mo147123b();
            TransationData jVar = new TransationData();
            jVar.mo147176a("param_show_reddot", Boolean.valueOf(this.f103560a.mo147210p()));
            PostInputSupportPlugin.m161264c(this.f103560a).mo147121a(Reflection.getOrCreateKotlinClass(TextInputSupportPlugin.class), this.f103560a, jVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40748d(PostInputSupportPlugin bVar) {
            this.f103560a = bVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout.AbstractC40746a
        /* renamed from: a */
        public void mo147093a(float f, float f2) {
            PostInputSupportPlugin.m161269f(this.f103560a).setAlpha(((f - f2) / f) * 0.6f);
        }
    }

    /* renamed from: v */
    private final RichTextEmojiconEditText m161272v() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        return richTextEmojiconEditText;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: n */
    public int mo146906n() {
        View view = this.f103554u;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view.getHeight();
    }

    /* renamed from: t */
    public final RichTextEmojiconEditText mo147214t() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        return richTextEmojiconEditText;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$uploadImage$1", "Lcom/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$IOnUploadPhotoAPI$IUploadCallback;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onFinish", "onSuccess", "image", "Lcom/ss/android/lark/keyboard/plugin/tool/photo/IPhotoDependency$Image;", "onUpdateProgress", "total", "", "curPos", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$v */
    public static final class C40766v implements IOnUploadPhotoAPI.IUploadCallback {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103580a;

        /* renamed from: b */
        final /* synthetic */ String f103581b;

        /* renamed from: c */
        final /* synthetic */ boolean f103582c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$v$b */
        static final class RunnableC40768b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C40766v f103585a;

            RunnableC40768b(C40766v vVar) {
                this.f103585a = vVar;
            }

            public final void run() {
                PostInputSupportPlugin.m161264c(this.f103585a.f103580a).mo147124c();
                this.f103585a.f103580a.f103551q.dismiss();
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147216a() {
            UICallbackExecutor.execute(new RunnableC40768b(this));
            PerfLog.end("upload_image", this.f103581b, "");
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$v$a */
        static final class RunnableC40767a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C40766v f103583a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f103584b;

            RunnableC40767a(C40766v vVar, ErrorResult errorResult) {
                this.f103583a = vVar;
                this.f103584b = errorResult;
            }

            public final void run() {
                if (!TextUtils.isEmpty(this.f103584b.getDisplayMsg())) {
                    LKUIToast.show(PostInputSupportPlugin.m161268e(this.f103583a.f103580a), this.f103584b.getDisplayMsg());
                } else {
                    LKUIToast.show(PostInputSupportPlugin.m161268e(this.f103583a.f103580a), (int) R.string.Lark_Legacy_FailedToUploadTheImage);
                }
                PostInputSupportPlugin.m161264c(this.f103583a.f103580a).mo147124c();
                this.f103583a.f103580a.f103551q.dismiss();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$v$c */
        static final class RunnableC40769c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C40766v f103586a;

            /* renamed from: b */
            final /* synthetic */ IPhotoDependency.Image f103587b;

            RunnableC40769c(C40766v vVar, IPhotoDependency.Image image) {
                this.f103586a = vVar;
                this.f103587b = image;
            }

            public final void run() {
                List<String> urls = this.f103587b.getUrls();
                if (CollectionUtils.isNotEmpty(urls)) {
                    String str = urls.get(0);
                    PostInputSupportPlugin.m161261b(this.f103586a.f103580a).mo146912a(new UrlImageSpan(PostInputSupportPlugin.m161268e(this.f103586a.f103580a), str, PostInputSupportPlugin.m161261b(this.f103586a.f103580a), null, 8, null), str, ImageUtils.m224133a(str, this.f103587b.getWidth(), this.f103587b.getHeight()), this.f103587b.getToken(), this.f103587b.getWidth(), this.f103587b.getHeight(), true, this.f103586a.f103582c);
                }
            }
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147217a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC40767a(this, errorResult));
        }

        @Override // com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.IOnUploadPhotoAPI.IUploadCallback
        /* renamed from: a */
        public void mo147218a(IPhotoDependency.Image image) {
            Intrinsics.checkParameterIsNotNull(image, "image");
            UICallbackExecutor.execute(new RunnableC40769c(this, image));
        }

        @Override // com.larksuite.framework.callback.AbstractC25974h
        public void onUpdateProgress(long j, int i) {
            if (i == 0) {
                PerfLog.start("get_image_data_single", this.f103581b, "");
            } else if (i == 30) {
                PerfLog.end("get_image_data_single", this.f103581b, "");
            }
        }

        C40766v(PostInputSupportPlugin bVar, String str, boolean z) {
            this.f103580a = bVar;
            this.f103581b = str;
            this.f103582c = z;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        richTextEmojiconEditText.setText("");
        RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103540f;
        if (richTextEmojiconEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        richTextEmojiconEditText2.setText("");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: f */
    public boolean mo146901f() {
        if (!this.f103546l) {
            return false;
        }
        boolean f = super.mo146901f();
        if (f) {
            return f;
        }
        mo147211q();
        return true;
    }

    /* renamed from: r */
    public final String mo147212r() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103540f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        return richTextEmojiconEditText.getText().toString();
    }

    /* renamed from: s */
    public final RichText mo147213s() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        RichText richText = richTextEmojiconEditText.getRichText();
        Intrinsics.checkExpressionValueIsNotNull(richText, "mPostContentET.richText");
        return richText;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        this.f103546l = false;
        View view = this.f103554u;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setVisibility(8);
        View view2 = this.f103542h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShadowView");
        }
        view2.setVisibility(8);
        DragShrinkLayout dragShrinkLayout = this.f103538d;
        if (dragShrinkLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
        }
        dragShrinkLayout.setVisibility(8);
        ILifeCycleCallback bVar = this.f103558y;
        if (bVar != null) {
            bVar.mo123217b();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: k */
    public TransationData mo147053k() {
        String r = mo147212r();
        if (this.f103547m) {
            r = "";
        }
        RichText s = mo147213s();
        if (s == null) {
            s = C59029c.m229155a();
        }
        TransationData jVar = new TransationData();
        jVar.mo147176a("draft_post_title", r);
        jVar.mo147176a("draft_post_reichtext", s);
        return jVar;
    }

    /* renamed from: w */
    private final void m161273w() {
        Activity activity = this.f103536b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        if (DesktopUtil.m144301a((Context) activity)) {
            DragShrinkLayout dragShrinkLayout = this.f103538d;
            if (dragShrinkLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
            }
            ViewGroup.LayoutParams layoutParams = dragShrinkLayout.getLayoutParams();
            if (layoutParams != null) {
                ((ConstraintLayout.LayoutParams) layoutParams).topMargin = UIHelper.dp2px(48.0f);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        DragShrinkLayout dragShrinkLayout2 = this.f103538d;
        if (dragShrinkLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
        }
        dragShrinkLayout2.setListener(new C40748d(this));
    }

    /* renamed from: p */
    public final boolean mo147210p() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103540f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        String obj = richTextEmojiconEditText.getText().toString();
        if (obj != null) {
            if (TextUtils.isEmpty(StringsKt.trim((CharSequence) obj).toString()) || this.f103547m) {
                RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103539e;
                if (richTextEmojiconEditText2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
                }
                if (!TextUtils.isEmpty(richTextEmojiconEditText2.mo146908a(false))) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    /* renamed from: q */
    public final void mo147211q() {
        DragShrinkLayout dragShrinkLayout = this.f103538d;
        if (dragShrinkLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, dragShrinkLayout.getHeight());
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.addUpdateListener(new C40760p(this));
        ofInt.addListener(new C40761q(this));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.6f, BitmapDescriptorFactory.HUE_RED);
        ofFloat.addUpdateListener(new C40762r(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    /* renamed from: u */
    private final void m161271u() {
        Activity activity = this.f103536b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        if (!DesktopUtil.m144301a((Context) activity)) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103540f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            C25649b.m91857a(richTextEmojiconEditText, LarkFont.TITLE4);
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103540f;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            Activity activity2 = this.f103536b;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            richTextEmojiconEditText2.setEmojiconSize((int) LKUIDisplayManager.m91865a(activity2, LarkFont.TITLE4));
            RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103539e;
            if (richTextEmojiconEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C25649b.m91857a(richTextEmojiconEditText3, LarkFont.HEADLINE);
            RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103539e;
            if (richTextEmojiconEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            Activity activity3 = this.f103536b;
            if (activity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            richTextEmojiconEditText4.setEmojiconSize((int) LKUIDisplayManager.m91865a(activity3, LarkFont.HEADLINE));
            RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103539e;
            if (richTextEmojiconEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            Activity activity4 = this.f103536b;
            if (activity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            richTextEmojiconEditText5.setEmojiconTextSize((int) LKUIDisplayManager.m91865a(activity4, LarkFont.HEADLINE));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$i */
    public static final class View$OnClickListenerC40753i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103565a;

        View$OnClickListenerC40753i(PostInputSupportPlugin bVar) {
            this.f103565a = bVar;
        }

        public final void onClick(View view) {
            this.f103565a.mo147211q();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$onInitView$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$j */
    public static final class C40754j implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103566a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40754j(PostInputSupportPlugin bVar) {
            this.f103566a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            Intrinsics.checkParameterIsNotNull(editable, "s");
            for (int length = editable.length() - 1; length >= 0; length--) {
                if (editable.charAt(length) == '\n') {
                    editable.replace(length, length + 1, " ");
                }
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar;
            if (!this.f103566a.f103544j && (aVar = this.f103566a.f103550p) != null) {
                aVar.mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$onInitView$6", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$l */
    public static final class C40756l implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103568a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40756l(PostInputSupportPlugin bVar) {
            this.f103568a = bVar;
        }

        public void afterTextChanged(Editable editable) {
            CharSequence charSequence;
            View d = PostInputSupportPlugin.m161267d(this.f103568a);
            if (editable != null) {
                charSequence = StringsKt.trim(editable);
            } else {
                charSequence = null;
            }
            d.setEnabled(!TextUtils.isEmpty(String.valueOf(charSequence)));
            if (this.f103568a.f103544j) {
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f103568a.f103544j) {
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar;
            if (!this.f103568a.f103544j && (aVar = this.f103568a.f103550p) != null) {
                aVar.mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$onInitView$7", "Lcom/ss/android/lark/widget/drag/DragDropController$OnDragDropListener;", "onDrop", "", "filePaths", "", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$m */
    public static final class C40757m implements DragDropController.OnDragDropListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103569a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40757m(PostInputSupportPlugin bVar) {
            this.f103569a = bVar;
        }

        @Override // com.ss.android.lark.widget.drag.DragDropController.OnDragDropListener
        /* renamed from: a */
        public void mo122119a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f103569a.mo147208a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$onInitView$8", "Lcom/ss/android/lark/widget/drag/DragDropController$OnDragDropListener;", "onDrop", "", "filePaths", "", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$n */
    public static final class C40758n implements DragDropController.OnDragDropListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103570a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40758n(PostInputSupportPlugin bVar) {
            this.f103570a = bVar;
        }

        @Override // com.ss.android.lark.widget.drag.DragDropController.OnDragDropListener
        /* renamed from: a */
        public void mo122119a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f103570a.mo147208a(list);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$startHideAnim$2", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$q */
    public static final class C40761q implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103574a;

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40761q(PostInputSupportPlugin bVar) {
            this.f103574a = bVar;
        }

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            TransationData jVar = new TransationData();
            jVar.mo147176a("param_show_reddot", Boolean.valueOf(this.f103574a.mo147210p()));
            PostInputSupportPlugin.m161264c(this.f103574a).mo147121a(Reflection.getOrCreateKotlinClass(TextInputSupportPlugin.class), this.f103574a, jVar);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            TransationData jVar = new TransationData();
            jVar.mo147176a("param_show_reddot", Boolean.valueOf(this.f103574a.mo147210p()));
            PostInputSupportPlugin.m161264c(this.f103574a).mo147121a(Reflection.getOrCreateKotlinClass(TextInputSupportPlugin.class), this.f103574a, jVar);
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            PostInputSupportPlugin.m161264c(this.f103574a).mo147123b();
            if (this.f103574a.f103548n) {
                PostInputSupportPlugin.m161264c(this.f103574a).mo147122a(new KClass[0]);
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147037a(IInputContext eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        this.f103537c = eVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$onInitView$9", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$o */
    public static final class C40759o extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103571a;

        /* renamed from: b */
        private final Regex f103572b = new Regex("\\s+|\n+");

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40759o(PostInputSupportPlugin bVar) {
            this.f103571a = bVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f103571a.mo147208a(list);
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            int indexOf$default;
            if (charSequence != null) {
                String obj = charSequence.toString();
                String str = obj;
                int i3 = 0;
                for (String str2 : this.f103572b.split(str, 0)) {
                    if (!URLUtil.isNetworkUrl(str2) || (indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, i3, false, 4, (Object) null)) == -1) {
                        i3 += str2.length();
                    } else {
                        int i4 = i + indexOf$default;
                        C40682g.m160850a().mo133169a(obj, new UIGetDataCallback(new C40727b(PostInputSupportPlugin.m161261b(this.f103571a), str2, i4)));
                        C40682g.m160850a().mo133173b(obj, new UIGetDataCallback(new GetUrlInlineFromCallback(i4, str2, PostInputSupportPlugin.m161261b(this.f103571a))));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RichTextEmojiconEditText m161258a(PostInputSupportPlugin bVar) {
        RichTextEmojiconEditText richTextEmojiconEditText = bVar.f103540f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        return richTextEmojiconEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ RichTextEmojiconEditText m161261b(PostInputSupportPlugin bVar) {
        RichTextEmojiconEditText richTextEmojiconEditText = bVar.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        return richTextEmojiconEditText;
    }

    /* renamed from: c */
    public static final /* synthetic */ IInputContext m161264c(PostInputSupportPlugin bVar) {
        IInputContext eVar = bVar.f103537c;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return eVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m161267d(PostInputSupportPlugin bVar) {
        View view = bVar.f103541g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ Activity m161268e(PostInputSupportPlugin bVar) {
        Activity activity = bVar.f103536b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        return activity;
    }

    /* renamed from: f */
    public static final /* synthetic */ View m161269f(PostInputSupportPlugin bVar) {
        View view = bVar.f103542h;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mShadowView");
        }
        return view;
    }

    /* renamed from: g */
    public static final /* synthetic */ DragShrinkLayout m161270g(PostInputSupportPlugin bVar) {
        DragShrinkLayout dragShrinkLayout = bVar.f103538d;
        if (dragShrinkLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
        }
        return dragShrinkLayout;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PostInputSupportPlugin(com.ss.android.lark.keyboard.plugin.input.postinput.OnSendPostCallback r3) {
        /*
            r2 = this;
            java.lang.String r0 = "onSendPostCallback"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            r0 = 2131830046(0x7f11251e, float:1.9293078E38)
            java.lang.String r0 = com.ss.android.lark.utils.UIHelper.getString(r0)
            java.lang.String r1 = "UIHelper.getString(R.str…omposePostWriteSomething)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.<init>(com.ss.android.lark.keyboard.plugin.input.postinput.a):void");
    }

    /* renamed from: a */
    private final void m161259a(RichText richText) {
        this.f103544j = true;
        m161262b(richText);
        this.f103544j = false;
    }

    /* renamed from: b */
    private final void m161263b(String str) {
        if (!this.f103547m) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103540f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText.append(str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$p */
    public static final class C40760p implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103573a;

        C40760p(PostInputSupportPlugin bVar) {
            this.f103573a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout g = PostInputSupportPlugin.m161270g(this.f103573a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                g.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$r */
    public static final class C40762r implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103575a;

        C40762r(PostInputSupportPlugin bVar) {
            this.f103575a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View f = PostInputSupportPlugin.m161269f(this.f103575a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                f.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$s */
    public static final class C40763s implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103576a;

        C40763s(PostInputSupportPlugin bVar) {
            this.f103576a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View f = PostInputSupportPlugin.m161269f(this.f103576a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                f.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "animation", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$t */
    public static final class C40764t implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103577a;

        C40764t(PostInputSupportPlugin bVar) {
            this.f103577a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            DragShrinkLayout g = PostInputSupportPlugin.m161270g(this.f103577a);
            Intrinsics.checkExpressionValueIsNotNull(valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                g.setTranslationY((float) ((Integer) animatedValue).intValue());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/postinput/PostInputSupportPlugin$startShowAnim$3", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$u */
    public static final class C40765u implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103578a;

        /* renamed from: b */
        final /* synthetic */ String f103579b;

        public void onAnimationCancel(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationRepeat(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
        }

        public void onAnimationStart(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            PostInputSupportPlugin.m161270g(this.f103578a).setVisibility(0);
            PostInputSupportPlugin.m161264c(this.f103578a).mo147122a(new KClass[0]);
            PostInputSupportPlugin.m161269f(this.f103578a).setVisibility(0);
        }

        public void onAnimationEnd(Animator animator) {
            Intrinsics.checkParameterIsNotNull(animator, "animation");
            if (!PostInputSupportPlugin.m161258a(this.f103578a).isEnabled() || this.f103578a.f103543i) {
                PostInputSupportPlugin.m161264c(this.f103578a).mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class));
                PostInputSupportPlugin.m161261b(this.f103578a).requestFocus();
                if (this.f103579b != null) {
                    PostInputSupportPlugin.m161264c(this.f103578a).mo147119a(this.f103579b);
                } else {
                    KeyboardUtils.showKeyboard(PostInputSupportPlugin.m161268e(this.f103578a));
                }
            } else {
                PostInputSupportPlugin.m161258a(this.f103578a).requestFocus();
                PostInputSupportPlugin.m161264c(this.f103578a).mo147122a(new KClass[0]);
                KeyboardUtils.showKeyboard(PostInputSupportPlugin.m161268e(this.f103578a));
            }
        }

        C40765u(PostInputSupportPlugin bVar, String str) {
            this.f103578a = bVar;
            this.f103579b = str;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147088b(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "replyData");
        this.f103547m = true;
        m161266c(true);
        mo147087a(jVar, false);
        CharSequence charSequence = (CharSequence) jVar.mo147174a("reply_data_msgdigest");
        if (charSequence == null) {
        }
        m161260a(charSequence);
    }

    /* renamed from: a */
    private final void m161260a(CharSequence charSequence) {
        if (charSequence == null) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103540f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText.setText("");
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            C58508e[] eVarArr = (C58508e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C58508e.class);
            for (C58508e eVar : eVarArr) {
                Intrinsics.checkExpressionValueIsNotNull(eVar, "span");
                if (eVar.mo198328e() != null) {
                    Drawable e = eVar.mo198328e();
                    e.mutate();
                    RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103540f;
                    if (richTextEmojiconEditText2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
                    }
                    e.setTint(richTextEmojiconEditText2.getCurrentTextColor());
                }
            }
            RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103540f;
            if (richTextEmojiconEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText3.setText(charSequence);
        }
        RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103540f;
        if (richTextEmojiconEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        if (!TextUtils.isEmpty(richTextEmojiconEditText4.getText())) {
            RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103540f;
            if (richTextEmojiconEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            RichTextEmojiconEditText richTextEmojiconEditText6 = this.f103540f;
            if (richTextEmojiconEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText5.setSelection(richTextEmojiconEditText6.length());
        }
    }

    /* renamed from: b */
    private final void m161262b(RichText richText) {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        if (!Intrinsics.areEqual(richTextEmojiconEditText.getRichText(), richText)) {
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103539e;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText2.setText("");
            if (!C59035h.m229210a(richText)) {
                RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103539e;
                if (richTextEmojiconEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
                }
                C59033g.m229196a(richText, richTextEmojiconEditText3.getRichTextRender());
                return;
            }
            RichText a = C59029c.m229155a();
            RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103539e;
            if (richTextEmojiconEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            C59033g.m229196a(a, richTextEmojiconEditText4.getRichTextRender());
        }
    }

    /* renamed from: c */
    private final void m161265c(String str) {
        Activity activity = this.f103536b;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        int screenHeight = DeviceUtils.getScreenHeight(activity);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 0.6f);
        ofFloat.addUpdateListener(new C40763s(this));
        ValueAnimator ofInt = ValueAnimator.ofInt(screenHeight, 0);
        Intrinsics.checkExpressionValueIsNotNull(ofInt, "anim");
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C40764t(this));
        ofInt.addListener(new C40765u(this, str));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(350L);
        animatorSet.playTogether(ofFloat, ofInt);
        animatorSet.start();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$e */
    static final class View$OnClickListenerC40749e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103561a;

        View$OnClickListenerC40749e(PostInputSupportPlugin bVar) {
            this.f103561a = bVar;
        }

        public final void onClick(View view) {
            new PostInputPluginHitPoint("send").mo147285c();
            String obj = PostInputSupportPlugin.m161258a(this.f103561a).getText().toString();
            if (obj != null) {
                String obj2 = StringsKt.trim((CharSequence) obj).toString();
                if (this.f103561a.f103547m) {
                    obj2 = "";
                }
                String a = PostInputSupportPlugin.m161261b(this.f103561a).mo146908a(false);
                RichText richText = PostInputSupportPlugin.m161261b(this.f103561a).getRichText();
                if (!this.f103561a.f103545k) {
                    OnSendPostCallback aVar = this.f103561a.f103552r;
                    Intrinsics.checkExpressionValueIsNotNull(a, "content");
                    Intrinsics.checkExpressionValueIsNotNull(richText, "richText");
                    aVar.mo123220a(obj2, a, richText);
                    this.f103561a.mo147087a(new TransationData(), false);
                    PostInputSupportPlugin.m161264c(this.f103561a).mo147125d();
                    this.f103561a.mo147211q();
                    return;
                }
                this.f103561a.f103552r.mo123219a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }
    }

    /* renamed from: c */
    private final void m161266c(boolean z) {
        if (z) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103540f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText.setEnabled(false);
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103540f;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103539e;
            if (richTextEmojiconEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText2.setTextColor(C57582a.m223616d(richTextEmojiconEditText3.getContext(), R.color.text_placeholder));
            return;
        }
        RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103540f;
        if (richTextEmojiconEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        richTextEmojiconEditText4.setEnabled(!this.f103545k);
        RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103540f;
        if (richTextEmojiconEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
        }
        RichTextEmojiconEditText richTextEmojiconEditText6 = this.f103539e;
        if (richTextEmojiconEditText6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        richTextEmojiconEditText5.setTextColor(C57582a.m223616d(richTextEmojiconEditText6.getContext(), R.color.text_title));
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147033a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = C40679d.m160785a(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createSendBut…nNoMargin(parent.context)");
        this.f103541g = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        a.setOnClickListener(new View$OnClickListenerC40749e(this));
        View view = this.f103541g;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        if (android.text.TextUtils.isEmpty(r6.getText()) == false) goto L_0x005b;
     */
    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo147011b(boolean r6) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin.mo147011b(boolean):void");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        RichText richText;
        this.f103546l = true;
        View view = this.f103554u;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view.setVisibility(0);
        String str = null;
        if (!mo147210p()) {
            if (jVar != null) {
                richText = (RichText) jVar.mo147174a("param_content");
            } else {
                richText = null;
            }
            if (richText == null) {
                richText = C59029c.m229155a();
                Intrinsics.checkExpressionValueIsNotNull(richText, "RichTextCreator.generateEmptyRichText()");
            }
            m161259a(richText);
        }
        View view2 = this.f103541g;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
        }
        Editable text = richTextEmojiconEditText.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "mPostContentET.text");
        view2.setEnabled(true ^ TextUtils.isEmpty(StringsKt.trim(text)));
        m161266c(this.f103547m);
        ILifeCycleCallback bVar = this.f103558y;
        if (bVar != null) {
            bVar.mo123216a();
        }
        if (jVar != null) {
            str = (String) jVar.mo147174a("param_selected_plugin");
        }
        m161265c(str);
    }

    /* renamed from: a */
    public final void mo147206a(ILifeCycleCallback bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "lifeCycleCallback");
        this.f103558y = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$f */
    public static final class View$OnFocusChangeListenerC40750f implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103562a;

        View$OnFocusChangeListenerC40750f(PostInputSupportPlugin bVar) {
            this.f103562a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && this.f103562a.f103546l) {
                PostInputSupportPlugin bVar = this.f103562a;
                bVar.f103549o = PostInputSupportPlugin.m161258a(bVar);
                PostInputSupportPlugin.m161264c(this.f103562a).mo147122a(new KClass[0]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "motionEvent", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$g */
    public static final class View$OnTouchListenerC40751g implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103563a;

        View$OnTouchListenerC40751g(PostInputSupportPlugin bVar) {
            this.f103563a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (PostInputSupportPlugin.m161261b(this.f103563a).canScrollVertically(-1)) {
                Intrinsics.checkExpressionValueIsNotNull(view, "view");
                view.getParent().requestDisallowInterceptTouchEvent(true);
                Intrinsics.checkExpressionValueIsNotNull(motionEvent, "motionEvent");
                if (motionEvent.getAction() == 1) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
            }
            return false;
        }
    }

    public PostInputSupportPlugin(CharSequence charSequence, OnSendPostCallback aVar) {
        Intrinsics.checkParameterIsNotNull(charSequence, "contentHint");
        Intrinsics.checkParameterIsNotNull(aVar, "onSendPostCallback");
        this.f103535B = charSequence;
        this.f103552r = aVar;
        this.f103551q = new CommonLoadingDialog();
        this.f103534A = new C40770w(this);
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

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$h */
    public static final class View$OnFocusChangeListenerC40752h implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103564a;

        View$OnFocusChangeListenerC40752h(PostInputSupportPlugin bVar) {
            this.f103564a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && this.f103564a.f103546l) {
                PostInputSupportPlugin bVar = this.f103564a;
                bVar.f103549o = PostInputSupportPlugin.m161261b(bVar);
                PostInputSupportPlugin.m161264c(this.f103564a).mo147122a(Reflection.getOrCreateKotlinClass(AtKBPlugin.class), Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class), Reflection.getOrCreateKotlinClass(FaceKBPlugin.class), Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class), Reflection.getOrCreateKotlinClass(ScreenShotDesktopPlugin.class));
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147031a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f103536b = activity;
        this.f103554u = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(R.id.postmessage_et_layout);
        if (findViewById != null) {
            DragShrinkLayout dragShrinkLayout = (DragShrinkLayout) findViewById;
            this.f103538d = dragShrinkLayout;
            if (dragShrinkLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
            }
            View findViewById2 = dragShrinkLayout.findViewById(R.id.toolbox_et_postmessage);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mPostInputLayout.findVie…d.toolbox_et_postmessage)");
            this.f103539e = (RichTextEmojiconEditText) findViewById2;
            DragShrinkLayout dragShrinkLayout2 = this.f103538d;
            if (dragShrinkLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
            }
            View findViewById3 = dragShrinkLayout2.findViewById(R.id.toolbox_et_posttitle);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mPostInputLayout.findVie….id.toolbox_et_posttitle)");
            this.f103540f = (RichTextEmojiconEditText) findViewById3;
            View view2 = this.f103554u;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById4 = view2.findViewById(R.id.toolbox_postmsg_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R…oolbox_postmsg_container)");
            this.f103555v = (ScrollView) findViewById4;
            DragShrinkLayout dragShrinkLayout3 = this.f103538d;
            if (dragShrinkLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
            }
            View findViewById5 = dragShrinkLayout3.findViewById(R.id.scale_btn);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mPostInputLayout.findViewById(R.id.scale_btn)");
            this.f103553t = (ImageView) findViewById5;
            View view3 = this.f103554u;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById6 = view3.findViewById(R.id.shadow_view);
            Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById(R.id.shadow_view)");
            this.f103542h = findViewById6;
            View view4 = this.f103554u;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById7 = view4.findViewById(R.id.bottom_container);
            Intrinsics.checkExpressionValueIsNotNull(findViewById7, "mRootView.findViewById(R.id.bottom_container)");
            this.f103556w = (ConstraintLayout) findViewById7;
            View view5 = this.f103554u;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById8 = view5.findViewById(R.id.top_drawer);
            Intrinsics.checkExpressionValueIsNotNull(findViewById8, "mRootView.findViewById(R.id.top_drawer)");
            this.f103557x = (SlidingUpPanelLayout) findViewById8;
            m161273w();
            m161271u();
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103539e;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText.setHint(this.f103535B);
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103540f;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText2.setOnFocusChangeListener(new View$OnFocusChangeListenerC40750f(this));
            RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103539e;
            if (richTextEmojiconEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText3.setOnFocusChangeListener(new View$OnFocusChangeListenerC40752h(this));
            ImageView imageView = this.f103553t;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mScaleIV");
            }
            imageView.setOnClickListener(new View$OnClickListenerC40753i(this));
            RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103540f;
            if (richTextEmojiconEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText4.addTextChangedListener(new C40754j(this));
            RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103540f;
            if (richTextEmojiconEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText5.setOnEditorActionListener(new C40755k(this));
            RichTextEmojiconEditText richTextEmojiconEditText6 = this.f103539e;
            if (richTextEmojiconEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText6.setInputType(212993);
            RichTextEmojiconEditText richTextEmojiconEditText7 = this.f103539e;
            if (richTextEmojiconEditText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText7.addTextChangedListener(new C40756l(this));
            if (DragDropController.f143463a.mo197516b()) {
                RichTextEmojiconEditText richTextEmojiconEditText8 = this.f103539e;
                if (richTextEmojiconEditText8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
                }
                richTextEmojiconEditText8.setOnDragDropListener(new C40757m(this));
                RichTextEmojiconEditText richTextEmojiconEditText9 = this.f103540f;
                if (richTextEmojiconEditText9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
                }
                richTextEmojiconEditText9.setOnDragDropListener(new C40758n(this));
            }
            RichTextEmojiconEditText richTextEmojiconEditText10 = this.f103539e;
            if (richTextEmojiconEditText10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostContentET");
            }
            richTextEmojiconEditText10.setOnPasteListener(new C40759o(this));
            View view6 = this.f103542h;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShadowView");
            }
            View view7 = this.f103542h;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mShadowView");
            }
            ViewGroup.LayoutParams layoutParams = view7.getLayoutParams();
            Activity activity2 = this.f103536b;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            layoutParams.height = DeviceUtils.getScreenHeight(activity2);
            view6.setLayoutParams(layoutParams);
            ScrollView scrollView = this.f103555v;
            if (scrollView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostMsgEtContainer");
            }
            scrollView.setOnTouchListener(new View$OnTouchListenerC40751g(this));
            View view8 = this.f103554u;
            if (view8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            view8.setVisibility(8);
            RichTextEmojiconEditText richTextEmojiconEditText11 = this.f103540f;
            if (richTextEmojiconEditText11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
            }
            richTextEmojiconEditText11.setHint(UIHelper.getString(R.string.Lark_Legacy_PostNoTitleHint));
            if (this.f103559z) {
                RichTextEmojiconEditText richTextEmojiconEditText12 = this.f103540f;
                if (richTextEmojiconEditText12 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPostTitleET");
                }
                richTextEmojiconEditText12.setVisibility(8);
            }
            View view9 = this.f103554u;
            if (view9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            if (view9 != null) {
                mo147007a((ViewGroup) view9, activity);
                View view10 = this.f103554u;
                if (view10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRootView");
                }
                return view10;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.input.postinput.DragShrinkLayout");
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147087a(TransationData jVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(jVar, "draft");
        String str = (String) jVar.mo147174a("draft_post_title");
        if (str == null) {
            str = "";
        }
        RichText richText = (RichText) jVar.mo147174a("draft_post_reichtext");
        if (richText == null) {
            richText = C59029c.m229155a();
        }
        Log.m165379d("doDraft", "Post Input onSetDraft : " + str + " =:=" + C59035h.m229211b(richText));
        if (z) {
            m161263b(str);
            C59033g.m229196a(richText, m161272v().getRichTextRender());
            return;
        }
        if (!this.f103547m || !TextUtils.isEmpty(str)) {
            m161260a((CharSequence) str);
        }
        m161259a(richText);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "event", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.postinput.b$k */
    public static final class C40755k implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ PostInputSupportPlugin f103567a;

        C40755k(PostInputSupportPlugin bVar) {
            this.f103567a = bVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 4 && i != 6 && (keyEvent == null || 66 != keyEvent.getKeyCode() || keyEvent.getAction() != 0)) {
                return false;
            }
            PostInputSupportPlugin.m161261b(this.f103567a).requestFocus();
            return true;
        }
    }
}
