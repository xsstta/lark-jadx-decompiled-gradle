package com.ss.android.lark.main.app.drawer.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.suite.R;
import com.ss.android.lark.base.adapter.LarkRecyclerViewBaseAdapter;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.DiskCacheStrategy;
import com.ss.android.lark.main.C44134a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.main.app.drawer.adapter.a */
public abstract class AbstractC44213a<TData> extends LarkRecyclerViewBaseAdapter<TenantItemHolder, TData> {

    /* renamed from: a */
    Context f112185a;

    /* renamed from: b */
    AbstractC44214a<TData> f112186b;

    /* renamed from: c */
    boolean f112187c;

    /* renamed from: d */
    AbstractC44215b f112188d;

    /* renamed from: e */
    int f112189e = 3;

    /* renamed from: com.ss.android.lark.main.app.drawer.adapter.a$a */
    public interface AbstractC44214a<TData> {
        /* renamed from: a */
        void mo157212a(TData tdata);
    }

    /* renamed from: com.ss.android.lark.main.app.drawer.adapter.a$b */
    public interface AbstractC44215b {
        /* renamed from: a */
        void mo157213a(View view);
    }

    /* renamed from: a */
    public void mo157239a(int i) {
        this.f112189e = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    public void mo157241a(AbstractC44214a<TData> aVar) {
        this.f112186b = aVar;
    }

    /* renamed from: a */
    public void mo157242a(AbstractC44215b bVar) {
        this.f112188d = bVar;
    }

    public AbstractC44213a(Context context) {
        this.f112185a = context;
        this.f112187c = C44134a.m174959a().mo133270z().mo133361a("lark.tenant.penetration.enable");
    }

    /* renamed from: a */
    public TenantItemHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TenantItemHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_feed_tenant_switcher_container_item, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo157240a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            ImageLoader.with(this.f112185a).load(str).override(UIHelper.dp2px(48.0f), UIHelper.dp2px(48.0f)).centerCrop().placeholder(R.drawable.feed_tenant_avatar_placeholder).error(R.drawable.feed_tenant_avatar_bg).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        }
    }
}
