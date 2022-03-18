package com.ss.android.lark.chatsetting.impl.common_view.base;

import com.larksuite.suite.R;
import com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece;
import com.ss.android.lark.piece.core.PieceGroup;
import com.ss.android.lark.piece.layout.LinearPieceGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\u00002\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bJ\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0018\u00010\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\rJ2\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J&\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J2\u0010\u0019\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001a2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0012\b\u0002\u0010\u001b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u001aH\u0007J*\u0010\u001c\u001a\u0014\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\b\u0012\u0004\u0012\u00020\u00050\u001d2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0014\u0010 \u001a\u00020\u00122\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J$\u0010!\u001a\u00020\u001f2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\f\u0010\u0015\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J$\u0010\"\u001a\u00020\u001f2\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\b2\f\u0010\u0014\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingPieceTypeManager;", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece$Callback;", "()V", "addedTypeList", "", "", "typeToPieceMap", "", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/SettingBasePiece;", "addPiece", "piece", "addPieceList", "pieceList", "", "build", "Lcom/ss/android/lark/chatsetting/impl/common_view/base/CustomizeLinearPieceGroup;", "typeList", "checkItemStyle", "", "prePiece", "curPiece", "nextPiece", "checkStyles", "start", "end", "customizeBuild", "Lcom/ss/android/lark/piece/core/PieceGroup;", "pieceGroup", "findVisiblePieceFromIndex", "Lkotlin/Pair;", "isBack", "", "invalidateStyle", "isPieceBottomRound", "isPieceTopRound", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.b */
public final class SettingPieceTypeManager implements SettingBasePiece.Callback {

    /* renamed from: a */
    private final Map<Integer, SettingBasePiece<?>> f89181a = new HashMap();

    /* renamed from: b */
    private final List<Integer> f89182b = new ArrayList();

    /* renamed from: a */
    public final CustomizeLinearPieceGroup mo127655a(List<Integer> list) {
        Intrinsics.checkParameterIsNotNull(list, "typeList");
        CustomizeLinearPieceGroup customizeLinearPieceGroup = new CustomizeLinearPieceGroup(1);
        mo127656a(list, customizeLinearPieceGroup);
        return customizeLinearPieceGroup;
    }

    /* renamed from: b */
    public final SettingPieceTypeManager mo127657b(SettingBasePiece<?> settingBasePiece) {
        Intrinsics.checkParameterIsNotNull(settingBasePiece, "piece");
        SettingPieceTypeManager bVar = this;
        settingBasePiece.mo127626a(bVar);
        bVar.f89181a.put(Integer.valueOf(settingBasePiece.mo127637h()), settingBasePiece);
        return bVar;
    }

    @Override // com.ss.android.lark.chatsetting.impl.common_view.base.SettingBasePiece.Callback
    /* renamed from: a */
    public void mo127641a(SettingBasePiece<?> settingBasePiece) {
        Intrinsics.checkParameterIsNotNull(settingBasePiece, "piece");
        int indexOf = this.f89182b.indexOf(Integer.valueOf(settingBasePiece.mo127637h()));
        Pair<SettingBasePiece<?>, Integer> a = m134156a(indexOf, false);
        m134157a(m134156a(a.getSecond().intValue(), false).getFirst(), a.getSecond().intValue(), m134156a(indexOf, true).getSecond().intValue() + 1);
    }

