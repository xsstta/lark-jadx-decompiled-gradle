package com.ss.android.lark.photoeditor.impl.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.larksuite.component.ui.dialog.C25644o;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.DeviceUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.diskmanage.cipher.C36808a;
import com.ss.android.lark.diskmanage.cipher.DecryptException;
import com.ss.android.lark.guide.ui.GuideComponent;
import com.ss.android.lark.guide.ui.config.AnchorConfig;
import com.ss.android.lark.guide.ui.config.GuideDelegate;
import com.ss.android.lark.guide.ui.config.TextBubbleConfig;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.photoeditor.LarkPhotoEditorModule;
import com.ss.android.lark.photoeditor.impl.p2463a.AbstractC51431b;
import com.ss.android.lark.photoeditor.impl.p2463a.C51429a;
import com.ss.android.lark.photoeditor.impl.p2463a.C51432c;
import com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a;
import com.ss.android.lark.photoeditor.p2462a.AbstractC51426a;
import com.ss.android.lark.statistics.Statistics;
import com.ss.android.lark.utils.StatusBarUtil;
import com.ss.android.lark.widget.dialog.CommonLoadingDialog;
import com.ss.android.photoeditor.C59605a;
import com.ss.android.photoeditor.base.AbstractC59635g;
import com.ss.android.photoeditor.base.C59641k;
import com.ss.android.photoeditor.hitpoint.HitPointHelper;
import com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a;
import com.ss.android.photoeditor.ve.AbstractC59806a;
import com.ss.android.photoeditor.ve.VEPhotoEditor;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.ss.android.lark.photoeditor.impl.ui.e */
public class C51456e implements AbstractC51438a.AbstractC51441b {

    /* renamed from: a */
    public Bitmap f128019a;

    /* renamed from: b */
    public AbstractC51438a.AbstractC51441b.AbstractC51442a f128020b;

    /* renamed from: c */
    public AbstractC51465a f128021c;

    /* renamed from: d */
    public GuideDelegate f128022d;

    /* renamed from: e */
    private Context f128023e;

    /* renamed from: f */
    private View f128024f;

    /* renamed from: g */
    private String f128025g;

    /* renamed from: h */
    private CommonLoadingDialog f128026h;

    /* renamed from: i */
    private FrameLayout f128027i;

    /* renamed from: j */
    private AbstractC59635g f128028j;

    /* renamed from: k */
    private AbstractC59806a f128029k;

    /* renamed from: l */
    private AbstractC51426a.AbstractC51427a f128030l = LarkPhotoEditorModule.m199349a().mo102818a();

    /* renamed from: com.ss.android.lark.photoeditor.impl.ui.e$a */
    public interface AbstractC51465a {
        /* renamed from: a */
        void mo177120a();

        /* renamed from: b */
        boolean mo177121b();
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: a */
    public boolean mo177112a() {
        return true;
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: d */
    public void mo177115d() {
        mo177137e();
    }

    /* renamed from: f */
    private static C59641k.AbstractC59643a m199433f() {
        return new C59641k.AbstractC59643a() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514637 */

            @Override // com.ss.android.photoeditor.base.C59641k.AbstractC59643a
            /* renamed from: a */
            public void mo177144a(String str, String str2) {
                Log.m165389i(str, str2);
            }

            @Override // com.ss.android.photoeditor.base.C59641k.AbstractC59643a
            /* renamed from: b */
            public void mo177145b(String str, String str2) {
                Log.m165383e(str, str2);
            }
        };
    }

