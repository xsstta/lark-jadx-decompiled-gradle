package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.bytedance.lark.pb.search.v2.ExplanationTag;
import com.google.firebase.messaging.Constants;
import com.larksuite.component.ui.avatar.v2.ChatterAvatar;
import com.larksuite.component.ui.tag.LarkNameTag;
import com.larksuite.component.ui.tag.TextTag;
import com.larksuite.component.ui.tag.v2.ITagEditor;
import com.larksuite.framework.utils.UIUtils;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.utils.UiUtil;
import com.ss.android.lark.searchcommon.view.ChatterChatViewHolder;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import com.ss.android.lark.utils.C57860r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016J\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/lark/searchcommon/view/binder/MailContactBinder;", "Lcom/ss/android/lark/searchcommon/view/binder/CommonBinder;", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "mContext", "Landroid/content/Context;", "mOnItemClickHandler", "Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;", "(Landroid/content/Context;Lcom/ss/android/lark/searchcommon/view/SearchResultViewAdapter$IOnItemClickHandler;)V", "bindAvatar", "", "holder", "Lcom/ss/android/lark/searchcommon/view/ChatterChatViewHolder;", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "bindTag", "position", "", "getCaptureName", "", "title", "subtitle", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.s */
public final class MailContactBinder extends CommonBinder<SearchBaseInfo> {

    /* renamed from: a */
    private final Context f133677a;

    /* renamed from: b */
    private final SearchResultViewAdapter.IOnItemClickHandler f133678b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailContactBinder(Context context, SearchResultViewAdapter.IOnItemClickHandler bVar) {
        super(context, bVar);
        Intrinsics.checkParameterIsNotNull(context, "mContext");
        Intrinsics.checkParameterIsNotNull(bVar, "mOnItemClickHandler");
        this.f133677a = context;
        this.f133678b = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r2 != false) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m209592a(java.lang.String r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.searchcommon.view.binder.MailContactBinder.m209592a(java.lang.String, java.lang.String):java.lang.String");
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    /* renamed from: a */
    public void mo184769a(ChatterChatViewHolder aVar, SearchBaseInfo searchBaseInfo) {
        String str;
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        if (!TextUtils.isEmpty(searchBaseInfo.getAvatarKey())) {
            super.mo184769a(aVar, searchBaseInfo);
            return;
        }
        String a = m209592a(searchBaseInfo.getTitle(), searchBaseInfo.getSubTitle());
        int dp2px = UIUtils.dp2px(this.f133677a, 100.0f);
        UiUtil.Companion aVar2 = UiUtil.f133417t;
        if (a != null) {
            str = a;
        } else {
            str = "";
        }
        aVar.mo184645a().getItem().mo184662a(((ChatterAvatar.Builder) new ChatterAvatar.Builder().mo88958a(new BitmapDrawable(this.f133677a.getResources(), C57860r.m224570a(dp2px, dp2px, a, aVar2.mo184572b(str))))).mo88976k());
    }

    @Override // com.ss.android.lark.searchcommon.view.binder.CommonBinder
    /* renamed from: b */
    public void mo184807b(int i, ChatterChatViewHolder aVar, SearchBaseInfo searchBaseInfo) {
        Intrinsics.checkParameterIsNotNull(aVar, "holder");
        Intrinsics.checkParameterIsNotNull(searchBaseInfo, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        LarkNameTag.ChatterTagBuilder eVar = new LarkNameTag.ChatterTagBuilder(this.f133677a);
        List<ExplanationTag> explanationTags = searchBaseInfo.getExplanationTags();
        if (explanationTags != null) {
            for (T t : explanationTags) {
                TextTag.Companion bVar = TextTag.f62987a;
                TextTag.Builder aVar2 = new TextTag.Builder();
                UiUtil.Companion aVar3 = UiUtil.f133417t;
                String str = t.tag_type;
                Intrinsics.checkExpressionValueIsNotNull(str, "it.tag_type");
                Pair<Integer, Integer> a = aVar3.mo184571a(str);
                aVar2.mo90139b(100);
                aVar2.mo90136a(t.text);
                aVar2.mo90145d(a.getFirst().intValue());
                aVar2.mo90147e(a.getSecond().intValue());
                LarkNameTag.Builder bVar2 = (LarkNameTag.Builder) ITagEditor.C25691a.m92166a((ITagEditor) eVar, aVar2.mo90154l(), false, 2, (Object) null);
            }
        }
        aVar.mo184645a().getItem().setTag(eVar);
    }
}
