package com.bytedance.ee.bear.middleground.comment.export;

import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.middleground.comment.export.bean.CommentBean;
import com.bytedance.ee.bear.middleground.comment.export.bean.DataEntity;
import com.google.firebase.messaging.Constants;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006H&¨\u0006\u0014"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/IDataTransformer;", "", "dataToCommentBeans", "", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/CommentBean;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "action", "Lcom/bytedance/ee/bear/middleground/comment/export/Action;", "getPublishEntity", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/DataEntity$Entity$BodyEntity$PublishEntity;", "getResultBean", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/DataEntity$Entity$BodyEntity;", "getResultBody", "Lcom/alibaba/fastjson/JSONObject;", "resolveReactionData", "", "commentBeans", "trimAll", "content", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.j */
public interface IDataTransformer {
    /* renamed from: a */
    DataEntity.C9219Entity.BodyEntity mo34615a(String str);

    /* renamed from: a */
    List<CommentBean> mo34616a(String str, Action action);

    /* renamed from: b */
    DataEntity.C9219Entity.BodyEntity.PublishEntity mo34617b(String str);

    /* renamed from: c */
    JSONObject mo34618c(String str);
}
