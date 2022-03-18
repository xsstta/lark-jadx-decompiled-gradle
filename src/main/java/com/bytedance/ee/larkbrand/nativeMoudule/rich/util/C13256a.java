package com.bytedance.ee.larkbrand.nativeMoudule.rich.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.larksuite.suite.R;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.p3255a.C65678c;
import com.tt.refer.impl.business.file.TTFile;
import com.tt.refer.impl.business.file.TTFileContext;
import com.tt.refer.impl.business.file.TTFileException;
import com.tt.refer.impl.business.file.TTFileHelper;
import com.tt.refer.impl.business.file.UriUtil;
import com.tt.refer.p3400a.p3407e.AbstractC67722a;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.a */
public class C13256a extends RelativeLayout {

    /* renamed from: a */
    public AbstractC13258a f35114a;

    /* renamed from: b */
    private ImageView f35115b;

    /* renamed from: c */
    private ImageView f35116c;

    /* renamed from: d */
    private IAppContext f35117d;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.util.a$a */
    public interface AbstractC13258a {
        /* renamed from: j */
        void mo49448j();
    }

    /* renamed from: a */
    public boolean mo49473a() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m54019b() {
        this.f35115b = new ImageView(getContext());
        addView(this.f35115b, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* renamed from: c */
    private void m54021c() {
        if (this.f35116c == null) {
            this.f35116c = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13264d.m54034a(getContext(), 12.0f), C13264d.m54034a(getContext(), 12.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            addView(this.f35116c, layoutParams);
            setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13256a.View$OnClickListenerC132571 */

                public void onClick(View view) {
                    if (C13256a.this.f35114a != null) {
                        C13256a.this.f35114a.mo49448j();
                    }
                }
            });
        }
        this.f35116c.setImageResource(R.drawable.lark_brand_thumnail_delete);
    }

    public void setListener(AbstractC13258a aVar) {
        this.f35114a = aVar;
    }

    public void setImageBitmap(Bitmap bitmap) {
        setVisibility(0);
        ImageView imageView = this.f35115b;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public void mo49472a(String str) {
        if (TTFileHelper.m264259a("showRichText", this.f35117d)) {
            m54020b(str);
        } else if (!TextUtils.isEmpty(str)) {
            setVisibility(0);
            C65678c cVar = new C65678c(Uri.parse(C67404a.m262266a(this.f35117d).mo234082c(str)));
            cVar.mo229920a(C13264d.f35127a, C13264d.f35127a).mo229918a().mo229922a(this.f35115b);
            HostDependManager.getInst().loadImage(getContext(), cVar);
        }
    }

    /* renamed from: b */
    private void m54020b(String str) {
        if (!TextUtils.isEmpty(str)) {
            TTFile gVar = new TTFile(str);
            if (!gVar.mo235649c()) {
                AppBrandLogger.m52830i("AttachLayout", "invalid ttfile when update attach image, url:" + str);
                return;
            }
            setVisibility(0);
            try {
                C65678c cVar = new C65678c(UriUtil.m264452a(((AbstractC67722a) this.f35117d.findServiceByInterface(AbstractC67722a.class)).mo235635i(gVar, new TTFileContext(null, "showRichText"))));
                cVar.mo229920a(C13264d.f35127a, C13264d.f35127a).mo229918a().mo229922a(this.f35115b);
                HostDependManager.getInst().loadImage(getContext(), cVar);
            } catch (TTFileException e) {
                AppBrandLogger.m52830i("AttachLayout", "get system file exception, url:" + str, e);
            }
        }
    }

    public C13256a(Context context, IAppContext iAppContext) {
        super(context);
        this.f35117d = iAppContext;
        m54019b();
        m54021c();
        setVisibility(8);
    }
}
