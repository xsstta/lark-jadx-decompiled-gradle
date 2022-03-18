package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C1356d;
import androidx.recyclerview.widget.C1374g;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.larksuite.framework.utils.p1203a.C26247a;
import com.larksuite.suite.R;
import com.ss.android.vc.entity.InMeetingData;
import com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63130a;
import com.ss.android.vc.meeting.module.subtitle.p3167b.C63134d;
import com.ss.android.vc.meeting.module.subtitle.p3167b.C63135e;
import com.ss.android.vc.meeting.module.subtitle.p3167b.C63136f;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.subtitle.d */
public class C63152d extends RecyclerView.Adapter<AbstractC63130a> {

    /* renamed from: a */
    public SparseArray f159152a = new SparseArray();

    /* renamed from: b */
    private final C1356d<SubtitleModel2> f159153b = new C1356d<>(this, new C1374g.AbstractC1378c<SubtitleModel2>() {
        /* class com.ss.android.vc.meeting.module.subtitle.C63152d.C631531 */

        /* renamed from: a */
        public boolean areItemsTheSame(SubtitleModel2 subtitleModel2, SubtitleModel2 subtitleModel22) {
            return C26247a.m94980a((AbstractC26248b) subtitleModel2, (AbstractC26248b) subtitleModel22);
        }

        /* renamed from: b */
        public boolean areContentsTheSame(SubtitleModel2 subtitleModel2, SubtitleModel2 subtitleModel22) {
            return C26247a.m94983b(subtitleModel2, subtitleModel22);
        }
    });

    /* renamed from: c */
    private SubtitleStatusBar f159154c;

    /* renamed from: d */
    private SubtitleModel2 f159155d;

    /* renamed from: e */
    private AbstractC63155a<SubtitleStatusBar> f159156e;

    /* renamed from: f */
    private AbstractC63158f f159157f;

    /* renamed from: g */
    private String f159158g;

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.d$a */
    public interface AbstractC63155a<T> {
        void bind(T t);
    }

    /* renamed from: a */
    public void mo218615a() {
        SubtitleStatusBar subtitleStatusBar = this.f159154c;
        if (subtitleStatusBar != null) {
            subtitleStatusBar.mo218547a();
        }
    }

