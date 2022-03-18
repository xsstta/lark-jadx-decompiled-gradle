package com.ss.android.lark.keyboard.plugin.tool.voice.popup;

import android.app.Activity;
import android.view.View;
import com.larksuite.framework.ui.BasePopupWindow;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\tH\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J*\u0010\u0010\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/IAudioPopup;", "", "contentView", "Landroid/view/View;", "getContentView", "()Landroid/view/View;", "setContentView", "(Landroid/view/View;)V", "isShowing", "", "()Z", "dismiss", "", "onBackPressed", "popupWindow", "Lcom/larksuite/framework/ui/BasePopupWindow;", "showAtLocation", "parent", "gravity", "", "x", "y", "Factory", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.c */
public interface IAudioPopup {

    /* renamed from: a */
    public static final Factory f104478a = Factory.f104479a;

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.c$a */
    public static final class C41033a {
        /* renamed from: a */
        public static BasePopupWindow m162659a(IAudioPopup cVar) {
            return null;
        }

        /* renamed from: b */
        public static boolean m162660b(IAudioPopup cVar) {
            return false;
        }
    }

    /* renamed from: a */
    void mo147920a(View view);

    /* renamed from: a */
    void mo147921a(View view, int i, int i2, int i3);

    /* renamed from: a */
    boolean mo147922a();

    /* renamed from: b */
    void mo147923b();

    /* renamed from: c */
    boolean mo147924c();

    /* renamed from: d */
    BasePopupWindow mo147925d();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/IAudioPopup$Factory;", "", "()V", "TAG", "", "invoke", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/IAudioPopup;", "contentView", "Landroid/view/View;", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.c$b */
    public static final class Factory {

        /* renamed from: a */
        static final /* synthetic */ Factory f104479a = new Factory();

        private Factory() {
        }

        /* renamed from: a */
        public final IAudioPopup mo147935a(View view) {
            Intrinsics.checkParameterIsNotNull(view, "contentView");
            boolean a = C40682g.m160850a().mo133171a("messenger.keyboard.enable_audio_view_popup");
            Log.m165389i("IAudioPopup", "fg enable:" + a + ", context:" + (view.getContext() instanceof Activity));
            if (!a || !(view.getContext() instanceof Activity)) {
                return new AudioPopupWindowImpl(view);
            }
            return new AudioPopupViewImpl(view);
        }
    }
}
