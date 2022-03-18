package com.ss.android.lark.littleapp.router;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.appcompat.app.AppCompatActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.jaeger.library.StatusBarUtil;
import com.larksuite.framework.utils.RomUtils;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.littleapp.C41354g;
import com.ss.android.lark.littleapp.entity.BaseRouteModel;
import com.ss.android.lark.littleapp.entity.ChooseLocationModel;
import com.ss.android.lark.littleapp.entity.OpenUrlByLarkModel;
import com.ss.android.lark.littleapp.entity.OpenWebModel;
import com.ss.android.lark.littleapp.entity.ParseQRCodeModel;
import com.ss.android.lark.littleapp.entity.RouteDriveSDKModel;
import com.ss.android.lark.littleapp.entity.RouteFileDetailModel;
import com.ss.android.lark.littleapp.entity.RouteOpenCameraModel;
import com.ss.android.lark.littleapp.entity.RoutePasswordVerifyModel;
import com.ss.android.lark.littleapp.entity.RoutePhotoPickerModel;
import com.ss.android.lark.littleapp.entity.RouteProfileModel;
import com.ss.android.lark.littleapp.entity.RouteQRModel;
import com.ss.android.lark.littleapp.entity.RouteShareModel;
import com.ss.android.lark.littleapp.entity.RouterChooseChatModel;
import com.ss.android.lark.littleapp.entity.RouterShareAppModel;
import com.ss.android.lark.littleapp.entity.ShareAppModel;
import com.ss.android.lark.littleapp.service.ILittleAppService;
import com.ss.android.lark.littleapp.service.p2132a.C41437d;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.util.ArrayList;
import java.util.Iterator;

public class LittleAppRouterActivity extends AppCompatActivity {

    /* renamed from: a */
    private BaseRouteModel f105290a;

    /* renamed from: b */
    private Handler f105291b = new Handler();

    /* renamed from: c */
    private boolean f105292c = true;

