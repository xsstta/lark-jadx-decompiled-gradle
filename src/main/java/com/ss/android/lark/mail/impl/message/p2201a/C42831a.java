package com.ss.android.lark.mail.impl.message.p2201a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0215a;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.message.p2203c.C42846c;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.mail.impl.message.a.a */
public class C42831a extends BaseAdapter {

    /* renamed from: a */
    private ArrayList<C42846c> f109037a;

    /* renamed from: b */
    private Context f109038b;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f109037a.size();
    }

    /* renamed from: com.ss.android.lark.mail.impl.message.a.a$a */
    private class C42833a {

        /* renamed from: a */
        ImageView f109039a;

        /* renamed from: b */
        TextView f109040b;

        private C42833a() {
        }
    }

    /* renamed from: a */
    public C42846c getItem(int i) {
        return this.f109037a.get(i);
    }

    public C42831a(Context context, ArrayList<C42846c> arrayList) {
        this.f109038b = context;
        this.f109037a = arrayList;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f109038b).inflate(R.layout.mail_message_list_item_popmenu, (ViewGroup) null);
            C42833a aVar = new C42833a();
            aVar.f109039a = (ImageView) view.findViewById(R.id.menu_icon);
            aVar.f109040b = (TextView) view.findViewById(R.id.menu_text);
            view.setTag(aVar);
        } else if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        C42833a aVar2 = (C42833a) view.getTag();
        C42846c cVar = this.f109037a.get(i);
        aVar2.f109039a.setImageResource(cVar.mo153792b());
        aVar2.f109040b.setText(cVar.mo153793c());
        if (cVar.mo153795e()) {
            aVar2.f109040b.setTextColor(this.f109038b.getResources().getColor(R.color.text_title));
            aVar2.f109039a.setColorFilter(this.f109038b.getResources().getColor(R.color.icon_n1));
            view.setBackground(UIHelper.getDrawable(R.drawable.mail_general_box_radius_4));
            view.setBackgroundTintList(C0215a.m652a(this.f109038b, R.color.mail_pop_menu_more_background_tint_selector));
        } else {
            aVar2.f109040b.setTextColor(this.f109038b.getResources().getColor(R.color.text_disable));
            aVar2.f109039a.setColorFilter(this.f109038b.getResources().getColor(R.color.icon_disable));
            view.setBackground(null);
        }
        return view;
    }
}
