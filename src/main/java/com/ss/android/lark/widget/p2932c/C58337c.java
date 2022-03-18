package com.ss.android.lark.widget.p2932c;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.p2932c.C58339d;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.c.c */
public class C58337c extends BaseAdapter {

    /* renamed from: a */
    private Context f143527a;

    /* renamed from: b */
    private List<C58339d.C58341a> f143528b = new ArrayList();

    /* renamed from: c */
    private boolean f143529c;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        return this.f143528b.size();
    }

    /* renamed from: a */
    public void mo197562a(boolean z) {
        this.f143529c = z;
    }

    /* renamed from: a */
    public C58339d.C58341a getItem(int i) {
        return this.f143528b.get(i);
    }

    public C58337c(Context context, List<C58339d.C58341a> list) {
        this.f143527a = context;
        this.f143528b = list;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View a = getItem(i).mo197542a(this, this.f143527a, i, view, viewGroup);
        a.setOnHoverListener(new View.OnHoverListener() {
            /* class com.ss.android.lark.widget.p2932c.C58337c.View$OnHoverListenerC583381 */

            public boolean onHover(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 9) {
                    view.setHovered(true);
                } else if (action == 10) {
                    view.setHovered(false);
                }
                return false;
            }
        });
        if (this.f143529c) {
            if (getCount() == 1) {
                a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_bottom_item_selector));
            } else if (i == 0) {
                a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_center_item_selector));
            } else if (getCount() - 1 == i) {
                a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_bottom_item_selector));
            } else {
                a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_center_item_selector));
            }
        } else if (getCount() == 1) {
            a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_onlyone_item_selector));
        } else if (i == 0) {
            a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_top_item_selector));
        } else if (getCount() - 1 == i) {
            a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_bottom_item_selector));
        } else {
            a.setBackground(this.f143527a.getResources().getDrawable(R.drawable.dialog_list_center_item_selector));
        }
        return a;
    }
}