    /* renamed from: a */
    private final boolean m134159a(SettingBasePiece<?> settingBasePiece, SettingBasePiece<?> settingBasePiece2) {
        if (settingBasePiece == null || (settingBasePiece instanceof SettingSectionNamePiece) || settingBasePiece.mo177181D()) {
            return true;
        }
        if (settingBasePiece2 == null || !settingBasePiece2.mo177182E()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private final boolean m134160b(SettingBasePiece<?> settingBasePiece, SettingBasePiece<?> settingBasePiece2) {
        if (settingBasePiece2 == null || (settingBasePiece2 instanceof SettingSectionNamePiece)) {
            return true;
        }
        if ((settingBasePiece == null || !settingBasePiece.mo177181D()) && !settingBasePiece2.mo177182E()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final Pair<SettingBasePiece<?>, Integer> m134156a(int i, boolean z) {
        int i2;
        if (i < 0 || i > CollectionsKt.getLastIndex(this.f89182b)) {
            return new Pair<>(null, -1);
        }
        if (z) {
            i2 = i + 1;
        } else {
            i2 = i - 1;
        }
        while (i2 >= 0 && i2 <= CollectionsKt.getLastIndex(this.f89182b)) {
            SettingBasePiece<?> settingBasePiece = this.f89181a.get(this.f89182b.get(i2));
            if (settingBasePiece != null && settingBasePiece.mo127638i()) {
                return new Pair<>(settingBasePiece, Integer.valueOf(i2));
            }
            if (z) {
                i2++;
            } else {
                i2--;
            }
        }
        return new Pair<>(null, -1);
    }

    /* renamed from: a */
    public final PieceGroup<?, ?> mo127656a(List<Integer> list, PieceGroup<?, ?> pieceGroup) {
        Intrinsics.checkParameterIsNotNull(list, "typeList");
        if (pieceGroup == null) {
            pieceGroup = new LinearPieceGroup(1);
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            SettingBasePiece<?> settingBasePiece = this.f89181a.get(Integer.valueOf(it.next().intValue()));
            if (settingBasePiece != null) {
                PieceGroup.m199535a(pieceGroup, settingBasePiece, false, 2, null);
                this.f89182b.add(Integer.valueOf(settingBasePiece.mo127637h()));
            }
        }
        m134157a((SettingBasePiece<?>) null, 0, this.f89182b.size());
        return pieceGroup;
    }

    /* renamed from: a */
    private final void m134157a(SettingBasePiece<?> settingBasePiece, int i, int i2) {
        if (i < i2 && i >= 0 && i2 <= this.f89182b.size()) {
            while (CollectionsKt.contains(RangesKt.step(RangesKt.until(i, i2), 1), Integer.valueOf(i))) {
                SettingBasePiece<?> settingBasePiece2 = this.f89181a.get(this.f89182b.get(i));
                if (settingBasePiece2 != null && settingBasePiece2.mo127638i()) {
                    Pair<SettingBasePiece<?>, Integer> a = m134156a(i, true);
                    m134158a(settingBasePiece, settingBasePiece2, a.getFirst());
                    m134157a(settingBasePiece2, a.getSecond().intValue(), i2);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m134158a(SettingBasePiece<?> settingBasePiece, SettingBasePiece<?> settingBasePiece2, SettingBasePiece<?> settingBasePiece3) {
        int i;
        if (settingBasePiece2 != null && (settingBasePiece2 instanceof SettingSectionNamePiece)) {
            i = 0;
        } else if (m134159a(settingBasePiece, settingBasePiece2) && m134160b(settingBasePiece2, settingBasePiece3)) {
            i = R.drawable.bg_setting_group_item_round;
        } else if (m134159a(settingBasePiece, settingBasePiece2)) {
            i = R.drawable.bg_setting_group_item_round_top;
        } else if (m134160b(settingBasePiece2, settingBasePiece3)) {
            i = R.drawable.bg_setting_group_item_round_bottom;
        } else {
            i = R.drawable.bg_setting_group_item_rectangle;
        }
        if (settingBasePiece2 != null) {
            settingBasePiece2.mo177199d(i);
        }
        if (settingBasePiece != null) {
            settingBasePiece.mo127630b(DividerType.HIDDEN);
        }
        DividerType dividerType = null;
        if ((settingBasePiece2 == null || !(settingBasePiece2 instanceof SettingSectionNamePiece)) && !m134159a(settingBasePiece, settingBasePiece2)) {
            if (settingBasePiece2 != null) {
                dividerType = settingBasePiece2.mo127622a();
            }
            if (!(dividerType == DividerType.MARGIN_START || settingBasePiece2 == null)) {
                settingBasePiece2.mo127624a(DividerType.MARGIN_START);
            }
        } else {
            if (settingBasePiece2 != null) {
                dividerType = settingBasePiece2.mo127622a();
            }
            if (!(dividerType == DividerType.HIDDEN || settingBasePiece2 == null)) {
                settingBasePiece2.mo127624a(DividerType.HIDDEN);
            }
        }
        if (settingBasePiece3 == null && settingBasePiece2 != null) {
            settingBasePiece2.mo127630b(DividerType.HIDDEN);
        }
    }
}
