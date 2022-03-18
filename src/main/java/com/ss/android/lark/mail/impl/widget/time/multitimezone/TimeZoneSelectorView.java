package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.edittext.UDEditText;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.TimezoneAdapter;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.TouchListenerLinearLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000*\u0001\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\u0018\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\b\u0010 \u001a\u00020\u0011H\u0016J\b\u0010!\u001a\u00020\u0011H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorView;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "mSearchAdapter", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimezoneAdapter;", "mSearchItemClickListener", "com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorView$mSearchItemClickListener$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorView$mSearchItemClickListener$1;", "mViewAction", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewAction;", "mViewData", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "getRootView", "()Landroid/view/View;", "create", "", "destroy", "hideKeyboard", "initDeviceTimeZone", "initKeyboardSearch", "initSearchEditText", "initSearchRecycleView", "modifyForDesktop", "setDependency", "viewData", "viewAction", "showDeviceTimeZoneData", "showRecentTimeZoneData", "showRecentView", "showSearchNotData", "showSearchResultData", "showSearchView", "showSelectTimeZone", "showSelectedToast", "timeZoneTip", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m */
public final class TimeZoneSelectorView implements ITimeZoneSelectorContract.ITimeZoneSelectorView {

    /* renamed from: a */
    public ITimeZoneSelectorContract.IViewData f112055a;

    /* renamed from: b */
    public ITimeZoneSelectorContract.IViewAction f112056b;

    /* renamed from: c */
    private final TimezoneAdapter f112057c = new TimezoneAdapter();

    /* renamed from: d */
    private final C44130h f112058d = new C44130h(this);

    /* renamed from: e */
    private final View f112059e;

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: b */
    public void mo157026b() {
    }

    /* renamed from: i */
    public final View mo157062i() {
        return this.f112059e;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m174923j();
        m174925l();
        m174926m();
    }

    /* renamed from: k */
    private final void m174924k() {
        ((UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET)).setOnEditorActionListener(new C44124b(this));
    }

