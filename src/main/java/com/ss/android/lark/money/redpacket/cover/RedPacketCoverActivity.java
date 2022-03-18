package com.ss.android.lark.money.redpacket.cover;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.base.fragment.BaseFragmentActivity;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.chat.entity.redpacket.RedPacketCover;
import com.ss.android.lark.dfcore.DynamicFeatureCore;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.money.redpacket.cover.RedPacketCoverView;
import com.ss.android.lark.money.redpacket.cover.preview.CoverPreviewActivity;
import com.ss.android.lark.money.redpacket.dto.RedPacketCoverListResponse;
import com.ss.android.lark.money.redpacket.send.SendRedPacketActivity;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.C57824f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH\u0002J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\tH\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverActivity;", "Lcom/ss/android/lark/base/fragment/BaseFragmentActivity;", "()V", "presenter", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverPresenter;", "viewDependency", "com/ss/android/lark/money/redpacket/cover/RedPacketCoverActivity$viewDependency$1", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverActivity$viewDependency$1;", "initMVP", "", "onActivityResult", "requestCode", "", "resultCode", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Companion", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
public final class RedPacketCoverActivity extends BaseFragmentActivity {

    /* renamed from: a */
    public static final Companion f120962a = new Companion(null);

    /* renamed from: b */
    private RedPacketCoverPresenter f120963b;

    /* renamed from: c */
    private final C48053b f120964c = new C48053b(this);

    /* renamed from: a */
    public Context mo168245a(Configuration configuration) {
        return super.createConfigurationContext(configuration);
    }

    /* renamed from: a */
    public Resources mo168246a() {
        return super.getResources();
    }

    /* renamed from: a */
    public void mo168247a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void attachBaseContext(Context context) {
        m189635a(this, context);
    }

    /* renamed from: b */
    public void mo168248b() {
        super.onStop();
    }

    /* renamed from: c */
    public AssetManager mo168249c() {
        return super.getAssets();
    }

    public Context createConfigurationContext(Configuration configuration) {
        return m189633a(this, configuration);
    }

    public AssetManager getAssets() {
        return m189637c(this);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, com.larksuite.component.air.AirActivity
    public Resources getResources() {
        return m189634a(this);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onStop() {
        m189636b(this);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverActivity$Companion;", "", "()V", "EXTRA_COVER_FS_UNIT", "", "EXTRA_COVER_ID", "EXTRA_COVER_IMAGE_KEY", "EXTRA_COVER_LIST_RESPONSE", "EXTRA_COVER_NAME", "REQUEST_CODE_RED_PACKET_COVER", "", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.RedPacketCoverActivity$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onDestroy() {
        RedPacketCoverPresenter eVar = this.f120963b;
        if (eVar != null) {
            eVar.destroy();
        }
        super.onDestroy();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"com/ss/android/lark/money/redpacket/cover/RedPacketCoverActivity$viewDependency$1", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView$ViewDependency;", "currentCoverId", "", "getCurrentCoverId", "()J", "goToCoverPreviewActivity", "", "cover", "Lcom/ss/android/lark/chat/entity/redpacket/RedPacketCover;", "coverListResponse", "Lcom/ss/android/lark/money/redpacket/dto/RedPacketCoverListResponse;", "injectView", "view", "Lcom/ss/android/lark/money/redpacket/cover/RedPacketCoverView;", "im_money_money_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.money.redpacket.cover.RedPacketCoverActivity$b */
    public static final class C48053b extends RedPacketCoverView.ViewDependency {

        /* renamed from: a */
        final /* synthetic */ RedPacketCoverActivity f120965a;

        @Override // com.ss.android.lark.money.redpacket.cover.RedPacketCoverView.ViewDependency
        /* renamed from: a */
        public long mo168252a() {
            Intent intent = this.f120965a.getIntent();
            if (intent != null) {
                return intent.getLongExtra("extra.cover.id", -1);
            }
            return -1;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C48053b(RedPacketCoverActivity redPacketCoverActivity) {
            this.f120965a = redPacketCoverActivity;
        }

        @Override // com.ss.android.lark.money.redpacket.cover.RedPacketCoverView.ViewDependency
        /* renamed from: a */
        public void mo168254a(RedPacketCoverView redPacketCoverView) {
            Intrinsics.checkParameterIsNotNull(redPacketCoverView, "view");
            ButterKnife.bind(redPacketCoverView, this.f120965a);
        }

        @Override // com.ss.android.lark.money.redpacket.cover.RedPacketCoverView.ViewDependency
        /* renamed from: a */
        public void mo168253a(RedPacketCover redPacketCover, RedPacketCoverListResponse redPacketCoverListResponse) {
            Intrinsics.checkParameterIsNotNull(redPacketCover, "cover");
            Intrinsics.checkParameterIsNotNull(redPacketCoverListResponse, "coverListResponse");
            Bundle bundle = new Bundle();
            bundle.putLong("extra.cover.id", redPacketCover.getId());
            bundle.putSerializable("extra.cover.list.response", redPacketCoverListResponse);
            Intent intent = new Intent(this.f120965a, CoverPreviewActivity.class);
            intent.putExtras(bundle);
            this.f120965a.startActivityForResult(intent, 28257);
        }
    }

    /* renamed from: d */
    private final void m189638d() {
        RedPacketCoverPresenter eVar = new RedPacketCoverPresenter(new RedPacketCoverModel(), new RedPacketCoverView(this, this.f120964c));
        this.f120963b = eVar;
        if (eVar != null) {
            eVar.create();
        }
    }

    /* renamed from: a */
    public static Resources m189634a(RedPacketCoverActivity redPacketCoverActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketCoverActivity);
        }
        return redPacketCoverActivity.mo168246a();
    }

    /* renamed from: c */
    public static AssetManager m189637c(RedPacketCoverActivity redPacketCoverActivity) {
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketCoverActivity);
        }
        return redPacketCoverActivity.mo168249c();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.larksuite.component.air.AirActivity, com.ss.android.lark.base.fragment.BaseFragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBarColorResource(R.color.function_danger_500);
        setContentView(R.layout.activity_red_packet_cover);
        m189638d();
    }

