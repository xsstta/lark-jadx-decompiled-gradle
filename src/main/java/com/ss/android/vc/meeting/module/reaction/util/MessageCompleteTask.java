package com.ss.android.vc.meeting.module.reaction.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.response.ak;
import com.ss.android.vc.meeting.module.reaction.entity.InteractionMessage;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.VCSettingsService;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.p3457e.C68296b;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001$B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u0018\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u0014\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u001eH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J.\u0010 \u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\rJ\u000e\u0010#\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/util/MessageCompleteTask;", "", "consumer", "Lcom/ss/android/vc/meeting/module/reaction/util/MessageCompleteTask$MessageConsumer;", "(Lcom/ss/android/vc/meeting/module/reaction/util/MessageCompleteTask$MessageConsumer;)V", "PAGE_SIZE", "", "RETRY_INTERVAL", "", "TAG", "", "THROTTLE_INTERVAL", "isRunning", "", "requestCount", "requestDisposable", "Lio/reactivex/disposables/Disposable;", "requestPosition", "requestSubject", "Lio/reactivex/subjects/PublishSubject;", "requestTimes", "taskDisposable", "cancel", "", "execute", "meetingId", "getDelayInterval", "position", "count", "getFirstHoleDesc", "Lkotlin/Pair;", "getRetryInterval", "pullLatestInterationMessages", "isPrevious", "isPullMissingMessage", "pullMissingMessage", "MessageConsumer", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.reaction.b.b */
public final class MessageCompleteTask {

    /* renamed from: a */
    public final String f157977a = "MessageCompleteTask";

    /* renamed from: b */
    public boolean f157978b;

    /* renamed from: c */
    public int f157979c = -1;

    /* renamed from: d */
    public int f157980d;

    /* renamed from: e */
    public Disposable f157981e;

    /* renamed from: f */
    public final MessageConsumer f157982f;

    /* renamed from: g */
    private final int f157983g = 30;

    /* renamed from: h */
    private final long f157984h = 1000;

    /* renamed from: i */
    private final long f157985i = 5000;

    /* renamed from: j */
    private int f157986j;

    /* renamed from: k */
    private C68296b<String> f157987k;

    /* renamed from: l */
    private Disposable f157988l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H&J\u001e\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/vc/meeting/module/reaction/util/MessageCompleteTask$MessageConsumer;", "", "getPositionSet", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "onMessage", "", "messages", "", "Lcom/ss/android/vc/meeting/module/reaction/entity/InteractionMessage;", "isPrevious", "", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b.b$a */
    public interface MessageConsumer {
        /* renamed from: a */
        void mo213403a(List<InteractionMessage> list, boolean z);

        /* renamed from: r */
        HashSet<Integer> mo213408r();
    }

    /* renamed from: a */
    public final void mo216882a() {
        Disposable disposable = this.f157981e;
        if (disposable != null) {
            disposable.dispose();
        }
        this.f157988l.dispose();
    }

    /* renamed from: c */
    private final long m245786c() {
        JsonObject asJsonObject;
        try {
            JsonElement parse = new JsonParser().parse(VCSettingsService.getSettings("vc_retry_interval"));
            if (!(parse == null || (asJsonObject = parse.getAsJsonObject()) == null)) {
                JsonElement jsonElement = asJsonObject.get("im_message_complete");
                if (jsonElement != null) {
                    return jsonElement.getAsLong();
                }
                return this.f157985i;
            }
        } catch (Exception unused) {
        }
        return this.f157985i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> mo216884b() {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.reaction.util.MessageCompleteTask.mo216884b():kotlin.Pair");
    }

    /* renamed from: b */
    public final void mo216885b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        this.f157987k.onNext(str);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "", "", "id", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b.b$b */
    public static final class C62796b<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ MessageCompleteTask f157990a;

        C62796b(MessageCompleteTask bVar) {
            this.f157990a = bVar;
        }

        /* renamed from: a */
        public final Triple<Integer, Integer, String> apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "id");
            Pair<Integer, Integer> b = this.f157990a.mo216884b();
            return new Triple<>(b.getFirst(), b.getSecond(), str);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "triple", "Lkotlin/Triple;", "", "", "test"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b.b$c */
    public static final class C62797c<T> implements AbstractC68322n<Triple<? extends Integer, ? extends Integer, ? extends String>> {

        /* renamed from: a */
        public static final C62797c f157991a = new C62797c();

        C62797c() {
        }

