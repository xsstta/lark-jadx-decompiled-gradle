package com.ss.android.lark.searchcommon.view;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.huawei.hms.actions.SearchIntents;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;
import com.ss.android.lark.searchcommon.utils.SearchDebounce;
import com.ss.android.lark.searchcommon.view.span.SearchFilterSpan;
import com.ss.android.lark.utils.C57767ae;
import kotlin.Metadata;
import kotlin.collections.C69043h;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001\u001a\u0018\u0000 ?2\u00020\u0001:\u0005?@ABCB\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0010\u0010 \u001a\u00020\u001d2\b\b\u0002\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u001dJ\u0006\u0010$\u001a\u00020\u0012J\b\u0010%\u001a\u00020\u001dH\u0002J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020\u001dJ\u0010\u0010*\u001a\u00020\u001d2\b\b\u0001\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020,J\u000e\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\nJ*\u00101\u001a\u00020\u001d2\"\u00102\u001a\u001e\u0012\u0006\u0012\u0004\u0018\u000104\u0012\u0004\u0012\u00020,\u0012\u0006\u0012\u0004\u0018\u000105\u0012\u0004\u0012\u00020\"03J\u000e\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\fJ\u000e\u00108\u001a\u00020\u001d2\u0006\u00109\u001a\u00020\u000eJ\u000e\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u0010J\u000e\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u0012J\u000e\u0010>\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\u0012R\u000e\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\u0004\n\u0002\u0010\u001b¨\u0006D"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchInputView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mContext", "mOnClearBtnClick", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnClearBtnClick;", "mOnFilter", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnFilter;", "mOnQueryClear", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnQueryClear;", "mOnSearch", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnSearch;", "mQuery", "", "mSearchClearBtn", "Landroid/view/View;", "mSearchDebounce", "Lcom/ss/android/lark/searchcommon/utils/SearchDebounce;", "mSearchEdtTxt", "Landroid/widget/EditText;", "mTextWatcher", "com/ss/android/lark/searchcommon/view/SearchInputView$mTextWatcher$1", "Lcom/ss/android/lark/searchcommon/view/SearchInputView$mTextWatcher$1;", "clearFocus", "", "clearOpenSearchFilter", "clearText", "default", "softInputPopup", "", "destroy", "getQuery", "initView", "insertOpenSearchFilter", "info", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "requestInputFocus", "setHint", "hint", "", "setImeOptions", "imeOptions", "setOnClearBtnClick", "onClearBtnClick", "setOnEditorActionListener", "listener", "Lkotlin/Function3;", "Landroid/widget/TextView;", "Landroid/view/KeyEvent;", "setOnFilter", "onFilter", "setOnQueryClear", "onQueryClear", "setOnSearch", "onSearch", "setText", "text", "setTextPurely", "Companion", "IOnClearBtnClick", "IOnFilter", "IOnQueryClear", "IOnSearch", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SearchInputView extends FrameLayout {

    /* renamed from: j */
    public static final Companion f133423j = new Companion(null);

    /* renamed from: a */
    public Context f133424a;

    /* renamed from: b */
    public EditText f133425b;

    /* renamed from: c */
    public View f133426c;

    /* renamed from: d */
    public IOnSearch f133427d;

    /* renamed from: e */
    public final SearchDebounce f133428e;

    /* renamed from: f */
    public IOnFilter f133429f;

    /* renamed from: g */
    public IOnClearBtnClick f133430g;

    /* renamed from: h */
    public String f133431h;

    /* renamed from: i */
    public IOnQueryClear f133432i;

    /* renamed from: k */
    private final C53964j f133433k;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnClearBtnClick;", "", "onClick", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$b */
    public interface IOnClearBtnClick {
        /* renamed from: a */
        void mo183466a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnFilter;", "", "onFilter", "", "filterInfo", "Lcom/ss/android/lark/searchcommon/dto/info/SearchOpenSearchInfo;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$c */
    public interface IOnFilter {
        /* renamed from: a */
        void mo183467a(SearchOpenSearchInfo searchOpenSearchInfo);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnQueryClear;", "", "onQueryClear", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$d */
    public interface IOnQueryClear {
        /* renamed from: a */
        void mo162384a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchInputView$IOnSearch;", "", "onSearch", "", SearchIntents.EXTRA_QUERY, "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$e */
    public interface IOnSearch {
        /* renamed from: a */
        void mo162383a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/SearchInputView$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final String getQuery() {
        return this.f133431h;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$k */
    public static final class RunnableC53966k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SearchInputView f133443a;

        RunnableC53966k(SearchInputView searchInputView) {
            this.f133443a = searchInputView;
        }

        public final void run() {
            try {
                KeyboardUtils.showKeyboard(SearchInputView.m209257a(this.f133443a));
            } catch (Exception unused) {
            }
        }
    }

    public void clearFocus() {
        KeyboardUtils.hideKeyboard(this.f133424a);
        super.clearFocus();
    }

    /* renamed from: a */
    public final void mo184580a() {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        postDelayed(new RunnableC53966k(this), 150);
    }

    /* renamed from: b */
    public final void mo184583b() {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.removeTextChangedListener(this.f133433k);
    }

    /* renamed from: c */
    public final void mo184584c() {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.setText("");
    }

    /* renamed from: d */
    public final void mo184586d() {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        Editable editableText = editText.getEditableText();
        SearchFilterSpan[] aVarArr = (SearchFilterSpan[]) editableText.getSpans(0, editableText.length(), SearchFilterSpan.class);
        if (aVarArr != null) {
            for (SearchFilterSpan aVar : aVarArr) {
                int spanStart = editableText.getSpanStart(aVar);
                int spanEnd = editableText.getSpanEnd(aVar);
                if (spanStart >= 0 && spanEnd > spanStart) {
                    editableText.removeSpan(aVar);
                    editableText.replace(spanStart, spanEnd, "");
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"com/ss/android/lark/searchcommon/view/SearchInputView$mTextWatcher$1", "Lcom/ss/android/lark/utils/SimpleTextWatcher;", "hasFilterSpan", "", "getHasFilterSpan", "()Z", "setHasFilterSpan", "(Z)V", "afterTextChanged", "", "s", "Landroid/text/Editable;", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$j */
    public static final class C53964j extends C57767ae {

        /* renamed from: a */
        final /* synthetic */ SearchInputView f133439a;

        /* renamed from: b */
        private boolean f133440b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$j$a */
        static final class RunnableC53965a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C53964j f133441a;

            /* renamed from: b */
            final /* synthetic */ String f133442b;

            RunnableC53965a(C53964j jVar, String str) {
                this.f133441a = jVar;
                this.f133442b = str;
            }

            public final void run() {
                boolean z;
                String str = this.f133442b;
                if (str != null) {
                    this.f133441a.f133439a.f133431h = str;
                    Log.m165379d("LarkSearch.Common.SearchInputView", "real txt: " + this.f133441a.f133439a.f133431h);
                    String str2 = str;
                    if (str2.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        SearchInputView.m209258b(this.f133441a.f133439a).setVisibility(8);
                        this.f133441a.f133439a.f133428e.mo184566a();
                        IOnQueryClear dVar = this.f133441a.f133439a.f133432i;
                        if (dVar != null) {
                            dVar.mo162384a();
                            return;
                        }
                        return;
                    }
                    SearchInputView.m209258b(this.f133441a.f133439a).setVisibility(0);
                    if (StringsKt.isBlank(str2)) {
                        Log.m165389i("LarkSearch.Common.SearchInputView", "ignore blank.");
                        return;
                    }
                    IOnSearch eVar = this.f133441a.f133439a.f133427d;
                    if (eVar != null) {
                        eVar.mo162383a(str);
                    }
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C53964j(SearchInputView searchInputView) {
            this.f133439a = searchInputView;
        }

        @Override // com.ss.android.lark.utils.C57767ae
        public void afterTextChanged(Editable editable) {
            SearchFilterSpan aVar;
            SearchFilterSpan[] aVarArr;
            String str = null;
            if (editable == null || (aVarArr = (SearchFilterSpan[]) editable.getSpans(0, editable.length(), SearchFilterSpan.class)) == null) {
                aVar = null;
            } else {
                aVar = (SearchFilterSpan) C69043h.m265778d(aVarArr);
            }
            if (aVar != null) {
                this.f133440b = true;
                int spanStart = editable.getSpanStart(aVar);
                if (spanStart > 0) {
                    C53964j jVar = this;
                    SearchInputView.m209257a(this.f133439a).removeTextChangedListener(jVar);
                    editable.replace(0, spanStart, "");
                    SearchInputView.m209257a(this.f133439a).addTextChangedListener(jVar);
                    return;
                }
            } else if (this.f133440b) {
                this.f133440b = false;
                IOnFilter cVar = this.f133439a.f133429f;
                if (cVar != null) {
                    cVar.mo183467a(null);
                }
            }
            if (aVar != null) {
                int spanEnd = editable.getSpanEnd(aVar);
                Editable editable2 = editable;
                str = editable2.subSequence(spanEnd, editable2.length()).toString();
            } else if (editable != null) {
                str = editable.toString();
            }
            Log.m165379d("LarkSearch.Common.SearchInputView", "txt: " + str);
            this.f133439a.f133428e.mo184567a(new RunnableC53965a(this, str));
        }
    }

    /* renamed from: e */
    private final void m209259e() {
        View findViewById = findViewById(R.id.search_edt_txt);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.search_edt_txt)");
        this.f133425b = (EditText) findViewById;
        View findViewById2 = findViewById(R.id.search_clear_iv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.search_clear_iv)");
        this.f133426c = findViewById2;
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.addTextChangedListener(this.f133433k);
        editText.setOnFocusChangeListener(new View$OnFocusChangeListenerC53960f(editText, this));
        editText.setImeOptions(3);
        editText.setOnEditorActionListener(new C53961g(this));
        View view = this.f133426c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchClearBtn");
        }
        view.setOnClickListener(new View$OnClickListenerC53962h(this));
        setOnClickListener(new View$OnClickListenerC53963i(this));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$i */
    public static final class View$OnClickListenerC53963i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchInputView f133438a;

        View$OnClickListenerC53963i(SearchInputView searchInputView) {
            this.f133438a = searchInputView;
        }

        public final void onClick(View view) {
            this.f133438a.mo184580a();
        }
    }

    public final void setOnClearBtnClick(IOnClearBtnClick bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "onClearBtnClick");
        this.f133430g = bVar;
    }

    public final void setOnFilter(IOnFilter cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "onFilter");
        this.f133429f = cVar;
    }

    public final void setOnQueryClear(IOnQueryClear dVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "onQueryClear");
        this.f133432i = dVar;
    }

    public final void setOnSearch(IOnSearch eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "onSearch");
        this.f133427d = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchInputView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public static final /* synthetic */ EditText m209257a(SearchInputView searchInputView) {
        EditText editText = searchInputView.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        return editText;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m209258b(SearchInputView searchInputView) {
        View view = searchInputView.f133426c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchClearBtn");
        }
        return view;
    }

    public final void setHint(int i) {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.setHint(i);
    }

    public final void setImeOptions(int i) {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.setImeOptions(i);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$h */
    public static final class View$OnClickListenerC53962h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchInputView f133437a;

        View$OnClickListenerC53962h(SearchInputView searchInputView) {
            this.f133437a = searchInputView;
        }

        public final void onClick(View view) {
            this.f133437a.f133431h = "";
            SearchInputView.m209257a(this.f133437a).setText(this.f133437a.f133431h);
            IOnClearBtnClick bVar = this.f133437a.f133430g;
            if (bVar != null) {
                bVar.mo183466a();
            }
        }
    }

    public final void setOnEditorActionListener(Function3<? super TextView, ? super Integer, ? super KeyEvent, Boolean> oVar) {
        Intrinsics.checkParameterIsNotNull(oVar, "listener");
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.setOnEditorActionListener(new C54006e(oVar));
    }

    /* renamed from: a */
    public final void mo184582a(boolean z) {
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText.removeTextChangedListener(this.f133433k);
        editText.setText("");
        editText.addTextChangedListener(this.f133433k);
        if (z) {
            mo184580a();
        }
        View view = this.f133426c;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchClearBtn");
        }
        view.setVisibility(8);
    }

    public final void setText(String str) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "text");
        String str2 = str;
        if (!StringsKt.isBlank(str2)) {
            EditText editText = this.f133425b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
            }
            editText.setText(str2);
            EditText editText2 = this.f133425b;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
            }
            Editable text = editText2.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            editText.setSelection(i);
        }
    }

    /* renamed from: a */
    public final void mo184581a(SearchOpenSearchInfo searchOpenSearchInfo) {
        Intrinsics.checkParameterIsNotNull(searchOpenSearchInfo, "info");
        SpannableString spannableString = new SpannableString(" ");
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        spannableString.setSpan(new SearchFilterSpan(context, searchOpenSearchInfo), 0, 1, 33);
        EditText editText = this.f133425b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        Editable editableText = editText.getEditableText();
        editableText.insert(0, spannableString);
        EditText editText2 = this.f133425b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
        }
        editText2.setSelection(editableText.length());
    }

    public final void setTextPurely(String str) {
        int i;
        Intrinsics.checkParameterIsNotNull(str, "text");
        String str2 = str;
        if (!StringsKt.isBlank(str2)) {
            EditText editText = this.f133425b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
            }
            editText.removeTextChangedListener(this.f133433k);
            editText.setText(str2);
            EditText editText2 = this.f133425b;
            if (editText2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchEdtTxt");
            }
            Editable text = editText2.getText();
            if (text != null) {
                i = text.length();
            } else {
                i = 0;
            }
            editText.setSelection(i);
            View view = this.f133426c;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchClearBtn");
            }
            view.setVisibility(0);
            editText.addTextChangedListener(this.f133433k);
        }
        this.f133431h = str;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange", "com/ss/android/lark/searchcommon/view/SearchInputView$initView$1$1"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$f */
    public static final class View$OnFocusChangeListenerC53960f implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ EditText f133434a;

        /* renamed from: b */
        final /* synthetic */ SearchInputView f133435b;

        View$OnFocusChangeListenerC53960f(EditText editText, SearchInputView searchInputView) {
            this.f133434a = editText;
            this.f133435b = searchInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                KeyboardUtils.showKeyboard(SearchInputView.m209257a(this.f133435b));
            } else if (TextUtils.isEmpty(this.f133434a.getText())) {
                KeyboardUtils.hideKeyboard(this.f133435b.f133424a);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchInputView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133428e = new SearchDebounce();
        this.f133431h = "";
        this.f133433k = new C53964j(this);
        this.f133424a = context;
        LayoutInflater.from(context).inflate(R.layout.view_search_edt_text, (ViewGroup) this, true);
        m209259e();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction", "com/ss/android/lark/searchcommon/view/SearchInputView$initView$1$2"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.SearchInputView$g */
    public static final class C53961g implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ SearchInputView f133436a;

        C53961g(SearchInputView searchInputView) {
            this.f133436a = searchInputView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (StringsKt.isBlank(this.f133436a.f133431h)) {
                return false;
            }
            KeyboardUtils.hideKeyboard(this.f133436a.f133424a);
            IOnSearch eVar = this.f133436a.f133427d;
            if (eVar == null) {
                return true;
            }
            eVar.mo162383a(this.f133436a.f133431h);
            return true;
        }
    }
}
