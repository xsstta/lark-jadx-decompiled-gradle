package net.sqlcipher.database;

import androidx.p038g.p039a.AbstractC1083c;

public class SupportFactory implements AbstractC1083c.AbstractC1087c {
    private final boolean clearPassphrase;
    private final SQLiteDatabaseHook hook;
    private final byte[] passphrase;

    public SupportFactory(byte[] bArr) {
        this(bArr, null);
    }

    @Override // androidx.p038g.p039a.AbstractC1083c.AbstractC1087c
    public AbstractC1083c create(AbstractC1083c.C1085b bVar) {
        return new SupportHelper(bVar, this.passphrase, this.hook, this.clearPassphrase);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(bArr, sQLiteDatabaseHook, true);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this.passphrase = bArr;
        this.hook = sQLiteDatabaseHook;
        this.clearPassphrase = z;
    }
}
