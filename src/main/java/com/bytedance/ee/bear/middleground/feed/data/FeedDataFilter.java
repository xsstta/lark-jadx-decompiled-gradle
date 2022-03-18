package com.bytedance.ee.bear.middleground.feed.data;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.bytedance.ee.bear.basesdk.C4484g;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9495h;
import com.bytedance.ee.bear.middleground.feed.export.bean.AtBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.CardBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.DeleteBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.FeedCommentDetailBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.LikeBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageBean;
import com.bytedance.ee.bear.middleground.feed.export.bean.MessageResultBean;
import com.bytedance.ee.bear.p522q.C10539a;
import com.bytedance.ee.bear.service.C10917c;
import com.bytedance.ee.bear.service.C10929e;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.p718t.C13749l;
import com.google.firebase.messaging.Constants;
import com.larksuite.suite.R;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.reaction.p2557b.C52986b;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005¢\u0006\u0002\u0010\u0002JD\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011H\u0002J4\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0002J4\u0010\u001a\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u0019H\u0002J6\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00192\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010 \u001a\u00020\u000fH\u0002J \u0010!\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$J\u001a\u0010%\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010'H\u0002¨\u0006)"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/data/FeedDataFilter;", "", "()V", "addCardMessage", "", "messageBean", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageBean;", "result", "", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/MultiBean;", "context", "Landroid/content/Context;", "serviceContext", "Lcom/bytedance/ee/bear/service/ServiceContext;", "index", "", "messageBeanList", "", "addComment", "messageItem", "lastItem", "", "defaultTitle", "", "defaultContent", "", "addDeleteComment", "isResolve", "resolveContent", "addLickComment", "title", "userList", "count", "addMention", "filter", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/bytedance/ee/bear/middleground/feed/export/bean/MessageResultBean;", "getLangString", "i18n", "Lcom/bytedance/ee/bear/middleground/feed/export/bean/CardBean$ContentBean$Content$Content2$I18n;", "Companion", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.feed.a.c */
public final class FeedDataFilter {

