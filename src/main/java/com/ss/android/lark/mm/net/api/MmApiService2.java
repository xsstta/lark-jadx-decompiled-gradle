package com.ss.android.lark.mm.net.api;

import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSubtitles;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.MmKeywordRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.net.error.IHttpLocalErrorHandler;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import io.reactivex.AbstractC68259a;
import io.reactivex.AbstractC68270b;
import io.reactivex.AbstractC68278d;
import io.reactivex.AbstractC69011s;
import io.reactivex.AbstractC69013u;
import io.reactivex.Single;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\rJ2\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J:\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014J \u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007¨\u0006\u0019"}, d2 = {"Lcom/ss/android/lark/mm/net/api/MmApiService2;", "", "()V", "loadBaseInfo", "Lio/reactivex/Single;", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "host", "", "token", "loadComment", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "objectToken", "translateLang", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "loadKeywords", "", "requestId", "loadSubtitles", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "localErrorHandler", "Lcom/ss/android/lark/mm/net/error/IHttpLocalErrorHandler;", "setRecordingLanguage", "Lio/reactivex/Completable;", "transLan", "recordingLan", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.net.a.b */
public final class MmApiService2 {

    /* renamed from: a */
    public static final MmApiService2 f118430a = new MmApiService2();

    private MmApiService2() {
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.net.a.b$a */
    public static final class C47058a<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ String f118431a;

        /* renamed from: b */
        final /* synthetic */ String f118432b;

        /* renamed from: c */
        final /* synthetic */ MmTranslateLangType f118433c;

        C47058a(String str, String str2, MmTranslateLangType mmTranslateLangType) {
            this.f118431a = str;
            this.f118432b = str2;
            this.f118433c = mmTranslateLangType;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmComment> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            C47057a.m186255a(this.f118431a, this.f118432b, this.f118433c.getValue(), new AbstractC47071d<MmComment.MmCommentResp>() {
                /* class com.ss.android.lark.mm.net.api.MmApiService2.C47058a.C470591 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo161289a(MmComment.MmCommentResp mmCommentResp) {
                    Intrinsics.checkParameterIsNotNull(mmCommentResp, "resp");
                    sVar.onSuccess(mmCommentResp.data);
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    sVar.onError(aVar.mo165309d());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012 \u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "", "", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.net.a.b$b */
    public static final class C47060b<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ String f118435a;

        /* renamed from: b */
        final /* synthetic */ String f118436b;

        /* renamed from: c */
        final /* synthetic */ String f118437c;

        /* renamed from: d */
        final /* synthetic */ String f118438d;

        C47060b(String str, String str2, String str3, String str4) {
            this.f118435a = str;
            this.f118436b = str2;
            this.f118437c = str3;
            this.f118438d = str4;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<List<String>> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            C47057a.m186239a(this.f118435a, this.f118436b, this.f118437c, this.f118438d).mo165337a(new AbstractC47070c<MmKeywordRes>() {
                /* class com.ss.android.lark.mm.net.api.MmApiService2.C47060b.C470611 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo161289a(MmKeywordRes mmKeywordRes) {
                    List<String> list;
                    AbstractC69011s sVar = sVar;
                    if (mmKeywordRes == null || (list = mmKeywordRes.getKeywords()) == null) {
                        list = Collections.emptyList();
                    }
                    sVar.onSuccess(list);
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    sVar.onError(aVar.mo165309d());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/CompletableEmitter;", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.net.a.b$d */
    public static final class C47064d implements AbstractC68278d {

        /* renamed from: a */
        final /* synthetic */ String f118446a;

        /* renamed from: b */
        final /* synthetic */ String f118447b;

        /* renamed from: c */
        final /* synthetic */ String f118448c;

        C47064d(String str, String str2, String str3) {
            this.f118446a = str;
            this.f118447b = str2;
            this.f118448c = str3;
        }

        @Override // io.reactivex.AbstractC68278d
        /* renamed from: a */
        public final void mo165291a(final AbstractC68270b bVar) {
            Intrinsics.checkParameterIsNotNull(bVar, "it");
            C47057a.m186290g(this.f118446a, this.f118447b, this.f118448c, new AbstractC47070c<String>() {
                /* class com.ss.android.lark.mm.net.api.MmApiService2.C47064d.C470651 */

                /* renamed from: a */
                public void mo161289a(String str) {
                    bVar.onComplete();
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    bVar.onError(aVar.mo165309d());
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lio/reactivex/SingleEmitter;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSubtitles;", "kotlin.jvm.PlatformType", "subscribe"}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.net.a.b$c */
    public static final class C47062c<T> implements AbstractC69013u<T> {

        /* renamed from: a */
        final /* synthetic */ String f118440a;

        /* renamed from: b */
        final /* synthetic */ String f118441b;

        /* renamed from: c */
        final /* synthetic */ MmTranslateLangType f118442c;

        /* renamed from: d */
        final /* synthetic */ String f118443d;

        /* renamed from: e */
        final /* synthetic */ IHttpLocalErrorHandler f118444e;

        C47062c(String str, String str2, MmTranslateLangType mmTranslateLangType, String str3, IHttpLocalErrorHandler aVar) {
            this.f118440a = str;
            this.f118441b = str2;
            this.f118442c = mmTranslateLangType;
            this.f118443d = str3;
            this.f118444e = aVar;
        }

        @Override // io.reactivex.AbstractC69013u
        public final void subscribe(final AbstractC69011s<MmMeetingSubtitles> sVar) {
            Intrinsics.checkParameterIsNotNull(sVar, "it");
            C47057a.m186240a(this.f118440a, this.f118441b, this.f118442c.getValue(), this.f118443d, this.f118444e).mo165337a(new AbstractC47071d<MmMeetingSubtitles.MmMeetingSubtitlesResp>() {
                /* class com.ss.android.lark.mm.net.api.MmApiService2.C47062c.C470631 */

                /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: io.reactivex.s */
                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: a */
                public void mo161289a(MmMeetingSubtitles.MmMeetingSubtitlesResp mmMeetingSubtitlesResp) {
                    Intrinsics.checkParameterIsNotNull(mmMeetingSubtitlesResp, "res");
                    sVar.onSuccess(mmMeetingSubtitlesResp.data);
                }

                @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
                /* renamed from: a */
                public void mo161288a(C47068a aVar) {
                    Intrinsics.checkParameterIsNotNull(aVar, "errorResult");
                    sVar.onError(aVar.mo165309d());
                }
            });
        }
    }

    /* renamed from: a */
    public final Single<MmComment> mo165284a(String str, String str2, MmTranslateLangType mmTranslateLangType) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "objectToken");
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        Single<MmComment> create = Single.create(new C47058a(str, str2, mmTranslateLangType));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create {\n        …             })\n        }");
        return create;
    }

    /* renamed from: a */
    public final AbstractC68259a mo165287a(String str, String str2, String str3) {
        Intrinsics.checkParameterIsNotNull(str, "objectToken");
        Intrinsics.checkParameterIsNotNull(str2, "transLan");
        AbstractC68259a a = AbstractC68259a.m264984a(new C47064d(str, str2, str3));
        Intrinsics.checkExpressionValueIsNotNull(a, "Completable.create {\n   …             })\n        }");
        return a;
    }

    /* renamed from: a */
    public final Single<List<String>> mo165286a(String str, String str2, String str3, String str4) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "token");
        Intrinsics.checkParameterIsNotNull(str3, "translateLang");
        Intrinsics.checkParameterIsNotNull(str4, "requestId");
        Single<List<String>> create = Single.create(new C47060b(str, str2, str3, str4));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create {\n        …\n            })\n        }");
        return create;
    }

    /* renamed from: a */
    public final Single<MmMeetingSubtitles> mo165285a(String str, String str2, MmTranslateLangType mmTranslateLangType, String str3, IHttpLocalErrorHandler aVar) {
        Intrinsics.checkParameterIsNotNull(str, "host");
        Intrinsics.checkParameterIsNotNull(str2, "objectToken");
        Intrinsics.checkParameterIsNotNull(mmTranslateLangType, "translateLang");
        Intrinsics.checkParameterIsNotNull(str3, "requestId");
        Single<MmMeetingSubtitles> create = Single.create(new C47062c(str, str2, mmTranslateLangType, str3, aVar));
        Intrinsics.checkExpressionValueIsNotNull(create, "Single.create {\n        …\n            })\n        }");
        return create;
    }

    /* renamed from: a */
    public static /* synthetic */ Single m186296a(MmApiService2 bVar, String str, String str2, MmTranslateLangType mmTranslateLangType, String str3, IHttpLocalErrorHandler aVar, int i, Object obj) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        if ((i & 16) != 0) {
            aVar = null;
        }
        return bVar.mo165285a(str, str2, mmTranslateLangType, str3, aVar);
    }
}
