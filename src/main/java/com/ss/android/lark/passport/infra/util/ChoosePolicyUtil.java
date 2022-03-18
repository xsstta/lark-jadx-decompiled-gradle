package com.ss.android.lark.passport.infra.util;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.infra.widget.p2444b.C49247a;
import com.ss.android.lark.passport.infra.widget.p2444b.C49249b;
import com.ss.android.lark.passport.signinsdk_api.AbstractC49334a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ2\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010JF\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\u0016\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\u001c\u0010\u001a\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/ChoosePolicyUtil;", "", "()V", "MATCH_PRIVACY", "", "MATCH_SERVICE", "TAG", "generateDialogContentPolicy", "", "context", "Landroid/content/Context;", "msgId", "", "privacyMsgId", "serviceTermsId", "permissionInterceptor", "Lcom/ss/android/lark/passport/signinsdk_api/IChoosePolicyApi$UrlInterceptor;", "privacyUrl", "serviceTermsUrl", "openUrl", "", "url", "resetKeyboardAnimator", "views", "", "Landroid/view/View;", "runKeyboardAnimator", "height", "", "Companion", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.util.g */
public final class ChoosePolicyUtil {

    /* renamed from: b */
    public static final Companion f123476b = new Companion(null);

    /* renamed from: a */
    public final String f123477a = "ChoosePolicyUtil";

    /* renamed from: c */
    private final String f123478c = "{{serviceTerm}}";

    /* renamed from: d */
    private final String f123479d = "{{privacy}}";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/passport/infra/util/ChoosePolicyUtil$Companion;", "", "()V", "generateClickTextWithPrefix", "", "textView", "Landroid/widget/TextView;", "prefix", "", "clickText", "listener", "Landroid/view/View$OnClickListener;", "passport-infra_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.g$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.passport.infra.util.g$a$a */
        static final class C49190a implements C49247a.AbstractView$OnClickListenerC49248a {

            /* renamed from: a */
            final /* synthetic */ View.OnClickListener f123480a;

            C49190a(View.OnClickListener onClickListener) {
                this.f123480a = onClickListener;
            }

            public final void onClick(View view) {
                View.OnClickListener onClickListener = this.f123480a;
                if (onClickListener != null) {
                    onClickListener.onClick(null);
                }
            }
        }

