package com.ss.android.lark.mm.module.player;

import android.content.Context;
import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.framework.IMmDependency;
import com.ss.android.lark.mm.module.player.core.C46602i;
import com.ss.android.lark.mm.module.player.notification.AbstractC46706b;
import com.ss.android.lark.statistics.chat.ChatTypeStateKeeper;
import com.ss.android.videoshop.mediaview.SimpleMediaView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\"\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH&JH\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0007H&J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\b\u0010\u0017\u001a\u00020\u0007H&J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H&J\b\u0010\u001a\u001a\u00020\u000bH&J\b\u0010\u001b\u001a\u00020\u0007H&J\b\u0010\u001c\u001a\u00020\u001dH&J\b\u0010\u001e\u001a\u00020\u001dH&J\b\u0010\u001f\u001a\u00020\u0003H&J\b\u0010 \u001a\u00020\u0003H&J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u000bH&J\b\u0010#\u001a\u00020\u0003H&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0003H&J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u000bH&J\u0012\u0010,\u001a\u00020\u00032\b\u0010-\u001a\u0004\u0018\u00010.H&¨\u0006/"}, d2 = {"Lcom/ss/android/lark/mm/module/player/IMmVideoDependency;", "Lcom/ss/android/lark/mm/module/framework/IMmDependency;", "createAudioPlayer", "", "context", "Landroid/content/Context;", "url", "", "createServiceClient", ChatTypeStateKeeper.f135670e, "position", "", "duration", "createVideoPlayer", "mediaView", "Lcom/ss/android/videoshop/mediaview/SimpleMediaView;", "videoUrl", "coverUrl", "videoEncodingType", "", "getAudioUrl", "getBaseInfo", "Lcom/ss/android/lark/mm/module/detail/baseinfo/MmBaseInfo;", "getHost", "getPlayerAdapter", "Lcom/ss/android/lark/mm/module/player/core/MmPlayerAdapter;", "getSeekBarPosition", "getToken", "isAudioType", "", "isPodcast", "notifyServicePause", "notifyServiceResume", "notifyServieProgress", "timestamp", "onDestroy", "onMediaViewMove", "scale", "", "onMediaViewTouchUp", "totalDiff", "onStart", "seekToManual", "pos", "setVideoServiceDepend", "depend", "Lcom/ss/android/lark/mm/module/player/notification/IMmVideoClientDepend;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.b */
public interface IMmVideoDependency extends IMmDependency {

    @Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.b$a */
    public static final class C46591a {
        /* renamed from: a */
        public static void m184236a(IMmVideoDependency bVar, float f) {
        }

        /* renamed from: b */
        public static void m184237b(IMmVideoDependency bVar, float f) {
        }
    }

    /* renamed from: a */
    MmBaseInfo mo163616a();

    /* renamed from: a */
    void mo163617a(float f);

    /* renamed from: a */
    void mo163618a(long j);

    /* renamed from: a */
    void mo163619a(Context context, SimpleMediaView simpleMediaView, String str, String str2, String str3, long j, int i);

    /* renamed from: a */
    void mo163620a(Context context, String str);

    /* renamed from: a */
    void mo163621a(AbstractC46706b bVar);

    /* renamed from: a */
    void mo163622a(String str, long j, long j2);

    /* renamed from: b */
    void mo163623b(float f);

    /* renamed from: b */
    void mo163624b(long j);

    /* renamed from: b */
    boolean mo163625b();

    /* renamed from: c */
    String mo163626c();

    /* renamed from: d */
    long mo163627d();

    /* renamed from: e */
    void mo163628e();

    /* renamed from: f */
    void mo163629f();

    /* renamed from: g */
    C46602i mo163630g();

    /* renamed from: h */
    boolean mo163631h();
}
