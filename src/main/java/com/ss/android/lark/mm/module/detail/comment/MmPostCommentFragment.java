package com.ss.android.lark.mm.module.detail.comment;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.DialogInterface$OnCancelListenerC1021b;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.SoftKeyboardUtil;
import com.ss.android.lark.mm.utils.ViewTreeObserver$OnGlobalLayoutListenerC47104h;
import com.ss.android.lark.mm.utils.ktextensions.C47110e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0003)*+B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001c\u001a\u00020\u0013H\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020\u00132\u0006\u0010'\u001a\u00020 H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006,"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment;", "Landroidx/fragment/app/DialogFragment;", "Lcom/ss/android/lark/mm/utils/MmKeyboardUtils$SoftKeyboardToggleListener;", "()V", "callback", "Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostCommentCallback;", "getCallback", "()Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostCommentCallback;", "setCallback", "(Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostCommentCallback;)V", "depend", "Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostDepend;", "getDepend", "()Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostDepend;", "setDepend", "(Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostDepend;)V", "getCommentContent", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onStart", "onToggleSoftKeyboard", "height", "", "onViewCreated", "view", "setLoadingStatus", "isLoading", "", "showOutOfTextView", "outOfCount", "watchKeyboardVisibility", "Companion", "IMmPostCommentCallback", "IMmPostDepend", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.k */
public final class MmPostCommentFragment extends DialogInterface$OnCancelListenerC1021b implements ViewTreeObserver$OnGlobalLayoutListenerC47104h.AbstractC47105a {

    /* renamed from: c */
    public static boolean f116085c;

    /* renamed from: d */
    public static final Companion f116086d = new Companion(null);

    /* renamed from: e */
    private IMmPostCommentCallback f116087e;

    /* renamed from: f */
    private IMmPostDepend f116088f;

    /* renamed from: g */
    private HashMap f116089g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostCommentCallback;", "", "onDismiss", "", "onPostCommentCallback", "commentContent", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.k$b */
    public interface IMmPostCommentCallback {
        /* renamed from: a */
        void mo161709a();

        /* renamed from: a */
        void mo161710a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$IMmPostDepend;", "", "getInitContent", "", "getQuote", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.k$c */
    public interface IMmPostDepend {
        /* renamed from: a */
        String mo161712a();

        /* renamed from: b */
        String mo161713b();
    }

