package com.ss.android.lark.mail.impl.message.view;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.larksuite.component.universe_design.shadow.UDShadowLayout;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.message.p2201a.C42831a;
import com.ss.android.lark.mail.impl.message.p2203c.C42846c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.message.view.b */
public class C43187b {

    /* renamed from: d */
    private static int f109928d;

    /* renamed from: a */
    public BaseAdapter f109929a;

    /* renamed from: b */
    public AbstractC43190a f109930b;

    /* renamed from: c */
    public C43174a f109931c;

    /* renamed from: e */
    private TextView f109932e;

    /* renamed from: f */
    private Context f109933f;

    /* renamed from: g */
    private ArrayList<C42846c> f109934g = new ArrayList<>();

    /* renamed from: h */
    private ListView f109935h;

    /* renamed from: i */
    private int f109936i = -2;

    /* renamed from: com.ss.android.lark.mail.impl.message.view.b$a */
    public interface AbstractC43190a {
        /* renamed from: a */
        void mo152784a(View view, C42846c cVar, int i);
    }

    /* renamed from: b */
    public void mo154581b() {
        C43174a aVar = this.f109931c;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: a */
    public void mo154576a() {
        this.f109934g.clear();
    }

    /* renamed from: a */
    public void mo154578a(AbstractC43190a aVar) {
        this.f109930b = aVar;
    }

    public C43187b(Context context) {
        this.f109933f = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo154573a(Context context) {
        return LayoutInflater.from(context).inflate(R.layout.mail_message_list_layout_more_menu, (ViewGroup) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ListView mo154575a(View view) {
        return (ListView) view.findViewById(R.id.menu_listview);
    }

    /* renamed from: a */
    private int m171645a(C42846c cVar) {
        int i;
        int i2 = f109928d;
        if (i2 == 0) {
            int dimensionPixelSize = i2 + (this.f109933f.getResources().getDimensionPixelSize(R.dimen.mail_popup_menu_item_vertical_spacing) * 2);
            f109928d = dimensionPixelSize;
            int dimensionPixelSize2 = dimensionPixelSize + (this.f109933f.getResources().getDimensionPixelSize(R.dimen.mail_message_list_more_menu_padding) * 2);
            f109928d = dimensionPixelSize2;
            int dimensionPixelSize3 = dimensionPixelSize2 + this.f109933f.getResources().getDimensionPixelSize(R.dimen.mail_popup_menu_item_icon_size);
            f109928d = dimensionPixelSize3;
            f109928d = dimensionPixelSize3 + this.f109933f.getResources().getDimensionPixelSize(R.dimen.mail_popup_menu_item_space_between_icon_and_text);
        }
        if (this.f109932e == null) {
            this.f109932e = (TextView) LayoutInflater.from(this.f109933f).inflate(R.layout.mail_message_list_item_popmenu, (ViewGroup) null).findViewById(R.id.menu_text);
        }
        if (TextUtils.isEmpty(cVar.f109079c)) {
            i = 0;
        } else {
            i = (int) this.f109932e.getPaint().measureText(cVar.f109079c);
        }
        return f109928d + i;
    }

    /* renamed from: a */
    public void mo154579a(List<C42846c> list) {
        this.f109934g.clear();
        if (!CollectionUtils.isEmpty(list)) {
            int i = 0;
            for (C42846c cVar : list) {
                this.f109934g.add(cVar);
                int a = m171645a(cVar);
                if (a > i) {
                    i = a;
                }
            }
            this.f109936i = i;
            ListView listView = this.f109935h;
            if (listView != null) {
                UDShadowLayout.LayoutParams layoutParams = (UDShadowLayout.LayoutParams) listView.getLayoutParams();
                layoutParams.width = i;
                this.f109935h.setLayoutParams(layoutParams);
                this.f109929a.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: a */
    public void mo154580a(boolean z) {
        for (int i = 0; i < this.f109934g.size(); i++) {
            C42846c cVar = this.f109934g.get(i);
            if (cVar == null || !(cVar.mo153790a() == 5 || cVar.mo153790a() == 6 || cVar.mo153790a() == 8)) {
                cVar.mo153791a(true);
            } else {
                cVar.mo153791a(true ^ z);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public BaseAdapter mo154574a(Context context, ArrayList<C42846c> arrayList) {
        return new C42831a(context, arrayList);
    }

    /* renamed from: a */
    public void mo154577a(View view, int i) {
        if (this.f109931c == null) {
            View a = mo154573a(this.f109933f);
            a.setFocusableInTouchMode(true);
            this.f109929a = mo154574a(this.f109933f, this.f109934g);
            ListView a2 = mo154575a(a);
            this.f109935h = a2;
            a2.getLayoutParams().width = this.f109936i;
            this.f109935h.setAdapter((ListAdapter) this.f109929a);
            this.f109935h.setDividerHeight(0);
            this.f109935h.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                /* class com.ss.android.lark.mail.impl.message.view.C43187b.C431881 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    C42846c cVar = (C42846c) C43187b.this.f109929a.getItem(i);
                    if (cVar.mo153795e()) {
                        if (C43187b.this.f109930b != null) {
                            C43187b.this.f109930b.mo152784a(view, cVar, i);
                        }
                        cVar.mo153794d();
                        C43187b.this.f109931c.dismiss();
                    }
                }
            });
            a.setOnKeyListener(new View.OnKeyListener() {
                /* class com.ss.android.lark.mail.impl.message.view.C43187b.View$OnKeyListenerC431892 */

                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if ((i != 82 && i != 4) || !C43187b.this.f109931c.isShowing()) {
                        return false;
                    }
                    C43187b.this.f109931c.dismiss();
                    return true;
                }
            });
            this.f109931c = new C43174a(this.f109933f, a, -2, -2, true);
        }
        this.f109931c.showAsDropDown(view, 0, i);
    }
}
