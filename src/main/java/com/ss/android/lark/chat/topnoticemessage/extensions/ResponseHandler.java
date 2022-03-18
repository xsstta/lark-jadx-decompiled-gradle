package com.ss.android.lark.chat.topnoticemessage.extensions;

import com.google.firebase.messaging.Constants;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.rucket.job.base.RucketResult;
import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJJ\u0010\t\u001a\u00020\u0007\"\u0004\b\u0000\u0010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u0011H\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00070\u0005H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/chat/topnoticemessage/extensions/ResponseHandler;", "", "TAG", "", "onErrorAction", "Lkotlin/Function1;", "Lcom/larksuite/framework/callback/Entity/ErrorResult;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "invoke", "D", "tag", "resp", "Lcom/larksuite/rucket/job/base/RucketResult;", "action", "Lkotlin/ParameterName;", "name", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.topnoticemessage.c.c */
public final class ResponseHandler {

    /* renamed from: a */
    private final String f88630a;

    /* renamed from: b */
    private final Function1<ErrorResult, Unit> f88631b;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.larksuite.framework.callback.Entity.ErrorResult, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ResponseHandler(String str, Function1<? super ErrorResult, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "TAG");
        Intrinsics.checkParameterIsNotNull(function1, "onErrorAction");
        this.f88630a = str;
        this.f88631b = function1;
    }

    /* renamed from: a */
    public final <D> void mo126890a(String str, RucketResult<? extends D> bVar, Function1<? super D, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(str, "tag");
        Intrinsics.checkParameterIsNotNull(bVar, "resp");
        Intrinsics.checkParameterIsNotNull(function1, "action");
        if (bVar instanceof RucketResult.Error) {
            String str2 = this.f88630a;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error: ");
            RucketResult.Error bVar2 = (RucketResult.Error) bVar;
            sb.append(bVar2.mo93493c());
            Log.m165389i(str2, sb.toString());
            this.f88631b.invoke(bVar2.mo93493c());
            return;
        }
        function1.invoke((Object) bVar.mo93490a());
    }
}
