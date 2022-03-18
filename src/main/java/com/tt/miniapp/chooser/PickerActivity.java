package com.tt.miniapp.chooser;

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
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.component.universe_design.toast.UDToast;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.chooser.p3267a.C65818a;
import com.tt.miniapp.chooser.p3267a.C65820b;
import com.tt.miniapp.chooser.p3267a.C65829c;
import com.tt.miniapp.chooser.p3268b.AbstractC65832a;
import com.tt.miniapp.chooser.p3268b.C65833b;
import com.tt.miniapp.chooser.p3268b.C65837d;
import com.tt.miniapp.chooser.p3268b.C65838e;
import com.tt.miniapp.entity.Folder;
import com.tt.miniapp.permission.AbstractC66590i;
import com.tt.miniapp.permission.C66588h;
import com.tt.miniapp.view.swipeback.SwipeBackActivity;
import com.tt.miniapphost.entity.MediaEntity;
import com.tt.miniapphost.p3370d.AbstractC67477a;
import com.tt.miniapphost.util.C67590h;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public class PickerActivity extends SwipeBackActivity implements View.OnClickListener, AbstractC65832a, AbstractC67477a {

    /* renamed from: a */
    Intent f165847a;

    /* renamed from: b */
    RecyclerView f165848b;

    /* renamed from: c */
    Button f165849c;

    /* renamed from: d */
    Button f165850d;

    /* renamed from: e */
    Button f165851e;

    /* renamed from: f */
    C65820b f165852f;

    /* renamed from: g */
    ListPopupWindow f165853g;

    /* renamed from: h */
    public C65818a f165854h;

    /* renamed from: i */
    public int f165855i;

    /* renamed from: a */
    public Context mo230510a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo230512a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m257943a(this, context);
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m257941a(this, configuration);
    }

    /* renamed from: g */
    public Resources mo230521g() {
        return super.getResources();
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m257945c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m257942a(this);
    }

    /* renamed from: h */
    public void mo230522h() {
        super.onStop();
    }

    /* renamed from: i */
    public AssetManager mo230523i() {
        return super.getAssets();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m257944b(this);
    }

    @Override // androidx.activity.ComponentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        mo230520f();
    }

    @Override // com.tt.miniapphost.view.BaseActivity, com.tt.miniapphost.p3370d.AbstractC67477a
    public void onLanguageChange() {
        mo230511a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo230518d() {
        HashSet hashSet = new HashSet();
        hashSet.add("android.permission.READ_EXTERNAL_STORAGE");
        C66588h.m260183a().mo232189a(this, hashSet, new AbstractC66590i() {
            /* class com.tt.miniapp.chooser.PickerActivity.C658143 */

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48891a(String str) {
            }

            @Override // com.tt.miniapp.permission.AbstractC66590i
            /* renamed from: a */
            public void mo48890a() {
                PickerActivity pickerActivity = PickerActivity.this;
                pickerActivity.f165855i = pickerActivity.f165847a.getIntExtra("select_mode", 101);
                if (PickerActivity.this.f165855i == 101) {
                    LoaderManager loaderManager = PickerActivity.this.getLoaderManager();
                    int i = PickerActivity.this.f165855i;
                    PickerActivity pickerActivity2 = PickerActivity.this;
                    loaderManager.initLoader(i, null, new C65837d(pickerActivity2, pickerActivity2));
                } else if (PickerActivity.this.f165855i == 100) {
                    LoaderManager loaderManager2 = PickerActivity.this.getLoaderManager();
                    int i2 = PickerActivity.this.f165855i;
                    PickerActivity pickerActivity3 = PickerActivity.this;
                    loaderManager2.initLoader(i2, null, new C65833b(pickerActivity3, pickerActivity3));
                } else if (PickerActivity.this.f165855i == 102) {
                    LoaderManager loaderManager3 = PickerActivity.this.getLoaderManager();
                    int i3 = PickerActivity.this.f165855i;
                    PickerActivity pickerActivity4 = PickerActivity.this;
                    loaderManager3.initLoader(i3, null, new C65838e(pickerActivity4, pickerActivity4));
                }
            }
        });
    }

    /* renamed from: f */
    public void mo230520f() {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("select_result", null);
        setResult(19901026, intent);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onDestroy() {
        super.onDestroy();
        if (getLoaderManager() != null) {
            getLoaderManager().destroyLoader(this.f165855i);
        }
    }

    /* renamed from: a */
    public void mo230511a() {
        int intExtra = this.f165847a.getIntExtra("select_mode", 101);
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
    public void mo230514b() {
        this.f165848b.setLayoutManager(new GridLayoutManager(this, 3));
        this.f165848b.addItemDecoration(new C65829c(3, 4));
        this.f165848b.setHasFixedSize(true);
        C65820b bVar = new C65820b(this.f165847a.getIntExtra("camerType", 0), new ArrayList(), this, this.f165847a.getParcelableArrayListExtra("default_list"), this.f165847a.getIntExtra("max_select_count", 40));
        this.f165852f = bVar;
        this.f165848b.setAdapter(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo230516c() {
        this.f165854h = new C65818a(new ArrayList(), this);
        ListPopupWindow listPopupWindow = new ListPopupWindow(this);
        this.f165853g = listPopupWindow;
        listPopupWindow.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.bg_body)));
        this.f165853g.setAdapter(this.f165854h);
        this.f165853g.setHeight((int) (((double) C67590h.m263080b(this)) * 0.6d));
        this.f165853g.setAnchorView(findViewById(R.id.microapp_m_footer));
        this.f165853g.setModal(true);
        this.f165853g.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            /* class com.tt.miniapp.chooser.PickerActivity.C658132 */

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                PickerActivity.this.f165854h.mo230541b(i);
                PickerActivity.this.f165850d.setText(PickerActivity.this.f165854h.getItem(i).f166623a);
                PickerActivity.this.f165852f.mo230552b(PickerActivity.this.f165854h.mo230539a());
                PickerActivity.this.f165853g.dismiss();
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo230519e() {
        int intExtra = this.f165847a.getIntExtra("max_select_count", 40);
        Button button = this.f165849c;
        button.setText(getString(R.string.microapp_m_done) + "(" + this.f165852f.mo230551b().size() + "/" + intExtra + ")");
        Button button2 = this.f165851e;
        StringBuilder sb = new StringBuilder();
        sb.append(getString(R.string.microapp_m_preview));
        sb.append("(");
        sb.append(this.f165852f.mo230551b().size());
        sb.append(")");
        button2.setText(sb.toString());
    }

    /* renamed from: a */
    public static Resources m257942a(PickerActivity pickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerActivity);
        }
        return pickerActivity.mo230521g();
    }

    /* renamed from: c */
    public static AssetManager m257945c(PickerActivity pickerActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerActivity);
        }
        return pickerActivity.mo230523i();
    }

    /* renamed from: b */
    public void mo230515b(ArrayList<MediaEntity> arrayList) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("select_result", arrayList);
        setResult(19901026, intent);
        finish();
    }

    /* renamed from: b */
    public static void m257944b(PickerActivity pickerActivity) {
        pickerActivity.mo230522h();
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
    public void mo49267c(ArrayList<Folder> arrayList) {
        mo230513a(arrayList);
        this.f165850d.setText(arrayList.get(0).f166623a);
        this.f165854h.mo230540a(arrayList);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.microapp_m_btn_back) {
            mo230520f();
        } else if (id == R.id.microapp_m_category_btn) {
            if (this.f165853g.isShowing()) {
                this.f165853g.dismiss();
            } else {
                this.f165853g.show();
            }
        } else if (id == R.id.microapp_m_done) {
            mo230515b(this.f165852f.mo230551b());
        } else if (id != R.id.microapp_m_preview) {
        } else {
            if (this.f165852f.mo230551b().size() <= 0) {
                UDToast.show(this, getString(R.string.microapp_m_select_null));
                return;
            }
            Intent intent = new Intent(this, PreviewActivity.class);
            intent.putExtra("max_select_count", this.f165847a.getIntExtra("max_select_count", 40));
            intent.putExtra("pre_raw_List", this.f165852f.mo230551b());
            startActivityForResult(intent, 8);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f165847a = getIntent();
        setContentView(R.layout.microapp_m_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.microapp_m_recycler_view);
        this.f165848b = recyclerView;
        recyclerView.setRecyclerListener(new RecyclerView.AbstractC1339h() {
            /* class com.tt.miniapp.chooser.PickerActivity.C658121 */

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1339h
            /* renamed from: a */
            public void mo7216a(RecyclerView.ViewHolder viewHolder) {
                if (viewHolder instanceof C65820b.C65827b) {
                    ((C65820b.C65827b) viewHolder).f165901a.setTag(R.id.microapp_m_video_tag, null);
                }
            }
        });
        findViewById(R.id.microapp_m_btn_back).setOnClickListener(this);
        mo230511a();
        this.f165849c = (Button) findViewById(R.id.microapp_m_done);
        this.f165850d = (Button) findViewById(R.id.microapp_m_category_btn);
        this.f165851e = (Button) findViewById(R.id.microapp_m_preview);
        this.f165849c.setOnClickListener(this);
        this.f165850d.setOnClickListener(this);
        this.f165851e.setOnClickListener(this);
        mo230514b();
        mo230516c();
        mo230518d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo230513a(ArrayList<Folder> arrayList) {
        this.f165852f.mo230552b(arrayList.get(0).mo231045a());
        mo230519e();
        this.f165852f.mo230547a(new C65820b.AbstractC65828c() {
            /* class com.tt.miniapp.chooser.PickerActivity.C658154 */

            @Override // com.tt.miniapp.chooser.p3267a.C65820b.AbstractC65828c
            /* renamed from: a */
            public void mo230526a(View view, MediaEntity mediaEntity, ArrayList<MediaEntity> arrayList) {
                PickerActivity.this.mo230519e();
            }
        });
    }

    /* renamed from: a */
    public static void m257943a(PickerActivity pickerActivity, Context context) {
        pickerActivity.mo230512a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(pickerActivity);
        }
    }

    /* renamed from: a */
    public static Context m257941a(PickerActivity pickerActivity, Configuration configuration) {
        Context a = pickerActivity.mo230510a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((i >> 16) & 65535) == 0) {
            C66588h.m260183a().mo232192a(this, strArr, iArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i == 8) {
            if (intent != null) {
                ArrayList<MediaEntity> parcelableArrayListExtra = intent.getParcelableArrayListExtra("select_result");
                if (i2 == 1990) {
                    this.f165852f.mo230549a(parcelableArrayListExtra);
                    mo230519e();
                } else if (i2 == 19901026) {
                    mo230515b(parcelableArrayListExtra);
                }
            }
        } else if (i == 9 || i == 10) {
            if (i == 9) {
                str = C65817a.f165869a;
            } else {
                str = C65817a.f165870b;
            }
            if (i2 == -1 && !TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.exists()) {
                    ArrayList<MediaEntity> arrayList = new ArrayList<>();
                    arrayList.add(new MediaEntity(str, file.getName(), 0, 0, file.length(), 0, ""));
                    mo230515b(arrayList);
                    return;
                }
            }
            mo230520f();
        }
    }
}
