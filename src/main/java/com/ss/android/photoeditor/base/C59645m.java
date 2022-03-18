package com.ss.android.photoeditor.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.larksuite.component.ui.p1153e.C25653b;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import com.ss.android.photoeditor.p3010b.C59613d;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: com.ss.android.photoeditor.base.m */
public class C59645m {

    /* renamed from: a */
    public Context f148029a;

    /* renamed from: b */
    public AbstractC59652a f148030b;

    /* renamed from: c */
    public List<C59644l> f148031c;

    /* renamed from: d */
    public Stack<Class<? extends AbstractC59637h>> f148032d = new Stack<>();

    /* renamed from: e */
    public RelativeLayout f148033e;

    /* renamed from: f */
    public FrameLayout f148034f;

    /* renamed from: g */
    public View f148035g;

    /* renamed from: h */
    public View f148036h;

    /* renamed from: i */
    public View f148037i;

    /* renamed from: j */
    public View f148038j;

    /* renamed from: k */
    public Map<Class<? extends AbstractC59637h>, AbstractC59637h> f148039k = new HashMap();

    /* renamed from: l */
    public AbstractC59637h f148040l;

    /* renamed from: m */
    public Class<? extends AbstractC59637h> f148041m;

    /* renamed from: n */
    public View f148042n;

    /* renamed from: o */
    private FrameLayout f148043o;

    /* renamed from: p */
    private View f148044p;

    /* renamed from: q */
    private LinearLayout f148045q;

    /* renamed from: r */
    private ImageView f148046r;

    /* renamed from: com.ss.android.photoeditor.base.m$a */
    public interface AbstractC59652a {
        /* renamed from: a */
        Bitmap mo203029a();

        /* renamed from: b */
        void mo203030b();

        /* renamed from: c */
        void mo203031c();

        /* renamed from: d */
        AbstractC59737a mo203032d();
    }

    /* renamed from: d */
    private void m231345d() {
        C59622e.m231233a().mo203089a(new C59622e.AbstractC59626c() {
            /* class com.ss.android.photoeditor.base.C59645m.C596461 */

            @Override // com.ss.android.photoeditor.base.C59622e.AbstractC59626c
            /* renamed from: a */
            public void mo203128a(int i) {
                if (i <= 0) {
                    C59645m.this.f148037i.setEnabled(false);
                } else {
                    C59645m.this.f148037i.setEnabled(true);
                }
            }
        });
    }

