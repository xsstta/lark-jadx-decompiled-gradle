package com.ss.android.lark.reaction.widget.flowlayout;

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
import com.ss.android.lark.reaction.widget.flowlayout.AbstractC53059a;
import java.util.HashSet;
import java.util.Set;

public class TagFlowLayout extends FlowLayout implements AbstractC53059a.AbstractC53060a {

    /* renamed from: f */
    private AbstractC53059a f131123f;

    /* renamed from: g */
    private boolean f131124g;

    /* renamed from: h */
    private int f131125h;

    /* renamed from: i */
    private MotionEvent f131126i;

    /* renamed from: j */
    private Set<Integer> f131127j;

    /* renamed from: k */
    private AbstractC53057a f131128k;

    /* renamed from: l */
    private AbstractC53058b f131129l;

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.TagFlowLayout$a */
    public interface AbstractC53057a {
        /* renamed from: a */
        void mo181223a(Set<Integer> set);
    }

    /* renamed from: com.ss.android.lark.reaction.widget.flowlayout.TagFlowLayout$b */
    public interface AbstractC53058b {
        /* renamed from: a */
        boolean mo181224a(View view, int i, FlowLayout flowLayout);
    }

    public AbstractC53059a getAdapter() {
        return this.f131123f;
    }

    public Set<Integer> getSelectedList() {
        return new HashSet(this.f131127j);
    }

    public boolean performClick() {
        MotionEvent motionEvent = this.f131126i;
        if (motionEvent == null) {
            return super.performClick();
        }
        this.f131126i = null;
        C53063b a = m205407a((int) motionEvent.getX(), (int) this.f131126i.getY());
        int a2 = m205406a(a);
        if (a == null) {
            return true;
        }
        m205409a(a, a2);
        AbstractC53058b bVar = this.f131129l;
        if (bVar != null) {
            return bVar.mo181224a(a.getTagView(), a2, this);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_default", super.onSaveInstanceState());
        String str = "";
        if (this.f131127j.size() > 0) {
            for (Integer num : this.f131127j) {
                str = str + num.intValue() + "|";
            }
            str = str.substring(0, str.length() - 1);
        }
        bundle.putString("key_choose_pos", str);
        return bundle;
    }

    /* renamed from: a */
    private void m205408a() {
        removeAllViews();
        AbstractC53059a aVar = this.f131123f;
        HashSet<Integer> a = aVar.mo181226a();
        for (int i = 0; i < aVar.mo181229b(); i++) {
            View a2 = aVar.mo181205a(this, i, aVar.mo181225a(i));
            C53063b bVar = new C53063b(getContext());
            a2.setDuplicateParentStateEnabled(true);
            if (a2.getLayoutParams() != null) {
                bVar.setLayoutParams(a2.getLayoutParams());
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(m205405a(getContext(), 5.0f), m205405a(getContext(), 5.0f), m205405a(getContext(), 5.0f), m205405a(getContext(), 5.0f));
                bVar.setLayoutParams(marginLayoutParams);
            }
            bVar.addView(a2);
            addView(bVar);
            if (a.contains(Integer.valueOf(i))) {
                bVar.setChecked(true);
            }
            if (this.f131123f.mo181228a(i, aVar.mo181225a(i))) {
                this.f131127j.add(Integer.valueOf(i));
                bVar.setChecked(true);
            }
        }
        this.f131127j.addAll(a);
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    public void setAdapter(AbstractC53059a aVar) {
        this.f131123f = aVar;
        aVar.mo181227a(this);
        this.f131127j.clear();
        m205408a();
    }

    public void setOnSelectListener(AbstractC53057a aVar) {
        this.f131128k = aVar;
        if (aVar != null) {
            setClickable(true);
        }
    }

    public void setOnTagClickListener(AbstractC53058b bVar) {
        this.f131129l = bVar;
        if (bVar != null) {
            setClickable(true);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.f131126i = MotionEvent.obtain(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private int m205406a(View view) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    public void setMaxSelectCount(int i) {
        if (this.f131127j.size() > i) {
            Log.m165397w("TagFlowLayout", "you has already select more than " + i + " views , so it will be clear .");
            this.f131127j.clear();
        }
        this.f131125h = i;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            String string = bundle.getString("key_choose_pos");
            if (!TextUtils.isEmpty(string)) {
                for (String str : string.split("\\|")) {
                    int parseInt = Integer.parseInt(str);
                    this.f131127j.add(Integer.valueOf(parseInt));
                    C53063b bVar = (C53063b) getChildAt(parseInt);
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
    public static int m205405a(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.reaction.widget.flowlayout.FlowLayout
    public void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C53063b bVar = (C53063b) getChildAt(i3);
            if (bVar.getVisibility() != 8 && bVar.getTagView().getVisibility() == 8) {
                bVar.setVisibility(8);
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    private C53063b m205407a(int i, int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            C53063b bVar = (C53063b) getChildAt(i3);
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
    private void m205409a(C53063b bVar, int i) {
        if (this.f131124g) {
            if (bVar.isChecked()) {
                bVar.setChecked(false);
                this.f131127j.remove(Integer.valueOf(i));
            } else if (this.f131125h == 1 && this.f131127j.size() == 1) {
                Integer next = this.f131127j.iterator().next();
                ((C53063b) getChildAt(next.intValue())).setChecked(false);
                bVar.setChecked(true);
                this.f131127j.remove(next);
                this.f131127j.add(Integer.valueOf(i));
            } else if (this.f131125h <= 0 || this.f131127j.size() < this.f131125h) {
                bVar.setChecked(true);
                this.f131127j.add(Integer.valueOf(i));
            } else {
                return;
            }
            AbstractC53057a aVar = this.f131128k;
            if (aVar != null) {
                aVar.mo181223a(new HashSet(this.f131127j));
            }
        }
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f131124g = true;
        this.f131125h = -1;
        this.f131127j = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.reaction_auto_select_effect, R.attr.reaction_gravity, R.attr.reaction_max_select});
        this.f131124g = obtainStyledAttributes.getBoolean(0, true);
        this.f131125h = obtainStyledAttributes.getInt(2, -1);
        obtainStyledAttributes.recycle();
        if (this.f131124g) {
            setClickable(true);
        }
    }
}
