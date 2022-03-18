package com.bytedance.ee.bear.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.at.AbstractC4230c;
import com.bytedance.ee.bear.at.AbstractC4246j;
import com.bytedance.ee.bear.at.C4233d;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bean.C4520c;
import com.bytedance.ee.bear.facade.common.AbstractC7717k;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.p526r.C10602d;
import com.bytedance.ee.bear.widget.C11766a;
import com.bytedance.ee.bear.widgets.MaxHeightLayout;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import io.reactivex.Single;
import java.util.Objects;

public class AtEditText extends SpaceEditText implements AbstractC4246j, AbstractC7717k {

    /* renamed from: a */
    private MaxHeightLayout f31602a;

    /* renamed from: b */
    protected C11768b f31603b;

    /* renamed from: c */
    public AbstractC4230c f31604c;

    /* renamed from: d */
    public AbstractC11759c f31605d;

    /* renamed from: f */
    private AtFinderView f31606f;

    /* renamed from: g */
    private View f31607g;

    /* renamed from: h */
    private Context f31608h;

    /* renamed from: i */
    private AbstractC11757a f31609i;

    /* renamed from: j */
    private AbstractC11758b f31610j;

    /* renamed from: k */
    private boolean f31611k;

    /* renamed from: com.bytedance.ee.bear.widget.AtEditText$a */
    public interface AbstractC11757a {
        /* renamed from: a */
        boolean mo35414a();

        /* renamed from: b */
        void mo35415b();
    }

    /* renamed from: com.bytedance.ee.bear.widget.AtEditText$b */
    public interface AbstractC11758b {
        /* renamed from: a */
        boolean mo18343a(String str);
    }

    /* renamed from: com.bytedance.ee.bear.widget.AtEditText$c */
    public interface AbstractC11759c {
        void onAtTrigger(boolean z);
    }

