package com.ss.android.lark.forward.template;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardFeature;
import com.ss.android.lark.forward.dto.template.ForwardLaunchParam;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J(\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/lark/forward/template/MomentsForwardTemplateFactory;", "", "()V", "EXTRA_KEY_POST_ID", "", "EXTRA_KEY_SHARE_COUNT", "LOG_TAG", "getExecutor", "Lcom/ss/android/lark/forward/dto/template/IForwardExecutor;", "context", "Landroid/content/Context;", "getForwardTemplate", "Lcom/ss/android/lark/forward/dto/ForwardTemplate;", "contentText", "postId", "totalShareCount", "", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.template.d */
public final class MomentsForwardTemplateFactory {

    /* renamed from: a */
    public static final MomentsForwardTemplateFactory f98992a = new MomentsForwardTemplateFactory();

    private MomentsForwardTemplateFactory() {
    }

    /* renamed from: a */
    private final AbstractC38405a m151891a(Context context) {
        return new C38509a(context);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "targets", "", "Lcom/ss/android/lark/forward/dto/ForwardTarget;", "extra", "Landroid/os/Bundle;", "executeCallback", "Lcom/ss/android/lark/forward/dto/template/IForwardExecutor$OnForwardExecuteCallback;", "onForward"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.template.d$a */
    public static final class C38509a implements AbstractC38405a {

        /* renamed from: a */
        final /* synthetic */ Context f98993a;

        C38509a(Context context) {
            this.f98993a = context;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/forward/template/MomentsForwardTemplateFactory$getExecutor$1$callback$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", "response", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
        /* renamed from: com.ss.android.lark.forward.template.d$a$a */
        public static final class C38510a implements IGetDataCallback<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C38509a f98994a;

            /* renamed from: b */
            final /* synthetic */ AbstractC38405a.AbstractC38406a f98995b;

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.larksuite.framework.callback.IGetDataCallback, com.larksuite.framework.callback.IRequestCallback
            public /* synthetic */ void onSuccess(Boolean bool) {
                mo141171a(bool.booleanValue());
            }

            /* renamed from: a */
            public void mo141171a(boolean z) {
                LKUIToast.show(this.f98994a.f98993a, UIUtils.getString(this.f98994a.f98993a, R.string.Lark_Community_Shared));
                this.f98995b.mo140599a(-1, (Intent) null);
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                Log.m165384e("MomentsForwardTemplateFactory", "share fail", errorResult);
                this.f98995b.mo140601a(UIUtils.getString(this.f98994a.f98993a, R.string.Lark_Legacy_ShareFailed), false);
            }

            C38510a(C38509a aVar, AbstractC38405a.AbstractC38406a aVar2) {
                this.f98994a = aVar;
                this.f98995b = aVar2;
            }
        }

        @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
        public final void onForward(List<? extends ForwardTarget> list, Bundle bundle, AbstractC38405a.AbstractC38406a aVar) {
            Intrinsics.checkParameterIsNotNull(list, "targets");
            Intrinsics.checkParameterIsNotNull(bundle, "extra");
            Intrinsics.checkParameterIsNotNull(aVar, "executeCallback");
            List<? extends ForwardTarget> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().mo140567b());
            }
            String string = bundle.getString("key_param_addition_note", "");
            String string2 = bundle.getString("post_id");
            int i = bundle.getInt("share_count");
            C38510a aVar2 = new C38510a(this, aVar);
            AbstractC38365a a = C38364a.m151054a();
            Intrinsics.checkExpressionValueIsNotNull(a, "ForwardModule.getDependency()");
            a.mo140448j().shareMomentsPost(arrayList, string2, i, string, aVar2);
            C38511e.m151893a(true, string2);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final ForwardTemplate m151890a(Context context, String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "contentText");
        Intrinsics.checkParameterIsNotNull(str2, "postId");
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        Bundle bundle = new Bundle();
        bundle.putString("post_id", str2);
        bundle.putInt("share_count", i);
        ForwardTemplate a = aVar.mo140609a(bundle).mo140610a(new ForwardFeature.C38394a().mo140780e(true).mo140773a(new CancelListener(str2)).mo140777b()).mo140613a(new ForwardTargetFilter.C38400a().mo140845b(true).mo140846b()).mo140612a(new ForwardLaunchParam.C38396a().mo140813a(1).mo140814b()).mo140615a(new ForwardViewDependency.C38404a().mo140898c(UIHelper.getString(R.string.Lark_Chat_TopicToolShareTo)).mo140892a(new MessageForwardEnhancedView()).mo140891a(new BasicDialogContent.C38391a().mo140735b(str).mo140732a()).mo140897b()).mo140617a(f98992a.m151891a(context));
        Intrinsics.checkExpressionValueIsNotNull(a, "ForwardTemplate.Builder(…ild(getExecutor(context))");
        return a;
    }
}
