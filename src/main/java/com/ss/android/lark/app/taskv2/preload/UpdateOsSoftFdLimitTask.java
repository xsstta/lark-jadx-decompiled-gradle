package com.ss.android.lark.app.taskv2.preload;

import android.content.Context;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.basic.v1.GetRlimitRequest;
import com.bytedance.lark.pb.basic.v1.GetRlimitResponse;
import com.bytedance.lark.pb.basic.v1.SetRlimitRequest;
import com.bytedance.lark.pb.basic.v1.SetRlimitResponse;
import com.larksuite.framework.launch.task.AsyncLaunchTask;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;

public class UpdateOsSoftFdLimitTask extends AsyncLaunchTask {

    /* renamed from: a */
    public static String f72856a = "UpdateOsSoftFdLimitTask";

    /* renamed from: b */
    public int f72857b;

    /* renamed from: c */
    public int f72858c;

    /* renamed from: g */
    private void m106890g() {
        Log.m165389i(f72856a, "in getCurrentFdLimit");
        SdkSender.syncSend(Command.GET_RLIMIT, new GetRlimitRequest.C14985a(), new SdkSender.IParser<Boolean>() {
            /* class com.ss.android.lark.app.taskv2.preload.UpdateOsSoftFdLimitTask.C290731 */

            /* renamed from: a */
            public Boolean parse(byte[] bArr) throws IOException {
                GetRlimitResponse decode = GetRlimitResponse.ADAPTER.decode(bArr);
                if (decode == null) {
                    Log.m165397w(UpdateOsSoftFdLimitTask.f72856a, "GetRlimitResponse failed");
                    return false;
                }
                UpdateOsSoftFdLimitTask.this.f72857b = decode.rlim_cur.intValue();
                UpdateOsSoftFdLimitTask.this.f72858c = decode.rlim_max.intValue();
                String str = UpdateOsSoftFdLimitTask.f72856a;
                Log.m165379d(str, "get CurSoftFdLimit is " + UpdateOsSoftFdLimitTask.this.f72857b + ", HardFdLimit is " + UpdateOsSoftFdLimitTask.this.f72858c);
                return true;
            }
        });
    }

    /* renamed from: h */
    private void m106891h() {
        Log.m165389i(f72856a, "in adjustFdLimit");
        int i = this.f72857b;
        int i2 = this.f72858c;
        if (i != i2 && i <= i2) {
            this.f72857b = i2 - 1;
            SetRlimitRequest.C15278a b = new SetRlimitRequest.C15278a().mo55599a(Integer.valueOf(this.f72858c)).mo55601b(Integer.valueOf(this.f72858c));
            String str = f72856a;
            Log.m165379d(str, "set CurSoftFdLimit is " + this.f72857b + ", HardFdLimit is " + this.f72858c);
            SdkSender.syncSend(Command.SET_RLIMIT, b, new SdkSender.IParser<Boolean>() {
                /* class com.ss.android.lark.app.taskv2.preload.UpdateOsSoftFdLimitTask.C290742 */

                /* renamed from: a */
                public Boolean parse(byte[] bArr) throws IOException {
                    if (SetRlimitResponse.ADAPTER.decode(bArr) == null) {
                        Log.m165397w(UpdateOsSoftFdLimitTask.f72856a, "SetRlimitResponse failed");
                        return false;
                    }
                    Log.m165379d(UpdateOsSoftFdLimitTask.f72856a, "SetRlimitResponse success");
                    return true;
                }
            });
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        if (C37239a.m146648b().mo136952a("lark.feed.optimization.enable_update_os_soft_fd_limit_task", false)) {
            Log.m165389i(f72856a, "begin execute ");
            m106890g();
            m106891h();
        }
    }
}
