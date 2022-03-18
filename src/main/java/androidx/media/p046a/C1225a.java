package androidx.media.p046a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC0740g;
import androidx.core.app.NotificationCompat;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.suite.R;

/* renamed from: androidx.media.a.a */
public class C1225a {

    /* renamed from: androidx.media.a.a$a */
    public static class C1226a extends NotificationCompat.Style {

        /* renamed from: a */
        int[] f4441a;

        /* renamed from: b */
        MediaSessionCompat.Token f4442b;

        /* renamed from: c */
        boolean f4443c;

        /* renamed from: d */
        PendingIntent f4444d;

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo6206a(int i) {
            return i <= 3 ? R.layout.notification_template_big_media_narrow : R.layout.notification_template_big_media;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo6211b() {
            return R.layout.notification_template_media;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public RemoteViews mo6212c() {
            int min = Math.min(this.mBuilder.mActions.size(), 5);
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, mo6206a(min), false);
            applyStandardTemplate.removeAllViews(R.id.media_actions);
            if (min > 0) {
                for (int i = 0; i < min; i++) {
                    applyStandardTemplate.addView(R.id.media_actions, m5588a(this.mBuilder.mActions.get(i)));
                }
            }
            if (this.f4443c) {
                applyStandardTemplate.setViewVisibility(R.id.cancel_action, 0);
                applyStandardTemplate.setInt(R.id.cancel_action, "setAlpha", m5587a(this.mBuilder.mContext.getResources(), R.integer.cancel_button_image_alpha));
                applyStandardTemplate.setOnClickPendingIntent(R.id.cancel_action, this.f4444d);
            } else {
                applyStandardTemplate.setViewVisibility(R.id.cancel_action, 8);
            }
            return applyStandardTemplate;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public RemoteViews mo6208a() {
            int i;
            RemoteViews applyStandardTemplate = applyStandardTemplate(false, mo6211b(), true);
            int size = this.mBuilder.mActions.size();
            int[] iArr = this.f4441a;
            if (iArr == null) {
                i = 0;
            } else {
                i = Math.min(iArr.length, 3);
            }
            applyStandardTemplate.removeAllViews(R.id.media_actions);
            if (i > 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 < size) {
                        applyStandardTemplate.addView(R.id.media_actions, m5588a(this.mBuilder.mActions.get(this.f4441a[i2])));
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", Integer.valueOf(i2), Integer.valueOf(size - 1)));
                    }
                }
            }
            if (this.f4443c) {
                applyStandardTemplate.setViewVisibility(R.id.end_padder, 8);
                applyStandardTemplate.setViewVisibility(R.id.cancel_action, 0);
                applyStandardTemplate.setOnClickPendingIntent(R.id.cancel_action, this.f4444d);
                applyStandardTemplate.setInt(R.id.cancel_action, "setAlpha", m5587a(this.mBuilder.mContext.getResources(), R.integer.cancel_button_image_alpha));
            } else {
                applyStandardTemplate.setViewVisibility(R.id.end_padder, 0);
                applyStandardTemplate.setViewVisibility(R.id.cancel_action, 8);
            }
            return applyStandardTemplate;
        }

        /* renamed from: a */
        public C1226a mo6209a(MediaSessionCompat.Token token) {
            this.f4442b = token;
            return this;
        }

        /* renamed from: a */
        public C1226a mo6210a(int... iArr) {
            this.f4441a = iArr;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeBigContentView(AbstractC0740g gVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo6212c();
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public RemoteViews makeContentView(AbstractC0740g gVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            return mo6208a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Notification.MediaStyle mo6207a(Notification.MediaStyle mediaStyle) {
            int[] iArr = this.f4441a;
            if (iArr != null) {
                mediaStyle.setShowActionsInCompactView(iArr);
            }
            MediaSessionCompat.Token token = this.f4442b;
            if (token != null) {
                mediaStyle.setMediaSession((MediaSession.Token) token.mo408a());
            }
            return mediaStyle;
        }

        /* renamed from: a */
        private RemoteViews m5588a(NotificationCompat.Action action) {
            boolean z;
            if (action.mo4113d() == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.mBuilder.mContext.getPackageName(), (int) R.layout.notification_media_action);
            remoteViews.setImageViewResource(R.id.action0, action.mo4110a());
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.action0, action.mo4113d());
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(R.id.action0, action.mo4112c());
            }
            return remoteViews;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(AbstractC0740g gVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                gVar.mo4247a().setStyle(mo6207a(new Notification.MediaStyle()));
            } else if (this.f4443c) {
                gVar.mo4247a().setOngoing(true);
            }
        }

        /* renamed from: a */
        public static int m5587a(Resources resources, int i) throws Resources.NotFoundException {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i);
            if (matchConfig == null) {
                return resources.getInteger(i);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(i);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i2 = 0; i2 < min; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (stackTraceElement != null) {
                        if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                            if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                                Log.d("ResProtector", "return admin result " + matchConfig.mReturnIdWhenException + ", level = " + i2);
                                return matchConfig.mReturnIdWhenException;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                return resources.getInteger(i);
            }
        }
    }
}
