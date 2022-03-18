package com.ss.android.lark.mm.module.reaction.panel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.lark.mm.module.reaction.panel.C46822a;
import com.ss.android.lark.mm.module.reaction.panel.MmReactionPanel;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.reaction.p2557b.C52977a;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.mm.module.reaction.panel.a */
public class C46822a extends BaseAdapter {

    /* renamed from: a */
    public MmReactionPanel.AbstractC46820b f117867a;

    /* renamed from: b */
    public long f117868b;

    /* renamed from: c */
    public Runnable f117869c;

    /* renamed from: d */
    private List<String> f117870d;

    /* renamed from: e */
    private GridView f117871e;

    /* renamed from: f */
    private Context f117872f;

    /* renamed from: g */
    private int f117873g;

    /* renamed from: h */
    private int f117874h = -1;

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public List<String> mo164498a() {
        return this.f117870d;
    }

    public int getCount() {
        return this.f117870d.size();
    }

    /* renamed from: com.ss.android.lark.mm.module.reaction.panel.a$a */
    protected class C46824a {

        /* renamed from: a */
        public ImageView f117877a;

        protected C46824a() {
        }
    }

    /* renamed from: a */
    public void mo164499a(int i) {
        this.f117874h = i;
    }

    public Object getItem(int i) {
        return this.f117870d.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C46824a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f117872f).inflate(R.layout.mm_layout_reaction_detail_panel_gridview_item, viewGroup, false);
            aVar = new C46824a();
            aVar.f117877a = (ImageView) view.findViewById(R.id.itemEmoji);
            view.setTag(aVar);
        } else {
            aVar = (C46824a) view.getTag();
        }
        final String str = this.f117870d.get(i);
        if (Objects.equals(str, "#android#reaction#show#more#holder")) {
            aVar.f117877a.setVisibility(8);
        } else if (Objects.equals(str, "#android#reaction#show#nothing#holder")) {
            aVar.f117877a.setVisibility(8);
        } else {
            aVar.f117877a.setVisibility(0);
            C52977a.m205190a().mo180995a(aVar.f117877a, str);
            aVar.f117877a.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.lark.mm.module.reaction.panel.C46822a.View$OnTouchListenerC468231 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m185520a(View view, String str) {
                    if (C46822a.this.f117867a != null) {
                        C46822a.this.f117867a.mo164479a(view, str);
                    }
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        C46822a.this.f117868b = System.currentTimeMillis();
                        C46822a.this.f117869c = new Runnable(view, str) {
                            /* class com.ss.android.lark.mm.module.reaction.panel.$$Lambda$a$1$e_U69TqMfkbk9Ntc6YNH_EkBn8 */
                            public final /* synthetic */ View f$1;
                            public final /* synthetic */ String f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C46822a.View$OnTouchListenerC468231.this.m185520a(this.f$1, this.f$2);
                            }
                        };
                        UICallbackExecutor.executeDelayed(C46822a.this.f117869c, 300);
                    } else if (action == 2) {
                        return false;
                    } else {
                        UICallbackExecutor.removeCallbacks(C46822a.this.f117869c);
                        if (C46822a.this.f117867a != null) {
                            if (action == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                C46822a.this.f117867a.mo164481a(str);
                            }
                            C46822a.this.f117867a.mo164480a(view, str, System.currentTimeMillis() - C46822a.this.f117868b, z);
                        } else {
                            C45855f.m181664c("VcReactionGridAdapter", "action:" + action + ", reactionListener is null");
                        }
                    }
                    return true;
                }
            });
        }
        return view;
    }

    public C46822a(Context context, GridView gridView, List<String> list, int i, MmReactionPanel.AbstractC46820b bVar) {
        this.f117871e = gridView;
        this.f117870d = list;
        this.f117872f = context;
        this.f117873g = i;
        this.f117867a = bVar;
    }
}
