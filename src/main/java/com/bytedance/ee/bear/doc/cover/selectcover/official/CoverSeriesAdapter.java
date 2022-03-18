package com.bytedance.ee.bear.doc.cover.selectcover.official;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.doc.cover.selectcover.official.OfficialCoverData;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u001c\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0016\u0010\u0018\u001a\u00020\u00122\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverSeriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverSeriesAdapter$CoverSeriesViewHolder;", "()V", "mCoverClickListener", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OnOfficialCoverClickListener;", "mCoverImageAdapter", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverImageAdapter;", "mCoverSeriesList", "", "Lcom/bytedance/ee/bear/doc/cover/selectcover/official/OfficialCoverData$CoverSeries;", "mLanguage", "", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "coverSeriesList", "", "setLanguage", "language", "setOnCoverClickListener", "listener", "CoverSeriesViewHolder", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.c */
public final class CoverSeriesAdapter extends RecyclerView.Adapter<CoverSeriesViewHolder> {

    /* renamed from: a */
    private String f15438a = "";

    /* renamed from: b */
    private final List<OfficialCoverData.CoverSeries> f15439b = new ArrayList();

    /* renamed from: c */
    private CoverImageAdapter f15440c;

    /* renamed from: d */
    private OnOfficialCoverClickListener f15441d;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverSeriesAdapter$CoverSeriesViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/bytedance/ee/bear/doc/cover/selectcover/official/CoverSeriesAdapter;Landroid/view/View;)V", "bottomPlaceHolder", "getBottomPlaceHolder", "()Landroid/view/View;", "setBottomPlaceHolder", "(Landroid/view/View;)V", "imageRV", "Landroidx/recyclerview/widget/RecyclerView;", "getImageRV", "()Landroidx/recyclerview/widget/RecyclerView;", "setImageRV", "(Landroidx/recyclerview/widget/RecyclerView;)V", "titleTV", "Landroid/widget/TextView;", "getTitleTV", "()Landroid/widget/TextView;", "setTitleTV", "(Landroid/widget/TextView;)V", "doc-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.doc.cover.selectcover.official.c$a */
    public final class CoverSeriesViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ CoverSeriesAdapter f15442a;

        /* renamed from: b */
        private TextView f15443b;

        /* renamed from: c */
        private RecyclerView f15444c;

        /* renamed from: d */
        private View f15445d;

        /* renamed from: a */
        public final TextView mo21614a() {
            return this.f15443b;
        }

        /* renamed from: b */
        public final RecyclerView mo21615b() {
            return this.f15444c;
        }

        /* renamed from: c */
        public final View mo21616c() {
            return this.f15445d;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public CoverSeriesViewHolder(CoverSeriesAdapter cVar, View view) {
            super(view);
            Intrinsics.checkParameterIsNotNull(view, "itemView");
            this.f15442a = cVar;
            View findViewById = view.findViewById(R.id.title);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "itemView.findViewById(R.id.title)");
            this.f15443b = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.image_recyclerview);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "itemView.findViewById(R.id.image_recyclerview)");
            this.f15444c = (RecyclerView) findViewById2;
            View findViewById3 = view.findViewById(R.id.bottom_place_holder);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "itemView.findViewById(R.id.bottom_place_holder)");
            this.f15445d = findViewById3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15439b.size();
    }

    /* renamed from: a */
    public final void mo21611a(OnOfficialCoverClickListener fVar) {
        this.f15441d = fVar;
    }

    /* renamed from: a */
    public final void mo21612a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "language");
        this.f15438a = str;
    }

    /* renamed from: a */
    public final void mo21613a(List<OfficialCoverData.CoverSeries> list) {
        if (list != null) {
            this.f15439b.clear();
            this.f15439b.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public CoverSeriesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.doc_cover_series_item, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "view");
        return new CoverSeriesViewHolder(this, inflate);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(com.bytedance.ee.bear.doc.cover.selectcover.official.CoverSeriesAdapter.CoverSeriesViewHolder r7, int r8) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.doc.cover.selectcover.official.CoverSeriesAdapter.onBindViewHolder(com.bytedance.ee.bear.doc.cover.selectcover.official.c$a, int):void");
    }
}