    /* renamed from: b */
    public static void m189636b(RedPacketCoverActivity redPacketCoverActivity) {
        redPacketCoverActivity.mo168248b();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            RedPacketCoverActivity redPacketCoverActivity2 = redPacketCoverActivity;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    redPacketCoverActivity2.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m189635a(RedPacketCoverActivity redPacketCoverActivity, Context context) {
        redPacketCoverActivity.mo168247a(context);
        if (C57824f.m224469c()) {
            DynamicFeatureCore.ensureSplitCompatInstallActivity(redPacketCoverActivity);
        }
    }

    /* renamed from: a */
    public static Context m189633a(RedPacketCoverActivity redPacketCoverActivity, Configuration configuration) {
        Context a = redPacketCoverActivity.mo168245a(configuration);
        ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getLocaleWatcher().mo105895a("lancet_hook_create_configuration", a);
        Log.m165389i("LanguageHooker", "hook createConfigurationContext");
        return ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).updateContextForLanguage(a);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        Long l;
        String str;
        String str2;
        if (i2 == -1) {
            if (i != 28257) {
                super.onActivityResult(i, i2, intent);
                return;
            }
            Intent intent2 = new Intent(getApplicationContext(), SendRedPacketActivity.class);
            String str3 = null;
            if (intent != null) {
                l = Long.valueOf(intent.getLongExtra("extra.cover.id", -1));
            } else {
                l = null;
            }
            intent2.putExtra("extra.cover.id", l);
            if (intent != null) {
                str = intent.getStringExtra("extra.cover.name");
            } else {
                str = null;
            }
            intent2.putExtra("extra.cover.name", str);
            if (intent != null) {
                str2 = intent.getStringExtra("extra.cover.image.key");
            } else {
                str2 = null;
            }
            intent2.putExtra("extra.cover.image.key", str2);
            if (intent != null) {
                str3 = intent.getStringExtra("extra.cover.fs.unit");
            }
            intent2.putExtra("extra.cover.fs.unit", str3);
            setResult(-1, intent2);
            finish();
        }
    }
}
