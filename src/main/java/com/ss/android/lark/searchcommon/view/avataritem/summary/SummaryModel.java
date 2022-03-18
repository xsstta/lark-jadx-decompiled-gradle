package com.ss.android.lark.searchcommon.view.avataritem.summary;

import com.larksuite.suite.R;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0015\"\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/avataritem/summary/SummaryModel;", "", "summary", "", "(Ljava/lang/CharSequence;)V", "isVisible", "", "(Z)V", "highLightColor", "", "getHighLightColor", "()I", "setHighLightColor", "(I)V", "highLightKeys", "", "", "getHighLightKeys", "()Ljava/util/List;", "setHighLightKeys", "(Ljava/util/List;)V", "()Z", "setVisible", "getSummary", "()Ljava/lang/CharSequence;", "setSummary", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.avataritem.f.a */
public final class SummaryModel {

    /* renamed from: a */
    private CharSequence f133538a;

    /* renamed from: b */
    private boolean f133539b = true;

    /* renamed from: c */
    private List<String> f133540c;

    /* renamed from: d */
    private int f133541d = R.color.lkui_B500;

    /* renamed from: a */
    public final CharSequence mo184724a() {
        return this.f133538a;
    }

    /* renamed from: b */
    public final boolean mo184727b() {
        return this.f133539b;
    }

    /* renamed from: c */
    public final List<String> mo184728c() {
        return this.f133540c;
    }

    /* renamed from: d */
    public final int mo184729d() {
        return this.f133541d;
    }

    /* renamed from: a */
    public final void mo184725a(CharSequence charSequence) {
        this.f133538a = charSequence;
    }

    public SummaryModel(CharSequence charSequence) {
        this.f133538a = charSequence;
    }

    /* renamed from: a */
    public final void mo184726a(List<String> list) {
        this.f133540c = list;
    }

    public SummaryModel(boolean z) {
        this.f133539b = z;
    }
}
