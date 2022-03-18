package com.bytedance.ee.bear.drive.biz.preview.vc;

import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.doc.follow.AbstractC5427d;
import com.bytedance.ee.bear.doc.follow.AbstractC5428e;
import com.bytedance.ee.bear.doc.follow.FollowModuleState;
import com.bytedance.ee.bear.doc.follow.event.LoadStateChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.PresenterLocationChangedEvent;
import com.bytedance.ee.bear.doc.follow.event.TitleChangedEvent;
import com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d;
import com.bytedance.ee.bear.drive.biz.preview.vc.DrivePdfState;
import com.bytedance.ee.bear.drive.loader.download.DownLoadState;
import com.bytedance.ee.bear.drive.view.preview.pdf.ExhibitionMode;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.e */
public class C6732e implements AbstractC5427d {

    /* renamed from: a */
    public AbstractC5428e f18327a;

    /* renamed from: b */
    public DrivePdfState f18328b;

    /* renamed from: c */
    private WeakReference<RecyclerView> f18329c;

    /* renamed from: d */
    private C6736c f18330d;

    /* renamed from: e */
    private C6734a f18331e = new C6734a(this.f18332f);

    /* renamed from: f */
    private C6735b f18332f;

    /* renamed from: g */
    private WeakReference<AbstractC6730d> f18333g;

    /* renamed from: f */
    private float m26520f() {
        return 0.5f;
    }

