package com.bytedance.ee.bear.photopicker.photo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.cameraview.AbstractC32798i;
import com.ss.android.lark.cameraview.C32771d;
import com.ss.android.lark.cameraview.C32780e;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57824f;
import com.ss.android.lark.utils.ao;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.Photo;
import java.io.File;
import java.util.ArrayList;

public class TakePhotoActivity extends AppCompatActivity {
    /* renamed from: a */
    public Context mo39833a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public void mo39835a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        m43505a(this, context);
    }

    /* renamed from: b */
    public Resources mo39836b() {
        return super.getResources();
    }

    /* renamed from: c */
    public void mo39837c() {
        super.onStop();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m43503a(this, configuration);
    }

    /* renamed from: d */
    public AssetManager mo39839d() {
        return super.getAssets();
    }

    public AssetManager getAssets() {
        return m43507c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public Resources getResources() {
        return m43504a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m43506b(this);
    }

    /* renamed from: a */
    public void mo39834a() {
        int i;
        Intent intent = getIntent();
        boolean booleanExtra = intent.getBooleanExtra("take_photo_show_take_photo", true);
        boolean booleanExtra2 = intent.getBooleanExtra("take_photo_show_take_photo", true);
        C32771d.m125800a(C58612c.m227290a().mo102859d());
        C32771d.m125799a().mo120697a(C58612c.m227290a().mo102863f());
        if (!booleanExtra2) {
            i = 257;
        } else if (!booleanExtra) {
            i = 258;
        } else {
            i = 259;
        }
        C32780e a = C32780e.m125817a(i, null, null);
        getSupportFragmentManager().beginTransaction().add(R.id.camera_view_fragment, a).commit();
        a.mo120756a(new AbstractC32798i() {
            /* class com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity.C104921 */

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39842a(int i) {
            }

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39841a() {
                TakePhotoActivity.this.setResult(0);
                TakePhotoActivity.this.finish();
            }

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39843a(String str) {
                Log.m165389i("TakePhotoActivity", "take photo");
                Intent intent = new Intent();
                Photo photo = new Photo();
                photo.setPath(str);
                photo.setMimeType("image/jpg");
                ArrayList arrayList = new ArrayList();
                arrayList.add(photo);
                ArrayList<String> arrayList2 = new ArrayList<>();
                arrayList2.add(str);
                intent.putExtra("KEY_SELECTED_MEDIA", arrayList);
                intent.putStringArrayListExtra("SELECTED_PHOTOS", arrayList2);
                intent.putExtra("KEEP_ORIGIN_PHOTO", true);
                intent.putExtra("KEY_FOR_SEND", true);
                TakePhotoActivity.this.setResult(-1, intent);
                TakePhotoActivity.this.finish();
            }

            @Override // com.ss.android.lark.cameraview.AbstractC32798i
            /* renamed from: a */
            public void mo39844a(final String str, String str2) {
                Log.m165389i("TakePhotoActivity", "take Video");
                C57865c.m224574a(new C57865c.AbstractC57873d<ArrayList<Photo>>() {
                    /* class com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity.C104921.C104931 */

                    /* renamed from: a */
                    public ArrayList<Photo> produce() {
                        File file = new File(str);
                        ArrayList<Photo> arrayList = new ArrayList<>();
                        int[] iArr = new int[10];
                        ao.m224298a(str, iArr);
                        int[] a = ao.m224310a(iArr);
                        arrayList.add(new Photo(0, str, "video/mp4", (long) iArr[3], a[0], a[1], file.length()));
                        return arrayList;
                    }
                }, new C57865c.AbstractC57871b<ArrayList<Photo>>() {
                    /* class com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity.C104921.C104942 */

                    /* renamed from: a */
                    public void consume(ArrayList<Photo> arrayList) {
                        Intent intent = new Intent();
                        intent.putExtra("KEY_FOR_SEND", true);
                        intent.putExtra("KEY_SELECTED_MEDIA", arrayList);
                        intent.putExtra("KEY_HAS_VIDEO", true);
                        TakePhotoActivity.this.setResult(-1, intent);
                        TakePhotoActivity.this.finish();
                    }
                });
            }
        });
    }

    /* renamed from: com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity$a */
    public static class C10495a {

        /* renamed from: a */
        public boolean f28220a = true;

        /* renamed from: b */
        private boolean f28221b = true;

        /* renamed from: a */
        public C10495a mo39850a(boolean z) {
            this.f28221b = z;
            return this;
        }

        /* renamed from: b */
        public C10495a mo39852b(boolean z) {
            this.f28220a = z;
            return this;
        }

        /* renamed from: a */
        public Intent mo39849a(Activity activity) {
            Intent intent = new Intent(activity, TakePhotoActivity.class);
            intent.putExtra("take_photo_show_take_photo", this.f28221b);
            intent.putExtra("take_photo_show_take_photo", this.f28220a);
            return intent;
        }

        /* renamed from: a */
        public void mo39851a(final FragmentActivity fragmentActivity, final Fragment fragment, final int i) {
            C57805b.m224331b(fragmentActivity, new C57805b.AbstractC57809a() {
                /* class com.bytedance.ee.bear.photopicker.photo.TakePhotoActivity.C10495a.C104961 */

                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                public void permissionGranted(boolean z) {
                    if (z) {
                        Intent a = C10495a.this.mo39849a(fragmentActivity);
                        if (C10495a.this.f28220a) {
                            C57805b.m224326a(fragmentActivity, new C57805b.AbstractC57809a(a, i) {
                                /* class com.bytedance.ee.bear.photopicker.photo.$$Lambda$TakePhotoActivity$a$1$0Nd1uyItYhDNWT6wpiDheD02uKM */
                                public final /* synthetic */ Intent f$1;
                                public final /* synthetic */ int f$2;

                                {
                                    this.f$1 = r2;
                                    this.f$2 = r3;
                                }

                                @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                                public final void permissionGranted(boolean z) {
                                    TakePhotoActivity.C10495a.C104961.m43524a(Fragment.this, this.f$1, this.f$2, z);
                                }
                            });
                        } else {
                            fragment.startActivityForResult(a, i);
                        }
                    } else {
                        Log.m165389i("TakePhotoActivity", "open camera fialed, do not have camera permission");
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public static /* synthetic */ void m43524a(Fragment fragment, Intent intent, int i, boolean z) {
                    if (z) {
                        fragment.startActivityForResult(intent, i);
                    } else {
                        Log.m165389i("TakePhotoActivity", "open camera fialed, do not have audio permission");
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_take_photo);
        mo39834a();
    }

    /* renamed from: a */
    public static Resources m43504a(TakePhotoActivity takePhotoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(takePhotoActivity);
        }
        return takePhotoActivity.mo39836b();
    }

    /* renamed from: c */
    public static AssetManager m43507c(TakePhotoActivity takePhotoActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(takePhotoActivity);
        }
        return takePhotoActivity.mo39839d();
    }

    /* renamed from: b */
    public static void m43506b(TakePhotoActivity takePhotoActivity) {
        takePhotoActivity.mo39837c();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            TakePhotoActivity takePhotoActivity2 = takePhotoActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    takePhotoActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m43505a(TakePhotoActivity takePhotoActivity, Context context) {
        takePhotoActivity.mo39835a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(takePhotoActivity);
        }
    }

    /* renamed from: a */
    public static Context m43503a(TakePhotoActivity takePhotoActivity, Configuration configuration) {
        Context a = takePhotoActivity.mo39833a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
