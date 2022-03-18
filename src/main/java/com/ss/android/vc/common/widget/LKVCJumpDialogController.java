package com.ss.android.vc.common.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.larksuite.component.universe_design.dialog.UDBaseDialogBuilder;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.component.universe_design.dialog.UDDialogController;
import com.larksuite.suite.R;
import com.ss.android.vc.common.widget.C60841b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J.\u0010\r\u001a\u00020\u000e\"\u000e\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u0002H\u000f0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u000eH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/common/widget/LKVCJumpDialogController;", "Lcom/larksuite/component/universe_design/dialog/UDDialogController;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mJumpListener", "Lcom/ss/android/vc/common/widget/LKVCJumpDialogController$OnJumpListener;", "mJumpMsg", "", "mMessageTV", "Landroid/widget/TextView;", "mStartINdex", "", "apply", "", "T", "Lcom/larksuite/component/universe_design/dialog/UDBaseDialogBuilder;", "builder", "dialog", "Lcom/larksuite/component/universe_design/dialog/UDDialog;", "onCreateContent", "Landroid/view/View;", "updateMessage", "OnJumpListener", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.common.widget.c */
public class LKVCJumpDialogController extends UDDialogController {

    /* renamed from: a */
    public TextView f152324a;

    /* renamed from: b */
    private String f152325b = "";

    /* renamed from: c */
    private OnJumpListener f152326c;

    /* renamed from: d */
    private int f152327d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/ss/android/vc/common/widget/LKVCJumpDialogController$OnJumpListener;", "", "onJump", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.c$a */
    public interface OnJumpListener {
        void onJump();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/vc/common/widget/LKVCJumpDialogController$onCreateContent$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.common.widget.c$b */
    public static final class ViewTreeObserver$OnPreDrawListenerC60850b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ LKVCJumpDialogController f152328a;

        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver;
            TextView textView = this.f152328a.f152324a;
            if (textView != null && textView.getLineCount() > 2) {
                textView.setGravity(8388611);
            }
            TextView textView2 = this.f152328a.f152324a;
            if (textView2 == null || (viewTreeObserver = textView2.getViewTreeObserver()) == null) {
                return true;
            }
            viewTreeObserver.removeOnPreDrawListener(this);
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnPreDrawListenerC60850b(LKVCJumpDialogController cVar) {
            this.f152328a = cVar;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public View onCreateContent() {
        TextView textView;
        ViewTreeObserver viewTreeObserver;
        View onCreateContent = super.onCreateContent();
        if (onCreateContent != null) {
            textView = (TextView) onCreateContent.findViewById(R.id.ud_dialog_content_message_tv);
        } else {
            textView = null;
        }
        this.f152324a = textView;
        m236541a();
        TextView textView2 = this.f152324a;
        if (!(textView2 == null || (viewTreeObserver = textView2.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC60850b(this));
        }
        return onCreateContent;
    }

    /* renamed from: a */
    private final void m236541a() {
        String str = this.f152325b;
        int i = this.f152327d;
        if (str != null) {
            String substring = str.substring(0, i);
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            String str2 = this.f152325b;
            int i2 = this.f152327d;
            if (str2 != null) {
                String substring2 = str2.substring(i2);
                Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.String).substring(startIndex)");
                Matcher matcher = Pattern.compile("@@.*?@@").matcher(substring2);
                String str3 = substring2;
                int i3 = 0;
                int i4 = 0;
                while (matcher.find()) {
                    String group = matcher.group();
                    int start = matcher.start() + 2;
                    int end = matcher.end() - 2;
                    if (substring2 != null) {
                        String substring3 = substring2.substring(start, end);
                        Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        Intrinsics.checkExpressionValueIsNotNull(group, "placeholder");
                        str3 = StringsKt.replace$default(substring2, group, substring3, false, 4, (Object) null);
                        i3 = matcher.start();
                        i4 = substring3.length() + i3;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                String str4 = substring + str3;
                int length = i3 + substring.length();
                int length2 = i4 + substring.length();
                if (length2 > 0) {
                    SpannableString spannableString = new SpannableString(str4);
                    spannableString.setSpan(new MyClickableSpan(this.f152326c), length, length2, 33);
                    TextView textView = this.f152324a;
                    if (textView != null) {
                        textView.setText(spannableString);
                    }
                    TextView textView2 = this.f152324a;
                    if (textView2 != null) {
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    TextView textView3 = this.f152324a;
                    if (textView3 != null) {
                        textView3.setHighlightColor(0);
                        return;
                    }
                    return;
                }
                TextView textView4 = this.f152324a;
                if (textView4 != null) {
                    textView4.setText(this.f152325b);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LKVCJumpDialogController(Context context) {
        super(context);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    @Override // com.larksuite.component.universe_design.dialog.UDDialogController
    public <T extends UDBaseDialogBuilder<? extends T>> void apply(UDBaseDialogBuilder<? extends T> uDBaseDialogBuilder, UDDialog uDDialog) {
        Intrinsics.checkParameterIsNotNull(uDBaseDialogBuilder, "builder");
        Intrinsics.checkParameterIsNotNull(uDDialog, "dialog");
        if (uDBaseDialogBuilder instanceof C60841b.C60842a) {
            super.apply(uDBaseDialogBuilder, uDDialog);
            C60841b.C60842a aVar = (C60841b.C60842a) uDBaseDialogBuilder;
            this.f152324a = aVar.f152270a;
            String str = aVar.f152271b;
            Intrinsics.checkExpressionValueIsNotNull(str, "builder.mJumpMsg");
            this.f152325b = str;
            this.f152326c = aVar.f152272c;
            this.f152327d = aVar.f152273d;
            return;
        }
        throw new IllegalArgumentException(("builder should be UDVCJumpDialogBuilder, but actually " + uDBaseDialogBuilder.getClass().getSimpleName()).toString());
    }
}
