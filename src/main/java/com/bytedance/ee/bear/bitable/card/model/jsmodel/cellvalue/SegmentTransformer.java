package com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.ee.bear.bean.C4517a;
import com.bytedance.ee.bear.bean.Icon;
import com.bytedance.ee.bear.bitable.card.model.enums.ESegmentType;
import com.bytedance.ee.bear.p398i.C7827a;
import com.bytedance.ee.bear.p398i.C7838i;
import com.bytedance.ee.log.C13479a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/cellvalue/SegmentTransformer;", "", "()V", "TAG", "", "atContentToSegments", "", "Lcom/bytedance/ee/bear/bitable/card/model/jsmodel/cellvalue/SegmentModel;", "atContent", "Lcom/bytedance/ee/bear/function/AtContent;", "segmentsToAtContent", "segments", "stringToAtContent", "strData", "bitable-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.bitable.card.model.jsmodel.cellvalue.a */
public final class SegmentTransformer {

    /* renamed from: a */
    public static final SegmentTransformer f13297a = new SegmentTransformer();

    private SegmentTransformer() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final C7827a m18729a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List parseArray = JSON.parseArray(str, SegmentModel.class);
            Intrinsics.checkExpressionValueIsNotNull(parseArray, "segments");
            return m18730a(parseArray);
        } catch (Exception e) {
            C13479a.m54758a("SegmentTransformer", "stringToAtContent failed, error = " + e.getMessage());
            return new C7827a(str, new C4517a[0], new C7838i[0]);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final C7827a m18730a(List<? extends SegmentModel> list) {
        int i;
        String str;
        Intrinsics.checkParameterIsNotNull(list, "segments");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        for (T t : list) {
            sb.append(t.text);
            int length = t.text.length() + i2;
            ESegmentType eSegmentType = t.type;
            if (eSegmentType != null) {
                int i3 = C4524b.f13298a[eSegmentType.ordinal()];
                if (i3 == 1) {
                    C4517a.C4518a c = new C4517a.C4518a().mo17391a(i2).mo17395b(length).mo17398c(t.mentionType).mo17392a(t.token).mo17396b(t.link).mo17399c(t.text);
                    Icon icon = t.icon;
                    if (icon != null) {
                        i = icon.getType();
                    } else {
                        i = 0;
                    }
                    C4517a.C4518a e = c.mo17403e(i);
                    Icon icon2 = t.icon;
                    String str2 = null;
                    C4517a.C4518a h = e.mo17407h(icon2 != null ? icon2.getKey() : null);
                    Icon icon3 = t.icon;
                    if (icon3 != null) {
                        str2 = icon3.getFs_unit();
                    }
                    arrayList.add(h.mo17406g(str2).mo17393a(t.mentionNotify).mo17408i(t.mentionId).mo17394a());
                } else if (i3 == 2) {
                    if (TextUtils.isEmpty(t.link)) {
                        str = t.text;
                    } else {
                        str = t.link;
                    }
                    arrayList2.add(new C7838i(i2, length, str));
                }
            }
            i2 = length;
        }
        String sb2 = sb.toString();
        Object[] array = arrayList.toArray(new C4517a[0]);
        if (array != null) {
            C4517a[] aVarArr = (C4517a[]) array;
            Object[] array2 = arrayList2.toArray(new C7838i[0]);
            if (array2 != null) {
                return new C7827a(sb2, aVarArr, (C7838i[]) array2);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<SegmentModel> m18731a(C7827a aVar) {
        boolean z;
        C7838i[] iVarArr;
        int i;
        if (aVar == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String str = aVar.f21134a;
        C4517a[] aVarArr = aVar.f21135b;
        Intrinsics.checkExpressionValueIsNotNull(aVarArr, "atContent.ats");
        C7838i[] iVarArr2 = aVar.f21136c;
        Intrinsics.checkExpressionValueIsNotNull(iVarArr2, "atContent.links");
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < aVarArr.length || i3 < iVarArr2.length) {
                Icon icon = null;
                C4517a aVar2 = null;
                if (i2 < aVarArr.length) {
                    aVar2 = aVarArr[i2];
                }
                C7838i iVar = null;
                if (i3 < iVarArr2.length) {
                    iVar = iVarArr2[i3];
                }
                boolean z2 = true;
                if (iVar == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(iVar == null || aVar2 == null)) {
                    if (aVar2.f13212a >= iVar.f21154a) {
                        z2 = false;
                    }
                    z = z2;
                }
                if (z) {
                    if (aVar2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (aVar2.f13212a > i4) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "content");
                        int i5 = aVar2.f13212a;
                        if (str != null) {
                            String substring = str.substring(i4, i5);
                            Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            SegmentModel newTextSegment = SegmentModel.newTextSegment(substring);
                            Intrinsics.checkExpressionValueIsNotNull(newTextSegment, "SegmentModel.newTextSegment(text)");
                            arrayList.add(newTextSegment);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else if (aVar2.f13212a < i4) {
                        i2++;
                    }
                    String str2 = aVar2.f13217f;
                    String str3 = aVar2.f13216e;
                    String str4 = aVar2.f13215d;
                    int i6 = aVar2.f13214c;
                    boolean z3 = aVar2.f13225n;
                    String str5 = aVar2.f13226o;
                    if (TextUtils.isEmpty(aVar2.f13223l)) {
                        iVarArr = iVarArr2;
                    } else {
                        iVarArr = iVarArr2;
                        icon = new Icon(aVar2.f13224m, aVar2.f13223l, aVar2.f13222k);
                    }
                    SegmentModel newMentionSegment = SegmentModel.newMentionSegment(str2, str3, str4, i6, z3, str5, icon);
                    Intrinsics.checkExpressionValueIsNotNull(newMentionSegment, "SegmentModel.newMentionS….iconKey, at.iconFsunit))");
                    arrayList.add(newMentionSegment);
                    i2++;
                    i = aVar2.f13213b;
                    i4 = i;
                } else {
                    iVarArr = iVarArr2;
                    if (iVar == null) {
                        Intrinsics.throwNpe();
                    }
                    if (iVar.f21154a > i4) {
                        Intrinsics.checkExpressionValueIsNotNull(str, "content");
                        int i7 = iVar.f21154a;
                        if (str != null) {
                            String substring2 = str.substring(i4, i7);
                            Intrinsics.checkExpressionValueIsNotNull(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            SegmentModel newTextSegment2 = SegmentModel.newTextSegment(substring2);
                            Intrinsics.checkExpressionValueIsNotNull(newTextSegment2, "SegmentModel.newTextSegment(text)");
                            arrayList.add(newTextSegment2);
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    } else if (iVar.f21154a < i4) {
                        i3++;
                    }
                    SegmentModel newUrlSegment = SegmentModel.newUrlSegment(iVar.f21156c, iVar.f21157d);
                    Intrinsics.checkExpressionValueIsNotNull(newUrlSegment, "SegmentModel.newUrlSegment(text, href)");
                    arrayList.add(newUrlSegment);
                    i3++;
                    i = iVar.f21155b;
                    i4 = i;
                }
                iVarArr2 = iVarArr;
            } else {
                if (i4 < str.length()) {
                    Intrinsics.checkExpressionValueIsNotNull(str, "content");
                    if (str != null) {
                        String substring3 = str.substring(i4);
                        Intrinsics.checkExpressionValueIsNotNull(substring3, "(this as java.lang.String).substring(startIndex)");
                        SegmentModel newTextSegment3 = SegmentModel.newTextSegment(substring3);
                        Intrinsics.checkExpressionValueIsNotNull(newTextSegment3, "SegmentModel.newTextSegment(text)");
                        arrayList.add(newTextSegment3);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                return arrayList;
            }
        }
    }
}
