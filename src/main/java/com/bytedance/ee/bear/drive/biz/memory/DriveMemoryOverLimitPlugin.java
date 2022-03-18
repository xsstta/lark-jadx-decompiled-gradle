package com.bytedance.ee.bear.drive.biz.memory;

import androidx.lifecycle.AbstractC1178x;
import com.bytedance.ee.bear.browser.plugin.BasePlugin;
import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseOpenEntity;
import com.bytedance.ee.bear.contract.drive.sdk.entity.open.BaseSpaceOpenEntity;
import com.bytedance.ee.bear.drive.common.p342b.C6891a;
import com.bytedance.ee.bear.drive.core.DrivePluginHost;
import com.bytedance.ee.bear.quoto.AbstractC10575k;
import com.bytedance.ee.bear.quoto.FullQuotoConfig;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/memory/DriveMemoryOverLimitPlugin;", "Lcom/bytedance/ee/bear/browser/plugin/BasePlugin;", "Lcom/bytedance/ee/bear/drive/core/DrivePluginHost;", "()V", "onAttachToHost", "", "host", "onDetachFromHost", "Companion", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DriveMemoryOverLimitPlugin extends BasePlugin<DrivePluginHost> {
    public static final Companion Companion = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/drive/biz/memory/DriveMemoryOverLimitPlugin$Companion;", "", "()V", "TAG", "", "drive-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.memory.DriveMemoryOverLimitPlugin$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public void onDetachFromHost(DrivePluginHost aVar) {
        super.onDetachFromHost((C4943e) aVar);
    }

    public void onAttachToHost(DrivePluginHost aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "host");
        super.onAttachToHost((C4943e) aVar);
        C6891a.m27236d(aVar).liveInnerMemoryOverLimit().mo5923a(getLifecycleOwner(), new C6503b(this, aVar));
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "onChanged", "(Ljava/lang/Integer;)V"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.drive.biz.memory.DriveMemoryOverLimitPlugin$b */
    public static final class C6503b<T> implements AbstractC1178x<Integer> {

        /* renamed from: a */
        final /* synthetic */ DriveMemoryOverLimitPlugin f17930a;

        /* renamed from: b */
        final /* synthetic */ DrivePluginHost f17931b;

        C6503b(DriveMemoryOverLimitPlugin driveMemoryOverLimitPlugin, DrivePluginHost aVar) {
            this.f17930a = driveMemoryOverLimitPlugin;
            this.f17931b = aVar;
        }

        /* renamed from: a */
        public final void onChanged(Integer num) {
            C13479a.m54764b("DriveMemoryOverLimitPlugin", "memory over limit: " + num);
            if (this.f17931b.mo27261l().getOpenEntity() instanceof BaseSpaceOpenEntity) {
                BaseOpenEntity openEntity = this.f17931b.mo27261l().getOpenEntity();
                Intrinsics.checkExpressionValueIsNotNull(openEntity, "host.driveViewModel.openEntity");
                String fileId = openEntity.getFileId();
                if (num != null && num.intValue() == 90001061) {
                    ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40013a(this.f17930a.getActivity(), fileId, "explorer", false);
                } else if (num != null && num.intValue() == 11001) {
                    ((AbstractC10575k) KoinJavaComponent.m268613a(AbstractC10575k.class, null, null, 6, null)).mo40012a(this.f17930a.getActivity(), FullQuotoConfig.SAVE_TO_WPS);
                }
            }
        }
    }
}
