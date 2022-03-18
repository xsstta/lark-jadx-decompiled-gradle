package com.bytedance.ee.bear.middleground.comment.input;

import com.bytedance.ee.bear.middleground.comment.export.bean.CommentInputRequest;

/* renamed from: com.bytedance.ee.bear.middleground.comment.input.a */
public interface ICommentInput {
    /* renamed from: a */
    CommentInputRequest mo35368a();

    /* renamed from: a */
    void mo35369a(CommentInputRequest commentInputRequest);

    /* renamed from: a */
    void mo35370a(String str);

    /* renamed from: a */
    void mo35371a(boolean z);

    /* renamed from: a */
    void mo35372a(boolean z, boolean z2, boolean z3);

    /* renamed from: b */
    void mo35373b(boolean z);

    /* renamed from: b */
    boolean mo35374b();

    /* renamed from: c */
    void mo35375c();

    /* renamed from: com.bytedance.ee.bear.middleground.comment.input.a$a */
    public static final class C9239a {
        /* renamed from: a */
        public static /* synthetic */ void m38353a(ICommentInput aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                aVar.mo35373b(z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismiss");
        }

        /* renamed from: a */
        public static /* synthetic */ void m38354a(ICommentInput aVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = false;
                }
                if ((i & 4) != 0) {
                    z3 = true;
                }
                aVar.mo35372a(z, z2, z3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: show");
        }
    }
}
