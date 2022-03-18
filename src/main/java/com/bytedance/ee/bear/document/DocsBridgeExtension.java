package com.bytedance.ee.bear.document;

import com.bytedance.ee.larkwebview.bridge.BridgeExetension;
import com.bytedance.ee.larkwebview.bridge.Message;
import com.bytedance.ee.util.common.C13606d;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0016J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\u0012"}, d2 = {"Lcom/bytedance/ee/bear/document/DocsBridgeExtension;", "Lcom/bytedance/ee/larkwebview/bridge/BridgeExetension;", "()V", "APINAME", "", "getAPINAME", "()Ljava/lang/String;", "APINAME_DATA_DISTANCE", "", "getAPINAME_DATA_DISTANCE", "()I", "CALLBACKID", "getCALLBACKID", "jsDataToMessage", "Lcom/bytedance/ee/larkwebview/bridge/Message;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "parse", "jsMessage", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.j */
public final class DocsBridgeExtension extends BridgeExetension {

    /* renamed from: a */
    private final String f16397a = "callbackID\":\"";

    /* renamed from: b */
    private final String f16398b = "\"apiName\":\"";

    /* renamed from: c */
    private final int f16399c = 9;

    @Override // com.bytedance.ee.larkwebview.bridge.BridgeExetension
    /* renamed from: a */
    public Message mo23541a(String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(str, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        try {
            Message b = mo23542b(str);
            String apiName = b.getApiName();
            if (apiName == null || apiName.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return b;
            }
            C13606d.m55245a("DocsBridgeExtension", new RuntimeException("message.apiName.isNullOrEmpty()"));
            Message a = super.mo23541a(str);
            Intrinsics.checkExpressionValueIsNotNull(a, "super.jsDataToMessage(data)");
            return a;
        } catch (Throwable th) {
            C13606d.m55245a("DocsBridgeExtension", th);
            Message a2 = super.mo23541a(str);
            Intrinsics.checkExpressionValueIsNotNull(a2, "super.jsDataToMessage(data)");
            return a2;
        }
    }

    /* renamed from: b */
    public final Message mo23542b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "jsMessage");
        Message message = new Message();
        String str2 = str;
        int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, this.f16397a, 0, false, 6, (Object) null);
        if (indexOf$default >= 0) {
            int length = indexOf$default + this.f16397a.length();
            String substring = str.substring(length, StringsKt.indexOf$default((CharSequence) str2, '\"', length, false, 4, (Object) null));
            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            message.setCallbackID(substring);
        }
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, this.f16398b, 0, false, 6, (Object) null);
        if (indexOf$default2 >= 0) {
            int length2 = indexOf$default2 + this.f16398b.length();
            int indexOf$default3 = StringsKt.indexOf$default((CharSequence) str2, '\"', length2, false, 4, (Object) null);
            String substring2 = str.substring(length2, indexOf$default3);
            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            message.setApiName(substring2);
            int i = indexOf$default3 + this.f16399c;
            int length3 = str.length() - 1;
            if (i < length3) {
                String substring3 = str.substring(i, length3);
                Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                message.setData(substring3);
            }
        }
        return message;
    }
}
