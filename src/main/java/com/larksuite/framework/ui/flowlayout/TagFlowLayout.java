package com.larksuite.framework.ui.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.framework.ui.flowlayout.AbstractC26225a;
import com.larksuite.suite.R;
import java.util.HashSet;
import java.util.Set;

public class TagFlowLayout extends FlowLayout implements AbstractC26225a.AbstractC26226a {

    /* renamed from: f */
    private AbstractC26225a f64764f;

    /* renamed from: g */
    private boolean f64765g;

    /* renamed from: h */
    private int f64766h;

    /* renamed from: i */
    private MotionEvent f64767i;

    /* renamed from: j */
    private Set<Integer> f64768j;

    /* renamed from: k */
    private AbstractC26223a f64769k;

    /* renamed from: l */
    private AbstractC26224b f64770l;

    /* renamed from: com.larksuite.framework.ui.flowlayout.TagFlowLayout$a */
    public interface AbstractC26223a {
        /* renamed from: a */
        void mo93288a(Set<Integer> set);
    }

    /* renamed from: com.larksuite.framework.ui.flowlayout.TagFlowLayout$b */
    public interface AbstractC26224b {
        /* renamed from: a */
        boolean mo93289a(View view, int i, FlowLayout flowLayout);
    }

    public AbstractC26225a getAdapter() {
        return this.f64764f;
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.f64768j);
    }

    @Override // com.larksuite.framework.ui.flowlayout.AbstractC26225a.AbstractC26226a
    /* renamed from: a */
    public void mo93277a() {
        this.f64768j.clear();
        m94842b();
    }

    public boolean performClick() {
        MotionEvent motionEvent = this.f64767i;
        if (motionEvent == null) {
            return super.performClick();
        }
        this.f64767i = null;
        C26227b a = m94840a((int) motionEvent.getX(), (int) this.f64767i.getY());
        int a2 = m94839a(a);
        if (a == null) {
            return true;
        }
        m94841a(a, a2);
        AbstractC26224b bVar = this.f64770l;
        if (bVar != null) {
            return bVar.mo93289a(a.getTagView(), a2, this);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        String str = "";
        if (this.f64768j.size() > 0) {
            for (Integer num : this.f64768j) {
                str = str + num.intValue() + "|";
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString("key_choose_pos", str);
        return bundle;
    }

    /* renamed from: b */
    private void m94842b() {
        removeAllViews();
        AbstractC26225a aVar = this.f64764f;
        HashSet<Integer> a = aVar.mo93292a();
        for (int i = 0; i < aVar.mo93295b(); i++) {
            View a2 = aVar.mo93290a(this, i, aVar.mo93291a(i));
            C26227b bVar = new C26227b(getContext());
            a2.setDuplicateParentStateEnabled(true);
            if (a2.getLayoutParams() == null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(m94838a(getContext(), 5.0f), m94838a(getContext(), 5.0f), m94838a(getContext(), 5.0f), m94838a(getContext(), 5.0f));
                bVar.setLayoutParams(marginLayoutParams);
            }
            bVar.addView(a2);
            addView(bVar);
            if (a.contains(Integer.valueOf(i))) {
                bVar.setChecked(true);
            }
            if (this.f64764f.mo93294a(i, aVar.mo93291a(i))) {
                this.f64768j.add(Integer.valueOf(i));
                bVar.setChecked(true);
            }
        }
        this.f64768j.addAll(a);
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public void setAdapter(AbstractC26225a aVar) {
        this.f64764f = aVar;
        aVar.mo93293a(this);
        this.f64768j.clear();
        m94842b();
    }

    public void setOnSelectListener(AbstractC26223a aVar) {
        this.f64769k = aVar;
        if (aVar != null) {
            setClickable(true);
        }
    }

    public void setOnTagClickListener(AbstractC26224b bVar) {
        this.f64770l = bVar;
        if (bVar != null) {
            setClickable(true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f64767i = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private int m94839a(View view) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public void setMaxSelectCount(int i) {
        if (this.f64768j.size() > i) {
            Log.w("TagFlowLayout", "you has already select more than " + i + " views , so it will be clear .");
            this.f64768j.clear();
        }
        this.f64766h = i;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("\\|")) {
                    int parseInt = Integer.parseInt(str);
                    this.f64768j.add(Integer.valueOf(parseInt));
                    C26227b bVar = (C26227b) getChildAt(parseInt);
                    if (bVar != null) {
                        bVar.setChecked(true);
                    }
                }
            }
            super.onRestoreInstanceState(bundle.getParcelable("key_default"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public static int m94838a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.framework.ui.flowlayout.FlowLayout
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C26227b bVar = (C26227b) getChildAt(i3);
            if (bVar.getVisibility() != 8 && bVar.getTagView().getVisibility() == 8) {
                bVar.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private C26227b m94840a(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C26227b bVar = (C26227b) getChildAt(i3);
            if (bVar.getVisibility() != 8) {
                Rect rect = new Rect();
                bVar.getHitRect(rect);
                if (rect.contains(i, i2)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m94841a(C26227b bVar, int i) {
        if (this.f64765g) {
            if (bVar.isChecked()) {
                bVar.setChecked(false);
                this.f64768j.remove(Integer.valueOf(i));
            } else if (this.f64766h == 1 && this.f64768j.size() == 1) {
                Integer next = this.f64768j.iterator().next();
                ((C26227b) getChildAt(next.intValue())).setChecked(false);
                bVar.setChecked(true);
                this.f64768j.remove(next);
                this.f64768j.add(Integer.valueOf(i));
            } else if (this.f64766h <= 0 || this.f64768j.size() < this.f64766h) {
                bVar.setChecked(true);
                this.f64768j.add(Integer.valueOf(i));
            } else {
                return;
            }
            AbstractC26223a aVar = this.f64769k;
            if (aVar != null) {
                aVar.mo93288a(new HashSet(this.f64768j));
            }
        }
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f64765g = true;
        this.f64766h = -1;
        this.f64768j = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.auto_select_effect, R.attr.gravity, R.attr.marginOutside, R.attr.maxLines, R.attr.max_select, R.attr.paddingBottom, R.attr.paddingEnd, R.attr.paddingStart, R.attr.paddingTop, R.attr.rowSpacing, R.attr.textColor, R.attr.textSize});
        this.f64765g = obtainStyledAttributes.getBoolean(0, true);
        this.f64766h = obtainStyledAttributes.getInt(4, -1);
        obtainStyledAttributes.recycle();
        if (this.f64765g) {
            setClickable(true);
        }
    }
}
