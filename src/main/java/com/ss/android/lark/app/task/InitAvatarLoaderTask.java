package com.ss.android.lark.app.task;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.ImageView;
import com.bytedance.ee.larkwebview.p677e.C13439c;
import com.bytedance.lynx.webview.util.C20051j;
import com.larksuite.component.ui.C25622a;
import com.larksuite.component.ui.avatar.AvatarIconViewData;
import com.larksuite.component.ui.avatar.AvatarModel;
import com.larksuite.component.ui.avatar.BadgeViewData;
import com.larksuite.component.ui.avatar.DocAvatarModel;
import com.larksuite.component.ui.avatar.DocAvatarModelHandler;
import com.larksuite.component.ui.avatar.IAvatarDependence;
import com.larksuite.component.ui.avatar.IIconLoader;
import com.larksuite.component.ui.avatar.ILoadCallback;
import com.larksuite.component.ui.avatar.LarkAvatar;
import com.larksuite.component.ui.avatar.MiniIconViewData;
import com.larksuite.component.ui.dependence.IAvatarLoader;
import com.larksuite.component.ui.dependence.IChatterAvatarService;
import com.larksuite.component.ui.dependence.IDependence;
import com.larksuite.component.ui.dependence.IDocIconProvider;
import com.larksuite.framework.launch.task.AbstractLaunchTask;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.suite.R;
import com.ss.android.lark.app.task.InitAvatarLoaderTask;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.biz.core.api.ICoreApi;
import com.ss.android.lark.biz.core.api.ListenerParams;
import com.ss.android.lark.biz.im.api.IIMApi;
import com.ss.android.lark.ccm_api.ICCMApi;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.featuregating.C37239a;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.C38818i;
import com.ss.android.lark.image.entity.AvatarImage;
import com.ss.android.lark.image.entity.C38824b;
import com.ss.android.lark.image.impl.PerfLoadPicMonitor;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.ApiUtils;
import com.ss.android.lark.utils.UIHelper;

public class InitAvatarLoaderTask extends AbstractLaunchTask {
    /* renamed from: a */
    public static int m106081a(int i) {
        if (i > 0) {
            return i;
        }
        return 180;
    }

    /* access modifiers changed from: private */
    public static class AvatarLoader implements IAvatarLoader {
        private AvatarLoader() {
        }

