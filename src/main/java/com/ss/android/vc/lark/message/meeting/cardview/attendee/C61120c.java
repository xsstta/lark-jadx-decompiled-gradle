package com.ss.android.vc.lark.message.meeting.cardview.attendee;

import android.app.Activity;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.larksuite.component.ui.imageview.LKUILottieAnimationView;
import com.larksuite.component.ui.imageview.LKUIRoundedImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.utils.UIHelper;
import com.ss.android.lark.widget.listener.OnSingleClickListener;
import com.ss.android.vc.common.p3083e.C60742af;
import com.ss.android.vc.common.p3083e.C60773o;
import com.ss.android.vc.common.p3083e.C60783v;
import com.ss.android.vc.dto.VideoChatContent;
import com.ss.android.vc.entity.AttendeeFromSource;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import com.ss.android.vc.net.service.GetUserInfoListener;
import com.ss.android.vc.net.service.UserInfoService;
import com.ss.android.vc.net.service.VideoChatUser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.c */
public class C61120c extends RecyclerView.Adapter {

    /* renamed from: a */
    boolean f153090a;

    /* renamed from: b */
    public OnSingleClickListener f153091b;

    /* renamed from: c */
    public boolean f153092c;

    /* renamed from: d */
    private Activity f153093d;

    /* renamed from: e */
    private AbstractC61124b f153094e;

    /* renamed from: f */
    private String f153095f;

    /* renamed from: g */
    private List<String> f153096g;

    /* renamed from: h */
    private List<ParticipantType> f153097h;

    /* renamed from: i */
    private final List<Boolean> f153098i;

    /* renamed from: j */
    private List<Participant.DeviceType> f153099j;

    /* renamed from: k */
    private final List<Boolean> f153100k;

    /* renamed from: l */
    private String f153101l;

    /* renamed from: m */
    private AttendeeFromSource f153102m;

    /* renamed from: n */
    private int f153103n;

    /* renamed from: o */
    private HashMap<String, Integer> f153104o;

    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.c$b */
    public interface AbstractC61124b {
        /* renamed from: a */
        void mo211420a(String str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f153096g.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.c$2 */
    public static /* synthetic */ class C611222 {

        /* renamed from: a */
        static final /* synthetic */ int[] f153107a;

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
                com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c.C611222.f153107a = r0
                com.ss.android.vc.entity.Participant$DeviceType r1 = com.ss.android.vc.entity.Participant.DeviceType.MOBILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c.C611222.f153107a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ss.android.vc.entity.Participant$DeviceType r1 = com.ss.android.vc.entity.Participant.DeviceType.WEB     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c.C611222.<clinit>():void");
        }
    }

    /* renamed from: b */
    private void m237718b() {
        this.f153104o.clear();
        for (String str : this.f153096g) {
            if (this.f153104o.containsKey(str)) {
                HashMap<String, Integer> hashMap = this.f153104o;
                hashMap.put(str, Integer.valueOf(hashMap.get(str).intValue() + 1));
            } else {
                this.f153104o.put(str, 1);
            }
        }
    }