        /* renamed from: a */
        public final boolean test(Triple<Integer, Integer, String> triple) {
            Intrinsics.checkParameterIsNotNull(triple, "triple");
            if (triple.getFirst().intValue() <= -1 || triple.getSecond().intValue() <= 0) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "id", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b.b$e */
    public static final class C62800e<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ MessageCompleteTask f157994a;

        C62800e(MessageCompleteTask bVar) {
            this.f157994a = bVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            String str2 = this.f157994a.f157977a;
            C60700b.m235851b(str2, "[messageComplete2]", "position=" + this.f157994a.f157979c + ", count=" + this.f157994a.f157980d);
            MessageCompleteTask bVar = this.f157994a;
            Intrinsics.checkExpressionValueIsNotNull(str, "id");
            bVar.mo216883a(str, this.f157994a.f157979c, true, this.f157994a.f157980d, true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/vc/meeting/module/reaction/util/MessageCompleteTask$pullLatestInterationMessages$1", "Lcom/ss/android/vc/net/request/IVcGetDataCallback;", "Lcom/ss/android/vc/entity/response/PullVideoChatInteractionMessagesEntity;", "onError", "", "error", "Lcom/ss/android/vc/net/request/VcErrorResult;", "onSuccess", "response", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b.b$f */
    public static final class C62801f implements AbstractC63598b<ak> {

        /* renamed from: a */
        final /* synthetic */ MessageCompleteTask f157995a;

        /* renamed from: b */
        final /* synthetic */ boolean f157996b;

        /* renamed from: c */
        final /* synthetic */ boolean f157997c;

        /* renamed from: a */
        public void onSuccess(ak akVar) {
            Intrinsics.checkParameterIsNotNull(akVar, "response");
            String str = this.f157995a.f157977a;
            C60700b.m235851b(str, "[pullLatestInterationMessages]", "size=" + akVar.f152649a.size());
            List<InteractionMessage> list = akVar.f152649a;
            if (list != null) {
                this.f157995a.f157982f.mo213403a(list, this.f157996b);
            }
            if (this.f157997c) {
                this.f157995a.f157978b = false;
            }
        }

        @Override // com.ss.android.vc.net.request.AbstractC63598b
        public void onError(C63602e eVar) {
            Intrinsics.checkParameterIsNotNull(eVar, "error");
            String str = this.f157995a.f157977a;
            C60700b.m235864f(str, "[pullLatestInterationMessages2]", "error=" + eVar);
            if (this.f157997c) {
                this.f157995a.f157978b = false;
            }
        }

        C62801f(MessageCompleteTask bVar, boolean z, boolean z2) {
            this.f157995a = bVar;
            this.f157996b = z;
            this.f157997c = z2;
        }
    }

    /* renamed from: a */
    public final Disposable mo216881a(String str) {
        Disposable subscribe = Observable.just(str).map(new C62796b(this)).filter(C62797c.f157991a).flatMap(new C62798d(this)).subscribeOn(LarkRxSchedulers.io()).subscribe(new C62800e(this));
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "Observable.just(meetingI…ount, true)\n            }");
        return subscribe;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "triple", "Lkotlin/Triple;", "", "apply"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.vc.meeting.module.reaction.b.b$d */
    public static final class C62798d<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ MessageCompleteTask f157992a;

        C62798d(MessageCompleteTask bVar) {
            this.f157992a = bVar;
        }

        /* renamed from: a */
        public final Observable<String> apply(final Triple<Integer, Integer, String> triple) {
            Intrinsics.checkParameterIsNotNull(triple, "triple");
            this.f157992a.f157978b = true;
            long a = this.f157992a.mo216880a(triple.getFirst().intValue(), triple.getSecond().intValue());
            String str = this.f157992a.f157977a;
            C60700b.m235851b(str, "[messageComplete]", "delayInterval=" + a);
            return Observable.timer(a, TimeUnit.MILLISECONDS).map(new Function<T, R>() {
                /* class com.ss.android.vc.meeting.module.reaction.util.MessageCompleteTask.C62798d.C627991 */

                /* renamed from: a */
                public final String apply(Long l) {
                    Intrinsics.checkParameterIsNotNull(l, "it");
                    return (String) triple.getThird();
                }
            });
        }
    }

    public MessageCompleteTask(MessageConsumer aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "consumer");
        this.f157982f = aVar;
        C68296b<String> a = C68296b.m265052a();
        Intrinsics.checkExpressionValueIsNotNull(a, "PublishSubject.create()");
        this.f157987k = a;
        Disposable subscribe = a.throttleLast(1000, TimeUnit.MILLISECONDS).subscribeOn(LarkRxSchedulers.io()).subscribe(new Consumer<String>(this) {
            /* class com.ss.android.vc.meeting.module.reaction.util.MessageCompleteTask.C627951 */

            /* renamed from: a */
            final /* synthetic */ MessageCompleteTask f157989a;

            {
                this.f157989a = r1;
            }

            /* renamed from: a */
            public final void accept(String str) {
                if (!CollectionUtils.isEmpty(this.f157989a.f157982f.mo213408r()) && !this.f157989a.f157978b) {
                    Disposable disposable = this.f157989a.f157981e;
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    MessageCompleteTask bVar = this.f157989a;
                    Intrinsics.checkExpressionValueIsNotNull(str, "meetingId");
                    bVar.f157981e = bVar.mo216881a(str);
                }
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(subscribe, "requestSubject\n         …(meetingId)\n            }");
        this.f157988l = subscribe;
    }

    /* renamed from: a */
    public final long mo216880a(int i, int i2) {
        if (i == this.f157979c && this.f157980d == i2) {
            this.f157986j++;
        } else {
            this.f157979c = i;
            this.f157980d = i2;
            this.f157986j = 0;
        }
        return m245786c() * ((long) this.f157986j);
    }

    /* renamed from: a */
    public final void mo216883a(String str, int i, boolean z, int i2, boolean z2) {
        Intrinsics.checkParameterIsNotNull(str, "meetingId");
        VcBizSender.m249160a(str, i, z, i2).mo219889a(new C62801f(this, z, z2));
    }
}
