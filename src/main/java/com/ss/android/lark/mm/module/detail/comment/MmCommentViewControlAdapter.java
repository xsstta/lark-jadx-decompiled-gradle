package com.ss.android.lark.mm.module.detail.comment;

import com.bytedance.ee.bear.middleground.comment.Comment;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.baseinfo.MmMeetingBaseInfoControl;
import com.ss.android.lark.mm.module.detail.comment.MmCommentControl;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.main.MmControlRegister;
import com.ss.android.lark.mm.module.detail.subtitles.IMmMeetingSubtitleListener;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.request.AddCommentReq;
import com.ss.android.lark.mm.module.detail.subtitles.model.response.ReplyCommentRes;
import com.ss.android.lark.mm.module.detail.translate.MmTranslateLangType;
import com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter;
import com.ss.android.lark.mm.module.framework.MmViewControlRegister;
import com.ss.android.lark.mm.module.translate.MmTranslateControl;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\u0003H\u0016JH\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122&\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015j\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0016\u0018\u0001`\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/mm/module/detail/comment/MmCommentViewControlAdapter;", "Lcom/ss/android/lark/mm/module/framework/MmBaseViewControlAdapter;", "Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentListener;", "Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentDependency;", "Lcom/ss/android/lark/mm/module/detail/comment/MmCommentControl$IMmCommentChangeListener;", "viewControlRegister", "Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;", "controlRegister", "Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;", "control", "Lcom/ss/android/lark/mm/module/detail/comment/MmCommentControl;", "(Lcom/ss/android/lark/mm/module/framework/MmViewControlRegister;Lcom/ss/android/lark/mm/module/detail/main/MmControlRegister;Lcom/ss/android/lark/mm/module/detail/comment/MmCommentControl;)V", "getDependency", "onCommentChange", "", Comment.f24093e, "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "needUpdateParaIds", "", "", "commentMap", "Ljava/util/HashMap;", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lkotlin/collections/HashMap;", "onCreate", "onDestroy", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.comment.f */
public final class MmCommentViewControlAdapter extends MmBaseViewControlAdapter<IMmCommentListener, IMmCommentDependency> implements MmCommentControl.IMmCommentChangeListener {

    /* renamed from: a */
    public final MmViewControlRegister f115994a;

    /* renamed from: b */
    public final MmControlRegister f115995b;

    /* renamed from: c */
    public final MmCommentControl f115996c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000i\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J.\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016JT\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0016J\u0018\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019H\u0016J\u0018\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u0016H\u0016J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0019H\u0016J\u0018\u0010*\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\bH\u0016¨\u0006,"}, d2 = {"com/ss/android/lark/mm/module/detail/comment/MmCommentViewControlAdapter$getDependency$1", "Lcom/ss/android/lark/mm/module/detail/comment/IMmCommentDependency;", "addComment", "", "addCommentReq", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/request/AddCommentReq;", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/response/ReplyCommentRes;", "deleteComment", "pid", "", "commentId", "contentId", "dataCallback", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getMmComment", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment;", "getTranslateType", "Lcom/ss/android/lark/mm/module/detail/translate/MmTranslateLangType;", "isOnwer", "", "newComment", "startSelection", "", "endSelection", "quote", "commentContent", "paragraph", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "onSuccessCallback", "Lkotlin/Function1;", "onFailed", "Lkotlin/Function0;", "notifyChangeCurrentFocusComment", "highlightRange", "Lkotlin/ranges/IntRange;", "adapterPosition", "notifyDismissPostCommentDialog", "isPostSucceed", "notifyDismissViewCommentDialog", "notifyPostCommentSuc", "res", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.detail.comment.f$a */
    public static final class C46028a implements IMmCommentDependency {

        /* renamed from: a */
        final /* synthetic */ MmCommentViewControlAdapter f115997a;

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161680a(IntRange kVar, int i) {
            Intrinsics.checkParameterIsNotNull(kVar, "highlightRange");
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f115997a.f115994a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162278a(i, kVar);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public MmBaseInfo mo161673a() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f115997a.f115995b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161581b();
            }
            return null;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: c */
        public MmTranslateLangType mo161682c() {
            MmTranslateLangType a;
            MmTranslateControl dVar = (MmTranslateControl) this.f115997a.f115995b.mo161912a(MmTranslateControl.class);
            if (dVar == null || (a = dVar.mo161280a()) == null) {
                return MmTranslateLangType.DEFAULT;
            }
            return a;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: d */
        public boolean mo161683d() {
            MmMeetingBaseInfoControl mmMeetingBaseInfoControl = (MmMeetingBaseInfoControl) this.f115997a.f115995b.mo161912a(MmMeetingBaseInfoControl.class);
            if (mmMeetingBaseInfoControl != null) {
                return mmMeetingBaseInfoControl.mo161589g();
            }
            return false;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: b */
        public MmComment mo161681b() {
            MmTranslateLangType mmTranslateLangType;
            MmTranslateControl dVar = (MmTranslateControl) this.f115997a.f115995b.mo161912a(MmTranslateControl.class);
            if (dVar != null) {
                mmTranslateLangType = dVar.mo161280a();
            } else {
                mmTranslateLangType = null;
            }
            if (mmTranslateLangType == MmTranslateLangType.DEFAULT) {
                MmCommentControl dVar2 = (MmCommentControl) this.f115997a.f115995b.mo161912a(MmCommentControl.class);
                if (dVar2 != null) {
                    return dVar2.mo161688a();
                }
                return null;
            }
            MmCommentControl dVar3 = (MmCommentControl) this.f115997a.f115995b.mo161912a(MmCommentControl.class);
            if (dVar3 != null) {
                return dVar3.mo161697b();
            }
            return null;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C46028a(MmCommentViewControlAdapter fVar) {
            this.f115997a = fVar;
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161674a(int i) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f115997a.f115994a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162288b(i);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161676a(int i, ReplyCommentRes replyCommentRes) {
            Intrinsics.checkParameterIsNotNull(replyCommentRes, "res");
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f115997a.f115994a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162277a(i, replyCommentRes);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161677a(int i, boolean z) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f115997a.f115994a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162279a(i, z);
            }
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161678a(AddCommentReq addCommentReq, AbstractC47070c<ReplyCommentRes> cVar) {
            Intrinsics.checkParameterIsNotNull(addCommentReq, "addCommentReq");
            Intrinsics.checkParameterIsNotNull(cVar, "callback");
            this.f115997a.f115996c.mo161693a(addCommentReq, cVar);
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161679a(String str, String str2, String str3, AbstractC47070c<String> cVar) {
            Intrinsics.checkParameterIsNotNull(str, "pid");
            Intrinsics.checkParameterIsNotNull(str2, "commentId");
            Intrinsics.checkParameterIsNotNull(str3, "contentId");
            Intrinsics.checkParameterIsNotNull(cVar, "dataCallback");
            this.f115997a.f115996c.mo161694a(str, str2, str3, cVar);
        }

        @Override // com.ss.android.lark.mm.module.detail.comment.IMmCommentDependency
        /* renamed from: a */
        public void mo161675a(int i, int i2, String str, String str2, MmMeetingParagraph mmMeetingParagraph, Function1<? super ReplyCommentRes, Unit> function1, Function0<Unit> function0) {
            Intrinsics.checkParameterIsNotNull(str2, "commentContent");
            Intrinsics.checkParameterIsNotNull(mmMeetingParagraph, "paragraph");
            Intrinsics.checkParameterIsNotNull(function1, "onSuccessCallback");
            Intrinsics.checkParameterIsNotNull(function0, "onFailed");
            this.f115997a.f115996c.mo161690a(i, i2, str, str2, mmMeetingParagraph, function1, function0);
        }
    }

    /* renamed from: b */
    public IMmCommentDependency mo161230c() {
        return new C46028a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: a */
    public void mo161251a() {
        super.mo161251a();
        this.f115996c.mo161691a(this);
    }

    @Override // com.ss.android.lark.mm.module.framework.MmBaseViewControlAdapter
    /* renamed from: d */
    public void mo161256d() {
        super.mo161256d();
        this.f115996c.mo161698b(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MmCommentViewControlAdapter(MmViewControlRegister kVar, MmControlRegister eVar, MmCommentControl dVar) {
        super(kVar, eVar, dVar);
        Intrinsics.checkParameterIsNotNull(kVar, "viewControlRegister");
        Intrinsics.checkParameterIsNotNull(eVar, "controlRegister");
        Intrinsics.checkParameterIsNotNull(dVar, "control");
        this.f115994a = kVar;
        this.f115995b = eVar;
        this.f115996c = dVar;
    }

    @Override // com.ss.android.lark.mm.module.detail.comment.MmCommentControl.IMmCommentChangeListener
    /* renamed from: a */
    public void mo161699a(MmComment mmComment, List<String> list, HashMap<String, MmComment.MmCommentInfo> hashMap) {
        MmTranslateLangType mmTranslateLangType;
        Intrinsics.checkParameterIsNotNull(list, "needUpdateParaIds");
        MmTranslateControl dVar = (MmTranslateControl) this.f115995b.mo161912a(MmTranslateControl.class);
        if (dVar != null) {
            mmTranslateLangType = dVar.mo161280a();
        } else {
            mmTranslateLangType = null;
        }
        if (mmTranslateLangType == MmTranslateLangType.DEFAULT) {
            IMmMeetingSubtitleListener cVar = (IMmMeetingSubtitleListener) this.f115994a.mo161266d(IMmMeetingSubtitleListener.class);
            if (cVar != null) {
                cVar.mo162281a(mmComment, list, hashMap);
            }
            IMmCommentListener cVar2 = (IMmCommentListener) this.f115994a.mo161266d(IMmCommentListener.class);
            if (cVar2 != null) {
                cVar2.mo161687a(hashMap);
            }
        }
    }
}
