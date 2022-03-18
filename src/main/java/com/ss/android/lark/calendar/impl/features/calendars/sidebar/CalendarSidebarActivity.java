package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.calendar.impl.features.calendars.CalendarLauncher;
import com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorActivity;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.ImportCalendarActivity;
import com.ss.android.lark.calendar.impl.features.calendars.importcalendar.widget.ExchangeLoginFragment;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract;
import com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout;
import com.ss.android.lark.calendar.impl.features.calendars.subscribe.CalendarSubscribeActivity;
import com.ss.android.lark.calendar.impl.features.common.helper.LargeCalendarTransmitHelper;
import com.ss.android.lark.calendar.impl.features.settings.account.AccountDataListItem;
import com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32501e;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.utils.ThirdPartAccountSPUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.eetroublecapture.AbstractC36982d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.StatusBarUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001d2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0016J\b\u0010,\u001a\u00020\"H\u0002J\u0012\u0010-\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001dH\u0002J\b\u0010.\u001a\u00020%H\u0002J\"\u0010/\u001a\u00020%2\u0006\u00100\u001a\u00020(2\u0006\u00101\u001a\u00020(2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u00020%H\u0016J\b\u00105\u001a\u00020%H\u0016J\u0012\u00106\u001a\u00020%2\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020%H\u0014J\u0010\u0010:\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001dH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u0004¢\u0006\u0002\n\u0000R*\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 j\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"`#X\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "Lcom/ss/android/lark/eetroublecapture/ICaptureCallback;", "()V", "mExchangeLoginFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/importcalendar/widget/ExchangeLoginFragment;", "mOneAccountManageDelegate", "com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$mOneAccountManageDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$mOneAccountManageDelegate$1;", "mOneAccountManageFragment", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment;", "mSelectorModel", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarModel;", "getMSelectorModel", "()Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarModel;", "mSelectorModel$delegate", "Lkotlin/Lazy;", "mSelectorPresenter", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter;", "getMSelectorPresenter", "()Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter;", "mSelectorPresenter$delegate", "mSelectorView", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView;", "getMSelectorView", "()Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView;", "mSelectorView$delegate", "showingFragments", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "thirdPartAccountSetting", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "addFragment", "", "fragment", "containerId", "", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "handleBackPressed", "hideFragment", "initScrollLayout", "onActivityResult", "requestCode", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCaptured", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showFragment", "Companion", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CalendarSidebarActivity extends CalendarBaseActivity implements AbstractC36982d {

    /* renamed from: d */
    public static final Companion f76382d = new Companion(null);

    /* renamed from: a */
    public OneAccountManageFragment f76383a;

    /* renamed from: b */
    public final HashMap<String, Boolean> f76384b = new HashMap<>();

    /* renamed from: c */
    public final C30543d f76385c;

    /* renamed from: e */
    private final Lazy f76386e = LazyKt.lazy(new C30547g(this));

    /* renamed from: f */
    private final Lazy f76387f = LazyKt.lazy(C30544e.INSTANCE);

    /* renamed from: g */
    private final ArrayList<Fragment> f76388g = new ArrayList<>();

    /* renamed from: h */
    private ExchangeLoginFragment f76389h;

    /* renamed from: i */
    private final Lazy f76390i;

    /* renamed from: j */
    private HashMap f76391j;

    /* renamed from: a */
    public Context mo110190a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f76391j == null) {
            this.f76391j = new HashMap();
        }
        View view = (View) this.f76391j.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76391j.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final CalendarSidebarView mo110191a() {
        return (CalendarSidebarView) this.f76386e.getValue();
    }

    /* renamed from: a */
    public void mo110192a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m113456a(this, context);
    }

    /* renamed from: b */
    public final CalendarSidebarModel mo110195b() {
        return (CalendarSidebarModel) this.f76387f.getValue();
    }

    /* renamed from: c */
    public final CalendarSidebarPresenter mo110197c() {
        return (CalendarSidebarPresenter) this.f76390i.getValue();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m113454a(this, configuration);
    }

    /* renamed from: d */
    public Resources mo110199d() {
        return super.getResources();
    }

    /* renamed from: e */
    public void mo110200e() {
        super.onStop();
    }

    /* renamed from: f */
    public AssetManager mo110201f() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m113459d(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m113457b(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m113458c(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$Companion;", "", "()V", "TAG", "", "startActivity", "", "context", "Landroid/content/Context;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$initScrollLayout$2", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/widget/SidebarScrollLayout$IScrollListener;", "onScrollOut", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$c */
    public static final class C30542c implements SidebarScrollLayout.IScrollListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarActivity f76394a;

        @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.widget.SidebarScrollLayout.IScrollListener
        /* renamed from: a */
        public void mo110205a() {
            CalendarSidebarActivity.super.onBackPressed();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30542c(CalendarSidebarActivity calendarSidebarActivity) {
            this.f76394a = calendarSidebarActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$e */
    static final class C30544e extends Lambda implements Function0<CalendarSidebarModel> {
        public static final C30544e INSTANCE = new C30544e();

        C30544e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSidebarModel invoke() {
            return new CalendarSidebarModel();
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

    @Override // com.ss.android.lark.eetroublecapture.AbstractC36982d
    /* renamed from: h */
    public void mo109394h() {
        mo110191a().mo110269g();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarPresenter;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$f */
    public static final class C30545f extends Lambda implements Function0<CalendarSidebarPresenter> {
        final /* synthetic */ CalendarSidebarActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30545f(CalendarSidebarActivity calendarSidebarActivity) {
            super(0);
            this.this$0 = calendarSidebarActivity;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e¸\u0006\u0000"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$mSelectorPresenter$2$1$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarContract$IFragmentDependency;", "getContext", "Landroid/content/Context;", "onGotoAccountManagePage", "", "accountItem", "Lcom/ss/android/lark/calendar/impl/features/settings/account/AccountDataListItem;", "onStartCalendarCreator", "targetCal", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onStartImportActivity", "onStartNewCalendarActivity", "onStartSubscribeActivity", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$f$a */
        public static final class C30546a implements CalendarSidebarContract.IFragmentDependency {

            /* renamed from: a */
            final /* synthetic */ C30545f f76396a;

            /* renamed from: d */
            public Context mo110211d() {
                Context baseContext = this.f76396a.this$0.getBaseContext();
                Intrinsics.checkExpressionValueIsNotNull(baseContext, "baseContext");
                return baseContext;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IFragmentDependency
            /* renamed from: b */
            public void mo110209b() {
                this.f76396a.this$0.startActivityForResult(new Intent(mo110211d(), CalendarSubscribeActivity.class), 3);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IFragmentDependency
            /* renamed from: c */
            public void mo110210c() {
                Intent intent = new Intent(mo110211d(), ImportCalendarActivity.class);
                intent.putExtra("sidebar", true);
                this.f76396a.this$0.startActivityForResult(intent, 4);
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IFragmentDependency
            /* renamed from: a */
            public void mo110206a() {
                if (C30022a.f74883b.mo112687A()) {
                    this.f76396a.this$0.startActivityForResult(CalendarLauncher.m112278a(this.f76396a.this$0, (String) null, "FIRST_FRAGMENT_OPEN_ANIM_NONE", 2, (Object) null), 1);
                    return;
                }
                Intent intent = new Intent(mo110211d(), CalendarCreatorActivity.class);
                intent.putExtra("serializable_from_type", "new_calendar_type");
                this.f76396a.this$0.startActivityForResult(intent, 1);
            }

            C30546a(C30545f fVar) {
                this.f76396a = fVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IFragmentDependency
            /* renamed from: a */
            public void mo110207a(AccountDataListItem aVar) {
                Intrinsics.checkParameterIsNotNull(aVar, "accountItem");
                OneAccountManageFragment bVar = this.f76396a.this$0.f76383a;
                if (bVar != null) {
                    bVar.mo118529a(aVar);
                    this.f76396a.this$0.mo110193a(bVar);
                    return;
                }
                OneAccountManageFragment bVar2 = new OneAccountManageFragment(this.f76396a.this$0.f76385c, aVar, this.f76396a.this$0.f76384b, true);
                FrameLayout frameLayout = (FrameLayout) this.f76396a.this$0.mo108509a(R.id.fragmentContainer);
                Intrinsics.checkExpressionValueIsNotNull(frameLayout, "fragmentContainer");
                this.f76396a.this$0.mo110194a(bVar2, frameLayout.getId());
                bVar2.mo118532c();
                this.f76396a.this$0.f76383a = bVar2;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarContract.IFragmentDependency
            /* renamed from: a */
            public void mo110208a(Calendar calendar) {
                Intrinsics.checkParameterIsNotNull(calendar, "targetCal");
                if (C30022a.f74883b.mo112687A()) {
                    CalendarSidebarActivity calendarSidebarActivity = this.f76396a.this$0;
                    CalendarSidebarActivity calendarSidebarActivity2 = this.f76396a.this$0;
                    String serverId = calendar.getServerId();
                    if (serverId == null) {
                        serverId = "";
                    }
                    calendarSidebarActivity.startActivityForResult(CalendarLauncher.m112280a(calendarSidebarActivity2, serverId, null, null, null, 28, null), 2);
                    return;
                }
                Intent intent = new Intent(mo110211d(), CalendarCreatorActivity.class);
                intent.putExtra("serializable_from_type", "manager_calendar_type");
                LargeCalendarTransmitHelper.m116180a(intent, calendar);
                this.f76396a.this$0.startActivityForResult(intent, 2);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSidebarPresenter invoke() {
            CalendarSidebarPresenter calendarSidebarPresenter = new CalendarSidebarPresenter(this.this$0.mo110191a(), this.this$0.mo110195b());
            calendarSidebarPresenter.mo110214a(new C30546a(this));
            return calendarSidebarPresenter;
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        mo110197c().destroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$mOneAccountManageDelegate$1", "Lcom/ss/android/lark/calendar/impl/features/settings/oneaccount/OneAccountManageFragment$Delegate;", "onClickFragmentBack", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$d */
    public static final class C30543d implements OneAccountManageFragment.Delegate {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarActivity f76395a;

        @Override // com.ss.android.lark.calendar.impl.features.settings.oneaccount.OneAccountManageFragment.Delegate
        /* renamed from: a */
        public void mo109788a() {
            CalendarSidebarActivity calendarSidebarActivity = this.f76395a;
            calendarSidebarActivity.mo110196b(calendarSidebarActivity.f76383a);
            this.f76395a.mo110197c().mo110216c();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30543d(CalendarSidebarActivity calendarSidebarActivity) {
            this.f76395a = calendarSidebarActivity;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$g */
    static final class C30547g extends Lambda implements Function0<CalendarSidebarView> {
        final /* synthetic */ CalendarSidebarActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30547g(CalendarSidebarActivity calendarSidebarActivity) {
            super(0);
            this.this$0 = calendarSidebarActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CalendarSidebarView invoke() {
            SidebarScrollLayout sidebarScrollLayout = (SidebarScrollLayout) this.this$0.mo108509a(R.id.sidebarRootView);
            Intrinsics.checkExpressionValueIsNotNull(sidebarScrollLayout, "sidebarRootView");
            return new CalendarSidebarView(sidebarScrollLayout);
        }
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        if (!m113461i()) {
            ((SidebarScrollLayout) mo108509a(R.id.sidebarRootView)).mo110278c();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSidebarActivity$initScrollLayout$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity$b */
    public static final class ViewTreeObserver$OnGlobalLayoutListenerC30541b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ CalendarSidebarActivity f76393a;

        public void onGlobalLayout() {
            ((SidebarScrollLayout) this.f76393a.mo108509a(R.id.sidebarRootView)).mo110277b();
            SidebarScrollLayout sidebarScrollLayout = (SidebarScrollLayout) this.f76393a.mo108509a(R.id.sidebarRootView);
            Intrinsics.checkExpressionValueIsNotNull(sidebarScrollLayout, "sidebarRootView");
            sidebarScrollLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        ViewTreeObserver$OnGlobalLayoutListenerC30541b(CalendarSidebarActivity calendarSidebarActivity) {
            this.f76393a = calendarSidebarActivity;
        }
    }

    /* renamed from: g */
    private final void m113460g() {
        SidebarScrollLayout sidebarScrollLayout = (SidebarScrollLayout) mo108509a(R.id.sidebarRootView);
        Intrinsics.checkExpressionValueIsNotNull(sidebarScrollLayout, "sidebarRootView");
        sidebarScrollLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC30541b(this));
        ((SidebarScrollLayout) mo108509a(R.id.sidebarRootView)).setScrollListener(new C30542c(this));
    }

    /* renamed from: i */
    private final boolean m113461i() {
        OneAccountManageFragment bVar = this.f76383a;
        boolean z = true;
        if (bVar != null && bVar.mo113714e()) {
            return true;
        }
        boolean z2 = false;
        OneAccountManageFragment bVar2 = this.f76383a;
        if (bVar2 != null && this.f76388g.contains(bVar2)) {
            mo110196b(this.f76383a);
            mo110197c().mo110216c();
            z2 = true;
        }
        ExchangeLoginFragment aVar = this.f76389h;
        if (aVar == null) {
            return z2;
        }
        if (this.f76388g.contains(aVar)) {
            mo110196b(this.f76389h);
        } else {
            z = z2;
        }
        return z;
    }

    public CalendarSidebarActivity() {
        ThirdPartAccountSPUtil.m125202a(new IGetDataCallback<HashMap<String, Boolean>>(this) {
            /* class com.ss.android.lark.calendar.impl.features.calendars.sidebar.CalendarSidebarActivity.C305401 */

            /* renamed from: a */
            final /* synthetic */ CalendarSidebarActivity f76392a;

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f76392a = r1;
            }

            /* renamed from: a */
            public void onSuccess(HashMap<String, Boolean> hashMap) {
                if (hashMap != null) {
                    Set<Map.Entry<String, Boolean>> entrySet = hashMap.entrySet();
                    Intrinsics.checkExpressionValueIsNotNull(entrySet, "settings.entries");
                    for (T t : entrySet) {
                        Object key = t.getKey();
                        Intrinsics.checkExpressionValueIsNotNull(key, "it.key");
                        Object value = t.getValue();
                        Intrinsics.checkExpressionValueIsNotNull(value, "it.value");
                        this.f76392a.f76384b.put(key, value);
                    }
                }
            }
        });
        this.f76385c = new C30543d(this);
        this.f76390i = LazyKt.lazy(new C30545f(this));
    }

    /* renamed from: b */
    public static Resources m113457b(CalendarSidebarActivity calendarSidebarActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSidebarActivity);
        }
        return calendarSidebarActivity.mo110199d();
    }

    /* renamed from: d */
    public static AssetManager m113459d(CalendarSidebarActivity calendarSidebarActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSidebarActivity);
        }
        return calendarSidebarActivity.mo110201f();
    }

    /* renamed from: c */
    public static void m113458c(CalendarSidebarActivity calendarSidebarActivity) {
        calendarSidebarActivity.mo110200e();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CalendarSidebarActivity calendarSidebarActivity2 = calendarSidebarActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    calendarSidebarActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo110196b(Fragment fragment) {
        if (fragment != null) {
            this.f76388g.remove(fragment);
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.activity_enter_from_bottom, R.anim.activity_close_to_bottom).hide(fragment).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
            ((SidebarScrollLayout) mo108509a(R.id.sidebarRootView)).setHandleMotion(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        CalendarSidebarActivity calendarSidebarActivity = this;
        StatusBarUtil.setTranslucentForImageView(calendarSidebarActivity, 0, null);
        setContentView(R.layout.activity_calendar_sidebar);
        mo110197c().create();
        mo110191a().mo110263a(calendarSidebarActivity);
        m113460g();
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        Bundle extras = intent.getExtras();
        if (!(extras == null || (string = extras.getString("calendar_id")) == null)) {
            CalendarSidebarPresenter c = mo110197c();
            Intrinsics.checkExpressionValueIsNotNull(string, "it");
            c.mo110215a(string);
        }
        C32501e.m124355a();
    }

    /* renamed from: a */
    public final void mo110193a(Fragment fragment) {
        if (!this.f76388g.contains(fragment)) {
            this.f76388g.add(fragment);
        }
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.activity_enter_from_bottom, R.anim.activity_close_to_bottom).show(fragment).commitAllowingStateLoss();
        getSupportFragmentManager().executePendingTransactions();
        ((SidebarScrollLayout) mo108509a(R.id.sidebarRootView)).setHandleMotion(false);
    }

    /* renamed from: a */
    public static void m113456a(CalendarSidebarActivity calendarSidebarActivity, Context context) {
        calendarSidebarActivity.mo110192a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(calendarSidebarActivity);
        }
    }

    /* renamed from: a */
    public static Context m113454a(CalendarSidebarActivity calendarSidebarActivity, Configuration configuration) {
        Context a = calendarSidebarActivity.mo110190a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public final void mo110194a(Fragment fragment, int i) {
        if (fragment != null) {
            if (!this.f76388g.contains(fragment)) {
                this.f76388g.add(fragment);
            }
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.activity_enter_from_bottom, R.anim.activity_close_to_bottom).add(i, fragment, (String) null).commitAllowingStateLoss();
            getSupportFragmentManager().executePendingTransactions();
            ((SidebarScrollLayout) mo108509a(R.id.sidebarRootView)).setHandleMotion(false);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        mo110197c().mo110213a(i, i2, intent);
    }
}
