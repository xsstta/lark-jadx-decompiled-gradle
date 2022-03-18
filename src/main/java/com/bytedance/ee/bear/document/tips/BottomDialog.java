package com.bytedance.ee.bear.document.tips;

import android.app.Activity;
import android.app.Application;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.ee.bear.watermark.interfaces.IWatermarkManager;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.bytedance.ee.util.p701d.C13615c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC22179a;
import com.larksuite.component.universe_design.checkbox.UDCheckBox;
import com.larksuite.suite.R;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 )2\u00020\u0001:\u0002()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u000fJ\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u0016H\u0002J\u0018\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020'H\u0007R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/bytedance/ee/bear/document/tips/BottomDialog;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "backView", "Landroid/view/View;", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomTitle", "Landroid/widget/TextView;", "btnConfirm", "circleCheckBox", "Lcom/larksuite/component/universe_design/checkbox/UDCheckBox;", "mClickCallback", "Lcom/bytedance/ee/bear/document/tips/BottomDialog$ClickCallback;", "rootView", "sheetDialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "tvConfirmContent", "tvSendToLark", "dismiss", "", "isShowing", "", "setClickListenerCallback", "clickCallback", "setLinkClickable", "clickableHtmlBuilder", "Landroid/text/SpannableStringBuilder;", "urlSpan", "Landroid/text/style/URLSpan;", "setListener", "setSpanText", "html", "", "textView", "show", "bottomPopupData", "Lcom/bytedance/ee/bear/document/tips/BottomPopupData;", "ClickCallback", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.tips.a */
public final class BottomDialog {

    /* renamed from: e */
    public static final String f17197e = f17197e;

    /* renamed from: f */
    public static final String f17198f = f17198f;

    /* renamed from: g */
    public static final Companion f17199g = new Companion(null);

    /* renamed from: a */
    public UDCheckBox f17200a = ((UDCheckBox) this.f17208l.findViewById(R.id.widget_circle_check_box));

    /* renamed from: b */
    public DialogC22179a f17201b;

    /* renamed from: c */
    public BottomSheetBehavior<View> f17202c;

    /* renamed from: d */
    public ClickCallback f17203d;

    /* renamed from: h */
    private TextView f17204h;

    /* renamed from: i */
    private TextView f17205i = ((TextView) this.f17208l.findViewById(R.id.btn_confirm));

    /* renamed from: j */
    private TextView f17206j = ((TextView) this.f17208l.findViewById(R.id.tv_send_to_lark));

    /* renamed from: k */
    private TextView f17207k = ((TextView) this.f17208l.findViewById(R.id.tv_confirm_content));

    /* renamed from: l */
    private View f17208l;

    /* renamed from: m */
    private View f17209m = this.f17208l.findViewById(R.id.btn_close);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lcom/bytedance/ee/bear/document/tips/BottomDialog$ClickCallback;", "", "onCancel", "", "onClickClose", "onClickUser", "userId", "", "onConfirm", "sendToLark", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.tips.a$a */
    public interface ClickCallback {
        /* renamed from: a */
        void mo24927a();

        /* renamed from: a */
        void mo24928a(String str);

        /* renamed from: a */
        void mo24929a(boolean z);

        /* renamed from: b */
        void mo24930b();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/document/tips/BottomDialog$Companion;", "", "()V", "CHATTER_ID_PREFIX_URL", "", "getCHATTER_ID_PREFIX_URL", "()Ljava/lang/String;", "QUERY_USER_ID", "TAG", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.tips.a$b */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: a */
        public final String mo24939a() {
            return BottomDialog.f17197e;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo24932a() {
        DialogC22179a aVar = this.f17201b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: b */
    public final boolean mo24935b() {
        Boolean bool;
        DialogC22179a aVar = this.f17201b;
        if (aVar != null) {
            bool = Boolean.valueOf(aVar.isShowing());
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
    }

    /* renamed from: c */
    private final void m24941c() {
        View view = this.f17209m;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC6180d(this));
        }
        TextView textView = this.f17206j;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC6181e(this));
        }
        TextView textView2 = this.f17205i;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC6182f(this));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.tips.a$d */
    public static final class View$OnClickListenerC6180d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomDialog f17214a;

        View$OnClickListenerC6180d(BottomDialog aVar) {
            this.f17214a = aVar;
        }

