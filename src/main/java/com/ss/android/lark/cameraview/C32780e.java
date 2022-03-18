package com.ss.android.lark.cameraview;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.C26254af;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.MediaStoreUtil;
import com.larksuite.suite.R;
import com.ss.android.lark.cameraview.C32780e;
import com.ss.android.lark.cameraview.p1588b.AbstractC32753b;
import com.ss.android.lark.cameraview.p1588b.AbstractC32754c;
import com.ss.android.lark.cameraview.p1588b.AbstractC32755d;
import com.ss.android.lark.cameraview.p1590d.C32773b;
import com.ss.android.lark.cameraview.p1590d.C32779e;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.C57788ai;
import com.ss.android.lark.utils.LarkContext;
import java.io.File;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: com.ss.android.lark.cameraview.e */
public class C32780e extends Fragment {

    /* renamed from: a */
    public JCameraView f84101a;

    /* renamed from: b */
    public AbstractC32798i f84102b;

    /* renamed from: c */
    private String f84103c;

    /* renamed from: d */
    private String f84104d;

    /* renamed from: e */
    private int f84105e;

    /* renamed from: f */
    private WindowRotationArbiter f84106f;

    /* renamed from: g */
    private AudioManager.OnAudioFocusChangeListener f84107g = new AudioManager.OnAudioFocusChangeListener() {
        /* class com.ss.android.lark.cameraview.C32780e.C327811 */

        public void onAudioFocusChange(int i) {
        }
    };

    /* renamed from: b */
    public AbstractC32798i mo120757b() {
        return this.f84102b;
    }

    /* renamed from: a */
    public Context mo120755a() {
        Context context = getContext();
        if (context == null) {
            return LarkContext.getApplication();
        }
        return context;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f84101a.mo120647c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f84101a.mo120644b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        Context a = mo120755a();
        if (a != null) {
            C32773b.m125804b(a, this.f84107g);
        }
        JCameraView jCameraView = this.f84101a;
        if (jCameraView != null) {
            jCameraView.mo120650f();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(4);
        }
        this.f84101a.mo120648d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
        this.f84101a.mo120649e();
        super.onStop();
    }

    /* renamed from: d */
    private void m125819d() {
        try {
            Field a = C26254af.m95001a((Class<?>) ValueAnimator.class, "sDurationScale");
            if (a != null) {
                a.setAccessible(true);
                if (a.getFloat(null) == BitmapDescriptorFactory.HUE_RED) {
                    a.setFloat(null, 1.0f);
                    return;
                }
                return;
            }
            Log.m165383e("CameraViewFragment", "field is null");
        } catch (IllegalAccessException e) {
            Log.m165384e("CameraViewFragment", "resetAnimatorDurationScale failed", e);
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public void mo120758c() {
        int id = ((ViewGroup) requireView().getParent()).getId();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.findFragmentById(id) != null) {
            parentFragmentManager.popBackStackImmediate();
        }
        C32780e eVar = new C32780e();
        eVar.setArguments(getArguments());
        eVar.mo120756a(mo120757b());
        parentFragmentManager.beginTransaction().add(id, eVar).addToBackStack(null).commitAllowingStateLoss();
    }

    /* renamed from: a */
    public void mo120756a(AbstractC32798i iVar) {
        this.f84102b = iVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f84106f.mo120788a(configuration);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f84103c = arguments.getString("photoPath");
            this.f84104d = arguments.getString("videoPpath");
            this.f84105e = arguments.getInt("maxDuration");
        }
        if (TextUtils.isEmpty(this.f84103c)) {
            this.f84103c = C32779e.m125815a(mo120755a()) + "photo" + File.separator;
        }
        if (TextUtils.isEmpty(this.f84104d)) {
            this.f84104d = C32779e.m125815a(mo120755a()) + "video" + File.separator;
        }
        Context a = mo120755a();
        if (a != null) {
            C32773b.m125802a(a, this.f84107g);
        }
        this.f84106f = new WindowRotationArbiter(requireActivity(), new Function2<Integer, Integer, Unit>() {
            /* class com.ss.android.lark.cameraview.C32780e.C327822 */

            /* renamed from: a */
            public Unit invoke(Integer num, Integer num2) {
                C32780e.this.mo120758c();
                return Unit.INSTANCE;
            }
        });
    }

