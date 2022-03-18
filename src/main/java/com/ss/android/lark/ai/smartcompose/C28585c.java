package com.ss.android.lark.ai.smartcompose;

import android.app.Activity;
import android.graphics.Point;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.AbstractC28531b;
import com.ss.android.lark.ai.C28522a;
import com.ss.android.lark.ai.IComposeController;
import com.ss.android.lark.ai.smartcompose.C28578a;
import com.ss.android.lark.ai.smartcompose.p1341a.C28580a;
import com.ss.android.lark.ai.smartcompose.p1341a.C28581b;
import com.ss.android.lark.ai.smartcompose.p1342b.AbstractC28584b;
import com.ss.android.lark.ai.smartreply.p1345c.p1346a.C28606a;
import com.ss.android.lark.ai.statistics.smartcompose.SmartComposeHitpoint;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.BubbleListener;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.MaskConfig;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.keyboard.plugin.input.AbstractC40729d;
import com.ss.android.lark.keyboard.plugin.input.RichTextEmojiconEditText;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.util.share_preference.UserSP;
import com.ss.android.lark.utils.UIHelper;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.ai.smartcompose.c */
public class C28585c implements AbstractC28584b {

    /* renamed from: a */
    public String f71929a;

    /* renamed from: b */
    public boolean f71930b;

    /* renamed from: c */
    public IComposeController.ConvoType f71931c;

    /* renamed from: d */
    public IComposeController.EditorType f71932d;

    /* renamed from: e */
    private String f71933e;

    /* renamed from: f */
    private AbstractC28531b f71934f;

    /* renamed from: g */
    private C28581b f71935g;

    /* renamed from: h */
    private C28580a f71936h;

    /* renamed from: i */
    private CharSequence f71937i;

    /* renamed from: j */
    private GuideDelegate f71938j;

    /* renamed from: k */
    private ComposeTagSpan f71939k;

    /* renamed from: l */
    private CharSequence f71940l;

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a, com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101540a(int i) {
    }

    public void afterTextChanged(Editable editable) {
    }

    @Override // com.ss.android.lark.widget.lark_chat_keyboard.widget.KeyboardDetectorFrameLayout.AbstractC58470a, com.ss.android.lark.ai.IComposeController
    /* renamed from: b */
    public void mo101542b() {
        mo101769c();
    }

