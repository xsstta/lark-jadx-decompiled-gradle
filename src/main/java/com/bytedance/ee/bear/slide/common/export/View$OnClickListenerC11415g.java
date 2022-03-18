package com.bytedance.ee.bear.slide.common.export;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.facade.common.widget.BearLottieView;
import com.bytedance.ee.bear.widgets.BaseTitleBar;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p710m.AbstractC13707b;
import com.bytedance.ee.util.p710m.C13708c;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.slide.common.export.g */
public class View$OnClickListenerC11415g extends C7667e implements View.OnClickListener {

    /* renamed from: a */
    private BaseTitleBar f30675a;

    /* renamed from: b */
    private LinearLayout f30676b;

    /* renamed from: c */
    private LinearLayout f30677c;

    /* renamed from: d */
    private LinearLayout f30678d;

    /* renamed from: e */
    private LinearLayout f30679e;

    /* renamed from: f */
    private BearLottieView f30680f;

    /* renamed from: g */
    private AbstractC11416a f30681g;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.slide.common.export.g$a */
    public interface AbstractC11416a {
        /* renamed from: a */
        void mo43613a(String str);

        /* renamed from: a */
        void mo43614a(boolean z);
    }

    @Override // com.bytedance.ee.bear.facade.common.AbstractC7666d, com.bytedance.ee.bear.facade.common.C7667e
    public boolean onBackPressed() {
        m47413a();
        return true;
    }

    /* renamed from: a */
    private void m47413a() {
        if (mo30190n()) {
            this.f30681g.mo43614a(this.f30680f.isAnimating());
        }
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (this.f30680f.isAnimating()) {
            this.f30680f.cancelAnimation();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m47416b(View view) {
        m47413a();
    }

    /* renamed from: a */
    public void mo43680a(AbstractC11416a aVar) {
        this.f30681g = aVar;
    }

    @Override // com.bytedance.ee.bear.facade.common.C7667e, com.bytedance.ee.bear.facade.common.C7718l, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onClick(View view) {
        C13708c.m55598a(getActivity(), "android.permission.WRITE_EXTERNAL_STORAGE", getString(R.string.Doc_Facade_PermissionStorage), new AbstractC13707b(view) {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$g$PoCPA0SgHmmpWi9CboSFdW10cA */
            public final /* synthetic */ View f$1;

            {
                this.f$1 = r2;
            }

            @Override // com.bytedance.ee.util.p710m.AbstractC13707b
            public final void onCheckResult(boolean z) {
                View$OnClickListenerC11415g.m269981lambda$PoCPA0SgHmmpWi9CboSFdW10cA(View$OnClickListenerC11415g.this, this.f$1, z);
            }
        });
    }

    /* renamed from: a */
    private void m47414a(View view) {
        BaseTitleBar baseTitleBar = (BaseTitleBar) view.findViewById(R.id.slide_export_title);
        this.f30675a = baseTitleBar;
        baseTitleBar.setLeftClickListener(new View.OnClickListener() {
            /* class com.bytedance.ee.bear.slide.common.export.$$Lambda$g$awcIO4hF_Rqt5ai1ZwDeMJiHdDU */

            public final void onClick(View view) {
                View$OnClickListenerC11415g.lambda$awcIO4hF_Rqt5ai1ZwDeMJiHdDU(View$OnClickListenerC11415g.this, view);
            }
        });
        this.f30675a.setTitle(getString(R.string.Slide_Slide_Export));
        this.f30675a.setMainTitleSize(17.0f);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.slide_export_pdf);
        this.f30676b = linearLayout;
        linearLayout.setOnClickListener(this);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.slide_export_long_picture);
        this.f30677c = linearLayout2;
        linearLayout2.setOnClickListener(this);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.slide_export_multi_picture);
        this.f30678d = linearLayout3;
        linearLayout3.setOnClickListener(this);
        this.f30679e = (LinearLayout) view.findViewById(R.id.slide_export_loading_container);
        this.f30680f = (BearLottieView) view.findViewById(R.id.slide_export_loading_view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m47414a(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m47415a(View view, boolean z) {
        C13479a.m54772d("SlideExportSelectFragment", "SlideExportSelectFragment onClick()... isGrant = " + z);
        if (!z) {
            return;
        }
        if (view.getId() == R.id.slide_export_pdf) {
            this.f30681g.mo43613a("pdf");
            m47413a();
        } else if (view.getId() == R.id.slide_export_long_picture) {
            this.f30681g.mo43613a("longPicture");
            m47413a();
        } else if (view.getId() == R.id.slide_export_multi_picture) {
            this.f30679e.setVisibility(0);
            this.f30680f.playAnimation();
            this.f30675a.setTitle(R.string.Slide_Slide_SelectSlidePage);
            this.f30675a.setLeftImageResource(R.drawable.ud_icon_close_small_outlined);
            this.f30681g.mo43613a("multiPicture");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.slide_export_select_fragment_layout, viewGroup, false);
    }
}
