package com.bytedance.ee.bear.search.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ee.bear.search.model.SearchHistoryResponse;
import com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class TagFlowLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC10895b f29332a;

    /* renamed from: b */
    private List<SearchHistoryResponse.SearchHistory> f29333b;

    /* renamed from: c */
    private List<C10894a> f29334c;

    /* renamed from: d */
    private int f29335d;

    /* renamed from: e */
    private int f29336e;

    /* renamed from: f */
    private int f29337f;

    /* renamed from: g */
    private int f29338g;

    /* renamed from: h */
    private int f29339h;

    /* renamed from: i */
    private int f29340i;

    /* renamed from: j */
    private int f29341j;

    /* renamed from: k */
    private int f29342k;

    /* renamed from: l */
    private int f29343l;

    /* renamed from: m */
    private int f29344m;

    /* renamed from: n */
    private int f29345n;

    /* renamed from: o */
    private TextPaint f29346o;

    /* renamed from: com.bytedance.ee.bear.search.widget.TagFlowLayout$b */
    public interface AbstractC10895b {
        void onItemClick(SearchHistoryResponse.SearchHistory searchHistory);
    }

    /* renamed from: a */
    private void m45311a() {
        if (this.f29333b.size() == 0) {
            setVisibility(8);
            return;
        }
        this.f29334c.clear();
        for (SearchHistoryResponse.SearchHistory searchHistory : this.f29333b) {
            TextView textView = new TextView(getContext());
            textView.setText(searchHistory.getQuery());
            textView.setTextSize(0, (float) this.f29344m);
            textView.setPadding(this.f29337f, this.f29339h, this.f29338g, this.f29340i);
            textView.setGravity(17);
            textView.setBackgroundResource(R.drawable.widget_flowl_layout_item_bg);
            textView.setTextColor(this.f29345n);
            textView.setIncludeFontPadding(false);
            textView.setMaxLines(1);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(0, 0);
            marginLayoutParams.width = m45310a(textView.getPaint(), searchHistory.getQuery()) + this.f29337f + this.f29338g;
            marginLayoutParams.height = m45309a(textView.getPaint()) + this.f29339h + this.f29340i;
            textView.setLayoutParams(marginLayoutParams);
            C10894a aVar = new C10894a();
            aVar.f29351d = textView;
            aVar.f29348a = marginLayoutParams.width;
            aVar.f29349b = marginLayoutParams.height;
            aVar.f29352e = searchHistory;
            this.f29334c.add(aVar);
        }
    }

    public void setItemLickListener(AbstractC10895b bVar) {
        this.f29332a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.search.widget.TagFlowLayout$a */
    public class C10894a {

        /* renamed from: a */
        int f29348a;

        /* renamed from: b */
        int f29349b;

        /* renamed from: c */
        boolean f29350c;

        /* renamed from: d */
        TextView f29351d;

        /* renamed from: e */
        SearchHistoryResponse.SearchHistory f29352e;

        C10894a() {
        }
    }

    public TagFlowLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m45309a(Paint paint) {
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return (int) (fontMetrics.descent - fontMetrics.ascent);
    }

    public void setData(List<SearchHistoryResponse.SearchHistory> list) {
        this.f29333b.clear();
        this.f29333b.addAll(list);
        m45311a();
        invalidate();
        requestLayout();
    }

    /* renamed from: a */
    private void m45312a(AttributeSet attributeSet) {
        this.f29333b = new ArrayList();
        this.f29334c = new ArrayList();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.auto_select_effect, R.attr.gravity, R.attr.marginOutside, R.attr.maxLines, R.attr.max_select, R.attr.paddingBottom, R.attr.paddingEnd, R.attr.paddingStart, R.attr.paddingTop, R.attr.rowSpacing, R.attr.textColor, R.attr.textSize}, 0, 0);
        this.f29337f = obtainStyledAttributes.getDimensionPixelSize(7, C13749l.m55738a(16));
        this.f29338g = obtainStyledAttributes.getDimensionPixelSize(6, C13749l.m55738a(16));
        this.f29339h = obtainStyledAttributes.getDimensionPixelSize(8, C13749l.m55738a(4));
        this.f29340i = obtainStyledAttributes.getDimensionPixelSize(5, C13749l.m55738a(4));
        this.f29341j = obtainStyledAttributes.getDimensionPixelSize(2, C13749l.m55738a(12));
        this.f29342k = obtainStyledAttributes.getDimensionPixelSize(9, C13749l.m55738a(12));
        this.f29343l = obtainStyledAttributes.getInt(3, 0);
        this.f29344m = obtainStyledAttributes.getDimensionPixelSize(11, getResources().getDimensionPixelSize(R.dimen.space_kit_txt2));
        this.f29345n = obtainStyledAttributes.getColor(10, getResources().getColor(R.color.space_kit_n900));
        obtainStyledAttributes.recycle();
        int i = this.f29343l;
        if (i == 0) {
            i = this.f29333b.size();
        }
        this.f29343l = i;
        TextPaint textPaint = new TextPaint();
        this.f29346o = textPaint;
        textPaint.setTextSize((float) this.f29344m);
    }

    /* renamed from: a */
    private int m45310a(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        if (this.f29334c.size() == 0) {
            setVisibility(8);
            return;
        }
        this.f29335d = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        int a = m45309a(this.f29334c.get(0).f29351d.getPaint()) + this.f29339h + this.f29340i;
        ArrayList arrayList = new ArrayList();
        int size = this.f29334c.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            C10894a aVar = this.f29334c.get(i5);
            int i6 = aVar.f29348a;
            if (i3 != 0) {
                i6 += this.f29341j;
            }
            i3 += i6;
            int i7 = aVar.f29348a;
            int i8 = this.f29335d;
            if (i7 > i8 || i3 > i8) {
                if (i5 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.f29350c = z;
                a += aVar.f29349b + this.f29342k;
                if (i5 == 0) {
                    i4 = 0;
                } else {
                    i4++;
                }
                if (i3 > this.f29335d) {
                    i3 = aVar.f29348a;
                } else {
                    i3 = 0;
                }
            }
            if (i4 >= this.f29343l) {
                break;
            }
            arrayList.add(aVar);
        }
        this.f29334c.clear();
        this.f29334c.addAll(arrayList);
        this.f29336e = a;
        setMeasuredDimension(this.f29335d, a);
    }

    public TagFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45312a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.f29334c.size() != 0) {
            removeAllViews();
            int size = this.f29334c.size();
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < size; i9++) {
                C10894a aVar = this.f29334c.get(i9);
                if (aVar.f29348a > this.f29335d) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) aVar.f29351d.getLayoutParams();
                    marginLayoutParams.width = this.f29335d;
                    aVar.f29348a = this.f29335d;
                    aVar.f29351d.setEllipsize(TextUtils.TruncateAt.END);
                    aVar.f29351d.setLayoutParams(marginLayoutParams);
                }
                ViewGroup viewGroup = (ViewGroup) aVar.f29351d.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(aVar.f29351d);
                }
                addView(aVar.f29351d);
                aVar.f29351d.setTag(aVar);
                aVar.f29351d.setClickable(true);
                if (aVar.f29350c) {
                    if (i9 == 0) {
                        i6 = 0;
                    } else {
                        i6 = aVar.f29349b + this.f29342k;
                    }
                    i8 += i6;
                    aVar.f29351d.layout(0, i8, aVar.f29348a, aVar.f29349b + i8);
                    if (aVar.f29348a == this.f29335d) {
                        i7 = 0;
                    } else {
                        i7 = aVar.f29348a;
                        i5 = this.f29341j;
                    }
                } else {
                    aVar.f29351d.layout(i7, i8, aVar.f29348a + i7, aVar.f29349b + i8);
                    i5 = aVar.f29348a + this.f29341j;
                }
                i7 += i5;
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                getChildAt(i10).setOnClickListener(new AbstractView$OnClickListenerC11839e() {
                    /* class com.bytedance.ee.bear.search.widget.TagFlowLayout.C108931 */

                    /* access modifiers changed from: protected */
                    @Override // com.bytedance.ee.bear.widgets.AbstractView$OnClickListenerC11839e
                    /* renamed from: a */
                    public void mo16698a(View view) {
                        if (TagFlowLayout.this.f29332a != null && (view.getTag() instanceof C10894a)) {
                            TagFlowLayout.this.f29332a.onItemClick(((C10894a) view.getTag()).f29352e);
                        }
                    }
                });
            }
        }
    }
}
