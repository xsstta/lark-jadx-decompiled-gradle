package com.ss.android.lark.ug.banner.ui.template;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0016\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0016\u0010\u0013\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\bR\u0018\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0006\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemViewHolder;", "()V", "dataSource", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateListDataSource;", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateItem;", "itemClickListener", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$OnItemClickListener;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setDataSource", "setOnItemClickListener", "listener", "OnItemClickListener", "TemplateItem", "TemplateListDataSource", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.banner.ui.template.d */
public final class TemplateItemAdapter extends RecyclerView.Adapter<TemplateItemViewHolder> {

    /* renamed from: a */
    public OnItemClickListener f141319a;

    /* renamed from: b */
    private TemplateListDataSource<? extends TemplateItem> f141320b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$OnItemClickListener;", "", "onItemClick", "", "view", "Landroid/view/View;", "position", "", "link", "", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.d$a */
    public interface OnItemClickListener {
        /* renamed from: a */
        void mo194643a(View view, int i, String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u000f\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0006J\n\u0010\b\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateItem;", "", "getBackPic", "", "getBackgroundColor", "", "()Ljava/lang/Integer;", "getBorderColor", "getFrontPic", "getLink", "getTitle", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.d$b */
    public interface TemplateItem {
        /* renamed from: a */
        String mo194559a();

        /* renamed from: b */
        String mo194560b();

        /* renamed from: c */
        String mo194561c();

        /* renamed from: d */
        Integer mo194562d();

        /* renamed from: e */
        Integer mo194563e();

        /* renamed from: f */
        String mo194564f();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0006H&¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateListDataSource;", "T", "Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateItem;", "", "getItem", "position", "", "(I)Lcom/ss/android/lark/ug/banner/ui/template/TemplateItemAdapter$TemplateItem;", "getStyle", "size", "ug-banner-ui_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.d$c */
    public interface TemplateListDataSource<T extends TemplateItem> {
        /* renamed from: a */
        int mo194565a();

        /* renamed from: b */
        int mo194626b();

        /* renamed from: b */
        T mo194567b(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        TemplateListDataSource<? extends TemplateItem> cVar = this.f141320b;
        if (cVar != null) {
            return cVar.mo194565a();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo194652a(OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f141319a = aVar;
    }

    /* renamed from: a */
    public final void mo194653a(TemplateListDataSource<? extends TemplateItem> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "dataSource");
        this.f141320b = cVar;
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.ug.banner.ui.template.d$d */
    public static final class View$OnClickListenerC57391d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TemplateItemAdapter f141321a;

        /* renamed from: b */
        final /* synthetic */ int f141322b;

        /* renamed from: c */
        final /* synthetic */ TemplateItem f141323c;

        View$OnClickListenerC57391d(TemplateItemAdapter dVar, int i, TemplateItem bVar) {
            this.f141321a = dVar;
            this.f141322b = i;
            this.f141323c = bVar;
        }

        public final void onClick(View view) {
            OnItemClickListener aVar = this.f141321a.f141319a;
            if (aVar != null) {
                aVar.mo194643a(view, this.f141322b, this.f141323c.mo194564f());
            }
        }
    }

    /* renamed from: a */
    public TemplateItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Integer num;
        DefaultTemplateItemView bVar;
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        TemplateListDataSource<? extends TemplateItem> cVar = this.f141320b;
        if (cVar != null) {
            num = Integer.valueOf(cVar.mo194626b());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 1) {
            Context context = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "parent.context");
            bVar = new TemplateItemViewV1(context);
        } else if (num != null && num.intValue() == 2) {
            Context context2 = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "parent.context");
            bVar = new TemplateItemViewV2(context2);
        } else if (num != null && num.intValue() == 3) {
            Context context3 = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context3, "parent.context");
            bVar = new TemplateItemViewV3(context3);
        } else {
            Context context4 = viewGroup.getContext();
            Intrinsics.checkExpressionValueIsNotNull(context4, "parent.context");
            bVar = new DefaultTemplateItemView(context4);
        }
        return new TemplateItemViewHolder(bVar);
    }

    /* renamed from: a */
    public void onBindViewHolder(TemplateItemViewHolder eVar, int i) {
        TemplateItem b;
        int i2;
        Intrinsics.checkParameterIsNotNull(eVar, "holder");
        TemplateListDataSource<? extends TemplateItem> cVar = this.f141320b;
        if (cVar != null && (b = cVar.mo194567b(i)) != null) {
            eVar.mo194656a().setTitle(b.mo194559a());
            String b2 = b.mo194560b();
            if (b2 != null) {
                eVar.mo194656a().setFrontImageUrl(b2);
            }
            String c = b.mo194561c();
            if (c != null) {
                eVar.mo194656a().setBackImageUrl(c);
            }
            BaseTemplateItemView a = eVar.mo194656a();
            Integer d = b.mo194562d();
            int i3 = 0;
            if (d != null) {
                i2 = d.intValue();
            } else {
                i2 = 0;
            }
            Integer e = b.mo194563e();
            if (e != null) {
                i3 = e.intValue();
            }
            a.mo194645a(i2, i3);
            eVar.mo194656a().setOnClickListener(new View$OnClickListenerC57391d(this, i, b));
        }
    }
}
