package com.ss.android.lark.voip.service.impl.app.feedback;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.voip.C57977a;
import java.util.Locale;

public class VoipBaseActivity extends BaseFragmentActivity {
    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        super.attachBaseContext(mo196838b(context));
    }

    /* renamed from: b */
    public Context mo196838b(Context context) {
        Configuration configuration = new Configuration();
        Locale languageSetting = C57977a.m224905c().getLanguageSetting();
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(languageSetting);
        } else {
            configuration.locale = languageSetting;
        }
        context.getResources().updateConfiguration(context.getResources().getConfiguration(), context.getResources().getDisplayMetrics());
        return context.createConfigurationContext(configuration);
    }
}
