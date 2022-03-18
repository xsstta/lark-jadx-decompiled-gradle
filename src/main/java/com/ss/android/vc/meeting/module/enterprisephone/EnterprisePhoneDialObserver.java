package com.ss.android.vc.meeting.module.enterprisephone;

import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.entity.response.C60974h;
import com.ss.android.vc.entity.response.CheckEnterprisePhoneQuotaEntity;
import com.ss.android.vc.entity.response.GetPhoneNumberAttributtonEntity;
import com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneEditText;
import com.ss.android.vc.net.push.VideoChatPush;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.statistics.event.C63767p;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\t*\u0001\t\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001?B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020&H\u0002J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0016J\u0012\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u0019H\u0002J\u0012\u0010-\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u0019H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020&H\u0002J\b\u00100\u001a\u00020)H\u0002J\b\u00101\u001a\u00020)H\u0002J\u001c\u00102\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010\u00192\b\u00103\u001a\u0004\u0018\u00010&H\u0002J+\u00104\u001a\u00020)2\b\u00105\u001a\u0004\u0018\u00010&2\b\u00106\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0002\u00109J\u001c\u0010:\u001a\u00020)2\b\u0010;\u001a\u0004\u0018\u00010&2\b\u0010<\u001a\u0004\u0018\u00010&H\u0002J\u0010\u0010=\u001a\u00020)2\u0006\u0010>\u001a\u00020\u001eH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneEditText$PhoneNumberListener;", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;)V", "callBtn", "Landroid/view/View;", "callback", "com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver$callback$1", "Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver$callback$1;", "deleteBtn", "dialNumberEightView", "dialNumberFiveView", "dialNumberFourView", "dialNumberNineView", "dialNumberOneView", "dialNumberSevenView", "dialNumberSixView", "dialNumberThreeView", "dialNumberTwoView", "dialNumberZeroView", "dialSymbolPoundView", "dialSymbolStarView", "enterprisePhoneQuota", "Landroid/widget/TextView;", "getFragment", "()Landroidx/fragment/app/Fragment;", "setFragment", "isRequestingEnterprisePhoneAttribution", "", "isRequestingEnterprisePhoneQuota", "ivBackView", "mPhoneNumberAttributionView", "mPhoneNumberView", "Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneEditText;", "mRootView", "addComma", "", "str", "checkEnterprisePhoneQuota", "", "checkPhoneNumberAttribution", "deleteAllTextAndRefreshPhoneNumberAttribution", "targetNumberView", "deleteTextAndRefreshPhoneNumberAttribution", "getPhoneNumberAttribution", "phoneNumber", "initClickListener", "initViews", "insertTextAndRefreshPhoneNumberAttribution", "text", "refreshEnterprisePhoneQuota", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "availableEnterprisePhoneAmount", "", "departmentName", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "refreshPhoneNumberAttribution", "province", "isp", "showStatusBar", "show", "Companion", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class EnterprisePhoneDialObserver implements DefaultLifecycleObserver, EnterprisePhoneEditText.AbstractC61640b {

    /* renamed from: e */
    public static final Companion f154582e = new Companion(null);

    /* renamed from: a */
    public EnterprisePhoneEditText f154583a;

    /* renamed from: b */
    public boolean f154584b;

    /* renamed from: c */
    public boolean f154585c;

    /* renamed from: d */
    public C61618b f154586d = new C61618b(this);

    /* renamed from: f */
    private View f154587f = this.f154605x.getView();

    /* renamed from: g */
    private View f154588g;

    /* renamed from: h */
    private View f154589h;

    /* renamed from: i */
    private View f154590i;

    /* renamed from: j */
    private View f154591j;

    /* renamed from: k */
    private View f154592k;

    /* renamed from: l */
    private View f154593l;

    /* renamed from: m */
    private View f154594m;

    /* renamed from: n */
    private View f154595n;

    /* renamed from: o */
    private View f154596o;

    /* renamed from: p */
    private View f154597p;

    /* renamed from: q */
    private View f154598q;

    /* renamed from: r */
    private View f154599r;

    /* renamed from: s */
    private View f154600s;

    /* renamed from: t */
    private View f154601t;

    /* renamed from: u */
    private View f154602u;

    /* renamed from: v */
    private TextView f154603v;

    /* renamed from: w */
    private TextView f154604w;

    /* renamed from: x */
    private Fragment f154605x;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onCreate(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onDestroy(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onPause(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onResume(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onStart(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        DefaultLifecycleObserver.CC.$default$onStop(this, lifecycleOwner);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver$Companion;", "", "()V", "TAG", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final Fragment mo213502b() {
        return this.f154605x;
    }

    @Override // com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneEditText.AbstractC61640b
    /* renamed from: a */
    public void mo213497a() {
        EnterprisePhoneEditText enterprisePhoneEditText = this.f154583a;
        if (enterprisePhoneEditText != null) {
            m240571a(new Regex("[^*#+\\d]").replace(String.valueOf(enterprisePhoneEditText.getText()), ""));
        }
    }

    /* renamed from: e */
    private final void m240576e() {
        if (this.f154584b) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[checkEnterprisePhoneQuota]", "isRequesting return");
            return;
        }
        this.f154584b = true;
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[checkEnterprisePhoneQuota2]", "send request");
        VcBizSender.m249250c().mo219889a(new C61619c(this));
    }

    /* renamed from: d */
    private final void m240575d() {
        View view = this.f154588g;
        if (view != null) {
            view.setOnClickListener(new View$OnClickListenerC61621e(this));
        }
        View view2 = this.f154589h;
        if (view2 != null) {
            view2.setOnClickListener(new View$OnClickListenerC61631o(this));
        }
        View view3 = this.f154590i;
        if (view3 != null) {
            view3.setOnClickListener(new View$OnClickListenerC61632p(this));
        }
        View view4 = this.f154591j;
        if (view4 != null) {
            view4.setOnClickListener(new View$OnClickListenerC61633q(this));
        }
        View view5 = this.f154592k;
        if (view5 != null) {
            view5.setOnClickListener(new View$OnClickListenerC61634r(this));
        }
        View view6 = this.f154593l;
        if (view6 != null) {
            view6.setOnClickListener(new View$OnClickListenerC61635s(this));
        }
        View view7 = this.f154594m;
        if (view7 != null) {
            view7.setOnClickListener(new View$OnClickListenerC61636t(this));
        }
        View view8 = this.f154595n;
        if (view8 != null) {
            view8.setOnClickListener(new View$OnClickListenerC61637u(this));
        }
        View view9 = this.f154596o;
        if (view9 != null) {
            view9.setOnClickListener(new View$OnClickListenerC61638v(this));
        }
        View view10 = this.f154597p;
        if (view10 != null) {
            view10.setOnClickListener(new View$OnClickListenerC61622f(this));
        }
        View view11 = this.f154598q;
        if (view11 != null) {
            view11.setOnClickListener(new View$OnClickListenerC61623g(this));
        }
        View view12 = this.f154598q;
        if (view12 != null) {
            view12.setOnLongClickListener(new View$OnLongClickListenerC61624h(this));
        }
        View view13 = this.f154599r;
        if (view13 != null) {
            view13.setOnClickListener(new View$OnClickListenerC61625i(this));
        }
        View view14 = this.f154600s;
        if (view14 != null) {
            view14.setOnClickListener(new View$OnClickListenerC61626j(this));
        }
        View view15 = this.f154601t;
        if (view15 != null) {
            view15.setOnClickListener(new View$OnClickListenerC61627k(this));
        }
        View view16 = this.f154602u;
        if (view16 != null) {
            view16.setOnClickListener(new View$OnClickListenerC61628l(this));
        }
        View view17 = this.f154602u;
        if (view17 != null) {
            view17.setOnLongClickListener(new View$OnLongClickListenerC61629m(this));
        }
        EnterprisePhoneEditText enterprisePhoneEditText = this.f154583a;
        if (enterprisePhoneEditText != null) {
            enterprisePhoneEditText.setOnTouchListener(new View$OnTouchListenerC61630n(this));
        }
    }

    /* renamed from: c */
    private final void m240574c() {
        View view;
        EnterprisePhoneEditText enterprisePhoneEditText;
        TextView textView;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        View view11;
        View view12;
        View view13;
        View view14;
        View view15;
        View view16 = this.f154587f;
        TextView textView2 = null;
        if (view16 != null) {
            view = view16.findViewById(R.id.iv_back);
        } else {
            view = null;
        }
        this.f154588g = view;
        View view17 = this.f154587f;
        if (view17 != null) {
            enterprisePhoneEditText = (EnterprisePhoneEditText) view17.findViewById(R.id.tv_target_number);
        } else {
            enterprisePhoneEditText = null;
        }
        this.f154583a = enterprisePhoneEditText;
        View view18 = this.f154587f;
        if (view18 != null) {
            textView = (TextView) view18.findViewById(R.id.tv_target_number_attribution);
        } else {
            textView = null;
        }
        this.f154604w = textView;
        View view19 = this.f154587f;
        if (view19 != null) {
            view2 = view19.findViewById(R.id.dial_number_one);
        } else {
            view2 = null;
        }
        this.f154589h = view2;
        View view20 = this.f154587f;
        if (view20 != null) {
            view3 = view20.findViewById(R.id.dial_number_two);
        } else {
            view3 = null;
        }
        this.f154590i = view3;
        View view21 = this.f154587f;
        if (view21 != null) {
            view4 = view21.findViewById(R.id.dial_number_three);
        } else {
            view4 = null;
        }
        this.f154591j = view4;
        View view22 = this.f154587f;
        if (view22 != null) {
            view5 = view22.findViewById(R.id.dial_number_four);
        } else {
            view5 = null;
        }
        this.f154592k = view5;
        View view23 = this.f154587f;
        if (view23 != null) {
            view6 = view23.findViewById(R.id.dial_number_five);
        } else {
            view6 = null;
        }
        this.f154593l = view6;
        View view24 = this.f154587f;
        if (view24 != null) {
            view7 = view24.findViewById(R.id.dial_number_six);
        } else {
            view7 = null;
        }
        this.f154594m = view7;
        View view25 = this.f154587f;
        if (view25 != null) {
            view8 = view25.findViewById(R.id.dial_number_seven);
        } else {
            view8 = null;
        }
        this.f154595n = view8;
        View view26 = this.f154587f;
        if (view26 != null) {
            view9 = view26.findViewById(R.id.dial_number_eight);
        } else {
            view9 = null;
        }
        this.f154596o = view9;
        View view27 = this.f154587f;
        if (view27 != null) {
            view10 = view27.findViewById(R.id.dial_number_nine);
        } else {
            view10 = null;
        }
        this.f154597p = view10;
        View view28 = this.f154587f;
        if (view28 != null) {
            view11 = view28.findViewById(R.id.dial_number_zero);
        } else {
            view11 = null;
        }
        this.f154598q = view11;
        View view29 = this.f154587f;
        if (view29 != null) {
            view12 = view29.findViewById(R.id.dial_symbol_star);
        } else {
            view12 = null;
        }
        this.f154599r = view12;
        View view30 = this.f154587f;
        if (view30 != null) {
            view13 = view30.findViewById(R.id.dial_symbol_pound);
        } else {
            view13 = null;
        }
        this.f154600s = view13;
        View view31 = this.f154587f;
        if (view31 != null) {
            view14 = view31.findViewById(R.id.call_btn);
        } else {
            view14 = null;
        }
        this.f154601t = view14;
        View view32 = this.f154587f;
        if (view32 != null) {
            view15 = view32.findViewById(R.id.delete_btn);
        } else {
            view15 = null;
        }
        this.f154602u = view15;
        View view33 = this.f154587f;
        if (view33 != null) {
            textView2 = (TextView) view33.findViewById(R.id.tv_quota);
        }
        this.f154603v = textView2;
        EnterprisePhoneEditText enterprisePhoneEditText2 = this.f154583a;
        if (enterprisePhoneEditText2 != null) {
            enterprisePhoneEditText2.setPhoneNumberListener(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver$callback$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CreateEnterprisePhoneEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$b */
    public static final class C61618b implements AbstractC63598b<C60974h> {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154606a;

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61618b(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154606a = enterprisePhoneDialObserver;
        }

        /* renamed from: a */
        public void onSuccess(C60974h hVar) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154606a;
            enterprisePhoneDialObserver.mo213503b(enterprisePhoneDialObserver.f154583a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver$checkEnterprisePhoneQuota$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/CheckEnterprisePhoneQuotaEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$c */
    public static final class C61619c implements AbstractC63598b<CheckEnterprisePhoneQuotaEntity> {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154607a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61619c(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154607a = enterprisePhoneDialObserver;
        }

        /* renamed from: a */
        public void onSuccess(CheckEnterprisePhoneQuotaEntity dVar) {
            if (dVar != null) {
                this.f154607a.f154584b = false;
                C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[checkEnterprisePhoneQuota3]", "onSuccess:" + dVar);
                if (!TextUtils.isEmpty(dVar.mo210123a())) {
                    this.f154607a.mo213500a(dVar.mo210123a(), dVar.mo210124b(), dVar.mo210125c());
                }
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            this.f154607a.f154584b = false;
            C60700b.m235864f("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[checkEnterprisePhoneQuota4]", "onError:" + eVar);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/enterprisephone/EnterprisePhoneDialObserver$getPhoneNumberAttribution$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/GetPhoneNumberAttributtonEntity;", "onError", "", "err", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$d */
    public static final class C61620d implements AbstractC63598b<GetPhoneNumberAttributtonEntity> {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154608a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C61620d(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154608a = enterprisePhoneDialObserver;
        }

        /* renamed from: a */
        public void onSuccess(GetPhoneNumberAttributtonEntity rVar) {
            if (rVar != null) {
                this.f154608a.f154585c = false;
                C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[getPhoneNumberAttribution3]", "onSuccess:" + rVar);
                this.f154608a.mo213501a(rVar.mo210129a(), rVar.mo210130b());
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "err");
            this.f154608a.f154585c = false;
            C60700b.m235864f("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[getPhoneNumberAttribution4]", "onError:" + eVar);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$e */
    public static final class View$OnClickListenerC61621e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154609a;

        View$OnClickListenerC61621e(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154609a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.f154609a.mo213502b().getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$f */
    public static final class View$OnClickListenerC61622f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154610a;

        View$OnClickListenerC61622f(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154610a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154610a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "9");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$g */
    public static final class View$OnClickListenerC61623g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154611a;

        View$OnClickListenerC61623g(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154611a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154611a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "0");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$h */
    public static final class View$OnLongClickListenerC61624h implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154612a;

        View$OnLongClickListenerC61624h(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154612a = enterprisePhoneDialObserver;
        }

        public final boolean onLongClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154612a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "+");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$i */
    public static final class View$OnClickListenerC61625i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154613a;

        View$OnClickListenerC61625i(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154613a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154613a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "*");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$j */
    public static final class View$OnClickListenerC61626j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154614a;

        View$OnClickListenerC61626j(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154614a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154614a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "#");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$l */
    public static final class View$OnClickListenerC61628l implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154616a;

        View$OnClickListenerC61628l(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154616a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154616a;
            enterprisePhoneDialObserver.mo213498a(enterprisePhoneDialObserver.f154583a);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onLongClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$m */
    public static final class View$OnLongClickListenerC61629m implements View.OnLongClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154617a;

        View$OnLongClickListenerC61629m(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154617a = enterprisePhoneDialObserver;
        }

        public final boolean onLongClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154617a;
            enterprisePhoneDialObserver.mo213503b(enterprisePhoneDialObserver.f154583a);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$o */
    public static final class View$OnClickListenerC61631o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154619a;

        View$OnClickListenerC61631o(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154619a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154619a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "1");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$p */
    public static final class View$OnClickListenerC61632p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154620a;

        View$OnClickListenerC61632p(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154620a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154620a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "2");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$q */
    public static final class View$OnClickListenerC61633q implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154621a;

        View$OnClickListenerC61633q(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154621a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154621a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "3");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$r */
    public static final class View$OnClickListenerC61634r implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154622a;

        View$OnClickListenerC61634r(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154622a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154622a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "4");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$s */
    public static final class View$OnClickListenerC61635s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154623a;

        View$OnClickListenerC61635s(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154623a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154623a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "5");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$t */
    public static final class View$OnClickListenerC61636t implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154624a;

        View$OnClickListenerC61636t(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154624a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154624a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "6");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$u */
    public static final class View$OnClickListenerC61637u implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154625a;

        View$OnClickListenerC61637u(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154625a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154625a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "7");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$v */
    public static final class View$OnClickListenerC61638v implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154626a;

        View$OnClickListenerC61638v(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154626a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneDialObserver enterprisePhoneDialObserver = this.f154626a;
            enterprisePhoneDialObserver.mo213499a(enterprisePhoneDialObserver.f154583a, "8");
        }
    }

    /* renamed from: b */
    private final String m240573b(String str) {
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.applyPattern("#,###");
        String format = decimalFormat.format(Integer.valueOf(Integer.parseInt(str)));
        Intrinsics.checkExpressionValueIsNotNull(format, "myFormat.format(Integer.parseInt(str))");
        return format;
    }

    public EnterprisePhoneDialObserver(Fragment fragment) {
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.f154605x = fragment;
        m240572a(true);
        m240574c();
        m240575d();
        m240576e();
    }

    /* renamed from: a */
    private final void m240571a(String str) {
        if (this.f154585c) {
            C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[getPhoneNumberAttribution]", "isRequesting return");
            return;
        }
        this.f154585c = true;
        C60700b.m235851b("EnterprisePhoneLog_EnterprisePhoneDialObserver", "[getPhoneNumberAttribution2]", "send request");
        VcBizSender.m249229b(str).mo219889a(new C61620d(this));
    }

    /* renamed from: b */
    public final void mo213503b(TextView textView) {
        if (textView != null) {
            CharSequence text = textView.getText();
            if (!TextUtils.isEmpty(text)) {
                textView.getEditableText().delete(0, text.length());
            }
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setCursorVisible(false);
            }
            mo213501a("", "");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$k */
    public static final class View$OnClickListenerC61627k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154615a;

        View$OnClickListenerC61627k(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154615a = enterprisePhoneDialObserver;
        }

        public final void onClick(View view) {
            EnterprisePhoneEditText enterprisePhoneEditText = this.f154615a.f154583a;
            if (enterprisePhoneEditText != null) {
                String valueOf = String.valueOf(enterprisePhoneEditText.getText());
                String b = EnterprisePhoneUtil.m240615b();
                String str = valueOf;
                if (!TextUtils.isEmpty(str)) {
                    String replace = new Regex("[^*#+\\d]").replace(str, "");
                    VideoChatPush.m249004a().mo219733b();
                    EnterprisePhoneUtil.f154649a.mo213542a(replace, this.f154615a.f154586d);
                    EnterprisePhoneUtil.m240613a(replace);
                    C63767p.m250332c();
                    return;
                }
                String str2 = b;
                if (!TextUtils.isEmpty(str2)) {
                    enterprisePhoneEditText.getEditableText().insert(0, str2);
                    this.f154615a.mo213497a();
                }
            }
        }
    }

    /* renamed from: a */
    private final void m240572a(boolean z) {
        View view = this.f154587f;
        if (view == null) {
            return;
        }
        if (z) {
            view.setPadding(view.getLeft(), C60776r.m236148f(), view.getRight(), view.getBottom());
        } else if (view.getTop() != 0) {
            view.setPadding(view.getLeft(), 0, view.getRight(), view.getBottom());
        }
    }

    /* renamed from: a */
    public final void mo213498a(TextView textView) {
        int length;
        if (textView != null) {
            CharSequence text = textView.getText();
            if (!TextUtils.isEmpty(text)) {
                Editable editableText = textView.getEditableText();
                int selectionStart = textView.getSelectionStart();
                if (selectionStart > 0) {
                    editableText.delete(selectionStart - 1, selectionStart);
                }
            }
            if (TextUtils.isEmpty(textView.getText())) {
                textView.setCursorVisible(false);
            }
            if (!TextUtils.isEmpty(text) && 5 <= (length = text.length()) && 50 >= length) {
                mo213497a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.enterprisephone.EnterprisePhoneDialObserver$n */
    public static final class View$OnTouchListenerC61630n implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ EnterprisePhoneDialObserver f154618a;

        View$OnTouchListenerC61630n(EnterprisePhoneDialObserver enterprisePhoneDialObserver) {
            this.f154618a = enterprisePhoneDialObserver;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            EnterprisePhoneEditText enterprisePhoneEditText;
            Intrinsics.checkExpressionValueIsNotNull(motionEvent, "event");
            if (motionEvent.getAction() != 0 || (enterprisePhoneEditText = this.f154618a.f154583a) == null) {
                return false;
            }
            enterprisePhoneEditText.setCursorVisible(true);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo213499a(TextView textView, String str) {
        int length;
        if (textView != null) {
            int selectionStart = textView.getSelectionStart();
            Editable editableText = textView.getEditableText();
            if (editableText != null) {
                editableText.insert(selectionStart, str);
            }
            CharSequence text = textView.getText();
            if (!TextUtils.isEmpty(text) && 5 <= (length = text.length()) && 50 >= length) {
                mo213497a();
            }
        }
    }

    /* renamed from: a */
    public final void mo213501a(String str, String str2) {
        TextView textView = this.f154604w;
        if (textView != null) {
            textView.setText(str + ' ' + str2);
        }
    }

    /* renamed from: a */
    public final void mo213500a(String str, Integer num, String str2) {
        String str3;
        String b = m240573b(String.valueOf(num));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (TextUtils.isEmpty(str2)) {
            linkedHashMap.put("number", b);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("date", str);
            str3 = UIHelper.mustacheFormat((int) R.string.View_MV_OfficePhoneQuotaRemain_Note, linkedHashMap);
            Intrinsics.checkExpressionValueIsNotNull(str3, "UIHelper.mustacheFormat(…oneQuotaRemain_Note, map)");
        } else {
            linkedHashMap.put("number", b);
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("date", str);
            str3 = UIHelper.mustacheFormat((int) R.string.View_MV_OfficePhoneQuotaForName_Colon, linkedHashMap);
            Intrinsics.checkExpressionValueIsNotNull(str3, "UIHelper.mustacheFormat(…eQuotaForName_Colon, map)");
        }
        String str4 = str3;
        Matcher matcher = Pattern.compile(b).matcher(str4);
        int i = 0;
        int i2 = 0;
        while (matcher.find()) {
            i = matcher.start();
            i2 = matcher.end();
        }
        if (i < 0 || i2 < 0) {
            TextView textView = this.f154603v;
            if (textView != null) {
                textView.setText(str4);
            }
        } else {
            SpannableString spannableString = new SpannableString(str4);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C60773o.m236126d(R.color.function_danger_500));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(C60773o.m236126d(R.color.text_title));
            if (Intrinsics.areEqual("0", b)) {
                spannableString.setSpan(foregroundColorSpan, i, i2, 33);
            } else {
                spannableString.setSpan(foregroundColorSpan2, i, i2, 33);
            }
            spannableString.setSpan(new StyleSpan(1), i, i2, 33);
            TextView textView2 = this.f154603v;
            if (textView2 != null) {
                textView2.setText(spannableString);
            }
        }
        if (Intrinsics.areEqual("0", b)) {
            EnterprisePhoneUtil.f154649a.mo213547g();
        }
    }
}
