package com.ss.android.bytedcert.manager;

import android.graphics.Bitmap;
import android.media.ExifInterface;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.ss.android.bytedcert.callback.SDKCallBack;
import com.ss.android.bytedcert.net.BDResponse;
import com.ss.android.bytedcert.net.C28428b;
import com.ss.android.bytedcert.p1304b.C28317a;
import com.ss.android.bytedcert.p1304b.C28319b;
import com.ss.android.bytedcert.p1304b.C28320c;
import com.ss.android.bytedcert.p1314g.C28381c;
import com.ss.android.bytedcert.p1315h.RunnableC28384a;
import com.ss.android.bytedcert.utils.C28432b;
import com.ss.android.bytedcert.utils.C28433c;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.bytedcert.manager.b */
public class C28399b {

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.bytedcert.manager.b$a */
    public static class C28417a {

        /* renamed from: a */
        public static C28399b f71468a = new C28399b();
    }

    private C28399b() {
    }

    /* renamed from: a */
    public static C28399b m104133a() {
        return C28417a.f71468a;
    }

    /* renamed from: a */
    public byte[] mo101183a(ExifInterface exifInterface, byte[] bArr) {
        if (exifInterface == null) {
            return bArr;
        }
        try {
            String a = C28433c.m104213a(bArr, "img_tmp_" + System.nanoTime() + ".jpg");
            if (!TextUtils.isEmpty(a)) {
                C28433c.m104214a(exifInterface, a);
                byte[] b = C28433c.m104219b(a);
                if (b != null) {
                    bArr = b;
                }
                C28433c.m104215a(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bArr;
    }

    /* renamed from: a */
    public void mo101176a(final SDKCallBack.AbstractC28328a aVar, final int i, final Map<String, String> map) {
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.manager.C28399b.C284084 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                try {
                    Map map = map;
                    if (map == null) {
                        map = new HashMap();
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i = i;
                    if (i == 0) {
                        i = 85;
                    }
                    HashMap hashMap = new HashMap();
                    C28381c cVar = C28319b.f71163a.get("front");
                    if (!(cVar == null || cVar.mo101085a() == null)) {
                        cVar.mo101085a().compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                        hashMap.put("front_image", new Pair("front_image.jpg", C28399b.this.mo101183a(cVar.mo101086b(), byteArrayOutputStream.toByteArray())));
                    }
                    C28381c cVar2 = C28319b.f71163a.get("back");
                    if (!(cVar2 == null || cVar2.mo101085a() == null)) {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        cVar2.mo101085a().compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream2);
                        hashMap.put("back_image", new Pair("back_image.jpg", C28399b.this.mo101183a(cVar2.mo101086b(), byteArrayOutputStream2.toByteArray())));
                    }
                    final BDResponse a = C28428b.m104181a(C28320c.m103916e(), map, hashMap);
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284084.RunnableC284091 */

                        public void run() {
                            aVar.mo100863a(a);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    int b = C28317a.m103908b(e);
                    C28432b.m104210a(e, b);
                    final Pair pair = new Pair(Integer.valueOf(b), Log.getStackTraceString(e));
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284084.RunnableC284102 */

                        public void run() {
                            aVar.mo100863a(new BDResponse(pair));
                        }
                    });
                }
            }
        }.mo101095a();
    }

