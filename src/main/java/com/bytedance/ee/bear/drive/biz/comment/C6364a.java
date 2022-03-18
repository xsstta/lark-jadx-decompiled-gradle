package com.bytedance.ee.bear.drive.biz.comment;

import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.a */
public class C6364a implements Comparator<CommentBean> {

    /* renamed from: a */
    private Map<String, CommentRectF> f17615a;

    public C6364a(Map<String, CommentRectF> map) {
        this.f17615a = map;
    }

    /* renamed from: a */
    public int compare(CommentBean commentBean, CommentBean commentBean2) {
        int i;
        int i2;
        CommentRectF commentRectF;
        int i3;
        float f;
        float f2;
        char c;
        char c2;
        float f3;
        int i4 = 0;
        if (commentBean.getComment_list() == null || commentBean.getComment_list().size() <= 0) {
            i = 0;
        } else {
            i = commentBean.getComment_list().get(0).getCreate_timestamp();
        }
        if (commentBean2.getComment_list() == null || commentBean2.getComment_list().size() <= 0) {
            i2 = 0;
        } else {
            i2 = commentBean2.getComment_list().get(0).getCreate_timestamp();
        }
        Map<String, CommentRectF> map = this.f17615a;
        CommentRectF commentRectF2 = null;
        if (map != null) {
            commentRectF2 = map.get(commentBean.getComment_id());
            commentRectF = this.f17615a.get(commentBean2.getComment_id());
        } else {
            commentRectF = null;
        }
        float f4 = BitmapDescriptorFactory.HUE_RED;
        if (commentRectF2 != null) {
            f2 = commentRectF2.top;
            f = commentRectF2.left;
            i3 = commentRectF2.mo25565d();
            int c3 = commentRectF2.mo25564c();
            if (c3 == 1 || c3 == 4) {
                c = 0;
            } else {
                c = 1;
            }
        } else {
            c = 0;
            f2 = BitmapDescriptorFactory.HUE_RED;
            f = BitmapDescriptorFactory.HUE_RED;
            i3 = 0;
        }
        if (commentRectF != null) {
            f4 = commentRectF.top;
            f3 = commentRectF.left;
            int d = commentRectF.mo25565d();
            int c4 = commentRectF.mo25564c();
            if (c4 == 1 || c4 == 4) {
                i4 = d;
                c2 = 0;
            } else {
                i4 = d;
                c2 = 1;
            }
        } else {
            c2 = 0;
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        if (i3 > i4) {
            return 1;
        }
        if (i3 < i4) {
            return -1;
        }
        if (c > c2) {
            return 1;
        }
        if (c < c2) {
            return -1;
        }
        if (f2 > f4) {
            return 1;
        }
        if (f2 < f4) {
            return -1;
        }
        if (f > f3) {
            return 1;
        }
        if (f < f3) {
            return -1;
        }
        return i - i2;
    }
}
