package com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db;

import androidx.p038g.p039a.AbstractC1082b;
import androidx.room.RoomDatabase;
import com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.p596a.C12466a;
import com.bytedance.ee.log.C13479a;
import com.bytedance.ee.util.db.DBController;
import com.bytedance.ee.util.p701d.C13615c;

public abstract class WikiDatabase extends RoomDatabase {
    /* renamed from: m */
    public abstract AbstractC12467b mo16369m();

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase$a */
    public static final class C12461a {

        /* access modifiers changed from: private */
        /* renamed from: com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase$a$a */
        public static final class C12463a {

            /* renamed from: a */
            public static final C12461a f33396a = new C12461a();
        }

        /* renamed from: b */
        public static C12461a m51823b() {
            return C12463a.f33396a;
        }

        /* renamed from: a */
        public WikiDatabase mo47443a() {
            return (WikiDatabase) DBController.m55314a().mo50590b("wiki.db");
        }

        private C12461a() {
            DBController.m55314a().mo50588a("wiki.db", new DBController.C13632a(C13615c.f35773a).mo50597a("wiki.db").mo50596a(WikiDatabase.class).mo50595a(new RoomDatabase.AbstractC1417b() {
                /* class com.bytedance.ee.bear.wikiv2.wikitreev2.widget.db.WikiDatabase.C12461a.C124621 */

                @Override // androidx.room.RoomDatabase.AbstractC1417b
                /* renamed from: a */
                public void mo7559a(AbstractC1082b bVar) {
                    super.mo7559a(bVar);
                    C13479a.m54764b("wiki.db", "onCreate");
                }

                @Override // androidx.room.RoomDatabase.AbstractC1417b
                /* renamed from: b */
                public void mo7560b(AbstractC1082b bVar) {
                    super.mo7560b(bVar);
                    C13479a.m54764b("wiki.db", "onOpen");
                }
            }).mo50598a(new C12466a()));
        }
    }

    /* renamed from: n */
    public static WikiDatabase m51821n() {
        return C12461a.m51823b().mo47443a();
    }
}
