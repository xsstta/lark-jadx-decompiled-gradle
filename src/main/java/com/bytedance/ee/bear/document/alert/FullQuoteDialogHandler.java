package com.bytedance.ee.bear.document.alert;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.jsbridge.AbstractC7945d;
import com.bytedance.ee.bear.jsbridge.AbstractC7947h;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.bear.route.AbstractC10740f;
import com.bytedance.ee.log.C13479a;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/document/alert/FullQuoteDialogHandler;", "Lcom/bytedance/ee/bear/jsbridge/BridgeHandlerV2;", "Lcom/bytedance/ee/bear/document/alert/FailType;", "form", "", "(Ljava/lang/String;)V", "getForm", "()Ljava/lang/String;", "handle", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "callback", "Lcom/bytedance/ee/bear/jsbridge/CallBackFunction;", "showFullQuotoDialog", "config", "Lcom/bytedance/ee/bear/quoto/FullQuotoConfig;", "showUserExceedQuotaDialog", "mountNodeToken", "mountPoint", "Companion", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.alert.a */
public final class FullQuoteDialogHandler implements AbstractC7945d<FailType> {

    /* renamed from: a */
    public static final Companion f15985a = new Companion(null);

    /* renamed from: b */
    private final String f15986b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/document/alert/FullQuoteDialogHandler$Companion;", "", "()V", "TAG", "", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.document.alert.a$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FullQuoteDialogHandler(String str) {
        Intrinsics.checkParameterIsNotNull(str, "form");
        this.f15986b = str;
    }

    /* renamed from: a */
    public final void mo22627a(FullQuotoConfig fullQuotoConfig) {
        Intrinsics.checkParameterIsNotNull(fullQuotoConfig, "config");
        Activity b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17294b();
        if (!(b instanceof FragmentActivity)) {
            b = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) b;
        C13479a.m54764b("FullQuoteDialogHandler", "showFullQuotoDialog from " + this.f15986b + "  currentActivity is " + fragmentActivity);
        if (fragmentActivity != null) {
            ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40012a(fragmentActivity, fullQuotoConfig);
        }
    }

    /* renamed from: a */
    public void handle(FailType failType, AbstractC7947h hVar) {
        Integer num;
        StringBuilder sb = new StringBuilder();
        sb.append("from ");
        sb.append(this.f15986b);
        sb.append("  data.type = ");
        Integer num2 = null;
        if (failType != null) {
            num = Integer.valueOf(failType.getType());
        } else {
            num = null;
        }
        sb.append(num);
        C13479a.m54764b("FullQuoteDialogHandler", sb.toString());
        if (failType != null) {
            num2 = Integer.valueOf(failType.getType());
        }
        if (num2 != null && num2.intValue() == 0) {
            mo22627a(FullQuotoConfig.UPLOAD);
        } else if (num2 != null && num2.intValue() == 2) {
            mo22627a(FullQuotoConfig.MAKE_COPY);
        } else if (num2 != null && num2.intValue() == 1) {
            mo22627a(FullQuotoConfig.TRANSLATE);
        } else if (num2 != null && num2.intValue() == 6) {
            mo22628a(failType.getMount_token(), failType.getMount_point());
        }
    }

    /* renamed from: a */
    public final void mo22628a(String str, String str2) {
        Activity b = ((AbstractC10740f) KoinJavaComponent.m268613a(AbstractC10740f.class, null, null, 6, null)).mo17294b();
        if (!(b instanceof FragmentActivity)) {
            b = null;
        }
        FragmentActivity fragmentActivity = (FragmentActivity) b;
        C13479a.m54764b("FullQuoteDialogHandler", "showUserExceedQuotaDialog from " + this.f15986b + "  currentActivity is " + fragmentActivity);
        if (fragmentActivity != null) {
            ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40013a(fragmentActivity, str, str2, false);
        }
    }
}
