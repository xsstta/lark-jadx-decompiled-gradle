package com.ss.android.lark.ai;

import com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout;

public interface IComposeController extends KeyboardDetectorFrameLayout.AbstractC58470a {

    /* renamed from: com.ss.android.lark.ai.IComposeController$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(IComposeController iComposeController, int i) {
        }

        public static void $default$b(IComposeController iComposeController) {
        }
    }

    /* renamed from: a */
    void mo101539a();

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
    /* renamed from: a */
    void mo101540a(int i);

    /* renamed from: a */
    void mo101541a(AbstractC28531b bVar);

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a
    /* renamed from: b */
    void mo101542b();

    public enum ConvoType {
        THREAD("thread"),
        CHAT("chat");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private ConvoType(String str) {
            this.value = str;
        }
    }

    public enum EditorType {
        TEXT("text"),
        RTE("rte");
        
        private String value;

        public String getValue() {
            return this.value;
        }

        private EditorType(String str) {
            this.value = str;
        }
    }
}
