package com.ss.android.lark.notification.export;

import com.ss.android.lark.notification.export.entity.C48499a;
import com.ss.android.lark.notification.export.entity.Notice;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class AbstractNotification<T extends Notice, R extends C48499a> {

    public static abstract class AbstractNotificationDisplayer<R extends C48499a> {

        @Retention(RetentionPolicy.SOURCE)
        public @interface ShowStrategy {
        }

        /* renamed from: com.ss.android.lark.notification.export.AbstractNotification$AbstractNotificationDisplayer$a */
        public interface AbstractC48493a<R extends C48499a> {
            /* renamed from: a */
            void mo31149a(R r);
        }

        /* renamed from: a */
        public int mo131697a(R r) {
            return 1;
        }

        /* renamed from: a */
        public abstract AbstractC48493a<R> mo31144a();

        /* renamed from: a */
        public abstract boolean mo31145a(Notice notice);

        /* renamed from: c */
        public abstract R mo31147c(Notice notice);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActionType {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CHANNEL_TYPE {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface NoticeType {
    }

    /* renamed from: com.ss.android.lark.notification.export.AbstractNotification$a */
    public interface AbstractC48494a {
        /* renamed from: a */
        void mo135461a(Notice notice);
    }

    /* renamed from: com.ss.android.lark.notification.export.AbstractNotification$b */
    public interface AbstractC48495b<T extends Notice> {
        /* renamed from: b */
        int mo31139b(Notice notice);

        /* renamed from: c */
        T mo31140c(Notice notice);
    }

    /* renamed from: com.ss.android.lark.notification.export.AbstractNotification$c */
    public interface AbstractC48496c<T extends Notice> {

        /* renamed from: com.ss.android.lark.notification.export.AbstractNotification$c$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            /* JADX WARN: Incorrect args count in method signature: (TT;)V */
            public static void $default$a(AbstractC48496c cVar, Notice notice) {
            }

            /* JADX WARN: Incorrect args count in method signature: (TT;)V */
            public static void $default$b(AbstractC48496c cVar, Notice notice) {
            }
        }

        /* renamed from: a */
        void mo31117a(T t);

        /* renamed from: b */
        void mo31118b(T t);
    }

    /* renamed from: a */
    public abstract int mo31112a();

    /* renamed from: b */
    public AbstractC48495b<T> mo31113b() {
        return null;
    }

    /* renamed from: c */
    public abstract AbstractNotificationDisplayer<R> mo31114c();

    /* renamed from: d */
    public AbstractC48496c<T> mo31115d() {
        return null;
    }

    /* renamed from: e */
    public AbstractC48494a mo135459e() {
        return null;
    }
}