    public AbstractC4230c getAtWindow() {
        return this.f31604c;
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4246j
    /* renamed from: a */
    public void mo16676a() {
        getPresenter().mo16676a();
    }

    @Override // com.bytedance.ee.bear.at.AbstractC4246j
    /* renamed from: b */
    public void mo16677b() {
        getPresenter().mo16677b();
    }

    /* renamed from: e */
    public void mo44994e() {
        getPresenter().mo45043h();
    }

    /* renamed from: g */
    public void mo44996g() {
        AbstractC4230c cVar = this.f31604c;
        if (cVar != null) {
            cVar.mo16643c();
        }
    }

    /* renamed from: h */
    public void m48738p() {
        AbstractC4230c cVar = this.f31604c;
        if (cVar != null) {
            cVar.mo16645e();
        }
    }

    /* renamed from: d */
    private boolean mo35490d() {
        AbstractC4230c cVar = this.f31604c;
        if (cVar != null) {
            return cVar.mo16642b();
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo44995f() {
        if (Build.VERSION.SDK_INT >= 23) {
            return super.onTextContextMenuItem(16908337);
        }
        return false;
    }

    public C11768b getPresenter() {
        if (this.f31603b == null) {
            this.f31603b = new C11768b(this);
        }
        return this.f31603b;
    }

    public Single<String> getRichText() {
        return getPresenter().mo45044i();
    }

    /* renamed from: c */
    private void mo35489c() {
        setAtTriggerListener(new C11766a.AbstractC11767a() {
            /* class com.bytedance.ee.bear.widget.AtEditText.C117561 */

            @Override // com.bytedance.ee.bear.widget.C11766a.AbstractC11767a
            /* renamed from: a */
            public void mo45011a() {
                AtEditText.this.mo44996g();
            }

            @Override // com.bytedance.ee.bear.widget.C11766a.AbstractC11767a
            /* renamed from: b */
            public void mo45014b() {
                AtEditText.this.m48738p();
            }

            @Override // com.bytedance.ee.bear.widget.C11766a.AbstractC11767a
            /* renamed from: a */
            public void mo45012a(String str) {
                if (AtEditText.this.f31604c != null) {
                    AtEditText.this.f31604c.mo16641a(str);
                }
            }

            @Override // com.bytedance.ee.bear.widget.C11766a.AbstractC11767a
            /* renamed from: a */
            public void mo45013a(boolean z) {
                if (AtEditText.this.f31605d != null) {
                    AtEditText.this.f31605d.onAtTrigger(z);
                }
                if (AtEditText.this.f31604c != null) {
                    AtEditText.this.f31604c.mo16633a(z);
                }
                AtEditText.this.mo44996g();
            }
        });
        setOnKeyListener(new View.OnKeyListener() {
            /* class com.bytedance.ee.bear.widget.$$Lambda$AtEditText$j26scPA_vYvUovPN4vDpntXAoX8 */

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return AtEditText.this.m48732a(view, i, keyEvent);
            }
        });
    }

    /* renamed from: i */
    public void mo45000i() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        getPresenter().mo45046k();
        Editable text = getText();
        if (text != null) {
            if (selectionStart == -1 || selectionEnd == -1) {
                text.replace(0, text.length(), "@");
            } else {
                text.replace(selectionStart, selectionEnd, "@");
            }
        }
    }

    /* renamed from: j */
    public boolean mo45001j() {
        if (!mo35490d()) {
            return false;
        }
        Context context = this.f31608h;
        if (!(context instanceof Activity)) {
            C10548d.m43696a(context);
            m48738p();
            return true;
        } else if (C10548d.m43701a((Activity) context)) {
            return false;
        } else {
            m48738p();
            return true;
        }
    }

    public void setAtWindow(AbstractC4230c cVar) {
        this.f31604c = cVar;
    }

    public void setOnPasteListener(AbstractC11758b bVar) {
        this.f31610j = bVar;
    }

    public void setOpenMentionListener(AbstractC11759c cVar) {
        this.f31605d = cVar;
    }

    public void setPreImeListener(AbstractC11757a aVar) {
        this.f31609i = aVar;
    }

    public void setText(String str) {
        setRichText(str);
    }

    public AtEditText(Context context) {
        this(context, null);
    }

    private void setAtTriggerListener(C11766a.AbstractC11767a aVar) {
        getPresenter().mo45040a(aVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void setRichText(String str) {
        getPresenter().mo45041b(str);
    }

    /* renamed from: a */
    private void m48731a(Context context) {
        C13479a.m54772d("AtEditText", "init: ");
        this.f31608h = context;
        mo35489c();
    }

    /* renamed from: b */
    private void m48733b(C4233d dVar) {
        Objects.requireNonNull(dVar.f12763l, "AtFinderView is null");
        dVar.f12763l.setAtCommonConfig(dVar.f12757f);
        this.f31604c = new C11775e((FragmentActivity) getContext(), dVar);
    }

    /* renamed from: d */
    private void m48736d(C4233d dVar) {
        if (dVar.f12759h != 0) {
            this.f31604c.mo16627a(dVar.f12759h);
        }
        if (dVar.f12758g != null) {
            this.f31604c.mo16628a(dVar.f12758g);
        }
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        AbstractC11757a aVar;
        if (keyEvent.getKeyCode() != 4 || (aVar = this.f31609i) == null) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        return aVar.mo35414a();
    }

    /* renamed from: a */
    public void mo44988a(C4233d dVar) {
        if (this.f31604c == null) {
            int i = dVar.f12762k;
            if (i == 0) {
                m48735c(dVar);
            } else if (i != 1) {
                C13479a.m54764b("AtEditText", "bindAtWindow(): viewType is Undefined");
            } else {
                m48733b(dVar);
            }
        } else {
            throw new IllegalStateException("AtWindow already exist!!!");
        }
    }

    /* renamed from: c */
    private void m48735c(C4233d dVar) {
        View inflate = LayoutInflater.from(this.f31608h).inflate(R.layout.at_atfinder_popupwindow, (ViewGroup) null);
        this.f31607g = inflate;
        AtFinderView atFinderView = (AtFinderView) inflate.findViewById(R.id.at_finder_view);
        this.f31606f = atFinderView;
        atFinderView.setAtCommonConfig(dVar.f12757f);
        this.f31606f.setAtFinderViewDelegate(new AbstractC11774d() {
            /* class com.bytedance.ee.bear.widget.$$Lambda$AtEditText$iWeLfkOdYvmP3gM_Rq98nJaQY */

            @Override // com.bytedance.ee.bear.widget.AbstractC11774d
            public final void onCancel() {
                AtEditText.this.m48738p();
            }
        });
        this.f31602a = (MaxHeightLayout) this.f31607g.findViewById(R.id.at_container);
        this.f31604c = new C11777f((FragmentActivity) getContext(), this.f31607g, this.f31602a, this.f31606f, dVar);
        m48736d(dVar);
    }

    /* renamed from: a */
    public void mo44989a(C4517a aVar) {
        getPresenter().mo45038a(aVar);
    }

    /* renamed from: a */
    public void mo44990a(C4520c cVar) {
        AbstractC4230c cVar2 = this.f31604c;
        if (cVar2 != null) {
            cVar2.mo16631a(cVar);
        }
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        int i2 = 0;
        if (i == 16908321 || i == 16908320) {
            int length = getText().length();
            if (isFocused()) {
                int selectionStart = getSelectionStart();
                int selectionEnd = getSelectionEnd();
                int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                length = Math.max(0, Math.max(selectionStart, selectionEnd));
                i2 = max;
            }
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) ((SpannableStringBuilder) getText()).subSequence(i2, length);
            if (!getPresenter().mo45042b(spannableStringBuilder)) {
                return super.onTextContextMenuItem(i);
            }
            super.onTextContextMenuItem(i);
            ((ClipboardManager) getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, spannableStringBuilder));
            return true;
        }
        if (i == 16908322 || i == 16908337) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (!(this.f31610j == null || clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0 || primaryClip.getItemAt(0).getText() == null)) {
                if (this.f31610j.mo18343a(primaryClip.getItemAt(0).getText().toString())) {
                    return true;
                }
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public AtEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC11757a aVar;
        if (keyEvent.getKeyCode() == 66 && (aVar = this.f31609i) != null) {
            aVar.mo35415b();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        C13479a.m54772d("AtEditText", "onSelectionChanged: start = " + i + ", end = " + i2);
        getPresenter().mo45037a(i, i2);
    }

    public AtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48731a(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ boolean m48732a(View view, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            return mo45001j();
        }
        return false;
    }

    /* renamed from: a */
    public void mo44991a(boolean z, AbstractC10460a.AbstractC10461a aVar, C10602d.AbstractC10605a aVar2) {
        if (!this.f31611k && z) {
            getPresenter().mo45039a(new C10602d(this, getPresenter(), aVar, aVar2));
        }
        this.f31611k = z;
    }
}
