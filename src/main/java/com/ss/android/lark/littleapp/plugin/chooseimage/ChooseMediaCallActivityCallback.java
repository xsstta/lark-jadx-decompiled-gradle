package com.ss.android.lark.littleapp.plugin.chooseimage;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.larksuite.component.openplatform.plugins.utils.C25613c;
import com.larksuite.framework.apiplugin.core.LKCallProxyActivityCallback;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.entity.RouteOpenCameraModel;
import com.ss.android.lark.littleapp.entity.RoutePhotoPickerModel;
import com.ss.android.lark.littleapp.plugin.chooseimage.ChooseMediaCallActivityCallback;
import com.ss.android.lark.littleapp.service.p2132a.C41437d;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.PickerParams;
import kotlin.jvm.functions.Function1;

public class ChooseMediaCallActivityCallback implements LKCallProxyActivityCallback {
    public static final Parcelable.Creator<ChooseMediaCallActivityCallback> CREATOR = new Parcelable.Creator<ChooseMediaCallActivityCallback>() {
        /* class com.ss.android.lark.littleapp.plugin.chooseimage.ChooseMediaCallActivityCallback.C414061 */

        /* renamed from: a */
        public ChooseMediaCallActivityCallback[] newArray(int i) {
            return new ChooseMediaCallActivityCallback[i];
        }

        /* renamed from: a */
        public ChooseMediaCallActivityCallback createFromParcel(Parcel parcel) {
            return new ChooseMediaCallActivityCallback(parcel);
        }
    };
    public BaseRouteModel mRouteModel;

    public int describeContents() {
        return 0;
    }

    public ChooseMediaCallActivityCallback(BaseRouteModel baseRouteModel) {
        this.mRouteModel = baseRouteModel;
    }

    @Override // com.larksuite.framework.apiplugin.core.LKCallProxyActivityCallback
    public void onCreated(final Activity activity) {
        C25613c.m91382a(new Runnable() {
            /* class com.ss.android.lark.littleapp.plugin.chooseimage.ChooseMediaCallActivityCallback.RunnableC414072 */

            public void run() {
                if (ChooseMediaCallActivityCallback.this.mRouteModel instanceof RoutePhotoPickerModel) {
                    AppBrandLogger.m52830i("ChooseMediaCallActivityCallback", "start PhotoPicker");
                    RoutePhotoPickerModel routePhotoPickerModel = (RoutePhotoPickerModel) ChooseMediaCallActivityCallback.this.mRouteModel;
                    C41437d.m164411e().mo149160a(activity, routePhotoPickerModel.mo148846b(), routePhotoPickerModel.mo148847c(), routePhotoPickerModel.mo148848d(), routePhotoPickerModel.mo148849e());
                } else if (ChooseMediaCallActivityCallback.this.mRouteModel instanceof RouteMediaPickerModel) {
                    C58557a.m227128a(PickerParams.m227538a(new Function1() {
                        /* class com.ss.android.lark.littleapp.plugin.chooseimage.$$Lambda$ChooseMediaCallActivityCallback$2$EyMFfy1C33gBghsQSeFtHIJosHA */

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ChooseMediaCallActivityCallback.RunnableC414072.m164176a(RouteMediaPickerModel.this, (PickerParams.Builder) obj);
                        }
                    })).mo198510a(activity, 233);
                } else if (ChooseMediaCallActivityCallback.this.mRouteModel instanceof RouteOpenCameraModel) {
                    AppBrandLogger.m52830i("ChooseMediaCallActivityCallback", "start OpenCamera");
                    C41437d.m164411e().mo149159a(activity, 20010, ((RouteOpenCameraModel) ChooseMediaCallActivityCallback.this.mRouteModel).mo148835b());
                }
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static /* synthetic */ kotlin.Unit m164176a(com.ss.android.lark.littleapp.plugin.chooseimage.RouteMediaPickerModel r6, com.ss.android.lark.widget.photo_picker.PickerParams.Builder r7) {
                /*
                // Method dump skipped, instructions count: 112
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.littleapp.plugin.chooseimage.ChooseMediaCallActivityCallback.RunnableC414072.m164176a(com.ss.android.lark.littleapp.plugin.chooseimage.RouteMediaPickerModel, com.ss.android.lark.widget.photo_picker.g$a):kotlin.Unit");
            }
        });
    }

    protected ChooseMediaCallActivityCallback(Parcel parcel) {
        this.mRouteModel = (BaseRouteModel) parcel.readParcelable(BaseRouteModel.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.mRouteModel, 1);
    }
}
