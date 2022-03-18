package com.ss.android.lark.chat.chatwindow.chat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.LKUIDisplayManager;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.threadwindow.view.AbstractC56149a;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.q */
public class C33421q extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    C33422a f86060a;

    /* renamed from: b */
    private final AbstractC56149a f86061b;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.q$a */
    public static class C33422a {

        /* renamed from: b */
        private static final int f86062b = UIHelper.dp2px(1.0f);

        /* renamed from: c */
        private static final int f86063c = UIHelper.dp2px(0.5f);

        /* renamed from: d */
        private static final int f86064d = UIHelper.dp2px(0.6f);

        /* renamed from: e */
        private static final int f86065e;

        /* renamed from: f */
        private static final int f86066f;

        /* renamed from: g */
        private static final int f86067g;

        /* renamed from: h */
        private static final int f86068h;

        /* renamed from: i */
        private static final int f86069i;

        /* renamed from: j */
        private static final int f86070j;

        /* renamed from: k */
        private static final int f86071k = R.color.text_link_normal;

        /* renamed from: a */
        public final int f86072a;

        /* renamed from: l */
        private final Context f86073l;

        /* renamed from: m */
        private boolean f86074m;

        /* renamed from: n */
        private final String f86075n;

        /* renamed from: o */
        private int f86076o;

        /* renamed from: p */
        private final TextPaint f86077p;

        /* renamed from: q */
        private float f86078q = 12.0f;

        /* renamed from: r */
        private float f86079r = 14.0f;

        /* renamed from: s */
        private float f86080s = 20.0f;

        /* renamed from: t */
        private final int f86081t;

        /* renamed from: u */
        private final Rect f86082u;

        /* renamed from: v */
        private final SparseArray<Drawable> f86083v = new SparseArray<>();

        /* renamed from: a */
        public void mo122988a() {
            this.f86074m = true;
        }

        /* renamed from: c */
        private int m129496c() {
            return m129497d() + 0;
        }

        /* renamed from: e */
        private Rect m129498e() {
            this.f86082u.setEmpty();
            return this.f86082u;
        }

        /* renamed from: d */
        private int m129497d() {
            return (int) (((float) 0) + this.f86079r + ((float) f86064d));
        }

        /* renamed from: b */
        public int mo122990b() {
            int i = 0;
            if (this.f86074m) {
                i = 0 + m129496c();
            }
            return i + f86067g;
        }

        static {
            int dp2px = UIHelper.dp2px(10.0f);
            f86065e = dp2px;
            int dp2px2 = UIHelper.dp2px(15.0f);
            f86066f = dp2px2;
            f86067g = dp2px;
            f86068h = dp2px2;
            f86069i = dp2px2;
            f86070j = dp2px;
        }

        /* renamed from: a */
        public void mo122989a(Canvas canvas) {
            this.f86076o = 0;
            if (this.f86074m) {
                m129494a(canvas, this.f86077p);
            }
        }

        /* renamed from: a */
        private Drawable m129493a(int i) {
            Drawable drawable = this.f86083v.get(i);
            if (drawable != null) {
                return drawable;
            }
            Drawable c = C57582a.m223614c(this.f86073l, i);
            this.f86083v.put(i, c);
            return c;
        }

        /* renamed from: a */
        private void m129494a(Canvas canvas, Paint paint) {
            paint.setColor(this.f86081t);
            paint.setTextSize(this.f86079r);
            this.f86076o += 0;
            m129495a(canvas, paint, this.f86075n, m129493a(R.drawable.chat_window_message_divider_gradient_right_to_left_label), m129493a(R.drawable.chat_window_message_divider_gradient_left_to_right_label));
        }

        protected C33422a(Context context, int i) {
            this.f86073l = context;
            this.f86072a = i;
            TextPaint textPaint = new TextPaint(1);
            this.f86077p = textPaint;
            textPaint.density = C57582a.m223603a(context).getDisplayMetrics().density;
            this.f86075n = C57582a.m223604a(context, (int) R.string.Lark_Legacy_NewMessageSign);
            this.f86081t = C57582a.m223616d(context, f86071k);
            this.f86078q = LKUIDisplayManager.m91864a(context, (int) this.f86078q);
            this.f86079r = LKUIDisplayManager.m91864a(context, (int) this.f86079r);
            this.f86080s = LKUIDisplayManager.m91864a(context, (int) this.f86080s);
            this.f86082u = new Rect();
        }

        /* renamed from: a */
        private void m129495a(Canvas canvas, Paint paint, String str, Drawable drawable, Drawable drawable2) {
            Rect e = m129498e();
            paint.getTextBounds(str, 0, str.length(), e);
            int i = f86068h;
            int i2 = this.f86076o;
            int height = e.height();
            int i3 = f86062b;
            int i4 = i2 + ((height - i3) / 2);
            int i5 = f86070j;
            int width = ((this.f86072a + e.width()) / 2) + i5;
            int height2 = this.f86076o + ((e.height() - i3) / 2);
            int width2 = (((this.f86072a - e.width()) / 2) - i) - i5;
            if (DesktopUtil.m144301a(this.f86073l)) {
                i3 = f86063c;
            }
            int width3 = (((this.f86072a - e.width()) / 2) - f86069i) - i5;
            int height3 = this.f86076o + e.height();
            int i6 = f86064d;
            drawable.setBounds(i, i4, width2 + i, i4 + i3);
            drawable.draw(canvas);
            drawable2.setBounds(width, height2, width3 + width, i3 + height2);
            drawable2.draw(canvas);
            canvas.drawText(str, (float) ((this.f86072a - e.width()) / 2), (float) (height3 - i6), paint);
            this.f86076o += e.height() + i6;
        }
    }

    public C33421q(AbstractC56149a aVar) {
        this.f86061b = aVar;
    }

    /* renamed from: a */
    private C33422a m129492a(ViewGroup viewGroup) {
        C33422a aVar = this.f86060a;
        if (aVar == null || aVar.f86072a != viewGroup.getMeasuredWidth()) {
            this.f86060a = new C33422a(viewGroup.getContext(), viewGroup.getMeasuredWidth());
        }
        this.f86060a.mo122988a();
        return this.f86060a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int viewAdapterPosition = ((RecyclerView.LayoutParams) childAt.getLayoutParams()).getViewAdapterPosition();
            if (viewAdapterPosition != -1 && viewAdapterPosition < this.f86061b.getItemCount() && this.f86061b.mo191468b(viewAdapterPosition).mo121664J()) {
                canvas.save();
                C33422a a = m129492a(recyclerView);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (((float) childAt.getTop()) + ((float) ((int) (childAt.getTranslationY() + 0.5f)))) - ((float) a.mo122990b()));
                a.mo122989a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1 || childAdapterPosition >= this.f86061b.getItemCount() || !this.f86061b.mo191468b(childAdapterPosition).mo121664J()) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, m129492a(recyclerView).mo122990b(), 0, 0);
        }
    }
}
