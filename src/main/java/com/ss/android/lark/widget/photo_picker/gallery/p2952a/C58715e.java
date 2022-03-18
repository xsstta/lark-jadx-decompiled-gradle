package com.ss.android.lark.widget.photo_picker.gallery.p2952a;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.larksuite.component.ui.dialog.LKUIListItemData;
import com.larksuite.component.ui.toast.LKUIToast;
import com.larksuite.component.universe_design.dialog.UDListDialogController;
import com.larksuite.component.universe_design.dialog.actionpanel.UDActionPanelBuilder;
import com.larksuite.framework.callback.AbstractC25974h;
import com.larksuite.framework.callback.Entity.ErrorResult;
import com.larksuite.framework.callback.IGetDataCallback;
import com.larksuite.framework.callback.UICallbackExecutor;
import com.larksuite.framework.utils.C26311p;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.chat.entity.media.MediaExtra;
import com.ss.android.lark.chat.entity.message.MessageIdentity;
import com.ss.android.lark.desktopmode.utils.DesktopUtil;
import com.ss.android.lark.image.ImageLoader;
import com.ss.android.lark.image.api.IRequestCreator;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.player.entity.DataSource;
import com.ss.android.lark.player.p2511a.C52093l;
import com.ss.android.lark.player.p2513c.AbstractC52110k;
import com.ss.android.lark.player.p2515d.AbstractC52127b;
import com.ss.android.lark.player.widget.VideoView;
import com.ss.android.lark.ui.BasePopupWindow;
import com.ss.android.lark.utils.C57805b;
import com.ss.android.lark.utils.C57840j;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.utils.rxjava.C57865c;
import com.ss.android.lark.widget.photo_picker.C58612c;
import com.ss.android.lark.widget.photo_picker.entity.PhotoItem;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnChatAlbumClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.callback.OnDialogMenuClickListener;
import com.ss.android.lark.widget.photo_picker.gallery.online.statistic.VideoHitPoint;
import com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a;
import com.ss.android.lark.widget.photo_picker.statistics.PerfVideoViewMonitor;
import com.ss.android.lark.widget.photo_picker.utils.MediaExtraUtils;
import com.ss.android.lark.widget.photo_picker.video.C58857b;
import com.ss.android.lark.widget.photo_picker.video.C58868c;
import com.ss.android.lark.widget.photo_picker.video.C58872d;
import com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover;
import com.ss.android.lark.widget.photo_picker.video.OnlinePreloadingCover;
import com.ss.ttvideoengine.VideoEngineInfoListener;
import com.ss.ttvideoengine.VideoEngineInfos;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.e */
public class C58715e implements AbstractC52110k, AbstractC58689a.AbstractC58692b, VideoEngineInfoListener {

    /* renamed from: a */
    public final AbstractC58731c f145090a;

    /* renamed from: b */
    public final PhotoItem f145091b;

    /* renamed from: c */
    public final FragmentActivity f145092c;

    /* renamed from: d */
    public VideoView f145093d;

    /* renamed from: e */
    public AbstractC58689a.AbstractC58692b.AbstractC58693a f145094e;

    /* renamed from: f */
    public boolean f145095f;

    /* renamed from: g */
    public OnDialogMenuClickListener f145096g;

    /* renamed from: h */
    private final boolean f145097h;

    /* renamed from: i */
    private boolean f145098i;

    /* renamed from: j */
    private final IRequestCreator f145099j;

    /* renamed from: k */
    private C58857b f145100k;

    /* renamed from: l */
    private C58868c f145101l;

    /* renamed from: m */
    private OnlineNetworkStatusCover f145102m;

    /* renamed from: n */
    private C58872d f145103n;

    /* renamed from: o */
    private boolean f145104o = true;

    /* renamed from: p */
    private boolean f145105p = true;

    /* renamed from: q */
    private boolean f145106q = true;

    /* renamed from: r */
    private boolean f145107r = true;

    /* renamed from: s */
    private boolean f145108s;

    /* renamed from: t */
    private OnChatAlbumClickListener f145109t;

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.e$a */
    private interface AbstractC58729a {
        /* renamed from: a */
        void mo199101a();
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.e$b */
    public interface AbstractC58730b {
        /* renamed from: a */
        void mo199114a();
    }

    /* renamed from: com.ss.android.lark.widget.photo_picker.gallery.a.e$c */
    public interface AbstractC58731c {
        /* renamed from: a */
        void mo199067a();

