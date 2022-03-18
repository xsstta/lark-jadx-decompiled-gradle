package com.bytedance.ee.bear.sheet.panel;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.facade.common.C7667e;
import com.bytedance.ee.bear.sheet.common.SheetDragView;
import com.bytedance.ee.bear.sheet.panel.SheetItem;
import com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.sheet.panel.a */
public abstract class AbstractC11257a<T extends SheetItem> extends C7667e {

    /* renamed from: a */
    private TextView f30282a;

    /* renamed from: b */
    private T[] f30283b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo42707a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo43168a(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AbstractC11261b<T> mo42710b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo42711c();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo43172e() {
        T[] b = mo42710b().getSubItems(mo42711c()).mo5927b();
        if (b != null) {
            for (T t : b) {
                mo42710b().clearBadges(t.getId());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43165a(CharSequence charSequence) {
        TextView textView = this.f30282a;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: b */
    private void m46813b(T t) {
        View d = mo43171d(t.getId());
        if (d != null) {
            d.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46812b(View view) {
        mo30123c((int) R.anim.child_fragment_exit);
        mo42710b().clickItem("back", null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo43170c(String str) {
        T[] tArr = this.f30283b;
        if (tArr != null) {
            for (T t : tArr) {
                if (TextUtils.equals(str, t.id)) {
                    return t.isAdminLimit();
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public View mo43171d(String str) {
        if (getView() != null) {
            return getView().findViewWithTag(str);
        }
        return null;
    }

    /* renamed from: a */
    private void m46809a(View view) {
        SheetDragView sheetDragView = (SheetDragView) view.findViewById(R.id.fab_dragview);
        View findViewById = view.findViewById(R.id.title_bar_layout);
        if (sheetDragView != null && findViewById != null) {
            TextView textView = (TextView) findViewById.findViewById(R.id.title);
            this.f30282a = textView;
            textView.getPaint().setStyle(Paint.Style.FILL_AND_STROKE);
            this.f30282a.getPaint().setStrokeWidth(1.0f);
            sheetDragView.setSlideView(findViewById);
            findViewById.findViewById(R.id.back_icon).setOnClickListener(new View.OnClickListener() {
                /* class com.bytedance.ee.bear.sheet.panel.$$Lambda$a$f9c9zLlbIwha0VdBdGKK7vD4Bo */

                public final void onClick(View view) {
                    AbstractC11257a.this.m46812b((AbstractC11257a) view);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.ee.bear.sheet.panel.SheetItem[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m46815b(SheetItem[] sheetItemArr) {
        if (sheetItemArr == 0 || sheetItemArr.length == 0) {
            mo42707a();
            return;
        }
        mo43167a(sheetItemArr);
        this.f30283b = sheetItemArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo42708a(final T t) {
        final View d = mo43171d(t.getId());
        if (d != null) {
            d.setVisibility(0);
            if (d instanceof AbstractC11286a) {
                AbstractC11286a aVar = (AbstractC11286a) d;
                aVar.mo43222a(t);
                aVar.mo43223a(mo42710b().showBadges(t.getId()));
                aVar.setClickListener(new AbstractC11286a.AbstractC11287a() {
                    /* class com.bytedance.ee.bear.sheet.panel.$$Lambda$Dp7Tcf9a1C9nKJdRPjCg6kN9E */

                    @Override // com.bytedance.ee.bear.sheet.panel.panelcell.AbstractC11286a.AbstractC11287a
                    public final void clickItem(String str, String str2) {
                        AbstractC11257a.this.mo43166a(str, str2);
                    }
                });
                d.setSelected(t.isSelected());
                return;
            }
            d.setSelected(t.isSelected());
            mo43164a(d, t.isEnable());
            m46811a(t, d);
            m46814b(t, d);
            d.setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                /* class com.bytedance.ee.bear.sheet.panel.AbstractC11257a.C112581 */

                /* access modifiers changed from: protected */
                @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                /* renamed from: a */
                public void mo16698a(View view) {
                    d.setSelected(true);
                    AbstractC11257a.this.mo43166a(t.getId(), t.getValue());
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo43169b(String str) {
        T[] tArr = this.f30283b;
        if (tArr != null) {
            for (T t : tArr) {
                if (TextUtils.equals(str, t.id)) {
                    return t.isEnable();
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43167a(T[] tArr) {
        T[] tArr2 = this.f30283b;
        if (tArr2 != null) {
            for (T t : tArr2) {
                if (t != null) {
                    m46813b(t);
                }
            }
        }
        for (T t2 : tArr) {
            if (t2 != null) {
                mo42708a(t2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo43164a(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            m46810a((ViewGroup) view, z);
        }
    }

    /* renamed from: a */
    private void m46810a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            mo43164a(viewGroup.getChildAt(i), z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m46809a(view.getRootView());
        mo42710b().getSubItems(mo42711c()).mo5923a(this, new AbstractC1178x() {
            /* class com.bytedance.ee.bear.sheet.panel.$$Lambda$a$1p6PTbnDf140l0otNdFWDEvyUx8 */

            @Override // androidx.lifecycle.AbstractC1178x
            public final void onChanged(Object obj) {
                AbstractC11257a.this.m46815b((AbstractC11257a) ((SheetItem[]) obj));
            }
        });
    }

    /* renamed from: a */
    private void m46811a(T t, View view) {
        if (!TextUtils.isEmpty(t.getTitle())) {
            if (view instanceof TextView) {
                ((TextView) view).setText(t.getTitle());
            } else if (view instanceof ViewGroup) {
                View findViewWithTag = view.findViewWithTag("title");
                if (findViewWithTag instanceof TextView) {
                    ((TextView) findViewWithTag).setText(t.getTitle());
                }
            }
        }
    }

    /* renamed from: b */
    private void m46814b(T t, View view) {
        View findViewWithTag;
        int i;
        if ((view instanceof ViewGroup) && (findViewWithTag = view.findViewWithTag("badge_point")) != null) {
            if (mo42710b().showBadges(t.getId())) {
                i = 0;
            } else {
                i = 8;
            }
            findViewWithTag.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void mo43166a(String str, String str2) {
        mo42710b().clickItem(str, str2);
        if (mo43169b(str) && mo43168a(str)) {
            mo43172e();
        }
    }
}
