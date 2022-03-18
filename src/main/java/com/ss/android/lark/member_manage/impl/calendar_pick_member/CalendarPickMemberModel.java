package com.ss.android.lark.member_manage.impl.calendar_pick_member;

import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.member_manage.GroupMemberManageModule;
import com.ss.android.lark.member_manage.dependency.IGroupMemberManageModuleDependency;
import com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a;
import com.ss.android.lark.member_manage.impl.base.p2258a.AbstractRunnableC45034a;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b;
import com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45054c;
import com.ss.android.lark.member_manage.impl.base.p2259b.C45051a;
import com.ss.android.lark.member_manage.impl.bean.C45082a;
import com.ss.android.lark.member_manage.impl.bean.C45084c;
import com.ss.android.lark.member_manage.impl.bean.SelectBeansResult;
import com.ss.android.lark.member_manage.impl.bean.SelectMemberInitData;
import com.ss.android.lark.member_manage.impl.calendar_pick_member.ICalendarPickMemberContract;
import com.ss.android.lark.utils.rxjava.C57865c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000bH\u0014J*\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0015H\u0014J(\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0018\u00010\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberModel;", "Lcom/ss/android/lark/member_manage/impl/base/mvp/BaseGroupMemberManageModel;", "Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/ICalendarPickMemberContract$IModel;", "()V", "curSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ChatChatterSearcher;", "getInitData", "", "bundle", "Landroid/os/Bundle;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "getLoader", "Lcom/ss/android/lark/member_manage/impl/base/loader/BaseMemLoader;", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBeansResult;", "getSearchResultCallback", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearchResultCallback;", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "getSearcher", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearcher;", "search", "key", "", "Companion", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.e */
public final class CalendarPickMemberModel extends AbstractC45068a implements ICalendarPickMemberContract.IModel {

    /* renamed from: h */
    public static final Companion f114185h = new Companion(null);

    /* renamed from: i */
    private final C45051a f114186i = new C45051a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberModel$Companion;", "", "()V", "SELECTED_MEMBER_LIMIT_COUNT", "", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: f */
    public AbstractC45054c mo159467f() {
        return this.f114186i;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "produce"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.e$b */
    static final class C45089b<T> implements C57865c.AbstractC57873d<T> {

        /* renamed from: a */
        final /* synthetic */ String f114187a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f114188b;

        C45089b(String str, ArrayList arrayList) {
            this.f114187a = str;
            this.f114188b = arrayList;
        }

        /* renamed from: a */
        public final SelectMemberInitData produce() {
            SelectMemberInitData selectMemberInitData = new SelectMemberInitData();
            IGroupMemberManageModuleDependency a = GroupMemberManageModule.m177902a();
            Intrinsics.checkExpressionValueIsNotNull(a, "GroupMemberManageModule.getDependency()");
            selectMemberInitData.setChat(a.getChatDependency().mo143743a(this.f114187a));
            selectMemberInitData.setSelectedIds(this.f114188b);
            return selectMemberInitData;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: a */
    public AbstractC45053b<List<C45084c>> mo159462a(AbstractC45053b<List<C45084c>> bVar) {
        return new C45091d(this, bVar);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/member_manage/impl/bean/SelectMemberInitData;", "kotlin.jvm.PlatformType", "consume"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.e$c */
    static final class C45090c<T> implements C57865c.AbstractC57871b<T> {

        /* renamed from: a */
        final /* synthetic */ CalendarPickMemberModel f114189a;

        /* renamed from: b */
        final /* synthetic */ IGetDataCallback f114190b;

        C45090c(CalendarPickMemberModel eVar, IGetDataCallback iGetDataCallback) {
            this.f114189a = eVar;
            this.f114190b = iGetDataCallback;
        }

        /* renamed from: a */
        public final void consume(SelectMemberInitData selectMemberInitData) {
            this.f114189a.f114103a = selectMemberInitData;
            IGetDataCallback iGetDataCallback = this.f114190b;
            if (iGetDataCallback != null) {
                iGetDataCallback.onSuccess(selectMemberInitData);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001e\u0010\u000b\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\r"}, d2 = {"com/ss/android/lark/member_manage/impl/calendar_pick_member/CalendarPickMemberModel$getSearchResultCallback$1", "Lcom/ss/android/lark/member_manage/impl/base/searcher/ISearchResultCallback;", "", "Lcom/ss/android/lark/member_manage/impl/bean/SelectBean;", "onSearchEmpty", "", "key", "", "onSearchFail", "errorResult", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSearchSuccess", "result", "im_group-member-manage_group-member-manage_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.member_manage.impl.calendar_pick_member.e$d */
    public static final class C45091d implements AbstractC45053b<List<C45084c>> {

        /* renamed from: a */
        final /* synthetic */ CalendarPickMemberModel f114191a;

        /* renamed from: b */
        final /* synthetic */ AbstractC45053b f114192b;

        @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
        /* renamed from: a */
        public void mo159378a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "key");
            this.f114191a.f114106d = new ArrayList();
            AbstractC45053b bVar = this.f114192b;
            if (bVar != null) {
                bVar.mo159378a(str);
            }
        }

        C45091d(CalendarPickMemberModel eVar, AbstractC45053b bVar) {
            this.f114191a = eVar;
            this.f114192b = bVar;
        }

        @Override // com.ss.android.lark.member_manage.impl.base.p2259b.AbstractC45053b
        /* renamed from: a */
        public void mo159379a(String str, ErrorResult errorResult) {
            AbstractC45053b bVar = this.f114192b;
            if (bVar != null) {
                bVar.mo159379a(str, errorResult);
            }
        }

        /* renamed from: a */
        public void mo159377a(List<C45084c> list, String str) {
            Intrinsics.checkParameterIsNotNull(list, "result");
            Intrinsics.checkParameterIsNotNull(str, "key");
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list.get(i).mo159503b(this.f114191a.f114107e.keySet().contains(list.get(i).mo159513h()));
                C45082a aVar = new C45082a(list.get(i));
                boolean z = true;
                if (list.get(i).mo159504b()) {
                    aVar.mo159490a(true);
                } else {
                    if (this.f114191a.mo159441c().size() >= 30) {
                        z = false;
                    }
                    aVar.mo159490a(z);
                }
                arrayList.add(aVar);
            }
            ArrayList arrayList2 = arrayList;
            this.f114191a.f114106d = arrayList2;
            AbstractC45053b bVar = this.f114192b;
            if (bVar != null) {
                bVar.mo159377a(arrayList2, str);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.member_manage.impl.base.mvp.AbstractC45068a
    /* renamed from: c */
    public AbstractRunnableC45034a mo159465c(IGetDataCallback<SelectBeansResult> iGetDataCallback) {
        SelectMemberInitData selectMemberInitData = this.f114103a;
        Intrinsics.checkExpressionValueIsNotNull(selectMemberInitData, "mInitData");
        return new CalendarPickMemberLoader(selectMemberInitData, mo159464b(iGetDataCallback));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159437a(String str, AbstractC45053b<List<C45084c>> bVar) {
        this.f114186i.mo159374a(this.f114109g, mo159466d(), str, mo159462a(bVar));
    }

    @Override // com.ss.android.lark.member_manage.impl.base.mvp.IGroupMemberBaseContract.AbstractC45065a
    /* renamed from: a */
    public void mo159434a(Bundle bundle, IGetDataCallback<SelectMemberInitData> iGetDataCallback) {
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        C57865c.m224574a(new C45089b(bundle.getString("key_chat_id"), bundle.getStringArrayList("key_checked_ids")), new C45090c(this, iGetDataCallback));
    }
}
