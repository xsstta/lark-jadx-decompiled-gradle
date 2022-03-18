package com.bytedance.ee.bear.basesdk.business.follow;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.account.C4193g;
import com.bytedance.ee.bear.appsetting.C4211a;
import com.bytedance.ee.bear.basesdk.C4487h;
import com.bytedance.ee.bear.contract.doc.DocsOpenSource;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.doc.follow.AbstractC5415a;
import com.bytedance.ee.bear.doc.follow.impl.C5438c;
import com.bytedance.ee.bear.document.C5869m;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6729c;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.bear.facade.common.BaseActivity;
import com.bytedance.ee.bear.facade.common.ExtensionActivityImpl;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.wikiv2.WikiFragment;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.io.C13681h;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.bytedance.ee.bear.basesdk.business.follow.a */
public class C4462a {
    /* renamed from: a */
    public static void m18439a() {
        C4487h.m18502a("CCMFollow_Sdk");
    }

    /* renamed from: b */
    private static void m18441b(Context context) {
        C4487h.m18501a(context, "CCMFollow_Sdk");
    }

    /* renamed from: a */
    public static ExtensionActivityImpl m18437a(AppCompatActivity appCompatActivity) {
        return new ExtensionActivityImpl(appCompatActivity, BaseActivity.m30683a(appCompatActivity));
    }

    /* renamed from: a */
    private static String m18438a(String str) {
        String queryParameter;
        if (!TextUtils.isEmpty(str) && (queryParameter = Uri.parse(str).getQueryParameter("vc_meeting_id")) != null) {
            return new C4193g().mo16429a(queryParameter);
        }
        return "";
    }

    /* renamed from: a */
    public static void m18440a(Context context) {
        C13479a.m54764b("CCMFollow_Sdk", "preload");
        m18441b(context);
    }

    /* renamed from: a */
    private static Fragment m18436a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("vc_refresh", z);
        bundle.putString("vc_meeting_id", m18438a(str));
        bundle.putString("wiki_version", "2");
        return WikiFragment.m50750a(str, bundle);
    }

    /* renamed from: a */
    private static Fragment m18435a(BearUrl bearUrl, String str, boolean z) {
        SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(bearUrl.f17447b, "");
        spaceFileOpenEntity.setUrl(bearUrl.f17450e);
        spaceFileOpenEntity.setOriginUrl(bearUrl.f17450e);
        C6729c cVar = new C6729c(true, null);
        cVar.mo26478a(str);
        cVar.mo26479a(z);
        return DriveMainFragment.m27489a(spaceFileOpenEntity, cVar);
    }

    /* renamed from: a */
    private static Fragment m18433a(Context context, String str, boolean z) throws UnsupportedFollowTypeException {
        if (!TextUtils.isEmpty(str)) {
            String a = new C13681h.C13682a(str).mo50647a("from", DocsOpenSource.vc.name()).mo50647a("coverEnabled", "false").mo50648a();
            BearUrl g = C6313i.m25327a().mo25399g(a);
            ArrayList arrayList = new ArrayList(Arrays.asList(C8275a.f22371d.mo32553a(), C8275a.f22372e.mo32553a(), C8275a.f22374g.mo32553a(), C8275a.f22373f.mo32553a()));
            if (C4211a.m17514a().mo16538b("spacekit.mobile.docx_enable", false)) {
                arrayList.add(C8275a.f22378k.mo32553a());
            }
            if (C8275a.f22377j.mo32553a().equals(g.f17446a)) {
                return m18436a(a, z);
            }
            if (arrayList.contains(g.f17446a)) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("vc_refresh", z);
                return C5869m.m23602a(a, bundle);
            } else if (C8275a.f22375h.mo32553a().equals(g.f17446a)) {
                return m18435a(g, m18438a(a), z);
            } else {
                throw new UnsupportedFollowTypeException("unsupported type is " + g.f17446a);
            }
        } else {
            throw new UnsupportedFollowTypeException("Empty url !");
        }
    }

    /* renamed from: a */
    public static Fragment m18434a(Context context, String str, boolean z, AbstractC5415a aVar) throws UnsupportedFollowTypeException {
        C13479a.m54764b("CCMFollow_Sdk", "createFollowableFragment:" + C13598b.m55197d(str));
        m18441b(context);
        Fragment a = m18433a(context, str, z);
        C5438c.m22046a(a, aVar);
        return a;
    }
}
