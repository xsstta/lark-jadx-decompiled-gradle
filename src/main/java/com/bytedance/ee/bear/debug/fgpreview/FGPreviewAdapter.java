package com.bytedance.ee.bear.debug.fgpreview;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.C1382h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0011\u0012\u0013\u0014\u0015\u0016\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "model", "Lcom/bytedance/ee/bear/debug/fgpreview/FGConfigModel;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGConfigModel;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BoolTitleViewHolder", "BoolViewHolder", "Companion", "MultiTitleViewHolder", "MultiViewHolder", "TextTitleViewHolder", "TextViewHolder", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.debug.fgpreview.b */
public final class FGPreviewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public static final Companion f15181a = new Companion(null);

    /* renamed from: b */
    private final FGConfigModel f15182b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$Companion;", "", "()V", "TAG", "", "TYPE_BOOL", "", "TYPE_BOOL_TITLE", "TYPE_MULTI", "TYPE_MULTI_TITLE", "TYPE_TEXT", "TYPE_TEXT_TITLE", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$c */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$MultiViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;Landroid/view/View;)V", "arrowIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "content", "Landroidx/recyclerview/widget/RecyclerView;", "nameTv", "Landroid/widget/TextView;", "setInfo", "", "fgName", "", "rcJsonObj", "Lorg/json/JSONObject;", "gaJsonObj", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$e */
    public final class MultiViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final ImageView f15191a;

        /* renamed from: b */
        public final RecyclerView f15192b;

        /* renamed from: c */
        final /* synthetic */ FGPreviewAdapter f15193c;

        /* renamed from: d */
        private final TextView f15194d;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$e$a */
        public static final class RunnableC5301a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ MultiViewHolder f15198a;

            RunnableC5301a(MultiViewHolder eVar) {
                this.f15198a = eVar;
            }

            public final void run() {
                RecyclerView recyclerView = this.f15198a.f15192b;
                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "content");
                recyclerView.setVisibility(8);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiViewHolder(FGPreviewAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15193c = bVar;
            this.f15194d = (TextView) view.findViewById(R.id.item_fg_multi_name);
            this.f15191a = (ImageView) view.findViewById(R.id.item_fg_multi_arrow);
            this.f15192b = (RecyclerView) view.findViewById(R.id.item_fg_multi_content);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.ee.bear.debug.fgpreview.FGPreviewAdapter.MultiViewHolder.View$OnClickListenerC52981 */

                /* renamed from: a */
                final /* synthetic */ MultiViewHolder f15195a;

                {
                    this.f15195a = r1;
                }

                public final void onClick(View view) {
                    RecyclerView recyclerView = this.f15195a.f15192b;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "content");
                    if (recyclerView.getVisibility() == 8) {
                        this.f15195a.f15191a.animate().rotationBy(180.0f).setDuration(200).withEndAction(new Runnable(this) {
                            /* class com.bytedance.ee.bear.debug.fgpreview.FGPreviewAdapter.MultiViewHolder.View$OnClickListenerC52981.RunnableC52991 */

                            /* renamed from: a */
                            final /* synthetic */ View$OnClickListenerC52981 f15196a;

                            {
                                this.f15196a = r1;
                            }

                            public final void run() {
                                RecyclerView recyclerView = this.f15196a.f15195a.f15192b;
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "content");
                                recyclerView.setVisibility(0);
                            }
                        }).start();
                    } else {
                        this.f15195a.f15191a.animate().rotationBy(-180.0f).setDuration(200).withEndAction(new Runnable(this) {
                            /* class com.bytedance.ee.bear.debug.fgpreview.FGPreviewAdapter.MultiViewHolder.View$OnClickListenerC52981.RunnableC53002 */

                            /* renamed from: a */
                            final /* synthetic */ View$OnClickListenerC52981 f15197a;

                            {
                                this.f15197a = r1;
                            }

                            public final void run() {
                                RecyclerView recyclerView = this.f15197a.f15195a.f15192b;
                                Intrinsics.checkExpressionValueIsNotNull(recyclerView, "content");
                                recyclerView.setVisibility(8);
                            }
                        }).start();
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo21307a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
            Intrinsics.checkParameterIsNotNull(str, "fgName");
            TextView textView = this.f15194d;
            Intrinsics.checkExpressionValueIsNotNull(textView, "nameTv");
            textView.setText(str);
            if (jSONObject != null && jSONObject2 != null) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject(str);
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject(str);
                    FGConfigModel aVar = new FGConfigModel(optJSONObject, optJSONObject2, JsonToMapUtil.f15206a.mo21314a(optJSONObject), JsonToMapUtil.f15206a.mo21314a(optJSONObject2));
                    RecyclerView recyclerView = this.f15192b;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView, "content");
                    recyclerView.setAdapter(new FGPreviewAdapter(aVar));
                    RecyclerView recyclerView2 = this.f15192b;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "content");
                    View view = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "itemView");
                    recyclerView2.setLayoutManager(new LinearLayoutManager(view.getContext()));
                    RecyclerView recyclerView3 = this.f15192b;
                    View view2 = this.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view2, "itemView");
                    recyclerView3.addItemDecoration(new C1382h(view2.getContext(), 1));
                } catch (Exception e) {
                    C13479a.m54761a("FGPreviewAdapter", e);
                    RecyclerView recyclerView4 = this.f15192b;
                    Intrinsics.checkExpressionValueIsNotNull(recyclerView4, "content");
                    recyclerView4.setVisibility(8);
                    this.f15191a.animate().rotationBy(-180.0f).setDuration(200).withEndAction(new RunnableC5301a(this)).start();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15182b.mo21303i().size() + 3;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$BoolTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;Landroid/view/View;)V", "empty", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "item", "Landroid/widget/LinearLayout;", "showEmpty", "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$a */
    public final class BoolTitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FGPreviewAdapter f15183a;

        /* renamed from: b */
        private final LinearLayout f15184b;

        /* renamed from: c */
        private final TextView f15185c;

        /* renamed from: a */
        public final void mo21305a() {
            LinearLayout linearLayout = this.f15184b;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "item");
            linearLayout.setVisibility(8);
            TextView textView = this.f15185c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "empty");
            textView.setVisibility(0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BoolTitleViewHolder(FGPreviewAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15183a = bVar;
            this.f15184b = (LinearLayout) view.findViewById(R.id.item_preview_title_bool_root);
            this.f15185c = (TextView) view.findViewById(R.id.item_fg_title_bool_empty);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$TextTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;Landroid/view/View;)V", "empty", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "item", "Landroid/widget/LinearLayout;", "showEmpty", "", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$f */
    public final class TextTitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FGPreviewAdapter f15199a;

        /* renamed from: b */
        private final LinearLayout f15200b;

        /* renamed from: c */
        private final TextView f15201c;

        /* renamed from: a */
        public final void mo21312a() {
            LinearLayout linearLayout = this.f15200b;
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "item");
            linearLayout.setVisibility(8);
            TextView textView = this.f15201c;
            Intrinsics.checkExpressionValueIsNotNull(textView, "empty");
            textView.setVisibility(0);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TextTitleViewHolder(FGPreviewAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15199a = bVar;
            this.f15200b = (LinearLayout) view.findViewById(R.id.item_fg_text_root);
            this.f15201c = (TextView) view.findViewById(R.id.item_fg_title_text_empty);
        }
    }

    public FGPreviewAdapter(FGConfigModel aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        this.f15182b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        int size = this.f15182b.mo21295a().size();
        int size2 = this.f15182b.mo21296b().size();
        if (i == 0) {
            return 0;
        }
        if (1 <= i && size >= i) {
            return 1;
        }
        int i2 = size + 1;
        if (i == i2) {
            return 2;
        }
        if (i > i2 && i < size + size2 + 2) {
            return 3;
        }
        if (i == size + size2 + 2) {
            return 4;
        }
        return 5;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$MultiTitleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;Landroid/view/View;)V", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$d */
    public final class MultiTitleViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FGPreviewAdapter f15190a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MultiTitleViewHolder(FGPreviewAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15190a = bVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$BoolViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;Landroid/view/View;)V", "gaIcon", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "nameTv", "Landroid/widget/TextView;", "rcIcon", "setInfo", "", "fgName", "", "rc", "", "ga", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$b */
    public final class BoolViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FGPreviewAdapter f15186a;

        /* renamed from: b */
        private final TextView f15187b;

        /* renamed from: c */
        private final ImageView f15188c;

        /* renamed from: d */
        private final ImageView f15189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BoolViewHolder(FGPreviewAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15186a = bVar;
            this.f15187b = (TextView) view.findViewById(R.id.item_fg_bool_name);
            this.f15188c = (ImageView) view.findViewById(R.id.item_fg_bool_rc);
            this.f15189d = (ImageView) view.findViewById(R.id.item_fg_bool_ga);
        }

        /* renamed from: a */
        public final void mo21306a(String str, boolean z, boolean z2) {
            int i;
            Intrinsics.checkParameterIsNotNull(str, "fgName");
            TextView textView = this.f15187b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "nameTv");
            textView.setText(str);
            ImageView imageView = this.f15188c;
            int i2 = R.drawable.ic_fg_preview_check;
            if (z) {
                i = R.drawable.ic_fg_preview_check;
            } else {
                i = R.drawable.ic_fg_preview_uncheck;
            }
            imageView.setImageResource(i);
            ImageView imageView2 = this.f15189d;
            if (!z2) {
                i2 = R.drawable.ic_fg_preview_uncheck;
            }
            imageView2.setImageResource(i2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter$TextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/debug/fgpreview/FGPreviewAdapter;Landroid/view/View;)V", "gaText", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "nameTv", "rcText", "setInfo", "", "fgName", "", "rc", "ga", "debug-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.debug.fgpreview.b$g */
    public final class TextViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ FGPreviewAdapter f15202a;

        /* renamed from: b */
        private final TextView f15203b;

        /* renamed from: c */
        private final TextView f15204c;

        /* renamed from: d */
        private final TextView f15205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public TextViewHolder(FGPreviewAdapter bVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15202a = bVar;
            this.f15203b = (TextView) view.findViewById(R.id.item_fg_text_name);
            this.f15204c = (TextView) view.findViewById(R.id.item_fg_text_rc);
            this.f15205d = (TextView) view.findViewById(R.id.item_fg_text_ga);
        }

        /* renamed from: a */
        public final void mo21313a(String str, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "fgName");
            Intrinsics.checkParameterIsNotNull(str2, "rc");
            Intrinsics.checkParameterIsNotNull(str3, "ga");
            TextView textView = this.f15203b;
            Intrinsics.checkExpressionValueIsNotNull(textView, "nameTv");
            textView.setText(str);
            TextView textView2 = this.f15204c;
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rcText");
            textView2.setText(str2);
            TextView textView3 = this.f15205d;
            Intrinsics.checkExpressionValueIsNotNull(textView3, "gaText");
            textView3.setText(str3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.item_fg_preview_title_bool, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate, "itemView");
            return new BoolTitleViewHolder(this, inflate);
        } else if (i == 1) {
            View inflate2 = from.inflate(R.layout.item_fg_preview_simple_boolean, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate2, "itemView");
            return new BoolViewHolder(this, inflate2);
        } else if (i == 2) {
            View inflate3 = from.inflate(R.layout.item_fg_preview_title_text, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate3, "itemView");
            return new TextTitleViewHolder(this, inflate3);
        } else if (i == 3) {
            View inflate4 = from.inflate(R.layout.item_fg_preview_simple_text, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate4, "itemView");
            return new TextViewHolder(this, inflate4);
        } else if (i != 4) {
            View inflate5 = from.inflate(R.layout.item_fg_preview_multi, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate5, "itemView");
            return new MultiViewHolder(this, inflate5);
        } else {
            View inflate6 = from.inflate(R.layout.item_fg_preview_title_multi, viewGroup, false);
            Intrinsics.checkExpressionValueIsNotNull(inflate6, "itemView");
            return new MultiTitleViewHolder(this, inflate6);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int size;
        Intrinsics.checkParameterIsNotNull(viewHolder, "holder");
        int itemViewType = getItemViewType(i);
        if (itemViewType != 0) {
            if (itemViewType == 1) {
                int i2 = i - 1;
                if (i2 >= 0 && (viewHolder instanceof BoolViewHolder)) {
                    Pair<String, Boolean> pair = this.f15182b.mo21295a().get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(pair, "model.rcBooleanList[pos]");
                    Pair<String, Boolean> pair2 = pair;
                    Pair<String, Boolean> pair3 = this.f15182b.mo21298d().get(i2);
                    Intrinsics.checkExpressionValueIsNotNull(pair3, "model.gaBooleanList[pos]");
                    Pair<String, Boolean> pair4 = pair3;
                    if (TextUtils.equals(pair2.getFirst(), pair4.getFirst())) {
                        ((BoolViewHolder) viewHolder).mo21306a(pair2.getFirst(), pair2.getSecond().booleanValue(), pair4.getSecond().booleanValue());
                        return;
                    }
                    C13479a.m54758a("FGPreviewAdapter", "pair were not equals: " + pair2 + ',' + pair4);
                    View view = viewHolder.itemView;
                    Intrinsics.checkExpressionValueIsNotNull(view, "holder.itemView");
                    view.setVisibility(8);
                }
            } else if (itemViewType != 2) {
                if (itemViewType == 3) {
                    int size2 = (i - this.f15182b.mo21295a().size()) - 2;
                    if (size2 >= 0 && (viewHolder instanceof TextViewHolder)) {
                        Pair<String, String> pair5 = this.f15182b.mo21296b().get(size2);
                        Intrinsics.checkExpressionValueIsNotNull(pair5, "model.rcTextList[pos]");
                        Pair<String, String> pair6 = pair5;
                        Pair<String, String> pair7 = this.f15182b.mo21299e().get(size2);
                        Intrinsics.checkExpressionValueIsNotNull(pair7, "model.gaTextList[pos]");
                        Pair<String, String> pair8 = pair7;
                        if (TextUtils.isEmpty(pair6.getFirst()) || !TextUtils.equals(pair6.getFirst(), pair8.getFirst())) {
                            C13479a.m54758a("FGPreviewAdapter", "pair were not equals: " + pair6 + ',' + pair8);
                            View view2 = viewHolder.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view2, "holder.itemView");
                            view2.setVisibility(8);
                            return;
                        }
                        ((TextViewHolder) viewHolder).mo21313a(pair6.getFirst(), pair6.getSecond(), pair8.getSecond());
                    }
                } else if (itemViewType != 4) {
                    if (itemViewType == 5 && (size = ((i - this.f15182b.mo21295a().size()) - this.f15182b.mo21296b().size()) - 3) >= 0 && (viewHolder instanceof MultiViewHolder)) {
                        Pair<String, String> pair9 = this.f15182b.mo21297c().get(size);
                        Intrinsics.checkExpressionValueIsNotNull(pair9, "model.rcMultiList[pos]");
                        Pair<String, String> pair10 = pair9;
                        Pair<String, String> pair11 = this.f15182b.mo21300f().get(size);
                        Intrinsics.checkExpressionValueIsNotNull(pair11, "model.gaMultiList[pos]");
                        Pair<String, String> pair12 = pair11;
                        if (TextUtils.isEmpty(pair10.getFirst()) || !TextUtils.equals(pair10.getFirst(), pair12.getFirst())) {
                            C13479a.m54758a("FGPreviewAdapter", "pair were not equals: " + pair10 + ',' + pair12);
                            View view3 = viewHolder.itemView;
                            Intrinsics.checkExpressionValueIsNotNull(view3, "holder.itemView");
                            view3.setVisibility(8);
                            return;
                        }
                        ((MultiViewHolder) viewHolder).mo21307a(pair10.getFirst(), this.f15182b.mo21301g(), this.f15182b.mo21302h());
                    }
                } else if (this.f15182b.mo21297c().isEmpty()) {
                    boolean z = viewHolder instanceof MultiViewHolder;
                }
            } else if (this.f15182b.mo21296b().isEmpty() && (viewHolder instanceof TextTitleViewHolder)) {
                ((TextTitleViewHolder) viewHolder).mo21312a();
            }
        } else if (this.f15182b.mo21295a().isEmpty() && (viewHolder instanceof BoolTitleViewHolder)) {
            ((BoolTitleViewHolder) viewHolder).mo21305a();
        }
    }
}
