package com.bytedance.ee.bear.drive.biz.comment.data;

import android.content.Context;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bytedance.ee.bear.drive.biz.comment.area.AreaCoordinate;
import com.bytedance.ee.bear.drive.biz.comment.area.CommentRectF;
import com.bytedance.ee.bear.drive.biz.comment.data.AreaCommentFetcher;
import com.bytedance.ee.bear.drive.biz.comment.model.AreaCommentPayLoadData;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p700c.C13598b;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.bear.drive.biz.comment.data.a */
public class C6376a {

    /* renamed from: a */
    private static ArrayMap<String, Integer> f17650a = new ArrayMap<>(1);

    /* renamed from: b */
    private static ArrayMap<Integer, String> f17651b;

    static {
        ArrayMap<Integer, String> arrayMap = new ArrayMap<>(1);
        f17651b = arrayMap;
        Integer valueOf = Integer.valueOf((int) R.string.Drive_Drive_FeedComment);
        arrayMap.put(valueOf, "common.comment");
        ArrayMap<Integer, String> arrayMap2 = f17651b;
        Integer valueOf2 = Integer.valueOf((int) R.string.Drive_Drive_QuoteText);
        arrayMap2.put(valueOf2, "comment.quote.text");
        ArrayMap<Integer, String> arrayMap3 = f17651b;
        Integer valueOf3 = Integer.valueOf((int) R.string.Drive_Drive_QuotePage);
        arrayMap3.put(valueOf3, "comment.quote.page");
        f17650a.put("common.comment", valueOf);
        f17650a.put("comment.quote.text", valueOf2);
        f17650a.put("comment.quote.page", valueOf3);
    }

    /* renamed from: a */
    public static String m25607a() {
        try {
            return JSON.toJSONString(new CommentQuote(f17651b.get(Integer.valueOf((int) R.string.Drive_Drive_FeedComment)), new String[0]));
        } catch (Exception e) {
            C13479a.m54761a("CommentDataUtils", e);
            return "";
        }
    }

    /* renamed from: a */
    static AreaCoordinate m25605a(CommentRectF commentRectF) {
        AreaCoordinate areaCoordinate = new AreaCoordinate();
        AreaCoordinate.Position position = new AreaCoordinate.Position();
        areaCoordinate.setType(commentRectF.mo25564c());
        position.setLeft(commentRectF.left);
        position.setTop(commentRectF.top);
        position.setRight(commentRectF.right);
        position.setBottom(commentRectF.bottom);
        position.setPage(commentRectF.mo25565d());
        position.setText(commentRectF.mo25568f());
        position.setQuads(commentRectF.mo25566e());
        areaCoordinate.setPosition(position);
        return areaCoordinate;
    }

    /* renamed from: a */
    static ArrayList<CommentRectF> m25609a(ArrayList<AreaCommentFetcher.AreaComment> arrayList) {
        ArrayList<CommentRectF> arrayList2 = new ArrayList<>();
        Iterator<AreaCommentFetcher.AreaComment> it = arrayList.iterator();
        while (it.hasNext()) {
            AreaCommentFetcher.AreaComment next = it.next();
            CommentRectF a = CommentRectF.m25575a(next.getCommentId(), next.getAreaCoordinate());
            if (a != null) {
                arrayList2.add(a);
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    static CommentRectF m25606a(String str, String str2) {
        try {
            JSONObject jSONObject = JSON.parseObject(str).getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
            if (!TextUtils.equals(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString(ShareHitPoint.f121869d), "areaCommentAdd")) {
                return null;
            }
            C13479a.m54764b("DRIVE_COMMENT_FLOW", "receive push sdk area comment add, json=" + C13598b.m55200g(str));
            AreaCommentPayLoadData areaCommentPayLoadData = (AreaCommentPayLoadData) JSON.parseObject(jSONObject.getJSONObject(Constants.ScionAnalytics.MessageType.DATA_MESSAGE).getString(Constants.ScionAnalytics.MessageType.DATA_MESSAGE), AreaCommentPayLoadData.class);
            CommentRectF a = CommentRectF.m25575a(areaCommentPayLoadData.getCommentId(), areaCommentPayLoadData.getAreaCoordinate());
            if (TextUtils.equals(str2, areaCommentPayLoadData.getVersion())) {
                C13479a.m54764b("DRIVE_COMMENT_FLOW", "receive push area comment add, start add in view, rectf=" + a);
                return a;
            }
            C13479a.m54775e("DRIVE_COMMENT_FLOW", "receive area comment push but current not the same dataVersionpushDataVersion=" + areaCommentPayLoadData.getVersion() + ", currentDataVersion=" + str2);
            return null;
        } catch (Exception e) {
            C13479a.m54761a("DRIVE_COMMENT_FLOW", e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m25608a(Context context, String str) {
        Integer num;
        try {
            C13479a.m54764b("CommentDataUtils", "quote: " + str);
            CommentQuote commentQuote = (CommentQuote) JSON.parseObject(str, CommentQuote.class);
            if (!(commentQuote == null || (num = f17650a.get(commentQuote.getKey())) == null)) {
                String[] params = commentQuote.getParams();
                if (params == null) {
                    params = new String[0];
                }
                if (num.intValue() == R.string.Drive_Drive_QuoteText) {
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("page", params[0]);
                    hashMap.put("text", params[1]);
                    return C10539a.m43640a(context, num.intValue(), hashMap);
                } else if (num.intValue() == R.string.Drive_Drive_QuotePage) {
                    return C10539a.m43639a(context, num.intValue(), "page", params[0]);
                } else {
                    return context.getString(num.intValue(), params);
                }
            }
        } catch (Exception unused) {
            C13479a.m54772d("CommentDataUtils", "quote no support");
        }
        return context.getString(R.string.Drive_Drive_FeedComment);
    }
}
