package com.ss.android.photoeditor;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.ss.android.photoeditor.base.AbstractC59635g;
import com.ss.android.photoeditor.base.AbstractC59637h;
import com.ss.android.photoeditor.base.C59621d;
import com.ss.android.photoeditor.base.C59622e;
import com.ss.android.photoeditor.base.C59641k;
import com.ss.android.photoeditor.base.C59644l;
import com.ss.android.photoeditor.base.C59645m;
import com.ss.android.photoeditor.crop_rotate.ClipPhotoEditorPlugin;
import com.ss.android.photoeditor.graffiti.GraffitiPhotoEditorPlugin;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.MosaicPhotoEditorPlugin;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import com.ss.android.photoeditor.mosaic.v2.MosaicPhotoEditorPluginV2;
import com.ss.android.photoeditor.p3010b.C59610b;
import com.ss.android.photoeditor.text.TextPhotoEditorPlugin;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.photoeditor.a */
public class C59605a implements AbstractC59635g {

    /* renamed from: g */
    private static final int f147928g = 2131235192;

    /* renamed from: h */
    private static final int f147929h = 2131235189;

    /* renamed from: i */
    private static final int f147930i = 2131235195;

    /* renamed from: j */
    private static final int f147931j = 2131235186;

    /* renamed from: a */
    public C59621d f147932a;

    /* renamed from: b */
    public List<Bitmap> f147933b;

    /* renamed from: c */
    public Map<Class<? extends AbstractC59637h>, String> f147934c;

    /* renamed from: d */
    public List<String> f147935d;

    /* renamed from: e */
    public AbstractC59635g.AbstractC59636a f147936e;

    /* renamed from: f */
    public AbstractC59737a f147937f;

    /* renamed from: k */
    private C59645m f147938k;

    /* renamed from: l */
    private Map<String, C59644l> f147939l;

    /* renamed from: m */
    private List<C59644l> f147940m;

    /* renamed from: n */
    private Context f147941n;

    /* renamed from: o */
    private FrameLayout f147942o;

    /* renamed from: p */
    private final boolean f147943p;

    /* renamed from: c */
    private void m231147c() {
        this.f147938k = new C59645m(this.f147941n, this.f147942o, this.f147940m, new C59645m.AbstractC59652a() {
            /* class com.ss.android.photoeditor.C59605a.C596061 */

            @Override // com.ss.android.photoeditor.base.C59645m.AbstractC59652a
            /* renamed from: d */
            public AbstractC59737a mo203032d() {
                return C59605a.this.f147937f;
            }

            @Override // com.ss.android.photoeditor.base.C59645m.AbstractC59652a
            /* renamed from: a */
            public Bitmap mo203029a() {
                return C59605a.this.f147932a.mo203085a();
            }

            @Override // com.ss.android.photoeditor.base.C59645m.AbstractC59652a
            /* renamed from: c */
            public void mo203031c() {
                if (C59605a.this.f147936e != null) {
                    C59605a.this.f147936e.mo117785a(null);
                }
            }

            @Override // com.ss.android.photoeditor.base.C59645m.AbstractC59652a
            /* renamed from: b */
            public void mo203030b() {
                if (C59605a.this.f147936e != null) {
                    C59605a.this.f147936e.mo117785a(C59622e.m231233a().mo203099g());
                }
            }
        });
    }

