package com.bytedance.ee.larkbrand.nativeMoudule.rich;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.schedulers.Action;
import com.bytedance.ee.lark.infra.foundation.schedulers.Observable;
import com.bytedance.ee.lark.infra.foundation.schedulers.Schedulers;
import com.bytedance.ee.lark.infra.sandbox.context.AbstractC12888c;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.C13235c;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.bean.RichTextData;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13259b;
import com.larksuite.component.openplatform.core.utils.C25529d;
import com.tt.miniapp.chooser.PickerActivity;
import com.tt.miniapp.p3357x.p3358a.C67404a;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.util.C67045l;
import com.tt.miniapphost.AbstractC67550j;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.util.C67586c;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.rich.h */
public class C13251h extends AbstractC67550j implements C13243f.AbstractC13249a {

    /* renamed from: b */
    private static WeakReference<DialogC13250g> f35099b;

    /* renamed from: a */
    public DialogC13250g f35100a;

    /* renamed from: c */
    private RichTextData f35101c;

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49103a() {
        return "showRichText";
    }

    /* renamed from: d */
    public static DialogC13250g m54006d() {
        WeakReference<DialogC13250g> weakReference = f35099b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.AbstractC13249a
    /* renamed from: c */
    public void mo49457c() {
        DialogC13250g gVar = this.f35100a;
        if (gVar != null) {
            gVar.dismiss();
            this.f35100a = null;
        }
    }

    @Override // com.bytedance.ee.larkbrand.nativeMoudule.rich.C13243f.AbstractC13249a
    /* renamed from: b */
    public void mo49456b() {
        final Activity e = mo234577e();
        if (e == null) {
            AppBrandLogger.m52829e("RichTextModule", "show photo panel, but activity is null");
            return;
        }
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.CAMERA");
        C66588h.m260183a().mo232189a(e, hashSet, new AbstractC66590i() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13251h.C132553 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                AppBrandLogger.m52830i("RichTextModule", "get photo permission success, and start photo album");
                Intent intent = new Intent(e, PickerActivity.class);
                intent.putExtra("select_mode", 100);
                intent.putExtra("max_select_size", 188743680L);
                intent.putExtra("max_select_count", 1);
                intent.putExtra("camerType", 1);
                AbstractC12888c i = C25529d.m91168i(C13251h.this.f170359f);
                if (i != null) {
                    i.startActivityForResult(intent, 20003);
                } else {
                    e.startActivityForResult(intent, 20003);
                }
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
                AppBrandLogger.m52829e("RichTextModule", "get photo permission fail, permisson=" + str);
            }
        });
    }

    public C13251h(AppbrandContext appbrandContext) {
        super(appbrandContext);
    }

    /* renamed from: a */
    public String mo49464a(final RichTextData richTextData) {
        try {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13251h.RunnableC132521 */

                public void run() {
                    C13251h.this.mo49466b(richTextData);
                }
            });
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            AppBrandLogger.eWithThrowable("RichTextModule", "showRichText", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo49466b(RichTextData richTextData) {
        if (richTextData == null) {
            AppBrandLogger.m52829e("RichTextModule", "rict text data is null");
        } else if (mo234577e() != null) {
            DialogC13250g gVar = this.f35100a;
            if (gVar == null || !gVar.isShowing()) {
                AppBrandLogger.m52828d("RichTextModule", "ApiShowRichTextCtrl showRichText");
                this.f35100a = new DialogC13250g(this.f170359f, richTextData);
                f35099b = new WeakReference<>(this.f35100a);
                this.f35100a.mo49461a(this);
                return;
            }
            this.f35100a.mo49460a(richTextData);
        }
    }

    /* renamed from: a */
    private void m54005a(final List<MediaEntity> list, final IAppContext iAppContext) {
        final ArrayList arrayList = new ArrayList();
        Observable.create(new Action() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13251h.C132532 */

            @Override // com.bytedance.ee.lark.infra.foundation.schedulers.Action
            public void act() {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        MediaEntity mediaEntity = (MediaEntity) it.next();
                        File file = new File(mediaEntity.f170268a);
                        if (file.exists()) {
                            if (mediaEntity.f170268a.endsWith(".png")) {
                                File b = C67404a.m262266a(iAppContext).mo234078b();
                                File file2 = new File(b, System.currentTimeMillis() + ".png");
                                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.PNG, 75, file2.toString());
                                arrayList.add(file2.toString());
                            } else if (mediaEntity.f170268a.endsWith(".jpg")) {
                                File b2 = C67404a.m262266a(iAppContext).mo234078b();
                                File file3 = new File(b2, System.currentTimeMillis() + ".jpg");
                                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.JPEG, 75, file3.toString());
                                arrayList.add(file3.toString());
                            } else if (mediaEntity.f170268a.endsWith(".jpeg")) {
                                File b3 = C67404a.m262266a(iAppContext).mo234078b();
                                File file4 = new File(b3, System.currentTimeMillis() + ".jpeg");
                                C67045l.m261301a(file, 640, 480, Bitmap.CompressFormat.JPEG, 75, file4.toString());
                                arrayList.add(file4.toString());
                            } else {
                                int lastIndexOf = file.getName().lastIndexOf(".");
                                String str = "";
                                if (lastIndexOf > 0) {
                                    str = file.getName().substring(lastIndexOf + 1);
                                }
                                File b4 = C67404a.m262266a(iAppContext).mo234078b();
                                File file5 = new File(b4, System.currentTimeMillis() + str);
                                C67586c.m263045a(file, file5, false);
                                arrayList.add(file5.toString());
                            }
                        }
                    }
                    final Bitmap decodeFile = BitmapFactory.decodeFile((String) arrayList.get(0));
                    C13251h.this.mo234577e().runOnUiThread(new Runnable() {
                        /* class com.bytedance.ee.larkbrand.nativeMoudule.rich.C13251h.C132532.RunnableC132541 */

                        public void run() {
                            if (C13251h.this.f35100a != null) {
                                AppBrandLogger.m52830i("RichTextModule", "compress image path=" + ((String) arrayList.get(0)));
                                C13251h.this.f35100a.mo49459a(decodeFile, (String) arrayList.get(0));
                            }
                        }
                    });
                } catch (Exception e) {
                    AppBrandLogger.eWithThrowable("RichTextModule", "handle image fail", e);
                }
            }
        }).schudleOn(Schedulers.longIO()).subscribeSimple();
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public String mo49104a(String str, AbstractC67550j.AbstractC67551a aVar) {
        AppBrandLogger.m52828d("RichTextModule", "RichTextModule invoke=" + str);
        if (!TextUtils.isEmpty(str)) {
            this.f35101c = C13259b.m54026a(str);
        }
        return mo49464a(this.f35101c);
    }

    @Override // com.tt.miniapphost.AbstractC67550j
    /* renamed from: a */
    public boolean mo49465a(int i, int i2, Intent intent) {
        return mo49467b(i, i2, intent);
    }

    /* renamed from: b */
    public boolean mo49467b(int i, int i2, Intent intent) {
        if (i == 20003 && i2 == 19901026) {
            AppBrandLogger.m52830i("RichTextModule", "rich text photo callback");
            if (intent != null) {
                m54005a(intent.getParcelableArrayListExtra("select_result"), this.f170359f);
            } else {
                AppBrandLogger.m52829e("RichTextModule", "rich text photo callback intent data is null");
            }
            DialogC13250g gVar = this.f35100a;
            if (gVar != null) {
                gVar.mo49458a();
            }
            return true;
        }
        if (i == 20005) {
            AppBrandLogger.m52828d("SearchResult", "params_little_app");
            if (intent == null) {
                AppBrandLogger.m52829e("RichTextModule", "rich text contact callback intent data is null");
                DialogC13250g gVar2 = this.f35100a;
                if (gVar2 != null) {
                    gVar2.mo49462a((List<C13235c>) null);
                }
                return true;
            }
            String stringExtra = intent.getStringExtra("params_little_app");
            if (TextUtils.isEmpty(stringExtra)) {
                AppBrandLogger.m52829e("RichTextModule", "rich text contact callback json data is null");
                return true;
            } else if (i2 == 111) {
                AppBrandLogger.m52829e("RichTextModule", "rich text get chatter fail");
                return true;
            } else if (i2 == -1) {
                AppBrandLogger.m52830i("RichTextModule", "rich text get result ok");
                ArrayList arrayList = new ArrayList();
                try {
                    JSONArray jSONArray = new JSONArray(stringExtra);
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        C13235c cVar = new C13235c();
                        JSONObject jSONObject = jSONArray.getJSONObject(i3);
                        if (jSONObject.has("id")) {
                            cVar.mo49408a(jSONObject.optString("id"));
                        }
                        if (jSONObject.has("name")) {
                            cVar.mo49410b(jSONObject.optString("name"));
                        }
                        arrayList.add(cVar);
                    }
                } catch (JSONException e) {
                    AppBrandLogger.eWithThrowable("RichTextModule", "rich text contact json parse error", e);
                }
                DialogC13250g gVar3 = this.f35100a;
                if (gVar3 != null) {
                    gVar3.mo49462a(arrayList);
                }
                return true;
            }
        }
        return false;
    }
}
