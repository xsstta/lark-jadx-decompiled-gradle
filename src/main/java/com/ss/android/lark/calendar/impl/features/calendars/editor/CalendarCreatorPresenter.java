package com.ss.android.lark.calendar.impl.features.calendars.editor;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract;
import com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarColorFragment;
import com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarCreatorBaseFragment;
import com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarDescriptionFragment;
import com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarMemberFragment;
import com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarVisibilityFragment;
import com.ss.android.lark.calendar.impl.features.common.helper.CalendarLogHelper;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarChatterPickerActivity;
import com.ss.android.lark.calendar.impl.features.common.widget.chatterpicker.CalendarPickerEntranceParams;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event.GeneralHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.event2.CalendarSettingHitPoint;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32500a;
import com.ss.android.lark.calendar.impl.p1437b.p1438a.C30076a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarMember;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30026d;
import com.ss.android.lark.log.Log;
import com.tt.frontendapiinterface.ApiHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0004CDEFB\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u0004H\u0014J\u0018\u00102\u001a\u0002002\u000e\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u000104H\u0002J\b\u00106\u001a\u000200H\u0002J\b\u00107\u001a\u000200H\u0002J \u00108\u001a\u0002002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\b\u0010<\u001a\u0004\u0018\u00010=J\u0006\u0010>\u001a\u000200J\u0006\u0010?\u001a\u000200J\u0010\u0010@\u001a\u0002002\u0006\u0010A\u001a\u00020BH\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006G"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorModel;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;", "module", "view", "fragmentDependency", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$FragmentDependency;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorModel;Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView;Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$FragmentDependency;)V", "getFragmentDependency", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$FragmentDependency;", "mCalendarMemberFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment;", "getMCalendarMemberFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment;", "setMCalendarMemberFragment", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment;)V", "mColorFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment;", "getMColorFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment;", "setMColorFragment", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment;)V", "mCurrentFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;", "getMCurrentFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;", "setMCurrentFragment", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarCreatorBaseFragment;)V", "mDescriptionFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment;", "getMDescriptionFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment;", "setMDescriptionFragment", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment;)V", "mViewDelegate", "getMViewDelegate", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;", "setMViewDelegate", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;)V", "mVisibilityFragment", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment;", "getMVisibilityFragment", "()Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment;", "setMVisibilityFragment", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment;)V", "create", "", "createViewDelegate", "getLoginChatterIfMiss", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "initForManagerCalendar", "initForNewCalendar", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onBackPressed", "onCaptured", "showManageCalendar", "calendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "Companion", "CreatorViewDelegate", "FragmentDependency", "IFetchCalendarCallback", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c */
public final class CalendarCreatorPresenter extends BasePresenter<ICalendarCreatorContract.ICalendarCreatorModel, ICalendarCreatorContract.ICalendarCreatorView, ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate> {

    /* renamed from: b */
    public static final Companion f75914b = new Companion(null);

    /* renamed from: a */
    public ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate f75915a;

    /* renamed from: c */
    private CalendarCreatorBaseFragment f75916c;

    /* renamed from: d */
    private CalendarColorFragment f75917d;

    /* renamed from: e */
    private CalendarVisibilityFragment f75918e;

    /* renamed from: f */
    private CalendarDescriptionFragment f75919f;

    /* renamed from: g */
    private CalendarMemberFragment f75920g;

    /* renamed from: h */
    private final FragmentDependency f75921h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\nH&J\n\u0010\u000b\u001a\u0004\u0018\u00010\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u000eH&J\u0012\u0010\u0016\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000eH&J\u0012\u0010\u0019\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$FragmentDependency;", "", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "containerId", "", "finishActivity", "getActivity", "Landroid/app/Activity;", "getCalendarFromBundle", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCalendarId", "", "getCalendarSummary", "getFragment", "Lcom/ss/android/lark/desktopmode/app/DesktopCompatFragment;", "Lcom/ss/android/lark/desktopmode/base/FloatWindowParams;", "getIsFromAppLink", "", "getManagerType", "hideFragment", "setManagerType", "newCalendarType", "showFragment", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$c */
    public interface FragmentDependency {
        /* renamed from: a */
        void mo109396a();

