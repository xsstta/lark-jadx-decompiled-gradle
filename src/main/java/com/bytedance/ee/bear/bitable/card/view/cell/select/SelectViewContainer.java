package com.bytedance.ee.bear.bitable.card.view.cell.select;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ee.bear.bitable.card.view.cell.select.AbstractC4652f;
import com.bytedance.ee.bear.widgets.FlowLayout;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import com.scwang.smartrefresh.layout.p1237d.C27144b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SelectViewContainer extends FlowLayout implements AbstractC4652f.AbstractC4653a {

    /* renamed from: a */
    private List<C4654g> f13699a;

    /* renamed from: b */
    protected AbstractC4652f f13700b;

    /* renamed from: c */
    protected int f13701c;

    /* renamed from: d */
    protected List<C4676k> f13702d;

    /* renamed from: e */
    public AbstractC4637b f13703e;

    /* renamed from: i */
    private C4676k f13704i;

    /* renamed from: j */
    private AbstractC4636a f13705j;

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.SelectViewContainer$a */
    public interface AbstractC4636a {
        /* renamed from: a */
        void mo18246a(List<Integer> list);
    }

    /* renamed from: com.bytedance.ee.bear.bitable.card.view.cell.select.SelectViewContainer$b */
    public interface AbstractC4637b {
        /* renamed from: a */
        boolean mo18247a(View view, int i, FlowLayout flowLayout);
    }

    public AbstractC4652f getAdapter() {
        return this.f13700b;
    }

    /* access modifiers changed from: protected */
    public AbstractC4652f getSelectAdapter() {
        return this.f13700b;
    }

    public List<Integer> getSelectedList() {
        ArrayList arrayList = new ArrayList(this.f13702d.size());
        for (C4676k kVar : this.f13702d) {
            arrayList.add(Integer.valueOf(kVar.mo18330a()));
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        String str = "";
        if (this.f13702d.size() > 0) {
            Iterator<C4676k> it = this.f13702d.iterator();
            while (it.hasNext()) {
                str = str + it.next().mo18330a() + "|";
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString("key_choose_pos", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18233a() {
        removeAllViews();
        AbstractC4652f fVar = this.f13700b;
        this.f13699a = new ArrayList();
        List<Integer> a = this.f13700b.mo18287a();
        ArrayList arrayList = new ArrayList(a.size());
        for (Integer num : a) {
            arrayList.add(new C4676k(num.intValue()));
        }
        for (final int i = 0; i < fVar.mo18291b(); i++) {
            View a2 = fVar.mo18222a(this, i, fVar.mo18286a(i));
            final C4654g gVar = new C4654g(getContext());
            a2.setDuplicateParentStateEnabled(true);
            if (a2.getLayoutParams() != null) {
                gVar.setLayoutParams(a2.getLayoutParams());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(C27144b.m98678a(5.0f), C27144b.m98678a(5.0f), C27144b.m98678a(5.0f), C27144b.m98678a(5.0f));
                gVar.setLayoutParams(marginLayoutParams);
            }
            a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            gVar.addView(a2);
            addView(gVar);
            if (a.contains(Integer.valueOf(i))) {
                m19260a(i, gVar);
            }
            if (this.f13700b.mo18290a(i, fVar.mo18286a(i))) {
                m19260a(i, gVar);
            }
            a2.setClickable(false);
            gVar.setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.bitable.card.view.cell.select.SelectViewContainer.View$OnClickListenerC46351 */

                public void onClick(View view) {
                    SelectViewContainer.this.mo18234a(gVar, i);
                    if (SelectViewContainer.this.f13703e != null) {
                        SelectViewContainer.this.f13703e.mo18247a(gVar, i, SelectViewContainer.this);
                    }
                }
            });
            this.f13699a.add(gVar);
        }
        this.f13702d.addAll(arrayList);
    }

    public void setOnSelectListener(AbstractC4636a aVar) {
        this.f13705j = aVar;
    }

    public void setOnTagClickListener(AbstractC4637b bVar) {
        this.f13703e = bVar;
    }

    public SelectViewContainer(Context context) {
        this(context, null);
    }

    public void setCanSelected(boolean z) {
        List<C4654g> list = this.f13699a;
        if (list != null && list.size() > 0) {
            if (z) {
                for (C4654g gVar : this.f13699a) {
                    gVar.setClickable(true);
                }
                return;
            }
            for (C4654g gVar2 : this.f13699a) {
                gVar2.setClickable(false);
            }
        }
    }

    public void setMaxSelectCount(int i) {
        if (this.f13702d.size() > i) {
            C13479a.m54775e("SelectViewContainer", "you has already select more than " + i + " views , so it will be clear .");
            this.f13702d.clear();
        }
        this.f13701c = i;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("\\|")) {
                    int parseInt = Integer.parseInt(str);
                    this.f13704i.mo18331a(parseInt);
                    this.f13702d.add(this.f13704i);
                    C4654g gVar = (C4654g) getChildAt(parseInt);
                    if (gVar != null) {
                        m19260a(parseInt, gVar);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public SelectViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m19260a(int i, C4654g gVar) {
        gVar.setChecked(true);
        this.f13700b.mo18288a(i, gVar.getSelectChildView());
    }

    /* renamed from: b */
    private void m19262b(int i, C4654g gVar) {
        gVar.setChecked(false);
        this.f13700b.mo18292b(i, gVar.getSelectChildView());
    }

    /* renamed from: a */
    private void m19261a(Context context, AttributeSet attributeSet) {
        setFocusable(true);
        setFocusableInTouchMode(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.max_select, R.attr.tag_gravity});
        this.f13701c = obtainStyledAttributes.getInt(0, -1);
        obtainStyledAttributes.recycle();
        this.f13704i = new C4676k();
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ee.bear.widgets.FlowLayout
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C4654g gVar = (C4654g) getChildAt(i3);
            if (gVar.getVisibility() != 8 && gVar.getSelectChildView().getVisibility() == 8) {
                gVar.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public void mo18234a(C4654g gVar, int i) {
        if (gVar.isChecked()) {
            m19262b(i, gVar);
            this.f13704i.mo18331a(i);
            this.f13702d.remove(this.f13704i);
        } else if (this.f13701c == 1 && this.f13702d.size() == 1) {
            C4676k next = this.f13702d.iterator().next();
            m19262b(next.mo18330a(), (C4654g) getChildAt(next.mo18330a()));
            m19260a(i, gVar);
            this.f13702d.remove(next);
            this.f13702d.add(new C4676k(i));
        } else if (this.f13701c <= 0 || this.f13702d.size() < this.f13701c) {
            m19260a(i, gVar);
            this.f13702d.add(new C4676k(i));
        } else {
            return;
        }
        AbstractC4636a aVar = this.f13705j;
        if (aVar != null) {
            aVar.mo18246a(getSelectedList());
        }
    }

    public SelectViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13701c = -1;
        this.f13702d = new ArrayList();
        m19261a(context, attributeSet);
    }
}
