package com.ss.android.lark.mail.impl.widget.time.multitimezone;

import android.text.TextUtils;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mail.impl.p2164c.AbstractC41870b;
import com.ss.android.lark.mail.impl.p2168g.C42176e;
import com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract;
import com.ss.android.lark.mail.impl.widget.time.mvp.BasePresenterCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u001a2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u001a\u001bB\u0015\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\nJ\b\u0010\u0016\u001a\u00020\fH\u0002J\u000e\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter;", "Lcom/ss/android/lark/mail/impl/widget/time/mvp/BasePresenterCalendar;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewData;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewAction;", "timeZoneView", "timeZoneModel", "(Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorView;Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$ITimeZoneSelectorModel;)V", "mDependency", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter$Dependency;", "create", "", "getViewAction", "loadRecentSelectTimeZone", "modifyViewForDesktop", "onMiddleStatus", "searchTimeZoneByCity", "searchCity", "", "setDependency", "dependency", "setDeviceTimeZoneData", "setShowSelectedToast", "isShow", "", "Companion", "Dependency", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.l */
public final class TimeZoneSelectorPresenter extends BasePresenterCalendar<ITimeZoneSelectorContract.ITimeZoneSelectorModel, ITimeZoneSelectorContract.ITimeZoneSelectorView, ITimeZoneSelectorContract.IViewData, ITimeZoneSelectorContract.IViewAction> {

    /* renamed from: b */
    public static final Companion f112050b = new Companion(null);

    /* renamed from: a */
    public Dependency f112051a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter$Dependency;", "", "scrollToMiddleStatus", "", "scrollToTopStatus", "smoothDismissDialog", "timeZoneSelected", "timeZoneId", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.l$b */
    public interface Dependency {
        /* renamed from: a */
        void mo157049a();

        /* renamed from: a */
        void mo157050a(String str);

        /* renamed from: b */
        void mo157051b();

        /* renamed from: c */
        void mo157052c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter$Companion;", "", "()V", "TAG", "", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.l$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: g */
    private final void m174900g() {
        new C44121d(this);
    }

    /* renamed from: a */
    public ITimeZoneSelectorContract.IViewAction mo156852b() {
        return new C44120c(this);
    }

    /* renamed from: c */
    public final void mo157058c() {
        ((ITimeZoneSelectorContract.ITimeZoneSelectorView) mo156853d()).mo157029e();
    }

    @Override // com.ss.android.lark.mail.impl.widget.time.mvp.BasePresenterCalendar, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        m174899f();
        m174900g();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0006H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0002J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0002¨\u0006\u0017"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter$getViewAction$1", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/ITimeZoneSelectorContract$IViewAction;", "onClearAllRecentTimeZoneClick", "", "delTimeZoneIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onDeleteRecentTimeZoneClick", "delTimeZoneId", "onSearchCancelClick", "onSearchClick", "searchKey", "onSearchEditViewClick", "onTimeZoneSelected", "timeZoneId", "onTitleBarCloseClicked", "updateModelAndView", "needCloseDialog", "", "updateRecentTimeZone", "addTimeZoneId", "updateSelectTimeZone", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.l$c */
    public static final class C44120c implements ITimeZoneSelectorContract.IViewAction {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorPresenter f112052a;

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: a */
        public void mo157033a() {
            Dependency bVar = this.f112052a.f112051a;
            if (bVar != null) {
                bVar.mo157049a();
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112052a.mo156853d()).mo157030f();
            }
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: b */
        public void mo157035b() {
            Dependency bVar = this.f112052a.f112051a;
            if (bVar != null) {
                bVar.mo157051b();
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112052a.mo156853d()).mo157029e();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44120c(TimeZoneSelectorPresenter lVar) {
            this.f112052a = lVar;
        }

        /* renamed from: c */
        private final void m174912c(String str) {
            String.valueOf(new Date().getTime());
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: a */
        public void mo157034a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "searchKey");
            this.f112052a.mo157057a(str);
        }

        @Override // com.ss.android.lark.mail.impl.widget.time.multitimezone.ITimeZoneSelectorContract.IViewAction
        /* renamed from: b */
        public void mo157036b(String str) {
            Intrinsics.checkParameterIsNotNull(str, "timeZoneId");
            m174912c(str);
            m174910a(str, true);
        }

        /* renamed from: a */
        private final void m174910a(String str, boolean z) {
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
            if (Intrinsics.areEqual(timeZone.getID(), str)) {
                str = "";
            }
            String.valueOf(new Date().getTime());
            if (TextUtils.isEmpty(str)) {
                TimeZone timeZone2 = TimeZone.getDefault();
                Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
                str = timeZone2.getID();
            }
            Intrinsics.checkExpressionValueIsNotNull(str, "viewTimeZoneId");
            m174911b(str, z);
        }

