package com.ss.android.lark.chat.service.impl;

import android.widget.ImageView;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.im.v1.CreateReactionRequest;
import com.bytedance.lark.pb.im.v1.DeleteReactionRequest;
import com.bytedance.lark.pb.im.v1.GetUsedReactionsRequest;
import com.bytedance.lark.pb.im.v1.GetUsedReactionsResponse;
import com.bytedance.lark.pb.im.v1.GetUserReactionsRequest;
import com.bytedance.lark.pb.im.v1.GetUserReactionsResponse;
import com.huawei.hms.android.HwBuildEx;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.squareup.wire.Message;
import com.ss.android.lark.C29990c;
import com.ss.android.lark.chat.api.service.AbstractC32906j;
import com.ss.android.lark.dependency.AbstractC36472f;
import com.ss.android.lark.pb.reactions.UpdateUserRecentlyUsedReactionRequest;
import com.ss.android.lark.reaction.p2557b.C52977a;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.chat.service.impl.aa */
public class C34146aa implements AbstractC32906j {

    /* renamed from: a */
    private static String f88386a = "ReactionService";

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.chat.service.impl.aa$a */
    public static final class C34153a {

        /* renamed from: a */
        public static final C34146aa f88400a = new C34146aa(null);
    }

    public static /* synthetic */ Integer lambda$0CtJfBgBoIA_QD5Pttibea8DQX8(byte[] bArr) {
        return 1;
    }

    private C34146aa() {
    }

    /* renamed from: b */
    public static AbstractC32906j m132620b() {
        return C34153a.f88400a;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32906j
    /* renamed from: a */
    public List<String> mo121405a() {
        return (List) SdkSender.syncSend(Command.GET_USED_REACTIONS, new GetUsedReactionsRequest.C17759a(), $$Lambda$aa$sIi7diMRwGIAEA0QIsTdY7Oad4.INSTANCE);
    }

    /* synthetic */ C34146aa(C341471 r1) {
        this();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ List m132619a(byte[] bArr) throws IOException {
        return GetUsedReactionsResponse.ADAPTER.decode(bArr).keys;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.lark.chat.service.impl.aa$1 */
    public class C341471 implements ObservableOnSubscribe<Integer> {

        /* renamed from: a */
        final /* synthetic */ String f88387a;

        /* renamed from: b */
        final /* synthetic */ String f88388b;

        /* renamed from: c */
        final /* synthetic */ C34146aa f88389c;

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [io.reactivex.ObservableEmitter] */
        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(final ObservableEmitter<Integer> observableEmitter) throws Exception {
            final C341481 r0 = new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.chat.service.impl.C34146aa.C341471.C341481 */

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    observableEmitter.onNext(num);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    observableEmitter.onError(errorResult);
                }
            };
            SdkSender.asynSendRequestNonWrap(Command.CREATE_REACTION, new CreateReactionRequest.C17378a().mo60998a(this.f88387a).mo61000b(this.f88388b), new IGetDataCallback<Integer>() {
                /* class com.ss.android.lark.chat.service.impl.C34146aa.C341471.C341492 */

                /* renamed from: a */
                public void onSuccess(Integer num) {
                    C341471.this.f88389c.mo121408a(C341471.this.f88388b, r0);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    C341471.this.f88389c.mo121408a(C341471.this.f88388b, r0);
                }
            }, new SdkSender.IParser<Integer>() {
                /* class com.ss.android.lark.chat.service.impl.C34146aa.C341471.C341503 */

                /* renamed from: a */
                public Integer parse(byte[] bArr) throws IOException {
                    return 1;
                }
            });
        }
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32906j
    /* renamed from: a */
    public List<String> mo121406a(boolean z) {
        GetUserReactionsRequest.C17763a aVar = new GetUserReactionsRequest.C17763a();
        aVar.mo61974a(Boolean.valueOf(z));
        return (List) SdkSender.sendRequest(Command.GET_REACTIONS, aVar, $$Lambda$aa$q2MzPkjomSdv8xBuV1wldWdNz5w.INSTANCE, HwBuildEx.VersionCodes.CUR_DEVELOPMENT, C53234a.m205877a());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ List m132621b(byte[] bArr) throws IOException {
        GetUserReactionsResponse decode = GetUserReactionsResponse.ADAPTER.decode(bArr);
        ArrayList arrayList = new ArrayList();
        if (decode.user_reactions == null) {
            return arrayList;
        }
        List<String> list = decode.user_reactions.keys;
        if (CollectionUtils.isNotEmpty(list)) {
            for (String str : list) {
                arrayList.add(str);
            }
        }
        List<String> list2 = decode.user_reactions.extra_keys;
        if (CollectionUtils.isNotEmpty(list2)) {
            for (String str2 : list2) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32906j
    /* renamed from: a */
    public void mo121407a(ImageView imageView, String str) {
        C52977a.m205190a().mo180995a(imageView, str);
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32906j
    /* renamed from: a */
    public void mo121408a(String str, IGetDataCallback<Integer> iGetDataCallback) {
        SdkSender.sendPassThroughRequest(com.ss.android.lark.pb.improto.Command.UPDATE_USER_RECENTLY_USED_EMOJI, new UpdateUserRecentlyUsedReactionRequest.C50000a().mo173800a(str), iGetDataCallback, new SdkSender.IParser<Integer>() {
            /* class com.ss.android.lark.chat.service.impl.C34146aa.C341523 */

            /* renamed from: a */
            public Integer parse(byte[] bArr) throws IOException {
                return 1;
            }
        });
    }

    @Override // com.ss.android.lark.chat.api.service.AbstractC32906j
    /* renamed from: a */
    public void mo121409a(String str, final String str2, final boolean z, final IGetDataCallback<Integer> iGetDataCallback) {
        Message.Builder builder;
        Command command;
        AbstractC36472f C = C29990c.m110930b().mo134504C();
        if (C != null) {
            C.mo134493a(z, str2);
        }
        if (z) {
            command = Command.DELETE_REACTION;
            builder = new DeleteReactionRequest.C17424a().mo61123a(str).mo61125b(str2);
        } else {
            command = Command.CREATE_REACTION;
            builder = new CreateReactionRequest.C17378a().mo60998a(str).mo61000b(str2);
        }
        SdkSender.asynSendRequestNonWrap(command, builder, new IGetDataCallback<Integer>() {
            /* class com.ss.android.lark.chat.service.impl.C34146aa.C341512 */

            /* renamed from: a */
            public void onSuccess(Integer num) {
                if (!z) {
                    C34146aa.this.mo121408a(str2, iGetDataCallback);
                    return;
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onSuccess(num);
                }
            }

            @Override // com.larksuite.framework.callback.IGetDataCallback
            public void onError(ErrorResult errorResult) {
                if (!z) {
                    C34146aa.this.mo121408a(str2, iGetDataCallback);
                    return;
                }
                IGetDataCallback iGetDataCallback = iGetDataCallback;
                if (iGetDataCallback != null) {
                    iGetDataCallback.onError(errorResult);
                }
            }
        }, $$Lambda$aa$0CtJfBgBoIA_QD5Pttibea8DQX8.INSTANCE);
    }
}