        /* renamed from: a */
        void mo199068a(C58715e eVar);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199052a(PhotoItem photoItem) {
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void create() {
    }

    /* renamed from: a */
    public void setViewDelegate(AbstractC58689a.AbstractC58692b.AbstractC58693a aVar) {
        this.f145094e = aVar;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199054a(boolean z) {
        this.f145095f = true;
        if (z && this.f145104o) {
            UICallbackExecutor.execute(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.RunnableC587161 */

                public void run() {
                    C58715e.this.f145094e.mo199064a(C58715e.this.f145091b, false, true);
                }
            });
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199053a(String str) {
        LKUIToast.show(this.f145092c, str);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: c */
    public void mo199058c() {
        this.f145103n.mo199488d();
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: d */
    public void mo199061d() {
        C58857b bVar = this.f145100k;
        if (bVar != null) {
            bVar.mo199461a(false);
        }
    }

    @Override // com.larksuite.framework.mvp.ILifecycle
    public void destroy() {
        C58857b bVar = this.f145100k;
        if (bVar != null) {
            bVar.mo199468q();
        }
        VideoView videoView = this.f145093d;
        if (videoView != null) {
            videoView.mo178606g();
        }
    }

    /* renamed from: e */
    public void mo199094e() {
        C58857b bVar = this.f145100k;
        if (bVar != null) {
            bVar.mo199461a(false);
        }
        this.f145090a.mo199067a();
    }

    /* renamed from: j */
    private boolean m227796j() {
        boolean z;
        MessageIdentity messageIdentity = this.f145091b.getMessageIdentity();
        if (messageIdentity == null || !messageIdentity.isHideJumpChat()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f145096g == null || !this.f145106q || z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: b */
    public void mo199055b() {
        this.f145095f = false;
        this.f145105p = true;
        VideoView videoView = this.f145093d;
        if (videoView != null) {
            this.f145104o = videoView.mo178601b();
            if (this.f145093d.mo178599a()) {
                this.f145093d.mo178603d();
            }
        }
    }

    /* renamed from: f */
    public void mo199095f() {
        if (this.f145105p) {
            VideoHitPoint.f145036a.mo199065a(this.f145091b.getMessageIdentity().getMessageId());
            this.f145105p = true;
        }
    }

    /* renamed from: g */
    public void mo199096g() {
        VideoView videoView = this.f145093d;
        if (videoView != null) {
            videoView.mo178603d();
        }
        C57805b.m224333d(this.f145092c, new C57805b.AbstractC57809a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.C587289 */

            @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
            public void permissionGranted(boolean z) {
                if (z) {
                    C58715e.this.f145094e.mo199063a(C58715e.this.f145091b);
                } else {
                    LKUIToast.show(C58715e.this.f145092c, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Writeexternalstorage));
                }
            }
        });
    }

    /* renamed from: i */
    public void mo199098i() {
        MessageIdentity messageIdentity = this.f145091b.getMessageIdentity();
        if (messageIdentity != null) {
            this.f145096g.onJumpToChatClicked(messageIdentity.getMessageId());
        }
    }

    /* renamed from: h */
    public void mo199097h() {
        if (!C58612c.m227290a().mo102855b(this.f145091b.getMediaExtra().getKey(), true)) {
            C58612c.m227290a().mo102833a(this.f145092c, R.string.Lark_Audit_BlockedActionSaveToDocs);
        } else {
            C58612c.m227290a().mo102843a(this.f145091b.getMessageIdentity(), this.f145091b.getMediaExtra().getKey(), new IGetDataCallback<String>() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass10 */

                /* renamed from: a */
                public void onSuccess(String str) {
                    LKUIToast.show((Context) C58715e.this.f145092c, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_WillSaveToLarkDrive);
                }

                @Override // com.larksuite.framework.callback.IGetDataCallback
                public void onError(ErrorResult errorResult) {
                    LKUIToast.show(C58715e.this.f145092c, (int) R.string.Lark_Legacy_SaveFail);
                }
            });
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199048a() {
        FragmentActivity fragmentActivity = this.f145092c;
        if (fragmentActivity != null && !fragmentActivity.isDestroyed() && !this.f145092c.isFinishing()) {
            this.f145092c.finish();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199049a(float f) {
        C58857b bVar = this.f145100k;
        if (bVar != null) {
            bVar.mo199455a(f);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199050a(int i) {
        this.f145103n.mo199486a(i);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: b */
    public void mo199056b(String str) {
        C58612c.m227290a().mo102839a(this.f145092c, str, (DialogInterface.OnDismissListener) null);
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: c */
    public void mo199059c(String str) {
        C26311p.m95268a(this.f145092c, str);
        LKUIToast.show(this.f145092c, (int) R.string.Lark_Legacy_SaveSuccess);
        this.f145103n.mo199487c();
    }

    /* renamed from: a */
    private void m227791a(TextView textView) {
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = UIUtils.dp2px(this.f145092c, 42.0f);
            textView.setLayoutParams(layoutParams);
        }
        textView.setTextColor(UIUtils.getColor(this.f145092c, R.color.lkui_N1000));
        textView.setTextSize(2, 14.0f);
    }

    /* renamed from: e */
    private void m227795e(boolean z) {
        VideoView videoView = this.f145093d;
        if (videoView != null) {
            videoView.setVideoEngineInfoListener(this);
            this.f145093d.setOnErrorEventListener(this);
            if (this.f145097h) {
                this.f145093d.setMute(true);
            }
            if (z && this.f145100k != null) {
                this.f145093d.mo178602c();
                this.f145100k.mo199461a(false);
                mo199095f();
                this.f145100k.mo199463c();
            }
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: b */
    public void mo199057b(final boolean z) {
        C58857b bVar;
        if (this.f145093d == null) {
            m227792a(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass12 */

                public void run() {
                    C58715e.this.mo199057b(z);
                }
            });
        } else if (!z && (bVar = this.f145100k) != null) {
            bVar.mo199464m();
        }
    }

    /* renamed from: a */
    private AbstractC58730b m227789a(View view) {
        m227793b(view);
        final BasePopupWindow basePopupWindow = new BasePopupWindow(view, UIHelper.dp2px(124.0f), -2);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        basePopupWindow.setFocusable(true);
        basePopupWindow.setOutsideTouchable(false);
        View n = this.f145100k.mo199465n();
        n.getLocationInWindow(new int[2]);
        basePopupWindow.showAtLocation(n, 85, UIUtils.dp2px(this.f145092c, 15.0f) / 2, UIUtils.getHeight(n));
        return new AbstractC58730b() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.C587214 */

            @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AbstractC58730b
            /* renamed from: a */
            public void mo199114a() {
                basePopupWindow.dismiss();
            }
        };
    }

    /* renamed from: b */
    private void m227793b(View view) {
        m227791a((TextView) view.findViewById(R.id.save_tv));
        m227791a((TextView) view.findViewById(R.id.save_to_drive_tv));
        m227791a((TextView) view.findViewById(R.id.jump_to_chat_tv));
        m227791a((TextView) view.findViewById(R.id.cancel_tv));
        view.findViewById(R.id.divide_1).setVisibility(8);
        view.findViewById(R.id.divide_2).setVisibility(8);
        view.findViewById(R.id.save_to_drive_divider).setVisibility(8);
        m227790a(view.findViewById(R.id.root), 0, 0, 0, UIUtils.dp2px(this.f145092c, 15.0f));
        view.setBackgroundResource(R.drawable.photo_picker_desktop_bg_online_video_action);
    }

    @Override // com.ss.ttvideoengine.VideoEngineInfoListener
    public void onVideoEngineInfos(VideoEngineInfos videoEngineInfos) {
        boolean z;
        if (videoEngineInfos != null && "mdlhitcachesize".equals(videoEngineInfos.getKey())) {
            String usingMDLPlayTaskKey = videoEngineInfos.getUsingMDLPlayTaskKey();
            long usingMDLHitCacheSize = videoEngineInfos.getUsingMDLHitCacheSize();
            Log.m165389i("OnlineVideoGalleryView", "usingKey: " + usingMDLPlayTaskKey + ", hitCacheSize: " + usingMDLHitCacheSize);
            if (usingMDLHitCacheSize > 0) {
                z = true;
            } else {
                z = false;
            }
            PerfVideoViewMonitor.m228166b(z);
        }
    }

    /* renamed from: a */
    private void m227792a(final Runnable runnable) {
        C57840j.m224506b().mo196190b("videoplayer").observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Boolean>() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass18 */

            /* renamed from: a */
            public void accept(Boolean bool) throws Exception {
                if (!bool.booleanValue() || !C58715e.this.f145095f) {
                    return;
                }
                if (C58715e.this.f145093d != null) {
                    runnable.run();
                    return;
                }
                C58715e.this.f145090a.mo199068a(C58715e.this);
                C58715e eVar = C58715e.this;
                eVar.mo199092a(eVar.f145093d, C58715e.this.f145091b);
                runnable.run();
            }
        });
    }

    /* renamed from: d */
    private void m227794d(boolean z) {
        boolean z2;
        FragmentActivity fragmentActivity;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        if (this.f145091b.getMediaExtra() == null || TextUtils.isEmpty(this.f145091b.getMediaExtra().getKey())) {
            z2 = false;
        } else {
            z2 = true;
        }
        String string = UIUtils.getString(this.f145092c, R.string.Lark_Legacy_SaveVideoMenu);
        if (z2) {
            arrayList.add(new LKUIListItemData(string));
            linkedHashMap.put(string, new AbstractC58729a() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass11 */

                @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AbstractC58729a
                /* renamed from: a */
                public void mo199101a() {
                    C58715e.this.mo199096g();
                }
            });
        }
        MessageIdentity messageIdentity = this.f145091b.getMessageIdentity();
        if (messageIdentity != null && messageIdentity.isHideSaveToDriver()) {
            z3 = true;
        }
        if (z && this.f145107r && !z3) {
            String string2 = UIUtils.getString(this.f145092c, R.string.Lark_Legacy_SaveFileToDrive);
            LKUIListItemData nVar = new LKUIListItemData(string2);
            if (!C58612c.m227290a().mo102855b(this.f145091b.getMediaExtra().getKey(), true)) {
                nVar.mo89289b(R.color.lkui_N400);
            }
            arrayList.add(nVar);
            linkedHashMap.put(string2, new AbstractC58729a() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass13 */

                @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AbstractC58729a
                /* renamed from: a */
                public void mo199101a() {
                    C58715e.this.mo199097h();
                }
            });
        }
        if (m227796j()) {
            String string3 = UIUtils.getString(this.f145092c, R.string.Lark_Legacy_JumpToChat);
            arrayList.add(new LKUIListItemData(string3));
            linkedHashMap.put(string3, new AbstractC58729a() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass14 */

                @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AbstractC58729a
                /* renamed from: a */
                public void mo199101a() {
                    C58715e.this.mo199098i();
                }
            });
        }
        if (arrayList.size() != 0 && (fragmentActivity = this.f145092c) != null) {
            ((UDActionPanelBuilder) ((UDActionPanelBuilder) ((UDActionPanelBuilder) new UDActionPanelBuilder(fragmentActivity).mo90870a(new ArrayList(linkedHashMap.keySet()))).mo90869a(new UDListDialogController.OnItemClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass16 */

                @Override // com.larksuite.component.universe_design.dialog.UDListDialogController.OnItemClickListener
                public void onItemClick(int i) {
                    if (i >= 0 && i < arrayList.size()) {
                        AbstractC58729a aVar = (AbstractC58729a) linkedHashMap.get(((LKUIListItemData) arrayList.get(i)).mo89285a().toString());
                        if (aVar != null) {
                            aVar.mo199101a();
                        }
                    }
                }
            })).addActionButton(R.id.ud_dialog_btn_cancel, UIUtils.getString(this.f145092c, R.string.Lark_Legacy_Cancel), new DialogInterface.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass15 */

                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            })).build().show();
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: c */
    public void mo199060c(boolean z) {
        boolean z2;
        if (!DesktopUtil.m144301a((Context) this.f145092c)) {
            m227794d(z);
            return;
        }
        View inflate = UIUtils.inflate(this.f145092c, R.layout.video_menu_layout, null);
        final AbstractC58730b a = m227789a(inflate);
        if (!C58612c.m227290a().mo102866i()) {
            inflate.findViewById(R.id.save).setVisibility(8);
        }
        inflate.findViewById(R.id.save_tv).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587225 */

            public void onClick(View view) {
                if (C58715e.this.f145093d != null) {
                    C58715e.this.f145093d.mo178603d();
                }
                a.mo199114a();
                C57805b.m224333d(C58715e.this.f145092c, new C57805b.AbstractC57809a() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587225.C587231 */

                    @Override // com.ss.android.lark.utils.C57805b.AbstractC57809a
                    public void permissionGranted(boolean z) {
                        if (z) {
                            C58715e.this.f145094e.mo199063a(C58715e.this.f145091b);
                        } else {
                            LKUIToast.show(C58715e.this.f145092c, UIHelper.mustacheFormat((int) R.string.Lark_Legacy_Writeexternalstorage));
                        }
                    }
                });
            }
        });
        View findViewById = inflate.findViewById(R.id.save_to_drive_divider);
        View findViewById2 = inflate.findViewById(R.id.save_to_drive_tv);
        MessageIdentity messageIdentity = this.f145091b.getMessageIdentity();
        if (messageIdentity == null || !messageIdentity.isHideSaveToDriver()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !this.f145107r || z2) {
            findViewById.setVisibility(8);
            findViewById2.setVisibility(8);
        } else {
            findViewById2.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587246 */

                public void onClick(View view) {
                    C58612c.m227290a().mo102843a(C58715e.this.f145091b.getMessageIdentity(), C58715e.this.f145091b.getMediaExtra().getKey(), new IGetDataCallback<String>() {
                        /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587246.C587251 */

                        /* renamed from: a */
                        public void onSuccess(String str) {
                            LKUIToast.show((Context) C58715e.this.f145092c, (int) R.drawable.saving_pictures, (int) R.string.Lark_Legacy_WillSaveToLarkDrive);
                            a.mo199114a();
                        }

                        @Override // com.larksuite.framework.callback.IGetDataCallback
                        public void onError(ErrorResult errorResult) {
                            LKUIToast.show(C58715e.this.f145092c, (int) R.string.Lark_Legacy_SaveFail);
                            a.mo199114a();
                        }
                    });
                }
            });
        }
        View findViewById3 = inflate.findViewById(R.id.jump_to_chat);
        View findViewById4 = inflate.findViewById(R.id.jump_to_chat_tv);
        if (m227796j()) {
            findViewById3.setVisibility(0);
            findViewById4.setOnClickListener(new View.OnClickListener() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587267 */

                public void onClick(View view) {
                    MessageIdentity messageIdentity = C58715e.this.f145091b.getMessageIdentity();
                    if (messageIdentity != null) {
                        C58715e.this.f145096g.onJumpToChatClicked(messageIdentity.getMessageId());
                    }
                    a.mo199114a();
                }
            });
        } else {
            findViewById3.setVisibility(8);
        }
        inflate.findViewById(R.id.cancel_tv).setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587278 */

            public void onClick(View view) {
                a.mo199114a();
            }
        });
    }

