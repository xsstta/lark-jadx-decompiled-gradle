package com.tt.miniapp.manager;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import com.ss.android.lark.opmonitor.service.OPMonitor;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3371e.p3372a.C67500a;
import com.tt.miniapphost.p3371e.p3372a.C67501b;
import com.tt.miniapphost.util.MiniAppProcessUtils;
import com.tt.refer.common.blank.IBlankCheckService;
import com.tt.refer.common.config.IConfigStrategy;
import com.tt.refer.common.config.IStrategyListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* renamed from: com.tt.miniapp.manager.b */
public class C66413b implements IBlankCheckService {

    /* renamed from: a */
    private int f167672a = -1;

    /* renamed from: b */
    private final int f167673b = 1;

    /* renamed from: c */
    private int f167674c;

    /* renamed from: d */
    private float f167675d;

    /* renamed from: e */
    private IAppContext f167676e;

    /* renamed from: f */
    private boolean f167677f;

    /* renamed from: g */
    private int f167678g;

    /* renamed from: h */
    private boolean f167679h;

    /* renamed from: i */
    private long f167680i;

    /* renamed from: j */
    private long f167681j;

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public IAppContext getAppContext() {
        return this.f167676e;
    }

    @Override // com.bytedance.ee.lark.infra.sandbox.context.IBaseService
    public void release() {
        this.f167679h = false;
        this.f167678g = 0;
    }

    /* renamed from: a */
    public void mo231946a() {
        MiniAppProcessUtils.killCurrentProcess(this.f167676e.getApplicationContext());
    }

    /* renamed from: d */
    private void m259650d() {
        IConfigStrategy dVar = (IConfigStrategy) this.f167676e.findServiceByInterface(IConfigStrategy.class);
        if (dVar != null) {
            dVar.mo235127a(new Pair<>("close_count", Integer.valueOf(this.f167678g)));
        }
    }

    /* renamed from: b */
    public void mo231952b() {
        IConfigStrategy dVar = (IConfigStrategy) this.f167676e.findServiceByInterface(IConfigStrategy.class);
        if (dVar != null) {
            dVar.mo235126a("blank", new IStrategyListener() {
                /* class com.tt.miniapp.manager.C66413b.C664141 */

                @Override // com.tt.refer.common.config.IStrategyListener
                /* renamed from: a */
                public void mo231954a(List<? extends Pair<String, ? extends Object>> list) {
                    AppBrandLogger.m52830i("BlankScreenManager", "report blank " + list);
                    C66413b.this.mo231951a(true);
                    C66413b.this.mo231950a(list, true);
                }
            });
            dVar.mo235126a("close", new IStrategyListener() {
                /* class com.tt.miniapp.manager.C66413b.C664152 */

                @Override // com.tt.refer.common.config.IStrategyListener
                /* renamed from: a */
                public void mo231954a(List<? extends Pair<String, ? extends Object>> list) {
                    AppBrandLogger.m52830i("BlankScreenManager", "report close");
                    C66413b.this.mo231949a(list);
                    C66413b.this.mo231946a();
                }
            });
            dVar.mo235126a("not_blank", new IStrategyListener() {
                /* class com.tt.miniapp.manager.C66413b.C664163 */

                @Override // com.tt.refer.common.config.IStrategyListener
                /* renamed from: a */
                public void mo231954a(List<? extends Pair<String, ? extends Object>> list) {
                    AppBrandLogger.m52830i("BlankScreenManager", "report not blank " + list);
                    C66413b.this.mo231951a(false);
                    C66413b.this.mo231950a(list, false);
                }
            });
        }
    }

    /* renamed from: c */
    private void m259648c() {
        IConfigStrategy dVar = (IConfigStrategy) this.f167676e.findServiceByInterface(IConfigStrategy.class);
        if (dVar != null) {
            dVar.mo235127a(new Pair<>("fcp", Boolean.valueOf(this.f167677f)), new Pair<>("blank_rate", Float.valueOf(this.f167675d)), new Pair<>("close_count", Integer.valueOf(this.f167678g)));
        }
    }

    public C66413b(IAppContext iAppContext) {
        this.f167676e = iAppContext;
        mo231952b();
    }

