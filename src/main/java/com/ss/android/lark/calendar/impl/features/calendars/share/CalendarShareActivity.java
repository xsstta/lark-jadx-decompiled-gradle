package com.ss.android.lark.calendar.impl.features.calendars.share;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1142af;
import androidx.lifecycle.AbstractC1178x;
import androidx.lifecycle.C1144ai;
import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.CalendarTenantInfo;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarMemberFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarShareOptionFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarShareQrCodeFragment;
import com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate;
import com.ss.android.lark.calendar.impl.features.calendars.share.picker.CalendarMemberPickerEntrance;
import com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareAvatarView;
import com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout;
import com.ss.android.lark.calendar.impl.features.events.detail.share.util.DialogStatusBarUtil;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseFragment;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.UIHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n*\u0003\f\u000f\u0012\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\u001bH\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u0012\u0010#\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010$\u001a\u00020\u001bH\u0002J\b\u0010%\u001a\u00020\u001bH\u0002J\b\u0010&\u001a\u00020\u001bH\u0002J\"\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020\u001bH\u0016J\u0012\u0010.\u001a\u00020\u001b2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020\u001bH\u0002J\b\u00102\u001a\u00020\u001bH\u0002J\u0010\u00103\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)H\u0002J\b\u00104\u001a\u00020\u001bH\u0002J\b\u00105\u001a\u00020\u001bH\u0002J\b\u00106\u001a\u00020\u001bH\u0002J\b\u00107\u001a\u00020\u001bH\u0002J\u0012\u00108\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0004\n\u0002\u0010\rR\u0010\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017¨\u0006:"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "currentShowFragment", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseFragment;", "mCalendarMemberFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment;", "mCalendarShareOptionFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareOptionFragment;", "mCalendarShareQrCodeFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment;", "mShareOptionDelegate", "com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$mShareOptionDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$mShareOptionDelegate$1;", "memberFragmentDelegate", "com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$memberFragmentDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$memberFragmentDelegate$1;", "shareQrCodeCallback", "com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$shareQrCodeCallback$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$shareQrCodeCallback$1;", "viewModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "getViewModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "copyCalendarUrl", "finishWithData", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "hideFragment", "initDragLayout", "initLiveData", "initView", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "refreshView", "refreshVisibilityContainer", "routeCalendarMemberPickerActivity", "routeCalendarShareOptionFragment", "showCalendarMemberFragment", "showCalendarShareOptionFragment", "showCalendarShareQrCodeFragment", "showFragment", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarShareActivity extends CalendarBaseActivity {

    /* renamed from: a */
    public static final Companion f76190a = new Companion(null);

    /* renamed from: b */
    private CalendarShareOptionFragment f76191b;

    /* renamed from: c */
    private CalendarShareQrCodeFragment f76192c;

    /* renamed from: d */
    private CalendarMemberFragment f76193d;

    /* renamed from: e */
    private CalendarBaseFragment f76194e;

    /* renamed from: f */
    private final Lazy f76195f = LazyKt.lazy(new C30451n(this));

    /* renamed from: g */
    private final C30449l f76196g = new C30449l(this);

    /* renamed from: h */
    private final C30450m f76197h = new C30450m(this);

    /* renamed from: i */
    private final C30448k f76198i = new C30448k(this);

    /* renamed from: j */
    private HashMap f76199j;

    /* renamed from: a */
    public Context mo109862a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f76199j == null) {
            this.f76199j = new HashMap();
        }
        View view = (View) this.f76199j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76199j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CalendarShareViewModel mo109863a() {
        return (CalendarShareViewModel) this.f76195f.getValue();
    }

    /* renamed from: a */
    public void mo109864a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m113167a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m113164a(this, configuration);
    }

    public AssetManager getAssets() {
        return m113170c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m113165a(this);
    }

    /* renamed from: h */
    public Resources mo109874h() {
        return super.getResources();
    }

    /* renamed from: i */
    public void mo109875i() {
        super.onStop();
    }

    /* renamed from: j */
    public AssetManager mo109876j() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m113169b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$Companion;", "", "()V", "ICON_WIDTH", "", "MEMBER_AVATAR_MAX_COUNT", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: c */
    public final void mo109867c() {
        m113175n();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$initDragLayout$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/widget/CalendarShareDragLayout$ShareDragListener;", "onDragOffset", "", "totalOffset", "", "currentOffset", "onHideAnimEnd", "onStartAnimEnd", "onStartAnimStart", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$b */
    public static final class C30437b implements CalendarShareDragLayout.ShareDragListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76200a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$b$b */
        static final class View$OnClickListenerC30439b implements View.OnClickListener {

            /* renamed from: a */
            public static final View$OnClickListenerC30439b f76202a = new View$OnClickListenerC30439b();

            View$OnClickListenerC30439b() {
            }

            public final void onClick(View view) {
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout.ShareDragListener
        /* renamed from: a */
        public void mo109877a() {
            this.f76200a.mo109872g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout.ShareDragListener
        /* renamed from: c */
        public void mo109880c() {
            this.f76200a.mo108509a(R.id.shadowView).setOnClickListener(new View$OnClickListenerC30438a(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout.ShareDragListener
        /* renamed from: b */
        public void mo109879b() {
            CalendarShareDragLayout calendarShareDragLayout = (CalendarShareDragLayout) this.f76200a.mo108509a(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(calendarShareDragLayout, "dragLayout");
            calendarShareDragLayout.setVisibility(0);
            this.f76200a.mo108509a(R.id.shadowView).setOnClickListener(View$OnClickListenerC30439b.f76202a);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30437b(CalendarShareActivity calendarShareActivity) {
            this.f76200a = calendarShareActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$b$a */
        static final class View$OnClickListenerC30438a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C30437b f76201a;

            View$OnClickListenerC30438a(C30437b bVar) {
                this.f76201a = bVar;
            }

            public final void onClick(View view) {
                ((CalendarShareDragLayout) this.f76201a.f76200a.mo108509a(R.id.dragLayout)).mo110175b();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.widget.CalendarShareDragLayout.ShareDragListener
        /* renamed from: a */
        public void mo109878a(float f, float f2) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                View a = this.f76200a.mo108509a(R.id.shadowView);
                Intrinsics.checkExpressionValueIsNotNull(a, "shadowView");
                a.setAlpha(0.3f);
                return;
            }
            View a2 = this.f76200a.mo108509a(R.id.shadowView);
            Intrinsics.checkExpressionValueIsNotNull(a2, "shadowView");
            a2.setAlpha(((f - f2) / f) * 0.3f);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$mShareOptionDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/listener/IShareOptionDelegate;", "onBackPressed", "", "onEditCalendarShareOptions", "newShareOptions", "Lcom/bytedance/lark/pb/calendar/v1/Calendar$CalendarShareOptions;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$k */
    public static final class C30448k implements IShareOptionDelegate {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76211a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate
        /* renamed from: a */
        public void mo109364a() {
            this.f76211a.onBackPressed();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30448k(CalendarShareActivity calendarShareActivity) {
            this.f76211a = calendarShareActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.listener.IShareOptionDelegate
        /* renamed from: a */
        public void mo109365a(Calendar.CalendarShareOptions calendarShareOptions) {
            Intrinsics.checkParameterIsNotNull(calendarShareOptions, "newShareOptions");
            this.f76211a.mo109863a().onEditCalendarShareOptions(calendarShareOptions);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$memberFragmentDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarMemberFragment$MemberDelegate;", "onBackPressed", "", "routeCalendarPickerActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$l */
    public static final class C30449l implements CalendarMemberFragment.MemberDelegate {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76212a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarMemberFragment.MemberDelegate
        /* renamed from: a */
        public void mo109891a() {
            this.f76212a.onBackPressed();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarMemberFragment.MemberDelegate
        /* renamed from: b */
        public void mo109892b() {
            this.f76212a.mo109866b(1012);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30449l(CalendarShareActivity calendarShareActivity) {
            this.f76212a = calendarShareActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$shareQrCodeCallback$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/fragment/CalendarShareQrCodeFragment$ShareQrCodeCallback;", "onBackPressed", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$m */
    public static final class C30450m implements CalendarShareQrCodeFragment.ShareQrCodeCallback {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76213a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.share.fragment.CalendarShareQrCodeFragment.ShareQrCodeCallback
        /* renamed from: a */
        public void mo109893a() {
            this.f76213a.onBackPressed();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30450m(CalendarShareActivity calendarShareActivity) {
            this.f76213a = calendarShareActivity;
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_HOLD);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareViewModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$n */
    static final class C30451n extends Lambda implements Function0<CalendarShareViewModel> {
        final /* synthetic */ CalendarShareActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30451n(CalendarShareActivity calendarShareActivity) {
            super(0);
            this.this$0 = calendarShareActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarShareViewModel invoke() {
            return (CalendarShareViewModel) new C1144ai(this.this$0, new C1144ai.AbstractC1146b(this) {
                /* class com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity.C30451n.C304521 */

                /* renamed from: a */
                final /* synthetic */ C30451n f76214a;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f76214a = r1;
                }

                @Override // androidx.lifecycle.C1144ai.AbstractC1146b
                public <T extends AbstractC1142af> T create(Class<T> cls) {
                    Intrinsics.checkParameterIsNotNull(cls, "modelClass");
                    CalendarShareViewModel bVar = new CalendarShareViewModel();
                    Intent intent = this.f76214a.this$0.getIntent();
                    Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
                    bVar.init(intent.getExtras());
                    return bVar;
                }
            }).mo6005a(CalendarShareViewModel.class);
        }
    }

    /* renamed from: g */
    public final void mo109872g() {
        Intent intent = new Intent();
        intent.putExtra("key_param_calendar_with_members_data", mo109863a().getCurrentCalendarWithMembers());
        setResult(-1, intent);
        finish();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivity$initDragLayout$2", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$c */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC30440c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76203a;

        public void onGlobalLayout() {
            ((CalendarShareDragLayout) this.f76203a.mo108509a(R.id.dragLayout)).mo110174a();
            CalendarShareDragLayout calendarShareDragLayout = (CalendarShareDragLayout) this.f76203a.mo108509a(R.id.dragLayout);
            Intrinsics.checkExpressionValueIsNotNull(calendarShareDragLayout, "dragLayout");
            calendarShareDragLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC30440c(CalendarShareActivity calendarShareActivity) {
            this.f76203a = calendarShareActivity;
        }
    }

    /* renamed from: k */
    private final void m113172k() {
        CalendarShareActivity calendarShareActivity = this;
        mo109863a().getCalendarMemberLiveData().mo5923a(calendarShareActivity, new C30441d(this));
        mo109863a().getCalendarLiveData().mo5923a(calendarShareActivity, new C30442e(this));
    }

    /* renamed from: d */
    public final void mo109869d() {
        boolean z;
        Calendar calendar = mo109863a().getCalendar();
        if (calendar != null) {
            Boolean bool = calendar.is_all_staff;
            Intrinsics.checkExpressionValueIsNotNull(bool, "calendar.is_all_staff");
            if (bool.booleanValue()) {
                UDToast.show(this, (int) R.string.Calendar_Share_UnableChangePermissionsForAllStaff);
                return;
            }
            m113176o();
            String str = calendar.server_id;
            if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
                z = true;
            } else {
                z = false;
            }
            C32502i.m124378a(str, z, "default_access");
        }
    }

    /* renamed from: e */
    public final void mo109870e() {
        boolean z;
        CalendarMemberFragment eVar = this.f76193d;
        if (eVar != null) {
            m113168b(eVar);
        } else {
            CalendarMemberFragment a = CalendarMemberFragment.f76280c.mo109992a(this.f76196g);
            this.f76193d = a;
            m113166a(a);
        }
        this.f76194e = this.f76193d;
        Calendar calendar = mo109863a().getCalendar();
        if (calendar != null) {
            String str = calendar.server_id;
            if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
                z = true;
            } else {
                z = false;
            }
            C32502i.m124378a(str, z, "subscribers");
        }
    }

    /* renamed from: m */
    private final void m113174m() {
        View a = mo108509a(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(a, "shadowView");
        a.setBackground(new ColorDrawable(UIHelper.getColor(R.color.lkui_N900)));
        View a2 = mo108509a(R.id.shadowView);
        Intrinsics.checkExpressionValueIsNotNull(a2, "shadowView");
        a2.setAlpha(0.3f);
        ((CalendarShareDragLayout) mo108509a(R.id.dragLayout)).setShareDragListener(new C30437b(this));
        CalendarShareDragLayout calendarShareDragLayout = (CalendarShareDragLayout) mo108509a(R.id.dragLayout);
        Intrinsics.checkExpressionValueIsNotNull(calendarShareDragLayout, "dragLayout");
        calendarShareDragLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC30440c(this));
    }

    /* renamed from: o */
    private final void m113176o() {
        Calendar b = mo109863a().getCalendarLiveData().mo5927b();
        if (b != null && b.share_options != null) {
            CalendarShareOptionFragment fVar = this.f76191b;
            if (fVar != null) {
                fVar.mo109997c();
                m113168b(fVar);
            } else {
                CalendarShareOptionFragment a = CalendarShareOptionFragment.f76294c.mo110001a(mo109863a().getIShareOptionFragmentData(), this.f76198i);
                this.f76191b = a;
                m113166a(a);
            }
            this.f76194e = this.f76191b;
        }
    }

    /* renamed from: f */
    public final void mo109871f() {
        boolean z;
        Calendar calendar = mo109863a().getCalendar();
        if (calendar != null) {
            CalendarShareQrCodeFragment hVar = this.f76192c;
            if (hVar != null) {
                hVar.mo110010f();
                m113168b(hVar);
            } else {
                CalendarShareQrCodeFragment a = CalendarShareQrCodeFragment.f76306c.mo110012a(this.f76197h);
                this.f76192c = a;
                m113166a(a);
            }
            this.f76194e = this.f76192c;
            String str = calendar.server_id;
            if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
                z = true;
            } else {
                z = false;
            }
            C32502i.m124378a(str, z, "qr_code");
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        CalendarBaseFragment aVar = this.f76194e;
        if (aVar instanceof CalendarShareQrCodeFragment) {
            m113171c(aVar);
        } else if (aVar instanceof CalendarShareOptionFragment) {
            if (!((CalendarShareOptionFragment) aVar).mo109999e()) {
                m113171c(aVar);
            }
        } else if (!(aVar instanceof CalendarMemberFragment)) {
            ((CalendarShareDragLayout) mo108509a(R.id.dragLayout)).mo110175b();
        } else if (!((CalendarMemberFragment) aVar).mo109991d()) {
            m113171c(aVar);
        }
    }

    /* renamed from: l */
    private final void m113173l() {
        TextPaint paint;
        DialogStatusBarUtil.f79499a.mo113950a(getWindow());
        TextView textView = (TextView) mo108509a(R.id.shareTopTipTv);
        if (!(textView == null || (paint = textView.getPaint()) == null)) {
            paint.setFakeBoldText(true);
        }
        m113174m();
        ((LinearLayout) mo108509a(R.id.searchMemberContainer)).setOnClickListener(new View$OnClickListenerC30443f(this));
        ((RelativeLayout) mo108509a(R.id.calendarVisibilityContainer)).setOnClickListener(new View$OnClickListenerC30444g(this));
        ((ImageView) mo108509a(R.id.viewQrCodeIv)).setOnClickListener(new View$OnClickListenerC30445h(this));
        ((ImageView) mo108509a(R.id.copyLinkIv)).setOnClickListener(new View$OnClickListenerC30446i(this));
        ((RelativeLayout) mo108509a(R.id.calendarShareMemberContainer)).setOnClickListener(new View$OnClickListenerC30447j(this));
    }

    /* renamed from: n */
    private final void m113175n() {
        int i;
        Drawable mutate;
        Drawable mutate2;
        Calendar calendar = mo109863a().getCalendar();
        if (calendar != null) {
            if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
                i = 0;
            } else {
                i = 8;
            }
            RelativeLayout relativeLayout = (RelativeLayout) mo108509a(R.id.calendarVisibilityContainer);
            Intrinsics.checkExpressionValueIsNotNull(relativeLayout, "calendarVisibilityContainer");
            relativeLayout.setVisibility(i);
            Boolean bool = calendar.is_all_staff;
            Intrinsics.checkExpressionValueIsNotNull(bool, "isAllStaff");
            if (bool.booleanValue()) {
                ImageView imageView = (ImageView) mo108509a(R.id.sharePermissionIv);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "sharePermissionIv");
                Drawable background = imageView.getBackground();
                if (!(background == null || (mutate2 = background.mutate()) == null)) {
                    mutate2.setTint(C32634ae.m125178a(R.color.icon_disable));
                }
                ((TextView) mo108509a(R.id.sharePermissionTv)).setTextColor(C32634ae.m125178a(R.color.text_disable));
                ImageView imageView2 = (ImageView) mo108509a(R.id.sharePermissionArrow);
                Intrinsics.checkExpressionValueIsNotNull(imageView2, "sharePermissionArrow");
                imageView2.setVisibility(8);
                return;
            }
            ImageView imageView3 = (ImageView) mo108509a(R.id.sharePermissionIv);
            Intrinsics.checkExpressionValueIsNotNull(imageView3, "sharePermissionIv");
            Drawable background2 = imageView3.getBackground();
            if (!(background2 == null || (mutate = background2.mutate()) == null)) {
                mutate.setTint(C32634ae.m125178a(R.color.icon_n1));
            }
            ((TextView) mo108509a(R.id.sharePermissionTv)).setTextColor(C32634ae.m125178a(R.color.text_title));
            ImageView imageView4 = (ImageView) mo108509a(R.id.sharePermissionArrow);
            Intrinsics.checkExpressionValueIsNotNull(imageView4, "sharePermissionArrow");
            imageView4.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo109865b() {
        boolean z;
        String calendarUrl = mo109863a().getCalendarUrl();
        Object systemService = getSystemService("clipboard");
        Calendar.AccessRole accessRole = null;
        if (!(systemService instanceof ClipboardManager)) {
            systemService = null;
        }
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, calendarUrl));
        }
        boolean z2 = true;
        if (calendarUrl.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            UDToast.show(this, (int) R.string.Calendar_Share_UnableToCopy);
        } else {
            UDToast.show(this, (int) R.string.Calendar_Share_LinkCopied);
        }
        String calendarId = mo109863a().getCalendarId();
        Calendar calendar = mo109863a().getCalendar();
        if (calendar != null) {
            accessRole = calendar.self_access_role;
        }
        if (accessRole != Calendar.AccessRole.OWNER) {
            z2 = false;
        }
        C32502i.m124378a(calendarId, z2, "copy_link");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$f */
    public static final class View$OnClickListenerC30443f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76206a;

        View$OnClickListenerC30443f(CalendarShareActivity calendarShareActivity) {
            this.f76206a = calendarShareActivity;
        }

        public final void onClick(View view) {
            this.f76206a.mo109866b(2);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$g */
    public static final class View$OnClickListenerC30444g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76207a;

        View$OnClickListenerC30444g(CalendarShareActivity calendarShareActivity) {
            this.f76207a = calendarShareActivity;
        }

        public final void onClick(View view) {
            this.f76207a.mo109869d();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$h */
    public static final class View$OnClickListenerC30445h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76208a;

        View$OnClickListenerC30445h(CalendarShareActivity calendarShareActivity) {
            this.f76208a = calendarShareActivity;
        }

        public final void onClick(View view) {
            this.f76208a.mo109871f();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$i */
    public static final class View$OnClickListenerC30446i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76209a;

        View$OnClickListenerC30446i(CalendarShareActivity calendarShareActivity) {
            this.f76209a = calendarShareActivity;
        }

        public final void onClick(View view) {
            this.f76209a.mo109865b();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$j */
    public static final class View$OnClickListenerC30447j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76210a;

        View$OnClickListenerC30447j(CalendarShareActivity calendarShareActivity) {
            this.f76210a = calendarShareActivity;
        }

        public final void onClick(View view) {
            this.f76210a.mo109870e();
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "Lcom/bytedance/lark/pb/calendar/v1/CalendarMember;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$d */
    public static final class C30441d<T> implements AbstractC1178x<List<CalendarMember>> {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76204a;

        C30441d(CalendarShareActivity calendarShareActivity) {
            this.f76204a = calendarShareActivity;
        }

        /* renamed from: a */
        public final void onChanged(List<CalendarMember> list) {
            Intrinsics.checkExpressionValueIsNotNull(list, "it");
            ((CalendarShareAvatarView) this.f76204a.mo108509a(R.id.calendar_share_members)).mo110173a(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/bytedance/lark/pb/calendar/v1/Calendar;", "kotlin.jvm.PlatformType", "onChanged"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.CalendarShareActivity$e */
    public static final class C30442e<T> implements AbstractC1178x<Calendar> {

        /* renamed from: a */
        final /* synthetic */ CalendarShareActivity f76205a;

        C30442e(CalendarShareActivity calendarShareActivity) {
            this.f76205a = calendarShareActivity;
        }

        /* renamed from: a */
        public final void onChanged(Calendar calendar) {
            boolean z;
            this.f76205a.mo109867c();
            String str = calendar.server_id;
            if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
                z = true;
            } else {
                z = false;
            }
            C32502i.m124377a(str, z);
        }
    }

    /* renamed from: a */
    public static Resources m113165a(CalendarShareActivity calendarShareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarShareActivity);
        }
        return calendarShareActivity.mo109874h();
    }

    /* renamed from: c */
    public static AssetManager m113170c(CalendarShareActivity calendarShareActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarShareActivity);
        }
        return calendarShareActivity.mo109876j();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_calendar_share_layout);
        m113173l();
        m113172k();
        mo109863a().create();
    }

    /* renamed from: b */
    private final void m113168b(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).show(fragment).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: c */
    private final void m113171c(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).hide(fragment).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
            this.f76194e = null;
        }
    }

    /* renamed from: a */
    private final void m113166a(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_right_in, R.anim.slide_right_out).add(R.id.fragmentContainer, fragment, (String) null).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
        }
    }

    /* renamed from: b */
    public static void m113169b(CalendarShareActivity calendarShareActivity) {
        calendarShareActivity.mo109875i();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarShareActivity calendarShareActivity2 = calendarShareActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarShareActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo109866b(int i) {
        String str;
        ArrayList arrayList;
        boolean z;
        String str2;
        Calendar calendar = mo109863a().getCalendar();
        if (calendar != null) {
            CalendarTenantInfo b = mo109863a().getCalendarTenantInfo().mo5927b();
            if (b != null) {
                str = b.tenant_id;
            } else {
                str = null;
            }
            List<CalendarMember> b2 = mo109863a().getCalendarMemberLiveData().mo5927b();
            if (b2 != null) {
                List<CalendarMember> list = b2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (T t : list) {
                    String str3 = "";
                    if (t.member_type == CalendarMember.CalendarMemberType.GROUP) {
                        str2 = t.chat_id;
                        if (str2 == null) {
                            arrayList2.add(str3);
                        }
                    } else {
                        str2 = t.user_id;
                        if (str2 == null) {
                            arrayList2.add(str3);
                        }
                    }
                    str3 = str2;
                    arrayList2.add(str3);
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            CalendarMemberPickerEntrance.m113431a(CalendarMemberPickerEntrance.f76372a, this, calendar, str, arrayList, null, false, i, 48, null);
            String str4 = calendar.server_id;
            if (calendar.self_access_role == Calendar.AccessRole.OWNER) {
                z = true;
            } else {
                z = false;
            }
            C32502i.m124378a(str4, z, "add");
        }
    }

    /* renamed from: a */
    public static void m113167a(CalendarShareActivity calendarShareActivity, Context context) {
        calendarShareActivity.mo109864a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarShareActivity);
        }
    }

    /* renamed from: a */
    public static Context m113164a(CalendarShareActivity calendarShareActivity, Configuration configuration) {
        Context a = calendarShareActivity.mo109862a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Serializable serializable = null;
            if (i != 2) {
                if (i == 1012 && intent != null) {
                    Serializable serializableExtra = intent.getSerializableExtra("key_param_calendar_member_list");
                    if (serializableExtra instanceof ArrayList) {
                        serializable = serializableExtra;
                    }
                    ArrayList<CalendarMember> arrayList = (ArrayList) serializable;
                    if (arrayList != null) {
                        mo109863a().onAddCalendarMember(arrayList);
                    }
                }
            } else if (intent != null) {
                Serializable serializableExtra2 = intent.getSerializableExtra("key_param_calendar_member_list");
                if (serializableExtra2 instanceof ArrayList) {
                    serializable = serializableExtra2;
                }
                ArrayList<CalendarMember> arrayList2 = (ArrayList) serializable;
                if (arrayList2 != null) {
                    mo109863a().onAddCalendarMember(arrayList2);
                }
                mo109872g();
            }
        }
    }
}
