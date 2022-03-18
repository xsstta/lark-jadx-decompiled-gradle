package com.ss.android.lark.widget.ptr;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import android.widget.TextView;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mm.module.participant.ParticipantRepo;
import com.ss.android.lark.widget.ptr.p2961a.C58935a;
import java.util.ArrayList;

public class LKUIPtrFrameLayout extends ViewGroup {
    public static boolean DEBUG = false;
    private static byte FLAG_AUTO_REFRESH_AT_ONCE = 1;
    private static byte FLAG_AUTO_REFRESH_BUT_LATER = 2;
    private static byte FLAG_ENABLE_NEXT_PTR_AT_ONCE = 4;
    private static byte FLAG_PIN_CONTENT = 8;
    private static int ID = 1;
    private static byte MASK_AUTO_REFRESH = 3;
    protected final String LOG_TAG;
    private int mContainerId;
    protected View mContent;
    private boolean mDisableWhenHorizontalMove;
    private int mDurationToBackFooter;
    private int mDurationToBackHeader;
    private int mDurationToCloseFooter;
    private int mDurationToCloseHeader;
    public boolean mEnableScrollContentAfterLoad;
    public boolean mEnableScrollContentAfterRefresh;
    private int mFlag;
    private int mFooterHeight;
    private int mFooterId;
    private View mFooterView;
    private boolean mForceBackWhenComplete;
    private boolean mHasSendCancelEvent;
    private int mHeaderHeight;
    private int mHeaderId;
    private View mHeaderView;
    private boolean mKeepHeaderWhenRefresh;
    private MotionEvent mLastMoveEvent;
    private int mLoadingMinTime;
    private long mLoadingStartTime;
    private Mode mMode;
    private int mPagingTouchSlop;
    private Runnable mPerformRefreshCompleteDelay;
    private boolean mPreventForHorizontal;
    private LKUIPtrHandler mPtrHandler;
    public C58935a mPtrIndicator;
    private C58936b mPtrUIHandlerHolder;
    private boolean mPullToRefresh;
    private AbstractRunnableC58938c mRefreshCompleteHook;
    private RunnableC58933a mScrollChecker;
    private byte mStatus;

    public enum Mode {
        NONE,
        REFRESH,
        LOAD_MORE,
        BOTH
    }

    private void onPositionChange(boolean z, byte b, C58935a aVar) {
    }

    public void setInterceptEventWhileWorking(boolean z) {
    }

    public float getDurationToClose() {
        return (float) this.mDurationToCloseHeader;
    }

    public long getDurationToCloseFooter() {
        return (long) this.mDurationToCloseFooter;
    }

    public long getDurationToCloseHeader() {
        return (long) this.mDurationToCloseHeader;
    }

    public View getContentView() {
        return this.mContent;
    }

    public int getDurationToBackFooter() {
        return this.mDurationToBackFooter;
    }

    public int getDurationToBackHeader() {
        return this.mDurationToBackHeader;
    }

    public int getFooterHeight() {
        return this.mFooterHeight;
    }

