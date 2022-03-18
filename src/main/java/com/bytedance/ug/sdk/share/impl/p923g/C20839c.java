package com.bytedance.ug.sdk.share.impl.p923g;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20800d;
import com.bytedance.ug.sdk.share.api.p915b.AbstractC20805i;
import com.bytedance.ug.sdk.share.api.panel.ShareChannelType;
import com.bytedance.ug.sdk.share.impl.p920d.C20829a;
import com.bytedance.ug.sdk.share.impl.p924h.p925a.AbstractC20847a;
import com.bytedance.ug.sdk.share.impl.p928j.C20854e;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ug.sdk.share.impl.g.c */
public class C20839c {

    /* renamed from: a */
    private static final ConcurrentHashMap<String, AbstractC20847a> f51006a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static boolean f51007b = true;

    /* renamed from: c */
    private static boolean f51008c = true;

    /* renamed from: d */
    private static AbstractC20800d f51009d;

    /* renamed from: e */
    private static boolean f51010e = true;

    /* renamed from: f */
    private static AbstractC20805i f51011f;

    /* renamed from: a */
    public static AbstractC20800d m75889a() {
        if (!f51008c) {
            return null;
        }
        AbstractC20800d dVar = f51009d;
        if (dVar != null) {
            return dVar;
        }
        try {
            f51009d = (AbstractC20800d) Class.forName("com.bytedance.ug.sdk.share.keep.impl.ImageTokenConfigImpl").newInstance();
        } catch (Throwable unused) {
            f51008c = false;
        }
        return f51009d;
    }

    /* renamed from: b */
    public static AbstractC20805i m75891b() {
        if (!f51010e) {
            return null;
        }
        AbstractC20805i iVar = f51011f;
        if (iVar != null) {
            return iVar;
        }
        try {
            f51011f = (AbstractC20805i) Class.forName("com.bytedance.ug.sdk.share.keep.impl.UIConfigImpl").newInstance();
        } catch (Throwable unused) {
            f51010e = false;
        }
        return f51011f;
    }

    /* renamed from: a */
    public static AbstractC20847a m75890a(ShareChannelType shareChannelType) {
        String str = C20829a.f50997a.get(shareChannelType);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        AbstractC20847a aVar = f51006a.get(str);
        if (aVar != null) {
            return aVar;
        }
        try {
            aVar = (AbstractC20847a) Class.forName(str).getConstructor(Context.class).newInstance(C20840d.m75892a().mo70319b());
        } catch (Throwable th) {
            C20854e.m75914b(th.toString());
        }
        if (aVar != null) {
            f51006a.put(str, aVar);
        }
        return aVar;
    }
}
