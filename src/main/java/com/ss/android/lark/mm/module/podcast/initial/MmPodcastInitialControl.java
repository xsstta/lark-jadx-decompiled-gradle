package com.ss.android.lark.mm.module.podcast.initial;

import com.google.firebase.messaging.Constants;
import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.podcast.model.MmPodcastBg;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.p2288b.C45855f;
import com.ss.android.lark.mm.utils.UrlUtil;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0017\u001a\u00020\u00182\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u001aJ\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u0006\u0010\u001c\u001a\u00020\u0018J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018R\u001c\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\t\"\u0004\b\u0013\u0010\u0004R$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u0004¨\u0006 "}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "url", "", "(Ljava/lang/String;)V", "currentPodcastBgUrl", "Lkotlin/Pair;", "host", "getHost", "()Ljava/lang/String;", "setHost", "listener", "Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl$IMmPodcastInitialControlListener;", "getListener", "()Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl$IMmPodcastInitialControlListener;", "setListener", "(Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl$IMmPodcastInitialControlListener;)V", "token", "getToken", "setToken", "value", "getUrl", "setUrl", "getPodcastBgUrl", "", "onLoadSuccess", "Lkotlin/Function1;", "onDestroy", "onShowRetryPage", "onSwitchPodcastSucceed", "showNoPlayablePage", "IMmPodcastInitialControlListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.podcast.a.d */
public final class MmPodcastInitialControl extends MmBaseControl {

    /* renamed from: a */
    public Pair<String, String> f117660a;

    /* renamed from: b */
    private String f117661b;

    /* renamed from: c */
    private String f117662c;

    /* renamed from: d */
    private String f117663d;

    /* renamed from: e */
    private IMmPodcastInitialControlListener f117664e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl$IMmPodcastInitialControlListener;", "", "onShowNoAvailablePlayInfo", "", "onShowRetryPage", "onSwitchPodcastSucceed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.d$a */
    public interface IMmPodcastInitialControlListener {
        /* renamed from: a */
        void mo164331a();

        /* renamed from: b */
        void mo164332b();

        /* renamed from: c */
        void mo164333c();
    }

    /* renamed from: a */
    public final String mo164323a() {
        return this.f117662c;
    }

    /* renamed from: b */
    public final String mo164327b() {
        return this.f117663d;
    }

    /* renamed from: c */
    public final void mo164328c() {
        IMmPodcastInitialControlListener aVar = this.f117664e;
        if (aVar != null) {
            aVar.mo164331a();
        }
    }

    /* renamed from: d */
    public final void mo164329d() {
        IMmPodcastInitialControlListener aVar = this.f117664e;
        if (aVar != null) {
            aVar.mo164332b();
        }
    }

    /* renamed from: e */
    public final void mo164330e() {
        IMmPodcastInitialControlListener aVar = this.f117664e;
        if (aVar != null) {
            aVar.mo164333c();
        }
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseControl
    /* renamed from: k */
    public void mo161235k() {
        super.mo161235k();
        this.f117664e = null;
    }

    /* renamed from: a */
    public final void mo164324a(IMmPodcastInitialControlListener aVar) {
        this.f117664e = aVar;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/podcast/initial/MmPodcastInitialControl$getPodcastBgUrl$1", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/podcast/model/MmPodcastBg;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.podcast.a.d$b */
    public static final class C46762b extends AbstractC47070c<MmPodcastBg> {

        /* renamed from: a */
        final /* synthetic */ MmPodcastInitialControl f117665a;

        /* renamed from: b */
        final /* synthetic */ Function1 f117666b;

        /* renamed from: a */
        public void mo161289a(MmPodcastBg mmPodcastBg) {
            if (mmPodcastBg != null) {
                String randomGetNext = mmPodcastBg.randomGetNext();
                MmPodcastInitialControl dVar = this.f117665a;
                dVar.f117660a = TuplesKt.to(dVar.mo164323a(), randomGetNext);
                Function1 function1 = this.f117666b;
                Intrinsics.checkExpressionValueIsNotNull(randomGetNext, "url");
                function1.invoke(randomGetNext);
            }
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
            C45855f.m181666e("MmPodcastInitialControl", "[getPodcastBgs] error: " + aVar);
        }

        C46762b(MmPodcastInitialControl dVar, Function1 function1) {
            this.f117665a = dVar;
            this.f117666b = function1;
        }
    }

    public MmPodcastInitialControl(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f117661b = UrlUtil.f118671a.mo165518b(str);
        this.f117662c = UrlUtil.f118671a.mo165517a(str);
        this.f117663d = str;
    }

    /* renamed from: a */
    public final void mo164325a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f117663d = str;
        this.f117661b = UrlUtil.f118671a.mo165518b(this.f117663d);
        this.f117662c = UrlUtil.f118671a.mo165517a(this.f117663d);
    }

    /* renamed from: a */
    public final void mo164326a(Function1<? super String, Unit> function1) {
        String str;
        String str2;
        Intrinsics.checkParameterIsNotNull(function1, "onLoadSuccess");
        Pair<String, String> pair = this.f117660a;
        if (pair != null) {
            if (pair != null) {
                str = pair.getFirst();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, this.f117662c)) {
                Pair<String, String> pair2 = this.f117660a;
                if (pair2 == null || (str2 = pair2.getSecond()) == null) {
                    str2 = "";
                }
                function1.invoke(str2);
                return;
            }
        }
        C47057a.m186235a(this.f117661b).mo165337a(new C46762b(this, function1));
    }
}
