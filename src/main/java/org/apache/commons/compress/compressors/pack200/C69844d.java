package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.OpenOption;

/* renamed from: org.apache.commons.compress.compressors.pack200.d */
class C69844d extends AbstractC69843c {

    /* renamed from: a */
    public final File f174579a;

    C69844d() throws IOException {
        File createTempFile = File.createTempFile("commons-compress", "packtemp");
        this.f174579a = createTempFile;
        createTempFile.deleteOnExit();
        this.out = Files.newOutputStream(createTempFile.toPath(), new OpenOption[0]);
    }

    /* access modifiers changed from: package-private */
    @Override // org.apache.commons.compress.compressors.pack200.AbstractC69843c
    /* renamed from: a */
    public InputStream mo244989a() throws IOException {
        this.out.close();
        return new FilterInputStream(Files.newInputStream(this.f174579a.toPath(), new OpenOption[0])) {
            /* class org.apache.commons.compress.compressors.pack200.C69844d.C698451 */

            @Override // java.io.FilterInputStream, java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
            public void close() throws IOException {
                try {
                    super.close();
                } finally {
                    C69844d.this.f174579a.delete();
                }
            }
        };
    }
}
