package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import android.app.Activity;
import android.os.Bundle;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.mvp.BasePresenter;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberView;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0002J\u0014\u0010\u0012\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberPresenter;", "Lcom/larksuite/framework/mvp/BasePresenter;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IModel;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IView$Delegate;", "activity", "Landroid/app/Activity;", "bundle", "Landroid/os/Bundle;", "dependency", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;", "(Landroid/app/Activity;Landroid/os/Bundle;Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberView$Dependency;)V", "getBundle", "()Landroid/os/Bundle;", "create", "", "createViewDelegate", "loadMembers", "updateSelected", "selectedIdList", "", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.f */
public final class CalendarPickMemberPresenter extends BasePresenter<ICalendarPickMemberContract.IModel, ICalendarPickMemberContract.IView, ICalendarPickMemberContract.IView.Delegate> {

    /* renamed from: a */
    private final Bundle f114193a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberPresenter$loadMembers$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "members", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.f$b */
    public static final class C45093b implements IGetDataCallback<SelectBeansResult> {

        /* renamed from: a */
        final /* synthetic */ CalendarPickMemberPresenter f114195a;

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.f$b$a */
        public static final class RunnableC45094a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45093b f114196a;

            /* renamed from: b */
            final /* synthetic */ ErrorResult f114197b;

            RunnableC45094a(C45093b bVar, ErrorResult errorResult) {
                this.f114196a = bVar;
                this.f114197b = errorResult;
            }

            public final void run() {
                Log.m165382e(this.f114197b.getErrorMsg());
                ((ICalendarPickMemberContract.IView) this.f114196a.f114195a.getView()).mo159393a(this.f114197b.getErrorMsg());
            }
        }

        /* access modifiers changed from: package-private */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.f$b$b */
        public static final class RunnableC45095b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C45093b f114198a;

            /* renamed from: b */
            final /* synthetic */ SelectBeansResult f114199b;

            RunnableC45095b(C45093b bVar, SelectBeansResult dVar) {
                this.f114198a = bVar;
                this.f114199b = dVar;
            }

            public final void run() {
                ((ICalendarPickMemberContract.IView) this.f114198a.f114195a.getView()).mo159449d(this.f114199b);
                ICalendarPickMemberContract.IModel aVar = (ICalendarPickMemberContract.IModel) this.f114198a.f114195a.getModel();
                Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
                ((ICalendarPickMemberContract.IView) this.f114198a.f114195a.getView()).mo159568a(new ArrayList<>(aVar.mo159441c().values()));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45093b(CalendarPickMemberPresenter fVar) {
            this.f114195a = fVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectBeansResult dVar) {
            Intrinsics.checkParameterIsNotNull(dVar, "members");
            UICallbackExecutor.execute(new RunnableC45095b(this, dVar));
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            UICallbackExecutor.execute(new RunnableC45094a(this, errorResult));
        }
    }

    /* renamed from: b */
    public final void mo159562b() {
        ((ICalendarPickMemberContract.IModel) getModel()).mo159435a(new C45093b(this));
    }

    @Override // com.larksuite.framework.mvp.BasePresenter, com.larksuite.framework.mvp.ILifecycle
    public void create() {
        super.create();
        ((ICalendarPickMemberContract.IModel) getModel()).mo159434a(this.f114193a, new C45092a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ICalendarPickMemberContract.IView.Delegate createViewDelegate() {
        ICalendarPickMemberContract.IView bVar = (ICalendarPickMemberContract.IView) getView();
        Intrinsics.checkExpressionValueIsNotNull(bVar, "view");
        ICalendarPickMemberContract.IModel aVar = (ICalendarPickMemberContract.IModel) getModel();
        if (aVar != null) {
            return new CalendarPickMemberDelegate(bVar, (CalendarPickMemberModel) aVar);
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.member_manage.impl.calendar_pick_member.CalendarPickMemberModel");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberPresenter$create$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "onError", "", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "selectMemberInitData", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.f$a */
    public static final class C45092a implements IGetDataCallback<SelectMemberInitData> {

        /* renamed from: a */
        final /* synthetic */ CalendarPickMemberPresenter f114194a;

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "errorResult");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45092a(CalendarPickMemberPresenter fVar) {
            this.f114194a = fVar;
        }

        /* renamed from: a */
        public void onSuccess(SelectMemberInitData selectMemberInitData) {
            Intrinsics.checkParameterIsNotNull(selectMemberInitData, "selectMemberInitData");
            ((ICalendarPickMemberContract.IView) this.f114194a.getView()).mo159447a(selectMemberInitData.getChat());
            this.f114194a.mo159562b();
        }
    }

    /* renamed from: a */
    public final void mo159561a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "selectedIdList");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet(list);
        ICalendarPickMemberContract.IModel aVar = (ICalendarPickMemberContract.IModel) getModel();
        Intrinsics.checkExpressionValueIsNotNull(aVar, "model");
        Map<String, C45084c> c = aVar.mo159441c();
        Intrinsics.checkExpressionValueIsNotNull(c, "model.selectedItems");
        for (Map.Entry<String, C45084c> entry : c.entrySet()) {
            if (!hashSet.contains(entry.getKey())) {
                C45084c value = entry.getValue();
                Intrinsics.checkExpressionValueIsNotNull(value, "selectedItem.value");
                arrayList.add(value);
            }
        }
        ((ICalendarPickMemberContract.IView) getView()).mo159571d(arrayList);
    }

    public CalendarPickMemberPresenter(Activity activity, Bundle bundle, CalendarPickMemberView.Dependency aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        Intrinsics.checkParameterIsNotNull(aVar, "dependency");
        this.f114193a = bundle;
        setModel(new CalendarPickMemberModel());
        setView(new CalendarPickMemberView(activity, aVar));
        ((ICalendarPickMemberContract.IView) getView()).setViewDelegate(createViewDelegate());
    }
}
