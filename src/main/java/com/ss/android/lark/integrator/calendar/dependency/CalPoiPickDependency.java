package com.ss.android.lark.integrator.calendar.dependency;

import android.app.Activity;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.im.api.AbstractC29622o;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.calendar.api.entity.PoiInfo;
import com.ss.android.lark.calendar.dependency.idependency.IPoiPickDependency;
import com.ss.android.lark.location.dto.POIConfig;
import com.ss.android.lark.location.dto.POIInfo;
import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/integrator/calendar/dependency/CalPoiPickDependency;", "Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency;", "()V", "poiConfig", "Lcom/ss/android/lark/location/dto/POIConfig;", "pickPoi", "", "activity", "Landroid/app/Activity;", "callback", "Lcom/ss/android/lark/calendar/dependency/idependency/IPoiPickDependency$IPoiPickCallBack;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.calendar.dependency.x */
public final class CalPoiPickDependency implements IPoiPickDependency {

    /* renamed from: a */
    private final POIConfig f100528a = new POIConfig();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/ss/android/lark/integrator/calendar/dependency/CalPoiPickDependency$pickPoi$1", "Lcom/ss/android/lark/biz/im/api/ILocationResultListener;", "handleResult", "", "activity", "Landroid/app/Activity;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/location/dto/POIInfo;", "calendar_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.integrator.calendar.dependency.x$a */
    public static final class C39225a implements AbstractC29622o {

        /* renamed from: a */
        final /* synthetic */ IPoiPickDependency.IPoiPickCallBack f100529a;

        C39225a(IPoiPickDependency.IPoiPickCallBack aVar) {
            this.f100529a = aVar;
        }

        @Override // com.ss.android.lark.biz.im.api.AbstractC29622o
        public void handleResult(Activity activity, POIInfo pOIInfo) {
            PoiInfo cVar;
            Intrinsics.checkParameterIsNotNull(activity, "activity");
            if (pOIInfo != null) {
                String locationName = pOIInfo.getLocationName();
                Intrinsics.checkExpressionValueIsNotNull(locationName, "it.locationName");
                cVar = new PoiInfo(locationName, pOIInfo.getLocationAddress(), Double.valueOf(pOIInfo.getLongitude()), Double.valueOf(pOIInfo.getLatitude()));
            } else {
                cVar = null;
            }
            this.f100529a.mo108292a(cVar);
        }
    }

    @Override // com.ss.android.lark.calendar.dependency.idependency.IPoiPickDependency
    /* renamed from: a */
    public void mo108291a(Activity activity, IPoiPickDependency.IPoiPickCallBack aVar) {
        Intrinsics.checkParameterIsNotNull(activity, "activity");
        Intrinsics.checkParameterIsNotNull(aVar, "callback");
        this.f100528a.setSelfDefine(true);
        this.f100528a.setSnapshot(false);
        this.f100528a.setActionText(activity.getString(R.string.Calendar_Common_Done));
        IIMApi iIMApi = (IIMApi) ApiUtils.getApi(IIMApi.class);
        if (iIMApi != null) {
            iIMApi.fetchMapLocation(activity, null, this.f100528a, new C39225a(aVar), false);
        }
    }
}
