package com.facebook.datasource;

import com.facebook.common.internal.Supplier;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class DataSources {

    /* renamed from: com.facebook.datasource.DataSources$a */
    private static class C21039a<T> {
        @Nullable

        /* renamed from: a */
        public T f51433a;

        private C21039a() {
        }
    }

    private DataSources() {
    }

    public static <T> Supplier<DataSource<T>> getFailedDataSourceSupplier(final Throwable th) {
        return new Supplier<DataSource<T>>() {
            /* class com.facebook.datasource.DataSources.C210361 */

            /* renamed from: a */
            public DataSource<T> get() {
                return DataSources.immediateFailedDataSource(th);
            }
        };
    }

    public static <T> DataSource<T> immediateDataSource(T t) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setResult(t);
        return create;
    }

    public static <T> DataSource<T> immediateFailedDataSource(Throwable th) {
        SimpleDataSource create = SimpleDataSource.create();
        create.setFailure(th);
        return create;
    }

    @Nullable
    public static <T> T waitForFinalResult(DataSource<T> dataSource) throws Throwable {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final C21039a aVar = new C21039a();
        final C21039a aVar2 = new C21039a();
        dataSource.subscribe(new DataSubscriber<T>() {
            /* class com.facebook.datasource.DataSources.C210372 */

            @Override // com.facebook.datasource.DataSubscriber
            public void onProgressUpdate(DataSource<T> dataSource) {
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onCancellation(DataSource<T> dataSource) {
                countDownLatch.countDown();
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onFailure(DataSource<T> dataSource) {
                try {
                    aVar2.f51433a = (T) dataSource.getFailureCause();
                } finally {
                    countDownLatch.countDown();
                }
            }

            @Override // com.facebook.datasource.DataSubscriber
            public void onNewResult(DataSource<T> dataSource) {
                if (dataSource.isFinished()) {
                    try {
                        aVar.f51433a = dataSource.getResult();
                    } finally {
                        countDownLatch.countDown();
                    }
                }
            }
        }, new Executor() {
            /* class com.facebook.datasource.DataSources.ExecutorC210383 */

            public void execute(Runnable runnable) {
                runnable.run();
            }
        });
        countDownLatch.await();
        if (aVar2.f51433a == null) {
            return aVar.f51433a;
        }
        throw aVar2.f51433a;
    }
}
