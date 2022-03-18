package com.bytedance.ee.bear.middleground.comment.uitls;

import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ee.bear.facade.common.widget.p382a.C7728a;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.ICommentConfig;
import com.bytedance.ee.bear.middleground.comment.export.ICommentPermission;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import com.bytedance.ee.bear.p522q.p523a.AbstractC10550f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0002\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\u000f\u0012\b\b\u0002\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\b\b\u0002\u0010$\u001a\u00020\u000f\u0012\b\b\u0002\u0010%\u001a\u00020\u000f\u0012\b\b\u0002\u0010&\u001a\u00020\u000f\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010*J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0012HÆ\u0003J\t\u0010{\u001a\u00020\u0012HÆ\u0003J\t\u0010|\u001a\u00020\u0015HÆ\u0003J\t\u0010}\u001a\u00020\u0017HÆ\u0003J\t\u0010~\u001a\u00020\u000fHÆ\u0003J\t\u0010\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u001fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0001\u001a\u00020\nHÆ\u0003J¦\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000f2\b\b\u0002\u0010$\u001a\u00020\u000f2\b\b\u0002\u0010%\u001a\u00020\u000f2\b\b\u0002\u0010&\u001a\u00020\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0016\u0010\u0001\u001a\u00020\u000f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020UHÖ\u0001J\n\u0010\u0001\u001a\u00020\nHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010)\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010#\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010 \u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\u0011\u0010&\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b?\u00106R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u001a\u0010\u0019\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00106\"\u0004\bE\u0010FR\u0013\u0010'\u001a\u0004\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b'\u0010GR\u001a\u0010\u0018\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u00106\"\u0004\bH\u0010FR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u00106\"\u0004\bI\u0010FR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020MX\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020UX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001a\u0010Z\u001a\u00020UX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010W\"\u0004\b\\\u0010YR\u001a\u0010]\u001a\u00020UX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010W\"\u0004\b_\u0010YR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u001a\u0010!\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u00106\"\u0004\bc\u0010FR\u001a\u0010%\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00106\"\u0004\be\u0010FR\u001a\u0010$\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00106\"\u0004\bg\u0010FR\u001a\u0010\u001d\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00106\"\u0004\bi\u0010FR\u001a\u0010\u001a\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00106\"\u0004\bk\u0010FR\u001a\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00108\"\u0004\bm\u0010:R\u001a\u0010\u0010\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010.\"\u0004\bo\u00100R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010.\"\u0004\bq\u00100R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010\"\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u00106\"\u0004\bw\u0010FR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bx\u0010C¨\u0006\u0001"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/uitls/Config;", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentConfig;", "activity", "Landroidx/fragment/app/FragmentActivity;", "viewParent", "Landroid/widget/FrameLayout;", "imageViewerParent", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "token", "", "docUrl", "pageType", "Lcom/bytedance/ee/bear/list/dto/DocumentType;", "isWiki", "", "subFileType", "commentType", "", "styleType", "per", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "keyboardHeightProvider", "Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "isVC", "inCCM", "showVoice", "area", "Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentArea;", "showReaction", "translate", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "currentCommentId", "showBlank", "useCustomHeight", "audioAvailable", "showInsertImage", "showCommentImage", "enableFontScale", "isOwner", "Lcom/bytedance/ee/bear/middleground/comment/uitls/IsOwner;", "appId", "(Landroidx/fragment/app/FragmentActivity;Landroid/widget/FrameLayout;Landroid/widget/FrameLayout;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Ljava/lang/String;Lcom/bytedance/ee/bear/list/dto/DocumentType;ZLjava/lang/String;JJLcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;ZZZLcom/bytedance/ee/bear/middleground/comment/uitls/CommentArea;ZLcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;Ljava/lang/String;ZZZZZZLcom/bytedance/ee/bear/middleground/comment/uitls/IsOwner;Ljava/lang/String;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "getArea", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentArea;", "setArea", "(Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentArea;)V", "getAudioAvailable", "()Z", "getCommentType", "()J", "setCommentType", "(J)V", "getCurrentCommentId", "setCurrentCommentId", "getDocUrl", "setDocUrl", "getEnableFontScale", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getImageViewerParent", "()Landroid/widget/FrameLayout;", "getInCCM", "setInCCM", "(Z)V", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/IsOwner;", "setVC", "setWiki", "getKeyboardHeightProvider", "()Lcom/bytedance/ee/bear/util/keyboard/KeyboardHeightProvider;", "mCommentAnalytic", "Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentAnalytic;", "getMCommentAnalytic", "()Lcom/bytedance/ee/bear/middleground/comment/uitls/CommentAnalytic;", "getPageType", "()Lcom/bytedance/ee/bear/list/dto/DocumentType;", "setPageType", "(Lcom/bytedance/ee/bear/list/dto/DocumentType;)V", "panelDefaultHeight", "", "getPanelDefaultHeight", "()I", "setPanelDefaultHeight", "(I)V", "panelMaxHeight", "getPanelMaxHeight", "setPanelMaxHeight", "panelMinHeight", "getPanelMinHeight", "setPanelMinHeight", "getPer", "()Lcom/bytedance/ee/bear/middleground/comment/export/ICommentPermission;", "getShowBlank", "setShowBlank", "getShowCommentImage", "setShowCommentImage", "getShowInsertImage", "setShowInsertImage", "getShowReaction", "setShowReaction", "getShowVoice", "setShowVoice", "getStyleType", "setStyleType", "getSubFileType", "setSubFileType", "getToken", "setToken", "getTranslate", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "setTranslate", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;)V", "getUseCustomHeight", "setUseCustomHeight", "getViewParent", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.g.f */
public final class Config implements ICommentConfig {

