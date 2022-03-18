package com.ss.android.lark.browser.biz.webapp.queryapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler;
import com.ss.android.lark.log.Log;
import java.util.regex.PatternSyntaxException;

public class OpPlatformServiceQueryApiHandler extends AbstractInjectQueryApiHandler implements Parcelable {
    public static final Parcelable.Creator<OpPlatformServiceQueryApiHandler> CREATOR = new Parcelable.Creator<OpPlatformServiceQueryApiHandler>() {
        /* class com.ss.android.lark.browser.biz.webapp.queryapi.OpPlatformServiceQueryApiHandler.C298811 */

        /* renamed from: a */
        public OpPlatformServiceQueryApiHandler[] newArray(int i) {
            return new OpPlatformServiceQueryApiHandler[i];
        }

        /* renamed from: a */
        public OpPlatformServiceQueryApiHandler createFromParcel(Parcel parcel) {
            return new OpPlatformServiceQueryApiHandler(parcel);
        }
    };

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public int describeContents() {
        return 0;
    }

    public OpPlatformServiceQueryApiHandler() {
    }

    protected OpPlatformServiceQueryApiHandler(Parcel parcel) {
        super(parcel);
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    /* renamed from: a */
    public void mo91866a(String str) {
        try {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (TextUtils.equals("hide_navigator", str2)) {
                    mo91999w().mo67308b().mo67327b(false);
                } else if (TextUtils.equals("show_navigator", str2)) {
                    mo91999w().mo67308b().mo67327b(true);
                } else if (TextUtils.equals("hide_image_copy_link", str2)) {
                    mo91999w().mo67305a().mo91877a(false);
                }
            }
        } catch (PatternSyntaxException e) {
            Log.m165399w("OpPlatformServiceApi", e);
        } catch (Exception e2) {
            Log.m165399w("OpPlatformServiceApi", e2);
        }
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectQueryApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}
