package com.ss.android.lark.helpdesk.kbtopextend;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.universe_design.button.C25717e;
import com.larksuite.component.universe_design.button.UDButton;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.chat.entity.helpdesk.KbTopExtendControl;
import com.ss.android.lark.helpdesk.kbtopextend.KbTopExtendAdapter;
import com.ss.android.lark.helpdesk.kbtopextend.service.KbTopExtendServiceImpl;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.pb.openbanner.ContainerTag;
import com.ss.android.lark.pb.openbanner.OpenBannerResponse;
import com.ss.android.lark.pb.openbanner.TargetType;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J2\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u0004J\u0016\u0010)\u001a\u00020\"2\u0006\u0010'\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020\u0004Jg\u0010+\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010'\u001a\u0004\u0018\u00010\u00042\b\u0010,\u001a\u0004\u0018\u00010\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010(\u001a\u0004\u0018\u00010\u00042\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100¢\u0006\u0002\u00102J\u0016\u00103\u001a\u00020\"2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010'\u001a\u00020*J\u0006\u00104\u001a\u00020\"J\u0006\u00105\u001a\u00020\"R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u00066"}, d2 = {"Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendHandler;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "kbTopExtendAdapter", "Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter;", "getKbTopExtendAdapter", "()Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter;", "setKbTopExtendAdapter", "(Lcom/ss/android/lark/helpdesk/kbtopextend/KbTopExtendAdapter;)V", "kbTopExtendControl", "Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "getKbTopExtendControl", "()Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;", "setKbTopExtendControl", "(Lcom/ss/android/lark/chat/entity/helpdesk/KbTopExtendControl;)V", "kbTopExtendRv", "Landroidx/recyclerview/widget/RecyclerView;", "getKbTopExtendRv", "()Landroidx/recyclerview/widget/RecyclerView;", "setKbTopExtendRv", "(Landroidx/recyclerview/widget/RecyclerView;)V", "postContext", "getPostContext", "setPostContext", "targetId", "getTargetId", "setTargetId", "clearRecycleData", "", "getKbTopExtendData", "targetType", "", "containerTag", "context", "userId", "initRecycleViewData", "Landroid/content/Context;", "kbTopExtendPost", "resourceId", "resourceType", "value", "getCallback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/larksuite/framework/callback/IGetDataCallback;)V", "registerKbTopExtendControl", "registerKbTopExtendPush", "unRegisterKbTopExtendPush", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.helpdesk.kbtopextend.c */
public final class KbTopExtendHandler {

    /* renamed from: a */
    public static String f99685a;

    /* renamed from: b */
    public static final KbTopExtendHandler f99686b = new KbTopExtendHandler();

    /* renamed from: c */
    private static RecyclerView f99687c;

    /* renamed from: d */
    private static String f99688d = "KbTopExtendHandler";

    /* renamed from: e */
    private static String f99689e;

    /* renamed from: f */
    private static KbTopExtendControl f99690f;

    /* renamed from: g */
    private static KbTopExtendAdapter f99691g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendHandler$getKbTopExtendData$1", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "onError", "", "err", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.c$a */
    public static final class C38757a implements IGetDataCallback<OpenBannerResponse> {
        C38757a() {
        }

        @Override // com.larksuite.framework.callback.IGetDataCallback
        public void onError(ErrorResult errorResult) {
            Intrinsics.checkParameterIsNotNull(errorResult, "err");
            String b = KbTopExtendHandler.f99686b.mo142044b();
            Log.m165383e(b, "openBanner push error," + errorResult.getDebugMsg() + ',' + errorResult.getErrorCode());
        }

        /* renamed from: a */
        public void onSuccess(OpenBannerResponse openBannerResponse) {
            List<OpenBannerResponse.Container.Resource> list;
            long j;
            Long l;
            Intrinsics.checkParameterIsNotNull(openBannerResponse, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            KbTopExtendHandler.f99686b.mo142041a(openBannerResponse.mcontext);
            OpenBannerResponse.Container container = openBannerResponse.mcontainer;
            if (container != null) {
                list = container.mresource_list;
            } else {
                list = null;
            }
            KbTopExtendAdapter e = KbTopExtendHandler.f99686b.mo142047e();
            if (e != null) {
                OpenBannerResponse.Container container2 = openBannerResponse.mcontainer;
                if (container2 == null || (l = container2.mtimestamp) == null) {
                    j = -1;
                } else {
                    j = l.longValue();
                }
                TargetType targetType = openBannerResponse.mtarget_type;
                Intrinsics.checkExpressionValueIsNotNull(targetType, "data.mtarget_type");
                int value = targetType.getValue();
                ContainerTag containerTag = openBannerResponse.mcontainer_tag;
                Intrinsics.checkExpressionValueIsNotNull(containerTag, "data.mcontainer_tag");
                e.mo141960a(list, j, value, containerTag.getValue());
                e.mo141959a(KbTopExtendHandler.f99686b.mo142045c());
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/lark/helpdesk/kbtopextend/KbTopExtendHandler$registerKbTopExtendPush$1", "Lcom/ss/android/lark/helpdesk/kbtopextend/service/KbTopExtendServiceImpl$OpenBannerPushListener;", "onReceiveData", "", "openBannerResponse", "Lcom/ss/android/lark/pb/openbanner/OpenBannerResponse;", "im_helpdesk_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.helpdesk.kbtopextend.c$b */
    public static final class C38758b implements KbTopExtendServiceImpl.OpenBannerPushListener {
        C38758b() {
        }

        @Override // com.ss.android.lark.helpdesk.kbtopextend.service.KbTopExtendServiceImpl.OpenBannerPushListener
        /* renamed from: a */
        public void mo141987a(OpenBannerResponse openBannerResponse) {
            List<OpenBannerResponse.Container.Resource> list;
            long j;
            Long l;
            Intrinsics.checkParameterIsNotNull(openBannerResponse, "openBannerResponse");
            if (openBannerResponse.mtarget_id != null && openBannerResponse.mtarget_id.equals(KbTopExtendHandler.f99686b.mo142046d())) {
                OpenBannerResponse.Container container = openBannerResponse.mcontainer;
                if (container != null) {
                    list = container.mresource_list;
                } else {
                    list = null;
                }
                KbTopExtendAdapter e = KbTopExtendHandler.f99686b.mo142047e();
                if (e != null) {
                    OpenBannerResponse.Container container2 = openBannerResponse.mcontainer;
                    if (container2 == null || (l = container2.mtimestamp) == null) {
                        j = -1;
                    } else {
                        j = l.longValue();
                    }
                    TargetType targetType = openBannerResponse.mtarget_type;
                    Intrinsics.checkExpressionValueIsNotNull(targetType, "openBannerResponse.mtarget_type");
                    int value = targetType.getValue();
                    ContainerTag containerTag = openBannerResponse.mcontainer_tag;
                    Intrinsics.checkExpressionValueIsNotNull(containerTag, "openBannerResponse.mcontainer_tag");
                    e.mo141960a(list, j, value, containerTag.getValue());
                }
            }
        }
    }

    private KbTopExtendHandler() {
    }

    /* renamed from: a */
    public final RecyclerView mo142038a() {
        return f99687c;
    }

    /* renamed from: b */
    public final String mo142044b() {
        return f99688d;
    }

    /* renamed from: c */
    public final String mo142045c() {
        return f99689e;
    }

    /* renamed from: e */
    public final KbTopExtendAdapter mo142047e() {
        return f99691g;
    }

    /* renamed from: d */
    public final String mo142046d() {
        String str = f99685a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetId");
        }
        return str;
    }

    /* renamed from: f */
    public final void mo142048f() {
        KbTopExtendServiceImpl.f99668a.mo141984a(new C38758b());
    }

    /* renamed from: g */
    public final void mo142049g() {
        KbTopExtendServiceImpl.f99668a.mo141983a();
        f99690f = null;
        KbTopExtendAdapter aVar = f99691g;
        if (aVar != null) {
            aVar.mo141963c();
        }
        mo142050h();
        f99687c = null;
        f99691g = null;
        Log.m165389i(f99688d, "unRegisterKbTopExtendPush success");
    }

    /* renamed from: h */
    public final void mo142050h() {
        List<OpenBannerResponse.Container.Resource> d;
        KbTopExtendAdapter.KbViewHolder bVar;
        UDButton a;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        KbTopExtendAdapter aVar = f99691g;
        if (!(aVar == null || (d = aVar.mo141964d()) == null)) {
            int i = 0;
            for (T t : d) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RecyclerView recyclerView = f99687c;
                if (recyclerView == null || (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
                    bVar = null;
                } else if (findViewHolderForAdapterPosition != null) {
                    bVar = (KbTopExtendAdapter.KbViewHolder) findViewHolderForAdapterPosition;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.helpdesk.kbtopextend.KbTopExtendAdapter.KbViewHolder");
                }
                Log.m165389i("KbTopExtendAdapter", "hide drawable");
                if (!(bVar == null || (a = bVar.mo141967a()) == null)) {
                    C25717e.m92491a(a, (String) null, 1, (Object) null);
                }
                i = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo142041a(String str) {
        f99689e = str;
    }

    /* renamed from: a */
    public final void mo142040a(KbTopExtendControl aVar, Context context) {
        Intrinsics.checkParameterIsNotNull(aVar, "kbTopExtendControl");
        Intrinsics.checkParameterIsNotNull(context, "context");
        f99690f = aVar;
    }

    /* renamed from: a */
    public final void mo142039a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        f99685a = str;
        f99687c = new RecyclerView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        RecyclerView recyclerView = f99687c;
        if (recyclerView != null) {
            recyclerView.setLayoutParams(layoutParams);
        }
        String str2 = f99685a;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("targetId");
        }
        f99691g = new KbTopExtendAdapter(str2, f99690f);
        C38756b bVar = new C38756b(context, 8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView2 = f99687c;
        if (recyclerView2 != null) {
            recyclerView2.addItemDecoration(bVar);
        }
        RecyclerView recyclerView3 = f99687c;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(linearLayoutManager);
        }
        RecyclerView recyclerView4 = f99687c;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(f99691g);
        }
    }

    /* renamed from: a */
    public final void mo142042a(String str, int i, int i2, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        f99685a = str;
        KbTopExtendServiceImpl.f99668a.mo141985a(str, i, i2, str2, str3, new C38757a());
    }

    /* renamed from: a */
    public final void mo142043a(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, IGetDataCallback<OpenBannerResponse> iGetDataCallback) {
        int i;
        int i2;
        Intrinsics.checkParameterIsNotNull(str, "targetId");
        Intrinsics.checkParameterIsNotNull(iGetDataCallback, "getCallback");
        KbTopExtendServiceImpl aVar = KbTopExtendServiceImpl.f99668a;
        if (num != null) {
            i = num.intValue();
        } else {
            i = TargetType.CHAT.getValue();
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = ContainerTag.ChatFooterBanner.getValue();
        }
        aVar.mo141986a(str, i, i2, str2, str3, str4, str5, str6, iGetDataCallback);
    }
}