    /* renamed from: b */
    private void m231146b() {
        Class<? extends AbstractC59637h> cls;
        if (this.f147943p) {
            cls = MosaicPhotoEditorPluginV2.class;
        } else {
            cls = MosaicPhotoEditorPlugin.class;
        }
        this.f147939l.put("mosaic_plugin", new C59644l(cls, this.f147941n.getResources().getDrawable(f147928g), "mosaic_plugin"));
        this.f147939l.put("graffiti_plugin", new C59644l(GraffitiPhotoEditorPlugin.class, this.f147941n.getResources().getDrawable(f147929h), "graffiti_plugin"));
        this.f147939l.put("text_plugin", new C59644l(TextPhotoEditorPlugin.class, this.f147941n.getResources().getDrawable(f147930i), "text_plugin"));
        this.f147939l.put("crop_and_rotate_plugin", new C59644l(ClipPhotoEditorPlugin.class, this.f147941n.getResources().getDrawable(f147931j), "crop_and_rotate_plugin"));
        this.f147934c.put(cls, "mosaic_plugin");
        this.f147934c.put(GraffitiPhotoEditorPlugin.class, "graffiti_plugin");
        this.f147934c.put(TextPhotoEditorPlugin.class, "text_plugin");
        this.f147934c.put(ClipPhotoEditorPlugin.class, "crop_and_rotate_plugin");
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59635g
    /* renamed from: a */
    public void mo203028a() {
        HitPointHelper.f147964l.mo203063l();
        for (Bitmap bitmap : this.f147933b) {
            C59610b.m231208a(bitmap);
        }
        this.f147938k.mo203179c();
        C59622e.m231233a().mo203092b();
    }

    /* renamed from: com.ss.android.photoeditor.a$a */
    public static class C59607a {

        /* renamed from: a */
        public FrameLayout f147945a;

        /* renamed from: b */
        public AbstractC59737a f147946b;

        /* renamed from: c */
        private Context f147947c;

        /* renamed from: d */
        private Bitmap f147948d;

        /* renamed from: e */
        private String[] f147949e = {"graffiti_plugin", "mosaic_plugin", "crop_and_rotate_plugin", "text_plugin"};

        /* renamed from: f */
        private List<C59644l> f147950f = new ArrayList();

        /* renamed from: g */
        private HitPointHelper.IStatisticsProvider f147951g;

        /* renamed from: h */
        private C59641k.AbstractC59643a f147952h;

        /* renamed from: a */
        public AbstractC59635g mo203040a() {
            if (this.f147947c == null) {
                throw new IllegalArgumentException("context not be null");
            } else if (this.f147948d == null) {
                throw new IllegalArgumentException("originBitmap not be null");
            } else if (this.f147945a != null) {
                C59641k.AbstractC59643a aVar = this.f147952h;
                if (aVar != null) {
                    C59641k.m231333a(aVar);
                }
                C59605a a = new C59605a(this.f147947c, this).mo203026a(this.f147949e).mo203024a(this.f147948d);
                List<C59644l> list = this.f147950f;
                if (list != null && list.size() > 0) {
                    for (int i = 0; i < this.f147950f.size(); i++) {
                        a.mo203025a(this.f147950f.get(i));
                    }
                }
                C59622e.m231233a().mo203088a(this.f147948d);
                HitPointHelper.f147964l.mo203061j();
                HitPointHelper.f147964l.mo203042a(this.f147951g);
                return a;
            } else {
                throw new IllegalArgumentException("photoEditorContainer not be null");
            }
        }

        /* renamed from: a */
        public C59607a mo203033a(Context context) {
            this.f147947c = context;
            return this;
        }

        /* renamed from: a */
        public C59607a mo203034a(Bitmap bitmap) {
            this.f147948d = bitmap;
            return this;
        }

        /* renamed from: a */
        public C59607a mo203035a(FrameLayout frameLayout) {
            this.f147945a = frameLayout;
            return this;
        }

        /* renamed from: a */
        public C59607a mo203036a(HitPointHelper.IStatisticsProvider bVar) {
            this.f147951g = bVar;
            return this;
        }

        /* renamed from: a */
        public C59607a mo203037a(C59641k.AbstractC59643a aVar) {
            this.f147952h = aVar;
            return this;
        }

        /* renamed from: a */
        public C59607a mo203038a(AbstractC59737a aVar) {
            this.f147946b = aVar;
            return this;
        }

        /* renamed from: a */
        public C59607a mo203039a(String[] strArr) {
            this.f147949e = strArr;
            return this;
        }
    }

    /* renamed from: a */
    public C59605a mo203024a(Bitmap bitmap) {
        this.f147932a.mo203086a(bitmap);
        return this;
    }

    /* renamed from: a */
    public C59605a mo203025a(C59644l lVar) {
        String c = lVar.mo203173c();
        this.f147939l.put(c, lVar);
        this.f147934c.put(lVar.mo203170a(), c);
        return this;
    }

    /* renamed from: a */
    public C59605a mo203026a(String[] strArr) {
        for (int i = 0; i < strArr.length; i++) {
            this.f147940m.add(this.f147939l.get(strArr[i]));
            if (!TextUtils.equals(strArr[i], "crop_and_rotate_plugin")) {
                this.f147935d.add(strArr[i]);
            }
        }
        for (int i2 = 0; i2 < this.f147935d.size(); i2++) {
            this.f147933b.add(null);
        }
        return this;
    }

    @Override // com.ss.android.photoeditor.base.AbstractC59635g
    /* renamed from: a */
    public AbstractC59635g mo203027a(AbstractC59635g.AbstractC59636a aVar) {
        this.f147936e = aVar;
        m231147c();
        this.f147938k.mo203175a();
        ViewConfiguration.get(this.f147941n).getScaledTouchSlop();
        if (this.f147940m.contains(this.f147939l.get("graffiti_plugin"))) {
            this.f147938k.mo203176a(this.f147939l.get("graffiti_plugin"));
        } else if (this.f147940m.size() > 0) {
            this.f147938k.mo203176a(this.f147939l.get(this.f147940m.get(0).mo203173c()));
        }
        HitPointHelper.f147964l.mo203062k();
        return this;
    }

    private C59605a(Context context, C59607a aVar) {
        this.f147942o = aVar.f147945a;
        this.f147933b = new ArrayList();
        this.f147941n = context;
        this.f147939l = new HashMap();
        this.f147934c = new HashMap();
        this.f147940m = new ArrayList();
        this.f147932a = new C59621d(this.f147933b);
        this.f147935d = new ArrayList();
        AbstractC59737a aVar2 = aVar.f147946b;
        this.f147937f = aVar2;
        if (aVar2 != null) {
            this.f147943p = aVar2.mo177142a();
        } else {
            this.f147943p = false;
        }
        m231146b();
    }
}
