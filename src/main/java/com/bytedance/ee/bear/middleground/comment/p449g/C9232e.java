package com.bytedance.ee.bear.middleground.comment.p449g;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.bytedance.ee.bear.middleground.comment.export.bean.ReviewException;
import com.bytedance.ee.bear.p513o.AbstractC10365a;
import com.bytedance.ee.bear.thread.C11678b;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u001a4\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0018\b\u0002\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¨\u0006\u0006"}, d2 = {"checkResult", "Lio/reactivex/Flowable;", "", "vipCb", "Lkotlin/Function1;", "", "middleground-comment_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.g.e */
public final class C9232e {

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "apply"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.comment.g.e$a */
    public static final class C9233a<T, R> implements Function<T, R> {

        /* renamed from: a */
        final /* synthetic */ Function1 f24853a;

        C9233a(Function1 function1) {
            this.f24853a = function1;
        }

        /* renamed from: a */
        public final String apply(String str) {
            Intrinsics.checkParameterIsNotNull(str, "it");
            DataEntity.C9219Entity.BodyEntity a = CommentTo.f24850a.mo35310a(str);
            if (a == null) {
                return str;
            }
            String str2 = null;
            if (a.getCode() == 0) {
                try {
                    Function1 function1 = this.f24853a;
                    if (function1 != null) {
                        DataEntity.C9219Entity.BodyEntity.Extra extra = a.getExtra();
                        if (extra != null) {
                            str2 = extra.getNotNotifyUsers();
                        }
                        Unit unit = (Unit) function1.invoke(str2);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                return str;
            } else if (((AbstractC10365a) KoinJavaComponent.m268613a(AbstractC10365a.class, null, null, 6, null)).mo39496a(a.getCode())) {
                throw new ReviewException();
            } else {
                throw new Throwable(JSONObject.toJSONString(a));
            }
        }
    }

    /* renamed from: a */
    public static final AbstractC68307f<String> m38292a(AbstractC68307f<String> fVar, Function1<? super String, Unit> function1) {
        AbstractC68307f<R> d;
        AbstractC68307f<R> b;
        if (fVar == null || (d = fVar.mo238020d(new C9233a(function1))) == null || (b = d.mo238004b(C11678b.m48480d())) == null) {
            return null;
        }
        return b.mo237985a(C11678b.m48481e());
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC68307f m38293a(AbstractC68307f fVar, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m38292a(fVar, function1);
    }
}
