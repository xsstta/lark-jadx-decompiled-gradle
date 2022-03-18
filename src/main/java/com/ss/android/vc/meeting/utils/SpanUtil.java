package com.ss.android.vc.meeting.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.linked_emojicon.widget.CustomTypefaceSpan;
import com.ss.android.vc.common.p3083e.C60752f;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.C60858f;
import com.ss.android.vc.common.widget.C60859g;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.meeting.module.meetingdialog.p3136a.C62188a;
import com.ss.android.vc.statistics.event.MeetingChargingEvent;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001032\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\u0004H\u0002J\u0006\u00107\u001a\u00020\u0004J\b\u00108\u001a\u00020\u0004H\u0002J\u0016\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020:J\u0006\u0010>\u001a\u00020/R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001b\u0010\u000f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0006R\u001b\u0010\u0013\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0006R\u001b\u0010\u0016\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0017\u0010\u0006R\u001b\u0010\u0019\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001a\u0010\u0006R\u001b\u0010\u001c\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0006R\u001b\u0010\u001f\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b!\u0010\u0012\u001a\u0004\b \u0010\u0006R\u001b\u0010\"\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b#\u0010\u0006R#\u0010%\u001a\n '*\u0004\u0018\u00010&0&8FX\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b(\u0010)R\u001b\u0010+\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b-\u0010\u0012\u001a\u0004\b,\u0010\u0006¨\u0006?"}, d2 = {"Lcom/ss/android/vc/meeting/utils/SpanUtil;", "", "()V", "coHostSpan", "Landroid/text/SpannableString;", "getCoHostSpan", "()Landroid/text/SpannableString;", "setCoHostSpan", "(Landroid/text/SpannableString;)V", "externalSpan", "getExternalSpan", "setExternalSpan", "hostSpan", "getHostSpan", "setHostSpan", "margin4Span", "getMargin4Span", "margin4Span$delegate", "Lkotlin/Lazy;", "margin6Span", "getMargin6Span", "margin6Span$delegate", "margin8Span", "getMargin8Span", "margin8Span$delegate", "micMutedSpan", "getMicMutedSpan", "micMutedSpan$delegate", "micUnavaiSpan", "getMicUnavaiSpan", "micUnavaiSpan$delegate", "mobileSpan", "getMobileSpan", "mobileSpan$delegate", "screenShareSpan", "getScreenShareSpan", "screenShareSpan$delegate", "typeface", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "getTypeface", "()Landroid/graphics/Typeface;", "typeface$delegate", "weakNetSpan", "getWeakNetSpan", "weakNetSpan$delegate", "adapterTipInfoIcon", "", "contentTv", "Landroid/widget/TextView;", "activity", "Landroid/app/Activity;", ShareHitPoint.f121869d, "Lcom/ss/android/vc/statistics/event/MeetingChargingEvent$Type;", "createCoHostSpan", "createExternalSpan", "createHostSpan", "getColorWithAlpha", "", "alpha", "", "baseColor", "onLanguageChanged", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.utils.n */
public final class SpanUtil {

    /* renamed from: a */
    public static final SpanUtil f160471a;

    /* renamed from: b */
    private static final Lazy f160472b = LazyKt.lazy(C63521i.INSTANCE);

    /* renamed from: c */
    private static SpannableString f160473c;

    /* renamed from: d */
    private static SpannableString f160474d;

    /* renamed from: e */
    private static SpannableString f160475e;

    /* renamed from: f */
    private static final Lazy f160476f = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63520h.INSTANCE);

    /* renamed from: g */
    private static final Lazy f160477g = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63517e.INSTANCE);

    /* renamed from: h */
    private static final Lazy f160478h = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63518f.INSTANCE);

    /* renamed from: i */
    private static final Lazy f160479i = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63522j.INSTANCE);

    /* renamed from: j */
    private static final Lazy f160480j = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63519g.INSTANCE);

    /* renamed from: k */
    private static final Lazy f160481k = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63514b.INSTANCE);

    /* renamed from: l */
    private static final Lazy f160482l = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63515c.INSTANCE);

    /* renamed from: m */
    private static final Lazy f160483m = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) C63516d.INSTANCE);

    /* renamed from: a */
    public final Typeface mo219671a() {
        return (Typeface) f160472b.getValue();
    }

    /* renamed from: d */
    public final SpannableString mo219675d() {
        return (SpannableString) f160482l.getValue();
    }

    /* renamed from: e */
    public final SpannableString mo219676e() {
        return (SpannableString) f160483m.getValue();
    }

    private SpanUtil() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$b */
    static final class C63514b extends Lambda implements Function0<SpannableString> {
        public static final C63514b INSTANCE = new C63514b();

        C63514b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new C60858f(UIHelper.dp2px(4.0f)), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$c */
    static final class C63515c extends Lambda implements Function0<SpannableString> {
        public static final C63515c INSTANCE = new C63515c();

        C63515c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new C60858f(UIHelper.dp2px(8.0f)), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$d */
    static final class C63516d extends Lambda implements Function0<SpannableString> {
        public static final C63516d INSTANCE = new C63516d();

        C63516d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(" ");
            spannableString.setSpan(new C60858f(UIHelper.dp2px(8.0f)), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/graphics/Typeface;", "kotlin.jvm.PlatformType", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$i */
    static final class C63521i extends Lambda implements Function0<Typeface> {
        public static final C63521i INSTANCE = new C63521i();

        C63521i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Typeface invoke() {
            Context a = ar.m236694a();
            Intrinsics.checkExpressionValueIsNotNull(a, "VcContextDeps.getAppContext()");
            Resources resources = a.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "VcContextDeps.getAppContext().resources");
            return Typeface.createFromAsset(resources.getAssets(), "iconfont.ttf");
        }
    }

    /* renamed from: c */
    public final void mo219674c() {
        f160473c = m248919f();
        f160474d = m248920g();
        f160475e = mo219673b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$g */
    static final class C63519g extends Lambda implements Function0<SpannableString> {
        public static final C63519g INSTANCE = new C63519g();

        C63519g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.iconfont_icon_mobile));
            spannableString.setSpan(new CustomTypefaceSpan("", SpanUtil.f160471a.mo219671a()), 0, spannableString.length(), 17);
            spannableString.setSpan(new ForegroundColorSpan(C60773o.m236126d(R.color.ud_N500)), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$j */
    static final class C63522j extends Lambda implements Function0<SpannableString> {
        public static final C63522j INSTANCE = new C63522j();

        C63522j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.iconfont_icon_signal));
            spannableString.setSpan(new CustomTypefaceSpan("", SpanUtil.f160471a.mo219671a()), 0, spannableString.length(), 17);
            spannableString.setSpan(new ForegroundColorSpan(C60773o.m236126d(R.color.ud_R500)), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$e */
    static final class C63517e extends Lambda implements Function0<SpannableString> {
        public static final C63517e INSTANCE = new C63517e();

        C63517e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.iconfont_icon_mic_off_solid));
            spannableString.setSpan(new CustomTypefaceSpan("", SpanUtil.f160471a.mo219671a()), 0, spannableString.length(), 17);
            spannableString.setSpan(new ForegroundColorSpan(C60773o.m236126d(R.color.ud_R500)), 0, spannableString.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$f */
    static final class C63518f extends Lambda implements Function0<SpannableString> {
        public static final C63518f INSTANCE = new C63518f();

        C63518f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.iconfont_icon_mic_off_solid));
            spannableString.setSpan(new CustomTypefaceSpan("", SpanUtil.f160471a.mo219671a()), 0, spannableString.length(), 17);
            spannableString.setSpan(new ForegroundColorSpan(C60773o.m236126d(R.color.ud_N400)), 0, spannableString.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/text/SpannableString;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$h */
    static final class C63520h extends Lambda implements Function0<SpannableString> {
        public static final C63520h INSTANCE = new C63520h();

        C63520h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SpannableString invoke() {
            SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.iconfont_icon_sharescreen_solid));
            spannableString.setSpan(new CustomTypefaceSpan("", SpanUtil.f160471a.mo219671a()), 0, spannableString.length(), 17);
            spannableString.setSpan(new ForegroundColorSpan(C60773o.m236126d(R.color.ud_G500)), 0, spannableString.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, spannableString.length(), 17);
            return spannableString;
        }
    }

    /* renamed from: f */
    private final SpannableString m248919f() {
        SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.View_M_Host));
        spannableString.setSpan(new C60859g(C60773o.m236126d(R.color.udtoken_tag_neutral_bg_inverse), UIHelper.dp2px(14.0f), C60773o.m236126d(R.color.udtoken_tag_neutral_text_inverse), UIHelper.dp2px(10.0f), UIHelper.dp2px(4.0f), UIHelper.dp2px(1.0f), UIHelper.dp2px(2.0f)), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* renamed from: g */
    private final SpannableString m248920g() {
        SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.View_M_CoHost));
        spannableString.setSpan(new C60859g(C60773o.m236126d(R.color.udtoken_tag_neutral_bg_inverse), UIHelper.dp2px(14.0f), C60773o.m236126d(R.color.udtoken_tag_neutral_text_inverse), UIHelper.dp2px(10.0f), UIHelper.dp2px(4.0f), UIHelper.dp2px(1.0f), UIHelper.dp2px(2.0f)), 0, spannableString.length(), 17);
        return spannableString;
    }

    /* renamed from: b */
    public final SpannableString mo219673b() {
        SpannableString spannableString = new SpannableString(UIHelper.getString(R.string.View_G_ExternalLabel));
        spannableString.setSpan(new C60859g(C60773o.m236126d(R.color.udtoken_tag_bg_blue), UIHelper.dp2px(18.0f), C60773o.m236126d(R.color.udtoken_tag_text_s_blue), UIHelper.dp2px(12.0f), UIHelper.dp2px(4.0f), UIHelper.dp2px(2.0f), UIHelper.dp2px(4.0f)), 0, spannableString.length(), 17);
        return spannableString;
    }

    static {
        SpanUtil nVar = new SpanUtil();
        f160471a = nVar;
        f160473c = nVar.m248919f();
        f160474d = nVar.m248920g();
        f160475e = nVar.mo219673b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/utils/SpanUtil$adapterTipInfoIcon$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.utils.n$a */
    public static final class C63513a extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ MeetingChargingEvent.Type f160484a;

        /* renamed from: b */
        final /* synthetic */ Activity f160485b;

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            MeetingChargingEvent.m249932a(this.f160484a, null);
            new C62188a(this.f160485b).mo211606a();
        }

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            textPaint.setColor(C60773o.m236126d(R.color.ud_N500));
            textPaint.setUnderlineText(false);
        }

        C63513a(MeetingChargingEvent.Type type, Activity activity) {
            this.f160484a = type;
            this.f160485b = activity;
        }
    }

    /* renamed from: a */
    public final void mo219672a(TextView textView, Activity activity, MeetingChargingEvent.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        if (C60752f.m236082b((Object) textView) && C60752f.m236082b(activity)) {
            String obj = textView.getText().toString();
            String string = activity.getResources().getString(R.string.iconfont_icon_info);
            Intrinsics.checkExpressionValueIsNotNull(string, "activity.getResources().…tring.iconfont_icon_info)");
            StringBuilder sb = new StringBuilder(obj);
            sb.append(" ");
            sb.append(string);
            SpannableString spannableString = new SpannableString(sb);
            spannableString.setSpan(new CustomTypefaceSpan("", mo219671a()), obj.length() + 1, obj.length() + 1 + string.length(), 17);
            spannableString.setSpan(new ForegroundColorSpan(C60773o.m236126d(R.color.ud_N500)), obj.length() + 1, obj.length() + 1 + string.length(), 17);
            spannableString.setSpan(new AbsoluteSizeSpan(16, true), obj.length() + 1, obj.length() + 1 + string.length(), 17);
            spannableString.setSpan(new C63513a(type, activity), obj.length() + 1, obj.length() + 1 + string.length(), 17);
            textView.setHighlightColor(C60773o.m236126d(R.color.lkui_transparent));
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableString);
        }
    }
}
