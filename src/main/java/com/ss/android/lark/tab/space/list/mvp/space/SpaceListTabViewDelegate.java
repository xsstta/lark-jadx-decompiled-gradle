package com.ss.android.lark.tab.space.list.mvp.space;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.lark.statistics.extensions.IParam;
import com.ss.android.lark.tab.space.list.CommonListTabMVPCreator;
import com.ss.android.lark.tab.space.list.entity.SpaceListViewData;
import com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract;
import com.ss.android.lark.tab.space.list.mvp.base.adapter.CommonListTabViewDelegate;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import com.ss.android.lark.utils.C57859q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/space/SpaceListTabViewDelegate;", "Lcom/ss/android/lark/tab/space/list/mvp/base/adapter/CommonListTabViewDelegate;", "Lcom/ss/android/lark/tab/space/list/entity/SpaceListViewData;", "view", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;", "model", "Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;", "viewDependency", "Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;", "(Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IView;Lcom/ss/android/lark/tab/space/list/mvp/ICommonListTabContract$IModel;Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;)V", "getViewDependency", "()Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;", "onItemClick", "", "viewData", "position", "", "onItemPartialClick", "reportClickDocEvent", "reportClickJumpToChatEvent", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.space.c */
public final class SpaceListTabViewDelegate extends CommonListTabViewDelegate<SpaceListViewData> {

    /* renamed from: a */
    private final CommonListTabMVPCreator.ViewDependency f136517a;

    /* renamed from: a */
    private final void m214541a(SpaceListViewData spaceListViewData) {
        String c = C57859q.m224567c(spaceListViewData.getDocId());
        ChatTabHitPoint.ChatTabExtraParam.Click click = ChatTabHitPoint.ChatTabExtraParam.Click.DOC;
        ChatTabHitPoint.ChatTabExtraParam.Target target = ChatTabHitPoint.ChatTabExtraParam.Target.CCM_DOCS_PAGE_VIEW;
        ChatTabHitPoint chatTabHitPoint = ChatTabHitPoint.f136619a;
        IParam plus = click.plus(target);
        Intrinsics.checkExpressionValueIsNotNull(c, "docId");
        chatTabHitPoint.mo188722a(plus, c);
    }

    /* renamed from: b */
    private final void m214542b(SpaceListViewData spaceListViewData) {
        String c = C57859q.m224567c(spaceListViewData.getDocId());
        ChatTabHitPoint.ChatTabExtraParam.Click click = ChatTabHitPoint.ChatTabExtraParam.Click.JUMP_TO_CHAT;
        ChatTabHitPoint.ChatTabExtraParam.Target target = ChatTabHitPoint.ChatTabExtraParam.Target.IM_CHAT_MAIN_VIEW;
        ChatTabHitPoint chatTabHitPoint = ChatTabHitPoint.f136619a;
        IParam plus = click.plus(target);
        Intrinsics.checkExpressionValueIsNotNull(c, "docId");
        chatTabHitPoint.mo188722a(plus, c);
    }

    /* renamed from: a */
    public void mo188494a(SpaceListViewData spaceListViewData, int i) {
        String str;
        Intrinsics.checkParameterIsNotNull(spaceListViewData, "viewData");
        Context b = mo188526c().mo188490b();
        if (b != null) {
            if (spaceListViewData.isWiki()) {
                str = spaceListViewData.getWikiUrl();
            } else {
                str = spaceListViewData.getDocUrl();
            }
            this.f136517a.mo188433a(b, str);
            m214541a(spaceListViewData);
        }
    }

    /* renamed from: b */
    public void mo188496b(SpaceListViewData spaceListViewData, int i) {
        Intrinsics.checkParameterIsNotNull(spaceListViewData, "viewData");
        Context b = mo188526c().mo188490b();
        if (b != null) {
            if (TextUtils.isEmpty(spaceListViewData.getThreadId())) {
                this.f136517a.mo188434a(b, mo188527d().mo188481a(), spaceListViewData.getPosition());
            } else {
                String threadId = spaceListViewData.getThreadId();
                if (threadId != null) {
                    this.f136517a.mo188435b(b, threadId, spaceListViewData.getThreadPosition());
                }
            }
            m214542b(spaceListViewData);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceListTabViewDelegate(ICommonListTabContract.IView<SpaceListViewData> bVar, ICommonListTabContract.IModel<SpaceListViewData> aVar, CommonListTabMVPCreator.ViewDependency aVar2) {
        super(bVar, aVar);
        Intrinsics.checkParameterIsNotNull(bVar, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "model");
        Intrinsics.checkParameterIsNotNull(aVar2, "viewDependency");
        this.f136517a = aVar2;
    }
}
