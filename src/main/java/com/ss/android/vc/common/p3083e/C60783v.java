package com.ss.android.vc.common.p3083e;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bumptech.glide.C2124f;
import com.bumptech.glide.ComponentCallbacks2C2115c;
import com.larksuite.framework.utils.CollectionUtils;
import com.larksuite.suite.R;
import com.ss.android.vc.dependency.VideoChatModuleDependency;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.entity.Participant;
import com.ss.android.vc.entity.ParticipantType;
import com.ss.android.vc.meeting.framework.manager.MeetingManager;
import com.ss.android.vc.meeting.framework.manager.MeetingUtil;
import com.ss.android.vc.meeting.framework.meeting.C61303k;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.vc.common.e.v */
public class C60783v {
    /* renamed from: a */
    public static void m236226a(int i, ImageView imageView) {
        ComponentCallbacks2C2115c.m9151c(ar.m236694a()).mo10413a(Integer.valueOf(i)).mo10399a(imageView);
    }

    /* renamed from: a */
    public static void m236228a(ImageView imageView, Bitmap bitmap) {
        if (imageView != null && bitmap != null) {
            if (imageView.getDrawable() != null && (imageView.getDrawable() instanceof BitmapDrawable)) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) imageView.getDrawable();
                if (bitmapDrawable.getBitmap() != null && bitmapDrawable.getBitmap() == bitmap) {
                    return;
                }
            }
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public static Bitmap m236224a(int i, int i2, int i3) {
        try {
            return (Bitmap) ((C2124f) ComponentCallbacks2C2115c.m9151c(ar.m236694a()).mo10430i().mo10394a(Integer.valueOf(i)).mo11150h()).mo10400a(i2, i3).get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public static void m236227a(ImageView imageView, int i, int i2) {
        if (imageView != null) {
            imageView.setImageResource(i);
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setTint(C60773o.m236126d(i2));
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m236225a(String str, String str2, ParticipantType participantType, int i, int i2) {
        Bitmap bitmap;
        int a = C60773o.m236115a((double) i);
        int a2 = C60773o.m236115a((double) i2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            bitmap = null;
        } else {
            bitmap = VideoChatModuleDependency.getImageDependency().mo196403a(ar.m236694a(), str, str2, a, a2);
        }
        if (bitmap != null) {
            return bitmap;
        }
        int i3 = R.drawable.vc_default_user_avatar;
        if (participantType == ParticipantType.PSTN_USER) {
            i3 = R.drawable.ic_avatar_pstn;
        } else if (participantType == ParticipantType.SIP_USER || participantType == ParticipantType.RESERVED_USER_5) {
            i3 = R.drawable.ic_avatar_sip;
        }
        return m236224a(i3, a, a2);
    }

    /* renamed from: b */
    public static void m236232b(String str, String str2, ParticipantType participantType, ImageView imageView, int i, int i2) {
        int a = C60773o.m236115a((double) i);
        int a2 = C60773o.m236115a((double) i2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            VideoChatModuleDependency.getImageDependency().mo196404a(ar.m236694a(), str, str2, imageView, a, a2);
        } else if (participantType == ParticipantType.PSTN_USER) {
            m236226a((int) R.drawable.ic_avatar_pstn, imageView);
        } else if (participantType == ParticipantType.SIP_USER || participantType == ParticipantType.RESERVED_USER_5) {
            m236226a((int) R.drawable.ic_avatar_sip, imageView);
        } else {
            m236226a((int) R.drawable.vc_default_user_avatar, imageView);
        }
    }

    /* renamed from: a */
    public static void m236230a(String str, String str2, ParticipantType participantType, ImageView imageView, int i, int i2) {
        C61303k kVar = (C61303k) MeetingManager.m238341a().mo211906j();
        if (kVar != null) {
            Participant participant = null;
            List<Participant> participants = kVar.mo212056e().getParticipants();
            if (!CollectionUtils.isEmpty(participants)) {
                int i3 = 0;
                while (true) {
                    if (i3 >= participants.size()) {
                        break;
                    } else if (TextUtils.equals(str2, participants.get(i3).getId())) {
                        participant = participants.get(i3);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (participant == null || !MeetingUtil.m238366a(kVar, participant)) {
                m236232b(str, str2, participantType, imageView, i, i2);
            } else {
                m236226a((int) R.drawable.icon_interviewer_avatar, imageView);
            }
        } else {
            m236232b(str, str2, participantType, imageView, i, i2);
        }
    }

    /* renamed from: a */
    public static void m236229a(String str, String str2, ImageView imageView, int i, int i2, int i3, int i4) {
        VideoChatModuleDependency.getImageDependency().mo196405a(ar.m236694a(), str, str2, imageView, i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m236231a(String str, String str2, ParticipantType participantType, ImageView imageView, int i, int i2, int i3, int i4) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m236229a(str, str2, imageView, i, i2, i3, i4);
        } else if (participantType == ParticipantType.PSTN_USER) {
            m236226a((int) R.drawable.ic_avatar_pstn, imageView);
        } else if (participantType == ParticipantType.SIP_USER || participantType == ParticipantType.RESERVED_USER_5) {
            m236226a((int) R.drawable.ic_avatar_sip, imageView);
        } else {
            m236226a((int) R.drawable.vc_default_user_avatar, imageView);
        }
    }
}