    /* renamed from: c */
    public View mo161815c(int i) {
        if (this.f116089g == null) {
            this.f116089g = new HashMap();
        }
        View view = (View) this.f116089g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f116089g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: h */
    public void mo161819h() {
        HashMap hashMap = this.f116089g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$Companion;", "", "()V", "MAX_LIMIT_COUNT", "", "TAG", "", "isShowing", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.k$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f */
    public final IMmPostCommentCallback mo161817f() {
        return this.f116087e;
    }

    /* renamed from: i */
    private final void m182475i() {
        ViewTreeObserver$OnGlobalLayoutListenerC47104h.m186555a(getActivity(), this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.k$f */
    static final class RunnableC46067f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MmPostCommentFragment f116091a;

        RunnableC46067f(MmPostCommentFragment kVar) {
            this.f116091a = kVar;
        }

        public final void run() {
            SoftKeyboardUtil.f118667a.mo165514b((EditText) this.f116091a.mo161815c(R.id.postCommentEd));
            MmPostCommentFragment.f116085c = true;
        }
    }

    /* renamed from: g */
    public final String mo161818g() {
        EditText editText = (EditText) mo161815c(R.id.postCommentEd);
        Intrinsics.checkExpressionValueIsNotNull(editText, "postCommentEd");
        return editText.getText().toString();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        f116085c = false;
        IMmPostCommentCallback bVar = this.f116087e;
        if (bVar != null) {
            bVar.mo161709a();
        }
        ViewTreeObserver$OnGlobalLayoutListenerC47104h.m186556a(this);
        super.onDestroyView();
        mo161819h();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Window window2;
        super.onStart();
        Dialog v_ = v_();
        if (!(v_ == null || (window2 = v_.getWindow()) == null)) {
            window2.setLayout(-1, -2);
        }
        Dialog v_2 = v_();
        if (v_2 != null && (window = v_2.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
    }

    /* renamed from: a */
    public final void mo161812a(IMmPostCommentCallback bVar) {
        this.f116087e = bVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmPostCommentFragment$onViewCreated$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.k$d */
    public static final class C46065d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ MmPostCommentFragment f116090a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46065d(MmPostCommentFragment kVar) {
            this.f116090a = kVar;
        }

        public void afterTextChanged(Editable editable) {
            EditText editText = (EditText) this.f116090a.mo161815c(R.id.postCommentEd);
            Intrinsics.checkExpressionValueIsNotNull(editText, "postCommentEd");
            int length = editText.getText().length();
            if (length == 0) {
                TextView textView = (TextView) this.f116090a.mo161815c(R.id.sendView);
                Intrinsics.checkExpressionValueIsNotNull(textView, "sendView");
                textView.setEnabled(false);
                TextView textView2 = (TextView) this.f116090a.mo161815c(R.id.sendView);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "sendView");
                textView2.setVisibility(0);
                TextView textView3 = (TextView) this.f116090a.mo161815c(R.id.outOfCountTv);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "outOfCountTv");
                textView3.setVisibility(8);
            } else if (1 <= length && 1000 >= length) {
                TextView textView4 = (TextView) this.f116090a.mo161815c(R.id.sendView);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "sendView");
                textView4.setEnabled(true);
                TextView textView5 = (TextView) this.f116090a.mo161815c(R.id.sendView);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "sendView");
                textView5.setVisibility(0);
                TextView textView6 = (TextView) this.f116090a.mo161815c(R.id.outOfCountTv);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "outOfCountTv");
                textView6.setVisibility(8);
            } else {
                TextView textView7 = (TextView) this.f116090a.mo161815c(R.id.sendView);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "sendView");
                textView7.setVisibility(8);
                TextView textView8 = (TextView) this.f116090a.mo161815c(R.id.outOfCountTv);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "outOfCountTv");
                textView8.setVisibility(0);
                this.f116090a.mo161811a(length - 1000);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.k$e */
    static final class C46066e extends Lambda implements Function1<View, Unit> {
        final /* synthetic */ MmPostCommentFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46066e(MmPostCommentFragment kVar) {
            super(1);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke(view);
            return Unit.INSTANCE;
        }

        public final void invoke(View view) {
            Intrinsics.checkParameterIsNotNull(view, "it");
            C45855f.m181664c("MmPostCommentFragment", "send comments");
            IMmPostCommentCallback f = this.this$0.mo161817f();
            if (f != null) {
                EditText editText = (EditText) this.this$0.mo161815c(R.id.postCommentEd);
                Intrinsics.checkExpressionValueIsNotNull(editText, "postCommentEd");
                f.mo161710a(editText.getText().toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo161813a(IMmPostDepend cVar) {
        this.f116088f = cVar;
    }

    @Override // com.ss.android.lark.mm.utils.ViewTreeObserver$OnGlobalLayoutListenerC47104h.AbstractC47105a
    /* renamed from: b */
    public void mo161814b(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && f116085c) {
            mo5513b();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC1021b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo5510a(0, R.style.MmBottomDialog);
    }

    /* renamed from: a */
    public final void mo161811a(int i) {
        if (i < 1000) {
            TextView textView = (TextView) mo161815c(R.id.outOfCountTv);
            Intrinsics.checkExpressionValueIsNotNull(textView, "outOfCountTv");
            StringBuilder sb = new StringBuilder();
            sb.append('-');
            sb.append(i);
            textView.setText(sb.toString());
            return;
        }
        TextView textView2 = (TextView) mo161815c(R.id.outOfCountTv);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "outOfCountTv");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('-');
        sb2.append(i / 1000);
        sb2.append('K');
        textView2.setText(sb2.toString());
    }

    /* renamed from: c */
    public final void mo161816c(boolean z) {
        int i;
        if (((TextView) mo161815c(R.id.sendView)) != null && ((ProgressBar) mo161815c(R.id.progressbar)) != null) {
            TextView textView = (TextView) mo161815c(R.id.sendView);
            Intrinsics.checkExpressionValueIsNotNull(textView, "sendView");
            int i2 = 8;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            textView.setVisibility(i);
            ProgressBar progressBar = (ProgressBar) mo161815c(R.id.progressbar);
            Intrinsics.checkExpressionValueIsNotNull(progressBar, "progressbar");
            if (z) {
                i2 = 0;
            }
            progressBar.setVisibility(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) mo161815c(R.id.quoteText);
        Intrinsics.checkExpressionValueIsNotNull(textView, "quoteText");
        IMmPostDepend cVar = this.f116088f;
        String str2 = null;
        if (cVar != null) {
            str = cVar.mo161712a();
        } else {
            str = null;
        }
        textView.setText(str);
        ((EditText) mo161815c(R.id.postCommentEd)).requestFocus();
        ((EditText) mo161815c(R.id.postCommentEd)).addTextChangedListener(new C46065d(this));
        IMmPostDepend cVar2 = this.f116088f;
        if (cVar2 != null) {
            str2 = cVar2.mo161713b();
        }
        String str3 = str2;
        if (str3 == null || StringsKt.isBlank(str3)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((EditText) mo161815c(R.id.postCommentEd)).setText(str3);
            ((EditText) mo161815c(R.id.postCommentEd)).setSelection(str2.length());
        }
        TextView textView2 = (TextView) mo161815c(R.id.sendView);
        Intrinsics.checkExpressionValueIsNotNull(textView2, "sendView");
        C47110e.m186573a(textView2, new C46066e(this));
        new Handler().postDelayed(new RunnableC46067f(this), 100);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Window window2;
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        Dialog v_ = v_();
        if (v_ != null) {
            v_.requestWindowFeature(1);
        }
        Dialog v_2 = v_();
        WindowManager.LayoutParams layoutParams = null;
        if (v_2 != null) {
            window = v_2.getWindow();
        } else {
            window = null;
        }
        if (window != null) {
            layoutParams = window.getAttributes();
        }
        if (layoutParams != null) {
            layoutParams.gravity = 80;
        }
        if (layoutParams != null) {
            layoutParams.width = -1;
        }
        if (window != null) {
            window.setAttributes(layoutParams);
        }
        Dialog v_3 = v_();
        if (!(v_3 == null || (window2 = v_3.getWindow()) == null)) {
            window2.setSoftInputMode(16);
        }
        View inflate = layoutInflater.inflate(R.layout.mm_post_comment_dialog, viewGroup, false);
        m182475i();
        return inflate;
    }
}
