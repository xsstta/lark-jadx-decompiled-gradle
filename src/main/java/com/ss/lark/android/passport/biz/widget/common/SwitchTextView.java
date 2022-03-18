package com.ss.lark.android.passport.biz.widget.common;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.larksuite.suite.R;
import com.ss.android.lark.passport.infra.widget.p2444b.C49247a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007J,\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0011\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0013\u001a\u00020\u0007J6\u0010\u0014\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e¨\u0006 "}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/common/SwitchTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "setClickableText", "", "prefix", "", "clickable", "listener", "Landroid/view/View$OnClickListener;", "suffix", "prefixRes", "clickableRes", "suffixRes", "setRichText", "richText", "", "nextStep", "Lcom/alibaba/fastjson/JSONObject;", "uniContext", "Lcom/ss/android/lark/passport/signinsdk_api/base/log/UniContext;", "url", "Lcom/ss/android/lark/passport/infra/util/RichTextUtil$InterceptUrl;", "log", "Lcom/ss/android/lark/passport/infra/log/PassportLog;", "Companion", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class SwitchTextView extends AppCompatTextView {

    /* renamed from: a */
    public static final Companion f164417a = new Companion(null);

    public SwitchTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SwitchTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmStatic
    /* renamed from: a */
    public static final SwitchTextView m256216a(ViewGroup viewGroup) {
        return f164417a.mo224648a(viewGroup);
    }

    /* renamed from: a */
    public final void mo224646a(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        m256217a(this, charSequence, charSequence2, onClickListener, null, 8, null);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/lark/android/passport/biz/widget/common/SwitchTextView$Companion;", "", "()V", "loadAsBuildInStyle", "Lcom/ss/lark/android/passport/biz/widget/common/SwitchTextView;", "parent", "Landroid/view/ViewGroup;", "passport-biz_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.lark.android.passport.biz.widget.common.SwitchTextView$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final SwitchTextView mo224648a(ViewGroup viewGroup) {
            Intrinsics.checkParameterIsNotNull(viewGroup, "parent");
            View findViewById = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.signin_sdk_common_switch_text_view, viewGroup, false).findViewById(R.id.signin_sdk_widget_switch_text);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.s…n_sdk_widget_switch_text)");
            return (SwitchTextView) findViewById;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkParameterIsNotNull(context, "context");
    }

    /* renamed from: a */
    public final void mo224647a(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, CharSequence charSequence3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
        }
        if (charSequence2 != null) {
            spannableStringBuilder.append(charSequence2, new C49247a(getContext(), onClickListener, false), 33);
        }
        if (charSequence3 != null) {
            spannableStringBuilder.append(charSequence3);
        }
        setText(spannableStringBuilder);
        setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SwitchTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 2131886725 : i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m256217a(SwitchTextView switchTextView, CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener, CharSequence charSequence3, int i, Object obj) {
        if ((i & 8) != 0) {
            charSequence3 = null;
        }
        switchTextView.mo224647a(charSequence, charSequence2, onClickListener, charSequence3);
    }
}
