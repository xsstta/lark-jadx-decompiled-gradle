package com.ss.android.lark.reaction.widget.panel.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.dimension.UDDimension;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.reaction.widget.p2560b.C52990a;
import com.ss.android.lark.ui.p2892a.C57582a;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.reaction.widget.panel.detail.a */
public class C53094a extends BaseAdapter {

    /* renamed from: a */
    private List<String> f131279a;

    /* renamed from: b */
    private GridView f131280b;

    /* renamed from: c */
    private Context f131281c;

    /* renamed from: d */
    private int f131282d;

    /* renamed from: e */
    private int f131283e = -1;

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public List<String> mo181345a() {
        return this.f131279a;
    }

    public int getCount() {
        return this.f131279a.size();
    }

    /* renamed from: com.ss.android.lark.reaction.widget.panel.detail.a$a */
    protected class C53095a {

        /* renamed from: a */
        public ImageView f131284a;

        protected C53095a() {
        }
    }

    /* renamed from: a */
    public void mo181346a(int i) {
        this.f131283e = i;
    }

    public Object getItem(int i) {
        return this.f131279a.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C53095a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f131281c).inflate(R.layout.layout_reaction_detail_panel_gridview_item, viewGroup, false);
            aVar = new C53095a();
            aVar.f131284a = (ImageView) view.findViewById(R.id.itemEmoji);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = this.f131282d;
            }
            view.setTag(aVar);
        } else {
            aVar = (C53095a) view.getTag();
        }
        String str = this.f131279a.get(i);
        if (Objects.equals(str, "#android#reaction#show#more#holder")) {
            aVar.f131284a.setVisibility(0);
            aVar.f131284a.setPadding(C57582a.m223600a(2), C57582a.m223600a(2), C57582a.m223600a(2), C57582a.m223600a(2));
            aVar.f131284a.setRotation(-45.0f);
            ImageView imageView = aVar.f131284a;
            Context context = this.f131281c;
            int i2 = this.f131283e;
            if (i2 == -1) {
                i2 = R.color.icon_n1;
            }
            imageView.setImageDrawable(UDIconUtils.getIconDrawable(context, R.drawable.ud_icon_more_add_outlined, C52990a.m205239c(context, i2), new UDDimension.Dp(22.0f)));
        } else if (Objects.equals(str, "#android#reaction#show#nothing#holder")) {
            aVar.f131284a.setVisibility(8);
        } else {
            aVar.f131284a.setVisibility(0);
            aVar.f131284a.setPadding(0, 0, 0, 0);
            aVar.f131284a.setRotation(BitmapDescriptorFactory.HUE_RED);
            C52977a.m205190a().mo180995a(aVar.f131284a, str);
        }
        return view;
    }

    public C53094a(Context context, GridView gridView, List<String> list, int i) {
        this.f131280b = gridView;
        this.f131279a = list;
        this.f131281c = context;
        this.f131282d = i;
    }
}
