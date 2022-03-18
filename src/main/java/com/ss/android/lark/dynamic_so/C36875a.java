package com.ss.android.lark.dynamic_so;

import android.content.Context;
import com.C1711a;
import com.ss.android.lark.dynamic_so.ipc_server.AbstractC36881b;
import com.ss.android.lark.dynamic_so.p1817a.AbstractC36878a;
import com.ss.android.lark.log.Log;
import com.ss.ttm.player.ILibraryLoader;
import com.ss.ttm.player.TTPlayerLibLoader;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.LibraryLoaderProxy;
import ee.android.framework.manis.C68183b;
import java.util.List;

/* renamed from: com.ss.android.lark.dynamic_so.a */
public class C36875a {

    /* renamed from: a */
    public static AbstractC36878a f94804a;

    /* renamed from: a */
    public static AbstractC36878a m145538a() {
        return f94804a;
    }

    /* renamed from: b */
    public static void m145539b() {
        DataLoaderHelper.getDataLoader().setLoadProxy(new LibraryLoaderProxy() {
            /* class com.ss.android.lark.dynamic_so.C36875a.C368761 */

            @Override // com.ss.ttvideoengine.LibraryLoaderProxy
            public boolean loadLibrary(String str) {
                if ("avmdl".equals(str)) {
                    boolean a = C36875a.f94804a.mo133156a("com.ss.android.lark.dynamic.so", "avmdlbase");
                    Log.m165389i("DynamicSoModule", "DataLoaderHelper load lib  name= avmdlbase, isLoadBase =" + a);
                }
                boolean a2 = C36875a.f94804a.mo133156a("com.ss.android.lark.dynamic.so", str);
                Log.m165389i("DynamicSoModule", "DataLoaderHelper load lib  name= " + str + ",isLoad =" + a2);
                if (!a2) {
                    Log.m165383e("DynamicSoModule", "DataLoaderHelper load lib failed name= " + str);
                }
                return a2;
            }
        });
        TTPlayerLibLoader.setLibraryLoader(new ILibraryLoader() {
            /* class com.ss.android.lark.dynamic_so.C36875a.C368772 */

            @Override // com.ss.ttm.player.ILibraryLoader
            public boolean onLoadNativeLibs(List<String> list) {
                boolean z;
                boolean z2 = true;
                for (String str : list) {
                    if ("ttmplayer".equals(str)) {
                        z = C36875a.f94804a.mo133156a("com.ss.android.lark.dynamic.so", str);
                    } else {
                        try {
                            C1711a.m7628a(str);
                            z = true;
                        } catch (Throwable th) {
                            Log.m165383e("DynamicSoModule", "TTPlayerLibLoader load lib failed name= " + str + " , error =" + th.getMessage());
                            z = false;
                        }
                    }
                    Log.m165389i("DynamicSoModule", "load lib name = " + str + "，isLoad = " + z);
                    z2 &= z;
                }
                Log.m165389i("DynamicSoModule", "lib isAllLoad = " + z2);
                return z2;
            }
        });
    }

    public C36875a(AbstractC36878a aVar) {
        f94804a = aVar;
    }

    /* renamed from: a */
    public AbstractC36881b mo136151a(Context context) {
        return (AbstractC36881b) C68183b.m264839a().mo237086a(context, AbstractC36881b.class);
    }
}
