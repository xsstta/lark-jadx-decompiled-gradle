package com.bytedance.ee.bear.middleground.comment.audio;

import com.bytedance.ee.bear.middleground.p438a.AbstractC8878f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.koin.java.KoinJavaComponent;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J.\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\tJ\u0006\u0010\f\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/audio/CommentAudio;", "", "()V", "cancelRecord", "", "startRecord", "speechLocale", "", "askCallCallBack", "Lkotlin/Function3;", "", "", "stopRecord", "middleground-comment_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.audio.b */
public final class CommentAudio {

    /* renamed from: a */
    public static final CommentAudio f24366a = new CommentAudio();

    private CommentAudio() {
    }

    /* renamed from: a */
    public final void mo34591a() {
        ((AbstractC8878f) KoinJavaComponent.m268613a(AbstractC8878f.class, null, null, 6, null)).mo34069a();
    }

    /* renamed from: b */
    public final void mo34593b() {
        ((AbstractC8878f) KoinJavaComponent.m268613a(AbstractC8878f.class, null, null, 6, null)).mo34071b();
    }

    /* renamed from: a */
    public final void mo34592a(String str, Function3<? super String, ? super Boolean, ? super int[], Unit> oVar) {
        Intrinsics.checkParameterIsNotNull(str, "speechLocale");
        Intrinsics.checkParameterIsNotNull(oVar, "askCallCallBack");
        ((AbstractC8878f) KoinJavaComponent.m268613a(AbstractC8878f.class, null, null, 6, null)).mo34070a(str, oVar);
    }
}
