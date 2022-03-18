package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView;
import com.bytedance.ee.bear.wiki.search.C12033c;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.WikiTreeType;
import com.larksuite.framework.mvp.IView;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.b */
public interface AbstractC12177b extends IView<AbstractC12178a> {

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.b$a */
    public interface AbstractC12178a extends IView.IViewDelegate {
        /* renamed from: a */
        void mo46439a(TreeNode treeNode);

        /* renamed from: a */
        void mo46440a(TreeNode treeNode, int i);

        /* renamed from: a */
        void mo46460a(String str, String str2);

        void a_(String str);

        /* renamed from: b */
        void mo46446b(TreeNode treeNode);

        /* renamed from: c */
        void mo46449c(TreeNode treeNode);

        /* renamed from: d */
        void mo46462d(TreeNode treeNode);

        /* renamed from: e */
        void mo46463e(TreeNode treeNode);

        /* renamed from: o */
        void mo46465o();

        /* renamed from: p */
        void mo46466p();

        /* renamed from: q */
        void mo46467q();

        /* renamed from: r */
        void mo46468r();

        /* renamed from: s */
        void mo46469s();

        /* renamed from: t */
        void mo46470t();
    }

    /* renamed from: a */
    void mo46557a();

    /* renamed from: a */
    void mo46558a(int i);

    /* renamed from: a */
    void mo46559a(int i, int i2);

    /* renamed from: a */
    void mo46561a(FragmentActivity fragmentActivity, C10917c cVar, WikiTreeType wikiTreeType);

    /* renamed from: a */
    void mo46563a(String str);

    /* renamed from: a */
    void mo46564a(String str, boolean z);

    /* renamed from: a */
    void mo46565a(List<TreeNode> list);

    /* renamed from: b */
    void mo46566b();

    /* renamed from: b */
    void mo46567b(int i);

    /* renamed from: b */
    void mo46568b(int i, int i2);

    /* renamed from: b */
    void mo46569b(String str);

    /* renamed from: b */
    void mo46570b(List<C12033c> list);

    /* renamed from: c */
    void mo46571c();

    /* renamed from: c */
    void mo46572c(String str);

    /* renamed from: d */
    void mo46573d();

    /* renamed from: d */
    void mo46574d(String str);

    /* renamed from: e */
    List<Integer> mo46575e(String str);

    /* renamed from: e */
    void mo46576e();

    /* renamed from: f */
    void mo46577f();

    /* renamed from: g */
    void mo46578g();

    /* renamed from: h */
    void mo46579h();

    /* renamed from: i */
    void mo46580i();

    /* renamed from: j */
    void mo46581j();

    /* renamed from: k */
    void mo46582k();

    void setDisableItem(String str);

    void setEnableActionMove(boolean z);

    void setEnableActionRemove(boolean z);

    void setEnableHomeSwipe(boolean z);

    void setEnableMenuItemAdd(boolean z);

    void setEnableMenuItemClick(boolean z);

    void setEnableMenuItemMore(boolean z);

    void setEnableSwipeMenu(boolean z);

    void setFocusItem(String str);

    void setRefreshLayoutEnableLoadMore(boolean z);

    void setSearchEnabled(boolean z);

    void setSearchNoResultViewPosition(int i);

    void setSearchVisible(boolean z);

    void setTagSuffix(String str);

    void setTouchInterceptor(InterceptableRecyclerView.AbstractC11939a aVar);

    void setWikiTreeFlingListener(RecyclerView.AbstractC1337f fVar);

    void setWikiTreeVisible(boolean z);
}
