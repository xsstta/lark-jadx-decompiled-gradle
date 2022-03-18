package com.ss.android.lark.keyboard.plugin.tool.face;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.C36512a;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.entity.Image;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.p2073b.C40675a;
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
import com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener;
import com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageNewFragment2;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.widget.photo_picker.C58557a;
import java.util.ArrayList;
import java.util.HashMap;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r*\u0004\u001b\u001e#'\u0018\u0000 S2\u00020\u0001:\u0001SB\u0005¢\u0006\u0002\u0010\u0002J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\u0006\u00103\u001a\u000201J\b\u00104\u001a\u000201H\u0002J\b\u00105\u001a\u000201H\u0002J\n\u00106\u001a\u0004\u0018\u00010+H\u0002J\b\u00107\u001a\u000201H\u0002J\b\u00108\u001a\u000201H\u0002J\b\u00109\u001a\u00020\u0006H\u0002J\"\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020<2\b\u0010>\u001a\u0004\u0018\u00010?H\u0016J\u0012\u0010@\u001a\u0002012\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J&\u0010C\u001a\u0004\u0018\u00010\u000e2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010H\u001a\u000201H\u0016J\u001a\u0010I\u001a\u0002012\u0006\u0010J\u001a\u00020\u000e2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\u000e\u0010K\u001a\u0002012\u0006\u0010L\u001a\u00020\u0004J\u000e\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020\u000eJ\u000e\u0010O\u001a\u0002012\u0006\u0010P\u001a\u00020\u0019J\u0010\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u0010\u0010\u001d\u001a\u00020\u001eX\u0004¢\u0006\u0004\n\u0002\u0010\u001fR\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u00020#X\u0004¢\u0006\u0004\n\u0002\u0010$R\u000e\u0010%\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020'X\u0004¢\u0006\u0004\n\u0002\u0010(R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020-0*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X.¢\u0006\u0002\n\u0000¨\u0006T"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment;", "Lcom/ss/android/lark/base/fragment/BaseFragment;", "()V", "faceDependency", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IFaceDependency;", "isShowCollectedEmoji", "", "localCallbackManager", "Lcom/larksuite/framework/callback/CallbackManager;", "mBottomTab", "Landroid/widget/RelativeLayout;", "mCurrentStickerSetId", "", "mDeleteEmojiBtn", "Landroid/view/View;", "mEmojiDependency", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "mEmojiPanel", "Lcom/ss/android/lark/keyboard/widget/IPanel;", "mEmojiSettingBtn", "mEmoticonShopBtn", "mEmoticonTabs", "Lcom/google/android/material/tabs/TabLayout;", "mIconDesktop", "mKeyBoardContext", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin$IKeyBoardContext;", "mOnEmojiOperationListener", "com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mOnEmojiOperationListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mOnEmojiOperationListener$1;", "mOnOperationListener", "com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mOnOperationListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mOnOperationListener$1;", "mPagerFaceCategory", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FaceViewPager;", "mPushStickerSetListener", "com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mPushStickerSetListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mPushStickerSetListener$1;", "mRootView", "mStickerDependency", "com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mStickerDependency$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mStickerDependency$1;", "mStickerFragmentList", "", "Landroidx/fragment/app/Fragment;", "mStickerSetList", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "newAdapter", "Lcom/ss/android/lark/keyboard/plugin/tool/face/FacePagerNewAdapter;", "doBackSpace", "", "getLocalStickerSets", "init", "initAdapter", "initEmojiList", "initEmojiPanel", "initSticker", "initTab", "isPostInputMode", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroy", "onViewCreated", "view", "setFaceDependency", "dependency", "setIconDesktop", "v", "setKeyBoardContext", "context", "updateTabRelativePosition", "hiddenShop", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a */
public final class DesktopFaceFragment extends BaseFragment {

    /* renamed from: k */
    public static final Companion f103961k = new Companion(null);

    /* renamed from: a */
    public FaceViewPager f103962a;

    /* renamed from: b */
    public View f103963b;