        /* renamed from: a */
        public final void mo171690a(TextView textView, String str, String str2, View.OnClickListener onClickListener) {
            Intrinsics.checkParameterIsNotNull(textView, "textView");
            Context context = textView.getContext();
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            SpannableString spannableString = new SpannableString(str + str2);
            spannableString.setSpan(new C49247a(context, new C49190a(onClickListener)), str.length(), str.length() + str2.length(), 33);
            textView.setText(spannableString);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.g$b */
    static final class C49191b implements C49249b.AbstractView$OnClickListenerC49250a {

        /* renamed from: a */
        final /* synthetic */ ChoosePolicyUtil f123481a;

        /* renamed from: b */
        final /* synthetic */ String f123482b;

        /* renamed from: c */
        final /* synthetic */ Context f123483c;

        /* renamed from: d */
        final /* synthetic */ AbstractC49334a.AbstractC49335a f123484d;

        C49191b(ChoosePolicyUtil gVar, String str, Context context, AbstractC49334a.AbstractC49335a aVar) {
            this.f123481a = gVar;
            this.f123482b = str;
            this.f123483c = context;
            this.f123484d = aVar;
        }

        @Override // com.ss.android.lark.passport.infra.widget.p2444b.C49249b.AbstractView$OnClickListenerC49250a
        /* renamed from: a */
        public /* synthetic */ boolean mo171692a(TextPaint textPaint) {
            return C49249b.AbstractView$OnClickListenerC49250a.CC.$default$a(this, textPaint);
        }

        public final void onClick(View view) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            String str = this.f123481a.f123477a;
            a.mo171465b(str, "click getFirstUrl " + this.f123482b);
            this.f123481a.mo171689a(this.f123483c, this.f123482b, this.f123484d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.passport.infra.util.g$c */
    static final class C49192c implements C49249b.AbstractView$OnClickListenerC49250a {

        /* renamed from: a */
        final /* synthetic */ ChoosePolicyUtil f123485a;

        /* renamed from: b */
        final /* synthetic */ String f123486b;

        /* renamed from: c */
        final /* synthetic */ Context f123487c;

        /* renamed from: d */
        final /* synthetic */ AbstractC49334a.AbstractC49335a f123488d;

        C49192c(ChoosePolicyUtil gVar, String str, Context context, AbstractC49334a.AbstractC49335a aVar) {
            this.f123485a = gVar;
            this.f123486b = str;
            this.f123487c = context;
            this.f123488d = aVar;
        }

        @Override // com.ss.android.lark.passport.infra.widget.p2444b.C49249b.AbstractView$OnClickListenerC49250a
        /* renamed from: a */
        public /* synthetic */ boolean mo171692a(TextPaint textPaint) {
            return C49249b.AbstractView$OnClickListenerC49250a.CC.$default$a(this, textPaint);
        }

        public final void onClick(View view) {
            PassportLog a = PassportLog.f123351c.mo171474a();
            String str = this.f123485a.f123477a;
            a.mo171465b(str, "click getSecondUrl " + this.f123486b);
            this.f123485a.mo171689a(this.f123487c, this.f123486b, this.f123488d);
        }
    }

    /* renamed from: a */
    public final void mo171689a(Context context, String str, AbstractC49334a.AbstractC49335a aVar) {
        if (aVar == null || !aVar.intercept(str)) {
            C49157ai.m193846a(context, str);
            return;
        }
        PassportLog a = PassportLog.f123351c.mo171474a();
        String str2 = this.f123477a;
        a.mo171465b(str2, "user intercept to open " + str);
    }

    /* renamed from: a */
    public final CharSequence mo171688a(Context context, int i, int i2, int i3, String str, String str2, AbstractC49334a.AbstractC49335a aVar) {
        int i4;
        int i5;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i6;
        String str8;
        if (context == null) {
            return "";
        }
        String string = context.getResources().getString(i);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getString(msgId)");
        String string2 = context.getResources().getString(i2);
        Intrinsics.checkExpressionValueIsNotNull(string2, "context.resources.getString(privacyMsgId)");
        String string3 = context.getResources().getString(i3);
        Intrinsics.checkExpressionValueIsNotNull(string3, "context.resources.getString(serviceTermsId)");
        String str9 = string;
        if (TextUtils.isEmpty(str9)) {
            return "";
        }
        int i7 = -1;
        if (TextUtils.isEmpty(string2)) {
            i4 = -1;
        } else {
            i4 = StringsKt.indexOf$default((CharSequence) str9, this.f123479d, 0, false, 6, (Object) null);
        }
        if (TextUtils.isEmpty(string3)) {
            i5 = -1;
        } else {
            i5 = StringsKt.indexOf$default((CharSequence) str9, this.f123478c, 0, false, 6, (Object) null);
        }
        if (i4 == -1 && i5 == -1) {
            return str9;
        }
        if (i4 < i5) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str3 = this.f123479d;
        } else {
            str3 = this.f123478c;
        }
        if (!z) {
            str4 = this.f123479d;
        } else {
            str4 = this.f123478c;
        }
        if (z) {
            str5 = string2;
        } else {
            str5 = string3;
        }
        if (z) {
            string2 = string3;
        }
        if (z) {
            str6 = str;
        } else {
            str6 = str2;
        }
        if (!z) {
            str7 = str;
        } else {
            str7 = str2;
        }
        if (TextUtils.isEmpty(str5)) {
            i6 = -1;
        } else {
            i6 = StringsKt.indexOf$default((CharSequence) str9, str3, 0, false, 6, (Object) null);
        }
        if (i6 >= 0) {
            str8 = str6;
            string = StringsKt.replace$default(string, str3, str5, false, 4, (Object) null);
        } else {
            str8 = str6;
        }
        if (!TextUtils.isEmpty(string2)) {
            i7 = StringsKt.indexOf$default((CharSequence) string, str4, 0, false, 6, (Object) null);
        }
        if (i7 >= 0) {
            string = StringsKt.replace$default(string, str4, string2, false, 4, (Object) null);
        }
        SpannableString spannableString = new SpannableString(string);
        if (i6 >= 0) {
            spannableString.setSpan(new C49249b(context, new C49191b(this, str8, context, aVar)), i6, str5.length() + i6, 33);
        }
        if (i7 >= 0) {
            spannableString.setSpan(new C49249b(context, new C49192c(this, str7, context, aVar)), i7, string2.length() + i7, 33);
        }
        return spannableString;
    }
}
