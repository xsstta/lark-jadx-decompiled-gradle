package com.ss.android.lark.ai.enterpriseTopic.view;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.ViewGroup;
import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.suite.R;
import com.ss.android.lark.ai.enterpriseTopic.C28551a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.ai.EntityCardData;
import com.ss.android.lark.searchcommon.view.general.lynx.CardInfo;
import com.ss.android.lark.searchcommon.view.general.lynx.IReportListener;
import com.ss.android.lark.searchcommon.view.general.lynx.LynxCard;
import com.ss.android.lark.utils.ViewUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 +2\u00020\u0001:\u0001+B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\"\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010&\u001a\u00020#H\u0016J\u0012\u0010'\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020#H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006,"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/LynxContainerDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "card", "Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard;", "getCard", "()Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard;", "clientArgs", "", "", "getClientArgs", "()Ljava/util/Map;", "setClientArgs", "(Ljava/util/Map;)V", "clientCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "getClientCallback", "()Lcom/larksuite/framework/callback/IGetDataCallback;", "setClientCallback", "(Lcom/larksuite/framework/callback/IGetDataCallback;)V", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/ss/android/lark/pb/ai/EntityCardData;", "getData", "()Lcom/ss/android/lark/pb/ai/EntityCardData;", "setData", "(Lcom/ss/android/lark/pb/ai/EntityCardData;)V", "reportListener", "Lcom/ss/android/lark/searchcommon/view/general/lynx/IReportListener;", "getReportListener", "()Lcom/ss/android/lark/searchcommon/view/general/lynx/IReportListener;", "setReportListener", "(Lcom/ss/android/lark/searchcommon/view/general/lynx/IReportListener;)V", "attachData", "", "checkContext", "", "dismiss", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "show", "Companion", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.d */
public final class LynxContainerDialog extends Dialog {

    /* renamed from: a */
    public static final Companion f71900a = new Companion(null);

    /* renamed from: b */
    private final LynxCard f71901b;

    /* renamed from: c */
    private EntityCardData f71902c;

    /* renamed from: d */
    private IReportListener f71903d;

    /* renamed from: e */
    private Map<String, String> f71904e;

    /* renamed from: f */
    private IGetDataCallback<String> f71905f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/ai/enterpriseTopic/view/LynxContainerDialog$Companion;", "", "()V", "TAG", "", "im_ai-modules_ai_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.d$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final LynxCard mo101736a() {
        return this.f71901b;
    }

    /* renamed from: b */
    public final EntityCardData mo101740b() {
        return this.f71902c;
    }

    /* renamed from: c */
    public final IReportListener mo101741c() {
        return this.f71903d;
    }

    /* renamed from: d */
    public final Map<String, String> mo101742d() {
        return this.f71904e;
    }

    /* renamed from: e */
    public final IGetDataCallback<String> mo101744e() {
        return this.f71905f;
    }

    public void dismiss() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (m104795a(context)) {
            super.dismiss();
        }
    }

    public void show() {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        if (m104795a(context)) {
            super.show();
        }
    }

    /* renamed from: a */
    public final void mo101737a(IGetDataCallback<String> iGetDataCallback) {
        this.f71905f = iGetDataCallback;
    }

    /* renamed from: a */
    private final boolean m104795a(Context context) {
        return C28551a.m104696a(ViewUtils.m224141a(context));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxContainerDialog(Context context) {
        super(context, R.style.LynxContainerDialog);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f71901b = new LynxCard(context);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f71901b.mo184975a(), new ViewGroup.LayoutParams(-1, -1));
        setOnShowListener(new DialogInterface$OnShowListenerC28577b(this));
    }

    /* renamed from: a */
    public final void mo101739a(Map<String, String> map) {
        this.f71904e = map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "onShow"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.ai.enterpriseTopic.view.d$b */
    static final class DialogInterface$OnShowListenerC28577b implements DialogInterface.OnShowListener {

        /* renamed from: a */
        final /* synthetic */ LynxContainerDialog f71906a;

        DialogInterface$OnShowListenerC28577b(LynxContainerDialog dVar) {
            this.f71906a = dVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            String str2;
            Log.m165379d("AI.LynxContainerDialog", "height: " + this.f71906a.mo101736a().mo184975a().getHeight());
            EntityCardData b = this.f71906a.mo101740b();
            CardInfo bVar = null;
            if (b != null) {
                str = b.mcard;
            } else {
                str = null;
            }
            Log.m165379d("AI.LynxContainerDialog", "renderContent " + str);
            this.f71906a.mo101736a().mo184975a().setTag(R.id.lynx_view_click_listener, this.f71906a.mo101741c());
            EntityCardData b2 = this.f71906a.mo101740b();
            if (!(b2 == null || (str2 = b2.mtemplate_name) == null)) {
                bVar = new CardInfo(str2, "", "mobile_cyclopedia");
            }
            if (bVar != null) {
                this.f71906a.mo101736a().mo184976a(str, bVar, this.f71906a.mo101742d());
                IGetDataCallback<String> e = this.f71906a.mo101744e();
                if (e != null) {
                    this.f71906a.mo101736a().mo184975a().setTag(R.id.lynx_view_client_callback, e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo101738a(EntityCardData entityCardData, IReportListener eVar) {
        Intrinsics.checkParameterIsNotNull(entityCardData, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        Intrinsics.checkParameterIsNotNull(eVar, "reportListener");
        this.f71902c = entityCardData;
        this.f71903d = eVar;
        show();
    }
}
