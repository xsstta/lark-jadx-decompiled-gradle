package com.ss.android.lark.contact.feat.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.feat.common.b */
public class C35428b extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    private Context f91591a;

    /* renamed from: b */
    private int f91592b;

    /* renamed from: c */
    private Paint f91593c;

    /* renamed from: d */
    private Paint f91594d;

    /* renamed from: e */
    private int f91595e;

    /* renamed from: f */
    private int f91596f;

    /* renamed from: g */
    private int f91597g;

    /* renamed from: h */
    private Map<Integer, String> f91598h;

    /* renamed from: i */
    private List<String> f91599i;

    /* renamed from: j */
    private int f91600j;

    /* renamed from: a */
    public int mo130756a() {
        return this.f91600j;
    }

    /* renamed from: a */
    private String m138567a(int i) {
        while (i >= 0) {
            if (this.f91598h.containsKey(Integer.valueOf(i))) {
                return this.f91598h.get(Integer.valueOf(i));
            }
            i--;
        }
        return null;
    }

    public C35428b(Context context, Map<Integer, String> map, int i) {
        this.f91591a = context;
        Resources resources = context.getResources();
        this.f91599i = new LinkedList(new LinkedHashSet(map.values()));
        this.f91598h = map;
        this.f91592b = resources.getDimensionPixelSize(R.dimen.item_decoration_title_height);
        Paint paint = new Paint();
        this.f91593c = paint;
        paint.setColor(ContextCompat.getColor(this.f91591a, R.color.bg_base));
        Paint paint2 = new Paint();
        this.f91594d = paint2;
        paint2.setColor(ContextCompat.getColor(this.f91591a, R.color.text_placeholder));
        this.f91594d.setTextSize((float) this.f91591a.getResources().getDimensionPixelSize(R.dimen.item_decoration_title_fontsize));
        this.f91594d.setAntiAlias(true);
        Paint.FontMetrics fontMetrics = this.f91594d.getFontMetrics();
        this.f91595e = (int) (fontMetrics.bottom - fontMetrics.top);
        this.f91596f = (int) fontMetrics.bottom;
        this.f91597g = i;
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
            if (this.f91598h.containsKey(Integer.valueOf(viewAdapterPosition))) {
                Log.m165379d("FloatingBarItemDecoration", "current position:" + viewAdapterPosition);
                m138568a(canvas, paddingLeft, width, childAt, layoutParams, viewAdapterPosition);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1) {
            View view = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition).itemView;
            String a = m138567a(findFirstVisibleItemPosition);
            if (a != null) {
                this.f91600j = this.f91599i.indexOf(a);
                boolean z = false;
                int i = findFirstVisibleItemPosition + 1;
                if (m138567a(i) != null && !a.equals(m138567a(i)) && view.getHeight() + view.getTop() < this.f91592b) {
                    canvas.save();
                    canvas.translate(BitmapDescriptorFactory.HUE_RED, (float) ((view.getHeight() + view.getTop()) - this.f91592b));
                    z = true;
                }
                canvas.drawRect((float) recyclerView.getPaddingLeft(), (float) recyclerView.getPaddingTop(), (float) (recyclerView.getRight() - recyclerView.getPaddingRight()), (float) (recyclerView.getPaddingTop() + this.f91592b), this.f91593c);
                int paddingTop = recyclerView.getPaddingTop();
                int i2 = this.f91592b;
                canvas.drawText(a, (float) (view.getPaddingLeft() + this.f91597g), (float) (((paddingTop + i2) - ((i2 - this.f91595e) / 2)) - this.f91596f), this.f91594d);
                if (z) {
                    canvas.restore();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int i;
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.f91598h.containsKey(Integer.valueOf(((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition()))) {
            i = this.f91592b;
        } else {
            i = 0;
        }
        rect.set(0, i, 0, 0);
    }

    /* renamed from: a */
    private void m138568a(Canvas canvas, int i, int i2, View view, RecyclerView.LayoutParams layoutParams, int i3) {
        int top = view.getTop() - layoutParams.topMargin;
        canvas.drawRect((float) i, (float) (top - this.f91592b), (float) i2, (float) top, this.f91593c);
        canvas.drawText(this.f91598h.get(Integer.valueOf(i3)), (float) (view.getPaddingLeft() + this.f91597g), (float) ((top - ((this.f91592b - this.f91595e) / 2)) - this.f91596f), this.f91594d);
    }
}
