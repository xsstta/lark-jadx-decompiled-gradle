package com.bytedance.ee.bear.wikiv2.home.banner;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.AbstractC2536f;
import com.bumptech.glide.request.p095a.AbstractC2522j;
import com.bytedance.ee.bear.contract.C5084ad;
import com.bytedance.ee.bear.contract.ConnectionService;
import com.bytedance.ee.bear.contract.route.parcelable.WikiDocument;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.list.homepage.banner.BannerAdapter;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p703f.C13664a;
import com.bytedance.ee.util.p718t.C13749l;
import com.chad.library.adapter.base.C20923c;
import com.larksuite.suite.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ee.bear.wikiv2.home.banner.f */
public class C12275f extends BannerAdapter {

    /* renamed from: a */
    private final ConnectionService f32968a = C5084ad.m20847d();

    /* renamed from: b */
    private C12270a f32969b;

    /* renamed from: c */
    private boolean f32970c;

    /* renamed from: d */
    private Set<String> f32971d = new HashSet();

    /* renamed from: a */
    public void mo46843a(C12270a aVar) {
        this.f32969b = aVar;
    }

    /* renamed from: a */
    public void mo46844a(boolean z) {
        this.f32970c = z;
    }

    /* renamed from: b */
    public void mo46845b(List<String> list) {
        this.f32971d.clear();
        this.f32971d.addAll(list);
    }

    /* renamed from: a */
    private String m51091a(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("#")) {
            return str;
        }
        return "#" + str;
    }

    /* renamed from: a */
    private void m51092a(C20923c cVar) {
        ((CardView) cVar.itemView.findViewById(R.id.wiki_banner_card_view)).setCardElevation((float) C13749l.m55738a(10));
    }

    public C12275f(C10917c cVar, int i) {
        super(i, cVar);
    }

    /* renamed from: d */
    private void m51096d(C20923c cVar, WikiDocument wikiDocument) {
        ((TextView) cVar.itemView.findViewById(R.id.tv_banner_title)).setText(wikiDocument.mo32469n());
    }

    /* renamed from: e */
    private void m51097e(C20923c cVar, WikiDocument wikiDocument) {
        ImageView imageView = (ImageView) cVar.itemView.findViewById(R.id.iv_banner_star);
        if (wikiDocument.mo32456j()) {
            imageView.setImageResource(R.drawable.icon_wiki_tool_collection_nor_v2);
        } else {
            imageView.setImageResource(R.drawable.icon_wiki_tool_notcollection_nor);
        }
    }

    /* renamed from: g */
    private void m51099g(C20923c cVar, WikiDocument wikiDocument) {
        int i;
        if (wikiDocument.mo21020h()) {
            i = 0;
        } else {
            i = 8;
        }
        cVar.itemView.findViewById(R.id.scope_content).setVisibility(i);
    }

    /* renamed from: b */
    private void m51094b(C20923c cVar, WikiDocument wikiDocument) {
        int i;
        WikiDocument.SpaceCover d = wikiDocument.mo21014d();
        TextView textView = (TextView) cVar.itemView.findViewById(R.id.tv_banner_title);
        if (d != null) {
            Resources resources = cVar.itemView.getResources();
            if (d.mo21034d()) {
                i = resources.getColor(R.color.static_white);
            } else {
                i = resources.getColor(R.color.static_black);
            }
            textView.setTextColor(i);
        }
    }

    /* renamed from: f */
    private void m51098f(C20923c cVar, WikiDocument wikiDocument) {
        if (this.f32968a.mo20038b().mo20041b() || this.f32971d.contains(wikiDocument.mo32399O())) {
            cVar.itemView.setEnabled(true);
            cVar.mo70732a(R.id.wiki_banner_content, 1.0f);
            return;
        }
        cVar.itemView.setEnabled(false);
        cVar.mo70732a(R.id.wiki_banner_content, 0.3f);
    }

    /* renamed from: c */
    private void m51095c(C20923c cVar, WikiDocument wikiDocument) {
        WikiDocument.SpaceCover d = wikiDocument.mo21014d();
        ImageView imageView = (ImageView) cVar.itemView.findViewById(R.id.wiki_banner_background_image);
        if (d != null) {
            int a = m51090a(cVar, d.mo21034d(), d.mo21036e());
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(a);
            if (TextUtils.isEmpty(d.mo21026a())) {
                C13479a.m54764b("WikiSpaceBannerAdapter", "bindImage spaceCover.thumbnail is empty");
                imageView.setImageDrawable(gradientDrawable);
                return;
            }
            ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(cVar.itemView.getContext()).mo10414a(new C13664a(d.mo21026a())).mo11125a((Drawable) gradientDrawable)).mo11140b((Drawable) gradientDrawable)).mo11129a(AbstractC2354j.f7811a)).mo10392a((AbstractC2536f) new AbstractC2536f<Drawable>() {
                /* class com.bytedance.ee.bear.wikiv2.home.banner.C12275f.C122761 */

                /* renamed from: a */
                public boolean mo11205a(Drawable drawable, Object obj, AbstractC2522j<Drawable> jVar, DataSource dataSource, boolean z) {
                    return false;
                }

                @Override // com.bumptech.glide.request.AbstractC2536f
                /* renamed from: a */
                public boolean mo11204a(GlideException glideException, Object obj, AbstractC2522j<Drawable> jVar, boolean z) {
                    C13479a.m54758a("WikiSpaceBannerAdapter", "bindImage glide onException");
                    C13479a.m54761a("WikiSpaceBannerAdapter", glideException);
                    return false;
                }
            }).mo10399a(imageView);
        }
    }

    /* renamed from: a */
    private void m51093a(C20923c cVar, WikiDocument wikiDocument) {
        if (this.f32969b != null) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) cVar.itemView.findViewById(R.id.wiki_banner_card_view).getLayoutParams();
            int[] iArr = cVar.getAdapterPosition() == 0 ? new int[]{(int) this.f32969b.mo46833c(), C13749l.m55738a(19), (int) this.f32969b.mo46834d(), C13749l.m55738a(16)} : new int[]{0, C13749l.m55738a(19), (int) this.f32969b.mo46834d(), C13749l.m55738a(16)};
            layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
            layoutParams.height = (int) this.f32969b.mo46832b();
            layoutParams.width = (int) this.f32969b.mo46831a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.list.homepage.banner.BannerAdapter
    /* renamed from: a */
    public void mo16806a(C20923c cVar, Document document) {
        WikiDocument wikiDocument = (WikiDocument) document;
        m51093a(cVar, wikiDocument);
        if (this.f32970c) {
            cVar.itemView.setEnabled(false);
            return;
        }
        cVar.itemView.setEnabled(true);
        m51092a(cVar);
        m51096d(cVar, wikiDocument);
        m51097e(cVar, wikiDocument);
        m51094b(cVar, wikiDocument);
        m51095c(cVar, wikiDocument);
        m51098f(cVar, wikiDocument);
        m51099g(cVar, wikiDocument);
    }

    /* renamed from: a */
    private int m51090a(C20923c cVar, boolean z, String str) {
        int i;
        if (z) {
            i = cVar.itemView.getResources().getColor(R.color.space_kit_n950);
        } else {
            i = cVar.itemView.getResources().getColor(R.color.static_white);
        }
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        try {
            i = Color.parseColor(m51091a(str));
        } catch (Exception e) {
            C13479a.m54758a("WikiSpaceBannerAdapter", e.toString());
        }
        C13479a.m54764b("WikiSpaceBannerAdapter", "colorValue:  " + str + "   color:  " + i);
        return i;
    }
}
