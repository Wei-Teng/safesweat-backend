package com.example.safesweatbackend.base;

import com.example.safesweatbackend.userbackup.UserBackupDataDto;

import java.util.UUID;

public interface UserBackupService {

    UserBackupDataDto create(UserBackupDataDto userBackupDataDto);

    UserBackupDataDto get(UUID userId);

    void delete(UUID userId);
}
