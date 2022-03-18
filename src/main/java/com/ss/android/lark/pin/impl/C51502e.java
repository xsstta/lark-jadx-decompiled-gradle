package com.ss.android.lark.pin.impl;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pin.impl.entity.Pin;
import com.ss.android.lark.pin.impl.entity.PinInfo;
import com.ss.android.lark.ui.p2892a.C57582a;
import com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.pin.impl.e */
public class C51502e extends AbstractView$OnClickListenerC58987e<PinInfo> {

    /* renamed from: a */
    private RecyclerView f128175a;

    /* renamed from: b */
    private List<PinInfo> f128176b;

    /* renamed from: c */
    private C51505b f128177c;

    /* renamed from: d */
    private long f128178d = -1;

    /* renamed from: e */
    private AbstractC51507d f128179e;

    /* renamed from: f */
    private TimeInterpolator f128180f = new TimeInterpolator() {
        /* class com.ss.android.lark.pin.impl.C51502e.C515031 */

        public float getInterpolation(float f) {
            return ((double) f) <= 0.5d ? BitmapDescriptorFactory.HUE_RED : (f * 2.0f) - 1.0f;
        }
    };

    /* renamed from: com.ss.android.lark.pin.impl.e$c */
    public interface AbstractC51506c {
        /* renamed from: a */
        void mo177363a(View view, PinInfo bVar);

        /* renamed from: a */
        void mo177364a(PinInfo bVar);

        /* renamed from: a */
        boolean mo177365a(View view, PinInfo bVar, MotionEvent motionEvent);

        /* renamed from: b */
        void mo177366b(PinInfo bVar);

        /* renamed from: b */
        boolean mo177367b(View view, PinInfo bVar);

        /* renamed from: c */
        void mo177368c(View view, PinInfo bVar);

        /* renamed from: c */
        void mo177369c(PinInfo bVar);
    }

    /* renamed from: com.ss.android.lark.pin.impl.e$d */
    public interface AbstractC51507d {
        void onUpdate();
    }

    /* renamed from: a */
    public List<PinInfo> mo177357a() {
        return this.f128176b;
    }

    /* renamed from: com.ss.android.lark.pin.impl.e$a */
    private static class C51504a extends C1374g.AbstractC1376a {

        /* renamed from: a */
        private List<PinInfo> f128182a;

        /* renamed from: b */
        private List<PinInfo> f128183b;

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public int mo7380a() {
            return this.f128182a.size();
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public int mo7382b() {
            return this.f128183b.size();
        }

        public C51504a(List<PinInfo> list, List<PinInfo> list2) {
            this.f128182a = list;
            this.f128183b = list2;
            if (list == null) {
                this.f128182a = new ArrayList();
            }
            if (this.f128183b == null) {
                this.f128183b = new ArrayList();
            }
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: a */
        public boolean mo7381a(int i, int i2) {
            return this.f128182a.get(i).isItemSame(this.f128183b.get(i2));
        }

        @Override // androidx.recyclerview.widget.C1374g.AbstractC1376a
        /* renamed from: b */
        public boolean mo7383b(int i, int i2) {
            return this.f128182a.get(i).isItemSame(this.f128183b.get(i2));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m199790b() {
        this.f128175a.scrollToPosition(0);
    }

    /* renamed from: com.ss.android.lark.pin.impl.e$b */
    public static class C51505b extends PinInfo {

        /* renamed from: a */
        public boolean f128184a;

        public C51505b() {
            super(new Message(), null, "");
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractC58983c, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f128176b.size() + 1;
    }

    /* renamed from: a */
    public void mo177358a(AbstractC51507d dVar) {
        this.f128179e = dVar;
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i < this.f128176b.size()) {
            return super.getItemViewType(i);
        }
        return -2;
    }

    public C51502e(RecyclerView recyclerView) {
        this.f128175a = recyclerView;
        this.f128176b = new ArrayList();
        this.f128177c = new C51505b();
    }

    /* renamed from: a */
    public void mo177360a(boolean z) {
        if (this.f128177c.f128184a != z) {
            this.f128177c.f128184a = z;
            int itemCount = getItemCount() - 1;
            if (itemCount > 0) {
                notifyItemChanged(itemCount);
            }
        }
    }

    /* renamed from: b */
    public PinInfo mo31276a(int i) {
        if (i < this.f128176b.size()) {
            return this.f128176b.get(i);
        }
        return this.f128177c;
    }

    /* renamed from: a */
    public void mo177359a(List<PinInfo> list, long j) {
        this.f128178d = j;
        if (this.f128176b.size() == 0) {
            this.f128176b.addAll(list);
            notifyDataSetChanged();
        } else {
            C1374g.m6297a(new C51504a(this.f128176b, list)).mo7412a(this);
            this.f128176b.clear();
            this.f128176b.addAll(list);
            if (!this.f128175a.canScrollVertically(-1)) {
                this.f128175a.post(new Runnable() {
                    /* class com.ss.android.lark.pin.impl.$$Lambda$e$UCS8joAlOUKfvBMPNAJItdxzl0o */

                    public final void run() {
                        C51502e.this.m199790b();
                    }
                });
            }
        }
        AbstractC51507d dVar = this.f128179e;
        if (dVar != null) {
            dVar.onUpdate();
        }
    }

    @Override // com.ss.android.lark.widget.recyclerview.AbstractView$OnClickListenerC58987e, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Pin pin;
        super.onBindViewHolder(viewHolder, i);
        if (this.f128178d > 0) {
            PinInfo b = mo31276a(i);
            if (b != null) {
                pin = b.mo177397h();
            } else {
                pin = null;
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) viewHolder.itemView.getTag(R.id.avatar_key);
            if (pin != null && pin.getTimeStamp() > this.f128178d && !pin.isHasRead()) {
                pin.setHasRead(true);
                if (objectAnimator == null) {
                    View view = viewHolder.itemView;
                    objectAnimator = ObjectAnimator.ofInt(view, "backgroundColor", C25653b.m91894a(view.getContext(), R.color.ud_Y100, 1.0f), C25653b.m91894a(view.getContext(), R.color.bg_body, 1.0f));
                    objectAnimator.setDuration(3000L);
                    objectAnimator.setInterpolator(this.f128180f);
                    objectAnimator.setEvaluator(new ArgbEvaluator());
                    viewHolder.itemView.setTag(R.id.avatar_key, objectAnimator);
                }
                objectAnimator.start();
            } else if (objectAnimator != null) {
                objectAnimator.cancel();
                viewHolder.itemView.setBackgroundColor(C57582a.m223616d(viewHolder.itemView.getContext(), R.color.bg_body));
            }
        }
    }
}
