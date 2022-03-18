package com.bytedance.ee.bear.wikiv2;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4950k;
import com.bytedance.ee.bear.contract.NetService;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.contract.route.parcelable.WikiInfo;
import com.bytedance.ee.bear.document.FragmentHostAbility;
import com.bytedance.ee.bear.more.moreprotocol.BaseMoreItem;
import com.bytedance.ee.bear.wikiv2.browser.plugin.C12213f;
import com.bytedance.ee.bear.wikiv2.browser.plugin.WikiViewModel;
import com.bytedance.ee.bear.wikiv2.more_item.WikiDeleteItem;
import com.bytedance.ee.bear.wikiv2.more_item.WikiMakeCopyItem;
import com.bytedance.ee.bear.wikiv2.more_item.WikiStarItem;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.C12455c;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.api.GetWikiVersionPuller;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¨\u0006\u001d"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/WikiImpl;", "Lcom/bytedance/ee/bear/contract/route/parcelable/IWiki;", "()V", "canWikiV2ShowPermission", "", "getContainerId", "", "pluginHost", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "bundle", "Landroid/os/Bundle;", "getWikiType", "Lio/reactivex/Flowable;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiInfo;", "wikiToken", "getWikiVersion", "ver", "isWikiV1Enable", "isWikiV2Enable", "isWikiV3Enable", "isWikiVersionV2", "provideWikiDeleteItem", "Lcom/bytedance/ee/bear/more/moreprotocol/BaseMoreItem;", "provideWikiMakeCopyItem", "documentName", "provideWikiStarItem", "pullWikiVersion", "spaceId", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.b */
public final class WikiImpl implements IWiki {

    /* renamed from: a */
    public static final Companion f32820a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/WikiImpl$Companion;", "", "()V", "TAG", "", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: b */
    public boolean mo21068b() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki_enable", false);
        C13479a.m54764b("WikiImpl", "isWikiV1Enable: " + b);
        return b;
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: c */
    public boolean mo21070c() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki2.0_enable", false);
        C13479a.m54764b("WikiImpl", "isWikiV2Enable: " + b);
        return b;
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: d */
    public boolean mo21072d() {
        boolean b = C4211a.m17514a().mo16538b("spacekit.mobile.wiki3.0_enable", false);
        C13479a.m54764b("WikiImpl", "isWikiV3Enable: " + b);
        return b;
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: a */
    public boolean mo21066a() {
        return C4211a.m17514a().mo16536a("spacekit.mobile.wiki2.0_permission_setting_enable", false);
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: a */
    public BaseMoreItem mo21061a(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        return new WikiDeleteItem(eVar);
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: b */
    public BaseMoreItem mo21067b(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        return new WikiStarItem(eVar);
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: b */
    public boolean mo21069b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "ver");
        return TextUtils.equals(m50771c(str), "2");
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: c */
    public boolean mo21071c(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        return TextUtils.equals(m50772d(eVar), "2");
    }

    /* renamed from: d */
    private final String m50772d(C4943e eVar) {
        Bundle bundle;
        String str;
        Fragment b;
        FragmentHostAbility xVar = (FragmentHostAbility) eVar.mo19556c(FragmentHostAbility.class);
        if (xVar == null || (b = xVar.mo23794b()) == null) {
            bundle = null;
        } else {
            bundle = b.getArguments();
        }
        if (bundle == null || (str = bundle.getString("wiki_version")) == null) {
            str = "";
        }
        Intrinsics.checkExpressionValueIsNotNull(str, "args?.getString(DocProto…EXTRA_WIKI_VERSION) ?: \"\"");
        return m50771c(str);
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: a */
    public AbstractC68307f<WikiInfo> mo21063a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "wikiToken");
        return C12213f.m50862a(str);
    }

    /* renamed from: c */
    private final String m50771c(String str) {
        boolean d = mo21072d();
        boolean c = mo21070c();
        boolean b = mo21068b();
        C13479a.m54764b("WikiImpl", "getWikiVersion, enableWikiV1: " + b + ", " + "enableWikiV2: " + c + ", " + "enableWikiV3: " + d);
        if (d) {
            C13479a.m54764b("WikiImpl", "getWikiVersion, args Version: " + str);
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    Intrinsics.throwNpe();
                }
                return str;
            }
        }
        if (c) {
            return "2";
        }
        if (b) {
            return "1";
        }
        return "";
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: a */
    public BaseMoreItem mo21062a(C4943e eVar, String str) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        return new WikiMakeCopyItem(eVar, str);
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: a */
    public AbstractC68307f<String> mo21064a(String str, String str2) {
        Intrinsics.checkParameterIsNotNull(str, "spaceId");
        Intrinsics.checkParameterIsNotNull(str2, "wikiToken");
        AbstractC68307f<String> pull = C12455c.m51806q((NetService) KoinJavaComponent.m268613a(NetService.class, null, null, 6, null)).pull(new GetWikiVersionPuller.Params(str, str2));
        Intrinsics.checkExpressionValueIsNotNull(pull, "WikiApi.getWikiVersionPu…rams(spaceId, wikiToken))");
        return pull;
    }

    @Override // com.bytedance.ee.bear.contract.route.parcelable.IWiki
    /* renamed from: a */
    public String mo21065a(C4943e eVar, Bundle bundle) {
        Intrinsics.checkParameterIsNotNull(eVar, "pluginHost");
        Intrinsics.checkParameterIsNotNull(bundle, "bundle");
        return ((WikiViewModel) C4950k.m20479a(eVar, WikiViewModel.class, WikiViewModel.Companion.mo46753a(bundle))).getSpaceId();
    }
}
