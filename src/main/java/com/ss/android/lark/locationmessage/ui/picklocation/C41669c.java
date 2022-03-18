package com.ss.android.lark.locationmessage.ui.picklocation;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.larksuite.component.universe_design.icon.UDIconUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.location.dto.POIInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.c */
public class C41669c extends BaseAdapter {

    /* renamed from: a */
    private Context f105827a;

    /* renamed from: b */
    private List<POIInfo> f105828b = new ArrayList();

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.c$a */
    static final class C41670a {

        /* renamed from: a */
        TextView f105829a;

        /* renamed from: b */
        TextView f105830b;

        /* renamed from: c */
        ImageView f105831c;

        C41670a() {
        }
    }

    public int getCount() {
        return this.f105828b.size();
    }

    /* renamed from: b */
    public POIInfo mo149850b() {
        List<POIInfo> list = this.f105828b;
        if (list == null) {
            return null;
        }
        for (POIInfo pOIInfo : list) {
            if (pOIInfo.getIsCurrent()) {
                return pOIInfo;
            }
        }
        return null;
    }

    /* renamed from: c */
    public boolean mo149852c() {
        List<POIInfo> list = this.f105828b;
        if (list == null) {
            return false;
        }
        for (POIInfo pOIInfo : list) {
            if (pOIInfo.getIsCurrent()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void mo149853d() {
        if (!CollectionUtils.isEmpty(this.f105828b)) {
            this.f105828b.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo149845a() {
        for (POIInfo pOIInfo : this.f105828b) {
            pOIInfo.setIsCurrent(false);
        }
    }

    public Object getItem(int i) {
        return Integer.valueOf(i);
    }

    /* renamed from: a */
    public void mo149849a(List<POIInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            this.f105828b = list;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public POIInfo mo149844a(int i) {
        if (i < 0 || i >= this.f105828b.size()) {
            return null;
        }
        return this.f105828b.get(i);
    }

    /* renamed from: b */
    public void mo149851b(List<POIInfo> list) {
        if (!CollectionUtils.isEmpty(list)) {
            if (this.f105828b == null) {
                this.f105828b = new ArrayList();
            }
            this.f105828b.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo149847a(POIInfo pOIInfo) {
        if (pOIInfo != null) {
            if (this.f105828b == null) {
                this.f105828b = new ArrayList();
            }
            this.f105828b.add(pOIInfo);
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo149848a(String str) {
        if (this.f105828b == null) {
            this.f105828b = new ArrayList();
        }
        POIInfo pOIInfo = new POIInfo(str, this.f105827a.getString(R.string.Lark_Chat_MapsSearchCustomLocation), 360.0d, 360.0d, false, true);
        if (this.f105828b.size() > 0) {
            this.f105828b.set(0, pOIInfo);
        } else {
            this.f105828b.add(pOIInfo);
        }
        notifyDataSetChanged();
    }

    public C41669c(Context context, List<POIInfo> list) {
        this.f105827a = context;
        this.f105828b = list;
    }

    /* renamed from: a */
    public void mo149846a(int i, POIInfo pOIInfo) {
        if (pOIInfo != null) {
            if (this.f105828b == null) {
                this.f105828b = new ArrayList();
            }
            if (i >= 0 && i <= this.f105828b.size()) {
                this.f105828b.add(i, pOIInfo);
                notifyDataSetChanged();
            }
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C41670a aVar;
        int i2;
        if (view == null) {
            view = LayoutInflater.from(this.f105827a).inflate(R.layout.location_position_item, viewGroup, false);
            aVar = new C41670a();
            aVar.f105829a = (TextView) view.findViewById(R.id.tv_location_name);
            aVar.f105831c = (ImageView) view.findViewById(R.id.iv_location_current);
            aVar.f105830b = (TextView) view.findViewById(R.id.tv_location_desc);
            view.setTag(aVar);
        } else {
            aVar = (C41670a) view.getTag();
        }
        POIInfo pOIInfo = this.f105828b.get(i);
        aVar.f105829a.setText(pOIInfo.getLocationName());
        aVar.f105830b.setText(pOIInfo.getLocationAddress());
        ImageView imageView = aVar.f105831c;
        if (pOIInfo.getIsCurrent()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (TextUtils.isEmpty(pOIInfo.getLocationAddress())) {
            aVar.f105830b.setVisibility(8);
        } else {
            aVar.f105830b.setVisibility(0);
        }
        if (!pOIInfo.getIsSelfDefine() || pOIInfo.getIsCurrent()) {
            Context context = this.f105827a;
            aVar.f105829a.setCompoundDrawablesWithIntrinsicBounds(UDIconUtils.getIconDrawable(context, (int) R.drawable.ud_icon_local_outlined, UIUtils.getColor(context, R.color.ud_N400)), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            aVar.f105829a.setCompoundDrawablesWithIntrinsicBounds(this.f105827a.getResources().getDrawable(R.drawable.location_icon_location_self_define), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        return view;
    }
}
