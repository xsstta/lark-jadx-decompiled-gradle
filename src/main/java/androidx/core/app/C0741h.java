package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.ttm.player.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.core.app.h */
class C0741h implements AbstractC0740g {

    /* renamed from: a */
    private final Notification.Builder f3090a;

    /* renamed from: b */
    private final NotificationCompat.Builder f3091b;

    /* renamed from: c */
    private RemoteViews f3092c;

    /* renamed from: d */
    private RemoteViews f3093d;

    /* renamed from: e */
    private final List<Bundle> f3094e = new ArrayList();

    /* renamed from: f */
    private final Bundle f3095f = new Bundle();

    /* renamed from: g */
    private int f3096g;

    /* renamed from: h */
    private RemoteViews f3097h;

    @Override // androidx.core.app.AbstractC0740g
    /* renamed from: a */
    public Notification.Builder mo4247a() {
        return this.f3090a;
    }

    /* renamed from: b */
    public Notification mo4248b() {
        RemoteViews remoteViews;
        Bundle a;
        RemoteViews makeHeadsUpContentView;
        RemoteViews makeBigContentView;
        NotificationCompat.Style style = this.f3091b.mStyle;
        if (style != null) {
            style.apply(this);
        }
        if (style != null) {
            remoteViews = style.makeContentView(this);
        } else {
            remoteViews = null;
        }
        Notification c = mo4249c();
        if (remoteViews != null) {
            c.contentView = remoteViews;
        } else if (this.f3091b.mContentView != null) {
            c.contentView = this.f3091b.mContentView;
        }
        if (!(Build.VERSION.SDK_INT < 16 || style == null || (makeBigContentView = style.makeBigContentView(this)) == null)) {
            c.bigContentView = makeBigContentView;
        }
        if (!(Build.VERSION.SDK_INT < 21 || style == null || (makeHeadsUpContentView = this.f3091b.mStyle.makeHeadsUpContentView(this)) == null)) {
            c.headsUpContentView = makeHeadsUpContentView;
        }
        if (!(Build.VERSION.SDK_INT < 16 || style == null || (a = NotificationCompat.m3536a(c)) == null)) {
            style.addCompatExtras(a);
        }
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Notification mo4249c() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f3090a.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.f3090a.build();
            if (this.f3096g != 0) {
                if (!(build.getGroup() == null || (build.flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 || this.f3096g != 2)) {
                    m3605a(build);
                }
                if (build.getGroup() != null && (build.flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 && this.f3096g == 1) {
                    m3605a(build);
                }
            }
            return build;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.f3090a.setExtras(this.f3095f);
            Notification build2 = this.f3090a.build();
            RemoteViews remoteViews = this.f3092c;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f3093d;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f3097h;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f3096g != 0) {
                if (!(build2.getGroup() == null || (build2.flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 || this.f3096g != 2)) {
                    m3605a(build2);
                }
                if (build2.getGroup() != null && (build2.flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 && this.f3096g == 1) {
                    m3605a(build2);
                }
            }
            return build2;
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.f3090a.setExtras(this.f3095f);
            Notification build3 = this.f3090a.build();
            RemoteViews remoteViews4 = this.f3092c;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f3093d;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f3096g != 0) {
                if (!(build3.getGroup() == null || (build3.flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 || this.f3096g != 2)) {
                    m3605a(build3);
                }
                if (build3.getGroup() != null && (build3.flags & MediaPlayer.MEDIA_PLAYER_OPTION_APPID) == 0 && this.f3096g == 1) {
                    m3605a(build3);
                }
            }
            return build3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> a = C0742i.m3614a(this.f3094e);
            if (a != null) {
                this.f3095f.putSparseParcelableArray("android.support.actionExtras", a);
            }
            this.f3090a.setExtras(this.f3095f);
            Notification build4 = this.f3090a.build();
            RemoteViews remoteViews6 = this.f3092c;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f3093d;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (Build.VERSION.SDK_INT < 16) {
            return this.f3090a.getNotification();
        } else {
            Notification build5 = this.f3090a.build();
            Bundle a2 = NotificationCompat.m3536a(build5);
            Bundle bundle = new Bundle(this.f3095f);
            for (String str : this.f3095f.keySet()) {
                if (a2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a2.putAll(bundle);
            SparseArray<Bundle> a3 = C0742i.m3614a(this.f3094e);
            if (a3 != null) {
                NotificationCompat.m3536a(build5).putSparseParcelableArray("android.support.actionExtras", a3);
            }
            RemoteViews remoteViews8 = this.f3092c;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f3093d;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* renamed from: a */
    private void m3605a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    /* renamed from: a */
    private void m3606a(NotificationCompat.Action action) {
        Notification.Action.Builder builder;
        Bundle bundle;
        int i;
        Icon icon;
        if (Build.VERSION.SDK_INT >= 20) {
            IconCompat b = action.mo4111b();
            if (Build.VERSION.SDK_INT >= 23) {
                if (b != null) {
                    icon = b.mo4303e();
                } else {
                    icon = null;
                }
                builder = new Notification.Action.Builder(icon, action.mo4112c(), action.mo4113d());
            } else {
                if (b != null) {
                    i = b.mo4300c();
                } else {
                    i = 0;
                }
                builder = new Notification.Action.Builder(i, action.mo4112c(), action.mo4113d());
            }
            if (action.mo4116g() != null) {
                for (RemoteInput remoteInput : RemoteInput.m3564a(action.mo4116g())) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (action.mo4114e() != null) {
                bundle = new Bundle(action.mo4114e());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.mo4115f());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(action.mo4115f());
            }
            bundle.putInt("android.support.action.semanticAction", action.mo4117h());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(action.mo4117h());
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(action.mo4118i());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", action.mo4120k());
            builder.addExtras(bundle);
            this.f3090a.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.f3094e.add(C0742i.m3610a(this.f3090a, action));
        }
    }

    C0741h(NotificationCompat.Builder builder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f3091b = builder;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3090a = new Notification.Builder(builder.mContext, builder.mChannelId);
        } else {
            this.f3090a = new Notification.Builder(builder.mContext);
        }
        Notification notification = builder.mNotification;
        Notification.Builder lights = this.f3090a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = builder.mFullScreenIntent;
        if ((notification.flags & SmActions.ACTION_ONTHECALL_EXIT) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(builder.mLargeIcon).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (Build.VERSION.SDK_INT < 21) {
            this.f3090a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f3090a.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
            Iterator<NotificationCompat.Action> it = builder.mActions.iterator();
            while (it.hasNext()) {
                m3606a(it.next());
            }
            if (builder.mExtras != null) {
                this.f3095f.putAll(builder.mExtras);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (builder.mLocalOnly) {
                    this.f3095f.putBoolean("android.support.localOnly", true);
                }
                if (builder.mGroupKey != null) {
                    this.f3095f.putString("android.support.groupKey", builder.mGroupKey);
                    if (builder.mGroupSummary) {
                        this.f3095f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f3095f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (builder.mSortKey != null) {
                    this.f3095f.putString("android.support.sortKey", builder.mSortKey);
                }
            }
            this.f3092c = builder.mContentView;
            this.f3093d = builder.mBigContentView;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f3090a.setShowWhen(builder.mShowWhen);
            if (Build.VERSION.SDK_INT < 21 && builder.mPeople != null && !builder.mPeople.isEmpty()) {
                this.f3095f.putStringArray("android.people", (String[]) builder.mPeople.toArray(new String[builder.mPeople.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f3090a.setLocalOnly(builder.mLocalOnly).setGroup(builder.mGroupKey).setGroupSummary(builder.mGroupSummary).setSortKey(builder.mSortKey);
            this.f3096g = builder.mGroupAlertBehavior;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f3090a.setCategory(builder.mCategory).setColor(builder.mColor).setVisibility(builder.mVisibility).setPublicVersion(builder.mPublicVersion).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = builder.mPeople.iterator();
            while (it2.hasNext()) {
                this.f3090a.addPerson(it2.next());
            }
            this.f3097h = builder.mHeadsUpContentView;
            if (builder.mInvisibleActions.size() > 0) {
                Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new Bundle() : bundle;
                Bundle bundle2 = new Bundle();
                for (int i = 0; i < builder.mInvisibleActions.size(); i++) {
                    bundle2.putBundle(Integer.toString(i), C0742i.m3612a(builder.mInvisibleActions.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
                this.f3095f.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f3090a.setExtras(builder.mExtras).setRemoteInputHistory(builder.mRemoteInputHistory);
            if (builder.mContentView != null) {
                this.f3090a.setCustomContentView(builder.mContentView);
            }
            if (builder.mBigContentView != null) {
                this.f3090a.setCustomBigContentView(builder.mBigContentView);
            }
            if (builder.mHeadsUpContentView != null) {
                this.f3090a.setCustomHeadsUpContentView(builder.mHeadsUpContentView);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3090a.setBadgeIconType(builder.mBadgeIcon).setShortcutId(builder.mShortcutId).setTimeoutAfter(builder.mTimeout).setGroupAlertBehavior(builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                this.f3090a.setColorized(builder.mColorized);
            }
            if (!TextUtils.isEmpty(builder.mChannelId)) {
                this.f3090a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f3090a.setAllowSystemGeneratedContextualActions(builder.mAllowSystemGeneratedContextualActions);
            this.f3090a.setBubbleMetadata(NotificationCompat.C0725a.m3548a(builder.mBubbleMetadata));
        }
        if (builder.mSilent) {
            if (this.f3091b.mGroupSummary) {
                this.f3096g = 2;
            } else {
                this.f3096g = 1;
            }
            this.f3090a.setVibrate(null);
            this.f3090a.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.f3090a.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f3091b.mGroupKey)) {
                    this.f3090a.setGroup("silent");
                }
                this.f3090a.setGroupAlertBehavior(this.f3096g);
            }
        }
    }
}