    /* renamed from: a */
    public static final Companion f25323a = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/bytedance/ee/bear/middleground/feed/data/FeedDataFilter$Companion;", "", "()V", "TAG", "", "middleground-feed_release"}, mo238835k = 1, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.a.c$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    public final List<AbstractC9495h> mo35902a(Context context, MessageResultBean messageResultBean) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(messageResultBean, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        C10917c cVar = new C10917c(new C10929e());
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        MessageResultBean.Data data = messageResultBean.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "data.data");
        ArrayList message = data.getMessage();
        if (message == null) {
            message = new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int i = 0;
        for (T t : message) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            Intrinsics.checkExpressionValueIsNotNull(t2, "messageBean");
            boolean z = true;
            if (Intrinsics.areEqual(t2.getType(), "MESSAGE_DOC_COMMENT")) {
                arrayList2.add(Integer.valueOf(t2.getDelete()));
                arrayList3.add(Integer.valueOf(t2.getFinish()));
                if (t2.getFinish() == 1 || t2.getDelete() == 1) {
                    arrayList.add(m38952a(this, context, (MessageBean) t2, i == CollectionsKt.getLastIndex(message), false, (String) null, 24, (Object) null));
                } else {
                    arrayList.add(m38951a(this, context, t2, i == CollectionsKt.getLastIndex(message), (CharSequence) null, (String) null, 24, (Object) null));
                }
            } else if (Intrinsics.areEqual(t2.getType(), "MESSAGE_DOC_MENTION")) {
                if (i != CollectionsKt.getLastIndex(message)) {
                    z = false;
                }
                arrayList.add(m38948a(context, t2, z));
            } else if (Intrinsics.areEqual(t2.getType(), "MESSAGE_CARD")) {
                m38955a(t2, arrayList, context, cVar, i, message);
            }
            i = i2;
        }
        C13479a.m54764b("FeedDataFilter", "parse data cost: " + (System.currentTimeMillis() - currentTimeMillis) + " result size:" + arrayList.size() + " delete status:" + arrayList2.toString() + " finish status:" + arrayList3.toString());
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", ShareHitPoint.f121868c, "", "getDrawable"}, mo238835k = 3, mv = {1, 1, 15})
    /* renamed from: com.bytedance.ee.bear.middleground.feed.a.c$b */
    public static final class C9421b implements Html.ImageGetter {

        /* renamed from: a */
        final /* synthetic */ Context f25324a;

        C9421b(Context context) {
            this.f25324a = context;
        }

        public final Drawable getDrawable(String str) {
            Drawable drawable = this.f25324a.getResources().getDrawable(Integer.parseInt(str), null);
            drawable.setBounds(0, 0, C13749l.m55738a(18), C13749l.m55738a(18));
            return drawable;
        }
    }

    /* renamed from: a */
    private final String m38954a(C10917c cVar, CardBean.ContentBean.Content.Content2.I18n i18n) {
        if (i18n == null) {
            return "";
        }
        String c = C4484g.m18494b().mo17252c();
        Locale locale = Locale.CHINA;
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.CHINA");
        if (TextUtils.equals(c, locale.getLanguage())) {
            String str = i18n.zh_cn;
            Intrinsics.checkExpressionValueIsNotNull(str, "i18n.zh_cn");
            return str;
        }
        Locale locale2 = Locale.JAPANESE;
        Intrinsics.checkExpressionValueIsNotNull(locale2, "Locale.JAPANESE");
        if (TextUtils.equals(c, locale2.getLanguage())) {
            String str2 = i18n.ja_jp;
            Intrinsics.checkExpressionValueIsNotNull(str2, "i18n.ja_jp");
            return str2;
        }
        String str3 = i18n.en_us;
        Intrinsics.checkExpressionValueIsNotNull(str3, "i18n.en_us");
        return str3;
    }

    /* renamed from: a */
    private final AbstractC9495h m38948a(Context context, MessageBean messageBean, boolean z) {
        AtBean atBean = new AtBean();
        atBean.setMessageId(messageBean.getMessageId());
        atBean.setCreateTime((long) messageBean.getCreateTime());
        atBean.setReadStatus(messageBean.getReadStatus());
        atBean.setResolveStatus(messageBean.getSolveStatus());
        atBean.setContent(C10539a.m43639a(context, R.string.Doc_Feed_At_In_Document, "user_name", messageBean.getName()));
        atBean.setLastItem(z);
        atBean.setAtId(messageBean.getMentionId());
        atBean.setAvatarUrl(messageBean.getAvatar_url());
        atBean.setUserId(messageBean.getUser_id());
        return atBean;
    }

    /* renamed from: a */
    private final AbstractC9495h m38949a(Context context, MessageBean messageBean, boolean z, CharSequence charSequence, String str) {
        Pair pair;
        FeedCommentDetailBean feedCommentDetailBean = new FeedCommentDetailBean();
        feedCommentDetailBean.setMessageId(messageBean.getMessageId());
        feedCommentDetailBean.setReadStatus(messageBean.getReadStatus());
        feedCommentDetailBean.setCreateTime((long) messageBean.getCreateTime());
        feedCommentDetailBean.setResolveStatus(messageBean.getSolveStatus());
        if (messageBean.getCommentMention() == 1) {
            pair = TuplesKt.to(0, C10539a.m43639a(context, R.string.Doc_Feed_At, "user_name", messageBean.getName()));
        } else if (messageBean.getReplyIndex() <= 0) {
            pair = TuplesKt.to(0, C10539a.m43639a(context, R.string.Doc_Feed_New_Comment, "user_name", messageBean.getName()));
        } else if (messageBean.getReplyIndex() > 0) {
            pair = TuplesKt.to(0, C10539a.m43639a(context, R.string.Doc_Feed_New_Reply, "user_name", messageBean.getName()));
        } else {
            pair = TuplesKt.to(0, C10539a.m43639a(context, R.string.Doc_Feed_New_Comment, "user_name", messageBean.getName()));
        }
        int intValue = ((Number) pair.component1()).intValue();
        String str2 = (String) pair.component2();
        feedCommentDetailBean.setType(intValue);
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = str2;
        }
        feedCommentDetailBean.setTitleStr(charSequence);
        feedCommentDetailBean.setLastItem(z);
        feedCommentDetailBean.setComment_id(messageBean.getComment_id());
        feedCommentDetailBean.setIs_whole(messageBean.getIs_whole());
        feedCommentDetailBean.setReply_id(messageBean.getReply_id());
        feedCommentDetailBean.setUser_id(messageBean.getUser_id());
        feedCommentDetailBean.setAvatar_url(messageBean.getAvatar_url());
        feedCommentDetailBean.setName(messageBean.getName());
        feedCommentDetailBean.setCreate_timestamp(messageBean.getCreate_timestamp());
        feedCommentDetailBean.setUpdate_timestamp(messageBean.getUpdate_timestamp());
        if (TextUtils.isEmpty(str)) {
            str = messageBean.getContent();
        }
        feedCommentDetailBean.setContent(str);
        feedCommentDetailBean.setTranslate_content(messageBean.getTranslate_content());
        feedCommentDetailBean.setTranslate_status(messageBean.getTranslate_status());
        return feedCommentDetailBean;
    }

    /* renamed from: a */
    private final AbstractC9495h m38950a(Context context, MessageBean messageBean, boolean z, boolean z2, String str) {
        Pair pair;
        DeleteBean deleteBean = new DeleteBean();
        deleteBean.setMessageId(messageBean.getMessageId());
        deleteBean.setCreateTime((long) messageBean.getCreateTime());
        deleteBean.setReadStatus(messageBean.getReadStatus());
        boolean z3 = true;
        if (z2) {
            pair = TuplesKt.to(2, str);
        } else if (messageBean.getFinish() == 1) {
            pair = TuplesKt.to(2, context.getString(R.string.Doc_Feed_Comment_Resolve));
        } else {
            pair = TuplesKt.to(1, context.getString(R.string.Doc_Feed_Comment_Delete));
        }
        deleteBean.setType(((Number) pair.component1()).intValue());
        deleteBean.setTitleStr((String) pair.component2());
        deleteBean.setResolveStatus(messageBean.getSolveStatus());
        deleteBean.setLastItem(z);
        deleteBean.setUserId(messageBean.getUser_id());
        deleteBean.setAvatarUrl(messageBean.getAvatar_url());
        deleteBean.setCommentId(messageBean.getComment_id());
        deleteBean.setReplyId(messageBean.getReply_id());
        if (messageBean.getIs_whole() != 1) {
            z3 = false;
        }
        deleteBean.setWhole(z3);
        return deleteBean;
    }

    /* renamed from: a */
    private final AbstractC9495h m38953a(MessageBean messageBean, boolean z, String str, List<String> list, int i) {
        LikeBean likeBean = new LikeBean();
        likeBean.setAvatarUrl(messageBean.getAvatar_url());
        likeBean.setMessageId(messageBean.getMessageId());
        likeBean.setCreateTime((long) messageBean.getCreateTime());
        likeBean.setReadStatus(messageBean.getReadStatus());
        likeBean.setTitleStr(str);
        likeBean.setResolveStatus(messageBean.getSolveStatus());
        likeBean.setLastItem(z);
        likeBean.setUserList(list);
        likeBean.setLikeCount(i);
        return likeBean;
    }

    /* renamed from: a */
    private final void m38955a(MessageBean messageBean, List<AbstractC9495h> list, Context context, C10917c cVar, int i, List<? extends MessageBean> list2) {
        CardBean.ContentBean.Content.Content2 content2;
        CardBean.ContentBean.Content.Content2 content22;
        CardBean.ContentBean.Content.Content2 content23;
        List<List<CardBean.ContentBean.Content.Content2>> list3;
        List<List<CardBean.ContentBean.Content.Content2>> list4;
        int i2;
        boolean z;
        CardBean.ContentBean.Content.Content2 content24;
        String str;
        CardBean.ContentBean.Content.Content2 content25;
        CardBean.ContentBean.Content.Content2 content26;
        List<List<CardBean.ContentBean.Content.Content2>> list5;
        List<List<CardBean.ContentBean.Content.Content2>> list6;
        List<List<CardBean.ContentBean.Content.Content2>> list7;
        boolean z2;
        CardBean.ContentBean.Content.Content2 content27;
        List<List<CardBean.ContentBean.Content.Content2>> list8;
        CardBean.ContentBean parseContent = CardBean.parseContent(messageBean);
        String subType = messageBean.getSubType();
        boolean z3 = false;
        CardBean.ContentBean.Content.Content2.I18n i18n = null;
        r10 = null;
        CardBean.ContentBean.Content.Content2.I18n i18n2 = null;
        r10 = null;
        String str2 = null;
        i18n = null;
        if (Intrinsics.areEqual(subType, "reaction") || Intrinsics.areEqual(subType, "comment_reopen")) {
            CardBean.ContentBean.Content content = parseContent.content;
            List<CardBean.ContentBean.Content.Content2> list9 = (content == null || (list4 = content.content) == null) ? null : list4.get(0);
            CardBean.ContentBean.Content content3 = parseContent.content;
            List<CardBean.ContentBean.Content.Content2> list10 = (content3 == null || (list3 = content3.content) == null) ? null : list3.get(1);
            String a = m38954a(cVar, (list9 == null || (content23 = list9.get(0)) == null) ? null : content23.i18n);
            if (Intrinsics.areEqual("reaction", subType)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("<img src='");
                sb.append(C52986b.m205215a((list9 == null || (content22 = list9.get(1)) == null) ? null : content22.text));
                sb.append("'>");
                a = sb.toString();
            }
            Spanned fromHtml = Html.fromHtml(a, new C9421b(context), null);
            if (!(list10 == null || (content2 = list10.get(0)) == null)) {
                i18n = content2.i18n;
            }
            String a2 = m38954a(cVar, i18n);
            if (i == CollectionsKt.getLastIndex(list2)) {
                z3 = true;
            }
            Intrinsics.checkExpressionValueIsNotNull(fromHtml, "span");
            list.add(m38949a(context, messageBean, z3, fromHtml, a2));
        } else if (Intrinsics.areEqual(subType, "comment_solve")) {
            messageBean.setFinish(1);
            CardBean.ContentBean.Content content4 = parseContent.content;
            List<CardBean.ContentBean.Content.Content2> list11 = (content4 == null || (list8 = content4.content) == null) ? null : list8.get(0);
            if (!(list11 == null || (content27 = list11.get(0)) == null)) {
                i18n2 = content27.i18n;
            }
            String a3 = m38954a(cVar, i18n2);
            if (i == CollectionsKt.getLastIndex(list2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            list.add(m38950a(context, messageBean, z2, true, a3));
        } else if (Intrinsics.areEqual(subType, "like")) {
            CardBean.ContentBean.Content content5 = parseContent.content;
            List<CardBean.ContentBean.Content.Content2> list12 = (content5 == null || (list7 = content5.content) == null) ? null : list7.get(0);
            CardBean.ContentBean.Content content6 = parseContent.content;
            List<CardBean.ContentBean.Content.Content2> list13 = (content6 == null || (list6 = content6.content) == null) ? null : list6.get(1);
            CardBean.ContentBean.Content content7 = parseContent.content;
            List<CardBean.ContentBean.Content.Content2> list14 = (content7 == null || (list5 = content7.content) == null) ? null : list5.get(2);
            String a4 = m38954a(cVar, (list12 == null || (content26 = list12.get(0)) == null) ? null : content26.i18n);
            if (!(list13 == null || (content25 = list13.get(0)) == null)) {
                str2 = content25.text;
            }
            JSONArray<Object> parseArray = JSON.parseArray(str2);
            ArrayList arrayList = new ArrayList();
            Intrinsics.checkExpressionValueIsNotNull(parseArray, "jsonArray");
            for (Object obj : parseArray) {
                arrayList.add(obj.toString());
            }
            if (list14 == null || (content24 = list14.get(0)) == null || (str = content24.text) == null) {
                i2 = arrayList.size();
            } else {
                i2 = Integer.parseInt(str);
            }
            if (i == CollectionsKt.getLastIndex(list2)) {
                z = true;
            } else {
                z = false;
            }
            list.add(m38953a(messageBean, z, a4, arrayList, i2));
        }
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC9495h m38951a(FeedDataFilter cVar, Context context, MessageBean messageBean, boolean z, CharSequence charSequence, String str, int i, Object obj) {
        String str2;
        if ((i & 8) != 0) {
        }
        if ((i & 16) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        return cVar.m38949a(context, messageBean, z, charSequence, str2);
    }

    /* renamed from: a */
    static /* synthetic */ AbstractC9495h m38952a(FeedDataFilter cVar, Context context, MessageBean messageBean, boolean z, boolean z2, String str, int i, Object obj) {
        boolean z3;
        if ((i & 8) != 0) {
            z3 = false;
        } else {
            z3 = z2;
        }
        if ((i & 16) != 0) {
            str = "";
        }
        return cVar.m38950a(context, messageBean, z, z3, str);
    }
}
