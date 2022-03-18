package com.ss.android.appcenter.business.activity.appaddv2.p1266a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.tag.UDTagsDrawable;
import com.larksuite.component.universe_design.util.UDDimenUtils;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.activity.appaddv2.C27584a;
import com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton;
import com.ss.android.appcenter.business.dto.NameTag;
import com.ss.android.appcenter.business.monitor.statistics.C27710b;
import com.ss.android.appcenter.business.net.dto.C27737a;
import com.ss.android.appcenter.business.p1268b.C27688a;
import com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.util.C28184h;
import com.ss.android.appcenter.p1262a.p1263a.C27548m;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.appcenter.business.activity.appaddv2.a.a */
public class C27591a extends AbstractC28109a<C27737a, C28112d> {

    /* renamed from: a */
    public Context f68811a;

    /* renamed from: b */
    private C27584a f68812b;

    /* renamed from: c */
    private Object f68813c = new Object();

    /* renamed from: e */
    private AtomicBoolean f68814e = new AtomicBoolean();

    /* renamed from: f */
    private boolean f68815f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    public int getItemCount() {
        return this.f70402d.size() + (this.f68815f ? 1 : 0);
    }

    /* renamed from: com.ss.android.appcenter.business.activity.appaddv2.a.a$3 */
    public static /* synthetic */ class C275943 {

        /* renamed from: a */
        static final /* synthetic */ int[] f68822a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton$ActionType[] r0 = com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton.ActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a.C275943.f68822a = r0
                com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton$ActionType r1 = com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton.ActionType.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a.C275943.f68822a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton$ActionType r1 = com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton.ActionType.DELETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a.C275943.f68822a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton$ActionType r1 = com.ss.android.appcenter.business.activity.appaddv2.view.ActionButton.ActionType.GET     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a.C275943.<clinit>():void");
        }
    }

    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m100695c(int i) {
        notifyItemChanged(i);
    }

    /* renamed from: a */
    private boolean m100694a(int i) {
        if (!this.f68815f || i != getItemCount() - 1) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (m100694a(i)) {
            return 2;
        }
        return 1;
    }

    /* renamed from: a */
    public void mo98308a(C27595b bVar) {
        this.f68814e.set(true);
        synchronized (this.f68813c) {
            this.f68815f = bVar.mo98312b();
            mo100069c(bVar.mo98311a());
        }
        this.f68814e.set(false);
    }

    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public C28112d mo98307a(ViewGroup viewGroup, int i) {
        int i2;
        if (i == 1) {
            i2 = R.layout.workplace_addapp_appadapter_app_item;
        } else {
            i2 = R.layout.workplace_addapp_appadapter_hint_item;
        }
        return new C28112d(LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false));
    }

    /* renamed from: a */
    public void mo98310a(String str, ActionButton.ActionType actionType) {
        if (!this.f68814e.get()) {
            synchronized (this.f68813c) {
                List d = mo100070d();
                int i = 0;
                while (true) {
                    if (i >= d.size()) {
                        break;
                    }
                    C27737a aVar = (C27737a) d.get(i);
                    if (TextUtils.equals(aVar.mo98961a(), str)) {
                        aVar.mo98962a(actionType);
                        UICallbackExecutor.post(new Runnable(i) {
                            /* class com.ss.android.appcenter.business.activity.appaddv2.p1266a.$$Lambda$a$gxUJ2Dix9nANn6e5sjD8u4Rz3o */
                            public final /* synthetic */ int f$1;

                            {
                                this.f$1 = r2;
                            }

                            public final void run() {
                                C27591a.m270179lambda$gxUJ2Dix9nANn6e5sjD8u4Rz3o(C27591a.this, this.f$1);
                            }
                        });
                        break;
                    }
                    i++;
                }
            }
        }
    }

    @Override // com.ss.android.appcenter.common.adapter.p1288a.AbstractC28109a
    /* renamed from: a */
    public void mo98309a(C28112d dVar, int i) {
        C27737a aVar;
        ActionButton.ActionType actionType;
        if (!m100694a(i) && (aVar = (C27737a) mo100065b(i)) != null) {
            String b = aVar.mo98964b();
            C27688a.m101210a(this.f68811a, aVar.mo98965c(), b, (ImageView) dVar.mo100072a(R.id.icon));
            dVar.mo100074a(R.id.name, aVar.mo98965c());
            dVar.mo100074a(R.id.desc, aVar.mo98966d());
            ActionButton actionButton = (ActionButton) dVar.mo100072a(R.id.action_bt);
            String a = aVar.mo98961a();
            if (!aVar.mo98969g()) {
                if (aVar.mo98968f()) {
                    if (this.f68812b.isItemAdded(aVar.mo98961a())) {
                        actionType = ActionButton.ActionType.DELETE;
                    } else {
                        actionType = ActionButton.ActionType.ADD;
                    }
                    aVar.mo98962a(actionType);
                } else {
                    aVar.mo98962a(ActionButton.ActionType.GET);
                }
            }
            actionButton.mo98336a(aVar.mo98970h());
            if (aVar.mo98971i()) {
                UDTagsDrawable i2 = new UDTagsDrawable.Builder(this.f68811a).mo91384a(new UDTagsDrawable.TagModel.Builder(this.f68811a).mo91418a(this.f68811a.getString(NameTag.BOT.getTextResId())).mo91417a(NameTag.BOT.getColorSet()).mo91427g()).mo91383a(UDDimenUtils.m93308a(this.f68811a, 12)).mo91388c(UDDimenUtils.m93308a(this.f68811a, 18)).mo91398i();
                if (i2 != null) {
                    i2.mo91368a(dVar.mo100072a(R.id.tag));
                }
                dVar.mo100075a(R.id.tag, true);
            } else {
                dVar.mo100075a(R.id.tag, false);
            }
            dVar.mo100072a(R.id.action_bt).setOnClickListener(new View.OnClickListener(aVar, actionButton, a, b) {
                /* class com.ss.android.appcenter.business.activity.appaddv2.p1266a.$$Lambda$a$Fgyt7CfZwohf6FTz8EOvTcfWZ6o */
                public final /* synthetic */ C27737a f$1;
                public final /* synthetic */ ActionButton f$2;
                public final /* synthetic */ String f$3;
                public final /* synthetic */ String f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(View view) {
                    C27591a.lambda$Fgyt7CfZwohf6FTz8EOvTcfWZ6o(C27591a.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
                }
            });
        }
    }

    public C27591a(List<C27737a> list, Context context, C27584a aVar) {
        super(list);
        this.f68811a = context;
        this.f68812b = aVar;
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m100693a(final C27737a aVar, ActionButton actionButton, final String str, String str2, View view) {
        int i = C275943.f68822a[aVar.mo98970h().ordinal()];
        if (i == 1) {
            C28184h.m103250d("App_Add_Page", "click ADD button. model:" + aVar);
            actionButton.mo98336a(ActionButton.ActionType.ADD_LOADING);
            aVar.mo98962a(ActionButton.ActionType.ADD_LOADING);
            this.f68812b.addAppItem(str, str2, new C27584a.AbstractC27590a() {
                /* class com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a.C275921 */

                @Override // com.ss.android.appcenter.business.activity.appaddv2.C27584a.AbstractC27590a
                /* renamed from: a */
                public void mo98304a(boolean z) {
                    C28184h.m103250d("App_Add_Page", "ADD result:" + z + aVar);
                    if (z) {
                        C27591a.this.mo98310a(str, ActionButton.ActionType.DELETE);
                        return;
                    }
                    LKUIToast.show(C27591a.this.f68811a, (int) R.string.OpenPlatform_AppCenter_AddFailToast);
                    C27591a.this.mo98310a(str, ActionButton.ActionType.ADD);
                }
            });
            C27710b.m101299g(str);
        } else if (i == 2) {
            C28184h.m103250d("App_Add_Page", "click DELETE button. model:" + aVar);
            actionButton.mo98336a(ActionButton.ActionType.DELETE_LOADING);
            aVar.mo98962a(ActionButton.ActionType.DELETE_LOADING);
            this.f68812b.deleteAppItem(str, new C27584a.AbstractC27590a() {
                /* class com.ss.android.appcenter.business.activity.appaddv2.p1266a.C27591a.C275932 */

                @Override // com.ss.android.appcenter.business.activity.appaddv2.C27584a.AbstractC27590a
                /* renamed from: a */
                public void mo98304a(boolean z) {
                    C28184h.m103250d("App_Add_Page", "DELETE result:" + z + aVar);
                    if (z) {
                        C27591a.this.mo98310a(str, ActionButton.ActionType.ADD);
                        return;
                    }
                    LKUIToast.show(C27591a.this.f68811a, (int) R.string.OpenPlatform_AppCenter_DeleteFailToast);
                    C27591a.this.mo98310a(str, ActionButton.ActionType.DELETE);
                }
            });
            C27710b.m101301h(str);
        } else if (i == 3) {
            C28184h.m103250d("App_Add_Page", "click GET button. model:" + aVar);
            C27548m.m100547m().mo98222f().mo98205b(this.f68811a, aVar.mo98967e());
        }
    }
}
