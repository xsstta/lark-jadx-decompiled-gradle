package com.bytedance.ee.bear.wikiv2.icon;

import com.bytedance.ee.bear.facade.common.icon.p381a.C7714b;
import com.bytedance.ee.bear.facade.common.icon.wiki.FileCategory;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.HashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J*\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/icon/WikiIcon;", "", "()V", "treeIcons", "", "", "", "configTreeIcon", "", "getTreeWikiIcon", ShareHitPoint.f121869d, "is_focus", "", "is_shortcut", "fileExt", "Companion", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.a.a */
public final class WikiIcon {

    /* renamed from: a */
    public static final Lazy f32816a = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) C12193b.INSTANCE);

    /* renamed from: b */
    public static final Companion f32817b = new Companion(null);

    /* renamed from: c */
    private final Map<String, Integer> f32818c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/icon/WikiIcon$Companion;", "", "()V", "focus", "", "instance", "Lcom/bytedance/ee/bear/wikiv2/icon/WikiIcon;", "getInstance", "()Lcom/bytedance/ee/bear/wikiv2/icon/WikiIcon;", "instance$delegate", "Lkotlin/Lazy;", "non_focus", "non_shortcut", "shortcut", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a.a$a */
    public static final class Companion {

        /* renamed from: a */
        static final /* synthetic */ KProperty[] f32819a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "instance", "getInstance()Lcom/bytedance/ee/bear/wikiv2/icon/WikiIcon;"))};

        /* renamed from: a */
        public final WikiIcon mo46647a() {
            Lazy lazy = WikiIcon.f32816a;
            Companion aVar = WikiIcon.f32817b;
            KProperty kProperty = f32819a[0];
            return (WikiIcon) lazy.getValue();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final void m50768a() {
        Map<String, Integer> map = this.f32818c;
        C8275a aVar = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.DOCX");
        map.put(C7714b.m30854a(Integer.valueOf(aVar.mo32555b()), true, true), Integer.valueOf((int) R.drawable.icon_wikifile_docx_cur));
        Map<String, Integer> map2 = this.f32818c;
        C8275a aVar2 = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar2, "DocumentType.DOCX");
        map2.put(C7714b.m30854a(Integer.valueOf(aVar2.mo32555b()), true, false), Integer.valueOf((int) R.drawable.icon_wikifile_docx_outline_cur));
        Map<String, Integer> map3 = this.f32818c;
        C8275a aVar3 = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.DOCX");
        map3.put(C7714b.m30854a(Integer.valueOf(aVar3.mo32555b()), false, true), Integer.valueOf((int) R.drawable.icon_wikifile_docx));
        Map<String, Integer> map4 = this.f32818c;
        C8275a aVar4 = C8275a.f22378k;
        Intrinsics.checkExpressionValueIsNotNull(aVar4, "DocumentType.DOCX");
        map4.put(C7714b.m30854a(Integer.valueOf(aVar4.mo32555b()), false, false), Integer.valueOf((int) R.drawable.icon_wikifile_docx_outline));
        Map<String, Integer> map5 = this.f32818c;
        C8275a aVar5 = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar5, "DocumentType.DOC");
        map5.put(C7714b.m30854a(Integer.valueOf(aVar5.mo32555b()), true, true), Integer.valueOf((int) R.drawable.icon_wikifile_doc_cur));
        Map<String, Integer> map6 = this.f32818c;
        C8275a aVar6 = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar6, "DocumentType.DOC");
        map6.put(C7714b.m30854a(Integer.valueOf(aVar6.mo32555b()), true, false), Integer.valueOf((int) R.drawable.icon_wikifile_doc_outline_cur));
        Map<String, Integer> map7 = this.f32818c;
        C8275a aVar7 = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar7, "DocumentType.DOC");
        map7.put(C7714b.m30854a(Integer.valueOf(aVar7.mo32555b()), false, true), Integer.valueOf((int) R.drawable.icon_wikifile_doc_v2));
        Map<String, Integer> map8 = this.f32818c;
        C8275a aVar8 = C8275a.f22371d;
        Intrinsics.checkExpressionValueIsNotNull(aVar8, "DocumentType.DOC");
        map8.put(C7714b.m30854a(Integer.valueOf(aVar8.mo32555b()), false, false), Integer.valueOf((int) R.drawable.icon_wikifile_doc_outline_v2));
        Map<String, Integer> map9 = this.f32818c;
        C8275a aVar9 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar9, "DocumentType.SHEET");
        map9.put(C7714b.m30854a(Integer.valueOf(aVar9.mo32555b()), true, true), Integer.valueOf((int) R.drawable.icon_wikifile_sheet_cur));
        Map<String, Integer> map10 = this.f32818c;
        C8275a aVar10 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar10, "DocumentType.SHEET");
        map10.put(C7714b.m30854a(Integer.valueOf(aVar10.mo32555b()), true, false), Integer.valueOf((int) R.drawable.icon_wikifile_sheet_outline_cur));
        Map<String, Integer> map11 = this.f32818c;
        C8275a aVar11 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar11, "DocumentType.SHEET");
        map11.put(C7714b.m30854a(Integer.valueOf(aVar11.mo32555b()), false, true), Integer.valueOf((int) R.drawable.icon_wikifile_sheet_v2));
        Map<String, Integer> map12 = this.f32818c;
        C8275a aVar12 = C8275a.f22372e;
        Intrinsics.checkExpressionValueIsNotNull(aVar12, "DocumentType.SHEET");
        map12.put(C7714b.m30854a(Integer.valueOf(aVar12.mo32555b()), false, false), Integer.valueOf((int) R.drawable.icon_wikifile_sheet_outline_v2));
        Map<String, Integer> map13 = this.f32818c;
        C8275a aVar13 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar13, "DocumentType.MINDNOTE");
        map13.put(C7714b.m30854a(Integer.valueOf(aVar13.mo32555b()), true, true), Integer.valueOf((int) R.drawable.icon_wikifile_mindnote_cur));
        Map<String, Integer> map14 = this.f32818c;
        C8275a aVar14 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar14, "DocumentType.MINDNOTE");
        map14.put(C7714b.m30854a(Integer.valueOf(aVar14.mo32555b()), true, false), Integer.valueOf((int) R.drawable.icon_wikifile_mindnote_outline_cur));
        Map<String, Integer> map15 = this.f32818c;
        C8275a aVar15 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar15, "DocumentType.MINDNOTE");
        map15.put(C7714b.m30854a(Integer.valueOf(aVar15.mo32555b()), false, true), Integer.valueOf((int) R.drawable.icon_wikifile_mindnote_v2));
        Map<String, Integer> map16 = this.f32818c;
        C8275a aVar16 = C8275a.f22374g;
        Intrinsics.checkExpressionValueIsNotNull(aVar16, "DocumentType.MINDNOTE");
        map16.put(C7714b.m30854a(Integer.valueOf(aVar16.mo32555b()), false, false), Integer.valueOf((int) R.drawable.icon_wikifile_mindnote_outline_v2));
        Map<String, Integer> map17 = this.f32818c;
        C8275a aVar17 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar17, "DocumentType.BITABLE");
        map17.put(C7714b.m30854a(Integer.valueOf(aVar17.mo32555b()), true, true), Integer.valueOf((int) R.drawable.icon_wikifile_bitable_cur));
        Map<String, Integer> map18 = this.f32818c;
        C8275a aVar18 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar18, "DocumentType.BITABLE");
        map18.put(C7714b.m30854a(Integer.valueOf(aVar18.mo32555b()), true, false), Integer.valueOf((int) R.drawable.icon_wikifile_bitable_outline_cur));
        Map<String, Integer> map19 = this.f32818c;
        C8275a aVar19 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar19, "DocumentType.BITABLE");
        map19.put(C7714b.m30854a(Integer.valueOf(aVar19.mo32555b()), false, true), Integer.valueOf((int) R.drawable.icon_wikifile_bitable_v2));
        Map<String, Integer> map20 = this.f32818c;
        C8275a aVar20 = C8275a.f22373f;
        Intrinsics.checkExpressionValueIsNotNull(aVar20, "DocumentType.BITABLE");
        map20.put(C7714b.m30854a(Integer.valueOf(aVar20.mo32555b()), false, false), Integer.valueOf((int) R.drawable.icon_wikifile_bitable_outline_v2));
        Map<String, Integer> map21 = this.f32818c;
        C8275a aVar21 = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar21, "DocumentType.UNKNOWN");
        map21.put(C7714b.m30854a(Integer.valueOf(aVar21.mo32555b()), true, true), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_unknow_shortcut_colorful));
        Map<String, Integer> map22 = this.f32818c;
        C8275a aVar22 = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar22, "DocumentType.UNKNOWN");
        map22.put(C7714b.m30854a(Integer.valueOf(aVar22.mo32555b()), true, false), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_unknow_shortcut_outlined));
        Map<String, Integer> map23 = this.f32818c;
        C8275a aVar23 = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar23, "DocumentType.UNKNOWN");
        map23.put(C7714b.m30854a(Integer.valueOf(aVar23.mo32555b()), false, true), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_unknow_colorful));
        Map<String, Integer> map24 = this.f32818c;
        C8275a aVar24 = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar24, "DocumentType.UNKNOWN");
        map24.put(C7714b.m30854a(Integer.valueOf(aVar24.mo32555b()), false, false), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_unknow_outlined));
        Map<String, Integer> map25 = this.f32818c;
        C8275a aVar25 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar25, "DocumentType.FILE");
        map25.put(C7714b.m30854a(Integer.valueOf(aVar25.mo32555b()), true, true, "image"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_image_shortcut_colorful));
        Map<String, Integer> map26 = this.f32818c;
        C8275a aVar26 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar26, "DocumentType.FILE");
        map26.put(C7714b.m30854a(Integer.valueOf(aVar26.mo32555b()), true, false, "image"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_image_shortcut_outlined));
        Map<String, Integer> map27 = this.f32818c;
        C8275a aVar27 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar27, "DocumentType.FILE");
        map27.put(C7714b.m30854a(Integer.valueOf(aVar27.mo32555b()), false, true, "image"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_image_colorful));
        Map<String, Integer> map28 = this.f32818c;
        C8275a aVar28 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar28, "DocumentType.FILE");
        map28.put(C7714b.m30854a(Integer.valueOf(aVar28.mo32555b()), false, false, "image"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_image_outlined));
        Map<String, Integer> map29 = this.f32818c;
        C8275a aVar29 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar29, "DocumentType.FILE");
        map29.put(C7714b.m30854a(Integer.valueOf(aVar29.mo32555b()), true, true, "video"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_video_shortcut_colorful));
        Map<String, Integer> map30 = this.f32818c;
        C8275a aVar30 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar30, "DocumentType.FILE");
        map30.put(C7714b.m30854a(Integer.valueOf(aVar30.mo32555b()), true, false, "video"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_video_shortcut_outlined));
        Map<String, Integer> map31 = this.f32818c;
        C8275a aVar31 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar31, "DocumentType.FILE");
        map31.put(C7714b.m30854a(Integer.valueOf(aVar31.mo32555b()), false, true, "video"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_video_colorful));
        Map<String, Integer> map32 = this.f32818c;
        C8275a aVar32 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar32, "DocumentType.FILE");
        map32.put(C7714b.m30854a(Integer.valueOf(aVar32.mo32555b()), false, false, "video"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_video_outlined));
        Map<String, Integer> map33 = this.f32818c;
        C8275a aVar33 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar33, "DocumentType.FILE");
        map33.put(C7714b.m30854a(Integer.valueOf(aVar33.mo32555b()), true, true, "pdf"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_pdf_shortcut_colorful));
        Map<String, Integer> map34 = this.f32818c;
        C8275a aVar34 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar34, "DocumentType.FILE");
        map34.put(C7714b.m30854a(Integer.valueOf(aVar34.mo32555b()), true, false, "pdf"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_pdf_shortcut_outlined));
        Map<String, Integer> map35 = this.f32818c;
        C8275a aVar35 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar35, "DocumentType.FILE");
        map35.put(C7714b.m30854a(Integer.valueOf(aVar35.mo32555b()), false, true, "pdf"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_pdf_colorful));
        Map<String, Integer> map36 = this.f32818c;
        C8275a aVar36 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar36, "DocumentType.FILE");
        map36.put(C7714b.m30854a(Integer.valueOf(aVar36.mo32555b()), false, false, "pdf"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_pdf_outlined));
        Map<String, Integer> map37 = this.f32818c;
        C8275a aVar37 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar37, "DocumentType.FILE");
        map37.put(C7714b.m30854a(Integer.valueOf(aVar37.mo32555b()), true, true, "word"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_word_shortcut_colorful));
        Map<String, Integer> map38 = this.f32818c;
        C8275a aVar38 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar38, "DocumentType.FILE");
        map38.put(C7714b.m30854a(Integer.valueOf(aVar38.mo32555b()), true, false, "word"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_word_shortcut_outlined));
        Map<String, Integer> map39 = this.f32818c;
        C8275a aVar39 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar39, "DocumentType.FILE");
        map39.put(C7714b.m30854a(Integer.valueOf(aVar39.mo32555b()), false, true, "word"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_word_colorful));
        Map<String, Integer> map40 = this.f32818c;
        C8275a aVar40 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar40, "DocumentType.FILE");
        map40.put(C7714b.m30854a(Integer.valueOf(aVar40.mo32555b()), false, false, "word"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_word_outlined));
        Map<String, Integer> map41 = this.f32818c;
        C8275a aVar41 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar41, "DocumentType.FILE");
        map41.put(C7714b.m30854a(Integer.valueOf(aVar41.mo32555b()), true, true, "excel"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_excel_shortcut_colorful));
        Map<String, Integer> map42 = this.f32818c;
        C8275a aVar42 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar42, "DocumentType.FILE");
        map42.put(C7714b.m30854a(Integer.valueOf(aVar42.mo32555b()), true, false, "excel"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_excel_shortcut_outlined));
        Map<String, Integer> map43 = this.f32818c;
        C8275a aVar43 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar43, "DocumentType.FILE");
        map43.put(C7714b.m30854a(Integer.valueOf(aVar43.mo32555b()), false, true, "excel"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_excel_colorful));
        Map<String, Integer> map44 = this.f32818c;
        C8275a aVar44 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar44, "DocumentType.FILE");
        map44.put(C7714b.m30854a(Integer.valueOf(aVar44.mo32555b()), false, false, "excel"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_excel_outlined));
        Map<String, Integer> map45 = this.f32818c;
        C8275a aVar45 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar45, "DocumentType.FILE");
        map45.put(C7714b.m30854a(Integer.valueOf(aVar45.mo32555b()), true, true, "ppt"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_ppt_shortcut_colorful));
        Map<String, Integer> map46 = this.f32818c;
        C8275a aVar46 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar46, "DocumentType.FILE");
        map46.put(C7714b.m30854a(Integer.valueOf(aVar46.mo32555b()), true, false, "ppt"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_ppt_shortcut_outlined));
        Map<String, Integer> map47 = this.f32818c;
        C8275a aVar47 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar47, "DocumentType.FILE");
        map47.put(C7714b.m30854a(Integer.valueOf(aVar47.mo32555b()), false, true, "ppt"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_ppt_colorful));
        Map<String, Integer> map48 = this.f32818c;
        C8275a aVar48 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar48, "DocumentType.FILE");
        map48.put(C7714b.m30854a(Integer.valueOf(aVar48.mo32555b()), false, false, "ppt"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_ppt_outlined));
        Map<String, Integer> map49 = this.f32818c;
        C8275a aVar49 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar49, "DocumentType.FILE");
        map49.put(C7714b.m30854a(Integer.valueOf(aVar49.mo32555b()), true, true, "text"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_text_shortcut_colorful));
        Map<String, Integer> map50 = this.f32818c;
        C8275a aVar50 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar50, "DocumentType.FILE");
        map50.put(C7714b.m30854a(Integer.valueOf(aVar50.mo32555b()), true, false, "text"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_text_shortcut_outlined));
        Map<String, Integer> map51 = this.f32818c;
        C8275a aVar51 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar51, "DocumentType.FILE");
        map51.put(C7714b.m30854a(Integer.valueOf(aVar51.mo32555b()), false, true, "text"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_text_colorful));
        Map<String, Integer> map52 = this.f32818c;
        C8275a aVar52 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar52, "DocumentType.FILE");
        map52.put(C7714b.m30854a(Integer.valueOf(aVar52.mo32555b()), false, false, "text"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_text_outlined));
        Map<String, Integer> map53 = this.f32818c;
        C8275a aVar53 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar53, "DocumentType.FILE");
        map53.put(C7714b.m30854a(Integer.valueOf(aVar53.mo32555b()), true, true, "zip"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_zip_shortcut_colorful));
        Map<String, Integer> map54 = this.f32818c;
        C8275a aVar54 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar54, "DocumentType.FILE");
        map54.put(C7714b.m30854a(Integer.valueOf(aVar54.mo32555b()), true, false, "zip"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_zip_shortcut_outlined));
        Map<String, Integer> map55 = this.f32818c;
        C8275a aVar55 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar55, "DocumentType.FILE");
        map55.put(C7714b.m30854a(Integer.valueOf(aVar55.mo32555b()), false, true, "zip"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_zip_colorful));
        Map<String, Integer> map56 = this.f32818c;
        C8275a aVar56 = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar56, "DocumentType.FILE");
        map56.put(C7714b.m30854a(Integer.valueOf(aVar56.mo32555b()), false, false, "zip"), Integer.valueOf((int) R.drawable.ic_icon_wiki_file_link_zip_outlined));
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ee/bear/wikiv2/icon/WikiIcon;", "invoke"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.wikiv2.a.a$b */
    static final class C12193b extends Lambda implements Function0<WikiIcon> {
        public static final C12193b INSTANCE = new C12193b();

        C12193b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WikiIcon invoke() {
            return new WikiIcon(null);
        }
    }

    private WikiIcon() {
        this.f32818c = new HashMap();
        m50768a();
    }

    public /* synthetic */ WikiIcon(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final int mo46646a(int i, boolean z, boolean z2, String str) {
        Integer num;
        C8275a aVar = C8275a.f22375h;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.FILE");
        if (i == aVar.mo32555b()) {
            Map<String, Integer> map = this.f32818c;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(i);
            objArr[1] = Boolean.valueOf(z2);
            objArr[2] = Boolean.valueOf(z);
            FileCategory aVar2 = FileCategory.f20827a;
            if (str == null) {
                str = "";
            }
            objArr[3] = aVar2.mo30188a(str);
            num = map.get(C7714b.m30854a(objArr));
        } else {
            num = this.f32818c.get(C7714b.m30854a(Integer.valueOf(i), Boolean.valueOf(z2), Boolean.valueOf(z)));
        }
        if (num != null) {
            return num.intValue();
        }
        Map<String, Integer> map2 = this.f32818c;
        C8275a aVar3 = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar3, "DocumentType.UNKNOWN");
        Integer num2 = map2.get(C7714b.m30854a(Integer.valueOf(aVar3.mo32555b()), Boolean.valueOf(z2), Boolean.valueOf(z)));
        if (num2 == null) {
            Intrinsics.throwNpe();
        }
        return num2.intValue();
    }
}