    /* renamed from: A */
    private final boolean f24854A;

    /* renamed from: B */
    private boolean f24855B;

    /* renamed from: C */
    private boolean f24856C;

    /* renamed from: D */
    private final boolean f24857D;

    /* renamed from: E */
    private final AbstractC9234g f24858E;

    /* renamed from: F */
    private String f24859F;

    /* renamed from: a */
    private int f24860a;

    /* renamed from: b */
    private int f24861b;

    /* renamed from: c */
    private int f24862c;

    /* renamed from: d */
    private final C9226a f24863d;

    /* renamed from: e */
    private final FragmentActivity f24864e;

    /* renamed from: f */
    private final FrameLayout f24865f;

    /* renamed from: g */
    private final FrameLayout f24866g;

    /* renamed from: h */
    private final FragmentManager f24867h;

    /* renamed from: i */
    private String f24868i;

    /* renamed from: j */
    private String f24869j;

    /* renamed from: k */
    private C8275a f24870k;

    /* renamed from: l */
    private boolean f24871l;

    /* renamed from: m */
    private String f24872m;

    /* renamed from: n */
    private long f24873n;

    /* renamed from: o */
    private long f24874o;

    /* renamed from: p */
    private final ICommentPermission f24875p;

    /* renamed from: q */
    private final AbstractC10550f f24876q;

    /* renamed from: r */
    private boolean f24877r;

    /* renamed from: s */
    private boolean f24878s;

    /* renamed from: t */
    private boolean f24879t;

    /* renamed from: u */
    private CommentArea f24880u;

    /* renamed from: v */
    private boolean f24881v;

    /* renamed from: w */
    private TranslateConfig f24882w;

    /* renamed from: x */
    private String f24883x;

    /* renamed from: y */
    private boolean f24884y;

