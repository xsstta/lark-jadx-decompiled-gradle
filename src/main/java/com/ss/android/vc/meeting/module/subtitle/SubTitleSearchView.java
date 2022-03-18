package com.ss.android.vc.meeting.module.subtitle;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.meeting.AbstractC61294b;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.statistics.event2.MeetingSubtitleEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001HB\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J*\u0010\"\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0016J\u0006\u0010'\u001a\u00020\u001fJ\b\u0010(\u001a\u0004\u0018\u00010\u0010J\u0006\u0010)\u001a\u00020*J\b\u0010+\u001a\u00020\u001fH\u0002J\u0012\u0010,\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u0015H\u0016J$\u0010.\u001a\u00020/2\b\u0010-\u001a\u0004\u0018\u00010\u00172\u0006\u00100\u001a\u00020\r2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001fH\u0014J\u001a\u00104\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u00152\u0006\u00105\u001a\u00020/H\u0016J*\u00106\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\r2\u0006\u00107\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016J\u0006\u00108\u001a\u00020\u001fJ\u0006\u00109\u001a\u00020\u001fJ\u0006\u0010:\u001a\u00020\u001fJ\u000e\u0010;\u001a\u00020\u001f2\u0006\u0010<\u001a\u00020\u0010J\u000e\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020/J\b\u0010?\u001a\u00020\u001fH\u0002J\u0010\u0010@\u001a\u00020\u001f2\u0006\u00105\u001a\u00020/H\u0002J\u000e\u0010A\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020/J\u000e\u0010C\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020/J\u001e\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020F2\u0006\u0010%\u001a\u00020F2\u0006\u0010G\u001a\u00020/R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0001X.¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/SubTitleSearchView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnFocusChangeListener;", "Landroid/text/TextWatcher;", "Landroid/widget/TextView$OnEditorActionListener;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mCallback", "Lcom/ss/android/vc/meeting/module/subtitle/SubTitleSearchView$Callback;", "mDeleteIconView", "Lcom/ss/android/vc/common/widget/IconFontView;", "mFilterIconView", "mIndexDivider", "Landroid/view/View;", "mIndexTv", "Landroid/widget/TextView;", "mSearchIconView", "mSearchInputView", "Landroid/widget/EditText;", "mSelectBgView", "Landroid/widget/FrameLayout;", "mSelectContentView", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "clearEditTextFocus", "getCallback", "getInputText", "", "init", "onClick", "v", "onEditorAction", "", "actionId", "event", "Landroid/view/KeyEvent;", "onFinishInflate", "onFocusChange", "hasFocus", "onTextChanged", "before", "resetFilterView", "resetSearchView", "resetView", "setCallback", "callback", "setFilterSelected", "isSelected", "setListeners", "setSearchBgSelected", "setSearchFilterEnable", "isEnable", "setSearchIconSelected", "showIndex", "index", "Ljava/lang/Integer;", "isShow", "Callback", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class SubTitleSearchView extends LinearLayout implements TextWatcher, View.OnClickListener, View.OnFocusChangeListener, TextView.OnEditorActionListener {

    /* renamed from: a */
    private IconFontView f159035a;

    /* renamed from: b */
    private EditText f159036b;

    /* renamed from: c */
    private IconFontView f159037c;

    /* renamed from: d */
    private IconFontView f159038d;

    /* renamed from: e */
    private FrameLayout f159039e;

    /* renamed from: f */
    private LinearLayout f159040f;

    /* renamed from: g */
    private TextView f159041g;

    /* renamed from: h */
    private View f159042h;

    /* renamed from: i */
    private Callback f159043i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/meeting/module/subtitle/SubTitleSearchView$Callback;", "", "afterTextChanged", "", "onClickDelete", "onClickDown", "onClickFilter", "onClickSearch", "searchKey", "", "onClickUp", "onResetSearchView", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.subtitle.SubTitleSearchView$a */
    public interface Callback {
        /* renamed from: a */
        void mo218524a();

        /* renamed from: a */
        void mo218525a(String str);

        /* renamed from: b */
        void mo218526b();

        /* renamed from: c */
        void mo218527c();

        /* renamed from: d */
        void mo218528d();

        /* renamed from: e */
        void mo218529e();

        /* renamed from: f */
        void mo218530f();
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final Callback getCallback() {
        return this.f159043i;
    }

    /* renamed from: a */
    public final void mo218506a() {
        mo218511c();
        mo218509b();
    }

    /* renamed from: b */
    public final void mo218509b() {
        setFilterSelected(false);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m247151e();
        m247152f();
    }

    /* renamed from: d */
    public final void mo218512d() {
        EditText editText = this.f159036b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText.clearFocus();
        KeyboardUtils.hideKeyboard(getContext());
    }

    public final String getInputText() {
        EditText editText = this.f159036b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        return editText.getText().toString();
    }

    /* renamed from: c */
    public final void mo218511c() {
        setSearchIconSelected(false);
        EditText editText = this.f159036b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText.setText((CharSequence) null);
        IconFontView iconFontView = this.f159037c;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteIconView");
        }
        iconFontView.setVisibility(8);
        mo218507a(new Integer(0), new Integer(0), false);
        Callback aVar = this.f159043i;
        if (aVar != null) {
            aVar.mo218529e();
        }
    }

    /* renamed from: f */
    private final void m247152f() {
        EditText editText = this.f159036b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText.setOnFocusChangeListener(this);
        EditText editText2 = this.f159036b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText2.addTextChangedListener(this);
        EditText editText3 = this.f159036b;
        if (editText3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText3.setOnEditorActionListener(this);
        IconFontView iconFontView = this.f159037c;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteIconView");
        }
        SubTitleSearchView subTitleSearchView = this;
        iconFontView.setOnClickListener(subTitleSearchView);
        IconFontView iconFontView2 = this.f159038d;
        if (iconFontView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
        }
        iconFontView2.setOnClickListener(subTitleSearchView);
    }

    /* renamed from: e */
    private final void m247151e() {
        View findViewById = findViewById(R.id.history_search_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.history_search_icon)");
        this.f159035a = (IconFontView) findViewById;
        View findViewById2 = findViewById(R.id.history_search_edit_text);
        Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.history_search_edit_text)");
        this.f159036b = (EditText) findViewById2;
        View findViewById3 = findViewById(R.id.history_search_delete_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById3, "findViewById(R.id.history_search_delete_icon)");
        this.f159037c = (IconFontView) findViewById3;
        View findViewById4 = findViewById(R.id.history_filter_icon);
        Intrinsics.checkExpressionValueIsNotNull(findViewById4, "findViewById(R.id.history_filter_icon)");
        this.f159038d = (IconFontView) findViewById4;
        View findViewById5 = findViewById(R.id.fl_select_bg);
        Intrinsics.checkExpressionValueIsNotNull(findViewById5, "findViewById(R.id.fl_select_bg)");
        this.f159039e = (FrameLayout) findViewById5;
        View findViewById6 = findViewById(R.id.ll_search_content);
        Intrinsics.checkExpressionValueIsNotNull(findViewById6, "findViewById(R.id.ll_search_content)");
        this.f159040f = (LinearLayout) findViewById6;
        View findViewById7 = findViewById(R.id.index_tv);
        Intrinsics.checkExpressionValueIsNotNull(findViewById7, "findViewById(R.id.index_tv)");
        this.f159041g = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.index_divider);
        Intrinsics.checkExpressionValueIsNotNull(findViewById8, "findViewById(R.id.index_divider)");
        this.f159042h = findViewById8;
        mo218506a();
    }

    public final void setCallback(Callback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f159043i = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SubTitleSearchView(Context context) {
        this(context, null);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public final void setSearchIconSelected(boolean z) {
        IconFontView iconFontView = this.f159035a;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchIconView");
        }
        iconFontView.setSelected(z);
    }

    public void afterTextChanged(Editable editable) {
        int i;
        IconFontView iconFontView = this.f159037c;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeleteIconView");
        }
        if (editable == null || editable.length() != 0) {
            i = 0;
        } else {
            i = 8;
        }
        iconFontView.setVisibility(i);
        Callback aVar = this.f159043i;
        if (aVar != null) {
            aVar.mo218530f();
        }
    }

    private final void setSearchBgSelected(boolean z) {
        if (z) {
            FrameLayout frameLayout = this.f159039e;
            if (frameLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSelectBgView");
            }
            frameLayout.setBackgroundResource(R.drawable.bg_history_search_select_layout);
            return;
        }
        FrameLayout frameLayout2 = this.f159039e;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectBgView");
        }
        frameLayout2.setBackgroundColor(getResources().getColor(R.color.vc_transparent));
    }

    public void onClick(View view) {
        Integer num;
        Callback aVar;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.history_search_up_icon) {
            Callback aVar2 = this.f159043i;
            if (aVar2 != null) {
                aVar2.mo218524a();
            }
        } else if (num != null && num.intValue() == R.id.history_search_down_icon) {
            Callback aVar3 = this.f159043i;
            if (aVar3 != null) {
                aVar3.mo218526b();
            }
        } else if (num != null && num.intValue() == R.id.history_search_delete_icon) {
            EditText editText = this.f159036b;
            if (editText == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
            }
            editText.setText((CharSequence) null);
            Callback aVar4 = this.f159043i;
            if (aVar4 != null) {
                aVar4.mo218528d();
            }
        } else if (num != null && num.intValue() == R.id.history_filter_icon && (aVar = this.f159043i) != null) {
            aVar.mo218527c();
        }
    }

    public final void setFilterSelected(boolean z) {
        IconFontView iconFontView = this.f159038d;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
        }
        iconFontView.setSelected(z);
        if (z) {
            IconFontView iconFontView2 = this.f159038d;
            if (iconFontView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
            }
            iconFontView2.setTextColor(C60773o.m236126d(R.color.primary_pri_500));
            IconFontView iconFontView3 = this.f159038d;
            if (iconFontView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
            }
            iconFontView3.setBackgroundResource(R.drawable.bg_history_filter_selected);
            return;
        }
        IconFontView iconFontView4 = this.f159038d;
        if (iconFontView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
        }
        iconFontView4.setTextColor(C60773o.m236126d(R.color.icon_n1));
        IconFontView iconFontView5 = this.f159038d;
        if (iconFontView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
        }
        iconFontView5.setBackgroundResource(R.drawable.bg_history_search_layout);
    }

    public final void setSearchFilterEnable(boolean z) {
        IconFontView iconFontView = this.f159035a;
        if (iconFontView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchIconView");
        }
        iconFontView.setEnabled(z);
        EditText editText = this.f159036b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText.setEnabled(z);
        IconFontView iconFontView2 = this.f159038d;
        if (iconFontView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
        }
        iconFontView2.setEnabled(z);
        LinearLayout linearLayout = this.f159040f;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectContentView");
        }
        linearLayout.setBackground(C60773o.m236128f(R.drawable.bg_history_search_layout));
        IconFontView iconFontView3 = this.f159035a;
        if (iconFontView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchIconView");
        }
        iconFontView3.setTextColor(C60773o.m236126d(R.color.icon_n3));
        EditText editText2 = this.f159036b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        editText2.setHintTextColor(C60773o.m236126d(R.color.text_placeholder));
        IconFontView iconFontView4 = this.f159038d;
        if (iconFontView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFilterIconView");
        }
        iconFontView4.setTextColor(C60773o.m236126d(R.color.icon_n1));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SubTitleSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public void onFocusChange(View view, boolean z) {
        setSearchIconSelected(z);
        if (z) {
            MeetingManager a = MeetingManager.m238341a();
            Intrinsics.checkExpressionValueIsNotNull(a, "MeetingManager.getInstance()");
            AbstractC61294b j = a.mo211906j();
            if (!(j instanceof C61303k)) {
                j = null;
            }
            C61303k kVar = (C61303k) j;
            if (kVar != null) {
                MeetingSubtitleEvent.f160806b.mo220229a().mo220228a("search", "none", null, kVar.mo212056e(), kVar.mo212093K());
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SubTitleSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        KeyboardUtils.hideKeyboard(getContext());
        EditText editText = this.f159036b;
        if (editText == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        if (editText.getText() == null) {
            Callback aVar = this.f159043i;
            if (aVar == null) {
                return false;
            }
            aVar.mo218525a("");
            return false;
        }
        Callback aVar2 = this.f159043i;
        if (aVar2 == null) {
            return false;
        }
        EditText editText2 = this.f159036b;
        if (editText2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchInputView");
        }
        aVar2.mo218525a(editText2.getText().toString());
        return false;
    }

    /* renamed from: a */
    public final void mo218507a(Integer num, Integer num2, boolean z) {
        Intrinsics.checkParameterIsNotNull(num, "index");
        Intrinsics.checkParameterIsNotNull(num2, "count");
        if (z) {
            TextView textView = this.f159041g;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIndexTv");
            }
            C60752f.m236079a((View) textView);
            View view = this.f159042h;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIndexDivider");
            }
            C60752f.m236079a(view);
            TextView textView2 = this.f159041g;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIndexTv");
            }
            textView2.setText(num.toString() + "/" + num2.toString());
            return;
        }
        TextView textView3 = this.f159041g;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIndexTv");
        }
        C60752f.m236083c(textView3);
        View view2 = this.f159042h;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mIndexDivider");
        }
        C60752f.m236083c(view2);
    }
}
