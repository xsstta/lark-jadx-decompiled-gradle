package com.ss.android.vc.meeting.module.follow.universal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.larksuite.component.ui.loading.LKUIStatus;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.meeting.module.follow.universal.AbstractC61857a;
import com.ss.android.vc.meeting.module.follow.universal.UniversalWebView;

/* renamed from: com.ss.android.vc.meeting.module.follow.universal.c */
public class C61860c extends Fragment implements UniversalWebView.AbstractC61854a, AbstractC61857a {

    /* renamed from: a */
    public UniversalWebView f155300a;

    /* renamed from: b */
    public String f155301b;

    /* renamed from: c */
    private FrameLayout f155302c;

    /* renamed from: d */
    private AbstractC61857a.AbstractC61858a f155303d;

    /* renamed from: e */
    private FrameLayout f155304e;

    /* renamed from: f */
    private LKUIStatus f155305f;

    /* renamed from: g */
    private View f155306g;

    /* renamed from: h */
    private boolean f155307h;

    /* renamed from: i */
    private C61862a f155308i;

    /* renamed from: a */
    public void mo214226a() {
    }

    /* renamed from: b */
    public void mo214228b() {
    }

    /* renamed from: c */
    public void mo214229c() {
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.UniversalWebView.AbstractC61854a
    /* renamed from: c */
    public void mo214213c(String str) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        UniversalWebView universalWebView = this.f155300a;
        if (universalWebView != null) {
            universalWebView.onResume();
            this.f155300a.resumeTimers();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        LKUIStatus lKUIStatus = this.f155305f;
        if (lKUIStatus != null) {
            lKUIStatus.mo89848e();
            this.f155305f = null;
        }
        super.onDestroyView();
        UniversalWebView universalWebView = this.f155300a;
        if (universalWebView != null) {
            universalWebView.destroy();
            this.f155300a = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        UniversalWebView universalWebView = this.f155300a;
        if (universalWebView != null) {
            universalWebView.onPause();
        }
        super.onPause();
        UniversalWebView universalWebView2 = this.f155300a;
        if (universalWebView2 != null) {
            universalWebView2.pauseTimers();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.UniversalWebView.AbstractC61854a
    /* renamed from: d */
    public void mo214214d() {
        C60700b.m235851b("FollowLog_UniversalFragment", "onLoadStart", "onLoadStart");
        this.f155308i = null;
        View view = this.f155306g;
        if (view != null) {
            view.setVisibility(8);
        }
        FrameLayout frameLayout = this.f155304e;
        if (frameLayout != null && this.f155305f != null) {
            frameLayout.setVisibility(0);
            this.f155305f.mo89837a();
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.UniversalWebView.AbstractC61854a
    /* renamed from: e */
    public void mo214215e() {
        C60700b.m235851b("FollowLog_UniversalFragment", "onLoadSuccess", "onLoadSuccess");
        if (this.f155308i != null) {
            this.f155307h = false;
            AbstractC61857a.AbstractC61858a aVar = this.f155303d;
            if (aVar != null) {
                aVar.mo214224a(false);
            }
            View view = this.f155306g;
            if (view != null) {
                view.setVisibility(0);
            }
        } else {
            this.f155307h = true;
            AbstractC61857a.AbstractC61858a aVar2 = this.f155303d;
            if (aVar2 != null) {
                aVar2.mo214224a(true);
            }
        }
        FrameLayout frameLayout = this.f155304e;
        if (frameLayout != null && this.f155305f != null) {
            frameLayout.setVisibility(8);
            this.f155305f.mo89848e();
        }
    }

    /* renamed from: a */
    public void mo214227a(AbstractC61857a.AbstractC61858a aVar) {
        this.f155303d = aVar;
    }

    /* renamed from: a */
    public static C61860c m241651a(String str) {
        C61860c cVar = new C61860c();
        Bundle bundle = new Bundle();
        bundle.putString("param_url", str);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f155301b = getArguments().getString("param_url");
            UniversalWebView universalWebView = new UniversalWebView(getContext());
            this.f155300a = universalWebView;
            universalWebView.setLoadingCallback(this);
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.UniversalWebView.AbstractC61854a
    /* renamed from: b */
    public boolean mo214212b(String str) {
        if (str.contains("redirect_uri=") || str.contains("www.google.com/url?q=")) {
            C60700b.m235851b("FollowLog_UniversalFragment", "[onLoadUrl]", "don't check redirect url = " + str);
            return false;
        } else if (this.f155307h) {
            if (this.f155303d == null || !str.startsWith("http") || str.equals(this.f155301b)) {
                C60700b.m235851b("FollowLog_UniversalFragment", "[onLoadUrl2]", "url = " + str);
            } else {
                this.f155303d.mo214223a(str, null);
            }
            return true;
        } else if (!str.startsWith("https://accounts.google.com")) {
            return false;
        } else {
            C60700b.m235851b("FollowLog_UniversalFragment", "[onLoadUrl3]", "can't open google login = " + str);
            C60738ac.m236024a(R.drawable.icon_no_support_link_error, R.string.View_VM_UnableToOpenLink, 2000);
            return true;
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.follow.universal.c$a */
    private static class C61862a {

        /* renamed from: a */
        int f155310a;

        /* renamed from: b */
        String f155311b;

        C61862a(int i, String str) {
            this.f155310a = i;
            this.f155311b = str;
        }
    }

    @Override // com.ss.android.vc.meeting.module.follow.universal.UniversalWebView.AbstractC61854a
    /* renamed from: a */
    public void mo214211a(int i, String str) {
        C60700b.m235851b("FollowLog_UniversalFragment", "[onLoadFail]", i + ", " + str);
        this.f155308i = new C61862a(i, str);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.fragment_universal, viewGroup, false);
        this.f155302c = frameLayout;
        frameLayout.findViewById(R.id.universal_refresh_btn).setOnClickListener(new AbstractView$OnClickListenerC52989b() {
            /* class com.ss.android.vc.meeting.module.follow.universal.C61860c.C618611 */

            @Override // com.ss.android.lark.reaction.widget.p2559a.AbstractView$OnClickListenerC52989b
            /* renamed from: a */
            public void mo122732a(View view) {
                C60700b.m235851b("FollowLog_UniversalFragment", "[onClick]", "click refresh: " + C61860c.this.f155301b);
                if (C61860c.this.f155300a != null) {
                    C61860c.this.f155300a.reload();
                }
            }
        });
        FrameLayout frameLayout2 = (FrameLayout) this.f155302c.findViewById(R.id.universal_loading_layout);
        this.f155304e = frameLayout2;
        this.f155305f = new LKUIStatus.C25680a(frameLayout2).mo89859a();
        this.f155306g = this.f155302c.findViewById(R.id.universal_refresh_layout);
        this.f155302c.addView(this.f155300a, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f155300a.loadUrl(this.f155301b);
        return this.f155302c;
    }
}
