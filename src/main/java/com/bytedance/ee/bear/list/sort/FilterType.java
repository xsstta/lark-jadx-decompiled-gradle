package com.bytedance.ee.bear.list.sort;

import android.text.TextUtils;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.util.io.AbstractC13673d;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Init of enum ALL can be incorrect */
/* JADX WARN: Init of enum DOC can be incorrect */
/* JADX WARN: Init of enum SHEET can be incorrect */
/* JADX WARN: Init of enum BITABLE can be incorrect */
/* JADX WARN: Init of enum MINDNOTE can be incorrect */
/* JADX WARN: Init of enum SLIDE can be incorrect */
/* JADX WARN: Init of enum FILE can be incorrect */
/* JADX WARN: Init of enum PHOTO can be incorrect */
/* JADX WARN: Init of enum WIKI can be incorrect */
/* JADX WARN: Init of enum FOLDER can be incorrect */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0001\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001'B/\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006J\"\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015j\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&¨\u0006("}, d2 = {"Lcom/bytedance/ee/bear/list/sort/FilterType;", "", "resId", "", ShareHitPoint.f121869d, "fileType", "", "forbiddenFileType", "reportType", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileType", "()Ljava/lang/String;", "setFileType", "(Ljava/lang/String;)V", "getForbiddenFileType", "setForbiddenFileType", "getReportType", "setReportType", "getResId", "()I", "setResId", "(I)V", "getType", "setType", "isInFilterType", "", "docType", "subType", "isSame", "ALL", "DOC", "SHEET", "BITABLE", "MINDNOTE", "SLIDE", "FILE", "PHOTO", "WIKI", "FOLDER", "Companion", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
public enum FilterType {
    ALL(R.string.Doc_List_Filter_All, r1.mo32555b(), "", "", "all"),
    DOC(R.string.Doc_Facade_Document, r2.mo32555b(), "", "", "docs"),
    SHEET(R.string.Doc_Facade_CreateSheet, r2.mo32555b(), "", "", "sheets"),
    BITABLE(R.string.Doc_Facade_Bitable, r2.mo32555b(), "", "", "bitable"),
    MINDNOTE(R.string.Doc_Facade_MindNote, r2.mo32555b(), "", "", "mindnotes"),
    SLIDE(R.string.Doc_Facade_Slide, r2.mo32555b(), "", "", "slides"),
    FILE(R.string.Doc_List_Filter_File, r2.mo32555b(), "", "photo", "drive"),
    PHOTO(R.string.Doc_List_Filter_Image, r2.mo32555b(), "photo", "", "image"),
    WIKI(R.string.Doc_Facade_Wiki, r2.mo32555b(), "", "", "wiki"),
    FOLDER(R.string.Doc_Facade_Folder, r2.mo32555b(), "", "", "folder");
    
    public static final Companion Companion = new Companion(null);
    private String fileType;
    private String forbiddenFileType;
    private String reportType;
    private int resId;
    private int type;

    @JvmStatic
    public static final FilterType getFilterByType(int i, String str, String str2) {
        return Companion.mo33800a(i, str, str2);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\n"}, d2 = {"Lcom/bytedance/ee/bear/list/sort/FilterType$Companion;", "", "()V", "getFilterByType", "Lcom/bytedance/ee/bear/list/sort/FilterType;", ShareHitPoint.f121869d, "", "fileType", "", "forbiddenFileType", "list_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.list.sort.FilterType$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final FilterType mo33800a(int i, String str, String str2) {
            Intrinsics.checkParameterIsNotNull(str, "fileType");
            Intrinsics.checkParameterIsNotNull(str2, "forbiddenFileType");
            if (FilterType.DOC.isSame(i, str, str2)) {
                return FilterType.DOC;
            }
            if (FilterType.SHEET.isSame(i, str, str2)) {
                return FilterType.SHEET;
            }
            if (FilterType.BITABLE.isSame(i, str, str2)) {
                return FilterType.BITABLE;
            }
            if (FilterType.MINDNOTE.isSame(i, str, str2)) {
                return FilterType.MINDNOTE;
            }
            if (FilterType.SLIDE.isSame(i, str, str2)) {
                return FilterType.SLIDE;
            }
            if (FilterType.FILE.isSame(i, str, str2)) {
                return FilterType.FILE;
            }
            if (FilterType.PHOTO.isSame(i, str, str2)) {
                return FilterType.PHOTO;
            }
            if (FilterType.WIKI.isSame(i, str, str2)) {
                return FilterType.WIKI;
            }
            return FilterType.ALL;
        }
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getForbiddenFileType() {
        return this.forbiddenFileType;
    }

    public final String getReportType() {
        return this.reportType;
    }

    public final int getResId() {
        return this.resId;
    }

    public final int getType() {
        return this.type;
    }

    static {
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22369b, "DocumentType.UNKNOWN");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22371d, "DocumentType.DOC");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22372e, "DocumentType.SHEET");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22373f, "DocumentType.BITABLE");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22374g, "DocumentType.MINDNOTE");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22376i, "DocumentType.SLIDE");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22375h, "DocumentType.FILE");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22375h, "DocumentType.FILE");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22377j, "DocumentType.WIKI");
        Intrinsics.checkExpressionValueIsNotNull(C8275a.f22370c, "DocumentType.FOLDER");
    }

    public final void setResId(int i) {
        this.resId = i;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setFileType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.fileType = str;
    }

    public final void setForbiddenFileType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.forbiddenFileType = str;
    }

    public final void setReportType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.reportType = str;
    }

    public final boolean isInFilterType(int i, String str) {
        String str2;
        String str3;
        int i2 = this.type;
        C8275a aVar = C8275a.f22369b;
        Intrinsics.checkExpressionValueIsNotNull(aVar, "DocumentType.UNKNOWN");
        if (i2 == aVar.mo32555b()) {
            return true;
        }
        String[] strArr = AbstractC13673d.f35862a;
        Intrinsics.checkExpressionValueIsNotNull(strArr, "FileSuffix.images");
        List listOf = CollectionsKt.listOf((Object[]) ((String[]) Arrays.copyOf(strArr, strArr.length)));
        if (str == null) {
            str2 = null;
        } else if (str != null) {
            str2 = str.toLowerCase();
            Intrinsics.checkExpressionValueIsNotNull(str2, "(this as java.lang.String).toLowerCase()");
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        boolean contains = listOf.contains(str2);
        String str4 = "";
        if (contains) {
            str3 = PHOTO.fileType;
        } else {
            str3 = str4;
        }
        if (i == 12 && !contains) {
            str4 = PHOTO.fileType;
        }
        return isSame(i, str3, str4);
    }

    public final boolean isSame(int i, String str, String str2) {
        if (this.type != i) {
            return false;
        }
        String str3 = str;
        if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2)) {
            return true;
        }
        if (!TextUtils.isEmpty(str3) && TextUtils.equals(this.fileType, str3)) {
            return true;
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str4) || !TextUtils.equals(this.forbiddenFileType, str4)) {
            return false;
        }
        return true;
    }

    private FilterType(int i, int i2, String str, String str2, String str3) {
        this.resId = i;
        this.type = i2;
        this.fileType = str;
        this.forbiddenFileType = str2;
        this.reportType = str3;
    }
}
