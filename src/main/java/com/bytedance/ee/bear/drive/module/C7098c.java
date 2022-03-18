package com.bytedance.ee.bear.drive.module;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.ee.bear.AbstractC5239d;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.an;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.LocalOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.SpaceFileOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.preview.PreviewAction;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.domain.C6313i;
import com.bytedance.ee.bear.drive.biz.fg.DriveSdkConfig;
import com.bytedance.ee.bear.drive.biz.preview.vc.C6729c;
import com.bytedance.ee.bear.drive.common.p341a.C6887a;
import com.bytedance.ee.bear.drive.core.DriveActivity;
import com.bytedance.ee.bear.drive.core.DriveMainProcActivity;
import com.bytedance.ee.bear.drive.core.fragment.DriveMainFragment;
import com.bytedance.ee.bear.drive.services.AbstractC7184l;
import com.bytedance.ee.bear.drivesdk.PreviewType;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.p397h.AbstractC7825c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.bear.thread.C11678b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p699b.C13595b;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p702e.C13657b;
import com.bytedance.ee.util.p718t.C13748k;
import com.larksuite.suite.R;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.drive.module.c */
public class C7098c implements AbstractC5239d {

    /* renamed from: a */
    private C10929e f19127a;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28419a(Object obj) throws Exception {
    }

