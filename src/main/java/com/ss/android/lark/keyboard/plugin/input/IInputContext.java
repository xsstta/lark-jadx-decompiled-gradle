package com.ss.android.lark.keyboard.plugin.input;

import com.ss.android.lark.keyboard.KeyboardScene;
import com.ss.android.lark.keyboard.plugin.tool.IKeyBoardPlugin;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KClass;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u00020\u00032\"\u0010\u0004\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0005\"\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006H&¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H&J$\u0010\u0013\u001a\u00020\u00032\u001a\u0010\u0014\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00160\u0015H&J\b\u0010\u0017\u001a\u00020\u0003H&J0\u0010\u0018\u001a\u00020\u00032\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH&¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputContext;", "", "changeVisiblePlugins", "", "visiables", "", "Lkotlin/reflect/KClass;", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "([Lkotlin/reflect/KClass;)V", "clearInputPluginFocus", "finishReplyMode", "getSourceScene", "Lcom/ss/android/lark/keyboard/KeyboardScene;", "hidePanelAndSysKeyBoard", "notifySend", "saveEmptyDraft", "selectPlugin", "pluginName", "", "setPluginsEnable", "plugins", "", "", "showSysKeyboard", "startInputSupport", "inputSupportPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportPlugin;", "curr", "params", "Lcom/ss/android/lark/keyboard/plugin/input/TransationData;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.input.e */
public interface IInputContext {
    /* renamed from: a */
    void mo147118a();

    /* renamed from: a */
    void mo147119a(String str);

    /* renamed from: a */
    void mo147120a(Map<KClass<? extends IKeyBoardPlugin>, Boolean> map);

    /* renamed from: a */
    void mo147121a(KClass<? extends IInputSupportPlugin> kClass, IInputSupportPlugin fVar, TransationData jVar);

    /* renamed from: a */
    void mo147122a(KClass<? extends IKeyBoardPlugin>... kClassArr);

    /* renamed from: b */
    void mo147123b();

    /* renamed from: c */
    void mo147124c();

    /* renamed from: d */
    void mo147125d();

    /* renamed from: e */
    void mo147126e();

    /* renamed from: f */
    KeyboardScene mo147127f();
}
