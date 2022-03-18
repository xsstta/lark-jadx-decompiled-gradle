package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.larksuite.suite.R;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;

public class NotificationCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    /* renamed from: androidx.core.app.NotificationCompat$b */
    public interface AbstractC0726b {
        /* renamed from: a */
        Builder mo4215a(Builder builder);
    }

    public static class Action {

        /* renamed from: a */
        final Bundle f3034a;

        /* renamed from: b */
        boolean f3035b;

        /* renamed from: c */
        public int f3036c;

        /* renamed from: d */
        public CharSequence f3037d;

        /* renamed from: e */
        public PendingIntent f3038e;

        /* renamed from: f */
        private IconCompat f3039f;

        /* renamed from: g */
        private final RemoteInput[] f3040g;

        /* renamed from: h */
        private final RemoteInput[] f3041h;

        /* renamed from: i */
        private boolean f3042i;

        /* renamed from: j */
        private final int f3043j;

        /* renamed from: k */
        private final boolean f3044k;

        @Retention(RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        /* renamed from: a */
        public int mo4110a() {
            return this.f3036c;
        }

        /* renamed from: c */
        public CharSequence mo4112c() {
            return this.f3037d;
        }

        /* renamed from: d */
        public PendingIntent mo4113d() {
            return this.f3038e;
        }

        /* renamed from: e */
        public Bundle mo4114e() {
            return this.f3034a;
        }

        /* renamed from: f */
        public boolean mo4115f() {
            return this.f3042i;
        }

        /* renamed from: g */
        public RemoteInput[] mo4116g() {
            return this.f3040g;
        }

        /* renamed from: h */
        public int mo4117h() {
            return this.f3043j;
        }

        /* renamed from: i */
        public boolean mo4118i() {
            return this.f3044k;
        }

        /* renamed from: j */
        public RemoteInput[] mo4119j() {
            return this.f3041h;
        }

        /* renamed from: k */
        public boolean mo4120k() {
            return this.f3035b;
        }

        /* renamed from: b */
        public IconCompat mo4111b() {
            int i;
            if (this.f3039f == null && (i = this.f3036c) != 0) {
                this.f3039f = IconCompat.m3747a(null, "", i);
            }
            return this.f3039f;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.m3747a(null, "", i) : null, charSequence, pendingIntent);
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3) {
            this.f3035b = true;
            this.f3039f = iconCompat;
            if (iconCompat != null && iconCompat.mo4295a() == 2) {
                this.f3036c = iconCompat.mo4300c();
            }
            this.f3037d = Builder.limitCharSequenceLength(charSequence);
            this.f3038e = pendingIntent;
            this.f3034a = bundle == null ? new Bundle() : bundle;
            this.f3040g = remoteInputArr;
            this.f3041h = remoteInputArr2;
            this.f3042i = z;
            this.f3043j = i;
            this.f3035b = z2;
            this.f3044k = z3;
        }
    }

    public static class BigPictureStyle extends Style {
        private Bitmap mBigLargeIcon;
        private boolean mBigLargeIconSet;
        private Bitmap mPicture;

        public BigPictureStyle() {
        }

        public BigPictureStyle bigPicture(Bitmap bitmap) {
            this.mPicture = bitmap;
            return this;
        }

        public BigPictureStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigPictureStyle bigLargeIcon(Bitmap bitmap) {
            this.mBigLargeIcon = bitmap;
            this.mBigLargeIconSet = true;
            return this;
        }

        public BigPictureStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigPictureStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(AbstractC0740g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(gVar.mo4247a()).setBigContentTitle(this.mBigContentTitle).bigPicture(this.mPicture);
                if (this.mBigLargeIconSet) {
                    bigPicture.bigLargeIcon(this.mBigLargeIcon);
                }
                if (this.mSummaryTextSet) {
                    bigPicture.setSummaryText(this.mSummaryText);
                }
            }
        }
    }

    public static class BigTextStyle extends Style {
        private CharSequence mBigText;

        public BigTextStyle() {
        }

        public BigTextStyle(Builder builder) {
            setBuilder(builder);
        }

        public BigTextStyle bigText(CharSequence charSequence) {
            this.mBigText = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigTextStyle setBigContentTitle(CharSequence charSequence) {
            this.mBigContentTitle = Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public BigTextStyle setSummaryText(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(AbstractC0740g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(gVar.mo4247a()).setBigContentTitle(this.mBigContentTitle).bigText(this.mBigText);
                if (this.mSummaryTextSet) {
                    bigText.setSummaryText(this.mSummaryText);
                }
            }
        }
    }

    public static class Builder {
        public ArrayList<Action> mActions;
        boolean mAllowSystemGeneratedContextualActions;
        int mBadgeIcon;
        RemoteViews mBigContentView;
        C0725a mBubbleMetadata;
        String mCategory;
        String mChannelId;
        boolean mChronometerCountDown;
        int mColor;
        boolean mColorized;
        boolean mColorizedSet;
        CharSequence mContentInfo;
        PendingIntent mContentIntent;
        CharSequence mContentText;
        CharSequence mContentTitle;
        RemoteViews mContentView;
        public Context mContext;
        Bundle mExtras;
        PendingIntent mFullScreenIntent;
        int mGroupAlertBehavior;
        String mGroupKey;
        boolean mGroupSummary;
        RemoteViews mHeadsUpContentView;
        ArrayList<Action> mInvisibleActions;
        Bitmap mLargeIcon;
        boolean mLocalOnly;
        Notification mNotification;
        int mNumber;
        public ArrayList<String> mPeople;
        int mPriority;
        int mProgress;
        boolean mProgressIndeterminate;
        int mProgressMax;
        Notification mPublicVersion;
        CharSequence[] mRemoteInputHistory;
        String mShortcutId;
        boolean mShowWhen;
        boolean mSilent;
        String mSortKey;
        Style mStyle;
        CharSequence mSubText;
        RemoteViews mTickerView;
        long mTimeout;
        boolean mUseChronometer;
        int mVisibility;

        public Builder setNotificationSilent() {
            this.mSilent = true;
            return this;
        }

        public RemoteViews getBigContentView() {
            return this.mBigContentView;
        }

        public C0725a getBubbleMetadata() {
            return this.mBubbleMetadata;
        }

        public int getColor() {
            return this.mColor;
        }

        public RemoteViews getContentView() {
            return this.mContentView;
        }

        public RemoteViews getHeadsUpContentView() {
            return this.mHeadsUpContentView;
        }

        public int getPriority() {
            return this.mPriority;
        }

        public Notification getNotification() {
            return build();
        }

        public Notification build() {
            return new C0741h(this).mo4248b();
        }

        public Bundle getExtras() {
            if (this.mExtras == null) {
                this.mExtras = new Bundle();
            }
            return this.mExtras;
        }

        public long getWhenIfShowing() {
            if (this.mShowWhen) {
                return this.mNotification.when;
            }
            return 0;
        }

        public Builder extend(AbstractC0726b bVar) {
            bVar.mo4215a(this);
            return this;
        }

        public Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.mAllowSystemGeneratedContextualActions = z;
            return this;
        }

        public Builder setBadgeIconType(int i) {
            this.mBadgeIcon = i;
            return this;
        }

        public Builder setBubbleMetadata(C0725a aVar) {
            this.mBubbleMetadata = aVar;
            return this;
        }

        public Builder setCategory(String str) {
            this.mCategory = str;
            return this;
        }

        public Builder setChannelId(String str) {
            this.mChannelId = str;
            return this;
        }

        public Builder setColor(int i) {
            this.mColor = i;
            return this;
        }

        public Builder setContentIntent(PendingIntent pendingIntent) {
            this.mContentIntent = pendingIntent;
            return this;
        }

        public Builder setCustomBigContentView(RemoteViews remoteViews) {
            this.mBigContentView = remoteViews;
            return this;
        }

        public Builder setCustomContentView(RemoteViews remoteViews) {
            this.mContentView = remoteViews;
            return this;
        }

        public Builder setCustomHeadsUpContentView(RemoteViews remoteViews) {
            this.mHeadsUpContentView = remoteViews;
            return this;
        }

        public Builder setExtras(Bundle bundle) {
            this.mExtras = bundle;
            return this;
        }

        public Builder setGroup(String str) {
            this.mGroupKey = str;
            return this;
        }

        public Builder setGroupAlertBehavior(int i) {
            this.mGroupAlertBehavior = i;
            return this;
        }

        public Builder setGroupSummary(boolean z) {
            this.mGroupSummary = z;
            return this;
        }

        public Builder setLocalOnly(boolean z) {
            this.mLocalOnly = z;
            return this;
        }

        public Builder setNumber(int i) {
            this.mNumber = i;
            return this;
        }

        public Builder setPriority(int i) {
            this.mPriority = i;
            return this;
        }

        public Builder setPublicVersion(Notification notification) {
            this.mPublicVersion = notification;
            return this;
        }

        public Builder setRemoteInputHistory(CharSequence[] charSequenceArr) {
            this.mRemoteInputHistory = charSequenceArr;
            return this;
        }

        public Builder setShortcutId(String str) {
            this.mShortcutId = str;
            return this;
        }

        public Builder setShowWhen(boolean z) {
            this.mShowWhen = z;
            return this;
        }

        public Builder setSortKey(String str) {
            this.mSortKey = str;
            return this;
        }

        public Builder setTimeoutAfter(long j) {
            this.mTimeout = j;
            return this;
        }

        public Builder setUsesChronometer(boolean z) {
            this.mUseChronometer = z;
            return this;
        }

        public Builder setVisibility(int i) {
            this.mVisibility = i;
            return this;
        }

        public Builder(Context context) {
            this(context, null);
        }

        public Builder addAction(Action action) {
            this.mActions.add(action);
            return this;
        }

        public Builder addInvisibleAction(Action action) {
            this.mInvisibleActions.add(action);
            return this;
        }

        public Builder addPerson(String str) {
            this.mPeople.add(str);
            return this;
        }

        public Builder setAutoCancel(boolean z) {
            setFlag(16, z);
            return this;
        }

        public Builder setColorized(boolean z) {
            this.mColorized = z;
            this.mColorizedSet = true;
            return this;
        }

        public Builder setContent(RemoteViews remoteViews) {
            this.mNotification.contentView = remoteViews;
            return this;
        }

        public Builder setContentInfo(CharSequence charSequence) {
            this.mContentInfo = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentText(CharSequence charSequence) {
            this.mContentText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setContentTitle(CharSequence charSequence) {
            this.mContentTitle = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setDeleteIntent(PendingIntent pendingIntent) {
            this.mNotification.deleteIntent = pendingIntent;
            return this;
        }

        public Builder setLargeIcon(Bitmap bitmap) {
            this.mLargeIcon = reduceLargeIconSize(bitmap);
            return this;
        }

        public Builder setOngoing(boolean z) {
            setFlag(2, z);
            return this;
        }

        public Builder setOnlyAlertOnce(boolean z) {
            setFlag(8, z);
            return this;
        }

        public Builder setSmallIcon(int i) {
            this.mNotification.icon = i;
            return this;
        }

        public Builder setSubText(CharSequence charSequence) {
            this.mSubText = limitCharSequenceLength(charSequence);
            return this;
        }

        public Builder setVibrate(long[] jArr) {
            this.mNotification.vibrate = jArr;
            return this;
        }

        public Builder setWhen(long j) {
            this.mNotification.when = j;
            return this;
        }

        public Builder setChronometerCountDown(boolean z) {
            this.mChronometerCountDown = z;
            this.mExtras.putBoolean("android.chronometerCountDown", z);
            return this;
        }

        public Builder setStyle(Style style) {
            if (this.mStyle != style) {
                this.mStyle = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        public Builder setTicker(CharSequence charSequence) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        protected static CharSequence limitCharSequenceLength(CharSequence charSequence) {
            if (charSequence != null && charSequence.length() > 5120) {
                return charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        public Builder addExtras(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.mExtras;
                if (bundle2 == null) {
                    this.mExtras = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public Builder setDefaults(int i) {
            this.mNotification.defaults = i;
            if ((i & 4) != 0) {
                this.mNotification.flags |= 1;
            }
            return this;
        }

        public Builder setSound(Uri uri) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        private Bitmap reduceLargeIconSize(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        public Builder setFullScreenIntent(PendingIntent pendingIntent, boolean z) {
            this.mFullScreenIntent = pendingIntent;
            setFlag(SmActions.ACTION_ONTHECALL_EXIT, z);
            return this;
        }

        public Builder setSmallIcon(int i, int i2) {
            this.mNotification.icon = i;
            this.mNotification.iconLevel = i2;
            return this;
        }

        private void setFlag(int i, boolean z) {
            if (z) {
                Notification notification = this.mNotification;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.mNotification;
            notification2.flags = (~i) & notification2.flags;
        }

        public Builder setTicker(CharSequence charSequence, RemoteViews remoteViews) {
            this.mNotification.tickerText = limitCharSequenceLength(charSequence);
            this.mTickerView = remoteViews;
            return this;
        }

        public Builder(Context context, String str) {
            this.mActions = new ArrayList<>();
            this.mInvisibleActions = new ArrayList<>();
            this.mShowWhen = true;
            this.mLocalOnly = false;
            this.mColor = 0;
            this.mVisibility = 0;
            this.mBadgeIcon = 0;
            this.mGroupAlertBehavior = 0;
            Notification notification = new Notification();
            this.mNotification = notification;
            this.mContext = context;
            this.mChannelId = str;
            notification.when = System.currentTimeMillis();
            this.mNotification.audioStreamType = -1;
            this.mPriority = 0;
            this.mPeople = new ArrayList<>();
            this.mAllowSystemGeneratedContextualActions = true;
        }

        public Builder setSound(Uri uri, int i) {
            this.mNotification.sound = uri;
            this.mNotification.audioStreamType = i;
            if (Build.VERSION.SDK_INT >= 21) {
                this.mNotification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i).build();
            }
            return this;
        }

        public Builder setProgress(int i, int i2, boolean z) {
            this.mProgressMax = i;
            this.mProgress = i2;
            this.mProgressIndeterminate = z;
            return this;
        }

        public Builder addAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.mActions.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        public Builder addInvisibleAction(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            return addInvisibleAction(new Action(i, charSequence, pendingIntent));
        }

        public Builder setLights(int i, int i2, int i3) {
            int i4;
            this.mNotification.ledARGB = i;
            this.mNotification.ledOnMS = i2;
            this.mNotification.ledOffMS = i3;
            if (this.mNotification.ledOnMS == 0 || this.mNotification.ledOffMS == 0) {
                i4 = 0;
            } else {
                i4 = 1;
            }
            Notification notification = this.mNotification;
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$a */
    public static final class C0725a {

        /* renamed from: a */
        private PendingIntent f3045a;

        /* renamed from: b */
        private PendingIntent f3046b;

        /* renamed from: c */
        private IconCompat f3047c;

        /* renamed from: d */
        private int f3048d;

        /* renamed from: e */
        private int f3049e;

        /* renamed from: f */
        private int f3050f;

        /* renamed from: a */
        public PendingIntent mo4208a() {
            return this.f3045a;
        }

        /* renamed from: b */
        public PendingIntent mo4209b() {
            return this.f3046b;
        }

        /* renamed from: c */
        public IconCompat mo4210c() {
            return this.f3047c;
        }

        /* renamed from: d */
        public int mo4211d() {
            return this.f3048d;
        }

        /* renamed from: e */
        public int mo4212e() {
            return this.f3049e;
        }

        /* renamed from: f */
        public boolean mo4213f() {
            if ((this.f3050f & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean mo4214g() {
            if ((this.f3050f & 2) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static Notification.BubbleMetadata m3548a(C0725a aVar) {
            if (aVar == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setAutoExpandBubble(aVar.mo4213f()).setDeleteIntent(aVar.mo4209b()).setIcon(aVar.mo4210c().mo4303e()).setIntent(aVar.mo4208a()).setSuppressNotification(aVar.mo4214g());
            if (aVar.mo4211d() != 0) {
                suppressNotification.setDesiredHeight(aVar.mo4211d());
            }
            if (aVar.mo4212e() != 0) {
                suppressNotification.setDesiredHeightResId(aVar.mo4212e());
            }
            return suppressNotification.build();
        }
    }

    public static abstract class Style {
        CharSequence mBigContentTitle;
        protected Builder mBuilder;
        CharSequence mSummaryText;
        boolean mSummaryTextSet;

        private static float constrain(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        public void addCompatExtras(Bundle bundle) {
        }

        public void apply(AbstractC0740g gVar) {
        }

        public RemoteViews makeBigContentView(AbstractC0740g gVar) {
            return null;
        }

        public RemoteViews makeContentView(AbstractC0740g gVar) {
            return null;
        }

        public RemoteViews makeHeadsUpContentView(AbstractC0740g gVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        public void restoreFromCompatExtras(Bundle bundle) {
        }

        public Notification build() {
            Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        private int calculateTopPadding() {
            Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.notification_top_pad_large_text);
            float constrain = (constrain(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - constrain) * ((float) dimensionPixelSize)) + (constrain * ((float) dimensionPixelSize2)));
        }

        public void setBuilder(Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        private void hideNormalContent(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(R.id.title, 8);
            remoteViews.setViewVisibility(R.id.text2, 8);
            remoteViews.setViewVisibility(R.id.text, 8);
        }

        public Bitmap createColoredBitmap(int i, int i2) {
            return createColoredBitmap(i, i2, 0);
        }

        /* access modifiers changed from: package-private */
        public Bitmap createColoredBitmap(IconCompat iconCompat, int i) {
            return createColoredBitmap(iconCompat, i, 0);
        }

        public void buildIntoRemoteViews(RemoteViews remoteViews, RemoteViews remoteViews2) {
            hideNormalContent(remoteViews);
            remoteViews.removeAllViews(R.id.notification_main_column);
            remoteViews.addView(R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(R.id.notification_main_column, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(R.id.notification_main_column_container, 0, calculateTopPadding(), 0, 0);
            }
        }

        public static int INVOKEVIRTUAL_androidx_core_app_NotificationCompat$Style_com_bytedance_sysoptimizer_java_ResourcesProtector_getInteger(Resources resources, int i) throws Resources.NotFoundException {
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

        private Bitmap createColoredBitmap(int i, int i2, int i3) {
            return createColoredBitmap(IconCompat.m3746a(this.mBuilder.mContext, i), i2, i3);
        }

        private Bitmap createColoredBitmap(IconCompat iconCompat, int i, int i2) {
            int i3;
            Drawable c = iconCompat.mo4301c(this.mBuilder.mContext);
            if (i2 == 0) {
                i3 = c.getIntrinsicWidth();
            } else {
                i3 = i2;
            }
            if (i2 == 0) {
                i2 = c.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i2, Bitmap.Config.ARGB_8888);
            c.setBounds(0, 0, i3, i2);
            if (i != 0) {
                c.mutate().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            }
            c.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:64:0x0196  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01d0  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0220  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x0226  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0228  */
        /* JADX WARNING: Removed duplicated region for block: B:92:0x0233  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews applyStandardTemplate(boolean r16, int r17, boolean r18) {
            /*
            // Method dump skipped, instructions count: 569
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat.Style.applyStandardTemplate(boolean, int, boolean):android.widget.RemoteViews");
        }

        private Bitmap createIconWithBackground(int i, int i2, int i3, int i4) {
            if (i4 == 0) {
                i4 = 0;
            }
            Bitmap createColoredBitmap = createColoredBitmap(R.drawable.notification_icon_background, i4, i2);
            Canvas canvas = new Canvas(createColoredBitmap);
            Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i5 = (i2 - i3) / 2;
            int i6 = i3 + i5;
            mutate.setBounds(i5, i5, i6, i6);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return createColoredBitmap;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$c */
    public static class C0727c extends Style {

        /* renamed from: a */
        private ArrayList<CharSequence> f3051a = new ArrayList<>();

        /* renamed from: a */
        public C0727c mo4216a(CharSequence charSequence) {
            this.mSummaryText = Builder.limitCharSequenceLength(charSequence);
            this.mSummaryTextSet = true;
            return this;
        }

        /* renamed from: b */
        public C0727c mo4217b(CharSequence charSequence) {
            this.f3051a.add(Builder.limitCharSequenceLength(charSequence));
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(AbstractC0740g gVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(gVar.mo4247a()).setBigContentTitle(this.mBigContentTitle);
                if (this.mSummaryTextSet) {
                    bigContentTitle.setSummaryText(this.mSummaryText);
                }
                Iterator<CharSequence> it = this.f3051a.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }
    }

    /* renamed from: a */
    public static Bundle m3536a(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return C0742i.m3611a(notification);
        }
        return null;
    }
}