    /* renamed from: z */
    private boolean f24885z;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Config) {
                Config fVar = (Config) obj;
                if (Intrinsics.areEqual(mo35279a(), fVar.mo35279a()) && Intrinsics.areEqual(this.f24865f, fVar.f24865f) && Intrinsics.areEqual(this.f24866g, fVar.f24866g) && Intrinsics.areEqual(this.f24867h, fVar.f24867h) && Intrinsics.areEqual(mo35329h(), fVar.mo35329h()) && Intrinsics.areEqual(mo35331i(), fVar.mo35331i()) && Intrinsics.areEqual(this.f24870k, fVar.f24870k)) {
                    if ((this.f24871l == fVar.f24871l) && Intrinsics.areEqual(this.f24872m, fVar.f24872m)) {
                        if (this.f24873n == fVar.f24873n) {
                            if ((mo35334l() == fVar.mo35334l()) && Intrinsics.areEqual(this.f24875p, fVar.f24875p) && Intrinsics.areEqual(this.f24876q, fVar.f24876q)) {
                                if (mo35337o() == fVar.mo35337o()) {
                                    if (this.f24878s == fVar.f24878s) {
                                        if ((mo35339q() == fVar.mo35339q()) && Intrinsics.areEqual(this.f24880u, fVar.f24880u)) {
                                            if ((mo35341s() == fVar.mo35341s()) && Intrinsics.areEqual(mo35342t(), fVar.mo35342t()) && Intrinsics.areEqual(this.f24883x, fVar.f24883x)) {
                                                if (mo35344u() == fVar.mo35344u()) {
                                                    if (mo35345v() == fVar.mo35345v()) {
                                                        if (this.f24854A == fVar.f24854A) {
                                                            if (mo35347x() == fVar.mo35347x()) {
                                                                if (mo35348y() == fVar.mo35348y()) {
                                                                    if (!(this.f24857D == fVar.f24857D) || !Intrinsics.areEqual(this.f24858E, fVar.f24858E) || !Intrinsics.areEqual(this.f24859F, fVar.f24859F)) {
                                                                        return false;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        FragmentActivity a = mo35279a();
        int i = 0;
        int hashCode = (a != null ? a.hashCode() : 0) * 31;
        FrameLayout frameLayout = this.f24865f;
        int hashCode2 = (hashCode + (frameLayout != null ? frameLayout.hashCode() : 0)) * 31;
        FrameLayout frameLayout2 = this.f24866g;
        int hashCode3 = (hashCode2 + (frameLayout2 != null ? frameLayout2.hashCode() : 0)) * 31;
        FragmentManager fragmentManager = this.f24867h;
        int hashCode4 = (hashCode3 + (fragmentManager != null ? fragmentManager.hashCode() : 0)) * 31;
        String h = mo35329h();
        int hashCode5 = (hashCode4 + (h != null ? h.hashCode() : 0)) * 31;
        String i2 = mo35331i();
        int hashCode6 = (hashCode5 + (i2 != null ? i2.hashCode() : 0)) * 31;
        C8275a aVar = this.f24870k;
        int hashCode7 = (hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z = this.f24871l;
        int i3 = 1;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        int i7 = (hashCode7 + i4) * 31;
        String str = this.f24872m;
        int hashCode8 = str != null ? str.hashCode() : 0;
        long j = this.f24873n;
        long l = mo35334l();
        int i8 = (((((i7 + hashCode8) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (l ^ (l >>> 32)))) * 31;
        ICommentPermission hVar = this.f24875p;
        int hashCode9 = (i8 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        AbstractC10550f fVar = this.f24876q;
        int hashCode10 = (hashCode9 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        boolean o = mo35337o();
        if (o) {
            o = true;
        }
        int i9 = o ? 1 : 0;
        int i10 = o ? 1 : 0;
        int i11 = o ? 1 : 0;
        int i12 = (hashCode10 + i9) * 31;
        boolean z2 = this.f24878s;
        if (z2) {
            z2 = true;
        }
        int i13 = z2 ? 1 : 0;
        int i14 = z2 ? 1 : 0;
        int i15 = z2 ? 1 : 0;
        int i16 = (i12 + i13) * 31;
        boolean q = mo35339q();
        if (q) {
            q = true;
        }
        int i17 = q ? 1 : 0;
        int i18 = q ? 1 : 0;
        int i19 = q ? 1 : 0;
        int i20 = (i16 + i17) * 31;
        CommentArea bVar = this.f24880u;
        int hashCode11 = (i20 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        boolean s = mo35341s();
        if (s) {
            s = true;
        }
        int i21 = s ? 1 : 0;
        int i22 = s ? 1 : 0;
        int i23 = s ? 1 : 0;
        int i24 = (hashCode11 + i21) * 31;
        TranslateConfig t = mo35342t();
        int hashCode12 = (i24 + (t != null ? t.hashCode() : 0)) * 31;
        String str2 = this.f24883x;
        int hashCode13 = (hashCode12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean u = mo35344u();
        if (u) {
            u = true;
        }
        int i25 = u ? 1 : 0;
        int i26 = u ? 1 : 0;
        int i27 = u ? 1 : 0;
        int i28 = (hashCode13 + i25) * 31;
        boolean v = mo35345v();
        if (v) {
            v = true;
        }
        int i29 = v ? 1 : 0;
        int i30 = v ? 1 : 0;
        int i31 = v ? 1 : 0;
        int i32 = (i28 + i29) * 31;
        boolean z3 = this.f24854A;
        if (z3) {
            z3 = true;
        }
        int i33 = z3 ? 1 : 0;
        int i34 = z3 ? 1 : 0;
        int i35 = z3 ? 1 : 0;
        int i36 = (i32 + i33) * 31;
        boolean x = mo35347x();
        if (x) {
            x = true;
        }
        int i37 = x ? 1 : 0;
        int i38 = x ? 1 : 0;
        int i39 = x ? 1 : 0;
        int i40 = (i36 + i37) * 31;
        boolean y = mo35348y();
        if (y) {
            y = true;
        }
        int i41 = y ? 1 : 0;
        int i42 = y ? 1 : 0;
        int i43 = y ? 1 : 0;
        int i44 = (i40 + i41) * 31;
        boolean z4 = this.f24857D;
        if (!z4) {
            i3 = z4 ? 1 : 0;
        }
        int i45 = (i44 + i3) * 31;
        AbstractC9234g gVar = this.f24858E;
        int hashCode14 = (i45 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str3 = this.f24859F;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        return "Config(activity=" + mo35279a() + ", viewParent=" + this.f24865f + ", imageViewerParent=" + this.f24866g + ", fragmentManager=" + this.f24867h + ", token=" + mo35329h() + ", docUrl=" + mo35331i() + ", pageType=" + this.f24870k + ", isWiki=" + this.f24871l + ", subFileType=" + this.f24872m + ", commentType=" + this.f24873n + ", styleType=" + mo35334l() + ", per=" + this.f24875p + ", keyboardHeightProvider=" + this.f24876q + ", isVC=" + mo35337o() + ", inCCM=" + this.f24878s + ", showVoice=" + mo35339q() + ", area=" + this.f24880u + ", showReaction=" + mo35341s() + ", translate=" + mo35342t() + ", currentCommentId=" + this.f24883x + ", showBlank=" + mo35344u() + ", useCustomHeight=" + mo35345v() + ", audioAvailable=" + this.f24854A + ", showInsertImage=" + mo35347x() + ", showCommentImage=" + mo35348y() + ", enableFontScale=" + this.f24857D + ", isOwner=" + this.f24858E + ", appId=" + this.f24859F + ")";
    }

    /* renamed from: A */
    public final String mo35316A() {
        return this.f24859F;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: a */
    public FragmentActivity mo35279a() {
        return this.f24864e;
    }

    /* renamed from: b */
    public int mo35320b() {
        return this.f24860a;
    }

    /* renamed from: c */
    public int mo35322c() {
        return this.f24861b;
    }

    /* renamed from: d */
    public int mo35324d() {
        return this.f24862c;
    }

    /* renamed from: e */
    public C9226a mo35325e() {
        return this.f24863d;
    }

    /* renamed from: f */
    public final FrameLayout mo35327f() {
        return this.f24865f;
    }

    /* renamed from: g */
    public final FrameLayout mo35328g() {
        return this.f24866g;
    }

    /* renamed from: h */
    public String mo35329h() {
        return this.f24868i;
    }

    /* renamed from: i */
    public String mo35331i() {
        return this.f24869j;
    }

    /* renamed from: j */
    public final C8275a mo35332j() {
        return this.f24870k;
    }

    /* renamed from: k */
    public final long mo35333k() {
        return this.f24873n;
    }

    /* renamed from: l */
    public long mo35334l() {
        return this.f24874o;
    }

    /* renamed from: m */
    public final ICommentPermission mo35335m() {
        return this.f24875p;
    }

    /* renamed from: n */
    public final AbstractC10550f mo35336n() {
        return this.f24876q;
    }

    /* renamed from: o */
    public boolean mo35337o() {
        return this.f24877r;
    }

    /* renamed from: p */
    public final boolean mo35338p() {
        return this.f24878s;
    }

    /* renamed from: q */
    public boolean mo35339q() {
        return this.f24879t;
    }

    /* renamed from: r */
    public final CommentArea mo35340r() {
        return this.f24880u;
    }

    /* renamed from: s */
    public boolean mo35341s() {
        return this.f24881v;
    }

    /* renamed from: t */
    public TranslateConfig mo35342t() {
        return this.f24882w;
    }

    /* renamed from: u */
    public boolean mo35344u() {
        return this.f24884y;
    }

    /* renamed from: v */
    public boolean mo35345v() {
        return this.f24885z;
    }

    /* renamed from: w */
    public final boolean mo35346w() {
        return this.f24854A;
    }

    /* renamed from: x */
    public boolean mo35347x() {
        return this.f24855B;
    }

    /* renamed from: y */
    public boolean mo35348y() {
        return this.f24856C;
    }

    /* renamed from: z */
    public final boolean mo35349z() {
        return this.f24857D;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: a */
    public void mo35280a(int i) {
        this.f24860a = i;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: b */
    public void mo35284b(int i) {
        this.f24861b = i;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: c */
    public void mo35286c(int i) {
        this.f24862c = i;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: a */
    public void mo35281a(long j) {
        this.f24874o = j;
    }

    /* renamed from: b */
    public final void mo35321b(String str) {
        this.f24859F = str;
    }

    /* renamed from: c */
    public final void mo35323c(boolean z) {
        this.f24878s = z;
    }

    /* renamed from: a */
    public final void mo35317a(C8275a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "<set-?>");
        this.f24870k = aVar;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: b */
    public void mo35285b(boolean z) {
        this.f24885z = z;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: a */
    public void mo35282a(TranslateConfig translateConfig) {
        Intrinsics.checkParameterIsNotNull(translateConfig, "<set-?>");
        this.f24882w = translateConfig;
    }

    /* renamed from: a */
    public final void mo35318a(CommentArea bVar) {
        Intrinsics.checkParameterIsNotNull(bVar, "<set-?>");
        this.f24880u = bVar;
    }

    /* renamed from: a */
    public void mo35319a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f24868i = str;
    }

    @Override // com.bytedance.ee.bear.middleground.comment.export.ICommentConfig
    /* renamed from: a */
    public void mo35283a(boolean z) {
        this.f24877r = z;
    }

    public Config(FragmentActivity fragmentActivity, FrameLayout frameLayout, FrameLayout frameLayout2, FragmentManager fragmentManager, String str, String str2, C8275a aVar, boolean z, String str3, long j, long j2, ICommentPermission hVar, AbstractC10550f fVar, boolean z2, boolean z3, boolean z4, CommentArea bVar, boolean z5, TranslateConfig translateConfig, String str4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, AbstractC9234g gVar, String str5) {
        boolean z12;
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "activity");
        Intrinsics.checkParameterIsNotNull(frameLayout, "viewParent");
        Intrinsics.checkParameterIsNotNull(frameLayout2, "imageViewerParent");
        Intrinsics.checkParameterIsNotNull(fragmentManager, "fragmentManager");
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "docUrl");
        Intrinsics.checkParameterIsNotNull(aVar, "pageType");
        Intrinsics.checkParameterIsNotNull(str3, "subFileType");
        Intrinsics.checkParameterIsNotNull(hVar, "per");
        Intrinsics.checkParameterIsNotNull(fVar, "keyboardHeightProvider");
        Intrinsics.checkParameterIsNotNull(bVar, "area");
        Intrinsics.checkParameterIsNotNull(translateConfig, "translate");
        Intrinsics.checkParameterIsNotNull(str4, "currentCommentId");
        this.f24864e = fragmentActivity;
        this.f24865f = frameLayout;
        this.f24866g = frameLayout2;
        this.f24867h = fragmentManager;
        this.f24868i = str;
        this.f24869j = str2;
        this.f24870k = aVar;
        this.f24871l = z;
        this.f24872m = str3;
        this.f24873n = j;
        this.f24874o = j2;
        this.f24875p = hVar;
        this.f24876q = fVar;
        this.f24877r = z2;
        this.f24878s = z3;
        this.f24879t = z4;
        this.f24880u = bVar;
        this.f24881v = z5;
        this.f24882w = translateConfig;
        this.f24883x = str4;
        this.f24884y = z6;
        this.f24885z = z7;
        this.f24854A = z8;
        this.f24855B = z9;
        this.f24856C = z10;
        this.f24857D = z11;
        this.f24858E = gVar;
        this.f24859F = str5;
        this.f24860a = (int) C7728a.m30902a();
        this.f24861b = (int) C7728a.m30906c();
        this.f24862c = (int) C7728a.m30905b();
        String h = mo35329h();
        String a = this.f24870k.mo32553a();
        boolean z13 = this.f24871l;
        String str6 = this.f24872m;
        if (this.f24873n == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f24863d = new C9226a(h, a, z13, str6, z12, gVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Config(androidx.fragment.app.FragmentActivity r35, android.widget.FrameLayout r36, android.widget.FrameLayout r37, androidx.fragment.app.FragmentManager r38, java.lang.String r39, java.lang.String r40, com.bytedance.ee.bear.list.dto.C8275a r41, boolean r42, java.lang.String r43, long r44, long r46, com.bytedance.ee.bear.middleground.comment.export.ICommentPermission r48, com.bytedance.ee.bear.p522q.p523a.AbstractC10550f r49, boolean r50, boolean r51, boolean r52, com.bytedance.ee.bear.middleground.comment.uitls.CommentArea r53, boolean r54, com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig r55, java.lang.String r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, com.bytedance.ee.bear.middleground.comment.p449g.AbstractC9234g r63, java.lang.String r64, int r65, kotlin.jvm.internal.DefaultConstructorMarker r66) {
        /*
        // Method dump skipped, instructions count: 173
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ee.bear.middleground.comment.uitls.Config.<init>(androidx.fragment.app.FragmentActivity, android.widget.FrameLayout, android.widget.FrameLayout, androidx.fragment.app.FragmentManager, java.lang.String, java.lang.String, com.bytedance.ee.bear.list.dto.a, boolean, java.lang.String, long, long, com.bytedance.ee.bear.middleground.comment.export.h, com.bytedance.ee.bear.q.a.f, boolean, boolean, boolean, com.bytedance.ee.bear.middleground.comment.g.b, boolean, com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, com.bytedance.ee.bear.middleground.comment.g.g, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
