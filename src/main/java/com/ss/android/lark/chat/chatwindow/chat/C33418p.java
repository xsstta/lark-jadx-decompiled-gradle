package com.ss.android.lark.chat.chatwindow.chat;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.display.manager.C25649b;
import com.larksuite.component.ui.display.manager.LarkFont;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;

/* renamed from: com.ss.android.lark.chat.chatwindow.chat.p */
public class C33418p extends RecyclerView.AbstractC1335d {

    /* renamed from: a */
    C33420b f86052a;

    /* renamed from: b */
    AbstractC33419a f86053b;

    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.p$a */
    public interface AbstractC33419a {
        /* renamed from: a */
        boolean mo122985a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.chatwindow.chat.p$b */
    public static class C33420b {

        /* renamed from: a */
        public View f86054a;

        /* renamed from: b */
        public TextView f86055b;

        /* renamed from: c */
        public TextView f86056c;

        /* renamed from: d */
        public TextView f86057d;

        /* renamed from: e */
        public TextView f86058e;

        /* renamed from: f */
        public TextView f86059f;

        /* renamed from: a */
        public int mo122986a() {
            return this.f86054a.getMeasuredHeight();
        }

        /* renamed from: b */
        private void m129489b() {
            C25649b.m91857a(this.f86055b, LarkFont.BODY1);
            C25649b.m91857a(this.f86056c, LarkFont.BODY1);
            C25649b.m91857a(this.f86057d, LarkFont.BODY1);
            C25649b.m91857a(this.f86058e, LarkFont.BODY1);
            C25649b.m91857a(this.f86059f, LarkFont.BODY1);
        }

        /* renamed from: a */
        public void mo122987a(ViewGroup viewGroup) {
            this.f86054a.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), Integer.MIN_VALUE));
            View view = this.f86054a;
            view.layout(0, 0, view.getMeasuredWidth(), this.f86054a.getMeasuredHeight());
        }

        public C33420b(View view) {
            this.f86054a = view;
            this.f86055b = (TextView) view.findViewById(R.id.tip_message_one);
            this.f86056c = (TextView) view.findViewById(R.id.tip_message_two);
            this.f86057d = (TextView) view.findViewById(R.id.tip_message_three);
            this.f86058e = (TextView) view.findViewById(R.id.tip_message_four);
            this.f86059f = (TextView) view.findViewById(R.id.tip_message_five);
            if (!DesktopUtil.m144307b()) {
                m129489b();
            }
        }
    }

    public C33418p(AbstractC33419a aVar) {
        this.f86053b = aVar;
    }

    /* renamed from: a */
    private C33420b m129487a(ViewGroup viewGroup, boolean z) {
        if (this.f86052a == null) {
            this.f86052a = new C33420b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.view_secret_chat_tip, viewGroup, false));
        }
        if (z) {
            this.f86052a.mo122987a(viewGroup);
        }
        return this.f86052a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        if (this.f86053b.mo122985a()) {
            int i = 0;
            View childAt = recyclerView.getChildAt(0);
            int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
            C33420b a = m129487a(recyclerView, false);
            if (a != null && childAdapterPosition <= 0) {
                canvas.save();
                Rect rect = new Rect();
                if (childAt != null) {
                    RecyclerView.AbstractC1335d itemDecorationAt = recyclerView.getItemDecorationAt(0);
                    if (itemDecorationAt != null) {
                        itemDecorationAt.getItemOffsets(rect, childAt, recyclerView, state);
                    }
                    i = (int) (childAt.getTranslationY() + 0.5f);
                    f = (float) childAt.getTop();
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                canvas.translate(BitmapDescriptorFactory.HUE_RED, ((f + ((float) i)) - ((float) a.mo122986a())) - ((float) rect.top));
                a.f86054a.draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1335d
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f86053b.mo122985a()) {
            int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
            C33420b a = m129487a(recyclerView, true);
            if (a == null || viewAdapterPosition > 0) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, a.mo122986a(), 0, 0);
            }
        }
    }
}
