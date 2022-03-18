package com.bytedance.ee.larkbrand.p650e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.AbstractC2393i;
import com.bytedance.ee.lark.infra.sandbox.context.IAppContext;
import com.bytedance.ee.larkbrand.LarkExtensionManager;
import com.bytedance.ee.larkbrand.LarkHostDependManager;
import com.bytedance.ee.larkbrand.nativeMoudule.C13158c;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity;
import com.bytedance.ee.larkbrand.network.glide.GlideRequest;
import com.bytedance.ee.larkbrand.p651f.C13047a;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.ss.android.lark.littleapp.EnvInfo;
import com.tt.miniapp.manager.p3302a.C66399c;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.C67531h;
import com.tt.option.previewImage.AbstractC67668a;
import com.tt.option.previewImage.ImageRequest;
import com.tt.option.share.AbstractC67683f;
import com.tt.option.share.AbstractC67684g;
import com.tt.option.share.ShareInfoModel;
import com.tt.p3255a.AbstractC65677b;
import com.tt.p3255a.C65678c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ee.larkbrand.e.a */
public class C12992a implements AbstractC65677b {
    @Override // com.tt.p3255a.AbstractC65677b
    public boolean handleActivityLoginResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean handleActivityShareResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean openLoginActivity(Activity activity, HashMap<String, Object> hashMap) {
        return false;
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean share(Activity activity, ShareInfoModel shareInfoModel, AbstractC67684g gVar) {
        return false;
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public void showShareDialog(Activity activity, AbstractC67683f fVar) {
    }

    /* renamed from: a */
    private String m53456a() {
        EnvInfo a = LarkHostDependManager.f34682b.mo49086a().mo48917a();
        if (a == null || !a.mo148730a()) {
            return "1161";
        }
        return "1664";
    }

    /* renamed from: a */
    private boolean m53457a(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity) || !((Activity) context).isDestroyed()) {
            return false;
        }
        return true;
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public C67531h createInitParams(IAppContext iAppContext) {
        Application applicationContext = AppbrandContext.getInst().getApplicationContext();
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(CommonCode.StatusCode.API_CLIENT_EXPIRED, C13047a.C13049b.m53532a() + "/v2/getAppMeta");
        sparseArray.put(1007, applicationContext.getPackageName() + ".brand");
        return new C67531h.C67532a().mo234515a(m53456a()).mo234520d("feature_beta_tmg_cp").mo234514a(sparseArray).mo234518b("72").mo234516a(LarkExtensionManager.getInstance().getExtension().mo49563a()).mo234521e("lark").mo234519c(C66399c.m259608a().mo231922b(applicationContext, iAppContext)).mo234517a();
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public void loadImage(Context context, C65678c cVar) {
        if (!m53457a(context) && (cVar.f165490r instanceof ImageView)) {
            C2124f<Drawable> fVar = null;
            if (cVar.f165486n != null) {
                fVar = ComponentCallbacks2C2115c.m9151c(context).mo10415a(cVar.f165486n);
            } else if (cVar.f165487o != null) {
                fVar = ComponentCallbacks2C2115c.m9151c(context).mo10411a(cVar.f165487o);
            } else if (cVar.f165488p != 0) {
                fVar = ComponentCallbacks2C2115c.m9151c(context).mo10413a(Integer.valueOf(cVar.f165488p));
            } else if (cVar.f165489q != null) {
                fVar = ComponentCallbacks2C2115c.m9151c(context).mo10410a(cVar.f165489q);
            }
            if (fVar != null) {
                if (cVar.f165477e) {
                    fVar.mo11156m();
                } else if (cVar.f165476d) {
                    fVar.mo11150h();
                } else if (cVar.f165478f) {
                    fVar.mo11153j();
                }
                if (cVar.f165475c != 0) {
                    fVar.mo11143c(cVar.f165475c);
                }
                if (cVar.f165474b != 0) {
                    fVar.mo11123a(cVar.f165474b);
                }
                if (cVar.f165473a != null) {
                    fVar.mo11125a(cVar.f165473a);
                }
                if (cVar.f165483k != BitmapDescriptorFactory.HUE_RED) {
                    fVar.mo11130a((AbstractC2393i<Bitmap>) new C12994b(cVar.f165483k, cVar.f165484l, cVar.f165485m));
                }
                if (cVar.f165479g) {
                    fVar.mo11145c(true);
                }
                if (cVar.f165490r instanceof ImageView) {
                    fVar.mo10399a((ImageView) cVar.f165490r);
                }
            }
        }
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean startImagePreviewActivity(Activity activity, String str, List<String> list, int i) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            activity.startActivity(PhotoPreviewActivity.m53806a(activity, list, C13158c.m53778a(jSONObject, "originUrls"), C13158c.m53778a(jSONObject, "placeholderUrls"), i, jSONObject.optString("header")));
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.tt.p3255a.AbstractC65677b
    public boolean startImagePreviewActivity(Activity activity, List<ImageRequest> list, int i, final AbstractC67668a aVar) {
        ArrayList arrayList = new ArrayList();
        for (ImageRequest imageRequest : list) {
            arrayList.add(new GlideRequest(imageRequest.url, imageRequest.header, imageRequest.method, imageRequest.body));
        }
        activity.startActivity(PhotoPreviewActivity.m53805a(activity, arrayList, (List<GlideRequest>) null, (List<GlideRequest>) null, i, new PhotoPreviewActivity.AbstractC13169b() {
            /* class com.bytedance.ee.larkbrand.p650e.C12992a.C129931 */

            @Override // com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity.AbstractC13169b
            /* renamed from: a */
            public void mo48929a(int i, String str) {
                aVar.mo88084a(i, str);
            }
        }));
        return true;
    }
}
