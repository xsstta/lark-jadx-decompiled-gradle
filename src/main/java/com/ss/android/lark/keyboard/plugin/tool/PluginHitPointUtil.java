package com.ss.android.lark.keyboard.plugin.tool;

import com.ss.android.lark.keyboard.plugin.input.IOutInputSupport;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputPluginHitPoint;
import com.ss.android.lark.keyboard.plugin.input.postinput.PostInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputPluginHitPoint;
import com.ss.android.lark.keyboard.plugin.input.textinput.TextInputSupportPlugin;
import com.ss.android.lark.keyboard.plugin.tool.at.AtKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.face.FaceKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.more.PlusKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.photo.PhotoKBPlugin;
import com.ss.android.lark.keyboard.plugin.tool.voice.VoiceKBPlugin;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/PluginHitPointUtil;", "", "()V", "uploadHitPointOnClickPanelIcon", "", "plugin", "Lcom/ss/android/lark/keyboard/plugin/tool/IKeyBoardPlugin;", "inputPlugin", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.c */
public final class PluginHitPointUtil {

    /* renamed from: a */
    public static final PluginHitPointUtil f103789a = new PluginHitPointUtil();

    private PluginHitPointUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m161652a(IKeyBoardPlugin bVar, IOutInputSupport iOutInputSupport) {
        Intrinsics.checkParameterIsNotNull(bVar, "plugin");
        Intrinsics.checkParameterIsNotNull(iOutInputSupport, "inputPlugin");
        if (bVar instanceof FaceKBPlugin) {
            if (iOutInputSupport instanceof PostInputSupportPlugin) {
                new PostInputPluginHitPoint("emoji").mo147285c();
            } else if (iOutInputSupport instanceof TextInputSupportPlugin) {
                new TextInputPluginHitPoint("sticker").mo147285c();
            }
        } else if (bVar instanceof AtKBPlugin) {
            if (iOutInputSupport instanceof PostInputSupportPlugin) {
                new PostInputPluginHitPoint("mention").mo147285c();
            } else if (iOutInputSupport instanceof TextInputSupportPlugin) {
                new TextInputPluginHitPoint("mention").mo147285c();
            }
        } else if (bVar instanceof PhotoKBPlugin) {
            if (iOutInputSupport instanceof PostInputSupportPlugin) {
                new PostInputPluginHitPoint("picture").mo147285c();
            } else if (iOutInputSupport instanceof TextInputSupportPlugin) {
                new TextInputPluginHitPoint("picture").mo147285c();
            }
        } else if (bVar instanceof VoiceKBPlugin) {
            if (iOutInputSupport instanceof TextInputSupportPlugin) {
                new TextInputPluginHitPoint("audio").mo147285c();
            }
        } else if ((bVar instanceof PlusKBPlugin) && (iOutInputSupport instanceof TextInputSupportPlugin)) {
            new TextInputPluginHitPoint("more").mo147285c();
        }
    }
}
