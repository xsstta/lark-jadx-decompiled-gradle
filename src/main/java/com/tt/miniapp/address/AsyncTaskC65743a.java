package com.tt.miniapp.address;

import android.content.Context;
import android.os.AsyncTask;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.bytedance.ee.lark.infra.foundation.utils.C12791h;
import com.bytedance.ee.lark.infra.foundation.utils.IOUtils;
import com.larksuite.suite.R;
import com.tt.miniapphost.data.ContextSingletonInstance;
import com.tt.miniapphost.util.AppbrandUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tt.miniapp.address.a */
public class AsyncTaskC65743a extends AsyncTask<String, Void, List<AddressInfo>> {

    /* renamed from: a */
    private String f165644a;

    /* renamed from: b */
    private WeakReference<Context> f165645b;

    /* renamed from: c */
    private String f165646c = "province";

    /* renamed from: d */
    private int f165647d = 2;

    /* renamed from: e */
    private AbstractC65745b f165648e;

    /* renamed from: com.tt.miniapp.address.a$a */
    public static class C65744a {

        /* renamed from: a */
        public Map<String, List<AddressInfo>> f165649a = new ConcurrentHashMap();

        /* renamed from: b */
        public Map<String, Integer> f165650b = new ConcurrentHashMap();

        /* renamed from: c */
        public AtomicBoolean f165651c = new AtomicBoolean(false);
    }

    /* renamed from: com.tt.miniapp.address.a$b */
    public interface AbstractC65745b {
        /* renamed from: a */
        void mo230374a(String str, List<AddressInfo> list, int i);
    }

    /* renamed from: a */
    public int mo230367a() {
        return this.f165647d;
    }

    /* renamed from: b */
    private C65744a m257738b() {
        return ContextSingletonInstance.getInstance().getAddressDataInstance();
    }

