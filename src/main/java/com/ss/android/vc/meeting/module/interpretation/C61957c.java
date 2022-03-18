package com.ss.android.vc.meeting.module.interpretation;

import android.text.TextUtils;
import com.ss.android.vc.entity.ByteviewUser;
import com.ss.android.vc.entity.C60938g;
import com.ss.android.vc.entity.C60940j;
import com.ss.android.vc.entity.LanguageType;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.meeting.utils.ParticipantUtil;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.vc.meeting.module.interpretation.c */
public class C61957c {

    /* renamed from: a */
    public List<C60940j> f155607a = new ArrayList();

    /* renamed from: b */
    public C60940j f155608b;

    /* renamed from: c */
    private List<C61945b> f155609c = new ArrayList();

    /* renamed from: b */
    public boolean mo214503b(Participant participant) {
        C60940j jVar = this.f155608b;
        if (jVar == null || jVar.f152501a == null || participant == null || !TextUtils.equals(C60938g.m237060a(participant), ParticipantUtil.m248726b(this.f155608b.f152501a))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo214500a(ByteviewUser byteviewUser) {
        for (int i = 0; i < this.f155609c.size(); i++) {
            if (!(byteviewUser == null || this.f155609c.get(i) == null || !TextUtils.equals(ParticipantUtil.m248726b(byteviewUser), this.f155609c.get(i).f155578a))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo214504b(List<C60940j> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).f152501a == null || list.get(i).f152502b == null || list.get(i).f152502b.firstLanguage == null || list.get(i).f152502b.secondLanguage == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public void mo214505c(List<C60940j> list) {
        this.f155609c.clear();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                this.f155609c.add(new C61945b(ParticipantUtil.m248726b(list.get(i).f152501a), list.get(i).f152502b.firstLanguage, list.get(i).f152502b.secondLanguage));
            }
        }
    }

    /* renamed from: a */
    public boolean mo214501a(Participant participant) {
        if (!(this.f155607a == null || participant == null || C60938g.m237060a(participant) == null)) {
            for (int i = 0; i < this.f155607a.size(); i++) {
                if (this.f155607a.get(i).f152501a != null && TextUtils.equals(ParticipantUtil.m248726b(this.f155607a.get(i).f152501a), C60938g.m237060a(participant))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo214502a(List<C60940j> list) {
        boolean z;
        if (this.f155609c == null && list == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).f152503c) {
                arrayList.add(list.get(i));
            }
        }
        this.f155607a.clear();
        this.f155607a = new ArrayList(arrayList);
        if (this.f155609c == null) {
            return false;
        }
        if (arrayList.size() == 0) {
            return true;
        }
        if (arrayList.size() != this.f155609c.size()) {
            return false;
        }
        if (!mo214504b(arrayList)) {
            return true;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String b = ParticipantUtil.m248726b(arrayList.get(i2).f152501a);
            LanguageType languageType = arrayList.get(i2).f152502b.firstLanguage;
            LanguageType languageType2 = arrayList.get(i2).f152502b.secondLanguage;
            C61945b bVar = this.f155609c.get(i2);
            if (!TextUtils.equals(b, bVar.f155578a) || languageType == null || bVar.f155579b == null || !TextUtils.equals(languageType.despI18nKey, bVar.f155579b.despI18nKey) || languageType2 == null || bVar.f155580c == null || !TextUtils.equals(languageType2.despI18nKey, bVar.f155580c.despI18nKey)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
