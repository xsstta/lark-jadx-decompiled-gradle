package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.engine.j */
public abstract class AbstractC2354j {

    /* renamed from: a */
    public static final AbstractC2354j f7811a = new AbstractC2354j() {
        /* class com.bumptech.glide.load.engine.AbstractC2354j.C23551 */

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10834a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: b */
        public boolean mo10837b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10835a(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10836a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: b */
    public static final AbstractC2354j f7812b = new AbstractC2354j() {
        /* class com.bumptech.glide.load.engine.AbstractC2354j.C23562 */

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10834a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10835a(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10836a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: b */
        public boolean mo10837b() {
            return false;
        }
    };

    /* renamed from: c */
    public static final AbstractC2354j f7813c = new AbstractC2354j() {
        /* class com.bumptech.glide.load.engine.AbstractC2354j.C23573 */

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10834a() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10836a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: b */
        public boolean mo10837b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10835a(DataSource dataSource) {
            if (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: d */
    public static final AbstractC2354j f7814d = new AbstractC2354j() {
        /* class com.bumptech.glide.load.engine.AbstractC2354j.C23584 */

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10834a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10835a(DataSource dataSource) {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: b */
        public boolean mo10837b() {
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10836a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: e */
    public static final AbstractC2354j f7815e = new AbstractC2354j() {
        /* class com.bumptech.glide.load.engine.AbstractC2354j.C23595 */

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10834a() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: b */
        public boolean mo10837b() {
            return true;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10835a(DataSource dataSource) {
            if (dataSource == DataSource.REMOTE) {
                return true;
            }
            return false;
        }

        @Override // com.bumptech.glide.load.engine.AbstractC2354j
        /* renamed from: a */
        public boolean mo10836a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            if (((!z || dataSource != DataSource.DATA_DISK_CACHE) && dataSource != DataSource.LOCAL) || encodeStrategy != EncodeStrategy.TRANSFORMED) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: a */
    public abstract boolean mo10834a();

    /* renamed from: a */
    public abstract boolean mo10835a(DataSource dataSource);

    /* renamed from: a */
    public abstract boolean mo10836a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);

    /* renamed from: b */
    public abstract boolean mo10837b();
}
