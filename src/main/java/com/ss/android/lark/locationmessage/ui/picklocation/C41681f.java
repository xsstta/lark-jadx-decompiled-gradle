package com.ss.android.lark.locationmessage.ui.picklocation;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.larksuite.framework.mvp.BasePresenter;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.location.p2146b.AbstractC41562e;
import com.ss.android.lark.locationmessage.ui.picklocation.C41665b;
import com.ss.android.lark.locationmessage.ui.picklocation.LocationView;
import com.ss.android.lark.permission.rxPermission.C51331a;
import com.ss.android.lark.util.share_preference.UserSP;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.f */
public class C41681f extends BasePresenter<C41665b.AbstractC41666a, C41665b.AbstractC41667b, C41665b.AbstractC41667b.AbstractC41668a> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C41665b.AbstractC41667b.AbstractC41668a createViewDelegate() {
        return new C41683a();
    }

    /* renamed from: b */
    public boolean mo149866b() {
        return ((C41665b.AbstractC41667b) getView()).mo149801a();
    }

    /* renamed from: com.ss.android.lark.locationmessage.ui.picklocation.f$a */
    public class C41683a implements C41665b.AbstractC41667b.AbstractC41668a {
        public C41683a() {
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149841a(Context context, LocationView.AbstractC41659b bVar) {
            C41681f.this.mo149865a(context, bVar);
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149836a(double d, double d2) {
            ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149828a(d, d2);
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public List<POIInfo> mo149835a(Context context, boolean z) {
            List<POIInfo> jSONArray = UserSP.getInstance().getJSONArray("location_content", POIInfo.class);
            if (CollectionUtils.isEmpty(jSONArray)) {
                return new ArrayList();
            }
            Iterator<POIInfo> it = jSONArray.iterator();
            while (it.hasNext()) {
                if (it.next().getIsSelfDefine() && z) {
                    it.remove();
                }
            }
            return jSONArray;
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149842a(Context context, LocationView.AbstractC41661d dVar) {
            ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149833a(context, dVar);
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149838a(final Context context, final Bitmap bitmap, final LocationView.AbstractC41662e eVar) {
            C51331a aVar = new C51331a((Activity) context);
            if (aVar.mo176921a("android.permission.WRITE_EXTERNAL_STORAGE")) {
                ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149830a(context, bitmap, eVar);
            } else {
                aVar.mo176924c("android.permission.WRITE_EXTERNAL_STORAGE").subscribe(new Consumer<Boolean>() {
                    /* class com.ss.android.lark.locationmessage.ui.picklocation.C41681f.C41683a.C416841 */

                    /* renamed from: a */
                    public void accept(Boolean bool) throws Exception {
                        if (bool.booleanValue()) {
                            ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149830a(context, bitmap, eVar);
                        }
                    }
                });
            }
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149839a(Context context, POIInfo pOIInfo, AbstractC41562e.AbstractC41564b bVar) {
            ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149831a(context, pOIInfo, bVar);
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149840a(Context context, POIInfo pOIInfo, boolean z) {
            if (!z || !pOIInfo.getIsSelfDefine()) {
                List<POIInfo> a = mo149835a(context, z);
                if (!a.contains(pOIInfo)) {
                    a.add(0, pOIInfo);
                    if (a.size() > 10) {
                        a = a.subList(0, 10);
                    }
                    UserSP.getInstance().putJSONArray("location_content", a);
                }
            }
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149843a(Context context, String str, LocationView.AbstractC41660c cVar) {
            ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149834a(context, str, cVar);
        }

        @Override // com.ss.android.lark.locationmessage.ui.picklocation.C41665b.AbstractC41667b.AbstractC41668a
        /* renamed from: a */
        public void mo149837a(Context context, double d, double d2, LocationView.AbstractC41658a aVar) {
            ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149829a(context, d, d2, aVar);
        }
    }

    C41681f(C41665b.AbstractC41666a aVar, C41665b.AbstractC41667b bVar) {
        super(aVar, bVar);
    }

    /* renamed from: a */
    public void mo149865a(final Context context, final LocationView.AbstractC41659b bVar) {
        C51331a aVar = new C51331a((Activity) context);
        if (!aVar.mo176921a("android.permission.ACCESS_FINE_LOCATION")) {
            aVar.mo176924c("android.permission.ACCESS_FINE_LOCATION").subscribe(new Consumer<Boolean>() {
                /* class com.ss.android.lark.locationmessage.ui.picklocation.C41681f.C416821 */

                /* renamed from: a */
                public void accept(Boolean bool) throws Exception {
                    if (bool.booleanValue()) {
                        ((C41665b.AbstractC41666a) C41681f.this.getModel()).mo149832a(context, bVar);
                    }
                }
            });
        } else {
            ((C41665b.AbstractC41666a) getModel()).mo149832a(context, bVar);
        }
    }
}
