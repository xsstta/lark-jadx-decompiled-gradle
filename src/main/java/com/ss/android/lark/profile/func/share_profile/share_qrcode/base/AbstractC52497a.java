package com.ss.android.lark.profile.func.share_profile.share_qrcode.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.permission.AbstractC51324c;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.AbstractC52497a;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b;
import com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView;
import com.ss.android.lark.utils.C57805b;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.a */
public abstract class AbstractC52497a extends BaseFragment {

    /* renamed from: a */
    protected AbstractC52503b f129960a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo179494a();

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC52503b bVar = this.f129960a;
        if (bVar != null) {
            bVar.destroy();
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.a$a */
    public class C52498a implements AbstractC52503b.AbstractC52507a {
        public C52498a() {
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.AbstractC52503b.AbstractC52507a
        /* renamed from: a */
        public void mo179504a(AbstractC51324c cVar) {
            C57805b.m224333d(AbstractC52497a.this.getActivity(), new C57805b.AbstractC57809a() {
                /* class com.ss.android.lark.profile.func.share_profile.share_qrcode.base.$$Lambda$a$a$F50Txb3Pn9K5ci5pX_HRbhm92IY */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public final void permissionGranted(boolean z) {
                    AbstractC52497a.C52498a.m203328a(AbstractC51324c.this, z);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m203328a(AbstractC51324c cVar, boolean z) {
            if (cVar != null) {
                if (z) {
                    cVar.mo49823a();
                } else {
                    cVar.mo49824b();
                }
            }
        }
    }

    /* renamed from: com.ss.android.lark.profile.func.share_profile.share_qrcode.base.a$b */
    public class C52499b implements BaseQRCodeView.AbstractC52500a {
        public C52499b() {
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView.AbstractC52500a
        /* renamed from: a */
        public void mo179505a(BaseQRCodeView baseQRCodeView) {
            ButterKnife.bind(baseQRCodeView, AbstractC52497a.this.getView());
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_qrcode.base.mvp.BaseQRCodeView.AbstractC52500a
        /* renamed from: a */
        public void mo179506a(String str) {
            C26311p.m95268a(AbstractC52497a.this.getContext(), str);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo179494a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_share_profile_qrcode, viewGroup, false);
    }
}
