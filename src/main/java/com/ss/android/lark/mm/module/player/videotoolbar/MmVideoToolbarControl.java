package com.ss.android.lark.mm.module.player.videotoolbar;

import com.ss.android.lark.mm.module.framework.MmBaseControl;
import com.ss.android.lark.mm.module.highlight.timeline.HighlightTimeLineItem;
import com.ss.android.lark.mm.module.highlight.timeline.HightlightTimeLine;
import com.ss.android.lark.mm.module.podcast.MmPodcastLinkInfo;
import com.ss.android.lark.mm.net.p2332a.C47057a;
import com.ss.android.lark.mm.net.p2333b.AbstractC47070c;
import com.ss.android.lark.mm.net.p2333b.AbstractC47071d;
import com.ss.android.lark.mm.net.p2333b.C47068a;
import com.ss.android.lark.mm.utils.UrlUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010\u001b\u001a\u00020\u00192\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dJ\u0016\u0010\u001f\u001a\u00020\u00192\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0005J\u000e\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0011J\u0016\u0010#\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\fR$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\f¨\u0006&"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl;", "Lcom/ss/android/lark/mm/module/framework/MmBaseControl;", "url", "", "listInfoList", "", "Lcom/ss/android/lark/mm/module/podcast/MmPodcastLinkInfo;", "(Ljava/lang/String;Ljava/util/List;)V", "host", "getHost", "()Ljava/lang/String;", "setHost", "(Ljava/lang/String;)V", "getListInfoList", "()Ljava/util/List;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl$IMmDetailToolBarControlListener;", "token", "getToken", "setToken", "value", "getUrl", "setUrl", "addListener", "", "listener", "getTimeLine", "callback", "Lcom/ss/android/lark/mm/net/callback/IHttpDataCallback;", "Lcom/ss/android/lark/mm/module/highlight/timeline/HightlightTimeLine;", "onPushReactionLine", "list", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "removeListener", "updateTopic", "newTopic", "IMmDetailToolBarControlListener", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.f */
public final class MmVideoToolbarControl extends MmBaseControl {

    /* renamed from: a */
    private String f117588a;

    /* renamed from: b */
    private String f117589b;

    /* renamed from: c */
    private String f117590c;

    /* renamed from: d */
    private final CopyOnWriteArrayList<IMmDetailToolBarControlListener> f117591d = new CopyOnWriteArrayList<>();

    /* renamed from: e */
    private final List<MmPodcastLinkInfo> f117592e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl$IMmDetailToolBarControlListener;", "", "onPushReactionLine", "", "list", "", "Lcom/ss/android/lark/mm/module/highlight/timeline/HighlightTimeLineItem;", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.f$a */
    public interface IMmDetailToolBarControlListener {
        /* renamed from: a */
        void mo161638a(List<? extends HighlightTimeLineItem> list);
    }

    /* renamed from: a */
    public final String mo164225a() {
        return this.f117588a;
    }

    /* renamed from: b */
    public final String mo164231b() {
        return this.f117589b;
    }

    /* renamed from: c */
    public final String mo164233c() {
        return this.f117590c;
    }

    /* renamed from: d */
    public final List<MmPodcastLinkInfo> mo164234d() {
        return this.f117592e;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"com/ss/android/lark/mm/module/player/videotoolbar/MmVideoToolbarControl$getTimeLine$1", "Lcom/ss/android/lark/mm/net/callback/IHttpRespCallback;", "Lcom/ss/android/lark/mm/module/highlight/timeline/HightlightTimeLine$MmHightlightTimeLineResp;", "onError", "", "errorResult", "Lcom/ss/android/lark/mm/net/callback/HttpErrorResult;", "onSuccess", "resp", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.mm.module.player.videotoolbar.f$b */
    public static final class C46734b extends AbstractC47071d<HightlightTimeLine.MmHightlightTimeLineResp> {

        /* renamed from: a */
        final /* synthetic */ AbstractC47070c f117593a;

        C46734b(AbstractC47070c cVar) {
            this.f117593a = cVar;
        }

        @Override // com.ss.android.lark.mm.net.p2333b.AbstractC47069b
        /* renamed from: a */
        public void mo161288a(C47068a aVar) {
            this.f117593a.mo161288a(aVar);
        }

        /* renamed from: a */
        public void mo161289a(HightlightTimeLine.MmHightlightTimeLineResp mmHightlightTimeLineResp) {
            Intrinsics.checkParameterIsNotNull(mmHightlightTimeLineResp, "resp");
            this.f117593a.mo161289a(mmHightlightTimeLineResp.data);
        }
    }

    /* renamed from: a */
    public final void mo164226a(IMmDetailToolBarControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f117591d.add(aVar);
    }

    /* renamed from: b */
    public final void mo164232b(IMmDetailToolBarControlListener aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "listener");
        this.f117591d.remove(aVar);
    }

    /* renamed from: a */
    public final void mo164227a(AbstractC47070c<HightlightTimeLine> cVar) {
        Intrinsics.checkParameterIsNotNull(cVar, "callback");
        C47057a.m186237a(this.f117588a, this.f117589b, 0).mo165337a(new C46734b(cVar));
    }

    /* renamed from: a */
    public final void mo164228a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "value");
        this.f117590c = str;
        this.f117588a = UrlUtil.f118671a.mo165518b(this.f117590c);
        this.f117589b = UrlUtil.f118671a.mo165517a(this.f117590c);
    }

    /* renamed from: a */
    public final void mo164230a(List<? extends HighlightTimeLineItem> list) {
        Iterator<T> it = this.f117591d.iterator();
        while (it.hasNext()) {
            it.next().mo161638a(list);
        }
    }

    public MmVideoToolbarControl(String str, List<MmPodcastLinkInfo> list) {
        Intrinsics.checkParameterIsNotNull(str, "url");
        this.f117592e = list;
        this.f117588a = UrlUtil.f118671a.mo165518b(str);
        this.f117589b = UrlUtil.f118671a.mo165517a(str);
        this.f117590c = str;
    }

    /* renamed from: a */
    public final void mo164229a(String str, String str2) {
        T t;
        Intrinsics.checkParameterIsNotNull(str, "token");
        Intrinsics.checkParameterIsNotNull(str2, "newTopic");
        List<MmPodcastLinkInfo> list = this.f117592e;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (Intrinsics.areEqual(UrlUtil.f118671a.mo165517a(t.getUrl()), str)) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                t2.setTitle(str2);
            }
        }
    }
}
