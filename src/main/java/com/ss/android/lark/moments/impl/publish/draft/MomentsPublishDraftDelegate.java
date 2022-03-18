package com.ss.android.lark.moments.impl.publish.draft;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.moments.impl.common.MomentsDispatcher;
import com.ss.android.lark.moments.impl.draft.MomentsDraft;
import com.ss.android.lark.moments.impl.publish.MomentsPublishViewModel;
import com.ss.android.lark.moments.impl.publish.category.CategoryTag;
import com.ss.android.lark.widget.richtext.C59035h;
import com.ss.android.lark.widget.richtext.RichText;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.C69097g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.C69086a;
import kotlin.coroutines.jvm.internal.C69089a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C69364ai;
import kotlinx.coroutines.C69553g;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0011\u0010\u0005\u001a\u00020\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J&\u0010\b\u001a\u0004\u0018\u00010\t2\u001a\u0010\n\u001a\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\fH\u0002J&\u0010\r\u001a\u0004\u0018\u00010\u000e2\u001a\u0010\n\u001a\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\fH\u0002J,\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u001a\u0010\n\u001a\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\fH\u0002J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u001a\u0010\n\u001a\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\fH\u0002J&\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u001a\u0010\n\u001a\u0016\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000bj\n\u0012\u0002\b\u0003\u0012\u0002\b\u0003`\fH\u0002J>\u0010\u0016\u001a\u00020\u00042\"\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000bj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t`\f2\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002JR\u0010\u001b\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u000e2\u001a\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#H\u0016\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/MomentsPublishDraftDelegate;", "Lcom/ss/android/lark/moments/impl/publish/draft/IMomentsPublishDraftDelegate;", "()V", "clearPostDraft", "", "getPostDraft", "Lcom/ss/android/lark/moments/impl/publish/draft/MomentsDraftData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "parseCategoryIdDraft", "", "draft", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "parseIdentityDraft", "Lcom/ss/android/lark/moments/impl/publish/MomentsPublishViewModel$IdentityType;", "parseImageDraft", "", "Lcom/ss/android/lark/moments/impl/publish/draft/ImageData;", "parseMediaDraft", "Lcom/ss/android/lark/moments/impl/publish/draft/VideoGridInfo;", "parseRichTextDraft", "Lcom/ss/android/lark/widget/richtext/RichText;", "putToJson", "map", "key", "obj", "", "savePostDraft", "postRichText", "imageList", "media", "identity", "categoryList", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/moments/impl/publish/category/CategoryTag;", "Lkotlin/collections/ArrayList;", "Companion", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.moments.impl.publish.draft.b */
public final class MomentsPublishDraftDelegate {

