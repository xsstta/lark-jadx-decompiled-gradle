package com.ss.android.lark.guide.biz.onboarding.tour.page.ldr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView2;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.LdrGuideView;
import com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.entity.LdrServiceData;
import com.ss.android.lark.guide.statistics.OnboardingHitPointNew;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00122\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrCardAdapter$ViewHolder;", "ldrServiceList", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "ldrBtnStateCallback", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$LDRBtnStateCallback;", "(Ljava/util/List;Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrGuideView$LDRBtnStateCallback;)V", "context", "Landroid/content/Context;", "selectedServiceSet", "", "getSelectedServiceSet", "()Ljava/util/Set;", "getItemCount", "", "onAttachedToRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.c */
public final class LdrCardAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: c */
    public static final Companion f99201c = new Companion(null);

    /* renamed from: a */
    public Context f99202a;

    /* renamed from: b */
    public final LdrGuideView.LDRBtnStateCallback f99203b;

    /* renamed from: d */
    private final Set<LdrServiceData> f99204d;

    /* renamed from: e */
    private final List<LdrServiceData> f99205e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0006*\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrCardAdapter$Companion;", "", "()V", "LOG_TAG", "", "toTeaEventList", "", "", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<String> mo141423a(Set<LdrServiceData> set) {
            List<String> list;
            if (set != null) {
                Set<LdrServiceData> set2 = set;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo141416f());
                }
                list = CollectionsKt.toList(arrayList);
            } else {
                list = null;
            }
            if (list != null) {
                return list;
            }
            return CollectionsKt.emptyList();
        }
    }

    /* renamed from: a */
    public final Set<LdrServiceData> mo141421a() {
        return this.f99204d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f99205e.size();
    }

    /* renamed from: a */
    public static final /* synthetic */ Context m152311a(LdrCardAdapter cVar) {
        Context context = cVar.f99202a;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
        }
        return context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkParameterIsNotNull(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "recyclerView.context");
        this.f99202a = context;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrCardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrCardAdapter;Landroid/view/View;)V", "avatar", "Lcom/larksuite/component/ui/imageview/LKUIRoundedImageView2;", "checkbox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "subtitle", "Landroid/widget/TextView;", "title", "bind", "", "item", "Lcom/ss/android/lark/guide/biz/onboarding/tour/page/ldr/entity/LdrServiceData;", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.c$b */
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ LdrCardAdapter f99206a;

        /* renamed from: b */
        private final UDCheckBox f99207b;

        /* renamed from: c */
        private final LKUIRoundedImageView2 f99208c;

        /* renamed from: d */
        private final TextView f99209d;

        /* renamed from: e */
        private final TextView f99210e;

        /* renamed from: a */
        public final void mo141424a(LdrServiceData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "item");
            UDCheckBox uDCheckBox = this.f99207b;
            uDCheckBox.setChecked(true);
            uDCheckBox.setOnCheckedChangeListener(new C38606a(this, aVar));
            ImageLoader.with(LdrCardAdapter.m152311a(this.f99206a)).load(aVar.mo141410c()).asDrawable().into(this.f99208c);
            this.f99209d.setText(aVar.mo141406a());
            this.f99210e.setText(aVar.mo141408b());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/ss/android/lark/guide/biz/onboarding/tour/page/ldr/LdrCardAdapter$ViewHolder$bind$1$1", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox$OnCheckedChangeListener;", "onCheckedChanged", "", "buttonView", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "isChecked", "", "core_guide_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.guide.biz.onboarding.tour.page.ldr.c$b$a */
        public static final class C38606a implements UDCheckBox.OnCheckedChangeListener {

            /* renamed from: a */
            final /* synthetic */ ViewHolder f99211a;

            /* renamed from: b */
            final /* synthetic */ LdrServiceData f99212b;

            C38606a(ViewHolder bVar, LdrServiceData aVar) {
                this.f99211a = bVar;
                this.f99212b = aVar;
            }

            @Override // com.larksuite.component.universe_design.checkbox.UDCheckBox.OnCheckedChangeListener
            public void onCheckedChanged(UDCheckBox uDCheckBox, boolean z) {
                Intrinsics.checkParameterIsNotNull(uDCheckBox, "buttonView");
                if (z) {
                    this.f99211a.f99206a.mo141421a().add(this.f99212b);
                } else {
                    this.f99211a.f99206a.mo141421a().remove(this.f99212b);
                }
                this.f99211a.f99206a.f99203b.mo141437a(!this.f99211a.f99206a.mo141421a().isEmpty());
                OnboardingHitPointNew.f99381a.mo141636a(OnboardingHitPointNew.OperatingActivitiesClickParam.CHECKED, LdrCardAdapter.f99201c.mo141423a(this.f99211a.f99206a.mo141421a()));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(LdrCardAdapter cVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f99206a = cVar;
            View findViewById = view.findViewById(R.id.guide_ldr_card_checkbox);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.….guide_ldr_card_checkbox)");
            this.f99207b = (UDCheckBox) findViewById;
            View findViewById2 = view.findViewById(R.id.guide_ldr_card_avatar);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.guide_ldr_card_avatar)");
            this.f99208c = (LKUIRoundedImageView2) findViewById2;
            View findViewById3 = view.findViewById(R.id.guide_ldr_card_title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.guide_ldr_card_title)");
            this.f99209d = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.guide_ldr_card_subtitle);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "itemView.findViewById(R.….guide_ldr_card_subtitle)");
            this.f99210e = (TextView) findViewById4;
        }
    }

    /* renamed from: a */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_guide_ldr_card, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new ViewHolder(this, inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(ViewHolder bVar, int i) {
        Intrinsics.checkParameterIsNotNull(bVar, "holder");
        bVar.mo141424a(this.f99205e.get(i));
    }

    public LdrCardAdapter(List<LdrServiceData> list, LdrGuideView.LDRBtnStateCallback bVar) {
        Intrinsics.checkParameterIsNotNull(list, "ldrServiceList");
        Intrinsics.checkParameterIsNotNull(bVar, "ldrBtnStateCallback");
        this.f99205e = list;
        this.f99203b = bVar;
        StringBuilder sb = new StringBuilder();
        sb.append("services image: ");
        List<LdrServiceData> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo141410c());
        }
        sb.append(arrayList);
        Log.m165389i("LdrCardAdapter", sb.toString());
        this.f99204d = CollectionsKt.toMutableSet(this.f99205e);
    }
}
