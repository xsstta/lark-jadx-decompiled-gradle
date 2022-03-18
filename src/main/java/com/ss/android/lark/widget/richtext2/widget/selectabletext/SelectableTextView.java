package com.ss.android.lark.widget.richtext2.widget.selectabletext;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.richtext2.widget.selectabletext.C59096a;

public class SelectableTextView extends AppCompatTextView implements View.OnClickListener {

    /* renamed from: a */
    private Context f146510a;

    /* renamed from: b */
    private C59096a f146511b;

    /* renamed from: c */
    private AbstractC59095a f146512c;

    /* renamed from: com.ss.android.lark.widget.richtext2.widget.selectabletext.SelectableTextView$a */
    public interface AbstractC59095a {
        void onFinish();
    }

    /* renamed from: a */
    private void m229542a() {
        m229544b();
        setOnClickListener(this);
    }

    /* renamed from: b */
    private void m229544b() {
        setTextIsSelectable(false);
        C59096a a = new C59096a.C59098a(this).mo200785a((float) UIHelper.getDimens(R.dimen.cursor_handle_size)).mo200786a(UIHelper.getColor(R.color.cursor_handle_color)).mo200788b(UIHelper.getColor(R.color.selected_txt_color)).mo200787a();
        this.f146511b = a;
        a.mo200779a(new C59096a.AbstractC59100c() {
            /* class com.ss.android.lark.widget.richtext2.widget.selectabletext.$$Lambda$SelectableTextView$tMxqBAQTPhuIWJGEFhCtzWgCQc */

            @Override // com.ss.android.lark.widget.richtext2.widget.selectabletext.C59096a.AbstractC59100c
            public final void onTextSelected(C59102b bVar) {
                SelectableTextView.m271102lambda$tMxqBAQTPhuIWJGEFhCtzWgCQc(SelectableTextView.this, bVar);
            }
        });
    }

    public void setCallBack(AbstractC59095a aVar) {
        this.f146512c = aVar;
    }

    public SelectableTextView(Context context) {
        this(context, null);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.f146511b.mo200778a(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m229543a(C59102b bVar) {
        LKUIToast.show(this.f146510a, (int) R.string.Lark_Legacy_CopySuccess);
        ((ClipboardManager) this.f146510a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(bVar.f146554c, bVar.f146554c));
    }

    public void onClick(View view) {
        if (this.f146511b.f146518f) {
            this.f146511b.mo200776a();
            return;
        }
        AbstractC59095a aVar = this.f146512c;
        if (aVar != null) {
            aVar.onFinish();
        }
    }

    public SelectableTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectableTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f146510a = context;
        m229542a();
    }
}