        /* renamed from: a */
        void mo109397a(Fragment fragment);

        /* renamed from: a */
        void mo109398a(Fragment fragment, int i);

        /* renamed from: a */
        void mo109399a(String str);

        /* renamed from: b */
        Activity mo109400b();

        /* renamed from: b */
        void mo109401b(Fragment fragment);

        /* renamed from: c */
        Calendar mo109402c();

        /* renamed from: d */
        String mo109403d();

        /* renamed from: e */
        boolean mo109404e();

        /* renamed from: f */
        String mo109405f();

        /* renamed from: g */
        String mo109406g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$IFetchCalendarCallback;", "Calendar", "", "onFetchDataFail", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onFetchDataSuccess", "calendar", "(Ljava/lang/Object;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$d */
    public interface IFetchCalendarCallback<Calendar> {
        /* renamed from: a */
        void mo109526a(Calendar calendar);

        /* renamed from: a */
        void mo109527a(String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$Companion;", "", "()V", "ADD_SHARING_MEMBER_ACTION", "", "REQUEST_CODE_ADD_ATTENDEE", "TAG", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final CalendarColorFragment mo109493a() {
        return this.f75917d;
    }

    /* renamed from: b */
    public final CalendarVisibilityFragment mo109501b() {
        return this.f75918e;
    }

    /* renamed from: c */
    public final CalendarDescriptionFragment mo109502c() {
        return this.f75919f;
    }

    /* renamed from: d */
    public final CalendarMemberFragment mo109503d() {
        return this.f75920g;
    }

