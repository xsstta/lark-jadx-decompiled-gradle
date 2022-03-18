package com.ss.android.lark.guidemgr.statistics;

import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Event;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.guidemgr.statistics.UGAppreciable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/guidemgr/statistics/GuideMgrAppreciable;", "Lcom/ss/android/lark/guidemgr/statistics/UGAppreciable;", "()V", "getBiz", "Lcom/ss/android/lark/appreciablelib/Biz;", "getScene", "Lcom/ss/android/lark/appreciablelib/Scene;", "newPostUserConsumingGuidePoint", "Lcom/ss/android/lark/guidemgr/statistics/UGAppreciable$NetPoint;", "newUserGuidePoint", "base_guide-mgr_guide-mgr_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.guidemgr.f.b */
public final class GuideMgrAppreciable extends UGAppreciable {

    /* renamed from: a */
    public static final GuideMgrAppreciable f99618a = new GuideMgrAppreciable();

    private GuideMgrAppreciable() {
    }

    @Override // com.ss.android.lark.guidemgr.statistics.UGAppreciable
    /* renamed from: a */
    public Biz mo141906a() {
        return Biz.UserGrowth;
    }

    @Override // com.ss.android.lark.guidemgr.statistics.UGAppreciable
    /* renamed from: b */
    public Scene mo141907b() {
        return Scene.UGCenter;
    }

    /* renamed from: c */
    public final UGAppreciable.NetPoint mo141908c() {
        return new UGAppreciable.NetPoint(Event.ug_get_user_guide, this);
    }

    /* renamed from: d */
    public final UGAppreciable.NetPoint mo141909d() {
        return new UGAppreciable.NetPoint(Event.ug_post_user_consuming_guide, this);
    }
}
