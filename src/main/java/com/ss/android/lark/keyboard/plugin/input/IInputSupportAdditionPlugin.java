package com.ss.android.lark.keyboard.plugin.input;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0015\u0016J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0005H&J\b\u0010\u0011\u001a\u00020\u000bH&J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin;", "", "getLayoutId", "", "onCreateView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "parent", "Landroid/view/ViewGroup;", "onDestroy", "", "onEnableChanged", "enable", "", "onInitView", "rootView", "onStop", "setAdditionSupportContext", "context", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "IAdditionSupportContext", "OnPanelChangeListener", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IInputSupportAdditionPlugin {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\tJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "", "onNewStateChanged", "", "newState", "", "onPanelSlide", "onPanelStateChanged", "state", "State", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public interface OnPanelChangeListener {

        @Target({ElementType.TYPE})
        @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS, AnnotationTarget.TYPE})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener$State;", "", "Companion", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
        public @interface State {
            public static final Companion Companion = Companion.f103336a;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener$State$Companion;", "", "()V", "COLLAPSE", "", "EXPAND", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
            /* renamed from: com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin$OnPanelChangeListener$State$a */
            public static final class Companion {

                /* renamed from: a */
                static final /* synthetic */ Companion f103336a = new Companion();

                private Companion() {
                }
            }
        }

        /* renamed from: a */
        void mo102083a();

        /* renamed from: a */
        void mo102084a(int i);

        /* renamed from: b */
        void mo102085b(int i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$IAdditionSupportContext;", "", "hide", "", "registerPanelChangeListener", "listener", "Lcom/ss/android/lark/keyboard/plugin/input/IInputSupportAdditionPlugin$OnPanelChangeListener;", "show", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.IInputSupportAdditionPlugin$a */
    public interface IAdditionSupportContext {
        /* renamed from: a */
        void mo146897a();

        /* renamed from: a */
        void mo146898a(OnPanelChangeListener onPanelChangeListener);

        /* renamed from: b */
        void mo146899b();
    }

    /* renamed from: a */
    int mo102073a();

    /* renamed from: a */
    View mo102074a(Activity activity, View view);

    /* renamed from: a */
    View mo102075a(Activity activity, ViewGroup viewGroup);

    /* renamed from: a */
    void mo102078a(IAdditionSupportContext aVar);

    /* renamed from: a */
    void mo102079a(boolean z);

    /* renamed from: b */
    void mo102080b();

    /* renamed from: c */
    void mo102082c();
}
