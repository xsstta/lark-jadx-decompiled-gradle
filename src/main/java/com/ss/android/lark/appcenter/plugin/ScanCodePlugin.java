package com.ss.android.lark.appcenter.plugin;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.larksuite.framework.apiplugin.AbstractC25889a;
import com.larksuite.framework.apiplugin.AbstractC25905b;
import com.larksuite.framework.apiplugin.annotation.LKPluginFunction;
import com.larksuite.framework.apiplugin.common.C25920a;
import com.larksuite.framework.apiplugin.common.C25921b;
import com.larksuite.framework.apiplugin.core.LKCallProxyActivityCallback;
import com.larksuite.framework.apiplugin.core.LKTransActivity;
import com.larksuite.framework.apiplugin.p1175a.AbstractC25897h;
import com.larksuite.framework.apiplugin.p1176b.C25906a;
import com.ss.android.lark.appcenter.scancode.C29118b;
import com.ss.android.lark.appcenter.scancode.ScanCodeActivity;
import com.ss.android.lark.appcenter.wrapper.AppCenterModule;
import com.ss.android.lark.optrace.api.ILogger;
import com.tt.refer.common.util.C67858b;
import java.util.Arrays;
import java.util.List;

public class ScanCodePlugin extends AbstractC25889a {

    public static class Request extends C25920a {
        @JSONField(name = "barCodeInput")
        public boolean mBarCodeInput;
        @JSONField(name = "scanType")
        public List<String> mScanType;
    }

    public static class Response extends C25921b {
        @JSONField(name = "result")
        public String mResult;
    }

    @Override // com.larksuite.framework.apiplugin.AbstractC25937e
    public void onRelease() {
    }

    public static class StartScanCodeActivityCallback implements LKCallProxyActivityCallback {
        public static final Parcelable.Creator<StartScanCodeActivityCallback> CREATOR = new Parcelable.Creator<StartScanCodeActivityCallback>() {
            /* class com.ss.android.lark.appcenter.plugin.ScanCodePlugin.StartScanCodeActivityCallback.C291011 */

            /* renamed from: a */
            public StartScanCodeActivityCallback[] newArray(int i) {
                return new StartScanCodeActivityCallback[i];
            }

            /* renamed from: a */
            public StartScanCodeActivityCallback createFromParcel(Parcel parcel) {
                return new StartScanCodeActivityCallback(parcel);
            }
        };
        private int[] mFormats;
        private boolean mIsShowBarCode;

        public int describeContents() {
            return 0;
        }

        @Override // com.larksuite.framework.apiplugin.core.LKCallProxyActivityCallback
        public void onCreated(Activity activity) {
            ScanCodeActivity.m107000a(activity, this.mFormats, this.mIsShowBarCode, true);
            if (activity instanceof LKTransActivity) {
                activity.finish();
            }
        }

        protected StartScanCodeActivityCallback(Parcel parcel) {
            boolean z;
            this.mFormats = parcel.createIntArray();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.mIsShowBarCode = z;
        }

        public StartScanCodeActivityCallback(int[] iArr, boolean z) {
            this.mFormats = iArr;
            this.mIsShowBarCode = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeIntArray(this.mFormats);
            parcel.writeByte(this.mIsShowBarCode ? (byte) 1 : 0);
        }
    }

    @LKPluginFunction(async = true, eventName = {"scanCode"})
    public void scanCode(Request request, AbstractC25905b bVar, AbstractC25897h<Response> hVar, ILogger aVar) {
        boolean z;
        boolean z2;
        aVar.mo92224i("ScanCodePlugin", "scanCode");
        String str = "";
        if (!C67858b.m263996a(request.mScanType)) {
            request.mScanType.removeAll(Arrays.asList(str, null));
            z2 = false;
            z = false;
            for (String str2 : request.mScanType) {
                if (TextUtils.equals(str2, "barCode")) {
                    z = true;
                } else if (TextUtils.equals(str2, "qrCode")) {
                    z2 = true;
                }
            }
        } else {
            z2 = false;
            z = false;
        }
        if (z) {
            if (!z2) {
                str = "barCode";
            }
        } else if (z2) {
            str = "qrCode";
        }
        int[] iArr = {0, 1};
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.equals(str, "barCode")) {
                iArr = new int[]{1};
            } else if (TextUtils.equals(str, "qrCode")) {
                iArr = new int[]{0};
            }
        }
        C29118b.m107036a().mo103279a(new AppCenterModule.AbstractC29127a(aVar, hVar) {
            /* class com.ss.android.lark.appcenter.plugin.$$Lambda$ScanCodePlugin$GvhqZEcAf8dPXWF1ERKZffgHTfg */
            public final /* synthetic */ ILogger f$1;
            public final /* synthetic */ AbstractC25897h f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // com.ss.android.lark.appcenter.wrapper.AppCenterModule.AbstractC29127a
            public final boolean handleResult(Context context, String str, int i) {
                return ScanCodePlugin.this.lambda$scanCode$0$ScanCodePlugin(this.f$1, this.f$2, context, str, i);
            }
        });
        bVar.mo92213a(new StartScanCodeActivityCallback(iArr, request.mBarCodeInput));
    }

    public /* synthetic */ boolean lambda$scanCode$0$ScanCodePlugin(ILogger aVar, AbstractC25897h hVar, Context context, String str, int i) {
        aVar.mo92224i("ScanCodePlugin", "result");
        Response response = new Response();
        if (!TextUtils.isEmpty(str)) {
            response.mResult = str;
        } else {
            aVar.mo92224i("ScanCodePlugin", "use cancel");
            fillFailedResponse(response, C25906a.f64080j, "use cancel");
        }
        hVar.callback(response);
        return true;
    }
}