        @Override // com.larksuite.component.ui.dependence.IAvatarLoader
        /* renamed from: b */
        public void mo89175b(Context context, ImageView imageView, AvatarModel avatarModel) {
            imageView.setTag(R.id.avatar_tag, avatarModel.mo88945a());
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(avatarModel, context, imageView) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitAvatarLoaderTask$AvatarLoader$LKwHBg77odZisyuVeWtm597DfKI */
                public final /* synthetic */ AvatarModel f$1;
                public final /* synthetic */ Context f$2;
                public final /* synthetic */ ImageView f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final void run() {
                    InitAvatarLoaderTask.AvatarLoader.this.m106092a((InitAvatarLoaderTask.AvatarLoader) this.f$1, (AvatarModel) this.f$2, (Context) this.f$3);
                }
            });
        }

        @Override // com.larksuite.component.ui.dependence.IAvatarLoader
        /* renamed from: a */
        public void mo89174a(Context context, ImageView imageView, AvatarModel avatarModel) {
            int dp2px = UIHelper.dp2px((float) avatarModel.mo88950e().getDpValue());
            AvatarImage build = AvatarImage.Builder.obtain(avatarModel.mo88945a(), avatarModel.mo88947b(), dp2px, dp2px).build();
            if (DesktopUtil.m144301a(context)) {
                dp2px = Integer.MIN_VALUE;
            }
            ImageLoader.with(context).load(build).placeholder(avatarModel.mo88946b(context)).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(avatarModel.mo88952g()).mo105397a(avatarModel.mo88953h()).mo105398a(ListenerParams.FromType.AVATAR).mo105401a(false).mo105405b(false).mo105395a(dp2px).mo105403b(dp2px).mo105402a())).override(dp2px, dp2px).into(imageView);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m106092a(final AvatarModel avatarModel, Context context, final ImageView imageView) {
            int dp2px = UIHelper.dp2px((float) avatarModel.mo88950e().getDpValue());
            AvatarImage build = AvatarImage.Builder.obtain(avatarModel.mo88945a(), avatarModel.mo88947b(), dp2px, dp2px).build();
            if (DesktopUtil.m144301a(context)) {
                dp2px = Integer.MIN_VALUE;
            }
            ImageLoader.with(context).load(build).placeholder(avatarModel.mo88946b(context)).override(dp2px, dp2px).asDrawable().listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(avatarModel.mo88952g()).mo105397a(avatarModel.mo88953h()).mo105398a(ListenerParams.FromType.AVATAR).mo105401a(false).mo105405b(false).mo105395a(dp2px).mo105403b(dp2px).mo105402a())).into(new CallbackTarget(avatarModel.mo88945a(), new ILoadCallback() {
                /* class com.ss.android.lark.app.task.InitAvatarLoaderTask.AvatarLoader.C289391 */

                @Override // com.larksuite.component.ui.avatar.ILoadCallback
                /* renamed from: a */
                public void mo89030a(Drawable drawable) {
                    if (avatarModel.mo88945a() != imageView.getTag(R.id.avatar_tag)) {
                        Log.m165397w("LarkAvatar", "asyncLoad image tag not match");
                    } else {
                        imageView.setImageDrawable(drawable);
                    }
                }

                @Override // com.larksuite.component.ui.avatar.ILoadCallback
                /* renamed from: a */
                public void mo89031a(Throwable th) {
                    if (avatarModel.mo88945a() != imageView.getTag(R.id.avatar_tag) || avatarModel.mo88948c() == null) {
                        Log.m165397w("LarkAvatar", "asyncLoad image tag not match or placeHolder is null");
                    } else {
                        imageView.setImageDrawable(avatarModel.mo88948c());
                    }
                }
            }));
        }
    }

    /* access modifiers changed from: private */
    public static class DocIconProvider implements IDocIconProvider {
        private DocIconProvider() {
        }

        @Override // com.larksuite.component.ui.dependence.IDocIconProvider
        /* renamed from: a */
        public int mo89182a(int i) {
            return ((ICCMApi) ApiUtils.getApi(ICCMApi.class)).getDocMiniIcon(DocType.forNumber(i));
        }

        @Override // com.larksuite.component.ui.dependence.IDocIconProvider
        /* renamed from: a */
        public int mo89183a(int i, String str) {
            ICCMApi iCCMApi = (ICCMApi) ApiUtils.getApi(ICCMApi.class);
            DocType forNumber = DocType.forNumber(i);
            if (str == null) {
                str = "";
            }
            return iCCMApi.getDocIcon(forNumber, str);
        }
    }

    private static class GetResourceIconLoader implements IIconLoader {
        private GetResourceIconLoader() {
        }

        @Override // com.larksuite.component.ui.avatar.IIconLoader
        /* renamed from: a */
        public void mo89027a(Context context, String str, String str2, String str3, int i, int i2, ImageView imageView) {
            ImageLoader.with(context).load(new C38824b(str)).asDrawable().override(i, i2).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(Scene.Chat).mo105398a(ListenerParams.FromType.ICON).mo105401a(false).mo105405b(false).mo105395a(i).mo105403b(i2).mo105402a())).into(imageView);
        }

        @Override // com.larksuite.component.ui.avatar.IIconLoader
        /* renamed from: a */
        public void mo89028a(Context context, String str, String str2, String str3, int i, int i2, ILoadCallback nVar) {
            ImageLoader.with(context).load(AvatarImage.Builder.obtain(str, str2, InitAvatarLoaderTask.m106081a(i), InitAvatarLoaderTask.m106081a(i2)).fsUnit(str3).build()).asDrawable().override(i, i2).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(Scene.Chat).mo105398a(ListenerParams.FromType.ICON).mo105401a(false).mo105405b(false).mo105395a(i).mo105403b(i2).mo105402a())).into(new CallbackTarget(str, nVar));
        }
    }

    /* access modifiers changed from: private */
    public static class GetResourceUrlIconLoader implements IIconLoader {
        private GetResourceUrlIconLoader() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m106105a(Context context, String str, int i, int i2, ImageView imageView) {
            ImageLoader.with(context).load(str).listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(Scene.Chat).mo105398a(ListenerParams.FromType.ICON).mo105401a(false).mo105405b(false).mo105395a(i).mo105403b(i2).mo105402a())).into(imageView);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m106107a(String str, String str2, int i, int i2, Context context, ImageView imageView) {
            C13439c.m54612a().mo49846a(new Runnable(context, ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getResUrlByResKey(str, str2, InitAvatarLoaderTask.m106081a(i), InitAvatarLoaderTask.m106081a(i2)), i, i2, imageView) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitAvatarLoaderTask$GetResourceUrlIconLoader$LCk3Ia0aRCnjq2C8XQrSg0Blow */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ ImageView f$4;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void run() {
                    InitAvatarLoaderTask.GetResourceUrlIconLoader.m106105a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4);
                }
            });
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m106106a(Context context, String str, int i, int i2, String str2, ILoadCallback nVar) {
            ImageLoader.with(context).load(str).asDrawable().listener(new PerfLoadPicMonitor.MonitorRequestListener(new ListenerParams.Builder().mo105396a(Biz.Messenger).mo105397a(Scene.Chat).mo105398a(ListenerParams.FromType.ICON).mo105401a(false).mo105405b(false).mo105395a(i).mo105403b(i2).mo105402a())).into(new CallbackTarget(str2, nVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ void m106108a(String str, String str2, int i, int i2, Context context, ILoadCallback nVar) {
            C13439c.m54612a().mo49846a(new Runnable(context, ((ICoreApi) ApiUtils.getApi(ICoreApi.class)).getResUrlByResKey(str, str2, InitAvatarLoaderTask.m106081a(i), InitAvatarLoaderTask.m106081a(i2)), i, i2, str, nVar) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitAvatarLoaderTask$GetResourceUrlIconLoader$9xk5ofP2JB3uI5jFFOo6v9zRwM */
                public final /* synthetic */ Context f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ String f$4;
                public final /* synthetic */ ILoadCallback f$5;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    InitAvatarLoaderTask.GetResourceUrlIconLoader.m106106a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }

        @Override // com.larksuite.component.ui.avatar.IIconLoader
        /* renamed from: a */
        public void mo89027a(Context context, String str, String str2, String str3, int i, int i2, ImageView imageView) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, str3, i, i2, context, imageView) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitAvatarLoaderTask$GetResourceUrlIconLoader$6FpjhHfFJML_44ln12yM_BsmOgk */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ Context f$4;
                public final /* synthetic */ ImageView f$5;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    InitAvatarLoaderTask.GetResourceUrlIconLoader.m106107a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }

        @Override // com.larksuite.component.ui.avatar.IIconLoader
        /* renamed from: a */
        public void mo89028a(Context context, String str, String str2, String str3, int i, int i2, ILoadCallback nVar) {
            CoreThreadPool.getDefault().getCachedThreadPool().execute(new Runnable(str, str3, i, i2, context, nVar) {
                /* class com.ss.android.lark.app.task.$$Lambda$InitAvatarLoaderTask$GetResourceUrlIconLoader$4ZdnAM5dNIPg631DhULQpQHmCHM */
                public final /* synthetic */ String f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ int f$2;
                public final /* synthetic */ int f$3;
                public final /* synthetic */ Context f$4;
                public final /* synthetic */ ILoadCallback f$5;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                    this.f$5 = r6;
                }

                public final void run() {
                    InitAvatarLoaderTask.GetResourceUrlIconLoader.m106108a(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public static class CallbackTarget extends C38818i<Drawable> {

        /* renamed from: a */
        ILoadCallback f72563a;

        /* renamed from: b */
        private final String f72564b;

        /* renamed from: e_ */
        public void mo49248a(Drawable drawable) {
            if (this.f72563a != null) {
                m106097a((Runnable) new Runnable(drawable) {
                    /* class com.ss.android.lark.app.task.$$Lambda$InitAvatarLoaderTask$CallbackTarget$vrEZ4dgjO6gwrpRNy2RmiGemYXM */
                    public final /* synthetic */ Drawable f$1;

                    {
                        this.f$1 = r2;
                    }

                    public final void run() {
                        InitAvatarLoaderTask.CallbackTarget.this.m106098d(this.f$1);
                    }
                });
            }
        }

        /* renamed from: a */
        private void m106097a(Runnable runnable) {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                C13439c.m54612a().mo49846a(runnable);
            } else {
                runnable.run();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m106098d(Drawable drawable) {
            this.f72563a.mo89030a(drawable);
            ((IIMApi) ApiUtils.getApi(IIMApi.class)).cacheDrawable(this.f72564b, drawable);
        }

        @Override // com.ss.android.lark.image.api.AbstractC38819j, com.ss.android.lark.image.api.C38818i
        /* renamed from: a */
        public void mo49247a(Drawable drawable) {
            ILoadCallback nVar = this.f72563a;
            if (nVar != null) {
                nVar.mo89031a(new IllegalStateException("icon load failed"));
            }
            Log.m165389i("LarkAvatar", String.format("%s: load failed", this.f72564b));
        }

        CallbackTarget(String str, ILoadCallback nVar) {
            this.f72564b = str;
            this.f72563a = nVar;
        }
    }

    @Override // com.larksuite.framework.launch.task.AbstractLaunchTask, com.larksuite.framework.launch.task.ILaunchTask
    /* renamed from: a */
    public void mo43817a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        LarkAvatar.m91598a(new IAvatarDependence() {
            /* class com.ss.android.lark.app.task.InitAvatarLoaderTask.C289361 */

            /* renamed from: c */
            private volatile IIconLoader f72557c;

            /* renamed from: d */
            public boolean mo102688d() {
                return mo89021a();
            }

            @Override // com.larksuite.component.ui.avatar.IAvatarDependence
            /* renamed from: a */
            public boolean mo89021a() {
                return C37239a.m146648b().mo136951a("lark_feature_doc_icon_custom");
            }

            @Override // com.larksuite.component.ui.avatar.IAvatarDependence
            /* renamed from: b */
            public boolean mo89022b() {
                return C37239a.m146648b().mo136951a("lark.tag.v2");
            }

            @Override // com.larksuite.component.ui.avatar.IAvatarDependence
            /* renamed from: c */
            public IIconLoader mo89023c() {
                if (this.f72557c == null) {
                    Log.m165389i("LarkAvatar", String.format("fg, docIcon:%s, badgeTag:%s, threadBadge:%s", Boolean.valueOf(mo89021a()), Boolean.valueOf(mo89022b()), Boolean.valueOf(mo102688d())));
                    if (C20051j.m73195a(applicationContext)) {
                        this.f72557c = new GetResourceIconLoader();
                    } else {
                        this.f72557c = new GetResourceUrlIconLoader();
                    }
                }
                return this.f72557c;
            }
        });
        LarkAvatar.m91599a(DocAvatarModel.class, new DocAvatarModelHandler(new DocIconProvider()) {
            /* class com.ss.android.lark.app.task.InitAvatarLoaderTask.C289372 */

            @Override // com.larksuite.component.ui.avatar.DocAvatarModelHandler
            /* renamed from: a */
            public void mo88998a(Context context, DocAvatarModel dVar, AvatarIconViewData aVar, BadgeViewData cVar, MiniIconViewData vVar) {
                super.mo88998a(context, dVar, aVar, cVar, vVar);
                Log.m165389i("LarkAvatar", String.format("doc name: %s, avatar: %s, fsUnit: %s", dVar.mo89004b(), dVar.mo89009c(), dVar.mo89017i()));
            }
        });
        C25622a.m91438a(new IDependence() {
            /* class com.ss.android.lark.app.task.InitAvatarLoaderTask.C289383 */

            @Override // com.larksuite.component.ui.dependence.IDependence
            /* renamed from: a */
            public IAvatarLoader mo89179a() {
                return new AvatarLoader();
            }

            @Override // com.larksuite.component.ui.dependence.IDependence
            /* renamed from: c */
            public IDocIconProvider mo89181c() {
                return new DocIconProvider();
            }

            @Override // com.larksuite.component.ui.dependence.IDependence
            /* renamed from: b */
            public IChatterAvatarService mo89180b() {
                return ((IIMApi) ApiUtils.getApi(IIMApi.class)).getChatterAvatarService();
            }
        });
    }
}
