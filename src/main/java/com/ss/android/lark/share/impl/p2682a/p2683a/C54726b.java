package com.ss.android.lark.share.impl.p2682a.p2683a;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import com.ss.android.lark.biz.core.api.CommonShareData;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;

/* renamed from: com.ss.android.lark.share.impl.a.a.b */
public class C54726b {

    /* renamed from: a */
    public final SparseArray<AbstractC54728b> f135152a;

    /* renamed from: b */
    public int f135153b;

    /* renamed from: c */
    public AbstractC54728b f135154c;

    /* renamed from: d */
    public CommonShareData f135155d;

    /* renamed from: com.ss.android.lark.share.impl.a.a.b$b */
    public interface AbstractC54728b {
        /* renamed from: a */
        void mo186865a(Context context, Bundle bundle, CommonShareData commonShareData);
    }

    /* renamed from: a */
    public static final String m212362a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "unknown" : "video" : "image" : "text" : "web";
    }

    /* renamed from: a */
    public CommonShareData mo186866a() {
        return this.f135155d;
    }

    public C54726b() {
        this(null);
    }

    public C54726b(AbstractC54728b bVar) {
        SparseArray<AbstractC54728b> sparseArray = new SparseArray<>();
        this.f135152a = sparseArray;
        this.f135154c = bVar;
        sparseArray.put(1, new C54732e());
        sparseArray.put(2, new C54729c());
        sparseArray.put(3, new C54725a());
        sparseArray.put(4, new C54730d());
    }

    /* renamed from: com.ss.android.lark.share.impl.a.a.b$a */
    public static class C54727a {
        /* renamed from: a */
        public static C54726b m212364a(Context context, Bundle bundle) {
            String str = null;
            if (bundle == null) {
                return null;
            }
            CommonShareData commonShareData = new CommonShareData();
            commonShareData.setSupportAdditionNote(true);
            commonShareData.setSdkShare(true);
            commonShareData.setShareFileScene(4);
            C54726b bVar = new C54726b();
            bVar.f135155d = commonShareData;
            String string = bundle.getString("android.intent.lark.EXTRA_SOURCE_NAME", "");
            String string2 = bundle.getString("android.intent.lark.EXTRA_MESSAGE_APP_PACKAGE_NAME", "");
            commonShareData.setSource(string);
            commonShareData.setPackageName(string2);
            bVar.f135153b = bundle.getInt("android.intent.lark.EXTRA_AP_OBJECT_SDK_VERSION");
            int i = bundle.getInt("android.intent.lark.EXTRA_COMMAMD_TYPE");
            commonShareData.setType(i);
            AbstractC54728b bVar2 = bVar.f135152a.get(i);
            if (bVar2 != null) {
                bVar2.mo186865a(context, bundle, commonShareData);
            }
            if (i == 1) {
                str = "link";
            } else if (i == 2) {
                str = "word";
            } else if (i == 3) {
                str = "picture";
            }
            ShareHitPoint.f121870e.mo169314a(string2, str);
            return bVar;
        }
    }
}
