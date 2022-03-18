package com.bytedance.ee.bear.sheet.inputbar.subpanel;

import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.text.Editable;
import android.text.Selection;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.d */
public class C11239d {

    /* renamed from: a */
    public Editable f30246a;

    /* renamed from: b */
    public AbstractC11241a f30247b;

    /* renamed from: c */
    private SheetNumKeyboardView f30248c;

    /* renamed from: d */
    private Keyboard f30249d;

    /* renamed from: e */
    private KeyboardView.OnKeyboardActionListener f30250e = new KeyboardView.OnKeyboardActionListener() {
        /* class com.bytedance.ee.bear.sheet.inputbar.subpanel.C11239d.C112401 */

        public void onPress(int i) {
        }

        public void onRelease(int i) {
        }

        public void onText(CharSequence charSequence) {
        }

        public void swipeDown() {
        }

        public void swipeLeft() {
        }

        public void swipeRight() {
        }

        public void swipeUp() {
        }

        public void onKey(int i, int[] iArr) {
            int spanStart = C11239d.this.f30246a.getSpanStart(Selection.SELECTION_START);
            C11239d.this.f30247b.mo43093s();
            if (i != -5) {
                switch (i) {
                    case CommonCode.StatusCode.API_CLIENT_EXPIRED /*{ENCODED_INT: 1001}*/:
                        C11239d.this.f30246a.insert(spanStart, C11239d.this.mo43094a(CommonCode.StatusCode.API_CLIENT_EXPIRED));
                        C11239d.this.f30247b.mo43089o();
                        return;
                    case 1002:
                        C11239d.this.f30246a.insert(spanStart, C11239d.this.mo43094a(1002));
                        C11239d.this.f30247b.mo43090p();
                        return;
                    case 1003:
                        C11239d.this.f30246a.insert(spanStart, C11239d.this.mo43094a(1003));
                        C11239d.this.f30247b.mo43091q();
                        return;
                    case 1004:
                        if (C11239d.this.f30246a == null || C11239d.this.f30246a.length() <= 0) {
                            if (C11239d.this.f30246a.length() == 0) {
                                C11239d.this.f30246a.insert(0, "-");
                            }
                        } else if (C11239d.this.f30246a.toString().charAt(0) == '-') {
                            C11239d.this.f30246a.delete(0, 1);
                        } else {
                            C11239d.this.f30246a.insert(0, "-");
                        }
                        C11239d.this.f30247b.mo43092r();
                        return;
                    case 1005:
                        C11239d.this.f30246a.insert(spanStart, C11239d.this.mo43094a(1005));
                        return;
                    case 1006:
                        C11239d.this.f30247b.mo43087k();
                        return;
                    case 1007:
                        C11239d.this.f30247b.mo43088l();
                        return;
                    case 1008:
                        C11239d.this.f30246a.insert(spanStart, C11239d.this.mo43094a(1008));
                        return;
                    default:
                        C11239d.this.f30246a.insert(spanStart, Character.toString((char) i));
                        return;
                }
            } else if (C11239d.this.f30246a != null && C11239d.this.f30246a.length() > 0 && spanStart > 0) {
                C11239d.this.f30246a.delete(spanStart - 1, spanStart);
            }
        }
    };

    /* renamed from: com.bytedance.ee.bear.sheet.inputbar.subpanel.d$a */
    public interface AbstractC11241a {
        /* renamed from: k */
        void mo43087k();

        /* renamed from: l */
        void mo43088l();

        /* renamed from: o */
        void mo43089o();

        /* renamed from: p */
        void mo43090p();

        /* renamed from: q */
        void mo43091q();

        /* renamed from: r */
        void mo43092r();

        /* renamed from: s */
        void mo43093s();
    }

    /* renamed from: a */
    public void mo43095a(AbstractC11241a aVar) {
        this.f30247b = aVar;
    }

    /* renamed from: a */
    public String mo43094a(int i) {
        if (i == 1001) {
            return this.f30248c.getCurrencySymbol();
        }
        return this.f30248c.mo43065a(i);
    }

    public C11239d(SheetNumKeyboardView sheetNumKeyboardView, Editable editable) {
        this.f30248c = sheetNumKeyboardView;
        this.f30246a = editable;
        this.f30249d = new Keyboard(sheetNumKeyboardView.getContext(), R.xml.sheet_number_keyboard);
        this.f30248c.setOnKeyboardActionListener(this.f30250e);
        this.f30248c.setKeyboard(this.f30249d);
        this.f30248c.setEnabled(true);
        this.f30248c.setPreviewEnabled(false);
    }
}
