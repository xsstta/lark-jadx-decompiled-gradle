package com.ss.android.lark.platform.network;

import com.bytedance.lark.pb.im.v1.SetPassThroughPushCommandsRequest;
import com.bytedance.lark.pb.im.v1.SetPassThroughPushCommandsResponse;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.lark.pb.improto.Command;
import com.ss.android.lark.sdk.SdkSender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KDeclarationContainer;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/platform/network/PassThroughCommands;", "", "()V", "list", "", "Lcom/ss/android/lark/pb/improto/Command;", "getList", "()Ljava/util/List;", "notifySDK", "", "core-integrator_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.platform.network.g */
public final class PassThroughCommands {

    /* renamed from: a */
    public static final PassThroughCommands f128879a = new PassThroughCommands();

    /* renamed from: b */
    private static final List<Command> f128880b = CollectionsKt.listOf((Object[]) new Command[]{Command.PUSH_BANNER, Command.MM_PUSH_REACTION_INFO, Command.NOTIFY_ENTERPRISE_PHONE, Command.PUSH_AS_SETTING, Command.NOTIFY_VC_TAB_MISSED_CALLS, Command.MM_PUSH_REALTIME_SUBTITLE_SENTENCE, Command.MM_PUSH_SUMMARY_STATUS, Command.MM_PUSH_SUMMARY_CHANGE, Command.MM_PUSH_SUMMARY_CHECK, Command.MOMENTS_PUSH_TAB_NOTIFICATION, Command.OPEN_BANNER_PUSH});

    private PassThroughCommands() {
    }

    /* renamed from: a */
    public final void mo178034a() {
        List<Command> list = f128880b;
        if (!list.isEmpty()) {
            com.bytedance.lark.pb.basic.v1.Command command = com.bytedance.lark.pb.basic.v1.Command.SET_PASS_THROUGH_PUSH_COMMANDS;
            SetPassThroughPushCommandsRequest.C18041a aVar = new SetPassThroughPushCommandsRequest.C18041a();
            List<Command> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getValue()));
            }
            SdkSender.asynSendRequestNonWrap(command, aVar.mo62654a(arrayList), null, new C51868h(new C51867a(SetPassThroughPushCommandsResponse.ADAPTER)));
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012,\u0010\u0003\u001a( \u0002*\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00070\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "Lcom/bytedance/lark/pb/im/v1/SetPassThroughPushCommandsResponse;", "kotlin.jvm.PlatformType", "p1", "", "Lkotlin/ParameterName;", "name", "p0", "invoke"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.platform.network.g$a */
    public static final /* synthetic */ class C51867a extends FunctionReference implements Function1<byte[], SetPassThroughPushCommandsResponse> {
        C51867a(ProtoAdapter protoAdapter) {
            super(1, protoAdapter);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "decode";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.getOrCreateKotlinClass(ProtoAdapter.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "decode([B)Ljava/lang/Object;";
        }

        public final SetPassThroughPushCommandsResponse invoke(byte[] bArr) {
            return (SetPassThroughPushCommandsResponse) ((ProtoAdapter) this.receiver).decode(bArr);
        }
    }
}
