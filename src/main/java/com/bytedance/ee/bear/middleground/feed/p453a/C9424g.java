package com.bytedance.ee.bear.middleground.feed.p453a;

import com.bytedance.ee.bear.list.dto.C8275a;
import com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e;
import com.bytedance.ee.bear.rn.RnCommentProtocol;
import com.bytedance.ee.log.C13479a;
import io.reactivex.AbstractC68307f;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.java.KoinJavaComponent;

/* renamed from: com.bytedance.ee.bear.middleground.feed.a.g */
public class C9424g implements AbstractC9492e {

    /* renamed from: a */
    private RnCommentProtocol f25342a;

    /* renamed from: b */
    private RnCommentProtocol.CommentDataObserver f25343b;

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e
    /* renamed from: a */
    public void mo35924a() {
        this.f25343b = null;
        this.f25342a.mo40317a();
    }

    /* renamed from: a */
    public void mo35925a(String str) {
        this.f25342a.mo40327c(str);
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e
    /* renamed from: a */
    public void mo35927a(final Function1<String, Unit> function1) {
        C94262 r0 = new RnCommentProtocol.CommentDataObserver() {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.C9424g.C94262 */

            @Override // com.bytedance.ee.bear.rn.RnCommentProtocol.CommentDataObserver
            /* renamed from: a */
            public void mo34720a(String str) {
                function1.invoke(str);
            }
        };
        this.f25343b = r0;
        this.f25342a.mo40319a(r0);
    }

    public C9424g(final String str, final C8275a aVar) {
        this.f25342a = (RnCommentProtocol) KoinJavaComponent.m268612a(RnCommentProtocol.class, null, new Function0<DefinitionParameters>() {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.C9424g.C94251 */

            /* renamed from: a */
            public DefinitionParameters invoke() {
                return new DefinitionParameters(str, aVar, 0);
            }
        });
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e
    /* renamed from: a */
    public AbstractC68307f<String> mo35923a(boolean z, String str) {
        AbstractC68307f<String> a = this.f25342a.mo40316a(z, str);
        if (a == null) {
            return AbstractC68307f.m265084a(new Throwable("comment sdk error, please check it"));
        }
        return a;
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e
    /* renamed from: a */
    public void mo35926a(String str, String str2) {
        AbstractC68307f<String> a = this.f25342a.mo40312a(str, str2);
        if (a == null) {
            a = AbstractC68307f.m265084a(new Throwable("comment sdk error, please check it"));
        }
        a.mo238001b(new Consumer<String>() {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.C9424g.C94273 */

            /* renamed from: a */
            public void accept(String str) throws Exception {
                C13479a.m54764b("RnFeedData", "translate success");
            }
        }, new Consumer<Throwable>() {
            /* class com.bytedance.ee.bear.middleground.feed.p453a.C9424g.C94284 */

            /* renamed from: a */
            public void accept(Throwable th) throws Exception {
                C13479a.m54766b("RnFeedData", th);
            }
        });
    }

    @Override // com.bytedance.ee.bear.middleground.feed.export.bean.AbstractC9492e
    /* renamed from: a */
    public void mo35928a(String[] strArr, boolean z) {
        this.f25342a.mo40321a(strArr, z, "x");
    }
}