        public final void onClick(View view) {
            this.f17214a.mo24932a();
            ClickCallback aVar = this.f17214a.f17203d;
            if (aVar != null) {
                aVar.mo24930b();
            }
        }
    }

    /* renamed from: a */
    public final void mo24934a(ClickCallback aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "clickCallback");
        this.f17203d = aVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.tips.a$e */
    public static final class View$OnClickListenerC6181e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomDialog f17215a;

        View$OnClickListenerC6181e(BottomDialog aVar) {
            this.f17215a = aVar;
        }

        public final void onClick(View view) {
            boolean z;
            UDCheckBox uDCheckBox = this.f17215a.f17200a;
            if (uDCheckBox != null) {
                UDCheckBox uDCheckBox2 = this.f17215a.f17200a;
                if (uDCheckBox2 != null) {
                    z = uDCheckBox2.isChecked();
                } else {
                    z = false;
                }
                uDCheckBox.setChecked(!z);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/document/tips/BottomDialog$setLinkClickable$clickableSpan$1", "Landroid/text/style/ClickableSpan;", "onClick", "", "widget", "Landroid/view/View;", "updateDrawState", "ds", "Landroid/text/TextPaint;", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.tips.a$c */
    public static final class C6179c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ BottomDialog f17212a;

        /* renamed from: b */
        final /* synthetic */ URLSpan f17213b;

        public void updateDrawState(TextPaint textPaint) {
            Intrinsics.checkParameterIsNotNull(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
            Application application = C13615c.f35773a;
            Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
            textPaint.setColor(application.getResources().getColor(R.color.primary_pri_500));
        }

        public void onClick(View view) {
            Intrinsics.checkParameterIsNotNull(view, "widget");
            try {
                String url = this.f17213b.getURL();
                Intrinsics.checkExpressionValueIsNotNull(url, "url");
                if (StringsKt.contains$default((CharSequence) url, (CharSequence) BottomDialog.f17199g.mo24939a(), false, 2, (Object) null)) {
                    String queryParameter = Uri.parse(url).getQueryParameter(BottomDialog.f17198f);
                    if (queryParameter instanceof String) {
                        ClickCallback aVar = this.f17212a.f17203d;
                        if (aVar != null) {
                            aVar.mo24928a(queryParameter);
                            return;
                        }
                        return;
                    }
                    C13479a.m54758a("BottomPopView", "onClickUser: " + queryParameter);
                }
            } catch (Exception unused) {
                C13479a.m54758a("BottomPopView", "onClick: urlSpan.url" + C13598b.m55197d(this.f17213b.getURL()));
            }
        }

        C6179c(BottomDialog aVar, URLSpan uRLSpan) {
            this.f17212a = aVar;
            this.f17213b = uRLSpan;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.tips.a$f */
    public static final class View$OnClickListenerC6182f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ BottomDialog f17216a;

        View$OnClickListenerC6182f(BottomDialog aVar) {
            this.f17216a = aVar;
        }

        public final void onClick(View view) {
            Boolean bool;
            UDCheckBox uDCheckBox = this.f17216a.f17200a;
            if (uDCheckBox != null) {
                bool = Boolean.valueOf(uDCheckBox.isChecked());
            } else {
                bool = null;
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ClickCallback aVar = this.f17216a.f17203d;
                if (aVar != null) {
                    aVar.mo24929a(booleanValue);
                }
                this.f17216a.mo24932a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Boolean");
        }
    }

    /* renamed from: a */
    public final void mo24933a(BottomPopupData bottomPopupData) {
        DialogC22179a aVar;
        Intrinsics.checkParameterIsNotNull(bottomPopupData, "bottomPopupData");
        TextView textView = this.f17204h;
        if (textView != null) {
            textView.setText(bottomPopupData.getTitle());
        }
        TextView textView2 = this.f17205i;
        if (textView2 != null) {
            textView2.setText(bottomPopupData.getConfirmBtnText());
        }
        TextView textView3 = this.f17206j;
        if (textView3 != null) {
            textView3.setText(bottomPopupData.getSendLarkText());
        }
        UDCheckBox uDCheckBox = this.f17200a;
        if (uDCheckBox != null) {
            uDCheckBox.setChecked(true);
        }
        String des = bottomPopupData.getDes();
        Intrinsics.checkExpressionValueIsNotNull(des, "bottomPopupData.des");
        TextView textView4 = this.f17207k;
        if (textView4 != null) {
            m24940a(des, textView4);
            if (!mo24935b() && (aVar = this.f17201b) != null) {
                aVar.show();
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    public BottomDialog(Activity activity) {
        View view;
        Window window;
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Activity activity2 = activity;
        View inflate = LayoutInflater.from(activity2).inflate(R.layout.bottom_pop_layout, (ViewGroup) null);
        Intrinsics.checkExpressionValueIsNotNull(inflate, "LayoutInflater.from(acti….bottom_pop_layout, null)");
        this.f17208l = inflate;
        this.f17204h = (TextView) inflate.findViewById(R.id.tv_bottom_title);
        DialogC22179a aVar = new DialogC22179a(activity2, R.style.BottomSheetDialog);
        this.f17201b = aVar;
        if (aVar != null) {
            aVar.setContentView(this.f17208l);
        }
        DialogC22179a aVar2 = this.f17201b;
        if (aVar2 != null) {
            aVar2.setOnDismissListener(new DialogInterface.OnDismissListener(this) {
                /* class com.bytedance.ee.bear.document.tips.BottomDialog.DialogInterface$OnDismissListenerC61771 */

                /* renamed from: a */
                final /* synthetic */ BottomDialog f17210a;

                {
                    this.f17210a = r1;
                }

                public final void onDismiss(DialogInterface dialogInterface) {
                    ClickCallback aVar;
                    if (this.f17210a.f17203d != null && (aVar = this.f17210a.f17203d) != null) {
                        aVar.mo24927a();
                    }
                }
            });
        }
        ViewParent parent = this.f17208l.getParent();
        if (parent != null) {
            View view2 = (View) parent;
            DialogC22179a aVar3 = this.f17201b;
            if (aVar3 == null || (window = aVar3.getWindow()) == null) {
                view = null;
            } else {
                view = window.findViewById(R.id.design_bottom_sheet);
            }
            if (view != null) {
                view.setBackgroundResource(R.color.color_transparent);
            }
            this.f17202c = BottomSheetBehavior.m79955b(view2);
            this.f17208l.measure(0, 0);
            BottomSheetBehavior<View> bottomSheetBehavior = this.f17202c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo76702a(this.f17208l.getMeasuredHeight());
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams != null) {
                CoordinatorLayout.LayoutParams layoutParams2 = (CoordinatorLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 49;
                view2.setLayoutParams(layoutParams2);
                IWatermarkManager aVar4 = (IWatermarkManager) KoinJavaComponent.m268613a(IWatermarkManager.class, null, null, 6, null);
                View view3 = this.f17208l;
                if (view3 != null) {
                    aVar4.mo40646a((FrameLayout) view3);
                    BottomSheetBehavior<View> bottomSheetBehavior2 = this.f17202c;
                    if (bottomSheetBehavior2 != null) {
                        bottomSheetBehavior2.mo76706a(new BottomSheetBehavior.AbstractC22177a(this) {
                            /* class com.bytedance.ee.bear.document.tips.BottomDialog.C61782 */

                            /* renamed from: a */
                            final /* synthetic */ BottomDialog f17211a;

                            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
                            /* renamed from: a */
                            public void mo24937a(View view, float f) {
                                Intrinsics.checkParameterIsNotNull(view, "view");
                            }

                            /* JADX WARN: Incorrect args count in method signature: ()V */
                            {
                                this.f17211a = r1;
                            }

                            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC22177a
                            /* renamed from: a */
                            public void mo24938a(View view, int i) {
                                Intrinsics.checkParameterIsNotNull(view, "view");
                                if (i == 5) {
                                    DialogC22179a aVar = this.f17211a.f17201b;
                                    if (aVar != null) {
                                        aVar.dismiss();
                                    }
                                    BottomSheetBehavior<View> bottomSheetBehavior = this.f17211a.f17202c;
                                    if (bottomSheetBehavior != null) {
                                        bottomSheetBehavior.mo76718d(4);
                                    }
                                }
                            }
                        });
                    }
                    m24941c();
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout");
            }
            throw new TypeCastException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
    }

    /* renamed from: a */
    private final void m24939a(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new C6179c(this, uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
    }

    /* renamed from: a */
    private final void m24940a(String str, TextView textView) {
        boolean z;
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, fromHtml.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            if (uRLSpanArr.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    Intrinsics.checkExpressionValueIsNotNull(uRLSpan, "it");
                    m24939a(spannableStringBuilder, uRLSpan);
                }
                textView.setAutoLinkMask(1);
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        textView.setText(str);
        C13479a.m54764b("BottomPopView", "setSpanText: have not parse link,not use span");
    }
}
