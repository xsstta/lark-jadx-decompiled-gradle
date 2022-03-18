package com.larksuite.component.blockit.hashtag.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import androidx.customview.p030a.C0959c;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SwipeLayout extends FrameLayout {

    /* renamed from: i */
    private static final DragEdge f59625i = DragEdge.Right;

    /* renamed from: A */
    private float f59626A;

    /* renamed from: B */
    private Rect f59627B;

    /* renamed from: C */
    private GestureDetector f59628C;

    /* renamed from: a */
    View.OnClickListener f59629a;

    /* renamed from: b */
    View.OnLongClickListener f59630b;

    /* renamed from: c */
    public DragEdge f59631c;

    /* renamed from: d */
    public int f59632d;

    /* renamed from: e */
    public ShowMode f59633e;

    /* renamed from: f */
    public List<AbstractC24123f> f59634f;

    /* renamed from: g */
    public AbstractC24118a f59635g;

    /* renamed from: h */
    public boolean f59636h;

    /* renamed from: j */
    private int f59637j;

    /* renamed from: k */
    private C0959c f59638k;

    /* renamed from: l */
    private LinkedHashMap<DragEdge, View> f59639l;

    /* renamed from: m */
    private float[] f59640m;

    /* renamed from: n */
    private List<AbstractC24121d> f59641n;

    /* renamed from: o */
    private Map<View, ArrayList<AbstractC24120c>> f59642o;

    /* renamed from: p */
    private Map<View, Boolean> f59643p;

    /* renamed from: q */
    private Map<View, Rect> f59644q;

    /* renamed from: r */
    private boolean f59645r;

    /* renamed from: s */
    private boolean[] f59646s;

    /* renamed from: t */
    private float f59647t;

    /* renamed from: u */
    private float f59648u;

    /* renamed from: v */
    private int f59649v;

    /* renamed from: w */
    private C0959c.AbstractC0962a f59650w;

    /* renamed from: x */
    private List<AbstractC24119b> f59651x;

    /* renamed from: y */
    private boolean f59652y;

    /* renamed from: z */
    private float f59653z;

    public enum DragEdge {
        Left,
        Top,
        Right,
        Bottom
    }

    public enum ShowMode {
        LayDown,
        PullOut
    }

    public enum Status {
        Middle,
        Open,
        Close
    }

    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$a */
    public interface AbstractC24118a {
        /* renamed from: a */
        void mo86609a(SwipeLayout swipeLayout, boolean z);
    }

    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$b */
    public interface AbstractC24119b {
        /* renamed from: a */
        void mo86610a(SwipeLayout swipeLayout);
    }

    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$c */
    public interface AbstractC24120c {
        /* renamed from: a */
        void mo86611a(View view, DragEdge dragEdge, float f, int i);
    }

    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$d */
    public interface AbstractC24121d {
        /* renamed from: a */
        boolean mo86612a(MotionEvent motionEvent);
    }

    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$f */
    public interface AbstractC24123f {
        /* renamed from: a */
        void mo86615a(SwipeLayout swipeLayout);

        /* renamed from: a */
        void mo86616a(SwipeLayout swipeLayout, float f, float f2);

        /* renamed from: a */
        void mo86617a(SwipeLayout swipeLayout, int i, int i2);

        /* renamed from: b */
        void mo86618b(SwipeLayout swipeLayout);

        /* renamed from: c */
        void mo86619c(SwipeLayout swipeLayout);

        /* renamed from: d */
        void mo86620d(SwipeLayout swipeLayout);
    }

    /* renamed from: e */
    public boolean mo86566e() {
        return this.f59645r;
    }

    public int getDragDistance() {
        return this.f59632d;
    }

    public DragEdge getDragEdge() {
        return this.f59631c;
    }

    public Map<DragEdge, View> getDragEdgeMap() {
        return this.f59639l;
    }

    public ShowMode getShowMode() {
        return this.f59633e;
    }

    public float getWillOpenPercentAfterClose() {
        return this.f59648u;
    }

    public float getWillOpenPercentAfterOpen() {
        return this.f59647t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo86557a(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        if (this.f59643p.get(view).booleanValue()) {
            return false;
        }
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            if ((dragEdge != DragEdge.Right || i3 > i5) && ((dragEdge != DragEdge.Left || i < i6) && ((dragEdge != DragEdge.Top || i2 < i8) && (dragEdge != DragEdge.Bottom || i4 > i7)))) {
                return false;
            }
        } else if (getShowMode() != ShowMode.PullOut) {
            return false;
        } else {
            if ((dragEdge != DragEdge.Right || i6 > getWidth()) && ((dragEdge != DragEdge.Left || i5 < getPaddingLeft()) && ((dragEdge != DragEdge.Top || i7 < getPaddingTop()) && (dragEdge != DragEdge.Bottom || i8 > getHeight())))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo86552a(int i, int i2, boolean z) {
        m88087n();
        Status openStatus = getOpenStatus();
        if (!this.f59634f.isEmpty()) {
            this.f59649v++;
            for (AbstractC24123f fVar : this.f59634f) {
                if (this.f59649v == 1) {
                    if (z) {
                        fVar.mo86615a(this);
                    } else {
                        fVar.mo86619c(this);
                    }
                }
                fVar.mo86617a(this, i - getPaddingLeft(), i2 - getPaddingTop());
            }
            if (openStatus == Status.Close) {
                for (AbstractC24123f fVar2 : this.f59634f) {
                    fVar2.mo86620d(this);
                }
                this.f59649v = 0;
            }
            if (openStatus == Status.Open) {
                View currentBottomView = getCurrentBottomView();
                if (currentBottomView != null) {
                    currentBottomView.setEnabled(true);
                }
                for (AbstractC24123f fVar3 : this.f59634f) {
                    fVar3.mo86618b(this);
                }
                this.f59649v = 0;
            }
        }
    }

    /* renamed from: a */
    public void mo86553a(AbstractC24119b bVar) {
        if (this.f59651x == null) {
            this.f59651x = new ArrayList();
        }
        this.f59651x.add(bVar);
    }

    /* renamed from: a */
    public boolean mo86556a(MotionEvent motionEvent) {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return false;
        }
        if (this.f59627B == null) {
            this.f59627B = new Rect();
        }
        surfaceView.getHitRect(this.f59627B);
        return this.f59627B.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo86550a(float f, float f2, boolean z) {
        float a = this.f59638k.mo4862a();
        View surfaceView = getSurfaceView();
        DragEdge dragEdge = this.f59631c;
        if (dragEdge != null && surfaceView != null) {
            float f3 = z ? this.f59648u : this.f59647t;
            if (dragEdge == DragEdge.Left) {
                if (f > a) {
                    mo86584l();
                } else if (f < (-a)) {
                    mo86585m();
                } else if ((((float) getSurfaceView().getLeft()) * 1.0f) / ((float) this.f59632d) > f3) {
                    mo86584l();
                } else {
                    mo86585m();
                }
            } else if (dragEdge == DragEdge.Right) {
                if (f > a) {
                    mo86585m();
                } else if (f < (-a)) {
                    mo86584l();
                } else if ((((float) (-getSurfaceView().getLeft())) * 1.0f) / ((float) this.f59632d) > f3) {
                    mo86584l();
                } else {
                    mo86585m();
                }
            } else if (dragEdge == DragEdge.Top) {
                if (f2 > a) {
                    mo86584l();
                } else if (f2 < (-a)) {
                    mo86585m();
                } else if ((((float) getSurfaceView().getTop()) * 1.0f) / ((float) this.f59632d) > f3) {
                    mo86584l();
                } else {
                    mo86585m();
                }
            } else if (dragEdge != DragEdge.Bottom) {
            } else {
                if (f2 > a) {
                    mo86585m();
                } else if (f2 < (-a)) {
                    mo86584l();
                } else if ((((float) (-getSurfaceView().getTop())) * 1.0f) / ((float) this.f59632d) > f3) {
                    mo86584l();
                } else {
                    mo86585m();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo86555a(boolean z, boolean z2) {
        View surfaceView = getSurfaceView();
        View currentBottomView = getCurrentBottomView();
        if (surfaceView != null) {
            Rect a = m88085a(true);
            if (z) {
                this.f59638k.mo4868a(surfaceView, a.left, a.top);
            } else {
                int left = a.left - surfaceView.getLeft();
                int top = a.top - surfaceView.getTop();
                surfaceView.layout(a.left, a.top, a.right, a.bottom);
                if (getShowMode() == ShowMode.PullOut) {
                    Rect a2 = m88084a(ShowMode.PullOut, a);
                    if (currentBottomView != null) {
                        currentBottomView.layout(a2.left, a2.top, a2.right, a2.bottom);
                    }
                }
                if (z2) {
                    mo86560b(a.left, a.top, a.right, a.bottom);
                    mo86551a(a.left, a.top, left, top);
                } else {
                    m88087n();
                }
            }
            invalidate();
        }
    }

    /* renamed from: b */
    public void mo86559b() {
        this.f59639l.clear();
    }

    /* renamed from: l */
    public void mo86584l() {
        mo86555a(true, true);
    }

    /* renamed from: m */
    public void mo86585m() {
        mo86561b(true, true);
    }

    private AdapterView getAdapterView() {
        ViewParent parent = getParent();
        if (parent instanceof AdapterView) {
            return (AdapterView) parent;
        }
        return null;
    }

    private float getCurrentOffset() {
        DragEdge dragEdge = this.f59631c;
        if (dragEdge == null) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return this.f59640m[dragEdge.ordinal()];
    }

    /* renamed from: o */
    private boolean m88088o() {
        if (getAdapterView() != null) {
            return true;
        }
        return false;
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.f59638k.mo4869a(true)) {
            ViewCompat.m4073e(this);
        }
    }

    public List<DragEdge> getDragEdges() {
        return new ArrayList(this.f59639l.keySet());
    }

    public List<View> getBottomViews() {
        ArrayList arrayList = new ArrayList();
        for (DragEdge dragEdge : DragEdge.values()) {
            arrayList.add(this.f59639l.get(dragEdge));
        }
        return arrayList;
    }

    public View getCurrentBottomView() {
        List<View> bottomViews = getBottomViews();
        if (this.f59631c.ordinal() < bottomViews.size()) {
            return bottomViews.get(this.f59631c.ordinal());
        }
        return null;
    }

    public View getSurfaceView() {
        if (getChildCount() == 0) {
            return null;
        }
        return getChildAt(getChildCount() - 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$4 */
    public static /* synthetic */ class C241174 {

        /* renamed from: a */
        static final /* synthetic */ int[] f59658a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.larksuite.component.blockit.hashtag.widget.SwipeLayout$DragEdge[] r0 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.DragEdge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.blockit.hashtag.widget.SwipeLayout.C241174.f59658a = r0
                com.larksuite.component.blockit.hashtag.widget.SwipeLayout$DragEdge r1 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.DragEdge.Top     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.C241174.f59658a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.blockit.hashtag.widget.SwipeLayout$DragEdge r1 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.DragEdge.Bottom     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.C241174.f59658a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.larksuite.component.blockit.hashtag.widget.SwipeLayout$DragEdge r1 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.DragEdge.Left     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.C241174.f59658a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.larksuite.component.blockit.hashtag.widget.SwipeLayout$DragEdge r1 = com.larksuite.component.blockit.hashtag.widget.SwipeLayout.DragEdge.Right     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.hashtag.widget.SwipeLayout.C241174.<clinit>():void");
        }
    }

    /* renamed from: n */
    private void m88087n() {
        Status openStatus = getOpenStatus();
        List<View> bottomViews = getBottomViews();
        if (openStatus == Status.Close) {
            for (View view : bottomViews) {
                if (!(view == null || view.getVisibility() == 4)) {
                    view.setVisibility(4);
                }
            }
            return;
        }
        View currentBottomView = getCurrentBottomView();
        if (!(currentBottomView == null || currentBottomView.getVisibility() == 0)) {
            currentBottomView.setVisibility(0);
        }
    }

    /* renamed from: f */
    public boolean mo86567f() {
        View view = this.f59639l.get(DragEdge.Left);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.f59646s[DragEdge.Left.ordinal()]) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo86568g() {
        View view = this.f59639l.get(DragEdge.Right);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.f59646s[DragEdge.Right.ordinal()]) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo86580h() {
        View view = this.f59639l.get(DragEdge.Top);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.f59646s[DragEdge.Top.ordinal()]) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean mo86581i() {
        View view = this.f59639l.get(DragEdge.Bottom);
        if (view == null || view.getParent() != this || view == getSurfaceView() || !this.f59646s[DragEdge.Bottom.ordinal()]) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public void mo86582j() {
        AdapterView adapterView;
        int positionForView;
        if (getOpenStatus() == Status.Close) {
            ViewParent parent = getParent();
            if ((parent instanceof AdapterView) && (positionForView = (adapterView = (AdapterView) parent).getPositionForView(this)) != -1) {
                adapterView.performItemClick(adapterView.getChildAt(positionForView - adapterView.getFirstVisiblePosition()), positionForView, adapterView.getAdapter().getItemId(positionForView));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m88088o()) {
            if (this.f59629a == null) {
                setOnClickListener(new View.OnClickListener() {
                    /* class com.larksuite.component.blockit.hashtag.widget.SwipeLayout.View$OnClickListenerC241152 */

                    public void onClick(View view) {
                        SwipeLayout.this.mo86582j();
                    }
                });
            }
            if (this.f59630b == null) {
                setOnLongClickListener(new View.OnLongClickListener() {
                    /* class com.larksuite.component.blockit.hashtag.widget.SwipeLayout.View$OnLongClickListenerC241163 */

                    public boolean onLongClick(View view) {
                        SwipeLayout.this.mo86583k();
                        return true;
                    }
                });
            }
        }
    }

    /* renamed from: p */
    private void m88089p() {
        View currentBottomView = getCurrentBottomView();
        if (currentBottomView != null) {
            if (this.f59631c == DragEdge.Left || this.f59631c == DragEdge.Right) {
                this.f59632d = currentBottomView.getMeasuredWidth() - m88083a(getCurrentOffset());
            } else {
                this.f59632d = currentBottomView.getMeasuredHeight() - m88083a(getCurrentOffset());
            }
            Log.m165379d("SwipeLayout", "mDragDistance = " + this.f59632d);
        }
        if (this.f59633e == ShowMode.PullOut) {
            mo86563c();
        } else if (this.f59633e == ShowMode.LayDown) {
            mo86565d();
        }
        m88087n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo86563c() {
        View surfaceView = getSurfaceView();
        Rect rect = this.f59644q.get(surfaceView);
        if (rect == null) {
            rect = m88085a(false);
        }
        if (surfaceView != null) {
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            bringChildToFront(surfaceView);
        }
        View currentBottomView = getCurrentBottomView();
        Rect rect2 = this.f59644q.get(currentBottomView);
        if (rect2 == null) {
            rect2 = m88084a(ShowMode.PullOut, rect);
        }
        if (currentBottomView != null) {
            currentBottomView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public Status getOpenStatus() {
        View surfaceView = getSurfaceView();
        if (surfaceView == null) {
            return Status.Close;
        }
        int left = surfaceView.getLeft();
        int top = surfaceView.getTop();
        if (left == getPaddingLeft() && top == getPaddingTop()) {
            return Status.Close;
        }
        if (left == getPaddingLeft() - this.f59632d || left == getPaddingLeft() + this.f59632d || top == getPaddingTop() - this.f59632d || top == getPaddingTop() + this.f59632d) {
            return Status.Open;
        }
        return Status.Middle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        r0 = (android.widget.AdapterView) r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo86583k() {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.hashtag.widget.SwipeLayout.mo86583k():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo86565d() {
        View surfaceView = getSurfaceView();
        Rect rect = this.f59644q.get(surfaceView);
        if (rect == null) {
            rect = m88085a(false);
        }
        if (surfaceView != null) {
            if (rect.left < 0) {
                rect.left = 0;
                rect.right = rect.left + getMeasuredWidth();
            }
            surfaceView.layout(rect.left, rect.top, rect.right, rect.bottom);
            bringChildToFront(surfaceView);
            Log.m165379d("SwipeLayout", "surfaceView  surfaceRect.left= " + rect.left + ";surfaceRect.right=" + rect.right);
        }
        View currentBottomView = getCurrentBottomView();
        Rect rect2 = this.f59644q.get(currentBottomView);
        if (rect2 == null) {
            rect2 = m88084a(ShowMode.LayDown, rect);
        }
        if (currentBottomView != null) {
            currentBottomView.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            Log.m165379d("SwipeLayout", "currentBottomView  bottomViewRect.left= " + rect2.left + ";bottomViewRect.right=" + rect2.right);
        }
    }

    /* renamed from: a */
    public void mo86549a() {
        View currentBottomView = getCurrentBottomView();
        if (getOpenStatus() == Status.Close) {
            this.f59644q.remove(currentBottomView);
            return;
        }
        View[] viewArr = {getSurfaceView(), currentBottomView};
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            Rect rect = this.f59644q.get(view);
            if (rect == null) {
                rect = new Rect();
                this.f59644q.put(view, rect);
            }
            rect.left = view.getLeft();
            rect.top = view.getTop();
            rect.right = view.getRight();
            rect.bottom = view.getBottom();
        }
    }

    public void setClickToClose(boolean z) {
        this.f59636h = z;
    }

    public void setOnDoubleClickListener(AbstractC24118a aVar) {
        this.f59635g = aVar;
    }

    public void setSwipeEnabled(boolean z) {
        this.f59645r = z;
    }

    public void setWillOpenPercentAfterClose(float f) {
        this.f59648u = f;
    }

    public void setWillOpenPercentAfterOpen(float f) {
        this.f59647t = f;
    }

    /* renamed from: com.larksuite.component.blockit.hashtag.widget.SwipeLayout$e */
    class C24122e extends GestureDetector.SimpleOnGestureListener {
        C24122e() {
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (SwipeLayout.this.f59636h && SwipeLayout.this.mo86556a(motionEvent)) {
                SwipeLayout.this.mo86585m();
            }
            return super.onSingleTapUp(motionEvent);
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            boolean z;
            if (SwipeLayout.this.f59635g != null) {
                View currentBottomView = SwipeLayout.this.getCurrentBottomView();
                View surfaceView = SwipeLayout.this.getSurfaceView();
                if (currentBottomView == null || motionEvent.getX() <= ((float) currentBottomView.getLeft()) || motionEvent.getX() >= ((float) currentBottomView.getRight()) || motionEvent.getY() <= ((float) currentBottomView.getTop()) || motionEvent.getY() >= ((float) currentBottomView.getBottom())) {
                    currentBottomView = surfaceView;
                }
                AbstractC24118a aVar = SwipeLayout.this.f59635g;
                SwipeLayout swipeLayout = SwipeLayout.this;
                if (currentBottomView == surfaceView) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo86609a(swipeLayout, z);
            }
            return true;
        }
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    private void setCurrentDragEdge(DragEdge dragEdge) {
        this.f59631c = dragEdge;
        m88089p();
    }

    /* renamed from: a */
    public void mo86554a(AbstractC24123f fVar) {
        this.f59634f.add(fVar);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f59629a = onClickListener;
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.f59630b = onLongClickListener;
    }

    public void setShowMode(ShowMode showMode) {
        this.f59633e = showMode;
        requestLayout();
    }

    public void setBottomSwipeEnabled(boolean z) {
        this.f59646s[DragEdge.Bottom.ordinal()] = z;
    }

    public void setDragDistance(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f59632d = m88083a((float) i);
        requestLayout();
    }

    public void setDragEdges(DragEdge... dragEdgeArr) {
        mo86559b();
        setDragEdges(Arrays.asList(dragEdgeArr));
    }

    public void setLeftSwipeEnabled(boolean z) {
        this.f59646s[DragEdge.Left.ordinal()] = z;
    }

    public void setRightSwipeEnabled(boolean z) {
        this.f59646s[DragEdge.Right.ordinal()] = z;
    }

    public void setTopSwipeEnabled(boolean z) {
        this.f59646s[DragEdge.Top.ordinal()] = z;
    }

    /* renamed from: a */
    private int m88083a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setDragEdge(DragEdge dragEdge) {
        mo86559b();
        if (getChildCount() >= 2) {
            this.f59639l.put(dragEdge, getChildAt(getChildCount() - 2));
        }
        setCurrentDragEdge(dragEdge);
    }

    public void onViewRemoved(View view) {
        for (Map.Entry entry : new HashMap(this.f59639l).entrySet()) {
            if (entry.getValue() == view) {
                this.f59639l.remove(entry.getKey());
            }
        }
    }

    /* renamed from: a */
    private Rect m88085a(boolean z) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (z) {
            if (this.f59631c == DragEdge.Left) {
                paddingLeft = this.f59632d + getPaddingLeft();
            } else if (this.f59631c == DragEdge.Right) {
                paddingLeft = getPaddingLeft() - this.f59632d;
            } else if (this.f59631c == DragEdge.Top) {
                paddingTop = this.f59632d + getPaddingTop();
            } else {
                paddingTop = getPaddingTop() - this.f59632d;
            }
        }
        Log.m165379d("SwipeLayout", "computeSurfaceLayoutArea l=" + paddingLeft + ";l + getMeasuredWidth()=" + (getMeasuredWidth() + paddingLeft));
        return new Rect(paddingLeft, paddingTop, getMeasuredWidth() + paddingLeft, getMeasuredHeight() + paddingTop);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!mo86566e()) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        this.f59628C.onTouchEvent(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    m88086b(motionEvent);
                    if (this.f59652y) {
                        Log.m165379d("SwipeLayout", "onTouchEvent getParent().requestDisallowInterceptTouchEvent(true);");
                        getParent().requestDisallowInterceptTouchEvent(true);
                        this.f59638k.mo4872b(motionEvent);
                    }
                } else if (actionMasked != 3) {
                    this.f59638k.mo4872b(motionEvent);
                }
            }
            this.f59652y = false;
            this.f59638k.mo4872b(motionEvent);
        } else {
            this.f59638k.mo4872b(motionEvent);
            this.f59653z = motionEvent.getRawX();
            this.f59626A = motionEvent.getRawY();
        }
        if (super.onTouchEvent(motionEvent) || this.f59652y || actionMasked == 0) {
            return true;
        }
        return false;
    }

    public void setDragEdges(List<DragEdge> list) {
        mo86559b();
        int min = Math.min(list.size(), getChildCount() - 1);
        for (int i = 0; i < min; i++) {
            this.f59639l.put(list.get(i), getChildAt(i));
        }
        if (list.size() == 0 || list.contains(f59625i)) {
            setCurrentDragEdge(f59625i);
        } else {
            setCurrentDragEdge(list.get(0));
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (!mo86566e()) {
            return false;
        }
        if (this.f59636h && getOpenStatus() == Status.Open && mo86556a(motionEvent)) {
            return true;
        }
        for (AbstractC24121d dVar : this.f59641n) {
            if (dVar != null && dVar.mo86612a(motionEvent)) {
                return false;
            }
        }
        Log.m165379d("SwipeLayout", "onInterceptTouchEvent ev.getAction() =" + motionEvent.getAction());
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    Log.m165379d("SwipeLayout", "onInterceptTouchEvent MotionEvent.ACTION_MOVE  mIsBeingDragged= " + this.f59652y);
                    boolean z = this.f59652y;
                    Log.m165379d("SwipeLayout", "onInterceptTouchEvent MotionEvent.ACTION_MOVE  beforeCheck=" + z);
                    m88086b(motionEvent);
                    if (this.f59652y && (parent = getParent()) != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!z && this.f59652y) {
                        Log.m165379d("SwipeLayout", "onInterceptTouchEvent MotionEvent.ACTION_MOVE  return false");
                        return false;
                    }
                } else if (action != 3) {
                    this.f59638k.mo4872b(motionEvent);
                }
            }
            this.f59652y = false;
            this.f59638k.mo4872b(motionEvent);
        } else {
            this.f59638k.mo4872b(motionEvent);
            this.f59652y = false;
            this.f59653z = motionEvent.getRawX();
            this.f59626A = motionEvent.getRawY();
            if (getOpenStatus() == Status.Middle) {
                this.f59652y = true;
            }
            Log.m165379d("SwipeLayout", "onInterceptTouchEvent MotionEvent.ACTION_DOWN  mIsBeingDragged= " + this.f59652y);
        }
        return this.f59652y;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x015a  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m88086b(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.hashtag.widget.SwipeLayout.m88086b(android.view.MotionEvent):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Rect mo86547a(View view) {
        Rect rect = new Rect(view.getLeft(), view.getTop(), 0, 0);
        View view2 = view;
        while (view2.getParent() != null && view2 != getRootView() && (view2 = (View) view2.getParent()) != this) {
            rect.left += view2.getLeft();
            rect.top += view2.getTop();
        }
        rect.right = rect.left + view.getMeasuredWidth();
        rect.bottom = rect.top + view.getMeasuredHeight();
        return rect;
    }

    /* renamed from: a */
    public Rect mo86548a(DragEdge dragEdge) {
        int i;
        int i2;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        if (dragEdge == DragEdge.Right) {
            paddingLeft = getMeasuredWidth() - this.f59632d;
        } else if (dragEdge == DragEdge.Bottom) {
            paddingTop = getMeasuredHeight() - this.f59632d;
        }
        if (dragEdge == DragEdge.Left || dragEdge == DragEdge.Right) {
            i = this.f59632d + paddingLeft;
            i2 = getMeasuredHeight();
        } else {
            i = getMeasuredWidth() + paddingLeft;
            i2 = this.f59632d;
        }
        Log.m165379d("SwipeLayout", "computeBottomLayDown bl=" + paddingLeft + ";br=" + i);
        return new Rect(paddingLeft, paddingTop, i, i2 + paddingTop);
    }

    public SwipeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public void mo86561b(boolean z, boolean z2) {
        View surfaceView = getSurfaceView();
        if (surfaceView != null) {
            if (z) {
                this.f59638k.mo4868a(getSurfaceView(), getPaddingLeft(), getPaddingTop());
            } else {
                Rect a = m88085a(false);
                int left = a.left - surfaceView.getLeft();
                int top = a.top - surfaceView.getTop();
                surfaceView.layout(a.left, a.top, a.right, a.bottom);
                if (z2) {
                    mo86560b(a.left, a.top, a.right, a.bottom);
                    mo86551a(a.left, a.top, left, top);
                } else {
                    m88087n();
                }
            }
            invalidate();
        }
    }

    /* renamed from: a */
    private Rect m88084a(ShowMode showMode, Rect rect) {
        View currentBottomView = getCurrentBottomView();
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if (showMode == ShowMode.PullOut) {
            if (this.f59631c == DragEdge.Left) {
                i = rect.left - this.f59632d;
            } else if (this.f59631c == DragEdge.Right) {
                i = rect.right;
            } else {
                i2 = this.f59631c == DragEdge.Top ? rect.top - this.f59632d : rect.bottom;
            }
            int i5 = 0;
            if (this.f59631c == DragEdge.Left || this.f59631c == DragEdge.Right) {
                int i6 = rect.bottom;
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredWidth();
                }
                i3 = i + i5;
                i4 = i6;
            } else {
                if (currentBottomView != null) {
                    i5 = currentBottomView.getMeasuredHeight();
                }
                i4 = i5 + i2;
                i3 = rect.right;
            }
        } else if (showMode == ShowMode.LayDown) {
            if (this.f59631c == DragEdge.Left) {
                i3 = i + this.f59632d;
            } else if (this.f59631c == DragEdge.Right) {
                i = i3 - this.f59632d;
            } else if (this.f59631c == DragEdge.Top) {
                i4 = i2 + this.f59632d;
            } else {
                i2 = i4 - this.f59632d;
            }
        }
        Log.m165379d("SwipeLayout", "computeBottomLayoutAreaViaSurface bl=" + i + ";br=" + i3);
        return new Rect(i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null) {
            int i2 = 0;
            try {
                i2 = ((Integer) layoutParams.getClass().getField("gravity").get(layoutParams)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i2 <= 0) {
                Iterator<Map.Entry<DragEdge, View>> it = this.f59639l.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<DragEdge, View> next = it.next();
                    if (next.getValue() == null) {
                        this.f59639l.put(next.getKey(), view);
                        break;
                    }
                }
            } else {
                int a = C0904f.m4351a(i2, ViewCompat.m4082h(this));
                if ((a & 3) == 3) {
                    this.f59639l.put(DragEdge.Left, view);
                }
                if ((a & 5) == 5) {
                    this.f59639l.put(DragEdge.Right, view);
                }
                if ((a & 48) == 48) {
                    this.f59639l.put(DragEdge.Top, view);
                }
                if ((a & 80) == 80) {
                    this.f59639l.put(DragEdge.Bottom, view);
                }
            }
            if (view.getParent() != this) {
                super.addView(view, i, layoutParams);
            }
        }
    }

    public SwipeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f59631c = f59625i;
        this.f59639l = new LinkedHashMap<>();
        this.f59640m = new float[4];
        this.f59634f = new ArrayList();
        this.f59641n = new ArrayList();
        this.f59642o = new HashMap();
        this.f59643p = new HashMap();
        this.f59644q = new HashMap();
        this.f59645r = true;
        this.f59646s = new boolean[]{true, true, true, true};
        this.f59636h = false;
        this.f59647t = 0.75f;
        this.f59648u = 0.25f;
        this.f59649v = 0;
        this.f59650w = new C0959c.AbstractC0962a() {
            /* class com.larksuite.component.blockit.hashtag.widget.SwipeLayout.C241141 */

            /* renamed from: a */
            boolean f59654a = true;

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public int mo4896b(View view) {
                return SwipeLayout.this.f59632d;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public int mo4889a(View view) {
                Log.m165379d("SwipeLayout", "getViewHorizontalDragRange  mDragDistance=" + SwipeLayout.this.f59632d);
                return SwipeLayout.this.f59632d;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public boolean mo4900b(View view, int i) {
                boolean z;
                boolean z2 = false;
                if (view == SwipeLayout.this.getSurfaceView() || SwipeLayout.this.getBottomViews().contains(view)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (SwipeLayout.this.getOpenStatus() == Status.Close) {
                        z2 = true;
                    }
                    this.f59654a = z2;
                }
                return z;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public void mo4893a(View view, float f, float f2) {
                super.mo4893a(view, f, f2);
                SwipeLayout.this.mo86550a(f, f2, this.f59654a);
                for (AbstractC24123f fVar : SwipeLayout.this.f59634f) {
                    fVar.mo86616a(SwipeLayout.this, f, f2);
                }
                SwipeLayout.this.invalidate();
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public int mo4890a(View view, int i, int i2) {
                if (view == SwipeLayout.this.getSurfaceView()) {
                    Log.m165379d("SwipeLayout", "clampViewPositionHorizontal child == getSurfaceView()");
                    int i3 = C241174.f59658a[SwipeLayout.this.f59631c.ordinal()];
                    if (i3 == 1 || i3 == 2) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                    if (i3 == 3) {
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Left: left=" + i);
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Left: mDragDistance=" + SwipeLayout.this.f59632d);
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Left: getPaddingLeft()=" + SwipeLayout.this.getPaddingLeft());
                        if (i < SwipeLayout.this.getPaddingLeft()) {
                            return SwipeLayout.this.getPaddingLeft();
                        }
                        if (i > SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getPaddingLeft() + SwipeLayout.this.f59632d;
                        }
                    } else if (i3 == 4) {
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Left: left=" + i);
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Right: getPaddingLeft()=" + SwipeLayout.this.getPaddingLeft());
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Right: mDragDistance=" + SwipeLayout.this.f59632d);
                        Log.m165379d("SwipeLayout", "clampViewPositionHorizontal Right: getPaddingLeft() - mDragDistance=" + (SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.f59632d));
                        if (i > SwipeLayout.this.getPaddingLeft()) {
                            return SwipeLayout.this.getPaddingLeft();
                        }
                        if (i < SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getPaddingLeft() - SwipeLayout.this.f59632d;
                        }
                    }
                } else if (SwipeLayout.this.getCurrentBottomView() == view) {
                    Log.m165379d("SwipeLayout", "clampViewPositionHorizontal  getCurrentBottomView() == child");
                    int i4 = C241174.f59658a[SwipeLayout.this.f59631c.ordinal()];
                    if (i4 == 1 || i4 == 2) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                    if (i4 != 3) {
                        if (i4 == 4 && SwipeLayout.this.f59633e == ShowMode.PullOut && i < SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getMeasuredWidth() - SwipeLayout.this.f59632d;
                        }
                    } else if (SwipeLayout.this.f59633e == ShowMode.PullOut && i > SwipeLayout.this.getPaddingLeft()) {
                        return SwipeLayout.this.getPaddingLeft();
                    }
                }
                return i;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: b */
            public int mo4897b(View view, int i, int i2) {
                int i3;
                if (view == SwipeLayout.this.getSurfaceView()) {
                    int i4 = C241174.f59658a[SwipeLayout.this.f59631c.ordinal()];
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3 || i4 == 4) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        } else if (i < SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f59632d;
                        } else {
                            if (i > SwipeLayout.this.getPaddingTop()) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        }
                    } else if (i < SwipeLayout.this.getPaddingTop()) {
                        return SwipeLayout.this.getPaddingTop();
                    } else {
                        if (i > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f59632d;
                        }
                    }
                } else {
                    View surfaceView = SwipeLayout.this.getSurfaceView();
                    if (surfaceView == null) {
                        i3 = 0;
                    } else {
                        i3 = surfaceView.getTop();
                    }
                    int i5 = C241174.f59658a[SwipeLayout.this.f59631c.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 == 3 || i5 == 4) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                        } else if (SwipeLayout.this.f59633e != ShowMode.PullOut) {
                            int i6 = i3 + i2;
                            if (i6 >= SwipeLayout.this.getPaddingTop()) {
                                return SwipeLayout.this.getPaddingTop();
                            }
                            if (i6 <= SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f59632d) {
                                return SwipeLayout.this.getPaddingTop() - SwipeLayout.this.f59632d;
                            }
                        } else if (i < SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getMeasuredHeight() - SwipeLayout.this.f59632d;
                        }
                    } else if (SwipeLayout.this.f59633e != ShowMode.PullOut) {
                        int i7 = i3 + i2;
                        if (i7 < SwipeLayout.this.getPaddingTop()) {
                            return SwipeLayout.this.getPaddingTop();
                        }
                        if (i7 > SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f59632d) {
                            return SwipeLayout.this.getPaddingTop() + SwipeLayout.this.f59632d;
                        }
                    } else if (i > SwipeLayout.this.getPaddingTop()) {
                        return SwipeLayout.this.getPaddingTop();
                    }
                }
                return i;
            }

            @Override // androidx.customview.p030a.C0959c.AbstractC0962a
            /* renamed from: a */
            public void mo4895a(View view, int i, int i2, int i3, int i4) {
                View surfaceView = SwipeLayout.this.getSurfaceView();
                if (surfaceView != null) {
                    View currentBottomView = SwipeLayout.this.getCurrentBottomView();
                    int left = surfaceView.getLeft();
                    int right = surfaceView.getRight();
                    int top = surfaceView.getTop();
                    int bottom = surfaceView.getBottom();
                    if (view == surfaceView) {
                        if (SwipeLayout.this.f59633e == ShowMode.PullOut && currentBottomView != null) {
                            if (SwipeLayout.this.f59631c == DragEdge.Left || SwipeLayout.this.f59631c == DragEdge.Right) {
                                currentBottomView.offsetLeftAndRight(i3);
                            } else {
                                currentBottomView.offsetTopAndBottom(i4);
                            }
                        }
                    } else if (SwipeLayout.this.getBottomViews().contains(view)) {
                        if (SwipeLayout.this.f59633e == ShowMode.PullOut) {
                            surfaceView.offsetLeftAndRight(i3);
                            surfaceView.offsetTopAndBottom(i4);
                        } else {
                            SwipeLayout swipeLayout = SwipeLayout.this;
                            Rect a = swipeLayout.mo86548a(swipeLayout.f59631c);
                            if (currentBottomView != null) {
                                currentBottomView.layout(a.left, a.top, a.right, a.bottom);
                            }
                            int left2 = surfaceView.getLeft() + i3;
                            int top2 = surfaceView.getTop() + i4;
                            if (SwipeLayout.this.f59631c == DragEdge.Left && left2 < SwipeLayout.this.getPaddingLeft()) {
                                left2 = SwipeLayout.this.getPaddingLeft();
                            } else if (SwipeLayout.this.f59631c == DragEdge.Right && left2 > SwipeLayout.this.getPaddingLeft()) {
                                left2 = SwipeLayout.this.getPaddingLeft();
                            } else if (SwipeLayout.this.f59631c == DragEdge.Top && top2 < SwipeLayout.this.getPaddingTop()) {
                                top2 = SwipeLayout.this.getPaddingTop();
                            } else if (SwipeLayout.this.f59631c == DragEdge.Bottom && top2 > SwipeLayout.this.getPaddingTop()) {
                                top2 = SwipeLayout.this.getPaddingTop();
                            }
                            surfaceView.layout(left2, top2, SwipeLayout.this.getMeasuredWidth() + left2, SwipeLayout.this.getMeasuredHeight() + top2);
                        }
                    }
                    SwipeLayout.this.mo86560b(left, top, right, bottom);
                    SwipeLayout.this.mo86551a(left, top, i3, i4);
                    SwipeLayout.this.invalidate();
                    SwipeLayout.this.mo86549a();
                }
            }
        };
        this.f59653z = -1.0f;
        this.f59626A = -1.0f;
        this.f59628C = new GestureDetector(getContext(), new C24122e());
        this.f59638k = C0959c.m4642a(this, this.f59650w);
        this.f59637j = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bottomEdgeSwipeOffset, R.attr.clickToClose, R.attr.drag_edge, R.attr.leftEdgeSwipeOffset, R.attr.rightEdgeSwipeOffset, R.attr.show_mode, R.attr.topEdgeSwipeOffset});
        int i2 = obtainStyledAttributes.getInt(2, 2);
        this.f59640m[DragEdge.Left.ordinal()] = obtainStyledAttributes.getDimension(3, BitmapDescriptorFactory.HUE_RED);
        this.f59640m[DragEdge.Right.ordinal()] = obtainStyledAttributes.getDimension(4, BitmapDescriptorFactory.HUE_RED);
        this.f59640m[DragEdge.Top.ordinal()] = obtainStyledAttributes.getDimension(6, BitmapDescriptorFactory.HUE_RED);
        this.f59640m[DragEdge.Bottom.ordinal()] = obtainStyledAttributes.getDimension(0, BitmapDescriptorFactory.HUE_RED);
        setClickToClose(obtainStyledAttributes.getBoolean(1, this.f59636h));
        if ((i2 & 1) == 1) {
            this.f59639l.put(DragEdge.Left, null);
        }
        if ((i2 & 4) == 4) {
            this.f59639l.put(DragEdge.Top, null);
        }
        if ((i2 & 2) == 2) {
            this.f59639l.put(DragEdge.Right, null);
        }
        if ((i2 & 8) == 8) {
            this.f59639l.put(DragEdge.Bottom, null);
        }
        this.f59633e = ShowMode.values()[obtainStyledAttributes.getInt(5, ShowMode.PullOut.ordinal())];
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo86551a(int i, int i2, int i3, int i4) {
        DragEdge dragEdge = getDragEdge();
        boolean z = false;
        if (dragEdge != DragEdge.Left ? dragEdge != DragEdge.Right ? dragEdge != DragEdge.Top ? dragEdge != DragEdge.Bottom || i4 <= 0 : i4 >= 0 : i3 <= 0 : i3 >= 0) {
            z = true;
        }
        mo86552a(i, i2, z);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f9  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo86560b(int r16, int r17, int r18, int r19) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.blockit.hashtag.widget.SwipeLayout.mo86560b(int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        m88089p();
        if (this.f59651x != null) {
            for (int i5 = 0; i5 < this.f59651x.size(); i5++) {
                this.f59651x.get(i5).mo86610a(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo86562b(View view, Rect rect, DragEdge dragEdge, int i, int i2, int i3, int i4) {
        int i5 = rect.left;
        int i6 = rect.right;
        int i7 = rect.top;
        int i8 = rect.bottom;
        if (getShowMode() == ShowMode.LayDown) {
            int i9 = C241174.f59658a[dragEdge.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i9 == 4 && i3 > i5 && i3 <= i6) {
                            return true;
                        }
                        return false;
                    } else if (i >= i6 || i < i5) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i4 <= i7 || i4 > i8) {
                    return false;
                } else {
                    return true;
                }
            } else if (i2 < i7 || i2 >= i8) {
                return false;
            } else {
                return true;
            }
        } else if (getShowMode() != ShowMode.PullOut) {
            return false;
        } else {
            int i10 = C241174.f59658a[dragEdge.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4 && i5 <= getWidth() && i6 > getWidth()) {
                            return true;
                        }
                        return false;
                    } else if (i6 < getPaddingLeft() || i5 >= getPaddingLeft()) {
                        return false;
                    } else {
                        return true;
                    }
                } else if (i7 >= getHeight() || i7 < getPaddingTop()) {
                    return false;
                } else {
                    return true;
                }
            } else if (i7 >= getPaddingTop() || i8 < getPaddingTop()) {
                return false;
            } else {
                return true;
            }
        }
    }
}
