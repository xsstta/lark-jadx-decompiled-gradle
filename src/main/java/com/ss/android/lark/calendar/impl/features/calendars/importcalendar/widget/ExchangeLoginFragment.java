package com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.widget.RequestLoadingDialog;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.pb.calendars.BindingExchangeAccountResponse;
import com.ss.android.lark.ui.CommonTitleBar;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001%B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\u001a\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$H\u0002R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006&"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "accountTxt", "", "delegate", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$Delegate;", "(Ljava/lang/String;Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$Delegate;)V", "hasAccountInput", "", "hasPasswordInput", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/IExchangeLoginViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/IExchangeLoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleLoginButtonStatus", "", "isLoginLoading", "initLiveData", "initView", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "refreshAccount", "account", "showLoginResultTip", "state", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "Delegate", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a */
public final class ExchangeLoginFragment extends CalendarBaseFragment {

    /* renamed from: a */
    public boolean f76000a;

    /* renamed from: b */
    public boolean f76001b;

    /* renamed from: c */
    public final Delegate f76002c;

    /* renamed from: d */
    private final Lazy f76003d;

    /* renamed from: e */
    private final String f76004e;

    /* renamed from: f */
    private HashMap f76005f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$Delegate;", "", "onClickFragmentBack", "", "isImportSuc", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$a */
    public interface Delegate {
        /* renamed from: a */
        void mo109631a(boolean z);
    }