    /* renamed from: b */
    public AbstractC59637h.AbstractC59638a mo203178b() {
        return new AbstractC59637h.AbstractC59638a() {
            /* class com.ss.android.photoeditor.base.C59645m.C596516 */

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: a */
            public View mo203151a() {
                return C59645m.this.f148033e;
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: b */
            public View mo203153b() {
                return C59645m.this.f148038j;
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: c */
            public Stack<Class<? extends AbstractC59637h>> mo203154c() {
                return C59645m.this.f148032d;
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: d */
            public void mo203155d() {
                C59645m.this.f148036h.callOnClick();
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: e */
            public void mo203156e() {
                C59645m.this.f148035g.callOnClick();
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: f */
            public int mo203157f() {
                return C59645m.this.f148031c.size();
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: g */
            public Bitmap mo203158g() {
                return C59645m.this.f148030b.mo203029a();
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: h */
            public AbstractC59737a mo203159h() {
                return C59645m.this.f148030b.mo203032d();
            }

            @Override // com.ss.android.photoeditor.base.AbstractC59637h.AbstractC59638a
            /* renamed from: a */
            public void mo203152a(Class cls) {
                for (C59644l lVar : C59645m.this.f148031c) {
                    if (lVar.mo203170a().getName().equals(cls.getName())) {
                        C59645m.this.mo203177b(lVar).onClick(lVar.mo203174d());
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public void mo203175a() {
        m231346e();
        m231347f();
        m231345d();
        this.f148046r.setImageBitmap(this.f148030b.mo203029a());
    }

    /* renamed from: c */
    public void mo203179c() {
        for (Class<? extends AbstractC59637h> cls : this.f148039k.keySet()) {
            this.f148039k.get(cls).mo203142b();
        }
        this.f148043o.removeAllViews();
    }

    /* renamed from: f */
    private void m231347f() {
        for (int i = 0; i < this.f148031c.size(); i++) {
            C59644l lVar = this.f148031c.get(i);
            ImageView imageView = new ImageView(this.f148029a);
            imageView.setImageDrawable(lVar.mo203172b());
            imageView.setClickable(true);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, C59613d.m231216a(24), 1.0f);
            layoutParams.setMarginStart((int) C25653b.m91892a(this.f148029a, 12.0f));
            layoutParams.setMarginEnd((int) C25653b.m91892a(this.f148029a, 12.0f));
            imageView.setLayoutParams(layoutParams);
            imageView.setOnClickListener(mo203177b(lVar));
            lVar.mo203171a(imageView);
            this.f148045q.addView(imageView);
            if (this.f148031c.size() == 1) {
                this.f148045q.setVisibility(4);
            }
        }
    }

    /* renamed from: e */
    private void m231346e() {
        View inflate = LayoutInflater.from(this.f148029a).inflate(R.layout.view_photo_editor, this.f148034f);
        this.f148044p = inflate;
        this.f148038j = inflate.findViewById(R.id.ll_bottom_bar);
        this.f148045q = (LinearLayout) this.f148044p.findViewById(R.id.ll_plugin_icon_container);
        this.f148033e = (RelativeLayout) this.f148044p.findViewById(R.id.rl_top_bar);
        this.f148046r = (ImageView) this.f148044p.findViewById(R.id.iv_origin);
        this.f148034f = (FrameLayout) this.f148044p.findViewById(R.id.fl_container);
        View findViewById = this.f148033e.findViewById(R.id.tv_close);
        this.f148035g = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.base.C59645m.View$OnClickListenerC596472 */

            public void onClick(View view) {
                C59645m.this.f148030b.mo203031c();
            }
        });
        View findViewById2 = this.f148044p.findViewById(R.id.tv_save);
        this.f148036h = findViewById2;
        findViewById2.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.base.C59645m.View$OnClickListenerC596483 */

            public void onClick(View view) {
                if (C59645m.this.f148040l != null) {
                    C59645m.this.f148040l.mo203144d();
                }
                C59645m.this.f148030b.mo203030b();
            }
        });
        View findViewById3 = this.f148044p.findViewById(R.id.tv_back);
        this.f148037i = findViewById3;
        findViewById3.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.photoeditor.base.C59645m.View$OnClickListenerC596494 */

            public void onClick(View view) {
                if (C59645m.this.f148040l != null) {
                    C59645m.this.f148040l.mo203145e();
                }
                HitPointHelper.f147964l.mo203060i();
            }
        });
        this.f148043o.addView(this.f148044p);
    }

    /* renamed from: b */
    public View.OnClickListener mo203177b(final C59644l lVar) {
        return new View.OnClickListener() {
            /* class com.ss.android.photoeditor.base.C59645m.View$OnClickListenerC596505 */

            public void onClick(View view) {
                if (C59645m.this.f148041m == null || !C59645m.this.f148041m.getName().equals(lVar.mo203170a().getName())) {
                    if (C59645m.this.f148042n != null) {
                        C59645m.this.f148042n.setSelected(false);
                    }
                    view.setSelected(true);
                    C59645m.this.f148042n = view;
                    Class<? extends AbstractC59637h> a = lVar.mo203170a();
                    AbstractC59637h hVar = C59645m.this.f148039k.get(a);
                    C59645m.this.f148032d.push(a);
                    if (C59645m.this.f148040l != null) {
                        C59645m.this.f148040l.mo203144d();
                    }
                    if (hVar != null) {
                        if (C59645m.this.f148040l != null) {
                            hVar.mo203141a(C59645m.this.f148040l.getLocation(), C59645m.this.f148040l.mo203146f());
                        }
                        hVar.setImageBitmap(C59622e.m231233a().mo203099g());
                        hVar.mo203143c();
                    } else {
                        try {
                            hVar = (AbstractC59637h) a.getConstructor(Context.class).newInstance(C59645m.this.f148029a);
                        } catch (InstantiationException e) {
                            Log.m165383e("PluginViewHandler", e.toString());
                            e.printStackTrace();
                        } catch (IllegalAccessException e2) {
                            Log.m165383e("PluginViewHandler", e2.toString());
                            e2.printStackTrace();
                        } catch (InvocationTargetException e3) {
                            Log.m165383e("PluginViewHandler", e3.toString());
                            e3.printStackTrace();
                        } catch (NoSuchMethodException e4) {
                            Log.m165383e("PluginViewHandler", e4.toString());
                            e4.printStackTrace();
                        }
                        C59645m.this.f148039k.put(a, hVar);
                        hVar.setImageBitmap(C59622e.m231233a().mo203099g());
                        hVar.setPluginContext(C59645m.this.mo203178b());
                        if (C59645m.this.f148040l != null) {
                            hVar.mo203141a(C59645m.this.f148040l.getLocation(), C59645m.this.f148040l.mo203146f());
                        }
                        hVar.mo203140a();
                    }
                    C59645m.this.f148034f.removeAllViews();
                    C59645m.this.f148034f.addView(hVar.getEditView());
                    C59645m.this.f148040l = hVar;
                    C59645m.this.f148041m = a;
                }
            }
        };
    }

    /* renamed from: a */
    public void mo203176a(C59644l lVar) {
        mo203177b(lVar).onClick(lVar.mo203174d());
    }

    public C59645m(Context context, FrameLayout frameLayout, List<C59644l> list, AbstractC59652a aVar) {
        this.f148029a = context;
        this.f148043o = frameLayout;
        this.f148031c = list;
        this.f148030b = aVar;
    }
}
