package com.bytedance.ee.bear.middleground.comment.control;

import androidx.lifecycle.C1177w;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.comment.export.Action;
import com.bytedance.ee.bear.middleground.comment.export.IDataControl;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.rn.RnReactionProtocol;
import com.huawei.hms.feature.dynamic.DynamicModule;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import io.reactivex.AbstractC68307f;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.ee.bear.middleground.comment.b.c */
public interface DataControl extends IDataControl {
    /* renamed from: a */
    AbstractC68307f<String> mo34694a(int i, String str, String str2);

    /* renamed from: a */
    AbstractC68307f<String> mo34695a(String str, String str2);

    /* renamed from: a */
    AbstractC68307f<String> mo34696a(String str, String str2, String str3, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, boolean z2, Map<Object, ? extends Object> map);

    /* renamed from: a */
    AbstractC68307f<String> mo34697a(String str, String str2, boolean z);

    /* renamed from: a */
    AbstractC68307f<String> mo34698a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, String str2, boolean z, String str3, String str4, boolean z2, String str5, String str6, Map<Object, ? extends Object> map);

    /* renamed from: a */
    AbstractC68307f<String> mo34699a(String str, List<? extends CommentBean.CommentDetail.ExtraEntity.CommentImageEntity> list, boolean z, String str2, String str3, boolean z2, String str4, String str5, String str6, String str7, String str8, String str9, Map<Object, ? extends Object> map);

    /* renamed from: a */
    AbstractC68307f<String> mo34700a(String str, boolean z);

    /* renamed from: a */
    void mo34701a();

    /* renamed from: a */
    void mo34702a(C8275a aVar);

    /* renamed from: a */
    void mo34703a(RnReactionProtocol.ReactionDataObserver aVar);

    /* renamed from: a */
    void mo34704a(String str);

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl
    /* renamed from: a */
    void mo34705a(String str, Action action);

    /* renamed from: a */
    void mo34706a(List<CommentBean> list);

    /* renamed from: a */
    void mo34707a(Function1<? super String, Unit> function1);

    /* renamed from: b */
    C1177w<List<CommentBean>> mo34708b();

    /* renamed from: b */
    AbstractC68307f<String> mo34709b(String str, String str2);

    /* renamed from: b */
    void mo34710b(String str);

    /* renamed from: b */
    void mo34711b(Function1<? super String, Unit> function1);

    /* renamed from: c */
    AbstractC68307f<String> mo34712c();

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl
    /* renamed from: c */
    AbstractC68307f<String> mo34713c(String str, String str2);

    /* renamed from: c */
    void mo34714c(String str);

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl
    /* renamed from: d */
    AbstractC68307f<String> mo34715d(String str, String str2);

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl
    /* renamed from: d */
    void mo34716d();

    @Override // com.bytedance.ee.bear.middleground.comment.export.IDataControl
    /* renamed from: e */
    void mo34717e();

    /* renamed from: com.bytedance.ee.bear.middleground.comment.b.c$a */
    public static final class C9096a {

        /* renamed from: com.bytedance.ee.bear.middleground.comment.b.c$a$a */
        public static final class C9097a extends Lambda implements Function1<String, Unit> {
            public static final C9097a INSTANCE = new C9097a();

            C9097a() {
                super(1);
            }

            public final void invoke(String str) {
                Intrinsics.checkParameterIsNotNull(str, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bytedance.ee.bear.middleground.comment.b.c */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ void m37731a(DataControl cVar, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    function1 = C9097a.INSTANCE;
                }
                cVar.mo34711b(function1);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removePushListener");
        }

        /* renamed from: a */
        public static /* synthetic */ AbstractC68307f m37729a(DataControl cVar, String str, String str2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                return cVar.mo34697a(str, str2, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteComment");
        }

        /* renamed from: a */
        public static /* synthetic */ AbstractC68307f m37730a(DataControl cVar, String str, List list, String str2, boolean z, String str3, String str4, boolean z2, String str5, String str6, Map map, int i, Object obj) {
            boolean z3;
            String str7;
            String str8;
            boolean z4;
            String str9;
            String str10;
            Map map2;
            if (obj == null) {
                if ((i & 8) != 0) {
                    z3 = false;
                } else {
                    z3 = z;
                }
                if ((i & 16) != 0) {
                    str7 = "";
                } else {
                    str7 = str3;
                }
                if ((i & 32) != 0) {
                    str8 = "";
                } else {
                    str8 = str4;
                }
                if ((i & 64) != 0) {
                    z4 = false;
                } else {
                    z4 = z2;
                }
                if ((i & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
                    str9 = null;
                } else {
                    str9 = str5;
                }
                if ((i & DynamicModule.f58006b) != 0) {
                    str10 = null;
                } else {
                    str10 = str6;
                }
                if ((i & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) != 0) {
                    map2 = null;
                } else {
                    map2 = map;
                }
                return cVar.mo34698a(str, list, str2, z3, str7, str8, z4, str9, str10, map2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replyComment");
        }
    }
}
