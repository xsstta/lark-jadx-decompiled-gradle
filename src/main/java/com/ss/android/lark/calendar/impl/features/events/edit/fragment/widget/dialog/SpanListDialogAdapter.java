package com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.dialog.SpanListDialogController;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016J\u0014\u0010\u0017\u001a\u00020\u00102\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0019J\u000e\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter$SpanListItemViewHolder;", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mIsChecked", "", "mItemClickedListener", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogController$OnItemClickListener;", "mItems", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/SpanMenuItem;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setItems", "items", "", "setOnItemClickListener", "listener", "SpanListItemViewHolder", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.a */
public final class SpanListDialogAdapter extends RecyclerView.Adapter<SpanListItemViewHolder> {

    /* renamed from: a */
    public SpanListDialogController.OnItemClickListener f81011a;

    /* renamed from: b */
    public boolean f81012b = true;

    /* renamed from: c */
    private List<SpanMenuItem> f81013c = new ArrayList();

    /* renamed from: d */
    private final Context f81014d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001a\u0010'\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0012\"\u0004\b)\u0010\u0014R\u001a\u0010*\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001a¨\u0006-"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/widget/dialog/SpanListDialogAdapter$SpanListItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "mDivider", "getMDivider", "()Landroid/view/View;", "setMDivider", "mMenuCheckbox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "getMMenuCheckbox", "()Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "setMMenuCheckbox", "(Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;)V", "mMenuCheckboxContainer", "Landroid/widget/LinearLayout;", "getMMenuCheckboxContainer", "()Landroid/widget/LinearLayout;", "setMMenuCheckboxContainer", "(Landroid/widget/LinearLayout;)V", "mMenuCheckboxDesc", "Landroid/widget/TextView;", "getMMenuCheckboxDesc", "()Landroid/widget/TextView;", "setMMenuCheckboxDesc", "(Landroid/widget/TextView;)V", "mMenuContainer", "getMMenuContainer", "setMMenuContainer", "mMenuIcon", "Landroid/widget/ImageView;", "getMMenuIcon", "()Landroid/widget/ImageView;", "setMMenuIcon", "(Landroid/widget/ImageView;)V", "mMenuItem", "getMMenuItem", "setMMenuItem", "mMenuItemContainer", "getMMenuItemContainer", "setMMenuItemContainer", "mMenuItemDesc", "getMMenuItemDesc", "setMMenuItemDesc", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.a$a */
    public static final class SpanListItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private LinearLayout f81015a;

        /* renamed from: b */
        private LinearLayout f81016b;

        /* renamed from: c */
        private TextView f81017c;

        /* renamed from: d */
        private ImageView f81018d;

        /* renamed from: e */
        private TextView f81019e;

        /* renamed from: f */
        private LinearLayout f81020f;

        /* renamed from: g */
        private UDCheckBox f81021g;

        /* renamed from: h */
        private TextView f81022h;

        /* renamed from: i */
        private View f81023i;

        /* renamed from: a */
        public final LinearLayout mo115997a() {
            return this.f81016b;
        }

        /* renamed from: b */
        public final TextView mo115998b() {
            return this.f81017c;
        }

        /* renamed from: c */
        public final ImageView mo115999c() {
            return this.f81018d;
        }

        /* renamed from: d */
        public final TextView mo116000d() {
            return this.f81019e;
        }

        /* renamed from: e */
        public final LinearLayout mo116001e() {
            return this.f81020f;
        }

        /* renamed from: f */
        public final UDCheckBox mo116002f() {
            return this.f81021g;
        }

        /* renamed from: g */
        public final TextView mo116003g() {
            return this.f81022h;
        }