    @Override // com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101541a(AbstractC28531b bVar) {
        if (mo101770d()) {
            this.f71934f = bVar;
            EditText a = bVar.mo101577a();
            if (a != null) {
                a.addTextChangedListener(this);
                C28578a aVar = new C28578a(a.getMovementMethod());
                aVar.mo101751a(new C28578a.AbstractC28579a() {
                    /* class com.ss.android.lark.ai.smartcompose.$$Lambda$c$_8st8y3IiW2Sgb2lsDJYTQg6zcw */

                    @Override // com.ss.android.lark.ai.smartcompose.C28578a.AbstractC28579a
                    public final void onOtherAreaClick(Spannable spannable) {
                        C28585c.this.m104815a((C28585c) spannable);
                    }
                });
                a.setMovementMethod(aVar);
            }
        }
    }

    /* renamed from: a */
    public void mo101766a(C28580a aVar) {
        AbstractC28531b bVar = this.f71934f;
        if (bVar != null) {
            EditText a = bVar.mo101577a();
            if (!aVar.f71917d.booleanValue() || aVar.f71914a.isEmpty() || a == null) {
                this.f71933e = null;
                return;
            }
            String a2 = m104812a(this.f71933e, m104811a(a));
            if (a2 == null) {
                this.f71933e = null;
            } else if ("".equals(a2)) {
                m104817a(aVar, aVar.f71914a.get(0), a);
            } else {
                for (C28581b bVar2 : aVar.f71914a) {
                    if (bVar2.f71919a.startsWith(a2)) {
                        bVar2.f71919a = bVar2.f71919a.substring(a2.length());
                        m104817a(aVar, bVar2, a);
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo101770d() {
        if (!C28522a.m104531a().mo101558a("suite.ai.smart_compose.mobile.enabled") || !C28522a.m104531a().mo101559b().mo101570b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public void mo101769c() {
        EditText a;
        AbstractC28531b bVar = this.f71934f;
        if (!(bVar == null || (a = bVar.mo101577a()) == null)) {
            GuideDelegate gVar = this.f71938j;
            if (gVar != null && gVar.mo141658a()) {
                this.f71938j.mo141659b();
                this.f71938j = null;
            }
            this.f71935g = null;
            this.f71936h = null;
            this.f71933e = null;
            this.f71939k = null;
            Editable editableText = a.getEditableText();
            AbstractC40729d[] dVarArr = (AbstractC40729d[]) editableText.getSpans(0, editableText.length(), AbstractC40729d.class);
            int i = -1;
            int i2 = -1;
            for (int length = dVarArr.length - 1; length >= 0; length--) {
                AbstractC40729d dVar = dVarArr[length];
                int spanStart = editableText.getSpanStart(dVar);
                int spanEnd = editableText.getSpanEnd(dVar);
                editableText.removeSpan(dVar);
                if (spanStart >= 0 && (i == -1 || spanStart < i)) {
                    i = spanStart;
                }
                if (spanEnd >= 0 && spanEnd > i2) {
                    i2 = spanEnd;
                }
            }
            a.removeTextChangedListener(this);
            if (i >= 0 && i2 >= 0 && i < i2) {
                editableText.replace(i, i2, "");
            }
            a.addTextChangedListener(this);
        }
    }

    @Override // com.ss.android.lark.ai.IComposeController
    /* renamed from: a */
    public void mo101539a() {
        AbstractC28531b bVar = this.f71934f;
        if (!(bVar == null || bVar.mo101577a() == null)) {
            this.f71934f.mo101577a().removeTextChangedListener(this);
        }
        this.f71934f = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.ai.smartcompose.c$a */
    public static class C28587a extends UIGetDataCallback<C28580a> {

        /* renamed from: a */
        private WeakReference<C28585c> f71943a;

        C28587a(C28585c cVar) {
            this.f71943a = new WeakReference<>(cVar);
        }

        @Override // com.larksuite.framework.callback.UIGetDataCallback
        public void onErrored(ErrorResult errorResult) {
            C28585c cVar = this.f71943a.get();
            if (cVar != null) {
                cVar.f71930b = false;
            }
        }

        /* renamed from: a */
        public void onSuccessed(C28580a aVar) {
            C28585c cVar = this.f71943a.get();
            if (cVar != null) {
                cVar.mo101766a(aVar);
                cVar.f71930b = false;
            }
        }
    }

    /* renamed from: a */
    private String m104811a(EditText editText) {
        if (editText instanceof RichTextEmojiconEditText) {
            return ((RichTextEmojiconEditText) editText).mo146908a(true);
        }
        return editText.getEditableText().toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104815a(Spannable spannable) {
        if (this.f71935g != null) {
            SmartComposeHitpoint.f71690a.mo101596b(this.f71929a, this.f71935g.f71920b, this.f71936h.f71916c, this.f71932d.getValue(), this.f71936h.f71915b.intValue(), this.f71931c.getValue());
            mo101769c();
        }
    }

    /* renamed from: a */
    private void m104818a(String str) {
        if (!this.f71930b && !TextUtils.isEmpty(str)) {
            this.f71930b = true;
            this.f71933e = str;
            C28606a.m104900a().mo101822a(str, this.f71929a, new C28587a(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m104813a(Editable editable, EditText editText) {
        m104814a(editable, this.f71939k, editText);
    }

    /* renamed from: a */
    private String m104812a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !str2.startsWith(str)) {
            return null;
        }
        if (str2.length() == str.length()) {
            return "";
        }
        return str2.substring(str.length());
    }

    public C28585c(String str, IComposeController.ConvoType convoType, IComposeController.EditorType editorType) {
        this.f71929a = str;
        this.f71931c = convoType;
        this.f71932d = editorType;
    }

    /* renamed from: a */
    private void m104814a(Editable editable, ComposeTagSpan composeTagSpan, EditText editText) {
        int i;
        int i2;
        int i3;
        int spanStart = editable.getSpanStart(composeTagSpan);
        int spanEnd = editable.getSpanEnd(composeTagSpan);
        Layout layout = editText.getLayout();
        int lineForOffset = layout.getLineForOffset(spanStart);
        int lineForOffset2 = layout.getLineForOffset(spanEnd);
        float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
        float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
        if (lineForOffset == lineForOffset2) {
            i2 = layout.getLineTop(lineForOffset);
            i = layout.getLineBottom(lineForOffset);
        } else {
            float primaryHorizontal3 = layout.getPrimaryHorizontal(layout.getLineVisibleEnd(lineForOffset));
            float primaryHorizontal4 = layout.getPrimaryHorizontal(layout.getLineStart(lineForOffset2));
            if (primaryHorizontal3 - primaryHorizontal > primaryHorizontal2 - primaryHorizontal4) {
                i2 = layout.getLineTop(lineForOffset);
                i = layout.getLineBottom(lineForOffset);
                primaryHorizontal2 = primaryHorizontal3;
            } else {
                int lineTop = layout.getLineTop(lineForOffset2);
                i = layout.getLineBottom(lineForOffset2);
                i2 = lineTop;
                primaryHorizontal = primaryHorizontal4;
            }
        }
        int[] iArr = new int[2];
        editText.getLocationOnScreen(iArr);
        int b = C57582a.m223609b(editText.getContext());
        AnchorConfig.AnchorGravity anchorGravity = AnchorConfig.AnchorGravity.TOP;
        if (iArr[1] + i2 < b / 2) {
            anchorGravity = AnchorConfig.AnchorGravity.BOTTOM;
        }
        int width = (int) (((primaryHorizontal2 + primaryHorizontal) - ((float) editText.getWidth())) / 2.0f);
        if (anchorGravity == AnchorConfig.AnchorGravity.TOP) {
            i3 = -i2;
        } else {
            i3 = i - editText.getHeight();
        }
        m104816a(editText, width, i3, i2 - i, anchorGravity);
    }

    /* renamed from: a */
    private void m104817a(C28580a aVar, C28581b bVar, EditText editText) {
        Editable text = editText.getText();
        int length = text.length();
        this.f71935g = bVar;
        this.f71936h = aVar;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bVar.f71919a);
        SmartComposeController$1 smartComposeController$1 = new SmartComposeController$1(this, UIHelper.getColor(R.color.lkui_N400), editText, bVar, aVar);
        this.f71939k = smartComposeController$1;
        spannableStringBuilder.setSpan(smartComposeController$1, 0, spannableStringBuilder.length(), 34);
        int i = UserSP.getInstance().getInt("key_compose_add_tab_times", 0);
        if (i < 3) {
            UserSP.getInstance().putInt("key_compose_add_tab_times", i + 1);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new C28582b(editText.getContext(), UIHelper.dp2px(20.0f), 0, R.drawable.ic_smart_compose_tab, UIHelper.dp2px(4.0f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 34);
        }
        editText.removeTextChangedListener(this);
        text.append((CharSequence) spannableStringBuilder);
        editText.setSelection(length);
        editText.addTextChangedListener(this);
        SmartComposeHitpoint.f71690a.mo101593a(this.f71929a, bVar.f71920b, bVar.f71919a.length() - 1, aVar.f71916c, this.f71932d.getValue(), aVar.f71915b.intValue(), this.f71931c.getValue());
        if (C28522a.m104531a().mo101553a().mo101568a("mobile_suite_ai_smart_compose")) {
            editText.post(new Runnable(text, editText) {
                /* class com.ss.android.lark.ai.smartcompose.$$Lambda$c$mVUZTFzMW1NzzeeTPfPPt5AP4Bo */
                public final /* synthetic */ Editable f$1;
                public final /* synthetic */ EditText f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void run() {
                    C28585c.this.m104813a((C28585c) this.f$1, (Editable) this.f$2);
                }
            });
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.f71940l = charSequence.toString();
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText a;
        if (this.f71934f != null && !TextUtils.equals(charSequence, this.f71937i) && (a = this.f71934f.mo101577a()) != null) {
            if (i3 > i2 && charSequence.length() > i + i3 && this.f71939k != null) {
                int i4 = i + 1;
                int i5 = i4 + i2;
                if (TextUtils.equals(charSequence.subSequence(0, i5), this.f71940l.subSequence(0, i5))) {
                    a.removeTextChangedListener(this);
                    a.getEditableText().delete(i5, i4 + i3);
                    a.addTextChangedListener(this);
                    int spanStart = a.getEditableText().getSpanStart(this.f71939k);
                    int spanEnd = a.getEditableText().getSpanEnd(this.f71939k);
                    if (spanStart > spanEnd) {
                        mo101769c();
                        return;
                    }
                    this.f71935g.f71919a = a.getEditableText().subSequence(spanStart, spanEnd).toString();
                    if (TextUtils.isEmpty(this.f71935g.f71919a)) {
                        mo101769c();
                        return;
                    }
                    return;
                }
            }
            this.f71937i = charSequence.toString();
            if (this.f71935g != null) {
                SmartComposeHitpoint.f71690a.mo101595a(this.f71929a, this.f71935g.f71920b, this.f71936h.f71916c, this.f71932d.getValue(), this.f71936h.f71915b.intValue(), this.f71931c.getValue());
                mo101769c();
            } else if (charSequence.length() >= 2 && charSequence.charAt(charSequence.length() - 2) == ' ' && i2 <= i3 && i3 <= 1) {
                m104818a(m104811a(a));
            }
        }
    }

    /* renamed from: a */
    private void m104816a(EditText editText, int i, int i2, int i3, AnchorConfig.AnchorGravity anchorGravity) {
        Activity b;
        int i4;
        int i5;
        AbstractC28531b bVar = this.f71934f;
        if (bVar != null && (b = bVar.mo101578b()) != null) {
            View inflate = LayoutInflater.from(b).inflate(R.layout.guide_tab_gesture_layout, (ViewGroup) null);
            int dp2px = UIUtils.dp2px(b, 48.0f);
            final PopupWindow popupWindow = new PopupWindow(inflate, dp2px, dp2px);
            popupWindow.setFocusable(false);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setTouchable(false);
            if (anchorGravity.getValue() == 48) {
                i4 = dp2px - i2;
            } else {
                i4 = i2 + i3;
            }
            popupWindow.showAsDropDown(editText, ((editText.getWidth() - dp2px) / 2) + i, i4, anchorGravity.getValue());
            if (anchorGravity.getValue() == 80) {
                i5 = dp2px + i4;
            } else {
                i5 = i2;
            }
            TextBubbleConfig kVar = new TextBubbleConfig(new AnchorConfig(editText, anchorGravity, new Point(i, i5)), new MaskConfig(0, BitmapDescriptorFactory.HUE_RED, MaskConfig.ShapeType.RECTANGLE, null, null), null, editText.getContext().getString(R.string.Lark_Composer_NUXMobile));
            kVar.mo141759b(false);
            kVar.mo141757a((Boolean) true);
            kVar.mo141756a(new BubbleListener() {
                /* class com.ss.android.lark.ai.smartcompose.C28585c.C285861 */

                public void onDismiss() {
                    popupWindow.dismiss();
                }
            });
            this.f71938j = GuideComponent.m152613a(b, kVar);
        }
    }
}
