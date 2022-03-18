package com.bytedance.ee.bear.wiki.wikitree.tree.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.bear.wiki.common.widget.InterceptableRecyclerView;
import com.bytedance.ee.bear.wiki.wikitree.bean.NodeType;
import com.bytedance.ee.bear.wiki.wikitree.bean.TreeNode;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.C12179c;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e;
import com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.C13655e;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p702e.C13659d;
import com.bytedance.ee.util.p718t.C13737d;
import com.larksuite.suite.R;
import java.util.ArrayList;
import java.util.List;

public class WikiTreeView extends InterceptableRecyclerView {

    /* renamed from: a */
    public String f32743a = "Wiki_WikiTreeView";

    /* renamed from: b */
    public List<TreeNode> f32744b = new ArrayList();

    /* renamed from: c */
    public AbstractC12170b f32745c;

    /* renamed from: d */
    public String f32746d;

    /* renamed from: e */
    public boolean f32747e;

    /* renamed from: f */
    public boolean f32748f;

    /* renamed from: g */
    public boolean f32749g;

    /* renamed from: h */
    public boolean f32750h;

    /* renamed from: i */
    public boolean f32751i;

    /* renamed from: j */
    public int f32752j;

    /* renamed from: k */
    public boolean f32753k;

    /* renamed from: l */
    public boolean f32754l;

    /* renamed from: q */
    private C12168a f32755q = new C12168a();

    /* renamed from: r */
    private LinearLayoutManager f32756r = new LinearLayoutManager(getContext());

    /* renamed from: s */
    private final AbstractC12170b f32757s;

    /* renamed from: t */
    private String f32758t;

    /* renamed from: u */
    private Runnable f32759u;

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView$b */
    public interface AbstractC12170b {
        /* renamed from: a */
        void mo46553a(TreeNode treeNode);

        /* renamed from: a */
        void mo46554a(TreeNode treeNode, int i);

        /* renamed from: a */
        void mo46555a(TreeNode treeNode, boolean z);

        /* renamed from: b */
        void mo46556b(TreeNode treeNode, boolean z);
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView$c */
    public static class C12171c implements AbstractC12170b {
        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: a */
        public void mo46553a(TreeNode treeNode) {
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: a */
        public void mo46554a(TreeNode treeNode, int i) {
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: a */
        public void mo46555a(TreeNode treeNode, boolean z) {
        }

        @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.AbstractC12170b
        /* renamed from: b */
        public void mo46556b(TreeNode treeNode, boolean z) {
        }
    }

    public String getFocusItem() {
        return this.f32746d;
    }

    @Override // com.ss.android.lark.widget.recyclerview.CommonRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView$a */
    public class C12168a extends RecyclerView.Adapter<C12169a> {
        /* renamed from: a */
        public C12169a onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C12169a(new C12182d(WikiTreeView.this.getContext()));
            }
            if (i == 1) {
                return new C12169a(new C12179c(WikiTreeView.this.getContext()));
            }
            return new C12169a(new C12183e(WikiTreeView.this.getContext()));
        }

