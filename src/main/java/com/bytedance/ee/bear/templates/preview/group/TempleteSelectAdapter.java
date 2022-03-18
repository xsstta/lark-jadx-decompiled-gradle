package com.bytedance.ee.bear.templates.preview.group;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.engine.AbstractC2354j;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.facade.glide.p383a.C7754c;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.templates.preview.group.SceneTemplateData;
import com.bytedance.ee.util.p703f.C13664a;
import com.larksuite.suite.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\tH\u0016J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/templates/preview/group/TempleteSelectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/templates/preview/group/TemplateSelectViewHolder;", "datas", "", "Lcom/bytedance/ee/bear/templates/preview/group/SceneTemplateData$Scene;", "(Ljava/util/List;)V", "hasReports", "", "", "getHasReports", "()Ljava/util/Set;", "setHasReports", "(Ljava/util/Set;)V", "selectIndex", "getSelectIndex", "()I", "setSelectIndex", "(I)V", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "getServiceContext", "()Lcom/bytedance/ee/bear/service/ServiceContext;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "templates-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.templates.preview.group.d */
public final class TempleteSelectAdapter extends RecyclerView.Adapter<TemplateSelectViewHolder> {

    /* renamed from: a */
    private int f31186a;

    /* renamed from: b */
    private Set<Integer> f31187b = new LinkedHashSet();

    /* renamed from: c */
    private final C10917c f31188c = new C10917c(new C10929e());

    /* renamed from: d */
    private final List<SceneTemplateData.Scene> f31189d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f31189d.size();
    }

    /* renamed from: a */
    public final void mo44497a(int i) {
        this.f31186a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.ee.bear.templates.preview.group.SceneTemplateData$Scene> */
    /* JADX WARN: Multi-variable type inference failed */
    public TempleteSelectAdapter(List<? extends SceneTemplateData.Scene> list) {
        Intrinsics.checkParameterIsNotNull(list, "datas");
        this.f31189d = list;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.templates.preview.group.d$a */
    public static final class View$OnClickListenerC11578a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TempleteSelectAdapter f31190a;

        /* renamed from: b */
        final /* synthetic */ int f31191b;

        /* renamed from: c */
        final /* synthetic */ SceneTemplateData.Scene f31192c;

        View$OnClickListenerC11578a(TempleteSelectAdapter dVar, int i, SceneTemplateData.Scene scene) {
            this.f31190a = dVar;
            this.f31191b = i;
            this.f31192c = scene;
        }

        public final void onClick(View view) {
            this.f31190a.mo44497a(this.f31191b);
            this.f31190a.notifyDataSetChanged();
            C6313i a = C6313i.m25327a();
            C8275a b = C8275a.m34052b(this.f31192c.obj_type);
            Intrinsics.checkExpressionValueIsNotNull(b, "DocumentType.getDocumentType(data.obj_type)");
            ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17292a(a.mo25382a(b.mo32553a(), this.f31192c.obj_token, "template_preview"));
        }
    }

    /* renamed from: a */
    public TemplateSelectViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.template_select_item, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new TemplateSelectViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(TemplateSelectViewHolder cVar, int i) {
        Intrinsics.checkParameterIsNotNull(cVar, "holder");
        SceneTemplateData.Scene scene = this.f31189d.get(i);
        TextView c = cVar.mo44495c();
        Intrinsics.checkExpressionValueIsNotNull(c, "holder.name");
        c.setText(scene.name);
        View a = cVar.mo44493a();
        View a2 = cVar.mo44493a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "holder.topBar");
        Context context = a2.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "holder.topBar.context");
        Resources resources = context.getResources();
        int i2 = scene.obj_type;
        C8275a aVar = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOC");
        int b = aVar.mo32555b();
        int i3 = R.color.primary_pri_300;
        if (i2 != b) {
            C8275a aVar2 = C8275a.f22372e;
            Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.SHEET");
            if (i2 == aVar2.mo32555b()) {
                i3 = R.color.function_success_300;
            } else {
                C8275a aVar3 = C8275a.f22374g;
                Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.MINDNOTE");
                if (i2 == aVar3.mo32555b()) {
                    i3 = R.color.ud_W200;
                } else if (i2 == 8) {
                    i3 = R.color.ud_T300;
                }
            }
        }
        a.setBackgroundColor(resources.getColor(i3));
        if (scene.display_type == 2) {
            C7754c cVar2 = new C7754c(scene.cover_download_url, scene.thumbnail_extra.thumbnail, scene.obj_type, scene.thumbnail_extra.type, scene.thumbnail_extra.decrypt_key, "", "template", false, "v4.1", cVar.mo44494b(), this.f31188c);
            ImageView b2 = cVar.mo44494b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "holder.img");
            Intrinsics.checkExpressionValueIsNotNull(((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(b2.getContext()).mo10430i().mo11129a(AbstractC2354j.f7812b)).mo11143c(R.drawable.template_load_fail)).mo10395a((Object) cVar2).mo10399a(cVar.mo44494b()), "Glide.with(holder.img.co…        .into(holder.img)");
        } else {
            Intrinsics.checkExpressionValueIsNotNull(ComponentCallbacks2C2115c.m9141a(cVar.itemView).mo10414a(new C13664a(scene.cover_download_url)).mo10399a(cVar.mo44494b()), "Glide.with(holder.itemVi…ad_url)).into(holder.img)");
        }
        cVar.itemView.setOnClickListener(new View$OnClickListenerC11578a(this, i, scene));
        if (i == this.f31186a) {
            View view = cVar.itemView;
            View view2 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
            view.setBackgroundColor(view2.getResources().getColor(R.color.primary_pri_500));
        } else {
            View view3 = cVar.itemView;
            View view4 = cVar.itemView;
            Intrinsics.checkExpressionValueIsNotNull(view4, "holder.itemView");
            view3.setBackgroundColor(view4.getResources().getColor(R.color.color_transparent));
        }
        if (!this.f31187b.contains(Integer.valueOf(i))) {
            TemplatePreviewReport.f31169b.mo44483a(scene.obj_token, scene.name);
            this.f31187b.add(Integer.valueOf(i));
        }
    }
}