    /* renamed from: g */
    private static HitPointHelper.IStatisticsProvider m199434g() {
        return new HitPointHelper.IStatisticsProvider() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514648 */

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: a */
            public void mo177146a(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_text_box_create", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: b */
            public void mo177147b(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_mosaic_type", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: c */
            public void mo177148c(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_draw_color", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: d */
            public void mo177149d(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_text_size", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: e */
            public void mo177150e(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_crop", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: f */
            public void mo177151f(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_text", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: g */
            public void mo177152g(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_Mosaic", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: h */
            public void mo177153h(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_draw", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: i */
            public void mo177154i(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit", jSONObject);
            }

            @Override // com.ss.android.photoeditor.hitpoint.HitPointHelper.IStatisticsProvider
            /* renamed from: j */
            public void mo177155j(JSONObject jSONObject) {
                Statistics.sendEvent("pic_edit_withdraw_click", jSONObject);
            }
        };
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: j */
    private /* synthetic */ void m199437j() {
        AbstractC51465a aVar = this.f128021c;
        if (aVar != null) {
            aVar.mo177120a();
        }
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: c */
    public void mo177114c() {
        CommonLoadingDialog commonLoadingDialog = this.f128026h;
        if (commonLoadingDialog != null) {
            commonLoadingDialog.dismiss();
        }
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: b */
    public void mo177113b() {
        CommonLoadingDialog commonLoadingDialog = this.f128026h;
        if (commonLoadingDialog != null) {
            commonLoadingDialog.show(this.f128023e);
        }
    }

    /* renamed from: e */
    public void mo177137e() {
        UICallbackExecutor.post(new Runnable() {
            /* class com.ss.android.lark.photoeditor.impl.ui.$$Lambda$e$GEZvzMabIz5AK5RIBdCJHqJqELY */

            public final void run() {
                C51456e.this.m199437j();
            }
        });
    }

    /* renamed from: h */
    private void m199435h() {
        this.f128026h = new CommonLoadingDialog();
        this.f128027i = (FrameLayout) this.f128024f.findViewById(R.id.photoeditor_container);
    }

    /* renamed from: i */
    private void m199436i() {
        if (!DesktopUtil.m144301a(this.f128023e)) {
            StatusBarUtil.setTranslucentForImageView((Activity) this.f128023e, 178, this.f128027i);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
        m199435h();
        m199436i();
        final View findViewById = this.f128024f.findViewById(R.id.photoeditor_container);
        final File file = new File(this.f128025g);
        C36808a.m145204a(file, new C36808a.AbstractC36810a() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514571 */

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36810a
            /* renamed from: a */
            public void mo102874a(DecryptException decryptException) {
                Log.m165383e("PhotoEditorView", "[cipher] file decrypt failed, original path = " + file.getAbsolutePath());
                C51456e.this.mo177137e();
            }

            @Override // com.ss.android.lark.diskmanage.cipher.C36808a.AbstractC36810a
            /* renamed from: a */
            public void mo102875a(File file) {
                Log.m165389i("PhotoEditorView", "[cipher] file decrypt success, original path = " + file.getAbsolutePath() + ", new path = " + file.getAbsolutePath());
                if (LarkPhotoEditorModule.m199349a().mo102820a("messenger.image.ve.editor")) {
                    C51456e.this.mo177136b(file.getAbsolutePath());
                } else {
                    C51456e.this.mo177134a(findViewById, file);
                }
            }
        });
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        AbstractC59635g gVar = this.f128028j;
        if (gVar != null) {
            gVar.mo203028a();
        }
        AbstractC59806a aVar = this.f128029k;
        if (aVar != null) {
            aVar.mo203585a();
        }
        GuideDelegate gVar2 = this.f128022d;
        if (gVar2 != null && gVar2.mo141658a()) {
            this.f128022d.mo141659b();
        }
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC51438a.AbstractC51441b.AbstractC51442a aVar) {
        this.f128020b = aVar;
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: a */
    public void mo177109a(int i) {
        LKUIToast.show(this.f128023e, i);
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: a */
    public void mo177110a(String str) {
        LKUIToast.show(this.f128023e, str);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m199432c(String str) {
        this.f128029k = new VEPhotoEditor.Builder().mo203616a(this.f128023e).mo203617a(this.f128027i).mo203619a(str).mo203618a(m199433f()).mo203626g().mo203584a(new AbstractC59806a.AbstractC59807a() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514626 */

            @Override // com.ss.android.photoeditor.ve.AbstractC59806a.AbstractC59807a
            /* renamed from: a */
            public void mo177143a(String str) {
                if (TextUtils.isEmpty(str)) {
                    Log.m165397w("PhotoEditorView", "file path is null");
                    C51456e.this.mo177109a(R.string.Lark_Legacy_SaveFail);
                    C51456e.this.f128021c.mo177120a();
                    return;
                }
                C51456e.this.f128020b.mo177118a(str);
            }
        });
    }

    /* renamed from: a */
    public GuideDelegate mo177132a(View view) {
        if (!(this.f128023e instanceof Activity) || view == null || !this.f128030l.mo102823b("image_editor_smart_mosaic")) {
            return null;
        }
        TextBubbleConfig kVar = new TextBubbleConfig(new AnchorConfig(new WeakReference(view), AnchorConfig.AnchorGravity.TOP), null, null, this.f128023e.getString(R.string.Lark_ASL_PixelateOnboarding));
        this.f128030l.mo102822a("image_editor_smart_mosaic");
        return GuideComponent.m152613a((Activity) this.f128023e, kVar);
    }

    /* renamed from: b */
    public void mo177136b(String str) {
        View findViewById;
        UICallbackExecutor.post(new Runnable(str) {
            /* class com.ss.android.lark.photoeditor.impl.ui.$$Lambda$e$DEgFLHvOmTdrBTJs258mcUS6ZE */
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C51456e.this.m199432c(this.f$1);
            }
        });
        if (DesktopUtil.m144301a(this.f128023e) && this.f128021c.mo177121b() && (findViewById = this.f128027i.findViewById(R.id.tv_close)) != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    private C25644o m199429a(List<AbstractC51431b> list) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AbstractC51431b bVar : list) {
            if (bVar.mo177086c()) {
                linkedHashMap.put(bVar.mo177085b(), bVar);
            }
        }
        final String[] strArr = (String[]) linkedHashMap.keySet().toArray(new String[0]);
        return (C25644o) ((C25644o) new C25644o(this.f128023e).mo89206a(strArr)).mo89202a(new DialogInterface.OnClickListener() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.DialogInterface$OnClickListenerC514593 */

            public void onClick(DialogInterface dialogInterface, int i) {
                if (i >= 0) {
                    String[] strArr = strArr;
                    if (i < strArr.length) {
                        AbstractC51431b bVar = (AbstractC51431b) linkedHashMap.get(strArr[i]);
                        if (bVar != null) {
                            bVar.mo177084a().run();
                        }
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void mo177133a(Bitmap bitmap) {
        View findViewById;
        this.f128028j = new C59605a.C59607a().mo203033a(this.f128023e).mo203035a(this.f128027i).mo203034a(bitmap).mo203036a(m199434g()).mo203037a(m199433f()).mo203038a(new AbstractC59737a() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514615 */

            @Override // com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a
            /* renamed from: a */
            public boolean mo177142a() {
                return LarkPhotoEditorModule.m199349a().mo102820a("image_editor.smart_mosaic");
            }

            @Override // com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a
            /* renamed from: a */
            public void mo177140a(Bitmap bitmap, AbstractC59737a.AbstractC59738a aVar) {
                C51456e.this.f128020b.mo177117a(bitmap, aVar);
            }

            @Override // com.ss.android.photoeditor.mosaic.p3011a.AbstractC59737a
            /* renamed from: a */
            public void mo177141a(View view, String str, String str2) {
                if (C51456e.this.f128022d != null && C51456e.this.f128022d.mo141658a()) {
                    C51456e.this.f128022d.mo141659b();
                }
                C51456e eVar = C51456e.this;
                eVar.f128022d = eVar.mo177132a(view);
            }
        }).mo203040a().mo203027a(new AbstractC59635g.AbstractC59636a() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514604 */

            @Override // com.ss.android.photoeditor.base.AbstractC59635g.AbstractC59636a
            /* renamed from: a */
            public void mo117785a(Bitmap bitmap) {
                if (bitmap == null) {
                    C51456e.this.f128021c.mo177120a();
                } else {
                    C51456e.this.f128020b.mo177116a(bitmap);
                }
            }
        });
        if (DesktopUtil.m144301a(this.f128023e) && this.f128021c.mo177121b() && (findViewById = this.f128027i.findViewById(R.id.tv_close)) != null) {
            findViewById.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo177134a(View view, File file) {
        UICallbackExecutor.post(new Runnable(file, view) {
            /* class com.ss.android.lark.photoeditor.impl.ui.$$Lambda$e$0_aVv7qeapCcqhCO2iLpOToItvE */
            public final /* synthetic */ File f$1;
            public final /* synthetic */ View f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void run() {
                C51456e.this.m199430a((C51456e) this.f$1, (File) this.f$2);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m199430a(File file, View view) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        int[] a = m199431a(view, options.outWidth, options.outHeight);
        if (a == null) {
            mo177137e();
            return;
        }
        IRequestCreator asBitmap = ImageLoader.with(this.f128023e).load(file).asBitmap();
        if (!DesktopUtil.m144301a(this.f128023e)) {
            asBitmap.override(a[0], a[1]);
        } else {
            asBitmap.override(a[0] << 1, a[1] << 1);
        }
        asBitmap.into(new C38818i<Bitmap>() {
            /* class com.ss.android.lark.photoeditor.impl.ui.C51456e.C514582 */

            /* renamed from: a */
            public void mo49248a(Bitmap bitmap) {
                C51456e.this.f128019a = bitmap;
                C51456e eVar = C51456e.this;
                eVar.mo177133a(eVar.f128019a);
            }
        });
    }

    /* renamed from: a */
    private static int[] m199431a(View view, int i, int i2) {
        int[] iArr = new int[2];
        int width = view.getWidth();
        int height = view.getHeight();
        int screenWidth = DeviceUtils.getScreenWidth(view.getContext());
        int screenHeight = DeviceUtils.getScreenHeight(view.getContext());
        if (width <= 0) {
            width = screenWidth;
        }
        if (height <= 0) {
            height = screenHeight;
        }
        if (i2 >= height || i >= width) {
            float f = ((float) i) / ((float) i2);
            float f2 = (float) height;
            float f3 = f2 * f;
            if (f3 > f2) {
                iArr[0] = width;
                iArr[1] = (int) (((float) width) / f);
            } else {
                iArr[1] = height;
                iArr[0] = (int) f3;
            }
        } else {
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] > screenWidth / 2 && iArr[1] > screenHeight / 4) {
            iArr[0] = iArr[0] / 2;
            iArr[1] = iArr[1] / 2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            return null;
        }
        return iArr;
    }

    public C51456e(Context context, View view, String str, AbstractC51465a aVar) {
        this.f128023e = context;
        this.f128024f = view;
        this.f128025g = str;
        this.f128021c = aVar;
    }

    @Override // com.ss.android.lark.photoeditor.impl.ui.AbstractC51438a.AbstractC51441b
    /* renamed from: a */
    public void mo177111a(String str, boolean z, boolean z2, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C51432c(this.f128023e, z, str, str2));
        arrayList.add(new C51429a(this.f128023e, z2, str));
        ((C25644o) ((C25644o) m199429a(arrayList).mo89209c(R.color.edit_menu_item_text_highlight_selector_photo)).mo89290y(0).mo89225a(R.id.lkui_dialog_btn_cancel, UIUtils.getString(this.f128023e, R.string.Lark_Legacy_Cancel), (DialogInterface.OnClickListener) null)).mo89239c();
    }
}