    public ExchangeLoginFragment() {
        this(null, null, 3, null);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public View mo109250a(int i) {
        if (this.f76005f == null) {
            this.f76005f = new HashMap();
        }
        View view = (View) this.f76005f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f76005f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    /* renamed from: a */
    public void mo109251a() {
        HashMap hashMap = this.f76005f;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: b */
    public final IExchangeLoginViewModel mo109630b() {
        return (IExchangeLoginViewModel) this.f76003d.getValue();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment, com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo109251a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        mo109630b().destroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$j */
    static final class C30359j extends Lambda implements Function0<ExchangeLoginViewModel> {
        final /* synthetic */ ExchangeLoginFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30359j(ExchangeLoginFragment aVar) {
            super(0);
            this.this$0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ExchangeLoginViewModel invoke() {
            return (ExchangeLoginViewModel) new C1144ai(this.this$0).mo6005a(ExchangeLoginViewModel.class);
        }
    }

    /* renamed from: d */
    private final void m112857d() {
        ExchangeLoginFragment aVar = this;
        mo109630b().getLoginResultLiveData().mo5923a(aVar, new C30351b(this));
        mo109630b().getServerHelperLinkLiveData().mo5923a(aVar, new C30352c(this));
    }

    /* renamed from: c */
    private final void m112856c() {
        boolean z;
        ((CommonTitleBar) mo109250a(R.id.exchangeLoginTitleBar)).setTitle(R.string.Calendar_Sync_AddExchangeCalendarButton);
        ((CommonTitleBar) mo109250a(R.id.exchangeLoginTitleBar)).setLeftClickListener(new View$OnClickListenerC30353d(this));
        ((EditText) mo109250a(R.id.accountET)).addTextChangedListener(new C30354e(this));
        ((EditText) mo109250a(R.id.passwordET)).addTextChangedListener(new C30355f(this));
        ((EditText) mo109250a(R.id.serverUrlET)).addTextChangedListener(new C30356g(this));
        String str = this.f76004e;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ((EditText) mo109250a(R.id.accountET)).setText(this.f76004e);
        }
        ((LinearLayout) mo109250a(R.id.loginBtn)).setOnClickListener(new View$OnClickListenerC30357h(this));
        ((TextView) mo109250a(R.id.helpLink)).setOnClickListener(new View$OnClickListenerC30358i(this));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$initView$2", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$e */
    public static final class C30354e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76009a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30354e(ExchangeLoginFragment aVar) {
            this.f76009a = aVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            boolean z;
            TextView textView = (TextView) this.f76009a.mo109250a(R.id.loginResultTip);
            Intrinsics.checkExpressionValueIsNotNull(textView, "loginResultTip");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f76009a.mo109250a(R.id.serverUrlTipZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "serverUrlTipZone");
            linearLayout.setVisibility(8);
            ExchangeLoginFragment aVar = this.f76009a;
            if (charSequence != null) {
                charSequence2 = StringsKt.trim(charSequence);
            } else {
                charSequence2 = null;
            }
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f76000a = !z;
            this.f76009a.mo109629a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$initView$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$f */
    public static final class C30355f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76010a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30355f(ExchangeLoginFragment aVar) {
            this.f76010a = aVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            boolean z;
            TextView textView = (TextView) this.f76010a.mo109250a(R.id.loginResultTip);
            Intrinsics.checkExpressionValueIsNotNull(textView, "loginResultTip");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f76010a.mo109250a(R.id.serverUrlTipZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "serverUrlTipZone");
            linearLayout.setVisibility(8);
            ExchangeLoginFragment aVar = this.f76010a;
            if (charSequence != null) {
                charSequence2 = StringsKt.trim(charSequence);
            } else {
                charSequence2 = null;
            }
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f76001b = !z;
            this.f76010a.mo109629a(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment$initView$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$g */
    public static final class C30356g implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76011a;

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30356g(ExchangeLoginFragment aVar) {
            this.f76011a = aVar;
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            CharSequence charSequence2;
            boolean z;
            if (charSequence != null) {
                charSequence2 = StringsKt.trim(charSequence);
            } else {
                charSequence2 = null;
            }
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                EditText editText = (EditText) this.f76011a.mo109250a(R.id.serverUrlET);
                Intrinsics.checkExpressionValueIsNotNull(editText, "serverUrlET");
                editText.setBackground(C32634ae.m125184d(R.drawable.bg_exchange_login_input));
            }
            TextView textView = (TextView) this.f76011a.mo109250a(R.id.loginResultTip);
            Intrinsics.checkExpressionValueIsNotNull(textView, "loginResultTip");
            textView.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) this.f76011a.mo109250a(R.id.serverUrlTipZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "serverUrlTipZone");
            linearLayout.setVisibility(8);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$d */
    public static final class View$OnClickListenerC30353d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76008a;

        View$OnClickListenerC30353d(ExchangeLoginFragment aVar) {
            this.f76008a = aVar;
        }

        public final void onClick(View view) {
            Delegate aVar = this.f76008a.f76002c;
            if (aVar != null) {
                aVar.mo109631a(false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$i */
    public static final class View$OnClickListenerC30358i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76013a;

        View$OnClickListenerC30358i(ExchangeLoginFragment aVar) {
            this.f76013a = aVar;
        }

        public final void onClick(View view) {
            this.f76013a.mo109630b().onLoadServerHelperLink();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "state", "Lcom/ss/android/lark/pb/calendars/BindingExchangeAccountResponse$State;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$b */
    public static final class C30351b<T> implements AbstractC1178x<BindingExchangeAccountResponse.State> {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76006a;

        C30351b(ExchangeLoginFragment aVar) {
            this.f76006a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(BindingExchangeAccountResponse.State state) {
            ExchangeLoginFragment aVar = this.f76006a;
            Intrinsics.checkExpressionValueIsNotNull(state, "state");
            aVar.mo109627a(state);
            LinearLayout linearLayout = (LinearLayout) this.f76006a.mo109250a(R.id.loginBtn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loginBtn");
            linearLayout.setEnabled(true);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "url", "", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$c */
    public static final class C30352c<T> implements AbstractC1178x<String> {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76007a;

        C30352c(ExchangeLoginFragment aVar) {
            this.f76007a = aVar;
        }

        /* renamed from: a */
        public final void onChanged(String str) {
            if (!TextUtils.isEmpty(str)) {
                KeyboardUtils.hideKeyboard(this.f76007a.getContext());
                C30022a.f74882a.browserModuleDependency().mo108211a(this.f76007a.getContext(), str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.importcalendar.b.a$h */
    public static final class View$OnClickListenerC30357h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExchangeLoginFragment f76012a;

        View$OnClickListenerC30357h(ExchangeLoginFragment aVar) {
            this.f76012a = aVar;
        }

        public final void onClick(View view) {
            String str;
            EditText editText = (EditText) this.f76012a.mo109250a(R.id.accountET);
            Intrinsics.checkExpressionValueIsNotNull(editText, "accountET");
            String obj = editText.getText().toString();
            EditText editText2 = (EditText) this.f76012a.mo109250a(R.id.passwordET);
            Intrinsics.checkExpressionValueIsNotNull(editText2, "passwordET");
            String obj2 = editText2.getText().toString();
            EditText editText3 = (EditText) this.f76012a.mo109250a(R.id.serverUrlET);
            Intrinsics.checkExpressionValueIsNotNull(editText3, "serverUrlET");
            if (editText3.getVisibility() == 0) {
                EditText editText4 = (EditText) this.f76012a.mo109250a(R.id.serverUrlET);
                Intrinsics.checkExpressionValueIsNotNull(editText4, "serverUrlET");
                str = editText4.getText().toString();
            } else {
                str = "";
            }
            this.f76012a.mo109629a(true);
            this.f76012a.mo109630b().onExecuteLogin(obj, obj2, str);
        }
    }

    /* renamed from: a */
    public final void mo109628a(String str) {
        ((EditText) mo109250a(R.id.accountET)).setText(str);
        ((EditText) mo109250a(R.id.passwordET)).setText("");
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.serverUrlTipZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "serverUrlTipZone");
        linearLayout.setVisibility(8);
        EditText editText = (EditText) mo109250a(R.id.serverUrlET);
        Intrinsics.checkExpressionValueIsNotNull(editText, "serverUrlET");
        editText.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo109629a(boolean z) {
        if (z) {
            ImageView imageView = (ImageView) mo109250a(R.id.loginLoading);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "loginLoading");
            imageView.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.loginBtn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "loginBtn");
            linearLayout.setBackground(C32634ae.m125184d(R.drawable.bg_exchange_login_button_blue300));
            LinearLayout linearLayout2 = (LinearLayout) mo109250a(R.id.loginBtn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "loginBtn");
            linearLayout2.setEnabled(false);
            return;
        }
        ImageView imageView2 = (ImageView) mo109250a(R.id.loginLoading);
        Intrinsics.checkExpressionValueIsNotNull(imageView2, "loginLoading");
        imageView2.setVisibility(8);
        if (!this.f76000a || !this.f76001b) {
            LinearLayout linearLayout3 = (LinearLayout) mo109250a(R.id.loginBtn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "loginBtn");
            linearLayout3.setBackground(C32634ae.m125184d(R.drawable.bg_exchange_login_button_gray));
            LinearLayout linearLayout4 = (LinearLayout) mo109250a(R.id.loginBtn);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout4, "loginBtn");
            linearLayout4.setEnabled(false);
            return;
        }
        LinearLayout linearLayout5 = (LinearLayout) mo109250a(R.id.loginBtn);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout5, "loginBtn");
        linearLayout5.setBackground(C32634ae.m125184d(R.drawable.bg_exchange_login_button_blue));
        LinearLayout linearLayout6 = (LinearLayout) mo109250a(R.id.loginBtn);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout6, "loginBtn");
        linearLayout6.setEnabled(true);
    }

    /* renamed from: a */
    public final void mo109627a(BindingExchangeAccountResponse.State state) {
        TextView textView = (TextView) mo109250a(R.id.loginResultTip);
        Intrinsics.checkExpressionValueIsNotNull(textView, "loginResultTip");
        textView.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo109250a(R.id.serverUrlTipZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "serverUrlTipZone");
        linearLayout.setVisibility(8);
        EditText editText = (EditText) mo109250a(R.id.serverUrlET);
        Intrinsics.checkExpressionValueIsNotNull(editText, "serverUrlET");
        editText.setVisibility(8);
        mo109629a(false);
        RequestLoadingDialog requestLoadingDialog = null;
        switch (C30360b.f76014a[state.ordinal()]) {
            case 1:
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    requestLoadingDialog = new RequestLoadingDialog(activity);
                }
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112593d(R.string.Calendar_EmailGuest_AccountAddedSuccessfully);
                }
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112594e(133);
                }
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.show();
                }
                Delegate aVar = this.f76002c;
                if (aVar != null) {
                    aVar.mo109631a(true);
                    return;
                }
                return;
            case 2:
                TextView textView2 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "loginResultTip");
                textView2.setVisibility(0);
                TextView textView3 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView3, "loginResultTip");
                textView3.setText(C32634ae.m125182b(R.string.Calendar_Sync_RetypeEmailAndPassword));
                return;
            case 3:
                TextView textView4 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "loginResultTip");
                textView4.setVisibility(0);
                TextView textView5 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView5, "loginResultTip");
                textView5.setText(C32634ae.m125182b(R.string.Calendar_Sync_FailToVerifyEmailAndPassword));
                return;
            case 4:
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    requestLoadingDialog = new RequestLoadingDialog(activity2);
                }
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112593d(R.string.Calendar_Common_AccountAlreadyExists);
                }
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.mo112594e(133);
                }
                if (requestLoadingDialog != null) {
                    requestLoadingDialog.show();
                    return;
                }
                return;
            case 5:
                LinearLayout linearLayout2 = (LinearLayout) mo109250a(R.id.serverUrlTipZone);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "serverUrlTipZone");
                linearLayout2.setVisibility(0);
                EditText editText2 = (EditText) mo109250a(R.id.serverUrlET);
                Intrinsics.checkExpressionValueIsNotNull(editText2, "serverUrlET");
                editText2.setVisibility(0);
                EditText editText3 = (EditText) mo109250a(R.id.serverUrlET);
                Intrinsics.checkExpressionValueIsNotNull(editText3, "serverUrlET");
                editText3.setBackground(C32634ae.m125184d(R.drawable.bg_exchange_login_input_red));
                TextView textView6 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView6, "loginResultTip");
                textView6.setText(C32634ae.m125182b(R.string.Calendar_Sync_AddServerURLMobile));
                TextView textView7 = (TextView) mo109250a(R.id.serverUrlTip);
                Intrinsics.checkExpressionValueIsNotNull(textView7, "serverUrlTip");
                textView7.setText(C32634ae.m125182b(R.string.Calendar_Sync_AddServerURLMobile));
                TextView textView8 = (TextView) mo109250a(R.id.helpLink);
                Intrinsics.checkExpressionValueIsNotNull(textView8, "helpLink");
                textView8.setText(C32634ae.m125182b(R.string.Calendar_Sync_HowToFindURL));
                return;
            case 6:
                TextView textView9 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView9, "loginResultTip");
                textView9.setVisibility(0);
                TextView textView10 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView10, "loginResultTip");
                textView10.setText(C32634ae.m125182b(R.string.Calendar_Sync_FailToVerifyEmailAndPassword));
                return;
            case 7:
                LinearLayout linearLayout3 = (LinearLayout) mo109250a(R.id.serverUrlTipZone);
                Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "serverUrlTipZone");
                linearLayout3.setVisibility(0);
                TextView textView11 = (TextView) mo109250a(R.id.serverUrlTip);
                Intrinsics.checkExpressionValueIsNotNull(textView11, "serverUrlTip");
                textView11.setText(C32634ae.m125182b(R.string.Calendar_External_UnableAddCuzMSFTSecurityPolicy1));
                TextView textView12 = (TextView) mo109250a(R.id.helpLink);
                Intrinsics.checkExpressionValueIsNotNull(textView12, "helpLink");
                textView12.setText(C32634ae.m125182b(R.string.Calendar_External_UnableAddCuzMSFTSecurityPolicy2));
                return;
            default:
                TextView textView13 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView13, "loginResultTip");
                textView13.setVisibility(0);
                TextView textView14 = (TextView) mo109250a(R.id.loginResultTip);
                Intrinsics.checkExpressionValueIsNotNull(textView14, "loginResultTip");
                textView14.setText(C32634ae.m125182b(R.string.Calendar_Sync_FailToVerifyEmailAndPassword));
                return;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        m112856c();
        m112857d();
    }

    public ExchangeLoginFragment(String str, Delegate aVar) {
        this.f76004e = str;
        this.f76002c = aVar;
        this.f76003d = LazyKt.lazy(new C30359j(this));
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_exchange_login, viewGroup, false);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExchangeLoginFragment(String str, Delegate aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : aVar);
    }
}