        /* renamed from: b */
        private final void m174911b(String str, boolean z) {
            Dependency bVar = this.f112052a.f112051a;
            if (bVar != null) {
                bVar.mo157050a(str);
            }
            if (z) {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112052a.mo156853d()).mo157032h();
                Dependency bVar2 = this.f112052a.f112051a;
                if (bVar2 != null) {
                    bVar2.mo157052c();
                }
            } else {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f112052a.mo156854e()).mo157020a(str);
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112052a.mo156853d()).mo157031g();
            }
            if (((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f112052a.mo156854e()).mo157022a()) {
                TimeZone timeZone = TimeZone.getTimeZone(str);
                String a = TimeZoneUtils.m174942a(timeZone.getOffset(System.currentTimeMillis()) / 1000);
                StringBuilder sb = new StringBuilder();
                Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
                sb.append(timeZone.getDisplayName());
                sb.append("\n");
                sb.append(a);
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112052a.mo156853d()).mo157025a(sb.toString());
            }
        }
    }

    /* renamed from: f */
    private final void m174899f() {
        TimeZone timeZone = TimeZone.getDefault();
        String a = TimeZoneUtils.m174942a(timeZone.getOffset(System.currentTimeMillis()) / 1000);
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timezone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timezone.id");
        String displayName = timeZone.getDisplayName();
        Intrinsics.checkExpressionValueIsNotNull(displayName, "timezone.displayName");
        ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) mo156854e()).mo157019a(new TimeZoneItemData(id, displayName, a));
        ((ITimeZoneSelectorContract.ITimeZoneSelectorView) mo156853d()).mo157024a();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00040\u0001J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00062\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0004H\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter$loadRecentSelectTimeZone$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "timezoneIds", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.l$d */
    public static final class C44121d implements IGetDataCallback<ArrayList<String>> {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorPresenter f112053a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44121d(TimeZoneSelectorPresenter lVar) {
            this.f112053a = lVar;
        }

        /* renamed from: a */
        public void onSuccess(ArrayList<String> arrayList) {
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f112053a.mo156854e()).mo157021a(arrayList);
            ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112053a.mo156853d()).mo157026b();
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f112053a.mo156854e()).mo157021a(new ArrayList<>());
            ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112053a.mo156853d()).mo157026b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\nH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneSelectorPresenter$searchTimeZoneByCity$callback$1", "Lcom/ss/android/lark/mail/impl/callback/AbsGetDataCallback;", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/mail/impl/widget/time/multitimezone/TimeZoneItemData;", "onMainError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onMainSuccess", "searchResultData", "Lkotlin/collections/ArrayList;", "mail_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mail.impl.widget.time.multitimezone.l$e */
    public static final class C44122e extends AbstractC41870b<ArrayList<TimeZoneItemData>> {

        /* renamed from: a */
        final /* synthetic */ TimeZoneSelectorPresenter f112054a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44122e(TimeZoneSelectorPresenter lVar) {
            this.f112054a = lVar;
        }

        @Override // com.ss.android.lark.mail.impl.p2164c.AbstractC41870b
        /* renamed from: a */
        public void mo150434a(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f112054a.mo156854e()).mo157023b(null);
            ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112054a.mo156853d()).mo157028d();
        }

        /* renamed from: a */
        public void mo150435a(ArrayList<TimeZoneItemData> arrayList) {
            ((ITimeZoneSelectorContract.ITimeZoneSelectorModel) this.f112054a.mo156854e()).mo157023b(arrayList);
            if (CollectionUtils.isNotEmpty(arrayList)) {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112054a.mo156853d()).mo157027c();
            } else {
                ((ITimeZoneSelectorContract.ITimeZoneSelectorView) this.f112054a.mo156853d()).mo157028d();
            }
        }
    }

    /* renamed from: a */
    public final void mo157056a(Dependency bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "dependency");
        this.f112051a = bVar;
    }

    /* renamed from: a */
    public final void mo157057a(String str) {
        C42176e.m168344a().mo152258h(str, new C44122e(this));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeZoneSelectorPresenter(ITimeZoneSelectorContract.ITimeZoneSelectorView bVar, ITimeZoneSelectorContract.ITimeZoneSelectorModel aVar) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "timeZoneView");
        Intrinsics.checkParameterIsNotNull(aVar, "timeZoneModel");
    }
}
