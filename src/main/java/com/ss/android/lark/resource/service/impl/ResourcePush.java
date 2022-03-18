package com.ss.android.lark.resource.service.impl;

import com.bytedance.lark.pb.basic.v1.Command;
import com.bytedance.lark.pb.media.v1.PushResourceProgressResponse;
import com.bytedance.lark.pb.media.v1.PushResourceResponse;
import com.larksuite.framework.thread.CoreThreadPool;
import com.ss.android.lark.biz.core.api.resource.AbstractC29579a;
import com.ss.android.lark.biz.core.api.resource.AbstractC29580b;
import com.ss.android.lark.biz.core.api.resource.AbstractC29581c;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.sdk.C53246j;
import com.ss.android.lark.sdk.C53248k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ResourcePush {

    /* renamed from: a */
    public List<AbstractC29580b> f131415a;

    /* renamed from: b */
    public List<AbstractC29581c> f131416b;

    /* renamed from: c */
    public List<AbstractC29579a> f131417c;

    /* renamed from: d */
    private List<Object> f131418d;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.resource.service.impl.ResourcePush$a */
    public static class C53150a {

        /* renamed from: a */
        public static final ResourcePush f131438a = new ResourcePush();
    }

    public enum Link {
        UNKNOWN(-1),
        UPLOAD(1),
        DOWNLOAD(2);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Link valueOf(int i) {
            return forNumber(i);
        }

        public static Link forNumber(int i) {
            if (i == 1) {
                return UPLOAD;
            }
            if (i != 2) {
                return UNKNOWN;
            }
            return DOWNLOAD;
        }

        private Link(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static final ResourcePush m205695a() {
        return C53150a.f131438a;
    }

    private ResourcePush() {
        this.f131415a = new CopyOnWriteArrayList();
        this.f131416b = new CopyOnWriteArrayList();
        this.f131417c = new CopyOnWriteArrayList();
        this.f131418d = new CopyOnWriteArrayList();
    }

    /* renamed from: a */
    private void m205696a(Object obj) {
        C53246j.m205910a(this.f131418d, obj, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.resource.service.impl.ResourcePush.C531454 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_RESOURCE_PROGRESS, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.resource.service.impl.ResourcePush.C531454.C531461 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        ResourcePush.this.mo181534b(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    private void m205697b(Object obj) {
        C53246j.m205911b(this.f131418d, obj, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.resource.service.impl.ResourcePush.C531475 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_RESOURCE_PROGRESS);
            }
        });
    }

    /* renamed from: a */
    public void mo181527a(AbstractC29579a aVar) {
        if (aVar != null) {
            this.f131417c.add(aVar);
            m205696a((Object) aVar);
        }
    }

    /* renamed from: b */
    public void mo181531b(AbstractC29579a aVar) {
        if (aVar != null) {
            this.f131417c.remove(aVar);
            m205697b((Object) aVar);
        }
    }

    /* renamed from: a */
    public void mo181528a(AbstractC29580b bVar) {
        C53246j.m205910a(this.f131415a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.resource.service.impl.ResourcePush.C531411 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181697a(Command.PUSH_RESOURCE, new C53248k.AbstractC53250a() {
                    /* class com.ss.android.lark.resource.service.impl.ResourcePush.C531411.C531421 */

                    @Override // com.ss.android.lark.sdk.C53248k.AbstractC53250a
                    public void onPush(byte[] bArr, String str, boolean z, boolean z2) {
                        ResourcePush.this.mo181530a(bArr, str, z, z2);
                    }
                });
            }
        });
    }

    /* renamed from: b */
    public void mo181532b(AbstractC29580b bVar) {
        C53246j.m205911b(this.f131415a, bVar, new C53246j.AbstractC53247a() {
            /* class com.ss.android.lark.resource.service.impl.ResourcePush.C531432 */

            @Override // com.ss.android.lark.sdk.C53246j.AbstractC53247a
            public void handle() {
                C53248k.m205912a().mo181696a(Command.PUSH_RESOURCE);
            }
        });
    }

    /* renamed from: a */
    public void mo181529a(AbstractC29581c cVar) {
        if (cVar != null) {
            this.f131416b.add(cVar);
            m205696a((Object) cVar);
        }
    }

    /* renamed from: b */
    public void mo181533b(AbstractC29581c cVar) {
        if (cVar != null) {
            this.f131416b.remove(cVar);
            m205697b((Object) cVar);
        }
    }

    /* renamed from: a */
    public void mo181530a(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushResourceResponse decode = PushResourceResponse.ADAPTER.decode(bArr);
            final String str2 = decode.key;
            final PushResourceResponse.Status status = decode.status;
            CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                /* class com.ss.android.lark.resource.service.impl.ResourcePush.RunnableC531443 */

                public void run() {
                    boolean z;
                    for (AbstractC29580b bVar : ResourcePush.this.f131415a) {
                        String str = str2;
                        if (status == PushResourceResponse.Status.SUCCESS) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bVar.onPushDownloadStatus(str, z);
                    }
                }
            });
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public void mo181534b(byte[] bArr, String str, boolean z, boolean z2) {
        try {
            PushResourceProgressResponse decode = PushResourceProgressResponse.ADAPTER.decode(bArr);
            final String str2 = decode.key;
            final int intValue = decode.progress.intValue();
            final long longValue = decode.total_size.longValue();
            final long longValue2 = decode.transferred_size.longValue();
            Link valueOf = Link.valueOf(decode.link.getValue());
            if (valueOf == Link.UPLOAD) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.resource.service.impl.ResourcePush.RunnableC531486 */

                    public void run() {
                        for (AbstractC29581c cVar : ResourcePush.this.f131416b) {
                            cVar.mo105862a(str2, intValue, longValue, longValue2);
                        }
                    }
                });
            } else if (valueOf == Link.DOWNLOAD) {
                CoreThreadPool.getDefault().getUIExecutor().execute(new Runnable() {
                    /* class com.ss.android.lark.resource.service.impl.ResourcePush.RunnableC531497 */

                    public void run() {
                        for (AbstractC29579a aVar : ResourcePush.this.f131417c) {
                            aVar.onPushDownloadProgress(str2, intValue, longValue, longValue2);
                        }
                    }
                });
            }
        } catch (Exception e) {
            Log.m165386e(e.getMessage(), e);
        }
    }
}
