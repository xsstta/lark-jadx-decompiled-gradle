package com.bytedance.ee.bear.templates.preview.announce;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C1177w;
import com.bytedance.ee.util.p718t.C13747j;
import com.larksuite.suite.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\fJ\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\u000e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/AnnouncePreviewTemplateView;", "", "()V", "nextFl", "Landroid/widget/FrameLayout;", "nextImg", "Landroid/widget/ImageView;", "panelTitle", "Landroid/widget/TextView;", "prevFl", "prevImg", "templateViewModel", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplateViewModel;", "useCurrTemp", "init", "", "context", "Landroid/content/Context;", "parent", "Landroid/view/ViewGroup;", "viewModel", "initView", "rootView", "Landroid/view/View;", "initViewEvent", "setBtnStyle", "pos", "", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.announce.a */
public final class AnnouncePreviewTemplateView {

    /* renamed from: a */
    public AnnounceTemplateViewModel f31116a;

    /* renamed from: b */
    private FrameLayout f31117b;

    /* renamed from: c */
    private FrameLayout f31118c;

    /* renamed from: d */
    private ImageView f31119d;

    /* renamed from: e */
    private ImageView f31120e;

    /* renamed from: f */
    private TextView f31121f;

    /* renamed from: g */
    private TextView f31122g;

    /* renamed from: a */
    private final void m48075a() {
        TextView textView = this.f31122g;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC11548a(this));
        }
        FrameLayout frameLayout = this.f31117b;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View$OnClickListenerC11549b(this));
        }
        FrameLayout frameLayout2 = this.f31118c;
        if (frameLayout2 != null) {
            frameLayout2.setOnClickListener(new View$OnClickListenerC11550c(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.a$a */
    public static final class View$OnClickListenerC11548a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnnouncePreviewTemplateView f31123a;

        View$OnClickListenerC11548a(AnnouncePreviewTemplateView aVar) {
            this.f31123a = aVar;
        }

        public final void onClick(View view) {
            AnnounceTemplateViewModel cVar = this.f31123a.f31116a;
            if (cVar != null) {
                cVar.loadTemplateDataFromNet();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.a$b */
    public static final class View$OnClickListenerC11549b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnnouncePreviewTemplateView f31124a;

        View$OnClickListenerC11549b(AnnouncePreviewTemplateView aVar) {
            this.f31124a = aVar;
        }

        public final void onClick(View view) {
            Integer num;
            C1177w<Integer> currTemplatePos;
            if (this.f31124a.f31116a != null) {
                AnnounceTemplateViewModel cVar = this.f31124a.f31116a;
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                if (cVar.getTemplates().mo5927b() != null) {
                    AnnounceTemplateViewModel cVar2 = this.f31124a.f31116a;
                    if (cVar2 == null || (currTemplatePos = cVar2.getCurrTemplatePos()) == null) {
                        num = null;
                    } else {
                        num = currTemplatePos.mo5927b();
                    }
                    if (num != null) {
                        Integer valueOf = Integer.valueOf(num.intValue() - 1);
                        AnnounceTemplateViewModel cVar3 = this.f31124a.f31116a;
                        if (cVar3 != null) {
                            cVar3.loadAnnounceUrl(valueOf.intValue(), false);
                        }
                        this.f31124a.mo44371a(valueOf.intValue());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.a$c */
    public static final class View$OnClickListenerC11550c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AnnouncePreviewTemplateView f31125a;

        View$OnClickListenerC11550c(AnnouncePreviewTemplateView aVar) {
            this.f31125a = aVar;
        }

        public final void onClick(View view) {
            Integer num;
            C1177w<Integer> currTemplatePos;
            if (this.f31125a.f31116a != null) {
                AnnounceTemplateViewModel cVar = this.f31125a.f31116a;
                if (cVar == null) {
                    Intrinsics.throwNpe();
                }
                if (cVar.getTemplates().mo5927b() != null) {
                    AnnounceTemplateViewModel cVar2 = this.f31125a.f31116a;
                    if (cVar2 == null || (currTemplatePos = cVar2.getCurrTemplatePos()) == null) {
                        num = null;
                    } else {
                        num = currTemplatePos.mo5927b();
                    }
                    if (num != null) {
                        Integer valueOf = Integer.valueOf(num.intValue() + 1);
                        AnnounceTemplateViewModel cVar3 = this.f31125a.f31116a;
                        if (cVar3 != null) {
                            cVar3.loadAnnounceUrl(valueOf.intValue(), false);
                        }
                        this.f31125a.mo44371a(valueOf.intValue());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m48076a(View view) {
        Integer num;
        C1177w<Integer> currTemplatePos;
        this.f31119d = (ImageView) view.findViewById(R.id.title_bar_prev);
        this.f31117b = (FrameLayout) view.findViewById(R.id.fl_prev_temp);
        this.f31118c = (FrameLayout) view.findViewById(R.id.fl_next_temp);
        this.f31120e = (ImageView) view.findViewById(R.id.title_bar_next);
        this.f31121f = (TextView) view.findViewById(R.id.panel_title);
        this.f31122g = (TextView) view.findViewById(R.id.tv_use_curr_temp);
        AnnounceTemplateViewModel cVar = this.f31116a;
        if (cVar == null || (currTemplatePos = cVar.getCurrTemplatePos()) == null || (num = currTemplatePos.mo5927b()) == null) {
            num = 0;
        }
        mo44371a(num.intValue());
        m48075a();
    }

    /* renamed from: a */
    public final void mo44371a(int i) {
        C1177w<ArrayList<AnnounceTemplate>> templates;
        ArrayList<AnnounceTemplate> b;
        TextView textView;
        String str;
        C1177w<ArrayList<AnnounceTemplate>> templates2;
        ArrayList<AnnounceTemplate> b2;
        AnnounceTemplate announceTemplate;
        AnnounceTemplateViewModel cVar = this.f31116a;
        if (cVar != null && (templates = cVar.getTemplates()) != null && (b = templates.mo5927b()) != null) {
            int size = b.size();
            if (i >= 0 && size > i && (textView = this.f31121f) != null) {
                AnnounceTemplateViewModel cVar2 = this.f31116a;
                if (cVar2 == null || (templates2 = cVar2.getTemplates()) == null || (b2 = templates2.mo5927b()) == null || (announceTemplate = b2.get(i)) == null) {
                    str = null;
                } else {
                    str = announceTemplate.getName();
                }
                textView.setText(str);
            }
            if (i >= size - 1) {
                C13747j.m55728a(this.f31120e, (int) R.color.icon_disable);
            } else {
                C13747j.m55728a(this.f31120e, (int) R.color.icon_n1);
            }
            if (i <= 0) {
                C13747j.m55728a(this.f31119d, (int) R.color.icon_disable);
            } else {
                C13747j.m55728a(this.f31119d, (int) R.color.icon_n1);
            }
        }
    }

    /* renamed from: a */
    public final void mo44372a(Context context, ViewGroup viewGroup, AnnounceTemplateViewModel cVar) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        this.f31116a = cVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.announce_template_preview_panel_fragment_new, viewGroup, true);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        m48076a(inflate);
    }
}