    /* renamed from: a */
    public void mo101182a(final SDKCallBack.AbstractC28328a aVar, final String str, final Map<String, String> map) {
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.manager.C28399b.C284115 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                try {
                    Map map = map;
                    if (map == null) {
                        map = new HashMap();
                    }
                    String a = BytedCertManager.getInstance().getLiveInfo().mo101087a(C28418c.m104143c().f71469a);
                    HashMap hashMap = new HashMap();
                    hashMap.put("sdk_data", new Pair("sdk_data", a.getBytes()));
                    final BDResponse a2 = C28428b.m104181a(str, map, hashMap);
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284115.RunnableC284121 */

                        public void run() {
                            aVar.mo100863a(a2);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    int b = C28317a.m103908b(e);
                    C28432b.m104210a(e, b);
                    final Pair pair = new Pair(Integer.valueOf(b), Log.getStackTraceString(e));
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284115.RunnableC284132 */

                        public void run() {
                            aVar.mo100863a(new BDResponse(pair));
                        }
                    });
                }
            }
        }.mo101095a();
    }

    /* renamed from: a */
    public void mo101177a(final SDKCallBack.AbstractC28328a aVar, final String str, final int i, final Map<String, String> map) {
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.manager.C28399b.C284022 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                try {
                    Map map = map;
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        map.put("image_type", str);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i = i;
                    if (i == 0) {
                        i = 85;
                    }
                    ExifInterface exifInterface = null;
                    C28381c cVar = C28319b.f71163a.get(str);
                    if (!(cVar == null || cVar.mo101085a() == null)) {
                        cVar.mo101085a().compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                        exifInterface = cVar.mo101086b();
                    }
                    byte[] a = C28399b.this.mo101183a(exifInterface, byteArrayOutputStream.toByteArray());
                    HashMap hashMap = new HashMap();
                    hashMap.put("image", new Pair("image.jpg", a));
                    final BDResponse a2 = C28428b.m104181a(C28320c.m103915d(), map, hashMap);
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284022.RunnableC284031 */

                        public void run() {
                            aVar.mo100863a(a2);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    int b = C28317a.m103908b(e);
                    C28432b.m104210a(e, b);
                    final Pair pair = new Pair(Integer.valueOf(b), Log.getStackTraceString(e));
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284022.RunnableC284042 */

                        public void run() {
                            aVar.mo100863a(new BDResponse(pair));
                        }
                    });
                }
            }
        }.mo101095a();
    }

    /* renamed from: a */
    public void mo101180a(final SDKCallBack.AbstractC28328a aVar, final String str, final String str2, final Map<String, String> map) {
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.manager.C28399b.C284001 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                final BDResponse bDResponse;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("test_ticket", BytedCertManager.getInstance().getCertInfo().f71352b);
                    jSONObject.put("test_aid", BytedCertManager.getInstance().getCertInfo().f71356f);
                    jSONObject.put("test_scene", BytedCertManager.getInstance().getCertInfo().f71351a);
                    C28432b.m104209a("test_doRequestt", jSONObject);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if ("POST".equalsIgnoreCase(str)) {
                    bDResponse = C28428b.m104183a(true, str2, (Map<String, String>) null, (Map<String, String>) map, (Map<String, Object>) null);
                } else {
                    bDResponse = C28428b.m104192c(true, str2, null, map, null);
                }
                BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                    /* class com.ss.android.bytedcert.manager.C28399b.C284001.RunnableC284011 */

                    public void run() {
                        aVar.mo100863a(bDResponse);
                    }
                });
            }
        }.mo101095a();
    }

    /* renamed from: a */
    public void mo101181a(SDKCallBack.AbstractC28328a aVar, String str, String str2, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        }
        mo101180a(aVar, str, str2, hashMap);
    }

    /* renamed from: a */
    public void mo101178a(final SDKCallBack.AbstractC28328a aVar, final String str, final String str2, final int i, final Map<String, String> map) {
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.manager.C28399b.C284053 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                try {
                    Map map = map;
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        map.put("image_type", str);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    int i = i;
                    if (i == 0) {
                        i = 85;
                    }
                    ExifInterface exifInterface = null;
                    C28381c cVar = C28319b.f71163a.get(str);
                    if (!(cVar == null || cVar.mo101085a() == null)) {
                        cVar.mo101085a().compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                        exifInterface = cVar.mo101086b();
                    }
                    byte[] a = C28399b.this.mo101183a(exifInterface, byteArrayOutputStream.toByteArray());
                    HashMap hashMap = new HashMap();
                    hashMap.put("image", new Pair("image.jpg", a));
                    final BDResponse b = C28428b.m104187b(str2, map, hashMap);
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284053.RunnableC284061 */

                        public void run() {
                            aVar.mo100863a(b);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    int b2 = C28317a.m103908b(e);
                    C28432b.m104210a(e, b2);
                    final Pair pair = new Pair(Integer.valueOf(b2), Log.getStackTraceString(e));
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284053.RunnableC284072 */

                        public void run() {
                            aVar.mo100863a(new BDResponse(pair));
                        }
                    });
                }
            }
        }.mo101095a();
    }

    /* renamed from: a */
    public void mo101179a(final SDKCallBack.AbstractC28328a aVar, final String str, final String str2, final String str3, final int i, final Map<String, String> map) {
        new RunnableC28384a() {
            /* class com.ss.android.bytedcert.manager.C28399b.C284146 */

            @Override // com.ss.android.bytedcert.p1315h.RunnableC28384a
            public void run() {
                byte[] bArr;
                try {
                    Map map = map;
                    if (map == null) {
                        map = new HashMap();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        map.put("identity_code", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        map.put("identity_name", str2);
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        map.put("identity_type", str3);
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    int i = i;
                    if (i == 0) {
                        i = 85;
                    }
                    C28381c cVar = C28319b.f71163a.get("front");
                    byte[] bArr2 = null;
                    if (cVar == null || cVar.mo101085a() == null) {
                        bArr = null;
                    } else {
                        C28319b.f71163a.get("front").mo101085a().compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
                        bArr = C28399b.this.mo101183a(cVar.mo101086b(), byteArrayOutputStream.toByteArray());
                    }
                    C28381c cVar2 = C28319b.f71163a.get("hold");
                    if (!(cVar2 == null || cVar2.mo101085a() == null)) {
                        cVar2.mo101085a().compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream2);
                        bArr2 = C28399b.this.mo101183a(cVar2.mo101086b(), byteArrayOutputStream2.toByteArray());
                    }
                    HashMap hashMap = new HashMap();
                    Pair pair = new Pair("front_image", bArr);
                    Pair pair2 = new Pair("real_person_image", bArr2);
                    hashMap.put("front_image", pair);
                    hashMap.put("real_person_image", pair2);
                    final BDResponse a = C28428b.m104181a(C28320c.m103920i(), map, hashMap);
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284146.RunnableC284151 */

                        public void run() {
                            aVar.mo100863a(a);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    int b = C28317a.m103908b(e);
                    C28432b.m104210a(e, b);
                    final Pair pair3 = new Pair(Integer.valueOf(b), Log.getStackTraceString(e));
                    BytedCertManager.getInstance().executeInMainThread(new Runnable() {
                        /* class com.ss.android.bytedcert.manager.C28399b.C284146.RunnableC284162 */

                        public void run() {
                            aVar.mo100863a(new BDResponse(pair3));
                        }
                    });
                }
            }
        }.mo101095a();
    }
}
