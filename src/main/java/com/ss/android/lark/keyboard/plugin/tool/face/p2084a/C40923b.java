package com.ss.android.lark.keyboard.plugin.tool.face.p2084a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.dialog.C25639g;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.framework.callback.CallbackManager;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UIGetDataCallback;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.appreciablelib.Biz;
import com.ss.android.lark.appreciablelib.Scene;
import com.ss.android.lark.base.fragment.BaseFragment;
import com.ss.android.lark.chat.entity.sticker.Sticker;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.keyboard.C40682g;
import com.ss.android.lark.keyboard.hitpoint.HitPointHelper;
import com.ss.android.lark.keyboard.plugin.tool.face.AbstractC40963j;
import com.ss.android.lark.keyboard.plugin.tool.face.C40964l;
import com.ss.android.lark.keyboard.plugin.tool.face.C40966m;
import com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a;
import com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b;
import com.ss.android.lark.keyboard.widget.FaceEmptyView;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.utils.rxjava.LarkRxSchedulers;
import com.ss.android.lark.widget.photo_picker.C58557a;
import com.ss.android.lark.widget.photo_picker.statistics.PerfImageUploadMonitor;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.b */
public class C40923b extends BaseFragment {

    /* renamed from: a */
    public final List<Sticker> f104015a = new ArrayList();

    /* renamed from: b */
    public Activity f104016b;

    /* renamed from: c */
    public C40914a f104017c;

    /* renamed from: d */
    private WeakReference<AbstractC40963j> f104018d;

    /* renamed from: e */
    private final CallbackManager f104019e = new CallbackManager();

    /* renamed from: f */
    private WeakReference<AbstractC40930c> f104020f;

    /* renamed from: g */
    private FaceEmptyView f104021g;

    /* renamed from: h */
    private RecyclerView f104022h;

    /* renamed from: i */
    private RecyclerView.LayoutManager f104023i;

    /* renamed from: j */
    private View f104024j;

    /* renamed from: k */
    private volatile boolean f104025k = false;

