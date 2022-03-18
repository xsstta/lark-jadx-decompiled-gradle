package com.ss.android.lark.calendar.impl.features.search.calendar;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.C23257e;
import com.h6ah4i.android.widget.advrecyclerview.p1007c.C23260a;
import com.h6ah4i.android.widget.advrecyclerview.swipeable.C23289c;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.utils.KeyboardUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerLinearLayout;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimeZoneItemData;
import com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimezoneAdapter;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.utils.TimeZoneUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0000*\u0002\b\f\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0002J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\b\u0010\u001e\u001a\u00020\u0015H\u0002J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\b\u0010 \u001a\u00020\u0015H\u0016J\b\u0010!\u001a\u00020\u0015H\u0002J\u0018\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u000fH\u0016J\b\u0010%\u001a\u00020\u0015H\u0016J\b\u0010&\u001a\u00020\u0015H\u0016J\b\u0010'\u001a\u00020\u0015H\u0016J\b\u0010(\u001a\u00020\u0015H\u0016J\b\u0010)\u001a\u00020\u0015H\u0016J\b\u0010*\u001a\u00020\u0015H\u0016J\b\u0010+\u001a\u00020\u0015H\u0016J\u0010\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;", "rootView", "Landroid/view/View;", "(Landroid/view/View;)V", "mRecentAdapter", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter;", "mRecentItemClickListener", "com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$mRecentItemClickListener$1", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$mRecentItemClickListener$1;", "mSearchAdapter", "mSearchItemClickListener", "com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$mSearchItemClickListener$1", "Lcom/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$mSearchItemClickListener$1;", "mViewAction", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewAction;", "mViewData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/ITimeZoneSelectorContract$IViewData;", "getRootView", "()Landroid/view/View;", "create", "", "destroy", "hideKeyboard", "initClearAllView", "initDeviceTimeZone", "initKeyboardSearch", "initRecentRecycleView", "initSearchEditText", "initSearchRecycleView", "modifyBackground", "modifyFontSize", "modifyForDesktop", "modifyTitleBar", "setDependency", "viewData", "viewAction", "showDeviceTimeZoneData", "showRecentTimeZoneData", "showRecentView", "showSearchNotData", "showSearchResultData", "showSearchView", "showSelectTimeZone", "showSelectedToast", "timeZoneTip", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j */
public final class TimeZoneSelectorView implements ITimeZoneSelectorContract.ITimeZoneSelectorView {

    /* renamed from: a */
    public ITimeZoneSelectorContract.IViewData f82778a;

    /* renamed from: b */
    public ITimeZoneSelectorContract.IViewAction f82779b;

    /* renamed from: c */
    public final TimezoneAdapter f82780c = new TimezoneAdapter();

    /* renamed from: d */
    private final TimezoneAdapter f82781d = new TimezoneAdapter();

    /* renamed from: e */
    private final C32342i f82782e = new C32342i(this);

    /* renamed from: f */
    private final C32343j f82783f = new C32343j(this);

    /* renamed from: g */
    private final View f82784g;

    /* renamed from: i */
    public final View mo118124i() {
        return this.f82784g;
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m123405j();
        m123407l();
        m123408m();
        m123409n();
        m123410o();
    }

    /* renamed from: k */
    private final void m123406k() {
        ((EditText) this.f82784g.findViewById(R.id.timeZoneSearchET)).setOnEditorActionListener(new C32336c(this));
    }

    /* renamed from: l */
    private final void m123407l() {
        ((RelativeLayout) this.f82784g.findViewById(R.id.deviceTimeZoneRL)).setOnClickListener(new View$OnClickListenerC32335b(this));
    }

    /* renamed from: m */
    private final void m123408m() {
        ((TextView) this.f82784g.findViewById(R.id.clearTimeZoneTv)).setOnClickListener(new View$OnClickListenerC32334a(this));
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        KeyboardUtils.hideKeyboard(this.f82784g.getContext(), (EditText) this.f82784g.findViewById(R.id.timeZoneSearchET));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: h */
    public void mo112514h() {
        KeyboardUtils.hideKeyboard(this.f82784g.getContext(), (EditText) this.f82784g.findViewById(R.id.timeZoneSearchET));
    }

    /* renamed from: o */
    private final void m123410o() {
        RecyclerView recyclerView = (RecyclerView) this.f82784g.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f82784g.getContext(), 1, false));
        this.f82781d.mo112489a(this.f82783f);
        RecyclerView recyclerView2 = (RecyclerView) this.f82784g.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.searchTimezoneRv");
        recyclerView2.setAdapter(this.f82781d);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: b */
    public void mo112508b() {
        ITimeZoneSelectorContract.IViewData dVar = this.f82778a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f82780c.mo112490a(dVar.mo112522b());
        if (this.f82780c.getItemCount() == 0) {
            LinearLayout linearLayout = (LinearLayout) this.f82784g.findViewById(R.id.recentTimeZoneTipLl);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.recentTimeZoneTipLl");
            linearLayout.setVisibility(8);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) this.f82784g.findViewById(R.id.recentTimeZoneTipLl);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.recentTimeZoneTipLl");
        linearLayout2.setVisibility(0);
    }

