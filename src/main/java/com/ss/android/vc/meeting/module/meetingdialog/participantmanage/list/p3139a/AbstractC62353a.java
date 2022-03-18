package com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.p3139a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.ParticipantItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.a.a */
public abstract class AbstractC62353a extends RecyclerView.Adapter<AbstractC62355b> {

    /* renamed from: a */
    private List<ParticipantItem> f156766a = new ArrayList();

    /* renamed from: b */
    private AbstractC62354a f156767b = null;

    /* renamed from: com.ss.android.vc.meeting.module.meetingdialog.participantmanage.list.a.a$a */
    public interface AbstractC62354a {
        /* renamed from: a */
        void mo215651a(ParticipantItem participantItem);

        /* renamed from: b */
        void mo215652b(ParticipantItem participantItem);
    }

    /* renamed from: a */
    public abstract AbstractC62355b onCreateViewHolder(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public abstract void onBindViewHolder(AbstractC62355b bVar, int i);

    /* renamed from: c */
    public List<ParticipantItem> mo215648c() {
        return this.f156766a;
    }

    /* renamed from: d */
    public void mo215650d() {
        this.f156766a.clear();
    }

    /* renamed from: c */
    public void mo215649c(ParticipantItem participantItem) {
        this.f156766a.add(participantItem);
    }

    /* renamed from: b */
    public ParticipantItem mo215646b(int i) {
        return this.f156766a.get(i);
    }

    /* renamed from: b */
    public ParticipantItem mo215647b(ParticipantItem.ParticipantType participantType) {
        for (int i = 0; i < getItemCount(); i++) {
            ParticipantItem b = mo215646b(i);
            if (mo215646b(i).mo215631b() == participantType && mo215646b(i).mo215629a() == ParticipantItem.GroupType.TITLE) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo215601a(ParticipantItem participantItem) {
        int i = -1;
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            ParticipantItem b = mo215646b(i2);
            if (participantItem.mo215631b() == b.mo215631b() && participantItem.mo215629a() == b.mo215629a()) {
                i = i2;
            }
        }
        if (participantItem.mo215634e().size() > 0) {
            for (int size = participantItem.mo215634e().size(); size > 0; size--) {
                mo215648c().remove(i + size);
            }
        }
        participantItem.f156731c = false;
        AbstractC62354a aVar = this.f156767b;
        if (aVar != null) {
            aVar.mo215652b(participantItem);
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo215609b(ParticipantItem participantItem) {
        int i = -1;
        for (int i2 = 0; i2 < getItemCount(); i2++) {
            ParticipantItem b = mo215646b(i2);
            if (participantItem.mo215631b() == b.mo215631b() && participantItem.mo215629a() == b.mo215629a()) {
                i = i2;
            }
        }
        mo215648c().set(i, participantItem);
        if (participantItem.mo215634e().size() > 0) {
            mo215648c().addAll(i + 1, participantItem.mo215634e());
        }
        participantItem.f156731c = true;
        AbstractC62354a aVar = this.f156767b;
        if (aVar != null) {
            aVar.mo215651a(participantItem);
        }
        notifyDataSetChanged();
    }
}
