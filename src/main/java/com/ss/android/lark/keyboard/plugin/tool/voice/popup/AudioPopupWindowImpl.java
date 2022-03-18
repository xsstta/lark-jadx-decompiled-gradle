package com.ss.android.lark.keyboard.plugin.tool.voice.popup;

import android.view.View;
import com.larksuite.framework.ui.BasePopupWindow;
import com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0016J*\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016R(\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00038V@VX\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/AudioPopupWindowImpl;", "Lcom/ss/android/lark/keyboard/plugin/tool/voice/popup/IAudioPopup;", "contentView", "Landroid/view/View;", "(Landroid/view/View;)V", "value", "getContentView", "()Landroid/view/View;", "setContentView", "isShowing", "", "()Z", "mPopup", "Lcom/larksuite/framework/ui/BasePopupWindow;", "dismiss", "", "popupWindow", "showAtLocation", "parent", "gravity", "", "x", "y", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.keyboard.plugin.tool.voice.a.b */
public final class AudioPopupWindowImpl implements IAudioPopup {

    /* renamed from: b */
    private final BasePopupWindow f104477b;

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: d */
    public BasePopupWindow mo147925d() {
        return this.f104477b;
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: b */
    public void mo147923b() {
        this.f104477b.dismiss();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: c */
    public boolean mo147924c() {
        return IAudioPopup.C41033a.m162660b(this);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: a */
    public boolean mo147922a() {
        return this.f104477b.isShowing();
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: a */
    public void mo147920a(View view) {
        this.f104477b.setContentView(view);
    }

    public AudioPopupWindowImpl(View view) {
        Intrinsics.checkParameterIsNotNull(view, "contentView");
        this.f104477b = new BasePopupWindow(view, -1, -2);
    }

    @Override // com.ss.android.lark.keyboard.plugin.tool.voice.popup.IAudioPopup
    /* renamed from: a */
    public void mo147921a(View view, int i, int i2, int i3) {
        this.f104477b.showAtLocation(view, i, i2, i3);
    }
}
