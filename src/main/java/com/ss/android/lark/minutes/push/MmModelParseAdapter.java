package com.ss.android.lark.minutes.push;

import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.mm.module.detail.comment.model.MmComment;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingContent;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingParagraph;
import com.ss.android.lark.mm.module.detail.subtitles.model.MmMeetingSentence;
import com.ss.android.lark.mm.module.highlight.model.MmHighlightInfo;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.participant.model.MmParticipants;
import com.ss.android.lark.mm.module.record.model.MmRecordSentence;
import com.ss.android.lark.mm.module.record.model.MmRecordWord;
import com.ss.android.lark.pb.meeting_object.CommentContentItem;
import com.ss.android.lark.pb.meeting_object.CommentItem;
import com.ss.android.lark.pb.meeting_object.HighlightItemInSubtitle;
import com.ss.android.lark.pb.meeting_object.LoginUserType;
import com.ss.android.lark.pb.meeting_object.ParagraphComment;
import com.ss.android.lark.pb.meeting_object.Participant;
import com.ss.android.lark.pb.meeting_object.Reaction;
import com.ss.android.lark.pb.meeting_object.RealTimeSubtitleSentence;
import com.ss.android.lark.pb.meeting_object.SubtitleParagraph;
import com.ss.android.lark.pb.meeting_object.SubtitleSentence;
import com.ss.android.lark.pb.meeting_object.SubtitleWord;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\fH\u0003J2\u0010\r\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0018H\u0007J<\u0010\u0019\u001a\"\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u000ej\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001a\u0018\u0001`\u00102\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001cH\u0007J\u0014\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0005\u001a\u0004\u0018\u00010!H\u0007J\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0#H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010+\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020-H\u0007¨\u0006."}, d2 = {"Lcom/ss/android/lark/minutes/push/MmModelParseAdapter;", "", "()V", "convertCmContentItemPb", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail$CommentDetailContent;", "pb", "Lcom/ss/android/lark/pb/meeting_object/CommentContentItem;", "convertCmItemPb", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo$CommentDetail;", "Lcom/ss/android/lark/pb/meeting_object/CommentItem;", "convertParaCommentPb", "Lcom/ss/android/lark/mm/module/detail/comment/model/MmComment$MmCommentInfo;", "Lcom/ss/android/lark/pb/meeting_object/ParagraphComment;", "meetingObjectToComment", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "reaction", "Lcom/ss/android/lark/pb/meeting_object/Reaction;", "pbContentToMm", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingContent;", "Lcom/ss/android/lark/pb/meeting_object/SubtitleWord;", "pbHighlightToMm", "Lcom/ss/android/lark/mm/module/highlight/model/MmHighlightInfo;", "Lcom/ss/android/lark/pb/meeting_object/HighlightItemInSubtitle;", "pbParaMapToMm", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingParagraph;", "", "Lcom/ss/android/lark/pb/meeting_object/SubtitleParagraph;", "pbParaToMm", "subtitleParagraph", "pbParticipantToMm", "Lcom/ss/android/lark/mm/module/participant/model/MmParticipants$MmParticipantInfo;", "Lcom/ss/android/lark/pb/meeting_object/Participant;", "pbReactionLineToMm", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "pbList", "Lcom/ss/android/lark/pb/meeting_object/HighlightTimeLineItem;", "pbRealTimeSentenceToMm", "Lcom/ss/android/lark/mm/module/record/model/MmRecordSentence;", "realTimeSubtitleSentence", "Lcom/ss/android/lark/pb/meeting_object/RealTimeSubtitleSentence;", "pbSentenceToMm", "Lcom/ss/android/lark/mm/module/detail/subtitles/model/MmMeetingSentence;", "Lcom/ss/android/lark/pb/meeting_object/SubtitleSentence;", "minutes_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.q.b.a */
public final class MmModelParseAdapter {

    /* renamed from: a */
    public static final MmModelParseAdapter f130787a = new MmModelParseAdapter();

    private MmModelParseAdapter() {
    }

    /* renamed from: a */
    public final HashMap<String, MmMeetingParagraph> mo180835a(Map<String, SubtitleParagraph> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap<String, MmMeetingParagraph> hashMap = new HashMap<>();
        for (String str : map.keySet()) {
            SubtitleParagraph subtitleParagraph = map.get(str);
            if (subtitleParagraph != null) {
                hashMap.put(str, m204923a(subtitleParagraph));
            }
        }
        return hashMap;
    }

    @JvmStatic
    /* renamed from: a */
    public static final List<HighlightTimeLineItem> m204929a(List<com.ss.android.lark.pb.meeting_object.HighlightTimeLineItem> list) {
        Intrinsics.checkParameterIsNotNull(list, "pbList");
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.isEmpty(list)) {
            for (com.ss.android.lark.pb.meeting_object.HighlightTimeLineItem highlightTimeLineItem : list) {
                HighlightTimeLineItem highlightTimeLineItem2 = new HighlightTimeLineItem();
                highlightTimeLineItem2.emoji_code = highlightTimeLineItem.memoji_code;
                Long l = highlightTimeLineItem.mstart_time;
                Intrinsics.checkExpressionValueIsNotNull(l, "pbItem.mstart_time");
                highlightTimeLineItem2.start_time = l.longValue();
                Long l2 = highlightTimeLineItem.mstop_time;
                Intrinsics.checkExpressionValueIsNotNull(l2, "pbItem.mstop_time");
                highlightTimeLineItem2.stop_time = l2.longValue();
                Integer num = highlightTimeLineItem.mtype;
                Intrinsics.checkExpressionValueIsNotNull(num, "pbItem.mtype");
                highlightTimeLineItem2.type = num.intValue();
                highlightTimeLineItem2.uuid = highlightTimeLineItem.muuid;
                arrayList.add(highlightTimeLineItem2);
            }
        }
        return arrayList;
    }

    @JvmStatic
    /* renamed from: a */
    public static final MmHighlightInfo m204925a(HighlightItemInSubtitle highlightItemInSubtitle) {
        Intrinsics.checkParameterIsNotNull(highlightItemInSubtitle, "pb");
        MmHighlightInfo mmHighlightInfo = new MmHighlightInfo();
        Integer num = highlightItemInSubtitle.moffset;
        Intrinsics.checkExpressionValueIsNotNull(num, "pb.moffset");
        mmHighlightInfo.setOffset(num.intValue());
        Integer num2 = highlightItemInSubtitle.mtype;
        Intrinsics.checkExpressionValueIsNotNull(num2, "pb.mtype");
        mmHighlightInfo.setType(num2.intValue());
        mmHighlightInfo.setUuid(highlightItemInSubtitle.muuid);
        mmHighlightInfo.setHighlight_id(highlightItemInSubtitle.mhighlight_id);
        mmHighlightInfo.setComment_id(highlightItemInSubtitle.mcomment_id);
        Integer num3 = highlightItemInSubtitle.msize;
        Intrinsics.checkExpressionValueIsNotNull(num3, "pb.msize");
        mmHighlightInfo.setSize(num3.intValue());
        return mmHighlightInfo;
    }

    @JvmStatic
    /* renamed from: a */
    public static final MmParticipants.MmParticipantInfo m204926a(Participant participant) {
        if (participant == null) {
            return null;
        }
        MmParticipants.MmParticipantInfo mmParticipantInfo = new MmParticipants.MmParticipantInfo();
        mmParticipantInfo.setAvatarUrl(participant.mavatar_url);
        mmParticipantInfo.setDeviceId(participant.mdevice_id);
        mmParticipantInfo.setUserId(participant.muser_id);
        mmParticipantInfo.setUserName(participant.muser_name);
        LoginUserType loginUserType = participant.muser_type;
        Intrinsics.checkExpressionValueIsNotNull(loginUserType, "pb.muser_type");
        mmParticipantInfo.setUserType(loginUserType.getValue());
        mmParticipantInfo.setAction_id(participant.maction_id);
        Boolean bool = participant.mis_external;
        Intrinsics.checkExpressionValueIsNotNull(bool, "pb.mis_external");
        mmParticipantInfo.setIs_external(bool.booleanValue());
        Boolean bool2 = participant.mis_host_user;
        Intrinsics.checkExpressionValueIsNotNull(bool2, "pb.mis_host_user");
        mmParticipantInfo.setIs_host_user(bool2.booleanValue());
        Boolean bool3 = participant.mis_login_user;
        Intrinsics.checkExpressionValueIsNotNull(bool3, "pb.mis_login_user");
        mmParticipantInfo.setIs_login_user(bool3.booleanValue());
        Boolean bool4 = participant.mis_in_participants;
        Intrinsics.checkExpressionValueIsNotNull(bool4, "pb.mis_in_participants");
        mmParticipantInfo.setIs_in_participants(bool4.booleanValue());
        Boolean bool5 = participant.mis_paragraph_speaker;
        Intrinsics.checkExpressionValueIsNotNull(bool5, "pb.mis_paragraph_speaker");
        mmParticipantInfo.setIs_paragraph_speaker(bool5.booleanValue());
        Long l = participant.mtenant_id;
        Intrinsics.checkExpressionValueIsNotNull(l, "pb.mtenant_id");
        mmParticipantInfo.setTenant_id(l.longValue());
        mmParticipantInfo.setTenant_name(participant.mtenant_name);
        mmParticipantInfo.setDepartment_name(participant.mdepartment_name);
        return mmParticipantInfo;
    }

    @JvmStatic
    /* renamed from: a */
    public static final HashMap<String, MmComment.MmCommentInfo> m204928a(Reaction reaction) {
        if (reaction == null) {
            return null;
        }
        HashMap<String, MmComment.MmCommentInfo> hashMap = new HashMap<>();
        for (String str : reaction.mcomments.keySet()) {
            HashMap<String, MmComment.MmCommentInfo> hashMap2 = hashMap;
            Intrinsics.checkExpressionValueIsNotNull(str, "key");
            ParagraphComment paragraphComment = reaction.mcomments.get(str);
            if (paragraphComment == null) {
                Intrinsics.throwNpe();
            }
            hashMap2.put(str, m204921a(paragraphComment));
        }
        return hashMap;
    }

    @JvmStatic
    /* renamed from: a */
    public static final MmRecordSentence m204927a(RealTimeSubtitleSentence realTimeSubtitleSentence) {
        Intrinsics.checkParameterIsNotNull(realTimeSubtitleSentence, "realTimeSubtitleSentence");
        MmRecordSentence mmRecordSentence = new MmRecordSentence();
        mmRecordSentence.setPid(realTimeSubtitleSentence.mpid);
        mmRecordSentence.setSid(realTimeSubtitleSentence.msid);
        mmRecordSentence.setStartTime(realTimeSubtitleSentence.mstart_time);
        mmRecordSentence.setStopTime(realTimeSubtitleSentence.mstop_time);
        mmRecordSentence.setLanguage(realTimeSubtitleSentence.mlanguage);
        mmRecordSentence.setObjectToken(realTimeSubtitleSentence.mbase_info.mobject_token);
        Boolean bool = realTimeSubtitleSentence.mis_final;
        Intrinsics.checkExpressionValueIsNotNull(bool, "realTimeSubtitleSentence.mis_final");
        mmRecordSentence.setFinal(bool.booleanValue());
        List<SubtitleWord> list = realTimeSubtitleSentence.mcontents;
        Intrinsics.checkExpressionValueIsNotNull(list, "realTimeSubtitleSentence.mcontents");
        List<SubtitleWord> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            MmRecordWord mmRecordWord = new MmRecordWord();
            mmRecordWord.setCid(t.mcid);
            mmRecordWord.setContent(t.mcontent);
            mmRecordWord.setLanguage(t.mlanguage);
            mmRecordWord.setStartTime(t.mstart_time);
            mmRecordWord.setStopTime(t.mstop_time);
            arrayList.add(mmRecordWord);
        }
        mmRecordSentence.setWords(arrayList);
        return mmRecordSentence;
    }

    @JvmStatic
    /* renamed from: a */
    private static final MmComment.MmCommentInfo.CommentDetail.CommentDetailContent m204919a(CommentContentItem commentContentItem) {
        MmComment.MmCommentInfo.CommentDetail.CommentDetailContent commentDetailContent = new MmComment.MmCommentInfo.CommentDetail.CommentDetailContent();
        commentDetailContent.setAvatar_url(commentContentItem.mavatar_url);
        commentDetailContent.setContent(commentContentItem.mcontent);
        commentDetailContent.setContent_id(commentContentItem.mcontent_id);
        Long l = commentContentItem.mcreate_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "pb.mcreate_time");
        commentDetailContent.setCreate_time(l.longValue());
        Long l2 = commentContentItem.mupdate_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "pb.mupdate_time");
        commentDetailContent.setUpdate_time(l2.longValue());
        commentDetailContent.setUser_id(commentContentItem.muser_id);
        commentDetailContent.setUser_name(commentContentItem.muser_name);
        return commentDetailContent;
    }

    @JvmStatic
    /* renamed from: a */
    private static final MmComment.MmCommentInfo.CommentDetail m204920a(CommentItem commentItem) {
        MmComment.MmCommentInfo.CommentDetail commentDetail = new MmComment.MmCommentInfo.CommentDetail();
        commentDetail.setUuid(commentItem.muuid);
        commentDetail.setComment_id(commentItem.mcomment_id);
        commentDetail.setQuote(commentItem.mquote);
        Long l = commentItem.mcreate_time;
        Intrinsics.checkExpressionValueIsNotNull(l, "pb.mcreate_time");
        commentDetail.setCreate_time(l.longValue());
        Long l2 = commentItem.mupdate_time;
        Intrinsics.checkExpressionValueIsNotNull(l2, "pb.mupdate_time");
        commentDetail.setUpdate_time(l2.longValue());
        List<CommentContentItem> list = commentItem.mcomment_content_list;
        Intrinsics.checkExpressionValueIsNotNull(list, "pb.mcomment_content_list");
        List<CommentContentItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(m204919a((CommentContentItem) t));
        }
        commentDetail.setComment_content_list(arrayList);
        commentDetail.setPid_list(commentItem.mpid_list);
        return commentDetail;
    }

    @JvmStatic
    /* renamed from: a */
    private static final MmComment.MmCommentInfo m204921a(ParagraphComment paragraphComment) {
        MmComment.MmCommentInfo mmCommentInfo = new MmComment.MmCommentInfo();
        mmCommentInfo.setPid(paragraphComment.mpid);
        Integer num = paragraphComment.mcomment_num;
        Intrinsics.checkExpressionValueIsNotNull(num, "pb.mcomment_num");
        mmCommentInfo.setComment_num(num.intValue());
        List<CommentItem> list = paragraphComment.mcomment_list;
        Intrinsics.checkExpressionValueIsNotNull(list, "pb.mcomment_list");
        List<CommentItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(m204920a((CommentItem) t));
        }
        mmCommentInfo.setComment_list(arrayList);
        return mmCommentInfo;
    }

    @JvmStatic
    /* renamed from: a */
    public static final MmMeetingContent m204922a(SubtitleWord subtitleWord) {
        Intrinsics.checkParameterIsNotNull(subtitleWord, "pb");
        MmMeetingContent mmMeetingContent = new MmMeetingContent();
        mmMeetingContent.setCid(subtitleWord.mcid);
        mmMeetingContent.setLanguage(subtitleWord.mlanguage);
        mmMeetingContent.setStartTime(subtitleWord.mstart_time);
        mmMeetingContent.setStopTime(subtitleWord.mstop_time);
        mmMeetingContent.setContent(subtitleWord.mcontent);
        return mmMeetingContent;
    }

    @JvmStatic
    /* renamed from: a */
    public static final MmMeetingParagraph m204923a(SubtitleParagraph subtitleParagraph) {
        Intrinsics.checkParameterIsNotNull(subtitleParagraph, "subtitleParagraph");
        MmMeetingParagraph mmMeetingParagraph = new MmMeetingParagraph();
        mmMeetingParagraph.setPid(subtitleParagraph.mpid);
        mmMeetingParagraph.setStartTime(subtitleParagraph.mstart_time);
        mmMeetingParagraph.setStopTime(subtitleParagraph.mstop_time);
        mmMeetingParagraph.setSpeaker(m204926a(subtitleParagraph.mspeaker));
        List<SubtitleSentence> list = subtitleParagraph.msentences;
        Intrinsics.checkExpressionValueIsNotNull(list, "subtitleParagraph.msentences");
        List<SubtitleSentence> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList.add(m204924a((SubtitleSentence) t));
        }
        mmMeetingParagraph.setSentences(arrayList);
        return mmMeetingParagraph;
    }

    @JvmStatic
    /* renamed from: a */
    public static final MmMeetingSentence m204924a(SubtitleSentence subtitleSentence) {
        ArrayList arrayList;
        Intrinsics.checkParameterIsNotNull(subtitleSentence, "pb");
        MmMeetingSentence mmMeetingSentence = new MmMeetingSentence();
        mmMeetingSentence.setSid(subtitleSentence.msid);
        mmMeetingSentence.setLanguage(subtitleSentence.mlanguage);
        mmMeetingSentence.setStartTime(subtitleSentence.mstart_time);
        mmMeetingSentence.setStopTime(subtitleSentence.mstop_time);
        List<SubtitleWord> list = subtitleSentence.mcontents;
        Intrinsics.checkExpressionValueIsNotNull(list, "pb.mcontents");
        List<SubtitleWord> list2 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (T t : list2) {
            Intrinsics.checkExpressionValueIsNotNull(t, "it");
            arrayList2.add(m204922a((SubtitleWord) t));
        }
        mmMeetingSentence.contents = arrayList2;
        List<HighlightItemInSubtitle> list3 = subtitleSentence.mhighlight;
        if (list3 != null) {
            List<HighlightItemInSubtitle> list4 = list3;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            for (T t2 : list4) {
                Intrinsics.checkExpressionValueIsNotNull(t2, "it");
                arrayList3.add(m204925a((HighlightItemInSubtitle) t2));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        mmMeetingSentence.setHighlight(arrayList);
        return mmMeetingSentence;
    }
}
