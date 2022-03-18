package com.ss.android.lark.search.impl.func.chatinside.view.dialog;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.search.constant.SearchConstants;

/* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.dialog.a */
public class C53532a extends LarkRecyclerViewBaseAdapter<SpacePickViewHolder, C53536c> {

    /* renamed from: a */
    private Context f132246a;

    /* renamed from: b */
    private AbstractC53533a f132247b;

    /* renamed from: com.ss.android.lark.search.impl.func.chatinside.view.dialog.a$a */
    public interface AbstractC53533a {
        void onItemClick(SearchConstants.SpaceType spaceType, int i);
    }

    /* renamed from: a */
    public void mo182765a(AbstractC53533a aVar) {
        this.f132247b = aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f132246a = recyclerView.getContext();
        super.onAttachedToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public SpacePickViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new SpacePickViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_space_pick, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(SpacePickViewHolder spacePickViewHolder, int i) {
        C53536c cVar = (C53536c) getItem(i);
        spacePickViewHolder.mSpaceTypeTV.setText(cVar.mo182768b());
        spacePickViewHolder.mSpaceTypeIV.setImageDrawable(UIUtils.getDrawable(this.f132246a, cVar.mo182767a()));
        spacePickViewHolder.itemView.setOnClickListener(new View.OnClickListener(cVar, i) {
            /* class com.ss.android.lark.search.impl.func.chatinside.view.dialog.$$Lambda$a$nN7X2Zq6VbGnUA_ZFy9ldaTNz88 */
            public final /* synthetic */ C53536c f$1;
            public final /* synthetic */ int f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C53532a.lambda$nN7X2Zq6VbGnUA_ZFy9ldaTNz88(C53532a.this, this.f$1, this.f$2, view);
            }
        });
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m207313a(C53536c cVar, int i, View view) {
        AbstractC53533a aVar = this.f132247b;
        if (aVar != null) {
            aVar.onItemClick(cVar.mo182769c(), i);
        }
    }
}
