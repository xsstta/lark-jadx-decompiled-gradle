package com.ss.android.lark.searchcommon.utils;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.search.result.CalendarSearchResultRv;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/UiUtil;", "", "()V", "Companion", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.utils.e */
public final class UiUtil {

    /* renamed from: a */
    public static final int f133398a = R.color.udtoken_tag_neutral_text_normal;

    /* renamed from: b */
    public static final int f133399b = R.color.udtoken_tag_neutral_bg_normal;

    /* renamed from: c */
    public static final int f133400c = R.color.udtoken_tag_text_blue;

    /* renamed from: d */
    public static final int f133401d = R.color.udtoken_tag_bg_blue;

    /* renamed from: e */
    public static final int f133402e = R.color.udtoken_tag_text_yellow;

    /* renamed from: f */
    public static final int f133403f = R.color.udtoken_tag_bg_yellow;

    /* renamed from: g */
    public static final int f133404g = R.color.udtoken_tag_text_red;

    /* renamed from: h */
    public static final int f133405h = R.color.udtoken_tag_bg_red;

    /* renamed from: i */
    public static int f133406i = R.color.udtoken_tag_text_green;

    /* renamed from: j */
    public static final int f133407j = R.color.udtoken_tag_bg_green;

    /* renamed from: k */
    public static final int f133408k = R.color.udtoken_tag_text_orange;

    /* renamed from: l */
    public static final int f133409l = R.color.udtoken_tag_bg_orange;

    /* renamed from: m */
    public static final int f133410m = R.color.udtoken_tag_text_purple;

    /* renamed from: n */
    public static final int f133411n = R.color.udtoken_tag_bg_purple;

    /* renamed from: o */
    public static final int f133412o = R.color.udtoken_tag_text_wathet;

    /* renamed from: p */
    public static final int f133413p = R.color.udtoken_tag_bg_wathet;

    /* renamed from: q */
    public static final int f133414q = R.color.udtoken_tag_text_turquoise;

    /* renamed from: r */
    public static final int f133415r = R.color.udtoken_tag_bg_turquoise;

    /* renamed from: s */
    public static final int[] f133416s = {(int) 4279450778L, (int) 4281561343L, (int) 4294936576L, (int) 4294404452L, (int) 4286528501L, (int) 4282995942L, (int) 4289975808L};

    /* renamed from: t */
    public static final Companion f133417t = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/ss/android/lark/searchcommon/utils/UiUtil$Companion;", "", "()V", "B_bg", "", "B_text", "G_bg", "G_text", "NT_bg", "NT_text", "N_bg", "N_text", "O_bg", "O_text", "P_bg", "P_text", "R_bg", "R_text", "W_bg", "W_text", "Y_bg", "Y_text", "rgbList", "", "getColorResByTagType", "Lkotlin/Pair;", "tagType", "", "getRGBValue", "key", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.searchcommon.utils.e$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public final int mo184572b(String str) {
            boolean z;
            int i;
            Intrinsics.checkParameterIsNotNull(str, "key");
            List<String> split$default = StringsKt.split$default((CharSequence) str, new char[]{' '}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
            for (String str2 : split$default) {
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i = 0;
                } else if (str2 != null) {
                    i = str2.codePointAt(0);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                arrayList.add(Integer.valueOf(i));
            }
            return UiUtil.f133416s[CollectionsKt.sumOfInt(arrayList) % UiUtil.f133416s.length];
        }

        /* renamed from: a */
        public final Pair<Integer, Integer> mo184571a(String str) {
            Intrinsics.checkParameterIsNotNull(str, "tagType");
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 71) {
                    if (hashCode != 82) {
                        if (hashCode != 87) {
                            if (hashCode != 89) {
                                if (hashCode != 2502) {
                                    switch (hashCode) {
                                        case 78:
                                            if (str.equals("N")) {
                                                return new Pair<>(Integer.valueOf(UiUtil.f133398a), Integer.valueOf(UiUtil.f133399b));
                                            }
                                            break;
                                        case 79:
                                            if (str.equals("O")) {
                                                return new Pair<>(Integer.valueOf(UiUtil.f133408k), Integer.valueOf(UiUtil.f133409l));
                                            }
                                            break;
                                        case CalendarSearchResultRv.f82651b:
                                            if (str.equals("P")) {
                                                return new Pair<>(Integer.valueOf(UiUtil.f133410m), Integer.valueOf(UiUtil.f133411n));
                                            }
                                            break;
                                    }
                                } else if (str.equals("NT")) {
                                    return new Pair<>(Integer.valueOf(UiUtil.f133414q), Integer.valueOf(UiUtil.f133415r));
                                }
                            } else if (str.equals("Y")) {
                                return new Pair<>(Integer.valueOf(UiUtil.f133402e), Integer.valueOf(UiUtil.f133403f));
                            }
                        } else if (str.equals("W")) {
                            return new Pair<>(Integer.valueOf(UiUtil.f133412o), Integer.valueOf(UiUtil.f133413p));
                        }
                    } else if (str.equals("R")) {
                        return new Pair<>(Integer.valueOf(UiUtil.f133404g), Integer.valueOf(UiUtil.f133405h));
                    }
                } else if (str.equals("G")) {
                    return new Pair<>(Integer.valueOf(UiUtil.f133406i), Integer.valueOf(UiUtil.f133407j));
                }
            } else if (str.equals("B")) {
                return new Pair<>(Integer.valueOf(UiUtil.f133400c), Integer.valueOf(UiUtil.f133401d));
            }
            return new Pair<>(Integer.valueOf(UiUtil.f133398a), Integer.valueOf(UiUtil.f133399b));
        }
    }
}