    /* renamed from: j */
    private final void m123405j() {
        ((EditText) this.f82784g.findViewById(R.id.timeZoneSearchET)).addTextChangedListener(new C32337d(this));
        ((TouchListenerLinearLayout) this.f82784g.findViewById(R.id.searchClickLl)).setTouchListener(new C32338e(this));
        ((ImageView) this.f82784g.findViewById(R.id.searchDeleteIV)).setOnClickListener(new View$OnClickListenerC32339f(this));
        ((TextView) this.f82784g.findViewById(R.id.searchCancelTV)).setOnClickListener(new View$OnClickListenerC32340g(this));
        ((RelativeLayout) this.f82784g.findViewById(R.id.searchConfirmZone)).setOnClickListener(new View$OnClickListenerC32341h(this));
        m123406k();
    }

    /* renamed from: n */
    private final void m123409n() {
        RecyclerView recyclerView = (RecyclerView) this.f82784g.findViewById(R.id.recentTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.recentTimezoneRv");
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f82784g.getContext(), 1, false));
        this.f82780c.mo112489a(this.f82782e);
        C23289c cVar = new C23289c();
        RecyclerView recyclerView2 = (RecyclerView) this.f82784g.findViewById(R.id.recentTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView2, "rootView.recentTimezoneRv");
        recyclerView2.setAdapter(cVar.mo80800a(this.f82780c));
        C23257e eVar = new C23257e();
        eVar.setSupportsChangeAnimations(false);
        RecyclerView recyclerView3 = (RecyclerView) this.f82784g.findViewById(R.id.recentTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView3, "rootView.recentTimezoneRv");
        recyclerView3.setItemAnimator(eVar);
        cVar.mo80804a((RecyclerView) this.f82784g.findViewById(R.id.recentTimezoneRv));
        C23260a aVar = new C23260a();
        aVar.mo80682b(true);
        aVar.mo80678a(true);
        aVar.mo80677a((RecyclerView) this.f82784g.findViewById(R.id.recentTimezoneRv));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: c */
    public void mo112509c() {
        ITimeZoneSelectorContract.IViewData dVar = this.f82778a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f82781d.mo112490a(dVar.mo112523c());
        LinearLayout linearLayout = (LinearLayout) this.f82784g.findViewById(R.id.noSearchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.noSearchResultZone");
        linearLayout.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) this.f82784g.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
        recyclerView.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f82784g.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.searchTzLoadingZone");
        linearLayout2.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f82784g.findViewById(R.id.searchConfirmZone);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
        relativeLayout.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: d */
    public void mo112510d() {
        LinearLayout linearLayout = (LinearLayout) this.f82784g.findViewById(R.id.noSearchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.noSearchResultZone");
        linearLayout.setVisibility(0);
        RecyclerView recyclerView = (RecyclerView) this.f82784g.findViewById(R.id.searchTimezoneRv);
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
        recyclerView.setVisibility(8);
        RelativeLayout relativeLayout = (RelativeLayout) this.f82784g.findViewById(R.id.searchConfirmZone);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
        relativeLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) this.f82784g.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.searchTzLoadingZone");
        linearLayout2.setVisibility(8);
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: e */
    public void mo112511e() {
        LinearLayout linearLayout = (LinearLayout) this.f82784g.findViewById(R.id.searchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchResultZone");
        linearLayout.setVisibility(8);
        LinearLayout linearLayout2 = (LinearLayout) this.f82784g.findViewById(R.id.timeZoneListZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.timeZoneListZone");
        linearLayout2.setVisibility(0);
        TextView textView = (TextView) this.f82784g.findViewById(R.id.searchCancelTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchCancelTV");
        textView.setVisibility(8);
        LinearLayout linearLayout3 = (LinearLayout) this.f82784g.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "rootView.searchTzLoadingZone");
        linearLayout3.setVisibility(8);
        KeyboardUtils.hideKeyboard(this.f82784g.getContext(), (EditText) this.f82784g.findViewById(R.id.timeZoneSearchET));
        ((EditText) this.f82784g.findViewById(R.id.timeZoneSearchET)).clearFocus();
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: f */
    public void mo112512f() {
        LinearLayout linearLayout = (LinearLayout) this.f82784g.findViewById(R.id.searchResultZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchResultZone");
        linearLayout.setVisibility(0);
        LinearLayout linearLayout2 = (LinearLayout) this.f82784g.findViewById(R.id.timeZoneListZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout2, "rootView.timeZoneListZone");
        linearLayout2.setVisibility(8);
        TextView textView = (TextView) this.f82784g.findViewById(R.id.searchCancelTV);
        Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchCancelTV");
        textView.setVisibility(0);
        LinearLayout linearLayout3 = (LinearLayout) this.f82784g.findViewById(R.id.searchTzLoadingZone);
        Intrinsics.checkExpressionValueIsNotNull(linearLayout3, "rootView.searchTzLoadingZone");
        linearLayout3.setVisibility(8);
        KeyboardUtils.showKeyboard((EditText) this.f82784g.findViewById(R.id.timeZoneSearchET));
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: g */
    public void mo112513g() {
        int i;
        ITimeZoneSelectorContract.IViewData dVar = this.f82778a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        TimeZoneItemData a = dVar.mo112521a();
        if (a != null) {
            ImageView imageView = (ImageView) this.f82784g.findViewById(R.id.selectedIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.selectedIcon");
            if (a.mo112476b()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        ITimeZoneSelectorContract.IViewData dVar2 = this.f82778a;
        if (dVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f82780c.mo112490a(dVar2.mo112522b());
        ITimeZoneSelectorContract.IViewData dVar3 = this.f82778a;
        if (dVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        this.f82781d.mo112490a(dVar3.mo112523c());
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: a */
    public void mo112506a() {
        ITimeZoneSelectorContract.IViewData dVar = this.f82778a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        TimeZoneItemData a = dVar.mo112521a();
        int i = 8;
        if (a != null) {
            TextView textView = (TextView) this.f82784g.findViewById(R.id.deviceTzNameTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.deviceTzNameTV");
            textView.setText(a.mo112479e());
            TextView textView2 = (TextView) this.f82784g.findViewById(R.id.deviceTzOffsetTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.deviceTzOffsetTV");
            textView2.setText(TimeZoneUtils.m125206a(a.mo112480f()));
            ImageView imageView = (ImageView) this.f82784g.findViewById(R.id.selectedIcon);
            Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.selectedIcon");
            if (a.mo112476b()) {
                i = 0;
            }
            imageView.setVisibility(i);
            RelativeLayout relativeLayout = (RelativeLayout) this.f82784g.findViewById(R.id.deviceTimeZoneRL);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.deviceTimeZoneRL");
            relativeLayout.setVisibility(0);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) this.f82784g.findViewById(R.id.deviceTimeZoneRL);
        Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.deviceTimeZoneRL");
        relativeLayout2.setVisibility(8);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J*\u0010\r\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$initSearchEditText$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "s", "", "start", "", "count", "after", "onTextChanged", "before", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$d */
    public static final class C32337d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82788a;

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32337d(TimeZoneSelectorView jVar) {
            this.f82788a = jVar;
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
                TextView textView = (TextView) this.f82788a.mo118124i().findViewById(R.id.searchTintTV);
                Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchTintTV");
                textView.setVisibility(0);
                ImageView imageView = (ImageView) this.f82788a.mo118124i().findViewById(R.id.searchDeleteIV);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "rootView.searchDeleteIV");
                imageView.setVisibility(8);
                RelativeLayout relativeLayout = (RelativeLayout) this.f82788a.mo118124i().findViewById(R.id.searchConfirmZone);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
                relativeLayout.setVisibility(8);
            } else {
                TextView textView2 = (TextView) this.f82788a.mo118124i().findViewById(R.id.searchTintTV);
                Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.searchTintTV");
                textView2.setVisibility(8);
                ImageView imageView2 = (ImageView) this.f82788a.mo118124i().findViewById(R.id.searchDeleteIV);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "rootView.searchDeleteIV");
                imageView2.setVisibility(0);
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f82788a.mo118124i().findViewById(R.id.searchConfirmZone);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout2, "rootView.searchConfirmZone");
                relativeLayout2.setVisibility(0);
            }
            TextView textView3 = (TextView) this.f82788a.mo118124i().findViewById(R.id.searchKeyTV);
            Intrinsics.checkExpressionValueIsNotNull(textView3, "rootView.searchKeyTV");
            textView3.setText(str2);
            LinearLayout linearLayout = (LinearLayout) this.f82788a.mo118124i().findViewById(R.id.noSearchResultZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.noSearchResultZone");
            linearLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f82788a.mo118124i().findViewById(R.id.searchTimezoneRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
            recyclerView.setVisibility(8);
            if (str == null) {
                TextView textView4 = (TextView) this.f82788a.mo118124i().findViewById(R.id.searchKeyTV);
                Intrinsics.checkExpressionValueIsNotNull(textView4, "rootView.searchKeyTV");
                textView4.setText("");
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f82788a.mo118124i().findViewById(R.id.searchConfirmZone);
                Intrinsics.checkExpressionValueIsNotNull(relativeLayout3, "rootView.searchConfirmZone");
                relativeLayout3.setVisibility(8);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$initSearchEditText$2", "Lcom/ss/android/lark/calendar/impl/features/arrange/arrangetime/widget/TouchListenerLinearLayout$TouchListener;", "onTouch", "", "ev", "Landroid/view/MotionEvent;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$e */
    public static final class C32338e implements TouchListenerLinearLayout.TouchListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82789a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32338e(TimeZoneSelectorView jVar) {
            this.f82789a = jVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.arrange.arrangetime.widget.TouchListenerLinearLayout.TouchListener
        /* renamed from: a */
        public void mo108575a(MotionEvent motionEvent) {
            Intrinsics.checkParameterIsNotNull(motionEvent, "ev");
            TimeZoneSelectorView.m123403a(this.f82789a).mo112515a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$mRecentItemClickListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$ItemClickListener;", "onBodyClick", "", "itemData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "onDeleteClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$i */
    public static final class C32342i implements TimezoneAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82793a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32342i(TimeZoneSelectorView jVar) {
            this.f82793a = jVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimezoneAdapter.ItemClickListener
        /* renamed from: a */
        public void mo112493a(TimeZoneItemData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "itemData");
            GeneralHitPoint.m124282y("recent");
            TimeZoneSelectorView.m123403a(this.f82793a).mo112519b(aVar.mo112478d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimezoneAdapter.ItemClickListener
        /* renamed from: b */
        public void mo112494b(TimeZoneItemData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "itemData");
            TimeZoneSelectorView.m123403a(this.f82793a).mo112520c(aVar.mo112478d());
            this.f82793a.f82780c.mo112487a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/search/calendar/TimeZoneSelectorView$mSearchItemClickListener$1", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimezoneAdapter$ItemClickListener;", "onBodyClick", "", "itemData", "Lcom/ss/android/lark/calendar/impl/features/calendarview/timezone/adapter/TimeZoneItemData;", "onDeleteClick", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$j */
    public static final class C32343j implements TimezoneAdapter.ItemClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82794a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32343j(TimeZoneSelectorView jVar) {
            this.f82794a = jVar;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimezoneAdapter.ItemClickListener
        /* renamed from: a */
        public void mo112493a(TimeZoneItemData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "itemData");
            GeneralHitPoint.m124265p();
            TimeZoneSelectorView.m123403a(this.f82794a).mo112519b(aVar.mo112478d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.adapter.TimezoneAdapter.ItemClickListener
        /* renamed from: b */
        public void mo112494b(TimeZoneItemData aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "itemData");
            TimeZoneSelectorView.m123403a(this.f82794a).mo112520c(aVar.mo112478d());
            this.f82794a.f82780c.mo112487a();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$g */
    public static final class View$OnClickListenerC32340g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82791a;

        View$OnClickListenerC32340g(TimeZoneSelectorView jVar) {
            this.f82791a = jVar;
        }

        public final void onClick(View view) {
            TimeZoneSelectorView.m123403a(this.f82791a).mo112518b();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ITimeZoneSelectorContract.IViewAction m123403a(TimeZoneSelectorView jVar) {
        ITimeZoneSelectorContract.IViewAction cVar = jVar.f82779b;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewAction");
        }
        return cVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ ITimeZoneSelectorContract.IViewData m123404b(TimeZoneSelectorView jVar) {
        ITimeZoneSelectorContract.IViewData dVar = jVar.f82778a;
        if (dVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewData");
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$b */
    public static final class View$OnClickListenerC32335b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82786a;

        View$OnClickListenerC32335b(TimeZoneSelectorView jVar) {
            this.f82786a = jVar;
        }

        public final void onClick(View view) {
            TimeZoneItemData a = TimeZoneSelectorView.m123404b(this.f82786a).mo112521a();
            if (a != null) {
                TimeZoneSelectorView.m123403a(this.f82786a).mo112519b(a.mo112478d());
                GeneralHitPoint.m124282y("device");
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$f */
    public static final class View$OnClickListenerC32339f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82790a;

        View$OnClickListenerC32339f(TimeZoneSelectorView jVar) {
            this.f82790a = jVar;
        }

        public final void onClick(View view) {
            ((EditText) this.f82790a.mo118124i().findViewById(R.id.timeZoneSearchET)).setText("");
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$a */
    public static final class View$OnClickListenerC32334a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82785a;

        View$OnClickListenerC32334a(TimeZoneSelectorView jVar) {
            this.f82785a = jVar;
        }

        public final void onClick(View view) {
            ArrayList<TimeZoneItemData> b = TimeZoneSelectorView.m123404b(this.f82785a).mo112522b();
            ArrayList<String> arrayList = new ArrayList<>();
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo112478d());
            }
            TimeZoneSelectorView.m123403a(this.f82785a).mo112517a(arrayList);
        }
    }

    public TimeZoneSelectorView(View view) {
        Intrinsics.checkParameterIsNotNull(view, "rootView");
        this.f82784g = view;
    }

    @Override // com.ss.android.lark.calendar.impl.features.calendarview.timezone.ITimeZoneSelectorContract.ITimeZoneSelectorView
    /* renamed from: a */
    public void mo112507a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "timeZoneTip");
        LKUIToast.show(this.f82784g.getContext(), str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$h */
    public static final class View$OnClickListenerC32341h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82792a;

        View$OnClickListenerC32341h(TimeZoneSelectorView jVar) {
            this.f82792a = jVar;
        }

        public final void onClick(View view) {
            ITimeZoneSelectorContract.IViewAction a = TimeZoneSelectorView.m123403a(this.f82792a);
            TextView textView = (TextView) this.f82792a.mo118124i().findViewById(R.id.searchKeyTV);
            Intrinsics.checkExpressionValueIsNotNull(textView, "rootView.searchKeyTV");
            a.mo112516a(textView.getText().toString());
            LinearLayout linearLayout = (LinearLayout) this.f82792a.mo118124i().findViewById(R.id.searchTzLoadingZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchTzLoadingZone");
            linearLayout.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) this.f82792a.mo118124i().findViewById(R.id.searchConfirmZone);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
            relativeLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f82792a.mo118124i().findViewById(R.id.searchTimezoneRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
            recyclerView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo109795a(ITimeZoneSelectorContract.IViewData dVar, ITimeZoneSelectorContract.IViewAction cVar) {
        Intrinsics.checkParameterIsNotNull(dVar, "viewData");
        Intrinsics.checkParameterIsNotNull(cVar, "viewAction");
        this.f82778a = dVar;
        this.f82779b = cVar;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.search.calendar.j$c */
    public static final class C32336c implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorView f82787a;

        C32336c(TimeZoneSelectorView jVar) {
            this.f82787a = jVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 3) {
                return false;
            }
            this.f82787a.mo112514h();
            ITimeZoneSelectorContract.IViewAction a = TimeZoneSelectorView.m123403a(this.f82787a);
            TextView textView2 = (TextView) this.f82787a.mo118124i().findViewById(R.id.searchKeyTV);
            Intrinsics.checkExpressionValueIsNotNull(textView2, "rootView.searchKeyTV");
            a.mo112516a(textView2.getText().toString());
            LinearLayout linearLayout = (LinearLayout) this.f82787a.mo118124i().findViewById(R.id.searchTzLoadingZone);
            Intrinsics.checkExpressionValueIsNotNull(linearLayout, "rootView.searchTzLoadingZone");
            linearLayout.setVisibility(0);
            RelativeLayout relativeLayout = (RelativeLayout) this.f82787a.mo118124i().findViewById(R.id.searchConfirmZone);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "rootView.searchConfirmZone");
            relativeLayout.setVisibility(8);
            RecyclerView recyclerView = (RecyclerView) this.f82787a.mo118124i().findViewById(R.id.searchTimezoneRv);
            Intrinsics.checkExpressionValueIsNotNull(recyclerView, "rootView.searchTimezoneRv");
            recyclerView.setVisibility(8);
            return true;
        }
    }
}
