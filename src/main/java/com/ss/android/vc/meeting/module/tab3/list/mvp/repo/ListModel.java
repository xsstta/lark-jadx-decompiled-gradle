package com.ss.android.vc.meeting.module.tab3.list.mvp.repo;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.entity.GrootCell;
import com.ss.android.vc.entity.tab.VCTabListGrootCellPayload;
import com.ss.android.vc.entity.tab.VCTabListItem;
import com.ss.android.vc.meeting.module.tab3.list.mvp.repo.utils.MeetingListUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040!H\u0002J\u0016\u0010\"\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0!H\u0002J\u0016\u0010#\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0!H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010\f2\u0006\u0010%\u001a\u00020\u0004H\u0002J.\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020)2\u000e\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010!2\u0006\u0010+\u001a\u00020,J\u0016\u0010-\u001a\u00020\u001f2\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00020/\u0018\u00010\u000bJ\u001c\u00100\u001a\u00020\u001f2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\f0!2\u0006\u0010+\u001a\u00020,R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\t¨\u00062"}, d2 = {"Lcom/ss/android/vc/meeting/module/tab3/list/mvp/repo/ListModel;", "", "()V", "TAG", "", "calendarId", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "dataList", "", "Lcom/ss/android/vc/entity/tab/VCTabListItem;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "isHistoryHasMore", "", "()Z", "setHistoryHasMore", "(Z)V", "isUpcomingHasMore", "setUpcomingHasMore", "maxHistoryId", "getMaxHistoryId", "setMaxHistoryId", "minHistoryId", "getMinHistoryId", "setMinHistoryId", "doDelete", "", "items", "", "doInsert", "doUpdate", "getEntityInHistoryId", "historyId", "mergeList", "isFirstPage", "entity", "Lcom/ss/android/vc/entity/tab/VCTabListHistoryListEntity;", "upcomingList", "upcomingMax", "", "syncHistory", "cells", "Lcom/ss/android/vc/entity/GrootCell;", "syncUpcoming", "list", "lib_vc_suiteRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.c */
public final class ListModel {

    /* renamed from: a */
    private final String f160056a = "ListModel";

    /* renamed from: b */
    private boolean f160057b;

    /* renamed from: c */
    private boolean f160058c = true;

    /* renamed from: d */
    private String f160059d = "";

    /* renamed from: e */
    private String f160060e = "";

    /* renamed from: f */
    private String f160061f = "";

    /* renamed from: g */
    private List<VCTabListItem> f160062g = new ArrayList();

    /* renamed from: b */
    public final boolean mo219378b() {
        return this.f160058c;
    }

    /* renamed from: c */
    public final String mo219379c() {
        return this.f160060e;
    }

    /* renamed from: d */
    public final String mo219380d() {
        return this.f160061f;
    }

    /* renamed from: e */
    public final List<VCTabListItem> mo219381e() {
        return this.f160062g;
    }

    /* renamed from: a */
    public final boolean mo219377a() {
        return this.f160057b;
    }

    /* renamed from: a */
    public final void mo219375a(boolean z) {
        this.f160058c = z;
    }

    /* renamed from: a */
    public final void mo219372a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f160061f = str;
    }

    /* renamed from: b */
    private final VCTabListItem m248386b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int size = this.f160062g.size();
        for (int i = 0; i < size; i++) {
            VCTabListItem vCTabListItem = this.f160062g.get(i);
            if (vCTabListItem != null && Intrinsics.areEqual(vCTabListItem.getHistoryId(), str)) {
                return vCTabListItem;
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m248387b(List<? extends VCTabListItem> list) {
        boolean z;
        String str = this.f160056a;
        C60700b.m235851b(str, "[doInsert]", StringsKt.trimIndent("items size= " + list.size()));
        for (VCTabListItem vCTabListItem : list) {
            int size = this.f160062g.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                VCTabListItem vCTabListItem2 = this.f160062g.get(i);
                if (vCTabListItem2 != null && Intrinsics.areEqual(vCTabListItem2.getHistoryId(), vCTabListItem.getHistoryId())) {
                    z = true;
                    break;
                }
                i++;
            }
            if (!z) {
                this.f160062g.add(0, vCTabListItem);
            }
        }
    }

    /* renamed from: c */
    private final void m248388c(List<? extends VCTabListItem> list) {
        String str = this.f160056a;
        C60700b.m235851b(str, "[doUpdate]", StringsKt.trimIndent("items size= " + list.size()));
        for (VCTabListItem vCTabListItem : list) {
            int size = this.f160062g.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                VCTabListItem vCTabListItem2 = this.f160062g.get(i);
                if (vCTabListItem2 != null && Intrinsics.areEqual(vCTabListItem2.getHistoryId(), vCTabListItem.getHistoryId())) {
                    this.f160062g.remove(vCTabListItem2);
                    this.f160062g.add(i, vCTabListItem);
                    z = true;
                }
            }
            if (!z) {
                this.f160062g.add(vCTabListItem);
            }
        }
    }

    /* renamed from: d */
    private final void m248389d(List<String> list) {
        VCTabListItem b;
        String str = this.f160056a;
        C60700b.m235851b(str, "[doDelete]", StringsKt.trimIndent("items= " + list.size()));
        for (String str2 : list) {
            if (!TextUtils.isEmpty(str2) && (b = m248386b(str2)) != null) {
                this.f160062g.remove(b);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo219373a(List<GrootCell> list) {
        boolean z;
        List<GrootCell> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (GrootCell grootCell : list) {
                VCTabListGrootCellPayload vCTabListGrootCellPayload = grootCell.vcTabListHistoryChangeInfo;
                if (vCTabListGrootCellPayload != null) {
                    List<VCTabListItem> insertTopItems = vCTabListGrootCellPayload.getInsertTopItems();
                    List<VCTabListItem> updateItems = vCTabListGrootCellPayload.getUpdateItems();
                    List<String> deleteHistoryIds = vCTabListGrootCellPayload.getDeleteHistoryIds();
                    if (!CollectionUtils.isEmpty(deleteHistoryIds)) {
                        Intrinsics.checkExpressionValueIsNotNull(deleteHistoryIds, "deleteHistoryIds");
                        m248389d(deleteHistoryIds);
                    }
                    if (!CollectionUtils.isEmpty(insertTopItems)) {
                        Intrinsics.checkExpressionValueIsNotNull(insertTopItems, "insertTopList");
                        m248387b(insertTopItems);
                    }
                    if (!CollectionUtils.isEmpty(updateItems)) {
                        Intrinsics.checkExpressionValueIsNotNull(updateItems, "updateList");
                        m248388c(updateItems);
                    }
                    MeetingListUtil.f160042a.mo219356a(this.f160062g);
                    int size = this.f160062g.size();
                    if (size > 0) {
                        String historyId = this.f160062g.get(0).getHistoryId();
                        if (!TextUtils.isEmpty(historyId) && historyId.compareTo(this.f160059d) > 0) {
                            Intrinsics.checkExpressionValueIsNotNull(historyId, "curMaxId");
                            this.f160059d = historyId;
                        }
                        String historyId2 = this.f160062g.get(size - 1).getHistoryId();
                        if (!TextUtils.isEmpty(historyId2) && historyId2.compareTo(this.f160060e) < 0) {
                            Intrinsics.checkExpressionValueIsNotNull(historyId2, "minId");
                            this.f160060e = historyId2;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo219374a(List<? extends VCTabListItem> list, int i) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(list, "list");
        Iterator<VCTabListItem> it = this.f160062g.iterator();
        while (it.hasNext()) {
            if (it.next().isUpcoming()) {
                it.remove();
            }
        }
        if (list.size() > i) {
            z = true;
        } else {
            z = false;
        }
        this.f160057b = z;
        if (!z) {
            i = list.size();
        }
        this.f160062g.addAll(0, list.subList(0, i));
        MeetingListUtil.f160042a.mo219356a(this.f160062g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x006f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00a7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo219376a(boolean r5, com.ss.android.vc.entity.tab.VCTabListHistoryListEntity r6, java.util.List<? extends com.ss.android.vc.entity.tab.VCTabListItem> r7, int r8) {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.tab3.list.mvp.repo.ListModel.mo219376a(boolean, com.ss.android.vc.entity.tab.VCTabListHistoryListEntity, java.util.List, int):void");
    }
}
