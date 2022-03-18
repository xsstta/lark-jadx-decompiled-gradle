package com.ss.android.lark.threadtab.view.p2759a;

import com.larksuite.framework.utils.p1203a.AbstractC26248b;
import com.ss.android.lark.chat.entity.thread.RecommendTopicGroup;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.lark.threadtab.view.a.b */
public class C55987b extends C55986a implements AbstractC26248b<C55987b> {

    /* renamed from: d */
    private int f138368d;

    /* renamed from: e */
    private boolean f138369e;

    /* renamed from: f */
    private int f138370f;

    /* renamed from: g */
    private boolean f138371g;

    /* renamed from: h */
    private RecommendTopicGroup.JoinState f138372h;

    /* renamed from: i */
    private List<RecommendTopicGroup.RelatedUser> f138373i;

    /* renamed from: j */
    private int f138374j;

    /* renamed from: k */
    private boolean f138375k;

    /* renamed from: a */
    public int mo190828a() {
        return this.f138368d;
    }

    public String toString() {
        return "threadChatId: " + this.f138367c + ", name: " + this.f138366b + ", showType: " + this.f138368d + ", position: " + this.f138370f + ", joinState: " + this.f138372h + ", userCount: " + this.f138374j;
    }

    /* renamed from: a */
    public boolean isItemSame(C55987b bVar) {
        if (this == bVar) {
            return true;
        }
        return Objects.equals(this.f138367c, bVar.f138367c);
    }

    /* renamed from: b */
    public boolean isContentSame(C55987b bVar) {
        if (!Objects.equals(this.f138367c, bVar.f138367c) || !Objects.equals(this.f138365a, bVar.f138365a) || !Objects.equals(this.f138366b, bVar.f138366b) || !Objects.equals(Boolean.valueOf(this.f138369e), Boolean.valueOf(bVar.f138369e))) {
            return false;
        }
        if (mo190828a() == 1) {
            int i = this.f138370f;
            if (i == 0 && bVar.f138370f != 0) {
                return false;
            }
            if (i != 0 && bVar.f138370f == 0) {
                return false;
            }
        }
        if (Objects.equals(Boolean.valueOf(this.f138371g), Boolean.valueOf(bVar.f138371g)) && Objects.equals(this.f138372h, bVar.f138372h) && Objects.equals(Integer.valueOf(this.f138374j), Integer.valueOf(bVar.f138374j)) && Objects.equals(this.f138373i, bVar.f138373i) && Objects.equals(Boolean.valueOf(this.f138375k), Boolean.valueOf(bVar.f138375k))) {
            return true;
        }
        return false;
    }
}
