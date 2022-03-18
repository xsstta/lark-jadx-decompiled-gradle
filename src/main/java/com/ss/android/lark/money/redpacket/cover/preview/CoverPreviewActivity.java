package com.ss.android.lark.money.redpacket.cover.preview;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.larksuite.suite.R;
import com.ss.android.lark.base.activity.ActivityAnimationManager;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.image.entity.PassThroughImage;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.cover.RedPacketCoverActivity;
import com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "presenter", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewPresenter;", "viewDependency", "com/ss/android/lark/money/redpacket/cover/preview/CoverPreviewActivity$viewDependency$1", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewActivity$viewDependency$1;", "getEnterAnimationConfig", "Lcom/ss/android/lark/base/activity/ActivityAnimationManager$AnimationConfig;", "getExitAnimationConfig", "initMVP", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class CoverPreviewActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f120995a = new Companion(null);

    /* renamed from: b */
    private CoverPreviewPresenter f120996b;

    /* renamed from: c */
    private final C48060b f120997c = new C48060b(this);

    /* renamed from: a */
    public Context mo168277a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo168278a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo168279a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189684a(this, context);
    }

    /* renamed from: b */
    public void mo168280b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo168281c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189682a(this, configuration);
    }

    public AssetManager getAssets() {
        return m189686c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189683a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189685b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewActivity$Companion;", "", "()V", "REQUEST_CODE_COVER_PREVIEW", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getEnterAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_UP_IN);
    }

    @Override // com.ss.android.lark.base.fragment.BaseFragmentActivity
    public ActivityAnimationManager.AnimationConfig getExitAnimationConfig() {
        return new ActivityAnimationManager.AnimationConfig(ActivityAnimationManager.ANIM_SLIDE_BOTTOM_OUT);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"com/ss/android/lark/money/redpacket/cover/preview/CoverPreviewActivity$viewDependency$1", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView$ViewDependency;", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "getCoverListResponse", "()Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "currentCoverId", "", "getCurrentCoverId", "()J", "finishActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "injectView", "view", "Lcom/ss/android/lark/money/redpacket/cover/preview/CoverPreviewView;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewActivity$b */
    public static final class C48060b extends CoverPreviewView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ CoverPreviewActivity f120998a;

        @Override // com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView.ViewDependency
        /* renamed from: c */
        public void mo168288c() {
            this.f120998a.setResult(0);
            this.f120998a.finish();
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView.ViewDependency
        /* renamed from: a */
        public long mo168284a() {
            Intent intent = this.f120998a.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getLong("extra.cover.id");
            }
            return -1;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView.ViewDependency
        /* renamed from: b */
        public RedPacketCoverListResponse mo168287b() {
            Serializable serializable;
            Intent intent = this.f120998a.getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            Bundle extras = intent.getExtras();
            RedPacketCoverListResponse redPacketCoverListResponse = null;
            if (extras != null) {
                serializable = extras.getSerializable("extra.cover.list.response");
            } else {
                serializable = null;
            }
            if (serializable instanceof RedPacketCoverListResponse) {
                redPacketCoverListResponse = serializable;
            }
            RedPacketCoverListResponse redPacketCoverListResponse2 = redPacketCoverListResponse;
            if (redPacketCoverListResponse2 != null) {
                return redPacketCoverListResponse2;
            }
            return new RedPacketCoverListResponse();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48060b(CoverPreviewActivity coverPreviewActivity) {
            this.f120998a = coverPreviewActivity;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView.ViewDependency
        /* renamed from: a */
        public void mo168286a(CoverPreviewView coverPreviewView) {
            Intrinsics.checkParameterIsNotNull(coverPreviewView, "view");
            ButterKnife.bind(coverPreviewView, this.f120998a);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewView.ViewDependency
        /* renamed from: a */
        public void mo168285a(RedPacketCover redPacketCover) {
            String str;
            Intrinsics.checkParameterIsNotNull(redPacketCover, "cover");
            Bundle bundle = new Bundle();
            bundle.putLong("extra.cover.id", redPacketCover.getId());
            bundle.putString("extra.cover.name", redPacketCover.getName());
            PassThroughImage mainCover = redPacketCover.getMainCover();
            String str2 = null;
            if (mainCover != null) {
                str = mainCover.getImageKey();
            } else {
                str = null;
            }
            bundle.putString("extra.cover.image.key", str);
            PassThroughImage mainCover2 = redPacketCover.getMainCover();
            if (mainCover2 != null) {
                str2 = mainCover2.getFsUnit();
            }
            bundle.putString("extra.cover.fs.unit", str2);
            CoverPreviewActivity coverPreviewActivity = this.f120998a;
            Intent intent = new Intent(this.f120998a, RedPacketCoverActivity.class);
            intent.putExtras(bundle);
            coverPreviewActivity.setResult(-1, intent);
            this.f120998a.finish();
        }
    }

    /* renamed from: d */
    private final void m189687d() {
        CoverPreviewPresenter cVar = new CoverPreviewPresenter(new CoverPreviewModel(), new CoverPreviewView(this, this.f120997c));
        this.f120996b = cVar;
        if (cVar != null) {
            cVar.create();
        }
    }

    /* renamed from: a */
    public static Resources m189683a(CoverPreviewActivity coverPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(coverPreviewActivity);
        }
        return coverPreviewActivity.mo168278a();
    }

    /* renamed from: c */
    public static AssetManager m189686c(CoverPreviewActivity coverPreviewActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(coverPreviewActivity);
        }
        return coverPreviewActivity.mo168281c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.static_black);
        setContentView(R.layout.activity_cover_preview);
        m189687d();
    }

    /* renamed from: b */
    public static void m189685b(CoverPreviewActivity coverPreviewActivity) {
        coverPreviewActivity.mo168280b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            CoverPreviewActivity coverPreviewActivity2 = coverPreviewActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    coverPreviewActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m189684a(CoverPreviewActivity coverPreviewActivity, Context context) {
        coverPreviewActivity.mo168279a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(coverPreviewActivity);
        }
    }

    /* renamed from: a */
    public static Context m189682a(CoverPreviewActivity coverPreviewActivity, Configuration configuration) {
        Context a = coverPreviewActivity.mo168277a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }
}