        /* renamed from: a */
        public void onBindViewHolder(C12169a aVar, int i) {
            TreeNode treeNode = WikiTreeView.this.f32744b.get(i);
            C12183e eVar = (C12183e) aVar.itemView;
            eVar.mo46605c();
            eVar.mo46612a(R.id.swipe_menu_add, WikiTreeView.this.f32750h);
            eVar.mo46612a(R.id.swipe_menu_more, WikiTreeView.this.f32751i);
            int itemViewType = getItemViewType(i);
            if (itemViewType == 0) {
                m50609a((C12182d) eVar, treeNode, i);
            } else if (itemViewType == 1) {
                m50608a((C12179c) eVar, treeNode, i);
            } else {
                m50611a(eVar, treeNode, i);
            }
            if (WikiTreeView.this.f32753k && !(eVar instanceof C12182d)) {
                eVar.setTile(eVar.getTitle() + treeNode.getDebugAreaIdString());
            }
            if (WikiTreeView.this.f32754l && !(eVar instanceof C12182d)) {
                eVar.setTile(eVar.getTitle() + treeNode.getDebugStatusString());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return WikiTreeView.this.f32744b.size();
        }

        public C12168a() {
            WikiTreeView.this = r1;
        }

        /* renamed from: a */
        private void m50603a(TreeNode treeNode) {
            WikiTreeView.this.f32745c.mo46553a(treeNode);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int i2 = C121671.f32760a[WikiTreeView.this.f32744b.get(i).nodeType.ordinal()];
            if (i2 == 1) {
                return 0;
            }
            if (i2 != 2) {
                return 2;
            }
            return 1;
        }

        /* renamed from: a */
        public int mo46550a(int i) {
            return C13655e.m55410a(50.0f);
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m50605a(TreeNode treeNode, View view) {
            m50603a(treeNode);
        }

        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m50617c(TreeNode treeNode, View view) {
            m50603a(treeNode);
        }

        /* access modifiers changed from: public */
        /* renamed from: e */
        private /* synthetic */ void m50620e(TreeNode treeNode, View view) {
            m50603a(treeNode);
        }

        /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView$a$a */
        public class C12169a extends RecyclerView.ViewHolder {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C12169a(View view) {
                super(view);
                C12168a.this = r1;
            }
        }

        /* access modifiers changed from: public */
        /* renamed from: d */
        private /* synthetic */ void m50619d(TreeNode treeNode, View view) {
            WikiTreeView.this.f32745c.mo46553a(treeNode);
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m50613b(TreeNode treeNode, View view) {
            WikiTreeView.this.f32745c.mo46553a(treeNode);
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m50607a(TreeNode treeNode, boolean z) {
            if (C13737d.m55692a()) {
                WikiTreeView.this.f32745c.mo46555a(treeNode, z);
            }
        }

        /* renamed from: b */
        private void m50615b(C12183e eVar, TreeNode treeNode) {
            boolean z;
            int i;
            if (!WikiTreeView.this.mo46539c(treeNode.wiki_token) || !TextUtils.equals(WikiTreeView.this.f32746d, treeNode.wiki_token)) {
                z = false;
            } else {
                z = true;
            }
            if (treeNode.obj_type == 11) {
                if (z) {
                    i = R.drawable.icon_wikifile_mindnote;
                } else {
                    i = R.drawable.icon_wikifile_mindnote_outline;
                }
            } else if (treeNode.obj_type == 3) {
                if (z) {
                    i = R.drawable.icon_wikifile_sheet;
                } else {
                    i = R.drawable.icon_wikifile_sheet_outline;
                }
            } else if (treeNode.obj_type == 22) {
                if (z) {
                    i = R.drawable.ic_icon_wiki_tree_select;
                } else {
                    i = R.drawable.ic_icon_wiki_tree;
                }
            } else if (z) {
                i = R.drawable.icon_wikifile_doc;
            } else {
                i = R.drawable.icon_wikifile_doc_outline;
            }
            eVar.setIcon(i);
        }

        /* renamed from: a */
        private void m50610a(C12183e eVar, TreeNode treeNode) {
            boolean z;
            int i;
            if (!WikiTreeView.this.mo46539c(treeNode.wiki_token) || !TextUtils.equals(WikiTreeView.this.f32746d, treeNode.wiki_token)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = R.drawable.icon_tool_home_down;
            } else {
                i = R.drawable.icon_tool_home_nor;
            }
            eVar.setIcon(i);
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m50612b(TreeNode treeNode, int i, View view) {
            WikiTreeView.this.f32745c.mo46554a(treeNode, i);
        }

        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m50616c(TreeNode treeNode, int i, View view) {
            WikiTreeView.this.f32745c.mo46554a(treeNode, i);
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m50604a(TreeNode treeNode, int i, View view) {
            WikiTreeView.this.f32745c.mo46554a(treeNode, i);
        }

        /* access modifiers changed from: public */
        /* renamed from: c */
        private /* synthetic */ void m50618c(TreeNode treeNode, View view, boolean z) {
            WikiTreeView.this.f32745c.mo46556b(treeNode, z);
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m50606a(TreeNode treeNode, View view, boolean z) {
            WikiTreeView.this.f32745c.mo46556b(treeNode, z);
        }

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m50614b(TreeNode treeNode, View view, boolean z) {
            WikiTreeView.this.f32745c.mo46556b(treeNode, z);
        }

        /* renamed from: a */
        private void m50609a(C12182d dVar, TreeNode treeNode, int i) {
            boolean z;
            m50610a(dVar, treeNode);
            dVar.setFocus(TextUtils.equals(treeNode.wiki_token, WikiTreeView.this.f32746d));
            if (!WikiTreeView.this.f32747e || !WikiTreeView.this.f32748f) {
                z = false;
            } else {
                z = true;
            }
            dVar.setSwipeMenuEnable(z);
            dVar.setMenuClickEnable(WikiTreeView.this.f32749g);
            dVar.setItemClickListener(new C12183e.AbstractC12188a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$7m8blYbi2iRnTKUZP3eL3KPAQf8 */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.AbstractC12188a
                public final void onItemClick(View view) {
                    WikiTreeView.C12168a.lambda$7m8blYbi2iRnTKUZP3eL3KPAQf8(WikiTreeView.C12168a.this, this.f$1, view);
                }
            });
            dVar.setSwipeMenuClickListener(new AbstractC12174a.AbstractC12175a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$wFyHEpFtyb32AfnyyNe9IlMkCRs */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a.AbstractC12175a
                public final void onMenuItemClick(int i, View view) {
                    WikiTreeView.C12168a.lambda$wFyHEpFtyb32AfnyyNe9IlMkCRs(WikiTreeView.C12168a.this, this.f$1, i, view);
                }
            });
            dVar.setUserSwipeMenuListener(new AbstractC12174a.AbstractC12176b(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$yTVjLfu8FC65ebKoTff33EZhzQM */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a.AbstractC12176b
                public final void onUserSwipeMenu(View view, boolean z) {
                    WikiTreeView.C12168a.lambda$yTVjLfu8FC65ebKoTff33EZhzQM(WikiTreeView.C12168a.this, this.f$1, view, z);
                }
            });
        }

        /* renamed from: a */
        private void m50608a(C12179c cVar, TreeNode treeNode, int i) {
            m50615b(cVar, treeNode);
            if (!WikiTreeView.this.mo46539c(treeNode.wiki_token)) {
                cVar.setTile(treeNode.title);
                cVar.mo46614a(treeNode.level, WikiTreeView.this.f32752j);
                cVar.setLoading(false);
                cVar.setFocus(false);
                cVar.setSwipeMenuEnable(false);
                cVar.setMenuClickEnable(false);
                cVar.setItemEnable(false);
                cVar.setExpandClickListener(null);
                cVar.setItemClickListener(new C12183e.AbstractC12188a(treeNode) {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$AS9bpwvMEAvTvJVuZBD1BclQDE */
                    public final /* synthetic */ TreeNode f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.AbstractC12188a
                    public final void onItemClick(View view) {
                        WikiTreeView.C12168a.m270089lambda$AS9bpwvMEAvTvJVuZBD1BclQDE(WikiTreeView.C12168a.this, this.f$1, view);
                    }
                });
                return;
            }
            cVar.setTile(treeNode.title);
            cVar.setLoading(false);
            cVar.setExpand(treeNode.expand);
            cVar.setFocus(TextUtils.equals(treeNode.wiki_token, WikiTreeView.this.f32746d));
            cVar.mo46614a(treeNode.level, WikiTreeView.this.f32752j);
            cVar.setSwipeMenuEnable(WikiTreeView.this.f32747e);
            cVar.setMenuClickEnable(WikiTreeView.this.f32749g);
            cVar.setExpandClickListener(new C12179c.AbstractC12181a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$IiYSnc5KkkAPCa8HlWVKpTSPXU */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12179c.AbstractC12181a
                public final void onExpandClick(boolean z) {
                    WikiTreeView.C12168a.m270091lambda$IiYSnc5KkkAPCa8HlWVKpTSPXU(WikiTreeView.C12168a.this, this.f$1, z);
                }
            });
            cVar.setItemClickListener(new C12183e.AbstractC12188a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$Cjeh5HcNSEXYOm7WXLhfb6MhcA */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.AbstractC12188a
                public final void onItemClick(View view) {
                    WikiTreeView.C12168a.m270090lambda$Cjeh5HcNSEXYOm7WXLhfb6MhcA(WikiTreeView.C12168a.this, this.f$1, view);
                }
            });
            cVar.setSwipeMenuClickListener(new AbstractC12174a.AbstractC12175a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$oZesu_NDd3RSD01vvFWLhzrsIe8 */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a.AbstractC12175a
                public final void onMenuItemClick(int i, View view) {
                    WikiTreeView.C12168a.lambda$oZesu_NDd3RSD01vvFWLhzrsIe8(WikiTreeView.C12168a.this, this.f$1, i, view);
                }
            });
            cVar.setUserSwipeMenuListener(new AbstractC12174a.AbstractC12176b(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$fKLahuhowi6nEKMNiUs_xwsKGQY */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a.AbstractC12176b
                public final void onUserSwipeMenu(View view, boolean z) {
                    WikiTreeView.C12168a.lambda$fKLahuhowi6nEKMNiUs_xwsKGQY(WikiTreeView.C12168a.this, this.f$1, view, z);
                }
            });
        }

        /* renamed from: a */
        private void m50611a(C12183e eVar, TreeNode treeNode, int i) {
            m50615b(eVar, treeNode);
            if (!WikiTreeView.this.mo46539c(treeNode.wiki_token)) {
                eVar.setTile(treeNode.title);
                eVar.mo46614a(treeNode.level, WikiTreeView.this.f32752j);
                eVar.setFocus(false);
                eVar.setSwipeMenuEnable(false);
                eVar.setMenuClickEnable(false);
                eVar.setItemEnable(false);
                eVar.setItemClickListener(new C12183e.AbstractC12188a(treeNode) {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$dgx15Ria1nEK1ChOSDl1WzHvox0 */
                    public final /* synthetic */ TreeNode f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.AbstractC12188a
                    public final void onItemClick(View view) {
                        WikiTreeView.C12168a.lambda$dgx15Ria1nEK1ChOSDl1WzHvox0(WikiTreeView.C12168a.this, this.f$1, view);
                    }
                });
                return;
            }
            eVar.setTile(treeNode.title);
            eVar.setFocus(TextUtils.equals(WikiTreeView.this.f32746d, treeNode.wiki_token));
            eVar.mo46614a(treeNode.level, WikiTreeView.this.f32752j);
            eVar.setSwipeMenuEnable(WikiTreeView.this.f32747e);
            eVar.setMenuClickEnable(WikiTreeView.this.f32749g);
            eVar.setItemClickListener(new C12183e.AbstractC12188a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$NsjD1nmVk1nCVhKEGVJQkpZRcc */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.C12183e.AbstractC12188a
                public final void onItemClick(View view) {
                    WikiTreeView.C12168a.m270092lambda$NsjD1nmVk1nCVhKEGVJQkpZRcc(WikiTreeView.C12168a.this, this.f$1, view);
                }
            });
            eVar.setSwipeMenuClickListener(new AbstractC12174a.AbstractC12175a(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$OqnGzrMPxp4QwHWv2NOHcqbcxFg */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a.AbstractC12175a
                public final void onMenuItemClick(int i, View view) {
                    WikiTreeView.C12168a.lambda$OqnGzrMPxp4QwHWv2NOHcqbcxFg(WikiTreeView.C12168a.this, this.f$1, i, view);
                }
            });
            eVar.setUserSwipeMenuListener(new AbstractC12174a.AbstractC12176b(treeNode) {
                /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$a$i0CoZKQlF1sHM4zQ_s5sA_718RE */
                public final /* synthetic */ TreeNode f$1;

                {
                    this.f$1 = r2;
                }

                @Override // com.bytedance.ee.bear.wiki.wikitree.tree.view.AbstractC12174a.AbstractC12176b
                public final void onUserSwipeMenu(View view, boolean z) {
                    WikiTreeView.C12168a.lambda$i0CoZKQlF1sHM4zQ_s5sA_718RE(WikiTreeView.C12168a.this, this.f$1, view, z);
                }
            });
        }
    }

