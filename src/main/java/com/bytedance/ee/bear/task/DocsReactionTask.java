package com.bytedance.ee.bear.task;

import android.app.Application;
import android.content.Context;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.contract.ak;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.p280d.AbstractC5125a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency;
import io.reactivex.functions.Function;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bytedance/ee/bear/task/DocsReactionTask;", "Lcom/bytedance/ee/bear/task/BaseTask;", "()V", "reactionAgent", "Lcom/bytedance/ee/bear/contract/reaction/IReactionAgent;", "getReactionAgent", "()Lcom/bytedance/ee/bear/contract/reaction/IReactionAgent;", "execute", "", "context", "Landroid/content/Context;", "Companion", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class DocsReactionTask extends BaseTask {

    /* renamed from: c */
    public static final Companion f30746c = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/task/DocsReactionTask$Companion;", "", "()V", "TAG", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.task.DocsReactionTask$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final AbstractC5125a N_() {
        return C4511g.m18593c();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"com/bytedance/ee/bear/task/DocsReactionTask$execute$1", "Lcom/ss/android/lark/newemoji/api/LarkEmojiModuleDependency$IEmojiDependency;", "getEmojiImageFromNet", "", "imageKey", "getResMapFromNet", "", HiAnalyticsConstant.HaKey.BI_KEY_VERSION, "", "triggerKeys", "", "isOversea", "", "basesdk_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.task.DocsReactionTask$b */
    public static final class C11432b implements LarkEmojiModuleDependency.IEmojiDependency {

        /* renamed from: a */
        final /* synthetic */ DocsReactionTask f30747a;

        @Override // com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency.IEmojiDependency
        /* renamed from: a */
        public boolean mo43822a() {
            al d = C4511g.m18594d();
            Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
            return d.mo17345F();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C11432b(DocsReactionTask docsReactionTask) {
            this.f30747a = docsReactionTask;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "Lcom/bytedance/ee/bear/contract/HostService;", "apply"}, mo238835k = 3, mv = {1, 1, 15})
        /* renamed from: com.bytedance.ee.bear.task.DocsReactionTask$b$a */
        static final class C11433a<T, R> implements Function<T, R> {

            /* renamed from: a */
            final /* synthetic */ String f30748a;

            C11433a(String str) {
                this.f30748a = str;
            }

            /* renamed from: a */
            public final String apply(ak akVar) {
                Intrinsics.checkParameterIsNotNull(akVar, "it");
                return akVar.getEmojiImageFromNet(this.f30748a);
            }
        }

        @Override // com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency.IEmojiDependency
        /* renamed from: a */
        public String mo43820a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "imageKey");
            C13479a.m54772d("DocsReactionTask", "getEmojiImageFromNet imageKey = " + str);
            Object d = this.f30747a.f30744a.mo41508c(ak.class).mo238020d(new C11433a(str)).mo238023d();
            Intrinsics.checkExpressionValueIsNotNull(d, "mServiceContext.justServ…geKey) }.blockingSingle()");
            return (String) d;
        }

        @Override // com.ss.android.lark.newemoji.api.LarkEmojiModuleDependency.IEmojiDependency
        /* renamed from: a */
        public void mo43821a(int i, List<String> list) {
            C13479a.m54772d("DocsReactionTask", "getResMapFromNet version = " + i + ", triggerKeys = " + list);
            AbstractC5125a N_ = this.f30747a.N_();
            if (N_ != null) {
                N_.mo20284a(i, list);
            }
        }
    }

    @Override // com.bytedance.ee.bear.task.BaseTask, com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        super.mo43817a(context);
        C13479a.m54764b("DocsReactionTask", "init LarkEmojiModuleDependency");
        Application application = C13615c.f35773a;
        Intrinsics.checkExpressionValueIsNotNull(application, "ContextUtils.baseApplication");
        LarkEmojiModuleDependency.m214270a(application, new C11432b(this));
    }
}
