package com.ss.android.lark.profile.func.share_profile.share_url;

import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52542b;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.C52548c;
import com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView;

/* renamed from: com.ss.android.lark.profile.func.share_profile.share_url.a */
public class C52533a extends BaseFragment {

    /* renamed from: a */
    private C52548c f130003a;

    /* renamed from: b */
    private ShareProfileUrlView.AbstractC52536b f130004b = new ShareProfileUrlView.AbstractC52536b() {
        /* class com.ss.android.lark.profile.func.share_profile.share_url.C52533a.C525341 */

        @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView.AbstractC52536b
        /* renamed from: a */
        public void mo179537a(ShareProfileUrlView shareProfileUrlView) {
            ButterKnife.bind(shareProfileUrlView, C52533a.this.getView());
        }

        @Override // com.ss.android.lark.profile.func.share_profile.share_url.mvp.ShareProfileUrlView.AbstractC52536b
        /* renamed from: a */
        public void mo179538a(String str) {
            FragmentActivity activity = C52533a.this.getActivity();
            if (activity == null) {
                Log.m165382e("Copy failed: the context is null");
                return;
            }
            ClipboardManager clipboardManager = (ClipboardManager) activity.getSystemService("clipboard");
            if (clipboardManager != null) {
                clipboardManager.setText(str);
                LKUIToast.show(activity, (int) R.string.Lark_Legacy_CopySuccess);
                return;
            }
            Log.m165382e("Copy failed: the ClipboardManager is null");
        }
    };

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C52548c cVar = this.f130003a;
        if (cVar != null) {
            cVar.destroy();
        }
        this.f130004b = null;
    }

    /* renamed from: a */
    private void m203405a() {
        C52548c cVar = new C52548c(new C52542b(), new ShareProfileUrlView(this.f130004b));
        this.f130003a = cVar;
        cVar.create();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m203405a();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_share_profile_url, viewGroup, false);
    }
}
