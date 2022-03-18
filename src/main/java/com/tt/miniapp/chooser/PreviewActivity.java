package com.tt.miniapp.chooser;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0774a;
import androidx.fragment.app.AbstractC1045n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.tt.miniapp.chooser.view.C65839a;
import com.tt.miniapp.view.swipeback.SwipeBackActivity;
import com.tt.miniapphost.entity.MediaEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PreviewActivity extends SwipeBackActivity implements View.OnClickListener, ViewPager.OnPageChangeListener {

    /* renamed from: a */
    Button f165860a;

    /* renamed from: b */
    LinearLayout f165861b;

    /* renamed from: c */
    ImageView f165862c;

    /* renamed from: d */
    ViewPager f165863d;

    /* renamed from: e */
    TextView f165864e;

    /* renamed from: f */
    ArrayList<MediaEntity> f165865f;

    /* renamed from: g */
    ArrayList<MediaEntity> f165866g;

    /* renamed from: a */
    public Context mo230528a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo230529a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo230531a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void attachBaseContext(Context context) {
        m257966a(this, context);
    }

    /* renamed from: b */
    public void mo230534b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo230535c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m257964a(this, configuration);
    }

    @Override // com.tt.miniapphost.view.BaseActivity
    public AssetManager getAssets() {
        return m257968c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity, com.tt.miniapphost.view.BaseActivity
    public Resources getResources() {
        return m257965a(this);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m257967b(this);
    }

    /* renamed from: com.tt.miniapp.chooser.PreviewActivity$a */
    public class C65816a extends AbstractC1045n {

        /* renamed from: b */
        private List<Fragment> f165868b;

        @Override // androidx.fragment.app.AbstractC1045n, androidx.viewpager.widget.PagerAdapter
        public Parcelable saveState() {
            return null;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.f165868b.size();
        }

        @Override // androidx.fragment.app.AbstractC1045n
        /* renamed from: a */
        public Fragment mo5615a(int i) {
            return this.f165868b.get(i);
        }

        public C65816a(FragmentManager fragmentManager, List<Fragment> list) {
            super(fragmentManager);
            this.f165868b = list;
        }
    }

    @Override // androidx.activity.ComponentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onBackPressed() {
        mo230533a(this.f165866g, 1990);
        super.onBackPressed();
    }

    /* renamed from: a */
    public static Resources m257965a(PreviewActivity previewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(previewActivity);
        }
        return previewActivity.mo230529a();
    }

    /* renamed from: c */
    public static AssetManager m257968c(PreviewActivity previewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(previewActivity);
        }
        return previewActivity.mo230535c();
    }

    /* renamed from: b */
    public static void m257967b(PreviewActivity previewActivity) {
        previewActivity.mo230534b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            PreviewActivity previewActivity2 = previewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    previewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.microapp_m_btn_back) {
            mo230533a(this.f165866g, 1990);
        } else if (id == R.id.microapp_m_done) {
            mo230533a(this.f165866g, 19901026);
        } else if (id == R.id.microapp_m_check_layout) {
            MediaEntity mediaEntity = this.f165865f.get(this.f165863d.getCurrentItem());
            int a = mo230527a(mediaEntity, this.f165866g);
            if (a < 0) {
                Drawable drawable = ContextCompat.getDrawable(this, R.drawable.microapp_m_btn_selected);
                C0774a.m3766a(C0774a.m3779g(drawable), ContextCompat.getColor(this, R.color.primary_pri_500));
                this.f165862c.setImageDrawable(drawable);
                this.f165866g.add(mediaEntity);
            } else {
                this.f165862c.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.microapp_m_btn_unselected));
                this.f165866g.remove(a);
            }
            mo230530a(this.f165866g.size());
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        int i2;
        TextView textView = this.f165864e;
        textView.setText((i + 1) + "/" + this.f165865f.size());
        ImageView imageView = this.f165862c;
        if (mo230527a(this.f165865f.get(i), this.f165866g) < 0) {
            i2 = R.drawable.microapp_m_btn_unselected;
        } else {
            i2 = R.drawable.microapp_m_btn_selected;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(this, i2));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tt.miniapp.view.swipeback.SwipeBackActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity, com.tt.miniapphost.view.BaseActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.microapp_m_preview_main);
        findViewById(R.id.microapp_m_btn_back).setOnClickListener(this);
        this.f165862c = (ImageView) findViewById(R.id.microapp_m_check_image);
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.microapp_m_btn_selected);
        C0774a.m3766a(C0774a.m3779g(drawable), ContextCompat.getColor(this, R.color.primary_pri_500));
        this.f165862c.setImageDrawable(drawable);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.microapp_m_check_layout);
        this.f165861b = linearLayout;
        linearLayout.setOnClickListener(this);
        this.f165864e = (TextView) findViewById(R.id.microapp_m_bar_title);
        Button button = (Button) findViewById(R.id.microapp_m_done);
        this.f165860a = button;
        button.setOnClickListener(this);
        this.f165863d = (ViewPager) findViewById(R.id.viewpager);
        this.f165865f = getIntent().getParcelableArrayListExtra("pre_raw_List");
        ArrayList<MediaEntity> arrayList = new ArrayList<>();
        this.f165866g = arrayList;
        arrayList.addAll(this.f165865f);
        mo230532a(this.f165865f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo230530a(int i) {
        Button button = this.f165860a;
        button.setText(getString(R.string.microapp_m_done) + "(" + i + "/" + getIntent().getIntExtra("max_select_count", 40) + ")");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo230532a(ArrayList<MediaEntity> arrayList) {
        mo230530a(arrayList.size());
        TextView textView = this.f165864e;
        textView.setText("1/" + this.f165865f.size());
        ArrayList arrayList2 = new ArrayList();
        Iterator<MediaEntity> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(C65839a.m258008a(it.next(), ""));
        }
        this.f165863d.setAdapter(new C65816a(getSupportFragmentManager(), arrayList2));
        this.f165863d.addOnPageChangeListener(this);
    }

    /* renamed from: a */
    public static void m257966a(PreviewActivity previewActivity, Context context) {
        previewActivity.mo230531a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(previewActivity);
        }
    }

    /* renamed from: a */
    public static Context m257964a(PreviewActivity previewActivity, Configuration configuration) {
        Context a = previewActivity.mo230528a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* renamed from: a */
    public int mo230527a(MediaEntity mediaEntity, ArrayList<MediaEntity> arrayList) {
        if (arrayList.size() <= 0) {
            return -1;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).f170268a.equals(mediaEntity.f170268a)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public void mo230533a(ArrayList<MediaEntity> arrayList, int i) {
        Intent intent = new Intent();
        intent.putParcelableArrayListExtra("select_result", arrayList);
        setResult(i, intent);
        finish();
    }
}
