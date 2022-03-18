package com.tt.miniapp.feedback.entrance;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.larksuite.suite.R;
import com.tt.miniapp.C66205j;
import com.tt.miniapp.feedback.entrance.C66119b;
import com.tt.miniapp.feedback.entrance.vo.FAQItemVO;
import com.tt.miniapp.feedback.entrance.vo.FeedbackParam;
import com.tt.miniapphost.entity.AppInfoEntity;
import com.tt.miniapphost.util.C67590h;
import java.util.List;

/* renamed from: com.tt.miniapp.feedback.entrance.a */
public abstract class AbstractC66114a extends Fragment {

    /* renamed from: a */
    protected AbstractC66117a f166867a;

    /* renamed from: b */
    protected Activity f166868b;

    /* renamed from: c */
    protected FeedbackParam f166869c;

    /* renamed from: d */
    protected AppInfoEntity f166870d;

    /* renamed from: e */
    protected View f166871e;

    /* renamed from: f */
    protected View f166872f;

    /* renamed from: com.tt.miniapp.feedback.entrance.a$a */
    public interface AbstractC66117a {
        /* renamed from: a */
        FeedbackParam mo231278a();

        /* renamed from: a */
        void mo231280a(Fragment fragment, Fragment fragment2);

        /* renamed from: a */
        void mo231281a(AbstractC66118b bVar);

        /* renamed from: a */
        void mo231282a(C66119b.AbstractC66132a aVar);

        /* renamed from: b */
        AppInfoEntity mo231285b();

        /* renamed from: c */
        FragmentManager mo231286c();
    }

    /* renamed from: com.tt.miniapp.feedback.entrance.a$b */
    public interface AbstractC66118b {
        /* renamed from: a */
        void mo231291a(List<FAQItemVO> list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo231298c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo231299d();

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f166867a = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo231297b() {
        this.f166869c = this.f166867a.mo231278a();
        this.f166870d = this.f166867a.mo231285b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo231296a() {
        Window window = this.f166868b.getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        if (Build.VERSION.SDK_INT >= 21) {
            window.setStatusBarColor(getResources().getColor(R.color.microapp_m_status_bar_color));
        }
        this.f166871e = this.f166872f.findViewById(R.id.microapp_m_titleBar_content);
        C66205j jVar = new C66205j(this.f166868b, new C66205j.C66206a().mo231551a(true));
        jVar.mo231547a(true);
        jVar.mo231549b(true);
        C67590h.m263074a(this.f166868b, this.f166871e);
        this.f166872f.findViewById(R.id.microapp_m_page_back).setOnClickListener(new View.OnClickListener() {
            /* class com.tt.miniapp.feedback.entrance.AbstractC66114a.View$OnClickListenerC661151 */

            public void onClick(View view) {
                AbstractC66114a.this.f166868b.onBackPressed();
            }
        });
        Activity activity = this.f166868b;
        if ((activity instanceof FAQActivity) && ((FAQActivity) activity).getSupportFragmentManager().getFragments().size() > 1) {
            ImageButton imageButton = (ImageButton) this.f166872f.findViewById(R.id.microapp_m_page_close);
            C67590h.m263079a(imageButton, 0);
            imageButton.setOnClickListener(new View.OnClickListener() {
                /* class com.tt.miniapp.feedback.entrance.AbstractC66114a.View$OnClickListenerC661162 */

                public void onClick(View view) {
                    AbstractC66114a.this.f166868b.finish();
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof AbstractC66117a) {
            this.f166867a = (AbstractC66117a) context;
        }
        if (context instanceof Activity) {
            this.f166868b = (Activity) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.f166872f == null) {
            this.f166872f = layoutInflater.inflate(mo231299d(), viewGroup, false);
        }
        mo231297b();
        mo231296a();
        mo231298c();
        return this.f166872f;
    }
}
