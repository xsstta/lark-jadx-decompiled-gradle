package com.ss.android.lark.tab.space.list;

import android.app.Activity;
import android.content.Context;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.tab.space.list.entity.BaseListViewData;
import com.ss.android.lark.tab.space.list.entity.SpaceListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.CommonListTabPresenter;
import com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabModel;
import com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabView;
import com.ss.android.lark.tab.space.list.mvp.space.SpaceListTabViewDelegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0015\u0018\u00010\u0014J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0014H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator;", "", "context", "Landroid/app/Activity;", ShareHitPoint.f121869d, "", "chatId", "", "viewDependency", "Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;", "(Landroid/app/Activity;ILjava/lang/String;Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;)V", "getChatId", "()Ljava/lang/String;", "getContext", "()Landroid/app/Activity;", "getType", "()I", "getViewDependency", "()Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;", "build", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabPresenter;", "Lcom/ss/android/lark/tab/space/list/entity/BaseListViewData;", "buildSpacePresenter", "Lcom/ss/android/lark/tab/space/list/entity/SpaceListViewData;", "ViewDependency", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.a */
public final class CommonListTabMVPCreator {

    /* renamed from: a */
    private final Activity f136446a;

    /* renamed from: b */
    private final int f136447b;

    /* renamed from: c */
    private final String f136448c;

    /* renamed from: d */
    private final ViewDependency f136449d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH&J\u001a\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007H&¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/tab/space/list/CommonListTabMVPCreator$ViewDependency;", "", "openChat", "", "context", "Landroid/content/Context;", "chatId", "", "position", "", "openThreadDetail", "threadId", "threadPosition", "openUrl", "url", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.tab.space.list.a$a */
    public interface ViewDependency {
        /* renamed from: a */
        void mo188433a(Context context, String str);

        /* renamed from: a */
        void mo188434a(Context context, String str, int i);

        /* renamed from: b */
        void mo188435b(Context context, String str, int i);
    }

    /* renamed from: a */
    public final CommonListTabPresenter<? extends BaseListViewData> mo188436a() {
        if (this.f136447b != 1) {
            return null;
        }
        return m214419b();
    }

    /* renamed from: b */
    private final CommonListTabPresenter<SpaceListViewData> m214419b() {
        SpaceListTabModel aVar = new SpaceListTabModel(this.f136448c, this.f136447b);
        SpaceListTabView bVar = new SpaceListTabView(this.f136446a);
        return new CommonListTabPresenter<>(aVar, bVar, new SpaceListTabViewDelegate(bVar, aVar, this.f136449d));
    }

    public CommonListTabMVPCreator(Activity activity, int i, String str, ViewDependency aVar) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(aVar, "viewDependency");
        this.f136446a = activity;
        this.f136447b = i;
        this.f136448c = str;
        this.f136449d = aVar;
    }
}
