package com.ss.android.vc.meeting.module.follow.p3122c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.component.universe_design.dialog.UDDialog;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.C57859q;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.vc.common.p3083e.C60733aa;
import com.ss.android.vc.common.p3083e.C60735ab;
import com.ss.android.vc.common.p3083e.C60738ac;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.common.utils.VCDialogUtils;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.entity.VideoChatCapabilities;
import com.ss.android.vc.entity.follow.FollowInfo;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.model.C61383d;
import com.ss.android.vc.meeting.module.VCBreakoutRoomInfo;
import com.ss.android.vc.meeting.module.follow.AbstractC61751a;
import com.ss.android.vc.meeting.module.follow.common.C61806b;
import com.ss.android.vc.meeting.module.follow.p3122c.C61792a;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.request.AbstractC63598b;
import com.ss.android.vc.net.request.C63602e;
import com.ss.android.vc.net.request.VcBizSender;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import com.ss.android.vc.statistics.event.C63742at;
import com.ss.android.vc.statistics.event.C63763l;
import com.ss.android.vc.statistics.event2.MeetingMagicShareEvent;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.follow.c.a */
public class C61792a extends RecyclerView.Adapter<C61796a> {

    /* renamed from: a */
    public AbstractC61751a f155086a;

    /* renamed from: b */
    public AbstractC61222a f155087b;

    /* renamed from: c */
    private Activity f155088c;

    /* renamed from: d */
    private C61383d f155089d;

    /* renamed from: e */
    private C61303k f155090e;

    /* renamed from: f */
    private List<Participant> f155091f;

    /* renamed from: g */
    private HashMap<String, Integer> f155092g = new HashMap<>();

    /* renamed from: h */
    private UDDialog f155093h;

    /* renamed from: a */
    public void mo214070a() {
        m241415c();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f155091f.size();
    }

