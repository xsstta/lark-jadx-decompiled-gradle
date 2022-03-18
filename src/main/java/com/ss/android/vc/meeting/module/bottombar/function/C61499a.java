package com.ss.android.vc.meeting.module.bottombar.function;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ignition.widget.squircle.SquircleImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.bottombar.AbstractC61444a;
import com.ss.android.vc.meeting.module.meetingdialog.labs.LabsUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.bottombar.function.a */
public class C61499a extends RecyclerView.Adapter<C61502a> {

    /* renamed from: a */
    public final AbstractC61444a.AbstractC61446b f154238a;

    /* renamed from: b */
    private List<FunctionItem> f154239b = new ArrayList();

    /* renamed from: c */
    private final C61303k f154240c;

    /* renamed from: d */
    private int f154241d;

    /* renamed from: e */
    private int f154242e;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int size = this.f154239b.size();
        int i = this.f154242e;
        if (size > (this.f154241d + 1) * i) {
            return i;
        }
        return this.f154239b.size() - (this.f154241d * this.f154242e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.function.a$2 */
    public static /* synthetic */ class C615012 {

        /* renamed from: a */
        static final /* synthetic */ int[] f154245a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.ss.android.vc.meeting.module.bottombar.function.FunctionItem$FunctionType[] r0 = com.ss.android.vc.meeting.module.bottombar.function.FunctionItem.FunctionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615012.f154245a = r0
                com.ss.android.vc.meeting.module.bottombar.function.FunctionItem$FunctionType r1 = com.ss.android.vc.meeting.module.bottombar.function.FunctionItem.FunctionType.Chat     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615012.f154245a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.meeting.module.bottombar.function.FunctionItem$FunctionType r1 = com.ss.android.vc.meeting.module.bottombar.function.FunctionItem.FunctionType.Record     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615012.f154245a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.meeting.module.bottombar.function.FunctionItem$FunctionType r1 = com.ss.android.vc.meeting.module.bottombar.function.FunctionItem.FunctionType.Subtitle     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615012.f154245a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.meeting.module.bottombar.function.FunctionItem$FunctionType r1 = com.ss.android.vc.meeting.module.bottombar.function.FunctionItem.FunctionType.Live     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615012.f154245a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.meeting.module.bottombar.function.FunctionItem$FunctionType r1 = com.ss.android.vc.meeting.module.bottombar.function.FunctionItem.FunctionType.Effect     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615012.<clinit>():void");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) (i + (this.f154241d * this.f154242e));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.bottombar.function.a$a */
    public static class C61502a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public TextView f154246a;

        /* renamed from: b */
        public SquircleImageView f154247b;

        /* renamed from: c */
        public ImageView f154248c;

        /* renamed from: d */
        public FrameLayout f154249d;

        C61502a(View view) {
            super(view);
            this.f154246a = (TextView) view.findViewById(R.id.function_name);
            this.f154247b = (SquircleImageView) view.findViewById(R.id.function_icon);
            this.f154248c = (ImageView) view.findViewById(R.id.function_onboarding);
            this.f154249d = (FrameLayout) view.findViewById(R.id.function_num_notify_container);
        }
    }

    /* renamed from: a */
    public C61502a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C61502a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bottom_bar_function_rv_item, viewGroup, false));
    }

    /* renamed from: a */
    public void onBindViewHolder(C61502a aVar, int i) {
        final FunctionItem functionItem = this.f154239b.get(i + (this.f154241d * this.f154242e));
        int i2 = 8;
        if (functionItem == null) {
            aVar.itemView.setVisibility(8);
            return;
        }
        aVar.itemView.setVisibility(0);
        aVar.f154246a.setText(functionItem.getFuncNameRes());
        aVar.f154247b.setImageDrawable(C60773o.m236128f(functionItem.getFuncIconRes()));
        aVar.f154248c.setVisibility(8);
        aVar.f154249d.setVisibility(8);
        aVar.itemView.setOnClickListener(new OnSingleClickListener() {
            /* class com.ss.android.vc.meeting.module.bottombar.function.C61499a.C615001 */

            @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
            public void onSingleClick(View view) {
                C61499a.this.f154238a.mo213074a(functionItem.getFuncType(), view);
            }
        });
        int i3 = C615012.f154245a[functionItem.getFuncType().ordinal()];
        if (i3 == 1) {
            this.f154240c.mo212105W().mo212840s().mo213365a(aVar.itemView);
        } else if (i3 == 2) {
            this.f154240c.mo212106X().mo217372a(aVar.itemView);
        } else if (i3 == 3) {
            this.f154240c.mo212107Y().mo218555a(aVar.itemView);
        } else if (i3 == 4) {
            this.f154240c.am().mo214670a(aVar.itemView);
        } else if (i3 == 5) {
            ImageView imageView = aVar.f154248c;
            if (LabsUtils.m242901a()) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
        }
    }

    public C61499a(C61303k kVar, List<FunctionItem> list, int i, int i2, AbstractC61444a.AbstractC61446b bVar) {
        this.f154240c = kVar;
        this.f154238a = bVar;
        this.f154239b = list;
        this.f154241d = i;
        this.f154242e = i2;
    }
}
