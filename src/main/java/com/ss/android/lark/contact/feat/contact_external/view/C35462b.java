package com.ss.android.lark.contact.feat.contact_external.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.feat.contact_external.view.b */
public class C35462b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private Paint f91667a;

    /* renamed from: b */
    private Paint f91668b;

    /* renamed from: c */
    private Paint f91669c;

    /* renamed from: d */
    private int f91670d;

    /* renamed from: e */
    private int f91671e;

    /* renamed from: f */
    private int f91672f;

    /* renamed from: g */
    private int f91673g;

    /* renamed from: h */
    private int f91674h;

    /* renamed from: i */
    private Map<Integer, String> f91675i;

    /* renamed from: j */
    private List<String> f91676j;

    /* renamed from: k */
    private int f91677k;

    private C35462b() {
    }

    /* renamed from: com.ss.android.lark.contact.feat.contact_external.view.b$a */
    public static class C35463a {

        /* renamed from: a */
        private Map<Integer, String> f91678a;

        /* renamed from: b */
        private Integer f91679b;

        /* renamed from: c */
        private Float f91680c;

        /* renamed from: d */
        private Integer f91681d;

        /* renamed from: e */
        private Integer f91682e;

        /* renamed from: f */
        private Integer f91683f;

        /* renamed from: g */
        private Integer f91684g;

        /* renamed from: h */
        private Integer f91685h;

        /* renamed from: a */
        public C35463a mo130861a(Map<Integer, String> map) {
            this.f91678a = map;
            return this;
        }

        /* renamed from: a */
        public C35462b mo130862a(Context context) {
            C35462b bVar = new C35462b(context, this.f91678a);
            Integer num = this.f91679b;
            if (num != null) {
                bVar.mo130855a(num.intValue());
            }
            Float f = this.f91680c;
            if (f != null) {
                bVar.mo130854a(f.floatValue());
            }
            Integer num2 = this.f91681d;
            if (num2 != null) {
                bVar.mo130858b(num2.intValue());
            }
            Integer num3 = this.f91683f;
            if (num3 != null) {
                bVar.mo130860d(num3.intValue());
            }
            Integer num4 = this.f91682e;
            if (num4 != null) {
                bVar.mo130859c(num4.intValue());
            }
            Integer num5 = this.f91684g;
            if (!(num5 == null && this.f91685h == null)) {
                bVar.mo130856a(num5.intValue(), this.f91685h.intValue());
            }
            return bVar;
        }
    }

    /* renamed from: b */
    public void mo130858b(int i) {
        this.f91674h = i;
    }

    /* renamed from: d */
    public void mo130860d(int i) {
        this.f91671e = i;
    }

    /* renamed from: a */
    public void mo130854a(float f) {
        this.f91668b.setTextSize(f);
    }

    /* renamed from: c */
    public void mo130859c(int i) {
        this.f91667a.setColor(i);
    }

    /* renamed from: a */
    public void mo130855a(int i) {
        this.f91668b.setColor(i);
    }

    /* renamed from: e */
    private String m138694e(int i) {
        while (i >= 0) {
            if (this.f91675i.containsKey(Integer.valueOf(i))) {
                return this.f91675i.get(Integer.valueOf(i));
            }
            i--;
        }
        return null;
    }

    /* renamed from: a */
    public void mo130857a(Map<Integer, String> map) {
        this.f91676j = new LinkedList(new LinkedHashSet(map.values()));
        this.f91675i = map;
    }

    public C35462b(Context context, Map<Integer, String> map) {
        this.f91671e = UIUtils.dp2px(context, 32.0f);
        Paint paint = new Paint();
        this.f91667a = paint;
        paint.setColor(ContextCompat.getColor(context, R.color.bg_body));
        Paint paint2 = new Paint();
        this.f91669c = paint2;
        paint2.setColor(ContextCompat.getColor(context, R.color.bg_base));
        Paint paint3 = new Paint();
        this.f91668b = paint3;
        paint3.setColor(ContextCompat.getColor(context, R.color.text_caption));
        this.f91668b.setTextSize((float) UIUtils.dp2px(context, 14.0f));
        this.f91668b.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f91668b.getFontMetrics();
        this.f91672f = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f91673g = (int) fontMetrics.bottom;
        this.f91674h = UIUtils.dp2px(context, 16.0f);
        mo130857a(map);
    }

    /* renamed from: a */
    public void mo130856a(int i, int i2) {
        this.f91670d = i;
        this.f91669c.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int viewAdapterPosition = layoutParams.getViewAdapterPosition();
            if (this.f91675i.containsKey(Integer.valueOf(viewAdapterPosition))) {
                m138693a(canvas, paddingLeft, width, childAt, layoutParams, this.f91675i.get(Integer.valueOf(viewAdapterPosition)));
            }
            if (this.f91675i.containsKey(Integer.valueOf(viewAdapterPosition + 1))) {
                m138692a(canvas, paddingLeft, width, childAt, layoutParams);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        super.onDrawOver(canvas, recyclerView, state);
        int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1 && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null) {
            View view = findViewHolderForAdapterPosition.itemView;
            String e = m138694e(findFirstVisibleItemPosition);
            if (e != null) {
                this.f91677k = this.f91676j.indexOf(e);
                boolean z = false;
                String e2 = m138694e(findFirstVisibleItemPosition + 1);
                if (e2 != null && !TextUtils.equals(e, e2) && view.getHeight() + view.getTop() + this.f91670d < this.f91671e) {
                    canvas.save();
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) (((view.getHeight() + view.getTop()) + this.f91670d) - this.f91671e));
                    z = true;
                }
                canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), (float) (recyclerView.getPaddingTop() + this.f91671e), this.f91667a);
                int paddingTop = recyclerView.getPaddingTop();
                int i = this.f91671e;
                canvas.drawText(e, (float) (view.getPaddingLeft() + this.f91674h), (float) (((paddingTop + i) - ((i - this.f91672f) / 2)) - this.f91673g), this.f91668b);
                if (z) {
                    canvas.restore();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        int i2;
        super.getItemOffsets(rect, view, recyclerView, state);
        int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
        if (this.f91675i.containsKey(Integer.valueOf(viewAdapterPosition))) {
            i = this.f91671e;
        } else {
            i = 0;
        }
        if (this.f91675i.containsKey(Integer.valueOf(viewAdapterPosition + 1))) {
            i2 = this.f91670d;
        } else {
            i2 = 0;
        }
        rect.set(0, i, 0, i2);
    }

    /* renamed from: a */
    private void m138692a(Canvas canvas, int i, int i2, View view, RecyclerView.LayoutParams layoutParams) {
        int bottom = view.getBottom() + layoutParams.bottomMargin;
        canvas.drawRect((float) i, (float) bottom, (float) i2, (float) (this.f91670d + bottom), this.f91669c);
    }

    /* renamed from: a */
    private void m138693a(Canvas canvas, int i, int i2, View view, RecyclerView.LayoutParams layoutParams, String str) {
        int top = view.getTop() - layoutParams.topMargin;
        canvas.drawRect((float) i, (float) (top - this.f91671e), (float) i2, (float) top, this.f91667a);
        canvas.drawText(str, (float) (view.getPaddingLeft() + this.f91674h), (float) ((top - ((this.f91671e - this.f91672f) / 2)) - this.f91673g), this.f91668b);
    }
}