    @Override // com.ss.android.lark.player.p2513c.AbstractC52110k
    /* renamed from: a */
    public void mo140067a(int i, Bundle bundle) {
        PerfVideoViewMonitor.m228164a(i);
    }

    /* renamed from: a */
    public void mo199092a(VideoView videoView, final PhotoItem photoItem) {
        this.f145100k = new C58857b(this.f145092c, this.f145099j, photoItem, this.f145098i, this.f145109t);
        this.f145101l = new C58868c(this.f145092c);
        this.f145102m = new OnlineNetworkStatusCover(this.f145092c);
        this.f145103n = new C58872d(this.f145092c);
        C52093l lVar = new C52093l();
        lVar.mo178468a("controller", this.f145100k);
        lVar.mo178468a("error", this.f145101l);
        lVar.mo178468a(UpdateKey.STATUS, this.f145102m);
        lVar.mo178468a("loading", this.f145103n);
        this.f145102m.mo199449a(new OnlineNetworkStatusCover.AbstractC58852a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass19 */
        });
        this.f145102m.mo199450a(new OnlineNetworkStatusCover.AbstractC58853b() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass20 */

            @Override // com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover.AbstractC58853b
            /* renamed from: a */
            public void mo199107a() {
                C58715e.this.mo199094e();
            }

            @Override // com.ss.android.lark.widget.photo_picker.video.OnlineNetworkStatusCover.AbstractC58853b
            /* renamed from: b */
            public void mo199108b() {
                C58715e.this.f145094e.mo199064a(C58715e.this.f145091b, true, true);
            }
        });
        this.f145101l.mo199483a(new C58868c.AbstractC58871a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass21 */

            @Override // com.ss.android.lark.widget.photo_picker.video.C58868c.AbstractC58871a
            /* renamed from: a */
            public void mo199109a() {
                C57865c.m224576a(new Runnable() {
                    /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass21.RunnableC587181 */

                    public void run() {
                        if (!C58612c.m227290a().mo102869l().mo102873a()) {
                            final MediaExtra mediaExtra = C58715e.this.f145091b.getMediaExtra();
                            C58612c.m227290a().mo102844a(C58715e.this.f145091b.getMessageIdentity(), mediaExtra.getKey(), MediaExtraUtils.m227481b(mediaExtra, C58715e.this.f145092c), new IGetDataCallback<String>() {
                                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass21.RunnableC587181.C587191 */

                                @Override // com.larksuite.framework.callback.IGetDataCallback
                                public void onError(ErrorResult errorResult) {
                                }

                                /* renamed from: a */
                                public void onSuccess(String str) {
                                    MediaExtraUtils.m227480a(mediaExtra, C58715e.this.f145092c, str);
                                }
                            }, (AbstractC25974h) null);
                        }
                    }
                });
            }
        });
        this.f145101l.mo199482a(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass22 */

            public void onClick(View view) {
                C58715e.this.mo199094e();
            }
        });
        if (this.f145108s) {
            this.f145100k.mo199459a(new AbstractC52127b.AbstractC52128a() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass23 */

                @Override // com.ss.android.lark.player.p2515d.AbstractC52127b.AbstractC52128a
                /* renamed from: a */
                public void mo178549a() {
                    C58715e.this.f145093d.performHapticFeedback(0);
                    C58715e.this.f145094e.mo199062a();
                }
            });
        }
        this.f145100k.mo199458a(new View.OnClickListener() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.View$OnClickListenerC587172 */

            public void onClick(View view) {
                C58715e.this.mo199094e();
            }
        });
        this.f145100k.mo199460a(new C58857b.AbstractC58867a() {
            /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.C587203 */

            @Override // com.ss.android.lark.widget.photo_picker.video.C58857b.AbstractC58867a
            /* renamed from: a */
            public void mo199113a() {
                if (!C58715e.this.f145093d.mo178599a()) {
                    C58715e.this.f145094e.mo199064a(C58715e.this.f145091b, false, true);
                } else {
                    C58715e.this.f145093d.mo178604e();
                }
                C58715e.this.mo199095f();
            }
        });
        videoView.setReceiverGroup(lVar);
        if (!C58612c.m227290a().mo102866i() || !C58612c.m227290a().mo102867j()) {
            videoView.mo178598a(false);
        } else {
            videoView.mo178598a(true);
        }
    }

    @Override // com.ss.android.lark.widget.photo_picker.gallery.p2952a.AbstractC58689a.AbstractC58692b
    /* renamed from: a */
    public void mo199051a(final DataSource dataSource, final boolean z, final boolean z2) {
        if (this.f145093d == null) {
            m227792a(new Runnable() {
                /* class com.ss.android.lark.widget.photo_picker.gallery.p2952a.C58715e.AnonymousClass17 */

                public void run() {
                    C58715e.this.mo199051a(dataSource, z, z2);
                }
            });
            return;
        }
        C58857b bVar = this.f145100k;
        if (bVar != null) {
            bVar.mo199461a(true);
        }
        if (dataSource.isLocal()) {
            this.f145093d.setDataSource(dataSource);
            m227795e(z2);
        } else if (!C58612c.m227290a().mo102866i()) {
            LKUIToast.show(this.f145092c, (int) R.string.Lark_Chat_CantPlayVideosDueToAdminSecuritySettings);
        } else {
            OnlinePreloadingCover.m228385a(this.f145092c, dataSource);
            this.f145093d.setDataSource(dataSource);
            m227795e(z2);
        }
    }

    /* renamed from: a */
    private void m227790a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()) != null) {
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i3;
            marginLayoutParams.bottomMargin = i4;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public C58715e(C58694b bVar, AbstractC58731c cVar, PhotoItem photoItem, boolean z, boolean z2, boolean z3, boolean z4, OnDialogMenuClickListener onDialogMenuClickListener, boolean z5, OnChatAlbumClickListener onChatAlbumClickListener) {
        this.f145092c = bVar.getActivity();
        this.f145099j = ImageLoader.with(bVar);
        this.f145090a = cVar;
        this.f145091b = photoItem;
        this.f145097h = z;
        this.f145106q = z2;
        this.f145107r = z3;
        this.f145108s = z4;
        this.f145096g = onDialogMenuClickListener;
        this.f145098i = z5;
        this.f145109t = onChatAlbumClickListener;
    }
}