    /* renamed from: l */
    private final void m174925l() {
        ((RelativeLayout) this.f112059e.findViewById(R.id.deviceTimeZoneRL)).setOnClickListener(new View$OnClickListenerC44123a(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        KeyboardUtils.hideKeyboard(this.f112059e.getContext(), (UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET));
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: h */
    public void mo157032h() {
        KeyboardUtils.hideKeyboard(this.f112059e.getContext(), (UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET));
    }

    /* renamed from: m */
    private final void m174926m() {
        RecyclerView recyclerView = (RecyclerView) this.f112059e.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f112059e.getContext(), 1, false));
        this.f112057c.mo157076a(this.f112058d);
        RecyclerView recyclerView2 = (RecyclerView) this.f112059e.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.searchTimezoneRv");
        recyclerView2.setAdapter(this.f112057c);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: g */
    public void mo157031g() {
        int i;
        ITimeZoneSelectorContract.IViewData dVar = this.f112055a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        TimeZoneItemData a = dVar.mo157037a();
        if (a != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f112059e.findViewById(R.id.selectedIcon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "rootView.selectedIcon");
            if (a.mo157044a()) {
                i = 0;
            } else {
                i = 8;
            }
            appCompatImageView.setVisibility(i);
        }
        ITimeZoneSelectorContract.IViewData dVar2 = this.f112055a;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f112057c.mo157077a(dVar2.mo157038b());
    }

    /* renamed from: j */
    private final void m174923j() {
        ((UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET)).addTextChangedListener(new C44125c(this));
        ((TouchListenerLinearLayout) this.f112059e.findViewById(R.id.searchClickLl)).setTouchListener(new C44126d(this));
        ((AppCompatImageView) this.f112059e.findViewById(R.id.searchDeleteIV)).setOnClickListener(new View$OnClickListenerC44127e(this));
        ((TextView) this.f112059e.findViewById(R.id.searchCancelTV)).setOnClickListener(new View$OnClickListenerC44128f(this));
        ((RelativeLayout) this.f112059e.findViewById(R.id.searchConfirmZone)).setOnClickListener(new View$OnClickListenerC44129g(this));
        m174924k();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: c */
    public void mo157027c() {
        ITimeZoneSelectorContract.IViewData dVar = this.f112055a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f112057c.mo157077a(dVar.mo157038b());
        LinearLayout linearLayout = (LinearLayout) this.f112059e.findViewById(R.id.noSearchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.noSearchResultZone");
        linearLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f112059e.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
        recyclerView.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f112059e.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.searchTzLoadingZone");
        linearLayout2.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f112059e.findViewById(R.id.searchConfirmZone);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
        relativeLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: d */
    public void mo157028d() {
        LinearLayout linearLayout = (LinearLayout) this.f112059e.findViewById(R.id.noSearchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.noSearchResultZone");
        linearLayout.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) this.f112059e.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
        recyclerView.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f112059e.findViewById(R.id.searchConfirmZone);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
        relativeLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) this.f112059e.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.searchTzLoadingZone");
        linearLayout2.setVisibility(8);
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: e */
    public void mo157029e() {
        LinearLayout linearLayout = (LinearLayout) this.f112059e.findViewById(R.id.searchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchResultZone");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) this.f112059e.findViewById(R.id.timeZoneListZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.timeZoneListZone");
        linearLayout2.setVisibility(0);
        TextView textView = (TextView) this.f112059e.findViewById(R.id.searchCancelTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchCancelTV");
        textView.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) this.f112059e.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "rootView.searchTzLoadingZone");
        linearLayout3.setVisibility(8);
        KeyboardUtils.hideKeyboard(this.f112059e.getContext(), (UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET));
        ((UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET)).clearFocus();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: f */
    public void mo157030f() {
        LinearLayout linearLayout = (LinearLayout) this.f112059e.findViewById(R.id.searchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchResultZone");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f112059e.findViewById(R.id.timeZoneListZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.timeZoneListZone");
        linearLayout2.setVisibility(8);
        TextView textView = (TextView) this.f112059e.findViewById(R.id.searchCancelTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchCancelTV");
        textView.setVisibility(0);
        LinearLayout linearLayout3 = (LinearLayout) this.f112059e.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "rootView.searchTzLoadingZone");
        linearLayout3.setVisibility(8);
        KeyboardUtils.showKeyboard((UDEditText) this.f112059e.findViewById(R.id.timeZoneSearchET));
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: a */
    public void mo157024a() {
        ITimeZoneSelectorContract.IViewData dVar = this.f112055a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        TimeZoneItemData a = dVar.mo157037a();
        int i = 8;
        if (a != null) {
            TextView textView = (TextView) this.f112059e.findViewById(R.id.deviceTzNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.deviceTzNameTV");
            textView.setText(a.mo157047d());
            TextView textView2 = (TextView) this.f112059e.findViewById(R.id.deviceTzOffsetTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.deviceTzOffsetTV");
            textView2.setText(TimeZoneUtils.m174943a(a.mo157048e()));
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f112059e.findViewById(R.id.selectedIcon);
            Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "rootView.selectedIcon");
            if (a.mo157044a()) {
                i = 0;
            }
            appCompatImageView.setVisibility(i);
            RelativeLayout relativeLayout = (RelativeLayout) this.f112059e.findViewById(R.id.deviceTimeZoneRL);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.deviceTimeZoneRL");
            relativeLayout.setVisibility(0);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f112059e.findViewById(R.id.deviceTimeZoneRL);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.deviceTimeZoneRL");
        relativeLayout2.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorView$initSearchEditText$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "s", "", "start", "", "count", "after", "onTextChanged", "before", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$c */
    public static final class C44125c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112062a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44125c(TimeZoneSelectorView mVar) {
            this.f112062a = mVar;
        }

        public void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                TextView textView = (TextView) this.f112062a.mo157062i().findViewById(R.id.searchTintTV);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchTintTV");
                textView.setVisibility(0);
                AppCompatImageView appCompatImageView = (AppCompatImageView) this.f112062a.mo157062i().findViewById(R.id.searchDeleteIV);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView, "rootView.searchDeleteIV");
                appCompatImageView.setVisibility(8);
                RelativeLayout relativeLayout = (RelativeLayout) this.f112062a.mo157062i().findViewById(R.id.searchConfirmZone);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
                relativeLayout.setVisibility(8);
            } else {
                TextView textView2 = (TextView) this.f112062a.mo157062i().findViewById(R.id.searchTintTV);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.searchTintTV");
                textView2.setVisibility(8);
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f112062a.mo157062i().findViewById(R.id.searchDeleteIV);
                Intrinsics.checkExpressionValueIsNotNull(appCompatImageView2, "rootView.searchDeleteIV");
                appCompatImageView2.setVisibility(0);
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f112062a.mo157062i().findViewById(R.id.searchConfirmZone);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.searchConfirmZone");
                relativeLayout2.setVisibility(0);
            }
            TextView textView3 = (TextView) this.f112062a.mo157062i().findViewById(R.id.searchKeyTV);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.searchKeyTV");
            textView3.setText(str2);
            LinearLayout linearLayout = (LinearLayout) this.f112062a.mo157062i().findViewById(R.id.noSearchResultZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.noSearchResultZone");
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f112062a.mo157062i().findViewById(R.id.searchTimezoneRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
            recyclerView.setVisibility(8);
            if (str == null) {
                TextView textView4 = (TextView) this.f112062a.mo157062i().findViewById(R.id.searchKeyTV);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.searchKeyTV");
                textView4.setText("");
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f112062a.mo157062i().findViewById(R.id.searchConfirmZone);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "rootView.searchConfirmZone");
                relativeLayout3.setVisibility(8);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorView$initSearchEditText$2", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TouchListenerLinearLayout$TouchListener;", "onSizeChanged", "", "width", "", "height", "onTouch", "ev", "Landroid/view/MotionEvent;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$d */
    public static final class C44126d implements TouchListenerLinearLayout.TouchListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112063a;

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TouchListenerLinearLayout.TouchListener
        /* renamed from: a */
        public void mo156919a(int i, int i2) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44126d(TimeZoneSelectorView mVar) {
            this.f112063a = mVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TouchListenerLinearLayout.TouchListener
        /* renamed from: a */
        public void mo156920a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
            TimeZoneSelectorView.m174921a(this.f112063a).mo157033a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorView$mSearchItemClickListener$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimezoneAdapter$ItemClickListener;", "onBodyClick", "", "itemData", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$h */
    public static final class C44130h implements TimezoneAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112067a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44130h(TimeZoneSelectorView mVar) {
            this.f112067a = mVar;
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.TimezoneAdapter.ItemClickListener
        /* renamed from: a */
        public void mo157071a(TimeZoneItemData iVar) {
            Intrinsics.checkParameterIsNotNull(iVar, "itemData");
            TimeZoneSelectorView.m174921a(this.f112067a).mo157036b(iVar.mo157046c());
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$f */
    public static final class View$OnClickListenerC44128f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112065a;

        View$OnClickListenerC44128f(TimeZoneSelectorView mVar) {
            this.f112065a = mVar;
        }

        public final void onClick(View view) {
            TimeZoneSelectorView.m174921a(this.f112065a).mo157035b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ITimeZoneSelectorContract.IViewAction m174921a(TimeZoneSelectorView mVar) {
        ITimeZoneSelectorContract.IViewAction cVar = mVar.f112056b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ITimeZoneSelectorContract.IViewData m174922b(TimeZoneSelectorView mVar) {
        ITimeZoneSelectorContract.IViewData dVar = mVar.f112055a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$a */
    public static final class View$OnClickListenerC44123a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112060a;

        View$OnClickListenerC44123a(TimeZoneSelectorView mVar) {
            this.f112060a = mVar;
        }

        public final void onClick(View view) {
            TimeZoneItemData a = TimeZoneSelectorView.m174922b(this.f112060a).mo157037a();
            if (a != null) {
                TimeZoneSelectorView.m174921a(this.f112060a).mo157036b(a.mo157046c());
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$e */
    public static final class View$OnClickListenerC44127e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112064a;

        View$OnClickListenerC44127e(TimeZoneSelectorView mVar) {
            this.f112064a = mVar;
        }

        public final void onClick(View view) {
            ((UDEditText) this.f112064a.mo157062i().findViewById(R.id.timeZoneSearchET)).setText("");
        }
    }

    public TimeZoneSelectorView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f112059e = view;
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: a */
    public void mo157025a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneTip");
        LKUIToast.show(this.f112059e.getContext(), str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$g */
    public static final class View$OnClickListenerC44129g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112066a;

        View$OnClickListenerC44129g(TimeZoneSelectorView mVar) {
            this.f112066a = mVar;
        }

        public final void onClick(View view) {
            ITimeZoneSelectorContract.IViewAction a = TimeZoneSelectorView.m174921a(this.f112066a);
            TextView textView = (TextView) this.f112066a.mo157062i().findViewById(R.id.searchKeyTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchKeyTV");
            a.mo157034a(textView.getText().toString());
            LinearLayout linearLayout = (LinearLayout) this.f112066a.mo157062i().findViewById(R.id.searchTzLoadingZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchTzLoadingZone");
            linearLayout.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) this.f112066a.mo157062i().findViewById(R.id.searchConfirmZone);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
            relativeLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f112066a.mo157062i().findViewById(R.id.searchTimezoneRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
            recyclerView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo156855a(ITimeZoneSelectorContract.IViewData dVar, ITimeZoneSelectorContract.IViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        Intrinsics.checkParameterIsNotNull(cVar, "viewAction");
        this.f112055a = dVar;
        this.f112056b = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.m$b */
    public static final class C44124b implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f112061a;

        C44124b(TimeZoneSelectorView mVar) {
            this.f112061a = mVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f112061a.mo157032h();
            ITimeZoneSelectorContract.IViewAction a = TimeZoneSelectorView.m174921a(this.f112061a);
            TextView textView2 = (TextView) this.f112061a.mo157062i().findViewById(R.id.searchKeyTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.searchKeyTV");
            a.mo157034a(textView2.getText().toString());
            LinearLayout linearLayout = (LinearLayout) this.f112061a.mo157062i().findViewById(R.id.searchTzLoadingZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchTzLoadingZone");
            linearLayout.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) this.f112061a.mo157062i().findViewById(R.id.searchConfirmZone);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
            relativeLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f112061a.mo157062i().findViewById(R.id.searchTimezoneRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
            recyclerView.setVisibility(8);
            return true;
        }
    }
}
