package com.ss.android.lark.chatthread.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;

/* renamed from: com.ss.android.lark.chatthread.view.f */
public class C35203f extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    C35204a f90925a;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chatthread.view.f$a */
    public static class C35204a {

        /* renamed from: d */
        private static final int f90926d = 2131100476;

        /* renamed from: e */
        private static final int f90927e = 2131100472;

        /* renamed from: a */
        public final int f90928a;

        /* renamed from: b */
        private final Context f90929b;

        /* renamed from: c */
        private final TextPaint f90930c;

        /* renamed from: a */
        public int mo129648a() {
            return UIHelper.dp2px(16.0f) + 0 + UIHelper.dp2px(12.0f) + UIHelper.dp2px(16.0f);
        }

        /* renamed from: a */
        public void mo129649a(Canvas canvas) {
            this.f90930c.setColor(UIHelper.getColor(f90927e));
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f90928a, (float) mo129648a(), this.f90930c);
            String string = UIHelper.getString(R.string.Lark_Group_UnableViewEarlierMessages);
            Rect rect = new Rect();
            this.f90930c.setTextSize((float) UIHelper.dp2px(12.0f));
            this.f90930c.setColor(UIHelper.getColor(f90926d));
            this.f90930c.getTextBounds(string, 0, string.length(), rect);
            canvas.drawText(string, (float) ((this.f90928a - rect.width()) >> 1), (float) (UIHelper.dp2px(16.0f) + rect.height()), this.f90930c);
        }

        protected C35204a(Context context, int i) {
            this.f90929b = context;
            this.f90928a = i;
            TextPaint textPaint = new TextPaint(1);
            this.f90930c = textPaint;
            textPaint.density = UIUtils.getResources(context).getDisplayMetrics().density;
        }
    }

    /* renamed from: a */
    private C35204a m137456a(ViewGroup viewGroup) {
        C35204a aVar = this.f90925a;
        if (aVar == null || aVar.f90928a != viewGroup.getMeasuredWidth()) {
            this.f90925a = new C35204a(viewGroup.getContext(), viewGroup.getMeasuredWidth());
        }
        return this.f90925a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (recyclerView.getChildAdapterPosition(childAt) == 0) {
                canvas.save();
                C35204a a = m137456a(recyclerView);
                canvas.translate(BitmapDescriptorFactory.HUE_RED, (((float) childAt.getTop()) + ((float) ((int) (childAt.getTranslationY() + 0.5f)))) - ((float) a.mo129648a()));
                a.mo129649a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.set(0, m137456a(recyclerView).mo129648a(), 0, 0);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
