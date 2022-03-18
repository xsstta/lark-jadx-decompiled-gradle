package com.bytedance.ee.bear.doc.follow.p295a;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.doc.follow.AbstractC5427d;
import com.bytedance.ee.bear.doc.follow.AbstractC5428e;
import com.bytedance.ee.bear.doc.follow.AbstractC5431f;
import com.bytedance.ee.bear.doc.follow.FollowModuleState;
import com.bytedance.ee.bear.doc.follow.event.ContentEvent;
import com.bytedance.ee.bear.doc.follow.event.OpenLinkEvent;

/* renamed from: com.bytedance.ee.bear.doc.follow.a.a */
public class C5416a extends Fragment {

    /* renamed from: a */
    public C5418a f15471a;

    /* renamed from: a */
    private String m21993a() {
        return "url_token";
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.doc.follow.a.a$a */
    public class C5418a implements AbstractC5427d {

        /* renamed from: b */
        private AbstractC5428e f15474b;

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
        /* renamed from: a */
        public String mo21661a() {
            return "test";
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
        /* renamed from: a */
        public void mo21662a(FollowModuleState followModuleState) {
        }

        /* renamed from: b */
        public FollowModuleState mo21665b() {
            return null;
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
        /* renamed from: b */
        public void mo21666b(FollowModuleState followModuleState) {
        }

        private C5418a() {
        }

        /* renamed from: c */
        public void mo21667c(FollowModuleState followModuleState) {
            AbstractC5428e eVar = this.f15474b;
            if (eVar != null) {
                eVar.mo21685a(followModuleState);
            }
        }

        @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
        /* renamed from: a */
        public void mo21663a(AbstractC5428e eVar) {
            this.f15474b = eVar;
        }

        /* renamed from: a */
        public boolean mo21664a(ContentEvent contentEvent) {
            AbstractC5428e eVar = this.f15474b;
            if (eVar != null) {
                return eVar.mo21686a(contentEvent);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m21994a(View view) {
        this.f15471a.mo21664a(new OpenLinkEvent("test", "http://www.qq.com"));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC5431f a = AbstractC5431f.m22018a(this, m21993a());
        C5418a aVar = new C5418a();
        this.f15471a = aVar;
        a.mo21711a(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EditText editText = new EditText(getContext());
        editText.addTextChangedListener(new TextWatcher() {
            /* class com.bytedance.ee.bear.doc.follow.p295a.C5416a.C54171 */

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void afterTextChanged(Editable editable) {
                C5416a.this.f15471a.mo21667c(C5416a.this.f15471a.mo21665b());
            }
        });
        editText.setOnClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.doc.follow.p295a.$$Lambda$a$KQFfgxI_EvFVpfDMizte2TBP4 */

            public final void onClick(View view) {
                C5416a.m269173lambda$KQFfgxI_EvFVpfDMizte2TBP4(C5416a.this, view);
            }
        });
    }
}
