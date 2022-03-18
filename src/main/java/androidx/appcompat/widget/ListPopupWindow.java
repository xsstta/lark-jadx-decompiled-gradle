package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.AbstractC0342o;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0945h;
import com.larksuite.suite.R;
import java.lang.reflect.Method;

public class ListPopupWindow implements AbstractC0342o {
    private static Method sGetMaxAvailableHeightMethod;
    private static Method sSetClipToWindowEnabledMethod;
    private static Method sSetEpicenterBoundsMethod;
    private ListAdapter mAdapter;
    private Context mContext;
    private boolean mDropDownAlwaysVisible;
    private View mDropDownAnchorView;
    private int mDropDownGravity;
    private int mDropDownHeight;
    private int mDropDownHorizontalOffset;
    C0461q mDropDownList;
    private Drawable mDropDownListHighlight;
    private int mDropDownVerticalOffset;
    private boolean mDropDownVerticalOffsetSet;
    private int mDropDownWidth;
    private int mDropDownWindowLayoutType;
    private Rect mEpicenterBounds;
    private boolean mForceIgnoreOutsideTouch;
    final Handler mHandler;
    private final RunnableC0386a mHideSelector;
    private AdapterView.OnItemClickListener mItemClickListener;
    private AdapterView.OnItemSelectedListener mItemSelectedListener;
    int mListItemExpandMaximum;
    private boolean mModal;
    private DataSetObserver mObserver;
    private boolean mOverlapAnchor;
    private boolean mOverlapAnchorSet;
    PopupWindow mPopup;
    private int mPromptPosition;
    private View mPromptView;
    final RunnableC0390e mResizePopupRunnable;
    private final C0388c mScrollListener;
    private Runnable mShowDropDownRunnable;
    private final Rect mTempRect;
    private final View$OnTouchListenerC0389d mTouchInterceptor;

    private static boolean isConfirmKey(int i) {
        return i == 66 || i == 23;
    }

    public View getAnchorView() {
        return this.mDropDownAnchorView;
    }

    public int getHeight() {
        return this.mDropDownHeight;
    }

