package com.bytedance.ee.bear.wikiv2.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.contract.route.parcelable.AbstractC5226b;
import com.bytedance.ee.bear.list.homepage.title.AbstractC8505c;
import com.bytedance.ee.util.p718t.C13751m;
import com.larksuite.suite.R;
import com.ss.android.lark.maincore.ITitleController;
import com.ss.android.lark.maincore.ITitleInfo;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002\u001a2\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\t\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"TAG", "", "createSearchMenuView", "Landroid/view/View;", "context", "Landroid/content/Context;", "listener", "Landroid/view/View$OnClickListener;", "createTitleBar", "Lcom/bytedance/ee/bear/list/homepage/title/ITitleBar;", "larkTitleController", "Lcom/ss/android/lark/maincore/ITitleController;", "wikiCallback", "Lcom/bytedance/ee/bear/contract/route/parcelable/IWikiHomeFragment$WikiCallback;", "Landroidx/fragment/app/FragmentActivity;", "container", "Landroid/view/ViewGroup;", "root", "getTitleInfo", "Lcom/ss/android/lark/maincore/ITitleInfo;", "titleBar", "wiki-implv2_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.home.e */
public final class C12286e {
    /* renamed from: a */
    public static final ITitleInfo m51165a(AbstractC8505c cVar) {
        if (cVar instanceof LarkWikiTitleBar) {
            return ((LarkWikiTitleBar) cVar).mo46814b();
        }
        return null;
    }

    /* renamed from: a */
    public static final View m51163a(Context context, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(context);
        C13751m.m55764a(imageView, context.getResources(), R.drawable.ud_icon_search_outlined, null, context.getResources().getColor(R.color.icon_n1));
        imageView.setOnClickListener(onClickListener);
        return imageView;
    }

    /* renamed from: a */
    public static final AbstractC8505c m51164a(ITitleController iTitleController, AbstractC5226b.AbstractC5227a aVar, FragmentActivity fragmentActivity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "context");
        Intrinsics.checkParameterIsNotNull(viewGroup, "container");
        Intrinsics.checkParameterIsNotNull(viewGroup2, "root");
        if (iTitleController != null && iTitleController.mo99193b() == ITitleController.Style.New) {
            return new LarkWikiTitleBar(fragmentActivity, iTitleController, aVar);
        }
        View inflate = LayoutInflater.from(fragmentActivity).inflate(R.layout.wiki_main_tab_title_bar_v2, viewGroup, false);
        if (inflate != null) {
            DemoWikiTitleBar demoWikiTitleBar = (DemoWikiTitleBar) inflate;
            demoWikiTitleBar.mo46813a(viewGroup2);
            return demoWikiTitleBar;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ee.bear.wikiv2.home.DemoWikiTitleBar");
    }
}