    /* renamed from: g */
    private float m26521g() {
        return 1.0f;
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: a */
    public String mo21661a() {
        return "pdf";
    }

    /* renamed from: a */
    public void mo26499a(AbstractC6730d dVar) {
        this.f18329c = new WeakReference<>(dVar.getNormalModeFollowView());
        this.f18333g = new WeakReference<>(dVar);
        dVar.getNormalModeFollowView().addOnScrollListener(this.f18330d);
        dVar.setPDFActionListener(this.f18331e);
    }

    /* renamed from: a */
    public void mo26498a(DrivePdfState drivePdfState, DrivePdfState drivePdfState2) {
        AbstractC6730d dVar = this.f18333g.get();
        int pageCount = dVar != null ? dVar.getPageCount() : 0;
        PresenterLocationChangedEvent.Location a = m26512a(drivePdfState, pageCount);
        PresenterLocationChangedEvent.Location a2 = m26512a(drivePdfState2, pageCount);
        if (this.f18327a != null) {
            PresenterLocationChangedEvent presenterLocationChangedEvent = new PresenterLocationChangedEvent();
            presenterLocationChangedEvent.setFollower(a2);
            presenterLocationChangedEvent.setPresenter(a);
            this.f18327a.mo21686a(presenterLocationChangedEvent);
        }
    }

    /* renamed from: a */
    public void mo26500a(DownLoadState downLoadState) {
        C13479a.m54764b("vc_follow_module", "PDFVCFollowConnector.java.downLoadStateChange: state= " + downLoadState);
        if (this.f18327a != null) {
            this.f18327a.mo21686a(new LoadStateChangedEvent(m26516b(downLoadState)));
            if (downLoadState == DownLoadState.LoadSuccess) {
                FollowModuleState d = mo26505d();
                C13479a.m54772d("vc_follow_module", "downLoadStateChange: send state when load success followModuleState=" + d.toString());
                this.f18327a.mo21685a(d);
            }
        }
    }

    /* renamed from: a */
    public void mo26497a(DrivePdfState drivePdfState) {
        WeakReference<AbstractC6730d> weakReference = this.f18333g;
        if (weakReference == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.doRemoteAction: 228");
            return;
        }
        AbstractC6730d dVar = weakReference.get();
        if (drivePdfState == null || dVar == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.doRemoteAction: STATE in null or layer is null");
            return;
        }
        if (drivePdfState.isIsPresentationMode() && dVar.getCurrentMode() != ExhibitionMode.PRESENTATION) {
            dVar.setExhibitionMode(ExhibitionMode.PRESENTATION);
        } else if (!drivePdfState.isIsPresentationMode() && dVar.getCurrentMode() != ExhibitionMode.NORMAL) {
            dVar.setExhibitionMode(ExhibitionMode.NORMAL);
        }
        if (dVar.getCurrentMode() == ExhibitionMode.PRESENTATION) {
            dVar.setPresentationPage(drivePdfState.getPageNumber());
        } else if (drivePdfState.getV2() == null) {
            m26513a(drivePdfState.getPageNumber() - 1, drivePdfState.getPageOffsetTop());
            dVar.setCurrentPosition(drivePdfState.getPageNumber());
        } else {
            m26515a(drivePdfState.getV2());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.e$1 */
    public static /* synthetic */ class C67331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f18334a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.drive.loader.download.DownLoadState[] r0 = com.bytedance.ee.bear.drive.loader.download.DownLoadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.drive.biz.preview.vc.C6732e.C67331.f18334a = r0
                com.bytedance.ee.bear.drive.loader.download.DownLoadState r1 = com.bytedance.ee.bear.drive.loader.download.DownLoadState.Loading     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.drive.biz.preview.vc.C6732e.C67331.f18334a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.drive.loader.download.DownLoadState r1 = com.bytedance.ee.bear.drive.loader.download.DownLoadState.LoadSuccess     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.drive.biz.preview.vc.C6732e.C67331.<clinit>():void");
        }
    }

    public C6732e() {
        C6735b bVar = new C6735b(this, null);
        this.f18332f = bVar;
        this.f18330d = new C6736c(bVar);
    }

    /* renamed from: d */
    public FollowModuleState mo26505d() {
        return new FollowModuleState("pdf", "drive_pdf_update", m26519c(mo26504c()));
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.e$a */
    private class C6734a implements AbstractC6730d.AbstractC6731a {

        /* renamed from: a */
        C6735b f18335a;

        @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d.AbstractC6731a
        /* renamed from: a */
        public void mo26494a() {
            if (C6732e.this.f18327a != null) {
                FollowModuleState d = C6732e.this.mo26505d();
                C13479a.m54764b("vc_follow_module", "onAttach: send state when load success followModuleState=" + d.toString());
                C6732e.this.f18327a.mo21685a(d);
            }
        }

        @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d.AbstractC6731a
        /* renamed from: a */
        public void mo26495a(int i) {
            C13479a.m54772d("vc_follow_module", "ExhibitionModeChangeListener onScrollChange: ");
            this.f18335a.mo26507a();
        }

        public C6734a(C6735b bVar) {
            this.f18335a = bVar;
        }

        @Override // com.bytedance.ee.bear.drive.biz.preview.vc.AbstractC6730d.AbstractC6731a
        /* renamed from: a */
        public void mo26496a(ExhibitionMode exhibitionMode, int i) {
            C13479a.m54772d("vc_follow_module", "ExhibitionModeChangeListener onExhibitionModeChanged: ");
            this.f18335a.mo26507a();
        }
    }

    /* renamed from: e */
    public void mo26506e() {
        C13479a.m54764b("vc_follow_module", "PDFVCFollowConnector.java.onDetach: 563 ");
        WeakReference<RecyclerView> weakReference = this.f18329c;
        if (weakReference != null && this.f18333g != null) {
            RecyclerView recyclerView = weakReference.get();
            if (recyclerView != null) {
                recyclerView.removeOnScrollListener(this.f18330d);
            }
            AbstractC6730d dVar = this.f18333g.get();
            if (dVar != null) {
                dVar.setPDFActionListener(null);
            }
        }
    }

    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.e$b */
    private class C6735b {

        /* renamed from: b */
        private long f18338b;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo26507a() {
            C13479a.m54764b("vc_follow_module", "onStateChange: ");
            if (SystemClock.uptimeMillis() - this.f18338b >= 50) {
                this.f18338b = SystemClock.uptimeMillis();
                DrivePdfState c = C6732e.this.mo26504c();
                FollowModuleState b = C6732e.this.mo26502b(c);
                if (C6732e.this.f18327a != null) {
                    C13479a.m54764b("vc_follow_module", "onStateChange: followModuleState=" + b.toString());
                    C6732e.this.f18327a.mo21685a(b);
                }
                if (C6732e.this.f18328b != null) {
                    C13479a.m54764b("vc_follow_module", "onStateChange: notify locationChange. ");
                    C6732e eVar = C6732e.this;
                    eVar.mo26498a(eVar.f18328b, c);
                }
            }
        }

        private C6735b() {
            this.f18338b = SystemClock.uptimeMillis();
        }

        /* synthetic */ C6735b(C6732e eVar, C67331 r2) {
            this();
        }
    }

    /* renamed from: h */
    private DrivePdfState.V2Offset m26522h() {
        DrivePdfState.V2Offset v2Offset = new DrivePdfState.V2Offset();
        v2Offset.pageNumber = -1;
        v2Offset.pageOffsetTop = -1.0f;
        WeakReference<RecyclerView> weakReference = this.f18329c;
        if (weakReference == null || this.f18333g == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.generateOffsetPercentV2: 374");
            return v2Offset;
        }
        RecyclerView recyclerView = weakReference.get();
        AbstractC6730d dVar = this.f18333g.get();
        if (recyclerView == null || dVar == null) {
            C13479a.m54775e("vc_follow_module", "generateOffsetPercentV2: recyclerview or layer is invalid");
            return v2Offset;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return v2Offset;
        }
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        Rect a = m26511a(layoutManager.findViewByPosition(findFirstVisibleItemPosition));
        Rect a2 = m26511a(recyclerView);
        try {
            float a3 = (float) dVar.mo26485a(findFirstVisibleItemPosition);
            float abs = (float) Math.abs(a.top - a2.top);
            float f = BitmapDescriptorFactory.HUE_RED;
            if (a3 > BitmapDescriptorFactory.HUE_RED && abs > BitmapDescriptorFactory.HUE_RED) {
                f = abs / a3;
            }
            v2Offset.pageNumber = findFirstVisibleItemPosition + 1;
            v2Offset.pageOffsetTop = f;
        } catch (Exception e) {
            C13479a.m54759a("vc_follow_module", "generateOffsetPercentV2: ", e);
        }
        return v2Offset;
    }

    /* renamed from: i */
    private int m26523i() {
        WeakReference<RecyclerView> weakReference = this.f18329c;
        if (weakReference == null || this.f18333g == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.findMiddleItem: 411");
            return -1;
        }
        RecyclerView recyclerView = weakReference.get();
        AbstractC6730d dVar = this.f18333g.get();
        if (recyclerView == null || dVar == null) {
            C13479a.m54775e("vc_follow_module", "findMiddleItem: recyclerview or layer is invalid");
            return -1;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                return findFirstVisibleItemPosition;
            }
            int i = (findFirstVisibleItemPosition + findLastVisibleItemPosition) / 2;
            if (m26518b(i)) {
                C13479a.m54764b("vc_follow_module", "findMiddleItem: middlePosition");
                return i;
            }
            int i2 = i - 1;
            if (m26518b(i2)) {
                C13479a.m54764b("vc_follow_module", "findMiddleItem: middlePosition-1");
                return i2;
            }
            int i3 = i + 1;
            if (m26518b(i3)) {
                C13479a.m54764b("vc_follow_module", "findMiddleItem: middlePosition+1");
                return i3;
            }
            C13479a.m54775e("vc_follow_module", "findMiddleItem: failed");
        }
        return -1;
    }

    /* renamed from: c */
    public DrivePdfState mo26504c() {
        WeakReference<AbstractC6730d> weakReference;
        int i;
        DrivePdfState drivePdfState = new DrivePdfState();
        if (this.f18329c == null || (weakReference = this.f18333g) == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.generateDrivePDFState: 350");
            return drivePdfState;
        }
        AbstractC6730d dVar = weakReference.get();
        if (dVar == null) {
            return drivePdfState;
        }
        if (dVar.getCurrentMode() == ExhibitionMode.NORMAL) {
            i = m26523i() + 1;
        } else {
            i = dVar.getCurrentPage();
        }
        boolean b = mo26503b();
        drivePdfState.setPageNumber(i);
        drivePdfState.setIsPresentationMode(b);
        if (dVar.getCurrentMode() != ExhibitionMode.PRESENTATION) {
            drivePdfState.setPageOffsetTop(m26510a(i - 1));
        }
        drivePdfState.setScale(m26521g());
        drivePdfState.setPageOffsetLeft(m26520f());
        if (dVar.getCurrentMode() != ExhibitionMode.PRESENTATION) {
            drivePdfState.setV2(m26522h());
        }
        return drivePdfState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo26503b() {
        WeakReference<AbstractC6730d> weakReference;
        if (this.f18329c == null || (weakReference = this.f18333g) == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.isPresentationMode: 314");
            return false;
        }
        AbstractC6730d dVar = weakReference.get();
        if (dVar == null || dVar.getCurrentMode() != ExhibitionMode.PRESENTATION) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.e$c */
    public static class C6736c extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        C6735b f18339a;

        public C6736c(C6735b bVar) {
            this.f18339a = bVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            C13479a.m54772d("vc_follow_module", "ScrollListener onScrollStateChanged: ");
            this.f18339a.mo26507a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
        }
    }

    /* renamed from: c */
    private String m26519c(DrivePdfState drivePdfState) {
        return JSON.toJSONString(drivePdfState);
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: a */
    public void mo21663a(AbstractC5428e eVar) {
        this.f18327a = eVar;
    }

    /* renamed from: a */
    public void mo26501a(String str) {
        if (this.f18327a != null) {
            this.f18327a.mo21686a(new TitleChangedEvent(str));
        }
    }

    /* renamed from: b */
    public FollowModuleState mo26502b(DrivePdfState drivePdfState) {
        return new FollowModuleState("pdf", "drive_pdf_update", m26519c(drivePdfState));
    }

    /* renamed from: b */
    private LoadStateChangedEvent.LoadState m26516b(DownLoadState downLoadState) {
        if (downLoadState == null) {
            return LoadStateChangedEvent.LoadState.LoadFail;
        }
        int i = C67331.f18334a[downLoadState.ordinal()];
        if (i == 1) {
            return LoadStateChangedEvent.LoadState.Loading;
        }
        if (i != 2) {
            return LoadStateChangedEvent.LoadState.LoadFail;
        }
        return LoadStateChangedEvent.LoadState.LoadSuccess;
    }

    /* renamed from: a */
    private static Rect m26511a(View view) {
        if (view == null) {
            return new Rect(0, 0, 0, 0);
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: b */
    private DrivePdfState m26517b(String str) {
        try {
            return (DrivePdfState) JSON.parseObject(str, DrivePdfState.class);
        } catch (Exception e) {
            C13479a.m54759a("vc_follow_module", "parseState: ", e);
            return new DrivePdfState();
        }
    }

    /* renamed from: a */
    private float m26510a(int i) {
        WeakReference<RecyclerView> weakReference = this.f18329c;
        if (weakReference == null || this.f18333g == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.generateOffsetPercent: 374");
            return -1.0f;
        }
        RecyclerView recyclerView = weakReference.get();
        AbstractC6730d dVar = this.f18333g.get();
        if (recyclerView == null || dVar == null) {
            C13479a.m54775e("vc_follow_module", "generateOffsetPercent: recyclerview or layer is invalid");
            return -1.0f;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        Rect a = m26511a(layoutManager.findViewByPosition(i));
        Rect a2 = m26511a(recyclerView);
        try {
            if (i < dVar.getPageCount() && i >= 0) {
                float a3 = (float) dVar.mo26485a(i);
                float f = (float) (((a2.top + a2.bottom) / 2) - a.top);
                if (a3 > BitmapDescriptorFactory.HUE_RED && f > BitmapDescriptorFactory.HUE_RED) {
                    return f / a3;
                }
            }
        } catch (Exception e) {
            C13479a.m54759a("vc_follow_module", "generateOffsetPercent: ", e);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: b */
    private boolean m26518b(int i) {
        WeakReference<RecyclerView> weakReference = this.f18329c;
        if (!(weakReference == null || this.f18333g == null)) {
            RecyclerView recyclerView = weakReference.get();
            AbstractC6730d dVar = this.f18333g.get();
            if (recyclerView == null || dVar == null) {
                C13479a.m54775e("vc_follow_module", "positionIsMiddle: recyclerview or layer is invalid");
            } else if (i < 0 || i >= dVar.getPageCount()) {
                C13479a.m54775e("vc_follow_module", "positionIsMiddle: position is invaild");
                return false;
            } else {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                Rect a = m26511a(recyclerView);
                if (layoutManager instanceof LinearLayoutManager) {
                    return m26511a(((LinearLayoutManager) layoutManager).findViewByPosition(i)).contains((a.left + a.right) / 2, (a.top + a.bottom) / 2);
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: b */
    public void mo21666b(FollowModuleState followModuleState) {
        C13479a.m54764b("vc_follow_module", "PDFVCFollowConnector updatePresenterState: state= " + followModuleState);
        if (followModuleState == null) {
            this.f18328b = null;
            return;
        }
        DrivePdfState b = m26517b(followModuleState.data);
        this.f18328b = b;
        mo26498a(b, mo26504c());
    }

    /* renamed from: a */
    private void m26515a(DrivePdfState.V2Offset v2Offset) {
        WeakReference<AbstractC6730d> weakReference;
        if (this.f18329c == null || (weakReference = this.f18333g) == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.scrollToTargetPositionV2: 285");
            return;
        }
        AbstractC6730d dVar = weakReference.get();
        if (this.f18329c.get() == null || dVar == null) {
            C13479a.m54775e("vc_follow_module", "scrollToTargetPositionV2: recyclerview is invalid or layer is invalid");
            return;
        }
        int i = v2Offset.pageNumber - 1;
        float f = v2Offset.pageOffsetTop;
        if (i >= dVar.getPageCount()) {
            i = dVar.getPageCount() - 1;
        }
        int i2 = 0;
        int max = Math.max(i, 0);
        try {
            int a = dVar.mo26485a(max);
            if (a > 0) {
                i2 = Math.max((int) (((float) a) * f), 0);
            }
            m26514a(max, -i2);
        } catch (Exception e) {
            C13479a.m54759a("vc_follow_module", "scrollToTargetPositionV2: ", e);
        }
    }

    @Override // com.bytedance.ee.bear.doc.follow.AbstractC5427d
    /* renamed from: a */
    public void mo21662a(FollowModuleState followModuleState) {
        String str;
        if (followModuleState == null || !TextUtils.equals(followModuleState.module, "pdf") || !TextUtils.equals(followModuleState.actionType, "drive_pdf_update")) {
            if (("PDFVCFollowConnector.java.setState: STATE is invalid state=" + followModuleState) == null) {
                str = "null";
            } else {
                str = followModuleState.toString();
            }
            C13479a.m54775e("vc_follow_module", str);
            return;
        }
        C13479a.m54764b("vc_follow_module", "PDFVCFollowConnector setState: state=" + followModuleState.toString());
        mo26497a(m26517b(followModuleState.data));
    }

    /* renamed from: a */
    private PresenterLocationChangedEvent.Location m26512a(DrivePdfState drivePdfState, int i) {
        String str;
        double d;
        if (i <= 0) {
            i = 1;
        }
        double d2 = 0.5d;
        if (drivePdfState.isIsPresentationMode()) {
            double pageNumber = (((double) drivePdfState.getPageNumber()) * 1.0d) / ((double) i);
            str = ExhibitionMode.PRESENTATION.name();
            d = 0.5d;
            d2 = pageNumber;
        } else {
            d = (((double) (((float) (drivePdfState.getPageNumber() - 1)) + drivePdfState.getPageOffsetTop())) * 1.0d) / ((double) i);
            str = ExhibitionMode.NORMAL.name();
        }
        PresenterLocationChangedEvent.Location location = new PresenterLocationChangedEvent.Location();
        location.setX(d2);
        location.setY(d);
        location.setSpace(str);
        return location;
    }

    /* renamed from: a */
    private void m26513a(int i, float f) {
        WeakReference<AbstractC6730d> weakReference;
        int height;
        if (this.f18329c == null || (weakReference = this.f18333g) == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.scrollToTargetPosition: 285");
            return;
        }
        AbstractC6730d dVar = weakReference.get();
        RecyclerView recyclerView = this.f18329c.get();
        if (recyclerView == null || dVar == null) {
            C13479a.m54775e("vc_follow_module", "scrollToTargetPosition: recyclerview is invalid or layer is invalid");
            return;
        }
        if (i >= dVar.getPageCount()) {
            i = dVar.getPageCount() - 1;
        }
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        try {
            int a = dVar.mo26485a(i);
            if (a > 0 && (height = (int) (((float) (recyclerView.getHeight() / 2)) - (((float) a) * f))) >= 0) {
                i2 = height;
            }
            m26514a(i, i2);
        } catch (Exception e) {
            C13479a.m54759a("vc_follow_module", "scrollToTargetPosition: ", e);
        }
    }

    /* renamed from: a */
    private void m26514a(int i, int i2) {
        WeakReference<RecyclerView> weakReference = this.f18329c;
        if (weakReference == null || this.f18333g == null) {
            C13479a.m54775e("vc_follow_module", "PDFVCFollowConnector.java.scrollToTargetPositionInternal: 209");
            return;
        }
        RecyclerView recyclerView = weakReference.get();
        if (recyclerView == null) {
            C13479a.m54775e("vc_follow_module", "scrollToTargetPositionInternal: recyclerview is invalid");
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            C6737f fVar = new C6737f(recyclerView.getContext());
            fVar.setTargetPosition(i);
            fVar.mo26508a(i2);
            layoutManager.startSmoothScroll(fVar);
            return;
        }
        C13479a.m54775e("vc_follow_module", "scrollToTargetPositionInternal: invalid LayoutManager");
    }
}
