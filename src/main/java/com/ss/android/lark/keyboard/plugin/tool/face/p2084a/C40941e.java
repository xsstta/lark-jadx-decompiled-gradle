package com.ss.android.lark.keyboard.plugin.tool.face.p2084a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.chat.entity.sticker.StickerSet;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.api.AbstractC38817h;
import com.ss.android.lark.image.api.AbstractC38819j;
import com.ss.android.lark.image.api.DataSource;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.keyboard.hitpoint.StickerAppreciableHitPoint;
import com.ss.android.lark.keyboard.plugin.tool.face.AbstractC40963j;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40941e;
import com.ss.android.lark.log.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.e */
public class C40941e extends Fragment {

    /* renamed from: a */
    public final Map<String, Long> f104055a = new HashMap();

    /* renamed from: b */
    public final Map<String, Long> f104056b = new HashMap();

    /* renamed from: c */
    public final Map<String, Long> f104057c = new HashMap();

    /* renamed from: d */
    public final List<String> f104058d = new ArrayList();

    /* renamed from: e */
    public int f104059e = 0;

    /* renamed from: f */
    public int f104060f = 0;

    /* renamed from: g */
    public int f104061g = 0;

    /* renamed from: h */
    public int f104062h = 0;

    /* renamed from: i */
    private RecyclerView f104063i;

    /* renamed from: j */
    private C40931d f104064j;

    /* renamed from: k */
    private WeakReference<AbstractC40963j> f104065k;

    /* renamed from: l */
    private List<Sticker> f104066l = new ArrayList();

    /* renamed from: m */
    private String f104067m;

    /* renamed from: n */
    private WeakReference<AbstractC40930c> f104068n;

    /* renamed from: o */
    private boolean f104069o = false;

    /* renamed from: p */
    private boolean f104070p = false;

    /* renamed from: q */
    private AbstractC38817h f104071q = new AbstractC38817h() {
        /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40941e.C409421 */

        /* access modifiers changed from: public */
        /* renamed from: b */
        private /* synthetic */ void m162127b(Object obj) {
            Log.m165379d("StickerPage", "onException " + obj.toString());
            if (obj instanceof C38824b) {
                String a = ((C38824b) obj).mo142313a();
                if (!C40941e.this.f104056b.containsKey(a)) {
                    C40941e.this.f104058d.add(a);
                    C40941e.this.f104056b.put(a, -1L);
                    C40941e eVar = C40941e.this;
                    eVar.f104059e--;
                    C40941e.this.f104062h++;
                    C40941e.this.f104060f++;
                    C40941e.this.mo147594a(false, false);
                }
            }
        }

        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m162126a(Object obj) {
            Log.m165379d("StickerPage", "onResourceReady " + obj.toString());
            if (obj instanceof C38824b) {
                String a = ((C38824b) obj).mo142313a();
                if (!C40941e.this.f104056b.containsKey(a) && C40941e.this.f104055a.containsKey(a)) {
                    C40941e.this.f104056b.put(a, Long.valueOf(System.currentTimeMillis()));
                    C40941e.this.f104057c.put(a, Long.valueOf(C40941e.this.f104056b.get(a).longValue() - C40941e.this.f104055a.get(a).longValue()));
                    C40941e eVar = C40941e.this;
                    eVar.f104059e--;
                    C40941e.this.f104061g++;
                    C40941e.this.f104060f++;
                    C40941e.this.mo147594a(false, false);
                }
            }
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53861a(Exception exc, Object obj, AbstractC38819j jVar, boolean z) {
            UICallbackExecutor.post(new Runnable(obj) {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$e$1$O6lNIrhuQCUu_ocZR161O9UTc */
                public final /* synthetic */ Object f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C40941e.C409421.m270672lambda$O6lNIrhuQCUu_ocZR161O9UTc(C40941e.C409421.this, this.f$1);
                }
            });
            return false;
        }

        @Override // com.ss.android.lark.image.api.AbstractC38817h
        /* renamed from: a */
        public boolean mo53862a(Object obj, Object obj2, AbstractC38819j jVar, DataSource dataSource, boolean z) {
            UICallbackExecutor.post(new Runnable(obj2) {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$e$1$TvxwcLICN61LUtSddFW4tTzUdQE */
                public final /* synthetic */ Object f$1;

                {
                    this.f$1 = r2;
                }

                public final void run() {
                    C40941e.C409421.lambda$TvxwcLICN61LUtSddFW4tTzUdQE(C40941e.C409421.this, this.f$1);
                }
            });
            return false;
        }
    };

    public static /* synthetic */ C40964l lambda$dr5AG6XAV4Kc3e1d4r8HHXafCJk(C40941e eVar, String str, int i, int i2) {
        return eVar.m162106a(str, i, i2);
    }

    /* renamed from: a */
    public void mo147594a(boolean z, boolean z2) {
        if ((!z2 && !this.f104069o) || !this.f104070p) {
            return;
        }
        if ((z2 || this.f104059e == 0) && this.f104060f > 0) {
            this.f104070p = false;
            int i = z2 ? 2 : 1;
            if (this.f104061g > 0) {
                StickerAppreciableHitPoint.f103324a.mo146890a(this.f104057c, i, z);
            }
            if (this.f104062h > 0) {
                StickerAppreciableHitPoint.f103324a.mo146889a(this.f104067m, this.f104058d, i);
            }
            Log.m165379d("StickerPage", "end, set: " + this.f104067m + " compete count: " + this.f104060f);
        }
    }

    /* renamed from: a */
    public static C40941e m162105a() {
        return new C40941e();
    }

