package com.ss.android.lark.forward.template;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lark.pb.im.v1.ShareAsMessageResponse;
import com.bytedance.lark.pb.im.v1.ShareObject;
import com.bytedance.lark.pb.im.v1.ShareTarget;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.ss.android.lark.forward.C38364a;
import com.ss.android.lark.forward.dto.ForwardTarget;
import com.ss.android.lark.forward.dto.ForwardTemplate;
import com.ss.android.lark.forward.dto.ThreadTarget;
import com.ss.android.lark.forward.dto.template.AbstractC38405a;
import com.ss.android.lark.forward.dto.template.BasicDialogContent;
import com.ss.android.lark.forward.dto.template.ForwardTargetFilter;
import com.ss.android.lark.forward.dto.template.ForwardViewDependency;
import com.ss.android.lark.forward.p1898a.AbstractC38365a;
import com.ss.android.lark.utils.C57881t;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J0\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/forward/template/ShareCopyFileForwardTemplateFactory;", "", "()V", "getExecutor", "Lcom/ss/android/lark/forward/dto/template/IForwardExecutor;", "fileKey", "", "messageId", "getForwardTemplate", "Lcom/ss/android/lark/forward/dto/ForwardTemplate;", "fileName", "size", "", "isFolder", "", "core_forward_forward_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.forward.template.h */
public final class ShareCopyFileForwardTemplateFactory {

    /* renamed from: a */
    public static final ShareCopyFileForwardTemplateFactory f99002a = new ShareCopyFileForwardTemplateFactory();

    private ShareCopyFileForwardTemplateFactory() {
    }