    public int getHorizontalOffset() {
        return this.mDropDownHorizontalOffset;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public ListView getListView() {
        return this.mDropDownList;
    }

    public int getPromptPosition() {
        return this.mPromptPosition;
    }

    public int getWidth() {
        return this.mDropDownWidth;
    }

    public boolean isDropDownAlwaysVisible() {
        return this.mDropDownAlwaysVisible;
    }

    public boolean isModal() {
        return this.mModal;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    public class RunnableC0386a implements Runnable {
        public void run() {
            ListPopupWindow.this.clearListSelection();
        }

        RunnableC0386a() {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    public class C0387b extends DataSetObserver {
        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }

        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        C0387b() {
        }
    }

    public int getAnimationStyle() {
        return this.mPopup.getAnimationStyle();
    }

    public Drawable getBackground() {
        return this.mPopup.getBackground();
    }

    public int getInputMethodMode() {
        return this.mPopup.getInputMethodMode();
    }

    public int getSoftInputMode() {
        return this.mPopup.getSoftInputMode();
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public boolean isShowing() {
        return this.mPopup.isShowing();
    }

    public void postShow() {
        this.mHandler.post(this.mShowDropDownRunnable);
    }

    public void clearListSelection() {
        C0461q qVar = this.mDropDownList;
        if (qVar != null) {
            qVar.setListSelectionHidden(true);
            qVar.requestLayout();
        }
    }

    public Rect getEpicenterBounds() {
        if (this.mEpicenterBounds != null) {
            return new Rect(this.mEpicenterBounds);
        }
        return null;
    }

    public Object getSelectedItem() {
        if (!isShowing()) {
            return null;
        }
        return this.mDropDownList.getSelectedItem();
    }

    public long getSelectedItemId() {
        if (!isShowing()) {
            return Long.MIN_VALUE;
        }
        return this.mDropDownList.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        if (!isShowing()) {
            return -1;
        }
        return this.mDropDownList.getSelectedItemPosition();
    }

    public View getSelectedView() {
        if (!isShowing()) {
            return null;
        }
        return this.mDropDownList.getSelectedView();
    }

    public int getVerticalOffset() {
        if (!this.mDropDownVerticalOffsetSet) {
            return 0;
        }
        return this.mDropDownVerticalOffset;
    }

    public boolean isInputMethodNotNeeded() {
        if (this.mPopup.getInputMethodMode() == 2) {
            return true;
        }
        return false;
    }

    private void removePromptView() {
        View view = this.mPromptView;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mPromptView);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public void dismiss() {
        this.mPopup.dismiss();
        removePromptView();
        this.mPopup.setContentView(null);
        this.mDropDownList = null;
        this.mHandler.removeCallbacks(this.mResizePopupRunnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    public class RunnableC0390e implements Runnable {
        public void run() {
            if (ListPopupWindow.this.mDropDownList != null && ViewCompat.m4015I(ListPopupWindow.this.mDropDownList) && ListPopupWindow.this.mDropDownList.getCount() > ListPopupWindow.this.mDropDownList.getChildCount() && ListPopupWindow.this.mDropDownList.getChildCount() <= ListPopupWindow.this.mListItemExpandMaximum) {
                ListPopupWindow.this.mPopup.setInputMethodMode(2);
                ListPopupWindow.this.show();
            }
        }

        RunnableC0390e() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                sSetClipToWindowEnabledMethod = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                sSetEpicenterBoundsMethod = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                sGetMaxAvailableHeightMethod = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: android.widget.LinearLayout */
    /* JADX WARN: Multi-variable type inference failed */
    private int buildDropDown() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = true;
        if (this.mDropDownList == null) {
            Context context = this.mContext;
            this.mShowDropDownRunnable = new Runnable() {
                /* class androidx.appcompat.widget.ListPopupWindow.RunnableC03842 */

                public void run() {
                    View anchorView = ListPopupWindow.this.getAnchorView();
                    if (anchorView != null && anchorView.getWindowToken() != null) {
                        ListPopupWindow.this.show();
                    }
                }
            };
            C0461q createDropDownListView = createDropDownListView(context, !this.mModal);
            this.mDropDownList = createDropDownListView;
            Drawable drawable = this.mDropDownListHighlight;
            if (drawable != null) {
                createDropDownListView.setSelector(drawable);
            }
            this.mDropDownList.setAdapter(this.mAdapter);
            this.mDropDownList.setOnItemClickListener(this.mItemClickListener);
            this.mDropDownList.setFocusable(true);
            this.mDropDownList.setFocusableInTouchMode(true);
            this.mDropDownList.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                /* class androidx.appcompat.widget.ListPopupWindow.C03853 */

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onNothingSelected(AdapterView<?> adapterView) {
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    C0461q qVar;
                    if (i != -1 && (qVar = ListPopupWindow.this.mDropDownList) != null) {
                        qVar.setListSelectionHidden(false);
                    }
                }
            });
            this.mDropDownList.setOnScrollListener(this.mScrollListener);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.mItemSelectedListener;
            if (onItemSelectedListener != null) {
                this.mDropDownList.setOnItemSelectedListener(onItemSelectedListener);
            }
            C0461q qVar = this.mDropDownList;
            View view = this.mPromptView;
            if (view != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i5 = this.mPromptPosition;
                if (i5 == 0) {
                    linearLayout.addView(view);
                    linearLayout.addView(qVar, layoutParams);
                } else if (i5 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.mPromptPosition);
                } else {
                    linearLayout.addView(qVar, layoutParams);
                    linearLayout.addView(view);
                }
                int i6 = this.mDropDownWidth;
                if (i6 >= 0) {
                    i4 = Integer.MIN_VALUE;
                } else {
                    i6 = 0;
                    i4 = 0;
                }
                view.measure(View.MeasureSpec.makeMeasureSpec(i6, i4), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view.getLayoutParams();
                i = view.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                qVar = linearLayout;
            } else {
                i = 0;
            }
            this.mPopup.setContentView(qVar);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.mPopup.getContentView();
            View view2 = this.mPromptView;
            if (view2 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i = view2.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            i2 = this.mTempRect.top + this.mTempRect.bottom;
            if (!this.mDropDownVerticalOffsetSet) {
                this.mDropDownVerticalOffset = -this.mTempRect.top;
            }
        } else {
            this.mTempRect.setEmpty();
            i2 = 0;
        }
        if (this.mPopup.getInputMethodMode() != 2) {
            z = false;
        }
        int maxAvailableHeight = getMaxAvailableHeight(getAnchorView(), this.mDropDownVerticalOffset, z);
        if (this.mDropDownAlwaysVisible || this.mDropDownHeight == -1) {
            return maxAvailableHeight + i2;
        }
        int i7 = this.mDropDownWidth;
        if (i7 == -2) {
            i3 = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            i3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(this.mContext.getResources().getDisplayMetrics().widthPixels - (this.mTempRect.left + this.mTempRect.right), 1073741824);
        }
        int a = this.mDropDownList.mo2652a(i3, 0, -1, maxAvailableHeight - i, -1);
        if (a > 0) {
            i += i2 + this.mDropDownList.getPaddingTop() + this.mDropDownList.getPaddingBottom();
        }
        return a + i;
    }

    @Override // androidx.appcompat.view.menu.AbstractC0342o
    public void show() {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int buildDropDown = buildDropDown();
        boolean isInputMethodNotNeeded = isInputMethodNotNeeded();
        C0945h.m4559a(this.mPopup, this.mDropDownWindowLayoutType);
        boolean z2 = true;
        if (!this.mPopup.isShowing()) {
            int i5 = this.mDropDownWidth;
            if (i5 == -1) {
                i5 = -1;
            } else if (i5 == -2) {
                i5 = getAnchorView().getWidth();
            }
            int i6 = this.mDropDownHeight;
            if (i6 == -1) {
                buildDropDown = -1;
            } else if (i6 != -2) {
                buildDropDown = i6;
            }
            this.mPopup.setWidth(i5);
            this.mPopup.setHeight(buildDropDown);
            setPopupClipToScreenEnabled(true);
            PopupWindow popupWindow = this.mPopup;
            if (this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) {
                z = false;
            } else {
                z = true;
            }
            popupWindow.setOutsideTouchable(z);
            this.mPopup.setTouchInterceptor(this.mTouchInterceptor);
            if (this.mOverlapAnchorSet) {
                C0945h.m4561a(this.mPopup, this.mOverlapAnchor);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = sSetEpicenterBoundsMethod;
                if (method != null) {
                    try {
                        method.invoke(this.mPopup, this.mEpicenterBounds);
                    } catch (Exception e) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                    }
                }
            } else {
                this.mPopup.setEpicenterBounds(this.mEpicenterBounds);
            }
            C0945h.m4560a(this.mPopup, getAnchorView(), this.mDropDownHorizontalOffset, this.mDropDownVerticalOffset, this.mDropDownGravity);
            this.mDropDownList.setSelection(-1);
            if (!this.mModal || this.mDropDownList.isInTouchMode()) {
                clearListSelection();
            }
            if (!this.mModal) {
                this.mHandler.post(this.mHideSelector);
            }
        } else if (ViewCompat.m4015I(getAnchorView())) {
            int i7 = this.mDropDownWidth;
            if (i7 == -1) {
                i7 = -1;
            } else if (i7 == -2) {
                i7 = getAnchorView().getWidth();
            }
            int i8 = this.mDropDownHeight;
            if (i8 == -1) {
                if (!isInputMethodNotNeeded) {
                    buildDropDown = -1;
                }
                if (isInputMethodNotNeeded) {
                    PopupWindow popupWindow2 = this.mPopup;
                    if (this.mDropDownWidth == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow2.setWidth(i4);
                    this.mPopup.setHeight(0);
                } else {
                    PopupWindow popupWindow3 = this.mPopup;
                    if (this.mDropDownWidth == -1) {
                        i3 = -1;
                    } else {
                        i3 = 0;
                    }
                    popupWindow3.setWidth(i3);
                    this.mPopup.setHeight(-1);
                }
            } else if (i8 != -2) {
                buildDropDown = i8;
            }
            PopupWindow popupWindow4 = this.mPopup;
            if (this.mForceIgnoreOutsideTouch || this.mDropDownAlwaysVisible) {
                z2 = false;
            }
            popupWindow4.setOutsideTouchable(z2);
            PopupWindow popupWindow5 = this.mPopup;
            View anchorView = getAnchorView();
            int i9 = this.mDropDownHorizontalOffset;
            int i10 = this.mDropDownVerticalOffset;
            if (i7 < 0) {
                i = -1;
            } else {
                i = i7;
            }
            if (buildDropDown < 0) {
                i2 = -1;
            } else {
                i2 = buildDropDown;
            }
            popupWindow5.update(anchorView, i9, i10, i, i2);
        }
    }

    public void setAnchorView(View view) {
        this.mDropDownAnchorView = view;
    }

    public void setDropDownAlwaysVisible(boolean z) {
        this.mDropDownAlwaysVisible = z;
    }

    public void setDropDownGravity(int i) {
        this.mDropDownGravity = i;
    }

    public void setForceIgnoreOutsideTouch(boolean z) {
        this.mForceIgnoreOutsideTouch = z;
    }

    public void setHorizontalOffset(int i) {
        this.mDropDownHorizontalOffset = i;
    }

    /* access modifiers changed from: package-private */
    public void setListItemExpandMax(int i) {
        this.mListItemExpandMaximum = i;
    }

    public void setListSelector(Drawable drawable) {
        this.mDropDownListHighlight = drawable;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mItemClickListener = onItemClickListener;
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.mItemSelectedListener = onItemSelectedListener;
    }

    public void setPromptPosition(int i) {
        this.mPromptPosition = i;
    }

    public void setWidth(int i) {
        this.mDropDownWidth = i;
    }

    public void setWindowLayoutType(int i) {
        this.mDropDownWindowLayoutType = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    public class C0388c implements AbsListView.OnScrollListener {
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        C0388c() {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.isInputMethodNotNeeded() && ListPopupWindow.this.mPopup.getContentView() != null) {
                ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.mResizePopupRunnable);
                ListPopupWindow.this.mResizePopupRunnable.run();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    public class View$OnTouchListenerC0389d implements View.OnTouchListener {
        View$OnTouchListenerC0389d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && ListPopupWindow.this.mPopup != null && ListPopupWindow.this.mPopup.isShowing() && x >= 0 && x < ListPopupWindow.this.mPopup.getWidth() && y >= 0 && y < ListPopupWindow.this.mPopup.getHeight()) {
                ListPopupWindow.this.mHandler.postDelayed(ListPopupWindow.this.mResizePopupRunnable, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow.this.mHandler.removeCallbacks(ListPopupWindow.this.mResizePopupRunnable);
                return false;
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new AbstractView$OnAttachStateChangeListenerC0466s(view) {
            /* class androidx.appcompat.widget.ListPopupWindow.C03831 */

            /* renamed from: e */
            public ListPopupWindow mo1233a() {
                return ListPopupWindow.this;
            }
        };
    }

    public void setAnimationStyle(int i) {
        this.mPopup.setAnimationStyle(i);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.mPopup.setBackgroundDrawable(drawable);
    }

    public void setInputMethodMode(int i) {
        this.mPopup.setInputMethodMode(i);
    }

    public void setModal(boolean z) {
        this.mModal = z;
        this.mPopup.setFocusable(z);
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mPopup.setOnDismissListener(onDismissListener);
    }

    public void setOverlapAnchor(boolean z) {
        this.mOverlapAnchorSet = true;
        this.mOverlapAnchor = z;
    }

    public void setSoftInputMode(int i) {
        this.mPopup.setSoftInputMode(i);
    }

    public void setVerticalOffset(int i) {
        this.mDropDownVerticalOffset = i;
        this.mDropDownVerticalOffsetSet = true;
    }

    public void setEpicenterBounds(Rect rect) {
        Rect rect2;
        if (rect != null) {
            rect2 = new Rect(rect);
        } else {
            rect2 = null;
        }
        this.mEpicenterBounds = rect2;
    }

    public void setContentWidth(int i) {
        Drawable background = this.mPopup.getBackground();
        if (background != null) {
            background.getPadding(this.mTempRect);
            this.mDropDownWidth = this.mTempRect.left + this.mTempRect.right + i;
            return;
        }
        setWidth(i);
    }

    public void setHeight(int i) {
        if (i >= 0 || -2 == i || -1 == i) {
            this.mDropDownHeight = i;
            return;
        }
        throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
    }

    public void setPromptView(View view) {
        boolean isShowing = isShowing();
        if (isShowing) {
            removePromptView();
        }
        this.mPromptView = view;
        if (isShowing) {
            show();
        }
    }

    public void setSelection(int i) {
        C0461q qVar = this.mDropDownList;
        if (isShowing() && qVar != null) {
            qVar.setListSelectionHidden(false);
            qVar.setSelection(i);
            if (qVar.getChoiceMode() != 0) {
                qVar.setItemChecked(i, true);
            }
        }
    }

    private void setPopupClipToScreenEnabled(boolean z) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = sSetClipToWindowEnabledMethod;
            if (method != null) {
                try {
                    method.invoke(this.mPopup, Boolean.valueOf(z));
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.mPopup.setIsClippedToScreen(z);
        }
    }

    public boolean performItemClick(int i) {
        if (!isShowing()) {
            return false;
        }
        if (this.mItemClickListener == null) {
            return true;
        }
        C0461q qVar = this.mDropDownList;
        this.mItemClickListener.onItemClick(qVar, qVar.getChildAt(i - qVar.getFirstVisiblePosition()), i, qVar.getAdapter().getItemId(i));
        return true;
    }

    public void setAdapter(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.mObserver;
        if (dataSetObserver == null) {
            this.mObserver = new C0387b();
        } else {
            ListAdapter listAdapter2 = this.mAdapter;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.mAdapter = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.mObserver);
        }
        C0461q qVar = this.mDropDownList;
        if (qVar != null) {
            qVar.setAdapter(this.mAdapter);
        }
    }

    /* access modifiers changed from: package-private */
    public C0461q createDropDownListView(Context context, boolean z) {
        return new C0461q(context, z);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!isShowing() || this.mDropDownList.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean onKeyUp = this.mDropDownList.onKeyUp(i, keyEvent);
        if (onKeyUp && isConfirmKey(i)) {
            dismiss();
        }
        return onKeyUp;
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i != 4 || !isShowing()) {
            return false;
        }
        View view = this.mDropDownAnchorView;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        } else if (keyEvent.getAction() != 1) {
            return false;
        } else {
            KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
            if (keyDispatcherState2 != null) {
                keyDispatcherState2.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
                return false;
            }
            dismiss();
            return true;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int i2;
        int i3;
        if (isShowing() && i != 62 && (this.mDropDownList.getSelectedItemPosition() >= 0 || !isConfirmKey(i))) {
            int selectedItemPosition = this.mDropDownList.getSelectedItemPosition();
            boolean z = !this.mPopup.isAboveAnchor();
            ListAdapter listAdapter = this.mAdapter;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean areAllItemsEnabled = listAdapter.areAllItemsEnabled();
                if (areAllItemsEnabled) {
                    i2 = 0;
                } else {
                    i2 = this.mDropDownList.mo2653a(0, true);
                }
                if (areAllItemsEnabled) {
                    i3 = listAdapter.getCount() - 1;
                } else {
                    i3 = this.mDropDownList.mo2653a(listAdapter.getCount() - 1, false);
                }
                i4 = i2;
                i5 = i3;
            }
            if ((!z || i != 19 || selectedItemPosition > i4) && (z || i != 20 || selectedItemPosition < i5)) {
                this.mDropDownList.setListSelectionHidden(false);
                if (this.mDropDownList.onKeyDown(i, keyEvent)) {
                    this.mPopup.setInputMethodMode(2);
                    this.mDropDownList.requestFocusFromTouch();
                    show();
                    if (i == 19 || i == 20 || i == 23 || i == 66) {
                        return true;
                    }
                } else if (!z || i != 20) {
                    if (!z && i == 19 && selectedItemPosition == i4) {
                        return true;
                    }
                    return false;
                } else if (selectedItemPosition == i5) {
                    return true;
                }
            } else {
                clearListSelection();
                this.mPopup.setInputMethodMode(1);
                show();
                return true;
            }
        }
        return false;
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    private int getMaxAvailableHeight(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT > 23) {
            return this.mPopup.getMaxAvailableHeight(view, i, z);
        }
        Method method = sGetMaxAvailableHeightMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.mPopup, view, Integer.valueOf(i), Boolean.valueOf(z))).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.mPopup.getMaxAvailableHeight(view, i);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mDropDownHeight = -2;
        this.mDropDownWidth = -2;
        this.mDropDownWindowLayoutType = 1002;
        this.mListItemExpandMaximum = Integer.MAX_VALUE;
        this.mResizePopupRunnable = new RunnableC0390e();
        this.mTouchInterceptor = new View$OnTouchListenerC0389d();
        this.mScrollListener = new C0388c();
        this.mHideSelector = new RunnableC0386a();
        this.mTempRect = new Rect();
        this.mContext = context;
        this.mHandler = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843436, 16843437}, i, i2);
        this.mDropDownHorizontalOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.mDropDownVerticalOffset = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.mDropDownVerticalOffsetSet = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.mPopup = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
