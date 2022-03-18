package com.bytedance.ee.util.p712o.p713a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import io.reactivex.AbstractC69009q;
import io.reactivex.android.AbstractC68262a;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ee.util.o.a.c */
public final class C13717c extends AbstractC13715a<CharSequence> {

    /* renamed from: a */
    private final TextView f35912a;

    /* renamed from: com.bytedance.ee.util.o.a.c$a */
    static final class C13718a extends AbstractC68262a implements TextWatcher {

        /* renamed from: a */
        private final TextView f35913a;

        /* renamed from: b */
        private final AbstractC69009q<? super CharSequence> f35914b;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* access modifiers changed from: protected */
        @Override // io.reactivex.android.AbstractC68262a
        /* renamed from: a */
        public void mo28971a() {
            this.f35913a.removeTextChangedListener(this);
        }

        C13718a(TextView textView, AbstractC69009q<? super CharSequence> qVar) {
            this.f35913a = textView;
            this.f35914b = qVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!isDisposed()) {
                this.f35914b.onNext(charSequence);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public CharSequence mo50681a() {
        return this.f35912a.getText();
    }

    C13717c(TextView textView) {
        this.f35912a = textView;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.util.p712o.p713a.AbstractC13715a
    /* renamed from: a */
    public void mo50682a(AbstractC69009q<? super CharSequence> qVar) {
        C13718a aVar = new C13718a(this.f35912a, qVar);
        qVar.onSubscribe(aVar);
        this.f35912a.addTextChangedListener(aVar);
    }
}
