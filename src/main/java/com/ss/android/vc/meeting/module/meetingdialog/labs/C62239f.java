package com.ss.android.vc.meeting.module.meetingdialog.labs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.p034e.p035a.C0978a;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.bumptech.glide.load.resource.bitmap.C2432i;
import com.bumptech.glide.load.resource.bitmap.C2452w;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3077b.C60700b;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60776r;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.background.FileStatus;
import com.ss.android.vc.entity.background.PushVirtualBackgroundType;
import com.ss.android.vc.entity.background.VirtualBackgroundInfo;
import com.ss.android.vc.entity.response.SetVcVirtualBackgroundEntity;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f */
public class C62239f extends RecyclerView.Adapter {

    /* renamed from: e */
    private static final int f156371e = UIHelper.dp2px(11.0f);

    /* renamed from: a */
    public boolean f156372a;

    /* renamed from: b */
    public List<VirtualBackgroundInfo> f156373b = new ArrayList(10);

    /* renamed from: c */
    public int f156374c = -1;

    /* renamed from: d */
    public Context f156375d;

    /* renamed from: f */
    private boolean f156376f;

    /* renamed from: g */
    private AbstractC62214a f156377g;

    /* renamed from: h */
    private BroadcastReceiver f156378h;

    /* renamed from: i */
    private LabsScene f156379i;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$d */
    public interface AbstractC62249d {
        /* renamed from: a */
        void mo215338a();

        /* renamed from: b */
        void mo215339b();

        /* renamed from: c */
        void mo215340c();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m243083b(DialogInterface dialogInterface, int i) {
    }

