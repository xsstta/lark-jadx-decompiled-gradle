package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.AbstractC0299c;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.p022c.p023a.AbstractC0495a;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.larksuite.suite.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements AbstractC0299c {
    static final C0409d PRE_API_29_HIDDEN_METHOD_INVOKER;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private AbstractC0406a mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private AbstractC0407b mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private AbstractC0408c mOnSuggestionListener;
    private final WeakHashMap<String, Drawable.ConstantState> mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    AbstractC0495a mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private C0410e mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    public interface AbstractC0406a {
        /* renamed from: a */
        boolean mo2279a();
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    public interface AbstractC0407b {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    public interface AbstractC0408c {
        /* renamed from: a */
        boolean mo2282a(int i);

        /* renamed from: b */
        boolean mo2283b(int i);
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public AbstractC0495a getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        final Runnable f1401a;

        /* renamed from: b */
        private int f1402b;

        /* renamed from: c */
        private SearchView f1403c;

        /* renamed from: d */
        private boolean f1404d;

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2265a() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        public boolean enoughToFilter() {
            if (this.f1402b <= 0 || super.enoughToFilter()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2266b() {
            if (this.f1404d) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1404d = false;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2267c() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.PRE_API_29_HIDDEN_METHOD_INVOKER.mo2286c(this);
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return DynamicModule.f58006b;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1403c = searchView;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1402b = i;
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1404d) {
                removeCallbacks(this.f1401a);
                post(this.f1401a);
            }
            return onCreateInputConnection;
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1403c.hasFocus() && getVisibility() == 0) {
                this.f1404d = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    mo2267c();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1404d = false;
                removeCallbacks(this.f1401a);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1404d = false;
                removeCallbacks(this.f1401a);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1404d = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1403c.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1403c.onTextFocusChanged();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1401a = new Runnable() {
                /* class androidx.appcompat.widget.SearchView.SearchAutoComplete.RunnableC04051 */

                public void run() {
                    SearchAutoComplete.this.mo2266b();
                }
            };
            this.f1402b = getThreshold();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.SearchView$d */
    public static class C0409d {

        /* renamed from: a */
        private Method f1406a;

        /* renamed from: b */
        private Method f1407b;

        /* renamed from: c */
        private Method f1408c;

        /* renamed from: a */
        private static void m1672a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        C0409d() {
            m1672a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1406a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1407b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1408c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2285b(AutoCompleteTextView autoCompleteTextView) {
            m1672a();
            Method method = this.f1407b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2284a(AutoCompleteTextView autoCompleteTextView) {
            m1672a();
            Method method = this.f1406a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2286c(AutoCompleteTextView autoCompleteTextView) {
            m1672a();
            Method method = this.f1408c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, true);
                } catch (Exception unused) {
                }
            }
        }
    }

    static {
        C0409d dVar;
        if (Build.VERSION.SDK_INT < 29) {
            dVar = new C0409d();
        } else {
            dVar = null;
        }
        PRE_API_29_HIDDEN_METHOD_INVOKER = dVar;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1400a = isIconified();
        return savedState;
    }

    private boolean isSubmitAreaEnabled() {
        if ((this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified()) {
            return true;
        }
        return false;
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSubmitArea() {
        int i;
        if (!isSubmitAreaEnabled() || !(this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.mSubmitArea.setVisibility(i);
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.setImeVisibility(false);
        this.mClearingFocus = false;
    }

    /* access modifiers changed from: package-private */
    public void forceSuggestionQuery() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.mSearchSrcTextView.refreshAutoCompleteResults();
            return;
        }
        C0409d dVar = PRE_API_29_HIDDEN_METHOD_INVOKER;
        dVar.mo2284a(this.mSearchSrcTextView);
        dVar.mo2285b(this.mSearchSrcTextView);
    }

    @Override // androidx.appcompat.view.AbstractC0299c
    public void onActionViewCollapsed() {
        setQuery("", false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    /* access modifiers changed from: package-private */
    public void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.setImeVisibility(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    /* access modifiers changed from: package-private */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.appcompat.widget.SearchView.SavedState.C04041 */

            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a */
        boolean f1400a;

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1400a + "}";
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1400a));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1400a = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private boolean hasVoiceSearch() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
            intent = this.mVoiceWebSearchIntent;
        } else if (this.mSearchable.getVoiceSearchLaunchRecognizer()) {
            intent = this.mVoiceAppSearchIntent;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    private void updateCloseButton() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = 0;
        if (!z2 && (!this.mIconifiedByDefault || this.mExpandedInActionView)) {
            z = false;
        }
        ImageView imageView = this.mCloseButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.mDefaultQueryHint;
        }
        return getContext().getText(this.mSearchable.getHintId());
    }

    @Override // androidx.appcompat.view.AbstractC0299c
    public void onActionViewExpanded() {
        if (!this.mExpandedInActionView) {
            this.mExpandedInActionView = true;
            int imeOptions = this.mSearchSrcTextView.getImeOptions();
            this.mCollapsedImeOptions = imeOptions;
            this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
            this.mSearchSrcTextView.setText("");
            setIconified(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText("");
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.setImeVisibility(true);
        } else if (this.mIconifiedByDefault) {
            AbstractC0406a aVar = this.mOnCloseListener;
            if (aVar == null || !aVar.mo2279a()) {
                clearFocus();
                updateViewsVisibility(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            AbstractC0407b bVar = this.mOnQueryChangeListener;
            if (bVar == null || !bVar.onQueryTextSubmit(text.toString())) {
                if (this.mSearchable != null) {
                    launchQuerySearch(0, null, text.toString());
                }
                this.mSearchSrcTextView.setImeVisibility(false);
                dismissSuggestions();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void updateFocusedState() {
        int[] iArr;
        if (this.mSearchSrcTextView.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        AbstractC0495a aVar = this.mSuggestionsAdapter;
        if (aVar != null) {
            aVar.mo2775a((Cursor) null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            View$OnClickListenerC0487z zVar = new View$OnClickListenerC0487z(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = zVar;
            this.mSearchSrcTextView.setAdapter(zVar);
            View$OnClickListenerC0487z zVar2 = (View$OnClickListenerC0487z) this.mSuggestionsAdapter;
            if (this.mQueryRefinement) {
                i = 2;
            }
            zVar2.mo2774a(i);
        }
    }

    /* access modifiers changed from: package-private */
    public void adjustDropDownSizeAndPosition() {
        int i;
        int i2;
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean a = al.m1864a(this);
            if (this.mIconifiedByDefault) {
                i = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left);
            } else {
                i = 0;
            }
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (a) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i2);
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setOnCloseListener(AbstractC0406a aVar) {
        this.mOnCloseListener = aVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AbstractC0407b bVar) {
        this.mOnQueryChangeListener = bVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC0408c cVar) {
        this.mOnSuggestionListener = cVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setSuggestionsAdapter(AbstractC0495a aVar) {
        this.mSuggestionsAdapter = aVar;
        this.mSearchSrcTextView.setAdapter(aVar);
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            updateViewsVisibility(z);
            updateQueryHint();
        }
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    static boolean isLandscapeMode(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private void setQuery(CharSequence charSequence) {
        int i;
        this.mSearchSrcTextView.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    private void updateSubmitButton(boolean z) {
        int i;
        if (!this.mSubmitButtonEnabled || !isSubmitAreaEnabled() || !hasFocus() || (!z && this.mVoiceButtonEnabled)) {
            i = 8;
        } else {
            i = 0;
        }
        this.mGoButton.setVisibility(i);
    }

    private void updateVoiceButton(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    public boolean onItemSelected(int i) {
        AbstractC0408c cVar = this.mOnSuggestionListener;
        if (cVar != null && cVar.mo2282a(i)) {
            return false;
        }
        rewriteQueryFromSuggestion(i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo4902a());
        updateViewsVisibility(savedState.f1400a);
        requestLayout();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.mQueryRefinement = z;
        AbstractC0495a aVar = this.mSuggestionsAdapter;
        if (aVar instanceof View$OnClickListenerC0487z) {
            View$OnClickListenerC0487z zVar = (View$OnClickListenerC0487z) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            zVar.mo2774a(i);
        }
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.mSearchSrcTextView.getTextSize()) * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    private void rewriteQueryFromSuggestion(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor a = this.mSuggestionsAdapter.mo2794a();
        if (a != null) {
            if (a.moveToPosition(i)) {
                CharSequence b = this.mSuggestionsAdapter.mo2777b(a);
                if (b != null) {
                    setQuery(b);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean z = !TextUtils.isEmpty(text);
        updateSubmitButton(z);
        updateVoiceButton(!z);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.onQueryTextChange(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean hasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = hasVoiceSearch;
        if (hasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions("nm");
        }
        updateViewsVisibility(isIconified());
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    private static class C0410e extends TouchDelegate {

        /* renamed from: a */
        private final View f1409a;

        /* renamed from: b */
        private final Rect f1410b = new Rect();

        /* renamed from: c */
        private final Rect f1411c = new Rect();

        /* renamed from: d */
        private final Rect f1412d = new Rect();

        /* renamed from: e */
        private final int f1413e;

        /* renamed from: f */
        private boolean f1414f;

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0410e.onTouchEvent(android.view.MotionEvent):boolean");
        }

        /* renamed from: a */
        public void mo2287a(Rect rect, Rect rect2) {
            this.f1410b.set(rect);
            this.f1412d.set(rect);
            Rect rect3 = this.f1412d;
            int i = this.f1413e;
            rect3.inset(-i, -i);
            this.f1411c.set(rect2);
        }

        public C0410e(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1413e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo2287a(rect, rect2);
            this.f1409a = view;
        }
    }

    private void updateViewsVisibility(boolean z) {
        int i;
        int i2;
        this.mIconified = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i);
        updateSubmitButton(z2);
        View view = this.mSearchEditFrame;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) {
            i3 = 8;
        }
        this.mCollapsedIcon.setVisibility(i3);
        updateCloseButton();
        updateVoiceButton(!z2);
        updateSubmitArea();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i = 1;
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor a = this.mSuggestionsAdapter.mo2794a();
        if (a == null || !a.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(a, i2, str));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    public boolean onItemClicked(int i, int i2, String str) {
        AbstractC0408c cVar = this.mOnSuggestionListener;
        if (cVar != null && cVar.mo2283b(i)) {
            return false;
        }
        launchSuggestion(i, 0, null);
        this.mSearchSrcTextView.setImeVisibility(false);
        dismissSuggestions();
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.mSearchSrcTextView.length();
                }
                this.mSearchSrcTextView.setSelection(i2);
                this.mSearchSrcTextView.setListSelection(0);
                this.mSearchSrcTextView.clearListSelection();
                this.mSearchSrcTextView.mo2267c();
                return true;
            } else if (i != 19 || this.mSearchSrcTextView.getListSelection() == 0) {
                return false;
            }
        }
        return false;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String a;
        try {
            String a2 = View$OnClickListenerC0487z.m2157a(cursor, "suggest_intent_action");
            if (a2 == null) {
                a2 = this.mSearchable.getSuggestIntentAction();
            }
            if (a2 == null) {
                a2 = "android.intent.action.SEARCH";
            }
            String a3 = View$OnClickListenerC0487z.m2157a(cursor, "suggest_intent_data");
            if (a3 == null) {
                a3 = this.mSearchable.getSuggestIntentData();
            }
            if (!(a3 == null || (a = View$OnClickListenerC0487z.m2157a(cursor, "suggest_intent_data_id")) == null)) {
                a3 = a3 + "/" + Uri.encode(a);
            }
            if (a3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(a3);
            }
            return createIntent(a2, uri, View$OnClickListenerC0487z.m2157a(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0487z.m2157a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new Runnable() {
            /* class androidx.appcompat.widget.SearchView.RunnableC03951 */

            public void run() {
                SearchView.this.updateFocusedState();
            }
        };
        this.mReleaseCursorRunnable = new Runnable() {
            /* class androidx.appcompat.widget.SearchView.RunnableC03973 */

            public void run() {
                if (SearchView.this.mSuggestionsAdapter instanceof View$OnClickListenerC0487z) {
                    SearchView.this.mSuggestionsAdapter.mo2775a((Cursor) null);
                }
            }
        };
        this.mOutsideDrawablesCache = new WeakHashMap<>();
        View$OnClickListenerC04006 r2 = new View.OnClickListener() {
            /* class androidx.appcompat.widget.SearchView.View$OnClickListenerC04006 */

            public void onClick(View view) {
                if (view == SearchView.this.mSearchButton) {
                    SearchView.this.onSearchClicked();
                } else if (view == SearchView.this.mCloseButton) {
                    SearchView.this.onCloseClicked();
                } else if (view == SearchView.this.mGoButton) {
                    SearchView.this.onSubmitQuery();
                } else if (view == SearchView.this.mVoiceButton) {
                    SearchView.this.onVoiceClicked();
                } else if (view == SearchView.this.mSearchSrcTextView) {
                    SearchView.this.forceSuggestionQuery();
                }
            }
        };
        this.mOnClickListener = r2;
        this.mTextKeyListener = new View.OnKeyListener() {
            /* class androidx.appcompat.widget.SearchView.View$OnKeyListenerC04017 */

            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (SearchView.this.mSearchable == null) {
                    return false;
                }
                if (SearchView.this.mSearchSrcTextView.isPopupShowing() && SearchView.this.mSearchSrcTextView.getListSelection() != -1) {
                    return SearchView.this.onSuggestionsKey(view, i, keyEvent);
                }
                if (SearchView.this.mSearchSrcTextView.mo2265a() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView = SearchView.this;
                searchView.launchQuerySearch(0, null, searchView.mSearchSrcTextView.getText().toString());
                return true;
            }
        };
        C04028 r3 = new TextView.OnEditorActionListener() {
            /* class androidx.appcompat.widget.SearchView.C04028 */

            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                SearchView.this.onSubmitQuery();
                return true;
            }
        };
        this.mOnEditorActionListener = r3;
        C04039 r4 = new AdapterView.OnItemClickListener() {
            /* class androidx.appcompat.widget.SearchView.C04039 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.onItemClicked(i, 0, null);
            }
        };
        this.mOnItemClickListener = r4;
        AnonymousClass10 r5 = new AdapterView.OnItemSelectedListener() {
            /* class androidx.appcompat.widget.SearchView.AnonymousClass10 */

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                SearchView.this.onItemSelected(i);
            }
        };
        this.mOnItemSelectedListener = r5;
        this.mTextWatcher = new TextWatcher() {
            /* class androidx.appcompat.widget.SearchView.C03962 */

            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                SearchView.this.onTextChanged(charSequence);
            }
        };
        C0427af a = C0427af.m1778a(context, attributeSet, new int[]{16842970, 16843039, 16843296, 16843364, R.attr.closeIcon, R.attr.commitIcon, R.attr.defaultQueryHint, R.attr.goIcon, R.attr.iconifiedByDefault, R.attr.layout, R.attr.queryBackground, R.attr.queryHint, R.attr.searchHintIcon, R.attr.searchIcon, R.attr.submitBackground, R.attr.suggestionRowLayout, R.attr.voiceIcon}, i, 0);
        LayoutInflater.from(context).inflate(a.mo2491g(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.mSearchEditFrame = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.mSearchPlate = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.mSubmitArea = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        ViewCompat.m4039a(findViewById, a.mo2477a(10));
        ViewCompat.m4039a(findViewById2, a.mo2477a(14));
        imageView.setImageDrawable(a.mo2477a(13));
        imageView2.setImageDrawable(a.mo2477a(7));
        imageView3.setImageDrawable(a.mo2477a(4));
        imageView4.setImageDrawable(a.mo2477a(16));
        imageView5.setImageDrawable(a.mo2477a(13));
        this.mSearchHintIcon = a.mo2477a(12);
        C0431ah.m1845a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.mSuggestionRowLayout = a.mo2491g(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = a.mo2491g(5, 0);
        imageView.setOnClickListener(r2);
        imageView3.setOnClickListener(r2);
        imageView2.setOnClickListener(r2);
        imageView4.setOnClickListener(r2);
        searchAutoComplete.setOnClickListener(r2);
        searchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchAutoComplete.setOnEditorActionListener(r3);
        searchAutoComplete.setOnItemClickListener(r4);
        searchAutoComplete.setOnItemSelectedListener(r5);
        searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            /* class androidx.appcompat.widget.SearchView.View$OnFocusChangeListenerC03984 */

            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.mOnQueryTextFocusChangeListener != null) {
                    SearchView.this.mOnQueryTextFocusChangeListener.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(a.mo2478a(8, true));
        int e = a.mo2487e(1, -1);
        if (e != -1) {
            setMaxWidth(e);
        }
        this.mDefaultQueryHint = a.mo2484c(6);
        this.mQueryHint = a.mo2484c(11);
        int a2 = a.mo2474a(3, -1);
        if (a2 != -1) {
            setImeOptions(a2);
        }
        int a3 = a.mo2474a(2, -1);
        if (a3 != -1) {
            setInputType(a3);
        }
        setFocusable(a.mo2478a(0, true));
        a.mo2482b();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                /* class androidx.appcompat.widget.SearchView.View$OnLayoutChangeListenerC03995 */

                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    SearchView.this.adjustDropDownSizeAndPosition();
                }
            });
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, i4 - i2);
            C0410e eVar = this.mTouchDelegate;
            if (eVar == null) {
                C0410e eVar2 = new C0410e(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
                this.mTouchDelegate = eVar2;
                setTouchDelegate(eVar2);
                return;
            }
            eVar.mo2287a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }
}
