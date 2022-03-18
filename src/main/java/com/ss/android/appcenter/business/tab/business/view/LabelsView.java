package com.ss.android.appcenter.business.tab.business.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class LabelsView extends ViewGroup implements View.OnClickListener, View.OnHoverListener, View.OnLongClickListener {

    /* renamed from: t */
    private static final int f69707t = 2131306532;

    /* renamed from: u */
    private static final int f69708u = 2131306534;

    /* renamed from: v */
    private static final int f69709v = 2131306533;

    /* renamed from: A */
    private AbstractC27897d f69710A;

    /* renamed from: B */
    private AbstractC27898e f69711B;

    /* renamed from: C */
    private AbstractC27899f f69712C;

    /* renamed from: D */
    private AbstractC27896c f69713D;

    /* renamed from: a */
    private Context f69714a;

    /* renamed from: b */
    private ColorStateList f69715b;

    /* renamed from: c */
    private float f69716c;

    /* renamed from: d */
    private Drawable f69717d;

    /* renamed from: e */
    private int f69718e = -2;

    /* renamed from: f */
    private int f69719f = -2;

    /* renamed from: g */
    private int f69720g = 17;

    /* renamed from: h */
    private int f69721h;

    /* renamed from: i */
    private int f69722i;

    /* renamed from: j */
    private int f69723j;

    /* renamed from: k */
    private int f69724k;

    /* renamed from: l */
    private int f69725l;

    /* renamed from: m */
    private int f69726m;

    /* renamed from: n */
    private SelectType f69727n;

    /* renamed from: o */
    private int f69728o;

    /* renamed from: p */
    private int f69729p;

    /* renamed from: q */
    private int f69730q;

    /* renamed from: r */
    private boolean f69731r;

    /* renamed from: s */
    private boolean f69732s;

    /* renamed from: w */
    private ArrayList<Object> f69733w = new ArrayList<>();

    /* renamed from: x */
    private ArrayList<Integer> f69734x = new ArrayList<>();

    /* renamed from: y */
    private ArrayList<Integer> f69735y = new ArrayList<>();

    /* renamed from: z */
    private AbstractC27895b f69736z;

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.LabelsView$a */
    public interface AbstractC27894a<T> {
        /* renamed from: a */
        CharSequence mo99462a(TextView textView, int i, T t);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.LabelsView$b */
    public interface AbstractC27895b {
        /* renamed from: a */
        void mo99464a(TextView textView, Object obj, int i);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.LabelsView$c */
    public interface AbstractC27896c {
        /* renamed from: a */
        void mo99465a(TextView textView, MotionEvent motionEvent);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.LabelsView$d */
    public interface AbstractC27897d {
        /* renamed from: a */
        boolean mo99466a(TextView textView, Object obj, int i);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.LabelsView$e */
    public interface AbstractC27898e {
        /* renamed from: a */
        void mo99467a(TextView textView, Object obj, boolean z, int i);
    }

    /* renamed from: com.ss.android.appcenter.business.tab.business.view.LabelsView$f */
    public interface AbstractC27899f {
        /* renamed from: a */
        boolean mo99468a(TextView textView, Object obj, boolean z, boolean z2, int i);
    }

    public List<Integer> getCompulsorys() {
        return this.f69735y;
    }

    public int getLabelGravity() {
        return this.f69720g;
    }

    public ColorStateList getLabelTextColor() {
        return this.f69715b;
    }

    public float getLabelTextSize() {
        return this.f69716c;
    }

    public <T> List<T> getLabels() {
        return this.f69733w;
    }

    public int getLineMargin() {
        return this.f69726m;
    }

    public int getMaxLines() {
        return this.f69730q;
    }

    public int getMaxSelect() {
        return this.f69728o;
    }

    public int getMinSelect() {
        return this.f69729p;
    }

    public List<Integer> getSelectLabels() {
        return this.f69734x;
    }

    public SelectType getSelectType() {
        return this.f69727n;
    }

    public int getTextPaddingBottom() {
        return this.f69724k;
    }

    public int getTextPaddingLeft() {
        return this.f69721h;
    }

    public int getTextPaddingRight() {
        return this.f69723j;
    }

    public int getTextPaddingTop() {
        return this.f69722i;
    }

    public int getWordMargin() {
        return this.f69725l;
    }

    /* renamed from: a */
    public <T> void mo99414a(List<T> list, AbstractC27894a<T> aVar) {
        m101809b();
        removeAllViews();
        this.f69733w.clear();
        if (list != null) {
            this.f69733w.addAll(list);
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m101806a(list.get(i), i, aVar);
            }
            m101802a();
        }
        if (this.f69727n == SelectType.SINGLE_IRREVOCABLY) {
            setSelects(0);
        }
    }

    /* renamed from: b */
    private void m101809b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            m101805a((TextView) getChildAt(i), false);
        }
        this.f69734x.clear();
    }

    /* renamed from: a */
    private void m101802a() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            TextView textView = (TextView) getChildAt(i);
            if (this.f69736z == null && this.f69710A == null && this.f69727n == SelectType.NONE) {
                z = false;
            } else {
                z = true;
            }
            textView.setClickable(z);
        }
    }

    public <T> List<T> getSelectLabelDatas() {
        ArrayList arrayList = new ArrayList();
        int size = this.f69734x.size();
        for (int i = 0; i < size; i++) {
            Object tag = getChildAt(this.f69734x.get(i).intValue()).getTag(f69707t);
            if (tag != null) {
                arrayList.add(tag);
            }
        }
        return arrayList;
    }

    public void setIndicator(boolean z) {
        this.f69732s = z;
    }

    public void setMinSelect(int i) {
        this.f69729p = i;
    }

    public void setOnLabelHoverListener(AbstractC27896c cVar) {
        this.f69713D = cVar;
    }

    public void setOnLabelSelectChangeListener(AbstractC27898e eVar) {
        this.f69711B = eVar;
    }

    public void setOnSelectChangeIntercept(AbstractC27899f fVar) {
        this.f69712C = fVar;
    }

    public void setLabelTextColor(int i) {
        setLabelTextColor(ColorStateList.valueOf(i));
    }

    public void setOnLabelClickListener(AbstractC27895b bVar) {
        this.f69736z = bVar;
        m101802a();
    }

    public void setOnLabelLongClickListener(AbstractC27897d dVar) {
        this.f69710A = dVar;
        m101802a();
    }

    /* renamed from: a */
    private int m101801a(float f) {
        return (int) TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    private int m101808b(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public void setLabelBackgroundColor(int i) {
        setLabelBackgroundDrawable(new ColorDrawable(i));
    }

    public void setLabelBackgroundResource(int i) {
        setLabelBackgroundDrawable(getResources().getDrawable(i));
    }

    public void setLabels(List<String> list) {
        mo99414a(list, new AbstractC27894a<String>() {
            /* class com.ss.android.appcenter.business.tab.business.view.LabelsView.C278931 */

            /* renamed from: a */
            public CharSequence mo99462a(TextView textView, int i, String str) {
                return str.trim();
            }
        });
    }

    public void setLineMargin(int i) {
        if (this.f69726m != i) {
            this.f69726m = i;
            requestLayout();
        }
    }

    public void setMaxLines(int i) {
        if (this.f69730q != i) {
            this.f69730q = i;
            requestLayout();
        }
    }

    public void setMaxSelect(int i) {
        if (this.f69728o != i) {
            this.f69728o = i;
            if (this.f69727n == SelectType.MULTI) {
                m101809b();
            }
        }
    }

    public void setSingleLine(boolean z) {
        if (this.f69731r != z) {
            this.f69731r = z;
            requestLayout();
        }
    }

    public void setWordMargin(int i) {
        if (this.f69725l != i) {
            this.f69725l = i;
            requestLayout();
        }
    }

    public enum SelectType {
        NONE(1),
        SINGLE(2),
        SINGLE_IRREVOCABLY(3),
        MULTI(4);
        
        int value;

        static SelectType get(int i) {
            if (i == 1) {
                return NONE;
            }
            if (i == 2) {
                return SINGLE;
            }
            if (i == 3) {
                return SINGLE_IRREVOCABLY;
            }
            if (i != 4) {
                return NONE;
            }
            return MULTI;
        }

        private SelectType(int i) {
            this.value = i;
        }
    }

    public void setCompulsorys(List<Integer> list) {
        if (this.f69727n == SelectType.MULTI && list != null) {
            this.f69735y.clear();
            this.f69735y.addAll(list);
            m101809b();
            setSelects(list);
        }
    }

    public void setLabelBackgroundDrawable(Drawable drawable) {
        this.f69717d = drawable;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView) getChildAt(i)).setBackgroundDrawable(this.f69717d.getConstantState().newDrawable());
        }
    }

    public void setLabelGravity(int i) {
        if (this.f69720g != i) {
            this.f69720g = i;
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                ((TextView) getChildAt(i2)).setGravity(i);
            }
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        this.f69715b = colorStateList;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((TextView) getChildAt(i)).setTextColor(this.f69715b);
        }
    }

    public void setLabelTextSize(float f) {
        if (this.f69716c != f) {
            this.f69716c = f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((TextView) getChildAt(i)).setTextSize(0, f);
            }
        }
    }

    public void setSelects(List<Integer> list) {
        if (list != null) {
            int size = list.size();
            int[] iArr = new int[size];
            for (int i = 0; i < size; i++) {
                iArr[i] = list.get(i).intValue();
            }
            setSelects(iArr);
        }
    }

    public LabelsView(Context context) {
        super(context);
        this.f69714a = context;
    }

    public boolean onLongClick(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        AbstractC27897d dVar = this.f69710A;
        if (dVar != null) {
            return dVar.mo99466a(textView, textView.getTag(f69707t), ((Integer) textView.getTag(f69708u)).intValue());
        }
        return false;
    }

    public void setCompulsorys(int... iArr) {
        if (this.f69727n == SelectType.MULTI && iArr != null) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i : iArr) {
                arrayList.add(Integer.valueOf(i));
            }
            setCompulsorys(arrayList);
        }
    }

    public void setSelectType(SelectType selectType) {
        if (this.f69727n != selectType) {
            this.f69727n = selectType;
            m101809b();
            if (this.f69727n == SelectType.SINGLE_IRREVOCABLY) {
                setSelects(0);
            }
            if (this.f69727n != SelectType.MULTI) {
                this.f69735y.clear();
            }
            m101802a();
        }
    }

    public void setSelects(int... iArr) {
        int i;
        if (this.f69727n != SelectType.NONE) {
            ArrayList arrayList = new ArrayList();
            int childCount = getChildCount();
            if (this.f69727n == SelectType.SINGLE || this.f69727n == SelectType.SINGLE_IRREVOCABLY) {
                i = 1;
            } else {
                i = this.f69728o;
            }
            for (int i2 : iArr) {
                if (i2 < childCount) {
                    TextView textView = (TextView) getChildAt(i2);
                    if (!arrayList.contains(textView)) {
                        m101805a(textView, true);
                        arrayList.add(textView);
                    }
                    if (i > 0 && arrayList.size() == i) {
                        break;
                    }
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                TextView textView2 = (TextView) getChildAt(i3);
                if (!arrayList.contains(textView2)) {
                    m101805a(textView2, false);
                }
            }
        }
    }

    public void onClick(View view) {
        int i;
        boolean z;
        boolean z2;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.f69732s && this.f69727n != SelectType.NONE) {
                boolean z3 = true;
                if (textView.isSelected()) {
                    if (this.f69727n != SelectType.MULTI || !this.f69735y.contains((Integer) textView.getTag(f69708u))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z || (this.f69727n == SelectType.MULTI && this.f69734x.size() <= this.f69729p)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && this.f69727n != SelectType.SINGLE_IRREVOCABLY) {
                        z3 = false;
                    }
                    if (!z3 && !m101807a(textView)) {
                        m101805a(textView, false);
                    }
                } else if (this.f69727n == SelectType.SINGLE || this.f69727n == SelectType.SINGLE_IRREVOCABLY) {
                    if (!m101807a(textView)) {
                        m101809b();
                        m101805a(textView, true);
                    }
                } else if (this.f69727n == SelectType.MULTI && (((i = this.f69728o) <= 0 || i > this.f69734x.size()) && !m101807a(textView))) {
                    m101805a(textView, true);
                }
            }
            AbstractC27895b bVar = this.f69736z;
            if (bVar != null) {
                bVar.mo99464a(textView, textView.getTag(f69707t), ((Integer) textView.getTag(f69708u)).intValue());
            }
        }
    }

    /* renamed from: a */
    private boolean m101807a(TextView textView) {
        AbstractC27899f fVar = this.f69712C;
        if (fVar == null || !fVar.mo99468a(textView, textView.getTag(f69707t), textView.isSelected(), !textView.isSelected(), ((Integer) textView.getTag(f69708u)).intValue())) {
            return false;
        }
        return true;
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        if (!(view instanceof TextView)) {
            return true;
        }
        TextView textView = (TextView) view;
        AbstractC27896c cVar = this.f69713D;
        if (cVar == null) {
            return true;
        }
        cVar.mo99465a(textView, motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f69731r) {
            m101803a(i, i2);
        } else {
            m101810b(i, i2);
        }
    }

    /* renamed from: c */
    private int m101811c(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            i2 = size;
        } else if (mode == Integer.MIN_VALUE) {
            i2 = Math.min(i2, size);
        }
        return resolveSizeAndState(Math.max(i2, getSuggestedMinimumWidth()), i, 0);
    }

    public LabelsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69714a = context;
        m101804a(context, attributeSet);
    }

    /* renamed from: a */
    private void m101803a(int i, int i2) {
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            measureChild(childAt, i, i2);
            i3 += childAt.getMeasuredWidth();
            if (i5 != childCount - 1) {
                i3 += this.f69725l;
            }
            i4 = Math.max(i4, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(m101811c(i, i3 + getPaddingLeft() + getPaddingRight()), m101811c(i2, i4 + getPaddingTop() + getPaddingBottom()));
    }

    /* renamed from: a */
    private void m101805a(TextView textView, boolean z) {
        if (textView.isSelected() != z) {
            textView.setSelected(z);
            if (z) {
                this.f69734x.add((Integer) textView.getTag(f69708u));
            } else {
                this.f69734x.remove((Integer) textView.getTag(f69708u));
            }
            AbstractC27898e eVar = this.f69711B;
            if (eVar != null) {
                eVar.mo99467a(textView, textView.getTag(f69707t), z, ((Integer) textView.getTag(f69708u)).intValue());
            }
        }
    }

    /* renamed from: b */
    private void m101810b(int i, int i2) {
        int childCount = getChildCount();
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            measureChild(childAt, i, i2);
            if (childAt.getMeasuredWidth() + i4 > size) {
                i3++;
                int i9 = this.f69730q;
                if (i9 > 0 && i3 > i9) {
                    break;
                }
                i6 = i6 + this.f69726m + i5;
                i7 = Math.max(i7, i4);
                i4 = 0;
                i5 = 0;
            }
            i4 += childAt.getMeasuredWidth();
            i5 = Math.max(i5, childAt.getMeasuredHeight());
            if (i8 != childCount - 1) {
                int i10 = this.f69725l;
                if (i4 + i10 > size) {
                    i3++;
                    int i11 = this.f69730q;
                    if (i11 > 0 && i3 > i11) {
                        break;
                    }
                    i6 = i6 + this.f69726m + i5;
                    i7 = Math.max(i7, i4);
                    i4 = 0;
                    i5 = 0;
                } else {
                    i4 += i10;
                }
            }
        }
        setMeasuredDimension(m101811c(i, Math.max(i7, i4) + getPaddingLeft() + getPaddingRight()), m101811c(i2, i6 + i5 + getPaddingTop() + getPaddingBottom()));
    }

    /* renamed from: a */
    private void m101804a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.isIndicator, R.attr.labelBackground, R.attr.labelTextColor, R.attr.labelTextPadding, R.attr.labelTextPaddingBottom, R.attr.labelTextPaddingLeft, R.attr.labelTextPaddingRight, R.attr.labelTextPaddingTop, R.attr.labelTextSize, R.attr.lineMargin, R.attr.maxLines, R.attr.maxSelect, R.attr.minSelect, R.attr.singleLine, R.attr.wLabelGravity, R.attr.wLabelTextHeight, R.attr.wLabelTextWidth, R.attr.wSelectType, R.attr.wordMargin});
            this.f69727n = SelectType.get(obtainStyledAttributes.getInt(17, 1));
            this.f69728o = obtainStyledAttributes.getInteger(11, 0);
            this.f69729p = obtainStyledAttributes.getInteger(12, 0);
            this.f69730q = obtainStyledAttributes.getInteger(10, 0);
            this.f69732s = obtainStyledAttributes.getBoolean(0, false);
            this.f69720g = obtainStyledAttributes.getInt(14, this.f69720g);
            this.f69718e = obtainStyledAttributes.getLayoutDimension(16, this.f69718e);
            this.f69719f = obtainStyledAttributes.getLayoutDimension(15, this.f69719f);
            if (obtainStyledAttributes.hasValue(2)) {
                this.f69715b = obtainStyledAttributes.getColorStateList(2);
            } else {
                this.f69715b = ColorStateList.valueOf(-16777216);
            }
            this.f69716c = obtainStyledAttributes.getDimension(8, (float) m101801a(14.0f));
            if (obtainStyledAttributes.hasValue(3)) {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
                this.f69724k = dimensionPixelOffset;
                this.f69723j = dimensionPixelOffset;
                this.f69722i = dimensionPixelOffset;
                this.f69721h = dimensionPixelOffset;
            } else {
                this.f69721h = obtainStyledAttributes.getDimensionPixelOffset(5, m101808b(10.0f));
                this.f69722i = obtainStyledAttributes.getDimensionPixelOffset(7, m101808b(5.0f));
                this.f69723j = obtainStyledAttributes.getDimensionPixelOffset(6, m101808b(10.0f));
                this.f69724k = obtainStyledAttributes.getDimensionPixelOffset(4, m101808b(5.0f));
            }
            this.f69726m = obtainStyledAttributes.getDimensionPixelOffset(9, m101808b(5.0f));
            this.f69725l = obtainStyledAttributes.getDimensionPixelOffset(18, m101808b(5.0f));
            if (obtainStyledAttributes.hasValue(1)) {
                int resourceId = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId != 0) {
                    this.f69717d = getResources().getDrawable(resourceId);
                } else {
                    this.f69717d = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
                }
            } else {
                this.f69717d = getResources().getDrawable(R.drawable.default_label_bg);
            }
            this.f69731r = obtainStyledAttributes.getBoolean(13, false);
            obtainStyledAttributes.recycle();
        }
    }

    public LabelsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f69714a = context;
        m101804a(context, attributeSet);
    }

    /* renamed from: a */
    private <T> void m101806a(T t, int i, AbstractC27894a<T> aVar) {
        if (i != 0) {
            TextView textView = new TextView(this.f69714a);
            textView.setText("/");
            textView.setPadding(0, this.f69722i, 0, this.f69724k);
            textView.setGravity(this.f69720g);
            textView.setId(f69709v);
            addView(textView, -2, -2);
        }
        TextView textView2 = new TextView(this.f69714a);
        textView2.setPadding(this.f69721h, this.f69722i, this.f69723j, this.f69724k);
        textView2.setTextSize(0, this.f69716c);
        textView2.setGravity(this.f69720g);
        textView2.setTextColor(this.f69715b);
        textView2.setBackgroundDrawable(this.f69717d.getConstantState().newDrawable());
        textView2.setTag(f69707t, t);
        textView2.setTag(f69708u, Integer.valueOf(i));
        textView2.setOnClickListener(this);
        textView2.setOnLongClickListener(this);
        textView2.setOnHoverListener(this);
        addView(textView2, this.f69718e, this.f69719f);
        textView2.setText(aVar.mo99462a(textView2, i, t));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int i5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 1;
        int i9 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getId() == R.id.tag_key_divider) {
                i7++;
                view = getChildAt(i7);
            } else {
                view = childAt;
                childAt = null;
            }
            if (childAt != null) {
                i5 = childAt.getMeasuredWidth() + this.f69725l;
            } else {
                i5 = 0;
            }
            if (!this.f69731r && i6 < view.getMeasuredWidth() + paddingLeft + i5 + getPaddingRight()) {
                i8++;
                int i10 = this.f69730q;
                if (i10 <= 0 || i8 <= i10) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = paddingTop + this.f69726m + i9;
                    if (childAt != null) {
                        childAt.setVisibility(8);
                    }
                    i9 = 0;
                } else {
                    return;
                }
            } else if (childAt != null) {
                childAt.setVisibility(0);
                childAt.layout(paddingLeft, paddingTop, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + paddingTop);
                paddingLeft = paddingLeft + childAt.getMeasuredWidth() + this.f69725l;
            }
            view.layout(paddingLeft, paddingTop, view.getMeasuredWidth() + paddingLeft, view.getMeasuredHeight() + paddingTop);
            paddingLeft = paddingLeft + view.getMeasuredWidth() + this.f69725l;
            i9 = Math.max(i9, view.getMeasuredHeight());
            i7++;
        }
    }
}
