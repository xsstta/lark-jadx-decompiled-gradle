package com.ss.android.lark.reaction.widget.panel.p2563a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.panel.a.a */
public class C53078a extends RecyclerView.Adapter<C53081b> {

    /* renamed from: a */
    public AbstractC53080a f131235a;

    /* renamed from: b */
    private List<String> f131236b = new ArrayList();

    /* renamed from: c */
    private int f131237c;

    /* renamed from: d */
    private int f131238d;

    /* renamed from: e */
    private int f131239e;

    /* renamed from: com.ss.android.lark.reaction.widget.panel.a.a$a */
    public interface AbstractC53080a {
        void onReactionClicked(View view, String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f131236b.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.reaction.widget.panel.a.a$b */
    public class C53081b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f131242a;

        public C53081b(View view) {
            super(view);
            this.f131242a = (ImageView) view.findViewById(R.id.reaction);
        }
    }

    /* renamed from: a */
    public C53081b onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (DesktopUtil.m144307b()) {
            i2 = R.layout.item_whole_reaction_desktop;
        } else {
            i2 = R.layout.item_whole_reaction;
        }
        View inflate = from.inflate(i2, viewGroup, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(inflate.getLayoutParams());
        int i3 = this.f131237c;
        marginLayoutParams.setMargins(i3, this.f131238d, i3, this.f131239e);
        inflate.setLayoutParams(marginLayoutParams);
        return new C53081b(inflate);
    }

    /* renamed from: a */
    public void onBindViewHolder(C53081b bVar, int i) {
        ViewGroup.LayoutParams layoutParams = bVar.itemView.getLayoutParams();
        layoutParams.height = C52990a.m205224a(bVar.itemView.getContext(), 28.0f);
        bVar.itemView.setLayoutParams(layoutParams);
        final String str = this.f131236b.get(i);
        C52977a.m205190a().mo180995a(bVar.f131242a, str);
        bVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.reaction.widget.panel.p2563a.C53078a.View$OnClickListenerC530791 */

            public void onClick(View view) {
                if (C53078a.this.f131235a != null) {
                    C53078a.this.f131235a.onReactionClicked(view, str);
                }
            }
        });
    }

    public C53078a(List<String> list, AbstractC53080a aVar, Context context, boolean z) {
        if (list != null && !list.isEmpty()) {
            this.f131236b.addAll(list);
        }
        this.f131235a = aVar;
        this.f131237c = C52990a.m205224a(context, 8.0f);
        if (DesktopUtil.m144307b()) {
            if (z) {
                this.f131238d = C52990a.m205224a(context, 14.0f);
                this.f131239e = C52990a.m205224a(context, (float) BitmapDescriptorFactory.HUE_RED);
                return;
            }
            this.f131238d = C52990a.m205224a(context, (float) BitmapDescriptorFactory.HUE_RED);
            this.f131239e = C52990a.m205224a(context, 14.0f);
        }
    }
}
