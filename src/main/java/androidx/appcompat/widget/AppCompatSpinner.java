package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.DialogInterfaceC0257a;
import androidx.appcompat.p017a.p018a.C0215a;
import androidx.core.view.AbstractC0915q;
import androidx.core.view.ViewCompat;
import com.larksuite.suite.R;

public class AppCompatSpinner extends Spinner implements AbstractC0915q {

    /* renamed from: c */
    private static final int[] f1334c = {16843505};

    /* renamed from: a */
    int f1335a;

    /* renamed from: b */
    final Rect f1336b;

    /* renamed from: d */
    private final C0443d f1337d;

    /* renamed from: e */
    private final Context f1338e;

    /* renamed from: f */
    private AbstractView$OnAttachStateChangeListenerC0466s f1339f;

    /* renamed from: g */
    private SpinnerAdapter f1340g;

    /* renamed from: h */
    private final boolean f1341h;

    /* renamed from: i */
    private AbstractC0381d f1342i;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    public interface AbstractC0381d {
        /* renamed from: a */
        CharSequence mo1988a();

        /* renamed from: a */
        void mo1989a(int i);

        /* renamed from: a */
        void mo1990a(int i, int i2);

        /* renamed from: a */
        void mo1991a(CharSequence charSequence);

        void dismiss();

        Drawable getBackground();

        int getHorizontalOffset();

        int getVerticalOffset();

        boolean isShowing();

        void setAdapter(ListAdapter listAdapter);

        void setBackgroundDrawable(Drawable drawable);

        void setHorizontalOffset(int i);

        void setVerticalOffset(int i);
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class DialogInterface$OnClickListenerC0375a implements DialogInterface.OnClickListener, AbstractC0381d {

        /* renamed from: a */
        DialogInterfaceC0257a f1347a;

        /* renamed from: c */
        private ListAdapter f1349c;

        /* renamed from: d */
        private CharSequence f1350d;

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public Drawable getBackground() {
            return null;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public int getHorizontalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public int getVerticalOffset() {
            return 0;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public CharSequence mo1988a() {
            return this.f1350d;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public void dismiss() {
            DialogInterfaceC0257a aVar = this.f1347a;
            if (aVar != null) {
                aVar.dismiss();
                this.f1347a = null;
            }
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public boolean isShowing() {
            DialogInterfaceC0257a aVar = this.f1347a;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public void setAdapter(ListAdapter listAdapter) {
            this.f1349c = listAdapter;
        }

        DialogInterface$OnClickListenerC0375a() {
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public void mo1989a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public void setHorizontalOffset(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public void setVerticalOffset(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public void mo1991a(CharSequence charSequence) {
            this.f1350d = charSequence;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f1349c.getItemId(i));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public void mo1990a(int i, int i2) {
            if (this.f1349c != null) {
                DialogInterfaceC0257a.C0258a aVar = new DialogInterfaceC0257a.C0258a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1350d;
                if (charSequence != null) {
                    aVar.mo923a(charSequence);
                }
                DialogInterfaceC0257a b = aVar.mo921a(this.f1349c, AppCompatSpinner.this.getSelectedItemPosition(), this).mo929b();
                this.f1347a = b;
                ListView a = b.mo909a();
                if (Build.VERSION.SDK_INT >= 17) {
                    a.setTextDirection(i);
                    a.setTextAlignment(i2);
                }
                this.f1347a.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class C0377c extends ListPopupWindow implements AbstractC0381d {

        /* renamed from: a */
        ListAdapter f1353a;

        /* renamed from: c */
        private CharSequence f1355c;

        /* renamed from: d */
        private final Rect f1356d = new Rect();

        /* renamed from: e */
        private int f1357e;

        /* renamed from: c */
        public int mo2017c() {
            return this.f1357e;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public CharSequence mo1988a() {
            return this.f1355c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2016b() {
            int i;
            int i2;
            Drawable background = getBackground();
            int i3 = 0;
            if (background != null) {
                background.getPadding(AppCompatSpinner.this.f1336b);
                if (al.m1864a(AppCompatSpinner.this)) {
                    i2 = AppCompatSpinner.this.f1336b.right;
                } else {
                    i2 = -AppCompatSpinner.this.f1336b.left;
                }
                i3 = i2;
            } else {
                Rect rect = AppCompatSpinner.this.f1336b;
                AppCompatSpinner.this.f1336b.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.f1335a == -2) {
                int a = AppCompatSpinner.this.mo1956a((SpinnerAdapter) this.f1353a, getBackground());
                int i4 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.f1336b.left) - AppCompatSpinner.this.f1336b.right;
                if (a > i4) {
                    a = i4;
                }
                setContentWidth(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.f1335a == -1) {
                setContentWidth((width - paddingLeft) - paddingRight);
            } else {
                setContentWidth(AppCompatSpinner.this.f1335a);
            }
            if (al.m1864a(AppCompatSpinner.this)) {
                i = i3 + (((width - paddingRight) - getWidth()) - mo2017c());
            } else {
                i = i3 + paddingLeft + mo2017c();
            }
            setHorizontalOffset(i);
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        public void setAdapter(ListAdapter listAdapter) {
            super.setAdapter(listAdapter);
            this.f1353a = listAdapter;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public void mo1989a(int i) {
            this.f1357e = i;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public void mo1991a(CharSequence charSequence) {
            this.f1355c = charSequence;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2015a(View view) {
            if (!ViewCompat.m4015I(view) || !view.getGlobalVisibleRect(this.f1356d)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.AppCompatSpinner.AbstractC0381d
        /* renamed from: a */
        public void mo1990a(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean isShowing = isShowing();
            mo2016b();
            setInputMethodMode(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
            }
            setSelection(AppCompatSpinner.this.getSelectedItemPosition());
            if (!isShowing && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                final ViewTreeObserver$OnGlobalLayoutListenerC03792 r6 = new ViewTreeObserver.OnGlobalLayoutListener() {
                    /* class androidx.appcompat.widget.AppCompatSpinner.C0377c.ViewTreeObserver$OnGlobalLayoutListenerC03792 */

                    public void onGlobalLayout() {
                        C0377c cVar = C0377c.this;
                        if (!cVar.mo2015a(AppCompatSpinner.this)) {
                            C0377c.this.dismiss();
                            return;
                        }
                        C0377c.this.mo2016b();
                        C0377c.super.show();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(r6);
                setOnDismissListener(new PopupWindow.OnDismissListener() {
                    /* class androidx.appcompat.widget.AppCompatSpinner.C0377c.C03803 */

                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(r6);
                        }
                    }
                });
            }
        }

        public C0377c(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            setAnchorView(AppCompatSpinner.this);
            setModal(true);
            setPromptPosition(0);
            setOnItemClickListener(new AdapterView.OnItemClickListener(AppCompatSpinner.this) {
                /* class androidx.appcompat.widget.AppCompatSpinner.C0377c.C03781 */

                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    AppCompatSpinner.this.setSelection(i);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i, C0377c.this.f1353a.getItemId(i));
                    }
                    C0377c.this.dismiss();
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public final AbstractC0381d getInternalPopup() {
        return this.f1342i;
    }

    public Context getPopupContext() {
        return this.f1338e;
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    public static class C0376b implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1351a;

        /* renamed from: b */
        private ListAdapter f1352b;

        public int getItemViewType(int i) {
            return 0;
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1352b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter == null || !spinnerAdapter.hasStableIds()) {
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1352b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public C0376b(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1351a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1352b = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof AbstractC0423ab) {
                AbstractC0423ab abVar = (AbstractC0423ab) spinnerAdapter;
                if (abVar.mo2465a() == null) {
                    abVar.mo2466a(theme);
                }
            }
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1351a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            dVar.mo2578c();
        }
    }

    public CharSequence getPrompt() {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            return dVar.mo1988a();
        }
        return super.getPrompt();
    }

    @Override // androidx.core.view.AbstractC0915q
    public ColorStateList getSupportBackgroundTintList() {
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            return dVar.mo2570a();
        }
        return null;
    }

    @Override // androidx.core.view.AbstractC0915q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            return dVar.mo2576b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo1957a() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f1342i.mo1990a(getTextDirection(), getTextAlignment());
        } else {
            this.f1342i.mo1990a(-1, -1);
        }
    }

    public int getDropDownHorizontalOffset() {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            return dVar.getHorizontalOffset();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            return dVar.getVerticalOffset();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f1342i != null) {
            return this.f1335a;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    public Drawable getPopupBackground() {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            return dVar.getBackground();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null && dVar.isShowing()) {
            this.f1342i.dismiss();
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        AbstractC0381d dVar = this.f1342i;
        if (dVar == null || !dVar.isShowing()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f1346a = z;
        return savedState;
    }

    public boolean performClick() {
        AbstractC0381d dVar = this.f1342i;
        if (dVar == null) {
            return super.performClick();
        }
        if (dVar.isShowing()) {
            return true;
        }
        mo1957a();
        return true;
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            /* class androidx.appcompat.widget.AppCompatSpinner.SavedState.C03741 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };

        /* renamed from: a */
        boolean f1346a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f1346a = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1346a ? (byte) 1 : 0);
        }
    }

    public AppCompatSpinner(Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            dVar.mo2572a(colorStateList);
        }
    }

    @Override // androidx.core.view.AbstractC0915q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            dVar.mo2573a(mode);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            dVar.mo2574a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0443d dVar = this.f1337d;
        if (dVar != null) {
            dVar.mo2571a(i);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0215a.m655b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            dVar.mo1991a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1346a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                /* class androidx.appcompat.widget.AppCompatSpinner.ViewTreeObserver$OnGlobalLayoutListenerC03732 */

                public void onGlobalLayout() {
                    if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                        AppCompatSpinner.this.mo1957a();
                    }
                    ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                    if (viewTreeObserver == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT >= 16) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    }
                }
            });
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractView$OnAttachStateChangeListenerC0466s sVar = this.f1339f;
        if (sVar == null || !sVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setDropDownHorizontalOffset(int i) {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            dVar.mo1989a(i);
            this.f1342i.setHorizontalOffset(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            dVar.setVerticalOffset(i);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1342i != null) {
            this.f1335a = i;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        AbstractC0381d dVar = this.f1342i;
        if (dVar != null) {
            dVar.setBackgroundDrawable(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1341h) {
            this.f1340g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1342i != null) {
            Context context = this.f1338e;
            if (context == null) {
                context = getContext();
            }
            this.f1342i.setAdapter(new C0376b(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.spinnerStyle);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1342i != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1956a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1956a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1336b);
        return i2 + this.f1336b.left + this.f1336b.right;
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r12 != null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r12.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        if (r12 != null) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r8, android.util.AttributeSet r9, int r10, int r11, android.content.res.Resources.Theme r12) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}
