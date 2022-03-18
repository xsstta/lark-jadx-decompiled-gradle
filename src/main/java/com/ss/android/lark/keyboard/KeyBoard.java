package com.ss.android.lark.keyboard;

import android.app.Activity;
import android.content.Intent;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.plugin.tool.PluginsController;
import com.ss.android.lark.keyboard.plugin.tool.PluginsController2;
import com.ss.android.lark.keyboard.widget.IPluginLayoutManager;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.List;
import java.util.Map;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0007\u0018\u0000 n2\u00020\u0001:\u0002noBa\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t\u0012\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n0\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0001J\u0019\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0018H\u0001J!\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0001J\u0011\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\fH\u0001J\u0019\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001aH\u0001J!\u0010\u0016\u001a\u00020\u00132\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u001d2\u0006\u0010\u0019\u001a\u00020\u001aH\u0001J2\u0010\u001e\u001a\u00020\u00132\"\u0010\u001f\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001d0 \"\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001dH\u0001¢\u0006\u0002\u0010!J\u0011\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u000bH\u0001J\t\u0010$\u001a\u00020\u0013H\u0001J\t\u0010%\u001a\u00020&H\u0001J\u000b\u0010'\u001a\u0004\u0018\u00010\fH\u0001J\"\u0010(\u001a\u0004\u0018\u0001H)\"\b\b\u0000\u0010)*\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020,H\u0001J\t\u0010-\u001a\u00020\fH\u0001J\"\u0010.\u001a\u0004\u0018\u0001H)\"\b\b\u0000\u0010)*\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010/J\t\u00100\u001a\u00020\fH\u0001J\t\u00101\u001a\u000202H\u0001J\t\u00103\u001a\u00020\u0013H\u0001J\t\u00104\u001a\u00020\u0013H\u0001J\t\u00105\u001a\u00020\u0013H\u0001J\t\u00106\u001a\u00020\u0013H\u0001J\u0011\u00107\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\fH\u0001J\t\u00108\u001a\u00020\u0010H\u0001J\t\u00109\u001a\u00020\u0010H\u0001J\t\u0010:\u001a\u00020\u0010H\u0001J\t\u0010;\u001a\u00020\u0010H\u0001J\t\u0010<\u001a\u00020\u0010H\u0001J\t\u0010=\u001a\u00020\u0013H\u0001J#\u0010>\u001a\u00020\u00102\u0006\u0010?\u001a\u00020,2\u0006\u0010@\u001a\u00020,2\b\u0010\u001c\u001a\u0004\u0018\u00010AH\u0001J\t\u0010B\u001a\u00020\u0010H\u0001J\t\u0010C\u001a\u00020\u0013H\u0001J\u0011\u0010D\u001a\u00020\u00132\u0006\u0010E\u001a\u00020FH\u0001J\u0019\u0010G\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000eH\u0001J\u0019\u0010H\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u000bH\u0001J\u0011\u0010I\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\fH\u0001J/\u0010K\u001a\u00020\u00132\b\u0010L\u001a\u0004\u0018\u00010M2\b\u0010N\u001a\u0004\u0018\u00010\f2\b\u0010O\u001a\u0004\u0018\u00010M2\u0006\u0010P\u001a\u00020\u0010H\u0001J\u0011\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u0010H\u0001J\u0011\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020UH\u0001J\u0011\u0010V\u001a\u00020\u00132\u0006\u0010W\u001a\u00020XH\u0001J\u0011\u0010Y\u001a\u00020\u00132\u0006\u0010Z\u001a\u00020\u0010H\u0001J\u0019\u0010Y\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\f2\u0006\u0010Z\u001a\u00020\u0010H\u0001J!\u0010Y\u001a\u00020\u00132\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001d2\u0006\u0010Z\u001a\u00020\u0010H\u0001J\u0011\u0010[\u001a\u00020\u00132\u0006\u0010\\\u001a\u00020]H\u0001J\u0019\u0010^\u001a\u00020\u00132\u0006\u0010J\u001a\u00020\f2\u0006\u0010_\u001a\u00020\u0010H\u0001J!\u0010^\u001a\u00020\u00132\u000e\u0010#\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u001d2\u0006\u0010_\u001a\u00020\u0010H\u0001J\u0011\u0010`\u001a\u00020\u00132\u0006\u0010a\u001a\u000202H\u0001J\u0013\u0010b\u001a\u00020\u00132\b\b\u0001\u0010c\u001a\u00020,H\u0001J\t\u0010d\u001a\u00020\u0013H\u0001J\t\u0010e\u001a\u00020\u0013H\u0001J\t\u0010f\u001a\u00020\u0013H\u0001J%\u0010g\u001a\u00020\u00132\u001a\u0010h\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0018\u0012\u0004\u0012\u00020,0iH\u0001J\t\u0010j\u001a\u00020\u0013H\u0001J\u0015\u0010j\u001a\u00020\u00132\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0001J\t\u0010k\u001a\u00020\u0013H\u0001J\u0011\u0010l\u001a\u00020\u00132\u0006\u0010E\u001a\u00020FH\u0001J\t\u0010m\u001a\u00020\u0013H\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f0\n0\tX\u0004¢\u0006\u0002\n\u0000R \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006p"}, d2 = {"Lcom/ss/android/lark/keyboard/KeyBoard;", "Lcom/ss/android/lark/keyboard/IKeyBoard;", "activity", "Landroid/app/Activity;", "pluginContainer", "Landroid/view/ViewGroup;", "mIKeyBoardDependency", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "mKBPlugins", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "", "mInputPlugins", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "mRefactorEnable", "", "(Landroid/app/Activity;Landroid/view/ViewGroup;Lcom/ss/android/lark/keyboard/IKeyBoardDependency;Ljava/util/List;Ljava/util/List;Z)V", "changeToReplyMode", "", "replyInfo", "Lcom/ss/android/lark/keyboard/KeyBoard$ReplyInfo;", "changeToSpecificInputSupport", "inputSupport", "Ljava/lang/Class;", "param", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/reflect/KClass;", "changeVisiblePlugins", "visibles", "", "([Lkotlin/reflect/KClass;)V", "createPluginPanel", "plugin", "destroy", "getCurrInputSupport", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getCurrentKbPluginName", "getInputPlugin", "T", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getKeyBoardHeight", "", "getParentMsgId", "getPlugin", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getRootMsgId", "getSourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "hide", "hidePanelAndSysKeyboard", "hideSysKeyBoard", "hideToolMenu", "isCurrInputSupportSameWith", "isFinishReplyWhenSend", "isInReplyMode", "isKeyBoardShow", "isSysKeyBoardShow", "isToolBoxShow", "notifySend", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onBackPressed", "pause", "registerInputPluginChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerInputSupport", "registerKBPlugin", "selectPlugin", "pluginName", "setDraftText", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "richText", "append", "setIsFinishReplyWhenSend", "isFinishReply", "setKeyBoardStartedCallback", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardStartedCallback;", "setKeyBoardStatusListener", "toolBoxListener", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "setPluginEnable", "isEnable", "setPluginLayoutManager", "pluginLayoutManager", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "setPluginVisible", "isVisible", "setSourceScene", "scene", "setToolbarRegionColorRes", "colorRes", "show", "showSysKeyBoard", "showToolMenu", "sortKBPlugin", "orderMap", "", "start", "stop", "unRegisterInputPluginChangeListener", "unSelectedCurrPlugin", "Companion", "ReplyInfo", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.f */
public final class KeyBoard implements IKeyBoard {

    /* renamed from: a */
    public static final Companion f103306a = new Companion(null);

    /* renamed from: b */
    private final Activity f103307b;

    /* renamed from: c */
    private final ViewGroup f103308c;

    /* renamed from: d */
    private final IKeyBoardDependency f103309d;

    /* renamed from: e */
    private final List<Pair<IKeyBoardPlugin, String>> f103310e;

    /* renamed from: f */
    private final List<Pair<IInputSupportPlugin, String>> f103311f;

    /* renamed from: g */
    private boolean f103312g;

    /* renamed from: h */
    private final /* synthetic */ IKeyBoard f103313h;

    public KeyBoard(Activity activity, ViewGroup viewGroup, IKeyBoardDependency cVar) {
        this(activity, viewGroup, cVar, null, null, false, 56, null);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146795a(KeyboardScene keyboardScene) {
        Intrinsics.checkParameterIsNotNull(keyboardScene, "scene");
        this.f103313h.mo146795a(keyboardScene);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146796a(IKeyBoardStatusListener eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "toolBoxListener");
        this.f103313h.mo146796a(eVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146797a(ReplyInfo bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "replyInfo");
        this.f103313h.mo146797a(bVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146798a(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f103313h.mo146798a(aVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146799a(TransationData jVar) {
        this.f103313h.mo146799a(jVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146800a(IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        this.f103313h.mo146800a(bVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146801a(IPluginLayoutManager eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginLayoutManager");
        this.f103313h.mo146801a(eVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146802a(RichText richText, String str, RichText richText2, boolean z) {
        this.f103313h.mo146802a(richText, str, richText2, z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146803a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        this.f103313h.mo146803a(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146804a(String str, IInputSupportPlugin fVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(fVar, "inputSupport");
        this.f103313h.mo146804a(str, fVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146805a(String str, TransationData jVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(jVar, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        this.f103313h.mo146805a(str, jVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146806a(String str, IKeyBoardPlugin bVar) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        this.f103313h.mo146806a(str, bVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146807a(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        this.f103313h.mo146807a(str, z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146808a(Map<Class<? extends IKeyBoardPlugin>, Integer> map) {
        Intrinsics.checkParameterIsNotNull(map, "orderMap");
        this.f103313h.mo146808a(map);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146809a(KClass<? extends IKeyBoardPlugin> kClass, boolean z) {
        Intrinsics.checkParameterIsNotNull(kClass, "plugin");
        this.f103313h.mo146809a(kClass, z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146810a(boolean z) {
        this.f103313h.mo146810a(z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public void mo146811a(KClass<? extends IKeyBoardPlugin>... kClassArr) {
        Intrinsics.checkParameterIsNotNull(kClassArr, "visibles");
        this.f103313h.mo146811a(kClassArr);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: a */
    public boolean mo146812a(int i, int i2, Intent intent) {
        return this.f103313h.mo146812a(i, i2, intent);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public KeyboardScene mo146813b() {
        return this.f103313h.mo146813b();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146814b(int i) {
        this.f103313h.mo146814b(i);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146815b(InputPluginController.InputSupportPluginChangeListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f103313h.mo146815b(aVar);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146816b(String str, boolean z) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        this.f103313h.mo146816b(str, z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public void mo146817b(boolean z) {
        this.f103313h.mo146817b(z);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: b */
    public boolean mo146818b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return this.f103313h.mo146818b(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: c */
    public <T extends IKeyBoardPlugin> T mo146819c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return (T) this.f103313h.mo146819c(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: c */
    public void mo146820c() {
        this.f103313h.mo146820c();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: d */
    public <T extends IInputSupportPlugin> T mo146821d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "name");
        return (T) this.f103313h.mo146821d(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: d */
    public boolean mo146822d() {
        return this.f103313h.mo146822d();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: e */
    public void mo146823e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "pluginName");
        this.f103313h.mo146823e(str);
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: e */
    public boolean mo146824e() {
        return this.f103313h.mo146824e();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: f */
    public int mo146825f() {
        return this.f103313h.mo146825f();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: g */
    public String mo146826g() {
        return this.f103313h.mo146826g();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: h */
    public IOutInputSupport mo146827h() {
        return this.f103313h.mo146827h();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: i */
    public boolean mo146828i() {
        return this.f103313h.mo146828i();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: j */
    public void mo146829j() {
        this.f103313h.mo146829j();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: k */
    public void mo146830k() {
        this.f103313h.mo146830k();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: l */
    public void mo146831l() {
        this.f103313h.mo146831l();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: m */
    public void mo146832m() {
        this.f103313h.mo146832m();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: n */
    public void mo146833n() {
        this.f103313h.mo146833n();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: o */
    public void mo146834o() {
        this.f103313h.mo146834o();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: p */
    public boolean mo146835p() {
        return this.f103313h.mo146835p();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: q */
    public String mo146836q() {
        return this.f103313h.mo146836q();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: r */
    public String mo146837r() {
        return this.f103313h.mo146837r();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: s */
    public void mo146838s() {
        this.f103313h.mo146838s();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: t */
    public void mo146839t() {
        this.f103313h.mo146839t();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: u */
    public boolean mo146840u() {
        return this.f103313h.mo146840u();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: v */
    public void mo146841v() {
        this.f103313h.mo146841v();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: w */
    public void mo146842w() {
        this.f103313h.mo146842w();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: x */
    public void mo146843x() {
        this.f103313h.mo146843x();
    }

    @Override // com.ss.android.lark.keyboard.IKeyBoard
    /* renamed from: y */
    public void mo146844y() {
        this.f103313h.mo146844y();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J`\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000f0\u000e2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u000f0\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/keyboard/KeyBoard$Companion;", "", "()V", "TAG", "", "getController", "Lcom/ss/android/lark/keyboard/IKeyBoard;", "activity", "Landroid/app/Activity;", "pluginContainer", "Landroid/view/ViewGroup;", "keyBoardDependency", "Lcom/ss/android/lark/keyboard/IKeyBoardDependency;", "kBPlugins", "", "Lkotlin/Pair;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "inputPlugins", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "refactorEnable", "", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.f$a */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.keyboard.f$a$a */
        public static final class C40681a extends Lambda implements Function0<Boolean> {
            public static final C40681a INSTANCE = new C40681a();

            C40681a() {
                super(0);
            }

            /* Return type fixed from 'boolean' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return C40682g.m160850a().mo133171a("messenger.message_inputbox_redesign");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final IKeyBoard mo146867a(Activity activity, ViewGroup viewGroup, IKeyBoardDependency cVar, List<? extends Pair<? extends IKeyBoardPlugin, String>> list, List<? extends Pair<? extends IInputSupportPlugin, String>> list2, boolean z) {
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
            Intrinsics.checkParameterIsNotNull(cVar, "keyBoardDependency");
            Intrinsics.checkParameterIsNotNull(list, "kBPlugins");
            Intrinsics.checkParameterIsNotNull(list2, "inputPlugins");
            if (((Boolean) LazyKt.lazy(C40681a.INSTANCE).getValue()).booleanValue()) {
                Log.m165389i("KeyBoard", "getController: useNewKeyboard is true, return PluginsController2");
                return new PluginsController2(activity, viewGroup, cVar, list, list2, z);
            }
            Log.m165389i("KeyBoard", "getController: useNewKeyboard is true, return PluginsController1");
            return new PluginsController(activity, viewGroup, cVar, list, list2, z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/keyboard/KeyBoard$ReplyInfo;", "", "parentId", "", "rootId", "digest", "", "textRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "postTitle", "postRichText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/CharSequence;Lcom/ss/android/lark/widget/richtext/RichText;Ljava/lang/String;Lcom/ss/android/lark/widget/richtext/RichText;)V", "getDigest", "()Ljava/lang/CharSequence;", "getParentId", "()Ljava/lang/String;", "getPostRichText", "()Lcom/ss/android/lark/widget/richtext/RichText;", "getPostTitle", "getRootId", "getTextRichText", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.f$b */
    public static final class ReplyInfo {

        /* renamed from: a */
        private final String f103314a;

        /* renamed from: b */
        private final String f103315b;

        /* renamed from: c */
        private final CharSequence f103316c;

        /* renamed from: d */
        private final RichText f103317d;

        /* renamed from: e */
        private final String f103318e;

        /* renamed from: f */
        private final RichText f103319f;

        /* renamed from: a */
        public final String mo146868a() {
            return this.f103314a;
        }

        /* renamed from: b */
        public final String mo146869b() {
            return this.f103315b;
        }

        /* renamed from: c */
        public final CharSequence mo146870c() {
            return this.f103316c;
        }

        /* renamed from: d */
        public final RichText mo146871d() {
            return this.f103317d;
        }

        /* renamed from: e */
        public final String mo146872e() {
            return this.f103318e;
        }

        /* renamed from: f */
        public final RichText mo146873f() {
            return this.f103319f;
        }

        public ReplyInfo(String str, String str2, CharSequence charSequence, RichText richText, String str3, RichText richText2) {
            this.f103314a = str;
            this.f103315b = str2;
            this.f103316c = charSequence;
            this.f103317d = richText;
            this.f103318e = str3;
            this.f103319f = richText2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.util.List<? extends kotlin.Pair<? extends com.ss.android.lark.keyboard.plugin.tool.b, java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: java.util.List<? extends kotlin.Pair<? extends com.ss.android.lark.keyboard.plugin.input.f, java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public KeyBoard(Activity activity, ViewGroup viewGroup, IKeyBoardDependency cVar, List<? extends Pair<? extends IKeyBoardPlugin, String>> list, List<? extends Pair<? extends IInputSupportPlugin, String>> list2, boolean z) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(viewGroup, "pluginContainer");
        Intrinsics.checkParameterIsNotNull(cVar, "mIKeyBoardDependency");
        Intrinsics.checkParameterIsNotNull(list, "mKBPlugins");
        Intrinsics.checkParameterIsNotNull(list2, "mInputPlugins");
        this.f103313h = f103306a.mo146867a(activity, viewGroup, cVar, list, list2, z);
        this.f103307b = activity;
        this.f103308c = viewGroup;
        this.f103309d = cVar;
        this.f103310e = list;
        this.f103311f = list2;
        this.f103312g = z;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KeyBoard(android.app.Activity r8, android.view.ViewGroup r9, com.ss.android.lark.keyboard.IKeyBoardDependency r10, java.util.List r11, java.util.List r12, boolean r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L_0x000b
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.List r11 = (java.util.List) r11
        L_0x000b:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto L_0x0018
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = r11
            java.util.List r12 = (java.util.List) r12
        L_0x0018:
            r5 = r12
            r11 = r14 & 32
            if (r11 == 0) goto L_0x0020
            r13 = 0
            r6 = 0
            goto L_0x0021
        L_0x0020:
            r6 = r13
        L_0x0021:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.keyboard.KeyBoard.<init>(android.app.Activity, android.view.ViewGroup, com.ss.android.lark.keyboard.c, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
