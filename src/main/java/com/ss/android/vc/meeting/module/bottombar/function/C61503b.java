package com.ss.android.vc.meeting.module.bottombar.function;

import android.app.Activity;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.bottombar.function.b */
public class C61503b extends RecyclerView.Adapter<C61506a> {

    /* renamed from: a */
    public int f154250a = (((C60776r.m236139a() - (C60773o.m236115a(12.0d) * 2)) - (C60773o.m236115a(72.0d) * 4)) / 8);

    /* renamed from: b */
    private final Activity f154251b;

    /* renamed from: c */
    private final C61303k f154252c;

    /* renamed from: d */
    private List<FunctionItem> f154253d;

    /* renamed from: e */
    private final AbstractC61444a.AbstractC61446b f154254e;

    /* renamed from: f */
    private int f154255f;

    /* renamed from: g */
    private final int f154256g;

    /* renamed from: h */
    private RecyclerView.AbstractC1335d f154257h = new RecyclerView.AbstractC1335d() {
        /* class com.ss.android.vc.meeting.module.bottombar.function.C61503b.C615041 */

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            super.getItemOffsets(rect, view, recyclerView, state);
            rect.left = C61503b.this.f154250a;
            rect.right = C61503b.this.f154250a;
        }
    };

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f154255f;
    }

    /* renamed from: a */
    public void mo213148a() {
        this.f154250a = ((C60776r.m236139a() - (C60773o.m236115a(12.0d) * 2)) - (C60773o.m236115a(72.0d) * 4)) / 8;
        this.f154257h = new RecyclerView.AbstractC1335d() {
            /* class com.ss.android.vc.meeting.module.bottombar.function.C61503b.C615052 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                super.getItemOffsets(rect, view, recyclerView, state);
                rect.left = C61503b.this.f154250a;
                rect.right = C61503b.this.f154250a;
            }
        };
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.function.b$a */
    public static class C61506a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public RecyclerView f154260a;

        public C61506a(View view) {
            super(view);
            this.f154260a = (RecyclerView) view.findViewById(R.id.rv_function_area_item);
        }
    }

    /* renamed from: a */
    public void mo213150a(List<FunctionItem> list, int i) {
        this.f154253d.clear();
        this.f154253d.addAll(list);
        this.f154255f = i;
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public C61506a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C61506a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vc_bottom_bar_function_rv_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C61506a aVar, int i) {
        aVar.f154260a.setAdapter(new C61499a(this.f154252c, this.f154253d, i, this.f154256g, this.f154254e));
        if (aVar.f154260a.getItemDecorationCount() > 0) {
            aVar.f154260a.removeItemDecorationAt(0);
        }
        aVar.f154260a.addItemDecoration(this.f154257h);
        aVar.f154260a.setLayoutManager(new GridLayoutManager(this.f154251b, 4));
        aVar.f154260a.getAdapter().notifyDataSetChanged();
    }

    public C61503b(Activity activity, C61303k kVar, List<FunctionItem> list, int i, int i2, AbstractC61444a.AbstractC61446b bVar) {
        this.f154251b = activity;
        this.f154253d = list;
        this.f154252c = kVar;
        this.f154255f = i;
        this.f154256g = i2;
        this.f154254e = bVar;
    }
}
