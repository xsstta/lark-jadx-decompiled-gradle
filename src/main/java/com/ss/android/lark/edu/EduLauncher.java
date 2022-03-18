package com.ss.android.lark.edu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lark.pb.im.v1.EduJoinChatResponse;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.edu.creategroup.primarypage.CreateEduGroupActivity;
import com.ss.android.lark.edu.creategroup.secondarypage.CreateGroupDetailActivity;
import com.ss.android.lark.edu.dto.ClassInfo;
import com.ss.android.lark.edu.p1822a.AbstractC36920a;
import com.ss.android.lark.edu.service.EduService;
import com.ss.android.lark.edu.util.ErrorHandler;
import com.ss.android.lark.sdk.SdkSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/edu/EduLauncher;", "", "()V", "enterCreateEduGroupDetailActivity", "", "ctx", "Landroid/content/Context;", "classInfo", "Lcom/ss/android/lark/edu/dto/ClassInfo;", "joinEduGroupChat", "context", "chatId", "", "classId", "startCreateEduGroupActivity", "features_edu_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.edu.a */
public final class EduLauncher {

    /* renamed from: a */
    public static final EduLauncher f94914a = new EduLauncher();

    private EduLauncher() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.lark.edu.a$a */
    static final class RunnableC36917a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f94915a;

        /* renamed from: b */
        final /* synthetic */ Context f94916b;

        /* renamed from: c */
        final /* synthetic */ String f94917c;

        RunnableC36917a(String str, Context context, String str2) {
            this.f94915a = str;
            this.f94916b = context;
            this.f94917c = str2;
        }

        public final void run() {
            Chat a;
            boolean z;
            AbstractC36920a b = EduModule.f94921b.mo136305b();
            if (b != null && (a = b.mo136298a(this.f94915a)) != null) {
                if (a.isMember()) {
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.edu.EduLauncher.RunnableC36917a.RunnableC369181 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC36917a f94918a;

                        {
                            this.f94918a = r1;
                        }

                        public final void run() {
                            AbstractC36920a b = EduModule.f94921b.mo136305b();
                            if (b != null) {
                                b.mo136300a(this.f94918a.f94916b, this.f94918a.f94915a);
                            }
                        }
                    });
                    return;
                }
                SdkSender.C53233d<EduJoinChatResponse> b2 = EduService.f94922a.mo136309b(this.f94915a, this.f94917c);
                if (b2.f131572a != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    UICallbackExecutor.execute(new Runnable(this) {
                        /* class com.ss.android.lark.edu.EduLauncher.RunnableC36917a.RunnableC369192 */

                        /* renamed from: a */
                        final /* synthetic */ RunnableC36917a f94919a;

                        {
                            this.f94919a = r1;
                        }

                        public final void run() {
                            AbstractC36920a b = EduModule.f94921b.mo136305b();
                            if (b != null) {
                                b.mo136300a(this.f94919a.f94916b, this.f94919a.f94915a);
                            }
                        }
                    });
                    return;
                }
                String string = this.f94916b.getString(R.string.Lark_Education_JoinGroupFailedToast);
                Intrinsics.checkExpressionValueIsNotNull(string, "context.getString(R.stri…ion_JoinGroupFailedToast)");
                ErrorHandler cVar = ErrorHandler.f95004a;
                ErrorResult errorResult = b2.f131573b;
                Intrinsics.checkExpressionValueIsNotNull(errorResult, "result.error");
                LKUIToast.show(this.f94916b, cVar.mo136386a(errorResult, this.f94916b, string));
            }
        }
    }

    /* renamed from: a */
    public final void mo136292a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        context.startActivity(new Intent(context, CreateEduGroupActivity.class));
    }

    /* renamed from: a */
    public final void mo136293a(Context context, ClassInfo classInfo) {
        Intrinsics.checkParameterIsNotNull(context, "ctx");
        Intrinsics.checkParameterIsNotNull(classInfo, "classInfo");
        Intent intent = new Intent(context, CreateGroupDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_class_info", classInfo);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo136294a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        Intrinsics.checkParameterIsNotNull(str2, "classId");
        CoreThreadPool coreThreadPool = CoreThreadPool.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(coreThreadPool, "CoreThreadPool.getDefault()");
        coreThreadPool.getCachedThreadPool().execute(new RunnableC36917a(str, context, str2));
    }
}
