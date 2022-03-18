package com.ss.android.lark.reaction.widget.panel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;

/* renamed from: com.ss.android.lark.reaction.widget.panel.a */
public class C53073a extends BaseAdapter {

    /* renamed from: a */
    public AbstractC53076a f131225a;

    /* renamed from: b */
    private List<String> f131226b;

    /* renamed from: c */
    private Context f131227c;

    /* renamed from: d */
    private boolean f131228d;

    /* renamed from: e */
    private int f131229e = -1;

    /* renamed from: com.ss.android.lark.reaction.widget.panel.a$a */
    public interface AbstractC53076a {
        /* renamed from: a */
        void mo181305a(View view);

        /* renamed from: a */
        void mo181306a(String str);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.panel.a$b */
    public static class C53077b {

        /* renamed from: a */
        public View f131233a;

        /* renamed from: b */
        public ImageView f131234b;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        if (this.f131228d) {
            return this.f131226b.size() + 1;
        }
        return this.f131226b.size();
    }

    /* renamed from: a */
    public void mo181316a(int i) {
        this.f131229e = i;
    }

    public Object getItem(int i) {
        if (i < this.f131226b.size()) {
            return this.f131226b.get(i);
        }
        return new Object();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C53077b bVar;
        int i2;
        if (view == null) {
            LayoutInflater from = LayoutInflater.from(this.f131227c);
            if (DesktopUtil.m144307b()) {
                i2 = R.layout.item_reaction_first_line_desktop;
            } else {
                i2 = R.layout.item_reaction_first_line;
            }
            view = from.inflate(i2, viewGroup, false);
            bVar = new C53077b();
            bVar.f131233a = view;
            bVar.f131234b = (ImageView) view.findViewById(R.id.reaction);
            view.setTag(bVar);
        } else {
            bVar = (C53077b) view.getTag();
        }
        if (i < this.f131226b.size()) {
            final String str = this.f131226b.get(i);
            C52977a.m205190a().mo180995a(bVar.f131234b, str);
            bVar.f131233a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.reaction.widget.panel.C53073a.View$OnClickListenerC530741 */

                public void onClick(View view) {
                    if (C53073a.this.f131225a != null) {
                        C53073a.this.f131225a.mo181306a(str);
                    }
                }
            });
            bVar.f131234b.setPadding(0, 0, 0, 0);
        } else {
            bVar.f131234b.setVisibility(0);
            bVar.f131234b.setPadding(C57582a.m223600a(2), C57582a.m223600a(2), C57582a.m223600a(2), C57582a.m223600a(2));
            ImageView imageView = bVar.f131234b;
            Context context = this.f131227c;
            int i3 = this.f131229e;
            if (i3 == -1) {
                i3 = R.color.icon_n1;
            }
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_more_add_outlined, C52990a.m205239c(context, i3), new UDDimension.Dp(22.0f)));
            bVar.f131233a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.reaction.widget.panel.C53073a.View$OnClickListenerC530752 */

                public void onClick(View view) {
                    if (C53073a.this.f131225a != null) {
                        C53073a.this.f131225a.mo181305a(view);
                    }
                }
            });
        }
        return view;
    }

    public C53073a(Context context, List<String> list, boolean z, AbstractC53076a aVar) {
        this.f131226b = list;
        this.f131227c = context;
        this.f131225a = aVar;
        this.f131228d = z;
    }
}
