package com.ss.android.lark.calendar.impl.features.events.edit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter;
import com.ss.android.lark.calendar.impl.features.meetingroom.profile.MeetingRoomProfileActivityEntrance;
import com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity;
import com.ss.android.lark.calendar.impl.framework.hitpoint.appreciable.AppreciableHitPoint;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32671v;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\"\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u001dH\u0016J\u0012\u0010&\u001a\u00020\u001d2\b\u0010'\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010(\u001a\u00020\u001dH\u0014J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020$H\u0014J\b\u0010+\u001a\u00020\u001dH\u0014J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u0013H\u0014J\b\u0010.\u001a\u00020\u001dH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/EditActivity;", "Lcom/ss/android/lark/calendar/impl/framework/components/CalendarBaseActivity;", "()V", "activityDependency", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditPresenter$ActivityDependency;", "mEditModel", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel;", "getMEditModel", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel;", "mEditModel$delegate", "Lkotlin/Lazy;", "mEditPresenter", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditPresenter;", "mEditView", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView;", "getMEditView", "()Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView;", "mEditView$delegate", "mExtras", "Landroid/os/Bundle;", "mSaveStates", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initActivityDependency", "", "initMVP", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "onDestroy", "onNewIntent", "intent", "onResume", "onSaveInstanceState", "outState", "onStop", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
public class EditActivity extends CalendarBaseActivity {

    /* renamed from: a */
    public Bundle f79825a;

    /* renamed from: b */
    public Bundle f79826b;

    /* renamed from: c */
    private EditPresenter.ActivityDependency f79827c;

    /* renamed from: d */
    private final Lazy f79828d = LazyKt.lazy(new C31502c(this));

    /* renamed from: e */
    private final Lazy f79829e = LazyKt.lazy(new C31501b(this));

    /* renamed from: f */
    private EditPresenter f79830f;

    /* renamed from: g */
    private HashMap f79831g;

    /* renamed from: a */
    private final EditView mo114263a() {
        return (EditView) this.f79828d.getValue();
    }

