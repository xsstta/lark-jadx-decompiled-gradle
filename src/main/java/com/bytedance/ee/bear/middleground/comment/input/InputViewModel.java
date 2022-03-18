package com.bytedance.ee.bear.middleground.comment.input;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ee.bear.architecture.DisposableBase;
import com.bytedance.ee.bear.basesdk.services.C4511g;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.contract.al;
import com.bytedance.ee.bear.contract.imageviewer.bean.ImageData;
import com.bytedance.ee.bear.domain.BearUrl;
import com.bytedance.ee.bear.facade.common.widget.Toast;
import com.bytedance.ee.bear.fileselector.bean.FileBean;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.list.p424c.AbstractC8149a;
import com.bytedance.ee.bear.middleground.comment.C9185d;
import com.bytedance.ee.bear.middleground.comment.audio.CommentAudio;
import com.bytedance.ee.bear.middleground.comment.control.DataControl;
import com.bytedance.ee.bear.middleground.comment.control.ICommentListeners;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReviewException;
import com.bytedance.ee.bear.middleground.comment.input.MentionTitleResult;
import com.bytedance.ee.bear.middleground.comment.p445c.AbstractC9106c;
import com.bytedance.ee.bear.middleground.comment.p449g.C9226a;
import com.bytedance.ee.bear.middleground.comment.p449g.C9229c;
import com.bytedance.ee.bear.middleground.comment.p449g.C9232e;
import com.bytedance.ee.bear.middleground.comment.uitls.CommentTo;
import com.bytedance.ee.bear.middleground.comment.uitls.Config;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7834f;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.p526r.C10599b;
import com.bytedance.ee.bear.widget.AtEditText;
import com.bytedance.ee.bear.widget.C11768b;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p701d.C13615c;
import com.bytedance.ee.util.p718t.C13742g;
import com.bytedance.ee.util.p718t.C13749l;
import com.larksuite.suite.R;
import io.reactivex.AbstractC68307f;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.AbstractC68309a;
import io.reactivex.functions.AbstractC68322n;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.koin.java.KoinJavaComponent;
import org.p3511d.AbstractC70020b;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001YB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010&\u001a\u00020'2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010)J\u001e\u0010*\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\b\u0010/\u001a\u00020'H\u0002J\u0006\u00100\u001a\u00020'J\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020 0)2\u000e\u00102\u001a\n\u0012\u0004\u0012\u000203\u0018\u00010)J\u000e\u00104\u001a\u0002052\u0006\u00106\u001a\u00020 J\f\u00107\u001a\b\u0012\u0004\u0012\u00020 0)J\u0006\u00108\u001a\u00020\u0013J\u0006\u00109\u001a\u00020\u0013J\u0006\u0010:\u001a\u00020\u0013J\u0016\u0010;\u001a\u00020'2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0013JH\u0010?\u001a\u00020'2\u0006\u0010@\u001a\u00020\b28\u0010A\u001a4\u0012\u0013\u0012\u00110,¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(E\u0012\u0015\u0012\u0013\u0018\u00010.¢\u0006\f\bC\u0012\b\bD\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020'0BJ\u0006\u0010F\u001a\u00020\u0013J\u0006\u0010G\u001a\u00020\u0013J\b\u0010H\u001a\u00020'H\u0016J\u000e\u0010I\u001a\u00020'2\u0006\u0010J\u001a\u00020 J\u0016\u0010K\u001a\u00020'2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010)JT\u0010L\u001a\u00020'2\b\u0010M\u001a\u0004\u0018\u00010N2\u001e\u0010O\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020'0P2\b\b\u0002\u0010Q\u001a\u00020\u00132\u0018\b\u0002\u0010R\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020'\u0018\u00010SJV\u0010T\u001a\u00020'2\b\u0010M\u001a\u0004\u0018\u00010N2\u001e\u0010O\u001a\u001a\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020'0P2\b\b\u0002\u0010Q\u001a\u00020\u00132\u0018\b\u0002\u0010R\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020'\u0018\u00010SH\u0002J\u0006\u0010U\u001a\u00020'J*\u0010V\u001a\u00020'2\u0006\u0010W\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010X\u001a\u0004\u0018\u00010NR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006Z"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/InputViewModel;", "Lcom/bytedance/ee/bear/architecture/DisposableBase;", "config", "Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "dataControl", "Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;Lcom/bytedance/ee/bear/middleground/comment/control/DataControl;)V", "createId", "", "currentDuration", "", "currentVoiceStr", "directional_reply_id", "getDirectional_reply_id", "()Ljava/lang/String;", "setDirectional_reply_id", "(Ljava/lang/String;)V", "duration", "hasCallBack", "", "value", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "inputRequest", "getInputRequest", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;", "setInputRequest", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentInputRequest;)V", "isInAudio", "isStop", "lastStr", "selectedImages", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean$CommentDetail$ExtraEntity$CommentImageEntity;", "sending", "getSending", "()Z", "setSending", "(Z)V", "addCommentImages", "", "list", "", "buildRichTextFromMentionData", "bearUrl", "Lcom/bytedance/ee/bear/domain/BearUrl;", "mentionTitleResult", "Lcom/bytedance/ee/bear/middleground/comment/input/MentionTitleResult;", "cancelRecord", "clearCommentImages", "convert2CommentImageEntities", "selectedImageItems", "Lcom/bytedance/ee/bear/fileselector/bean/FileBean;", "convert2ImageViewerData", "Lcom/bytedance/ee/bear/contract/imageviewer/bean/ImageData;", "selectedItem", "getCommentImages", "getInsertImageEnabled", "getShowCommentImageEnabled", "getVoiceEnabled", "handleInCommentFail", "commentListeners", "Lcom/bytedance/ee/bear/middleground/comment/control/ICommentListeners;", "reviewFail", "handlePasteContent", "content", "callback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "url", "isCreate", "isEditStatus", "onCleared", "removeCommentImage", "image", "resetItems", "sendComment", "inputEditText", "Lcom/bytedance/ee/bear/widget/AtEditText;", "sendCallBack", "Lkotlin/Function3;", "isAudio", "vipCb", "Lkotlin/Function1;", "sendStr", "stopRecord", "transformUrl2TitleForSpanSB", "origin", "atEditText", "Companion", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.input.c */
public final class InputViewModel extends DisposableBase {

