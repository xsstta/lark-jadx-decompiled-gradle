package com.ss.android.lark.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.widget.flowlayout.AbstractC58467a;
import java.util.HashSet;
import java.util.Set;

public class TagFlowLayout extends FlowLayout implements AbstractC58467a.AbstractC58468a {

    /* renamed from: f */
    private AbstractC58467a f144005f;

    /* renamed from: g */
    private boolean f144006g;

    /* renamed from: h */
    private int f144007h;

    /* renamed from: i */
    private MotionEvent f144008i;

    /* renamed from: j */
    private Set<Integer> f144009j;

    /* renamed from: k */
    private AbstractC58465a f144010k;

    /* renamed from: l */
    private AbstractC58466b f144011l;

    /* renamed from: com.ss.android.lark.widget.flowlayout.TagFlowLayout$a */
    public interface AbstractC58465a {
        /* renamed from: a */
        void mo197956a(Set<Integer> set);
    }

    /* renamed from: com.ss.android.lark.widget.flowlayout.TagFlowLayout$b */
    public interface AbstractC58466b {
        /* renamed from: a */
        boolean mo197957a(View view, int i, FlowLayout flowLayout);
    }

    public AbstractC58467a getAdapter() {
        return this.f144005f;
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.f144009j);
    }

    public boolean performClick() {
        MotionEvent motionEvent = this.f144008i;
        if (motionEvent == null) {
            return super.performClick();
        }
        this.f144008i = null;
        C58469b a = m226679a((int) motionEvent.getX(), (int) this.f144008i.getY());
        int a2 = m226678a(a);
        if (a == null) {
            return true;
        }
        m226681a(a, a2);
        AbstractC58466b bVar = this.f144011l;
        if (bVar != null) {
            return bVar.mo197957a(a.getTagView(), a2, this);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        String str = "";
        if (this.f144009j.size() > 0) {
            for (Integer num : this.f144009j) {
                str = str + num.intValue() + "|";
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString("key_choose_pos", str);
        return bundle;
    }

    /* renamed from: a */
    private void m226680a() {
        removeAllViews();
        AbstractC58467a aVar = this.f144005f;
        HashSet<Integer> a = aVar.mo197960a();
        for (int i = 0; i < aVar.mo197963b(); i++) {
            View a2 = aVar.mo197958a(this, i, aVar.mo197959a(i));
            C58469b bVar = new C58469b(getContext());
            a2.setDuplicateParentStateEnabled(true);
            if (a2.getLayoutParams() != null) {
                bVar.setLayoutParams(a2.getLayoutParams());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(m226677a(getContext(), 5.0f), m226677a(getContext(), 5.0f), m226677a(getContext(), 5.0f), m226677a(getContext(), 5.0f));
                bVar.setLayoutParams(marginLayoutParams);
            }
            bVar.addView(a2);
            addView(bVar);
            if (a.contains(Integer.valueOf(i))) {
                bVar.setChecked(true);
            }
            if (this.f144005f.mo197962a(i, aVar.mo197959a(i))) {
                this.f144009j.add(Integer.valueOf(i));
                bVar.setChecked(true);
            }
        }
        this.f144009j.addAll(a);
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public void setAdapter(AbstractC58467a aVar) {
        this.f144005f = aVar;
        aVar.mo197961a(this);
        this.f144009j.clear();
        m226680a();
    }

    public void setOnSelectListener(AbstractC58465a aVar) {
        this.f144010k = aVar;
        if (aVar != null) {
            setClickable(true);
        }
    }

    public void setOnTagClickListener(AbstractC58466b bVar) {
        this.f144011l = bVar;
        if (bVar != null) {
            setClickable(true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f144008i = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private int m226678a(View view) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public void setMaxSelectCount(int i) {
        if (this.f144009j.size() > i) {
            Log.m165397w("TagFlowLayout", "you has already select more than " + i + " views , so it will be clear .");
            this.f144009j.clear();
        }
        this.f144007h = i;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("\\|")) {
                    int parseInt = Integer.parseInt(str);
                    this.f144009j.add(Integer.valueOf(parseInt));
                    C58469b bVar = (C58469b) getChildAt(parseInt);
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
    public static int m226677a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.flowlayout.FlowLayout
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C58469b bVar = (C58469b) getChildAt(i3);
            if (bVar.getVisibility() != 8 && bVar.getTagView().getVisibility() == 8) {
                bVar.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private C58469b m226679a(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C58469b bVar = (C58469b) getChildAt(i3);
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
    private void m226681a(C58469b bVar, int i) {
        if (this.f144006g) {
            if (bVar.isChecked()) {
                bVar.setChecked(false);
                this.f144009j.remove(Integer.valueOf(i));
            } else if (this.f144007h == 1 && this.f144009j.size() == 1) {
                Integer next = this.f144009j.iterator().next();
                ((C58469b) getChildAt(next.intValue())).setChecked(false);
                bVar.setChecked(true);
                this.f144009j.remove(next);
                this.f144009j.add(Integer.valueOf(i));
            } else if (this.f144007h <= 0 || this.f144009j.size() < this.f144007h) {
                bVar.setChecked(true);
                this.f144009j.add(Integer.valueOf(i));
            } else {
                return;
            }
            AbstractC58465a aVar = this.f144010k;
            if (aVar != null) {
                aVar.mo197956a(new HashSet(this.f144009j));
            }
        }
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f144006g = true;
        this.f144007h = -1;
        this.f144009j = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.auto_select_effect, R.attr.gravity, R.attr.marginOutside, R.attr.maxLines, R.attr.max_select, R.attr.paddingBottom, R.attr.paddingEnd, R.attr.paddingStart, R.attr.paddingTop, R.attr.rowSpacing, R.attr.textColor, R.attr.textSize});
        this.f144006g = obtainStyledAttributes.getBoolean(0, true);
        this.f144007h = obtainStyledAttributes.getInt(4, -1);
        obtainStyledAttributes.recycle();
        if (this.f144006g) {
            setClickable(true);
        }
    }
}
