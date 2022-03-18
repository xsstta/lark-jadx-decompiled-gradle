package com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util;

import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper;", "Landroidx/lifecycle/LifecycleObserver;", "window", "Landroid/view/Window;", "mode", "Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper$Mode;", "(Landroid/view/Window;Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper$Mode;)V", "originalMode", "", "restoreOriginalSoftInputMode", "", "setNewSoftInputMode", "getSoftInputMode", "Companion", "Mode", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class InputModeLifecycleHelper implements LifecycleObserver {

    /* renamed from: a */
    public static final Companion f86811a = new Companion(null);

    /* renamed from: b */
    private int f86812b;

    /* renamed from: c */
    private Window f86813c;

    /* renamed from: d */
    private final Mode f86814d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper$Mode;", "", "desc", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "ADJUST_RESIZE", "ADJUST_PAN", "ADJUST_NOTHING", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    public enum Mode {
        ADJUST_RESIZE("adjust_resize"),
        ADJUST_PAN("adjust_pan"),
        ADJUST_NOTHING("adjust_nothing");
        
        private final String desc;

        public final String getDesc() {
            return this.desc;
        }

        private Mode(String str) {
            this.desc = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/component/tab/util/InputModeLifecycleHelper$Companion;", "", "()V", "TAG", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.component.tab.util.InputModeLifecycleHelper$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void restoreOriginalSoftInputMode() {
        Window window;
        int i = this.f86812b;
        if (i != 0 && (window = this.f86813c) != null) {
            window.setSoftInputMode(i);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void setNewSoftInputMode() {
        int i;
        Window window = this.f86813c;
        if (window != null) {
            this.f86812b = m130690a(window);
            int i2 = C33698b.f86817a[this.f86814d.ordinal()];
            if (i2 == 1) {
                i = 16;
            } else if (i2 == 2) {
                i = 32;
            } else if (i2 == 3) {
                i = 48;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f86812b != i) {
                window.setSoftInputMode(i);
                Log.m165389i("InputModeLifeCycle", "set window soft input mode to " + this.f86814d.getDesc());
            }
        }
    }

    /* renamed from: a */
    private final int m130690a(Window window) {
        WindowManager.LayoutParams attributes;
        if (window == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }

    public InputModeLifecycleHelper(Window window, Mode mode) {
        Intrinsics.checkParameterIsNotNull(mode, "mode");
        this.f86813c = window;
        this.f86814d = mode;
        this.f86812b = 16;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputModeLifecycleHelper(Window window, Mode mode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(window, (i & 2) != 0 ? Mode.ADJUST_RESIZE : mode);
    }
}
