package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C0844e;
import androidx.core.view.C0859a;
import androidx.core.view.ViewCompat;
import androidx.core.view.p029a.C0864d;
import com.larksuite.suite.R;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a */
    private final Calendar f54317a;

    /* renamed from: a */
    public C22256i getAdapter() {
        return (C22256i) super.getAdapter();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* renamed from: a */
    private static int m80407a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo77416a()) {
            super.setSelection(getAdapter().mo77416a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C22256i) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C22256i.class.getCanonicalName()));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C22256i a = getAdapter();
        DateSelector<?> dateSelector = a.f54428c;
        C22237b bVar = a.f54429d;
        Long a2 = a.getItem(a.mo77416a());
        Long a3 = a.getItem(a.mo77419b());
        for (C0844e<Long, Long> eVar : dateSelector.mo77321d()) {
            if (eVar.f3317a != null) {
                if (eVar.f3318b == null) {
                    continue;
                } else {
                    long longValue = eVar.f3317a.longValue();
                    long longValue2 = eVar.f3318b.longValue();
                    if (!m80409a(a2, a3, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < a2.longValue()) {
                            i2 = a.mo77416a();
                            if (a.mo77423e(i2)) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f54317a.setTimeInMillis(longValue);
                            i2 = a.mo77421c(materialCalendarGridView.f54317a.get(5));
                            i = m80407a(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > a3.longValue()) {
                            i4 = Math.min(a.mo77419b(), getChildCount() - 1);
                            if (a.mo77424f(i4)) {
                                i3 = getWidth();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            }
                        } else {
                            materialCalendarGridView.f54317a.setTimeInMillis(longValue2);
                            i4 = a.mo77421c(materialCalendarGridView.f54317a.get(5));
                            i3 = m80407a(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) a.getItemId(i2);
                        int itemId2 = (int) a.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top = childAt.getTop() + bVar.f54373a.mo77391a();
                            int bottom = childAt.getBottom() - bVar.f54373a.mo77393b();
                            if (numColumns > i2) {
                                i5 = 0;
                            } else {
                                i5 = i;
                            }
                            if (i4 > numColumns2) {
                                i6 = getWidth();
                            } else {
                                i6 = i3;
                            }
                            canvas.drawRect((float) i5, (float) top, (float) i6, (float) bottom, bVar.f54380h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m80408a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo77419b());
        } else if (i == 130) {
            setSelection(getAdapter().mo77416a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo77416a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo77416a());
        return true;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m80408a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54317a = C22265o.m80550c();
        if (MaterialDatePicker.m80412a(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        ViewCompat.m4043a(this, new C0859a() {
            /* class com.google.android.material.datepicker.MaterialCalendarGridView.C222251 */

            @Override // androidx.core.view.C0859a
            /* renamed from: a */
            public void mo4535a(View view, C0864d dVar) {
                super.mo4535a(view, dVar);
                dVar.mo4559a((Object) null);
            }
        });
    }

    /* renamed from: a */
    private static boolean m80409a(Long l, Long l2, Long l3, Long l4) {
        if (l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue()) {
            return true;
        }
        return false;
    }
}
