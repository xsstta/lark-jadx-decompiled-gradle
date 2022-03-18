package com.bytedance.ee.bear.document.search;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.aj;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.document.DocViewModel;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10549e;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import com.bytedance.ee.bear.p522q.p523a.C10548d;
import com.bytedance.ee.bear.widgets.universedesign.SpaceEditText;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import java.util.Locale;

/* renamed from: com.bytedance.ee.bear.document.search.a */
public class View$OnClickListenerC6104a extends C7667e implements View.OnClickListener, AbstractC10549e {

    /* renamed from: a */
    protected View f16990a;

    /* renamed from: b */
    protected SpaceEditText f16991b;

    /* renamed from: c */
    protected TextView f16992c;

    /* renamed from: d */
    protected ImageView f16993d;

    /* renamed from: e */
    protected ImageView f16994e;

    /* renamed from: f */
    protected C6106b f16995f;

    /* renamed from: g */
    private View f16996g;

    /* renamed from: h */
    private TextView f16997h;

    /* renamed from: i */
    private TextWatcher f16998i;

    /* renamed from: j */
    private DocViewModel f16999j;

    /* renamed from: a */
    public Class<? extends C6106b> mo24629a() {
        return C6106b.class;
    }

    /* access modifiers changed from: public */
    /* renamed from: e */
    private /* synthetic */ void m24664e() {
        C10548d.m43703b(this.f16991b);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        this.f16995f.setActive(false);
        return true;
    }

    /* renamed from: d */
    private void m24663d() {
        this.f16990a.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, -1.0f, 1, BitmapDescriptorFactory.HUE_RED);
        translateAnimation.setDuration(200);
        this.f16990a.startAnimation(translateAnimation);
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (getActivity() != null && !getActivity().getSupportFragmentManager().isDestroyed()) {
            AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
            b.mo39928b(this);
            b.mo39928b(this.f16995f);
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f16991b.removeTextChangedListener(this.f16998i);
        if (this.f16995f.shouldCloseKeyboardOnDestroy()) {
            mo24630b();
        }
        this.f16995f.clearSearchResult();
        this.f16995f.getTotal().mo5929b((Integer) -1);
        super.onDestroyView();
    }

    /* renamed from: c */
    private void m24662c() {
        DocViewModel docViewModel = this.f16999j;
        if (docViewModel != null) {
            String documentType = docViewModel.getDocumentType();
            if (TextUtils.equals(documentType, C8275a.f22372e.mo32553a())) {
                this.f16991b.setHint(R.string.Doc_Facade_SearchInSheet);
                this.f16992c.setText(R.string.Doc_Doc_SearchDone);
            } else if (TextUtils.equals(documentType, C8275a.f22373f.mo32553a())) {
                this.f16991b.setHint(R.string.Bitable_Search_PleaseEnterKeyword);
                this.f16992c.setText(R.string.Bitable_Common_ButtonCancel);
            } else {
                this.f16991b.setHint(R.string.Doc_Facade_SearchInDoc);
                this.f16992c.setText(R.string.Doc_Doc_SearchDone);
            }
        }
    }