    /* renamed from: a */
    private List<AddressInfo> m257736a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("region");
            String string2 = jSONObject.getString("code");
            m257739b(jSONObject);
            arrayList.add(new AddressInfo(string, string2, "province"));
        }
        C65744a b = m257738b();
        b.f165649a.put("province", arrayList);
        b.f165650b.put("province", 0);
        return arrayList;
    }

    /* renamed from: a */
    public List<AddressInfo> mo230368a(String str) {
        AppBrandLogger.m52829e("LoadAddressTask", "queryKey ", str);
        C65744a b = m257738b();
        if (!b.f165649a.containsKey(str)) {
            return null;
        }
        this.f165647d = b.f165650b.get(str).intValue();
        return b.f165649a.get(str);
    }

    /* renamed from: a */
    public static InputStream m257735a(Context context) throws Exception {
        File file = new File(new File(AppbrandUtil.getOfflineZipDir(context), "address"), "address.json");
        if (file.exists() && file.length() > 1) {
            return new FileInputStream(file);
        }
        StringBuffer stringBuffer = new StringBuffer(C12791h.m52865c(context).getPath());
        stringBuffer.append("/");
        String stringBuffer2 = stringBuffer.toString();
        AppBrandLogger.m52828d("LoadAddressTask", "load address by zip");
        File file2 = new File(stringBuffer2 + "address.zip");
        IOUtils.copyAssets(context, "address.zip", file2.getAbsolutePath());
        IOUtils.unZipFolder(file2.getAbsolutePath(), file2.getParent());
        return new FileInputStream(stringBuffer2 + "address.json");
    }

    /* renamed from: b */
    private void m257739b(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            JSONArray jSONArray = jSONObject.getJSONArray("regionEntitys");
            for (int i = 0; i < jSONArray.length(); i++) {
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    arrayList.add(new AddressInfo(jSONArray.getJSONObject(i2).getString("region"), jSONArray.getJSONObject(i2).getString("code"), "city"));
                }
                String str = jSONObject.getString("region") + jSONObject.getString("code") + "province";
                AppBrandLogger.m52828d("LoadAddressTask", "city name ", str);
                C65744a b = m257738b();
                b.f165649a.put(str, arrayList);
                b.f165650b.put(str, 1);
                m257737a(jSONArray.getJSONObject(i));
            }
        }
    }

    /* renamed from: a */
    private void m257737a(JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("regionEntitys");
            String str = jSONObject.getString("region") + jSONObject.getString("code") + "city";
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(new AddressInfo(jSONArray.getJSONObject(i).getString("region"), jSONArray.getJSONObject(i).getString("code"), "district"));
            }
            C65744a b = m257738b();
            if (arrayList.size() < 1) {
                arrayList.add(new AddressInfo(this.f165644a, "", "district"));
                b.f165649a.put(str, arrayList);
                b.f165650b.put(str, 2);
                return;
            }
            b.f165649a.put(str, arrayList);
            b.f165650b.put(str, 2);
        }
    }

    /* renamed from: b */
    public List<AddressInfo> mo230371b(String str) throws JSONException {
        JSONArray jSONArray;
        List<AddressInfo> a = mo230368a(str);
        C65744a b = m257738b();
        if (a != null) {
            return a;
        }
        JSONArray jSONArray2 = null;
        try {
            InputStream a2 = m257735a(this.f165645b.get());
            if (a2 == null) {
                AppBrandLogger.m52829e("LoadAddressTask", "address.zip does not exist!");
                try {
                    b.f165651c.set(true);
                    AppBrandLogger.m52828d("LoadAddressTask", "load asset file finished:", Integer.valueOf(jSONArray2.length()));
                } catch (Exception e) {
                    AppBrandLogger.stacktrace(6, "LoadAddressTask", e.getStackTrace());
                }
                return null;
            }
            byte[] bArr = new byte[a2.available()];
            a2.read(bArr);
            a2.close();
            jSONArray = new JSONArray(new String(bArr, "UTF-8"));
            try {
                b.f165651c.set(true);
                AppBrandLogger.m52828d("LoadAddressTask", "load asset file finished:", Integer.valueOf(jSONArray.length()));
            } catch (Exception e2) {
                AppBrandLogger.stacktrace(6, "LoadAddressTask", e2.getStackTrace());
            }
            if (jSONArray == null || jSONArray.length() <= 0) {
                AppBrandLogger.m52829e("LoadAddressTask", "empty list found!");
                return null;
            }
            if (b.f165649a.size() <= 1) {
                AppBrandLogger.m52829e("LoadAddressTask", "Json parse exception ", str);
                m257736a(jSONArray);
            }
            this.f165647d = b.f165650b.get(str).intValue();
            return b.f165649a.get(str);
        } catch (Exception e3) {
            AppBrandLogger.m52829e("LoadAddressTask", "load error:", e3);
            try {
                b.f165651c.set(true);
                AppBrandLogger.m52828d("LoadAddressTask", "load asset file finished:", Integer.valueOf(jSONArray2.length()));
            } catch (Exception e4) {
                AppBrandLogger.stacktrace(6, "LoadAddressTask", e4.getStackTrace());
            }
            jSONArray = null;
        } catch (Throwable th) {
            try {
                b.f165651c.set(true);
                AppBrandLogger.m52828d("LoadAddressTask", "load asset file finished:", Integer.valueOf(jSONArray2.length()));
            } catch (Exception e5) {
                AppBrandLogger.stacktrace(6, "LoadAddressTask", e5.getStackTrace());
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public List<AddressInfo> doInBackground(String... strArr) {
        AppBrandLogger.m52828d("LoadAddressTask", "start load :", strArr[0]);
        try {
            return mo230371b(strArr[0]);
        } catch (JSONException e) {
            AppBrandLogger.m52829e("LoadAddressTask", e);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<AddressInfo> list) {
        if (list != null) {
            AppBrandLogger.m52828d("LoadAddressTask", "load finished:", Integer.valueOf(list.size()), ",depth:", Integer.valueOf(this.f165647d));
            AbstractC65745b bVar = this.f165648e;
            if (bVar != null) {
                bVar.mo230374a(this.f165646c, list, this.f165647d);
            }
        }
    }

    public AsyncTaskC65743a(Context context, AbstractC65745b bVar) {
        this.f165648e = bVar;
        this.f165645b = new WeakReference<>(context);
        this.f165644a = context.getString(R.string.microapp_m_city_area);
    }
}
