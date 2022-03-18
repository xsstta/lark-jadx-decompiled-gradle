package com.bytedance.ee.bear.middleground.comment.export;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.list.dto.C8275a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b:\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\\\u001a\u00020\u00002\u0006\u0010]\u001a\u00020\u000eJ\u000e\u0010^\u001a\u00020\u00002\u0006\u0010_\u001a\u00020\u0014J\u000e\u0010`\u001a\u00020\u00002\u0006\u0010a\u001a\u00020\u001cJ\u000e\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020\u000eJ\u0014\u0010d\u001a\u00020\u00002\f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000e0%J\u000e\u0010f\u001a\u00020\u00002\u0006\u0010g\u001a\u00020\u000eJ\u000e\u0010h\u001a\u00020\u00002\u0006\u0010i\u001a\u00020\u000eJ\u000e\u0010j\u001a\u00020\u00002\u0006\u0010k\u001a\u000201J\u000e\u0010l\u001a\u00020\u00002\u0006\u0010m\u001a\u000207J/\u0010n\u001a\u00020\u00002'\u0010o\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0>¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020B0=J\u000e\u0010p\u001a\u00020\u00002\u0006\u0010q\u001a\u00020\u000eJ\u000e\u0010r\u001a\u00020\u00002\u0006\u0010s\u001a\u00020\u000eJ\u000e\u0010t\u001a\u00020\u00002\u0006\u0010u\u001a\u00020\u000eJ\u000e\u0010v\u001a\u00020\u00002\u0006\u0010w\u001a\u00020\u0014J\u000e\u0010x\u001a\u00020\u00002\u0006\u0010y\u001a\u00020\u001cJ\u000e\u0010z\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R \u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0010\"\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0010\"\u0004\b/\u0010\u0012R\u001a\u00100\u001a\u000201X.¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u00106\u001a\u000207X.¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R;\u0010<\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001c0>¢\u0006\f\b?\u0012\b\b@\u0012\u0004\b\b(A\u0012\u0004\u0012\u00020B0=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010G\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u0010\"\u0004\bI\u0010\u0012R\u001a\u0010J\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u0010\"\u0004\bL\u0010\u0012R\u001a\u0010M\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u0010\"\u0004\bO\u0010\u0012R \u0010P\u001a\u00020\u0014X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bQ\u0010\u0016\u001a\u0004\bR\u0010\u0018\"\u0004\bS\u0010\u001aR\u001a\u0010T\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u001e\"\u0004\bV\u0010 R\u001a\u0010W\u001a\u00020\u001cX.¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u001e\"\u0004\bY\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[¨\u0006|"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/CommentBuilder;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "viewParent", "Landroid/widget/FrameLayout;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentManager;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "mAudioAvailable", "", "getMAudioAvailable", "()Z", "setMAudioAvailable", "(Z)V", "mCommentType", "", "mCommentType$annotations", "()V", "getMCommentType", "()J", "setMCommentType", "(J)V", "mDocUrl", "", "getMDocUrl", "()Ljava/lang/String;", "setMDocUrl", "(Ljava/lang/String;)V", "mEnableFontScale", "getMEnableFontScale", "setMEnableFontScale", "mIsOwner", "Lkotlin/Function0;", "getMIsOwner", "()Lkotlin/jvm/functions/Function0;", "setMIsOwner", "(Lkotlin/jvm/functions/Function0;)V", "mIsWiki", "getMIsWiki", "setMIsWiki", "mNewCardUi", "getMNewCardUi", "setMNewCardUi", "mPageType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "getMPageType", "()Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setMPageType", "(Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "mPermission", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "getMPermission", "()Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "setMPermission", "(Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;)V", "mReadMessage", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "messageIds", "", "getMReadMessage", "()Lkotlin/jvm/functions/Function1;", "setMReadMessage", "(Lkotlin/jvm/functions/Function1;)V", "mShowCommentImage", "getMShowCommentImage", "setMShowCommentImage", "mShowInsertImage", "getMShowInsertImage", "setMShowInsertImage", "mShowReaction", "getMShowReaction", "setMShowReaction", "mStyleType", "mStyleType$annotations", "getMStyleType", "setMStyleType", "mSubFileType", "getMSubFileType", "setMSubFileType", "mToken", "getMToken", "setMToken", "getViewParent", "()Landroid/widget/FrameLayout;", "setAudioAvailable", "audioAvailable", "setCommentType", "commentType", "setDocUrl", "url", "setEnableFontScale", "enableFontScale", "setIsOwner", "isOwner", "setIsWiki", "isWiki", "setNewCardUi", "newCardUi", "setPageType", "pageType", "setPermission", "per", "setReadMessage", "readMessage", "setShowCommentImage", "showCommentImage", "setShowInsertImage", "showInsertImage", "setShowReaction", "showReaction", "setStyleType", "styleType", "setSubFileType", "subFileType", "setToken", "token", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.b */
public final class CommentBuilder {

    /* renamed from: a */
    public String f24790a;

    /* renamed from: b */
    public String f24791b;

    /* renamed from: c */
    public C8275a f24792c;

    /* renamed from: d */
    public ICommentPermission f24793d;

    /* renamed from: e */
    private boolean f24794e;

    /* renamed from: f */
    private String f24795f = "";

    /* renamed from: g */
    private long f24796g = 1;

    /* renamed from: h */
    private long f24797h;

    /* renamed from: i */
    private boolean f24798i = true;

    /* renamed from: j */
    private boolean f24799j;

    /* renamed from: k */
    private boolean f24800k;

    /* renamed from: l */
    private boolean f24801l;

    /* renamed from: m */
    private boolean f24802m = true;

    /* renamed from: n */
    private boolean f24803n;

    /* renamed from: o */
    private Function0<Boolean> f24804o = C9217a.INSTANCE;

    /* renamed from: p */
    private Function1<? super List<String>, Unit> f24805p = C9218b.INSTANCE;

    /* renamed from: q */
    private final FragmentActivity f24806q;

    /* renamed from: r */
    private final FrameLayout f24807r;

    /* renamed from: s */
    private final FragmentManager f24808s;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.export.b$a */
    static final class C9217a extends Lambda implements Function0<Boolean> {
        public static final C9217a INSTANCE = new C9217a();

        C9217a() {
            super(0);
        }

        /* Return type fixed from 'boolean' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return false;
        }
    }

    /* renamed from: c */
    public final long mo34948c() {
        return this.f24796g;
    }

    /* renamed from: d */
    public final long mo34951d() {
        return this.f24797h;
    }

    /* renamed from: h */
    public final boolean mo34959h() {
        return this.f24801l;
    }

    /* renamed from: i */
    public final boolean mo34960i() {
        return this.f24802m;
    }

    /* renamed from: j */
    public final boolean mo34961j() {
        return this.f24803n;
    }

    /* renamed from: k */
    public final Function0<Boolean> mo34962k() {
        return this.f24804o;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.util.List<java.lang.String>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.List<java.lang.String>, kotlin.Unit> */
    /* renamed from: l */
    public final Function1<List<String>, Unit> mo34963l() {
        return this.f24805p;
    }

    /* renamed from: m */
    public final FragmentActivity mo34964m() {
        return this.f24806q;
    }

    /* renamed from: n */
    public final FrameLayout mo34965n() {
        return this.f24807r;
    }

    /* renamed from: o */
    public final FragmentManager mo34966o() {
        return this.f24808s;
    }

    /* renamed from: e */
    public final boolean mo34954e() {
        return this.f24798i;
    }

    /* renamed from: f */
    public final boolean mo34956f() {
        return this.f24799j;
    }

    /* renamed from: g */
    public final boolean mo34958g() {
        return this.f24800k;
    }

    /* renamed from: b */
    public final String mo34947b() {
        return this.f24795f;
    }

    /* renamed from: a */
    public final boolean mo34943a() {
        return this.f24794e;
    }

    /* renamed from: a */
    public final CommentBuilder mo34936a(long j) {
        this.f24796g = j;
        return this;
    }

    /* renamed from: b */
    public final CommentBuilder mo34944b(long j) {
        this.f24797h = j;
        return this;
    }

    /* renamed from: e */
    public final CommentBuilder mo34953e(boolean z) {
        this.f24801l = z;
        return this;
    }

    /* renamed from: f */
    public final CommentBuilder mo34955f(boolean z) {
        this.f24802m = z;
        return this;
    }

    /* renamed from: g */
    public final CommentBuilder mo34957g(boolean z) {
        this.f24803n = z;
        return this;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.export.b$b */
    static final class C9218b extends Lambda implements Function1<List<? extends String>, Unit> {
        public static final C9218b INSTANCE = new C9218b();

        C9218b() {
            super(1);
        }

        public final void invoke(List<String> list) {
            Intrinsics.checkParameterIsNotNull(list, "it");
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list) {
            invoke((List<String>) list);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final CommentBuilder mo34937a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "pageType");
        this.f24792c = aVar;
        return this;
    }

    /* renamed from: b */
    public final CommentBuilder mo34945b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f24791b = str;
        return this;
    }

    /* renamed from: c */
    public final CommentBuilder mo34949c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "subFileType");
        this.f24795f = str;
        return this;
    }

    /* renamed from: d */
    public final CommentBuilder mo34952d(boolean z) {
        this.f24800k = z;
        return this;
    }

    /* renamed from: a */
    public final CommentBuilder mo34938a(ICommentPermission hVar) {
        Intrinsics.checkParameterIsNotNull(hVar, "per");
        this.f24793d = hVar;
        return this;
    }

    /* renamed from: b */
    public final CommentBuilder mo34946b(boolean z) {
        this.f24798i = z;
        return this;
    }

    /* renamed from: c */
    public final CommentBuilder mo34950c(boolean z) {
        this.f24799j = z;
        return this;
    }

    /* renamed from: a */
    public final CommentBuilder mo34939a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "token");
        this.f24790a = str;
        return this;
    }

    /* renamed from: a */
    public final CommentBuilder mo34940a(Function0<Boolean> function0) {
        Intrinsics.checkParameterIsNotNull(function0, "isOwner");
        this.f24804o = function0;
        return this;
    }

    /* renamed from: a */
    public final CommentBuilder mo34941a(Function1<? super List<String>, Unit> function1) {
        Intrinsics.checkParameterIsNotNull(function1, "readMessage");
        this.f24805p = function1;
        return this;
    }

    /* renamed from: a */
    public final CommentBuilder mo34942a(boolean z) {
        this.f24794e = z;
        return this;
    }

    public CommentBuilder(FragmentActivity fragmentActivity, FrameLayout frameLayout, FragmentManager fragmentManager) {
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "viewParent");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        this.f24806q = fragmentActivity;
        this.f24807r = frameLayout;
        this.f24808s = fragmentManager;
    }
}
