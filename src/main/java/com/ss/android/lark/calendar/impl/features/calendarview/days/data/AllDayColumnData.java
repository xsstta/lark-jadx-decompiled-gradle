package com.ss.android.lark.calendar.impl.features.calendarview.days.data;

import com.ss.android.lark.calendar.impl.features.calendarview.entity.AllDayEventChipViewData;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendarview/days/data/AllDayColumnData;", "", "()V", "expandChipMaxRow", "", "getExpandChipMaxRow", "()I", "setExpandChipMaxRow", "(I)V", "foldChipMaxRow", "getFoldChipMaxRow", "setFoldChipMaxRow", "hideChipData", "Ljava/util/ArrayList;", "Lcom/ss/android/lark/calendar/impl/features/calendarview/entity/AllDayEventChipViewData;", "getHideChipData", "()Ljava/util/ArrayList;", "hintChipCount", "getHintChipCount", "setHintChipCount", "isAddedHideChipData", "", "()Z", "setAddedHideChipData", "(Z)V", "showChipData", "getShowChipData", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendarview.days.a.b */
public final class AllDayColumnData {

    /* renamed from: a */
    private int f77018a;

    /* renamed from: b */
    private int f77019b;

    /* renamed from: c */
    private boolean f77020c;

    /* renamed from: d */
    private int f77021d;

    /* renamed from: e */
    private final ArrayList<AllDayEventChipViewData> f77022e = new ArrayList<>();

    /* renamed from: f */
    private final ArrayList<AllDayEventChipViewData> f77023f = new ArrayList<>();

    /* renamed from: a */
    public final int mo110937a() {
        return this.f77018a;
    }

    /* renamed from: b */
    public final int mo110940b() {
        return this.f77019b;
    }

    /* renamed from: d */
    public final int mo110944d() {
        return this.f77021d;
    }

    /* renamed from: e */
    public final ArrayList<AllDayEventChipViewData> mo110945e() {
        return this.f77022e;
    }

    /* renamed from: f */
    public final ArrayList<AllDayEventChipViewData> mo110946f() {
        return this.f77023f;
    }

    /* renamed from: c */
    public final boolean mo110943c() {
        return this.f77020c;
    }

    /* renamed from: c */
    public final void mo110942c(int i) {
        this.f77021d = i;
    }

    /* renamed from: a */
    public final void mo110938a(int i) {
        this.f77018a = i;
    }

    /* renamed from: b */
    public final void mo110941b(int i) {
        this.f77019b = i;
    }

    /* renamed from: a */
    public final void mo110939a(boolean z) {
        this.f77020c = z;
    }
}
