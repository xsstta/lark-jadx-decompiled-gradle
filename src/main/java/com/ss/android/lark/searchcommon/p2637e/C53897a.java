package com.ss.android.lark.searchcommon.p2637e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchDepartmentInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMailContactInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import com.ss.android.lark.searchcommon.view.AvatarItemViewWithMask;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.searchcommon.view.binder.BinderRepo;
import com.ss.android.lark.widget.listener.OnSingleClickListener;

/* renamed from: com.ss.android.lark.searchcommon.e.a */
public class C53897a extends LarkRecyclerViewBaseAdapter<C53901b, SearchBaseInfo> {

    /* renamed from: a */
    public AbstractC53900a f133191a;

    /* renamed from: b */
    private Context f133192b;

    /* renamed from: c */
    private BinderRepo f133193c;

    /* renamed from: com.ss.android.lark.searchcommon.e.a$a */
    public interface AbstractC53900a {
        /* renamed from: a */
        void mo183780a(SearchBaseInfo searchBaseInfo);
    }

    /* renamed from: a */
    public void mo184285a(AbstractC53900a aVar) {
        this.f133191a = aVar;
    }

    public C53897a(Context context) {
        this.f133192b = context;
        this.f133193c = new BinderRepo(context, new SearchResultViewAdapter.IOnItemClickHandler() {
            /* class com.ss.android.lark.searchcommon.p2637e.C53897a.C538981 */

            @Override // com.ss.android.lark.searchcommon.view.SearchResultViewAdapter.IOnItemClickHandler
            /* renamed from: a */
            public void mo182499a(SearchBaseInfo searchBaseInfo, boolean z, int i) {
            }
        });
    }

    /* renamed from: com.ss.android.lark.searchcommon.e.a$b */
    public static class C53901b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public AvatarItemViewWithMask f133197a;

        /* renamed from: b */
        public View f133198b;

        /* renamed from: c */
        public ChatterChatViewHolder f133199c = new ChatterChatViewHolder(this.f133197a, -1);

        public C53901b(View view) {
            super(view);
            AvatarItemViewWithMask avatarItemViewWithMask = (AvatarItemViewWithMask) view.findViewById(R.id.selected_item);
            this.f133197a = avatarItemViewWithMask;
            avatarItemViewWithMask.mo184574a(false);
            this.f133198b = view.findViewById(R.id.selected_remove);
        }
    }

    /* renamed from: a */
    public C53901b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C53901b(LayoutInflater.from(this.f133192b).inflate(R.layout.selected_more_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C53901b bVar, int i) {
        final SearchBaseInfo searchBaseInfo = (SearchBaseInfo) getItem(i);
        if (searchBaseInfo instanceof SearchChatterInfo) {
            this.f133193c.mo184777a().mo184835a(i, (SearchChatterInfo) searchBaseInfo, bVar.f133199c);
        } else if (searchBaseInfo instanceof SearchChatInfo) {
            this.f133193c.mo184781b().mo184835a(i, (SearchChatInfo) searchBaseInfo, bVar.f133199c);
        } else if (searchBaseInfo instanceof SearchThreadInfo) {
            this.f133193c.mo184786f().mo184835a(i, (SearchThreadInfo) searchBaseInfo, bVar.f133199c);
        } else if (searchBaseInfo instanceof SearchDepartmentInfo) {
            this.f133193c.mo184784d().mo184835a(i, (SearchDepartmentInfo) searchBaseInfo, bVar.f133199c);
        } else if (searchBaseInfo instanceof SearchMailContactInfo) {
            this.f133193c.mo184802v().mo184835a(i, (SearchMailContactInfo) searchBaseInfo, bVar.f133199c);
        } else {
            Log.m165383e("LarkSearch.Common.SelectedMoreAdapter", "wtf!!!");
        }
        bVar.f133198b.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.lark.searchcommon.p2637e.C53897a.C538992 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                if (C53897a.this.f133191a != null) {
                    C53897a.this.f133191a.mo183780a(searchBaseInfo);
                }
            }
        });
    }
}
