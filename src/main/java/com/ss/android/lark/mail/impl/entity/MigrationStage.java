package com.ss.android.lark.mail.impl.entity;

public enum MigrationStage {
    INVALID,
    INITIAL,
    IN_PROGRESS,
    DONE,
    DONE_WITH_ERROR,
    TERMINATED;

    public static MigrationStage convertToStage(int i) {
        MigrationStage migrationStage = INVALID;
        MigrationStage[] values = values();
        for (MigrationStage migrationStage2 : values) {
            if (migrationStage2.ordinal() == i) {
                return migrationStage2;
            }
        }
        return migrationStage;
    }
}