    /* renamed from: a */
    public void mo215331a(List<VirtualBackgroundInfo> list) {
        this.f156373b.clear();
        this.f156373b.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo215332a(List<VirtualBackgroundInfo> list, PushVirtualBackgroundType pushVirtualBackgroundType) {
        C60700b.m235851b("LabsBackgroundAdapter", "[onPushVirtualBackground]", "backgrounds : " + list.size());
        if (pushVirtualBackgroundType == PushVirtualBackgroundType.All) {
            m243085b(list);
            return;
        }
        for (VirtualBackgroundInfo virtualBackgroundInfo : list) {
            if (pushVirtualBackgroundType == PushVirtualBackgroundType.Add) {
                mo215328a(virtualBackgroundInfo);
            } else if (pushVirtualBackgroundType == PushVirtualBackgroundType.Update) {
                mo215328a(virtualBackgroundInfo);
            } else if (pushVirtualBackgroundType == PushVirtualBackgroundType.Delete) {
                m243084b(virtualBackgroundInfo);
            }
        }
    }

    /* renamed from: a */
    public void mo215328a(VirtualBackgroundInfo virtualBackgroundInfo) {
        int i;
        int i2;
        if (virtualBackgroundInfo == null) {
            C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground]", "background is null");
        } else if (virtualBackgroundInfo.fileStatus == null) {
            C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground2]", "fileStatus is null");
        } else if (virtualBackgroundInfo.isPreset()) {
            C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground3]", "bg is isPreset");
        } else {
            switch (C622444.f156387a[virtualBackgroundInfo.fileStatus.ordinal()]) {
                case 1:
                    C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground4]", "TimeOut");
                    int indexOf = this.f156373b.indexOf(virtualBackgroundInfo);
                    if (indexOf < 0 || this.f156373b.get(indexOf).fileStatus != FileStatus.OK) {
                        C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground6]", "TimeOut. show toast");
                        C60738ac.m236025a((int) R.string.View_G_ConnectionErrorTryAgain, 3000);
                        break;
                    } else {
                        C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground5]", "TimeOut. already ok, return.");
                        return;
                    }
                    break;
                case 2:
                    C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground7]", "ServerErr");
                    C60738ac.m236025a((int) R.string.View_G_ConnectionErrorTryAgain, 3000);
                    break;
                case 3:
                    C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground8]", "FileSizeLimit");
                    C60738ac.m236031a(UIHelper.mustacheFormat((int) R.string.View_VM_UnableToAddLargeFiles, "number", Integer.toString(15)), 3000L);
                    break;
                case 4:
                    C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground9]", "FileCountLimit");
                    C60738ac.m236025a((int) R.string.View_G_NumberOfBackgroundsReachedLimit, 3000);
                    break;
                case 5:
                    C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground10]", "Failed");
                    VCDialogUtils.m236184a(this.f156375d, UIHelper.getString(R.string.View_VM_FilesIncludeSensitiveContent), 2, (int) R.string.View_G_CancelButton, (DialogInterface.OnClickListener) $$Lambda$f$fmGpuXHgNLCdHSogNNuhSMZuCQ.INSTANCE, (int) R.string.View_G_ContinueOpen, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$JdRvhXF9suUrwi_Upr4KEcGw6oc */

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            C62239f.this.m243077a((C62239f) dialogInterface, (DialogInterface) i);
                        }
                    }, false);
                    break;
                case 6:
                    int indexOf2 = this.f156373b.indexOf(virtualBackgroundInfo);
                    if (indexOf2 < 0) {
                        if (LabsUtils.m242902a(this.f156379i)) {
                            i = this.f156373b.size() - 2;
                        } else if (LabsUtils.m242908b(this.f156379i)) {
                            i = this.f156373b.size() - 1;
                        } else {
                            i = this.f156373b.size();
                        }
                        C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground12]", "OK from other. insertIndex = " + i + ", mBackgroundItemsSize = " + this.f156373b.size() + ", scene = " + this.f156379i.name() + "key = " + virtualBackgroundInfo.key);
                        if (i >= 0) {
                            this.f156373b.add(i, virtualBackgroundInfo);
                            break;
                        }
                    } else {
                        C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground11]", "OK from myself. insertIndex = " + indexOf2 + ", mBackgroundItemsSize = " + this.f156373b.size() + "key = " + virtualBackgroundInfo.key);
                        this.f156373b.remove(indexOf2);
                        this.f156373b.add(indexOf2, virtualBackgroundInfo);
                        notifyDataSetChanged();
                        m243076a(indexOf2, false, true);
                        break;
                    }
                    break;
                case 7:
                    String str = virtualBackgroundInfo.key;
                    if (LabsUtils.m242902a(this.f156379i)) {
                        i2 = this.f156373b.size() - 2;
                    } else if (LabsUtils.m242908b(this.f156379i)) {
                        i2 = this.f156373b.size() - 1;
                    } else {
                        i2 = this.f156373b.size();
                    }
                    C60700b.m235851b("LabsBackgroundAdapter", "[updateBackground13]", "Reviewing. reviewKey = " + str + ", mLabsScene=  " + this.f156379i.name() + ", insertIndex = " + i2 + ", mBackgroundItemsSize = " + this.f156373b.size());
                    if (i2 >= 0) {
                        this.f156373b.add(i2, virtualBackgroundInfo);
                        C62261j.f156429a.f156427a.add(virtualBackgroundInfo);
                        break;
                    }
                    break;
            }
            if (!(virtualBackgroundInfo.fileStatus == FileStatus.OK || virtualBackgroundInfo.fileStatus == FileStatus.Reviewing)) {
                m243084b(virtualBackgroundInfo);
                this.f156377g.mo215237a(virtualBackgroundInfo.fileStatus);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo215333a(boolean z) {
        this.f156376f = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo215329a(com.ss.android.vc.meeting.module.meetingdialog.labs.VcVirtualBackgroundType r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.mo215329a(com.ss.android.vc.meeting.module.meetingdialog.labs.VcVirtualBackgroundType, java.lang.String):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f156373b.size();
    }

    /* renamed from: d */
    private void m243089d() {
        if (this.f156378h != null) {
            C60700b.m235851b("LabsBackgroundAdapter", "[unregisterReceiver]", "unregisterReceiver");
            C0978a.m4782a(ar.m236694a()).mo4990a(this.f156378h);
            this.f156378h = null;
        }
    }

    /* renamed from: e */
    private void m243091e() {
        if (!this.f156372a) {
            this.f156372a = true;
            notifyDataSetChanged();
            this.f156377g.mo215236a();
        }
    }

    /* renamed from: c */
    private void m243086c() {
        if (this.f156378h == null) {
            C60700b.m235851b("LabsBackgroundAdapter", "[registerReceiver]", "registerReceiver");
            this.f156378h = new BroadcastReceiver() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C622401 */

                public void onReceive(Context context, Intent intent) {
                    if ("upload_virtual_background".equals(intent.getAction())) {
                        C60700b.m235851b("LabsBackgroundAdapter", "[onReceive]", "ACTION_UPLOAD_BG");
                        LabsUtils.m242898a(intent, C62239f.this.f156375d, new AbstractC63598b<SetVcVirtualBackgroundEntity>() {
                            /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C622401.C622411 */

                            @Override // com.ss.android.vc.net.request.AbstractC63598b
                            public void onError(C63602e eVar) {
                                C60700b.m235864f("LabsBackgroundAdapter", "[addVcVirtualBackgrounds2]", "onError = " + eVar);
                            }

                            /* renamed from: a */
                            public void onSuccess(SetVcVirtualBackgroundEntity setVcVirtualBackgroundEntity) {
                                C60700b.m235851b("LabsBackgroundAdapter", "[addVcVirtualBackgrounds]", "onSuccess. entity = " + setVcVirtualBackgroundEntity);
                                if (setVcVirtualBackgroundEntity != null && !C60742af.m236059a(setVcVirtualBackgroundEntity.getInfoList())) {
                                    C62239f.this.mo215328a(setVcVirtualBackgroundEntity.getInfoList().get(0));
                                }
                            }
                        });
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("upload_virtual_background");
            C0978a.m4782a(ar.m236694a()).mo4991a(this.f156378h, intentFilter);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$4 */
    public static /* synthetic */ class C622444 {

        /* renamed from: a */
        static final /* synthetic */ int[] f156387a;

        /* renamed from: b */
        static final /* synthetic */ int[] f156388b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        static {
            /*
            // Method dump skipped, instructions count: 122
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C622444.<clinit>():void");
        }
    }

    /* renamed from: b */
    public void mo215334b() {
        if (this.f156372a) {
            this.f156372a = false;
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo215325a() {
        C60700b.m235851b("LabsBackgroundAdapter", "[onDetach]", "onDetach");
        this.f156375d = null;
        m243089d();
        mo215334b();
    }

    /* renamed from: a */
    public void mo215330a(AbstractC62214a aVar) {
        this.f156377g = aVar;
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$a */
    class C62245a extends C62247b {

        /* renamed from: a */
        public View f156389a;

        /* renamed from: d */
        private View f156391d;

        /* renamed from: e */
        private ImageView f156392e;

        /* renamed from: f */
        private LKUILottieAnimationView f156393f;

        /* renamed from: g */
        private FrameLayout f156394g;

        /* renamed from: a */
        private void m243108a(boolean z) {
            int i;
            View view = this.f156391d;
            if (z) {
                i = R.drawable.labs_background_item_selected_bg;
            } else {
                i = 0;
            }
            view.setBackgroundResource(i);
        }

        /* renamed from: a */
        public void mo215341a(FileStatus fileStatus) {
            boolean z;
            if (fileStatus == FileStatus.Reviewing) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f156393f.setVisibility(0);
                this.f156393f.playAnimation();
                this.f156394g.setVisibility(0);
                return;
            }
            if (this.f156393f.isAnimating()) {
                this.f156393f.cancelAnimation();
            }
            this.f156393f.setVisibility(8);
            this.f156394g.setVisibility(8);
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C62247b
        /* renamed from: a */
        public void mo215343a(VirtualBackgroundInfo virtualBackgroundInfo) {
            if (!C62239f.this.f156372a || virtualBackgroundInfo.fileStatus != FileStatus.OK) {
                this.f156389a.setVisibility(8);
            } else {
                this.f156389a.setVisibility(0);
            }
            if (getPosition() == C62239f.this.f156374c) {
                m243108a(true);
            } else {
                m243108a(false);
            }
            if (virtualBackgroundInfo.isDisabled || virtualBackgroundInfo.isBlur) {
                C60700b.m235864f("LabsBackgroundAdapter", "[bind2]", "bind preset data to BackgroundViewHolder instance!");
                return;
            }
            mo215342a(virtualBackgroundInfo.fileStatus, Uri.fromFile(new File(virtualBackgroundInfo.path)));
            mo215341a(virtualBackgroundInfo.fileStatus);
        }

        C62245a(View view) {
            super(view);
            this.f156391d = view.findViewById(R.id.border);
            this.f156392e = (ImageView) view.findViewById(R.id.background_img);
            this.f156393f = (LKUILottieAnimationView) view.findViewById(R.id.background_loading_lottie);
            this.f156394g = (FrameLayout) view.findViewById(R.id.background_loading_bg);
            this.f156389a = view.findViewById(R.id.icon_delete);
        }

        /* renamed from: a */
        public void mo215342a(FileStatus fileStatus, Uri uri) {
            if (fileStatus == FileStatus.Reviewing) {
                this.f156392e.setVisibility(8);
                return;
            }
            this.f156392e.setVisibility(0);
            ((C2124f) ((C2124f) ComponentCallbacks2C2115c.m9151c(this.itemView.getContext()).mo10410a(uri).mo11123a((int) R.drawable.vc_virtualbackground_placeholder)).mo11137a(new C2432i(), new C2452w(C60773o.m236115a(8.0d)))).mo10399a(this.f156392e);
            this.f156392e.setOutlineProvider(new ViewOutlineProvider() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C62245a.C622461 */

                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), (float) C60773o.m236115a(8.0d));
                }
            });
            this.f156392e.setClipToOutline(true);
        }
    }

    /* renamed from: b */
    private void m243084b(VirtualBackgroundInfo virtualBackgroundInfo) {
        if (!virtualBackgroundInfo.isPreset()) {
            int indexOf = this.f156373b.indexOf(virtualBackgroundInfo);
            if (indexOf >= 0) {
                this.f156373b.remove(indexOf);
            }
            if (indexOf == this.f156374c) {
                mo215335b(indexOf);
            }
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    private void m243087c(int i) {
        final VirtualBackgroundInfo virtualBackgroundInfo = this.f156373b.get(i);
        if (this.f156377g != null && virtualBackgroundInfo.fileStatus == FileStatus.OK) {
            this.f156377g.mo215238a(virtualBackgroundInfo, new AbstractC62249d() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C622433 */

                @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.AbstractC62249d
                /* renamed from: c */
                public void mo215340c() {
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.AbstractC62249d
                /* renamed from: b */
                public void mo215339b() {
                    C60700b.m235861e("LabsBackgroundAdapter", "[onImageDelete]", "onDeleteFail");
                }

                @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.AbstractC62249d
                /* renamed from: a */
                public void mo215338a() {
                    int indexOf = C62239f.this.f156373b.indexOf(virtualBackgroundInfo);
                    if (indexOf >= 2 && indexOf < C62239f.this.f156373b.size()) {
                        C62239f.this.f156373b.remove(indexOf);
                        if (!(C62261j.f156429a == null || C62261j.f156429a.f156427a == null)) {
                            C62261j.f156429a.f156427a.remove(indexOf);
                        }
                        if (indexOf == C62239f.this.f156374c) {
                            C62239f.this.mo215335b(indexOf);
                        } else if (indexOf < C62239f.this.f156374c) {
                            C62239f fVar = C62239f.this;
                            fVar.f156374c--;
                        }
                        C62239f.this.notifyDataSetChanged();
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(final RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.mo6501a(new GridLayoutManager.AbstractC1297b() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C622422 */

                @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1297b
                /* renamed from: a */
                public int mo6533a(int i) {
                    if (i == recyclerView.getAdapter().getItemCount() - 1 && recyclerView.getAdapter().getItemViewType(i) == VcVirtualBackgroundType.TYPE_CUSTOMIZE.getNumber()) {
                        return gridLayoutManager.mo6502b();
                    }
                    return 1;
                }
            });
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$e */
    class C62250e extends C62247b {

        /* renamed from: b */
        private ImageView f156401b;

        /* renamed from: d */
        private ImageView f156402d;

        /* renamed from: e */
        private View f156403e;

        /* renamed from: f */
        private View f156404f;

        /* renamed from: a */
        private void m243117a(boolean z) {
            int i;
            int i2;
            View view = this.f156403e;
            if (z) {
                i = R.drawable.labs_background_item_selected_bg;
            } else {
                i = 0;
            }
            view.setBackgroundResource(i);
            if (this.f156401b.getDrawable() != null) {
                Drawable drawable = this.f156401b.getDrawable();
                if (z) {
                    i2 = R.color.primary_pri_500;
                } else {
                    i2 = R.color.icon_n2;
                }
                drawable.setTint(C60773o.m236126d(i2));
            }
        }

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C62247b
        /* renamed from: a */
        public void mo215343a(VirtualBackgroundInfo virtualBackgroundInfo) {
            if (virtualBackgroundInfo.isDisabled) {
                this.f156402d.setVisibility(8);
                this.f156401b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_ban_outlined));
                this.f156401b.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
                this.f156404f.setBackgroundResource(R.drawable.labs_background_none_bg);
            } else if (virtualBackgroundInfo.isBlur) {
                this.f156402d.setVisibility(0);
                ((C2124f) ComponentCallbacks2C2115c.m9151c(this.itemView.getContext()).mo10413a(Integer.valueOf((int) R.drawable.labs_background_blur_bg)).mo11137a(new C2432i(), new C2452w(C60773o.m236115a(8.0d)))).mo10399a(this.f156402d);
                this.f156401b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_blur_outlined));
                this.f156401b.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
                this.f156404f.setBackgroundResource(0);
                this.f156402d.setOutlineProvider(new ViewOutlineProvider() {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C62250e.C622511 */

                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(new Rect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight()), (float) C60773o.m236115a(8.0d));
                    }
                });
                this.f156402d.setClipToOutline(true);
            } else {
                C60700b.m235864f("LabsBackgroundAdapter", "[bind]", "bind background data to PresetViewHolder instance!");
            }
            getPosition();
            if (getPosition() == C62239f.this.f156374c) {
                m243117a(true);
            } else {
                m243117a(false);
            }
        }

        C62250e(View view) {
            super(view);
            this.f156403e = view.findViewById(R.id.border);
            this.f156402d = (ImageView) view.findViewById(R.id.background_img);
            this.f156401b = (ImageView) view.findViewById(R.id.background_desc);
            this.f156404f = view.findViewById(R.id.back_desc);
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$f */
    class C62252f extends C62247b {

        /* renamed from: b */
        private ImageView f156407b;

        /* renamed from: d */
        private ImageView f156408d;

        /* renamed from: e */
        private View f156409e;

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C62247b
        /* renamed from: a */
        public void mo215343a(VirtualBackgroundInfo virtualBackgroundInfo) {
            this.f156408d.setVisibility(8);
            this.f156407b.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_more_add_outlined));
            this.f156407b.getDrawable().setTint(C60773o.m236126d(R.color.icon_n2));
            this.f156409e.setBackgroundResource(R.drawable.labs_background_none_bg);
        }

        C62252f(View view) {
            super(view);
            this.f156408d = (ImageView) view.findViewById(R.id.background_img);
            this.f156407b = (ImageView) view.findViewById(R.id.background_desc);
            this.f156409e = view.findViewById(R.id.back_desc);
        }
    }

    /* renamed from: b */
    private void m243085b(List<VirtualBackgroundInfo> list) {
        this.f156373b.clear();
        this.f156373b.addAll(list);
        if (LabsUtils.m242908b(this.f156379i)) {
            this.f156373b.add(VirtualBackgroundInfo.newUpload());
        }
        if (LabsUtils.m242902a(this.f156379i)) {
            this.f156373b.add(VirtualBackgroundInfo.newCustomized());
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        VirtualBackgroundInfo virtualBackgroundInfo = this.f156373b.get(i);
        if (virtualBackgroundInfo.isDisabled) {
            return VcVirtualBackgroundType.TYPE_DISABLE.getNumber();
        }
        if (virtualBackgroundInfo.isBlur) {
            return VcVirtualBackgroundType.TYPE_VIRTUAL.getNumber();
        }
        if (virtualBackgroundInfo.isUpload) {
            return VcVirtualBackgroundType.TYPE_UPLOAD.getNumber();
        }
        if (virtualBackgroundInfo.isCustomize) {
            return VcVirtualBackgroundType.TYPE_CUSTOMIZE.getNumber();
        }
        return VcVirtualBackgroundType.TYPE_BACKGROUND.getNumber();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        int adapterPosition;
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof C62245a) && (adapterPosition = viewHolder.getAdapterPosition()) >= 0 && adapterPosition < this.f156373b.size()) {
            ((C62245a) viewHolder).mo215341a(this.f156373b.get(adapterPosition).fileStatus);
        }
    }

    /* renamed from: b */
    public void mo215335b(int i) {
        this.f156374c = -1;
        if ((i < 0 || i > this.f156373b.size() - 1 || this.f156373b.get(i).isPreset() || this.f156373b.get(i).fileStatus != FileStatus.OK) && (i - 1 < 2 || i > this.f156373b.size() - 1 || this.f156373b.get(i).isPreset() || this.f156373b.get(i).fileStatus != FileStatus.OK)) {
            i = 1;
        }
        m243076a(i, false, true);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ boolean m243081a(View view) {
        if (!this.f156376f) {
            return true;
        }
        m243091e();
        return true;
    }

    /* renamed from: a */
    public void mo215326a(int i) {
        m243076a(i, false, false);
    }

    /* renamed from: a */
    public void mo215327a(Context context) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        sb.append("context is null:");
        if (context == null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        C60700b.m235851b("LabsBackgroundAdapter", "[onAttach]", sb.toString());
        if (context != null) {
            this.f156375d = context;
        }
        m243086c();
        if (this.f156372a) {
            m243091e();
        }
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$b */
    class C62247b extends RecyclerView.ViewHolder {
        /* renamed from: a */
        public void mo215343a(VirtualBackgroundInfo virtualBackgroundInfo) {
        }

        public C62247b(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243075a(int i, View view) {
        if (this.f156376f) {
            m243087c(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243077a(DialogInterface dialogInterface, int i) {
        AbstractC62214a aVar = this.f156377g;
        if (aVar != null) {
            aVar.mo215240b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private /* synthetic */ void m243082b(int i, View view) {
        if (this.f156376f) {
            m243076a(i, true, false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: c */
    private /* synthetic */ void m243088c(int i, View view) {
        if (this.f156376f) {
            m243076a(i, true, false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private /* synthetic */ void m243090d(int i, View view) {
        if (this.f156376f) {
            m243076a(i, true, false);
        }
    }

    public C62239f(Context context, LabsScene labsScene) {
        this.f156375d = context;
        this.f156379i = labsScene;
        m243086c();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243078a(VirtualBackgroundInfo virtualBackgroundInfo, int i) {
        C62269o.m243184c(virtualBackgroundInfo);
        this.f156373b.set(i, virtualBackgroundInfo);
    }

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.labs.f$c */
    class C62248c extends C62247b {

        /* renamed from: b */
        private View f156398b;

        /* renamed from: d */
        private TextView f156399d;

        @Override // com.ss.android.vc.meeting.module.meetingdialog.labs.C62239f.C62247b
        /* renamed from: a */
        public void mo215343a(VirtualBackgroundInfo virtualBackgroundInfo) {
        }

        C62248c(View view) {
            super(view);
            this.f156398b = view.findViewById(R.id.customize_background);
            this.f156399d = (TextView) view.findViewById(R.id.customize_text);
            View view2 = this.f156398b;
            if (view2 != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
                int a = (C60776r.m236139a() - C60773o.m236115a(240.0d)) / 12;
                layoutParams.leftMargin = a;
                layoutParams.rightMargin = a;
                this.f156398b.setLayoutParams(layoutParams);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        VirtualBackgroundInfo virtualBackgroundInfo = this.f156373b.get(i);
        if (viewHolder instanceof C62250e) {
            ((C62250e) viewHolder).mo215343a(virtualBackgroundInfo);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(i) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$LdrvaV7Ma4GOM3tHvv9rd0pVw */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C62239f.this.m243090d(this.f$1, view);
                }
            });
        } else if (viewHolder instanceof C62252f) {
            ((C62252f) viewHolder).mo215343a(virtualBackgroundInfo);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(i) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$GSGVxBbwUatiPD1t94TFAoqaic */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C62239f.this.m243088c(this.f$1, view);
                }
            });
        } else if (viewHolder instanceof C62248c) {
            ((C62248c) viewHolder).mo215343a(virtualBackgroundInfo);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(i) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$Z308MvHHoYQlDf2niMFFfNoLbas */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C62239f.this.m243082b((C62239f) this.f$1, (int) view);
                }
            });
        } else {
            C62245a aVar = (C62245a) viewHolder;
            aVar.mo215343a(virtualBackgroundInfo);
            viewHolder.itemView.setOnClickListener(new View.OnClickListener(virtualBackgroundInfo, i) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$ThkxupSEQu327r3QdUTZ31pgAp4 */
                public final /* synthetic */ VirtualBackgroundInfo f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    C62239f.this.m243079a((C62239f) this.f$1, (VirtualBackgroundInfo) this.f$2, (int) view);
                }
            });
            aVar.f156389a.setOnClickListener(new View.OnClickListener(i) {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$75NfqVe2vHuco6J2DwWKG7srV0 */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    C62239f.this.m243075a((C62239f) this.f$1, (int) view);
                }
            });
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
                /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$YufK7DQF1QbwXBbefSk2Dp0GzsY */

                public final boolean onLongClick(View view) {
                    return C62239f.this.m243081a(view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == VcVirtualBackgroundType.TYPE_DISABLE.getNumber() || i == VcVirtualBackgroundType.TYPE_VIRTUAL.getNumber()) {
            return new C62250e(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_background_preset_item_layout, viewGroup, false));
        }
        if (i == VcVirtualBackgroundType.TYPE_UPLOAD.getNumber()) {
            return new C62252f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_background_preset_item_layout, viewGroup, false));
        }
        if (i == VcVirtualBackgroundType.TYPE_CUSTOMIZE.getNumber()) {
            return new C62248c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_background_customize_item_layout, viewGroup, false));
        }
        return new C62245a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.labs_background_item_layout, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243079a(VirtualBackgroundInfo virtualBackgroundInfo, int i, View view) {
        if (this.f156376f && virtualBackgroundInfo.fileStatus == FileStatus.OK) {
            m243076a(i, true, false);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private /* synthetic */ void m243080a(VirtualBackgroundInfo virtualBackgroundInfo, boolean z, boolean z2) {
        this.f156377g.mo215239a(virtualBackgroundInfo, z, z2);
    }

    /* renamed from: a */
    private void m243076a(int i, boolean z, boolean z2) {
        VirtualBackgroundInfo virtualBackgroundInfo;
        if (i != this.f156374c) {
            if (C62261j.f156429a == null || C62261j.f156429a.f156427a == null) {
                C60700b.m235861e("LabsBackgroundAdapter", "LabsConfigData", "background data is null: onItemClicked error");
                return;
            }
            if (i >= 0 && i < C62261j.f156429a.f156427a.size()) {
                virtualBackgroundInfo = C62261j.f156429a.f156427a.get(i);
                if (virtualBackgroundInfo.path != null && (virtualBackgroundInfo.trimLandscapePath == null || virtualBackgroundInfo.trimPortraitPath == null)) {
                    C60735ab.m236013c(new Runnable(virtualBackgroundInfo, i) {
                        /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$HNunpPZ7kfFVSWWG_5KU5L9PEI */
                        public final /* synthetic */ VirtualBackgroundInfo f$1;
                        public final /* synthetic */ int f$2;

                        {
                            this.f$1 = r2;
                            this.f$2 = r3;
                        }

                        public final void run() {
                            C62239f.this.m243078a((C62239f) this.f$1, (VirtualBackgroundInfo) this.f$2);
                        }
                    });
                }
            } else if (i < this.f156373b.size()) {
                virtualBackgroundInfo = this.f156373b.get(i);
            } else {
                C60700b.m235861e("LabsBackgroundAdapter", "[onItemClicked]", "background changed IndexOutOfBounds: pos = " + i + ", listSize = " + this.f156373b.size());
                return;
            }
            if (this.f156377g != null) {
                C60735ab.m236013c(new Runnable(virtualBackgroundInfo, z, z2) {
                    /* class com.ss.android.vc.meeting.module.meetingdialog.labs.$$Lambda$f$CqIpoYB71yyCx5U9KQLMugygNHM */
                    public final /* synthetic */ VirtualBackgroundInfo f$1;
                    public final /* synthetic */ boolean f$2;
                    public final /* synthetic */ boolean f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C62239f.this.m243080a((C62239f) this.f$1, (VirtualBackgroundInfo) this.f$2, this.f$3);
                    }
                });
            }
            if (virtualBackgroundInfo.needSelectedBorder()) {
                notifyItemChanged(this.f156374c);
                this.f156374c = i;
                notifyItemChanged(i);
            }
        }
    }
}