    /* renamed from: b */
    public void mo24630b() {
        if (AbstractC10550f.AbstractC10551a.m43717b(getActivity()).mo39934h() > 0) {
            C10548d.m43697a((View) this.f16991b);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m24661b(Integer num) {
        Integer b = this.f16995f.getTotal().mo5927b();
        if (num != null && b != null) {
            m24657a(num.intValue(), b.intValue());
            m24660b(num.intValue(), b.intValue());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16998i = new TextWatcher() {
            /* class com.bytedance.ee.bear.document.search.View$OnClickListenerC6104a.C61051 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                View$OnClickListenerC6104a.this.f16995f.search(editable.toString(), false);
            }
        };
        if (getActivity() != null) {
            this.f16995f = (C6106b) aj.m5366a(getActivity()).mo6005a(mo24629a());
            this.f16999j = (DocViewModel) C4950k.m20474a(this, DocViewModel.class);
            AbstractC10550f b = AbstractC10550f.AbstractC10551a.m43717b(getActivity());
            b.mo39924a(this.f16995f);
            b.mo39924a(this);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m24658a(Integer num) {
        Integer b = this.f16995f.getCurrentIndex().mo5927b();
        if (num != null && b != null) {
            m24657a(b.intValue(), num.intValue());
            m24660b(b.intValue(), num.intValue());
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.search_done) {
            this.f16995f.setActive(false);
        } else if (view.getId() == R.id.search_pre) {
            Integer b = this.f16995f.getCurrentIndex().mo5927b();
            Integer b2 = this.f16995f.getTotal().mo5927b();
            if (!(b == null || b2 == null || b2.intValue() <= 0)) {
                Integer valueOf = Integer.valueOf(((b.intValue() + b2.intValue()) - 1) % b2.intValue());
                this.f16995f.switchResult(valueOf.intValue());
                this.f16995f.getCurrentIndex().mo5929b(valueOf);
            }
            mo24630b();
        } else if (view.getId() == R.id.search_next) {
            Integer b3 = this.f16995f.getCurrentIndex().mo5927b();
            Integer b4 = this.f16995f.getTotal().mo5927b();
            if (!(b3 == null || b4 == null || b4.intValue() <= 0)) {
                Integer valueOf2 = Integer.valueOf(Integer.valueOf(b3.intValue() + 1).intValue() % b4.intValue());
                this.f16995f.switchResult(valueOf2.intValue());
                this.f16995f.getCurrentIndex().mo5929b(valueOf2);
            }
            mo24630b();
        }
    }

    /* renamed from: b */
    private void m24660b(int i, int i2) {
        boolean z;
        ImageView imageView = this.f16993d;
        boolean z2 = false;
        if (i2 <= 1 || i == 0) {
            z = false;
        } else {
            z = true;
        }
        imageView.setEnabled(z);
        ImageView imageView2 = this.f16994e;
        if (i2 > 1 && i != i2 - 1) {
            z2 = true;
        }
        imageView2.setEnabled(z2);
    }

    /* renamed from: a */
    private void m24657a(int i, int i2) {
        int i3;
        if (i2 > -1) {
            TextView textView = this.f16997h;
            Locale locale = Locale.US;
            Object[] objArr = new Object[2];
            if (i2 > 0) {
                i3 = i + 1;
            } else {
                i3 = 0;
            }
            objArr[0] = Integer.valueOf(i3);
            objArr[1] = this.f16995f.getTotal().mo5927b();
            textView.setText(String.format(locale, "%d/%d", objArr));
            return;
        }
        this.f16997h.setText("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f16990a = view.findViewById(R.id.doc_search_top_bar);
        this.f16996g = view.findViewById(R.id.doc_search_bottom_bar);
        this.f16991b = (SpaceEditText) view.findViewById(R.id.search_et);
        this.f16997h = (TextView) view.findViewById(R.id.search_count);
        this.f16992c = (TextView) view.findViewById(R.id.search_done);
        this.f16993d = (ImageView) view.findViewById(R.id.search_pre);
        this.f16994e = (ImageView) view.findViewById(R.id.search_next);
        this.f16995f.getCurrentIndex().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$a$TivITLG3gRLfakQYTg7CDv6dLis */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnClickListenerC6104a.lambda$TivITLG3gRLfakQYTg7CDv6dLis(View$OnClickListenerC6104a.this, (Integer) obj);
            }
        });
        this.f16995f.getTotal().mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$a$IzjgQMqFH1MU_fnYaXRR8ny54Fg */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                View$OnClickListenerC6104a.lambda$IzjgQMqFH1MU_fnYaXRR8ny54Fg(View$OnClickListenerC6104a.this, (Integer) obj);
            }
        });
        this.f16991b.addTextChangedListener(this.f16998i);
        this.f16991b.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$a$foR3dCW00U_TP_2e_AtBLj3XBcI */

            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                return View$OnClickListenerC6104a.lambda$foR3dCW00U_TP_2e_AtBLj3XBcI(View$OnClickListenerC6104a.this, textView, i, keyEvent);
            }
        });
        m24662c();
        this.f16993d.setEnabled(false);
        this.f16994e.setEnabled(false);
        this.f16992c.setOnClickListener(this);
        this.f16993d.setOnClickListener(this);
        this.f16994e.setOnClickListener(this);
        this.f16991b.postDelayed(new Runnable() {
            /* class com.bytedance.ee.bear.document.search.$$Lambda$a$7jbZTMZOoE2i4D2RlzL_ujbmsU */

            public final void run() {
                View$OnClickListenerC6104a.m269297lambda$7jbZTMZOoE2i4D2RlzL_ujbmsU(View$OnClickListenerC6104a.this);
            }
        }, 200);
        m24663d();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.doc_search_fragment, viewGroup, false);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m24659a(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        mo24630b();
        this.f16995f.search(this.f16991b.getText().toString(), true);
        return true;
    }

    @Override // com.bytedance.ee.bear.p522q.p523a.AbstractC10549e
    public void onKeyboardHeightChanged(AbstractC10550f fVar, int i, int i2) {
        View view = getView();
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.bottomMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return super.onCreateAnimation(i, z, i2);
        }
        this.f16996g.setVisibility(8);
        TranslateAnimation translateAnimation = new TranslateAnimation(1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, BitmapDescriptorFactory.HUE_RED, 1, -1.0f);
        translateAnimation.setDuration(500);
        return translateAnimation;
    }
}
