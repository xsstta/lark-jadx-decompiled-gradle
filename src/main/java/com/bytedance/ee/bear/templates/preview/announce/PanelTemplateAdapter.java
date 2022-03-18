package com.bytedance.ee.bear.templates.preview.announce;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.facade.glide.p383a.C7748b;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p718t.C13743h;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0003 !\"B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016J\u001c\u0010\u0013\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\nH\u0016J\u000e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u001e\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter$CardViewHolder;", "Lcom/bytedance/ee/util/ui/RecyclerItemsDiff$ItemComparable;", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Lcom/bytedance/ee/bear/service/ServiceContext;)V", "hasReports", "", "", "templateClickListener", "Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter$TemplateClickListener;", "templateList", "", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickListener", "updateTemplate", "templates", "CardViewHolder", "Companion", "TemplateClickListener", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.announce.d */
public final class PanelTemplateAdapter extends RecyclerView.Adapter<CardViewHolder> implements C13743h.AbstractC13745b<AnnounceTemplate> {

    /* renamed from: c */
    public static final int f31138c = C13655e.m55411a((int) SmActions.ACTION_ONTHECALL_EXIT);

    /* renamed from: d */
    public static final int f31139d = C13655e.m55411a(76);

    /* renamed from: e */
    public static final Companion f31140e = new Companion(null);

    /* renamed from: a */
    public List<AnnounceTemplate> f31141a = new ArrayList();

    /* renamed from: b */
    public TemplateClickListener f31142b;

    /* renamed from: f */
    private Set<Integer> f31143f = new LinkedHashSet();

    /* renamed from: g */
    private final C10917c f31144g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter$TemplateClickListener;", "", "onTemplateClicked", "", "position", "", "template", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.d$c */
    public interface TemplateClickListener {
        /* renamed from: a */
        void mo44427a(int i, AnnounceTemplate announceTemplate);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "(Landroid/view/View;Lcom/bytedance/ee/bear/service/ServiceContext;)V", "templateName", "Landroid/widget/TextView;", "getTemplateName", "()Landroid/widget/TextView;", "thumbnailImg", "Landroid/widget/ImageView;", "getThumbnailImg", "()Landroid/widget/ImageView;", "displayThumbnail", "", "template", "Lcom/bytedance/ee/bear/templates/preview/announce/AnnounceTemplate;", "loadThumbnail", "objToken", "", ShareHitPoint.f121869d, "", "thumbnailExtra", "Lcom/bytedance/ee/bear/templates/preview/announce/ThumbnailExtra;", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.d$a */
    public static final class CardViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final ImageView f31145a;

        /* renamed from: b */
        private final TextView f31146b;

        /* renamed from: c */
        private final C10917c f31147c;

        /* renamed from: a */
        public final TextView mo44423a() {
            return this.f31146b;
        }

        /* renamed from: a */
        public final void mo44424a(AnnounceTemplate announceTemplate) {
            Intrinsics.checkParameterIsNotNull(announceTemplate, "template");
            m48104a(announceTemplate.getObjToken(), announceTemplate.getObjType(), announceTemplate.getThumbnailExtra(), announceTemplate);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CardViewHolder(View view, C10917c cVar) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
            this.f31147c = cVar;
            View findViewById = view.findViewById(R.id.thumbnail_img);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.thumbnail_img)");
            this.f31145a = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.template_name);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.template_name)");
            this.f31146b = (TextView) findViewById2;
        }

        /* renamed from: a */
        private final void m48104a(String str, int i, ThumbnailExtra thumbnailExtra, AnnounceTemplate announceTemplate) {
            C7754c cVar = new C7754c("", thumbnailExtra.getThumbnail(), i, thumbnailExtra.getType(), thumbnailExtra.getDecrypt_key(), "", "template", true, "v4.1", this.f31145a, this.f31147c);
            this.f31145a.setTag(R.id.thumbnail_tag, announceTemplate.getObjToken());
            ((C2124f) ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.f31145a.getContext()).mo10430i().mo11129a(AbstractC2354j.f7812b)).mo11130a((AbstractC2393i<Bitmap>) new C7748b(PanelTemplateAdapter.f31140e.mo44426b(), PanelTemplateAdapter.f31140e.mo44425a()))).mo11143c(R.drawable.template_load_fail)).mo10395a((Object) cVar).mo10399a(this.f31145a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/announce/PanelTemplateAdapter$Companion;", "", "()V", "TAG", "", "ivHeightForRecommend", "", "getIvHeightForRecommend", "()I", "ivWidthForRecommend", "getIvWidthForRecommend", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.d$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final int mo44425a() {
            return PanelTemplateAdapter.f31138c;
        }

        /* renamed from: b */
        public final int mo44426b() {
            return PanelTemplateAdapter.f31139d;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f31141a.size();
    }

    /* renamed from: a */
    public final void mo44419a(TemplateClickListener cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "templateClickListener");
        this.f31142b = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.announce.d$d */
    public static final class View$OnClickListenerC11563d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PanelTemplateAdapter f31148a;

        /* renamed from: b */
        final /* synthetic */ int f31149b;

        View$OnClickListenerC11563d(PanelTemplateAdapter dVar, int i) {
            this.f31148a = dVar;
            this.f31149b = i;
        }

        public final void onClick(View view) {
            TemplateClickListener cVar = this.f31148a.f31142b;
            if (cVar != null) {
                cVar.mo44427a(this.f31149b, this.f31148a.f31141a.get(this.f31149b));
            }
        }
    }

    public PanelTemplateAdapter(C10917c cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "serviceContext");
        this.f31144g = cVar;
    }

    /* renamed from: a */
    public final void mo44420a(List<AnnounceTemplate> list) {
        Intrinsics.checkParameterIsNotNull(list, "templates");
        C1374g.C1377b a = C1374g.m6298a(new C13743h(this.f31141a, list, this), true);
        Intrinsics.checkExpressionValueIsNotNull(a, "DiffUtil.calculateDiff(diff, true)");
        this.f31141a = list;
        a.mo7412a(this);
    }

    /* renamed from: b */
    public boolean mo34853b(AnnounceTemplate announceTemplate, AnnounceTemplate announceTemplate2) {
        return Objects.equals(announceTemplate, announceTemplate2);
    }

    /* renamed from: a */
    public boolean mo34851a(AnnounceTemplate announceTemplate, AnnounceTemplate announceTemplate2) {
        return Objects.equals(announceTemplate, announceTemplate2);
    }

    /* renamed from: a */
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.announce_template_card_item_new, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "root");
        return new CardViewHolder(inflate, this.f31144g);
    }

    /* renamed from: a */
    public void onBindViewHolder(CardViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        aVar.mo44423a().setText(this.f31141a.get(i).getName());
        aVar.mo44424a(this.f31141a.get(i));
        aVar.itemView.setOnClickListener(new View$OnClickListenerC11563d(this, i));
        if (!this.f31143f.contains(Integer.valueOf(i))) {
            AnnounceTemplateAnalytic.f31127b.mo44378a(this.f31141a.get(i).getName(), this.f31141a.get(i).getObjToken());
            this.f31143f.add(Integer.valueOf(i));
        }
    }
}
