package com.ss.android.vc.lark.rvc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.webview.container.dto.AbstractC25832c;
import com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler;
import com.ss.android.vc.common.p3077b.C60700b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u001c\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\fH\u0016R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/ss/android/vc/lark/rvc/LogHandler;", "Lcom/larksuite/component/webview/container/dto/AbstractInjectJSApiHandler;", "Lcom/ss/android/vc/lark/rvc/LogJSModel;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "tag", "", "getTag", "()Ljava/lang/String;", "describeContents", "", "init", "", "extra", "Landroid/os/Bundle;", "onRequest", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/larksuite/component/webview/container/dto/IJSApiRequestCallback;", "writeToParcel", "flags", "CREATOR", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class LogHandler extends AbstractInjectJSApiHandler<LogJSModel> {
    public static final CREATOR CREATOR = new CREATOR(null);

    /* renamed from: a */
    private final String f153225a = "RvcLog";

    /* access modifiers changed from: protected */
    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler, com.larksuite.component.webview.container.impl.jsapi.AbstractC25869a
    /* renamed from: a */
    public void mo91860a(Bundle bundle) {
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public int describeContents() {
        return 0;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/ss/android/vc/lark/rvc/LogHandler$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/ss/android/vc/lark/rvc/LogHandler;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/ss/android/vc/lark/rvc/LogHandler;", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.lark.rvc.LogHandler$a */
    public static final class CREATOR implements Parcelable.Creator<LogHandler> {
        private CREATOR() {
        }

        /* renamed from: a */
        public LogHandler[] newArray(int i) {
            return new LogHandler[i];
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public LogHandler createFromParcel(Parcel parcel) {
            Intrinsics.checkParameterIsNotNull(parcel, "parcel");
            return new LogHandler(parcel);
        }
    }

    public LogHandler() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogHandler(Parcel parcel) {
        super(parcel);
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
    }

    @Override // com.larksuite.component.webview.container.dto.AbstractInjectJSApiHandler
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkParameterIsNotNull(parcel, "parcel");
        super.writeToParcel(parcel, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91861a(LogJSModel logJSModel, AbstractC25832c cVar) {
        if (logJSModel != null) {
            int level = logJSModel.getLevel();
            String str = "";
            if (level == 1) {
                String str2 = this.f153225a;
                String message = logJSModel.getMessage();
                if (message != null) {
                    str = message;
                }
                C60700b.m235851b(str2, "jsLog", str);
            } else if (level == 2) {
                String str3 = this.f153225a;
                String message2 = logJSModel.getMessage();
                if (message2 != null) {
                    str = message2;
                }
                C60700b.m235861e(str3, "jsLog", str);
            } else if (level == 3) {
                String str4 = this.f153225a;
                String message3 = logJSModel.getMessage();
                if (message3 != null) {
                    str = message3;
                }
                C60700b.m235864f(str4, "jsLog", str);
            }
        }
    }
}
