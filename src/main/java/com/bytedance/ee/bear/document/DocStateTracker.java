package com.bytedance.ee.bear.document;

import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0006\u0010\u0014\u001a\u00020\fJ\u0006\u0010\u0015\u001a\u00020\fJ\u0006\u0010\u0016\u001a\u00020\fJ\u0006\u0010\u0017\u001a\u00020\fJ\u0006\u0010\u0018\u001a\u00020\fJ\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u001a\u001a\u00020\fJ\u0006\u0010\u001b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/bytedance/ee/bear/document/DocStateTracker;", "", "()V", "TAG", "", "hasWaitPreload", "", "renderStage", "Lcom/bytedance/ee/bear/document/RenderStage;", "state", "Lcom/bytedance/ee/bear/document/DocLoadingState;", "back", "", "cancel", "finish", "success", "getHasWaitPreload", "overtime", "pullDataEnd", "pullDataStart", "render", "renderCacheEnd", "renderCacheStart", "renderDocEnd", "renderDocStart", "reset", "waitDownload", "waitPreload", "document-impl_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.f */
public final class DocStateTracker {

    /* renamed from: a */
    public static final DocStateTracker f16283a = new DocStateTracker();

    /* renamed from: b */
    private static final String f16284b = f16284b;

    /* renamed from: c */
    private static DocLoadingState f16285c = DocLoadingState.INIT;

    /* renamed from: d */
    private static RenderStage f16286d = RenderStage.RENDERING;

    /* renamed from: e */
    private static boolean f16287e;

    private DocStateTracker() {
    }

    /* renamed from: n */
    public final DocLoadingState mo23279n() {
        return f16285c;
    }

    /* renamed from: o */
    public final RenderStage mo23280o() {
        return f16286d;
    }

    /* renamed from: p */
    public final boolean mo23281p() {
        return f16287e;
    }

    /* renamed from: m */
    public final void mo23278m() {
        f16285c = DocLoadingState.SUCCESS;
    }

    /* renamed from: a */
    public final void mo23265a() {
        f16285c = DocLoadingState.INIT;
        f16286d = RenderStage.RENDERING;
        f16287e = false;
    }

    /* renamed from: d */
    public final void mo23269d() {
        f16285c = DocLoadingState.RENDERING;
        f16286d = RenderStage.RENDERING;
    }

    /* renamed from: b */
    public final void mo23267b() {
        f16287e = true;
        if (f16285c == DocLoadingState.INIT) {
            f16285c = DocLoadingState.WAITING_DOWNLOAD;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16285c + " for waitDownload");
    }

    /* renamed from: c */
    public final void mo23268c() {
        f16287e = true;
        if (f16285c == DocLoadingState.INIT || f16285c == DocLoadingState.WAITING_DOWNLOAD) {
            f16285c = DocLoadingState.WAITING_PRELOAD;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16285c + " for waiting preload");
    }

    /* renamed from: e */
    public final void mo23270e() {
        if (f16285c == DocLoadingState.RENDERING) {
            f16286d = RenderStage.RENDER_CACHE_START;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16286d + " for renderCacheStart");
    }

    /* renamed from: f */
    public final void mo23271f() {
        if (f16285c == DocLoadingState.RENDERING) {
            f16286d = RenderStage.RENDER_CACHE_END;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16286d + " for renderCacheEnd");
    }

    /* renamed from: g */
    public final void mo23272g() {
        if (f16285c == DocLoadingState.RENDERING) {
            f16286d = RenderStage.PULL_DATA_START;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16286d + " for pullDataStart");
    }

    /* renamed from: h */
    public final void mo23273h() {
        if (f16285c == DocLoadingState.RENDERING) {
            f16286d = RenderStage.PULL_DATA_END;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16286d + " for pullDataEnd");
    }

    /* renamed from: i */
    public final void mo23274i() {
        if (f16285c == DocLoadingState.RENDERING) {
            f16286d = RenderStage.RENDER_DOC_START;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16286d + " for renderDocStart");
    }

    /* renamed from: j */
    public final void mo23275j() {
        if (f16285c == DocLoadingState.RENDERING) {
            f16286d = RenderStage.RENDER_DOC_END;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16286d + " for renderDocEnd");
    }

    /* renamed from: k */
    public final void mo23276k() {
        if (f16285c == DocLoadingState.INIT || f16285c == DocLoadingState.WAITING_DOWNLOAD || f16285c == DocLoadingState.WAITING_PRELOAD || f16285c == DocLoadingState.RENDERING) {
            f16285c = DocLoadingState.CANCELED;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16285c + " for cancel");
    }

    /* renamed from: l */
    public final void mo23277l() {
        if (f16285c == DocLoadingState.INIT || f16285c == DocLoadingState.WAITING_DOWNLOAD || f16285c == DocLoadingState.WAITING_PRELOAD || f16285c == DocLoadingState.RENDERING) {
            f16285c = DocLoadingState.OVERTIME;
            return;
        }
        String str = f16284b;
        C13479a.m54775e(str, "wrong state " + f16285c + " for overtime");
    }

    /* renamed from: a */
    public final void mo23266a(boolean z) {
        if (f16285c != DocLoadingState.WAITING_PRELOAD && f16285c != DocLoadingState.WAITING_DOWNLOAD && f16285c != DocLoadingState.RENDERING) {
            String str = f16284b;
            C13479a.m54775e(str, "wrong state " + f16285c + " for finish");
        } else if (z) {
            f16285c = DocLoadingState.SUCCESS;
        } else {
            f16285c = DocLoadingState.FAIL;
        }
    }
}