    /* renamed from: l */
    private final IPushStickerListener f104026l = new IPushStickerListener() {
        /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b.C409241 */

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener
        /* renamed from: a */
        public void mo147577a() {
            Log.m165379d("uploadStickers", "onDataChanged");
            Log.m165379d("FacePageNewFragment", "onDataChanged called. receive collect sticker push.");
            AbstractC40930c e = C40923b.this.mo147575e();
            if (e == null) {
                Log.m165389i("FacePageNewFragment", "onDataChanged called. stickerDependency is null.");
                return;
            }
            e.getClass();
            C57865c.m224574a(new C57865c.AbstractC57873d() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$J2jrz1PI1cy9xAgYNR_i7a2ZNDQ */

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57873d
                public final Object produce() {
                    return AbstractC40930c.this.mo147535a();
                }
            }, new C57865c.AbstractC57871b() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$1$fP03RqWbiJrf_50F3qILrbuvU */

                @Override // com.ss.android.lark.utils.rxjava.C57865c.AbstractC57871b
                public final void consume(Object obj) {
                    C40923b.C409241.this.m162071a((List) obj);
                }
            });
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private /* synthetic */ void m162071a(List list) {
            C40923b.this.f104015a.clear();
            C40923b.this.f104015a.add(new Sticker());
            C40923b.this.f104015a.addAll(list);
            HitPointHelper.f103322b.mo146874a();
            if (C40923b.this.f104017c == null) {
                Log.m165389i("FacePageNewFragment", "onDataChanged called. FaceNewAdapter is null");
                return;
            }
            C40923b.this.f104017c.mo147564a(C40923b.this.f104015a);
            C40923b.this.mo147568a();
        }
    };

    /* renamed from: m */
    private C40929a f104027m;

    /* renamed from: a */
    public void mo147572a(final List<String> list, final boolean z) {
        PerfImageUploadMonitor.f145430a.mo199312a(Biz.Messenger, Scene.Chat, 3);
        PerfImageUploadMonitor.f145430a.mo199313a(false, true);
        AbstractC40930c e = mo147575e();
        if (e == null) {
            Log.m165389i("FacePageNewFragment", "uploadStickers called. stickerDependency is null.");
        } else if (this.f104017c == null) {
            Log.m165389i("FacePageNewFragment", "uploadStickers called. mAdapter is null.");
        } else if (list.size() > 0) {
            UIGetDataCallback wrapAndAddGetDataCallback = this.f104019e.wrapAndAddGetDataCallback(new IGetDataCallback<C40966m>() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b.C409274 */

                /* renamed from: a */
                public void onSuccess(C40966m mVar) {
                    PerfImageUploadMonitor.f145430a.mo199309a();
                    Log.m165379d("uploadStickers", "onSuccess: " + mVar.f104151a.size());
                    List<String> list = mVar.f104151a;
                    if (list.size() > 0) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("total_number", Integer.toString(list.size()));
                        hashMap.put("failed_number", Integer.toString(list.size()));
                        new C25639g(C40923b.this.f104016b).mo89248g(R.string.Lark_Legacy_LarkTip).mo89238b(true).mo89242c(UIHelper.mustacheFormat((int) R.string.Lark_Legacy_StickerUploadFailedMessage, hashMap)).mo89225a(R.id.lkui_dialog_btn_right, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_StickerUploadRetryCount, "retry_number", Integer.toString(list.size())), new DialogInterface.OnClickListener(list, z) {
                            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$4$yQWsbc3Zt994M60vu5u7EP2lMns */
                            public final /* synthetic */ List f$1;
                            public final /* synthetic */ boolean f$2;

                            {
                                this.f$1 = r2;
                                this.f$2 = r3;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                C40923b.C409274.this.m162073a(this.f$1, this.f$2, dialogInterface, i);
                            }
                        }).mo89224a(R.id.lkui_dialog_btn_left, R.string.Lark_Legacy_Cancel, (DialogInterface.OnClickListener) null).mo89239c();
                    }
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    Log.m165379d("uploadStickers", "onError: " + errorResult.getErrorCode());
                    PerfImageUploadMonitor.f145430a.mo199315b();
                    if (errorResult.getErrorCode() == 1) {
                        LKUIToast.show(C40923b.this.f104016b, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_StickerFileTooLarge, "file_name", errorResult.getErrorMsg()), 3500);
                    } else if (errorResult.getErrorCode() == C40682g.m160850a().mo133172b()) {
                        C40682g.m160850a().mo133167a(C40923b.this.f104016b, errorResult.getDisplayMsg(C40682g.m160850a().mo133175c()));
                    } else {
                        new C25639g(C40923b.this.f104016b).mo89248g(R.string.Lark_Legacy_LarkTip).mo89238b(true).mo89254m(R.string.Lark_Legacy_StickerUploadNetErrorTip).mo89224a(R.id.lkui_dialog_btn_right, R.string.Lark_Legacy_ConfirmTip, (DialogInterface.OnClickListener) null).mo89239c();
                    }
                    int size = C40923b.this.f104015a.size() - 1;
                    while (size >= 0 && "-1".equals(C40923b.this.f104015a.get(size).getStickerId())) {
                        C40923b.this.f104015a.remove(size);
                        size--;
                    }
                    C40923b.this.f104017c.mo147564a(C40923b.this.f104015a);
                }

                /* access modifiers changed from: private */
                /* access modifiers changed from: public */
                /* renamed from: a */
                private /* synthetic */ void m162073a(List list, boolean z, DialogInterface dialogInterface, int i) {
                    C40923b.this.mo147572a(list, z);
                }
            });
            long j = 0;
            for (int i = 0; i < list.size(); i++) {
                Sticker sticker = new Sticker();
                sticker.setStickerId("-1");
                this.f104015a.add(sticker);
                String str = list.get(i);
                if (!TextUtils.isEmpty(str)) {
                    j += C26311p.m95281c(new File(str));
                }
            }
            PerfImageUploadMonitor.f145430a.mo199317b(0, 0, (int) j);
            this.f104017c.mo147564a(this.f104015a);
            e.mo147539a(list, z, wrapAndAddGetDataCallback);
        }
    }

    /* renamed from: d */
    public static C40923b m162053d() {
        return new C40923b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        m162058k();
        super.onDestroy();
    }

    /* renamed from: g */
    public static int m162054g() {
        if (DesktopUtil.m144307b()) {
            return 6;
        }
        return 4;
    }

    /* renamed from: k */
    private void m162058k() {
        C40914a aVar = this.f104017c;
        if (aVar != null) {
            aVar.mo147558a();
        }
    }

    /* renamed from: l */
    private void m162059l() {
        C40914a aVar = this.f104017c;
        if (aVar != null) {
            aVar.mo147560a(new C40914a.AbstractC40919a() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b.C409285 */

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.AbstractC40919a
                /* renamed from: a */
                public void mo147566a() {
                    AbstractC40963j f = C40923b.this.mo147576f();
                    if (f != null) {
                        f.mo147531a(1024);
                    }
                }

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.AbstractC40919a
                /* renamed from: a */
                public void mo147567a(C40964l lVar) {
                    AbstractC40963j f = C40923b.this.mo147576f();
                    if (f != null) {
                        f.mo147532a(lVar);
                    }
                }
            });
        }
    }

    /* renamed from: m */
    private void m162060m() {
        C40914a aVar = this.f104017c;
        if (aVar != null) {
            aVar.mo147562a(new C40914a.AbstractC40921c() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$NWNN_sndcryPznOOyAWD4LOm3ZQ */

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.AbstractC40921c
                public final C40964l getLocalStickerFileInfo(String str, int i, int i2) {
                    return C40923b.this.m162045a(str, i, i2);
                }
            });
        }
    }

    /* renamed from: n */
    private void m162061n() {
        C40914a aVar = this.f104017c;
        if (aVar != null) {
            aVar.mo147561a(new C40914a.AbstractC40920b() {
                /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$gFofq0bjkQaBkhBPVNmE439YfRE */

                @Override // com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40914a.AbstractC40920b
                public final void loadSticker(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
                    C40923b.this.m162046a(context, z, i, i2, str, imageView, i3, i4);
                }
            });
        }
    }

    /* renamed from: e */
    public AbstractC40930c mo147575e() {
        WeakReference<AbstractC40930c> weakReference = this.f104020f;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: f */
    public AbstractC40963j mo147576f() {
        WeakReference<AbstractC40963j> weakReference = this.f104018d;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, com.ss.android.lark.base.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AbstractC40930c e = mo147575e();
        if (e != null) {
            e.mo147541b(this.f104027m);
        }
        super.onDestroyView();
    }

    /* renamed from: com.ss.android.lark.keyboard.plugin.tool.face.a.b$a */
    private static class C40929a implements IPushStickerListener {

        /* renamed from: a */
        private final WeakReference<IPushStickerListener> f104035a;

        @Override // com.ss.android.lark.keyboard.plugin.tool.face.IPushStickerListener
        /* renamed from: a */
        public void mo147577a() {
            IPushStickerListener hVar;
            WeakReference<IPushStickerListener> weakReference = this.f104035a;
            if (weakReference != null && (hVar = weakReference.get()) != null) {
                hVar.mo147577a();
            }
        }

        private C40929a(IPushStickerListener hVar) {
            this.f104035a = new WeakReference<>(hVar);
        }
    }

    /* renamed from: j */
    private void m162057j() {
        this.f104021g.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$wRGWUTXph3jUfxsfufG1hRmTWU8 */

            public final void onClick(View view) {
                C40923b.this.m162047a((C40923b) view);
            }
        });
        m162059l();
        m162060m();
        m162061n();
    }

    /* renamed from: h */
    private void m162055h() {
        Observable.create(new ObservableOnSubscribe<List<Sticker>>() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b.C409252 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<List<Sticker>> observableEmitter) throws Exception {
                AbstractC40930c e = C40923b.this.mo147575e();
                if (e != null) {
                    observableEmitter.onNext(e.mo147540b());
                }
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$98C9vYCFP605S9CVBxkk9fls8Ww */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C40923b.this.m162052c((List) obj);
            }
        }, $$Lambda$b$izxPT0AFZYBjhkWxeGW_iqPTKz0.INSTANCE);
    }

    /* renamed from: i */
    private void m162056i() {
        Observable.create(new ObservableOnSubscribe<List<Sticker>>() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.C40923b.C409263 */

            @Override // io.reactivex.ObservableOnSubscribe
            public void subscribe(ObservableEmitter<List<Sticker>> observableEmitter) throws Exception {
                AbstractC40930c e = C40923b.this.mo147575e();
                if (e != null) {
                    observableEmitter.onNext(e.mo147535a());
                }
            }
        }).subscribeOn(LarkRxSchedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() {
            /* class com.ss.android.lark.keyboard.plugin.tool.face.p2084a.$$Lambda$b$YwV32fb3mB_4EmjzM8sW_O6GHjk */

            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C40923b.this.m162050b((C40923b) ((List) obj));
            }
        }, $$Lambda$b$krRK8BJpa03PlTkQyueQSLd1RE.INSTANCE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo147573b() {
        this.f104017c.mo147564a(this.f104015a);
        this.f104016b = getActivity();
        mo147568a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo147574c() {
        this.f104021g = (FaceEmptyView) this.f104024j.findViewById(R.id.face_empty_view);
        this.f104022h = (RecyclerView) this.f104024j.findViewById(R.id.face_recv);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), m162054g());
        this.f104023i = gridLayoutManager;
        this.f104022h.setLayoutManager(gridLayoutManager);
        C40914a aVar = new C40914a(getContext());
        this.f104017c = aVar;
        this.f104022h.setAdapter(aVar);
        if (DesktopUtil.m144307b()) {
            Context context = this.f104022h.getContext();
            int dp2px = UIUtils.dp2px(context, 10.0f);
            int dp2px2 = UIUtils.dp2px(context, 14.0f);
            this.f104022h.setPadding(dp2px2, dp2px, dp2px2, dp2px);
        }
    }

    /* renamed from: a */
    public void mo147568a() {
        if (this.f104015a.size() == 1) {
            this.f104021g.setVisibility(0);
            this.f104022h.setVisibility(8);
            return;
        }
        this.f104021g.setVisibility(8);
        this.f104022h.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m162052c(List list) throws Exception {
        this.f104025k = true;
        mo147571a(list);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m162050b(List list) throws Exception {
        if (this.f104025k) {
            Log.m165389i("FacePageNewFragment", "loaded from net, ignore local data.");
        } else {
            mo147571a(list);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m162049b(Throwable th) throws Exception {
        Log.m165397w("FacePageNewFragment", "load sticker stickers error! " + th.getMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m162047a(View view) {
        C58557a.m227127a().mo198526i(false).mo198524g(true).mo198525h(false).mo198531n(false).mo198532o(false).mo198512a(getContext(), this, 1024);
    }

    /* renamed from: a */
    private View m162044a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(R.id.root);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        FaceEmptyView faceEmptyView = new FaceEmptyView(context);
        faceEmptyView.setId(R.id.face_empty_view);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = UIUtils.dp2px(context, 48.0f);
        faceEmptyView.setGravity(17);
        linearLayout.addView(faceEmptyView, layoutParams2);
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R.id.face_recv);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -1);
        recyclerView.setVisibility(8);
        linearLayout.addView(recyclerView, layoutParams3);
        return linearLayout;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m162048a(Throwable th) throws Exception {
        Log.m165397w("FacePageNewFragment", "load sticker stickers error! " + th.getMessage());
    }

    /* renamed from: a */
    public void mo147569a(AbstractC40930c cVar) {
        this.f104020f = new WeakReference<>(cVar);
        m162060m();
        m162061n();
    }

    /* renamed from: a */
    public void mo147570a(AbstractC40963j jVar) {
        this.f104018d = new WeakReference<>(jVar);
        m162059l();
    }

    /* renamed from: a */
    public void mo147571a(List<Sticker> list) {
        this.f104015a.clear();
        this.f104015a.add(0, new Sticker());
        this.f104015a.addAll(list);
        this.f104017c.mo147564a(this.f104015a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        m162056i();
        m162055h();
    }

    /* renamed from: b */
    private void m162051b(List<String> list, boolean z) {
        if (CollectionUtils.isNotEmpty(list)) {
            mo147572a(list, z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ C40964l m162045a(String str, int i, int i2) {
        AbstractC40930c e = mo147575e();
        if (e == null) {
            return null;
        }
        return e.mo147534a(str, i, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1024 && intent != null) {
            m162051b(intent.getStringArrayListExtra("SELECTED_PHOTOS"), intent.getBooleanExtra("KEEP_ORIGIN_PHOTO", false));
        }
    }

    @Override // com.ss.android.lark.desktopmode.p1787a.C36516a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f104024j = m162044a(layoutInflater.getContext());
        mo147574c();
        m162057j();
        mo147573b();
        AbstractC40930c e = mo147575e();
        if (e != null) {
            C40929a aVar = new C40929a(this.f104026l);
            this.f104027m = aVar;
            e.mo147538a(aVar);
        }
        return this.f104024j;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m162046a(Context context, boolean z, int i, int i2, String str, ImageView imageView, int i3, int i4) {
        AbstractC40930c e = mo147575e();
        if (e != null) {
            e.mo147536a(context, z, i, i2, str, imageView, i3, i4);
        }
    }
}