    /* renamed from: e */
    public static final Companion f24969e = new Companion(null);

    /* renamed from: a */
    public String f24970a = "";

    /* renamed from: b */
    public List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> f24971b = new ArrayList();

    /* renamed from: c */
    public final Config f24972c;

    /* renamed from: d */
    public final DataControl f24973d;

    /* renamed from: f */
    private CommentInputRequest f24974f = new CommentInputRequest();

    /* renamed from: g */
    private boolean f24975g;

    /* renamed from: h */
    private boolean f24976h;

    /* renamed from: i */
    private boolean f24977i;

    /* renamed from: j */
    private boolean f24978j = true;

    /* renamed from: k */
    private int f24979k;

    /* renamed from: l */
    private int f24980l;

    /* renamed from: m */
    private String f24981m = "";

    /* renamed from: n */
    private String f24982n = "";

    /* renamed from: o */
    private String f24983o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/input/InputViewModel$Companion;", "", "()V", "TAG", "", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    public final CommentInputRequest mo35444b() {
        return this.f24974f;
    }

    /* renamed from: c */
    public final boolean mo35447c() {
        return this.f24975g;
    }

    /* renamed from: d */
    public final String mo35448d() {
        return this.f24983o;
    }

    /* renamed from: f */
    public final List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> mo35450f() {
        return this.f24971b;
    }

    @Override // com.bytedance.ee.bear.architecture.DisposableBase
    /* renamed from: a */
    public void mo16330a() {
        super.mo16330a();
        this.f24983o = "";
    }

    /* renamed from: g */
    public final void mo35451g() {
        this.f24971b.clear();
    }

    /* renamed from: h */
    public final boolean mo35452h() {
        return this.f24972c.mo35347x();
    }

    /* renamed from: i */
    public final boolean mo35453i() {
        return this.f24972c.mo35348y();
    }

    /* renamed from: j */
    public final boolean mo35454j() {
        return this.f24974f.isEdit();
    }

    /* renamed from: k */
    public final boolean mo35455k() {
        return this.f24974f.isCreate();
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$h */
    public static final class C9295h implements AbstractC68309a {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24997a;

        /* renamed from: b */
        final /* synthetic */ Function3 f24998b;

        C9295h(InputViewModel cVar, Function3 oVar) {
            this.f24997a = cVar;
            this.f24998b = oVar;
        }

        @Override // io.reactivex.functions.AbstractC68309a
        public final void run() {
            this.f24998b.invoke(true, "", false);
            this.f24997a.mo35457m();
        }
    }

    /* renamed from: m */
    public final void mo35457m() {
        this.f24978j = true;
        this.f24976h = false;
        this.f24977i = false;
        this.f24979k = 0;
        this.f24980l = 0;
        this.f24981m = "";
        this.f24982n = "";
        this.f24970a = "";
        CommentAudio.f24366a.mo34593b();
    }

    /* renamed from: e */
    public final boolean mo35449e() {
        if (this.f24972c.mo35339q()) {
            AbstractC9106c a = C9185d.m37997a();
            Intrinsics.checkExpressionValueIsNotNull(a, "CommentServiceImpl.getCommentService()");
            if (a.mo34732e() != 2) {
                al d = C4511g.m18594d();
                Intrinsics.checkExpressionValueIsNotNull(d, "InfoProvideServiceImp.getInstance()");
                if (!d.mo17342C()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: l */
    public final void mo35456l() {
        if (!this.f24978j) {
            this.f24979k += this.f24980l;
            this.f24980l = 0;
            this.f24981m = this.f24981m + this.f24982n;
            this.f24982n = "";
            this.f24978j = true;
            CommentAudio.f24366a.mo34591a();
        }
    }

    /* renamed from: a */
    public final void mo35439a(String str) {
        this.f24983o = str;
    }

    /* renamed from: a */
    public final void mo35436a(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
        Intrinsics.checkParameterIsNotNull(commentImageEntity, "image");
        this.f24971b.remove(commentImageEntity);
    }

    /* renamed from: b */
    public final void mo35445b(List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        if (list != null) {
            list.isEmpty();
            this.f24971b.addAll(list);
        }
    }

    /* renamed from: c */
    public final void mo35446c(List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list) {
        this.f24971b.clear();
        if (list != null) {
            this.f24971b.addAll(list);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$f */
    public static final class C9293f<T> implements Consumer<String> {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24993a;

        /* renamed from: b */
        final /* synthetic */ Function3 f24994b;

        C9293f(InputViewModel cVar, Function3 oVar) {
            this.f24993a = cVar;
            this.f24994b = oVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            Function3 oVar = this.f24994b;
            Intrinsics.checkExpressionValueIsNotNull(str, "it");
            oVar.invoke(true, str, false);
            this.f24993a.mo35457m();
        }
    }

    /* renamed from: a */
    public final void mo35437a(CommentInputRequest commentInputRequest) {
        Intrinsics.checkParameterIsNotNull(commentInputRequest, "value");
        String str = commentInputRequest.content;
        if (str == null) {
            str = "";
        }
        this.f24981m = str;
        this.f24974f = commentInputRequest;
    }

    /* renamed from: b */
    public final ImageData mo35443b(CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity) {
        Intrinsics.checkParameterIsNotNull(commentImageEntity, "selectedItem");
        ImageData a = C9229c.m38281a(commentImageEntity, this.f24971b);
        Intrinsics.checkExpressionValueIsNotNull(a, "CommentImageModelConvert…ctedItem, selectedImages)");
        return a;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "test"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$b */
    public static final class C9288b<T> implements AbstractC68322n<String> {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24984a;

        C9288b(InputViewModel cVar) {
            this.f24984a = cVar;
        }

        /* renamed from: a */
        public final boolean test(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            if (TextUtils.isEmpty(str) && this.f24984a.f24971b.isEmpty()) {
                return false;
            }
            if (str.length() <= 10000) {
                return true;
            }
            Toast.showFailureText(C13615c.f35773a, C13749l.m55745a((Context) C13615c.f35773a, (int) R.string.Doc_Comment_Send_Limit_Fail), 0);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$e */
    public static final class C9291e<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24989a;

        C9291e(InputViewModel cVar) {
            this.f24989a = cVar;
        }

        /* renamed from: a */
        public final String apply(final String str) {
            final Action action;
            Intrinsics.checkParameterIsNotNull(str, "it");
            if (this.f24989a.mo35454j()) {
                action = Action.EDIT;
            } else {
                action = Action.PUBLISH;
            }
            C13742g.m55705a(new Runnable(this) {
                /* class com.bytedance.ee.bear.middleground.comment.input.InputViewModel.C9291e.RunnableC92921 */

                /* renamed from: a */
                final /* synthetic */ C9291e f24990a;

                {
                    this.f24990a = r1;
                }

                public final void run() {
                    DataControl cVar = this.f24990a.f24989a.f24973d;
                    String str = str;
                    Intrinsics.checkExpressionValueIsNotNull(str, "it");
                    cVar.mo34705a(str, action);
                }
            });
            return this.f24989a.f24970a;
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "accept"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$g */
    public static final class C9294g<T> implements Consumer<Throwable> {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24995a;

        /* renamed from: b */
        final /* synthetic */ Function3 f24996b;

        C9294g(InputViewModel cVar, Function3 oVar) {
            this.f24995a = cVar;
            this.f24996b = oVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Action action;
            if (this.f24995a.mo35454j()) {
                action = Action.EDIT;
            } else {
                action = Action.PUBLISH;
            }
            DataControl cVar = this.f24995a.f24973d;
            String message = th.getMessage();
            if (message == null) {
                message = "{}";
            }
            cVar.mo34705a(message, action);
            this.f24996b.invoke(false, "", Boolean.valueOf(th instanceof ReviewException));
            C13479a.m54759a("InputViewModel", "send comment error", th);
        }
    }

    /* renamed from: a */
    public final List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> mo35434a(List<? extends FileBean> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            list.isEmpty();
            for (T t : list) {
                CommentBean.CommentDetail.ExtraEntity.CommentImageEntity commentImageEntity = new CommentBean.CommentDetail.ExtraEntity.CommentImageEntity();
                commentImageEntity.setSrc(t.getPath());
                commentImageEntity.setUuid(t.getUuid());
                arrayList.add(commentImageEntity);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lio/reactivex/Flowable;", "", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$c */
    public static final class C9289c<T, R> implements Function<T, AbstractC70020b<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24985a;

        /* renamed from: b */
        final /* synthetic */ AtEditText f24986b;

        /* renamed from: c */
        final /* synthetic */ boolean f24987c;

        C9289c(InputViewModel cVar, AtEditText atEditText, boolean z) {
            this.f24985a = cVar;
            this.f24986b = atEditText;
            this.f24987c = z;
        }

        /* renamed from: a */
        public final AbstractC68307f<String> apply(String str) {
            String str2;
            boolean z;
            String str3;
            String str4;
            Intrinsics.checkParameterIsNotNull(str, "it");
            this.f24986b.setText("");
            String str5 = this.f24985a.mo35444b().comment_id;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = this.f24985a.mo35444b().reply_id;
            if (str6 != null) {
                str2 = str6;
            } else {
                str2 = "";
            }
            if (this.f24985a.mo35454j()) {
                return this.f24985a.f24973d.mo34696a(str5, str2, str, this.f24985a.f24971b, this.f24985a.mo35444b().is_whole, this.f24987c, this.f24985a.mo35444b().bizParams);
            }
            if (str5.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.f24985a.mo35444b().isCreate()) {
                C13479a.m54764b("InputViewModel", "createComment");
                DataControl cVar = this.f24985a.f24973d;
                List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list = this.f24985a.f24971b;
                boolean z2 = this.f24985a.mo35444b().is_whole;
                String str7 = this.f24985a.mo35444b().tmpCommentId;
                if (str7 != null) {
                    str3 = str7;
                } else {
                    str3 = "";
                }
                String str8 = this.f24985a.mo35444b().quote;
                if (str8 != null) {
                    str4 = str8;
                } else {
                    str4 = "";
                }
                return cVar.mo34699a(str, list, z2, str3, str4, this.f24987c, this.f24985a.mo35444b().parent_type, this.f24985a.mo35444b().parent_token, this.f24985a.mo35444b().comment_id, this.f24985a.mo35444b().reply_id, this.f24985a.mo35444b().local_comment_id, this.f24985a.mo35444b().position, this.f24985a.mo35444b().bizParams);
            }
            C13479a.m54764b("InputViewModel", "replyComment");
            DataControl cVar2 = this.f24985a.f24973d;
            List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list2 = this.f24985a.f24971b;
            boolean z3 = this.f24985a.mo35444b().is_whole;
            String str9 = this.f24985a.mo35444b().tmpCommentId;
            if (str9 == null) {
                str9 = "";
            }
            String str10 = this.f24985a.mo35444b().quote;
            if (str10 == null) {
                str10 = "";
            }
            return cVar2.mo34698a(str, list2, str5, z3, str9, str10, this.f24987c, this.f24985a.mo35444b().reply_id, this.f24985a.mo35444b().position, this.f24985a.mo35444b().bizParams);
        }
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "res", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.c$d */
    public static final class C9290d<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ InputViewModel f24988a;

        C9290d(InputViewModel cVar) {
            this.f24988a = cVar;
        }

        /* renamed from: a */
        public final String apply(String str) {
            CommentBean comment;
            String comment_id;
            String str2;
            int i;
            boolean z;
            boolean z2;
            List<CommentBean.CommentDetail> comment_list;
            String comment_id2;
            Intrinsics.checkParameterIsNotNull(str, "res");
            DataEntity.C9219Entity.BodyEntity.ResultEntity c = CommentTo.f24850a.mo35312c(str);
            String str3 = "";
            if (c != null) {
                C8275a aVar = C8275a.f22375h;
                Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
                if (aVar.mo32553a().equals(this.f24988a.f24972c.mo35332j().mo32553a())) {
                    CommentBean comment2 = c.getComment();
                    if (comment2 == null || (comment_id2 = comment2.getComment_id()) == null) {
                        str2 = str3;
                    } else {
                        str2 = comment_id2;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        CommentBean comment3 = c.getComment();
                        boolean z3 = false;
                        if (comment3 == null || (comment_list = comment3.getComment_list()) == null) {
                            i = 0;
                        } else {
                            i = comment_list.size();
                        }
                        if (i > 0) {
                            if (this.f24988a.mo35454j()) {
                                C9226a e = this.f24988a.f24972c.mo35325e();
                                String str4 = this.f24988a.mo35444b().comment_id;
                                if (str4 == null) {
                                    str4 = str3;
                                }
                                String str5 = this.f24988a.mo35444b().reply_id;
                                if (str5 == null) {
                                    str5 = str3;
                                }
                                e.mo35302a("edit_confirm", str4, str5, null);
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                CommentBean comment4 = c.getComment();
                                Intrinsics.checkExpressionValueIsNotNull(comment4, "it.comment");
                                if (comment4.getComment_list().size() == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                linkedHashMap.put("is_first_flag", String.valueOf(z));
                                List<CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list = this.f24988a.f24971b;
                                if (list == null || list.isEmpty()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                linkedHashMap.put("is_content_image_flag", String.valueOf(!z2));
                                if (this.f24988a.f24972c.mo35340r().mo35307a() && this.f24988a.f24972c.mo35340r().mo35309b()) {
                                    z3 = true;
                                }
                                linkedHashMap.put("is_part_image_flag", String.valueOf(z3));
                                C9226a e2 = this.f24988a.f24972c.mo35325e();
                                CommentBean comment5 = c.getComment();
                                Intrinsics.checkExpressionValueIsNotNull(comment5, "it.comment");
                                String comment_id3 = comment5.getComment_id();
                                CommentBean comment6 = c.getComment();
                                Intrinsics.checkExpressionValueIsNotNull(comment6, "it.comment");
                                List<CommentBean.CommentDetail> comment_list2 = comment6.getComment_list();
                                CommentBean comment7 = c.getComment();
                                Intrinsics.checkExpressionValueIsNotNull(comment7, "it.comment");
                                List<CommentBean.CommentDetail> comment_list3 = comment7.getComment_list();
                                Intrinsics.checkExpressionValueIsNotNull(comment_list3, "it.comment.comment_list");
                                CommentBean.CommentDetail commentDetail = comment_list2.get(CollectionsKt.getLastIndex(comment_list3));
                                Intrinsics.checkExpressionValueIsNotNull(commentDetail, "it.comment.comment_list[…t.comment_list.lastIndex]");
                                e2.mo35302a("add_comment", comment_id3, commentDetail.getReply_id(), linkedHashMap);
                            }
                        }
                    }
                }
            }
            InputViewModel cVar = this.f24988a;
            if (!(c == null || (comment = c.getComment()) == null || (comment_id = comment.getComment_id()) == null)) {
                str3 = comment_id;
            }
            cVar.f24970a = str3;
            return str;
        }
    }

    /* renamed from: a */
    public final void mo35442a(boolean z) {
        this.f24975g = z;
    }

    public InputViewModel(Config fVar, DataControl cVar) {
        Intrinsics.checkParameterIsNotNull(fVar, "config");
        Intrinsics.checkParameterIsNotNull(cVar, "dataControl");
        this.f24972c = fVar;
        this.f24973d = cVar;
    }

    /* renamed from: a */
    private final String m38428a(BearUrl bearUrl, MentionTitleResult mentionTitleResult) {
        String str;
        if (!(bearUrl == null || mentionTitleResult == null || mentionTitleResult.data == null)) {
            Serializable serializable = mentionTitleResult.data;
            if (serializable == null) {
                Intrinsics.throwNpe();
            }
            MentionTitleResult.MentionData mentionData = (MentionTitleResult.MentionData) serializable;
            int b = C10599b.m43903b(C8275a.m34055d(bearUrl.f17446a));
            String str2 = bearUrl.f17447b;
            if (!TextUtils.isEmpty(mentionData.getTitle())) {
                str = mentionData.getTitle();
            } else {
                str = ((AbstractC8149a) KoinJavaComponent.m268613a(AbstractC8149a.class, null, null, 6, null)).mo31517c(C13615c.f35773a, mentionData.getType());
            }
            if (str != null) {
                return new C7834f().apply(new C7827a(str, new C4517a[]{new C4517a.C4518a().mo17391a(0).mo17395b(str.length()).mo17398c(b).mo17392a(str2).mo17396b(mentionData.getUrl()).mo17399c(str).mo17403e(mentionData.getIcon_type()).mo17407h(mentionData.getIcon_key()).mo17406g(mentionData.getIcon_fsunit()).mo17394a()}, new C7838i[0]));
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo35435a(ICommentListeners fVar, boolean z) {
        Intrinsics.checkParameterIsNotNull(fVar, "commentListeners");
        C13479a.m54758a("InputViewModel", "send comment error");
        fVar.mo34280D().invoke("", false);
        if ((!Intrinsics.areEqual(this.f24972c.mo35332j(), C8275a.f22371d)) && (!Intrinsics.areEqual(this.f24972c.mo35332j(), C8275a.f22377j)) && (!Intrinsics.areEqual(this.f24972c.mo35332j(), C8275a.f22372e))) {
            if (z) {
                ((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39497a(this.f24972c.mo35279a());
            } else if (this.f24972c.mo35338p()) {
                Toast.showFailureText(this.f24972c.mo35279a(), this.f24972c.mo35279a().getString(R.string.Doc_Comment_CommentSendFailed), 0);
            }
        }
    }

    /* renamed from: a */
    public final void mo35441a(String str, Function2<? super BearUrl, ? super MentionTitleResult, Unit> kVar) {
        Intrinsics.checkParameterIsNotNull(str, "content");
        Intrinsics.checkParameterIsNotNull(kVar, "callback");
        mo16331a(C9185d.m37997a().mo34727a(str, kVar));
    }

    /* renamed from: b */
    private final void m38429b(AtEditText atEditText, Function3<? super Boolean, ? super String, ? super Boolean, Unit> oVar, boolean z, Function1<? super String, Unit> function1) {
        AbstractC68307f fVar;
        AbstractC68307f<R> d;
        Single<String> richText;
        AbstractC68307f<String> flowable;
        AbstractC68307f<String> a;
        AbstractC68307f<R> c;
        Disposable disposable = null;
        if (atEditText == null || (richText = atEditText.getRichText()) == null || (flowable = richText.toFlowable()) == null || (a = flowable.mo237998a(new C9288b(this))) == null || (c = a.mo238014c(new C9289c(this, atEditText, z))) == null) {
            fVar = null;
        } else {
            fVar = c.mo238020d(new C9290d(this));
        }
        AbstractC68307f<String> a2 = C9232e.m38292a(fVar, function1);
        if (!(a2 == null || (d = a2.mo238020d(new C9291e(this))) == null)) {
            disposable = d.mo237978a(new C9293f(this, oVar), new C9294g(this, oVar), new C9295h(this, oVar));
        }
        mo16331a(disposable);
    }

    /* renamed from: a */
    public final void mo35438a(AtEditText atEditText, Function3<? super Boolean, ? super String, ? super Boolean, Unit> oVar, boolean z, Function1<? super String, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(oVar, "sendCallBack");
        this.f24977i = false;
        mo35456l();
        m38429b(atEditText, oVar, z, function1);
    }

    /* renamed from: a */
    public final void mo35440a(String str, BearUrl bearUrl, MentionTitleResult mentionTitleResult, AtEditText atEditText) {
        boolean z;
        String str2;
        C11768b presenter;
        C11768b presenter2;
        Single<String> i;
        Intrinsics.checkParameterIsNotNull(str, "origin");
        Intrinsics.checkParameterIsNotNull(bearUrl, "bearUrl");
        String a = m38428a(bearUrl, mentionTitleResult);
        int i2 = 0;
        if (a == null || a.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str3 = null;
            if (atEditText == null || (presenter2 = atEditText.getPresenter()) == null || (i = presenter2.mo45044i()) == null) {
                str2 = null;
            } else {
                str2 = i.blockingGet();
            }
            if (str2 != null) {
                i2 = StringsKt.lastIndexOf$default((CharSequence) str2, str, 0, false, 6, (Object) null);
            }
            if (str2 != null) {
                int length = str.length() + i2;
                if (str2 != null) {
                    str3 = StringsKt.replaceRange((CharSequence) str2, i2, length, (CharSequence) a).toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
            if (atEditText != null && (presenter = atEditText.getPresenter()) != null) {
                presenter.mo45041b(str3);
            }
        }
    }
}
