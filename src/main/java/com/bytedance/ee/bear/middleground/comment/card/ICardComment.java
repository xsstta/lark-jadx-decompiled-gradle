package com.bytedance.ee.bear.middleground.comment.card;

import android.view.View;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentAnimationParam;

/* renamed from: com.bytedance.ee.bear.middleground.comment.card.g */
public interface ICardComment {
    /* renamed from: a */
    void mo34735a(View view);

    /* renamed from: a */
    void mo34736a(CommentAnimationParam aVar);

    /* renamed from: a */
    void mo34737a(String str);

    /* renamed from: a */
    void mo34738a(String str, Integer num);

    /* renamed from: a */
    void mo34739a(boolean z);

    /* renamed from: b */
    void mo34742b(CommentAnimationParam aVar);

    /* renamed from: b */
    void mo34743b(String str);

    /* renamed from: b */
    void mo34744b(boolean z);

    /* renamed from: d */
    boolean mo34748d();

    /* renamed from: e */
    void mo34749e();

    /* renamed from: com.bytedance.ee.bear.middleground.comment.card.g$a */
    public static final class C9184a {
        /* renamed from: a */
        public static /* synthetic */ void m37995a(ICardComment gVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                gVar.mo34744b(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePanel");
        }

        /* renamed from: b */
        public static /* synthetic */ void m37996b(ICardComment gVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                gVar.mo34739a(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismiss");
        }
    }
}
