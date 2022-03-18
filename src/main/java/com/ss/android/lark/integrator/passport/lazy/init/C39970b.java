package com.ss.android.lark.integrator.passport.lazy.init;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.device.v1.PushDeviceNotifySettingResponse;
import com.bytedance.lark.pb.device.v1.PushDeviceOnlineStatusResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.passport.device.service.impl.C48987c;
import com.ss.android.lark.passport.infra.log.PassportLog;
import com.ss.android.lark.passport.signinsdk_api.base.AbstractC49352d;
import com.ss.android.lark.passport.signinsdk_api.entity.C49369d;
import com.ss.android.lark.passport.signinsdk_api.entity.DevicesStatus;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49399l;
import com.ss.android.lark.passport.signinsdk_api.interfaces.AbstractC49400m;
import com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.io.IOException;
import java.util.List;

/* renamed from: com.ss.android.lark.integrator.passport.lazy.init.b */
public class C39970b implements AbstractC49341a {

    /* renamed from: a */
    private final PassportLog f101674a = PassportLog.f123351c.mo171474a();

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: a */
    public void mo145159a(final AbstractC49352d<Boolean> dVar) {
        C53248k.m205912a().mo181697a(Command.PUSH_DEVICE_NOTIFY_SETTING, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399797 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C39970b.this.mo145166b(bArr, str, z, z2, dVar);
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: b */
    public void mo145165b(final AbstractC49352d<DevicesStatus.DeviceStatus> dVar) {
        C53248k.m205912a().mo181697a(Command.PUSH_DEVICE_ONLINE_STATUS, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399808 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                C39970b.this.mo145164a(bArr, str, z, z2, dVar);
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: c */
    public void mo145167c(final AbstractC49352d<String> dVar) {
        C53248k.m205912a().mo181697a(Command.PUSH_USER_LIST_UPDATE, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399732 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a("");
                }
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: d */
    public void mo145168d(final AbstractC49352d<C49369d> dVar) {
        C53248k.m205912a().mo181697a(Command.PUSH_SESSION_VALIDATING, new C53248k.AbstractC53250a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399743 */

            @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
            public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                AbstractC49352d dVar = dVar;
                if (dVar != null) {
                    dVar.mo145179a(C39969a.m158600a(bArr));
                }
            }
        });
    }

    /* renamed from: a */
    private String m158604a(DevicesStatus.DeviceStatus deviceStatus) {
        Object obj;
        String str = "null";
        if (deviceStatus == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("deviceId:");
        sb.append(deviceStatus.getDeviceId());
        sb.append(", terminalType:");
        if (deviceStatus.getTerminalType() == null) {
            obj = str;
        } else {
            obj = Integer.valueOf(deviceStatus.getTerminalType().getValue());
        }
        sb.append(obj);
        sb.append(", onLineStatus:");
        Object obj2 = str;
        if (deviceStatus.getOnlineStatus() != null) {
            obj2 = Integer.valueOf(deviceStatus.getOnlineStatus().getValue());
        }
        sb.append(obj2);
        return sb.toString();
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: a */
    public void mo145160a(List<AbstractC49399l> list, AbstractC49399l lVar) {
        C53246j.m205911b(list, lVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399786 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_DEVICE_NOTIFY_SETTING);
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: a */
    public void mo145162a(List<AbstractC49400m> list, AbstractC49400m mVar) {
        C53246j.m205911b(list, mVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399775 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_DEVICE_ONLINE_STATUS);
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: a */
    public void mo145161a(List<AbstractC49399l> list, AbstractC49399l lVar, final AbstractC49352d<Boolean> dVar) {
        C53246j.m205910a(list, lVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399711 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_DEVICE_NOTIFY_SETTING, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399711.C399721 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C39970b.this.mo145166b(bArr, str, z, z2, dVar);
                    }
                });
            }
        });
    }

    @Override // com.ss.android.lark.passport.signinsdk_api.p2454b.AbstractC49341a
    /* renamed from: a */
    public void mo145163a(List<AbstractC49400m> list, AbstractC49400m mVar, final AbstractC49352d<DevicesStatus.DeviceStatus> dVar) {
        C53246j.m205910a(list, mVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399754 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_DEVICE_ONLINE_STATUS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.C399754.C399761 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        C39970b.this.mo145164a(bArr, str, z, z2, dVar);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo145166b(byte[] bArr, String str, boolean z, boolean z2, final AbstractC49352d<Boolean> dVar) {
        try {
            final Boolean a = C39969a.m158602a(PushDeviceNotifySettingResponse.ADAPTER.decode(bArr));
            PassportLog passportLog = this.f101674a;
            passportLog.mo171465b("RustPush", "onPushDeviceNotifySetting isNotify:" + a);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.AnonymousClass10 */

                public void run() {
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a(a);
                    }
                }
            });
        } catch (IOException e) {
            this.f101674a.mo171462a("RustPush", " onPushDeviceNotifySetting", e);
        }
    }

    /* renamed from: a */
    public void mo145164a(byte[] bArr, String str, boolean z, boolean z2, final AbstractC49352d<DevicesStatus.DeviceStatus> dVar) {
        try {
            PushDeviceOnlineStatusResponse decode = PushDeviceOnlineStatusResponse.ADAPTER.decode(bArr);
            if (decode == null) {
                decode = null;
            }
            final DevicesStatus.DeviceStatus a = C39969a.m158599a(decode);
            PassportLog passportLog = this.f101674a;
            passportLog.mo171465b("RustPush", "onPushDeviceOnlineStatus device:" + m158604a(a));
            C48987c.m192916a().mo171025a(a);
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.integrator.passport.lazy.init.C39970b.RunnableC399819 */

                public void run() {
                    AbstractC49352d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo145179a(a);
                    }
                }
            });
        } catch (IOException e) {
            this.f101674a.mo171462a("RustPush", " onPushDeviceOnlineStatus", e);
        }
    }
}