    public int getHeaderHeight() {
        return this.mHeaderHeight;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    public Mode getMode() {
        return this.mMode;
    }

    public boolean isForceBackWhenComplete() {
        return this.mForceBackWhenComplete;
    }

    public boolean isKeepHeaderWhenRefresh() {
        return this.mKeepHeaderWhenRefresh;
    }

    public boolean isPullToRefresh() {
        return this.mPullToRefresh;
    }

    private void tryScrollBackToTopAbortRefresh() {
        tryScrollBackToTop(false);
    }

    private void tryScrollBackToTopAfterComplete() {
        tryScrollBackToTop(true);
    }

    private void tryScrollBackToTopWhileLoading() {
        tryScrollBackToTop(true);
    }

    public void autoLoadMore() {
        autoRefresh(true, false);
    }

    public void autoRefresh() {
        autoRefresh(true, true);
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public int getOffsetToKeepHeaderWhileLoading() {
        return this.mPtrIndicator.mo199933x();
    }

    public int getOffsetToRefresh() {
        return this.mPtrIndicator.mo199918i();
    }

    public float getRatioOfHeaderToHeightRefresh() {
        return this.mPtrIndicator.mo199917h();
    }

    public float getResistanceFooter() {
        return this.mPtrIndicator.mo199909d();
    }

    public float getResistanceHeader() {
        return this.mPtrIndicator.mo199905c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout$a */
    public class RunnableC58933a implements Runnable {

        /* renamed from: a */
        public boolean f145921a;

        /* renamed from: c */
        private int f145923c;

        /* renamed from: d */
        private Scroller f145924d;

        /* renamed from: e */
        private int f145925e;

        /* renamed from: f */
        private int f145926f;

        /* renamed from: d */
        private void m228715d() {
            this.f145921a = false;
            this.f145923c = 0;
            LKUIPtrFrameLayout.this.removeCallbacks(this);
        }

        /* renamed from: a */
        public void mo199888a() {
            m228715d();
            if (!this.f145924d.isFinished()) {
                this.f145924d.forceFinished(true);
            }
        }

        /* renamed from: b */
        public void mo199891b() {
            if (this.f145921a) {
                if (!this.f145924d.isFinished()) {
                    this.f145924d.forceFinished(true);
                }
                LKUIPtrFrameLayout.this.onPtrScrollAbort();
                m228715d();
            }
        }

        /* renamed from: c */
        private void m228714c() {
            if (LKUIPtrFrameLayout.DEBUG) {
                Log.m165379d(LKUIPtrFrameLayout.this.LOG_TAG, String.format("finish, currentPos:%s", Integer.valueOf(LKUIPtrFrameLayout.this.mPtrIndicator.mo199922m())));
            }
            m228715d();
            LKUIPtrFrameLayout.this.onPtrScrollFinish();
        }

        public void run() {
            boolean z;
            if (!this.f145924d.computeScrollOffset() || this.f145924d.isFinished()) {
                z = true;
            } else {
                z = false;
            }
            int currY = this.f145924d.getCurrY();
            int i = currY - this.f145923c;
            if (LKUIPtrFrameLayout.DEBUG && i != 0) {
                Log.m165379d(LKUIPtrFrameLayout.this.LOG_TAG, String.format("scroll: %s, start: %s, to: %s, currentPos: %s, current :%s, last: %s, delta: %s", Boolean.valueOf(z), Integer.valueOf(this.f145925e), Integer.valueOf(this.f145926f), Integer.valueOf(LKUIPtrFrameLayout.this.mPtrIndicator.mo199922m()), Integer.valueOf(currY), Integer.valueOf(this.f145923c), Integer.valueOf(i)));
            }
            if (!z) {
                this.f145923c = currY;
                if (LKUIPtrFrameLayout.this.mPtrIndicator.mo199900a()) {
                    LKUIPtrFrameLayout.this.moveHeaderPos((float) i);
                } else {
                    LKUIPtrFrameLayout.this.moveFooterPos((float) (-i));
                }
                LKUIPtrFrameLayout.this.post(this);
                return;
            }
            m228714c();
        }

        public RunnableC58933a() {
            this.f145924d = new Scroller(LKUIPtrFrameLayout.this.getContext());
        }

        /* renamed from: a */
        public void mo199889a(int i, int i2) {
            mo199890a(i, i2, false);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00e0  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo199890a(int r9, int r10, boolean r11) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout.RunnableC58933a.mo199890a(int, int, boolean):void");
        }
    }

    private void clearFlag() {
        this.mFlag &= ~MASK_AUTO_REFRESH;
    }

    private boolean performAutoRefreshButLater() {
        if ((this.mFlag & MASK_AUTO_REFRESH) == FLAG_AUTO_REFRESH_BUT_LATER) {
            return true;
        }
        return false;
    }

    public boolean isAutoRefresh() {
        if ((this.mFlag & MASK_AUTO_REFRESH) > 0) {
            return true;
        }
        return false;
    }

    public boolean isEnabledNextPtrAtOnce() {
        if ((this.mFlag & FLAG_ENABLE_NEXT_PTR_AT_ONCE) > 0) {
            return true;
        }
        return false;
    }

    public boolean isPinContent() {
        if ((this.mFlag & FLAG_PIN_CONTENT) > 0) {
            return true;
        }
        return false;
    }

    public boolean isRefreshing() {
        if (this.mStatus == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        RunnableC58933a aVar = this.mScrollChecker;
        if (aVar != null) {
            aVar.mo199888a();
        }
        Runnable runnable = this.mPerformRefreshCompleteDelay;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onPtrScrollAbort() {
        if (this.mPtrIndicator.mo199924o() && isAutoRefresh()) {
            if (DEBUG) {
                Log.m165379d(this.LOG_TAG, "call onRelease after scroll abort");
            }
            onRelease(true);
        }
    }

    /* access modifiers changed from: protected */
    public void onPtrScrollFinish() {
        if (this.mPtrIndicator.mo199924o() && isAutoRefresh()) {
            if (DEBUG) {
                Log.m165379d(this.LOG_TAG, "call onRelease after scroll finish");
            }
            onRelease(true);
        }
    }

    private void performRefresh() {
        this.mLoadingStartTime = System.currentTimeMillis();
        if (this.mPtrUIHandlerHolder.mo199935a()) {
            this.mPtrUIHandlerHolder.mo166241c(this);
            if (DEBUG) {
                Log.m165389i(this.LOG_TAG, "LKUIPtrUIHandler: onUIRefreshBegin");
            }
        }
        if (this.mPtrHandler == null) {
            return;
        }
        if (this.mPtrIndicator.mo199900a()) {
            this.mPtrHandler.onRefreshBegin(this);
            return;
        }
        LKUIPtrHandler lKUIPtrHandler = this.mPtrHandler;
        if (lKUIPtrHandler instanceof LKUIPtrHandler2) {
            ((LKUIPtrHandler2) lKUIPtrHandler).onLoadMoreBegin(this);
        }
    }

    private void sendCancelEvent() {
        if (DEBUG) {
            Log.m165379d(this.LOG_TAG, "send cancel event");
        }
        MotionEvent motionEvent = this.mLastMoveEvent;
        if (motionEvent != null) {
            dispatchTouchEventSupper(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime() + ((long) ViewConfiguration.getLongPressTimeout()), 3, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    private void sendDownEvent() {
        if (DEBUG) {
            Log.m165379d(this.LOG_TAG, "send down event");
        }
        MotionEvent motionEvent = this.mLastMoveEvent;
        if (motionEvent != null) {
            dispatchTouchEventSupper(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState()));
        }
    }

    private boolean tryToNotifyReset() {
        byte b = this.mStatus;
        if ((b != 4 && b != 2) || !this.mPtrIndicator.mo199929t()) {
            return false;
        }
        if (this.mPtrUIHandlerHolder.mo199935a()) {
            this.mPtrUIHandlerHolder.mo166237a(this);
            if (DEBUG) {
                Log.m165389i(this.LOG_TAG, "LKUIPtrUIHandler: onUIReset");
            }
        }
        this.mStatus = 1;
        clearFlag();
        return true;
    }

    private boolean tryToPerformRefresh() {
        if (this.mStatus != 2) {
            return false;
        }
        if ((this.mPtrIndicator.mo199932w() && isAutoRefresh()) || this.mPtrIndicator.mo199927r()) {
            this.mStatus = 3;
            performRefresh();
        }
        return false;
    }

    public void performRefreshComplete() {
        this.mStatus = 4;
        if (!this.mScrollChecker.f145921a || !isAutoRefresh()) {
            notifyUIRefreshComplete(false);
        } else if (DEBUG) {
            Log.m165379d(this.LOG_TAG, String.format("performRefreshComplete do nothing, scrolling: %s, auto refresh: %s", Boolean.valueOf(this.mScrollChecker.f145921a), Integer.valueOf(this.mFlag)));
        }
    }

    public final void refreshComplete() {
        if (DEBUG) {
            Log.m165389i(this.LOG_TAG, "refreshComplete");
        }
        AbstractRunnableC58938c cVar = this.mRefreshCompleteHook;
        if (cVar != null) {
            cVar.mo199938b();
        }
        int currentTimeMillis = (int) (((long) this.mLoadingMinTime) - (System.currentTimeMillis() - this.mLoadingStartTime));
        if (currentTimeMillis <= 0) {
            if (DEBUG) {
                Log.m165379d(this.LOG_TAG, "performRefreshComplete at once");
            }
            performRefreshComplete();
            return;
        }
        postDelayed(this.mPerformRefreshCompleteDelay, (long) currentTimeMillis);
        if (DEBUG) {
            Log.m165379d(this.LOG_TAG, String.format("performRefreshComplete after delay: %s", Integer.valueOf(currentTimeMillis)));
        }
    }

    private void layoutChildren() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (this.mPtrIndicator.mo199900a()) {
            i2 = this.mPtrIndicator.mo199922m();
            i = 0;
        } else {
            i = this.mPtrIndicator.mo199922m();
            i2 = 0;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        View view = this.mHeaderView;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i10 = marginLayoutParams.leftMargin + paddingLeft;
            int i11 = ((marginLayoutParams.topMargin + paddingTop) + i2) - this.mHeaderHeight;
            this.mHeaderView.layout(i10, i11, this.mHeaderView.getMeasuredWidth() + i10, this.mHeaderView.getMeasuredHeight() + i11);
        }
        View view2 = this.mContent;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
            if (this.mPtrIndicator.mo199900a()) {
                i5 = marginLayoutParams2.leftMargin + paddingLeft;
                int i12 = marginLayoutParams2.topMargin + paddingTop;
                if (isPinContent()) {
                    i2 = 0;
                }
                i6 = i12 + i2;
                i7 = this.mContent.getMeasuredWidth() + i5;
                i4 = this.mContent.getMeasuredHeight();
            } else {
                i5 = paddingLeft + marginLayoutParams2.leftMargin;
                int i13 = marginLayoutParams2.topMargin + paddingTop;
                if (isPinContent()) {
                    i8 = 0;
                } else {
                    i8 = i;
                }
                i6 = i13 - i8;
                i7 = this.mContent.getMeasuredWidth() + i5;
                i4 = this.mContent.getMeasuredHeight();
            }
            i3 = i4 + i6;
            this.mContent.layout(i5, i6, i7, i3);
        } else {
            i3 = 0;
        }
        View view3 = this.mFooterView;
        if (view3 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
            int i14 = paddingLeft + marginLayoutParams3.leftMargin;
            int i15 = paddingTop + marginLayoutParams3.topMargin + i3;
            if (isPinContent()) {
                i9 = i;
            }
            int i16 = i15 - i9;
            this.mFooterView.layout(i14, i16, this.mFooterView.getMeasuredWidth() + i14, this.mFooterView.getMeasuredHeight() + i16);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        int childCount = getChildCount();
        if (childCount <= 3) {
            if (childCount == 3) {
                int i = this.mHeaderId;
                if (i != 0 && this.mHeaderView == null) {
                    this.mHeaderView = findViewById(i);
                }
                int i2 = this.mContainerId;
                if (i2 != 0 && this.mContent == null) {
                    this.mContent = findViewById(i2);
                }
                int i3 = this.mFooterId;
                if (i3 != 0 && this.mFooterView == null) {
                    this.mFooterView = findViewById(i3);
                }
                if (this.mContent == null || this.mHeaderView == null || this.mFooterView == null) {
                    View childAt = getChildAt(0);
                    View childAt2 = getChildAt(1);
                    View childAt3 = getChildAt(2);
                    if (this.mContent == null && this.mHeaderView == null && this.mFooterView == null) {
                        this.mHeaderView = childAt;
                        this.mContent = childAt2;
                        this.mFooterView = childAt3;
                    } else {
                        C589312 r0 = new ArrayList<View>(3, childAt, childAt2, childAt3) {
                            /* class com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout.C589312 */
                            final /* synthetic */ View val$child1;
                            final /* synthetic */ View val$child2;
                            final /* synthetic */ View val$child3;

                            {
                                this.val$child1 = r3;
                                this.val$child2 = r4;
                                this.val$child3 = r5;
                                add(r3);
                                add(r4);
                                add(r5);
                            }
                        };
                        View view = this.mHeaderView;
                        if (view != null) {
                            r0.remove(view);
                        }
                        View view2 = this.mContent;
                        if (view2 != null) {
                            r0.remove(view2);
                        }
                        View view3 = this.mFooterView;
                        if (view3 != null) {
                            r0.remove(view3);
                        }
                        if (this.mHeaderView == null && r0.size() > 0) {
                            this.mHeaderView = (View) r0.get(0);
                            r0.remove(0);
                        }
                        if (this.mContent == null && r0.size() > 0) {
                            this.mContent = (View) r0.get(0);
                            r0.remove(0);
                        }
                        if (this.mFooterView == null && r0.size() > 0) {
                            this.mFooterView = (View) r0.get(0);
                            r0.remove(0);
                        }
                    }
                }
            } else if (childCount == 2) {
                int i4 = this.mHeaderId;
                if (i4 != 0 && this.mHeaderView == null) {
                    this.mHeaderView = findViewById(i4);
                }
                int i5 = this.mContainerId;
                if (i5 != 0 && this.mContent == null) {
                    this.mContent = findViewById(i5);
                }
                if (this.mContent == null || this.mHeaderView == null) {
                    View childAt4 = getChildAt(0);
                    View childAt5 = getChildAt(1);
                    if (childAt4 instanceof AbstractC58934a) {
                        this.mHeaderView = childAt4;
                        this.mContent = childAt5;
                    } else if (childAt5 instanceof AbstractC58934a) {
                        this.mHeaderView = childAt5;
                        this.mContent = childAt4;
                    } else {
                        View view4 = this.mContent;
                        if (view4 == null && this.mHeaderView == null) {
                            this.mHeaderView = childAt4;
                            this.mContent = childAt5;
                        } else {
                            View view5 = this.mHeaderView;
                            if (view5 == null) {
                                if (view4 == childAt4) {
                                    childAt4 = childAt5;
                                }
                                this.mHeaderView = childAt4;
                            } else {
                                if (view5 == childAt4) {
                                    childAt4 = childAt5;
                                }
                                this.mContent = childAt4;
                            }
                        }
                    }
                }
            } else if (childCount == 1) {
                this.mContent = getChildAt(0);
            } else {
                TextView textView = new TextView(getContext());
                textView.setClickable(true);
                textView.setTextColor(-39424);
                textView.setGravity(17);
                textView.setTextSize(20.0f);
                textView.setText("The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?");
                this.mContent = textView;
                addView(textView);
            }
            View view6 = this.mHeaderView;
            if (view6 != null) {
                if (view6 instanceof AbstractC58934a) {
                    addPtrUIHandler((AbstractC58934a) view6);
                }
                this.mHeaderView.bringToFront();
            }
            View view7 = this.mFooterView;
            if (view7 != null) {
                if (view7 instanceof AbstractC58934a) {
                    addPtrUIHandler((AbstractC58934a) view7);
                }
                this.mFooterView.bringToFront();
            }
            super.onFinishInflate();
            return;
        }
        throw new IllegalStateException("PtrFrameLayout only can host 3 elements");
    }

    public void disableWhenHorizontalMove(boolean z) {
        this.mDisableWhenHorizontalMove = z;
    }

    public void setDurationToBackFooter(int i) {
        this.mDurationToBackFooter = i;
    }

    public void setDurationToBackHeader(int i) {
        this.mDurationToBackHeader = i;
    }

    public void setDurationToCloseFooter(int i) {
        this.mDurationToCloseFooter = i;
    }

    public void setDurationToCloseHeader(int i) {
        this.mDurationToCloseHeader = i;
    }

    public void setEnableScrollContentAfterLoad(boolean z) {
        this.mEnableScrollContentAfterLoad = z;
    }

    public void setEnableScrollContentAfterRefresh(boolean z) {
        this.mEnableScrollContentAfterRefresh = z;
    }

    public void setForceBackWhenComplete(boolean z) {
        this.mForceBackWhenComplete = z;
    }

    public void setKeepHeaderWhenRefresh(boolean z) {
        this.mKeepHeaderWhenRefresh = z;
    }

    public void setLoadingMinTime(int i) {
        this.mLoadingMinTime = i;
    }

    public void setMode(Mode mode) {
        this.mMode = mode;
    }

    public void setPtrHandler(LKUIPtrHandler lKUIPtrHandler) {
        this.mPtrHandler = lKUIPtrHandler;
    }

    public void setPullToRefresh(boolean z) {
        this.mPullToRefresh = z;
    }

    public LKUIPtrFrameLayout(Context context) {
        this(context, null);
    }

    public void addPtrUIHandler(AbstractC58934a aVar) {
        C58936b.m228767a(this.mPtrUIHandlerHolder, aVar);
    }

    public boolean dispatchTouchEventSupper(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setDurationToBack(int i) {
        setDurationToBackHeader(i);
        setDurationToBackFooter(i);
    }

    public void setDurationToClose(int i) {
        setDurationToCloseHeader(i);
        setDurationToCloseFooter(i);
    }

    public void setOffsetToKeepHeaderWhileLoading(int i) {
        this.mPtrIndicator.mo199912e(i);
    }

    public void setOffsetToRefresh(int i) {
        this.mPtrIndicator.mo199896a(i);
    }

    public void setRatioOfHeaderHeightToRefresh(float f) {
        this.mPtrIndicator.mo199906c(f);
    }

    public void setResistance(float f) {
        setResistanceHeader(f);
        setResistanceFooter(f);
    }

    public void setResistanceFooter(float f) {
        this.mPtrIndicator.mo199901b(f);
    }

    public void setResistanceHeader(float f) {
        this.mPtrIndicator.mo199893a(f);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public void autoLoadMore(boolean z) {
        autoRefresh(z, false);
    }

    public void autoRefresh(boolean z) {
        autoRefresh(z, true);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || !(layoutParams instanceof LayoutParams)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void moveFooterPos(float f) {
        this.mPtrIndicator.mo199899a(false);
        movePos(-f);
    }

    public void moveHeaderPos(float f) {
        this.mPtrIndicator.mo199899a(true);
        movePos(f);
    }

    public void removePtrUIHandler(AbstractC58934a aVar) {
        this.mPtrUIHandlerHolder = C58936b.m228770b(this.mPtrUIHandlerHolder, aVar);
    }

    public void setPtrIndicator(C58935a aVar) {
        C58935a aVar2 = this.mPtrIndicator;
        if (!(aVar2 == null || aVar2 == aVar)) {
            aVar.mo199898a(aVar2);
        }
        this.mPtrIndicator = aVar;
    }

    public void setRefreshCompleteHook(AbstractRunnableC58938c cVar) {
        this.mRefreshCompleteHook = cVar;
        cVar.mo199939b(new Runnable() {
            /* class com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout.RunnableC589323 */

            public void run() {
                if (LKUIPtrFrameLayout.DEBUG) {
                    Log.m165379d(LKUIPtrFrameLayout.this.LOG_TAG, "mRefreshCompleteHook resume.");
                }
                LKUIPtrFrameLayout.this.notifyUIRefreshComplete(true);
            }
        });
    }

    private Mode getModeFromIndex(int i) {
        if (i == 0) {
            return Mode.NONE;
        }
        if (i == 1) {
            return Mode.REFRESH;
        }
        if (i == 2) {
            return Mode.LOAD_MORE;
        }
        if (i != 3) {
            return Mode.BOTH;
        }
        return Mode.BOTH;
    }

    public void setEnabledNextPtrAtOnce(boolean z) {
        if (z) {
            this.mFlag |= FLAG_ENABLE_NEXT_PTR_AT_ONCE;
        } else {
            this.mFlag &= ~FLAG_ENABLE_NEXT_PTR_AT_ONCE;
        }
    }

    public void setPinContent(boolean z) {
        if (z) {
            this.mFlag |= FLAG_PIN_CONTENT;
        } else {
            this.mFlag &= ~FLAG_PIN_CONTENT;
        }
    }

    private void tryScrollBackToTop(boolean z) {
        int i;
        if (!this.mPtrIndicator.mo199904b() && this.mPtrIndicator.mo199924o()) {
            RunnableC58933a aVar = this.mScrollChecker;
            if (this.mPtrIndicator.mo199900a()) {
                i = this.mDurationToCloseHeader;
            } else {
                i = this.mDurationToCloseFooter;
            }
            aVar.mo199890a(0, i, z);
        } else if (this.mForceBackWhenComplete && !this.mPtrIndicator.mo199900a() && this.mStatus == 4) {
            this.mScrollChecker.mo199890a(0, this.mDurationToCloseFooter, z);
        }
    }

    public void setFooterView(View view) {
        View view2 = this.mFooterView;
        if (!(view2 == null || view == null || view2 == view)) {
            removeView(view2);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new LayoutParams(-1, -2));
        }
        this.mFooterView = view;
        addView(view);
    }

    public void setHeaderView(View view) {
        View view2 = this.mHeaderView;
        if (!(view2 == null || view == null || view2 == view)) {
            removeView(view2);
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new LayoutParams(-1, -2));
        }
        this.mHeaderView = view;
        addView(view);
    }

    private void movePos(float f) {
        int i = 0;
        if (f >= BitmapDescriptorFactory.HUE_RED || !this.mPtrIndicator.mo199929t()) {
            int m = this.mPtrIndicator.mo199922m() + ((int) f);
            if (!this.mPtrIndicator.mo199916g(m)) {
                i = m;
            } else if (DEBUG) {
                Log.m165383e(this.LOG_TAG, String.format("over top", new Object[0]));
            }
            this.mPtrIndicator.mo199903b(i);
            int l = i - this.mPtrIndicator.mo199921l();
            if (!this.mPtrIndicator.mo199900a()) {
                l = -l;
            }
            updatePos(l);
        } else if (DEBUG) {
            Log.m165383e(this.LOG_TAG, String.format("has reached the top", new Object[0]));
        }
    }

    private void onRelease(boolean z) {
        tryToPerformRefresh();
        byte b = this.mStatus;
        if (b == 3) {
            if (!this.mKeepHeaderWhenRefresh) {
                tryScrollBackToTopWhileLoading();
            } else if (this.mPtrIndicator.mo199932w() && !z) {
                if (this.mPtrIndicator.mo199900a()) {
                    this.mScrollChecker.mo199889a(this.mPtrIndicator.mo199933x(), this.mDurationToBackHeader);
                } else {
                    this.mScrollChecker.mo199889a(this.mPtrIndicator.mo199933x(), this.mDurationToBackFooter);
                }
            }
        } else if (b == 4) {
            notifyUIRefreshComplete(false);
        } else {
            tryScrollBackToTopAbortRefresh();
        }
    }

    public void notifyUIRefreshComplete(boolean z) {
        if (!this.mPtrIndicator.mo199924o() || z || this.mRefreshCompleteHook == null) {
            if (this.mPtrUIHandlerHolder.mo199935a()) {
                if (DEBUG) {
                    Log.m165389i(this.LOG_TAG, "LKUIPtrUIHandler: onUIRefreshComplete");
                }
                this.mPtrUIHandlerHolder.mo166238a(this, this.mPtrIndicator.mo199900a());
            }
            this.mPtrIndicator.mo199913f();
            tryScrollBackToTopAfterComplete();
            tryToNotifyReset();
            return;
        }
        if (DEBUG) {
            Log.m165379d(this.LOG_TAG, "notifyUIRefreshComplete mRefreshCompleteHook run.");
        }
        this.mRefreshCompleteHook.mo199936a();
    }

    private void updatePos(int i) {
        if (i != 0) {
            boolean b = this.mPtrIndicator.mo199904b();
            if (b && !this.mHasSendCancelEvent && this.mPtrIndicator.mo199928s()) {
                this.mHasSendCancelEvent = true;
                sendCancelEvent();
            }
            if ((this.mPtrIndicator.mo199925p() && this.mStatus == 1) || (this.mPtrIndicator.mo199915g() && this.mStatus == 4 && isEnabledNextPtrAtOnce())) {
                this.mStatus = 2;
                this.mPtrUIHandlerHolder.mo166240b(this);
                if (DEBUG) {
                    Log.m165389i(this.LOG_TAG, String.format("LKUIPtrUIHandler: onUIRefreshPrepare, mFlag %s", Integer.valueOf(this.mFlag)));
                }
            }
            if (this.mPtrIndicator.mo199926q()) {
                tryToNotifyReset();
                if (b) {
                    sendDownEvent();
                }
            }
            if (this.mStatus == 2) {
                if (b && !isAutoRefresh() && this.mPullToRefresh && this.mPtrIndicator.mo199930u()) {
                    tryToPerformRefresh();
                }
                if (performAutoRefreshButLater() && this.mPtrIndicator.mo199931v()) {
                    tryToPerformRefresh();
                }
            }
            if (DEBUG) {
                Log.m165379d(this.LOG_TAG, String.format("updatePos: change: %s, current: %s last: %s, top: %s, headerHeight: %s", Integer.valueOf(i), Integer.valueOf(this.mPtrIndicator.mo199922m()), Integer.valueOf(this.mPtrIndicator.mo199921l()), Integer.valueOf(this.mContent.getTop()), Integer.valueOf(this.mHeaderHeight)));
            }
            if (this.mPtrIndicator.mo199900a()) {
                this.mHeaderView.offsetTopAndBottom(i);
            } else {
                this.mFooterView.offsetTopAndBottom(i);
            }
            if (!isPinContent()) {
                this.mContent.offsetTopAndBottom(i);
            }
            invalidate();
            if (this.mPtrUIHandlerHolder.mo199935a()) {
                this.mPtrUIHandlerHolder.mo166239a(this, b, this.mStatus, this.mPtrIndicator);
            }
            onPositionChange(b, this.mStatus, this.mPtrIndicator);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        View view;
        if (!isEnabled() || this.mContent == null || this.mHeaderView == null) {
            return dispatchTouchEventSupper(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    this.mLastMoveEvent = motionEvent;
                    this.mPtrIndicator.mo199902b(motionEvent.getX(), motionEvent.getY());
                    float j = this.mPtrIndicator.mo199919j();
                    float k = this.mPtrIndicator.mo199920k();
                    if (this.mDisableWhenHorizontalMove && !this.mPreventForHorizontal && Math.abs(j) > ((float) this.mPagingTouchSlop) && Math.abs(j) > Math.abs(k) && this.mPtrIndicator.mo199929t()) {
                        this.mPreventForHorizontal = true;
                    }
                    if (this.mPreventForHorizontal) {
                        return dispatchTouchEventSupper(motionEvent);
                    }
                    if (k > BitmapDescriptorFactory.HUE_RED) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z7 = !z2;
                    if (!this.mPtrIndicator.mo199900a() || !this.mPtrIndicator.mo199924o()) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (this.mFooterView == null || this.mPtrIndicator.mo199900a() || !this.mPtrIndicator.mo199924o()) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    LKUIPtrHandler lKUIPtrHandler = this.mPtrHandler;
                    if (lKUIPtrHandler == null || !lKUIPtrHandler.checkCanDoRefresh(this, this.mContent, this.mHeaderView) || (this.mMode.ordinal() & 1) <= 0) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    LKUIPtrHandler lKUIPtrHandler2 = this.mPtrHandler;
                    if (lKUIPtrHandler2 == null || (view = this.mFooterView) == null || !(lKUIPtrHandler2 instanceof LKUIPtrHandler2) || !((LKUIPtrHandler2) lKUIPtrHandler2).checkCanDoLoadMore(this, this.mContent, view) || (this.mMode.ordinal() & 2) <= 0) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (DEBUG) {
                        Log.m165379d(this.LOG_TAG, String.format("ACTION_MOVE: offsetY:%s, currentPos: %s, moveUp: %s, canMoveUp: %s, moveDown: %s: canMoveDown: %s canHeaderMoveDown: %s canFooterMoveUp: %s", Float.valueOf(k), Integer.valueOf(this.mPtrIndicator.mo199922m()), Boolean.valueOf(z7), Boolean.valueOf(z3), Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5), Boolean.valueOf(z6)));
                    }
                    if (!z3 && !z4) {
                        if (z2 && !z5) {
                            return dispatchTouchEventSupper(motionEvent);
                        }
                        if (z7 && !z6) {
                            return dispatchTouchEventSupper(motionEvent);
                        }
                        if (z2) {
                            moveHeaderPos(k);
                            return true;
                        } else if (z7) {
                            moveFooterPos(k);
                            return true;
                        }
                    }
                    if (z3) {
                        moveHeaderPos(k);
                        return true;
                    } else if (z4) {
                        if (this.mForceBackWhenComplete && this.mStatus == 4) {
                            return dispatchTouchEventSupper(motionEvent);
                        }
                        moveFooterPos(k);
                        return true;
                    }
                } else if (action != 3) {
                }
                return dispatchTouchEventSupper(motionEvent);
            }
            this.mPtrIndicator.mo199911e();
            if (!this.mPtrIndicator.mo199924o()) {
                return dispatchTouchEventSupper(motionEvent);
            }
            if (DEBUG) {
                Log.m165379d(this.LOG_TAG, "call onRelease when user release");
            }
            onRelease(false);
            if (!this.mPtrIndicator.mo199928s()) {
                return dispatchTouchEventSupper(motionEvent);
            }
            sendCancelEvent();
            return true;
        }
        this.mHasSendCancelEvent = false;
        this.mPtrIndicator.mo199894a(motionEvent.getX(), motionEvent.getY());
        if (!this.mForceBackWhenComplete) {
            this.mScrollChecker.mo199891b();
        } else {
            if (this.mPtrIndicator.mo199900a() || !this.mPtrIndicator.mo199924o()) {
                z = false;
            } else {
                z = true;
            }
            if (!z || this.mStatus != 4) {
                this.mScrollChecker.mo199891b();
            }
        }
        this.mPreventForHorizontal = false;
        dispatchTouchEventSupper(motionEvent);
        return true;
    }

    public LKUIPtrFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void autoRefresh(boolean z, boolean z2) {
        byte b;
        int i;
        if (this.mStatus == 1) {
            int i2 = this.mFlag;
            if (z) {
                b = FLAG_AUTO_REFRESH_AT_ONCE;
            } else {
                b = FLAG_AUTO_REFRESH_BUT_LATER;
            }
            this.mFlag = i2 | b;
            this.mStatus = 2;
            if (this.mPtrUIHandlerHolder.mo199935a()) {
                this.mPtrUIHandlerHolder.mo166240b(this);
                if (DEBUG) {
                    Log.m165389i(this.LOG_TAG, String.format("LKUIPtrUIHandler: onUIRefreshPrepare, mFlag %s", Integer.valueOf(this.mFlag)));
                }
            }
            this.mPtrIndicator.mo199899a(z2);
            RunnableC58933a aVar = this.mScrollChecker;
            int i3 = this.mPtrIndicator.mo199918i();
            if (z2) {
                i = this.mDurationToCloseHeader;
            } else {
                i = this.mDurationToCloseFooter;
            }
            aVar.mo199889a(i3, i);
            if (z) {
                this.mStatus = 3;
                performRefresh();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.mHeaderView;
        if (view != null) {
            measureChildWithMargins(view, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mHeaderView.getLayoutParams();
            int measuredHeight = this.mHeaderView.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            this.mHeaderHeight = measuredHeight;
            this.mPtrIndicator.mo199908c(measuredHeight);
        }
        View view2 = this.mFooterView;
        if (view2 != null) {
            measureChildWithMargins(view2, i, 0, i2, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mFooterView.getLayoutParams();
            int measuredHeight2 = this.mFooterView.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            this.mFooterHeight = measuredHeight2;
            this.mPtrIndicator.mo199910d(measuredHeight2);
        }
        View view3 = this.mContent;
        if (view3 != null) {
            measureContentView(view3, i, i2);
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.mContent.getLayoutParams();
            if (getLayoutParams().height == -2) {
                super.setMeasuredDimension(getMeasuredWidth(), this.mContent.getMeasuredHeight() + marginLayoutParams3.topMargin + marginLayoutParams3.bottomMargin);
            }
        }
    }

    private void measureContentView(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin, marginLayoutParams.height));
    }

    public LKUIPtrFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mStatus = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("ptr-frame-");
        int i2 = ID + 1;
        ID = i2;
        sb.append(i2);
        this.LOG_TAG = sb.toString();
        this.mHeaderId = 0;
        this.mContainerId = 0;
        this.mFooterId = 0;
        this.mMode = Mode.BOTH;
        this.mDurationToBackHeader = LocationRequest.PRIORITY_HD_ACCURACY;
        this.mDurationToBackFooter = LocationRequest.PRIORITY_HD_ACCURACY;
        this.mDurationToCloseHeader = 1000;
        this.mDurationToCloseFooter = 1000;
        this.mKeepHeaderWhenRefresh = true;
        this.mPullToRefresh = false;
        this.mForceBackWhenComplete = false;
        this.mPtrUIHandlerHolder = C58936b.m228769b();
        this.mDisableWhenHorizontalMove = false;
        this.mFlag = 0;
        this.mPreventForHorizontal = false;
        this.mEnableScrollContentAfterRefresh = false;
        this.mEnableScrollContentAfterLoad = false;
        this.mLoadingMinTime = ParticipantRepo.f117150c;
        this.mLoadingStartTime = 0;
        this.mHasSendCancelEvent = false;
        this.mPerformRefreshCompleteDelay = new Runnable() {
            /* class com.ss.android.lark.widget.ptr.LKUIPtrFrameLayout.RunnableC589301 */

            public void run() {
                LKUIPtrFrameLayout.this.performRefreshComplete();
            }
        };
        this.mPtrIndicator = new C58935a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.lkui_ptr_content, R.attr.lkui_ptr_duration_to_back_footer, R.attr.lkui_ptr_duration_to_back_header, R.attr.lkui_ptr_duration_to_back_refresh, R.attr.lkui_ptr_duration_to_close_either, R.attr.lkui_ptr_duration_to_close_footer, R.attr.lkui_ptr_duration_to_close_header, R.attr.lkui_ptr_footer, R.attr.lkui_ptr_header, R.attr.lkui_ptr_keep_header_when_refresh, R.attr.lkui_ptr_mode, R.attr.lkui_ptr_pull_to_fresh, R.attr.lkui_ptr_ratio_of_header_height_to_refresh, R.attr.lkui_ptr_resistance, R.attr.lkui_ptr_resistance_footer, R.attr.lkui_ptr_resistance_header}, 0, 0);
        if (obtainStyledAttributes != null) {
            this.mHeaderId = obtainStyledAttributes.getResourceId(8, this.mHeaderId);
            this.mContainerId = obtainStyledAttributes.getResourceId(0, this.mContainerId);
            this.mFooterId = obtainStyledAttributes.getResourceId(7, this.mFooterId);
            C58935a aVar = this.mPtrIndicator;
            aVar.mo199893a(obtainStyledAttributes.getFloat(13, aVar.mo199905c()));
            C58935a aVar2 = this.mPtrIndicator;
            aVar2.mo199901b(obtainStyledAttributes.getFloat(13, aVar2.mo199909d()));
            C58935a aVar3 = this.mPtrIndicator;
            aVar3.mo199893a(obtainStyledAttributes.getFloat(15, aVar3.mo199905c()));
            C58935a aVar4 = this.mPtrIndicator;
            aVar4.mo199901b(obtainStyledAttributes.getFloat(14, aVar4.mo199909d()));
            this.mDurationToBackHeader = obtainStyledAttributes.getInt(3, this.mDurationToCloseHeader);
            this.mDurationToBackFooter = obtainStyledAttributes.getInt(3, this.mDurationToCloseHeader);
            this.mDurationToBackHeader = obtainStyledAttributes.getInt(2, this.mDurationToCloseHeader);
            this.mDurationToBackFooter = obtainStyledAttributes.getInt(1, this.mDurationToCloseHeader);
            this.mDurationToCloseHeader = obtainStyledAttributes.getInt(4, this.mDurationToCloseHeader);
            this.mDurationToCloseFooter = obtainStyledAttributes.getInt(4, this.mDurationToCloseFooter);
            this.mDurationToCloseHeader = obtainStyledAttributes.getInt(6, this.mDurationToCloseHeader);
            this.mDurationToCloseFooter = obtainStyledAttributes.getInt(5, this.mDurationToCloseFooter);
            this.mPtrIndicator.mo199906c(obtainStyledAttributes.getFloat(12, this.mPtrIndicator.mo199917h()));
            this.mKeepHeaderWhenRefresh = obtainStyledAttributes.getBoolean(9, this.mKeepHeaderWhenRefresh);
            this.mPullToRefresh = obtainStyledAttributes.getBoolean(11, this.mPullToRefresh);
            this.mMode = getModeFromIndex(obtainStyledAttributes.getInt(10, 4));
            obtainStyledAttributes.recycle();
        }
        this.mScrollChecker = new RunnableC58933a();
        this.mPagingTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop() * 2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        layoutChildren();
    }
}
