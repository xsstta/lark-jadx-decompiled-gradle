package com.ss.android.lark.keyboard.plugin.input.textinput;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C14002h;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.desktopmode.utils.p1796b.C36580a;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.C40727b;
import com.ss.android.lark.keyboard.plugin.input.GetUrlInlineFromCallback;
import com.ss.android.lark.keyboard.plugin.input.IInputContext;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.InputAdditionPluginController;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.burnlife.BurnLifeKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.DesktopFaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.ThreadPhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.preview.ScreenShotDesktopPlugin;
import com.ss.android.lark.keyboard.plugin.tool.uploadlog.UploadLogKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.EllipsizedEmojiconTextView;
import com.ss.android.lark.widget.linked_emojicon.C58507d;
import com.ss.android.lark.widget.linked_emojicon.C58508e;
import com.ss.android.lark.widget.listener.AbstractC58541b;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.lark.widget.listener.OnSizeChangeListener;
import com.ss.android.lark.widget.richtext.C59029c;
import com.ss.android.lark.widget.richtext.C59033g;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00012\u00020\u00012\u00020\u0002:\u0004\u0001\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0002\u0010\u0010J\u0010\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u0006H\u0002J\u0006\u0010R\u001a\u00020\u0013J\b\u0010S\u001a\u00020\u0013H\u0002J\b\u0010T\u001a\u00020\bH\u0016J\n\u0010U\u001a\u0004\u0018\u00010;H\u0016J\b\u0010V\u001a\u00020WH\u0002J\b\u0010X\u001a\u00020\bH\u0016J\u0006\u0010Y\u001a\u000203J\u0006\u0010Z\u001a\u000205J\b\u0010[\u001a\u000207H\u0016J\b\u0010\\\u001a\u00020\bH\u0016J\u0006\u0010]\u001a\u00020;J\u0006\u0010!\u001a\u00020\u0004J\u0006\u0010^\u001a\u00020\u0013J\u0010\u0010_\u001a\u00020\u00132\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020.2\u0006\u0010c\u001a\u00020*H\u0016J\u0018\u0010d\u001a\u00020.2\u0006\u0010e\u001a\u00020$2\u0006\u0010c\u001a\u00020*H\u0016J\b\u0010f\u001a\u00020\u0013H\u0016J\u0010\u0010g\u001a\u00020\u00132\u0006\u0010h\u001a\u00020\u0004H\u0016J\b\u0010i\u001a\u00020\u0013H\u0016J\u0018\u0010j\u001a\u00020.2\u0006\u0010e\u001a\u00020$2\u0006\u0010k\u001a\u00020.H\u0016J\u0012\u0010l\u001a\u00020\u00132\b\u0010m\u001a\u0004\u0018\u00010aH\u0016J\b\u0010n\u001a\u00020aH\u0016J\u0018\u0010o\u001a\u00020\u00132\u0006\u0010p\u001a\u00020a2\u0006\u0010q\u001a\u00020\u0004H\u0016J\b\u0010r\u001a\u00020\u0013H\u0016J\u0010\u0010s\u001a\u00020\u00132\u0006\u0010t\u001a\u00020\u0004H\u0002J\u0006\u0010u\u001a\u00020\u0013J\u0014\u0010v\u001a\u00020\u00132\f\u0010w\u001a\b\u0012\u0004\u0012\u00020(0xJ\b\u0010y\u001a\u00020\u0013H\u0002J\u000e\u0010z\u001a\u00020\u00132\u0006\u0010{\u001a\u00020\u0004J\u0019\u0010|\u001a\u00020\u00132\f\u0010}\u001a\b\u0012\u0004\u0012\u00020K0J¢\u0006\u0002\u0010~J\u000f\u0010\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u000207J\u0011\u0010\u0001\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0011\u0010\u0001\u001a\u00020\u00132\b\u0010\u0001\u001a\u00030\u0001J\u0018\u0010\u0001\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00042\u0007\u0010\u0001\u001a\u00020\u0004J\u0012\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020WH\u0002J\u0014\u0010\u0001\u001a\u00020\u00132\t\u0010\u0001\u001a\u0004\u0018\u00010WH\u0002J\u0010\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020NJ\t\u0010\u0001\u001a\u00020\u0013H\u0002J\u0010\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020\u0004J\u0010\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020\u0006J\u0011\u0010\u0001\u001a\u00020\u00132\b\u0010\u0001\u001a\u00030\u0001J\u0012\u0010\u0001\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020GH\u0016J\u0019\u0010\u0001\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0011\u0010\u0001\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0011\u0010O\u001a\u00020\u00132\u0007\u0010\u0001\u001a\u00020\u0004H\u0002J\u000f\u0010\u0001\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u0006J\u0013\u0010\u0001\u001a\u00020\u00132\b\u0010\u0001\u001a\u00030\u0001H\u0002R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u001c\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0'0&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000201X.¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X.¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020*X.¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020,X.¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020,X.¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u000201X.¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u000201X.¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX.¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020.X.¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010I\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010JX\u000e¢\u0006\u0004\n\u0002\u0010LR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010M\u001a\u0004\u0018\u00010NX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/BaseInputSupportPlugin;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "disablePostInput", "", "hint", "", "hintColor", "", "onPasteListener", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "onSendTextCallback", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;", "onLifeCallback", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/IOnLifeCallback;", "disableRecognizeUrl", "(ZLjava/lang/CharSequence;ILcom/ss/android/lark/widget/listener/OnEditTextPasteListener;Lcom/ss/android/lark/keyboard/plugin/input/textinput/OnSendTextCallback;Lcom/ss/android/lark/keyboard/plugin/input/textinput/IOnLifeCallback;Z)V", "actionAfterInitView", "Lkotlin/Function0;", "", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "getContext", "()Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "setContext", "(Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;)V", "fromDraft", "getFromDraft", "()Z", "setFromDraft", "(Z)V", "hasMediaContent", "interruptSend", "isInReplyMode", "isSilent", "mActivity", "Landroid/app/Activity;", "mAvailablePlugins", "", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "mBottomContainer", "Landroid/view/ViewGroup;", "mCloseReplyBtn", "Landroid/widget/ImageView;", "mDividerVertical", "Landroid/view/View;", "mEditHint", "mEtContainer", "Landroid/widget/LinearLayout;", "mImageContainer", "Landroid/widget/FrameLayout;", "mImagesContainer", "Landroidx/recyclerview/widget/RecyclerView;", "mInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "mIsReplyViewVisible", "mMsgEtLayout", "mMsgInputET", "Lcom/ss/android/lark/keyboard/plugin/input/RichTextEmojiconEditText;", "mPopContainer", "mPostDraftDotIV", "mPostInputBtn", "mPostInputLayout", "mReplyContentRegion", "mReplyRegion", "mRootMsgTV", "Lcom/ss/android/lark/widget/EllipsizedEmojiconTextView;", "mRootView", "mSendBtn", "mTextWatcher", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext$ITextWatcher;", "mediaContentAvailable", "msgInputEtFilterArray", "", "Landroid/text/InputFilter;", "[Landroid/text/InputFilter;", "replyCloseBtListener", "Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$OnClickReplyCloseBtListener;", "showRedDot", "changeToReplyView", "msgDigest", "expandEtClickArea", "finishReplyMode", "getAdditionDividerHeight", "getCurrET", "getDraftRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "getHeight", "getImageFrameLayout", "getImagesRecyclerView", "getInputModel", "getLayoutId", "getMsgEditText", "onBlockPostSuccess", "onChangeToReplyMode", "replyData", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "onCreateSendBtn", "parent", "onCreateView", "activity", "onDestroy", "onEnableChanged", "isEnable", "onFinishReplyMode", "onInitView", "rootView", "onResume", "params", "onSaveDraft", "onSetDraft", "draft", "append", "onStop", "refreshSendBtnEnable", "hasTextContent", "requestLayout", "setAvailablePlugin", "plugins", "", "setEditTextDisplay", "setHasAvailableMediaContent", "hasAvailableMediaContent", "setInputETFilterArray", "filters", "([Landroid/text/InputFilter;)V", "setInputModel", "model", "setInputSupportContext", "setKeyBoardText", "text", "", "setMediaContentState", "available", "setMsgInputRichText", "messageRichText", "setMsgInputRichTextSilent", "setOnClickReplyCloseBtListener", "listener", "setParamsForDesktop", "setReplyViewVisible", "visible", "setText", "setTextWatcher", "textWatcher", "setupHint", "isShow", "showReplyView", "startPostInputPlugin", "runnable", "Ljava/lang/Runnable;", "Companion", "OnClickReplyCloseBtListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c */
public class TextInputSupportPlugin extends BaseInputSupportPlugin implements IInputSupportPlugin {

    /* renamed from: p */
    public static final Companion f103593p = new Companion(null);

    /* renamed from: A */
    private ViewGroup f103594A;

    /* renamed from: B */
    private ViewGroup f103595B;

    /* renamed from: C */
    private FrameLayout f103596C;

    /* renamed from: D */
    private RecyclerView f103597D;

    /* renamed from: E */
    private IOutInputSupport.InputSupportType f103598E = IOutInputSupport.InputSupportType.TEXTINPUT;

    /* renamed from: F */
    private boolean f103599F;

    /* renamed from: G */
    private Function0<Unit> f103600G;

    /* renamed from: H */
    private boolean f103601H;

    /* renamed from: I */
    private List<KClass<? extends IKeyBoardPlugin>> f103602I;

    /* renamed from: J */
    private boolean f103603J;

    /* renamed from: K */
    private boolean f103604K;

    /* renamed from: L */
    private boolean f103605L;

    /* renamed from: M */
    private InputFilter[] f103606M;

    /* renamed from: N */
    private final boolean f103607N;

    /* renamed from: O */
    private CharSequence f103608O;

    /* renamed from: P */
    private int f103609P;

    /* renamed from: Q */
    private final IOnLifeCallback f103610Q;

    /* renamed from: b */
    public boolean f103611b;

    /* renamed from: c */
    public View f103612c;

    /* renamed from: d */
    public LinearLayout f103613d;

    /* renamed from: e */
    public EllipsizedEmojiconTextView f103614e;

    /* renamed from: f */
    public RichTextEmojiconEditText f103615f;

    /* renamed from: g */
    protected IInputContext f103616g;

    /* renamed from: h */
    public CharSequence f103617h = "";

    /* renamed from: i */
    public boolean f103618i;

    /* renamed from: j */
    public View f103619j;

    /* renamed from: k */
    public IKeyBoardPlugin.IKeyBoardContext.ITextWatcher f103620k;

    /* renamed from: l */
    public OnClickReplyCloseBtListener f103621l;

    /* renamed from: m */
    public final AbstractC58541b f103622m;

    /* renamed from: n */
    public final OnSendTextCallback f103623n;

    /* renamed from: o */
    public final boolean f103624o;

    /* renamed from: q */
    private Activity f103625q;

    /* renamed from: r */
    private LinearLayout f103626r;

    /* renamed from: s */
    private ImageView f103627s;

    /* renamed from: t */
    private View f103628t;

    /* renamed from: u */
    private ImageView f103629u;

    /* renamed from: v */
    private ImageView f103630v;

    /* renamed from: w */
    private View f103631w;

    /* renamed from: x */
    private LinearLayout f103632x;

    /* renamed from: y */
    private LinearLayout f103633y;

    /* renamed from: z */
    private boolean f103634z;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$OnClickReplyCloseBtListener;", "", "onClickReplyCloseBt", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$b */
    public interface OnClickReplyCloseBtListener {
        /* renamed from: a */
        void mo147272a();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$f */
    public static final class View$OnClickListenerC40775f implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC40775f f103638a = new View$OnClickListenerC40775f();

        View$OnClickListenerC40775f() {
        }

        public final void onClick(View view) {
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$l */
    public static final class View$OnFocusChangeListenerC40783l implements View.OnFocusChangeListener {

        /* renamed from: a */
        public static final View$OnFocusChangeListenerC40783l f103647a = new View$OnFocusChangeListenerC40783l();

        View$OnFocusChangeListenerC40783l() {
        }

        public final void onFocusChange(View view, boolean z) {
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    public int mo147010b() {
        return 0;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: i */
    public int mo147089i() {
        return R.layout.kb_input_normal;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$Companion;", "", "()V", "COMBINED_BTN_SIZE", "", "INPUT_EMOJI_SIZE", "PARAM_SHOW_EDIT_CURSOR", "", "PARAM_SHOW_REDDOT", "POST_DRAFT_DOT_SIZE", "REPLY_CONTENT_HEIGHT", "REPLY_EMOJI_SIZE", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: j */
    public void mo147090j() {
        m161332A();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: m */
    public IOutInputSupport.InputSupportType mo146905m() {
        return this.f103598E;
    }

    /* renamed from: p */
    public final boolean mo147264p() {
        return this.f103599F;
    }

    /* renamed from: a */
    public final void mo147253a(Runnable runnable) {
        mo147006a().mo147130a(new C40787p(this, runnable));
    }

    /* renamed from: a */
    public final void mo147252a(CharSequence charSequence, int i) {
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        if (this.f103615f != null) {
            if (i != 0) {
                RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
                if (richTextEmojiconEditText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
                }
                richTextEmojiconEditText.setHintTextColor(i);
            }
            mo147251a(charSequence);
            return;
        }
        this.f103600G = new C40786o(this, i, charSequence);
    }

    /* renamed from: a */
    public final void mo147251a(CharSequence charSequence) {
        if (charSequence == null) {
        }
        this.f103617h = charSequence;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        float measuredWidth = (float) richTextEmojiconEditText.getMeasuredWidth();
        RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103615f;
        if (richTextEmojiconEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        float paddingLeft = measuredWidth - ((float) richTextEmojiconEditText2.getPaddingLeft());
        RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103615f;
        if (richTextEmojiconEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        float paddingRight = (paddingLeft - ((float) richTextEmojiconEditText3.getPaddingRight())) - 1.0f;
        RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103615f;
        if (richTextEmojiconEditText4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        CharSequence charSequence2 = this.f103617h;
        RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103615f;
        if (richTextEmojiconEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText4.setHint(TextUtils.ellipsize(charSequence2, richTextEmojiconEditText5.getPaint(), paddingRight, TextUtils.TruncateAt.END));
    }

    /* renamed from: a */
    public final void mo147254a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText.setText("");
        RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103615f;
        if (richTextEmojiconEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText2.setOriginText(str);
        RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103615f;
        if (richTextEmojiconEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        if (!TextUtils.isEmpty(richTextEmojiconEditText3.getText())) {
            RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103615f;
            if (richTextEmojiconEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103615f;
            if (richTextEmojiconEditText5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText4.setSelection(richTextEmojiconEditText5.length());
        }
    }

    /* renamed from: a */
    public final void mo147255a(List<? extends IKeyBoardPlugin> list) {
        Intrinsics.checkParameterIsNotNull(list, "plugins");
        this.f103602I.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f103602I.add(Reflection.getOrCreateKotlinClass(it.next().getClass()));
        }
    }

    /* renamed from: a */
    public final void mo147250a(RichText richText) {
        this.f103618i = true;
        if (richText == null) {
            RichText a = C59029c.m229155a();
            Intrinsics.checkExpressionValueIsNotNull(a, "RichTextCreator.generateEmptyRichText()");
            m161335b(a);
        } else {
            m161335b(richText);
        }
        this.f103618i = false;
    }

    /* renamed from: a */
    public final void mo147256a(boolean z, boolean z2) {
        this.f103604K = z;
        this.f103605L = z2;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        Editable text = richTextEmojiconEditText.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "mMsgInputET.text");
        mo147262f(!TextUtils.isEmpty(StringsKt.trim(text)));
    }

    /* renamed from: a */
    public final void mo147257a(InputFilter[] inputFilterArr) {
        Intrinsics.checkParameterIsNotNull(inputFilterArr, "filters");
        this.f103606M = inputFilterArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final IInputContext mo147263o() {
        IInputContext eVar = this.f103616g;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return eVar;
    }

    /* renamed from: q */
    public RichTextEmojiconEditText mo146904l() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        return richTextEmojiconEditText;
    }

    /* renamed from: r */
    public final RichTextEmojiconEditText mo147266r() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        return richTextEmojiconEditText;
    }

    /* renamed from: s */
    public final FrameLayout mo147267s() {
        FrameLayout frameLayout = this.f103596C;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageContainer");
        }
        return frameLayout;
    }

    /* renamed from: t */
    public final RecyclerView mo147268t() {
        RecyclerView recyclerView = this.f103597D;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImagesContainer");
        }
        return recyclerView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$o */
    static final class C40786o extends Lambda implements Function0<Unit> {
        final /* synthetic */ CharSequence $hint;
        final /* synthetic */ int $hintColor;
        final /* synthetic */ TextInputSupportPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40786o(TextInputSupportPlugin cVar, int i, CharSequence charSequence) {
            super(0);
            this.this$0 = cVar;
            this.$hintColor = i;
            this.$hint = charSequence;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            if (this.$hintColor != 0) {
                TextInputSupportPlugin.m161333a(this.this$0).setHintTextColor(this.$hintColor);
            }
            this.this$0.mo147251a(this.$hint);
        }
    }

    /* renamed from: A */
    private final void m161332A() {
        if (this.f103634z) {
            this.f103634z = false;
            LinearLayout linearLayout = this.f103613d;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplyRegion");
            }
            linearLayout.setVisibility(8);
            mo147254a("");
        }
    }

    /* renamed from: z */
    private final RichText m161341z() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        RichText draftRichText = richTextEmojiconEditText.getDraftRichText();
        Intrinsics.checkExpressionValueIsNotNull(draftRichText, "mMsgInputET.draftRichText");
        return draftRichText;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: d */
    public void mo147013d() {
        if (!this.f103601H) {
            mo147254a("");
        }
        IOnLifeCallback aVar = this.f103610Q;
        if (aVar != null) {
            aVar.mo122057b();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: e */
    public void mo147014e() {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText.setText("");
    }

    /* renamed from: v */
    public final void mo147270v() {
        LinearLayout linearLayout = this.f103633y;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEtContainer");
        }
        linearLayout.setOnClickListener(new C40773d(this));
    }

    /* renamed from: w */
    public final void mo147271w() {
        if (this.f103612c != null) {
            View view = this.f103612c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            view.requestLayout();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$startPostInputPlugin$1", "Lcom/ss/android/lark/keyboard/plugin/input/InputAdditionPluginController$IPopPanelResetCallback;", "onPanelReset", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$p */
    public static final class C40787p implements InputAdditionPluginController.IPopPanelResetCallback {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103651a;

        /* renamed from: b */
        final /* synthetic */ Runnable f103652b;

        @Override // com.ss.android.lark.keyboard.plugin.input.InputAdditionPluginController.IPopPanelResetCallback
        /* renamed from: a */
        public void mo147138a() {
            this.f103652b.run();
            TransationData jVar = new TransationData();
            jVar.mo147176a("param_content", TextInputSupportPlugin.m161333a(this.f103651a).getRichText());
            this.f103651a.mo147263o().mo147121a(Reflection.getOrCreateKotlinClass(PostInputSupportPlugin.class), this.f103651a, jVar);
        }

        C40787p(TextInputSupportPlugin cVar, Runnable runnable) {
            this.f103651a = cVar;
            this.f103652b = runnable;
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IOutInputSupport
    /* renamed from: n */
    public int mo146906n() {
        View view = this.f103612c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(R.id.input_and_reply_zone);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.input_and_reply_zone)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        ViewGroup viewGroup2 = this.f103594A;
        if (viewGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBottomContainer");
        }
        return viewGroup2.getHeight() + viewGroup.getHeight();
    }

    /* renamed from: u */
    public final void mo147269u() {
        mo147250a((RichText) null);
        mo147087a(new TransationData(), true);
        IInputContext eVar = this.f103616g;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        eVar.mo147126e();
        IInputContext eVar2 = this.f103616g;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        eVar2.mo147125d();
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: k */
    public TransationData mo147053k() {
        TransationData jVar = new TransationData();
        RichText z = m161341z();
        jVar.mo147176a("draft_msg_richtext", z);
        Log.m165379d("doDraft onSaveDraft", "TextInputSupportPlugin : " + C59035h.m229211b(z));
        Log.m165379d("keyboard", "life onSaveDraft " + C59035h.m229211b(z));
        return jVar;
    }

    /* renamed from: x */
    private final void m161339x() {
        if (DesktopUtil.m144307b()) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText.setTextSize((float) 14);
            richTextEmojiconEditText.setHeight(UIHelper.dp2px(20.0f));
            LinearLayout linearLayout = this.f103632x;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgEtLayout");
            }
            linearLayout.setPadding(0, 0, 0, UIHelper.dp2px(8.0f));
            LinearLayout linearLayout2 = this.f103626r;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplyContentRegion");
            }
            linearLayout2.getLayoutParams().height = UIHelper.dp2px(30.0f);
            linearLayout2.setGravity(80);
            View view = this.f103628t;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDividerVertical");
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = UIHelper.dp2px(2.0f);
                view.setLayoutParams(marginLayoutParams);
                ImageView imageView = this.f103627s;
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCloseReplyBtn");
                }
                imageView.getLayoutParams().height = UIHelper.dp2px(14.0f);
                ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.bottomMargin = UIHelper.dp2px(2.0f);
                    imageView.setLayoutParams(marginLayoutParams2);
                    EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f103614e;
                    if (ellipsizedEmojiconTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
                    }
                    ellipsizedEmojiconTextView.getLayoutParams().height = UIHelper.dp2px(20.0f);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: y */
    private final void m161340y() {
        Activity activity = this.f103625q;
        if (activity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mActivity");
        }
        if (!DesktopUtil.m144301a((Context) activity)) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            C25649b.m91857a(richTextEmojiconEditText, LarkFont.HEADLINE);
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103615f;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            Activity activity2 = this.f103625q;
            if (activity2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            richTextEmojiconEditText2.setEmojiconSize(LKUIDisplayManager.m91881c(activity2, 19));
            RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103615f;
            if (richTextEmojiconEditText3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            Activity activity3 = this.f103625q;
            if (activity3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            richTextEmojiconEditText3.setEmojiconTextSize((int) LKUIDisplayManager.m91865a(activity3, LarkFont.HEADLINE));
            ImageView imageView = this.f103630v;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputBtn");
            }
            C25649b.m91853a(imageView, 20);
            ImageView imageView2 = this.f103629u;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostDraftDotIV");
            }
            C25649b.m91853a(imageView2, 6);
            LinearLayout linearLayout = this.f103626r;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplyContentRegion");
            }
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            Activity activity4 = this.f103625q;
            if (activity4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            layoutParams.height = LKUIDisplayManager.m91881c(activity4, 32);
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f103614e;
            if (ellipsizedEmojiconTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
            }
            C25649b.m91857a(ellipsizedEmojiconTextView, LarkFont.BODY1);
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f103614e;
            if (ellipsizedEmojiconTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
            }
            Activity activity5 = this.f103625q;
            if (activity5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActivity");
            }
            ellipsizedEmojiconTextView2.setEmojiconSize(LKUIDisplayManager.m91881c(activity5, 16));
        }
    }

    /* renamed from: c */
    public final void mo147259c(boolean z) {
        this.f103599F = z;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J$\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016¨\u0006\f"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$onInitView$6", "Landroid/view/View$OnKeyListener;", "handleNewLineAction", "", "code", "", "onKey", "v", "Landroid/view/View;", "keyCode", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$k */
    public static final class View$OnKeyListenerC40781k implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103644a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t¸\u0006\u0000"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$onInitView$6$onKey$1$1", "Lcom/ss/android/lark/desktopmode/utils/keyboard/DesktopKeyboardDetector$IKeyPatternDetectCallback;", "onAltPressed", "", "code", "", "onCtrlPressed", "onFunctionPressed", "onMetaPressed", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$k$a */
        public static final class C40782a implements C36580a.AbstractC36583b {

            /* renamed from: a */
            final /* synthetic */ View$OnKeyListenerC40781k f103645a;

            /* renamed from: b */
            final /* synthetic */ KeyEvent f103646b;

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: a */
            public /* synthetic */ boolean mo102791a() {
                return C36580a.AbstractC36583b.CC.$default$a(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: b */
            public /* synthetic */ boolean mo102793b() {
                return C36580a.AbstractC36583b.CC.$default$b(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: b */
            public /* synthetic */ boolean mo102794b(int i) {
                return C36580a.AbstractC36583b.CC.$default$b(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: c */
            public /* synthetic */ boolean mo102795c() {
                return C36580a.AbstractC36583b.CC.$default$c(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: c */
            public /* synthetic */ boolean mo102796c(int i) {
                return C36580a.AbstractC36583b.CC.$default$c(this, i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: d */
            public /* synthetic */ boolean mo102797d() {
                return C36580a.AbstractC36583b.CC.$default$d(this);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: e */
            public boolean mo102799e(int i) {
                return this.f103645a.mo147279a(i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: f */
            public boolean mo102800f(int i) {
                return this.f103645a.mo147279a(i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: a */
            public boolean mo102792a(int i) {
                return this.f103645a.mo147279a(i);
            }

            @Override // com.ss.android.lark.desktopmode.utils.p1796b.C36580a.AbstractC36583b
            /* renamed from: d */
            public boolean mo102798d(int i) {
                return this.f103645a.mo147279a(i);
            }

            C40782a(View$OnKeyListenerC40781k kVar, KeyEvent keyEvent) {
                this.f103645a = kVar;
                this.f103646b = keyEvent;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnKeyListenerC40781k(TextInputSupportPlugin cVar) {
            this.f103644a = cVar;
        }

        /* renamed from: a */
        public final boolean mo147279a(int i) {
            if (i != 66) {
                return true;
            }
            TextInputSupportPlugin.m161333a(this.f103644a).append("\n");
            return true;
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent == null) {
                return false;
            }
            C36580a.m144317a().mo134972a(keyEvent, new C40782a(this, keyEvent));
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$expandEtClickArea$1", "Lcom/ss/android/lark/widget/listener/OnSingleClickListener;", "onSingleClick", "", "v", "Landroid/view/View;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$d */
    public static final class C40773d extends OnSingleClickListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103636a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40773d(TextInputSupportPlugin cVar) {
            this.f103636a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
        public void onSingleClick(View view) {
            TextInputSupportPlugin.m161333a(this.f103636a).requestFocus();
            KeyboardUtils.showKeyboard(TextInputSupportPlugin.m161333a(this.f103636a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$onInitView$10", "Lcom/ss/android/lark/widget/listener/OnSizeChangeListener;", "onSizeChanged", "", "w", "", C14002h.f36692e, "oldw", "oldh", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$g */
    public static final class C40776g implements OnSizeChangeListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103639a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40776g(TextInputSupportPlugin cVar) {
            this.f103639a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.OnSizeChangeListener
        /* renamed from: a */
        public void mo147113a(int i, int i2, int i3, int i4) {
            if (i != i3) {
                TextInputSupportPlugin cVar = this.f103639a;
                cVar.mo147251a(cVar.f103617h);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$onInitView$5", "Landroid/widget/TextView$OnEditorActionListener;", "onEditorAction", "", "v", "Landroid/widget/TextView;", "actionId", "", "event", "Landroid/view/KeyEvent;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$j */
    public static final class C40780j implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103643a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40780j(TextInputSupportPlugin cVar) {
            this.f103643a = cVar;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0) {
                Editable text = TextInputSupportPlugin.m161333a(this.f103643a).getText();
                Intrinsics.checkExpressionValueIsNotNull(text, "mMsgInputET.text");
                if (!TextUtils.isEmpty(StringsKt.trim(text))) {
                    TextInputSupportPlugin.m161334b(this.f103643a).performClick();
                }
            }
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$onInitView$8", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$m */
    public static final class C40784m implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103648a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40784m(TextInputSupportPlugin cVar) {
            this.f103648a = cVar;
        }

        public void afterTextChanged(Editable editable) {
            CharSequence charSequence;
            TextInputSupportPlugin cVar = this.f103648a;
            if (editable != null) {
                charSequence = StringsKt.trim(editable);
            } else {
                charSequence = null;
            }
            cVar.mo147262f(!TextUtils.isEmpty(String.valueOf(charSequence)));
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar;
            if (!this.f103648a.f103618i && (aVar = this.f103648a.f103620k) != null) {
                aVar.mo147172a(charSequence, i, i2, i3);
            }
        }
    }

    /* renamed from: a */
    public final void mo147248a(IOutInputSupport.InputSupportType inputSupportType) {
        Intrinsics.checkParameterIsNotNull(inputSupportType, "model");
        this.f103598E = inputSupportType;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0016\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$onInitView$9", "Lcom/ss/android/lark/widget/listener/OnEditTextPasteListener;", "regex", "Lkotlin/text/Regex;", "getRegex", "()Lkotlin/text/Regex;", "onContentPaste", "", "content", "", "selection", "", "length", "onFilePaste", "filePaths", "", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$n */
    public static final class C40785n extends AbstractC58541b {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103649a;

        /* renamed from: b */
        private final Regex f103650b = new Regex("\\s+|\n+");

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40785n(TextInputSupportPlugin cVar) {
            this.f103649a = cVar;
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo122053a(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "filePaths");
            this.f103649a.f103622m.mo122053a(list);
        }

        @Override // com.ss.android.lark.widget.listener.AbstractC58541b
        /* renamed from: a */
        public void mo147074a(CharSequence charSequence, int i, int i2) {
            int indexOf$default;
            if (charSequence != null) {
                String obj = charSequence.toString();
                String str = obj;
                int i3 = 0;
                for (String str2 : this.f103650b.split(str, 0)) {
                    if (!URLUtil.isNetworkUrl(str2) || this.f103649a.f103624o || (indexOf$default = StringsKt.indexOf$default((CharSequence) str, str2, i3, false, 4, (Object) null)) == -1) {
                        i3 += str2.length();
                    } else {
                        int i4 = i + indexOf$default;
                        C40682g.m160850a().mo133169a(obj, new UIGetDataCallback(new C40727b(TextInputSupportPlugin.m161333a(this.f103649a), str2, i4)));
                        C40682g.m160850a().mo133173b(obj, new UIGetDataCallback(new GetUrlInlineFromCallback(i4, str2, TextInputSupportPlugin.m161333a(this.f103649a))));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ RichTextEmojiconEditText m161333a(TextInputSupportPlugin cVar) {
        RichTextEmojiconEditText richTextEmojiconEditText = cVar.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        return richTextEmojiconEditText;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m161334b(TextInputSupportPlugin cVar) {
        View view = cVar.f103619j;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ EllipsizedEmojiconTextView m161336c(TextInputSupportPlugin cVar) {
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = cVar.f103614e;
        if (ellipsizedEmojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
        }
        return ellipsizedEmojiconTextView;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/input/textinput/TextInputSupportPlugin$changeToReplyView$drawableCallback$1", "Lcom/ss/android/lark/widget/linked_emojicon/DrawableCallback;", "invalidateDrawable", "", "who", "Landroid/graphics/drawable/Drawable;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$c */
    public static final class C40772c extends C58507d {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103635a;

        @Override // com.ss.android.lark.widget.linked_emojicon.C58507d
        public void invalidateDrawable(Drawable drawable) {
            Intrinsics.checkParameterIsNotNull(drawable, "who");
            drawable.mutate();
            drawable.setTint(TextInputSupportPlugin.m161336c(this.f103635a).getCurrentTextColor());
            super.invalidateDrawable(drawable);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40772c(TextInputSupportPlugin cVar, View view) {
            super(view);
            this.f103635a = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$h */
    public static final class View$OnClickListenerC40777h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103640a;

        View$OnClickListenerC40777h(TextInputSupportPlugin cVar) {
            this.f103640a = cVar;
        }

        public final void onClick(View view) {
            new TextInputPluginHitPoint("rich_text").mo147285c();
            this.f103640a.mo147253a(new Runnable(this) {
                /* class com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin.View$OnClickListenerC40777h.RunnableC407781 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC40777h f103641a;

                {
                    this.f103641a = r1;
                }

                public final void run() {
                    this.f103641a.f103640a.mo147263o().mo147123b();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$i */
    public static final class View$OnClickListenerC40779i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103642a;

        View$OnClickListenerC40779i(TextInputSupportPlugin cVar) {
            this.f103642a = cVar;
        }

        public final void onClick(View view) {
            this.f103642a.mo147263o().mo147118a();
            OnClickReplyCloseBtListener bVar = this.f103642a.f103621l;
            if (bVar != null) {
                bVar.mo147272a();
            }
        }
    }

    /* renamed from: g */
    private final void m161338g(boolean z) {
        int i;
        this.f103601H = z;
        ImageView imageView = this.f103629u;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostDraftDotIV");
        }
        if (this.f103601H) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147037a(IInputContext eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "context");
        this.f103616g = eVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: b */
    public void mo147088b(TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(jVar, "replyData");
        CharSequence charSequence = (CharSequence) jVar.mo147174a("reply_data_msgdigest");
        if (charSequence == null) {
        }
        m161337c(charSequence);
        mo147087a(jVar, false);
    }

    /* renamed from: f */
    public final void mo147262f(boolean z) {
        if (this.f103604K) {
            View view = this.f103619j;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
            }
            view.setEnabled(this.f103605L);
            return;
        }
        View view2 = this.f103619j;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        view2.setEnabled(z);
    }

    /* renamed from: b */
    private final void m161335b(RichText richText) {
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        if (!Intrinsics.areEqual(richText, richTextEmojiconEditText.getRichText())) {
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103615f;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText2.setText("");
            if (!C59035h.m229210a(richText)) {
                RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103615f;
                if (richTextEmojiconEditText3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
                }
                C59033g.m229196a(richText, richTextEmojiconEditText3.getRichTextRender());
            }
        }
    }

    /* renamed from: d */
    public final void mo147260d(boolean z) {
        this.f103603J = z;
        if (!z && this.f103613d != null) {
            LinearLayout linearLayout = this.f103613d;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplyRegion");
            }
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo147261e(boolean z) {
        this.f103604K = z;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        Editable text = richTextEmojiconEditText.getText();
        Intrinsics.checkExpressionValueIsNotNull(text, "mMsgInputET.text");
        mo147262f(!TextUtils.isEmpty(StringsKt.trim(text)));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.textinput.c$e */
    static final class View$OnClickListenerC40774e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextInputSupportPlugin f103637a;

        View$OnClickListenerC40774e(TextInputSupportPlugin cVar) {
            this.f103637a = cVar;
        }

        public final void onClick(View view) {
            new TextInputPluginHitPoint("send").mo147285c();
            if (!this.f103637a.f103611b) {
                OnSendTextCallback bVar = this.f103637a.f103623n;
                String a = TextInputSupportPlugin.m161333a(this.f103637a).mo146908a(false);
                Intrinsics.checkExpressionValueIsNotNull(a, "mMsgInputET.getStringText(false)");
                RichText b = TextInputSupportPlugin.m161333a(this.f103637a).mo146922b(this.f103637a.mo147264p());
                Intrinsics.checkExpressionValueIsNotNull(b, "mMsgInputET.getRichTextInner(fromDraft)");
                bVar.mo122055a(a, b);
                this.f103637a.mo147250a((RichText) null);
                this.f103637a.mo147087a(new TransationData(), true);
                this.f103637a.mo147263o().mo147126e();
                this.f103637a.mo147263o().mo147125d();
                return;
            }
            this.f103637a.f103623n.mo122054a();
        }
    }

    /* renamed from: c */
    private final void m161337c(CharSequence charSequence) {
        if (this.f103603J) {
            LinearLayout linearLayout = this.f103613d;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplyRegion");
            }
            linearLayout.setVisibility(0);
        }
        this.f103634z = true;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText.requestFocus();
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f103614e;
        if (ellipsizedEmojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
        }
        ellipsizedEmojiconTextView.setTranslateEmojiCode(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        C58508e[] eVarArr = (C58508e[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C58508e.class);
        for (C58508e eVar : eVarArr) {
            EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f103614e;
            if (ellipsizedEmojiconTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
            }
            eVar.mo198322a(new C40772c(this, ellipsizedEmojiconTextView2));
        }
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView3 = this.f103614e;
        if (ellipsizedEmojiconTextView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
        }
        ellipsizedEmojiconTextView3.setText(charSequence);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147033a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View a = C40679d.m160785a(viewGroup.getContext());
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createSendBut…nNoMargin(parent.context)");
        this.f103619j = a;
        if (a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        a.setOnClickListener(new View$OnClickListenerC40774e(this));
        View view = this.f103619j;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        return view;
    }

    /* renamed from: b */
    public final void mo147258b(CharSequence charSequence) {
        Intrinsics.checkParameterIsNotNull(charSequence, "msgDigest");
        LinearLayout linearLayout = this.f103613d;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mReplyRegion");
        }
        linearLayout.setVisibility(0);
        this.f103634z = true;
        RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText.requestFocus();
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView = this.f103614e;
        if (ellipsizedEmojiconTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
        }
        ellipsizedEmojiconTextView.setTranslateEmojiCode(false);
        EllipsizedEmojiconTextView ellipsizedEmojiconTextView2 = this.f103614e;
        if (ellipsizedEmojiconTextView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootMsgTV");
        }
        ellipsizedEmojiconTextView2.setText(charSequence);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147038a(TransationData jVar) {
        Boolean bool;
        boolean z;
        int i;
        boolean z2;
        Boolean bool2 = null;
        if (jVar != null) {
            bool = (Boolean) jVar.mo147174a("param_show_reddot");
        } else {
            bool = null;
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f103601H;
        }
        this.f103601H = z;
        ImageView imageView = this.f103629u;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPostDraftDotIV");
        }
        if (this.f103601H) {
            i = 0;
        } else {
            i = 4;
        }
        imageView.setVisibility(i);
        if (jVar != null) {
            bool2 = (Boolean) jVar.mo147174a("param_show_edit_cursor");
        }
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = true;
        }
        if (z2) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText.requestFocus();
        }
        IInputContext eVar = this.f103616g;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        Object[] array = this.f103602I.toArray(new KClass[0]);
        if (array != null) {
            KClass[] kClassArr = (KClass[]) array;
            eVar.mo147122a((KClass[]) Arrays.copyOf(kClassArr, kClassArr.length));
            IOnLifeCallback aVar = this.f103610Q;
            if (aVar != null) {
                aVar.mo122056a();
            }
            RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103615f;
            if (richTextEmojiconEditText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            Editable text = richTextEmojiconEditText2.getText();
            Intrinsics.checkExpressionValueIsNotNull(text, "mMsgInputET.text");
            mo147262f(true ^ TextUtils.isEmpty(StringsKt.trim(text)));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004f  */
    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin, com.ss.android.lark.keyboard.plugin.input.BaseInputSupportPlugin
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo147011b(boolean r5) {
        /*
            r4 = this;
            super.mo147011b(r5)
            r0 = r5 ^ 1
            r4.f103611b = r0
            com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText r0 = r4.f103615f
            java.lang.String r1 = "mMsgInputET"
            if (r0 != 0) goto L_0x0010
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0010:
            r2 = 1
            if (r5 != 0) goto L_0x0029
            com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText r3 = r4.f103615f
            if (r3 != 0) goto L_0x001a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x001a:
            android.text.Editable r3 = r3.getText()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            r0.setEnabled(r3)
            com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText r0 = r4.f103615f
            if (r0 != 0) goto L_0x0034
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0034:
            android.text.Editable r0 = r0.getText()
            java.lang.String r1 = "mMsgInputET.text"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ r2
            r4.mo147262f(r0)
            android.widget.ImageView r0 = r4.f103630v
            if (r0 != 0) goto L_0x0054
            java.lang.String r1 = "mPostInputBtn"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0054:
            r0.setEnabled(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin.mo147011b(boolean):void");
    }

    /* renamed from: a */
    public final void mo147249a(OnClickReplyCloseBtListener bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "listener");
        this.f103621l = bVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147039a(IKeyBoardPlugin.IKeyBoardContext.ITextWatcher aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "textWatcher");
        this.f103620k = aVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147032a(Activity activity, ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(activity).inflate(mo147089i(), viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(acti…ayoutId(), parent, false)");
        return mo147031a(activity, inflate);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public void mo147087a(TransationData jVar, boolean z) {
        boolean z2;
        Intrinsics.checkParameterIsNotNull(jVar, "draft");
        RichText richText = (RichText) jVar.mo147174a("draft_msg_richtext");
        if (richText == null) {
            richText = C59029c.m229155a();
        }
        String str = (String) jVar.mo147174a("draft_post_title");
        if (str == null) {
            str = "";
        }
        RichText richText2 = (RichText) jVar.mo147174a("draft_post_reichtext");
        if (richText2 == null) {
            richText2 = C59029c.m229155a();
        }
        boolean z3 = false;
        if (!TextUtils.isEmpty(str) || !C59035h.m229210a(richText2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2 || this.f103601H) {
                z3 = true;
            }
            z2 = z3;
        }
        m161338g(z2);
        Log.m165379d("doDraft", "Text input onSetDraft " + C59035h.m229211b(richText));
        Log.m165379d("doDraft", "Post input onSetDraft  post = " + str + " : " + C59035h.m229211b(richText2));
        StringBuilder sb = new StringBuilder();
        sb.append("life onSetDraft ");
        sb.append(C59035h.m229211b(richText));
        Log.m165379d("keyboard", sb.toString());
        if (z) {
            RichTextEmojiconEditText richTextEmojiconEditText = this.f103615f;
            if (richTextEmojiconEditText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            C59033g.m229196a(richText, richTextEmojiconEditText.getRichTextRender());
            return;
        }
        mo147250a(richText);
    }

    @Override // com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin
    /* renamed from: a */
    public View mo147031a(Activity activity, View view) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f103625q = activity;
        this.f103612c = view;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(R.id.layout_reply);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.layout_reply)");
        this.f103613d = (LinearLayout) findViewById;
        View view2 = this.f103612c;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view2.findViewById(R.id.layout_replay_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.layout_replay_content)");
        this.f103626r = (LinearLayout) findViewById2;
        View view3 = this.f103612c;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById3 = view3.findViewById(R.id.btn_close_reply);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.btn_close_reply)");
        this.f103627s = (ImageView) findViewById3;
        View view4 = this.f103612c;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById4 = view4.findViewById(R.id.tv_root_msg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R.id.tv_root_msg)");
        this.f103614e = (EllipsizedEmojiconTextView) findViewById4;
        View view5 = this.f103612c;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById5 = view5.findViewById(R.id.divider_vertical);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById(R.id.divider_vertical)");
        this.f103628t = findViewById5;
        View view6 = this.f103612c;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById6 = view6.findViewById(R.id.toolbox_et_message);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById(R.id.toolbox_et_message)");
        RichTextEmojiconEditText richTextEmojiconEditText = (RichTextEmojiconEditText) findViewById6;
        this.f103615f = richTextEmojiconEditText;
        if (richTextEmojiconEditText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText.setPadding(0, 0, 0, 0);
        View view7 = this.f103612c;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById7 = view7.findViewById(R.id.post_draft_dot);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "mRootView.findViewById(R.id.post_draft_dot)");
        this.f103629u = (ImageView) findViewById7;
        View view8 = this.f103612c;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById8 = view8.findViewById(R.id.combined_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "mRootView.findViewById(R.id.combined_btn)");
        this.f103630v = (ImageView) findViewById8;
        View view9 = this.f103612c;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById9 = view9.findViewById(R.id.post_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById9, "mRootView.findViewById(R.id.post_layout)");
        this.f103631w = findViewById9;
        View view10 = this.f103612c;
        if (view10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById10 = view10.findViewById(R.id.normal_message_et_layout);
        Intrinsics.checkExpressionValueIsNotNull(findViewById10, "mRootView.findViewById(R…normal_message_et_layout)");
        this.f103632x = (LinearLayout) findViewById10;
        View view11 = this.f103612c;
        if (view11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById11 = view11.findViewById(R.id.et_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById11, "mRootView.findViewById(R.id.et_container)");
        this.f103633y = (LinearLayout) findViewById11;
        View view12 = this.f103612c;
        if (view12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById12 = view12.findViewById(R.id.top_drawer);
        Intrinsics.checkExpressionValueIsNotNull(findViewById12, "mRootView.findViewById(R.id.top_drawer)");
        this.f103595B = (ViewGroup) findViewById12;
        View view13 = this.f103612c;
        if (view13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById13 = view13.findViewById(R.id.bottom_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById13, "mRootView.findViewById(R.id.bottom_container)");
        this.f103594A = (ViewGroup) findViewById13;
        View view14 = this.f103612c;
        if (view14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById14 = view14.findViewById(R.id.img_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById14, "mRootView.findViewById(R.id.img_container)");
        this.f103596C = (FrameLayout) findViewById14;
        View view15 = this.f103612c;
        if (view15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById15 = view15.findViewById(R.id.images_container);
        Intrinsics.checkExpressionValueIsNotNull(findViewById15, "mRootView.findViewById(R.id.images_container)");
        this.f103597D = (RecyclerView) findViewById15;
        FrameLayout frameLayout = this.f103596C;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImageContainer");
        }
        frameLayout.setVisibility(8);
        RecyclerView recyclerView = this.f103597D;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImagesContainer");
        }
        recyclerView.setVisibility(8);
        View view16 = this.f103612c;
        if (view16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view16.findViewById(R.id.input_and_reply_zone).setOnClickListener(View$OnClickListenerC40775f.f103638a);
        mo147251a(this.f103608O);
        RichTextEmojiconEditText richTextEmojiconEditText2 = this.f103615f;
        if (richTextEmojiconEditText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText2.setHintTextColor(this.f103609P);
        m161339x();
        m161340y();
        if (this.f103607N) {
            View view17 = this.f103631w;
            if (view17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
            }
            view17.setVisibility(8);
        } else {
            View view18 = this.f103631w;
            if (view18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputLayout");
            }
            view18.setVisibility(0);
            ImageView imageView = this.f103630v;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPostInputBtn");
            }
            imageView.setOnClickListener(new View$OnClickListenerC40777h(this));
        }
        RichTextEmojiconEditText richTextEmojiconEditText3 = this.f103615f;
        if (richTextEmojiconEditText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText3.setInputType(212993);
        InputFilter[] inputFilterArr = this.f103606M;
        if (inputFilterArr != null) {
            RichTextEmojiconEditText richTextEmojiconEditText4 = this.f103615f;
            if (richTextEmojiconEditText4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText4.setFilters(inputFilterArr);
        }
        ImageView imageView2 = this.f103627s;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCloseReplyBtn");
        }
        imageView2.setOnClickListener(new View$OnClickListenerC40779i(this));
        RichTextEmojiconEditText richTextEmojiconEditText5 = this.f103615f;
        if (richTextEmojiconEditText5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        View view19 = this.f103619j;
        if (view19 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSendBtn");
        }
        mo147008a(richTextEmojiconEditText5, view19);
        if (DesktopUtil.m144301a((Context) activity)) {
            RichTextEmojiconEditText richTextEmojiconEditText6 = this.f103615f;
            if (richTextEmojiconEditText6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText6.setOnEditorActionListener(new C40780j(this));
            RichTextEmojiconEditText richTextEmojiconEditText7 = this.f103615f;
            if (richTextEmojiconEditText7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
            }
            richTextEmojiconEditText7.setOnKeyListener(new View$OnKeyListenerC40781k(this));
        }
        RichTextEmojiconEditText richTextEmojiconEditText8 = this.f103615f;
        if (richTextEmojiconEditText8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText8.setOnFocusChangeListener(View$OnFocusChangeListenerC40783l.f103647a);
        RichTextEmojiconEditText richTextEmojiconEditText9 = this.f103615f;
        if (richTextEmojiconEditText9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText9.addTextChangedListener(new C40784m(this));
        RichTextEmojiconEditText richTextEmojiconEditText10 = this.f103615f;
        if (richTextEmojiconEditText10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText10.setOnPasteListener(new C40785n(this));
        RichTextEmojiconEditText richTextEmojiconEditText11 = this.f103615f;
        if (richTextEmojiconEditText11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText11.setOnSizeChangeListener(new C40776g(this));
        View view20 = this.f103612c;
        if (view20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        if (view20.getLayoutParams() instanceof FrameLayout.LayoutParams) {
            View view21 = this.f103612c;
            if (view21 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View view22 = this.f103612c;
            if (view22 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            ViewGroup.LayoutParams layoutParams = view22.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 80;
                view21.setLayoutParams(layoutParams2);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        RichTextEmojiconEditText richTextEmojiconEditText12 = this.f103615f;
        if (richTextEmojiconEditText12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMsgInputET");
        }
        richTextEmojiconEditText12.setVerticalScrollBarEnabled(false);
        Function0<Unit> function0 = this.f103600G;
        if (function0 != null) {
            function0.invoke();
        }
        View view23 = this.f103612c;
        if (view23 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        if (view23 != null) {
            mo147007a((ViewGroup) view23, activity);
            View view24 = this.f103612c;
            if (view24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            return view24;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public TextInputSupportPlugin(boolean z, CharSequence charSequence, int i, AbstractC58541b bVar, OnSendTextCallback bVar2, IOnLifeCallback aVar, boolean z2) {
        Intrinsics.checkParameterIsNotNull(charSequence, "hint");
        Intrinsics.checkParameterIsNotNull(bVar, "onPasteListener");
        Intrinsics.checkParameterIsNotNull(bVar2, "onSendTextCallback");
        this.f103607N = z;
        this.f103608O = charSequence;
        this.f103609P = i;
        this.f103622m = bVar;
        this.f103623n = bVar2;
        this.f103610Q = aVar;
        this.f103624o = z2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Reflection.getOrCreateKotlinClass(VoiceKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(AtKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(FaceKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(PhotoKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(ThreadPhotoKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(BurnLifeKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(PlusKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(PlusKBDesktopPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(UploadLogKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(DesktopFaceKBPlugin.class));
        arrayList.add(Reflection.getOrCreateKotlinClass(ScreenShotDesktopPlugin.class));
        this.f103602I = arrayList;
        this.f103603J = true;
        this.f103605L = true;
    }
}
