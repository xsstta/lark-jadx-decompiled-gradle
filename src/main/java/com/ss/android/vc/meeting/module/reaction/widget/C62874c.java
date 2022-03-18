package com.ss.android.vc.meeting.module.reaction.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.module.reaction.widget.C62874c;
import com.ss.android.vc.meeting.module.reaction.widget.VcReactionPanel;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.vc.meeting.module.reaction.widget.c */
public class C62874c extends BaseAdapter {

    /* renamed from: a */
    public VcReactionPanel.AbstractC62867b f158322a;

    /* renamed from: b */
    public long f158323b;

    /* renamed from: c */
    public Runnable f158324c;

    /* renamed from: d */
    private List<String> f158325d;

    /* renamed from: e */
    private GridView f158326e;

    /* renamed from: f */
    private Context f158327f;

    /* renamed from: g */
    private int f158328g;

    /* renamed from: h */
    private int f158329h = -1;

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public List<String> mo217255a() {
        return this.f158325d;
    }

    public int getCount() {
        return this.f158325d.size();
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.c$a */
    protected class C62876a {

        /* renamed from: a */
        public ImageView f158332a;

        /* renamed from: b */
        public IconFontView f158333b;

        protected C62876a() {
        }
    }

    /* renamed from: a */
    public void mo217256a(int i) {
        this.f158329h = i;
    }

    public Object getItem(int i) {
        return this.f158325d.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C62876a aVar;
        if (view == null) {
            view = LayoutInflater.from(this.f158327f).inflate(R.layout.layout_vc_reaction_detail_panel_gridview_item, viewGroup, false);
            aVar = new C62876a();
            aVar.f158332a = (ImageView) view.findViewById(R.id.itemEmoji);
            aVar.f158333b = (IconFontView) view.findViewById(R.id.itemEmoji_iconfont);
            view.setTag(aVar);
        } else {
            aVar = (C62876a) view.getTag();
        }
        final String str = this.f158325d.get(i);
        if (Objects.equals(str, "#android#reaction#show#more#holder")) {
            aVar.f158332a.setVisibility(8);
            aVar.f158333b.setVisibility(0);
            aVar.f158333b.setTextColor(C60773o.m236126d(this.f158329h));
        } else if (Objects.equals(str, "#android#reaction#show#nothing#holder")) {
            aVar.f158332a.setVisibility(8);
            aVar.f158333b.setVisibility(8);
        } else {
            aVar.f158332a.setVisibility(0);
            aVar.f158333b.setVisibility(8);
            C52977a.m205190a().mo180995a(aVar.f158332a, str);
            aVar.f158332a.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.vc.meeting.module.reaction.widget.C62874c.View$OnTouchListenerC628751 */

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m246088a(View view, String str) {
                    if (C62874c.this.f158322a != null) {
                        C62874c.this.f158322a.mo217239a(view, str);
                    }
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        C62874c.this.f158323b = System.currentTimeMillis();
                        C62874c.this.f158324c = new Runnable(view, str) {
                            /* class com.ss.android.vc.meeting.module.reaction.widget.$$Lambda$c$1$r53zNKHCdeOGo8QH61FRZ0i3mU */
                            public final /* synthetic */ View f$1;
                            public final /* synthetic */ String f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C62874c.View$OnTouchListenerC628751.this.m246088a(this.f$1, this.f$2);
                            }
                        };
                        C13748k.m55733a(C62874c.this.f158324c, 300);
                    } else if (action == 2) {
                        return false;
                    } else {
                        C13748k.m55735c(C62874c.this.f158324c);
                        if (C62874c.this.f158322a != null) {
                            if (action == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                C62874c.this.f158322a.mo217241a(str);
                            }
                            C62874c.this.f158322a.mo217240a(view, str, System.currentTimeMillis() - C62874c.this.f158323b, z);
                        } else {
                            C60700b.m235851b("VcReactionGridAdapter", "[onTouch]", "action:" + action + ", reactionListener is null");
                        }
                    }
                    return true;
                }
            });
        }
        return view;
    }

    public C62874c(Context context, GridView gridView, List<String> list, int i, VcReactionPanel.AbstractC62867b bVar) {
        this.f158326e = gridView;
        this.f158325d = list;
        this.f158327f = context;
        this.f158328g = i;
        this.f158322a = bVar;
    }
}
