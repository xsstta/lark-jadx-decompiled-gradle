package com.bytedance.ee.bear.task;

import android.content.Context;
import com.bytedance.ee.bear.persistence.PersistenceSharedPreference;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/task/SensitiveLogCheckTask;", "Lcom/bytedance/ee/bear/task/BaseTask;", "()V", "execute", "", "context", "Landroid/content/Context;", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SensitiveLogCheckTask extends BaseTask {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u001c\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J&\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/bytedance/ee/bear/task/SensitiveLogCheckTask$execute$1", "Lcom/bytedance/ee/log/Log$LogHook;", "check", "", "msg", "", "intercept", "tag", "throwable", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.task.SensitiveLogCheckTask$a */
    public static final class C11434a implements C13479a.AbstractC13480a {

        /* renamed from: a */
        final /* synthetic */ boolean f30751a;

        C11434a(boolean z) {
            this.f30751a = z;
        }

        /* renamed from: a */
        private final boolean m47596a(String str) {
            if (str == null || !C13598b.f35750a.matcher(str).find()) {
                return false;
            }
            return true;
        }

        @Override // com.bytedance.ee.log.C13479a.AbstractC13480a
        /* renamed from: a */
        public boolean mo43825a(String str, String str2) {
            if (!this.f30751a || !m47596a(str2)) {
                return false;
            }
            throw new RuntimeException("token is sensitive **** " + str2);
        }

        @Override // com.bytedance.ee.log.C13479a.AbstractC13480a
        /* renamed from: a */
        public boolean mo43826a(String str, String str2, Throwable th) {
            boolean z;
            String str3;
            String str4;
            if (m47596a(str2)) {
                str2 = C13598b.m55191a(str2);
                z = true;
            } else {
                z = false;
            }
            StackTraceElement[] stackTraceElementArr = null;
            if (th != null) {
                str3 = th.getMessage();
            } else {
                str3 = null;
            }
            if (m47596a(str3)) {
                if (th != null) {
                    str4 = th.getMessage();
                } else {
                    str4 = null;
                }
                Throwable th2 = new Throwable(C13598b.m55191a(str4));
                if (th != null) {
                    stackTraceElementArr = th.getStackTrace();
                }
                th2.setStackTrace(stackTraceElementArr);
                th = th2;
                z = true;
            }
            if (z) {
                Log.m165385e("token is sensitive **** " + str, str2, th, true);
            }
            return z;
        }
    }

    @Override // com.bytedance.ee.bear.task.BaseTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        super.mo43817a(context);
        if (new PersistenceSharedPreference("debug_config").getBoolean("sensitive_log_enable", true)) {
            C13479a.m54756a(new C11434a(C26284k.m95185a(context)));
        }
    }
}