    /* renamed from: b */
    public boolean mo218622b() {
        SubtitleStatusBar subtitleStatusBar = this.f159154c;
        if (subtitleStatusBar == null || subtitleStatusBar.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f159153b.mo7374a().size() + 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.d$2 */
    public static /* synthetic */ class C631542 {

        /* renamed from: a */
        static final /* synthetic */ int[] f159160a;

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
                com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$Type[] r0 = com.ss.android.vc.entity.MeetingSubtitleData.SubtitleEvent.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.subtitle.C63152d.C631542.f159160a = r0
                com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$Type r1 = com.ss.android.vc.entity.MeetingSubtitleData.SubtitleEvent.Type.STOP_FOLLOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.subtitle.C63152d.C631542.f159160a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$Type r1 = com.ss.android.vc.entity.MeetingSubtitleData.SubtitleEvent.Type.START_FOLLOW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.vc.meeting.module.subtitle.C63152d.C631542.f159160a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$Type r1 = com.ss.android.vc.entity.MeetingSubtitleData.SubtitleEvent.Type.TURN_SUBTITLE_ON     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.vc.meeting.module.subtitle.C63152d.C631542.f159160a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$Type r1 = com.ss.android.vc.entity.MeetingSubtitleData.SubtitleEvent.Type.START_SHARE_SCREEN     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.vc.meeting.module.subtitle.C63152d.C631542.f159160a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.ss.android.vc.entity.MeetingSubtitleData$SubtitleEvent$Type r1 = com.ss.android.vc.entity.MeetingSubtitleData.SubtitleEvent.Type.STOP_SHARE_SCREEN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.subtitle.C63152d.C631542.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo218618a(AbstractC63155a<SubtitleStatusBar> aVar) {
        this.f159156e = aVar;
    }

    /* renamed from: b */
    public void mo218621b(InMeetingData.SubtitleStatusData.Status status) {
        SubtitleStatusBar subtitleStatusBar = this.f159154c;
        if (subtitleStatusBar != null) {
            subtitleStatusBar.mo218550a(status);
        }
    }

    /* renamed from: a */
    public void mo218619a(List<SubtitleModel2> list) {
        list.add(0, this.f159155d);
        this.f159153b.mo7376a(list);
    }

    /* renamed from: b */
    private void m247284b(List<SubtitleModel2> list) {
        SubtitleModel2 subtitleModel2 = new SubtitleModel2();
        this.f159155d = subtitleModel2;
        subtitleModel2.mIsHeader = true;
        list.add(this.f159155d);
        this.f159153b.mo7376a(list);
    }

    /* renamed from: a */
    public SubtitleModel2 mo218613a(int i) {
        if (i < this.f159153b.mo7374a().size()) {
            return this.f159153b.mo7374a().get(i);
        }
        return null;
    }

    /* renamed from: a */
    public int mo218612a(Long l) {
        for (int i = 0; i < this.f159153b.mo7374a().size(); i++) {
            if (this.f159153b.mo7374a().get(i).mSeqId == l.longValue()) {
                return i;
            }
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i == 0) {
            return 0;
        }
        SubtitleModel2 a = mo218613a(i);
        if (a.isSubtitleContent()) {
            return 1;
        }
        if (!a.isSubtitleEvent()) {
            return -1;
        }
        int i2 = C631542.f159160a[a.mSubtitleEvent.f152464a.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 3;
        }
        if (i2 == 3 || i2 == 4 || i2 == 5) {
            return 2;
        }
        return -1;
    }

    /* renamed from: a */
    public void mo218616a(InMeetingData.SubtitleStatusData.Status status) {
        if (this.f159154c != null) {
            if (status == InMeetingData.SubtitleStatusData.Status.RECOVERABLE_EXCEPTION) {
                notifyItemChanged(0);
            }
            this.f159154c.mo218550a(status);
        }
    }

    /* renamed from: a */
    public void mo218620a(boolean z) {
        SubtitleStatusBar subtitleStatusBar = this.f159154c;
        if (subtitleStatusBar != null && !z) {
            subtitleStatusBar.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.subtitle.d$b */
    public static class C63156b extends AbstractC63130a {
        @Override // com.ss.android.vc.meeting.module.subtitle.p3167b.AbstractC63133c
        /* renamed from: a */
        public void mo218592a(SubtitleModel2 subtitleModel2) {
        }

        public C63156b(View view, int i) {
            super(view);
        }
    }

    /* renamed from: a */
    public AbstractC63130a onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new C63134d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subtitle_history_item_content, viewGroup, false), this.f159158g, this.f159152a, this.f159157f);
        }
        if (i == 0) {
            SubtitleStatusBar subtitleStatusBar = new SubtitleStatusBar(viewGroup.getContext());
            this.f159154c = subtitleStatusBar;
            subtitleStatusBar.mo218551a(true);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            this.f159154c.setVisibility(8);
            this.f159154c.setLayoutParams(layoutParams);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            frameLayout.addView(this.f159154c);
            return new C63156b(frameLayout, i);
        } else if (i == 2) {
            return new C63135e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subtitle_history_item_content, viewGroup, false), this.f159158g, this.f159152a, this.f159157f);
        } else {
            if (i == 3) {
                return new C63136f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.subtitle_history_item_content, viewGroup, false), this.f159158g, this.f159152a, this.f159157f);
            }
            FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
            frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            return new C63156b(frameLayout2, i);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC63130a aVar, int i) {
        if (getItemViewType(i) == 0) {
            AbstractC63155a<SubtitleStatusBar> aVar2 = this.f159156e;
            if (aVar2 != null) {
                aVar2.bind(this.f159154c);
                return;
            }
            return;
        }
        aVar.mo218592a(mo218613a(i));
    }

    public C63152d(Context context, String str, List<SubtitleModel2> list, AbstractC63158f fVar) {
        this.f159157f = fVar;
        this.f159158g = str;
        m247284b(list);
    }
}
