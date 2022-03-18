package com.ss.android.lark.keyboard.plugin.tool.face;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.NetworkUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.C40673a;
import com.ss.android.lark.keyboard.C40683h;
import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointExtraParams;
import com.ss.android.lark.keyboard.hitpoint.KeyboardHitPointNew;
import com.ss.android.lark.keyboard.p2073b.C40675a;
import com.ss.android.lark.keyboard.p2074c.C40679d;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40941e;
import com.ss.android.lark.keyboard.widget.IPanel;
import com.ss.android.lark.keyboard.widget.KeyboardPanelsFacade;
import com.ss.android.lark.keyboard.widget.StickerTabItemView;
import com.ss.android.lark.keyboard.widget.emoji.EmojiMapHandler;
import com.ss.android.lark.keyboard.widget.emoji.EmojiOperator;
import com.ss.android.lark.keyboard.widget.emoji.EmojiPanel;
import com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency;
import com.ss.android.lark.keyboard.widget.emoji.base.EmojiPageBaseFragment;
import com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener;
import com.ss.android.lark.keyboard.widget.emoji.v2.EmojiHitPoint;
import com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageNewFragment2;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.statistics.extensions.C54952a;
import com.ss.android.lark.util.share_preference.UserSP;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C69121n;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018*\u0004\u001c\u001f&*\b\u0016\u0018\u0000 b2\u00020\u0001:\u0001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000202H\u0002J\b\u00104\u001a\u00020\u0011H\u0002J\b\u00105\u001a\u00020\u0011H\u0002J\b\u00106\u001a\u000202H\u0002J\b\u00107\u001a\u000202H\u0002J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000202H\u0002J\b\u0010<\u001a\u000202H\u0002J\n\u0010=\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010>\u001a\u0002022\u0006\u0010?\u001a\u00020:H\u0002J\b\u0010@\u001a\u000202H\u0002J\b\u0010A\u001a\u000202H\u0002J\b\u0010B\u001a\u00020\u0003H\u0002J\u0018\u0010C\u001a\u00020\u00032\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GH\u0016J\u0010\u0010H\u001a\u0002022\u0006\u0010?\u001a\u00020:H\u0016J\u0018\u0010I\u001a\u00020\u00112\u0006\u00109\u001a\u00020:2\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020\u00112\u0006\u00109\u001a\u00020:H\u0016J\b\u0010M\u001a\u000202H\u0016J\u0010\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020\u0003H\u0016J\u0010\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u00020\u0003H\u0016J\u0010\u0010R\u001a\u0002022\u0006\u0010S\u001a\u00020\u0003H\u0016J\b\u0010T\u001a\u000202H\u0016J\b\u0010U\u001a\u000202H\u0016J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0016J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\u0003H\u0016J\b\u0010Z\u001a\u000202H\u0002J\b\u0010[\u001a\u000202H\u0002J\u0010\u0010\\\u001a\u0002022\u0006\u0010]\u001a\u00020\rH\u0016J\u000e\u0010^\u001a\u0002022\u0006\u0010_\u001a\u00020$J\u0010\u0010`\u001a\u0002022\u0006\u0010a\u001a\u00020\u0003H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u00020&X\u0004¢\u0006\u0004\n\u0002\u0010'R\u000e\u0010(\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020*X\u0004¢\u0006\u0004\n\u0002\u0010+R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000¨\u0006c"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "isShowCollectedEmoji", "", "isDarkStyle", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "faceDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "(ZZLandroidx/fragment/app/FragmentManager;Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;)V", "localCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mCurrentStickerSetId", "", "mDeleteEmojiBtn", "Landroid/view/View;", "mEmojiDependency", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "mEmojiPanel", "Lcom/ss/android/lark/keyboard/widget/IPanel;", "mEmojiSettingBtn", "mEmoticonShopBtn", "mEmoticonTabs", "Lcom/google/android/material/tabs/TabLayout;", "mIcon", "mOnEmojiOperationListener", "com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mOnEmojiOperationListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mOnEmojiOperationListener$1;", "mOnOperationListener", "com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mOnOperationListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mOnOperationListener$1;", "mPagerFaceCategory", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceViewPager;", "mPluginClickListener", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IPluginClickListener;", "mPushStickerSetListener", "com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mPushStickerSetListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mPushStickerSetListener$1;", "mRootView", "mStickerDependency", "com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mStickerDependency$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mStickerDependency$1;", "mStickerFragmentList", "", "Landroidx/fragment/app/Fragment;", "newAdapter", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePagerNewAdapter;", "changeCollectBtnVisibility", "", "clearStickerSetCacheIfNeed", "createIcon", "createRootView", "doBackSpace", "getLocalStickerSets", "init", "parent", "Landroid/view/ViewGroup;", "initAdapter", "initEmojiList", "initEmojiPanel", "initPanelViewIfNeed", "pluginContainer", "initSticker", "initTab", "isPostInputMode", "onActivityResult", "requestCode", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "onCreateIcon", "notifier", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$ITouchActionNotifier;", "onCreatePluginPanel", "onDestroy", "onEnableChanged", "isEnable", "onKeyboardChanged", "shown", "onReplyModeChanged", "replyMode", "onRestart", "onStart", "onStickerSetReady", "onStop", "onVisibleChanged", "isVisible", "preDownloadIfNeeded", "sendFacePanelHitPoint", "setKeyBoardContext", "context", "setPluginClickListener", "listener", "updateTabRelativePosition", "hiddenShop", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d */
public class FaceKBPlugin implements IKeyBoardPlugin {

    /* renamed from: A */
    private static String f104086A = "";

    /* renamed from: k */
    public static boolean f104087k;

    /* renamed from: l */
    public static List<StickerSet> f104088l = new ArrayList();

    /* renamed from: m */
    public static final Companion f104089m = new Companion(null);

    /* renamed from: a */
    public View f104090a;

    /* renamed from: b */
    public FaceViewPager f104091b;

    /* renamed from: c */
    public View f104092c;

    /* renamed from: d */
    public View f104093d;

    /* renamed from: e */
    public IPanel f104094e;

    /* renamed from: f */
    public List<Fragment> f104095f = new ArrayList();

    /* renamed from: g */
    public String f104096g = "";

    /* renamed from: h */
    public IKeyBoardPlugin.IPluginClickListener f104097h;

    /* renamed from: i */
    public IKeyBoardPlugin.IKeyBoardContext f104098i;

    /* renamed from: j */
    public final IFaceDependency f104099j;

    /* renamed from: n */
    private View f104100n;

    /* renamed from: o */
    private View f104101o;

    /* renamed from: p */
    private TabLayout f104102p;

    /* renamed from: q */
    private CallbackManager f104103q = new CallbackManager();

    /* renamed from: r */
    private FacePagerNewAdapter f104104r;

    /* renamed from: s */
    private final C40958n f104105s = new C40958n(this);

    /* renamed from: t */
    private final C40957m f104106t = new C40957m(this);

    /* renamed from: u */
    private IEmojiDependency f104107u = new C40956l(this);

    /* renamed from: v */
    private final C40960p f104108v = new C40960p(this);

    /* renamed from: w */
    private final C40959o f104109w = new C40959o(this);

    /* renamed from: x */
    private final boolean f104110x;

    /* renamed from: y */
    private final boolean f104111y;

    /* renamed from: z */
    private final FragmentManager f104112z;

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

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: j */
    public void mo147306j() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$Companion;", "", "()V", "KEY_STICKER_SET_ID", "", "TAG", "mStickerSetList", "", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "sCurrUserId", "sHasPreDownloaded", "", "getSHasPreDownloaded", "()Z", "setSHasPreDownloaded", "(Z)V", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$initEmojiPanel$1", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator;", "onBackSpace", "", "onSelectEmoji", "emojiResult", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator$EmojiResult;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$j */
    public static final class C40954j implements EmojiOperator {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104120a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiOperator
        /* renamed from: a */
        public void mo147520a() {
            this.f104120a.mo147602c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40954j(FaceKBPlugin dVar) {
            this.f104120a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiOperator
        /* renamed from: a */
        public void mo147521a(EmojiOperator.EmojiResult aVar) {
            String b;
            EditText l;
            Intrinsics.checkParameterIsNotNull(aVar, "emojiResult");
            String a = EmojiMapHandler.m162993a(aVar.mo148250a());
            if (a != null && (b = EmojiMapHandler.m162994b(aVar.mo148250a())) != null && (l = FaceKBPlugin.m162149a(this.f104120a).mo147381z().mo146904l()) != null) {
                int selectionStart = l.getSelectionStart();
                Editable editableText = l.getEditableText();
                if (selectionStart < 0 || selectionStart >= editableText.length()) {
                    editableText.append((CharSequence) a);
                } else {
                    editableText.insert(selectionStart, a);
                }
                this.f104120a.f104099j.mo127082a(b);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mOnEmojiOperationListener$1", "Lcom/ss/android/lark/keyboard/widget/emoji/base/OnEmojiOperationListener;", "onBackSpace", "", "selectedEmoji", "reactionKey", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$m */
    public static final class C40957m implements OnEmojiOperationListener {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104123a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener
        /* renamed from: a */
        public void mo147529a() {
            this.f104123a.mo147602c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40957m(FaceKBPlugin dVar) {
            this.f104123a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener
        /* renamed from: a */
        public void mo147530a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            EditText l = FaceKBPlugin.m162149a(this.f104123a).mo147381z().mo146904l();
            if (l != null) {
                String a = EmojiMapHandler.m162993a(str);
                String b = EmojiMapHandler.m162994b(str);
                if (b != null) {
                    int selectionStart = l.getSelectionStart();
                    Editable editableText = l.getEditableText();
                    if (selectionStart < 0 || selectionStart >= editableText.length()) {
                        editableText.append((CharSequence) a);
                    } else {
                        editableText.insert(selectionStart, a);
                    }
                    this.f104123a.f104099j.mo127082a(b);
                }
            }
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: k */
    public boolean mo147307k() {
        return IKeyBoardPlugin.C40806a.m161551a(this);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$g */
    public static final class C40951g extends Lambda implements Function0<Unit> {
        final /* synthetic */ FaceKBPlugin this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40951g(FaceKBPlugin dVar) {
            super(0);
            this.this$0 = dVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IPanel cVar = this.this$0.f104094e;
            if (cVar != null) {
                cVar.mo148236b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016JH\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016JP\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H\u0016Jb\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J.\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¨\u0006%"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mStickerDependency$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/sticker/IStickerDependency;", "getLocalStickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "stickerKey", "", "width", "", "height", "getLocalStickers", "", "Lcom/ss/android/lark/chat/entity/sticker/Sticker;", "getStickers", "loadSticker", "", "context", "Landroid/content/Context;", "permanent", "", "key", "view", "Landroid/widget/ImageView;", "placeholder", "errorRes", "path", "listener", "Lcom/ss/android/lark/image/api/RequestListener;", "registerStickerPushListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerListener;", "unRegisterStickerPushListener", "uploadStickers", "stickerUrls", "", "keepOrigin", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/keyboard/plugin/tool/face/UploadStickerResult;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$p */
    public static final class C40960p implements AbstractC40930c {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104126a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: b */
        public List<Sticker> mo147540b() {
            return this.f104126a.f104099j.mo127085b();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public List<Sticker> mo147535a() {
            return this.f104126a.f104099j.mo127072a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40960p(FaceKBPlugin dVar) {
            this.f104126a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: b */
        public void mo147541b(IPushStickerListener hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "listener");
            this.f104126a.f104099j.mo127088b(hVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147538a(IPushStickerListener hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "listener");
            this.f104126a.f104099j.mo127079a(hVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public C40964l mo147534a(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "stickerKey");
            return this.f104126a.f104099j.mo127071a(str, i, i2);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147539a(List<String> list, boolean z, IGetDataCallback<C40966m> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f104126a.f104099j.mo127084a(list, z, iGetDataCallback);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147536a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(imageView, "view");
            this.f104126a.f104099j.mo127075a(context, z, i, i2, str, imageView, i3, i4);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147537a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h<?, ?> hVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(imageView, "view");
            Intrinsics.checkParameterIsNotNull(str2, "path");
            this.f104126a.f104099j.mo127077a(context, z, i, i2, str, imageView, i3, i4, str2, hVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "queueIdle"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$q */
    static final class C40961q implements MessageQueue.IdleHandler {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104127a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f104128b;

        C40961q(FaceKBPlugin dVar, ViewGroup viewGroup) {
            this.f104127a = dVar;
            this.f104128b = viewGroup;
        }

        public final boolean queueIdle() {
            Log.m165389i("FaceKBPlugin", "IdleHandler initPanelView");
            this.f104127a.mo147603c(this.f104128b);
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mPushStickerSetListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerSetListener;", "onDataChanged", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$o */
    public static final class C40959o implements IPushStickerSetListener {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104125a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerSetListener
        /* renamed from: a */
        public void mo147533a() {
            Log.m165379d("FaceKBPluginNew", "onDataChanged called. receive stickerSet push.");
            FaceKBPlugin.f104088l.clear();
            this.f104125a.mo147605e();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40959o(FaceKBPlugin dVar) {
            this.f104125a = dVar;
        }
    }

    /* renamed from: q */
    private final void m162159q() {
        String d = this.f104099j.mo127092d();
        if (!Intrinsics.areEqual(f104086A, d)) {
            Log.m165389i("FaceKBPluginNew", "clear stickerSet cache");
            f104088l.clear();
        }
        f104086A = d;
    }

    /* renamed from: m */
    private final View m162155m() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104098i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        AppCompatImageView a = C40679d.m160786a(bVar.mo147365B(), R.id.toolbox_btn_emoji, R.drawable.ud_icon_emoji_outlined);
        Intrinsics.checkExpressionValueIsNotNull(a, "KBViewUtil.createIconVie…e.ud_icon_emoji_outlined)");
        return a;
    }

    /* renamed from: p */
    private final void m162158p() {
        if (!f104087k) {
            IKeyBoardPlugin.IKeyBoardContext bVar = this.f104098i;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            if (NetworkUtils.m94914a(bVar.mo147365B())) {
                Log.m165389i("FaceKBPlugin", "start pre download sticker set.");
                this.f104099j.mo127091c();
                f104087k = true;
            }
        }
    }

    /* renamed from: r */
    private final void m162160r() {
        if (mo147604d()) {
            m162154f(true);
            FaceViewPager faceViewPager = this.f104091b;
            if (faceViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
            }
            faceViewPager.setCurrentItem(0, false);
            FaceViewPager faceViewPager2 = this.f104091b;
            if (faceViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
            }
            faceViewPager2.setEnableScroll(false);
        } else if (this.f104110x) {
            m162154f(false);
            FaceViewPager faceViewPager3 = this.f104091b;
            if (faceViewPager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
            }
            faceViewPager3.setEnableScroll(true);
        }
    }

    /* renamed from: b */
    public final void mo147601b() {
        if (!CollectionUtils.isEmpty(this.f104095f) && (this.f104095f.get(0) instanceof EmojiPageNewFragment2)) {
            IFaceDependency gVar = this.f104099j;
            UIGetDataCallback wrapAndAddGetDataCallback = this.f104103q.wrapAndAddGetDataCallback(new C40953i(this));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "localCallbackManager.wra…    }\n\n                })");
            gVar.mo127087b(wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: c */
    public final void mo147602c() {
        KeyEvent keyEvent = new KeyEvent(0, 0, 0, 67, 0, 0, 0, 0, 6);
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104098i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        EditText l = bVar.mo147381z().mo146904l();
        if (l != null) {
            l.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: d */
    public final boolean mo147604d() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104098i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        if (bVar.mo147381z().mo146905m() != IOutInputSupport.InputSupportType.POSTINPUT) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104098i;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            if (bVar2.mo147381z().mo146905m() == IOutInputSupport.InputSupportType.THREADPOSTINPUT) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo147605e() {
        if (!f104088l.isEmpty()) {
            Log.m165389i("FaceKBPluginNew", "getLocalStickerSets, return from cache.");
            mo147606f();
        }
        this.f104099j.mo127078a(new UIGetDataCallback(new C40946b(this)));
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: h */
    public void mo147304h() {
        this.f104099j.mo127080a(this.f104109w);
        this.f104099j.mo127095g();
        View view = this.f104100n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        View view2 = this.f104090a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view2.setVisibility(0);
        m162162t();
        m162160r();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: i */
    public void mo147305i() {
        this.f104099j.mo127089b(this.f104109w);
        View view = this.f104100n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(false);
        View view2 = this.f104090a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view2.setVisibility(8);
    }

    /* renamed from: s */
    private final Fragment m162161s() {
        if (FaceFgUtil.m162148a()) {
            IPanel a = new KeyboardPanelsFacade().mo148279a(new C40954j(this), new C40955k(this));
            a.mo148236b();
            this.f104094e = a;
            if (a != null) {
                return a.mo148235a();
            }
            return null;
        }
        EmojiPageNewFragment2 cVar = new EmojiPageNewFragment2();
        cVar.mo148271a(this.f104099j.mo127093e(), this.f104099j.mo127094f());
        EmojiHitPoint.f104831a.mo148263a();
        return cVar;
    }

    /* renamed from: t */
    private final void m162162t() {
        this.f104096g = "";
        this.f104095f.clear();
        TabLayout tabLayout = this.f104102p;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        tabLayout.mo78248d();
        FacePagerNewAdapter eVar = this.f104104r;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar.notifyDataSetChanged();
        Fragment s = m162161s();
        if (s != null) {
            this.f104095f.add(s);
        }
        if (this.f104110x && !mo147604d()) {
            C40923b d = C40923b.m162053d();
            List<Fragment> list = this.f104095f;
            Intrinsics.checkExpressionValueIsNotNull(d, "facePageFragmentWrapper");
            list.add(d);
        }
        FacePagerNewAdapter eVar2 = this.f104104r;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar2.notifyDataSetChanged();
        mo147607l();
        if (!this.f104110x || mo147604d()) {
            FacePagerNewAdapter eVar3 = this.f104104r;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar3.notifyDataSetChanged();
            mo147607l();
            return;
        }
        mo147605e();
    }

    /* renamed from: a */
    public final void mo147599a() {
        boolean z;
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104098i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        KeyboardScene b = bVar.mo147372b();
        if (C40683h.m160851a(b).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f104098i;
            if (bVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            KeyboardHitPointNew.m160872a(C40683h.m160851a(b), C54952a.m213204a(KeyboardHitPointExtraParams.Click.INPUT_EMOJI.plus(KeyboardHitPointExtraParams.Target.PUBLIC_EMOJI_PANEL_SELECT_VIEW).plus(C40673a.m160698a(bVar2.mo147381z().mo146903h())), C40683h.m160856f(b)));
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: g */
    public void mo147303g() {
        this.f104099j.mo127080a(this.f104109w);
        this.f104099j.mo127095g();
        View view = this.f104100n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setSelected(true);
        View view2 = this.f104090a;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        view2.setVisibility(0);
        View view3 = this.f104090a;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View view4 = this.f104090a;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
        layoutParams.height = -2;
        view3.setLayoutParams(layoutParams);
        m162162t();
        m162160r();
    }

    /* renamed from: o */
    private final void m162157o() {
        FacePagerNewAdapter eVar = new FacePagerNewAdapter(this.f104112z, this.f104095f);
        this.f104104r = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar.mo147616a(this.f104105s);
        if (FaceFgUtil.m162148a()) {
            FacePagerNewAdapter eVar2 = this.f104104r;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar2.mo147619a(new C40951g(this));
        } else {
            FacePagerNewAdapter eVar3 = this.f104104r;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar3.mo147618a(this.f104107u);
            FacePagerNewAdapter eVar4 = this.f104104r;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar4.mo147617a(this.f104106t);
        }
        FacePagerNewAdapter eVar5 = this.f104104r;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar5.mo147615a(this.f104108v);
        FaceViewPager faceViewPager = this.f104091b;
        if (faceViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        FacePagerNewAdapter eVar6 = this.f104104r;
        if (eVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        faceViewPager.setAdapter(eVar6);
        TabLayout tabLayout = this.f104102p;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        FaceViewPager faceViewPager2 = this.f104091b;
        if (faceViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        tabLayout.setupWithViewPager(faceViewPager2);
        FaceViewPager faceViewPager3 = this.f104091b;
        if (faceViewPager3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        faceViewPager3.addOnPageChangeListener(new C40952h(this));
    }

    /* renamed from: f */
    public final void mo147606f() {
        C40941e eVar;
        String string = UserSP.getInstance().getString("sticker_set_id");
        int i = -1;
        int i2 = 0;
        for (T t : f104088l) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            int i4 = i2 + 2;
            if (i4 >= this.f104095f.size() || !(this.f104095f.get(i4) instanceof C40941e)) {
                eVar = C40941e.m162105a();
                Intrinsics.checkExpressionValueIsNotNull(eVar, "StickerPageFragment.newInstance()");
                this.f104095f.add(eVar);
            } else {
                Fragment fragment = this.f104095f.get(i4);
                if (fragment != null) {
                    eVar = (C40941e) fragment;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.plugin.tool.face.sticker.StickerPageFragment");
                }
            }
            eVar.mo147591a((StickerSet) t2);
            if (TextUtils.equals(t2.getStickerSetId(), string) || TextUtils.equals(t2.getStickerSetId(), this.f104096g)) {
                i = i4;
            }
            i2 = i3;
        }
        while (this.f104095f.size() > f104088l.size() + 2) {
            List<Fragment> list = this.f104095f;
            list.remove(CollectionsKt.getLastIndex(list));
        }
        FacePagerNewAdapter eVar2 = this.f104104r;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar2.notifyDataSetChanged();
        mo147607l();
        if (i >= 0) {
            FaceViewPager faceViewPager = this.f104091b;
            if (faceViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
            }
            faceViewPager.setCurrentItem(i, true);
            UserSP.getInstance().remove("sticker_set_id");
            return;
        }
        FaceViewPager faceViewPager2 = this.f104091b;
        if (faceViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        faceViewPager2.setCurrentItem(0, true);
    }

    /* renamed from: l */
    public final void mo147607l() {
        TabLayout tabLayout = this.f104102p;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        int tabCount = tabLayout.getTabCount();
        int i = 0;
        while (true) {
            if (i >= tabCount) {
                break;
            }
            TabLayout tabLayout2 = this.f104102p;
            if (tabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            TabLayout.C22451f a = C40675a.m160761a(tabLayout2, i);
            if (a == null) {
                break;
            }
            TabLayout tabLayout3 = this.f104102p;
            if (tabLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            Context context = tabLayout3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mEmoticonTabs.context");
            StickerTabItemView stickerTabItemView = new StickerTabItemView(context, null, 0, 6, null);
            if (a.mo78310a() != null && (a.mo78310a() instanceof StickerTabItemView)) {
                a.mo78313a((View) null);
            }
            if (i == 0) {
                stickerTabItemView.setTabIcon(R.drawable.tab_bottom_emoji);
            } else if (i != 1) {
                int i2 = i - 2;
                if (f104088l.size() <= i2) {
                    Log.m165383e("FaceKBPluginNew", "initTab called. tab index is illegal");
                    break;
                }
                stickerTabItemView.setFaceDependency(this.f104099j);
                StickerSet stickerSet = f104088l.get(i2);
                if (stickerSet == null) {
                    stickerTabItemView.setTabIcon(R.drawable.ic_icon_sticker_tab_default);
                    a.mo78313a(stickerTabItemView);
                } else {
                    Image icon = stickerSet.getIcon();
                    if (icon == null) {
                        stickerTabItemView.setTabIcon(R.drawable.ic_icon_sticker_tab_default);
                        a.mo78313a(stickerTabItemView);
                    } else {
                        String key = icon.getKey();
                        Intrinsics.checkExpressionValueIsNotNull(key, "icon.key");
                        String stickerSetId = stickerSet.getStickerSetId();
                        Intrinsics.checkExpressionValueIsNotNull(stickerSetId, "stickerSet.stickerSetId");
                        stickerTabItemView.mo148225a(key, stickerSetId);
                    }
                }
                i++;
            } else {
                stickerTabItemView.setTabIcon(R.drawable.collection_emoji);
            }
            a.mo78313a(stickerTabItemView);
            i++;
        }
        TabLayout tabLayout4 = this.f104102p;
        if (tabLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        tabLayout4.setTabMode(0);
    }

    /* renamed from: n */
    private final View m162156n() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f104098i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        Activity B = bVar.mo147365B();
        RelativeLayout relativeLayout = new RelativeLayout(B);
        relativeLayout.setId(R.id.toolbox_layout_face);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RelativeLayout relativeLayout2 = new RelativeLayout(B);
        relativeLayout2.setId(R.id.bottom_tab);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, UIUtils.dp2px(B, 40.0f));
        relativeLayout2.setBackgroundColor(UIUtils.getColor(B, R.color.bg_body));
        layoutParams.addRule(12, -1);
        relativeLayout.addView(relativeLayout2, layoutParams);
        ImageView imageView = new ImageView(B);
        imageView.setId(R.id.emoticon_shop_btn);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(UIUtils.dp2px(B, 49.5f), UIUtils.dp2px(B, 40.0f));
        layoutParams2.addRule(9, -1);
        layoutParams2.addRule(15, -1);
        imageView.setPadding(UIUtils.dp2px(B, 14.5f), UIUtils.dp2px(B, 8.5f), UIUtils.dp2px(B, 14.5f), UIUtils.dp2px(B, 8.0f));
        imageView.setImageDrawable(UDIconUtils.getIconDrawable(B, (int) R.drawable.ic_icon_sticker_add, UIUtils.getColor(B, R.color.icon_n1)));
        relativeLayout2.addView(imageView, layoutParams2);
        View inflate = LayoutInflater.from(B).inflate(R.layout.kb_plugin_face_new_tablayout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "tabLayout");
        inflate.setId(R.id.emotion_tabs);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, UIUtils.dp2px(B, 40.0f));
        layoutParams3.addRule(0, R.id.bottom_setting_panel);
        layoutParams3.addRule(1, R.id.emoticon_shop_btn);
        relativeLayout2.addView(inflate, layoutParams3);
        FrameLayout frameLayout = new FrameLayout(B);
        frameLayout.setId(R.id.bottom_setting_panel);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(11, -1);
        layoutParams4.addRule(15, -1);
        relativeLayout2.addView(frameLayout, layoutParams4);
        ImageView imageView2 = new ImageView(B);
        imageView2.setId(R.id.back_emoji);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(UIUtils.dp2px(B, 49.5f), UIUtils.dp2px(B, 40.0f));
        layoutParams5.gravity = 17;
        imageView2.setBackground(UIUtils.getDrawable(B, R.drawable.ic_icon_sticker_setting_bg));
        imageView2.setPadding(UIUtils.dp2px(B, 14.5f), UIUtils.dp2px(B, 8.5f), UIUtils.dp2px(B, 14.5f), UIUtils.dp2px(B, 8.0f));
        imageView2.setImageDrawable(UDIconUtils.getIconDrawable(B, (int) R.drawable.ud_icon_delete_outlined, UIUtils.getColor(B, R.color.icon_n3)));
        imageView2.setVisibility(0);
        frameLayout.addView(imageView2, layoutParams5);
        ImageView imageView3 = new ImageView(B);
        imageView3.setId(R.id.emoji_setting_btn);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(UIUtils.dp2px(B, 49.5f), UIUtils.dp2px(B, 40.0f));
        imageView3.setBackground(UIUtils.getDrawable(B, R.drawable.ic_icon_sticker_setting_bg));
        imageView3.setPadding(UIUtils.dp2px(B, 14.5f), UIUtils.dp2px(B, 8.5f), UIUtils.dp2px(B, 14.5f), UIUtils.dp2px(B, 8.0f));
        imageView3.setImageDrawable(UDIconUtils.getIconDrawable(B, (int) R.drawable.ud_icon_setting_outlined, UIUtils.getColor(B, R.color.icon_n1)));
        imageView3.setVisibility(8);
        frameLayout.addView(imageView3, layoutParams6);
        FaceViewPager faceViewPager = new FaceViewPager(B, null, 2, null);
        faceViewPager.setId(R.id.toolbox_pagers_face);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, R.id.bottom_tab);
        faceViewPager.setBackgroundColor(UIUtils.getColor(B, R.color.bg_base));
        relativeLayout.addView(faceViewPager, layoutParams7);
        return relativeLayout;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: c */
    public void mo147297c(boolean z) {
        IKeyBoardPlugin.C40806a.m161550a(this, z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$getLocalStickerSets$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$b */
    public static final class C40946b implements IGetDataCallback<List<? extends StickerSet>> {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104113a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40946b(FaceKBPlugin dVar) {
            this.f104113a = dVar;
        }

        /* renamed from: a */
        public void onSuccess(List<? extends StickerSet> list) {
            if (list != null) {
                FaceKBPlugin.f104088l = C69121n.m265989f(list);
                this.f104113a.mo147606f();
            }
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f104113a.mo147607l();
            FaceKBPlugin.m162152d(this.f104113a).setCurrentItem(0, true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$e */
    public static final class View$OnClickListenerC40949e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104116a;

        View$OnClickListenerC40949e(FaceKBPlugin dVar) {
            this.f104116a = dVar;
        }

        public final void onClick(View view) {
            this.f104116a.mo147602c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$initAdapter$2", "Landroidx/viewpager/widget/ViewPager$SimpleOnPageChangeListener;", "onPageSelected", "", "position", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$h */
    public static final class C40952h extends ViewPager.C1581f {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104118a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40952h(FaceKBPlugin dVar) {
            this.f104118a = dVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener, androidx.viewpager.widget.ViewPager.C1581f
        public void onPageSelected(int i) {
            Fragment fragment = this.f104118a.f104095f.get(i);
            if (fragment instanceof EmojiPageBaseFragment) {
                new FaceKBPluginHitPoint("emoji").mo147285c();
            } else if (fragment instanceof C40923b) {
                new FaceKBPluginHitPoint("stickerpack").mo147285c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$initEmojiList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$i */
    public static final class C40953i implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104119a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40953i(FaceKBPlugin dVar) {
            this.f104119a = dVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("FaceKBPluginNew", "syncReactionOrder failed");
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Fragment fragment = this.f104119a.f104095f.get(0);
            if (fragment != null) {
                ((EmojiPageNewFragment2) fragment).mo148271a(this.f104119a.f104099j.mo127093e(), this.f104119a.f104099j.mo127094f());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageNewFragment2");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$initEmojiPanel$2", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;", "getPanelData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency$EmojiPanelData;", "isFgEnable", "", "key", "", "showDeleteIcon", "syncReactionOrder", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$k */
    public static final class C40955k implements EmojiPanel.EmojiPanelDependency {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104121a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public boolean mo147525a() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40955k(FaceKBPlugin dVar) {
            this.f104121a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public void mo147523a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            this.f104121a.f104099j.mo127090b(str);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: b */
        public void mo147526b(IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f104121a.f104099j.mo127087b(iGetDataCallback);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public void mo147522a(IGetDataCallback<EmojiPanel.EmojiPanelDependency.EmojiPanelData> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            iGetDataCallback.onSuccess(new EmojiPanel.EmojiPanelDependency.EmojiPanelData(this.f104121a.f104099j.mo127093e(), this.f104121a.f104099j.mo127094f()));
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public void mo147524a(String str, IGetDataCallback<Integer> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f104121a.f104099j.mo127083a(str, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mEmojiDependency$1", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "updateLocalOrder", "", "reactionKey", "", "updateRecentEmojiOrder", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$l */
    public static final class C40956l implements IEmojiDependency {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104122a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40956l(FaceKBPlugin dVar) {
            this.f104122a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency
        /* renamed from: a */
        public void mo147527a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            this.f104122a.f104099j.mo127090b(str);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency
        /* renamed from: a */
        public void mo147528a(String str, IGetDataCallback<Integer> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            this.f104122a.f104099j.mo127083a(str, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$mOnOperationListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/OnOperationListenerAdapter;", "selectAddNewSticker", "", "requestCode", "", "selectedFace", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$n */
    public static final class C40958n implements OnOperationListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104124a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40958n(FaceKBPlugin dVar) {
            this.f104124a = dVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.AbstractC40963j
        /* renamed from: a */
        public void mo147531a(int i) {
            this.f104124a.f104099j.mo127074a(FaceKBPlugin.m162149a(this.f104124a).mo147365B(), i);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.AbstractC40963j
        /* renamed from: a */
        public void mo147532a(C40964l lVar) {
            if (!this.f104124a.mo147604d()) {
                this.f104124a.f104099j.mo127081a(lVar);
                FaceKBPlugin.m162149a(this.f104124a).mo147379v();
                return;
            }
            Log.m165397w("FaceKBPluginNew", "clicking custom emoji in post");
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147290a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f104098i = bVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext m162149a(FaceKBPlugin dVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar = dVar.f104098i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        return bVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m162150b(FaceKBPlugin dVar) {
        View view = dVar.f104092c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteEmojiBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m162151c(FaceKBPlugin dVar) {
        View view = dVar.f104093d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmojiSettingBtn");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ FaceViewPager m162152d(FaceKBPlugin dVar) {
        FaceViewPager faceViewPager = dVar.f104091b;
        if (faceViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        return faceViewPager;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$c */
    public static final class View$OnClickListenerC40947c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104114a;

        View$OnClickListenerC40947c(FaceKBPlugin dVar) {
            this.f104114a = dVar;
        }

        public final void onClick(View view) {
            this.f104114a.f104099j.mo127073a(FaceKBPlugin.m162149a(this.f104114a).mo147365B());
            HitPointHelper.f103322b.mo146887e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$d */
    public static final class View$OnClickListenerC40948d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104115a;

        View$OnClickListenerC40948d(FaceKBPlugin dVar) {
            this.f104115a = dVar;
        }

        public final void onClick(View view) {
            this.f104115a.f104099j.mo127086b(FaceKBPlugin.m162149a(this.f104115a).mo147365B());
            HitPointHelper.f103322b.mo146885c("1");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$r */
    static final class View$OnClickListenerC40962r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104129a;

        /* renamed from: b */
        final /* synthetic */ IKeyBoardPlugin.ITouchActionNotifier f104130b;

        View$OnClickListenerC40962r(FaceKBPlugin dVar, IKeyBoardPlugin.ITouchActionNotifier dVar2) {
            this.f104129a = dVar;
            this.f104130b = dVar2;
        }

        public final void onClick(View view) {
            this.f104130b.mo147313a(this.f104129a);
            IKeyBoardPlugin.IPluginClickListener cVar = this.f104129a.f104097h;
            if (cVar != null) {
                cVar.mo122033a();
            }
            this.f104129a.mo147599a();
        }
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147287a(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Log.m165389i("FaceKBPlugin", "onCreatePluginPanel initPanelView");
        mo147603c(viewGroup);
        View view = this.f104090a;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return view;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: b */
    public void mo147294b(ViewGroup viewGroup) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        Looper.myQueue().addIdleHandler(new C40961q(this, viewGroup));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/FaceKBPlugin$init$6", "Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;", "onTabSelected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.d$f */
    public static final class C40950f extends TabLayout.C22455i {

        /* renamed from: a */
        final /* synthetic */ FaceKBPlugin f104117a;

        @Override // com.google.android.material.tabs.TabLayout.C22455i, com.google.android.material.tabs.TabLayout.AbstractC22445b
        /* renamed from: a */
        public void mo78292a(TabLayout.C22451f fVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(fVar, "tab");
            super.mo78292a(fVar);
            if (fVar.mo78318c() != 0) {
                FaceKBPlugin.m162150b(this.f104117a).setVisibility(8);
                FaceKBPlugin.m162151c(this.f104117a).setVisibility(0);
            } else {
                FaceKBPlugin.m162150b(this.f104117a).setVisibility(0);
                FaceKBPlugin.m162151c(this.f104117a).setVisibility(8);
                if (FaceFgUtil.m162148a()) {
                    IPanel cVar = this.f104117a.f104094e;
                    if (cVar != null) {
                        cVar.mo148237c();
                    }
                } else {
                    this.f104117a.mo147601b();
                }
            }
            FaceKBPlugin dVar = this.f104117a;
            if (fVar.mo78318c() < 2 || !(!FaceKBPlugin.f104088l.isEmpty())) {
                str = "";
            } else {
                str = FaceKBPlugin.f104088l.get(fVar.mo78318c() - 2).getStickerSetId();
                Intrinsics.checkExpressionValueIsNotNull(str, "mStickerSetList[tab.position - 2].stickerSetId");
            }
            dVar.f104096g = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40950f(FaceKBPlugin dVar, ViewPager viewPager) {
            super(viewPager);
            this.f104117a = dVar;
        }
    }

    /* renamed from: f */
    private final void m162154f(boolean z) {
        int i;
        View view = this.f104101o;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonShopBtn");
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        TabLayout tabLayout = this.f104102p;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (z) {
                layoutParams2.addRule(9, -1);
            } else {
                layoutParams2.removeRule(9);
            }
            TabLayout tabLayout2 = this.f104102p;
            if (tabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            tabLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    /* renamed from: c */
    public final void mo147603c(ViewGroup viewGroup) {
        if (this.f104090a == null) {
            m162153d(viewGroup);
            View view = this.f104090a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            viewGroup.addView(view);
            View view2 = this.f104090a;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View view3 = this.f104090a;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            layoutParams.height = 0;
            view2.setLayoutParams(layoutParams);
            m162158p();
        }
    }

    /* renamed from: d */
    private final void m162153d(ViewGroup viewGroup) {
        if (this.f104090a == null) {
            m162159q();
            View n = m162156n();
            this.f104090a = n;
            if (n == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById = n.findViewById(R.id.toolbox_pagers_face);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.toolbox_pagers_face)");
            FaceViewPager faceViewPager = (FaceViewPager) findViewById;
            this.f104091b = faceViewPager;
            if (faceViewPager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
            }
            faceViewPager.setOffscreenPageLimit(2);
            View view = this.f104090a;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById2 = view.findViewById(R.id.emotion_tabs);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.emotion_tabs)");
            this.f104102p = (TabLayout) findViewById2;
            View view2 = this.f104090a;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById3 = view2.findViewById(R.id.emoticon_shop_btn);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.emoticon_shop_btn)");
            this.f104101o = findViewById3;
            View view3 = this.f104090a;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById4 = view3.findViewById(R.id.back_emoji);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById<View>(R.id.back_emoji)");
            this.f104092c = findViewById4;
            View view4 = this.f104090a;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            View findViewById5 = view4.findViewById(R.id.emoji_setting_btn);
            Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById<V…>(R.id.emoji_setting_btn)");
            this.f104093d = findViewById5;
            View view5 = this.f104101o;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonShopBtn");
            }
            view5.setOnClickListener(new View$OnClickListenerC40947c(this));
            View view6 = this.f104093d;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmojiSettingBtn");
            }
            view6.setOnClickListener(new View$OnClickListenerC40948d(this));
            m162154f(!this.f104110x);
            View view7 = this.f104092c;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeleteEmojiBtn");
            }
            view7.setOnClickListener(new View$OnClickListenerC40949e(this));
            TabLayout tabLayout = this.f104102p;
            if (tabLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            FaceViewPager faceViewPager2 = this.f104091b;
            if (faceViewPager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
            }
            tabLayout.mo78233a(new C40950f(this, faceViewPager2));
            m162157o();
        }
    }

    /* renamed from: a */
    public final void mo147600a(IKeyBoardPlugin.IPluginClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "listener");
        this.f104097h = cVar;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public void mo147291a(boolean z) {
        View view = this.f104100n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setEnabled(z);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public View mo147288a(ViewGroup viewGroup, IKeyBoardPlugin.ITouchActionNotifier dVar) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        Intrinsics.checkParameterIsNotNull(dVar, "notifier");
        View m = m162155m();
        this.f104100n = m;
        if (m == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        m.setActivated(this.f104111y);
        View view = this.f104100n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        view.setOnClickListener(new View$OnClickListenerC40962r(this, dVar));
        View view2 = this.f104100n;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIcon");
        }
        return view2;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin
    /* renamed from: a */
    public boolean mo147292a(int i, Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (i != 1024) {
            return false;
        }
        for (Fragment fragment : this.f104095f) {
            if (fragment instanceof C40923b) {
                fragment.onActivityResult(i, -1, intent);
                return true;
            }
        }
        return false;
    }

    public FaceKBPlugin(boolean z, boolean z2, FragmentManager fragmentManager, IFaceDependency gVar) {
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(gVar, "faceDependency");
        this.f104110x = z;
        this.f104111y = z2;
        this.f104112z = fragmentManager;
        this.f104099j = gVar;
    }
}
