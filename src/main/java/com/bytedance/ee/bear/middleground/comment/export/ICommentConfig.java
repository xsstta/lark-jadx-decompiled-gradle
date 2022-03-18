package com.bytedance.ee.bear.middleground.comment.export;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.ee.bear.middleground.comment.export.bean.TranslateConfig;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0018\u0010\u001c\u001a\u00020\u0014X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u0018\u0010\u001f\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b \u0010\f\"\u0004\b!\u0010\u000eR\u0018\u0010\"\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010\u000eR\u0018\u0010%\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR\u0018\u0010(\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u0018\u0010+\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000eR\u001e\u0010.\u001a\u00020/X¦\u000e¢\u0006\u0012\u0012\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0012\u00106\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\tR\u0018\u00108\u001a\u000209X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0018\u0010>\u001a\u00020\u000bX¦\u000e¢\u0006\f\u001a\u0004\b?\u0010\f\"\u0004\b@\u0010\u000e¨\u0006A"}, d2 = {"Lcom/bytedance/ee/bear/middleground/comment/export/ICommentConfig;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "docUrl", "", "getDocUrl", "()Ljava/lang/String;", "isVC", "", "()Z", "setVC", "(Z)V", "mCommentAnalytic", "Lcom/bytedance/ee/bear/middleground/comment/export/ICommentReport;", "getMCommentAnalytic", "()Lcom/bytedance/ee/bear/middleground/comment/export/ICommentReport;", "panelDefaultHeight", "", "getPanelDefaultHeight", "()I", "setPanelDefaultHeight", "(I)V", "panelMaxHeight", "getPanelMaxHeight", "setPanelMaxHeight", "panelMinHeight", "getPanelMinHeight", "setPanelMinHeight", "showBlank", "getShowBlank", "setShowBlank", "showCommentImage", "getShowCommentImage", "setShowCommentImage", "showInsertImage", "getShowInsertImage", "setShowInsertImage", "showReaction", "getShowReaction", "setShowReaction", "showVoice", "getShowVoice", "setShowVoice", "styleType", "", "styleType$annotations", "()V", "getStyleType", "()J", "setStyleType", "(J)V", "token", "getToken", "translate", "Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "getTranslate", "()Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;", "setTranslate", "(Lcom/bytedance/ee/bear/middleground/comment/export/bean/TranslateConfig;)V", "useCustomHeight", "getUseCustomHeight", "setUseCustomHeight", "middleground-comment-export_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.middleground.comment.export.f */
public interface ICommentConfig {
    /* renamed from: a */
    FragmentActivity mo35279a();

    /* renamed from: a */
    void mo35280a(int i);

    /* renamed from: a */
    void mo35281a(long j);

    /* renamed from: a */
    void mo35282a(TranslateConfig translateConfig);

    /* renamed from: a */
    void mo35283a(boolean z);

    /* renamed from: b */
    void mo35284b(int i);

    /* renamed from: b */
    void mo35285b(boolean z);

    /* renamed from: c */
    void mo35286c(int i);
}
