package com.ss.android.lark.pin.dto;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.doc.entity.Doc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0000H\u0016J\u0010\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0000H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u001a\u0010\u0014\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0004R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\u0004R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006'"}, d2 = {"Lcom/ss/android/lark/pin/dto/SearchResult;", "Lcom/larksuite/framework/utils/diff/Diffable;", "id", "", "(Ljava/lang/String;)V", "avatarKey", "getAvatarKey", "()Ljava/lang/String;", "setAvatarKey", "docList", "", "Lcom/ss/android/lark/doc/entity/Doc;", "getDocList", "()Ljava/util/List;", "setDocList", "(Ljava/util/List;)V", "entityId", "getEntityId", "setEntityId", "getId", "senderName", "getSenderName", "setSenderName", "subtitle", "getSubtitle", "setSubtitle", "subtitleHitTerms", "getSubtitleHitTerms", "setSubtitleHitTerms", "title", "getTitle", "setTitle", "titleHitTerms", "getTitleHitTerms", "setTitleHitTerms", "isContentSame", "", "diffable", "isItemSame", "im_pin_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.dto.c */
public final class SearchResult implements AbstractC26248b<SearchResult> {

    /* renamed from: a */
    private String f128105a = "";

    /* renamed from: b */
    private String f128106b = "";

    /* renamed from: c */
    private List<String> f128107c = new ArrayList();

    /* renamed from: d */
    private List<String> f128108d = new ArrayList();

    /* renamed from: e */
    private String f128109e = "";

    /* renamed from: f */
    private List<? extends Doc> f128110f = new ArrayList();

    /* renamed from: g */
    private String f128111g = "";

    /* renamed from: h */
    private String f128112h = "";

    /* renamed from: i */
    private final String f128113i;

    /* renamed from: a */
    public final String mo177265a() {
        return this.f128105a;
    }

    /* renamed from: b */
    public final String mo177269b() {
        return this.f128106b;
    }

    /* renamed from: c */
    public final List<String> mo177273c() {
        return this.f128107c;
    }

    /* renamed from: d */
    public final List<String> mo177276d() {
        return this.f128108d;
    }

    /* renamed from: e */
    public final String mo177278e() {
        return this.f128109e;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.lark.doc.entity.Doc>, java.util.List<com.ss.android.lark.doc.entity.Doc> */
    /* renamed from: f */
    public final List<Doc> mo177280f() {
        return this.f128110f;
    }

    /* renamed from: g */
    public final String mo177281g() {
        return this.f128111g;
    }

    /* renamed from: h */
    public final String mo177282h() {
        return this.f128112h;
    }

    /* renamed from: a */
    public final void mo177266a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128105a = str;
    }

    /* renamed from: b */
    public final void mo177270b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128106b = str;
    }

    /* renamed from: c */
    public final void mo177274c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128109e = str;
    }

    /* renamed from: d */
    public final void mo177277d(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128111g = str;
    }

    /* renamed from: e */
    public final void mo177279e(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f128112h = str;
    }

    /* renamed from: a */
    public final void mo177267a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f128107c = list;
    }

    /* renamed from: b */
    public final void mo177271b(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f128108d = list;
    }

    /* renamed from: c */
    public final void mo177275c(List<? extends Doc> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f128110f = list;
    }

    /* renamed from: a */
    public boolean isItemSame(SearchResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "diffable");
        return Intrinsics.areEqual(this.f128113i, cVar.f128113i);
    }

    public SearchResult(String str) {
        Intrinsics.checkParameterIsNotNull(str, "id");
        this.f128113i = str;
    }

    /* renamed from: b */
    public boolean isContentSame(SearchResult cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "diffable");
        if (!Intrinsics.areEqual(this.f128113i, cVar.f128113i) || !Intrinsics.areEqual(this.f128105a, cVar.f128105a) || !Intrinsics.areEqual(this.f128106b, cVar.f128106b) || !Intrinsics.areEqual(this.f128107c, cVar.f128107c) || !Intrinsics.areEqual(this.f128108d, cVar.f128108d)) {
            return false;
        }
        return true;
    }
}
