package com.bytedance.ee.bear.basesdk.apiimpl;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.basesdk.C4487h;
import com.bytedance.ee.bear.basesdk.api.AbstractC4381f;
import com.bytedance.ee.bear.basesdk.apisupport.DocPageConfig;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.contract.route.parcelable.IWiki;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wikiv2.WikiFragment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.basesdk.apiimpl.g */
public class C4401g implements AbstractC4381f {

    /* renamed from: a */
    private static final String[] f13010a = {C8275a.f22371d.mo32553a(), C8275a.f22372e.mo32553a(), C8275a.f22374g.mo32553a(), C8275a.f22373f.mo32553a(), C8275a.f22378k.mo32553a()};

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4381f
    /* renamed from: a */
    public void mo17038a() {
        C4487h.m18502a("DocPageProvider");
    }

    /* renamed from: b */
    private static void m18152b(Context context) {
        C4487h.m18501a(context, "DocPageProvider");
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4381f
    /* renamed from: a */
    public ExtensionActivityImpl mo17037a(AppCompatActivity appCompatActivity) {
        return new ExtensionActivityImpl(appCompatActivity, BaseActivity.m30683a(appCompatActivity));
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4381f
    /* renamed from: a */
    public void mo17039a(Context context) {
        C13479a.m54764b("DocPageProvider", "preload");
        m18152b(context);
    }

    /* renamed from: a */
    private Bundle m18151a(DocPageConfig gVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("hideTitleBar", gVar.mo17119a());
        bundle.putBoolean("hideTitle", gVar.mo17120b());
        bundle.putBoolean("hideBackIcon", gVar.mo17121c());
        bundle.putBoolean("hideMessageIcon", gVar.mo17122d());
        bundle.putBoolean("hideShareIcon", gVar.mo17123e());
        bundle.putBoolean("hideMoreIcon", gVar.mo17124f());
        bundle.putBoolean("disableLandscape", gVar.mo17125g());
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("doc_page_config", bundle);
        return bundle2;
    }

    @Override // com.bytedance.ee.bear.basesdk.api.AbstractC4381f
    /* renamed from: a */
    public Fragment mo17036a(Context context, String str, DocPageConfig gVar) throws Exception {
        if (!TextUtils.isEmpty(str)) {
            C13479a.m54764b("DocPageProvider", "createDocFragment:" + C13598b.m55197d(str));
            m18152b(context);
            String a = new C13681h.C13682a(str).mo50647a("from", DocsOpenSource.chat_tab.name()).mo50648a();
            BearUrl g = C6313i.m25327a().mo25399g(a);
            if (Arrays.asList(f13010a).contains(g.f17446a)) {
                return C5869m.m23602a(a, m18151a(gVar));
            }
            if (C8275a.f22377j.mo32553a().equals(g.f17446a)) {
                Bundle a2 = m18151a(gVar);
                if (((IWiki) KoinJavaComponent.m268610a(IWiki.class)).mo21070c()) {
                    a2.putString("wiki_version", "2");
                    return WikiFragment.m50750a(a, a2);
                }
                a2.putString("wiki_version", "1");
                return C5869m.m23602a(a, a2);
            } else if (C8275a.f22375h.mo32553a().equals(g.f17446a)) {
                SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(g.f17447b, "");
                spaceFileOpenEntity.setUrl(g.f17450e);
                spaceFileOpenEntity.setOriginUrl(g.f17450e);
                return DriveMainFragment.m27490a(spaceFileOpenEntity, null, m18151a(gVar));
            } else {
                throw new IllegalArgumentException("unsupported document type!");
            }
        } else {
            throw new IllegalArgumentException("empty url!");
        }
    }
}