    /* renamed from: a */
    public void mo211415a() {
        this.f153096g.clear();
        this.f153097h.clear();
        this.f153099j.clear();
        this.f153100k.clear();
        this.f153098i.clear();
        this.f153104o.clear();
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void mo211416a(OnSingleClickListener onSingleClickListener) {
        this.f153091b = onSingleClickListener;
    }

    /* renamed from: a */
    public void mo211418a(AbstractC61124b bVar) {
        this.f153094e = bVar;
    }

    /* renamed from: a */
    private boolean m237717a(ParticipantType participantType) {
        if (participantType == ParticipantType.SIP_USER || participantType == ParticipantType.PSTN_USER || participantType == ParticipantType.RESERVED_USER_5) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (i != getItemCount() - 1 || !this.f153090a) {
            return 0;
        }
        return 1;
    }

    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.c$a */
    protected static class C61123a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f153108a;

        /* renamed from: b */
        public TextView f153109b;

        /* renamed from: c */
        public LKUILottieAnimationView f153110c;

        public C61123a(View view) {
            super(view);
            this.f153108a = view.findViewById(R.id.card_footer_layout);
            this.f153109b = (TextView) view.findViewById(R.id.card_footer_retry);
            this.f153110c = (LKUILottieAnimationView) view.findViewById(R.id.card_footer_loading);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.vc.lark.message.meeting.cardview.attendee.c$c */
    public static class C61125c extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public View f153111a;

        /* renamed from: b */
        public LKUIRoundedImageView f153112b;

        /* renamed from: c */
        public TextView f153113c;

        /* renamed from: d */
        public View f153114d;

        /* renamed from: e */
        public View f153115e;

        /* renamed from: f */
        public ImageView f153116f;

        public C61125c(View view) {
            super(view);
            this.f153111a = view.findViewById(R.id.item_card_attendee_layout);
            this.f153112b = (LKUIRoundedImageView) view.findViewById(R.id.card_attendee_avatar);
            this.f153113c = (TextView) view.findViewById(R.id.card_attendee_name);
            this.f153114d = view.findViewById(R.id.card_attendee_creator);
            this.f153115e = view.findViewById(R.id.externalTagView);
            this.f153116f = (ImageView) view.findViewById(R.id.card_attendee_mobile);
        }
    }

    /* renamed from: a */
    public void mo211417a(VideoChatContent videoChatContent) {
        if (!(videoChatContent == null || videoChatContent.meetingCard == null)) {
            for (Participant participant : videoChatContent.meetingCard.participants) {
                this.f153096g.add(participant.getId());
                this.f153097h.add(participant.getParticipantType());
                this.f153099j.add(participant.getDeviceType());
                this.f153100k.add(Boolean.valueOf(participant.isGuest()));
                this.f153098i.add(Boolean.valueOf(ParticipantUtil.m248735d(participant)));
            }
            m237718b();
            notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo211419a(boolean z) {
        int i;
        int i2;
        boolean z2 = this.f153090a;
        if (z2 && !z) {
            this.f153090a = false;
            if (C60742af.m236059a(this.f153096g)) {
                i2 = -1;
            } else {
                i2 = this.f153096g.size() - 1;
            }
            if (i2 != -1) {
                this.f153096g.remove(i2);
                this.f153097h.remove(i2);
                this.f153098i.remove(i2);
                this.f153099j.remove(i2);
                this.f153100k.remove(i2);
                notifyItemRemoved(i2);
            }
        } else if (!z2 && z) {
            this.f153090a = true;
            this.f153096g.add(null);
            this.f153097h.add(null);
            this.f153098i.add(null);
            this.f153099j.add(null);
            this.f153100k.add(null);
            notifyItemInserted(this.f153096g.size() - 1);
        } else if (this.f153092c) {
            this.f153092c = false;
            if (C60742af.m236059a(this.f153096g)) {
                i = -1;
            } else {
                i = this.f153096g.size() - 1;
            }
            if (i != -1) {
                notifyItemChanged(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new C61125c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_attendee, viewGroup, false));
        }
        return new C61123a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_card_attendee_footer, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (getItemViewType(i) == 0) {
            if (i < this.f153096g.size() && i < this.f153097h.size()) {
                String str = this.f153096g.get(i);
                ParticipantType participantType = this.f153097h.get(i);
                UserInfoService.getUserInfoById(this.f153095f, str, participantType, false, new GetUserInfoListener(viewHolder, i, this.f153099j.get(i), str, participantType) {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$c$_pxbQkKp_Wb2_5knYl_iFWQyznk */
                    public final /* synthetic */ RecyclerView.ViewHolder f$1;
                    public final /* synthetic */ int f$2;
                    public final /* synthetic */ Participant.DeviceType f$3;
                    public final /* synthetic */ String f$4;
                    public final /* synthetic */ ParticipantType f$5;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                        this.f$5 = r6;
                    }

                    @Override // com.ss.android.vc.net.service.GetUserInfoListener
                    public final void onGetUserInfo(VideoChatUser videoChatUser) {
                        C61120c.lambda$_pxbQkKp_Wb2_5knYl_iFWQyznk(C61120c.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, videoChatUser);
                    }
                });
            }
        } else if (getItemViewType(i) == 1 && (viewHolder instanceof C61123a)) {
            final C61123a aVar = (C61123a) viewHolder;
            aVar.f153108a.setVisibility(0);
            aVar.f153109b.setVisibility(0);
            if (aVar.f153110c.isAnimating()) {
                aVar.f153110c.pauseAnimation();
            }
            aVar.f153110c.setVisibility(8);
            aVar.f153109b.setOnClickListener(new OnSingleClickListener() {
                /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.C61120c.C611211 */

                @Override // com.ss.android.lark.widget.listener.OnSingleClickListener
                public void onSingleClick(View view) {
                    aVar.f153109b.setVisibility(8);
                    aVar.f153110c.setVisibility(0);
                    if (!aVar.f153110c.isAnimating()) {
                        aVar.f153110c.playAnimation();
                    }
                    C61120c.this.f153092c = true;
                    if (C61120c.this.f153091b != null) {
                        C61120c.this.f153091b.onSingleClick(view);
                    }
                }
            });
        }
    }

    C61120c(Activity activity, String str, String str2, AttendeeFromSource attendeeFromSource) {
        this.f153096g = new ArrayList();
        this.f153097h = new ArrayList();
        this.f153098i = new ArrayList();
        this.f153099j = new ArrayList();
        this.f153100k = new ArrayList();
        this.f153103n = -1;
        this.f153104o = new HashMap<>();
        this.f153090a = false;
        this.f153092c = false;
        this.f153093d = activity;
        this.f153095f = str;
        this.f153101l = str2;
        this.f153102m = attendeeFromSource;
        m237718b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237715a(int i, ParticipantType participantType, String str, RecyclerView.ViewHolder viewHolder, View view) {
        Activity activity;
        boolean booleanValue = this.f153100k.get(i).booleanValue();
        if ((participantType != ParticipantType.LARK_USER || booleanValue) && participantType != ParticipantType.NEO_USER) {
            TextView textView = ((C61125c) viewHolder).f153113c;
            if (textView != null) {
                int measuredWidth = textView.getMeasuredWidth();
                TextPaint paint = textView.getPaint();
                if (!TextUtils.isEmpty(textView.getText()) && paint.measureText(textView.getText().toString()) > ((float) measuredWidth) && (activity = this.f153093d) != null) {
                    ((C61115a) C61115a.m237693a(activity, textView.getText().toString()).mo219699g()).mo211397b();
                    return;
                }
                return;
            }
            return;
        }
        AbstractC61124b bVar = this.f153094e;
        if (bVar != null) {
            bVar.mo211420a(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m237716a(RecyclerView.ViewHolder viewHolder, int i, Participant.DeviceType deviceType, String str, ParticipantType participantType, VideoChatUser videoChatUser) {
        int i2;
        if (viewHolder instanceof C61125c) {
            C61125c cVar = (C61125c) viewHolder;
            String name = videoChatUser.getName();
            if (videoChatUser.isRoom()) {
                name = videoChatUser.getRoom().fullNameParticipant;
            }
            List<Boolean> list = this.f153100k;
            if (list != null && list.size() == getItemCount() && i < this.f153100k.size() && this.f153100k.get(i).booleanValue()) {
                name = name + UIHelper.getString(R.string.View_M_GuestParentheses);
            }
            cVar.f153113c.setText(name);
            int i3 = 0;
            if (deviceType != null) {
                int i4 = C611222.f153107a[deviceType.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        cVar.f153116f.setVisibility(8);
                    } else if (this.f153104o.get(str) == null || this.f153104o.get(str).intValue() < 2) {
                        cVar.f153116f.setVisibility(8);
                    } else {
                        cVar.f153116f.setVisibility(0);
                        cVar.f153116f.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_mac_filled));
                        cVar.f153116f.getDrawable().setTint(C60773o.m236126d(R.color.icon_n3));
                    }
                } else if (this.f153104o.get(str) == null || this.f153104o.get(str).intValue() < 2) {
                    cVar.f153116f.setVisibility(8);
                } else {
                    cVar.f153116f.setVisibility(0);
                    cVar.f153116f.setImageDrawable(C60773o.m236128f(R.drawable.ud_icon_cellphone_filled));
                    cVar.f153116f.getDrawable().setTint(C60773o.m236126d(R.color.icon_n3));
                }
            } else {
                cVar.f153116f.setVisibility(8);
            }
            C60783v.m236232b(videoChatUser.getAvatarKey(), videoChatUser.getId(), participantType, cVar.f153112b, 36, 36);
            if (!TextUtils.equals(str, this.f153101l) || !((i2 = this.f153103n) == -1 || i2 == i)) {
                cVar.f153114d.setVisibility(8);
            } else {
                this.f153103n = i;
                cVar.f153114d.setVisibility(0);
            }
            List<Boolean> list2 = this.f153098i;
            if (list2 != null && list2.size() == getItemCount() && i < this.f153098i.size() && m237717a(participantType)) {
                View view = cVar.f153115e;
                if (!this.f153098i.get(i).booleanValue()) {
                    i3 = 8;
                }
                view.setVisibility(i3);
            }
            List<Boolean> list3 = this.f153100k;
            if (list3 != null && list3.size() == getItemCount() && i < this.f153100k.size()) {
                cVar.f153111a.setOnClickListener(new View.OnClickListener(i, participantType, str, viewHolder) {
                    /* class com.ss.android.vc.lark.message.meeting.cardview.attendee.$$Lambda$c$Yy00uUGwAv_g17_prQQWI9UtXNA */
                    public final /* synthetic */ int f$1;
                    public final /* synthetic */ ParticipantType f$2;
                    public final /* synthetic */ String f$3;
                    public final /* synthetic */ RecyclerView.ViewHolder f$4;

                    {
                        this.f$1 = r2;
                        this.f$2 = r3;
                        this.f$3 = r4;
                        this.f$4 = r5;
                    }

                    public final void onClick(View view) {
                        C61120c.lambda$Yy00uUGwAv_g17_prQQWI9UtXNA(C61120c.this, this.f$1, this.f$2, this.f$3, this.f$4, view);
                    }
                });
            }
        }
    }

    C61120c(Activity activity, String str, List<String> list, List<ParticipantType> list2, List<Boolean> list3, List<Participant.DeviceType> list4, List<Boolean> list5, String str2, AttendeeFromSource attendeeFromSource) {
        this.f153096g = new ArrayList();
        this.f153097h = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.f153098i = arrayList;
        this.f153099j = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f153100k = arrayList2;
        this.f153103n = -1;
        this.f153104o = new HashMap<>();
        this.f153090a = false;
        this.f153092c = false;
        this.f153093d = activity;
        this.f153095f = str;
        this.f153096g.addAll(list);
        this.f153097h.addAll(list2);
        arrayList.addAll(list3);
        this.f153099j.addAll(list4);
        arrayList2.addAll(list5);
        this.f153101l = str2;
        this.f153102m = attendeeFromSource;
        m237718b();
    }
}
