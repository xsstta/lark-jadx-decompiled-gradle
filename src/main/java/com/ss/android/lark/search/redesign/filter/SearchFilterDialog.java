package com.ss.android.lark.search.redesign.filter;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$J\b\u0010%\u001a\u00020\u001eH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001e\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00158\u0000@\u0000X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006'"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/SearchFilterDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mCloseFL", "Landroid/widget/FrameLayout;", "getMCloseFL$core_search_release", "()Landroid/widget/FrameLayout;", "setMCloseFL$core_search_release", "(Landroid/widget/FrameLayout;)V", "mContentFL", "getMContentFL$core_search_release", "setMContentFL$core_search_release", "mDivideView", "Landroid/view/View;", "getMDivideView$core_search_release", "()Landroid/view/View;", "setMDivideView$core_search_release", "(Landroid/view/View;)V", "mDoneTV", "Landroid/widget/TextView;", "getMDoneTV$core_search_release", "()Landroid/widget/TextView;", "setMDoneTV$core_search_release", "(Landroid/widget/TextView;)V", "mTitleTV", "getMTitleTV$core_search_release", "setMTitleTV$core_search_release", "init", "", "view", "initListener", "setFilterView", "setTitleText", "text", "", "setWindowConfig", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
public class SearchFilterDialog extends Dialog {

    /* renamed from: a */
    public static final Companion f132696a = new Companion(null);
    @BindView(7587)
    public FrameLayout mCloseFL;
    @BindView(7588)
    public FrameLayout mContentFL;
    @BindView(6876)
    public View mDivideView;
    @BindView(7589)
    public TextView mDoneTV;
    @BindView(7590)
    public TextView mTitleTV;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/redesign/filter/SearchFilterDialog$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.filter.SearchFilterDialog$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final FrameLayout mo183335a() {
        FrameLayout frameLayout = this.mContentFL;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentFL");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public final TextView mo183338b() {
        TextView textView = this.mDoneTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDoneTV");
        }
        return textView;
    }

    /* renamed from: d */
    private final void m208119d() {
        FrameLayout frameLayout = this.mCloseFL;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCloseFL");
        }
        frameLayout.setOnClickListener(new View$OnClickListenerC53753b(this));
    }

    /* renamed from: c */
    private final void m208118c() {
        Window window = getWindow();
        if (window == null) {
            Log.m165383e("LarkSearch.Search.SearchFilterDialog", "window is null");
            return;
        }
        window.setGravity(80);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = DeviceUtils.getScreenWidth(getContext());
        attributes.height = DeviceUtils.getScreenHeight(getContext()) / 2;
        attributes.softInputMode = 16;
        window.setAttributes(attributes);
        window.setDimAmount(0.3f);
        window.setWindowAnimations(R.style.AnimBottomInBottomOut);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: b */
    private final void m208117b(View view) {
        ButterKnife.bind(this, view);
        m208119d();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.redesign.filter.SearchFilterDialog$b */
    public static final class View$OnClickListenerC53753b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SearchFilterDialog f132697a;

        View$OnClickListenerC53753b(SearchFilterDialog searchFilterDialog) {
            this.f132697a = searchFilterDialog;
        }

        public final void onClick(View view) {
            KeyboardUtils.hideKeyboard(this.f132697a.getContext(), this.f132697a.mo183335a());
            this.f132697a.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo183336a(View view) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        FrameLayout frameLayout = this.mContentFL;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContentFL");
        }
        frameLayout.addView(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFilterDialog(Context context) {
        super(context, R.style.CommonDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_search_chat_filter, (ViewGroup) null);
        setContentView(inflate);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "this");
        m208117b(inflate);
        m208118c();
    }

    /* renamed from: a */
    public final void mo183337a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "text");
        TextView textView = this.mTitleTV;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTitleTV");
        }
        textView.setText(str);
    }
}
