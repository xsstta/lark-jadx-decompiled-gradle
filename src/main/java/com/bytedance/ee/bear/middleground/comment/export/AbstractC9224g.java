package com.bytedance.ee.bear.middleground.comment.export;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.p519p.AbstractC10460a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: com.bytedance.ee.bear.middleground.comment.export.g */
public interface AbstractC9224g {
    /* renamed from: a */
    ICardAdapter mo34609a(IComment eVar);

    /* renamed from: a */
    IComment mo34610a(CommentBuilder bVar);

    /* renamed from: a */
    IReactionHelper mo34611a();

    /* renamed from: a */
    AbstractC10460a.AbstractC10461a mo34612a(FragmentActivity fragmentActivity, long j, C8275a aVar, Function1<String, Boolean> function1, Function1<String, Unit> function12, Function1<String, Unit> function13);

    /* renamed from: b */
    IDataTransformer mo34613b();

    /* renamed from: c */
    IAnimatorSettings mo34614c();
}