    /* renamed from: c */
    public View f103964c;

    /* renamed from: d */
    public IFaceDependency f103965d;

    /* renamed from: e */
    public String f103966e = "";

    /* renamed from: f */
    public FacePagerNewAdapter f103967f;

    /* renamed from: g */
    public List<Fragment> f103968g = new ArrayList();

    /* renamed from: h */
    public List<StickerSet> f103969h = new ArrayList();

    /* renamed from: i */
    public IKeyBoardPlugin.IKeyBoardContext f103970i;

    /* renamed from: j */
    public IPanel f103971j;

    /* renamed from: l */
    private View f103972l;

    /* renamed from: m */
    private RelativeLayout f103973m;

    /* renamed from: n */
    private View f103974n;

    /* renamed from: o */
    private TabLayout f103975o;

    /* renamed from: p */
    private View f103976p;

    /* renamed from: q */
    private boolean f103977q;

    /* renamed from: r */
    private CallbackManager f103978r = new CallbackManager();

    /* renamed from: s */
    private final C40912n f103979s = new C40912n(this);

    /* renamed from: t */
    private final C40911m f103980t = new C40911m(this);

    /* renamed from: u */
    private final C40910l f103981u = new C40910l(this);

    /* renamed from: v */
    private IEmojiDependency f103982v = new C40909k(this);

    /* renamed from: w */
    private final C40913o f103983w = new C40913o(this);

    /* renamed from: x */
    private HashMap f103984x;