    /* renamed from: a */
    public Context mo149124a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo149127a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m164186a(this, context);
    }

    /* renamed from: b */
    public Resources mo149128b() {
        return super.getResources();
    }

    /* renamed from: c */
    public AssetManager mo149129c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m164184a(this, configuration);
    }

    public AssetManager getAssets() {
        return m164189c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m164188b(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m164185a(this);
    }

    /* renamed from: d */
    private void m164190d() {
        this.f105291b.postDelayed(new Runnable() {
            /* class com.ss.android.lark.littleapp.router.LittleAppRouterActivity.RunnableC414141 */

            public void run() {
                LittleAppRouterActivity.this.finish();
            }
        }, 3000);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        this.f105291b.removeCallbacksAndMessages(null);
    }

    /* renamed from: e */
    private BaseRouteModel m164191e() {
        Bundle extras;
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            return null;
        }
        return (BaseRouteModel) extras.getParcelable(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
    }

    /* renamed from: a */
    public void mo149125a() {
        super.onStop();
        if (this.f105292c) {
            finish();
        }
    }

    /* renamed from: b */
    public static Resources m164188b(LittleAppRouterActivity littleAppRouterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(littleAppRouterActivity);
        }
        return littleAppRouterActivity.mo149128b();
    }

    /* renamed from: c */
    public static AssetManager m164189c(LittleAppRouterActivity littleAppRouterActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(littleAppRouterActivity);
        }
        return littleAppRouterActivity.mo149129c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo149126a(0);
        BaseRouteModel e = m164191e();
        this.f105290a = e;
        if (m164187a(e)) {
            if (this.f105292c) {
                m164190d();
            }
        } else if (this.f105292c) {
            finish();
        }
    }

    /* renamed from: a */
    public static void m164185a(LittleAppRouterActivity littleAppRouterActivity) {
        littleAppRouterActivity.mo149125a();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            LittleAppRouterActivity littleAppRouterActivity2 = littleAppRouterActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    littleAppRouterActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo149126a(int i) {
        if (RomUtils.m94934a(this, getWindow())) {
            StatusBarUtil.setColorNoTranslucent(this, i);
        }
    }

    /* renamed from: a */
    private boolean m164187a(BaseRouteModel baseRouteModel) {
        if (baseRouteModel == null) {
            return false;
        }
        C41437d e = C41437d.m164411e();
        if (baseRouteModel instanceof RouteProfileModel) {
            return e.mo149165a(this, (RouteProfileModel) baseRouteModel);
        }
        if (baseRouteModel instanceof RouteQRModel) {
            return e.mo149166a(this, (RouteQRModel) baseRouteModel);
        }
        if (baseRouteModel instanceof RouteShareModel) {
            this.f105292c = false;
            return e.mo149167a(this, (RouteShareModel) baseRouteModel);
        } else if (baseRouteModel instanceof RouterShareAppModel) {
            this.f105292c = false;
            ShareAppModel shareAppModel = new ShareAppModel();
            RouterShareAppModel routerShareAppModel = (RouterShareAppModel) baseRouteModel;
            shareAppModel.setAppId(routerShareAppModel.mo148885b());
            shareAppModel.setHref(routerShareAppModel.mo148890g());
            shareAppModel.setAndroidHref(routerShareAppModel.mo148888e());
            shareAppModel.setIosHref(routerShareAppModel.mo148887d());
            shareAppModel.setPcHref(routerShareAppModel.mo148889f());
            shareAppModel.setAppPage(routerShareAppModel.mo148892i());
            shareAppModel.setImgKey(routerShareAppModel.mo148891h());
            shareAppModel.setTitle(routerShareAppModel.mo148886c());
            return e.mo149168a(this, shareAppModel);
        } else if (baseRouteModel instanceof RouteFileDetailModel) {
            return e.mo149163a(this, (RouteFileDetailModel) baseRouteModel);
        } else {
            if (baseRouteModel instanceof RouteDriveSDKModel) {
                return e.mo149162a(this, (RouteDriveSDKModel) baseRouteModel);
            }
            if (TextUtils.equals(baseRouteModel.mo148766a(), "about")) {
                return e.mo149181c(this);
            }
            if (baseRouteModel instanceof RoutePasswordVerifyModel) {
                return e.mo149164a(this, (RoutePasswordVerifyModel) baseRouteModel);
            }
            if (baseRouteModel instanceof ParseQRCodeModel) {
                return e.mo149177b(this, ((ParseQRCodeModel) baseRouteModel).mo148817b());
            }
            if (baseRouteModel instanceof OpenWebModel) {
                OpenWebModel openWebModel = (OpenWebModel) baseRouteModel;
                return e.mo149170a(this, openWebModel.mo148809b(), openWebModel.mo148811c());
            } else if (baseRouteModel instanceof RouterChooseChatModel) {
                this.f105292c = false;
                return e.mo149161a(this, ((RouterChooseChatModel) baseRouteModel).mo148880b());
            } else if (baseRouteModel instanceof RouteOpenCameraModel) {
                this.f105292c = false;
                return e.mo149159a(this, 20010, ((RouteOpenCameraModel) baseRouteModel).mo148835b());
            } else if (baseRouteModel instanceof RoutePhotoPickerModel) {
                this.f105292c = false;
                RoutePhotoPickerModel routePhotoPickerModel = (RoutePhotoPickerModel) baseRouteModel;
                return e.mo149160a(this, routePhotoPickerModel.mo148846b(), routePhotoPickerModel.mo148847c(), routePhotoPickerModel.mo148848d(), routePhotoPickerModel.mo148849e());
            } else if (baseRouteModel instanceof OpenUrlByLarkModel) {
                return e.mo149182c(this, ((OpenUrlByLarkModel) baseRouteModel).mo148803b());
            } else {
                if (baseRouteModel instanceof ChooseLocationModel) {
                    this.f105292c = false;
                    C41354g.m163939a().chooseLocation(this, ((ChooseLocationModel) baseRouteModel).mo148784b());
                    return true;
                } else if (!TextUtils.equals(baseRouteModel.mo148766a(), "security_verify")) {
                    return false;
                } else {
                    this.f105292c = false;
                    return e.mo149169a(this, new ILittleAppService.AbstractC41419d() {
                        /* class com.ss.android.lark.littleapp.router.LittleAppRouterActivity.C414152 */

                        @Override // com.ss.android.lark.littleapp.service.ILittleAppService.AbstractC41419d
                        /* renamed from: a */
                        public void mo149133a(String str) {
                            Intent intent = new Intent();
                            intent.putExtra("password_verify_data", str);
                            LittleAppRouterActivity.this.setResult(-1, intent);
                            LittleAppRouterActivity.this.finish();
                        }
                    });
                }
            }
        }
    }

    /* renamed from: a */
    public static void m164186a(LittleAppRouterActivity littleAppRouterActivity, Context context) {
        littleAppRouterActivity.mo149127a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(littleAppRouterActivity);
        }
    }

    /* renamed from: a */
    public static Context m164184a(LittleAppRouterActivity littleAppRouterActivity, Configuration configuration) {
        Context a = littleAppRouterActivity.mo149124a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 20010 && i2 == -1) {
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("SELECTED_PHOTOS");
            if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
                setResult(0);
            } else {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(stringArrayListExtra.get(0));
                Intent intent2 = new Intent();
                intent2.putStringArrayListExtra("SELECTED_PHOTO", arrayList);
                setResult(-1, intent2);
            }
            finish();
        } else if (i != 233) {
            setResult(i2, intent);
            finish();
        } else if (i2 == 0 || intent == null) {
            setResult(0);
            finish();
        } else {
            ArrayList<String> arrayList2 = new ArrayList<>();
            Iterator it = ((ArrayList) intent.getSerializableExtra("KEY_SELECTED_MEDIA")).iterator();
            while (it.hasNext()) {
                arrayList2.add(((Photo) it.next()).getPath());
            }
            boolean booleanExtra = intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false);
            Intent intent3 = new Intent();
            intent3.putStringArrayListExtra("SELECTED_PHOTO", arrayList2);
            intent3.putExtra("KEEP_ORIGIN_PHOTO", booleanExtra);
            setResult(-1, intent3);
            finish();
        }
    }
}