    /* renamed from: a */
    public static final Companion f120727a = new Companion(null);

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H@"}, d2 = {"getPostDraft", "", "continuation", "Lkotlin/coroutines/Continuation;", "Lcom/ss/android/lark/moments/impl/publish/draft/MomentsDraftData;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate", mo239173f = "MomentsPublishDraftDelegate.kt", mo239174i = {0}, mo239175l = {88}, mo239176m = "getPostDraft", mo239177n = {"this"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.draft.b$c */
    public static final class C47958c extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ MomentsPublishDraftDelegate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47958c(MomentsPublishDraftDelegate bVar, Continuation cVar) {
            super(cVar);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.mo168031a(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/moments/impl/publish/draft/MomentsPublishDraftDelegate$Companion;", "", "()V", "MOMENTS_DRAFT_PUBLISH", "", "TAG", "im_moments-wrapper_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.moments.impl.publish.draft.b$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public void mo168032a() {
        Job unused = C69553g.m266944a(C69364ai.m266265a(MomentsDispatcher.f119247a.mo166168a()), null, null, new C47957b(null), 3, null);
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate$clearPostDraft$1", mo239173f = "MomentsPublishDraftDelegate.kt", mo239174i = {0}, mo239175l = {37}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch"}, mo239178s = {"L$0"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.draft.b$b */
    public static final class C47957b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        private CoroutineScope p$;

        C47957b(Continuation cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47957b bVar = new C47957b(cVar);
            bVar.p$ = (CoroutineScope) obj;
            return bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47957b) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a = C69086a.m265828a();
            int i = this.label;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                MomentsDraft aVar = MomentsDraft.f119064a;
                this.L$0 = ahVar;
                this.label = 1;
                if (aVar.mo165959a("MOMENTS_DRAFT_NEW_POST", "", this) == a) {
                    return a;
                }
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[Catch:{ Exception -> 0x0032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c A[Catch:{ Exception -> 0x0032 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m189333a(java.util.HashMap<?, ?> r4) {
        /*
            r3 = this;
            r0 = 0
            java.util.Map r4 = (java.util.Map) r4     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = "category_id"
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0032 }
            boolean r1 = r4 instanceof java.lang.String     // Catch:{ Exception -> 0x0032 }
            if (r1 != 0) goto L_0x000e
            r4 = r0
        L_0x000e:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0032 }
            if (r4 == 0) goto L_0x002e
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Object r4 = com.alibaba.fastjson.JSONObject.parseObject(r4, r1)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0032 }
            r1 = r4
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0032 }
            if (r1 == 0) goto L_0x0028
            int r1 = r1.length()     // Catch:{ Exception -> 0x0032 }
            if (r1 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = 0
            goto L_0x0029
        L_0x0028:
            r1 = 1
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r0 = r4
        L_0x002d:
            return r0
        L_0x002e:
            r4 = r3
            com.ss.android.lark.moments.impl.publish.draft.b r4 = (com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate) r4     // Catch:{ Exception -> 0x0032 }
            return r0
        L_0x0032:
            r4 = move-exception
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r1 = "MomentsPublishDraftDelegate"
            java.lang.String r2 = "get publish draft, parse category fail"
            com.ss.android.lark.log.Log.m165384e(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate.m189333a(java.util.HashMap):java.lang.String");
    }

    /* renamed from: b */
    private final RichText m189334b(HashMap<?, ?> hashMap) {
        try {
            Object obj = hashMap.get("rich_text");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                return (RichText) JSONObject.parseObject(str, RichText.class);
            }
            MomentsPublishDraftDelegate bVar = this;
            return null;
        } catch (Exception e) {
            Log.m165384e("MomentsPublishDraftDelegate", "get publish draft, parse rich text fail", e);
            return null;
        }
    }

    /* renamed from: e */
    private final MomentsPublishViewModel.IdentityType m189337e(HashMap<?, ?> hashMap) {
        try {
            Object obj = hashMap.get("identity");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                return (MomentsPublishViewModel.IdentityType) JSONObject.parseObject(str, MomentsPublishViewModel.IdentityType.class);
            }
            MomentsPublishDraftDelegate bVar = this;
            return null;
        } catch (Exception e) {
            Log.m165384e("MomentsPublishDraftDelegate", "get publish draft, parse identity fail", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d A[Catch:{ Exception -> 0x0063 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.ss.android.lark.moments.impl.publish.draft.ImageData> m189335c(java.util.HashMap<?, ?> r6) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate.m189335c(java.util.HashMap):java.util.List");
    }

    /* renamed from: d */
    private final VideoGridInfo m189336d(HashMap<?, ?> hashMap) {
        VideoGridInfo videoGridInfo;
        try {
            Object obj = hashMap.get("media");
            if (!(obj instanceof String)) {
                obj = null;
            }
            String str = (String) obj;
            if (str != null) {
                VideoData videoData = (VideoData) JSONObject.parseObject(str, VideoData.class);
                if (videoData == null) {
                    videoGridInfo = null;
                } else {
                    videoGridInfo = new VideoGridInfo(videoData);
                }
                if (videoGridInfo == null || !new File(videoGridInfo.getVideoInfo().getPath()).exists() || !new File(videoGridInfo.getCoverPath()).exists()) {
                    return null;
                }
                return videoGridInfo;
            }
            MomentsPublishDraftDelegate bVar = this;
            return null;
        } catch (Exception e) {
            Log.m165384e("MomentsPublishDraftDelegate", "get publish draft, parse media fail", e);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo168031a(kotlin.coroutines.Continuation<? super com.ss.android.lark.moments.impl.publish.draft.MomentsDraftData> r21) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate.mo168031a(kotlin.coroutines.c):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo238835k = 3, mv = {1, 1, 16})
    @DebugMetadata(mo239172c = "com.ss.android.lark.moments.impl.publish.draft.MomentsPublishDraftDelegate$savePostDraft$1", mo239173f = "MomentsPublishDraftDelegate.kt", mo239174i = {0, 1, 1, 1, 1}, mo239175l = {46, 67}, mo239176m = "invokeSuspend", mo239177n = {"$this$launch", "$this$launch", "draftMap", "videoData", "it"}, mo239178s = {"L$0", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: com.ss.android.lark.moments.impl.publish.draft.b$d */
    public static final class C47959d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ArrayList $categoryList;
        final /* synthetic */ MomentsPublishViewModel.IdentityType $identity;
        final /* synthetic */ List $imageList;
        final /* synthetic */ VideoGridInfo $media;
        final /* synthetic */ RichText $postRichText;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        private CoroutineScope p$;
        final /* synthetic */ MomentsPublishDraftDelegate this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C47959d(MomentsPublishDraftDelegate bVar, VideoGridInfo videoGridInfo, RichText richText, List list, ArrayList arrayList, MomentsPublishViewModel.IdentityType identityType, Continuation cVar) {
            super(2, cVar);
            this.this$0 = bVar;
            this.$media = videoGridInfo;
            this.$postRichText = richText;
            this.$imageList = list;
            this.$categoryList = arrayList;
            this.$identity = identityType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> cVar) {
            Intrinsics.checkParameterIsNotNull(cVar, "completion");
            C47959d dVar = new C47959d(this.this$0, this.$media, this.$postRichText, this.$imageList, this.$categoryList, this.$identity, cVar);
            dVar.p$ = (CoroutineScope) obj;
            return dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope ahVar, Continuation<? super Unit> cVar) {
            return ((C47959d) create(ahVar, cVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            VideoData videoData;
            boolean z;
            Object a = C69086a.m265828a();
            int i = this.label;
            boolean z2 = true;
            if (i == 0) {
                C69097g.m265891a(obj);
                CoroutineScope ahVar = this.p$;
                if (C59035h.m229210a(this.$postRichText)) {
                    List list = this.$imageList;
                    if (list == null || list.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && this.$media == null) {
                        MomentsDraft aVar = MomentsDraft.f119064a;
                        this.L$0 = ahVar;
                        this.label = 1;
                        if (aVar.mo165959a("MOMENTS_DRAFT_NEW_POST", "", this) == a) {
                            return a;
                        }
                    }
                }
                HashMap<String, String> hashMap = new HashMap<>();
                ArrayList arrayList = this.$categoryList;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        CategoryTag categoryTag = (CategoryTag) it.next();
                        if (categoryTag.getSelected()) {
                            this.this$0.mo168034a(hashMap, "category_id", categoryTag.getId());
                            break;
                        }
                    }
                }
                this.this$0.mo168034a(hashMap, "rich_text", this.$postRichText);
                this.this$0.mo168034a(hashMap, "image", this.$imageList);
                VideoGridInfo videoGridInfo = this.$media;
                Boolean bool = null;
                if (videoGridInfo != null) {
                    videoData = videoGridInfo.toVideoData();
                } else {
                    videoData = null;
                }
                this.this$0.mo168034a(hashMap, "media", videoData);
                this.this$0.mo168034a(hashMap, "identity", this.$identity);
                StringBuilder sb = new StringBuilder();
                sb.append("save publish draft richTextEmpty=");
                sb.append(C59035h.m229210a(this.$postRichText));
                sb.append(' ');
                sb.append("imageEmpty=");
                List list2 = this.$imageList;
                if (list2 != null) {
                    bool = C69089a.m265837a(list2.isEmpty());
                }
                sb.append(bool);
                sb.append(" mediaEmpty=");
                if (this.$media != null) {
                    z2 = false;
                }
                sb.append(z2);
                Log.m165389i("MomentsPublishDraftDelegate", sb.toString());
                String jSONString = JSONObject.toJSONString(hashMap);
                if (jSONString != null) {
                    MomentsDraft aVar2 = MomentsDraft.f119064a;
                    this.L$0 = ahVar;
                    this.L$1 = hashMap;
                    this.L$2 = videoData;
                    this.L$3 = jSONString;
                    this.label = 2;
                    if (aVar2.mo165959a("MOMENTS_DRAFT_NEW_POST", jSONString, this) == a) {
                        return a;
                    }
                }
                return Unit.INSTANCE;
            } else if (i == 1) {
                CoroutineScope ahVar2 = (CoroutineScope) this.L$0;
                C69097g.m265891a(obj);
            } else if (i == 2) {
                String str = (String) this.L$3;
                VideoData videoData2 = (VideoData) this.L$2;
                HashMap hashMap2 = (HashMap) this.L$1;
                CoroutineScope ahVar3 = (CoroutineScope) this.L$0;
                try {
                    C69097g.m265891a(obj);
                } catch (Exception e) {
                    Log.m165384e("MomentsPublishDraftDelegate", "save publish draft toJson fail", e);
                }
                return Unit.INSTANCE;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final void mo168034a(HashMap<String, String> hashMap, String str, Object obj) {
        if (obj != null) {
            try {
                String jSONString = JSONObject.toJSONString(obj, SerializerFeature.WriteClassName);
                Intrinsics.checkExpressionValueIsNotNull(jSONString, "JSONObject.toJSONString(…erFeature.WriteClassName)");
                hashMap.put(str, jSONString);
            } catch (Exception e) {
                Log.m165384e("MomentsPublishDraftDelegate", "save publish draft " + str + " toJson fail", e);
            }
        } else {
            Log.m165389i("MomentsPublishDraftDelegate", "save publish draft " + str + " is empty");
        }
    }

    /* renamed from: a */
    public void mo168033a(RichText richText, List<ImageData> list, VideoGridInfo videoGridInfo, MomentsPublishViewModel.IdentityType identityType, ArrayList<CategoryTag> arrayList) {
        Job unused = C69553g.m266944a(C69364ai.m266265a(MomentsDispatcher.f119247a.mo166168a()), null, null, new C47959d(this, videoGridInfo, richText, list, arrayList, identityType, null), 3, null);
    }
}
