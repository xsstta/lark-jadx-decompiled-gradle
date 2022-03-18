package com.ss.android.lark.searchcommon.view.general.lynx;

import android.content.Context;
import android.text.TextUtils;
import com.larksuite.framework.utils.UIUtils;
import com.lynx.tasm.C26910m;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.p1227d.C26886a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.searchcommon.gecko.ASLynxGeckoManager;
import com.ss.android.lark.searchcommon.utils.SearchCommonUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J0\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\b2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0016J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "curCardInfo", "Lcom/ss/android/lark/searchcommon/view/general/lynx/CardInfo;", "curContent", "", "lynxView", "Lcom/lynx/tasm/LynxView;", "getLynxView", "()Lcom/lynx/tasm/LynxView;", "lynxViewBuilder", "Lcom/lynx/tasm/LynxViewBuilder;", "render", "", "renderContent", "cardInfo", "clientArgs", "", "renderInner", "templateData", "Lcom/lynx/tasm/TemplateData;", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.f */
public class LynxCard {

    /* renamed from: a */
    public static final Companion f133789a = new Companion(null);

    /* renamed from: b */
    private final C26910m f133790b;

    /* renamed from: c */
    private String f133791c;

    /* renamed from: d */
    private CardInfo f133792d;

    /* renamed from: e */
    private final LynxView f133793e;

    /* renamed from: f */
    private final Context f133794f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/general/lynx/LynxCard$Companion;", "", "()V", "TAG", "", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.f$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final LynxView mo184975a() {
        return this.f133793e;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.view.general.lynx.f$b */
    public static final class C54036b extends Lambda implements Function1<byte[], Unit> {
        final /* synthetic */ CardInfo $cardInfo;
        final /* synthetic */ TemplateData $templateData;
        final /* synthetic */ LynxCard this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C54036b(LynxCard fVar, TemplateData templateData, CardInfo bVar) {
            super(1);
            this.this$0 = fVar;
            this.$templateData = templateData;
            this.$cardInfo = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
            invoke(bArr);
            return Unit.INSTANCE;
        }

        public final void invoke(byte[] bArr) {
            if (bArr != null) {
                this.this$0.mo184975a().renderTemplateWithBaseUrl(bArr, this.$templateData, this.$cardInfo.mo184968b());
            }
        }
    }

    public LynxCard(Context context) {
        String str;
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.f133794f = context;
        C26910m mVar = new C26910m();
        this.f133790b = mVar;
        mVar.mo95726a("ASLynxBridge", ASLynxBridge.class);
        mVar.mo95735c(375, UIUtils.getScreenHeight(context));
        LynxView lynxView = new LynxView(context, mVar);
        this.f133793e = lynxView;
        lynxView.setImageInterceptor(new ASLynxViewClient());
        if (SearchCommonUtils.f133387a.mo184562a(context)) {
            str = "dark";
        } else {
            str = "light";
        }
        C26886a aVar = new C26886a();
        aVar.mo95680a("brightness", str);
        lynxView.setTheme(aVar);
    }

    /* renamed from: a */
    private final void m209690a(TemplateData templateData, CardInfo bVar) {
        ASLynxGeckoManager.f133123f.mo183794a().mo183790a(bVar.mo184969c(), bVar.mo184967a(), new C54036b(this, templateData, bVar));
    }

    /* renamed from: a */
    public final void mo184976a(String str, CardInfo bVar, Map<String, String> map) {
        String str2;
        Intrinsics.checkParameterIsNotNull(bVar, "cardInfo");
        TemplateData a = TemplateData.m96224a(str);
        Intrinsics.checkExpressionValueIsNotNull(a, "TemplateData.fromString(renderContent)");
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                Log.m165379d("ASL.LynxCard", "key: " + entry.getKey() + " value: " + entry.getValue());
                a.mo94336b(entry.getKey(), entry.getValue());
            }
        }
        if (TextUtils.equals(str, this.f133791c)) {
            String a2 = bVar.mo184967a();
            CardInfo bVar2 = this.f133792d;
            if (bVar2 != null) {
                str2 = bVar2.mo184967a();
            } else {
                str2 = null;
            }
            if (TextUtils.equals(a2, str2)) {
                this.f133793e.updateData(a);
                return;
            }
        }
        this.f133791c = str;
        this.f133792d = bVar;
        m209690a(a, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.ss.android.lark.searchcommon.view.general.lynx.f */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ void m209691a(LynxCard fVar, String str, CardInfo bVar, Map map, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                map = null;
            }
            fVar.mo184976a(str, bVar, map);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: render");
    }
}