    /* renamed from: a */
    public static C32780e m125817a(int i, String str, String str2) {
        return m125818a(i, str, str2, HwBuildEx.VersionCodes.CUR_DEVELOPMENT);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("featureSwitch", 259);
        } else {
            i = 259;
        }
        View inflate = layoutInflater.inflate(R.layout.fragment_camera_view_layout, viewGroup, false);
        JCameraView jCameraView = (JCameraView) inflate.findViewById(R.id.jcameraview);
        this.f84101a = jCameraView;
        jCameraView.setMaxDuration(this.f84105e);
        this.f84101a.setSaveVideoPath(this.f84104d);
        this.f84101a.setFeatures(i);
        if (i == 259) {
            this.f84101a.setTip(mo120755a().getResources().getString(R.string.Lark_Legacy_CameraRecordTip));
        } else {
            this.f84101a.setTip("");
        }
        this.f84101a.setMediaQuality(1600000);
        this.f84101a.setErrorLisenter(new AbstractC32754c() {
            /* class com.ss.android.lark.cameraview.C32780e.C327833 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32754c
            /* renamed from: a */
            public void mo120715a() {
                Log.m165389i("CameraViewFragment", "camera error");
                new Intent();
                if (C32780e.this.f84102b != null) {
                    C32780e.this.f84102b.mo39842a(103);
                }
            }
        });
        this.f84101a.setJCameraLisenter(new AbstractC32755d() {
            /* class com.ss.android.lark.cameraview.C32780e.C327844 */

            /* access modifiers changed from: private */
            /* renamed from: a */
            public /* synthetic */ void m125826a(String str) {
                if (C32780e.this.f84102b != null) {
                    C32780e.this.f84102b.mo39843a(str);
                }
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32755d
            /* renamed from: a */
            public void mo120716a(Bitmap bitmap) {
                if (bitmap == null) {
                    Log.m165389i("CameraViewFragment", "capture bitmap is null");
                } else {
                    CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(bitmap) {
                        /* class com.ss.android.lark.cameraview.$$Lambda$e$4$A4IkmN4_Qn85O7om1qH2iEg6RGQ */
                        public final /* synthetic */ Bitmap f$1;

                        {
                            this.f$1 = r2;
                        }

                        public final void run() {
                            C32780e.C327844.this.m125827b(this.f$1);
                        }
                    });
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public /* synthetic */ void m125827b(Bitmap bitmap) {
                String str;
                String str2 = "photo_" + System.currentTimeMillis() + ".jpg";
                Context a = C32780e.this.mo120755a();
                if (Build.VERSION.SDK_INT >= 29) {
                    Uri a2 = MediaStoreUtil.m94880a(a, str2, C26311p.m95283c(str2), MediaStoreUtil.DirType.DCIM);
                    MediaStoreUtil.m94892a(a, bitmap, a2);
                    str = C57788ai.m224257a(a, a2);
                } else {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM), "Lark");
                    String str3 = file.getAbsolutePath() + str2;
                    C26311p.m95265a(bitmap, str3);
                    str = str3;
                }
                C26311p.m95268a(a, str);
                Log.m165389i("CameraViewFragment", "take photo url = " + str);
                UICallbackExecutor.execute(new Runnable(str) {
                    /* class com.ss.android.lark.cameraview.$$Lambda$e$4$qEzqXmU0tJwbbmvl0OGa6lP2PPM */
                    public final /* synthetic */ String f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        C32780e.C327844.this.m125826a((C32780e.C327844) this.f$1);
                    }
                });
            }

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32755d
            /* renamed from: a */
            public void mo120717a(String str, Bitmap bitmap) {
                Log.m165389i("CameraViewFragment", "take video url = " + str);
                C26311p.m95268a(C32780e.this.mo120755a(), str);
                if (C32780e.this.f84102b != null) {
                    C32780e.this.f84102b.mo39844a(str, null);
                }
            }
        });
        this.f84101a.setLeftClickListener(new AbstractC32753b() {
            /* class com.ss.android.lark.cameraview.C32780e.C327855 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32753b
            /* renamed from: a */
            public void mo120672a() {
                if (C32780e.this.f84102b != null) {
                    C32780e.this.f84102b.mo39841a();
                }
            }
        });
        this.f84101a.setRightClickListener(new AbstractC32753b() {
            /* class com.ss.android.lark.cameraview.C32780e.C327866 */

            @Override // com.ss.android.lark.cameraview.p1588b.AbstractC32753b
            /* renamed from: a */
            public void mo120672a() {
                C32780e.this.f84101a.mo120651g();
            }
        });
        this.f84101a.mo120653i();
        m125819d();
        return inflate;
    }

    /* renamed from: a */
    public static C32780e m125818a(int i, String str, String str2, int i2) {
        C32780e eVar = new C32780e();
        Bundle bundle = new Bundle();
        bundle.putInt("featureSwitch", i);
        bundle.putString("photoPath", str);
        bundle.putString("videoPpath", str2);
        if (i2 <= 0) {
            i2 = HwBuildEx.VersionCodes.CUR_DEVELOPMENT;
        }
        bundle.putInt("maxDuration", i2);
        eVar.setArguments(bundle);
        return eVar;
    }
}
