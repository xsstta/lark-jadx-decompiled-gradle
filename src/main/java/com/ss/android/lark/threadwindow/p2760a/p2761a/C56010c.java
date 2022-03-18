package com.ss.android.lark.threadwindow.p2760a.p2761a;

import android.content.Context;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.chat.core.model.C33958d;
import com.ss.android.lark.chat.entity.thread.ThreadInfo;
import com.ss.android.lark.chatbase.AbstractC34417b;
import com.ss.android.lark.threadwindow.p2760a.p2761a.C56015h;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.threadwindow.a.a.c */
public class C56010c extends AbstractC56008a {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: a */
    public void mo122933a() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ss.android.lark.threadwindow.p2760a.p2761a.AbstractC56008a
    /* renamed from: b */
    public int mo122940b() {
        return 7;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.chatbase.AbstractC34417b
    /* renamed from: c */
    public String mo122942c() {
        return "FilterFollowDataStore";
    }

    @Override // com.ss.android.lark.threadwindow.p2760a.p2761a.AbstractC56014g
    /* renamed from: n */
    public void mo191026n() {
        mo127141m();
        this.f88882b.beginUpdate();
        ArrayList<ThreadInfo> arrayList = new ArrayList(this.f88882b);
        if (CollectionUtils.isNotEmpty(arrayList)) {
            for (ThreadInfo threadInfo : arrayList) {
                if (!threadInfo.mo126018b().isFollow()) {
                    this.f88882b.remove(this.f88882b.getItemPosByKey(threadInfo.mo126018b().getId()));
                }
            }
        }
        this.f88882b.finishUpdate();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo122946d(ThreadInfo threadInfo) {
        return threadInfo.mo126018b().isFollow();
    }

    public C56010c(C33958d dVar, AbstractC34417b.AbstractC34423e eVar, C56015h.AbstractC56017a aVar, Context context) {
        super(dVar, eVar, aVar, context);
    }
}
