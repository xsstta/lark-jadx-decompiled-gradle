package com.bytedance.ee.bear.integrator.p400b;

import com.bytedance.ee.bear.account.C4184e;
import com.bytedance.ee.bear.attachment.filereader.C4285c;
import com.bytedance.ee.bear.banner.C4308a;
import com.bytedance.ee.bear.bitable.C4521b;
import com.bytedance.ee.bear.block.C4893b;
import com.bytedance.ee.bear.doc.C5314a;
import com.bytedance.ee.bear.docshost.C5583c;
import com.bytedance.ee.bear.document.C6072r;
import com.bytedance.ee.bear.drive.config.p345a.C6911a;
import com.bytedance.ee.bear.drive.config.p345a.C6917b;
import com.bytedance.ee.bear.imageviewer.C7861i;
import com.bytedance.ee.bear.integrator.p400b.p401a.p405d.C7888a;
import com.bytedance.ee.bear.leanmode.C8134c;
import com.bytedance.ee.bear.list.C8518j;
import com.bytedance.ee.bear.lynx.impl.C8825c;
import com.bytedance.ee.bear.middleground.comment.C9100c;
import com.bytedance.ee.bear.middleground.drive.C9351c;
import com.bytedance.ee.bear.middleground.feed.C9433c;
import com.bytedance.ee.bear.middleground.like.C9538h;
import com.bytedance.ee.bear.middleground.p438a.C8869d;
import com.bytedance.ee.bear.middleground.permission.C9902e;
import com.bytedance.ee.bear.middleground.record.C10132c;
import com.bytedance.ee.bear.mindnote.C10173a;
import com.bytedance.ee.bear.more.C10205d;
import com.bytedance.ee.bear.notification.C10341f;
import com.bytedance.ee.bear.onboarding.C10382c;
import com.bytedance.ee.bear.p376e.C7589b;
import com.bytedance.ee.bear.p397h.C7822b;
import com.bytedance.ee.bear.p511n.C10265c;
import com.bytedance.ee.bear.p513o.C10367c;
import com.bytedance.ee.bear.p534s.C10763d;
import com.bytedance.ee.bear.quoto.C10579n;
import com.bytedance.ee.bear.rn.C10640g;
import com.bytedance.ee.bear.search.C10836i;
import com.bytedance.ee.bear.share.C11011f;
import com.bytedance.ee.bear.templates.C11539l;
import com.bytedance.ee.bear.todocenter.C11682a;
import com.bytedance.ee.bear.wiki.C11942f;
import com.bytedance.ee.bear.wikiv2.C12234c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.koin.core.module.Module;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0004¨\u0006\t"}, d2 = {"koinBusinessModules", "", "Lorg/koin/core/module/Module;", "getKoinBusinessModules", "()Ljava/util/List;", "koinFeaturesModules", "getKoinFeaturesModules", "koinMiddlegroundModules", "getKoinMiddlegroundModules", "basesdk_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.integrator.b.b */
public final class C7896b {

    /* renamed from: a */
    private static final List<Module> f21293a;

    /* renamed from: b */
    private static final List<Module> f21294b;

    /* renamed from: c */
    private static final List<Module> f21295c;

    /* renamed from: a */
    public static final List<Module> m31639a() {
        return f21293a;
    }

    /* renamed from: b */
    public static final List<Module> m31640b() {
        return f21294b;
    }

    static {
        List<Module> listOf = CollectionsKt.listOf((Object[]) new Module[]{C7888a.m31628a(), C6911a.m27340a(), C6917b.m27341a(), C5583c.m22610a(), C8134c.m32471a(), C8518j.m35386a(), C10132c.m42161a(), C6072r.m24583a(), C5314a.m21725a(), C10367c.m43101a(), C7589b.m30455a(), C10763d.m44575a(), C4285c.m17790a(), C4184e.m17365a(), C7822b.m31350a(), C7861i.m31549a(), C10205d.m42525a(), C9902e.m41218a(), C11682a.m48488a(), C4308a.m17825a(), C11011f.m45873a(), C12234c.m50893a(), C11942f.m49500a(), C10173a.m42404a(), C4893b.m20178a(), C10836i.m44942a(), C4521b.m18681a(), C10265c.m42841a(), C9433c.m39033a(), C9100c.m37808a(), C10579n.m43817a(), C10382c.m43179a(), C10341f.m43045a(), C8825c.m37015a(), C11539l.m48056a()});
        f21293a = listOf;
        List<Module> listOf2 = CollectionsKt.listOf((Object[]) new Module[]{C8869d.m37213a(), C9351c.m38655a(), C9538h.m39385a(), C10640g.m44230a()});
        f21294b = listOf2;
        f21295c = CollectionsKt.plus((Collection) listOf, (Iterable) listOf2);
    }
}