    /* renamed from: b */
    public void mo214072b() {
        UDDialog uDDialog = this.f155093h;
        if (uDDialog != null) {
            uDDialog.dismiss();
            this.f155093h = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.follow.c.a$3 */
    public static /* synthetic */ class C617953 {

        /* renamed from: a */
        static final /* synthetic */ int[] f155097a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ss.android.vc.entity.Participant$DeviceType[] r0 = com.ss.android.vc.entity.Participant.DeviceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.vc.meeting.module.follow.p3122c.C61792a.C617953.f155097a = r0
                com.ss.android.vc.entity.Participant$DeviceType r1 = com.ss.android.vc.entity.Participant.DeviceType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.meeting.module.follow.p3122c.C61792a.C617953.f155097a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.Participant$DeviceType r1 = com.ss.android.vc.entity.Participant.DeviceType.WEB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.meeting.module.follow.p3122c.C61792a.C617953.<clinit>():void");
        }
    }

    /* renamed from: c */
    private void m241415c() {
        List<Participant> f = this.f155089d.mo212494b().mo212601f();
        if (!CollectionUtils.isEmpty(f)) {
            this.f155091f = ParticipantUtil.m248737e(f);
        }
        m241416d();
        m241417e();
    }

    /* renamed from: d */
    private void m241416d() {
        Participant c;
        if (!CollectionUtils.isEmpty(this.f155091f) && (c = ParticipantUtil.m248731c(this.f155091f)) != null) {
            this.f155091f.remove(c);
        }
    }

    /* renamed from: e */
    private void m241417e() {
        this.f155092g.clear();
        if (!CollectionUtils.isEmpty(this.f155091f)) {
            int size = this.f155091f.size();
            for (int i = 0; i < size; i++) {
                String id = this.f155091f.get(i).getId();
                if (this.f155092g.containsKey(id)) {
                    HashMap<String, Integer> hashMap = this.f155092g;
                    hashMap.put(id, Integer.valueOf(hashMap.get(id).intValue() + 1));
                } else {
                    this.f155092g.put(id, 1);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.meeting.module.follow.c.a$a */
    public static class C61796a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        LKUIRoundedImageView f155098a;

        /* renamed from: b */
        TextView f155099b;

        /* renamed from: c */
        ImageView f155100c;

        /* renamed from: d */
        ImageView f155101d;

        /* renamed from: e */
        View f155102e;

        /* renamed from: f */
        ViewGroup f155103f;

        C61796a(View view) {
            super(view);
            this.f155098a = (LKUIRoundedImageView) view.findViewById(R.id.user_image);
            this.f155099b = (TextView) view.findViewById(R.id.user_name);
            this.f155100c = (ImageView) view.findViewById(R.id.mobile_icon);
            this.f155102e = view.findViewById(R.id.externalTag);
            this.f155103f = (ViewGroup) view.findViewById(R.id.content_layout);
            this.f155101d = (ImageView) view.findViewById(R.id.parti_sharing);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241410a(DialogInterface dialogInterface, int i) {
        UDDialog uDDialog = this.f155093h;
        if (uDDialog != null) {
            uDDialog.dismiss();
            this.f155093h = null;
        }
    }

    /* renamed from: a */
    public C61796a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C61796a(LayoutInflater.from(ar.m236698c()).inflate(R.layout.follow_trans_presenter_list_item, viewGroup, false));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241414a(C61796a aVar, VideoChatUser videoChatUser) {
        String str;
        if (videoChatUser != null) {
            if (videoChatUser.isRoom()) {
                str = videoChatUser.getRoom().fullNameParticipant;
            } else if (videoChatUser.getType() == ParticipantType.LARK_USER) {
                str = videoChatUser.getName();
                if (MeetingUtil.m238371b(videoChatUser.getId(), this.f155090e.mo212055d())) {
                    str = str + UIHelper.getString(R.string.View_M_GuestParentheses);
                }
            } else if (videoChatUser.getType() != ParticipantType.NEO_USER && !videoChatUser.getType().isNewType() && !videoChatUser.getType().isUnknownType()) {
                str = "";
            } else if (TextUtils.isEmpty(videoChatUser.getNickname())) {
                str = videoChatUser.getName();
            } else {
                str = videoChatUser.getNickname();
            }
            C60733aa.m235985a(videoChatUser.getId(), str, aVar.f155099b);
            C60783v.m236230a(videoChatUser.getAvatarKey(), videoChatUser.getId(), videoChatUser.getType(), aVar.f155098a, 32, 32);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(final C61796a aVar, int i) {
        if (!CollectionUtils.isEmpty(this.f155091f)) {
            Participant participant = this.f155091f.get(i);
            String id = participant.getId();
            Participant.DeviceType deviceType = participant.getDeviceType();
            int i2 = 0;
            if (deviceType != null) {
                int i3 = C617953.f155097a[deviceType.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        aVar.f155100c.setVisibility(8);
                    } else if (this.f155092g.get(id) == null || this.f155092g.get(id).intValue() < 2) {
                        aVar.f155100c.setVisibility(8);
                    } else {
                        aVar.f155100c.setVisibility(0);
                        aVar.f155100c.setImageResource(R.drawable.ud_icon_mac_filled);
                    }
                } else if (this.f155092g.get(id) == null || this.f155092g.get(id).intValue() < 2) {
                    aVar.f155100c.setVisibility(8);
                } else {
                    aVar.f155100c.setVisibility(0);
                    aVar.f155100c.setImageResource(R.drawable.ud_icon_cellphone_outlined);
                }
            } else {
                aVar.f155100c.setVisibility(8);
            }
            if (ParticipantUtil.m248718a(this.f155086a.mo213882h(), participant)) {
                aVar.f155101d.setVisibility(0);
            } else {
                aVar.f155101d.setVisibility(8);
            }
            View view = aVar.f155102e;
            if (!ParticipantUtil.m248735d(participant)) {
                i2 = 8;
            }
            view.setVisibility(i2);
            $$Lambda$a$FmzzH45qVmYOS1rdRGkQ4Sgn2yM r4 = new DialogInterface.OnClickListener() {
                /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$a$FmzzH45qVmYOS1rdRGkQ4Sgn2yM */

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C61792a.lambda$FmzzH45qVmYOS1rdRGkQ4Sgn2yM(C61792a.this, dialogInterface, i);
                }
            };
            $$Lambda$a$Vg9A08oJXCFYot8Coo31_mHFypc r5 = new DialogInterface.OnClickListener(participant) {
                /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$a$Vg9A08oJXCFYot8Coo31_mHFypc */
                public final /* synthetic */ Participant f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    C61792a.lambda$Vg9A08oJXCFYot8Coo31_mHFypc(C61792a.this, this.f$1, dialogInterface, i);
                }
            };
            String id2 = participant.getId();
            if (!TextUtils.isEmpty(id2) && this.f155089d != null) {
                UserInfoService.getUserInfoById(this.f155090e.mo212055d(), id2, participant.getParticipantType(), new GetUserInfoListener(aVar) {
                    /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$a$I3w_nSp_aKIGMyrHhodQwEse9w */
                    public final /* synthetic */ C61792a.C61796a f$1;

                    {
                        this.f$1 = r2;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C61792a.m271257lambda$I3w_nSp_aKIGMyrHhodQwEse9w(C61792a.this, this.f$1, videoChatUser);
                    }
                });
            }
            aVar.itemView.setOnClickListener(new View.OnClickListener(participant, aVar, r4, r5) {
                /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$a$_Ieh5lIYK07QckYPSwpFjF436Ok */
                public final /* synthetic */ Participant f$1;
                public final /* synthetic */ C61792a.C61796a f$2;
                public final /* synthetic */ DialogInterface.OnClickListener f$3;
                public final /* synthetic */ DialogInterface.OnClickListener f$4;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                    this.f$4 = r5;
                }

                public final void onClick(View view) {
                    C61792a.lambda$_Ieh5lIYK07QckYPSwpFjF436Ok(C61792a.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
                }
            });
            aVar.f155099b.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                /* class com.ss.android.vc.meeting.module.follow.p3122c.C61792a.ViewTreeObserver$OnPreDrawListenerC617942 */

                public boolean onPreDraw() {
                    aVar.f155099b.getViewTreeObserver().removeOnPreDrawListener(this);
                    aVar.f155099b.setMaxWidth((((aVar.itemView.getMeasuredWidth() - aVar.f155098a.getMeasuredWidth()) - aVar.f155100c.getMeasuredWidth()) - aVar.f155102e.getMeasuredWidth()) - C60773o.m236115a(70.0d));
                    return true;
                }
            });
        }
    }

    public C61792a(Activity activity, AbstractC61222a aVar, C61303k kVar) {
        this.f155088c = activity;
        this.f155087b = aVar;
        if (kVar != null && kVar.mo212091I() != null) {
            this.f155090e = kVar;
            this.f155089d = kVar.mo212091I();
            this.f155086a = kVar.ab();
            m241415c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241413a(C61796a aVar, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        Activity activity = this.f155088c;
        if (activity != null) {
            if (this.f155093h == null) {
                this.f155093h = VCDialogUtils.m236205a((Context) activity, (View) null, UIHelper.mustacheFormat((int) R.string.View_VM_AssignToShareQuestionNameBraces, "name", aVar.f155099b.getText().toString()), 3, (Integer) null, (int) R.string.View_G_CancelButton, onClickListener, (int) R.string.View_G_ConfirmButton, onClickListener2, false);
            }
            this.f155093h.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241411a(Participant participant, DialogInterface dialogInterface, int i) {
        String str;
        VCBreakoutRoomInfo k;
        FollowInfo l = this.f155089d.mo212490a().mo212480l();
        if (!this.f155090e.al().mo213182i() || (k = this.f155090e.al().mo213184k()) == null) {
            str = null;
        } else {
            str = k.getBreakoutRoomId();
        }
        VcBizSender.m249186a(this.f155090e.mo212055d(), str, l.getUrl(), participant).mo219889a(new AbstractC63598b<com.ss.android.vc.entity.response.ar>() {
            /* class com.ss.android.vc.meeting.module.follow.p3122c.C61792a.C617931 */

            @Override // com.ss.android.vc.net.request.AbstractC63598b
            public void onError(C63602e eVar) {
            }

            /* renamed from: a */
            public void onSuccess(com.ss.android.vc.entity.response.ar arVar) {
                if (C61792a.this.f155087b != null && C61792a.this.f155086a != null) {
                    C61792a.this.f155087b.dismiss();
                }
            }
        });
        UDDialog uDDialog = this.f155093h;
        if (uDDialog != null) {
            uDDialog.dismiss();
            this.f155093h = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m241412a(Participant participant, C61796a aVar, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, View view) {
        C61303k kVar = this.f155090e;
        if (kVar != null) {
            if (kVar.mo212057f() == VideoChat.Type.MEET) {
                C63742at.m250067a(this.f155090e.ab().mo213882h(), participant, this.f155090e.mo212056e());
            } else if (this.f155090e.mo212057f() == VideoChat.Type.CALL) {
                C63763l.m250301a(this.f155090e.ab().mo213882h(), participant, this.f155090e.mo212056e());
            }
            VideoChatCapabilities capabilities = participant.getCapabilities();
            if (capabilities == null || !capabilities.isFollowPresenter() || !C61806b.m241472a(this.f155090e.ab().mo213882h(), participant)) {
                C60738ac.m236037c((int) R.string.View_VM_UserCannotShare);
            } else {
                C60735ab.m236001a(new Runnable(aVar, onClickListener, onClickListener2) {
                    /* class com.ss.android.vc.meeting.module.follow.p3122c.$$Lambda$a$sw6f1l8kc81SharQLZCXnk2fIIE */
                    public final /* synthetic */ C61792a.C61796a f$1;
                    public final /* synthetic */ DialogInterface.OnClickListener f$2;
                    public final /* synthetic */ DialogInterface.OnClickListener f$3;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                    }

                    public final void run() {
                        C61792a.lambda$sw6f1l8kc81SharQLZCXnk2fIIE(C61792a.this, this.f$1, this.f$2, this.f$3);
                    }
                });
            }
            MeetingMagicShareEvent.m249817a().mo220299b(C57859q.m224565a(participant.getId()), this.f155090e.ab().mo213889o(), this.f155090e.mo212056e());
        }
    }
}
