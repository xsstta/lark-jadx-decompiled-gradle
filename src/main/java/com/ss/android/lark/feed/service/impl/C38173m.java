package com.ss.android.lark.feed.service.impl;

import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.feed.v1.CreateShortcutsRequest;
import com.bytedance.lark.pb.feed.v1.CreateShortcutsResponse;
import com.bytedance.lark.pb.feed.v1.DeleteShortcutsRequest;
import com.bytedance.lark.pb.feed.v1.DeleteShortcutsResponse;
import com.bytedance.lark.pb.feed.v1.GetShortcutsByIdsRequest;
import com.bytedance.lark.pb.feed.v1.GetShortcutsByIdsResponse;
import com.bytedance.lark.pb.feed.v1.GetShortcutsRequest;
import com.bytedance.lark.pb.feed.v1.GetShortcutsResponse;
import com.bytedance.lark.pb.feed.v1.Shortcut;
import com.bytedance.lark.pb.feed.v1.UpdateShortcutsRequest;
import com.bytedance.lark.pb.feed.v1.UpdateShortcutsResponse;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.biz.im.api.Shortcut;
import com.ss.android.lark.biz.im.api.ShortcutInfoLoadResult;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.feed.app.hitpoint.FeedShortcutHitPoint;
import com.ss.android.lark.feed.app.model.C37731d;
import com.ss.android.lark.feed.p1847a.C37268c;
import com.ss.android.lark.feed.p1872c.C38073d;
import com.ss.android.lark.feed.service.p1884a.AbstractC38121c;
import com.ss.android.lark.feed.statistics.shortcut.ShortcutHitPoint;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53234a;
import com.ss.android.lark.sdk.SdkSender;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.feed.service.impl.m */
public class C38173m implements AbstractC38121c {

    /* renamed from: a */
    AbstractC32808a f97864a;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.feed.service.impl.m$a */
    public static class C38180a {

        /* renamed from: a */
        static C38173m f97875a = new C38173m();
    }

    /* renamed from: b */
    public static C38173m m150043b() {
        return C38180a.f97875a;
    }

