package com.bytedance.ee.larkbrand.nativeMoudule.photo;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListPopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.chooser.PreviewActivity;
import com.tt.miniapp.chooser.p3267a.C65818a;
import com.tt.miniapp.chooser.p3267a.C65829c;
import com.tt.miniapp.chooser.p3268b.AbstractC65832a;
import com.tt.miniapp.chooser.p3268b.C65833b;
import com.tt.miniapp.chooser.p3268b.C65837d;
import com.tt.miniapp.chooser.p3268b.C65838e;
import com.tt.miniapp.entity.Folder;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapphost.AppbrandContext;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.host.HostDependManager;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.util.C67590h;
import com.tt.miniapphost.view.BaseActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public class PickerActivity extends BaseActivity implements View.OnClickListener, AbstractC65832a, AbstractC67477a {

    /* renamed from: a */
    Intent f34929a;

    /* renamed from: b */
    RecyclerView f34930b;

    /* renamed from: c */
    Button f34931c;

    /* renamed from: d */
    Button f34932d;

    /* renamed from: e */
    Button f34933e;

    /* renamed from: f */
    C13175a f34934f;

    /* renamed from: g */
    ListPopupWindow f34935g;

    /* renamed from: h */
    public C65818a f34936h;

    /* renamed from: i */
    public int f34937i;

    /* renamed from: a */
    public Context mo49260a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo49262a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m53826a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m53824a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo49272g() {
        return super.getResources();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m53828c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m53825a(this);
    }

    /* renamed from: h */
    public void mo49273h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo49274i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m53827b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        mo49271f();
    }

    @Override // com.tt.miniapphost.view.BaseActivity, com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        mo49261a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo49269d() {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(this, hashSet, new AbstractC66590i() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.PickerActivity.C131723 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                PickerActivity pickerActivity = PickerActivity.this;
                pickerActivity.f34937i = pickerActivity.f34929a.getIntExtra("select_mode", 101);
                if (PickerActivity.this.f34937i == 101) {
                    LoaderManager loaderManager = PickerActivity.this.getLoaderManager();
                    int i = PickerActivity.this.f34937i;
                    PickerActivity pickerActivity2 = PickerActivity.this;
                    loaderManager.initLoader(i, null, new C65837d(pickerActivity2, pickerActivity2));
                } else if (PickerActivity.this.f34937i == 100) {
                    LoaderManager loaderManager2 = PickerActivity.this.getLoaderManager();
                    int i2 = PickerActivity.this.f34937i;
                    PickerActivity pickerActivity3 = PickerActivity.this;
                    loaderManager2.initLoader(i2, null, new C65833b(pickerActivity3, pickerActivity3));
                } else if (PickerActivity.this.f34937i == 102) {
                    LoaderManager loaderManager3 = PickerActivity.this.getLoaderManager();
                    int i3 = PickerActivity.this.f34937i;
                    PickerActivity pickerActivity4 = PickerActivity.this;
                    loaderManager3.initLoader(i3, null, new C65838e(pickerActivity4, pickerActivity4));
                }
            }
        });
    }

    /* renamed from: f */
    public void mo49271f() {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("select_result", null);
        setResult(19901026, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        if (getLoaderManager() != null) {
            getLoaderManager().destroyLoader(this.f34937i);
        }
    }

    /* renamed from: a */
    public void mo49261a() {
        int intExtra = this.f34929a.getIntExtra("select_mode", 101);
        if (intExtra == 101) {
            ((TextView) findViewById(R.id.microapp_m_bar_title)).setText(getString(R.string.microapp_m_select_title));
        } else if (intExtra == 100) {
            ((TextView) findViewById(R.id.microapp_m_bar_title)).setText(getString(R.string.microapp_m_select_image_title));
        } else if (intExtra == 102) {
            ((TextView) findViewById(R.id.microapp_m_bar_title)).setText(getString(R.string.microapp_m_select_video_title));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo49264b() {
        this.f34930b.setLayoutManager(new GridLayoutManager(this, 3));
        this.f34930b.addItemDecoration(new C65829c(3, 4));
        this.f34930b.setHasFixedSize(true);
        C13175a aVar = new C13175a(this.f34929a.getIntExtra("camerType", 0), new ArrayList(), this, this.f34929a.getParcelableArrayListExtra("default_list"), this.f34929a.getIntExtra("max_select_count", 40), this.f34929a.getLongExtra("max_select_size", 188743680));
        this.f34934f = aVar;
        this.f34930b.setAdapter(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo49266c() {
        this.f34936h = new C65818a(new ArrayList(), this);
        ListPopupWindow listPopupWindow = new ListPopupWindow(this);
        this.f34935g = listPopupWindow;
        listPopupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        this.f34935g.setAdapter(this.f34936h);
        this.f34935g.setHeight((int) (((double) C67590h.m263080b(this)) * 0.6d));
        this.f34935g.setAnchorView(findViewById(R.id.microapp_m_footer));
        this.f34935g.setModal(true);
        this.f34935g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.PickerActivity.C131712 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                PickerActivity.this.f34936h.mo230541b(i);
                PickerActivity.this.f34932d.setText(PickerActivity.this.f34936h.getItem(i).f166623a);
                PickerActivity.this.f34934f.mo49286b(PickerActivity.this.f34936h.mo230539a());
                PickerActivity.this.f34935g.dismiss();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo49270e() {
        int intExtra = this.f34929a.getIntExtra("max_select_count", 40);
        Button button = this.f34931c;
        button.setText(getString(R.string.microapp_m_done) + "(" + this.f34934f.mo49285b().size() + "/" + intExtra + ")");
        Button button2 = this.f34933e;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.microapp_m_preview));
        sb.append("(");
        sb.append(this.f34934f.mo49285b().size());
        sb.append(")");
        button2.setText(sb.toString());
    }

    /* renamed from: a */
    public static Resources m53825a(PickerActivity pickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerActivity);
        }
        return pickerActivity.mo49272g();
    }

    /* renamed from: c */
    public static AssetManager m53828c(PickerActivity pickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerActivity);
        }
        return pickerActivity.mo49274i();
    }

    /* renamed from: b */
    public void mo49265b(ArrayList<MediaEntity> arrayList) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("select_result", arrayList);
        setResult(19901026, intent);
        finish();
    }

    /* renamed from: b */
    public static void m53827b(PickerActivity pickerActivity) {
        pickerActivity.mo49273h();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PickerActivity pickerActivity2 = pickerActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    pickerActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // com.tt.miniapp.chooser.p3268b.AbstractC65832a
    /* renamed from: c */
    public void mo49267c(final ArrayList<Folder> arrayList) {
        if (arrayList != null && arrayList.size() > 0) {
            AppbrandContext.getMainHandler().post(new Runnable() {
                /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.PickerActivity.RunnableC131745 */

                public void run() {
                    PickerActivity.this.mo49263a(arrayList);
                    PickerActivity.this.f34932d.setText(((Folder) arrayList.get(0)).f166623a);
                    PickerActivity.this.f34936h.mo230540a(arrayList);
                }
            });
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.microapp_m_btn_back) {
            mo49271f();
        } else if (id == R.id.microapp_m_category_btn) {
            if (this.f34935g.isShowing()) {
                this.f34935g.dismiss();
            } else {
                this.f34935g.show();
            }
        } else if (id == R.id.microapp_m_done) {
            mo49265b(this.f34934f.mo49285b());
        } else if (id != R.id.microapp_m_preview) {
        } else {
            if (this.f34934f.mo49285b().size() <= 0) {
                HostDependManager.getInst().showToast(this, null, getString(R.string.microapp_m_select_null), 0, null);
                return;
            }
            Intent intent = new Intent(this, PreviewActivity.class);
            intent.putExtra("max_select_count", this.f34929a.getIntExtra("max_select_count", 40));
            intent.putExtra("pre_raw_List", this.f34934f.mo49285b());
            startActivityForResult(intent, 8);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34929a = getIntent();
        setContentView(R.layout.microapp_m_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.microapp_m_recycler_view);
        this.f34930b = recyclerView;
        recyclerView.setRecyclerListener(new RecyclerView.AbstractC1339h() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.PickerActivity.C131701 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1339h
            /* renamed from: a */
            public void mo7216a(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder instanceof C13175a.C13181b) {
                    ((C13175a.C13181b) viewHolder).f34961a.setTag(R.id.microapp_m_video_tag, null);
                }
            }
        });
        findViewById(R.id.microapp_m_btn_back).setOnClickListener(this);
        mo49261a();
        this.f34931c = (Button) findViewById(R.id.microapp_m_done);
        this.f34932d = (Button) findViewById(R.id.microapp_m_category_btn);
        this.f34933e = (Button) findViewById(R.id.microapp_m_preview);
        this.f34931c.setOnClickListener(this);
        this.f34932d.setOnClickListener(this);
        this.f34933e.setOnClickListener(this);
        mo49264b();
        mo49266c();
        mo49269d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo49263a(ArrayList<Folder> arrayList) {
        this.f34934f.mo49286b(arrayList.get(0).mo231045a());
        mo49270e();
        this.f34934f.mo49281a(new C13175a.AbstractC13182c() {
            /* class com.bytedance.ee.larkbrand.nativeMoudule.photo.PickerActivity.C131734 */

            @Override // com.bytedance.ee.larkbrand.nativeMoudule.photo.C13175a.AbstractC13182c
            /* renamed from: a */
            public void mo49278a(View view, MediaEntity mediaEntity, ArrayList<MediaEntity> arrayList) {
                PickerActivity.this.mo49270e();
            }
        });
    }

    /* renamed from: a */
    public static void m53826a(PickerActivity pickerActivity, Context context) {
        pickerActivity.mo49262a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m53824a(PickerActivity pickerActivity, Configuration configuration) {
        Context a = pickerActivity.mo49260a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((i >> 16) & 65535) == 0) {
            C66588h.m260183a().mo232192a(this, strArr, iArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8) {
            if (intent != null) {
                ArrayList<MediaEntity> parcelableArrayListExtra = intent.getParcelableArrayListExtra("select_result");
                if (i2 == 1990) {
                    this.f34934f.mo49283a(parcelableArrayListExtra);
                    mo49270e();
                } else if (i2 == 19901026) {
                    mo49265b(parcelableArrayListExtra);
                }
            }
        } else if (i == 20010) {
            if (i2 == -1) {
                String str = null;
                if (intent != null) {
                    str = intent.getStringExtra("SELECTED_PHOTO");
                }
                if (TextUtils.isEmpty(str)) {
                    str = C13175a.C13183d.f34968b;
                }
                if (!TextUtils.isEmpty(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        ArrayList<MediaEntity> arrayList = new ArrayList<>();
                        arrayList.add(new MediaEntity(str, file.getName(), 0, 0, file.length(), 0, ""));
                        mo49265b(arrayList);
                        return;
                    }
                }
            }
            mo49271f();
        }
    }
}
