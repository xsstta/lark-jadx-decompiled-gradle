package com.ss.android.vc.meeting.module.reaction.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.widget.IconFontView;
import com.ss.android.vc.meeting.module.reaction.widget.C62868b;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.reaction.widget.b */
public class C62868b extends BaseAdapter {

    /* renamed from: a */
    public AbstractC62872a f158307a;

    /* renamed from: b */
    public long f158308b;

    /* renamed from: c */
    public Runnable f158309c;

    /* renamed from: d */
    private List<String> f158310d;

    /* renamed from: e */
    private Context f158311e;

    /* renamed from: f */
    private boolean f158312f;

    /* renamed from: g */
    private int f158313g = -1;

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.b$a */
    public interface AbstractC62872a {
        /* renamed from: a */
        void mo217251a(View view);

        /* renamed from: a */
        void mo217252a(View view, String str);

        /* renamed from: a */
        void mo217253a(View view, String str, long j, boolean z);

        /* renamed from: a */
        void mo217254a(String str);
    }

    /* renamed from: com.ss.android.vc.meeting.module.reaction.widget.b$b */
    public static class C62873b {

        /* renamed from: a */
        public View f158319a;

        /* renamed from: b */
        public ImageView f158320b;

        /* renamed from: c */
        public IconFontView f158321c;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getCount() {
        if (this.f158312f) {
            return this.f158310d.size() + 1;
        }
        return this.f158310d.size();
    }

    /* renamed from: a */
    public void mo217243a(int i) {
        this.f158313g = i;
    }

    public Object getItem(int i) {
        if (i < this.f158310d.size()) {
            return this.f158310d.get(i);
        }
        return new Object();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C62873b bVar;
        if (view == null) {
            view = LayoutInflater.from(this.f158311e).inflate(R.layout.vc_item_reaction_first_line, viewGroup, false);
            bVar = new C62873b();
            bVar.f158319a = view;
            bVar.f158320b = (ImageView) view.findViewById(R.id.reaction_image);
            bVar.f158321c = (IconFontView) view.findViewById(R.id.reaction_iconfont);
            view.setTag(bVar);
        } else {
            bVar = (C62873b) view.getTag();
        }
        if (i < this.f158310d.size()) {
            final String str = this.f158310d.get(i);
            C52977a.m205190a().mo180995a(bVar.f158320b, str);
            bVar.f158320b.setVisibility(0);
            bVar.f158321c.setVisibility(8);
            bVar.f158319a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.reaction.widget.C62868b.View$OnClickListenerC628691 */

                public void onClick(View view) {
                    if (C62868b.this.f158307a != null) {
                        C62868b.this.f158307a.mo217254a(str);
                    }
                }
            });
            bVar.f158319a.setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.vc.meeting.module.reaction.widget.C62868b.View$OnTouchListenerC628702 */

                /* access modifiers changed from: private */
                /* renamed from: a */
                public /* synthetic */ void m246081a(View view, String str) {
                    if (C62868b.this.f158307a != null) {
                        C62868b.this.f158307a.mo217252a(view, str);
                    }
                }

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        C62868b.this.f158308b = System.currentTimeMillis();
                        C62868b.this.f158309c = new Runnable(view, str) {
                            /* class com.ss.android.vc.meeting.module.reaction.widget.$$Lambda$b$2$xmEd50Wo84Cu_qiObpUhL9hh408 */
                            public final /* synthetic */ View f$1;
                            public final /* synthetic */ String f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void run() {
                                C62868b.View$OnTouchListenerC628702.lambda$xmEd50Wo84Cu_qiObpUhL9hh408(C62868b.View$OnTouchListenerC628702.this, this.f$1, this.f$2);
                            }
                        };
                        C13748k.m55733a(C62868b.this.f158309c, 300);
                    } else if (action == 2) {
                        return false;
                    } else {
                        C13748k.m55735c(C62868b.this.f158309c);
                        if (C62868b.this.f158307a != null) {
                            if (action == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                C62868b.this.f158307a.mo217254a(str);
                            }
                            C62868b.this.f158307a.mo217253a(view, str, System.currentTimeMillis() - C62868b.this.f158308b, z);
                        } else {
                            C60700b.m235851b("VcReactionFirstLineAdapter", "[onTouch]", "action:" + action + ", reactionListener is null");
                        }
                    }
                    return true;
                }
            });
        } else {
            bVar.f158320b.setVisibility(8);
            bVar.f158321c.setVisibility(0);
            bVar.f158321c.setTextColor(C60773o.m236126d(this.f158313g));
            bVar.f158319a.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.reaction.widget.C62868b.View$OnClickListenerC628713 */

                public void onClick(View view) {
                    if (C62868b.this.f158307a != null) {
                        C62868b.this.f158307a.mo217251a(view);
                    }
                }
            });
        }
        return view;
    }

    public C62868b(Context context, List<String> list, boolean z, AbstractC62872a aVar) {
        this.f158310d = list;
        this.f158311e = context;
        this.f158307a = aVar;
        this.f158312f = z;
    }
}