    /* renamed from: b */
    private final EditModel mo114265b() {
        return (EditModel) this.f79829e.getValue();
    }

    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity
    /* renamed from: a */
    public View mo108509a(int i) {
        if (this.f79831g == null) {
            this.f79831g = new HashMap();
        }
        View view = (View) this.f79831g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79831g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\"\u0010\u000e\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J0\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\"\u0010\u001d\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u001e"}, d2 = {"com/ss/android/lark/calendar/impl/features/events/edit/EditActivity$initActivityDependency$1", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditPresenter$ActivityDependency;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "enterAnimation", "outAnimation", "finishActivity", "getActivity", "Landroid/app/Activity;", "hideEditTextKeyBoard", "hideFragment", "routeMeetingRoomActivity", "calendarId", "", "startTime", "", "endTime", "timeZoneId", "repeatRule", "setActivityResult", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "setResultCode", "showEditTextKeyBoard", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditActivity$a */
    public static final class C31500a implements EditPresenter.ActivityDependency {

        /* renamed from: a */
        final /* synthetic */ EditActivity f79832a;

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: a */
        public void mo114273a() {
            this.f79832a.finish();
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: b */
        public Activity mo114279b() {
            return this.f79832a;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: c */
        public void mo114281c() {
            EditActivity editActivity = this.f79832a;
            C32671v.m125366b(editActivity, editActivity.getCurrentFocus());
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: d */
        public void mo114282d() {
            EditActivity editActivity = this.f79832a;
            C32671v.m125365a(editActivity, editActivity.getCurrentFocus());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31500a(EditActivity editActivity) {
            this.f79832a = editActivity;
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: a */
        public void mo114274a(int i) {
            this.f79832a.setResult(i);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: a */
        public void mo114275a(int i, Intent intent) {
            Intrinsics.checkParameterIsNotNull(intent, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            this.f79832a.setResult(i, intent);
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: a */
        public void mo114276a(Fragment fragment, int i, int i2) {
            if (fragment != null) {
                this.f79832a.getSupportFragmentManager().beginTransaction().setCustomAnimations(i, i2).show(fragment).commitAllowingStateLoss();
                this.f79832a.getSupportFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: b */
        public void mo114280b(Fragment fragment, int i, int i2) {
            if (fragment != null) {
                this.f79832a.getSupportFragmentManager().beginTransaction().setCustomAnimations(i, i2).hide(fragment).commitAllowingStateLoss();
                this.f79832a.getSupportFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: a */
        public void mo114277a(Fragment fragment, int i, int i2, int i3) {
            if (fragment != null) {
                this.f79832a.getSupportFragmentManager().beginTransaction().setCustomAnimations(i2, i3).add(i, fragment, (String) null).commitAllowingStateLoss();
                this.f79832a.getSupportFragmentManager().executePendingTransactions();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.events.edit.EditPresenter.ActivityDependency
        /* renamed from: a */
        public void mo114278a(String str, long j, long j2, String str2, String str3) {
            Intrinsics.checkParameterIsNotNull(str, "calendarId");
            Intrinsics.checkParameterIsNotNull(str2, "timeZoneId");
            Intrinsics.checkParameterIsNotNull(str3, "repeatRule");
            MeetingRoomProfileActivityEntrance.f82147a.mo117233a(this.f79832a, str, j, j2, str2, str3);
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditModel;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditActivity$b */
    static final class C31501b extends Lambda implements Function0<EditModel> {
        final /* synthetic */ EditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31501b(EditActivity editActivity) {
            super(0);
            this.this$0 = editActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EditModel invoke() {
            return new EditModel(this.this$0.f79825a, this.this$0.f79826b);
        }
    }

    /* renamed from: c */
    private final void mo114266c() {
        this.f79827c = new C31500a(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        EditPresenter hVar = this.f79830f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.mo116109h();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        super.onDestroy();
        EditPresenter hVar = this.f79830f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.destroy();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        super.onStop();
        EditPresenter hVar = this.f79830f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.mo116104c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/calendar/impl/features/events/edit/EditView;", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.EditActivity$c */
    static final class C31502c extends Lambda implements Function0<EditView> {
        final /* synthetic */ EditActivity this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31502c(EditActivity editActivity) {
            super(0);
            this.this$0 = editActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final EditView invoke() {
            FrameLayout frameLayout = (FrameLayout) this.this$0.mo108509a(R.id.editActivityRoot);
            Intrinsics.checkExpressionValueIsNotNull(frameLayout, "editActivityRoot");
            return new EditView(frameLayout);
        }
    }

    /* renamed from: d */
    private final void m118498d() {
        EditView a = mo114263a();
        EditModel b = mo114265b();
        EditPresenter.ActivityDependency aVar = this.f79827c;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityDependency");
        }
        EditPresenter hVar = new EditPresenter(a, b, aVar);
        this.f79830f = hVar;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.create();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.calendar.impl.framework.components.CalendarBaseActivity, androidx.fragment.app.FragmentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onResume() {
        super.onResume();
        EditPresenter hVar = this.f79830f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.mo116105d();
        if (mo114265b().mo114503n()) {
            AppreciableHitPoint.f83321a.mo118691h();
        } else {
            AppreciableHitPoint.f83321a.mo118694j();
        }
    }

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkParameterIsNotNull(intent, "intent");
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(bundle, "outState");
        EditPresenter hVar = this.f79830f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.mo116094a(bundle);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.calendar_activity_edit);
        Intent intent = getIntent();
        Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
        this.f79825a = intent.getExtras();
        this.f79826b = bundle;
        mo114266c();
        m118498d();
        Window window = getWindow();
        Intrinsics.checkExpressionValueIsNotNull(window, "this.window");
        window.getDecorView().setBackgroundColor(C32634ae.m125178a(R.color.bg_base));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        EditPresenter hVar = this.f79830f;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mEditPresenter");
        }
        hVar.mo116097a(i, i2, intent);
    }
}