    private C38173m() {
        this.f97864a = C37268c.m146766b().mo139154A().mo139234a();
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: a */
    public ShortcutInfoLoadResult mo139424a() {
        SdkSender.C53233d<ShortcutInfoLoadResult> c = m150044c(null);
        if (c.f131573b == null) {
            return c.f131572a;
        }
        Log.m165383e("FeedModule_ShortcutService", "getLocalShortcutsA:" + c.f131573b);
        return new ShortcutInfoLoadResult(new ArrayList(), new ArrayList());
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: b */
    public boolean mo139431b(String str) {
        return !CollectionUtils.isEmpty(mo139426a(Collections.singletonList(str)));
    }

    /* renamed from: c */
    private SdkSender.C53233d<ShortcutInfoLoadResult> m150044c(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C53234a.m205877a();
        }
        return SdkSender.syncSendMayError(Command.GET_SHORTCUTS, new GetShortcutsRequest.C17188a(), str, new SdkSender.IParser<ShortcutInfoLoadResult>() {
            /* class com.ss.android.lark.feed.service.impl.C38173m.C381796 */

            /* renamed from: a */
            public ShortcutInfoLoadResult parse(byte[] bArr) throws IOException {
                GetShortcutsResponse decode = GetShortcutsResponse.ADAPTER.decode(bArr);
                return new ShortcutInfoLoadResult(C38165j.m150038a(decode.shortcuts), C38159h.m150025a(decode.entity_preview));
            }
        });
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: a */
    public ShortcutInfoLoadResult mo139425a(String str) {
        SdkSender.C53233d<ShortcutInfoLoadResult> c = m150044c(str);
        if (c.f131573b == null) {
            return c.f131572a;
        }
        Log.m165383e("FeedModule_ShortcutService", "getLocalShortcutsB:" + c.f131573b);
        return new ShortcutInfoLoadResult(new ArrayList(), new ArrayList());
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: a */
    public List<Shortcut> mo139426a(List<String> list) {
        String a = C53234a.m205877a();
        GetShortcutsByIdsRequest.C17184a aVar = new GetShortcutsByIdsRequest.C17184a();
        aVar.mo60496a(list);
        SdkSender.C53233d syncSendMayError = SdkSender.syncSendMayError(Command.GET_SHORTCUTS_BY_IDS, aVar, a, new SdkSender.IParser<ShortcutInfoLoadResult>() {
            /* class com.ss.android.lark.feed.service.impl.C38173m.C381785 */

            /* renamed from: a */
            public ShortcutInfoLoadResult parse(byte[] bArr) throws IOException {
                return new ShortcutInfoLoadResult(C38165j.m150038a(GetShortcutsByIdsResponse.ADAPTER.decode(bArr).shortcuts), null);
            }
        });
        if (syncSendMayError.f131573b == null) {
            return syncSendMayError.f131572a.shortcuts;
        }
        Log.m165383e("FeedModule_ShortcutService", "getLocalShortcutByIds:" + syncSendMayError.f131573b);
        return new ArrayList();
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: b */
    public void mo139429b(final Shortcut shortcut, IGetDataCallback<Shortcut> iGetDataCallback) {
        FeedShortcutHitPoint.f95785a.mo137124a("sdk_cost");
        SdkSender.asynSendRequestNonWrap(Command.DELETE_SHORTCUTS, new DeleteShortcutsRequest.C17112a().mo60325a(Collections.singletonList(new Shortcut.C17228a().mo60591a(this.f97864a.mo120943a(shortcut.getChannel())).build())), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.biz.im.api.Shortcut>() {
            /* class com.ss.android.lark.feed.service.impl.C38173m.C381752 */

            /* renamed from: a */
            public com.ss.android.lark.biz.im.api.Shortcut parse(byte[] bArr) throws IOException {
                DeleteShortcutsResponse.ADAPTER.decode(bArr);
                FeedShortcutHitPoint.f95785a.mo137126b("sdk_cost");
                return shortcut;
            }
        });
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38121c
    /* renamed from: c */
    public void mo139449c(final com.ss.android.lark.biz.im.api.Shortcut shortcut, IGetDataCallback<com.ss.android.lark.biz.im.api.Shortcut> iGetDataCallback) {
        Shortcut.C17228a a = new Shortcut.C17228a().mo60591a(this.f97864a.mo120943a(shortcut.getChannel()));
        HashMap hashMap = new HashMap();
        hashMap.put(shortcut.getChannel().getId(), Integer.valueOf(shortcut.getPosition()));
        SdkSender.asynSendRequestNonWrap(Command.UPDATE_SHORTCUTS, new UpdateShortcutsRequest.C17246a().mo60638a(Collections.singletonList(a.build())).mo60639a(hashMap), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.biz.im.api.Shortcut>() {
            /* class com.ss.android.lark.feed.service.impl.C38173m.C381763 */

            /* renamed from: a */
            public com.ss.android.lark.biz.im.api.Shortcut parse(byte[] bArr) throws IOException {
                UpdateShortcutsResponse.ADAPTER.decode(bArr);
                return shortcut;
            }
        });
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: a */
    public void mo139427a(final com.ss.android.lark.biz.im.api.Shortcut shortcut, IGetDataCallback<com.ss.android.lark.biz.im.api.Shortcut> iGetDataCallback) {
        FeedShortcutHitPoint.f95785a.mo137124a("sdk_cost");
        SdkSender.asynSendRequestNonWrap(Command.CREATE_SHORTCUTS, new CreateShortcutsRequest.C17104a().mo60306a(Collections.singletonList(new Shortcut.C17228a().mo60591a(this.f97864a.mo120943a(shortcut.getChannel())).build())), iGetDataCallback, new SdkSender.IParser<com.ss.android.lark.biz.im.api.Shortcut>() {
            /* class com.ss.android.lark.feed.service.impl.C38173m.C381741 */

            /* renamed from: a */
            public com.ss.android.lark.biz.im.api.Shortcut parse(byte[] bArr) throws IOException {
                CreateShortcutsResponse.ADAPTER.decode(bArr);
                FeedShortcutHitPoint.f95785a.mo137126b("sdk_cost");
                return shortcut;
            }
        });
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: b */
    public void mo139430b(com.ss.android.lark.biz.im.api.Shortcut shortcut, IGetDataCallback<com.ss.android.lark.biz.im.api.Shortcut> iGetDataCallback, int i) {
        ShortcutHitPoint.m149840b(i, C37731d.m148488a().mo138393a(shortcut.getChannel().getId()));
        mo139429b(shortcut, iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38114x
    /* renamed from: a */
    public void mo139428a(com.ss.android.lark.biz.im.api.Shortcut shortcut, IGetDataCallback<com.ss.android.lark.biz.im.api.Shortcut> iGetDataCallback, int i) {
        ShortcutHitPoint.m149835a(i, C37731d.m148488a().mo138393a(shortcut.getChannel().getId()));
        mo139427a(shortcut, iGetDataCallback);
    }

    @Override // com.ss.android.lark.feed.service.p1884a.AbstractC38121c
    /* renamed from: a */
    public void mo139448a(int i, int i2, IGetDataCallback<ShortcutInfoLoadResult> iGetDataCallback, final C38073d dVar) {
        dVar.mo139371g();
        SdkSender.asynSendRequestNonWrap(Command.GET_SHORTCUTS, new GetShortcutsRequest.C17188a(), iGetDataCallback, new SdkSender.IParser<ShortcutInfoLoadResult>() {
            /* class com.ss.android.lark.feed.service.impl.C38173m.C381774 */

            /* renamed from: a */
            public ShortcutInfoLoadResult parse(byte[] bArr) throws IOException {
                dVar.mo139372h();
                dVar.mo139369e();
                GetShortcutsResponse decode = GetShortcutsResponse.ADAPTER.decode(bArr);
                ShortcutInfoLoadResult shortcutInfoLoadResult = new ShortcutInfoLoadResult(C38165j.m150038a(decode.shortcuts), C38159h.m150025a(decode.entity_preview));
                dVar.mo139370f();
                return shortcutInfoLoadResult;
            }
        });
    }
}
