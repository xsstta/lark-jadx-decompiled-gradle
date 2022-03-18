package com.ss.android.lark.reaction.widget.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.panel.c */
public class C53082c extends RecyclerView.Adapter<C53083a> {

    /* renamed from: a */
    private AbstractC53084b f131245a;

    /* renamed from: b */
    private Context f131246b;

    /* renamed from: c */
    private List<C53085d> f131247c;

    /* renamed from: com.ss.android.lark.reaction.widget.panel.c$b */
    public interface AbstractC53084b {
        void onItemClick(View view, int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f131247c.size();
    }

    /* renamed from: a */
    public void mo181330a(AbstractC53084b bVar) {
        this.f131245a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m205490a(View view) {
        AbstractC53084b bVar = this.f131245a;
        if (bVar != null) {
            bVar.onItemClick(view, ((Integer) view.getTag()).intValue());
        }
    }

    public C53082c(Context context, List<C53085d> list) {
        this.f131246b = context;
        this.f131247c = list;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.reaction.widget.panel.c$a */
    public class C53083a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        TextView f131248a;

        /* renamed from: b */
        ImageView f131249b;

        public C53083a(View view) {
            super(view);
            this.f131249b = (ImageView) view.findViewById(R.id.image_icon);
            this.f131248a = (TextView) view.findViewById(R.id.text_icon_name);
        }
    }

    /* renamed from: a */
    public C53083a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        LayoutInflater from = LayoutInflater.from(this.f131246b);
        if (DesktopUtil.m144307b()) {
            i2 = R.layout.reaction_menu_item_desktop;
        } else {
            i2 = R.layout.reaction_menu_item;
        }
        return new C53083a(from.inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C53083a aVar, int i) {
        int i2;
        Drawable drawable;
        C53085d dVar = this.f131247c.get(i);
        aVar.f131248a.setText(dVar.f131251a);
        if (dVar.f131259i) {
            i2 = C52990a.m205239c(this.f131246b, R.color.icon_n1);
        } else {
            i2 = C52990a.m205239c(this.f131246b, R.color.icon_disable);
        }
        if (dVar.f131257g != -1) {
            drawable = UDIconUtils.getIconDrawable(this.f131246b, dVar.f131257g, i2);
        } else {
            Drawable drawable2 = dVar.f131258h;
            drawable2.mutate();
            drawable2.setTint(i2);
            drawable = drawable2;
        }
        aVar.f131249b.setImageDrawable(drawable);
        aVar.itemView.setTag(Integer.valueOf(i));
        aVar.f131248a.setMaxLines(2);
        aVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.reaction.widget.panel.$$Lambda$c$IjHBU8qu5Av0gmiGJLtuvsYM */

            public final void onClick(View view) {
                C53082c.m270933lambda$IjHBU8qu5Av0gmiGJLtuvsYM(C53082c.this, view);
            }
        });
        aVar.itemView.setEnabled(dVar.f131259i);
        aVar.f131248a.setEnabled(dVar.f131259i);
        aVar.f131249b.setEnabled(dVar.f131259i);
    }
}