    /* renamed from: d */
    private void m162113d() {
        this.f104064j.mo147587a(this.f104066l);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m162115f();
        super.onDestroy();
    }

    /* renamed from: b */
    public static int m162111b() {
        if (DesktopUtil.m144307b()) {
            return 6;
        }
        return 4;
    }

    /* renamed from: e */
    private void m162114e() {
        m162116g();
        m162117h();
        m162118i();
        m162119j();
    }

    /* renamed from: f */
    private void m162115f() {
        C40931d dVar = this.f104064j;
        if (dVar != null) {
            dVar.mo147580a();
        }
    }

    /* renamed from: g */
    private void m162116g() {
        this.f104064j.mo147582a(new C40931d.AbstractC40936a() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$e$0gERf3OGV6Z_xCsxIUw2aHJwWQ */

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.AbstractC40936a
            public final void onSelectedFace(C40964l lVar) {
                C40941e.m270671lambda$0gERf3OGV6Z_xCsxIUw2aHJwWQ(C40941e.this, lVar);
            }
        });
    }

    /* renamed from: h */
    private void m162117h() {
        this.f104064j.mo147584a(new C40931d.AbstractC40938c() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$e$dr5AG6XAV4Kc3e1d4r8HHXafCJk */

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.AbstractC40938c
            public final C40964l getLocalStickerFileInfo(String str, int i, int i2) {
                return C40941e.lambda$dr5AG6XAV4Kc3e1d4r8HHXafCJk(C40941e.this, str, i, i2);
            }
        });
    }

    /* renamed from: i */
    private void m162118i() {
        this.f104064j.mo147583a(new C40931d.AbstractC40937b() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$e$YymFSWg2x5ka0_peniVPynUmnSc */

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.AbstractC40937b
            public final void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
                C40941e.lambda$YymFSWg2x5ka0_peniVPynUmnSc(C40941e.this, context, z, i, i2, str, imageView, i3, i4, str2);
            }
        });
    }

    /* renamed from: j */
    private void m162119j() {
        this.f104064j.mo147585a(new C40931d.AbstractC40939d() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$e$BUJfnQwv5Cxj41amqy8izVemjv0 */

            @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40931d.AbstractC40939d
            public final void onGlideLoad(String str) {
                C40941e.lambda$BUJfnQwv5Cxj41amqy8izVemjv0(C40941e.this, str);
            }
        });
    }

    /* renamed from: k */
    private AbstractC40930c m162120k() {
        WeakReference<AbstractC40930c> weakReference = this.f104068n;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: l */
    private AbstractC40963j m162121l() {
        WeakReference<AbstractC40963j> weakReference = this.f104065k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: c */
    private void m162112c() {
        if (this.f104069o) {
            this.f104070p = true;
            StickerAppreciableHitPoint.f103324a.mo146888a(this.f104067m);
            Log.m165379d("StickerPage", "start, set: " + this.f104067m);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        super.setUserVisibleHint(z);
        boolean z3 = this.f104069o;
        boolean z4 = true;
        if (!z3 || z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z3 || !z) {
            z4 = false;
        }
        this.f104069o = z;
        m162112c();
        mo147594a(z4, z2);
    }

    /* renamed from: a */
    private void m162108a(View view) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.sticker_recv);
        this.f104063i = recyclerView;
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), m162111b()));
        C40931d dVar = new C40931d(getContext());
        this.f104064j = dVar;
        this.f104063i.setAdapter(dVar);
    }

    /* renamed from: a */
    private View m162104a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.root);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.sticker_recv);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 1;
        if (DesktopUtil.m144307b()) {
            int dp2px = UIUtils.dp2px(context, 14.0f);
            recyclerView.setPadding(dp2px, UIUtils.dp2px(context, 2.0f), dp2px, 0);
        } else {
            recyclerView.setPadding(0, 0, 0, 0);
        }
        linearLayout.addView(recyclerView, layoutParams2);
        return linearLayout;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162109a(C40964l lVar) {
        AbstractC40963j l = m162121l();
        if (l != null) {
            l.mo147532a(lVar);
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162110a(String str) {
        if (!this.f104055a.containsKey(str)) {
            this.f104055a.put(str, Long.valueOf(System.currentTimeMillis()));
            this.f104059e++;
        }
    }

    /* renamed from: a */
    public void mo147591a(StickerSet stickerSet) {
        if (stickerSet != null) {
            this.f104066l.clear();
            this.f104066l.addAll(stickerSet.getStickers());
            this.f104067m = stickerSet.getStickerSetId();
            C40931d dVar = this.f104064j;
            if (dVar != null) {
                dVar.mo147587a(this.f104066l);
            }
        }
    }

    /* renamed from: a */
    public void mo147592a(AbstractC40930c cVar) {
        this.f104068n = new WeakReference<>(cVar);
        if (this.f104064j != null) {
            m162117h();
            m162118i();
        }
    }

    /* renamed from: a */
    public void mo147593a(AbstractC40963j jVar) {
        this.f104065k = new WeakReference<>(jVar);
        if (this.f104064j != null) {
            m162116g();
        }
    }

    /* renamed from: a */
    private /* synthetic */ C40964l m162106a(String str, int i, int i2) {
        AbstractC40930c k = m162120k();
        if (k == null) {
            return null;
        }
        return k.mo147534a(str, i, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = m162104a(layoutInflater.getContext());
        m162108a(a);
        m162113d();
        m162114e();
        return a;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162107a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4, String str2) {
        AbstractC40930c k = m162120k();
        if (k != null) {
            k.mo147537a(context, z, i, i2, str, imageView, i3, i4, str2, this.f104071q);
        }
    }
}
