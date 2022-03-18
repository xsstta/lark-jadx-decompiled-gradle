package com.ss.android.lark.keyboard;

import android.content.Intent;
import com.google.firebase.messaging.Constants;
import com.ss.android.lark.keyboard.KeyBoard;
import com.ss.android.lark.keyboard.plugin.input.IInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.InputPluginController;
import com.ss.android.lark.keyboard.plugin.input.TransationData;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import com.ss.android.lark.keyboard.widget.IPluginLayoutManager;
import com.ss.android.lark.widget.richtext.RichText;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bH\u0016J \u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH&J \u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000f2\u0006\u0010\n\u001a\u00020\u000bH&J1\u0010\u0010\u001a\u00020\u00032\"\u0010\u0011\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f0\u0012\"\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000fH&¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0019H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\rH&J!\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\t2\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\rH&J!\u0010!\u001a\u0004\u0018\u0001H\u001c\"\b\b\u0000\u0010\u001c*\u00020\u00132\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\rH&J\b\u0010$\u001a\u00020%H&J\b\u0010&\u001a\u00020\u0003H&J\b\u0010'\u001a\u00020\u0003H&J\b\u0010(\u001a\u00020\u0003H&J\b\u0010)\u001a\u00020\u0003H&J\u0010\u0010*\u001a\u00020+2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010,\u001a\u00020+H&J\b\u0010-\u001a\u00020+H&J\b\u0010.\u001a\u00020+H&J\b\u0010/\u001a\u00020+H&J\b\u00100\u001a\u00020+H&J\b\u00101\u001a\u00020\u0003H&J\"\u00102\u001a\u00020+2\u0006\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u001f2\b\u0010\u000e\u001a\u0004\u0018\u000105H&J\b\u00106\u001a\u00020+H&J\b\u00107\u001a\u00020\u0003H&J\u0010\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&J\u0018\u0010;\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\tH&J\u0018\u0010<\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0013H&J\u0010\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\rH&J.\u0010?\u001a\u00020\u00032\b\u0010@\u001a\u0004\u0018\u00010A2\b\u0010B\u001a\u0004\u0018\u00010\r2\b\u0010C\u001a\u0004\u0018\u00010A2\u0006\u0010D\u001a\u00020+H&J\u0010\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020+H&J\u0010\u0010G\u001a\u00020\u00032\u0006\u0010H\u001a\u00020IH&J\u0010\u0010J\u001a\u00020\u00032\u0006\u0010K\u001a\u00020LH&J\u0010\u0010M\u001a\u00020\u00032\u0006\u0010N\u001a\u00020+H&J\u0018\u0010M\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\r2\u0006\u0010N\u001a\u00020+H&J \u0010M\u001a\u00020\u00032\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f2\u0006\u0010N\u001a\u00020+H&J\u0010\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020QH&J\u0018\u0010R\u001a\u00020\u00032\u0006\u0010>\u001a\u00020\r2\u0006\u0010S\u001a\u00020+H&J \u0010R\u001a\u00020\u00032\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f2\u0006\u0010S\u001a\u00020+H&J\u0010\u0010T\u001a\u00020\u00032\u0006\u0010U\u001a\u00020%H&J\u0012\u0010V\u001a\u00020\u00032\b\b\u0001\u0010W\u001a\u00020\u001fH&J\b\u0010X\u001a\u00020\u0003H&J\b\u0010Y\u001a\u00020\u0003H&J\b\u0010Z\u001a\u00020\u0003H&J$\u0010[\u001a\u00020\u00032\u001a\u0010\\\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\b\u0012\u0004\u0012\u00020\u001f0]H&J\b\u0010^\u001a\u00020\u0003H&J\u0014\u0010^\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010_\u001a\u00020\u0003H&J\u0010\u0010`\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H&J\b\u0010a\u001a\u00020\u0003H&¨\u0006b"}, d2 = {"Lcom/ss/android/lark/keyboard/IKeyBoard;", "", "changeToReplyMode", "", "replyInfo", "Lcom/ss/android/lark/keyboard/KeyBoard$ReplyInfo;", "changeToSpecificInputSupport", "inputSupport", "Ljava/lang/Class;", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "param", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "name", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lkotlin/reflect/KClass;", "changeVisiblePlugins", "visibles", "", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "([Lkotlin/reflect/KClass;)V", "createPluginPanel", "plugin", "destroy", "getCurrInputSupport", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "getCurrentKbPluginName", "getInputPlugin", "T", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "getKeyBoardHeight", "", "getParentMsgId", "getPlugin", "(Ljava/lang/String;)Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "getRootMsgId", "getSourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "hide", "hidePanelAndSysKeyboard", "hideSysKeyBoard", "hideToolMenu", "isCurrInputSupportSameWith", "", "isFinishReplyWhenSend", "isInReplyMode", "isKeyBoardShow", "isSysKeyBoardShow", "isToolBoxShow", "notifySend", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onBackPressed", "pause", "registerInputPluginChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/InputPluginController$InputSupportPluginChangeListener;", "registerInputSupport", "registerKBPlugin", "selectPlugin", "pluginName", "setDraftText", "messageRichText", "Lcom/ss/android/lark/widget/richtext/RichText;", "title", "richText", "append", "setIsFinishReplyWhenSend", "isFinishReply", "setKeyBoardStartedCallback", "callback", "Lcom/ss/android/lark/keyboard/IKeyBoardStartedCallback;", "setKeyBoardStatusListener", "toolBoxListener", "Lcom/ss/android/lark/keyboard/IKeyBoardStatusListener;", "setPluginEnable", "isEnable", "setPluginLayoutManager", "pluginLayoutManager", "Lcom/ss/android/lark/keyboard/widget/IPluginLayoutManager;", "setPluginVisible", "isVisible", "setSourceScene", "scene", "setToolbarRegionColorRes", "colorRes", "show", "showSysKeyBoard", "showToolMenu", "sortKBPlugin", "orderMap", "", "start", "stop", "unRegisterInputPluginChangeListener", "unSelectedCurrPlugin", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.b */
public interface IKeyBoard {
    /* renamed from: a */
    void mo146795a(KeyboardScene keyboardScene);

    /* renamed from: a */
    void mo146796a(IKeyBoardStatusListener eVar);

    /* renamed from: a */
    void mo146797a(KeyBoard.ReplyInfo bVar);

    /* renamed from: a */
    void mo146798a(InputPluginController.InputSupportPluginChangeListener aVar);

    /* renamed from: a */
    void mo146799a(TransationData jVar);

    /* renamed from: a */
    void mo146800a(IKeyBoardPlugin bVar);

    /* renamed from: a */
    void mo146801a(IPluginLayoutManager eVar);

    /* renamed from: a */
    void mo146802a(RichText richText, String str, RichText richText2, boolean z);

    /* renamed from: a */
    void mo146803a(String str);

    /* renamed from: a */
    void mo146804a(String str, IInputSupportPlugin fVar);

    /* renamed from: a */
    void mo146805a(String str, TransationData jVar);

    /* renamed from: a */
    void mo146806a(String str, IKeyBoardPlugin bVar);

    /* renamed from: a */
    void mo146807a(String str, boolean z);

    /* renamed from: a */
    void mo146808a(Map<Class<? extends IKeyBoardPlugin>, Integer> map);

    /* renamed from: a */
    void mo146809a(KClass<? extends IKeyBoardPlugin> kClass, boolean z);

    /* renamed from: a */
    void mo146810a(boolean z);

    /* renamed from: a */
    void mo146811a(KClass<? extends IKeyBoardPlugin>... kClassArr);

    /* renamed from: a */
    boolean mo146812a(int i, int i2, Intent intent);

    /* renamed from: b */
    KeyboardScene mo146813b();

    /* renamed from: b */
    void mo146814b(int i);

    /* renamed from: b */
    void mo146815b(InputPluginController.InputSupportPluginChangeListener aVar);

    /* renamed from: b */
    void mo146816b(String str, boolean z);

    /* renamed from: b */
    void mo146817b(boolean z);

    /* renamed from: b */
    boolean mo146818b(String str);

    /* renamed from: c */
    <T extends IKeyBoardPlugin> T mo146819c(String str);

    /* renamed from: c */
    void mo146820c();

    /* renamed from: d */
    <T extends IInputSupportPlugin> T mo146821d(String str);

    /* renamed from: d */
    boolean mo146822d();

    /* renamed from: e */
    void mo146823e(String str);

    /* renamed from: e */
    boolean mo146824e();

    /* renamed from: f */
    int mo146825f();

    /* renamed from: g */
    String mo146826g();

    /* renamed from: h */
    IOutInputSupport mo146827h();

    /* renamed from: i */
    boolean mo146828i();

    /* renamed from: j */
    void mo146829j();

    /* renamed from: k */
    void mo146830k();

    /* renamed from: l */
    void mo146831l();

    /* renamed from: m */
    void mo146832m();

    /* renamed from: n */
    void mo146833n();

    /* renamed from: o */
    void mo146834o();

    /* renamed from: p */
    boolean mo146835p();

    /* renamed from: q */
    String mo146836q();

    /* renamed from: r */
    String mo146837r();

    /* renamed from: s */
    void mo146838s();

    /* renamed from: t */
    void mo146839t();

    /* renamed from: u */
    boolean mo146840u();

    /* renamed from: v */
    void mo146841v();

    /* renamed from: w */
    void mo146842w();

    /* renamed from: x */
    void mo146843x();

    /* renamed from: y */
    void mo146844y();

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.b$a */
    public static final class C40674a {
        /* renamed from: a */
        public static void m160760a(IKeyBoard bVar, String str) {
            Intrinsics.checkParameterIsNotNull(str, "name");
            bVar.mo146805a(str, new TransationData());
        }
    }
}