    public C7098c() {
        this.f19127a = new C10929e();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m28418a() {
        Toast.showText(C13615c.f35773a, (int) R.string.Drive_Drive_FileSecurityRestrictDownloadActionGeneralMessage);
    }

    public C7098c(C10929e eVar) {
        this.f19127a = eVar;
    }

    @Override // com.bytedance.ee.bear.AbstractC5239d
    /* renamed from: a */
    public Fragment mo21089a(LocalOpenEntity localOpenEntity) {
        C13479a.m54764b("DriveComponent", "DriveSdkWrapper#getLocalPreviewFragment()");
        ArrayList<BaseOpenEntity> arrayList = new ArrayList<>();
        arrayList.add(localOpenEntity);
        return m28416a(arrayList, 0);
    }

    /* renamed from: a */
    private Fragment m28416a(ArrayList<BaseOpenEntity> arrayList, int i) {
        C13479a.m54764b("DriveComponent", "DriveSdkWrapper#openMultiplePreviewV2()");
        al d = C4511g.m18594d();
        an anVar = (an) KoinJavaComponent.m268610a(an.class);
        if (d == null || anVar == null) {
            C13479a.m54758a("DriveComponent", "DriveSdkWrapper#openMultiplePreviewV2() infoProvideService or loginService is null, " + d + " - " + anVar);
            return null;
        }
        try {
            C13479a.m54764b("DriveSdk", "DriveSdkRouter#routeLocalFragment");
            DriveMainFragment bVar = new DriveMainFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("extra_drive_sdk_open_entity", arrayList);
            bundle.putInt("extra_drive_sdk_open_index", i);
            bVar.setArguments(bundle);
            return bVar;
        } catch (Exception e) {
            C13479a.m54759a("DriveSdk", "DriveSdkRouter#routeLocalFragment() error", e);
            return null;
        }
    }

    @Override // com.bytedance.ee.bear.AbstractC5239d
    /* renamed from: a */
    public Fragment mo21090a(String str, Bundle bundle) {
        BearUrl g = C6313i.m25327a().mo25399g(str);
        SpaceFileOpenEntity spaceFileOpenEntity = new SpaceFileOpenEntity(g.f17447b, "");
        spaceFileOpenEntity.setUrl(g.f17450e);
        spaceFileOpenEntity.setOriginUrl(bundle.getString("url"));
        spaceFileOpenEntity.setAppId("56");
        spaceFileOpenEntity.setPreviewFrom(g.f17453h);
        C6729c cVar = null;
        if (bundle != null) {
            String string = bundle.getString("vc_meeting_id");
            boolean z = bundle.getBoolean("vc_refresh");
            if (!TextUtils.isEmpty(string)) {
                C6729c cVar2 = new C6729c(true, null);
                cVar2.mo26478a(string);
                cVar2.mo26479a(z);
                cVar = cVar2;
            }
        }
        return DriveMainFragment.m27490a(spaceFileOpenEntity, cVar, bundle);
    }

    @Override // com.bytedance.ee.bear.AbstractC5239d
    /* renamed from: a */
    public PreviewType mo21091a(String str, String str2) {
        C13479a.m54764b("DriveComponent", "DriveServiceImpl#getDriveSdkPreviewType(), appId=" + str + ", ext=" + str2);
        if (TextUtils.isEmpty(str2)) {
            return PreviewType.UNSUPPORT;
        }
        try {
            ArrayList<Integer> arrayList = DriveSdkConfig.getConfig().getPreviewTranfromsInApp(str).get(str2.toLowerCase());
            if (!C13657b.m55421a(arrayList)) {
                if (arrayList.get(0).intValue() != -2) {
                    if (arrayList.get(0).intValue() != -3) {
                        return PreviewType.TRANFORM;
                    }
                }
                return PreviewType.NATIVE;
            }
        } catch (Throwable th) {
            C13479a.m54759a("DriveComponent", "DriveSdkWrapper#getPreviewType() error=", th);
        }
        return PreviewType.UNSUPPORT;
    }

    @Override // com.bytedance.ee.bear.AbstractC5239d
    /* renamed from: a */
    public void mo21092a(Context context, BaseOpenEntity baseOpenEntity) {
        C13479a.m54764b("DriveComponent", "DriveSdkWrapper#openLocalPreview()");
        ArrayList<? extends BaseOpenEntity> arrayList = new ArrayList<>();
        arrayList.add(baseOpenEntity);
        mo21093a(context, arrayList, 0);
    }

    @Override // com.bytedance.ee.bear.AbstractC5239d
    /* renamed from: a */
    public void mo21094a(String str, PreviewAction previewAction) {
        C13479a.m54764b("DriveComponent", "DriveSdkWrapper#execPreviewAction() uniqueId=" + str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(previewAction);
        this.f19127a.mo41523b(AbstractC7184l.class).mo238004b(C11678b.m48480d()).mo237985a(C11678b.m48480d()).mo238020d(new Function(str, arrayList, previewAction) {
            /* class com.bytedance.ee.bear.drive.module.$$Lambda$c$lkxN3Peyn_Tg7qX7R5F58ixwLqI */
            public final /* synthetic */ String f$0;
            public final /* synthetic */ ArrayList f$1;
            public final /* synthetic */ PreviewAction f$2;

            {
                this.f$0 = r1;
                this.f$1 = r2;
                this.f$2 = r3;
            }

            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                return C7098c.m28417a(this.f$0, this.f$1, this.f$2, (AbstractC7184l) obj);
            }
        }).mo238001b($$Lambda$c$9RpsxES3DdT2mJwPkUUDYG5cEKc.INSTANCE, $$Lambda$c$FvNquKz6xsVGQURoq3fDxQkSoE.INSTANCE);
    }

    /* renamed from: b */
    private void m28421b(Context context, ArrayList<? extends BaseOpenEntity> arrayList, int i) {
        Class cls;
        try {
            Iterator<? extends BaseOpenEntity> it = arrayList.iterator();
            while (it.hasNext()) {
                BaseOpenEntity baseOpenEntity = (BaseOpenEntity) it.next();
                if ((baseOpenEntity.getBizType() == 4 || baseOpenEntity.getBizType() == 2 || baseOpenEntity.getBizType() == 5) && !((AbstractC7825c) KoinJavaComponent.m268610a(AbstractC7825c.class)).mo8425a()) {
                    C13479a.m54764b("DriveComponent", "openPreviewInternal() disable31Feature");
                    C13748k.m55732a($$Lambda$c$TCkQG0PrJmz2RnYsggjZMyIoJlU.INSTANCE);
                    return;
                }
            }
            if (C13595b.m55176a()) {
                cls = DriveMainProcActivity.class;
            } else {
                cls = DriveActivity.class;
            }
            Intent intent = new Intent(context, cls);
            if (context instanceof Application) {
                intent.addFlags(268435456);
            }
            intent.putParcelableArrayListExtra("extra_drive_sdk_open_entity", arrayList);
            intent.putExtra("extra_drive_sdk_open_index", i);
            context.startActivity(intent);
        } catch (Exception e) {
            C13479a.m54759a("DriveComponent", "DriveSdkRouter#route() error", e);
        }
    }

    @Override // com.bytedance.ee.bear.AbstractC5239d
    /* renamed from: a */
    public void mo21093a(Context context, ArrayList<? extends BaseOpenEntity> arrayList, int i) {
        C13479a.m54764b("DriveComponent", "DriveSdkWrapper#openMultiplePreview()");
        al d = C4511g.m18594d();
        an anVar = (an) KoinJavaComponent.m268610a(an.class);
        if (d == null || anVar == null) {
            C13479a.m54758a("DriveComponent", "DriveSdkWrapper#openMultiplePreview() infoProvideService or loginService is null, " + d + " - " + anVar);
            return;
        }
        if (context == null) {
            context = C13615c.f35773a;
        }
        m28421b(context, arrayList, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Object m28417a(String str, ArrayList arrayList, PreviewAction previewAction, AbstractC7184l lVar) throws Exception {
        lVar.execDriveSdkPreviewAction(str, arrayList);
        C6887a.m27207a().mo27121a(new C6887a.C6888a("drivesdk_preview_action", str, previewAction));
        return "";
    }
}
