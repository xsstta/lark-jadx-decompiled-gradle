package com.bytedance.ee.larkbrand.nativeMoudule.photo;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.p661b.C13220b;
import com.bytedance.ee.larkbrand.nativeMoudule.rich.util.C13264d;
import com.bytedance.ee.larkbrand.network.glide.GlideRequest;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapphost.view.BaseActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PhotoPreviewActivity extends BaseActivity {

    /* renamed from: f */
    private static AbstractC13169b f34918f;

    /* renamed from: a */
    public C13220b f34919a;

    /* renamed from: b */
    private FlexibleViewPager f34920b;

    /* renamed from: c */
    private RelativeLayout f34921c;

    /* renamed from: d */
    private int f34922d;

    /* renamed from: e */
    private String f34923e;

    /* renamed from: g */
    private int f34924g;

    /* renamed from: h */
    private int f34925h;

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity$b */
    public interface AbstractC13169b {
        /* renamed from: a */
        void mo48929a(int i, String str);
    }

    /* renamed from: a */
    public Context mo49249a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo49253a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m53809a(this, context);
    }

    /* renamed from: c */
    public Resources mo49256c() {
        return super.getResources();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m53804a(this, configuration);
    }

    /* renamed from: d */
    public void mo49258d() {
        super.onStop();
    }

    /* renamed from: e */
    public AssetManager mo49259e() {
        return super.getAssets();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m53811c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m53807a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m53810b(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49254a(List list, List list2, List list3) {
        final int i;
        HashMap<String, String> a = m53808a(getIntent().getStringExtra("header"));
        ArrayList<GlideRequest> arrayList = new ArrayList<>();
        ArrayList<GlideRequest> arrayList2 = new ArrayList<>();
        ArrayList<GlideRequest> arrayList3 = new ArrayList<>();
        if (list != null && list.size() > 0) {
            if (list.get(0) instanceof String) {
                arrayList = mo49250a(list, a);
            } else if (list.get(0) instanceof GlideRequest) {
                arrayList = (ArrayList) list;
            }
        }
        this.f34924g = arrayList.size();
        if (list2 != null && list2.size() > 0) {
            if (list2.get(0) instanceof String) {
                arrayList2 = mo49250a(list2, a);
            } else if (list2.get(0) instanceof GlideRequest) {
                arrayList2 = (ArrayList) list2;
            }
        }
        if (list3 != null && list3.size() > 0) {
            if (list3.get(0) instanceof String) {
                arrayList3 = mo49250a(list3, a);
            } else if (list3.get(0) instanceof GlideRequest) {
                arrayList3 = (ArrayList) list3;
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList2.size() != arrayList.size()) {
            int i2 = 0;
            while (i2 < arrayList.size()) {
                arrayList4.add(NewPreviewFragment.f34969n.mo49298a(arrayList.get(i2), null, i2 < arrayList3.size() ? arrayList3.get(i2) : null));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                arrayList4.add(NewPreviewFragment.f34969n.mo49298a(arrayList.get(i3), arrayList2.get(i3), i3 < arrayList3.size() ? arrayList3.get(i3) : null));
                i3++;
            }
        }
        this.f34920b.setAdapter(new C13168a(getSupportFragmentManager(), arrayList4));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C13264d.m54034a(this, 20.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.f34921c.addView(this.f34919a, layoutParams);
        if (list == null || list.size() <= 1) {
            this.f34919a.setVisibility(8);
        } else {
            this.f34919a.mo49356a(list.size());
            this.f34919a.setClickable(true);
        }
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        this.f34920b.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity.C131671 */

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i > 1) {
                    PhotoPreviewActivity.this.f34919a.mo49357b(i);
                }
            }
        });
        this.f34920b.setCurrentItem(getIntent().getIntExtra("position", 0));
    }

    /* renamed from: a */
    public void mo49252a(int i, String str) {
        this.f34922d = i;
        this.f34923e = str;
    }

    /* renamed from: com.bytedance.ee.larkbrand.nativeMoudule.photo.PhotoPreviewActivity$a */
    public static class C13168a extends AbstractC1045n {

        /* renamed from: a */
        private List<Fragment> f34928a;

        @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
        public Parcelable saveState() {
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f34928a.size();
        }

        @Override // androidx.fragment.app.AbstractC1045n
        /* renamed from: a */
        public Fragment mo5615a(int i) {
            return this.f34928a.get(i);
        }

        C13168a(FragmentManager fragmentManager, List<Fragment> list) {
            super(fragmentManager);
            this.f34928a = list;
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void finish() {
        mo49255b();
        super.finish();
    }

    /* renamed from: b */
    public void mo49255b() {
        AbstractC13169b bVar = f34918f;
        if (bVar != null) {
            bVar.mo48929a(this.f34922d, this.f34923e);
            f34918f = null;
        }
    }

    /* renamed from: a */
    public void mo49251a() {
        int i = this.f34925h + 1;
        this.f34925h = i;
        if (i == this.f34924g) {
            mo49255b();
        }
    }

    /* renamed from: a */
    public static Resources m53807a(PhotoPreviewActivity photoPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPreviewActivity);
        }
        return photoPreviewActivity.mo49256c();
    }

    /* renamed from: c */
    public static AssetManager m53811c(PhotoPreviewActivity photoPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPreviewActivity);
        }
        return photoPreviewActivity.mo49259e();
    }

    /* renamed from: b */
    public static void m53810b(PhotoPreviewActivity photoPreviewActivity) {
        photoPreviewActivity.mo49258d();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PhotoPreviewActivity photoPreviewActivity2 = photoPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    photoPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.lark_brand_activity_preview);
        this.f34920b = (FlexibleViewPager) findViewById(R.id.viewpager);
        this.f34921c = (RelativeLayout) findViewById(R.id.photo_pre);
        this.f34919a = new C13220b(this);
        try {
            mo49254a((List) getIntent().getSerializableExtra("list"), (List) getIntent().getSerializableExtra("origin_images"), (List) getIntent().getSerializableExtra("placeholders"));
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m53808a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap<String, String> hashMap = new HashMap<>();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            return hashMap;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m53809a(PhotoPreviewActivity photoPreviewActivity, Context context) {
        photoPreviewActivity.mo49253a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(photoPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m53804a(PhotoPreviewActivity photoPreviewActivity, Configuration configuration) {
        Context a = photoPreviewActivity.mo49249a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<GlideRequest> mo49250a(List<String> list, HashMap<String, String> hashMap) {
        ArrayList<GlideRequest> arrayList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new GlideRequest(list.get(i), hashMap));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Intent m53805a(Context context, List<GlideRequest> list, List<GlideRequest> list2, List<GlideRequest> list3, int i, AbstractC13169b bVar) {
        Intent intent = new Intent(context, PhotoPreviewActivity.class);
        intent.putExtra("position", i);
        intent.putExtra("list", (Serializable) list);
        intent.putExtra("origin_images", (Serializable) list2);
        intent.putExtra("placeholders", (Serializable) list3);
        f34918f = bVar;
        return intent;
    }

    /* renamed from: a */
    public static Intent m53806a(Context context, List<String> list, List<String> list2, List<String> list3, int i, String str) {
        Intent intent = new Intent(context, PhotoPreviewActivity.class);
        intent.putExtra("position", i);
        intent.putExtra("list", (Serializable) list);
        intent.putExtra("origin_images", (Serializable) list2);
        intent.putExtra("placeholders", (Serializable) list3);
        intent.putExtra("header", str);
        return intent;
    }
}