    /* renamed from: f */
    private boolean m50594f() {
        if (this.f32744b.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.lark.widget.recyclerview.CommonRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f32759u;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    /* renamed from: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView$1 */
    public static /* synthetic */ class C121671 {

        /* renamed from: a */
        static final /* synthetic */ int[] f32760a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.bytedance.ee.bear.wiki.wikitree.bean.NodeType[] r0 = com.bytedance.ee.bear.wiki.wikitree.bean.NodeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.C121671.f32760a = r0
                com.bytedance.ee.bear.wiki.wikitree.bean.NodeType r1 = com.bytedance.ee.bear.wiki.wikitree.bean.NodeType.HOME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.C121671.f32760a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.ee.bear.wiki.wikitree.bean.NodeType r1 = com.bytedance.ee.bear.wiki.wikitree.bean.NodeType.DIR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.wiki.wikitree.tree.view.WikiTreeView.C121671.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m50588a() {
        m50590b();
        setLayoutManager(this.f32756r);
        setItemAnimator(null);
        setAdapter(this.f32755q);
    }

    /* renamed from: e */
    private void m50592e() {
        int i = 0;
        for (TreeNode treeNode : this.f32744b) {
            if (treeNode.level > i) {
                i = treeNode.level;
            }
        }
        this.f32752j = i;
    }

    /* renamed from: b */
    private void m50590b() {
        PersistenceSharedPreference aVar = new PersistenceSharedPreference("debug_config");
        this.f32753k = ((Boolean) aVar.mo34038b("wikitree_show_areaId", Boolean.FALSE)).booleanValue();
        this.f32754l = ((Boolean) aVar.mo34038b("wikitree_show_status", Boolean.FALSE)).booleanValue();
    }

    /* renamed from: b */
    private boolean m50591b(int i) {
        if (i < 0 || i >= this.f32744b.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo46534a(String str) {
        int d = mo46540d(str);
        if (m50591b(d)) {
            this.f32755q.notifyItemChanged(d);
        }
    }

    /* renamed from: d */
    public int mo46540d(String str) {
        return C13659d.m55428a(this.f32744b, new C13659d.AbstractC13660a(str) {
            /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$GUzLNavdsD12NAosFw8t_eKuEHs */
            public final /* synthetic */ String f$0;

            {
                this.f$0 = r1;
            }

            @Override // com.bytedance.ee.util.p702e.C13659d.AbstractC13660a
            public final boolean accept(Object obj) {
                return WikiTreeView.lambda$GUzLNavdsD12NAosFw8t_eKuEHs(this.f$0, (TreeNode) obj);
            }
        });
    }

    public void setEnableMenuItemAdd(boolean z) {
        this.f32750h = z;
        if (!m50594f()) {
            this.f32755q.notifyDataSetChanged();
        }
    }

    public void setEnableMenuItemClick(boolean z) {
        this.f32749g = z;
        if (!m50594f()) {
            this.f32755q.notifyDataSetChanged();
        }
    }

    public void setEnableMenuItemMore(boolean z) {
        this.f32751i = z;
        if (!m50594f()) {
            this.f32755q.notifyDataSetChanged();
        }
    }

    public void setEnableSwipeMenu(boolean z) {
        this.f32747e = z;
        if (!m50594f()) {
            this.f32755q.notifyDataSetChanged();
        }
    }

    public void setListener(AbstractC12170b bVar) {
        this.f32745c = (AbstractC12170b) C13657b.m55418a(bVar, this.f32757s);
    }

    /* renamed from: c */
    public boolean mo46539c(String str) {
        if (TextUtils.isEmpty(this.f32758t) || !TextUtils.equals(this.f32758t, str)) {
            return true;
        }
        return false;
    }

    public void setEnableHomeSwipe(boolean z) {
        this.f32748f = z;
        if (!m50594f() && this.f32744b.get(0).nodeType == NodeType.HOME) {
            this.f32755q.notifyItemChanged(0);
        }
    }

    /* renamed from: a */
    public RecyclerView.ViewHolder mo46533a(int i) {
        int i2;
        View childAt;
        int findFirstVisibleItemPosition = this.f32756r.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition == -1 || (i2 = i - findFirstVisibleItemPosition) < 0 || (childAt = getChildAt(i2)) == null) {
            return null;
        }
        return getChildViewHolder(childAt);
    }

    public void setDisableItem(String str) {
        String str2 = this.f32758t;
        this.f32758t = str;
        if (!m50594f()) {
            int d = mo46540d(str2);
            int d2 = mo46540d(this.f32758t);
            if (m50591b(d)) {
                this.f32755q.notifyItemChanged(d);
            }
            if (m50591b(d2)) {
                this.f32755q.notifyItemChanged(d2);
            }
        }
    }

    public void setFocusItem(String str) {
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f32746d;
            this.f32746d = str;
            if (!m50594f()) {
                int d = mo46540d(str2);
                int d2 = mo46540d(this.f32746d);
                if (m50591b(d)) {
                    this.f32755q.notifyItemChanged(d);
                }
                if (m50591b(d2)) {
                    this.f32755q.notifyItemChanged(d2);
                }
            }
        }
    }

    public WikiTreeView(Context context) {
        super(context);
        C12171c cVar = new C12171c();
        this.f32757s = cVar;
        this.f32745c = cVar;
        this.f32758t = null;
        this.f32746d = null;
        this.f32747e = false;
        this.f32748f = false;
        this.f32749g = true;
        this.f32750h = false;
        this.f32751i = false;
        this.f32759u = null;
        this.f32752j = 0;
        this.f32753k = false;
        this.f32754l = false;
        m50588a();
    }

    /* renamed from: b */
    public void m50593e(String str) {
        int d = mo46540d(str);
        if (m50591b(d)) {
            int height = getHeight();
            if (height <= 0) {
                C13479a.m54764b(this.f32743a, "WikiTreeView.scrollToCenter(), total height is 0, post delay");
                Runnable runnable = this.f32759u;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                $$Lambda$WikiTreeView$4FbYCwrDy87udfMgTA0Q63BXABM r0 = new Runnable(str) {
                    /* class com.bytedance.ee.bear.wiki.wikitree.tree.view.$$Lambda$WikiTreeView$4FbYCwrDy87udfMgTA0Q63BXABM */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        WikiTreeView.lambda$4FbYCwrDy87udfMgTA0Q63BXABM(WikiTreeView.this, this.f$1);
                    }
                };
                this.f32759u = r0;
                post(r0);
                return;
            }
            this.f32756r.scrollToPositionWithOffset(d, (height / 2) - (this.f32755q.mo46550a(d) / 2));
        }
    }

    /* renamed from: a */
    public void mo46536a(List<TreeNode> list) {
        this.f32744b = list;
        m50592e();
        this.f32755q.notifyDataSetChanged();
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m50589a(String str, TreeNode treeNode) {
        return TextUtils.equals(treeNode.wiki_token, str);
    }

    /* renamed from: a */
    public void mo46535a(String str, boolean z) {
        RecyclerView.ViewHolder a;
        int d = mo46540d(str);
        if (m50591b(d) && (a = mo46533a(d)) != null && (a.itemView instanceof C12179c)) {
            ((C12179c) a.itemView).setLoading(z);
        }
    }

    public WikiTreeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12171c cVar = new C12171c();
        this.f32757s = cVar;
        this.f32745c = cVar;
        this.f32758t = null;
        this.f32746d = null;
        this.f32747e = false;
        this.f32748f = false;
        this.f32749g = true;
        this.f32750h = false;
        this.f32751i = false;
        this.f32759u = null;
        this.f32752j = 0;
        this.f32753k = false;
        this.f32754l = false;
        m50588a();
    }

    /* renamed from: b */
    public void mo46538b(String str, boolean z) {
        RecyclerView.ViewHolder a;
        int d = mo46540d(str);
        if (m50591b(d) && (a = mo46533a(d)) != null && (a.itemView instanceof AbstractC12174a)) {
            AbstractC12174a aVar = (AbstractC12174a) a.itemView;
            if (z) {
                aVar.mo46602a();
            } else {
                aVar.mo46603b();
            }
        }
    }

    public WikiTreeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C12171c cVar = new C12171c();
        this.f32757s = cVar;
        this.f32745c = cVar;
        this.f32758t = null;
        this.f32746d = null;
        this.f32747e = false;
        this.f32748f = false;
        this.f32749g = true;
        this.f32750h = false;
        this.f32751i = false;
        this.f32759u = null;
        this.f32752j = 0;
        this.f32753k = false;
        this.f32754l = false;
        m50588a();
    }
}
