package com.ss.android.vc.meeting.module.meetingdialog.participantmanage;

import android.app.Activity;
import android.view.ViewGroup;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.VideoChat;
import com.ss.android.vc.meeting.basedialog.AbstractC61222a;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62356b;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62359c;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.C62373e;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62353a;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62355b;
import com.ss.android.vc.meeting.utils.C63496i;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.k */
public class C62347k extends AbstractC62353a {

    /* renamed from: a */
    public boolean f156717a = false;

    /* renamed from: b */
    public boolean f156718b = false;

    /* renamed from: c */
    private Map<ParticipantItem.ParticipantType, Boolean> f156719c = new HashMap();

    /* renamed from: d */
    private Activity f156720d;

    /* renamed from: e */
    private C61303k f156721e;

    /* renamed from: f */
    private HashMap<String, Integer> f156722f = new HashMap<>();

    /* renamed from: g */
    private boolean f156723g = true;

    /* renamed from: h */
    private AbstractC62329f f156724h;

    /* renamed from: i */
    private boolean f156725i = false;

    /* renamed from: j */
    private AbstractC61222a f156726j;

    /* renamed from: k */
    private boolean f156727k;

    /* renamed from: a */
    public boolean mo215606a() {
        return this.f156723g;
    }

    /* renamed from: b */
    public int mo215608b() {
        return this.f156721e.mo212091I().mo212494b().mo212610o();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return mo215648c().size();
    }

    /* renamed from: a */
    private boolean m243599a(Participant participant) {
        return C63496i.m248842a(participant);
    }

    /* renamed from: a */
    public void mo215600a(int i) {
        if (i == 0) {
            if (!this.f156723g) {
                this.f156723g = true;
                notifyDataSetChanged();
            }
        } else if (1 != i && 2 == i && getItemCount() > 200) {
            this.f156723g = false;
        }
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62353a
    /* renamed from: b */
    public void mo215609b(ParticipantItem participantItem) {
        super.mo215609b(participantItem);
        this.f156719c.put(participantItem.mo215631b(), true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        ParticipantItem b = mo215646b(i);
        if (b.mo215629a() != ParticipantItem.GroupType.USER) {
            return 0;
        }
        if (b.f156729a != null || b.f156730b == null) {
            return 1;
        }
        return 2;
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62353a
    /* renamed from: a */
    public void mo215601a(ParticipantItem participantItem) {
        super.mo215601a(participantItem);
        this.f156719c.put(participantItem.mo215631b(), false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        int hashCode;
        ParticipantItem b = mo215646b(i);
        if (b.mo215629a() == ParticipantItem.GroupType.USER) {
            if (b.f156730b != null && b.f156730b.getUser() != null && b.f156729a == null) {
                hashCode = Objects.hash(b.f156730b.getUser().getUserId(), b.f156730b.getUser().getDeviceId(), b.f156730b.getUser().getParticipantType());
                return (long) hashCode;
            } else if (b.f156729a != null) {
                hashCode = Objects.hash(b.f156729a.getId(), b.f156729a.getDeviceId(), b.f156729a.getParticipantType());
                return (long) hashCode;
            }
        }
        hashCode = b.hashCode();
        return (long) hashCode;
    }

    /* renamed from: a */
    public void onViewDetachedFromWindow(AbstractC62355b bVar) {
        if (bVar instanceof C62356b) {
            ((C62356b) bVar).mo215655b().cancelAnimation();
        } else if (bVar instanceof C62359c) {
            ((C62359c) bVar).mo215660b().cancelAnimation();
        }
    }

    /* renamed from: a */
    public void mo215605a(List<ParticipantItem> list) {
        mo215650d();
        this.f156717a = false;
        this.f156718b = false;
        this.f156722f.clear();
        ParticipantUtil.f160321a.clear();
        if (list != null) {
            for (ParticipantItem participantItem : list) {
                mo215649c(participantItem);
                if (participantItem.f156729a != null && participantItem.f156729a.is_host() && m243599a(participantItem.f156729a) && this.f156721e.mo212056e().getType() == VideoChat.Type.MEET) {
                    this.f156717a = true;
                }
                if (participantItem.f156729a != null) {
                    String id = participantItem.f156729a.getId();
                    if (this.f156722f.containsKey(id)) {
                        HashMap<String, Integer> hashMap = this.f156722f;
                        hashMap.put(id, Integer.valueOf(hashMap.get(id).intValue() + 1));
                        ParticipantUtil.f160321a.put(id, Integer.valueOf(this.f156722f.get(id).intValue() + 1));
                    } else {
                        this.f156722f.put(id, 1);
                        ParticipantUtil.f160321a.put(id, 1);
                    }
                }
                if (participantItem.f156729a != null && m243599a(participantItem.f156729a) && this.f156721e.mo212056e().getType() == VideoChat.Type.MEET) {
                    this.f156718b = participantItem.f156729a.isCoHost();
                }
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public boolean mo215607a(ParticipantItem.ParticipantType participantType) {
        if (this.f156719c.get(participantType) != null) {
            return this.f156719c.get(participantType).booleanValue();
        }
        return true;
    }

    public C62347k(Activity activity, C61303k kVar) {
        this.f156720d = activity;
        this.f156721e = kVar;
        this.f156724h = C62335h.m243526a(activity, kVar, new AbstractC62328e() {
            /* class com.ss.android.vc.meeting.module.meetingdialog.participantmanage.C62347k.C623481 */

            @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e
            /* renamed from: a */
            public boolean mo215561a() {
                return C62347k.this.f156717a;
            }

            @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.AbstractC62328e
            /* renamed from: b */
            public boolean mo215562b() {
                return C62347k.this.f156718b;
            }
        }).mo215587a(new C62349l());
        setHasStableIds(true);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62353a
    /* renamed from: a */
    public AbstractC62355b onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return C62373e.m243739a(viewGroup, this.f156721e, this.f156720d);
        }
        if (i == 1) {
            return C62359c.m243697a(viewGroup, this.f156721e, this.f156720d);
        }
        if (i != 2) {
            return C62373e.m243739a(viewGroup, this.f156721e, this.f156720d);
        }
        return C62356b.m243675a(viewGroup, this.f156721e, this.f156720d);
    }

    @Override // com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a.AbstractC62353a
    /* renamed from: a */
    public void onBindViewHolder(AbstractC62355b bVar, int i) {
        ParticipantItem b = mo215646b(i);
        int itemViewType = bVar.getItemViewType();
        if (itemViewType == 0) {
            ((C62373e) bVar).mo215667a(this, b, i);
        } else if (itemViewType != 1) {
            if (itemViewType == 2) {
                ((C62356b) bVar).mo215653a(this, b);
            }
        } else if (this.f156725i) {
            ((C62359c) bVar).mo215657a(this, b, this.f156722f, this.f156726j, this.f156727k);
        } else {
            ((C62359c) bVar).mo215658a(this, b, this.f156722f, this.f156724h);
        }
    }

    /* renamed from: a */
    public void onBindViewHolder(AbstractC62355b bVar, int i, List<Object> list) {
        onBindViewHolder(bVar, i);
    }

    public C62347k(Activity activity, C61303k kVar, AbstractC61222a aVar, boolean z, boolean z2) {
        this.f156720d = activity;
        this.f156721e = kVar;
        this.f156726j = aVar;
        this.f156725i = z;
        this.f156727k = z2;
    }
}