    /* renamed from: a */
    private final AbstractC38405a m151904a(String str, String str2) {
        return new C38517a(str, str2);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00060\u00032\u000e\u0010\u0007\u001a\n \u0005*\u0004\u0018\u00010\b0\b2\u000e\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\n0\nH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "", "targets", "", "Lcom/ss/android/lark/forward/dto/ForwardTarget;", "kotlin.jvm.PlatformType", "", "extra", "Landroid/os/Bundle;", "executeCallback", "Lcom/ss/android/lark/forward/dto/template/IForwardExecutor$OnForwardExecuteCallback;", "onForward"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.forward.template.h$a */
    public static final class C38517a implements AbstractC38405a {

        /* renamed from: a */
        final /* synthetic */ String f99003a;

        /* renamed from: b */
        final /* synthetic */ String f99004b;

        C38517a(String str, String str2) {
            this.f99003a = str;
            this.f99004b = str2;
        }

        @Override // com.ss.android.lark.forward.dto.template.AbstractC38405a
        public final void onForward(List<ForwardTarget> list, final Bundle bundle, final AbstractC38405a.AbstractC38406a aVar) {
            boolean z;
            boolean z2;
            ShareTarget shareTarget;
            List<ForwardTarget> list2 = list;
            boolean z3 = false;
            if (list2 == null || list2.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f99003a.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    if (this.f99004b.length() == 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : list) {
                            Intrinsics.checkExpressionValueIsNotNull(t, "it");
                            if (t.mo140565a() == 2) {
                                ThreadTarget g = t.mo140573g();
                                if (g != null) {
                                    Intrinsics.checkExpressionValueIsNotNull(g, "it.threadTarget ?: return@IForwardExecutor");
                                    shareTarget = new ShareTarget.C18077a().mo62742a(new ShareTarget.Thread(t.mo140567b(), g.getChatId())).build();
                                    Intrinsics.checkExpressionValueIsNotNull(shareTarget, "ShareTarget.Builder().to…, origin.chatId)).build()");
                                } else {
                                    return;
                                }
                            } else {
                                shareTarget = new ShareTarget.C18077a().mo62741a(new ShareTarget.Chat(t.mo140567b())).build();
                                Intrinsics.checkExpressionValueIsNotNull(shareTarget, "ShareTarget.Builder().to…rget.Chat(it.id)).build()");
                            }
                            arrayList.add(shareTarget);
                        }
                        ShareObject a = new ShareObject.C18071a().mo62728a(new ShareObject.FileManagerObject.C18069a().mo62722a(this.f99003a).mo62724b(this.f99004b).build()).build();
                        AbstractC38365a a2 = C38364a.m151054a();
                        Intrinsics.checkExpressionValueIsNotNull(a2, "ForwardModule.getDependency()");
                        a2.mo140442d().mo140477a(a, arrayList, new IGetDataCallback<ShareAsMessageResponse>() {
                            /* class com.ss.android.lark.forward.template.ShareCopyFileForwardTemplateFactory.C38517a.C385181 */

                            /* renamed from: a */
                            public void onSuccess(ShareAsMessageResponse shareAsMessageResponse) {
                                if (shareAsMessageResponse != null) {
                                    m151905b(shareAsMessageResponse);
                                }
                            }

                            @Override // com.larksuite.framework.callback.IGetDataCallback
                            public void onError(ErrorResult errorResult) {
                                Intrinsics.checkParameterIsNotNull(errorResult, "err");
                                if (!TemplateFactoryUtils.f99022a.mo141179a(errorResult)) {
                                    aVar.mo140601a(errorResult.getDisplayMsg(), false);
                                }
                            }

                            /* renamed from: b */
                            private final void m151905b(ShareAsMessageResponse shareAsMessageResponse) {
                                boolean z;
                                boolean z2;
                                boolean z3;
                                String str;
                                boolean z4;
                                boolean z5;
                                boolean z6;
                                String string = bundle.getString("key_param_addition_note");
                                String str2 = string;
                                if (str2 == null || str2.length() == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    List<ShareAsMessageResponse.RespInfo> list = shareAsMessageResponse.resp_info;
                                    if (list == null || list.isEmpty()) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (!z2) {
                                        for (ShareAsMessageResponse.RespInfo respInfo : shareAsMessageResponse.resp_info) {
                                            String str3 = respInfo.message_id;
                                            if (str3 == null || str3.length() == 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (!z3 && respInfo.share_target != null) {
                                                String str4 = null;
                                                if (respInfo.share_target.to_chat != null) {
                                                    str4 = respInfo.share_target.to_chat.chat_id;
                                                    String str5 = respInfo.thread_id;
                                                    if (str5 == null || str5.length() == 0) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (z6) {
                                                        str = respInfo.message_id;
                                                    } else {
                                                        str = respInfo.thread_id;
                                                    }
                                                } else if (respInfo.share_target.to_thread != null) {
                                                    str4 = respInfo.share_target.to_thread.chat_id;
                                                    str = respInfo.share_target.to_thread.thread_id;
                                                } else {
                                                    str = str4;
                                                }
                                                String str6 = str4;
                                                if (str6 == null || str6.length() == 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    String str7 = str;
                                                    if (str7 == null || str7.length() == 0) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    if (!z5) {
                                                        AbstractC38365a a = C38364a.m151054a();
                                                        Intrinsics.checkExpressionValueIsNotNull(a, "ForwardModule.getDependency()");
                                                        a.mo140442d().mo140480a(string, str4, str);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                        aVar.mo140599a(-1, (Intent) null);
                    }
                }
            }
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final ForwardTemplate m151903a(String str, String str2, long j, boolean z, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "fileKey");
        Intrinsics.checkParameterIsNotNull(str2, "fileName");
        Intrinsics.checkParameterIsNotNull(str3, "messageId");
        ForwardTemplate.C38388a aVar = new ForwardTemplate.C38388a();
        BasicDialogContent.C38391a aVar2 = new BasicDialogContent.C38391a();
        aVar2.mo140727a(C57881t.m224615a("", str2, z));
        aVar2.mo140730a(str2);
        aVar2.mo140736c("（" + C26311p.m95262a(j) + "）");
        aVar.mo140615a(new ForwardViewDependency.C38404a().mo140891a(aVar2.mo140732a()).mo140892a(new MessageForwardEnhancedView()).mo140897b());
        aVar.mo140613a(new ForwardTargetFilter.C38400a().mo140845b(false).mo140851g(false).mo140846b());
        ForwardTemplate a = aVar.mo140617a(f99002a.m151904a(str, str3));
        Intrinsics.checkExpressionValueIsNotNull(a, "templateBuilder.build(ge…utor(fileKey, messageId))");
        return a;
    }
}
