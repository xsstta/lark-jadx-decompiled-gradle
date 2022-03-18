package com.ss.android.lark.mm.module.player.videotoolbar;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.detail.search.model.FindResponse;
import com.ss.android.lark.mm.module.framework.IMmListener;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.player.core.C46602i;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00032\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u000bH&J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001cH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u000bH&J\b\u0010#\u001a\u00020\u0003H&¨\u0006$"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/IMmVideoToolbarListener;", "Lcom/ss/android/lark/mm/module/framework/IMmListener;", "bindPlayAdapter", "", "playAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "onBaseInfoChange", "baseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "onChangeCommentSwitchState", "switchOn", "", "onChangeReactionLine", "list", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "onChangeReactionSwitchState", "isSwitchOn", "onFindResult", "findResponse", "Lcom/ss/android/lark/mm/module/detail/search/model/FindResponse;", "onFindResultFocusChange", "index", "", "onForceUpdateProgress", "onHideToolBar", "onMediaViewMove", "scale", "", "onMediaViewTouchUp", "totalDiff", "onSeekTo", "ts", "", "manual", "onSwitchPodcastSucceed", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.c */
public interface IMmVideoToolbarListener extends IMmListener {
    /* renamed from: a */
    void mo164208a(float f);

    /* renamed from: a */
    void mo164209a(int i);

    /* renamed from: a */
    void mo164210a(long j, boolean z);

    /* renamed from: a */
    void mo164211a(MmBaseInfo mmBaseInfo);

    /* renamed from: a */
    void mo164212a(FindResponse findResponse);

    /* renamed from: a */
    void mo164213a(C46602i iVar);

    /* renamed from: a */
    void mo164214a(List<? extends HighlightTimeLineItem> list);

    /* renamed from: a */
    void mo164215a(boolean z);

    /* renamed from: b */
    void mo164216b(float f);

    /* renamed from: b */
    void mo164217b(boolean z);

    /* renamed from: g */
    void mo164218g();

    /* renamed from: i */
    void mo164219i();

    /* renamed from: j */
    void mo164220j();
}
