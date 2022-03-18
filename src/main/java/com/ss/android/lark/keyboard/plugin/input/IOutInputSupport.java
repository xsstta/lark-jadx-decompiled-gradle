package com.ss.android.lark.keyboard.plugin.input;

import android.widget.EditText;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0010J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport;", "", "getCurrET", "Landroid/widget/EditText;", "getHeight", "", "getInputModel", "Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "getTitle", "", "isFullScreen", "", "notifyKeyboardChange", "", "shown", "onBackPressed", "InputSupportType", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
public interface IOutInputSupport {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/keyboard/plugin/input/IOutInputSupport$InputSupportType;", "", "(Ljava/lang/String;I)V", "POSTINPUT", "TEXTINPUT", "THREADPOSTINPUT", "NONE", "im_keyboard_release"}, mo238835k = 1, mv = {1, 1, 16})
    public enum InputSupportType {
        POSTINPUT,
        TEXTINPUT,
        THREADPOSTINPUT,
        NONE
    }

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.keyboard.plugin.input.IOutInputSupport$a */
    public static final class C40685a {
        /* renamed from: a */
        public static String m160899a(IOutInputSupport iOutInputSupport) {
            return "";
        }

        /* renamed from: a */
        public static void m160900a(IOutInputSupport iOutInputSupport, boolean z) {
        }

        /* renamed from: b */
        public static boolean m160901b(IOutInputSupport iOutInputSupport) {
            return false;
        }

        /* renamed from: c */
        public static boolean m160902c(IOutInputSupport iOutInputSupport) {
            return false;
        }
    }

    /* renamed from: a */
    void mo146900a(boolean z);

    /* renamed from: f */
    boolean mo146901f();

    /* renamed from: g */
    String mo146902g();

    /* renamed from: h */
    boolean mo146903h();

    /* renamed from: l */
    EditText mo146904l();

    /* renamed from: m */
    InputSupportType mo146905m();

    /* renamed from: n */
    int mo146906n();
}