        /* renamed from: h */
        public final View mo116004h() {
            return this.f81023i;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SpanListItemViewHolder(View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "view");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.menu_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "view.menu_container");
            this.f81015a = linearLayout;
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.menu_item_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "view.menu_item_container");
            this.f81016b = linearLayout2;
            TextView textView = (TextView) view.findViewById(R.id.menu_item);
            Intrinsics.checkExpressionValueIsNotNull(textView, "view.menu_item");
            this.f81017c = textView;
            ImageView imageView = (ImageView) view.findViewById(R.id.menu_icon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "view.menu_icon");
            this.f81018d = imageView;
            TextView textView2 = (TextView) view.findViewById(R.id.menu_item_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "view.menu_item_desc");
            this.f81019e = textView2;
            LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.menu_checkbox_container);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "view.menu_checkbox_container");
            this.f81020f = linearLayout3;
            UDCheckBox uDCheckBox = (UDCheckBox) view.findViewById(R.id.menu_item_checkbox);
            Intrinsics.checkExpressionValueIsNotNull(uDCheckBox, "view.menu_item_checkbox");
            this.f81021g = uDCheckBox;
            TextView textView3 = (TextView) view.findViewById(R.id.menu_checkbox_desc);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "view.menu_checkbox_desc");
            this.f81022h = textView3;
            View findViewById = view.findViewById(R.id.divider);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.divider");
            this.f81023i = findViewById;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f81013c.size();
    }

    /* renamed from: a */
    public final void mo115995a(SpanListDialogController.OnItemClickListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f81011a = aVar;
    }

    public SpanListDialogAdapter(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        this.f81014d = context;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.a$b */
    public static final class View$OnClickListenerC31816b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpanListDialogAdapter f81024a;

        /* renamed from: b */
        final /* synthetic */ SpanMenuItem f81025b;

        /* renamed from: c */
        final /* synthetic */ SpanListItemViewHolder f81026c;

        View$OnClickListenerC31816b(SpanListDialogAdapter aVar, SpanMenuItem bVar, SpanListItemViewHolder aVar2) {
            this.f81024a = aVar;
            this.f81025b = bVar;
            this.f81026c = aVar2;
        }

        public final void onClick(View view) {
            SpanMenuItem bVar = this.f81025b;
            bVar.mo115300a(!bVar.mo115304e());
            this.f81024a.f81012b = this.f81025b.mo115304e();
            this.f81026c.mo116002f().setChecked(this.f81025b.mo115304e());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.fragment.widget.a.a$c */
    public static final class View$OnClickListenerC31817c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SpanListDialogAdapter f81027a;

        View$OnClickListenerC31817c(SpanListDialogAdapter aVar) {
            this.f81027a = aVar;
        }

        public final void onClick(View view) {
            SpanListDialogController.OnItemClickListener aVar = this.f81027a.f81011a;
            if (aVar != null) {
                Intrinsics.checkExpressionValueIsNotNull(view, "v");
                Object tag = view.getTag();
                if (tag != null) {
                    aVar.mo109576a(((SpanMenuItem) tag).mo115299a(), this.f81027a.f81012b);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.SpanMenuItem");
            }
        }
    }

    /* renamed from: a */
    public final void mo115996a(List<SpanMenuItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "items");
        this.f81013c.clear();
        this.f81013c.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public SpanListItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f81014d).inflate(R.layout.item_detail_span_menu, viewGroup, false);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "inflater.inflate(R.layou…span_menu, parent, false)");
        return new SpanListItemViewHolder(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(SpanListItemViewHolder aVar, int i) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        SpanMenuItem bVar = this.f81013c.get(i);
        aVar.mo115997a().setTag(bVar);
        if (!TextUtils.isEmpty(bVar.mo115301b())) {
            aVar.mo115998b().setText(bVar.mo115301b());
            aVar.mo115998b().setVisibility(0);
        } else if (bVar.mo115306g()) {
            aVar.mo115998b().setVisibility(8);
        } else {
            aVar.mo115997a().setVisibility(8);
        }
        if (!bVar.mo115305f()) {
            aVar.mo115998b().setTextColor(C32634ae.m125178a(R.color.ud_N300));
        }
        if (bVar.mo115307h()) {
            aVar.mo115998b().setTextColor(C32634ae.m125178a(R.color.function_danger_500));
        }
        if (bVar.mo115306g()) {
            aVar.mo115999c().setVisibility(0);
        }
        if (!TextUtils.isEmpty(bVar.mo115302c())) {
            aVar.mo116000d().setVisibility(0);
            aVar.mo116000d().setText(bVar.mo115302c());
        } else {
            aVar.mo116000d().setVisibility(8);
        }
        if (!TextUtils.isEmpty(bVar.mo115303d())) {
            aVar.mo116001e().setVisibility(0);
            aVar.mo116003g().setText(bVar.mo115303d());
            aVar.mo116002f().setChecked(bVar.mo115304e());
            aVar.mo116001e().setOnClickListener(new View$OnClickListenerC31816b(this, bVar, aVar));
            this.f81012b = bVar.mo115304e();
        } else {
            aVar.mo116001e().setVisibility(8);
        }
        if (i == getItemCount() - 1) {
            aVar.mo116004h().setVisibility(8);
        }
        aVar.mo115997a().setOnClickListener(new View$OnClickListenerC31817c(this));
    }
}
