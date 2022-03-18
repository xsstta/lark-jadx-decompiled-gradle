package com.ss.android.lark.tab.space.list.mvp.space;

import android.app.Activity;
import com.larksuite.suite.R;
import com.ss.android.lark.tab.space.list.entity.SpaceListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView;
import com.ss.android.lark.tab.statistics.ChatTabHitPoint;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/space/SpaceListTabView;", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabView;", "Lcom/ss/android/lark/tab/space/list/entity/SpaceListViewData;", "hostActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "create", "", "showEmptyResultView", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.space.b */
public final class SpaceListTabView extends CommonListTabView<SpaceListViewData> {
    @Override // com.larksuite.framework.mvp.ILifecycle, com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView
    public void create() {
        super.create();
        ChatTabHitPoint.f136619a.mo188728e();
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.base.CommonListTabView
    /* renamed from: h */
    public void mo188503h() {
        super.mo188503h();
        mo188501f().setImageResource(R.drawable.icon_no_content);
    }

    public SpaceListTabView(Activity activity) {
        super(activity);
    }
}
