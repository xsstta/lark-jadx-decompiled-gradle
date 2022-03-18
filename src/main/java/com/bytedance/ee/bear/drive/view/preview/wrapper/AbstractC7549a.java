package com.bytedance.ee.bear.drive.view.preview.wrapper;

import android.content.res.Configuration;
import android.view.View;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.view.preview.AbstractC7262d;
import java.util.ArrayList;

/* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.a */
public interface AbstractC7549a extends AbstractC7262d {

    /* renamed from: com.bytedance.ee.bear.drive.view.preview.wrapper.a$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$a(AbstractC7549a aVar, Configuration configuration) {
        }
    }

    /* renamed from: a */
    void mo28370a(Configuration configuration);

    String getCommentQuote();

    View getView();

    CommentRectF hideCreateComment();

    boolean onAreaClick();

    boolean onBackPressed();

    void onCommentInputPanelClose();

    void onCommentListPanelClose();

    void onSetup(ViewOwner viewOwner);

    void show();

    void showSelectedComment(String str);

    void showThumbnailPreview();

    void updateComment(ArrayList<CommentRectF> arrayList);
}