    /* renamed from: g */
    public void mo147514g() {
        HashMap hashMap = this.f103984x;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo147514g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$Companion;", "", "()V", "KEY_SHOW_COLLECTED_EMOJI", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$initEmojiPanel$1", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator;", "onBackSpace", "", "onSelectEmoji", "emojiResult", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiOperator$EmojiResult;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$i */
    public static final class C40907i implements EmojiOperator {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103991a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiOperator
        /* renamed from: a */
        public void mo147520a() {
            this.f103991a.mo147509b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40907i(DesktopFaceFragment aVar) {
            this.f103991a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiOperator
        /* renamed from: a */
        public void mo147521a(EmojiOperator.EmojiResult aVar) {
            String b;
            EditText l;
            Intrinsics.checkParameterIsNotNull(aVar, "emojiResult");
            String a = EmojiMapHandler.m162993a(aVar.mo148250a());
            if (a != null && (b = EmojiMapHandler.m162994b(aVar.mo148250a())) != null && (l = DesktopFaceFragment.m161975b(this.f103991a).mo147381z().mo146904l()) != null) {
                int selectionStart = l.getSelectionStart();
                Editable editableText = l.getEditableText();
                if (selectionStart < 0 || selectionStart >= editableText.length()) {
                    editableText.append((CharSequence) a);
                } else {
                    editableText.insert(selectionStart, a);
                }
                DesktopFaceFragment.m161973a(this.f103991a).mo127082a(b);
                C36512a.m144041a().mo134758a(this.f103991a);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mOnEmojiOperationListener$1", "Lcom/ss/android/lark/keyboard/widget/emoji/base/OnEmojiOperationListener;", "onBackSpace", "", "selectedEmoji", "reactionKey", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$l */
    public static final class C40910l implements OnEmojiOperationListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103994a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener
        /* renamed from: a */
        public void mo147529a() {
            this.f103994a.mo147509b();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40910l(DesktopFaceFragment aVar) {
            this.f103994a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.base.OnEmojiOperationListener
        /* renamed from: a */
        public void mo147530a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            EditText l = DesktopFaceFragment.m161975b(this.f103994a).mo147381z().mo146904l();
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
                    DesktopFaceFragment.m161973a(this.f103994a).mo127082a(b);
                    C36512a.m144041a().mo134758a(this.f103994a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$g */
    public static final class C40905g extends Lambda implements Function0<Unit> {
        final /* synthetic */ DesktopFaceFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40905g(DesktopFaceFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final void invoke() {
            IPanel cVar = this.this$0.f103971j;
            if (cVar != null) {
                cVar.mo148236b();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mPushStickerSetListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerSetListener;", "onDataChanged", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$n */
    public static final class C40912n implements IPushStickerSetListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103996a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerSetListener
        /* renamed from: a */
        public void mo147533a() {
            Log.m165379d("FaceKBPluginNew", "onDataChanged called. receive stickerSet push.");
            this.f103996a.mo147510c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40912n(DesktopFaceFragment aVar) {
            this.f103996a = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000g\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016JH\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0007H\u0016JP\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0005H\u0016Jb\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00052\u0010\u0010\u0019\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001cH\u0016J.\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010 2\u0006\u0010!\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0016¨\u0006%"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mStickerDependency$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/sticker/IStickerDependency;", "getLocalStickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "stickerKey", "", "width", "", "height", "getLocalStickers", "", "Lcom/ss/android/lark/chat/entity/sticker/Sticker;", "getStickers", "loadSticker", "", "context", "Landroid/content/Context;", "permanent", "", "key", "view", "Landroid/widget/ImageView;", "placeholder", "errorRes", "path", "listener", "Lcom/ss/android/lark/image/api/RequestListener;", "registerStickerPushListener", "Lcom/ss/android/lark/keyboard/plugin/tool/face/IPushStickerListener;", "unRegisterStickerPushListener", "uploadStickers", "stickerUrls", "", "keepOrigin", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/keyboard/plugin/tool/face/UploadStickerResult;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$o */
    public static final class C40913o implements AbstractC40930c {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103997a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: b */
        public List<Sticker> mo147540b() {
            return DesktopFaceFragment.m161973a(this.f103997a).mo127085b();
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public List<Sticker> mo147535a() {
            return DesktopFaceFragment.m161973a(this.f103997a).mo127072a();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40913o(DesktopFaceFragment aVar) {
            this.f103997a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: b */
        public void mo147541b(IPushStickerListener hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "listener");
            DesktopFaceFragment.m161973a(this.f103997a).mo127088b(hVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147538a(IPushStickerListener hVar) {
            Intrinsics.checkParameterIsNotNull(hVar, "listener");
            DesktopFaceFragment.m161973a(this.f103997a).mo127079a(hVar);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public C40964l mo147534a(String str, int i, int i2) {
            Intrinsics.checkParameterIsNotNull(str, "stickerKey");
            return DesktopFaceFragment.m161973a(this.f103997a).mo127071a(str, i, i2);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147539a(List<String> list, boolean z, IGetDataCallback<C40966m> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            DesktopFaceFragment.m161973a(this.f103997a).mo127084a(list, z, iGetDataCallback);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147536a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(imageView, "view");
            DesktopFaceFragment.m161973a(this.f103997a).mo127075a(context, z, i, i2, str, imageView, i3, i4);
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.AbstractC40930c
        /* renamed from: a */
        public void mo147537a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2, AbstractC38817h<?, ?> hVar) {
            Intrinsics.checkParameterIsNotNull(context, "context");
            Intrinsics.checkParameterIsNotNull(str, "key");
            Intrinsics.checkParameterIsNotNull(imageView, "view");
            Intrinsics.checkParameterIsNotNull(str2, "path");
            DesktopFaceFragment.m161973a(this.f103997a).mo127077a(context, z, i, i2, str, imageView, i3, i4, str2, hVar);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        View view = this.f103976p;
        if (view != null) {
            view.setSelected(false);
        }
        super.onDestroy();
    }

    /* renamed from: j */
    private final void m161982j() {
        IFaceDependency gVar = this.f103965d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceDependency");
        }
        gVar.mo127078a(new UIGetDataCallback(new C40900b(this)));
    }

    /* renamed from: b */
    public final void mo147509b() {
        KeyEvent keyEvent = new KeyEvent(0, 0, 0, 67, 0, 0, 0, 0, 6);
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103970i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        EditText l = bVar.mo147381z().mo146904l();
        if (l != null) {
            l.dispatchKeyEvent(keyEvent);
        }
    }

    /* renamed from: d */
    public final boolean mo147511d() {
        IKeyBoardPlugin.IKeyBoardContext bVar = this.f103970i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        if (bVar.mo147381z().mo146905m() != IOutInputSupport.InputSupportType.POSTINPUT) {
            IKeyBoardPlugin.IKeyBoardContext bVar2 = this.f103970i;
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

    /* renamed from: f */
    public final void mo147513f() {
        if (!CollectionUtils.isEmpty(this.f103968g) && (this.f103968g.get(0) instanceof EmojiPageNewFragment2)) {
            IFaceDependency gVar = this.f103965d;
            if (gVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("faceDependency");
            }
            UIGetDataCallback wrapAndAddGetDataCallback = this.f103978r.wrapAndAddGetDataCallback(new C40906h(this));
            Intrinsics.checkExpressionValueIsNotNull(wrapAndAddGetDataCallback, "localCallbackManager.wra…    }\n\n                })");
            gVar.mo127087b(wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: i */
    private final Fragment m161981i() {
        if (FaceFgUtil.m162148a()) {
            IPanel a = new KeyboardPanelsFacade().mo148279a(new C40907i(this), new C40908j(this));
            a.mo148236b();
            this.f103971j = a;
            if (a != null) {
                return a.mo148235a();
            }
            return null;
        }
        EmojiPageNewFragment2 cVar = new EmojiPageNewFragment2();
        IFaceDependency gVar = this.f103965d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceDependency");
        }
        List<String> e = gVar.mo127093e();
        IFaceDependency gVar2 = this.f103965d;
        if (gVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceDependency");
        }
        cVar.mo148271a(e, gVar2.mo127094f());
        return cVar;
    }

    /* renamed from: c */
    public final void mo147510c() {
        this.f103966e = "";
        this.f103968g.clear();
        this.f103969h.clear();
        TabLayout tabLayout = this.f103975o;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        tabLayout.mo78248d();
        FacePagerNewAdapter eVar = this.f103967f;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar.notifyDataSetChanged();
        Fragment i = m161981i();
        if (i != null) {
            this.f103968g.add(i);
        }
        C40923b d = C40923b.m162053d();
        List<Fragment> list = this.f103968g;
        Intrinsics.checkExpressionValueIsNotNull(d, "facePageFragmentWrapper");
        list.add(d);
        FacePagerNewAdapter eVar2 = this.f103967f;
        if (eVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar2.notifyDataSetChanged();
        if (!this.f103977q || mo147511d()) {
            FacePagerNewAdapter eVar3 = this.f103967f;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar3.notifyDataSetChanged();
            mo147512e();
            return;
        }
        m161982j();
    }

    /* renamed from: h */
    private final void m161980h() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(childFragmentManager, "childFragmentManager");
        FacePagerNewAdapter eVar = new FacePagerNewAdapter(childFragmentManager, this.f103968g);
        this.f103967f = eVar;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar.mo147616a(this.f103980t);
        if (FaceFgUtil.m162148a()) {
            FacePagerNewAdapter eVar2 = this.f103967f;
            if (eVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar2.mo147619a(new C40905g(this));
        } else {
            FacePagerNewAdapter eVar3 = this.f103967f;
            if (eVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar3.mo147618a(this.f103982v);
            FacePagerNewAdapter eVar4 = this.f103967f;
            if (eVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
            }
            eVar4.mo147617a(this.f103981u);
        }
        FacePagerNewAdapter eVar5 = this.f103967f;
        if (eVar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        eVar5.mo147615a(this.f103983w);
        FaceViewPager faceViewPager = this.f103962a;
        if (faceViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        FacePagerNewAdapter eVar6 = this.f103967f;
        if (eVar6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        faceViewPager.setAdapter(eVar6);
        TabLayout tabLayout = this.f103975o;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        FaceViewPager faceViewPager2 = this.f103962a;
        if (faceViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        tabLayout.setupWithViewPager(faceViewPager2);
    }

    /* renamed from: e */
    public final void mo147512e() {
        TabLayout tabLayout = this.f103975o;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        int tabCount = tabLayout.getTabCount();
        int i = 0;
        while (true) {
            if (i >= tabCount) {
                break;
            }
            TabLayout tabLayout2 = this.f103975o;
            if (tabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            TabLayout.C22451f a = C40675a.m160761a(tabLayout2, i);
            if (a == null) {
                break;
            }
            TabLayout tabLayout3 = this.f103975o;
            if (tabLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            Context context = tabLayout3.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "mEmoticonTabs.context");
            StickerTabItemView stickerTabItemView = new StickerTabItemView(context, null, 0, 6, null);
            if (i == 0) {
                stickerTabItemView.setTabIcon(R.drawable.tab_bottom_emoji);
            } else if (i != 1) {
                int i2 = i - 2;
                if (this.f103969h.size() <= i2) {
                    Log.m165383e("FaceKBPluginNew", "initTab called. tab index is illegal");
                    break;
                }
                IFaceDependency gVar = this.f103965d;
                if (gVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("faceDependency");
                }
                stickerTabItemView.setFaceDependency(gVar);
                StickerSet stickerSet = this.f103969h.get(i2);
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
                stickerTabItemView.setTabIcon(R.drawable.collection_emoji_desktop);
            }
            a.mo78313a(stickerTabItemView);
            View view = (View) stickerTabItemView.getParent();
            if (view != null) {
                view.setBackground(null);
                if (DesktopUtil.m144307b()) {
                    ViewGroup.LayoutParams layoutParams = stickerTabItemView.getLayoutParams();
                    layoutParams.width = UIUtils.dp2px(view.getContext(), 28.0f);
                    stickerTabItemView.setLayoutParams(layoutParams);
                }
            }
            i++;
        }
        TabLayout tabLayout4 = this.f103975o;
        if (tabLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        tabLayout4.setTabMode(0);
        TabLayout tabLayout5 = this.f103975o;
        if (tabLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        tabLayout5.setPadding(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo147505a() {
        Boolean bool;
        Bundle arguments = getArguments();
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("key_show_collected_emoji"));
        } else {
            bool = null;
        }
        if (bool == null) {
            Intrinsics.throwNpe();
        }
        this.f103977q = bool.booleanValue();
        View view = this.f103972l;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById = view.findViewById(R.id.toolbox_pagers_face);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "mRootView.findViewById(R.id.toolbox_pagers_face)");
        FaceViewPager faceViewPager = (FaceViewPager) findViewById;
        this.f103962a = faceViewPager;
        if (faceViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        faceViewPager.setOffscreenPageLimit(2);
        View view2 = this.f103972l;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById2 = view2.findViewById(R.id.bottom_tab);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "mRootView.findViewById(R.id.bottom_tab)");
        this.f103973m = (RelativeLayout) findViewById2;
        View view3 = this.f103972l;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById3 = view3.findViewById(R.id.emotion_tabs);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "mRootView.findViewById(R.id.emotion_tabs)");
        this.f103975o = (TabLayout) findViewById3;
        View view4 = this.f103972l;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById4 = view4.findViewById(R.id.emoticon_shop_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "mRootView.findViewById(R.id.emoticon_shop_btn)");
        this.f103974n = findViewById4;
        View view5 = this.f103972l;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById5 = view5.findViewById(R.id.back_emoji);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "mRootView.findViewById<View>(R.id.back_emoji)");
        this.f103963b = findViewById5;
        View view6 = this.f103972l;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        View findViewById6 = view6.findViewById(R.id.emoji_setting_btn);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "mRootView.findViewById<V…>(R.id.emoji_setting_btn)");
        this.f103964c = findViewById6;
        View view7 = this.f103974n;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonShopBtn");
        }
        view7.setOnClickListener(new View$OnClickListenerC40901c(this));
        View view8 = this.f103964c;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmojiSettingBtn");
        }
        view8.setOnClickListener(new View$OnClickListenerC40902d(this));
        m161974a(!this.f103977q);
        View view9 = this.f103963b;
        if (view9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteEmojiBtn");
        }
        view9.setOnClickListener(new View$OnClickListenerC40903e(this));
        TabLayout tabLayout = this.f103975o;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
        }
        FaceViewPager faceViewPager2 = this.f103962a;
        if (faceViewPager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        tabLayout.mo78233a(new C40904f(this, faceViewPager2));
        m161980h();
        mo147510c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$getLocalStickerSets$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/chat/entity/sticker/StickerSet;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$b */
    public static final class C40900b implements IGetDataCallback<List<? extends StickerSet>> {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103985a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40900b(DesktopFaceFragment aVar) {
            this.f103985a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            this.f103985a.mo147512e();
            DesktopFaceFragment.m161979f(this.f103985a).setCurrentItem(0, true);
        }

        /* renamed from: a */
        public void onSuccess(List<? extends StickerSet> list) {
            if (list != null) {
                this.f103985a.f103969h = C69121n.m265989f(list);
                int i = -1;
                String string = UserSP.getInstance().getString("sticker_set_id");
                int i2 = 0;
                for (T t : this.f103985a.f103969h) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    T t2 = t;
                    C40941e a = C40941e.m162105a();
                    a.mo147591a((StickerSet) t2);
                    List<Fragment> list2 = this.f103985a.f103968g;
                    Intrinsics.checkExpressionValueIsNotNull(a, "stickerPageFragment");
                    list2.add(a);
                    if (TextUtils.equals(t2.getStickerSetId(), string) || TextUtils.equals(t2.getStickerSetId(), this.f103985a.f103966e)) {
                        i = i2;
                    }
                    i2 = i3;
                }
                DesktopFaceFragment.m161978e(this.f103985a).notifyDataSetChanged();
                this.f103985a.mo147512e();
                if (i >= 0) {
                    DesktopFaceFragment.m161979f(this.f103985a).setCurrentItem(i + 2, true);
                    UserSP.getInstance().remove("sticker_set_id");
                    return;
                }
                DesktopFaceFragment.m161979f(this.f103985a).setCurrentItem(0, true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$e */
    public static final class View$OnClickListenerC40903e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103988a;

        View$OnClickListenerC40903e(DesktopFaceFragment aVar) {
            this.f103988a = aVar;
        }

        public final void onClick(View view) {
            this.f103988a.mo147509b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$initEmojiList$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$h */
    public static final class C40906h implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103990a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40906h(DesktopFaceFragment aVar) {
            this.f103990a = aVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165389i("FaceKBPluginNew", "syncReactionOrder failed");
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            Fragment fragment = this.f103990a.f103968g.get(0);
            if (fragment != null) {
                ((EmojiPageNewFragment2) fragment).mo148271a(DesktopFaceFragment.m161973a(this.f103990a).mo127093e(), DesktopFaceFragment.m161973a(this.f103990a).mo127094f());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.keyboard.widget.emoji.v2.EmojiPageNewFragment2");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005H\u0016¨\u0006\u0011"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$initEmojiPanel$2", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency;", "getPanelData", "", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/keyboard/widget/emoji/EmojiPanel$EmojiPanelDependency$EmojiPanelData;", "isFgEnable", "", "key", "", "showDeleteIcon", "syncReactionOrder", "updateLocalOrder", "reactionKey", "updateRecentEmojiOrder", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$j */
    public static final class C40908j implements EmojiPanel.EmojiPanelDependency {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103992a;

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public boolean mo147525a() {
            return false;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40908j(DesktopFaceFragment aVar) {
            this.f103992a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public void mo147523a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            DesktopFaceFragment.m161973a(this.f103992a).mo127090b(str);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: b */
        public void mo147526b(IGetDataCallback<Boolean> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            DesktopFaceFragment.m161973a(this.f103992a).mo127087b(iGetDataCallback);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public void mo147522a(IGetDataCallback<EmojiPanel.EmojiPanelDependency.EmojiPanelData> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            iGetDataCallback.onSuccess(new EmojiPanel.EmojiPanelDependency.EmojiPanelData(DesktopFaceFragment.m161973a(this.f103992a).mo127093e(), DesktopFaceFragment.m161973a(this.f103992a).mo127094f()));
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.EmojiPanel.EmojiPanelDependency
        /* renamed from: a */
        public void mo147524a(String str, IGetDataCallback<Integer> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            DesktopFaceFragment.m161973a(this.f103992a).mo127083a(str, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mEmojiDependency$1", "Lcom/ss/android/lark/keyboard/widget/emoji/IEmojiDependency;", "updateLocalOrder", "", "reactionKey", "", "updateRecentEmojiOrder", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$k */
    public static final class C40909k implements IEmojiDependency {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103993a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40909k(DesktopFaceFragment aVar) {
            this.f103993a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency
        /* renamed from: a */
        public void mo147527a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            DesktopFaceFragment.m161973a(this.f103993a).mo127090b(str);
        }

        @Override // com.ss.android.lark.keyboard.widget.emoji.IEmojiDependency
        /* renamed from: a */
        public void mo147528a(String str, IGetDataCallback<Integer> iGetDataCallback) {
            Intrinsics.checkParameterIsNotNull(str, "reactionKey");
            Intrinsics.checkParameterIsNotNull(iGetDataCallback, "callback");
            DesktopFaceFragment.m161973a(this.f103993a).mo127083a(str, iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$mOnOperationListener$1", "Lcom/ss/android/lark/keyboard/plugin/tool/face/OnOperationListenerAdapter;", "selectAddNewSticker", "", "requestCode", "", "selectedFace", "stickerFileInfo", "Lcom/ss/android/lark/keyboard/plugin/tool/face/StickerFileInfo;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$m */
    public static final class C40911m implements OnOperationListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103995a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40911m(DesktopFaceFragment aVar) {
            this.f103995a = aVar;
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.AbstractC40963j
        /* renamed from: a */
        public void mo147531a(int i) {
            C58557a.C58559a o = C58557a.m227127a().mo198526i(false).mo198524g(true).mo198525h(false).mo198531n(false).mo198532o(false);
            Context context = this.f103995a.mContext;
            DesktopFaceFragment aVar = this.f103995a;
            if (aVar != null) {
                o.mo198512a(context, aVar, i);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.Fragment");
        }

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.AbstractC40963j
        /* renamed from: a */
        public void mo147532a(C40964l lVar) {
            if (!this.f103995a.mo147511d()) {
                DesktopFaceFragment.m161973a(this.f103995a).mo127081a(lVar);
                DesktopFaceFragment.m161975b(this.f103995a).mo147379v();
                C36512a.m144041a().mo134758a(this.f103995a);
                return;
            }
            Log.m165396w("Clicking the custom emoji in the post state");
        }
    }

    /* renamed from: a */
    public final void mo147506a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "v");
        this.f103976p = view;
    }

    /* renamed from: a */
    public static final /* synthetic */ IFaceDependency m161973a(DesktopFaceFragment aVar) {
        IFaceDependency gVar = aVar.f103965d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("faceDependency");
        }
        return gVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ IKeyBoardPlugin.IKeyBoardContext m161975b(DesktopFaceFragment aVar) {
        IKeyBoardPlugin.IKeyBoardContext bVar = aVar.f103970i;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mKeyBoardContext");
        }
        return bVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m161976c(DesktopFaceFragment aVar) {
        View view = aVar.f103963b;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteEmojiBtn");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m161977d(DesktopFaceFragment aVar) {
        View view = aVar.f103964c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmojiSettingBtn");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ FacePagerNewAdapter m161978e(DesktopFaceFragment aVar) {
        FacePagerNewAdapter eVar = aVar.f103967f;
        if (eVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("newAdapter");
        }
        return eVar;
    }

    /* renamed from: f */
    public static final /* synthetic */ FaceViewPager m161979f(DesktopFaceFragment aVar) {
        FaceViewPager faceViewPager = aVar.f103962a;
        if (faceViewPager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPagerFaceCategory");
        }
        return faceViewPager;
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View view = this.f103976p;
        if (view != null) {
            view.setSelected(true);
        }
    }

    /* renamed from: a */
    public final void mo147507a(IKeyBoardPlugin.IKeyBoardContext bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "context");
        this.f103970i = bVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$c */
    public static final class View$OnClickListenerC40901c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103986a;

        View$OnClickListenerC40901c(DesktopFaceFragment aVar) {
            this.f103986a = aVar;
        }

        public final void onClick(View view) {
            DesktopFaceFragment.m161973a(this.f103986a).mo127073a(DesktopFaceFragment.m161975b(this.f103986a).mo147365B());
            HitPointHelper.f103322b.mo146887e();
            C36512a.m144041a().mo134758a(this.f103986a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$d */
    public static final class View$OnClickListenerC40902d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103987a;

        View$OnClickListenerC40902d(DesktopFaceFragment aVar) {
            this.f103987a = aVar;
        }

        public final void onClick(View view) {
            DesktopFaceFragment.m161973a(this.f103987a).mo127086b(DesktopFaceFragment.m161975b(this.f103987a).mo147365B());
            HitPointHelper.f103322b.mo146885c("1");
            C36512a.m144041a().mo134758a(this.f103987a);
        }
    }

    /* renamed from: a */
    public final void mo147508a(IFaceDependency gVar) {
        Intrinsics.checkParameterIsNotNull(gVar, "dependency");
        this.f103965d = gVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/keyboard/plugin/tool/face/DesktopFaceFragment$init$5", "Lcom/google/android/material/tabs/TabLayout$ViewPagerOnTabSelectedListener;", "onTabSelected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a$f */
    public static final class C40904f extends TabLayout.C22455i {

        /* renamed from: a */
        final /* synthetic */ DesktopFaceFragment f103989a;

        @Override // com.google.android.material.tabs.TabLayout.C22455i, com.google.android.material.tabs.TabLayout.AbstractC22445b
        /* renamed from: a */
        public void mo78292a(TabLayout.C22451f fVar) {
            String str;
            Intrinsics.checkParameterIsNotNull(fVar, "tab");
            super.mo78292a(fVar);
            if (fVar.mo78318c() != 0) {
                DesktopFaceFragment.m161976c(this.f103989a).setVisibility(8);
                DesktopFaceFragment.m161977d(this.f103989a).setVisibility(0);
            } else {
                DesktopFaceFragment.m161976c(this.f103989a).setVisibility(0);
                DesktopFaceFragment.m161977d(this.f103989a).setVisibility(8);
                if (FaceFgUtil.m162148a()) {
                    IPanel cVar = this.f103989a.f103971j;
                    if (cVar != null) {
                        cVar.mo148237c();
                    }
                } else {
                    this.f103989a.mo147513f();
                }
            }
            DesktopFaceFragment aVar = this.f103989a;
            if (fVar.mo78318c() < 2 || !(!this.f103989a.f103969h.isEmpty())) {
                str = "";
            } else {
                str = this.f103989a.f103969h.get(fVar.mo78318c() - 2).getStickerSetId();
                Intrinsics.checkExpressionValueIsNotNull(str, "mStickerSetList[tab.position - 2].stickerSetId");
            }
            aVar.f103966e = str;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40904f(DesktopFaceFragment aVar, ViewPager viewPager) {
            super(viewPager);
            this.f103989a = aVar;
        }
    }

    /* renamed from: a */
    private final void m161974a(boolean z) {
        int i;
        View view = this.f103974n;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEmoticonShopBtn");
        }
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        TabLayout tabLayout = this.f103975o;
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
            TabLayout tabLayout2 = this.f103975o;
            if (tabLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mEmoticonTabs");
            }
            tabLayout2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        mo147505a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.kb_plugin_face_desktop, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…esktop, container, false)");
        this.f103972l = inflate;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f103968g.size() > 1) {
            for (Fragment fragment : this.f103968g) {
                fragment.onActivityResult(i, i2, intent);
            }
        }
    }
}