    /* renamed from: c */
    private void m259649c(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public void mo231951a(boolean z) {
        this.f167679h = z;
        if (z) {
            this.f167678g++;
        } else {
            this.f167678g = 0;
        }
    }

    /* renamed from: b */
    public int[] mo231953b(Bitmap bitmap) {
        int[] iArr = new int[(bitmap.getWidth() * bitmap.getHeight())];
        bitmap.getPixels(iArr, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
        return iArr;
    }

    /* renamed from: a */
    public void mo231947a(Bitmap bitmap) {
        int i;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth() / 6, bitmap.getHeight() / 6, true);
        m259649c(bitmap);
        int[] b = mo231953b(createScaledBitmap);
        m259649c(createScaledBitmap);
        int width = createScaledBitmap.getWidth();
        int height = createScaledBitmap.getHeight();
        AppBrandLogger.m52830i("BlankScreenManager", "isBlankV1 pixels length " + b.length + " , width = " + width + " , height = " + height);
        new HashMap();
        int i2 = (width * height) / 1;
        SparseArray sparseArray = new SparseArray();
        int i3 = 0;
        for (int i4 = 0; i4 < width; i4++) {
            for (int i5 = 0; i5 < height; i5++) {
                int i6 = (i5 * width) + i4;
                int intValue = ((Integer) sparseArray.get(b[i6], -1)).intValue();
                if (intValue < 0) {
                    i = 1;
                } else {
                    i = intValue + 1;
                }
                if (i > i3) {
                    i3 = i;
                }
                sparseArray.put(b[i6], Integer.valueOf(i));
            }
        }
        float f = ((float) i3) / ((float) i2);
        this.f167675d = f;
        this.f167674c = (int) (1000.0f * f);
        AppBrandLogger.m52830i("BlankScreenManager", "blank pixels percent = " + f);
    }

    /* renamed from: a */
    public void mo231949a(List<? extends Pair<String, ? extends Object>> list) {
        C67500a aVar = new C67500a("mp_blank_screen_close", C67501b.f170248p, this.f167676e);
        Iterator<? extends Pair<String, ? extends Object>> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            aVar.addCategoryValue((String) pair.getFirst(), pair.getSecond());
        }
        aVar.flush();
    }

    /* renamed from: a */
    public Bitmap mo231945a(View view, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
        view.draw(new Canvas(createBitmap));
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, i, view.getWidth(), view.getHeight() - i);
        m259649c(createBitmap);
        return createBitmap2;
    }

    /* renamed from: a */
    public void mo231950a(List<? extends Pair<String, ? extends Object>> list, boolean z) {
        OPMonitorLevel oPMonitorLevel;
        OPMonitor addCategoryValue = new C67500a("mp_blank_screen_detect", C67501b.f170247o, this.f167676e).addMetricValue("duration", Long.valueOf(this.f167681j)).addMetricValue("capture_duration", Long.valueOf(this.f167680i)).addMetricValue("compute_duration", Long.valueOf(this.f167681j - this.f167680i)).addCategoryValue("result_type", "success").addCategoryValue("ttw_ttwebview", Boolean.valueOf(HostDependManager.getInst().isTTWebView())).addCategoryValue("blank_pixels_rate", Integer.valueOf(this.f167674c)).addCategoryValue("isBlank", Boolean.valueOf(z));
        if (z) {
            oPMonitorLevel = OPMonitorLevel.ERROR;
        } else {
            oPMonitorLevel = OPMonitorLevel.NORMAL;
        }
        OPMonitor level = addCategoryValue.setLevel(oPMonitorLevel);
        Iterator<? extends Pair<String, ? extends Object>> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            level.addCategoryValue((String) pair.getFirst(), pair.getSecond());
        }
        level.flush();
    }

    @Override // com.tt.refer.common.blank.IBlankCheckService
    /* renamed from: a */
    public void mo231948a(View view, int i, boolean z) {
        this.f167677f = z;
        long currentTimeMillis = System.currentTimeMillis();
        ColorDrawable colorDrawable = (ColorDrawable) view.getBackground();
        if (colorDrawable != null) {
            this.f167672a = colorDrawable.getColor();
        }
        Bitmap a = mo231945a(view, i);
        this.f167680i = System.currentTimeMillis() - currentTimeMillis;
        mo231947a(a);
        this.f167681j = System.currentTimeMillis() - currentTimeMillis;
        m259648c();
        m259650d();
        AppBrandLogger.m52830i("BlankScreenManager", "checkBlankScreen cost " + this.f167681j);
    }
}