    /* renamed from: j */
    public final FragmentDependency mo109509j() {
        return this.f75921h;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\tH\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate;", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/ICalendarCreatorContract$ICalendarCreatorView$ViewDelegate;", "(Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter;)V", "finishActivity", "", "getCurrentCalendar", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "getCurrentMembers", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "getManagerType", "", "onBackPressed", "onClickAddMemberLabel", "onClickColorContainer", "onClickDeleteBt", "onClickDescriptionContainer", "editable", "", "onClickMemberItem", "calendarMember", "onClickSaveButton", "onClickUnsubscribeBt", "onClickVisibilityContainer", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b */
    public final class CreatorViewDelegate implements ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate {
        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: e */
        public void mo109516e() {
            CalendarCreatorPresenter.this.mo109509j().mo109396a();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: i */
        public Calendar mo109520i() {
            return ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: j */
        public List<CalendarMember> mo109521j() {
            return ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109478f();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: k */
        public String mo109522k() {
            return CalendarCreatorPresenter.this.mo109509j().mo109406g();
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: c */
        public void mo109514c() {
            ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109469b(new C30314f(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: d */
        public void mo109515d() {
            ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109458a(new C30310b(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: a */
        public void mo109510a() {
            if (((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109562u()) {
                ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109467a(true);
            }
            ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109546e();
            if (((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109479g()) {
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109549h();
            } else {
                CalendarCreatorPresenter.this.mo109509j().mo109396a();
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: b */
        public void mo109513b() {
            if (TextUtils.isEmpty(((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109550i())) {
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109548g();
                return;
            }
            if (Intrinsics.areEqual(CalendarCreatorPresenter.this.mo109509j().mo109406g(), "new_calendar_type")) {
                ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e().setUserId(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109475d());
            }
            ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109541b(false);
            ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109476d(new C30313e(this));
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: f */
        public void mo109517f() {
            ArrayList arrayList = new ArrayList();
            for (CalendarMember calendarMember : ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109478f()) {
                if (calendarMember.getMemberType() == CalendarMember.CalendarMemberType.GROUP) {
                    arrayList.add(calendarMember.getChatId());
                } else {
                    arrayList.add(calendarMember.getUserId());
                }
            }
            CalendarPickerEntranceParams p = new CalendarPickerEntranceParams.Builder().mo113103a(R.string.Calendar_Setting_AddSharingMembers).mo113114d(arrayList).mo113112c(false).mo113115d(false).mo113106a(false).mo113117e(false).mo113110b(false).mo113119f(false).mo113132p();
            Activity b = CalendarCreatorPresenter.this.mo109509j().mo109400b();
            if (b != null) {
                CalendarChatterPickerActivity.f78852a.mo113054a(b, p, 1);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: g */
        public void mo109518g() {
            if (CalendarCreatorPresenter.this.mo109493a() == null) {
                CalendarCreatorPresenter cVar = CalendarCreatorPresenter.this;
                cVar.mo109495a(new CalendarColorFragment(((ICalendarCreatorContract.ICalendarCreatorModel) cVar.getModel()).mo109480h(), new C30309a(this)));
                CalendarCreatorPresenter.this.mo109509j().mo109398a(CalendarCreatorPresenter.this.mo109493a(), ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109551j());
            } else {
                CalendarColorFragment a = CalendarCreatorPresenter.this.mo109493a();
                if (a != null) {
                    a.mo109408b(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109480h());
                }
                CalendarCreatorPresenter.this.mo109509j().mo109397a(CalendarCreatorPresenter.this.mo109493a());
            }
            CalendarCreatorPresenter cVar2 = CalendarCreatorPresenter.this;
            cVar2.mo109496a((CalendarCreatorBaseFragment) cVar2.mo109493a());
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: h */
        public void mo109519h() {
            if (CalendarCreatorPresenter.this.mo109501b() == null) {
                CalendarCreatorPresenter.this.mo109499a(new CalendarVisibilityFragment());
                CalendarVisibilityFragment b = CalendarCreatorPresenter.this.mo109501b();
                if (b != null) {
                    b.mo109441a(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109481i(), ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109482j(), CalendarCreatorPresenter.this.mo109504e().mo109520i().getServerId());
                }
                CalendarVisibilityFragment b2 = CalendarCreatorPresenter.this.mo109501b();
                if (b2 != null) {
                    b2.mo109440a(new C30315g(this));
                }
                CalendarCreatorPresenter.this.mo109509j().mo109398a(CalendarCreatorPresenter.this.mo109501b(), ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109551j());
            } else {
                CalendarVisibilityFragment b3 = CalendarCreatorPresenter.this.mo109501b();
                if (b3 != null) {
                    b3.mo109443b(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109481i(), ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109482j(), CalendarCreatorPresenter.this.mo109504e().mo109520i().getServerId());
                }
                CalendarCreatorPresenter.this.mo109509j().mo109397a(CalendarCreatorPresenter.this.mo109501b());
            }
            CalendarCreatorPresenter cVar = CalendarCreatorPresenter.this;
            cVar.mo109496a((CalendarCreatorBaseFragment) cVar.mo109501b());
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickColorContainer$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarColorFragment$Delegate;", "onBackPressed", "", "isEdited", "", "chosenColor", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$a */
        public static final class C30309a implements CalendarColorFragment.Delegate {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75923a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30309a(CreatorViewDelegate bVar) {
                this.f75923a = bVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarColorFragment.Delegate
            /* renamed from: a */
            public void mo109410a(boolean z, int i) {
                CalendarCreatorPresenter.this.mo109496a((CalendarCreatorBaseFragment) null);
                if (z) {
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109467a(z);
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109457a(i);
                }
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109535a(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e());
                CalendarCreatorPresenter.this.mo109509j().mo109401b(CalendarCreatorPresenter.this.mo109493a());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickDeleteBt$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$b */
        public static final class C30310b implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75924a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30310b(CreatorViewDelegate bVar) {
                this.f75924a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109554m();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C30076a.m111290a().mo108433c(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e().getServerId());
                GeneralHitPoint.m124251i();
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109553l();
                this.f75924a.mo109516e();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickDescriptionContainer$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarDescriptionFragment$Delegate;", "onBackPressed", "", "isEdited", "", "description", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$c */
        public static final class C30311c implements CalendarDescriptionFragment.Delegate {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75925a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30311c(CreatorViewDelegate bVar) {
                this.f75925a = bVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarDescriptionFragment.Delegate
            /* renamed from: a */
            public void mo109417a(boolean z, String str) {
                Intrinsics.checkParameterIsNotNull(str, "description");
                CalendarCreatorPresenter.this.mo109496a((CalendarCreatorBaseFragment) null);
                if (z) {
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109467a(true);
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109471b(str);
                }
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109543c(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e());
                if (CalendarCreatorPresenter.this.mo109502c() != null) {
                    CalendarCreatorPresenter.this.mo109509j().mo109401b(CalendarCreatorPresenter.this.mo109502c());
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickMemberItem$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarMemberFragment$Delegate;", "onBackPressed", "", "isEdited", "", "onDeleteMember", "calendarMember", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$d */
        public static final class C30312d implements CalendarMemberFragment.Delegate {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75926a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30312d(CreatorViewDelegate bVar) {
                this.f75926a = bVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarMemberFragment.Delegate
            /* renamed from: a */
            public void mo109432a(CalendarMember calendarMember) {
                Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
                CalendarCreatorPresenter.this.mo109496a((CalendarCreatorBaseFragment) null);
                ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109467a(true);
                ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109478f().remove(calendarMember);
                ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109461a(calendarMember);
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109537a(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109478f());
                if (CalendarCreatorPresenter.this.mo109503d() != null) {
                    CalendarCreatorPresenter.this.mo109509j().mo109401b(CalendarCreatorPresenter.this.mo109503d());
                }
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarMemberFragment.Delegate
            /* renamed from: a */
            public void mo109433a(boolean z) {
                CalendarCreatorPresenter.this.mo109496a((CalendarCreatorBaseFragment) null);
                if (z) {
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109467a(z);
                    ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109537a(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109478f());
                }
                if (CalendarCreatorPresenter.this.mo109503d() != null) {
                    CalendarCreatorPresenter.this.mo109509j().mo109401b(CalendarCreatorPresenter.this.mo109503d());
                }
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickSaveButton$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$e */
        public static final class C30313e implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75927a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30313e(CreatorViewDelegate bVar) {
                this.f75927a = bVar;
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109541b(true);
                CalendarCreatorPresenter.this.mo109509j().mo109396a();
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109557p();
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109541b(true);
                if (errorResult.getErrorCode() == 8032) {
                    ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109559r();
                } else {
                    ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109558q();
                }
                Log.m165383e("CalendarCreatorPresenter", "saveCalendarWithMembers  Err");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickUnsubscribeBt$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$f */
        public static final class C30314f implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75928a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30314f(CreatorViewDelegate bVar) {
                this.f75928a = bVar;
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109556o();
            }

            /* renamed from: a */
            public void onSuccess(Boolean bool) {
                C30076a.m111290a().mo108433c(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e().getServerId());
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109555n();
                this.f75928a.mo109516e();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$CreatorViewDelegate$onClickVisibilityContainer$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/fragment/CalendarVisibilityFragment$Delegate;", "onBackPressed", "", "isEdited", "", "isPublic", "accessRole", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar$AccessRole;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$b$g */
        public static final class C30315g implements CalendarVisibilityFragment.Delegate {

            /* renamed from: a */
            final /* synthetic */ CreatorViewDelegate f75929a;

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C30315g(CreatorViewDelegate bVar) {
                this.f75929a = bVar;
            }

            @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.fragment.CalendarVisibilityFragment.Delegate
            /* renamed from: a */
            public void mo109450a(boolean z, boolean z2, Calendar.AccessRole accessRole) {
                Intrinsics.checkParameterIsNotNull(accessRole, "accessRole");
                CalendarCreatorPresenter.this.mo109496a((CalendarCreatorBaseFragment) null);
                if (z) {
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109467a(z);
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109472b(z2);
                    ((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109459a(accessRole);
                }
                ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109540b(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109477e());
                if (CalendarCreatorPresenter.this.mo109501b() != null) {
                    CalendarCreatorPresenter.this.mo109509j().mo109401b(CalendarCreatorPresenter.this.mo109501b());
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public CreatorViewDelegate() {
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: a */
        public void mo109511a(CalendarMember calendarMember) {
            Intrinsics.checkParameterIsNotNull(calendarMember, "calendarMember");
            if (CalendarCreatorPresenter.this.mo109503d() == null) {
                CalendarCreatorPresenter.this.mo109498a(new CalendarMemberFragment(calendarMember, new C30312d(this)));
                CalendarCreatorPresenter.this.mo109509j().mo109398a(CalendarCreatorPresenter.this.mo109503d(), ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109551j());
            } else {
                CalendarMemberFragment d = CalendarCreatorPresenter.this.mo109503d();
                if (d == null) {
                    Intrinsics.throwNpe();
                }
                d.mo109421a(calendarMember);
                CalendarCreatorPresenter.this.mo109509j().mo109397a(CalendarCreatorPresenter.this.mo109503d());
            }
            CalendarCreatorPresenter cVar = CalendarCreatorPresenter.this;
            cVar.mo109496a((CalendarCreatorBaseFragment) cVar.mo109503d());
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate
        /* renamed from: a */
        public void mo109512a(boolean z) {
            if (CalendarCreatorPresenter.this.mo109502c() == null) {
                CalendarCreatorPresenter cVar = CalendarCreatorPresenter.this;
                cVar.mo109497a(new CalendarDescriptionFragment(((ICalendarCreatorContract.ICalendarCreatorModel) cVar.getModel()).mo109483k(), new C30311c(this)));
                CalendarDescriptionFragment c = CalendarCreatorPresenter.this.mo109502c();
                if (c != null) {
                    c.mo109414a(z);
                }
                CalendarCreatorPresenter.this.mo109509j().mo109398a(CalendarCreatorPresenter.this.mo109502c(), ((ICalendarCreatorContract.ICalendarCreatorView) CalendarCreatorPresenter.this.getView()).mo109551j());
            } else {
                CalendarDescriptionFragment c2 = CalendarCreatorPresenter.this.mo109502c();
                if (c2 != null) {
                    c2.mo109414a(z);
                }
                CalendarDescriptionFragment c3 = CalendarCreatorPresenter.this.mo109502c();
                if (c3 != null) {
                    c3.mo109413a(((ICalendarCreatorContract.ICalendarCreatorModel) CalendarCreatorPresenter.this.getModel()).mo109483k());
                }
                CalendarCreatorPresenter.this.mo109509j().mo109397a(CalendarCreatorPresenter.this.mo109502c());
            }
            CalendarCreatorPresenter cVar2 = CalendarCreatorPresenter.this;
            cVar2.mo109496a((CalendarCreatorBaseFragment) cVar2.mo109502c());
        }
    }

    /* renamed from: e */
    public final ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate mo109504e() {
        ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75915a;
        if (aVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate createViewDelegate() {
        CreatorViewDelegate bVar = new CreatorViewDelegate();
        this.f75915a = bVar;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
        }
        if (bVar != null) {
            return bVar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.CreatorViewDelegate");
    }

    /* renamed from: k */
    private final void m112627k() {
        if (!this.f75921h.mo109404e()) {
            Calendar c = this.f75921h.mo109402c();
            if (c != null) {
                mo109500a(c);
            }
        } else if (!TextUtils.isEmpty(this.f75921h.mo109405f())) {
            ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109464a(this.f75921h.mo109405f(), new C30316e(this));
        }
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        if (Intrinsics.areEqual(this.f75921h.mo109406g(), "new_calendar_type")) {
            mo109505f();
        } else if (Intrinsics.areEqual(this.f75921h.mo109406g(), "manager_calendar_type")) {
            m112627k();
        }
    }

    /* renamed from: h */
    public final void mo109507h() {
        CalendarCreatorBaseFragment bVar;
        if (!((ICalendarCreatorContract.ICalendarCreatorView) getView()).mo109552k() || (bVar = this.f75916c) == null) {
            ICalendarCreatorContract.ICalendarCreatorView.ViewDelegate aVar = this.f75915a;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mViewDelegate");
            }
            aVar.mo109510a();
            return;
        }
        if (bVar == null) {
            Intrinsics.throwNpe();
        }
        bVar.mo109409c();
    }

    /* renamed from: i */
    public final void mo109508i() {
        CalendarLogHelper.f78612a.mo112730a(((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109477e(), new ArrayList(((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109478f()));
    }

    /* renamed from: f */
    public final void mo109505f() {
        ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109473c();
        ((ICalendarCreatorContract.ICalendarCreatorView) getView()).mo109541b(false);
        ((ICalendarCreatorContract.ICalendarCreatorView) getView()).mo109538a(false);
        ((ICalendarCreatorContract.ICalendarCreatorView) getView()).mo109536a(this.f75921h.mo109403d());
        Calendar.Type type = ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109477e().getType();
        Intrinsics.checkExpressionValueIsNotNull(type, "model.getCurrentCalendar().type");
        GeneralHitPoint.m124196a("new", type);
        UIGetDataCallback uIGetDataCallback = new UIGetDataCallback(new C30318g(this));
        if (TextUtils.isEmpty(((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109475d())) {
            ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109474c(new C30317f(this, uIGetDataCallback));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109475d());
            ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109465a("", arrayList, new ArrayList(), 0, uIGetDataCallback);
        }
        C32500a.m124322a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$initForManagerCalendar$1", "Lcom/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$IFetchCalendarCallback;", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/Calendar;", "onFetchDataFail", "", ApiHandler.API_CALLBACK_ERRMSG, "", "onFetchDataSuccess", "calendar", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$e */
    public static final class C30316e implements IFetchCalendarCallback<Calendar> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorPresenter f75930a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30316e(CalendarCreatorPresenter cVar) {
            this.f75930a = cVar;
        }

        /* renamed from: a */
        public void mo109526a(Calendar calendar) {
            if (calendar != null) {
                this.f75930a.mo109500a(calendar);
            }
        }

        @Override // com.ss.android.lark.calendar.impl.features.calendars.editor.CalendarCreatorPresenter.IFetchCalendarCallback
        /* renamed from: a */
        public void mo109527a(String str) {
            Intrinsics.checkParameterIsNotNull(str, ApiHandler.API_CALLBACK_ERRMSG);
            this.f75930a.mo109509j().mo109399a("new_calendar_type");
            this.f75930a.mo109505f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$initForNewCalendar$getMemberCallBack$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$g */
    public static final class C30318g implements IGetDataCallback<List<? extends CalendarMember>> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorPresenter f75933a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30318g(CalendarCreatorPresenter cVar) {
            this.f75933a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            Log.m165383e("CalendarCreatorPresenter", "updateMemberRecycleView error");
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarMember> list) {
            ((ICalendarCreatorContract.ICalendarCreatorView) this.f75933a.getView()).mo109537a(((ICalendarCreatorContract.ICalendarCreatorModel) this.f75933a.getModel()).mo109478f());
            ((ICalendarCreatorContract.ICalendarCreatorView) this.f75933a.getView()).mo109541b(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0016\u0010\b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$onActivityResult$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarMember;", "onError", "", "p0", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$h */
    public static final class C30319h implements IGetDataCallback<List<? extends CalendarMember>> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorPresenter f75934a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30319h(CalendarCreatorPresenter cVar) {
            this.f75934a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "p0");
            Log.m165383e("CalendarCreatorPresenter", "addCalendarMembersByIds  Err");
        }

        /* renamed from: a */
        public void onSuccess(List<? extends CalendarMember> list) {
            Intrinsics.checkParameterIsNotNull(list, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            ((ICalendarCreatorContract.ICalendarCreatorView) this.f75934a.getView()).mo109537a(((ICalendarCreatorContract.ICalendarCreatorModel) this.f75934a.getModel()).mo109478f());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0017\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$showManageCalendar$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "(Ljava/lang/Boolean;)V", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$i */
    public static final class C30320i implements IGetDataCallback<Boolean> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorPresenter f75935a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C30320i(CalendarCreatorPresenter cVar) {
            this.f75935a = cVar;
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ICalendarCreatorContract.ICalendarCreatorView) this.f75935a.getView()).mo109560s();
            Log.m165383e("CalendarCreatorPresenter", "getCalendarAndMembersWithIds Err");
        }

        /* renamed from: a */
        public void onSuccess(Boolean bool) {
            ((ICalendarCreatorContract.ICalendarCreatorView) this.f75935a.getView()).mo109538a(true);
            ((ICalendarCreatorContract.ICalendarCreatorView) this.f75935a.getView()).mo109541b(true);
            Calendar.Type type = ((ICalendarCreatorContract.ICalendarCreatorModel) this.f75935a.getModel()).mo109477e().getType();
            Intrinsics.checkExpressionValueIsNotNull(type, "model.getCurrentCalendar().type");
            GeneralHitPoint.m124196a("edit", type);
        }
    }

    /* renamed from: a */
    public final void mo109495a(CalendarColorFragment aVar) {
        this.f75917d = aVar;
    }

    /* renamed from: a */
    public final void mo109496a(CalendarCreatorBaseFragment bVar) {
        this.f75916c = bVar;
    }

    /* renamed from: a */
    private final void m112626a(IGetDataCallback<AbstractC30026d> iGetDataCallback) {
        if (TextUtils.isEmpty(((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109475d())) {
            ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109474c(iGetDataCallback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/calendar/impl/features/calendars/editor/CalendarCreatorPresenter$initForNewCalendar$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/calendar/dependency/idependency/entity/IChatterData;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "chatter", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.c$f */
    public static final class C30317f implements IGetDataCallback<AbstractC30026d> {

        /* renamed from: a */
        final /* synthetic */ CalendarCreatorPresenter f75931a;

        /* renamed from: b */
        final /* synthetic */ UIGetDataCallback f75932b;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
        }

        /* renamed from: a */
        public void onSuccess(AbstractC30026d dVar) {
            if (dVar != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dVar.getId());
                ((ICalendarCreatorContract.ICalendarCreatorModel) this.f75931a.getModel()).mo109465a("", arrayList, new ArrayList(), 0, this.f75932b);
            }
        }

        C30317f(CalendarCreatorPresenter cVar, UIGetDataCallback uIGetDataCallback) {
            this.f75931a = cVar;
            this.f75932b = uIGetDataCallback;
        }
    }

    /* renamed from: a */
    public final void mo109497a(CalendarDescriptionFragment cVar) {
        this.f75919f = cVar;
    }

    /* renamed from: a */
    public final void mo109498a(CalendarMemberFragment dVar) {
        this.f75920g = dVar;
    }

    /* renamed from: a */
    public final void mo109499a(CalendarVisibilityFragment fVar) {
        this.f75918e = fVar;
    }

    /* renamed from: a */
    public final void mo109500a(Calendar calendar) {
        ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109470b(calendar);
        m112626a((IGetDataCallback<AbstractC30026d>) null);
        ((ICalendarCreatorContract.ICalendarCreatorView) getView()).mo109541b(false);
        ((ICalendarCreatorContract.ICalendarCreatorView) getView()).mo109538a(false);
        String serverId = calendar.getServerId();
        Intrinsics.checkExpressionValueIsNotNull(serverId, "calendar.serverId");
        ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109463a(serverId, new C30320i(this));
        CalendarSettingHitPoint.m124368a(calendar.getServerId());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CalendarCreatorPresenter(ICalendarCreatorContract.ICalendarCreatorModel aVar, ICalendarCreatorContract.ICalendarCreatorView bVar, FragmentDependency cVar) {
        super(aVar, bVar);
        Intrinsics.checkParameterIsNotNull(aVar, "module");
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(cVar, "fragmentDependency");
        this.f75921h = cVar;
    }

    /* renamed from: a */
    public final void mo109494a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 1 && intent != null) {
            ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109467a(true);
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("picker_selected_chatter_result");
            if (stringArrayListExtra == null) {
                stringArrayListExtra = new ArrayList<>();
            }
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("picker_selected_group_result");
            if (stringArrayListExtra2 == null) {
                stringArrayListExtra2 = new ArrayList<>();
            }
            ArrayList<String> arrayList = stringArrayListExtra;
            ArrayList<String> arrayList2 = stringArrayListExtra2;
            ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109466a(arrayList, arrayList2);
            GeneralHitPoint.m124217a(stringArrayListExtra, stringArrayListExtra2);
            if (!CollectionUtils.isEmpty(((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109478f())) {
                ICalendarCreatorContract.ICalendarCreatorModel aVar = (ICalendarCreatorContract.ICalendarCreatorModel) getModel();
                String serverId = ((ICalendarCreatorContract.ICalendarCreatorModel) getModel()).mo109477e().getServerId();
                Intrinsics.checkExpressionValueIsNotNull(serverId, "model.getCurrentCalendar().serverId");
                aVar.mo109465a(serverId, arrayList, arrayList2, 1, new UIGetDataCallback(new C30319h(this)));
            }
        }
    }
}
